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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Associations", "Association", "Composition", "Inheritance", "Compatible", "Attribute", "Abstract", "Existing", "Starting", "Versions", "Compose", "Inherit", "Private", "Variant", "Version", "Called", "Number", "Phrase", "Public", "Should", "Target", "Class", "Exist", "Other", "Range", "Value", "Date", "From", "Have", "Must", "Name", "Role", "Time", "With", "URI", "All", "Has", "Not", "The", "An", "Be", "Is", "It", "Of", "To", "Up", "FullStop", "A", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int All=39;
    public static final int Inheritance=7;
    public static final int Must=33;
    public static final int Name=34;
    public static final int Compose=14;
    public static final int Version=18;
    public static final int Private=16;
    public static final int To=48;
    public static final int Inherit=15;
    public static final int RULE_ID=52;
    public static final int Have=32;
    public static final int Phrase=21;
    public static final int Public=22;
    public static final int Associations=4;
    public static final int Range=28;
    public static final int Variant=17;
    public static final int Role=35;
    public static final int Not=41;
    public static final int Versions=13;
    public static final int RULE_INT=53;
    public static final int Starting=12;
    public static final int Value=29;
    public static final int RULE_ML_COMMENT=55;
    public static final int Class=25;
    public static final int Up=49;
    public static final int A=51;
    public static final int Called=19;
    public static final int Should=23;
    public static final int Attribute=9;
    public static final int Time=36;
    public static final int Is=45;
    public static final int RULE_STRING=54;
    public static final int It=46;
    public static final int URI=38;
    public static final int An=43;
    public static final int With=37;
    public static final int RULE_SL_COMMENT=56;
    public static final int The=42;
    public static final int Target=24;
    public static final int Association=5;
    public static final int Exist=26;
    public static final int Number=20;
    public static final int EOF=-1;
    public static final int FullStop=50;
    public static final int Composition=6;
    public static final int Be=44;
    public static final int RULE_WS=57;
    public static final int Abstract=10;
    public static final int From=31;
    public static final int RULE_ANY_OTHER=58;
    public static final int Compatible=8;
    public static final int Date=30;
    public static final int Of=47;
    public static final int Has=40;
    public static final int Existing=11;
    public static final int Other=27;

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
                        case Association:
                        case Composition:
                        case Inheritance:
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
                    else if ( ((LA6_0>=Compose && LA6_0<=Inherit)) ) {
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
                switch ( input.LA(2) ) {
                case Associations:
                case Association:
                    {
                    alt10=2;
                    }
                    break;
                case Inheritance:
                    {
                    alt10=3;
                    }
                    break;
                case The:
                case An:
                case A:
                    {
                    alt10=1;
                    }
                    break;
                case Composition:
                    {
                    alt10=4;
                    }
                    break;
                default:
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
    // InternalFeatureLangParser.g:935:1: ruleAssociationAction returns [EObject current=null] : (otherlv_0= Have (otherlv_1= Associations | otherlv_2= Association ) ( ( (lv_create_3_0= ruleCreateAssociation ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( (lv_edit_5_0= ruleEditAssociation ) ) ) ) ) ;
    public final EObject ruleAssociationAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_4_0=null;
        EObject lv_create_3_0 = null;

        EObject lv_edit_5_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:942:2: ( (otherlv_0= Have (otherlv_1= Associations | otherlv_2= Association ) ( ( (lv_create_3_0= ruleCreateAssociation ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( (lv_edit_5_0= ruleEditAssociation ) ) ) ) ) )
            // InternalFeatureLangParser.g:943:2: (otherlv_0= Have (otherlv_1= Associations | otherlv_2= Association ) ( ( (lv_create_3_0= ruleCreateAssociation ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( (lv_edit_5_0= ruleEditAssociation ) ) ) ) )
            {
            // InternalFeatureLangParser.g:943:2: (otherlv_0= Have (otherlv_1= Associations | otherlv_2= Association ) ( ( (lv_create_3_0= ruleCreateAssociation ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( (lv_edit_5_0= ruleEditAssociation ) ) ) ) )
            // InternalFeatureLangParser.g:944:3: otherlv_0= Have (otherlv_1= Associations | otherlv_2= Association ) ( ( (lv_create_3_0= ruleCreateAssociation ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( (lv_edit_5_0= ruleEditAssociation ) ) ) )
            {
            otherlv_0=(Token)match(input,Have,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getAssociationActionAccess().getHaveKeyword_0());
            		
            // InternalFeatureLangParser.g:948:3: (otherlv_1= Associations | otherlv_2= Association )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Associations) ) {
                alt18=1;
            }
            else if ( (LA18_0==Association) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalFeatureLangParser.g:949:4: otherlv_1= Associations
                    {
                    otherlv_1=(Token)match(input,Associations,FOLLOW_26); 

                    				newLeafNode(otherlv_1, grammarAccess.getAssociationActionAccess().getAssociationsKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:954:4: otherlv_2= Association
                    {
                    otherlv_2=(Token)match(input,Association,FOLLOW_26); 

                    				newLeafNode(otherlv_2, grammarAccess.getAssociationActionAccess().getAssociationKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalFeatureLangParser.g:959:3: ( ( (lv_create_3_0= ruleCreateAssociation ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( (lv_edit_5_0= ruleEditAssociation ) ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==To) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalFeatureLangParser.g:960:4: ( (lv_create_3_0= ruleCreateAssociation ) )
                    {
                    // InternalFeatureLangParser.g:960:4: ( (lv_create_3_0= ruleCreateAssociation ) )
                    // InternalFeatureLangParser.g:961:5: (lv_create_3_0= ruleCreateAssociation )
                    {
                    // InternalFeatureLangParser.g:961:5: (lv_create_3_0= ruleCreateAssociation )
                    // InternalFeatureLangParser.g:962:6: lv_create_3_0= ruleCreateAssociation
                    {

                    						newCompositeNode(grammarAccess.getAssociationActionAccess().getCreateCreateAssociationParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_create_3_0=ruleCreateAssociation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssociationActionRule());
                    						}
                    						set(
                    							current,
                    							"create",
                    							lv_create_3_0,
                    							"de.tud.st.featurelang.FeatureLang.CreateAssociation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:980:4: ( ( (lv_name_4_0= RULE_ID ) ) ( (lv_edit_5_0= ruleEditAssociation ) ) )
                    {
                    // InternalFeatureLangParser.g:980:4: ( ( (lv_name_4_0= RULE_ID ) ) ( (lv_edit_5_0= ruleEditAssociation ) ) )
                    // InternalFeatureLangParser.g:981:5: ( (lv_name_4_0= RULE_ID ) ) ( (lv_edit_5_0= ruleEditAssociation ) )
                    {
                    // InternalFeatureLangParser.g:981:5: ( (lv_name_4_0= RULE_ID ) )
                    // InternalFeatureLangParser.g:982:6: (lv_name_4_0= RULE_ID )
                    {
                    // InternalFeatureLangParser.g:982:6: (lv_name_4_0= RULE_ID )
                    // InternalFeatureLangParser.g:983:7: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_27); 

                    							newLeafNode(lv_name_4_0, grammarAccess.getAssociationActionAccess().getNameIDTerminalRuleCall_2_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAssociationActionRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_4_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }

                    // InternalFeatureLangParser.g:999:5: ( (lv_edit_5_0= ruleEditAssociation ) )
                    // InternalFeatureLangParser.g:1000:6: (lv_edit_5_0= ruleEditAssociation )
                    {
                    // InternalFeatureLangParser.g:1000:6: (lv_edit_5_0= ruleEditAssociation )
                    // InternalFeatureLangParser.g:1001:7: lv_edit_5_0= ruleEditAssociation
                    {

                    							newCompositeNode(grammarAccess.getAssociationActionAccess().getEditEditAssociationParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_edit_5_0=ruleEditAssociation();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAssociationActionRule());
                    							}
                    							set(
                    								current,
                    								"edit",
                    								lv_edit_5_0,
                    								"de.tud.st.featurelang.FeatureLang.EditAssociation");
                    							afterParserOrEnumRuleCall();
                    						

                    }


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
    // $ANTLR end "ruleAssociationAction"


    // $ANTLR start "entryRuleCreateAssociation"
    // InternalFeatureLangParser.g:1027:1: entryRuleCreateAssociation returns [EObject current=null] : iv_ruleCreateAssociation= ruleCreateAssociation EOF ;
    public final EObject entryRuleCreateAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateAssociation = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1029:2: (iv_ruleCreateAssociation= ruleCreateAssociation EOF )
            // InternalFeatureLangParser.g:1030:2: iv_ruleCreateAssociation= ruleCreateAssociation EOF
            {
             newCompositeNode(grammarAccess.getCreateAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateAssociation=ruleCreateAssociation();

            state._fsp--;

             current =iv_ruleCreateAssociation; 
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
    // $ANTLR end "entryRuleCreateAssociation"


    // $ANTLR start "ruleCreateAssociation"
    // InternalFeatureLangParser.g:1039:1: ruleCreateAssociation returns [EObject current=null] : (otherlv_0= To (otherlv_1= Other )? ( (lv_target_2_0= ruleClass ) ) otherlv_3= Called ( (lv_relation_4_0= RULE_ID ) ) ) ;
    public final EObject ruleCreateAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_relation_4_0=null;
        EObject lv_target_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1046:2: ( (otherlv_0= To (otherlv_1= Other )? ( (lv_target_2_0= ruleClass ) ) otherlv_3= Called ( (lv_relation_4_0= RULE_ID ) ) ) )
            // InternalFeatureLangParser.g:1047:2: (otherlv_0= To (otherlv_1= Other )? ( (lv_target_2_0= ruleClass ) ) otherlv_3= Called ( (lv_relation_4_0= RULE_ID ) ) )
            {
            // InternalFeatureLangParser.g:1047:2: (otherlv_0= To (otherlv_1= Other )? ( (lv_target_2_0= ruleClass ) ) otherlv_3= Called ( (lv_relation_4_0= RULE_ID ) ) )
            // InternalFeatureLangParser.g:1048:3: otherlv_0= To (otherlv_1= Other )? ( (lv_target_2_0= ruleClass ) ) otherlv_3= Called ( (lv_relation_4_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,To,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateAssociationAccess().getToKeyword_0());
            		
            // InternalFeatureLangParser.g:1052:3: (otherlv_1= Other )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Other) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalFeatureLangParser.g:1053:4: otherlv_1= Other
                    {
                    otherlv_1=(Token)match(input,Other,FOLLOW_29); 

                    				newLeafNode(otherlv_1, grammarAccess.getCreateAssociationAccess().getOtherKeyword_1());
                    			

                    }
                    break;

            }

            // InternalFeatureLangParser.g:1058:3: ( (lv_target_2_0= ruleClass ) )
            // InternalFeatureLangParser.g:1059:4: (lv_target_2_0= ruleClass )
            {
            // InternalFeatureLangParser.g:1059:4: (lv_target_2_0= ruleClass )
            // InternalFeatureLangParser.g:1060:5: lv_target_2_0= ruleClass
            {

            					newCompositeNode(grammarAccess.getCreateAssociationAccess().getTargetClassParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
            lv_target_2_0=ruleClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreateAssociationRule());
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

            			newLeafNode(otherlv_3, grammarAccess.getCreateAssociationAccess().getCalledKeyword_3());
            		
            // InternalFeatureLangParser.g:1081:3: ( (lv_relation_4_0= RULE_ID ) )
            // InternalFeatureLangParser.g:1082:4: (lv_relation_4_0= RULE_ID )
            {
            // InternalFeatureLangParser.g:1082:4: (lv_relation_4_0= RULE_ID )
            // InternalFeatureLangParser.g:1083:5: lv_relation_4_0= RULE_ID
            {
            lv_relation_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_relation_4_0, grammarAccess.getCreateAssociationAccess().getRelationIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCreateAssociationRule());
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
    // $ANTLR end "ruleCreateAssociation"


    // $ANTLR start "entryRuleEditAssociation"
    // InternalFeatureLangParser.g:1106:1: entryRuleEditAssociation returns [EObject current=null] : iv_ruleEditAssociation= ruleEditAssociation EOF ;
    public final EObject entryRuleEditAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEditAssociation = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1108:2: (iv_ruleEditAssociation= ruleEditAssociation EOF )
            // InternalFeatureLangParser.g:1109:2: iv_ruleEditAssociation= ruleEditAssociation EOF
            {
             newCompositeNode(grammarAccess.getEditAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEditAssociation=ruleEditAssociation();

            state._fsp--;

             current =iv_ruleEditAssociation; 
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
    // $ANTLR end "entryRuleEditAssociation"


    // $ANTLR start "ruleEditAssociation"
    // InternalFeatureLangParser.g:1118:1: ruleEditAssociation returns [EObject current=null] : ( ( (lv_type_0_1= ruleSetCompatible | lv_type_0_2= ruleSetVersionRange | lv_type_0_3= ruleSetVariant | lv_type_0_4= ruleSetRightOpen | lv_type_0_5= ruleSetLeftOpen ) ) ) ;
    public final EObject ruleEditAssociation() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_1 = null;

        EObject lv_type_0_2 = null;

        EObject lv_type_0_3 = null;

        EObject lv_type_0_4 = null;

        EObject lv_type_0_5 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1125:2: ( ( ( (lv_type_0_1= ruleSetCompatible | lv_type_0_2= ruleSetVersionRange | lv_type_0_3= ruleSetVariant | lv_type_0_4= ruleSetRightOpen | lv_type_0_5= ruleSetLeftOpen ) ) ) )
            // InternalFeatureLangParser.g:1126:2: ( ( (lv_type_0_1= ruleSetCompatible | lv_type_0_2= ruleSetVersionRange | lv_type_0_3= ruleSetVariant | lv_type_0_4= ruleSetRightOpen | lv_type_0_5= ruleSetLeftOpen ) ) )
            {
            // InternalFeatureLangParser.g:1126:2: ( ( (lv_type_0_1= ruleSetCompatible | lv_type_0_2= ruleSetVersionRange | lv_type_0_3= ruleSetVariant | lv_type_0_4= ruleSetRightOpen | lv_type_0_5= ruleSetLeftOpen ) ) )
            // InternalFeatureLangParser.g:1127:3: ( (lv_type_0_1= ruleSetCompatible | lv_type_0_2= ruleSetVersionRange | lv_type_0_3= ruleSetVariant | lv_type_0_4= ruleSetRightOpen | lv_type_0_5= ruleSetLeftOpen ) )
            {
            // InternalFeatureLangParser.g:1127:3: ( (lv_type_0_1= ruleSetCompatible | lv_type_0_2= ruleSetVersionRange | lv_type_0_3= ruleSetVariant | lv_type_0_4= ruleSetRightOpen | lv_type_0_5= ruleSetLeftOpen ) )
            // InternalFeatureLangParser.g:1128:4: (lv_type_0_1= ruleSetCompatible | lv_type_0_2= ruleSetVersionRange | lv_type_0_3= ruleSetVariant | lv_type_0_4= ruleSetRightOpen | lv_type_0_5= ruleSetLeftOpen )
            {
            // InternalFeatureLangParser.g:1128:4: (lv_type_0_1= ruleSetCompatible | lv_type_0_2= ruleSetVersionRange | lv_type_0_3= ruleSetVariant | lv_type_0_4= ruleSetRightOpen | lv_type_0_5= ruleSetLeftOpen )
            int alt21=5;
            switch ( input.LA(1) ) {
            case Compatible:
                {
                alt21=1;
                }
                break;
            case With:
                {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==Version) ) {
                    alt21=2;
                }
                else if ( (LA21_2==All) ) {
                    alt21=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 2, input);

                    throw nvae;
                }
                }
                break;
            case Up:
                {
                alt21=4;
                }
                break;
            case Starting:
                {
                alt21=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalFeatureLangParser.g:1129:5: lv_type_0_1= ruleSetCompatible
                    {

                    					newCompositeNode(grammarAccess.getEditAssociationAccess().getTypeSetCompatibleParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_1=ruleSetCompatible();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEditAssociationRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_1,
                    						"de.tud.st.featurelang.FeatureLang.SetCompatible");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1145:5: lv_type_0_2= ruleSetVersionRange
                    {

                    					newCompositeNode(grammarAccess.getEditAssociationAccess().getTypeSetVersionRangeParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_2=ruleSetVersionRange();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEditAssociationRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_2,
                    						"de.tud.st.featurelang.FeatureLang.SetVersionRange");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 3 :
                    // InternalFeatureLangParser.g:1161:5: lv_type_0_3= ruleSetVariant
                    {

                    					newCompositeNode(grammarAccess.getEditAssociationAccess().getTypeSetVariantParserRuleCall_0_2());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_3=ruleSetVariant();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEditAssociationRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_3,
                    						"de.tud.st.featurelang.FeatureLang.SetVariant");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 4 :
                    // InternalFeatureLangParser.g:1177:5: lv_type_0_4= ruleSetRightOpen
                    {

                    					newCompositeNode(grammarAccess.getEditAssociationAccess().getTypeSetRightOpenParserRuleCall_0_3());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_4=ruleSetRightOpen();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEditAssociationRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_4,
                    						"de.tud.st.featurelang.FeatureLang.SetRightOpen");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 5 :
                    // InternalFeatureLangParser.g:1193:5: lv_type_0_5= ruleSetLeftOpen
                    {

                    					newCompositeNode(grammarAccess.getEditAssociationAccess().getTypeSetLeftOpenParserRuleCall_0_4());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_5=ruleSetLeftOpen();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEditAssociationRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_5,
                    						"de.tud.st.featurelang.FeatureLang.SetLeftOpen");
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
    // $ANTLR end "ruleEditAssociation"


    // $ANTLR start "entryRuleSetCompatible"
    // InternalFeatureLangParser.g:1217:1: entryRuleSetCompatible returns [EObject current=null] : iv_ruleSetCompatible= ruleSetCompatible EOF ;
    public final EObject entryRuleSetCompatible() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetCompatible = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1219:2: (iv_ruleSetCompatible= ruleSetCompatible EOF )
            // InternalFeatureLangParser.g:1220:2: iv_ruleSetCompatible= ruleSetCompatible EOF
            {
             newCompositeNode(grammarAccess.getSetCompatibleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetCompatible=ruleSetCompatible();

            state._fsp--;

             current =iv_ruleSetCompatible; 
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
    // $ANTLR end "entryRuleSetCompatible"


    // $ANTLR start "ruleSetCompatible"
    // InternalFeatureLangParser.g:1229:1: ruleSetCompatible returns [EObject current=null] : (otherlv_0= Compatible otherlv_1= With otherlv_2= Version ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleSetCompatible() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1236:2: ( (otherlv_0= Compatible otherlv_1= With otherlv_2= Version ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalFeatureLangParser.g:1237:2: (otherlv_0= Compatible otherlv_1= With otherlv_2= Version ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalFeatureLangParser.g:1237:2: (otherlv_0= Compatible otherlv_1= With otherlv_2= Version ( (lv_name_3_0= RULE_ID ) ) )
            // InternalFeatureLangParser.g:1238:3: otherlv_0= Compatible otherlv_1= With otherlv_2= Version ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Compatible,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getSetCompatibleAccess().getCompatibleKeyword_0());
            		
            otherlv_1=(Token)match(input,With,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getSetCompatibleAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,Version,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getSetCompatibleAccess().getVersionKeyword_2());
            		
            // InternalFeatureLangParser.g:1250:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalFeatureLangParser.g:1251:4: (lv_name_3_0= RULE_ID )
            {
            // InternalFeatureLangParser.g:1251:4: (lv_name_3_0= RULE_ID )
            // InternalFeatureLangParser.g:1252:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getSetCompatibleAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetCompatibleRule());
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
    // $ANTLR end "ruleSetCompatible"


    // $ANTLR start "entryRuleSetVersionRange"
    // InternalFeatureLangParser.g:1275:1: entryRuleSetVersionRange returns [EObject current=null] : iv_ruleSetVersionRange= ruleSetVersionRange EOF ;
    public final EObject entryRuleSetVersionRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetVersionRange = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1277:2: (iv_ruleSetVersionRange= ruleSetVersionRange EOF )
            // InternalFeatureLangParser.g:1278:2: iv_ruleSetVersionRange= ruleSetVersionRange EOF
            {
             newCompositeNode(grammarAccess.getSetVersionRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetVersionRange=ruleSetVersionRange();

            state._fsp--;

             current =iv_ruleSetVersionRange; 
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
    // $ANTLR end "entryRuleSetVersionRange"


    // $ANTLR start "ruleSetVersionRange"
    // InternalFeatureLangParser.g:1287:1: ruleSetVersionRange returns [EObject current=null] : (otherlv_0= With otherlv_1= Version otherlv_2= Range otherlv_3= From ( (lv_start_4_0= RULE_ID ) ) otherlv_5= To ( (lv_end_6_0= RULE_ID ) ) ) ;
    public final EObject ruleSetVersionRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_start_4_0=null;
        Token otherlv_5=null;
        Token lv_end_6_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1294:2: ( (otherlv_0= With otherlv_1= Version otherlv_2= Range otherlv_3= From ( (lv_start_4_0= RULE_ID ) ) otherlv_5= To ( (lv_end_6_0= RULE_ID ) ) ) )
            // InternalFeatureLangParser.g:1295:2: (otherlv_0= With otherlv_1= Version otherlv_2= Range otherlv_3= From ( (lv_start_4_0= RULE_ID ) ) otherlv_5= To ( (lv_end_6_0= RULE_ID ) ) )
            {
            // InternalFeatureLangParser.g:1295:2: (otherlv_0= With otherlv_1= Version otherlv_2= Range otherlv_3= From ( (lv_start_4_0= RULE_ID ) ) otherlv_5= To ( (lv_end_6_0= RULE_ID ) ) )
            // InternalFeatureLangParser.g:1296:3: otherlv_0= With otherlv_1= Version otherlv_2= Range otherlv_3= From ( (lv_start_4_0= RULE_ID ) ) otherlv_5= To ( (lv_end_6_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,With,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getSetVersionRangeAccess().getWithKeyword_0());
            		
            otherlv_1=(Token)match(input,Version,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getSetVersionRangeAccess().getVersionKeyword_1());
            		
            otherlv_2=(Token)match(input,Range,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getSetVersionRangeAccess().getRangeKeyword_2());
            		
            otherlv_3=(Token)match(input,From,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getSetVersionRangeAccess().getFromKeyword_3());
            		
            // InternalFeatureLangParser.g:1312:3: ( (lv_start_4_0= RULE_ID ) )
            // InternalFeatureLangParser.g:1313:4: (lv_start_4_0= RULE_ID )
            {
            // InternalFeatureLangParser.g:1313:4: (lv_start_4_0= RULE_ID )
            // InternalFeatureLangParser.g:1314:5: lv_start_4_0= RULE_ID
            {
            lv_start_4_0=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(lv_start_4_0, grammarAccess.getSetVersionRangeAccess().getStartIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetVersionRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"start",
            						lv_start_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,To,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getSetVersionRangeAccess().getToKeyword_5());
            		
            // InternalFeatureLangParser.g:1334:3: ( (lv_end_6_0= RULE_ID ) )
            // InternalFeatureLangParser.g:1335:4: (lv_end_6_0= RULE_ID )
            {
            // InternalFeatureLangParser.g:1335:4: (lv_end_6_0= RULE_ID )
            // InternalFeatureLangParser.g:1336:5: lv_end_6_0= RULE_ID
            {
            lv_end_6_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_end_6_0, grammarAccess.getSetVersionRangeAccess().getEndIDTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetVersionRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"end",
            						lv_end_6_0,
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
    // $ANTLR end "ruleSetVersionRange"


    // $ANTLR start "entryRuleSetVariant"
    // InternalFeatureLangParser.g:1359:1: entryRuleSetVariant returns [EObject current=null] : iv_ruleSetVariant= ruleSetVariant EOF ;
    public final EObject entryRuleSetVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetVariant = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1361:2: (iv_ruleSetVariant= ruleSetVariant EOF )
            // InternalFeatureLangParser.g:1362:2: iv_ruleSetVariant= ruleSetVariant EOF
            {
             newCompositeNode(grammarAccess.getSetVariantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetVariant=ruleSetVariant();

            state._fsp--;

             current =iv_ruleSetVariant; 
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
    // $ANTLR end "entryRuleSetVariant"


    // $ANTLR start "ruleSetVariant"
    // InternalFeatureLangParser.g:1371:1: ruleSetVariant returns [EObject current=null] : (otherlv_0= With otherlv_1= All otherlv_2= Versions otherlv_3= Of otherlv_4= Variant ( (lv_name_5_0= RULE_ID ) ) ) ;
    public final EObject ruleSetVariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1378:2: ( (otherlv_0= With otherlv_1= All otherlv_2= Versions otherlv_3= Of otherlv_4= Variant ( (lv_name_5_0= RULE_ID ) ) ) )
            // InternalFeatureLangParser.g:1379:2: (otherlv_0= With otherlv_1= All otherlv_2= Versions otherlv_3= Of otherlv_4= Variant ( (lv_name_5_0= RULE_ID ) ) )
            {
            // InternalFeatureLangParser.g:1379:2: (otherlv_0= With otherlv_1= All otherlv_2= Versions otherlv_3= Of otherlv_4= Variant ( (lv_name_5_0= RULE_ID ) ) )
            // InternalFeatureLangParser.g:1380:3: otherlv_0= With otherlv_1= All otherlv_2= Versions otherlv_3= Of otherlv_4= Variant ( (lv_name_5_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,With,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getSetVariantAccess().getWithKeyword_0());
            		
            otherlv_1=(Token)match(input,All,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getSetVariantAccess().getAllKeyword_1());
            		
            otherlv_2=(Token)match(input,Versions,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getSetVariantAccess().getVersionsKeyword_2());
            		
            otherlv_3=(Token)match(input,Of,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getSetVariantAccess().getOfKeyword_3());
            		
            otherlv_4=(Token)match(input,Variant,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getSetVariantAccess().getVariantKeyword_4());
            		
            // InternalFeatureLangParser.g:1400:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalFeatureLangParser.g:1401:4: (lv_name_5_0= RULE_ID )
            {
            // InternalFeatureLangParser.g:1401:4: (lv_name_5_0= RULE_ID )
            // InternalFeatureLangParser.g:1402:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_5_0, grammarAccess.getSetVariantAccess().getNameIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetVariantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
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
    // $ANTLR end "ruleSetVariant"


    // $ANTLR start "entryRuleSetRightOpen"
    // InternalFeatureLangParser.g:1425:1: entryRuleSetRightOpen returns [EObject current=null] : iv_ruleSetRightOpen= ruleSetRightOpen EOF ;
    public final EObject entryRuleSetRightOpen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetRightOpen = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1427:2: (iv_ruleSetRightOpen= ruleSetRightOpen EOF )
            // InternalFeatureLangParser.g:1428:2: iv_ruleSetRightOpen= ruleSetRightOpen EOF
            {
             newCompositeNode(grammarAccess.getSetRightOpenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetRightOpen=ruleSetRightOpen();

            state._fsp--;

             current =iv_ruleSetRightOpen; 
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
    // $ANTLR end "entryRuleSetRightOpen"


    // $ANTLR start "ruleSetRightOpen"
    // InternalFeatureLangParser.g:1437:1: ruleSetRightOpen returns [EObject current=null] : (otherlv_0= Up otherlv_1= To otherlv_2= Date ( (lv_date_3_0= RULE_ID ) ) ) ;
    public final EObject ruleSetRightOpen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_date_3_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1444:2: ( (otherlv_0= Up otherlv_1= To otherlv_2= Date ( (lv_date_3_0= RULE_ID ) ) ) )
            // InternalFeatureLangParser.g:1445:2: (otherlv_0= Up otherlv_1= To otherlv_2= Date ( (lv_date_3_0= RULE_ID ) ) )
            {
            // InternalFeatureLangParser.g:1445:2: (otherlv_0= Up otherlv_1= To otherlv_2= Date ( (lv_date_3_0= RULE_ID ) ) )
            // InternalFeatureLangParser.g:1446:3: otherlv_0= Up otherlv_1= To otherlv_2= Date ( (lv_date_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Up,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getSetRightOpenAccess().getUpKeyword_0());
            		
            otherlv_1=(Token)match(input,To,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getSetRightOpenAccess().getToKeyword_1());
            		
            otherlv_2=(Token)match(input,Date,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getSetRightOpenAccess().getDateKeyword_2());
            		
            // InternalFeatureLangParser.g:1458:3: ( (lv_date_3_0= RULE_ID ) )
            // InternalFeatureLangParser.g:1459:4: (lv_date_3_0= RULE_ID )
            {
            // InternalFeatureLangParser.g:1459:4: (lv_date_3_0= RULE_ID )
            // InternalFeatureLangParser.g:1460:5: lv_date_3_0= RULE_ID
            {
            lv_date_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_date_3_0, grammarAccess.getSetRightOpenAccess().getDateIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetRightOpenRule());
            					}
            					setWithLastConsumed(
            						current,
            						"date",
            						lv_date_3_0,
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
    // $ANTLR end "ruleSetRightOpen"


    // $ANTLR start "entryRuleSetLeftOpen"
    // InternalFeatureLangParser.g:1483:1: entryRuleSetLeftOpen returns [EObject current=null] : iv_ruleSetLeftOpen= ruleSetLeftOpen EOF ;
    public final EObject entryRuleSetLeftOpen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetLeftOpen = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1485:2: (iv_ruleSetLeftOpen= ruleSetLeftOpen EOF )
            // InternalFeatureLangParser.g:1486:2: iv_ruleSetLeftOpen= ruleSetLeftOpen EOF
            {
             newCompositeNode(grammarAccess.getSetLeftOpenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetLeftOpen=ruleSetLeftOpen();

            state._fsp--;

             current =iv_ruleSetLeftOpen; 
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
    // $ANTLR end "entryRuleSetLeftOpen"


    // $ANTLR start "ruleSetLeftOpen"
    // InternalFeatureLangParser.g:1495:1: ruleSetLeftOpen returns [EObject current=null] : (otherlv_0= Starting otherlv_1= From otherlv_2= Date ( (lv_date_3_0= RULE_ID ) ) ) ;
    public final EObject ruleSetLeftOpen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_date_3_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1502:2: ( (otherlv_0= Starting otherlv_1= From otherlv_2= Date ( (lv_date_3_0= RULE_ID ) ) ) )
            // InternalFeatureLangParser.g:1503:2: (otherlv_0= Starting otherlv_1= From otherlv_2= Date ( (lv_date_3_0= RULE_ID ) ) )
            {
            // InternalFeatureLangParser.g:1503:2: (otherlv_0= Starting otherlv_1= From otherlv_2= Date ( (lv_date_3_0= RULE_ID ) ) )
            // InternalFeatureLangParser.g:1504:3: otherlv_0= Starting otherlv_1= From otherlv_2= Date ( (lv_date_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Starting,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getSetLeftOpenAccess().getStartingKeyword_0());
            		
            otherlv_1=(Token)match(input,From,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getSetLeftOpenAccess().getFromKeyword_1());
            		
            otherlv_2=(Token)match(input,Date,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getSetLeftOpenAccess().getDateKeyword_2());
            		
            // InternalFeatureLangParser.g:1516:3: ( (lv_date_3_0= RULE_ID ) )
            // InternalFeatureLangParser.g:1517:4: (lv_date_3_0= RULE_ID )
            {
            // InternalFeatureLangParser.g:1517:4: (lv_date_3_0= RULE_ID )
            // InternalFeatureLangParser.g:1518:5: lv_date_3_0= RULE_ID
            {
            lv_date_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_date_3_0, grammarAccess.getSetLeftOpenAccess().getDateIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetLeftOpenRule());
            					}
            					setWithLastConsumed(
            						current,
            						"date",
            						lv_date_3_0,
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
    // $ANTLR end "ruleSetLeftOpen"


    // $ANTLR start "entryRuleInheritanceAction"
    // InternalFeatureLangParser.g:1541:1: entryRuleInheritanceAction returns [EObject current=null] : iv_ruleInheritanceAction= ruleInheritanceAction EOF ;
    public final EObject entryRuleInheritanceAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInheritanceAction = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1543:2: (iv_ruleInheritanceAction= ruleInheritanceAction EOF )
            // InternalFeatureLangParser.g:1544:2: iv_ruleInheritanceAction= ruleInheritanceAction EOF
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
    // InternalFeatureLangParser.g:1553:1: ruleInheritanceAction returns [EObject current=null] : ( ( (lv_create_0_0= ruleCreateInheritance ) ) | ( (lv_edit_1_0= ruleEditInheritance ) ) ) ;
    public final EObject ruleInheritanceAction() throws RecognitionException {
        EObject current = null;

        EObject lv_create_0_0 = null;

        EObject lv_edit_1_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1560:2: ( ( ( (lv_create_0_0= ruleCreateInheritance ) ) | ( (lv_edit_1_0= ruleEditInheritance ) ) ) )
            // InternalFeatureLangParser.g:1561:2: ( ( (lv_create_0_0= ruleCreateInheritance ) ) | ( (lv_edit_1_0= ruleEditInheritance ) ) )
            {
            // InternalFeatureLangParser.g:1561:2: ( ( (lv_create_0_0= ruleCreateInheritance ) ) | ( (lv_edit_1_0= ruleEditInheritance ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Inherit) ) {
                alt22=1;
            }
            else if ( (LA22_0==Have) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalFeatureLangParser.g:1562:3: ( (lv_create_0_0= ruleCreateInheritance ) )
                    {
                    // InternalFeatureLangParser.g:1562:3: ( (lv_create_0_0= ruleCreateInheritance ) )
                    // InternalFeatureLangParser.g:1563:4: (lv_create_0_0= ruleCreateInheritance )
                    {
                    // InternalFeatureLangParser.g:1563:4: (lv_create_0_0= ruleCreateInheritance )
                    // InternalFeatureLangParser.g:1564:5: lv_create_0_0= ruleCreateInheritance
                    {

                    					newCompositeNode(grammarAccess.getInheritanceActionAccess().getCreateCreateInheritanceParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_create_0_0=ruleCreateInheritance();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInheritanceActionRule());
                    					}
                    					set(
                    						current,
                    						"create",
                    						lv_create_0_0,
                    						"de.tud.st.featurelang.FeatureLang.CreateInheritance");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1582:3: ( (lv_edit_1_0= ruleEditInheritance ) )
                    {
                    // InternalFeatureLangParser.g:1582:3: ( (lv_edit_1_0= ruleEditInheritance ) )
                    // InternalFeatureLangParser.g:1583:4: (lv_edit_1_0= ruleEditInheritance )
                    {
                    // InternalFeatureLangParser.g:1583:4: (lv_edit_1_0= ruleEditInheritance )
                    // InternalFeatureLangParser.g:1584:5: lv_edit_1_0= ruleEditInheritance
                    {

                    					newCompositeNode(grammarAccess.getInheritanceActionAccess().getEditEditInheritanceParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_edit_1_0=ruleEditInheritance();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInheritanceActionRule());
                    					}
                    					set(
                    						current,
                    						"edit",
                    						lv_edit_1_0,
                    						"de.tud.st.featurelang.FeatureLang.EditInheritance");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleInheritanceAction"


    // $ANTLR start "entryRuleCreateInheritance"
    // InternalFeatureLangParser.g:1608:1: entryRuleCreateInheritance returns [EObject current=null] : iv_ruleCreateInheritance= ruleCreateInheritance EOF ;
    public final EObject entryRuleCreateInheritance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateInheritance = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1610:2: (iv_ruleCreateInheritance= ruleCreateInheritance EOF )
            // InternalFeatureLangParser.g:1611:2: iv_ruleCreateInheritance= ruleCreateInheritance EOF
            {
             newCompositeNode(grammarAccess.getCreateInheritanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateInheritance=ruleCreateInheritance();

            state._fsp--;

             current =iv_ruleCreateInheritance; 
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
    // $ANTLR end "entryRuleCreateInheritance"


    // $ANTLR start "ruleCreateInheritance"
    // InternalFeatureLangParser.g:1620:1: ruleCreateInheritance returns [EObject current=null] : (otherlv_0= Inherit otherlv_1= From ( (lv_parent_2_0= ruleClass ) ) ) ;
    public final EObject ruleCreateInheritance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_parent_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1627:2: ( (otherlv_0= Inherit otherlv_1= From ( (lv_parent_2_0= ruleClass ) ) ) )
            // InternalFeatureLangParser.g:1628:2: (otherlv_0= Inherit otherlv_1= From ( (lv_parent_2_0= ruleClass ) ) )
            {
            // InternalFeatureLangParser.g:1628:2: (otherlv_0= Inherit otherlv_1= From ( (lv_parent_2_0= ruleClass ) ) )
            // InternalFeatureLangParser.g:1629:3: otherlv_0= Inherit otherlv_1= From ( (lv_parent_2_0= ruleClass ) )
            {
            otherlv_0=(Token)match(input,Inherit,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateInheritanceAccess().getInheritKeyword_0());
            		
            otherlv_1=(Token)match(input,From,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getCreateInheritanceAccess().getFromKeyword_1());
            		
            // InternalFeatureLangParser.g:1637:3: ( (lv_parent_2_0= ruleClass ) )
            // InternalFeatureLangParser.g:1638:4: (lv_parent_2_0= ruleClass )
            {
            // InternalFeatureLangParser.g:1638:4: (lv_parent_2_0= ruleClass )
            // InternalFeatureLangParser.g:1639:5: lv_parent_2_0= ruleClass
            {

            					newCompositeNode(grammarAccess.getCreateInheritanceAccess().getParentClassParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_parent_2_0=ruleClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreateInheritanceRule());
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
    // $ANTLR end "ruleCreateInheritance"


    // $ANTLR start "entryRuleEditInheritance"
    // InternalFeatureLangParser.g:1663:1: entryRuleEditInheritance returns [EObject current=null] : iv_ruleEditInheritance= ruleEditInheritance EOF ;
    public final EObject entryRuleEditInheritance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEditInheritance = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1665:2: (iv_ruleEditInheritance= ruleEditInheritance EOF )
            // InternalFeatureLangParser.g:1666:2: iv_ruleEditInheritance= ruleEditInheritance EOF
            {
             newCompositeNode(grammarAccess.getEditInheritanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEditInheritance=ruleEditInheritance();

            state._fsp--;

             current =iv_ruleEditInheritance; 
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
    // $ANTLR end "entryRuleEditInheritance"


    // $ANTLR start "ruleEditInheritance"
    // InternalFeatureLangParser.g:1675:1: ruleEditInheritance returns [EObject current=null] : (otherlv_0= Have otherlv_1= Inheritance otherlv_2= URI ( (lv_uri_3_0= RULE_ID ) ) ) ;
    public final EObject ruleEditInheritance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_uri_3_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1682:2: ( (otherlv_0= Have otherlv_1= Inheritance otherlv_2= URI ( (lv_uri_3_0= RULE_ID ) ) ) )
            // InternalFeatureLangParser.g:1683:2: (otherlv_0= Have otherlv_1= Inheritance otherlv_2= URI ( (lv_uri_3_0= RULE_ID ) ) )
            {
            // InternalFeatureLangParser.g:1683:2: (otherlv_0= Have otherlv_1= Inheritance otherlv_2= URI ( (lv_uri_3_0= RULE_ID ) ) )
            // InternalFeatureLangParser.g:1684:3: otherlv_0= Have otherlv_1= Inheritance otherlv_2= URI ( (lv_uri_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Have,FOLLOW_41); 

            			newLeafNode(otherlv_0, grammarAccess.getEditInheritanceAccess().getHaveKeyword_0());
            		
            otherlv_1=(Token)match(input,Inheritance,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getEditInheritanceAccess().getInheritanceKeyword_1());
            		
            otherlv_2=(Token)match(input,URI,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getEditInheritanceAccess().getURIKeyword_2());
            		
            // InternalFeatureLangParser.g:1696:3: ( (lv_uri_3_0= RULE_ID ) )
            // InternalFeatureLangParser.g:1697:4: (lv_uri_3_0= RULE_ID )
            {
            // InternalFeatureLangParser.g:1697:4: (lv_uri_3_0= RULE_ID )
            // InternalFeatureLangParser.g:1698:5: lv_uri_3_0= RULE_ID
            {
            lv_uri_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_uri_3_0, grammarAccess.getEditInheritanceAccess().getUriIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEditInheritanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"uri",
            						lv_uri_3_0,
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
    // $ANTLR end "ruleEditInheritance"


    // $ANTLR start "entryRuleCompositionAction"
    // InternalFeatureLangParser.g:1721:1: entryRuleCompositionAction returns [EObject current=null] : iv_ruleCompositionAction= ruleCompositionAction EOF ;
    public final EObject entryRuleCompositionAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionAction = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1723:2: (iv_ruleCompositionAction= ruleCompositionAction EOF )
            // InternalFeatureLangParser.g:1724:2: iv_ruleCompositionAction= ruleCompositionAction EOF
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
    // InternalFeatureLangParser.g:1733:1: ruleCompositionAction returns [EObject current=null] : ( ( (lv_create_0_0= ruleCreateComposition ) ) | ( (lv_edit_1_0= ruleEditComposition ) ) ) ;
    public final EObject ruleCompositionAction() throws RecognitionException {
        EObject current = null;

        EObject lv_create_0_0 = null;

        EObject lv_edit_1_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1740:2: ( ( ( (lv_create_0_0= ruleCreateComposition ) ) | ( (lv_edit_1_0= ruleEditComposition ) ) ) )
            // InternalFeatureLangParser.g:1741:2: ( ( (lv_create_0_0= ruleCreateComposition ) ) | ( (lv_edit_1_0= ruleEditComposition ) ) )
            {
            // InternalFeatureLangParser.g:1741:2: ( ( (lv_create_0_0= ruleCreateComposition ) ) | ( (lv_edit_1_0= ruleEditComposition ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Compose) ) {
                alt23=1;
            }
            else if ( (LA23_0==Have) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalFeatureLangParser.g:1742:3: ( (lv_create_0_0= ruleCreateComposition ) )
                    {
                    // InternalFeatureLangParser.g:1742:3: ( (lv_create_0_0= ruleCreateComposition ) )
                    // InternalFeatureLangParser.g:1743:4: (lv_create_0_0= ruleCreateComposition )
                    {
                    // InternalFeatureLangParser.g:1743:4: (lv_create_0_0= ruleCreateComposition )
                    // InternalFeatureLangParser.g:1744:5: lv_create_0_0= ruleCreateComposition
                    {

                    					newCompositeNode(grammarAccess.getCompositionActionAccess().getCreateCreateCompositionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_create_0_0=ruleCreateComposition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCompositionActionRule());
                    					}
                    					set(
                    						current,
                    						"create",
                    						lv_create_0_0,
                    						"de.tud.st.featurelang.FeatureLang.CreateComposition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1762:3: ( (lv_edit_1_0= ruleEditComposition ) )
                    {
                    // InternalFeatureLangParser.g:1762:3: ( (lv_edit_1_0= ruleEditComposition ) )
                    // InternalFeatureLangParser.g:1763:4: (lv_edit_1_0= ruleEditComposition )
                    {
                    // InternalFeatureLangParser.g:1763:4: (lv_edit_1_0= ruleEditComposition )
                    // InternalFeatureLangParser.g:1764:5: lv_edit_1_0= ruleEditComposition
                    {

                    					newCompositeNode(grammarAccess.getCompositionActionAccess().getEditEditCompositionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_edit_1_0=ruleEditComposition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCompositionActionRule());
                    					}
                    					set(
                    						current,
                    						"edit",
                    						lv_edit_1_0,
                    						"de.tud.st.featurelang.FeatureLang.EditComposition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCompositionAction"


    // $ANTLR start "entryRuleCreateComposition"
    // InternalFeatureLangParser.g:1788:1: entryRuleCreateComposition returns [EObject current=null] : iv_ruleCreateComposition= ruleCreateComposition EOF ;
    public final EObject entryRuleCreateComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateComposition = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1790:2: (iv_ruleCreateComposition= ruleCreateComposition EOF )
            // InternalFeatureLangParser.g:1791:2: iv_ruleCreateComposition= ruleCreateComposition EOF
            {
             newCompositeNode(grammarAccess.getCreateCompositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateComposition=ruleCreateComposition();

            state._fsp--;

             current =iv_ruleCreateComposition; 
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
    // $ANTLR end "entryRuleCreateComposition"


    // $ANTLR start "ruleCreateComposition"
    // InternalFeatureLangParser.g:1800:1: ruleCreateComposition returns [EObject current=null] : (otherlv_0= Compose ( (lv_target_1_0= ruleClass ) ) otherlv_2= Called ( (lv_relation_3_0= RULE_ID ) ) (otherlv_4= FullStop otherlv_5= It ( (lv_priority_6_0= rulePriority ) ) otherlv_7= Be ( (lv_publicity_8_0= rulePublicity ) ) )? ) ;
    public final EObject ruleCreateComposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_relation_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_target_1_0 = null;

        EObject lv_priority_6_0 = null;

        Enumerator lv_publicity_8_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1807:2: ( (otherlv_0= Compose ( (lv_target_1_0= ruleClass ) ) otherlv_2= Called ( (lv_relation_3_0= RULE_ID ) ) (otherlv_4= FullStop otherlv_5= It ( (lv_priority_6_0= rulePriority ) ) otherlv_7= Be ( (lv_publicity_8_0= rulePublicity ) ) )? ) )
            // InternalFeatureLangParser.g:1808:2: (otherlv_0= Compose ( (lv_target_1_0= ruleClass ) ) otherlv_2= Called ( (lv_relation_3_0= RULE_ID ) ) (otherlv_4= FullStop otherlv_5= It ( (lv_priority_6_0= rulePriority ) ) otherlv_7= Be ( (lv_publicity_8_0= rulePublicity ) ) )? )
            {
            // InternalFeatureLangParser.g:1808:2: (otherlv_0= Compose ( (lv_target_1_0= ruleClass ) ) otherlv_2= Called ( (lv_relation_3_0= RULE_ID ) ) (otherlv_4= FullStop otherlv_5= It ( (lv_priority_6_0= rulePriority ) ) otherlv_7= Be ( (lv_publicity_8_0= rulePublicity ) ) )? )
            // InternalFeatureLangParser.g:1809:3: otherlv_0= Compose ( (lv_target_1_0= ruleClass ) ) otherlv_2= Called ( (lv_relation_3_0= RULE_ID ) ) (otherlv_4= FullStop otherlv_5= It ( (lv_priority_6_0= rulePriority ) ) otherlv_7= Be ( (lv_publicity_8_0= rulePublicity ) ) )?
            {
            otherlv_0=(Token)match(input,Compose,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateCompositionAccess().getComposeKeyword_0());
            		
            // InternalFeatureLangParser.g:1813:3: ( (lv_target_1_0= ruleClass ) )
            // InternalFeatureLangParser.g:1814:4: (lv_target_1_0= ruleClass )
            {
            // InternalFeatureLangParser.g:1814:4: (lv_target_1_0= ruleClass )
            // InternalFeatureLangParser.g:1815:5: lv_target_1_0= ruleClass
            {

            					newCompositeNode(grammarAccess.getCreateCompositionAccess().getTargetClassParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
            lv_target_1_0=ruleClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreateCompositionRule());
            					}
            					set(
            						current,
            						"target",
            						lv_target_1_0,
            						"de.tud.st.featurelang.FeatureLang.Class");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Called,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getCreateCompositionAccess().getCalledKeyword_2());
            		
            // InternalFeatureLangParser.g:1836:3: ( (lv_relation_3_0= RULE_ID ) )
            // InternalFeatureLangParser.g:1837:4: (lv_relation_3_0= RULE_ID )
            {
            // InternalFeatureLangParser.g:1837:4: (lv_relation_3_0= RULE_ID )
            // InternalFeatureLangParser.g:1838:5: lv_relation_3_0= RULE_ID
            {
            lv_relation_3_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_relation_3_0, grammarAccess.getCreateCompositionAccess().getRelationIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCreateCompositionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"relation",
            						lv_relation_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalFeatureLangParser.g:1854:3: (otherlv_4= FullStop otherlv_5= It ( (lv_priority_6_0= rulePriority ) ) otherlv_7= Be ( (lv_publicity_8_0= rulePublicity ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==FullStop) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==It) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // InternalFeatureLangParser.g:1855:4: otherlv_4= FullStop otherlv_5= It ( (lv_priority_6_0= rulePriority ) ) otherlv_7= Be ( (lv_publicity_8_0= rulePublicity ) )
                    {
                    otherlv_4=(Token)match(input,FullStop,FOLLOW_15); 

                    				newLeafNode(otherlv_4, grammarAccess.getCreateCompositionAccess().getFullStopKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,It,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getCreateCompositionAccess().getItKeyword_4_1());
                    			
                    // InternalFeatureLangParser.g:1863:4: ( (lv_priority_6_0= rulePriority ) )
                    // InternalFeatureLangParser.g:1864:5: (lv_priority_6_0= rulePriority )
                    {
                    // InternalFeatureLangParser.g:1864:5: (lv_priority_6_0= rulePriority )
                    // InternalFeatureLangParser.g:1865:6: lv_priority_6_0= rulePriority
                    {

                    						newCompositeNode(grammarAccess.getCreateCompositionAccess().getPriorityPriorityParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_priority_6_0=rulePriority();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCreateCompositionRule());
                    						}
                    						set(
                    							current,
                    							"priority",
                    							lv_priority_6_0,
                    							"de.tud.st.featurelang.FeatureLang.Priority");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,Be,FOLLOW_44); 

                    				newLeafNode(otherlv_7, grammarAccess.getCreateCompositionAccess().getBeKeyword_4_3());
                    			
                    // InternalFeatureLangParser.g:1886:4: ( (lv_publicity_8_0= rulePublicity ) )
                    // InternalFeatureLangParser.g:1887:5: (lv_publicity_8_0= rulePublicity )
                    {
                    // InternalFeatureLangParser.g:1887:5: (lv_publicity_8_0= rulePublicity )
                    // InternalFeatureLangParser.g:1888:6: lv_publicity_8_0= rulePublicity
                    {

                    						newCompositeNode(grammarAccess.getCreateCompositionAccess().getPublicityPublicityEnumRuleCall_4_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_publicity_8_0=rulePublicity();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCreateCompositionRule());
                    						}
                    						set(
                    							current,
                    							"publicity",
                    							lv_publicity_8_0,
                    							"de.tud.st.featurelang.FeatureLang.Publicity");
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
    // $ANTLR end "ruleCreateComposition"


    // $ANTLR start "entryRuleEditComposition"
    // InternalFeatureLangParser.g:1913:1: entryRuleEditComposition returns [EObject current=null] : iv_ruleEditComposition= ruleEditComposition EOF ;
    public final EObject entryRuleEditComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEditComposition = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1915:2: (iv_ruleEditComposition= ruleEditComposition EOF )
            // InternalFeatureLangParser.g:1916:2: iv_ruleEditComposition= ruleEditComposition EOF
            {
             newCompositeNode(grammarAccess.getEditCompositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEditComposition=ruleEditComposition();

            state._fsp--;

             current =iv_ruleEditComposition; 
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
    // $ANTLR end "entryRuleEditComposition"


    // $ANTLR start "ruleEditComposition"
    // InternalFeatureLangParser.g:1925:1: ruleEditComposition returns [EObject current=null] : (otherlv_0= Have otherlv_1= Composition ( (lv_compositionName_2_0= RULE_ID ) ) otherlv_3= With ( (lv_parameter_4_0= ruleCompositionParameter ) ) ( (lv_name_5_0= RULE_ID ) ) ) ;
    public final EObject ruleEditComposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_compositionName_2_0=null;
        Token otherlv_3=null;
        Token lv_name_5_0=null;
        Enumerator lv_parameter_4_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1932:2: ( (otherlv_0= Have otherlv_1= Composition ( (lv_compositionName_2_0= RULE_ID ) ) otherlv_3= With ( (lv_parameter_4_0= ruleCompositionParameter ) ) ( (lv_name_5_0= RULE_ID ) ) ) )
            // InternalFeatureLangParser.g:1933:2: (otherlv_0= Have otherlv_1= Composition ( (lv_compositionName_2_0= RULE_ID ) ) otherlv_3= With ( (lv_parameter_4_0= ruleCompositionParameter ) ) ( (lv_name_5_0= RULE_ID ) ) )
            {
            // InternalFeatureLangParser.g:1933:2: (otherlv_0= Have otherlv_1= Composition ( (lv_compositionName_2_0= RULE_ID ) ) otherlv_3= With ( (lv_parameter_4_0= ruleCompositionParameter ) ) ( (lv_name_5_0= RULE_ID ) ) )
            // InternalFeatureLangParser.g:1934:3: otherlv_0= Have otherlv_1= Composition ( (lv_compositionName_2_0= RULE_ID ) ) otherlv_3= With ( (lv_parameter_4_0= ruleCompositionParameter ) ) ( (lv_name_5_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Have,FOLLOW_45); 

            			newLeafNode(otherlv_0, grammarAccess.getEditCompositionAccess().getHaveKeyword_0());
            		
            otherlv_1=(Token)match(input,Composition,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getEditCompositionAccess().getCompositionKeyword_1());
            		
            // InternalFeatureLangParser.g:1942:3: ( (lv_compositionName_2_0= RULE_ID ) )
            // InternalFeatureLangParser.g:1943:4: (lv_compositionName_2_0= RULE_ID )
            {
            // InternalFeatureLangParser.g:1943:4: (lv_compositionName_2_0= RULE_ID )
            // InternalFeatureLangParser.g:1944:5: lv_compositionName_2_0= RULE_ID
            {
            lv_compositionName_2_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(lv_compositionName_2_0, grammarAccess.getEditCompositionAccess().getCompositionNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEditCompositionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"compositionName",
            						lv_compositionName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,With,FOLLOW_46); 

            			newLeafNode(otherlv_3, grammarAccess.getEditCompositionAccess().getWithKeyword_3());
            		
            // InternalFeatureLangParser.g:1964:3: ( (lv_parameter_4_0= ruleCompositionParameter ) )
            // InternalFeatureLangParser.g:1965:4: (lv_parameter_4_0= ruleCompositionParameter )
            {
            // InternalFeatureLangParser.g:1965:4: (lv_parameter_4_0= ruleCompositionParameter )
            // InternalFeatureLangParser.g:1966:5: lv_parameter_4_0= ruleCompositionParameter
            {

            					newCompositeNode(grammarAccess.getEditCompositionAccess().getParameterCompositionParameterEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_21);
            lv_parameter_4_0=ruleCompositionParameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEditCompositionRule());
            					}
            					set(
            						current,
            						"parameter",
            						lv_parameter_4_0,
            						"de.tud.st.featurelang.FeatureLang.CompositionParameter");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFeatureLangParser.g:1983:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalFeatureLangParser.g:1984:4: (lv_name_5_0= RULE_ID )
            {
            // InternalFeatureLangParser.g:1984:4: (lv_name_5_0= RULE_ID )
            // InternalFeatureLangParser.g:1985:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_5_0, grammarAccess.getEditCompositionAccess().getNameIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEditCompositionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
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
    // $ANTLR end "ruleEditComposition"


    // $ANTLR start "entryRuleClass"
    // InternalFeatureLangParser.g:2008:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:2010:2: (iv_ruleClass= ruleClass EOF )
            // InternalFeatureLangParser.g:2011:2: iv_ruleClass= ruleClass EOF
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
    // InternalFeatureLangParser.g:2020:1: ruleClass returns [EObject current=null] : ( (otherlv_0= The | otherlv_1= A )? ( (lv_abstract_2_0= ruleAbstraction ) )? (otherlv_3= Class )? ( (lv_name_4_0= RULE_ID ) ) ) ;
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
            // InternalFeatureLangParser.g:2027:2: ( ( (otherlv_0= The | otherlv_1= A )? ( (lv_abstract_2_0= ruleAbstraction ) )? (otherlv_3= Class )? ( (lv_name_4_0= RULE_ID ) ) ) )
            // InternalFeatureLangParser.g:2028:2: ( (otherlv_0= The | otherlv_1= A )? ( (lv_abstract_2_0= ruleAbstraction ) )? (otherlv_3= Class )? ( (lv_name_4_0= RULE_ID ) ) )
            {
            // InternalFeatureLangParser.g:2028:2: ( (otherlv_0= The | otherlv_1= A )? ( (lv_abstract_2_0= ruleAbstraction ) )? (otherlv_3= Class )? ( (lv_name_4_0= RULE_ID ) ) )
            // InternalFeatureLangParser.g:2029:3: (otherlv_0= The | otherlv_1= A )? ( (lv_abstract_2_0= ruleAbstraction ) )? (otherlv_3= Class )? ( (lv_name_4_0= RULE_ID ) )
            {
            // InternalFeatureLangParser.g:2029:3: (otherlv_0= The | otherlv_1= A )?
            int alt25=3;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==The) ) {
                alt25=1;
            }
            else if ( (LA25_0==A) ) {
                alt25=2;
            }
            switch (alt25) {
                case 1 :
                    // InternalFeatureLangParser.g:2030:4: otherlv_0= The
                    {
                    otherlv_0=(Token)match(input,The,FOLLOW_47); 

                    				newLeafNode(otherlv_0, grammarAccess.getClassAccess().getTheKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:2035:4: otherlv_1= A
                    {
                    otherlv_1=(Token)match(input,A,FOLLOW_47); 

                    				newLeafNode(otherlv_1, grammarAccess.getClassAccess().getAKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalFeatureLangParser.g:2040:3: ( (lv_abstract_2_0= ruleAbstraction ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Abstract) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalFeatureLangParser.g:2041:4: (lv_abstract_2_0= ruleAbstraction )
                    {
                    // InternalFeatureLangParser.g:2041:4: (lv_abstract_2_0= ruleAbstraction )
                    // InternalFeatureLangParser.g:2042:5: lv_abstract_2_0= ruleAbstraction
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getAbstractAbstractionEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_48);
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

            // InternalFeatureLangParser.g:2059:3: (otherlv_3= Class )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Class) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalFeatureLangParser.g:2060:4: otherlv_3= Class
                    {
                    otherlv_3=(Token)match(input,Class,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getClassAccess().getClassKeyword_2());
                    			

                    }
                    break;

            }

            // InternalFeatureLangParser.g:2065:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalFeatureLangParser.g:2066:4: (lv_name_4_0= RULE_ID )
            {
            // InternalFeatureLangParser.g:2066:4: (lv_name_4_0= RULE_ID )
            // InternalFeatureLangParser.g:2067:5: lv_name_4_0= RULE_ID
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
    // InternalFeatureLangParser.g:2090:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:2092:2: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalFeatureLangParser.g:2093:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalFeatureLangParser.g:2102:1: ruleAttribute returns [EObject current=null] : ( (otherlv_0= Attribute )? ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:2109:2: ( ( (otherlv_0= Attribute )? ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalFeatureLangParser.g:2110:2: ( (otherlv_0= Attribute )? ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalFeatureLangParser.g:2110:2: ( (otherlv_0= Attribute )? ( (lv_name_1_0= RULE_ID ) ) )
            // InternalFeatureLangParser.g:2111:3: (otherlv_0= Attribute )? ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalFeatureLangParser.g:2111:3: (otherlv_0= Attribute )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Attribute) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalFeatureLangParser.g:2112:4: otherlv_0= Attribute
                    {
                    otherlv_0=(Token)match(input,Attribute,FOLLOW_21); 

                    				newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
                    			

                    }
                    break;

            }

            // InternalFeatureLangParser.g:2117:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFeatureLangParser.g:2118:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFeatureLangParser.g:2118:4: (lv_name_1_0= RULE_ID )
            // InternalFeatureLangParser.g:2119:5: lv_name_1_0= RULE_ID
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
    // InternalFeatureLangParser.g:2142:1: entryRuleIdentifier returns [EObject current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final EObject entryRuleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifier = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:2144:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // InternalFeatureLangParser.g:2145:2: iv_ruleIdentifier= ruleIdentifier EOF
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
    // InternalFeatureLangParser.g:2154:1: ruleIdentifier returns [EObject current=null] : ( ( (lv_value_0_0= ruleIdentifierValue ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleIdentifier() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_value_0_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:2161:2: ( ( ( (lv_value_0_0= ruleIdentifierValue ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalFeatureLangParser.g:2162:2: ( ( (lv_value_0_0= ruleIdentifierValue ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalFeatureLangParser.g:2162:2: ( ( (lv_value_0_0= ruleIdentifierValue ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalFeatureLangParser.g:2163:3: ( (lv_value_0_0= ruleIdentifierValue ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalFeatureLangParser.g:2163:3: ( (lv_value_0_0= ruleIdentifierValue ) )
            // InternalFeatureLangParser.g:2164:4: (lv_value_0_0= ruleIdentifierValue )
            {
            // InternalFeatureLangParser.g:2164:4: (lv_value_0_0= ruleIdentifierValue )
            // InternalFeatureLangParser.g:2165:5: lv_value_0_0= ruleIdentifierValue
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

            // InternalFeatureLangParser.g:2182:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFeatureLangParser.g:2183:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFeatureLangParser.g:2183:4: (lv_name_1_0= RULE_ID )
            // InternalFeatureLangParser.g:2184:5: lv_name_1_0= RULE_ID
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
    // InternalFeatureLangParser.g:2207:1: entryRulePriority returns [EObject current=null] : iv_rulePriority= rulePriority EOF ;
    public final EObject entryRulePriority() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePriority = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:2209:2: (iv_rulePriority= rulePriority EOF )
            // InternalFeatureLangParser.g:2210:2: iv_rulePriority= rulePriority EOF
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
    // InternalFeatureLangParser.g:2219:1: rulePriority returns [EObject current=null] : ( (lv_priority_0_0= rulePriorityValue ) ) ;
    public final EObject rulePriority() throws RecognitionException {
        EObject current = null;

        Enumerator lv_priority_0_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:2226:2: ( ( (lv_priority_0_0= rulePriorityValue ) ) )
            // InternalFeatureLangParser.g:2227:2: ( (lv_priority_0_0= rulePriorityValue ) )
            {
            // InternalFeatureLangParser.g:2227:2: ( (lv_priority_0_0= rulePriorityValue ) )
            // InternalFeatureLangParser.g:2228:3: (lv_priority_0_0= rulePriorityValue )
            {
            // InternalFeatureLangParser.g:2228:3: (lv_priority_0_0= rulePriorityValue )
            // InternalFeatureLangParser.g:2229:4: lv_priority_0_0= rulePriorityValue
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


    // $ANTLR start "ruleCompositionParameter"
    // InternalFeatureLangParser.g:2252:1: ruleCompositionParameter returns [Enumerator current=null] : ( (enumLiteral_0= URI ) | (enumLiteral_1= Role ) | (enumLiteral_2= Target ) ) ;
    public final Enumerator ruleCompositionParameter() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalFeatureLangParser.g:2258:2: ( ( (enumLiteral_0= URI ) | (enumLiteral_1= Role ) | (enumLiteral_2= Target ) ) )
            // InternalFeatureLangParser.g:2259:2: ( (enumLiteral_0= URI ) | (enumLiteral_1= Role ) | (enumLiteral_2= Target ) )
            {
            // InternalFeatureLangParser.g:2259:2: ( (enumLiteral_0= URI ) | (enumLiteral_1= Role ) | (enumLiteral_2= Target ) )
            int alt29=3;
            switch ( input.LA(1) ) {
            case URI:
                {
                alt29=1;
                }
                break;
            case Role:
                {
                alt29=2;
                }
                break;
            case Target:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalFeatureLangParser.g:2260:3: (enumLiteral_0= URI )
                    {
                    // InternalFeatureLangParser.g:2260:3: (enumLiteral_0= URI )
                    // InternalFeatureLangParser.g:2261:4: enumLiteral_0= URI
                    {
                    enumLiteral_0=(Token)match(input,URI,FOLLOW_2); 

                    				current = grammarAccess.getCompositionParameterAccess().getURIEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCompositionParameterAccess().getURIEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:2268:3: (enumLiteral_1= Role )
                    {
                    // InternalFeatureLangParser.g:2268:3: (enumLiteral_1= Role )
                    // InternalFeatureLangParser.g:2269:4: enumLiteral_1= Role
                    {
                    enumLiteral_1=(Token)match(input,Role,FOLLOW_2); 

                    				current = grammarAccess.getCompositionParameterAccess().getROLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCompositionParameterAccess().getROLEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureLangParser.g:2276:3: (enumLiteral_2= Target )
                    {
                    // InternalFeatureLangParser.g:2276:3: (enumLiteral_2= Target )
                    // InternalFeatureLangParser.g:2277:4: enumLiteral_2= Target
                    {
                    enumLiteral_2=(Token)match(input,Target,FOLLOW_2); 

                    				current = grammarAccess.getCompositionParameterAccess().getTARGETEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCompositionParameterAccess().getTARGETEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleCompositionParameter"


    // $ANTLR start "rulePublicity"
    // InternalFeatureLangParser.g:2287:1: rulePublicity returns [Enumerator current=null] : ( (enumLiteral_0= Public ) | (enumLiteral_1= Private ) ) ;
    public final Enumerator rulePublicity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFeatureLangParser.g:2293:2: ( ( (enumLiteral_0= Public ) | (enumLiteral_1= Private ) ) )
            // InternalFeatureLangParser.g:2294:2: ( (enumLiteral_0= Public ) | (enumLiteral_1= Private ) )
            {
            // InternalFeatureLangParser.g:2294:2: ( (enumLiteral_0= Public ) | (enumLiteral_1= Private ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Public) ) {
                alt30=1;
            }
            else if ( (LA30_0==Private) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalFeatureLangParser.g:2295:3: (enumLiteral_0= Public )
                    {
                    // InternalFeatureLangParser.g:2295:3: (enumLiteral_0= Public )
                    // InternalFeatureLangParser.g:2296:4: enumLiteral_0= Public
                    {
                    enumLiteral_0=(Token)match(input,Public,FOLLOW_2); 

                    				current = grammarAccess.getPublicityAccess().getPUBLICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPublicityAccess().getPUBLICEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:2303:3: (enumLiteral_1= Private )
                    {
                    // InternalFeatureLangParser.g:2303:3: (enumLiteral_1= Private )
                    // InternalFeatureLangParser.g:2304:4: enumLiteral_1= Private
                    {
                    enumLiteral_1=(Token)match(input,Private,FOLLOW_2); 

                    				current = grammarAccess.getPublicityAccess().getPRIVATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPublicityAccess().getPRIVATEEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "rulePublicity"


    // $ANTLR start "rulePriorityValue"
    // InternalFeatureLangParser.g:2314:1: rulePriorityValue returns [Enumerator current=null] : ( (enumLiteral_0= Should ) | (enumLiteral_1= Must ) ) ;
    public final Enumerator rulePriorityValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFeatureLangParser.g:2320:2: ( ( (enumLiteral_0= Should ) | (enumLiteral_1= Must ) ) )
            // InternalFeatureLangParser.g:2321:2: ( (enumLiteral_0= Should ) | (enumLiteral_1= Must ) )
            {
            // InternalFeatureLangParser.g:2321:2: ( (enumLiteral_0= Should ) | (enumLiteral_1= Must ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Should) ) {
                alt31=1;
            }
            else if ( (LA31_0==Must) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalFeatureLangParser.g:2322:3: (enumLiteral_0= Should )
                    {
                    // InternalFeatureLangParser.g:2322:3: (enumLiteral_0= Should )
                    // InternalFeatureLangParser.g:2323:4: enumLiteral_0= Should
                    {
                    enumLiteral_0=(Token)match(input,Should,FOLLOW_2); 

                    				current = grammarAccess.getPriorityValueAccess().getSHOULDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPriorityValueAccess().getSHOULDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:2330:3: (enumLiteral_1= Must )
                    {
                    // InternalFeatureLangParser.g:2330:3: (enumLiteral_1= Must )
                    // InternalFeatureLangParser.g:2331:4: enumLiteral_1= Must
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
    // InternalFeatureLangParser.g:2341:1: ruleAbstraction returns [Enumerator current=null] : (enumLiteral_0= Abstract ) ;
    public final Enumerator ruleAbstraction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalFeatureLangParser.g:2347:2: ( (enumLiteral_0= Abstract ) )
            // InternalFeatureLangParser.g:2348:2: (enumLiteral_0= Abstract )
            {
            // InternalFeatureLangParser.g:2348:2: (enumLiteral_0= Abstract )
            // InternalFeatureLangParser.g:2349:3: enumLiteral_0= Abstract
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
    // InternalFeatureLangParser.g:2358:1: ruleIdentifierValue returns [Enumerator current=null] : ( (enumLiteral_0= Name ) | (enumLiteral_1= URI ) ) ;
    public final Enumerator ruleIdentifierValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFeatureLangParser.g:2364:2: ( ( (enumLiteral_0= Name ) | (enumLiteral_1= URI ) ) )
            // InternalFeatureLangParser.g:2365:2: ( (enumLiteral_0= Name ) | (enumLiteral_1= URI ) )
            {
            // InternalFeatureLangParser.g:2365:2: ( (enumLiteral_0= Name ) | (enumLiteral_1= URI ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Name) ) {
                alt32=1;
            }
            else if ( (LA32_0==URI) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalFeatureLangParser.g:2366:3: (enumLiteral_0= Name )
                    {
                    // InternalFeatureLangParser.g:2366:3: (enumLiteral_0= Name )
                    // InternalFeatureLangParser.g:2367:4: enumLiteral_0= Name
                    {
                    enumLiteral_0=(Token)match(input,Name,FOLLOW_2); 

                    				current = grammarAccess.getIdentifierValueAccess().getNAMEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getIdentifierValueAccess().getNAMEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:2374:3: (enumLiteral_1= URI )
                    {
                    // InternalFeatureLangParser.g:2374:3: (enumLiteral_1= URI )
                    // InternalFeatureLangParser.g:2375:4: enumLiteral_1= URI
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
    // InternalFeatureLangParser.g:2385:1: ruleDatatype returns [Enumerator current=null] : ( (enumLiteral_0= Time ) | (enumLiteral_1= Phrase ) | (enumLiteral_2= Number ) ) ;
    public final Enumerator ruleDatatype() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalFeatureLangParser.g:2391:2: ( ( (enumLiteral_0= Time ) | (enumLiteral_1= Phrase ) | (enumLiteral_2= Number ) ) )
            // InternalFeatureLangParser.g:2392:2: ( (enumLiteral_0= Time ) | (enumLiteral_1= Phrase ) | (enumLiteral_2= Number ) )
            {
            // InternalFeatureLangParser.g:2392:2: ( (enumLiteral_0= Time ) | (enumLiteral_1= Phrase ) | (enumLiteral_2= Number ) )
            int alt33=3;
            switch ( input.LA(1) ) {
            case Time:
                {
                alt33=1;
                }
                break;
            case Phrase:
                {
                alt33=2;
                }
                break;
            case Number:
                {
                alt33=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalFeatureLangParser.g:2393:3: (enumLiteral_0= Time )
                    {
                    // InternalFeatureLangParser.g:2393:3: (enumLiteral_0= Time )
                    // InternalFeatureLangParser.g:2394:4: enumLiteral_0= Time
                    {
                    enumLiteral_0=(Token)match(input,Time,FOLLOW_2); 

                    				current = grammarAccess.getDatatypeAccess().getWORDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDatatypeAccess().getWORDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:2401:3: (enumLiteral_1= Phrase )
                    {
                    // InternalFeatureLangParser.g:2401:3: (enumLiteral_1= Phrase )
                    // InternalFeatureLangParser.g:2402:4: enumLiteral_1= Phrase
                    {
                    enumLiteral_1=(Token)match(input,Phrase,FOLLOW_2); 

                    				current = grammarAccess.getDatatypeAccess().getPHRASEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDatatypeAccess().getPHRASEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureLangParser.g:2409:3: (enumLiteral_2= Number )
                    {
                    // InternalFeatureLangParser.g:2409:3: (enumLiteral_2= Number )
                    // InternalFeatureLangParser.g:2410:4: enumLiteral_2= Number
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
    static final String dfa_2s = "\3\12\1\31\1\64\1\27\2\16\1\uffff\1\16\1\uffff";
    static final String dfa_3s = "\5\64\1\50\2\54\1\uffff\1\54\1\uffff";
    static final String dfa_4s = "\10\uffff\1\1\1\uffff\1\2";
    static final String dfa_5s = "\13\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\16\uffff\1\4\20\uffff\1\1\10\uffff\1\2\1\5",
            "\1\3\16\uffff\1\4\32\uffff\1\5",
            "\1\3\16\uffff\1\4\32\uffff\1\5",
            "\1\4\32\uffff\1\5",
            "\1\5",
            "\1\6\11\uffff\1\7\6\uffff\1\10",
            "\2\10\12\uffff\1\12\5\uffff\1\10\10\uffff\1\11\2\uffff\1\12",
            "\2\10\12\uffff\1\12\5\uffff\1\10\10\uffff\1\11\2\uffff\1\12",
            "",
            "\2\10\12\uffff\1\12\5\uffff\1\10\13\uffff\1\12",
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0018040002000402L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000010200800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000002010000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000010000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0008084400000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000200800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000120004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000100004000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0008080000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0010000000000A00L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000100100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001000300000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0008000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00080C0000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0011000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0002002000001100L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x001804000A000400L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0018040002000400L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000004801000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0010000002000400L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0010000002000000L});

}