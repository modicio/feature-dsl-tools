package de.tud.st.featurelang.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.tud.st.featurelang.services.FeatureLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFeatureLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'not'", "'.'", "'has'", "'an'", "'existing'", "'it'", "'be'", "'a'", "'have'", "'the'", "'is'", "'associations'", "'to'", "'called'", "'inherit'", "'from'", "'class'", "'attribute'", "'should'", "'must'", "'word'", "'phrase'", "'number'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalFeatureLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFeatureLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFeatureLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFeatureLang.g"; }



     	private FeatureLangGrammarAccess grammarAccess;

        public InternalFeatureLangParser(TokenStream input, FeatureLangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "FeatureRequest";
       	}

       	@Override
       	protected FeatureLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFeatureRequest"
    // InternalFeatureLang.g:65:1: entryRuleFeatureRequest returns [EObject current=null] : iv_ruleFeatureRequest= ruleFeatureRequest EOF ;
    public final EObject entryRuleFeatureRequest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureRequest = null;


        try {
            // InternalFeatureLang.g:65:55: (iv_ruleFeatureRequest= ruleFeatureRequest EOF )
            // InternalFeatureLang.g:66:2: iv_ruleFeatureRequest= ruleFeatureRequest EOF
            {
             newCompositeNode(grammarAccess.getFeatureRequestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureRequest=ruleFeatureRequest();

            state._fsp--;

             current =iv_ruleFeatureRequest; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureRequest"


    // $ANTLR start "ruleFeatureRequest"
    // InternalFeatureLang.g:72:1: ruleFeatureRequest returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleFeatureRequest() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalFeatureLang.g:78:2: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // InternalFeatureLang.g:79:2: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // InternalFeatureLang.g:79:2: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==20||LA1_0==27) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFeatureLang.g:80:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalFeatureLang.g:80:3: (lv_statements_0_0= ruleStatement )
            	    // InternalFeatureLang.g:81:4: lv_statements_0_0= ruleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getFeatureRequestAccess().getStatementsStatementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getFeatureRequestRule());
            	    				}
            	    				add(
            	    					current,
            	    					"statements",
            	    					lv_statements_0_0,
            	    					"de.tud.st.featurelang.FeatureLang.Statement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureRequest"


    // $ANTLR start "entryRuleStatement"
    // InternalFeatureLang.g:101:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLang.g:103:2: (iv_ruleStatement= ruleStatement EOF )
            // InternalFeatureLang.g:104:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalFeatureLang.g:113:1: ruleStatement returns [EObject current=null] : ( ( (lv_target_0_0= ruleClass ) ) ( ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= 'not' ) )? ( (lv_action_3_0= ruleAction ) ) ) | ( (lv_update_4_0= ruleUpdateAction ) ) ) (otherlv_5= '.' )? ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token lv_negation_2_0=null;
        Token otherlv_5=null;
        EObject lv_target_0_0 = null;

        EObject lv_priority_1_0 = null;

        EObject lv_action_3_0 = null;

        EObject lv_update_4_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLang.g:120:2: ( ( ( (lv_target_0_0= ruleClass ) ) ( ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= 'not' ) )? ( (lv_action_3_0= ruleAction ) ) ) | ( (lv_update_4_0= ruleUpdateAction ) ) ) (otherlv_5= '.' )? ) )
            // InternalFeatureLang.g:121:2: ( ( (lv_target_0_0= ruleClass ) ) ( ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= 'not' ) )? ( (lv_action_3_0= ruleAction ) ) ) | ( (lv_update_4_0= ruleUpdateAction ) ) ) (otherlv_5= '.' )? )
            {
            // InternalFeatureLang.g:121:2: ( ( (lv_target_0_0= ruleClass ) ) ( ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= 'not' ) )? ( (lv_action_3_0= ruleAction ) ) ) | ( (lv_update_4_0= ruleUpdateAction ) ) ) (otherlv_5= '.' )? )
            // InternalFeatureLang.g:122:3: ( (lv_target_0_0= ruleClass ) ) ( ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= 'not' ) )? ( (lv_action_3_0= ruleAction ) ) ) | ( (lv_update_4_0= ruleUpdateAction ) ) ) (otherlv_5= '.' )?
            {
            // InternalFeatureLang.g:122:3: ( (lv_target_0_0= ruleClass ) )
            // InternalFeatureLang.g:123:4: (lv_target_0_0= ruleClass )
            {
            // InternalFeatureLang.g:123:4: (lv_target_0_0= ruleClass )
            // InternalFeatureLang.g:124:5: lv_target_0_0= ruleClass
            {

            					newCompositeNode(grammarAccess.getStatementAccess().getTargetClassParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_target_0_0=ruleClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatementRule());
            					}
            					set(
            						current,
            						"target",
            						lv_target_0_0,
            						"de.tud.st.featurelang.FeatureLang.Class");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFeatureLang.g:141:3: ( ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= 'not' ) )? ( (lv_action_3_0= ruleAction ) ) ) | ( (lv_update_4_0= ruleUpdateAction ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=29 && LA3_0<=30)) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalFeatureLang.g:142:4: ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= 'not' ) )? ( (lv_action_3_0= ruleAction ) ) )
                    {
                    // InternalFeatureLang.g:142:4: ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= 'not' ) )? ( (lv_action_3_0= ruleAction ) ) )
                    // InternalFeatureLang.g:143:5: ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= 'not' ) )? ( (lv_action_3_0= ruleAction ) )
                    {
                    // InternalFeatureLang.g:143:5: ( (lv_priority_1_0= rulePriority ) )
                    // InternalFeatureLang.g:144:6: (lv_priority_1_0= rulePriority )
                    {
                    // InternalFeatureLang.g:144:6: (lv_priority_1_0= rulePriority )
                    // InternalFeatureLang.g:145:7: lv_priority_1_0= rulePriority
                    {

                    							newCompositeNode(grammarAccess.getStatementAccess().getPriorityPriorityParserRuleCall_1_0_0_0());
                    						
                    pushFollow(FOLLOW_5);
                    lv_priority_1_0=rulePriority();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getStatementRule());
                    							}
                    							set(
                    								current,
                    								"priority",
                    								lv_priority_1_0,
                    								"de.tud.st.featurelang.FeatureLang.Priority");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalFeatureLang.g:162:5: ( (lv_negation_2_0= 'not' ) )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==11) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalFeatureLang.g:163:6: (lv_negation_2_0= 'not' )
                            {
                            // InternalFeatureLang.g:163:6: (lv_negation_2_0= 'not' )
                            // InternalFeatureLang.g:164:7: lv_negation_2_0= 'not'
                            {
                            lv_negation_2_0=(Token)match(input,11,FOLLOW_5); 

                            							newLeafNode(lv_negation_2_0, grammarAccess.getStatementAccess().getNegationNotKeyword_1_0_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getStatementRule());
                            							}
                            							setWithLastConsumed(current, "negation", lv_negation_2_0 != null, "not");
                            						

                            }


                            }
                            break;

                    }

                    // InternalFeatureLang.g:176:5: ( (lv_action_3_0= ruleAction ) )
                    // InternalFeatureLang.g:177:6: (lv_action_3_0= ruleAction )
                    {
                    // InternalFeatureLang.g:177:6: (lv_action_3_0= ruleAction )
                    // InternalFeatureLang.g:178:7: lv_action_3_0= ruleAction
                    {

                    							newCompositeNode(grammarAccess.getStatementAccess().getActionActionParserRuleCall_1_0_2_0());
                    						
                    pushFollow(FOLLOW_6);
                    lv_action_3_0=ruleAction();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getStatementRule());
                    							}
                    							set(
                    								current,
                    								"action",
                    								lv_action_3_0,
                    								"de.tud.st.featurelang.FeatureLang.Action");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLang.g:197:4: ( (lv_update_4_0= ruleUpdateAction ) )
                    {
                    // InternalFeatureLang.g:197:4: ( (lv_update_4_0= ruleUpdateAction ) )
                    // InternalFeatureLang.g:198:5: (lv_update_4_0= ruleUpdateAction )
                    {
                    // InternalFeatureLang.g:198:5: (lv_update_4_0= ruleUpdateAction )
                    // InternalFeatureLang.g:199:6: lv_update_4_0= ruleUpdateAction
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getUpdateUpdateActionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_update_4_0=ruleUpdateAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"update",
                    							lv_update_4_0,
                    							"de.tud.st.featurelang.FeatureLang.UpdateAction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFeatureLang.g:217:3: (otherlv_5= '.' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalFeatureLang.g:218:4: otherlv_5= '.'
                    {
                    otherlv_5=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getStatementAccess().getFullStopKeyword_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleAction"
    // InternalFeatureLang.g:230:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLang.g:232:2: (iv_ruleAction= ruleAction EOF )
            // InternalFeatureLang.g:233:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalFeatureLang.g:242:1: ruleAction returns [EObject current=null] : ( ( (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_1 = null;

        EObject lv_type_0_2 = null;

        EObject lv_type_0_3 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLang.g:249:2: ( ( ( (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction ) ) ) )
            // InternalFeatureLang.g:250:2: ( ( (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction ) ) )
            {
            // InternalFeatureLang.g:250:2: ( ( (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction ) ) )
            // InternalFeatureLang.g:251:3: ( (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction ) )
            {
            // InternalFeatureLang.g:251:3: ( (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction ) )
            // InternalFeatureLang.g:252:4: (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction )
            {
            // InternalFeatureLang.g:252:4: (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==20) ) {
                    alt5=1;
                }
                else if ( (LA5_1==22) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==25) ) {
                alt5=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalFeatureLang.g:253:5: lv_type_0_1= ruleAttributeAction
                    {

                    					newCompositeNode(grammarAccess.getActionAccess().getTypeAttributeActionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_1=ruleAttributeAction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActionRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_1,
                    						"de.tud.st.featurelang.FeatureLang.AttributeAction");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalFeatureLang.g:269:5: lv_type_0_2= ruleAssociationAction
                    {

                    					newCompositeNode(grammarAccess.getActionAccess().getTypeAssociationActionParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_2=ruleAssociationAction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActionRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_2,
                    						"de.tud.st.featurelang.FeatureLang.AssociationAction");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 3 :
                    // InternalFeatureLang.g:285:5: lv_type_0_3= ruleInheritanceAction
                    {

                    					newCompositeNode(grammarAccess.getActionAccess().getTypeInheritanceActionParserRuleCall_0_2());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_3=ruleInheritanceAction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActionRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_3,
                    						"de.tud.st.featurelang.FeatureLang.InheritanceAction");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleUpdateAction"
    // InternalFeatureLang.g:309:1: entryRuleUpdateAction returns [EObject current=null] : iv_ruleUpdateAction= ruleUpdateAction EOF ;
    public final EObject entryRuleUpdateAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateAction = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLang.g:311:2: (iv_ruleUpdateAction= ruleUpdateAction EOF )
            // InternalFeatureLang.g:312:2: iv_ruleUpdateAction= ruleUpdateAction EOF
            {
             newCompositeNode(grammarAccess.getUpdateActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpdateAction=ruleUpdateAction();

            state._fsp--;

             current =iv_ruleUpdateAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleUpdateAction"


    // $ANTLR start "ruleUpdateAction"
    // InternalFeatureLang.g:321:1: ruleUpdateAction returns [EObject current=null] : (otherlv_0= 'has' otherlv_1= 'an' otherlv_2= 'existing' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= '.' otherlv_5= 'it' ( (lv_priority_6_0= rulePriority ) ) otherlv_7= 'be' otherlv_8= 'a' ( (lv_type_9_0= ruleDatatype ) ) ) ;
    public final EObject ruleUpdateAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_attribute_3_0 = null;

        EObject lv_priority_6_0 = null;

        Enumerator lv_type_9_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLang.g:328:2: ( (otherlv_0= 'has' otherlv_1= 'an' otherlv_2= 'existing' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= '.' otherlv_5= 'it' ( (lv_priority_6_0= rulePriority ) ) otherlv_7= 'be' otherlv_8= 'a' ( (lv_type_9_0= ruleDatatype ) ) ) )
            // InternalFeatureLang.g:329:2: (otherlv_0= 'has' otherlv_1= 'an' otherlv_2= 'existing' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= '.' otherlv_5= 'it' ( (lv_priority_6_0= rulePriority ) ) otherlv_7= 'be' otherlv_8= 'a' ( (lv_type_9_0= ruleDatatype ) ) )
            {
            // InternalFeatureLang.g:329:2: (otherlv_0= 'has' otherlv_1= 'an' otherlv_2= 'existing' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= '.' otherlv_5= 'it' ( (lv_priority_6_0= rulePriority ) ) otherlv_7= 'be' otherlv_8= 'a' ( (lv_type_9_0= ruleDatatype ) ) )
            // InternalFeatureLang.g:330:3: otherlv_0= 'has' otherlv_1= 'an' otherlv_2= 'existing' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= '.' otherlv_5= 'it' ( (lv_priority_6_0= rulePriority ) ) otherlv_7= 'be' otherlv_8= 'a' ( (lv_type_9_0= ruleDatatype ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getUpdateActionAccess().getHasKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getUpdateActionAccess().getAnKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getUpdateActionAccess().getExistingKeyword_2());
            		
            // InternalFeatureLang.g:342:3: ( (lv_attribute_3_0= ruleAttribute ) )
            // InternalFeatureLang.g:343:4: (lv_attribute_3_0= ruleAttribute )
            {
            // InternalFeatureLang.g:343:4: (lv_attribute_3_0= ruleAttribute )
            // InternalFeatureLang.g:344:5: lv_attribute_3_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getUpdateActionAccess().getAttributeAttributeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_attribute_3_0=ruleAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateActionRule());
            					}
            					set(
            						current,
            						"attribute",
            						lv_attribute_3_0,
            						"de.tud.st.featurelang.FeatureLang.Attribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getUpdateActionAccess().getFullStopKeyword_4());
            		
            otherlv_5=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getUpdateActionAccess().getItKeyword_5());
            		
            // InternalFeatureLang.g:369:3: ( (lv_priority_6_0= rulePriority ) )
            // InternalFeatureLang.g:370:4: (lv_priority_6_0= rulePriority )
            {
            // InternalFeatureLang.g:370:4: (lv_priority_6_0= rulePriority )
            // InternalFeatureLang.g:371:5: lv_priority_6_0= rulePriority
            {

            					newCompositeNode(grammarAccess.getUpdateActionAccess().getPriorityPriorityParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_13);
            lv_priority_6_0=rulePriority();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateActionRule());
            					}
            					set(
            						current,
            						"priority",
            						lv_priority_6_0,
            						"de.tud.st.featurelang.FeatureLang.Priority");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getUpdateActionAccess().getBeKeyword_7());
            		
            otherlv_8=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_8, grammarAccess.getUpdateActionAccess().getAKeyword_8());
            		
            // InternalFeatureLang.g:396:3: ( (lv_type_9_0= ruleDatatype ) )
            // InternalFeatureLang.g:397:4: (lv_type_9_0= ruleDatatype )
            {
            // InternalFeatureLang.g:397:4: (lv_type_9_0= ruleDatatype )
            // InternalFeatureLang.g:398:5: lv_type_9_0= ruleDatatype
            {

            					newCompositeNode(grammarAccess.getUpdateActionAccess().getTypeDatatypeEnumRuleCall_9_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_9_0=ruleDatatype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateActionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_9_0,
            						"de.tud.st.featurelang.FeatureLang.Datatype");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleUpdateAction"


    // $ANTLR start "entryRuleAttributeAction"
    // InternalFeatureLang.g:422:1: entryRuleAttributeAction returns [EObject current=null] : iv_ruleAttributeAction= ruleAttributeAction EOF ;
    public final EObject entryRuleAttributeAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeAction = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLang.g:424:2: (iv_ruleAttributeAction= ruleAttributeAction EOF )
            // InternalFeatureLang.g:425:2: iv_ruleAttributeAction= ruleAttributeAction EOF
            {
             newCompositeNode(grammarAccess.getAttributeActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeAction=ruleAttributeAction();

            state._fsp--;

             current =iv_ruleAttributeAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeAction"


    // $ANTLR start "ruleAttributeAction"
    // InternalFeatureLang.g:434:1: ruleAttributeAction returns [EObject current=null] : (otherlv_0= 'have' otherlv_1= 'the' ( (lv_attribute_2_0= ruleAttribute ) ) otherlv_3= '.' (otherlv_4= 'it' otherlv_5= 'is' otherlv_6= 'a' ( (lv_type_7_0= ruleDatatype ) ) )? ) ;
    public final EObject ruleAttributeAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_attribute_2_0 = null;

        Enumerator lv_type_7_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLang.g:441:2: ( (otherlv_0= 'have' otherlv_1= 'the' ( (lv_attribute_2_0= ruleAttribute ) ) otherlv_3= '.' (otherlv_4= 'it' otherlv_5= 'is' otherlv_6= 'a' ( (lv_type_7_0= ruleDatatype ) ) )? ) )
            // InternalFeatureLang.g:442:2: (otherlv_0= 'have' otherlv_1= 'the' ( (lv_attribute_2_0= ruleAttribute ) ) otherlv_3= '.' (otherlv_4= 'it' otherlv_5= 'is' otherlv_6= 'a' ( (lv_type_7_0= ruleDatatype ) ) )? )
            {
            // InternalFeatureLang.g:442:2: (otherlv_0= 'have' otherlv_1= 'the' ( (lv_attribute_2_0= ruleAttribute ) ) otherlv_3= '.' (otherlv_4= 'it' otherlv_5= 'is' otherlv_6= 'a' ( (lv_type_7_0= ruleDatatype ) ) )? )
            // InternalFeatureLang.g:443:3: otherlv_0= 'have' otherlv_1= 'the' ( (lv_attribute_2_0= ruleAttribute ) ) otherlv_3= '.' (otherlv_4= 'it' otherlv_5= 'is' otherlv_6= 'a' ( (lv_type_7_0= ruleDatatype ) ) )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeActionAccess().getHaveKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeActionAccess().getTheKeyword_1());
            		
            // InternalFeatureLang.g:451:3: ( (lv_attribute_2_0= ruleAttribute ) )
            // InternalFeatureLang.g:452:4: (lv_attribute_2_0= ruleAttribute )
            {
            // InternalFeatureLang.g:452:4: (lv_attribute_2_0= ruleAttribute )
            // InternalFeatureLang.g:453:5: lv_attribute_2_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getAttributeActionAccess().getAttributeAttributeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_attribute_2_0=ruleAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeActionRule());
            					}
            					set(
            						current,
            						"attribute",
            						lv_attribute_2_0,
            						"de.tud.st.featurelang.FeatureLang.Attribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeActionAccess().getFullStopKeyword_3());
            		
            // InternalFeatureLang.g:474:3: (otherlv_4= 'it' otherlv_5= 'is' otherlv_6= 'a' ( (lv_type_7_0= ruleDatatype ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalFeatureLang.g:475:4: otherlv_4= 'it' otherlv_5= 'is' otherlv_6= 'a' ( (lv_type_7_0= ruleDatatype ) )
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getAttributeActionAccess().getItKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getAttributeActionAccess().getIsKeyword_4_1());
                    			
                    otherlv_6=(Token)match(input,18,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getAttributeActionAccess().getAKeyword_4_2());
                    			
                    // InternalFeatureLang.g:487:4: ( (lv_type_7_0= ruleDatatype ) )
                    // InternalFeatureLang.g:488:5: (lv_type_7_0= ruleDatatype )
                    {
                    // InternalFeatureLang.g:488:5: (lv_type_7_0= ruleDatatype )
                    // InternalFeatureLang.g:489:6: lv_type_7_0= ruleDatatype
                    {

                    						newCompositeNode(grammarAccess.getAttributeActionAccess().getTypeDatatypeEnumRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_7_0=ruleDatatype();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeActionRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_7_0,
                    							"de.tud.st.featurelang.FeatureLang.Datatype");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleAttributeAction"


    // $ANTLR start "entryRuleAssociationAction"
    // InternalFeatureLang.g:514:1: entryRuleAssociationAction returns [EObject current=null] : iv_ruleAssociationAction= ruleAssociationAction EOF ;
    public final EObject entryRuleAssociationAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationAction = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLang.g:516:2: (iv_ruleAssociationAction= ruleAssociationAction EOF )
            // InternalFeatureLang.g:517:2: iv_ruleAssociationAction= ruleAssociationAction EOF
            {
             newCompositeNode(grammarAccess.getAssociationActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociationAction=ruleAssociationAction();

            state._fsp--;

             current =iv_ruleAssociationAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleAssociationAction"


    // $ANTLR start "ruleAssociationAction"
    // InternalFeatureLang.g:526:1: ruleAssociationAction returns [EObject current=null] : (otherlv_0= 'have' otherlv_1= 'associations' otherlv_2= 'to' ( (lv_target_3_0= ruleClass ) ) otherlv_4= 'called' ( (lv_relation_5_0= RULE_ID ) ) ) ;
    public final EObject ruleAssociationAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_relation_5_0=null;
        EObject lv_target_3_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLang.g:533:2: ( (otherlv_0= 'have' otherlv_1= 'associations' otherlv_2= 'to' ( (lv_target_3_0= ruleClass ) ) otherlv_4= 'called' ( (lv_relation_5_0= RULE_ID ) ) ) )
            // InternalFeatureLang.g:534:2: (otherlv_0= 'have' otherlv_1= 'associations' otherlv_2= 'to' ( (lv_target_3_0= ruleClass ) ) otherlv_4= 'called' ( (lv_relation_5_0= RULE_ID ) ) )
            {
            // InternalFeatureLang.g:534:2: (otherlv_0= 'have' otherlv_1= 'associations' otherlv_2= 'to' ( (lv_target_3_0= ruleClass ) ) otherlv_4= 'called' ( (lv_relation_5_0= RULE_ID ) ) )
            // InternalFeatureLang.g:535:3: otherlv_0= 'have' otherlv_1= 'associations' otherlv_2= 'to' ( (lv_target_3_0= ruleClass ) ) otherlv_4= 'called' ( (lv_relation_5_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getAssociationActionAccess().getHaveKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationActionAccess().getAssociationsKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getAssociationActionAccess().getToKeyword_2());
            		
            // InternalFeatureLang.g:547:3: ( (lv_target_3_0= ruleClass ) )
            // InternalFeatureLang.g:548:4: (lv_target_3_0= ruleClass )
            {
            // InternalFeatureLang.g:548:4: (lv_target_3_0= ruleClass )
            // InternalFeatureLang.g:549:5: lv_target_3_0= ruleClass
            {

            					newCompositeNode(grammarAccess.getAssociationActionAccess().getTargetClassParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_target_3_0=ruleClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationActionRule());
            					}
            					set(
            						current,
            						"target",
            						lv_target_3_0,
            						"de.tud.st.featurelang.FeatureLang.Class");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getAssociationActionAccess().getCalledKeyword_4());
            		
            // InternalFeatureLang.g:570:3: ( (lv_relation_5_0= RULE_ID ) )
            // InternalFeatureLang.g:571:4: (lv_relation_5_0= RULE_ID )
            {
            // InternalFeatureLang.g:571:4: (lv_relation_5_0= RULE_ID )
            // InternalFeatureLang.g:572:5: lv_relation_5_0= RULE_ID
            {
            lv_relation_5_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_relation_5_0, grammarAccess.getAssociationActionAccess().getRelationIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"relation",
            						lv_relation_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleAssociationAction"


    // $ANTLR start "entryRuleInheritanceAction"
    // InternalFeatureLang.g:595:1: entryRuleInheritanceAction returns [EObject current=null] : iv_ruleInheritanceAction= ruleInheritanceAction EOF ;
    public final EObject entryRuleInheritanceAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInheritanceAction = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLang.g:597:2: (iv_ruleInheritanceAction= ruleInheritanceAction EOF )
            // InternalFeatureLang.g:598:2: iv_ruleInheritanceAction= ruleInheritanceAction EOF
            {
             newCompositeNode(grammarAccess.getInheritanceActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInheritanceAction=ruleInheritanceAction();

            state._fsp--;

             current =iv_ruleInheritanceAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleInheritanceAction"


    // $ANTLR start "ruleInheritanceAction"
    // InternalFeatureLang.g:607:1: ruleInheritanceAction returns [EObject current=null] : (otherlv_0= 'inherit' otherlv_1= 'from' ( (lv_parent_2_0= ruleClass ) ) ) ;
    public final EObject ruleInheritanceAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_parent_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLang.g:614:2: ( (otherlv_0= 'inherit' otherlv_1= 'from' ( (lv_parent_2_0= ruleClass ) ) ) )
            // InternalFeatureLang.g:615:2: (otherlv_0= 'inherit' otherlv_1= 'from' ( (lv_parent_2_0= ruleClass ) ) )
            {
            // InternalFeatureLang.g:615:2: (otherlv_0= 'inherit' otherlv_1= 'from' ( (lv_parent_2_0= ruleClass ) ) )
            // InternalFeatureLang.g:616:3: otherlv_0= 'inherit' otherlv_1= 'from' ( (lv_parent_2_0= ruleClass ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getInheritanceActionAccess().getInheritKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getInheritanceActionAccess().getFromKeyword_1());
            		
            // InternalFeatureLang.g:624:3: ( (lv_parent_2_0= ruleClass ) )
            // InternalFeatureLang.g:625:4: (lv_parent_2_0= ruleClass )
            {
            // InternalFeatureLang.g:625:4: (lv_parent_2_0= ruleClass )
            // InternalFeatureLang.g:626:5: lv_parent_2_0= ruleClass
            {

            					newCompositeNode(grammarAccess.getInheritanceActionAccess().getParentClassParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_parent_2_0=ruleClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInheritanceActionRule());
            					}
            					set(
            						current,
            						"parent",
            						lv_parent_2_0,
            						"de.tud.st.featurelang.FeatureLang.Class");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleInheritanceAction"


    // $ANTLR start "entryRuleClass"
    // InternalFeatureLang.g:650:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLang.g:652:2: (iv_ruleClass= ruleClass EOF )
            // InternalFeatureLang.g:653:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalFeatureLang.g:662:1: ruleClass returns [EObject current=null] : ( (otherlv_0= 'the' )? (otherlv_1= 'class' )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLang.g:669:2: ( ( (otherlv_0= 'the' )? (otherlv_1= 'class' )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalFeatureLang.g:670:2: ( (otherlv_0= 'the' )? (otherlv_1= 'class' )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalFeatureLang.g:670:2: ( (otherlv_0= 'the' )? (otherlv_1= 'class' )? ( (lv_name_2_0= RULE_ID ) ) )
            // InternalFeatureLang.g:671:3: (otherlv_0= 'the' )? (otherlv_1= 'class' )? ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalFeatureLang.g:671:3: (otherlv_0= 'the' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalFeatureLang.g:672:4: otherlv_0= 'the'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_26); 

                    				newLeafNode(otherlv_0, grammarAccess.getClassAccess().getTheKeyword_0());
                    			

                    }
                    break;

            }

            // InternalFeatureLang.g:677:3: (otherlv_1= 'class' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalFeatureLang.g:678:4: otherlv_1= 'class'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_23); 

                    				newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
                    			

                    }
                    break;

            }

            // InternalFeatureLang.g:683:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalFeatureLang.g:684:4: (lv_name_2_0= RULE_ID )
            {
            // InternalFeatureLang.g:684:4: (lv_name_2_0= RULE_ID )
            // InternalFeatureLang.g:685:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleAttribute"
    // InternalFeatureLang.g:708:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLang.g:710:2: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalFeatureLang.g:711:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalFeatureLang.g:720:1: ruleAttribute returns [EObject current=null] : ( (otherlv_0= 'attribute' )? ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLang.g:727:2: ( ( (otherlv_0= 'attribute' )? ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalFeatureLang.g:728:2: ( (otherlv_0= 'attribute' )? ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalFeatureLang.g:728:2: ( (otherlv_0= 'attribute' )? ( (lv_name_1_0= RULE_ID ) ) )
            // InternalFeatureLang.g:729:3: (otherlv_0= 'attribute' )? ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalFeatureLang.g:729:3: (otherlv_0= 'attribute' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalFeatureLang.g:730:4: otherlv_0= 'attribute'
                    {
                    otherlv_0=(Token)match(input,28,FOLLOW_23); 

                    				newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
                    			

                    }
                    break;

            }

            // InternalFeatureLang.g:735:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFeatureLang.g:736:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFeatureLang.g:736:4: (lv_name_1_0= RULE_ID )
            // InternalFeatureLang.g:737:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRulePriority"
    // InternalFeatureLang.g:760:1: entryRulePriority returns [EObject current=null] : iv_rulePriority= rulePriority EOF ;
    public final EObject entryRulePriority() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePriority = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLang.g:762:2: (iv_rulePriority= rulePriority EOF )
            // InternalFeatureLang.g:763:2: iv_rulePriority= rulePriority EOF
            {
             newCompositeNode(grammarAccess.getPriorityRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePriority=rulePriority();

            state._fsp--;

             current =iv_rulePriority; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulePriority"


    // $ANTLR start "rulePriority"
    // InternalFeatureLang.g:772:1: rulePriority returns [EObject current=null] : ( (lv_priority_0_0= rulePriorityValue ) ) ;
    public final EObject rulePriority() throws RecognitionException {
        EObject current = null;

        Enumerator lv_priority_0_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLang.g:779:2: ( ( (lv_priority_0_0= rulePriorityValue ) ) )
            // InternalFeatureLang.g:780:2: ( (lv_priority_0_0= rulePriorityValue ) )
            {
            // InternalFeatureLang.g:780:2: ( (lv_priority_0_0= rulePriorityValue ) )
            // InternalFeatureLang.g:781:3: (lv_priority_0_0= rulePriorityValue )
            {
            // InternalFeatureLang.g:781:3: (lv_priority_0_0= rulePriorityValue )
            // InternalFeatureLang.g:782:4: lv_priority_0_0= rulePriorityValue
            {

            				newCompositeNode(grammarAccess.getPriorityAccess().getPriorityPriorityValueEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_priority_0_0=rulePriorityValue();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getPriorityRule());
            				}
            				set(
            					current,
            					"priority",
            					lv_priority_0_0,
            					"de.tud.st.featurelang.FeatureLang.PriorityValue");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulePriority"


    // $ANTLR start "rulePriorityValue"
    // InternalFeatureLang.g:805:1: rulePriorityValue returns [Enumerator current=null] : ( (enumLiteral_0= 'should' ) | (enumLiteral_1= 'must' ) ) ;
    public final Enumerator rulePriorityValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFeatureLang.g:811:2: ( ( (enumLiteral_0= 'should' ) | (enumLiteral_1= 'must' ) ) )
            // InternalFeatureLang.g:812:2: ( (enumLiteral_0= 'should' ) | (enumLiteral_1= 'must' ) )
            {
            // InternalFeatureLang.g:812:2: ( (enumLiteral_0= 'should' ) | (enumLiteral_1= 'must' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            else if ( (LA10_0==30) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalFeatureLang.g:813:3: (enumLiteral_0= 'should' )
                    {
                    // InternalFeatureLang.g:813:3: (enumLiteral_0= 'should' )
                    // InternalFeatureLang.g:814:4: enumLiteral_0= 'should'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getPriorityValueAccess().getSHOULDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPriorityValueAccess().getSHOULDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLang.g:821:3: (enumLiteral_1= 'must' )
                    {
                    // InternalFeatureLang.g:821:3: (enumLiteral_1= 'must' )
                    // InternalFeatureLang.g:822:4: enumLiteral_1= 'must'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getPriorityValueAccess().getMUSTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPriorityValueAccess().getMUSTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePriorityValue"


    // $ANTLR start "ruleDatatype"
    // InternalFeatureLang.g:832:1: ruleDatatype returns [Enumerator current=null] : ( (enumLiteral_0= 'word' ) | (enumLiteral_1= 'phrase' ) | (enumLiteral_2= 'number' ) ) ;
    public final Enumerator ruleDatatype() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalFeatureLang.g:838:2: ( ( (enumLiteral_0= 'word' ) | (enumLiteral_1= 'phrase' ) | (enumLiteral_2= 'number' ) ) )
            // InternalFeatureLang.g:839:2: ( (enumLiteral_0= 'word' ) | (enumLiteral_1= 'phrase' ) | (enumLiteral_2= 'number' ) )
            {
            // InternalFeatureLang.g:839:2: ( (enumLiteral_0= 'word' ) | (enumLiteral_1= 'phrase' ) | (enumLiteral_2= 'number' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt11=1;
                }
                break;
            case 32:
                {
                alt11=2;
                }
                break;
            case 33:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalFeatureLang.g:840:3: (enumLiteral_0= 'word' )
                    {
                    // InternalFeatureLang.g:840:3: (enumLiteral_0= 'word' )
                    // InternalFeatureLang.g:841:4: enumLiteral_0= 'word'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getDatatypeAccess().getWORDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDatatypeAccess().getWORDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLang.g:848:3: (enumLiteral_1= 'phrase' )
                    {
                    // InternalFeatureLang.g:848:3: (enumLiteral_1= 'phrase' )
                    // InternalFeatureLang.g:849:4: enumLiteral_1= 'phrase'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getDatatypeAccess().getPHRASEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDatatypeAccess().getPHRASEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureLang.g:856:3: (enumLiteral_2= 'number' )
                    {
                    // InternalFeatureLang.g:856:3: (enumLiteral_2= 'number' )
                    // InternalFeatureLang.g:857:4: enumLiteral_2= 'number'
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getDatatypeAccess().getNUMBEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDatatypeAccess().getNUMBEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatatype"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008100012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000060002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002080800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000009100010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008100010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000010L});

}