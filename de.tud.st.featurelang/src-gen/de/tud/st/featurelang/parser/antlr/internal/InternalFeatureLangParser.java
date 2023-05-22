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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Associations", "Attribute", "Existing", "Inherit", "Called", "Number", "Phrase", "Should", "Class", "Exist", "Other", "From", "Have", "Must", "Time", "Has", "Not", "The", "An", "Be", "Is", "It", "To", "FullStop", "A", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int A=28;
    public static final int Called=8;
    public static final int Should=11;
    public static final int Attribute=5;
    public static final int Time=18;
    public static final int Is=24;
    public static final int RULE_STRING=31;
    public static final int It=25;
    public static final int Must=17;
    public static final int An=22;
    public static final int RULE_SL_COMMENT=33;
    public static final int The=21;
    public static final int Exist=13;
    public static final int Number=9;
    public static final int To=26;
    public static final int EOF=-1;
    public static final int Inherit=7;
    public static final int FullStop=27;
    public static final int Be=23;
    public static final int RULE_ID=29;
    public static final int RULE_WS=34;
    public static final int Have=16;
    public static final int Phrase=10;
    public static final int From=15;
    public static final int RULE_ANY_OTHER=35;
    public static final int Associations=4;
    public static final int Not=20;
    public static final int RULE_INT=30;
    public static final int RULE_ML_COMMENT=32;
    public static final int Class=12;
    public static final int Has=19;
    public static final int Existing=6;
    public static final int Other=14;

    // delegates
    // delegators


        public InternalFeatureLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFeatureLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFeatureLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFeatureLangParser.g"; }



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
    // InternalFeatureLangParser.g:58:1: entryRuleFeatureRequest returns [EObject current=null] : iv_ruleFeatureRequest= ruleFeatureRequest EOF ;
    public final EObject entryRuleFeatureRequest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureRequest = null;


        try {
            // InternalFeatureLangParser.g:58:55: (iv_ruleFeatureRequest= ruleFeatureRequest EOF )
            // InternalFeatureLangParser.g:59:2: iv_ruleFeatureRequest= ruleFeatureRequest EOF
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
    // InternalFeatureLangParser.g:65:1: ruleFeatureRequest returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleFeatureRequest() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalFeatureLangParser.g:71:2: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // InternalFeatureLangParser.g:72:2: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // InternalFeatureLangParser.g:72:2: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Class||LA1_0==The||(LA1_0>=A && LA1_0<=RULE_ID)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFeatureLangParser.g:73:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalFeatureLangParser.g:73:3: (lv_statements_0_0= ruleStatement )
            	    // InternalFeatureLangParser.g:74:4: lv_statements_0_0= ruleStatement
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
    // InternalFeatureLangParser.g:94:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalFeatureLangParser.g:94:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalFeatureLangParser.g:95:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalFeatureLangParser.g:101:1: ruleStatement returns [EObject current=null] : ( (this_ChangeStatement_0= ruleChangeStatement | this_CreationStatement_1= ruleCreationStatement ) (otherlv_2= FullStop )? ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ChangeStatement_0 = null;

        EObject this_CreationStatement_1 = null;



        	enterRule();

        try {
            // InternalFeatureLangParser.g:107:2: ( ( (this_ChangeStatement_0= ruleChangeStatement | this_CreationStatement_1= ruleCreationStatement ) (otherlv_2= FullStop )? ) )
            // InternalFeatureLangParser.g:108:2: ( (this_ChangeStatement_0= ruleChangeStatement | this_CreationStatement_1= ruleCreationStatement ) (otherlv_2= FullStop )? )
            {
            // InternalFeatureLangParser.g:108:2: ( (this_ChangeStatement_0= ruleChangeStatement | this_CreationStatement_1= ruleCreationStatement ) (otherlv_2= FullStop )? )
            // InternalFeatureLangParser.g:109:3: (this_ChangeStatement_0= ruleChangeStatement | this_CreationStatement_1= ruleCreationStatement ) (otherlv_2= FullStop )?
            {
            // InternalFeatureLangParser.g:109:3: (this_ChangeStatement_0= ruleChangeStatement | this_CreationStatement_1= ruleCreationStatement )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalFeatureLangParser.g:110:4: this_ChangeStatement_0= ruleChangeStatement
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
                    // InternalFeatureLangParser.g:119:4: this_CreationStatement_1= ruleCreationStatement
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

            // InternalFeatureLangParser.g:128:3: (otherlv_2= FullStop )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==FullStop) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalFeatureLangParser.g:129:4: otherlv_2= FullStop
                    {
                    otherlv_2=(Token)match(input,FullStop,FOLLOW_2); 

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
    // InternalFeatureLangParser.g:138:1: entryRuleChangeStatement returns [EObject current=null] : iv_ruleChangeStatement= ruleChangeStatement EOF ;
    public final EObject entryRuleChangeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeStatement = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:140:2: (iv_ruleChangeStatement= ruleChangeStatement EOF )
            // InternalFeatureLangParser.g:141:2: iv_ruleChangeStatement= ruleChangeStatement EOF
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
    // InternalFeatureLangParser.g:150:1: ruleChangeStatement returns [EObject current=null] : ( ( (lv_target_0_0= ruleClass ) ) ( ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? ( (lv_action_3_0= ruleAction ) ) ) | ( (lv_update_4_0= ruleUpdateAction ) ) ) ) ;
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
            // InternalFeatureLangParser.g:157:2: ( ( ( (lv_target_0_0= ruleClass ) ) ( ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? ( (lv_action_3_0= ruleAction ) ) ) | ( (lv_update_4_0= ruleUpdateAction ) ) ) ) )
            // InternalFeatureLangParser.g:158:2: ( ( (lv_target_0_0= ruleClass ) ) ( ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? ( (lv_action_3_0= ruleAction ) ) ) | ( (lv_update_4_0= ruleUpdateAction ) ) ) )
            {
            // InternalFeatureLangParser.g:158:2: ( ( (lv_target_0_0= ruleClass ) ) ( ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? ( (lv_action_3_0= ruleAction ) ) ) | ( (lv_update_4_0= ruleUpdateAction ) ) ) )
            // InternalFeatureLangParser.g:159:3: ( (lv_target_0_0= ruleClass ) ) ( ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? ( (lv_action_3_0= ruleAction ) ) ) | ( (lv_update_4_0= ruleUpdateAction ) ) )
            {
            // InternalFeatureLangParser.g:159:3: ( (lv_target_0_0= ruleClass ) )
            // InternalFeatureLangParser.g:160:4: (lv_target_0_0= ruleClass )
            {
            // InternalFeatureLangParser.g:160:4: (lv_target_0_0= ruleClass )
            // InternalFeatureLangParser.g:161:5: lv_target_0_0= ruleClass
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

            // InternalFeatureLangParser.g:178:3: ( ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? ( (lv_action_3_0= ruleAction ) ) ) | ( (lv_update_4_0= ruleUpdateAction ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Should||LA5_0==Must) ) {
                alt5=1;
            }
            else if ( (LA5_0==Has) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalFeatureLangParser.g:179:4: ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? ( (lv_action_3_0= ruleAction ) ) )
                    {
                    // InternalFeatureLangParser.g:179:4: ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? ( (lv_action_3_0= ruleAction ) ) )
                    // InternalFeatureLangParser.g:180:5: ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? ( (lv_action_3_0= ruleAction ) )
                    {
                    // InternalFeatureLangParser.g:180:5: ( (lv_priority_1_0= rulePriority ) )
                    // InternalFeatureLangParser.g:181:6: (lv_priority_1_0= rulePriority )
                    {
                    // InternalFeatureLangParser.g:181:6: (lv_priority_1_0= rulePriority )
                    // InternalFeatureLangParser.g:182:7: lv_priority_1_0= rulePriority
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

                    // InternalFeatureLangParser.g:199:5: ( (lv_negation_2_0= Not ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==Not) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalFeatureLangParser.g:200:6: (lv_negation_2_0= Not )
                            {
                            // InternalFeatureLangParser.g:200:6: (lv_negation_2_0= Not )
                            // InternalFeatureLangParser.g:201:7: lv_negation_2_0= Not
                            {
                            lv_negation_2_0=(Token)match(input,Not,FOLLOW_6); 

                            							newLeafNode(lv_negation_2_0, grammarAccess.getChangeStatementAccess().getNegationNotKeyword_1_0_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getChangeStatementRule());
                            							}
                            							setWithLastConsumed(current, "negation", lv_negation_2_0 != null, "not");
                            						

                            }


                            }
                            break;

                    }

                    // InternalFeatureLangParser.g:213:5: ( (lv_action_3_0= ruleAction ) )
                    // InternalFeatureLangParser.g:214:6: (lv_action_3_0= ruleAction )
                    {
                    // InternalFeatureLangParser.g:214:6: (lv_action_3_0= ruleAction )
                    // InternalFeatureLangParser.g:215:7: lv_action_3_0= ruleAction
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
                    // InternalFeatureLangParser.g:234:4: ( (lv_update_4_0= ruleUpdateAction ) )
                    {
                    // InternalFeatureLangParser.g:234:4: ( (lv_update_4_0= ruleUpdateAction ) )
                    // InternalFeatureLangParser.g:235:5: (lv_update_4_0= ruleUpdateAction )
                    {
                    // InternalFeatureLangParser.g:235:5: (lv_update_4_0= ruleUpdateAction )
                    // InternalFeatureLangParser.g:236:6: lv_update_4_0= ruleUpdateAction
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
    // InternalFeatureLangParser.g:261:1: entryRuleCreationStatement returns [EObject current=null] : iv_ruleCreationStatement= ruleCreationStatement EOF ;
    public final EObject entryRuleCreationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreationStatement = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:263:2: (iv_ruleCreationStatement= ruleCreationStatement EOF )
            // InternalFeatureLangParser.g:264:2: iv_ruleCreationStatement= ruleCreationStatement EOF
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
    // InternalFeatureLangParser.g:273:1: ruleCreationStatement returns [EObject current=null] : ( ( (lv_classElement_0_0= ruleClass ) ) ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? (otherlv_3= Exist | otherlv_4= Be ) ) ;
    public final EObject ruleCreationStatement() throws RecognitionException {
        EObject current = null;

        Token lv_negation_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_classElement_0_0 = null;

        EObject lv_priority_1_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:280:2: ( ( ( (lv_classElement_0_0= ruleClass ) ) ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? (otherlv_3= Exist | otherlv_4= Be ) ) )
            // InternalFeatureLangParser.g:281:2: ( ( (lv_classElement_0_0= ruleClass ) ) ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? (otherlv_3= Exist | otherlv_4= Be ) )
            {
            // InternalFeatureLangParser.g:281:2: ( ( (lv_classElement_0_0= ruleClass ) ) ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? (otherlv_3= Exist | otherlv_4= Be ) )
            // InternalFeatureLangParser.g:282:3: ( (lv_classElement_0_0= ruleClass ) ) ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? (otherlv_3= Exist | otherlv_4= Be )
            {
            // InternalFeatureLangParser.g:282:3: ( (lv_classElement_0_0= ruleClass ) )
            // InternalFeatureLangParser.g:283:4: (lv_classElement_0_0= ruleClass )
            {
            // InternalFeatureLangParser.g:283:4: (lv_classElement_0_0= ruleClass )
            // InternalFeatureLangParser.g:284:5: lv_classElement_0_0= ruleClass
            {

            					newCompositeNode(grammarAccess.getCreationStatementAccess().getClassElementClassParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_classElement_0_0=ruleClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreationStatementRule());
            					}
            					set(
            						current,
            						"classElement",
            						lv_classElement_0_0,
            						"de.tud.st.featurelang.FeatureLang.Class");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFeatureLangParser.g:301:3: ( (lv_priority_1_0= rulePriority ) )
            // InternalFeatureLangParser.g:302:4: (lv_priority_1_0= rulePriority )
            {
            // InternalFeatureLangParser.g:302:4: (lv_priority_1_0= rulePriority )
            // InternalFeatureLangParser.g:303:5: lv_priority_1_0= rulePriority
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

            // InternalFeatureLangParser.g:320:3: ( (lv_negation_2_0= Not ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Not) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalFeatureLangParser.g:321:4: (lv_negation_2_0= Not )
                    {
                    // InternalFeatureLangParser.g:321:4: (lv_negation_2_0= Not )
                    // InternalFeatureLangParser.g:322:5: lv_negation_2_0= Not
                    {
                    lv_negation_2_0=(Token)match(input,Not,FOLLOW_9); 

                    					newLeafNode(lv_negation_2_0, grammarAccess.getCreationStatementAccess().getNegationNotKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCreationStatementRule());
                    					}
                    					setWithLastConsumed(current, "negation", lv_negation_2_0 != null, "not");
                    				

                    }


                    }
                    break;

            }

            // InternalFeatureLangParser.g:334:3: (otherlv_3= Exist | otherlv_4= Be )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Exist) ) {
                alt7=1;
            }
            else if ( (LA7_0==Be) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalFeatureLangParser.g:335:4: otherlv_3= Exist
                    {
                    otherlv_3=(Token)match(input,Exist,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getCreationStatementAccess().getExistKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:340:4: otherlv_4= Be
                    {
                    otherlv_4=(Token)match(input,Be,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getCreationStatementAccess().getBeKeyword_3_1());
                    			

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
    // $ANTLR end "ruleCreationStatement"


    // $ANTLR start "entryRuleAction"
    // InternalFeatureLangParser.g:352:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:354:2: (iv_ruleAction= ruleAction EOF )
            // InternalFeatureLangParser.g:355:2: iv_ruleAction= ruleAction EOF
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
    // InternalFeatureLangParser.g:364:1: ruleAction returns [EObject current=null] : ( ( (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_1 = null;

        EObject lv_type_0_2 = null;

        EObject lv_type_0_3 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:371:2: ( ( ( (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction ) ) ) )
            // InternalFeatureLangParser.g:372:2: ( ( (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction ) ) )
            {
            // InternalFeatureLangParser.g:372:2: ( ( (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction ) ) )
            // InternalFeatureLangParser.g:373:3: ( (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction ) )
            {
            // InternalFeatureLangParser.g:373:3: ( (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction ) )
            // InternalFeatureLangParser.g:374:4: (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction )
            {
            // InternalFeatureLangParser.g:374:4: (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Have) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==Associations) ) {
                    alt8=2;
                }
                else if ( ((LA8_1>=The && LA8_1<=An)||LA8_1==A) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0==Inherit) ) {
                alt8=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalFeatureLangParser.g:375:5: lv_type_0_1= ruleAttributeAction
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
                    // InternalFeatureLangParser.g:391:5: lv_type_0_2= ruleAssociationAction
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
                    // InternalFeatureLangParser.g:407:5: lv_type_0_3= ruleInheritanceAction
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
    // InternalFeatureLangParser.g:431:1: entryRuleUpdateAction returns [EObject current=null] : iv_ruleUpdateAction= ruleUpdateAction EOF ;
    public final EObject entryRuleUpdateAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateAction = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:433:2: (iv_ruleUpdateAction= ruleUpdateAction EOF )
            // InternalFeatureLangParser.g:434:2: iv_ruleUpdateAction= ruleUpdateAction EOF
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
    // InternalFeatureLangParser.g:443:1: ruleUpdateAction returns [EObject current=null] : (otherlv_0= Has (otherlv_1= An | otherlv_2= A ) (otherlv_3= Existing )? ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= FullStop otherlv_6= It ( (lv_priority_7_0= rulePriority ) ) otherlv_8= Be otherlv_9= A ( (lv_type_10_0= ruleDatatype ) ) ) ;
    public final EObject ruleUpdateAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_attribute_4_0 = null;

        EObject lv_priority_7_0 = null;

        Enumerator lv_type_10_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:450:2: ( (otherlv_0= Has (otherlv_1= An | otherlv_2= A ) (otherlv_3= Existing )? ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= FullStop otherlv_6= It ( (lv_priority_7_0= rulePriority ) ) otherlv_8= Be otherlv_9= A ( (lv_type_10_0= ruleDatatype ) ) ) )
            // InternalFeatureLangParser.g:451:2: (otherlv_0= Has (otherlv_1= An | otherlv_2= A ) (otherlv_3= Existing )? ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= FullStop otherlv_6= It ( (lv_priority_7_0= rulePriority ) ) otherlv_8= Be otherlv_9= A ( (lv_type_10_0= ruleDatatype ) ) )
            {
            // InternalFeatureLangParser.g:451:2: (otherlv_0= Has (otherlv_1= An | otherlv_2= A ) (otherlv_3= Existing )? ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= FullStop otherlv_6= It ( (lv_priority_7_0= rulePriority ) ) otherlv_8= Be otherlv_9= A ( (lv_type_10_0= ruleDatatype ) ) )
            // InternalFeatureLangParser.g:452:3: otherlv_0= Has (otherlv_1= An | otherlv_2= A ) (otherlv_3= Existing )? ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= FullStop otherlv_6= It ( (lv_priority_7_0= rulePriority ) ) otherlv_8= Be otherlv_9= A ( (lv_type_10_0= ruleDatatype ) )
            {
            otherlv_0=(Token)match(input,Has,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getUpdateActionAccess().getHasKeyword_0());
            		
            // InternalFeatureLangParser.g:456:3: (otherlv_1= An | otherlv_2= A )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==An) ) {
                alt9=1;
            }
            else if ( (LA9_0==A) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalFeatureLangParser.g:457:4: otherlv_1= An
                    {
                    otherlv_1=(Token)match(input,An,FOLLOW_11); 

                    				newLeafNode(otherlv_1, grammarAccess.getUpdateActionAccess().getAnKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:462:4: otherlv_2= A
                    {
                    otherlv_2=(Token)match(input,A,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getUpdateActionAccess().getAKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalFeatureLangParser.g:467:3: (otherlv_3= Existing )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Existing) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalFeatureLangParser.g:468:4: otherlv_3= Existing
                    {
                    otherlv_3=(Token)match(input,Existing,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getUpdateActionAccess().getExistingKeyword_2());
                    			

                    }
                    break;

            }

            // InternalFeatureLangParser.g:473:3: ( (lv_attribute_4_0= ruleAttribute ) )
            // InternalFeatureLangParser.g:474:4: (lv_attribute_4_0= ruleAttribute )
            {
            // InternalFeatureLangParser.g:474:4: (lv_attribute_4_0= ruleAttribute )
            // InternalFeatureLangParser.g:475:5: lv_attribute_4_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getUpdateActionAccess().getAttributeAttributeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_attribute_4_0=ruleAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateActionRule());
            					}
            					set(
            						current,
            						"attribute",
            						lv_attribute_4_0,
            						"de.tud.st.featurelang.FeatureLang.Attribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,FullStop,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getUpdateActionAccess().getFullStopKeyword_4());
            		
            otherlv_6=(Token)match(input,It,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getUpdateActionAccess().getItKeyword_5());
            		
            // InternalFeatureLangParser.g:500:3: ( (lv_priority_7_0= rulePriority ) )
            // InternalFeatureLangParser.g:501:4: (lv_priority_7_0= rulePriority )
            {
            // InternalFeatureLangParser.g:501:4: (lv_priority_7_0= rulePriority )
            // InternalFeatureLangParser.g:502:5: lv_priority_7_0= rulePriority
            {

            					newCompositeNode(grammarAccess.getUpdateActionAccess().getPriorityPriorityParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_14);
            lv_priority_7_0=rulePriority();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateActionRule());
            					}
            					set(
            						current,
            						"priority",
            						lv_priority_7_0,
            						"de.tud.st.featurelang.FeatureLang.Priority");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,Be,FOLLOW_15); 

            			newLeafNode(otherlv_8, grammarAccess.getUpdateActionAccess().getBeKeyword_7());
            		
            otherlv_9=(Token)match(input,A,FOLLOW_16); 

            			newLeafNode(otherlv_9, grammarAccess.getUpdateActionAccess().getAKeyword_8());
            		
            // InternalFeatureLangParser.g:527:3: ( (lv_type_10_0= ruleDatatype ) )
            // InternalFeatureLangParser.g:528:4: (lv_type_10_0= ruleDatatype )
            {
            // InternalFeatureLangParser.g:528:4: (lv_type_10_0= ruleDatatype )
            // InternalFeatureLangParser.g:529:5: lv_type_10_0= ruleDatatype
            {

            					newCompositeNode(grammarAccess.getUpdateActionAccess().getTypeDatatypeEnumRuleCall_9_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_10_0=ruleDatatype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateActionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_10_0,
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
    // InternalFeatureLangParser.g:553:1: entryRuleAttributeAction returns [EObject current=null] : iv_ruleAttributeAction= ruleAttributeAction EOF ;
    public final EObject entryRuleAttributeAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeAction = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:555:2: (iv_ruleAttributeAction= ruleAttributeAction EOF )
            // InternalFeatureLangParser.g:556:2: iv_ruleAttributeAction= ruleAttributeAction EOF
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
    // InternalFeatureLangParser.g:565:1: ruleAttributeAction returns [EObject current=null] : (otherlv_0= Have (otherlv_1= The | otherlv_2= An | otherlv_3= A ) ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= FullStop (otherlv_6= It otherlv_7= Is otherlv_8= A ( (lv_type_9_0= ruleDatatype ) ) )? ) ;
    public final EObject ruleAttributeAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_attribute_4_0 = null;

        Enumerator lv_type_9_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:572:2: ( (otherlv_0= Have (otherlv_1= The | otherlv_2= An | otherlv_3= A ) ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= FullStop (otherlv_6= It otherlv_7= Is otherlv_8= A ( (lv_type_9_0= ruleDatatype ) ) )? ) )
            // InternalFeatureLangParser.g:573:2: (otherlv_0= Have (otherlv_1= The | otherlv_2= An | otherlv_3= A ) ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= FullStop (otherlv_6= It otherlv_7= Is otherlv_8= A ( (lv_type_9_0= ruleDatatype ) ) )? )
            {
            // InternalFeatureLangParser.g:573:2: (otherlv_0= Have (otherlv_1= The | otherlv_2= An | otherlv_3= A ) ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= FullStop (otherlv_6= It otherlv_7= Is otherlv_8= A ( (lv_type_9_0= ruleDatatype ) ) )? )
            // InternalFeatureLangParser.g:574:3: otherlv_0= Have (otherlv_1= The | otherlv_2= An | otherlv_3= A ) ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= FullStop (otherlv_6= It otherlv_7= Is otherlv_8= A ( (lv_type_9_0= ruleDatatype ) ) )?
            {
            otherlv_0=(Token)match(input,Have,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeActionAccess().getHaveKeyword_0());
            		
            // InternalFeatureLangParser.g:578:3: (otherlv_1= The | otherlv_2= An | otherlv_3= A )
            int alt11=3;
            switch ( input.LA(1) ) {
            case The:
                {
                alt11=1;
                }
                break;
            case An:
                {
                alt11=2;
                }
                break;
            case A:
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
                    // InternalFeatureLangParser.g:579:4: otherlv_1= The
                    {
                    otherlv_1=(Token)match(input,The,FOLLOW_11); 

                    				newLeafNode(otherlv_1, grammarAccess.getAttributeActionAccess().getTheKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:584:4: otherlv_2= An
                    {
                    otherlv_2=(Token)match(input,An,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getAttributeActionAccess().getAnKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalFeatureLangParser.g:589:4: otherlv_3= A
                    {
                    otherlv_3=(Token)match(input,A,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getAttributeActionAccess().getAKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalFeatureLangParser.g:594:3: ( (lv_attribute_4_0= ruleAttribute ) )
            // InternalFeatureLangParser.g:595:4: (lv_attribute_4_0= ruleAttribute )
            {
            // InternalFeatureLangParser.g:595:4: (lv_attribute_4_0= ruleAttribute )
            // InternalFeatureLangParser.g:596:5: lv_attribute_4_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getAttributeActionAccess().getAttributeAttributeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_attribute_4_0=ruleAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeActionRule());
            					}
            					set(
            						current,
            						"attribute",
            						lv_attribute_4_0,
            						"de.tud.st.featurelang.FeatureLang.Attribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,FullStop,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getAttributeActionAccess().getFullStopKeyword_3());
            		
            // InternalFeatureLangParser.g:617:3: (otherlv_6= It otherlv_7= Is otherlv_8= A ( (lv_type_9_0= ruleDatatype ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==It) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalFeatureLangParser.g:618:4: otherlv_6= It otherlv_7= Is otherlv_8= A ( (lv_type_9_0= ruleDatatype ) )
                    {
                    otherlv_6=(Token)match(input,It,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getAttributeActionAccess().getItKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,Is,FOLLOW_15); 

                    				newLeafNode(otherlv_7, grammarAccess.getAttributeActionAccess().getIsKeyword_4_1());
                    			
                    otherlv_8=(Token)match(input,A,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getAttributeActionAccess().getAKeyword_4_2());
                    			
                    // InternalFeatureLangParser.g:630:4: ( (lv_type_9_0= ruleDatatype ) )
                    // InternalFeatureLangParser.g:631:5: (lv_type_9_0= ruleDatatype )
                    {
                    // InternalFeatureLangParser.g:631:5: (lv_type_9_0= ruleDatatype )
                    // InternalFeatureLangParser.g:632:6: lv_type_9_0= ruleDatatype
                    {

                    						newCompositeNode(grammarAccess.getAttributeActionAccess().getTypeDatatypeEnumRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_9_0=ruleDatatype();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeActionRule());
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
    // InternalFeatureLangParser.g:657:1: entryRuleAssociationAction returns [EObject current=null] : iv_ruleAssociationAction= ruleAssociationAction EOF ;
    public final EObject entryRuleAssociationAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationAction = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:659:2: (iv_ruleAssociationAction= ruleAssociationAction EOF )
            // InternalFeatureLangParser.g:660:2: iv_ruleAssociationAction= ruleAssociationAction EOF
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
    // InternalFeatureLangParser.g:669:1: ruleAssociationAction returns [EObject current=null] : (otherlv_0= Have otherlv_1= Associations otherlv_2= To (otherlv_3= Other )? ( (lv_target_4_0= ruleClass ) ) otherlv_5= Called ( (lv_relation_6_0= RULE_ID ) ) ) ;
    public final EObject ruleAssociationAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_relation_6_0=null;
        EObject lv_target_4_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:676:2: ( (otherlv_0= Have otherlv_1= Associations otherlv_2= To (otherlv_3= Other )? ( (lv_target_4_0= ruleClass ) ) otherlv_5= Called ( (lv_relation_6_0= RULE_ID ) ) ) )
            // InternalFeatureLangParser.g:677:2: (otherlv_0= Have otherlv_1= Associations otherlv_2= To (otherlv_3= Other )? ( (lv_target_4_0= ruleClass ) ) otherlv_5= Called ( (lv_relation_6_0= RULE_ID ) ) )
            {
            // InternalFeatureLangParser.g:677:2: (otherlv_0= Have otherlv_1= Associations otherlv_2= To (otherlv_3= Other )? ( (lv_target_4_0= ruleClass ) ) otherlv_5= Called ( (lv_relation_6_0= RULE_ID ) ) )
            // InternalFeatureLangParser.g:678:3: otherlv_0= Have otherlv_1= Associations otherlv_2= To (otherlv_3= Other )? ( (lv_target_4_0= ruleClass ) ) otherlv_5= Called ( (lv_relation_6_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Have,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getAssociationActionAccess().getHaveKeyword_0());
            		
            otherlv_1=(Token)match(input,Associations,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationActionAccess().getAssociationsKeyword_1());
            		
            otherlv_2=(Token)match(input,To,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getAssociationActionAccess().getToKeyword_2());
            		
            // InternalFeatureLangParser.g:690:3: (otherlv_3= Other )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Other) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalFeatureLangParser.g:691:4: otherlv_3= Other
                    {
                    otherlv_3=(Token)match(input,Other,FOLLOW_23); 

                    				newLeafNode(otherlv_3, grammarAccess.getAssociationActionAccess().getOtherKeyword_3());
                    			

                    }
                    break;

            }

            // InternalFeatureLangParser.g:696:3: ( (lv_target_4_0= ruleClass ) )
            // InternalFeatureLangParser.g:697:4: (lv_target_4_0= ruleClass )
            {
            // InternalFeatureLangParser.g:697:4: (lv_target_4_0= ruleClass )
            // InternalFeatureLangParser.g:698:5: lv_target_4_0= ruleClass
            {

            					newCompositeNode(grammarAccess.getAssociationActionAccess().getTargetClassParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_24);
            lv_target_4_0=ruleClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationActionRule());
            					}
            					set(
            						current,
            						"target",
            						lv_target_4_0,
            						"de.tud.st.featurelang.FeatureLang.Class");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,Called,FOLLOW_25); 

            			newLeafNode(otherlv_5, grammarAccess.getAssociationActionAccess().getCalledKeyword_5());
            		
            // InternalFeatureLangParser.g:719:3: ( (lv_relation_6_0= RULE_ID ) )
            // InternalFeatureLangParser.g:720:4: (lv_relation_6_0= RULE_ID )
            {
            // InternalFeatureLangParser.g:720:4: (lv_relation_6_0= RULE_ID )
            // InternalFeatureLangParser.g:721:5: lv_relation_6_0= RULE_ID
            {
            lv_relation_6_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_relation_6_0, grammarAccess.getAssociationActionAccess().getRelationIDTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"relation",
            						lv_relation_6_0,
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
    // InternalFeatureLangParser.g:744:1: entryRuleInheritanceAction returns [EObject current=null] : iv_ruleInheritanceAction= ruleInheritanceAction EOF ;
    public final EObject entryRuleInheritanceAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInheritanceAction = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:746:2: (iv_ruleInheritanceAction= ruleInheritanceAction EOF )
            // InternalFeatureLangParser.g:747:2: iv_ruleInheritanceAction= ruleInheritanceAction EOF
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
    // InternalFeatureLangParser.g:756:1: ruleInheritanceAction returns [EObject current=null] : (otherlv_0= Inherit otherlv_1= From ( (lv_parent_2_0= ruleClass ) ) ) ;
    public final EObject ruleInheritanceAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_parent_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:763:2: ( (otherlv_0= Inherit otherlv_1= From ( (lv_parent_2_0= ruleClass ) ) ) )
            // InternalFeatureLangParser.g:764:2: (otherlv_0= Inherit otherlv_1= From ( (lv_parent_2_0= ruleClass ) ) )
            {
            // InternalFeatureLangParser.g:764:2: (otherlv_0= Inherit otherlv_1= From ( (lv_parent_2_0= ruleClass ) ) )
            // InternalFeatureLangParser.g:765:3: otherlv_0= Inherit otherlv_1= From ( (lv_parent_2_0= ruleClass ) )
            {
            otherlv_0=(Token)match(input,Inherit,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getInheritanceActionAccess().getInheritKeyword_0());
            		
            otherlv_1=(Token)match(input,From,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getInheritanceActionAccess().getFromKeyword_1());
            		
            // InternalFeatureLangParser.g:773:3: ( (lv_parent_2_0= ruleClass ) )
            // InternalFeatureLangParser.g:774:4: (lv_parent_2_0= ruleClass )
            {
            // InternalFeatureLangParser.g:774:4: (lv_parent_2_0= ruleClass )
            // InternalFeatureLangParser.g:775:5: lv_parent_2_0= ruleClass
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
    // InternalFeatureLangParser.g:799:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:801:2: (iv_ruleClass= ruleClass EOF )
            // InternalFeatureLangParser.g:802:2: iv_ruleClass= ruleClass EOF
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
    // InternalFeatureLangParser.g:811:1: ruleClass returns [EObject current=null] : ( (otherlv_0= The | otherlv_1= A )? (otherlv_2= Class )? ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:818:2: ( ( (otherlv_0= The | otherlv_1= A )? (otherlv_2= Class )? ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalFeatureLangParser.g:819:2: ( (otherlv_0= The | otherlv_1= A )? (otherlv_2= Class )? ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalFeatureLangParser.g:819:2: ( (otherlv_0= The | otherlv_1= A )? (otherlv_2= Class )? ( (lv_name_3_0= RULE_ID ) ) )
            // InternalFeatureLangParser.g:820:3: (otherlv_0= The | otherlv_1= A )? (otherlv_2= Class )? ( (lv_name_3_0= RULE_ID ) )
            {
            // InternalFeatureLangParser.g:820:3: (otherlv_0= The | otherlv_1= A )?
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==The) ) {
                alt14=1;
            }
            else if ( (LA14_0==A) ) {
                alt14=2;
            }
            switch (alt14) {
                case 1 :
                    // InternalFeatureLangParser.g:821:4: otherlv_0= The
                    {
                    otherlv_0=(Token)match(input,The,FOLLOW_27); 

                    				newLeafNode(otherlv_0, grammarAccess.getClassAccess().getTheKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:826:4: otherlv_1= A
                    {
                    otherlv_1=(Token)match(input,A,FOLLOW_27); 

                    				newLeafNode(otherlv_1, grammarAccess.getClassAccess().getAKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalFeatureLangParser.g:831:3: (otherlv_2= Class )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Class) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalFeatureLangParser.g:832:4: otherlv_2= Class
                    {
                    otherlv_2=(Token)match(input,Class,FOLLOW_25); 

                    				newLeafNode(otherlv_2, grammarAccess.getClassAccess().getClassKeyword_1());
                    			

                    }
                    break;

            }

            // InternalFeatureLangParser.g:837:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalFeatureLangParser.g:838:4: (lv_name_3_0= RULE_ID )
            {
            // InternalFeatureLangParser.g:838:4: (lv_name_3_0= RULE_ID )
            // InternalFeatureLangParser.g:839:5: lv_name_3_0= RULE_ID
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
    // InternalFeatureLangParser.g:862:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:864:2: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalFeatureLangParser.g:865:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalFeatureLangParser.g:874:1: ruleAttribute returns [EObject current=null] : ( (otherlv_0= Attribute )? ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:881:2: ( ( (otherlv_0= Attribute )? ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalFeatureLangParser.g:882:2: ( (otherlv_0= Attribute )? ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalFeatureLangParser.g:882:2: ( (otherlv_0= Attribute )? ( (lv_name_1_0= RULE_ID ) ) )
            // InternalFeatureLangParser.g:883:3: (otherlv_0= Attribute )? ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalFeatureLangParser.g:883:3: (otherlv_0= Attribute )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Attribute) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalFeatureLangParser.g:884:4: otherlv_0= Attribute
                    {
                    otherlv_0=(Token)match(input,Attribute,FOLLOW_25); 

                    				newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
                    			

                    }
                    break;

            }

            // InternalFeatureLangParser.g:889:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFeatureLangParser.g:890:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFeatureLangParser.g:890:4: (lv_name_1_0= RULE_ID )
            // InternalFeatureLangParser.g:891:5: lv_name_1_0= RULE_ID
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
    // InternalFeatureLangParser.g:914:1: entryRulePriority returns [EObject current=null] : iv_rulePriority= rulePriority EOF ;
    public final EObject entryRulePriority() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePriority = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:916:2: (iv_rulePriority= rulePriority EOF )
            // InternalFeatureLangParser.g:917:2: iv_rulePriority= rulePriority EOF
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
    // InternalFeatureLangParser.g:926:1: rulePriority returns [EObject current=null] : ( (lv_priority_0_0= rulePriorityValue ) ) ;
    public final EObject rulePriority() throws RecognitionException {
        EObject current = null;

        Enumerator lv_priority_0_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:933:2: ( ( (lv_priority_0_0= rulePriorityValue ) ) )
            // InternalFeatureLangParser.g:934:2: ( (lv_priority_0_0= rulePriorityValue ) )
            {
            // InternalFeatureLangParser.g:934:2: ( (lv_priority_0_0= rulePriorityValue ) )
            // InternalFeatureLangParser.g:935:3: (lv_priority_0_0= rulePriorityValue )
            {
            // InternalFeatureLangParser.g:935:3: (lv_priority_0_0= rulePriorityValue )
            // InternalFeatureLangParser.g:936:4: lv_priority_0_0= rulePriorityValue
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
    // InternalFeatureLangParser.g:959:1: rulePriorityValue returns [Enumerator current=null] : ( (enumLiteral_0= Should ) | (enumLiteral_1= Must ) ) ;
    public final Enumerator rulePriorityValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFeatureLangParser.g:965:2: ( ( (enumLiteral_0= Should ) | (enumLiteral_1= Must ) ) )
            // InternalFeatureLangParser.g:966:2: ( (enumLiteral_0= Should ) | (enumLiteral_1= Must ) )
            {
            // InternalFeatureLangParser.g:966:2: ( (enumLiteral_0= Should ) | (enumLiteral_1= Must ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Should) ) {
                alt17=1;
            }
            else if ( (LA17_0==Must) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalFeatureLangParser.g:967:3: (enumLiteral_0= Should )
                    {
                    // InternalFeatureLangParser.g:967:3: (enumLiteral_0= Should )
                    // InternalFeatureLangParser.g:968:4: enumLiteral_0= Should
                    {
                    enumLiteral_0=(Token)match(input,Should,FOLLOW_2); 

                    				current = grammarAccess.getPriorityValueAccess().getSHOULDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPriorityValueAccess().getSHOULDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:975:3: (enumLiteral_1= Must )
                    {
                    // InternalFeatureLangParser.g:975:3: (enumLiteral_1= Must )
                    // InternalFeatureLangParser.g:976:4: enumLiteral_1= Must
                    {
                    enumLiteral_1=(Token)match(input,Must,FOLLOW_2); 

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
    // InternalFeatureLangParser.g:986:1: ruleDatatype returns [Enumerator current=null] : ( (enumLiteral_0= Time ) | (enumLiteral_1= Phrase ) | (enumLiteral_2= Number ) ) ;
    public final Enumerator ruleDatatype() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalFeatureLangParser.g:992:2: ( ( (enumLiteral_0= Time ) | (enumLiteral_1= Phrase ) | (enumLiteral_2= Number ) ) )
            // InternalFeatureLangParser.g:993:2: ( (enumLiteral_0= Time ) | (enumLiteral_1= Phrase ) | (enumLiteral_2= Number ) )
            {
            // InternalFeatureLangParser.g:993:2: ( (enumLiteral_0= Time ) | (enumLiteral_1= Phrase ) | (enumLiteral_2= Number ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case Time:
                {
                alt18=1;
                }
                break;
            case Phrase:
                {
                alt18=2;
                }
                break;
            case Number:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalFeatureLangParser.g:994:3: (enumLiteral_0= Time )
                    {
                    // InternalFeatureLangParser.g:994:3: (enumLiteral_0= Time )
                    // InternalFeatureLangParser.g:995:4: enumLiteral_0= Time
                    {
                    enumLiteral_0=(Token)match(input,Time,FOLLOW_2); 

                    				current = grammarAccess.getDatatypeAccess().getWORDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDatatypeAccess().getWORDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1002:3: (enumLiteral_1= Phrase )
                    {
                    // InternalFeatureLangParser.g:1002:3: (enumLiteral_1= Phrase )
                    // InternalFeatureLangParser.g:1003:4: enumLiteral_1= Phrase
                    {
                    enumLiteral_1=(Token)match(input,Phrase,FOLLOW_2); 

                    				current = grammarAccess.getDatatypeAccess().getPHRASEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDatatypeAccess().getPHRASEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureLangParser.g:1010:3: (enumLiteral_2= Number )
                    {
                    // InternalFeatureLangParser.g:1010:3: (enumLiteral_2= Number )
                    // InternalFeatureLangParser.g:1011:4: enumLiteral_2= Number
                    {
                    enumLiteral_2=(Token)match(input,Number,FOLLOW_2); 

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


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\3\14\1\35\1\13\2\7\1\uffff\1\7\1\uffff";
    static final String dfa_3s = "\4\35\1\23\2\27\1\uffff\1\27\1\uffff";
    static final String dfa_4s = "\7\uffff\1\1\1\uffff\1\2";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\10\uffff\1\1\6\uffff\1\2\1\4",
            "\1\3\20\uffff\1\4",
            "\1\3\20\uffff\1\4",
            "\1\4",
            "\1\5\5\uffff\1\6\1\uffff\1\7",
            "\1\7\5\uffff\1\11\2\uffff\1\7\3\uffff\1\10\2\uffff\1\11",
            "\1\7\5\uffff\1\11\2\uffff\1\7\3\uffff\1\10\2\uffff\1\11",
            "",
            "\1\7\5\uffff\1\11\2\uffff\1\7\6\uffff\1\11",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "109:3: (this_ChangeStatement_0= ruleChangeStatement | this_CreationStatement_1= ruleCreationStatement )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000030201002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000A0800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000110080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000902000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000060L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040600L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010600000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000030205000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000030201000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020001000L});

}