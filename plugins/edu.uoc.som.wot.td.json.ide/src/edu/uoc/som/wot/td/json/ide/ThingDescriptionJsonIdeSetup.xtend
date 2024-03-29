/*
 * generated by Xtext 2.17.0
 */
package edu.uoc.som.wot.td.json.ide

import com.google.inject.Guice
import edu.uoc.som.wot.td.json.ThingDescriptionJsonRuntimeModule
import edu.uoc.som.wot.td.json.ThingDescriptionJsonStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class ThingDescriptionJsonIdeSetup extends ThingDescriptionJsonStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new ThingDescriptionJsonRuntimeModule, new ThingDescriptionJsonIdeModule))
	}
	
}
