/*
 * generated by Xtext 2.25.0
 */
package hwo.evtool.dsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import hwo.evtool.dsl.evaluacion.Estado
import hwo.evtool.dsl.evaluacion.Comando
import hwo.evtool.dsl.evaluacion.IntConstant
import hwo.evtool.dsl.evaluacion.StringConstant
import hwo.evtool.dsl.evaluacion.SiNoConstant

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class EvaluacionGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {	
		for (e : resource.allContents.toIterable.filter(Estado)) {
	        fsa.generateFile (
				"componentes/" + e.eResource.className + ".java",
	            // "componentes/" + e.eContainer.fullyQualifiedName.toString + ".java",
	            e.compile
	        )
    	}
	}

	
//	fsa.generateFile(resource.className + ".java", 
//		toJavaCode(resource.contents.head as MaquinaEstados)
//	)


	def CharSequence compile(Estado e) '''
		package «e.class.name»;
		
		public class «e.eResource.className» {
			«FOR c : e.actions»
				«c.declareStrings»
			«ENDFOR»
		
			public static void main(String[] args) {
				new «e.eResource.className»().run();
			}
			
			protected void run() {
				«FOR c : e.actions»
					«c.declareCommand»
				«ENDFOR»
			}
		}
	'''
		
	protected def className(Resource res) {
		var name = res.URI.lastSegment
		return name.substring(0, name.indexOf('.')).toFirstUpper
	}


	protected def declareCommand(Comando c) '''
		System.out.println("command:" + «c.name»[0] + " comentario:" + «c.name»[1]);
	'''
	
		
	protected def declareStrings(Comando c) '''
		«IF c.argumento.eClass.name.equals("IntConstant")»
		String[] «c.name» = {"«(c.argumento as IntConstant).valor.nota»","«(c.argumento as IntConstant).valor.calificacion»","«c.comentario»","«c.argumento.eClass.name»"};
		«ELSEIF c.argumento.eClass.name.equals("StringConstant")»
		String[] «c.name» = {"«(c.argumento as StringConstant).valor»","«c.comentario»", "«c.argumento.eClass.name»"};
		«ELSEIF c.argumento.eClass.name.equals("SiNoConstant")»
		String[] «c.name» = {"«(c.argumento as SiNoConstant).valor»","«c.comentario»", "«c.argumento.eClass.name»"};
		«ENDIF»
	'''
}