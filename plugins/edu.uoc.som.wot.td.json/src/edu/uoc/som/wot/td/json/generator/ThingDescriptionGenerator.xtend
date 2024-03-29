/*
 * generated by Xtext 2.17.0
 */
package edu.uoc.som.wot.td.json.generator

import edu.uoc.som.wot.td.ActionAffordance
import edu.uoc.som.wot.td.DataSchema
import edu.uoc.som.wot.td.EventAffordance
import edu.uoc.som.wot.td.Form
import edu.uoc.som.wot.td.InteractionAffordance
import edu.uoc.som.wot.td.Link
import edu.uoc.som.wot.td.PropertyAffordance
import edu.uoc.som.wot.td.Thing
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.generator.IFileSystemAccess2

class ThingDescriptionGenerator {

	static def doGenerate(Resource resource, IFileSystemAccess2 fsa) {
     	for (t : resource.allContents.toIterable.filter(Thing)) {
    		fsa.generateFile("THING/" + t.c_id + "_thing.h", thing_h(t));
	       	fsa.generateFile("THING/" + t.c_id + "_thing.cpp", thing_c(t));
    	}
    	
    	for (l : resource.allContents.toIterable.filter(Link)) {
			fsa.generateFile("LINK/" + l.c_id + "_link.h", link_h(l));
	       	fsa.generateFile("LINK/" + l.c_id + "_link.cpp", link_c(l));
    	}
    	
		for (a : resource.allContents.toIterable.filter(ActionAffordance)) {
			fsa.generateFile("ACTION/" + a.c_id + "_action.h", action_h(a));
	       	fsa.generateFile("ACTION/" + a.c_id + "_action.cpp", action_c(a));
    	}
    	
    	for (e : resource.allContents.toIterable.filter(EventAffordance)) {
   	       	fsa.generateFile("EVENT/" + e.c_id + "_event.h", event_h(e));
	       	fsa.generateFile("EVENT/" + e.c_id + "_event.cpp", event_c(e));
    	}
    	
    	for (p : resource.allContents.toIterable.filter(PropertyAffordance)) {
    		fsa.generateFile("PROPERTY/" + p.c_id + "_property.h", property_h(p));
	       	fsa.generateFile("PROPERTY/" + p.c_id + "_property.cpp", property_c(p));
    	}
    	
    	for (f : resource.allContents.toIterable.filter(Form)) {
    		fsa.generateFile("FORM/" + f.c_id + "_form.h", form_h(f));
    		fsa.generateFile("FORM/" + f.c_id + "_form.cpp", form_c(f));
    	}
    	
    	for (d : resource.allContents.toIterable.filter(DataSchema)) {
    		fsa.generateFile("DATASCHEMA/" + d.c_id + "_dataschema.h", dataschema_h(d));
		   	fsa.generateFile("DATASCHEMA/" + d.c_id + "_dataschema.cpp", dataschema_c(d));
    	}
    	
    	
    	
	}
	
	static def action_c(ActionAffordance a) '''
		/*
		 * �a.c_id�.c
		 *
		 * This is an action source file automatically generated
		 *  Created on: 22 may. 2019
		 *      Author: miglesias
		 */
		 
		#ifndef �a.c_id�_ACTION_DEFINED
		#define �a.c_id�_ACTION_DEFINED
		
		#include "../../../lib-model-core/src/core-model/ACTION/action.h"
		namespace ACTION {
			class �a.id�_ACTION : public core_model::ACTION::Action{
				
				public:
					�a.c_id�_ACTION();
					virtual ~�a.c_id�_ACTION();
					
					//a.label = �a.title�;
					//a.description= �a.description�;
					//a.forms = �a.forms�;
					//InteractionPattern = �a.eContainer().eAllContents.toIterable.filter(InteractionAffordance)�;
					
					// dataschemaType type, string sdescription, string dconst, string* denum, DataSchema<T> input, DataSchema<T> output):
					//	InteractionPattern(label, scopes, idescription, forms),
					//	StringSchema(sdescription, dconst, denum),
					//	input(input),
					//	output(output){};
			};
		}
		#endif // �a.c_id�_ACTION_DEFINED
		

		
	'''
	
