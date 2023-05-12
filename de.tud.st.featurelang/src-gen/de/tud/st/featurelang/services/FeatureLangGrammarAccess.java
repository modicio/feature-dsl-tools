/*
 * generated by Xtext 2.30.0
 */
package de.tud.st.featurelang.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class FeatureLangGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class FeatureRequestElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.tud.st.featurelang.FeatureLang.FeatureRequest");
		private final Assignment cStatementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cStatementsStatementParserRuleCall_0 = (RuleCall)cStatementsAssignment.eContents().get(0);
		
		//FeatureRequest:
		//    (statements+=Statement)*;
		@Override public ParserRule getRule() { return rule; }
		
		//(statements+=Statement)*
		public Assignment getStatementsAssignment() { return cStatementsAssignment; }
		
		//Statement
		public RuleCall getStatementsStatementParserRuleCall_0() { return cStatementsStatementParserRuleCall_0; }
	}
	public class StatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.tud.st.featurelang.FeatureLang.Statement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTargetAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTargetClassParserRuleCall_0_0 = (RuleCall)cTargetAssignment_0.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Assignment cPriorityAssignment_1_0_0 = (Assignment)cGroup_1_0.eContents().get(0);
		private final RuleCall cPriorityPriorityParserRuleCall_1_0_0_0 = (RuleCall)cPriorityAssignment_1_0_0.eContents().get(0);
		private final Assignment cNegationAssignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final Keyword cNegationNotKeyword_1_0_1_0 = (Keyword)cNegationAssignment_1_0_1.eContents().get(0);
		private final Assignment cActionAssignment_1_0_2 = (Assignment)cGroup_1_0.eContents().get(2);
		private final RuleCall cActionActionParserRuleCall_1_0_2_0 = (RuleCall)cActionAssignment_1_0_2.eContents().get(0);
		private final Assignment cUpdateAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cUpdateUpdateActionParserRuleCall_1_1_0 = (RuleCall)cUpdateAssignment_1_1.eContents().get(0);
		private final Keyword cFullStopKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Statement hidden(WS):
		//    target=Class
		//    ((priority=Priority (negation ?= 'not')? action=Action) | update=UpdateAction)
		//    ('.')?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//target=Class
		//((priority=Priority (negation ?= 'not')? action=Action) | update=UpdateAction)
		//('.')?
		public Group getGroup() { return cGroup; }
		
		//target=Class
		public Assignment getTargetAssignment_0() { return cTargetAssignment_0; }
		
		//Class
		public RuleCall getTargetClassParserRuleCall_0_0() { return cTargetClassParserRuleCall_0_0; }
		
		//((priority=Priority (negation ?= 'not')? action=Action) | update=UpdateAction)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//(priority=Priority (negation ?= 'not')? action=Action)
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//priority=Priority
		public Assignment getPriorityAssignment_1_0_0() { return cPriorityAssignment_1_0_0; }
		
		//Priority
		public RuleCall getPriorityPriorityParserRuleCall_1_0_0_0() { return cPriorityPriorityParserRuleCall_1_0_0_0; }
		
		//(negation ?= 'not')?
		public Assignment getNegationAssignment_1_0_1() { return cNegationAssignment_1_0_1; }
		
		//'not'
		public Keyword getNegationNotKeyword_1_0_1_0() { return cNegationNotKeyword_1_0_1_0; }
		
		//action=Action
		public Assignment getActionAssignment_1_0_2() { return cActionAssignment_1_0_2; }
		
		//Action
		public RuleCall getActionActionParserRuleCall_1_0_2_0() { return cActionActionParserRuleCall_1_0_2_0; }
		
		//update=UpdateAction
		public Assignment getUpdateAssignment_1_1() { return cUpdateAssignment_1_1; }
		
		//UpdateAction
		public RuleCall getUpdateUpdateActionParserRuleCall_1_1_0() { return cUpdateUpdateActionParserRuleCall_1_1_0; }
		
		//('.')?
		public Keyword getFullStopKeyword_2() { return cFullStopKeyword_2; }
	}
	public class ActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.tud.st.featurelang.FeatureLang.Action");
		private final Assignment cTypeAssignment = (Assignment)rule.eContents().get(1);
		private final Alternatives cTypeAlternatives_0 = (Alternatives)cTypeAssignment.eContents().get(0);
		private final RuleCall cTypeAttributeActionParserRuleCall_0_0 = (RuleCall)cTypeAlternatives_0.eContents().get(0);
		private final RuleCall cTypeAssociationActionParserRuleCall_0_1 = (RuleCall)cTypeAlternatives_0.eContents().get(1);
		private final RuleCall cTypeInheritanceActionParserRuleCall_0_2 = (RuleCall)cTypeAlternatives_0.eContents().get(2);
		
		//Action hidden(WS):
		//    type=(AttributeAction | AssociationAction | InheritanceAction)
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//type=(AttributeAction | AssociationAction | InheritanceAction)
		public Assignment getTypeAssignment() { return cTypeAssignment; }
		
		//(AttributeAction | AssociationAction | InheritanceAction)
		public Alternatives getTypeAlternatives_0() { return cTypeAlternatives_0; }
		
		//AttributeAction
		public RuleCall getTypeAttributeActionParserRuleCall_0_0() { return cTypeAttributeActionParserRuleCall_0_0; }
		
		//AssociationAction
		public RuleCall getTypeAssociationActionParserRuleCall_0_1() { return cTypeAssociationActionParserRuleCall_0_1; }
		
		//InheritanceAction
		public RuleCall getTypeInheritanceActionParserRuleCall_0_2() { return cTypeInheritanceActionParserRuleCall_0_2; }
	}
	public class UpdateActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.tud.st.featurelang.FeatureLang.UpdateAction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHasKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cAnKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cExistingKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAttributeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAttributeAttributeParserRuleCall_3_0 = (RuleCall)cAttributeAssignment_3.eContents().get(0);
		private final Keyword cFullStopKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cItKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cPriorityAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cPriorityPriorityParserRuleCall_6_0 = (RuleCall)cPriorityAssignment_6.eContents().get(0);
		private final Keyword cBeKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cAKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cTypeAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cTypeDatatypeEnumRuleCall_9_0 = (RuleCall)cTypeAssignment_9.eContents().get(0);
		
		//UpdateAction hidden(WS):
		//    'has' 'an' 'existing'
		//    attribute=Attribute '.' 'it' priority=Priority 'be' 'a' type=Datatype
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'has' 'an' 'existing'
		//attribute=Attribute '.' 'it' priority=Priority 'be' 'a' type=Datatype
		public Group getGroup() { return cGroup; }
		
		//'has'
		public Keyword getHasKeyword_0() { return cHasKeyword_0; }
		
		//'an'
		public Keyword getAnKeyword_1() { return cAnKeyword_1; }
		
		//'existing'
		public Keyword getExistingKeyword_2() { return cExistingKeyword_2; }
		
		//attribute=Attribute
		public Assignment getAttributeAssignment_3() { return cAttributeAssignment_3; }
		
		//Attribute
		public RuleCall getAttributeAttributeParserRuleCall_3_0() { return cAttributeAttributeParserRuleCall_3_0; }
		
		//'.'
		public Keyword getFullStopKeyword_4() { return cFullStopKeyword_4; }
		
		//'it'
		public Keyword getItKeyword_5() { return cItKeyword_5; }
		
		//priority=Priority
		public Assignment getPriorityAssignment_6() { return cPriorityAssignment_6; }
		
		//Priority
		public RuleCall getPriorityPriorityParserRuleCall_6_0() { return cPriorityPriorityParserRuleCall_6_0; }
		
		//'be'
		public Keyword getBeKeyword_7() { return cBeKeyword_7; }
		
		//'a'
		public Keyword getAKeyword_8() { return cAKeyword_8; }
		
		//type=Datatype
		public Assignment getTypeAssignment_9() { return cTypeAssignment_9; }
		
		//Datatype
		public RuleCall getTypeDatatypeEnumRuleCall_9_0() { return cTypeDatatypeEnumRuleCall_9_0; }
	}
	public class AttributeActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.tud.st.featurelang.FeatureLang.AttributeAction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHaveKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cTheKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cAttributeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAttributeAttributeParserRuleCall_2_0 = (RuleCall)cAttributeAssignment_2.eContents().get(0);
		private final Keyword cFullStopKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cItKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cIsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cAKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cTypeAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cTypeDatatypeEnumRuleCall_7_0 = (RuleCall)cTypeAssignment_7.eContents().get(0);
		
		//AttributeAction hidden(WS):
		//    'have' 'the' attribute=Attribute '.'
		//    'it' 'is' 'a' type=Datatype
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'have' 'the' attribute=Attribute '.'
		//'it' 'is' 'a' type=Datatype
		public Group getGroup() { return cGroup; }
		
		//'have'
		public Keyword getHaveKeyword_0() { return cHaveKeyword_0; }
		
		//'the'
		public Keyword getTheKeyword_1() { return cTheKeyword_1; }
		
		//attribute=Attribute
		public Assignment getAttributeAssignment_2() { return cAttributeAssignment_2; }
		
		//Attribute
		public RuleCall getAttributeAttributeParserRuleCall_2_0() { return cAttributeAttributeParserRuleCall_2_0; }
		
		//'.'
		public Keyword getFullStopKeyword_3() { return cFullStopKeyword_3; }
		
		//'it'
		public Keyword getItKeyword_4() { return cItKeyword_4; }
		
		//'is'
		public Keyword getIsKeyword_5() { return cIsKeyword_5; }
		
		//'a'
		public Keyword getAKeyword_6() { return cAKeyword_6; }
		
		//type=Datatype
		public Assignment getTypeAssignment_7() { return cTypeAssignment_7; }
		
		//Datatype
		public RuleCall getTypeDatatypeEnumRuleCall_7_0() { return cTypeDatatypeEnumRuleCall_7_0; }
	}
	public class AssociationActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.tud.st.featurelang.FeatureLang.AssociationAction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHaveKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cAssociationsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cToKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cClassAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cClassClassParserRuleCall_3_0 = (RuleCall)cClassAssignment_3.eContents().get(0);
		
		//AssociationAction hidden(WS):
		//    'have' 'associations' 'to' class=Class
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'have' 'associations' 'to' class=Class
		public Group getGroup() { return cGroup; }
		
		//'have'
		public Keyword getHaveKeyword_0() { return cHaveKeyword_0; }
		
		//'associations'
		public Keyword getAssociationsKeyword_1() { return cAssociationsKeyword_1; }
		
		//'to'
		public Keyword getToKeyword_2() { return cToKeyword_2; }
		
		//class=Class
		public Assignment getClassAssignment_3() { return cClassAssignment_3; }
		
		//Class
		public RuleCall getClassClassParserRuleCall_3_0() { return cClassClassParserRuleCall_3_0; }
	}
	public class InheritanceActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.tud.st.featurelang.FeatureLang.InheritanceAction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInheritKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cFromKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cClassAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cClassClassParserRuleCall_2_0 = (RuleCall)cClassAssignment_2.eContents().get(0);
		
		//InheritanceAction hidden(WS):
		//    'inherit' 'from' class=Class
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'inherit' 'from' class=Class
		public Group getGroup() { return cGroup; }
		
		//'inherit'
		public Keyword getInheritKeyword_0() { return cInheritKeyword_0; }
		
		//'from'
		public Keyword getFromKeyword_1() { return cFromKeyword_1; }
		
		//class=Class
		public Assignment getClassAssignment_2() { return cClassAssignment_2; }
		
		//Class
		public RuleCall getClassClassParserRuleCall_2_0() { return cClassClassParserRuleCall_2_0; }
	}
	public class ClassElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.tud.st.featurelang.FeatureLang.Class");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTheKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cClassKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		
		//Class hidden(WS):
		//    ('the')? 'class' name=ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//('the')? 'class' name=ID
		public Group getGroup() { return cGroup; }
		
		//('the')?
		public Keyword getTheKeyword_0() { return cTheKeyword_0; }
		
		//'class'
		public Keyword getClassKeyword_1() { return cClassKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
	}
	public class AttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.tud.st.featurelang.FeatureLang.Attribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Keyword cAttributeKeyword_0_0 = (Keyword)cAlternatives_0.eContents().get(0);
		private final Keyword cAttributeKeyword_0_1 = (Keyword)cAlternatives_0.eContents().get(1);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Attribute hidden(WS):
		//    ('Attribute' | 'attribute') name=ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//('Attribute' | 'attribute') name=ID
		public Group getGroup() { return cGroup; }
		
		//('Attribute' | 'attribute')
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//'Attribute'
		public Keyword getAttributeKeyword_0_0() { return cAttributeKeyword_0_0; }
		
		//'attribute'
		public Keyword getAttributeKeyword_0_1() { return cAttributeKeyword_0_1; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class PriorityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.tud.st.featurelang.FeatureLang.Priority");
		private final Assignment cPriorityAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cPriorityPriorityValueEnumRuleCall_0 = (RuleCall)cPriorityAssignment.eContents().get(0);
		
		//Priority hidden(WS):
		//    priority=PriorityValue
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//priority=PriorityValue
		public Assignment getPriorityAssignment() { return cPriorityAssignment; }
		
		//PriorityValue
		public RuleCall getPriorityPriorityValueEnumRuleCall_0() { return cPriorityPriorityValueEnumRuleCall_0; }
	}
	
	public class PriorityValueElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "de.tud.st.featurelang.FeatureLang.PriorityValue");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cSHOULDEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cSHOULDShouldKeyword_0_0 = (Keyword)cSHOULDEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cMUSTEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cMUSTMustKeyword_1_0 = (Keyword)cMUSTEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum PriorityValue:
		//    SHOULD='should' | MUST='must'
		//;
		public EnumRule getRule() { return rule; }
		
		//SHOULD='should' | MUST='must'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//SHOULD='should'
		public EnumLiteralDeclaration getSHOULDEnumLiteralDeclaration_0() { return cSHOULDEnumLiteralDeclaration_0; }
		
		//'should'
		public Keyword getSHOULDShouldKeyword_0_0() { return cSHOULDShouldKeyword_0_0; }
		
		//MUST='must'
		public EnumLiteralDeclaration getMUSTEnumLiteralDeclaration_1() { return cMUSTEnumLiteralDeclaration_1; }
		
		//'must'
		public Keyword getMUSTMustKeyword_1_0() { return cMUSTMustKeyword_1_0; }
	}
	public class DatatypeElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "de.tud.st.featurelang.FeatureLang.Datatype");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cWORDEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cWORDWordKeyword_0_0 = (Keyword)cWORDEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cPHRASEEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cPHRASEPhraseKeyword_1_0 = (Keyword)cPHRASEEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cNUMBEREnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cNUMBERNumberKeyword_2_0 = (Keyword)cNUMBEREnumLiteralDeclaration_2.eContents().get(0);
		
		//enum Datatype:
		//    WORD='word' | PHRASE='phrase' | NUMBER='number'
		//;
		public EnumRule getRule() { return rule; }
		
		//WORD='word' | PHRASE='phrase' | NUMBER='number'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//WORD='word'
		public EnumLiteralDeclaration getWORDEnumLiteralDeclaration_0() { return cWORDEnumLiteralDeclaration_0; }
		
		//'word'
		public Keyword getWORDWordKeyword_0_0() { return cWORDWordKeyword_0_0; }
		
		//PHRASE='phrase'
		public EnumLiteralDeclaration getPHRASEEnumLiteralDeclaration_1() { return cPHRASEEnumLiteralDeclaration_1; }
		
		//'phrase'
		public Keyword getPHRASEPhraseKeyword_1_0() { return cPHRASEPhraseKeyword_1_0; }
		
		//NUMBER='number'
		public EnumLiteralDeclaration getNUMBEREnumLiteralDeclaration_2() { return cNUMBEREnumLiteralDeclaration_2; }
		
		//'number'
		public Keyword getNUMBERNumberKeyword_2_0() { return cNUMBERNumberKeyword_2_0; }
	}
	
	private final FeatureRequestElements pFeatureRequest;
	private final StatementElements pStatement;
	private final ActionElements pAction;
	private final UpdateActionElements pUpdateAction;
	private final AttributeActionElements pAttributeAction;
	private final AssociationActionElements pAssociationAction;
	private final InheritanceActionElements pInheritanceAction;
	private final ClassElements pClass;
	private final AttributeElements pAttribute;
	private final PriorityElements pPriority;
	private final PriorityValueElements ePriorityValue;
	private final DatatypeElements eDatatype;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public FeatureLangGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pFeatureRequest = new FeatureRequestElements();
		this.pStatement = new StatementElements();
		this.pAction = new ActionElements();
		this.pUpdateAction = new UpdateActionElements();
		this.pAttributeAction = new AttributeActionElements();
		this.pAssociationAction = new AssociationActionElements();
		this.pInheritanceAction = new InheritanceActionElements();
		this.pClass = new ClassElements();
		this.pAttribute = new AttributeElements();
		this.pPriority = new PriorityElements();
		this.ePriorityValue = new PriorityValueElements();
		this.eDatatype = new DatatypeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("de.tud.st.featurelang.FeatureLang".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//FeatureRequest:
	//    (statements+=Statement)*;
	public FeatureRequestElements getFeatureRequestAccess() {
		return pFeatureRequest;
	}
	
	public ParserRule getFeatureRequestRule() {
		return getFeatureRequestAccess().getRule();
	}
	
	//Statement hidden(WS):
	//    target=Class
	//    ((priority=Priority (negation ?= 'not')? action=Action) | update=UpdateAction)
	//    ('.')?
	//;
	public StatementElements getStatementAccess() {
		return pStatement;
	}
	
	public ParserRule getStatementRule() {
		return getStatementAccess().getRule();
	}
	
	//Action hidden(WS):
	//    type=(AttributeAction | AssociationAction | InheritanceAction)
	//;
	public ActionElements getActionAccess() {
		return pAction;
	}
	
	public ParserRule getActionRule() {
		return getActionAccess().getRule();
	}
	
	//UpdateAction hidden(WS):
	//    'has' 'an' 'existing'
	//    attribute=Attribute '.' 'it' priority=Priority 'be' 'a' type=Datatype
	//;
	public UpdateActionElements getUpdateActionAccess() {
		return pUpdateAction;
	}
	
	public ParserRule getUpdateActionRule() {
		return getUpdateActionAccess().getRule();
	}
	
	//AttributeAction hidden(WS):
	//    'have' 'the' attribute=Attribute '.'
	//    'it' 'is' 'a' type=Datatype
	//;
	public AttributeActionElements getAttributeActionAccess() {
		return pAttributeAction;
	}
	
	public ParserRule getAttributeActionRule() {
		return getAttributeActionAccess().getRule();
	}
	
	//AssociationAction hidden(WS):
	//    'have' 'associations' 'to' class=Class
	//;
	public AssociationActionElements getAssociationActionAccess() {
		return pAssociationAction;
	}
	
	public ParserRule getAssociationActionRule() {
		return getAssociationActionAccess().getRule();
	}
	
	//InheritanceAction hidden(WS):
	//    'inherit' 'from' class=Class
	//;
	public InheritanceActionElements getInheritanceActionAccess() {
		return pInheritanceAction;
	}
	
	public ParserRule getInheritanceActionRule() {
		return getInheritanceActionAccess().getRule();
	}
	
	//Class hidden(WS):
	//    ('the')? 'class' name=ID
	//;
	public ClassElements getClassAccess() {
		return pClass;
	}
	
	public ParserRule getClassRule() {
		return getClassAccess().getRule();
	}
	
	//Attribute hidden(WS):
	//    ('Attribute' | 'attribute') name=ID
	//;
	public AttributeElements getAttributeAccess() {
		return pAttribute;
	}
	
	public ParserRule getAttributeRule() {
		return getAttributeAccess().getRule();
	}
	
	//Priority hidden(WS):
	//    priority=PriorityValue
	//;
	public PriorityElements getPriorityAccess() {
		return pPriority;
	}
	
	public ParserRule getPriorityRule() {
		return getPriorityAccess().getRule();
	}
	
	//enum PriorityValue:
	//    SHOULD='should' | MUST='must'
	//;
	public PriorityValueElements getPriorityValueAccess() {
		return ePriorityValue;
	}
	
	public EnumRule getPriorityValueRule() {
		return getPriorityValueAccess().getRule();
	}
	
	//enum Datatype:
	//    WORD='word' | PHRASE='phrase' | NUMBER='number'
	//;
	public DatatypeElements getDatatypeAccess() {
		return eDatatype;
	}
	
	public EnumRule getDatatypeRule() {
		return getDatatypeAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}