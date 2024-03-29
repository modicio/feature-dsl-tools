/*
 * generated by Xtext 2.30.0
 */
package de.tud.st.featurelang.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import de.tud.st.featurelang.FeatureLangRuntimeModule;
import de.tud.st.featurelang.FeatureLangStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class FeatureLangIdeSetup extends FeatureLangStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new FeatureLangRuntimeModule(), new FeatureLangIdeModule()));
	}
	
}
