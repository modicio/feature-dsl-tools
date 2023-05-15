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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'not'", "'it'", "'exist'", "'has'", "'an'", "'existing'", "'be'", "'a'", "'have'", "'the'", "'is'", "'associations'", "'to'", "'called'", "'inherit'", "'from'", "'class'", "'attribute'", "'should'", "'must'", "'time'", "'phrase'", "'number'"
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
    public static final int T__34=34;
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

                if ( (LA1_0==RULE_ID||LA1_0==13||LA1_0==19||LA1_0==21||LA1_0==28) ) {
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


        try {
            // InternalFeatureLang.g:101:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalFeatureLang.g:102:2: iv_ruleStatement= ruleStatement EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalFeatureLang.g:108:1: ruleStatement returns [EObject current=null] : ( (this_ChangeStatement_0= ruleChangeStatement | this_CreationStatement_1= ruleCreationStatement ) (otherlv_2= '.' )? ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ChangeStatement_0 = null;

        EObject this_CreationStatement_1 = null;



        	enterRule();

        try {
            // InternalFeatureLang.g:114:2: ( ( (this_ChangeStatement_0= ruleChangeStatement | this_CreationStatement_1= ruleCreationStatement ) (otherlv_2= '.' )? ) )
            // InternalFeatureLang.g:115:2: ( (this_ChangeStatement_0= ruleChangeStatement | this_CreationStatement_1= ruleCreationStatement ) (otherlv_2= '.' )? )
            {
            // InternalFeatureLang.g:115:2: ( (this_ChangeStatement_0= ruleChangeStatement | this_CreationStatement_1= ruleCreationStatement ) (otherlv_2= '.' )? )
            // InternalFeatureLang.g:116:3: (this_ChangeStatement_0= ruleChangeStatement | this_CreationStatement_1= ruleCreationStatement ) (otherlv_2= '.' )?
            {
            // InternalFeatureLang.g:116:3: (this_ChangeStatement_0= ruleChangeStatement | this_CreationStatement_1= ruleCreationStatement )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||LA2_0==19||LA2_0==21||LA2_0==28) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalFeatureLang.g:117:4: this_ChangeStatement_0= ruleChangeStatement
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getChangeStatementParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_4);
                    this_ChangeStatement_0=ruleChangeStatement();

                    state._fsp--;


                    				current = this_ChangeStatement_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalFeatureLang.g:126:4: this_CreationStatement_1= ruleCreationStatement
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getCreationStatementParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_4);
                    this_CreationStatement_1=ruleCreationStatement();

                    state._fsp--;


                    				current = this_CreationStatement_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalFeatureLang.g:135:3: (otherlv_2= '.' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalFeatureLang.g:136:4: otherlv_2= '.'
                    {
                    otherlv_2=(Token)match(input,11,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getStatementAccess().getFullStopKeyword_1());
                    			

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
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleChangeStatement"
    // InternalFeatureLang.g:145:1: entryRuleChangeStatement returns [EObject current=null] : iv_ruleChangeStatement= ruleChangeStatement EOF ;
    public final EObject entryRuleChangeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeStatement = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLang.g:147:2: (iv_ruleChangeStatement= ruleChangeStatement EOF )
            // InternalFeatureLang.g:148:2: iv_ruleChangeStatement= ruleChangeStatement EOF
            {
             newCompositeNode(grammarAccess.getChangeStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChangeStatement=ruleChangeStatement();

            state._fsp--;

             current =iv_ruleChangeStatement; 
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
    // $ANTLR end "entryRuleChangeStatement"


    // $ANTLR start "ruleChangeStatement"
    // InternalFeatureLang.g:157:1: ruleChangeStatement returns [EObject current=null] : ( ( (lv_target_0_0= ruleClass ) ) ( ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= 'not' ) )? ( (lv_action_3_0= ruleAction ) ) ) | ( (lv_update_4_0= ruleUpdateAction ) ) ) ) ;
    public final EObject ruleChangeStatement() throws RecognitionException {
        EObject current = null;

        Token lv_negation_2_0=null;
        EObject lv_target_0_0 = null;

        EObject lv_priority_1_0 = null;

        EObject lv_action_3_0 = null;

        EObject lv_update_4_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLang.g:164:2: ( ( ( (lv_target_0_0= ruleClass ) ) ( ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= 'not' ) )? ( (lv_action_3_0= ruleAction ) ) ) | ( (lv_update_4_0= ruleUpdateAction ) ) ) ) )
            // InternalFeatureLang.g:165:2: ( ( (lv_target_0_0= ruleClass ) ) ( ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= 'not' ) )? ( (lv_action_3_0= ruleAction ) ) ) | ( (lv_update_4_0= ruleUpdateAction ) ) ) )
            {
            // InternalFeatureLang.g:165:2: ( ( (lv_target_0_0= ruleClass ) ) ( ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= 'not' ) )? ( (lv_action_3_0= ruleAction ) ) ) | ( (lv_update_4_0= ruleUpdateAction ) ) ) )
            // InternalFeatureLang.g:166:3: ( (lv_target_0_0= ruleClass ) ) ( ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= 'not' ) )? ( (lv_action_3_0= ruleAction ) ) ) | ( (lv_update_4_0= ruleUpdateAction ) ) )
            {
            // InternalFeatureLang.g:166:3: ( (lv_target_0_0= ruleClass ) )
            // InternalFeatureLang.g:167:4: (lv_target_0_0= ruleClass )
            {
            // InternalFeatureLang.g:167:4: (lv_target_0_0= ruleClass )
            // InternalFeatureLang.g:168:5: lv_target_0_0= ruleClass
            {

            					newCompositeNode(grammarAccess.getChangeStatementAccess().getTargetClassParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_target_0_0=ruleClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChangeStatementRule());
            					}
            					set(
            						current,
            						"target",
            						lv_target_0_0,
            						"de.tud.st.featurelang.FeatureLang.Class");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFeatureLang.g:185:3: ( ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= 'not' ) )? ( (lv_action_3_0= ruleAction ) ) ) | ( (lv_update_4_0= ruleUpdateAction ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=30 && LA5_0<=31)) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalFeatureLang.g:186:4: ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= 'not' ) )? ( (lv_action_3_0= ruleAction ) ) )
                    {
                    // InternalFeatureLang.g:186:4: ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= 'not' ) )? ( (lv_action_3_0= ruleAction ) ) )
                    // InternalFeatureLang.g:187:5: ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= 'not' ) )? ( (lv_action_3_0= ruleAction ) )
                    {
                    // InternalFeatureLang.g:187:5: ( (lv_priority_1_0= rulePriority ) )
                    // InternalFeatureLang.g:188:6: (lv_priority_1_0= rulePriority )
                    {
                    // InternalFeatureLang.g:188:6: (lv_priority_1_0= rulePriority )
                    // InternalFeatureLang.g:189:7: lv_priority_1_0= rulePriority
                    {

                    							newCompositeNode(grammarAccess.getChangeStatementAccess().getPriorityPriorityParserRuleCall_1_0_0_0());
                    						
                    pushFollow(FOLLOW_6);
                    lv_priority_1_0=rulePriority();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getChangeStatementRule());
                    							}
                    							set(
                    								current,
                    								"priority",
                    								lv_priority_1_0,
                    								"de.tud.st.featurelang.FeatureLang.Priority");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalFeatureLang.g:206:5: ( (lv_negation_2_0= 'not' ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==12) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalFeatureLang.g:207:6: (lv_negation_2_0= 'not' )
                            {
                            // InternalFeatureLang.g:207:6: (lv_negation_2_0= 'not' )
                            // InternalFeatureLang.g:208:7: lv_negation_2_0= 'not'
                            {
                            lv_negation_2_0=(Token)match(input,12,FOLLOW_6); 

                            							newLeafNode(lv_negation_2_0, grammarAccess.getChangeStatementAccess().getNegationNotKeyword_1_0_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getChangeStatementRule());
                            							}
                            							setWithLastConsumed(current, "negation", lv_negation_2_0 != null, "not");
                            						

                            }


                            }
                            break;

                    }

                    // InternalFeatureLang.g:220:5: ( (lv_action_3_0= ruleAction ) )
                    // InternalFeatureLang.g:221:6: (lv_action_3_0= ruleAction )
                    {
                    // InternalFeatureLang.g:221:6: (lv_action_3_0= ruleAction )
                    // InternalFeatureLang.g:222:7: lv_action_3_0= ruleAction
                    {

                    							newCompositeNode(grammarAccess.getChangeStatementAccess().getActionActionParserRuleCall_1_0_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_action_3_0=ruleAction();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getChangeStatementRule());
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
                    // InternalFeatureLang.g:241:4: ( (lv_update_4_0= ruleUpdateAction ) )
                    {
                    // InternalFeatureLang.g:241:4: ( (lv_update_4_0= ruleUpdateAction ) )
                    // InternalFeatureLang.g:242:5: (lv_update_4_0= ruleUpdateAction )
                    {
                    // InternalFeatureLang.g:242:5: (lv_update_4_0= ruleUpdateAction )
                    // InternalFeatureLang.g:243:6: lv_update_4_0= ruleUpdateAction
                    {

                    						newCompositeNode(grammarAccess.getChangeStatementAccess().getUpdateUpdateActionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_update_4_0=ruleUpdateAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getChangeStatementRule());
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
    // $ANTLR end "ruleChangeStatement"


    // $ANTLR start "entryRuleCreationStatement"
    // InternalFeatureLang.g:268:1: entryRuleCreationStatement returns [EObject current=null] : iv_ruleCreationStatement= ruleCreationStatement EOF ;
    public final EObject entryRuleCreationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreationStatement = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLang.g:270:2: (iv_ruleCreationStatement= ruleCreationStatement EOF )
            // InternalFeatureLang.g:271:2: iv_ruleCreationStatement= ruleCreationStatement EOF
            {
             newCompositeNode(grammarAccess.getCreationStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreationStatement=ruleCreationStatement();

            state._fsp--;

             current =iv_ruleCreationStatement; 
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
    // $ANTLR end "entryRuleCreationStatement"


    // $ANTLR start "ruleCreationStatement"
    // InternalFeatureLang.g:280:1: ruleCreationStatement returns [EObject current=null] : (otherlv_0= 'it' ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= 'not' ) )? otherlv_3= 'exist' ( (lv_classElement_4_0= ruleClass ) ) ) ;
    public final EObject ruleCreationStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_negation_2_0=null;
        Token otherlv_3=null;
        EObject lv_priority_1_0 = null;

        EObject lv_classElement_4_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLang.g:287:2: ( (otherlv_0= 'it' ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= 'not' ) )? otherlv_3= 'exist' ( (lv_classElement_4_0= ruleClass ) ) ) )
            // InternalFeatureLang.g:288:2: (otherlv_0= 'it' ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= 'not' ) )? otherlv_3= 'exist' ( (lv_classElement_4_0= ruleClass ) ) )
            {
            // InternalFeatureLang.g:288:2: (otherlv_0= 'it' ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= 'not' ) )? otherlv_3= 'exist' ( (lv_classElement_4_0= ruleClass ) ) )
            // InternalFeatureLang.g:289:3: otherlv_0= 'it' ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= 'not' ) )? otherlv_3= 'exist' ( (lv_classElement_4_0= ruleClass ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getCreationStatementAccess().getItKeyword_0());
            		
            // InternalFeatureLang.g:293:3: ( (lv_priority_1_0= rulePriority ) )
            // InternalFeatureLang.g:294:4: (lv_priority_1_0= rulePriority )
            {
            // InternalFeatureLang.g:294:4: (lv_priority_1_0= rulePriority )
            // InternalFeatureLang.g:295:5: lv_priority_1_0= rulePriority
            {

            					newCompositeNode(grammarAccess.getCreationStatementAccess().getPriorityPriorityParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_priority_1_0=rulePriority();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreationStatementRule());
            					}
            					set(
            						current,
            						"priority",
            						lv_priority_1_0,
            						"de.tud.st.featurelang.FeatureLang.Priority");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFeatureLang.g:312:3: ( (lv_negation_2_0= 'not' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalFeatureLang.g:313:4: (lv_negation_2_0= 'not' )
                    {
                    // InternalFeatureLang.g:313:4: (lv_negation_2_0= 'not' )
                    // InternalFeatureLang.g:314:5: lv_negation_2_0= 'not'
                    {
                    lv_negation_2_0=(Token)match(input,12,FOLLOW_9); 

                    					newLeafNode(lv_negation_2_0, grammarAccess.getCreationStatementAccess().getNegationNotKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCreationStatementRule());
                    					}
                    					setWithLastConsumed(current, "negation", lv_negation_2_0 != null, "not");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getCreationStatementAccess().getExistKeyword_3());
            		
            // InternalFeatureLang.g:330:3: ( (lv_classElement_4_0= ruleClass ) )
            // InternalFeatureLang.g:331:4: (lv_classElement_4_0= ruleClass )
            {
            // InternalFeatureLang.g:331:4: (lv_classElement_4_0= ruleClass )
            // InternalFeatureLang.g:332:5: lv_classElement_4_0= ruleClass
            {

            					newCompositeNode(grammarAccess.getCreationStatementAccess().getClassElementClassParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_classElement_4_0=ruleClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreationStatementRule());
            					}
            					set(
            						current,
            						"classElement",
            						lv_classElement_4_0,
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
    // $ANTLR end "ruleCreationStatement"


    // $ANTLR start "entryRuleAction"
    // InternalFeatureLang.g:356:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLang.g:358:2: (iv_ruleAction= ruleAction EOF )
            // InternalFeatureLang.g:359:2: iv_ruleAction= ruleAction EOF
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
    // InternalFeatureLang.g:368:1: ruleAction returns [EObject current=null] : ( ( (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_1 = null;

        EObject lv_type_0_2 = null;

        EObject lv_type_0_3 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLang.g:375:2: ( ( ( (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction ) ) ) )
            // InternalFeatureLang.g:376:2: ( ( (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction ) ) )
            {
            // InternalFeatureLang.g:376:2: ( ( (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction ) ) )
            // InternalFeatureLang.g:377:3: ( (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction ) )
            {
            // InternalFeatureLang.g:377:3: ( (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction ) )
            // InternalFeatureLang.g:378:4: (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction )
            {
            // InternalFeatureLang.g:378:4: (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==21) ) {
                    alt7=1;
                }
                else if ( (LA7_1==23) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==26) ) {
                alt7=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalFeatureLang.g:379:5: lv_type_0_1= ruleAttributeAction
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
                    // InternalFeatureLang.g:395:5: lv_type_0_2= ruleAssociationAction
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
                    // InternalFeatureLang.g:411:5: lv_type_0_3= ruleInheritanceAction
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
    // InternalFeatureLang.g:435:1: entryRuleUpdateAction returns [EObject current=null] : iv_ruleUpdateAction= ruleUpdateAction EOF ;
    public final EObject entryRuleUpdateAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateAction = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLang.g:437:2: (iv_ruleUpdateAction= ruleUpdateAction EOF )
            // InternalFeatureLang.g:438:2: iv_ruleUpdateAction= ruleUpdateAction EOF
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
    // InternalFeatureLang.g:447:1: ruleUpdateAction returns [EObject current=null] : (otherlv_0= 'has' otherlv_1= 'an' otherlv_2= 'existing' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= '.' otherlv_5= 'it' ( (lv_priority_6_0= rulePriority ) ) otherlv_7= 'be' otherlv_8= 'a' ( (lv_type_9_0= ruleDatatype ) ) ) ;
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
            // InternalFeatureLang.g:454:2: ( (otherlv_0= 'has' otherlv_1= 'an' otherlv_2= 'existing' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= '.' otherlv_5= 'it' ( (lv_priority_6_0= rulePriority ) ) otherlv_7= 'be' otherlv_8= 'a' ( (lv_type_9_0= ruleDatatype ) ) ) )
            // InternalFeatureLang.g:455:2: (otherlv_0= 'has' otherlv_1= 'an' otherlv_2= 'existing' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= '.' otherlv_5= 'it' ( (lv_priority_6_0= rulePriority ) ) otherlv_7= 'be' otherlv_8= 'a' ( (lv_type_9_0= ruleDatatype ) ) )
            {
            // InternalFeatureLang.g:455:2: (otherlv_0= 'has' otherlv_1= 'an' otherlv_2= 'existing' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= '.' otherlv_5= 'it' ( (lv_priority_6_0= rulePriority ) ) otherlv_7= 'be' otherlv_8= 'a' ( (lv_type_9_0= ruleDatatype ) ) )
            // InternalFeatureLang.g:456:3: otherlv_0= 'has' otherlv_1= 'an' otherlv_2= 'existing' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= '.' otherlv_5= 'it' ( (lv_priority_6_0= rulePriority ) ) otherlv_7= 'be' otherlv_8= 'a' ( (lv_type_9_0= ruleDatatype ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getUpdateActionAccess().getHasKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getUpdateActionAccess().getAnKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getUpdateActionAccess().getExistingKeyword_2());
            		
            // InternalFeatureLang.g:468:3: ( (lv_attribute_3_0= ruleAttribute ) )
            // InternalFeatureLang.g:469:4: (lv_attribute_3_0= ruleAttribute )
            {
            // InternalFeatureLang.g:469:4: (lv_attribute_3_0= ruleAttribute )
            // InternalFeatureLang.g:470:5: lv_attribute_3_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getUpdateActionAccess().getAttributeAttributeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_4=(Token)match(input,11,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getUpdateActionAccess().getFullStopKeyword_4());
            		
            otherlv_5=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getUpdateActionAccess().getItKeyword_5());
            		
            // InternalFeatureLang.g:495:3: ( (lv_priority_6_0= rulePriority ) )
            // InternalFeatureLang.g:496:4: (lv_priority_6_0= rulePriority )
            {
            // InternalFeatureLang.g:496:4: (lv_priority_6_0= rulePriority )
            // InternalFeatureLang.g:497:5: lv_priority_6_0= rulePriority
            {

            					newCompositeNode(grammarAccess.getUpdateActionAccess().getPriorityPriorityParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_16);
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

            otherlv_7=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_7, grammarAccess.getUpdateActionAccess().getBeKeyword_7());
            		
            otherlv_8=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_8, grammarAccess.getUpdateActionAccess().getAKeyword_8());
            		
            // InternalFeatureLang.g:522:3: ( (lv_type_9_0= ruleDatatype ) )
            // InternalFeatureLang.g:523:4: (lv_type_9_0= ruleDatatype )
            {
            // InternalFeatureLang.g:523:4: (lv_type_9_0= ruleDatatype )
            // InternalFeatureLang.g:524:5: lv_type_9_0= ruleDatatype
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
    // InternalFeatureLang.g:548:1: entryRuleAttributeAction returns [EObject current=null] : iv_ruleAttributeAction= ruleAttributeAction EOF ;
    public final EObject entryRuleAttributeAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeAction = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLang.g:550:2: (iv_ruleAttributeAction= ruleAttributeAction EOF )
            // InternalFeatureLang.g:551:2: iv_ruleAttributeAction= ruleAttributeAction EOF
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
    // InternalFeatureLang.g:560:1: ruleAttributeAction returns [EObject current=null] : (otherlv_0= 'have' otherlv_1= 'the' ( (lv_attribute_2_0= ruleAttribute ) ) otherlv_3= '.' (otherlv_4= 'it' otherlv_5= 'is' otherlv_6= 'a' ( (lv_type_7_0= ruleDatatype ) ) )? ) ;
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
            // InternalFeatureLang.g:567:2: ( (otherlv_0= 'have' otherlv_1= 'the' ( (lv_attribute_2_0= ruleAttribute ) ) otherlv_3= '.' (otherlv_4= 'it' otherlv_5= 'is' otherlv_6= 'a' ( (lv_type_7_0= ruleDatatype ) ) )? ) )
            // InternalFeatureLang.g:568:2: (otherlv_0= 'have' otherlv_1= 'the' ( (lv_attribute_2_0= ruleAttribute ) ) otherlv_3= '.' (otherlv_4= 'it' otherlv_5= 'is' otherlv_6= 'a' ( (lv_type_7_0= ruleDatatype ) ) )? )
            {
            // InternalFeatureLang.g:568:2: (otherlv_0= 'have' otherlv_1= 'the' ( (lv_attribute_2_0= ruleAttribute ) ) otherlv_3= '.' (otherlv_4= 'it' otherlv_5= 'is' otherlv_6= 'a' ( (lv_type_7_0= ruleDatatype ) ) )? )
            // InternalFeatureLang.g:569:3: otherlv_0= 'have' otherlv_1= 'the' ( (lv_attribute_2_0= ruleAttribute ) ) otherlv_3= '.' (otherlv_4= 'it' otherlv_5= 'is' otherlv_6= 'a' ( (lv_type_7_0= ruleDatatype ) ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeActionAccess().getHaveKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeActionAccess().getTheKeyword_1());
            		
            // InternalFeatureLang.g:577:3: ( (lv_attribute_2_0= ruleAttribute ) )
            // InternalFeatureLang.g:578:4: (lv_attribute_2_0= ruleAttribute )
            {
            // InternalFeatureLang.g:578:4: (lv_attribute_2_0= ruleAttribute )
            // InternalFeatureLang.g:579:5: lv_attribute_2_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getAttributeActionAccess().getAttributeAttributeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_3=(Token)match(input,11,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeActionAccess().getFullStopKeyword_3());
            		
            // InternalFeatureLang.g:600:3: (otherlv_4= 'it' otherlv_5= 'is' otherlv_6= 'a' ( (lv_type_7_0= ruleDatatype ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==22) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // InternalFeatureLang.g:601:4: otherlv_4= 'it' otherlv_5= 'is' otherlv_6= 'a' ( (lv_type_7_0= ruleDatatype ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getAttributeActionAccess().getItKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getAttributeActionAccess().getIsKeyword_4_1());
                    			
                    otherlv_6=(Token)match(input,19,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getAttributeActionAccess().getAKeyword_4_2());
                    			
                    // InternalFeatureLang.g:613:4: ( (lv_type_7_0= ruleDatatype ) )
                    // InternalFeatureLang.g:614:5: (lv_type_7_0= ruleDatatype )
                    {
                    // InternalFeatureLang.g:614:5: (lv_type_7_0= ruleDatatype )
                    // InternalFeatureLang.g:615:6: lv_type_7_0= ruleDatatype
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
    // InternalFeatureLang.g:640:1: entryRuleAssociationAction returns [EObject current=null] : iv_ruleAssociationAction= ruleAssociationAction EOF ;
    public final EObject entryRuleAssociationAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationAction = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLang.g:642:2: (iv_ruleAssociationAction= ruleAssociationAction EOF )
            // InternalFeatureLang.g:643:2: iv_ruleAssociationAction= ruleAssociationAction EOF
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
    // InternalFeatureLang.g:652:1: ruleAssociationAction returns [EObject current=null] : (otherlv_0= 'have' otherlv_1= 'associations' otherlv_2= 'to' ( (lv_target_3_0= ruleClass ) ) otherlv_4= 'called' ( (lv_relation_5_0= RULE_ID ) ) ) ;
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
            // InternalFeatureLang.g:659:2: ( (otherlv_0= 'have' otherlv_1= 'associations' otherlv_2= 'to' ( (lv_target_3_0= ruleClass ) ) otherlv_4= 'called' ( (lv_relation_5_0= RULE_ID ) ) ) )
            // InternalFeatureLang.g:660:2: (otherlv_0= 'have' otherlv_1= 'associations' otherlv_2= 'to' ( (lv_target_3_0= ruleClass ) ) otherlv_4= 'called' ( (lv_relation_5_0= RULE_ID ) ) )
            {
            // InternalFeatureLang.g:660:2: (otherlv_0= 'have' otherlv_1= 'associations' otherlv_2= 'to' ( (lv_target_3_0= ruleClass ) ) otherlv_4= 'called' ( (lv_relation_5_0= RULE_ID ) ) )
            // InternalFeatureLang.g:661:3: otherlv_0= 'have' otherlv_1= 'associations' otherlv_2= 'to' ( (lv_target_3_0= ruleClass ) ) otherlv_4= 'called' ( (lv_relation_5_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getAssociationActionAccess().getHaveKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationActionAccess().getAssociationsKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getAssociationActionAccess().getToKeyword_2());
            		
            // InternalFeatureLang.g:673:3: ( (lv_target_3_0= ruleClass ) )
            // InternalFeatureLang.g:674:4: (lv_target_3_0= ruleClass )
            {
            // InternalFeatureLang.g:674:4: (lv_target_3_0= ruleClass )
            // InternalFeatureLang.g:675:5: lv_target_3_0= ruleClass
            {

            					newCompositeNode(grammarAccess.getAssociationActionAccess().getTargetClassParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
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

            otherlv_4=(Token)match(input,25,FOLLOW_25); 

            			newLeafNode(otherlv_4, grammarAccess.getAssociationActionAccess().getCalledKeyword_4());
            		
            // InternalFeatureLang.g:696:3: ( (lv_relation_5_0= RULE_ID ) )
            // InternalFeatureLang.g:697:4: (lv_relation_5_0= RULE_ID )
            {
            // InternalFeatureLang.g:697:4: (lv_relation_5_0= RULE_ID )
            // InternalFeatureLang.g:698:5: lv_relation_5_0= RULE_ID
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
    // InternalFeatureLang.g:721:1: entryRuleInheritanceAction returns [EObject current=null] : iv_ruleInheritanceAction= ruleInheritanceAction EOF ;
    public final EObject entryRuleInheritanceAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInheritanceAction = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLang.g:723:2: (iv_ruleInheritanceAction= ruleInheritanceAction EOF )
            // InternalFeatureLang.g:724:2: iv_ruleInheritanceAction= ruleInheritanceAction EOF
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
    // InternalFeatureLang.g:733:1: ruleInheritanceAction returns [EObject current=null] : (otherlv_0= 'inherit' otherlv_1= 'from' ( (lv_parent_2_0= ruleClass ) ) ) ;
    public final EObject ruleInheritanceAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_parent_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLang.g:740:2: ( (otherlv_0= 'inherit' otherlv_1= 'from' ( (lv_parent_2_0= ruleClass ) ) ) )
            // InternalFeatureLang.g:741:2: (otherlv_0= 'inherit' otherlv_1= 'from' ( (lv_parent_2_0= ruleClass ) ) )
            {
            // InternalFeatureLang.g:741:2: (otherlv_0= 'inherit' otherlv_1= 'from' ( (lv_parent_2_0= ruleClass ) ) )
            // InternalFeatureLang.g:742:3: otherlv_0= 'inherit' otherlv_1= 'from' ( (lv_parent_2_0= ruleClass ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getInheritanceActionAccess().getInheritKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getInheritanceActionAccess().getFromKeyword_1());
            		
            // InternalFeatureLang.g:750:3: ( (lv_parent_2_0= ruleClass ) )
            // InternalFeatureLang.g:751:4: (lv_parent_2_0= ruleClass )
            {
            // InternalFeatureLang.g:751:4: (lv_parent_2_0= ruleClass )
            // InternalFeatureLang.g:752:5: lv_parent_2_0= ruleClass
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
    // InternalFeatureLang.g:776:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLang.g:778:2: (iv_ruleClass= ruleClass EOF )
            // InternalFeatureLang.g:779:2: iv_ruleClass= ruleClass EOF
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
    // InternalFeatureLang.g:788:1: ruleClass returns [EObject current=null] : ( (otherlv_0= 'the' | otherlv_1= 'a' )? (otherlv_2= 'class' )? ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLang.g:795:2: ( ( (otherlv_0= 'the' | otherlv_1= 'a' )? (otherlv_2= 'class' )? ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalFeatureLang.g:796:2: ( (otherlv_0= 'the' | otherlv_1= 'a' )? (otherlv_2= 'class' )? ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalFeatureLang.g:796:2: ( (otherlv_0= 'the' | otherlv_1= 'a' )? (otherlv_2= 'class' )? ( (lv_name_3_0= RULE_ID ) ) )
            // InternalFeatureLang.g:797:3: (otherlv_0= 'the' | otherlv_1= 'a' )? (otherlv_2= 'class' )? ( (lv_name_3_0= RULE_ID ) )
            {
            // InternalFeatureLang.g:797:3: (otherlv_0= 'the' | otherlv_1= 'a' )?
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            else if ( (LA9_0==19) ) {
                alt9=2;
            }
            switch (alt9) {
                case 1 :
                    // InternalFeatureLang.g:798:4: otherlv_0= 'the'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_27); 

                    				newLeafNode(otherlv_0, grammarAccess.getClassAccess().getTheKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalFeatureLang.g:803:4: otherlv_1= 'a'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_27); 

                    				newLeafNode(otherlv_1, grammarAccess.getClassAccess().getAKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalFeatureLang.g:808:3: (otherlv_2= 'class' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalFeatureLang.g:809:4: otherlv_2= 'class'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_25); 

                    				newLeafNode(otherlv_2, grammarAccess.getClassAccess().getClassKeyword_1());
                    			

                    }
                    break;

            }

            // InternalFeatureLang.g:814:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalFeatureLang.g:815:4: (lv_name_3_0= RULE_ID )
            {
            // InternalFeatureLang.g:815:4: (lv_name_3_0= RULE_ID )
            // InternalFeatureLang.g:816:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
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
    // InternalFeatureLang.g:839:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLang.g:841:2: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalFeatureLang.g:842:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalFeatureLang.g:851:1: ruleAttribute returns [EObject current=null] : ( (otherlv_0= 'attribute' )? ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLang.g:858:2: ( ( (otherlv_0= 'attribute' )? ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalFeatureLang.g:859:2: ( (otherlv_0= 'attribute' )? ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalFeatureLang.g:859:2: ( (otherlv_0= 'attribute' )? ( (lv_name_1_0= RULE_ID ) ) )
            // InternalFeatureLang.g:860:3: (otherlv_0= 'attribute' )? ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalFeatureLang.g:860:3: (otherlv_0= 'attribute' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalFeatureLang.g:861:4: otherlv_0= 'attribute'
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_25); 

                    				newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
                    			

                    }
                    break;

            }

            // InternalFeatureLang.g:866:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFeatureLang.g:867:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFeatureLang.g:867:4: (lv_name_1_0= RULE_ID )
            // InternalFeatureLang.g:868:5: lv_name_1_0= RULE_ID
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
    // InternalFeatureLang.g:891:1: entryRulePriority returns [EObject current=null] : iv_rulePriority= rulePriority EOF ;
    public final EObject entryRulePriority() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePriority = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLang.g:893:2: (iv_rulePriority= rulePriority EOF )
            // InternalFeatureLang.g:894:2: iv_rulePriority= rulePriority EOF
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
    // InternalFeatureLang.g:903:1: rulePriority returns [EObject current=null] : ( (lv_priority_0_0= rulePriorityValue ) ) ;
    public final EObject rulePriority() throws RecognitionException {
        EObject current = null;

        Enumerator lv_priority_0_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLang.g:910:2: ( ( (lv_priority_0_0= rulePriorityValue ) ) )
            // InternalFeatureLang.g:911:2: ( (lv_priority_0_0= rulePriorityValue ) )
            {
            // InternalFeatureLang.g:911:2: ( (lv_priority_0_0= rulePriorityValue ) )
            // InternalFeatureLang.g:912:3: (lv_priority_0_0= rulePriorityValue )
            {
            // InternalFeatureLang.g:912:3: (lv_priority_0_0= rulePriorityValue )
            // InternalFeatureLang.g:913:4: lv_priority_0_0= rulePriorityValue
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
    // InternalFeatureLang.g:936:1: rulePriorityValue returns [Enumerator current=null] : ( (enumLiteral_0= 'should' ) | (enumLiteral_1= 'must' ) ) ;
    public final Enumerator rulePriorityValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFeatureLang.g:942:2: ( ( (enumLiteral_0= 'should' ) | (enumLiteral_1= 'must' ) ) )
            // InternalFeatureLang.g:943:2: ( (enumLiteral_0= 'should' ) | (enumLiteral_1= 'must' ) )
            {
            // InternalFeatureLang.g:943:2: ( (enumLiteral_0= 'should' ) | (enumLiteral_1= 'must' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            else if ( (LA12_0==31) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalFeatureLang.g:944:3: (enumLiteral_0= 'should' )
                    {
                    // InternalFeatureLang.g:944:3: (enumLiteral_0= 'should' )
                    // InternalFeatureLang.g:945:4: enumLiteral_0= 'should'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getPriorityValueAccess().getSHOULDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPriorityValueAccess().getSHOULDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLang.g:952:3: (enumLiteral_1= 'must' )
                    {
                    // InternalFeatureLang.g:952:3: (enumLiteral_1= 'must' )
                    // InternalFeatureLang.g:953:4: enumLiteral_1= 'must'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

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
    // InternalFeatureLang.g:963:1: ruleDatatype returns [Enumerator current=null] : ( (enumLiteral_0= 'time' ) | (enumLiteral_1= 'phrase' ) | (enumLiteral_2= 'number' ) ) ;
    public final Enumerator ruleDatatype() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalFeatureLang.g:969:2: ( ( (enumLiteral_0= 'time' ) | (enumLiteral_1= 'phrase' ) | (enumLiteral_2= 'number' ) ) )
            // InternalFeatureLang.g:970:2: ( (enumLiteral_0= 'time' ) | (enumLiteral_1= 'phrase' ) | (enumLiteral_2= 'number' ) )
            {
            // InternalFeatureLang.g:970:2: ( (enumLiteral_0= 'time' ) | (enumLiteral_1= 'phrase' ) | (enumLiteral_2= 'number' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt13=1;
                }
                break;
            case 33:
                {
                alt13=2;
                }
                break;
            case 34:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalFeatureLang.g:971:3: (enumLiteral_0= 'time' )
                    {
                    // InternalFeatureLang.g:971:3: (enumLiteral_0= 'time' )
                    // InternalFeatureLang.g:972:4: enumLiteral_0= 'time'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getDatatypeAccess().getWORDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDatatypeAccess().getWORDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLang.g:979:3: (enumLiteral_1= 'phrase' )
                    {
                    // InternalFeatureLang.g:979:3: (enumLiteral_1= 'phrase' )
                    // InternalFeatureLang.g:980:4: enumLiteral_1= 'phrase'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getDatatypeAccess().getPHRASEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDatatypeAccess().getPHRASEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureLang.g:987:3: (enumLiteral_2= 'number' )
                    {
                    // InternalFeatureLang.g:987:3: (enumLiteral_2= 'number' )
                    // InternalFeatureLang.g:988:4: enumLiteral_2= 'number'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000010282012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000C0008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004101000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010280010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000010L});

}