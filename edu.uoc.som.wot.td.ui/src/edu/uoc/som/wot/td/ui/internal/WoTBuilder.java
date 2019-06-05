package edu.uoc.som.wot.td.ui.internal;

import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.IGenerator2;
import org.eclipse.xtext.ui.shared.SharedStateModule;

import com.google.inject.Guice;

import edu.uoc.som.wot.td.ui.generator.WoTGenerator;

public class WoTBuilder extends IncrementalProjectBuilder {

	public static final String BUILDER_ID = "edu.uoc.som.wot.td.ui.wotBuilder";

	private static final String MARKER_TYPE = "edu.uoc.som.wot.td.ui.wotProblem";

	private ResourceSet resourceSet = new ResourceSetImpl();

	private IGenerator2 generator = new WoTGenerator();

	private EclipseResourceFileSystemAccess2 fsa = new EclipseResourceFileSystemAccess2();
	
	public WoTBuilder() {
		Guice.createInjector(new SharedStateModule()).injectMembers(fsa);
		fsa.setMonitor(new NullProgressMonitor());
	}
	
	@Override
	protected IProject[] build(int kind, Map<String, String> args, IProgressMonitor monitor) throws CoreException {
		if (kind == FULL_BUILD) {
			fullBuild(monitor);
		} else {
			IResourceDelta delta = getDelta(getProject());
			if (delta == null) {
				fullBuild(monitor);
			} else {
				incrementalBuild(delta, monitor);
			}
		}
		return null;
	}

	protected void fullBuild(final IProgressMonitor monitor) throws CoreException {
		getProject().accept(new WoTResourceVisitor());
	}

	protected void incrementalBuild(IResourceDelta delta, IProgressMonitor monitor) throws CoreException {
		delta.accept(new WoTDeltaVisitor());
	}

	private void addMarker(IFile file, String message, int severity) throws CoreException {
		IMarker marker = file.createMarker(MARKER_TYPE);
		marker.setAttribute(IMarker.MESSAGE, message);
		marker.setAttribute(IMarker.SEVERITY, severity);
	}

	private void deleteMarkers(IFile file) throws CoreException {
		file.deleteMarkers(MARKER_TYPE, false, IResource.DEPTH_ZERO);
	}

	protected void clean(IProgressMonitor monitor) throws CoreException {
		getProject().deleteMarkers(MARKER_TYPE, true, IResource.DEPTH_INFINITE);
	}
	
	private boolean isWoTModel(IResource resource) {
		return resource instanceof IFile && "wot".equals(resource.getFullPath().getFileExtension());
	}

	private void generate(IFile file) throws CoreException {
		IFolder srcGenFolder = getProject().getFolder("src-gen");

		if (!srcGenFolder.exists()) {
			srcGenFolder.create(true, true, new NullProgressMonitor());
		}
		
		fsa.setProject(getProject());
		fsa.setOutputPath("src-gen");

		URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
		Resource resource = resourceSet.getResource(uri, true);

		generator.doGenerate(resource, fsa, new GeneratorContext());
	}
	
	class WoTDeltaVisitor implements IResourceDeltaVisitor {
		
		@Override
		public boolean visit(IResourceDelta delta) throws CoreException {
			IResource resource = delta.getResource();
			if (isWoTModel(resource)) {
				IFile file = (IFile) resource;
				try {
					deleteMarkers(file);
					switch (delta.getKind()) {
					case IResourceDelta.ADDED:
						generate(file);
						break;
					case IResourceDelta.CHANGED:
						generate(file);
						break;
					}
				} catch (CoreException e) {
					addMarker(file, "An error occurred while generating Java sources from WoT specification", IMarker.SEVERITY_ERROR);
				}
			}
			return true;
		}


	}

	class WoTResourceVisitor implements IResourceVisitor {
		public boolean visit(IResource resource) throws CoreException {
			if (isWoTModel(resource)) {
				IFile file = (IFile) resource;
				try {
					generate(file);
				} catch (CoreException e) {
					addMarker(file, "An error occurred while generating Java sources from WoT specification", IMarker.SEVERITY_ERROR);
				}
			}
			return true;
		}
	}

}
