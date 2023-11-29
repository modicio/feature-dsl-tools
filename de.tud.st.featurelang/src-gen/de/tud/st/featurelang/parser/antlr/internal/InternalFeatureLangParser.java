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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Associations", "Attribute", "Abstract", "Composes", "Existing", "Compose", "Inherit", "Called", "Number", "Phrase", "Should", "Class", "Exist", "Other", "Value", "From", "Have", "Must", "Name", "Time", "URI", "Has", "Not", "The", "An", "Be", "Is", "It", "To", "FullStop", "A", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int A=34;
    public static final int Called=11;
    public static final int Should=14;
    public static final int Attribute=5;
    public static final int Time=23;
    public static final int Is=30;
    public static final int RULE_STRING=37;
    public static final int It=31;
    public static final int Must=21;
    public static final int URI=24;
    public static final int An=28;
    public static final int Name=22;
    public static final int RULE_SL_COMMENT=39;
    public static final int The=27;
    public static final int Compose=9;
    public static final int Exist=16;
    public static final int Number=12;
    public static final int To=32;
    public static final int EOF=-1;
    public static final int Inherit=10;
    public static final int Composes=7;
    public static final int FullStop=33;
    public static final int Be=29;
    public static final int RULE_ID=35;
    public static final int RULE_WS=40;
    public static final int Abstract=6;
    public static final int Have=20;
    public static final int Phrase=13;
    public static final int From=19;
    public static final int RULE_ANY_OTHER=41;
    public static final int Associations=4;
    public static final int Not=26;
    public static final int RULE_INT=36;
    public static final int Value=18;
    public static final int RULE_ML_COMMENT=38;
    public static final int Class=15;
    public static final int Has=25;
    public static final int Existing=8;
    public static final int Other=17;

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

                if ( (LA1_0==Abstract||LA1_0==Class||LA1_0==The||(LA1_0>=A && LA1_0<=RULE_ID)) ) {
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
    // InternalFeatureLangParser.g:150:1: ruleChangeStatement returns [EObject current=null] : ( ( (lv_target_0_0= ruleClass ) ) ( ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? ( ( (lv_action_3_0= ruleAction ) ) | (otherlv_4= Have (otherlv_5= A | otherlv_6= An )? ( (lv_identifier_7_0= ruleIdentifier ) ) ) ) ) | ( (lv_update_8_0= ruleUpdateAction ) ) ) ) ;
    public final EObject ruleChangeStatement() throws RecognitionException {
        EObject current = null;

        Token lv_negation_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_target_0_0 = null;

        EObject lv_priority_1_0 = null;

        EObject lv_action_3_0 = null;

        EObject lv_identifier_7_0 = null;

        EObject lv_update_8_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:157:2: ( ( ( (lv_target_0_0= ruleClass ) ) ( ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? ( ( (lv_action_3_0= ruleAction ) ) | (otherlv_4= Have (otherlv_5= A | otherlv_6= An )? ( (lv_identifier_7_0= ruleIdentifier ) ) ) ) ) | ( (lv_update_8_0= ruleUpdateAction ) ) ) ) )
            // InternalFeatureLangParser.g:158:2: ( ( (lv_target_0_0= ruleClass ) ) ( ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? ( ( (lv_action_3_0= ruleAction ) ) | (otherlv_4= Have (otherlv_5= A | otherlv_6= An )? ( (lv_identifier_7_0= ruleIdentifier ) ) ) ) ) | ( (lv_update_8_0= ruleUpdateAction ) ) ) )
            {
            // InternalFeatureLangParser.g:158:2: ( ( (lv_target_0_0= ruleClass ) ) ( ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? ( ( (lv_action_3_0= ruleAction ) ) | (otherlv_4= Have (otherlv_5= A | otherlv_6= An )? ( (lv_identifier_7_0= ruleIdentifier ) ) ) ) ) | ( (lv_update_8_0= ruleUpdateAction ) ) ) )
            // InternalFeatureLangParser.g:159:3: ( (lv_target_0_0= ruleClass ) ) ( ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? ( ( (lv_action_3_0= ruleAction ) ) | (otherlv_4= Have (otherlv_5= A | otherlv_6= An )? ( (lv_identifier_7_0= ruleIdentifier ) ) ) ) ) | ( (lv_update_8_0= ruleUpdateAction ) ) )
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

            // InternalFeatureLangParser.g:178:3: ( ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? ( ( (lv_action_3_0= ruleAction ) ) | (otherlv_4= Have (otherlv_5= A | otherlv_6= An )? ( (lv_identifier_7_0= ruleIdentifier ) ) ) ) ) | ( (lv_update_8_0= ruleUpdateAction ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Should||LA7_0==Must) ) {
                alt7=1;
            }
            else if ( (LA7_0==Has) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalFeatureLangParser.g:179:4: ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? ( ( (lv_action_3_0= ruleAction ) ) | (otherlv_4= Have (otherlv_5= A | otherlv_6= An )? ( (lv_identifier_7_0= ruleIdentifier ) ) ) ) )
                    {
                    // InternalFeatureLangParser.g:179:4: ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? ( ( (lv_action_3_0= ruleAction ) ) | (otherlv_4= Have (otherlv_5= A | otherlv_6= An )? ( (lv_identifier_7_0= ruleIdentifier ) ) ) ) )
                    // InternalFeatureLangParser.g:180:5: ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? ( ( (lv_action_3_0= ruleAction ) ) | (otherlv_4= Have (otherlv_5= A | otherlv_6= An )? ( (lv_identifier_7_0= ruleIdentifier ) ) ) )
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
                            lv_negation_2_0=(Token)match(input,Not,FOLLOW_7); 

                            							newLeafNode(lv_negation_2_0, grammarAccess.getChangeStatementAccess().getNegationNotKeyword_1_0_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getChangeStatementRule());
                            							}
                            							setWithLastConsumed(current, "negation", lv_negation_2_0 != null, "not");
                            						

                            }


                            }
                            break;

                    }

                    // InternalFeatureLangParser.g:213:5: ( ( (lv_action_3_0= ruleAction ) ) | (otherlv_4= Have (otherlv_5= A | otherlv_6= An )? ( (lv_identifier_7_0= ruleIdentifier ) ) ) )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==Have) ) {
                        switch ( input.LA(2) ) {
                        case A:
                            {
                            int LA6_3 = input.LA(3);

                            if ( (LA6_3==Name||LA6_3==URI) ) {
                                alt6=2;
                            }
                            else if ( (LA6_3==Attribute||LA6_3==RULE_ID) ) {
                                alt6=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 6, 3, input);

                                throw nvae;
                            }
                            }
                            break;
                        case An:
                            {
                            int LA6_4 = input.LA(3);

                            if ( (LA6_4==Attribute||LA6_4==RULE_ID) ) {
                                alt6=1;
                            }
                            else if ( (LA6_4==Name||LA6_4==URI) ) {
                                alt6=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 6, 4, input);

                                throw nvae;
                            }
                            }
                            break;
                        case Name:
                        case URI:
                            {
                            alt6=2;
                            }
                            break;
                        case Associations:
                        case The:
                            {
                            alt6=1;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 1, input);

                            throw nvae;
                        }

                    }
                    else if ( (LA6_0==Composes||(LA6_0>=Compose && LA6_0<=Inherit)) ) {
                        alt6=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalFeatureLangParser.g:214:6: ( (lv_action_3_0= ruleAction ) )
                            {
                            // InternalFeatureLangParser.g:214:6: ( (lv_action_3_0= ruleAction ) )
                            // InternalFeatureLangParser.g:215:7: (lv_action_3_0= ruleAction )
                            {
                            // InternalFeatureLangParser.g:215:7: (lv_action_3_0= ruleAction )
                            // InternalFeatureLangParser.g:216:8: lv_action_3_0= ruleAction
                            {

                            								newCompositeNode(grammarAccess.getChangeStatementAccess().getActionActionParserRuleCall_1_0_2_0_0());
                            							
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
                            break;
                        case 2 :
                            // InternalFeatureLangParser.g:234:6: (otherlv_4= Have (otherlv_5= A | otherlv_6= An )? ( (lv_identifier_7_0= ruleIdentifier ) ) )
                            {
                            // InternalFeatureLangParser.g:234:6: (otherlv_4= Have (otherlv_5= A | otherlv_6= An )? ( (lv_identifier_7_0= ruleIdentifier ) ) )
                            // InternalFeatureLangParser.g:235:7: otherlv_4= Have (otherlv_5= A | otherlv_6= An )? ( (lv_identifier_7_0= ruleIdentifier ) )
                            {
                            otherlv_4=(Token)match(input,Have,FOLLOW_8); 

                            							newLeafNode(otherlv_4, grammarAccess.getChangeStatementAccess().getHaveKeyword_1_0_2_1_0());
                            						
                            // InternalFeatureLangParser.g:239:7: (otherlv_5= A | otherlv_6= An )?
                            int alt5=3;
                            int LA5_0 = input.LA(1);

                            if ( (LA5_0==A) ) {
                                alt5=1;
                            }
                            else if ( (LA5_0==An) ) {
                                alt5=2;
                            }
                            switch (alt5) {
                                case 1 :
                                    // InternalFeatureLangParser.g:240:8: otherlv_5= A
                                    {
                                    otherlv_5=(Token)match(input,A,FOLLOW_8); 

                                    								newLeafNode(otherlv_5, grammarAccess.getChangeStatementAccess().getAKeyword_1_0_2_1_1_0());
                                    							

                                    }
                                    break;
                                case 2 :
                                    // InternalFeatureLangParser.g:245:8: otherlv_6= An
                                    {
                                    otherlv_6=(Token)match(input,An,FOLLOW_8); 

                                    								newLeafNode(otherlv_6, grammarAccess.getChangeStatementAccess().getAnKeyword_1_0_2_1_1_1());
                                    							

                                    }
                                    break;

                            }

                            // InternalFeatureLangParser.g:250:7: ( (lv_identifier_7_0= ruleIdentifier ) )
                            // InternalFeatureLangParser.g:251:8: (lv_identifier_7_0= ruleIdentifier )
                            {
                            // InternalFeatureLangParser.g:251:8: (lv_identifier_7_0= ruleIdentifier )
                            // InternalFeatureLangParser.g:252:9: lv_identifier_7_0= ruleIdentifier
                            {

                            									newCompositeNode(grammarAccess.getChangeStatementAccess().getIdentifierIdentifierParserRuleCall_1_0_2_1_2_0());
                            								
                            pushFollow(FOLLOW_2);
                            lv_identifier_7_0=ruleIdentifier();

                            state._fsp--;


                            									if (current==null) {
                            										current = createModelElementForParent(grammarAccess.getChangeStatementRule());
                            									}
                            									set(
                            										current,
                            										"identifier",
                            										lv_identifier_7_0,
                            										"de.tud.st.featurelang.FeatureLang.Identifier");
                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:273:4: ( (lv_update_8_0= ruleUpdateAction ) )
                    {
                    // InternalFeatureLangParser.g:273:4: ( (lv_update_8_0= ruleUpdateAction ) )
                    // InternalFeatureLangParser.g:274:5: (lv_update_8_0= ruleUpdateAction )
                    {
                    // InternalFeatureLangParser.g:274:5: (lv_update_8_0= ruleUpdateAction )
                    // InternalFeatureLangParser.g:275:6: lv_update_8_0= ruleUpdateAction
                    {

                    						newCompositeNode(grammarAccess.getChangeStatementAccess().getUpdateUpdateActionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_update_8_0=ruleUpdateAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getChangeStatementRule());
                    						}
                    						set(
                    							current,
                    							"update",
                    							lv_update_8_0,
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
    // InternalFeatureLangParser.g:300:1: entryRuleCreationStatement returns [EObject current=null] : iv_ruleCreationStatement= ruleCreationStatement EOF ;
    public final EObject entryRuleCreationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreationStatement = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:302:2: (iv_ruleCreationStatement= ruleCreationStatement EOF )
            // InternalFeatureLangParser.g:303:2: iv_ruleCreationStatement= ruleCreationStatement EOF
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
    // InternalFeatureLangParser.g:312:1: ruleCreationStatement returns [EObject current=null] : ( ( (lv_classElement_0_0= ruleClass ) ) ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? (otherlv_3= Exist | otherlv_4= Be ) ) ;
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
            // InternalFeatureLangParser.g:319:2: ( ( ( (lv_classElement_0_0= ruleClass ) ) ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? (otherlv_3= Exist | otherlv_4= Be ) ) )
            // InternalFeatureLangParser.g:320:2: ( ( (lv_classElement_0_0= ruleClass ) ) ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? (otherlv_3= Exist | otherlv_4= Be ) )
            {
            // InternalFeatureLangParser.g:320:2: ( ( (lv_classElement_0_0= ruleClass ) ) ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? (otherlv_3= Exist | otherlv_4= Be ) )
            // InternalFeatureLangParser.g:321:3: ( (lv_classElement_0_0= ruleClass ) ) ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? (otherlv_3= Exist | otherlv_4= Be )
            {
            // InternalFeatureLangParser.g:321:3: ( (lv_classElement_0_0= ruleClass ) )
            // InternalFeatureLangParser.g:322:4: (lv_classElement_0_0= ruleClass )
            {
            // InternalFeatureLangParser.g:322:4: (lv_classElement_0_0= ruleClass )
            // InternalFeatureLangParser.g:323:5: lv_classElement_0_0= ruleClass
            {

            					newCompositeNode(grammarAccess.getCreationStatementAccess().getClassElementClassParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
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

            // InternalFeatureLangParser.g:340:3: ( (lv_priority_1_0= rulePriority ) )
            // InternalFeatureLangParser.g:341:4: (lv_priority_1_0= rulePriority )
            {
            // InternalFeatureLangParser.g:341:4: (lv_priority_1_0= rulePriority )
            // InternalFeatureLangParser.g:342:5: lv_priority_1_0= rulePriority
            {

            					newCompositeNode(grammarAccess.getCreationStatementAccess().getPriorityPriorityParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
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

            // InternalFeatureLangParser.g:359:3: ( (lv_negation_2_0= Not ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Not) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalFeatureLangParser.g:360:4: (lv_negation_2_0= Not )
                    {
                    // InternalFeatureLangParser.g:360:4: (lv_negation_2_0= Not )
                    // InternalFeatureLangParser.g:361:5: lv_negation_2_0= Not
                    {
                    lv_negation_2_0=(Token)match(input,Not,FOLLOW_11); 

                    					newLeafNode(lv_negation_2_0, grammarAccess.getCreationStatementAccess().getNegationNotKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCreationStatementRule());
                    					}
                    					setWithLastConsumed(current, "negation", lv_negation_2_0 != null, "not");
                    				

                    }


                    }
                    break;

            }

            // InternalFeatureLangParser.g:373:3: (otherlv_3= Exist | otherlv_4= Be )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Exist) ) {
                alt9=1;
            }
            else if ( (LA9_0==Be) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalFeatureLangParser.g:374:4: otherlv_3= Exist
                    {
                    otherlv_3=(Token)match(input,Exist,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getCreationStatementAccess().getExistKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:379:4: otherlv_4= Be
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
    // InternalFeatureLangParser.g:391:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:393:2: (iv_ruleAction= ruleAction EOF )
            // InternalFeatureLangParser.g:394:2: iv_ruleAction= ruleAction EOF
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
    // InternalFeatureLangParser.g:403:1: ruleAction returns [EObject current=null] : ( ( (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction | lv_type_0_4= ruleCompositionAction ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_1 = null;

        EObject lv_type_0_2 = null;

        EObject lv_type_0_3 = null;

        EObject lv_type_0_4 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:410:2: ( ( ( (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction | lv_type_0_4= ruleCompositionAction ) ) ) )
            // InternalFeatureLangParser.g:411:2: ( ( (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction | lv_type_0_4= ruleCompositionAction ) ) )
            {
            // InternalFeatureLangParser.g:411:2: ( ( (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction | lv_type_0_4= ruleCompositionAction ) ) )
            // InternalFeatureLangParser.g:412:3: ( (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction | lv_type_0_4= ruleCompositionAction ) )
            {
            // InternalFeatureLangParser.g:412:3: ( (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction | lv_type_0_4= ruleCompositionAction ) )
            // InternalFeatureLangParser.g:413:4: (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction | lv_type_0_4= ruleCompositionAction )
            {
            // InternalFeatureLangParser.g:413:4: (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction | lv_type_0_4= ruleCompositionAction )
            int alt10=4;
            switch ( input.LA(1) ) {
            case Have:
                {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==Associations) ) {
                    alt10=2;
                }
                else if ( ((LA10_1>=The && LA10_1<=An)||LA10_1==A) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
                }
                break;
            case Inherit:
                {
                alt10=3;
                }
                break;
            case Composes:
            case Compose:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalFeatureLangParser.g:414:5: lv_type_0_1= ruleAttributeAction
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
                    // InternalFeatureLangParser.g:430:5: lv_type_0_2= ruleAssociationAction
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
                    // InternalFeatureLangParser.g:446:5: lv_type_0_3= ruleInheritanceAction
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
                case 4 :
                    // InternalFeatureLangParser.g:462:5: lv_type_0_4= ruleCompositionAction
                    {

                    					newCompositeNode(grammarAccess.getActionAccess().getTypeCompositionActionParserRuleCall_0_3());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_4=ruleCompositionAction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActionRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_4,
                    						"de.tud.st.featurelang.FeatureLang.CompositionAction");
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
    // InternalFeatureLangParser.g:486:1: entryRuleUpdateAction returns [EObject current=null] : iv_ruleUpdateAction= ruleUpdateAction EOF ;
    public final EObject entryRuleUpdateAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateAction = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:488:2: (iv_ruleUpdateAction= ruleUpdateAction EOF )
            // InternalFeatureLangParser.g:489:2: iv_ruleUpdateAction= ruleUpdateAction EOF
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
    // InternalFeatureLangParser.g:498:1: ruleUpdateAction returns [EObject current=null] : (otherlv_0= Has (otherlv_1= An | otherlv_2= A ) (otherlv_3= Existing )? ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= FullStop otherlv_6= It ( (lv_priority_7_0= rulePriority ) ) ( ( (lv_datatype_8_0= ruleUpdateAttributeDatatype ) ) | ( (lv_identifier_9_0= ruleUpdateAttributeIdentifier ) ) | ( (lv_value_10_0= ruleUpdateAttributeValue ) ) ) ) ;
    public final EObject ruleUpdateAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_attribute_4_0 = null;

        EObject lv_priority_7_0 = null;

        EObject lv_datatype_8_0 = null;

        EObject lv_identifier_9_0 = null;

        EObject lv_value_10_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:505:2: ( (otherlv_0= Has (otherlv_1= An | otherlv_2= A ) (otherlv_3= Existing )? ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= FullStop otherlv_6= It ( (lv_priority_7_0= rulePriority ) ) ( ( (lv_datatype_8_0= ruleUpdateAttributeDatatype ) ) | ( (lv_identifier_9_0= ruleUpdateAttributeIdentifier ) ) | ( (lv_value_10_0= ruleUpdateAttributeValue ) ) ) ) )
            // InternalFeatureLangParser.g:506:2: (otherlv_0= Has (otherlv_1= An | otherlv_2= A ) (otherlv_3= Existing )? ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= FullStop otherlv_6= It ( (lv_priority_7_0= rulePriority ) ) ( ( (lv_datatype_8_0= ruleUpdateAttributeDatatype ) ) | ( (lv_identifier_9_0= ruleUpdateAttributeIdentifier ) ) | ( (lv_value_10_0= ruleUpdateAttributeValue ) ) ) )
            {
            // InternalFeatureLangParser.g:506:2: (otherlv_0= Has (otherlv_1= An | otherlv_2= A ) (otherlv_3= Existing )? ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= FullStop otherlv_6= It ( (lv_priority_7_0= rulePriority ) ) ( ( (lv_datatype_8_0= ruleUpdateAttributeDatatype ) ) | ( (lv_identifier_9_0= ruleUpdateAttributeIdentifier ) ) | ( (lv_value_10_0= ruleUpdateAttributeValue ) ) ) )
            // InternalFeatureLangParser.g:507:3: otherlv_0= Has (otherlv_1= An | otherlv_2= A ) (otherlv_3= Existing )? ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= FullStop otherlv_6= It ( (lv_priority_7_0= rulePriority ) ) ( ( (lv_datatype_8_0= ruleUpdateAttributeDatatype ) ) | ( (lv_identifier_9_0= ruleUpdateAttributeIdentifier ) ) | ( (lv_value_10_0= ruleUpdateAttributeValue ) ) )
            {
            otherlv_0=(Token)match(input,Has,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getUpdateActionAccess().getHasKeyword_0());
            		
            // InternalFeatureLangParser.g:511:3: (otherlv_1= An | otherlv_2= A )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==An) ) {
                alt11=1;
            }
            else if ( (LA11_0==A) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalFeatureLangParser.g:512:4: otherlv_1= An
                    {
                    otherlv_1=(Token)match(input,An,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getUpdateActionAccess().getAnKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:517:4: otherlv_2= A
                    {
                    otherlv_2=(Token)match(input,A,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getUpdateActionAccess().getAKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalFeatureLangParser.g:522:3: (otherlv_3= Existing )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Existing) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalFeatureLangParser.g:523:4: otherlv_3= Existing
                    {
                    otherlv_3=(Token)match(input,Existing,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getUpdateActionAccess().getExistingKeyword_2());
                    			

                    }
                    break;

            }

            // InternalFeatureLangParser.g:528:3: ( (lv_attribute_4_0= ruleAttribute ) )
            // InternalFeatureLangParser.g:529:4: (lv_attribute_4_0= ruleAttribute )
            {
            // InternalFeatureLangParser.g:529:4: (lv_attribute_4_0= ruleAttribute )
            // InternalFeatureLangParser.g:530:5: lv_attribute_4_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getUpdateActionAccess().getAttributeAttributeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_5=(Token)match(input,FullStop,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getUpdateActionAccess().getFullStopKeyword_4());
            		
            otherlv_6=(Token)match(input,It,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getUpdateActionAccess().getItKeyword_5());
            		
            // InternalFeatureLangParser.g:555:3: ( (lv_priority_7_0= rulePriority ) )
            // InternalFeatureLangParser.g:556:4: (lv_priority_7_0= rulePriority )
            {
            // InternalFeatureLangParser.g:556:4: (lv_priority_7_0= rulePriority )
            // InternalFeatureLangParser.g:557:5: lv_priority_7_0= rulePriority
            {

            					newCompositeNode(grammarAccess.getUpdateActionAccess().getPriorityPriorityParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_16);
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

            // InternalFeatureLangParser.g:574:3: ( ( (lv_datatype_8_0= ruleUpdateAttributeDatatype ) ) | ( (lv_identifier_9_0= ruleUpdateAttributeIdentifier ) ) | ( (lv_value_10_0= ruleUpdateAttributeValue ) ) )
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Be) ) {
                alt13=1;
            }
            else if ( (LA13_0==Have) ) {
                switch ( input.LA(2) ) {
                case A:
                    {
                    int LA13_3 = input.LA(3);

                    if ( (LA13_3==Value) ) {
                        alt13=3;
                    }
                    else if ( (LA13_3==Name||LA13_3==URI) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case Value:
                    {
                    alt13=3;
                    }
                    break;
                case Name:
                case URI:
                case An:
                    {
                    alt13=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalFeatureLangParser.g:575:4: ( (lv_datatype_8_0= ruleUpdateAttributeDatatype ) )
                    {
                    // InternalFeatureLangParser.g:575:4: ( (lv_datatype_8_0= ruleUpdateAttributeDatatype ) )
                    // InternalFeatureLangParser.g:576:5: (lv_datatype_8_0= ruleUpdateAttributeDatatype )
                    {
                    // InternalFeatureLangParser.g:576:5: (lv_datatype_8_0= ruleUpdateAttributeDatatype )
                    // InternalFeatureLangParser.g:577:6: lv_datatype_8_0= ruleUpdateAttributeDatatype
                    {

                    						newCompositeNode(grammarAccess.getUpdateActionAccess().getDatatypeUpdateAttributeDatatypeParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_datatype_8_0=ruleUpdateAttributeDatatype();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUpdateActionRule());
                    						}
                    						set(
                    							current,
                    							"datatype",
                    							lv_datatype_8_0,
                    							"de.tud.st.featurelang.FeatureLang.UpdateAttributeDatatype");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:595:4: ( (lv_identifier_9_0= ruleUpdateAttributeIdentifier ) )
                    {
                    // InternalFeatureLangParser.g:595:4: ( (lv_identifier_9_0= ruleUpdateAttributeIdentifier ) )
                    // InternalFeatureLangParser.g:596:5: (lv_identifier_9_0= ruleUpdateAttributeIdentifier )
                    {
                    // InternalFeatureLangParser.g:596:5: (lv_identifier_9_0= ruleUpdateAttributeIdentifier )
                    // InternalFeatureLangParser.g:597:6: lv_identifier_9_0= ruleUpdateAttributeIdentifier
                    {

                    						newCompositeNode(grammarAccess.getUpdateActionAccess().getIdentifierUpdateAttributeIdentifierParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_identifier_9_0=ruleUpdateAttributeIdentifier();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUpdateActionRule());
                    						}
                    						set(
                    							current,
                    							"identifier",
                    							lv_identifier_9_0,
                    							"de.tud.st.featurelang.FeatureLang.UpdateAttributeIdentifier");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureLangParser.g:615:4: ( (lv_value_10_0= ruleUpdateAttributeValue ) )
                    {
                    // InternalFeatureLangParser.g:615:4: ( (lv_value_10_0= ruleUpdateAttributeValue ) )
                    // InternalFeatureLangParser.g:616:5: (lv_value_10_0= ruleUpdateAttributeValue )
                    {
                    // InternalFeatureLangParser.g:616:5: (lv_value_10_0= ruleUpdateAttributeValue )
                    // InternalFeatureLangParser.g:617:6: lv_value_10_0= ruleUpdateAttributeValue
                    {

                    						newCompositeNode(grammarAccess.getUpdateActionAccess().getValueUpdateAttributeValueParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_10_0=ruleUpdateAttributeValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUpdateActionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_10_0,
                    							"de.tud.st.featurelang.FeatureLang.UpdateAttributeValue");
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
    // $ANTLR end "ruleUpdateAction"


    // $ANTLR start "entryRuleUpdateAttributeDatatype"
    // InternalFeatureLangParser.g:642:1: entryRuleUpdateAttributeDatatype returns [EObject current=null] : iv_ruleUpdateAttributeDatatype= ruleUpdateAttributeDatatype EOF ;
    public final EObject entryRuleUpdateAttributeDatatype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateAttributeDatatype = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:644:2: (iv_ruleUpdateAttributeDatatype= ruleUpdateAttributeDatatype EOF )
            // InternalFeatureLangParser.g:645:2: iv_ruleUpdateAttributeDatatype= ruleUpdateAttributeDatatype EOF
            {
             newCompositeNode(grammarAccess.getUpdateAttributeDatatypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpdateAttributeDatatype=ruleUpdateAttributeDatatype();

            state._fsp--;

             current =iv_ruleUpdateAttributeDatatype; 
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
    // $ANTLR end "entryRuleUpdateAttributeDatatype"


    // $ANTLR start "ruleUpdateAttributeDatatype"
    // InternalFeatureLangParser.g:654:1: ruleUpdateAttributeDatatype returns [EObject current=null] : (otherlv_0= Be otherlv_1= A ( (lv_type_2_0= ruleDatatype ) ) ) ;
    public final EObject ruleUpdateAttributeDatatype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_type_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:661:2: ( (otherlv_0= Be otherlv_1= A ( (lv_type_2_0= ruleDatatype ) ) ) )
            // InternalFeatureLangParser.g:662:2: (otherlv_0= Be otherlv_1= A ( (lv_type_2_0= ruleDatatype ) ) )
            {
            // InternalFeatureLangParser.g:662:2: (otherlv_0= Be otherlv_1= A ( (lv_type_2_0= ruleDatatype ) ) )
            // InternalFeatureLangParser.g:663:3: otherlv_0= Be otherlv_1= A ( (lv_type_2_0= ruleDatatype ) )
            {
            otherlv_0=(Token)match(input,Be,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getUpdateAttributeDatatypeAccess().getBeKeyword_0());
            		
            otherlv_1=(Token)match(input,A,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getUpdateAttributeDatatypeAccess().getAKeyword_1());
            		
            // InternalFeatureLangParser.g:671:3: ( (lv_type_2_0= ruleDatatype ) )
            // InternalFeatureLangParser.g:672:4: (lv_type_2_0= ruleDatatype )
            {
            // InternalFeatureLangParser.g:672:4: (lv_type_2_0= ruleDatatype )
            // InternalFeatureLangParser.g:673:5: lv_type_2_0= ruleDatatype
            {

            					newCompositeNode(grammarAccess.getUpdateAttributeDatatypeAccess().getTypeDatatypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleDatatype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateAttributeDatatypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
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
    // $ANTLR end "ruleUpdateAttributeDatatype"


    // $ANTLR start "entryRuleUpdateAttributeIdentifier"
    // InternalFeatureLangParser.g:697:1: entryRuleUpdateAttributeIdentifier returns [EObject current=null] : iv_ruleUpdateAttributeIdentifier= ruleUpdateAttributeIdentifier EOF ;
    public final EObject entryRuleUpdateAttributeIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateAttributeIdentifier = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:699:2: (iv_ruleUpdateAttributeIdentifier= ruleUpdateAttributeIdentifier EOF )
            // InternalFeatureLangParser.g:700:2: iv_ruleUpdateAttributeIdentifier= ruleUpdateAttributeIdentifier EOF
            {
             newCompositeNode(grammarAccess.getUpdateAttributeIdentifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpdateAttributeIdentifier=ruleUpdateAttributeIdentifier();

            state._fsp--;

             current =iv_ruleUpdateAttributeIdentifier; 
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
    // $ANTLR end "entryRuleUpdateAttributeIdentifier"


    // $ANTLR start "ruleUpdateAttributeIdentifier"
    // InternalFeatureLangParser.g:709:1: ruleUpdateAttributeIdentifier returns [EObject current=null] : (otherlv_0= Have (otherlv_1= A | otherlv_2= An )? ( (lv_identifier_3_0= ruleIdentifier ) ) ) ;
    public final EObject ruleUpdateAttributeIdentifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_identifier_3_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:716:2: ( (otherlv_0= Have (otherlv_1= A | otherlv_2= An )? ( (lv_identifier_3_0= ruleIdentifier ) ) ) )
            // InternalFeatureLangParser.g:717:2: (otherlv_0= Have (otherlv_1= A | otherlv_2= An )? ( (lv_identifier_3_0= ruleIdentifier ) ) )
            {
            // InternalFeatureLangParser.g:717:2: (otherlv_0= Have (otherlv_1= A | otherlv_2= An )? ( (lv_identifier_3_0= ruleIdentifier ) ) )
            // InternalFeatureLangParser.g:718:3: otherlv_0= Have (otherlv_1= A | otherlv_2= An )? ( (lv_identifier_3_0= ruleIdentifier ) )
            {
            otherlv_0=(Token)match(input,Have,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getUpdateAttributeIdentifierAccess().getHaveKeyword_0());
            		
            // InternalFeatureLangParser.g:722:3: (otherlv_1= A | otherlv_2= An )?
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==A) ) {
                alt14=1;
            }
            else if ( (LA14_0==An) ) {
                alt14=2;
            }
            switch (alt14) {
                case 1 :
                    // InternalFeatureLangParser.g:723:4: otherlv_1= A
                    {
                    otherlv_1=(Token)match(input,A,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getUpdateAttributeIdentifierAccess().getAKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:728:4: otherlv_2= An
                    {
                    otherlv_2=(Token)match(input,An,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getUpdateAttributeIdentifierAccess().getAnKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalFeatureLangParser.g:733:3: ( (lv_identifier_3_0= ruleIdentifier ) )
            // InternalFeatureLangParser.g:734:4: (lv_identifier_3_0= ruleIdentifier )
            {
            // InternalFeatureLangParser.g:734:4: (lv_identifier_3_0= ruleIdentifier )
            // InternalFeatureLangParser.g:735:5: lv_identifier_3_0= ruleIdentifier
            {

            					newCompositeNode(grammarAccess.getUpdateAttributeIdentifierAccess().getIdentifierIdentifierParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_identifier_3_0=ruleIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateAttributeIdentifierRule());
            					}
            					set(
            						current,
            						"identifier",
            						lv_identifier_3_0,
            						"de.tud.st.featurelang.FeatureLang.Identifier");
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
    // $ANTLR end "ruleUpdateAttributeIdentifier"


    // $ANTLR start "entryRuleUpdateAttributeValue"
    // InternalFeatureLangParser.g:759:1: entryRuleUpdateAttributeValue returns [EObject current=null] : iv_ruleUpdateAttributeValue= ruleUpdateAttributeValue EOF ;
    public final EObject entryRuleUpdateAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateAttributeValue = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:761:2: (iv_ruleUpdateAttributeValue= ruleUpdateAttributeValue EOF )
            // InternalFeatureLangParser.g:762:2: iv_ruleUpdateAttributeValue= ruleUpdateAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getUpdateAttributeValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpdateAttributeValue=ruleUpdateAttributeValue();

            state._fsp--;

             current =iv_ruleUpdateAttributeValue; 
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
    // $ANTLR end "entryRuleUpdateAttributeValue"


    // $ANTLR start "ruleUpdateAttributeValue"
    // InternalFeatureLangParser.g:771:1: ruleUpdateAttributeValue returns [EObject current=null] : (otherlv_0= Have (otherlv_1= A )? otherlv_2= Value ( (lv_value_3_0= RULE_ID ) ) ) ;
    public final EObject ruleUpdateAttributeValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:778:2: ( (otherlv_0= Have (otherlv_1= A )? otherlv_2= Value ( (lv_value_3_0= RULE_ID ) ) ) )
            // InternalFeatureLangParser.g:779:2: (otherlv_0= Have (otherlv_1= A )? otherlv_2= Value ( (lv_value_3_0= RULE_ID ) ) )
            {
            // InternalFeatureLangParser.g:779:2: (otherlv_0= Have (otherlv_1= A )? otherlv_2= Value ( (lv_value_3_0= RULE_ID ) ) )
            // InternalFeatureLangParser.g:780:3: otherlv_0= Have (otherlv_1= A )? otherlv_2= Value ( (lv_value_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Have,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getUpdateAttributeValueAccess().getHaveKeyword_0());
            		
            // InternalFeatureLangParser.g:784:3: (otherlv_1= A )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==A) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalFeatureLangParser.g:785:4: otherlv_1= A
                    {
                    otherlv_1=(Token)match(input,A,FOLLOW_20); 

                    				newLeafNode(otherlv_1, grammarAccess.getUpdateAttributeValueAccess().getAKeyword_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,Value,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getUpdateAttributeValueAccess().getValueKeyword_2());
            		
            // InternalFeatureLangParser.g:794:3: ( (lv_value_3_0= RULE_ID ) )
            // InternalFeatureLangParser.g:795:4: (lv_value_3_0= RULE_ID )
            {
            // InternalFeatureLangParser.g:795:4: (lv_value_3_0= RULE_ID )
            // InternalFeatureLangParser.g:796:5: lv_value_3_0= RULE_ID
            {
            lv_value_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getUpdateAttributeValueAccess().getValueIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUpdateAttributeValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
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
    // $ANTLR end "ruleUpdateAttributeValue"


    // $ANTLR start "entryRuleAttributeAction"
    // InternalFeatureLangParser.g:819:1: entryRuleAttributeAction returns [EObject current=null] : iv_ruleAttributeAction= ruleAttributeAction EOF ;
    public final EObject entryRuleAttributeAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeAction = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:821:2: (iv_ruleAttributeAction= ruleAttributeAction EOF )
            // InternalFeatureLangParser.g:822:2: iv_ruleAttributeAction= ruleAttributeAction EOF
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
    // InternalFeatureLangParser.g:831:1: ruleAttributeAction returns [EObject current=null] : (otherlv_0= Have (otherlv_1= The | otherlv_2= An | otherlv_3= A ) ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= FullStop (otherlv_6= It otherlv_7= Is otherlv_8= A ( (lv_type_9_0= ruleDatatype ) ) )? ) ;
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
            // InternalFeatureLangParser.g:838:2: ( (otherlv_0= Have (otherlv_1= The | otherlv_2= An | otherlv_3= A ) ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= FullStop (otherlv_6= It otherlv_7= Is otherlv_8= A ( (lv_type_9_0= ruleDatatype ) ) )? ) )
            // InternalFeatureLangParser.g:839:2: (otherlv_0= Have (otherlv_1= The | otherlv_2= An | otherlv_3= A ) ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= FullStop (otherlv_6= It otherlv_7= Is otherlv_8= A ( (lv_type_9_0= ruleDatatype ) ) )? )
            {
            // InternalFeatureLangParser.g:839:2: (otherlv_0= Have (otherlv_1= The | otherlv_2= An | otherlv_3= A ) ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= FullStop (otherlv_6= It otherlv_7= Is otherlv_8= A ( (lv_type_9_0= ruleDatatype ) ) )? )
            // InternalFeatureLangParser.g:840:3: otherlv_0= Have (otherlv_1= The | otherlv_2= An | otherlv_3= A ) ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= FullStop (otherlv_6= It otherlv_7= Is otherlv_8= A ( (lv_type_9_0= ruleDatatype ) ) )?
            {
            otherlv_0=(Token)match(input,Have,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeActionAccess().getHaveKeyword_0());
            		
            // InternalFeatureLangParser.g:844:3: (otherlv_1= The | otherlv_2= An | otherlv_3= A )
            int alt16=3;
            switch ( input.LA(1) ) {
            case The:
                {
                alt16=1;
                }
                break;
            case An:
                {
                alt16=2;
                }
                break;
            case A:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalFeatureLangParser.g:845:4: otherlv_1= The
                    {
                    otherlv_1=(Token)match(input,The,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getAttributeActionAccess().getTheKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:850:4: otherlv_2= An
                    {
                    otherlv_2=(Token)match(input,An,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getAttributeActionAccess().getAnKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalFeatureLangParser.g:855:4: otherlv_3= A
                    {
                    otherlv_3=(Token)match(input,A,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getAttributeActionAccess().getAKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalFeatureLangParser.g:860:3: ( (lv_attribute_4_0= ruleAttribute ) )
            // InternalFeatureLangParser.g:861:4: (lv_attribute_4_0= ruleAttribute )
            {
            // InternalFeatureLangParser.g:861:4: (lv_attribute_4_0= ruleAttribute )
            // InternalFeatureLangParser.g:862:5: lv_attribute_4_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getAttributeActionAccess().getAttributeAttributeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_5=(Token)match(input,FullStop,FOLLOW_23); 

            			newLeafNode(otherlv_5, grammarAccess.getAttributeActionAccess().getFullStopKeyword_3());
            		
            // InternalFeatureLangParser.g:883:3: (otherlv_6= It otherlv_7= Is otherlv_8= A ( (lv_type_9_0= ruleDatatype ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==It) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalFeatureLangParser.g:884:4: otherlv_6= It otherlv_7= Is otherlv_8= A ( (lv_type_9_0= ruleDatatype ) )
                    {
                    otherlv_6=(Token)match(input,It,FOLLOW_24); 

                    				newLeafNode(otherlv_6, grammarAccess.getAttributeActionAccess().getItKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,Is,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getAttributeActionAccess().getIsKeyword_4_1());
                    			
                    otherlv_8=(Token)match(input,A,FOLLOW_18); 

                    				newLeafNode(otherlv_8, grammarAccess.getAttributeActionAccess().getAKeyword_4_2());
                    			
                    // InternalFeatureLangParser.g:896:4: ( (lv_type_9_0= ruleDatatype ) )
                    // InternalFeatureLangParser.g:897:5: (lv_type_9_0= ruleDatatype )
                    {
                    // InternalFeatureLangParser.g:897:5: (lv_type_9_0= ruleDatatype )
                    // InternalFeatureLangParser.g:898:6: lv_type_9_0= ruleDatatype
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
    // InternalFeatureLangParser.g:923:1: entryRuleAssociationAction returns [EObject current=null] : iv_ruleAssociationAction= ruleAssociationAction EOF ;
    public final EObject entryRuleAssociationAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationAction = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:925:2: (iv_ruleAssociationAction= ruleAssociationAction EOF )
            // InternalFeatureLangParser.g:926:2: iv_ruleAssociationAction= ruleAssociationAction EOF
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
    // InternalFeatureLangParser.g:935:1: ruleAssociationAction returns [EObject current=null] : (otherlv_0= Have otherlv_1= Associations otherlv_2= To (otherlv_3= Other )? ( (lv_target_4_0= ruleClass ) ) otherlv_5= Called ( (lv_relation_6_0= RULE_ID ) ) ) ;
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
            // InternalFeatureLangParser.g:942:2: ( (otherlv_0= Have otherlv_1= Associations otherlv_2= To (otherlv_3= Other )? ( (lv_target_4_0= ruleClass ) ) otherlv_5= Called ( (lv_relation_6_0= RULE_ID ) ) ) )
            // InternalFeatureLangParser.g:943:2: (otherlv_0= Have otherlv_1= Associations otherlv_2= To (otherlv_3= Other )? ( (lv_target_4_0= ruleClass ) ) otherlv_5= Called ( (lv_relation_6_0= RULE_ID ) ) )
            {
            // InternalFeatureLangParser.g:943:2: (otherlv_0= Have otherlv_1= Associations otherlv_2= To (otherlv_3= Other )? ( (lv_target_4_0= ruleClass ) ) otherlv_5= Called ( (lv_relation_6_0= RULE_ID ) ) )
            // InternalFeatureLangParser.g:944:3: otherlv_0= Have otherlv_1= Associations otherlv_2= To (otherlv_3= Other )? ( (lv_target_4_0= ruleClass ) ) otherlv_5= Called ( (lv_relation_6_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Have,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getAssociationActionAccess().getHaveKeyword_0());
            		
            otherlv_1=(Token)match(input,Associations,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationActionAccess().getAssociationsKeyword_1());
            		
            otherlv_2=(Token)match(input,To,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getAssociationActionAccess().getToKeyword_2());
            		
            // InternalFeatureLangParser.g:956:3: (otherlv_3= Other )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Other) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalFeatureLangParser.g:957:4: otherlv_3= Other
                    {
                    otherlv_3=(Token)match(input,Other,FOLLOW_28); 

                    				newLeafNode(otherlv_3, grammarAccess.getAssociationActionAccess().getOtherKeyword_3());
                    			

                    }
                    break;

            }

            // InternalFeatureLangParser.g:962:3: ( (lv_target_4_0= ruleClass ) )
            // InternalFeatureLangParser.g:963:4: (lv_target_4_0= ruleClass )
            {
            // InternalFeatureLangParser.g:963:4: (lv_target_4_0= ruleClass )
            // InternalFeatureLangParser.g:964:5: lv_target_4_0= ruleClass
            {

            					newCompositeNode(grammarAccess.getAssociationActionAccess().getTargetClassParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_29);
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

            otherlv_5=(Token)match(input,Called,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getAssociationActionAccess().getCalledKeyword_5());
            		
            // InternalFeatureLangParser.g:985:3: ( (lv_relation_6_0= RULE_ID ) )
            // InternalFeatureLangParser.g:986:4: (lv_relation_6_0= RULE_ID )
            {
            // InternalFeatureLangParser.g:986:4: (lv_relation_6_0= RULE_ID )
            // InternalFeatureLangParser.g:987:5: lv_relation_6_0= RULE_ID
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
    // InternalFeatureLangParser.g:1010:1: entryRuleInheritanceAction returns [EObject current=null] : iv_ruleInheritanceAction= ruleInheritanceAction EOF ;
    public final EObject entryRuleInheritanceAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInheritanceAction = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1012:2: (iv_ruleInheritanceAction= ruleInheritanceAction EOF )
            // InternalFeatureLangParser.g:1013:2: iv_ruleInheritanceAction= ruleInheritanceAction EOF
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
    // InternalFeatureLangParser.g:1022:1: ruleInheritanceAction returns [EObject current=null] : (otherlv_0= Inherit otherlv_1= From ( (lv_parent_2_0= ruleClass ) ) ) ;
    public final EObject ruleInheritanceAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_parent_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1029:2: ( (otherlv_0= Inherit otherlv_1= From ( (lv_parent_2_0= ruleClass ) ) ) )
            // InternalFeatureLangParser.g:1030:2: (otherlv_0= Inherit otherlv_1= From ( (lv_parent_2_0= ruleClass ) ) )
            {
            // InternalFeatureLangParser.g:1030:2: (otherlv_0= Inherit otherlv_1= From ( (lv_parent_2_0= ruleClass ) ) )
            // InternalFeatureLangParser.g:1031:3: otherlv_0= Inherit otherlv_1= From ( (lv_parent_2_0= ruleClass ) )
            {
            otherlv_0=(Token)match(input,Inherit,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getInheritanceActionAccess().getInheritKeyword_0());
            		
            otherlv_1=(Token)match(input,From,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getInheritanceActionAccess().getFromKeyword_1());
            		
            // InternalFeatureLangParser.g:1039:3: ( (lv_parent_2_0= ruleClass ) )
            // InternalFeatureLangParser.g:1040:4: (lv_parent_2_0= ruleClass )
            {
            // InternalFeatureLangParser.g:1040:4: (lv_parent_2_0= ruleClass )
            // InternalFeatureLangParser.g:1041:5: lv_parent_2_0= ruleClass
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


    // $ANTLR start "entryRuleCompositionAction"
    // InternalFeatureLangParser.g:1065:1: entryRuleCompositionAction returns [EObject current=null] : iv_ruleCompositionAction= ruleCompositionAction EOF ;
    public final EObject entryRuleCompositionAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionAction = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1067:2: (iv_ruleCompositionAction= ruleCompositionAction EOF )
            // InternalFeatureLangParser.g:1068:2: iv_ruleCompositionAction= ruleCompositionAction EOF
            {
             newCompositeNode(grammarAccess.getCompositionActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositionAction=ruleCompositionAction();

            state._fsp--;

             current =iv_ruleCompositionAction; 
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
    // $ANTLR end "entryRuleCompositionAction"


    // $ANTLR start "ruleCompositionAction"
    // InternalFeatureLangParser.g:1077:1: ruleCompositionAction returns [EObject current=null] : ( (otherlv_0= Compose | otherlv_1= Composes ) ( (lv_target_2_0= ruleClass ) ) otherlv_3= Called ( (lv_relation_4_0= RULE_ID ) ) ) ;
    public final EObject ruleCompositionAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_relation_4_0=null;
        EObject lv_target_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1084:2: ( ( (otherlv_0= Compose | otherlv_1= Composes ) ( (lv_target_2_0= ruleClass ) ) otherlv_3= Called ( (lv_relation_4_0= RULE_ID ) ) ) )
            // InternalFeatureLangParser.g:1085:2: ( (otherlv_0= Compose | otherlv_1= Composes ) ( (lv_target_2_0= ruleClass ) ) otherlv_3= Called ( (lv_relation_4_0= RULE_ID ) ) )
            {
            // InternalFeatureLangParser.g:1085:2: ( (otherlv_0= Compose | otherlv_1= Composes ) ( (lv_target_2_0= ruleClass ) ) otherlv_3= Called ( (lv_relation_4_0= RULE_ID ) ) )
            // InternalFeatureLangParser.g:1086:3: (otherlv_0= Compose | otherlv_1= Composes ) ( (lv_target_2_0= ruleClass ) ) otherlv_3= Called ( (lv_relation_4_0= RULE_ID ) )
            {
            // InternalFeatureLangParser.g:1086:3: (otherlv_0= Compose | otherlv_1= Composes )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Compose) ) {
                alt19=1;
            }
            else if ( (LA19_0==Composes) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalFeatureLangParser.g:1087:4: otherlv_0= Compose
                    {
                    otherlv_0=(Token)match(input,Compose,FOLLOW_28); 

                    				newLeafNode(otherlv_0, grammarAccess.getCompositionActionAccess().getComposeKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1092:4: otherlv_1= Composes
                    {
                    otherlv_1=(Token)match(input,Composes,FOLLOW_28); 

                    				newLeafNode(otherlv_1, grammarAccess.getCompositionActionAccess().getComposesKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalFeatureLangParser.g:1097:3: ( (lv_target_2_0= ruleClass ) )
            // InternalFeatureLangParser.g:1098:4: (lv_target_2_0= ruleClass )
            {
            // InternalFeatureLangParser.g:1098:4: (lv_target_2_0= ruleClass )
            // InternalFeatureLangParser.g:1099:5: lv_target_2_0= ruleClass
            {

            					newCompositeNode(grammarAccess.getCompositionActionAccess().getTargetClassParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_29);
            lv_target_2_0=ruleClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositionActionRule());
            					}
            					set(
            						current,
            						"target",
            						lv_target_2_0,
            						"de.tud.st.featurelang.FeatureLang.Class");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,Called,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getCompositionActionAccess().getCalledKeyword_2());
            		
            // InternalFeatureLangParser.g:1120:3: ( (lv_relation_4_0= RULE_ID ) )
            // InternalFeatureLangParser.g:1121:4: (lv_relation_4_0= RULE_ID )
            {
            // InternalFeatureLangParser.g:1121:4: (lv_relation_4_0= RULE_ID )
            // InternalFeatureLangParser.g:1122:5: lv_relation_4_0= RULE_ID
            {
            lv_relation_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_relation_4_0, grammarAccess.getCompositionActionAccess().getRelationIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositionActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"relation",
            						lv_relation_4_0,
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
    // $ANTLR end "ruleCompositionAction"


    // $ANTLR start "entryRuleClass"
    // InternalFeatureLangParser.g:1145:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1147:2: (iv_ruleClass= ruleClass EOF )
            // InternalFeatureLangParser.g:1148:2: iv_ruleClass= ruleClass EOF
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
    // InternalFeatureLangParser.g:1157:1: ruleClass returns [EObject current=null] : ( (otherlv_0= The | otherlv_1= A )? ( (lv_abstract_2_0= ruleAbstraction ) )? (otherlv_3= Class )? ( (lv_name_4_0= RULE_ID ) ) ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Enumerator lv_abstract_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1164:2: ( ( (otherlv_0= The | otherlv_1= A )? ( (lv_abstract_2_0= ruleAbstraction ) )? (otherlv_3= Class )? ( (lv_name_4_0= RULE_ID ) ) ) )
            // InternalFeatureLangParser.g:1165:2: ( (otherlv_0= The | otherlv_1= A )? ( (lv_abstract_2_0= ruleAbstraction ) )? (otherlv_3= Class )? ( (lv_name_4_0= RULE_ID ) ) )
            {
            // InternalFeatureLangParser.g:1165:2: ( (otherlv_0= The | otherlv_1= A )? ( (lv_abstract_2_0= ruleAbstraction ) )? (otherlv_3= Class )? ( (lv_name_4_0= RULE_ID ) ) )
            // InternalFeatureLangParser.g:1166:3: (otherlv_0= The | otherlv_1= A )? ( (lv_abstract_2_0= ruleAbstraction ) )? (otherlv_3= Class )? ( (lv_name_4_0= RULE_ID ) )
            {
            // InternalFeatureLangParser.g:1166:3: (otherlv_0= The | otherlv_1= A )?
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==The) ) {
                alt20=1;
            }
            else if ( (LA20_0==A) ) {
                alt20=2;
            }
            switch (alt20) {
                case 1 :
                    // InternalFeatureLangParser.g:1167:4: otherlv_0= The
                    {
                    otherlv_0=(Token)match(input,The,FOLLOW_31); 

                    				newLeafNode(otherlv_0, grammarAccess.getClassAccess().getTheKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1172:4: otherlv_1= A
                    {
                    otherlv_1=(Token)match(input,A,FOLLOW_31); 

                    				newLeafNode(otherlv_1, grammarAccess.getClassAccess().getAKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalFeatureLangParser.g:1177:3: ( (lv_abstract_2_0= ruleAbstraction ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Abstract) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalFeatureLangParser.g:1178:4: (lv_abstract_2_0= ruleAbstraction )
                    {
                    // InternalFeatureLangParser.g:1178:4: (lv_abstract_2_0= ruleAbstraction )
                    // InternalFeatureLangParser.g:1179:5: lv_abstract_2_0= ruleAbstraction
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getAbstractAbstractionEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_32);
                    lv_abstract_2_0=ruleAbstraction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClassRule());
                    					}
                    					set(
                    						current,
                    						"abstract",
                    						lv_abstract_2_0,
                    						"de.tud.st.featurelang.FeatureLang.Abstraction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalFeatureLangParser.g:1196:3: (otherlv_3= Class )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Class) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalFeatureLangParser.g:1197:4: otherlv_3= Class
                    {
                    otherlv_3=(Token)match(input,Class,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getClassAccess().getClassKeyword_2());
                    			

                    }
                    break;

            }

            // InternalFeatureLangParser.g:1202:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalFeatureLangParser.g:1203:4: (lv_name_4_0= RULE_ID )
            {
            // InternalFeatureLangParser.g:1203:4: (lv_name_4_0= RULE_ID )
            // InternalFeatureLangParser.g:1204:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_4_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
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
    // InternalFeatureLangParser.g:1227:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1229:2: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalFeatureLangParser.g:1230:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalFeatureLangParser.g:1239:1: ruleAttribute returns [EObject current=null] : ( (otherlv_0= Attribute )? ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1246:2: ( ( (otherlv_0= Attribute )? ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalFeatureLangParser.g:1247:2: ( (otherlv_0= Attribute )? ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalFeatureLangParser.g:1247:2: ( (otherlv_0= Attribute )? ( (lv_name_1_0= RULE_ID ) ) )
            // InternalFeatureLangParser.g:1248:3: (otherlv_0= Attribute )? ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalFeatureLangParser.g:1248:3: (otherlv_0= Attribute )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Attribute) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalFeatureLangParser.g:1249:4: otherlv_0= Attribute
                    {
                    otherlv_0=(Token)match(input,Attribute,FOLLOW_21); 

                    				newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
                    			

                    }
                    break;

            }

            // InternalFeatureLangParser.g:1254:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFeatureLangParser.g:1255:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFeatureLangParser.g:1255:4: (lv_name_1_0= RULE_ID )
            // InternalFeatureLangParser.g:1256:5: lv_name_1_0= RULE_ID
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


    // $ANTLR start "entryRuleIdentifier"
    // InternalFeatureLangParser.g:1279:1: entryRuleIdentifier returns [EObject current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final EObject entryRuleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifier = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1281:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // InternalFeatureLangParser.g:1282:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
             newCompositeNode(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;

             current =iv_ruleIdentifier; 
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
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // InternalFeatureLangParser.g:1291:1: ruleIdentifier returns [EObject current=null] : ( ( (lv_value_0_0= ruleIdentifierValue ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleIdentifier() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_value_0_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1298:2: ( ( ( (lv_value_0_0= ruleIdentifierValue ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalFeatureLangParser.g:1299:2: ( ( (lv_value_0_0= ruleIdentifierValue ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalFeatureLangParser.g:1299:2: ( ( (lv_value_0_0= ruleIdentifierValue ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalFeatureLangParser.g:1300:3: ( (lv_value_0_0= ruleIdentifierValue ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalFeatureLangParser.g:1300:3: ( (lv_value_0_0= ruleIdentifierValue ) )
            // InternalFeatureLangParser.g:1301:4: (lv_value_0_0= ruleIdentifierValue )
            {
            // InternalFeatureLangParser.g:1301:4: (lv_value_0_0= ruleIdentifierValue )
            // InternalFeatureLangParser.g:1302:5: lv_value_0_0= ruleIdentifierValue
            {

            					newCompositeNode(grammarAccess.getIdentifierAccess().getValueIdentifierValueEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
            lv_value_0_0=ruleIdentifierValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIdentifierRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_0_0,
            						"de.tud.st.featurelang.FeatureLang.IdentifierValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFeatureLangParser.g:1319:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFeatureLangParser.g:1320:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFeatureLangParser.g:1320:4: (lv_name_1_0= RULE_ID )
            // InternalFeatureLangParser.g:1321:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getIdentifierAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIdentifierRule());
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
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRulePriority"
    // InternalFeatureLangParser.g:1344:1: entryRulePriority returns [EObject current=null] : iv_rulePriority= rulePriority EOF ;
    public final EObject entryRulePriority() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePriority = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1346:2: (iv_rulePriority= rulePriority EOF )
            // InternalFeatureLangParser.g:1347:2: iv_rulePriority= rulePriority EOF
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
    // InternalFeatureLangParser.g:1356:1: rulePriority returns [EObject current=null] : ( (lv_priority_0_0= rulePriorityValue ) ) ;
    public final EObject rulePriority() throws RecognitionException {
        EObject current = null;

        Enumerator lv_priority_0_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1363:2: ( ( (lv_priority_0_0= rulePriorityValue ) ) )
            // InternalFeatureLangParser.g:1364:2: ( (lv_priority_0_0= rulePriorityValue ) )
            {
            // InternalFeatureLangParser.g:1364:2: ( (lv_priority_0_0= rulePriorityValue ) )
            // InternalFeatureLangParser.g:1365:3: (lv_priority_0_0= rulePriorityValue )
            {
            // InternalFeatureLangParser.g:1365:3: (lv_priority_0_0= rulePriorityValue )
            // InternalFeatureLangParser.g:1366:4: lv_priority_0_0= rulePriorityValue
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
    // InternalFeatureLangParser.g:1389:1: rulePriorityValue returns [Enumerator current=null] : ( (enumLiteral_0= Should ) | (enumLiteral_1= Must ) ) ;
    public final Enumerator rulePriorityValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFeatureLangParser.g:1395:2: ( ( (enumLiteral_0= Should ) | (enumLiteral_1= Must ) ) )
            // InternalFeatureLangParser.g:1396:2: ( (enumLiteral_0= Should ) | (enumLiteral_1= Must ) )
            {
            // InternalFeatureLangParser.g:1396:2: ( (enumLiteral_0= Should ) | (enumLiteral_1= Must ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Should) ) {
                alt24=1;
            }
            else if ( (LA24_0==Must) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalFeatureLangParser.g:1397:3: (enumLiteral_0= Should )
                    {
                    // InternalFeatureLangParser.g:1397:3: (enumLiteral_0= Should )
                    // InternalFeatureLangParser.g:1398:4: enumLiteral_0= Should
                    {
                    enumLiteral_0=(Token)match(input,Should,FOLLOW_2); 

                    				current = grammarAccess.getPriorityValueAccess().getSHOULDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPriorityValueAccess().getSHOULDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1405:3: (enumLiteral_1= Must )
                    {
                    // InternalFeatureLangParser.g:1405:3: (enumLiteral_1= Must )
                    // InternalFeatureLangParser.g:1406:4: enumLiteral_1= Must
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


    // $ANTLR start "ruleAbstraction"
    // InternalFeatureLangParser.g:1416:1: ruleAbstraction returns [Enumerator current=null] : (enumLiteral_0= Abstract ) ;
    public final Enumerator ruleAbstraction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalFeatureLangParser.g:1422:2: ( (enumLiteral_0= Abstract ) )
            // InternalFeatureLangParser.g:1423:2: (enumLiteral_0= Abstract )
            {
            // InternalFeatureLangParser.g:1423:2: (enumLiteral_0= Abstract )
            // InternalFeatureLangParser.g:1424:3: enumLiteral_0= Abstract
            {
            enumLiteral_0=(Token)match(input,Abstract,FOLLOW_2); 

            			current = grammarAccess.getAbstractionAccess().getABSTRACTEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getAbstractionAccess().getABSTRACTEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleAbstraction"


    // $ANTLR start "ruleIdentifierValue"
    // InternalFeatureLangParser.g:1433:1: ruleIdentifierValue returns [Enumerator current=null] : ( (enumLiteral_0= Name ) | (enumLiteral_1= URI ) ) ;
    public final Enumerator ruleIdentifierValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFeatureLangParser.g:1439:2: ( ( (enumLiteral_0= Name ) | (enumLiteral_1= URI ) ) )
            // InternalFeatureLangParser.g:1440:2: ( (enumLiteral_0= Name ) | (enumLiteral_1= URI ) )
            {
            // InternalFeatureLangParser.g:1440:2: ( (enumLiteral_0= Name ) | (enumLiteral_1= URI ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Name) ) {
                alt25=1;
            }
            else if ( (LA25_0==URI) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalFeatureLangParser.g:1441:3: (enumLiteral_0= Name )
                    {
                    // InternalFeatureLangParser.g:1441:3: (enumLiteral_0= Name )
                    // InternalFeatureLangParser.g:1442:4: enumLiteral_0= Name
                    {
                    enumLiteral_0=(Token)match(input,Name,FOLLOW_2); 

                    				current = grammarAccess.getIdentifierValueAccess().getNAMEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getIdentifierValueAccess().getNAMEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1449:3: (enumLiteral_1= URI )
                    {
                    // InternalFeatureLangParser.g:1449:3: (enumLiteral_1= URI )
                    // InternalFeatureLangParser.g:1450:4: enumLiteral_1= URI
                    {
                    enumLiteral_1=(Token)match(input,URI,FOLLOW_2); 

                    				current = grammarAccess.getIdentifierValueAccess().getURIEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getIdentifierValueAccess().getURIEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleIdentifierValue"


    // $ANTLR start "ruleDatatype"
    // InternalFeatureLangParser.g:1460:1: ruleDatatype returns [Enumerator current=null] : ( (enumLiteral_0= Time ) | (enumLiteral_1= Phrase ) | (enumLiteral_2= Number ) ) ;
    public final Enumerator ruleDatatype() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalFeatureLangParser.g:1466:2: ( ( (enumLiteral_0= Time ) | (enumLiteral_1= Phrase ) | (enumLiteral_2= Number ) ) )
            // InternalFeatureLangParser.g:1467:2: ( (enumLiteral_0= Time ) | (enumLiteral_1= Phrase ) | (enumLiteral_2= Number ) )
            {
            // InternalFeatureLangParser.g:1467:2: ( (enumLiteral_0= Time ) | (enumLiteral_1= Phrase ) | (enumLiteral_2= Number ) )
            int alt26=3;
            switch ( input.LA(1) ) {
            case Time:
                {
                alt26=1;
                }
                break;
            case Phrase:
                {
                alt26=2;
                }
                break;
            case Number:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalFeatureLangParser.g:1468:3: (enumLiteral_0= Time )
                    {
                    // InternalFeatureLangParser.g:1468:3: (enumLiteral_0= Time )
                    // InternalFeatureLangParser.g:1469:4: enumLiteral_0= Time
                    {
                    enumLiteral_0=(Token)match(input,Time,FOLLOW_2); 

                    				current = grammarAccess.getDatatypeAccess().getWORDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDatatypeAccess().getWORDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1476:3: (enumLiteral_1= Phrase )
                    {
                    // InternalFeatureLangParser.g:1476:3: (enumLiteral_1= Phrase )
                    // InternalFeatureLangParser.g:1477:4: enumLiteral_1= Phrase
                    {
                    enumLiteral_1=(Token)match(input,Phrase,FOLLOW_2); 

                    				current = grammarAccess.getDatatypeAccess().getPHRASEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDatatypeAccess().getPHRASEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureLangParser.g:1484:3: (enumLiteral_2= Number )
                    {
                    // InternalFeatureLangParser.g:1484:3: (enumLiteral_2= Number )
                    // InternalFeatureLangParser.g:1485:4: enumLiteral_2= Number
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
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\3\6\1\17\1\43\1\16\2\7\1\uffff\1\7\1\uffff";
    static final String dfa_3s = "\5\43\1\31\2\35\1\uffff\1\35\1\uffff";
    static final String dfa_4s = "\10\uffff\1\1\1\uffff\1\2";
    static final String dfa_5s = "\13\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\10\uffff\1\4\13\uffff\1\1\6\uffff\1\2\1\5",
            "\1\3\10\uffff\1\4\23\uffff\1\5",
            "\1\3\10\uffff\1\4\23\uffff\1\5",
            "\1\4\23\uffff\1\5",
            "\1\5",
            "\1\6\6\uffff\1\7\3\uffff\1\10",
            "\1\10\1\uffff\2\10\5\uffff\1\12\3\uffff\1\10\5\uffff\1\11\2\uffff\1\12",
            "\1\10\1\uffff\2\10\5\uffff\1\12\3\uffff\1\10\5\uffff\1\11\2\uffff\1\12",
            "",
            "\1\10\1\uffff\2\10\5\uffff\1\12\3\uffff\1\10\10\uffff\1\12",
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000C08008042L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002204000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004100680L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100680L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000411400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000024010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000410000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000800000120L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000803000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400040000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000418000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000C08028040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000C08008040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800008040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800008000L});

}