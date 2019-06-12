package edu.uoc.som.wot.td.ui.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import edu.uoc.som.wot.td.Action
import edu.uoc.som.wot.td.Event
import edu.uoc.som.wot.td.Property
import edu.uoc.som.wot.td.Thing
import edu.uoc.som.wot.td.Form
import edu.uoc.som.wot.td.Link


class WoTGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		//fsa.generateFile("example1.c", dummy)
		//fsa.generateFile("example2.c", dummy)
		

    	for (t : resource.allContents.toIterable.filter(Thing)) {
    		fsa.generateFile("Thing/" + t.name + ".c", thing_h);
	       	fsa.generateFile("Thing/" + t.name + ".h", thing_c);
    	}
    	
    	for (l : resource.allContents.toIterable.filter(Link)) {
			fsa.generateFile("Action/" + l.href + ".c", link_h);
	       	fsa.generateFile("Action/" + l.href + ".h", link_c);
    	}
    	
		for (a : resource.allContents.toIterable.filter(Action)) {
			fsa.generateFile("Action/" + a.label + ".c", action_h);
	       	fsa.generateFile("Action/" + a.label + ".h", action_c);
    	}
    	
    	for (e : resource.allContents.toIterable.filter(Event)) {
   	       	fsa.generateFile("Event/" + e.label + ".c", event_h);
	       	fsa.generateFile("Event/" + e.label + ".h", event_c);
    	}
    	
    	for (p : resource.allContents.toIterable.filter(Property)) {
    		fsa.generateFile("Property/" + p.label + ".c", property_h);
	       	fsa.generateFile("Property/" + p.label + ".h", property_c);
    	}
    	

    	for (f : resource.allContents.toIterable.filter(Form)) {
    		fsa.generateFile("Form/" + f.href + ".c", form_h);
	       	fsa.generateFile("Form/" + f.href + ".h", form_c);
    	}
	}
	
	def dummy() '''
		# Dummy contents
		Contents
	'''
	
	
	def action_c() '''
		# This is an action source file
		Contents
	'''
	
	def action_h() '''
		# This is an action header file
		Contents
	'''
		
	def event_c() '''
		# This is an event source file
		Contents
	'''
	
	def event_h() '''
		# This is an event header file
		Contents
	'''
	
	def property_c() '''
		# This is a property header file
		Contents
	'''
	
	def property_h() '''
		# This is a property header file
		Contents
	'''
	
	def thing_c() '''
		# This is a thing header file
		Contents
	'''
	
	def thing_h() '''
		# This is a thing header file
		Contents
	'''
	
	def form_c() '''
		# This is a form header file
		Contents
	'''
	
	def form_h() '''
		# This is a form header file
		Contents
	'''
	
	def link_c() '''
		# This is a link header file
		Contents
	'''
	
	def link_h() '''
		# This is a link header file
		Contents
	'''
}
