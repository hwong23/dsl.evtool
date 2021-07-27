/*
 * generated by Xtext 2.25.0
 */
package hwo.evtool.dsl.evalcn.parser.antlr;

import com.google.inject.Inject;
import hwo.evtool.dsl.evalcn.parser.antlr.internal.InternalEvaluacionParser;
import hwo.evtool.dsl.evalcn.services.EvaluacionGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class EvaluacionParser extends AbstractAntlrParser {

	@Inject
	private EvaluacionGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalEvaluacionParser createParser(XtextTokenStream stream) {
		return new InternalEvaluacionParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "MaquinaEstados";
	}

	public EvaluacionGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(EvaluacionGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}