	static def action_h(ActionAffordance a) '''
		/*
		 * �a.c_id�.h
		 *
		 * This is an action header file automatically generated
		 *  Created on: 22 may. 2019
		 *      Author: miglesias
		 */

	'''
		
	static def event_c(EventAffordance e) '''
		/*
		 * �e.c_id�.c
		 *
		 * This is an event source file automatically generated
		 *  Created on: 22 may. 2019
		 *      Author: miglesias
		 */
		 
	'''
	
	static def event_h(EventAffordance e) '''
		/*
		 * �e.c_id�.h
		 *
		 * This is an event header file automatically generated
		 *  Created on: 22 may. 2019
		 *      Author: miglesias
		 */
		 
	'''
	
	static def property_c(PropertyAffordance p) '''
		/*
		 * �p.c_id�.c
		 *
		 * This is a property source file automatically generated
		 *  Created on: 22 may. 2019
		 *      Author: miglesias
		 */
		
		#include "�p.c_id�_property.h"
		
	'''
	
	static def property_h(PropertyAffordance p) '''
		/*
		 * �p.c_id�.h
		 *
		 * This is an action header file automatically generated
		 *  Created on: 22 may. 2019
		 *      Author: miglesias
		 */
		 
		#ifndef �p.c_id�_PROPERTY_DEFINED
		#define �p.c_id�_PROPERTY_DEFINED
		
		#include "../../../lib-model-core/src/core-model/PROPERTY/property.h"
		#include "../../../lib-model-core/src/core-model/FORM/form.h"
		#include "../../../lib-model-core/src/core-model/INTERACTIONPATTERN/interactionPattern.h"
		#include "../../../lib-model-core/src/core-model/DATASCHEMA/dataSchema.h"
		
		using namespace core_model::PROPERTY;
		using namespace core_model::FORM;
		using namespace core_model::INTERACTION_PATTERN;
		
		namespace PROPERTY {
			class �p.c_id�_PROPERTY : public core_model::PROPERTY::Property{
				
				public:
				// p.type = �p.type�
				
				�IF p.type == "dataschemaType_boolean"�
					// BooleanSchema
					�p.c_id�_PROPERTY(string label, string description, Form* forms, dataschemaType type, bool dconst, bool* denum, bool writable, bool observable):
					PROPERTY("�p.title�", "�p.description�", forms, �p.type�, �p.const�, �p.enum�, �!p.readOnly�, �p.observable�)
					{};
				�ELSEIF p.type == "dataschemaType_integer"�
					// IntegerSchema
					�p.c_id�_PROPERTY(string label, string scopes, string idescription, Form* forms, dataschemaType type, string sdescription, int dconst, int* denum, int minimum, int maximum, bool writable, bool observable):
					PROPERTY(label, scopes, idescription, forms, type, sdescription, dconst, denum, minimum, maximum, writable, observable)
					{};
				�ELSEIF p.type == "dataschemaType_number"�
					// NumberSchema
					�p.c_id�_PROPERTY(string label, string scopes, string idescription, Form* forms, dataschemaType type, string sdescription, double dconst, double* denum, double minimum, double maximum, bool writable, bool observable):
					PROPERTY(label, scopes, idescription, forms, type, sdescription, dconst, denum, minimum, maximum, writable, observable)
					{};
				�ELSEIF p.type == "dataschemaType_string"�
					// StringSchema
					�p.c_id�_PROPERTY(string label, string scopes, string idescription, Form* forms, dataschemaType type, string sdescription, string dconst, string* denum, bool writable, bool observable):
					PROPERTY(label, scopes, idescription, forms, type, sdescription, dconst, denum, writable, observable)
					{};
				�ELSEIF p.c_id == "dataschemaType_object"�
					// ObjectSchema
					�p.c_id�_PROPERTY(string label, string scopes, string idescription, Form* forms, dataschemaType type, string sdescription, string dconst, string* denum, string* required, DataSchema<T> properties, bool writable, bool observable):
					PROPERTY(label, scopes, idescription, forms, type, sdescription, dconst, denum, required, properties, writable, observable)
					{};
				�ELSEIF p.type == "dataschemaType_array"�
					// ArraySchema
					�p.c_id�_PROPERTY(Property(string label, string scopes, string idescription, Form* forms, dataschemaType type, string sdescription, vector<unsigned int> dconst, vector<unsigned int>* denum, unsigned int minItems, unsigned int maxItems, DataSchema<T> items, bool writable, bool observable):):
					PROPERTY(Property(label, scopes, idescription, forms, type, sdescription, dconst, denum, minItems, maxItems, items, writable, observable):)
					{};
				�ELSEIF p.type == "dataschemaType_null"�
					// NullSchema
					�p.c_id�_PROPERTY(string label, string scopes, string idescription, Form* forms, dataschemaType type, string sdescription, bool writable, bool observable):
					PROPERTY(label, scopes, idescription, forms, type, sdescription, writable, observable)
					{};
				�ELSE�
					// No dataSchemaType
					�p.c_id�_PROPERTY(string label, string scopes, string idescription, Form* forms, dataschemaType type, string sdescription, bool writable, bool observable):
					PROPERTY(label, scopes, idescription, forms, type, sdescription, writable, observable)
					{};
				�ENDIF�

				virtual ~�p.c_id�_PROPERTY();


		 	};
		}
		#endif // �p.c_id�_PROPERTY_DEFINED
	'''
	
