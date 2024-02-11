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
    		tokenNameToValue.put("Instead", "'instead'");
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
    // InternalFeatureLangParser.g:113:1: entryRuleFeatureRequest : ruleFeatureRequest EOF ;
    public final void entryRuleFeatureRequest() throws RecognitionException {
        try {
            // InternalFeatureLangParser.g:114:1: ( ruleFeatureRequest EOF )
            // InternalFeatureLangParser.g:115:1: ruleFeatureRequest EOF
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
    // InternalFeatureLangParser.g:122:1: ruleFeatureRequest : ( ( rule__FeatureRequest__StatementsAssignment )* ) ;
    public final void ruleFeatureRequest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:126:2: ( ( ( rule__FeatureRequest__StatementsAssignment )* ) )
            // InternalFeatureLangParser.g:127:2: ( ( rule__FeatureRequest__StatementsAssignment )* )
            {
            // InternalFeatureLangParser.g:127:2: ( ( rule__FeatureRequest__StatementsAssignment )* )
            // InternalFeatureLangParser.g:128:3: ( rule__FeatureRequest__StatementsAssignment )*
            {
             before(grammarAccess.getFeatureRequestAccess().getStatementsAssignment()); 
            // InternalFeatureLangParser.g:129:3: ( rule__FeatureRequest__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Abstract||(LA1_0>=Change && LA1_0<=Delete)||LA1_0==Remove||LA1_0==Class||LA1_0==New||(LA1_0>=Set && LA1_0<=The)||LA1_0==A||LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFeatureLangParser.g:129:4: rule__FeatureRequest__StatementsAssignment
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
    // InternalFeatureLangParser.g:138:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalFeatureLangParser.g:139:1: ( ruleStatement EOF )
            // InternalFeatureLangParser.g:140:1: ruleStatement EOF
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
    // InternalFeatureLangParser.g:147:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:151:2: ( ( ( rule__Statement__Group__0 ) ) )
            // InternalFeatureLangParser.g:152:2: ( ( rule__Statement__Group__0 ) )
            {
            // InternalFeatureLangParser.g:152:2: ( ( rule__Statement__Group__0 ) )
            // InternalFeatureLangParser.g:153:3: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // InternalFeatureLangParser.g:154:3: ( rule__Statement__Group__0 )
            // InternalFeatureLangParser.g:154:4: rule__Statement__Group__0
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
    // InternalFeatureLangParser.g:163:1: entryRuleChangeStatement : ruleChangeStatement EOF ;
    public final void entryRuleChangeStatement() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:167:1: ( ruleChangeStatement EOF )
            // InternalFeatureLangParser.g:168:1: ruleChangeStatement EOF
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
    // InternalFeatureLangParser.g:178:1: ruleChangeStatement : ( ( rule__ChangeStatement__Group__0 ) ) ;
    public final void ruleChangeStatement() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:183:2: ( ( ( rule__ChangeStatement__Group__0 ) ) )
            // InternalFeatureLangParser.g:184:2: ( ( rule__ChangeStatement__Group__0 ) )
            {
            // InternalFeatureLangParser.g:184:2: ( ( rule__ChangeStatement__Group__0 ) )
            // InternalFeatureLangParser.g:185:3: ( rule__ChangeStatement__Group__0 )
            {
             before(grammarAccess.getChangeStatementAccess().getGroup()); 
            // InternalFeatureLangParser.g:186:3: ( rule__ChangeStatement__Group__0 )
            // InternalFeatureLangParser.g:186:4: rule__ChangeStatement__Group__0
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
    // InternalFeatureLangParser.g:196:1: entryRuleCreationStatement : ruleCreationStatement EOF ;
    public final void entryRuleCreationStatement() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:200:1: ( ruleCreationStatement EOF )
            // InternalFeatureLangParser.g:201:1: ruleCreationStatement EOF
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
    // InternalFeatureLangParser.g:211:1: ruleCreationStatement : ( ( rule__CreationStatement__Alternatives ) ) ;
    public final void ruleCreationStatement() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:216:2: ( ( ( rule__CreationStatement__Alternatives ) ) )
            // InternalFeatureLangParser.g:217:2: ( ( rule__CreationStatement__Alternatives ) )
            {
            // InternalFeatureLangParser.g:217:2: ( ( rule__CreationStatement__Alternatives ) )
            // InternalFeatureLangParser.g:218:3: ( rule__CreationStatement__Alternatives )
            {
             before(grammarAccess.getCreationStatementAccess().getAlternatives()); 
            // InternalFeatureLangParser.g:219:3: ( rule__CreationStatement__Alternatives )
            // InternalFeatureLangParser.g:219:4: rule__CreationStatement__Alternatives
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
    // InternalFeatureLangParser.g:229:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:233:1: ( ruleAction EOF )
            // InternalFeatureLangParser.g:234:1: ruleAction EOF
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
    // InternalFeatureLangParser.g:244:1: ruleAction : ( ( rule__Action__TypeAssignment ) ) ;
    public final void ruleAction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:249:2: ( ( ( rule__Action__TypeAssignment ) ) )
            // InternalFeatureLangParser.g:250:2: ( ( rule__Action__TypeAssignment ) )
            {
            // InternalFeatureLangParser.g:250:2: ( ( rule__Action__TypeAssignment ) )
            // InternalFeatureLangParser.g:251:3: ( rule__Action__TypeAssignment )
            {
             before(grammarAccess.getActionAccess().getTypeAssignment()); 
            // InternalFeatureLangParser.g:252:3: ( rule__Action__TypeAssignment )
            // InternalFeatureLangParser.g:252:4: rule__Action__TypeAssignment
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
    // InternalFeatureLangParser.g:262:1: entryRuleUpdateAction : ruleUpdateAction EOF ;
    public final void entryRuleUpdateAction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:266:1: ( ruleUpdateAction EOF )
            // InternalFeatureLangParser.g:267:1: ruleUpdateAction EOF
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
    // InternalFeatureLangParser.g:277:1: ruleUpdateAction : ( ( rule__UpdateAction__Group__0 ) ) ;
    public final void ruleUpdateAction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:282:2: ( ( ( rule__UpdateAction__Group__0 ) ) )
            // InternalFeatureLangParser.g:283:2: ( ( rule__UpdateAction__Group__0 ) )
            {
            // InternalFeatureLangParser.g:283:2: ( ( rule__UpdateAction__Group__0 ) )
            // InternalFeatureLangParser.g:284:3: ( rule__UpdateAction__Group__0 )
            {
             before(grammarAccess.getUpdateActionAccess().getGroup()); 
            // InternalFeatureLangParser.g:285:3: ( rule__UpdateAction__Group__0 )
            // InternalFeatureLangParser.g:285:4: rule__UpdateAction__Group__0
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
    // InternalFeatureLangParser.g:295:1: entryRuleUpdateAttributeDatatype : ruleUpdateAttributeDatatype EOF ;
    public final void entryRuleUpdateAttributeDatatype() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:299:1: ( ruleUpdateAttributeDatatype EOF )
            // InternalFeatureLangParser.g:300:1: ruleUpdateAttributeDatatype EOF
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
    // InternalFeatureLangParser.g:310:1: ruleUpdateAttributeDatatype : ( ( rule__UpdateAttributeDatatype__Group__0 ) ) ;
    public final void ruleUpdateAttributeDatatype() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:315:2: ( ( ( rule__UpdateAttributeDatatype__Group__0 ) ) )
            // InternalFeatureLangParser.g:316:2: ( ( rule__UpdateAttributeDatatype__Group__0 ) )
            {
            // InternalFeatureLangParser.g:316:2: ( ( rule__UpdateAttributeDatatype__Group__0 ) )
            // InternalFeatureLangParser.g:317:3: ( rule__UpdateAttributeDatatype__Group__0 )
            {
             before(grammarAccess.getUpdateAttributeDatatypeAccess().getGroup()); 
            // InternalFeatureLangParser.g:318:3: ( rule__UpdateAttributeDatatype__Group__0 )
            // InternalFeatureLangParser.g:318:4: rule__UpdateAttributeDatatype__Group__0
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
    // InternalFeatureLangParser.g:328:1: entryRuleUpdateAttributeIdentifier : ruleUpdateAttributeIdentifier EOF ;
    public final void entryRuleUpdateAttributeIdentifier() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:332:1: ( ruleUpdateAttributeIdentifier EOF )
            // InternalFeatureLangParser.g:333:1: ruleUpdateAttributeIdentifier EOF
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
    // InternalFeatureLangParser.g:343:1: ruleUpdateAttributeIdentifier : ( ( rule__UpdateAttributeIdentifier__Group__0 ) ) ;
    public final void ruleUpdateAttributeIdentifier() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:348:2: ( ( ( rule__UpdateAttributeIdentifier__Group__0 ) ) )
            // InternalFeatureLangParser.g:349:2: ( ( rule__UpdateAttributeIdentifier__Group__0 ) )
            {
            // InternalFeatureLangParser.g:349:2: ( ( rule__UpdateAttributeIdentifier__Group__0 ) )
            // InternalFeatureLangParser.g:350:3: ( rule__UpdateAttributeIdentifier__Group__0 )
            {
             before(grammarAccess.getUpdateAttributeIdentifierAccess().getGroup()); 
            // InternalFeatureLangParser.g:351:3: ( rule__UpdateAttributeIdentifier__Group__0 )
            // InternalFeatureLangParser.g:351:4: rule__UpdateAttributeIdentifier__Group__0
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
    // InternalFeatureLangParser.g:361:1: entryRuleUpdateAttributeValue : ruleUpdateAttributeValue EOF ;
    public final void entryRuleUpdateAttributeValue() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:365:1: ( ruleUpdateAttributeValue EOF )
            // InternalFeatureLangParser.g:366:1: ruleUpdateAttributeValue EOF
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
    // InternalFeatureLangParser.g:376:1: ruleUpdateAttributeValue : ( ( rule__UpdateAttributeValue__Group__0 ) ) ;
    public final void ruleUpdateAttributeValue() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:381:2: ( ( ( rule__UpdateAttributeValue__Group__0 ) ) )
            // InternalFeatureLangParser.g:382:2: ( ( rule__UpdateAttributeValue__Group__0 ) )
            {
            // InternalFeatureLangParser.g:382:2: ( ( rule__UpdateAttributeValue__Group__0 ) )
            // InternalFeatureLangParser.g:383:3: ( rule__UpdateAttributeValue__Group__0 )
            {
             before(grammarAccess.getUpdateAttributeValueAccess().getGroup()); 
            // InternalFeatureLangParser.g:384:3: ( rule__UpdateAttributeValue__Group__0 )
            // InternalFeatureLangParser.g:384:4: rule__UpdateAttributeValue__Group__0
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
    // InternalFeatureLangParser.g:394:1: entryRuleAttributeAction : ruleAttributeAction EOF ;
    public final void entryRuleAttributeAction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:398:1: ( ruleAttributeAction EOF )
            // InternalFeatureLangParser.g:399:1: ruleAttributeAction EOF
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
    // InternalFeatureLangParser.g:409:1: ruleAttributeAction : ( ( rule__AttributeAction__Group__0 ) ) ;
    public final void ruleAttributeAction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:414:2: ( ( ( rule__AttributeAction__Group__0 ) ) )
            // InternalFeatureLangParser.g:415:2: ( ( rule__AttributeAction__Group__0 ) )
            {
            // InternalFeatureLangParser.g:415:2: ( ( rule__AttributeAction__Group__0 ) )
            // InternalFeatureLangParser.g:416:3: ( rule__AttributeAction__Group__0 )
            {
             before(grammarAccess.getAttributeActionAccess().getGroup()); 
            // InternalFeatureLangParser.g:417:3: ( rule__AttributeAction__Group__0 )
            // InternalFeatureLangParser.g:417:4: rule__AttributeAction__Group__0
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
    // InternalFeatureLangParser.g:427:1: entryRuleAssociationAction : ruleAssociationAction EOF ;
    public final void entryRuleAssociationAction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:431:1: ( ruleAssociationAction EOF )
            // InternalFeatureLangParser.g:432:1: ruleAssociationAction EOF
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
    // InternalFeatureLangParser.g:442:1: ruleAssociationAction : ( ( rule__AssociationAction__Group__0 ) ) ;
    public final void ruleAssociationAction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:447:2: ( ( ( rule__AssociationAction__Group__0 ) ) )
            // InternalFeatureLangParser.g:448:2: ( ( rule__AssociationAction__Group__0 ) )
            {
            // InternalFeatureLangParser.g:448:2: ( ( rule__AssociationAction__Group__0 ) )
            // InternalFeatureLangParser.g:449:3: ( rule__AssociationAction__Group__0 )
            {
             before(grammarAccess.getAssociationActionAccess().getGroup()); 
            // InternalFeatureLangParser.g:450:3: ( rule__AssociationAction__Group__0 )
            // InternalFeatureLangParser.g:450:4: rule__AssociationAction__Group__0
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
    // InternalFeatureLangParser.g:460:1: entryRuleCreateAssociation : ruleCreateAssociation EOF ;
    public final void entryRuleCreateAssociation() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:464:1: ( ruleCreateAssociation EOF )
            // InternalFeatureLangParser.g:465:1: ruleCreateAssociation EOF
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
    // InternalFeatureLangParser.g:475:1: ruleCreateAssociation : ( ( rule__CreateAssociation__Group__0 ) ) ;
    public final void ruleCreateAssociation() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:480:2: ( ( ( rule__CreateAssociation__Group__0 ) ) )
            // InternalFeatureLangParser.g:481:2: ( ( rule__CreateAssociation__Group__0 ) )
            {
            // InternalFeatureLangParser.g:481:2: ( ( rule__CreateAssociation__Group__0 ) )
            // InternalFeatureLangParser.g:482:3: ( rule__CreateAssociation__Group__0 )
            {
             before(grammarAccess.getCreateAssociationAccess().getGroup()); 
            // InternalFeatureLangParser.g:483:3: ( rule__CreateAssociation__Group__0 )
            // InternalFeatureLangParser.g:483:4: rule__CreateAssociation__Group__0
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
    // InternalFeatureLangParser.g:493:1: entryRuleEditAssociation : ruleEditAssociation EOF ;
    public final void entryRuleEditAssociation() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:497:1: ( ruleEditAssociation EOF )
            // InternalFeatureLangParser.g:498:1: ruleEditAssociation EOF
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
    // InternalFeatureLangParser.g:508:1: ruleEditAssociation : ( ( rule__EditAssociation__TypeAssignment ) ) ;
    public final void ruleEditAssociation() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:513:2: ( ( ( rule__EditAssociation__TypeAssignment ) ) )
            // InternalFeatureLangParser.g:514:2: ( ( rule__EditAssociation__TypeAssignment ) )
            {
            // InternalFeatureLangParser.g:514:2: ( ( rule__EditAssociation__TypeAssignment ) )
            // InternalFeatureLangParser.g:515:3: ( rule__EditAssociation__TypeAssignment )
            {
             before(grammarAccess.getEditAssociationAccess().getTypeAssignment()); 
            // InternalFeatureLangParser.g:516:3: ( rule__EditAssociation__TypeAssignment )
            // InternalFeatureLangParser.g:516:4: rule__EditAssociation__TypeAssignment
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
    // InternalFeatureLangParser.g:526:1: entryRuleSetCompatible : ruleSetCompatible EOF ;
    public final void entryRuleSetCompatible() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:530:1: ( ruleSetCompatible EOF )
            // InternalFeatureLangParser.g:531:1: ruleSetCompatible EOF
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
    // InternalFeatureLangParser.g:541:1: ruleSetCompatible : ( ( rule__SetCompatible__Group__0 ) ) ;
    public final void ruleSetCompatible() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:546:2: ( ( ( rule__SetCompatible__Group__0 ) ) )
            // InternalFeatureLangParser.g:547:2: ( ( rule__SetCompatible__Group__0 ) )
            {
            // InternalFeatureLangParser.g:547:2: ( ( rule__SetCompatible__Group__0 ) )
            // InternalFeatureLangParser.g:548:3: ( rule__SetCompatible__Group__0 )
            {
             before(grammarAccess.getSetCompatibleAccess().getGroup()); 
            // InternalFeatureLangParser.g:549:3: ( rule__SetCompatible__Group__0 )
            // InternalFeatureLangParser.g:549:4: rule__SetCompatible__Group__0
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
    // InternalFeatureLangParser.g:559:1: entryRuleSetVersionRange : ruleSetVersionRange EOF ;
    public final void entryRuleSetVersionRange() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:563:1: ( ruleSetVersionRange EOF )
            // InternalFeatureLangParser.g:564:1: ruleSetVersionRange EOF
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
    // InternalFeatureLangParser.g:574:1: ruleSetVersionRange : ( ( rule__SetVersionRange__Group__0 ) ) ;
    public final void ruleSetVersionRange() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:579:2: ( ( ( rule__SetVersionRange__Group__0 ) ) )
            // InternalFeatureLangParser.g:580:2: ( ( rule__SetVersionRange__Group__0 ) )
            {
            // InternalFeatureLangParser.g:580:2: ( ( rule__SetVersionRange__Group__0 ) )
            // InternalFeatureLangParser.g:581:3: ( rule__SetVersionRange__Group__0 )
            {
             before(grammarAccess.getSetVersionRangeAccess().getGroup()); 
            // InternalFeatureLangParser.g:582:3: ( rule__SetVersionRange__Group__0 )
            // InternalFeatureLangParser.g:582:4: rule__SetVersionRange__Group__0
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
    // InternalFeatureLangParser.g:592:1: entryRuleSetVariant : ruleSetVariant EOF ;
    public final void entryRuleSetVariant() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:596:1: ( ruleSetVariant EOF )
            // InternalFeatureLangParser.g:597:1: ruleSetVariant EOF
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
    // InternalFeatureLangParser.g:607:1: ruleSetVariant : ( ( rule__SetVariant__Group__0 ) ) ;
    public final void ruleSetVariant() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:612:2: ( ( ( rule__SetVariant__Group__0 ) ) )
            // InternalFeatureLangParser.g:613:2: ( ( rule__SetVariant__Group__0 ) )
            {
            // InternalFeatureLangParser.g:613:2: ( ( rule__SetVariant__Group__0 ) )
            // InternalFeatureLangParser.g:614:3: ( rule__SetVariant__Group__0 )
            {
             before(grammarAccess.getSetVariantAccess().getGroup()); 
            // InternalFeatureLangParser.g:615:3: ( rule__SetVariant__Group__0 )
            // InternalFeatureLangParser.g:615:4: rule__SetVariant__Group__0
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
    // InternalFeatureLangParser.g:625:1: entryRuleSetRightOpen : ruleSetRightOpen EOF ;
    public final void entryRuleSetRightOpen() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:629:1: ( ruleSetRightOpen EOF )
            // InternalFeatureLangParser.g:630:1: ruleSetRightOpen EOF
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
    // InternalFeatureLangParser.g:640:1: ruleSetRightOpen : ( ( rule__SetRightOpen__Group__0 ) ) ;
    public final void ruleSetRightOpen() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:645:2: ( ( ( rule__SetRightOpen__Group__0 ) ) )
            // InternalFeatureLangParser.g:646:2: ( ( rule__SetRightOpen__Group__0 ) )
            {
            // InternalFeatureLangParser.g:646:2: ( ( rule__SetRightOpen__Group__0 ) )
            // InternalFeatureLangParser.g:647:3: ( rule__SetRightOpen__Group__0 )
            {
             before(grammarAccess.getSetRightOpenAccess().getGroup()); 
            // InternalFeatureLangParser.g:648:3: ( rule__SetRightOpen__Group__0 )
            // InternalFeatureLangParser.g:648:4: rule__SetRightOpen__Group__0
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
    // InternalFeatureLangParser.g:658:1: entryRuleSetLeftOpen : ruleSetLeftOpen EOF ;
    public final void entryRuleSetLeftOpen() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:662:1: ( ruleSetLeftOpen EOF )
            // InternalFeatureLangParser.g:663:1: ruleSetLeftOpen EOF
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
    // InternalFeatureLangParser.g:673:1: ruleSetLeftOpen : ( ( rule__SetLeftOpen__Group__0 ) ) ;
    public final void ruleSetLeftOpen() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:678:2: ( ( ( rule__SetLeftOpen__Group__0 ) ) )
            // InternalFeatureLangParser.g:679:2: ( ( rule__SetLeftOpen__Group__0 ) )
            {
            // InternalFeatureLangParser.g:679:2: ( ( rule__SetLeftOpen__Group__0 ) )
            // InternalFeatureLangParser.g:680:3: ( rule__SetLeftOpen__Group__0 )
            {
             before(grammarAccess.getSetLeftOpenAccess().getGroup()); 
            // InternalFeatureLangParser.g:681:3: ( rule__SetLeftOpen__Group__0 )
            // InternalFeatureLangParser.g:681:4: rule__SetLeftOpen__Group__0
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
    // InternalFeatureLangParser.g:691:1: entryRuleInheritanceAction : ruleInheritanceAction EOF ;
    public final void entryRuleInheritanceAction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:695:1: ( ruleInheritanceAction EOF )
            // InternalFeatureLangParser.g:696:1: ruleInheritanceAction EOF
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
    // InternalFeatureLangParser.g:706:1: ruleInheritanceAction : ( ( rule__InheritanceAction__Group__0 ) ) ;
    public final void ruleInheritanceAction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:711:2: ( ( ( rule__InheritanceAction__Group__0 ) ) )
            // InternalFeatureLangParser.g:712:2: ( ( rule__InheritanceAction__Group__0 ) )
            {
            // InternalFeatureLangParser.g:712:2: ( ( rule__InheritanceAction__Group__0 ) )
            // InternalFeatureLangParser.g:713:3: ( rule__InheritanceAction__Group__0 )
            {
             before(grammarAccess.getInheritanceActionAccess().getGroup()); 
            // InternalFeatureLangParser.g:714:3: ( rule__InheritanceAction__Group__0 )
            // InternalFeatureLangParser.g:714:4: rule__InheritanceAction__Group__0
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
    // InternalFeatureLangParser.g:724:1: entryRuleCompositionAction : ruleCompositionAction EOF ;
    public final void entryRuleCompositionAction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:728:1: ( ruleCompositionAction EOF )
            // InternalFeatureLangParser.g:729:1: ruleCompositionAction EOF
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
    // InternalFeatureLangParser.g:739:1: ruleCompositionAction : ( ( rule__CompositionAction__Alternatives ) ) ;
    public final void ruleCompositionAction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:744:2: ( ( ( rule__CompositionAction__Alternatives ) ) )
            // InternalFeatureLangParser.g:745:2: ( ( rule__CompositionAction__Alternatives ) )
            {
            // InternalFeatureLangParser.g:745:2: ( ( rule__CompositionAction__Alternatives ) )
            // InternalFeatureLangParser.g:746:3: ( rule__CompositionAction__Alternatives )
            {
             before(grammarAccess.getCompositionActionAccess().getAlternatives()); 
            // InternalFeatureLangParser.g:747:3: ( rule__CompositionAction__Alternatives )
            // InternalFeatureLangParser.g:747:4: rule__CompositionAction__Alternatives
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
    // InternalFeatureLangParser.g:757:1: entryRuleCreateComposition : ruleCreateComposition EOF ;
    public final void entryRuleCreateComposition() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:761:1: ( ruleCreateComposition EOF )
            // InternalFeatureLangParser.g:762:1: ruleCreateComposition EOF
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
    // InternalFeatureLangParser.g:772:1: ruleCreateComposition : ( ( rule__CreateComposition__Group__0 ) ) ;
    public final void ruleCreateComposition() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:777:2: ( ( ( rule__CreateComposition__Group__0 ) ) )
            // InternalFeatureLangParser.g:778:2: ( ( rule__CreateComposition__Group__0 ) )
            {
            // InternalFeatureLangParser.g:778:2: ( ( rule__CreateComposition__Group__0 ) )
            // InternalFeatureLangParser.g:779:3: ( rule__CreateComposition__Group__0 )
            {
             before(grammarAccess.getCreateCompositionAccess().getGroup()); 
            // InternalFeatureLangParser.g:780:3: ( rule__CreateComposition__Group__0 )
            // InternalFeatureLangParser.g:780:4: rule__CreateComposition__Group__0
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
    // InternalFeatureLangParser.g:790:1: entryRuleEditComposition : ruleEditComposition EOF ;
    public final void entryRuleEditComposition() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:794:1: ( ruleEditComposition EOF )
            // InternalFeatureLangParser.g:795:1: ruleEditComposition EOF
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
    // InternalFeatureLangParser.g:805:1: ruleEditComposition : ( ( rule__EditComposition__Group__0 ) ) ;
    public final void ruleEditComposition() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:810:2: ( ( ( rule__EditComposition__Group__0 ) ) )
            // InternalFeatureLangParser.g:811:2: ( ( rule__EditComposition__Group__0 ) )
            {
            // InternalFeatureLangParser.g:811:2: ( ( rule__EditComposition__Group__0 ) )
            // InternalFeatureLangParser.g:812:3: ( rule__EditComposition__Group__0 )
            {
             before(grammarAccess.getEditCompositionAccess().getGroup()); 
            // InternalFeatureLangParser.g:813:3: ( rule__EditComposition__Group__0 )
            // InternalFeatureLangParser.g:813:4: rule__EditComposition__Group__0
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
    // InternalFeatureLangParser.g:823:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:827:1: ( ruleClass EOF )
            // InternalFeatureLangParser.g:828:1: ruleClass EOF
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
    // InternalFeatureLangParser.g:838:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:843:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalFeatureLangParser.g:844:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalFeatureLangParser.g:844:2: ( ( rule__Class__Group__0 ) )
            // InternalFeatureLangParser.g:845:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalFeatureLangParser.g:846:3: ( rule__Class__Group__0 )
            // InternalFeatureLangParser.g:846:4: rule__Class__Group__0
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
    // InternalFeatureLangParser.g:856:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:860:1: ( ruleAttribute EOF )
            // InternalFeatureLangParser.g:861:1: ruleAttribute EOF
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
    // InternalFeatureLangParser.g:871:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:876:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalFeatureLangParser.g:877:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalFeatureLangParser.g:877:2: ( ( rule__Attribute__Group__0 ) )
            // InternalFeatureLangParser.g:878:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalFeatureLangParser.g:879:3: ( rule__Attribute__Group__0 )
            // InternalFeatureLangParser.g:879:4: rule__Attribute__Group__0
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
    // InternalFeatureLangParser.g:889:1: entryRuleIdentifier : ruleIdentifier EOF ;
    public final void entryRuleIdentifier() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:893:1: ( ruleIdentifier EOF )
            // InternalFeatureLangParser.g:894:1: ruleIdentifier EOF
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
    // InternalFeatureLangParser.g:904:1: ruleIdentifier : ( ( rule__Identifier__Group__0 ) ) ;
    public final void ruleIdentifier() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:909:2: ( ( ( rule__Identifier__Group__0 ) ) )
            // InternalFeatureLangParser.g:910:2: ( ( rule__Identifier__Group__0 ) )
            {
            // InternalFeatureLangParser.g:910:2: ( ( rule__Identifier__Group__0 ) )
            // InternalFeatureLangParser.g:911:3: ( rule__Identifier__Group__0 )
            {
             before(grammarAccess.getIdentifierAccess().getGroup()); 
            // InternalFeatureLangParser.g:912:3: ( rule__Identifier__Group__0 )
            // InternalFeatureLangParser.g:912:4: rule__Identifier__Group__0
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
    // InternalFeatureLangParser.g:922:1: entryRulePriority : rulePriority EOF ;
    public final void entryRulePriority() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:926:1: ( rulePriority EOF )
            // InternalFeatureLangParser.g:927:1: rulePriority EOF
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
    // InternalFeatureLangParser.g:937:1: rulePriority : ( ( rule__Priority__PriorityAssignment ) ) ;
    public final void rulePriority() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:942:2: ( ( ( rule__Priority__PriorityAssignment ) ) )
            // InternalFeatureLangParser.g:943:2: ( ( rule__Priority__PriorityAssignment ) )
            {
            // InternalFeatureLangParser.g:943:2: ( ( rule__Priority__PriorityAssignment ) )
            // InternalFeatureLangParser.g:944:3: ( rule__Priority__PriorityAssignment )
            {
             before(grammarAccess.getPriorityAccess().getPriorityAssignment()); 
            // InternalFeatureLangParser.g:945:3: ( rule__Priority__PriorityAssignment )
            // InternalFeatureLangParser.g:945:4: rule__Priority__PriorityAssignment
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
    // InternalFeatureLangParser.g:955:1: entryRuleAttributeValue : ruleAttributeValue EOF ;
    public final void entryRuleAttributeValue() throws RecognitionException {
        try {
            // InternalFeatureLangParser.g:956:1: ( ruleAttributeValue EOF )
            // InternalFeatureLangParser.g:957:1: ruleAttributeValue EOF
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
    // InternalFeatureLangParser.g:964:1: ruleAttributeValue : ( ( rule__AttributeValue__Alternatives ) ) ;
    public final void ruleAttributeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:968:2: ( ( ( rule__AttributeValue__Alternatives ) ) )
            // InternalFeatureLangParser.g:969:2: ( ( rule__AttributeValue__Alternatives ) )
            {
            // InternalFeatureLangParser.g:969:2: ( ( rule__AttributeValue__Alternatives ) )
            // InternalFeatureLangParser.g:970:3: ( rule__AttributeValue__Alternatives )
            {
             before(grammarAccess.getAttributeValueAccess().getAlternatives()); 
            // InternalFeatureLangParser.g:971:3: ( rule__AttributeValue__Alternatives )
            // InternalFeatureLangParser.g:971:4: rule__AttributeValue__Alternatives
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
    // InternalFeatureLangParser.g:980:1: rulePublicity : ( ( rule__Publicity__Alternatives ) ) ;
    public final void rulePublicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:984:1: ( ( ( rule__Publicity__Alternatives ) ) )
            // InternalFeatureLangParser.g:985:2: ( ( rule__Publicity__Alternatives ) )
            {
            // InternalFeatureLangParser.g:985:2: ( ( rule__Publicity__Alternatives ) )
            // InternalFeatureLangParser.g:986:3: ( rule__Publicity__Alternatives )
            {
             before(grammarAccess.getPublicityAccess().getAlternatives()); 
            // InternalFeatureLangParser.g:987:3: ( rule__Publicity__Alternatives )
            // InternalFeatureLangParser.g:987:4: rule__Publicity__Alternatives
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
    // InternalFeatureLangParser.g:996:1: rulePriorityValue : ( ( rule__PriorityValue__Alternatives ) ) ;
    public final void rulePriorityValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1000:1: ( ( ( rule__PriorityValue__Alternatives ) ) )
            // InternalFeatureLangParser.g:1001:2: ( ( rule__PriorityValue__Alternatives ) )
            {
            // InternalFeatureLangParser.g:1001:2: ( ( rule__PriorityValue__Alternatives ) )
            // InternalFeatureLangParser.g:1002:3: ( rule__PriorityValue__Alternatives )
            {
             before(grammarAccess.getPriorityValueAccess().getAlternatives()); 
            // InternalFeatureLangParser.g:1003:3: ( rule__PriorityValue__Alternatives )
            // InternalFeatureLangParser.g:1003:4: rule__PriorityValue__Alternatives
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
    // InternalFeatureLangParser.g:1012:1: ruleAbstraction : ( ( rule__Abstraction__Alternatives ) ) ;
    public final void ruleAbstraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1016:1: ( ( ( rule__Abstraction__Alternatives ) ) )
            // InternalFeatureLangParser.g:1017:2: ( ( rule__Abstraction__Alternatives ) )
            {
            // InternalFeatureLangParser.g:1017:2: ( ( rule__Abstraction__Alternatives ) )
            // InternalFeatureLangParser.g:1018:3: ( rule__Abstraction__Alternatives )
            {
             before(grammarAccess.getAbstractionAccess().getAlternatives()); 
            // InternalFeatureLangParser.g:1019:3: ( rule__Abstraction__Alternatives )
            // InternalFeatureLangParser.g:1019:4: rule__Abstraction__Alternatives
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
    // InternalFeatureLangParser.g:1028:1: ruleIdentifierValue : ( ( rule__IdentifierValue__Alternatives ) ) ;
    public final void ruleIdentifierValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1032:1: ( ( ( rule__IdentifierValue__Alternatives ) ) )
            // InternalFeatureLangParser.g:1033:2: ( ( rule__IdentifierValue__Alternatives ) )
            {
            // InternalFeatureLangParser.g:1033:2: ( ( rule__IdentifierValue__Alternatives ) )
            // InternalFeatureLangParser.g:1034:3: ( rule__IdentifierValue__Alternatives )
            {
             before(grammarAccess.getIdentifierValueAccess().getAlternatives()); 
            // InternalFeatureLangParser.g:1035:3: ( rule__IdentifierValue__Alternatives )
            // InternalFeatureLangParser.g:1035:4: rule__IdentifierValue__Alternatives
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
    // InternalFeatureLangParser.g:1044:1: ruleDatatype : ( ( rule__Datatype__Alternatives ) ) ;
    public final void ruleDatatype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1048:1: ( ( ( rule__Datatype__Alternatives ) ) )
            // InternalFeatureLangParser.g:1049:2: ( ( rule__Datatype__Alternatives ) )
            {
            // InternalFeatureLangParser.g:1049:2: ( ( rule__Datatype__Alternatives ) )
            // InternalFeatureLangParser.g:1050:3: ( rule__Datatype__Alternatives )
            {
             before(grammarAccess.getDatatypeAccess().getAlternatives()); 
            // InternalFeatureLangParser.g:1051:3: ( rule__Datatype__Alternatives )
            // InternalFeatureLangParser.g:1051:4: rule__Datatype__Alternatives
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
    // InternalFeatureLangParser.g:1059:1: rule__Statement__Alternatives_0 : ( ( ruleChangeStatement ) | ( ruleCreationStatement ) );
    public final void rule__Statement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1063:1: ( ( ruleChangeStatement ) | ( ruleCreationStatement ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalFeatureLangParser.g:1064:2: ( ruleChangeStatement )
                    {
                    // InternalFeatureLangParser.g:1064:2: ( ruleChangeStatement )
                    // InternalFeatureLangParser.g:1065:3: ruleChangeStatement
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
                    // InternalFeatureLangParser.g:1070:2: ( ruleCreationStatement )
                    {
                    // InternalFeatureLangParser.g:1070:2: ( ruleCreationStatement )
                    // InternalFeatureLangParser.g:1071:3: ruleCreationStatement
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
    // InternalFeatureLangParser.g:1080:1: rule__ChangeStatement__Alternatives_0 : ( ( ( rule__ChangeStatement__Group_0_0__0 ) ) | ( ( rule__ChangeStatement__Group_0_1__0 ) ) );
    public final void rule__ChangeStatement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1084:1: ( ( ( rule__ChangeStatement__Group_0_0__0 ) ) | ( ( rule__ChangeStatement__Group_0_1__0 ) ) )
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
                    // InternalFeatureLangParser.g:1085:2: ( ( rule__ChangeStatement__Group_0_0__0 ) )
                    {
                    // InternalFeatureLangParser.g:1085:2: ( ( rule__ChangeStatement__Group_0_0__0 ) )
                    // InternalFeatureLangParser.g:1086:3: ( rule__ChangeStatement__Group_0_0__0 )
                    {
                     before(grammarAccess.getChangeStatementAccess().getGroup_0_0()); 
                    // InternalFeatureLangParser.g:1087:3: ( rule__ChangeStatement__Group_0_0__0 )
                    // InternalFeatureLangParser.g:1087:4: rule__ChangeStatement__Group_0_0__0
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
                    // InternalFeatureLangParser.g:1091:2: ( ( rule__ChangeStatement__Group_0_1__0 ) )
                    {
                    // InternalFeatureLangParser.g:1091:2: ( ( rule__ChangeStatement__Group_0_1__0 ) )
                    // InternalFeatureLangParser.g:1092:3: ( rule__ChangeStatement__Group_0_1__0 )
                    {
                     before(grammarAccess.getChangeStatementAccess().getGroup_0_1()); 
                    // InternalFeatureLangParser.g:1093:3: ( rule__ChangeStatement__Group_0_1__0 )
                    // InternalFeatureLangParser.g:1093:4: rule__ChangeStatement__Group_0_1__0
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
    // InternalFeatureLangParser.g:1101:1: rule__ChangeStatement__Alternatives_0_1_0 : ( ( Set ) | ( Change ) | ( ( rule__ChangeStatement__NegationAssignment_0_1_0_2 ) ) );
    public final void rule__ChangeStatement__Alternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1105:1: ( ( Set ) | ( Change ) | ( ( rule__ChangeStatement__NegationAssignment_0_1_0_2 ) ) )
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
                    // InternalFeatureLangParser.g:1106:2: ( Set )
                    {
                    // InternalFeatureLangParser.g:1106:2: ( Set )
                    // InternalFeatureLangParser.g:1107:3: Set
                    {
                     before(grammarAccess.getChangeStatementAccess().getSetKeyword_0_1_0_0()); 
                    match(input,Set,FOLLOW_2); 
                     after(grammarAccess.getChangeStatementAccess().getSetKeyword_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1112:2: ( Change )
                    {
                    // InternalFeatureLangParser.g:1112:2: ( Change )
                    // InternalFeatureLangParser.g:1113:3: Change
                    {
                     before(grammarAccess.getChangeStatementAccess().getChangeKeyword_0_1_0_1()); 
                    match(input,Change,FOLLOW_2); 
                     after(grammarAccess.getChangeStatementAccess().getChangeKeyword_0_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureLangParser.g:1118:2: ( ( rule__ChangeStatement__NegationAssignment_0_1_0_2 ) )
                    {
                    // InternalFeatureLangParser.g:1118:2: ( ( rule__ChangeStatement__NegationAssignment_0_1_0_2 ) )
                    // InternalFeatureLangParser.g:1119:3: ( rule__ChangeStatement__NegationAssignment_0_1_0_2 )
                    {
                     before(grammarAccess.getChangeStatementAccess().getNegationAssignment_0_1_0_2()); 
                    // InternalFeatureLangParser.g:1120:3: ( rule__ChangeStatement__NegationAssignment_0_1_0_2 )
                    // InternalFeatureLangParser.g:1120:4: rule__ChangeStatement__NegationAssignment_0_1_0_2
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
    // InternalFeatureLangParser.g:1128:1: rule__ChangeStatement__Alternatives_1 : ( ( ( rule__ChangeStatement__ActionAssignment_1_0 ) ) | ( ( rule__ChangeStatement__UpdateAssignment_1_1 ) ) );
    public final void rule__ChangeStatement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1132:1: ( ( ( rule__ChangeStatement__ActionAssignment_1_0 ) ) | ( ( rule__ChangeStatement__UpdateAssignment_1_1 ) ) )
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

                if ( (LA5_3==Attribute||LA5_3==RULE_ID) ) {
                    alt5=1;
                }
                else if ( (LA5_3==Existing||LA5_3==Created) ) {
                    alt5=2;
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

                if ( (LA5_4==Attribute||LA5_4==RULE_ID) ) {
                    alt5=1;
                }
                else if ( (LA5_4==Existing||LA5_4==Created) ) {
                    alt5=2;
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
                    // InternalFeatureLangParser.g:1133:2: ( ( rule__ChangeStatement__ActionAssignment_1_0 ) )
                    {
                    // InternalFeatureLangParser.g:1133:2: ( ( rule__ChangeStatement__ActionAssignment_1_0 ) )
                    // InternalFeatureLangParser.g:1134:3: ( rule__ChangeStatement__ActionAssignment_1_0 )
                    {
                     before(grammarAccess.getChangeStatementAccess().getActionAssignment_1_0()); 
                    // InternalFeatureLangParser.g:1135:3: ( rule__ChangeStatement__ActionAssignment_1_0 )
                    // InternalFeatureLangParser.g:1135:4: rule__ChangeStatement__ActionAssignment_1_0
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
                    // InternalFeatureLangParser.g:1139:2: ( ( rule__ChangeStatement__UpdateAssignment_1_1 ) )
                    {
                    // InternalFeatureLangParser.g:1139:2: ( ( rule__ChangeStatement__UpdateAssignment_1_1 ) )
                    // InternalFeatureLangParser.g:1140:3: ( rule__ChangeStatement__UpdateAssignment_1_1 )
                    {
                     before(grammarAccess.getChangeStatementAccess().getUpdateAssignment_1_1()); 
                    // InternalFeatureLangParser.g:1141:3: ( rule__ChangeStatement__UpdateAssignment_1_1 )
                    // InternalFeatureLangParser.g:1141:4: rule__ChangeStatement__UpdateAssignment_1_1
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
    // InternalFeatureLangParser.g:1149:1: rule__CreationStatement__Alternatives : ( ( ( rule__CreationStatement__Group_0__0 ) ) | ( ( rule__CreationStatement__Group_1__0 ) ) );
    public final void rule__CreationStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1153:1: ( ( ( rule__CreationStatement__Group_0__0 ) ) | ( ( rule__CreationStatement__Group_1__0 ) ) )
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
                    // InternalFeatureLangParser.g:1154:2: ( ( rule__CreationStatement__Group_0__0 ) )
                    {
                    // InternalFeatureLangParser.g:1154:2: ( ( rule__CreationStatement__Group_0__0 ) )
                    // InternalFeatureLangParser.g:1155:3: ( rule__CreationStatement__Group_0__0 )
                    {
                     before(grammarAccess.getCreationStatementAccess().getGroup_0()); 
                    // InternalFeatureLangParser.g:1156:3: ( rule__CreationStatement__Group_0__0 )
                    // InternalFeatureLangParser.g:1156:4: rule__CreationStatement__Group_0__0
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
                    // InternalFeatureLangParser.g:1160:2: ( ( rule__CreationStatement__Group_1__0 ) )
                    {
                    // InternalFeatureLangParser.g:1160:2: ( ( rule__CreationStatement__Group_1__0 ) )
                    // InternalFeatureLangParser.g:1161:3: ( rule__CreationStatement__Group_1__0 )
                    {
                     before(grammarAccess.getCreationStatementAccess().getGroup_1()); 
                    // InternalFeatureLangParser.g:1162:3: ( rule__CreationStatement__Group_1__0 )
                    // InternalFeatureLangParser.g:1162:4: rule__CreationStatement__Group_1__0
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
    // InternalFeatureLangParser.g:1170:1: rule__CreationStatement__Alternatives_0_3 : ( ( Exist ) | ( Be ) );
    public final void rule__CreationStatement__Alternatives_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1174:1: ( ( Exist ) | ( Be ) )
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
                    // InternalFeatureLangParser.g:1175:2: ( Exist )
                    {
                    // InternalFeatureLangParser.g:1175:2: ( Exist )
                    // InternalFeatureLangParser.g:1176:3: Exist
                    {
                     before(grammarAccess.getCreationStatementAccess().getExistKeyword_0_3_0()); 
                    match(input,Exist,FOLLOW_2); 
                     after(grammarAccess.getCreationStatementAccess().getExistKeyword_0_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1181:2: ( Be )
                    {
                    // InternalFeatureLangParser.g:1181:2: ( Be )
                    // InternalFeatureLangParser.g:1182:3: Be
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
    // InternalFeatureLangParser.g:1191:1: rule__CreationStatement__Alternatives_1_0 : ( ( Create ) | ( ( rule__CreationStatement__NegationAssignment_1_0_1 ) ) );
    public final void rule__CreationStatement__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1195:1: ( ( Create ) | ( ( rule__CreationStatement__NegationAssignment_1_0_1 ) ) )
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
                    // InternalFeatureLangParser.g:1196:2: ( Create )
                    {
                    // InternalFeatureLangParser.g:1196:2: ( Create )
                    // InternalFeatureLangParser.g:1197:3: Create
                    {
                     before(grammarAccess.getCreationStatementAccess().getCreateKeyword_1_0_0()); 
                    match(input,Create,FOLLOW_2); 
                     after(grammarAccess.getCreationStatementAccess().getCreateKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1202:2: ( ( rule__CreationStatement__NegationAssignment_1_0_1 ) )
                    {
                    // InternalFeatureLangParser.g:1202:2: ( ( rule__CreationStatement__NegationAssignment_1_0_1 ) )
                    // InternalFeatureLangParser.g:1203:3: ( rule__CreationStatement__NegationAssignment_1_0_1 )
                    {
                     before(grammarAccess.getCreationStatementAccess().getNegationAssignment_1_0_1()); 
                    // InternalFeatureLangParser.g:1204:3: ( rule__CreationStatement__NegationAssignment_1_0_1 )
                    // InternalFeatureLangParser.g:1204:4: rule__CreationStatement__NegationAssignment_1_0_1
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
    // InternalFeatureLangParser.g:1212:1: rule__Action__TypeAlternatives_0 : ( ( ruleAttributeAction ) | ( ruleAssociationAction ) | ( ruleInheritanceAction ) | ( ruleCompositionAction ) );
    public final void rule__Action__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1216:1: ( ( ruleAttributeAction ) | ( ruleAssociationAction ) | ( ruleInheritanceAction ) | ( ruleCompositionAction ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case Have:
                {
                switch ( input.LA(2) ) {
                case Associations:
                case Association:
                    {
                    alt9=2;
                    }
                    break;
                case The:
                case An:
                case A:
                    {
                    alt9=1;
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
                    // InternalFeatureLangParser.g:1217:2: ( ruleAttributeAction )
                    {
                    // InternalFeatureLangParser.g:1217:2: ( ruleAttributeAction )
                    // InternalFeatureLangParser.g:1218:3: ruleAttributeAction
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
                    // InternalFeatureLangParser.g:1223:2: ( ruleAssociationAction )
                    {
                    // InternalFeatureLangParser.g:1223:2: ( ruleAssociationAction )
                    // InternalFeatureLangParser.g:1224:3: ruleAssociationAction
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
                    // InternalFeatureLangParser.g:1229:2: ( ruleInheritanceAction )
                    {
                    // InternalFeatureLangParser.g:1229:2: ( ruleInheritanceAction )
                    // InternalFeatureLangParser.g:1230:3: ruleInheritanceAction
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
                    // InternalFeatureLangParser.g:1235:2: ( ruleCompositionAction )
                    {
                    // InternalFeatureLangParser.g:1235:2: ( ruleCompositionAction )
                    // InternalFeatureLangParser.g:1236:3: ruleCompositionAction
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
    // InternalFeatureLangParser.g:1245:1: rule__UpdateAction__Alternatives_1 : ( ( An ) | ( A ) | ( The ) );
    public final void rule__UpdateAction__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1249:1: ( ( An ) | ( A ) | ( The ) )
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
                    // InternalFeatureLangParser.g:1250:2: ( An )
                    {
                    // InternalFeatureLangParser.g:1250:2: ( An )
                    // InternalFeatureLangParser.g:1251:3: An
                    {
                     before(grammarAccess.getUpdateActionAccess().getAnKeyword_1_0()); 
                    match(input,An,FOLLOW_2); 
                     after(grammarAccess.getUpdateActionAccess().getAnKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1256:2: ( A )
                    {
                    // InternalFeatureLangParser.g:1256:2: ( A )
                    // InternalFeatureLangParser.g:1257:3: A
                    {
                     before(grammarAccess.getUpdateActionAccess().getAKeyword_1_1()); 
                    match(input,A,FOLLOW_2); 
                     after(grammarAccess.getUpdateActionAccess().getAKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureLangParser.g:1262:2: ( The )
                    {
                    // InternalFeatureLangParser.g:1262:2: ( The )
                    // InternalFeatureLangParser.g:1263:3: The
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
    // InternalFeatureLangParser.g:1272:1: rule__UpdateAction__Alternatives_2 : ( ( Existing ) | ( Created ) );
    public final void rule__UpdateAction__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1276:1: ( ( Existing ) | ( Created ) )
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
                    // InternalFeatureLangParser.g:1277:2: ( Existing )
                    {
                    // InternalFeatureLangParser.g:1277:2: ( Existing )
                    // InternalFeatureLangParser.g:1278:3: Existing
                    {
                     before(grammarAccess.getUpdateActionAccess().getExistingKeyword_2_0()); 
                    match(input,Existing,FOLLOW_2); 
                     after(grammarAccess.getUpdateActionAccess().getExistingKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1283:2: ( Created )
                    {
                    // InternalFeatureLangParser.g:1283:2: ( Created )
                    // InternalFeatureLangParser.g:1284:3: Created
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
    // InternalFeatureLangParser.g:1293:1: rule__UpdateAction__Alternatives_7 : ( ( ( rule__UpdateAction__DatatypeAssignment_7_0 ) ) | ( ( rule__UpdateAction__IdentifierAssignment_7_1 ) ) | ( ( rule__UpdateAction__ValueAssignment_7_2 ) ) );
    public final void rule__UpdateAction__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1297:1: ( ( ( rule__UpdateAction__DatatypeAssignment_7_0 ) ) | ( ( rule__UpdateAction__IdentifierAssignment_7_1 ) ) | ( ( rule__UpdateAction__ValueAssignment_7_2 ) ) )
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
                case Name:
                case URI:
                case An:
                    {
                    alt12=2;
                    }
                    break;
                case Value:
                    {
                    alt12=3;
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
                    // InternalFeatureLangParser.g:1298:2: ( ( rule__UpdateAction__DatatypeAssignment_7_0 ) )
                    {
                    // InternalFeatureLangParser.g:1298:2: ( ( rule__UpdateAction__DatatypeAssignment_7_0 ) )
                    // InternalFeatureLangParser.g:1299:3: ( rule__UpdateAction__DatatypeAssignment_7_0 )
                    {
                     before(grammarAccess.getUpdateActionAccess().getDatatypeAssignment_7_0()); 
                    // InternalFeatureLangParser.g:1300:3: ( rule__UpdateAction__DatatypeAssignment_7_0 )
                    // InternalFeatureLangParser.g:1300:4: rule__UpdateAction__DatatypeAssignment_7_0
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
                    // InternalFeatureLangParser.g:1304:2: ( ( rule__UpdateAction__IdentifierAssignment_7_1 ) )
                    {
                    // InternalFeatureLangParser.g:1304:2: ( ( rule__UpdateAction__IdentifierAssignment_7_1 ) )
                    // InternalFeatureLangParser.g:1305:3: ( rule__UpdateAction__IdentifierAssignment_7_1 )
                    {
                     before(grammarAccess.getUpdateActionAccess().getIdentifierAssignment_7_1()); 
                    // InternalFeatureLangParser.g:1306:3: ( rule__UpdateAction__IdentifierAssignment_7_1 )
                    // InternalFeatureLangParser.g:1306:4: rule__UpdateAction__IdentifierAssignment_7_1
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
                    // InternalFeatureLangParser.g:1310:2: ( ( rule__UpdateAction__ValueAssignment_7_2 ) )
                    {
                    // InternalFeatureLangParser.g:1310:2: ( ( rule__UpdateAction__ValueAssignment_7_2 ) )
                    // InternalFeatureLangParser.g:1311:3: ( rule__UpdateAction__ValueAssignment_7_2 )
                    {
                     before(grammarAccess.getUpdateActionAccess().getValueAssignment_7_2()); 
                    // InternalFeatureLangParser.g:1312:3: ( rule__UpdateAction__ValueAssignment_7_2 )
                    // InternalFeatureLangParser.g:1312:4: rule__UpdateAction__ValueAssignment_7_2
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
    // InternalFeatureLangParser.g:1320:1: rule__UpdateAttributeIdentifier__Alternatives_1 : ( ( A ) | ( An ) );
    public final void rule__UpdateAttributeIdentifier__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1324:1: ( ( A ) | ( An ) )
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
                    // InternalFeatureLangParser.g:1325:2: ( A )
                    {
                    // InternalFeatureLangParser.g:1325:2: ( A )
                    // InternalFeatureLangParser.g:1326:3: A
                    {
                     before(grammarAccess.getUpdateAttributeIdentifierAccess().getAKeyword_1_0()); 
                    match(input,A,FOLLOW_2); 
                     after(grammarAccess.getUpdateAttributeIdentifierAccess().getAKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1331:2: ( An )
                    {
                    // InternalFeatureLangParser.g:1331:2: ( An )
                    // InternalFeatureLangParser.g:1332:3: An
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
    // InternalFeatureLangParser.g:1341:1: rule__AttributeAction__Alternatives_1 : ( ( The ) | ( An ) | ( A ) );
    public final void rule__AttributeAction__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1345:1: ( ( The ) | ( An ) | ( A ) )
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
                    // InternalFeatureLangParser.g:1346:2: ( The )
                    {
                    // InternalFeatureLangParser.g:1346:2: ( The )
                    // InternalFeatureLangParser.g:1347:3: The
                    {
                     before(grammarAccess.getAttributeActionAccess().getTheKeyword_1_0()); 
                    match(input,The,FOLLOW_2); 
                     after(grammarAccess.getAttributeActionAccess().getTheKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1352:2: ( An )
                    {
                    // InternalFeatureLangParser.g:1352:2: ( An )
                    // InternalFeatureLangParser.g:1353:3: An
                    {
                     before(grammarAccess.getAttributeActionAccess().getAnKeyword_1_1()); 
                    match(input,An,FOLLOW_2); 
                     after(grammarAccess.getAttributeActionAccess().getAnKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureLangParser.g:1358:2: ( A )
                    {
                    // InternalFeatureLangParser.g:1358:2: ( A )
                    // InternalFeatureLangParser.g:1359:3: A
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
    // InternalFeatureLangParser.g:1368:1: rule__AssociationAction__Alternatives_1 : ( ( Associations ) | ( Association ) );
    public final void rule__AssociationAction__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1372:1: ( ( Associations ) | ( Association ) )
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
                    // InternalFeatureLangParser.g:1373:2: ( Associations )
                    {
                    // InternalFeatureLangParser.g:1373:2: ( Associations )
                    // InternalFeatureLangParser.g:1374:3: Associations
                    {
                     before(grammarAccess.getAssociationActionAccess().getAssociationsKeyword_1_0()); 
                    match(input,Associations,FOLLOW_2); 
                     after(grammarAccess.getAssociationActionAccess().getAssociationsKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1379:2: ( Association )
                    {
                    // InternalFeatureLangParser.g:1379:2: ( Association )
                    // InternalFeatureLangParser.g:1380:3: Association
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
    // InternalFeatureLangParser.g:1389:1: rule__AssociationAction__Alternatives_2 : ( ( ( rule__AssociationAction__CreateAssignment_2_0 ) ) | ( ( rule__AssociationAction__Group_2_1__0 ) ) );
    public final void rule__AssociationAction__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1393:1: ( ( ( rule__AssociationAction__CreateAssignment_2_0 ) ) | ( ( rule__AssociationAction__Group_2_1__0 ) ) )
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
                    // InternalFeatureLangParser.g:1394:2: ( ( rule__AssociationAction__CreateAssignment_2_0 ) )
                    {
                    // InternalFeatureLangParser.g:1394:2: ( ( rule__AssociationAction__CreateAssignment_2_0 ) )
                    // InternalFeatureLangParser.g:1395:3: ( rule__AssociationAction__CreateAssignment_2_0 )
                    {
                     before(grammarAccess.getAssociationActionAccess().getCreateAssignment_2_0()); 
                    // InternalFeatureLangParser.g:1396:3: ( rule__AssociationAction__CreateAssignment_2_0 )
                    // InternalFeatureLangParser.g:1396:4: rule__AssociationAction__CreateAssignment_2_0
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
                    // InternalFeatureLangParser.g:1400:2: ( ( rule__AssociationAction__Group_2_1__0 ) )
                    {
                    // InternalFeatureLangParser.g:1400:2: ( ( rule__AssociationAction__Group_2_1__0 ) )
                    // InternalFeatureLangParser.g:1401:3: ( rule__AssociationAction__Group_2_1__0 )
                    {
                     before(grammarAccess.getAssociationActionAccess().getGroup_2_1()); 
                    // InternalFeatureLangParser.g:1402:3: ( rule__AssociationAction__Group_2_1__0 )
                    // InternalFeatureLangParser.g:1402:4: rule__AssociationAction__Group_2_1__0
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
    // InternalFeatureLangParser.g:1410:1: rule__EditAssociation__TypeAlternatives_0 : ( ( ruleSetCompatible ) | ( ruleSetVersionRange ) | ( ruleSetVariant ) | ( ruleSetRightOpen ) | ( ruleSetLeftOpen ) );
    public final void rule__EditAssociation__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1414:1: ( ( ruleSetCompatible ) | ( ruleSetVersionRange ) | ( ruleSetVariant ) | ( ruleSetRightOpen ) | ( ruleSetLeftOpen ) )
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
                    // InternalFeatureLangParser.g:1415:2: ( ruleSetCompatible )
                    {
                    // InternalFeatureLangParser.g:1415:2: ( ruleSetCompatible )
                    // InternalFeatureLangParser.g:1416:3: ruleSetCompatible
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
                    // InternalFeatureLangParser.g:1421:2: ( ruleSetVersionRange )
                    {
                    // InternalFeatureLangParser.g:1421:2: ( ruleSetVersionRange )
                    // InternalFeatureLangParser.g:1422:3: ruleSetVersionRange
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
                    // InternalFeatureLangParser.g:1427:2: ( ruleSetVariant )
                    {
                    // InternalFeatureLangParser.g:1427:2: ( ruleSetVariant )
                    // InternalFeatureLangParser.g:1428:3: ruleSetVariant
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
                    // InternalFeatureLangParser.g:1433:2: ( ruleSetRightOpen )
                    {
                    // InternalFeatureLangParser.g:1433:2: ( ruleSetRightOpen )
                    // InternalFeatureLangParser.g:1434:3: ruleSetRightOpen
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
                    // InternalFeatureLangParser.g:1439:2: ( ruleSetLeftOpen )
                    {
                    // InternalFeatureLangParser.g:1439:2: ( ruleSetLeftOpen )
                    // InternalFeatureLangParser.g:1440:3: ruleSetLeftOpen
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
    // InternalFeatureLangParser.g:1449:1: rule__InheritanceAction__Alternatives_0 : ( ( Inherit ) | ( Inheritance ) );
    public final void rule__InheritanceAction__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1453:1: ( ( Inherit ) | ( Inheritance ) )
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
                    // InternalFeatureLangParser.g:1454:2: ( Inherit )
                    {
                    // InternalFeatureLangParser.g:1454:2: ( Inherit )
                    // InternalFeatureLangParser.g:1455:3: Inherit
                    {
                     before(grammarAccess.getInheritanceActionAccess().getInheritKeyword_0_0()); 
                    match(input,Inherit,FOLLOW_2); 
                     after(grammarAccess.getInheritanceActionAccess().getInheritKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1460:2: ( Inheritance )
                    {
                    // InternalFeatureLangParser.g:1460:2: ( Inheritance )
                    // InternalFeatureLangParser.g:1461:3: Inheritance
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
    // InternalFeatureLangParser.g:1470:1: rule__CompositionAction__Alternatives : ( ( ( rule__CompositionAction__CreateAssignment_0 ) ) | ( ( rule__CompositionAction__EditAssignment_1 ) ) );
    public final void rule__CompositionAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1474:1: ( ( ( rule__CompositionAction__CreateAssignment_0 ) ) | ( ( rule__CompositionAction__EditAssignment_1 ) ) )
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
                    // InternalFeatureLangParser.g:1475:2: ( ( rule__CompositionAction__CreateAssignment_0 ) )
                    {
                    // InternalFeatureLangParser.g:1475:2: ( ( rule__CompositionAction__CreateAssignment_0 ) )
                    // InternalFeatureLangParser.g:1476:3: ( rule__CompositionAction__CreateAssignment_0 )
                    {
                     before(grammarAccess.getCompositionActionAccess().getCreateAssignment_0()); 
                    // InternalFeatureLangParser.g:1477:3: ( rule__CompositionAction__CreateAssignment_0 )
                    // InternalFeatureLangParser.g:1477:4: rule__CompositionAction__CreateAssignment_0
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
                    // InternalFeatureLangParser.g:1481:2: ( ( rule__CompositionAction__EditAssignment_1 ) )
                    {
                    // InternalFeatureLangParser.g:1481:2: ( ( rule__CompositionAction__EditAssignment_1 ) )
                    // InternalFeatureLangParser.g:1482:3: ( rule__CompositionAction__EditAssignment_1 )
                    {
                     before(grammarAccess.getCompositionActionAccess().getEditAssignment_1()); 
                    // InternalFeatureLangParser.g:1483:3: ( rule__CompositionAction__EditAssignment_1 )
                    // InternalFeatureLangParser.g:1483:4: rule__CompositionAction__EditAssignment_1
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
    // InternalFeatureLangParser.g:1491:1: rule__CreateComposition__Alternatives_0 : ( ( Compose ) | ( ( rule__CreateComposition__Group_0_1__0 ) ) );
    public final void rule__CreateComposition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1495:1: ( ( Compose ) | ( ( rule__CreateComposition__Group_0_1__0 ) ) )
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
                    // InternalFeatureLangParser.g:1496:2: ( Compose )
                    {
                    // InternalFeatureLangParser.g:1496:2: ( Compose )
                    // InternalFeatureLangParser.g:1497:3: Compose
                    {
                     before(grammarAccess.getCreateCompositionAccess().getComposeKeyword_0_0()); 
                    match(input,Compose,FOLLOW_2); 
                     after(grammarAccess.getCreateCompositionAccess().getComposeKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1502:2: ( ( rule__CreateComposition__Group_0_1__0 ) )
                    {
                    // InternalFeatureLangParser.g:1502:2: ( ( rule__CreateComposition__Group_0_1__0 ) )
                    // InternalFeatureLangParser.g:1503:3: ( rule__CreateComposition__Group_0_1__0 )
                    {
                     before(grammarAccess.getCreateCompositionAccess().getGroup_0_1()); 
                    // InternalFeatureLangParser.g:1504:3: ( rule__CreateComposition__Group_0_1__0 )
                    // InternalFeatureLangParser.g:1504:4: rule__CreateComposition__Group_0_1__0
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
    // InternalFeatureLangParser.g:1512:1: rule__Class__Alternatives_0 : ( ( The ) | ( A ) );
    public final void rule__Class__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1516:1: ( ( The ) | ( A ) )
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
                    // InternalFeatureLangParser.g:1517:2: ( The )
                    {
                    // InternalFeatureLangParser.g:1517:2: ( The )
                    // InternalFeatureLangParser.g:1518:3: The
                    {
                     before(grammarAccess.getClassAccess().getTheKeyword_0_0()); 
                    match(input,The,FOLLOW_2); 
                     after(grammarAccess.getClassAccess().getTheKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1523:2: ( A )
                    {
                    // InternalFeatureLangParser.g:1523:2: ( A )
                    // InternalFeatureLangParser.g:1524:3: A
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
    // InternalFeatureLangParser.g:1533:1: rule__AttributeValue__Alternatives : ( ( ( ( rule__AttributeValue__Group_0__0 ) ) ( ( rule__AttributeValue__Group_0__0 )* ) ) | ( RULE_INT ) | ( RULE_DATE ) );
    public final void rule__AttributeValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1537:1: ( ( ( ( rule__AttributeValue__Group_0__0 ) ) ( ( rule__AttributeValue__Group_0__0 )* ) ) | ( RULE_INT ) | ( RULE_DATE ) )
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
                    // InternalFeatureLangParser.g:1538:2: ( ( ( rule__AttributeValue__Group_0__0 ) ) ( ( rule__AttributeValue__Group_0__0 )* ) )
                    {
                    // InternalFeatureLangParser.g:1538:2: ( ( ( rule__AttributeValue__Group_0__0 ) ) ( ( rule__AttributeValue__Group_0__0 )* ) )
                    // InternalFeatureLangParser.g:1539:3: ( ( rule__AttributeValue__Group_0__0 ) ) ( ( rule__AttributeValue__Group_0__0 )* )
                    {
                    // InternalFeatureLangParser.g:1539:3: ( ( rule__AttributeValue__Group_0__0 ) )
                    // InternalFeatureLangParser.g:1540:4: ( rule__AttributeValue__Group_0__0 )
                    {
                     before(grammarAccess.getAttributeValueAccess().getGroup_0()); 
                    // InternalFeatureLangParser.g:1541:4: ( rule__AttributeValue__Group_0__0 )
                    // InternalFeatureLangParser.g:1541:5: rule__AttributeValue__Group_0__0
                    {
                    pushFollow(FOLLOW_4);
                    rule__AttributeValue__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeValueAccess().getGroup_0()); 

                    }

                    // InternalFeatureLangParser.g:1544:3: ( ( rule__AttributeValue__Group_0__0 )* )
                    // InternalFeatureLangParser.g:1545:4: ( rule__AttributeValue__Group_0__0 )*
                    {
                     before(grammarAccess.getAttributeValueAccess().getGroup_0()); 
                    // InternalFeatureLangParser.g:1546:4: ( rule__AttributeValue__Group_0__0 )*
                    loop22:
                    do {
                        int alt22=2;
                        alt22 = dfa22.predict(input);
                        switch (alt22) {
                    	case 1 :
                    	    // InternalFeatureLangParser.g:1546:5: rule__AttributeValue__Group_0__0
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
                    // InternalFeatureLangParser.g:1551:2: ( RULE_INT )
                    {
                    // InternalFeatureLangParser.g:1551:2: ( RULE_INT )
                    // InternalFeatureLangParser.g:1552:3: RULE_INT
                    {
                     before(grammarAccess.getAttributeValueAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getAttributeValueAccess().getINTTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureLangParser.g:1557:2: ( RULE_DATE )
                    {
                    // InternalFeatureLangParser.g:1557:2: ( RULE_DATE )
                    // InternalFeatureLangParser.g:1558:3: RULE_DATE
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
    // InternalFeatureLangParser.g:1567:1: rule__Publicity__Alternatives : ( ( ( Public ) ) | ( ( Private ) ) );
    public final void rule__Publicity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1571:1: ( ( ( Public ) ) | ( ( Private ) ) )
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
                    // InternalFeatureLangParser.g:1572:2: ( ( Public ) )
                    {
                    // InternalFeatureLangParser.g:1572:2: ( ( Public ) )
                    // InternalFeatureLangParser.g:1573:3: ( Public )
                    {
                     before(grammarAccess.getPublicityAccess().getPUBLICEnumLiteralDeclaration_0()); 
                    // InternalFeatureLangParser.g:1574:3: ( Public )
                    // InternalFeatureLangParser.g:1574:4: Public
                    {
                    match(input,Public,FOLLOW_2); 

                    }

                     after(grammarAccess.getPublicityAccess().getPUBLICEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1578:2: ( ( Private ) )
                    {
                    // InternalFeatureLangParser.g:1578:2: ( ( Private ) )
                    // InternalFeatureLangParser.g:1579:3: ( Private )
                    {
                     before(grammarAccess.getPublicityAccess().getPRIVATEEnumLiteralDeclaration_1()); 
                    // InternalFeatureLangParser.g:1580:3: ( Private )
                    // InternalFeatureLangParser.g:1580:4: Private
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
    // InternalFeatureLangParser.g:1588:1: rule__PriorityValue__Alternatives : ( ( ( Should ) ) | ( ( Must ) ) );
    public final void rule__PriorityValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1592:1: ( ( ( Should ) ) | ( ( Must ) ) )
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
                    // InternalFeatureLangParser.g:1593:2: ( ( Should ) )
                    {
                    // InternalFeatureLangParser.g:1593:2: ( ( Should ) )
                    // InternalFeatureLangParser.g:1594:3: ( Should )
                    {
                     before(grammarAccess.getPriorityValueAccess().getSHOULDEnumLiteralDeclaration_0()); 
                    // InternalFeatureLangParser.g:1595:3: ( Should )
                    // InternalFeatureLangParser.g:1595:4: Should
                    {
                    match(input,Should,FOLLOW_2); 

                    }

                     after(grammarAccess.getPriorityValueAccess().getSHOULDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1599:2: ( ( Must ) )
                    {
                    // InternalFeatureLangParser.g:1599:2: ( ( Must ) )
                    // InternalFeatureLangParser.g:1600:3: ( Must )
                    {
                     before(grammarAccess.getPriorityValueAccess().getMUSTEnumLiteralDeclaration_1()); 
                    // InternalFeatureLangParser.g:1601:3: ( Must )
                    // InternalFeatureLangParser.g:1601:4: Must
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
    // InternalFeatureLangParser.g:1609:1: rule__Abstraction__Alternatives : ( ( ( New ) ) | ( ( Abstract ) ) );
    public final void rule__Abstraction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1613:1: ( ( ( New ) ) | ( ( Abstract ) ) )
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
                    // InternalFeatureLangParser.g:1614:2: ( ( New ) )
                    {
                    // InternalFeatureLangParser.g:1614:2: ( ( New ) )
                    // InternalFeatureLangParser.g:1615:3: ( New )
                    {
                     before(grammarAccess.getAbstractionAccess().getNEWEnumLiteralDeclaration_0()); 
                    // InternalFeatureLangParser.g:1616:3: ( New )
                    // InternalFeatureLangParser.g:1616:4: New
                    {
                    match(input,New,FOLLOW_2); 

                    }

                     after(grammarAccess.getAbstractionAccess().getNEWEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1620:2: ( ( Abstract ) )
                    {
                    // InternalFeatureLangParser.g:1620:2: ( ( Abstract ) )
                    // InternalFeatureLangParser.g:1621:3: ( Abstract )
                    {
                     before(grammarAccess.getAbstractionAccess().getABSTRACTIONEnumLiteralDeclaration_1()); 
                    // InternalFeatureLangParser.g:1622:3: ( Abstract )
                    // InternalFeatureLangParser.g:1622:4: Abstract
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
    // InternalFeatureLangParser.g:1630:1: rule__IdentifierValue__Alternatives : ( ( ( Name ) ) | ( ( URI ) ) );
    public final void rule__IdentifierValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1634:1: ( ( ( Name ) ) | ( ( URI ) ) )
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
                    // InternalFeatureLangParser.g:1635:2: ( ( Name ) )
                    {
                    // InternalFeatureLangParser.g:1635:2: ( ( Name ) )
                    // InternalFeatureLangParser.g:1636:3: ( Name )
                    {
                     before(grammarAccess.getIdentifierValueAccess().getNAMEEnumLiteralDeclaration_0()); 
                    // InternalFeatureLangParser.g:1637:3: ( Name )
                    // InternalFeatureLangParser.g:1637:4: Name
                    {
                    match(input,Name,FOLLOW_2); 

                    }

                     after(grammarAccess.getIdentifierValueAccess().getNAMEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1641:2: ( ( URI ) )
                    {
                    // InternalFeatureLangParser.g:1641:2: ( ( URI ) )
                    // InternalFeatureLangParser.g:1642:3: ( URI )
                    {
                     before(grammarAccess.getIdentifierValueAccess().getURIEnumLiteralDeclaration_1()); 
                    // InternalFeatureLangParser.g:1643:3: ( URI )
                    // InternalFeatureLangParser.g:1643:4: URI
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
    // InternalFeatureLangParser.g:1651:1: rule__Datatype__Alternatives : ( ( ( DEFAULT ) ) | ( ( Time ) ) | ( ( Phrase ) ) | ( ( Number ) ) );
    public final void rule__Datatype__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1655:1: ( ( ( DEFAULT ) ) | ( ( Time ) ) | ( ( Phrase ) ) | ( ( Number ) ) )
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
                    // InternalFeatureLangParser.g:1656:2: ( ( DEFAULT ) )
                    {
                    // InternalFeatureLangParser.g:1656:2: ( ( DEFAULT ) )
                    // InternalFeatureLangParser.g:1657:3: ( DEFAULT )
                    {
                     before(grammarAccess.getDatatypeAccess().getDEFAULTEnumLiteralDeclaration_0()); 
                    // InternalFeatureLangParser.g:1658:3: ( DEFAULT )
                    // InternalFeatureLangParser.g:1658:4: DEFAULT
                    {
                    match(input,DEFAULT,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatatypeAccess().getDEFAULTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1662:2: ( ( Time ) )
                    {
                    // InternalFeatureLangParser.g:1662:2: ( ( Time ) )
                    // InternalFeatureLangParser.g:1663:3: ( Time )
                    {
                     before(grammarAccess.getDatatypeAccess().getWORDEnumLiteralDeclaration_1()); 
                    // InternalFeatureLangParser.g:1664:3: ( Time )
                    // InternalFeatureLangParser.g:1664:4: Time
                    {
                    match(input,Time,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatatypeAccess().getWORDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureLangParser.g:1668:2: ( ( Phrase ) )
                    {
                    // InternalFeatureLangParser.g:1668:2: ( ( Phrase ) )
                    // InternalFeatureLangParser.g:1669:3: ( Phrase )
                    {
                     before(grammarAccess.getDatatypeAccess().getPHRASEEnumLiteralDeclaration_2()); 
                    // InternalFeatureLangParser.g:1670:3: ( Phrase )
                    // InternalFeatureLangParser.g:1670:4: Phrase
                    {
                    match(input,Phrase,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatatypeAccess().getPHRASEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFeatureLangParser.g:1674:2: ( ( Number ) )
                    {
                    // InternalFeatureLangParser.g:1674:2: ( ( Number ) )
                    // InternalFeatureLangParser.g:1675:3: ( Number )
                    {
                     before(grammarAccess.getDatatypeAccess().getNUMBEREnumLiteralDeclaration_3()); 
                    // InternalFeatureLangParser.g:1676:3: ( Number )
                    // InternalFeatureLangParser.g:1676:4: Number
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
    // InternalFeatureLangParser.g:1684:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1688:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalFeatureLangParser.g:1689:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
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
    // InternalFeatureLangParser.g:1696:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__Alternatives_0 ) ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1700:1: ( ( ( rule__Statement__Alternatives_0 ) ) )
            // InternalFeatureLangParser.g:1701:1: ( ( rule__Statement__Alternatives_0 ) )
            {
            // InternalFeatureLangParser.g:1701:1: ( ( rule__Statement__Alternatives_0 ) )
            // InternalFeatureLangParser.g:1702:2: ( rule__Statement__Alternatives_0 )
            {
             before(grammarAccess.getStatementAccess().getAlternatives_0()); 
            // InternalFeatureLangParser.g:1703:2: ( rule__Statement__Alternatives_0 )
            // InternalFeatureLangParser.g:1703:3: rule__Statement__Alternatives_0
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
    // InternalFeatureLangParser.g:1711:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1715:1: ( rule__Statement__Group__1__Impl )
            // InternalFeatureLangParser.g:1716:2: rule__Statement__Group__1__Impl
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
    // InternalFeatureLangParser.g:1722:1: rule__Statement__Group__1__Impl : ( ( FullStop )? ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1726:1: ( ( ( FullStop )? ) )
            // InternalFeatureLangParser.g:1727:1: ( ( FullStop )? )
            {
            // InternalFeatureLangParser.g:1727:1: ( ( FullStop )? )
            // InternalFeatureLangParser.g:1728:2: ( FullStop )?
            {
             before(grammarAccess.getStatementAccess().getFullStopKeyword_1()); 
            // InternalFeatureLangParser.g:1729:2: ( FullStop )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==FullStop) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalFeatureLangParser.g:1729:3: FullStop
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
    // InternalFeatureLangParser.g:1738:1: rule__ChangeStatement__Group__0 : rule__ChangeStatement__Group__0__Impl rule__ChangeStatement__Group__1 ;
    public final void rule__ChangeStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1742:1: ( rule__ChangeStatement__Group__0__Impl rule__ChangeStatement__Group__1 )
            // InternalFeatureLangParser.g:1743:2: rule__ChangeStatement__Group__0__Impl rule__ChangeStatement__Group__1
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
    // InternalFeatureLangParser.g:1750:1: rule__ChangeStatement__Group__0__Impl : ( ( rule__ChangeStatement__Alternatives_0 ) ) ;
    public final void rule__ChangeStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1754:1: ( ( ( rule__ChangeStatement__Alternatives_0 ) ) )
            // InternalFeatureLangParser.g:1755:1: ( ( rule__ChangeStatement__Alternatives_0 ) )
            {
            // InternalFeatureLangParser.g:1755:1: ( ( rule__ChangeStatement__Alternatives_0 ) )
            // InternalFeatureLangParser.g:1756:2: ( rule__ChangeStatement__Alternatives_0 )
            {
             before(grammarAccess.getChangeStatementAccess().getAlternatives_0()); 
            // InternalFeatureLangParser.g:1757:2: ( rule__ChangeStatement__Alternatives_0 )
            // InternalFeatureLangParser.g:1757:3: rule__ChangeStatement__Alternatives_0
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
    // InternalFeatureLangParser.g:1765:1: rule__ChangeStatement__Group__1 : rule__ChangeStatement__Group__1__Impl ;
    public final void rule__ChangeStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1769:1: ( rule__ChangeStatement__Group__1__Impl )
            // InternalFeatureLangParser.g:1770:2: rule__ChangeStatement__Group__1__Impl
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
    // InternalFeatureLangParser.g:1776:1: rule__ChangeStatement__Group__1__Impl : ( ( rule__ChangeStatement__Alternatives_1 ) ) ;
    public final void rule__ChangeStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1780:1: ( ( ( rule__ChangeStatement__Alternatives_1 ) ) )
            // InternalFeatureLangParser.g:1781:1: ( ( rule__ChangeStatement__Alternatives_1 ) )
            {
            // InternalFeatureLangParser.g:1781:1: ( ( rule__ChangeStatement__Alternatives_1 ) )
            // InternalFeatureLangParser.g:1782:2: ( rule__ChangeStatement__Alternatives_1 )
            {
             before(grammarAccess.getChangeStatementAccess().getAlternatives_1()); 
            // InternalFeatureLangParser.g:1783:2: ( rule__ChangeStatement__Alternatives_1 )
            // InternalFeatureLangParser.g:1783:3: rule__ChangeStatement__Alternatives_1
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
    // InternalFeatureLangParser.g:1792:1: rule__ChangeStatement__Group_0_0__0 : rule__ChangeStatement__Group_0_0__0__Impl rule__ChangeStatement__Group_0_0__1 ;
    public final void rule__ChangeStatement__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1796:1: ( rule__ChangeStatement__Group_0_0__0__Impl rule__ChangeStatement__Group_0_0__1 )
            // InternalFeatureLangParser.g:1797:2: rule__ChangeStatement__Group_0_0__0__Impl rule__ChangeStatement__Group_0_0__1
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
    // InternalFeatureLangParser.g:1804:1: rule__ChangeStatement__Group_0_0__0__Impl : ( ( rule__ChangeStatement__TargetAssignment_0_0_0 ) ) ;
    public final void rule__ChangeStatement__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1808:1: ( ( ( rule__ChangeStatement__TargetAssignment_0_0_0 ) ) )
            // InternalFeatureLangParser.g:1809:1: ( ( rule__ChangeStatement__TargetAssignment_0_0_0 ) )
            {
            // InternalFeatureLangParser.g:1809:1: ( ( rule__ChangeStatement__TargetAssignment_0_0_0 ) )
            // InternalFeatureLangParser.g:1810:2: ( rule__ChangeStatement__TargetAssignment_0_0_0 )
            {
             before(grammarAccess.getChangeStatementAccess().getTargetAssignment_0_0_0()); 
            // InternalFeatureLangParser.g:1811:2: ( rule__ChangeStatement__TargetAssignment_0_0_0 )
            // InternalFeatureLangParser.g:1811:3: rule__ChangeStatement__TargetAssignment_0_0_0
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
    // InternalFeatureLangParser.g:1819:1: rule__ChangeStatement__Group_0_0__1 : rule__ChangeStatement__Group_0_0__1__Impl ;
    public final void rule__ChangeStatement__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1823:1: ( rule__ChangeStatement__Group_0_0__1__Impl )
            // InternalFeatureLangParser.g:1824:2: rule__ChangeStatement__Group_0_0__1__Impl
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
    // InternalFeatureLangParser.g:1830:1: rule__ChangeStatement__Group_0_0__1__Impl : ( ( rule__ChangeStatement__Group_0_0_1__0 )? ) ;
    public final void rule__ChangeStatement__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1834:1: ( ( ( rule__ChangeStatement__Group_0_0_1__0 )? ) )
            // InternalFeatureLangParser.g:1835:1: ( ( rule__ChangeStatement__Group_0_0_1__0 )? )
            {
            // InternalFeatureLangParser.g:1835:1: ( ( rule__ChangeStatement__Group_0_0_1__0 )? )
            // InternalFeatureLangParser.g:1836:2: ( rule__ChangeStatement__Group_0_0_1__0 )?
            {
             before(grammarAccess.getChangeStatementAccess().getGroup_0_0_1()); 
            // InternalFeatureLangParser.g:1837:2: ( rule__ChangeStatement__Group_0_0_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Should||LA30_0==Must) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalFeatureLangParser.g:1837:3: rule__ChangeStatement__Group_0_0_1__0
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
    // InternalFeatureLangParser.g:1846:1: rule__ChangeStatement__Group_0_0_1__0 : rule__ChangeStatement__Group_0_0_1__0__Impl rule__ChangeStatement__Group_0_0_1__1 ;
    public final void rule__ChangeStatement__Group_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1850:1: ( rule__ChangeStatement__Group_0_0_1__0__Impl rule__ChangeStatement__Group_0_0_1__1 )
            // InternalFeatureLangParser.g:1851:2: rule__ChangeStatement__Group_0_0_1__0__Impl rule__ChangeStatement__Group_0_0_1__1
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
    // InternalFeatureLangParser.g:1858:1: rule__ChangeStatement__Group_0_0_1__0__Impl : ( ( rule__ChangeStatement__PriorityAssignment_0_0_1_0 ) ) ;
    public final void rule__ChangeStatement__Group_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1862:1: ( ( ( rule__ChangeStatement__PriorityAssignment_0_0_1_0 ) ) )
            // InternalFeatureLangParser.g:1863:1: ( ( rule__ChangeStatement__PriorityAssignment_0_0_1_0 ) )
            {
            // InternalFeatureLangParser.g:1863:1: ( ( rule__ChangeStatement__PriorityAssignment_0_0_1_0 ) )
            // InternalFeatureLangParser.g:1864:2: ( rule__ChangeStatement__PriorityAssignment_0_0_1_0 )
            {
             before(grammarAccess.getChangeStatementAccess().getPriorityAssignment_0_0_1_0()); 
            // InternalFeatureLangParser.g:1865:2: ( rule__ChangeStatement__PriorityAssignment_0_0_1_0 )
            // InternalFeatureLangParser.g:1865:3: rule__ChangeStatement__PriorityAssignment_0_0_1_0
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
    // InternalFeatureLangParser.g:1873:1: rule__ChangeStatement__Group_0_0_1__1 : rule__ChangeStatement__Group_0_0_1__1__Impl ;
    public final void rule__ChangeStatement__Group_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1877:1: ( rule__ChangeStatement__Group_0_0_1__1__Impl )
            // InternalFeatureLangParser.g:1878:2: rule__ChangeStatement__Group_0_0_1__1__Impl
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
    // InternalFeatureLangParser.g:1884:1: rule__ChangeStatement__Group_0_0_1__1__Impl : ( ( rule__ChangeStatement__NegationAssignment_0_0_1_1 )? ) ;
    public final void rule__ChangeStatement__Group_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1888:1: ( ( ( rule__ChangeStatement__NegationAssignment_0_0_1_1 )? ) )
            // InternalFeatureLangParser.g:1889:1: ( ( rule__ChangeStatement__NegationAssignment_0_0_1_1 )? )
            {
            // InternalFeatureLangParser.g:1889:1: ( ( rule__ChangeStatement__NegationAssignment_0_0_1_1 )? )
            // InternalFeatureLangParser.g:1890:2: ( rule__ChangeStatement__NegationAssignment_0_0_1_1 )?
            {
             before(grammarAccess.getChangeStatementAccess().getNegationAssignment_0_0_1_1()); 
            // InternalFeatureLangParser.g:1891:2: ( rule__ChangeStatement__NegationAssignment_0_0_1_1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Not) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalFeatureLangParser.g:1891:3: rule__ChangeStatement__NegationAssignment_0_0_1_1
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
    // InternalFeatureLangParser.g:1900:1: rule__ChangeStatement__Group_0_1__0 : rule__ChangeStatement__Group_0_1__0__Impl rule__ChangeStatement__Group_0_1__1 ;
    public final void rule__ChangeStatement__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1904:1: ( rule__ChangeStatement__Group_0_1__0__Impl rule__ChangeStatement__Group_0_1__1 )
            // InternalFeatureLangParser.g:1905:2: rule__ChangeStatement__Group_0_1__0__Impl rule__ChangeStatement__Group_0_1__1
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
    // InternalFeatureLangParser.g:1912:1: rule__ChangeStatement__Group_0_1__0__Impl : ( ( rule__ChangeStatement__Alternatives_0_1_0 ) ) ;
    public final void rule__ChangeStatement__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1916:1: ( ( ( rule__ChangeStatement__Alternatives_0_1_0 ) ) )
            // InternalFeatureLangParser.g:1917:1: ( ( rule__ChangeStatement__Alternatives_0_1_0 ) )
            {
            // InternalFeatureLangParser.g:1917:1: ( ( rule__ChangeStatement__Alternatives_0_1_0 ) )
            // InternalFeatureLangParser.g:1918:2: ( rule__ChangeStatement__Alternatives_0_1_0 )
            {
             before(grammarAccess.getChangeStatementAccess().getAlternatives_0_1_0()); 
            // InternalFeatureLangParser.g:1919:2: ( rule__ChangeStatement__Alternatives_0_1_0 )
            // InternalFeatureLangParser.g:1919:3: rule__ChangeStatement__Alternatives_0_1_0
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
    // InternalFeatureLangParser.g:1927:1: rule__ChangeStatement__Group_0_1__1 : rule__ChangeStatement__Group_0_1__1__Impl rule__ChangeStatement__Group_0_1__2 ;
    public final void rule__ChangeStatement__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1931:1: ( rule__ChangeStatement__Group_0_1__1__Impl rule__ChangeStatement__Group_0_1__2 )
            // InternalFeatureLangParser.g:1932:2: rule__ChangeStatement__Group_0_1__1__Impl rule__ChangeStatement__Group_0_1__2
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
    // InternalFeatureLangParser.g:1939:1: rule__ChangeStatement__Group_0_1__1__Impl : ( In ) ;
    public final void rule__ChangeStatement__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1943:1: ( ( In ) )
            // InternalFeatureLangParser.g:1944:1: ( In )
            {
            // InternalFeatureLangParser.g:1944:1: ( In )
            // InternalFeatureLangParser.g:1945:2: In
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
    // InternalFeatureLangParser.g:1954:1: rule__ChangeStatement__Group_0_1__2 : rule__ChangeStatement__Group_0_1__2__Impl ;
    public final void rule__ChangeStatement__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1958:1: ( rule__ChangeStatement__Group_0_1__2__Impl )
            // InternalFeatureLangParser.g:1959:2: rule__ChangeStatement__Group_0_1__2__Impl
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
    // InternalFeatureLangParser.g:1965:1: rule__ChangeStatement__Group_0_1__2__Impl : ( ( rule__ChangeStatement__TargetAssignment_0_1_2 ) ) ;
    public final void rule__ChangeStatement__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1969:1: ( ( ( rule__ChangeStatement__TargetAssignment_0_1_2 ) ) )
            // InternalFeatureLangParser.g:1970:1: ( ( rule__ChangeStatement__TargetAssignment_0_1_2 ) )
            {
            // InternalFeatureLangParser.g:1970:1: ( ( rule__ChangeStatement__TargetAssignment_0_1_2 ) )
            // InternalFeatureLangParser.g:1971:2: ( rule__ChangeStatement__TargetAssignment_0_1_2 )
            {
             before(grammarAccess.getChangeStatementAccess().getTargetAssignment_0_1_2()); 
            // InternalFeatureLangParser.g:1972:2: ( rule__ChangeStatement__TargetAssignment_0_1_2 )
            // InternalFeatureLangParser.g:1972:3: rule__ChangeStatement__TargetAssignment_0_1_2
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
    // InternalFeatureLangParser.g:1981:1: rule__CreationStatement__Group_0__0 : rule__CreationStatement__Group_0__0__Impl rule__CreationStatement__Group_0__1 ;
    public final void rule__CreationStatement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1985:1: ( rule__CreationStatement__Group_0__0__Impl rule__CreationStatement__Group_0__1 )
            // InternalFeatureLangParser.g:1986:2: rule__CreationStatement__Group_0__0__Impl rule__CreationStatement__Group_0__1
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
    // InternalFeatureLangParser.g:1993:1: rule__CreationStatement__Group_0__0__Impl : ( ( rule__CreationStatement__ClassElementAssignment_0_0 ) ) ;
    public final void rule__CreationStatement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1997:1: ( ( ( rule__CreationStatement__ClassElementAssignment_0_0 ) ) )
            // InternalFeatureLangParser.g:1998:1: ( ( rule__CreationStatement__ClassElementAssignment_0_0 ) )
            {
            // InternalFeatureLangParser.g:1998:1: ( ( rule__CreationStatement__ClassElementAssignment_0_0 ) )
            // InternalFeatureLangParser.g:1999:2: ( rule__CreationStatement__ClassElementAssignment_0_0 )
            {
             before(grammarAccess.getCreationStatementAccess().getClassElementAssignment_0_0()); 
            // InternalFeatureLangParser.g:2000:2: ( rule__CreationStatement__ClassElementAssignment_0_0 )
            // InternalFeatureLangParser.g:2000:3: rule__CreationStatement__ClassElementAssignment_0_0
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
    // InternalFeatureLangParser.g:2008:1: rule__CreationStatement__Group_0__1 : rule__CreationStatement__Group_0__1__Impl rule__CreationStatement__Group_0__2 ;
    public final void rule__CreationStatement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2012:1: ( rule__CreationStatement__Group_0__1__Impl rule__CreationStatement__Group_0__2 )
            // InternalFeatureLangParser.g:2013:2: rule__CreationStatement__Group_0__1__Impl rule__CreationStatement__Group_0__2
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
    // InternalFeatureLangParser.g:2020:1: rule__CreationStatement__Group_0__1__Impl : ( ( rule__CreationStatement__PriorityAssignment_0_1 ) ) ;
    public final void rule__CreationStatement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2024:1: ( ( ( rule__CreationStatement__PriorityAssignment_0_1 ) ) )
            // InternalFeatureLangParser.g:2025:1: ( ( rule__CreationStatement__PriorityAssignment_0_1 ) )
            {
            // InternalFeatureLangParser.g:2025:1: ( ( rule__CreationStatement__PriorityAssignment_0_1 ) )
            // InternalFeatureLangParser.g:2026:2: ( rule__CreationStatement__PriorityAssignment_0_1 )
            {
             before(grammarAccess.getCreationStatementAccess().getPriorityAssignment_0_1()); 
            // InternalFeatureLangParser.g:2027:2: ( rule__CreationStatement__PriorityAssignment_0_1 )
            // InternalFeatureLangParser.g:2027:3: rule__CreationStatement__PriorityAssignment_0_1
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
    // InternalFeatureLangParser.g:2035:1: rule__CreationStatement__Group_0__2 : rule__CreationStatement__Group_0__2__Impl rule__CreationStatement__Group_0__3 ;
    public final void rule__CreationStatement__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2039:1: ( rule__CreationStatement__Group_0__2__Impl rule__CreationStatement__Group_0__3 )
            // InternalFeatureLangParser.g:2040:2: rule__CreationStatement__Group_0__2__Impl rule__CreationStatement__Group_0__3
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
    // InternalFeatureLangParser.g:2047:1: rule__CreationStatement__Group_0__2__Impl : ( ( rule__CreationStatement__NegationAssignment_0_2 )? ) ;
    public final void rule__CreationStatement__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2051:1: ( ( ( rule__CreationStatement__NegationAssignment_0_2 )? ) )
            // InternalFeatureLangParser.g:2052:1: ( ( rule__CreationStatement__NegationAssignment_0_2 )? )
            {
            // InternalFeatureLangParser.g:2052:1: ( ( rule__CreationStatement__NegationAssignment_0_2 )? )
            // InternalFeatureLangParser.g:2053:2: ( rule__CreationStatement__NegationAssignment_0_2 )?
            {
             before(grammarAccess.getCreationStatementAccess().getNegationAssignment_0_2()); 
            // InternalFeatureLangParser.g:2054:2: ( rule__CreationStatement__NegationAssignment_0_2 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Not) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalFeatureLangParser.g:2054:3: rule__CreationStatement__NegationAssignment_0_2
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
    // InternalFeatureLangParser.g:2062:1: rule__CreationStatement__Group_0__3 : rule__CreationStatement__Group_0__3__Impl ;
    public final void rule__CreationStatement__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2066:1: ( rule__CreationStatement__Group_0__3__Impl )
            // InternalFeatureLangParser.g:2067:2: rule__CreationStatement__Group_0__3__Impl
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
    // InternalFeatureLangParser.g:2073:1: rule__CreationStatement__Group_0__3__Impl : ( ( rule__CreationStatement__Alternatives_0_3 ) ) ;
    public final void rule__CreationStatement__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2077:1: ( ( ( rule__CreationStatement__Alternatives_0_3 ) ) )
            // InternalFeatureLangParser.g:2078:1: ( ( rule__CreationStatement__Alternatives_0_3 ) )
            {
            // InternalFeatureLangParser.g:2078:1: ( ( rule__CreationStatement__Alternatives_0_3 ) )
            // InternalFeatureLangParser.g:2079:2: ( rule__CreationStatement__Alternatives_0_3 )
            {
             before(grammarAccess.getCreationStatementAccess().getAlternatives_0_3()); 
            // InternalFeatureLangParser.g:2080:2: ( rule__CreationStatement__Alternatives_0_3 )
            // InternalFeatureLangParser.g:2080:3: rule__CreationStatement__Alternatives_0_3
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
    // InternalFeatureLangParser.g:2089:1: rule__CreationStatement__Group_1__0 : rule__CreationStatement__Group_1__0__Impl rule__CreationStatement__Group_1__1 ;
    public final void rule__CreationStatement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2093:1: ( rule__CreationStatement__Group_1__0__Impl rule__CreationStatement__Group_1__1 )
            // InternalFeatureLangParser.g:2094:2: rule__CreationStatement__Group_1__0__Impl rule__CreationStatement__Group_1__1
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
    // InternalFeatureLangParser.g:2101:1: rule__CreationStatement__Group_1__0__Impl : ( ( rule__CreationStatement__Alternatives_1_0 ) ) ;
    public final void rule__CreationStatement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2105:1: ( ( ( rule__CreationStatement__Alternatives_1_0 ) ) )
            // InternalFeatureLangParser.g:2106:1: ( ( rule__CreationStatement__Alternatives_1_0 ) )
            {
            // InternalFeatureLangParser.g:2106:1: ( ( rule__CreationStatement__Alternatives_1_0 ) )
            // InternalFeatureLangParser.g:2107:2: ( rule__CreationStatement__Alternatives_1_0 )
            {
             before(grammarAccess.getCreationStatementAccess().getAlternatives_1_0()); 
            // InternalFeatureLangParser.g:2108:2: ( rule__CreationStatement__Alternatives_1_0 )
            // InternalFeatureLangParser.g:2108:3: rule__CreationStatement__Alternatives_1_0
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
    // InternalFeatureLangParser.g:2116:1: rule__CreationStatement__Group_1__1 : rule__CreationStatement__Group_1__1__Impl ;
    public final void rule__CreationStatement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2120:1: ( rule__CreationStatement__Group_1__1__Impl )
            // InternalFeatureLangParser.g:2121:2: rule__CreationStatement__Group_1__1__Impl
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
    // InternalFeatureLangParser.g:2127:1: rule__CreationStatement__Group_1__1__Impl : ( ( rule__CreationStatement__ClassElementAssignment_1_1 ) ) ;
    public final void rule__CreationStatement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2131:1: ( ( ( rule__CreationStatement__ClassElementAssignment_1_1 ) ) )
            // InternalFeatureLangParser.g:2132:1: ( ( rule__CreationStatement__ClassElementAssignment_1_1 ) )
            {
            // InternalFeatureLangParser.g:2132:1: ( ( rule__CreationStatement__ClassElementAssignment_1_1 ) )
            // InternalFeatureLangParser.g:2133:2: ( rule__CreationStatement__ClassElementAssignment_1_1 )
            {
             before(grammarAccess.getCreationStatementAccess().getClassElementAssignment_1_1()); 
            // InternalFeatureLangParser.g:2134:2: ( rule__CreationStatement__ClassElementAssignment_1_1 )
            // InternalFeatureLangParser.g:2134:3: rule__CreationStatement__ClassElementAssignment_1_1
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
    // InternalFeatureLangParser.g:2143:1: rule__UpdateAction__Group__0 : rule__UpdateAction__Group__0__Impl rule__UpdateAction__Group__1 ;
    public final void rule__UpdateAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2147:1: ( rule__UpdateAction__Group__0__Impl rule__UpdateAction__Group__1 )
            // InternalFeatureLangParser.g:2148:2: rule__UpdateAction__Group__0__Impl rule__UpdateAction__Group__1
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
    // InternalFeatureLangParser.g:2155:1: rule__UpdateAction__Group__0__Impl : ( ( Has )? ) ;
    public final void rule__UpdateAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2159:1: ( ( ( Has )? ) )
            // InternalFeatureLangParser.g:2160:1: ( ( Has )? )
            {
            // InternalFeatureLangParser.g:2160:1: ( ( Has )? )
            // InternalFeatureLangParser.g:2161:2: ( Has )?
            {
             before(grammarAccess.getUpdateActionAccess().getHasKeyword_0()); 
            // InternalFeatureLangParser.g:2162:2: ( Has )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Has) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalFeatureLangParser.g:2162:3: Has
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
    // InternalFeatureLangParser.g:2170:1: rule__UpdateAction__Group__1 : rule__UpdateAction__Group__1__Impl rule__UpdateAction__Group__2 ;
    public final void rule__UpdateAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2174:1: ( rule__UpdateAction__Group__1__Impl rule__UpdateAction__Group__2 )
            // InternalFeatureLangParser.g:2175:2: rule__UpdateAction__Group__1__Impl rule__UpdateAction__Group__2
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
    // InternalFeatureLangParser.g:2182:1: rule__UpdateAction__Group__1__Impl : ( ( rule__UpdateAction__Alternatives_1 ) ) ;
    public final void rule__UpdateAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2186:1: ( ( ( rule__UpdateAction__Alternatives_1 ) ) )
            // InternalFeatureLangParser.g:2187:1: ( ( rule__UpdateAction__Alternatives_1 ) )
            {
            // InternalFeatureLangParser.g:2187:1: ( ( rule__UpdateAction__Alternatives_1 ) )
            // InternalFeatureLangParser.g:2188:2: ( rule__UpdateAction__Alternatives_1 )
            {
             before(grammarAccess.getUpdateActionAccess().getAlternatives_1()); 
            // InternalFeatureLangParser.g:2189:2: ( rule__UpdateAction__Alternatives_1 )
            // InternalFeatureLangParser.g:2189:3: rule__UpdateAction__Alternatives_1
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
    // InternalFeatureLangParser.g:2197:1: rule__UpdateAction__Group__2 : rule__UpdateAction__Group__2__Impl rule__UpdateAction__Group__3 ;
    public final void rule__UpdateAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2201:1: ( rule__UpdateAction__Group__2__Impl rule__UpdateAction__Group__3 )
            // InternalFeatureLangParser.g:2202:2: rule__UpdateAction__Group__2__Impl rule__UpdateAction__Group__3
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
    // InternalFeatureLangParser.g:2209:1: rule__UpdateAction__Group__2__Impl : ( ( rule__UpdateAction__Alternatives_2 ) ) ;
    public final void rule__UpdateAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2213:1: ( ( ( rule__UpdateAction__Alternatives_2 ) ) )
            // InternalFeatureLangParser.g:2214:1: ( ( rule__UpdateAction__Alternatives_2 ) )
            {
            // InternalFeatureLangParser.g:2214:1: ( ( rule__UpdateAction__Alternatives_2 ) )
            // InternalFeatureLangParser.g:2215:2: ( rule__UpdateAction__Alternatives_2 )
            {
             before(grammarAccess.getUpdateActionAccess().getAlternatives_2()); 
            // InternalFeatureLangParser.g:2216:2: ( rule__UpdateAction__Alternatives_2 )
            // InternalFeatureLangParser.g:2216:3: rule__UpdateAction__Alternatives_2
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
    // InternalFeatureLangParser.g:2224:1: rule__UpdateAction__Group__3 : rule__UpdateAction__Group__3__Impl rule__UpdateAction__Group__4 ;
    public final void rule__UpdateAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2228:1: ( rule__UpdateAction__Group__3__Impl rule__UpdateAction__Group__4 )
            // InternalFeatureLangParser.g:2229:2: rule__UpdateAction__Group__3__Impl rule__UpdateAction__Group__4
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
    // InternalFeatureLangParser.g:2236:1: rule__UpdateAction__Group__3__Impl : ( ( rule__UpdateAction__AttributeAssignment_3 ) ) ;
    public final void rule__UpdateAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2240:1: ( ( ( rule__UpdateAction__AttributeAssignment_3 ) ) )
            // InternalFeatureLangParser.g:2241:1: ( ( rule__UpdateAction__AttributeAssignment_3 ) )
            {
            // InternalFeatureLangParser.g:2241:1: ( ( rule__UpdateAction__AttributeAssignment_3 ) )
            // InternalFeatureLangParser.g:2242:2: ( rule__UpdateAction__AttributeAssignment_3 )
            {
             before(grammarAccess.getUpdateActionAccess().getAttributeAssignment_3()); 
            // InternalFeatureLangParser.g:2243:2: ( rule__UpdateAction__AttributeAssignment_3 )
            // InternalFeatureLangParser.g:2243:3: rule__UpdateAction__AttributeAssignment_3
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
    // InternalFeatureLangParser.g:2251:1: rule__UpdateAction__Group__4 : rule__UpdateAction__Group__4__Impl rule__UpdateAction__Group__5 ;
    public final void rule__UpdateAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2255:1: ( rule__UpdateAction__Group__4__Impl rule__UpdateAction__Group__5 )
            // InternalFeatureLangParser.g:2256:2: rule__UpdateAction__Group__4__Impl rule__UpdateAction__Group__5
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
    // InternalFeatureLangParser.g:2263:1: rule__UpdateAction__Group__4__Impl : ( FullStop ) ;
    public final void rule__UpdateAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2267:1: ( ( FullStop ) )
            // InternalFeatureLangParser.g:2268:1: ( FullStop )
            {
            // InternalFeatureLangParser.g:2268:1: ( FullStop )
            // InternalFeatureLangParser.g:2269:2: FullStop
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
    // InternalFeatureLangParser.g:2278:1: rule__UpdateAction__Group__5 : rule__UpdateAction__Group__5__Impl rule__UpdateAction__Group__6 ;
    public final void rule__UpdateAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2282:1: ( rule__UpdateAction__Group__5__Impl rule__UpdateAction__Group__6 )
            // InternalFeatureLangParser.g:2283:2: rule__UpdateAction__Group__5__Impl rule__UpdateAction__Group__6
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
    // InternalFeatureLangParser.g:2290:1: rule__UpdateAction__Group__5__Impl : ( It ) ;
    public final void rule__UpdateAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2294:1: ( ( It ) )
            // InternalFeatureLangParser.g:2295:1: ( It )
            {
            // InternalFeatureLangParser.g:2295:1: ( It )
            // InternalFeatureLangParser.g:2296:2: It
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
    // InternalFeatureLangParser.g:2305:1: rule__UpdateAction__Group__6 : rule__UpdateAction__Group__6__Impl rule__UpdateAction__Group__7 ;
    public final void rule__UpdateAction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2309:1: ( rule__UpdateAction__Group__6__Impl rule__UpdateAction__Group__7 )
            // InternalFeatureLangParser.g:2310:2: rule__UpdateAction__Group__6__Impl rule__UpdateAction__Group__7
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
    // InternalFeatureLangParser.g:2317:1: rule__UpdateAction__Group__6__Impl : ( ( rule__UpdateAction__PriorityAssignment_6 ) ) ;
    public final void rule__UpdateAction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2321:1: ( ( ( rule__UpdateAction__PriorityAssignment_6 ) ) )
            // InternalFeatureLangParser.g:2322:1: ( ( rule__UpdateAction__PriorityAssignment_6 ) )
            {
            // InternalFeatureLangParser.g:2322:1: ( ( rule__UpdateAction__PriorityAssignment_6 ) )
            // InternalFeatureLangParser.g:2323:2: ( rule__UpdateAction__PriorityAssignment_6 )
            {
             before(grammarAccess.getUpdateActionAccess().getPriorityAssignment_6()); 
            // InternalFeatureLangParser.g:2324:2: ( rule__UpdateAction__PriorityAssignment_6 )
            // InternalFeatureLangParser.g:2324:3: rule__UpdateAction__PriorityAssignment_6
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
    // InternalFeatureLangParser.g:2332:1: rule__UpdateAction__Group__7 : rule__UpdateAction__Group__7__Impl ;
    public final void rule__UpdateAction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2336:1: ( rule__UpdateAction__Group__7__Impl )
            // InternalFeatureLangParser.g:2337:2: rule__UpdateAction__Group__7__Impl
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
    // InternalFeatureLangParser.g:2343:1: rule__UpdateAction__Group__7__Impl : ( ( rule__UpdateAction__Alternatives_7 ) ) ;
    public final void rule__UpdateAction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2347:1: ( ( ( rule__UpdateAction__Alternatives_7 ) ) )
            // InternalFeatureLangParser.g:2348:1: ( ( rule__UpdateAction__Alternatives_7 ) )
            {
            // InternalFeatureLangParser.g:2348:1: ( ( rule__UpdateAction__Alternatives_7 ) )
            // InternalFeatureLangParser.g:2349:2: ( rule__UpdateAction__Alternatives_7 )
            {
             before(grammarAccess.getUpdateActionAccess().getAlternatives_7()); 
            // InternalFeatureLangParser.g:2350:2: ( rule__UpdateAction__Alternatives_7 )
            // InternalFeatureLangParser.g:2350:3: rule__UpdateAction__Alternatives_7
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
    // InternalFeatureLangParser.g:2359:1: rule__UpdateAttributeDatatype__Group__0 : rule__UpdateAttributeDatatype__Group__0__Impl rule__UpdateAttributeDatatype__Group__1 ;
    public final void rule__UpdateAttributeDatatype__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2363:1: ( rule__UpdateAttributeDatatype__Group__0__Impl rule__UpdateAttributeDatatype__Group__1 )
            // InternalFeatureLangParser.g:2364:2: rule__UpdateAttributeDatatype__Group__0__Impl rule__UpdateAttributeDatatype__Group__1
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
    // InternalFeatureLangParser.g:2371:1: rule__UpdateAttributeDatatype__Group__0__Impl : ( Be ) ;
    public final void rule__UpdateAttributeDatatype__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2375:1: ( ( Be ) )
            // InternalFeatureLangParser.g:2376:1: ( Be )
            {
            // InternalFeatureLangParser.g:2376:1: ( Be )
            // InternalFeatureLangParser.g:2377:2: Be
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
    // InternalFeatureLangParser.g:2386:1: rule__UpdateAttributeDatatype__Group__1 : rule__UpdateAttributeDatatype__Group__1__Impl rule__UpdateAttributeDatatype__Group__2 ;
    public final void rule__UpdateAttributeDatatype__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2390:1: ( rule__UpdateAttributeDatatype__Group__1__Impl rule__UpdateAttributeDatatype__Group__2 )
            // InternalFeatureLangParser.g:2391:2: rule__UpdateAttributeDatatype__Group__1__Impl rule__UpdateAttributeDatatype__Group__2
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
    // InternalFeatureLangParser.g:2398:1: rule__UpdateAttributeDatatype__Group__1__Impl : ( A ) ;
    public final void rule__UpdateAttributeDatatype__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2402:1: ( ( A ) )
            // InternalFeatureLangParser.g:2403:1: ( A )
            {
            // InternalFeatureLangParser.g:2403:1: ( A )
            // InternalFeatureLangParser.g:2404:2: A
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
    // InternalFeatureLangParser.g:2413:1: rule__UpdateAttributeDatatype__Group__2 : rule__UpdateAttributeDatatype__Group__2__Impl rule__UpdateAttributeDatatype__Group__3 ;
    public final void rule__UpdateAttributeDatatype__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2417:1: ( rule__UpdateAttributeDatatype__Group__2__Impl rule__UpdateAttributeDatatype__Group__3 )
            // InternalFeatureLangParser.g:2418:2: rule__UpdateAttributeDatatype__Group__2__Impl rule__UpdateAttributeDatatype__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__UpdateAttributeDatatype__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateAttributeDatatype__Group__3();

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
    // InternalFeatureLangParser.g:2425:1: rule__UpdateAttributeDatatype__Group__2__Impl : ( ( rule__UpdateAttributeDatatype__TypeAssignment_2 ) ) ;
    public final void rule__UpdateAttributeDatatype__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2429:1: ( ( ( rule__UpdateAttributeDatatype__TypeAssignment_2 ) ) )
            // InternalFeatureLangParser.g:2430:1: ( ( rule__UpdateAttributeDatatype__TypeAssignment_2 ) )
            {
            // InternalFeatureLangParser.g:2430:1: ( ( rule__UpdateAttributeDatatype__TypeAssignment_2 ) )
            // InternalFeatureLangParser.g:2431:2: ( rule__UpdateAttributeDatatype__TypeAssignment_2 )
            {
             before(grammarAccess.getUpdateAttributeDatatypeAccess().getTypeAssignment_2()); 
            // InternalFeatureLangParser.g:2432:2: ( rule__UpdateAttributeDatatype__TypeAssignment_2 )
            // InternalFeatureLangParser.g:2432:3: rule__UpdateAttributeDatatype__TypeAssignment_2
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


    // $ANTLR start "rule__UpdateAttributeDatatype__Group__3"
    // InternalFeatureLangParser.g:2440:1: rule__UpdateAttributeDatatype__Group__3 : rule__UpdateAttributeDatatype__Group__3__Impl rule__UpdateAttributeDatatype__Group__4 ;
    public final void rule__UpdateAttributeDatatype__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2444:1: ( rule__UpdateAttributeDatatype__Group__3__Impl rule__UpdateAttributeDatatype__Group__4 )
            // InternalFeatureLangParser.g:2445:2: rule__UpdateAttributeDatatype__Group__3__Impl rule__UpdateAttributeDatatype__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__UpdateAttributeDatatype__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateAttributeDatatype__Group__4();

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
    // $ANTLR end "rule__UpdateAttributeDatatype__Group__3"


    // $ANTLR start "rule__UpdateAttributeDatatype__Group__3__Impl"
    // InternalFeatureLangParser.g:2452:1: rule__UpdateAttributeDatatype__Group__3__Impl : ( Instead ) ;
    public final void rule__UpdateAttributeDatatype__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2456:1: ( ( Instead ) )
            // InternalFeatureLangParser.g:2457:1: ( Instead )
            {
            // InternalFeatureLangParser.g:2457:1: ( Instead )
            // InternalFeatureLangParser.g:2458:2: Instead
            {
             before(grammarAccess.getUpdateAttributeDatatypeAccess().getInsteadKeyword_3()); 
            match(input,Instead,FOLLOW_2); 
             after(grammarAccess.getUpdateAttributeDatatypeAccess().getInsteadKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAttributeDatatype__Group__3__Impl"


    // $ANTLR start "rule__UpdateAttributeDatatype__Group__4"
    // InternalFeatureLangParser.g:2467:1: rule__UpdateAttributeDatatype__Group__4 : rule__UpdateAttributeDatatype__Group__4__Impl rule__UpdateAttributeDatatype__Group__5 ;
    public final void rule__UpdateAttributeDatatype__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2471:1: ( rule__UpdateAttributeDatatype__Group__4__Impl rule__UpdateAttributeDatatype__Group__5 )
            // InternalFeatureLangParser.g:2472:2: rule__UpdateAttributeDatatype__Group__4__Impl rule__UpdateAttributeDatatype__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__UpdateAttributeDatatype__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateAttributeDatatype__Group__5();

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
    // $ANTLR end "rule__UpdateAttributeDatatype__Group__4"


    // $ANTLR start "rule__UpdateAttributeDatatype__Group__4__Impl"
    // InternalFeatureLangParser.g:2479:1: rule__UpdateAttributeDatatype__Group__4__Impl : ( Of ) ;
    public final void rule__UpdateAttributeDatatype__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2483:1: ( ( Of ) )
            // InternalFeatureLangParser.g:2484:1: ( Of )
            {
            // InternalFeatureLangParser.g:2484:1: ( Of )
            // InternalFeatureLangParser.g:2485:2: Of
            {
             before(grammarAccess.getUpdateAttributeDatatypeAccess().getOfKeyword_4()); 
            match(input,Of,FOLLOW_2); 
             after(grammarAccess.getUpdateAttributeDatatypeAccess().getOfKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAttributeDatatype__Group__4__Impl"


    // $ANTLR start "rule__UpdateAttributeDatatype__Group__5"
    // InternalFeatureLangParser.g:2494:1: rule__UpdateAttributeDatatype__Group__5 : rule__UpdateAttributeDatatype__Group__5__Impl ;
    public final void rule__UpdateAttributeDatatype__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2498:1: ( rule__UpdateAttributeDatatype__Group__5__Impl )
            // InternalFeatureLangParser.g:2499:2: rule__UpdateAttributeDatatype__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UpdateAttributeDatatype__Group__5__Impl();

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
    // $ANTLR end "rule__UpdateAttributeDatatype__Group__5"


    // $ANTLR start "rule__UpdateAttributeDatatype__Group__5__Impl"
    // InternalFeatureLangParser.g:2505:1: rule__UpdateAttributeDatatype__Group__5__Impl : ( ( rule__UpdateAttributeDatatype__OldTypeAssignment_5 ) ) ;
    public final void rule__UpdateAttributeDatatype__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2509:1: ( ( ( rule__UpdateAttributeDatatype__OldTypeAssignment_5 ) ) )
            // InternalFeatureLangParser.g:2510:1: ( ( rule__UpdateAttributeDatatype__OldTypeAssignment_5 ) )
            {
            // InternalFeatureLangParser.g:2510:1: ( ( rule__UpdateAttributeDatatype__OldTypeAssignment_5 ) )
            // InternalFeatureLangParser.g:2511:2: ( rule__UpdateAttributeDatatype__OldTypeAssignment_5 )
            {
             before(grammarAccess.getUpdateAttributeDatatypeAccess().getOldTypeAssignment_5()); 
            // InternalFeatureLangParser.g:2512:2: ( rule__UpdateAttributeDatatype__OldTypeAssignment_5 )
            // InternalFeatureLangParser.g:2512:3: rule__UpdateAttributeDatatype__OldTypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__UpdateAttributeDatatype__OldTypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getUpdateAttributeDatatypeAccess().getOldTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAttributeDatatype__Group__5__Impl"


    // $ANTLR start "rule__UpdateAttributeIdentifier__Group__0"
    // InternalFeatureLangParser.g:2521:1: rule__UpdateAttributeIdentifier__Group__0 : rule__UpdateAttributeIdentifier__Group__0__Impl rule__UpdateAttributeIdentifier__Group__1 ;
    public final void rule__UpdateAttributeIdentifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2525:1: ( rule__UpdateAttributeIdentifier__Group__0__Impl rule__UpdateAttributeIdentifier__Group__1 )
            // InternalFeatureLangParser.g:2526:2: rule__UpdateAttributeIdentifier__Group__0__Impl rule__UpdateAttributeIdentifier__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalFeatureLangParser.g:2533:1: rule__UpdateAttributeIdentifier__Group__0__Impl : ( Have ) ;
    public final void rule__UpdateAttributeIdentifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2537:1: ( ( Have ) )
            // InternalFeatureLangParser.g:2538:1: ( Have )
            {
            // InternalFeatureLangParser.g:2538:1: ( Have )
            // InternalFeatureLangParser.g:2539:2: Have
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
    // InternalFeatureLangParser.g:2548:1: rule__UpdateAttributeIdentifier__Group__1 : rule__UpdateAttributeIdentifier__Group__1__Impl rule__UpdateAttributeIdentifier__Group__2 ;
    public final void rule__UpdateAttributeIdentifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2552:1: ( rule__UpdateAttributeIdentifier__Group__1__Impl rule__UpdateAttributeIdentifier__Group__2 )
            // InternalFeatureLangParser.g:2553:2: rule__UpdateAttributeIdentifier__Group__1__Impl rule__UpdateAttributeIdentifier__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalFeatureLangParser.g:2560:1: rule__UpdateAttributeIdentifier__Group__1__Impl : ( ( rule__UpdateAttributeIdentifier__Alternatives_1 )? ) ;
    public final void rule__UpdateAttributeIdentifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2564:1: ( ( ( rule__UpdateAttributeIdentifier__Alternatives_1 )? ) )
            // InternalFeatureLangParser.g:2565:1: ( ( rule__UpdateAttributeIdentifier__Alternatives_1 )? )
            {
            // InternalFeatureLangParser.g:2565:1: ( ( rule__UpdateAttributeIdentifier__Alternatives_1 )? )
            // InternalFeatureLangParser.g:2566:2: ( rule__UpdateAttributeIdentifier__Alternatives_1 )?
            {
             before(grammarAccess.getUpdateAttributeIdentifierAccess().getAlternatives_1()); 
            // InternalFeatureLangParser.g:2567:2: ( rule__UpdateAttributeIdentifier__Alternatives_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==An||LA34_0==A) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalFeatureLangParser.g:2567:3: rule__UpdateAttributeIdentifier__Alternatives_1
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
    // InternalFeatureLangParser.g:2575:1: rule__UpdateAttributeIdentifier__Group__2 : rule__UpdateAttributeIdentifier__Group__2__Impl rule__UpdateAttributeIdentifier__Group__3 ;
    public final void rule__UpdateAttributeIdentifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2579:1: ( rule__UpdateAttributeIdentifier__Group__2__Impl rule__UpdateAttributeIdentifier__Group__3 )
            // InternalFeatureLangParser.g:2580:2: rule__UpdateAttributeIdentifier__Group__2__Impl rule__UpdateAttributeIdentifier__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__UpdateAttributeIdentifier__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateAttributeIdentifier__Group__3();

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
    // InternalFeatureLangParser.g:2587:1: rule__UpdateAttributeIdentifier__Group__2__Impl : ( ( rule__UpdateAttributeIdentifier__IdentifierAssignment_2 ) ) ;
    public final void rule__UpdateAttributeIdentifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2591:1: ( ( ( rule__UpdateAttributeIdentifier__IdentifierAssignment_2 ) ) )
            // InternalFeatureLangParser.g:2592:1: ( ( rule__UpdateAttributeIdentifier__IdentifierAssignment_2 ) )
            {
            // InternalFeatureLangParser.g:2592:1: ( ( rule__UpdateAttributeIdentifier__IdentifierAssignment_2 ) )
            // InternalFeatureLangParser.g:2593:2: ( rule__UpdateAttributeIdentifier__IdentifierAssignment_2 )
            {
             before(grammarAccess.getUpdateAttributeIdentifierAccess().getIdentifierAssignment_2()); 
            // InternalFeatureLangParser.g:2594:2: ( rule__UpdateAttributeIdentifier__IdentifierAssignment_2 )
            // InternalFeatureLangParser.g:2594:3: rule__UpdateAttributeIdentifier__IdentifierAssignment_2
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


    // $ANTLR start "rule__UpdateAttributeIdentifier__Group__3"
    // InternalFeatureLangParser.g:2602:1: rule__UpdateAttributeIdentifier__Group__3 : rule__UpdateAttributeIdentifier__Group__3__Impl rule__UpdateAttributeIdentifier__Group__4 ;
    public final void rule__UpdateAttributeIdentifier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2606:1: ( rule__UpdateAttributeIdentifier__Group__3__Impl rule__UpdateAttributeIdentifier__Group__4 )
            // InternalFeatureLangParser.g:2607:2: rule__UpdateAttributeIdentifier__Group__3__Impl rule__UpdateAttributeIdentifier__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__UpdateAttributeIdentifier__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateAttributeIdentifier__Group__4();

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
    // $ANTLR end "rule__UpdateAttributeIdentifier__Group__3"


    // $ANTLR start "rule__UpdateAttributeIdentifier__Group__3__Impl"
    // InternalFeatureLangParser.g:2614:1: rule__UpdateAttributeIdentifier__Group__3__Impl : ( Instead ) ;
    public final void rule__UpdateAttributeIdentifier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2618:1: ( ( Instead ) )
            // InternalFeatureLangParser.g:2619:1: ( Instead )
            {
            // InternalFeatureLangParser.g:2619:1: ( Instead )
            // InternalFeatureLangParser.g:2620:2: Instead
            {
             before(grammarAccess.getUpdateAttributeIdentifierAccess().getInsteadKeyword_3()); 
            match(input,Instead,FOLLOW_2); 
             after(grammarAccess.getUpdateAttributeIdentifierAccess().getInsteadKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAttributeIdentifier__Group__3__Impl"


    // $ANTLR start "rule__UpdateAttributeIdentifier__Group__4"
    // InternalFeatureLangParser.g:2629:1: rule__UpdateAttributeIdentifier__Group__4 : rule__UpdateAttributeIdentifier__Group__4__Impl rule__UpdateAttributeIdentifier__Group__5 ;
    public final void rule__UpdateAttributeIdentifier__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2633:1: ( rule__UpdateAttributeIdentifier__Group__4__Impl rule__UpdateAttributeIdentifier__Group__5 )
            // InternalFeatureLangParser.g:2634:2: rule__UpdateAttributeIdentifier__Group__4__Impl rule__UpdateAttributeIdentifier__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__UpdateAttributeIdentifier__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateAttributeIdentifier__Group__5();

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
    // $ANTLR end "rule__UpdateAttributeIdentifier__Group__4"


    // $ANTLR start "rule__UpdateAttributeIdentifier__Group__4__Impl"
    // InternalFeatureLangParser.g:2641:1: rule__UpdateAttributeIdentifier__Group__4__Impl : ( Of ) ;
    public final void rule__UpdateAttributeIdentifier__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2645:1: ( ( Of ) )
            // InternalFeatureLangParser.g:2646:1: ( Of )
            {
            // InternalFeatureLangParser.g:2646:1: ( Of )
            // InternalFeatureLangParser.g:2647:2: Of
            {
             before(grammarAccess.getUpdateAttributeIdentifierAccess().getOfKeyword_4()); 
            match(input,Of,FOLLOW_2); 
             after(grammarAccess.getUpdateAttributeIdentifierAccess().getOfKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAttributeIdentifier__Group__4__Impl"


    // $ANTLR start "rule__UpdateAttributeIdentifier__Group__5"
    // InternalFeatureLangParser.g:2656:1: rule__UpdateAttributeIdentifier__Group__5 : rule__UpdateAttributeIdentifier__Group__5__Impl ;
    public final void rule__UpdateAttributeIdentifier__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2660:1: ( rule__UpdateAttributeIdentifier__Group__5__Impl )
            // InternalFeatureLangParser.g:2661:2: rule__UpdateAttributeIdentifier__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UpdateAttributeIdentifier__Group__5__Impl();

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
    // $ANTLR end "rule__UpdateAttributeIdentifier__Group__5"


    // $ANTLR start "rule__UpdateAttributeIdentifier__Group__5__Impl"
    // InternalFeatureLangParser.g:2667:1: rule__UpdateAttributeIdentifier__Group__5__Impl : ( ( rule__UpdateAttributeIdentifier__OldIdentifierAssignment_5 ) ) ;
    public final void rule__UpdateAttributeIdentifier__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2671:1: ( ( ( rule__UpdateAttributeIdentifier__OldIdentifierAssignment_5 ) ) )
            // InternalFeatureLangParser.g:2672:1: ( ( rule__UpdateAttributeIdentifier__OldIdentifierAssignment_5 ) )
            {
            // InternalFeatureLangParser.g:2672:1: ( ( rule__UpdateAttributeIdentifier__OldIdentifierAssignment_5 ) )
            // InternalFeatureLangParser.g:2673:2: ( rule__UpdateAttributeIdentifier__OldIdentifierAssignment_5 )
            {
             before(grammarAccess.getUpdateAttributeIdentifierAccess().getOldIdentifierAssignment_5()); 
            // InternalFeatureLangParser.g:2674:2: ( rule__UpdateAttributeIdentifier__OldIdentifierAssignment_5 )
            // InternalFeatureLangParser.g:2674:3: rule__UpdateAttributeIdentifier__OldIdentifierAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__UpdateAttributeIdentifier__OldIdentifierAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getUpdateAttributeIdentifierAccess().getOldIdentifierAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAttributeIdentifier__Group__5__Impl"


    // $ANTLR start "rule__UpdateAttributeValue__Group__0"
    // InternalFeatureLangParser.g:2683:1: rule__UpdateAttributeValue__Group__0 : rule__UpdateAttributeValue__Group__0__Impl rule__UpdateAttributeValue__Group__1 ;
    public final void rule__UpdateAttributeValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2687:1: ( rule__UpdateAttributeValue__Group__0__Impl rule__UpdateAttributeValue__Group__1 )
            // InternalFeatureLangParser.g:2688:2: rule__UpdateAttributeValue__Group__0__Impl rule__UpdateAttributeValue__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalFeatureLangParser.g:2695:1: rule__UpdateAttributeValue__Group__0__Impl : ( Have ) ;
    public final void rule__UpdateAttributeValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2699:1: ( ( Have ) )
            // InternalFeatureLangParser.g:2700:1: ( Have )
            {
            // InternalFeatureLangParser.g:2700:1: ( Have )
            // InternalFeatureLangParser.g:2701:2: Have
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
    // InternalFeatureLangParser.g:2710:1: rule__UpdateAttributeValue__Group__1 : rule__UpdateAttributeValue__Group__1__Impl rule__UpdateAttributeValue__Group__2 ;
    public final void rule__UpdateAttributeValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2714:1: ( rule__UpdateAttributeValue__Group__1__Impl rule__UpdateAttributeValue__Group__2 )
            // InternalFeatureLangParser.g:2715:2: rule__UpdateAttributeValue__Group__1__Impl rule__UpdateAttributeValue__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalFeatureLangParser.g:2722:1: rule__UpdateAttributeValue__Group__1__Impl : ( ( A )? ) ;
    public final void rule__UpdateAttributeValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2726:1: ( ( ( A )? ) )
            // InternalFeatureLangParser.g:2727:1: ( ( A )? )
            {
            // InternalFeatureLangParser.g:2727:1: ( ( A )? )
            // InternalFeatureLangParser.g:2728:2: ( A )?
            {
             before(grammarAccess.getUpdateAttributeValueAccess().getAKeyword_1()); 
            // InternalFeatureLangParser.g:2729:2: ( A )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==A) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalFeatureLangParser.g:2729:3: A
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
    // InternalFeatureLangParser.g:2737:1: rule__UpdateAttributeValue__Group__2 : rule__UpdateAttributeValue__Group__2__Impl rule__UpdateAttributeValue__Group__3 ;
    public final void rule__UpdateAttributeValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2741:1: ( rule__UpdateAttributeValue__Group__2__Impl rule__UpdateAttributeValue__Group__3 )
            // InternalFeatureLangParser.g:2742:2: rule__UpdateAttributeValue__Group__2__Impl rule__UpdateAttributeValue__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalFeatureLangParser.g:2749:1: rule__UpdateAttributeValue__Group__2__Impl : ( Value ) ;
    public final void rule__UpdateAttributeValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2753:1: ( ( Value ) )
            // InternalFeatureLangParser.g:2754:1: ( Value )
            {
            // InternalFeatureLangParser.g:2754:1: ( Value )
            // InternalFeatureLangParser.g:2755:2: Value
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
    // InternalFeatureLangParser.g:2764:1: rule__UpdateAttributeValue__Group__3 : rule__UpdateAttributeValue__Group__3__Impl rule__UpdateAttributeValue__Group__4 ;
    public final void rule__UpdateAttributeValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2768:1: ( rule__UpdateAttributeValue__Group__3__Impl rule__UpdateAttributeValue__Group__4 )
            // InternalFeatureLangParser.g:2769:2: rule__UpdateAttributeValue__Group__3__Impl rule__UpdateAttributeValue__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__UpdateAttributeValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateAttributeValue__Group__4();

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
    // InternalFeatureLangParser.g:2776:1: rule__UpdateAttributeValue__Group__3__Impl : ( ( rule__UpdateAttributeValue__ValueAssignment_3 ) ) ;
    public final void rule__UpdateAttributeValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2780:1: ( ( ( rule__UpdateAttributeValue__ValueAssignment_3 ) ) )
            // InternalFeatureLangParser.g:2781:1: ( ( rule__UpdateAttributeValue__ValueAssignment_3 ) )
            {
            // InternalFeatureLangParser.g:2781:1: ( ( rule__UpdateAttributeValue__ValueAssignment_3 ) )
            // InternalFeatureLangParser.g:2782:2: ( rule__UpdateAttributeValue__ValueAssignment_3 )
            {
             before(grammarAccess.getUpdateAttributeValueAccess().getValueAssignment_3()); 
            // InternalFeatureLangParser.g:2783:2: ( rule__UpdateAttributeValue__ValueAssignment_3 )
            // InternalFeatureLangParser.g:2783:3: rule__UpdateAttributeValue__ValueAssignment_3
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


    // $ANTLR start "rule__UpdateAttributeValue__Group__4"
    // InternalFeatureLangParser.g:2791:1: rule__UpdateAttributeValue__Group__4 : rule__UpdateAttributeValue__Group__4__Impl rule__UpdateAttributeValue__Group__5 ;
    public final void rule__UpdateAttributeValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2795:1: ( rule__UpdateAttributeValue__Group__4__Impl rule__UpdateAttributeValue__Group__5 )
            // InternalFeatureLangParser.g:2796:2: rule__UpdateAttributeValue__Group__4__Impl rule__UpdateAttributeValue__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__UpdateAttributeValue__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateAttributeValue__Group__5();

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
    // $ANTLR end "rule__UpdateAttributeValue__Group__4"


    // $ANTLR start "rule__UpdateAttributeValue__Group__4__Impl"
    // InternalFeatureLangParser.g:2803:1: rule__UpdateAttributeValue__Group__4__Impl : ( Instead ) ;
    public final void rule__UpdateAttributeValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2807:1: ( ( Instead ) )
            // InternalFeatureLangParser.g:2808:1: ( Instead )
            {
            // InternalFeatureLangParser.g:2808:1: ( Instead )
            // InternalFeatureLangParser.g:2809:2: Instead
            {
             before(grammarAccess.getUpdateAttributeValueAccess().getInsteadKeyword_4()); 
            match(input,Instead,FOLLOW_2); 
             after(grammarAccess.getUpdateAttributeValueAccess().getInsteadKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAttributeValue__Group__4__Impl"


    // $ANTLR start "rule__UpdateAttributeValue__Group__5"
    // InternalFeatureLangParser.g:2818:1: rule__UpdateAttributeValue__Group__5 : rule__UpdateAttributeValue__Group__5__Impl rule__UpdateAttributeValue__Group__6 ;
    public final void rule__UpdateAttributeValue__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2822:1: ( rule__UpdateAttributeValue__Group__5__Impl rule__UpdateAttributeValue__Group__6 )
            // InternalFeatureLangParser.g:2823:2: rule__UpdateAttributeValue__Group__5__Impl rule__UpdateAttributeValue__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__UpdateAttributeValue__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateAttributeValue__Group__6();

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
    // $ANTLR end "rule__UpdateAttributeValue__Group__5"


    // $ANTLR start "rule__UpdateAttributeValue__Group__5__Impl"
    // InternalFeatureLangParser.g:2830:1: rule__UpdateAttributeValue__Group__5__Impl : ( Of ) ;
    public final void rule__UpdateAttributeValue__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2834:1: ( ( Of ) )
            // InternalFeatureLangParser.g:2835:1: ( Of )
            {
            // InternalFeatureLangParser.g:2835:1: ( Of )
            // InternalFeatureLangParser.g:2836:2: Of
            {
             before(grammarAccess.getUpdateAttributeValueAccess().getOfKeyword_5()); 
            match(input,Of,FOLLOW_2); 
             after(grammarAccess.getUpdateAttributeValueAccess().getOfKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAttributeValue__Group__5__Impl"


    // $ANTLR start "rule__UpdateAttributeValue__Group__6"
    // InternalFeatureLangParser.g:2845:1: rule__UpdateAttributeValue__Group__6 : rule__UpdateAttributeValue__Group__6__Impl ;
    public final void rule__UpdateAttributeValue__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2849:1: ( rule__UpdateAttributeValue__Group__6__Impl )
            // InternalFeatureLangParser.g:2850:2: rule__UpdateAttributeValue__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UpdateAttributeValue__Group__6__Impl();

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
    // $ANTLR end "rule__UpdateAttributeValue__Group__6"


    // $ANTLR start "rule__UpdateAttributeValue__Group__6__Impl"
    // InternalFeatureLangParser.g:2856:1: rule__UpdateAttributeValue__Group__6__Impl : ( ( rule__UpdateAttributeValue__OldValueAssignment_6 ) ) ;
    public final void rule__UpdateAttributeValue__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2860:1: ( ( ( rule__UpdateAttributeValue__OldValueAssignment_6 ) ) )
            // InternalFeatureLangParser.g:2861:1: ( ( rule__UpdateAttributeValue__OldValueAssignment_6 ) )
            {
            // InternalFeatureLangParser.g:2861:1: ( ( rule__UpdateAttributeValue__OldValueAssignment_6 ) )
            // InternalFeatureLangParser.g:2862:2: ( rule__UpdateAttributeValue__OldValueAssignment_6 )
            {
             before(grammarAccess.getUpdateAttributeValueAccess().getOldValueAssignment_6()); 
            // InternalFeatureLangParser.g:2863:2: ( rule__UpdateAttributeValue__OldValueAssignment_6 )
            // InternalFeatureLangParser.g:2863:3: rule__UpdateAttributeValue__OldValueAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__UpdateAttributeValue__OldValueAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getUpdateAttributeValueAccess().getOldValueAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAttributeValue__Group__6__Impl"


    // $ANTLR start "rule__AttributeAction__Group__0"
    // InternalFeatureLangParser.g:2872:1: rule__AttributeAction__Group__0 : rule__AttributeAction__Group__0__Impl rule__AttributeAction__Group__1 ;
    public final void rule__AttributeAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2876:1: ( rule__AttributeAction__Group__0__Impl rule__AttributeAction__Group__1 )
            // InternalFeatureLangParser.g:2877:2: rule__AttributeAction__Group__0__Impl rule__AttributeAction__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalFeatureLangParser.g:2884:1: rule__AttributeAction__Group__0__Impl : ( ( Have )? ) ;
    public final void rule__AttributeAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2888:1: ( ( ( Have )? ) )
            // InternalFeatureLangParser.g:2889:1: ( ( Have )? )
            {
            // InternalFeatureLangParser.g:2889:1: ( ( Have )? )
            // InternalFeatureLangParser.g:2890:2: ( Have )?
            {
             before(grammarAccess.getAttributeActionAccess().getHaveKeyword_0()); 
            // InternalFeatureLangParser.g:2891:2: ( Have )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Have) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalFeatureLangParser.g:2891:3: Have
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
    // InternalFeatureLangParser.g:2899:1: rule__AttributeAction__Group__1 : rule__AttributeAction__Group__1__Impl rule__AttributeAction__Group__2 ;
    public final void rule__AttributeAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2903:1: ( rule__AttributeAction__Group__1__Impl rule__AttributeAction__Group__2 )
            // InternalFeatureLangParser.g:2904:2: rule__AttributeAction__Group__1__Impl rule__AttributeAction__Group__2
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
    // InternalFeatureLangParser.g:2911:1: rule__AttributeAction__Group__1__Impl : ( ( rule__AttributeAction__Alternatives_1 ) ) ;
    public final void rule__AttributeAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2915:1: ( ( ( rule__AttributeAction__Alternatives_1 ) ) )
            // InternalFeatureLangParser.g:2916:1: ( ( rule__AttributeAction__Alternatives_1 ) )
            {
            // InternalFeatureLangParser.g:2916:1: ( ( rule__AttributeAction__Alternatives_1 ) )
            // InternalFeatureLangParser.g:2917:2: ( rule__AttributeAction__Alternatives_1 )
            {
             before(grammarAccess.getAttributeActionAccess().getAlternatives_1()); 
            // InternalFeatureLangParser.g:2918:2: ( rule__AttributeAction__Alternatives_1 )
            // InternalFeatureLangParser.g:2918:3: rule__AttributeAction__Alternatives_1
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
    // InternalFeatureLangParser.g:2926:1: rule__AttributeAction__Group__2 : rule__AttributeAction__Group__2__Impl rule__AttributeAction__Group__3 ;
    public final void rule__AttributeAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2930:1: ( rule__AttributeAction__Group__2__Impl rule__AttributeAction__Group__3 )
            // InternalFeatureLangParser.g:2931:2: rule__AttributeAction__Group__2__Impl rule__AttributeAction__Group__3
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
    // InternalFeatureLangParser.g:2938:1: rule__AttributeAction__Group__2__Impl : ( ( rule__AttributeAction__AttributeAssignment_2 ) ) ;
    public final void rule__AttributeAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2942:1: ( ( ( rule__AttributeAction__AttributeAssignment_2 ) ) )
            // InternalFeatureLangParser.g:2943:1: ( ( rule__AttributeAction__AttributeAssignment_2 ) )
            {
            // InternalFeatureLangParser.g:2943:1: ( ( rule__AttributeAction__AttributeAssignment_2 ) )
            // InternalFeatureLangParser.g:2944:2: ( rule__AttributeAction__AttributeAssignment_2 )
            {
             before(grammarAccess.getAttributeActionAccess().getAttributeAssignment_2()); 
            // InternalFeatureLangParser.g:2945:2: ( rule__AttributeAction__AttributeAssignment_2 )
            // InternalFeatureLangParser.g:2945:3: rule__AttributeAction__AttributeAssignment_2
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
    // InternalFeatureLangParser.g:2953:1: rule__AttributeAction__Group__3 : rule__AttributeAction__Group__3__Impl rule__AttributeAction__Group__4 ;
    public final void rule__AttributeAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2957:1: ( rule__AttributeAction__Group__3__Impl rule__AttributeAction__Group__4 )
            // InternalFeatureLangParser.g:2958:2: rule__AttributeAction__Group__3__Impl rule__AttributeAction__Group__4
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
    // InternalFeatureLangParser.g:2965:1: rule__AttributeAction__Group__3__Impl : ( ( rule__AttributeAction__Group_3__0 )? ) ;
    public final void rule__AttributeAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2969:1: ( ( ( rule__AttributeAction__Group_3__0 )? ) )
            // InternalFeatureLangParser.g:2970:1: ( ( rule__AttributeAction__Group_3__0 )? )
            {
            // InternalFeatureLangParser.g:2970:1: ( ( rule__AttributeAction__Group_3__0 )? )
            // InternalFeatureLangParser.g:2971:2: ( rule__AttributeAction__Group_3__0 )?
            {
             before(grammarAccess.getAttributeActionAccess().getGroup_3()); 
            // InternalFeatureLangParser.g:2972:2: ( rule__AttributeAction__Group_3__0 )?
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
                    // InternalFeatureLangParser.g:2972:3: rule__AttributeAction__Group_3__0
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
    // InternalFeatureLangParser.g:2980:1: rule__AttributeAction__Group__4 : rule__AttributeAction__Group__4__Impl ;
    public final void rule__AttributeAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2984:1: ( rule__AttributeAction__Group__4__Impl )
            // InternalFeatureLangParser.g:2985:2: rule__AttributeAction__Group__4__Impl
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
    // InternalFeatureLangParser.g:2991:1: rule__AttributeAction__Group__4__Impl : ( ( rule__AttributeAction__Group_4__0 )? ) ;
    public final void rule__AttributeAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2995:1: ( ( ( rule__AttributeAction__Group_4__0 )? ) )
            // InternalFeatureLangParser.g:2996:1: ( ( rule__AttributeAction__Group_4__0 )? )
            {
            // InternalFeatureLangParser.g:2996:1: ( ( rule__AttributeAction__Group_4__0 )? )
            // InternalFeatureLangParser.g:2997:2: ( rule__AttributeAction__Group_4__0 )?
            {
             before(grammarAccess.getAttributeActionAccess().getGroup_4()); 
            // InternalFeatureLangParser.g:2998:2: ( rule__AttributeAction__Group_4__0 )?
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
                    // InternalFeatureLangParser.g:2998:3: rule__AttributeAction__Group_4__0
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
    // InternalFeatureLangParser.g:3007:1: rule__AttributeAction__Group_3__0 : rule__AttributeAction__Group_3__0__Impl rule__AttributeAction__Group_3__1 ;
    public final void rule__AttributeAction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3011:1: ( rule__AttributeAction__Group_3__0__Impl rule__AttributeAction__Group_3__1 )
            // InternalFeatureLangParser.g:3012:2: rule__AttributeAction__Group_3__0__Impl rule__AttributeAction__Group_3__1
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
    // InternalFeatureLangParser.g:3019:1: rule__AttributeAction__Group_3__0__Impl : ( FullStop ) ;
    public final void rule__AttributeAction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3023:1: ( ( FullStop ) )
            // InternalFeatureLangParser.g:3024:1: ( FullStop )
            {
            // InternalFeatureLangParser.g:3024:1: ( FullStop )
            // InternalFeatureLangParser.g:3025:2: FullStop
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
    // InternalFeatureLangParser.g:3034:1: rule__AttributeAction__Group_3__1 : rule__AttributeAction__Group_3__1__Impl rule__AttributeAction__Group_3__2 ;
    public final void rule__AttributeAction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3038:1: ( rule__AttributeAction__Group_3__1__Impl rule__AttributeAction__Group_3__2 )
            // InternalFeatureLangParser.g:3039:2: rule__AttributeAction__Group_3__1__Impl rule__AttributeAction__Group_3__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalFeatureLangParser.g:3046:1: rule__AttributeAction__Group_3__1__Impl : ( It ) ;
    public final void rule__AttributeAction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3050:1: ( ( It ) )
            // InternalFeatureLangParser.g:3051:1: ( It )
            {
            // InternalFeatureLangParser.g:3051:1: ( It )
            // InternalFeatureLangParser.g:3052:2: It
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
    // InternalFeatureLangParser.g:3061:1: rule__AttributeAction__Group_3__2 : rule__AttributeAction__Group_3__2__Impl rule__AttributeAction__Group_3__3 ;
    public final void rule__AttributeAction__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3065:1: ( rule__AttributeAction__Group_3__2__Impl rule__AttributeAction__Group_3__3 )
            // InternalFeatureLangParser.g:3066:2: rule__AttributeAction__Group_3__2__Impl rule__AttributeAction__Group_3__3
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
    // InternalFeatureLangParser.g:3073:1: rule__AttributeAction__Group_3__2__Impl : ( Is ) ;
    public final void rule__AttributeAction__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3077:1: ( ( Is ) )
            // InternalFeatureLangParser.g:3078:1: ( Is )
            {
            // InternalFeatureLangParser.g:3078:1: ( Is )
            // InternalFeatureLangParser.g:3079:2: Is
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
    // InternalFeatureLangParser.g:3088:1: rule__AttributeAction__Group_3__3 : rule__AttributeAction__Group_3__3__Impl rule__AttributeAction__Group_3__4 ;
    public final void rule__AttributeAction__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3092:1: ( rule__AttributeAction__Group_3__3__Impl rule__AttributeAction__Group_3__4 )
            // InternalFeatureLangParser.g:3093:2: rule__AttributeAction__Group_3__3__Impl rule__AttributeAction__Group_3__4
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
    // InternalFeatureLangParser.g:3100:1: rule__AttributeAction__Group_3__3__Impl : ( A ) ;
    public final void rule__AttributeAction__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3104:1: ( ( A ) )
            // InternalFeatureLangParser.g:3105:1: ( A )
            {
            // InternalFeatureLangParser.g:3105:1: ( A )
            // InternalFeatureLangParser.g:3106:2: A
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
    // InternalFeatureLangParser.g:3115:1: rule__AttributeAction__Group_3__4 : rule__AttributeAction__Group_3__4__Impl ;
    public final void rule__AttributeAction__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3119:1: ( rule__AttributeAction__Group_3__4__Impl )
            // InternalFeatureLangParser.g:3120:2: rule__AttributeAction__Group_3__4__Impl
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
    // InternalFeatureLangParser.g:3126:1: rule__AttributeAction__Group_3__4__Impl : ( ( rule__AttributeAction__TypeAssignment_3_4 ) ) ;
    public final void rule__AttributeAction__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3130:1: ( ( ( rule__AttributeAction__TypeAssignment_3_4 ) ) )
            // InternalFeatureLangParser.g:3131:1: ( ( rule__AttributeAction__TypeAssignment_3_4 ) )
            {
            // InternalFeatureLangParser.g:3131:1: ( ( rule__AttributeAction__TypeAssignment_3_4 ) )
            // InternalFeatureLangParser.g:3132:2: ( rule__AttributeAction__TypeAssignment_3_4 )
            {
             before(grammarAccess.getAttributeActionAccess().getTypeAssignment_3_4()); 
            // InternalFeatureLangParser.g:3133:2: ( rule__AttributeAction__TypeAssignment_3_4 )
            // InternalFeatureLangParser.g:3133:3: rule__AttributeAction__TypeAssignment_3_4
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
    // InternalFeatureLangParser.g:3142:1: rule__AttributeAction__Group_4__0 : rule__AttributeAction__Group_4__0__Impl rule__AttributeAction__Group_4__1 ;
    public final void rule__AttributeAction__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3146:1: ( rule__AttributeAction__Group_4__0__Impl rule__AttributeAction__Group_4__1 )
            // InternalFeatureLangParser.g:3147:2: rule__AttributeAction__Group_4__0__Impl rule__AttributeAction__Group_4__1
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
    // InternalFeatureLangParser.g:3154:1: rule__AttributeAction__Group_4__0__Impl : ( FullStop ) ;
    public final void rule__AttributeAction__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3158:1: ( ( FullStop ) )
            // InternalFeatureLangParser.g:3159:1: ( FullStop )
            {
            // InternalFeatureLangParser.g:3159:1: ( FullStop )
            // InternalFeatureLangParser.g:3160:2: FullStop
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
    // InternalFeatureLangParser.g:3169:1: rule__AttributeAction__Group_4__1 : rule__AttributeAction__Group_4__1__Impl rule__AttributeAction__Group_4__2 ;
    public final void rule__AttributeAction__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3173:1: ( rule__AttributeAction__Group_4__1__Impl rule__AttributeAction__Group_4__2 )
            // InternalFeatureLangParser.g:3174:2: rule__AttributeAction__Group_4__1__Impl rule__AttributeAction__Group_4__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalFeatureLangParser.g:3181:1: rule__AttributeAction__Group_4__1__Impl : ( It ) ;
    public final void rule__AttributeAction__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3185:1: ( ( It ) )
            // InternalFeatureLangParser.g:3186:1: ( It )
            {
            // InternalFeatureLangParser.g:3186:1: ( It )
            // InternalFeatureLangParser.g:3187:2: It
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
    // InternalFeatureLangParser.g:3196:1: rule__AttributeAction__Group_4__2 : rule__AttributeAction__Group_4__2__Impl rule__AttributeAction__Group_4__3 ;
    public final void rule__AttributeAction__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3200:1: ( rule__AttributeAction__Group_4__2__Impl rule__AttributeAction__Group_4__3 )
            // InternalFeatureLangParser.g:3201:2: rule__AttributeAction__Group_4__2__Impl rule__AttributeAction__Group_4__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalFeatureLangParser.g:3208:1: rule__AttributeAction__Group_4__2__Impl : ( Has ) ;
    public final void rule__AttributeAction__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3212:1: ( ( Has ) )
            // InternalFeatureLangParser.g:3213:1: ( Has )
            {
            // InternalFeatureLangParser.g:3213:1: ( Has )
            // InternalFeatureLangParser.g:3214:2: Has
            {
             before(grammarAccess.getAttributeActionAccess().getHasKeyword_4_2()); 
            match(input,Has,FOLLOW_2); 
             after(grammarAccess.getAttributeActionAccess().getHasKeyword_4_2()); 

            }


            }

        }
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
    // InternalFeatureLangParser.g:3223:1: rule__AttributeAction__Group_4__3 : rule__AttributeAction__Group_4__3__Impl rule__AttributeAction__Group_4__4 ;
    public final void rule__AttributeAction__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3227:1: ( rule__AttributeAction__Group_4__3__Impl rule__AttributeAction__Group_4__4 )
            // InternalFeatureLangParser.g:3228:2: rule__AttributeAction__Group_4__3__Impl rule__AttributeAction__Group_4__4
            {
            pushFollow(FOLLOW_21);
            rule__AttributeAction__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeAction__Group_4__4();

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
    // InternalFeatureLangParser.g:3235:1: rule__AttributeAction__Group_4__3__Impl : ( ( A )? ) ;
    public final void rule__AttributeAction__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3239:1: ( ( ( A )? ) )
            // InternalFeatureLangParser.g:3240:1: ( ( A )? )
            {
            // InternalFeatureLangParser.g:3240:1: ( ( A )? )
            // InternalFeatureLangParser.g:3241:2: ( A )?
            {
             before(grammarAccess.getAttributeActionAccess().getAKeyword_4_3()); 
            // InternalFeatureLangParser.g:3242:2: ( A )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==A) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalFeatureLangParser.g:3242:3: A
                    {
                    match(input,A,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getAttributeActionAccess().getAKeyword_4_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__AttributeAction__Group_4__4"
    // InternalFeatureLangParser.g:3250:1: rule__AttributeAction__Group_4__4 : rule__AttributeAction__Group_4__4__Impl rule__AttributeAction__Group_4__5 ;
    public final void rule__AttributeAction__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3254:1: ( rule__AttributeAction__Group_4__4__Impl rule__AttributeAction__Group_4__5 )
            // InternalFeatureLangParser.g:3255:2: rule__AttributeAction__Group_4__4__Impl rule__AttributeAction__Group_4__5
            {
            pushFollow(FOLLOW_22);
            rule__AttributeAction__Group_4__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeAction__Group_4__5();

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
    // $ANTLR end "rule__AttributeAction__Group_4__4"


    // $ANTLR start "rule__AttributeAction__Group_4__4__Impl"
    // InternalFeatureLangParser.g:3262:1: rule__AttributeAction__Group_4__4__Impl : ( Value ) ;
    public final void rule__AttributeAction__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3266:1: ( ( Value ) )
            // InternalFeatureLangParser.g:3267:1: ( Value )
            {
            // InternalFeatureLangParser.g:3267:1: ( Value )
            // InternalFeatureLangParser.g:3268:2: Value
            {
             before(grammarAccess.getAttributeActionAccess().getValueKeyword_4_4()); 
            match(input,Value,FOLLOW_2); 
             after(grammarAccess.getAttributeActionAccess().getValueKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAction__Group_4__4__Impl"


    // $ANTLR start "rule__AttributeAction__Group_4__5"
    // InternalFeatureLangParser.g:3277:1: rule__AttributeAction__Group_4__5 : rule__AttributeAction__Group_4__5__Impl ;
    public final void rule__AttributeAction__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3281:1: ( rule__AttributeAction__Group_4__5__Impl )
            // InternalFeatureLangParser.g:3282:2: rule__AttributeAction__Group_4__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeAction__Group_4__5__Impl();

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
    // $ANTLR end "rule__AttributeAction__Group_4__5"


    // $ANTLR start "rule__AttributeAction__Group_4__5__Impl"
    // InternalFeatureLangParser.g:3288:1: rule__AttributeAction__Group_4__5__Impl : ( ( rule__AttributeAction__ValueAssignment_4_5 ) ) ;
    public final void rule__AttributeAction__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3292:1: ( ( ( rule__AttributeAction__ValueAssignment_4_5 ) ) )
            // InternalFeatureLangParser.g:3293:1: ( ( rule__AttributeAction__ValueAssignment_4_5 ) )
            {
            // InternalFeatureLangParser.g:3293:1: ( ( rule__AttributeAction__ValueAssignment_4_5 ) )
            // InternalFeatureLangParser.g:3294:2: ( rule__AttributeAction__ValueAssignment_4_5 )
            {
             before(grammarAccess.getAttributeActionAccess().getValueAssignment_4_5()); 
            // InternalFeatureLangParser.g:3295:2: ( rule__AttributeAction__ValueAssignment_4_5 )
            // InternalFeatureLangParser.g:3295:3: rule__AttributeAction__ValueAssignment_4_5
            {
            pushFollow(FOLLOW_2);
            rule__AttributeAction__ValueAssignment_4_5();

            state._fsp--;


            }

             after(grammarAccess.getAttributeActionAccess().getValueAssignment_4_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAction__Group_4__5__Impl"


    // $ANTLR start "rule__AssociationAction__Group__0"
    // InternalFeatureLangParser.g:3304:1: rule__AssociationAction__Group__0 : rule__AssociationAction__Group__0__Impl rule__AssociationAction__Group__1 ;
    public final void rule__AssociationAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3308:1: ( rule__AssociationAction__Group__0__Impl rule__AssociationAction__Group__1 )
            // InternalFeatureLangParser.g:3309:2: rule__AssociationAction__Group__0__Impl rule__AssociationAction__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalFeatureLangParser.g:3316:1: rule__AssociationAction__Group__0__Impl : ( ( Have )? ) ;
    public final void rule__AssociationAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3320:1: ( ( ( Have )? ) )
            // InternalFeatureLangParser.g:3321:1: ( ( Have )? )
            {
            // InternalFeatureLangParser.g:3321:1: ( ( Have )? )
            // InternalFeatureLangParser.g:3322:2: ( Have )?
            {
             before(grammarAccess.getAssociationActionAccess().getHaveKeyword_0()); 
            // InternalFeatureLangParser.g:3323:2: ( Have )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==Have) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalFeatureLangParser.g:3323:3: Have
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
    // InternalFeatureLangParser.g:3331:1: rule__AssociationAction__Group__1 : rule__AssociationAction__Group__1__Impl rule__AssociationAction__Group__2 ;
    public final void rule__AssociationAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3335:1: ( rule__AssociationAction__Group__1__Impl rule__AssociationAction__Group__2 )
            // InternalFeatureLangParser.g:3336:2: rule__AssociationAction__Group__1__Impl rule__AssociationAction__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalFeatureLangParser.g:3343:1: rule__AssociationAction__Group__1__Impl : ( ( rule__AssociationAction__Alternatives_1 ) ) ;
    public final void rule__AssociationAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3347:1: ( ( ( rule__AssociationAction__Alternatives_1 ) ) )
            // InternalFeatureLangParser.g:3348:1: ( ( rule__AssociationAction__Alternatives_1 ) )
            {
            // InternalFeatureLangParser.g:3348:1: ( ( rule__AssociationAction__Alternatives_1 ) )
            // InternalFeatureLangParser.g:3349:2: ( rule__AssociationAction__Alternatives_1 )
            {
             before(grammarAccess.getAssociationActionAccess().getAlternatives_1()); 
            // InternalFeatureLangParser.g:3350:2: ( rule__AssociationAction__Alternatives_1 )
            // InternalFeatureLangParser.g:3350:3: rule__AssociationAction__Alternatives_1
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
    // InternalFeatureLangParser.g:3358:1: rule__AssociationAction__Group__2 : rule__AssociationAction__Group__2__Impl ;
    public final void rule__AssociationAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3362:1: ( rule__AssociationAction__Group__2__Impl )
            // InternalFeatureLangParser.g:3363:2: rule__AssociationAction__Group__2__Impl
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
    // InternalFeatureLangParser.g:3369:1: rule__AssociationAction__Group__2__Impl : ( ( rule__AssociationAction__Alternatives_2 ) ) ;
    public final void rule__AssociationAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3373:1: ( ( ( rule__AssociationAction__Alternatives_2 ) ) )
            // InternalFeatureLangParser.g:3374:1: ( ( rule__AssociationAction__Alternatives_2 ) )
            {
            // InternalFeatureLangParser.g:3374:1: ( ( rule__AssociationAction__Alternatives_2 ) )
            // InternalFeatureLangParser.g:3375:2: ( rule__AssociationAction__Alternatives_2 )
            {
             before(grammarAccess.getAssociationActionAccess().getAlternatives_2()); 
            // InternalFeatureLangParser.g:3376:2: ( rule__AssociationAction__Alternatives_2 )
            // InternalFeatureLangParser.g:3376:3: rule__AssociationAction__Alternatives_2
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
    // InternalFeatureLangParser.g:3385:1: rule__AssociationAction__Group_2_1__0 : rule__AssociationAction__Group_2_1__0__Impl rule__AssociationAction__Group_2_1__1 ;
    public final void rule__AssociationAction__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3389:1: ( rule__AssociationAction__Group_2_1__0__Impl rule__AssociationAction__Group_2_1__1 )
            // InternalFeatureLangParser.g:3390:2: rule__AssociationAction__Group_2_1__0__Impl rule__AssociationAction__Group_2_1__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalFeatureLangParser.g:3397:1: rule__AssociationAction__Group_2_1__0__Impl : ( ( rule__AssociationAction__NameAssignment_2_1_0 ) ) ;
    public final void rule__AssociationAction__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3401:1: ( ( ( rule__AssociationAction__NameAssignment_2_1_0 ) ) )
            // InternalFeatureLangParser.g:3402:1: ( ( rule__AssociationAction__NameAssignment_2_1_0 ) )
            {
            // InternalFeatureLangParser.g:3402:1: ( ( rule__AssociationAction__NameAssignment_2_1_0 ) )
            // InternalFeatureLangParser.g:3403:2: ( rule__AssociationAction__NameAssignment_2_1_0 )
            {
             before(grammarAccess.getAssociationActionAccess().getNameAssignment_2_1_0()); 
            // InternalFeatureLangParser.g:3404:2: ( rule__AssociationAction__NameAssignment_2_1_0 )
            // InternalFeatureLangParser.g:3404:3: rule__AssociationAction__NameAssignment_2_1_0
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
    // InternalFeatureLangParser.g:3412:1: rule__AssociationAction__Group_2_1__1 : rule__AssociationAction__Group_2_1__1__Impl ;
    public final void rule__AssociationAction__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3416:1: ( rule__AssociationAction__Group_2_1__1__Impl )
            // InternalFeatureLangParser.g:3417:2: rule__AssociationAction__Group_2_1__1__Impl
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
    // InternalFeatureLangParser.g:3423:1: rule__AssociationAction__Group_2_1__1__Impl : ( ( rule__AssociationAction__EditAssignment_2_1_1 ) ) ;
    public final void rule__AssociationAction__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3427:1: ( ( ( rule__AssociationAction__EditAssignment_2_1_1 ) ) )
            // InternalFeatureLangParser.g:3428:1: ( ( rule__AssociationAction__EditAssignment_2_1_1 ) )
            {
            // InternalFeatureLangParser.g:3428:1: ( ( rule__AssociationAction__EditAssignment_2_1_1 ) )
            // InternalFeatureLangParser.g:3429:2: ( rule__AssociationAction__EditAssignment_2_1_1 )
            {
             before(grammarAccess.getAssociationActionAccess().getEditAssignment_2_1_1()); 
            // InternalFeatureLangParser.g:3430:2: ( rule__AssociationAction__EditAssignment_2_1_1 )
            // InternalFeatureLangParser.g:3430:3: rule__AssociationAction__EditAssignment_2_1_1
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
    // InternalFeatureLangParser.g:3439:1: rule__CreateAssociation__Group__0 : rule__CreateAssociation__Group__0__Impl rule__CreateAssociation__Group__1 ;
    public final void rule__CreateAssociation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3443:1: ( rule__CreateAssociation__Group__0__Impl rule__CreateAssociation__Group__1 )
            // InternalFeatureLangParser.g:3444:2: rule__CreateAssociation__Group__0__Impl rule__CreateAssociation__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalFeatureLangParser.g:3451:1: rule__CreateAssociation__Group__0__Impl : ( To ) ;
    public final void rule__CreateAssociation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3455:1: ( ( To ) )
            // InternalFeatureLangParser.g:3456:1: ( To )
            {
            // InternalFeatureLangParser.g:3456:1: ( To )
            // InternalFeatureLangParser.g:3457:2: To
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
    // InternalFeatureLangParser.g:3466:1: rule__CreateAssociation__Group__1 : rule__CreateAssociation__Group__1__Impl rule__CreateAssociation__Group__2 ;
    public final void rule__CreateAssociation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3470:1: ( rule__CreateAssociation__Group__1__Impl rule__CreateAssociation__Group__2 )
            // InternalFeatureLangParser.g:3471:2: rule__CreateAssociation__Group__1__Impl rule__CreateAssociation__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalFeatureLangParser.g:3478:1: rule__CreateAssociation__Group__1__Impl : ( ( Other )? ) ;
    public final void rule__CreateAssociation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3482:1: ( ( ( Other )? ) )
            // InternalFeatureLangParser.g:3483:1: ( ( Other )? )
            {
            // InternalFeatureLangParser.g:3483:1: ( ( Other )? )
            // InternalFeatureLangParser.g:3484:2: ( Other )?
            {
             before(grammarAccess.getCreateAssociationAccess().getOtherKeyword_1()); 
            // InternalFeatureLangParser.g:3485:2: ( Other )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==Other) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalFeatureLangParser.g:3485:3: Other
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
    // InternalFeatureLangParser.g:3493:1: rule__CreateAssociation__Group__2 : rule__CreateAssociation__Group__2__Impl rule__CreateAssociation__Group__3 ;
    public final void rule__CreateAssociation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3497:1: ( rule__CreateAssociation__Group__2__Impl rule__CreateAssociation__Group__3 )
            // InternalFeatureLangParser.g:3498:2: rule__CreateAssociation__Group__2__Impl rule__CreateAssociation__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalFeatureLangParser.g:3505:1: rule__CreateAssociation__Group__2__Impl : ( ( rule__CreateAssociation__TargetAssignment_2 ) ) ;
    public final void rule__CreateAssociation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3509:1: ( ( ( rule__CreateAssociation__TargetAssignment_2 ) ) )
            // InternalFeatureLangParser.g:3510:1: ( ( rule__CreateAssociation__TargetAssignment_2 ) )
            {
            // InternalFeatureLangParser.g:3510:1: ( ( rule__CreateAssociation__TargetAssignment_2 ) )
            // InternalFeatureLangParser.g:3511:2: ( rule__CreateAssociation__TargetAssignment_2 )
            {
             before(grammarAccess.getCreateAssociationAccess().getTargetAssignment_2()); 
            // InternalFeatureLangParser.g:3512:2: ( rule__CreateAssociation__TargetAssignment_2 )
            // InternalFeatureLangParser.g:3512:3: rule__CreateAssociation__TargetAssignment_2
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
    // InternalFeatureLangParser.g:3520:1: rule__CreateAssociation__Group__3 : rule__CreateAssociation__Group__3__Impl rule__CreateAssociation__Group__4 ;
    public final void rule__CreateAssociation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3524:1: ( rule__CreateAssociation__Group__3__Impl rule__CreateAssociation__Group__4 )
            // InternalFeatureLangParser.g:3525:2: rule__CreateAssociation__Group__3__Impl rule__CreateAssociation__Group__4
            {
            pushFollow(FOLLOW_31);
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
    // InternalFeatureLangParser.g:3532:1: rule__CreateAssociation__Group__3__Impl : ( Called ) ;
    public final void rule__CreateAssociation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3536:1: ( ( Called ) )
            // InternalFeatureLangParser.g:3537:1: ( Called )
            {
            // InternalFeatureLangParser.g:3537:1: ( Called )
            // InternalFeatureLangParser.g:3538:2: Called
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
    // InternalFeatureLangParser.g:3547:1: rule__CreateAssociation__Group__4 : rule__CreateAssociation__Group__4__Impl ;
    public final void rule__CreateAssociation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3551:1: ( rule__CreateAssociation__Group__4__Impl )
            // InternalFeatureLangParser.g:3552:2: rule__CreateAssociation__Group__4__Impl
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
    // InternalFeatureLangParser.g:3558:1: rule__CreateAssociation__Group__4__Impl : ( ( rule__CreateAssociation__RelationAssignment_4 ) ) ;
    public final void rule__CreateAssociation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3562:1: ( ( ( rule__CreateAssociation__RelationAssignment_4 ) ) )
            // InternalFeatureLangParser.g:3563:1: ( ( rule__CreateAssociation__RelationAssignment_4 ) )
            {
            // InternalFeatureLangParser.g:3563:1: ( ( rule__CreateAssociation__RelationAssignment_4 ) )
            // InternalFeatureLangParser.g:3564:2: ( rule__CreateAssociation__RelationAssignment_4 )
            {
             before(grammarAccess.getCreateAssociationAccess().getRelationAssignment_4()); 
            // InternalFeatureLangParser.g:3565:2: ( rule__CreateAssociation__RelationAssignment_4 )
            // InternalFeatureLangParser.g:3565:3: rule__CreateAssociation__RelationAssignment_4
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
    // InternalFeatureLangParser.g:3574:1: rule__SetCompatible__Group__0 : rule__SetCompatible__Group__0__Impl rule__SetCompatible__Group__1 ;
    public final void rule__SetCompatible__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3578:1: ( rule__SetCompatible__Group__0__Impl rule__SetCompatible__Group__1 )
            // InternalFeatureLangParser.g:3579:2: rule__SetCompatible__Group__0__Impl rule__SetCompatible__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalFeatureLangParser.g:3586:1: rule__SetCompatible__Group__0__Impl : ( Compatible ) ;
    public final void rule__SetCompatible__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3590:1: ( ( Compatible ) )
            // InternalFeatureLangParser.g:3591:1: ( Compatible )
            {
            // InternalFeatureLangParser.g:3591:1: ( Compatible )
            // InternalFeatureLangParser.g:3592:2: Compatible
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
    // InternalFeatureLangParser.g:3601:1: rule__SetCompatible__Group__1 : rule__SetCompatible__Group__1__Impl rule__SetCompatible__Group__2 ;
    public final void rule__SetCompatible__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3605:1: ( rule__SetCompatible__Group__1__Impl rule__SetCompatible__Group__2 )
            // InternalFeatureLangParser.g:3606:2: rule__SetCompatible__Group__1__Impl rule__SetCompatible__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalFeatureLangParser.g:3613:1: rule__SetCompatible__Group__1__Impl : ( With ) ;
    public final void rule__SetCompatible__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3617:1: ( ( With ) )
            // InternalFeatureLangParser.g:3618:1: ( With )
            {
            // InternalFeatureLangParser.g:3618:1: ( With )
            // InternalFeatureLangParser.g:3619:2: With
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
    // InternalFeatureLangParser.g:3628:1: rule__SetCompatible__Group__2 : rule__SetCompatible__Group__2__Impl rule__SetCompatible__Group__3 ;
    public final void rule__SetCompatible__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3632:1: ( rule__SetCompatible__Group__2__Impl rule__SetCompatible__Group__3 )
            // InternalFeatureLangParser.g:3633:2: rule__SetCompatible__Group__2__Impl rule__SetCompatible__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalFeatureLangParser.g:3640:1: rule__SetCompatible__Group__2__Impl : ( Version ) ;
    public final void rule__SetCompatible__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3644:1: ( ( Version ) )
            // InternalFeatureLangParser.g:3645:1: ( Version )
            {
            // InternalFeatureLangParser.g:3645:1: ( Version )
            // InternalFeatureLangParser.g:3646:2: Version
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
    // InternalFeatureLangParser.g:3655:1: rule__SetCompatible__Group__3 : rule__SetCompatible__Group__3__Impl ;
    public final void rule__SetCompatible__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3659:1: ( rule__SetCompatible__Group__3__Impl )
            // InternalFeatureLangParser.g:3660:2: rule__SetCompatible__Group__3__Impl
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
    // InternalFeatureLangParser.g:3666:1: rule__SetCompatible__Group__3__Impl : ( ( rule__SetCompatible__NameAssignment_3 ) ) ;
    public final void rule__SetCompatible__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3670:1: ( ( ( rule__SetCompatible__NameAssignment_3 ) ) )
            // InternalFeatureLangParser.g:3671:1: ( ( rule__SetCompatible__NameAssignment_3 ) )
            {
            // InternalFeatureLangParser.g:3671:1: ( ( rule__SetCompatible__NameAssignment_3 ) )
            // InternalFeatureLangParser.g:3672:2: ( rule__SetCompatible__NameAssignment_3 )
            {
             before(grammarAccess.getSetCompatibleAccess().getNameAssignment_3()); 
            // InternalFeatureLangParser.g:3673:2: ( rule__SetCompatible__NameAssignment_3 )
            // InternalFeatureLangParser.g:3673:3: rule__SetCompatible__NameAssignment_3
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
    // InternalFeatureLangParser.g:3682:1: rule__SetVersionRange__Group__0 : rule__SetVersionRange__Group__0__Impl rule__SetVersionRange__Group__1 ;
    public final void rule__SetVersionRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3686:1: ( rule__SetVersionRange__Group__0__Impl rule__SetVersionRange__Group__1 )
            // InternalFeatureLangParser.g:3687:2: rule__SetVersionRange__Group__0__Impl rule__SetVersionRange__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalFeatureLangParser.g:3694:1: rule__SetVersionRange__Group__0__Impl : ( With ) ;
    public final void rule__SetVersionRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3698:1: ( ( With ) )
            // InternalFeatureLangParser.g:3699:1: ( With )
            {
            // InternalFeatureLangParser.g:3699:1: ( With )
            // InternalFeatureLangParser.g:3700:2: With
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
    // InternalFeatureLangParser.g:3709:1: rule__SetVersionRange__Group__1 : rule__SetVersionRange__Group__1__Impl rule__SetVersionRange__Group__2 ;
    public final void rule__SetVersionRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3713:1: ( rule__SetVersionRange__Group__1__Impl rule__SetVersionRange__Group__2 )
            // InternalFeatureLangParser.g:3714:2: rule__SetVersionRange__Group__1__Impl rule__SetVersionRange__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalFeatureLangParser.g:3721:1: rule__SetVersionRange__Group__1__Impl : ( Version ) ;
    public final void rule__SetVersionRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3725:1: ( ( Version ) )
            // InternalFeatureLangParser.g:3726:1: ( Version )
            {
            // InternalFeatureLangParser.g:3726:1: ( Version )
            // InternalFeatureLangParser.g:3727:2: Version
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
    // InternalFeatureLangParser.g:3736:1: rule__SetVersionRange__Group__2 : rule__SetVersionRange__Group__2__Impl rule__SetVersionRange__Group__3 ;
    public final void rule__SetVersionRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3740:1: ( rule__SetVersionRange__Group__2__Impl rule__SetVersionRange__Group__3 )
            // InternalFeatureLangParser.g:3741:2: rule__SetVersionRange__Group__2__Impl rule__SetVersionRange__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalFeatureLangParser.g:3748:1: rule__SetVersionRange__Group__2__Impl : ( Range ) ;
    public final void rule__SetVersionRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3752:1: ( ( Range ) )
            // InternalFeatureLangParser.g:3753:1: ( Range )
            {
            // InternalFeatureLangParser.g:3753:1: ( Range )
            // InternalFeatureLangParser.g:3754:2: Range
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
    // InternalFeatureLangParser.g:3763:1: rule__SetVersionRange__Group__3 : rule__SetVersionRange__Group__3__Impl rule__SetVersionRange__Group__4 ;
    public final void rule__SetVersionRange__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3767:1: ( rule__SetVersionRange__Group__3__Impl rule__SetVersionRange__Group__4 )
            // InternalFeatureLangParser.g:3768:2: rule__SetVersionRange__Group__3__Impl rule__SetVersionRange__Group__4
            {
            pushFollow(FOLLOW_34);
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
    // InternalFeatureLangParser.g:3775:1: rule__SetVersionRange__Group__3__Impl : ( From ) ;
    public final void rule__SetVersionRange__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3779:1: ( ( From ) )
            // InternalFeatureLangParser.g:3780:1: ( From )
            {
            // InternalFeatureLangParser.g:3780:1: ( From )
            // InternalFeatureLangParser.g:3781:2: From
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
    // InternalFeatureLangParser.g:3790:1: rule__SetVersionRange__Group__4 : rule__SetVersionRange__Group__4__Impl rule__SetVersionRange__Group__5 ;
    public final void rule__SetVersionRange__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3794:1: ( rule__SetVersionRange__Group__4__Impl rule__SetVersionRange__Group__5 )
            // InternalFeatureLangParser.g:3795:2: rule__SetVersionRange__Group__4__Impl rule__SetVersionRange__Group__5
            {
            pushFollow(FOLLOW_37);
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
    // InternalFeatureLangParser.g:3802:1: rule__SetVersionRange__Group__4__Impl : ( ( rule__SetVersionRange__StartAssignment_4 ) ) ;
    public final void rule__SetVersionRange__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3806:1: ( ( ( rule__SetVersionRange__StartAssignment_4 ) ) )
            // InternalFeatureLangParser.g:3807:1: ( ( rule__SetVersionRange__StartAssignment_4 ) )
            {
            // InternalFeatureLangParser.g:3807:1: ( ( rule__SetVersionRange__StartAssignment_4 ) )
            // InternalFeatureLangParser.g:3808:2: ( rule__SetVersionRange__StartAssignment_4 )
            {
             before(grammarAccess.getSetVersionRangeAccess().getStartAssignment_4()); 
            // InternalFeatureLangParser.g:3809:2: ( rule__SetVersionRange__StartAssignment_4 )
            // InternalFeatureLangParser.g:3809:3: rule__SetVersionRange__StartAssignment_4
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
    // InternalFeatureLangParser.g:3817:1: rule__SetVersionRange__Group__5 : rule__SetVersionRange__Group__5__Impl rule__SetVersionRange__Group__6 ;
    public final void rule__SetVersionRange__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3821:1: ( rule__SetVersionRange__Group__5__Impl rule__SetVersionRange__Group__6 )
            // InternalFeatureLangParser.g:3822:2: rule__SetVersionRange__Group__5__Impl rule__SetVersionRange__Group__6
            {
            pushFollow(FOLLOW_34);
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
    // InternalFeatureLangParser.g:3829:1: rule__SetVersionRange__Group__5__Impl : ( To ) ;
    public final void rule__SetVersionRange__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3833:1: ( ( To ) )
            // InternalFeatureLangParser.g:3834:1: ( To )
            {
            // InternalFeatureLangParser.g:3834:1: ( To )
            // InternalFeatureLangParser.g:3835:2: To
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
    // InternalFeatureLangParser.g:3844:1: rule__SetVersionRange__Group__6 : rule__SetVersionRange__Group__6__Impl ;
    public final void rule__SetVersionRange__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3848:1: ( rule__SetVersionRange__Group__6__Impl )
            // InternalFeatureLangParser.g:3849:2: rule__SetVersionRange__Group__6__Impl
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
    // InternalFeatureLangParser.g:3855:1: rule__SetVersionRange__Group__6__Impl : ( ( rule__SetVersionRange__EndAssignment_6 ) ) ;
    public final void rule__SetVersionRange__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3859:1: ( ( ( rule__SetVersionRange__EndAssignment_6 ) ) )
            // InternalFeatureLangParser.g:3860:1: ( ( rule__SetVersionRange__EndAssignment_6 ) )
            {
            // InternalFeatureLangParser.g:3860:1: ( ( rule__SetVersionRange__EndAssignment_6 ) )
            // InternalFeatureLangParser.g:3861:2: ( rule__SetVersionRange__EndAssignment_6 )
            {
             before(grammarAccess.getSetVersionRangeAccess().getEndAssignment_6()); 
            // InternalFeatureLangParser.g:3862:2: ( rule__SetVersionRange__EndAssignment_6 )
            // InternalFeatureLangParser.g:3862:3: rule__SetVersionRange__EndAssignment_6
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
    // InternalFeatureLangParser.g:3871:1: rule__SetVariant__Group__0 : rule__SetVariant__Group__0__Impl rule__SetVariant__Group__1 ;
    public final void rule__SetVariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3875:1: ( rule__SetVariant__Group__0__Impl rule__SetVariant__Group__1 )
            // InternalFeatureLangParser.g:3876:2: rule__SetVariant__Group__0__Impl rule__SetVariant__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalFeatureLangParser.g:3883:1: rule__SetVariant__Group__0__Impl : ( With ) ;
    public final void rule__SetVariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3887:1: ( ( With ) )
            // InternalFeatureLangParser.g:3888:1: ( With )
            {
            // InternalFeatureLangParser.g:3888:1: ( With )
            // InternalFeatureLangParser.g:3889:2: With
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
    // InternalFeatureLangParser.g:3898:1: rule__SetVariant__Group__1 : rule__SetVariant__Group__1__Impl rule__SetVariant__Group__2 ;
    public final void rule__SetVariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3902:1: ( rule__SetVariant__Group__1__Impl rule__SetVariant__Group__2 )
            // InternalFeatureLangParser.g:3903:2: rule__SetVariant__Group__1__Impl rule__SetVariant__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalFeatureLangParser.g:3910:1: rule__SetVariant__Group__1__Impl : ( All ) ;
    public final void rule__SetVariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3914:1: ( ( All ) )
            // InternalFeatureLangParser.g:3915:1: ( All )
            {
            // InternalFeatureLangParser.g:3915:1: ( All )
            // InternalFeatureLangParser.g:3916:2: All
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
    // InternalFeatureLangParser.g:3925:1: rule__SetVariant__Group__2 : rule__SetVariant__Group__2__Impl rule__SetVariant__Group__3 ;
    public final void rule__SetVariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3929:1: ( rule__SetVariant__Group__2__Impl rule__SetVariant__Group__3 )
            // InternalFeatureLangParser.g:3930:2: rule__SetVariant__Group__2__Impl rule__SetVariant__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalFeatureLangParser.g:3937:1: rule__SetVariant__Group__2__Impl : ( Versions ) ;
    public final void rule__SetVariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3941:1: ( ( Versions ) )
            // InternalFeatureLangParser.g:3942:1: ( Versions )
            {
            // InternalFeatureLangParser.g:3942:1: ( Versions )
            // InternalFeatureLangParser.g:3943:2: Versions
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
    // InternalFeatureLangParser.g:3952:1: rule__SetVariant__Group__3 : rule__SetVariant__Group__3__Impl rule__SetVariant__Group__4 ;
    public final void rule__SetVariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3956:1: ( rule__SetVariant__Group__3__Impl rule__SetVariant__Group__4 )
            // InternalFeatureLangParser.g:3957:2: rule__SetVariant__Group__3__Impl rule__SetVariant__Group__4
            {
            pushFollow(FOLLOW_40);
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
    // InternalFeatureLangParser.g:3964:1: rule__SetVariant__Group__3__Impl : ( Of ) ;
    public final void rule__SetVariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3968:1: ( ( Of ) )
            // InternalFeatureLangParser.g:3969:1: ( Of )
            {
            // InternalFeatureLangParser.g:3969:1: ( Of )
            // InternalFeatureLangParser.g:3970:2: Of
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
    // InternalFeatureLangParser.g:3979:1: rule__SetVariant__Group__4 : rule__SetVariant__Group__4__Impl rule__SetVariant__Group__5 ;
    public final void rule__SetVariant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3983:1: ( rule__SetVariant__Group__4__Impl rule__SetVariant__Group__5 )
            // InternalFeatureLangParser.g:3984:2: rule__SetVariant__Group__4__Impl rule__SetVariant__Group__5
            {
            pushFollow(FOLLOW_34);
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
    // InternalFeatureLangParser.g:3991:1: rule__SetVariant__Group__4__Impl : ( Variant ) ;
    public final void rule__SetVariant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3995:1: ( ( Variant ) )
            // InternalFeatureLangParser.g:3996:1: ( Variant )
            {
            // InternalFeatureLangParser.g:3996:1: ( Variant )
            // InternalFeatureLangParser.g:3997:2: Variant
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
    // InternalFeatureLangParser.g:4006:1: rule__SetVariant__Group__5 : rule__SetVariant__Group__5__Impl ;
    public final void rule__SetVariant__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4010:1: ( rule__SetVariant__Group__5__Impl )
            // InternalFeatureLangParser.g:4011:2: rule__SetVariant__Group__5__Impl
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
    // InternalFeatureLangParser.g:4017:1: rule__SetVariant__Group__5__Impl : ( ( rule__SetVariant__NameAssignment_5 ) ) ;
    public final void rule__SetVariant__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4021:1: ( ( ( rule__SetVariant__NameAssignment_5 ) ) )
            // InternalFeatureLangParser.g:4022:1: ( ( rule__SetVariant__NameAssignment_5 ) )
            {
            // InternalFeatureLangParser.g:4022:1: ( ( rule__SetVariant__NameAssignment_5 ) )
            // InternalFeatureLangParser.g:4023:2: ( rule__SetVariant__NameAssignment_5 )
            {
             before(grammarAccess.getSetVariantAccess().getNameAssignment_5()); 
            // InternalFeatureLangParser.g:4024:2: ( rule__SetVariant__NameAssignment_5 )
            // InternalFeatureLangParser.g:4024:3: rule__SetVariant__NameAssignment_5
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
    // InternalFeatureLangParser.g:4033:1: rule__SetRightOpen__Group__0 : rule__SetRightOpen__Group__0__Impl rule__SetRightOpen__Group__1 ;
    public final void rule__SetRightOpen__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4037:1: ( rule__SetRightOpen__Group__0__Impl rule__SetRightOpen__Group__1 )
            // InternalFeatureLangParser.g:4038:2: rule__SetRightOpen__Group__0__Impl rule__SetRightOpen__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalFeatureLangParser.g:4045:1: rule__SetRightOpen__Group__0__Impl : ( Up ) ;
    public final void rule__SetRightOpen__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4049:1: ( ( Up ) )
            // InternalFeatureLangParser.g:4050:1: ( Up )
            {
            // InternalFeatureLangParser.g:4050:1: ( Up )
            // InternalFeatureLangParser.g:4051:2: Up
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
    // InternalFeatureLangParser.g:4060:1: rule__SetRightOpen__Group__1 : rule__SetRightOpen__Group__1__Impl rule__SetRightOpen__Group__2 ;
    public final void rule__SetRightOpen__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4064:1: ( rule__SetRightOpen__Group__1__Impl rule__SetRightOpen__Group__2 )
            // InternalFeatureLangParser.g:4065:2: rule__SetRightOpen__Group__1__Impl rule__SetRightOpen__Group__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalFeatureLangParser.g:4072:1: rule__SetRightOpen__Group__1__Impl : ( To ) ;
    public final void rule__SetRightOpen__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4076:1: ( ( To ) )
            // InternalFeatureLangParser.g:4077:1: ( To )
            {
            // InternalFeatureLangParser.g:4077:1: ( To )
            // InternalFeatureLangParser.g:4078:2: To
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
    // InternalFeatureLangParser.g:4087:1: rule__SetRightOpen__Group__2 : rule__SetRightOpen__Group__2__Impl rule__SetRightOpen__Group__3 ;
    public final void rule__SetRightOpen__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4091:1: ( rule__SetRightOpen__Group__2__Impl rule__SetRightOpen__Group__3 )
            // InternalFeatureLangParser.g:4092:2: rule__SetRightOpen__Group__2__Impl rule__SetRightOpen__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalFeatureLangParser.g:4099:1: rule__SetRightOpen__Group__2__Impl : ( Date ) ;
    public final void rule__SetRightOpen__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4103:1: ( ( Date ) )
            // InternalFeatureLangParser.g:4104:1: ( Date )
            {
            // InternalFeatureLangParser.g:4104:1: ( Date )
            // InternalFeatureLangParser.g:4105:2: Date
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
    // InternalFeatureLangParser.g:4114:1: rule__SetRightOpen__Group__3 : rule__SetRightOpen__Group__3__Impl ;
    public final void rule__SetRightOpen__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4118:1: ( rule__SetRightOpen__Group__3__Impl )
            // InternalFeatureLangParser.g:4119:2: rule__SetRightOpen__Group__3__Impl
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
    // InternalFeatureLangParser.g:4125:1: rule__SetRightOpen__Group__3__Impl : ( ( rule__SetRightOpen__DateAssignment_3 ) ) ;
    public final void rule__SetRightOpen__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4129:1: ( ( ( rule__SetRightOpen__DateAssignment_3 ) ) )
            // InternalFeatureLangParser.g:4130:1: ( ( rule__SetRightOpen__DateAssignment_3 ) )
            {
            // InternalFeatureLangParser.g:4130:1: ( ( rule__SetRightOpen__DateAssignment_3 ) )
            // InternalFeatureLangParser.g:4131:2: ( rule__SetRightOpen__DateAssignment_3 )
            {
             before(grammarAccess.getSetRightOpenAccess().getDateAssignment_3()); 
            // InternalFeatureLangParser.g:4132:2: ( rule__SetRightOpen__DateAssignment_3 )
            // InternalFeatureLangParser.g:4132:3: rule__SetRightOpen__DateAssignment_3
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
    // InternalFeatureLangParser.g:4141:1: rule__SetLeftOpen__Group__0 : rule__SetLeftOpen__Group__0__Impl rule__SetLeftOpen__Group__1 ;
    public final void rule__SetLeftOpen__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4145:1: ( rule__SetLeftOpen__Group__0__Impl rule__SetLeftOpen__Group__1 )
            // InternalFeatureLangParser.g:4146:2: rule__SetLeftOpen__Group__0__Impl rule__SetLeftOpen__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalFeatureLangParser.g:4153:1: rule__SetLeftOpen__Group__0__Impl : ( Starting ) ;
    public final void rule__SetLeftOpen__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4157:1: ( ( Starting ) )
            // InternalFeatureLangParser.g:4158:1: ( Starting )
            {
            // InternalFeatureLangParser.g:4158:1: ( Starting )
            // InternalFeatureLangParser.g:4159:2: Starting
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
    // InternalFeatureLangParser.g:4168:1: rule__SetLeftOpen__Group__1 : rule__SetLeftOpen__Group__1__Impl rule__SetLeftOpen__Group__2 ;
    public final void rule__SetLeftOpen__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4172:1: ( rule__SetLeftOpen__Group__1__Impl rule__SetLeftOpen__Group__2 )
            // InternalFeatureLangParser.g:4173:2: rule__SetLeftOpen__Group__1__Impl rule__SetLeftOpen__Group__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalFeatureLangParser.g:4180:1: rule__SetLeftOpen__Group__1__Impl : ( From ) ;
    public final void rule__SetLeftOpen__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4184:1: ( ( From ) )
            // InternalFeatureLangParser.g:4185:1: ( From )
            {
            // InternalFeatureLangParser.g:4185:1: ( From )
            // InternalFeatureLangParser.g:4186:2: From
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
    // InternalFeatureLangParser.g:4195:1: rule__SetLeftOpen__Group__2 : rule__SetLeftOpen__Group__2__Impl rule__SetLeftOpen__Group__3 ;
    public final void rule__SetLeftOpen__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4199:1: ( rule__SetLeftOpen__Group__2__Impl rule__SetLeftOpen__Group__3 )
            // InternalFeatureLangParser.g:4200:2: rule__SetLeftOpen__Group__2__Impl rule__SetLeftOpen__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalFeatureLangParser.g:4207:1: rule__SetLeftOpen__Group__2__Impl : ( Date ) ;
    public final void rule__SetLeftOpen__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4211:1: ( ( Date ) )
            // InternalFeatureLangParser.g:4212:1: ( Date )
            {
            // InternalFeatureLangParser.g:4212:1: ( Date )
            // InternalFeatureLangParser.g:4213:2: Date
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
    // InternalFeatureLangParser.g:4222:1: rule__SetLeftOpen__Group__3 : rule__SetLeftOpen__Group__3__Impl ;
    public final void rule__SetLeftOpen__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4226:1: ( rule__SetLeftOpen__Group__3__Impl )
            // InternalFeatureLangParser.g:4227:2: rule__SetLeftOpen__Group__3__Impl
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
    // InternalFeatureLangParser.g:4233:1: rule__SetLeftOpen__Group__3__Impl : ( ( rule__SetLeftOpen__DateAssignment_3 ) ) ;
    public final void rule__SetLeftOpen__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4237:1: ( ( ( rule__SetLeftOpen__DateAssignment_3 ) ) )
            // InternalFeatureLangParser.g:4238:1: ( ( rule__SetLeftOpen__DateAssignment_3 ) )
            {
            // InternalFeatureLangParser.g:4238:1: ( ( rule__SetLeftOpen__DateAssignment_3 ) )
            // InternalFeatureLangParser.g:4239:2: ( rule__SetLeftOpen__DateAssignment_3 )
            {
             before(grammarAccess.getSetLeftOpenAccess().getDateAssignment_3()); 
            // InternalFeatureLangParser.g:4240:2: ( rule__SetLeftOpen__DateAssignment_3 )
            // InternalFeatureLangParser.g:4240:3: rule__SetLeftOpen__DateAssignment_3
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
    // InternalFeatureLangParser.g:4249:1: rule__InheritanceAction__Group__0 : rule__InheritanceAction__Group__0__Impl rule__InheritanceAction__Group__1 ;
    public final void rule__InheritanceAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4253:1: ( rule__InheritanceAction__Group__0__Impl rule__InheritanceAction__Group__1 )
            // InternalFeatureLangParser.g:4254:2: rule__InheritanceAction__Group__0__Impl rule__InheritanceAction__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalFeatureLangParser.g:4261:1: rule__InheritanceAction__Group__0__Impl : ( ( rule__InheritanceAction__Alternatives_0 ) ) ;
    public final void rule__InheritanceAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4265:1: ( ( ( rule__InheritanceAction__Alternatives_0 ) ) )
            // InternalFeatureLangParser.g:4266:1: ( ( rule__InheritanceAction__Alternatives_0 ) )
            {
            // InternalFeatureLangParser.g:4266:1: ( ( rule__InheritanceAction__Alternatives_0 ) )
            // InternalFeatureLangParser.g:4267:2: ( rule__InheritanceAction__Alternatives_0 )
            {
             before(grammarAccess.getInheritanceActionAccess().getAlternatives_0()); 
            // InternalFeatureLangParser.g:4268:2: ( rule__InheritanceAction__Alternatives_0 )
            // InternalFeatureLangParser.g:4268:3: rule__InheritanceAction__Alternatives_0
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
    // InternalFeatureLangParser.g:4276:1: rule__InheritanceAction__Group__1 : rule__InheritanceAction__Group__1__Impl rule__InheritanceAction__Group__2 ;
    public final void rule__InheritanceAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4280:1: ( rule__InheritanceAction__Group__1__Impl rule__InheritanceAction__Group__2 )
            // InternalFeatureLangParser.g:4281:2: rule__InheritanceAction__Group__1__Impl rule__InheritanceAction__Group__2
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
    // InternalFeatureLangParser.g:4288:1: rule__InheritanceAction__Group__1__Impl : ( From ) ;
    public final void rule__InheritanceAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4292:1: ( ( From ) )
            // InternalFeatureLangParser.g:4293:1: ( From )
            {
            // InternalFeatureLangParser.g:4293:1: ( From )
            // InternalFeatureLangParser.g:4294:2: From
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
    // InternalFeatureLangParser.g:4303:1: rule__InheritanceAction__Group__2 : rule__InheritanceAction__Group__2__Impl ;
    public final void rule__InheritanceAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4307:1: ( rule__InheritanceAction__Group__2__Impl )
            // InternalFeatureLangParser.g:4308:2: rule__InheritanceAction__Group__2__Impl
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
    // InternalFeatureLangParser.g:4314:1: rule__InheritanceAction__Group__2__Impl : ( ( rule__InheritanceAction__ParentAssignment_2 ) ) ;
    public final void rule__InheritanceAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4318:1: ( ( ( rule__InheritanceAction__ParentAssignment_2 ) ) )
            // InternalFeatureLangParser.g:4319:1: ( ( rule__InheritanceAction__ParentAssignment_2 ) )
            {
            // InternalFeatureLangParser.g:4319:1: ( ( rule__InheritanceAction__ParentAssignment_2 ) )
            // InternalFeatureLangParser.g:4320:2: ( rule__InheritanceAction__ParentAssignment_2 )
            {
             before(grammarAccess.getInheritanceActionAccess().getParentAssignment_2()); 
            // InternalFeatureLangParser.g:4321:2: ( rule__InheritanceAction__ParentAssignment_2 )
            // InternalFeatureLangParser.g:4321:3: rule__InheritanceAction__ParentAssignment_2
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
    // InternalFeatureLangParser.g:4330:1: rule__CreateComposition__Group__0 : rule__CreateComposition__Group__0__Impl rule__CreateComposition__Group__1 ;
    public final void rule__CreateComposition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4334:1: ( rule__CreateComposition__Group__0__Impl rule__CreateComposition__Group__1 )
            // InternalFeatureLangParser.g:4335:2: rule__CreateComposition__Group__0__Impl rule__CreateComposition__Group__1
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
    // InternalFeatureLangParser.g:4342:1: rule__CreateComposition__Group__0__Impl : ( ( rule__CreateComposition__Alternatives_0 ) ) ;
    public final void rule__CreateComposition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4346:1: ( ( ( rule__CreateComposition__Alternatives_0 ) ) )
            // InternalFeatureLangParser.g:4347:1: ( ( rule__CreateComposition__Alternatives_0 ) )
            {
            // InternalFeatureLangParser.g:4347:1: ( ( rule__CreateComposition__Alternatives_0 ) )
            // InternalFeatureLangParser.g:4348:2: ( rule__CreateComposition__Alternatives_0 )
            {
             before(grammarAccess.getCreateCompositionAccess().getAlternatives_0()); 
            // InternalFeatureLangParser.g:4349:2: ( rule__CreateComposition__Alternatives_0 )
            // InternalFeatureLangParser.g:4349:3: rule__CreateComposition__Alternatives_0
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
    // InternalFeatureLangParser.g:4357:1: rule__CreateComposition__Group__1 : rule__CreateComposition__Group__1__Impl rule__CreateComposition__Group__2 ;
    public final void rule__CreateComposition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4361:1: ( rule__CreateComposition__Group__1__Impl rule__CreateComposition__Group__2 )
            // InternalFeatureLangParser.g:4362:2: rule__CreateComposition__Group__1__Impl rule__CreateComposition__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalFeatureLangParser.g:4369:1: rule__CreateComposition__Group__1__Impl : ( ( rule__CreateComposition__TargetAssignment_1 ) ) ;
    public final void rule__CreateComposition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4373:1: ( ( ( rule__CreateComposition__TargetAssignment_1 ) ) )
            // InternalFeatureLangParser.g:4374:1: ( ( rule__CreateComposition__TargetAssignment_1 ) )
            {
            // InternalFeatureLangParser.g:4374:1: ( ( rule__CreateComposition__TargetAssignment_1 ) )
            // InternalFeatureLangParser.g:4375:2: ( rule__CreateComposition__TargetAssignment_1 )
            {
             before(grammarAccess.getCreateCompositionAccess().getTargetAssignment_1()); 
            // InternalFeatureLangParser.g:4376:2: ( rule__CreateComposition__TargetAssignment_1 )
            // InternalFeatureLangParser.g:4376:3: rule__CreateComposition__TargetAssignment_1
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
    // InternalFeatureLangParser.g:4384:1: rule__CreateComposition__Group__2 : rule__CreateComposition__Group__2__Impl rule__CreateComposition__Group__3 ;
    public final void rule__CreateComposition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4388:1: ( rule__CreateComposition__Group__2__Impl rule__CreateComposition__Group__3 )
            // InternalFeatureLangParser.g:4389:2: rule__CreateComposition__Group__2__Impl rule__CreateComposition__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalFeatureLangParser.g:4396:1: rule__CreateComposition__Group__2__Impl : ( Called ) ;
    public final void rule__CreateComposition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4400:1: ( ( Called ) )
            // InternalFeatureLangParser.g:4401:1: ( Called )
            {
            // InternalFeatureLangParser.g:4401:1: ( Called )
            // InternalFeatureLangParser.g:4402:2: Called
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
    // InternalFeatureLangParser.g:4411:1: rule__CreateComposition__Group__3 : rule__CreateComposition__Group__3__Impl rule__CreateComposition__Group__4 ;
    public final void rule__CreateComposition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4415:1: ( rule__CreateComposition__Group__3__Impl rule__CreateComposition__Group__4 )
            // InternalFeatureLangParser.g:4416:2: rule__CreateComposition__Group__3__Impl rule__CreateComposition__Group__4
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
    // InternalFeatureLangParser.g:4423:1: rule__CreateComposition__Group__3__Impl : ( ( rule__CreateComposition__RelationAssignment_3 ) ) ;
    public final void rule__CreateComposition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4427:1: ( ( ( rule__CreateComposition__RelationAssignment_3 ) ) )
            // InternalFeatureLangParser.g:4428:1: ( ( rule__CreateComposition__RelationAssignment_3 ) )
            {
            // InternalFeatureLangParser.g:4428:1: ( ( rule__CreateComposition__RelationAssignment_3 ) )
            // InternalFeatureLangParser.g:4429:2: ( rule__CreateComposition__RelationAssignment_3 )
            {
             before(grammarAccess.getCreateCompositionAccess().getRelationAssignment_3()); 
            // InternalFeatureLangParser.g:4430:2: ( rule__CreateComposition__RelationAssignment_3 )
            // InternalFeatureLangParser.g:4430:3: rule__CreateComposition__RelationAssignment_3
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
    // InternalFeatureLangParser.g:4438:1: rule__CreateComposition__Group__4 : rule__CreateComposition__Group__4__Impl ;
    public final void rule__CreateComposition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4442:1: ( rule__CreateComposition__Group__4__Impl )
            // InternalFeatureLangParser.g:4443:2: rule__CreateComposition__Group__4__Impl
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
    // InternalFeatureLangParser.g:4449:1: rule__CreateComposition__Group__4__Impl : ( ( rule__CreateComposition__Group_4__0 )? ) ;
    public final void rule__CreateComposition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4453:1: ( ( ( rule__CreateComposition__Group_4__0 )? ) )
            // InternalFeatureLangParser.g:4454:1: ( ( rule__CreateComposition__Group_4__0 )? )
            {
            // InternalFeatureLangParser.g:4454:1: ( ( rule__CreateComposition__Group_4__0 )? )
            // InternalFeatureLangParser.g:4455:2: ( rule__CreateComposition__Group_4__0 )?
            {
             before(grammarAccess.getCreateCompositionAccess().getGroup_4()); 
            // InternalFeatureLangParser.g:4456:2: ( rule__CreateComposition__Group_4__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==FullStop) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==It) ) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // InternalFeatureLangParser.g:4456:3: rule__CreateComposition__Group_4__0
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
    // InternalFeatureLangParser.g:4465:1: rule__CreateComposition__Group_0_1__0 : rule__CreateComposition__Group_0_1__0__Impl rule__CreateComposition__Group_0_1__1 ;
    public final void rule__CreateComposition__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4469:1: ( rule__CreateComposition__Group_0_1__0__Impl rule__CreateComposition__Group_0_1__1 )
            // InternalFeatureLangParser.g:4470:2: rule__CreateComposition__Group_0_1__0__Impl rule__CreateComposition__Group_0_1__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalFeatureLangParser.g:4477:1: rule__CreateComposition__Group_0_1__0__Impl : ( Composition ) ;
    public final void rule__CreateComposition__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4481:1: ( ( Composition ) )
            // InternalFeatureLangParser.g:4482:1: ( Composition )
            {
            // InternalFeatureLangParser.g:4482:1: ( Composition )
            // InternalFeatureLangParser.g:4483:2: Composition
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
    // InternalFeatureLangParser.g:4492:1: rule__CreateComposition__Group_0_1__1 : rule__CreateComposition__Group_0_1__1__Impl ;
    public final void rule__CreateComposition__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4496:1: ( rule__CreateComposition__Group_0_1__1__Impl )
            // InternalFeatureLangParser.g:4497:2: rule__CreateComposition__Group_0_1__1__Impl
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
    // InternalFeatureLangParser.g:4503:1: rule__CreateComposition__Group_0_1__1__Impl : ( To ) ;
    public final void rule__CreateComposition__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4507:1: ( ( To ) )
            // InternalFeatureLangParser.g:4508:1: ( To )
            {
            // InternalFeatureLangParser.g:4508:1: ( To )
            // InternalFeatureLangParser.g:4509:2: To
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
    // InternalFeatureLangParser.g:4519:1: rule__CreateComposition__Group_4__0 : rule__CreateComposition__Group_4__0__Impl rule__CreateComposition__Group_4__1 ;
    public final void rule__CreateComposition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4523:1: ( rule__CreateComposition__Group_4__0__Impl rule__CreateComposition__Group_4__1 )
            // InternalFeatureLangParser.g:4524:2: rule__CreateComposition__Group_4__0__Impl rule__CreateComposition__Group_4__1
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
    // InternalFeatureLangParser.g:4531:1: rule__CreateComposition__Group_4__0__Impl : ( FullStop ) ;
    public final void rule__CreateComposition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4535:1: ( ( FullStop ) )
            // InternalFeatureLangParser.g:4536:1: ( FullStop )
            {
            // InternalFeatureLangParser.g:4536:1: ( FullStop )
            // InternalFeatureLangParser.g:4537:2: FullStop
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
    // InternalFeatureLangParser.g:4546:1: rule__CreateComposition__Group_4__1 : rule__CreateComposition__Group_4__1__Impl rule__CreateComposition__Group_4__2 ;
    public final void rule__CreateComposition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4550:1: ( rule__CreateComposition__Group_4__1__Impl rule__CreateComposition__Group_4__2 )
            // InternalFeatureLangParser.g:4551:2: rule__CreateComposition__Group_4__1__Impl rule__CreateComposition__Group_4__2
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
    // InternalFeatureLangParser.g:4558:1: rule__CreateComposition__Group_4__1__Impl : ( It ) ;
    public final void rule__CreateComposition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4562:1: ( ( It ) )
            // InternalFeatureLangParser.g:4563:1: ( It )
            {
            // InternalFeatureLangParser.g:4563:1: ( It )
            // InternalFeatureLangParser.g:4564:2: It
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
    // InternalFeatureLangParser.g:4573:1: rule__CreateComposition__Group_4__2 : rule__CreateComposition__Group_4__2__Impl rule__CreateComposition__Group_4__3 ;
    public final void rule__CreateComposition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4577:1: ( rule__CreateComposition__Group_4__2__Impl rule__CreateComposition__Group_4__3 )
            // InternalFeatureLangParser.g:4578:2: rule__CreateComposition__Group_4__2__Impl rule__CreateComposition__Group_4__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalFeatureLangParser.g:4585:1: rule__CreateComposition__Group_4__2__Impl : ( ( rule__CreateComposition__PriorityAssignment_4_2 ) ) ;
    public final void rule__CreateComposition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4589:1: ( ( ( rule__CreateComposition__PriorityAssignment_4_2 ) ) )
            // InternalFeatureLangParser.g:4590:1: ( ( rule__CreateComposition__PriorityAssignment_4_2 ) )
            {
            // InternalFeatureLangParser.g:4590:1: ( ( rule__CreateComposition__PriorityAssignment_4_2 ) )
            // InternalFeatureLangParser.g:4591:2: ( rule__CreateComposition__PriorityAssignment_4_2 )
            {
             before(grammarAccess.getCreateCompositionAccess().getPriorityAssignment_4_2()); 
            // InternalFeatureLangParser.g:4592:2: ( rule__CreateComposition__PriorityAssignment_4_2 )
            // InternalFeatureLangParser.g:4592:3: rule__CreateComposition__PriorityAssignment_4_2
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
    // InternalFeatureLangParser.g:4600:1: rule__CreateComposition__Group_4__3 : rule__CreateComposition__Group_4__3__Impl rule__CreateComposition__Group_4__4 ;
    public final void rule__CreateComposition__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4604:1: ( rule__CreateComposition__Group_4__3__Impl rule__CreateComposition__Group_4__4 )
            // InternalFeatureLangParser.g:4605:2: rule__CreateComposition__Group_4__3__Impl rule__CreateComposition__Group_4__4
            {
            pushFollow(FOLLOW_43);
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
    // InternalFeatureLangParser.g:4612:1: rule__CreateComposition__Group_4__3__Impl : ( Be ) ;
    public final void rule__CreateComposition__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4616:1: ( ( Be ) )
            // InternalFeatureLangParser.g:4617:1: ( Be )
            {
            // InternalFeatureLangParser.g:4617:1: ( Be )
            // InternalFeatureLangParser.g:4618:2: Be
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
    // InternalFeatureLangParser.g:4627:1: rule__CreateComposition__Group_4__4 : rule__CreateComposition__Group_4__4__Impl ;
    public final void rule__CreateComposition__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4631:1: ( rule__CreateComposition__Group_4__4__Impl )
            // InternalFeatureLangParser.g:4632:2: rule__CreateComposition__Group_4__4__Impl
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
    // InternalFeatureLangParser.g:4638:1: rule__CreateComposition__Group_4__4__Impl : ( ( rule__CreateComposition__PublicityAssignment_4_4 ) ) ;
    public final void rule__CreateComposition__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4642:1: ( ( ( rule__CreateComposition__PublicityAssignment_4_4 ) ) )
            // InternalFeatureLangParser.g:4643:1: ( ( rule__CreateComposition__PublicityAssignment_4_4 ) )
            {
            // InternalFeatureLangParser.g:4643:1: ( ( rule__CreateComposition__PublicityAssignment_4_4 ) )
            // InternalFeatureLangParser.g:4644:2: ( rule__CreateComposition__PublicityAssignment_4_4 )
            {
             before(grammarAccess.getCreateCompositionAccess().getPublicityAssignment_4_4()); 
            // InternalFeatureLangParser.g:4645:2: ( rule__CreateComposition__PublicityAssignment_4_4 )
            // InternalFeatureLangParser.g:4645:3: rule__CreateComposition__PublicityAssignment_4_4
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
    // InternalFeatureLangParser.g:4654:1: rule__EditComposition__Group__0 : rule__EditComposition__Group__0__Impl rule__EditComposition__Group__1 ;
    public final void rule__EditComposition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4658:1: ( rule__EditComposition__Group__0__Impl rule__EditComposition__Group__1 )
            // InternalFeatureLangParser.g:4659:2: rule__EditComposition__Group__0__Impl rule__EditComposition__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalFeatureLangParser.g:4666:1: rule__EditComposition__Group__0__Impl : ( ( Have )? ) ;
    public final void rule__EditComposition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4670:1: ( ( ( Have )? ) )
            // InternalFeatureLangParser.g:4671:1: ( ( Have )? )
            {
            // InternalFeatureLangParser.g:4671:1: ( ( Have )? )
            // InternalFeatureLangParser.g:4672:2: ( Have )?
            {
             before(grammarAccess.getEditCompositionAccess().getHaveKeyword_0()); 
            // InternalFeatureLangParser.g:4673:2: ( Have )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==Have) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalFeatureLangParser.g:4673:3: Have
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
    // InternalFeatureLangParser.g:4681:1: rule__EditComposition__Group__1 : rule__EditComposition__Group__1__Impl rule__EditComposition__Group__2 ;
    public final void rule__EditComposition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4685:1: ( rule__EditComposition__Group__1__Impl rule__EditComposition__Group__2 )
            // InternalFeatureLangParser.g:4686:2: rule__EditComposition__Group__1__Impl rule__EditComposition__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalFeatureLangParser.g:4693:1: rule__EditComposition__Group__1__Impl : ( Composition ) ;
    public final void rule__EditComposition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4697:1: ( ( Composition ) )
            // InternalFeatureLangParser.g:4698:1: ( Composition )
            {
            // InternalFeatureLangParser.g:4698:1: ( Composition )
            // InternalFeatureLangParser.g:4699:2: Composition
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
    // InternalFeatureLangParser.g:4708:1: rule__EditComposition__Group__2 : rule__EditComposition__Group__2__Impl rule__EditComposition__Group__3 ;
    public final void rule__EditComposition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4712:1: ( rule__EditComposition__Group__2__Impl rule__EditComposition__Group__3 )
            // InternalFeatureLangParser.g:4713:2: rule__EditComposition__Group__2__Impl rule__EditComposition__Group__3
            {
            pushFollow(FOLLOW_45);
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
    // InternalFeatureLangParser.g:4720:1: rule__EditComposition__Group__2__Impl : ( ( rule__EditComposition__CompositionNameAssignment_2 ) ) ;
    public final void rule__EditComposition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4724:1: ( ( ( rule__EditComposition__CompositionNameAssignment_2 ) ) )
            // InternalFeatureLangParser.g:4725:1: ( ( rule__EditComposition__CompositionNameAssignment_2 ) )
            {
            // InternalFeatureLangParser.g:4725:1: ( ( rule__EditComposition__CompositionNameAssignment_2 ) )
            // InternalFeatureLangParser.g:4726:2: ( rule__EditComposition__CompositionNameAssignment_2 )
            {
             before(grammarAccess.getEditCompositionAccess().getCompositionNameAssignment_2()); 
            // InternalFeatureLangParser.g:4727:2: ( rule__EditComposition__CompositionNameAssignment_2 )
            // InternalFeatureLangParser.g:4727:3: rule__EditComposition__CompositionNameAssignment_2
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
    // InternalFeatureLangParser.g:4735:1: rule__EditComposition__Group__3 : rule__EditComposition__Group__3__Impl rule__EditComposition__Group__4 ;
    public final void rule__EditComposition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4739:1: ( rule__EditComposition__Group__3__Impl rule__EditComposition__Group__4 )
            // InternalFeatureLangParser.g:4740:2: rule__EditComposition__Group__3__Impl rule__EditComposition__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalFeatureLangParser.g:4747:1: rule__EditComposition__Group__3__Impl : ( That ) ;
    public final void rule__EditComposition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4751:1: ( ( That ) )
            // InternalFeatureLangParser.g:4752:1: ( That )
            {
            // InternalFeatureLangParser.g:4752:1: ( That )
            // InternalFeatureLangParser.g:4753:2: That
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
    // InternalFeatureLangParser.g:4762:1: rule__EditComposition__Group__4 : rule__EditComposition__Group__4__Impl rule__EditComposition__Group__5 ;
    public final void rule__EditComposition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4766:1: ( rule__EditComposition__Group__4__Impl rule__EditComposition__Group__5 )
            // InternalFeatureLangParser.g:4767:2: rule__EditComposition__Group__4__Impl rule__EditComposition__Group__5
            {
            pushFollow(FOLLOW_43);
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
    // InternalFeatureLangParser.g:4774:1: rule__EditComposition__Group__4__Impl : ( Is ) ;
    public final void rule__EditComposition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4778:1: ( ( Is ) )
            // InternalFeatureLangParser.g:4779:1: ( Is )
            {
            // InternalFeatureLangParser.g:4779:1: ( Is )
            // InternalFeatureLangParser.g:4780:2: Is
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
    // InternalFeatureLangParser.g:4789:1: rule__EditComposition__Group__5 : rule__EditComposition__Group__5__Impl ;
    public final void rule__EditComposition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4793:1: ( rule__EditComposition__Group__5__Impl )
            // InternalFeatureLangParser.g:4794:2: rule__EditComposition__Group__5__Impl
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
    // InternalFeatureLangParser.g:4800:1: rule__EditComposition__Group__5__Impl : ( ( rule__EditComposition__PublicityAssignment_5 ) ) ;
    public final void rule__EditComposition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4804:1: ( ( ( rule__EditComposition__PublicityAssignment_5 ) ) )
            // InternalFeatureLangParser.g:4805:1: ( ( rule__EditComposition__PublicityAssignment_5 ) )
            {
            // InternalFeatureLangParser.g:4805:1: ( ( rule__EditComposition__PublicityAssignment_5 ) )
            // InternalFeatureLangParser.g:4806:2: ( rule__EditComposition__PublicityAssignment_5 )
            {
             before(grammarAccess.getEditCompositionAccess().getPublicityAssignment_5()); 
            // InternalFeatureLangParser.g:4807:2: ( rule__EditComposition__PublicityAssignment_5 )
            // InternalFeatureLangParser.g:4807:3: rule__EditComposition__PublicityAssignment_5
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
    // InternalFeatureLangParser.g:4816:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4820:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalFeatureLangParser.g:4821:2: rule__Class__Group__0__Impl rule__Class__Group__1
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
    // InternalFeatureLangParser.g:4828:1: rule__Class__Group__0__Impl : ( ( rule__Class__Alternatives_0 )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4832:1: ( ( ( rule__Class__Alternatives_0 )? ) )
            // InternalFeatureLangParser.g:4833:1: ( ( rule__Class__Alternatives_0 )? )
            {
            // InternalFeatureLangParser.g:4833:1: ( ( rule__Class__Alternatives_0 )? )
            // InternalFeatureLangParser.g:4834:2: ( rule__Class__Alternatives_0 )?
            {
             before(grammarAccess.getClassAccess().getAlternatives_0()); 
            // InternalFeatureLangParser.g:4835:2: ( rule__Class__Alternatives_0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==The||LA44_0==A) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalFeatureLangParser.g:4835:3: rule__Class__Alternatives_0
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
    // InternalFeatureLangParser.g:4843:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4847:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalFeatureLangParser.g:4848:2: rule__Class__Group__1__Impl rule__Class__Group__2
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
    // InternalFeatureLangParser.g:4855:1: rule__Class__Group__1__Impl : ( ( rule__Class__AbstractionAssignment_1 )? ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4859:1: ( ( ( rule__Class__AbstractionAssignment_1 )? ) )
            // InternalFeatureLangParser.g:4860:1: ( ( rule__Class__AbstractionAssignment_1 )? )
            {
            // InternalFeatureLangParser.g:4860:1: ( ( rule__Class__AbstractionAssignment_1 )? )
            // InternalFeatureLangParser.g:4861:2: ( rule__Class__AbstractionAssignment_1 )?
            {
             before(grammarAccess.getClassAccess().getAbstractionAssignment_1()); 
            // InternalFeatureLangParser.g:4862:2: ( rule__Class__AbstractionAssignment_1 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==Abstract||LA45_0==New) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalFeatureLangParser.g:4862:3: rule__Class__AbstractionAssignment_1
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
    // InternalFeatureLangParser.g:4870:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4874:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalFeatureLangParser.g:4875:2: rule__Class__Group__2__Impl rule__Class__Group__3
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
    // InternalFeatureLangParser.g:4882:1: rule__Class__Group__2__Impl : ( ( Class )? ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4886:1: ( ( ( Class )? ) )
            // InternalFeatureLangParser.g:4887:1: ( ( Class )? )
            {
            // InternalFeatureLangParser.g:4887:1: ( ( Class )? )
            // InternalFeatureLangParser.g:4888:2: ( Class )?
            {
             before(grammarAccess.getClassAccess().getClassKeyword_2()); 
            // InternalFeatureLangParser.g:4889:2: ( Class )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==Class) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalFeatureLangParser.g:4889:3: Class
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
    // InternalFeatureLangParser.g:4897:1: rule__Class__Group__3 : rule__Class__Group__3__Impl ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4901:1: ( rule__Class__Group__3__Impl )
            // InternalFeatureLangParser.g:4902:2: rule__Class__Group__3__Impl
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
    // InternalFeatureLangParser.g:4908:1: rule__Class__Group__3__Impl : ( ( rule__Class__NameAssignment_3 ) ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4912:1: ( ( ( rule__Class__NameAssignment_3 ) ) )
            // InternalFeatureLangParser.g:4913:1: ( ( rule__Class__NameAssignment_3 ) )
            {
            // InternalFeatureLangParser.g:4913:1: ( ( rule__Class__NameAssignment_3 ) )
            // InternalFeatureLangParser.g:4914:2: ( rule__Class__NameAssignment_3 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_3()); 
            // InternalFeatureLangParser.g:4915:2: ( rule__Class__NameAssignment_3 )
            // InternalFeatureLangParser.g:4915:3: rule__Class__NameAssignment_3
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
    // InternalFeatureLangParser.g:4924:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4928:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalFeatureLangParser.g:4929:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalFeatureLangParser.g:4936:1: rule__Attribute__Group__0__Impl : ( ( Attribute )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4940:1: ( ( ( Attribute )? ) )
            // InternalFeatureLangParser.g:4941:1: ( ( Attribute )? )
            {
            // InternalFeatureLangParser.g:4941:1: ( ( Attribute )? )
            // InternalFeatureLangParser.g:4942:2: ( Attribute )?
            {
             before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
            // InternalFeatureLangParser.g:4943:2: ( Attribute )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==Attribute) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalFeatureLangParser.g:4943:3: Attribute
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
    // InternalFeatureLangParser.g:4951:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4955:1: ( rule__Attribute__Group__1__Impl )
            // InternalFeatureLangParser.g:4956:2: rule__Attribute__Group__1__Impl
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
    // InternalFeatureLangParser.g:4962:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4966:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalFeatureLangParser.g:4967:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalFeatureLangParser.g:4967:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalFeatureLangParser.g:4968:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalFeatureLangParser.g:4969:2: ( rule__Attribute__NameAssignment_1 )
            // InternalFeatureLangParser.g:4969:3: rule__Attribute__NameAssignment_1
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
    // InternalFeatureLangParser.g:4978:1: rule__Identifier__Group__0 : rule__Identifier__Group__0__Impl rule__Identifier__Group__1 ;
    public final void rule__Identifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4982:1: ( rule__Identifier__Group__0__Impl rule__Identifier__Group__1 )
            // InternalFeatureLangParser.g:4983:2: rule__Identifier__Group__0__Impl rule__Identifier__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalFeatureLangParser.g:4990:1: rule__Identifier__Group__0__Impl : ( ( rule__Identifier__ValueAssignment_0 ) ) ;
    public final void rule__Identifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4994:1: ( ( ( rule__Identifier__ValueAssignment_0 ) ) )
            // InternalFeatureLangParser.g:4995:1: ( ( rule__Identifier__ValueAssignment_0 ) )
            {
            // InternalFeatureLangParser.g:4995:1: ( ( rule__Identifier__ValueAssignment_0 ) )
            // InternalFeatureLangParser.g:4996:2: ( rule__Identifier__ValueAssignment_0 )
            {
             before(grammarAccess.getIdentifierAccess().getValueAssignment_0()); 
            // InternalFeatureLangParser.g:4997:2: ( rule__Identifier__ValueAssignment_0 )
            // InternalFeatureLangParser.g:4997:3: rule__Identifier__ValueAssignment_0
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
    // InternalFeatureLangParser.g:5005:1: rule__Identifier__Group__1 : rule__Identifier__Group__1__Impl ;
    public final void rule__Identifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5009:1: ( rule__Identifier__Group__1__Impl )
            // InternalFeatureLangParser.g:5010:2: rule__Identifier__Group__1__Impl
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
    // InternalFeatureLangParser.g:5016:1: rule__Identifier__Group__1__Impl : ( ( rule__Identifier__NameAssignment_1 ) ) ;
    public final void rule__Identifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5020:1: ( ( ( rule__Identifier__NameAssignment_1 ) ) )
            // InternalFeatureLangParser.g:5021:1: ( ( rule__Identifier__NameAssignment_1 ) )
            {
            // InternalFeatureLangParser.g:5021:1: ( ( rule__Identifier__NameAssignment_1 ) )
            // InternalFeatureLangParser.g:5022:2: ( rule__Identifier__NameAssignment_1 )
            {
             before(grammarAccess.getIdentifierAccess().getNameAssignment_1()); 
            // InternalFeatureLangParser.g:5023:2: ( rule__Identifier__NameAssignment_1 )
            // InternalFeatureLangParser.g:5023:3: rule__Identifier__NameAssignment_1
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
    // InternalFeatureLangParser.g:5032:1: rule__AttributeValue__Group_0__0 : rule__AttributeValue__Group_0__0__Impl rule__AttributeValue__Group_0__1 ;
    public final void rule__AttributeValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5036:1: ( rule__AttributeValue__Group_0__0__Impl rule__AttributeValue__Group_0__1 )
            // InternalFeatureLangParser.g:5037:2: rule__AttributeValue__Group_0__0__Impl rule__AttributeValue__Group_0__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalFeatureLangParser.g:5044:1: rule__AttributeValue__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__AttributeValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5048:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:5049:1: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:5049:1: ( RULE_ID )
            // InternalFeatureLangParser.g:5050:2: RULE_ID
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
    // InternalFeatureLangParser.g:5059:1: rule__AttributeValue__Group_0__1 : rule__AttributeValue__Group_0__1__Impl ;
    public final void rule__AttributeValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5063:1: ( rule__AttributeValue__Group_0__1__Impl )
            // InternalFeatureLangParser.g:5064:2: rule__AttributeValue__Group_0__1__Impl
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
    // InternalFeatureLangParser.g:5070:1: rule__AttributeValue__Group_0__1__Impl : ( ( CarriageReturn )? ) ;
    public final void rule__AttributeValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5074:1: ( ( ( CarriageReturn )? ) )
            // InternalFeatureLangParser.g:5075:1: ( ( CarriageReturn )? )
            {
            // InternalFeatureLangParser.g:5075:1: ( ( CarriageReturn )? )
            // InternalFeatureLangParser.g:5076:2: ( CarriageReturn )?
            {
             before(grammarAccess.getAttributeValueAccess().getCarriageReturnKeyword_0_1()); 
            // InternalFeatureLangParser.g:5077:2: ( CarriageReturn )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==CarriageReturn) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalFeatureLangParser.g:5077:3: CarriageReturn
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
    // InternalFeatureLangParser.g:5086:1: rule__FeatureRequest__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__FeatureRequest__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5090:1: ( ( ruleStatement ) )
            // InternalFeatureLangParser.g:5091:2: ( ruleStatement )
            {
            // InternalFeatureLangParser.g:5091:2: ( ruleStatement )
            // InternalFeatureLangParser.g:5092:3: ruleStatement
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
    // InternalFeatureLangParser.g:5101:1: rule__ChangeStatement__TargetAssignment_0_0_0 : ( ruleClass ) ;
    public final void rule__ChangeStatement__TargetAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5105:1: ( ( ruleClass ) )
            // InternalFeatureLangParser.g:5106:2: ( ruleClass )
            {
            // InternalFeatureLangParser.g:5106:2: ( ruleClass )
            // InternalFeatureLangParser.g:5107:3: ruleClass
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
    // InternalFeatureLangParser.g:5116:1: rule__ChangeStatement__PriorityAssignment_0_0_1_0 : ( rulePriority ) ;
    public final void rule__ChangeStatement__PriorityAssignment_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5120:1: ( ( rulePriority ) )
            // InternalFeatureLangParser.g:5121:2: ( rulePriority )
            {
            // InternalFeatureLangParser.g:5121:2: ( rulePriority )
            // InternalFeatureLangParser.g:5122:3: rulePriority
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
    // InternalFeatureLangParser.g:5131:1: rule__ChangeStatement__NegationAssignment_0_0_1_1 : ( ( Not ) ) ;
    public final void rule__ChangeStatement__NegationAssignment_0_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5135:1: ( ( ( Not ) ) )
            // InternalFeatureLangParser.g:5136:2: ( ( Not ) )
            {
            // InternalFeatureLangParser.g:5136:2: ( ( Not ) )
            // InternalFeatureLangParser.g:5137:3: ( Not )
            {
             before(grammarAccess.getChangeStatementAccess().getNegationNotKeyword_0_0_1_1_0()); 
            // InternalFeatureLangParser.g:5138:3: ( Not )
            // InternalFeatureLangParser.g:5139:4: Not
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
    // InternalFeatureLangParser.g:5150:1: rule__ChangeStatement__NegationAssignment_0_1_0_2 : ( ( Remove ) ) ;
    public final void rule__ChangeStatement__NegationAssignment_0_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5154:1: ( ( ( Remove ) ) )
            // InternalFeatureLangParser.g:5155:2: ( ( Remove ) )
            {
            // InternalFeatureLangParser.g:5155:2: ( ( Remove ) )
            // InternalFeatureLangParser.g:5156:3: ( Remove )
            {
             before(grammarAccess.getChangeStatementAccess().getNegationRemoveKeyword_0_1_0_2_0()); 
            // InternalFeatureLangParser.g:5157:3: ( Remove )
            // InternalFeatureLangParser.g:5158:4: Remove
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
    // InternalFeatureLangParser.g:5169:1: rule__ChangeStatement__TargetAssignment_0_1_2 : ( ruleClass ) ;
    public final void rule__ChangeStatement__TargetAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5173:1: ( ( ruleClass ) )
            // InternalFeatureLangParser.g:5174:2: ( ruleClass )
            {
            // InternalFeatureLangParser.g:5174:2: ( ruleClass )
            // InternalFeatureLangParser.g:5175:3: ruleClass
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
    // InternalFeatureLangParser.g:5184:1: rule__ChangeStatement__ActionAssignment_1_0 : ( ruleAction ) ;
    public final void rule__ChangeStatement__ActionAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5188:1: ( ( ruleAction ) )
            // InternalFeatureLangParser.g:5189:2: ( ruleAction )
            {
            // InternalFeatureLangParser.g:5189:2: ( ruleAction )
            // InternalFeatureLangParser.g:5190:3: ruleAction
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
    // InternalFeatureLangParser.g:5199:1: rule__ChangeStatement__UpdateAssignment_1_1 : ( ruleUpdateAction ) ;
    public final void rule__ChangeStatement__UpdateAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5203:1: ( ( ruleUpdateAction ) )
            // InternalFeatureLangParser.g:5204:2: ( ruleUpdateAction )
            {
            // InternalFeatureLangParser.g:5204:2: ( ruleUpdateAction )
            // InternalFeatureLangParser.g:5205:3: ruleUpdateAction
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
    // InternalFeatureLangParser.g:5214:1: rule__CreationStatement__ClassElementAssignment_0_0 : ( ruleClass ) ;
    public final void rule__CreationStatement__ClassElementAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5218:1: ( ( ruleClass ) )
            // InternalFeatureLangParser.g:5219:2: ( ruleClass )
            {
            // InternalFeatureLangParser.g:5219:2: ( ruleClass )
            // InternalFeatureLangParser.g:5220:3: ruleClass
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
    // InternalFeatureLangParser.g:5229:1: rule__CreationStatement__PriorityAssignment_0_1 : ( rulePriority ) ;
    public final void rule__CreationStatement__PriorityAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5233:1: ( ( rulePriority ) )
            // InternalFeatureLangParser.g:5234:2: ( rulePriority )
            {
            // InternalFeatureLangParser.g:5234:2: ( rulePriority )
            // InternalFeatureLangParser.g:5235:3: rulePriority
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
    // InternalFeatureLangParser.g:5244:1: rule__CreationStatement__NegationAssignment_0_2 : ( ( Not ) ) ;
    public final void rule__CreationStatement__NegationAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5248:1: ( ( ( Not ) ) )
            // InternalFeatureLangParser.g:5249:2: ( ( Not ) )
            {
            // InternalFeatureLangParser.g:5249:2: ( ( Not ) )
            // InternalFeatureLangParser.g:5250:3: ( Not )
            {
             before(grammarAccess.getCreationStatementAccess().getNegationNotKeyword_0_2_0()); 
            // InternalFeatureLangParser.g:5251:3: ( Not )
            // InternalFeatureLangParser.g:5252:4: Not
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
    // InternalFeatureLangParser.g:5263:1: rule__CreationStatement__NegationAssignment_1_0_1 : ( ( Delete ) ) ;
    public final void rule__CreationStatement__NegationAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5267:1: ( ( ( Delete ) ) )
            // InternalFeatureLangParser.g:5268:2: ( ( Delete ) )
            {
            // InternalFeatureLangParser.g:5268:2: ( ( Delete ) )
            // InternalFeatureLangParser.g:5269:3: ( Delete )
            {
             before(grammarAccess.getCreationStatementAccess().getNegationDeleteKeyword_1_0_1_0()); 
            // InternalFeatureLangParser.g:5270:3: ( Delete )
            // InternalFeatureLangParser.g:5271:4: Delete
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
    // InternalFeatureLangParser.g:5282:1: rule__CreationStatement__ClassElementAssignment_1_1 : ( ruleClass ) ;
    public final void rule__CreationStatement__ClassElementAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5286:1: ( ( ruleClass ) )
            // InternalFeatureLangParser.g:5287:2: ( ruleClass )
            {
            // InternalFeatureLangParser.g:5287:2: ( ruleClass )
            // InternalFeatureLangParser.g:5288:3: ruleClass
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
    // InternalFeatureLangParser.g:5297:1: rule__Action__TypeAssignment : ( ( rule__Action__TypeAlternatives_0 ) ) ;
    public final void rule__Action__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5301:1: ( ( ( rule__Action__TypeAlternatives_0 ) ) )
            // InternalFeatureLangParser.g:5302:2: ( ( rule__Action__TypeAlternatives_0 ) )
            {
            // InternalFeatureLangParser.g:5302:2: ( ( rule__Action__TypeAlternatives_0 ) )
            // InternalFeatureLangParser.g:5303:3: ( rule__Action__TypeAlternatives_0 )
            {
             before(grammarAccess.getActionAccess().getTypeAlternatives_0()); 
            // InternalFeatureLangParser.g:5304:3: ( rule__Action__TypeAlternatives_0 )
            // InternalFeatureLangParser.g:5304:4: rule__Action__TypeAlternatives_0
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
    // InternalFeatureLangParser.g:5312:1: rule__UpdateAction__AttributeAssignment_3 : ( ruleAttribute ) ;
    public final void rule__UpdateAction__AttributeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5316:1: ( ( ruleAttribute ) )
            // InternalFeatureLangParser.g:5317:2: ( ruleAttribute )
            {
            // InternalFeatureLangParser.g:5317:2: ( ruleAttribute )
            // InternalFeatureLangParser.g:5318:3: ruleAttribute
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
    // InternalFeatureLangParser.g:5327:1: rule__UpdateAction__PriorityAssignment_6 : ( rulePriority ) ;
    public final void rule__UpdateAction__PriorityAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5331:1: ( ( rulePriority ) )
            // InternalFeatureLangParser.g:5332:2: ( rulePriority )
            {
            // InternalFeatureLangParser.g:5332:2: ( rulePriority )
            // InternalFeatureLangParser.g:5333:3: rulePriority
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
    // InternalFeatureLangParser.g:5342:1: rule__UpdateAction__DatatypeAssignment_7_0 : ( ruleUpdateAttributeDatatype ) ;
    public final void rule__UpdateAction__DatatypeAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5346:1: ( ( ruleUpdateAttributeDatatype ) )
            // InternalFeatureLangParser.g:5347:2: ( ruleUpdateAttributeDatatype )
            {
            // InternalFeatureLangParser.g:5347:2: ( ruleUpdateAttributeDatatype )
            // InternalFeatureLangParser.g:5348:3: ruleUpdateAttributeDatatype
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
    // InternalFeatureLangParser.g:5357:1: rule__UpdateAction__IdentifierAssignment_7_1 : ( ruleUpdateAttributeIdentifier ) ;
    public final void rule__UpdateAction__IdentifierAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5361:1: ( ( ruleUpdateAttributeIdentifier ) )
            // InternalFeatureLangParser.g:5362:2: ( ruleUpdateAttributeIdentifier )
            {
            // InternalFeatureLangParser.g:5362:2: ( ruleUpdateAttributeIdentifier )
            // InternalFeatureLangParser.g:5363:3: ruleUpdateAttributeIdentifier
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
    // InternalFeatureLangParser.g:5372:1: rule__UpdateAction__ValueAssignment_7_2 : ( ruleUpdateAttributeValue ) ;
    public final void rule__UpdateAction__ValueAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5376:1: ( ( ruleUpdateAttributeValue ) )
            // InternalFeatureLangParser.g:5377:2: ( ruleUpdateAttributeValue )
            {
            // InternalFeatureLangParser.g:5377:2: ( ruleUpdateAttributeValue )
            // InternalFeatureLangParser.g:5378:3: ruleUpdateAttributeValue
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
    // InternalFeatureLangParser.g:5387:1: rule__UpdateAttributeDatatype__TypeAssignment_2 : ( ruleDatatype ) ;
    public final void rule__UpdateAttributeDatatype__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5391:1: ( ( ruleDatatype ) )
            // InternalFeatureLangParser.g:5392:2: ( ruleDatatype )
            {
            // InternalFeatureLangParser.g:5392:2: ( ruleDatatype )
            // InternalFeatureLangParser.g:5393:3: ruleDatatype
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


    // $ANTLR start "rule__UpdateAttributeDatatype__OldTypeAssignment_5"
    // InternalFeatureLangParser.g:5402:1: rule__UpdateAttributeDatatype__OldTypeAssignment_5 : ( ruleDatatype ) ;
    public final void rule__UpdateAttributeDatatype__OldTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5406:1: ( ( ruleDatatype ) )
            // InternalFeatureLangParser.g:5407:2: ( ruleDatatype )
            {
            // InternalFeatureLangParser.g:5407:2: ( ruleDatatype )
            // InternalFeatureLangParser.g:5408:3: ruleDatatype
            {
             before(grammarAccess.getUpdateAttributeDatatypeAccess().getOldTypeDatatypeEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDatatype();

            state._fsp--;

             after(grammarAccess.getUpdateAttributeDatatypeAccess().getOldTypeDatatypeEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAttributeDatatype__OldTypeAssignment_5"


    // $ANTLR start "rule__UpdateAttributeIdentifier__IdentifierAssignment_2"
    // InternalFeatureLangParser.g:5417:1: rule__UpdateAttributeIdentifier__IdentifierAssignment_2 : ( ruleIdentifier ) ;
    public final void rule__UpdateAttributeIdentifier__IdentifierAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5421:1: ( ( ruleIdentifier ) )
            // InternalFeatureLangParser.g:5422:2: ( ruleIdentifier )
            {
            // InternalFeatureLangParser.g:5422:2: ( ruleIdentifier )
            // InternalFeatureLangParser.g:5423:3: ruleIdentifier
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


    // $ANTLR start "rule__UpdateAttributeIdentifier__OldIdentifierAssignment_5"
    // InternalFeatureLangParser.g:5432:1: rule__UpdateAttributeIdentifier__OldIdentifierAssignment_5 : ( ruleIdentifier ) ;
    public final void rule__UpdateAttributeIdentifier__OldIdentifierAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5436:1: ( ( ruleIdentifier ) )
            // InternalFeatureLangParser.g:5437:2: ( ruleIdentifier )
            {
            // InternalFeatureLangParser.g:5437:2: ( ruleIdentifier )
            // InternalFeatureLangParser.g:5438:3: ruleIdentifier
            {
             before(grammarAccess.getUpdateAttributeIdentifierAccess().getOldIdentifierIdentifierParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getUpdateAttributeIdentifierAccess().getOldIdentifierIdentifierParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAttributeIdentifier__OldIdentifierAssignment_5"


    // $ANTLR start "rule__UpdateAttributeValue__ValueAssignment_3"
    // InternalFeatureLangParser.g:5447:1: rule__UpdateAttributeValue__ValueAssignment_3 : ( ruleAttributeValue ) ;
    public final void rule__UpdateAttributeValue__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5451:1: ( ( ruleAttributeValue ) )
            // InternalFeatureLangParser.g:5452:2: ( ruleAttributeValue )
            {
            // InternalFeatureLangParser.g:5452:2: ( ruleAttributeValue )
            // InternalFeatureLangParser.g:5453:3: ruleAttributeValue
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


    // $ANTLR start "rule__UpdateAttributeValue__OldValueAssignment_6"
    // InternalFeatureLangParser.g:5462:1: rule__UpdateAttributeValue__OldValueAssignment_6 : ( ruleAttributeValue ) ;
    public final void rule__UpdateAttributeValue__OldValueAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5466:1: ( ( ruleAttributeValue ) )
            // InternalFeatureLangParser.g:5467:2: ( ruleAttributeValue )
            {
            // InternalFeatureLangParser.g:5467:2: ( ruleAttributeValue )
            // InternalFeatureLangParser.g:5468:3: ruleAttributeValue
            {
             before(grammarAccess.getUpdateAttributeValueAccess().getOldValueAttributeValueParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeValue();

            state._fsp--;

             after(grammarAccess.getUpdateAttributeValueAccess().getOldValueAttributeValueParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAttributeValue__OldValueAssignment_6"


    // $ANTLR start "rule__AttributeAction__AttributeAssignment_2"
    // InternalFeatureLangParser.g:5477:1: rule__AttributeAction__AttributeAssignment_2 : ( ruleAttribute ) ;
    public final void rule__AttributeAction__AttributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5481:1: ( ( ruleAttribute ) )
            // InternalFeatureLangParser.g:5482:2: ( ruleAttribute )
            {
            // InternalFeatureLangParser.g:5482:2: ( ruleAttribute )
            // InternalFeatureLangParser.g:5483:3: ruleAttribute
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
    // InternalFeatureLangParser.g:5492:1: rule__AttributeAction__TypeAssignment_3_4 : ( ruleDatatype ) ;
    public final void rule__AttributeAction__TypeAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5496:1: ( ( ruleDatatype ) )
            // InternalFeatureLangParser.g:5497:2: ( ruleDatatype )
            {
            // InternalFeatureLangParser.g:5497:2: ( ruleDatatype )
            // InternalFeatureLangParser.g:5498:3: ruleDatatype
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


    // $ANTLR start "rule__AttributeAction__ValueAssignment_4_5"
    // InternalFeatureLangParser.g:5507:1: rule__AttributeAction__ValueAssignment_4_5 : ( ruleAttributeValue ) ;
    public final void rule__AttributeAction__ValueAssignment_4_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5511:1: ( ( ruleAttributeValue ) )
            // InternalFeatureLangParser.g:5512:2: ( ruleAttributeValue )
            {
            // InternalFeatureLangParser.g:5512:2: ( ruleAttributeValue )
            // InternalFeatureLangParser.g:5513:3: ruleAttributeValue
            {
             before(grammarAccess.getAttributeActionAccess().getValueAttributeValueParserRuleCall_4_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeValue();

            state._fsp--;

             after(grammarAccess.getAttributeActionAccess().getValueAttributeValueParserRuleCall_4_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAction__ValueAssignment_4_5"


    // $ANTLR start "rule__AssociationAction__CreateAssignment_2_0"
    // InternalFeatureLangParser.g:5522:1: rule__AssociationAction__CreateAssignment_2_0 : ( ruleCreateAssociation ) ;
    public final void rule__AssociationAction__CreateAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5526:1: ( ( ruleCreateAssociation ) )
            // InternalFeatureLangParser.g:5527:2: ( ruleCreateAssociation )
            {
            // InternalFeatureLangParser.g:5527:2: ( ruleCreateAssociation )
            // InternalFeatureLangParser.g:5528:3: ruleCreateAssociation
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
    // InternalFeatureLangParser.g:5537:1: rule__AssociationAction__NameAssignment_2_1_0 : ( RULE_ID ) ;
    public final void rule__AssociationAction__NameAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5541:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:5542:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:5542:2: ( RULE_ID )
            // InternalFeatureLangParser.g:5543:3: RULE_ID
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
    // InternalFeatureLangParser.g:5552:1: rule__AssociationAction__EditAssignment_2_1_1 : ( ruleEditAssociation ) ;
    public final void rule__AssociationAction__EditAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5556:1: ( ( ruleEditAssociation ) )
            // InternalFeatureLangParser.g:5557:2: ( ruleEditAssociation )
            {
            // InternalFeatureLangParser.g:5557:2: ( ruleEditAssociation )
            // InternalFeatureLangParser.g:5558:3: ruleEditAssociation
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
    // InternalFeatureLangParser.g:5567:1: rule__CreateAssociation__TargetAssignment_2 : ( ruleClass ) ;
    public final void rule__CreateAssociation__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5571:1: ( ( ruleClass ) )
            // InternalFeatureLangParser.g:5572:2: ( ruleClass )
            {
            // InternalFeatureLangParser.g:5572:2: ( ruleClass )
            // InternalFeatureLangParser.g:5573:3: ruleClass
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
    // InternalFeatureLangParser.g:5582:1: rule__CreateAssociation__RelationAssignment_4 : ( RULE_ID ) ;
    public final void rule__CreateAssociation__RelationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5586:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:5587:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:5587:2: ( RULE_ID )
            // InternalFeatureLangParser.g:5588:3: RULE_ID
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
    // InternalFeatureLangParser.g:5597:1: rule__EditAssociation__TypeAssignment : ( ( rule__EditAssociation__TypeAlternatives_0 ) ) ;
    public final void rule__EditAssociation__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5601:1: ( ( ( rule__EditAssociation__TypeAlternatives_0 ) ) )
            // InternalFeatureLangParser.g:5602:2: ( ( rule__EditAssociation__TypeAlternatives_0 ) )
            {
            // InternalFeatureLangParser.g:5602:2: ( ( rule__EditAssociation__TypeAlternatives_0 ) )
            // InternalFeatureLangParser.g:5603:3: ( rule__EditAssociation__TypeAlternatives_0 )
            {
             before(grammarAccess.getEditAssociationAccess().getTypeAlternatives_0()); 
            // InternalFeatureLangParser.g:5604:3: ( rule__EditAssociation__TypeAlternatives_0 )
            // InternalFeatureLangParser.g:5604:4: rule__EditAssociation__TypeAlternatives_0
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
    // InternalFeatureLangParser.g:5612:1: rule__SetCompatible__NameAssignment_3 : ( RULE_DATE ) ;
    public final void rule__SetCompatible__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5616:1: ( ( RULE_DATE ) )
            // InternalFeatureLangParser.g:5617:2: ( RULE_DATE )
            {
            // InternalFeatureLangParser.g:5617:2: ( RULE_DATE )
            // InternalFeatureLangParser.g:5618:3: RULE_DATE
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
    // InternalFeatureLangParser.g:5627:1: rule__SetVersionRange__StartAssignment_4 : ( RULE_DATE ) ;
    public final void rule__SetVersionRange__StartAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5631:1: ( ( RULE_DATE ) )
            // InternalFeatureLangParser.g:5632:2: ( RULE_DATE )
            {
            // InternalFeatureLangParser.g:5632:2: ( RULE_DATE )
            // InternalFeatureLangParser.g:5633:3: RULE_DATE
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
    // InternalFeatureLangParser.g:5642:1: rule__SetVersionRange__EndAssignment_6 : ( RULE_DATE ) ;
    public final void rule__SetVersionRange__EndAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5646:1: ( ( RULE_DATE ) )
            // InternalFeatureLangParser.g:5647:2: ( RULE_DATE )
            {
            // InternalFeatureLangParser.g:5647:2: ( RULE_DATE )
            // InternalFeatureLangParser.g:5648:3: RULE_DATE
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
    // InternalFeatureLangParser.g:5657:1: rule__SetVariant__NameAssignment_5 : ( RULE_DATE ) ;
    public final void rule__SetVariant__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5661:1: ( ( RULE_DATE ) )
            // InternalFeatureLangParser.g:5662:2: ( RULE_DATE )
            {
            // InternalFeatureLangParser.g:5662:2: ( RULE_DATE )
            // InternalFeatureLangParser.g:5663:3: RULE_DATE
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
    // InternalFeatureLangParser.g:5672:1: rule__SetRightOpen__DateAssignment_3 : ( RULE_DATE ) ;
    public final void rule__SetRightOpen__DateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5676:1: ( ( RULE_DATE ) )
            // InternalFeatureLangParser.g:5677:2: ( RULE_DATE )
            {
            // InternalFeatureLangParser.g:5677:2: ( RULE_DATE )
            // InternalFeatureLangParser.g:5678:3: RULE_DATE
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
    // InternalFeatureLangParser.g:5687:1: rule__SetLeftOpen__DateAssignment_3 : ( RULE_DATE ) ;
    public final void rule__SetLeftOpen__DateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5691:1: ( ( RULE_DATE ) )
            // InternalFeatureLangParser.g:5692:2: ( RULE_DATE )
            {
            // InternalFeatureLangParser.g:5692:2: ( RULE_DATE )
            // InternalFeatureLangParser.g:5693:3: RULE_DATE
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
    // InternalFeatureLangParser.g:5702:1: rule__InheritanceAction__ParentAssignment_2 : ( ruleClass ) ;
    public final void rule__InheritanceAction__ParentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5706:1: ( ( ruleClass ) )
            // InternalFeatureLangParser.g:5707:2: ( ruleClass )
            {
            // InternalFeatureLangParser.g:5707:2: ( ruleClass )
            // InternalFeatureLangParser.g:5708:3: ruleClass
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
    // InternalFeatureLangParser.g:5717:1: rule__CompositionAction__CreateAssignment_0 : ( ruleCreateComposition ) ;
    public final void rule__CompositionAction__CreateAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5721:1: ( ( ruleCreateComposition ) )
            // InternalFeatureLangParser.g:5722:2: ( ruleCreateComposition )
            {
            // InternalFeatureLangParser.g:5722:2: ( ruleCreateComposition )
            // InternalFeatureLangParser.g:5723:3: ruleCreateComposition
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
    // InternalFeatureLangParser.g:5732:1: rule__CompositionAction__EditAssignment_1 : ( ruleEditComposition ) ;
    public final void rule__CompositionAction__EditAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5736:1: ( ( ruleEditComposition ) )
            // InternalFeatureLangParser.g:5737:2: ( ruleEditComposition )
            {
            // InternalFeatureLangParser.g:5737:2: ( ruleEditComposition )
            // InternalFeatureLangParser.g:5738:3: ruleEditComposition
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
    // InternalFeatureLangParser.g:5747:1: rule__CreateComposition__TargetAssignment_1 : ( ruleClass ) ;
    public final void rule__CreateComposition__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5751:1: ( ( ruleClass ) )
            // InternalFeatureLangParser.g:5752:2: ( ruleClass )
            {
            // InternalFeatureLangParser.g:5752:2: ( ruleClass )
            // InternalFeatureLangParser.g:5753:3: ruleClass
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
    // InternalFeatureLangParser.g:5762:1: rule__CreateComposition__RelationAssignment_3 : ( RULE_ID ) ;
    public final void rule__CreateComposition__RelationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5766:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:5767:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:5767:2: ( RULE_ID )
            // InternalFeatureLangParser.g:5768:3: RULE_ID
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
    // InternalFeatureLangParser.g:5777:1: rule__CreateComposition__PriorityAssignment_4_2 : ( rulePriority ) ;
    public final void rule__CreateComposition__PriorityAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5781:1: ( ( rulePriority ) )
            // InternalFeatureLangParser.g:5782:2: ( rulePriority )
            {
            // InternalFeatureLangParser.g:5782:2: ( rulePriority )
            // InternalFeatureLangParser.g:5783:3: rulePriority
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
    // InternalFeatureLangParser.g:5792:1: rule__CreateComposition__PublicityAssignment_4_4 : ( rulePublicity ) ;
    public final void rule__CreateComposition__PublicityAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5796:1: ( ( rulePublicity ) )
            // InternalFeatureLangParser.g:5797:2: ( rulePublicity )
            {
            // InternalFeatureLangParser.g:5797:2: ( rulePublicity )
            // InternalFeatureLangParser.g:5798:3: rulePublicity
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
    // InternalFeatureLangParser.g:5807:1: rule__EditComposition__CompositionNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EditComposition__CompositionNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5811:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:5812:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:5812:2: ( RULE_ID )
            // InternalFeatureLangParser.g:5813:3: RULE_ID
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
    // InternalFeatureLangParser.g:5822:1: rule__EditComposition__PublicityAssignment_5 : ( rulePublicity ) ;
    public final void rule__EditComposition__PublicityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5826:1: ( ( rulePublicity ) )
            // InternalFeatureLangParser.g:5827:2: ( rulePublicity )
            {
            // InternalFeatureLangParser.g:5827:2: ( rulePublicity )
            // InternalFeatureLangParser.g:5828:3: rulePublicity
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
    // InternalFeatureLangParser.g:5837:1: rule__Class__AbstractionAssignment_1 : ( ruleAbstraction ) ;
    public final void rule__Class__AbstractionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5841:1: ( ( ruleAbstraction ) )
            // InternalFeatureLangParser.g:5842:2: ( ruleAbstraction )
            {
            // InternalFeatureLangParser.g:5842:2: ( ruleAbstraction )
            // InternalFeatureLangParser.g:5843:3: ruleAbstraction
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
    // InternalFeatureLangParser.g:5852:1: rule__Class__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5856:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:5857:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:5857:2: ( RULE_ID )
            // InternalFeatureLangParser.g:5858:3: RULE_ID
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
    // InternalFeatureLangParser.g:5867:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5871:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:5872:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:5872:2: ( RULE_ID )
            // InternalFeatureLangParser.g:5873:3: RULE_ID
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
    // InternalFeatureLangParser.g:5882:1: rule__Identifier__ValueAssignment_0 : ( ruleIdentifierValue ) ;
    public final void rule__Identifier__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5886:1: ( ( ruleIdentifierValue ) )
            // InternalFeatureLangParser.g:5887:2: ( ruleIdentifierValue )
            {
            // InternalFeatureLangParser.g:5887:2: ( ruleIdentifierValue )
            // InternalFeatureLangParser.g:5888:3: ruleIdentifierValue
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
    // InternalFeatureLangParser.g:5897:1: rule__Identifier__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Identifier__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5901:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:5902:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:5902:2: ( RULE_ID )
            // InternalFeatureLangParser.g:5903:3: RULE_ID
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
    // InternalFeatureLangParser.g:5912:1: rule__Priority__PriorityAssignment : ( rulePriorityValue ) ;
    public final void rule__Priority__PriorityAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5916:1: ( ( rulePriorityValue ) )
            // InternalFeatureLangParser.g:5917:2: ( rulePriorityValue )
            {
            // InternalFeatureLangParser.g:5917:2: ( rulePriorityValue )
            // InternalFeatureLangParser.g:5918:3: rulePriorityValue
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
            return "1059:1: rule__Statement__Alternatives_0 : ( ( ruleChangeStatement ) | ( ruleCreationStatement ) );";
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
            return "()* loopback of 1546:4: ( rule__AttributeValue__Group_0__0 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x20068000A3800402L,0x0000000000000001L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x200C4040000280F0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000008040000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x2004800080000400L,0x0000000000000001L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0011000100000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000001L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0010004000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000004000C004000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x2008110000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x2000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0xC000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x200C004000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0400080000001100L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x2004800280000400L,0x0000000000000001L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000010080000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x200C0040000280F0L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0800000000000000L});

}