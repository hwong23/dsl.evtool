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
			builder.put(grammarAccess.getAtomoAccess().getAlternatives(), "rule__Atomo__Alternatives");
			builder.put(grammarAccess.getAtomoAccess().getValorAlternatives_2_1_0(), "rule__Atomo__ValorAlternatives_2_1_0");
			builder.put(grammarAccess.getMaquinaEstadosAccess().getGroup(), "rule__MaquinaEstados__Group__0");
			builder.put(grammarAccess.getMaquinaEstadosAccess().getGroup_1(), "rule__MaquinaEstados__Group_1__0");
			builder.put(grammarAccess.getMaquinaEstadosAccess().getGroup_2(), "rule__MaquinaEstados__Group_2__0");
			builder.put(grammarAccess.getMaquinaEstadosAccess().getGroup_3(), "rule__MaquinaEstados__Group_3__0");
			builder.put(grammarAccess.getEventoAccess().getGroup(), "rule__Evento__Group__0");
			builder.put(grammarAccess.getComandoAccess().getGroup(), "rule__Comando__Group__0");
			builder.put(grammarAccess.getComandoAccess().getGroup_3(), "rule__Comando__Group_3__0");
			builder.put(grammarAccess.getAtomoAccess().getGroup_0(), "rule__Atomo__Group_0__0");
			builder.put(grammarAccess.getAtomoAccess().getGroup_1(), "rule__Atomo__Group_1__0");
			builder.put(grammarAccess.getAtomoAccess().getGroup_2(), "rule__Atomo__Group_2__0");
			builder.put(grammarAccess.getPuntuacionAccess().getGroup(), "rule__Puntuacion__Group__0");
			builder.put(grammarAccess.getEstadoAccess().getGroup(), "rule__Estado__Group__0");
			builder.put(grammarAccess.getEstadoAccess().getGroup_2(), "rule__Estado__Group_2__0");
			builder.put(grammarAccess.getTransicionAccess().getGroup(), "rule__Transicion__Group__0");
			builder.put(grammarAccess.getMaquinaEstadosAccess().getEventsAssignment_1_1(), "rule__MaquinaEstados__EventsAssignment_1_1");
			builder.put(grammarAccess.getMaquinaEstadosAccess().getResetEventsAssignment_2_1(), "rule__MaquinaEstados__ResetEventsAssignment_2_1");
			builder.put(grammarAccess.getMaquinaEstadosAccess().getCommandsAssignment_3_1(), "rule__MaquinaEstados__CommandsAssignment_3_1");
			builder.put(grammarAccess.getMaquinaEstadosAccess().getStatesAssignment_4(), "rule__MaquinaEstados__StatesAssignment_4");
			builder.put(grammarAccess.getEventoAccess().getNameAssignment_0(), "rule__Evento__NameAssignment_0");
			builder.put(grammarAccess.getEventoAccess().getCodeAssignment_1(), "rule__Evento__CodeAssignment_1");
			builder.put(grammarAccess.getComandoAccess().getNameAssignment_0(), "rule__Comando__NameAssignment_0");
			builder.put(grammarAccess.getComandoAccess().getArgumentoAssignment_2(), "rule__Comando__ArgumentoAssignment_2");
			builder.put(grammarAccess.getComandoAccess().getComentarioAssignment_3_1(), "rule__Comando__ComentarioAssignment_3_1");
			builder.put(grammarAccess.getAtomoAccess().getValorAssignment_0_1(), "rule__Atomo__ValorAssignment_0_1");
			builder.put(grammarAccess.getAtomoAccess().getValorAssignment_1_1(), "rule__Atomo__ValorAssignment_1_1");
			builder.put(grammarAccess.getAtomoAccess().getValorAssignment_2_1(), "rule__Atomo__ValorAssignment_2_1");
			builder.put(grammarAccess.getPuntuacionAccess().getNotaAssignment_0(), "rule__Puntuacion__NotaAssignment_0");
			builder.put(grammarAccess.getPuntuacionAccess().getCalificacionAssignment_2(), "rule__Puntuacion__CalificacionAssignment_2");
			builder.put(grammarAccess.getEstadoAccess().getNameAssignment_1(), "rule__Estado__NameAssignment_1");
			builder.put(grammarAccess.getEstadoAccess().getActionsAssignment_2_2(), "rule__Estado__ActionsAssignment_2_2");
			builder.put(grammarAccess.getEstadoAccess().getTransitionsAssignment_3(), "rule__Estado__TransitionsAssignment_3");
			builder.put(grammarAccess.getTransicionAccess().getEventAssignment_0(), "rule__Transicion__EventAssignment_0");
			builder.put(grammarAccess.getTransicionAccess().getStateAssignment_2(), "rule__Transicion__StateAssignment_2");
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