	static def thing_c(Thing t) '''
		/*
		 * �t.c_id�.c
		 *
		 * This is a thing source file automatically generated
		 *  Created on: 22 may. 2019
		 *      Author: miglesias
		 */
		 
	'''
	
	static def thing_h(Thing t) '''
		/*
		 * �t.c_id�.h
		 *
		 * This is a thing header file automatically generated
		 *  Created on: 22 may. 2019
		 *      Author: miglesias
		 */
		 
	'''
	
	static def form_c(Form f) '''
		/*
		 * �f.c_id�.c
		 *
		 * This is a form source file automatically generated
		 *  Created on: 22 may. 2019
		 *      Author: miglesias
		 */
		 
	'''
	
	static def form_h(Form f) '''
		/*
		 * �f.c_id�.h
		 *
		 * This is a form header file automatically generated
		 *  Created on: 22 may. 2019
		 *      Author: miglesias
		 */
		 
	'''
	
	static def link_c(Link l) '''
		/*
		 * �l.c_id�.c
		 *
		 * This is a link source file automatically generated
		 *  Created on: 22 may. 2019
		 *      Author: miglesias
		 */
		 
	'''
	
	static def link_h(Link l) '''
		/*
		 * �l.c_id�.c
		 *
		 * This is a link header file automatically generated
		 *  Created on: 22 may. 2019
		 *      Author: miglesias
		 */
		 
	'''
	
	static def dataschema_c(DataSchema d) '''
		/*
		 * �d.c_id�.c
		 *
		 * This is a dataschema source file automatically generated
		 *  Created on: 22 may. 2019
		 *      Author: miglesias
		 */
		 
	'''
	
	static def dataschema_h(DataSchema d) '''
		/*
		 * �d.c_id�.h
		 *
		 * This is a dataschema file automatically generated
		 *  Created on: 22 may. 2019
		 *      Author: miglesias
		 */
		 
	'''
	
	static def c_id(InteractionAffordance ia) {
		return ia.id.sanitize
	}
	
	static def c_id(PropertyAffordance pa) {
		return pa.id.sanitize
	}
	
	static def c_id(Thing t) {
		return t.id.sanitize
	}
	
	static def c_id(Form f) {
		return f.href.sanitize
	}
	
	static def c_id(Link l) {
		return l.href.sanitize
	}
	
	static def c_id(DataSchema d) {
		return EcoreUtil2.getContainerOfType(d, InteractionAffordance).c_id
	}
	
	static def sanitize(String s) {
		val result = new StringBuilder
		for (c : s.toCharArray) {
			result.append(if (Character.isJavaIdentifierPart(c)) c else "_")
		}
		return result
	}
}
