/*
 * generated by Xtext 2.32.0
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
			builder.put(grammarAccess.getChangeStatementAccess().getAlternatives_0(), "rule__ChangeStatement__Alternatives_0");
			builder.put(grammarAccess.getChangeStatementAccess().getAlternatives_0_1_0(), "rule__ChangeStatement__Alternatives_0_1_0");
			builder.put(grammarAccess.getChangeStatementAccess().getAlternatives_1(), "rule__ChangeStatement__Alternatives_1");
			builder.put(grammarAccess.getCreationStatementAccess().getAlternatives(), "rule__CreationStatement__Alternatives");
			builder.put(grammarAccess.getCreationStatementAccess().getAlternatives_0_3(), "rule__CreationStatement__Alternatives_0_3");
			builder.put(grammarAccess.getCreationStatementAccess().getAlternatives_1_0(), "rule__CreationStatement__Alternatives_1_0");
			builder.put(grammarAccess.getActionAccess().getTypeAlternatives_0(), "rule__Action__TypeAlternatives_0");
			builder.put(grammarAccess.getUpdateActionAccess().getAlternatives_1(), "rule__UpdateAction__Alternatives_1");
			builder.put(grammarAccess.getUpdateActionAccess().getAlternatives_2(), "rule__UpdateAction__Alternatives_2");
			builder.put(grammarAccess.getUpdateActionAccess().getAlternatives_7(), "rule__UpdateAction__Alternatives_7");
			builder.put(grammarAccess.getUpdateAttributeIdentifierAccess().getAlternatives_1(), "rule__UpdateAttributeIdentifier__Alternatives_1");
			builder.put(grammarAccess.getAttributeActionAccess().getAlternatives_1(), "rule__AttributeAction__Alternatives_1");
			builder.put(grammarAccess.getAssociationActionAccess().getAlternatives_1(), "rule__AssociationAction__Alternatives_1");
			builder.put(grammarAccess.getAssociationActionAccess().getAlternatives_2(), "rule__AssociationAction__Alternatives_2");
			builder.put(grammarAccess.getEditAssociationAccess().getTypeAlternatives_0(), "rule__EditAssociation__TypeAlternatives_0");
			builder.put(grammarAccess.getInheritanceActionAccess().getAlternatives_0(), "rule__InheritanceAction__Alternatives_0");
			builder.put(grammarAccess.getCompositionActionAccess().getAlternatives(), "rule__CompositionAction__Alternatives");
			builder.put(grammarAccess.getCreateCompositionAccess().getAlternatives_0(), "rule__CreateComposition__Alternatives_0");
			builder.put(grammarAccess.getClassAccess().getAlternatives_0(), "rule__Class__Alternatives_0");
			builder.put(grammarAccess.getAttributeValueAccess().getAlternatives(), "rule__AttributeValue__Alternatives");
			builder.put(grammarAccess.getPublicityAccess().getAlternatives(), "rule__Publicity__Alternatives");
			builder.put(grammarAccess.getPriorityValueAccess().getAlternatives(), "rule__PriorityValue__Alternatives");
			builder.put(grammarAccess.getAbstractionAccess().getAlternatives(), "rule__Abstraction__Alternatives");
			builder.put(grammarAccess.getIdentifierValueAccess().getAlternatives(), "rule__IdentifierValue__Alternatives");
			builder.put(grammarAccess.getDatatypeAccess().getAlternatives(), "rule__Datatype__Alternatives");
			builder.put(grammarAccess.getStatementAccess().getGroup(), "rule__Statement__Group__0");
			builder.put(grammarAccess.getChangeStatementAccess().getGroup(), "rule__ChangeStatement__Group__0");
			builder.put(grammarAccess.getChangeStatementAccess().getGroup_0_0(), "rule__ChangeStatement__Group_0_0__0");
			builder.put(grammarAccess.getChangeStatementAccess().getGroup_0_0_1(), "rule__ChangeStatement__Group_0_0_1__0");
			builder.put(grammarAccess.getChangeStatementAccess().getGroup_0_1(), "rule__ChangeStatement__Group_0_1__0");
			builder.put(grammarAccess.getCreationStatementAccess().getGroup_0(), "rule__CreationStatement__Group_0__0");
			builder.put(grammarAccess.getCreationStatementAccess().getGroup_1(), "rule__CreationStatement__Group_1__0");
			builder.put(grammarAccess.getUpdateActionAccess().getGroup(), "rule__UpdateAction__Group__0");
			builder.put(grammarAccess.getUpdateAttributeDatatypeAccess().getGroup(), "rule__UpdateAttributeDatatype__Group__0");
			builder.put(grammarAccess.getUpdateAttributeIdentifierAccess().getGroup(), "rule__UpdateAttributeIdentifier__Group__0");
			builder.put(grammarAccess.getUpdateAttributeValueAccess().getGroup(), "rule__UpdateAttributeValue__Group__0");
			builder.put(grammarAccess.getAttributeActionAccess().getGroup(), "rule__AttributeAction__Group__0");
			builder.put(grammarAccess.getAttributeActionAccess().getGroup_3(), "rule__AttributeAction__Group_3__0");
			builder.put(grammarAccess.getAttributeActionAccess().getGroup_4(), "rule__AttributeAction__Group_4__0");
			builder.put(grammarAccess.getAssociationActionAccess().getGroup(), "rule__AssociationAction__Group__0");
			builder.put(grammarAccess.getAssociationActionAccess().getGroup_2_1(), "rule__AssociationAction__Group_2_1__0");
			builder.put(grammarAccess.getCreateAssociationAccess().getGroup(), "rule__CreateAssociation__Group__0");
			builder.put(grammarAccess.getSetCompatibleAccess().getGroup(), "rule__SetCompatible__Group__0");
			builder.put(grammarAccess.getSetVersionRangeAccess().getGroup(), "rule__SetVersionRange__Group__0");
			builder.put(grammarAccess.getSetVariantAccess().getGroup(), "rule__SetVariant__Group__0");
			builder.put(grammarAccess.getSetRightOpenAccess().getGroup(), "rule__SetRightOpen__Group__0");
			builder.put(grammarAccess.getSetLeftOpenAccess().getGroup(), "rule__SetLeftOpen__Group__0");
			builder.put(grammarAccess.getInheritanceActionAccess().getGroup(), "rule__InheritanceAction__Group__0");
			builder.put(grammarAccess.getCreateCompositionAccess().getGroup(), "rule__CreateComposition__Group__0");
			builder.put(grammarAccess.getCreateCompositionAccess().getGroup_0_1(), "rule__CreateComposition__Group_0_1__0");
			builder.put(grammarAccess.getCreateCompositionAccess().getGroup_4(), "rule__CreateComposition__Group_4__0");
			builder.put(grammarAccess.getEditCompositionAccess().getGroup(), "rule__EditComposition__Group__0");
			builder.put(grammarAccess.getClassAccess().getGroup(), "rule__Class__Group__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
			builder.put(grammarAccess.getIdentifierAccess().getGroup(), "rule__Identifier__Group__0");
			builder.put(grammarAccess.getAttributeValueAccess().getGroup_0(), "rule__AttributeValue__Group_0__0");
			builder.put(grammarAccess.getFeatureRequestAccess().getStatementsAssignment(), "rule__FeatureRequest__StatementsAssignment");
			builder.put(grammarAccess.getChangeStatementAccess().getTargetAssignment_0_0_0(), "rule__ChangeStatement__TargetAssignment_0_0_0");
			builder.put(grammarAccess.getChangeStatementAccess().getPriorityAssignment_0_0_1_0(), "rule__ChangeStatement__PriorityAssignment_0_0_1_0");
			builder.put(grammarAccess.getChangeStatementAccess().getNegationAssignment_0_0_1_1(), "rule__ChangeStatement__NegationAssignment_0_0_1_1");
			builder.put(grammarAccess.getChangeStatementAccess().getNegationAssignment_0_1_0_2(), "rule__ChangeStatement__NegationAssignment_0_1_0_2");
			builder.put(grammarAccess.getChangeStatementAccess().getTargetAssignment_0_1_2(), "rule__ChangeStatement__TargetAssignment_0_1_2");
			builder.put(grammarAccess.getChangeStatementAccess().getActionAssignment_1_0(), "rule__ChangeStatement__ActionAssignment_1_0");
			builder.put(grammarAccess.getChangeStatementAccess().getUpdateAssignment_1_1(), "rule__ChangeStatement__UpdateAssignment_1_1");
			builder.put(grammarAccess.getCreationStatementAccess().getClassElementAssignment_0_0(), "rule__CreationStatement__ClassElementAssignment_0_0");
			builder.put(grammarAccess.getCreationStatementAccess().getPriorityAssignment_0_1(), "rule__CreationStatement__PriorityAssignment_0_1");
			builder.put(grammarAccess.getCreationStatementAccess().getNegationAssignment_0_2(), "rule__CreationStatement__NegationAssignment_0_2");
			builder.put(grammarAccess.getCreationStatementAccess().getNegationAssignment_1_0_1(), "rule__CreationStatement__NegationAssignment_1_0_1");
			builder.put(grammarAccess.getCreationStatementAccess().getClassElementAssignment_1_1(), "rule__CreationStatement__ClassElementAssignment_1_1");
			builder.put(grammarAccess.getActionAccess().getTypeAssignment(), "rule__Action__TypeAssignment");
			builder.put(grammarAccess.getUpdateActionAccess().getAttributeAssignment_3(), "rule__UpdateAction__AttributeAssignment_3");
			builder.put(grammarAccess.getUpdateActionAccess().getPriorityAssignment_6(), "rule__UpdateAction__PriorityAssignment_6");
			builder.put(grammarAccess.getUpdateActionAccess().getDatatypeAssignment_7_0(), "rule__UpdateAction__DatatypeAssignment_7_0");
			builder.put(grammarAccess.getUpdateActionAccess().getIdentifierAssignment_7_1(), "rule__UpdateAction__IdentifierAssignment_7_1");
			builder.put(grammarAccess.getUpdateActionAccess().getValueAssignment_7_2(), "rule__UpdateAction__ValueAssignment_7_2");
			builder.put(grammarAccess.getUpdateAttributeDatatypeAccess().getTypeAssignment_2(), "rule__UpdateAttributeDatatype__TypeAssignment_2");
			builder.put(grammarAccess.getUpdateAttributeDatatypeAccess().getOldTypeAssignment_5(), "rule__UpdateAttributeDatatype__OldTypeAssignment_5");
			builder.put(grammarAccess.getUpdateAttributeIdentifierAccess().getIdentifierAssignment_2(), "rule__UpdateAttributeIdentifier__IdentifierAssignment_2");
			builder.put(grammarAccess.getUpdateAttributeIdentifierAccess().getOldIdentifierAssignment_5(), "rule__UpdateAttributeIdentifier__OldIdentifierAssignment_5");
			builder.put(grammarAccess.getUpdateAttributeValueAccess().getValueAssignment_3(), "rule__UpdateAttributeValue__ValueAssignment_3");
			builder.put(grammarAccess.getUpdateAttributeValueAccess().getOldValueAssignment_6(), "rule__UpdateAttributeValue__OldValueAssignment_6");
			builder.put(grammarAccess.getAttributeActionAccess().getAttributeAssignment_2(), "rule__AttributeAction__AttributeAssignment_2");
			builder.put(grammarAccess.getAttributeActionAccess().getTypeAssignment_3_4(), "rule__AttributeAction__TypeAssignment_3_4");
			builder.put(grammarAccess.getAttributeActionAccess().getValueAssignment_4_5(), "rule__AttributeAction__ValueAssignment_4_5");
			builder.put(grammarAccess.getAssociationActionAccess().getCreateAssignment_2_0(), "rule__AssociationAction__CreateAssignment_2_0");
			builder.put(grammarAccess.getAssociationActionAccess().getNameAssignment_2_1_0(), "rule__AssociationAction__NameAssignment_2_1_0");
			builder.put(grammarAccess.getAssociationActionAccess().getEditAssignment_2_1_1(), "rule__AssociationAction__EditAssignment_2_1_1");
			builder.put(grammarAccess.getCreateAssociationAccess().getTargetAssignment_2(), "rule__CreateAssociation__TargetAssignment_2");
			builder.put(grammarAccess.getCreateAssociationAccess().getRelationAssignment_4(), "rule__CreateAssociation__RelationAssignment_4");
			builder.put(grammarAccess.getEditAssociationAccess().getTypeAssignment(), "rule__EditAssociation__TypeAssignment");
			builder.put(grammarAccess.getSetCompatibleAccess().getNameAssignment_3(), "rule__SetCompatible__NameAssignment_3");
			builder.put(grammarAccess.getSetVersionRangeAccess().getStartAssignment_4(), "rule__SetVersionRange__StartAssignment_4");
			builder.put(grammarAccess.getSetVersionRangeAccess().getEndAssignment_6(), "rule__SetVersionRange__EndAssignment_6");
			builder.put(grammarAccess.getSetVariantAccess().getNameAssignment_5(), "rule__SetVariant__NameAssignment_5");
			builder.put(grammarAccess.getSetRightOpenAccess().getDateAssignment_3(), "rule__SetRightOpen__DateAssignment_3");
			builder.put(grammarAccess.getSetLeftOpenAccess().getDateAssignment_3(), "rule__SetLeftOpen__DateAssignment_3");
			builder.put(grammarAccess.getInheritanceActionAccess().getParentAssignment_2(), "rule__InheritanceAction__ParentAssignment_2");
			builder.put(grammarAccess.getCompositionActionAccess().getCreateAssignment_0(), "rule__CompositionAction__CreateAssignment_0");
			builder.put(grammarAccess.getCompositionActionAccess().getEditAssignment_1(), "rule__CompositionAction__EditAssignment_1");
			builder.put(grammarAccess.getCreateCompositionAccess().getTargetAssignment_1(), "rule__CreateComposition__TargetAssignment_1");
			builder.put(grammarAccess.getCreateCompositionAccess().getRelationAssignment_3(), "rule__CreateComposition__RelationAssignment_3");
			builder.put(grammarAccess.getCreateCompositionAccess().getPriorityAssignment_4_2(), "rule__CreateComposition__PriorityAssignment_4_2");
			builder.put(grammarAccess.getCreateCompositionAccess().getPublicityAssignment_4_4(), "rule__CreateComposition__PublicityAssignment_4_4");
			builder.put(grammarAccess.getEditCompositionAccess().getCompositionNameAssignment_2(), "rule__EditComposition__CompositionNameAssignment_2");
			builder.put(grammarAccess.getEditCompositionAccess().getPublicityAssignment_5(), "rule__EditComposition__PublicityAssignment_5");
			builder.put(grammarAccess.getClassAccess().getAbstractionAssignment_1(), "rule__Class__AbstractionAssignment_1");
			builder.put(grammarAccess.getClassAccess().getNameAssignment_3(), "rule__Class__NameAssignment_3");
			builder.put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
			builder.put(grammarAccess.getIdentifierAccess().getValueAssignment_0(), "rule__Identifier__ValueAssignment_0");
			builder.put(grammarAccess.getIdentifierAccess().getNameAssignment_1(), "rule__Identifier__NameAssignment_1");
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
