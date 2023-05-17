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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Associations", "Attribute", "Existing", "Inherit", "Called", "Number", "Phrase", "Should", "Class", "Exist", "There", "From", "Have", "Must", "Time", "Has", "Not", "The", "An", "Be", "Is", "It", "To", "FullStop", "A", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
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
    public static final int There=14;
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

                if ( (LA1_0==Class||LA1_0==There||LA1_0==The||LA1_0==It||(LA1_0>=A && LA1_0<=RULE_ID)) ) {
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
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Class||LA2_0==The||(LA2_0>=A && LA2_0<=RULE_ID)) ) {
                alt2=1;
            }
            else if ( (LA2_0==There||LA2_0==It) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
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
    // InternalFeatureLangParser.g:273:1: ruleCreationStatement returns [EObject current=null] : ( (otherlv_0= It | otherlv_1= There ) ( (lv_priority_2_0= rulePriority ) ) ( (lv_negation_3_0= Not ) )? (otherlv_4= Exist | otherlv_5= Be ) ( (lv_classElement_6_0= ruleClass ) ) ) ;
    public final EObject ruleCreationStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_negation_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_priority_2_0 = null;

        EObject lv_classElement_6_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:280:2: ( ( (otherlv_0= It | otherlv_1= There ) ( (lv_priority_2_0= rulePriority ) ) ( (lv_negation_3_0= Not ) )? (otherlv_4= Exist | otherlv_5= Be ) ( (lv_classElement_6_0= ruleClass ) ) ) )
            // InternalFeatureLangParser.g:281:2: ( (otherlv_0= It | otherlv_1= There ) ( (lv_priority_2_0= rulePriority ) ) ( (lv_negation_3_0= Not ) )? (otherlv_4= Exist | otherlv_5= Be ) ( (lv_classElement_6_0= ruleClass ) ) )
            {
            // InternalFeatureLangParser.g:281:2: ( (otherlv_0= It | otherlv_1= There ) ( (lv_priority_2_0= rulePriority ) ) ( (lv_negation_3_0= Not ) )? (otherlv_4= Exist | otherlv_5= Be ) ( (lv_classElement_6_0= ruleClass ) ) )
            // InternalFeatureLangParser.g:282:3: (otherlv_0= It | otherlv_1= There ) ( (lv_priority_2_0= rulePriority ) ) ( (lv_negation_3_0= Not ) )? (otherlv_4= Exist | otherlv_5= Be ) ( (lv_classElement_6_0= ruleClass ) )
            {
            // InternalFeatureLangParser.g:282:3: (otherlv_0= It | otherlv_1= There )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==It) ) {
                alt6=1;
            }
            else if ( (LA6_0==There) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalFeatureLangParser.g:283:4: otherlv_0= It
                    {
                    otherlv_0=(Token)match(input,It,FOLLOW_7); 

                    				newLeafNode(otherlv_0, grammarAccess.getCreationStatementAccess().getItKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:288:4: otherlv_1= There
                    {
                    otherlv_1=(Token)match(input,There,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getCreationStatementAccess().getThereKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalFeatureLangParser.g:293:3: ( (lv_priority_2_0= rulePriority ) )
            // InternalFeatureLangParser.g:294:4: (lv_priority_2_0= rulePriority )
            {
            // InternalFeatureLangParser.g:294:4: (lv_priority_2_0= rulePriority )
            // InternalFeatureLangParser.g:295:5: lv_priority_2_0= rulePriority
            {

            					newCompositeNode(grammarAccess.getCreationStatementAccess().getPriorityPriorityParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_priority_2_0=rulePriority();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreationStatementRule());
            					}
            					set(
            						current,
            						"priority",
            						lv_priority_2_0,
            						"de.tud.st.featurelang.FeatureLang.Priority");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFeatureLangParser.g:312:3: ( (lv_negation_3_0= Not ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Not) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalFeatureLangParser.g:313:4: (lv_negation_3_0= Not )
                    {
                    // InternalFeatureLangParser.g:313:4: (lv_negation_3_0= Not )
                    // InternalFeatureLangParser.g:314:5: lv_negation_3_0= Not
                    {
                    lv_negation_3_0=(Token)match(input,Not,FOLLOW_9); 

                    					newLeafNode(lv_negation_3_0, grammarAccess.getCreationStatementAccess().getNegationNotKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCreationStatementRule());
                    					}
                    					setWithLastConsumed(current, "negation", lv_negation_3_0 != null, "not");
                    				

                    }


                    }
                    break;

            }

            // InternalFeatureLangParser.g:326:3: (otherlv_4= Exist | otherlv_5= Be )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Exist) ) {
                alt8=1;
            }
            else if ( (LA8_0==Be) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalFeatureLangParser.g:327:4: otherlv_4= Exist
                    {
                    otherlv_4=(Token)match(input,Exist,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getCreationStatementAccess().getExistKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:332:4: otherlv_5= Be
                    {
                    otherlv_5=(Token)match(input,Be,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getCreationStatementAccess().getBeKeyword_3_1());
                    			

                    }
                    break;

            }

            // InternalFeatureLangParser.g:337:3: ( (lv_classElement_6_0= ruleClass ) )
            // InternalFeatureLangParser.g:338:4: (lv_classElement_6_0= ruleClass )
            {
            // InternalFeatureLangParser.g:338:4: (lv_classElement_6_0= ruleClass )
            // InternalFeatureLangParser.g:339:5: lv_classElement_6_0= ruleClass
            {

            					newCompositeNode(grammarAccess.getCreationStatementAccess().getClassElementClassParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_classElement_6_0=ruleClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreationStatementRule());
            					}
            					set(
            						current,
            						"classElement",
            						lv_classElement_6_0,
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
    // InternalFeatureLangParser.g:363:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:365:2: (iv_ruleAction= ruleAction EOF )
            // InternalFeatureLangParser.g:366:2: iv_ruleAction= ruleAction EOF
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
    // InternalFeatureLangParser.g:375:1: ruleAction returns [EObject current=null] : ( ( (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_1 = null;

        EObject lv_type_0_2 = null;

        EObject lv_type_0_3 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:382:2: ( ( ( (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction ) ) ) )
            // InternalFeatureLangParser.g:383:2: ( ( (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction ) ) )
            {
            // InternalFeatureLangParser.g:383:2: ( ( (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction ) ) )
            // InternalFeatureLangParser.g:384:3: ( (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction ) )
            {
            // InternalFeatureLangParser.g:384:3: ( (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction ) )
            // InternalFeatureLangParser.g:385:4: (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction )
            {
            // InternalFeatureLangParser.g:385:4: (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Have) ) {
                int LA9_1 = input.LA(2);

                if ( ((LA9_1>=The && LA9_1<=An)) ) {
                    alt9=1;
                }
                else if ( (LA9_1==Associations) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA9_0==Inherit) ) {
                alt9=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalFeatureLangParser.g:386:5: lv_type_0_1= ruleAttributeAction
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
                    // InternalFeatureLangParser.g:402:5: lv_type_0_2= ruleAssociationAction
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
                    // InternalFeatureLangParser.g:418:5: lv_type_0_3= ruleInheritanceAction
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
    // InternalFeatureLangParser.g:442:1: entryRuleUpdateAction returns [EObject current=null] : iv_ruleUpdateAction= ruleUpdateAction EOF ;
    public final EObject entryRuleUpdateAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateAction = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:444:2: (iv_ruleUpdateAction= ruleUpdateAction EOF )
            // InternalFeatureLangParser.g:445:2: iv_ruleUpdateAction= ruleUpdateAction EOF
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
    // InternalFeatureLangParser.g:454:1: ruleUpdateAction returns [EObject current=null] : (otherlv_0= Has otherlv_1= An (otherlv_2= Existing )? ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= FullStop otherlv_5= It ( (lv_priority_6_0= rulePriority ) ) otherlv_7= Be otherlv_8= A ( (lv_type_9_0= ruleDatatype ) ) ) ;
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
            // InternalFeatureLangParser.g:461:2: ( (otherlv_0= Has otherlv_1= An (otherlv_2= Existing )? ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= FullStop otherlv_5= It ( (lv_priority_6_0= rulePriority ) ) otherlv_7= Be otherlv_8= A ( (lv_type_9_0= ruleDatatype ) ) ) )
            // InternalFeatureLangParser.g:462:2: (otherlv_0= Has otherlv_1= An (otherlv_2= Existing )? ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= FullStop otherlv_5= It ( (lv_priority_6_0= rulePriority ) ) otherlv_7= Be otherlv_8= A ( (lv_type_9_0= ruleDatatype ) ) )
            {
            // InternalFeatureLangParser.g:462:2: (otherlv_0= Has otherlv_1= An (otherlv_2= Existing )? ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= FullStop otherlv_5= It ( (lv_priority_6_0= rulePriority ) ) otherlv_7= Be otherlv_8= A ( (lv_type_9_0= ruleDatatype ) ) )
            // InternalFeatureLangParser.g:463:3: otherlv_0= Has otherlv_1= An (otherlv_2= Existing )? ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= FullStop otherlv_5= It ( (lv_priority_6_0= rulePriority ) ) otherlv_7= Be otherlv_8= A ( (lv_type_9_0= ruleDatatype ) )
            {
            otherlv_0=(Token)match(input,Has,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getUpdateActionAccess().getHasKeyword_0());
            		
            otherlv_1=(Token)match(input,An,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getUpdateActionAccess().getAnKeyword_1());
            		
            // InternalFeatureLangParser.g:471:3: (otherlv_2= Existing )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Existing) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalFeatureLangParser.g:472:4: otherlv_2= Existing
                    {
                    otherlv_2=(Token)match(input,Existing,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getUpdateActionAccess().getExistingKeyword_2());
                    			

                    }
                    break;

            }

            // InternalFeatureLangParser.g:477:3: ( (lv_attribute_3_0= ruleAttribute ) )
            // InternalFeatureLangParser.g:478:4: (lv_attribute_3_0= ruleAttribute )
            {
            // InternalFeatureLangParser.g:478:4: (lv_attribute_3_0= ruleAttribute )
            // InternalFeatureLangParser.g:479:5: lv_attribute_3_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getUpdateActionAccess().getAttributeAttributeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
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

            otherlv_4=(Token)match(input,FullStop,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getUpdateActionAccess().getFullStopKeyword_4());
            		
            otherlv_5=(Token)match(input,It,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getUpdateActionAccess().getItKeyword_5());
            		
            // InternalFeatureLangParser.g:504:3: ( (lv_priority_6_0= rulePriority ) )
            // InternalFeatureLangParser.g:505:4: (lv_priority_6_0= rulePriority )
            {
            // InternalFeatureLangParser.g:505:4: (lv_priority_6_0= rulePriority )
            // InternalFeatureLangParser.g:506:5: lv_priority_6_0= rulePriority
            {

            					newCompositeNode(grammarAccess.getUpdateActionAccess().getPriorityPriorityParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_15);
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

            otherlv_7=(Token)match(input,Be,FOLLOW_16); 

            			newLeafNode(otherlv_7, grammarAccess.getUpdateActionAccess().getBeKeyword_7());
            		
            otherlv_8=(Token)match(input,A,FOLLOW_17); 

            			newLeafNode(otherlv_8, grammarAccess.getUpdateActionAccess().getAKeyword_8());
            		
            // InternalFeatureLangParser.g:531:3: ( (lv_type_9_0= ruleDatatype ) )
            // InternalFeatureLangParser.g:532:4: (lv_type_9_0= ruleDatatype )
            {
            // InternalFeatureLangParser.g:532:4: (lv_type_9_0= ruleDatatype )
            // InternalFeatureLangParser.g:533:5: lv_type_9_0= ruleDatatype
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
    // InternalFeatureLangParser.g:557:1: entryRuleAttributeAction returns [EObject current=null] : iv_ruleAttributeAction= ruleAttributeAction EOF ;
    public final EObject entryRuleAttributeAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeAction = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:559:2: (iv_ruleAttributeAction= ruleAttributeAction EOF )
            // InternalFeatureLangParser.g:560:2: iv_ruleAttributeAction= ruleAttributeAction EOF
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
    // InternalFeatureLangParser.g:569:1: ruleAttributeAction returns [EObject current=null] : (otherlv_0= Have (otherlv_1= The | otherlv_2= An ) ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= FullStop (otherlv_5= It otherlv_6= Is otherlv_7= A ( (lv_type_8_0= ruleDatatype ) ) )? ) ;
    public final EObject ruleAttributeAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_attribute_3_0 = null;

        Enumerator lv_type_8_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:576:2: ( (otherlv_0= Have (otherlv_1= The | otherlv_2= An ) ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= FullStop (otherlv_5= It otherlv_6= Is otherlv_7= A ( (lv_type_8_0= ruleDatatype ) ) )? ) )
            // InternalFeatureLangParser.g:577:2: (otherlv_0= Have (otherlv_1= The | otherlv_2= An ) ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= FullStop (otherlv_5= It otherlv_6= Is otherlv_7= A ( (lv_type_8_0= ruleDatatype ) ) )? )
            {
            // InternalFeatureLangParser.g:577:2: (otherlv_0= Have (otherlv_1= The | otherlv_2= An ) ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= FullStop (otherlv_5= It otherlv_6= Is otherlv_7= A ( (lv_type_8_0= ruleDatatype ) ) )? )
            // InternalFeatureLangParser.g:578:3: otherlv_0= Have (otherlv_1= The | otherlv_2= An ) ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= FullStop (otherlv_5= It otherlv_6= Is otherlv_7= A ( (lv_type_8_0= ruleDatatype ) ) )?
            {
            otherlv_0=(Token)match(input,Have,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeActionAccess().getHaveKeyword_0());
            		
            // InternalFeatureLangParser.g:582:3: (otherlv_1= The | otherlv_2= An )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==The) ) {
                alt11=1;
            }
            else if ( (LA11_0==An) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalFeatureLangParser.g:583:4: otherlv_1= The
                    {
                    otherlv_1=(Token)match(input,The,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getAttributeActionAccess().getTheKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:588:4: otherlv_2= An
                    {
                    otherlv_2=(Token)match(input,An,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getAttributeActionAccess().getAnKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalFeatureLangParser.g:593:3: ( (lv_attribute_3_0= ruleAttribute ) )
            // InternalFeatureLangParser.g:594:4: (lv_attribute_3_0= ruleAttribute )
            {
            // InternalFeatureLangParser.g:594:4: (lv_attribute_3_0= ruleAttribute )
            // InternalFeatureLangParser.g:595:5: lv_attribute_3_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getAttributeActionAccess().getAttributeAttributeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_attribute_3_0=ruleAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeActionRule());
            					}
            					set(
            						current,
            						"attribute",
            						lv_attribute_3_0,
            						"de.tud.st.featurelang.FeatureLang.Attribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,FullStop,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getAttributeActionAccess().getFullStopKeyword_3());
            		
            // InternalFeatureLangParser.g:616:3: (otherlv_5= It otherlv_6= Is otherlv_7= A ( (lv_type_8_0= ruleDatatype ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==It) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==Is) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // InternalFeatureLangParser.g:617:4: otherlv_5= It otherlv_6= Is otherlv_7= A ( (lv_type_8_0= ruleDatatype ) )
                    {
                    otherlv_5=(Token)match(input,It,FOLLOW_20); 

                    				newLeafNode(otherlv_5, grammarAccess.getAttributeActionAccess().getItKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,Is,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getAttributeActionAccess().getIsKeyword_4_1());
                    			
                    otherlv_7=(Token)match(input,A,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getAttributeActionAccess().getAKeyword_4_2());
                    			
                    // InternalFeatureLangParser.g:629:4: ( (lv_type_8_0= ruleDatatype ) )
                    // InternalFeatureLangParser.g:630:5: (lv_type_8_0= ruleDatatype )
                    {
                    // InternalFeatureLangParser.g:630:5: (lv_type_8_0= ruleDatatype )
                    // InternalFeatureLangParser.g:631:6: lv_type_8_0= ruleDatatype
                    {

                    						newCompositeNode(grammarAccess.getAttributeActionAccess().getTypeDatatypeEnumRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_8_0=ruleDatatype();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeActionRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_8_0,
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
    // InternalFeatureLangParser.g:656:1: entryRuleAssociationAction returns [EObject current=null] : iv_ruleAssociationAction= ruleAssociationAction EOF ;
    public final EObject entryRuleAssociationAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationAction = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:658:2: (iv_ruleAssociationAction= ruleAssociationAction EOF )
            // InternalFeatureLangParser.g:659:2: iv_ruleAssociationAction= ruleAssociationAction EOF
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
    // InternalFeatureLangParser.g:668:1: ruleAssociationAction returns [EObject current=null] : (otherlv_0= Have otherlv_1= Associations otherlv_2= To ( (lv_target_3_0= ruleClass ) ) otherlv_4= Called ( (lv_relation_5_0= RULE_ID ) ) ) ;
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
            // InternalFeatureLangParser.g:675:2: ( (otherlv_0= Have otherlv_1= Associations otherlv_2= To ( (lv_target_3_0= ruleClass ) ) otherlv_4= Called ( (lv_relation_5_0= RULE_ID ) ) ) )
            // InternalFeatureLangParser.g:676:2: (otherlv_0= Have otherlv_1= Associations otherlv_2= To ( (lv_target_3_0= ruleClass ) ) otherlv_4= Called ( (lv_relation_5_0= RULE_ID ) ) )
            {
            // InternalFeatureLangParser.g:676:2: (otherlv_0= Have otherlv_1= Associations otherlv_2= To ( (lv_target_3_0= ruleClass ) ) otherlv_4= Called ( (lv_relation_5_0= RULE_ID ) ) )
            // InternalFeatureLangParser.g:677:3: otherlv_0= Have otherlv_1= Associations otherlv_2= To ( (lv_target_3_0= ruleClass ) ) otherlv_4= Called ( (lv_relation_5_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Have,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getAssociationActionAccess().getHaveKeyword_0());
            		
            otherlv_1=(Token)match(input,Associations,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationActionAccess().getAssociationsKeyword_1());
            		
            otherlv_2=(Token)match(input,To,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getAssociationActionAccess().getToKeyword_2());
            		
            // InternalFeatureLangParser.g:689:3: ( (lv_target_3_0= ruleClass ) )
            // InternalFeatureLangParser.g:690:4: (lv_target_3_0= ruleClass )
            {
            // InternalFeatureLangParser.g:690:4: (lv_target_3_0= ruleClass )
            // InternalFeatureLangParser.g:691:5: lv_target_3_0= ruleClass
            {

            					newCompositeNode(grammarAccess.getAssociationActionAccess().getTargetClassParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
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

            otherlv_4=(Token)match(input,Called,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getAssociationActionAccess().getCalledKeyword_4());
            		
            // InternalFeatureLangParser.g:712:3: ( (lv_relation_5_0= RULE_ID ) )
            // InternalFeatureLangParser.g:713:4: (lv_relation_5_0= RULE_ID )
            {
            // InternalFeatureLangParser.g:713:4: (lv_relation_5_0= RULE_ID )
            // InternalFeatureLangParser.g:714:5: lv_relation_5_0= RULE_ID
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
    // InternalFeatureLangParser.g:737:1: entryRuleInheritanceAction returns [EObject current=null] : iv_ruleInheritanceAction= ruleInheritanceAction EOF ;
    public final EObject entryRuleInheritanceAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInheritanceAction = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:739:2: (iv_ruleInheritanceAction= ruleInheritanceAction EOF )
            // InternalFeatureLangParser.g:740:2: iv_ruleInheritanceAction= ruleInheritanceAction EOF
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
    // InternalFeatureLangParser.g:749:1: ruleInheritanceAction returns [EObject current=null] : (otherlv_0= Inherit otherlv_1= From ( (lv_parent_2_0= ruleClass ) ) ) ;
    public final EObject ruleInheritanceAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_parent_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:756:2: ( (otherlv_0= Inherit otherlv_1= From ( (lv_parent_2_0= ruleClass ) ) ) )
            // InternalFeatureLangParser.g:757:2: (otherlv_0= Inherit otherlv_1= From ( (lv_parent_2_0= ruleClass ) ) )
            {
            // InternalFeatureLangParser.g:757:2: (otherlv_0= Inherit otherlv_1= From ( (lv_parent_2_0= ruleClass ) ) )
            // InternalFeatureLangParser.g:758:3: otherlv_0= Inherit otherlv_1= From ( (lv_parent_2_0= ruleClass ) )
            {
            otherlv_0=(Token)match(input,Inherit,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getInheritanceActionAccess().getInheritKeyword_0());
            		
            otherlv_1=(Token)match(input,From,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getInheritanceActionAccess().getFromKeyword_1());
            		
            // InternalFeatureLangParser.g:766:3: ( (lv_parent_2_0= ruleClass ) )
            // InternalFeatureLangParser.g:767:4: (lv_parent_2_0= ruleClass )
            {
            // InternalFeatureLangParser.g:767:4: (lv_parent_2_0= ruleClass )
            // InternalFeatureLangParser.g:768:5: lv_parent_2_0= ruleClass
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
    // InternalFeatureLangParser.g:792:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:794:2: (iv_ruleClass= ruleClass EOF )
            // InternalFeatureLangParser.g:795:2: iv_ruleClass= ruleClass EOF
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
    // InternalFeatureLangParser.g:804:1: ruleClass returns [EObject current=null] : ( (otherlv_0= The | otherlv_1= A )? (otherlv_2= Class )? ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:811:2: ( ( (otherlv_0= The | otherlv_1= A )? (otherlv_2= Class )? ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalFeatureLangParser.g:812:2: ( (otherlv_0= The | otherlv_1= A )? (otherlv_2= Class )? ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalFeatureLangParser.g:812:2: ( (otherlv_0= The | otherlv_1= A )? (otherlv_2= Class )? ( (lv_name_3_0= RULE_ID ) ) )
            // InternalFeatureLangParser.g:813:3: (otherlv_0= The | otherlv_1= A )? (otherlv_2= Class )? ( (lv_name_3_0= RULE_ID ) )
            {
            // InternalFeatureLangParser.g:813:3: (otherlv_0= The | otherlv_1= A )?
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==The) ) {
                alt13=1;
            }
            else if ( (LA13_0==A) ) {
                alt13=2;
            }
            switch (alt13) {
                case 1 :
                    // InternalFeatureLangParser.g:814:4: otherlv_0= The
                    {
                    otherlv_0=(Token)match(input,The,FOLLOW_26); 

                    				newLeafNode(otherlv_0, grammarAccess.getClassAccess().getTheKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:819:4: otherlv_1= A
                    {
                    otherlv_1=(Token)match(input,A,FOLLOW_26); 

                    				newLeafNode(otherlv_1, grammarAccess.getClassAccess().getAKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalFeatureLangParser.g:824:3: (otherlv_2= Class )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Class) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalFeatureLangParser.g:825:4: otherlv_2= Class
                    {
                    otherlv_2=(Token)match(input,Class,FOLLOW_24); 

                    				newLeafNode(otherlv_2, grammarAccess.getClassAccess().getClassKeyword_1());
                    			

                    }
                    break;

            }

            // InternalFeatureLangParser.g:830:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalFeatureLangParser.g:831:4: (lv_name_3_0= RULE_ID )
            {
            // InternalFeatureLangParser.g:831:4: (lv_name_3_0= RULE_ID )
            // InternalFeatureLangParser.g:832:5: lv_name_3_0= RULE_ID
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
    // InternalFeatureLangParser.g:855:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:857:2: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalFeatureLangParser.g:858:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalFeatureLangParser.g:867:1: ruleAttribute returns [EObject current=null] : ( (otherlv_0= Attribute )? ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:874:2: ( ( (otherlv_0= Attribute )? ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalFeatureLangParser.g:875:2: ( (otherlv_0= Attribute )? ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalFeatureLangParser.g:875:2: ( (otherlv_0= Attribute )? ( (lv_name_1_0= RULE_ID ) ) )
            // InternalFeatureLangParser.g:876:3: (otherlv_0= Attribute )? ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalFeatureLangParser.g:876:3: (otherlv_0= Attribute )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Attribute) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalFeatureLangParser.g:877:4: otherlv_0= Attribute
                    {
                    otherlv_0=(Token)match(input,Attribute,FOLLOW_24); 

                    				newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
                    			

                    }
                    break;

            }

            // InternalFeatureLangParser.g:882:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFeatureLangParser.g:883:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFeatureLangParser.g:883:4: (lv_name_1_0= RULE_ID )
            // InternalFeatureLangParser.g:884:5: lv_name_1_0= RULE_ID
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
    // InternalFeatureLangParser.g:907:1: entryRulePriority returns [EObject current=null] : iv_rulePriority= rulePriority EOF ;
    public final EObject entryRulePriority() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePriority = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:909:2: (iv_rulePriority= rulePriority EOF )
            // InternalFeatureLangParser.g:910:2: iv_rulePriority= rulePriority EOF
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
    // InternalFeatureLangParser.g:919:1: rulePriority returns [EObject current=null] : ( (lv_priority_0_0= rulePriorityValue ) ) ;
    public final EObject rulePriority() throws RecognitionException {
        EObject current = null;

        Enumerator lv_priority_0_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:926:2: ( ( (lv_priority_0_0= rulePriorityValue ) ) )
            // InternalFeatureLangParser.g:927:2: ( (lv_priority_0_0= rulePriorityValue ) )
            {
            // InternalFeatureLangParser.g:927:2: ( (lv_priority_0_0= rulePriorityValue ) )
            // InternalFeatureLangParser.g:928:3: (lv_priority_0_0= rulePriorityValue )
            {
            // InternalFeatureLangParser.g:928:3: (lv_priority_0_0= rulePriorityValue )
            // InternalFeatureLangParser.g:929:4: lv_priority_0_0= rulePriorityValue
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
    // InternalFeatureLangParser.g:952:1: rulePriorityValue returns [Enumerator current=null] : ( (enumLiteral_0= Should ) | (enumLiteral_1= Must ) ) ;
    public final Enumerator rulePriorityValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFeatureLangParser.g:958:2: ( ( (enumLiteral_0= Should ) | (enumLiteral_1= Must ) ) )
            // InternalFeatureLangParser.g:959:2: ( (enumLiteral_0= Should ) | (enumLiteral_1= Must ) )
            {
            // InternalFeatureLangParser.g:959:2: ( (enumLiteral_0= Should ) | (enumLiteral_1= Must ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Should) ) {
                alt16=1;
            }
            else if ( (LA16_0==Must) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalFeatureLangParser.g:960:3: (enumLiteral_0= Should )
                    {
                    // InternalFeatureLangParser.g:960:3: (enumLiteral_0= Should )
                    // InternalFeatureLangParser.g:961:4: enumLiteral_0= Should
                    {
                    enumLiteral_0=(Token)match(input,Should,FOLLOW_2); 

                    				current = grammarAccess.getPriorityValueAccess().getSHOULDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPriorityValueAccess().getSHOULDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:968:3: (enumLiteral_1= Must )
                    {
                    // InternalFeatureLangParser.g:968:3: (enumLiteral_1= Must )
                    // InternalFeatureLangParser.g:969:4: enumLiteral_1= Must
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
    // InternalFeatureLangParser.g:979:1: ruleDatatype returns [Enumerator current=null] : ( (enumLiteral_0= Time ) | (enumLiteral_1= Phrase ) | (enumLiteral_2= Number ) ) ;
    public final Enumerator ruleDatatype() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalFeatureLangParser.g:985:2: ( ( (enumLiteral_0= Time ) | (enumLiteral_1= Phrase ) | (enumLiteral_2= Number ) ) )
            // InternalFeatureLangParser.g:986:2: ( (enumLiteral_0= Time ) | (enumLiteral_1= Phrase ) | (enumLiteral_2= Number ) )
            {
            // InternalFeatureLangParser.g:986:2: ( (enumLiteral_0= Time ) | (enumLiteral_1= Phrase ) | (enumLiteral_2= Number ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case Time:
                {
                alt17=1;
                }
                break;
            case Phrase:
                {
                alt17=2;
                }
                break;
            case Number:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalFeatureLangParser.g:987:3: (enumLiteral_0= Time )
                    {
                    // InternalFeatureLangParser.g:987:3: (enumLiteral_0= Time )
                    // InternalFeatureLangParser.g:988:4: enumLiteral_0= Time
                    {
                    enumLiteral_0=(Token)match(input,Time,FOLLOW_2); 

                    				current = grammarAccess.getDatatypeAccess().getWORDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDatatypeAccess().getWORDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:995:3: (enumLiteral_1= Phrase )
                    {
                    // InternalFeatureLangParser.g:995:3: (enumLiteral_1= Phrase )
                    // InternalFeatureLangParser.g:996:4: enumLiteral_1= Phrase
                    {
                    enumLiteral_1=(Token)match(input,Phrase,FOLLOW_2); 

                    				current = grammarAccess.getDatatypeAccess().getPHRASEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDatatypeAccess().getPHRASEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureLangParser.g:1003:3: (enumLiteral_2= Number )
                    {
                    // InternalFeatureLangParser.g:1003:3: (enumLiteral_2= Number )
                    // InternalFeatureLangParser.g:1004:4: enumLiteral_2= Number
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000032205002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000A0800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000110080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000902000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000030201000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000060L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040600L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020001000L});

}