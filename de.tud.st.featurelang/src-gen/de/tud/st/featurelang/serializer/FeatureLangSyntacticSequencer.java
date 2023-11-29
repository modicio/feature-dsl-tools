/*
 * generated by Xtext 2.32.0
 */
package de.tud.st.featurelang.serializer;

import com.google.inject.Inject;
import de.tud.st.featurelang.services.FeatureLangGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class FeatureLangSyntacticSequencer extends AbstractSyntacticSequencer {

	protected FeatureLangGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AssociationAction_OtherKeyword_3_q;
	protected AbstractElementAlias match_AttributeAction_AKeyword_1_2_or_AnKeyword_1_1_or_TheKeyword_1_0;
	protected AbstractElementAlias match_Attribute_AttributeKeyword_0_q;
	protected AbstractElementAlias match_ChangeStatement___AKeyword_1_0_2_1_1_0_or_AnKeyword_1_0_2_1_1_1__q;
	protected AbstractElementAlias match_Class_ClassKeyword_2_q;
	protected AbstractElementAlias match_Class___AKeyword_0_1_or_TheKeyword_0_0__q;
	protected AbstractElementAlias match_CompositionAction_ComposeKeyword_0_0_or_ComposesKeyword_0_1;
	protected AbstractElementAlias match_CreationStatement_BeKeyword_3_1_or_ExistKeyword_3_0;
	protected AbstractElementAlias match_Statement_FullStopKeyword_1_q;
	protected AbstractElementAlias match_UpdateAction_AKeyword_1_1_or_AnKeyword_1_0;
	protected AbstractElementAlias match_UpdateAction_ExistingKeyword_2_q;
	protected AbstractElementAlias match_UpdateAttributeIdentifier___AKeyword_1_0_or_AnKeyword_1_1__q;
	protected AbstractElementAlias match_UpdateAttributeValue_AKeyword_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (FeatureLangGrammarAccess) access;
		match_AssociationAction_OtherKeyword_3_q = new TokenAlias(false, true, grammarAccess.getAssociationActionAccess().getOtherKeyword_3());
		match_AttributeAction_AKeyword_1_2_or_AnKeyword_1_1_or_TheKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAttributeActionAccess().getAKeyword_1_2()), new TokenAlias(false, false, grammarAccess.getAttributeActionAccess().getAnKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getAttributeActionAccess().getTheKeyword_1_0()));
		match_Attribute_AttributeKeyword_0_q = new TokenAlias(false, true, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
		match_ChangeStatement___AKeyword_1_0_2_1_1_0_or_AnKeyword_1_0_2_1_1_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getChangeStatementAccess().getAKeyword_1_0_2_1_1_0()), new TokenAlias(false, false, grammarAccess.getChangeStatementAccess().getAnKeyword_1_0_2_1_1_1()));
		match_Class_ClassKeyword_2_q = new TokenAlias(false, true, grammarAccess.getClassAccess().getClassKeyword_2());
		match_Class___AKeyword_0_1_or_TheKeyword_0_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getClassAccess().getAKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getClassAccess().getTheKeyword_0_0()));
		match_CompositionAction_ComposeKeyword_0_0_or_ComposesKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCompositionActionAccess().getComposeKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getCompositionActionAccess().getComposesKeyword_0_1()));
		match_CreationStatement_BeKeyword_3_1_or_ExistKeyword_3_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCreationStatementAccess().getBeKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getCreationStatementAccess().getExistKeyword_3_0()));
		match_Statement_FullStopKeyword_1_q = new TokenAlias(false, true, grammarAccess.getStatementAccess().getFullStopKeyword_1());
		match_UpdateAction_AKeyword_1_1_or_AnKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getUpdateActionAccess().getAKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getUpdateActionAccess().getAnKeyword_1_0()));
		match_UpdateAction_ExistingKeyword_2_q = new TokenAlias(false, true, grammarAccess.getUpdateActionAccess().getExistingKeyword_2());
		match_UpdateAttributeIdentifier___AKeyword_1_0_or_AnKeyword_1_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getUpdateAttributeIdentifierAccess().getAKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getUpdateAttributeIdentifierAccess().getAnKeyword_1_1()));
		match_UpdateAttributeValue_AKeyword_1_q = new TokenAlias(false, true, grammarAccess.getUpdateAttributeValueAccess().getAKeyword_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_AssociationAction_OtherKeyword_3_q.equals(syntax))
				emit_AssociationAction_OtherKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_AttributeAction_AKeyword_1_2_or_AnKeyword_1_1_or_TheKeyword_1_0.equals(syntax))
				emit_AttributeAction_AKeyword_1_2_or_AnKeyword_1_1_or_TheKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Attribute_AttributeKeyword_0_q.equals(syntax))
				emit_Attribute_AttributeKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ChangeStatement___AKeyword_1_0_2_1_1_0_or_AnKeyword_1_0_2_1_1_1__q.equals(syntax))
				emit_ChangeStatement___AKeyword_1_0_2_1_1_0_or_AnKeyword_1_0_2_1_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Class_ClassKeyword_2_q.equals(syntax))
				emit_Class_ClassKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Class___AKeyword_0_1_or_TheKeyword_0_0__q.equals(syntax))
				emit_Class___AKeyword_0_1_or_TheKeyword_0_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_CompositionAction_ComposeKeyword_0_0_or_ComposesKeyword_0_1.equals(syntax))
				emit_CompositionAction_ComposeKeyword_0_0_or_ComposesKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_CreationStatement_BeKeyword_3_1_or_ExistKeyword_3_0.equals(syntax))
				emit_CreationStatement_BeKeyword_3_1_or_ExistKeyword_3_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Statement_FullStopKeyword_1_q.equals(syntax))
				emit_Statement_FullStopKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_UpdateAction_AKeyword_1_1_or_AnKeyword_1_0.equals(syntax))
				emit_UpdateAction_AKeyword_1_1_or_AnKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_UpdateAction_ExistingKeyword_2_q.equals(syntax))
				emit_UpdateAction_ExistingKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_UpdateAttributeIdentifier___AKeyword_1_0_or_AnKeyword_1_1__q.equals(syntax))
				emit_UpdateAttributeIdentifier___AKeyword_1_0_or_AnKeyword_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_UpdateAttributeValue_AKeyword_1_q.equals(syntax))
				emit_UpdateAttributeValue_AKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'other'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'have' 'associations' 'to' (ambiguity) target=Class
	 
	 * </pre>
	 */
	protected void emit_AssociationAction_OtherKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'the' | 'an' | 'a'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'have' (ambiguity) attribute=Attribute
	 
	 * </pre>
	 */
	protected void emit_AttributeAction_AKeyword_1_2_or_AnKeyword_1_1_or_TheKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'attribute'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) name=ID
	 
	 * </pre>
	 */
	protected void emit_Attribute_AttributeKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('a' | 'an')?
	 *
	 * This ambiguous syntax occurs at:
	 *     negation?='not' 'have' (ambiguity) identifier=Identifier
	 *     priority=Priority 'have' (ambiguity) identifier=Identifier
	 
	 * </pre>
	 */
	protected void emit_ChangeStatement___AKeyword_1_0_2_1_1_0_or_AnKeyword_1_0_2_1_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'class'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) ('the' | 'a')? (ambiguity) name=ID
	 *     abstract=Abstraction (ambiguity) name=ID
	 
	 * </pre>
	 */
	protected void emit_Class_ClassKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('the' | 'a')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'class'? name=ID
	 *     (rule start) (ambiguity) abstract=Abstraction
	 
	 * </pre>
	 */
	protected void emit_Class___AKeyword_0_1_or_TheKeyword_0_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'compose' | 'composes'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) target=Class
	 
	 * </pre>
	 */
	protected void emit_CompositionAction_ComposeKeyword_0_0_or_ComposesKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'exist' | 'be'
	 *
	 * This ambiguous syntax occurs at:
	 *     negation?='not' (ambiguity) '.'? (rule end)
	 *     negation?='not' (ambiguity) (rule end)
	 *     priority=Priority (ambiguity) '.'? (rule end)
	 *     priority=Priority (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_CreationStatement_BeKeyword_3_1_or_ExistKeyword_3_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '.'?
	 *
	 * This ambiguous syntax occurs at:
	 *     action=Action (ambiguity) (rule end)
	 *     identifier=Identifier (ambiguity) (rule end)
	 *     negation?='not' ('exist' | 'be') (ambiguity) (rule end)
	 *     priority=Priority ('exist' | 'be') (ambiguity) (rule end)
	 *     update=UpdateAction (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_Statement_FullStopKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'an' | 'a'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'has' (ambiguity) 'existing'? attribute=Attribute
	 
	 * </pre>
	 */
	protected void emit_UpdateAction_AKeyword_1_1_or_AnKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'existing'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'has' ('an' | 'a') (ambiguity) attribute=Attribute
	 
	 * </pre>
	 */
	protected void emit_UpdateAction_ExistingKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('a' | 'an')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'have' (ambiguity) identifier=Identifier
	 
	 * </pre>
	 */
	protected void emit_UpdateAttributeIdentifier___AKeyword_1_0_or_AnKeyword_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'a'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'have' (ambiguity) 'value' value=ID
	 
	 * </pre>
	 */
	protected void emit_UpdateAttributeValue_AKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
