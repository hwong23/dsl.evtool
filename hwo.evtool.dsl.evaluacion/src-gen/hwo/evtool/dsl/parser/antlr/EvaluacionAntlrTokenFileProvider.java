/*
 * generated by Xtext 2.25.0
 */
package hwo.evtool.dsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class EvaluacionAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("hwo/evtool/dsl/parser/antlr/internal/InternalEvaluacion.tokens");
	}
}
