/*
 * generated by Xtext 2.25.0
 */
grammar InternalEvaluacion;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package hwo.evtool.dsl.evalcn.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package hwo.evtool.dsl.evalcn.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import hwo.evtool.dsl.evalcn.services.EvaluacionGrammarAccess;

}

@parser::members {

 	private EvaluacionGrammarAccess grammarAccess;

    public InternalEvaluacionParser(TokenStream input, EvaluacionGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "MaquinaEstados";
   	}

   	@Override
   	protected EvaluacionGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleMaquinaEstados
entryRuleMaquinaEstados returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMaquinaEstadosRule()); }
	iv_ruleMaquinaEstados=ruleMaquinaEstados
	{ $current=$iv_ruleMaquinaEstados.current; }
	EOF;

// Rule MaquinaEstados
ruleMaquinaEstados returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getMaquinaEstadosAccess().getMaquinaEstadosAction_0(),
					$current);
			}
		)
		(
			otherlv_1='eventos'
			{
				newLeafNode(otherlv_1, grammarAccess.getMaquinaEstadosAccess().getEventosKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getMaquinaEstadosAccess().getEventsEventoParserRuleCall_1_1_0());
					}
					lv_events_2_0=ruleEvento
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMaquinaEstadosRule());
						}
						add(
							$current,
							"events",
							lv_events_2_0,
							"hwo.evtool.dsl.evalcn.Evaluacion.Evento");
						afterParserOrEnumRuleCall();
					}
				)
			)+
		)?
		(
			otherlv_3='resetEvents'
			{
				newLeafNode(otherlv_3, grammarAccess.getMaquinaEstadosAccess().getResetEventsKeyword_2_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMaquinaEstadosRule());
						}
					}
					otherlv_4=RULE_ID
					{
						newLeafNode(otherlv_4, grammarAccess.getMaquinaEstadosAccess().getResetEventsEventoCrossReference_2_1_0());
					}
				)
			)+
		)?
		(
			otherlv_5='evaluaciones'
			{
				newLeafNode(otherlv_5, grammarAccess.getMaquinaEstadosAccess().getEvaluacionesKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getMaquinaEstadosAccess().getCommandsExpresionParserRuleCall_3_1_0());
					}
					lv_commands_6_0=ruleExpresion
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMaquinaEstadosRule());
						}
						add(
							$current,
							"commands",
							lv_commands_6_0,
							"hwo.evtool.dsl.evalcn.Evaluacion.Expresion");
						afterParserOrEnumRuleCall();
					}
				)
			)+
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getMaquinaEstadosAccess().getStatesComponenteParserRuleCall_4_0());
				}
				lv_states_7_0=ruleComponente
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMaquinaEstadosRule());
					}
					add(
						$current,
						"states",
						lv_states_7_0,
						"hwo.evtool.dsl.evalcn.Evaluacion.Componente");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleEvento
entryRuleEvento returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEventoRule()); }
	iv_ruleEvento=ruleEvento
	{ $current=$iv_ruleEvento.current; }
	EOF;

// Rule Evento
ruleEvento returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getEventoAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEventoRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				lv_code_1_0=RULE_ID
				{
					newLeafNode(lv_code_1_0, grammarAccess.getEventoAccess().getCodeIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEventoRule());
					}
					setWithLastConsumed(
						$current,
						"code",
						lv_code_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleComponente
entryRuleComponente returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponenteRule()); }
	iv_ruleComponente=ruleComponente
	{ $current=$iv_ruleComponente.current; }
	EOF;

// Rule Componente
ruleComponente returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='componente'
		{
			newLeafNode(otherlv_0, grammarAccess.getComponenteAccess().getComponenteKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getComponenteAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponenteRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='actions'
			{
				newLeafNode(otherlv_2, grammarAccess.getComponenteAccess().getActionsKeyword_2_0());
			}
			otherlv_3='{'
			{
				newLeafNode(otherlv_3, grammarAccess.getComponenteAccess().getLeftCurlyBracketKeyword_2_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getComponenteRule());
						}
					}
					otherlv_4=RULE_ID
					{
						newLeafNode(otherlv_4, grammarAccess.getComponenteAccess().getActionsEvaluacionCrossReference_2_2_0());
					}
				)
			)+
			otherlv_5='}'
			{
				newLeafNode(otherlv_5, grammarAccess.getComponenteAccess().getRightCurlyBracketKeyword_2_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getComponenteAccess().getTransitionsTransicionParserRuleCall_3_0());
				}
				lv_transitions_6_0=ruleTransicion
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponenteRule());
					}
					add(
						$current,
						"transitions",
						lv_transitions_6_0,
						"hwo.evtool.dsl.evalcn.Evaluacion.Transicion");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleExpresion
