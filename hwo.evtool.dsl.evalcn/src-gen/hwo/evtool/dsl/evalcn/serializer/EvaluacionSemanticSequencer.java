/*
 * generated by Xtext 2.25.0
 */
package hwo.evtool.dsl.evalcn.serializer;

import com.google.inject.Inject;
import hwo.evtool.dsl.evalcn.evaluacion.CalificarEquipo;
import hwo.evtool.dsl.evalcn.evaluacion.CalificarOtros;
import hwo.evtool.dsl.evalcn.evaluacion.CalificarPropuesta;
import hwo.evtool.dsl.evalcn.evaluacion.Componente;
import hwo.evtool.dsl.evalcn.evaluacion.CriterioPropuesta;
import hwo.evtool.dsl.evalcn.evaluacion.EvaluacionPackage;
import hwo.evtool.dsl.evalcn.evaluacion.Evento;
import hwo.evtool.dsl.evalcn.evaluacion.Expresion;
import hwo.evtool.dsl.evalcn.evaluacion.MaquinaEstados;
import hwo.evtool.dsl.evalcn.evaluacion.TipoEvaluacion;
import hwo.evtool.dsl.evalcn.evaluacion.Transicion;
import hwo.evtool.dsl.evalcn.services.EvaluacionGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class EvaluacionSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EvaluacionGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == EvaluacionPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case EvaluacionPackage.CALIFICAR_EQUIPO:
				sequence_Evaluacion(context, (CalificarEquipo) semanticObject); 
				return; 
			case EvaluacionPackage.CALIFICAR_OTROS:
				sequence_Evaluacion(context, (CalificarOtros) semanticObject); 
				return; 
			case EvaluacionPackage.CALIFICAR_PROPUESTA:
				sequence_Evaluacion(context, (CalificarPropuesta) semanticObject); 
				return; 
			case EvaluacionPackage.COMPONENTE:
				sequence_Componente(context, (Componente) semanticObject); 
				return; 
			case EvaluacionPackage.CRITERIO_PROPUESTA:
				sequence_CriterioPropuesta(context, (CriterioPropuesta) semanticObject); 
				return; 
			case EvaluacionPackage.EVENTO:
				sequence_Evento(context, (Evento) semanticObject); 
				return; 
			case EvaluacionPackage.EXPRESION:
				sequence_Expresion(context, (Expresion) semanticObject); 
				return; 
			case EvaluacionPackage.MAQUINA_ESTADOS:
				sequence_MaquinaEstados(context, (MaquinaEstados) semanticObject); 
				return; 
			case EvaluacionPackage.TIPO_EVALUACION:
				sequence_TipoEvaluacion(context, (TipoEvaluacion) semanticObject); 
				return; 
			case EvaluacionPackage.TRANSICION:
				sequence_Transicion(context, (Transicion) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Componente returns Componente
	 *
	 * Constraint:
	 *     (name=ID actions+=[Evaluacion|ID]* transitions+=Transicion*)
	 */
	protected void sequence_Componente(ISerializationContext context, Componente semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CriterioPropuesta returns CriterioPropuesta
	 *
	 * Constraint:
	 *     puntuacion=E_Calificacion
	 */
	protected void sequence_CriterioPropuesta(ISerializationContext context, CriterioPropuesta semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EvaluacionPackage.Literals.CRITERIO_PROPUESTA__PUNTUACION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EvaluacionPackage.Literals.CRITERIO_PROPUESTA__PUNTUACION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCriterioPropuestaAccess().getPuntuacionE_CalificacionEnumRuleCall_2_0(), semanticObject.getPuntuacion());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Evaluacion returns CalificarEquipo
	 *
	 * Constraint:
	 *     (
	 *         tipo=TipoEquipo 
	 *         name=ID 
	 *         ((formacion='formacion' formacionVal=INT) | (experiencia='experiencia' experienciaVal=INT) | (certificacion='certificacion' certificacionVal=INT))+
	 *     )
	 */
	protected void sequence_Evaluacion(ISerializationContext context, CalificarEquipo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Evaluacion returns CalificarOtros
	 *
	 * Constraint:
	 *     (tipo='Otros' name=ID valor=INT)
	 */
	protected void sequence_Evaluacion(ISerializationContext context, CalificarOtros semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EvaluacionPackage.Literals.CALIFICAR_OTROS__TIPO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EvaluacionPackage.Literals.CALIFICAR_OTROS__TIPO));
			if (transientValues.isValueTransient(semanticObject, EvaluacionPackage.Literals.EVALUACION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EvaluacionPackage.Literals.EVALUACION__NAME));
			if (transientValues.isValueTransient(semanticObject, EvaluacionPackage.Literals.CALIFICAR_OTROS__VALOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EvaluacionPackage.Literals.CALIFICAR_OTROS__VALOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEvaluacionAccess().getTipoOtrosKeyword_2_1_0(), semanticObject.getTipo());
		feeder.accept(grammarAccess.getEvaluacionAccess().getNameIDTerminalRuleCall_2_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEvaluacionAccess().getValorINTTerminalRuleCall_2_5_0(), semanticObject.getValor());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Evaluacion returns CalificarPropuesta
	 *
	 * Constraint:
	 *     (tipo=TipoPropuesta name=ID criterios+=CriterioPropuesta)
	 */
	protected void sequence_Evaluacion(ISerializationContext context, CalificarPropuesta semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Evento returns Evento
	 *
	 * Constraint:
	 *     (name=ID code=ID)
	 */
	protected void sequence_Evento(ISerializationContext context, Evento semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EvaluacionPackage.Literals.EVENTO__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EvaluacionPackage.Literals.EVENTO__NAME));
			if (transientValues.isValueTransient(semanticObject, EvaluacionPackage.Literals.EVENTO__CODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EvaluacionPackage.Literals.EVENTO__CODE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEventoAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEventoAccess().getCodeIDTerminalRuleCall_1_0(), semanticObject.getCode());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expresion returns Expresion
	 *
	 * Constraint:
	 *     (tipo=TipoEvaluacion comentario=STRING?)
	 */
	protected void sequence_Expresion(ISerializationContext context, Expresion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MaquinaEstados returns MaquinaEstados
	 *
	 * Constraint:
	 *     (events+=Evento* resetEvents+=[Evento|ID]* commands+=Expresion* states+=Componente*)
	 */
	protected void sequence_MaquinaEstados(ISerializationContext context, MaquinaEstados semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TipoEvaluacion returns TipoEvaluacion
	 *
	 * Constraint:
	 *     evaluacion=Evaluacion
	 */
	protected void sequence_TipoEvaluacion(ISerializationContext context, TipoEvaluacion semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EvaluacionPackage.Literals.TIPO_EVALUACION__EVALUACION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EvaluacionPackage.Literals.TIPO_EVALUACION__EVALUACION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTipoEvaluacionAccess().getEvaluacionEvaluacionParserRuleCall_0(), semanticObject.getEvaluacion());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Transicion returns Transicion
	 *
	 * Constraint:
	 *     (event=[Evento|ID] state=[Componente|ID])
	 */
	protected void sequence_Transicion(ISerializationContext context, Transicion semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EvaluacionPackage.Literals.TRANSICION__EVENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EvaluacionPackage.Literals.TRANSICION__EVENT));
			if (transientValues.isValueTransient(semanticObject, EvaluacionPackage.Literals.TRANSICION__STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EvaluacionPackage.Literals.TRANSICION__STATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTransicionAccess().getEventEventoIDTerminalRuleCall_0_0_1(), semanticObject.eGet(EvaluacionPackage.Literals.TRANSICION__EVENT, false));
		feeder.accept(grammarAccess.getTransicionAccess().getStateComponenteIDTerminalRuleCall_2_0_1(), semanticObject.eGet(EvaluacionPackage.Literals.TRANSICION__STATE, false));
		feeder.finish();
	}
	
	
}
