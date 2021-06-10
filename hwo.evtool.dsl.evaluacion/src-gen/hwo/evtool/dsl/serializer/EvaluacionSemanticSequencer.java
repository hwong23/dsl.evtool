/*
 * generated by Xtext 2.25.0
 */
package hwo.evtool.dsl.serializer;

import com.google.inject.Inject;
import hwo.evtool.dsl.evaluacion.BasicType;
import hwo.evtool.dsl.evaluacion.CmpnntEvaluacion;
import hwo.evtool.dsl.evaluacion.ComponenteType;
import hwo.evtool.dsl.evaluacion.Criterio;
import hwo.evtool.dsl.evaluacion.CriterioType;
import hwo.evtool.dsl.evaluacion.EvaluacionPackage;
import hwo.evtool.dsl.evaluacion.Model;
import hwo.evtool.dsl.services.EvaluacionGrammarAccess;
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
			case EvaluacionPackage.BASIC_TYPE:
				sequence_BasicType(context, (BasicType) semanticObject); 
				return; 
			case EvaluacionPackage.CMPNNT_EVALUACION:
				sequence_CmpnntEvaluacion(context, (CmpnntEvaluacion) semanticObject); 
				return; 
			case EvaluacionPackage.COMPONENTE_TYPE:
				sequence_ComponenteType(context, (ComponenteType) semanticObject); 
				return; 
			case EvaluacionPackage.CRITERIO:
				sequence_Criterio(context, (Criterio) semanticObject); 
				return; 
			case EvaluacionPackage.CRITERIO_TYPE:
				sequence_CriterioType(context, (CriterioType) semanticObject); 
				return; 
			case EvaluacionPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ElementType returns BasicType
	 *     BasicType returns BasicType
	 *
	 * Constraint:
	 *     (typeName='string' | typeName='int' | typeName='boolean')
	 */
	protected void sequence_BasicType(ISerializationContext context, BasicType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CmpnntEvaluacion returns CmpnntEvaluacion
	 *
	 * Constraint:
	 *     (name=ID superType=[CmpnntEvaluacion|ID]? attributes+=Criterio*)
	 */
	protected void sequence_CmpnntEvaluacion(ISerializationContext context, CmpnntEvaluacion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ElementType returns ComponenteType
	 *     ComponenteType returns ComponenteType
	 *
	 * Constraint:
	 *     entity=[CmpnntEvaluacion|ID]
	 */
	protected void sequence_ComponenteType(ISerializationContext context, ComponenteType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EvaluacionPackage.Literals.COMPONENTE_TYPE__ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EvaluacionPackage.Literals.COMPONENTE_TYPE__ENTITY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComponenteTypeAccess().getEntityCmpnntEvaluacionIDTerminalRuleCall_0_1(), semanticObject.eGet(EvaluacionPackage.Literals.COMPONENTE_TYPE__ENTITY, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     CriterioType returns CriterioType
	 *
	 * Constraint:
	 *     (elementType=ElementType (array?='[' length=INT?)?)
	 */
	protected void sequence_CriterioType(ISerializationContext context, CriterioType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Criterio returns Criterio
	 *
	 * Constraint:
	 *     (type=CriterioType name=ID)
	 */
	protected void sequence_Criterio(ISerializationContext context, Criterio semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EvaluacionPackage.Literals.CRITERIO__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EvaluacionPackage.Literals.CRITERIO__TYPE));
			if (transientValues.isValueTransient(semanticObject, EvaluacionPackage.Literals.CRITERIO__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EvaluacionPackage.Literals.CRITERIO__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCriterioAccess().getTypeCriterioTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getCriterioAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     entities+=CmpnntEvaluacion+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
