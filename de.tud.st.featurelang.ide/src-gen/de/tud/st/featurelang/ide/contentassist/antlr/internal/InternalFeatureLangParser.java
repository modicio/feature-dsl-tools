package de.tud.st.featurelang.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.tud.st.featurelang.services.FeatureLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFeatureLangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Associations", "Association", "Composition", "Compatible", "Attribute", "Abstract", "Existing", "Starting", "Versions", "Compose", "Inherit", "Private", "Variant", "Version", "Called", "Number", "Phrase", "Public", "Should", "Class", "Exist", "Other", "Range", "Value", "Date", "From", "Have", "Must", "Name", "That", "Time", "With", "URI", "All", "Has", "Not", "The", "An", "Be", "Is", "It", "Of", "To", "Up", "FullStop", "A", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int All=37;
    public static final int Must=31;
    public static final int Name=32;
    public static final int Compose=13;
    public static final int Version=17;
    public static final int Private=15;
    public static final int To=46;
    public static final int Inherit=14;
    public static final int RULE_ID=50;
    public static final int Have=30;
    public static final int Phrase=20;
    public static final int Public=21;
    public static final int Associations=4;
    public static final int Range=26;
    public static final int Variant=16;
    public static final int Not=39;
    public static final int Versions=12;
    public static final int RULE_INT=51;
    public static final int Starting=11;
    public static final int Value=27;
    public static final int RULE_ML_COMMENT=53;
    public static final int Class=23;
    public static final int Up=47;
    public static final int A=49;
    public static final int Called=18;
    public static final int Should=22;
    public static final int Attribute=8;
    public static final int Time=34;
    public static final int Is=43;
    public static final int RULE_STRING=52;
    public static final int It=44;
    public static final int URI=36;
    public static final int An=41;
    public static final int With=35;
    public static final int RULE_SL_COMMENT=54;
    public static final int The=40;
    public static final int Association=5;
    public static final int Exist=24;
    public static final int Number=19;
    public static final int EOF=-1;
    public static final int That=33;
    public static final int FullStop=48;
    public static final int Composition=6;
    public static final int Be=42;
    public static final int RULE_WS=55;
    public static final int Abstract=9;
    public static final int From=29;
    public static final int RULE_ANY_OTHER=56;
    public static final int Compatible=7;
    public static final int Date=28;
    public static final int Of=45;
    public static final int Has=38;
    public static final int Existing=10;
    public static final int Other=25;

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
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("FullStop", "'.'");
    		tokenNameToValue.put("A", "'a'");
    		tokenNameToValue.put("An", "'an'");
    		tokenNameToValue.put("Be", "'be'");
    		tokenNameToValue.put("Is", "'is'");
    		tokenNameToValue.put("It", "'it'");
    		tokenNameToValue.put("Of", "'of'");
    		tokenNameToValue.put("To", "'to'");
    		tokenNameToValue.put("Up", "'up'");
    		tokenNameToValue.put("URI", "'URI'");
    		tokenNameToValue.put("All", "'all'");
    		tokenNameToValue.put("Has", "'has'");
    		tokenNameToValue.put("Not", "'not'");
    		tokenNameToValue.put("The", "'the'");
    		tokenNameToValue.put("Date", "'date'");
    		tokenNameToValue.put("From", "'from'");
    		tokenNameToValue.put("Have", "'have'");
    		tokenNameToValue.put("Must", "'must'");
    		tokenNameToValue.put("Name", "'name'");
    		tokenNameToValue.put("That", "'that'");
    		tokenNameToValue.put("Time", "'time'");
    		tokenNameToValue.put("With", "'with'");
    		tokenNameToValue.put("Class", "'class'");
    		tokenNameToValue.put("Exist", "'exist'");
    		tokenNameToValue.put("Other", "'other'");
    		tokenNameToValue.put("Range", "'range'");
    		tokenNameToValue.put("Value", "'value'");
    		tokenNameToValue.put("Called", "'called'");
    		tokenNameToValue.put("Number", "'number'");
    		tokenNameToValue.put("Phrase", "'phrase'");
    		tokenNameToValue.put("Public", "'public'");
    		tokenNameToValue.put("Should", "'should'");
    		tokenNameToValue.put("Compose", "'compose'");
    		tokenNameToValue.put("Inherit", "'inherit'");
    		tokenNameToValue.put("Private", "'private'");
    		tokenNameToValue.put("Variant", "'variant'");
    		tokenNameToValue.put("Version", "'version'");
    		tokenNameToValue.put("Abstract", "'abstract'");
    		tokenNameToValue.put("Existing", "'existing'");
    		tokenNameToValue.put("Starting", "'starting'");
    		tokenNameToValue.put("Versions", "'versions'");
    		tokenNameToValue.put("Attribute", "'attribute'");
    		tokenNameToValue.put("Compatible", "'compatible'");
    		tokenNameToValue.put("Association", "'association'");
    		tokenNameToValue.put("Composition", "'composition'");
    		tokenNameToValue.put("Associations", "'associations'");
    	}

    	public void setGrammarAccess(FeatureLangGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRuleFeatureRequest"
    // InternalFeatureLangParser.g:101:1: entryRuleFeatureRequest : ruleFeatureRequest EOF ;
    public final void entryRuleFeatureRequest() throws RecognitionException {
        try {
            // InternalFeatureLangParser.g:102:1: ( ruleFeatureRequest EOF )
            // InternalFeatureLangParser.g:103:1: ruleFeatureRequest EOF
            {
             before(grammarAccess.getFeatureRequestRule()); 
            pushFollow(FOLLOW_1);
            ruleFeatureRequest();

            state._fsp--;

             after(grammarAccess.getFeatureRequestRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeatureRequest"


    // $ANTLR start "ruleFeatureRequest"
    // InternalFeatureLangParser.g:110:1: ruleFeatureRequest : ( ( rule__FeatureRequest__StatementsAssignment )* ) ;
    public final void ruleFeatureRequest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:114:2: ( ( ( rule__FeatureRequest__StatementsAssignment )* ) )
            // InternalFeatureLangParser.g:115:2: ( ( rule__FeatureRequest__StatementsAssignment )* )
            {
            // InternalFeatureLangParser.g:115:2: ( ( rule__FeatureRequest__StatementsAssignment )* )
            // InternalFeatureLangParser.g:116:3: ( rule__FeatureRequest__StatementsAssignment )*
            {
             before(grammarAccess.getFeatureRequestAccess().getStatementsAssignment()); 
            // InternalFeatureLangParser.g:117:3: ( rule__FeatureRequest__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Abstract||LA1_0==Class||LA1_0==The||(LA1_0>=A && LA1_0<=RULE_ID)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFeatureLangParser.g:117:4: rule__FeatureRequest__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__FeatureRequest__StatementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getFeatureRequestAccess().getStatementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureRequest"


    // $ANTLR start "entryRuleStatement"
    // InternalFeatureLangParser.g:126:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalFeatureLangParser.g:127:1: ( ruleStatement EOF )
            // InternalFeatureLangParser.g:128:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalFeatureLangParser.g:135:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:139:2: ( ( ( rule__Statement__Group__0 ) ) )
            // InternalFeatureLangParser.g:140:2: ( ( rule__Statement__Group__0 ) )
            {
            // InternalFeatureLangParser.g:140:2: ( ( rule__Statement__Group__0 ) )
            // InternalFeatureLangParser.g:141:3: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // InternalFeatureLangParser.g:142:3: ( rule__Statement__Group__0 )
            // InternalFeatureLangParser.g:142:4: rule__Statement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleChangeStatement"
    // InternalFeatureLangParser.g:151:1: entryRuleChangeStatement : ruleChangeStatement EOF ;
    public final void entryRuleChangeStatement() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:155:1: ( ruleChangeStatement EOF )
            // InternalFeatureLangParser.g:156:1: ruleChangeStatement EOF
            {
             before(grammarAccess.getChangeStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleChangeStatement();

            state._fsp--;

             after(grammarAccess.getChangeStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleChangeStatement"


    // $ANTLR start "ruleChangeStatement"
    // InternalFeatureLangParser.g:166:1: ruleChangeStatement : ( ( rule__ChangeStatement__Group__0 ) ) ;
    public final void ruleChangeStatement() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:171:2: ( ( ( rule__ChangeStatement__Group__0 ) ) )
            // InternalFeatureLangParser.g:172:2: ( ( rule__ChangeStatement__Group__0 ) )
            {
            // InternalFeatureLangParser.g:172:2: ( ( rule__ChangeStatement__Group__0 ) )
            // InternalFeatureLangParser.g:173:3: ( rule__ChangeStatement__Group__0 )
            {
             before(grammarAccess.getChangeStatementAccess().getGroup()); 
            // InternalFeatureLangParser.g:174:3: ( rule__ChangeStatement__Group__0 )
            // InternalFeatureLangParser.g:174:4: rule__ChangeStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ChangeStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChangeStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleChangeStatement"


    // $ANTLR start "entryRuleCreationStatement"
    // InternalFeatureLangParser.g:184:1: entryRuleCreationStatement : ruleCreationStatement EOF ;
    public final void entryRuleCreationStatement() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:188:1: ( ruleCreationStatement EOF )
            // InternalFeatureLangParser.g:189:1: ruleCreationStatement EOF
            {
             before(grammarAccess.getCreationStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleCreationStatement();

            state._fsp--;

             after(grammarAccess.getCreationStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleCreationStatement"


    // $ANTLR start "ruleCreationStatement"
    // InternalFeatureLangParser.g:199:1: ruleCreationStatement : ( ( rule__CreationStatement__Group__0 ) ) ;
    public final void ruleCreationStatement() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:204:2: ( ( ( rule__CreationStatement__Group__0 ) ) )
            // InternalFeatureLangParser.g:205:2: ( ( rule__CreationStatement__Group__0 ) )
            {
            // InternalFeatureLangParser.g:205:2: ( ( rule__CreationStatement__Group__0 ) )
            // InternalFeatureLangParser.g:206:3: ( rule__CreationStatement__Group__0 )
            {
             before(grammarAccess.getCreationStatementAccess().getGroup()); 
            // InternalFeatureLangParser.g:207:3: ( rule__CreationStatement__Group__0 )
            // InternalFeatureLangParser.g:207:4: rule__CreationStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CreationStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCreationStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleCreationStatement"


    // $ANTLR start "entryRuleAction"
    // InternalFeatureLangParser.g:217:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:221:1: ( ruleAction EOF )
            // InternalFeatureLangParser.g:222:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalFeatureLangParser.g:232:1: ruleAction : ( ( rule__Action__TypeAssignment ) ) ;
    public final void ruleAction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:237:2: ( ( ( rule__Action__TypeAssignment ) ) )
            // InternalFeatureLangParser.g:238:2: ( ( rule__Action__TypeAssignment ) )
            {
            // InternalFeatureLangParser.g:238:2: ( ( rule__Action__TypeAssignment ) )
            // InternalFeatureLangParser.g:239:3: ( rule__Action__TypeAssignment )
            {
             before(grammarAccess.getActionAccess().getTypeAssignment()); 
            // InternalFeatureLangParser.g:240:3: ( rule__Action__TypeAssignment )
            // InternalFeatureLangParser.g:240:4: rule__Action__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Action__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleUpdateAction"
    // InternalFeatureLangParser.g:250:1: entryRuleUpdateAction : ruleUpdateAction EOF ;
    public final void entryRuleUpdateAction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:254:1: ( ruleUpdateAction EOF )
            // InternalFeatureLangParser.g:255:1: ruleUpdateAction EOF
            {
             before(grammarAccess.getUpdateActionRule()); 
            pushFollow(FOLLOW_1);
            ruleUpdateAction();

            state._fsp--;

             after(grammarAccess.getUpdateActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleUpdateAction"


    // $ANTLR start "ruleUpdateAction"
    // InternalFeatureLangParser.g:265:1: ruleUpdateAction : ( ( rule__UpdateAction__Group__0 ) ) ;
    public final void ruleUpdateAction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:270:2: ( ( ( rule__UpdateAction__Group__0 ) ) )
            // InternalFeatureLangParser.g:271:2: ( ( rule__UpdateAction__Group__0 ) )
            {
            // InternalFeatureLangParser.g:271:2: ( ( rule__UpdateAction__Group__0 ) )
            // InternalFeatureLangParser.g:272:3: ( rule__UpdateAction__Group__0 )
            {
             before(grammarAccess.getUpdateActionAccess().getGroup()); 
            // InternalFeatureLangParser.g:273:3: ( rule__UpdateAction__Group__0 )
            // InternalFeatureLangParser.g:273:4: rule__UpdateAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UpdateAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUpdateActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleUpdateAction"


    // $ANTLR start "entryRuleUpdateAttributeDatatype"
    // InternalFeatureLangParser.g:283:1: entryRuleUpdateAttributeDatatype : ruleUpdateAttributeDatatype EOF ;
    public final void entryRuleUpdateAttributeDatatype() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:287:1: ( ruleUpdateAttributeDatatype EOF )
            // InternalFeatureLangParser.g:288:1: ruleUpdateAttributeDatatype EOF
            {
             before(grammarAccess.getUpdateAttributeDatatypeRule()); 
            pushFollow(FOLLOW_1);
            ruleUpdateAttributeDatatype();

            state._fsp--;

             after(grammarAccess.getUpdateAttributeDatatypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleUpdateAttributeDatatype"


    // $ANTLR start "ruleUpdateAttributeDatatype"
    // InternalFeatureLangParser.g:298:1: ruleUpdateAttributeDatatype : ( ( rule__UpdateAttributeDatatype__Group__0 ) ) ;
    public final void ruleUpdateAttributeDatatype() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:303:2: ( ( ( rule__UpdateAttributeDatatype__Group__0 ) ) )
            // InternalFeatureLangParser.g:304:2: ( ( rule__UpdateAttributeDatatype__Group__0 ) )
            {
            // InternalFeatureLangParser.g:304:2: ( ( rule__UpdateAttributeDatatype__Group__0 ) )
            // InternalFeatureLangParser.g:305:3: ( rule__UpdateAttributeDatatype__Group__0 )
            {
             before(grammarAccess.getUpdateAttributeDatatypeAccess().getGroup()); 
            // InternalFeatureLangParser.g:306:3: ( rule__UpdateAttributeDatatype__Group__0 )
            // InternalFeatureLangParser.g:306:4: rule__UpdateAttributeDatatype__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UpdateAttributeDatatype__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUpdateAttributeDatatypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleUpdateAttributeDatatype"


    // $ANTLR start "entryRuleUpdateAttributeIdentifier"
    // InternalFeatureLangParser.g:316:1: entryRuleUpdateAttributeIdentifier : ruleUpdateAttributeIdentifier EOF ;
    public final void entryRuleUpdateAttributeIdentifier() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:320:1: ( ruleUpdateAttributeIdentifier EOF )
            // InternalFeatureLangParser.g:321:1: ruleUpdateAttributeIdentifier EOF
            {
             before(grammarAccess.getUpdateAttributeIdentifierRule()); 
            pushFollow(FOLLOW_1);
            ruleUpdateAttributeIdentifier();

            state._fsp--;

             after(grammarAccess.getUpdateAttributeIdentifierRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleUpdateAttributeIdentifier"


    // $ANTLR start "ruleUpdateAttributeIdentifier"
    // InternalFeatureLangParser.g:331:1: ruleUpdateAttributeIdentifier : ( ( rule__UpdateAttributeIdentifier__Group__0 ) ) ;
    public final void ruleUpdateAttributeIdentifier() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:336:2: ( ( ( rule__UpdateAttributeIdentifier__Group__0 ) ) )
            // InternalFeatureLangParser.g:337:2: ( ( rule__UpdateAttributeIdentifier__Group__0 ) )
            {
            // InternalFeatureLangParser.g:337:2: ( ( rule__UpdateAttributeIdentifier__Group__0 ) )
            // InternalFeatureLangParser.g:338:3: ( rule__UpdateAttributeIdentifier__Group__0 )
            {
             before(grammarAccess.getUpdateAttributeIdentifierAccess().getGroup()); 
            // InternalFeatureLangParser.g:339:3: ( rule__UpdateAttributeIdentifier__Group__0 )
            // InternalFeatureLangParser.g:339:4: rule__UpdateAttributeIdentifier__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UpdateAttributeIdentifier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUpdateAttributeIdentifierAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleUpdateAttributeIdentifier"


    // $ANTLR start "entryRuleUpdateAttributeValue"
    // InternalFeatureLangParser.g:349:1: entryRuleUpdateAttributeValue : ruleUpdateAttributeValue EOF ;
    public final void entryRuleUpdateAttributeValue() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:353:1: ( ruleUpdateAttributeValue EOF )
            // InternalFeatureLangParser.g:354:1: ruleUpdateAttributeValue EOF
            {
             before(grammarAccess.getUpdateAttributeValueRule()); 
            pushFollow(FOLLOW_1);
            ruleUpdateAttributeValue();

            state._fsp--;

             after(grammarAccess.getUpdateAttributeValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleUpdateAttributeValue"


    // $ANTLR start "ruleUpdateAttributeValue"
    // InternalFeatureLangParser.g:364:1: ruleUpdateAttributeValue : ( ( rule__UpdateAttributeValue__Group__0 ) ) ;
    public final void ruleUpdateAttributeValue() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:369:2: ( ( ( rule__UpdateAttributeValue__Group__0 ) ) )
            // InternalFeatureLangParser.g:370:2: ( ( rule__UpdateAttributeValue__Group__0 ) )
            {
            // InternalFeatureLangParser.g:370:2: ( ( rule__UpdateAttributeValue__Group__0 ) )
            // InternalFeatureLangParser.g:371:3: ( rule__UpdateAttributeValue__Group__0 )
            {
             before(grammarAccess.getUpdateAttributeValueAccess().getGroup()); 
            // InternalFeatureLangParser.g:372:3: ( rule__UpdateAttributeValue__Group__0 )
            // InternalFeatureLangParser.g:372:4: rule__UpdateAttributeValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UpdateAttributeValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUpdateAttributeValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleUpdateAttributeValue"


    // $ANTLR start "entryRuleAttributeAction"
    // InternalFeatureLangParser.g:382:1: entryRuleAttributeAction : ruleAttributeAction EOF ;
    public final void entryRuleAttributeAction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:386:1: ( ruleAttributeAction EOF )
            // InternalFeatureLangParser.g:387:1: ruleAttributeAction EOF
            {
             before(grammarAccess.getAttributeActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeAction();

            state._fsp--;

             after(grammarAccess.getAttributeActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeAction"


    // $ANTLR start "ruleAttributeAction"
    // InternalFeatureLangParser.g:397:1: ruleAttributeAction : ( ( rule__AttributeAction__Group__0 ) ) ;
    public final void ruleAttributeAction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:402:2: ( ( ( rule__AttributeAction__Group__0 ) ) )
            // InternalFeatureLangParser.g:403:2: ( ( rule__AttributeAction__Group__0 ) )
            {
            // InternalFeatureLangParser.g:403:2: ( ( rule__AttributeAction__Group__0 ) )
            // InternalFeatureLangParser.g:404:3: ( rule__AttributeAction__Group__0 )
            {
             before(grammarAccess.getAttributeActionAccess().getGroup()); 
            // InternalFeatureLangParser.g:405:3: ( rule__AttributeAction__Group__0 )
            // InternalFeatureLangParser.g:405:4: rule__AttributeAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleAttributeAction"


    // $ANTLR start "entryRuleAssociationAction"
    // InternalFeatureLangParser.g:415:1: entryRuleAssociationAction : ruleAssociationAction EOF ;
    public final void entryRuleAssociationAction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:419:1: ( ruleAssociationAction EOF )
            // InternalFeatureLangParser.g:420:1: ruleAssociationAction EOF
            {
             before(grammarAccess.getAssociationActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAssociationAction();

            state._fsp--;

             after(grammarAccess.getAssociationActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleAssociationAction"


    // $ANTLR start "ruleAssociationAction"
    // InternalFeatureLangParser.g:430:1: ruleAssociationAction : ( ( rule__AssociationAction__Group__0 ) ) ;
    public final void ruleAssociationAction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:435:2: ( ( ( rule__AssociationAction__Group__0 ) ) )
            // InternalFeatureLangParser.g:436:2: ( ( rule__AssociationAction__Group__0 ) )
            {
            // InternalFeatureLangParser.g:436:2: ( ( rule__AssociationAction__Group__0 ) )
            // InternalFeatureLangParser.g:437:3: ( rule__AssociationAction__Group__0 )
            {
             before(grammarAccess.getAssociationActionAccess().getGroup()); 
            // InternalFeatureLangParser.g:438:3: ( rule__AssociationAction__Group__0 )
            // InternalFeatureLangParser.g:438:4: rule__AssociationAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssociationAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleAssociationAction"


    // $ANTLR start "entryRuleCreateAssociation"
    // InternalFeatureLangParser.g:448:1: entryRuleCreateAssociation : ruleCreateAssociation EOF ;
    public final void entryRuleCreateAssociation() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:452:1: ( ruleCreateAssociation EOF )
            // InternalFeatureLangParser.g:453:1: ruleCreateAssociation EOF
            {
             before(grammarAccess.getCreateAssociationRule()); 
            pushFollow(FOLLOW_1);
            ruleCreateAssociation();

            state._fsp--;

             after(grammarAccess.getCreateAssociationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleCreateAssociation"


    // $ANTLR start "ruleCreateAssociation"
    // InternalFeatureLangParser.g:463:1: ruleCreateAssociation : ( ( rule__CreateAssociation__Group__0 ) ) ;
    public final void ruleCreateAssociation() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:468:2: ( ( ( rule__CreateAssociation__Group__0 ) ) )
            // InternalFeatureLangParser.g:469:2: ( ( rule__CreateAssociation__Group__0 ) )
            {
            // InternalFeatureLangParser.g:469:2: ( ( rule__CreateAssociation__Group__0 ) )
            // InternalFeatureLangParser.g:470:3: ( rule__CreateAssociation__Group__0 )
            {
             before(grammarAccess.getCreateAssociationAccess().getGroup()); 
            // InternalFeatureLangParser.g:471:3: ( rule__CreateAssociation__Group__0 )
            // InternalFeatureLangParser.g:471:4: rule__CreateAssociation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CreateAssociation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCreateAssociationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleCreateAssociation"


    // $ANTLR start "entryRuleEditAssociation"
    // InternalFeatureLangParser.g:481:1: entryRuleEditAssociation : ruleEditAssociation EOF ;
    public final void entryRuleEditAssociation() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:485:1: ( ruleEditAssociation EOF )
            // InternalFeatureLangParser.g:486:1: ruleEditAssociation EOF
            {
             before(grammarAccess.getEditAssociationRule()); 
            pushFollow(FOLLOW_1);
            ruleEditAssociation();

            state._fsp--;

             after(grammarAccess.getEditAssociationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleEditAssociation"


    // $ANTLR start "ruleEditAssociation"
    // InternalFeatureLangParser.g:496:1: ruleEditAssociation : ( ( rule__EditAssociation__TypeAssignment ) ) ;
    public final void ruleEditAssociation() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:501:2: ( ( ( rule__EditAssociation__TypeAssignment ) ) )
            // InternalFeatureLangParser.g:502:2: ( ( rule__EditAssociation__TypeAssignment ) )
            {
            // InternalFeatureLangParser.g:502:2: ( ( rule__EditAssociation__TypeAssignment ) )
            // InternalFeatureLangParser.g:503:3: ( rule__EditAssociation__TypeAssignment )
            {
             before(grammarAccess.getEditAssociationAccess().getTypeAssignment()); 
            // InternalFeatureLangParser.g:504:3: ( rule__EditAssociation__TypeAssignment )
            // InternalFeatureLangParser.g:504:4: rule__EditAssociation__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__EditAssociation__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEditAssociationAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleEditAssociation"


    // $ANTLR start "entryRuleSetCompatible"
    // InternalFeatureLangParser.g:514:1: entryRuleSetCompatible : ruleSetCompatible EOF ;
    public final void entryRuleSetCompatible() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:518:1: ( ruleSetCompatible EOF )
            // InternalFeatureLangParser.g:519:1: ruleSetCompatible EOF
            {
             before(grammarAccess.getSetCompatibleRule()); 
            pushFollow(FOLLOW_1);
            ruleSetCompatible();

            state._fsp--;

             after(grammarAccess.getSetCompatibleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleSetCompatible"


    // $ANTLR start "ruleSetCompatible"
    // InternalFeatureLangParser.g:529:1: ruleSetCompatible : ( ( rule__SetCompatible__Group__0 ) ) ;
    public final void ruleSetCompatible() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:534:2: ( ( ( rule__SetCompatible__Group__0 ) ) )
            // InternalFeatureLangParser.g:535:2: ( ( rule__SetCompatible__Group__0 ) )
            {
            // InternalFeatureLangParser.g:535:2: ( ( rule__SetCompatible__Group__0 ) )
            // InternalFeatureLangParser.g:536:3: ( rule__SetCompatible__Group__0 )
            {
             before(grammarAccess.getSetCompatibleAccess().getGroup()); 
            // InternalFeatureLangParser.g:537:3: ( rule__SetCompatible__Group__0 )
            // InternalFeatureLangParser.g:537:4: rule__SetCompatible__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SetCompatible__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetCompatibleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleSetCompatible"


    // $ANTLR start "entryRuleSetVersionRange"
    // InternalFeatureLangParser.g:547:1: entryRuleSetVersionRange : ruleSetVersionRange EOF ;
    public final void entryRuleSetVersionRange() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:551:1: ( ruleSetVersionRange EOF )
            // InternalFeatureLangParser.g:552:1: ruleSetVersionRange EOF
            {
             before(grammarAccess.getSetVersionRangeRule()); 
            pushFollow(FOLLOW_1);
            ruleSetVersionRange();

            state._fsp--;

             after(grammarAccess.getSetVersionRangeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleSetVersionRange"


    // $ANTLR start "ruleSetVersionRange"
    // InternalFeatureLangParser.g:562:1: ruleSetVersionRange : ( ( rule__SetVersionRange__Group__0 ) ) ;
    public final void ruleSetVersionRange() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:567:2: ( ( ( rule__SetVersionRange__Group__0 ) ) )
            // InternalFeatureLangParser.g:568:2: ( ( rule__SetVersionRange__Group__0 ) )
            {
            // InternalFeatureLangParser.g:568:2: ( ( rule__SetVersionRange__Group__0 ) )
            // InternalFeatureLangParser.g:569:3: ( rule__SetVersionRange__Group__0 )
            {
             before(grammarAccess.getSetVersionRangeAccess().getGroup()); 
            // InternalFeatureLangParser.g:570:3: ( rule__SetVersionRange__Group__0 )
            // InternalFeatureLangParser.g:570:4: rule__SetVersionRange__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SetVersionRange__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetVersionRangeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleSetVersionRange"


    // $ANTLR start "entryRuleSetVariant"
    // InternalFeatureLangParser.g:580:1: entryRuleSetVariant : ruleSetVariant EOF ;
    public final void entryRuleSetVariant() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:584:1: ( ruleSetVariant EOF )
            // InternalFeatureLangParser.g:585:1: ruleSetVariant EOF
            {
             before(grammarAccess.getSetVariantRule()); 
            pushFollow(FOLLOW_1);
            ruleSetVariant();

            state._fsp--;

             after(grammarAccess.getSetVariantRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleSetVariant"


    // $ANTLR start "ruleSetVariant"
    // InternalFeatureLangParser.g:595:1: ruleSetVariant : ( ( rule__SetVariant__Group__0 ) ) ;
    public final void ruleSetVariant() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:600:2: ( ( ( rule__SetVariant__Group__0 ) ) )
            // InternalFeatureLangParser.g:601:2: ( ( rule__SetVariant__Group__0 ) )
            {
            // InternalFeatureLangParser.g:601:2: ( ( rule__SetVariant__Group__0 ) )
            // InternalFeatureLangParser.g:602:3: ( rule__SetVariant__Group__0 )
            {
             before(grammarAccess.getSetVariantAccess().getGroup()); 
            // InternalFeatureLangParser.g:603:3: ( rule__SetVariant__Group__0 )
            // InternalFeatureLangParser.g:603:4: rule__SetVariant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SetVariant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetVariantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleSetVariant"


    // $ANTLR start "entryRuleSetRightOpen"
    // InternalFeatureLangParser.g:613:1: entryRuleSetRightOpen : ruleSetRightOpen EOF ;
    public final void entryRuleSetRightOpen() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:617:1: ( ruleSetRightOpen EOF )
            // InternalFeatureLangParser.g:618:1: ruleSetRightOpen EOF
            {
             before(grammarAccess.getSetRightOpenRule()); 
            pushFollow(FOLLOW_1);
            ruleSetRightOpen();

            state._fsp--;

             after(grammarAccess.getSetRightOpenRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleSetRightOpen"


    // $ANTLR start "ruleSetRightOpen"
    // InternalFeatureLangParser.g:628:1: ruleSetRightOpen : ( ( rule__SetRightOpen__Group__0 ) ) ;
    public final void ruleSetRightOpen() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:633:2: ( ( ( rule__SetRightOpen__Group__0 ) ) )
            // InternalFeatureLangParser.g:634:2: ( ( rule__SetRightOpen__Group__0 ) )
            {
            // InternalFeatureLangParser.g:634:2: ( ( rule__SetRightOpen__Group__0 ) )
            // InternalFeatureLangParser.g:635:3: ( rule__SetRightOpen__Group__0 )
            {
             before(grammarAccess.getSetRightOpenAccess().getGroup()); 
            // InternalFeatureLangParser.g:636:3: ( rule__SetRightOpen__Group__0 )
            // InternalFeatureLangParser.g:636:4: rule__SetRightOpen__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SetRightOpen__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetRightOpenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleSetRightOpen"


    // $ANTLR start "entryRuleSetLeftOpen"
    // InternalFeatureLangParser.g:646:1: entryRuleSetLeftOpen : ruleSetLeftOpen EOF ;
    public final void entryRuleSetLeftOpen() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:650:1: ( ruleSetLeftOpen EOF )
            // InternalFeatureLangParser.g:651:1: ruleSetLeftOpen EOF
            {
             before(grammarAccess.getSetLeftOpenRule()); 
            pushFollow(FOLLOW_1);
            ruleSetLeftOpen();

            state._fsp--;

             after(grammarAccess.getSetLeftOpenRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleSetLeftOpen"


    // $ANTLR start "ruleSetLeftOpen"
    // InternalFeatureLangParser.g:661:1: ruleSetLeftOpen : ( ( rule__SetLeftOpen__Group__0 ) ) ;
    public final void ruleSetLeftOpen() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:666:2: ( ( ( rule__SetLeftOpen__Group__0 ) ) )
            // InternalFeatureLangParser.g:667:2: ( ( rule__SetLeftOpen__Group__0 ) )
            {
            // InternalFeatureLangParser.g:667:2: ( ( rule__SetLeftOpen__Group__0 ) )
            // InternalFeatureLangParser.g:668:3: ( rule__SetLeftOpen__Group__0 )
            {
             before(grammarAccess.getSetLeftOpenAccess().getGroup()); 
            // InternalFeatureLangParser.g:669:3: ( rule__SetLeftOpen__Group__0 )
            // InternalFeatureLangParser.g:669:4: rule__SetLeftOpen__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SetLeftOpen__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetLeftOpenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleSetLeftOpen"


    // $ANTLR start "entryRuleInheritanceAction"
    // InternalFeatureLangParser.g:679:1: entryRuleInheritanceAction : ruleInheritanceAction EOF ;
    public final void entryRuleInheritanceAction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:683:1: ( ruleInheritanceAction EOF )
            // InternalFeatureLangParser.g:684:1: ruleInheritanceAction EOF
            {
             before(grammarAccess.getInheritanceActionRule()); 
            pushFollow(FOLLOW_1);
            ruleInheritanceAction();

            state._fsp--;

             after(grammarAccess.getInheritanceActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleInheritanceAction"


    // $ANTLR start "ruleInheritanceAction"
    // InternalFeatureLangParser.g:694:1: ruleInheritanceAction : ( ( rule__InheritanceAction__Group__0 ) ) ;
    public final void ruleInheritanceAction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:699:2: ( ( ( rule__InheritanceAction__Group__0 ) ) )
            // InternalFeatureLangParser.g:700:2: ( ( rule__InheritanceAction__Group__0 ) )
            {
            // InternalFeatureLangParser.g:700:2: ( ( rule__InheritanceAction__Group__0 ) )
            // InternalFeatureLangParser.g:701:3: ( rule__InheritanceAction__Group__0 )
            {
             before(grammarAccess.getInheritanceActionAccess().getGroup()); 
            // InternalFeatureLangParser.g:702:3: ( rule__InheritanceAction__Group__0 )
            // InternalFeatureLangParser.g:702:4: rule__InheritanceAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InheritanceAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInheritanceActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleInheritanceAction"


    // $ANTLR start "entryRuleCompositionAction"
    // InternalFeatureLangParser.g:712:1: entryRuleCompositionAction : ruleCompositionAction EOF ;
    public final void entryRuleCompositionAction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:716:1: ( ruleCompositionAction EOF )
            // InternalFeatureLangParser.g:717:1: ruleCompositionAction EOF
            {
             before(grammarAccess.getCompositionActionRule()); 
            pushFollow(FOLLOW_1);
            ruleCompositionAction();

            state._fsp--;

             after(grammarAccess.getCompositionActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleCompositionAction"


    // $ANTLR start "ruleCompositionAction"
    // InternalFeatureLangParser.g:727:1: ruleCompositionAction : ( ( rule__CompositionAction__Alternatives ) ) ;
    public final void ruleCompositionAction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:732:2: ( ( ( rule__CompositionAction__Alternatives ) ) )
            // InternalFeatureLangParser.g:733:2: ( ( rule__CompositionAction__Alternatives ) )
            {
            // InternalFeatureLangParser.g:733:2: ( ( rule__CompositionAction__Alternatives ) )
            // InternalFeatureLangParser.g:734:3: ( rule__CompositionAction__Alternatives )
            {
             before(grammarAccess.getCompositionActionAccess().getAlternatives()); 
            // InternalFeatureLangParser.g:735:3: ( rule__CompositionAction__Alternatives )
            // InternalFeatureLangParser.g:735:4: rule__CompositionAction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CompositionAction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCompositionActionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleCompositionAction"


    // $ANTLR start "entryRuleCreateComposition"
    // InternalFeatureLangParser.g:745:1: entryRuleCreateComposition : ruleCreateComposition EOF ;
    public final void entryRuleCreateComposition() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:749:1: ( ruleCreateComposition EOF )
            // InternalFeatureLangParser.g:750:1: ruleCreateComposition EOF
            {
             before(grammarAccess.getCreateCompositionRule()); 
            pushFollow(FOLLOW_1);
            ruleCreateComposition();

            state._fsp--;

             after(grammarAccess.getCreateCompositionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleCreateComposition"


    // $ANTLR start "ruleCreateComposition"
    // InternalFeatureLangParser.g:760:1: ruleCreateComposition : ( ( rule__CreateComposition__Group__0 ) ) ;
    public final void ruleCreateComposition() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:765:2: ( ( ( rule__CreateComposition__Group__0 ) ) )
            // InternalFeatureLangParser.g:766:2: ( ( rule__CreateComposition__Group__0 ) )
            {
            // InternalFeatureLangParser.g:766:2: ( ( rule__CreateComposition__Group__0 ) )
            // InternalFeatureLangParser.g:767:3: ( rule__CreateComposition__Group__0 )
            {
             before(grammarAccess.getCreateCompositionAccess().getGroup()); 
            // InternalFeatureLangParser.g:768:3: ( rule__CreateComposition__Group__0 )
            // InternalFeatureLangParser.g:768:4: rule__CreateComposition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CreateComposition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCreateCompositionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleCreateComposition"


    // $ANTLR start "entryRuleEditComposition"
    // InternalFeatureLangParser.g:778:1: entryRuleEditComposition : ruleEditComposition EOF ;
    public final void entryRuleEditComposition() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:782:1: ( ruleEditComposition EOF )
            // InternalFeatureLangParser.g:783:1: ruleEditComposition EOF
            {
             before(grammarAccess.getEditCompositionRule()); 
            pushFollow(FOLLOW_1);
            ruleEditComposition();

            state._fsp--;

             after(grammarAccess.getEditCompositionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleEditComposition"


    // $ANTLR start "ruleEditComposition"
    // InternalFeatureLangParser.g:793:1: ruleEditComposition : ( ( rule__EditComposition__Group__0 ) ) ;
    public final void ruleEditComposition() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:798:2: ( ( ( rule__EditComposition__Group__0 ) ) )
            // InternalFeatureLangParser.g:799:2: ( ( rule__EditComposition__Group__0 ) )
            {
            // InternalFeatureLangParser.g:799:2: ( ( rule__EditComposition__Group__0 ) )
            // InternalFeatureLangParser.g:800:3: ( rule__EditComposition__Group__0 )
            {
             before(grammarAccess.getEditCompositionAccess().getGroup()); 
            // InternalFeatureLangParser.g:801:3: ( rule__EditComposition__Group__0 )
            // InternalFeatureLangParser.g:801:4: rule__EditComposition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EditComposition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEditCompositionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleEditComposition"


    // $ANTLR start "entryRuleClass"
    // InternalFeatureLangParser.g:811:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:815:1: ( ruleClass EOF )
            // InternalFeatureLangParser.g:816:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalFeatureLangParser.g:826:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:831:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalFeatureLangParser.g:832:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalFeatureLangParser.g:832:2: ( ( rule__Class__Group__0 ) )
            // InternalFeatureLangParser.g:833:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalFeatureLangParser.g:834:3: ( rule__Class__Group__0 )
            // InternalFeatureLangParser.g:834:4: rule__Class__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleAttribute"
    // InternalFeatureLangParser.g:844:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:848:1: ( ruleAttribute EOF )
            // InternalFeatureLangParser.g:849:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalFeatureLangParser.g:859:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:864:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalFeatureLangParser.g:865:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalFeatureLangParser.g:865:2: ( ( rule__Attribute__Group__0 ) )
            // InternalFeatureLangParser.g:866:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalFeatureLangParser.g:867:3: ( rule__Attribute__Group__0 )
            // InternalFeatureLangParser.g:867:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleIdentifier"
    // InternalFeatureLangParser.g:877:1: entryRuleIdentifier : ruleIdentifier EOF ;
    public final void entryRuleIdentifier() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:881:1: ( ruleIdentifier EOF )
            // InternalFeatureLangParser.g:882:1: ruleIdentifier EOF
            {
             before(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_1);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getIdentifierRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // InternalFeatureLangParser.g:892:1: ruleIdentifier : ( ( rule__Identifier__Group__0 ) ) ;
    public final void ruleIdentifier() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:897:2: ( ( ( rule__Identifier__Group__0 ) ) )
            // InternalFeatureLangParser.g:898:2: ( ( rule__Identifier__Group__0 ) )
            {
            // InternalFeatureLangParser.g:898:2: ( ( rule__Identifier__Group__0 ) )
            // InternalFeatureLangParser.g:899:3: ( rule__Identifier__Group__0 )
            {
             before(grammarAccess.getIdentifierAccess().getGroup()); 
            // InternalFeatureLangParser.g:900:3: ( rule__Identifier__Group__0 )
            // InternalFeatureLangParser.g:900:4: rule__Identifier__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Identifier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIdentifierAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRulePriority"
    // InternalFeatureLangParser.g:910:1: entryRulePriority : rulePriority EOF ;
    public final void entryRulePriority() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:914:1: ( rulePriority EOF )
            // InternalFeatureLangParser.g:915:1: rulePriority EOF
            {
             before(grammarAccess.getPriorityRule()); 
            pushFollow(FOLLOW_1);
            rulePriority();

            state._fsp--;

             after(grammarAccess.getPriorityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRulePriority"


    // $ANTLR start "rulePriority"
    // InternalFeatureLangParser.g:925:1: rulePriority : ( ( rule__Priority__PriorityAssignment ) ) ;
    public final void rulePriority() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:930:2: ( ( ( rule__Priority__PriorityAssignment ) ) )
            // InternalFeatureLangParser.g:931:2: ( ( rule__Priority__PriorityAssignment ) )
            {
            // InternalFeatureLangParser.g:931:2: ( ( rule__Priority__PriorityAssignment ) )
            // InternalFeatureLangParser.g:932:3: ( rule__Priority__PriorityAssignment )
            {
             before(grammarAccess.getPriorityAccess().getPriorityAssignment()); 
            // InternalFeatureLangParser.g:933:3: ( rule__Priority__PriorityAssignment )
            // InternalFeatureLangParser.g:933:4: rule__Priority__PriorityAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Priority__PriorityAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPriorityAccess().getPriorityAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "rulePriority"


    // $ANTLR start "rulePublicity"
    // InternalFeatureLangParser.g:943:1: rulePublicity : ( ( rule__Publicity__Alternatives ) ) ;
    public final void rulePublicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:947:1: ( ( ( rule__Publicity__Alternatives ) ) )
            // InternalFeatureLangParser.g:948:2: ( ( rule__Publicity__Alternatives ) )
            {
            // InternalFeatureLangParser.g:948:2: ( ( rule__Publicity__Alternatives ) )
            // InternalFeatureLangParser.g:949:3: ( rule__Publicity__Alternatives )
            {
             before(grammarAccess.getPublicityAccess().getAlternatives()); 
            // InternalFeatureLangParser.g:950:3: ( rule__Publicity__Alternatives )
            // InternalFeatureLangParser.g:950:4: rule__Publicity__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Publicity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPublicityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePublicity"


    // $ANTLR start "rulePriorityValue"
    // InternalFeatureLangParser.g:959:1: rulePriorityValue : ( ( rule__PriorityValue__Alternatives ) ) ;
    public final void rulePriorityValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:963:1: ( ( ( rule__PriorityValue__Alternatives ) ) )
            // InternalFeatureLangParser.g:964:2: ( ( rule__PriorityValue__Alternatives ) )
            {
            // InternalFeatureLangParser.g:964:2: ( ( rule__PriorityValue__Alternatives ) )
            // InternalFeatureLangParser.g:965:3: ( rule__PriorityValue__Alternatives )
            {
             before(grammarAccess.getPriorityValueAccess().getAlternatives()); 
            // InternalFeatureLangParser.g:966:3: ( rule__PriorityValue__Alternatives )
            // InternalFeatureLangParser.g:966:4: rule__PriorityValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PriorityValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPriorityValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePriorityValue"


    // $ANTLR start "ruleAbstraction"
    // InternalFeatureLangParser.g:975:1: ruleAbstraction : ( ( Abstract ) ) ;
    public final void ruleAbstraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:979:1: ( ( ( Abstract ) ) )
            // InternalFeatureLangParser.g:980:2: ( ( Abstract ) )
            {
            // InternalFeatureLangParser.g:980:2: ( ( Abstract ) )
            // InternalFeatureLangParser.g:981:3: ( Abstract )
            {
             before(grammarAccess.getAbstractionAccess().getABSTRACTEnumLiteralDeclaration()); 
            // InternalFeatureLangParser.g:982:3: ( Abstract )
            // InternalFeatureLangParser.g:982:4: Abstract
            {
            match(input,Abstract,FOLLOW_2); 

            }

             after(grammarAccess.getAbstractionAccess().getABSTRACTEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstraction"


    // $ANTLR start "ruleIdentifierValue"
    // InternalFeatureLangParser.g:991:1: ruleIdentifierValue : ( ( rule__IdentifierValue__Alternatives ) ) ;
    public final void ruleIdentifierValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:995:1: ( ( ( rule__IdentifierValue__Alternatives ) ) )
            // InternalFeatureLangParser.g:996:2: ( ( rule__IdentifierValue__Alternatives ) )
            {
            // InternalFeatureLangParser.g:996:2: ( ( rule__IdentifierValue__Alternatives ) )
            // InternalFeatureLangParser.g:997:3: ( rule__IdentifierValue__Alternatives )
            {
             before(grammarAccess.getIdentifierValueAccess().getAlternatives()); 
            // InternalFeatureLangParser.g:998:3: ( rule__IdentifierValue__Alternatives )
            // InternalFeatureLangParser.g:998:4: rule__IdentifierValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__IdentifierValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIdentifierValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIdentifierValue"


    // $ANTLR start "ruleDatatype"
    // InternalFeatureLangParser.g:1007:1: ruleDatatype : ( ( rule__Datatype__Alternatives ) ) ;
    public final void ruleDatatype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1011:1: ( ( ( rule__Datatype__Alternatives ) ) )
            // InternalFeatureLangParser.g:1012:2: ( ( rule__Datatype__Alternatives ) )
            {
            // InternalFeatureLangParser.g:1012:2: ( ( rule__Datatype__Alternatives ) )
            // InternalFeatureLangParser.g:1013:3: ( rule__Datatype__Alternatives )
            {
             before(grammarAccess.getDatatypeAccess().getAlternatives()); 
            // InternalFeatureLangParser.g:1014:3: ( rule__Datatype__Alternatives )
            // InternalFeatureLangParser.g:1014:4: rule__Datatype__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Datatype__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDatatypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDatatype"


    // $ANTLR start "rule__Statement__Alternatives_0"
    // InternalFeatureLangParser.g:1022:1: rule__Statement__Alternatives_0 : ( ( ruleChangeStatement ) | ( ruleCreationStatement ) );
    public final void rule__Statement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1026:1: ( ( ruleChangeStatement ) | ( ruleCreationStatement ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalFeatureLangParser.g:1027:2: ( ruleChangeStatement )
                    {
                    // InternalFeatureLangParser.g:1027:2: ( ruleChangeStatement )
                    // InternalFeatureLangParser.g:1028:3: ruleChangeStatement
                    {
                     before(grammarAccess.getStatementAccess().getChangeStatementParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleChangeStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getChangeStatementParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1033:2: ( ruleCreationStatement )
                    {
                    // InternalFeatureLangParser.g:1033:2: ( ruleCreationStatement )
                    // InternalFeatureLangParser.g:1034:3: ruleCreationStatement
                    {
                     before(grammarAccess.getStatementAccess().getCreationStatementParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCreationStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getCreationStatementParserRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives_0"


    // $ANTLR start "rule__ChangeStatement__Alternatives_1"
    // InternalFeatureLangParser.g:1043:1: rule__ChangeStatement__Alternatives_1 : ( ( ( rule__ChangeStatement__Group_1_0__0 ) ) | ( ( rule__ChangeStatement__UpdateAssignment_1_1 ) ) );
    public final void rule__ChangeStatement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1047:1: ( ( ( rule__ChangeStatement__Group_1_0__0 ) ) | ( ( rule__ChangeStatement__UpdateAssignment_1_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Should||LA3_0==Must) ) {
                alt3=1;
            }
            else if ( (LA3_0==Has) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalFeatureLangParser.g:1048:2: ( ( rule__ChangeStatement__Group_1_0__0 ) )
                    {
                    // InternalFeatureLangParser.g:1048:2: ( ( rule__ChangeStatement__Group_1_0__0 ) )
                    // InternalFeatureLangParser.g:1049:3: ( rule__ChangeStatement__Group_1_0__0 )
                    {
                     before(grammarAccess.getChangeStatementAccess().getGroup_1_0()); 
                    // InternalFeatureLangParser.g:1050:3: ( rule__ChangeStatement__Group_1_0__0 )
                    // InternalFeatureLangParser.g:1050:4: rule__ChangeStatement__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChangeStatement__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getChangeStatementAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1054:2: ( ( rule__ChangeStatement__UpdateAssignment_1_1 ) )
                    {
                    // InternalFeatureLangParser.g:1054:2: ( ( rule__ChangeStatement__UpdateAssignment_1_1 ) )
                    // InternalFeatureLangParser.g:1055:3: ( rule__ChangeStatement__UpdateAssignment_1_1 )
                    {
                     before(grammarAccess.getChangeStatementAccess().getUpdateAssignment_1_1()); 
                    // InternalFeatureLangParser.g:1056:3: ( rule__ChangeStatement__UpdateAssignment_1_1 )
                    // InternalFeatureLangParser.g:1056:4: rule__ChangeStatement__UpdateAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChangeStatement__UpdateAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getChangeStatementAccess().getUpdateAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeStatement__Alternatives_1"


    // $ANTLR start "rule__ChangeStatement__Alternatives_1_0_2"
    // InternalFeatureLangParser.g:1064:1: rule__ChangeStatement__Alternatives_1_0_2 : ( ( ( rule__ChangeStatement__ActionAssignment_1_0_2_0 ) ) | ( ( rule__ChangeStatement__Group_1_0_2_1__0 ) ) );
    public final void rule__ChangeStatement__Alternatives_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1068:1: ( ( ( rule__ChangeStatement__ActionAssignment_1_0_2_0 ) ) | ( ( rule__ChangeStatement__Group_1_0_2_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Have) ) {
                switch ( input.LA(2) ) {
                case Associations:
                case Association:
                case Composition:
                case The:
                    {
                    alt4=1;
                    }
                    break;
                case A:
                    {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3==Attribute||LA4_3==RULE_ID) ) {
                        alt4=1;
                    }
                    else if ( (LA4_3==Name||LA4_3==URI) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case An:
                    {
                    int LA4_4 = input.LA(3);

                    if ( (LA4_4==Name||LA4_4==URI) ) {
                        alt4=2;
                    }
                    else if ( (LA4_4==Attribute||LA4_4==RULE_ID) ) {
                        alt4=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case Name:
                case URI:
                    {
                    alt4=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

            }
            else if ( ((LA4_0>=Compose && LA4_0<=Inherit)) ) {
                alt4=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalFeatureLangParser.g:1069:2: ( ( rule__ChangeStatement__ActionAssignment_1_0_2_0 ) )
                    {
                    // InternalFeatureLangParser.g:1069:2: ( ( rule__ChangeStatement__ActionAssignment_1_0_2_0 ) )
                    // InternalFeatureLangParser.g:1070:3: ( rule__ChangeStatement__ActionAssignment_1_0_2_0 )
                    {
                     before(grammarAccess.getChangeStatementAccess().getActionAssignment_1_0_2_0()); 
                    // InternalFeatureLangParser.g:1071:3: ( rule__ChangeStatement__ActionAssignment_1_0_2_0 )
                    // InternalFeatureLangParser.g:1071:4: rule__ChangeStatement__ActionAssignment_1_0_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChangeStatement__ActionAssignment_1_0_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getChangeStatementAccess().getActionAssignment_1_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1075:2: ( ( rule__ChangeStatement__Group_1_0_2_1__0 ) )
                    {
                    // InternalFeatureLangParser.g:1075:2: ( ( rule__ChangeStatement__Group_1_0_2_1__0 ) )
                    // InternalFeatureLangParser.g:1076:3: ( rule__ChangeStatement__Group_1_0_2_1__0 )
                    {
                     before(grammarAccess.getChangeStatementAccess().getGroup_1_0_2_1()); 
                    // InternalFeatureLangParser.g:1077:3: ( rule__ChangeStatement__Group_1_0_2_1__0 )
                    // InternalFeatureLangParser.g:1077:4: rule__ChangeStatement__Group_1_0_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChangeStatement__Group_1_0_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getChangeStatementAccess().getGroup_1_0_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeStatement__Alternatives_1_0_2"


    // $ANTLR start "rule__ChangeStatement__Alternatives_1_0_2_1_1"
    // InternalFeatureLangParser.g:1085:1: rule__ChangeStatement__Alternatives_1_0_2_1_1 : ( ( A ) | ( An ) );
    public final void rule__ChangeStatement__Alternatives_1_0_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1089:1: ( ( A ) | ( An ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==A) ) {
                alt5=1;
            }
            else if ( (LA5_0==An) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalFeatureLangParser.g:1090:2: ( A )
                    {
                    // InternalFeatureLangParser.g:1090:2: ( A )
                    // InternalFeatureLangParser.g:1091:3: A
                    {
                     before(grammarAccess.getChangeStatementAccess().getAKeyword_1_0_2_1_1_0()); 
                    match(input,A,FOLLOW_2); 
                     after(grammarAccess.getChangeStatementAccess().getAKeyword_1_0_2_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1096:2: ( An )
                    {
                    // InternalFeatureLangParser.g:1096:2: ( An )
                    // InternalFeatureLangParser.g:1097:3: An
                    {
                     before(grammarAccess.getChangeStatementAccess().getAnKeyword_1_0_2_1_1_1()); 
                    match(input,An,FOLLOW_2); 
                     after(grammarAccess.getChangeStatementAccess().getAnKeyword_1_0_2_1_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeStatement__Alternatives_1_0_2_1_1"


    // $ANTLR start "rule__CreationStatement__Alternatives_3"
    // InternalFeatureLangParser.g:1106:1: rule__CreationStatement__Alternatives_3 : ( ( Exist ) | ( Be ) );
    public final void rule__CreationStatement__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1110:1: ( ( Exist ) | ( Be ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Exist) ) {
                alt6=1;
            }
            else if ( (LA6_0==Be) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalFeatureLangParser.g:1111:2: ( Exist )
                    {
                    // InternalFeatureLangParser.g:1111:2: ( Exist )
                    // InternalFeatureLangParser.g:1112:3: Exist
                    {
                     before(grammarAccess.getCreationStatementAccess().getExistKeyword_3_0()); 
                    match(input,Exist,FOLLOW_2); 
                     after(grammarAccess.getCreationStatementAccess().getExistKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1117:2: ( Be )
                    {
                    // InternalFeatureLangParser.g:1117:2: ( Be )
                    // InternalFeatureLangParser.g:1118:3: Be
                    {
                     before(grammarAccess.getCreationStatementAccess().getBeKeyword_3_1()); 
                    match(input,Be,FOLLOW_2); 
                     after(grammarAccess.getCreationStatementAccess().getBeKeyword_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreationStatement__Alternatives_3"


    // $ANTLR start "rule__Action__TypeAlternatives_0"
    // InternalFeatureLangParser.g:1127:1: rule__Action__TypeAlternatives_0 : ( ( ruleAttributeAction ) | ( ruleAssociationAction ) | ( ruleInheritanceAction ) | ( ruleCompositionAction ) );
    public final void rule__Action__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1131:1: ( ( ruleAttributeAction ) | ( ruleAssociationAction ) | ( ruleInheritanceAction ) | ( ruleCompositionAction ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case Have:
                {
                switch ( input.LA(2) ) {
                case Associations:
                case Association:
                    {
                    alt7=2;
                    }
                    break;
                case The:
                case An:
                case A:
                    {
                    alt7=1;
                    }
                    break;
                case Composition:
                    {
                    alt7=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }

                }
                break;
            case Inherit:
                {
                alt7=3;
                }
                break;
            case Compose:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalFeatureLangParser.g:1132:2: ( ruleAttributeAction )
                    {
                    // InternalFeatureLangParser.g:1132:2: ( ruleAttributeAction )
                    // InternalFeatureLangParser.g:1133:3: ruleAttributeAction
                    {
                     before(grammarAccess.getActionAccess().getTypeAttributeActionParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAttributeAction();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getTypeAttributeActionParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1138:2: ( ruleAssociationAction )
                    {
                    // InternalFeatureLangParser.g:1138:2: ( ruleAssociationAction )
                    // InternalFeatureLangParser.g:1139:3: ruleAssociationAction
                    {
                     before(grammarAccess.getActionAccess().getTypeAssociationActionParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAssociationAction();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getTypeAssociationActionParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureLangParser.g:1144:2: ( ruleInheritanceAction )
                    {
                    // InternalFeatureLangParser.g:1144:2: ( ruleInheritanceAction )
                    // InternalFeatureLangParser.g:1145:3: ruleInheritanceAction
                    {
                     before(grammarAccess.getActionAccess().getTypeInheritanceActionParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleInheritanceAction();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getTypeInheritanceActionParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFeatureLangParser.g:1150:2: ( ruleCompositionAction )
                    {
                    // InternalFeatureLangParser.g:1150:2: ( ruleCompositionAction )
                    // InternalFeatureLangParser.g:1151:3: ruleCompositionAction
                    {
                     before(grammarAccess.getActionAccess().getTypeCompositionActionParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCompositionAction();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getTypeCompositionActionParserRuleCall_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__TypeAlternatives_0"


    // $ANTLR start "rule__UpdateAction__Alternatives_1"
    // InternalFeatureLangParser.g:1160:1: rule__UpdateAction__Alternatives_1 : ( ( An ) | ( A ) );
    public final void rule__UpdateAction__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1164:1: ( ( An ) | ( A ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==An) ) {
                alt8=1;
            }
            else if ( (LA8_0==A) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalFeatureLangParser.g:1165:2: ( An )
                    {
                    // InternalFeatureLangParser.g:1165:2: ( An )
                    // InternalFeatureLangParser.g:1166:3: An
                    {
                     before(grammarAccess.getUpdateActionAccess().getAnKeyword_1_0()); 
                    match(input,An,FOLLOW_2); 
                     after(grammarAccess.getUpdateActionAccess().getAnKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1171:2: ( A )
                    {
                    // InternalFeatureLangParser.g:1171:2: ( A )
                    // InternalFeatureLangParser.g:1172:3: A
                    {
                     before(grammarAccess.getUpdateActionAccess().getAKeyword_1_1()); 
                    match(input,A,FOLLOW_2); 
                     after(grammarAccess.getUpdateActionAccess().getAKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAction__Alternatives_1"


    // $ANTLR start "rule__UpdateAction__Alternatives_7"
    // InternalFeatureLangParser.g:1181:1: rule__UpdateAction__Alternatives_7 : ( ( ( rule__UpdateAction__DatatypeAssignment_7_0 ) ) | ( ( rule__UpdateAction__IdentifierAssignment_7_1 ) ) | ( ( rule__UpdateAction__ValueAssignment_7_2 ) ) );
    public final void rule__UpdateAction__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1185:1: ( ( ( rule__UpdateAction__DatatypeAssignment_7_0 ) ) | ( ( rule__UpdateAction__IdentifierAssignment_7_1 ) ) | ( ( rule__UpdateAction__ValueAssignment_7_2 ) ) )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Be) ) {
                alt9=1;
            }
            else if ( (LA9_0==Have) ) {
                switch ( input.LA(2) ) {
                case A:
                    {
                    int LA9_3 = input.LA(3);

                    if ( (LA9_3==Name||LA9_3==URI) ) {
                        alt9=2;
                    }
                    else if ( (LA9_3==Value) ) {
                        alt9=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case Name:
                case URI:
                case An:
                    {
                    alt9=2;
                    }
                    break;
                case Value:
                    {
                    alt9=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalFeatureLangParser.g:1186:2: ( ( rule__UpdateAction__DatatypeAssignment_7_0 ) )
                    {
                    // InternalFeatureLangParser.g:1186:2: ( ( rule__UpdateAction__DatatypeAssignment_7_0 ) )
                    // InternalFeatureLangParser.g:1187:3: ( rule__UpdateAction__DatatypeAssignment_7_0 )
                    {
                     before(grammarAccess.getUpdateActionAccess().getDatatypeAssignment_7_0()); 
                    // InternalFeatureLangParser.g:1188:3: ( rule__UpdateAction__DatatypeAssignment_7_0 )
                    // InternalFeatureLangParser.g:1188:4: rule__UpdateAction__DatatypeAssignment_7_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UpdateAction__DatatypeAssignment_7_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUpdateActionAccess().getDatatypeAssignment_7_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1192:2: ( ( rule__UpdateAction__IdentifierAssignment_7_1 ) )
                    {
                    // InternalFeatureLangParser.g:1192:2: ( ( rule__UpdateAction__IdentifierAssignment_7_1 ) )
                    // InternalFeatureLangParser.g:1193:3: ( rule__UpdateAction__IdentifierAssignment_7_1 )
                    {
                     before(grammarAccess.getUpdateActionAccess().getIdentifierAssignment_7_1()); 
                    // InternalFeatureLangParser.g:1194:3: ( rule__UpdateAction__IdentifierAssignment_7_1 )
                    // InternalFeatureLangParser.g:1194:4: rule__UpdateAction__IdentifierAssignment_7_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__UpdateAction__IdentifierAssignment_7_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getUpdateActionAccess().getIdentifierAssignment_7_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureLangParser.g:1198:2: ( ( rule__UpdateAction__ValueAssignment_7_2 ) )
                    {
                    // InternalFeatureLangParser.g:1198:2: ( ( rule__UpdateAction__ValueAssignment_7_2 ) )
                    // InternalFeatureLangParser.g:1199:3: ( rule__UpdateAction__ValueAssignment_7_2 )
                    {
                     before(grammarAccess.getUpdateActionAccess().getValueAssignment_7_2()); 
                    // InternalFeatureLangParser.g:1200:3: ( rule__UpdateAction__ValueAssignment_7_2 )
                    // InternalFeatureLangParser.g:1200:4: rule__UpdateAction__ValueAssignment_7_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__UpdateAction__ValueAssignment_7_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getUpdateActionAccess().getValueAssignment_7_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAction__Alternatives_7"


    // $ANTLR start "rule__UpdateAttributeIdentifier__Alternatives_1"
    // InternalFeatureLangParser.g:1208:1: rule__UpdateAttributeIdentifier__Alternatives_1 : ( ( A ) | ( An ) );
    public final void rule__UpdateAttributeIdentifier__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1212:1: ( ( A ) | ( An ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==A) ) {
                alt10=1;
            }
            else if ( (LA10_0==An) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalFeatureLangParser.g:1213:2: ( A )
                    {
                    // InternalFeatureLangParser.g:1213:2: ( A )
                    // InternalFeatureLangParser.g:1214:3: A
                    {
                     before(grammarAccess.getUpdateAttributeIdentifierAccess().getAKeyword_1_0()); 
                    match(input,A,FOLLOW_2); 
                     after(grammarAccess.getUpdateAttributeIdentifierAccess().getAKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1219:2: ( An )
                    {
                    // InternalFeatureLangParser.g:1219:2: ( An )
                    // InternalFeatureLangParser.g:1220:3: An
                    {
                     before(grammarAccess.getUpdateAttributeIdentifierAccess().getAnKeyword_1_1()); 
                    match(input,An,FOLLOW_2); 
                     after(grammarAccess.getUpdateAttributeIdentifierAccess().getAnKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAttributeIdentifier__Alternatives_1"


    // $ANTLR start "rule__AttributeAction__Alternatives_1"
    // InternalFeatureLangParser.g:1229:1: rule__AttributeAction__Alternatives_1 : ( ( The ) | ( An ) | ( A ) );
    public final void rule__AttributeAction__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1233:1: ( ( The ) | ( An ) | ( A ) )
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
                    // InternalFeatureLangParser.g:1234:2: ( The )
                    {
                    // InternalFeatureLangParser.g:1234:2: ( The )
                    // InternalFeatureLangParser.g:1235:3: The
                    {
                     before(grammarAccess.getAttributeActionAccess().getTheKeyword_1_0()); 
                    match(input,The,FOLLOW_2); 
                     after(grammarAccess.getAttributeActionAccess().getTheKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1240:2: ( An )
                    {
                    // InternalFeatureLangParser.g:1240:2: ( An )
                    // InternalFeatureLangParser.g:1241:3: An
                    {
                     before(grammarAccess.getAttributeActionAccess().getAnKeyword_1_1()); 
                    match(input,An,FOLLOW_2); 
                     after(grammarAccess.getAttributeActionAccess().getAnKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureLangParser.g:1246:2: ( A )
                    {
                    // InternalFeatureLangParser.g:1246:2: ( A )
                    // InternalFeatureLangParser.g:1247:3: A
                    {
                     before(grammarAccess.getAttributeActionAccess().getAKeyword_1_2()); 
                    match(input,A,FOLLOW_2); 
                     after(grammarAccess.getAttributeActionAccess().getAKeyword_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAction__Alternatives_1"


    // $ANTLR start "rule__AssociationAction__Alternatives_1"
    // InternalFeatureLangParser.g:1256:1: rule__AssociationAction__Alternatives_1 : ( ( Associations ) | ( Association ) );
    public final void rule__AssociationAction__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1260:1: ( ( Associations ) | ( Association ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Associations) ) {
                alt12=1;
            }
            else if ( (LA12_0==Association) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalFeatureLangParser.g:1261:2: ( Associations )
                    {
                    // InternalFeatureLangParser.g:1261:2: ( Associations )
                    // InternalFeatureLangParser.g:1262:3: Associations
                    {
                     before(grammarAccess.getAssociationActionAccess().getAssociationsKeyword_1_0()); 
                    match(input,Associations,FOLLOW_2); 
                     after(grammarAccess.getAssociationActionAccess().getAssociationsKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1267:2: ( Association )
                    {
                    // InternalFeatureLangParser.g:1267:2: ( Association )
                    // InternalFeatureLangParser.g:1268:3: Association
                    {
                     before(grammarAccess.getAssociationActionAccess().getAssociationKeyword_1_1()); 
                    match(input,Association,FOLLOW_2); 
                     after(grammarAccess.getAssociationActionAccess().getAssociationKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationAction__Alternatives_1"


    // $ANTLR start "rule__AssociationAction__Alternatives_2"
    // InternalFeatureLangParser.g:1277:1: rule__AssociationAction__Alternatives_2 : ( ( ( rule__AssociationAction__CreateAssignment_2_0 ) ) | ( ( rule__AssociationAction__Group_2_1__0 ) ) );
    public final void rule__AssociationAction__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1281:1: ( ( ( rule__AssociationAction__CreateAssignment_2_0 ) ) | ( ( rule__AssociationAction__Group_2_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==To) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalFeatureLangParser.g:1282:2: ( ( rule__AssociationAction__CreateAssignment_2_0 ) )
                    {
                    // InternalFeatureLangParser.g:1282:2: ( ( rule__AssociationAction__CreateAssignment_2_0 ) )
                    // InternalFeatureLangParser.g:1283:3: ( rule__AssociationAction__CreateAssignment_2_0 )
                    {
                     before(grammarAccess.getAssociationActionAccess().getCreateAssignment_2_0()); 
                    // InternalFeatureLangParser.g:1284:3: ( rule__AssociationAction__CreateAssignment_2_0 )
                    // InternalFeatureLangParser.g:1284:4: rule__AssociationAction__CreateAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssociationAction__CreateAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssociationActionAccess().getCreateAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1288:2: ( ( rule__AssociationAction__Group_2_1__0 ) )
                    {
                    // InternalFeatureLangParser.g:1288:2: ( ( rule__AssociationAction__Group_2_1__0 ) )
                    // InternalFeatureLangParser.g:1289:3: ( rule__AssociationAction__Group_2_1__0 )
                    {
                     before(grammarAccess.getAssociationActionAccess().getGroup_2_1()); 
                    // InternalFeatureLangParser.g:1290:3: ( rule__AssociationAction__Group_2_1__0 )
                    // InternalFeatureLangParser.g:1290:4: rule__AssociationAction__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssociationAction__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssociationActionAccess().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationAction__Alternatives_2"


    // $ANTLR start "rule__EditAssociation__TypeAlternatives_0"
    // InternalFeatureLangParser.g:1298:1: rule__EditAssociation__TypeAlternatives_0 : ( ( ruleSetCompatible ) | ( ruleSetVersionRange ) | ( ruleSetVariant ) | ( ruleSetRightOpen ) | ( ruleSetLeftOpen ) );
    public final void rule__EditAssociation__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1302:1: ( ( ruleSetCompatible ) | ( ruleSetVersionRange ) | ( ruleSetVariant ) | ( ruleSetRightOpen ) | ( ruleSetLeftOpen ) )
            int alt14=5;
            switch ( input.LA(1) ) {
            case Compatible:
                {
                alt14=1;
                }
                break;
            case With:
                {
                int LA14_2 = input.LA(2);

                if ( (LA14_2==Version) ) {
                    alt14=2;
                }
                else if ( (LA14_2==All) ) {
                    alt14=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    throw nvae;
                }
                }
                break;
            case Up:
                {
                alt14=4;
                }
                break;
            case Starting:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalFeatureLangParser.g:1303:2: ( ruleSetCompatible )
                    {
                    // InternalFeatureLangParser.g:1303:2: ( ruleSetCompatible )
                    // InternalFeatureLangParser.g:1304:3: ruleSetCompatible
                    {
                     before(grammarAccess.getEditAssociationAccess().getTypeSetCompatibleParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSetCompatible();

                    state._fsp--;

                     after(grammarAccess.getEditAssociationAccess().getTypeSetCompatibleParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1309:2: ( ruleSetVersionRange )
                    {
                    // InternalFeatureLangParser.g:1309:2: ( ruleSetVersionRange )
                    // InternalFeatureLangParser.g:1310:3: ruleSetVersionRange
                    {
                     before(grammarAccess.getEditAssociationAccess().getTypeSetVersionRangeParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSetVersionRange();

                    state._fsp--;

                     after(grammarAccess.getEditAssociationAccess().getTypeSetVersionRangeParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureLangParser.g:1315:2: ( ruleSetVariant )
                    {
                    // InternalFeatureLangParser.g:1315:2: ( ruleSetVariant )
                    // InternalFeatureLangParser.g:1316:3: ruleSetVariant
                    {
                     before(grammarAccess.getEditAssociationAccess().getTypeSetVariantParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSetVariant();

                    state._fsp--;

                     after(grammarAccess.getEditAssociationAccess().getTypeSetVariantParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFeatureLangParser.g:1321:2: ( ruleSetRightOpen )
                    {
                    // InternalFeatureLangParser.g:1321:2: ( ruleSetRightOpen )
                    // InternalFeatureLangParser.g:1322:3: ruleSetRightOpen
                    {
                     before(grammarAccess.getEditAssociationAccess().getTypeSetRightOpenParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSetRightOpen();

                    state._fsp--;

                     after(grammarAccess.getEditAssociationAccess().getTypeSetRightOpenParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalFeatureLangParser.g:1327:2: ( ruleSetLeftOpen )
                    {
                    // InternalFeatureLangParser.g:1327:2: ( ruleSetLeftOpen )
                    // InternalFeatureLangParser.g:1328:3: ruleSetLeftOpen
                    {
                     before(grammarAccess.getEditAssociationAccess().getTypeSetLeftOpenParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleSetLeftOpen();

                    state._fsp--;

                     after(grammarAccess.getEditAssociationAccess().getTypeSetLeftOpenParserRuleCall_0_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditAssociation__TypeAlternatives_0"


    // $ANTLR start "rule__CompositionAction__Alternatives"
    // InternalFeatureLangParser.g:1337:1: rule__CompositionAction__Alternatives : ( ( ( rule__CompositionAction__CreateAssignment_0 ) ) | ( ( rule__CompositionAction__EditAssignment_1 ) ) );
    public final void rule__CompositionAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1341:1: ( ( ( rule__CompositionAction__CreateAssignment_0 ) ) | ( ( rule__CompositionAction__EditAssignment_1 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Compose) ) {
                alt15=1;
            }
            else if ( (LA15_0==Have) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalFeatureLangParser.g:1342:2: ( ( rule__CompositionAction__CreateAssignment_0 ) )
                    {
                    // InternalFeatureLangParser.g:1342:2: ( ( rule__CompositionAction__CreateAssignment_0 ) )
                    // InternalFeatureLangParser.g:1343:3: ( rule__CompositionAction__CreateAssignment_0 )
                    {
                     before(grammarAccess.getCompositionActionAccess().getCreateAssignment_0()); 
                    // InternalFeatureLangParser.g:1344:3: ( rule__CompositionAction__CreateAssignment_0 )
                    // InternalFeatureLangParser.g:1344:4: rule__CompositionAction__CreateAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositionAction__CreateAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCompositionActionAccess().getCreateAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1348:2: ( ( rule__CompositionAction__EditAssignment_1 ) )
                    {
                    // InternalFeatureLangParser.g:1348:2: ( ( rule__CompositionAction__EditAssignment_1 ) )
                    // InternalFeatureLangParser.g:1349:3: ( rule__CompositionAction__EditAssignment_1 )
                    {
                     before(grammarAccess.getCompositionActionAccess().getEditAssignment_1()); 
                    // InternalFeatureLangParser.g:1350:3: ( rule__CompositionAction__EditAssignment_1 )
                    // InternalFeatureLangParser.g:1350:4: rule__CompositionAction__EditAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositionAction__EditAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCompositionActionAccess().getEditAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionAction__Alternatives"


    // $ANTLR start "rule__Class__Alternatives_0"
    // InternalFeatureLangParser.g:1358:1: rule__Class__Alternatives_0 : ( ( The ) | ( A ) );
    public final void rule__Class__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1362:1: ( ( The ) | ( A ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==The) ) {
                alt16=1;
            }
            else if ( (LA16_0==A) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalFeatureLangParser.g:1363:2: ( The )
                    {
                    // InternalFeatureLangParser.g:1363:2: ( The )
                    // InternalFeatureLangParser.g:1364:3: The
                    {
                     before(grammarAccess.getClassAccess().getTheKeyword_0_0()); 
                    match(input,The,FOLLOW_2); 
                     after(grammarAccess.getClassAccess().getTheKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1369:2: ( A )
                    {
                    // InternalFeatureLangParser.g:1369:2: ( A )
                    // InternalFeatureLangParser.g:1370:3: A
                    {
                     before(grammarAccess.getClassAccess().getAKeyword_0_1()); 
                    match(input,A,FOLLOW_2); 
                     after(grammarAccess.getClassAccess().getAKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Alternatives_0"


    // $ANTLR start "rule__Publicity__Alternatives"
    // InternalFeatureLangParser.g:1379:1: rule__Publicity__Alternatives : ( ( ( Public ) ) | ( ( Private ) ) );
    public final void rule__Publicity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1383:1: ( ( ( Public ) ) | ( ( Private ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Public) ) {
                alt17=1;
            }
            else if ( (LA17_0==Private) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalFeatureLangParser.g:1384:2: ( ( Public ) )
                    {
                    // InternalFeatureLangParser.g:1384:2: ( ( Public ) )
                    // InternalFeatureLangParser.g:1385:3: ( Public )
                    {
                     before(grammarAccess.getPublicityAccess().getPUBLICEnumLiteralDeclaration_0()); 
                    // InternalFeatureLangParser.g:1386:3: ( Public )
                    // InternalFeatureLangParser.g:1386:4: Public
                    {
                    match(input,Public,FOLLOW_2); 

                    }

                     after(grammarAccess.getPublicityAccess().getPUBLICEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1390:2: ( ( Private ) )
                    {
                    // InternalFeatureLangParser.g:1390:2: ( ( Private ) )
                    // InternalFeatureLangParser.g:1391:3: ( Private )
                    {
                     before(grammarAccess.getPublicityAccess().getPRIVATEEnumLiteralDeclaration_1()); 
                    // InternalFeatureLangParser.g:1392:3: ( Private )
                    // InternalFeatureLangParser.g:1392:4: Private
                    {
                    match(input,Private,FOLLOW_2); 

                    }

                     after(grammarAccess.getPublicityAccess().getPRIVATEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publicity__Alternatives"


    // $ANTLR start "rule__PriorityValue__Alternatives"
    // InternalFeatureLangParser.g:1400:1: rule__PriorityValue__Alternatives : ( ( ( Should ) ) | ( ( Must ) ) );
    public final void rule__PriorityValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1404:1: ( ( ( Should ) ) | ( ( Must ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Should) ) {
                alt18=1;
            }
            else if ( (LA18_0==Must) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalFeatureLangParser.g:1405:2: ( ( Should ) )
                    {
                    // InternalFeatureLangParser.g:1405:2: ( ( Should ) )
                    // InternalFeatureLangParser.g:1406:3: ( Should )
                    {
                     before(grammarAccess.getPriorityValueAccess().getSHOULDEnumLiteralDeclaration_0()); 
                    // InternalFeatureLangParser.g:1407:3: ( Should )
                    // InternalFeatureLangParser.g:1407:4: Should
                    {
                    match(input,Should,FOLLOW_2); 

                    }

                     after(grammarAccess.getPriorityValueAccess().getSHOULDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1411:2: ( ( Must ) )
                    {
                    // InternalFeatureLangParser.g:1411:2: ( ( Must ) )
                    // InternalFeatureLangParser.g:1412:3: ( Must )
                    {
                     before(grammarAccess.getPriorityValueAccess().getMUSTEnumLiteralDeclaration_1()); 
                    // InternalFeatureLangParser.g:1413:3: ( Must )
                    // InternalFeatureLangParser.g:1413:4: Must
                    {
                    match(input,Must,FOLLOW_2); 

                    }

                     after(grammarAccess.getPriorityValueAccess().getMUSTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PriorityValue__Alternatives"


    // $ANTLR start "rule__IdentifierValue__Alternatives"
    // InternalFeatureLangParser.g:1421:1: rule__IdentifierValue__Alternatives : ( ( ( Name ) ) | ( ( URI ) ) );
    public final void rule__IdentifierValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1425:1: ( ( ( Name ) ) | ( ( URI ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Name) ) {
                alt19=1;
            }
            else if ( (LA19_0==URI) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalFeatureLangParser.g:1426:2: ( ( Name ) )
                    {
                    // InternalFeatureLangParser.g:1426:2: ( ( Name ) )
                    // InternalFeatureLangParser.g:1427:3: ( Name )
                    {
                     before(grammarAccess.getIdentifierValueAccess().getNAMEEnumLiteralDeclaration_0()); 
                    // InternalFeatureLangParser.g:1428:3: ( Name )
                    // InternalFeatureLangParser.g:1428:4: Name
                    {
                    match(input,Name,FOLLOW_2); 

                    }

                     after(grammarAccess.getIdentifierValueAccess().getNAMEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1432:2: ( ( URI ) )
                    {
                    // InternalFeatureLangParser.g:1432:2: ( ( URI ) )
                    // InternalFeatureLangParser.g:1433:3: ( URI )
                    {
                     before(grammarAccess.getIdentifierValueAccess().getURIEnumLiteralDeclaration_1()); 
                    // InternalFeatureLangParser.g:1434:3: ( URI )
                    // InternalFeatureLangParser.g:1434:4: URI
                    {
                    match(input,URI,FOLLOW_2); 

                    }

                     after(grammarAccess.getIdentifierValueAccess().getURIEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentifierValue__Alternatives"


    // $ANTLR start "rule__Datatype__Alternatives"
    // InternalFeatureLangParser.g:1442:1: rule__Datatype__Alternatives : ( ( ( Time ) ) | ( ( Phrase ) ) | ( ( Number ) ) );
    public final void rule__Datatype__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1446:1: ( ( ( Time ) ) | ( ( Phrase ) ) | ( ( Number ) ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case Time:
                {
                alt20=1;
                }
                break;
            case Phrase:
                {
                alt20=2;
                }
                break;
            case Number:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalFeatureLangParser.g:1447:2: ( ( Time ) )
                    {
                    // InternalFeatureLangParser.g:1447:2: ( ( Time ) )
                    // InternalFeatureLangParser.g:1448:3: ( Time )
                    {
                     before(grammarAccess.getDatatypeAccess().getWORDEnumLiteralDeclaration_0()); 
                    // InternalFeatureLangParser.g:1449:3: ( Time )
                    // InternalFeatureLangParser.g:1449:4: Time
                    {
                    match(input,Time,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatatypeAccess().getWORDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1453:2: ( ( Phrase ) )
                    {
                    // InternalFeatureLangParser.g:1453:2: ( ( Phrase ) )
                    // InternalFeatureLangParser.g:1454:3: ( Phrase )
                    {
                     before(grammarAccess.getDatatypeAccess().getPHRASEEnumLiteralDeclaration_1()); 
                    // InternalFeatureLangParser.g:1455:3: ( Phrase )
                    // InternalFeatureLangParser.g:1455:4: Phrase
                    {
                    match(input,Phrase,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatatypeAccess().getPHRASEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureLangParser.g:1459:2: ( ( Number ) )
                    {
                    // InternalFeatureLangParser.g:1459:2: ( ( Number ) )
                    // InternalFeatureLangParser.g:1460:3: ( Number )
                    {
                     before(grammarAccess.getDatatypeAccess().getNUMBEREnumLiteralDeclaration_2()); 
                    // InternalFeatureLangParser.g:1461:3: ( Number )
                    // InternalFeatureLangParser.g:1461:4: Number
                    {
                    match(input,Number,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatatypeAccess().getNUMBEREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Alternatives"


    // $ANTLR start "rule__Statement__Group__0"
    // InternalFeatureLangParser.g:1469:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1473:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalFeatureLangParser.g:1474:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__0"


    // $ANTLR start "rule__Statement__Group__0__Impl"
    // InternalFeatureLangParser.g:1481:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__Alternatives_0 ) ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1485:1: ( ( ( rule__Statement__Alternatives_0 ) ) )
            // InternalFeatureLangParser.g:1486:1: ( ( rule__Statement__Alternatives_0 ) )
            {
            // InternalFeatureLangParser.g:1486:1: ( ( rule__Statement__Alternatives_0 ) )
            // InternalFeatureLangParser.g:1487:2: ( rule__Statement__Alternatives_0 )
            {
             before(grammarAccess.getStatementAccess().getAlternatives_0()); 
            // InternalFeatureLangParser.g:1488:2: ( rule__Statement__Alternatives_0 )
            // InternalFeatureLangParser.g:1488:3: rule__Statement__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__0__Impl"


    // $ANTLR start "rule__Statement__Group__1"
    // InternalFeatureLangParser.g:1496:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1500:1: ( rule__Statement__Group__1__Impl )
            // InternalFeatureLangParser.g:1501:2: rule__Statement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__1"


    // $ANTLR start "rule__Statement__Group__1__Impl"
    // InternalFeatureLangParser.g:1507:1: rule__Statement__Group__1__Impl : ( ( FullStop )? ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1511:1: ( ( ( FullStop )? ) )
            // InternalFeatureLangParser.g:1512:1: ( ( FullStop )? )
            {
            // InternalFeatureLangParser.g:1512:1: ( ( FullStop )? )
            // InternalFeatureLangParser.g:1513:2: ( FullStop )?
            {
             before(grammarAccess.getStatementAccess().getFullStopKeyword_1()); 
            // InternalFeatureLangParser.g:1514:2: ( FullStop )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==FullStop) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalFeatureLangParser.g:1514:3: FullStop
                    {
                    match(input,FullStop,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getStatementAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__1__Impl"


    // $ANTLR start "rule__ChangeStatement__Group__0"
    // InternalFeatureLangParser.g:1523:1: rule__ChangeStatement__Group__0 : rule__ChangeStatement__Group__0__Impl rule__ChangeStatement__Group__1 ;
    public final void rule__ChangeStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1527:1: ( rule__ChangeStatement__Group__0__Impl rule__ChangeStatement__Group__1 )
            // InternalFeatureLangParser.g:1528:2: rule__ChangeStatement__Group__0__Impl rule__ChangeStatement__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ChangeStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeStatement__Group__0"


    // $ANTLR start "rule__ChangeStatement__Group__0__Impl"
    // InternalFeatureLangParser.g:1535:1: rule__ChangeStatement__Group__0__Impl : ( ( rule__ChangeStatement__TargetAssignment_0 ) ) ;
    public final void rule__ChangeStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1539:1: ( ( ( rule__ChangeStatement__TargetAssignment_0 ) ) )
            // InternalFeatureLangParser.g:1540:1: ( ( rule__ChangeStatement__TargetAssignment_0 ) )
            {
            // InternalFeatureLangParser.g:1540:1: ( ( rule__ChangeStatement__TargetAssignment_0 ) )
            // InternalFeatureLangParser.g:1541:2: ( rule__ChangeStatement__TargetAssignment_0 )
            {
             before(grammarAccess.getChangeStatementAccess().getTargetAssignment_0()); 
            // InternalFeatureLangParser.g:1542:2: ( rule__ChangeStatement__TargetAssignment_0 )
            // InternalFeatureLangParser.g:1542:3: rule__ChangeStatement__TargetAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ChangeStatement__TargetAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getChangeStatementAccess().getTargetAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeStatement__Group__0__Impl"


    // $ANTLR start "rule__ChangeStatement__Group__1"
    // InternalFeatureLangParser.g:1550:1: rule__ChangeStatement__Group__1 : rule__ChangeStatement__Group__1__Impl ;
    public final void rule__ChangeStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1554:1: ( rule__ChangeStatement__Group__1__Impl )
            // InternalFeatureLangParser.g:1555:2: rule__ChangeStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChangeStatement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeStatement__Group__1"


    // $ANTLR start "rule__ChangeStatement__Group__1__Impl"
    // InternalFeatureLangParser.g:1561:1: rule__ChangeStatement__Group__1__Impl : ( ( rule__ChangeStatement__Alternatives_1 ) ) ;
    public final void rule__ChangeStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1565:1: ( ( ( rule__ChangeStatement__Alternatives_1 ) ) )
            // InternalFeatureLangParser.g:1566:1: ( ( rule__ChangeStatement__Alternatives_1 ) )
            {
            // InternalFeatureLangParser.g:1566:1: ( ( rule__ChangeStatement__Alternatives_1 ) )
            // InternalFeatureLangParser.g:1567:2: ( rule__ChangeStatement__Alternatives_1 )
            {
             before(grammarAccess.getChangeStatementAccess().getAlternatives_1()); 
            // InternalFeatureLangParser.g:1568:2: ( rule__ChangeStatement__Alternatives_1 )
            // InternalFeatureLangParser.g:1568:3: rule__ChangeStatement__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__ChangeStatement__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getChangeStatementAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeStatement__Group__1__Impl"


    // $ANTLR start "rule__ChangeStatement__Group_1_0__0"
    // InternalFeatureLangParser.g:1577:1: rule__ChangeStatement__Group_1_0__0 : rule__ChangeStatement__Group_1_0__0__Impl rule__ChangeStatement__Group_1_0__1 ;
    public final void rule__ChangeStatement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1581:1: ( rule__ChangeStatement__Group_1_0__0__Impl rule__ChangeStatement__Group_1_0__1 )
            // InternalFeatureLangParser.g:1582:2: rule__ChangeStatement__Group_1_0__0__Impl rule__ChangeStatement__Group_1_0__1
            {
            pushFollow(FOLLOW_6);
            rule__ChangeStatement__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeStatement__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeStatement__Group_1_0__0"


    // $ANTLR start "rule__ChangeStatement__Group_1_0__0__Impl"
    // InternalFeatureLangParser.g:1589:1: rule__ChangeStatement__Group_1_0__0__Impl : ( ( rule__ChangeStatement__PriorityAssignment_1_0_0 ) ) ;
    public final void rule__ChangeStatement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1593:1: ( ( ( rule__ChangeStatement__PriorityAssignment_1_0_0 ) ) )
            // InternalFeatureLangParser.g:1594:1: ( ( rule__ChangeStatement__PriorityAssignment_1_0_0 ) )
            {
            // InternalFeatureLangParser.g:1594:1: ( ( rule__ChangeStatement__PriorityAssignment_1_0_0 ) )
            // InternalFeatureLangParser.g:1595:2: ( rule__ChangeStatement__PriorityAssignment_1_0_0 )
            {
             before(grammarAccess.getChangeStatementAccess().getPriorityAssignment_1_0_0()); 
            // InternalFeatureLangParser.g:1596:2: ( rule__ChangeStatement__PriorityAssignment_1_0_0 )
            // InternalFeatureLangParser.g:1596:3: rule__ChangeStatement__PriorityAssignment_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ChangeStatement__PriorityAssignment_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getChangeStatementAccess().getPriorityAssignment_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeStatement__Group_1_0__0__Impl"


    // $ANTLR start "rule__ChangeStatement__Group_1_0__1"
    // InternalFeatureLangParser.g:1604:1: rule__ChangeStatement__Group_1_0__1 : rule__ChangeStatement__Group_1_0__1__Impl rule__ChangeStatement__Group_1_0__2 ;
    public final void rule__ChangeStatement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1608:1: ( rule__ChangeStatement__Group_1_0__1__Impl rule__ChangeStatement__Group_1_0__2 )
            // InternalFeatureLangParser.g:1609:2: rule__ChangeStatement__Group_1_0__1__Impl rule__ChangeStatement__Group_1_0__2
            {
            pushFollow(FOLLOW_6);
            rule__ChangeStatement__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeStatement__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeStatement__Group_1_0__1"


    // $ANTLR start "rule__ChangeStatement__Group_1_0__1__Impl"
    // InternalFeatureLangParser.g:1616:1: rule__ChangeStatement__Group_1_0__1__Impl : ( ( rule__ChangeStatement__NegationAssignment_1_0_1 )? ) ;
    public final void rule__ChangeStatement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1620:1: ( ( ( rule__ChangeStatement__NegationAssignment_1_0_1 )? ) )
            // InternalFeatureLangParser.g:1621:1: ( ( rule__ChangeStatement__NegationAssignment_1_0_1 )? )
            {
            // InternalFeatureLangParser.g:1621:1: ( ( rule__ChangeStatement__NegationAssignment_1_0_1 )? )
            // InternalFeatureLangParser.g:1622:2: ( rule__ChangeStatement__NegationAssignment_1_0_1 )?
            {
             before(grammarAccess.getChangeStatementAccess().getNegationAssignment_1_0_1()); 
            // InternalFeatureLangParser.g:1623:2: ( rule__ChangeStatement__NegationAssignment_1_0_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Not) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalFeatureLangParser.g:1623:3: rule__ChangeStatement__NegationAssignment_1_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChangeStatement__NegationAssignment_1_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChangeStatementAccess().getNegationAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeStatement__Group_1_0__1__Impl"


    // $ANTLR start "rule__ChangeStatement__Group_1_0__2"
    // InternalFeatureLangParser.g:1631:1: rule__ChangeStatement__Group_1_0__2 : rule__ChangeStatement__Group_1_0__2__Impl ;
    public final void rule__ChangeStatement__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1635:1: ( rule__ChangeStatement__Group_1_0__2__Impl )
            // InternalFeatureLangParser.g:1636:2: rule__ChangeStatement__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChangeStatement__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeStatement__Group_1_0__2"


    // $ANTLR start "rule__ChangeStatement__Group_1_0__2__Impl"
    // InternalFeatureLangParser.g:1642:1: rule__ChangeStatement__Group_1_0__2__Impl : ( ( rule__ChangeStatement__Alternatives_1_0_2 ) ) ;
    public final void rule__ChangeStatement__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1646:1: ( ( ( rule__ChangeStatement__Alternatives_1_0_2 ) ) )
            // InternalFeatureLangParser.g:1647:1: ( ( rule__ChangeStatement__Alternatives_1_0_2 ) )
            {
            // InternalFeatureLangParser.g:1647:1: ( ( rule__ChangeStatement__Alternatives_1_0_2 ) )
            // InternalFeatureLangParser.g:1648:2: ( rule__ChangeStatement__Alternatives_1_0_2 )
            {
             before(grammarAccess.getChangeStatementAccess().getAlternatives_1_0_2()); 
            // InternalFeatureLangParser.g:1649:2: ( rule__ChangeStatement__Alternatives_1_0_2 )
            // InternalFeatureLangParser.g:1649:3: rule__ChangeStatement__Alternatives_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ChangeStatement__Alternatives_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getChangeStatementAccess().getAlternatives_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeStatement__Group_1_0__2__Impl"


    // $ANTLR start "rule__ChangeStatement__Group_1_0_2_1__0"
    // InternalFeatureLangParser.g:1658:1: rule__ChangeStatement__Group_1_0_2_1__0 : rule__ChangeStatement__Group_1_0_2_1__0__Impl rule__ChangeStatement__Group_1_0_2_1__1 ;
    public final void rule__ChangeStatement__Group_1_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1662:1: ( rule__ChangeStatement__Group_1_0_2_1__0__Impl rule__ChangeStatement__Group_1_0_2_1__1 )
            // InternalFeatureLangParser.g:1663:2: rule__ChangeStatement__Group_1_0_2_1__0__Impl rule__ChangeStatement__Group_1_0_2_1__1
            {
            pushFollow(FOLLOW_7);
            rule__ChangeStatement__Group_1_0_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeStatement__Group_1_0_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeStatement__Group_1_0_2_1__0"


    // $ANTLR start "rule__ChangeStatement__Group_1_0_2_1__0__Impl"
    // InternalFeatureLangParser.g:1670:1: rule__ChangeStatement__Group_1_0_2_1__0__Impl : ( Have ) ;
    public final void rule__ChangeStatement__Group_1_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1674:1: ( ( Have ) )
            // InternalFeatureLangParser.g:1675:1: ( Have )
            {
            // InternalFeatureLangParser.g:1675:1: ( Have )
            // InternalFeatureLangParser.g:1676:2: Have
            {
             before(grammarAccess.getChangeStatementAccess().getHaveKeyword_1_0_2_1_0()); 
            match(input,Have,FOLLOW_2); 
             after(grammarAccess.getChangeStatementAccess().getHaveKeyword_1_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeStatement__Group_1_0_2_1__0__Impl"


    // $ANTLR start "rule__ChangeStatement__Group_1_0_2_1__1"
    // InternalFeatureLangParser.g:1685:1: rule__ChangeStatement__Group_1_0_2_1__1 : rule__ChangeStatement__Group_1_0_2_1__1__Impl rule__ChangeStatement__Group_1_0_2_1__2 ;
    public final void rule__ChangeStatement__Group_1_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1689:1: ( rule__ChangeStatement__Group_1_0_2_1__1__Impl rule__ChangeStatement__Group_1_0_2_1__2 )
            // InternalFeatureLangParser.g:1690:2: rule__ChangeStatement__Group_1_0_2_1__1__Impl rule__ChangeStatement__Group_1_0_2_1__2
            {
            pushFollow(FOLLOW_7);
            rule__ChangeStatement__Group_1_0_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeStatement__Group_1_0_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeStatement__Group_1_0_2_1__1"


    // $ANTLR start "rule__ChangeStatement__Group_1_0_2_1__1__Impl"
    // InternalFeatureLangParser.g:1697:1: rule__ChangeStatement__Group_1_0_2_1__1__Impl : ( ( rule__ChangeStatement__Alternatives_1_0_2_1_1 )? ) ;
    public final void rule__ChangeStatement__Group_1_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1701:1: ( ( ( rule__ChangeStatement__Alternatives_1_0_2_1_1 )? ) )
            // InternalFeatureLangParser.g:1702:1: ( ( rule__ChangeStatement__Alternatives_1_0_2_1_1 )? )
            {
            // InternalFeatureLangParser.g:1702:1: ( ( rule__ChangeStatement__Alternatives_1_0_2_1_1 )? )
            // InternalFeatureLangParser.g:1703:2: ( rule__ChangeStatement__Alternatives_1_0_2_1_1 )?
            {
             before(grammarAccess.getChangeStatementAccess().getAlternatives_1_0_2_1_1()); 
            // InternalFeatureLangParser.g:1704:2: ( rule__ChangeStatement__Alternatives_1_0_2_1_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==An||LA23_0==A) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalFeatureLangParser.g:1704:3: rule__ChangeStatement__Alternatives_1_0_2_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChangeStatement__Alternatives_1_0_2_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChangeStatementAccess().getAlternatives_1_0_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeStatement__Group_1_0_2_1__1__Impl"


    // $ANTLR start "rule__ChangeStatement__Group_1_0_2_1__2"
    // InternalFeatureLangParser.g:1712:1: rule__ChangeStatement__Group_1_0_2_1__2 : rule__ChangeStatement__Group_1_0_2_1__2__Impl ;
    public final void rule__ChangeStatement__Group_1_0_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1716:1: ( rule__ChangeStatement__Group_1_0_2_1__2__Impl )
            // InternalFeatureLangParser.g:1717:2: rule__ChangeStatement__Group_1_0_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChangeStatement__Group_1_0_2_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeStatement__Group_1_0_2_1__2"


    // $ANTLR start "rule__ChangeStatement__Group_1_0_2_1__2__Impl"
    // InternalFeatureLangParser.g:1723:1: rule__ChangeStatement__Group_1_0_2_1__2__Impl : ( ( rule__ChangeStatement__IdentifierAssignment_1_0_2_1_2 ) ) ;
    public final void rule__ChangeStatement__Group_1_0_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1727:1: ( ( ( rule__ChangeStatement__IdentifierAssignment_1_0_2_1_2 ) ) )
            // InternalFeatureLangParser.g:1728:1: ( ( rule__ChangeStatement__IdentifierAssignment_1_0_2_1_2 ) )
            {
            // InternalFeatureLangParser.g:1728:1: ( ( rule__ChangeStatement__IdentifierAssignment_1_0_2_1_2 ) )
            // InternalFeatureLangParser.g:1729:2: ( rule__ChangeStatement__IdentifierAssignment_1_0_2_1_2 )
            {
             before(grammarAccess.getChangeStatementAccess().getIdentifierAssignment_1_0_2_1_2()); 
            // InternalFeatureLangParser.g:1730:2: ( rule__ChangeStatement__IdentifierAssignment_1_0_2_1_2 )
            // InternalFeatureLangParser.g:1730:3: rule__ChangeStatement__IdentifierAssignment_1_0_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ChangeStatement__IdentifierAssignment_1_0_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getChangeStatementAccess().getIdentifierAssignment_1_0_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeStatement__Group_1_0_2_1__2__Impl"


    // $ANTLR start "rule__CreationStatement__Group__0"
    // InternalFeatureLangParser.g:1739:1: rule__CreationStatement__Group__0 : rule__CreationStatement__Group__0__Impl rule__CreationStatement__Group__1 ;
    public final void rule__CreationStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1743:1: ( rule__CreationStatement__Group__0__Impl rule__CreationStatement__Group__1 )
            // InternalFeatureLangParser.g:1744:2: rule__CreationStatement__Group__0__Impl rule__CreationStatement__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__CreationStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreationStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreationStatement__Group__0"


    // $ANTLR start "rule__CreationStatement__Group__0__Impl"
    // InternalFeatureLangParser.g:1751:1: rule__CreationStatement__Group__0__Impl : ( ( rule__CreationStatement__ClassElementAssignment_0 ) ) ;
    public final void rule__CreationStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1755:1: ( ( ( rule__CreationStatement__ClassElementAssignment_0 ) ) )
            // InternalFeatureLangParser.g:1756:1: ( ( rule__CreationStatement__ClassElementAssignment_0 ) )
            {
            // InternalFeatureLangParser.g:1756:1: ( ( rule__CreationStatement__ClassElementAssignment_0 ) )
            // InternalFeatureLangParser.g:1757:2: ( rule__CreationStatement__ClassElementAssignment_0 )
            {
             before(grammarAccess.getCreationStatementAccess().getClassElementAssignment_0()); 
            // InternalFeatureLangParser.g:1758:2: ( rule__CreationStatement__ClassElementAssignment_0 )
            // InternalFeatureLangParser.g:1758:3: rule__CreationStatement__ClassElementAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CreationStatement__ClassElementAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCreationStatementAccess().getClassElementAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreationStatement__Group__0__Impl"


    // $ANTLR start "rule__CreationStatement__Group__1"
    // InternalFeatureLangParser.g:1766:1: rule__CreationStatement__Group__1 : rule__CreationStatement__Group__1__Impl rule__CreationStatement__Group__2 ;
    public final void rule__CreationStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1770:1: ( rule__CreationStatement__Group__1__Impl rule__CreationStatement__Group__2 )
            // InternalFeatureLangParser.g:1771:2: rule__CreationStatement__Group__1__Impl rule__CreationStatement__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__CreationStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreationStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreationStatement__Group__1"


    // $ANTLR start "rule__CreationStatement__Group__1__Impl"
    // InternalFeatureLangParser.g:1778:1: rule__CreationStatement__Group__1__Impl : ( ( rule__CreationStatement__PriorityAssignment_1 ) ) ;
    public final void rule__CreationStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1782:1: ( ( ( rule__CreationStatement__PriorityAssignment_1 ) ) )
            // InternalFeatureLangParser.g:1783:1: ( ( rule__CreationStatement__PriorityAssignment_1 ) )
            {
            // InternalFeatureLangParser.g:1783:1: ( ( rule__CreationStatement__PriorityAssignment_1 ) )
            // InternalFeatureLangParser.g:1784:2: ( rule__CreationStatement__PriorityAssignment_1 )
            {
             before(grammarAccess.getCreationStatementAccess().getPriorityAssignment_1()); 
            // InternalFeatureLangParser.g:1785:2: ( rule__CreationStatement__PriorityAssignment_1 )
            // InternalFeatureLangParser.g:1785:3: rule__CreationStatement__PriorityAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CreationStatement__PriorityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCreationStatementAccess().getPriorityAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreationStatement__Group__1__Impl"


    // $ANTLR start "rule__CreationStatement__Group__2"
    // InternalFeatureLangParser.g:1793:1: rule__CreationStatement__Group__2 : rule__CreationStatement__Group__2__Impl rule__CreationStatement__Group__3 ;
    public final void rule__CreationStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1797:1: ( rule__CreationStatement__Group__2__Impl rule__CreationStatement__Group__3 )
            // InternalFeatureLangParser.g:1798:2: rule__CreationStatement__Group__2__Impl rule__CreationStatement__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__CreationStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreationStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreationStatement__Group__2"


    // $ANTLR start "rule__CreationStatement__Group__2__Impl"
    // InternalFeatureLangParser.g:1805:1: rule__CreationStatement__Group__2__Impl : ( ( rule__CreationStatement__NegationAssignment_2 )? ) ;
    public final void rule__CreationStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1809:1: ( ( ( rule__CreationStatement__NegationAssignment_2 )? ) )
            // InternalFeatureLangParser.g:1810:1: ( ( rule__CreationStatement__NegationAssignment_2 )? )
            {
            // InternalFeatureLangParser.g:1810:1: ( ( rule__CreationStatement__NegationAssignment_2 )? )
            // InternalFeatureLangParser.g:1811:2: ( rule__CreationStatement__NegationAssignment_2 )?
            {
             before(grammarAccess.getCreationStatementAccess().getNegationAssignment_2()); 
            // InternalFeatureLangParser.g:1812:2: ( rule__CreationStatement__NegationAssignment_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Not) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalFeatureLangParser.g:1812:3: rule__CreationStatement__NegationAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__CreationStatement__NegationAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCreationStatementAccess().getNegationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreationStatement__Group__2__Impl"


    // $ANTLR start "rule__CreationStatement__Group__3"
    // InternalFeatureLangParser.g:1820:1: rule__CreationStatement__Group__3 : rule__CreationStatement__Group__3__Impl ;
    public final void rule__CreationStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1824:1: ( rule__CreationStatement__Group__3__Impl )
            // InternalFeatureLangParser.g:1825:2: rule__CreationStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CreationStatement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreationStatement__Group__3"


    // $ANTLR start "rule__CreationStatement__Group__3__Impl"
    // InternalFeatureLangParser.g:1831:1: rule__CreationStatement__Group__3__Impl : ( ( rule__CreationStatement__Alternatives_3 ) ) ;
    public final void rule__CreationStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1835:1: ( ( ( rule__CreationStatement__Alternatives_3 ) ) )
            // InternalFeatureLangParser.g:1836:1: ( ( rule__CreationStatement__Alternatives_3 ) )
            {
            // InternalFeatureLangParser.g:1836:1: ( ( rule__CreationStatement__Alternatives_3 ) )
            // InternalFeatureLangParser.g:1837:2: ( rule__CreationStatement__Alternatives_3 )
            {
             before(grammarAccess.getCreationStatementAccess().getAlternatives_3()); 
            // InternalFeatureLangParser.g:1838:2: ( rule__CreationStatement__Alternatives_3 )
            // InternalFeatureLangParser.g:1838:3: rule__CreationStatement__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__CreationStatement__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getCreationStatementAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreationStatement__Group__3__Impl"


    // $ANTLR start "rule__UpdateAction__Group__0"
    // InternalFeatureLangParser.g:1847:1: rule__UpdateAction__Group__0 : rule__UpdateAction__Group__0__Impl rule__UpdateAction__Group__1 ;
    public final void rule__UpdateAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1851:1: ( rule__UpdateAction__Group__0__Impl rule__UpdateAction__Group__1 )
            // InternalFeatureLangParser.g:1852:2: rule__UpdateAction__Group__0__Impl rule__UpdateAction__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__UpdateAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAction__Group__0"


    // $ANTLR start "rule__UpdateAction__Group__0__Impl"
    // InternalFeatureLangParser.g:1859:1: rule__UpdateAction__Group__0__Impl : ( Has ) ;
    public final void rule__UpdateAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1863:1: ( ( Has ) )
            // InternalFeatureLangParser.g:1864:1: ( Has )
            {
            // InternalFeatureLangParser.g:1864:1: ( Has )
            // InternalFeatureLangParser.g:1865:2: Has
            {
             before(grammarAccess.getUpdateActionAccess().getHasKeyword_0()); 
            match(input,Has,FOLLOW_2); 
             after(grammarAccess.getUpdateActionAccess().getHasKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAction__Group__0__Impl"


    // $ANTLR start "rule__UpdateAction__Group__1"
    // InternalFeatureLangParser.g:1874:1: rule__UpdateAction__Group__1 : rule__UpdateAction__Group__1__Impl rule__UpdateAction__Group__2 ;
    public final void rule__UpdateAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1878:1: ( rule__UpdateAction__Group__1__Impl rule__UpdateAction__Group__2 )
            // InternalFeatureLangParser.g:1879:2: rule__UpdateAction__Group__1__Impl rule__UpdateAction__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__UpdateAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateAction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAction__Group__1"


    // $ANTLR start "rule__UpdateAction__Group__1__Impl"
    // InternalFeatureLangParser.g:1886:1: rule__UpdateAction__Group__1__Impl : ( ( rule__UpdateAction__Alternatives_1 ) ) ;
    public final void rule__UpdateAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1890:1: ( ( ( rule__UpdateAction__Alternatives_1 ) ) )
            // InternalFeatureLangParser.g:1891:1: ( ( rule__UpdateAction__Alternatives_1 ) )
            {
            // InternalFeatureLangParser.g:1891:1: ( ( rule__UpdateAction__Alternatives_1 ) )
            // InternalFeatureLangParser.g:1892:2: ( rule__UpdateAction__Alternatives_1 )
            {
             before(grammarAccess.getUpdateActionAccess().getAlternatives_1()); 
            // InternalFeatureLangParser.g:1893:2: ( rule__UpdateAction__Alternatives_1 )
            // InternalFeatureLangParser.g:1893:3: rule__UpdateAction__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__UpdateAction__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getUpdateActionAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAction__Group__1__Impl"


    // $ANTLR start "rule__UpdateAction__Group__2"
    // InternalFeatureLangParser.g:1901:1: rule__UpdateAction__Group__2 : rule__UpdateAction__Group__2__Impl rule__UpdateAction__Group__3 ;
    public final void rule__UpdateAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1905:1: ( rule__UpdateAction__Group__2__Impl rule__UpdateAction__Group__3 )
            // InternalFeatureLangParser.g:1906:2: rule__UpdateAction__Group__2__Impl rule__UpdateAction__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__UpdateAction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateAction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAction__Group__2"


    // $ANTLR start "rule__UpdateAction__Group__2__Impl"
    // InternalFeatureLangParser.g:1913:1: rule__UpdateAction__Group__2__Impl : ( ( Existing )? ) ;
    public final void rule__UpdateAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1917:1: ( ( ( Existing )? ) )
            // InternalFeatureLangParser.g:1918:1: ( ( Existing )? )
            {
            // InternalFeatureLangParser.g:1918:1: ( ( Existing )? )
            // InternalFeatureLangParser.g:1919:2: ( Existing )?
            {
             before(grammarAccess.getUpdateActionAccess().getExistingKeyword_2()); 
            // InternalFeatureLangParser.g:1920:2: ( Existing )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Existing) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalFeatureLangParser.g:1920:3: Existing
                    {
                    match(input,Existing,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getUpdateActionAccess().getExistingKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAction__Group__2__Impl"


    // $ANTLR start "rule__UpdateAction__Group__3"
    // InternalFeatureLangParser.g:1928:1: rule__UpdateAction__Group__3 : rule__UpdateAction__Group__3__Impl rule__UpdateAction__Group__4 ;
    public final void rule__UpdateAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1932:1: ( rule__UpdateAction__Group__3__Impl rule__UpdateAction__Group__4 )
            // InternalFeatureLangParser.g:1933:2: rule__UpdateAction__Group__3__Impl rule__UpdateAction__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__UpdateAction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateAction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAction__Group__3"


    // $ANTLR start "rule__UpdateAction__Group__3__Impl"
    // InternalFeatureLangParser.g:1940:1: rule__UpdateAction__Group__3__Impl : ( ( rule__UpdateAction__AttributeAssignment_3 ) ) ;
    public final void rule__UpdateAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1944:1: ( ( ( rule__UpdateAction__AttributeAssignment_3 ) ) )
            // InternalFeatureLangParser.g:1945:1: ( ( rule__UpdateAction__AttributeAssignment_3 ) )
            {
            // InternalFeatureLangParser.g:1945:1: ( ( rule__UpdateAction__AttributeAssignment_3 ) )
            // InternalFeatureLangParser.g:1946:2: ( rule__UpdateAction__AttributeAssignment_3 )
            {
             before(grammarAccess.getUpdateActionAccess().getAttributeAssignment_3()); 
            // InternalFeatureLangParser.g:1947:2: ( rule__UpdateAction__AttributeAssignment_3 )
            // InternalFeatureLangParser.g:1947:3: rule__UpdateAction__AttributeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__UpdateAction__AttributeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUpdateActionAccess().getAttributeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAction__Group__3__Impl"


    // $ANTLR start "rule__UpdateAction__Group__4"
    // InternalFeatureLangParser.g:1955:1: rule__UpdateAction__Group__4 : rule__UpdateAction__Group__4__Impl rule__UpdateAction__Group__5 ;
    public final void rule__UpdateAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1959:1: ( rule__UpdateAction__Group__4__Impl rule__UpdateAction__Group__5 )
            // InternalFeatureLangParser.g:1960:2: rule__UpdateAction__Group__4__Impl rule__UpdateAction__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__UpdateAction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateAction__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAction__Group__4"


    // $ANTLR start "rule__UpdateAction__Group__4__Impl"
    // InternalFeatureLangParser.g:1967:1: rule__UpdateAction__Group__4__Impl : ( FullStop ) ;
    public final void rule__UpdateAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1971:1: ( ( FullStop ) )
            // InternalFeatureLangParser.g:1972:1: ( FullStop )
            {
            // InternalFeatureLangParser.g:1972:1: ( FullStop )
            // InternalFeatureLangParser.g:1973:2: FullStop
            {
             before(grammarAccess.getUpdateActionAccess().getFullStopKeyword_4()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getUpdateActionAccess().getFullStopKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAction__Group__4__Impl"


    // $ANTLR start "rule__UpdateAction__Group__5"
    // InternalFeatureLangParser.g:1982:1: rule__UpdateAction__Group__5 : rule__UpdateAction__Group__5__Impl rule__UpdateAction__Group__6 ;
    public final void rule__UpdateAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1986:1: ( rule__UpdateAction__Group__5__Impl rule__UpdateAction__Group__6 )
            // InternalFeatureLangParser.g:1987:2: rule__UpdateAction__Group__5__Impl rule__UpdateAction__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__UpdateAction__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateAction__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAction__Group__5"


    // $ANTLR start "rule__UpdateAction__Group__5__Impl"
    // InternalFeatureLangParser.g:1994:1: rule__UpdateAction__Group__5__Impl : ( It ) ;
    public final void rule__UpdateAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1998:1: ( ( It ) )
            // InternalFeatureLangParser.g:1999:1: ( It )
            {
            // InternalFeatureLangParser.g:1999:1: ( It )
            // InternalFeatureLangParser.g:2000:2: It
            {
             before(grammarAccess.getUpdateActionAccess().getItKeyword_5()); 
            match(input,It,FOLLOW_2); 
             after(grammarAccess.getUpdateActionAccess().getItKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAction__Group__5__Impl"


    // $ANTLR start "rule__UpdateAction__Group__6"
    // InternalFeatureLangParser.g:2009:1: rule__UpdateAction__Group__6 : rule__UpdateAction__Group__6__Impl rule__UpdateAction__Group__7 ;
    public final void rule__UpdateAction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2013:1: ( rule__UpdateAction__Group__6__Impl rule__UpdateAction__Group__7 )
            // InternalFeatureLangParser.g:2014:2: rule__UpdateAction__Group__6__Impl rule__UpdateAction__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__UpdateAction__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateAction__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAction__Group__6"


    // $ANTLR start "rule__UpdateAction__Group__6__Impl"
    // InternalFeatureLangParser.g:2021:1: rule__UpdateAction__Group__6__Impl : ( ( rule__UpdateAction__PriorityAssignment_6 ) ) ;
    public final void rule__UpdateAction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2025:1: ( ( ( rule__UpdateAction__PriorityAssignment_6 ) ) )
            // InternalFeatureLangParser.g:2026:1: ( ( rule__UpdateAction__PriorityAssignment_6 ) )
            {
            // InternalFeatureLangParser.g:2026:1: ( ( rule__UpdateAction__PriorityAssignment_6 ) )
            // InternalFeatureLangParser.g:2027:2: ( rule__UpdateAction__PriorityAssignment_6 )
            {
             before(grammarAccess.getUpdateActionAccess().getPriorityAssignment_6()); 
            // InternalFeatureLangParser.g:2028:2: ( rule__UpdateAction__PriorityAssignment_6 )
            // InternalFeatureLangParser.g:2028:3: rule__UpdateAction__PriorityAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__UpdateAction__PriorityAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getUpdateActionAccess().getPriorityAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAction__Group__6__Impl"


    // $ANTLR start "rule__UpdateAction__Group__7"
    // InternalFeatureLangParser.g:2036:1: rule__UpdateAction__Group__7 : rule__UpdateAction__Group__7__Impl ;
    public final void rule__UpdateAction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2040:1: ( rule__UpdateAction__Group__7__Impl )
            // InternalFeatureLangParser.g:2041:2: rule__UpdateAction__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UpdateAction__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAction__Group__7"


    // $ANTLR start "rule__UpdateAction__Group__7__Impl"
    // InternalFeatureLangParser.g:2047:1: rule__UpdateAction__Group__7__Impl : ( ( rule__UpdateAction__Alternatives_7 ) ) ;
    public final void rule__UpdateAction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2051:1: ( ( ( rule__UpdateAction__Alternatives_7 ) ) )
            // InternalFeatureLangParser.g:2052:1: ( ( rule__UpdateAction__Alternatives_7 ) )
            {
            // InternalFeatureLangParser.g:2052:1: ( ( rule__UpdateAction__Alternatives_7 ) )
            // InternalFeatureLangParser.g:2053:2: ( rule__UpdateAction__Alternatives_7 )
            {
             before(grammarAccess.getUpdateActionAccess().getAlternatives_7()); 
            // InternalFeatureLangParser.g:2054:2: ( rule__UpdateAction__Alternatives_7 )
            // InternalFeatureLangParser.g:2054:3: rule__UpdateAction__Alternatives_7
            {
            pushFollow(FOLLOW_2);
            rule__UpdateAction__Alternatives_7();

            state._fsp--;


            }

             after(grammarAccess.getUpdateActionAccess().getAlternatives_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAction__Group__7__Impl"


    // $ANTLR start "rule__UpdateAttributeDatatype__Group__0"
    // InternalFeatureLangParser.g:2063:1: rule__UpdateAttributeDatatype__Group__0 : rule__UpdateAttributeDatatype__Group__0__Impl rule__UpdateAttributeDatatype__Group__1 ;
    public final void rule__UpdateAttributeDatatype__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2067:1: ( rule__UpdateAttributeDatatype__Group__0__Impl rule__UpdateAttributeDatatype__Group__1 )
            // InternalFeatureLangParser.g:2068:2: rule__UpdateAttributeDatatype__Group__0__Impl rule__UpdateAttributeDatatype__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__UpdateAttributeDatatype__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateAttributeDatatype__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAttributeDatatype__Group__0"


    // $ANTLR start "rule__UpdateAttributeDatatype__Group__0__Impl"
    // InternalFeatureLangParser.g:2075:1: rule__UpdateAttributeDatatype__Group__0__Impl : ( Be ) ;
    public final void rule__UpdateAttributeDatatype__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2079:1: ( ( Be ) )
            // InternalFeatureLangParser.g:2080:1: ( Be )
            {
            // InternalFeatureLangParser.g:2080:1: ( Be )
            // InternalFeatureLangParser.g:2081:2: Be
            {
             before(grammarAccess.getUpdateAttributeDatatypeAccess().getBeKeyword_0()); 
            match(input,Be,FOLLOW_2); 
             after(grammarAccess.getUpdateAttributeDatatypeAccess().getBeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAttributeDatatype__Group__0__Impl"


    // $ANTLR start "rule__UpdateAttributeDatatype__Group__1"
    // InternalFeatureLangParser.g:2090:1: rule__UpdateAttributeDatatype__Group__1 : rule__UpdateAttributeDatatype__Group__1__Impl rule__UpdateAttributeDatatype__Group__2 ;
    public final void rule__UpdateAttributeDatatype__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2094:1: ( rule__UpdateAttributeDatatype__Group__1__Impl rule__UpdateAttributeDatatype__Group__2 )
            // InternalFeatureLangParser.g:2095:2: rule__UpdateAttributeDatatype__Group__1__Impl rule__UpdateAttributeDatatype__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__UpdateAttributeDatatype__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateAttributeDatatype__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAttributeDatatype__Group__1"


    // $ANTLR start "rule__UpdateAttributeDatatype__Group__1__Impl"
    // InternalFeatureLangParser.g:2102:1: rule__UpdateAttributeDatatype__Group__1__Impl : ( A ) ;
    public final void rule__UpdateAttributeDatatype__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2106:1: ( ( A ) )
            // InternalFeatureLangParser.g:2107:1: ( A )
            {
            // InternalFeatureLangParser.g:2107:1: ( A )
            // InternalFeatureLangParser.g:2108:2: A
            {
             before(grammarAccess.getUpdateAttributeDatatypeAccess().getAKeyword_1()); 
            match(input,A,FOLLOW_2); 
             after(grammarAccess.getUpdateAttributeDatatypeAccess().getAKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAttributeDatatype__Group__1__Impl"


    // $ANTLR start "rule__UpdateAttributeDatatype__Group__2"
    // InternalFeatureLangParser.g:2117:1: rule__UpdateAttributeDatatype__Group__2 : rule__UpdateAttributeDatatype__Group__2__Impl ;
    public final void rule__UpdateAttributeDatatype__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2121:1: ( rule__UpdateAttributeDatatype__Group__2__Impl )
            // InternalFeatureLangParser.g:2122:2: rule__UpdateAttributeDatatype__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UpdateAttributeDatatype__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAttributeDatatype__Group__2"


    // $ANTLR start "rule__UpdateAttributeDatatype__Group__2__Impl"
    // InternalFeatureLangParser.g:2128:1: rule__UpdateAttributeDatatype__Group__2__Impl : ( ( rule__UpdateAttributeDatatype__TypeAssignment_2 ) ) ;
    public final void rule__UpdateAttributeDatatype__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2132:1: ( ( ( rule__UpdateAttributeDatatype__TypeAssignment_2 ) ) )
            // InternalFeatureLangParser.g:2133:1: ( ( rule__UpdateAttributeDatatype__TypeAssignment_2 ) )
            {
            // InternalFeatureLangParser.g:2133:1: ( ( rule__UpdateAttributeDatatype__TypeAssignment_2 ) )
            // InternalFeatureLangParser.g:2134:2: ( rule__UpdateAttributeDatatype__TypeAssignment_2 )
            {
             before(grammarAccess.getUpdateAttributeDatatypeAccess().getTypeAssignment_2()); 
            // InternalFeatureLangParser.g:2135:2: ( rule__UpdateAttributeDatatype__TypeAssignment_2 )
            // InternalFeatureLangParser.g:2135:3: rule__UpdateAttributeDatatype__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__UpdateAttributeDatatype__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUpdateAttributeDatatypeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAttributeDatatype__Group__2__Impl"


    // $ANTLR start "rule__UpdateAttributeIdentifier__Group__0"
    // InternalFeatureLangParser.g:2144:1: rule__UpdateAttributeIdentifier__Group__0 : rule__UpdateAttributeIdentifier__Group__0__Impl rule__UpdateAttributeIdentifier__Group__1 ;
    public final void rule__UpdateAttributeIdentifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2148:1: ( rule__UpdateAttributeIdentifier__Group__0__Impl rule__UpdateAttributeIdentifier__Group__1 )
            // InternalFeatureLangParser.g:2149:2: rule__UpdateAttributeIdentifier__Group__0__Impl rule__UpdateAttributeIdentifier__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__UpdateAttributeIdentifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateAttributeIdentifier__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAttributeIdentifier__Group__0"


    // $ANTLR start "rule__UpdateAttributeIdentifier__Group__0__Impl"
    // InternalFeatureLangParser.g:2156:1: rule__UpdateAttributeIdentifier__Group__0__Impl : ( Have ) ;
    public final void rule__UpdateAttributeIdentifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2160:1: ( ( Have ) )
            // InternalFeatureLangParser.g:2161:1: ( Have )
            {
            // InternalFeatureLangParser.g:2161:1: ( Have )
            // InternalFeatureLangParser.g:2162:2: Have
            {
             before(grammarAccess.getUpdateAttributeIdentifierAccess().getHaveKeyword_0()); 
            match(input,Have,FOLLOW_2); 
             after(grammarAccess.getUpdateAttributeIdentifierAccess().getHaveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAttributeIdentifier__Group__0__Impl"


    // $ANTLR start "rule__UpdateAttributeIdentifier__Group__1"
    // InternalFeatureLangParser.g:2171:1: rule__UpdateAttributeIdentifier__Group__1 : rule__UpdateAttributeIdentifier__Group__1__Impl rule__UpdateAttributeIdentifier__Group__2 ;
    public final void rule__UpdateAttributeIdentifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2175:1: ( rule__UpdateAttributeIdentifier__Group__1__Impl rule__UpdateAttributeIdentifier__Group__2 )
            // InternalFeatureLangParser.g:2176:2: rule__UpdateAttributeIdentifier__Group__1__Impl rule__UpdateAttributeIdentifier__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__UpdateAttributeIdentifier__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateAttributeIdentifier__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAttributeIdentifier__Group__1"


    // $ANTLR start "rule__UpdateAttributeIdentifier__Group__1__Impl"
    // InternalFeatureLangParser.g:2183:1: rule__UpdateAttributeIdentifier__Group__1__Impl : ( ( rule__UpdateAttributeIdentifier__Alternatives_1 )? ) ;
    public final void rule__UpdateAttributeIdentifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2187:1: ( ( ( rule__UpdateAttributeIdentifier__Alternatives_1 )? ) )
            // InternalFeatureLangParser.g:2188:1: ( ( rule__UpdateAttributeIdentifier__Alternatives_1 )? )
            {
            // InternalFeatureLangParser.g:2188:1: ( ( rule__UpdateAttributeIdentifier__Alternatives_1 )? )
            // InternalFeatureLangParser.g:2189:2: ( rule__UpdateAttributeIdentifier__Alternatives_1 )?
            {
             before(grammarAccess.getUpdateAttributeIdentifierAccess().getAlternatives_1()); 
            // InternalFeatureLangParser.g:2190:2: ( rule__UpdateAttributeIdentifier__Alternatives_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==An||LA26_0==A) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalFeatureLangParser.g:2190:3: rule__UpdateAttributeIdentifier__Alternatives_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__UpdateAttributeIdentifier__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUpdateAttributeIdentifierAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAttributeIdentifier__Group__1__Impl"


    // $ANTLR start "rule__UpdateAttributeIdentifier__Group__2"
    // InternalFeatureLangParser.g:2198:1: rule__UpdateAttributeIdentifier__Group__2 : rule__UpdateAttributeIdentifier__Group__2__Impl ;
    public final void rule__UpdateAttributeIdentifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2202:1: ( rule__UpdateAttributeIdentifier__Group__2__Impl )
            // InternalFeatureLangParser.g:2203:2: rule__UpdateAttributeIdentifier__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UpdateAttributeIdentifier__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAttributeIdentifier__Group__2"


    // $ANTLR start "rule__UpdateAttributeIdentifier__Group__2__Impl"
    // InternalFeatureLangParser.g:2209:1: rule__UpdateAttributeIdentifier__Group__2__Impl : ( ( rule__UpdateAttributeIdentifier__IdentifierAssignment_2 ) ) ;
    public final void rule__UpdateAttributeIdentifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2213:1: ( ( ( rule__UpdateAttributeIdentifier__IdentifierAssignment_2 ) ) )
            // InternalFeatureLangParser.g:2214:1: ( ( rule__UpdateAttributeIdentifier__IdentifierAssignment_2 ) )
            {
            // InternalFeatureLangParser.g:2214:1: ( ( rule__UpdateAttributeIdentifier__IdentifierAssignment_2 ) )
            // InternalFeatureLangParser.g:2215:2: ( rule__UpdateAttributeIdentifier__IdentifierAssignment_2 )
            {
             before(grammarAccess.getUpdateAttributeIdentifierAccess().getIdentifierAssignment_2()); 
            // InternalFeatureLangParser.g:2216:2: ( rule__UpdateAttributeIdentifier__IdentifierAssignment_2 )
            // InternalFeatureLangParser.g:2216:3: rule__UpdateAttributeIdentifier__IdentifierAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__UpdateAttributeIdentifier__IdentifierAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUpdateAttributeIdentifierAccess().getIdentifierAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAttributeIdentifier__Group__2__Impl"


    // $ANTLR start "rule__UpdateAttributeValue__Group__0"
    // InternalFeatureLangParser.g:2225:1: rule__UpdateAttributeValue__Group__0 : rule__UpdateAttributeValue__Group__0__Impl rule__UpdateAttributeValue__Group__1 ;
    public final void rule__UpdateAttributeValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2229:1: ( rule__UpdateAttributeValue__Group__0__Impl rule__UpdateAttributeValue__Group__1 )
            // InternalFeatureLangParser.g:2230:2: rule__UpdateAttributeValue__Group__0__Impl rule__UpdateAttributeValue__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__UpdateAttributeValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateAttributeValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAttributeValue__Group__0"


    // $ANTLR start "rule__UpdateAttributeValue__Group__0__Impl"
    // InternalFeatureLangParser.g:2237:1: rule__UpdateAttributeValue__Group__0__Impl : ( Have ) ;
    public final void rule__UpdateAttributeValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2241:1: ( ( Have ) )
            // InternalFeatureLangParser.g:2242:1: ( Have )
            {
            // InternalFeatureLangParser.g:2242:1: ( Have )
            // InternalFeatureLangParser.g:2243:2: Have
            {
             before(grammarAccess.getUpdateAttributeValueAccess().getHaveKeyword_0()); 
            match(input,Have,FOLLOW_2); 
             after(grammarAccess.getUpdateAttributeValueAccess().getHaveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAttributeValue__Group__0__Impl"


    // $ANTLR start "rule__UpdateAttributeValue__Group__1"
    // InternalFeatureLangParser.g:2252:1: rule__UpdateAttributeValue__Group__1 : rule__UpdateAttributeValue__Group__1__Impl rule__UpdateAttributeValue__Group__2 ;
    public final void rule__UpdateAttributeValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2256:1: ( rule__UpdateAttributeValue__Group__1__Impl rule__UpdateAttributeValue__Group__2 )
            // InternalFeatureLangParser.g:2257:2: rule__UpdateAttributeValue__Group__1__Impl rule__UpdateAttributeValue__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__UpdateAttributeValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateAttributeValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAttributeValue__Group__1"


    // $ANTLR start "rule__UpdateAttributeValue__Group__1__Impl"
    // InternalFeatureLangParser.g:2264:1: rule__UpdateAttributeValue__Group__1__Impl : ( ( A )? ) ;
    public final void rule__UpdateAttributeValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2268:1: ( ( ( A )? ) )
            // InternalFeatureLangParser.g:2269:1: ( ( A )? )
            {
            // InternalFeatureLangParser.g:2269:1: ( ( A )? )
            // InternalFeatureLangParser.g:2270:2: ( A )?
            {
             before(grammarAccess.getUpdateAttributeValueAccess().getAKeyword_1()); 
            // InternalFeatureLangParser.g:2271:2: ( A )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==A) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalFeatureLangParser.g:2271:3: A
                    {
                    match(input,A,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getUpdateAttributeValueAccess().getAKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAttributeValue__Group__1__Impl"


    // $ANTLR start "rule__UpdateAttributeValue__Group__2"
    // InternalFeatureLangParser.g:2279:1: rule__UpdateAttributeValue__Group__2 : rule__UpdateAttributeValue__Group__2__Impl rule__UpdateAttributeValue__Group__3 ;
    public final void rule__UpdateAttributeValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2283:1: ( rule__UpdateAttributeValue__Group__2__Impl rule__UpdateAttributeValue__Group__3 )
            // InternalFeatureLangParser.g:2284:2: rule__UpdateAttributeValue__Group__2__Impl rule__UpdateAttributeValue__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__UpdateAttributeValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateAttributeValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAttributeValue__Group__2"


    // $ANTLR start "rule__UpdateAttributeValue__Group__2__Impl"
    // InternalFeatureLangParser.g:2291:1: rule__UpdateAttributeValue__Group__2__Impl : ( Value ) ;
    public final void rule__UpdateAttributeValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2295:1: ( ( Value ) )
            // InternalFeatureLangParser.g:2296:1: ( Value )
            {
            // InternalFeatureLangParser.g:2296:1: ( Value )
            // InternalFeatureLangParser.g:2297:2: Value
            {
             before(grammarAccess.getUpdateAttributeValueAccess().getValueKeyword_2()); 
            match(input,Value,FOLLOW_2); 
             after(grammarAccess.getUpdateAttributeValueAccess().getValueKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAttributeValue__Group__2__Impl"


    // $ANTLR start "rule__UpdateAttributeValue__Group__3"
    // InternalFeatureLangParser.g:2306:1: rule__UpdateAttributeValue__Group__3 : rule__UpdateAttributeValue__Group__3__Impl ;
    public final void rule__UpdateAttributeValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2310:1: ( rule__UpdateAttributeValue__Group__3__Impl )
            // InternalFeatureLangParser.g:2311:2: rule__UpdateAttributeValue__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UpdateAttributeValue__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAttributeValue__Group__3"


    // $ANTLR start "rule__UpdateAttributeValue__Group__3__Impl"
    // InternalFeatureLangParser.g:2317:1: rule__UpdateAttributeValue__Group__3__Impl : ( ( rule__UpdateAttributeValue__ValueAssignment_3 ) ) ;
    public final void rule__UpdateAttributeValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2321:1: ( ( ( rule__UpdateAttributeValue__ValueAssignment_3 ) ) )
            // InternalFeatureLangParser.g:2322:1: ( ( rule__UpdateAttributeValue__ValueAssignment_3 ) )
            {
            // InternalFeatureLangParser.g:2322:1: ( ( rule__UpdateAttributeValue__ValueAssignment_3 ) )
            // InternalFeatureLangParser.g:2323:2: ( rule__UpdateAttributeValue__ValueAssignment_3 )
            {
             before(grammarAccess.getUpdateAttributeValueAccess().getValueAssignment_3()); 
            // InternalFeatureLangParser.g:2324:2: ( rule__UpdateAttributeValue__ValueAssignment_3 )
            // InternalFeatureLangParser.g:2324:3: rule__UpdateAttributeValue__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__UpdateAttributeValue__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUpdateAttributeValueAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAttributeValue__Group__3__Impl"


    // $ANTLR start "rule__AttributeAction__Group__0"
    // InternalFeatureLangParser.g:2333:1: rule__AttributeAction__Group__0 : rule__AttributeAction__Group__0__Impl rule__AttributeAction__Group__1 ;
    public final void rule__AttributeAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2337:1: ( rule__AttributeAction__Group__0__Impl rule__AttributeAction__Group__1 )
            // InternalFeatureLangParser.g:2338:2: rule__AttributeAction__Group__0__Impl rule__AttributeAction__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__AttributeAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAction__Group__0"


    // $ANTLR start "rule__AttributeAction__Group__0__Impl"
    // InternalFeatureLangParser.g:2345:1: rule__AttributeAction__Group__0__Impl : ( Have ) ;
    public final void rule__AttributeAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2349:1: ( ( Have ) )
            // InternalFeatureLangParser.g:2350:1: ( Have )
            {
            // InternalFeatureLangParser.g:2350:1: ( Have )
            // InternalFeatureLangParser.g:2351:2: Have
            {
             before(grammarAccess.getAttributeActionAccess().getHaveKeyword_0()); 
            match(input,Have,FOLLOW_2); 
             after(grammarAccess.getAttributeActionAccess().getHaveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAction__Group__0__Impl"


    // $ANTLR start "rule__AttributeAction__Group__1"
    // InternalFeatureLangParser.g:2360:1: rule__AttributeAction__Group__1 : rule__AttributeAction__Group__1__Impl rule__AttributeAction__Group__2 ;
    public final void rule__AttributeAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2364:1: ( rule__AttributeAction__Group__1__Impl rule__AttributeAction__Group__2 )
            // InternalFeatureLangParser.g:2365:2: rule__AttributeAction__Group__1__Impl rule__AttributeAction__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__AttributeAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeAction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAction__Group__1"


    // $ANTLR start "rule__AttributeAction__Group__1__Impl"
    // InternalFeatureLangParser.g:2372:1: rule__AttributeAction__Group__1__Impl : ( ( rule__AttributeAction__Alternatives_1 ) ) ;
    public final void rule__AttributeAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2376:1: ( ( ( rule__AttributeAction__Alternatives_1 ) ) )
            // InternalFeatureLangParser.g:2377:1: ( ( rule__AttributeAction__Alternatives_1 ) )
            {
            // InternalFeatureLangParser.g:2377:1: ( ( rule__AttributeAction__Alternatives_1 ) )
            // InternalFeatureLangParser.g:2378:2: ( rule__AttributeAction__Alternatives_1 )
            {
             before(grammarAccess.getAttributeActionAccess().getAlternatives_1()); 
            // InternalFeatureLangParser.g:2379:2: ( rule__AttributeAction__Alternatives_1 )
            // InternalFeatureLangParser.g:2379:3: rule__AttributeAction__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeAction__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeActionAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAction__Group__1__Impl"


    // $ANTLR start "rule__AttributeAction__Group__2"
    // InternalFeatureLangParser.g:2387:1: rule__AttributeAction__Group__2 : rule__AttributeAction__Group__2__Impl rule__AttributeAction__Group__3 ;
    public final void rule__AttributeAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2391:1: ( rule__AttributeAction__Group__2__Impl rule__AttributeAction__Group__3 )
            // InternalFeatureLangParser.g:2392:2: rule__AttributeAction__Group__2__Impl rule__AttributeAction__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__AttributeAction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeAction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAction__Group__2"


    // $ANTLR start "rule__AttributeAction__Group__2__Impl"
    // InternalFeatureLangParser.g:2399:1: rule__AttributeAction__Group__2__Impl : ( ( rule__AttributeAction__AttributeAssignment_2 ) ) ;
    public final void rule__AttributeAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2403:1: ( ( ( rule__AttributeAction__AttributeAssignment_2 ) ) )
            // InternalFeatureLangParser.g:2404:1: ( ( rule__AttributeAction__AttributeAssignment_2 ) )
            {
            // InternalFeatureLangParser.g:2404:1: ( ( rule__AttributeAction__AttributeAssignment_2 ) )
            // InternalFeatureLangParser.g:2405:2: ( rule__AttributeAction__AttributeAssignment_2 )
            {
             before(grammarAccess.getAttributeActionAccess().getAttributeAssignment_2()); 
            // InternalFeatureLangParser.g:2406:2: ( rule__AttributeAction__AttributeAssignment_2 )
            // InternalFeatureLangParser.g:2406:3: rule__AttributeAction__AttributeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AttributeAction__AttributeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeActionAccess().getAttributeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAction__Group__2__Impl"


    // $ANTLR start "rule__AttributeAction__Group__3"
    // InternalFeatureLangParser.g:2414:1: rule__AttributeAction__Group__3 : rule__AttributeAction__Group__3__Impl ;
    public final void rule__AttributeAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2418:1: ( rule__AttributeAction__Group__3__Impl )
            // InternalFeatureLangParser.g:2419:2: rule__AttributeAction__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeAction__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAction__Group__3"


    // $ANTLR start "rule__AttributeAction__Group__3__Impl"
    // InternalFeatureLangParser.g:2425:1: rule__AttributeAction__Group__3__Impl : ( ( rule__AttributeAction__Group_3__0 )? ) ;
    public final void rule__AttributeAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2429:1: ( ( ( rule__AttributeAction__Group_3__0 )? ) )
            // InternalFeatureLangParser.g:2430:1: ( ( rule__AttributeAction__Group_3__0 )? )
            {
            // InternalFeatureLangParser.g:2430:1: ( ( rule__AttributeAction__Group_3__0 )? )
            // InternalFeatureLangParser.g:2431:2: ( rule__AttributeAction__Group_3__0 )?
            {
             before(grammarAccess.getAttributeActionAccess().getGroup_3()); 
            // InternalFeatureLangParser.g:2432:2: ( rule__AttributeAction__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==FullStop) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==It) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // InternalFeatureLangParser.g:2432:3: rule__AttributeAction__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeAction__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeActionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAction__Group__3__Impl"


    // $ANTLR start "rule__AttributeAction__Group_3__0"
    // InternalFeatureLangParser.g:2441:1: rule__AttributeAction__Group_3__0 : rule__AttributeAction__Group_3__0__Impl rule__AttributeAction__Group_3__1 ;
    public final void rule__AttributeAction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2445:1: ( rule__AttributeAction__Group_3__0__Impl rule__AttributeAction__Group_3__1 )
            // InternalFeatureLangParser.g:2446:2: rule__AttributeAction__Group_3__0__Impl rule__AttributeAction__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__AttributeAction__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeAction__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAction__Group_3__0"


    // $ANTLR start "rule__AttributeAction__Group_3__0__Impl"
    // InternalFeatureLangParser.g:2453:1: rule__AttributeAction__Group_3__0__Impl : ( FullStop ) ;
    public final void rule__AttributeAction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2457:1: ( ( FullStop ) )
            // InternalFeatureLangParser.g:2458:1: ( FullStop )
            {
            // InternalFeatureLangParser.g:2458:1: ( FullStop )
            // InternalFeatureLangParser.g:2459:2: FullStop
            {
             before(grammarAccess.getAttributeActionAccess().getFullStopKeyword_3_0()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getAttributeActionAccess().getFullStopKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAction__Group_3__0__Impl"


    // $ANTLR start "rule__AttributeAction__Group_3__1"
    // InternalFeatureLangParser.g:2468:1: rule__AttributeAction__Group_3__1 : rule__AttributeAction__Group_3__1__Impl rule__AttributeAction__Group_3__2 ;
    public final void rule__AttributeAction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2472:1: ( rule__AttributeAction__Group_3__1__Impl rule__AttributeAction__Group_3__2 )
            // InternalFeatureLangParser.g:2473:2: rule__AttributeAction__Group_3__1__Impl rule__AttributeAction__Group_3__2
            {
            pushFollow(FOLLOW_19);
            rule__AttributeAction__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeAction__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAction__Group_3__1"


    // $ANTLR start "rule__AttributeAction__Group_3__1__Impl"
    // InternalFeatureLangParser.g:2480:1: rule__AttributeAction__Group_3__1__Impl : ( It ) ;
    public final void rule__AttributeAction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2484:1: ( ( It ) )
            // InternalFeatureLangParser.g:2485:1: ( It )
            {
            // InternalFeatureLangParser.g:2485:1: ( It )
            // InternalFeatureLangParser.g:2486:2: It
            {
             before(grammarAccess.getAttributeActionAccess().getItKeyword_3_1()); 
            match(input,It,FOLLOW_2); 
             after(grammarAccess.getAttributeActionAccess().getItKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAction__Group_3__1__Impl"


    // $ANTLR start "rule__AttributeAction__Group_3__2"
    // InternalFeatureLangParser.g:2495:1: rule__AttributeAction__Group_3__2 : rule__AttributeAction__Group_3__2__Impl rule__AttributeAction__Group_3__3 ;
    public final void rule__AttributeAction__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2499:1: ( rule__AttributeAction__Group_3__2__Impl rule__AttributeAction__Group_3__3 )
            // InternalFeatureLangParser.g:2500:2: rule__AttributeAction__Group_3__2__Impl rule__AttributeAction__Group_3__3
            {
            pushFollow(FOLLOW_14);
            rule__AttributeAction__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeAction__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAction__Group_3__2"


    // $ANTLR start "rule__AttributeAction__Group_3__2__Impl"
    // InternalFeatureLangParser.g:2507:1: rule__AttributeAction__Group_3__2__Impl : ( Is ) ;
    public final void rule__AttributeAction__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2511:1: ( ( Is ) )
            // InternalFeatureLangParser.g:2512:1: ( Is )
            {
            // InternalFeatureLangParser.g:2512:1: ( Is )
            // InternalFeatureLangParser.g:2513:2: Is
            {
             before(grammarAccess.getAttributeActionAccess().getIsKeyword_3_2()); 
            match(input,Is,FOLLOW_2); 
             after(grammarAccess.getAttributeActionAccess().getIsKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAction__Group_3__2__Impl"


    // $ANTLR start "rule__AttributeAction__Group_3__3"
    // InternalFeatureLangParser.g:2522:1: rule__AttributeAction__Group_3__3 : rule__AttributeAction__Group_3__3__Impl rule__AttributeAction__Group_3__4 ;
    public final void rule__AttributeAction__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2526:1: ( rule__AttributeAction__Group_3__3__Impl rule__AttributeAction__Group_3__4 )
            // InternalFeatureLangParser.g:2527:2: rule__AttributeAction__Group_3__3__Impl rule__AttributeAction__Group_3__4
            {
            pushFollow(FOLLOW_15);
            rule__AttributeAction__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeAction__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAction__Group_3__3"


    // $ANTLR start "rule__AttributeAction__Group_3__3__Impl"
    // InternalFeatureLangParser.g:2534:1: rule__AttributeAction__Group_3__3__Impl : ( A ) ;
    public final void rule__AttributeAction__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2538:1: ( ( A ) )
            // InternalFeatureLangParser.g:2539:1: ( A )
            {
            // InternalFeatureLangParser.g:2539:1: ( A )
            // InternalFeatureLangParser.g:2540:2: A
            {
             before(grammarAccess.getAttributeActionAccess().getAKeyword_3_3()); 
            match(input,A,FOLLOW_2); 
             after(grammarAccess.getAttributeActionAccess().getAKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAction__Group_3__3__Impl"


    // $ANTLR start "rule__AttributeAction__Group_3__4"
    // InternalFeatureLangParser.g:2549:1: rule__AttributeAction__Group_3__4 : rule__AttributeAction__Group_3__4__Impl ;
    public final void rule__AttributeAction__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2553:1: ( rule__AttributeAction__Group_3__4__Impl )
            // InternalFeatureLangParser.g:2554:2: rule__AttributeAction__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeAction__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAction__Group_3__4"


    // $ANTLR start "rule__AttributeAction__Group_3__4__Impl"
    // InternalFeatureLangParser.g:2560:1: rule__AttributeAction__Group_3__4__Impl : ( ( rule__AttributeAction__TypeAssignment_3_4 ) ) ;
    public final void rule__AttributeAction__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2564:1: ( ( ( rule__AttributeAction__TypeAssignment_3_4 ) ) )
            // InternalFeatureLangParser.g:2565:1: ( ( rule__AttributeAction__TypeAssignment_3_4 ) )
            {
            // InternalFeatureLangParser.g:2565:1: ( ( rule__AttributeAction__TypeAssignment_3_4 ) )
            // InternalFeatureLangParser.g:2566:2: ( rule__AttributeAction__TypeAssignment_3_4 )
            {
             before(grammarAccess.getAttributeActionAccess().getTypeAssignment_3_4()); 
            // InternalFeatureLangParser.g:2567:2: ( rule__AttributeAction__TypeAssignment_3_4 )
            // InternalFeatureLangParser.g:2567:3: rule__AttributeAction__TypeAssignment_3_4
            {
            pushFollow(FOLLOW_2);
            rule__AttributeAction__TypeAssignment_3_4();

            state._fsp--;


            }

             after(grammarAccess.getAttributeActionAccess().getTypeAssignment_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAction__Group_3__4__Impl"


    // $ANTLR start "rule__AssociationAction__Group__0"
    // InternalFeatureLangParser.g:2576:1: rule__AssociationAction__Group__0 : rule__AssociationAction__Group__0__Impl rule__AssociationAction__Group__1 ;
    public final void rule__AssociationAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2580:1: ( rule__AssociationAction__Group__0__Impl rule__AssociationAction__Group__1 )
            // InternalFeatureLangParser.g:2581:2: rule__AssociationAction__Group__0__Impl rule__AssociationAction__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__AssociationAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationAction__Group__0"


    // $ANTLR start "rule__AssociationAction__Group__0__Impl"
    // InternalFeatureLangParser.g:2588:1: rule__AssociationAction__Group__0__Impl : ( Have ) ;
    public final void rule__AssociationAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2592:1: ( ( Have ) )
            // InternalFeatureLangParser.g:2593:1: ( Have )
            {
            // InternalFeatureLangParser.g:2593:1: ( Have )
            // InternalFeatureLangParser.g:2594:2: Have
            {
             before(grammarAccess.getAssociationActionAccess().getHaveKeyword_0()); 
            match(input,Have,FOLLOW_2); 
             after(grammarAccess.getAssociationActionAccess().getHaveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationAction__Group__0__Impl"


    // $ANTLR start "rule__AssociationAction__Group__1"
    // InternalFeatureLangParser.g:2603:1: rule__AssociationAction__Group__1 : rule__AssociationAction__Group__1__Impl rule__AssociationAction__Group__2 ;
    public final void rule__AssociationAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2607:1: ( rule__AssociationAction__Group__1__Impl rule__AssociationAction__Group__2 )
            // InternalFeatureLangParser.g:2608:2: rule__AssociationAction__Group__1__Impl rule__AssociationAction__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__AssociationAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationAction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationAction__Group__1"


    // $ANTLR start "rule__AssociationAction__Group__1__Impl"
    // InternalFeatureLangParser.g:2615:1: rule__AssociationAction__Group__1__Impl : ( ( rule__AssociationAction__Alternatives_1 ) ) ;
    public final void rule__AssociationAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2619:1: ( ( ( rule__AssociationAction__Alternatives_1 ) ) )
            // InternalFeatureLangParser.g:2620:1: ( ( rule__AssociationAction__Alternatives_1 ) )
            {
            // InternalFeatureLangParser.g:2620:1: ( ( rule__AssociationAction__Alternatives_1 ) )
            // InternalFeatureLangParser.g:2621:2: ( rule__AssociationAction__Alternatives_1 )
            {
             before(grammarAccess.getAssociationActionAccess().getAlternatives_1()); 
            // InternalFeatureLangParser.g:2622:2: ( rule__AssociationAction__Alternatives_1 )
            // InternalFeatureLangParser.g:2622:3: rule__AssociationAction__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__AssociationAction__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationActionAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationAction__Group__1__Impl"


    // $ANTLR start "rule__AssociationAction__Group__2"
    // InternalFeatureLangParser.g:2630:1: rule__AssociationAction__Group__2 : rule__AssociationAction__Group__2__Impl ;
    public final void rule__AssociationAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2634:1: ( rule__AssociationAction__Group__2__Impl )
            // InternalFeatureLangParser.g:2635:2: rule__AssociationAction__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociationAction__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationAction__Group__2"


    // $ANTLR start "rule__AssociationAction__Group__2__Impl"
    // InternalFeatureLangParser.g:2641:1: rule__AssociationAction__Group__2__Impl : ( ( rule__AssociationAction__Alternatives_2 ) ) ;
    public final void rule__AssociationAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2645:1: ( ( ( rule__AssociationAction__Alternatives_2 ) ) )
            // InternalFeatureLangParser.g:2646:1: ( ( rule__AssociationAction__Alternatives_2 ) )
            {
            // InternalFeatureLangParser.g:2646:1: ( ( rule__AssociationAction__Alternatives_2 ) )
            // InternalFeatureLangParser.g:2647:2: ( rule__AssociationAction__Alternatives_2 )
            {
             before(grammarAccess.getAssociationActionAccess().getAlternatives_2()); 
            // InternalFeatureLangParser.g:2648:2: ( rule__AssociationAction__Alternatives_2 )
            // InternalFeatureLangParser.g:2648:3: rule__AssociationAction__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__AssociationAction__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getAssociationActionAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationAction__Group__2__Impl"


    // $ANTLR start "rule__AssociationAction__Group_2_1__0"
    // InternalFeatureLangParser.g:2657:1: rule__AssociationAction__Group_2_1__0 : rule__AssociationAction__Group_2_1__0__Impl rule__AssociationAction__Group_2_1__1 ;
    public final void rule__AssociationAction__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2661:1: ( rule__AssociationAction__Group_2_1__0__Impl rule__AssociationAction__Group_2_1__1 )
            // InternalFeatureLangParser.g:2662:2: rule__AssociationAction__Group_2_1__0__Impl rule__AssociationAction__Group_2_1__1
            {
            pushFollow(FOLLOW_22);
            rule__AssociationAction__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationAction__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationAction__Group_2_1__0"


    // $ANTLR start "rule__AssociationAction__Group_2_1__0__Impl"
    // InternalFeatureLangParser.g:2669:1: rule__AssociationAction__Group_2_1__0__Impl : ( ( rule__AssociationAction__NameAssignment_2_1_0 ) ) ;
    public final void rule__AssociationAction__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2673:1: ( ( ( rule__AssociationAction__NameAssignment_2_1_0 ) ) )
            // InternalFeatureLangParser.g:2674:1: ( ( rule__AssociationAction__NameAssignment_2_1_0 ) )
            {
            // InternalFeatureLangParser.g:2674:1: ( ( rule__AssociationAction__NameAssignment_2_1_0 ) )
            // InternalFeatureLangParser.g:2675:2: ( rule__AssociationAction__NameAssignment_2_1_0 )
            {
             before(grammarAccess.getAssociationActionAccess().getNameAssignment_2_1_0()); 
            // InternalFeatureLangParser.g:2676:2: ( rule__AssociationAction__NameAssignment_2_1_0 )
            // InternalFeatureLangParser.g:2676:3: rule__AssociationAction__NameAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__AssociationAction__NameAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationActionAccess().getNameAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationAction__Group_2_1__0__Impl"


    // $ANTLR start "rule__AssociationAction__Group_2_1__1"
    // InternalFeatureLangParser.g:2684:1: rule__AssociationAction__Group_2_1__1 : rule__AssociationAction__Group_2_1__1__Impl ;
    public final void rule__AssociationAction__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2688:1: ( rule__AssociationAction__Group_2_1__1__Impl )
            // InternalFeatureLangParser.g:2689:2: rule__AssociationAction__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociationAction__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationAction__Group_2_1__1"


    // $ANTLR start "rule__AssociationAction__Group_2_1__1__Impl"
    // InternalFeatureLangParser.g:2695:1: rule__AssociationAction__Group_2_1__1__Impl : ( ( rule__AssociationAction__EditAssignment_2_1_1 ) ) ;
    public final void rule__AssociationAction__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2699:1: ( ( ( rule__AssociationAction__EditAssignment_2_1_1 ) ) )
            // InternalFeatureLangParser.g:2700:1: ( ( rule__AssociationAction__EditAssignment_2_1_1 ) )
            {
            // InternalFeatureLangParser.g:2700:1: ( ( rule__AssociationAction__EditAssignment_2_1_1 ) )
            // InternalFeatureLangParser.g:2701:2: ( rule__AssociationAction__EditAssignment_2_1_1 )
            {
             before(grammarAccess.getAssociationActionAccess().getEditAssignment_2_1_1()); 
            // InternalFeatureLangParser.g:2702:2: ( rule__AssociationAction__EditAssignment_2_1_1 )
            // InternalFeatureLangParser.g:2702:3: rule__AssociationAction__EditAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AssociationAction__EditAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationActionAccess().getEditAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationAction__Group_2_1__1__Impl"


    // $ANTLR start "rule__CreateAssociation__Group__0"
    // InternalFeatureLangParser.g:2711:1: rule__CreateAssociation__Group__0 : rule__CreateAssociation__Group__0__Impl rule__CreateAssociation__Group__1 ;
    public final void rule__CreateAssociation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2715:1: ( rule__CreateAssociation__Group__0__Impl rule__CreateAssociation__Group__1 )
            // InternalFeatureLangParser.g:2716:2: rule__CreateAssociation__Group__0__Impl rule__CreateAssociation__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__CreateAssociation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateAssociation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateAssociation__Group__0"


    // $ANTLR start "rule__CreateAssociation__Group__0__Impl"
    // InternalFeatureLangParser.g:2723:1: rule__CreateAssociation__Group__0__Impl : ( To ) ;
    public final void rule__CreateAssociation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2727:1: ( ( To ) )
            // InternalFeatureLangParser.g:2728:1: ( To )
            {
            // InternalFeatureLangParser.g:2728:1: ( To )
            // InternalFeatureLangParser.g:2729:2: To
            {
             before(grammarAccess.getCreateAssociationAccess().getToKeyword_0()); 
            match(input,To,FOLLOW_2); 
             after(grammarAccess.getCreateAssociationAccess().getToKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateAssociation__Group__0__Impl"


    // $ANTLR start "rule__CreateAssociation__Group__1"
    // InternalFeatureLangParser.g:2738:1: rule__CreateAssociation__Group__1 : rule__CreateAssociation__Group__1__Impl rule__CreateAssociation__Group__2 ;
    public final void rule__CreateAssociation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2742:1: ( rule__CreateAssociation__Group__1__Impl rule__CreateAssociation__Group__2 )
            // InternalFeatureLangParser.g:2743:2: rule__CreateAssociation__Group__1__Impl rule__CreateAssociation__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__CreateAssociation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateAssociation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateAssociation__Group__1"


    // $ANTLR start "rule__CreateAssociation__Group__1__Impl"
    // InternalFeatureLangParser.g:2750:1: rule__CreateAssociation__Group__1__Impl : ( ( Other )? ) ;
    public final void rule__CreateAssociation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2754:1: ( ( ( Other )? ) )
            // InternalFeatureLangParser.g:2755:1: ( ( Other )? )
            {
            // InternalFeatureLangParser.g:2755:1: ( ( Other )? )
            // InternalFeatureLangParser.g:2756:2: ( Other )?
            {
             before(grammarAccess.getCreateAssociationAccess().getOtherKeyword_1()); 
            // InternalFeatureLangParser.g:2757:2: ( Other )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Other) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalFeatureLangParser.g:2757:3: Other
                    {
                    match(input,Other,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getCreateAssociationAccess().getOtherKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateAssociation__Group__1__Impl"


    // $ANTLR start "rule__CreateAssociation__Group__2"
    // InternalFeatureLangParser.g:2765:1: rule__CreateAssociation__Group__2 : rule__CreateAssociation__Group__2__Impl rule__CreateAssociation__Group__3 ;
    public final void rule__CreateAssociation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2769:1: ( rule__CreateAssociation__Group__2__Impl rule__CreateAssociation__Group__3 )
            // InternalFeatureLangParser.g:2770:2: rule__CreateAssociation__Group__2__Impl rule__CreateAssociation__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__CreateAssociation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateAssociation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateAssociation__Group__2"


    // $ANTLR start "rule__CreateAssociation__Group__2__Impl"
    // InternalFeatureLangParser.g:2777:1: rule__CreateAssociation__Group__2__Impl : ( ( rule__CreateAssociation__TargetAssignment_2 ) ) ;
    public final void rule__CreateAssociation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2781:1: ( ( ( rule__CreateAssociation__TargetAssignment_2 ) ) )
            // InternalFeatureLangParser.g:2782:1: ( ( rule__CreateAssociation__TargetAssignment_2 ) )
            {
            // InternalFeatureLangParser.g:2782:1: ( ( rule__CreateAssociation__TargetAssignment_2 ) )
            // InternalFeatureLangParser.g:2783:2: ( rule__CreateAssociation__TargetAssignment_2 )
            {
             before(grammarAccess.getCreateAssociationAccess().getTargetAssignment_2()); 
            // InternalFeatureLangParser.g:2784:2: ( rule__CreateAssociation__TargetAssignment_2 )
            // InternalFeatureLangParser.g:2784:3: rule__CreateAssociation__TargetAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CreateAssociation__TargetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCreateAssociationAccess().getTargetAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateAssociation__Group__2__Impl"


    // $ANTLR start "rule__CreateAssociation__Group__3"
    // InternalFeatureLangParser.g:2792:1: rule__CreateAssociation__Group__3 : rule__CreateAssociation__Group__3__Impl rule__CreateAssociation__Group__4 ;
    public final void rule__CreateAssociation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2796:1: ( rule__CreateAssociation__Group__3__Impl rule__CreateAssociation__Group__4 )
            // InternalFeatureLangParser.g:2797:2: rule__CreateAssociation__Group__3__Impl rule__CreateAssociation__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__CreateAssociation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateAssociation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateAssociation__Group__3"


    // $ANTLR start "rule__CreateAssociation__Group__3__Impl"
    // InternalFeatureLangParser.g:2804:1: rule__CreateAssociation__Group__3__Impl : ( Called ) ;
    public final void rule__CreateAssociation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2808:1: ( ( Called ) )
            // InternalFeatureLangParser.g:2809:1: ( Called )
            {
            // InternalFeatureLangParser.g:2809:1: ( Called )
            // InternalFeatureLangParser.g:2810:2: Called
            {
             before(grammarAccess.getCreateAssociationAccess().getCalledKeyword_3()); 
            match(input,Called,FOLLOW_2); 
             after(grammarAccess.getCreateAssociationAccess().getCalledKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateAssociation__Group__3__Impl"


    // $ANTLR start "rule__CreateAssociation__Group__4"
    // InternalFeatureLangParser.g:2819:1: rule__CreateAssociation__Group__4 : rule__CreateAssociation__Group__4__Impl ;
    public final void rule__CreateAssociation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2823:1: ( rule__CreateAssociation__Group__4__Impl )
            // InternalFeatureLangParser.g:2824:2: rule__CreateAssociation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CreateAssociation__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateAssociation__Group__4"


    // $ANTLR start "rule__CreateAssociation__Group__4__Impl"
    // InternalFeatureLangParser.g:2830:1: rule__CreateAssociation__Group__4__Impl : ( ( rule__CreateAssociation__RelationAssignment_4 ) ) ;
    public final void rule__CreateAssociation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2834:1: ( ( ( rule__CreateAssociation__RelationAssignment_4 ) ) )
            // InternalFeatureLangParser.g:2835:1: ( ( rule__CreateAssociation__RelationAssignment_4 ) )
            {
            // InternalFeatureLangParser.g:2835:1: ( ( rule__CreateAssociation__RelationAssignment_4 ) )
            // InternalFeatureLangParser.g:2836:2: ( rule__CreateAssociation__RelationAssignment_4 )
            {
             before(grammarAccess.getCreateAssociationAccess().getRelationAssignment_4()); 
            // InternalFeatureLangParser.g:2837:2: ( rule__CreateAssociation__RelationAssignment_4 )
            // InternalFeatureLangParser.g:2837:3: rule__CreateAssociation__RelationAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CreateAssociation__RelationAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCreateAssociationAccess().getRelationAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateAssociation__Group__4__Impl"


    // $ANTLR start "rule__SetCompatible__Group__0"
    // InternalFeatureLangParser.g:2846:1: rule__SetCompatible__Group__0 : rule__SetCompatible__Group__0__Impl rule__SetCompatible__Group__1 ;
    public final void rule__SetCompatible__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2850:1: ( rule__SetCompatible__Group__0__Impl rule__SetCompatible__Group__1 )
            // InternalFeatureLangParser.g:2851:2: rule__SetCompatible__Group__0__Impl rule__SetCompatible__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__SetCompatible__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetCompatible__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetCompatible__Group__0"


    // $ANTLR start "rule__SetCompatible__Group__0__Impl"
    // InternalFeatureLangParser.g:2858:1: rule__SetCompatible__Group__0__Impl : ( Compatible ) ;
    public final void rule__SetCompatible__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2862:1: ( ( Compatible ) )
            // InternalFeatureLangParser.g:2863:1: ( Compatible )
            {
            // InternalFeatureLangParser.g:2863:1: ( Compatible )
            // InternalFeatureLangParser.g:2864:2: Compatible
            {
             before(grammarAccess.getSetCompatibleAccess().getCompatibleKeyword_0()); 
            match(input,Compatible,FOLLOW_2); 
             after(grammarAccess.getSetCompatibleAccess().getCompatibleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetCompatible__Group__0__Impl"


    // $ANTLR start "rule__SetCompatible__Group__1"
    // InternalFeatureLangParser.g:2873:1: rule__SetCompatible__Group__1 : rule__SetCompatible__Group__1__Impl rule__SetCompatible__Group__2 ;
    public final void rule__SetCompatible__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2877:1: ( rule__SetCompatible__Group__1__Impl rule__SetCompatible__Group__2 )
            // InternalFeatureLangParser.g:2878:2: rule__SetCompatible__Group__1__Impl rule__SetCompatible__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__SetCompatible__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetCompatible__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetCompatible__Group__1"


    // $ANTLR start "rule__SetCompatible__Group__1__Impl"
    // InternalFeatureLangParser.g:2885:1: rule__SetCompatible__Group__1__Impl : ( With ) ;
    public final void rule__SetCompatible__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2889:1: ( ( With ) )
            // InternalFeatureLangParser.g:2890:1: ( With )
            {
            // InternalFeatureLangParser.g:2890:1: ( With )
            // InternalFeatureLangParser.g:2891:2: With
            {
             before(grammarAccess.getSetCompatibleAccess().getWithKeyword_1()); 
            match(input,With,FOLLOW_2); 
             after(grammarAccess.getSetCompatibleAccess().getWithKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetCompatible__Group__1__Impl"


    // $ANTLR start "rule__SetCompatible__Group__2"
    // InternalFeatureLangParser.g:2900:1: rule__SetCompatible__Group__2 : rule__SetCompatible__Group__2__Impl rule__SetCompatible__Group__3 ;
    public final void rule__SetCompatible__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2904:1: ( rule__SetCompatible__Group__2__Impl rule__SetCompatible__Group__3 )
            // InternalFeatureLangParser.g:2905:2: rule__SetCompatible__Group__2__Impl rule__SetCompatible__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__SetCompatible__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetCompatible__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetCompatible__Group__2"


    // $ANTLR start "rule__SetCompatible__Group__2__Impl"
    // InternalFeatureLangParser.g:2912:1: rule__SetCompatible__Group__2__Impl : ( Version ) ;
    public final void rule__SetCompatible__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2916:1: ( ( Version ) )
            // InternalFeatureLangParser.g:2917:1: ( Version )
            {
            // InternalFeatureLangParser.g:2917:1: ( Version )
            // InternalFeatureLangParser.g:2918:2: Version
            {
             before(grammarAccess.getSetCompatibleAccess().getVersionKeyword_2()); 
            match(input,Version,FOLLOW_2); 
             after(grammarAccess.getSetCompatibleAccess().getVersionKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetCompatible__Group__2__Impl"


    // $ANTLR start "rule__SetCompatible__Group__3"
    // InternalFeatureLangParser.g:2927:1: rule__SetCompatible__Group__3 : rule__SetCompatible__Group__3__Impl ;
    public final void rule__SetCompatible__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2931:1: ( rule__SetCompatible__Group__3__Impl )
            // InternalFeatureLangParser.g:2932:2: rule__SetCompatible__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetCompatible__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetCompatible__Group__3"


    // $ANTLR start "rule__SetCompatible__Group__3__Impl"
    // InternalFeatureLangParser.g:2938:1: rule__SetCompatible__Group__3__Impl : ( ( rule__SetCompatible__NameAssignment_3 ) ) ;
    public final void rule__SetCompatible__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2942:1: ( ( ( rule__SetCompatible__NameAssignment_3 ) ) )
            // InternalFeatureLangParser.g:2943:1: ( ( rule__SetCompatible__NameAssignment_3 ) )
            {
            // InternalFeatureLangParser.g:2943:1: ( ( rule__SetCompatible__NameAssignment_3 ) )
            // InternalFeatureLangParser.g:2944:2: ( rule__SetCompatible__NameAssignment_3 )
            {
             before(grammarAccess.getSetCompatibleAccess().getNameAssignment_3()); 
            // InternalFeatureLangParser.g:2945:2: ( rule__SetCompatible__NameAssignment_3 )
            // InternalFeatureLangParser.g:2945:3: rule__SetCompatible__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SetCompatible__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSetCompatibleAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetCompatible__Group__3__Impl"


    // $ANTLR start "rule__SetVersionRange__Group__0"
    // InternalFeatureLangParser.g:2954:1: rule__SetVersionRange__Group__0 : rule__SetVersionRange__Group__0__Impl rule__SetVersionRange__Group__1 ;
    public final void rule__SetVersionRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2958:1: ( rule__SetVersionRange__Group__0__Impl rule__SetVersionRange__Group__1 )
            // InternalFeatureLangParser.g:2959:2: rule__SetVersionRange__Group__0__Impl rule__SetVersionRange__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__SetVersionRange__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetVersionRange__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetVersionRange__Group__0"


    // $ANTLR start "rule__SetVersionRange__Group__0__Impl"
    // InternalFeatureLangParser.g:2966:1: rule__SetVersionRange__Group__0__Impl : ( With ) ;
    public final void rule__SetVersionRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2970:1: ( ( With ) )
            // InternalFeatureLangParser.g:2971:1: ( With )
            {
            // InternalFeatureLangParser.g:2971:1: ( With )
            // InternalFeatureLangParser.g:2972:2: With
            {
             before(grammarAccess.getSetVersionRangeAccess().getWithKeyword_0()); 
            match(input,With,FOLLOW_2); 
             after(grammarAccess.getSetVersionRangeAccess().getWithKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetVersionRange__Group__0__Impl"


    // $ANTLR start "rule__SetVersionRange__Group__1"
    // InternalFeatureLangParser.g:2981:1: rule__SetVersionRange__Group__1 : rule__SetVersionRange__Group__1__Impl rule__SetVersionRange__Group__2 ;
    public final void rule__SetVersionRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2985:1: ( rule__SetVersionRange__Group__1__Impl rule__SetVersionRange__Group__2 )
            // InternalFeatureLangParser.g:2986:2: rule__SetVersionRange__Group__1__Impl rule__SetVersionRange__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__SetVersionRange__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetVersionRange__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetVersionRange__Group__1"


    // $ANTLR start "rule__SetVersionRange__Group__1__Impl"
    // InternalFeatureLangParser.g:2993:1: rule__SetVersionRange__Group__1__Impl : ( Version ) ;
    public final void rule__SetVersionRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2997:1: ( ( Version ) )
            // InternalFeatureLangParser.g:2998:1: ( Version )
            {
            // InternalFeatureLangParser.g:2998:1: ( Version )
            // InternalFeatureLangParser.g:2999:2: Version
            {
             before(grammarAccess.getSetVersionRangeAccess().getVersionKeyword_1()); 
            match(input,Version,FOLLOW_2); 
             after(grammarAccess.getSetVersionRangeAccess().getVersionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetVersionRange__Group__1__Impl"


    // $ANTLR start "rule__SetVersionRange__Group__2"
    // InternalFeatureLangParser.g:3008:1: rule__SetVersionRange__Group__2 : rule__SetVersionRange__Group__2__Impl rule__SetVersionRange__Group__3 ;
    public final void rule__SetVersionRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3012:1: ( rule__SetVersionRange__Group__2__Impl rule__SetVersionRange__Group__3 )
            // InternalFeatureLangParser.g:3013:2: rule__SetVersionRange__Group__2__Impl rule__SetVersionRange__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__SetVersionRange__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetVersionRange__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetVersionRange__Group__2"


    // $ANTLR start "rule__SetVersionRange__Group__2__Impl"
    // InternalFeatureLangParser.g:3020:1: rule__SetVersionRange__Group__2__Impl : ( Range ) ;
    public final void rule__SetVersionRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3024:1: ( ( Range ) )
            // InternalFeatureLangParser.g:3025:1: ( Range )
            {
            // InternalFeatureLangParser.g:3025:1: ( Range )
            // InternalFeatureLangParser.g:3026:2: Range
            {
             before(grammarAccess.getSetVersionRangeAccess().getRangeKeyword_2()); 
            match(input,Range,FOLLOW_2); 
             after(grammarAccess.getSetVersionRangeAccess().getRangeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetVersionRange__Group__2__Impl"


    // $ANTLR start "rule__SetVersionRange__Group__3"
    // InternalFeatureLangParser.g:3035:1: rule__SetVersionRange__Group__3 : rule__SetVersionRange__Group__3__Impl rule__SetVersionRange__Group__4 ;
    public final void rule__SetVersionRange__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3039:1: ( rule__SetVersionRange__Group__3__Impl rule__SetVersionRange__Group__4 )
            // InternalFeatureLangParser.g:3040:2: rule__SetVersionRange__Group__3__Impl rule__SetVersionRange__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__SetVersionRange__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetVersionRange__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetVersionRange__Group__3"


    // $ANTLR start "rule__SetVersionRange__Group__3__Impl"
    // InternalFeatureLangParser.g:3047:1: rule__SetVersionRange__Group__3__Impl : ( From ) ;
    public final void rule__SetVersionRange__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3051:1: ( ( From ) )
            // InternalFeatureLangParser.g:3052:1: ( From )
            {
            // InternalFeatureLangParser.g:3052:1: ( From )
            // InternalFeatureLangParser.g:3053:2: From
            {
             before(grammarAccess.getSetVersionRangeAccess().getFromKeyword_3()); 
            match(input,From,FOLLOW_2); 
             after(grammarAccess.getSetVersionRangeAccess().getFromKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetVersionRange__Group__3__Impl"


    // $ANTLR start "rule__SetVersionRange__Group__4"
    // InternalFeatureLangParser.g:3062:1: rule__SetVersionRange__Group__4 : rule__SetVersionRange__Group__4__Impl rule__SetVersionRange__Group__5 ;
    public final void rule__SetVersionRange__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3066:1: ( rule__SetVersionRange__Group__4__Impl rule__SetVersionRange__Group__5 )
            // InternalFeatureLangParser.g:3067:2: rule__SetVersionRange__Group__4__Impl rule__SetVersionRange__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__SetVersionRange__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetVersionRange__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetVersionRange__Group__4"


    // $ANTLR start "rule__SetVersionRange__Group__4__Impl"
    // InternalFeatureLangParser.g:3074:1: rule__SetVersionRange__Group__4__Impl : ( ( rule__SetVersionRange__StartAssignment_4 ) ) ;
    public final void rule__SetVersionRange__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3078:1: ( ( ( rule__SetVersionRange__StartAssignment_4 ) ) )
            // InternalFeatureLangParser.g:3079:1: ( ( rule__SetVersionRange__StartAssignment_4 ) )
            {
            // InternalFeatureLangParser.g:3079:1: ( ( rule__SetVersionRange__StartAssignment_4 ) )
            // InternalFeatureLangParser.g:3080:2: ( rule__SetVersionRange__StartAssignment_4 )
            {
             before(grammarAccess.getSetVersionRangeAccess().getStartAssignment_4()); 
            // InternalFeatureLangParser.g:3081:2: ( rule__SetVersionRange__StartAssignment_4 )
            // InternalFeatureLangParser.g:3081:3: rule__SetVersionRange__StartAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SetVersionRange__StartAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSetVersionRangeAccess().getStartAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetVersionRange__Group__4__Impl"


    // $ANTLR start "rule__SetVersionRange__Group__5"
    // InternalFeatureLangParser.g:3089:1: rule__SetVersionRange__Group__5 : rule__SetVersionRange__Group__5__Impl rule__SetVersionRange__Group__6 ;
    public final void rule__SetVersionRange__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3093:1: ( rule__SetVersionRange__Group__5__Impl rule__SetVersionRange__Group__6 )
            // InternalFeatureLangParser.g:3094:2: rule__SetVersionRange__Group__5__Impl rule__SetVersionRange__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__SetVersionRange__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetVersionRange__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetVersionRange__Group__5"


    // $ANTLR start "rule__SetVersionRange__Group__5__Impl"
    // InternalFeatureLangParser.g:3101:1: rule__SetVersionRange__Group__5__Impl : ( To ) ;
    public final void rule__SetVersionRange__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3105:1: ( ( To ) )
            // InternalFeatureLangParser.g:3106:1: ( To )
            {
            // InternalFeatureLangParser.g:3106:1: ( To )
            // InternalFeatureLangParser.g:3107:2: To
            {
             before(grammarAccess.getSetVersionRangeAccess().getToKeyword_5()); 
            match(input,To,FOLLOW_2); 
             after(grammarAccess.getSetVersionRangeAccess().getToKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetVersionRange__Group__5__Impl"


    // $ANTLR start "rule__SetVersionRange__Group__6"
    // InternalFeatureLangParser.g:3116:1: rule__SetVersionRange__Group__6 : rule__SetVersionRange__Group__6__Impl ;
    public final void rule__SetVersionRange__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3120:1: ( rule__SetVersionRange__Group__6__Impl )
            // InternalFeatureLangParser.g:3121:2: rule__SetVersionRange__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetVersionRange__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetVersionRange__Group__6"


    // $ANTLR start "rule__SetVersionRange__Group__6__Impl"
    // InternalFeatureLangParser.g:3127:1: rule__SetVersionRange__Group__6__Impl : ( ( rule__SetVersionRange__EndAssignment_6 ) ) ;
    public final void rule__SetVersionRange__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3131:1: ( ( ( rule__SetVersionRange__EndAssignment_6 ) ) )
            // InternalFeatureLangParser.g:3132:1: ( ( rule__SetVersionRange__EndAssignment_6 ) )
            {
            // InternalFeatureLangParser.g:3132:1: ( ( rule__SetVersionRange__EndAssignment_6 ) )
            // InternalFeatureLangParser.g:3133:2: ( rule__SetVersionRange__EndAssignment_6 )
            {
             before(grammarAccess.getSetVersionRangeAccess().getEndAssignment_6()); 
            // InternalFeatureLangParser.g:3134:2: ( rule__SetVersionRange__EndAssignment_6 )
            // InternalFeatureLangParser.g:3134:3: rule__SetVersionRange__EndAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__SetVersionRange__EndAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSetVersionRangeAccess().getEndAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetVersionRange__Group__6__Impl"


    // $ANTLR start "rule__SetVariant__Group__0"
    // InternalFeatureLangParser.g:3143:1: rule__SetVariant__Group__0 : rule__SetVariant__Group__0__Impl rule__SetVariant__Group__1 ;
    public final void rule__SetVariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3147:1: ( rule__SetVariant__Group__0__Impl rule__SetVariant__Group__1 )
            // InternalFeatureLangParser.g:3148:2: rule__SetVariant__Group__0__Impl rule__SetVariant__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__SetVariant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetVariant__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetVariant__Group__0"


    // $ANTLR start "rule__SetVariant__Group__0__Impl"
    // InternalFeatureLangParser.g:3155:1: rule__SetVariant__Group__0__Impl : ( With ) ;
    public final void rule__SetVariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3159:1: ( ( With ) )
            // InternalFeatureLangParser.g:3160:1: ( With )
            {
            // InternalFeatureLangParser.g:3160:1: ( With )
            // InternalFeatureLangParser.g:3161:2: With
            {
             before(grammarAccess.getSetVariantAccess().getWithKeyword_0()); 
            match(input,With,FOLLOW_2); 
             after(grammarAccess.getSetVariantAccess().getWithKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetVariant__Group__0__Impl"


    // $ANTLR start "rule__SetVariant__Group__1"
    // InternalFeatureLangParser.g:3170:1: rule__SetVariant__Group__1 : rule__SetVariant__Group__1__Impl rule__SetVariant__Group__2 ;
    public final void rule__SetVariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3174:1: ( rule__SetVariant__Group__1__Impl rule__SetVariant__Group__2 )
            // InternalFeatureLangParser.g:3175:2: rule__SetVariant__Group__1__Impl rule__SetVariant__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__SetVariant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetVariant__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetVariant__Group__1"


    // $ANTLR start "rule__SetVariant__Group__1__Impl"
    // InternalFeatureLangParser.g:3182:1: rule__SetVariant__Group__1__Impl : ( All ) ;
    public final void rule__SetVariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3186:1: ( ( All ) )
            // InternalFeatureLangParser.g:3187:1: ( All )
            {
            // InternalFeatureLangParser.g:3187:1: ( All )
            // InternalFeatureLangParser.g:3188:2: All
            {
             before(grammarAccess.getSetVariantAccess().getAllKeyword_1()); 
            match(input,All,FOLLOW_2); 
             after(grammarAccess.getSetVariantAccess().getAllKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetVariant__Group__1__Impl"


    // $ANTLR start "rule__SetVariant__Group__2"
    // InternalFeatureLangParser.g:3197:1: rule__SetVariant__Group__2 : rule__SetVariant__Group__2__Impl rule__SetVariant__Group__3 ;
    public final void rule__SetVariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3201:1: ( rule__SetVariant__Group__2__Impl rule__SetVariant__Group__3 )
            // InternalFeatureLangParser.g:3202:2: rule__SetVariant__Group__2__Impl rule__SetVariant__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__SetVariant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetVariant__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetVariant__Group__2"


    // $ANTLR start "rule__SetVariant__Group__2__Impl"
    // InternalFeatureLangParser.g:3209:1: rule__SetVariant__Group__2__Impl : ( Versions ) ;
    public final void rule__SetVariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3213:1: ( ( Versions ) )
            // InternalFeatureLangParser.g:3214:1: ( Versions )
            {
            // InternalFeatureLangParser.g:3214:1: ( Versions )
            // InternalFeatureLangParser.g:3215:2: Versions
            {
             before(grammarAccess.getSetVariantAccess().getVersionsKeyword_2()); 
            match(input,Versions,FOLLOW_2); 
             after(grammarAccess.getSetVariantAccess().getVersionsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetVariant__Group__2__Impl"


    // $ANTLR start "rule__SetVariant__Group__3"
    // InternalFeatureLangParser.g:3224:1: rule__SetVariant__Group__3 : rule__SetVariant__Group__3__Impl rule__SetVariant__Group__4 ;
    public final void rule__SetVariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3228:1: ( rule__SetVariant__Group__3__Impl rule__SetVariant__Group__4 )
            // InternalFeatureLangParser.g:3229:2: rule__SetVariant__Group__3__Impl rule__SetVariant__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__SetVariant__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetVariant__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetVariant__Group__3"


    // $ANTLR start "rule__SetVariant__Group__3__Impl"
    // InternalFeatureLangParser.g:3236:1: rule__SetVariant__Group__3__Impl : ( Of ) ;
    public final void rule__SetVariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3240:1: ( ( Of ) )
            // InternalFeatureLangParser.g:3241:1: ( Of )
            {
            // InternalFeatureLangParser.g:3241:1: ( Of )
            // InternalFeatureLangParser.g:3242:2: Of
            {
             before(grammarAccess.getSetVariantAccess().getOfKeyword_3()); 
            match(input,Of,FOLLOW_2); 
             after(grammarAccess.getSetVariantAccess().getOfKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetVariant__Group__3__Impl"


    // $ANTLR start "rule__SetVariant__Group__4"
    // InternalFeatureLangParser.g:3251:1: rule__SetVariant__Group__4 : rule__SetVariant__Group__4__Impl rule__SetVariant__Group__5 ;
    public final void rule__SetVariant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3255:1: ( rule__SetVariant__Group__4__Impl rule__SetVariant__Group__5 )
            // InternalFeatureLangParser.g:3256:2: rule__SetVariant__Group__4__Impl rule__SetVariant__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__SetVariant__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetVariant__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetVariant__Group__4"


    // $ANTLR start "rule__SetVariant__Group__4__Impl"
    // InternalFeatureLangParser.g:3263:1: rule__SetVariant__Group__4__Impl : ( Variant ) ;
    public final void rule__SetVariant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3267:1: ( ( Variant ) )
            // InternalFeatureLangParser.g:3268:1: ( Variant )
            {
            // InternalFeatureLangParser.g:3268:1: ( Variant )
            // InternalFeatureLangParser.g:3269:2: Variant
            {
             before(grammarAccess.getSetVariantAccess().getVariantKeyword_4()); 
            match(input,Variant,FOLLOW_2); 
             after(grammarAccess.getSetVariantAccess().getVariantKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetVariant__Group__4__Impl"


    // $ANTLR start "rule__SetVariant__Group__5"
    // InternalFeatureLangParser.g:3278:1: rule__SetVariant__Group__5 : rule__SetVariant__Group__5__Impl ;
    public final void rule__SetVariant__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3282:1: ( rule__SetVariant__Group__5__Impl )
            // InternalFeatureLangParser.g:3283:2: rule__SetVariant__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetVariant__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetVariant__Group__5"


    // $ANTLR start "rule__SetVariant__Group__5__Impl"
    // InternalFeatureLangParser.g:3289:1: rule__SetVariant__Group__5__Impl : ( ( rule__SetVariant__NameAssignment_5 ) ) ;
    public final void rule__SetVariant__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3293:1: ( ( ( rule__SetVariant__NameAssignment_5 ) ) )
            // InternalFeatureLangParser.g:3294:1: ( ( rule__SetVariant__NameAssignment_5 ) )
            {
            // InternalFeatureLangParser.g:3294:1: ( ( rule__SetVariant__NameAssignment_5 ) )
            // InternalFeatureLangParser.g:3295:2: ( rule__SetVariant__NameAssignment_5 )
            {
             before(grammarAccess.getSetVariantAccess().getNameAssignment_5()); 
            // InternalFeatureLangParser.g:3296:2: ( rule__SetVariant__NameAssignment_5 )
            // InternalFeatureLangParser.g:3296:3: rule__SetVariant__NameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__SetVariant__NameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSetVariantAccess().getNameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetVariant__Group__5__Impl"


    // $ANTLR start "rule__SetRightOpen__Group__0"
    // InternalFeatureLangParser.g:3305:1: rule__SetRightOpen__Group__0 : rule__SetRightOpen__Group__0__Impl rule__SetRightOpen__Group__1 ;
    public final void rule__SetRightOpen__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3309:1: ( rule__SetRightOpen__Group__0__Impl rule__SetRightOpen__Group__1 )
            // InternalFeatureLangParser.g:3310:2: rule__SetRightOpen__Group__0__Impl rule__SetRightOpen__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__SetRightOpen__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetRightOpen__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRightOpen__Group__0"


    // $ANTLR start "rule__SetRightOpen__Group__0__Impl"
    // InternalFeatureLangParser.g:3317:1: rule__SetRightOpen__Group__0__Impl : ( Up ) ;
    public final void rule__SetRightOpen__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3321:1: ( ( Up ) )
            // InternalFeatureLangParser.g:3322:1: ( Up )
            {
            // InternalFeatureLangParser.g:3322:1: ( Up )
            // InternalFeatureLangParser.g:3323:2: Up
            {
             before(grammarAccess.getSetRightOpenAccess().getUpKeyword_0()); 
            match(input,Up,FOLLOW_2); 
             after(grammarAccess.getSetRightOpenAccess().getUpKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRightOpen__Group__0__Impl"


    // $ANTLR start "rule__SetRightOpen__Group__1"
    // InternalFeatureLangParser.g:3332:1: rule__SetRightOpen__Group__1 : rule__SetRightOpen__Group__1__Impl rule__SetRightOpen__Group__2 ;
    public final void rule__SetRightOpen__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3336:1: ( rule__SetRightOpen__Group__1__Impl rule__SetRightOpen__Group__2 )
            // InternalFeatureLangParser.g:3337:2: rule__SetRightOpen__Group__1__Impl rule__SetRightOpen__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__SetRightOpen__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetRightOpen__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRightOpen__Group__1"


    // $ANTLR start "rule__SetRightOpen__Group__1__Impl"
    // InternalFeatureLangParser.g:3344:1: rule__SetRightOpen__Group__1__Impl : ( To ) ;
    public final void rule__SetRightOpen__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3348:1: ( ( To ) )
            // InternalFeatureLangParser.g:3349:1: ( To )
            {
            // InternalFeatureLangParser.g:3349:1: ( To )
            // InternalFeatureLangParser.g:3350:2: To
            {
             before(grammarAccess.getSetRightOpenAccess().getToKeyword_1()); 
            match(input,To,FOLLOW_2); 
             after(grammarAccess.getSetRightOpenAccess().getToKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRightOpen__Group__1__Impl"


    // $ANTLR start "rule__SetRightOpen__Group__2"
    // InternalFeatureLangParser.g:3359:1: rule__SetRightOpen__Group__2 : rule__SetRightOpen__Group__2__Impl rule__SetRightOpen__Group__3 ;
    public final void rule__SetRightOpen__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3363:1: ( rule__SetRightOpen__Group__2__Impl rule__SetRightOpen__Group__3 )
            // InternalFeatureLangParser.g:3364:2: rule__SetRightOpen__Group__2__Impl rule__SetRightOpen__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__SetRightOpen__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetRightOpen__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRightOpen__Group__2"


    // $ANTLR start "rule__SetRightOpen__Group__2__Impl"
    // InternalFeatureLangParser.g:3371:1: rule__SetRightOpen__Group__2__Impl : ( Date ) ;
    public final void rule__SetRightOpen__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3375:1: ( ( Date ) )
            // InternalFeatureLangParser.g:3376:1: ( Date )
            {
            // InternalFeatureLangParser.g:3376:1: ( Date )
            // InternalFeatureLangParser.g:3377:2: Date
            {
             before(grammarAccess.getSetRightOpenAccess().getDateKeyword_2()); 
            match(input,Date,FOLLOW_2); 
             after(grammarAccess.getSetRightOpenAccess().getDateKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRightOpen__Group__2__Impl"


    // $ANTLR start "rule__SetRightOpen__Group__3"
    // InternalFeatureLangParser.g:3386:1: rule__SetRightOpen__Group__3 : rule__SetRightOpen__Group__3__Impl ;
    public final void rule__SetRightOpen__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3390:1: ( rule__SetRightOpen__Group__3__Impl )
            // InternalFeatureLangParser.g:3391:2: rule__SetRightOpen__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetRightOpen__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRightOpen__Group__3"


    // $ANTLR start "rule__SetRightOpen__Group__3__Impl"
    // InternalFeatureLangParser.g:3397:1: rule__SetRightOpen__Group__3__Impl : ( ( rule__SetRightOpen__DateAssignment_3 ) ) ;
    public final void rule__SetRightOpen__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3401:1: ( ( ( rule__SetRightOpen__DateAssignment_3 ) ) )
            // InternalFeatureLangParser.g:3402:1: ( ( rule__SetRightOpen__DateAssignment_3 ) )
            {
            // InternalFeatureLangParser.g:3402:1: ( ( rule__SetRightOpen__DateAssignment_3 ) )
            // InternalFeatureLangParser.g:3403:2: ( rule__SetRightOpen__DateAssignment_3 )
            {
             before(grammarAccess.getSetRightOpenAccess().getDateAssignment_3()); 
            // InternalFeatureLangParser.g:3404:2: ( rule__SetRightOpen__DateAssignment_3 )
            // InternalFeatureLangParser.g:3404:3: rule__SetRightOpen__DateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SetRightOpen__DateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSetRightOpenAccess().getDateAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRightOpen__Group__3__Impl"


    // $ANTLR start "rule__SetLeftOpen__Group__0"
    // InternalFeatureLangParser.g:3413:1: rule__SetLeftOpen__Group__0 : rule__SetLeftOpen__Group__0__Impl rule__SetLeftOpen__Group__1 ;
    public final void rule__SetLeftOpen__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3417:1: ( rule__SetLeftOpen__Group__0__Impl rule__SetLeftOpen__Group__1 )
            // InternalFeatureLangParser.g:3418:2: rule__SetLeftOpen__Group__0__Impl rule__SetLeftOpen__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__SetLeftOpen__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetLeftOpen__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetLeftOpen__Group__0"


    // $ANTLR start "rule__SetLeftOpen__Group__0__Impl"
    // InternalFeatureLangParser.g:3425:1: rule__SetLeftOpen__Group__0__Impl : ( Starting ) ;
    public final void rule__SetLeftOpen__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3429:1: ( ( Starting ) )
            // InternalFeatureLangParser.g:3430:1: ( Starting )
            {
            // InternalFeatureLangParser.g:3430:1: ( Starting )
            // InternalFeatureLangParser.g:3431:2: Starting
            {
             before(grammarAccess.getSetLeftOpenAccess().getStartingKeyword_0()); 
            match(input,Starting,FOLLOW_2); 
             after(grammarAccess.getSetLeftOpenAccess().getStartingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetLeftOpen__Group__0__Impl"


    // $ANTLR start "rule__SetLeftOpen__Group__1"
    // InternalFeatureLangParser.g:3440:1: rule__SetLeftOpen__Group__1 : rule__SetLeftOpen__Group__1__Impl rule__SetLeftOpen__Group__2 ;
    public final void rule__SetLeftOpen__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3444:1: ( rule__SetLeftOpen__Group__1__Impl rule__SetLeftOpen__Group__2 )
            // InternalFeatureLangParser.g:3445:2: rule__SetLeftOpen__Group__1__Impl rule__SetLeftOpen__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__SetLeftOpen__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetLeftOpen__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetLeftOpen__Group__1"


    // $ANTLR start "rule__SetLeftOpen__Group__1__Impl"
    // InternalFeatureLangParser.g:3452:1: rule__SetLeftOpen__Group__1__Impl : ( From ) ;
    public final void rule__SetLeftOpen__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3456:1: ( ( From ) )
            // InternalFeatureLangParser.g:3457:1: ( From )
            {
            // InternalFeatureLangParser.g:3457:1: ( From )
            // InternalFeatureLangParser.g:3458:2: From
            {
             before(grammarAccess.getSetLeftOpenAccess().getFromKeyword_1()); 
            match(input,From,FOLLOW_2); 
             after(grammarAccess.getSetLeftOpenAccess().getFromKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetLeftOpen__Group__1__Impl"


    // $ANTLR start "rule__SetLeftOpen__Group__2"
    // InternalFeatureLangParser.g:3467:1: rule__SetLeftOpen__Group__2 : rule__SetLeftOpen__Group__2__Impl rule__SetLeftOpen__Group__3 ;
    public final void rule__SetLeftOpen__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3471:1: ( rule__SetLeftOpen__Group__2__Impl rule__SetLeftOpen__Group__3 )
            // InternalFeatureLangParser.g:3472:2: rule__SetLeftOpen__Group__2__Impl rule__SetLeftOpen__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__SetLeftOpen__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetLeftOpen__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetLeftOpen__Group__2"


    // $ANTLR start "rule__SetLeftOpen__Group__2__Impl"
    // InternalFeatureLangParser.g:3479:1: rule__SetLeftOpen__Group__2__Impl : ( Date ) ;
    public final void rule__SetLeftOpen__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3483:1: ( ( Date ) )
            // InternalFeatureLangParser.g:3484:1: ( Date )
            {
            // InternalFeatureLangParser.g:3484:1: ( Date )
            // InternalFeatureLangParser.g:3485:2: Date
            {
             before(grammarAccess.getSetLeftOpenAccess().getDateKeyword_2()); 
            match(input,Date,FOLLOW_2); 
             after(grammarAccess.getSetLeftOpenAccess().getDateKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetLeftOpen__Group__2__Impl"


    // $ANTLR start "rule__SetLeftOpen__Group__3"
    // InternalFeatureLangParser.g:3494:1: rule__SetLeftOpen__Group__3 : rule__SetLeftOpen__Group__3__Impl ;
    public final void rule__SetLeftOpen__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3498:1: ( rule__SetLeftOpen__Group__3__Impl )
            // InternalFeatureLangParser.g:3499:2: rule__SetLeftOpen__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetLeftOpen__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetLeftOpen__Group__3"


    // $ANTLR start "rule__SetLeftOpen__Group__3__Impl"
    // InternalFeatureLangParser.g:3505:1: rule__SetLeftOpen__Group__3__Impl : ( ( rule__SetLeftOpen__DateAssignment_3 ) ) ;
    public final void rule__SetLeftOpen__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3509:1: ( ( ( rule__SetLeftOpen__DateAssignment_3 ) ) )
            // InternalFeatureLangParser.g:3510:1: ( ( rule__SetLeftOpen__DateAssignment_3 ) )
            {
            // InternalFeatureLangParser.g:3510:1: ( ( rule__SetLeftOpen__DateAssignment_3 ) )
            // InternalFeatureLangParser.g:3511:2: ( rule__SetLeftOpen__DateAssignment_3 )
            {
             before(grammarAccess.getSetLeftOpenAccess().getDateAssignment_3()); 
            // InternalFeatureLangParser.g:3512:2: ( rule__SetLeftOpen__DateAssignment_3 )
            // InternalFeatureLangParser.g:3512:3: rule__SetLeftOpen__DateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SetLeftOpen__DateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSetLeftOpenAccess().getDateAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetLeftOpen__Group__3__Impl"


    // $ANTLR start "rule__InheritanceAction__Group__0"
    // InternalFeatureLangParser.g:3521:1: rule__InheritanceAction__Group__0 : rule__InheritanceAction__Group__0__Impl rule__InheritanceAction__Group__1 ;
    public final void rule__InheritanceAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3525:1: ( rule__InheritanceAction__Group__0__Impl rule__InheritanceAction__Group__1 )
            // InternalFeatureLangParser.g:3526:2: rule__InheritanceAction__Group__0__Impl rule__InheritanceAction__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__InheritanceAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InheritanceAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InheritanceAction__Group__0"


    // $ANTLR start "rule__InheritanceAction__Group__0__Impl"
    // InternalFeatureLangParser.g:3533:1: rule__InheritanceAction__Group__0__Impl : ( Inherit ) ;
    public final void rule__InheritanceAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3537:1: ( ( Inherit ) )
            // InternalFeatureLangParser.g:3538:1: ( Inherit )
            {
            // InternalFeatureLangParser.g:3538:1: ( Inherit )
            // InternalFeatureLangParser.g:3539:2: Inherit
            {
             before(grammarAccess.getInheritanceActionAccess().getInheritKeyword_0()); 
            match(input,Inherit,FOLLOW_2); 
             after(grammarAccess.getInheritanceActionAccess().getInheritKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InheritanceAction__Group__0__Impl"


    // $ANTLR start "rule__InheritanceAction__Group__1"
    // InternalFeatureLangParser.g:3548:1: rule__InheritanceAction__Group__1 : rule__InheritanceAction__Group__1__Impl rule__InheritanceAction__Group__2 ;
    public final void rule__InheritanceAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3552:1: ( rule__InheritanceAction__Group__1__Impl rule__InheritanceAction__Group__2 )
            // InternalFeatureLangParser.g:3553:2: rule__InheritanceAction__Group__1__Impl rule__InheritanceAction__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__InheritanceAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InheritanceAction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InheritanceAction__Group__1"


    // $ANTLR start "rule__InheritanceAction__Group__1__Impl"
    // InternalFeatureLangParser.g:3560:1: rule__InheritanceAction__Group__1__Impl : ( From ) ;
    public final void rule__InheritanceAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3564:1: ( ( From ) )
            // InternalFeatureLangParser.g:3565:1: ( From )
            {
            // InternalFeatureLangParser.g:3565:1: ( From )
            // InternalFeatureLangParser.g:3566:2: From
            {
             before(grammarAccess.getInheritanceActionAccess().getFromKeyword_1()); 
            match(input,From,FOLLOW_2); 
             after(grammarAccess.getInheritanceActionAccess().getFromKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InheritanceAction__Group__1__Impl"


    // $ANTLR start "rule__InheritanceAction__Group__2"
    // InternalFeatureLangParser.g:3575:1: rule__InheritanceAction__Group__2 : rule__InheritanceAction__Group__2__Impl ;
    public final void rule__InheritanceAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3579:1: ( rule__InheritanceAction__Group__2__Impl )
            // InternalFeatureLangParser.g:3580:2: rule__InheritanceAction__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InheritanceAction__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InheritanceAction__Group__2"


    // $ANTLR start "rule__InheritanceAction__Group__2__Impl"
    // InternalFeatureLangParser.g:3586:1: rule__InheritanceAction__Group__2__Impl : ( ( rule__InheritanceAction__ParentAssignment_2 ) ) ;
    public final void rule__InheritanceAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3590:1: ( ( ( rule__InheritanceAction__ParentAssignment_2 ) ) )
            // InternalFeatureLangParser.g:3591:1: ( ( rule__InheritanceAction__ParentAssignment_2 ) )
            {
            // InternalFeatureLangParser.g:3591:1: ( ( rule__InheritanceAction__ParentAssignment_2 ) )
            // InternalFeatureLangParser.g:3592:2: ( rule__InheritanceAction__ParentAssignment_2 )
            {
             before(grammarAccess.getInheritanceActionAccess().getParentAssignment_2()); 
            // InternalFeatureLangParser.g:3593:2: ( rule__InheritanceAction__ParentAssignment_2 )
            // InternalFeatureLangParser.g:3593:3: rule__InheritanceAction__ParentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__InheritanceAction__ParentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInheritanceActionAccess().getParentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InheritanceAction__Group__2__Impl"


    // $ANTLR start "rule__CreateComposition__Group__0"
    // InternalFeatureLangParser.g:3602:1: rule__CreateComposition__Group__0 : rule__CreateComposition__Group__0__Impl rule__CreateComposition__Group__1 ;
    public final void rule__CreateComposition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3606:1: ( rule__CreateComposition__Group__0__Impl rule__CreateComposition__Group__1 )
            // InternalFeatureLangParser.g:3607:2: rule__CreateComposition__Group__0__Impl rule__CreateComposition__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__CreateComposition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateComposition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateComposition__Group__0"


    // $ANTLR start "rule__CreateComposition__Group__0__Impl"
    // InternalFeatureLangParser.g:3614:1: rule__CreateComposition__Group__0__Impl : ( Compose ) ;
    public final void rule__CreateComposition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3618:1: ( ( Compose ) )
            // InternalFeatureLangParser.g:3619:1: ( Compose )
            {
            // InternalFeatureLangParser.g:3619:1: ( Compose )
            // InternalFeatureLangParser.g:3620:2: Compose
            {
             before(grammarAccess.getCreateCompositionAccess().getComposeKeyword_0()); 
            match(input,Compose,FOLLOW_2); 
             after(grammarAccess.getCreateCompositionAccess().getComposeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateComposition__Group__0__Impl"


    // $ANTLR start "rule__CreateComposition__Group__1"
    // InternalFeatureLangParser.g:3629:1: rule__CreateComposition__Group__1 : rule__CreateComposition__Group__1__Impl rule__CreateComposition__Group__2 ;
    public final void rule__CreateComposition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3633:1: ( rule__CreateComposition__Group__1__Impl rule__CreateComposition__Group__2 )
            // InternalFeatureLangParser.g:3634:2: rule__CreateComposition__Group__1__Impl rule__CreateComposition__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__CreateComposition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateComposition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateComposition__Group__1"


    // $ANTLR start "rule__CreateComposition__Group__1__Impl"
    // InternalFeatureLangParser.g:3641:1: rule__CreateComposition__Group__1__Impl : ( ( rule__CreateComposition__TargetAssignment_1 ) ) ;
    public final void rule__CreateComposition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3645:1: ( ( ( rule__CreateComposition__TargetAssignment_1 ) ) )
            // InternalFeatureLangParser.g:3646:1: ( ( rule__CreateComposition__TargetAssignment_1 ) )
            {
            // InternalFeatureLangParser.g:3646:1: ( ( rule__CreateComposition__TargetAssignment_1 ) )
            // InternalFeatureLangParser.g:3647:2: ( rule__CreateComposition__TargetAssignment_1 )
            {
             before(grammarAccess.getCreateCompositionAccess().getTargetAssignment_1()); 
            // InternalFeatureLangParser.g:3648:2: ( rule__CreateComposition__TargetAssignment_1 )
            // InternalFeatureLangParser.g:3648:3: rule__CreateComposition__TargetAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CreateComposition__TargetAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCreateCompositionAccess().getTargetAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateComposition__Group__1__Impl"


    // $ANTLR start "rule__CreateComposition__Group__2"
    // InternalFeatureLangParser.g:3656:1: rule__CreateComposition__Group__2 : rule__CreateComposition__Group__2__Impl rule__CreateComposition__Group__3 ;
    public final void rule__CreateComposition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3660:1: ( rule__CreateComposition__Group__2__Impl rule__CreateComposition__Group__3 )
            // InternalFeatureLangParser.g:3661:2: rule__CreateComposition__Group__2__Impl rule__CreateComposition__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__CreateComposition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateComposition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateComposition__Group__2"


    // $ANTLR start "rule__CreateComposition__Group__2__Impl"
    // InternalFeatureLangParser.g:3668:1: rule__CreateComposition__Group__2__Impl : ( Called ) ;
    public final void rule__CreateComposition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3672:1: ( ( Called ) )
            // InternalFeatureLangParser.g:3673:1: ( Called )
            {
            // InternalFeatureLangParser.g:3673:1: ( Called )
            // InternalFeatureLangParser.g:3674:2: Called
            {
             before(grammarAccess.getCreateCompositionAccess().getCalledKeyword_2()); 
            match(input,Called,FOLLOW_2); 
             after(grammarAccess.getCreateCompositionAccess().getCalledKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateComposition__Group__2__Impl"


    // $ANTLR start "rule__CreateComposition__Group__3"
    // InternalFeatureLangParser.g:3683:1: rule__CreateComposition__Group__3 : rule__CreateComposition__Group__3__Impl rule__CreateComposition__Group__4 ;
    public final void rule__CreateComposition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3687:1: ( rule__CreateComposition__Group__3__Impl rule__CreateComposition__Group__4 )
            // InternalFeatureLangParser.g:3688:2: rule__CreateComposition__Group__3__Impl rule__CreateComposition__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__CreateComposition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateComposition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateComposition__Group__3"


    // $ANTLR start "rule__CreateComposition__Group__3__Impl"
    // InternalFeatureLangParser.g:3695:1: rule__CreateComposition__Group__3__Impl : ( ( rule__CreateComposition__RelationAssignment_3 ) ) ;
    public final void rule__CreateComposition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3699:1: ( ( ( rule__CreateComposition__RelationAssignment_3 ) ) )
            // InternalFeatureLangParser.g:3700:1: ( ( rule__CreateComposition__RelationAssignment_3 ) )
            {
            // InternalFeatureLangParser.g:3700:1: ( ( rule__CreateComposition__RelationAssignment_3 ) )
            // InternalFeatureLangParser.g:3701:2: ( rule__CreateComposition__RelationAssignment_3 )
            {
             before(grammarAccess.getCreateCompositionAccess().getRelationAssignment_3()); 
            // InternalFeatureLangParser.g:3702:2: ( rule__CreateComposition__RelationAssignment_3 )
            // InternalFeatureLangParser.g:3702:3: rule__CreateComposition__RelationAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CreateComposition__RelationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCreateCompositionAccess().getRelationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateComposition__Group__3__Impl"


    // $ANTLR start "rule__CreateComposition__Group__4"
    // InternalFeatureLangParser.g:3710:1: rule__CreateComposition__Group__4 : rule__CreateComposition__Group__4__Impl ;
    public final void rule__CreateComposition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3714:1: ( rule__CreateComposition__Group__4__Impl )
            // InternalFeatureLangParser.g:3715:2: rule__CreateComposition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CreateComposition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateComposition__Group__4"


    // $ANTLR start "rule__CreateComposition__Group__4__Impl"
    // InternalFeatureLangParser.g:3721:1: rule__CreateComposition__Group__4__Impl : ( ( rule__CreateComposition__Group_4__0 )? ) ;
    public final void rule__CreateComposition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3725:1: ( ( ( rule__CreateComposition__Group_4__0 )? ) )
            // InternalFeatureLangParser.g:3726:1: ( ( rule__CreateComposition__Group_4__0 )? )
            {
            // InternalFeatureLangParser.g:3726:1: ( ( rule__CreateComposition__Group_4__0 )? )
            // InternalFeatureLangParser.g:3727:2: ( rule__CreateComposition__Group_4__0 )?
            {
             before(grammarAccess.getCreateCompositionAccess().getGroup_4()); 
            // InternalFeatureLangParser.g:3728:2: ( rule__CreateComposition__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==FullStop) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==It) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // InternalFeatureLangParser.g:3728:3: rule__CreateComposition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CreateComposition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCreateCompositionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateComposition__Group__4__Impl"


    // $ANTLR start "rule__CreateComposition__Group_4__0"
    // InternalFeatureLangParser.g:3737:1: rule__CreateComposition__Group_4__0 : rule__CreateComposition__Group_4__0__Impl rule__CreateComposition__Group_4__1 ;
    public final void rule__CreateComposition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3741:1: ( rule__CreateComposition__Group_4__0__Impl rule__CreateComposition__Group_4__1 )
            // InternalFeatureLangParser.g:3742:2: rule__CreateComposition__Group_4__0__Impl rule__CreateComposition__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__CreateComposition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateComposition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateComposition__Group_4__0"


    // $ANTLR start "rule__CreateComposition__Group_4__0__Impl"
    // InternalFeatureLangParser.g:3749:1: rule__CreateComposition__Group_4__0__Impl : ( FullStop ) ;
    public final void rule__CreateComposition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3753:1: ( ( FullStop ) )
            // InternalFeatureLangParser.g:3754:1: ( FullStop )
            {
            // InternalFeatureLangParser.g:3754:1: ( FullStop )
            // InternalFeatureLangParser.g:3755:2: FullStop
            {
             before(grammarAccess.getCreateCompositionAccess().getFullStopKeyword_4_0()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getCreateCompositionAccess().getFullStopKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateComposition__Group_4__0__Impl"


    // $ANTLR start "rule__CreateComposition__Group_4__1"
    // InternalFeatureLangParser.g:3764:1: rule__CreateComposition__Group_4__1 : rule__CreateComposition__Group_4__1__Impl rule__CreateComposition__Group_4__2 ;
    public final void rule__CreateComposition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3768:1: ( rule__CreateComposition__Group_4__1__Impl rule__CreateComposition__Group_4__2 )
            // InternalFeatureLangParser.g:3769:2: rule__CreateComposition__Group_4__1__Impl rule__CreateComposition__Group_4__2
            {
            pushFollow(FOLLOW_8);
            rule__CreateComposition__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateComposition__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateComposition__Group_4__1"


    // $ANTLR start "rule__CreateComposition__Group_4__1__Impl"
    // InternalFeatureLangParser.g:3776:1: rule__CreateComposition__Group_4__1__Impl : ( It ) ;
    public final void rule__CreateComposition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3780:1: ( ( It ) )
            // InternalFeatureLangParser.g:3781:1: ( It )
            {
            // InternalFeatureLangParser.g:3781:1: ( It )
            // InternalFeatureLangParser.g:3782:2: It
            {
             before(grammarAccess.getCreateCompositionAccess().getItKeyword_4_1()); 
            match(input,It,FOLLOW_2); 
             after(grammarAccess.getCreateCompositionAccess().getItKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateComposition__Group_4__1__Impl"


    // $ANTLR start "rule__CreateComposition__Group_4__2"
    // InternalFeatureLangParser.g:3791:1: rule__CreateComposition__Group_4__2 : rule__CreateComposition__Group_4__2__Impl rule__CreateComposition__Group_4__3 ;
    public final void rule__CreateComposition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3795:1: ( rule__CreateComposition__Group_4__2__Impl rule__CreateComposition__Group_4__3 )
            // InternalFeatureLangParser.g:3796:2: rule__CreateComposition__Group_4__2__Impl rule__CreateComposition__Group_4__3
            {
            pushFollow(FOLLOW_36);
            rule__CreateComposition__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateComposition__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateComposition__Group_4__2"


    // $ANTLR start "rule__CreateComposition__Group_4__2__Impl"
    // InternalFeatureLangParser.g:3803:1: rule__CreateComposition__Group_4__2__Impl : ( ( rule__CreateComposition__PriorityAssignment_4_2 ) ) ;
    public final void rule__CreateComposition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3807:1: ( ( ( rule__CreateComposition__PriorityAssignment_4_2 ) ) )
            // InternalFeatureLangParser.g:3808:1: ( ( rule__CreateComposition__PriorityAssignment_4_2 ) )
            {
            // InternalFeatureLangParser.g:3808:1: ( ( rule__CreateComposition__PriorityAssignment_4_2 ) )
            // InternalFeatureLangParser.g:3809:2: ( rule__CreateComposition__PriorityAssignment_4_2 )
            {
             before(grammarAccess.getCreateCompositionAccess().getPriorityAssignment_4_2()); 
            // InternalFeatureLangParser.g:3810:2: ( rule__CreateComposition__PriorityAssignment_4_2 )
            // InternalFeatureLangParser.g:3810:3: rule__CreateComposition__PriorityAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__CreateComposition__PriorityAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getCreateCompositionAccess().getPriorityAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateComposition__Group_4__2__Impl"


    // $ANTLR start "rule__CreateComposition__Group_4__3"
    // InternalFeatureLangParser.g:3818:1: rule__CreateComposition__Group_4__3 : rule__CreateComposition__Group_4__3__Impl rule__CreateComposition__Group_4__4 ;
    public final void rule__CreateComposition__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3822:1: ( rule__CreateComposition__Group_4__3__Impl rule__CreateComposition__Group_4__4 )
            // InternalFeatureLangParser.g:3823:2: rule__CreateComposition__Group_4__3__Impl rule__CreateComposition__Group_4__4
            {
            pushFollow(FOLLOW_37);
            rule__CreateComposition__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateComposition__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateComposition__Group_4__3"


    // $ANTLR start "rule__CreateComposition__Group_4__3__Impl"
    // InternalFeatureLangParser.g:3830:1: rule__CreateComposition__Group_4__3__Impl : ( Be ) ;
    public final void rule__CreateComposition__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3834:1: ( ( Be ) )
            // InternalFeatureLangParser.g:3835:1: ( Be )
            {
            // InternalFeatureLangParser.g:3835:1: ( Be )
            // InternalFeatureLangParser.g:3836:2: Be
            {
             before(grammarAccess.getCreateCompositionAccess().getBeKeyword_4_3()); 
            match(input,Be,FOLLOW_2); 
             after(grammarAccess.getCreateCompositionAccess().getBeKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateComposition__Group_4__3__Impl"


    // $ANTLR start "rule__CreateComposition__Group_4__4"
    // InternalFeatureLangParser.g:3845:1: rule__CreateComposition__Group_4__4 : rule__CreateComposition__Group_4__4__Impl ;
    public final void rule__CreateComposition__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3849:1: ( rule__CreateComposition__Group_4__4__Impl )
            // InternalFeatureLangParser.g:3850:2: rule__CreateComposition__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CreateComposition__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateComposition__Group_4__4"


    // $ANTLR start "rule__CreateComposition__Group_4__4__Impl"
    // InternalFeatureLangParser.g:3856:1: rule__CreateComposition__Group_4__4__Impl : ( ( rule__CreateComposition__PublicityAssignment_4_4 ) ) ;
    public final void rule__CreateComposition__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3860:1: ( ( ( rule__CreateComposition__PublicityAssignment_4_4 ) ) )
            // InternalFeatureLangParser.g:3861:1: ( ( rule__CreateComposition__PublicityAssignment_4_4 ) )
            {
            // InternalFeatureLangParser.g:3861:1: ( ( rule__CreateComposition__PublicityAssignment_4_4 ) )
            // InternalFeatureLangParser.g:3862:2: ( rule__CreateComposition__PublicityAssignment_4_4 )
            {
             before(grammarAccess.getCreateCompositionAccess().getPublicityAssignment_4_4()); 
            // InternalFeatureLangParser.g:3863:2: ( rule__CreateComposition__PublicityAssignment_4_4 )
            // InternalFeatureLangParser.g:3863:3: rule__CreateComposition__PublicityAssignment_4_4
            {
            pushFollow(FOLLOW_2);
            rule__CreateComposition__PublicityAssignment_4_4();

            state._fsp--;


            }

             after(grammarAccess.getCreateCompositionAccess().getPublicityAssignment_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateComposition__Group_4__4__Impl"


    // $ANTLR start "rule__EditComposition__Group__0"
    // InternalFeatureLangParser.g:3872:1: rule__EditComposition__Group__0 : rule__EditComposition__Group__0__Impl rule__EditComposition__Group__1 ;
    public final void rule__EditComposition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3876:1: ( rule__EditComposition__Group__0__Impl rule__EditComposition__Group__1 )
            // InternalFeatureLangParser.g:3877:2: rule__EditComposition__Group__0__Impl rule__EditComposition__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__EditComposition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EditComposition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditComposition__Group__0"


    // $ANTLR start "rule__EditComposition__Group__0__Impl"
    // InternalFeatureLangParser.g:3884:1: rule__EditComposition__Group__0__Impl : ( Have ) ;
    public final void rule__EditComposition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3888:1: ( ( Have ) )
            // InternalFeatureLangParser.g:3889:1: ( Have )
            {
            // InternalFeatureLangParser.g:3889:1: ( Have )
            // InternalFeatureLangParser.g:3890:2: Have
            {
             before(grammarAccess.getEditCompositionAccess().getHaveKeyword_0()); 
            match(input,Have,FOLLOW_2); 
             after(grammarAccess.getEditCompositionAccess().getHaveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditComposition__Group__0__Impl"


    // $ANTLR start "rule__EditComposition__Group__1"
    // InternalFeatureLangParser.g:3899:1: rule__EditComposition__Group__1 : rule__EditComposition__Group__1__Impl rule__EditComposition__Group__2 ;
    public final void rule__EditComposition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3903:1: ( rule__EditComposition__Group__1__Impl rule__EditComposition__Group__2 )
            // InternalFeatureLangParser.g:3904:2: rule__EditComposition__Group__1__Impl rule__EditComposition__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__EditComposition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EditComposition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditComposition__Group__1"


    // $ANTLR start "rule__EditComposition__Group__1__Impl"
    // InternalFeatureLangParser.g:3911:1: rule__EditComposition__Group__1__Impl : ( Composition ) ;
    public final void rule__EditComposition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3915:1: ( ( Composition ) )
            // InternalFeatureLangParser.g:3916:1: ( Composition )
            {
            // InternalFeatureLangParser.g:3916:1: ( Composition )
            // InternalFeatureLangParser.g:3917:2: Composition
            {
             before(grammarAccess.getEditCompositionAccess().getCompositionKeyword_1()); 
            match(input,Composition,FOLLOW_2); 
             after(grammarAccess.getEditCompositionAccess().getCompositionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditComposition__Group__1__Impl"


    // $ANTLR start "rule__EditComposition__Group__2"
    // InternalFeatureLangParser.g:3926:1: rule__EditComposition__Group__2 : rule__EditComposition__Group__2__Impl rule__EditComposition__Group__3 ;
    public final void rule__EditComposition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3930:1: ( rule__EditComposition__Group__2__Impl rule__EditComposition__Group__3 )
            // InternalFeatureLangParser.g:3931:2: rule__EditComposition__Group__2__Impl rule__EditComposition__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__EditComposition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EditComposition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditComposition__Group__2"


    // $ANTLR start "rule__EditComposition__Group__2__Impl"
    // InternalFeatureLangParser.g:3938:1: rule__EditComposition__Group__2__Impl : ( ( rule__EditComposition__CompositionNameAssignment_2 ) ) ;
    public final void rule__EditComposition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3942:1: ( ( ( rule__EditComposition__CompositionNameAssignment_2 ) ) )
            // InternalFeatureLangParser.g:3943:1: ( ( rule__EditComposition__CompositionNameAssignment_2 ) )
            {
            // InternalFeatureLangParser.g:3943:1: ( ( rule__EditComposition__CompositionNameAssignment_2 ) )
            // InternalFeatureLangParser.g:3944:2: ( rule__EditComposition__CompositionNameAssignment_2 )
            {
             before(grammarAccess.getEditCompositionAccess().getCompositionNameAssignment_2()); 
            // InternalFeatureLangParser.g:3945:2: ( rule__EditComposition__CompositionNameAssignment_2 )
            // InternalFeatureLangParser.g:3945:3: rule__EditComposition__CompositionNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EditComposition__CompositionNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEditCompositionAccess().getCompositionNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditComposition__Group__2__Impl"


    // $ANTLR start "rule__EditComposition__Group__3"
    // InternalFeatureLangParser.g:3953:1: rule__EditComposition__Group__3 : rule__EditComposition__Group__3__Impl rule__EditComposition__Group__4 ;
    public final void rule__EditComposition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3957:1: ( rule__EditComposition__Group__3__Impl rule__EditComposition__Group__4 )
            // InternalFeatureLangParser.g:3958:2: rule__EditComposition__Group__3__Impl rule__EditComposition__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__EditComposition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EditComposition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditComposition__Group__3"


    // $ANTLR start "rule__EditComposition__Group__3__Impl"
    // InternalFeatureLangParser.g:3965:1: rule__EditComposition__Group__3__Impl : ( That ) ;
    public final void rule__EditComposition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3969:1: ( ( That ) )
            // InternalFeatureLangParser.g:3970:1: ( That )
            {
            // InternalFeatureLangParser.g:3970:1: ( That )
            // InternalFeatureLangParser.g:3971:2: That
            {
             before(grammarAccess.getEditCompositionAccess().getThatKeyword_3()); 
            match(input,That,FOLLOW_2); 
             after(grammarAccess.getEditCompositionAccess().getThatKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditComposition__Group__3__Impl"


    // $ANTLR start "rule__EditComposition__Group__4"
    // InternalFeatureLangParser.g:3980:1: rule__EditComposition__Group__4 : rule__EditComposition__Group__4__Impl rule__EditComposition__Group__5 ;
    public final void rule__EditComposition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3984:1: ( rule__EditComposition__Group__4__Impl rule__EditComposition__Group__5 )
            // InternalFeatureLangParser.g:3985:2: rule__EditComposition__Group__4__Impl rule__EditComposition__Group__5
            {
            pushFollow(FOLLOW_37);
            rule__EditComposition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EditComposition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditComposition__Group__4"


    // $ANTLR start "rule__EditComposition__Group__4__Impl"
    // InternalFeatureLangParser.g:3992:1: rule__EditComposition__Group__4__Impl : ( Is ) ;
    public final void rule__EditComposition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3996:1: ( ( Is ) )
            // InternalFeatureLangParser.g:3997:1: ( Is )
            {
            // InternalFeatureLangParser.g:3997:1: ( Is )
            // InternalFeatureLangParser.g:3998:2: Is
            {
             before(grammarAccess.getEditCompositionAccess().getIsKeyword_4()); 
            match(input,Is,FOLLOW_2); 
             after(grammarAccess.getEditCompositionAccess().getIsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditComposition__Group__4__Impl"


    // $ANTLR start "rule__EditComposition__Group__5"
    // InternalFeatureLangParser.g:4007:1: rule__EditComposition__Group__5 : rule__EditComposition__Group__5__Impl ;
    public final void rule__EditComposition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4011:1: ( rule__EditComposition__Group__5__Impl )
            // InternalFeatureLangParser.g:4012:2: rule__EditComposition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EditComposition__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditComposition__Group__5"


    // $ANTLR start "rule__EditComposition__Group__5__Impl"
    // InternalFeatureLangParser.g:4018:1: rule__EditComposition__Group__5__Impl : ( ( rule__EditComposition__PublicityAssignment_5 ) ) ;
    public final void rule__EditComposition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4022:1: ( ( ( rule__EditComposition__PublicityAssignment_5 ) ) )
            // InternalFeatureLangParser.g:4023:1: ( ( rule__EditComposition__PublicityAssignment_5 ) )
            {
            // InternalFeatureLangParser.g:4023:1: ( ( rule__EditComposition__PublicityAssignment_5 ) )
            // InternalFeatureLangParser.g:4024:2: ( rule__EditComposition__PublicityAssignment_5 )
            {
             before(grammarAccess.getEditCompositionAccess().getPublicityAssignment_5()); 
            // InternalFeatureLangParser.g:4025:2: ( rule__EditComposition__PublicityAssignment_5 )
            // InternalFeatureLangParser.g:4025:3: rule__EditComposition__PublicityAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__EditComposition__PublicityAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEditCompositionAccess().getPublicityAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditComposition__Group__5__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // InternalFeatureLangParser.g:4034:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4038:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalFeatureLangParser.g:4039:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0"


    // $ANTLR start "rule__Class__Group__0__Impl"
    // InternalFeatureLangParser.g:4046:1: rule__Class__Group__0__Impl : ( ( rule__Class__Alternatives_0 )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4050:1: ( ( ( rule__Class__Alternatives_0 )? ) )
            // InternalFeatureLangParser.g:4051:1: ( ( rule__Class__Alternatives_0 )? )
            {
            // InternalFeatureLangParser.g:4051:1: ( ( rule__Class__Alternatives_0 )? )
            // InternalFeatureLangParser.g:4052:2: ( rule__Class__Alternatives_0 )?
            {
             before(grammarAccess.getClassAccess().getAlternatives_0()); 
            // InternalFeatureLangParser.g:4053:2: ( rule__Class__Alternatives_0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==The||LA31_0==A) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalFeatureLangParser.g:4053:3: rule__Class__Alternatives_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Alternatives_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // InternalFeatureLangParser.g:4061:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4065:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalFeatureLangParser.g:4066:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__Class__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1"


    // $ANTLR start "rule__Class__Group__1__Impl"
    // InternalFeatureLangParser.g:4073:1: rule__Class__Group__1__Impl : ( ( rule__Class__AbstractAssignment_1 )? ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4077:1: ( ( ( rule__Class__AbstractAssignment_1 )? ) )
            // InternalFeatureLangParser.g:4078:1: ( ( rule__Class__AbstractAssignment_1 )? )
            {
            // InternalFeatureLangParser.g:4078:1: ( ( rule__Class__AbstractAssignment_1 )? )
            // InternalFeatureLangParser.g:4079:2: ( rule__Class__AbstractAssignment_1 )?
            {
             before(grammarAccess.getClassAccess().getAbstractAssignment_1()); 
            // InternalFeatureLangParser.g:4080:2: ( rule__Class__AbstractAssignment_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Abstract) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalFeatureLangParser.g:4080:3: rule__Class__AbstractAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__AbstractAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getAbstractAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__2"
    // InternalFeatureLangParser.g:4088:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4092:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalFeatureLangParser.g:4093:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__Class__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2"


    // $ANTLR start "rule__Class__Group__2__Impl"
    // InternalFeatureLangParser.g:4100:1: rule__Class__Group__2__Impl : ( ( Class )? ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4104:1: ( ( ( Class )? ) )
            // InternalFeatureLangParser.g:4105:1: ( ( Class )? )
            {
            // InternalFeatureLangParser.g:4105:1: ( ( Class )? )
            // InternalFeatureLangParser.g:4106:2: ( Class )?
            {
             before(grammarAccess.getClassAccess().getClassKeyword_2()); 
            // InternalFeatureLangParser.g:4107:2: ( Class )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Class) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalFeatureLangParser.g:4107:3: Class
                    {
                    match(input,Class,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getClassKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2__Impl"


    // $ANTLR start "rule__Class__Group__3"
    // InternalFeatureLangParser.g:4115:1: rule__Class__Group__3 : rule__Class__Group__3__Impl ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4119:1: ( rule__Class__Group__3__Impl )
            // InternalFeatureLangParser.g:4120:2: rule__Class__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3"


    // $ANTLR start "rule__Class__Group__3__Impl"
    // InternalFeatureLangParser.g:4126:1: rule__Class__Group__3__Impl : ( ( rule__Class__NameAssignment_3 ) ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4130:1: ( ( ( rule__Class__NameAssignment_3 ) ) )
            // InternalFeatureLangParser.g:4131:1: ( ( rule__Class__NameAssignment_3 ) )
            {
            // InternalFeatureLangParser.g:4131:1: ( ( rule__Class__NameAssignment_3 ) )
            // InternalFeatureLangParser.g:4132:2: ( rule__Class__NameAssignment_3 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_3()); 
            // InternalFeatureLangParser.g:4133:2: ( rule__Class__NameAssignment_3 )
            // InternalFeatureLangParser.g:4133:3: rule__Class__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Class__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalFeatureLangParser.g:4142:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4146:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalFeatureLangParser.g:4147:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalFeatureLangParser.g:4154:1: rule__Attribute__Group__0__Impl : ( ( Attribute )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4158:1: ( ( ( Attribute )? ) )
            // InternalFeatureLangParser.g:4159:1: ( ( Attribute )? )
            {
            // InternalFeatureLangParser.g:4159:1: ( ( Attribute )? )
            // InternalFeatureLangParser.g:4160:2: ( Attribute )?
            {
             before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
            // InternalFeatureLangParser.g:4161:2: ( Attribute )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==Attribute) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalFeatureLangParser.g:4161:3: Attribute
                    {
                    match(input,Attribute,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalFeatureLangParser.g:4169:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4173:1: ( rule__Attribute__Group__1__Impl )
            // InternalFeatureLangParser.g:4174:2: rule__Attribute__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalFeatureLangParser.g:4180:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4184:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalFeatureLangParser.g:4185:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalFeatureLangParser.g:4185:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalFeatureLangParser.g:4186:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalFeatureLangParser.g:4187:2: ( rule__Attribute__NameAssignment_1 )
            // InternalFeatureLangParser.g:4187:3: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Identifier__Group__0"
    // InternalFeatureLangParser.g:4196:1: rule__Identifier__Group__0 : rule__Identifier__Group__0__Impl rule__Identifier__Group__1 ;
    public final void rule__Identifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4200:1: ( rule__Identifier__Group__0__Impl rule__Identifier__Group__1 )
            // InternalFeatureLangParser.g:4201:2: rule__Identifier__Group__0__Impl rule__Identifier__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Identifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Identifier__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group__0"


    // $ANTLR start "rule__Identifier__Group__0__Impl"
    // InternalFeatureLangParser.g:4208:1: rule__Identifier__Group__0__Impl : ( ( rule__Identifier__ValueAssignment_0 ) ) ;
    public final void rule__Identifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4212:1: ( ( ( rule__Identifier__ValueAssignment_0 ) ) )
            // InternalFeatureLangParser.g:4213:1: ( ( rule__Identifier__ValueAssignment_0 ) )
            {
            // InternalFeatureLangParser.g:4213:1: ( ( rule__Identifier__ValueAssignment_0 ) )
            // InternalFeatureLangParser.g:4214:2: ( rule__Identifier__ValueAssignment_0 )
            {
             before(grammarAccess.getIdentifierAccess().getValueAssignment_0()); 
            // InternalFeatureLangParser.g:4215:2: ( rule__Identifier__ValueAssignment_0 )
            // InternalFeatureLangParser.g:4215:3: rule__Identifier__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Identifier__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIdentifierAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group__0__Impl"


    // $ANTLR start "rule__Identifier__Group__1"
    // InternalFeatureLangParser.g:4223:1: rule__Identifier__Group__1 : rule__Identifier__Group__1__Impl ;
    public final void rule__Identifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4227:1: ( rule__Identifier__Group__1__Impl )
            // InternalFeatureLangParser.g:4228:2: rule__Identifier__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Identifier__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group__1"


    // $ANTLR start "rule__Identifier__Group__1__Impl"
    // InternalFeatureLangParser.g:4234:1: rule__Identifier__Group__1__Impl : ( ( rule__Identifier__NameAssignment_1 ) ) ;
    public final void rule__Identifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4238:1: ( ( ( rule__Identifier__NameAssignment_1 ) ) )
            // InternalFeatureLangParser.g:4239:1: ( ( rule__Identifier__NameAssignment_1 ) )
            {
            // InternalFeatureLangParser.g:4239:1: ( ( rule__Identifier__NameAssignment_1 ) )
            // InternalFeatureLangParser.g:4240:2: ( rule__Identifier__NameAssignment_1 )
            {
             before(grammarAccess.getIdentifierAccess().getNameAssignment_1()); 
            // InternalFeatureLangParser.g:4241:2: ( rule__Identifier__NameAssignment_1 )
            // InternalFeatureLangParser.g:4241:3: rule__Identifier__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Identifier__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIdentifierAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group__1__Impl"


    // $ANTLR start "rule__FeatureRequest__StatementsAssignment"
    // InternalFeatureLangParser.g:4250:1: rule__FeatureRequest__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__FeatureRequest__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4254:1: ( ( ruleStatement ) )
            // InternalFeatureLangParser.g:4255:2: ( ruleStatement )
            {
            // InternalFeatureLangParser.g:4255:2: ( ruleStatement )
            // InternalFeatureLangParser.g:4256:3: ruleStatement
            {
             before(grammarAccess.getFeatureRequestAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getFeatureRequestAccess().getStatementsStatementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureRequest__StatementsAssignment"


    // $ANTLR start "rule__ChangeStatement__TargetAssignment_0"
    // InternalFeatureLangParser.g:4265:1: rule__ChangeStatement__TargetAssignment_0 : ( ruleClass ) ;
    public final void rule__ChangeStatement__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4269:1: ( ( ruleClass ) )
            // InternalFeatureLangParser.g:4270:2: ( ruleClass )
            {
            // InternalFeatureLangParser.g:4270:2: ( ruleClass )
            // InternalFeatureLangParser.g:4271:3: ruleClass
            {
             before(grammarAccess.getChangeStatementAccess().getTargetClassParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getChangeStatementAccess().getTargetClassParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeStatement__TargetAssignment_0"


    // $ANTLR start "rule__ChangeStatement__PriorityAssignment_1_0_0"
    // InternalFeatureLangParser.g:4280:1: rule__ChangeStatement__PriorityAssignment_1_0_0 : ( rulePriority ) ;
    public final void rule__ChangeStatement__PriorityAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4284:1: ( ( rulePriority ) )
            // InternalFeatureLangParser.g:4285:2: ( rulePriority )
            {
            // InternalFeatureLangParser.g:4285:2: ( rulePriority )
            // InternalFeatureLangParser.g:4286:3: rulePriority
            {
             before(grammarAccess.getChangeStatementAccess().getPriorityPriorityParserRuleCall_1_0_0_0()); 
            pushFollow(FOLLOW_2);
            rulePriority();

            state._fsp--;

             after(grammarAccess.getChangeStatementAccess().getPriorityPriorityParserRuleCall_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeStatement__PriorityAssignment_1_0_0"


    // $ANTLR start "rule__ChangeStatement__NegationAssignment_1_0_1"
    // InternalFeatureLangParser.g:4295:1: rule__ChangeStatement__NegationAssignment_1_0_1 : ( ( Not ) ) ;
    public final void rule__ChangeStatement__NegationAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4299:1: ( ( ( Not ) ) )
            // InternalFeatureLangParser.g:4300:2: ( ( Not ) )
            {
            // InternalFeatureLangParser.g:4300:2: ( ( Not ) )
            // InternalFeatureLangParser.g:4301:3: ( Not )
            {
             before(grammarAccess.getChangeStatementAccess().getNegationNotKeyword_1_0_1_0()); 
            // InternalFeatureLangParser.g:4302:3: ( Not )
            // InternalFeatureLangParser.g:4303:4: Not
            {
             before(grammarAccess.getChangeStatementAccess().getNegationNotKeyword_1_0_1_0()); 
            match(input,Not,FOLLOW_2); 
             after(grammarAccess.getChangeStatementAccess().getNegationNotKeyword_1_0_1_0()); 

            }

             after(grammarAccess.getChangeStatementAccess().getNegationNotKeyword_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeStatement__NegationAssignment_1_0_1"


    // $ANTLR start "rule__ChangeStatement__ActionAssignment_1_0_2_0"
    // InternalFeatureLangParser.g:4314:1: rule__ChangeStatement__ActionAssignment_1_0_2_0 : ( ruleAction ) ;
    public final void rule__ChangeStatement__ActionAssignment_1_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4318:1: ( ( ruleAction ) )
            // InternalFeatureLangParser.g:4319:2: ( ruleAction )
            {
            // InternalFeatureLangParser.g:4319:2: ( ruleAction )
            // InternalFeatureLangParser.g:4320:3: ruleAction
            {
             before(grammarAccess.getChangeStatementAccess().getActionActionParserRuleCall_1_0_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getChangeStatementAccess().getActionActionParserRuleCall_1_0_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeStatement__ActionAssignment_1_0_2_0"


    // $ANTLR start "rule__ChangeStatement__IdentifierAssignment_1_0_2_1_2"
    // InternalFeatureLangParser.g:4329:1: rule__ChangeStatement__IdentifierAssignment_1_0_2_1_2 : ( ruleIdentifier ) ;
    public final void rule__ChangeStatement__IdentifierAssignment_1_0_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4333:1: ( ( ruleIdentifier ) )
            // InternalFeatureLangParser.g:4334:2: ( ruleIdentifier )
            {
            // InternalFeatureLangParser.g:4334:2: ( ruleIdentifier )
            // InternalFeatureLangParser.g:4335:3: ruleIdentifier
            {
             before(grammarAccess.getChangeStatementAccess().getIdentifierIdentifierParserRuleCall_1_0_2_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getChangeStatementAccess().getIdentifierIdentifierParserRuleCall_1_0_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeStatement__IdentifierAssignment_1_0_2_1_2"


    // $ANTLR start "rule__ChangeStatement__UpdateAssignment_1_1"
    // InternalFeatureLangParser.g:4344:1: rule__ChangeStatement__UpdateAssignment_1_1 : ( ruleUpdateAction ) ;
    public final void rule__ChangeStatement__UpdateAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4348:1: ( ( ruleUpdateAction ) )
            // InternalFeatureLangParser.g:4349:2: ( ruleUpdateAction )
            {
            // InternalFeatureLangParser.g:4349:2: ( ruleUpdateAction )
            // InternalFeatureLangParser.g:4350:3: ruleUpdateAction
            {
             before(grammarAccess.getChangeStatementAccess().getUpdateUpdateActionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUpdateAction();

            state._fsp--;

             after(grammarAccess.getChangeStatementAccess().getUpdateUpdateActionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeStatement__UpdateAssignment_1_1"


    // $ANTLR start "rule__CreationStatement__ClassElementAssignment_0"
    // InternalFeatureLangParser.g:4359:1: rule__CreationStatement__ClassElementAssignment_0 : ( ruleClass ) ;
    public final void rule__CreationStatement__ClassElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4363:1: ( ( ruleClass ) )
            // InternalFeatureLangParser.g:4364:2: ( ruleClass )
            {
            // InternalFeatureLangParser.g:4364:2: ( ruleClass )
            // InternalFeatureLangParser.g:4365:3: ruleClass
            {
             before(grammarAccess.getCreationStatementAccess().getClassElementClassParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getCreationStatementAccess().getClassElementClassParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreationStatement__ClassElementAssignment_0"


    // $ANTLR start "rule__CreationStatement__PriorityAssignment_1"
    // InternalFeatureLangParser.g:4374:1: rule__CreationStatement__PriorityAssignment_1 : ( rulePriority ) ;
    public final void rule__CreationStatement__PriorityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4378:1: ( ( rulePriority ) )
            // InternalFeatureLangParser.g:4379:2: ( rulePriority )
            {
            // InternalFeatureLangParser.g:4379:2: ( rulePriority )
            // InternalFeatureLangParser.g:4380:3: rulePriority
            {
             before(grammarAccess.getCreationStatementAccess().getPriorityPriorityParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePriority();

            state._fsp--;

             after(grammarAccess.getCreationStatementAccess().getPriorityPriorityParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreationStatement__PriorityAssignment_1"


    // $ANTLR start "rule__CreationStatement__NegationAssignment_2"
    // InternalFeatureLangParser.g:4389:1: rule__CreationStatement__NegationAssignment_2 : ( ( Not ) ) ;
    public final void rule__CreationStatement__NegationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4393:1: ( ( ( Not ) ) )
            // InternalFeatureLangParser.g:4394:2: ( ( Not ) )
            {
            // InternalFeatureLangParser.g:4394:2: ( ( Not ) )
            // InternalFeatureLangParser.g:4395:3: ( Not )
            {
             before(grammarAccess.getCreationStatementAccess().getNegationNotKeyword_2_0()); 
            // InternalFeatureLangParser.g:4396:3: ( Not )
            // InternalFeatureLangParser.g:4397:4: Not
            {
             before(grammarAccess.getCreationStatementAccess().getNegationNotKeyword_2_0()); 
            match(input,Not,FOLLOW_2); 
             after(grammarAccess.getCreationStatementAccess().getNegationNotKeyword_2_0()); 

            }

             after(grammarAccess.getCreationStatementAccess().getNegationNotKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreationStatement__NegationAssignment_2"


    // $ANTLR start "rule__Action__TypeAssignment"
    // InternalFeatureLangParser.g:4408:1: rule__Action__TypeAssignment : ( ( rule__Action__TypeAlternatives_0 ) ) ;
    public final void rule__Action__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4412:1: ( ( ( rule__Action__TypeAlternatives_0 ) ) )
            // InternalFeatureLangParser.g:4413:2: ( ( rule__Action__TypeAlternatives_0 ) )
            {
            // InternalFeatureLangParser.g:4413:2: ( ( rule__Action__TypeAlternatives_0 ) )
            // InternalFeatureLangParser.g:4414:3: ( rule__Action__TypeAlternatives_0 )
            {
             before(grammarAccess.getActionAccess().getTypeAlternatives_0()); 
            // InternalFeatureLangParser.g:4415:3: ( rule__Action__TypeAlternatives_0 )
            // InternalFeatureLangParser.g:4415:4: rule__Action__TypeAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Action__TypeAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getTypeAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__TypeAssignment"


    // $ANTLR start "rule__UpdateAction__AttributeAssignment_3"
    // InternalFeatureLangParser.g:4423:1: rule__UpdateAction__AttributeAssignment_3 : ( ruleAttribute ) ;
    public final void rule__UpdateAction__AttributeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4427:1: ( ( ruleAttribute ) )
            // InternalFeatureLangParser.g:4428:2: ( ruleAttribute )
            {
            // InternalFeatureLangParser.g:4428:2: ( ruleAttribute )
            // InternalFeatureLangParser.g:4429:3: ruleAttribute
            {
             before(grammarAccess.getUpdateActionAccess().getAttributeAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getUpdateActionAccess().getAttributeAttributeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAction__AttributeAssignment_3"


    // $ANTLR start "rule__UpdateAction__PriorityAssignment_6"
    // InternalFeatureLangParser.g:4438:1: rule__UpdateAction__PriorityAssignment_6 : ( rulePriority ) ;
    public final void rule__UpdateAction__PriorityAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4442:1: ( ( rulePriority ) )
            // InternalFeatureLangParser.g:4443:2: ( rulePriority )
            {
            // InternalFeatureLangParser.g:4443:2: ( rulePriority )
            // InternalFeatureLangParser.g:4444:3: rulePriority
            {
             before(grammarAccess.getUpdateActionAccess().getPriorityPriorityParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePriority();

            state._fsp--;

             after(grammarAccess.getUpdateActionAccess().getPriorityPriorityParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAction__PriorityAssignment_6"


    // $ANTLR start "rule__UpdateAction__DatatypeAssignment_7_0"
    // InternalFeatureLangParser.g:4453:1: rule__UpdateAction__DatatypeAssignment_7_0 : ( ruleUpdateAttributeDatatype ) ;
    public final void rule__UpdateAction__DatatypeAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4457:1: ( ( ruleUpdateAttributeDatatype ) )
            // InternalFeatureLangParser.g:4458:2: ( ruleUpdateAttributeDatatype )
            {
            // InternalFeatureLangParser.g:4458:2: ( ruleUpdateAttributeDatatype )
            // InternalFeatureLangParser.g:4459:3: ruleUpdateAttributeDatatype
            {
             before(grammarAccess.getUpdateActionAccess().getDatatypeUpdateAttributeDatatypeParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUpdateAttributeDatatype();

            state._fsp--;

             after(grammarAccess.getUpdateActionAccess().getDatatypeUpdateAttributeDatatypeParserRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAction__DatatypeAssignment_7_0"


    // $ANTLR start "rule__UpdateAction__IdentifierAssignment_7_1"
    // InternalFeatureLangParser.g:4468:1: rule__UpdateAction__IdentifierAssignment_7_1 : ( ruleUpdateAttributeIdentifier ) ;
    public final void rule__UpdateAction__IdentifierAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4472:1: ( ( ruleUpdateAttributeIdentifier ) )
            // InternalFeatureLangParser.g:4473:2: ( ruleUpdateAttributeIdentifier )
            {
            // InternalFeatureLangParser.g:4473:2: ( ruleUpdateAttributeIdentifier )
            // InternalFeatureLangParser.g:4474:3: ruleUpdateAttributeIdentifier
            {
             before(grammarAccess.getUpdateActionAccess().getIdentifierUpdateAttributeIdentifierParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUpdateAttributeIdentifier();

            state._fsp--;

             after(grammarAccess.getUpdateActionAccess().getIdentifierUpdateAttributeIdentifierParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAction__IdentifierAssignment_7_1"


    // $ANTLR start "rule__UpdateAction__ValueAssignment_7_2"
    // InternalFeatureLangParser.g:4483:1: rule__UpdateAction__ValueAssignment_7_2 : ( ruleUpdateAttributeValue ) ;
    public final void rule__UpdateAction__ValueAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4487:1: ( ( ruleUpdateAttributeValue ) )
            // InternalFeatureLangParser.g:4488:2: ( ruleUpdateAttributeValue )
            {
            // InternalFeatureLangParser.g:4488:2: ( ruleUpdateAttributeValue )
            // InternalFeatureLangParser.g:4489:3: ruleUpdateAttributeValue
            {
             before(grammarAccess.getUpdateActionAccess().getValueUpdateAttributeValueParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUpdateAttributeValue();

            state._fsp--;

             after(grammarAccess.getUpdateActionAccess().getValueUpdateAttributeValueParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAction__ValueAssignment_7_2"


    // $ANTLR start "rule__UpdateAttributeDatatype__TypeAssignment_2"
    // InternalFeatureLangParser.g:4498:1: rule__UpdateAttributeDatatype__TypeAssignment_2 : ( ruleDatatype ) ;
    public final void rule__UpdateAttributeDatatype__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4502:1: ( ( ruleDatatype ) )
            // InternalFeatureLangParser.g:4503:2: ( ruleDatatype )
            {
            // InternalFeatureLangParser.g:4503:2: ( ruleDatatype )
            // InternalFeatureLangParser.g:4504:3: ruleDatatype
            {
             before(grammarAccess.getUpdateAttributeDatatypeAccess().getTypeDatatypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDatatype();

            state._fsp--;

             after(grammarAccess.getUpdateAttributeDatatypeAccess().getTypeDatatypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAttributeDatatype__TypeAssignment_2"


    // $ANTLR start "rule__UpdateAttributeIdentifier__IdentifierAssignment_2"
    // InternalFeatureLangParser.g:4513:1: rule__UpdateAttributeIdentifier__IdentifierAssignment_2 : ( ruleIdentifier ) ;
    public final void rule__UpdateAttributeIdentifier__IdentifierAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4517:1: ( ( ruleIdentifier ) )
            // InternalFeatureLangParser.g:4518:2: ( ruleIdentifier )
            {
            // InternalFeatureLangParser.g:4518:2: ( ruleIdentifier )
            // InternalFeatureLangParser.g:4519:3: ruleIdentifier
            {
             before(grammarAccess.getUpdateAttributeIdentifierAccess().getIdentifierIdentifierParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getUpdateAttributeIdentifierAccess().getIdentifierIdentifierParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAttributeIdentifier__IdentifierAssignment_2"


    // $ANTLR start "rule__UpdateAttributeValue__ValueAssignment_3"
    // InternalFeatureLangParser.g:4528:1: rule__UpdateAttributeValue__ValueAssignment_3 : ( RULE_ID ) ;
    public final void rule__UpdateAttributeValue__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4532:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:4533:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:4533:2: ( RULE_ID )
            // InternalFeatureLangParser.g:4534:3: RULE_ID
            {
             before(grammarAccess.getUpdateAttributeValueAccess().getValueIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUpdateAttributeValueAccess().getValueIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAttributeValue__ValueAssignment_3"


    // $ANTLR start "rule__AttributeAction__AttributeAssignment_2"
    // InternalFeatureLangParser.g:4543:1: rule__AttributeAction__AttributeAssignment_2 : ( ruleAttribute ) ;
    public final void rule__AttributeAction__AttributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4547:1: ( ( ruleAttribute ) )
            // InternalFeatureLangParser.g:4548:2: ( ruleAttribute )
            {
            // InternalFeatureLangParser.g:4548:2: ( ruleAttribute )
            // InternalFeatureLangParser.g:4549:3: ruleAttribute
            {
             before(grammarAccess.getAttributeActionAccess().getAttributeAttributeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeActionAccess().getAttributeAttributeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAction__AttributeAssignment_2"


    // $ANTLR start "rule__AttributeAction__TypeAssignment_3_4"
    // InternalFeatureLangParser.g:4558:1: rule__AttributeAction__TypeAssignment_3_4 : ( ruleDatatype ) ;
    public final void rule__AttributeAction__TypeAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4562:1: ( ( ruleDatatype ) )
            // InternalFeatureLangParser.g:4563:2: ( ruleDatatype )
            {
            // InternalFeatureLangParser.g:4563:2: ( ruleDatatype )
            // InternalFeatureLangParser.g:4564:3: ruleDatatype
            {
             before(grammarAccess.getAttributeActionAccess().getTypeDatatypeEnumRuleCall_3_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDatatype();

            state._fsp--;

             after(grammarAccess.getAttributeActionAccess().getTypeDatatypeEnumRuleCall_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAction__TypeAssignment_3_4"


    // $ANTLR start "rule__AssociationAction__CreateAssignment_2_0"
    // InternalFeatureLangParser.g:4573:1: rule__AssociationAction__CreateAssignment_2_0 : ( ruleCreateAssociation ) ;
    public final void rule__AssociationAction__CreateAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4577:1: ( ( ruleCreateAssociation ) )
            // InternalFeatureLangParser.g:4578:2: ( ruleCreateAssociation )
            {
            // InternalFeatureLangParser.g:4578:2: ( ruleCreateAssociation )
            // InternalFeatureLangParser.g:4579:3: ruleCreateAssociation
            {
             before(grammarAccess.getAssociationActionAccess().getCreateCreateAssociationParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCreateAssociation();

            state._fsp--;

             after(grammarAccess.getAssociationActionAccess().getCreateCreateAssociationParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationAction__CreateAssignment_2_0"


    // $ANTLR start "rule__AssociationAction__NameAssignment_2_1_0"
    // InternalFeatureLangParser.g:4588:1: rule__AssociationAction__NameAssignment_2_1_0 : ( RULE_ID ) ;
    public final void rule__AssociationAction__NameAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4592:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:4593:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:4593:2: ( RULE_ID )
            // InternalFeatureLangParser.g:4594:3: RULE_ID
            {
             before(grammarAccess.getAssociationActionAccess().getNameIDTerminalRuleCall_2_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssociationActionAccess().getNameIDTerminalRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationAction__NameAssignment_2_1_0"


    // $ANTLR start "rule__AssociationAction__EditAssignment_2_1_1"
    // InternalFeatureLangParser.g:4603:1: rule__AssociationAction__EditAssignment_2_1_1 : ( ruleEditAssociation ) ;
    public final void rule__AssociationAction__EditAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4607:1: ( ( ruleEditAssociation ) )
            // InternalFeatureLangParser.g:4608:2: ( ruleEditAssociation )
            {
            // InternalFeatureLangParser.g:4608:2: ( ruleEditAssociation )
            // InternalFeatureLangParser.g:4609:3: ruleEditAssociation
            {
             before(grammarAccess.getAssociationActionAccess().getEditEditAssociationParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEditAssociation();

            state._fsp--;

             after(grammarAccess.getAssociationActionAccess().getEditEditAssociationParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationAction__EditAssignment_2_1_1"


    // $ANTLR start "rule__CreateAssociation__TargetAssignment_2"
    // InternalFeatureLangParser.g:4618:1: rule__CreateAssociation__TargetAssignment_2 : ( ruleClass ) ;
    public final void rule__CreateAssociation__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4622:1: ( ( ruleClass ) )
            // InternalFeatureLangParser.g:4623:2: ( ruleClass )
            {
            // InternalFeatureLangParser.g:4623:2: ( ruleClass )
            // InternalFeatureLangParser.g:4624:3: ruleClass
            {
             before(grammarAccess.getCreateAssociationAccess().getTargetClassParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getCreateAssociationAccess().getTargetClassParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateAssociation__TargetAssignment_2"


    // $ANTLR start "rule__CreateAssociation__RelationAssignment_4"
    // InternalFeatureLangParser.g:4633:1: rule__CreateAssociation__RelationAssignment_4 : ( RULE_ID ) ;
    public final void rule__CreateAssociation__RelationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4637:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:4638:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:4638:2: ( RULE_ID )
            // InternalFeatureLangParser.g:4639:3: RULE_ID
            {
             before(grammarAccess.getCreateAssociationAccess().getRelationIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCreateAssociationAccess().getRelationIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateAssociation__RelationAssignment_4"


    // $ANTLR start "rule__EditAssociation__TypeAssignment"
    // InternalFeatureLangParser.g:4648:1: rule__EditAssociation__TypeAssignment : ( ( rule__EditAssociation__TypeAlternatives_0 ) ) ;
    public final void rule__EditAssociation__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4652:1: ( ( ( rule__EditAssociation__TypeAlternatives_0 ) ) )
            // InternalFeatureLangParser.g:4653:2: ( ( rule__EditAssociation__TypeAlternatives_0 ) )
            {
            // InternalFeatureLangParser.g:4653:2: ( ( rule__EditAssociation__TypeAlternatives_0 ) )
            // InternalFeatureLangParser.g:4654:3: ( rule__EditAssociation__TypeAlternatives_0 )
            {
             before(grammarAccess.getEditAssociationAccess().getTypeAlternatives_0()); 
            // InternalFeatureLangParser.g:4655:3: ( rule__EditAssociation__TypeAlternatives_0 )
            // InternalFeatureLangParser.g:4655:4: rule__EditAssociation__TypeAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__EditAssociation__TypeAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getEditAssociationAccess().getTypeAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditAssociation__TypeAssignment"


    // $ANTLR start "rule__SetCompatible__NameAssignment_3"
    // InternalFeatureLangParser.g:4663:1: rule__SetCompatible__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__SetCompatible__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4667:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:4668:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:4668:2: ( RULE_ID )
            // InternalFeatureLangParser.g:4669:3: RULE_ID
            {
             before(grammarAccess.getSetCompatibleAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSetCompatibleAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetCompatible__NameAssignment_3"


    // $ANTLR start "rule__SetVersionRange__StartAssignment_4"
    // InternalFeatureLangParser.g:4678:1: rule__SetVersionRange__StartAssignment_4 : ( RULE_ID ) ;
    public final void rule__SetVersionRange__StartAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4682:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:4683:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:4683:2: ( RULE_ID )
            // InternalFeatureLangParser.g:4684:3: RULE_ID
            {
             before(grammarAccess.getSetVersionRangeAccess().getStartIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSetVersionRangeAccess().getStartIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetVersionRange__StartAssignment_4"


    // $ANTLR start "rule__SetVersionRange__EndAssignment_6"
    // InternalFeatureLangParser.g:4693:1: rule__SetVersionRange__EndAssignment_6 : ( RULE_ID ) ;
    public final void rule__SetVersionRange__EndAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4697:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:4698:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:4698:2: ( RULE_ID )
            // InternalFeatureLangParser.g:4699:3: RULE_ID
            {
             before(grammarAccess.getSetVersionRangeAccess().getEndIDTerminalRuleCall_6_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSetVersionRangeAccess().getEndIDTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetVersionRange__EndAssignment_6"


    // $ANTLR start "rule__SetVariant__NameAssignment_5"
    // InternalFeatureLangParser.g:4708:1: rule__SetVariant__NameAssignment_5 : ( RULE_ID ) ;
    public final void rule__SetVariant__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4712:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:4713:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:4713:2: ( RULE_ID )
            // InternalFeatureLangParser.g:4714:3: RULE_ID
            {
             before(grammarAccess.getSetVariantAccess().getNameIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSetVariantAccess().getNameIDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetVariant__NameAssignment_5"


    // $ANTLR start "rule__SetRightOpen__DateAssignment_3"
    // InternalFeatureLangParser.g:4723:1: rule__SetRightOpen__DateAssignment_3 : ( RULE_ID ) ;
    public final void rule__SetRightOpen__DateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4727:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:4728:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:4728:2: ( RULE_ID )
            // InternalFeatureLangParser.g:4729:3: RULE_ID
            {
             before(grammarAccess.getSetRightOpenAccess().getDateIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSetRightOpenAccess().getDateIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetRightOpen__DateAssignment_3"


    // $ANTLR start "rule__SetLeftOpen__DateAssignment_3"
    // InternalFeatureLangParser.g:4738:1: rule__SetLeftOpen__DateAssignment_3 : ( RULE_ID ) ;
    public final void rule__SetLeftOpen__DateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4742:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:4743:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:4743:2: ( RULE_ID )
            // InternalFeatureLangParser.g:4744:3: RULE_ID
            {
             before(grammarAccess.getSetLeftOpenAccess().getDateIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSetLeftOpenAccess().getDateIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetLeftOpen__DateAssignment_3"


    // $ANTLR start "rule__InheritanceAction__ParentAssignment_2"
    // InternalFeatureLangParser.g:4753:1: rule__InheritanceAction__ParentAssignment_2 : ( ruleClass ) ;
    public final void rule__InheritanceAction__ParentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4757:1: ( ( ruleClass ) )
            // InternalFeatureLangParser.g:4758:2: ( ruleClass )
            {
            // InternalFeatureLangParser.g:4758:2: ( ruleClass )
            // InternalFeatureLangParser.g:4759:3: ruleClass
            {
             before(grammarAccess.getInheritanceActionAccess().getParentClassParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getInheritanceActionAccess().getParentClassParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InheritanceAction__ParentAssignment_2"


    // $ANTLR start "rule__CompositionAction__CreateAssignment_0"
    // InternalFeatureLangParser.g:4768:1: rule__CompositionAction__CreateAssignment_0 : ( ruleCreateComposition ) ;
    public final void rule__CompositionAction__CreateAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4772:1: ( ( ruleCreateComposition ) )
            // InternalFeatureLangParser.g:4773:2: ( ruleCreateComposition )
            {
            // InternalFeatureLangParser.g:4773:2: ( ruleCreateComposition )
            // InternalFeatureLangParser.g:4774:3: ruleCreateComposition
            {
             before(grammarAccess.getCompositionActionAccess().getCreateCreateCompositionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCreateComposition();

            state._fsp--;

             after(grammarAccess.getCompositionActionAccess().getCreateCreateCompositionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionAction__CreateAssignment_0"


    // $ANTLR start "rule__CompositionAction__EditAssignment_1"
    // InternalFeatureLangParser.g:4783:1: rule__CompositionAction__EditAssignment_1 : ( ruleEditComposition ) ;
    public final void rule__CompositionAction__EditAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4787:1: ( ( ruleEditComposition ) )
            // InternalFeatureLangParser.g:4788:2: ( ruleEditComposition )
            {
            // InternalFeatureLangParser.g:4788:2: ( ruleEditComposition )
            // InternalFeatureLangParser.g:4789:3: ruleEditComposition
            {
             before(grammarAccess.getCompositionActionAccess().getEditEditCompositionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEditComposition();

            state._fsp--;

             after(grammarAccess.getCompositionActionAccess().getEditEditCompositionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionAction__EditAssignment_1"


    // $ANTLR start "rule__CreateComposition__TargetAssignment_1"
    // InternalFeatureLangParser.g:4798:1: rule__CreateComposition__TargetAssignment_1 : ( ruleClass ) ;
    public final void rule__CreateComposition__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4802:1: ( ( ruleClass ) )
            // InternalFeatureLangParser.g:4803:2: ( ruleClass )
            {
            // InternalFeatureLangParser.g:4803:2: ( ruleClass )
            // InternalFeatureLangParser.g:4804:3: ruleClass
            {
             before(grammarAccess.getCreateCompositionAccess().getTargetClassParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getCreateCompositionAccess().getTargetClassParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateComposition__TargetAssignment_1"


    // $ANTLR start "rule__CreateComposition__RelationAssignment_3"
    // InternalFeatureLangParser.g:4813:1: rule__CreateComposition__RelationAssignment_3 : ( RULE_ID ) ;
    public final void rule__CreateComposition__RelationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4817:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:4818:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:4818:2: ( RULE_ID )
            // InternalFeatureLangParser.g:4819:3: RULE_ID
            {
             before(grammarAccess.getCreateCompositionAccess().getRelationIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCreateCompositionAccess().getRelationIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateComposition__RelationAssignment_3"


    // $ANTLR start "rule__CreateComposition__PriorityAssignment_4_2"
    // InternalFeatureLangParser.g:4828:1: rule__CreateComposition__PriorityAssignment_4_2 : ( rulePriority ) ;
    public final void rule__CreateComposition__PriorityAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4832:1: ( ( rulePriority ) )
            // InternalFeatureLangParser.g:4833:2: ( rulePriority )
            {
            // InternalFeatureLangParser.g:4833:2: ( rulePriority )
            // InternalFeatureLangParser.g:4834:3: rulePriority
            {
             before(grammarAccess.getCreateCompositionAccess().getPriorityPriorityParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            rulePriority();

            state._fsp--;

             after(grammarAccess.getCreateCompositionAccess().getPriorityPriorityParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateComposition__PriorityAssignment_4_2"


    // $ANTLR start "rule__CreateComposition__PublicityAssignment_4_4"
    // InternalFeatureLangParser.g:4843:1: rule__CreateComposition__PublicityAssignment_4_4 : ( rulePublicity ) ;
    public final void rule__CreateComposition__PublicityAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4847:1: ( ( rulePublicity ) )
            // InternalFeatureLangParser.g:4848:2: ( rulePublicity )
            {
            // InternalFeatureLangParser.g:4848:2: ( rulePublicity )
            // InternalFeatureLangParser.g:4849:3: rulePublicity
            {
             before(grammarAccess.getCreateCompositionAccess().getPublicityPublicityEnumRuleCall_4_4_0()); 
            pushFollow(FOLLOW_2);
            rulePublicity();

            state._fsp--;

             after(grammarAccess.getCreateCompositionAccess().getPublicityPublicityEnumRuleCall_4_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateComposition__PublicityAssignment_4_4"


    // $ANTLR start "rule__EditComposition__CompositionNameAssignment_2"
    // InternalFeatureLangParser.g:4858:1: rule__EditComposition__CompositionNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EditComposition__CompositionNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4862:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:4863:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:4863:2: ( RULE_ID )
            // InternalFeatureLangParser.g:4864:3: RULE_ID
            {
             before(grammarAccess.getEditCompositionAccess().getCompositionNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEditCompositionAccess().getCompositionNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditComposition__CompositionNameAssignment_2"


    // $ANTLR start "rule__EditComposition__PublicityAssignment_5"
    // InternalFeatureLangParser.g:4873:1: rule__EditComposition__PublicityAssignment_5 : ( rulePublicity ) ;
    public final void rule__EditComposition__PublicityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4877:1: ( ( rulePublicity ) )
            // InternalFeatureLangParser.g:4878:2: ( rulePublicity )
            {
            // InternalFeatureLangParser.g:4878:2: ( rulePublicity )
            // InternalFeatureLangParser.g:4879:3: rulePublicity
            {
             before(grammarAccess.getEditCompositionAccess().getPublicityPublicityEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            rulePublicity();

            state._fsp--;

             after(grammarAccess.getEditCompositionAccess().getPublicityPublicityEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditComposition__PublicityAssignment_5"


    // $ANTLR start "rule__Class__AbstractAssignment_1"
    // InternalFeatureLangParser.g:4888:1: rule__Class__AbstractAssignment_1 : ( ruleAbstraction ) ;
    public final void rule__Class__AbstractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4892:1: ( ( ruleAbstraction ) )
            // InternalFeatureLangParser.g:4893:2: ( ruleAbstraction )
            {
            // InternalFeatureLangParser.g:4893:2: ( ruleAbstraction )
            // InternalFeatureLangParser.g:4894:3: ruleAbstraction
            {
             before(grammarAccess.getClassAccess().getAbstractAbstractionEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstraction();

            state._fsp--;

             after(grammarAccess.getClassAccess().getAbstractAbstractionEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__AbstractAssignment_1"


    // $ANTLR start "rule__Class__NameAssignment_3"
    // InternalFeatureLangParser.g:4903:1: rule__Class__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4907:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:4908:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:4908:2: ( RULE_ID )
            // InternalFeatureLangParser.g:4909:3: RULE_ID
            {
             before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__NameAssignment_3"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalFeatureLangParser.g:4918:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4922:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:4923:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:4923:2: ( RULE_ID )
            // InternalFeatureLangParser.g:4924:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Identifier__ValueAssignment_0"
    // InternalFeatureLangParser.g:4933:1: rule__Identifier__ValueAssignment_0 : ( ruleIdentifierValue ) ;
    public final void rule__Identifier__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4937:1: ( ( ruleIdentifierValue ) )
            // InternalFeatureLangParser.g:4938:2: ( ruleIdentifierValue )
            {
            // InternalFeatureLangParser.g:4938:2: ( ruleIdentifierValue )
            // InternalFeatureLangParser.g:4939:3: ruleIdentifierValue
            {
             before(grammarAccess.getIdentifierAccess().getValueIdentifierValueEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleIdentifierValue();

            state._fsp--;

             after(grammarAccess.getIdentifierAccess().getValueIdentifierValueEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__ValueAssignment_0"


    // $ANTLR start "rule__Identifier__NameAssignment_1"
    // InternalFeatureLangParser.g:4948:1: rule__Identifier__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Identifier__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4952:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:4953:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:4953:2: ( RULE_ID )
            // InternalFeatureLangParser.g:4954:3: RULE_ID
            {
             before(grammarAccess.getIdentifierAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIdentifierAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__NameAssignment_1"


    // $ANTLR start "rule__Priority__PriorityAssignment"
    // InternalFeatureLangParser.g:4963:1: rule__Priority__PriorityAssignment : ( rulePriorityValue ) ;
    public final void rule__Priority__PriorityAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4967:1: ( ( rulePriorityValue ) )
            // InternalFeatureLangParser.g:4968:2: ( rulePriorityValue )
            {
            // InternalFeatureLangParser.g:4968:2: ( rulePriorityValue )
            // InternalFeatureLangParser.g:4969:3: rulePriorityValue
            {
             before(grammarAccess.getPriorityAccess().getPriorityPriorityValueEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePriorityValue();

            state._fsp--;

             after(grammarAccess.getPriorityAccess().getPriorityPriorityValueEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Priority__PriorityAssignment"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\3\11\1\27\1\62\1\26\2\15\1\uffff\1\15\1\uffff";
    static final String dfa_3s = "\5\62\1\46\2\52\1\uffff\1\52\1\uffff";
    static final String dfa_4s = "\10\uffff\1\1\1\uffff\1\2";
    static final String dfa_5s = "\13\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\15\uffff\1\4\20\uffff\1\1\10\uffff\1\2\1\5",
            "\1\3\15\uffff\1\4\32\uffff\1\5",
            "\1\3\15\uffff\1\4\32\uffff\1\5",
            "\1\4\32\uffff\1\5",
            "\1\5",
            "\1\6\10\uffff\1\7\6\uffff\1\10",
            "\2\10\11\uffff\1\12\5\uffff\1\10\10\uffff\1\11\2\uffff\1\12",
            "\2\10\11\uffff\1\12\5\uffff\1\10\10\uffff\1\11\2\uffff\1\12",
            "",
            "\2\10\11\uffff\1\12\5\uffff\1\10\13\uffff\1\12",
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
            return "1022:1: rule__Statement__Alternatives_0 : ( ( ruleChangeStatement ) | ( ruleCreationStatement ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0006010000800202L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000004080400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000008040006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0002021100000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000080400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000048001000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0004000000000500L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000040040000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400180000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0002000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0002030000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0004400000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000800800000880L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0006010002800200L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0006010000800200L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000200000000L});

}