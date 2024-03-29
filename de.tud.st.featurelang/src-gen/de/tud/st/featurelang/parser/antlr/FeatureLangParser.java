/*
 * generated by Xtext 2.30.0
 */
package de.tud.st.featurelang.parser.antlr;

import com.google.inject.Inject;
import de.tud.st.featurelang.parser.antlr.internal.InternalFeatureLangParser;
import de.tud.st.featurelang.services.FeatureLangGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class FeatureLangParser extends AbstractAntlrParser {

	@Inject
	private FeatureLangGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalFeatureLangParser createParser(XtextTokenStream stream) {
		return new InternalFeatureLangParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "FeatureRequest";
	}

	public FeatureLangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(FeatureLangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