entryRuleExpresion returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpresionRule()); }
	iv_ruleExpresion=ruleExpresion
	{ $current=$iv_ruleExpresion.current; }
	EOF;

// Rule Expresion
ruleExpresion returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getExpresionAccess().getTipoTipoEvaluacionParserRuleCall_0_0());
				}
				lv_tipo_0_0=ruleTipoEvaluacion
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExpresionRule());
					}
					set(
						$current,
						"tipo",
						lv_tipo_0_0,
						"hwo.evtool.dsl.evalcn.Evaluacion.TipoEvaluacion");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1=':'
			{
				newLeafNode(otherlv_1, grammarAccess.getExpresionAccess().getColonKeyword_1_0());
			}
			(
				(
					lv_comentario_2_0=RULE_STRING
					{
						newLeafNode(lv_comentario_2_0, grammarAccess.getExpresionAccess().getComentarioSTRINGTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getExpresionRule());
						}
						setWithLastConsumed(
							$current,
							"comentario",
							lv_comentario_2_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleTipoEvaluacion
entryRuleTipoEvaluacion returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTipoEvaluacionRule()); }
	iv_ruleTipoEvaluacion=ruleTipoEvaluacion
	{ $current=$iv_ruleTipoEvaluacion.current; }
	EOF;

// Rule TipoEvaluacion
ruleTipoEvaluacion returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getTipoEvaluacionAccess().getEvaluacionEvaluacionParserRuleCall_0());
			}
			lv_evaluacion_0_0=ruleEvaluacion
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getTipoEvaluacionRule());
				}
				set(
					$current,
					"evaluacion",
					lv_evaluacion_0_0,
					"hwo.evtool.dsl.evalcn.Evaluacion.Evaluacion");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleTransicion
entryRuleTransicion returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransicionRule()); }
	iv_ruleTransicion=ruleTransicion
	{ $current=$iv_ruleTransicion.current; }
	EOF;

// Rule Transicion
ruleTransicion returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransicionRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getTransicionAccess().getEventEventoCrossReference_0_0());
				}
			)
		)
		otherlv_1='=>'
		{
			newLeafNode(otherlv_1, grammarAccess.getTransicionAccess().getEqualsSignGreaterThanSignKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransicionRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getTransicionAccess().getStateComponenteCrossReference_2_0());
				}
			)
		)
	)
;

// Entry rule entryRuleEvaluacion
entryRuleEvaluacion returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEvaluacionRule()); }
	iv_ruleEvaluacion=ruleEvaluacion
	{ $current=$iv_ruleEvaluacion.current; }
	EOF;

