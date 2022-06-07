/*
 * generated by Xtext 2.17.0
 */
package edu.uoc.som.wot.td.json.generator

import edu.uoc.som.wot.td.ActionAffordance
import edu.uoc.som.wot.td.ArraySchema
import edu.uoc.som.wot.td.BooleanSchema
import edu.uoc.som.wot.td.DataSchema
import edu.uoc.som.wot.td.EventAffordance
import edu.uoc.som.wot.td.ExpectedResponse
import edu.uoc.som.wot.td.Form
import edu.uoc.som.wot.td.IntegerSchema
import edu.uoc.som.wot.td.Link
import edu.uoc.som.wot.td.MultiLanguage
import edu.uoc.som.wot.td.NullSchema
import edu.uoc.som.wot.td.NumberSchema
import edu.uoc.som.wot.td.ObjectSchema
import edu.uoc.som.wot.td.PropertyAffordance
import edu.uoc.som.wot.td.SecurityScheme
import edu.uoc.som.wot.td.StringSchema
import edu.uoc.som.wot.td.TdFactory
import edu.uoc.som.wot.td.Thing
import edu.uoc.som.wot.td.VersionInfo
import edu.uoc.som.wot.td.json.thingDescriptionJson.JsonActionAffordance
import edu.uoc.som.wot.td.json.thingDescriptionJson.JsonBoolean
import edu.uoc.som.wot.td.json.thingDescriptionJson.JsonDataSchema
import edu.uoc.som.wot.td.json.thingDescriptionJson.JsonEventAffordance
import edu.uoc.som.wot.td.json.thingDescriptionJson.JsonExpectedResponse
import edu.uoc.som.wot.td.json.thingDescriptionJson.JsonForm
import edu.uoc.som.wot.td.json.thingDescriptionJson.JsonLink
import edu.uoc.som.wot.td.json.thingDescriptionJson.JsonMultiLanguageEntry
import edu.uoc.som.wot.td.json.thingDescriptionJson.JsonPropertyAffordance
import edu.uoc.som.wot.td.json.thingDescriptionJson.JsonSecurityScheme
import edu.uoc.som.wot.td.json.thingDescriptionJson.JsonVersionInfo
import java.util.Collections
import javax.xml.datatype.DatatypeFactory
import javax.xml.datatype.XMLGregorianCalendar
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import edu.uoc.som.wot.td.json.thingDescriptionJson.JsonThing

class ThingDescriptionJsonGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val tdResource = resource.transform()
		tdResource.URI = fsa.getURI("resource.td")
		tdResource.save(Collections.emptyMap)
		ThingDescriptionGenerator.doGenerate(tdResource, fsa)
	}
	
	static def Resource transform(Resource resource) {
		return new XMIResourceImpl() => [
			contents += resource.allContents.toIterable.filter(JsonThing).map[toThing]
		]
	}

	static def Thing toThing(JsonThing jtd) {
		return TdFactory.eINSTANCE.createThing => [
			id = jtd.id
			title = jtd.title
			description = jtd.description
			created = jtd.created?.toXMLGregorianCalendar
			modified = jtd.modified?.toXMLGregorianCalendar
			support = jtd.support
			base = jtd.base
			security += jtd.security
			forms += jtd.forms.map[toForm]
			links += jtd.links.map[toLink]
			titles = jtd.titles?.toMultiLanguage
			descriptions= jtd.descriptions?.toMultiLanguage
			version = jtd.version?.toVersionInfo
			securityDefinitions += jtd.securityDefinitions.map[toSecurityScheme]
			properties += jtd.properties.map[toPropertyAffordance]
			actions += jtd.actions.map[toActionAffordance]
			events += jtd.events.map[toEventAffordance]
		]
	}
	
	static def XMLGregorianCalendar toXMLGregorianCalendar(String string) {
		try {
			return DatatypeFactory.newInstance.newXMLGregorianCalendar(string)
		} catch (IllegalArgumentException | NullPointerException e) {
			return null;
		}
	}
	
	static def Form toForm(JsonForm jf) {
		return TdFactory.eINSTANCE.createForm => [
			op += jf.op
			href = jf._href
			contentType = jf.contentType
			contentCoding = jf.contentCoding
			subProtocol = jf.subprotocol
			security += jf.security
			scopes += jf.scopes
			response = jf.response?.toExpectedResponse
		]
	}

	static def ExpectedResponse toExpectedResponse(JsonExpectedResponse jer) {
		return TdFactory.eINSTANCE.createExpectedResponse => [
			contentType = jer.contentType
		]
	}

	static def Link toLink(JsonLink jl) {
		return TdFactory.eINSTANCE.createLink => [
			href = jl._href
			type = jl.type
			rel = jl.rel
			anchor = jl.anchor
		]
	}
	
	static def MultiLanguage toMultiLanguage(EList<JsonMultiLanguageEntry> jmlelist) {
		if (jmlelist.empty) return null;
		return TdFactory.eINSTANCE.createMultiLanguage => [
			translations.putAll(jmlelist?.toMap([language], [content]))
		]
	}

	static def VersionInfo toVersionInfo(JsonVersionInfo jvi) {
		return TdFactory.eINSTANCE.createVersionInfo => [
			instance = jvi.instance
		]
	}

	static def PropertyAffordance toPropertyAffordance(JsonPropertyAffordance jpa) {
		return TdFactory.eINSTANCE.createPropertyAffordance => [
			id = jpa.id
			title = jpa.title
			description = jpa.description
			type = jpa.type.getName
			const = jpa.const
			unit = jpa.unit
			readOnly = (jpa.readOnly == JsonBoolean._TRUE)			
			writeOnly = (jpa.writeOnly == JsonBoolean._TRUE)
			format = jpa.format
			oneOf += jpa.oneOf.map[toDataSchema]
			titles = jpa.titles?.toMultiLanguage
			descriptions = jpa.descriptions?.toMultiLanguage
			forms += jpa.forms.map[toForm]
			uriVariable += jpa.uriVariable.map[toDataSchema]
			observable = (jpa.observable == JsonBoolean._TRUE)
		]
	}

	static def ActionAffordance toActionAffordance(JsonActionAffordance jaa) {
		return TdFactory.eINSTANCE.createActionAffordance => [
			id = jaa.id
			title = jaa.title
			description = jaa.description
			titles = jaa.titles?.toMultiLanguage
			descriptions = jaa.descriptions?.toMultiLanguage
			forms += jaa.forms.map[toForm]
			uriVariable += jaa.uriVariable.map[toDataSchema]
			safe = (jaa.safe == JsonBoolean._TRUE)
			idempotent = (jaa.idempotent == JsonBoolean._TRUE)
			input = jaa.input?.toDataSchema
			output = jaa.output?.toDataSchema
		]
	}

	static def EventAffordance toEventAffordance(JsonEventAffordance jvi) {
		return TdFactory.eINSTANCE.createEventAffordance => [
			id = jvi.id
			title = jvi.title
			description = jvi.description
			titles = jvi.titles?.toMultiLanguage
			descriptions = jvi.descriptions?.toMultiLanguage
			forms += jvi.forms.map[toForm]
			uriVariable += jvi.uriVariable.map[toDataSchema]
			data = jvi.data?.toDataSchema
			subscription = jvi.subscription?.toDataSchema
			cancellation = jvi.cancellation?.toDataSchema
		]
	}

	static def DataSchema toDataSchema(JsonDataSchema jds) {
		return switch (jds.type) {
			case ARRAY: jds?.toArraySchema
			case OBJECT: jds?.toObjectSchema
			case NUMBER: jds?.toNumberSchema
			case INTEGER: jds?.toIntegerSchema
			case STRING: jds?.toStringSchema
			case BOOLEAN: jds?.toBooleanSchema 
			case NULL: jds?.toNullSchema
		} => [
			title = jds.title
			description = jds.description
			type = jds.type.getName
			const = jds.const
			unit = jds.unit
			readOnly = (jds.readOnly == JsonBoolean._TRUE)			
			writeOnly = (jds.writeOnly == JsonBoolean._TRUE)
			format = jds.format
			oneOf += jds.oneOf.map[toDataSchema]
			titles = jds.titles?.toMultiLanguage
			descriptions = jds.descriptions?.toMultiLanguage
		]
	}
	
	static def ArraySchema toArraySchema(JsonDataSchema jds) {
		return TdFactory.eINSTANCE.createArraySchema => [
			minItems = jds.minItems
			maxItems = jds.maxItems
			items += jds.items.map[toDataSchema]
		]
	}

	static def ObjectSchema toObjectSchema(JsonDataSchema jds) {
		return TdFactory.eINSTANCE.createObjectSchema => [
			required += jds.required
			properties += jds.items.map[toDataSchema]
		]
	}

	static def NumberSchema toNumberSchema(JsonDataSchema jds) {
		return TdFactory.eINSTANCE.createNumberSchema => [
			minimum = jds.minimum
			maximum = jds.maximum
		]
	}

	static def IntegerSchema toIntegerSchema(JsonDataSchema jds) {
		return TdFactory.eINSTANCE.createIntegerSchema => [
			minimum = jds.minimum
			maximum = jds.maximum
		]
	}

	static def StringSchema toStringSchema(JsonDataSchema jds) {
		return TdFactory.eINSTANCE.createStringSchema => [
		]
	}

	static def BooleanSchema toBooleanSchema(JsonDataSchema jds) {
		return TdFactory.eINSTANCE.createBooleanSchema => [
		]
	}

	static def NullSchema toNullSchema(JsonDataSchema jds) {
		return TdFactory.eINSTANCE.createNullSchema => [
		]
	}

	static def SecurityScheme toSecurityScheme(JsonSecurityScheme jss) {
		return TdFactory.eINSTANCE.createSecurityScheme => [
			id = jss.id
			scheme = "empty"
			description = "This is a dummy scheme. Security schemes have not been implemented yet."
		]
	}
}
