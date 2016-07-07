/*
 * generated by Xtext
 */
package org.eclipse.xtext.testlanguages.backtracking.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguageRuntimeModule;
import org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguageStandaloneSetup;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class BeeLangTestLanguageIdeSetup extends BeeLangTestLanguageStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(new BeeLangTestLanguageRuntimeModule(), new BeeLangTestLanguageIdeModule());
	}
}
