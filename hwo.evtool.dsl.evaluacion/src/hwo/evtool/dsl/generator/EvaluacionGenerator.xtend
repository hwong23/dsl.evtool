/*
 * generated by Xtext 2.25.0
 */
package hwo.evtool.dsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import static extension org.eclipse.xtext.nodemodel.util.NodeModelUtils.*
import hwo.evtool.dsl.evaluacion.CmpntEvaluacion

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class EvaluacionGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
//	resource.allContents.toIterable.filter(CmpntEvaluacion).forEach [
//			fsa.generateFile
//				('''«resource.URI.lastSegment».evaluated''',
//					interpretExpressions)
//		]
	for (e : resource.allContents.toIterable.filter(CmpntEvaluacion)) {
        fsa.generateFile (
            "componentes/" + e.name + ".java",
            e.compile
        )
    }
}
	
	def CharSequence compile(CmpntEvaluacion evaluacion) '''
		package entities;
		
		public class «CmpntEvaluacion.name» {
			«FOR attribute : evaluacion.atributos»
			«FOR criterio : attribute.criterios» 
			private «criterio»
			«ENDFOR»
			«ENDFOR»

«««			«FOR attribute : CmpntEvaluacion.attributes»
«««			public «attribute.type.compile» get«attribute.name.toFirstUpper»() {
«««				return «attribute.name»;
«««			}
«««			
«««			public void set«attribute.name.toFirstUpper»(«attribute.type.compile» _arg) {
«««				this.«attribute.name» = _arg;
«««			}
«««			
«««			«ENDFOR»
		}
	'''

	def interpretExpressions(CmpntEvaluacion model) {
		model.atributos.map [
	
		'''«getNode.getTokenText» ~>'''
		].join("\n")
	}
}
