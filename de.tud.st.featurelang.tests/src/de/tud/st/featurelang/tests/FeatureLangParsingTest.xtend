/*
 * generated by Xtext 2.30.0
 */
package de.tud.st.featurelang.tests

import com.google.inject.Inject
import de.tud.st.featurelang.featureLang.FeatureRequest
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(FeatureLangInjectorProvider)
class FeatureLangParsingTest {
	@Inject
	ParseHelper<FeatureRequest> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
}
