/*
 * generated by Xtext 2.25.0
 */
package hwo.evtool.dsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import hwo.evtool.dsl.ide.contentassist.antlr.internal.InternalEvaluacionParser;
import hwo.evtool.dsl.services.EvaluacionGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class EvaluacionParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(EvaluacionGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, EvaluacionGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEvaluacionAccess().getAlternatives(), "rule__Evaluacion__Alternatives");
			builder.put(grammarAccess.getTipoEquipoAccess().getAlternatives(), "rule__TipoEquipo__Alternatives");
			builder.put(grammarAccess.getTipoPropuestaAccess().getAlternatives(), "rule__TipoPropuesta__Alternatives");
			builder.put(grammarAccess.getE_CalificacionAccess().getAlternatives(), "rule__E_Calificacion__Alternatives");
			builder.put(grammarAccess.getMaquinaEstadosAccess().getGroup(), "rule__MaquinaEstados__Group__0");
			builder.put(grammarAccess.getMaquinaEstadosAccess().getGroup_1(), "rule__MaquinaEstados__Group_1__0");
			builder.put(grammarAccess.getMaquinaEstadosAccess().getGroup_2(), "rule__MaquinaEstados__Group_2__0");
			builder.put(grammarAccess.getMaquinaEstadosAccess().getGroup_3(), "rule__MaquinaEstados__Group_3__0");
			builder.put(grammarAccess.getEventoAccess().getGroup(), "rule__Evento__Group__0");
			builder.put(grammarAccess.getComponenteAccess().getGroup(), "rule__Componente__Group__0");
			builder.put(grammarAccess.getComponenteAccess().getGroup_2(), "rule__Componente__Group_2__0");
			builder.put(grammarAccess.getExpresionAccess().getGroup(), "rule__Expresion__Group__0");
			builder.put(grammarAccess.getExpresionAccess().getGroup_1(), "rule__Expresion__Group_1__0");
			builder.put(grammarAccess.getTransicionAccess().getGroup(), "rule__Transicion__Group__0");
			builder.put(grammarAccess.getEvaluacionAccess().getGroup_0(), "rule__Evaluacion__Group_0__0");
			builder.put(grammarAccess.getEvaluacionAccess().getGroup_1(), "rule__Evaluacion__Group_1__0");
			builder.put(grammarAccess.getEvaluacionAccess().getGroup_2(), "rule__Evaluacion__Group_2__0");
			builder.put(grammarAccess.getMaquinaEstadosAccess().getEventsAssignment_1_1(), "rule__MaquinaEstados__EventsAssignment_1_1");
			builder.put(grammarAccess.getMaquinaEstadosAccess().getResetEventsAssignment_2_1(), "rule__MaquinaEstados__ResetEventsAssignment_2_1");
			builder.put(grammarAccess.getMaquinaEstadosAccess().getCommandsAssignment_3_1(), "rule__MaquinaEstados__CommandsAssignment_3_1");
			builder.put(grammarAccess.getMaquinaEstadosAccess().getStatesAssignment_4(), "rule__MaquinaEstados__StatesAssignment_4");
			builder.put(grammarAccess.getEventoAccess().getNameAssignment_0(), "rule__Evento__NameAssignment_0");
			builder.put(grammarAccess.getEventoAccess().getCodeAssignment_1(), "rule__Evento__CodeAssignment_1");
			builder.put(grammarAccess.getComponenteAccess().getNameAssignment_1(), "rule__Componente__NameAssignment_1");
			builder.put(grammarAccess.getComponenteAccess().getActionsAssignment_2_2(), "rule__Componente__ActionsAssignment_2_2");
			builder.put(grammarAccess.getComponenteAccess().getTransitionsAssignment_3(), "rule__Componente__TransitionsAssignment_3");
			builder.put(grammarAccess.getExpresionAccess().getTipoAssignment_0(), "rule__Expresion__TipoAssignment_0");
			builder.put(grammarAccess.getExpresionAccess().getComentarioAssignment_1_1(), "rule__Expresion__ComentarioAssignment_1_1");
			builder.put(grammarAccess.getTipoEvaluacionAccess().getEvaluacionAssignment(), "rule__TipoEvaluacion__EvaluacionAssignment");
			builder.put(grammarAccess.getTransicionAccess().getEventAssignment_0(), "rule__Transicion__EventAssignment_0");
			builder.put(grammarAccess.getTransicionAccess().getStateAssignment_2(), "rule__Transicion__StateAssignment_2");
			builder.put(grammarAccess.getEvaluacionAccess().getTipoAssignment_0_1(), "rule__Evaluacion__TipoAssignment_0_1");
			builder.put(grammarAccess.getEvaluacionAccess().getNameAssignment_0_2(), "rule__Evaluacion__NameAssignment_0_2");
			builder.put(grammarAccess.getEvaluacionAccess().getPuntuacionAssignment_0_5(), "rule__Evaluacion__PuntuacionAssignment_0_5");
			builder.put(grammarAccess.getEvaluacionAccess().getTipoAssignment_1_1(), "rule__Evaluacion__TipoAssignment_1_1");
			builder.put(grammarAccess.getEvaluacionAccess().getNameAssignment_1_2(), "rule__Evaluacion__NameAssignment_1_2");
			builder.put(grammarAccess.getEvaluacionAccess().getNumeradorAssignment_1_5(), "rule__Evaluacion__NumeradorAssignment_1_5");
			builder.put(grammarAccess.getEvaluacionAccess().getDenominadorAssignment_1_7(), "rule__Evaluacion__DenominadorAssignment_1_7");
			builder.put(grammarAccess.getEvaluacionAccess().getTipoAssignment_2_1(), "rule__Evaluacion__TipoAssignment_2_1");
			builder.put(grammarAccess.getEvaluacionAccess().getNameAssignment_2_2(), "rule__Evaluacion__NameAssignment_2_2");
			builder.put(grammarAccess.getEvaluacionAccess().getValorAssignment_2_5(), "rule__Evaluacion__ValorAssignment_2_5");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private EvaluacionGrammarAccess grammarAccess;

	@Override
	protected InternalEvaluacionParser createParser() {
		InternalEvaluacionParser result = new InternalEvaluacionParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public EvaluacionGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(EvaluacionGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
