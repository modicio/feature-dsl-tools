/*
 * generated by Xtext 2.30.0
 */
package de.tud.st.featurelang.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import de.tud.st.featurelang.ide.contentassist.antlr.internal.InternalFeatureLangParser;
import de.tud.st.featurelang.services.FeatureLangGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class FeatureLangParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(FeatureLangGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, FeatureLangGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getStatementAccess().getAlternatives_0(), "rule__Statement__Alternatives_0");
			builder.put(grammarAccess.getChangeStatementAccess().getAlternatives_1(), "rule__ChangeStatement__Alternatives_1");
			builder.put(grammarAccess.getActionAccess().getTypeAlternatives_0(), "rule__Action__TypeAlternatives_0");
			builder.put(grammarAccess.getClassAccess().getAlternatives_0(), "rule__Class__Alternatives_0");
			builder.put(grammarAccess.getPriorityValueAccess().getAlternatives(), "rule__PriorityValue__Alternatives");
			builder.put(grammarAccess.getDatatypeAccess().getAlternatives(), "rule__Datatype__Alternatives");
			builder.put(grammarAccess.getStatementAccess().getGroup(), "rule__Statement__Group__0");
			builder.put(grammarAccess.getChangeStatementAccess().getGroup(), "rule__ChangeStatement__Group__0");
			builder.put(grammarAccess.getChangeStatementAccess().getGroup_1_0(), "rule__ChangeStatement__Group_1_0__0");
			builder.put(grammarAccess.getCreationStatementAccess().getGroup(), "rule__CreationStatement__Group__0");
			builder.put(grammarAccess.getUpdateActionAccess().getGroup(), "rule__UpdateAction__Group__0");
			builder.put(grammarAccess.getAttributeActionAccess().getGroup(), "rule__AttributeAction__Group__0");
			builder.put(grammarAccess.getAttributeActionAccess().getGroup_4(), "rule__AttributeAction__Group_4__0");
			builder.put(grammarAccess.getAssociationActionAccess().getGroup(), "rule__AssociationAction__Group__0");
			builder.put(grammarAccess.getInheritanceActionAccess().getGroup(), "rule__InheritanceAction__Group__0");
			builder.put(grammarAccess.getClassAccess().getGroup(), "rule__Class__Group__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
			builder.put(grammarAccess.getFeatureRequestAccess().getStatementsAssignment(), "rule__FeatureRequest__StatementsAssignment");
			builder.put(grammarAccess.getChangeStatementAccess().getTargetAssignment_0(), "rule__ChangeStatement__TargetAssignment_0");
			builder.put(grammarAccess.getChangeStatementAccess().getPriorityAssignment_1_0_0(), "rule__ChangeStatement__PriorityAssignment_1_0_0");
			builder.put(grammarAccess.getChangeStatementAccess().getNegationAssignment_1_0_1(), "rule__ChangeStatement__NegationAssignment_1_0_1");
			builder.put(grammarAccess.getChangeStatementAccess().getActionAssignment_1_0_2(), "rule__ChangeStatement__ActionAssignment_1_0_2");
			builder.put(grammarAccess.getChangeStatementAccess().getUpdateAssignment_1_1(), "rule__ChangeStatement__UpdateAssignment_1_1");
			builder.put(grammarAccess.getCreationStatementAccess().getPriorityAssignment_1(), "rule__CreationStatement__PriorityAssignment_1");
			builder.put(grammarAccess.getCreationStatementAccess().getNegationAssignment_2(), "rule__CreationStatement__NegationAssignment_2");
			builder.put(grammarAccess.getCreationStatementAccess().getClassElementAssignment_4(), "rule__CreationStatement__ClassElementAssignment_4");
			builder.put(grammarAccess.getActionAccess().getTypeAssignment(), "rule__Action__TypeAssignment");
			builder.put(grammarAccess.getUpdateActionAccess().getAttributeAssignment_3(), "rule__UpdateAction__AttributeAssignment_3");
			builder.put(grammarAccess.getUpdateActionAccess().getPriorityAssignment_6(), "rule__UpdateAction__PriorityAssignment_6");
			builder.put(grammarAccess.getUpdateActionAccess().getTypeAssignment_9(), "rule__UpdateAction__TypeAssignment_9");
			builder.put(grammarAccess.getAttributeActionAccess().getAttributeAssignment_2(), "rule__AttributeAction__AttributeAssignment_2");
			builder.put(grammarAccess.getAttributeActionAccess().getTypeAssignment_4_3(), "rule__AttributeAction__TypeAssignment_4_3");
			builder.put(grammarAccess.getAssociationActionAccess().getTargetAssignment_3(), "rule__AssociationAction__TargetAssignment_3");
			builder.put(grammarAccess.getAssociationActionAccess().getRelationAssignment_5(), "rule__AssociationAction__RelationAssignment_5");
			builder.put(grammarAccess.getInheritanceActionAccess().getParentAssignment_2(), "rule__InheritanceAction__ParentAssignment_2");
			builder.put(grammarAccess.getClassAccess().getNameAssignment_2(), "rule__Class__NameAssignment_2");
			builder.put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
			builder.put(grammarAccess.getPriorityAccess().getPriorityAssignment(), "rule__Priority__PriorityAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private FeatureLangGrammarAccess grammarAccess;

	@Override
	protected InternalFeatureLangParser createParser() {
		InternalFeatureLangParser result = new InternalFeatureLangParser(null);
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

	public FeatureLangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(FeatureLangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
