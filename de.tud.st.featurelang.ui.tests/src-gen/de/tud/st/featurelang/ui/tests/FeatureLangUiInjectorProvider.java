/*
 * generated by Xtext 2.32.0
 */
package de.tud.st.featurelang.ui.tests;

import com.google.inject.Injector;
import de.tud.st.featurelang.ui.internal.FeaturelangActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class FeatureLangUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return FeaturelangActivator.getInstance().getInjector("de.tud.st.featurelang.FeatureLang");
	}

}
