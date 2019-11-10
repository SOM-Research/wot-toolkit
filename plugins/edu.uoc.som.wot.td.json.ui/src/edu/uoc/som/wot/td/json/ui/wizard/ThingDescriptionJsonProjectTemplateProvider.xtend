/*
 * generated by Xtext 2.17.0
 */
package edu.uoc.som.wot.td.json.ui.wizard


import org.eclipse.core.runtime.Status
import org.eclipse.jdt.core.JavaCore
import org.eclipse.xtext.ui.XtextProjectHelper
import org.eclipse.xtext.ui.util.PluginProjectFactory
import org.eclipse.xtext.ui.wizard.template.IProjectGenerator
import org.eclipse.xtext.ui.wizard.template.IProjectTemplateProvider
import org.eclipse.xtext.ui.wizard.template.ProjectTemplate

import static org.eclipse.core.runtime.IStatus.*

/**
 * Create a list with all project templates to be shown in the template new project wizard.
 * 
 * Each template is able to generate one or more projects. Each project can be configured such that any number of files are included.
 */
class ThingDescriptionJsonProjectTemplateProvider implements IProjectTemplateProvider {
	override getProjectTemplates() {
		#[new HelloWorldProject]
	}
}

@ProjectTemplate(label="Hello World", icon="project_template.png", description="<p><b>Hello World</b></p>
<p>This is a parameterized hello world for ThingDescriptionJson. You can set a parameter to modify the content in the generated file
and a parameter to set the package the file is created in.</p>")
final class HelloWorldProject {
	val advanced = check("Advanced:", false)
	val advancedGroup = group("Properties")
	val path = text("Package:", "mydsl", "The package path to place the files in", advancedGroup)

	override protected updateVariables() {
		path.enabled = advanced.value
		if (!advanced.value) {
			path.value = "tdjson"
		}
	}

	override protected validate() {
		if (path.value.matches('[a-z][a-z0-9_]*(/[a-z][a-z0-9_]*)*'))
			null
		else
			new Status(ERROR, "Wizard", "'" + path + "' is not a valid package name")
	}

	override generateProjects(IProjectGenerator generator) {
		generator.generate(new PluginProjectFactory => [
			projectName = projectInfo.projectName
			location = projectInfo.locationPath
			projectNatures += #[JavaCore.NATURE_ID, "org.eclipse.pde.PluginNature", XtextProjectHelper.NATURE_ID]
			builderIds += #[JavaCore.BUILDER_ID, XtextProjectHelper.BUILDER_ID]
			folders += "src"
			addFile('''src/�path�/Model.tdjson''', '''
				{
				    "@context": "https://www.w3.org/2019/wot/td/v1",
				    "id": "urn:dev:ops:32473-WoTLamp-1234",
				    "title": "MyLampThing",
				    "securityDefinitions": {
				        "basic_sc": {"scheme": "basic", "in":"header"}
				    },
				    "security": ["basic_sc"],
				    "properties": {
				        "status" : {
				            "type": "string",
				            "forms": [{"href": "https://mylamp.example.com/status"}]
				        }
				    },
				    "actions": {
				        "toggle" : {
				            "forms": [{"href": "https://mylamp.example.com/toggle"}]
				        }
				    },
				    "events":{
				        "overheating":{
				            "data": {"type": "string"},
				            "forms": [{
				                "href": "https://mylamp.example.com/oh",
				                "subprotocol": "longpoll"
				            }]
				        }
				    }
				}
			''')
		])
	}
}
