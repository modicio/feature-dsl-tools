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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Associations", "Association", "Composition", "Inheritance", "Compatible", "Attribute", "Abstract", "Existing", "Starting", "Versions", "DEFAULT", "Compose", "Created", "Inherit", "Instead", "Private", "Variant", "Version", "Called", "Change", "Create", "Delete", "Number", "Phrase", "Public", "Remove", "Should", "Class", "Exist", "Other", "Range", "Value", "Date", "From", "Have", "Must", "Name", "That", "Time", "With", "URI", "All", "Has", "New", "Not", "Set", "The", "An", "Be", "In", "Is", "It", "Of", "To", "Up", "CarriageReturn", "FullStop", "A", "RULE_INT", "RULE_DATE", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Delete=25;
    public static final int All=45;
    public static final int New=47;
    public static final int Inheritance=7;
    public static final int Remove=29;
    public static final int Must=39;
    public static final int Name=40;
    public static final int Compose=15;
    public static final int Version=21;
    public static final int Private=19;
    public static final int To=57;
    public static final int Inherit=17;
    public static final int RULE_ID=64;
    public static final int Have=38;
    public static final int Phrase=27;
    public static final int Public=28;
    public static final int Associations=4;
    public static final int Range=34;
    public static final int Variant=20;
    public static final int Not=48;
    public static final int Versions=13;
    public static final int RULE_DATE=63;
    public static final int RULE_INT=62;
    public static final int Starting=12;
    public static final int Value=35;
    public static final int RULE_ML_COMMENT=66;
    public static final int Class=31;
    public static final int Up=58;
    public static final int A=61;
    public static final int Called=22;
    public static final int Should=30;
    public static final int Set=49;
    public static final int Instead=18;
    public static final int Attribute=9;
    public static final int In=53;
    public static final int Time=42;
    public static final int Is=54;
    public static final int RULE_STRING=65;
    public static final int It=55;
    public static final int URI=44;
    public static final int An=51;
    public static final int Created=16;
    public static final int With=43;
    public static final int RULE_SL_COMMENT=67;
    public static final int The=50;
    public static final int Association=5;
    public static final int Exist=32;
    public static final int Number=26;
    public static final int Create=24;
    public static final int CarriageReturn=59;
    public static final int EOF=-1;
    public static final int That=41;
    public static final int FullStop=60;
    public static final int Composition=6;
    public static final int Be=52;
    public static final int RULE_WS=68;
    public static final int Abstract=10;
    public static final int Change=23;
    public static final int From=37;
    public static final int RULE_ANY_OTHER=69;
    public static final int Compatible=8;
    public static final int Date=36;
    public static final int Of=56;
    public static final int Has=46;
    public static final int DEFAULT=14;
    public static final int Existing=11;
    public static final int Other=33;

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

                if ( (LA1_0==Abstract||(LA1_0>=Change && LA1_0<=Delete)||LA1_0==Remove||LA1_0==Class||LA1_0==New||(LA1_0>=Set && LA1_0<=The)||LA1_0==A||LA1_0==RULE_ID) ) {
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
    // InternalFeatureLangParser.g:150:1: ruleChangeStatement returns [EObject current=null] : ( ( ( ( (lv_target_0_0= ruleClass ) ) ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? )? ) | ( (otherlv_3= Set | otherlv_4= Change | ( (lv_negation_5_0= Remove ) ) ) otherlv_6= In ( (lv_target_7_0= ruleClass ) ) ) ) ( ( (lv_action_8_0= ruleAction ) ) | ( (lv_update_9_0= ruleUpdateAction ) ) ) ) ;
    public final EObject ruleChangeStatement() throws RecognitionException {
        EObject current = null;

        Token lv_negation_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_negation_5_0=null;
        Token otherlv_6=null;
        EObject lv_target_0_0 = null;

        EObject lv_priority_1_0 = null;

        EObject lv_target_7_0 = null;

        EObject lv_action_8_0 = null;

        EObject lv_update_9_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:157:2: ( ( ( ( ( (lv_target_0_0= ruleClass ) ) ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? )? ) | ( (otherlv_3= Set | otherlv_4= Change | ( (lv_negation_5_0= Remove ) ) ) otherlv_6= In ( (lv_target_7_0= ruleClass ) ) ) ) ( ( (lv_action_8_0= ruleAction ) ) | ( (lv_update_9_0= ruleUpdateAction ) ) ) ) )
            // InternalFeatureLangParser.g:158:2: ( ( ( ( (lv_target_0_0= ruleClass ) ) ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? )? ) | ( (otherlv_3= Set | otherlv_4= Change | ( (lv_negation_5_0= Remove ) ) ) otherlv_6= In ( (lv_target_7_0= ruleClass ) ) ) ) ( ( (lv_action_8_0= ruleAction ) ) | ( (lv_update_9_0= ruleUpdateAction ) ) ) )
            {
            // InternalFeatureLangParser.g:158:2: ( ( ( ( (lv_target_0_0= ruleClass ) ) ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? )? ) | ( (otherlv_3= Set | otherlv_4= Change | ( (lv_negation_5_0= Remove ) ) ) otherlv_6= In ( (lv_target_7_0= ruleClass ) ) ) ) ( ( (lv_action_8_0= ruleAction ) ) | ( (lv_update_9_0= ruleUpdateAction ) ) ) )
            // InternalFeatureLangParser.g:159:3: ( ( ( (lv_target_0_0= ruleClass ) ) ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? )? ) | ( (otherlv_3= Set | otherlv_4= Change | ( (lv_negation_5_0= Remove ) ) ) otherlv_6= In ( (lv_target_7_0= ruleClass ) ) ) ) ( ( (lv_action_8_0= ruleAction ) ) | ( (lv_update_9_0= ruleUpdateAction ) ) )
            {
            // InternalFeatureLangParser.g:159:3: ( ( ( (lv_target_0_0= ruleClass ) ) ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? )? ) | ( (otherlv_3= Set | otherlv_4= Change | ( (lv_negation_5_0= Remove ) ) ) otherlv_6= In ( (lv_target_7_0= ruleClass ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Abstract||LA7_0==Class||LA7_0==New||LA7_0==The||LA7_0==A||LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==Change||LA7_0==Remove||LA7_0==Set) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalFeatureLangParser.g:160:4: ( ( (lv_target_0_0= ruleClass ) ) ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? )? )
                    {
                    // InternalFeatureLangParser.g:160:4: ( ( (lv_target_0_0= ruleClass ) ) ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? )? )
                    // InternalFeatureLangParser.g:161:5: ( (lv_target_0_0= ruleClass ) ) ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? )?
                    {
                    // InternalFeatureLangParser.g:161:5: ( (lv_target_0_0= ruleClass ) )
                    // InternalFeatureLangParser.g:162:6: (lv_target_0_0= ruleClass )
                    {
                    // InternalFeatureLangParser.g:162:6: (lv_target_0_0= ruleClass )
                    // InternalFeatureLangParser.g:163:7: lv_target_0_0= ruleClass
                    {

                    							newCompositeNode(grammarAccess.getChangeStatementAccess().getTargetClassParserRuleCall_0_0_0_0());
                    						
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

                    // InternalFeatureLangParser.g:180:5: ( ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==Should||LA5_0==Must) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalFeatureLangParser.g:181:6: ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )?
                            {
                            // InternalFeatureLangParser.g:181:6: ( (lv_priority_1_0= rulePriority ) )
                            // InternalFeatureLangParser.g:182:7: (lv_priority_1_0= rulePriority )
                            {
                            // InternalFeatureLangParser.g:182:7: (lv_priority_1_0= rulePriority )
                            // InternalFeatureLangParser.g:183:8: lv_priority_1_0= rulePriority
                            {

                            								newCompositeNode(grammarAccess.getChangeStatementAccess().getPriorityPriorityParserRuleCall_0_0_1_0_0());
                            							
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

                            // InternalFeatureLangParser.g:200:6: ( (lv_negation_2_0= Not ) )?
                            int alt4=2;
                            int LA4_0 = input.LA(1);

                            if ( (LA4_0==Not) ) {
                                alt4=1;
                            }
                            switch (alt4) {
                                case 1 :
                                    // InternalFeatureLangParser.g:201:7: (lv_negation_2_0= Not )
                                    {
                                    // InternalFeatureLangParser.g:201:7: (lv_negation_2_0= Not )
                                    // InternalFeatureLangParser.g:202:8: lv_negation_2_0= Not
                                    {
                                    lv_negation_2_0=(Token)match(input,Not,FOLLOW_5); 

                                    								newLeafNode(lv_negation_2_0, grammarAccess.getChangeStatementAccess().getNegationNotKeyword_0_0_1_1_0());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getChangeStatementRule());
                                    								}
                                    								setWithLastConsumed(current, "negation", lv_negation_2_0 != null, "not");
                                    							

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:217:4: ( (otherlv_3= Set | otherlv_4= Change | ( (lv_negation_5_0= Remove ) ) ) otherlv_6= In ( (lv_target_7_0= ruleClass ) ) )
                    {
                    // InternalFeatureLangParser.g:217:4: ( (otherlv_3= Set | otherlv_4= Change | ( (lv_negation_5_0= Remove ) ) ) otherlv_6= In ( (lv_target_7_0= ruleClass ) ) )
                    // InternalFeatureLangParser.g:218:5: (otherlv_3= Set | otherlv_4= Change | ( (lv_negation_5_0= Remove ) ) ) otherlv_6= In ( (lv_target_7_0= ruleClass ) )
                    {
                    // InternalFeatureLangParser.g:218:5: (otherlv_3= Set | otherlv_4= Change | ( (lv_negation_5_0= Remove ) ) )
                    int alt6=3;
                    switch ( input.LA(1) ) {
                    case Set:
                        {
                        alt6=1;
                        }
                        break;
                    case Change:
                        {
                        alt6=2;
                        }
                        break;
                    case Remove:
                        {
                        alt6=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }

                    switch (alt6) {
                        case 1 :
                            // InternalFeatureLangParser.g:219:6: otherlv_3= Set
                            {
                            otherlv_3=(Token)match(input,Set,FOLLOW_7); 

                            						newLeafNode(otherlv_3, grammarAccess.getChangeStatementAccess().getSetKeyword_0_1_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalFeatureLangParser.g:224:6: otherlv_4= Change
                            {
                            otherlv_4=(Token)match(input,Change,FOLLOW_7); 

                            						newLeafNode(otherlv_4, grammarAccess.getChangeStatementAccess().getChangeKeyword_0_1_0_1());
                            					

                            }
                            break;
                        case 3 :
                            // InternalFeatureLangParser.g:229:6: ( (lv_negation_5_0= Remove ) )
                            {
                            // InternalFeatureLangParser.g:229:6: ( (lv_negation_5_0= Remove ) )
                            // InternalFeatureLangParser.g:230:7: (lv_negation_5_0= Remove )
                            {
                            // InternalFeatureLangParser.g:230:7: (lv_negation_5_0= Remove )
                            // InternalFeatureLangParser.g:231:8: lv_negation_5_0= Remove
                            {
                            lv_negation_5_0=(Token)match(input,Remove,FOLLOW_7); 

                            								newLeafNode(lv_negation_5_0, grammarAccess.getChangeStatementAccess().getNegationRemoveKeyword_0_1_0_2_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getChangeStatementRule());
                            								}
                            								setWithLastConsumed(current, "negation", lv_negation_5_0 != null, "remove");
                            							

                            }


                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,In,FOLLOW_8); 

                    					newLeafNode(otherlv_6, grammarAccess.getChangeStatementAccess().getInKeyword_0_1_1());
                    				
                    // InternalFeatureLangParser.g:248:5: ( (lv_target_7_0= ruleClass ) )
                    // InternalFeatureLangParser.g:249:6: (lv_target_7_0= ruleClass )
                    {
                    // InternalFeatureLangParser.g:249:6: (lv_target_7_0= ruleClass )
                    // InternalFeatureLangParser.g:250:7: lv_target_7_0= ruleClass
                    {

                    							newCompositeNode(grammarAccess.getChangeStatementAccess().getTargetClassParserRuleCall_0_1_2_0());
                    						
                    pushFollow(FOLLOW_5);
                    lv_target_7_0=ruleClass();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getChangeStatementRule());
                    							}
                    							set(
                    								current,
                    								"target",
                    								lv_target_7_0,
                    								"de.tud.st.featurelang.FeatureLang.Class");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalFeatureLangParser.g:269:3: ( ( (lv_action_8_0= ruleAction ) ) | ( (lv_update_9_0= ruleUpdateAction ) ) )
            int alt8=2;
            switch ( input.LA(1) ) {
            case Associations:
            case Association:
            case Composition:
            case Inheritance:
            case Compose:
            case Inherit:
            case Have:
                {
                alt8=1;
                }
                break;
            case The:
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==Existing||LA8_2==Created) ) {
                    alt8=2;
                }
                else if ( (LA8_2==Attribute||LA8_2==RULE_ID) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case An:
                {
                int LA8_3 = input.LA(2);

                if ( (LA8_3==Attribute||LA8_3==RULE_ID) ) {
                    alt8=1;
                }
                else if ( (LA8_3==Existing||LA8_3==Created) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 3, input);

                    throw nvae;
                }
                }
                break;
            case A:
                {
                int LA8_4 = input.LA(2);

                if ( (LA8_4==Attribute||LA8_4==RULE_ID) ) {
                    alt8=1;
                }
                else if ( (LA8_4==Existing||LA8_4==Created) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 4, input);

                    throw nvae;
                }
                }
                break;
            case Has:
                {
                alt8=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalFeatureLangParser.g:270:4: ( (lv_action_8_0= ruleAction ) )
                    {
                    // InternalFeatureLangParser.g:270:4: ( (lv_action_8_0= ruleAction ) )
                    // InternalFeatureLangParser.g:271:5: (lv_action_8_0= ruleAction )
                    {
                    // InternalFeatureLangParser.g:271:5: (lv_action_8_0= ruleAction )
                    // InternalFeatureLangParser.g:272:6: lv_action_8_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getChangeStatementAccess().getActionActionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_action_8_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getChangeStatementRule());
                    						}
                    						set(
                    							current,
                    							"action",
                    							lv_action_8_0,
                    							"de.tud.st.featurelang.FeatureLang.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:290:4: ( (lv_update_9_0= ruleUpdateAction ) )
                    {
                    // InternalFeatureLangParser.g:290:4: ( (lv_update_9_0= ruleUpdateAction ) )
                    // InternalFeatureLangParser.g:291:5: (lv_update_9_0= ruleUpdateAction )
                    {
                    // InternalFeatureLangParser.g:291:5: (lv_update_9_0= ruleUpdateAction )
                    // InternalFeatureLangParser.g:292:6: lv_update_9_0= ruleUpdateAction
                    {

                    						newCompositeNode(grammarAccess.getChangeStatementAccess().getUpdateUpdateActionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_update_9_0=ruleUpdateAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getChangeStatementRule());
                    						}
                    						set(
                    							current,
                    							"update",
                    							lv_update_9_0,
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
    // InternalFeatureLangParser.g:317:1: entryRuleCreationStatement returns [EObject current=null] : iv_ruleCreationStatement= ruleCreationStatement EOF ;
    public final EObject entryRuleCreationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreationStatement = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:319:2: (iv_ruleCreationStatement= ruleCreationStatement EOF )
            // InternalFeatureLangParser.g:320:2: iv_ruleCreationStatement= ruleCreationStatement EOF
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
    // InternalFeatureLangParser.g:329:1: ruleCreationStatement returns [EObject current=null] : ( ( ( (lv_classElement_0_0= ruleClass ) ) ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? (otherlv_3= Exist | otherlv_4= Be ) ) | ( (otherlv_5= Create | ( (lv_negation_6_0= Delete ) ) ) ( (lv_classElement_7_0= ruleClass ) ) ) ) ;
    public final EObject ruleCreationStatement() throws RecognitionException {
        EObject current = null;

        Token lv_negation_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_negation_6_0=null;
        EObject lv_classElement_0_0 = null;

        EObject lv_priority_1_0 = null;

        EObject lv_classElement_7_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:336:2: ( ( ( ( (lv_classElement_0_0= ruleClass ) ) ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? (otherlv_3= Exist | otherlv_4= Be ) ) | ( (otherlv_5= Create | ( (lv_negation_6_0= Delete ) ) ) ( (lv_classElement_7_0= ruleClass ) ) ) ) )
            // InternalFeatureLangParser.g:337:2: ( ( ( (lv_classElement_0_0= ruleClass ) ) ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? (otherlv_3= Exist | otherlv_4= Be ) ) | ( (otherlv_5= Create | ( (lv_negation_6_0= Delete ) ) ) ( (lv_classElement_7_0= ruleClass ) ) ) )
            {
            // InternalFeatureLangParser.g:337:2: ( ( ( (lv_classElement_0_0= ruleClass ) ) ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? (otherlv_3= Exist | otherlv_4= Be ) ) | ( (otherlv_5= Create | ( (lv_negation_6_0= Delete ) ) ) ( (lv_classElement_7_0= ruleClass ) ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Abstract||LA12_0==Class||LA12_0==New||LA12_0==The||LA12_0==A||LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=Create && LA12_0<=Delete)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalFeatureLangParser.g:338:3: ( ( (lv_classElement_0_0= ruleClass ) ) ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? (otherlv_3= Exist | otherlv_4= Be ) )
                    {
                    // InternalFeatureLangParser.g:338:3: ( ( (lv_classElement_0_0= ruleClass ) ) ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? (otherlv_3= Exist | otherlv_4= Be ) )
                    // InternalFeatureLangParser.g:339:4: ( (lv_classElement_0_0= ruleClass ) ) ( (lv_priority_1_0= rulePriority ) ) ( (lv_negation_2_0= Not ) )? (otherlv_3= Exist | otherlv_4= Be )
                    {
                    // InternalFeatureLangParser.g:339:4: ( (lv_classElement_0_0= ruleClass ) )
                    // InternalFeatureLangParser.g:340:5: (lv_classElement_0_0= ruleClass )
                    {
                    // InternalFeatureLangParser.g:340:5: (lv_classElement_0_0= ruleClass )
                    // InternalFeatureLangParser.g:341:6: lv_classElement_0_0= ruleClass
                    {

                    						newCompositeNode(grammarAccess.getCreationStatementAccess().getClassElementClassParserRuleCall_0_0_0());
                    					
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

                    // InternalFeatureLangParser.g:358:4: ( (lv_priority_1_0= rulePriority ) )
                    // InternalFeatureLangParser.g:359:5: (lv_priority_1_0= rulePriority )
                    {
                    // InternalFeatureLangParser.g:359:5: (lv_priority_1_0= rulePriority )
                    // InternalFeatureLangParser.g:360:6: lv_priority_1_0= rulePriority
                    {

                    						newCompositeNode(grammarAccess.getCreationStatementAccess().getPriorityPriorityParserRuleCall_0_1_0());
                    					
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

                    // InternalFeatureLangParser.g:377:4: ( (lv_negation_2_0= Not ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==Not) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalFeatureLangParser.g:378:5: (lv_negation_2_0= Not )
                            {
                            // InternalFeatureLangParser.g:378:5: (lv_negation_2_0= Not )
                            // InternalFeatureLangParser.g:379:6: lv_negation_2_0= Not
                            {
                            lv_negation_2_0=(Token)match(input,Not,FOLLOW_11); 

                            						newLeafNode(lv_negation_2_0, grammarAccess.getCreationStatementAccess().getNegationNotKeyword_0_2_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getCreationStatementRule());
                            						}
                            						setWithLastConsumed(current, "negation", lv_negation_2_0 != null, "not");
                            					

                            }


                            }
                            break;

                    }

                    // InternalFeatureLangParser.g:391:4: (otherlv_3= Exist | otherlv_4= Be )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==Exist) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==Be) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalFeatureLangParser.g:392:5: otherlv_3= Exist
                            {
                            otherlv_3=(Token)match(input,Exist,FOLLOW_2); 

                            					newLeafNode(otherlv_3, grammarAccess.getCreationStatementAccess().getExistKeyword_0_3_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalFeatureLangParser.g:397:5: otherlv_4= Be
                            {
                            otherlv_4=(Token)match(input,Be,FOLLOW_2); 

                            					newLeafNode(otherlv_4, grammarAccess.getCreationStatementAccess().getBeKeyword_0_3_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:404:3: ( (otherlv_5= Create | ( (lv_negation_6_0= Delete ) ) ) ( (lv_classElement_7_0= ruleClass ) ) )
                    {
                    // InternalFeatureLangParser.g:404:3: ( (otherlv_5= Create | ( (lv_negation_6_0= Delete ) ) ) ( (lv_classElement_7_0= ruleClass ) ) )
                    // InternalFeatureLangParser.g:405:4: (otherlv_5= Create | ( (lv_negation_6_0= Delete ) ) ) ( (lv_classElement_7_0= ruleClass ) )
                    {
                    // InternalFeatureLangParser.g:405:4: (otherlv_5= Create | ( (lv_negation_6_0= Delete ) ) )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==Create) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==Delete) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalFeatureLangParser.g:406:5: otherlv_5= Create
                            {
                            otherlv_5=(Token)match(input,Create,FOLLOW_8); 

                            					newLeafNode(otherlv_5, grammarAccess.getCreationStatementAccess().getCreateKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalFeatureLangParser.g:411:5: ( (lv_negation_6_0= Delete ) )
                            {
                            // InternalFeatureLangParser.g:411:5: ( (lv_negation_6_0= Delete ) )
                            // InternalFeatureLangParser.g:412:6: (lv_negation_6_0= Delete )
                            {
                            // InternalFeatureLangParser.g:412:6: (lv_negation_6_0= Delete )
                            // InternalFeatureLangParser.g:413:7: lv_negation_6_0= Delete
                            {
                            lv_negation_6_0=(Token)match(input,Delete,FOLLOW_8); 

                            							newLeafNode(lv_negation_6_0, grammarAccess.getCreationStatementAccess().getNegationDeleteKeyword_1_0_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCreationStatementRule());
                            							}
                            							setWithLastConsumed(current, "negation", lv_negation_6_0 != null, "delete");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalFeatureLangParser.g:426:4: ( (lv_classElement_7_0= ruleClass ) )
                    // InternalFeatureLangParser.g:427:5: (lv_classElement_7_0= ruleClass )
                    {
                    // InternalFeatureLangParser.g:427:5: (lv_classElement_7_0= ruleClass )
                    // InternalFeatureLangParser.g:428:6: lv_classElement_7_0= ruleClass
                    {

                    						newCompositeNode(grammarAccess.getCreationStatementAccess().getClassElementClassParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_classElement_7_0=ruleClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCreationStatementRule());
                    						}
                    						set(
                    							current,
                    							"classElement",
                    							lv_classElement_7_0,
                    							"de.tud.st.featurelang.FeatureLang.Class");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleCreationStatement"


    // $ANTLR start "entryRuleAction"
    // InternalFeatureLangParser.g:453:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:455:2: (iv_ruleAction= ruleAction EOF )
            // InternalFeatureLangParser.g:456:2: iv_ruleAction= ruleAction EOF
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
    // InternalFeatureLangParser.g:465:1: ruleAction returns [EObject current=null] : ( ( (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction | lv_type_0_4= ruleCompositionAction ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_1 = null;

        EObject lv_type_0_2 = null;

        EObject lv_type_0_3 = null;

        EObject lv_type_0_4 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:472:2: ( ( ( (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction | lv_type_0_4= ruleCompositionAction ) ) ) )
            // InternalFeatureLangParser.g:473:2: ( ( (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction | lv_type_0_4= ruleCompositionAction ) ) )
            {
            // InternalFeatureLangParser.g:473:2: ( ( (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction | lv_type_0_4= ruleCompositionAction ) ) )
            // InternalFeatureLangParser.g:474:3: ( (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction | lv_type_0_4= ruleCompositionAction ) )
            {
            // InternalFeatureLangParser.g:474:3: ( (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction | lv_type_0_4= ruleCompositionAction ) )
            // InternalFeatureLangParser.g:475:4: (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction | lv_type_0_4= ruleCompositionAction )
            {
            // InternalFeatureLangParser.g:475:4: (lv_type_0_1= ruleAttributeAction | lv_type_0_2= ruleAssociationAction | lv_type_0_3= ruleInheritanceAction | lv_type_0_4= ruleCompositionAction )
            int alt13=4;
            switch ( input.LA(1) ) {
            case Have:
                {
                switch ( input.LA(2) ) {
                case The:
                case An:
                case A:
                    {
                    alt13=1;
                    }
                    break;
                case Associations:
                case Association:
                    {
                    alt13=2;
                    }
                    break;
                case Composition:
                    {
                    alt13=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }

                }
                break;
            case The:
            case An:
            case A:
                {
                alt13=1;
                }
                break;
            case Associations:
            case Association:
                {
                alt13=2;
                }
                break;
            case Inheritance:
            case Inherit:
                {
                alt13=3;
                }
                break;
            case Composition:
            case Compose:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalFeatureLangParser.g:476:5: lv_type_0_1= ruleAttributeAction
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
                    // InternalFeatureLangParser.g:492:5: lv_type_0_2= ruleAssociationAction
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
                    // InternalFeatureLangParser.g:508:5: lv_type_0_3= ruleInheritanceAction
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
                    // InternalFeatureLangParser.g:524:5: lv_type_0_4= ruleCompositionAction
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
    // InternalFeatureLangParser.g:548:1: entryRuleUpdateAction returns [EObject current=null] : iv_ruleUpdateAction= ruleUpdateAction EOF ;
    public final EObject entryRuleUpdateAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateAction = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:550:2: (iv_ruleUpdateAction= ruleUpdateAction EOF )
            // InternalFeatureLangParser.g:551:2: iv_ruleUpdateAction= ruleUpdateAction EOF
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
    // InternalFeatureLangParser.g:560:1: ruleUpdateAction returns [EObject current=null] : ( (otherlv_0= Has )? (otherlv_1= An | otherlv_2= A | otherlv_3= The ) (otherlv_4= Existing | otherlv_5= Created ) ( (lv_attribute_6_0= ruleAttribute ) ) otherlv_7= FullStop otherlv_8= It ( (lv_priority_9_0= rulePriority ) ) ( ( (lv_datatype_10_0= ruleUpdateAttributeDatatype ) ) | ( (lv_identifier_11_0= ruleUpdateAttributeIdentifier ) ) | ( (lv_value_12_0= ruleUpdateAttributeValue ) ) ) ) ;
    public final EObject ruleUpdateAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_attribute_6_0 = null;

        EObject lv_priority_9_0 = null;

        EObject lv_datatype_10_0 = null;

        EObject lv_identifier_11_0 = null;

        EObject lv_value_12_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:567:2: ( ( (otherlv_0= Has )? (otherlv_1= An | otherlv_2= A | otherlv_3= The ) (otherlv_4= Existing | otherlv_5= Created ) ( (lv_attribute_6_0= ruleAttribute ) ) otherlv_7= FullStop otherlv_8= It ( (lv_priority_9_0= rulePriority ) ) ( ( (lv_datatype_10_0= ruleUpdateAttributeDatatype ) ) | ( (lv_identifier_11_0= ruleUpdateAttributeIdentifier ) ) | ( (lv_value_12_0= ruleUpdateAttributeValue ) ) ) ) )
            // InternalFeatureLangParser.g:568:2: ( (otherlv_0= Has )? (otherlv_1= An | otherlv_2= A | otherlv_3= The ) (otherlv_4= Existing | otherlv_5= Created ) ( (lv_attribute_6_0= ruleAttribute ) ) otherlv_7= FullStop otherlv_8= It ( (lv_priority_9_0= rulePriority ) ) ( ( (lv_datatype_10_0= ruleUpdateAttributeDatatype ) ) | ( (lv_identifier_11_0= ruleUpdateAttributeIdentifier ) ) | ( (lv_value_12_0= ruleUpdateAttributeValue ) ) ) )
            {
            // InternalFeatureLangParser.g:568:2: ( (otherlv_0= Has )? (otherlv_1= An | otherlv_2= A | otherlv_3= The ) (otherlv_4= Existing | otherlv_5= Created ) ( (lv_attribute_6_0= ruleAttribute ) ) otherlv_7= FullStop otherlv_8= It ( (lv_priority_9_0= rulePriority ) ) ( ( (lv_datatype_10_0= ruleUpdateAttributeDatatype ) ) | ( (lv_identifier_11_0= ruleUpdateAttributeIdentifier ) ) | ( (lv_value_12_0= ruleUpdateAttributeValue ) ) ) )
            // InternalFeatureLangParser.g:569:3: (otherlv_0= Has )? (otherlv_1= An | otherlv_2= A | otherlv_3= The ) (otherlv_4= Existing | otherlv_5= Created ) ( (lv_attribute_6_0= ruleAttribute ) ) otherlv_7= FullStop otherlv_8= It ( (lv_priority_9_0= rulePriority ) ) ( ( (lv_datatype_10_0= ruleUpdateAttributeDatatype ) ) | ( (lv_identifier_11_0= ruleUpdateAttributeIdentifier ) ) | ( (lv_value_12_0= ruleUpdateAttributeValue ) ) )
            {
            // InternalFeatureLangParser.g:569:3: (otherlv_0= Has )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Has) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalFeatureLangParser.g:570:4: otherlv_0= Has
                    {
                    otherlv_0=(Token)match(input,Has,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getUpdateActionAccess().getHasKeyword_0());
                    			

                    }
                    break;

            }

            // InternalFeatureLangParser.g:575:3: (otherlv_1= An | otherlv_2= A | otherlv_3= The )
            int alt15=3;
            switch ( input.LA(1) ) {
            case An:
                {
                alt15=1;
                }
                break;
            case A:
                {
                alt15=2;
                }
                break;
            case The:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalFeatureLangParser.g:576:4: otherlv_1= An
                    {
                    otherlv_1=(Token)match(input,An,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getUpdateActionAccess().getAnKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:581:4: otherlv_2= A
                    {
                    otherlv_2=(Token)match(input,A,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getUpdateActionAccess().getAKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalFeatureLangParser.g:586:4: otherlv_3= The
                    {
                    otherlv_3=(Token)match(input,The,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getUpdateActionAccess().getTheKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalFeatureLangParser.g:591:3: (otherlv_4= Existing | otherlv_5= Created )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Existing) ) {
                alt16=1;
            }
            else if ( (LA16_0==Created) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalFeatureLangParser.g:592:4: otherlv_4= Existing
                    {
                    otherlv_4=(Token)match(input,Existing,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getUpdateActionAccess().getExistingKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:597:4: otherlv_5= Created
                    {
                    otherlv_5=(Token)match(input,Created,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getUpdateActionAccess().getCreatedKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalFeatureLangParser.g:602:3: ( (lv_attribute_6_0= ruleAttribute ) )
            // InternalFeatureLangParser.g:603:4: (lv_attribute_6_0= ruleAttribute )
            {
            // InternalFeatureLangParser.g:603:4: (lv_attribute_6_0= ruleAttribute )
            // InternalFeatureLangParser.g:604:5: lv_attribute_6_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getUpdateActionAccess().getAttributeAttributeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_attribute_6_0=ruleAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateActionRule());
            					}
            					set(
            						current,
            						"attribute",
            						lv_attribute_6_0,
            						"de.tud.st.featurelang.FeatureLang.Attribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,FullStop,FOLLOW_16); 

            			newLeafNode(otherlv_7, grammarAccess.getUpdateActionAccess().getFullStopKeyword_4());
            		
            otherlv_8=(Token)match(input,It,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getUpdateActionAccess().getItKeyword_5());
            		
            // InternalFeatureLangParser.g:629:3: ( (lv_priority_9_0= rulePriority ) )
            // InternalFeatureLangParser.g:630:4: (lv_priority_9_0= rulePriority )
            {
            // InternalFeatureLangParser.g:630:4: (lv_priority_9_0= rulePriority )
            // InternalFeatureLangParser.g:631:5: lv_priority_9_0= rulePriority
            {

            					newCompositeNode(grammarAccess.getUpdateActionAccess().getPriorityPriorityParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_17);
            lv_priority_9_0=rulePriority();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateActionRule());
            					}
            					set(
            						current,
            						"priority",
            						lv_priority_9_0,
            						"de.tud.st.featurelang.FeatureLang.Priority");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFeatureLangParser.g:648:3: ( ( (lv_datatype_10_0= ruleUpdateAttributeDatatype ) ) | ( (lv_identifier_11_0= ruleUpdateAttributeIdentifier ) ) | ( (lv_value_12_0= ruleUpdateAttributeValue ) ) )
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Be) ) {
                alt17=1;
            }
            else if ( (LA17_0==Have) ) {
                switch ( input.LA(2) ) {
                case A:
                    {
                    int LA17_3 = input.LA(3);

                    if ( (LA17_3==Value) ) {
                        alt17=3;
                    }
                    else if ( (LA17_3==Name||LA17_3==URI) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case Value:
                    {
                    alt17=3;
                    }
                    break;
                case Name:
                case URI:
                case An:
                    {
                    alt17=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalFeatureLangParser.g:649:4: ( (lv_datatype_10_0= ruleUpdateAttributeDatatype ) )
                    {
                    // InternalFeatureLangParser.g:649:4: ( (lv_datatype_10_0= ruleUpdateAttributeDatatype ) )
                    // InternalFeatureLangParser.g:650:5: (lv_datatype_10_0= ruleUpdateAttributeDatatype )
                    {
                    // InternalFeatureLangParser.g:650:5: (lv_datatype_10_0= ruleUpdateAttributeDatatype )
                    // InternalFeatureLangParser.g:651:6: lv_datatype_10_0= ruleUpdateAttributeDatatype
                    {

                    						newCompositeNode(grammarAccess.getUpdateActionAccess().getDatatypeUpdateAttributeDatatypeParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_datatype_10_0=ruleUpdateAttributeDatatype();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUpdateActionRule());
                    						}
                    						set(
                    							current,
                    							"datatype",
                    							lv_datatype_10_0,
                    							"de.tud.st.featurelang.FeatureLang.UpdateAttributeDatatype");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:669:4: ( (lv_identifier_11_0= ruleUpdateAttributeIdentifier ) )
                    {
                    // InternalFeatureLangParser.g:669:4: ( (lv_identifier_11_0= ruleUpdateAttributeIdentifier ) )
                    // InternalFeatureLangParser.g:670:5: (lv_identifier_11_0= ruleUpdateAttributeIdentifier )
                    {
                    // InternalFeatureLangParser.g:670:5: (lv_identifier_11_0= ruleUpdateAttributeIdentifier )
                    // InternalFeatureLangParser.g:671:6: lv_identifier_11_0= ruleUpdateAttributeIdentifier
                    {

                    						newCompositeNode(grammarAccess.getUpdateActionAccess().getIdentifierUpdateAttributeIdentifierParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_identifier_11_0=ruleUpdateAttributeIdentifier();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUpdateActionRule());
                    						}
                    						set(
                    							current,
                    							"identifier",
                    							lv_identifier_11_0,
                    							"de.tud.st.featurelang.FeatureLang.UpdateAttributeIdentifier");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureLangParser.g:689:4: ( (lv_value_12_0= ruleUpdateAttributeValue ) )
                    {
                    // InternalFeatureLangParser.g:689:4: ( (lv_value_12_0= ruleUpdateAttributeValue ) )
                    // InternalFeatureLangParser.g:690:5: (lv_value_12_0= ruleUpdateAttributeValue )
                    {
                    // InternalFeatureLangParser.g:690:5: (lv_value_12_0= ruleUpdateAttributeValue )
                    // InternalFeatureLangParser.g:691:6: lv_value_12_0= ruleUpdateAttributeValue
                    {

                    						newCompositeNode(grammarAccess.getUpdateActionAccess().getValueUpdateAttributeValueParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_12_0=ruleUpdateAttributeValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUpdateActionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_12_0,
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
    // InternalFeatureLangParser.g:716:1: entryRuleUpdateAttributeDatatype returns [EObject current=null] : iv_ruleUpdateAttributeDatatype= ruleUpdateAttributeDatatype EOF ;
    public final EObject entryRuleUpdateAttributeDatatype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateAttributeDatatype = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:718:2: (iv_ruleUpdateAttributeDatatype= ruleUpdateAttributeDatatype EOF )
            // InternalFeatureLangParser.g:719:2: iv_ruleUpdateAttributeDatatype= ruleUpdateAttributeDatatype EOF
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
    // InternalFeatureLangParser.g:728:1: ruleUpdateAttributeDatatype returns [EObject current=null] : (otherlv_0= Be otherlv_1= A ( (lv_type_2_0= ruleDatatype ) ) otherlv_3= Instead otherlv_4= Of ( (lv_oldType_5_0= ruleDatatype ) ) ) ;
    public final EObject ruleUpdateAttributeDatatype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Enumerator lv_type_2_0 = null;

        Enumerator lv_oldType_5_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:735:2: ( (otherlv_0= Be otherlv_1= A ( (lv_type_2_0= ruleDatatype ) ) otherlv_3= Instead otherlv_4= Of ( (lv_oldType_5_0= ruleDatatype ) ) ) )
            // InternalFeatureLangParser.g:736:2: (otherlv_0= Be otherlv_1= A ( (lv_type_2_0= ruleDatatype ) ) otherlv_3= Instead otherlv_4= Of ( (lv_oldType_5_0= ruleDatatype ) ) )
            {
            // InternalFeatureLangParser.g:736:2: (otherlv_0= Be otherlv_1= A ( (lv_type_2_0= ruleDatatype ) ) otherlv_3= Instead otherlv_4= Of ( (lv_oldType_5_0= ruleDatatype ) ) )
            // InternalFeatureLangParser.g:737:3: otherlv_0= Be otherlv_1= A ( (lv_type_2_0= ruleDatatype ) ) otherlv_3= Instead otherlv_4= Of ( (lv_oldType_5_0= ruleDatatype ) )
            {
            otherlv_0=(Token)match(input,Be,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getUpdateAttributeDatatypeAccess().getBeKeyword_0());
            		
            otherlv_1=(Token)match(input,A,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getUpdateAttributeDatatypeAccess().getAKeyword_1());
            		
            // InternalFeatureLangParser.g:745:3: ( (lv_type_2_0= ruleDatatype ) )
            // InternalFeatureLangParser.g:746:4: (lv_type_2_0= ruleDatatype )
            {
            // InternalFeatureLangParser.g:746:4: (lv_type_2_0= ruleDatatype )
            // InternalFeatureLangParser.g:747:5: lv_type_2_0= ruleDatatype
            {

            					newCompositeNode(grammarAccess.getUpdateAttributeDatatypeAccess().getTypeDatatypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
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

            otherlv_3=(Token)match(input,Instead,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getUpdateAttributeDatatypeAccess().getInsteadKeyword_3());
            		
            otherlv_4=(Token)match(input,Of,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getUpdateAttributeDatatypeAccess().getOfKeyword_4());
            		
            // InternalFeatureLangParser.g:772:3: ( (lv_oldType_5_0= ruleDatatype ) )
            // InternalFeatureLangParser.g:773:4: (lv_oldType_5_0= ruleDatatype )
            {
            // InternalFeatureLangParser.g:773:4: (lv_oldType_5_0= ruleDatatype )
            // InternalFeatureLangParser.g:774:5: lv_oldType_5_0= ruleDatatype
            {

            					newCompositeNode(grammarAccess.getUpdateAttributeDatatypeAccess().getOldTypeDatatypeEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_oldType_5_0=ruleDatatype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateAttributeDatatypeRule());
            					}
            					set(
            						current,
            						"oldType",
            						lv_oldType_5_0,
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
    // InternalFeatureLangParser.g:798:1: entryRuleUpdateAttributeIdentifier returns [EObject current=null] : iv_ruleUpdateAttributeIdentifier= ruleUpdateAttributeIdentifier EOF ;
    public final EObject entryRuleUpdateAttributeIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateAttributeIdentifier = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:800:2: (iv_ruleUpdateAttributeIdentifier= ruleUpdateAttributeIdentifier EOF )
            // InternalFeatureLangParser.g:801:2: iv_ruleUpdateAttributeIdentifier= ruleUpdateAttributeIdentifier EOF
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
    // InternalFeatureLangParser.g:810:1: ruleUpdateAttributeIdentifier returns [EObject current=null] : (otherlv_0= Have (otherlv_1= A | otherlv_2= An )? ( (lv_identifier_3_0= ruleIdentifier ) ) otherlv_4= Instead otherlv_5= Of ( (lv_oldIdentifier_6_0= ruleIdentifier ) ) ) ;
    public final EObject ruleUpdateAttributeIdentifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_identifier_3_0 = null;

        EObject lv_oldIdentifier_6_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:817:2: ( (otherlv_0= Have (otherlv_1= A | otherlv_2= An )? ( (lv_identifier_3_0= ruleIdentifier ) ) otherlv_4= Instead otherlv_5= Of ( (lv_oldIdentifier_6_0= ruleIdentifier ) ) ) )
            // InternalFeatureLangParser.g:818:2: (otherlv_0= Have (otherlv_1= A | otherlv_2= An )? ( (lv_identifier_3_0= ruleIdentifier ) ) otherlv_4= Instead otherlv_5= Of ( (lv_oldIdentifier_6_0= ruleIdentifier ) ) )
            {
            // InternalFeatureLangParser.g:818:2: (otherlv_0= Have (otherlv_1= A | otherlv_2= An )? ( (lv_identifier_3_0= ruleIdentifier ) ) otherlv_4= Instead otherlv_5= Of ( (lv_oldIdentifier_6_0= ruleIdentifier ) ) )
            // InternalFeatureLangParser.g:819:3: otherlv_0= Have (otherlv_1= A | otherlv_2= An )? ( (lv_identifier_3_0= ruleIdentifier ) ) otherlv_4= Instead otherlv_5= Of ( (lv_oldIdentifier_6_0= ruleIdentifier ) )
            {
            otherlv_0=(Token)match(input,Have,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getUpdateAttributeIdentifierAccess().getHaveKeyword_0());
            		
            // InternalFeatureLangParser.g:823:3: (otherlv_1= A | otherlv_2= An )?
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==A) ) {
                alt18=1;
            }
            else if ( (LA18_0==An) ) {
                alt18=2;
            }
            switch (alt18) {
                case 1 :
                    // InternalFeatureLangParser.g:824:4: otherlv_1= A
                    {
                    otherlv_1=(Token)match(input,A,FOLLOW_22); 

                    				newLeafNode(otherlv_1, grammarAccess.getUpdateAttributeIdentifierAccess().getAKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:829:4: otherlv_2= An
                    {
                    otherlv_2=(Token)match(input,An,FOLLOW_22); 

                    				newLeafNode(otherlv_2, grammarAccess.getUpdateAttributeIdentifierAccess().getAnKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalFeatureLangParser.g:834:3: ( (lv_identifier_3_0= ruleIdentifier ) )
            // InternalFeatureLangParser.g:835:4: (lv_identifier_3_0= ruleIdentifier )
            {
            // InternalFeatureLangParser.g:835:4: (lv_identifier_3_0= ruleIdentifier )
            // InternalFeatureLangParser.g:836:5: lv_identifier_3_0= ruleIdentifier
            {

            					newCompositeNode(grammarAccess.getUpdateAttributeIdentifierAccess().getIdentifierIdentifierParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
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

            otherlv_4=(Token)match(input,Instead,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getUpdateAttributeIdentifierAccess().getInsteadKeyword_3());
            		
            otherlv_5=(Token)match(input,Of,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getUpdateAttributeIdentifierAccess().getOfKeyword_4());
            		
            // InternalFeatureLangParser.g:861:3: ( (lv_oldIdentifier_6_0= ruleIdentifier ) )
            // InternalFeatureLangParser.g:862:4: (lv_oldIdentifier_6_0= ruleIdentifier )
            {
            // InternalFeatureLangParser.g:862:4: (lv_oldIdentifier_6_0= ruleIdentifier )
            // InternalFeatureLangParser.g:863:5: lv_oldIdentifier_6_0= ruleIdentifier
            {

            					newCompositeNode(grammarAccess.getUpdateAttributeIdentifierAccess().getOldIdentifierIdentifierParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_oldIdentifier_6_0=ruleIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateAttributeIdentifierRule());
            					}
            					set(
            						current,
            						"oldIdentifier",
            						lv_oldIdentifier_6_0,
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
    // InternalFeatureLangParser.g:887:1: entryRuleUpdateAttributeValue returns [EObject current=null] : iv_ruleUpdateAttributeValue= ruleUpdateAttributeValue EOF ;
    public final EObject entryRuleUpdateAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateAttributeValue = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:889:2: (iv_ruleUpdateAttributeValue= ruleUpdateAttributeValue EOF )
            // InternalFeatureLangParser.g:890:2: iv_ruleUpdateAttributeValue= ruleUpdateAttributeValue EOF
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
    // InternalFeatureLangParser.g:899:1: ruleUpdateAttributeValue returns [EObject current=null] : (otherlv_0= Have (otherlv_1= A )? otherlv_2= Value ( (lv_value_3_0= ruleAttributeValue ) ) otherlv_4= Instead otherlv_5= Of ( (lv_oldValue_6_0= ruleAttributeValue ) ) ) ;
    public final EObject ruleUpdateAttributeValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;

        AntlrDatatypeRuleToken lv_oldValue_6_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:906:2: ( (otherlv_0= Have (otherlv_1= A )? otherlv_2= Value ( (lv_value_3_0= ruleAttributeValue ) ) otherlv_4= Instead otherlv_5= Of ( (lv_oldValue_6_0= ruleAttributeValue ) ) ) )
            // InternalFeatureLangParser.g:907:2: (otherlv_0= Have (otherlv_1= A )? otherlv_2= Value ( (lv_value_3_0= ruleAttributeValue ) ) otherlv_4= Instead otherlv_5= Of ( (lv_oldValue_6_0= ruleAttributeValue ) ) )
            {
            // InternalFeatureLangParser.g:907:2: (otherlv_0= Have (otherlv_1= A )? otherlv_2= Value ( (lv_value_3_0= ruleAttributeValue ) ) otherlv_4= Instead otherlv_5= Of ( (lv_oldValue_6_0= ruleAttributeValue ) ) )
            // InternalFeatureLangParser.g:908:3: otherlv_0= Have (otherlv_1= A )? otherlv_2= Value ( (lv_value_3_0= ruleAttributeValue ) ) otherlv_4= Instead otherlv_5= Of ( (lv_oldValue_6_0= ruleAttributeValue ) )
            {
            otherlv_0=(Token)match(input,Have,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getUpdateAttributeValueAccess().getHaveKeyword_0());
            		
            // InternalFeatureLangParser.g:912:3: (otherlv_1= A )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==A) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalFeatureLangParser.g:913:4: otherlv_1= A
                    {
                    otherlv_1=(Token)match(input,A,FOLLOW_24); 

                    				newLeafNode(otherlv_1, grammarAccess.getUpdateAttributeValueAccess().getAKeyword_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,Value,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getUpdateAttributeValueAccess().getValueKeyword_2());
            		
            // InternalFeatureLangParser.g:922:3: ( (lv_value_3_0= ruleAttributeValue ) )
            // InternalFeatureLangParser.g:923:4: (lv_value_3_0= ruleAttributeValue )
            {
            // InternalFeatureLangParser.g:923:4: (lv_value_3_0= ruleAttributeValue )
            // InternalFeatureLangParser.g:924:5: lv_value_3_0= ruleAttributeValue
            {

            					newCompositeNode(grammarAccess.getUpdateAttributeValueAccess().getValueAttributeValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_value_3_0=ruleAttributeValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateAttributeValueRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"de.tud.st.featurelang.FeatureLang.AttributeValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,Instead,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getUpdateAttributeValueAccess().getInsteadKeyword_4());
            		
            otherlv_5=(Token)match(input,Of,FOLLOW_25); 

            			newLeafNode(otherlv_5, grammarAccess.getUpdateAttributeValueAccess().getOfKeyword_5());
            		
            // InternalFeatureLangParser.g:949:3: ( (lv_oldValue_6_0= ruleAttributeValue ) )
            // InternalFeatureLangParser.g:950:4: (lv_oldValue_6_0= ruleAttributeValue )
            {
            // InternalFeatureLangParser.g:950:4: (lv_oldValue_6_0= ruleAttributeValue )
            // InternalFeatureLangParser.g:951:5: lv_oldValue_6_0= ruleAttributeValue
            {

            					newCompositeNode(grammarAccess.getUpdateAttributeValueAccess().getOldValueAttributeValueParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_oldValue_6_0=ruleAttributeValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateAttributeValueRule());
            					}
            					set(
            						current,
            						"oldValue",
            						lv_oldValue_6_0,
            						"de.tud.st.featurelang.FeatureLang.AttributeValue");
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
    // $ANTLR end "ruleUpdateAttributeValue"


    // $ANTLR start "entryRuleAttributeAction"
    // InternalFeatureLangParser.g:975:1: entryRuleAttributeAction returns [EObject current=null] : iv_ruleAttributeAction= ruleAttributeAction EOF ;
    public final EObject entryRuleAttributeAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeAction = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:977:2: (iv_ruleAttributeAction= ruleAttributeAction EOF )
            // InternalFeatureLangParser.g:978:2: iv_ruleAttributeAction= ruleAttributeAction EOF
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
    // InternalFeatureLangParser.g:987:1: ruleAttributeAction returns [EObject current=null] : ( (otherlv_0= Have )? (otherlv_1= The | otherlv_2= An | otherlv_3= A ) ( (lv_attribute_4_0= ruleAttribute ) ) (otherlv_5= FullStop otherlv_6= It otherlv_7= Is otherlv_8= A ( (lv_type_9_0= ruleDatatype ) ) )? (otherlv_10= FullStop otherlv_11= It otherlv_12= Has (otherlv_13= A )? otherlv_14= Value ( (lv_value_15_0= ruleAttributeValue ) ) )? ) ;
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
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_attribute_4_0 = null;

        Enumerator lv_type_9_0 = null;

        AntlrDatatypeRuleToken lv_value_15_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:994:2: ( ( (otherlv_0= Have )? (otherlv_1= The | otherlv_2= An | otherlv_3= A ) ( (lv_attribute_4_0= ruleAttribute ) ) (otherlv_5= FullStop otherlv_6= It otherlv_7= Is otherlv_8= A ( (lv_type_9_0= ruleDatatype ) ) )? (otherlv_10= FullStop otherlv_11= It otherlv_12= Has (otherlv_13= A )? otherlv_14= Value ( (lv_value_15_0= ruleAttributeValue ) ) )? ) )
            // InternalFeatureLangParser.g:995:2: ( (otherlv_0= Have )? (otherlv_1= The | otherlv_2= An | otherlv_3= A ) ( (lv_attribute_4_0= ruleAttribute ) ) (otherlv_5= FullStop otherlv_6= It otherlv_7= Is otherlv_8= A ( (lv_type_9_0= ruleDatatype ) ) )? (otherlv_10= FullStop otherlv_11= It otherlv_12= Has (otherlv_13= A )? otherlv_14= Value ( (lv_value_15_0= ruleAttributeValue ) ) )? )
            {
            // InternalFeatureLangParser.g:995:2: ( (otherlv_0= Have )? (otherlv_1= The | otherlv_2= An | otherlv_3= A ) ( (lv_attribute_4_0= ruleAttribute ) ) (otherlv_5= FullStop otherlv_6= It otherlv_7= Is otherlv_8= A ( (lv_type_9_0= ruleDatatype ) ) )? (otherlv_10= FullStop otherlv_11= It otherlv_12= Has (otherlv_13= A )? otherlv_14= Value ( (lv_value_15_0= ruleAttributeValue ) ) )? )
            // InternalFeatureLangParser.g:996:3: (otherlv_0= Have )? (otherlv_1= The | otherlv_2= An | otherlv_3= A ) ( (lv_attribute_4_0= ruleAttribute ) ) (otherlv_5= FullStop otherlv_6= It otherlv_7= Is otherlv_8= A ( (lv_type_9_0= ruleDatatype ) ) )? (otherlv_10= FullStop otherlv_11= It otherlv_12= Has (otherlv_13= A )? otherlv_14= Value ( (lv_value_15_0= ruleAttributeValue ) ) )?
            {
            // InternalFeatureLangParser.g:996:3: (otherlv_0= Have )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Have) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalFeatureLangParser.g:997:4: otherlv_0= Have
                    {
                    otherlv_0=(Token)match(input,Have,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getAttributeActionAccess().getHaveKeyword_0());
                    			

                    }
                    break;

            }

            // InternalFeatureLangParser.g:1002:3: (otherlv_1= The | otherlv_2= An | otherlv_3= A )
            int alt21=3;
            switch ( input.LA(1) ) {
            case The:
                {
                alt21=1;
                }
                break;
            case An:
                {
                alt21=2;
                }
                break;
            case A:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalFeatureLangParser.g:1003:4: otherlv_1= The
                    {
                    otherlv_1=(Token)match(input,The,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getAttributeActionAccess().getTheKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1008:4: otherlv_2= An
                    {
                    otherlv_2=(Token)match(input,An,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getAttributeActionAccess().getAnKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalFeatureLangParser.g:1013:4: otherlv_3= A
                    {
                    otherlv_3=(Token)match(input,A,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getAttributeActionAccess().getAKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalFeatureLangParser.g:1018:3: ( (lv_attribute_4_0= ruleAttribute ) )
            // InternalFeatureLangParser.g:1019:4: (lv_attribute_4_0= ruleAttribute )
            {
            // InternalFeatureLangParser.g:1019:4: (lv_attribute_4_0= ruleAttribute )
            // InternalFeatureLangParser.g:1020:5: lv_attribute_4_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getAttributeActionAccess().getAttributeAttributeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
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

            // InternalFeatureLangParser.g:1037:3: (otherlv_5= FullStop otherlv_6= It otherlv_7= Is otherlv_8= A ( (lv_type_9_0= ruleDatatype ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==FullStop) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==It) ) {
                    int LA22_3 = input.LA(3);

                    if ( (LA22_3==Is) ) {
                        alt22=1;
                    }
                }
            }
            switch (alt22) {
                case 1 :
                    // InternalFeatureLangParser.g:1038:4: otherlv_5= FullStop otherlv_6= It otherlv_7= Is otherlv_8= A ( (lv_type_9_0= ruleDatatype ) )
                    {
                    otherlv_5=(Token)match(input,FullStop,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getAttributeActionAccess().getFullStopKeyword_3_0());
                    			
                    otherlv_6=(Token)match(input,It,FOLLOW_26); 

                    				newLeafNode(otherlv_6, grammarAccess.getAttributeActionAccess().getItKeyword_3_1());
                    			
                    otherlv_7=(Token)match(input,Is,FOLLOW_18); 

                    				newLeafNode(otherlv_7, grammarAccess.getAttributeActionAccess().getIsKeyword_3_2());
                    			
                    otherlv_8=(Token)match(input,A,FOLLOW_19); 

                    				newLeafNode(otherlv_8, grammarAccess.getAttributeActionAccess().getAKeyword_3_3());
                    			
                    // InternalFeatureLangParser.g:1054:4: ( (lv_type_9_0= ruleDatatype ) )
                    // InternalFeatureLangParser.g:1055:5: (lv_type_9_0= ruleDatatype )
                    {
                    // InternalFeatureLangParser.g:1055:5: (lv_type_9_0= ruleDatatype )
                    // InternalFeatureLangParser.g:1056:6: lv_type_9_0= ruleDatatype
                    {

                    						newCompositeNode(grammarAccess.getAttributeActionAccess().getTypeDatatypeEnumRuleCall_3_4_0());
                    					
                    pushFollow(FOLLOW_4);
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

            // InternalFeatureLangParser.g:1074:3: (otherlv_10= FullStop otherlv_11= It otherlv_12= Has (otherlv_13= A )? otherlv_14= Value ( (lv_value_15_0= ruleAttributeValue ) ) )?
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
                    // InternalFeatureLangParser.g:1075:4: otherlv_10= FullStop otherlv_11= It otherlv_12= Has (otherlv_13= A )? otherlv_14= Value ( (lv_value_15_0= ruleAttributeValue ) )
                    {
                    otherlv_10=(Token)match(input,FullStop,FOLLOW_16); 

                    				newLeafNode(otherlv_10, grammarAccess.getAttributeActionAccess().getFullStopKeyword_4_0());
                    			
                    otherlv_11=(Token)match(input,It,FOLLOW_27); 

                    				newLeafNode(otherlv_11, grammarAccess.getAttributeActionAccess().getItKeyword_4_1());
                    			
                    otherlv_12=(Token)match(input,Has,FOLLOW_23); 

                    				newLeafNode(otherlv_12, grammarAccess.getAttributeActionAccess().getHasKeyword_4_2());
                    			
                    // InternalFeatureLangParser.g:1087:4: (otherlv_13= A )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==A) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalFeatureLangParser.g:1088:5: otherlv_13= A
                            {
                            otherlv_13=(Token)match(input,A,FOLLOW_24); 

                            					newLeafNode(otherlv_13, grammarAccess.getAttributeActionAccess().getAKeyword_4_3());
                            				

                            }
                            break;

                    }

                    otherlv_14=(Token)match(input,Value,FOLLOW_25); 

                    				newLeafNode(otherlv_14, grammarAccess.getAttributeActionAccess().getValueKeyword_4_4());
                    			
                    // InternalFeatureLangParser.g:1097:4: ( (lv_value_15_0= ruleAttributeValue ) )
                    // InternalFeatureLangParser.g:1098:5: (lv_value_15_0= ruleAttributeValue )
                    {
                    // InternalFeatureLangParser.g:1098:5: (lv_value_15_0= ruleAttributeValue )
                    // InternalFeatureLangParser.g:1099:6: lv_value_15_0= ruleAttributeValue
                    {

                    						newCompositeNode(grammarAccess.getAttributeActionAccess().getValueAttributeValueParserRuleCall_4_5_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_15_0=ruleAttributeValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeActionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_15_0,
                    							"de.tud.st.featurelang.FeatureLang.AttributeValue");
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
    // InternalFeatureLangParser.g:1124:1: entryRuleAssociationAction returns [EObject current=null] : iv_ruleAssociationAction= ruleAssociationAction EOF ;
    public final EObject entryRuleAssociationAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationAction = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1126:2: (iv_ruleAssociationAction= ruleAssociationAction EOF )
            // InternalFeatureLangParser.g:1127:2: iv_ruleAssociationAction= ruleAssociationAction EOF
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
    // InternalFeatureLangParser.g:1136:1: ruleAssociationAction returns [EObject current=null] : ( (otherlv_0= Have )? (otherlv_1= Associations | otherlv_2= Association ) ( ( (lv_create_3_0= ruleCreateAssociation ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( (lv_edit_5_0= ruleEditAssociation ) ) ) ) ) ;
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
            // InternalFeatureLangParser.g:1143:2: ( ( (otherlv_0= Have )? (otherlv_1= Associations | otherlv_2= Association ) ( ( (lv_create_3_0= ruleCreateAssociation ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( (lv_edit_5_0= ruleEditAssociation ) ) ) ) ) )
            // InternalFeatureLangParser.g:1144:2: ( (otherlv_0= Have )? (otherlv_1= Associations | otherlv_2= Association ) ( ( (lv_create_3_0= ruleCreateAssociation ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( (lv_edit_5_0= ruleEditAssociation ) ) ) ) )
            {
            // InternalFeatureLangParser.g:1144:2: ( (otherlv_0= Have )? (otherlv_1= Associations | otherlv_2= Association ) ( ( (lv_create_3_0= ruleCreateAssociation ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( (lv_edit_5_0= ruleEditAssociation ) ) ) ) )
            // InternalFeatureLangParser.g:1145:3: (otherlv_0= Have )? (otherlv_1= Associations | otherlv_2= Association ) ( ( (lv_create_3_0= ruleCreateAssociation ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( (lv_edit_5_0= ruleEditAssociation ) ) ) )
            {
            // InternalFeatureLangParser.g:1145:3: (otherlv_0= Have )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Have) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalFeatureLangParser.g:1146:4: otherlv_0= Have
                    {
                    otherlv_0=(Token)match(input,Have,FOLLOW_28); 

                    				newLeafNode(otherlv_0, grammarAccess.getAssociationActionAccess().getHaveKeyword_0());
                    			

                    }
                    break;

            }

            // InternalFeatureLangParser.g:1151:3: (otherlv_1= Associations | otherlv_2= Association )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Associations) ) {
                alt26=1;
            }
            else if ( (LA26_0==Association) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalFeatureLangParser.g:1152:4: otherlv_1= Associations
                    {
                    otherlv_1=(Token)match(input,Associations,FOLLOW_29); 

                    				newLeafNode(otherlv_1, grammarAccess.getAssociationActionAccess().getAssociationsKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1157:4: otherlv_2= Association
                    {
                    otherlv_2=(Token)match(input,Association,FOLLOW_29); 

                    				newLeafNode(otherlv_2, grammarAccess.getAssociationActionAccess().getAssociationKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalFeatureLangParser.g:1162:3: ( ( (lv_create_3_0= ruleCreateAssociation ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( (lv_edit_5_0= ruleEditAssociation ) ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==To) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_ID) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalFeatureLangParser.g:1163:4: ( (lv_create_3_0= ruleCreateAssociation ) )
                    {
                    // InternalFeatureLangParser.g:1163:4: ( (lv_create_3_0= ruleCreateAssociation ) )
                    // InternalFeatureLangParser.g:1164:5: (lv_create_3_0= ruleCreateAssociation )
                    {
                    // InternalFeatureLangParser.g:1164:5: (lv_create_3_0= ruleCreateAssociation )
                    // InternalFeatureLangParser.g:1165:6: lv_create_3_0= ruleCreateAssociation
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
                    // InternalFeatureLangParser.g:1183:4: ( ( (lv_name_4_0= RULE_ID ) ) ( (lv_edit_5_0= ruleEditAssociation ) ) )
                    {
                    // InternalFeatureLangParser.g:1183:4: ( ( (lv_name_4_0= RULE_ID ) ) ( (lv_edit_5_0= ruleEditAssociation ) ) )
                    // InternalFeatureLangParser.g:1184:5: ( (lv_name_4_0= RULE_ID ) ) ( (lv_edit_5_0= ruleEditAssociation ) )
                    {
                    // InternalFeatureLangParser.g:1184:5: ( (lv_name_4_0= RULE_ID ) )
                    // InternalFeatureLangParser.g:1185:6: (lv_name_4_0= RULE_ID )
                    {
                    // InternalFeatureLangParser.g:1185:6: (lv_name_4_0= RULE_ID )
                    // InternalFeatureLangParser.g:1186:7: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_30); 

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

                    // InternalFeatureLangParser.g:1202:5: ( (lv_edit_5_0= ruleEditAssociation ) )
                    // InternalFeatureLangParser.g:1203:6: (lv_edit_5_0= ruleEditAssociation )
                    {
                    // InternalFeatureLangParser.g:1203:6: (lv_edit_5_0= ruleEditAssociation )
                    // InternalFeatureLangParser.g:1204:7: lv_edit_5_0= ruleEditAssociation
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
    // InternalFeatureLangParser.g:1230:1: entryRuleCreateAssociation returns [EObject current=null] : iv_ruleCreateAssociation= ruleCreateAssociation EOF ;
    public final EObject entryRuleCreateAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateAssociation = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1232:2: (iv_ruleCreateAssociation= ruleCreateAssociation EOF )
            // InternalFeatureLangParser.g:1233:2: iv_ruleCreateAssociation= ruleCreateAssociation EOF
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
    // InternalFeatureLangParser.g:1242:1: ruleCreateAssociation returns [EObject current=null] : (otherlv_0= To (otherlv_1= Other )? ( (lv_target_2_0= ruleClass ) ) otherlv_3= Called ( (lv_relation_4_0= RULE_ID ) ) ) ;
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
            // InternalFeatureLangParser.g:1249:2: ( (otherlv_0= To (otherlv_1= Other )? ( (lv_target_2_0= ruleClass ) ) otherlv_3= Called ( (lv_relation_4_0= RULE_ID ) ) ) )
            // InternalFeatureLangParser.g:1250:2: (otherlv_0= To (otherlv_1= Other )? ( (lv_target_2_0= ruleClass ) ) otherlv_3= Called ( (lv_relation_4_0= RULE_ID ) ) )
            {
            // InternalFeatureLangParser.g:1250:2: (otherlv_0= To (otherlv_1= Other )? ( (lv_target_2_0= ruleClass ) ) otherlv_3= Called ( (lv_relation_4_0= RULE_ID ) ) )
            // InternalFeatureLangParser.g:1251:3: otherlv_0= To (otherlv_1= Other )? ( (lv_target_2_0= ruleClass ) ) otherlv_3= Called ( (lv_relation_4_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,To,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateAssociationAccess().getToKeyword_0());
            		
            // InternalFeatureLangParser.g:1255:3: (otherlv_1= Other )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Other) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalFeatureLangParser.g:1256:4: otherlv_1= Other
                    {
                    otherlv_1=(Token)match(input,Other,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getCreateAssociationAccess().getOtherKeyword_1());
                    			

                    }
                    break;

            }

            // InternalFeatureLangParser.g:1261:3: ( (lv_target_2_0= ruleClass ) )
            // InternalFeatureLangParser.g:1262:4: (lv_target_2_0= ruleClass )
            {
            // InternalFeatureLangParser.g:1262:4: (lv_target_2_0= ruleClass )
            // InternalFeatureLangParser.g:1263:5: lv_target_2_0= ruleClass
            {

            					newCompositeNode(grammarAccess.getCreateAssociationAccess().getTargetClassParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_32);
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

            otherlv_3=(Token)match(input,Called,FOLLOW_33); 

            			newLeafNode(otherlv_3, grammarAccess.getCreateAssociationAccess().getCalledKeyword_3());
            		
            // InternalFeatureLangParser.g:1284:3: ( (lv_relation_4_0= RULE_ID ) )
            // InternalFeatureLangParser.g:1285:4: (lv_relation_4_0= RULE_ID )
            {
            // InternalFeatureLangParser.g:1285:4: (lv_relation_4_0= RULE_ID )
            // InternalFeatureLangParser.g:1286:5: lv_relation_4_0= RULE_ID
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
    // InternalFeatureLangParser.g:1309:1: entryRuleEditAssociation returns [EObject current=null] : iv_ruleEditAssociation= ruleEditAssociation EOF ;
    public final EObject entryRuleEditAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEditAssociation = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1311:2: (iv_ruleEditAssociation= ruleEditAssociation EOF )
            // InternalFeatureLangParser.g:1312:2: iv_ruleEditAssociation= ruleEditAssociation EOF
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
    // InternalFeatureLangParser.g:1321:1: ruleEditAssociation returns [EObject current=null] : ( ( (lv_type_0_1= ruleSetCompatible | lv_type_0_2= ruleSetVersionRange | lv_type_0_3= ruleSetVariant | lv_type_0_4= ruleSetRightOpen | lv_type_0_5= ruleSetLeftOpen ) ) ) ;
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
            // InternalFeatureLangParser.g:1328:2: ( ( ( (lv_type_0_1= ruleSetCompatible | lv_type_0_2= ruleSetVersionRange | lv_type_0_3= ruleSetVariant | lv_type_0_4= ruleSetRightOpen | lv_type_0_5= ruleSetLeftOpen ) ) ) )
            // InternalFeatureLangParser.g:1329:2: ( ( (lv_type_0_1= ruleSetCompatible | lv_type_0_2= ruleSetVersionRange | lv_type_0_3= ruleSetVariant | lv_type_0_4= ruleSetRightOpen | lv_type_0_5= ruleSetLeftOpen ) ) )
            {
            // InternalFeatureLangParser.g:1329:2: ( ( (lv_type_0_1= ruleSetCompatible | lv_type_0_2= ruleSetVersionRange | lv_type_0_3= ruleSetVariant | lv_type_0_4= ruleSetRightOpen | lv_type_0_5= ruleSetLeftOpen ) ) )
            // InternalFeatureLangParser.g:1330:3: ( (lv_type_0_1= ruleSetCompatible | lv_type_0_2= ruleSetVersionRange | lv_type_0_3= ruleSetVariant | lv_type_0_4= ruleSetRightOpen | lv_type_0_5= ruleSetLeftOpen ) )
            {
            // InternalFeatureLangParser.g:1330:3: ( (lv_type_0_1= ruleSetCompatible | lv_type_0_2= ruleSetVersionRange | lv_type_0_3= ruleSetVariant | lv_type_0_4= ruleSetRightOpen | lv_type_0_5= ruleSetLeftOpen ) )
            // InternalFeatureLangParser.g:1331:4: (lv_type_0_1= ruleSetCompatible | lv_type_0_2= ruleSetVersionRange | lv_type_0_3= ruleSetVariant | lv_type_0_4= ruleSetRightOpen | lv_type_0_5= ruleSetLeftOpen )
            {
            // InternalFeatureLangParser.g:1331:4: (lv_type_0_1= ruleSetCompatible | lv_type_0_2= ruleSetVersionRange | lv_type_0_3= ruleSetVariant | lv_type_0_4= ruleSetRightOpen | lv_type_0_5= ruleSetLeftOpen )
            int alt29=5;
            switch ( input.LA(1) ) {
            case Compatible:
                {
                alt29=1;
                }
                break;
            case With:
                {
                int LA29_2 = input.LA(2);

                if ( (LA29_2==Version) ) {
                    alt29=2;
                }
                else if ( (LA29_2==All) ) {
                    alt29=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 2, input);

                    throw nvae;
                }
                }
                break;
            case Starting:
                {
                alt29=4;
                }
                break;
            case Up:
                {
                alt29=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalFeatureLangParser.g:1332:5: lv_type_0_1= ruleSetCompatible
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
                    // InternalFeatureLangParser.g:1348:5: lv_type_0_2= ruleSetVersionRange
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
                    // InternalFeatureLangParser.g:1364:5: lv_type_0_3= ruleSetVariant
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
                    // InternalFeatureLangParser.g:1380:5: lv_type_0_4= ruleSetRightOpen
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
                    // InternalFeatureLangParser.g:1396:5: lv_type_0_5= ruleSetLeftOpen
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
    // InternalFeatureLangParser.g:1420:1: entryRuleSetCompatible returns [EObject current=null] : iv_ruleSetCompatible= ruleSetCompatible EOF ;
    public final EObject entryRuleSetCompatible() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetCompatible = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1422:2: (iv_ruleSetCompatible= ruleSetCompatible EOF )
            // InternalFeatureLangParser.g:1423:2: iv_ruleSetCompatible= ruleSetCompatible EOF
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
    // InternalFeatureLangParser.g:1432:1: ruleSetCompatible returns [EObject current=null] : (otherlv_0= Compatible otherlv_1= With otherlv_2= Version ( (lv_name_3_0= RULE_DATE ) ) ) ;
    public final EObject ruleSetCompatible() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1439:2: ( (otherlv_0= Compatible otherlv_1= With otherlv_2= Version ( (lv_name_3_0= RULE_DATE ) ) ) )
            // InternalFeatureLangParser.g:1440:2: (otherlv_0= Compatible otherlv_1= With otherlv_2= Version ( (lv_name_3_0= RULE_DATE ) ) )
            {
            // InternalFeatureLangParser.g:1440:2: (otherlv_0= Compatible otherlv_1= With otherlv_2= Version ( (lv_name_3_0= RULE_DATE ) ) )
            // InternalFeatureLangParser.g:1441:3: otherlv_0= Compatible otherlv_1= With otherlv_2= Version ( (lv_name_3_0= RULE_DATE ) )
            {
            otherlv_0=(Token)match(input,Compatible,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getSetCompatibleAccess().getCompatibleKeyword_0());
            		
            otherlv_1=(Token)match(input,With,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getSetCompatibleAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,Version,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getSetCompatibleAccess().getVersionKeyword_2());
            		
            // InternalFeatureLangParser.g:1453:3: ( (lv_name_3_0= RULE_DATE ) )
            // InternalFeatureLangParser.g:1454:4: (lv_name_3_0= RULE_DATE )
            {
            // InternalFeatureLangParser.g:1454:4: (lv_name_3_0= RULE_DATE )
            // InternalFeatureLangParser.g:1455:5: lv_name_3_0= RULE_DATE
            {
            lv_name_3_0=(Token)match(input,RULE_DATE,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getSetCompatibleAccess().getNameDATETerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetCompatibleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.tud.st.featurelang.FeatureLang.DATE");
            				

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
    // InternalFeatureLangParser.g:1478:1: entryRuleSetVersionRange returns [EObject current=null] : iv_ruleSetVersionRange= ruleSetVersionRange EOF ;
    public final EObject entryRuleSetVersionRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetVersionRange = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1480:2: (iv_ruleSetVersionRange= ruleSetVersionRange EOF )
            // InternalFeatureLangParser.g:1481:2: iv_ruleSetVersionRange= ruleSetVersionRange EOF
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
    // InternalFeatureLangParser.g:1490:1: ruleSetVersionRange returns [EObject current=null] : (otherlv_0= With otherlv_1= Version otherlv_2= Range otherlv_3= From ( (lv_start_4_0= RULE_DATE ) ) otherlv_5= To ( (lv_end_6_0= RULE_DATE ) ) ) ;
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
            // InternalFeatureLangParser.g:1497:2: ( (otherlv_0= With otherlv_1= Version otherlv_2= Range otherlv_3= From ( (lv_start_4_0= RULE_DATE ) ) otherlv_5= To ( (lv_end_6_0= RULE_DATE ) ) ) )
            // InternalFeatureLangParser.g:1498:2: (otherlv_0= With otherlv_1= Version otherlv_2= Range otherlv_3= From ( (lv_start_4_0= RULE_DATE ) ) otherlv_5= To ( (lv_end_6_0= RULE_DATE ) ) )
            {
            // InternalFeatureLangParser.g:1498:2: (otherlv_0= With otherlv_1= Version otherlv_2= Range otherlv_3= From ( (lv_start_4_0= RULE_DATE ) ) otherlv_5= To ( (lv_end_6_0= RULE_DATE ) ) )
            // InternalFeatureLangParser.g:1499:3: otherlv_0= With otherlv_1= Version otherlv_2= Range otherlv_3= From ( (lv_start_4_0= RULE_DATE ) ) otherlv_5= To ( (lv_end_6_0= RULE_DATE ) )
            {
            otherlv_0=(Token)match(input,With,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getSetVersionRangeAccess().getWithKeyword_0());
            		
            otherlv_1=(Token)match(input,Version,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getSetVersionRangeAccess().getVersionKeyword_1());
            		
            otherlv_2=(Token)match(input,Range,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getSetVersionRangeAccess().getRangeKeyword_2());
            		
            otherlv_3=(Token)match(input,From,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getSetVersionRangeAccess().getFromKeyword_3());
            		
            // InternalFeatureLangParser.g:1515:3: ( (lv_start_4_0= RULE_DATE ) )
            // InternalFeatureLangParser.g:1516:4: (lv_start_4_0= RULE_DATE )
            {
            // InternalFeatureLangParser.g:1516:4: (lv_start_4_0= RULE_DATE )
            // InternalFeatureLangParser.g:1517:5: lv_start_4_0= RULE_DATE
            {
            lv_start_4_0=(Token)match(input,RULE_DATE,FOLLOW_39); 

            					newLeafNode(lv_start_4_0, grammarAccess.getSetVersionRangeAccess().getStartDATETerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetVersionRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"start",
            						lv_start_4_0,
            						"de.tud.st.featurelang.FeatureLang.DATE");
            				

            }


            }

            otherlv_5=(Token)match(input,To,FOLLOW_36); 

            			newLeafNode(otherlv_5, grammarAccess.getSetVersionRangeAccess().getToKeyword_5());
            		
            // InternalFeatureLangParser.g:1537:3: ( (lv_end_6_0= RULE_DATE ) )
            // InternalFeatureLangParser.g:1538:4: (lv_end_6_0= RULE_DATE )
            {
            // InternalFeatureLangParser.g:1538:4: (lv_end_6_0= RULE_DATE )
            // InternalFeatureLangParser.g:1539:5: lv_end_6_0= RULE_DATE
            {
            lv_end_6_0=(Token)match(input,RULE_DATE,FOLLOW_2); 

            					newLeafNode(lv_end_6_0, grammarAccess.getSetVersionRangeAccess().getEndDATETerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetVersionRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"end",
            						lv_end_6_0,
            						"de.tud.st.featurelang.FeatureLang.DATE");
            				

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
    // InternalFeatureLangParser.g:1562:1: entryRuleSetVariant returns [EObject current=null] : iv_ruleSetVariant= ruleSetVariant EOF ;
    public final EObject entryRuleSetVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetVariant = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1564:2: (iv_ruleSetVariant= ruleSetVariant EOF )
            // InternalFeatureLangParser.g:1565:2: iv_ruleSetVariant= ruleSetVariant EOF
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
    // InternalFeatureLangParser.g:1574:1: ruleSetVariant returns [EObject current=null] : (otherlv_0= With otherlv_1= All otherlv_2= Versions otherlv_3= Of otherlv_4= Variant ( (lv_name_5_0= RULE_DATE ) ) ) ;
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
            // InternalFeatureLangParser.g:1581:2: ( (otherlv_0= With otherlv_1= All otherlv_2= Versions otherlv_3= Of otherlv_4= Variant ( (lv_name_5_0= RULE_DATE ) ) ) )
            // InternalFeatureLangParser.g:1582:2: (otherlv_0= With otherlv_1= All otherlv_2= Versions otherlv_3= Of otherlv_4= Variant ( (lv_name_5_0= RULE_DATE ) ) )
            {
            // InternalFeatureLangParser.g:1582:2: (otherlv_0= With otherlv_1= All otherlv_2= Versions otherlv_3= Of otherlv_4= Variant ( (lv_name_5_0= RULE_DATE ) ) )
            // InternalFeatureLangParser.g:1583:3: otherlv_0= With otherlv_1= All otherlv_2= Versions otherlv_3= Of otherlv_4= Variant ( (lv_name_5_0= RULE_DATE ) )
            {
            otherlv_0=(Token)match(input,With,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getSetVariantAccess().getWithKeyword_0());
            		
            otherlv_1=(Token)match(input,All,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getSetVariantAccess().getAllKeyword_1());
            		
            otherlv_2=(Token)match(input,Versions,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getSetVariantAccess().getVersionsKeyword_2());
            		
            otherlv_3=(Token)match(input,Of,FOLLOW_42); 

            			newLeafNode(otherlv_3, grammarAccess.getSetVariantAccess().getOfKeyword_3());
            		
            otherlv_4=(Token)match(input,Variant,FOLLOW_36); 

            			newLeafNode(otherlv_4, grammarAccess.getSetVariantAccess().getVariantKeyword_4());
            		
            // InternalFeatureLangParser.g:1603:3: ( (lv_name_5_0= RULE_DATE ) )
            // InternalFeatureLangParser.g:1604:4: (lv_name_5_0= RULE_DATE )
            {
            // InternalFeatureLangParser.g:1604:4: (lv_name_5_0= RULE_DATE )
            // InternalFeatureLangParser.g:1605:5: lv_name_5_0= RULE_DATE
            {
            lv_name_5_0=(Token)match(input,RULE_DATE,FOLLOW_2); 

            					newLeafNode(lv_name_5_0, grammarAccess.getSetVariantAccess().getNameDATETerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetVariantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"de.tud.st.featurelang.FeatureLang.DATE");
            				

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


    // $ANTLR start "entryRuleSetLeftOpen"
    // InternalFeatureLangParser.g:1628:1: entryRuleSetLeftOpen returns [EObject current=null] : iv_ruleSetLeftOpen= ruleSetLeftOpen EOF ;
    public final EObject entryRuleSetLeftOpen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetLeftOpen = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1630:2: (iv_ruleSetLeftOpen= ruleSetLeftOpen EOF )
            // InternalFeatureLangParser.g:1631:2: iv_ruleSetLeftOpen= ruleSetLeftOpen EOF
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
    // InternalFeatureLangParser.g:1640:1: ruleSetLeftOpen returns [EObject current=null] : (otherlv_0= Up otherlv_1= To otherlv_2= Date ( (lv_date_3_0= RULE_DATE ) ) ) ;
    public final EObject ruleSetLeftOpen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_date_3_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1647:2: ( (otherlv_0= Up otherlv_1= To otherlv_2= Date ( (lv_date_3_0= RULE_DATE ) ) ) )
            // InternalFeatureLangParser.g:1648:2: (otherlv_0= Up otherlv_1= To otherlv_2= Date ( (lv_date_3_0= RULE_DATE ) ) )
            {
            // InternalFeatureLangParser.g:1648:2: (otherlv_0= Up otherlv_1= To otherlv_2= Date ( (lv_date_3_0= RULE_DATE ) ) )
            // InternalFeatureLangParser.g:1649:3: otherlv_0= Up otherlv_1= To otherlv_2= Date ( (lv_date_3_0= RULE_DATE ) )
            {
            otherlv_0=(Token)match(input,Up,FOLLOW_39); 

            			newLeafNode(otherlv_0, grammarAccess.getSetLeftOpenAccess().getUpKeyword_0());
            		
            otherlv_1=(Token)match(input,To,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getSetLeftOpenAccess().getToKeyword_1());
            		
            otherlv_2=(Token)match(input,Date,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getSetLeftOpenAccess().getDateKeyword_2());
            		
            // InternalFeatureLangParser.g:1661:3: ( (lv_date_3_0= RULE_DATE ) )
            // InternalFeatureLangParser.g:1662:4: (lv_date_3_0= RULE_DATE )
            {
            // InternalFeatureLangParser.g:1662:4: (lv_date_3_0= RULE_DATE )
            // InternalFeatureLangParser.g:1663:5: lv_date_3_0= RULE_DATE
            {
            lv_date_3_0=(Token)match(input,RULE_DATE,FOLLOW_2); 

            					newLeafNode(lv_date_3_0, grammarAccess.getSetLeftOpenAccess().getDateDATETerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetLeftOpenRule());
            					}
            					setWithLastConsumed(
            						current,
            						"date",
            						lv_date_3_0,
            						"de.tud.st.featurelang.FeatureLang.DATE");
            				

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


    // $ANTLR start "entryRuleSetRightOpen"
    // InternalFeatureLangParser.g:1686:1: entryRuleSetRightOpen returns [EObject current=null] : iv_ruleSetRightOpen= ruleSetRightOpen EOF ;
    public final EObject entryRuleSetRightOpen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetRightOpen = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1688:2: (iv_ruleSetRightOpen= ruleSetRightOpen EOF )
            // InternalFeatureLangParser.g:1689:2: iv_ruleSetRightOpen= ruleSetRightOpen EOF
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
    // InternalFeatureLangParser.g:1698:1: ruleSetRightOpen returns [EObject current=null] : (otherlv_0= Starting otherlv_1= From otherlv_2= Date ( (lv_date_3_0= RULE_DATE ) ) ) ;
    public final EObject ruleSetRightOpen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_date_3_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1705:2: ( (otherlv_0= Starting otherlv_1= From otherlv_2= Date ( (lv_date_3_0= RULE_DATE ) ) ) )
            // InternalFeatureLangParser.g:1706:2: (otherlv_0= Starting otherlv_1= From otherlv_2= Date ( (lv_date_3_0= RULE_DATE ) ) )
            {
            // InternalFeatureLangParser.g:1706:2: (otherlv_0= Starting otherlv_1= From otherlv_2= Date ( (lv_date_3_0= RULE_DATE ) ) )
            // InternalFeatureLangParser.g:1707:3: otherlv_0= Starting otherlv_1= From otherlv_2= Date ( (lv_date_3_0= RULE_DATE ) )
            {
            otherlv_0=(Token)match(input,Starting,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getSetRightOpenAccess().getStartingKeyword_0());
            		
            otherlv_1=(Token)match(input,From,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getSetRightOpenAccess().getFromKeyword_1());
            		
            otherlv_2=(Token)match(input,Date,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getSetRightOpenAccess().getDateKeyword_2());
            		
            // InternalFeatureLangParser.g:1719:3: ( (lv_date_3_0= RULE_DATE ) )
            // InternalFeatureLangParser.g:1720:4: (lv_date_3_0= RULE_DATE )
            {
            // InternalFeatureLangParser.g:1720:4: (lv_date_3_0= RULE_DATE )
            // InternalFeatureLangParser.g:1721:5: lv_date_3_0= RULE_DATE
            {
            lv_date_3_0=(Token)match(input,RULE_DATE,FOLLOW_2); 

            					newLeafNode(lv_date_3_0, grammarAccess.getSetRightOpenAccess().getDateDATETerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetRightOpenRule());
            					}
            					setWithLastConsumed(
            						current,
            						"date",
            						lv_date_3_0,
            						"de.tud.st.featurelang.FeatureLang.DATE");
            				

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


    // $ANTLR start "entryRuleInheritanceAction"
    // InternalFeatureLangParser.g:1744:1: entryRuleInheritanceAction returns [EObject current=null] : iv_ruleInheritanceAction= ruleInheritanceAction EOF ;
    public final EObject entryRuleInheritanceAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInheritanceAction = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1746:2: (iv_ruleInheritanceAction= ruleInheritanceAction EOF )
            // InternalFeatureLangParser.g:1747:2: iv_ruleInheritanceAction= ruleInheritanceAction EOF
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
    // InternalFeatureLangParser.g:1756:1: ruleInheritanceAction returns [EObject current=null] : ( (otherlv_0= Inherit | otherlv_1= Inheritance ) otherlv_2= From ( (lv_parent_3_0= ruleClass ) ) ) ;
    public final EObject ruleInheritanceAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_parent_3_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1763:2: ( ( (otherlv_0= Inherit | otherlv_1= Inheritance ) otherlv_2= From ( (lv_parent_3_0= ruleClass ) ) ) )
            // InternalFeatureLangParser.g:1764:2: ( (otherlv_0= Inherit | otherlv_1= Inheritance ) otherlv_2= From ( (lv_parent_3_0= ruleClass ) ) )
            {
            // InternalFeatureLangParser.g:1764:2: ( (otherlv_0= Inherit | otherlv_1= Inheritance ) otherlv_2= From ( (lv_parent_3_0= ruleClass ) ) )
            // InternalFeatureLangParser.g:1765:3: (otherlv_0= Inherit | otherlv_1= Inheritance ) otherlv_2= From ( (lv_parent_3_0= ruleClass ) )
            {
            // InternalFeatureLangParser.g:1765:3: (otherlv_0= Inherit | otherlv_1= Inheritance )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Inherit) ) {
                alt30=1;
            }
            else if ( (LA30_0==Inheritance) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalFeatureLangParser.g:1766:4: otherlv_0= Inherit
                    {
                    otherlv_0=(Token)match(input,Inherit,FOLLOW_38); 

                    				newLeafNode(otherlv_0, grammarAccess.getInheritanceActionAccess().getInheritKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1771:4: otherlv_1= Inheritance
                    {
                    otherlv_1=(Token)match(input,Inheritance,FOLLOW_38); 

                    				newLeafNode(otherlv_1, grammarAccess.getInheritanceActionAccess().getInheritanceKeyword_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,From,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getInheritanceActionAccess().getFromKeyword_1());
            		
            // InternalFeatureLangParser.g:1780:3: ( (lv_parent_3_0= ruleClass ) )
            // InternalFeatureLangParser.g:1781:4: (lv_parent_3_0= ruleClass )
            {
            // InternalFeatureLangParser.g:1781:4: (lv_parent_3_0= ruleClass )
            // InternalFeatureLangParser.g:1782:5: lv_parent_3_0= ruleClass
            {

            					newCompositeNode(grammarAccess.getInheritanceActionAccess().getParentClassParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_parent_3_0=ruleClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInheritanceActionRule());
            					}
            					set(
            						current,
            						"parent",
            						lv_parent_3_0,
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
    // InternalFeatureLangParser.g:1806:1: entryRuleCompositionAction returns [EObject current=null] : iv_ruleCompositionAction= ruleCompositionAction EOF ;
    public final EObject entryRuleCompositionAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionAction = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1808:2: (iv_ruleCompositionAction= ruleCompositionAction EOF )
            // InternalFeatureLangParser.g:1809:2: iv_ruleCompositionAction= ruleCompositionAction EOF
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
    // InternalFeatureLangParser.g:1818:1: ruleCompositionAction returns [EObject current=null] : ( ( (lv_create_0_0= ruleCreateComposition ) ) | ( (lv_edit_1_0= ruleEditComposition ) ) ) ;
    public final EObject ruleCompositionAction() throws RecognitionException {
        EObject current = null;

        EObject lv_create_0_0 = null;

        EObject lv_edit_1_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1825:2: ( ( ( (lv_create_0_0= ruleCreateComposition ) ) | ( (lv_edit_1_0= ruleEditComposition ) ) ) )
            // InternalFeatureLangParser.g:1826:2: ( ( (lv_create_0_0= ruleCreateComposition ) ) | ( (lv_edit_1_0= ruleEditComposition ) ) )
            {
            // InternalFeatureLangParser.g:1826:2: ( ( (lv_create_0_0= ruleCreateComposition ) ) | ( (lv_edit_1_0= ruleEditComposition ) ) )
            int alt31=2;
            switch ( input.LA(1) ) {
            case Compose:
                {
                alt31=1;
                }
                break;
            case Composition:
                {
                int LA31_2 = input.LA(2);

                if ( (LA31_2==RULE_ID) ) {
                    alt31=2;
                }
                else if ( (LA31_2==To) ) {
                    alt31=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 2, input);

                    throw nvae;
                }
                }
                break;
            case Have:
                {
                alt31=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalFeatureLangParser.g:1827:3: ( (lv_create_0_0= ruleCreateComposition ) )
                    {
                    // InternalFeatureLangParser.g:1827:3: ( (lv_create_0_0= ruleCreateComposition ) )
                    // InternalFeatureLangParser.g:1828:4: (lv_create_0_0= ruleCreateComposition )
                    {
                    // InternalFeatureLangParser.g:1828:4: (lv_create_0_0= ruleCreateComposition )
                    // InternalFeatureLangParser.g:1829:5: lv_create_0_0= ruleCreateComposition
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
                    // InternalFeatureLangParser.g:1847:3: ( (lv_edit_1_0= ruleEditComposition ) )
                    {
                    // InternalFeatureLangParser.g:1847:3: ( (lv_edit_1_0= ruleEditComposition ) )
                    // InternalFeatureLangParser.g:1848:4: (lv_edit_1_0= ruleEditComposition )
                    {
                    // InternalFeatureLangParser.g:1848:4: (lv_edit_1_0= ruleEditComposition )
                    // InternalFeatureLangParser.g:1849:5: lv_edit_1_0= ruleEditComposition
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
    // InternalFeatureLangParser.g:1873:1: entryRuleCreateComposition returns [EObject current=null] : iv_ruleCreateComposition= ruleCreateComposition EOF ;
    public final EObject entryRuleCreateComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateComposition = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1875:2: (iv_ruleCreateComposition= ruleCreateComposition EOF )
            // InternalFeatureLangParser.g:1876:2: iv_ruleCreateComposition= ruleCreateComposition EOF
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
    // InternalFeatureLangParser.g:1885:1: ruleCreateComposition returns [EObject current=null] : ( (otherlv_0= Compose | (otherlv_1= Composition otherlv_2= To ) ) ( (lv_target_3_0= ruleClass ) ) otherlv_4= Called ( (lv_relation_5_0= RULE_ID ) ) (otherlv_6= FullStop otherlv_7= It ( (lv_priority_8_0= rulePriority ) ) otherlv_9= Be ( (lv_publicity_10_0= rulePublicity ) ) )? ) ;
    public final EObject ruleCreateComposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_relation_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_target_3_0 = null;

        EObject lv_priority_8_0 = null;

        Enumerator lv_publicity_10_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:1892:2: ( ( (otherlv_0= Compose | (otherlv_1= Composition otherlv_2= To ) ) ( (lv_target_3_0= ruleClass ) ) otherlv_4= Called ( (lv_relation_5_0= RULE_ID ) ) (otherlv_6= FullStop otherlv_7= It ( (lv_priority_8_0= rulePriority ) ) otherlv_9= Be ( (lv_publicity_10_0= rulePublicity ) ) )? ) )
            // InternalFeatureLangParser.g:1893:2: ( (otherlv_0= Compose | (otherlv_1= Composition otherlv_2= To ) ) ( (lv_target_3_0= ruleClass ) ) otherlv_4= Called ( (lv_relation_5_0= RULE_ID ) ) (otherlv_6= FullStop otherlv_7= It ( (lv_priority_8_0= rulePriority ) ) otherlv_9= Be ( (lv_publicity_10_0= rulePublicity ) ) )? )
            {
            // InternalFeatureLangParser.g:1893:2: ( (otherlv_0= Compose | (otherlv_1= Composition otherlv_2= To ) ) ( (lv_target_3_0= ruleClass ) ) otherlv_4= Called ( (lv_relation_5_0= RULE_ID ) ) (otherlv_6= FullStop otherlv_7= It ( (lv_priority_8_0= rulePriority ) ) otherlv_9= Be ( (lv_publicity_10_0= rulePublicity ) ) )? )
            // InternalFeatureLangParser.g:1894:3: (otherlv_0= Compose | (otherlv_1= Composition otherlv_2= To ) ) ( (lv_target_3_0= ruleClass ) ) otherlv_4= Called ( (lv_relation_5_0= RULE_ID ) ) (otherlv_6= FullStop otherlv_7= It ( (lv_priority_8_0= rulePriority ) ) otherlv_9= Be ( (lv_publicity_10_0= rulePublicity ) ) )?
            {
            // InternalFeatureLangParser.g:1894:3: (otherlv_0= Compose | (otherlv_1= Composition otherlv_2= To ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Compose) ) {
                alt32=1;
            }
            else if ( (LA32_0==Composition) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalFeatureLangParser.g:1895:4: otherlv_0= Compose
                    {
                    otherlv_0=(Token)match(input,Compose,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getCreateCompositionAccess().getComposeKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1900:4: (otherlv_1= Composition otherlv_2= To )
                    {
                    // InternalFeatureLangParser.g:1900:4: (otherlv_1= Composition otherlv_2= To )
                    // InternalFeatureLangParser.g:1901:5: otherlv_1= Composition otherlv_2= To
                    {
                    otherlv_1=(Token)match(input,Composition,FOLLOW_39); 

                    					newLeafNode(otherlv_1, grammarAccess.getCreateCompositionAccess().getCompositionKeyword_0_1_0());
                    				
                    otherlv_2=(Token)match(input,To,FOLLOW_8); 

                    					newLeafNode(otherlv_2, grammarAccess.getCreateCompositionAccess().getToKeyword_0_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalFeatureLangParser.g:1911:3: ( (lv_target_3_0= ruleClass ) )
            // InternalFeatureLangParser.g:1912:4: (lv_target_3_0= ruleClass )
            {
            // InternalFeatureLangParser.g:1912:4: (lv_target_3_0= ruleClass )
            // InternalFeatureLangParser.g:1913:5: lv_target_3_0= ruleClass
            {

            					newCompositeNode(grammarAccess.getCreateCompositionAccess().getTargetClassParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_32);
            lv_target_3_0=ruleClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreateCompositionRule());
            					}
            					set(
            						current,
            						"target",
            						lv_target_3_0,
            						"de.tud.st.featurelang.FeatureLang.Class");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,Called,FOLLOW_33); 

            			newLeafNode(otherlv_4, grammarAccess.getCreateCompositionAccess().getCalledKeyword_2());
            		
            // InternalFeatureLangParser.g:1934:3: ( (lv_relation_5_0= RULE_ID ) )
            // InternalFeatureLangParser.g:1935:4: (lv_relation_5_0= RULE_ID )
            {
            // InternalFeatureLangParser.g:1935:4: (lv_relation_5_0= RULE_ID )
            // InternalFeatureLangParser.g:1936:5: lv_relation_5_0= RULE_ID
            {
            lv_relation_5_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_relation_5_0, grammarAccess.getCreateCompositionAccess().getRelationIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCreateCompositionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"relation",
            						lv_relation_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalFeatureLangParser.g:1952:3: (otherlv_6= FullStop otherlv_7= It ( (lv_priority_8_0= rulePriority ) ) otherlv_9= Be ( (lv_publicity_10_0= rulePublicity ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==FullStop) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==It) ) {
                    alt33=1;
                }
            }
            switch (alt33) {
                case 1 :
                    // InternalFeatureLangParser.g:1953:4: otherlv_6= FullStop otherlv_7= It ( (lv_priority_8_0= rulePriority ) ) otherlv_9= Be ( (lv_publicity_10_0= rulePublicity ) )
                    {
                    otherlv_6=(Token)match(input,FullStop,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getCreateCompositionAccess().getFullStopKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,It,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getCreateCompositionAccess().getItKeyword_4_1());
                    			
                    // InternalFeatureLangParser.g:1961:4: ( (lv_priority_8_0= rulePriority ) )
                    // InternalFeatureLangParser.g:1962:5: (lv_priority_8_0= rulePriority )
                    {
                    // InternalFeatureLangParser.g:1962:5: (lv_priority_8_0= rulePriority )
                    // InternalFeatureLangParser.g:1963:6: lv_priority_8_0= rulePriority
                    {

                    						newCompositeNode(grammarAccess.getCreateCompositionAccess().getPriorityPriorityParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_priority_8_0=rulePriority();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCreateCompositionRule());
                    						}
                    						set(
                    							current,
                    							"priority",
                    							lv_priority_8_0,
                    							"de.tud.st.featurelang.FeatureLang.Priority");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,Be,FOLLOW_45); 

                    				newLeafNode(otherlv_9, grammarAccess.getCreateCompositionAccess().getBeKeyword_4_3());
                    			
                    // InternalFeatureLangParser.g:1984:4: ( (lv_publicity_10_0= rulePublicity ) )
                    // InternalFeatureLangParser.g:1985:5: (lv_publicity_10_0= rulePublicity )
                    {
                    // InternalFeatureLangParser.g:1985:5: (lv_publicity_10_0= rulePublicity )
                    // InternalFeatureLangParser.g:1986:6: lv_publicity_10_0= rulePublicity
                    {

                    						newCompositeNode(grammarAccess.getCreateCompositionAccess().getPublicityPublicityEnumRuleCall_4_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_publicity_10_0=rulePublicity();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCreateCompositionRule());
                    						}
                    						set(
                    							current,
                    							"publicity",
                    							lv_publicity_10_0,
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
    // InternalFeatureLangParser.g:2011:1: entryRuleEditComposition returns [EObject current=null] : iv_ruleEditComposition= ruleEditComposition EOF ;
    public final EObject entryRuleEditComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEditComposition = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:2013:2: (iv_ruleEditComposition= ruleEditComposition EOF )
            // InternalFeatureLangParser.g:2014:2: iv_ruleEditComposition= ruleEditComposition EOF
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
    // InternalFeatureLangParser.g:2023:1: ruleEditComposition returns [EObject current=null] : ( (otherlv_0= Have )? otherlv_1= Composition ( (lv_compositionName_2_0= RULE_ID ) ) otherlv_3= That otherlv_4= Is ( (lv_publicity_5_0= rulePublicity ) ) ) ;
    public final EObject ruleEditComposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_compositionName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Enumerator lv_publicity_5_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:2030:2: ( ( (otherlv_0= Have )? otherlv_1= Composition ( (lv_compositionName_2_0= RULE_ID ) ) otherlv_3= That otherlv_4= Is ( (lv_publicity_5_0= rulePublicity ) ) ) )
            // InternalFeatureLangParser.g:2031:2: ( (otherlv_0= Have )? otherlv_1= Composition ( (lv_compositionName_2_0= RULE_ID ) ) otherlv_3= That otherlv_4= Is ( (lv_publicity_5_0= rulePublicity ) ) )
            {
            // InternalFeatureLangParser.g:2031:2: ( (otherlv_0= Have )? otherlv_1= Composition ( (lv_compositionName_2_0= RULE_ID ) ) otherlv_3= That otherlv_4= Is ( (lv_publicity_5_0= rulePublicity ) ) )
            // InternalFeatureLangParser.g:2032:3: (otherlv_0= Have )? otherlv_1= Composition ( (lv_compositionName_2_0= RULE_ID ) ) otherlv_3= That otherlv_4= Is ( (lv_publicity_5_0= rulePublicity ) )
            {
            // InternalFeatureLangParser.g:2032:3: (otherlv_0= Have )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==Have) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalFeatureLangParser.g:2033:4: otherlv_0= Have
                    {
                    otherlv_0=(Token)match(input,Have,FOLLOW_46); 

                    				newLeafNode(otherlv_0, grammarAccess.getEditCompositionAccess().getHaveKeyword_0());
                    			

                    }
                    break;

            }

            otherlv_1=(Token)match(input,Composition,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getEditCompositionAccess().getCompositionKeyword_1());
            		
            // InternalFeatureLangParser.g:2042:3: ( (lv_compositionName_2_0= RULE_ID ) )
            // InternalFeatureLangParser.g:2043:4: (lv_compositionName_2_0= RULE_ID )
            {
            // InternalFeatureLangParser.g:2043:4: (lv_compositionName_2_0= RULE_ID )
            // InternalFeatureLangParser.g:2044:5: lv_compositionName_2_0= RULE_ID
            {
            lv_compositionName_2_0=(Token)match(input,RULE_ID,FOLLOW_47); 

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

            otherlv_3=(Token)match(input,That,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getEditCompositionAccess().getThatKeyword_3());
            		
            otherlv_4=(Token)match(input,Is,FOLLOW_45); 

            			newLeafNode(otherlv_4, grammarAccess.getEditCompositionAccess().getIsKeyword_4());
            		
            // InternalFeatureLangParser.g:2068:3: ( (lv_publicity_5_0= rulePublicity ) )
            // InternalFeatureLangParser.g:2069:4: (lv_publicity_5_0= rulePublicity )
            {
            // InternalFeatureLangParser.g:2069:4: (lv_publicity_5_0= rulePublicity )
            // InternalFeatureLangParser.g:2070:5: lv_publicity_5_0= rulePublicity
            {

            					newCompositeNode(grammarAccess.getEditCompositionAccess().getPublicityPublicityEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_publicity_5_0=rulePublicity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEditCompositionRule());
            					}
            					set(
            						current,
            						"publicity",
            						lv_publicity_5_0,
            						"de.tud.st.featurelang.FeatureLang.Publicity");
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
    // $ANTLR end "ruleEditComposition"


    // $ANTLR start "entryRuleClass"
    // InternalFeatureLangParser.g:2094:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:2096:2: (iv_ruleClass= ruleClass EOF )
            // InternalFeatureLangParser.g:2097:2: iv_ruleClass= ruleClass EOF
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
    // InternalFeatureLangParser.g:2106:1: ruleClass returns [EObject current=null] : ( (otherlv_0= The | otherlv_1= A )? ( (lv_abstraction_2_0= ruleAbstraction ) )? (otherlv_3= Class )? ( (lv_name_4_0= RULE_ID ) ) ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Enumerator lv_abstraction_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:2113:2: ( ( (otherlv_0= The | otherlv_1= A )? ( (lv_abstraction_2_0= ruleAbstraction ) )? (otherlv_3= Class )? ( (lv_name_4_0= RULE_ID ) ) ) )
            // InternalFeatureLangParser.g:2114:2: ( (otherlv_0= The | otherlv_1= A )? ( (lv_abstraction_2_0= ruleAbstraction ) )? (otherlv_3= Class )? ( (lv_name_4_0= RULE_ID ) ) )
            {
            // InternalFeatureLangParser.g:2114:2: ( (otherlv_0= The | otherlv_1= A )? ( (lv_abstraction_2_0= ruleAbstraction ) )? (otherlv_3= Class )? ( (lv_name_4_0= RULE_ID ) ) )
            // InternalFeatureLangParser.g:2115:3: (otherlv_0= The | otherlv_1= A )? ( (lv_abstraction_2_0= ruleAbstraction ) )? (otherlv_3= Class )? ( (lv_name_4_0= RULE_ID ) )
            {
            // InternalFeatureLangParser.g:2115:3: (otherlv_0= The | otherlv_1= A )?
            int alt35=3;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==The) ) {
                alt35=1;
            }
            else if ( (LA35_0==A) ) {
                alt35=2;
            }
            switch (alt35) {
                case 1 :
                    // InternalFeatureLangParser.g:2116:4: otherlv_0= The
                    {
                    otherlv_0=(Token)match(input,The,FOLLOW_48); 

                    				newLeafNode(otherlv_0, grammarAccess.getClassAccess().getTheKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:2121:4: otherlv_1= A
                    {
                    otherlv_1=(Token)match(input,A,FOLLOW_48); 

                    				newLeafNode(otherlv_1, grammarAccess.getClassAccess().getAKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalFeatureLangParser.g:2126:3: ( (lv_abstraction_2_0= ruleAbstraction ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Abstract||LA36_0==New) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalFeatureLangParser.g:2127:4: (lv_abstraction_2_0= ruleAbstraction )
                    {
                    // InternalFeatureLangParser.g:2127:4: (lv_abstraction_2_0= ruleAbstraction )
                    // InternalFeatureLangParser.g:2128:5: lv_abstraction_2_0= ruleAbstraction
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getAbstractionAbstractionEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_49);
                    lv_abstraction_2_0=ruleAbstraction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClassRule());
                    					}
                    					set(
                    						current,
                    						"abstraction",
                    						lv_abstraction_2_0,
                    						"de.tud.st.featurelang.FeatureLang.Abstraction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalFeatureLangParser.g:2145:3: (otherlv_3= Class )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==Class) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalFeatureLangParser.g:2146:4: otherlv_3= Class
                    {
                    otherlv_3=(Token)match(input,Class,FOLLOW_33); 

                    				newLeafNode(otherlv_3, grammarAccess.getClassAccess().getClassKeyword_2());
                    			

                    }
                    break;

            }

            // InternalFeatureLangParser.g:2151:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalFeatureLangParser.g:2152:4: (lv_name_4_0= RULE_ID )
            {
            // InternalFeatureLangParser.g:2152:4: (lv_name_4_0= RULE_ID )
            // InternalFeatureLangParser.g:2153:5: lv_name_4_0= RULE_ID
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
    // InternalFeatureLangParser.g:2176:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:2178:2: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalFeatureLangParser.g:2179:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalFeatureLangParser.g:2188:1: ruleAttribute returns [EObject current=null] : ( (otherlv_0= Attribute )? ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:2195:2: ( ( (otherlv_0= Attribute )? ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalFeatureLangParser.g:2196:2: ( (otherlv_0= Attribute )? ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalFeatureLangParser.g:2196:2: ( (otherlv_0= Attribute )? ( (lv_name_1_0= RULE_ID ) ) )
            // InternalFeatureLangParser.g:2197:3: (otherlv_0= Attribute )? ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalFeatureLangParser.g:2197:3: (otherlv_0= Attribute )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==Attribute) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalFeatureLangParser.g:2198:4: otherlv_0= Attribute
                    {
                    otherlv_0=(Token)match(input,Attribute,FOLLOW_33); 

                    				newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
                    			

                    }
                    break;

            }

            // InternalFeatureLangParser.g:2203:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFeatureLangParser.g:2204:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFeatureLangParser.g:2204:4: (lv_name_1_0= RULE_ID )
            // InternalFeatureLangParser.g:2205:5: lv_name_1_0= RULE_ID
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
    // InternalFeatureLangParser.g:2228:1: entryRuleIdentifier returns [EObject current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final EObject entryRuleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifier = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:2230:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // InternalFeatureLangParser.g:2231:2: iv_ruleIdentifier= ruleIdentifier EOF
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
    // InternalFeatureLangParser.g:2240:1: ruleIdentifier returns [EObject current=null] : ( ( (lv_value_0_0= ruleIdentifierValue ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleIdentifier() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_value_0_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:2247:2: ( ( ( (lv_value_0_0= ruleIdentifierValue ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalFeatureLangParser.g:2248:2: ( ( (lv_value_0_0= ruleIdentifierValue ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalFeatureLangParser.g:2248:2: ( ( (lv_value_0_0= ruleIdentifierValue ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalFeatureLangParser.g:2249:3: ( (lv_value_0_0= ruleIdentifierValue ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalFeatureLangParser.g:2249:3: ( (lv_value_0_0= ruleIdentifierValue ) )
            // InternalFeatureLangParser.g:2250:4: (lv_value_0_0= ruleIdentifierValue )
            {
            // InternalFeatureLangParser.g:2250:4: (lv_value_0_0= ruleIdentifierValue )
            // InternalFeatureLangParser.g:2251:5: lv_value_0_0= ruleIdentifierValue
            {

            					newCompositeNode(grammarAccess.getIdentifierAccess().getValueIdentifierValueEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_33);
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

            // InternalFeatureLangParser.g:2268:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFeatureLangParser.g:2269:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFeatureLangParser.g:2269:4: (lv_name_1_0= RULE_ID )
            // InternalFeatureLangParser.g:2270:5: lv_name_1_0= RULE_ID
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
    // InternalFeatureLangParser.g:2293:1: entryRulePriority returns [EObject current=null] : iv_rulePriority= rulePriority EOF ;
    public final EObject entryRulePriority() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePriority = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:2295:2: (iv_rulePriority= rulePriority EOF )
            // InternalFeatureLangParser.g:2296:2: iv_rulePriority= rulePriority EOF
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
    // InternalFeatureLangParser.g:2305:1: rulePriority returns [EObject current=null] : ( (lv_priority_0_0= rulePriorityValue ) ) ;
    public final EObject rulePriority() throws RecognitionException {
        EObject current = null;

        Enumerator lv_priority_0_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:2312:2: ( ( (lv_priority_0_0= rulePriorityValue ) ) )
            // InternalFeatureLangParser.g:2313:2: ( (lv_priority_0_0= rulePriorityValue ) )
            {
            // InternalFeatureLangParser.g:2313:2: ( (lv_priority_0_0= rulePriorityValue ) )
            // InternalFeatureLangParser.g:2314:3: (lv_priority_0_0= rulePriorityValue )
            {
            // InternalFeatureLangParser.g:2314:3: (lv_priority_0_0= rulePriorityValue )
            // InternalFeatureLangParser.g:2315:4: lv_priority_0_0= rulePriorityValue
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


    // $ANTLR start "entryRuleAttributeValue"
    // InternalFeatureLangParser.g:2338:1: entryRuleAttributeValue returns [String current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final String entryRuleAttributeValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeValue = null;


        try {
            // InternalFeatureLangParser.g:2338:54: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // InternalFeatureLangParser.g:2339:2: iv_ruleAttributeValue= ruleAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getAttributeValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeValue=ruleAttributeValue();

            state._fsp--;

             current =iv_ruleAttributeValue.getText(); 
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
    // $ANTLR end "entryRuleAttributeValue"


    // $ANTLR start "ruleAttributeValue"
    // InternalFeatureLangParser.g:2345:1: ruleAttributeValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID (kw= CarriageReturn )? )+ | this_INT_2= RULE_INT | this_DATE_3= RULE_DATE ) ;
    public final AntlrDatatypeRuleToken ruleAttributeValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_DATE_3=null;


        	enterRule();

        try {
            // InternalFeatureLangParser.g:2351:2: ( ( (this_ID_0= RULE_ID (kw= CarriageReturn )? )+ | this_INT_2= RULE_INT | this_DATE_3= RULE_DATE ) )
            // InternalFeatureLangParser.g:2352:2: ( (this_ID_0= RULE_ID (kw= CarriageReturn )? )+ | this_INT_2= RULE_INT | this_DATE_3= RULE_DATE )
            {
            // InternalFeatureLangParser.g:2352:2: ( (this_ID_0= RULE_ID (kw= CarriageReturn )? )+ | this_INT_2= RULE_INT | this_DATE_3= RULE_DATE )
            int alt41=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt41=1;
                }
                break;
            case RULE_INT:
                {
                alt41=2;
                }
                break;
            case RULE_DATE:
                {
                alt41=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalFeatureLangParser.g:2353:3: (this_ID_0= RULE_ID (kw= CarriageReturn )? )+
                    {
                    // InternalFeatureLangParser.g:2353:3: (this_ID_0= RULE_ID (kw= CarriageReturn )? )+
                    int cnt40=0;
                    loop40:
                    do {
                        int alt40=2;
                        alt40 = dfa40.predict(input);
                        switch (alt40) {
                    	case 1 :
                    	    // InternalFeatureLangParser.g:2354:4: this_ID_0= RULE_ID (kw= CarriageReturn )?
                    	    {
                    	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_50); 

                    	    				current.merge(this_ID_0);
                    	    			

                    	    				newLeafNode(this_ID_0, grammarAccess.getAttributeValueAccess().getIDTerminalRuleCall_0_0());
                    	    			
                    	    // InternalFeatureLangParser.g:2361:4: (kw= CarriageReturn )?
                    	    int alt39=2;
                    	    int LA39_0 = input.LA(1);

                    	    if ( (LA39_0==CarriageReturn) ) {
                    	        alt39=1;
                    	    }
                    	    switch (alt39) {
                    	        case 1 :
                    	            // InternalFeatureLangParser.g:2362:5: kw= CarriageReturn
                    	            {
                    	            kw=(Token)match(input,CarriageReturn,FOLLOW_51); 

                    	            					current.merge(kw);
                    	            					newLeafNode(kw, grammarAccess.getAttributeValueAccess().getCarriageReturnKeyword_0_1());
                    	            				

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt40 >= 1 ) break loop40;
                                EarlyExitException eee =
                                    new EarlyExitException(40, input);
                                throw eee;
                        }
                        cnt40++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:2370:3: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_2);
                    		

                    			newLeafNode(this_INT_2, grammarAccess.getAttributeValueAccess().getINTTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalFeatureLangParser.g:2378:3: this_DATE_3= RULE_DATE
                    {
                    this_DATE_3=(Token)match(input,RULE_DATE,FOLLOW_2); 

                    			current.merge(this_DATE_3);
                    		

                    			newLeafNode(this_DATE_3, grammarAccess.getAttributeValueAccess().getDATETerminalRuleCall_2());
                    		

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
    // $ANTLR end "ruleAttributeValue"


    // $ANTLR start "rulePublicity"
    // InternalFeatureLangParser.g:2389:1: rulePublicity returns [Enumerator current=null] : ( (enumLiteral_0= Public ) | (enumLiteral_1= Private ) ) ;
    public final Enumerator rulePublicity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFeatureLangParser.g:2395:2: ( ( (enumLiteral_0= Public ) | (enumLiteral_1= Private ) ) )
            // InternalFeatureLangParser.g:2396:2: ( (enumLiteral_0= Public ) | (enumLiteral_1= Private ) )
            {
            // InternalFeatureLangParser.g:2396:2: ( (enumLiteral_0= Public ) | (enumLiteral_1= Private ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==Public) ) {
                alt42=1;
            }
            else if ( (LA42_0==Private) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalFeatureLangParser.g:2397:3: (enumLiteral_0= Public )
                    {
                    // InternalFeatureLangParser.g:2397:3: (enumLiteral_0= Public )
                    // InternalFeatureLangParser.g:2398:4: enumLiteral_0= Public
                    {
                    enumLiteral_0=(Token)match(input,Public,FOLLOW_2); 

                    				current = grammarAccess.getPublicityAccess().getPUBLICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPublicityAccess().getPUBLICEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:2405:3: (enumLiteral_1= Private )
                    {
                    // InternalFeatureLangParser.g:2405:3: (enumLiteral_1= Private )
                    // InternalFeatureLangParser.g:2406:4: enumLiteral_1= Private
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
    // InternalFeatureLangParser.g:2416:1: rulePriorityValue returns [Enumerator current=null] : ( (enumLiteral_0= Should ) | (enumLiteral_1= Must ) ) ;
    public final Enumerator rulePriorityValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFeatureLangParser.g:2422:2: ( ( (enumLiteral_0= Should ) | (enumLiteral_1= Must ) ) )
            // InternalFeatureLangParser.g:2423:2: ( (enumLiteral_0= Should ) | (enumLiteral_1= Must ) )
            {
            // InternalFeatureLangParser.g:2423:2: ( (enumLiteral_0= Should ) | (enumLiteral_1= Must ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==Should) ) {
                alt43=1;
            }
            else if ( (LA43_0==Must) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalFeatureLangParser.g:2424:3: (enumLiteral_0= Should )
                    {
                    // InternalFeatureLangParser.g:2424:3: (enumLiteral_0= Should )
                    // InternalFeatureLangParser.g:2425:4: enumLiteral_0= Should
                    {
                    enumLiteral_0=(Token)match(input,Should,FOLLOW_2); 

                    				current = grammarAccess.getPriorityValueAccess().getSHOULDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPriorityValueAccess().getSHOULDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:2432:3: (enumLiteral_1= Must )
                    {
                    // InternalFeatureLangParser.g:2432:3: (enumLiteral_1= Must )
                    // InternalFeatureLangParser.g:2433:4: enumLiteral_1= Must
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
    // InternalFeatureLangParser.g:2443:1: ruleAbstraction returns [Enumerator current=null] : ( (enumLiteral_0= New ) | (enumLiteral_1= Abstract ) ) ;
    public final Enumerator ruleAbstraction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFeatureLangParser.g:2449:2: ( ( (enumLiteral_0= New ) | (enumLiteral_1= Abstract ) ) )
            // InternalFeatureLangParser.g:2450:2: ( (enumLiteral_0= New ) | (enumLiteral_1= Abstract ) )
            {
            // InternalFeatureLangParser.g:2450:2: ( (enumLiteral_0= New ) | (enumLiteral_1= Abstract ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==New) ) {
                alt44=1;
            }
            else if ( (LA44_0==Abstract) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalFeatureLangParser.g:2451:3: (enumLiteral_0= New )
                    {
                    // InternalFeatureLangParser.g:2451:3: (enumLiteral_0= New )
                    // InternalFeatureLangParser.g:2452:4: enumLiteral_0= New
                    {
                    enumLiteral_0=(Token)match(input,New,FOLLOW_2); 

                    				current = grammarAccess.getAbstractionAccess().getNEWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAbstractionAccess().getNEWEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:2459:3: (enumLiteral_1= Abstract )
                    {
                    // InternalFeatureLangParser.g:2459:3: (enumLiteral_1= Abstract )
                    // InternalFeatureLangParser.g:2460:4: enumLiteral_1= Abstract
                    {
                    enumLiteral_1=(Token)match(input,Abstract,FOLLOW_2); 

                    				current = grammarAccess.getAbstractionAccess().getABSTRACTIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAbstractionAccess().getABSTRACTIONEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleAbstraction"


    // $ANTLR start "ruleIdentifierValue"
    // InternalFeatureLangParser.g:2470:1: ruleIdentifierValue returns [Enumerator current=null] : ( (enumLiteral_0= Name ) | (enumLiteral_1= URI ) ) ;
    public final Enumerator ruleIdentifierValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFeatureLangParser.g:2476:2: ( ( (enumLiteral_0= Name ) | (enumLiteral_1= URI ) ) )
            // InternalFeatureLangParser.g:2477:2: ( (enumLiteral_0= Name ) | (enumLiteral_1= URI ) )
            {
            // InternalFeatureLangParser.g:2477:2: ( (enumLiteral_0= Name ) | (enumLiteral_1= URI ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==Name) ) {
                alt45=1;
            }
            else if ( (LA45_0==URI) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalFeatureLangParser.g:2478:3: (enumLiteral_0= Name )
                    {
                    // InternalFeatureLangParser.g:2478:3: (enumLiteral_0= Name )
                    // InternalFeatureLangParser.g:2479:4: enumLiteral_0= Name
                    {
                    enumLiteral_0=(Token)match(input,Name,FOLLOW_2); 

                    				current = grammarAccess.getIdentifierValueAccess().getNAMEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getIdentifierValueAccess().getNAMEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:2486:3: (enumLiteral_1= URI )
                    {
                    // InternalFeatureLangParser.g:2486:3: (enumLiteral_1= URI )
                    // InternalFeatureLangParser.g:2487:4: enumLiteral_1= URI
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
    // InternalFeatureLangParser.g:2497:1: ruleDatatype returns [Enumerator current=null] : ( (enumLiteral_0= DEFAULT ) | (enumLiteral_1= Time ) | (enumLiteral_2= Phrase ) | (enumLiteral_3= Number ) ) ;
    public final Enumerator ruleDatatype() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalFeatureLangParser.g:2503:2: ( ( (enumLiteral_0= DEFAULT ) | (enumLiteral_1= Time ) | (enumLiteral_2= Phrase ) | (enumLiteral_3= Number ) ) )
            // InternalFeatureLangParser.g:2504:2: ( (enumLiteral_0= DEFAULT ) | (enumLiteral_1= Time ) | (enumLiteral_2= Phrase ) | (enumLiteral_3= Number ) )
            {
            // InternalFeatureLangParser.g:2504:2: ( (enumLiteral_0= DEFAULT ) | (enumLiteral_1= Time ) | (enumLiteral_2= Phrase ) | (enumLiteral_3= Number ) )
            int alt46=4;
            switch ( input.LA(1) ) {
            case DEFAULT:
                {
                alt46=1;
                }
                break;
            case Time:
                {
                alt46=2;
                }
                break;
            case Phrase:
                {
                alt46=3;
                }
                break;
            case Number:
                {
                alt46=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalFeatureLangParser.g:2505:3: (enumLiteral_0= DEFAULT )
                    {
                    // InternalFeatureLangParser.g:2505:3: (enumLiteral_0= DEFAULT )
                    // InternalFeatureLangParser.g:2506:4: enumLiteral_0= DEFAULT
                    {
                    enumLiteral_0=(Token)match(input,DEFAULT,FOLLOW_2); 

                    				current = grammarAccess.getDatatypeAccess().getDEFAULTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDatatypeAccess().getDEFAULTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:2513:3: (enumLiteral_1= Time )
                    {
                    // InternalFeatureLangParser.g:2513:3: (enumLiteral_1= Time )
                    // InternalFeatureLangParser.g:2514:4: enumLiteral_1= Time
                    {
                    enumLiteral_1=(Token)match(input,Time,FOLLOW_2); 

                    				current = grammarAccess.getDatatypeAccess().getWORDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDatatypeAccess().getWORDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureLangParser.g:2521:3: (enumLiteral_2= Phrase )
                    {
                    // InternalFeatureLangParser.g:2521:3: (enumLiteral_2= Phrase )
                    // InternalFeatureLangParser.g:2522:4: enumLiteral_2= Phrase
                    {
                    enumLiteral_2=(Token)match(input,Phrase,FOLLOW_2); 

                    				current = grammarAccess.getDatatypeAccess().getPHRASEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDatatypeAccess().getPHRASEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalFeatureLangParser.g:2529:3: (enumLiteral_3= Number )
                    {
                    // InternalFeatureLangParser.g:2529:3: (enumLiteral_3= Number )
                    // InternalFeatureLangParser.g:2530:4: enumLiteral_3= Number
                    {
                    enumLiteral_3=(Token)match(input,Number,FOLLOW_2); 

                    				current = grammarAccess.getDatatypeAccess().getNUMBEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDatatypeAccess().getNUMBEREnumLiteralDeclaration_3());
                    			

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
    protected DFA40 dfa40 = new DFA40(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\3\12\2\37\1\100\1\4\2\uffff\3\4";
    static final String dfa_3s = "\6\100\1\75\2\uffff\3\75";
    static final String dfa_4s = "\7\uffff\1\1\1\2\3\uffff";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\14\uffff\1\7\2\10\3\uffff\1\7\1\uffff\1\5\17\uffff\1\3\1\uffff\1\7\1\1\12\uffff\1\2\2\uffff\1\6",
            "\1\4\24\uffff\1\5\17\uffff\1\3\20\uffff\1\6",
            "\1\4\24\uffff\1\5\17\uffff\1\3\20\uffff\1\6",
            "\1\5\40\uffff\1\6",
            "\1\5\40\uffff\1\6",
            "\1\6",
            "\4\7\7\uffff\1\7\1\uffff\1\7\14\uffff\1\11\7\uffff\1\7\1\12\6\uffff\1\7\3\uffff\2\7\11\uffff\1\7",
            "",
            "",
            "\4\7\7\uffff\1\7\1\uffff\1\7\16\uffff\1\10\5\uffff\1\7\7\uffff\1\7\1\uffff\1\13\1\uffff\2\7\1\10\10\uffff\1\7",
            "\4\7\7\uffff\1\7\1\uffff\1\7\16\uffff\1\10\5\uffff\1\7\7\uffff\1\7\1\uffff\1\13\1\uffff\2\7\1\10\10\uffff\1\7",
            "\4\7\7\uffff\1\7\1\uffff\1\7\16\uffff\1\10\5\uffff\1\7\7\uffff\1\7\3\uffff\2\7\1\10\10\uffff\1\7"
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
    static final String dfa_7s = "\12\uffff";
    static final String dfa_8s = "\1\1\1\uffff\1\3\3\uffff\1\1\2\uffff\1\3";
    static final String dfa_9s = "\1\12\1\uffff\1\4\1\uffff\2\11\1\4\2\11\1\4";
    static final String dfa_10s = "\1\100\1\uffff\1\100\1\uffff\6\100";
    static final String dfa_11s = "\1\uffff\1\2\1\uffff\1\1\6\uffff";
    static final String dfa_12s = "\12\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\7\uffff\1\1\4\uffff\3\1\3\uffff\1\1\1\uffff\1\1\17\uffff\1\1\1\uffff\2\1\11\uffff\2\1\2\uffff\1\2",
            "",
            "\4\1\2\uffff\1\3\4\uffff\1\1\1\uffff\1\1\1\3\4\uffff\3\3\3\uffff\1\3\1\1\1\3\6\uffff\2\1\6\uffff\1\1\1\3\1\uffff\1\3\1\4\1\1\7\uffff\2\3\1\5\2\uffff\1\3",
            "",
            "\1\1\1\3\1\1\4\uffff\1\1\16\uffff\1\3\17\uffff\1\3\20\uffff\1\6",
            "\1\1\1\3\1\1\4\uffff\1\1\16\uffff\1\3\17\uffff\1\3\20\uffff\1\6",
            "\4\3\2\uffff\1\1\4\uffff\1\3\1\uffff\1\3\5\uffff\3\1\3\uffff\1\1\1\3\1\1\6\uffff\2\3\6\uffff\1\3\1\1\1\uffff\1\1\1\7\1\3\10\uffff\1\1\1\10\2\uffff\1\1",
            "\1\3\1\1\1\3\4\uffff\1\3\16\uffff\1\1\17\uffff\1\1\20\uffff\1\11",
            "\1\3\1\1\1\3\4\uffff\1\3\16\uffff\1\1\17\uffff\1\1\20\uffff\1\11",
            "\4\1\2\uffff\1\3\4\uffff\1\1\1\uffff\1\1\5\uffff\3\3\3\uffff\1\3\1\1\1\3\6\uffff\2\1\6\uffff\1\1\1\3\1\uffff\1\3\1\4\1\1\10\uffff\1\3\1\5\2\uffff\1\3"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()+ loopback of 2353:3: (this_ID_0= RULE_ID (kw= CarriageReturn )? )+";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x20068000A3800402L,0x0000000000000001L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x200C40C0400280F0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x200D40C0400280F0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x2004800080000400L,0x0000000000000001L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000008040000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0011000100000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0010000100000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x200C000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000001L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0010004000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000004000C004000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x2008110000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x2000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0xC000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0400080000001100L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x2004800280000400L,0x0000000000000001L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000010080000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000800080000400L,0x0000000000000001L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});

}