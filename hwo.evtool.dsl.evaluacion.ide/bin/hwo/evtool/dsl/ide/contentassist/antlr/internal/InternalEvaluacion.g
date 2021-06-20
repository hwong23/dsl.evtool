/*
 * generated by Xtext 2.25.0
 */
grammar InternalEvaluacion;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package hwo.evtool.dsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package hwo.evtool.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import hwo.evtool.dsl.services.EvaluacionGrammarAccess;

}
@parser::members {
	private EvaluacionGrammarAccess grammarAccess;

	public void setGrammarAccess(EvaluacionGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleEvaluacionModel
entryRuleEvaluacionModel
:
{ before(grammarAccess.getEvaluacionModelRule()); }
	 ruleEvaluacionModel
{ after(grammarAccess.getEvaluacionModelRule()); } 
	 EOF 
;

// Rule EvaluacionModel
ruleEvaluacionModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEvaluacionModelAccess().getEntitiesAssignment()); }
		(rule__EvaluacionModel__EntitiesAssignment)*
		{ after(grammarAccess.getEvaluacionModelAccess().getEntitiesAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCmpntEvaluacion
entryRuleCmpntEvaluacion
:
{ before(grammarAccess.getCmpntEvaluacionRule()); }
	 ruleCmpntEvaluacion
{ after(grammarAccess.getCmpntEvaluacionRule()); } 
	 EOF 
;

// Rule CmpntEvaluacion
ruleCmpntEvaluacion 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCmpntEvaluacionAccess().getGroup()); }
		(rule__CmpntEvaluacion__Group__0)
		{ after(grammarAccess.getCmpntEvaluacionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCriterio
entryRuleCriterio
:
{ before(grammarAccess.getCriterioRule()); }
	 ruleCriterio
{ after(grammarAccess.getCriterioRule()); } 
	 EOF 
;

// Rule Criterio
ruleCriterio 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCriterioAccess().getAlternatives()); }
		(rule__Criterio__Alternatives)
		{ after(grammarAccess.getCriterioAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCriterioSimpleType
entryRuleCriterioSimpleType
:
{ before(grammarAccess.getCriterioSimpleTypeRule()); }
	 ruleCriterioSimpleType
{ after(grammarAccess.getCriterioSimpleTypeRule()); } 
	 EOF 
;

// Rule CriterioSimpleType
ruleCriterioSimpleType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCriterioSimpleTypeAccess().getGroup()); }
		(rule__CriterioSimpleType__Group__0)
		{ after(grammarAccess.getCriterioSimpleTypeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExpresion
entryRuleExpresion
:
{ before(grammarAccess.getExpresionRule()); }
	 ruleExpresion
{ after(grammarAccess.getExpresionRule()); } 
	 EOF 
;

// Rule Expresion
ruleExpresion 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpresionAccess().getAtomoParserRuleCall()); }
		ruleAtomo
		{ after(grammarAccess.getExpresionAccess().getAtomoParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAtomo
entryRuleAtomo
:
{ before(grammarAccess.getAtomoRule()); }
	 ruleAtomo
{ after(grammarAccess.getAtomoRule()); } 
	 EOF 
;

// Rule Atomo
ruleAtomo 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAtomoAccess().getAlternatives()); }
		(rule__Atomo__Alternatives)
		{ after(grammarAccess.getAtomoAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCriterioComplejoType
entryRuleCriterioComplejoType
:
{ before(grammarAccess.getCriterioComplejoTypeRule()); }
	 ruleCriterioComplejoType
{ after(grammarAccess.getCriterioComplejoTypeRule()); } 
	 EOF 
;

// Rule CriterioComplejoType
ruleCriterioComplejoType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCriterioComplejoTypeAccess().getComponenteAssignment()); }
		(rule__CriterioComplejoType__ComponenteAssignment)
		{ after(grammarAccess.getCriterioComplejoTypeAccess().getComponenteAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Criterio__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCriterioAccess().getCriterioComplejoTypeParserRuleCall_0()); }
		ruleCriterioComplejoType
		{ after(grammarAccess.getCriterioAccess().getCriterioComplejoTypeParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getCriterioAccess().getCriterioSimpleTypeParserRuleCall_1()); }
		ruleCriterioSimpleType
		{ after(grammarAccess.getCriterioAccess().getCriterioSimpleTypeParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomo__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomoAccess().getGroup_0()); }
		(rule__Atomo__Group_0__0)
		{ after(grammarAccess.getAtomoAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getAtomoAccess().getGroup_1()); }
		(rule__Atomo__Group_1__0)
		{ after(grammarAccess.getAtomoAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getAtomoAccess().getGroup_2()); }
		(rule__Atomo__Group_2__0)
		{ after(grammarAccess.getAtomoAccess().getGroup_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomo__ValorAlternatives_2_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomoAccess().getValorSKeyword_2_1_0_0()); }
		'S'
		{ after(grammarAccess.getAtomoAccess().getValorSKeyword_2_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getAtomoAccess().getValorNKeyword_2_1_0_1()); }
		'N'
		{ after(grammarAccess.getAtomoAccess().getValorNKeyword_2_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CmpntEvaluacion__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CmpntEvaluacion__Group__0__Impl
	rule__CmpntEvaluacion__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CmpntEvaluacion__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCmpntEvaluacionAccess().getComponenteKeyword_0()); }
	'componente'
	{ after(grammarAccess.getCmpntEvaluacionAccess().getComponenteKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CmpntEvaluacion__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CmpntEvaluacion__Group__1__Impl
	rule__CmpntEvaluacion__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CmpntEvaluacion__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCmpntEvaluacionAccess().getNameAssignment_1()); }
	(rule__CmpntEvaluacion__NameAssignment_1)
	{ after(grammarAccess.getCmpntEvaluacionAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CmpntEvaluacion__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CmpntEvaluacion__Group__2__Impl
	rule__CmpntEvaluacion__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__CmpntEvaluacion__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCmpntEvaluacionAccess().getGroup_2()); }
	(rule__CmpntEvaluacion__Group_2__0)?
	{ after(grammarAccess.getCmpntEvaluacionAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CmpntEvaluacion__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CmpntEvaluacion__Group__3__Impl
	rule__CmpntEvaluacion__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__CmpntEvaluacion__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCmpntEvaluacionAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getCmpntEvaluacionAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CmpntEvaluacion__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CmpntEvaluacion__Group__4__Impl
	rule__CmpntEvaluacion__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__CmpntEvaluacion__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCmpntEvaluacionAccess().getAttributesAssignment_4()); }
	(rule__CmpntEvaluacion__AttributesAssignment_4)*
	{ after(grammarAccess.getCmpntEvaluacionAccess().getAttributesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CmpntEvaluacion__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CmpntEvaluacion__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CmpntEvaluacion__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCmpntEvaluacionAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getCmpntEvaluacionAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CmpntEvaluacion__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CmpntEvaluacion__Group_2__0__Impl
	rule__CmpntEvaluacion__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CmpntEvaluacion__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCmpntEvaluacionAccess().getHeredaKeyword_2_0()); }
	'hereda'
	{ after(grammarAccess.getCmpntEvaluacionAccess().getHeredaKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CmpntEvaluacion__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CmpntEvaluacion__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CmpntEvaluacion__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCmpntEvaluacionAccess().getSuperTypeAssignment_2_1()); }
	(rule__CmpntEvaluacion__SuperTypeAssignment_2_1)
	{ after(grammarAccess.getCmpntEvaluacionAccess().getSuperTypeAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CriterioSimpleType__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CriterioSimpleType__Group__0__Impl
	rule__CriterioSimpleType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CriterioSimpleType__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCriterioSimpleTypeAccess().getCriterioKeyword_0()); }
	'criterio'
	{ after(grammarAccess.getCriterioSimpleTypeAccess().getCriterioKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CriterioSimpleType__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CriterioSimpleType__Group__1__Impl
	rule__CriterioSimpleType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CriterioSimpleType__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCriterioSimpleTypeAccess().getNameAssignment_1()); }
	(rule__CriterioSimpleType__NameAssignment_1)
	{ after(grammarAccess.getCriterioSimpleTypeAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CriterioSimpleType__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CriterioSimpleType__Group__2__Impl
	rule__CriterioSimpleType__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__CriterioSimpleType__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCriterioSimpleTypeAccess().getEqualsSignKeyword_2()); }
	'='
	{ after(grammarAccess.getCriterioSimpleTypeAccess().getEqualsSignKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CriterioSimpleType__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CriterioSimpleType__Group__3__Impl
	rule__CriterioSimpleType__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__CriterioSimpleType__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCriterioSimpleTypeAccess().getExpresionAssignment_3()); }
	(rule__CriterioSimpleType__ExpresionAssignment_3)
	{ after(grammarAccess.getCriterioSimpleTypeAccess().getExpresionAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CriterioSimpleType__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CriterioSimpleType__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CriterioSimpleType__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCriterioSimpleTypeAccess().getGroup_4()); }
	(rule__CriterioSimpleType__Group_4__0)?
	{ after(grammarAccess.getCriterioSimpleTypeAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CriterioSimpleType__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CriterioSimpleType__Group_4__0__Impl
	rule__CriterioSimpleType__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CriterioSimpleType__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCriterioSimpleTypeAccess().getColonKeyword_4_0()); }
	':'
	{ after(grammarAccess.getCriterioSimpleTypeAccess().getColonKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CriterioSimpleType__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CriterioSimpleType__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CriterioSimpleType__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCriterioSimpleTypeAccess().getSoporteAssignment_4_1()); }
	(rule__CriterioSimpleType__SoporteAssignment_4_1)
	{ after(grammarAccess.getCriterioSimpleTypeAccess().getSoporteAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Atomo__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomo__Group_0__0__Impl
	rule__Atomo__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomo__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomoAccess().getIntConstantAction_0_0()); }
	()
	{ after(grammarAccess.getAtomoAccess().getIntConstantAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomo__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomo__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomo__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomoAccess().getValorAssignment_0_1()); }
	(rule__Atomo__ValorAssignment_0_1)
	{ after(grammarAccess.getAtomoAccess().getValorAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Atomo__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomo__Group_1__0__Impl
	rule__Atomo__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomo__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomoAccess().getStringConstantAction_1_0()); }
	()
	{ after(grammarAccess.getAtomoAccess().getStringConstantAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomo__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomo__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomo__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomoAccess().getValorAssignment_1_1()); }
	(rule__Atomo__ValorAssignment_1_1)
	{ after(grammarAccess.getAtomoAccess().getValorAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Atomo__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomo__Group_2__0__Impl
	rule__Atomo__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomo__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomoAccess().getBoolConstantAction_2_0()); }
	()
	{ after(grammarAccess.getAtomoAccess().getBoolConstantAction_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomo__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomo__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomo__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomoAccess().getValorAssignment_2_1()); }
	(rule__Atomo__ValorAssignment_2_1)
	{ after(grammarAccess.getAtomoAccess().getValorAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EvaluacionModel__EntitiesAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEvaluacionModelAccess().getEntitiesCmpntEvaluacionParserRuleCall_0()); }
		ruleCmpntEvaluacion
		{ after(grammarAccess.getEvaluacionModelAccess().getEntitiesCmpntEvaluacionParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CmpntEvaluacion__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCmpntEvaluacionAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getCmpntEvaluacionAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CmpntEvaluacion__SuperTypeAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCmpntEvaluacionAccess().getSuperTypeCmpntEvaluacionCrossReference_2_1_0()); }
		(
			{ before(grammarAccess.getCmpntEvaluacionAccess().getSuperTypeCmpntEvaluacionIDTerminalRuleCall_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getCmpntEvaluacionAccess().getSuperTypeCmpntEvaluacionIDTerminalRuleCall_2_1_0_1()); }
		)
		{ after(grammarAccess.getCmpntEvaluacionAccess().getSuperTypeCmpntEvaluacionCrossReference_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CmpntEvaluacion__AttributesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCmpntEvaluacionAccess().getAttributesCriterioParserRuleCall_4_0()); }
		ruleCriterio
		{ after(grammarAccess.getCmpntEvaluacionAccess().getAttributesCriterioParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CriterioSimpleType__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCriterioSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getCriterioSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CriterioSimpleType__ExpresionAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCriterioSimpleTypeAccess().getExpresionExpresionParserRuleCall_3_0()); }
		ruleExpresion
		{ after(grammarAccess.getCriterioSimpleTypeAccess().getExpresionExpresionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CriterioSimpleType__SoporteAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCriterioSimpleTypeAccess().getSoporteExpresionParserRuleCall_4_1_0()); }
		ruleExpresion
		{ after(grammarAccess.getCriterioSimpleTypeAccess().getSoporteExpresionParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomo__ValorAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomoAccess().getValorINTTerminalRuleCall_0_1_0()); }
		RULE_INT
		{ after(grammarAccess.getAtomoAccess().getValorINTTerminalRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomo__ValorAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomoAccess().getValorSTRINGTerminalRuleCall_1_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getAtomoAccess().getValorSTRINGTerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomo__ValorAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomoAccess().getValorAlternatives_2_1_0()); }
		(rule__Atomo__ValorAlternatives_2_1_0)
		{ after(grammarAccess.getAtomoAccess().getValorAlternatives_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CriterioComplejoType__ComponenteAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCriterioComplejoTypeAccess().getComponenteCmpntEvaluacionCrossReference_0()); }
		(
			{ before(grammarAccess.getCriterioComplejoTypeAccess().getComponenteCmpntEvaluacionIDTerminalRuleCall_0_1()); }
			RULE_ID
			{ after(grammarAccess.getCriterioComplejoTypeAccess().getComponenteCmpntEvaluacionIDTerminalRuleCall_0_1()); }
		)
		{ after(grammarAccess.getCriterioComplejoTypeAccess().getComponenteCmpntEvaluacionCrossReference_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;