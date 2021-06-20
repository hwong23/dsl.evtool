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
    	return "EvaluacionModel";
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

// Entry rule entryRuleEvaluacionModel
entryRuleEvaluacionModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEvaluacionModelRule()); }
	iv_ruleEvaluacionModel=ruleEvaluacionModel
	{ $current=$iv_ruleEvaluacionModel.current; }
	EOF;

// Rule EvaluacionModel
ruleEvaluacionModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getEvaluacionModelAccess().getEntitiesCmpntEvaluacionParserRuleCall_0());
			}
			lv_entities_0_0=ruleCmpntEvaluacion
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getEvaluacionModelRule());
				}
				add(
					$current,
					"entities",
					lv_entities_0_0,
					"hwo.evtool.dsl.Evaluacion.CmpntEvaluacion");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleCmpntEvaluacion
entryRuleCmpntEvaluacion returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCmpntEvaluacionRule()); }
	iv_ruleCmpntEvaluacion=ruleCmpntEvaluacion
	{ $current=$iv_ruleCmpntEvaluacion.current; }
	EOF;

// Rule CmpntEvaluacion
ruleCmpntEvaluacion returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='componente'
		{
			newLeafNode(otherlv_0, grammarAccess.getCmpntEvaluacionAccess().getComponenteKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getCmpntEvaluacionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCmpntEvaluacionRule());
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
			otherlv_2='hereda'
			{
				newLeafNode(otherlv_2, grammarAccess.getCmpntEvaluacionAccess().getHeredaKeyword_2_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCmpntEvaluacionRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getCmpntEvaluacionAccess().getSuperTypeCmpntEvaluacionCrossReference_2_1_0());
					}
				)
			)
		)?
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getCmpntEvaluacionAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCmpntEvaluacionAccess().getAttributesCriterioParserRuleCall_4_0());
				}
				lv_attributes_5_0=ruleCriterio
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCmpntEvaluacionRule());
					}
					add(
						$current,
						"attributes",
						lv_attributes_5_0,
						"hwo.evtool.dsl.Evaluacion.Criterio");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getCmpntEvaluacionAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleCriterio
entryRuleCriterio returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCriterioRule()); }
	iv_ruleCriterio=ruleCriterio
	{ $current=$iv_ruleCriterio.current; }
	EOF;

// Rule Criterio
ruleCriterio returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getCriterioAccess().getCriterioComplejoTypeParserRuleCall_0());
		}
		this_CriterioComplejoType_0=ruleCriterioComplejoType
		{
			$current = $this_CriterioComplejoType_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCriterioAccess().getCriterioSimpleTypeParserRuleCall_1());
		}
		this_CriterioSimpleType_1=ruleCriterioSimpleType
		{
			$current = $this_CriterioSimpleType_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleCriterioSimpleType
entryRuleCriterioSimpleType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCriterioSimpleTypeRule()); }
	iv_ruleCriterioSimpleType=ruleCriterioSimpleType
	{ $current=$iv_ruleCriterioSimpleType.current; }
	EOF;

// Rule CriterioSimpleType
ruleCriterioSimpleType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='criterio'
		{
			newLeafNode(otherlv_0, grammarAccess.getCriterioSimpleTypeAccess().getCriterioKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getCriterioSimpleTypeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCriterioSimpleTypeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='='
		{
			newLeafNode(otherlv_2, grammarAccess.getCriterioSimpleTypeAccess().getEqualsSignKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCriterioSimpleTypeAccess().getExpresionExpresionParserRuleCall_3_0());
				}
				lv_expresion_3_0=ruleExpresion
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCriterioSimpleTypeRule());
					}
					set(
						$current,
						"expresion",
						lv_expresion_3_0,
						"hwo.evtool.dsl.Evaluacion.Expresion");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4=':'
			{
				newLeafNode(otherlv_4, grammarAccess.getCriterioSimpleTypeAccess().getColonKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCriterioSimpleTypeAccess().getSoporteExpresionParserRuleCall_4_1_0());
					}
					lv_soporte_5_0=ruleExpresion
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCriterioSimpleTypeRule());
						}
						set(
							$current,
							"soporte",
							lv_soporte_5_0,
							"hwo.evtool.dsl.Evaluacion.Expresion");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
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
	{
		newCompositeNode(grammarAccess.getExpresionAccess().getAtomoParserRuleCall());
	}
	this_Atomo_0=ruleAtomo
	{
		$current = $this_Atomo_0.current;
		afterParserOrEnumRuleCall();
	}
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
					lv_valor_1_0=RULE_INT
					{
						newLeafNode(lv_valor_1_0, grammarAccess.getAtomoAccess().getValorINTTerminalRuleCall_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAtomoRule());
						}
						setWithLastConsumed(
							$current,
							"valor",
							lv_valor_1_0,
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
						grammarAccess.getAtomoAccess().getBoolConstantAction_2_0(),
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

// Entry rule entryRuleCriterioComplejoType
entryRuleCriterioComplejoType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCriterioComplejoTypeRule()); }
	iv_ruleCriterioComplejoType=ruleCriterioComplejoType
	{ $current=$iv_ruleCriterioComplejoType.current; }
	EOF;

// Rule CriterioComplejoType
ruleCriterioComplejoType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getCriterioComplejoTypeRule());
				}
			}
			otherlv_0=RULE_ID
			{
				newLeafNode(otherlv_0, grammarAccess.getCriterioComplejoTypeAccess().getComponenteCmpntEvaluacionCrossReference_0());
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
