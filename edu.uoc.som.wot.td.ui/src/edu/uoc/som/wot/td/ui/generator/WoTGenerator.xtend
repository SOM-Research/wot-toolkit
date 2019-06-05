package edu.uoc.som.wot.td.ui.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

class WoTGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile("subdir/example.txt", dummy)
		fsa.generateFile("example.txt", dummy)
	}
	
	def dummy() '''
		# Dummy contents
		Contents
	'''
}