// Rule Evaluacion
ruleEvaluacion returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getEvaluacionAccess().getCalificarPropuestaAction_0_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getEvaluacionAccess().getTipoTipoPropuestaEnumRuleCall_0_1_0());
					}
					lv_tipo_1_0=ruleTipoPropuesta
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEvaluacionRule());
						}
						set(
							$current,
							"tipo",
							lv_tipo_1_0,
							"hwo.evtool.dsl.evalcn.Evaluacion.TipoPropuesta");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					lv_name_2_0=RULE_ID
					{
						newLeafNode(lv_name_2_0, grammarAccess.getEvaluacionAccess().getNameIDTerminalRuleCall_0_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEvaluacionRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_2_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getEvaluacionAccess().getCriteriosCriterioPropuestaParserRuleCall_0_3_0());
					}
					lv_criterios_3_0=ruleCriterioPropuesta
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEvaluacionRule());
						}
						add(
							$current,
							"criterios",
							lv_criterios_3_0,
							"hwo.evtool.dsl.evalcn.Evaluacion.CriterioPropuesta");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getEvaluacionAccess().getCalificarEquipoAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getEvaluacionAccess().getTipoTipoEquipoEnumRuleCall_1_1_0());
					}
					lv_tipo_5_0=ruleTipoEquipo
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEvaluacionRule());
						}
						set(
							$current,
							"tipo",
							lv_tipo_5_0,
							"hwo.evtool.dsl.evalcn.Evaluacion.TipoEquipo");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					lv_name_6_0=RULE_ID
					{
						newLeafNode(lv_name_6_0, grammarAccess.getEvaluacionAccess().getNameIDTerminalRuleCall_1_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEvaluacionRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_6_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			(
				(
					{ 
					  getUnorderedGroupHelper().enter(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3());
					}
					(
						(
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3(), 0)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3(), 0);
						}
									({true}?=>((
										(
											lv_formacion_8_0='formacion'
											{
												newLeafNode(lv_formacion_8_0, grammarAccess.getEvaluacionAccess().getFormacionFormacionKeyword_1_3_0_0_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getEvaluacionRule());
												}
												setWithLastConsumed($current, "formacion", lv_formacion_8_0, "formacion");
											}
										)
									)
									otherlv_9=':'
									{
										newLeafNode(otherlv_9, grammarAccess.getEvaluacionAccess().getColonKeyword_1_3_0_1());
									}
									(
										(
											lv_formacionVal_10_0=RULE_INT
											{
												newLeafNode(lv_formacionVal_10_0, grammarAccess.getEvaluacionAccess().getFormacionValINTTerminalRuleCall_1_3_0_2_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getEvaluacionRule());
												}
												setWithLastConsumed(
													$current,
													"formacionVal",
													lv_formacionVal_10_0,
													"org.eclipse.xtext.common.Terminals.INT");
											}
										)
									)
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3(), 1)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3(), 1);
						}
									({true}?=>((
										(
											lv_experiencia_11_0='experiencia'
											{
												newLeafNode(lv_experiencia_11_0, grammarAccess.getEvaluacionAccess().getExperienciaExperienciaKeyword_1_3_1_0_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getEvaluacionRule());
												}
												setWithLastConsumed($current, "experiencia", lv_experiencia_11_0, "experiencia");
											}
										)
									)
									otherlv_12=':'
									{
										newLeafNode(otherlv_12, grammarAccess.getEvaluacionAccess().getColonKeyword_1_3_1_1());
									}
									(
										(
											lv_experienciaVal_13_0=RULE_INT
											{
												newLeafNode(lv_experienciaVal_13_0, grammarAccess.getEvaluacionAccess().getExperienciaValINTTerminalRuleCall_1_3_1_2_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getEvaluacionRule());
												}
												setWithLastConsumed(
													$current,
													"experienciaVal",
													lv_experienciaVal_13_0,
													"org.eclipse.xtext.common.Terminals.INT");
											}
										)
									)
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3(), 2)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3(), 2);
						}
									({true}?=>((
										(
											lv_certificacion_14_0='certificacion'
											{
												newLeafNode(lv_certificacion_14_0, grammarAccess.getEvaluacionAccess().getCertificacionCertificacionKeyword_1_3_2_0_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getEvaluacionRule());
												}
												setWithLastConsumed($current, "certificacion", lv_certificacion_14_0, "certificacion");
											}
										)
									)
									otherlv_15=':'
									{
										newLeafNode(otherlv_15, grammarAccess.getEvaluacionAccess().getColonKeyword_1_3_2_1());
									}
									(
										(
											lv_certificacionVal_16_0=RULE_INT
											{
												newLeafNode(lv_certificacionVal_16_0, grammarAccess.getEvaluacionAccess().getCertificacionValINTTerminalRuleCall_1_3_2_2_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getEvaluacionRule());
												}
												setWithLastConsumed(
													$current,
													"certificacionVal",
													lv_certificacionVal_16_0,
													"org.eclipse.xtext.common.Terminals.INT");
											}
										)
									)
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3());
						}
					)
				)
						)+
						{getUnorderedGroupHelper().canLeave(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3())}?
					)
				)
					{ 
					  getUnorderedGroupHelper().leave(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3());
					}
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getEvaluacionAccess().getCalificarOtrosAction_2_0(),
						$current);
				}
			)
			(
				(
					lv_tipo_18_0='Otros'
					{
						newLeafNode(lv_tipo_18_0, grammarAccess.getEvaluacionAccess().getTipoOtrosKeyword_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEvaluacionRule());
						}
						setWithLastConsumed($current, "tipo", lv_tipo_18_0, "Otros");
					}
				)
			)
			(
				(
					lv_name_19_0=RULE_ID
					{
						newLeafNode(lv_name_19_0, grammarAccess.getEvaluacionAccess().getNameIDTerminalRuleCall_2_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEvaluacionRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_19_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			otherlv_20='calificacion'
			{
				newLeafNode(otherlv_20, grammarAccess.getEvaluacionAccess().getCalificacionKeyword_2_3());
			}
			otherlv_21=':'
			{
				newLeafNode(otherlv_21, grammarAccess.getEvaluacionAccess().getColonKeyword_2_4());
			}
			(
				(
					lv_valor_22_0=RULE_INT
					{
						newLeafNode(lv_valor_22_0, grammarAccess.getEvaluacionAccess().getValorINTTerminalRuleCall_2_5_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEvaluacionRule());
						}
						setWithLastConsumed(
							$current,
							"valor",
							lv_valor_22_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)
	)
;

// Entry rule entryRuleCriterioPropuesta
entryRuleCriterioPropuesta returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCriterioPropuestaRule()); }
	iv_ruleCriterioPropuesta=ruleCriterioPropuesta
	{ $current=$iv_ruleCriterioPropuesta.current; }
	EOF;

// Rule CriterioPropuesta
ruleCriterioPropuesta returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='calificacion'
		{
			newLeafNode(otherlv_0, grammarAccess.getCriterioPropuestaAccess().getCalificacionKeyword_0());
		}
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getCriterioPropuestaAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCriterioPropuestaAccess().getPuntuacionE_CalificacionEnumRuleCall_2_0());
				}
				lv_puntuacion_2_0=ruleE_Calificacion
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCriterioPropuestaRule());
					}
					set(
						$current,
						"puntuacion",
						lv_puntuacion_2_0,
						"hwo.evtool.dsl.evalcn.Evaluacion.E_Calificacion");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Rule TipoEquipo
