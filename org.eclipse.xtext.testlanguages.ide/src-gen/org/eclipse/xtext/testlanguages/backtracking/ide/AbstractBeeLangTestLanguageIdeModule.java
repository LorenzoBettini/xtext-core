/*
 * generated by Xtext
 */
package org.eclipse.xtext.testlanguages.backtracking.ide;

import com.google.inject.Binder;
import com.google.inject.name.Names;
import org.eclipse.xtext.ide.DefaultIdeModule;
import org.eclipse.xtext.ide.LexerIdeBindings;
import org.eclipse.xtext.ide.editor.contentassist.antlr.IContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
import org.eclipse.xtext.testlanguages.backtracking.ide.contentassist.antlr.BeeLangTestLanguageParser;
import org.eclipse.xtext.testlanguages.backtracking.ide.contentassist.antlr.internal.InternalBeeLangTestLanguageLexer;

/**
 * Manual modifications go to {@link BeeLangTestLanguageIdeModule}.
 */
@SuppressWarnings("all")
public abstract class AbstractBeeLangTestLanguageIdeModule extends DefaultIdeModule {

	// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
	public void configureContentAssistLexer(Binder binder) {
		binder.bind(Lexer.class)
			.annotatedWith(Names.named(LexerIdeBindings.CONTENT_ASSIST))
			.to(InternalBeeLangTestLanguageLexer.class);
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
	public Class<? extends IContentAssistParser> bindIContentAssistParser() {
		return BeeLangTestLanguageParser.class;
	}
	
}
