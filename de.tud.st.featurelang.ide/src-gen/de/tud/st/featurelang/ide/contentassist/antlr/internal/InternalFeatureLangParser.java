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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Associations", "Association", "Composition", "Inheritance", "Compatible", "Attribute", "Abstract", "Existing", "Starting", "Versions", "DEFAULT", "Compose", "Created", "Inherit", "Private", "Variant", "Version", "Called", "Change", "Create", "Delete", "Number", "Phrase", "Public", "Remove", "Should", "Class", "Exist", "Other", "Range", "Value", "Date", "From", "Have", "Must", "Name", "That", "Time", "With", "URI", "All", "Has", "New", "Not", "Set", "The", "An", "Be", "In", "Is", "It", "Of", "To", "Up", "CarriageReturn", "FullStop", "A", "RULE_INT", "RULE_DATE", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Delete=24;
    public static final int All=44;
    public static final int New=46;
    public static final int Inheritance=7;
    public static final int Remove=28;
    public static final int Must=38;
    public static final int Name=39;
    public static final int Compose=15;
    public static final int Version=20;
    public static final int Private=18;
    public static final int To=56;
    public static final int Inherit=17;
    public static final int RULE_ID=63;
    public static final int Have=37;
    public static final int Phrase=26;
    public static final int Public=27;
    public static final int Associations=4;
    public static final int Range=33;
    public static final int Variant=19;
    public static final int Not=47;
    public static final int Versions=13;
    public static final int RULE_DATE=62;
    public static final int RULE_INT=61;
    public static final int Starting=12;
    public static final int Value=34;
    public static final int RULE_ML_COMMENT=65;
    public static final int Class=30;
    public static final int Up=57;
    public static final int A=60;
    public static final int Called=21;
    public static final int Should=29;
    public static final int Set=48;
    public static final int Attribute=9;
    public static final int In=52;
    public static final int Time=41;
    public static final int Is=53;
    public static final int RULE_STRING=64;
    public static final int It=54;
    public static final int URI=43;
    public static final int An=50;
    public static final int Created=16;
    public static final int With=42;
    public static final int RULE_SL_COMMENT=66;
    public static final int The=49;
    public static final int Association=5;
    public static final int Exist=31;
    public static final int Number=25;
    public static final int Create=23;
    public static final int CarriageReturn=58;
    public static final int EOF=-1;
    public static final int That=40;
    public static final int FullStop=59;
    public static final int Composition=6;
    public static final int Be=51;
    public static final int RULE_WS=67;
    public static final int Abstract=10;
    public static final int Change=22;
    public static final int From=36;
    public static final int RULE_ANY_OTHER=68;
    public static final int Compatible=8;
    public static final int Date=35;
    public static final int Of=55;
    public static final int Has=45;
    public static final int DEFAULT=14;
    public static final int Existing=11;
    public static final int Other=32;

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
    		tokenNameToValue.put("CarriageReturn", "'\r'");
    		tokenNameToValue.put("FullStop", "'.'");
    		tokenNameToValue.put("A", "'a'");
    		tokenNameToValue.put("An", "'an'");
    		tokenNameToValue.put("Be", "'be'");
    		tokenNameToValue.put("In", "'in'");
    		tokenNameToValue.put("Is", "'is'");
    		tokenNameToValue.put("It", "'it'");
    		tokenNameToValue.put("Of", "'of'");
    		tokenNameToValue.put("To", "'to'");
    		tokenNameToValue.put("Up", "'up'");
    		tokenNameToValue.put("URI", "'URI'");
    		tokenNameToValue.put("All", "'all'");
    		tokenNameToValue.put("Has", "'has'");
    		tokenNameToValue.put("New", "'new'");
    		tokenNameToValue.put("Not", "'not'");
    		tokenNameToValue.put("Set", "'set'");
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
    		tokenNameToValue.put("Change", "'change'");
    		tokenNameToValue.put("Create", "'create'");
    		tokenNameToValue.put("Delete", "'delete'");
    		tokenNameToValue.put("Number", "'number'");
    		tokenNameToValue.put("Phrase", "'phrase'");
    		tokenNameToValue.put("Public", "'public'");
    		tokenNameToValue.put("Remove", "'remove'");
    		tokenNameToValue.put("Should", "'should'");
    		tokenNameToValue.put("DEFAULT", "'DEFAULT'");
    		tokenNameToValue.put("Compose", "'compose'");
    		tokenNameToValue.put("Created", "'created'");
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
    		tokenNameToValue.put("Inheritance", "'inheritance'");
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
    // InternalFeatureLangParser.g:112:1: entryRuleFeatureRequest : ruleFeatureRequest EOF ;
    public final void entryRuleFeatureRequest() throws RecognitionException {
        try {
            // InternalFeatureLangParser.g:113:1: ( ruleFeatureRequest EOF )
            // InternalFeatureLangParser.g:114:1: ruleFeatureRequest EOF
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
    // InternalFeatureLangParser.g:121:1: ruleFeatureRequest : ( ( rule__FeatureRequest__StatementsAssignment )* ) ;
    public final void ruleFeatureRequest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:125:2: ( ( ( rule__FeatureRequest__StatementsAssignment )* ) )
            // InternalFeatureLangParser.g:126:2: ( ( rule__FeatureRequest__StatementsAssignment )* )
            {
            // InternalFeatureLangParser.g:126:2: ( ( rule__FeatureRequest__StatementsAssignment )* )
            // InternalFeatureLangParser.g:127:3: ( rule__FeatureRequest__StatementsAssignment )*
            {
             before(grammarAccess.getFeatureRequestAccess().getStatementsAssignment()); 
            // InternalFeatureLangParser.g:128:3: ( rule__FeatureRequest__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Abstract||(LA1_0>=Change && LA1_0<=Delete)||LA1_0==Remove||LA1_0==Class||LA1_0==New||(LA1_0>=Set && LA1_0<=The)||LA1_0==A||LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFeatureLangParser.g:128:4: rule__FeatureRequest__StatementsAssignment
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
    // InternalFeatureLangParser.g:137:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalFeatureLangParser.g:138:1: ( ruleStatement EOF )
            // InternalFeatureLangParser.g:139:1: ruleStatement EOF
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
    // InternalFeatureLangParser.g:146:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:150:2: ( ( ( rule__Statement__Group__0 ) ) )
            // InternalFeatureLangParser.g:151:2: ( ( rule__Statement__Group__0 ) )
            {
            // InternalFeatureLangParser.g:151:2: ( ( rule__Statement__Group__0 ) )
            // InternalFeatureLangParser.g:152:3: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // InternalFeatureLangParser.g:153:3: ( rule__Statement__Group__0 )
            // InternalFeatureLangParser.g:153:4: rule__Statement__Group__0
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
    // InternalFeatureLangParser.g:162:1: entryRuleChangeStatement : ruleChangeStatement EOF ;
    public final void entryRuleChangeStatement() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:166:1: ( ruleChangeStatement EOF )
            // InternalFeatureLangParser.g:167:1: ruleChangeStatement EOF
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
    // InternalFeatureLangParser.g:177:1: ruleChangeStatement : ( ( rule__ChangeStatement__Group__0 ) ) ;
    public final void ruleChangeStatement() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:182:2: ( ( ( rule__ChangeStatement__Group__0 ) ) )
            // InternalFeatureLangParser.g:183:2: ( ( rule__ChangeStatement__Group__0 ) )
            {
            // InternalFeatureLangParser.g:183:2: ( ( rule__ChangeStatement__Group__0 ) )
            // InternalFeatureLangParser.g:184:3: ( rule__ChangeStatement__Group__0 )
            {
             before(grammarAccess.getChangeStatementAccess().getGroup()); 
            // InternalFeatureLangParser.g:185:3: ( rule__ChangeStatement__Group__0 )
            // InternalFeatureLangParser.g:185:4: rule__ChangeStatement__Group__0
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
    // InternalFeatureLangParser.g:195:1: entryRuleCreationStatement : ruleCreationStatement EOF ;
    public final void entryRuleCreationStatement() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:199:1: ( ruleCreationStatement EOF )
            // InternalFeatureLangParser.g:200:1: ruleCreationStatement EOF
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
    // InternalFeatureLangParser.g:210:1: ruleCreationStatement : ( ( rule__CreationStatement__Alternatives ) ) ;
    public final void ruleCreationStatement() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:215:2: ( ( ( rule__CreationStatement__Alternatives ) ) )
            // InternalFeatureLangParser.g:216:2: ( ( rule__CreationStatement__Alternatives ) )
            {
            // InternalFeatureLangParser.g:216:2: ( ( rule__CreationStatement__Alternatives ) )
            // InternalFeatureLangParser.g:217:3: ( rule__CreationStatement__Alternatives )
            {
             before(grammarAccess.getCreationStatementAccess().getAlternatives()); 
            // InternalFeatureLangParser.g:218:3: ( rule__CreationStatement__Alternatives )
            // InternalFeatureLangParser.g:218:4: rule__CreationStatement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CreationStatement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCreationStatementAccess().getAlternatives()); 

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
    // InternalFeatureLangParser.g:228:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:232:1: ( ruleAction EOF )
            // InternalFeatureLangParser.g:233:1: ruleAction EOF
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
    // InternalFeatureLangParser.g:243:1: ruleAction : ( ( rule__Action__TypeAssignment ) ) ;
    public final void ruleAction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:248:2: ( ( ( rule__Action__TypeAssignment ) ) )
            // InternalFeatureLangParser.g:249:2: ( ( rule__Action__TypeAssignment ) )
            {
            // InternalFeatureLangParser.g:249:2: ( ( rule__Action__TypeAssignment ) )
            // InternalFeatureLangParser.g:250:3: ( rule__Action__TypeAssignment )
            {
             before(grammarAccess.getActionAccess().getTypeAssignment()); 
            // InternalFeatureLangParser.g:251:3: ( rule__Action__TypeAssignment )
            // InternalFeatureLangParser.g:251:4: rule__Action__TypeAssignment
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
    // InternalFeatureLangParser.g:261:1: entryRuleUpdateAction : ruleUpdateAction EOF ;
    public final void entryRuleUpdateAction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:265:1: ( ruleUpdateAction EOF )
            // InternalFeatureLangParser.g:266:1: ruleUpdateAction EOF
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
    // InternalFeatureLangParser.g:276:1: ruleUpdateAction : ( ( rule__UpdateAction__Group__0 ) ) ;
    public final void ruleUpdateAction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:281:2: ( ( ( rule__UpdateAction__Group__0 ) ) )
            // InternalFeatureLangParser.g:282:2: ( ( rule__UpdateAction__Group__0 ) )
            {
            // InternalFeatureLangParser.g:282:2: ( ( rule__UpdateAction__Group__0 ) )
            // InternalFeatureLangParser.g:283:3: ( rule__UpdateAction__Group__0 )
            {
             before(grammarAccess.getUpdateActionAccess().getGroup()); 
            // InternalFeatureLangParser.g:284:3: ( rule__UpdateAction__Group__0 )
            // InternalFeatureLangParser.g:284:4: rule__UpdateAction__Group__0
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
    // InternalFeatureLangParser.g:294:1: entryRuleUpdateAttributeDatatype : ruleUpdateAttributeDatatype EOF ;
    public final void entryRuleUpdateAttributeDatatype() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:298:1: ( ruleUpdateAttributeDatatype EOF )
            // InternalFeatureLangParser.g:299:1: ruleUpdateAttributeDatatype EOF
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
    // InternalFeatureLangParser.g:309:1: ruleUpdateAttributeDatatype : ( ( rule__UpdateAttributeDatatype__Group__0 ) ) ;
    public final void ruleUpdateAttributeDatatype() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:314:2: ( ( ( rule__UpdateAttributeDatatype__Group__0 ) ) )
            // InternalFeatureLangParser.g:315:2: ( ( rule__UpdateAttributeDatatype__Group__0 ) )
            {
            // InternalFeatureLangParser.g:315:2: ( ( rule__UpdateAttributeDatatype__Group__0 ) )
            // InternalFeatureLangParser.g:316:3: ( rule__UpdateAttributeDatatype__Group__0 )
            {
             before(grammarAccess.getUpdateAttributeDatatypeAccess().getGroup()); 
            // InternalFeatureLangParser.g:317:3: ( rule__UpdateAttributeDatatype__Group__0 )
            // InternalFeatureLangParser.g:317:4: rule__UpdateAttributeDatatype__Group__0
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
    // InternalFeatureLangParser.g:327:1: entryRuleUpdateAttributeIdentifier : ruleUpdateAttributeIdentifier EOF ;
    public final void entryRuleUpdateAttributeIdentifier() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:331:1: ( ruleUpdateAttributeIdentifier EOF )
            // InternalFeatureLangParser.g:332:1: ruleUpdateAttributeIdentifier EOF
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
    // InternalFeatureLangParser.g:342:1: ruleUpdateAttributeIdentifier : ( ( rule__UpdateAttributeIdentifier__Group__0 ) ) ;
    public final void ruleUpdateAttributeIdentifier() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:347:2: ( ( ( rule__UpdateAttributeIdentifier__Group__0 ) ) )
            // InternalFeatureLangParser.g:348:2: ( ( rule__UpdateAttributeIdentifier__Group__0 ) )
            {
            // InternalFeatureLangParser.g:348:2: ( ( rule__UpdateAttributeIdentifier__Group__0 ) )
            // InternalFeatureLangParser.g:349:3: ( rule__UpdateAttributeIdentifier__Group__0 )
            {
             before(grammarAccess.getUpdateAttributeIdentifierAccess().getGroup()); 
            // InternalFeatureLangParser.g:350:3: ( rule__UpdateAttributeIdentifier__Group__0 )
            // InternalFeatureLangParser.g:350:4: rule__UpdateAttributeIdentifier__Group__0
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
    // InternalFeatureLangParser.g:360:1: entryRuleUpdateAttributeValue : ruleUpdateAttributeValue EOF ;
    public final void entryRuleUpdateAttributeValue() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:364:1: ( ruleUpdateAttributeValue EOF )
            // InternalFeatureLangParser.g:365:1: ruleUpdateAttributeValue EOF
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
    // InternalFeatureLangParser.g:375:1: ruleUpdateAttributeValue : ( ( rule__UpdateAttributeValue__Group__0 ) ) ;
    public final void ruleUpdateAttributeValue() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:380:2: ( ( ( rule__UpdateAttributeValue__Group__0 ) ) )
            // InternalFeatureLangParser.g:381:2: ( ( rule__UpdateAttributeValue__Group__0 ) )
            {
            // InternalFeatureLangParser.g:381:2: ( ( rule__UpdateAttributeValue__Group__0 ) )
            // InternalFeatureLangParser.g:382:3: ( rule__UpdateAttributeValue__Group__0 )
            {
             before(grammarAccess.getUpdateAttributeValueAccess().getGroup()); 
            // InternalFeatureLangParser.g:383:3: ( rule__UpdateAttributeValue__Group__0 )
            // InternalFeatureLangParser.g:383:4: rule__UpdateAttributeValue__Group__0
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
    // InternalFeatureLangParser.g:393:1: entryRuleAttributeAction : ruleAttributeAction EOF ;
    public final void entryRuleAttributeAction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:397:1: ( ruleAttributeAction EOF )
            // InternalFeatureLangParser.g:398:1: ruleAttributeAction EOF
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
    // InternalFeatureLangParser.g:408:1: ruleAttributeAction : ( ( rule__AttributeAction__Group__0 ) ) ;
    public final void ruleAttributeAction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:413:2: ( ( ( rule__AttributeAction__Group__0 ) ) )
            // InternalFeatureLangParser.g:414:2: ( ( rule__AttributeAction__Group__0 ) )
            {
            // InternalFeatureLangParser.g:414:2: ( ( rule__AttributeAction__Group__0 ) )
            // InternalFeatureLangParser.g:415:3: ( rule__AttributeAction__Group__0 )
            {
             before(grammarAccess.getAttributeActionAccess().getGroup()); 
            // InternalFeatureLangParser.g:416:3: ( rule__AttributeAction__Group__0 )
            // InternalFeatureLangParser.g:416:4: rule__AttributeAction__Group__0
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
    // InternalFeatureLangParser.g:426:1: entryRuleAssociationAction : ruleAssociationAction EOF ;
    public final void entryRuleAssociationAction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:430:1: ( ruleAssociationAction EOF )
            // InternalFeatureLangParser.g:431:1: ruleAssociationAction EOF
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
    // InternalFeatureLangParser.g:441:1: ruleAssociationAction : ( ( rule__AssociationAction__Group__0 ) ) ;
    public final void ruleAssociationAction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:446:2: ( ( ( rule__AssociationAction__Group__0 ) ) )
            // InternalFeatureLangParser.g:447:2: ( ( rule__AssociationAction__Group__0 ) )
            {
            // InternalFeatureLangParser.g:447:2: ( ( rule__AssociationAction__Group__0 ) )
            // InternalFeatureLangParser.g:448:3: ( rule__AssociationAction__Group__0 )
            {
             before(grammarAccess.getAssociationActionAccess().getGroup()); 
            // InternalFeatureLangParser.g:449:3: ( rule__AssociationAction__Group__0 )
            // InternalFeatureLangParser.g:449:4: rule__AssociationAction__Group__0
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
    // InternalFeatureLangParser.g:459:1: entryRuleCreateAssociation : ruleCreateAssociation EOF ;
    public final void entryRuleCreateAssociation() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:463:1: ( ruleCreateAssociation EOF )
            // InternalFeatureLangParser.g:464:1: ruleCreateAssociation EOF
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
    // InternalFeatureLangParser.g:474:1: ruleCreateAssociation : ( ( rule__CreateAssociation__Group__0 ) ) ;
    public final void ruleCreateAssociation() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:479:2: ( ( ( rule__CreateAssociation__Group__0 ) ) )
            // InternalFeatureLangParser.g:480:2: ( ( rule__CreateAssociation__Group__0 ) )
            {
            // InternalFeatureLangParser.g:480:2: ( ( rule__CreateAssociation__Group__0 ) )
            // InternalFeatureLangParser.g:481:3: ( rule__CreateAssociation__Group__0 )
            {
             before(grammarAccess.getCreateAssociationAccess().getGroup()); 
            // InternalFeatureLangParser.g:482:3: ( rule__CreateAssociation__Group__0 )
            // InternalFeatureLangParser.g:482:4: rule__CreateAssociation__Group__0
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
    // InternalFeatureLangParser.g:492:1: entryRuleEditAssociation : ruleEditAssociation EOF ;
    public final void entryRuleEditAssociation() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:496:1: ( ruleEditAssociation EOF )
            // InternalFeatureLangParser.g:497:1: ruleEditAssociation EOF
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
    // InternalFeatureLangParser.g:507:1: ruleEditAssociation : ( ( rule__EditAssociation__TypeAssignment ) ) ;
    public final void ruleEditAssociation() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:512:2: ( ( ( rule__EditAssociation__TypeAssignment ) ) )
            // InternalFeatureLangParser.g:513:2: ( ( rule__EditAssociation__TypeAssignment ) )
            {
            // InternalFeatureLangParser.g:513:2: ( ( rule__EditAssociation__TypeAssignment ) )
            // InternalFeatureLangParser.g:514:3: ( rule__EditAssociation__TypeAssignment )
            {
             before(grammarAccess.getEditAssociationAccess().getTypeAssignment()); 
            // InternalFeatureLangParser.g:515:3: ( rule__EditAssociation__TypeAssignment )
            // InternalFeatureLangParser.g:515:4: rule__EditAssociation__TypeAssignment
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
    // InternalFeatureLangParser.g:525:1: entryRuleSetCompatible : ruleSetCompatible EOF ;
    public final void entryRuleSetCompatible() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:529:1: ( ruleSetCompatible EOF )
            // InternalFeatureLangParser.g:530:1: ruleSetCompatible EOF
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
    // InternalFeatureLangParser.g:540:1: ruleSetCompatible : ( ( rule__SetCompatible__Group__0 ) ) ;
    public final void ruleSetCompatible() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:545:2: ( ( ( rule__SetCompatible__Group__0 ) ) )
            // InternalFeatureLangParser.g:546:2: ( ( rule__SetCompatible__Group__0 ) )
            {
            // InternalFeatureLangParser.g:546:2: ( ( rule__SetCompatible__Group__0 ) )
            // InternalFeatureLangParser.g:547:3: ( rule__SetCompatible__Group__0 )
            {
             before(grammarAccess.getSetCompatibleAccess().getGroup()); 
            // InternalFeatureLangParser.g:548:3: ( rule__SetCompatible__Group__0 )
            // InternalFeatureLangParser.g:548:4: rule__SetCompatible__Group__0
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
    // InternalFeatureLangParser.g:558:1: entryRuleSetVersionRange : ruleSetVersionRange EOF ;
    public final void entryRuleSetVersionRange() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:562:1: ( ruleSetVersionRange EOF )
            // InternalFeatureLangParser.g:563:1: ruleSetVersionRange EOF
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
    // InternalFeatureLangParser.g:573:1: ruleSetVersionRange : ( ( rule__SetVersionRange__Group__0 ) ) ;
    public final void ruleSetVersionRange() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:578:2: ( ( ( rule__SetVersionRange__Group__0 ) ) )
            // InternalFeatureLangParser.g:579:2: ( ( rule__SetVersionRange__Group__0 ) )
            {
            // InternalFeatureLangParser.g:579:2: ( ( rule__SetVersionRange__Group__0 ) )
            // InternalFeatureLangParser.g:580:3: ( rule__SetVersionRange__Group__0 )
            {
             before(grammarAccess.getSetVersionRangeAccess().getGroup()); 
            // InternalFeatureLangParser.g:581:3: ( rule__SetVersionRange__Group__0 )
            // InternalFeatureLangParser.g:581:4: rule__SetVersionRange__Group__0
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
    // InternalFeatureLangParser.g:591:1: entryRuleSetVariant : ruleSetVariant EOF ;
    public final void entryRuleSetVariant() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:595:1: ( ruleSetVariant EOF )
            // InternalFeatureLangParser.g:596:1: ruleSetVariant EOF
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
    // InternalFeatureLangParser.g:606:1: ruleSetVariant : ( ( rule__SetVariant__Group__0 ) ) ;
    public final void ruleSetVariant() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:611:2: ( ( ( rule__SetVariant__Group__0 ) ) )
            // InternalFeatureLangParser.g:612:2: ( ( rule__SetVariant__Group__0 ) )
            {
            // InternalFeatureLangParser.g:612:2: ( ( rule__SetVariant__Group__0 ) )
            // InternalFeatureLangParser.g:613:3: ( rule__SetVariant__Group__0 )
            {
             before(grammarAccess.getSetVariantAccess().getGroup()); 
            // InternalFeatureLangParser.g:614:3: ( rule__SetVariant__Group__0 )
            // InternalFeatureLangParser.g:614:4: rule__SetVariant__Group__0
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
    // InternalFeatureLangParser.g:624:1: entryRuleSetRightOpen : ruleSetRightOpen EOF ;
    public final void entryRuleSetRightOpen() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:628:1: ( ruleSetRightOpen EOF )
            // InternalFeatureLangParser.g:629:1: ruleSetRightOpen EOF
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
    // InternalFeatureLangParser.g:639:1: ruleSetRightOpen : ( ( rule__SetRightOpen__Group__0 ) ) ;
    public final void ruleSetRightOpen() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:644:2: ( ( ( rule__SetRightOpen__Group__0 ) ) )
            // InternalFeatureLangParser.g:645:2: ( ( rule__SetRightOpen__Group__0 ) )
            {
            // InternalFeatureLangParser.g:645:2: ( ( rule__SetRightOpen__Group__0 ) )
            // InternalFeatureLangParser.g:646:3: ( rule__SetRightOpen__Group__0 )
            {
             before(grammarAccess.getSetRightOpenAccess().getGroup()); 
            // InternalFeatureLangParser.g:647:3: ( rule__SetRightOpen__Group__0 )
            // InternalFeatureLangParser.g:647:4: rule__SetRightOpen__Group__0
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
    // InternalFeatureLangParser.g:657:1: entryRuleSetLeftOpen : ruleSetLeftOpen EOF ;
    public final void entryRuleSetLeftOpen() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:661:1: ( ruleSetLeftOpen EOF )
            // InternalFeatureLangParser.g:662:1: ruleSetLeftOpen EOF
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
    // InternalFeatureLangParser.g:672:1: ruleSetLeftOpen : ( ( rule__SetLeftOpen__Group__0 ) ) ;
    public final void ruleSetLeftOpen() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:677:2: ( ( ( rule__SetLeftOpen__Group__0 ) ) )
            // InternalFeatureLangParser.g:678:2: ( ( rule__SetLeftOpen__Group__0 ) )
            {
            // InternalFeatureLangParser.g:678:2: ( ( rule__SetLeftOpen__Group__0 ) )
            // InternalFeatureLangParser.g:679:3: ( rule__SetLeftOpen__Group__0 )
            {
             before(grammarAccess.getSetLeftOpenAccess().getGroup()); 
            // InternalFeatureLangParser.g:680:3: ( rule__SetLeftOpen__Group__0 )
            // InternalFeatureLangParser.g:680:4: rule__SetLeftOpen__Group__0
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
    // InternalFeatureLangParser.g:690:1: entryRuleInheritanceAction : ruleInheritanceAction EOF ;
    public final void entryRuleInheritanceAction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:694:1: ( ruleInheritanceAction EOF )
            // InternalFeatureLangParser.g:695:1: ruleInheritanceAction EOF
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
    // InternalFeatureLangParser.g:705:1: ruleInheritanceAction : ( ( rule__InheritanceAction__Group__0 ) ) ;
    public final void ruleInheritanceAction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:710:2: ( ( ( rule__InheritanceAction__Group__0 ) ) )
            // InternalFeatureLangParser.g:711:2: ( ( rule__InheritanceAction__Group__0 ) )
            {
            // InternalFeatureLangParser.g:711:2: ( ( rule__InheritanceAction__Group__0 ) )
            // InternalFeatureLangParser.g:712:3: ( rule__InheritanceAction__Group__0 )
            {
             before(grammarAccess.getInheritanceActionAccess().getGroup()); 
            // InternalFeatureLangParser.g:713:3: ( rule__InheritanceAction__Group__0 )
            // InternalFeatureLangParser.g:713:4: rule__InheritanceAction__Group__0
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
    // InternalFeatureLangParser.g:723:1: entryRuleCompositionAction : ruleCompositionAction EOF ;
    public final void entryRuleCompositionAction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:727:1: ( ruleCompositionAction EOF )
            // InternalFeatureLangParser.g:728:1: ruleCompositionAction EOF
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
    // InternalFeatureLangParser.g:738:1: ruleCompositionAction : ( ( rule__CompositionAction__Alternatives ) ) ;
    public final void ruleCompositionAction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:743:2: ( ( ( rule__CompositionAction__Alternatives ) ) )
            // InternalFeatureLangParser.g:744:2: ( ( rule__CompositionAction__Alternatives ) )
            {
            // InternalFeatureLangParser.g:744:2: ( ( rule__CompositionAction__Alternatives ) )
            // InternalFeatureLangParser.g:745:3: ( rule__CompositionAction__Alternatives )
            {
             before(grammarAccess.getCompositionActionAccess().getAlternatives()); 
            // InternalFeatureLangParser.g:746:3: ( rule__CompositionAction__Alternatives )
            // InternalFeatureLangParser.g:746:4: rule__CompositionAction__Alternatives
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
    // InternalFeatureLangParser.g:756:1: entryRuleCreateComposition : ruleCreateComposition EOF ;
    public final void entryRuleCreateComposition() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:760:1: ( ruleCreateComposition EOF )
            // InternalFeatureLangParser.g:761:1: ruleCreateComposition EOF
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
    // InternalFeatureLangParser.g:771:1: ruleCreateComposition : ( ( rule__CreateComposition__Group__0 ) ) ;
    public final void ruleCreateComposition() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:776:2: ( ( ( rule__CreateComposition__Group__0 ) ) )
            // InternalFeatureLangParser.g:777:2: ( ( rule__CreateComposition__Group__0 ) )
            {
            // InternalFeatureLangParser.g:777:2: ( ( rule__CreateComposition__Group__0 ) )
            // InternalFeatureLangParser.g:778:3: ( rule__CreateComposition__Group__0 )
            {
             before(grammarAccess.getCreateCompositionAccess().getGroup()); 
            // InternalFeatureLangParser.g:779:3: ( rule__CreateComposition__Group__0 )
            // InternalFeatureLangParser.g:779:4: rule__CreateComposition__Group__0
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
    // InternalFeatureLangParser.g:789:1: entryRuleEditComposition : ruleEditComposition EOF ;
    public final void entryRuleEditComposition() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:793:1: ( ruleEditComposition EOF )
            // InternalFeatureLangParser.g:794:1: ruleEditComposition EOF
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
    // InternalFeatureLangParser.g:804:1: ruleEditComposition : ( ( rule__EditComposition__Group__0 ) ) ;
    public final void ruleEditComposition() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:809:2: ( ( ( rule__EditComposition__Group__0 ) ) )
            // InternalFeatureLangParser.g:810:2: ( ( rule__EditComposition__Group__0 ) )
            {
            // InternalFeatureLangParser.g:810:2: ( ( rule__EditComposition__Group__0 ) )
            // InternalFeatureLangParser.g:811:3: ( rule__EditComposition__Group__0 )
            {
             before(grammarAccess.getEditCompositionAccess().getGroup()); 
            // InternalFeatureLangParser.g:812:3: ( rule__EditComposition__Group__0 )
            // InternalFeatureLangParser.g:812:4: rule__EditComposition__Group__0
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
    // InternalFeatureLangParser.g:822:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:826:1: ( ruleClass EOF )
            // InternalFeatureLangParser.g:827:1: ruleClass EOF
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
    // InternalFeatureLangParser.g:837:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:842:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalFeatureLangParser.g:843:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalFeatureLangParser.g:843:2: ( ( rule__Class__Group__0 ) )
            // InternalFeatureLangParser.g:844:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalFeatureLangParser.g:845:3: ( rule__Class__Group__0 )
            // InternalFeatureLangParser.g:845:4: rule__Class__Group__0
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
    // InternalFeatureLangParser.g:855:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:859:1: ( ruleAttribute EOF )
            // InternalFeatureLangParser.g:860:1: ruleAttribute EOF
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
    // InternalFeatureLangParser.g:870:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:875:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalFeatureLangParser.g:876:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalFeatureLangParser.g:876:2: ( ( rule__Attribute__Group__0 ) )
            // InternalFeatureLangParser.g:877:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalFeatureLangParser.g:878:3: ( rule__Attribute__Group__0 )
            // InternalFeatureLangParser.g:878:4: rule__Attribute__Group__0
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
    // InternalFeatureLangParser.g:888:1: entryRuleIdentifier : ruleIdentifier EOF ;
    public final void entryRuleIdentifier() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:892:1: ( ruleIdentifier EOF )
            // InternalFeatureLangParser.g:893:1: ruleIdentifier EOF
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
    // InternalFeatureLangParser.g:903:1: ruleIdentifier : ( ( rule__Identifier__Group__0 ) ) ;
    public final void ruleIdentifier() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:908:2: ( ( ( rule__Identifier__Group__0 ) ) )
            // InternalFeatureLangParser.g:909:2: ( ( rule__Identifier__Group__0 ) )
            {
            // InternalFeatureLangParser.g:909:2: ( ( rule__Identifier__Group__0 ) )
            // InternalFeatureLangParser.g:910:3: ( rule__Identifier__Group__0 )
            {
             before(grammarAccess.getIdentifierAccess().getGroup()); 
            // InternalFeatureLangParser.g:911:3: ( rule__Identifier__Group__0 )
            // InternalFeatureLangParser.g:911:4: rule__Identifier__Group__0
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
    // InternalFeatureLangParser.g:921:1: entryRulePriority : rulePriority EOF ;
    public final void entryRulePriority() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:925:1: ( rulePriority EOF )
            // InternalFeatureLangParser.g:926:1: rulePriority EOF
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
    // InternalFeatureLangParser.g:936:1: rulePriority : ( ( rule__Priority__PriorityAssignment ) ) ;
    public final void rulePriority() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:941:2: ( ( ( rule__Priority__PriorityAssignment ) ) )
            // InternalFeatureLangParser.g:942:2: ( ( rule__Priority__PriorityAssignment ) )
            {
            // InternalFeatureLangParser.g:942:2: ( ( rule__Priority__PriorityAssignment ) )
            // InternalFeatureLangParser.g:943:3: ( rule__Priority__PriorityAssignment )
            {
             before(grammarAccess.getPriorityAccess().getPriorityAssignment()); 
            // InternalFeatureLangParser.g:944:3: ( rule__Priority__PriorityAssignment )
            // InternalFeatureLangParser.g:944:4: rule__Priority__PriorityAssignment
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


    // $ANTLR start "entryRuleAttributeValue"
    // InternalFeatureLangParser.g:954:1: entryRuleAttributeValue : ruleAttributeValue EOF ;
    public final void entryRuleAttributeValue() throws RecognitionException {
        try {
            // InternalFeatureLangParser.g:955:1: ( ruleAttributeValue EOF )
            // InternalFeatureLangParser.g:956:1: ruleAttributeValue EOF
            {
             before(grammarAccess.getAttributeValueRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeValue();

            state._fsp--;

             after(grammarAccess.getAttributeValueRule()); 
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
    // $ANTLR end "entryRuleAttributeValue"


    // $ANTLR start "ruleAttributeValue"
    // InternalFeatureLangParser.g:963:1: ruleAttributeValue : ( ( rule__AttributeValue__Alternatives ) ) ;
    public final void ruleAttributeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:967:2: ( ( ( rule__AttributeValue__Alternatives ) ) )
            // InternalFeatureLangParser.g:968:2: ( ( rule__AttributeValue__Alternatives ) )
            {
            // InternalFeatureLangParser.g:968:2: ( ( rule__AttributeValue__Alternatives ) )
            // InternalFeatureLangParser.g:969:3: ( rule__AttributeValue__Alternatives )
            {
             before(grammarAccess.getAttributeValueAccess().getAlternatives()); 
            // InternalFeatureLangParser.g:970:3: ( rule__AttributeValue__Alternatives )
            // InternalFeatureLangParser.g:970:4: rule__AttributeValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AttributeValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeValueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAttributeValue"


    // $ANTLR start "rulePublicity"
    // InternalFeatureLangParser.g:979:1: rulePublicity : ( ( rule__Publicity__Alternatives ) ) ;
    public final void rulePublicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:983:1: ( ( ( rule__Publicity__Alternatives ) ) )
            // InternalFeatureLangParser.g:984:2: ( ( rule__Publicity__Alternatives ) )
            {
            // InternalFeatureLangParser.g:984:2: ( ( rule__Publicity__Alternatives ) )
            // InternalFeatureLangParser.g:985:3: ( rule__Publicity__Alternatives )
            {
             before(grammarAccess.getPublicityAccess().getAlternatives()); 
            // InternalFeatureLangParser.g:986:3: ( rule__Publicity__Alternatives )
            // InternalFeatureLangParser.g:986:4: rule__Publicity__Alternatives
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
    // InternalFeatureLangParser.g:995:1: rulePriorityValue : ( ( rule__PriorityValue__Alternatives ) ) ;
    public final void rulePriorityValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:999:1: ( ( ( rule__PriorityValue__Alternatives ) ) )
            // InternalFeatureLangParser.g:1000:2: ( ( rule__PriorityValue__Alternatives ) )
            {
            // InternalFeatureLangParser.g:1000:2: ( ( rule__PriorityValue__Alternatives ) )
            // InternalFeatureLangParser.g:1001:3: ( rule__PriorityValue__Alternatives )
            {
             before(grammarAccess.getPriorityValueAccess().getAlternatives()); 
            // InternalFeatureLangParser.g:1002:3: ( rule__PriorityValue__Alternatives )
            // InternalFeatureLangParser.g:1002:4: rule__PriorityValue__Alternatives
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
    // InternalFeatureLangParser.g:1011:1: ruleAbstraction : ( ( rule__Abstraction__Alternatives ) ) ;
    public final void ruleAbstraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1015:1: ( ( ( rule__Abstraction__Alternatives ) ) )
            // InternalFeatureLangParser.g:1016:2: ( ( rule__Abstraction__Alternatives ) )
            {
            // InternalFeatureLangParser.g:1016:2: ( ( rule__Abstraction__Alternatives ) )
            // InternalFeatureLangParser.g:1017:3: ( rule__Abstraction__Alternatives )
            {
             before(grammarAccess.getAbstractionAccess().getAlternatives()); 
            // InternalFeatureLangParser.g:1018:3: ( rule__Abstraction__Alternatives )
            // InternalFeatureLangParser.g:1018:4: rule__Abstraction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Abstraction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractionAccess().getAlternatives()); 

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
    // InternalFeatureLangParser.g:1027:1: ruleIdentifierValue : ( ( rule__IdentifierValue__Alternatives ) ) ;
    public final void ruleIdentifierValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1031:1: ( ( ( rule__IdentifierValue__Alternatives ) ) )
            // InternalFeatureLangParser.g:1032:2: ( ( rule__IdentifierValue__Alternatives ) )
            {
            // InternalFeatureLangParser.g:1032:2: ( ( rule__IdentifierValue__Alternatives ) )
            // InternalFeatureLangParser.g:1033:3: ( rule__IdentifierValue__Alternatives )
            {
             before(grammarAccess.getIdentifierValueAccess().getAlternatives()); 
            // InternalFeatureLangParser.g:1034:3: ( rule__IdentifierValue__Alternatives )
            // InternalFeatureLangParser.g:1034:4: rule__IdentifierValue__Alternatives
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
    // InternalFeatureLangParser.g:1043:1: ruleDatatype : ( ( rule__Datatype__Alternatives ) ) ;
    public final void ruleDatatype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1047:1: ( ( ( rule__Datatype__Alternatives ) ) )
            // InternalFeatureLangParser.g:1048:2: ( ( rule__Datatype__Alternatives ) )
            {
            // InternalFeatureLangParser.g:1048:2: ( ( rule__Datatype__Alternatives ) )
            // InternalFeatureLangParser.g:1049:3: ( rule__Datatype__Alternatives )
            {
             before(grammarAccess.getDatatypeAccess().getAlternatives()); 
            // InternalFeatureLangParser.g:1050:3: ( rule__Datatype__Alternatives )
            // InternalFeatureLangParser.g:1050:4: rule__Datatype__Alternatives
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
    // InternalFeatureLangParser.g:1058:1: rule__Statement__Alternatives_0 : ( ( ruleChangeStatement ) | ( ruleCreationStatement ) );
    public final void rule__Statement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1062:1: ( ( ruleChangeStatement ) | ( ruleCreationStatement ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalFeatureLangParser.g:1063:2: ( ruleChangeStatement )
                    {
                    // InternalFeatureLangParser.g:1063:2: ( ruleChangeStatement )
                    // InternalFeatureLangParser.g:1064:3: ruleChangeStatement
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
                    // InternalFeatureLangParser.g:1069:2: ( ruleCreationStatement )
                    {
                    // InternalFeatureLangParser.g:1069:2: ( ruleCreationStatement )
                    // InternalFeatureLangParser.g:1070:3: ruleCreationStatement
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


    // $ANTLR start "rule__ChangeStatement__Alternatives_0"
    // InternalFeatureLangParser.g:1079:1: rule__ChangeStatement__Alternatives_0 : ( ( ( rule__ChangeStatement__Group_0_0__0 ) ) | ( ( rule__ChangeStatement__Group_0_1__0 ) ) );
    public final void rule__ChangeStatement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1083:1: ( ( ( rule__ChangeStatement__Group_0_0__0 ) ) | ( ( rule__ChangeStatement__Group_0_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Abstract||LA3_0==Class||LA3_0==New||LA3_0==The||LA3_0==A||LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==Change||LA3_0==Remove||LA3_0==Set) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalFeatureLangParser.g:1084:2: ( ( rule__ChangeStatement__Group_0_0__0 ) )
                    {
                    // InternalFeatureLangParser.g:1084:2: ( ( rule__ChangeStatement__Group_0_0__0 ) )
                    // InternalFeatureLangParser.g:1085:3: ( rule__ChangeStatement__Group_0_0__0 )
                    {
                     before(grammarAccess.getChangeStatementAccess().getGroup_0_0()); 
                    // InternalFeatureLangParser.g:1086:3: ( rule__ChangeStatement__Group_0_0__0 )
                    // InternalFeatureLangParser.g:1086:4: rule__ChangeStatement__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChangeStatement__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getChangeStatementAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1090:2: ( ( rule__ChangeStatement__Group_0_1__0 ) )
                    {
                    // InternalFeatureLangParser.g:1090:2: ( ( rule__ChangeStatement__Group_0_1__0 ) )
                    // InternalFeatureLangParser.g:1091:3: ( rule__ChangeStatement__Group_0_1__0 )
                    {
                     before(grammarAccess.getChangeStatementAccess().getGroup_0_1()); 
                    // InternalFeatureLangParser.g:1092:3: ( rule__ChangeStatement__Group_0_1__0 )
                    // InternalFeatureLangParser.g:1092:4: rule__ChangeStatement__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChangeStatement__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getChangeStatementAccess().getGroup_0_1()); 

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
    // $ANTLR end "rule__ChangeStatement__Alternatives_0"


    // $ANTLR start "rule__ChangeStatement__Alternatives_0_1_0"
    // InternalFeatureLangParser.g:1100:1: rule__ChangeStatement__Alternatives_0_1_0 : ( ( Set ) | ( Change ) | ( ( rule__ChangeStatement__NegationAssignment_0_1_0_2 ) ) );
    public final void rule__ChangeStatement__Alternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1104:1: ( ( Set ) | ( Change ) | ( ( rule__ChangeStatement__NegationAssignment_0_1_0_2 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case Set:
                {
                alt4=1;
                }
                break;
            case Change:
                {
                alt4=2;
                }
                break;
            case Remove:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalFeatureLangParser.g:1105:2: ( Set )
                    {
                    // InternalFeatureLangParser.g:1105:2: ( Set )
                    // InternalFeatureLangParser.g:1106:3: Set
                    {
                     before(grammarAccess.getChangeStatementAccess().getSetKeyword_0_1_0_0()); 
                    match(input,Set,FOLLOW_2); 
                     after(grammarAccess.getChangeStatementAccess().getSetKeyword_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1111:2: ( Change )
                    {
                    // InternalFeatureLangParser.g:1111:2: ( Change )
                    // InternalFeatureLangParser.g:1112:3: Change
                    {
                     before(grammarAccess.getChangeStatementAccess().getChangeKeyword_0_1_0_1()); 
                    match(input,Change,FOLLOW_2); 
                     after(grammarAccess.getChangeStatementAccess().getChangeKeyword_0_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureLangParser.g:1117:2: ( ( rule__ChangeStatement__NegationAssignment_0_1_0_2 ) )
                    {
                    // InternalFeatureLangParser.g:1117:2: ( ( rule__ChangeStatement__NegationAssignment_0_1_0_2 ) )
                    // InternalFeatureLangParser.g:1118:3: ( rule__ChangeStatement__NegationAssignment_0_1_0_2 )
                    {
                     before(grammarAccess.getChangeStatementAccess().getNegationAssignment_0_1_0_2()); 
                    // InternalFeatureLangParser.g:1119:3: ( rule__ChangeStatement__NegationAssignment_0_1_0_2 )
                    // InternalFeatureLangParser.g:1119:4: rule__ChangeStatement__NegationAssignment_0_1_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChangeStatement__NegationAssignment_0_1_0_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getChangeStatementAccess().getNegationAssignment_0_1_0_2()); 

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
    // $ANTLR end "rule__ChangeStatement__Alternatives_0_1_0"


    // $ANTLR start "rule__ChangeStatement__Alternatives_1"
    // InternalFeatureLangParser.g:1127:1: rule__ChangeStatement__Alternatives_1 : ( ( ( rule__ChangeStatement__ActionAssignment_1_0 ) ) | ( ( rule__ChangeStatement__UpdateAssignment_1_1 ) ) );
    public final void rule__ChangeStatement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1131:1: ( ( ( rule__ChangeStatement__ActionAssignment_1_0 ) ) | ( ( rule__ChangeStatement__UpdateAssignment_1_1 ) ) )
            int alt5=2;
            switch ( input.LA(1) ) {
            case Associations:
            case Association:
            case Composition:
            case Inheritance:
            case Compose:
            case Inherit:
            case Have:
                {
                alt5=1;
                }
                break;
            case The:
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==Attribute||LA5_2==RULE_ID) ) {
                    alt5=1;
                }
                else if ( (LA5_2==Existing||LA5_2==Created) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case An:
                {
                int LA5_3 = input.LA(2);

                if ( (LA5_3==Existing||LA5_3==Created) ) {
                    alt5=2;
                }
                else if ( (LA5_3==Attribute||LA5_3==RULE_ID) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;
                }
                }
                break;
            case A:
                {
                int LA5_4 = input.LA(2);

                if ( (LA5_4==Existing||LA5_4==Created) ) {
                    alt5=2;
                }
                else if ( (LA5_4==Attribute||LA5_4==RULE_ID) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 4, input);

                    throw nvae;
                }
                }
                break;
            case Has:
                {
                alt5=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalFeatureLangParser.g:1132:2: ( ( rule__ChangeStatement__ActionAssignment_1_0 ) )
                    {
                    // InternalFeatureLangParser.g:1132:2: ( ( rule__ChangeStatement__ActionAssignment_1_0 ) )
                    // InternalFeatureLangParser.g:1133:3: ( rule__ChangeStatement__ActionAssignment_1_0 )
                    {
                     before(grammarAccess.getChangeStatementAccess().getActionAssignment_1_0()); 
                    // InternalFeatureLangParser.g:1134:3: ( rule__ChangeStatement__ActionAssignment_1_0 )
                    // InternalFeatureLangParser.g:1134:4: rule__ChangeStatement__ActionAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChangeStatement__ActionAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getChangeStatementAccess().getActionAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1138:2: ( ( rule__ChangeStatement__UpdateAssignment_1_1 ) )
                    {
                    // InternalFeatureLangParser.g:1138:2: ( ( rule__ChangeStatement__UpdateAssignment_1_1 ) )
                    // InternalFeatureLangParser.g:1139:3: ( rule__ChangeStatement__UpdateAssignment_1_1 )
                    {
                     before(grammarAccess.getChangeStatementAccess().getUpdateAssignment_1_1()); 
                    // InternalFeatureLangParser.g:1140:3: ( rule__ChangeStatement__UpdateAssignment_1_1 )
                    // InternalFeatureLangParser.g:1140:4: rule__ChangeStatement__UpdateAssignment_1_1
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


    // $ANTLR start "rule__CreationStatement__Alternatives"
    // InternalFeatureLangParser.g:1148:1: rule__CreationStatement__Alternatives : ( ( ( rule__CreationStatement__Group_0__0 ) ) | ( ( rule__CreationStatement__Group_1__0 ) ) );
    public final void rule__CreationStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1152:1: ( ( ( rule__CreationStatement__Group_0__0 ) ) | ( ( rule__CreationStatement__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Abstract||LA6_0==Class||LA6_0==New||LA6_0==The||LA6_0==A||LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=Create && LA6_0<=Delete)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalFeatureLangParser.g:1153:2: ( ( rule__CreationStatement__Group_0__0 ) )
                    {
                    // InternalFeatureLangParser.g:1153:2: ( ( rule__CreationStatement__Group_0__0 ) )
                    // InternalFeatureLangParser.g:1154:3: ( rule__CreationStatement__Group_0__0 )
                    {
                     before(grammarAccess.getCreationStatementAccess().getGroup_0()); 
                    // InternalFeatureLangParser.g:1155:3: ( rule__CreationStatement__Group_0__0 )
                    // InternalFeatureLangParser.g:1155:4: rule__CreationStatement__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CreationStatement__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCreationStatementAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1159:2: ( ( rule__CreationStatement__Group_1__0 ) )
                    {
                    // InternalFeatureLangParser.g:1159:2: ( ( rule__CreationStatement__Group_1__0 ) )
                    // InternalFeatureLangParser.g:1160:3: ( rule__CreationStatement__Group_1__0 )
                    {
                     before(grammarAccess.getCreationStatementAccess().getGroup_1()); 
                    // InternalFeatureLangParser.g:1161:3: ( rule__CreationStatement__Group_1__0 )
                    // InternalFeatureLangParser.g:1161:4: rule__CreationStatement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CreationStatement__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCreationStatementAccess().getGroup_1()); 

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
    // $ANTLR end "rule__CreationStatement__Alternatives"


    // $ANTLR start "rule__CreationStatement__Alternatives_0_3"
    // InternalFeatureLangParser.g:1169:1: rule__CreationStatement__Alternatives_0_3 : ( ( Exist ) | ( Be ) );
    public final void rule__CreationStatement__Alternatives_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1173:1: ( ( Exist ) | ( Be ) )
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
                    // InternalFeatureLangParser.g:1174:2: ( Exist )
                    {
                    // InternalFeatureLangParser.g:1174:2: ( Exist )
                    // InternalFeatureLangParser.g:1175:3: Exist
                    {
                     before(grammarAccess.getCreationStatementAccess().getExistKeyword_0_3_0()); 
                    match(input,Exist,FOLLOW_2); 
                     after(grammarAccess.getCreationStatementAccess().getExistKeyword_0_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1180:2: ( Be )
                    {
                    // InternalFeatureLangParser.g:1180:2: ( Be )
                    // InternalFeatureLangParser.g:1181:3: Be
                    {
                     before(grammarAccess.getCreationStatementAccess().getBeKeyword_0_3_1()); 
                    match(input,Be,FOLLOW_2); 
                     after(grammarAccess.getCreationStatementAccess().getBeKeyword_0_3_1()); 

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
    // $ANTLR end "rule__CreationStatement__Alternatives_0_3"


    // $ANTLR start "rule__CreationStatement__Alternatives_1_0"
    // InternalFeatureLangParser.g:1190:1: rule__CreationStatement__Alternatives_1_0 : ( ( Create ) | ( ( rule__CreationStatement__NegationAssignment_1_0_1 ) ) );
    public final void rule__CreationStatement__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1194:1: ( ( Create ) | ( ( rule__CreationStatement__NegationAssignment_1_0_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Create) ) {
                alt8=1;
            }
            else if ( (LA8_0==Delete) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalFeatureLangParser.g:1195:2: ( Create )
                    {
                    // InternalFeatureLangParser.g:1195:2: ( Create )
                    // InternalFeatureLangParser.g:1196:3: Create
                    {
                     before(grammarAccess.getCreationStatementAccess().getCreateKeyword_1_0_0()); 
                    match(input,Create,FOLLOW_2); 
                     after(grammarAccess.getCreationStatementAccess().getCreateKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1201:2: ( ( rule__CreationStatement__NegationAssignment_1_0_1 ) )
                    {
                    // InternalFeatureLangParser.g:1201:2: ( ( rule__CreationStatement__NegationAssignment_1_0_1 ) )
                    // InternalFeatureLangParser.g:1202:3: ( rule__CreationStatement__NegationAssignment_1_0_1 )
                    {
                     before(grammarAccess.getCreationStatementAccess().getNegationAssignment_1_0_1()); 
                    // InternalFeatureLangParser.g:1203:3: ( rule__CreationStatement__NegationAssignment_1_0_1 )
                    // InternalFeatureLangParser.g:1203:4: rule__CreationStatement__NegationAssignment_1_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CreationStatement__NegationAssignment_1_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCreationStatementAccess().getNegationAssignment_1_0_1()); 

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
    // $ANTLR end "rule__CreationStatement__Alternatives_1_0"


    // $ANTLR start "rule__Action__TypeAlternatives_0"
    // InternalFeatureLangParser.g:1211:1: rule__Action__TypeAlternatives_0 : ( ( ruleAttributeAction ) | ( ruleAssociationAction ) | ( ruleInheritanceAction ) | ( ruleCompositionAction ) );
    public final void rule__Action__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1215:1: ( ( ruleAttributeAction ) | ( ruleAssociationAction ) | ( ruleInheritanceAction ) | ( ruleCompositionAction ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case Have:
                {
                switch ( input.LA(2) ) {
                case The:
                case An:
                case A:
                    {
                    alt9=1;
                    }
                    break;
                case Associations:
                case Association:
                    {
                    alt9=2;
                    }
                    break;
                case Composition:
                    {
                    alt9=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }

                }
                break;
            case The:
            case An:
            case A:
                {
                alt9=1;
                }
                break;
            case Associations:
            case Association:
                {
                alt9=2;
                }
                break;
            case Inheritance:
            case Inherit:
                {
                alt9=3;
                }
                break;
            case Composition:
            case Compose:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalFeatureLangParser.g:1216:2: ( ruleAttributeAction )
                    {
                    // InternalFeatureLangParser.g:1216:2: ( ruleAttributeAction )
                    // InternalFeatureLangParser.g:1217:3: ruleAttributeAction
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
                    // InternalFeatureLangParser.g:1222:2: ( ruleAssociationAction )
                    {
                    // InternalFeatureLangParser.g:1222:2: ( ruleAssociationAction )
                    // InternalFeatureLangParser.g:1223:3: ruleAssociationAction
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
                    // InternalFeatureLangParser.g:1228:2: ( ruleInheritanceAction )
                    {
                    // InternalFeatureLangParser.g:1228:2: ( ruleInheritanceAction )
                    // InternalFeatureLangParser.g:1229:3: ruleInheritanceAction
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
                    // InternalFeatureLangParser.g:1234:2: ( ruleCompositionAction )
                    {
                    // InternalFeatureLangParser.g:1234:2: ( ruleCompositionAction )
                    // InternalFeatureLangParser.g:1235:3: ruleCompositionAction
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
    // InternalFeatureLangParser.g:1244:1: rule__UpdateAction__Alternatives_1 : ( ( An ) | ( A ) | ( The ) );
    public final void rule__UpdateAction__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1248:1: ( ( An ) | ( A ) | ( The ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case An:
                {
                alt10=1;
                }
                break;
            case A:
                {
                alt10=2;
                }
                break;
            case The:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalFeatureLangParser.g:1249:2: ( An )
                    {
                    // InternalFeatureLangParser.g:1249:2: ( An )
                    // InternalFeatureLangParser.g:1250:3: An
                    {
                     before(grammarAccess.getUpdateActionAccess().getAnKeyword_1_0()); 
                    match(input,An,FOLLOW_2); 
                     after(grammarAccess.getUpdateActionAccess().getAnKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1255:2: ( A )
                    {
                    // InternalFeatureLangParser.g:1255:2: ( A )
                    // InternalFeatureLangParser.g:1256:3: A
                    {
                     before(grammarAccess.getUpdateActionAccess().getAKeyword_1_1()); 
                    match(input,A,FOLLOW_2); 
                     after(grammarAccess.getUpdateActionAccess().getAKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureLangParser.g:1261:2: ( The )
                    {
                    // InternalFeatureLangParser.g:1261:2: ( The )
                    // InternalFeatureLangParser.g:1262:3: The
                    {
                     before(grammarAccess.getUpdateActionAccess().getTheKeyword_1_2()); 
                    match(input,The,FOLLOW_2); 
                     after(grammarAccess.getUpdateActionAccess().getTheKeyword_1_2()); 

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


    // $ANTLR start "rule__UpdateAction__Alternatives_2"
    // InternalFeatureLangParser.g:1271:1: rule__UpdateAction__Alternatives_2 : ( ( Existing ) | ( Created ) );
    public final void rule__UpdateAction__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1275:1: ( ( Existing ) | ( Created ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Existing) ) {
                alt11=1;
            }
            else if ( (LA11_0==Created) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalFeatureLangParser.g:1276:2: ( Existing )
                    {
                    // InternalFeatureLangParser.g:1276:2: ( Existing )
                    // InternalFeatureLangParser.g:1277:3: Existing
                    {
                     before(grammarAccess.getUpdateActionAccess().getExistingKeyword_2_0()); 
                    match(input,Existing,FOLLOW_2); 
                     after(grammarAccess.getUpdateActionAccess().getExistingKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1282:2: ( Created )
                    {
                    // InternalFeatureLangParser.g:1282:2: ( Created )
                    // InternalFeatureLangParser.g:1283:3: Created
                    {
                     before(grammarAccess.getUpdateActionAccess().getCreatedKeyword_2_1()); 
                    match(input,Created,FOLLOW_2); 
                     after(grammarAccess.getUpdateActionAccess().getCreatedKeyword_2_1()); 

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
    // $ANTLR end "rule__UpdateAction__Alternatives_2"


    // $ANTLR start "rule__UpdateAction__Alternatives_7"
    // InternalFeatureLangParser.g:1292:1: rule__UpdateAction__Alternatives_7 : ( ( ( rule__UpdateAction__DatatypeAssignment_7_0 ) ) | ( ( rule__UpdateAction__IdentifierAssignment_7_1 ) ) | ( ( rule__UpdateAction__ValueAssignment_7_2 ) ) );
    public final void rule__UpdateAction__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1296:1: ( ( ( rule__UpdateAction__DatatypeAssignment_7_0 ) ) | ( ( rule__UpdateAction__IdentifierAssignment_7_1 ) ) | ( ( rule__UpdateAction__ValueAssignment_7_2 ) ) )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Be) ) {
                alt12=1;
            }
            else if ( (LA12_0==Have) ) {
                switch ( input.LA(2) ) {
                case A:
                    {
                    int LA12_3 = input.LA(3);

                    if ( (LA12_3==Name||LA12_3==URI) ) {
                        alt12=2;
                    }
                    else if ( (LA12_3==Value) ) {
                        alt12=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case Value:
                    {
                    alt12=3;
                    }
                    break;
                case Name:
                case URI:
                case An:
                    {
                    alt12=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalFeatureLangParser.g:1297:2: ( ( rule__UpdateAction__DatatypeAssignment_7_0 ) )
                    {
                    // InternalFeatureLangParser.g:1297:2: ( ( rule__UpdateAction__DatatypeAssignment_7_0 ) )
                    // InternalFeatureLangParser.g:1298:3: ( rule__UpdateAction__DatatypeAssignment_7_0 )
                    {
                     before(grammarAccess.getUpdateActionAccess().getDatatypeAssignment_7_0()); 
                    // InternalFeatureLangParser.g:1299:3: ( rule__UpdateAction__DatatypeAssignment_7_0 )
                    // InternalFeatureLangParser.g:1299:4: rule__UpdateAction__DatatypeAssignment_7_0
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
                    // InternalFeatureLangParser.g:1303:2: ( ( rule__UpdateAction__IdentifierAssignment_7_1 ) )
                    {
                    // InternalFeatureLangParser.g:1303:2: ( ( rule__UpdateAction__IdentifierAssignment_7_1 ) )
                    // InternalFeatureLangParser.g:1304:3: ( rule__UpdateAction__IdentifierAssignment_7_1 )
                    {
                     before(grammarAccess.getUpdateActionAccess().getIdentifierAssignment_7_1()); 
                    // InternalFeatureLangParser.g:1305:3: ( rule__UpdateAction__IdentifierAssignment_7_1 )
                    // InternalFeatureLangParser.g:1305:4: rule__UpdateAction__IdentifierAssignment_7_1
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
                    // InternalFeatureLangParser.g:1309:2: ( ( rule__UpdateAction__ValueAssignment_7_2 ) )
                    {
                    // InternalFeatureLangParser.g:1309:2: ( ( rule__UpdateAction__ValueAssignment_7_2 ) )
                    // InternalFeatureLangParser.g:1310:3: ( rule__UpdateAction__ValueAssignment_7_2 )
                    {
                     before(grammarAccess.getUpdateActionAccess().getValueAssignment_7_2()); 
                    // InternalFeatureLangParser.g:1311:3: ( rule__UpdateAction__ValueAssignment_7_2 )
                    // InternalFeatureLangParser.g:1311:4: rule__UpdateAction__ValueAssignment_7_2
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
    // InternalFeatureLangParser.g:1319:1: rule__UpdateAttributeIdentifier__Alternatives_1 : ( ( A ) | ( An ) );
    public final void rule__UpdateAttributeIdentifier__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1323:1: ( ( A ) | ( An ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==A) ) {
                alt13=1;
            }
            else if ( (LA13_0==An) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalFeatureLangParser.g:1324:2: ( A )
                    {
                    // InternalFeatureLangParser.g:1324:2: ( A )
                    // InternalFeatureLangParser.g:1325:3: A
                    {
                     before(grammarAccess.getUpdateAttributeIdentifierAccess().getAKeyword_1_0()); 
                    match(input,A,FOLLOW_2); 
                     after(grammarAccess.getUpdateAttributeIdentifierAccess().getAKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1330:2: ( An )
                    {
                    // InternalFeatureLangParser.g:1330:2: ( An )
                    // InternalFeatureLangParser.g:1331:3: An
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
    // InternalFeatureLangParser.g:1340:1: rule__AttributeAction__Alternatives_1 : ( ( The ) | ( An ) | ( A ) );
    public final void rule__AttributeAction__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1344:1: ( ( The ) | ( An ) | ( A ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case The:
                {
                alt14=1;
                }
                break;
            case An:
                {
                alt14=2;
                }
                break;
            case A:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalFeatureLangParser.g:1345:2: ( The )
                    {
                    // InternalFeatureLangParser.g:1345:2: ( The )
                    // InternalFeatureLangParser.g:1346:3: The
                    {
                     before(grammarAccess.getAttributeActionAccess().getTheKeyword_1_0()); 
                    match(input,The,FOLLOW_2); 
                     after(grammarAccess.getAttributeActionAccess().getTheKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1351:2: ( An )
                    {
                    // InternalFeatureLangParser.g:1351:2: ( An )
                    // InternalFeatureLangParser.g:1352:3: An
                    {
                     before(grammarAccess.getAttributeActionAccess().getAnKeyword_1_1()); 
                    match(input,An,FOLLOW_2); 
                     after(grammarAccess.getAttributeActionAccess().getAnKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureLangParser.g:1357:2: ( A )
                    {
                    // InternalFeatureLangParser.g:1357:2: ( A )
                    // InternalFeatureLangParser.g:1358:3: A
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
    // InternalFeatureLangParser.g:1367:1: rule__AssociationAction__Alternatives_1 : ( ( Associations ) | ( Association ) );
    public final void rule__AssociationAction__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1371:1: ( ( Associations ) | ( Association ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Associations) ) {
                alt15=1;
            }
            else if ( (LA15_0==Association) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalFeatureLangParser.g:1372:2: ( Associations )
                    {
                    // InternalFeatureLangParser.g:1372:2: ( Associations )
                    // InternalFeatureLangParser.g:1373:3: Associations
                    {
                     before(grammarAccess.getAssociationActionAccess().getAssociationsKeyword_1_0()); 
                    match(input,Associations,FOLLOW_2); 
                     after(grammarAccess.getAssociationActionAccess().getAssociationsKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1378:2: ( Association )
                    {
                    // InternalFeatureLangParser.g:1378:2: ( Association )
                    // InternalFeatureLangParser.g:1379:3: Association
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
    // InternalFeatureLangParser.g:1388:1: rule__AssociationAction__Alternatives_2 : ( ( ( rule__AssociationAction__CreateAssignment_2_0 ) ) | ( ( rule__AssociationAction__Group_2_1__0 ) ) );
    public final void rule__AssociationAction__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1392:1: ( ( ( rule__AssociationAction__CreateAssignment_2_0 ) ) | ( ( rule__AssociationAction__Group_2_1__0 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==To) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalFeatureLangParser.g:1393:2: ( ( rule__AssociationAction__CreateAssignment_2_0 ) )
                    {
                    // InternalFeatureLangParser.g:1393:2: ( ( rule__AssociationAction__CreateAssignment_2_0 ) )
                    // InternalFeatureLangParser.g:1394:3: ( rule__AssociationAction__CreateAssignment_2_0 )
                    {
                     before(grammarAccess.getAssociationActionAccess().getCreateAssignment_2_0()); 
                    // InternalFeatureLangParser.g:1395:3: ( rule__AssociationAction__CreateAssignment_2_0 )
                    // InternalFeatureLangParser.g:1395:4: rule__AssociationAction__CreateAssignment_2_0
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
                    // InternalFeatureLangParser.g:1399:2: ( ( rule__AssociationAction__Group_2_1__0 ) )
                    {
                    // InternalFeatureLangParser.g:1399:2: ( ( rule__AssociationAction__Group_2_1__0 ) )
                    // InternalFeatureLangParser.g:1400:3: ( rule__AssociationAction__Group_2_1__0 )
                    {
                     before(grammarAccess.getAssociationActionAccess().getGroup_2_1()); 
                    // InternalFeatureLangParser.g:1401:3: ( rule__AssociationAction__Group_2_1__0 )
                    // InternalFeatureLangParser.g:1401:4: rule__AssociationAction__Group_2_1__0
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
    // InternalFeatureLangParser.g:1409:1: rule__EditAssociation__TypeAlternatives_0 : ( ( ruleSetCompatible ) | ( ruleSetVersionRange ) | ( ruleSetVariant ) | ( ruleSetRightOpen ) | ( ruleSetLeftOpen ) );
    public final void rule__EditAssociation__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1413:1: ( ( ruleSetCompatible ) | ( ruleSetVersionRange ) | ( ruleSetVariant ) | ( ruleSetRightOpen ) | ( ruleSetLeftOpen ) )
            int alt17=5;
            switch ( input.LA(1) ) {
            case Compatible:
                {
                alt17=1;
                }
                break;
            case With:
                {
                int LA17_2 = input.LA(2);

                if ( (LA17_2==Version) ) {
                    alt17=2;
                }
                else if ( (LA17_2==All) ) {
                    alt17=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;
                }
                }
                break;
            case Up:
                {
                alt17=4;
                }
                break;
            case Starting:
                {
                alt17=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalFeatureLangParser.g:1414:2: ( ruleSetCompatible )
                    {
                    // InternalFeatureLangParser.g:1414:2: ( ruleSetCompatible )
                    // InternalFeatureLangParser.g:1415:3: ruleSetCompatible
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
                    // InternalFeatureLangParser.g:1420:2: ( ruleSetVersionRange )
                    {
                    // InternalFeatureLangParser.g:1420:2: ( ruleSetVersionRange )
                    // InternalFeatureLangParser.g:1421:3: ruleSetVersionRange
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
                    // InternalFeatureLangParser.g:1426:2: ( ruleSetVariant )
                    {
                    // InternalFeatureLangParser.g:1426:2: ( ruleSetVariant )
                    // InternalFeatureLangParser.g:1427:3: ruleSetVariant
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
                    // InternalFeatureLangParser.g:1432:2: ( ruleSetRightOpen )
                    {
                    // InternalFeatureLangParser.g:1432:2: ( ruleSetRightOpen )
                    // InternalFeatureLangParser.g:1433:3: ruleSetRightOpen
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
                    // InternalFeatureLangParser.g:1438:2: ( ruleSetLeftOpen )
                    {
                    // InternalFeatureLangParser.g:1438:2: ( ruleSetLeftOpen )
                    // InternalFeatureLangParser.g:1439:3: ruleSetLeftOpen
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


    // $ANTLR start "rule__InheritanceAction__Alternatives_0"
    // InternalFeatureLangParser.g:1448:1: rule__InheritanceAction__Alternatives_0 : ( ( Inherit ) | ( Inheritance ) );
    public final void rule__InheritanceAction__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1452:1: ( ( Inherit ) | ( Inheritance ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Inherit) ) {
                alt18=1;
            }
            else if ( (LA18_0==Inheritance) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalFeatureLangParser.g:1453:2: ( Inherit )
                    {
                    // InternalFeatureLangParser.g:1453:2: ( Inherit )
                    // InternalFeatureLangParser.g:1454:3: Inherit
                    {
                     before(grammarAccess.getInheritanceActionAccess().getInheritKeyword_0_0()); 
                    match(input,Inherit,FOLLOW_2); 
                     after(grammarAccess.getInheritanceActionAccess().getInheritKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1459:2: ( Inheritance )
                    {
                    // InternalFeatureLangParser.g:1459:2: ( Inheritance )
                    // InternalFeatureLangParser.g:1460:3: Inheritance
                    {
                     before(grammarAccess.getInheritanceActionAccess().getInheritanceKeyword_0_1()); 
                    match(input,Inheritance,FOLLOW_2); 
                     after(grammarAccess.getInheritanceActionAccess().getInheritanceKeyword_0_1()); 

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
    // $ANTLR end "rule__InheritanceAction__Alternatives_0"


    // $ANTLR start "rule__CompositionAction__Alternatives"
    // InternalFeatureLangParser.g:1469:1: rule__CompositionAction__Alternatives : ( ( ( rule__CompositionAction__CreateAssignment_0 ) ) | ( ( rule__CompositionAction__EditAssignment_1 ) ) );
    public final void rule__CompositionAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1473:1: ( ( ( rule__CompositionAction__CreateAssignment_0 ) ) | ( ( rule__CompositionAction__EditAssignment_1 ) ) )
            int alt19=2;
            switch ( input.LA(1) ) {
            case Compose:
                {
                alt19=1;
                }
                break;
            case Composition:
                {
                int LA19_2 = input.LA(2);

                if ( (LA19_2==To) ) {
                    alt19=1;
                }
                else if ( (LA19_2==RULE_ID) ) {
                    alt19=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 2, input);

                    throw nvae;
                }
                }
                break;
            case Have:
                {
                alt19=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalFeatureLangParser.g:1474:2: ( ( rule__CompositionAction__CreateAssignment_0 ) )
                    {
                    // InternalFeatureLangParser.g:1474:2: ( ( rule__CompositionAction__CreateAssignment_0 ) )
                    // InternalFeatureLangParser.g:1475:3: ( rule__CompositionAction__CreateAssignment_0 )
                    {
                     before(grammarAccess.getCompositionActionAccess().getCreateAssignment_0()); 
                    // InternalFeatureLangParser.g:1476:3: ( rule__CompositionAction__CreateAssignment_0 )
                    // InternalFeatureLangParser.g:1476:4: rule__CompositionAction__CreateAssignment_0
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
                    // InternalFeatureLangParser.g:1480:2: ( ( rule__CompositionAction__EditAssignment_1 ) )
                    {
                    // InternalFeatureLangParser.g:1480:2: ( ( rule__CompositionAction__EditAssignment_1 ) )
                    // InternalFeatureLangParser.g:1481:3: ( rule__CompositionAction__EditAssignment_1 )
                    {
                     before(grammarAccess.getCompositionActionAccess().getEditAssignment_1()); 
                    // InternalFeatureLangParser.g:1482:3: ( rule__CompositionAction__EditAssignment_1 )
                    // InternalFeatureLangParser.g:1482:4: rule__CompositionAction__EditAssignment_1
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


    // $ANTLR start "rule__CreateComposition__Alternatives_0"
    // InternalFeatureLangParser.g:1490:1: rule__CreateComposition__Alternatives_0 : ( ( Compose ) | ( ( rule__CreateComposition__Group_0_1__0 ) ) );
    public final void rule__CreateComposition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1494:1: ( ( Compose ) | ( ( rule__CreateComposition__Group_0_1__0 ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Compose) ) {
                alt20=1;
            }
            else if ( (LA20_0==Composition) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalFeatureLangParser.g:1495:2: ( Compose )
                    {
                    // InternalFeatureLangParser.g:1495:2: ( Compose )
                    // InternalFeatureLangParser.g:1496:3: Compose
                    {
                     before(grammarAccess.getCreateCompositionAccess().getComposeKeyword_0_0()); 
                    match(input,Compose,FOLLOW_2); 
                     after(grammarAccess.getCreateCompositionAccess().getComposeKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1501:2: ( ( rule__CreateComposition__Group_0_1__0 ) )
                    {
                    // InternalFeatureLangParser.g:1501:2: ( ( rule__CreateComposition__Group_0_1__0 ) )
                    // InternalFeatureLangParser.g:1502:3: ( rule__CreateComposition__Group_0_1__0 )
                    {
                     before(grammarAccess.getCreateCompositionAccess().getGroup_0_1()); 
                    // InternalFeatureLangParser.g:1503:3: ( rule__CreateComposition__Group_0_1__0 )
                    // InternalFeatureLangParser.g:1503:4: rule__CreateComposition__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CreateComposition__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCreateCompositionAccess().getGroup_0_1()); 

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
    // $ANTLR end "rule__CreateComposition__Alternatives_0"


    // $ANTLR start "rule__Class__Alternatives_0"
    // InternalFeatureLangParser.g:1511:1: rule__Class__Alternatives_0 : ( ( The ) | ( A ) );
    public final void rule__Class__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1515:1: ( ( The ) | ( A ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==The) ) {
                alt21=1;
            }
            else if ( (LA21_0==A) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalFeatureLangParser.g:1516:2: ( The )
                    {
                    // InternalFeatureLangParser.g:1516:2: ( The )
                    // InternalFeatureLangParser.g:1517:3: The
                    {
                     before(grammarAccess.getClassAccess().getTheKeyword_0_0()); 
                    match(input,The,FOLLOW_2); 
                     after(grammarAccess.getClassAccess().getTheKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1522:2: ( A )
                    {
                    // InternalFeatureLangParser.g:1522:2: ( A )
                    // InternalFeatureLangParser.g:1523:3: A
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


    // $ANTLR start "rule__AttributeValue__Alternatives"
    // InternalFeatureLangParser.g:1532:1: rule__AttributeValue__Alternatives : ( ( ( ( rule__AttributeValue__Group_0__0 ) ) ( ( rule__AttributeValue__Group_0__0 )* ) ) | ( RULE_INT ) | ( RULE_DATE ) );
    public final void rule__AttributeValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1536:1: ( ( ( ( rule__AttributeValue__Group_0__0 ) ) ( ( rule__AttributeValue__Group_0__0 )* ) ) | ( RULE_INT ) | ( RULE_DATE ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt23=1;
                }
                break;
            case RULE_INT:
                {
                alt23=2;
                }
                break;
            case RULE_DATE:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalFeatureLangParser.g:1537:2: ( ( ( rule__AttributeValue__Group_0__0 ) ) ( ( rule__AttributeValue__Group_0__0 )* ) )
                    {
                    // InternalFeatureLangParser.g:1537:2: ( ( ( rule__AttributeValue__Group_0__0 ) ) ( ( rule__AttributeValue__Group_0__0 )* ) )
                    // InternalFeatureLangParser.g:1538:3: ( ( rule__AttributeValue__Group_0__0 ) ) ( ( rule__AttributeValue__Group_0__0 )* )
                    {
                    // InternalFeatureLangParser.g:1538:3: ( ( rule__AttributeValue__Group_0__0 ) )
                    // InternalFeatureLangParser.g:1539:4: ( rule__AttributeValue__Group_0__0 )
                    {
                     before(grammarAccess.getAttributeValueAccess().getGroup_0()); 
                    // InternalFeatureLangParser.g:1540:4: ( rule__AttributeValue__Group_0__0 )
                    // InternalFeatureLangParser.g:1540:5: rule__AttributeValue__Group_0__0
                    {
                    pushFollow(FOLLOW_4);
                    rule__AttributeValue__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeValueAccess().getGroup_0()); 

                    }

                    // InternalFeatureLangParser.g:1543:3: ( ( rule__AttributeValue__Group_0__0 )* )
                    // InternalFeatureLangParser.g:1544:4: ( rule__AttributeValue__Group_0__0 )*
                    {
                     before(grammarAccess.getAttributeValueAccess().getGroup_0()); 
                    // InternalFeatureLangParser.g:1545:4: ( rule__AttributeValue__Group_0__0 )*
                    loop22:
                    do {
                        int alt22=2;
                        alt22 = dfa22.predict(input);
                        switch (alt22) {
                    	case 1 :
                    	    // InternalFeatureLangParser.g:1545:5: rule__AttributeValue__Group_0__0
                    	    {
                    	    pushFollow(FOLLOW_4);
                    	    rule__AttributeValue__Group_0__0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                     after(grammarAccess.getAttributeValueAccess().getGroup_0()); 

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1550:2: ( RULE_INT )
                    {
                    // InternalFeatureLangParser.g:1550:2: ( RULE_INT )
                    // InternalFeatureLangParser.g:1551:3: RULE_INT
                    {
                     before(grammarAccess.getAttributeValueAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getAttributeValueAccess().getINTTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureLangParser.g:1556:2: ( RULE_DATE )
                    {
                    // InternalFeatureLangParser.g:1556:2: ( RULE_DATE )
                    // InternalFeatureLangParser.g:1557:3: RULE_DATE
                    {
                     before(grammarAccess.getAttributeValueAccess().getDATETerminalRuleCall_2()); 
                    match(input,RULE_DATE,FOLLOW_2); 
                     after(grammarAccess.getAttributeValueAccess().getDATETerminalRuleCall_2()); 

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
    // $ANTLR end "rule__AttributeValue__Alternatives"


    // $ANTLR start "rule__Publicity__Alternatives"
    // InternalFeatureLangParser.g:1566:1: rule__Publicity__Alternatives : ( ( ( Public ) ) | ( ( Private ) ) );
    public final void rule__Publicity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1570:1: ( ( ( Public ) ) | ( ( Private ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Public) ) {
                alt24=1;
            }
            else if ( (LA24_0==Private) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalFeatureLangParser.g:1571:2: ( ( Public ) )
                    {
                    // InternalFeatureLangParser.g:1571:2: ( ( Public ) )
                    // InternalFeatureLangParser.g:1572:3: ( Public )
                    {
                     before(grammarAccess.getPublicityAccess().getPUBLICEnumLiteralDeclaration_0()); 
                    // InternalFeatureLangParser.g:1573:3: ( Public )
                    // InternalFeatureLangParser.g:1573:4: Public
                    {
                    match(input,Public,FOLLOW_2); 

                    }

                     after(grammarAccess.getPublicityAccess().getPUBLICEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1577:2: ( ( Private ) )
                    {
                    // InternalFeatureLangParser.g:1577:2: ( ( Private ) )
                    // InternalFeatureLangParser.g:1578:3: ( Private )
                    {
                     before(grammarAccess.getPublicityAccess().getPRIVATEEnumLiteralDeclaration_1()); 
                    // InternalFeatureLangParser.g:1579:3: ( Private )
                    // InternalFeatureLangParser.g:1579:4: Private
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
    // InternalFeatureLangParser.g:1587:1: rule__PriorityValue__Alternatives : ( ( ( Should ) ) | ( ( Must ) ) );
    public final void rule__PriorityValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1591:1: ( ( ( Should ) ) | ( ( Must ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Should) ) {
                alt25=1;
            }
            else if ( (LA25_0==Must) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalFeatureLangParser.g:1592:2: ( ( Should ) )
                    {
                    // InternalFeatureLangParser.g:1592:2: ( ( Should ) )
                    // InternalFeatureLangParser.g:1593:3: ( Should )
                    {
                     before(grammarAccess.getPriorityValueAccess().getSHOULDEnumLiteralDeclaration_0()); 
                    // InternalFeatureLangParser.g:1594:3: ( Should )
                    // InternalFeatureLangParser.g:1594:4: Should
                    {
                    match(input,Should,FOLLOW_2); 

                    }

                     after(grammarAccess.getPriorityValueAccess().getSHOULDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1598:2: ( ( Must ) )
                    {
                    // InternalFeatureLangParser.g:1598:2: ( ( Must ) )
                    // InternalFeatureLangParser.g:1599:3: ( Must )
                    {
                     before(grammarAccess.getPriorityValueAccess().getMUSTEnumLiteralDeclaration_1()); 
                    // InternalFeatureLangParser.g:1600:3: ( Must )
                    // InternalFeatureLangParser.g:1600:4: Must
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


    // $ANTLR start "rule__Abstraction__Alternatives"
    // InternalFeatureLangParser.g:1608:1: rule__Abstraction__Alternatives : ( ( ( New ) ) | ( ( Abstract ) ) );
    public final void rule__Abstraction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1612:1: ( ( ( New ) ) | ( ( Abstract ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==New) ) {
                alt26=1;
            }
            else if ( (LA26_0==Abstract) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalFeatureLangParser.g:1613:2: ( ( New ) )
                    {
                    // InternalFeatureLangParser.g:1613:2: ( ( New ) )
                    // InternalFeatureLangParser.g:1614:3: ( New )
                    {
                     before(grammarAccess.getAbstractionAccess().getNEWEnumLiteralDeclaration_0()); 
                    // InternalFeatureLangParser.g:1615:3: ( New )
                    // InternalFeatureLangParser.g:1615:4: New
                    {
                    match(input,New,FOLLOW_2); 

                    }

                     after(grammarAccess.getAbstractionAccess().getNEWEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1619:2: ( ( Abstract ) )
                    {
                    // InternalFeatureLangParser.g:1619:2: ( ( Abstract ) )
                    // InternalFeatureLangParser.g:1620:3: ( Abstract )
                    {
                     before(grammarAccess.getAbstractionAccess().getABSTRACTIONEnumLiteralDeclaration_1()); 
                    // InternalFeatureLangParser.g:1621:3: ( Abstract )
                    // InternalFeatureLangParser.g:1621:4: Abstract
                    {
                    match(input,Abstract,FOLLOW_2); 

                    }

                     after(grammarAccess.getAbstractionAccess().getABSTRACTIONEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Abstraction__Alternatives"


    // $ANTLR start "rule__IdentifierValue__Alternatives"
    // InternalFeatureLangParser.g:1629:1: rule__IdentifierValue__Alternatives : ( ( ( Name ) ) | ( ( URI ) ) );
    public final void rule__IdentifierValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1633:1: ( ( ( Name ) ) | ( ( URI ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Name) ) {
                alt27=1;
            }
            else if ( (LA27_0==URI) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalFeatureLangParser.g:1634:2: ( ( Name ) )
                    {
                    // InternalFeatureLangParser.g:1634:2: ( ( Name ) )
                    // InternalFeatureLangParser.g:1635:3: ( Name )
                    {
                     before(grammarAccess.getIdentifierValueAccess().getNAMEEnumLiteralDeclaration_0()); 
                    // InternalFeatureLangParser.g:1636:3: ( Name )
                    // InternalFeatureLangParser.g:1636:4: Name
                    {
                    match(input,Name,FOLLOW_2); 

                    }

                     after(grammarAccess.getIdentifierValueAccess().getNAMEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1640:2: ( ( URI ) )
                    {
                    // InternalFeatureLangParser.g:1640:2: ( ( URI ) )
                    // InternalFeatureLangParser.g:1641:3: ( URI )
                    {
                     before(grammarAccess.getIdentifierValueAccess().getURIEnumLiteralDeclaration_1()); 
                    // InternalFeatureLangParser.g:1642:3: ( URI )
                    // InternalFeatureLangParser.g:1642:4: URI
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
    // InternalFeatureLangParser.g:1650:1: rule__Datatype__Alternatives : ( ( ( DEFAULT ) ) | ( ( Time ) ) | ( ( Phrase ) ) | ( ( Number ) ) );
    public final void rule__Datatype__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1654:1: ( ( ( DEFAULT ) ) | ( ( Time ) ) | ( ( Phrase ) ) | ( ( Number ) ) )
            int alt28=4;
            switch ( input.LA(1) ) {
            case DEFAULT:
                {
                alt28=1;
                }
                break;
            case Time:
                {
                alt28=2;
                }
                break;
            case Phrase:
                {
                alt28=3;
                }
                break;
            case Number:
                {
                alt28=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalFeatureLangParser.g:1655:2: ( ( DEFAULT ) )
                    {
                    // InternalFeatureLangParser.g:1655:2: ( ( DEFAULT ) )
                    // InternalFeatureLangParser.g:1656:3: ( DEFAULT )
                    {
                     before(grammarAccess.getDatatypeAccess().getDEFAULTEnumLiteralDeclaration_0()); 
                    // InternalFeatureLangParser.g:1657:3: ( DEFAULT )
                    // InternalFeatureLangParser.g:1657:4: DEFAULT
                    {
                    match(input,DEFAULT,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatatypeAccess().getDEFAULTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1661:2: ( ( Time ) )
                    {
                    // InternalFeatureLangParser.g:1661:2: ( ( Time ) )
                    // InternalFeatureLangParser.g:1662:3: ( Time )
                    {
                     before(grammarAccess.getDatatypeAccess().getWORDEnumLiteralDeclaration_1()); 
                    // InternalFeatureLangParser.g:1663:3: ( Time )
                    // InternalFeatureLangParser.g:1663:4: Time
                    {
                    match(input,Time,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatatypeAccess().getWORDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureLangParser.g:1667:2: ( ( Phrase ) )
                    {
                    // InternalFeatureLangParser.g:1667:2: ( ( Phrase ) )
                    // InternalFeatureLangParser.g:1668:3: ( Phrase )
                    {
                     before(grammarAccess.getDatatypeAccess().getPHRASEEnumLiteralDeclaration_2()); 
                    // InternalFeatureLangParser.g:1669:3: ( Phrase )
                    // InternalFeatureLangParser.g:1669:4: Phrase
                    {
                    match(input,Phrase,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatatypeAccess().getPHRASEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFeatureLangParser.g:1673:2: ( ( Number ) )
                    {
                    // InternalFeatureLangParser.g:1673:2: ( ( Number ) )
                    // InternalFeatureLangParser.g:1674:3: ( Number )
                    {
                     before(grammarAccess.getDatatypeAccess().getNUMBEREnumLiteralDeclaration_3()); 
                    // InternalFeatureLangParser.g:1675:3: ( Number )
                    // InternalFeatureLangParser.g:1675:4: Number
                    {
                    match(input,Number,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatatypeAccess().getNUMBEREnumLiteralDeclaration_3()); 

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
    // InternalFeatureLangParser.g:1683:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1687:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalFeatureLangParser.g:1688:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalFeatureLangParser.g:1695:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__Alternatives_0 ) ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1699:1: ( ( ( rule__Statement__Alternatives_0 ) ) )
            // InternalFeatureLangParser.g:1700:1: ( ( rule__Statement__Alternatives_0 ) )
            {
            // InternalFeatureLangParser.g:1700:1: ( ( rule__Statement__Alternatives_0 ) )
            // InternalFeatureLangParser.g:1701:2: ( rule__Statement__Alternatives_0 )
            {
             before(grammarAccess.getStatementAccess().getAlternatives_0()); 
            // InternalFeatureLangParser.g:1702:2: ( rule__Statement__Alternatives_0 )
            // InternalFeatureLangParser.g:1702:3: rule__Statement__Alternatives_0
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
    // InternalFeatureLangParser.g:1710:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1714:1: ( rule__Statement__Group__1__Impl )
            // InternalFeatureLangParser.g:1715:2: rule__Statement__Group__1__Impl
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
    // InternalFeatureLangParser.g:1721:1: rule__Statement__Group__1__Impl : ( ( FullStop )? ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1725:1: ( ( ( FullStop )? ) )
            // InternalFeatureLangParser.g:1726:1: ( ( FullStop )? )
            {
            // InternalFeatureLangParser.g:1726:1: ( ( FullStop )? )
            // InternalFeatureLangParser.g:1727:2: ( FullStop )?
            {
             before(grammarAccess.getStatementAccess().getFullStopKeyword_1()); 
            // InternalFeatureLangParser.g:1728:2: ( FullStop )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==FullStop) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalFeatureLangParser.g:1728:3: FullStop
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
    // InternalFeatureLangParser.g:1737:1: rule__ChangeStatement__Group__0 : rule__ChangeStatement__Group__0__Impl rule__ChangeStatement__Group__1 ;
    public final void rule__ChangeStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1741:1: ( rule__ChangeStatement__Group__0__Impl rule__ChangeStatement__Group__1 )
            // InternalFeatureLangParser.g:1742:2: rule__ChangeStatement__Group__0__Impl rule__ChangeStatement__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalFeatureLangParser.g:1749:1: rule__ChangeStatement__Group__0__Impl : ( ( rule__ChangeStatement__Alternatives_0 ) ) ;
    public final void rule__ChangeStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1753:1: ( ( ( rule__ChangeStatement__Alternatives_0 ) ) )
            // InternalFeatureLangParser.g:1754:1: ( ( rule__ChangeStatement__Alternatives_0 ) )
            {
            // InternalFeatureLangParser.g:1754:1: ( ( rule__ChangeStatement__Alternatives_0 ) )
            // InternalFeatureLangParser.g:1755:2: ( rule__ChangeStatement__Alternatives_0 )
            {
             before(grammarAccess.getChangeStatementAccess().getAlternatives_0()); 
            // InternalFeatureLangParser.g:1756:2: ( rule__ChangeStatement__Alternatives_0 )
            // InternalFeatureLangParser.g:1756:3: rule__ChangeStatement__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__ChangeStatement__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getChangeStatementAccess().getAlternatives_0()); 

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
    // InternalFeatureLangParser.g:1764:1: rule__ChangeStatement__Group__1 : rule__ChangeStatement__Group__1__Impl ;
    public final void rule__ChangeStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1768:1: ( rule__ChangeStatement__Group__1__Impl )
            // InternalFeatureLangParser.g:1769:2: rule__ChangeStatement__Group__1__Impl
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
    // InternalFeatureLangParser.g:1775:1: rule__ChangeStatement__Group__1__Impl : ( ( rule__ChangeStatement__Alternatives_1 ) ) ;
    public final void rule__ChangeStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1779:1: ( ( ( rule__ChangeStatement__Alternatives_1 ) ) )
            // InternalFeatureLangParser.g:1780:1: ( ( rule__ChangeStatement__Alternatives_1 ) )
            {
            // InternalFeatureLangParser.g:1780:1: ( ( rule__ChangeStatement__Alternatives_1 ) )
            // InternalFeatureLangParser.g:1781:2: ( rule__ChangeStatement__Alternatives_1 )
            {
             before(grammarAccess.getChangeStatementAccess().getAlternatives_1()); 
            // InternalFeatureLangParser.g:1782:2: ( rule__ChangeStatement__Alternatives_1 )
            // InternalFeatureLangParser.g:1782:3: rule__ChangeStatement__Alternatives_1
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


    // $ANTLR start "rule__ChangeStatement__Group_0_0__0"
    // InternalFeatureLangParser.g:1791:1: rule__ChangeStatement__Group_0_0__0 : rule__ChangeStatement__Group_0_0__0__Impl rule__ChangeStatement__Group_0_0__1 ;
    public final void rule__ChangeStatement__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1795:1: ( rule__ChangeStatement__Group_0_0__0__Impl rule__ChangeStatement__Group_0_0__1 )
            // InternalFeatureLangParser.g:1796:2: rule__ChangeStatement__Group_0_0__0__Impl rule__ChangeStatement__Group_0_0__1
            {
            pushFollow(FOLLOW_7);
            rule__ChangeStatement__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeStatement__Group_0_0__1();

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
    // $ANTLR end "rule__ChangeStatement__Group_0_0__0"


    // $ANTLR start "rule__ChangeStatement__Group_0_0__0__Impl"
    // InternalFeatureLangParser.g:1803:1: rule__ChangeStatement__Group_0_0__0__Impl : ( ( rule__ChangeStatement__TargetAssignment_0_0_0 ) ) ;
    public final void rule__ChangeStatement__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1807:1: ( ( ( rule__ChangeStatement__TargetAssignment_0_0_0 ) ) )
            // InternalFeatureLangParser.g:1808:1: ( ( rule__ChangeStatement__TargetAssignment_0_0_0 ) )
            {
            // InternalFeatureLangParser.g:1808:1: ( ( rule__ChangeStatement__TargetAssignment_0_0_0 ) )
            // InternalFeatureLangParser.g:1809:2: ( rule__ChangeStatement__TargetAssignment_0_0_0 )
            {
             before(grammarAccess.getChangeStatementAccess().getTargetAssignment_0_0_0()); 
            // InternalFeatureLangParser.g:1810:2: ( rule__ChangeStatement__TargetAssignment_0_0_0 )
            // InternalFeatureLangParser.g:1810:3: rule__ChangeStatement__TargetAssignment_0_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ChangeStatement__TargetAssignment_0_0_0();

            state._fsp--;


            }

             after(grammarAccess.getChangeStatementAccess().getTargetAssignment_0_0_0()); 

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
    // $ANTLR end "rule__ChangeStatement__Group_0_0__0__Impl"


    // $ANTLR start "rule__ChangeStatement__Group_0_0__1"
    // InternalFeatureLangParser.g:1818:1: rule__ChangeStatement__Group_0_0__1 : rule__ChangeStatement__Group_0_0__1__Impl ;
    public final void rule__ChangeStatement__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1822:1: ( rule__ChangeStatement__Group_0_0__1__Impl )
            // InternalFeatureLangParser.g:1823:2: rule__ChangeStatement__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChangeStatement__Group_0_0__1__Impl();

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
    // $ANTLR end "rule__ChangeStatement__Group_0_0__1"


    // $ANTLR start "rule__ChangeStatement__Group_0_0__1__Impl"
    // InternalFeatureLangParser.g:1829:1: rule__ChangeStatement__Group_0_0__1__Impl : ( ( rule__ChangeStatement__Group_0_0_1__0 )? ) ;
    public final void rule__ChangeStatement__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1833:1: ( ( ( rule__ChangeStatement__Group_0_0_1__0 )? ) )
            // InternalFeatureLangParser.g:1834:1: ( ( rule__ChangeStatement__Group_0_0_1__0 )? )
            {
            // InternalFeatureLangParser.g:1834:1: ( ( rule__ChangeStatement__Group_0_0_1__0 )? )
            // InternalFeatureLangParser.g:1835:2: ( rule__ChangeStatement__Group_0_0_1__0 )?
            {
             before(grammarAccess.getChangeStatementAccess().getGroup_0_0_1()); 
            // InternalFeatureLangParser.g:1836:2: ( rule__ChangeStatement__Group_0_0_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Should||LA30_0==Must) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalFeatureLangParser.g:1836:3: rule__ChangeStatement__Group_0_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChangeStatement__Group_0_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChangeStatementAccess().getGroup_0_0_1()); 

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
    // $ANTLR end "rule__ChangeStatement__Group_0_0__1__Impl"


    // $ANTLR start "rule__ChangeStatement__Group_0_0_1__0"
    // InternalFeatureLangParser.g:1845:1: rule__ChangeStatement__Group_0_0_1__0 : rule__ChangeStatement__Group_0_0_1__0__Impl rule__ChangeStatement__Group_0_0_1__1 ;
    public final void rule__ChangeStatement__Group_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1849:1: ( rule__ChangeStatement__Group_0_0_1__0__Impl rule__ChangeStatement__Group_0_0_1__1 )
            // InternalFeatureLangParser.g:1850:2: rule__ChangeStatement__Group_0_0_1__0__Impl rule__ChangeStatement__Group_0_0_1__1
            {
            pushFollow(FOLLOW_8);
            rule__ChangeStatement__Group_0_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeStatement__Group_0_0_1__1();

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
    // $ANTLR end "rule__ChangeStatement__Group_0_0_1__0"


    // $ANTLR start "rule__ChangeStatement__Group_0_0_1__0__Impl"
    // InternalFeatureLangParser.g:1857:1: rule__ChangeStatement__Group_0_0_1__0__Impl : ( ( rule__ChangeStatement__PriorityAssignment_0_0_1_0 ) ) ;
    public final void rule__ChangeStatement__Group_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1861:1: ( ( ( rule__ChangeStatement__PriorityAssignment_0_0_1_0 ) ) )
            // InternalFeatureLangParser.g:1862:1: ( ( rule__ChangeStatement__PriorityAssignment_0_0_1_0 ) )
            {
            // InternalFeatureLangParser.g:1862:1: ( ( rule__ChangeStatement__PriorityAssignment_0_0_1_0 ) )
            // InternalFeatureLangParser.g:1863:2: ( rule__ChangeStatement__PriorityAssignment_0_0_1_0 )
            {
             before(grammarAccess.getChangeStatementAccess().getPriorityAssignment_0_0_1_0()); 
            // InternalFeatureLangParser.g:1864:2: ( rule__ChangeStatement__PriorityAssignment_0_0_1_0 )
            // InternalFeatureLangParser.g:1864:3: rule__ChangeStatement__PriorityAssignment_0_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ChangeStatement__PriorityAssignment_0_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getChangeStatementAccess().getPriorityAssignment_0_0_1_0()); 

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
    // $ANTLR end "rule__ChangeStatement__Group_0_0_1__0__Impl"


    // $ANTLR start "rule__ChangeStatement__Group_0_0_1__1"
    // InternalFeatureLangParser.g:1872:1: rule__ChangeStatement__Group_0_0_1__1 : rule__ChangeStatement__Group_0_0_1__1__Impl ;
    public final void rule__ChangeStatement__Group_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1876:1: ( rule__ChangeStatement__Group_0_0_1__1__Impl )
            // InternalFeatureLangParser.g:1877:2: rule__ChangeStatement__Group_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChangeStatement__Group_0_0_1__1__Impl();

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
    // $ANTLR end "rule__ChangeStatement__Group_0_0_1__1"


    // $ANTLR start "rule__ChangeStatement__Group_0_0_1__1__Impl"
    // InternalFeatureLangParser.g:1883:1: rule__ChangeStatement__Group_0_0_1__1__Impl : ( ( rule__ChangeStatement__NegationAssignment_0_0_1_1 )? ) ;
    public final void rule__ChangeStatement__Group_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1887:1: ( ( ( rule__ChangeStatement__NegationAssignment_0_0_1_1 )? ) )
            // InternalFeatureLangParser.g:1888:1: ( ( rule__ChangeStatement__NegationAssignment_0_0_1_1 )? )
            {
            // InternalFeatureLangParser.g:1888:1: ( ( rule__ChangeStatement__NegationAssignment_0_0_1_1 )? )
            // InternalFeatureLangParser.g:1889:2: ( rule__ChangeStatement__NegationAssignment_0_0_1_1 )?
            {
             before(grammarAccess.getChangeStatementAccess().getNegationAssignment_0_0_1_1()); 
            // InternalFeatureLangParser.g:1890:2: ( rule__ChangeStatement__NegationAssignment_0_0_1_1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Not) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalFeatureLangParser.g:1890:3: rule__ChangeStatement__NegationAssignment_0_0_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChangeStatement__NegationAssignment_0_0_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChangeStatementAccess().getNegationAssignment_0_0_1_1()); 

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
    // $ANTLR end "rule__ChangeStatement__Group_0_0_1__1__Impl"


    // $ANTLR start "rule__ChangeStatement__Group_0_1__0"
    // InternalFeatureLangParser.g:1899:1: rule__ChangeStatement__Group_0_1__0 : rule__ChangeStatement__Group_0_1__0__Impl rule__ChangeStatement__Group_0_1__1 ;
    public final void rule__ChangeStatement__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1903:1: ( rule__ChangeStatement__Group_0_1__0__Impl rule__ChangeStatement__Group_0_1__1 )
            // InternalFeatureLangParser.g:1904:2: rule__ChangeStatement__Group_0_1__0__Impl rule__ChangeStatement__Group_0_1__1
            {
            pushFollow(FOLLOW_9);
            rule__ChangeStatement__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeStatement__Group_0_1__1();

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
    // $ANTLR end "rule__ChangeStatement__Group_0_1__0"


    // $ANTLR start "rule__ChangeStatement__Group_0_1__0__Impl"
    // InternalFeatureLangParser.g:1911:1: rule__ChangeStatement__Group_0_1__0__Impl : ( ( rule__ChangeStatement__Alternatives_0_1_0 ) ) ;
    public final void rule__ChangeStatement__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1915:1: ( ( ( rule__ChangeStatement__Alternatives_0_1_0 ) ) )
            // InternalFeatureLangParser.g:1916:1: ( ( rule__ChangeStatement__Alternatives_0_1_0 ) )
            {
            // InternalFeatureLangParser.g:1916:1: ( ( rule__ChangeStatement__Alternatives_0_1_0 ) )
            // InternalFeatureLangParser.g:1917:2: ( rule__ChangeStatement__Alternatives_0_1_0 )
            {
             before(grammarAccess.getChangeStatementAccess().getAlternatives_0_1_0()); 
            // InternalFeatureLangParser.g:1918:2: ( rule__ChangeStatement__Alternatives_0_1_0 )
            // InternalFeatureLangParser.g:1918:3: rule__ChangeStatement__Alternatives_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ChangeStatement__Alternatives_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getChangeStatementAccess().getAlternatives_0_1_0()); 

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
    // $ANTLR end "rule__ChangeStatement__Group_0_1__0__Impl"


    // $ANTLR start "rule__ChangeStatement__Group_0_1__1"
    // InternalFeatureLangParser.g:1926:1: rule__ChangeStatement__Group_0_1__1 : rule__ChangeStatement__Group_0_1__1__Impl rule__ChangeStatement__Group_0_1__2 ;
    public final void rule__ChangeStatement__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1930:1: ( rule__ChangeStatement__Group_0_1__1__Impl rule__ChangeStatement__Group_0_1__2 )
            // InternalFeatureLangParser.g:1931:2: rule__ChangeStatement__Group_0_1__1__Impl rule__ChangeStatement__Group_0_1__2
            {
            pushFollow(FOLLOW_10);
            rule__ChangeStatement__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeStatement__Group_0_1__2();

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
    // $ANTLR end "rule__ChangeStatement__Group_0_1__1"


    // $ANTLR start "rule__ChangeStatement__Group_0_1__1__Impl"
    // InternalFeatureLangParser.g:1938:1: rule__ChangeStatement__Group_0_1__1__Impl : ( In ) ;
    public final void rule__ChangeStatement__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1942:1: ( ( In ) )
            // InternalFeatureLangParser.g:1943:1: ( In )
            {
            // InternalFeatureLangParser.g:1943:1: ( In )
            // InternalFeatureLangParser.g:1944:2: In
            {
             before(grammarAccess.getChangeStatementAccess().getInKeyword_0_1_1()); 
            match(input,In,FOLLOW_2); 
             after(grammarAccess.getChangeStatementAccess().getInKeyword_0_1_1()); 

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
    // $ANTLR end "rule__ChangeStatement__Group_0_1__1__Impl"


    // $ANTLR start "rule__ChangeStatement__Group_0_1__2"
    // InternalFeatureLangParser.g:1953:1: rule__ChangeStatement__Group_0_1__2 : rule__ChangeStatement__Group_0_1__2__Impl ;
    public final void rule__ChangeStatement__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1957:1: ( rule__ChangeStatement__Group_0_1__2__Impl )
            // InternalFeatureLangParser.g:1958:2: rule__ChangeStatement__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChangeStatement__Group_0_1__2__Impl();

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
    // $ANTLR end "rule__ChangeStatement__Group_0_1__2"


    // $ANTLR start "rule__ChangeStatement__Group_0_1__2__Impl"
    // InternalFeatureLangParser.g:1964:1: rule__ChangeStatement__Group_0_1__2__Impl : ( ( rule__ChangeStatement__TargetAssignment_0_1_2 ) ) ;
    public final void rule__ChangeStatement__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1968:1: ( ( ( rule__ChangeStatement__TargetAssignment_0_1_2 ) ) )
            // InternalFeatureLangParser.g:1969:1: ( ( rule__ChangeStatement__TargetAssignment_0_1_2 ) )
            {
            // InternalFeatureLangParser.g:1969:1: ( ( rule__ChangeStatement__TargetAssignment_0_1_2 ) )
            // InternalFeatureLangParser.g:1970:2: ( rule__ChangeStatement__TargetAssignment_0_1_2 )
            {
             before(grammarAccess.getChangeStatementAccess().getTargetAssignment_0_1_2()); 
            // InternalFeatureLangParser.g:1971:2: ( rule__ChangeStatement__TargetAssignment_0_1_2 )
            // InternalFeatureLangParser.g:1971:3: rule__ChangeStatement__TargetAssignment_0_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ChangeStatement__TargetAssignment_0_1_2();

            state._fsp--;


            }

             after(grammarAccess.getChangeStatementAccess().getTargetAssignment_0_1_2()); 

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
    // $ANTLR end "rule__ChangeStatement__Group_0_1__2__Impl"


    // $ANTLR start "rule__CreationStatement__Group_0__0"
    // InternalFeatureLangParser.g:1980:1: rule__CreationStatement__Group_0__0 : rule__CreationStatement__Group_0__0__Impl rule__CreationStatement__Group_0__1 ;
    public final void rule__CreationStatement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1984:1: ( rule__CreationStatement__Group_0__0__Impl rule__CreationStatement__Group_0__1 )
            // InternalFeatureLangParser.g:1985:2: rule__CreationStatement__Group_0__0__Impl rule__CreationStatement__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__CreationStatement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreationStatement__Group_0__1();

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
    // $ANTLR end "rule__CreationStatement__Group_0__0"


    // $ANTLR start "rule__CreationStatement__Group_0__0__Impl"
    // InternalFeatureLangParser.g:1992:1: rule__CreationStatement__Group_0__0__Impl : ( ( rule__CreationStatement__ClassElementAssignment_0_0 ) ) ;
    public final void rule__CreationStatement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1996:1: ( ( ( rule__CreationStatement__ClassElementAssignment_0_0 ) ) )
            // InternalFeatureLangParser.g:1997:1: ( ( rule__CreationStatement__ClassElementAssignment_0_0 ) )
            {
            // InternalFeatureLangParser.g:1997:1: ( ( rule__CreationStatement__ClassElementAssignment_0_0 ) )
            // InternalFeatureLangParser.g:1998:2: ( rule__CreationStatement__ClassElementAssignment_0_0 )
            {
             before(grammarAccess.getCreationStatementAccess().getClassElementAssignment_0_0()); 
            // InternalFeatureLangParser.g:1999:2: ( rule__CreationStatement__ClassElementAssignment_0_0 )
            // InternalFeatureLangParser.g:1999:3: rule__CreationStatement__ClassElementAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__CreationStatement__ClassElementAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getCreationStatementAccess().getClassElementAssignment_0_0()); 

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
    // $ANTLR end "rule__CreationStatement__Group_0__0__Impl"


    // $ANTLR start "rule__CreationStatement__Group_0__1"
    // InternalFeatureLangParser.g:2007:1: rule__CreationStatement__Group_0__1 : rule__CreationStatement__Group_0__1__Impl rule__CreationStatement__Group_0__2 ;
    public final void rule__CreationStatement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2011:1: ( rule__CreationStatement__Group_0__1__Impl rule__CreationStatement__Group_0__2 )
            // InternalFeatureLangParser.g:2012:2: rule__CreationStatement__Group_0__1__Impl rule__CreationStatement__Group_0__2
            {
            pushFollow(FOLLOW_11);
            rule__CreationStatement__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreationStatement__Group_0__2();

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
    // $ANTLR end "rule__CreationStatement__Group_0__1"


    // $ANTLR start "rule__CreationStatement__Group_0__1__Impl"
    // InternalFeatureLangParser.g:2019:1: rule__CreationStatement__Group_0__1__Impl : ( ( rule__CreationStatement__PriorityAssignment_0_1 ) ) ;
    public final void rule__CreationStatement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2023:1: ( ( ( rule__CreationStatement__PriorityAssignment_0_1 ) ) )
            // InternalFeatureLangParser.g:2024:1: ( ( rule__CreationStatement__PriorityAssignment_0_1 ) )
            {
            // InternalFeatureLangParser.g:2024:1: ( ( rule__CreationStatement__PriorityAssignment_0_1 ) )
            // InternalFeatureLangParser.g:2025:2: ( rule__CreationStatement__PriorityAssignment_0_1 )
            {
             before(grammarAccess.getCreationStatementAccess().getPriorityAssignment_0_1()); 
            // InternalFeatureLangParser.g:2026:2: ( rule__CreationStatement__PriorityAssignment_0_1 )
            // InternalFeatureLangParser.g:2026:3: rule__CreationStatement__PriorityAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__CreationStatement__PriorityAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCreationStatementAccess().getPriorityAssignment_0_1()); 

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
    // $ANTLR end "rule__CreationStatement__Group_0__1__Impl"


    // $ANTLR start "rule__CreationStatement__Group_0__2"
    // InternalFeatureLangParser.g:2034:1: rule__CreationStatement__Group_0__2 : rule__CreationStatement__Group_0__2__Impl rule__CreationStatement__Group_0__3 ;
    public final void rule__CreationStatement__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2038:1: ( rule__CreationStatement__Group_0__2__Impl rule__CreationStatement__Group_0__3 )
            // InternalFeatureLangParser.g:2039:2: rule__CreationStatement__Group_0__2__Impl rule__CreationStatement__Group_0__3
            {
            pushFollow(FOLLOW_11);
            rule__CreationStatement__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreationStatement__Group_0__3();

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
    // $ANTLR end "rule__CreationStatement__Group_0__2"


    // $ANTLR start "rule__CreationStatement__Group_0__2__Impl"
    // InternalFeatureLangParser.g:2046:1: rule__CreationStatement__Group_0__2__Impl : ( ( rule__CreationStatement__NegationAssignment_0_2 )? ) ;
    public final void rule__CreationStatement__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2050:1: ( ( ( rule__CreationStatement__NegationAssignment_0_2 )? ) )
            // InternalFeatureLangParser.g:2051:1: ( ( rule__CreationStatement__NegationAssignment_0_2 )? )
            {
            // InternalFeatureLangParser.g:2051:1: ( ( rule__CreationStatement__NegationAssignment_0_2 )? )
            // InternalFeatureLangParser.g:2052:2: ( rule__CreationStatement__NegationAssignment_0_2 )?
            {
             before(grammarAccess.getCreationStatementAccess().getNegationAssignment_0_2()); 
            // InternalFeatureLangParser.g:2053:2: ( rule__CreationStatement__NegationAssignment_0_2 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Not) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalFeatureLangParser.g:2053:3: rule__CreationStatement__NegationAssignment_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__CreationStatement__NegationAssignment_0_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCreationStatementAccess().getNegationAssignment_0_2()); 

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
    // $ANTLR end "rule__CreationStatement__Group_0__2__Impl"


    // $ANTLR start "rule__CreationStatement__Group_0__3"
    // InternalFeatureLangParser.g:2061:1: rule__CreationStatement__Group_0__3 : rule__CreationStatement__Group_0__3__Impl ;
    public final void rule__CreationStatement__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2065:1: ( rule__CreationStatement__Group_0__3__Impl )
            // InternalFeatureLangParser.g:2066:2: rule__CreationStatement__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CreationStatement__Group_0__3__Impl();

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
    // $ANTLR end "rule__CreationStatement__Group_0__3"


    // $ANTLR start "rule__CreationStatement__Group_0__3__Impl"
    // InternalFeatureLangParser.g:2072:1: rule__CreationStatement__Group_0__3__Impl : ( ( rule__CreationStatement__Alternatives_0_3 ) ) ;
    public final void rule__CreationStatement__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2076:1: ( ( ( rule__CreationStatement__Alternatives_0_3 ) ) )
            // InternalFeatureLangParser.g:2077:1: ( ( rule__CreationStatement__Alternatives_0_3 ) )
            {
            // InternalFeatureLangParser.g:2077:1: ( ( rule__CreationStatement__Alternatives_0_3 ) )
            // InternalFeatureLangParser.g:2078:2: ( rule__CreationStatement__Alternatives_0_3 )
            {
             before(grammarAccess.getCreationStatementAccess().getAlternatives_0_3()); 
            // InternalFeatureLangParser.g:2079:2: ( rule__CreationStatement__Alternatives_0_3 )
            // InternalFeatureLangParser.g:2079:3: rule__CreationStatement__Alternatives_0_3
            {
            pushFollow(FOLLOW_2);
            rule__CreationStatement__Alternatives_0_3();

            state._fsp--;


            }

             after(grammarAccess.getCreationStatementAccess().getAlternatives_0_3()); 

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
    // $ANTLR end "rule__CreationStatement__Group_0__3__Impl"


    // $ANTLR start "rule__CreationStatement__Group_1__0"
    // InternalFeatureLangParser.g:2088:1: rule__CreationStatement__Group_1__0 : rule__CreationStatement__Group_1__0__Impl rule__CreationStatement__Group_1__1 ;
    public final void rule__CreationStatement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2092:1: ( rule__CreationStatement__Group_1__0__Impl rule__CreationStatement__Group_1__1 )
            // InternalFeatureLangParser.g:2093:2: rule__CreationStatement__Group_1__0__Impl rule__CreationStatement__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__CreationStatement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreationStatement__Group_1__1();

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
    // $ANTLR end "rule__CreationStatement__Group_1__0"


    // $ANTLR start "rule__CreationStatement__Group_1__0__Impl"
    // InternalFeatureLangParser.g:2100:1: rule__CreationStatement__Group_1__0__Impl : ( ( rule__CreationStatement__Alternatives_1_0 ) ) ;
    public final void rule__CreationStatement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2104:1: ( ( ( rule__CreationStatement__Alternatives_1_0 ) ) )
            // InternalFeatureLangParser.g:2105:1: ( ( rule__CreationStatement__Alternatives_1_0 ) )
            {
            // InternalFeatureLangParser.g:2105:1: ( ( rule__CreationStatement__Alternatives_1_0 ) )
            // InternalFeatureLangParser.g:2106:2: ( rule__CreationStatement__Alternatives_1_0 )
            {
             before(grammarAccess.getCreationStatementAccess().getAlternatives_1_0()); 
            // InternalFeatureLangParser.g:2107:2: ( rule__CreationStatement__Alternatives_1_0 )
            // InternalFeatureLangParser.g:2107:3: rule__CreationStatement__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__CreationStatement__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCreationStatementAccess().getAlternatives_1_0()); 

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
    // $ANTLR end "rule__CreationStatement__Group_1__0__Impl"


    // $ANTLR start "rule__CreationStatement__Group_1__1"
    // InternalFeatureLangParser.g:2115:1: rule__CreationStatement__Group_1__1 : rule__CreationStatement__Group_1__1__Impl ;
    public final void rule__CreationStatement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2119:1: ( rule__CreationStatement__Group_1__1__Impl )
            // InternalFeatureLangParser.g:2120:2: rule__CreationStatement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CreationStatement__Group_1__1__Impl();

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
    // $ANTLR end "rule__CreationStatement__Group_1__1"


    // $ANTLR start "rule__CreationStatement__Group_1__1__Impl"
    // InternalFeatureLangParser.g:2126:1: rule__CreationStatement__Group_1__1__Impl : ( ( rule__CreationStatement__ClassElementAssignment_1_1 ) ) ;
    public final void rule__CreationStatement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2130:1: ( ( ( rule__CreationStatement__ClassElementAssignment_1_1 ) ) )
            // InternalFeatureLangParser.g:2131:1: ( ( rule__CreationStatement__ClassElementAssignment_1_1 ) )
            {
            // InternalFeatureLangParser.g:2131:1: ( ( rule__CreationStatement__ClassElementAssignment_1_1 ) )
            // InternalFeatureLangParser.g:2132:2: ( rule__CreationStatement__ClassElementAssignment_1_1 )
            {
             before(grammarAccess.getCreationStatementAccess().getClassElementAssignment_1_1()); 
            // InternalFeatureLangParser.g:2133:2: ( rule__CreationStatement__ClassElementAssignment_1_1 )
            // InternalFeatureLangParser.g:2133:3: rule__CreationStatement__ClassElementAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CreationStatement__ClassElementAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCreationStatementAccess().getClassElementAssignment_1_1()); 

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
    // $ANTLR end "rule__CreationStatement__Group_1__1__Impl"


    // $ANTLR start "rule__UpdateAction__Group__0"
    // InternalFeatureLangParser.g:2142:1: rule__UpdateAction__Group__0 : rule__UpdateAction__Group__0__Impl rule__UpdateAction__Group__1 ;
    public final void rule__UpdateAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2146:1: ( rule__UpdateAction__Group__0__Impl rule__UpdateAction__Group__1 )
            // InternalFeatureLangParser.g:2147:2: rule__UpdateAction__Group__0__Impl rule__UpdateAction__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalFeatureLangParser.g:2154:1: rule__UpdateAction__Group__0__Impl : ( ( Has )? ) ;
    public final void rule__UpdateAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2158:1: ( ( ( Has )? ) )
            // InternalFeatureLangParser.g:2159:1: ( ( Has )? )
            {
            // InternalFeatureLangParser.g:2159:1: ( ( Has )? )
            // InternalFeatureLangParser.g:2160:2: ( Has )?
            {
             before(grammarAccess.getUpdateActionAccess().getHasKeyword_0()); 
            // InternalFeatureLangParser.g:2161:2: ( Has )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Has) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalFeatureLangParser.g:2161:3: Has
                    {
                    match(input,Has,FOLLOW_2); 

                    }
                    break;

            }

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
    // InternalFeatureLangParser.g:2169:1: rule__UpdateAction__Group__1 : rule__UpdateAction__Group__1__Impl rule__UpdateAction__Group__2 ;
    public final void rule__UpdateAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2173:1: ( rule__UpdateAction__Group__1__Impl rule__UpdateAction__Group__2 )
            // InternalFeatureLangParser.g:2174:2: rule__UpdateAction__Group__1__Impl rule__UpdateAction__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalFeatureLangParser.g:2181:1: rule__UpdateAction__Group__1__Impl : ( ( rule__UpdateAction__Alternatives_1 ) ) ;
    public final void rule__UpdateAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2185:1: ( ( ( rule__UpdateAction__Alternatives_1 ) ) )
            // InternalFeatureLangParser.g:2186:1: ( ( rule__UpdateAction__Alternatives_1 ) )
            {
            // InternalFeatureLangParser.g:2186:1: ( ( rule__UpdateAction__Alternatives_1 ) )
            // InternalFeatureLangParser.g:2187:2: ( rule__UpdateAction__Alternatives_1 )
            {
             before(grammarAccess.getUpdateActionAccess().getAlternatives_1()); 
            // InternalFeatureLangParser.g:2188:2: ( rule__UpdateAction__Alternatives_1 )
            // InternalFeatureLangParser.g:2188:3: rule__UpdateAction__Alternatives_1
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
    // InternalFeatureLangParser.g:2196:1: rule__UpdateAction__Group__2 : rule__UpdateAction__Group__2__Impl rule__UpdateAction__Group__3 ;
    public final void rule__UpdateAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2200:1: ( rule__UpdateAction__Group__2__Impl rule__UpdateAction__Group__3 )
            // InternalFeatureLangParser.g:2201:2: rule__UpdateAction__Group__2__Impl rule__UpdateAction__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalFeatureLangParser.g:2208:1: rule__UpdateAction__Group__2__Impl : ( ( rule__UpdateAction__Alternatives_2 ) ) ;
    public final void rule__UpdateAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2212:1: ( ( ( rule__UpdateAction__Alternatives_2 ) ) )
            // InternalFeatureLangParser.g:2213:1: ( ( rule__UpdateAction__Alternatives_2 ) )
            {
            // InternalFeatureLangParser.g:2213:1: ( ( rule__UpdateAction__Alternatives_2 ) )
            // InternalFeatureLangParser.g:2214:2: ( rule__UpdateAction__Alternatives_2 )
            {
             before(grammarAccess.getUpdateActionAccess().getAlternatives_2()); 
            // InternalFeatureLangParser.g:2215:2: ( rule__UpdateAction__Alternatives_2 )
            // InternalFeatureLangParser.g:2215:3: rule__UpdateAction__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__UpdateAction__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getUpdateActionAccess().getAlternatives_2()); 

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
    // InternalFeatureLangParser.g:2223:1: rule__UpdateAction__Group__3 : rule__UpdateAction__Group__3__Impl rule__UpdateAction__Group__4 ;
    public final void rule__UpdateAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2227:1: ( rule__UpdateAction__Group__3__Impl rule__UpdateAction__Group__4 )
            // InternalFeatureLangParser.g:2228:2: rule__UpdateAction__Group__3__Impl rule__UpdateAction__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalFeatureLangParser.g:2235:1: rule__UpdateAction__Group__3__Impl : ( ( rule__UpdateAction__AttributeAssignment_3 ) ) ;
    public final void rule__UpdateAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2239:1: ( ( ( rule__UpdateAction__AttributeAssignment_3 ) ) )
            // InternalFeatureLangParser.g:2240:1: ( ( rule__UpdateAction__AttributeAssignment_3 ) )
            {
            // InternalFeatureLangParser.g:2240:1: ( ( rule__UpdateAction__AttributeAssignment_3 ) )
            // InternalFeatureLangParser.g:2241:2: ( rule__UpdateAction__AttributeAssignment_3 )
            {
             before(grammarAccess.getUpdateActionAccess().getAttributeAssignment_3()); 
            // InternalFeatureLangParser.g:2242:2: ( rule__UpdateAction__AttributeAssignment_3 )
            // InternalFeatureLangParser.g:2242:3: rule__UpdateAction__AttributeAssignment_3
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
    // InternalFeatureLangParser.g:2250:1: rule__UpdateAction__Group__4 : rule__UpdateAction__Group__4__Impl rule__UpdateAction__Group__5 ;
    public final void rule__UpdateAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2254:1: ( rule__UpdateAction__Group__4__Impl rule__UpdateAction__Group__5 )
            // InternalFeatureLangParser.g:2255:2: rule__UpdateAction__Group__4__Impl rule__UpdateAction__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalFeatureLangParser.g:2262:1: rule__UpdateAction__Group__4__Impl : ( FullStop ) ;
    public final void rule__UpdateAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2266:1: ( ( FullStop ) )
            // InternalFeatureLangParser.g:2267:1: ( FullStop )
            {
            // InternalFeatureLangParser.g:2267:1: ( FullStop )
            // InternalFeatureLangParser.g:2268:2: FullStop
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
    // InternalFeatureLangParser.g:2277:1: rule__UpdateAction__Group__5 : rule__UpdateAction__Group__5__Impl rule__UpdateAction__Group__6 ;
    public final void rule__UpdateAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2281:1: ( rule__UpdateAction__Group__5__Impl rule__UpdateAction__Group__6 )
            // InternalFeatureLangParser.g:2282:2: rule__UpdateAction__Group__5__Impl rule__UpdateAction__Group__6
            {
            pushFollow(FOLLOW_7);
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
    // InternalFeatureLangParser.g:2289:1: rule__UpdateAction__Group__5__Impl : ( It ) ;
    public final void rule__UpdateAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2293:1: ( ( It ) )
            // InternalFeatureLangParser.g:2294:1: ( It )
            {
            // InternalFeatureLangParser.g:2294:1: ( It )
            // InternalFeatureLangParser.g:2295:2: It
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
    // InternalFeatureLangParser.g:2304:1: rule__UpdateAction__Group__6 : rule__UpdateAction__Group__6__Impl rule__UpdateAction__Group__7 ;
    public final void rule__UpdateAction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2308:1: ( rule__UpdateAction__Group__6__Impl rule__UpdateAction__Group__7 )
            // InternalFeatureLangParser.g:2309:2: rule__UpdateAction__Group__6__Impl rule__UpdateAction__Group__7
            {
            pushFollow(FOLLOW_15);
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
    // InternalFeatureLangParser.g:2316:1: rule__UpdateAction__Group__6__Impl : ( ( rule__UpdateAction__PriorityAssignment_6 ) ) ;
    public final void rule__UpdateAction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2320:1: ( ( ( rule__UpdateAction__PriorityAssignment_6 ) ) )
            // InternalFeatureLangParser.g:2321:1: ( ( rule__UpdateAction__PriorityAssignment_6 ) )
            {
            // InternalFeatureLangParser.g:2321:1: ( ( rule__UpdateAction__PriorityAssignment_6 ) )
            // InternalFeatureLangParser.g:2322:2: ( rule__UpdateAction__PriorityAssignment_6 )
            {
             before(grammarAccess.getUpdateActionAccess().getPriorityAssignment_6()); 
            // InternalFeatureLangParser.g:2323:2: ( rule__UpdateAction__PriorityAssignment_6 )
            // InternalFeatureLangParser.g:2323:3: rule__UpdateAction__PriorityAssignment_6
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
    // InternalFeatureLangParser.g:2331:1: rule__UpdateAction__Group__7 : rule__UpdateAction__Group__7__Impl ;
    public final void rule__UpdateAction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2335:1: ( rule__UpdateAction__Group__7__Impl )
            // InternalFeatureLangParser.g:2336:2: rule__UpdateAction__Group__7__Impl
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
    // InternalFeatureLangParser.g:2342:1: rule__UpdateAction__Group__7__Impl : ( ( rule__UpdateAction__Alternatives_7 ) ) ;
    public final void rule__UpdateAction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2346:1: ( ( ( rule__UpdateAction__Alternatives_7 ) ) )
            // InternalFeatureLangParser.g:2347:1: ( ( rule__UpdateAction__Alternatives_7 ) )
            {
            // InternalFeatureLangParser.g:2347:1: ( ( rule__UpdateAction__Alternatives_7 ) )
            // InternalFeatureLangParser.g:2348:2: ( rule__UpdateAction__Alternatives_7 )
            {
             before(grammarAccess.getUpdateActionAccess().getAlternatives_7()); 
            // InternalFeatureLangParser.g:2349:2: ( rule__UpdateAction__Alternatives_7 )
            // InternalFeatureLangParser.g:2349:3: rule__UpdateAction__Alternatives_7
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
    // InternalFeatureLangParser.g:2358:1: rule__UpdateAttributeDatatype__Group__0 : rule__UpdateAttributeDatatype__Group__0__Impl rule__UpdateAttributeDatatype__Group__1 ;
    public final void rule__UpdateAttributeDatatype__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2362:1: ( rule__UpdateAttributeDatatype__Group__0__Impl rule__UpdateAttributeDatatype__Group__1 )
            // InternalFeatureLangParser.g:2363:2: rule__UpdateAttributeDatatype__Group__0__Impl rule__UpdateAttributeDatatype__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalFeatureLangParser.g:2370:1: rule__UpdateAttributeDatatype__Group__0__Impl : ( Be ) ;
    public final void rule__UpdateAttributeDatatype__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2374:1: ( ( Be ) )
            // InternalFeatureLangParser.g:2375:1: ( Be )
            {
            // InternalFeatureLangParser.g:2375:1: ( Be )
            // InternalFeatureLangParser.g:2376:2: Be
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
    // InternalFeatureLangParser.g:2385:1: rule__UpdateAttributeDatatype__Group__1 : rule__UpdateAttributeDatatype__Group__1__Impl rule__UpdateAttributeDatatype__Group__2 ;
    public final void rule__UpdateAttributeDatatype__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2389:1: ( rule__UpdateAttributeDatatype__Group__1__Impl rule__UpdateAttributeDatatype__Group__2 )
            // InternalFeatureLangParser.g:2390:2: rule__UpdateAttributeDatatype__Group__1__Impl rule__UpdateAttributeDatatype__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalFeatureLangParser.g:2397:1: rule__UpdateAttributeDatatype__Group__1__Impl : ( A ) ;
    public final void rule__UpdateAttributeDatatype__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2401:1: ( ( A ) )
            // InternalFeatureLangParser.g:2402:1: ( A )
            {
            // InternalFeatureLangParser.g:2402:1: ( A )
            // InternalFeatureLangParser.g:2403:2: A
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
    // InternalFeatureLangParser.g:2412:1: rule__UpdateAttributeDatatype__Group__2 : rule__UpdateAttributeDatatype__Group__2__Impl ;
    public final void rule__UpdateAttributeDatatype__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2416:1: ( rule__UpdateAttributeDatatype__Group__2__Impl )
            // InternalFeatureLangParser.g:2417:2: rule__UpdateAttributeDatatype__Group__2__Impl
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
    // InternalFeatureLangParser.g:2423:1: rule__UpdateAttributeDatatype__Group__2__Impl : ( ( rule__UpdateAttributeDatatype__TypeAssignment_2 ) ) ;
    public final void rule__UpdateAttributeDatatype__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2427:1: ( ( ( rule__UpdateAttributeDatatype__TypeAssignment_2 ) ) )
            // InternalFeatureLangParser.g:2428:1: ( ( rule__UpdateAttributeDatatype__TypeAssignment_2 ) )
            {
            // InternalFeatureLangParser.g:2428:1: ( ( rule__UpdateAttributeDatatype__TypeAssignment_2 ) )
            // InternalFeatureLangParser.g:2429:2: ( rule__UpdateAttributeDatatype__TypeAssignment_2 )
            {
             before(grammarAccess.getUpdateAttributeDatatypeAccess().getTypeAssignment_2()); 
            // InternalFeatureLangParser.g:2430:2: ( rule__UpdateAttributeDatatype__TypeAssignment_2 )
            // InternalFeatureLangParser.g:2430:3: rule__UpdateAttributeDatatype__TypeAssignment_2
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
    // InternalFeatureLangParser.g:2439:1: rule__UpdateAttributeIdentifier__Group__0 : rule__UpdateAttributeIdentifier__Group__0__Impl rule__UpdateAttributeIdentifier__Group__1 ;
    public final void rule__UpdateAttributeIdentifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2443:1: ( rule__UpdateAttributeIdentifier__Group__0__Impl rule__UpdateAttributeIdentifier__Group__1 )
            // InternalFeatureLangParser.g:2444:2: rule__UpdateAttributeIdentifier__Group__0__Impl rule__UpdateAttributeIdentifier__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalFeatureLangParser.g:2451:1: rule__UpdateAttributeIdentifier__Group__0__Impl : ( Have ) ;
    public final void rule__UpdateAttributeIdentifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2455:1: ( ( Have ) )
            // InternalFeatureLangParser.g:2456:1: ( Have )
            {
            // InternalFeatureLangParser.g:2456:1: ( Have )
            // InternalFeatureLangParser.g:2457:2: Have
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
    // InternalFeatureLangParser.g:2466:1: rule__UpdateAttributeIdentifier__Group__1 : rule__UpdateAttributeIdentifier__Group__1__Impl rule__UpdateAttributeIdentifier__Group__2 ;
    public final void rule__UpdateAttributeIdentifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2470:1: ( rule__UpdateAttributeIdentifier__Group__1__Impl rule__UpdateAttributeIdentifier__Group__2 )
            // InternalFeatureLangParser.g:2471:2: rule__UpdateAttributeIdentifier__Group__1__Impl rule__UpdateAttributeIdentifier__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalFeatureLangParser.g:2478:1: rule__UpdateAttributeIdentifier__Group__1__Impl : ( ( rule__UpdateAttributeIdentifier__Alternatives_1 )? ) ;
    public final void rule__UpdateAttributeIdentifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2482:1: ( ( ( rule__UpdateAttributeIdentifier__Alternatives_1 )? ) )
            // InternalFeatureLangParser.g:2483:1: ( ( rule__UpdateAttributeIdentifier__Alternatives_1 )? )
            {
            // InternalFeatureLangParser.g:2483:1: ( ( rule__UpdateAttributeIdentifier__Alternatives_1 )? )
            // InternalFeatureLangParser.g:2484:2: ( rule__UpdateAttributeIdentifier__Alternatives_1 )?
            {
             before(grammarAccess.getUpdateAttributeIdentifierAccess().getAlternatives_1()); 
            // InternalFeatureLangParser.g:2485:2: ( rule__UpdateAttributeIdentifier__Alternatives_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==An||LA34_0==A) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalFeatureLangParser.g:2485:3: rule__UpdateAttributeIdentifier__Alternatives_1
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
    // InternalFeatureLangParser.g:2493:1: rule__UpdateAttributeIdentifier__Group__2 : rule__UpdateAttributeIdentifier__Group__2__Impl ;
    public final void rule__UpdateAttributeIdentifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2497:1: ( rule__UpdateAttributeIdentifier__Group__2__Impl )
            // InternalFeatureLangParser.g:2498:2: rule__UpdateAttributeIdentifier__Group__2__Impl
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
    // InternalFeatureLangParser.g:2504:1: rule__UpdateAttributeIdentifier__Group__2__Impl : ( ( rule__UpdateAttributeIdentifier__IdentifierAssignment_2 ) ) ;
    public final void rule__UpdateAttributeIdentifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2508:1: ( ( ( rule__UpdateAttributeIdentifier__IdentifierAssignment_2 ) ) )
            // InternalFeatureLangParser.g:2509:1: ( ( rule__UpdateAttributeIdentifier__IdentifierAssignment_2 ) )
            {
            // InternalFeatureLangParser.g:2509:1: ( ( rule__UpdateAttributeIdentifier__IdentifierAssignment_2 ) )
            // InternalFeatureLangParser.g:2510:2: ( rule__UpdateAttributeIdentifier__IdentifierAssignment_2 )
            {
             before(grammarAccess.getUpdateAttributeIdentifierAccess().getIdentifierAssignment_2()); 
            // InternalFeatureLangParser.g:2511:2: ( rule__UpdateAttributeIdentifier__IdentifierAssignment_2 )
            // InternalFeatureLangParser.g:2511:3: rule__UpdateAttributeIdentifier__IdentifierAssignment_2
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
    // InternalFeatureLangParser.g:2520:1: rule__UpdateAttributeValue__Group__0 : rule__UpdateAttributeValue__Group__0__Impl rule__UpdateAttributeValue__Group__1 ;
    public final void rule__UpdateAttributeValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2524:1: ( rule__UpdateAttributeValue__Group__0__Impl rule__UpdateAttributeValue__Group__1 )
            // InternalFeatureLangParser.g:2525:2: rule__UpdateAttributeValue__Group__0__Impl rule__UpdateAttributeValue__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalFeatureLangParser.g:2532:1: rule__UpdateAttributeValue__Group__0__Impl : ( Have ) ;
    public final void rule__UpdateAttributeValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2536:1: ( ( Have ) )
            // InternalFeatureLangParser.g:2537:1: ( Have )
            {
            // InternalFeatureLangParser.g:2537:1: ( Have )
            // InternalFeatureLangParser.g:2538:2: Have
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
    // InternalFeatureLangParser.g:2547:1: rule__UpdateAttributeValue__Group__1 : rule__UpdateAttributeValue__Group__1__Impl rule__UpdateAttributeValue__Group__2 ;
    public final void rule__UpdateAttributeValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2551:1: ( rule__UpdateAttributeValue__Group__1__Impl rule__UpdateAttributeValue__Group__2 )
            // InternalFeatureLangParser.g:2552:2: rule__UpdateAttributeValue__Group__1__Impl rule__UpdateAttributeValue__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalFeatureLangParser.g:2559:1: rule__UpdateAttributeValue__Group__1__Impl : ( ( A )? ) ;
    public final void rule__UpdateAttributeValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2563:1: ( ( ( A )? ) )
            // InternalFeatureLangParser.g:2564:1: ( ( A )? )
            {
            // InternalFeatureLangParser.g:2564:1: ( ( A )? )
            // InternalFeatureLangParser.g:2565:2: ( A )?
            {
             before(grammarAccess.getUpdateAttributeValueAccess().getAKeyword_1()); 
            // InternalFeatureLangParser.g:2566:2: ( A )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==A) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalFeatureLangParser.g:2566:3: A
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
    // InternalFeatureLangParser.g:2574:1: rule__UpdateAttributeValue__Group__2 : rule__UpdateAttributeValue__Group__2__Impl rule__UpdateAttributeValue__Group__3 ;
    public final void rule__UpdateAttributeValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2578:1: ( rule__UpdateAttributeValue__Group__2__Impl rule__UpdateAttributeValue__Group__3 )
            // InternalFeatureLangParser.g:2579:2: rule__UpdateAttributeValue__Group__2__Impl rule__UpdateAttributeValue__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalFeatureLangParser.g:2586:1: rule__UpdateAttributeValue__Group__2__Impl : ( Value ) ;
    public final void rule__UpdateAttributeValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2590:1: ( ( Value ) )
            // InternalFeatureLangParser.g:2591:1: ( Value )
            {
            // InternalFeatureLangParser.g:2591:1: ( Value )
            // InternalFeatureLangParser.g:2592:2: Value
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
    // InternalFeatureLangParser.g:2601:1: rule__UpdateAttributeValue__Group__3 : rule__UpdateAttributeValue__Group__3__Impl ;
    public final void rule__UpdateAttributeValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2605:1: ( rule__UpdateAttributeValue__Group__3__Impl )
            // InternalFeatureLangParser.g:2606:2: rule__UpdateAttributeValue__Group__3__Impl
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
    // InternalFeatureLangParser.g:2612:1: rule__UpdateAttributeValue__Group__3__Impl : ( ( rule__UpdateAttributeValue__ValueAssignment_3 ) ) ;
    public final void rule__UpdateAttributeValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2616:1: ( ( ( rule__UpdateAttributeValue__ValueAssignment_3 ) ) )
            // InternalFeatureLangParser.g:2617:1: ( ( rule__UpdateAttributeValue__ValueAssignment_3 ) )
            {
            // InternalFeatureLangParser.g:2617:1: ( ( rule__UpdateAttributeValue__ValueAssignment_3 ) )
            // InternalFeatureLangParser.g:2618:2: ( rule__UpdateAttributeValue__ValueAssignment_3 )
            {
             before(grammarAccess.getUpdateAttributeValueAccess().getValueAssignment_3()); 
            // InternalFeatureLangParser.g:2619:2: ( rule__UpdateAttributeValue__ValueAssignment_3 )
            // InternalFeatureLangParser.g:2619:3: rule__UpdateAttributeValue__ValueAssignment_3
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
    // InternalFeatureLangParser.g:2628:1: rule__AttributeAction__Group__0 : rule__AttributeAction__Group__0__Impl rule__AttributeAction__Group__1 ;
    public final void rule__AttributeAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2632:1: ( rule__AttributeAction__Group__0__Impl rule__AttributeAction__Group__1 )
            // InternalFeatureLangParser.g:2633:2: rule__AttributeAction__Group__0__Impl rule__AttributeAction__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalFeatureLangParser.g:2640:1: rule__AttributeAction__Group__0__Impl : ( ( Have )? ) ;
    public final void rule__AttributeAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2644:1: ( ( ( Have )? ) )
            // InternalFeatureLangParser.g:2645:1: ( ( Have )? )
            {
            // InternalFeatureLangParser.g:2645:1: ( ( Have )? )
            // InternalFeatureLangParser.g:2646:2: ( Have )?
            {
             before(grammarAccess.getAttributeActionAccess().getHaveKeyword_0()); 
            // InternalFeatureLangParser.g:2647:2: ( Have )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Have) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalFeatureLangParser.g:2647:3: Have
                    {
                    match(input,Have,FOLLOW_2); 

                    }
                    break;

            }

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
    // InternalFeatureLangParser.g:2655:1: rule__AttributeAction__Group__1 : rule__AttributeAction__Group__1__Impl rule__AttributeAction__Group__2 ;
    public final void rule__AttributeAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2659:1: ( rule__AttributeAction__Group__1__Impl rule__AttributeAction__Group__2 )
            // InternalFeatureLangParser.g:2660:2: rule__AttributeAction__Group__1__Impl rule__AttributeAction__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalFeatureLangParser.g:2667:1: rule__AttributeAction__Group__1__Impl : ( ( rule__AttributeAction__Alternatives_1 ) ) ;
    public final void rule__AttributeAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2671:1: ( ( ( rule__AttributeAction__Alternatives_1 ) ) )
            // InternalFeatureLangParser.g:2672:1: ( ( rule__AttributeAction__Alternatives_1 ) )
            {
            // InternalFeatureLangParser.g:2672:1: ( ( rule__AttributeAction__Alternatives_1 ) )
            // InternalFeatureLangParser.g:2673:2: ( rule__AttributeAction__Alternatives_1 )
            {
             before(grammarAccess.getAttributeActionAccess().getAlternatives_1()); 
            // InternalFeatureLangParser.g:2674:2: ( rule__AttributeAction__Alternatives_1 )
            // InternalFeatureLangParser.g:2674:3: rule__AttributeAction__Alternatives_1
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
    // InternalFeatureLangParser.g:2682:1: rule__AttributeAction__Group__2 : rule__AttributeAction__Group__2__Impl rule__AttributeAction__Group__3 ;
    public final void rule__AttributeAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2686:1: ( rule__AttributeAction__Group__2__Impl rule__AttributeAction__Group__3 )
            // InternalFeatureLangParser.g:2687:2: rule__AttributeAction__Group__2__Impl rule__AttributeAction__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalFeatureLangParser.g:2694:1: rule__AttributeAction__Group__2__Impl : ( ( rule__AttributeAction__AttributeAssignment_2 ) ) ;
    public final void rule__AttributeAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2698:1: ( ( ( rule__AttributeAction__AttributeAssignment_2 ) ) )
            // InternalFeatureLangParser.g:2699:1: ( ( rule__AttributeAction__AttributeAssignment_2 ) )
            {
            // InternalFeatureLangParser.g:2699:1: ( ( rule__AttributeAction__AttributeAssignment_2 ) )
            // InternalFeatureLangParser.g:2700:2: ( rule__AttributeAction__AttributeAssignment_2 )
            {
             before(grammarAccess.getAttributeActionAccess().getAttributeAssignment_2()); 
            // InternalFeatureLangParser.g:2701:2: ( rule__AttributeAction__AttributeAssignment_2 )
            // InternalFeatureLangParser.g:2701:3: rule__AttributeAction__AttributeAssignment_2
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
    // InternalFeatureLangParser.g:2709:1: rule__AttributeAction__Group__3 : rule__AttributeAction__Group__3__Impl rule__AttributeAction__Group__4 ;
    public final void rule__AttributeAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2713:1: ( rule__AttributeAction__Group__3__Impl rule__AttributeAction__Group__4 )
            // InternalFeatureLangParser.g:2714:2: rule__AttributeAction__Group__3__Impl rule__AttributeAction__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__AttributeAction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeAction__Group__4();

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
    // InternalFeatureLangParser.g:2721:1: rule__AttributeAction__Group__3__Impl : ( ( rule__AttributeAction__Group_3__0 )? ) ;
    public final void rule__AttributeAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2725:1: ( ( ( rule__AttributeAction__Group_3__0 )? ) )
            // InternalFeatureLangParser.g:2726:1: ( ( rule__AttributeAction__Group_3__0 )? )
            {
            // InternalFeatureLangParser.g:2726:1: ( ( rule__AttributeAction__Group_3__0 )? )
            // InternalFeatureLangParser.g:2727:2: ( rule__AttributeAction__Group_3__0 )?
            {
             before(grammarAccess.getAttributeActionAccess().getGroup_3()); 
            // InternalFeatureLangParser.g:2728:2: ( rule__AttributeAction__Group_3__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==FullStop) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==It) ) {
                    int LA37_3 = input.LA(3);

                    if ( (LA37_3==Is) ) {
                        alt37=1;
                    }
                }
            }
            switch (alt37) {
                case 1 :
                    // InternalFeatureLangParser.g:2728:3: rule__AttributeAction__Group_3__0
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


    // $ANTLR start "rule__AttributeAction__Group__4"
    // InternalFeatureLangParser.g:2736:1: rule__AttributeAction__Group__4 : rule__AttributeAction__Group__4__Impl ;
    public final void rule__AttributeAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2740:1: ( rule__AttributeAction__Group__4__Impl )
            // InternalFeatureLangParser.g:2741:2: rule__AttributeAction__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeAction__Group__4__Impl();

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
    // $ANTLR end "rule__AttributeAction__Group__4"


    // $ANTLR start "rule__AttributeAction__Group__4__Impl"
    // InternalFeatureLangParser.g:2747:1: rule__AttributeAction__Group__4__Impl : ( ( rule__AttributeAction__Group_4__0 )? ) ;
    public final void rule__AttributeAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2751:1: ( ( ( rule__AttributeAction__Group_4__0 )? ) )
            // InternalFeatureLangParser.g:2752:1: ( ( rule__AttributeAction__Group_4__0 )? )
            {
            // InternalFeatureLangParser.g:2752:1: ( ( rule__AttributeAction__Group_4__0 )? )
            // InternalFeatureLangParser.g:2753:2: ( rule__AttributeAction__Group_4__0 )?
            {
             before(grammarAccess.getAttributeActionAccess().getGroup_4()); 
            // InternalFeatureLangParser.g:2754:2: ( rule__AttributeAction__Group_4__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==FullStop) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==It) ) {
                    alt38=1;
                }
            }
            switch (alt38) {
                case 1 :
                    // InternalFeatureLangParser.g:2754:3: rule__AttributeAction__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeAction__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeActionAccess().getGroup_4()); 

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
    // $ANTLR end "rule__AttributeAction__Group__4__Impl"


    // $ANTLR start "rule__AttributeAction__Group_3__0"
    // InternalFeatureLangParser.g:2763:1: rule__AttributeAction__Group_3__0 : rule__AttributeAction__Group_3__0__Impl rule__AttributeAction__Group_3__1 ;
    public final void rule__AttributeAction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2767:1: ( rule__AttributeAction__Group_3__0__Impl rule__AttributeAction__Group_3__1 )
            // InternalFeatureLangParser.g:2768:2: rule__AttributeAction__Group_3__0__Impl rule__AttributeAction__Group_3__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalFeatureLangParser.g:2775:1: rule__AttributeAction__Group_3__0__Impl : ( FullStop ) ;
    public final void rule__AttributeAction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2779:1: ( ( FullStop ) )
            // InternalFeatureLangParser.g:2780:1: ( FullStop )
            {
            // InternalFeatureLangParser.g:2780:1: ( FullStop )
            // InternalFeatureLangParser.g:2781:2: FullStop
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
    // InternalFeatureLangParser.g:2790:1: rule__AttributeAction__Group_3__1 : rule__AttributeAction__Group_3__1__Impl rule__AttributeAction__Group_3__2 ;
    public final void rule__AttributeAction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2794:1: ( rule__AttributeAction__Group_3__1__Impl rule__AttributeAction__Group_3__2 )
            // InternalFeatureLangParser.g:2795:2: rule__AttributeAction__Group_3__1__Impl rule__AttributeAction__Group_3__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalFeatureLangParser.g:2802:1: rule__AttributeAction__Group_3__1__Impl : ( It ) ;
    public final void rule__AttributeAction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2806:1: ( ( It ) )
            // InternalFeatureLangParser.g:2807:1: ( It )
            {
            // InternalFeatureLangParser.g:2807:1: ( It )
            // InternalFeatureLangParser.g:2808:2: It
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
    // InternalFeatureLangParser.g:2817:1: rule__AttributeAction__Group_3__2 : rule__AttributeAction__Group_3__2__Impl rule__AttributeAction__Group_3__3 ;
    public final void rule__AttributeAction__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2821:1: ( rule__AttributeAction__Group_3__2__Impl rule__AttributeAction__Group_3__3 )
            // InternalFeatureLangParser.g:2822:2: rule__AttributeAction__Group_3__2__Impl rule__AttributeAction__Group_3__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalFeatureLangParser.g:2829:1: rule__AttributeAction__Group_3__2__Impl : ( Is ) ;
    public final void rule__AttributeAction__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2833:1: ( ( Is ) )
            // InternalFeatureLangParser.g:2834:1: ( Is )
            {
            // InternalFeatureLangParser.g:2834:1: ( Is )
            // InternalFeatureLangParser.g:2835:2: Is
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
    // InternalFeatureLangParser.g:2844:1: rule__AttributeAction__Group_3__3 : rule__AttributeAction__Group_3__3__Impl rule__AttributeAction__Group_3__4 ;
    public final void rule__AttributeAction__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2848:1: ( rule__AttributeAction__Group_3__3__Impl rule__AttributeAction__Group_3__4 )
            // InternalFeatureLangParser.g:2849:2: rule__AttributeAction__Group_3__3__Impl rule__AttributeAction__Group_3__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalFeatureLangParser.g:2856:1: rule__AttributeAction__Group_3__3__Impl : ( A ) ;
    public final void rule__AttributeAction__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2860:1: ( ( A ) )
            // InternalFeatureLangParser.g:2861:1: ( A )
            {
            // InternalFeatureLangParser.g:2861:1: ( A )
            // InternalFeatureLangParser.g:2862:2: A
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
    // InternalFeatureLangParser.g:2871:1: rule__AttributeAction__Group_3__4 : rule__AttributeAction__Group_3__4__Impl ;
    public final void rule__AttributeAction__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2875:1: ( rule__AttributeAction__Group_3__4__Impl )
            // InternalFeatureLangParser.g:2876:2: rule__AttributeAction__Group_3__4__Impl
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
    // InternalFeatureLangParser.g:2882:1: rule__AttributeAction__Group_3__4__Impl : ( ( rule__AttributeAction__TypeAssignment_3_4 ) ) ;
    public final void rule__AttributeAction__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2886:1: ( ( ( rule__AttributeAction__TypeAssignment_3_4 ) ) )
            // InternalFeatureLangParser.g:2887:1: ( ( rule__AttributeAction__TypeAssignment_3_4 ) )
            {
            // InternalFeatureLangParser.g:2887:1: ( ( rule__AttributeAction__TypeAssignment_3_4 ) )
            // InternalFeatureLangParser.g:2888:2: ( rule__AttributeAction__TypeAssignment_3_4 )
            {
             before(grammarAccess.getAttributeActionAccess().getTypeAssignment_3_4()); 
            // InternalFeatureLangParser.g:2889:2: ( rule__AttributeAction__TypeAssignment_3_4 )
            // InternalFeatureLangParser.g:2889:3: rule__AttributeAction__TypeAssignment_3_4
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


    // $ANTLR start "rule__AttributeAction__Group_4__0"
    // InternalFeatureLangParser.g:2898:1: rule__AttributeAction__Group_4__0 : rule__AttributeAction__Group_4__0__Impl rule__AttributeAction__Group_4__1 ;
    public final void rule__AttributeAction__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2902:1: ( rule__AttributeAction__Group_4__0__Impl rule__AttributeAction__Group_4__1 )
            // InternalFeatureLangParser.g:2903:2: rule__AttributeAction__Group_4__0__Impl rule__AttributeAction__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__AttributeAction__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeAction__Group_4__1();

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
    // $ANTLR end "rule__AttributeAction__Group_4__0"


    // $ANTLR start "rule__AttributeAction__Group_4__0__Impl"
    // InternalFeatureLangParser.g:2910:1: rule__AttributeAction__Group_4__0__Impl : ( FullStop ) ;
    public final void rule__AttributeAction__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2914:1: ( ( FullStop ) )
            // InternalFeatureLangParser.g:2915:1: ( FullStop )
            {
            // InternalFeatureLangParser.g:2915:1: ( FullStop )
            // InternalFeatureLangParser.g:2916:2: FullStop
            {
             before(grammarAccess.getAttributeActionAccess().getFullStopKeyword_4_0()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getAttributeActionAccess().getFullStopKeyword_4_0()); 

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
    // $ANTLR end "rule__AttributeAction__Group_4__0__Impl"


    // $ANTLR start "rule__AttributeAction__Group_4__1"
    // InternalFeatureLangParser.g:2925:1: rule__AttributeAction__Group_4__1 : rule__AttributeAction__Group_4__1__Impl rule__AttributeAction__Group_4__2 ;
    public final void rule__AttributeAction__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2929:1: ( rule__AttributeAction__Group_4__1__Impl rule__AttributeAction__Group_4__2 )
            // InternalFeatureLangParser.g:2930:2: rule__AttributeAction__Group_4__1__Impl rule__AttributeAction__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__AttributeAction__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeAction__Group_4__2();

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
    // $ANTLR end "rule__AttributeAction__Group_4__1"


    // $ANTLR start "rule__AttributeAction__Group_4__1__Impl"
    // InternalFeatureLangParser.g:2937:1: rule__AttributeAction__Group_4__1__Impl : ( It ) ;
    public final void rule__AttributeAction__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2941:1: ( ( It ) )
            // InternalFeatureLangParser.g:2942:1: ( It )
            {
            // InternalFeatureLangParser.g:2942:1: ( It )
            // InternalFeatureLangParser.g:2943:2: It
            {
             before(grammarAccess.getAttributeActionAccess().getItKeyword_4_1()); 
            match(input,It,FOLLOW_2); 
             after(grammarAccess.getAttributeActionAccess().getItKeyword_4_1()); 

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
    // $ANTLR end "rule__AttributeAction__Group_4__1__Impl"


    // $ANTLR start "rule__AttributeAction__Group_4__2"
    // InternalFeatureLangParser.g:2952:1: rule__AttributeAction__Group_4__2 : rule__AttributeAction__Group_4__2__Impl rule__AttributeAction__Group_4__3 ;
    public final void rule__AttributeAction__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2956:1: ( rule__AttributeAction__Group_4__2__Impl rule__AttributeAction__Group_4__3 )
            // InternalFeatureLangParser.g:2957:2: rule__AttributeAction__Group_4__2__Impl rule__AttributeAction__Group_4__3
            {
            pushFollow(FOLLOW_15);
            rule__AttributeAction__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeAction__Group_4__3();

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
    // $ANTLR end "rule__AttributeAction__Group_4__2"


    // $ANTLR start "rule__AttributeAction__Group_4__2__Impl"
    // InternalFeatureLangParser.g:2964:1: rule__AttributeAction__Group_4__2__Impl : ( ( rule__AttributeAction__PriorityAssignment_4_2 ) ) ;
    public final void rule__AttributeAction__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2968:1: ( ( ( rule__AttributeAction__PriorityAssignment_4_2 ) ) )
            // InternalFeatureLangParser.g:2969:1: ( ( rule__AttributeAction__PriorityAssignment_4_2 ) )
            {
            // InternalFeatureLangParser.g:2969:1: ( ( rule__AttributeAction__PriorityAssignment_4_2 ) )
            // InternalFeatureLangParser.g:2970:2: ( rule__AttributeAction__PriorityAssignment_4_2 )
            {
             before(grammarAccess.getAttributeActionAccess().getPriorityAssignment_4_2()); 
            // InternalFeatureLangParser.g:2971:2: ( rule__AttributeAction__PriorityAssignment_4_2 )
            // InternalFeatureLangParser.g:2971:3: rule__AttributeAction__PriorityAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__AttributeAction__PriorityAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeActionAccess().getPriorityAssignment_4_2()); 

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
    // $ANTLR end "rule__AttributeAction__Group_4__2__Impl"


    // $ANTLR start "rule__AttributeAction__Group_4__3"
    // InternalFeatureLangParser.g:2979:1: rule__AttributeAction__Group_4__3 : rule__AttributeAction__Group_4__3__Impl ;
    public final void rule__AttributeAction__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2983:1: ( rule__AttributeAction__Group_4__3__Impl )
            // InternalFeatureLangParser.g:2984:2: rule__AttributeAction__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeAction__Group_4__3__Impl();

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
    // $ANTLR end "rule__AttributeAction__Group_4__3"


    // $ANTLR start "rule__AttributeAction__Group_4__3__Impl"
    // InternalFeatureLangParser.g:2990:1: rule__AttributeAction__Group_4__3__Impl : ( ( rule__AttributeAction__ValueAssignment_4_3 ) ) ;
    public final void rule__AttributeAction__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2994:1: ( ( ( rule__AttributeAction__ValueAssignment_4_3 ) ) )
            // InternalFeatureLangParser.g:2995:1: ( ( rule__AttributeAction__ValueAssignment_4_3 ) )
            {
            // InternalFeatureLangParser.g:2995:1: ( ( rule__AttributeAction__ValueAssignment_4_3 ) )
            // InternalFeatureLangParser.g:2996:2: ( rule__AttributeAction__ValueAssignment_4_3 )
            {
             before(grammarAccess.getAttributeActionAccess().getValueAssignment_4_3()); 
            // InternalFeatureLangParser.g:2997:2: ( rule__AttributeAction__ValueAssignment_4_3 )
            // InternalFeatureLangParser.g:2997:3: rule__AttributeAction__ValueAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__AttributeAction__ValueAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeActionAccess().getValueAssignment_4_3()); 

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
    // $ANTLR end "rule__AttributeAction__Group_4__3__Impl"


    // $ANTLR start "rule__AssociationAction__Group__0"
    // InternalFeatureLangParser.g:3006:1: rule__AssociationAction__Group__0 : rule__AssociationAction__Group__0__Impl rule__AssociationAction__Group__1 ;
    public final void rule__AssociationAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3010:1: ( rule__AssociationAction__Group__0__Impl rule__AssociationAction__Group__1 )
            // InternalFeatureLangParser.g:3011:2: rule__AssociationAction__Group__0__Impl rule__AssociationAction__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalFeatureLangParser.g:3018:1: rule__AssociationAction__Group__0__Impl : ( ( Have )? ) ;
    public final void rule__AssociationAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3022:1: ( ( ( Have )? ) )
            // InternalFeatureLangParser.g:3023:1: ( ( Have )? )
            {
            // InternalFeatureLangParser.g:3023:1: ( ( Have )? )
            // InternalFeatureLangParser.g:3024:2: ( Have )?
            {
             before(grammarAccess.getAssociationActionAccess().getHaveKeyword_0()); 
            // InternalFeatureLangParser.g:3025:2: ( Have )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==Have) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalFeatureLangParser.g:3025:3: Have
                    {
                    match(input,Have,FOLLOW_2); 

                    }
                    break;

            }

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
    // InternalFeatureLangParser.g:3033:1: rule__AssociationAction__Group__1 : rule__AssociationAction__Group__1__Impl rule__AssociationAction__Group__2 ;
    public final void rule__AssociationAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3037:1: ( rule__AssociationAction__Group__1__Impl rule__AssociationAction__Group__2 )
            // InternalFeatureLangParser.g:3038:2: rule__AssociationAction__Group__1__Impl rule__AssociationAction__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalFeatureLangParser.g:3045:1: rule__AssociationAction__Group__1__Impl : ( ( rule__AssociationAction__Alternatives_1 ) ) ;
    public final void rule__AssociationAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3049:1: ( ( ( rule__AssociationAction__Alternatives_1 ) ) )
            // InternalFeatureLangParser.g:3050:1: ( ( rule__AssociationAction__Alternatives_1 ) )
            {
            // InternalFeatureLangParser.g:3050:1: ( ( rule__AssociationAction__Alternatives_1 ) )
            // InternalFeatureLangParser.g:3051:2: ( rule__AssociationAction__Alternatives_1 )
            {
             before(grammarAccess.getAssociationActionAccess().getAlternatives_1()); 
            // InternalFeatureLangParser.g:3052:2: ( rule__AssociationAction__Alternatives_1 )
            // InternalFeatureLangParser.g:3052:3: rule__AssociationAction__Alternatives_1
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
    // InternalFeatureLangParser.g:3060:1: rule__AssociationAction__Group__2 : rule__AssociationAction__Group__2__Impl ;
    public final void rule__AssociationAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3064:1: ( rule__AssociationAction__Group__2__Impl )
            // InternalFeatureLangParser.g:3065:2: rule__AssociationAction__Group__2__Impl
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
    // InternalFeatureLangParser.g:3071:1: rule__AssociationAction__Group__2__Impl : ( ( rule__AssociationAction__Alternatives_2 ) ) ;
    public final void rule__AssociationAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3075:1: ( ( ( rule__AssociationAction__Alternatives_2 ) ) )
            // InternalFeatureLangParser.g:3076:1: ( ( rule__AssociationAction__Alternatives_2 ) )
            {
            // InternalFeatureLangParser.g:3076:1: ( ( rule__AssociationAction__Alternatives_2 ) )
            // InternalFeatureLangParser.g:3077:2: ( rule__AssociationAction__Alternatives_2 )
            {
             before(grammarAccess.getAssociationActionAccess().getAlternatives_2()); 
            // InternalFeatureLangParser.g:3078:2: ( rule__AssociationAction__Alternatives_2 )
            // InternalFeatureLangParser.g:3078:3: rule__AssociationAction__Alternatives_2
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
    // InternalFeatureLangParser.g:3087:1: rule__AssociationAction__Group_2_1__0 : rule__AssociationAction__Group_2_1__0__Impl rule__AssociationAction__Group_2_1__1 ;
    public final void rule__AssociationAction__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3091:1: ( rule__AssociationAction__Group_2_1__0__Impl rule__AssociationAction__Group_2_1__1 )
            // InternalFeatureLangParser.g:3092:2: rule__AssociationAction__Group_2_1__0__Impl rule__AssociationAction__Group_2_1__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalFeatureLangParser.g:3099:1: rule__AssociationAction__Group_2_1__0__Impl : ( ( rule__AssociationAction__NameAssignment_2_1_0 ) ) ;
    public final void rule__AssociationAction__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3103:1: ( ( ( rule__AssociationAction__NameAssignment_2_1_0 ) ) )
            // InternalFeatureLangParser.g:3104:1: ( ( rule__AssociationAction__NameAssignment_2_1_0 ) )
            {
            // InternalFeatureLangParser.g:3104:1: ( ( rule__AssociationAction__NameAssignment_2_1_0 ) )
            // InternalFeatureLangParser.g:3105:2: ( rule__AssociationAction__NameAssignment_2_1_0 )
            {
             before(grammarAccess.getAssociationActionAccess().getNameAssignment_2_1_0()); 
            // InternalFeatureLangParser.g:3106:2: ( rule__AssociationAction__NameAssignment_2_1_0 )
            // InternalFeatureLangParser.g:3106:3: rule__AssociationAction__NameAssignment_2_1_0
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
    // InternalFeatureLangParser.g:3114:1: rule__AssociationAction__Group_2_1__1 : rule__AssociationAction__Group_2_1__1__Impl ;
    public final void rule__AssociationAction__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3118:1: ( rule__AssociationAction__Group_2_1__1__Impl )
            // InternalFeatureLangParser.g:3119:2: rule__AssociationAction__Group_2_1__1__Impl
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
    // InternalFeatureLangParser.g:3125:1: rule__AssociationAction__Group_2_1__1__Impl : ( ( rule__AssociationAction__EditAssignment_2_1_1 ) ) ;
    public final void rule__AssociationAction__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3129:1: ( ( ( rule__AssociationAction__EditAssignment_2_1_1 ) ) )
            // InternalFeatureLangParser.g:3130:1: ( ( rule__AssociationAction__EditAssignment_2_1_1 ) )
            {
            // InternalFeatureLangParser.g:3130:1: ( ( rule__AssociationAction__EditAssignment_2_1_1 ) )
            // InternalFeatureLangParser.g:3131:2: ( rule__AssociationAction__EditAssignment_2_1_1 )
            {
             before(grammarAccess.getAssociationActionAccess().getEditAssignment_2_1_1()); 
            // InternalFeatureLangParser.g:3132:2: ( rule__AssociationAction__EditAssignment_2_1_1 )
            // InternalFeatureLangParser.g:3132:3: rule__AssociationAction__EditAssignment_2_1_1
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
    // InternalFeatureLangParser.g:3141:1: rule__CreateAssociation__Group__0 : rule__CreateAssociation__Group__0__Impl rule__CreateAssociation__Group__1 ;
    public final void rule__CreateAssociation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3145:1: ( rule__CreateAssociation__Group__0__Impl rule__CreateAssociation__Group__1 )
            // InternalFeatureLangParser.g:3146:2: rule__CreateAssociation__Group__0__Impl rule__CreateAssociation__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalFeatureLangParser.g:3153:1: rule__CreateAssociation__Group__0__Impl : ( To ) ;
    public final void rule__CreateAssociation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3157:1: ( ( To ) )
            // InternalFeatureLangParser.g:3158:1: ( To )
            {
            // InternalFeatureLangParser.g:3158:1: ( To )
            // InternalFeatureLangParser.g:3159:2: To
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
    // InternalFeatureLangParser.g:3168:1: rule__CreateAssociation__Group__1 : rule__CreateAssociation__Group__1__Impl rule__CreateAssociation__Group__2 ;
    public final void rule__CreateAssociation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3172:1: ( rule__CreateAssociation__Group__1__Impl rule__CreateAssociation__Group__2 )
            // InternalFeatureLangParser.g:3173:2: rule__CreateAssociation__Group__1__Impl rule__CreateAssociation__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalFeatureLangParser.g:3180:1: rule__CreateAssociation__Group__1__Impl : ( ( Other )? ) ;
    public final void rule__CreateAssociation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3184:1: ( ( ( Other )? ) )
            // InternalFeatureLangParser.g:3185:1: ( ( Other )? )
            {
            // InternalFeatureLangParser.g:3185:1: ( ( Other )? )
            // InternalFeatureLangParser.g:3186:2: ( Other )?
            {
             before(grammarAccess.getCreateAssociationAccess().getOtherKeyword_1()); 
            // InternalFeatureLangParser.g:3187:2: ( Other )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==Other) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalFeatureLangParser.g:3187:3: Other
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
    // InternalFeatureLangParser.g:3195:1: rule__CreateAssociation__Group__2 : rule__CreateAssociation__Group__2__Impl rule__CreateAssociation__Group__3 ;
    public final void rule__CreateAssociation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3199:1: ( rule__CreateAssociation__Group__2__Impl rule__CreateAssociation__Group__3 )
            // InternalFeatureLangParser.g:3200:2: rule__CreateAssociation__Group__2__Impl rule__CreateAssociation__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalFeatureLangParser.g:3207:1: rule__CreateAssociation__Group__2__Impl : ( ( rule__CreateAssociation__TargetAssignment_2 ) ) ;
    public final void rule__CreateAssociation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3211:1: ( ( ( rule__CreateAssociation__TargetAssignment_2 ) ) )
            // InternalFeatureLangParser.g:3212:1: ( ( rule__CreateAssociation__TargetAssignment_2 ) )
            {
            // InternalFeatureLangParser.g:3212:1: ( ( rule__CreateAssociation__TargetAssignment_2 ) )
            // InternalFeatureLangParser.g:3213:2: ( rule__CreateAssociation__TargetAssignment_2 )
            {
             before(grammarAccess.getCreateAssociationAccess().getTargetAssignment_2()); 
            // InternalFeatureLangParser.g:3214:2: ( rule__CreateAssociation__TargetAssignment_2 )
            // InternalFeatureLangParser.g:3214:3: rule__CreateAssociation__TargetAssignment_2
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
    // InternalFeatureLangParser.g:3222:1: rule__CreateAssociation__Group__3 : rule__CreateAssociation__Group__3__Impl rule__CreateAssociation__Group__4 ;
    public final void rule__CreateAssociation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3226:1: ( rule__CreateAssociation__Group__3__Impl rule__CreateAssociation__Group__4 )
            // InternalFeatureLangParser.g:3227:2: rule__CreateAssociation__Group__3__Impl rule__CreateAssociation__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalFeatureLangParser.g:3234:1: rule__CreateAssociation__Group__3__Impl : ( Called ) ;
    public final void rule__CreateAssociation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3238:1: ( ( Called ) )
            // InternalFeatureLangParser.g:3239:1: ( Called )
            {
            // InternalFeatureLangParser.g:3239:1: ( Called )
            // InternalFeatureLangParser.g:3240:2: Called
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
    // InternalFeatureLangParser.g:3249:1: rule__CreateAssociation__Group__4 : rule__CreateAssociation__Group__4__Impl ;
    public final void rule__CreateAssociation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3253:1: ( rule__CreateAssociation__Group__4__Impl )
            // InternalFeatureLangParser.g:3254:2: rule__CreateAssociation__Group__4__Impl
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
    // InternalFeatureLangParser.g:3260:1: rule__CreateAssociation__Group__4__Impl : ( ( rule__CreateAssociation__RelationAssignment_4 ) ) ;
    public final void rule__CreateAssociation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3264:1: ( ( ( rule__CreateAssociation__RelationAssignment_4 ) ) )
            // InternalFeatureLangParser.g:3265:1: ( ( rule__CreateAssociation__RelationAssignment_4 ) )
            {
            // InternalFeatureLangParser.g:3265:1: ( ( rule__CreateAssociation__RelationAssignment_4 ) )
            // InternalFeatureLangParser.g:3266:2: ( rule__CreateAssociation__RelationAssignment_4 )
            {
             before(grammarAccess.getCreateAssociationAccess().getRelationAssignment_4()); 
            // InternalFeatureLangParser.g:3267:2: ( rule__CreateAssociation__RelationAssignment_4 )
            // InternalFeatureLangParser.g:3267:3: rule__CreateAssociation__RelationAssignment_4
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
    // InternalFeatureLangParser.g:3276:1: rule__SetCompatible__Group__0 : rule__SetCompatible__Group__0__Impl rule__SetCompatible__Group__1 ;
    public final void rule__SetCompatible__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3280:1: ( rule__SetCompatible__Group__0__Impl rule__SetCompatible__Group__1 )
            // InternalFeatureLangParser.g:3281:2: rule__SetCompatible__Group__0__Impl rule__SetCompatible__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalFeatureLangParser.g:3288:1: rule__SetCompatible__Group__0__Impl : ( Compatible ) ;
    public final void rule__SetCompatible__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3292:1: ( ( Compatible ) )
            // InternalFeatureLangParser.g:3293:1: ( Compatible )
            {
            // InternalFeatureLangParser.g:3293:1: ( Compatible )
            // InternalFeatureLangParser.g:3294:2: Compatible
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
    // InternalFeatureLangParser.g:3303:1: rule__SetCompatible__Group__1 : rule__SetCompatible__Group__1__Impl rule__SetCompatible__Group__2 ;
    public final void rule__SetCompatible__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3307:1: ( rule__SetCompatible__Group__1__Impl rule__SetCompatible__Group__2 )
            // InternalFeatureLangParser.g:3308:2: rule__SetCompatible__Group__1__Impl rule__SetCompatible__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalFeatureLangParser.g:3315:1: rule__SetCompatible__Group__1__Impl : ( With ) ;
    public final void rule__SetCompatible__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3319:1: ( ( With ) )
            // InternalFeatureLangParser.g:3320:1: ( With )
            {
            // InternalFeatureLangParser.g:3320:1: ( With )
            // InternalFeatureLangParser.g:3321:2: With
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
    // InternalFeatureLangParser.g:3330:1: rule__SetCompatible__Group__2 : rule__SetCompatible__Group__2__Impl rule__SetCompatible__Group__3 ;
    public final void rule__SetCompatible__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3334:1: ( rule__SetCompatible__Group__2__Impl rule__SetCompatible__Group__3 )
            // InternalFeatureLangParser.g:3335:2: rule__SetCompatible__Group__2__Impl rule__SetCompatible__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalFeatureLangParser.g:3342:1: rule__SetCompatible__Group__2__Impl : ( Version ) ;
    public final void rule__SetCompatible__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3346:1: ( ( Version ) )
            // InternalFeatureLangParser.g:3347:1: ( Version )
            {
            // InternalFeatureLangParser.g:3347:1: ( Version )
            // InternalFeatureLangParser.g:3348:2: Version
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
    // InternalFeatureLangParser.g:3357:1: rule__SetCompatible__Group__3 : rule__SetCompatible__Group__3__Impl ;
    public final void rule__SetCompatible__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3361:1: ( rule__SetCompatible__Group__3__Impl )
            // InternalFeatureLangParser.g:3362:2: rule__SetCompatible__Group__3__Impl
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
    // InternalFeatureLangParser.g:3368:1: rule__SetCompatible__Group__3__Impl : ( ( rule__SetCompatible__NameAssignment_3 ) ) ;
    public final void rule__SetCompatible__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3372:1: ( ( ( rule__SetCompatible__NameAssignment_3 ) ) )
            // InternalFeatureLangParser.g:3373:1: ( ( rule__SetCompatible__NameAssignment_3 ) )
            {
            // InternalFeatureLangParser.g:3373:1: ( ( rule__SetCompatible__NameAssignment_3 ) )
            // InternalFeatureLangParser.g:3374:2: ( rule__SetCompatible__NameAssignment_3 )
            {
             before(grammarAccess.getSetCompatibleAccess().getNameAssignment_3()); 
            // InternalFeatureLangParser.g:3375:2: ( rule__SetCompatible__NameAssignment_3 )
            // InternalFeatureLangParser.g:3375:3: rule__SetCompatible__NameAssignment_3
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
    // InternalFeatureLangParser.g:3384:1: rule__SetVersionRange__Group__0 : rule__SetVersionRange__Group__0__Impl rule__SetVersionRange__Group__1 ;
    public final void rule__SetVersionRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3388:1: ( rule__SetVersionRange__Group__0__Impl rule__SetVersionRange__Group__1 )
            // InternalFeatureLangParser.g:3389:2: rule__SetVersionRange__Group__0__Impl rule__SetVersionRange__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalFeatureLangParser.g:3396:1: rule__SetVersionRange__Group__0__Impl : ( With ) ;
    public final void rule__SetVersionRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3400:1: ( ( With ) )
            // InternalFeatureLangParser.g:3401:1: ( With )
            {
            // InternalFeatureLangParser.g:3401:1: ( With )
            // InternalFeatureLangParser.g:3402:2: With
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
    // InternalFeatureLangParser.g:3411:1: rule__SetVersionRange__Group__1 : rule__SetVersionRange__Group__1__Impl rule__SetVersionRange__Group__2 ;
    public final void rule__SetVersionRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3415:1: ( rule__SetVersionRange__Group__1__Impl rule__SetVersionRange__Group__2 )
            // InternalFeatureLangParser.g:3416:2: rule__SetVersionRange__Group__1__Impl rule__SetVersionRange__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalFeatureLangParser.g:3423:1: rule__SetVersionRange__Group__1__Impl : ( Version ) ;
    public final void rule__SetVersionRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3427:1: ( ( Version ) )
            // InternalFeatureLangParser.g:3428:1: ( Version )
            {
            // InternalFeatureLangParser.g:3428:1: ( Version )
            // InternalFeatureLangParser.g:3429:2: Version
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
    // InternalFeatureLangParser.g:3438:1: rule__SetVersionRange__Group__2 : rule__SetVersionRange__Group__2__Impl rule__SetVersionRange__Group__3 ;
    public final void rule__SetVersionRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3442:1: ( rule__SetVersionRange__Group__2__Impl rule__SetVersionRange__Group__3 )
            // InternalFeatureLangParser.g:3443:2: rule__SetVersionRange__Group__2__Impl rule__SetVersionRange__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalFeatureLangParser.g:3450:1: rule__SetVersionRange__Group__2__Impl : ( Range ) ;
    public final void rule__SetVersionRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3454:1: ( ( Range ) )
            // InternalFeatureLangParser.g:3455:1: ( Range )
            {
            // InternalFeatureLangParser.g:3455:1: ( Range )
            // InternalFeatureLangParser.g:3456:2: Range
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
    // InternalFeatureLangParser.g:3465:1: rule__SetVersionRange__Group__3 : rule__SetVersionRange__Group__3__Impl rule__SetVersionRange__Group__4 ;
    public final void rule__SetVersionRange__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3469:1: ( rule__SetVersionRange__Group__3__Impl rule__SetVersionRange__Group__4 )
            // InternalFeatureLangParser.g:3470:2: rule__SetVersionRange__Group__3__Impl rule__SetVersionRange__Group__4
            {
            pushFollow(FOLLOW_31);
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
    // InternalFeatureLangParser.g:3477:1: rule__SetVersionRange__Group__3__Impl : ( From ) ;
    public final void rule__SetVersionRange__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3481:1: ( ( From ) )
            // InternalFeatureLangParser.g:3482:1: ( From )
            {
            // InternalFeatureLangParser.g:3482:1: ( From )
            // InternalFeatureLangParser.g:3483:2: From
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
    // InternalFeatureLangParser.g:3492:1: rule__SetVersionRange__Group__4 : rule__SetVersionRange__Group__4__Impl rule__SetVersionRange__Group__5 ;
    public final void rule__SetVersionRange__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3496:1: ( rule__SetVersionRange__Group__4__Impl rule__SetVersionRange__Group__5 )
            // InternalFeatureLangParser.g:3497:2: rule__SetVersionRange__Group__4__Impl rule__SetVersionRange__Group__5
            {
            pushFollow(FOLLOW_34);
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
    // InternalFeatureLangParser.g:3504:1: rule__SetVersionRange__Group__4__Impl : ( ( rule__SetVersionRange__StartAssignment_4 ) ) ;
    public final void rule__SetVersionRange__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3508:1: ( ( ( rule__SetVersionRange__StartAssignment_4 ) ) )
            // InternalFeatureLangParser.g:3509:1: ( ( rule__SetVersionRange__StartAssignment_4 ) )
            {
            // InternalFeatureLangParser.g:3509:1: ( ( rule__SetVersionRange__StartAssignment_4 ) )
            // InternalFeatureLangParser.g:3510:2: ( rule__SetVersionRange__StartAssignment_4 )
            {
             before(grammarAccess.getSetVersionRangeAccess().getStartAssignment_4()); 
            // InternalFeatureLangParser.g:3511:2: ( rule__SetVersionRange__StartAssignment_4 )
            // InternalFeatureLangParser.g:3511:3: rule__SetVersionRange__StartAssignment_4
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
    // InternalFeatureLangParser.g:3519:1: rule__SetVersionRange__Group__5 : rule__SetVersionRange__Group__5__Impl rule__SetVersionRange__Group__6 ;
    public final void rule__SetVersionRange__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3523:1: ( rule__SetVersionRange__Group__5__Impl rule__SetVersionRange__Group__6 )
            // InternalFeatureLangParser.g:3524:2: rule__SetVersionRange__Group__5__Impl rule__SetVersionRange__Group__6
            {
            pushFollow(FOLLOW_31);
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
    // InternalFeatureLangParser.g:3531:1: rule__SetVersionRange__Group__5__Impl : ( To ) ;
    public final void rule__SetVersionRange__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3535:1: ( ( To ) )
            // InternalFeatureLangParser.g:3536:1: ( To )
            {
            // InternalFeatureLangParser.g:3536:1: ( To )
            // InternalFeatureLangParser.g:3537:2: To
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
    // InternalFeatureLangParser.g:3546:1: rule__SetVersionRange__Group__6 : rule__SetVersionRange__Group__6__Impl ;
    public final void rule__SetVersionRange__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3550:1: ( rule__SetVersionRange__Group__6__Impl )
            // InternalFeatureLangParser.g:3551:2: rule__SetVersionRange__Group__6__Impl
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
    // InternalFeatureLangParser.g:3557:1: rule__SetVersionRange__Group__6__Impl : ( ( rule__SetVersionRange__EndAssignment_6 ) ) ;
    public final void rule__SetVersionRange__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3561:1: ( ( ( rule__SetVersionRange__EndAssignment_6 ) ) )
            // InternalFeatureLangParser.g:3562:1: ( ( rule__SetVersionRange__EndAssignment_6 ) )
            {
            // InternalFeatureLangParser.g:3562:1: ( ( rule__SetVersionRange__EndAssignment_6 ) )
            // InternalFeatureLangParser.g:3563:2: ( rule__SetVersionRange__EndAssignment_6 )
            {
             before(grammarAccess.getSetVersionRangeAccess().getEndAssignment_6()); 
            // InternalFeatureLangParser.g:3564:2: ( rule__SetVersionRange__EndAssignment_6 )
            // InternalFeatureLangParser.g:3564:3: rule__SetVersionRange__EndAssignment_6
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
    // InternalFeatureLangParser.g:3573:1: rule__SetVariant__Group__0 : rule__SetVariant__Group__0__Impl rule__SetVariant__Group__1 ;
    public final void rule__SetVariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3577:1: ( rule__SetVariant__Group__0__Impl rule__SetVariant__Group__1 )
            // InternalFeatureLangParser.g:3578:2: rule__SetVariant__Group__0__Impl rule__SetVariant__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalFeatureLangParser.g:3585:1: rule__SetVariant__Group__0__Impl : ( With ) ;
    public final void rule__SetVariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3589:1: ( ( With ) )
            // InternalFeatureLangParser.g:3590:1: ( With )
            {
            // InternalFeatureLangParser.g:3590:1: ( With )
            // InternalFeatureLangParser.g:3591:2: With
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
    // InternalFeatureLangParser.g:3600:1: rule__SetVariant__Group__1 : rule__SetVariant__Group__1__Impl rule__SetVariant__Group__2 ;
    public final void rule__SetVariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3604:1: ( rule__SetVariant__Group__1__Impl rule__SetVariant__Group__2 )
            // InternalFeatureLangParser.g:3605:2: rule__SetVariant__Group__1__Impl rule__SetVariant__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalFeatureLangParser.g:3612:1: rule__SetVariant__Group__1__Impl : ( All ) ;
    public final void rule__SetVariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3616:1: ( ( All ) )
            // InternalFeatureLangParser.g:3617:1: ( All )
            {
            // InternalFeatureLangParser.g:3617:1: ( All )
            // InternalFeatureLangParser.g:3618:2: All
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
    // InternalFeatureLangParser.g:3627:1: rule__SetVariant__Group__2 : rule__SetVariant__Group__2__Impl rule__SetVariant__Group__3 ;
    public final void rule__SetVariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3631:1: ( rule__SetVariant__Group__2__Impl rule__SetVariant__Group__3 )
            // InternalFeatureLangParser.g:3632:2: rule__SetVariant__Group__2__Impl rule__SetVariant__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalFeatureLangParser.g:3639:1: rule__SetVariant__Group__2__Impl : ( Versions ) ;
    public final void rule__SetVariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3643:1: ( ( Versions ) )
            // InternalFeatureLangParser.g:3644:1: ( Versions )
            {
            // InternalFeatureLangParser.g:3644:1: ( Versions )
            // InternalFeatureLangParser.g:3645:2: Versions
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
    // InternalFeatureLangParser.g:3654:1: rule__SetVariant__Group__3 : rule__SetVariant__Group__3__Impl rule__SetVariant__Group__4 ;
    public final void rule__SetVariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3658:1: ( rule__SetVariant__Group__3__Impl rule__SetVariant__Group__4 )
            // InternalFeatureLangParser.g:3659:2: rule__SetVariant__Group__3__Impl rule__SetVariant__Group__4
            {
            pushFollow(FOLLOW_38);
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
    // InternalFeatureLangParser.g:3666:1: rule__SetVariant__Group__3__Impl : ( Of ) ;
    public final void rule__SetVariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3670:1: ( ( Of ) )
            // InternalFeatureLangParser.g:3671:1: ( Of )
            {
            // InternalFeatureLangParser.g:3671:1: ( Of )
            // InternalFeatureLangParser.g:3672:2: Of
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
    // InternalFeatureLangParser.g:3681:1: rule__SetVariant__Group__4 : rule__SetVariant__Group__4__Impl rule__SetVariant__Group__5 ;
    public final void rule__SetVariant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3685:1: ( rule__SetVariant__Group__4__Impl rule__SetVariant__Group__5 )
            // InternalFeatureLangParser.g:3686:2: rule__SetVariant__Group__4__Impl rule__SetVariant__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalFeatureLangParser.g:3693:1: rule__SetVariant__Group__4__Impl : ( Variant ) ;
    public final void rule__SetVariant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3697:1: ( ( Variant ) )
            // InternalFeatureLangParser.g:3698:1: ( Variant )
            {
            // InternalFeatureLangParser.g:3698:1: ( Variant )
            // InternalFeatureLangParser.g:3699:2: Variant
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
    // InternalFeatureLangParser.g:3708:1: rule__SetVariant__Group__5 : rule__SetVariant__Group__5__Impl ;
    public final void rule__SetVariant__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3712:1: ( rule__SetVariant__Group__5__Impl )
            // InternalFeatureLangParser.g:3713:2: rule__SetVariant__Group__5__Impl
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
    // InternalFeatureLangParser.g:3719:1: rule__SetVariant__Group__5__Impl : ( ( rule__SetVariant__NameAssignment_5 ) ) ;
    public final void rule__SetVariant__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3723:1: ( ( ( rule__SetVariant__NameAssignment_5 ) ) )
            // InternalFeatureLangParser.g:3724:1: ( ( rule__SetVariant__NameAssignment_5 ) )
            {
            // InternalFeatureLangParser.g:3724:1: ( ( rule__SetVariant__NameAssignment_5 ) )
            // InternalFeatureLangParser.g:3725:2: ( rule__SetVariant__NameAssignment_5 )
            {
             before(grammarAccess.getSetVariantAccess().getNameAssignment_5()); 
            // InternalFeatureLangParser.g:3726:2: ( rule__SetVariant__NameAssignment_5 )
            // InternalFeatureLangParser.g:3726:3: rule__SetVariant__NameAssignment_5
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
    // InternalFeatureLangParser.g:3735:1: rule__SetRightOpen__Group__0 : rule__SetRightOpen__Group__0__Impl rule__SetRightOpen__Group__1 ;
    public final void rule__SetRightOpen__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3739:1: ( rule__SetRightOpen__Group__0__Impl rule__SetRightOpen__Group__1 )
            // InternalFeatureLangParser.g:3740:2: rule__SetRightOpen__Group__0__Impl rule__SetRightOpen__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalFeatureLangParser.g:3747:1: rule__SetRightOpen__Group__0__Impl : ( Up ) ;
    public final void rule__SetRightOpen__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3751:1: ( ( Up ) )
            // InternalFeatureLangParser.g:3752:1: ( Up )
            {
            // InternalFeatureLangParser.g:3752:1: ( Up )
            // InternalFeatureLangParser.g:3753:2: Up
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
    // InternalFeatureLangParser.g:3762:1: rule__SetRightOpen__Group__1 : rule__SetRightOpen__Group__1__Impl rule__SetRightOpen__Group__2 ;
    public final void rule__SetRightOpen__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3766:1: ( rule__SetRightOpen__Group__1__Impl rule__SetRightOpen__Group__2 )
            // InternalFeatureLangParser.g:3767:2: rule__SetRightOpen__Group__1__Impl rule__SetRightOpen__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalFeatureLangParser.g:3774:1: rule__SetRightOpen__Group__1__Impl : ( To ) ;
    public final void rule__SetRightOpen__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3778:1: ( ( To ) )
            // InternalFeatureLangParser.g:3779:1: ( To )
            {
            // InternalFeatureLangParser.g:3779:1: ( To )
            // InternalFeatureLangParser.g:3780:2: To
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
    // InternalFeatureLangParser.g:3789:1: rule__SetRightOpen__Group__2 : rule__SetRightOpen__Group__2__Impl rule__SetRightOpen__Group__3 ;
    public final void rule__SetRightOpen__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3793:1: ( rule__SetRightOpen__Group__2__Impl rule__SetRightOpen__Group__3 )
            // InternalFeatureLangParser.g:3794:2: rule__SetRightOpen__Group__2__Impl rule__SetRightOpen__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalFeatureLangParser.g:3801:1: rule__SetRightOpen__Group__2__Impl : ( Date ) ;
    public final void rule__SetRightOpen__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3805:1: ( ( Date ) )
            // InternalFeatureLangParser.g:3806:1: ( Date )
            {
            // InternalFeatureLangParser.g:3806:1: ( Date )
            // InternalFeatureLangParser.g:3807:2: Date
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
    // InternalFeatureLangParser.g:3816:1: rule__SetRightOpen__Group__3 : rule__SetRightOpen__Group__3__Impl ;
    public final void rule__SetRightOpen__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3820:1: ( rule__SetRightOpen__Group__3__Impl )
            // InternalFeatureLangParser.g:3821:2: rule__SetRightOpen__Group__3__Impl
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
    // InternalFeatureLangParser.g:3827:1: rule__SetRightOpen__Group__3__Impl : ( ( rule__SetRightOpen__DateAssignment_3 ) ) ;
    public final void rule__SetRightOpen__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3831:1: ( ( ( rule__SetRightOpen__DateAssignment_3 ) ) )
            // InternalFeatureLangParser.g:3832:1: ( ( rule__SetRightOpen__DateAssignment_3 ) )
            {
            // InternalFeatureLangParser.g:3832:1: ( ( rule__SetRightOpen__DateAssignment_3 ) )
            // InternalFeatureLangParser.g:3833:2: ( rule__SetRightOpen__DateAssignment_3 )
            {
             before(grammarAccess.getSetRightOpenAccess().getDateAssignment_3()); 
            // InternalFeatureLangParser.g:3834:2: ( rule__SetRightOpen__DateAssignment_3 )
            // InternalFeatureLangParser.g:3834:3: rule__SetRightOpen__DateAssignment_3
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
    // InternalFeatureLangParser.g:3843:1: rule__SetLeftOpen__Group__0 : rule__SetLeftOpen__Group__0__Impl rule__SetLeftOpen__Group__1 ;
    public final void rule__SetLeftOpen__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3847:1: ( rule__SetLeftOpen__Group__0__Impl rule__SetLeftOpen__Group__1 )
            // InternalFeatureLangParser.g:3848:2: rule__SetLeftOpen__Group__0__Impl rule__SetLeftOpen__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalFeatureLangParser.g:3855:1: rule__SetLeftOpen__Group__0__Impl : ( Starting ) ;
    public final void rule__SetLeftOpen__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3859:1: ( ( Starting ) )
            // InternalFeatureLangParser.g:3860:1: ( Starting )
            {
            // InternalFeatureLangParser.g:3860:1: ( Starting )
            // InternalFeatureLangParser.g:3861:2: Starting
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
    // InternalFeatureLangParser.g:3870:1: rule__SetLeftOpen__Group__1 : rule__SetLeftOpen__Group__1__Impl rule__SetLeftOpen__Group__2 ;
    public final void rule__SetLeftOpen__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3874:1: ( rule__SetLeftOpen__Group__1__Impl rule__SetLeftOpen__Group__2 )
            // InternalFeatureLangParser.g:3875:2: rule__SetLeftOpen__Group__1__Impl rule__SetLeftOpen__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalFeatureLangParser.g:3882:1: rule__SetLeftOpen__Group__1__Impl : ( From ) ;
    public final void rule__SetLeftOpen__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3886:1: ( ( From ) )
            // InternalFeatureLangParser.g:3887:1: ( From )
            {
            // InternalFeatureLangParser.g:3887:1: ( From )
            // InternalFeatureLangParser.g:3888:2: From
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
    // InternalFeatureLangParser.g:3897:1: rule__SetLeftOpen__Group__2 : rule__SetLeftOpen__Group__2__Impl rule__SetLeftOpen__Group__3 ;
    public final void rule__SetLeftOpen__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3901:1: ( rule__SetLeftOpen__Group__2__Impl rule__SetLeftOpen__Group__3 )
            // InternalFeatureLangParser.g:3902:2: rule__SetLeftOpen__Group__2__Impl rule__SetLeftOpen__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalFeatureLangParser.g:3909:1: rule__SetLeftOpen__Group__2__Impl : ( Date ) ;
    public final void rule__SetLeftOpen__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3913:1: ( ( Date ) )
            // InternalFeatureLangParser.g:3914:1: ( Date )
            {
            // InternalFeatureLangParser.g:3914:1: ( Date )
            // InternalFeatureLangParser.g:3915:2: Date
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
    // InternalFeatureLangParser.g:3924:1: rule__SetLeftOpen__Group__3 : rule__SetLeftOpen__Group__3__Impl ;
    public final void rule__SetLeftOpen__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3928:1: ( rule__SetLeftOpen__Group__3__Impl )
            // InternalFeatureLangParser.g:3929:2: rule__SetLeftOpen__Group__3__Impl
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
    // InternalFeatureLangParser.g:3935:1: rule__SetLeftOpen__Group__3__Impl : ( ( rule__SetLeftOpen__DateAssignment_3 ) ) ;
    public final void rule__SetLeftOpen__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3939:1: ( ( ( rule__SetLeftOpen__DateAssignment_3 ) ) )
            // InternalFeatureLangParser.g:3940:1: ( ( rule__SetLeftOpen__DateAssignment_3 ) )
            {
            // InternalFeatureLangParser.g:3940:1: ( ( rule__SetLeftOpen__DateAssignment_3 ) )
            // InternalFeatureLangParser.g:3941:2: ( rule__SetLeftOpen__DateAssignment_3 )
            {
             before(grammarAccess.getSetLeftOpenAccess().getDateAssignment_3()); 
            // InternalFeatureLangParser.g:3942:2: ( rule__SetLeftOpen__DateAssignment_3 )
            // InternalFeatureLangParser.g:3942:3: rule__SetLeftOpen__DateAssignment_3
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
    // InternalFeatureLangParser.g:3951:1: rule__InheritanceAction__Group__0 : rule__InheritanceAction__Group__0__Impl rule__InheritanceAction__Group__1 ;
    public final void rule__InheritanceAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3955:1: ( rule__InheritanceAction__Group__0__Impl rule__InheritanceAction__Group__1 )
            // InternalFeatureLangParser.g:3956:2: rule__InheritanceAction__Group__0__Impl rule__InheritanceAction__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalFeatureLangParser.g:3963:1: rule__InheritanceAction__Group__0__Impl : ( ( rule__InheritanceAction__Alternatives_0 ) ) ;
    public final void rule__InheritanceAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3967:1: ( ( ( rule__InheritanceAction__Alternatives_0 ) ) )
            // InternalFeatureLangParser.g:3968:1: ( ( rule__InheritanceAction__Alternatives_0 ) )
            {
            // InternalFeatureLangParser.g:3968:1: ( ( rule__InheritanceAction__Alternatives_0 ) )
            // InternalFeatureLangParser.g:3969:2: ( rule__InheritanceAction__Alternatives_0 )
            {
             before(grammarAccess.getInheritanceActionAccess().getAlternatives_0()); 
            // InternalFeatureLangParser.g:3970:2: ( rule__InheritanceAction__Alternatives_0 )
            // InternalFeatureLangParser.g:3970:3: rule__InheritanceAction__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__InheritanceAction__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getInheritanceActionAccess().getAlternatives_0()); 

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
    // InternalFeatureLangParser.g:3978:1: rule__InheritanceAction__Group__1 : rule__InheritanceAction__Group__1__Impl rule__InheritanceAction__Group__2 ;
    public final void rule__InheritanceAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3982:1: ( rule__InheritanceAction__Group__1__Impl rule__InheritanceAction__Group__2 )
            // InternalFeatureLangParser.g:3983:2: rule__InheritanceAction__Group__1__Impl rule__InheritanceAction__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalFeatureLangParser.g:3990:1: rule__InheritanceAction__Group__1__Impl : ( From ) ;
    public final void rule__InheritanceAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3994:1: ( ( From ) )
            // InternalFeatureLangParser.g:3995:1: ( From )
            {
            // InternalFeatureLangParser.g:3995:1: ( From )
            // InternalFeatureLangParser.g:3996:2: From
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
    // InternalFeatureLangParser.g:4005:1: rule__InheritanceAction__Group__2 : rule__InheritanceAction__Group__2__Impl ;
    public final void rule__InheritanceAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4009:1: ( rule__InheritanceAction__Group__2__Impl )
            // InternalFeatureLangParser.g:4010:2: rule__InheritanceAction__Group__2__Impl
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
    // InternalFeatureLangParser.g:4016:1: rule__InheritanceAction__Group__2__Impl : ( ( rule__InheritanceAction__ParentAssignment_2 ) ) ;
    public final void rule__InheritanceAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4020:1: ( ( ( rule__InheritanceAction__ParentAssignment_2 ) ) )
            // InternalFeatureLangParser.g:4021:1: ( ( rule__InheritanceAction__ParentAssignment_2 ) )
            {
            // InternalFeatureLangParser.g:4021:1: ( ( rule__InheritanceAction__ParentAssignment_2 ) )
            // InternalFeatureLangParser.g:4022:2: ( rule__InheritanceAction__ParentAssignment_2 )
            {
             before(grammarAccess.getInheritanceActionAccess().getParentAssignment_2()); 
            // InternalFeatureLangParser.g:4023:2: ( rule__InheritanceAction__ParentAssignment_2 )
            // InternalFeatureLangParser.g:4023:3: rule__InheritanceAction__ParentAssignment_2
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
    // InternalFeatureLangParser.g:4032:1: rule__CreateComposition__Group__0 : rule__CreateComposition__Group__0__Impl rule__CreateComposition__Group__1 ;
    public final void rule__CreateComposition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4036:1: ( rule__CreateComposition__Group__0__Impl rule__CreateComposition__Group__1 )
            // InternalFeatureLangParser.g:4037:2: rule__CreateComposition__Group__0__Impl rule__CreateComposition__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalFeatureLangParser.g:4044:1: rule__CreateComposition__Group__0__Impl : ( ( rule__CreateComposition__Alternatives_0 ) ) ;
    public final void rule__CreateComposition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4048:1: ( ( ( rule__CreateComposition__Alternatives_0 ) ) )
            // InternalFeatureLangParser.g:4049:1: ( ( rule__CreateComposition__Alternatives_0 ) )
            {
            // InternalFeatureLangParser.g:4049:1: ( ( rule__CreateComposition__Alternatives_0 ) )
            // InternalFeatureLangParser.g:4050:2: ( rule__CreateComposition__Alternatives_0 )
            {
             before(grammarAccess.getCreateCompositionAccess().getAlternatives_0()); 
            // InternalFeatureLangParser.g:4051:2: ( rule__CreateComposition__Alternatives_0 )
            // InternalFeatureLangParser.g:4051:3: rule__CreateComposition__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__CreateComposition__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getCreateCompositionAccess().getAlternatives_0()); 

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
    // InternalFeatureLangParser.g:4059:1: rule__CreateComposition__Group__1 : rule__CreateComposition__Group__1__Impl rule__CreateComposition__Group__2 ;
    public final void rule__CreateComposition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4063:1: ( rule__CreateComposition__Group__1__Impl rule__CreateComposition__Group__2 )
            // InternalFeatureLangParser.g:4064:2: rule__CreateComposition__Group__1__Impl rule__CreateComposition__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalFeatureLangParser.g:4071:1: rule__CreateComposition__Group__1__Impl : ( ( rule__CreateComposition__TargetAssignment_1 ) ) ;
    public final void rule__CreateComposition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4075:1: ( ( ( rule__CreateComposition__TargetAssignment_1 ) ) )
            // InternalFeatureLangParser.g:4076:1: ( ( rule__CreateComposition__TargetAssignment_1 ) )
            {
            // InternalFeatureLangParser.g:4076:1: ( ( rule__CreateComposition__TargetAssignment_1 ) )
            // InternalFeatureLangParser.g:4077:2: ( rule__CreateComposition__TargetAssignment_1 )
            {
             before(grammarAccess.getCreateCompositionAccess().getTargetAssignment_1()); 
            // InternalFeatureLangParser.g:4078:2: ( rule__CreateComposition__TargetAssignment_1 )
            // InternalFeatureLangParser.g:4078:3: rule__CreateComposition__TargetAssignment_1
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
    // InternalFeatureLangParser.g:4086:1: rule__CreateComposition__Group__2 : rule__CreateComposition__Group__2__Impl rule__CreateComposition__Group__3 ;
    public final void rule__CreateComposition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4090:1: ( rule__CreateComposition__Group__2__Impl rule__CreateComposition__Group__3 )
            // InternalFeatureLangParser.g:4091:2: rule__CreateComposition__Group__2__Impl rule__CreateComposition__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalFeatureLangParser.g:4098:1: rule__CreateComposition__Group__2__Impl : ( Called ) ;
    public final void rule__CreateComposition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4102:1: ( ( Called ) )
            // InternalFeatureLangParser.g:4103:1: ( Called )
            {
            // InternalFeatureLangParser.g:4103:1: ( Called )
            // InternalFeatureLangParser.g:4104:2: Called
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
    // InternalFeatureLangParser.g:4113:1: rule__CreateComposition__Group__3 : rule__CreateComposition__Group__3__Impl rule__CreateComposition__Group__4 ;
    public final void rule__CreateComposition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4117:1: ( rule__CreateComposition__Group__3__Impl rule__CreateComposition__Group__4 )
            // InternalFeatureLangParser.g:4118:2: rule__CreateComposition__Group__3__Impl rule__CreateComposition__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalFeatureLangParser.g:4125:1: rule__CreateComposition__Group__3__Impl : ( ( rule__CreateComposition__RelationAssignment_3 ) ) ;
    public final void rule__CreateComposition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4129:1: ( ( ( rule__CreateComposition__RelationAssignment_3 ) ) )
            // InternalFeatureLangParser.g:4130:1: ( ( rule__CreateComposition__RelationAssignment_3 ) )
            {
            // InternalFeatureLangParser.g:4130:1: ( ( rule__CreateComposition__RelationAssignment_3 ) )
            // InternalFeatureLangParser.g:4131:2: ( rule__CreateComposition__RelationAssignment_3 )
            {
             before(grammarAccess.getCreateCompositionAccess().getRelationAssignment_3()); 
            // InternalFeatureLangParser.g:4132:2: ( rule__CreateComposition__RelationAssignment_3 )
            // InternalFeatureLangParser.g:4132:3: rule__CreateComposition__RelationAssignment_3
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
    // InternalFeatureLangParser.g:4140:1: rule__CreateComposition__Group__4 : rule__CreateComposition__Group__4__Impl ;
    public final void rule__CreateComposition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4144:1: ( rule__CreateComposition__Group__4__Impl )
            // InternalFeatureLangParser.g:4145:2: rule__CreateComposition__Group__4__Impl
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
    // InternalFeatureLangParser.g:4151:1: rule__CreateComposition__Group__4__Impl : ( ( rule__CreateComposition__Group_4__0 )? ) ;
    public final void rule__CreateComposition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4155:1: ( ( ( rule__CreateComposition__Group_4__0 )? ) )
            // InternalFeatureLangParser.g:4156:1: ( ( rule__CreateComposition__Group_4__0 )? )
            {
            // InternalFeatureLangParser.g:4156:1: ( ( rule__CreateComposition__Group_4__0 )? )
            // InternalFeatureLangParser.g:4157:2: ( rule__CreateComposition__Group_4__0 )?
            {
             before(grammarAccess.getCreateCompositionAccess().getGroup_4()); 
            // InternalFeatureLangParser.g:4158:2: ( rule__CreateComposition__Group_4__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==FullStop) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==It) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // InternalFeatureLangParser.g:4158:3: rule__CreateComposition__Group_4__0
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


    // $ANTLR start "rule__CreateComposition__Group_0_1__0"
    // InternalFeatureLangParser.g:4167:1: rule__CreateComposition__Group_0_1__0 : rule__CreateComposition__Group_0_1__0__Impl rule__CreateComposition__Group_0_1__1 ;
    public final void rule__CreateComposition__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4171:1: ( rule__CreateComposition__Group_0_1__0__Impl rule__CreateComposition__Group_0_1__1 )
            // InternalFeatureLangParser.g:4172:2: rule__CreateComposition__Group_0_1__0__Impl rule__CreateComposition__Group_0_1__1
            {
            pushFollow(FOLLOW_34);
            rule__CreateComposition__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateComposition__Group_0_1__1();

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
    // $ANTLR end "rule__CreateComposition__Group_0_1__0"


    // $ANTLR start "rule__CreateComposition__Group_0_1__0__Impl"
    // InternalFeatureLangParser.g:4179:1: rule__CreateComposition__Group_0_1__0__Impl : ( Composition ) ;
    public final void rule__CreateComposition__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4183:1: ( ( Composition ) )
            // InternalFeatureLangParser.g:4184:1: ( Composition )
            {
            // InternalFeatureLangParser.g:4184:1: ( Composition )
            // InternalFeatureLangParser.g:4185:2: Composition
            {
             before(grammarAccess.getCreateCompositionAccess().getCompositionKeyword_0_1_0()); 
            match(input,Composition,FOLLOW_2); 
             after(grammarAccess.getCreateCompositionAccess().getCompositionKeyword_0_1_0()); 

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
    // $ANTLR end "rule__CreateComposition__Group_0_1__0__Impl"


    // $ANTLR start "rule__CreateComposition__Group_0_1__1"
    // InternalFeatureLangParser.g:4194:1: rule__CreateComposition__Group_0_1__1 : rule__CreateComposition__Group_0_1__1__Impl ;
    public final void rule__CreateComposition__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4198:1: ( rule__CreateComposition__Group_0_1__1__Impl )
            // InternalFeatureLangParser.g:4199:2: rule__CreateComposition__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CreateComposition__Group_0_1__1__Impl();

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
    // $ANTLR end "rule__CreateComposition__Group_0_1__1"


    // $ANTLR start "rule__CreateComposition__Group_0_1__1__Impl"
    // InternalFeatureLangParser.g:4205:1: rule__CreateComposition__Group_0_1__1__Impl : ( To ) ;
    public final void rule__CreateComposition__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4209:1: ( ( To ) )
            // InternalFeatureLangParser.g:4210:1: ( To )
            {
            // InternalFeatureLangParser.g:4210:1: ( To )
            // InternalFeatureLangParser.g:4211:2: To
            {
             before(grammarAccess.getCreateCompositionAccess().getToKeyword_0_1_1()); 
            match(input,To,FOLLOW_2); 
             after(grammarAccess.getCreateCompositionAccess().getToKeyword_0_1_1()); 

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
    // $ANTLR end "rule__CreateComposition__Group_0_1__1__Impl"


    // $ANTLR start "rule__CreateComposition__Group_4__0"
    // InternalFeatureLangParser.g:4221:1: rule__CreateComposition__Group_4__0 : rule__CreateComposition__Group_4__0__Impl rule__CreateComposition__Group_4__1 ;
    public final void rule__CreateComposition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4225:1: ( rule__CreateComposition__Group_4__0__Impl rule__CreateComposition__Group_4__1 )
            // InternalFeatureLangParser.g:4226:2: rule__CreateComposition__Group_4__0__Impl rule__CreateComposition__Group_4__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalFeatureLangParser.g:4233:1: rule__CreateComposition__Group_4__0__Impl : ( FullStop ) ;
    public final void rule__CreateComposition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4237:1: ( ( FullStop ) )
            // InternalFeatureLangParser.g:4238:1: ( FullStop )
            {
            // InternalFeatureLangParser.g:4238:1: ( FullStop )
            // InternalFeatureLangParser.g:4239:2: FullStop
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
    // InternalFeatureLangParser.g:4248:1: rule__CreateComposition__Group_4__1 : rule__CreateComposition__Group_4__1__Impl rule__CreateComposition__Group_4__2 ;
    public final void rule__CreateComposition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4252:1: ( rule__CreateComposition__Group_4__1__Impl rule__CreateComposition__Group_4__2 )
            // InternalFeatureLangParser.g:4253:2: rule__CreateComposition__Group_4__1__Impl rule__CreateComposition__Group_4__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalFeatureLangParser.g:4260:1: rule__CreateComposition__Group_4__1__Impl : ( It ) ;
    public final void rule__CreateComposition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4264:1: ( ( It ) )
            // InternalFeatureLangParser.g:4265:1: ( It )
            {
            // InternalFeatureLangParser.g:4265:1: ( It )
            // InternalFeatureLangParser.g:4266:2: It
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
    // InternalFeatureLangParser.g:4275:1: rule__CreateComposition__Group_4__2 : rule__CreateComposition__Group_4__2__Impl rule__CreateComposition__Group_4__3 ;
    public final void rule__CreateComposition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4279:1: ( rule__CreateComposition__Group_4__2__Impl rule__CreateComposition__Group_4__3 )
            // InternalFeatureLangParser.g:4280:2: rule__CreateComposition__Group_4__2__Impl rule__CreateComposition__Group_4__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalFeatureLangParser.g:4287:1: rule__CreateComposition__Group_4__2__Impl : ( ( rule__CreateComposition__PriorityAssignment_4_2 ) ) ;
    public final void rule__CreateComposition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4291:1: ( ( ( rule__CreateComposition__PriorityAssignment_4_2 ) ) )
            // InternalFeatureLangParser.g:4292:1: ( ( rule__CreateComposition__PriorityAssignment_4_2 ) )
            {
            // InternalFeatureLangParser.g:4292:1: ( ( rule__CreateComposition__PriorityAssignment_4_2 ) )
            // InternalFeatureLangParser.g:4293:2: ( rule__CreateComposition__PriorityAssignment_4_2 )
            {
             before(grammarAccess.getCreateCompositionAccess().getPriorityAssignment_4_2()); 
            // InternalFeatureLangParser.g:4294:2: ( rule__CreateComposition__PriorityAssignment_4_2 )
            // InternalFeatureLangParser.g:4294:3: rule__CreateComposition__PriorityAssignment_4_2
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
    // InternalFeatureLangParser.g:4302:1: rule__CreateComposition__Group_4__3 : rule__CreateComposition__Group_4__3__Impl rule__CreateComposition__Group_4__4 ;
    public final void rule__CreateComposition__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4306:1: ( rule__CreateComposition__Group_4__3__Impl rule__CreateComposition__Group_4__4 )
            // InternalFeatureLangParser.g:4307:2: rule__CreateComposition__Group_4__3__Impl rule__CreateComposition__Group_4__4
            {
            pushFollow(FOLLOW_41);
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
    // InternalFeatureLangParser.g:4314:1: rule__CreateComposition__Group_4__3__Impl : ( Be ) ;
    public final void rule__CreateComposition__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4318:1: ( ( Be ) )
            // InternalFeatureLangParser.g:4319:1: ( Be )
            {
            // InternalFeatureLangParser.g:4319:1: ( Be )
            // InternalFeatureLangParser.g:4320:2: Be
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
    // InternalFeatureLangParser.g:4329:1: rule__CreateComposition__Group_4__4 : rule__CreateComposition__Group_4__4__Impl ;
    public final void rule__CreateComposition__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4333:1: ( rule__CreateComposition__Group_4__4__Impl )
            // InternalFeatureLangParser.g:4334:2: rule__CreateComposition__Group_4__4__Impl
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
    // InternalFeatureLangParser.g:4340:1: rule__CreateComposition__Group_4__4__Impl : ( ( rule__CreateComposition__PublicityAssignment_4_4 ) ) ;
    public final void rule__CreateComposition__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4344:1: ( ( ( rule__CreateComposition__PublicityAssignment_4_4 ) ) )
            // InternalFeatureLangParser.g:4345:1: ( ( rule__CreateComposition__PublicityAssignment_4_4 ) )
            {
            // InternalFeatureLangParser.g:4345:1: ( ( rule__CreateComposition__PublicityAssignment_4_4 ) )
            // InternalFeatureLangParser.g:4346:2: ( rule__CreateComposition__PublicityAssignment_4_4 )
            {
             before(grammarAccess.getCreateCompositionAccess().getPublicityAssignment_4_4()); 
            // InternalFeatureLangParser.g:4347:2: ( rule__CreateComposition__PublicityAssignment_4_4 )
            // InternalFeatureLangParser.g:4347:3: rule__CreateComposition__PublicityAssignment_4_4
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
    // InternalFeatureLangParser.g:4356:1: rule__EditComposition__Group__0 : rule__EditComposition__Group__0__Impl rule__EditComposition__Group__1 ;
    public final void rule__EditComposition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4360:1: ( rule__EditComposition__Group__0__Impl rule__EditComposition__Group__1 )
            // InternalFeatureLangParser.g:4361:2: rule__EditComposition__Group__0__Impl rule__EditComposition__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalFeatureLangParser.g:4368:1: rule__EditComposition__Group__0__Impl : ( ( Have )? ) ;
    public final void rule__EditComposition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4372:1: ( ( ( Have )? ) )
            // InternalFeatureLangParser.g:4373:1: ( ( Have )? )
            {
            // InternalFeatureLangParser.g:4373:1: ( ( Have )? )
            // InternalFeatureLangParser.g:4374:2: ( Have )?
            {
             before(grammarAccess.getEditCompositionAccess().getHaveKeyword_0()); 
            // InternalFeatureLangParser.g:4375:2: ( Have )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==Have) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalFeatureLangParser.g:4375:3: Have
                    {
                    match(input,Have,FOLLOW_2); 

                    }
                    break;

            }

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
    // InternalFeatureLangParser.g:4383:1: rule__EditComposition__Group__1 : rule__EditComposition__Group__1__Impl rule__EditComposition__Group__2 ;
    public final void rule__EditComposition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4387:1: ( rule__EditComposition__Group__1__Impl rule__EditComposition__Group__2 )
            // InternalFeatureLangParser.g:4388:2: rule__EditComposition__Group__1__Impl rule__EditComposition__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalFeatureLangParser.g:4395:1: rule__EditComposition__Group__1__Impl : ( Composition ) ;
    public final void rule__EditComposition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4399:1: ( ( Composition ) )
            // InternalFeatureLangParser.g:4400:1: ( Composition )
            {
            // InternalFeatureLangParser.g:4400:1: ( Composition )
            // InternalFeatureLangParser.g:4401:2: Composition
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
    // InternalFeatureLangParser.g:4410:1: rule__EditComposition__Group__2 : rule__EditComposition__Group__2__Impl rule__EditComposition__Group__3 ;
    public final void rule__EditComposition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4414:1: ( rule__EditComposition__Group__2__Impl rule__EditComposition__Group__3 )
            // InternalFeatureLangParser.g:4415:2: rule__EditComposition__Group__2__Impl rule__EditComposition__Group__3
            {
            pushFollow(FOLLOW_43);
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
    // InternalFeatureLangParser.g:4422:1: rule__EditComposition__Group__2__Impl : ( ( rule__EditComposition__CompositionNameAssignment_2 ) ) ;
    public final void rule__EditComposition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4426:1: ( ( ( rule__EditComposition__CompositionNameAssignment_2 ) ) )
            // InternalFeatureLangParser.g:4427:1: ( ( rule__EditComposition__CompositionNameAssignment_2 ) )
            {
            // InternalFeatureLangParser.g:4427:1: ( ( rule__EditComposition__CompositionNameAssignment_2 ) )
            // InternalFeatureLangParser.g:4428:2: ( rule__EditComposition__CompositionNameAssignment_2 )
            {
             before(grammarAccess.getEditCompositionAccess().getCompositionNameAssignment_2()); 
            // InternalFeatureLangParser.g:4429:2: ( rule__EditComposition__CompositionNameAssignment_2 )
            // InternalFeatureLangParser.g:4429:3: rule__EditComposition__CompositionNameAssignment_2
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
    // InternalFeatureLangParser.g:4437:1: rule__EditComposition__Group__3 : rule__EditComposition__Group__3__Impl rule__EditComposition__Group__4 ;
    public final void rule__EditComposition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4441:1: ( rule__EditComposition__Group__3__Impl rule__EditComposition__Group__4 )
            // InternalFeatureLangParser.g:4442:2: rule__EditComposition__Group__3__Impl rule__EditComposition__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalFeatureLangParser.g:4449:1: rule__EditComposition__Group__3__Impl : ( That ) ;
    public final void rule__EditComposition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4453:1: ( ( That ) )
            // InternalFeatureLangParser.g:4454:1: ( That )
            {
            // InternalFeatureLangParser.g:4454:1: ( That )
            // InternalFeatureLangParser.g:4455:2: That
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
    // InternalFeatureLangParser.g:4464:1: rule__EditComposition__Group__4 : rule__EditComposition__Group__4__Impl rule__EditComposition__Group__5 ;
    public final void rule__EditComposition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4468:1: ( rule__EditComposition__Group__4__Impl rule__EditComposition__Group__5 )
            // InternalFeatureLangParser.g:4469:2: rule__EditComposition__Group__4__Impl rule__EditComposition__Group__5
            {
            pushFollow(FOLLOW_41);
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
    // InternalFeatureLangParser.g:4476:1: rule__EditComposition__Group__4__Impl : ( Is ) ;
    public final void rule__EditComposition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4480:1: ( ( Is ) )
            // InternalFeatureLangParser.g:4481:1: ( Is )
            {
            // InternalFeatureLangParser.g:4481:1: ( Is )
            // InternalFeatureLangParser.g:4482:2: Is
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
    // InternalFeatureLangParser.g:4491:1: rule__EditComposition__Group__5 : rule__EditComposition__Group__5__Impl ;
    public final void rule__EditComposition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4495:1: ( rule__EditComposition__Group__5__Impl )
            // InternalFeatureLangParser.g:4496:2: rule__EditComposition__Group__5__Impl
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
    // InternalFeatureLangParser.g:4502:1: rule__EditComposition__Group__5__Impl : ( ( rule__EditComposition__PublicityAssignment_5 ) ) ;
    public final void rule__EditComposition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4506:1: ( ( ( rule__EditComposition__PublicityAssignment_5 ) ) )
            // InternalFeatureLangParser.g:4507:1: ( ( rule__EditComposition__PublicityAssignment_5 ) )
            {
            // InternalFeatureLangParser.g:4507:1: ( ( rule__EditComposition__PublicityAssignment_5 ) )
            // InternalFeatureLangParser.g:4508:2: ( rule__EditComposition__PublicityAssignment_5 )
            {
             before(grammarAccess.getEditCompositionAccess().getPublicityAssignment_5()); 
            // InternalFeatureLangParser.g:4509:2: ( rule__EditComposition__PublicityAssignment_5 )
            // InternalFeatureLangParser.g:4509:3: rule__EditComposition__PublicityAssignment_5
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
    // InternalFeatureLangParser.g:4518:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4522:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalFeatureLangParser.g:4523:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalFeatureLangParser.g:4530:1: rule__Class__Group__0__Impl : ( ( rule__Class__Alternatives_0 )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4534:1: ( ( ( rule__Class__Alternatives_0 )? ) )
            // InternalFeatureLangParser.g:4535:1: ( ( rule__Class__Alternatives_0 )? )
            {
            // InternalFeatureLangParser.g:4535:1: ( ( rule__Class__Alternatives_0 )? )
            // InternalFeatureLangParser.g:4536:2: ( rule__Class__Alternatives_0 )?
            {
             before(grammarAccess.getClassAccess().getAlternatives_0()); 
            // InternalFeatureLangParser.g:4537:2: ( rule__Class__Alternatives_0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==The||LA43_0==A) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalFeatureLangParser.g:4537:3: rule__Class__Alternatives_0
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
    // InternalFeatureLangParser.g:4545:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4549:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalFeatureLangParser.g:4550:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalFeatureLangParser.g:4557:1: rule__Class__Group__1__Impl : ( ( rule__Class__AbstractionAssignment_1 )? ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4561:1: ( ( ( rule__Class__AbstractionAssignment_1 )? ) )
            // InternalFeatureLangParser.g:4562:1: ( ( rule__Class__AbstractionAssignment_1 )? )
            {
            // InternalFeatureLangParser.g:4562:1: ( ( rule__Class__AbstractionAssignment_1 )? )
            // InternalFeatureLangParser.g:4563:2: ( rule__Class__AbstractionAssignment_1 )?
            {
             before(grammarAccess.getClassAccess().getAbstractionAssignment_1()); 
            // InternalFeatureLangParser.g:4564:2: ( rule__Class__AbstractionAssignment_1 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==Abstract||LA44_0==New) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalFeatureLangParser.g:4564:3: rule__Class__AbstractionAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__AbstractionAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getAbstractionAssignment_1()); 

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
    // InternalFeatureLangParser.g:4572:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4576:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalFeatureLangParser.g:4577:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalFeatureLangParser.g:4584:1: rule__Class__Group__2__Impl : ( ( Class )? ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4588:1: ( ( ( Class )? ) )
            // InternalFeatureLangParser.g:4589:1: ( ( Class )? )
            {
            // InternalFeatureLangParser.g:4589:1: ( ( Class )? )
            // InternalFeatureLangParser.g:4590:2: ( Class )?
            {
             before(grammarAccess.getClassAccess().getClassKeyword_2()); 
            // InternalFeatureLangParser.g:4591:2: ( Class )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==Class) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalFeatureLangParser.g:4591:3: Class
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
    // InternalFeatureLangParser.g:4599:1: rule__Class__Group__3 : rule__Class__Group__3__Impl ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4603:1: ( rule__Class__Group__3__Impl )
            // InternalFeatureLangParser.g:4604:2: rule__Class__Group__3__Impl
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
    // InternalFeatureLangParser.g:4610:1: rule__Class__Group__3__Impl : ( ( rule__Class__NameAssignment_3 ) ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4614:1: ( ( ( rule__Class__NameAssignment_3 ) ) )
            // InternalFeatureLangParser.g:4615:1: ( ( rule__Class__NameAssignment_3 ) )
            {
            // InternalFeatureLangParser.g:4615:1: ( ( rule__Class__NameAssignment_3 ) )
            // InternalFeatureLangParser.g:4616:2: ( rule__Class__NameAssignment_3 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_3()); 
            // InternalFeatureLangParser.g:4617:2: ( rule__Class__NameAssignment_3 )
            // InternalFeatureLangParser.g:4617:3: rule__Class__NameAssignment_3
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
    // InternalFeatureLangParser.g:4626:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4630:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalFeatureLangParser.g:4631:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalFeatureLangParser.g:4638:1: rule__Attribute__Group__0__Impl : ( ( Attribute )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4642:1: ( ( ( Attribute )? ) )
            // InternalFeatureLangParser.g:4643:1: ( ( Attribute )? )
            {
            // InternalFeatureLangParser.g:4643:1: ( ( Attribute )? )
            // InternalFeatureLangParser.g:4644:2: ( Attribute )?
            {
             before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
            // InternalFeatureLangParser.g:4645:2: ( Attribute )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==Attribute) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalFeatureLangParser.g:4645:3: Attribute
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
    // InternalFeatureLangParser.g:4653:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4657:1: ( rule__Attribute__Group__1__Impl )
            // InternalFeatureLangParser.g:4658:2: rule__Attribute__Group__1__Impl
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
    // InternalFeatureLangParser.g:4664:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4668:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalFeatureLangParser.g:4669:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalFeatureLangParser.g:4669:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalFeatureLangParser.g:4670:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalFeatureLangParser.g:4671:2: ( rule__Attribute__NameAssignment_1 )
            // InternalFeatureLangParser.g:4671:3: rule__Attribute__NameAssignment_1
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
    // InternalFeatureLangParser.g:4680:1: rule__Identifier__Group__0 : rule__Identifier__Group__0__Impl rule__Identifier__Group__1 ;
    public final void rule__Identifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4684:1: ( rule__Identifier__Group__0__Impl rule__Identifier__Group__1 )
            // InternalFeatureLangParser.g:4685:2: rule__Identifier__Group__0__Impl rule__Identifier__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalFeatureLangParser.g:4692:1: rule__Identifier__Group__0__Impl : ( ( rule__Identifier__ValueAssignment_0 ) ) ;
    public final void rule__Identifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4696:1: ( ( ( rule__Identifier__ValueAssignment_0 ) ) )
            // InternalFeatureLangParser.g:4697:1: ( ( rule__Identifier__ValueAssignment_0 ) )
            {
            // InternalFeatureLangParser.g:4697:1: ( ( rule__Identifier__ValueAssignment_0 ) )
            // InternalFeatureLangParser.g:4698:2: ( rule__Identifier__ValueAssignment_0 )
            {
             before(grammarAccess.getIdentifierAccess().getValueAssignment_0()); 
            // InternalFeatureLangParser.g:4699:2: ( rule__Identifier__ValueAssignment_0 )
            // InternalFeatureLangParser.g:4699:3: rule__Identifier__ValueAssignment_0
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
    // InternalFeatureLangParser.g:4707:1: rule__Identifier__Group__1 : rule__Identifier__Group__1__Impl ;
    public final void rule__Identifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4711:1: ( rule__Identifier__Group__1__Impl )
            // InternalFeatureLangParser.g:4712:2: rule__Identifier__Group__1__Impl
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
    // InternalFeatureLangParser.g:4718:1: rule__Identifier__Group__1__Impl : ( ( rule__Identifier__NameAssignment_1 ) ) ;
    public final void rule__Identifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4722:1: ( ( ( rule__Identifier__NameAssignment_1 ) ) )
            // InternalFeatureLangParser.g:4723:1: ( ( rule__Identifier__NameAssignment_1 ) )
            {
            // InternalFeatureLangParser.g:4723:1: ( ( rule__Identifier__NameAssignment_1 ) )
            // InternalFeatureLangParser.g:4724:2: ( rule__Identifier__NameAssignment_1 )
            {
             before(grammarAccess.getIdentifierAccess().getNameAssignment_1()); 
            // InternalFeatureLangParser.g:4725:2: ( rule__Identifier__NameAssignment_1 )
            // InternalFeatureLangParser.g:4725:3: rule__Identifier__NameAssignment_1
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


    // $ANTLR start "rule__AttributeValue__Group_0__0"
    // InternalFeatureLangParser.g:4734:1: rule__AttributeValue__Group_0__0 : rule__AttributeValue__Group_0__0__Impl rule__AttributeValue__Group_0__1 ;
    public final void rule__AttributeValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4738:1: ( rule__AttributeValue__Group_0__0__Impl rule__AttributeValue__Group_0__1 )
            // InternalFeatureLangParser.g:4739:2: rule__AttributeValue__Group_0__0__Impl rule__AttributeValue__Group_0__1
            {
            pushFollow(FOLLOW_44);
            rule__AttributeValue__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeValue__Group_0__1();

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
    // $ANTLR end "rule__AttributeValue__Group_0__0"


    // $ANTLR start "rule__AttributeValue__Group_0__0__Impl"
    // InternalFeatureLangParser.g:4746:1: rule__AttributeValue__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__AttributeValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4750:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:4751:1: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:4751:1: ( RULE_ID )
            // InternalFeatureLangParser.g:4752:2: RULE_ID
            {
             before(grammarAccess.getAttributeValueAccess().getIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeValueAccess().getIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__AttributeValue__Group_0__0__Impl"


    // $ANTLR start "rule__AttributeValue__Group_0__1"
    // InternalFeatureLangParser.g:4761:1: rule__AttributeValue__Group_0__1 : rule__AttributeValue__Group_0__1__Impl ;
    public final void rule__AttributeValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4765:1: ( rule__AttributeValue__Group_0__1__Impl )
            // InternalFeatureLangParser.g:4766:2: rule__AttributeValue__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeValue__Group_0__1__Impl();

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
    // $ANTLR end "rule__AttributeValue__Group_0__1"


    // $ANTLR start "rule__AttributeValue__Group_0__1__Impl"
    // InternalFeatureLangParser.g:4772:1: rule__AttributeValue__Group_0__1__Impl : ( ( CarriageReturn )? ) ;
    public final void rule__AttributeValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4776:1: ( ( ( CarriageReturn )? ) )
            // InternalFeatureLangParser.g:4777:1: ( ( CarriageReturn )? )
            {
            // InternalFeatureLangParser.g:4777:1: ( ( CarriageReturn )? )
            // InternalFeatureLangParser.g:4778:2: ( CarriageReturn )?
            {
             before(grammarAccess.getAttributeValueAccess().getCarriageReturnKeyword_0_1()); 
            // InternalFeatureLangParser.g:4779:2: ( CarriageReturn )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==CarriageReturn) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalFeatureLangParser.g:4779:3: CarriageReturn
                    {
                    match(input,CarriageReturn,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getAttributeValueAccess().getCarriageReturnKeyword_0_1()); 

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
    // $ANTLR end "rule__AttributeValue__Group_0__1__Impl"


    // $ANTLR start "rule__FeatureRequest__StatementsAssignment"
    // InternalFeatureLangParser.g:4788:1: rule__FeatureRequest__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__FeatureRequest__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4792:1: ( ( ruleStatement ) )
            // InternalFeatureLangParser.g:4793:2: ( ruleStatement )
            {
            // InternalFeatureLangParser.g:4793:2: ( ruleStatement )
            // InternalFeatureLangParser.g:4794:3: ruleStatement
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


    // $ANTLR start "rule__ChangeStatement__TargetAssignment_0_0_0"
    // InternalFeatureLangParser.g:4803:1: rule__ChangeStatement__TargetAssignment_0_0_0 : ( ruleClass ) ;
    public final void rule__ChangeStatement__TargetAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4807:1: ( ( ruleClass ) )
            // InternalFeatureLangParser.g:4808:2: ( ruleClass )
            {
            // InternalFeatureLangParser.g:4808:2: ( ruleClass )
            // InternalFeatureLangParser.g:4809:3: ruleClass
            {
             before(grammarAccess.getChangeStatementAccess().getTargetClassParserRuleCall_0_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getChangeStatementAccess().getTargetClassParserRuleCall_0_0_0_0()); 

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
    // $ANTLR end "rule__ChangeStatement__TargetAssignment_0_0_0"


    // $ANTLR start "rule__ChangeStatement__PriorityAssignment_0_0_1_0"
    // InternalFeatureLangParser.g:4818:1: rule__ChangeStatement__PriorityAssignment_0_0_1_0 : ( rulePriority ) ;
    public final void rule__ChangeStatement__PriorityAssignment_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4822:1: ( ( rulePriority ) )
            // InternalFeatureLangParser.g:4823:2: ( rulePriority )
            {
            // InternalFeatureLangParser.g:4823:2: ( rulePriority )
            // InternalFeatureLangParser.g:4824:3: rulePriority
            {
             before(grammarAccess.getChangeStatementAccess().getPriorityPriorityParserRuleCall_0_0_1_0_0()); 
            pushFollow(FOLLOW_2);
            rulePriority();

            state._fsp--;

             after(grammarAccess.getChangeStatementAccess().getPriorityPriorityParserRuleCall_0_0_1_0_0()); 

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
    // $ANTLR end "rule__ChangeStatement__PriorityAssignment_0_0_1_0"


    // $ANTLR start "rule__ChangeStatement__NegationAssignment_0_0_1_1"
    // InternalFeatureLangParser.g:4833:1: rule__ChangeStatement__NegationAssignment_0_0_1_1 : ( ( Not ) ) ;
    public final void rule__ChangeStatement__NegationAssignment_0_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4837:1: ( ( ( Not ) ) )
            // InternalFeatureLangParser.g:4838:2: ( ( Not ) )
            {
            // InternalFeatureLangParser.g:4838:2: ( ( Not ) )
            // InternalFeatureLangParser.g:4839:3: ( Not )
            {
             before(grammarAccess.getChangeStatementAccess().getNegationNotKeyword_0_0_1_1_0()); 
            // InternalFeatureLangParser.g:4840:3: ( Not )
            // InternalFeatureLangParser.g:4841:4: Not
            {
             before(grammarAccess.getChangeStatementAccess().getNegationNotKeyword_0_0_1_1_0()); 
            match(input,Not,FOLLOW_2); 
             after(grammarAccess.getChangeStatementAccess().getNegationNotKeyword_0_0_1_1_0()); 

            }

             after(grammarAccess.getChangeStatementAccess().getNegationNotKeyword_0_0_1_1_0()); 

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
    // $ANTLR end "rule__ChangeStatement__NegationAssignment_0_0_1_1"


    // $ANTLR start "rule__ChangeStatement__NegationAssignment_0_1_0_2"
    // InternalFeatureLangParser.g:4852:1: rule__ChangeStatement__NegationAssignment_0_1_0_2 : ( ( Remove ) ) ;
    public final void rule__ChangeStatement__NegationAssignment_0_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4856:1: ( ( ( Remove ) ) )
            // InternalFeatureLangParser.g:4857:2: ( ( Remove ) )
            {
            // InternalFeatureLangParser.g:4857:2: ( ( Remove ) )
            // InternalFeatureLangParser.g:4858:3: ( Remove )
            {
             before(grammarAccess.getChangeStatementAccess().getNegationRemoveKeyword_0_1_0_2_0()); 
            // InternalFeatureLangParser.g:4859:3: ( Remove )
            // InternalFeatureLangParser.g:4860:4: Remove
            {
             before(grammarAccess.getChangeStatementAccess().getNegationRemoveKeyword_0_1_0_2_0()); 
            match(input,Remove,FOLLOW_2); 
             after(grammarAccess.getChangeStatementAccess().getNegationRemoveKeyword_0_1_0_2_0()); 

            }

             after(grammarAccess.getChangeStatementAccess().getNegationRemoveKeyword_0_1_0_2_0()); 

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
    // $ANTLR end "rule__ChangeStatement__NegationAssignment_0_1_0_2"


    // $ANTLR start "rule__ChangeStatement__TargetAssignment_0_1_2"
    // InternalFeatureLangParser.g:4871:1: rule__ChangeStatement__TargetAssignment_0_1_2 : ( ruleClass ) ;
    public final void rule__ChangeStatement__TargetAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4875:1: ( ( ruleClass ) )
            // InternalFeatureLangParser.g:4876:2: ( ruleClass )
            {
            // InternalFeatureLangParser.g:4876:2: ( ruleClass )
            // InternalFeatureLangParser.g:4877:3: ruleClass
            {
             before(grammarAccess.getChangeStatementAccess().getTargetClassParserRuleCall_0_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getChangeStatementAccess().getTargetClassParserRuleCall_0_1_2_0()); 

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
    // $ANTLR end "rule__ChangeStatement__TargetAssignment_0_1_2"


    // $ANTLR start "rule__ChangeStatement__ActionAssignment_1_0"
    // InternalFeatureLangParser.g:4886:1: rule__ChangeStatement__ActionAssignment_1_0 : ( ruleAction ) ;
    public final void rule__ChangeStatement__ActionAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4890:1: ( ( ruleAction ) )
            // InternalFeatureLangParser.g:4891:2: ( ruleAction )
            {
            // InternalFeatureLangParser.g:4891:2: ( ruleAction )
            // InternalFeatureLangParser.g:4892:3: ruleAction
            {
             before(grammarAccess.getChangeStatementAccess().getActionActionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getChangeStatementAccess().getActionActionParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__ChangeStatement__ActionAssignment_1_0"


    // $ANTLR start "rule__ChangeStatement__UpdateAssignment_1_1"
    // InternalFeatureLangParser.g:4901:1: rule__ChangeStatement__UpdateAssignment_1_1 : ( ruleUpdateAction ) ;
    public final void rule__ChangeStatement__UpdateAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4905:1: ( ( ruleUpdateAction ) )
            // InternalFeatureLangParser.g:4906:2: ( ruleUpdateAction )
            {
            // InternalFeatureLangParser.g:4906:2: ( ruleUpdateAction )
            // InternalFeatureLangParser.g:4907:3: ruleUpdateAction
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


    // $ANTLR start "rule__CreationStatement__ClassElementAssignment_0_0"
    // InternalFeatureLangParser.g:4916:1: rule__CreationStatement__ClassElementAssignment_0_0 : ( ruleClass ) ;
    public final void rule__CreationStatement__ClassElementAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4920:1: ( ( ruleClass ) )
            // InternalFeatureLangParser.g:4921:2: ( ruleClass )
            {
            // InternalFeatureLangParser.g:4921:2: ( ruleClass )
            // InternalFeatureLangParser.g:4922:3: ruleClass
            {
             before(grammarAccess.getCreationStatementAccess().getClassElementClassParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getCreationStatementAccess().getClassElementClassParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__CreationStatement__ClassElementAssignment_0_0"


    // $ANTLR start "rule__CreationStatement__PriorityAssignment_0_1"
    // InternalFeatureLangParser.g:4931:1: rule__CreationStatement__PriorityAssignment_0_1 : ( rulePriority ) ;
    public final void rule__CreationStatement__PriorityAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4935:1: ( ( rulePriority ) )
            // InternalFeatureLangParser.g:4936:2: ( rulePriority )
            {
            // InternalFeatureLangParser.g:4936:2: ( rulePriority )
            // InternalFeatureLangParser.g:4937:3: rulePriority
            {
             before(grammarAccess.getCreationStatementAccess().getPriorityPriorityParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            rulePriority();

            state._fsp--;

             after(grammarAccess.getCreationStatementAccess().getPriorityPriorityParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__CreationStatement__PriorityAssignment_0_1"


    // $ANTLR start "rule__CreationStatement__NegationAssignment_0_2"
    // InternalFeatureLangParser.g:4946:1: rule__CreationStatement__NegationAssignment_0_2 : ( ( Not ) ) ;
    public final void rule__CreationStatement__NegationAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4950:1: ( ( ( Not ) ) )
            // InternalFeatureLangParser.g:4951:2: ( ( Not ) )
            {
            // InternalFeatureLangParser.g:4951:2: ( ( Not ) )
            // InternalFeatureLangParser.g:4952:3: ( Not )
            {
             before(grammarAccess.getCreationStatementAccess().getNegationNotKeyword_0_2_0()); 
            // InternalFeatureLangParser.g:4953:3: ( Not )
            // InternalFeatureLangParser.g:4954:4: Not
            {
             before(grammarAccess.getCreationStatementAccess().getNegationNotKeyword_0_2_0()); 
            match(input,Not,FOLLOW_2); 
             after(grammarAccess.getCreationStatementAccess().getNegationNotKeyword_0_2_0()); 

            }

             after(grammarAccess.getCreationStatementAccess().getNegationNotKeyword_0_2_0()); 

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
    // $ANTLR end "rule__CreationStatement__NegationAssignment_0_2"


    // $ANTLR start "rule__CreationStatement__NegationAssignment_1_0_1"
    // InternalFeatureLangParser.g:4965:1: rule__CreationStatement__NegationAssignment_1_0_1 : ( ( Delete ) ) ;
    public final void rule__CreationStatement__NegationAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4969:1: ( ( ( Delete ) ) )
            // InternalFeatureLangParser.g:4970:2: ( ( Delete ) )
            {
            // InternalFeatureLangParser.g:4970:2: ( ( Delete ) )
            // InternalFeatureLangParser.g:4971:3: ( Delete )
            {
             before(grammarAccess.getCreationStatementAccess().getNegationDeleteKeyword_1_0_1_0()); 
            // InternalFeatureLangParser.g:4972:3: ( Delete )
            // InternalFeatureLangParser.g:4973:4: Delete
            {
             before(grammarAccess.getCreationStatementAccess().getNegationDeleteKeyword_1_0_1_0()); 
            match(input,Delete,FOLLOW_2); 
             after(grammarAccess.getCreationStatementAccess().getNegationDeleteKeyword_1_0_1_0()); 

            }

             after(grammarAccess.getCreationStatementAccess().getNegationDeleteKeyword_1_0_1_0()); 

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
    // $ANTLR end "rule__CreationStatement__NegationAssignment_1_0_1"


    // $ANTLR start "rule__CreationStatement__ClassElementAssignment_1_1"
    // InternalFeatureLangParser.g:4984:1: rule__CreationStatement__ClassElementAssignment_1_1 : ( ruleClass ) ;
    public final void rule__CreationStatement__ClassElementAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4988:1: ( ( ruleClass ) )
            // InternalFeatureLangParser.g:4989:2: ( ruleClass )
            {
            // InternalFeatureLangParser.g:4989:2: ( ruleClass )
            // InternalFeatureLangParser.g:4990:3: ruleClass
            {
             before(grammarAccess.getCreationStatementAccess().getClassElementClassParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getCreationStatementAccess().getClassElementClassParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__CreationStatement__ClassElementAssignment_1_1"


    // $ANTLR start "rule__Action__TypeAssignment"
    // InternalFeatureLangParser.g:4999:1: rule__Action__TypeAssignment : ( ( rule__Action__TypeAlternatives_0 ) ) ;
    public final void rule__Action__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5003:1: ( ( ( rule__Action__TypeAlternatives_0 ) ) )
            // InternalFeatureLangParser.g:5004:2: ( ( rule__Action__TypeAlternatives_0 ) )
            {
            // InternalFeatureLangParser.g:5004:2: ( ( rule__Action__TypeAlternatives_0 ) )
            // InternalFeatureLangParser.g:5005:3: ( rule__Action__TypeAlternatives_0 )
            {
             before(grammarAccess.getActionAccess().getTypeAlternatives_0()); 
            // InternalFeatureLangParser.g:5006:3: ( rule__Action__TypeAlternatives_0 )
            // InternalFeatureLangParser.g:5006:4: rule__Action__TypeAlternatives_0
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
    // InternalFeatureLangParser.g:5014:1: rule__UpdateAction__AttributeAssignment_3 : ( ruleAttribute ) ;
    public final void rule__UpdateAction__AttributeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5018:1: ( ( ruleAttribute ) )
            // InternalFeatureLangParser.g:5019:2: ( ruleAttribute )
            {
            // InternalFeatureLangParser.g:5019:2: ( ruleAttribute )
            // InternalFeatureLangParser.g:5020:3: ruleAttribute
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
    // InternalFeatureLangParser.g:5029:1: rule__UpdateAction__PriorityAssignment_6 : ( rulePriority ) ;
    public final void rule__UpdateAction__PriorityAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5033:1: ( ( rulePriority ) )
            // InternalFeatureLangParser.g:5034:2: ( rulePriority )
            {
            // InternalFeatureLangParser.g:5034:2: ( rulePriority )
            // InternalFeatureLangParser.g:5035:3: rulePriority
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
    // InternalFeatureLangParser.g:5044:1: rule__UpdateAction__DatatypeAssignment_7_0 : ( ruleUpdateAttributeDatatype ) ;
    public final void rule__UpdateAction__DatatypeAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5048:1: ( ( ruleUpdateAttributeDatatype ) )
            // InternalFeatureLangParser.g:5049:2: ( ruleUpdateAttributeDatatype )
            {
            // InternalFeatureLangParser.g:5049:2: ( ruleUpdateAttributeDatatype )
            // InternalFeatureLangParser.g:5050:3: ruleUpdateAttributeDatatype
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
    // InternalFeatureLangParser.g:5059:1: rule__UpdateAction__IdentifierAssignment_7_1 : ( ruleUpdateAttributeIdentifier ) ;
    public final void rule__UpdateAction__IdentifierAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5063:1: ( ( ruleUpdateAttributeIdentifier ) )
            // InternalFeatureLangParser.g:5064:2: ( ruleUpdateAttributeIdentifier )
            {
            // InternalFeatureLangParser.g:5064:2: ( ruleUpdateAttributeIdentifier )
            // InternalFeatureLangParser.g:5065:3: ruleUpdateAttributeIdentifier
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
    // InternalFeatureLangParser.g:5074:1: rule__UpdateAction__ValueAssignment_7_2 : ( ruleUpdateAttributeValue ) ;
    public final void rule__UpdateAction__ValueAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5078:1: ( ( ruleUpdateAttributeValue ) )
            // InternalFeatureLangParser.g:5079:2: ( ruleUpdateAttributeValue )
            {
            // InternalFeatureLangParser.g:5079:2: ( ruleUpdateAttributeValue )
            // InternalFeatureLangParser.g:5080:3: ruleUpdateAttributeValue
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
    // InternalFeatureLangParser.g:5089:1: rule__UpdateAttributeDatatype__TypeAssignment_2 : ( ruleDatatype ) ;
    public final void rule__UpdateAttributeDatatype__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5093:1: ( ( ruleDatatype ) )
            // InternalFeatureLangParser.g:5094:2: ( ruleDatatype )
            {
            // InternalFeatureLangParser.g:5094:2: ( ruleDatatype )
            // InternalFeatureLangParser.g:5095:3: ruleDatatype
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
    // InternalFeatureLangParser.g:5104:1: rule__UpdateAttributeIdentifier__IdentifierAssignment_2 : ( ruleIdentifier ) ;
    public final void rule__UpdateAttributeIdentifier__IdentifierAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5108:1: ( ( ruleIdentifier ) )
            // InternalFeatureLangParser.g:5109:2: ( ruleIdentifier )
            {
            // InternalFeatureLangParser.g:5109:2: ( ruleIdentifier )
            // InternalFeatureLangParser.g:5110:3: ruleIdentifier
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
    // InternalFeatureLangParser.g:5119:1: rule__UpdateAttributeValue__ValueAssignment_3 : ( ruleAttributeValue ) ;
    public final void rule__UpdateAttributeValue__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5123:1: ( ( ruleAttributeValue ) )
            // InternalFeatureLangParser.g:5124:2: ( ruleAttributeValue )
            {
            // InternalFeatureLangParser.g:5124:2: ( ruleAttributeValue )
            // InternalFeatureLangParser.g:5125:3: ruleAttributeValue
            {
             before(grammarAccess.getUpdateAttributeValueAccess().getValueAttributeValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeValue();

            state._fsp--;

             after(grammarAccess.getUpdateAttributeValueAccess().getValueAttributeValueParserRuleCall_3_0()); 

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
    // InternalFeatureLangParser.g:5134:1: rule__AttributeAction__AttributeAssignment_2 : ( ruleAttribute ) ;
    public final void rule__AttributeAction__AttributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5138:1: ( ( ruleAttribute ) )
            // InternalFeatureLangParser.g:5139:2: ( ruleAttribute )
            {
            // InternalFeatureLangParser.g:5139:2: ( ruleAttribute )
            // InternalFeatureLangParser.g:5140:3: ruleAttribute
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
    // InternalFeatureLangParser.g:5149:1: rule__AttributeAction__TypeAssignment_3_4 : ( ruleDatatype ) ;
    public final void rule__AttributeAction__TypeAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5153:1: ( ( ruleDatatype ) )
            // InternalFeatureLangParser.g:5154:2: ( ruleDatatype )
            {
            // InternalFeatureLangParser.g:5154:2: ( ruleDatatype )
            // InternalFeatureLangParser.g:5155:3: ruleDatatype
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


    // $ANTLR start "rule__AttributeAction__PriorityAssignment_4_2"
    // InternalFeatureLangParser.g:5164:1: rule__AttributeAction__PriorityAssignment_4_2 : ( rulePriority ) ;
    public final void rule__AttributeAction__PriorityAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5168:1: ( ( rulePriority ) )
            // InternalFeatureLangParser.g:5169:2: ( rulePriority )
            {
            // InternalFeatureLangParser.g:5169:2: ( rulePriority )
            // InternalFeatureLangParser.g:5170:3: rulePriority
            {
             before(grammarAccess.getAttributeActionAccess().getPriorityPriorityParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            rulePriority();

            state._fsp--;

             after(grammarAccess.getAttributeActionAccess().getPriorityPriorityParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__AttributeAction__PriorityAssignment_4_2"


    // $ANTLR start "rule__AttributeAction__ValueAssignment_4_3"
    // InternalFeatureLangParser.g:5179:1: rule__AttributeAction__ValueAssignment_4_3 : ( ruleUpdateAttributeValue ) ;
    public final void rule__AttributeAction__ValueAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5183:1: ( ( ruleUpdateAttributeValue ) )
            // InternalFeatureLangParser.g:5184:2: ( ruleUpdateAttributeValue )
            {
            // InternalFeatureLangParser.g:5184:2: ( ruleUpdateAttributeValue )
            // InternalFeatureLangParser.g:5185:3: ruleUpdateAttributeValue
            {
             before(grammarAccess.getAttributeActionAccess().getValueUpdateAttributeValueParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleUpdateAttributeValue();

            state._fsp--;

             after(grammarAccess.getAttributeActionAccess().getValueUpdateAttributeValueParserRuleCall_4_3_0()); 

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
    // $ANTLR end "rule__AttributeAction__ValueAssignment_4_3"


    // $ANTLR start "rule__AssociationAction__CreateAssignment_2_0"
    // InternalFeatureLangParser.g:5194:1: rule__AssociationAction__CreateAssignment_2_0 : ( ruleCreateAssociation ) ;
    public final void rule__AssociationAction__CreateAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5198:1: ( ( ruleCreateAssociation ) )
            // InternalFeatureLangParser.g:5199:2: ( ruleCreateAssociation )
            {
            // InternalFeatureLangParser.g:5199:2: ( ruleCreateAssociation )
            // InternalFeatureLangParser.g:5200:3: ruleCreateAssociation
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
    // InternalFeatureLangParser.g:5209:1: rule__AssociationAction__NameAssignment_2_1_0 : ( RULE_ID ) ;
    public final void rule__AssociationAction__NameAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5213:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:5214:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:5214:2: ( RULE_ID )
            // InternalFeatureLangParser.g:5215:3: RULE_ID
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
    // InternalFeatureLangParser.g:5224:1: rule__AssociationAction__EditAssignment_2_1_1 : ( ruleEditAssociation ) ;
    public final void rule__AssociationAction__EditAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5228:1: ( ( ruleEditAssociation ) )
            // InternalFeatureLangParser.g:5229:2: ( ruleEditAssociation )
            {
            // InternalFeatureLangParser.g:5229:2: ( ruleEditAssociation )
            // InternalFeatureLangParser.g:5230:3: ruleEditAssociation
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
    // InternalFeatureLangParser.g:5239:1: rule__CreateAssociation__TargetAssignment_2 : ( ruleClass ) ;
    public final void rule__CreateAssociation__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5243:1: ( ( ruleClass ) )
            // InternalFeatureLangParser.g:5244:2: ( ruleClass )
            {
            // InternalFeatureLangParser.g:5244:2: ( ruleClass )
            // InternalFeatureLangParser.g:5245:3: ruleClass
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
    // InternalFeatureLangParser.g:5254:1: rule__CreateAssociation__RelationAssignment_4 : ( RULE_ID ) ;
    public final void rule__CreateAssociation__RelationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5258:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:5259:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:5259:2: ( RULE_ID )
            // InternalFeatureLangParser.g:5260:3: RULE_ID
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
    // InternalFeatureLangParser.g:5269:1: rule__EditAssociation__TypeAssignment : ( ( rule__EditAssociation__TypeAlternatives_0 ) ) ;
    public final void rule__EditAssociation__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5273:1: ( ( ( rule__EditAssociation__TypeAlternatives_0 ) ) )
            // InternalFeatureLangParser.g:5274:2: ( ( rule__EditAssociation__TypeAlternatives_0 ) )
            {
            // InternalFeatureLangParser.g:5274:2: ( ( rule__EditAssociation__TypeAlternatives_0 ) )
            // InternalFeatureLangParser.g:5275:3: ( rule__EditAssociation__TypeAlternatives_0 )
            {
             before(grammarAccess.getEditAssociationAccess().getTypeAlternatives_0()); 
            // InternalFeatureLangParser.g:5276:3: ( rule__EditAssociation__TypeAlternatives_0 )
            // InternalFeatureLangParser.g:5276:4: rule__EditAssociation__TypeAlternatives_0
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
    // InternalFeatureLangParser.g:5284:1: rule__SetCompatible__NameAssignment_3 : ( RULE_DATE ) ;
    public final void rule__SetCompatible__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5288:1: ( ( RULE_DATE ) )
            // InternalFeatureLangParser.g:5289:2: ( RULE_DATE )
            {
            // InternalFeatureLangParser.g:5289:2: ( RULE_DATE )
            // InternalFeatureLangParser.g:5290:3: RULE_DATE
            {
             before(grammarAccess.getSetCompatibleAccess().getNameDATETerminalRuleCall_3_0()); 
            match(input,RULE_DATE,FOLLOW_2); 
             after(grammarAccess.getSetCompatibleAccess().getNameDATETerminalRuleCall_3_0()); 

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
    // InternalFeatureLangParser.g:5299:1: rule__SetVersionRange__StartAssignment_4 : ( RULE_DATE ) ;
    public final void rule__SetVersionRange__StartAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5303:1: ( ( RULE_DATE ) )
            // InternalFeatureLangParser.g:5304:2: ( RULE_DATE )
            {
            // InternalFeatureLangParser.g:5304:2: ( RULE_DATE )
            // InternalFeatureLangParser.g:5305:3: RULE_DATE
            {
             before(grammarAccess.getSetVersionRangeAccess().getStartDATETerminalRuleCall_4_0()); 
            match(input,RULE_DATE,FOLLOW_2); 
             after(grammarAccess.getSetVersionRangeAccess().getStartDATETerminalRuleCall_4_0()); 

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
    // InternalFeatureLangParser.g:5314:1: rule__SetVersionRange__EndAssignment_6 : ( RULE_DATE ) ;
    public final void rule__SetVersionRange__EndAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5318:1: ( ( RULE_DATE ) )
            // InternalFeatureLangParser.g:5319:2: ( RULE_DATE )
            {
            // InternalFeatureLangParser.g:5319:2: ( RULE_DATE )
            // InternalFeatureLangParser.g:5320:3: RULE_DATE
            {
             before(grammarAccess.getSetVersionRangeAccess().getEndDATETerminalRuleCall_6_0()); 
            match(input,RULE_DATE,FOLLOW_2); 
             after(grammarAccess.getSetVersionRangeAccess().getEndDATETerminalRuleCall_6_0()); 

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
    // InternalFeatureLangParser.g:5329:1: rule__SetVariant__NameAssignment_5 : ( RULE_DATE ) ;
    public final void rule__SetVariant__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5333:1: ( ( RULE_DATE ) )
            // InternalFeatureLangParser.g:5334:2: ( RULE_DATE )
            {
            // InternalFeatureLangParser.g:5334:2: ( RULE_DATE )
            // InternalFeatureLangParser.g:5335:3: RULE_DATE
            {
             before(grammarAccess.getSetVariantAccess().getNameDATETerminalRuleCall_5_0()); 
            match(input,RULE_DATE,FOLLOW_2); 
             after(grammarAccess.getSetVariantAccess().getNameDATETerminalRuleCall_5_0()); 

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
    // InternalFeatureLangParser.g:5344:1: rule__SetRightOpen__DateAssignment_3 : ( RULE_DATE ) ;
    public final void rule__SetRightOpen__DateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5348:1: ( ( RULE_DATE ) )
            // InternalFeatureLangParser.g:5349:2: ( RULE_DATE )
            {
            // InternalFeatureLangParser.g:5349:2: ( RULE_DATE )
            // InternalFeatureLangParser.g:5350:3: RULE_DATE
            {
             before(grammarAccess.getSetRightOpenAccess().getDateDATETerminalRuleCall_3_0()); 
            match(input,RULE_DATE,FOLLOW_2); 
             after(grammarAccess.getSetRightOpenAccess().getDateDATETerminalRuleCall_3_0()); 

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
    // InternalFeatureLangParser.g:5359:1: rule__SetLeftOpen__DateAssignment_3 : ( RULE_DATE ) ;
    public final void rule__SetLeftOpen__DateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5363:1: ( ( RULE_DATE ) )
            // InternalFeatureLangParser.g:5364:2: ( RULE_DATE )
            {
            // InternalFeatureLangParser.g:5364:2: ( RULE_DATE )
            // InternalFeatureLangParser.g:5365:3: RULE_DATE
            {
             before(grammarAccess.getSetLeftOpenAccess().getDateDATETerminalRuleCall_3_0()); 
            match(input,RULE_DATE,FOLLOW_2); 
             after(grammarAccess.getSetLeftOpenAccess().getDateDATETerminalRuleCall_3_0()); 

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
    // InternalFeatureLangParser.g:5374:1: rule__InheritanceAction__ParentAssignment_2 : ( ruleClass ) ;
    public final void rule__InheritanceAction__ParentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5378:1: ( ( ruleClass ) )
            // InternalFeatureLangParser.g:5379:2: ( ruleClass )
            {
            // InternalFeatureLangParser.g:5379:2: ( ruleClass )
            // InternalFeatureLangParser.g:5380:3: ruleClass
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
    // InternalFeatureLangParser.g:5389:1: rule__CompositionAction__CreateAssignment_0 : ( ruleCreateComposition ) ;
    public final void rule__CompositionAction__CreateAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5393:1: ( ( ruleCreateComposition ) )
            // InternalFeatureLangParser.g:5394:2: ( ruleCreateComposition )
            {
            // InternalFeatureLangParser.g:5394:2: ( ruleCreateComposition )
            // InternalFeatureLangParser.g:5395:3: ruleCreateComposition
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
    // InternalFeatureLangParser.g:5404:1: rule__CompositionAction__EditAssignment_1 : ( ruleEditComposition ) ;
    public final void rule__CompositionAction__EditAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5408:1: ( ( ruleEditComposition ) )
            // InternalFeatureLangParser.g:5409:2: ( ruleEditComposition )
            {
            // InternalFeatureLangParser.g:5409:2: ( ruleEditComposition )
            // InternalFeatureLangParser.g:5410:3: ruleEditComposition
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
    // InternalFeatureLangParser.g:5419:1: rule__CreateComposition__TargetAssignment_1 : ( ruleClass ) ;
    public final void rule__CreateComposition__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5423:1: ( ( ruleClass ) )
            // InternalFeatureLangParser.g:5424:2: ( ruleClass )
            {
            // InternalFeatureLangParser.g:5424:2: ( ruleClass )
            // InternalFeatureLangParser.g:5425:3: ruleClass
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
    // InternalFeatureLangParser.g:5434:1: rule__CreateComposition__RelationAssignment_3 : ( RULE_ID ) ;
    public final void rule__CreateComposition__RelationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5438:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:5439:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:5439:2: ( RULE_ID )
            // InternalFeatureLangParser.g:5440:3: RULE_ID
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
    // InternalFeatureLangParser.g:5449:1: rule__CreateComposition__PriorityAssignment_4_2 : ( rulePriority ) ;
    public final void rule__CreateComposition__PriorityAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5453:1: ( ( rulePriority ) )
            // InternalFeatureLangParser.g:5454:2: ( rulePriority )
            {
            // InternalFeatureLangParser.g:5454:2: ( rulePriority )
            // InternalFeatureLangParser.g:5455:3: rulePriority
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
    // InternalFeatureLangParser.g:5464:1: rule__CreateComposition__PublicityAssignment_4_4 : ( rulePublicity ) ;
    public final void rule__CreateComposition__PublicityAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5468:1: ( ( rulePublicity ) )
            // InternalFeatureLangParser.g:5469:2: ( rulePublicity )
            {
            // InternalFeatureLangParser.g:5469:2: ( rulePublicity )
            // InternalFeatureLangParser.g:5470:3: rulePublicity
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
    // InternalFeatureLangParser.g:5479:1: rule__EditComposition__CompositionNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EditComposition__CompositionNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5483:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:5484:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:5484:2: ( RULE_ID )
            // InternalFeatureLangParser.g:5485:3: RULE_ID
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
    // InternalFeatureLangParser.g:5494:1: rule__EditComposition__PublicityAssignment_5 : ( rulePublicity ) ;
    public final void rule__EditComposition__PublicityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5498:1: ( ( rulePublicity ) )
            // InternalFeatureLangParser.g:5499:2: ( rulePublicity )
            {
            // InternalFeatureLangParser.g:5499:2: ( rulePublicity )
            // InternalFeatureLangParser.g:5500:3: rulePublicity
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


    // $ANTLR start "rule__Class__AbstractionAssignment_1"
    // InternalFeatureLangParser.g:5509:1: rule__Class__AbstractionAssignment_1 : ( ruleAbstraction ) ;
    public final void rule__Class__AbstractionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5513:1: ( ( ruleAbstraction ) )
            // InternalFeatureLangParser.g:5514:2: ( ruleAbstraction )
            {
            // InternalFeatureLangParser.g:5514:2: ( ruleAbstraction )
            // InternalFeatureLangParser.g:5515:3: ruleAbstraction
            {
             before(grammarAccess.getClassAccess().getAbstractionAbstractionEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstraction();

            state._fsp--;

             after(grammarAccess.getClassAccess().getAbstractionAbstractionEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__Class__AbstractionAssignment_1"


    // $ANTLR start "rule__Class__NameAssignment_3"
    // InternalFeatureLangParser.g:5524:1: rule__Class__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5528:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:5529:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:5529:2: ( RULE_ID )
            // InternalFeatureLangParser.g:5530:3: RULE_ID
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
    // InternalFeatureLangParser.g:5539:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5543:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:5544:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:5544:2: ( RULE_ID )
            // InternalFeatureLangParser.g:5545:3: RULE_ID
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
    // InternalFeatureLangParser.g:5554:1: rule__Identifier__ValueAssignment_0 : ( ruleIdentifierValue ) ;
    public final void rule__Identifier__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5558:1: ( ( ruleIdentifierValue ) )
            // InternalFeatureLangParser.g:5559:2: ( ruleIdentifierValue )
            {
            // InternalFeatureLangParser.g:5559:2: ( ruleIdentifierValue )
            // InternalFeatureLangParser.g:5560:3: ruleIdentifierValue
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
    // InternalFeatureLangParser.g:5569:1: rule__Identifier__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Identifier__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5573:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:5574:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:5574:2: ( RULE_ID )
            // InternalFeatureLangParser.g:5575:3: RULE_ID
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
    // InternalFeatureLangParser.g:5584:1: rule__Priority__PriorityAssignment : ( rulePriorityValue ) ;
    public final void rule__Priority__PriorityAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5588:1: ( ( rulePriorityValue ) )
            // InternalFeatureLangParser.g:5589:2: ( rulePriorityValue )
            {
            // InternalFeatureLangParser.g:5589:2: ( rulePriorityValue )
            // InternalFeatureLangParser.g:5590:3: rulePriorityValue
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
    protected DFA22 dfa22 = new DFA22(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\3\12\2\36\1\77\1\4\2\uffff\3\4";
    static final String dfa_3s = "\6\77\1\74\2\uffff\3\74";
    static final String dfa_4s = "\7\uffff\1\1\1\2\3\uffff";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\13\uffff\1\7\2\10\3\uffff\1\7\1\uffff\1\5\17\uffff\1\3\1\uffff\1\7\1\1\12\uffff\1\2\2\uffff\1\6",
            "\1\4\23\uffff\1\5\17\uffff\1\3\20\uffff\1\6",
            "\1\4\23\uffff\1\5\17\uffff\1\3\20\uffff\1\6",
            "\1\5\40\uffff\1\6",
            "\1\5\40\uffff\1\6",
            "\1\6",
            "\4\7\7\uffff\1\7\1\uffff\1\7\13\uffff\1\11\7\uffff\1\7\1\12\6\uffff\1\7\3\uffff\2\7\11\uffff\1\7",
            "",
            "",
            "\4\7\7\uffff\1\7\1\uffff\1\7\15\uffff\1\10\5\uffff\1\7\7\uffff\1\7\1\uffff\1\13\1\uffff\2\7\1\10\10\uffff\1\7",
            "\4\7\7\uffff\1\7\1\uffff\1\7\15\uffff\1\10\5\uffff\1\7\7\uffff\1\7\1\uffff\1\13\1\uffff\2\7\1\10\10\uffff\1\7",
            "\4\7\7\uffff\1\7\1\uffff\1\7\15\uffff\1\10\5\uffff\1\7\7\uffff\1\7\3\uffff\2\7\1\10\10\uffff\1\7"
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
            return "1058:1: rule__Statement__Alternatives_0 : ( ( ruleChangeStatement ) | ( ruleCreationStatement ) );";
        }
    }
    static final String dfa_7s = "\12\uffff";
    static final String dfa_8s = "\1\1\1\uffff\1\5\3\uffff\1\1\2\uffff\1\5";
    static final String dfa_9s = "\1\12\1\uffff\1\4\2\11\1\uffff\1\4\2\11\1\4";
    static final String dfa_10s = "\1\77\1\uffff\3\77\1\uffff\4\77";
    static final String dfa_11s = "\1\uffff\1\2\3\uffff\1\1\4\uffff";
    static final String dfa_12s = "\12\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\13\uffff\3\1\3\uffff\1\1\1\uffff\1\1\17\uffff\1\1\1\uffff\2\1\11\uffff\2\1\2\uffff\1\2",
            "",
            "\4\1\2\uffff\1\5\4\uffff\1\1\1\uffff\1\1\4\uffff\3\5\3\uffff\1\5\1\1\1\5\6\uffff\2\1\6\uffff\1\1\1\5\1\uffff\1\5\1\3\1\1\7\uffff\2\5\1\4\2\uffff\1\5",
            "\1\1\1\5\1\1\4\uffff\1\1\15\uffff\1\5\17\uffff\1\5\20\uffff\1\6",
            "\1\1\1\5\1\1\4\uffff\1\1\15\uffff\1\5\17\uffff\1\5\20\uffff\1\6",
            "",
            "\4\5\2\uffff\1\1\4\uffff\1\5\1\uffff\1\5\4\uffff\3\1\3\uffff\1\1\1\5\1\1\6\uffff\2\5\6\uffff\1\5\1\1\1\uffff\1\1\1\7\1\5\10\uffff\1\1\1\10\2\uffff\1\1",
            "\1\5\1\1\1\5\4\uffff\1\5\15\uffff\1\1\17\uffff\1\1\20\uffff\1\11",
            "\1\5\1\1\1\5\4\uffff\1\5\15\uffff\1\1\17\uffff\1\1\20\uffff\1\11",
            "\4\1\2\uffff\1\5\4\uffff\1\1\1\uffff\1\1\4\uffff\3\5\3\uffff\1\5\1\1\1\5\6\uffff\2\1\6\uffff\1\1\1\5\1\uffff\1\5\1\3\1\1\10\uffff\1\5\1\4\2\uffff\1\5"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 1545:4: ( rule__AttributeValue__Group_0__0 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x9003400051C00402L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x10062020000280F0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000004020000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x9002400040000400L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0008800080000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x8000000000000200L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0008002000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000020006004000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x1004088000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x1000000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0xE000000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x1006002000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x8100000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0200040000001100L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x9002400140000400L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x10060020000280F0L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0400000000000000L});

}