/*
 * generated by Xtext 2.25.0
 */
package hwo.evtool.dsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import hwo.evtool.dsl.evaluacion.Componente
import hwo.evtool.dsl.evaluacion.IntConstant
import hwo.evtool.dsl.evaluacion.Evaluaciones
import hwo.evtool.dsl.evaluacion.ProptConstant

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class EvaluacionGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {	
		for (e : resource.allContents.toIterable.filter(Componente)) {
	        fsa.generateFile (
				e.name + ".java",
	            e.compile
	        )
    	}
	}

	
	def CharSequence compile(Componente e) '''
	import hwo.evtool.componenteEvaluacion.*;
	import hwo.evtool.ejecucion.Control;

	public class «e.name» {
			«FOR c : e.actions»
				«c.declareStrings»
			«ENDFOR»
	
		public static void main(String[] args) {
			new «e.name»().run();
		}
		
		protected void run() {
			Control cntrol = new Control ();
			
			«FOR c : e.actions»
				«c.declareCommand»
			«ENDFOR»
			
			«var i = 0»
			«FOR c : e.actions»
				«c.ponerComando(i++)»
			«ENDFOR»

			«var j = 0»
			«FOR c : e.actions»
				«c.callCommand(j++)»
			«ENDFOR»
		}
	}
	'''
		
	protected def callCommand(Evaluaciones comando, int i) '''
		cntrol.llamarEvaluacion1(«i»);
	'''
		
	protected def className(Resource res) {
		var name = res.URI.lastSegment
		return name.substring(0, name.indexOf('.')).toFirstUpper
	}


	protected def ponerComando(Evaluaciones c, int i) '''
		/* llamador */ cntrol.setComando(«i», cmpnt«c.name»);
	'''	

	protected def declareCommand(Evaluaciones c) '''
		/* solicitd */ Cmpnnt_«c.name» cmpnt«c.name» = new Cmpnnt_«c.name»(str_«c.name»);
	'''
	
	protected def declareStrings (Evaluaciones c) '''
		String[] str_«c.name» = {"«c.name»","«typeValue(c.argumento)»","«c.comentario»","«c.argumento.eClass.name»"};
	'''
	
	protected def dispatch typeValue(IntConstant c) '''
		«c.valor.nota»", "«c.valor.calificacion»'''
	
	protected def dispatch typeValue(ProptConstant c) '''
		«c.valor.tipo»", "«c.valor.calificacion»'''
}

