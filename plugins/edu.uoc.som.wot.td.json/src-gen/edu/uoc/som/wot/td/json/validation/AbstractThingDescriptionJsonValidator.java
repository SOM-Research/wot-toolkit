/*
 * generated by Xtext 2.17.0
 */
package edu.uoc.som.wot.td.json.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractThingDescriptionJsonValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(edu.uoc.som.wot.td.json.thingDescriptionJson.ThingDescriptionJsonPackage.eINSTANCE);
		return result;
	}
}
