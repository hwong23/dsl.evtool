/*
 * generated by Xtext 2.25.0
 */
package hwo.evtool.dsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class EvaluacionGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class EvaluacionModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "hwo.evtool.dsl.Evaluacion.EvaluacionModel");
		private final Assignment cComponentesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cComponentesCmpntEvaluacionParserRuleCall_0 = (RuleCall)cComponentesAssignment.eContents().get(0);
		
		//EvaluacionModel:
		//    componentes+=CmpntEvaluacion*;
		@Override public ParserRule getRule() { return rule; }
		
		//componentes+=CmpntEvaluacion*
		public Assignment getComponentesAssignment() { return cComponentesAssignment; }
		
		//CmpntEvaluacion
		public RuleCall getComponentesCmpntEvaluacionParserRuleCall_0() { return cComponentesCmpntEvaluacionParserRuleCall_0; }
	}
	public class CmpntEvaluacionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "hwo.evtool.dsl.Evaluacion.CmpntEvaluacion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cComponenteKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cHeredaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cSuperTypeAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cSuperTypeCmpntEvaluacionCrossReference_2_1_0 = (CrossReference)cSuperTypeAssignment_2_1.eContents().get(0);
		private final RuleCall cSuperTypeCmpntEvaluacionIDTerminalRuleCall_2_1_0_1 = (RuleCall)cSuperTypeCmpntEvaluacionCrossReference_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cAtributosAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAtributosCriterioParserRuleCall_4_0 = (RuleCall)cAtributosAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//CmpntEvaluacion:
		//    'componente' name = ID ('hereda' superType=[CmpntEvaluacion])? '{'
		//        atributos+=Criterio*
		//    '}'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'componente' name = ID ('hereda' superType=[CmpntEvaluacion])? '{'
		//    atributos+=Criterio*
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'componente'
		public Keyword getComponenteKeyword_0() { return cComponenteKeyword_0; }
		
		//name = ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('hereda' superType=[CmpntEvaluacion])?
		public Group getGroup_2() { return cGroup_2; }
		
		//'hereda'
		public Keyword getHeredaKeyword_2_0() { return cHeredaKeyword_2_0; }
		
		//superType=[CmpntEvaluacion]
		public Assignment getSuperTypeAssignment_2_1() { return cSuperTypeAssignment_2_1; }
		
		//[CmpntEvaluacion]
		public CrossReference getSuperTypeCmpntEvaluacionCrossReference_2_1_0() { return cSuperTypeCmpntEvaluacionCrossReference_2_1_0; }
		
		//ID
		public RuleCall getSuperTypeCmpntEvaluacionIDTerminalRuleCall_2_1_0_1() { return cSuperTypeCmpntEvaluacionIDTerminalRuleCall_2_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//atributos+=Criterio*
		public Assignment getAtributosAssignment_4() { return cAtributosAssignment_4; }
		
		//Criterio
		public RuleCall getAtributosCriterioParserRuleCall_4_0() { return cAtributosCriterioParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class CriterioElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "hwo.evtool.dsl.Evaluacion.Criterio");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cCriterioComplejoTypeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cCriterioKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cNameAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_1_0 = (RuleCall)cNameAssignment_1_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Assignment cExpresionAssignment_1_3 = (Assignment)cGroup_1.eContents().get(3);
		private final RuleCall cExpresionExpresionParserRuleCall_1_3_0 = (RuleCall)cExpresionAssignment_1_3.eContents().get(0);
		private final Group cGroup_1_4 = (Group)cGroup_1.eContents().get(4);
		private final Keyword cColonKeyword_1_4_0 = (Keyword)cGroup_1_4.eContents().get(0);
		private final Assignment cSoporteAssignment_1_4_1 = (Assignment)cGroup_1_4.eContents().get(1);
		private final RuleCall cSoporteExpresionParserRuleCall_1_4_1_0 = (RuleCall)cSoporteAssignment_1_4_1.eContents().get(0);
		
		//Criterio:
		//    CriterioComplejoType |
		//    'criterio' name = ID
		//    '=' expresion = Expresion
		//    (':' soporte = Expresion)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//CriterioComplejoType |
		//'criterio' name = ID
		//'=' expresion = Expresion
		//(':' soporte = Expresion)?
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//CriterioComplejoType
		public RuleCall getCriterioComplejoTypeParserRuleCall_0() { return cCriterioComplejoTypeParserRuleCall_0; }
		
		//'criterio' name = ID
		//'=' expresion = Expresion
		//(':' soporte = Expresion)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'criterio'
		public Keyword getCriterioKeyword_1_0() { return cCriterioKeyword_1_0; }
		
		//name = ID
		public Assignment getNameAssignment_1_1() { return cNameAssignment_1_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_1_0() { return cNameIDTerminalRuleCall_1_1_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_1_2() { return cEqualsSignKeyword_1_2; }
		
		//expresion = Expresion
		public Assignment getExpresionAssignment_1_3() { return cExpresionAssignment_1_3; }
		
		//Expresion
		public RuleCall getExpresionExpresionParserRuleCall_1_3_0() { return cExpresionExpresionParserRuleCall_1_3_0; }
		
		//(':' soporte = Expresion)?
		public Group getGroup_1_4() { return cGroup_1_4; }
		
		//':'
		public Keyword getColonKeyword_1_4_0() { return cColonKeyword_1_4_0; }
		
		//soporte = Expresion
		public Assignment getSoporteAssignment_1_4_1() { return cSoporteAssignment_1_4_1; }
		
		//Expresion
		public RuleCall getSoporteExpresionParserRuleCall_1_4_1_0() { return cSoporteExpresionParserRuleCall_1_4_1_0; }
	}
	public class ExpresionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "hwo.evtool.dsl.Evaluacion.Expresion");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cIntConstantAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Assignment cValorAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cValorINTTerminalRuleCall_0_1_0 = (RuleCall)cValorAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cStringConstantAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cValorAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cValorSTRINGTerminalRuleCall_1_1_0 = (RuleCall)cValorAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Action cBoolConstantAction_2_0 = (Action)cGroup_2.eContents().get(0);
		private final Assignment cValorAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final Alternatives cValorAlternatives_2_1_0 = (Alternatives)cValorAssignment_2_1.eContents().get(0);
		private final Keyword cValorSKeyword_2_1_0_0 = (Keyword)cValorAlternatives_2_1_0.eContents().get(0);
		private final Keyword cValorNKeyword_2_1_0_1 = (Keyword)cValorAlternatives_2_1_0.eContents().get(1);
		
		//Expresion:
		//    {IntConstant} valor=INT |
		//    {StringConstant} valor=STRING |
		//    {BoolConstant} valor= ('S' | 'N')
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{IntConstant} valor=INT |
		//{StringConstant} valor=STRING |
		//{BoolConstant} valor= ('S' | 'N')
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{IntConstant} valor=INT
		public Group getGroup_0() { return cGroup_0; }
		
		//{IntConstant}
		public Action getIntConstantAction_0_0() { return cIntConstantAction_0_0; }
		
		//valor=INT
		public Assignment getValorAssignment_0_1() { return cValorAssignment_0_1; }
		
		//INT
		public RuleCall getValorINTTerminalRuleCall_0_1_0() { return cValorINTTerminalRuleCall_0_1_0; }
		
		//{StringConstant} valor=STRING
		public Group getGroup_1() { return cGroup_1; }
		
		//{StringConstant}
		public Action getStringConstantAction_1_0() { return cStringConstantAction_1_0; }
		
		//valor=STRING
		public Assignment getValorAssignment_1_1() { return cValorAssignment_1_1; }
		
		//STRING
		public RuleCall getValorSTRINGTerminalRuleCall_1_1_0() { return cValorSTRINGTerminalRuleCall_1_1_0; }
		
		//{BoolConstant} valor= ('S' | 'N')
		public Group getGroup_2() { return cGroup_2; }
		
		//{BoolConstant}
		public Action getBoolConstantAction_2_0() { return cBoolConstantAction_2_0; }
		
		//valor= ('S' | 'N')
		public Assignment getValorAssignment_2_1() { return cValorAssignment_2_1; }
		
		//('S' | 'N')
		public Alternatives getValorAlternatives_2_1_0() { return cValorAlternatives_2_1_0; }
		
		//'S'
		public Keyword getValorSKeyword_2_1_0_0() { return cValorSKeyword_2_1_0_0; }
		
		//'N'
		public Keyword getValorNKeyword_2_1_0_1() { return cValorNKeyword_2_1_0_1; }
	}
	public class CriterioComplejoTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "hwo.evtool.dsl.Evaluacion.CriterioComplejoType");
		private final Assignment cComponenteAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cComponenteCmpntEvaluacionCrossReference_0 = (CrossReference)cComponenteAssignment.eContents().get(0);
		private final RuleCall cComponenteCmpntEvaluacionIDTerminalRuleCall_0_1 = (RuleCall)cComponenteCmpntEvaluacionCrossReference_0.eContents().get(1);
		
		//CriterioComplejoType:
		//    componente = [CmpntEvaluacion];
		@Override public ParserRule getRule() { return rule; }
		
		//componente = [CmpntEvaluacion]
		public Assignment getComponenteAssignment() { return cComponenteAssignment; }
		
		//[CmpntEvaluacion]
		public CrossReference getComponenteCmpntEvaluacionCrossReference_0() { return cComponenteCmpntEvaluacionCrossReference_0; }
		
		//ID
		public RuleCall getComponenteCmpntEvaluacionIDTerminalRuleCall_0_1() { return cComponenteCmpntEvaluacionIDTerminalRuleCall_0_1; }
	}
	
	
	private final EvaluacionModelElements pEvaluacionModel;
	private final CmpntEvaluacionElements pCmpntEvaluacion;
	private final CriterioElements pCriterio;
	private final ExpresionElements pExpresion;
	private final CriterioComplejoTypeElements pCriterioComplejoType;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public EvaluacionGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pEvaluacionModel = new EvaluacionModelElements();
		this.pCmpntEvaluacion = new CmpntEvaluacionElements();
		this.pCriterio = new CriterioElements();
		this.pExpresion = new ExpresionElements();
		this.pCriterioComplejoType = new CriterioComplejoTypeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("hwo.evtool.dsl.Evaluacion".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//EvaluacionModel:
	//    componentes+=CmpntEvaluacion*;
	public EvaluacionModelElements getEvaluacionModelAccess() {
		return pEvaluacionModel;
	}
	
	public ParserRule getEvaluacionModelRule() {
		return getEvaluacionModelAccess().getRule();
	}
	
	//CmpntEvaluacion:
	//    'componente' name = ID ('hereda' superType=[CmpntEvaluacion])? '{'
	//        atributos+=Criterio*
	//    '}'
	//;
	public CmpntEvaluacionElements getCmpntEvaluacionAccess() {
		return pCmpntEvaluacion;
	}
	
	public ParserRule getCmpntEvaluacionRule() {
		return getCmpntEvaluacionAccess().getRule();
	}
	
	//Criterio:
	//    CriterioComplejoType |
	//    'criterio' name = ID
	//    '=' expresion = Expresion
	//    (':' soporte = Expresion)?
	//;
	public CriterioElements getCriterioAccess() {
		return pCriterio;
	}
	
	public ParserRule getCriterioRule() {
		return getCriterioAccess().getRule();
	}
	
	//Expresion:
	//    {IntConstant} valor=INT |
	//    {StringConstant} valor=STRING |
	//    {BoolConstant} valor= ('S' | 'N')
	//;
	public ExpresionElements getExpresionAccess() {
		return pExpresion;
	}
	
	public ParserRule getExpresionRule() {
		return getExpresionAccess().getRule();
	}
	
	//CriterioComplejoType:
	//    componente = [CmpntEvaluacion];
	public CriterioComplejoTypeElements getCriterioComplejoTypeAccess() {
		return pCriterioComplejoType;
	}
	
	public ParserRule getCriterioComplejoTypeRule() {
		return getCriterioComplejoTypeAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
