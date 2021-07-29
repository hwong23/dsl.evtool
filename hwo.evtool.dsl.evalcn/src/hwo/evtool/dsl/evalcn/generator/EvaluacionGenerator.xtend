/*
 * generated by Xtext 2.25.0
 */
package hwo.evtool.dsl.evalcn.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import hwo.evtool.dsl.evalcn.evaluacion.Componente
import hwo.evtool.dsl.evalcn.evaluacion.Evaluacion
import hwo.evtool.dsl.evalcn.evaluacion.CalificarPropuesta
import hwo.evtool.dsl.evalcn.evaluacion.CalificarEquipo
import hwo.evtool.dsl.evalcn.evaluacion.CalificarOtros

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

	public class �e.name� {
			�FOR c : e.actions�
			�c.declareStrings�
			�ENDFOR�
	
		public static void main(String[] args) {
			new �e.name�().run();
			
		}
		
		protected void run() {
			Control cntrol = new Control ();
			
			�FOR c : e.actions�
			�c.declareCommand�
			�ENDFOR�
			
			�var i = 0�
			�FOR c : e.actions�
				�c.ponerComando(i++)�
			�ENDFOR�

			�var j = 0�
			�FOR c : e.actions�
				�c.callCommand(j++)�
			�ENDFOR�
			
			System.out.println("--- Total " + cntrol.getTotal());
		}
	}
	'''
		
	protected def callCommand(Evaluacion comando, int i) '''
		cntrol.llamarEvaluacion1(�i�);
	'''
		
	protected def ponerComando(Evaluacion c, int i) '''
		/* llamador */ cntrol.setComando(�i�, cmpnt�c.name�);
	'''	

	protected def declareCommand(Evaluacion c) '''
		�var tipo = typeValue(c)�
		/* solicitd */ Cmpnnt_�tipo� cmpnt�c.name� = new Cmpnnt_�tipo�(str_�c.name�);
	'''
	
	protected def declareStrings (Evaluacion c) '''
		String[] str_�c.name� = {"�c.name�","�stringValue(c)�","�c.eClass.name�"};
	'''
	
	protected def dispatch stringValue(CalificarPropuesta c) '''
		�c.tipo�", "�c.puntuacion�'''
	
	protected def dispatch stringValue(CalificarEquipo c) '''
		�c.tipo�", "�c.formacionVal�", "�c.experienciaVal�", "�c.certificacionVal�'''

	protected def dispatch stringValue(CalificarOtros c) '''
		�c.tipo�", "�c.valor�'''

	protected def dispatch typeValue(CalificarPropuesta c) '''
		�c.tipo�'''
	
	protected def dispatch typeValue(CalificarEquipo c) '''
		�c.tipo�'''

	protected def dispatch typeValue(CalificarOtros c) '''
		�c.tipo�'''
	}