ruleTipoEquipo returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='EvaluarArquitecto'
			{
				$current = grammarAccess.getTipoEquipoAccess().getEvaluarArquitectoEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTipoEquipoAccess().getEvaluarArquitectoEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='EvaluarDirector'
			{
				$current = grammarAccess.getTipoEquipoAccess().getEvaluarDirectorEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTipoEquipoAccess().getEvaluarDirectorEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='EvaluarEducacion'
			{
				$current = grammarAccess.getTipoEquipoAccess().getEvaluarEducacionEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTipoEquipoAccess().getEvaluarEducacionEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule TipoPropuesta
ruleTipoPropuesta returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='EvaluarProblema'
			{
				$current = grammarAccess.getTipoPropuestaAccess().getEvaluarProblemaEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTipoPropuestaAccess().getEvaluarProblemaEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='EvaluarTecnica'
			{
				$current = grammarAccess.getTipoPropuestaAccess().getEvaluarTecnicaEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTipoPropuestaAccess().getEvaluarTecnicaEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='EvaluarOtros'
			{
				$current = grammarAccess.getTipoPropuestaAccess().getEvaluarOtrosEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTipoPropuestaAccess().getEvaluarOtrosEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule E_Calificacion
ruleE_Calificacion returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='A'
			{
				$current = grammarAccess.getE_CalificacionAccess().getAltoEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getE_CalificacionAccess().getAltoEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='M'
			{
				$current = grammarAccess.getE_CalificacionAccess().getMedioEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getE_CalificacionAccess().getMedioEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='B'
			{
				$current = grammarAccess.getE_CalificacionAccess().getBajoEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getE_CalificacionAccess().getBajoEnumLiteralDeclaration_2());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
