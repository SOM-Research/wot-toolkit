package edu.uoc.som.wot.td.ui;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class WoTBuilderPlugin implements BundleActivator {
	
	public static final String PLUGIN_ID = "edu.uoc.som.wot.td.ui";

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		WoTBuilderPlugin.context = bundleContext;
	}

	public void stop(BundleContext bundleContext) throws Exception {
		WoTBuilderPlugin.context = null;
	}

}
