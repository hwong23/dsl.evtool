/*
 * generated by Xtext 2.24.0
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

// Entry rule entryRuleMaquinaEstados
entryRuleMaquinaEstados
:
{ before(grammarAccess.getMaquinaEstadosRule()); }
	 ruleMaquinaEstados
{ after(grammarAccess.getMaquinaEstadosRule()); } 
	 EOF 
;

// Rule MaquinaEstados
ruleMaquinaEstados 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMaquinaEstadosAccess().getGroup()); }
		(rule__MaquinaEstados__Group__0)
		{ after(grammarAccess.getMaquinaEstadosAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEvento
entryRuleEvento
:
{ before(grammarAccess.getEventoRule()); }
	 ruleEvento
{ after(grammarAccess.getEventoRule()); } 
	 EOF 
;

// Rule Evento
ruleEvento 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEventoAccess().getGroup()); }
		(rule__Evento__Group__0)
		{ after(grammarAccess.getEventoAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComponente
entryRuleComponente
:
{ before(grammarAccess.getComponenteRule()); }
	 ruleComponente
{ after(grammarAccess.getComponenteRule()); } 
	 EOF 
;

// Rule Componente
ruleComponente 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComponenteAccess().getGroup()); }
		(rule__Componente__Group__0)
		{ after(grammarAccess.getComponenteAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEvaluaciones
entryRuleEvaluaciones
:
{ before(grammarAccess.getEvaluacionesRule()); }
	 ruleEvaluaciones
{ after(grammarAccess.getEvaluacionesRule()); } 
	 EOF 
;

// Rule Evaluaciones
ruleEvaluaciones 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEvaluacionesAccess().getGroup()); }
		(rule__Evaluaciones__Group__0)
		{ after(grammarAccess.getEvaluacionesAccess().getGroup()); }
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
		{ before(grammarAccess.getExpresionAccess().getGroup()); }
		(rule__Expresion__Group__0)
		{ after(grammarAccess.getExpresionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEvaluarEquipo
entryRuleEvaluarEquipo
:
{ before(grammarAccess.getEvaluarEquipoRule()); }
	 ruleEvaluarEquipo
{ after(grammarAccess.getEvaluarEquipoRule()); } 
	 EOF 
;

// Rule EvaluarEquipo
ruleEvaluarEquipo 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEvaluarEquipoAccess().getGroup()); }
		(rule__EvaluarEquipo__Group__0)
		{ after(grammarAccess.getEvaluarEquipoAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEvaluarPropuesta
entryRuleEvaluarPropuesta
:
{ before(grammarAccess.getEvaluarPropuestaRule()); }
	 ruleEvaluarPropuesta
{ after(grammarAccess.getEvaluarPropuestaRule()); } 
	 EOF 
;

// Rule EvaluarPropuesta
ruleEvaluarPropuesta 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEvaluarPropuestaAccess().getAlternatives()); }
		(rule__EvaluarPropuesta__Alternatives)
		{ after(grammarAccess.getEvaluarPropuestaAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTipoEvaluacion
entryRuleTipoEvaluacion
:
{ before(grammarAccess.getTipoEvaluacionRule()); }
	 ruleTipoEvaluacion
{ after(grammarAccess.getTipoEvaluacionRule()); } 
	 EOF 
;

// Rule TipoEvaluacion
ruleTipoEvaluacion 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTipoEvaluacionAccess().getAlternatives()); }
		(rule__TipoEvaluacion__Alternatives)
		{ after(grammarAccess.getTipoEvaluacionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTipoEvaluarEquipo
entryRuleTipoEvaluarEquipo
:
{ before(grammarAccess.getTipoEvaluarEquipoRule()); }
	 ruleTipoEvaluarEquipo
{ after(grammarAccess.getTipoEvaluarEquipoRule()); } 
	 EOF 
;

// Rule TipoEvaluarEquipo
ruleTipoEvaluarEquipo 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTipoEvaluarEquipoAccess().getEvaluarArquitectoKeyword()); }
		'EvaluarArquitecto'
		{ after(grammarAccess.getTipoEvaluarEquipoAccess().getEvaluarArquitectoKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTipoEvaluarPropuesta
entryRuleTipoEvaluarPropuesta
:
{ before(grammarAccess.getTipoEvaluarPropuestaRule()); }
	 ruleTipoEvaluarPropuesta
{ after(grammarAccess.getTipoEvaluarPropuestaRule()); } 
	 EOF 
;

// Rule TipoEvaluarPropuesta
ruleTipoEvaluarPropuesta 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTipoEvaluarPropuestaAccess().getAlternatives()); }
		(rule__TipoEvaluarPropuesta__Alternatives)
		{ after(grammarAccess.getTipoEvaluarPropuestaAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTransicion
entryRuleTransicion
:
{ before(grammarAccess.getTransicionRule()); }
	 ruleTransicion
{ after(grammarAccess.getTransicionRule()); } 
	 EOF 
;

// Rule Transicion
ruleTransicion 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTransicionAccess().getGroup()); }
		(rule__Transicion__Group__0)
		{ after(grammarAccess.getTransicionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expresion__CalificacionAlternatives_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpresionAccess().getCalificacionEvaluarPropuestaParserRuleCall_2_0_0()); }
		ruleEvaluarPropuesta
		{ after(grammarAccess.getExpresionAccess().getCalificacionEvaluarPropuestaParserRuleCall_2_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getExpresionAccess().getCalificacionEvaluarEquipoParserRuleCall_2_0_1()); }
		ruleEvaluarEquipo
		{ after(grammarAccess.getExpresionAccess().getCalificacionEvaluarEquipoParserRuleCall_2_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvaluarPropuesta__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEvaluarPropuestaAccess().getGroup_0()); }
		(rule__EvaluarPropuesta__Group_0__0)
		{ after(grammarAccess.getEvaluarPropuestaAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getEvaluarPropuestaAccess().getGroup_1()); }
		(rule__EvaluarPropuesta__Group_1__0)
		{ after(grammarAccess.getEvaluarPropuestaAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getEvaluarPropuestaAccess().getGroup_2()); }
		(rule__EvaluarPropuesta__Group_2__0)
		{ after(grammarAccess.getEvaluarPropuestaAccess().getGroup_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TipoEvaluacion__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTipoEvaluacionAccess().getTipoEvaluarPropuestaParserRuleCall_0()); }
		ruleTipoEvaluarPropuesta
		{ after(grammarAccess.getTipoEvaluacionAccess().getTipoEvaluarPropuestaParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getTipoEvaluacionAccess().getTipoEvaluarEquipoParserRuleCall_1()); }
		ruleTipoEvaluarEquipo
		{ after(grammarAccess.getTipoEvaluacionAccess().getTipoEvaluarEquipoParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TipoEvaluarPropuesta__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTipoEvaluarPropuestaAccess().getEvaluarProblemaKeyword_0()); }
		'EvaluarProblema'
		{ after(grammarAccess.getTipoEvaluarPropuestaAccess().getEvaluarProblemaKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getTipoEvaluarPropuestaAccess().getEvaluarTecnicaKeyword_1()); }
		'EvaluarTecnica'
		{ after(grammarAccess.getTipoEvaluarPropuestaAccess().getEvaluarTecnicaKeyword_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MaquinaEstados__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MaquinaEstados__Group__0__Impl
	rule__MaquinaEstados__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MaquinaEstados__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMaquinaEstadosAccess().getMaquinaEstadosAction_0()); }
	()
	{ after(grammarAccess.getMaquinaEstadosAccess().getMaquinaEstadosAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MaquinaEstados__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MaquinaEstados__Group__1__Impl
	rule__MaquinaEstados__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MaquinaEstados__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMaquinaEstadosAccess().getGroup_1()); }
	(rule__MaquinaEstados__Group_1__0)?
	{ after(grammarAccess.getMaquinaEstadosAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MaquinaEstados__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MaquinaEstados__Group__2__Impl
	rule__MaquinaEstados__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MaquinaEstados__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMaquinaEstadosAccess().getGroup_2()); }
	(rule__MaquinaEstados__Group_2__0)?
	{ after(grammarAccess.getMaquinaEstadosAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MaquinaEstados__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MaquinaEstados__Group__3__Impl
	rule__MaquinaEstados__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MaquinaEstados__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMaquinaEstadosAccess().getGroup_3()); }
	(rule__MaquinaEstados__Group_3__0)?
	{ after(grammarAccess.getMaquinaEstadosAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MaquinaEstados__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MaquinaEstados__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MaquinaEstados__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMaquinaEstadosAccess().getStatesAssignment_4()); }
	(rule__MaquinaEstados__StatesAssignment_4)*
	{ after(grammarAccess.getMaquinaEstadosAccess().getStatesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MaquinaEstados__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MaquinaEstados__Group_1__0__Impl
	rule__MaquinaEstados__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MaquinaEstados__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMaquinaEstadosAccess().getEventosKeyword_1_0()); }
	'eventos'
	{ after(grammarAccess.getMaquinaEstadosAccess().getEventosKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MaquinaEstados__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MaquinaEstados__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MaquinaEstados__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getMaquinaEstadosAccess().getEventsAssignment_1_1()); }
		(rule__MaquinaEstados__EventsAssignment_1_1)
		{ after(grammarAccess.getMaquinaEstadosAccess().getEventsAssignment_1_1()); }
	)
	(
		{ before(grammarAccess.getMaquinaEstadosAccess().getEventsAssignment_1_1()); }
		(rule__MaquinaEstados__EventsAssignment_1_1)*
		{ after(grammarAccess.getMaquinaEstadosAccess().getEventsAssignment_1_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MaquinaEstados__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MaquinaEstados__Group_2__0__Impl
	rule__MaquinaEstados__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MaquinaEstados__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMaquinaEstadosAccess().getResetEventsKeyword_2_0()); }
	'resetEvents'
	{ after(grammarAccess.getMaquinaEstadosAccess().getResetEventsKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MaquinaEstados__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MaquinaEstados__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MaquinaEstados__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getMaquinaEstadosAccess().getResetEventsAssignment_2_1()); }
		(rule__MaquinaEstados__ResetEventsAssignment_2_1)
		{ after(grammarAccess.getMaquinaEstadosAccess().getResetEventsAssignment_2_1()); }
	)
	(
		{ before(grammarAccess.getMaquinaEstadosAccess().getResetEventsAssignment_2_1()); }
		(rule__MaquinaEstados__ResetEventsAssignment_2_1)*
		{ after(grammarAccess.getMaquinaEstadosAccess().getResetEventsAssignment_2_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MaquinaEstados__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MaquinaEstados__Group_3__0__Impl
	rule__MaquinaEstados__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MaquinaEstados__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMaquinaEstadosAccess().getEvaluacionesKeyword_3_0()); }
	'evaluaciones'
	{ after(grammarAccess.getMaquinaEstadosAccess().getEvaluacionesKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MaquinaEstados__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MaquinaEstados__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MaquinaEstados__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getMaquinaEstadosAccess().getCommandsAssignment_3_1()); }
		(rule__MaquinaEstados__CommandsAssignment_3_1)
		{ after(grammarAccess.getMaquinaEstadosAccess().getCommandsAssignment_3_1()); }
	)
	(
		{ before(grammarAccess.getMaquinaEstadosAccess().getCommandsAssignment_3_1()); }
		(rule__MaquinaEstados__CommandsAssignment_3_1)*
		{ after(grammarAccess.getMaquinaEstadosAccess().getCommandsAssignment_3_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Evento__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Evento__Group__0__Impl
	rule__Evento__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Evento__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEventoAccess().getNameAssignment_0()); }
	(rule__Evento__NameAssignment_0)
	{ after(grammarAccess.getEventoAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Evento__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Evento__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Evento__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEventoAccess().getCodeAssignment_1()); }
	(rule__Evento__CodeAssignment_1)
	{ after(grammarAccess.getEventoAccess().getCodeAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Componente__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Componente__Group__0__Impl
	rule__Componente__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Componente__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponenteAccess().getComponenteKeyword_0()); }
	'componente'
	{ after(grammarAccess.getComponenteAccess().getComponenteKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Componente__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Componente__Group__1__Impl
	rule__Componente__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Componente__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponenteAccess().getNameAssignment_1()); }
	(rule__Componente__NameAssignment_1)
	{ after(grammarAccess.getComponenteAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Componente__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Componente__Group__2__Impl
	rule__Componente__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Componente__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponenteAccess().getGroup_2()); }
	(rule__Componente__Group_2__0)?
	{ after(grammarAccess.getComponenteAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Componente__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Componente__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Componente__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponenteAccess().getTransitionsAssignment_3()); }
	(rule__Componente__TransitionsAssignment_3)*
	{ after(grammarAccess.getComponenteAccess().getTransitionsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Componente__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Componente__Group_2__0__Impl
	rule__Componente__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Componente__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponenteAccess().getActionsKeyword_2_0()); }
	'actions'
	{ after(grammarAccess.getComponenteAccess().getActionsKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Componente__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Componente__Group_2__1__Impl
	rule__Componente__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Componente__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponenteAccess().getLeftCurlyBracketKeyword_2_1()); }
	'{'
	{ after(grammarAccess.getComponenteAccess().getLeftCurlyBracketKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Componente__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Componente__Group_2__2__Impl
	rule__Componente__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Componente__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getComponenteAccess().getActionsAssignment_2_2()); }
		(rule__Componente__ActionsAssignment_2_2)
		{ after(grammarAccess.getComponenteAccess().getActionsAssignment_2_2()); }
	)
	(
		{ before(grammarAccess.getComponenteAccess().getActionsAssignment_2_2()); }
		(rule__Componente__ActionsAssignment_2_2)*
		{ after(grammarAccess.getComponenteAccess().getActionsAssignment_2_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Componente__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Componente__Group_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Componente__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponenteAccess().getRightCurlyBracketKeyword_2_3()); }
	'}'
	{ after(grammarAccess.getComponenteAccess().getRightCurlyBracketKeyword_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Evaluaciones__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Evaluaciones__Group__0__Impl
	rule__Evaluaciones__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Evaluaciones__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvaluacionesAccess().getTipoEvaluacionParserRuleCall_0()); }
	ruleTipoEvaluacion
	{ after(grammarAccess.getEvaluacionesAccess().getTipoEvaluacionParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Evaluaciones__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Evaluaciones__Group__1__Impl
	rule__Evaluaciones__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Evaluaciones__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvaluacionesAccess().getNameAssignment_1()); }
	(rule__Evaluaciones__NameAssignment_1)
	{ after(grammarAccess.getEvaluacionesAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Evaluaciones__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Evaluaciones__Group__2__Impl
	rule__Evaluaciones__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Evaluaciones__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvaluacionesAccess().getExpresionAssignment_2()); }
	(rule__Evaluaciones__ExpresionAssignment_2)
	{ after(grammarAccess.getEvaluacionesAccess().getExpresionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Evaluaciones__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Evaluaciones__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Evaluaciones__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvaluacionesAccess().getGroup_3()); }
	(rule__Evaluaciones__Group_3__0)?
	{ after(grammarAccess.getEvaluacionesAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Evaluaciones__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Evaluaciones__Group_3__0__Impl
	rule__Evaluaciones__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Evaluaciones__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvaluacionesAccess().getColonKeyword_3_0()); }
	':'
	{ after(grammarAccess.getEvaluacionesAccess().getColonKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Evaluaciones__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Evaluaciones__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Evaluaciones__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvaluacionesAccess().getComentarioAssignment_3_1()); }
	(rule__Evaluaciones__ComentarioAssignment_3_1)
	{ after(grammarAccess.getEvaluacionesAccess().getComentarioAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Expresion__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expresion__Group__0__Impl
	rule__Expresion__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expresion__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpresionAccess().getCalificacionKeyword_0()); }
	'calificacion'
	{ after(grammarAccess.getExpresionAccess().getCalificacionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expresion__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expresion__Group__1__Impl
	rule__Expresion__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Expresion__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpresionAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getExpresionAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expresion__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expresion__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expresion__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpresionAccess().getCalificacionAssignment_2()); }
	(rule__Expresion__CalificacionAssignment_2)
	{ after(grammarAccess.getExpresionAccess().getCalificacionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EvaluarEquipo__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvaluarEquipo__Group__0__Impl
	rule__EvaluarEquipo__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EvaluarEquipo__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvaluarEquipoAccess().getExpresionAction_0()); }
	()
	{ after(grammarAccess.getEvaluarEquipoAccess().getExpresionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvaluarEquipo__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvaluarEquipo__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EvaluarEquipo__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvaluarEquipoAccess().getINTTerminalRuleCall_1()); }
	RULE_INT
	{ after(grammarAccess.getEvaluarEquipoAccess().getINTTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EvaluarPropuesta__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvaluarPropuesta__Group_0__0__Impl
	rule__EvaluarPropuesta__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EvaluarPropuesta__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvaluarPropuestaAccess().getExpresionAction_0_0()); }
	()
	{ after(grammarAccess.getEvaluarPropuestaAccess().getExpresionAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvaluarPropuesta__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvaluarPropuesta__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EvaluarPropuesta__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvaluarPropuestaAccess().getAKeyword_0_1()); }
	'A'
	{ after(grammarAccess.getEvaluarPropuestaAccess().getAKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EvaluarPropuesta__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvaluarPropuesta__Group_1__0__Impl
	rule__EvaluarPropuesta__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EvaluarPropuesta__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvaluarPropuestaAccess().getExpresionAction_1_0()); }
	()
	{ after(grammarAccess.getEvaluarPropuestaAccess().getExpresionAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvaluarPropuesta__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvaluarPropuesta__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EvaluarPropuesta__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvaluarPropuestaAccess().getMKeyword_1_1()); }
	'M'
	{ after(grammarAccess.getEvaluarPropuestaAccess().getMKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EvaluarPropuesta__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvaluarPropuesta__Group_2__0__Impl
	rule__EvaluarPropuesta__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EvaluarPropuesta__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvaluarPropuestaAccess().getExpresionAction_2_0()); }
	()
	{ after(grammarAccess.getEvaluarPropuestaAccess().getExpresionAction_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvaluarPropuesta__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EvaluarPropuesta__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EvaluarPropuesta__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEvaluarPropuestaAccess().getBKeyword_2_1()); }
	'B'
	{ after(grammarAccess.getEvaluarPropuestaAccess().getBKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Transicion__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transicion__Group__0__Impl
	rule__Transicion__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Transicion__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransicionAccess().getEventAssignment_0()); }
	(rule__Transicion__EventAssignment_0)
	{ after(grammarAccess.getTransicionAccess().getEventAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transicion__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transicion__Group__1__Impl
	rule__Transicion__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Transicion__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransicionAccess().getEqualsSignGreaterThanSignKeyword_1()); }
	'=>'
	{ after(grammarAccess.getTransicionAccess().getEqualsSignGreaterThanSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transicion__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transicion__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Transicion__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransicionAccess().getStateAssignment_2()); }
	(rule__Transicion__StateAssignment_2)
	{ after(grammarAccess.getTransicionAccess().getStateAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MaquinaEstados__EventsAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMaquinaEstadosAccess().getEventsEventoParserRuleCall_1_1_0()); }
		ruleEvento
		{ after(grammarAccess.getMaquinaEstadosAccess().getEventsEventoParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MaquinaEstados__ResetEventsAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMaquinaEstadosAccess().getResetEventsEventoCrossReference_2_1_0()); }
		(
			{ before(grammarAccess.getMaquinaEstadosAccess().getResetEventsEventoIDTerminalRuleCall_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getMaquinaEstadosAccess().getResetEventsEventoIDTerminalRuleCall_2_1_0_1()); }
		)
		{ after(grammarAccess.getMaquinaEstadosAccess().getResetEventsEventoCrossReference_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MaquinaEstados__CommandsAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMaquinaEstadosAccess().getCommandsEvaluacionesParserRuleCall_3_1_0()); }
		ruleEvaluaciones
		{ after(grammarAccess.getMaquinaEstadosAccess().getCommandsEvaluacionesParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MaquinaEstados__StatesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMaquinaEstadosAccess().getStatesComponenteParserRuleCall_4_0()); }
		ruleComponente
		{ after(grammarAccess.getMaquinaEstadosAccess().getStatesComponenteParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Evento__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEventoAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getEventoAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Evento__CodeAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEventoAccess().getCodeIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getEventoAccess().getCodeIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Componente__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponenteAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getComponenteAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Componente__ActionsAssignment_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponenteAccess().getActionsEvaluacionesCrossReference_2_2_0()); }
		(
			{ before(grammarAccess.getComponenteAccess().getActionsEvaluacionesIDTerminalRuleCall_2_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getComponenteAccess().getActionsEvaluacionesIDTerminalRuleCall_2_2_0_1()); }
		)
		{ after(grammarAccess.getComponenteAccess().getActionsEvaluacionesCrossReference_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Componente__TransitionsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponenteAccess().getTransitionsTransicionParserRuleCall_3_0()); }
		ruleTransicion
		{ after(grammarAccess.getComponenteAccess().getTransitionsTransicionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Evaluaciones__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEvaluacionesAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getEvaluacionesAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Evaluaciones__ExpresionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEvaluacionesAccess().getExpresionExpresionParserRuleCall_2_0()); }
		ruleExpresion
		{ after(grammarAccess.getEvaluacionesAccess().getExpresionExpresionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Evaluaciones__ComentarioAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEvaluacionesAccess().getComentarioSTRINGTerminalRuleCall_3_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getEvaluacionesAccess().getComentarioSTRINGTerminalRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expresion__CalificacionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpresionAccess().getCalificacionAlternatives_2_0()); }
		(rule__Expresion__CalificacionAlternatives_2_0)
		{ after(grammarAccess.getExpresionAccess().getCalificacionAlternatives_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transicion__EventAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransicionAccess().getEventEventoCrossReference_0_0()); }
		(
			{ before(grammarAccess.getTransicionAccess().getEventEventoIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getTransicionAccess().getEventEventoIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getTransicionAccess().getEventEventoCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transicion__StateAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransicionAccess().getStateComponenteCrossReference_2_0()); }
		(
			{ before(grammarAccess.getTransicionAccess().getStateComponenteIDTerminalRuleCall_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getTransicionAccess().getStateComponenteIDTerminalRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getTransicionAccess().getStateComponenteCrossReference_2_0()); }
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
