/*
 * generated by Xtext 2.25.0
 */
grammar InternalEvaluacion;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package hwo.evtool.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package hwo.evtool.dsl.parser.antlr.internal;

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
import hwo.evtool.dsl.services.EvaluacionGrammarAccess;

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
							"hwo.evtool.dsl.Evaluacion.Evento");
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
						newCompositeNode(grammarAccess.getMaquinaEstadosAccess().getCommandsEvaluacionesParserRuleCall_3_1_0());
					}
					lv_commands_6_0=ruleEvaluaciones
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMaquinaEstadosRule());
						}
						add(
							$current,
							"commands",
							lv_commands_6_0,
							"hwo.evtool.dsl.Evaluacion.Evaluaciones");
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
						"hwo.evtool.dsl.Evaluacion.Componente");
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
						newLeafNode(otherlv_4, grammarAccess.getComponenteAccess().getActionsEvaluacionesCrossReference_2_2_0());
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
						"hwo.evtool.dsl.Evaluacion.Transicion");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleEvaluaciones
entryRuleEvaluaciones returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEvaluacionesRule()); }
	iv_ruleEvaluaciones=ruleEvaluaciones
	{ $current=$iv_ruleEvaluaciones.current; }
	EOF;

// Rule Evaluaciones
ruleEvaluaciones returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getEvaluacionesAccess().getTipoTipoEvaluacionEnumRuleCall_0_0());
				}
				lv_tipo_0_0=ruleTipoEvaluacion
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEvaluacionesRule());
					}
					set(
						$current,
						"tipo",
						lv_tipo_0_0,
						"hwo.evtool.dsl.Evaluacion.TipoEvaluacion");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEvaluacionesAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEvaluacionesRule());
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
			(
				{
					newCompositeNode(grammarAccess.getEvaluacionesAccess().getExpresionExpresionParserRuleCall_2_0());
				}
				lv_expresion_2_0=ruleExpresion
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEvaluacionesRule());
					}
					set(
						$current,
						"expresion",
						lv_expresion_2_0,
						"hwo.evtool.dsl.Evaluacion.Expresion");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3=':'
			{
				newLeafNode(otherlv_3, grammarAccess.getEvaluacionesAccess().getColonKeyword_3_0());
			}
			(
				(
					lv_comentario_4_0=RULE_STRING
					{
						newLeafNode(lv_comentario_4_0, grammarAccess.getEvaluacionesAccess().getComentarioSTRINGTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEvaluacionesRule());
						}
						setWithLastConsumed(
							$current,
							"comentario",
							lv_comentario_4_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
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
					$current = forceCreateModelElement(
						grammarAccess.getExpresionAccess().getCalificarPropuestaAction_0_0(),
						$current);
				}
			)
			otherlv_1='calificacion'
			{
				newLeafNode(otherlv_1, grammarAccess.getExpresionAccess().getCalificacionKeyword_0_1());
			}
			otherlv_2=':'
			{
				newLeafNode(otherlv_2, grammarAccess.getExpresionAccess().getColonKeyword_0_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExpresionAccess().getPuntuacionE_CalificacionEnumRuleCall_0_3_0());
					}
					lv_puntuacion_3_0=ruleE_Calificacion
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExpresionRule());
						}
						set(
							$current,
							"puntuacion",
							lv_puntuacion_3_0,
							"hwo.evtool.dsl.Evaluacion.E_Calificacion");
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
						grammarAccess.getExpresionAccess().getCalificarEquipoAction_1_0(),
						$current);
				}
			)
			otherlv_5='calificacion'
			{
				newLeafNode(otherlv_5, grammarAccess.getExpresionAccess().getCalificacionKeyword_1_1());
			}
			otherlv_6=':'
			{
				newLeafNode(otherlv_6, grammarAccess.getExpresionAccess().getColonKeyword_1_2());
			}
			(
				(
					lv_numerador_7_0=RULE_INT
					{
						newLeafNode(lv_numerador_7_0, grammarAccess.getExpresionAccess().getNumeradorINTTerminalRuleCall_1_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getExpresionRule());
						}
						setWithLastConsumed(
							$current,
							"numerador",
							lv_numerador_7_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
			otherlv_8='/'
			{
				newLeafNode(otherlv_8, grammarAccess.getExpresionAccess().getSolidusKeyword_1_4());
			}
			(
				(
					lv_denominador_9_0=RULE_INT
					{
						newLeafNode(lv_denominador_9_0, grammarAccess.getExpresionAccess().getDenominadorINTTerminalRuleCall_1_5_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getExpresionRule());
						}
						setWithLastConsumed(
							$current,
							"denominador",
							lv_denominador_9_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getExpresionAccess().getCalificarOtrosAction_2_0(),
						$current);
				}
			)
			otherlv_11='calificacion'
			{
				newLeafNode(otherlv_11, grammarAccess.getExpresionAccess().getCalificacionKeyword_2_1());
			}
			otherlv_12=':'
			{
				newLeafNode(otherlv_12, grammarAccess.getExpresionAccess().getColonKeyword_2_2());
			}
			(
				(
					lv_valor_13_0=RULE_INT
					{
						newLeafNode(lv_valor_13_0, grammarAccess.getExpresionAccess().getValorINTTerminalRuleCall_2_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getExpresionRule());
						}
						setWithLastConsumed(
							$current,
							"valor",
							lv_valor_13_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
			(
				otherlv_14='comentario'
				{
					newLeafNode(otherlv_14, grammarAccess.getExpresionAccess().getComentarioKeyword_2_4_0());
				}
				otherlv_15=':'
				{
					newLeafNode(otherlv_15, grammarAccess.getExpresionAccess().getColonKeyword_2_4_1());
				}
				(
					(
						lv_comentario_16_0=RULE_STRING
						{
							newLeafNode(lv_comentario_16_0, grammarAccess.getExpresionAccess().getComentarioSTRINGTerminalRuleCall_2_4_2_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getExpresionRule());
							}
							setWithLastConsumed(
								$current,
								"comentario",
								lv_comentario_16_0,
								"org.eclipse.xtext.common.Terminals.STRING");
						}
					)
				)
			)?
		)
	)
;

// Rule TipoEvaluacion
ruleTipoEvaluacion returns [Enumerator current=null]
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
				$current = grammarAccess.getTipoEvaluacionAccess().getEvaluarProblemaEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTipoEvaluacionAccess().getEvaluarProblemaEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='EvaluarTecnica'
			{
				$current = grammarAccess.getTipoEvaluacionAccess().getEvaluarTecnicaEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTipoEvaluacionAccess().getEvaluarTecnicaEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='EvaluarOtros'
			{
				$current = grammarAccess.getTipoEvaluacionAccess().getEvaluarOtrosEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTipoEvaluacionAccess().getEvaluarOtrosEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='D'
			{
				$current = grammarAccess.getTipoEvaluacionAccess().getEvaluarArquitectoEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getTipoEvaluacionAccess().getEvaluarArquitectoEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='EvaluarDirector'
			{
				$current = grammarAccess.getTipoEvaluacionAccess().getEvaluarDirectorEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getTipoEvaluacionAccess().getEvaluarDirectorEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='EvaluarEducacion'
			{
				$current = grammarAccess.getTipoEvaluacionAccess().getEvaluarEducacionEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getTipoEvaluacionAccess().getEvaluarEducacionEnumLiteralDeclaration_5());
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
