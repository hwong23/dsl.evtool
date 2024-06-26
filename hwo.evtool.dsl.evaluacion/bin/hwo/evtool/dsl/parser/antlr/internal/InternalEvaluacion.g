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
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getEvaluacionesAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEvaluacionesRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getEvaluacionesAccess().getEqualsSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEvaluacionesAccess().getArgumentoAtomoParserRuleCall_2_0());
				}
				lv_argumento_2_0=ruleAtomo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEvaluacionesRule());
					}
					set(
						$current,
						"argumento",
						lv_argumento_2_0,
						"hwo.evtool.dsl.Evaluacion.Atomo");
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

// Entry rule entryRuleAtomo
entryRuleAtomo returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAtomoRule()); }
	iv_ruleAtomo=ruleAtomo
	{ $current=$iv_ruleAtomo.current; }
	EOF;

// Rule Atomo
ruleAtomo returns [EObject current=null]
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
						grammarAccess.getAtomoAccess().getIntConstantAction_0_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getAtomoAccess().getValorPuntuacionParserRuleCall_0_1_0());
					}
					lv_valor_1_0=rulePuntuacion
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAtomoRule());
						}
						set(
							$current,
							"valor",
							lv_valor_1_0,
							"hwo.evtool.dsl.Evaluacion.Puntuacion");
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
						grammarAccess.getAtomoAccess().getStringConstantAction_1_0(),
						$current);
				}
			)
			(
				(
					lv_valor_3_0=RULE_STRING
					{
						newLeafNode(lv_valor_3_0, grammarAccess.getAtomoAccess().getValorSTRINGTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAtomoRule());
						}
						setWithLastConsumed(
							$current,
							"valor",
							lv_valor_3_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getAtomoAccess().getSiNoConstantAction_2_0(),
						$current);
				}
			)
			(
				(
					(
						lv_valor_5_1='S'
						{
							newLeafNode(lv_valor_5_1, grammarAccess.getAtomoAccess().getValorSKeyword_2_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAtomoRule());
							}
							setWithLastConsumed($current, "valor", lv_valor_5_1, null);
						}
						    |
						lv_valor_5_2='N'
						{
							newLeafNode(lv_valor_5_2, grammarAccess.getAtomoAccess().getValorNKeyword_2_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAtomoRule());
							}
							setWithLastConsumed($current, "valor", lv_valor_5_2, null);
						}
					)
				)
			)
		)
	)
;

// Entry rule entryRulePuntuacion
entryRulePuntuacion returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPuntuacionRule()); }
	iv_rulePuntuacion=rulePuntuacion
	{ $current=$iv_rulePuntuacion.current; }
	EOF;

// Rule Puntuacion
rulePuntuacion returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_nota_0_0=RULE_INT
				{
					newLeafNode(lv_nota_0_0, grammarAccess.getPuntuacionAccess().getNotaINTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPuntuacionRule());
					}
					setWithLastConsumed(
						$current,
						"nota",
						lv_nota_0_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_1='/'
		{
			newLeafNode(otherlv_1, grammarAccess.getPuntuacionAccess().getSolidusKeyword_1());
		}
		(
			(
				lv_calificacion_2_0=RULE_INT
				{
					newLeafNode(lv_calificacion_2_0, grammarAccess.getPuntuacionAccess().getCalificacionINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPuntuacionRule());
					}
					setWithLastConsumed(
						$current,
						"calificacion",
						lv_calificacion_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
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

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
