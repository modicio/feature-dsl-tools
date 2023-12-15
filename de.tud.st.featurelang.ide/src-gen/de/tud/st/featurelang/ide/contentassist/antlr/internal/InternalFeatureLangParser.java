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
    		tokenNameToValue.put("Role", "'role'");
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
    		tokenNameToValue.put("Target", "'target'");
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
    // InternalFeatureLangParser.g:103:1: entryRuleFeatureRequest : ruleFeatureRequest EOF ;
    public final void entryRuleFeatureRequest() throws RecognitionException {
        try {
            // InternalFeatureLangParser.g:104:1: ( ruleFeatureRequest EOF )
            // InternalFeatureLangParser.g:105:1: ruleFeatureRequest EOF
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
    // InternalFeatureLangParser.g:112:1: ruleFeatureRequest : ( ( rule__FeatureRequest__StatementsAssignment )* ) ;
    public final void ruleFeatureRequest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:116:2: ( ( ( rule__FeatureRequest__StatementsAssignment )* ) )
            // InternalFeatureLangParser.g:117:2: ( ( rule__FeatureRequest__StatementsAssignment )* )
            {
            // InternalFeatureLangParser.g:117:2: ( ( rule__FeatureRequest__StatementsAssignment )* )
            // InternalFeatureLangParser.g:118:3: ( rule__FeatureRequest__StatementsAssignment )*
            {
             before(grammarAccess.getFeatureRequestAccess().getStatementsAssignment()); 
            // InternalFeatureLangParser.g:119:3: ( rule__FeatureRequest__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Abstract||LA1_0==Class||LA1_0==The||(LA1_0>=A && LA1_0<=RULE_ID)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFeatureLangParser.g:119:4: rule__FeatureRequest__StatementsAssignment
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
    // InternalFeatureLangParser.g:128:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalFeatureLangParser.g:129:1: ( ruleStatement EOF )
            // InternalFeatureLangParser.g:130:1: ruleStatement EOF
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
    // InternalFeatureLangParser.g:137:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:141:2: ( ( ( rule__Statement__Group__0 ) ) )
            // InternalFeatureLangParser.g:142:2: ( ( rule__Statement__Group__0 ) )
            {
            // InternalFeatureLangParser.g:142:2: ( ( rule__Statement__Group__0 ) )
            // InternalFeatureLangParser.g:143:3: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // InternalFeatureLangParser.g:144:3: ( rule__Statement__Group__0 )
            // InternalFeatureLangParser.g:144:4: rule__Statement__Group__0
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
    // InternalFeatureLangParser.g:153:1: entryRuleChangeStatement : ruleChangeStatement EOF ;
    public final void entryRuleChangeStatement() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:157:1: ( ruleChangeStatement EOF )
            // InternalFeatureLangParser.g:158:1: ruleChangeStatement EOF
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
    // InternalFeatureLangParser.g:168:1: ruleChangeStatement : ( ( rule__ChangeStatement__Group__0 ) ) ;
    public final void ruleChangeStatement() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:173:2: ( ( ( rule__ChangeStatement__Group__0 ) ) )
            // InternalFeatureLangParser.g:174:2: ( ( rule__ChangeStatement__Group__0 ) )
            {
            // InternalFeatureLangParser.g:174:2: ( ( rule__ChangeStatement__Group__0 ) )
            // InternalFeatureLangParser.g:175:3: ( rule__ChangeStatement__Group__0 )
            {
             before(grammarAccess.getChangeStatementAccess().getGroup()); 
            // InternalFeatureLangParser.g:176:3: ( rule__ChangeStatement__Group__0 )
            // InternalFeatureLangParser.g:176:4: rule__ChangeStatement__Group__0
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
    // InternalFeatureLangParser.g:186:1: entryRuleCreationStatement : ruleCreationStatement EOF ;
    public final void entryRuleCreationStatement() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:190:1: ( ruleCreationStatement EOF )
            // InternalFeatureLangParser.g:191:1: ruleCreationStatement EOF
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
    // InternalFeatureLangParser.g:201:1: ruleCreationStatement : ( ( rule__CreationStatement__Group__0 ) ) ;
    public final void ruleCreationStatement() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:206:2: ( ( ( rule__CreationStatement__Group__0 ) ) )
            // InternalFeatureLangParser.g:207:2: ( ( rule__CreationStatement__Group__0 ) )
            {
            // InternalFeatureLangParser.g:207:2: ( ( rule__CreationStatement__Group__0 ) )
            // InternalFeatureLangParser.g:208:3: ( rule__CreationStatement__Group__0 )
            {
             before(grammarAccess.getCreationStatementAccess().getGroup()); 
            // InternalFeatureLangParser.g:209:3: ( rule__CreationStatement__Group__0 )
            // InternalFeatureLangParser.g:209:4: rule__CreationStatement__Group__0
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
    // InternalFeatureLangParser.g:219:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:223:1: ( ruleAction EOF )
            // InternalFeatureLangParser.g:224:1: ruleAction EOF
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
    // InternalFeatureLangParser.g:234:1: ruleAction : ( ( rule__Action__TypeAssignment ) ) ;
    public final void ruleAction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:239:2: ( ( ( rule__Action__TypeAssignment ) ) )
            // InternalFeatureLangParser.g:240:2: ( ( rule__Action__TypeAssignment ) )
            {
            // InternalFeatureLangParser.g:240:2: ( ( rule__Action__TypeAssignment ) )
            // InternalFeatureLangParser.g:241:3: ( rule__Action__TypeAssignment )
            {
             before(grammarAccess.getActionAccess().getTypeAssignment()); 
            // InternalFeatureLangParser.g:242:3: ( rule__Action__TypeAssignment )
            // InternalFeatureLangParser.g:242:4: rule__Action__TypeAssignment
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
    // InternalFeatureLangParser.g:252:1: entryRuleUpdateAction : ruleUpdateAction EOF ;
    public final void entryRuleUpdateAction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:256:1: ( ruleUpdateAction EOF )
            // InternalFeatureLangParser.g:257:1: ruleUpdateAction EOF
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
    // InternalFeatureLangParser.g:267:1: ruleUpdateAction : ( ( rule__UpdateAction__Group__0 ) ) ;
    public final void ruleUpdateAction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:272:2: ( ( ( rule__UpdateAction__Group__0 ) ) )
            // InternalFeatureLangParser.g:273:2: ( ( rule__UpdateAction__Group__0 ) )
            {
            // InternalFeatureLangParser.g:273:2: ( ( rule__UpdateAction__Group__0 ) )
            // InternalFeatureLangParser.g:274:3: ( rule__UpdateAction__Group__0 )
            {
             before(grammarAccess.getUpdateActionAccess().getGroup()); 
            // InternalFeatureLangParser.g:275:3: ( rule__UpdateAction__Group__0 )
            // InternalFeatureLangParser.g:275:4: rule__UpdateAction__Group__0
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
    // InternalFeatureLangParser.g:285:1: entryRuleUpdateAttributeDatatype : ruleUpdateAttributeDatatype EOF ;
    public final void entryRuleUpdateAttributeDatatype() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:289:1: ( ruleUpdateAttributeDatatype EOF )
            // InternalFeatureLangParser.g:290:1: ruleUpdateAttributeDatatype EOF
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
    // InternalFeatureLangParser.g:300:1: ruleUpdateAttributeDatatype : ( ( rule__UpdateAttributeDatatype__Group__0 ) ) ;
    public final void ruleUpdateAttributeDatatype() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:305:2: ( ( ( rule__UpdateAttributeDatatype__Group__0 ) ) )
            // InternalFeatureLangParser.g:306:2: ( ( rule__UpdateAttributeDatatype__Group__0 ) )
            {
            // InternalFeatureLangParser.g:306:2: ( ( rule__UpdateAttributeDatatype__Group__0 ) )
            // InternalFeatureLangParser.g:307:3: ( rule__UpdateAttributeDatatype__Group__0 )
            {
             before(grammarAccess.getUpdateAttributeDatatypeAccess().getGroup()); 
            // InternalFeatureLangParser.g:308:3: ( rule__UpdateAttributeDatatype__Group__0 )
            // InternalFeatureLangParser.g:308:4: rule__UpdateAttributeDatatype__Group__0
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
    // InternalFeatureLangParser.g:318:1: entryRuleUpdateAttributeIdentifier : ruleUpdateAttributeIdentifier EOF ;
    public final void entryRuleUpdateAttributeIdentifier() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:322:1: ( ruleUpdateAttributeIdentifier EOF )
            // InternalFeatureLangParser.g:323:1: ruleUpdateAttributeIdentifier EOF
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
    // InternalFeatureLangParser.g:333:1: ruleUpdateAttributeIdentifier : ( ( rule__UpdateAttributeIdentifier__Group__0 ) ) ;
    public final void ruleUpdateAttributeIdentifier() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:338:2: ( ( ( rule__UpdateAttributeIdentifier__Group__0 ) ) )
            // InternalFeatureLangParser.g:339:2: ( ( rule__UpdateAttributeIdentifier__Group__0 ) )
            {
            // InternalFeatureLangParser.g:339:2: ( ( rule__UpdateAttributeIdentifier__Group__0 ) )
            // InternalFeatureLangParser.g:340:3: ( rule__UpdateAttributeIdentifier__Group__0 )
            {
             before(grammarAccess.getUpdateAttributeIdentifierAccess().getGroup()); 
            // InternalFeatureLangParser.g:341:3: ( rule__UpdateAttributeIdentifier__Group__0 )
            // InternalFeatureLangParser.g:341:4: rule__UpdateAttributeIdentifier__Group__0
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
    // InternalFeatureLangParser.g:351:1: entryRuleUpdateAttributeValue : ruleUpdateAttributeValue EOF ;
    public final void entryRuleUpdateAttributeValue() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:355:1: ( ruleUpdateAttributeValue EOF )
            // InternalFeatureLangParser.g:356:1: ruleUpdateAttributeValue EOF
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
    // InternalFeatureLangParser.g:366:1: ruleUpdateAttributeValue : ( ( rule__UpdateAttributeValue__Group__0 ) ) ;
    public final void ruleUpdateAttributeValue() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:371:2: ( ( ( rule__UpdateAttributeValue__Group__0 ) ) )
            // InternalFeatureLangParser.g:372:2: ( ( rule__UpdateAttributeValue__Group__0 ) )
            {
            // InternalFeatureLangParser.g:372:2: ( ( rule__UpdateAttributeValue__Group__0 ) )
            // InternalFeatureLangParser.g:373:3: ( rule__UpdateAttributeValue__Group__0 )
            {
             before(grammarAccess.getUpdateAttributeValueAccess().getGroup()); 
            // InternalFeatureLangParser.g:374:3: ( rule__UpdateAttributeValue__Group__0 )
            // InternalFeatureLangParser.g:374:4: rule__UpdateAttributeValue__Group__0
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
    // InternalFeatureLangParser.g:384:1: entryRuleAttributeAction : ruleAttributeAction EOF ;
    public final void entryRuleAttributeAction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:388:1: ( ruleAttributeAction EOF )
            // InternalFeatureLangParser.g:389:1: ruleAttributeAction EOF
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
    // InternalFeatureLangParser.g:399:1: ruleAttributeAction : ( ( rule__AttributeAction__Group__0 ) ) ;
    public final void ruleAttributeAction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:404:2: ( ( ( rule__AttributeAction__Group__0 ) ) )
            // InternalFeatureLangParser.g:405:2: ( ( rule__AttributeAction__Group__0 ) )
            {
            // InternalFeatureLangParser.g:405:2: ( ( rule__AttributeAction__Group__0 ) )
            // InternalFeatureLangParser.g:406:3: ( rule__AttributeAction__Group__0 )
            {
             before(grammarAccess.getAttributeActionAccess().getGroup()); 
            // InternalFeatureLangParser.g:407:3: ( rule__AttributeAction__Group__0 )
            // InternalFeatureLangParser.g:407:4: rule__AttributeAction__Group__0
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
    // InternalFeatureLangParser.g:417:1: entryRuleAssociationAction : ruleAssociationAction EOF ;
    public final void entryRuleAssociationAction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:421:1: ( ruleAssociationAction EOF )
            // InternalFeatureLangParser.g:422:1: ruleAssociationAction EOF
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
    // InternalFeatureLangParser.g:432:1: ruleAssociationAction : ( ( rule__AssociationAction__Group__0 ) ) ;
    public final void ruleAssociationAction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:437:2: ( ( ( rule__AssociationAction__Group__0 ) ) )
            // InternalFeatureLangParser.g:438:2: ( ( rule__AssociationAction__Group__0 ) )
            {
            // InternalFeatureLangParser.g:438:2: ( ( rule__AssociationAction__Group__0 ) )
            // InternalFeatureLangParser.g:439:3: ( rule__AssociationAction__Group__0 )
            {
             before(grammarAccess.getAssociationActionAccess().getGroup()); 
            // InternalFeatureLangParser.g:440:3: ( rule__AssociationAction__Group__0 )
            // InternalFeatureLangParser.g:440:4: rule__AssociationAction__Group__0
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
    // InternalFeatureLangParser.g:450:1: entryRuleCreateAssociation : ruleCreateAssociation EOF ;
    public final void entryRuleCreateAssociation() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:454:1: ( ruleCreateAssociation EOF )
            // InternalFeatureLangParser.g:455:1: ruleCreateAssociation EOF
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
    // InternalFeatureLangParser.g:465:1: ruleCreateAssociation : ( ( rule__CreateAssociation__Group__0 ) ) ;
    public final void ruleCreateAssociation() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:470:2: ( ( ( rule__CreateAssociation__Group__0 ) ) )
            // InternalFeatureLangParser.g:471:2: ( ( rule__CreateAssociation__Group__0 ) )
            {
            // InternalFeatureLangParser.g:471:2: ( ( rule__CreateAssociation__Group__0 ) )
            // InternalFeatureLangParser.g:472:3: ( rule__CreateAssociation__Group__0 )
            {
             before(grammarAccess.getCreateAssociationAccess().getGroup()); 
            // InternalFeatureLangParser.g:473:3: ( rule__CreateAssociation__Group__0 )
            // InternalFeatureLangParser.g:473:4: rule__CreateAssociation__Group__0
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
    // InternalFeatureLangParser.g:483:1: entryRuleEditAssociation : ruleEditAssociation EOF ;
    public final void entryRuleEditAssociation() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:487:1: ( ruleEditAssociation EOF )
            // InternalFeatureLangParser.g:488:1: ruleEditAssociation EOF
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
    // InternalFeatureLangParser.g:498:1: ruleEditAssociation : ( ( rule__EditAssociation__TypeAssignment ) ) ;
    public final void ruleEditAssociation() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:503:2: ( ( ( rule__EditAssociation__TypeAssignment ) ) )
            // InternalFeatureLangParser.g:504:2: ( ( rule__EditAssociation__TypeAssignment ) )
            {
            // InternalFeatureLangParser.g:504:2: ( ( rule__EditAssociation__TypeAssignment ) )
            // InternalFeatureLangParser.g:505:3: ( rule__EditAssociation__TypeAssignment )
            {
             before(grammarAccess.getEditAssociationAccess().getTypeAssignment()); 
            // InternalFeatureLangParser.g:506:3: ( rule__EditAssociation__TypeAssignment )
            // InternalFeatureLangParser.g:506:4: rule__EditAssociation__TypeAssignment
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
    // InternalFeatureLangParser.g:516:1: entryRuleSetCompatible : ruleSetCompatible EOF ;
    public final void entryRuleSetCompatible() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:520:1: ( ruleSetCompatible EOF )
            // InternalFeatureLangParser.g:521:1: ruleSetCompatible EOF
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
    // InternalFeatureLangParser.g:531:1: ruleSetCompatible : ( ( rule__SetCompatible__Group__0 ) ) ;
    public final void ruleSetCompatible() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:536:2: ( ( ( rule__SetCompatible__Group__0 ) ) )
            // InternalFeatureLangParser.g:537:2: ( ( rule__SetCompatible__Group__0 ) )
            {
            // InternalFeatureLangParser.g:537:2: ( ( rule__SetCompatible__Group__0 ) )
            // InternalFeatureLangParser.g:538:3: ( rule__SetCompatible__Group__0 )
            {
             before(grammarAccess.getSetCompatibleAccess().getGroup()); 
            // InternalFeatureLangParser.g:539:3: ( rule__SetCompatible__Group__0 )
            // InternalFeatureLangParser.g:539:4: rule__SetCompatible__Group__0
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
    // InternalFeatureLangParser.g:549:1: entryRuleSetVersionRange : ruleSetVersionRange EOF ;
    public final void entryRuleSetVersionRange() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:553:1: ( ruleSetVersionRange EOF )
            // InternalFeatureLangParser.g:554:1: ruleSetVersionRange EOF
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
    // InternalFeatureLangParser.g:564:1: ruleSetVersionRange : ( ( rule__SetVersionRange__Group__0 ) ) ;
    public final void ruleSetVersionRange() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:569:2: ( ( ( rule__SetVersionRange__Group__0 ) ) )
            // InternalFeatureLangParser.g:570:2: ( ( rule__SetVersionRange__Group__0 ) )
            {
            // InternalFeatureLangParser.g:570:2: ( ( rule__SetVersionRange__Group__0 ) )
            // InternalFeatureLangParser.g:571:3: ( rule__SetVersionRange__Group__0 )
            {
             before(grammarAccess.getSetVersionRangeAccess().getGroup()); 
            // InternalFeatureLangParser.g:572:3: ( rule__SetVersionRange__Group__0 )
            // InternalFeatureLangParser.g:572:4: rule__SetVersionRange__Group__0
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
    // InternalFeatureLangParser.g:582:1: entryRuleSetVariant : ruleSetVariant EOF ;
    public final void entryRuleSetVariant() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:586:1: ( ruleSetVariant EOF )
            // InternalFeatureLangParser.g:587:1: ruleSetVariant EOF
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
    // InternalFeatureLangParser.g:597:1: ruleSetVariant : ( ( rule__SetVariant__Group__0 ) ) ;
    public final void ruleSetVariant() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:602:2: ( ( ( rule__SetVariant__Group__0 ) ) )
            // InternalFeatureLangParser.g:603:2: ( ( rule__SetVariant__Group__0 ) )
            {
            // InternalFeatureLangParser.g:603:2: ( ( rule__SetVariant__Group__0 ) )
            // InternalFeatureLangParser.g:604:3: ( rule__SetVariant__Group__0 )
            {
             before(grammarAccess.getSetVariantAccess().getGroup()); 
            // InternalFeatureLangParser.g:605:3: ( rule__SetVariant__Group__0 )
            // InternalFeatureLangParser.g:605:4: rule__SetVariant__Group__0
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
    // InternalFeatureLangParser.g:615:1: entryRuleSetRightOpen : ruleSetRightOpen EOF ;
    public final void entryRuleSetRightOpen() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:619:1: ( ruleSetRightOpen EOF )
            // InternalFeatureLangParser.g:620:1: ruleSetRightOpen EOF
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
    // InternalFeatureLangParser.g:630:1: ruleSetRightOpen : ( ( rule__SetRightOpen__Group__0 ) ) ;
    public final void ruleSetRightOpen() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:635:2: ( ( ( rule__SetRightOpen__Group__0 ) ) )
            // InternalFeatureLangParser.g:636:2: ( ( rule__SetRightOpen__Group__0 ) )
            {
            // InternalFeatureLangParser.g:636:2: ( ( rule__SetRightOpen__Group__0 ) )
            // InternalFeatureLangParser.g:637:3: ( rule__SetRightOpen__Group__0 )
            {
             before(grammarAccess.getSetRightOpenAccess().getGroup()); 
            // InternalFeatureLangParser.g:638:3: ( rule__SetRightOpen__Group__0 )
            // InternalFeatureLangParser.g:638:4: rule__SetRightOpen__Group__0
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
    // InternalFeatureLangParser.g:648:1: entryRuleSetLeftOpen : ruleSetLeftOpen EOF ;
    public final void entryRuleSetLeftOpen() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:652:1: ( ruleSetLeftOpen EOF )
            // InternalFeatureLangParser.g:653:1: ruleSetLeftOpen EOF
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
    // InternalFeatureLangParser.g:663:1: ruleSetLeftOpen : ( ( rule__SetLeftOpen__Group__0 ) ) ;
    public final void ruleSetLeftOpen() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:668:2: ( ( ( rule__SetLeftOpen__Group__0 ) ) )
            // InternalFeatureLangParser.g:669:2: ( ( rule__SetLeftOpen__Group__0 ) )
            {
            // InternalFeatureLangParser.g:669:2: ( ( rule__SetLeftOpen__Group__0 ) )
            // InternalFeatureLangParser.g:670:3: ( rule__SetLeftOpen__Group__0 )
            {
             before(grammarAccess.getSetLeftOpenAccess().getGroup()); 
            // InternalFeatureLangParser.g:671:3: ( rule__SetLeftOpen__Group__0 )
            // InternalFeatureLangParser.g:671:4: rule__SetLeftOpen__Group__0
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
    // InternalFeatureLangParser.g:681:1: entryRuleInheritanceAction : ruleInheritanceAction EOF ;
    public final void entryRuleInheritanceAction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:685:1: ( ruleInheritanceAction EOF )
            // InternalFeatureLangParser.g:686:1: ruleInheritanceAction EOF
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
    // InternalFeatureLangParser.g:696:1: ruleInheritanceAction : ( ( rule__InheritanceAction__Alternatives ) ) ;
    public final void ruleInheritanceAction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:701:2: ( ( ( rule__InheritanceAction__Alternatives ) ) )
            // InternalFeatureLangParser.g:702:2: ( ( rule__InheritanceAction__Alternatives ) )
            {
            // InternalFeatureLangParser.g:702:2: ( ( rule__InheritanceAction__Alternatives ) )
            // InternalFeatureLangParser.g:703:3: ( rule__InheritanceAction__Alternatives )
            {
             before(grammarAccess.getInheritanceActionAccess().getAlternatives()); 
            // InternalFeatureLangParser.g:704:3: ( rule__InheritanceAction__Alternatives )
            // InternalFeatureLangParser.g:704:4: rule__InheritanceAction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__InheritanceAction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInheritanceActionAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleCreateInheritance"
    // InternalFeatureLangParser.g:714:1: entryRuleCreateInheritance : ruleCreateInheritance EOF ;
    public final void entryRuleCreateInheritance() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:718:1: ( ruleCreateInheritance EOF )
            // InternalFeatureLangParser.g:719:1: ruleCreateInheritance EOF
            {
             before(grammarAccess.getCreateInheritanceRule()); 
            pushFollow(FOLLOW_1);
            ruleCreateInheritance();

            state._fsp--;

             after(grammarAccess.getCreateInheritanceRule()); 
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
    // $ANTLR end "entryRuleCreateInheritance"


    // $ANTLR start "ruleCreateInheritance"
    // InternalFeatureLangParser.g:729:1: ruleCreateInheritance : ( ( rule__CreateInheritance__Group__0 ) ) ;
    public final void ruleCreateInheritance() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:734:2: ( ( ( rule__CreateInheritance__Group__0 ) ) )
            // InternalFeatureLangParser.g:735:2: ( ( rule__CreateInheritance__Group__0 ) )
            {
            // InternalFeatureLangParser.g:735:2: ( ( rule__CreateInheritance__Group__0 ) )
            // InternalFeatureLangParser.g:736:3: ( rule__CreateInheritance__Group__0 )
            {
             before(grammarAccess.getCreateInheritanceAccess().getGroup()); 
            // InternalFeatureLangParser.g:737:3: ( rule__CreateInheritance__Group__0 )
            // InternalFeatureLangParser.g:737:4: rule__CreateInheritance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CreateInheritance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCreateInheritanceAccess().getGroup()); 

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
    // $ANTLR end "ruleCreateInheritance"


    // $ANTLR start "entryRuleEditInheritance"
    // InternalFeatureLangParser.g:747:1: entryRuleEditInheritance : ruleEditInheritance EOF ;
    public final void entryRuleEditInheritance() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:751:1: ( ruleEditInheritance EOF )
            // InternalFeatureLangParser.g:752:1: ruleEditInheritance EOF
            {
             before(grammarAccess.getEditInheritanceRule()); 
            pushFollow(FOLLOW_1);
            ruleEditInheritance();

            state._fsp--;

             after(grammarAccess.getEditInheritanceRule()); 
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
    // $ANTLR end "entryRuleEditInheritance"


    // $ANTLR start "ruleEditInheritance"
    // InternalFeatureLangParser.g:762:1: ruleEditInheritance : ( ( rule__EditInheritance__Group__0 ) ) ;
    public final void ruleEditInheritance() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:767:2: ( ( ( rule__EditInheritance__Group__0 ) ) )
            // InternalFeatureLangParser.g:768:2: ( ( rule__EditInheritance__Group__0 ) )
            {
            // InternalFeatureLangParser.g:768:2: ( ( rule__EditInheritance__Group__0 ) )
            // InternalFeatureLangParser.g:769:3: ( rule__EditInheritance__Group__0 )
            {
             before(grammarAccess.getEditInheritanceAccess().getGroup()); 
            // InternalFeatureLangParser.g:770:3: ( rule__EditInheritance__Group__0 )
            // InternalFeatureLangParser.g:770:4: rule__EditInheritance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EditInheritance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEditInheritanceAccess().getGroup()); 

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
    // $ANTLR end "ruleEditInheritance"


    // $ANTLR start "entryRuleCompositionAction"
    // InternalFeatureLangParser.g:780:1: entryRuleCompositionAction : ruleCompositionAction EOF ;
    public final void entryRuleCompositionAction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:784:1: ( ruleCompositionAction EOF )
            // InternalFeatureLangParser.g:785:1: ruleCompositionAction EOF
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
    // InternalFeatureLangParser.g:795:1: ruleCompositionAction : ( ( rule__CompositionAction__Alternatives ) ) ;
    public final void ruleCompositionAction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:800:2: ( ( ( rule__CompositionAction__Alternatives ) ) )
            // InternalFeatureLangParser.g:801:2: ( ( rule__CompositionAction__Alternatives ) )
            {
            // InternalFeatureLangParser.g:801:2: ( ( rule__CompositionAction__Alternatives ) )
            // InternalFeatureLangParser.g:802:3: ( rule__CompositionAction__Alternatives )
            {
             before(grammarAccess.getCompositionActionAccess().getAlternatives()); 
            // InternalFeatureLangParser.g:803:3: ( rule__CompositionAction__Alternatives )
            // InternalFeatureLangParser.g:803:4: rule__CompositionAction__Alternatives
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
    // InternalFeatureLangParser.g:813:1: entryRuleCreateComposition : ruleCreateComposition EOF ;
    public final void entryRuleCreateComposition() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:817:1: ( ruleCreateComposition EOF )
            // InternalFeatureLangParser.g:818:1: ruleCreateComposition EOF
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
    // InternalFeatureLangParser.g:828:1: ruleCreateComposition : ( ( rule__CreateComposition__Group__0 ) ) ;
    public final void ruleCreateComposition() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:833:2: ( ( ( rule__CreateComposition__Group__0 ) ) )
            // InternalFeatureLangParser.g:834:2: ( ( rule__CreateComposition__Group__0 ) )
            {
            // InternalFeatureLangParser.g:834:2: ( ( rule__CreateComposition__Group__0 ) )
            // InternalFeatureLangParser.g:835:3: ( rule__CreateComposition__Group__0 )
            {
             before(grammarAccess.getCreateCompositionAccess().getGroup()); 
            // InternalFeatureLangParser.g:836:3: ( rule__CreateComposition__Group__0 )
            // InternalFeatureLangParser.g:836:4: rule__CreateComposition__Group__0
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
    // InternalFeatureLangParser.g:846:1: entryRuleEditComposition : ruleEditComposition EOF ;
    public final void entryRuleEditComposition() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:850:1: ( ruleEditComposition EOF )
            // InternalFeatureLangParser.g:851:1: ruleEditComposition EOF
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
    // InternalFeatureLangParser.g:861:1: ruleEditComposition : ( ( rule__EditComposition__Group__0 ) ) ;
    public final void ruleEditComposition() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:866:2: ( ( ( rule__EditComposition__Group__0 ) ) )
            // InternalFeatureLangParser.g:867:2: ( ( rule__EditComposition__Group__0 ) )
            {
            // InternalFeatureLangParser.g:867:2: ( ( rule__EditComposition__Group__0 ) )
            // InternalFeatureLangParser.g:868:3: ( rule__EditComposition__Group__0 )
            {
             before(grammarAccess.getEditCompositionAccess().getGroup()); 
            // InternalFeatureLangParser.g:869:3: ( rule__EditComposition__Group__0 )
            // InternalFeatureLangParser.g:869:4: rule__EditComposition__Group__0
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
    // InternalFeatureLangParser.g:879:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:883:1: ( ruleClass EOF )
            // InternalFeatureLangParser.g:884:1: ruleClass EOF
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
    // InternalFeatureLangParser.g:894:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:899:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalFeatureLangParser.g:900:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalFeatureLangParser.g:900:2: ( ( rule__Class__Group__0 ) )
            // InternalFeatureLangParser.g:901:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalFeatureLangParser.g:902:3: ( rule__Class__Group__0 )
            // InternalFeatureLangParser.g:902:4: rule__Class__Group__0
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
    // InternalFeatureLangParser.g:912:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:916:1: ( ruleAttribute EOF )
            // InternalFeatureLangParser.g:917:1: ruleAttribute EOF
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
    // InternalFeatureLangParser.g:927:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:932:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalFeatureLangParser.g:933:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalFeatureLangParser.g:933:2: ( ( rule__Attribute__Group__0 ) )
            // InternalFeatureLangParser.g:934:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalFeatureLangParser.g:935:3: ( rule__Attribute__Group__0 )
            // InternalFeatureLangParser.g:935:4: rule__Attribute__Group__0
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
    // InternalFeatureLangParser.g:945:1: entryRuleIdentifier : ruleIdentifier EOF ;
    public final void entryRuleIdentifier() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:949:1: ( ruleIdentifier EOF )
            // InternalFeatureLangParser.g:950:1: ruleIdentifier EOF
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
    // InternalFeatureLangParser.g:960:1: ruleIdentifier : ( ( rule__Identifier__Group__0 ) ) ;
    public final void ruleIdentifier() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:965:2: ( ( ( rule__Identifier__Group__0 ) ) )
            // InternalFeatureLangParser.g:966:2: ( ( rule__Identifier__Group__0 ) )
            {
            // InternalFeatureLangParser.g:966:2: ( ( rule__Identifier__Group__0 ) )
            // InternalFeatureLangParser.g:967:3: ( rule__Identifier__Group__0 )
            {
             before(grammarAccess.getIdentifierAccess().getGroup()); 
            // InternalFeatureLangParser.g:968:3: ( rule__Identifier__Group__0 )
            // InternalFeatureLangParser.g:968:4: rule__Identifier__Group__0
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
    // InternalFeatureLangParser.g:978:1: entryRulePriority : rulePriority EOF ;
    public final void entryRulePriority() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:982:1: ( rulePriority EOF )
            // InternalFeatureLangParser.g:983:1: rulePriority EOF
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
    // InternalFeatureLangParser.g:993:1: rulePriority : ( ( rule__Priority__PriorityAssignment ) ) ;
    public final void rulePriority() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:998:2: ( ( ( rule__Priority__PriorityAssignment ) ) )
            // InternalFeatureLangParser.g:999:2: ( ( rule__Priority__PriorityAssignment ) )
            {
            // InternalFeatureLangParser.g:999:2: ( ( rule__Priority__PriorityAssignment ) )
            // InternalFeatureLangParser.g:1000:3: ( rule__Priority__PriorityAssignment )
            {
             before(grammarAccess.getPriorityAccess().getPriorityAssignment()); 
            // InternalFeatureLangParser.g:1001:3: ( rule__Priority__PriorityAssignment )
            // InternalFeatureLangParser.g:1001:4: rule__Priority__PriorityAssignment
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


    // $ANTLR start "ruleCompositionParameter"
    // InternalFeatureLangParser.g:1011:1: ruleCompositionParameter : ( ( rule__CompositionParameter__Alternatives ) ) ;
    public final void ruleCompositionParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1015:1: ( ( ( rule__CompositionParameter__Alternatives ) ) )
            // InternalFeatureLangParser.g:1016:2: ( ( rule__CompositionParameter__Alternatives ) )
            {
            // InternalFeatureLangParser.g:1016:2: ( ( rule__CompositionParameter__Alternatives ) )
            // InternalFeatureLangParser.g:1017:3: ( rule__CompositionParameter__Alternatives )
            {
             before(grammarAccess.getCompositionParameterAccess().getAlternatives()); 
            // InternalFeatureLangParser.g:1018:3: ( rule__CompositionParameter__Alternatives )
            // InternalFeatureLangParser.g:1018:4: rule__CompositionParameter__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CompositionParameter__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCompositionParameterAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompositionParameter"


    // $ANTLR start "rulePublicity"
    // InternalFeatureLangParser.g:1027:1: rulePublicity : ( ( rule__Publicity__Alternatives ) ) ;
    public final void rulePublicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1031:1: ( ( ( rule__Publicity__Alternatives ) ) )
            // InternalFeatureLangParser.g:1032:2: ( ( rule__Publicity__Alternatives ) )
            {
            // InternalFeatureLangParser.g:1032:2: ( ( rule__Publicity__Alternatives ) )
            // InternalFeatureLangParser.g:1033:3: ( rule__Publicity__Alternatives )
            {
             before(grammarAccess.getPublicityAccess().getAlternatives()); 
            // InternalFeatureLangParser.g:1034:3: ( rule__Publicity__Alternatives )
            // InternalFeatureLangParser.g:1034:4: rule__Publicity__Alternatives
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
    // InternalFeatureLangParser.g:1043:1: rulePriorityValue : ( ( rule__PriorityValue__Alternatives ) ) ;
    public final void rulePriorityValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1047:1: ( ( ( rule__PriorityValue__Alternatives ) ) )
            // InternalFeatureLangParser.g:1048:2: ( ( rule__PriorityValue__Alternatives ) )
            {
            // InternalFeatureLangParser.g:1048:2: ( ( rule__PriorityValue__Alternatives ) )
            // InternalFeatureLangParser.g:1049:3: ( rule__PriorityValue__Alternatives )
            {
             before(grammarAccess.getPriorityValueAccess().getAlternatives()); 
            // InternalFeatureLangParser.g:1050:3: ( rule__PriorityValue__Alternatives )
            // InternalFeatureLangParser.g:1050:4: rule__PriorityValue__Alternatives
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
    // InternalFeatureLangParser.g:1059:1: ruleAbstraction : ( ( Abstract ) ) ;
    public final void ruleAbstraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1063:1: ( ( ( Abstract ) ) )
            // InternalFeatureLangParser.g:1064:2: ( ( Abstract ) )
            {
            // InternalFeatureLangParser.g:1064:2: ( ( Abstract ) )
            // InternalFeatureLangParser.g:1065:3: ( Abstract )
            {
             before(grammarAccess.getAbstractionAccess().getABSTRACTEnumLiteralDeclaration()); 
            // InternalFeatureLangParser.g:1066:3: ( Abstract )
            // InternalFeatureLangParser.g:1066:4: Abstract
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
    // InternalFeatureLangParser.g:1075:1: ruleIdentifierValue : ( ( rule__IdentifierValue__Alternatives ) ) ;
    public final void ruleIdentifierValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1079:1: ( ( ( rule__IdentifierValue__Alternatives ) ) )
            // InternalFeatureLangParser.g:1080:2: ( ( rule__IdentifierValue__Alternatives ) )
            {
            // InternalFeatureLangParser.g:1080:2: ( ( rule__IdentifierValue__Alternatives ) )
            // InternalFeatureLangParser.g:1081:3: ( rule__IdentifierValue__Alternatives )
            {
             before(grammarAccess.getIdentifierValueAccess().getAlternatives()); 
            // InternalFeatureLangParser.g:1082:3: ( rule__IdentifierValue__Alternatives )
            // InternalFeatureLangParser.g:1082:4: rule__IdentifierValue__Alternatives
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
    // InternalFeatureLangParser.g:1091:1: ruleDatatype : ( ( rule__Datatype__Alternatives ) ) ;
    public final void ruleDatatype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1095:1: ( ( ( rule__Datatype__Alternatives ) ) )
            // InternalFeatureLangParser.g:1096:2: ( ( rule__Datatype__Alternatives ) )
            {
            // InternalFeatureLangParser.g:1096:2: ( ( rule__Datatype__Alternatives ) )
            // InternalFeatureLangParser.g:1097:3: ( rule__Datatype__Alternatives )
            {
             before(grammarAccess.getDatatypeAccess().getAlternatives()); 
            // InternalFeatureLangParser.g:1098:3: ( rule__Datatype__Alternatives )
            // InternalFeatureLangParser.g:1098:4: rule__Datatype__Alternatives
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
    // InternalFeatureLangParser.g:1106:1: rule__Statement__Alternatives_0 : ( ( ruleChangeStatement ) | ( ruleCreationStatement ) );
    public final void rule__Statement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1110:1: ( ( ruleChangeStatement ) | ( ruleCreationStatement ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalFeatureLangParser.g:1111:2: ( ruleChangeStatement )
                    {
                    // InternalFeatureLangParser.g:1111:2: ( ruleChangeStatement )
                    // InternalFeatureLangParser.g:1112:3: ruleChangeStatement
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
                    // InternalFeatureLangParser.g:1117:2: ( ruleCreationStatement )
                    {
                    // InternalFeatureLangParser.g:1117:2: ( ruleCreationStatement )
                    // InternalFeatureLangParser.g:1118:3: ruleCreationStatement
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
    // InternalFeatureLangParser.g:1127:1: rule__ChangeStatement__Alternatives_1 : ( ( ( rule__ChangeStatement__Group_1_0__0 ) ) | ( ( rule__ChangeStatement__UpdateAssignment_1_1 ) ) );
    public final void rule__ChangeStatement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1131:1: ( ( ( rule__ChangeStatement__Group_1_0__0 ) ) | ( ( rule__ChangeStatement__UpdateAssignment_1_1 ) ) )
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
                    // InternalFeatureLangParser.g:1132:2: ( ( rule__ChangeStatement__Group_1_0__0 ) )
                    {
                    // InternalFeatureLangParser.g:1132:2: ( ( rule__ChangeStatement__Group_1_0__0 ) )
                    // InternalFeatureLangParser.g:1133:3: ( rule__ChangeStatement__Group_1_0__0 )
                    {
                     before(grammarAccess.getChangeStatementAccess().getGroup_1_0()); 
                    // InternalFeatureLangParser.g:1134:3: ( rule__ChangeStatement__Group_1_0__0 )
                    // InternalFeatureLangParser.g:1134:4: rule__ChangeStatement__Group_1_0__0
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


    // $ANTLR start "rule__ChangeStatement__Alternatives_1_0_2"
    // InternalFeatureLangParser.g:1148:1: rule__ChangeStatement__Alternatives_1_0_2 : ( ( ( rule__ChangeStatement__ActionAssignment_1_0_2_0 ) ) | ( ( rule__ChangeStatement__Group_1_0_2_1__0 ) ) );
    public final void rule__ChangeStatement__Alternatives_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1152:1: ( ( ( rule__ChangeStatement__ActionAssignment_1_0_2_0 ) ) | ( ( rule__ChangeStatement__Group_1_0_2_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Have) ) {
                switch ( input.LA(2) ) {
                case Associations:
                case Association:
                case Composition:
                case Inheritance:
                case The:
                    {
                    alt4=1;
                    }
                    break;
                case An:
                    {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3==Name||LA4_3==URI) ) {
                        alt4=2;
                    }
                    else if ( (LA4_3==Attribute||LA4_3==RULE_ID) ) {
                        alt4=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case A:
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
                    // InternalFeatureLangParser.g:1153:2: ( ( rule__ChangeStatement__ActionAssignment_1_0_2_0 ) )
                    {
                    // InternalFeatureLangParser.g:1153:2: ( ( rule__ChangeStatement__ActionAssignment_1_0_2_0 ) )
                    // InternalFeatureLangParser.g:1154:3: ( rule__ChangeStatement__ActionAssignment_1_0_2_0 )
                    {
                     before(grammarAccess.getChangeStatementAccess().getActionAssignment_1_0_2_0()); 
                    // InternalFeatureLangParser.g:1155:3: ( rule__ChangeStatement__ActionAssignment_1_0_2_0 )
                    // InternalFeatureLangParser.g:1155:4: rule__ChangeStatement__ActionAssignment_1_0_2_0
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
                    // InternalFeatureLangParser.g:1159:2: ( ( rule__ChangeStatement__Group_1_0_2_1__0 ) )
                    {
                    // InternalFeatureLangParser.g:1159:2: ( ( rule__ChangeStatement__Group_1_0_2_1__0 ) )
                    // InternalFeatureLangParser.g:1160:3: ( rule__ChangeStatement__Group_1_0_2_1__0 )
                    {
                     before(grammarAccess.getChangeStatementAccess().getGroup_1_0_2_1()); 
                    // InternalFeatureLangParser.g:1161:3: ( rule__ChangeStatement__Group_1_0_2_1__0 )
                    // InternalFeatureLangParser.g:1161:4: rule__ChangeStatement__Group_1_0_2_1__0
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
    // InternalFeatureLangParser.g:1169:1: rule__ChangeStatement__Alternatives_1_0_2_1_1 : ( ( A ) | ( An ) );
    public final void rule__ChangeStatement__Alternatives_1_0_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1173:1: ( ( A ) | ( An ) )
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
                    // InternalFeatureLangParser.g:1174:2: ( A )
                    {
                    // InternalFeatureLangParser.g:1174:2: ( A )
                    // InternalFeatureLangParser.g:1175:3: A
                    {
                     before(grammarAccess.getChangeStatementAccess().getAKeyword_1_0_2_1_1_0()); 
                    match(input,A,FOLLOW_2); 
                     after(grammarAccess.getChangeStatementAccess().getAKeyword_1_0_2_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1180:2: ( An )
                    {
                    // InternalFeatureLangParser.g:1180:2: ( An )
                    // InternalFeatureLangParser.g:1181:3: An
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
    // InternalFeatureLangParser.g:1190:1: rule__CreationStatement__Alternatives_3 : ( ( Exist ) | ( Be ) );
    public final void rule__CreationStatement__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1194:1: ( ( Exist ) | ( Be ) )
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
                    // InternalFeatureLangParser.g:1195:2: ( Exist )
                    {
                    // InternalFeatureLangParser.g:1195:2: ( Exist )
                    // InternalFeatureLangParser.g:1196:3: Exist
                    {
                     before(grammarAccess.getCreationStatementAccess().getExistKeyword_3_0()); 
                    match(input,Exist,FOLLOW_2); 
                     after(grammarAccess.getCreationStatementAccess().getExistKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1201:2: ( Be )
                    {
                    // InternalFeatureLangParser.g:1201:2: ( Be )
                    // InternalFeatureLangParser.g:1202:3: Be
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
    // InternalFeatureLangParser.g:1211:1: rule__Action__TypeAlternatives_0 : ( ( ruleAttributeAction ) | ( ruleAssociationAction ) | ( ruleInheritanceAction ) | ( ruleCompositionAction ) );
    public final void rule__Action__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1215:1: ( ( ruleAttributeAction ) | ( ruleAssociationAction ) | ( ruleInheritanceAction ) | ( ruleCompositionAction ) )
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
                case Composition:
                    {
                    alt7=4;
                    }
                    break;
                case The:
                case An:
                case A:
                    {
                    alt7=1;
                    }
                    break;
                case Inheritance:
                    {
                    alt7=3;
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
    // InternalFeatureLangParser.g:1244:1: rule__UpdateAction__Alternatives_1 : ( ( An ) | ( A ) );
    public final void rule__UpdateAction__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1248:1: ( ( An ) | ( A ) )
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

            }
        }
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
    // InternalFeatureLangParser.g:1265:1: rule__UpdateAction__Alternatives_7 : ( ( ( rule__UpdateAction__DatatypeAssignment_7_0 ) ) | ( ( rule__UpdateAction__IdentifierAssignment_7_1 ) ) | ( ( rule__UpdateAction__ValueAssignment_7_2 ) ) );
    public final void rule__UpdateAction__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1269:1: ( ( ( rule__UpdateAction__DatatypeAssignment_7_0 ) ) | ( ( rule__UpdateAction__IdentifierAssignment_7_1 ) ) | ( ( rule__UpdateAction__ValueAssignment_7_2 ) ) )
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

                    if ( (LA9_3==Value) ) {
                        alt9=3;
                    }
                    else if ( (LA9_3==Name||LA9_3==URI) ) {
                        alt9=2;
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
                    // InternalFeatureLangParser.g:1270:2: ( ( rule__UpdateAction__DatatypeAssignment_7_0 ) )
                    {
                    // InternalFeatureLangParser.g:1270:2: ( ( rule__UpdateAction__DatatypeAssignment_7_0 ) )
                    // InternalFeatureLangParser.g:1271:3: ( rule__UpdateAction__DatatypeAssignment_7_0 )
                    {
                     before(grammarAccess.getUpdateActionAccess().getDatatypeAssignment_7_0()); 
                    // InternalFeatureLangParser.g:1272:3: ( rule__UpdateAction__DatatypeAssignment_7_0 )
                    // InternalFeatureLangParser.g:1272:4: rule__UpdateAction__DatatypeAssignment_7_0
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
                    // InternalFeatureLangParser.g:1276:2: ( ( rule__UpdateAction__IdentifierAssignment_7_1 ) )
                    {
                    // InternalFeatureLangParser.g:1276:2: ( ( rule__UpdateAction__IdentifierAssignment_7_1 ) )
                    // InternalFeatureLangParser.g:1277:3: ( rule__UpdateAction__IdentifierAssignment_7_1 )
                    {
                     before(grammarAccess.getUpdateActionAccess().getIdentifierAssignment_7_1()); 
                    // InternalFeatureLangParser.g:1278:3: ( rule__UpdateAction__IdentifierAssignment_7_1 )
                    // InternalFeatureLangParser.g:1278:4: rule__UpdateAction__IdentifierAssignment_7_1
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
                    // InternalFeatureLangParser.g:1282:2: ( ( rule__UpdateAction__ValueAssignment_7_2 ) )
                    {
                    // InternalFeatureLangParser.g:1282:2: ( ( rule__UpdateAction__ValueAssignment_7_2 ) )
                    // InternalFeatureLangParser.g:1283:3: ( rule__UpdateAction__ValueAssignment_7_2 )
                    {
                     before(grammarAccess.getUpdateActionAccess().getValueAssignment_7_2()); 
                    // InternalFeatureLangParser.g:1284:3: ( rule__UpdateAction__ValueAssignment_7_2 )
                    // InternalFeatureLangParser.g:1284:4: rule__UpdateAction__ValueAssignment_7_2
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
    // InternalFeatureLangParser.g:1292:1: rule__UpdateAttributeIdentifier__Alternatives_1 : ( ( A ) | ( An ) );
    public final void rule__UpdateAttributeIdentifier__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1296:1: ( ( A ) | ( An ) )
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
                    // InternalFeatureLangParser.g:1297:2: ( A )
                    {
                    // InternalFeatureLangParser.g:1297:2: ( A )
                    // InternalFeatureLangParser.g:1298:3: A
                    {
                     before(grammarAccess.getUpdateAttributeIdentifierAccess().getAKeyword_1_0()); 
                    match(input,A,FOLLOW_2); 
                     after(grammarAccess.getUpdateAttributeIdentifierAccess().getAKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1303:2: ( An )
                    {
                    // InternalFeatureLangParser.g:1303:2: ( An )
                    // InternalFeatureLangParser.g:1304:3: An
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
    // InternalFeatureLangParser.g:1313:1: rule__AttributeAction__Alternatives_1 : ( ( The ) | ( An ) | ( A ) );
    public final void rule__AttributeAction__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1317:1: ( ( The ) | ( An ) | ( A ) )
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
                    // InternalFeatureLangParser.g:1318:2: ( The )
                    {
                    // InternalFeatureLangParser.g:1318:2: ( The )
                    // InternalFeatureLangParser.g:1319:3: The
                    {
                     before(grammarAccess.getAttributeActionAccess().getTheKeyword_1_0()); 
                    match(input,The,FOLLOW_2); 
                     after(grammarAccess.getAttributeActionAccess().getTheKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1324:2: ( An )
                    {
                    // InternalFeatureLangParser.g:1324:2: ( An )
                    // InternalFeatureLangParser.g:1325:3: An
                    {
                     before(grammarAccess.getAttributeActionAccess().getAnKeyword_1_1()); 
                    match(input,An,FOLLOW_2); 
                     after(grammarAccess.getAttributeActionAccess().getAnKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureLangParser.g:1330:2: ( A )
                    {
                    // InternalFeatureLangParser.g:1330:2: ( A )
                    // InternalFeatureLangParser.g:1331:3: A
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
    // InternalFeatureLangParser.g:1340:1: rule__AssociationAction__Alternatives_1 : ( ( Associations ) | ( Association ) );
    public final void rule__AssociationAction__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1344:1: ( ( Associations ) | ( Association ) )
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
                    // InternalFeatureLangParser.g:1345:2: ( Associations )
                    {
                    // InternalFeatureLangParser.g:1345:2: ( Associations )
                    // InternalFeatureLangParser.g:1346:3: Associations
                    {
                     before(grammarAccess.getAssociationActionAccess().getAssociationsKeyword_1_0()); 
                    match(input,Associations,FOLLOW_2); 
                     after(grammarAccess.getAssociationActionAccess().getAssociationsKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1351:2: ( Association )
                    {
                    // InternalFeatureLangParser.g:1351:2: ( Association )
                    // InternalFeatureLangParser.g:1352:3: Association
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
    // InternalFeatureLangParser.g:1361:1: rule__AssociationAction__Alternatives_2 : ( ( ( rule__AssociationAction__CreateAssignment_2_0 ) ) | ( ( rule__AssociationAction__Group_2_1__0 ) ) );
    public final void rule__AssociationAction__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1365:1: ( ( ( rule__AssociationAction__CreateAssignment_2_0 ) ) | ( ( rule__AssociationAction__Group_2_1__0 ) ) )
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
                    // InternalFeatureLangParser.g:1366:2: ( ( rule__AssociationAction__CreateAssignment_2_0 ) )
                    {
                    // InternalFeatureLangParser.g:1366:2: ( ( rule__AssociationAction__CreateAssignment_2_0 ) )
                    // InternalFeatureLangParser.g:1367:3: ( rule__AssociationAction__CreateAssignment_2_0 )
                    {
                     before(grammarAccess.getAssociationActionAccess().getCreateAssignment_2_0()); 
                    // InternalFeatureLangParser.g:1368:3: ( rule__AssociationAction__CreateAssignment_2_0 )
                    // InternalFeatureLangParser.g:1368:4: rule__AssociationAction__CreateAssignment_2_0
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
                    // InternalFeatureLangParser.g:1372:2: ( ( rule__AssociationAction__Group_2_1__0 ) )
                    {
                    // InternalFeatureLangParser.g:1372:2: ( ( rule__AssociationAction__Group_2_1__0 ) )
                    // InternalFeatureLangParser.g:1373:3: ( rule__AssociationAction__Group_2_1__0 )
                    {
                     before(grammarAccess.getAssociationActionAccess().getGroup_2_1()); 
                    // InternalFeatureLangParser.g:1374:3: ( rule__AssociationAction__Group_2_1__0 )
                    // InternalFeatureLangParser.g:1374:4: rule__AssociationAction__Group_2_1__0
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
    // InternalFeatureLangParser.g:1382:1: rule__EditAssociation__TypeAlternatives_0 : ( ( ruleSetCompatible ) | ( ruleSetVersionRange ) | ( ruleSetVariant ) | ( ruleSetRightOpen ) | ( ruleSetLeftOpen ) );
    public final void rule__EditAssociation__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1386:1: ( ( ruleSetCompatible ) | ( ruleSetVersionRange ) | ( ruleSetVariant ) | ( ruleSetRightOpen ) | ( ruleSetLeftOpen ) )
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
                    // InternalFeatureLangParser.g:1387:2: ( ruleSetCompatible )
                    {
                    // InternalFeatureLangParser.g:1387:2: ( ruleSetCompatible )
                    // InternalFeatureLangParser.g:1388:3: ruleSetCompatible
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
                    // InternalFeatureLangParser.g:1393:2: ( ruleSetVersionRange )
                    {
                    // InternalFeatureLangParser.g:1393:2: ( ruleSetVersionRange )
                    // InternalFeatureLangParser.g:1394:3: ruleSetVersionRange
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
                    // InternalFeatureLangParser.g:1399:2: ( ruleSetVariant )
                    {
                    // InternalFeatureLangParser.g:1399:2: ( ruleSetVariant )
                    // InternalFeatureLangParser.g:1400:3: ruleSetVariant
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
                    // InternalFeatureLangParser.g:1405:2: ( ruleSetRightOpen )
                    {
                    // InternalFeatureLangParser.g:1405:2: ( ruleSetRightOpen )
                    // InternalFeatureLangParser.g:1406:3: ruleSetRightOpen
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
                    // InternalFeatureLangParser.g:1411:2: ( ruleSetLeftOpen )
                    {
                    // InternalFeatureLangParser.g:1411:2: ( ruleSetLeftOpen )
                    // InternalFeatureLangParser.g:1412:3: ruleSetLeftOpen
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


    // $ANTLR start "rule__InheritanceAction__Alternatives"
    // InternalFeatureLangParser.g:1421:1: rule__InheritanceAction__Alternatives : ( ( ( rule__InheritanceAction__CreateAssignment_0 ) ) | ( ( rule__InheritanceAction__EditAssignment_1 ) ) );
    public final void rule__InheritanceAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1425:1: ( ( ( rule__InheritanceAction__CreateAssignment_0 ) ) | ( ( rule__InheritanceAction__EditAssignment_1 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Inherit) ) {
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
                    // InternalFeatureLangParser.g:1426:2: ( ( rule__InheritanceAction__CreateAssignment_0 ) )
                    {
                    // InternalFeatureLangParser.g:1426:2: ( ( rule__InheritanceAction__CreateAssignment_0 ) )
                    // InternalFeatureLangParser.g:1427:3: ( rule__InheritanceAction__CreateAssignment_0 )
                    {
                     before(grammarAccess.getInheritanceActionAccess().getCreateAssignment_0()); 
                    // InternalFeatureLangParser.g:1428:3: ( rule__InheritanceAction__CreateAssignment_0 )
                    // InternalFeatureLangParser.g:1428:4: rule__InheritanceAction__CreateAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InheritanceAction__CreateAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInheritanceActionAccess().getCreateAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1432:2: ( ( rule__InheritanceAction__EditAssignment_1 ) )
                    {
                    // InternalFeatureLangParser.g:1432:2: ( ( rule__InheritanceAction__EditAssignment_1 ) )
                    // InternalFeatureLangParser.g:1433:3: ( rule__InheritanceAction__EditAssignment_1 )
                    {
                     before(grammarAccess.getInheritanceActionAccess().getEditAssignment_1()); 
                    // InternalFeatureLangParser.g:1434:3: ( rule__InheritanceAction__EditAssignment_1 )
                    // InternalFeatureLangParser.g:1434:4: rule__InheritanceAction__EditAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__InheritanceAction__EditAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getInheritanceActionAccess().getEditAssignment_1()); 

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
    // $ANTLR end "rule__InheritanceAction__Alternatives"


    // $ANTLR start "rule__CompositionAction__Alternatives"
    // InternalFeatureLangParser.g:1442:1: rule__CompositionAction__Alternatives : ( ( ( rule__CompositionAction__CreateAssignment_0 ) ) | ( ( rule__CompositionAction__EditAssignment_1 ) ) );
    public final void rule__CompositionAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1446:1: ( ( ( rule__CompositionAction__CreateAssignment_0 ) ) | ( ( rule__CompositionAction__EditAssignment_1 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Compose) ) {
                alt16=1;
            }
            else if ( (LA16_0==Have) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalFeatureLangParser.g:1447:2: ( ( rule__CompositionAction__CreateAssignment_0 ) )
                    {
                    // InternalFeatureLangParser.g:1447:2: ( ( rule__CompositionAction__CreateAssignment_0 ) )
                    // InternalFeatureLangParser.g:1448:3: ( rule__CompositionAction__CreateAssignment_0 )
                    {
                     before(grammarAccess.getCompositionActionAccess().getCreateAssignment_0()); 
                    // InternalFeatureLangParser.g:1449:3: ( rule__CompositionAction__CreateAssignment_0 )
                    // InternalFeatureLangParser.g:1449:4: rule__CompositionAction__CreateAssignment_0
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
                    // InternalFeatureLangParser.g:1453:2: ( ( rule__CompositionAction__EditAssignment_1 ) )
                    {
                    // InternalFeatureLangParser.g:1453:2: ( ( rule__CompositionAction__EditAssignment_1 ) )
                    // InternalFeatureLangParser.g:1454:3: ( rule__CompositionAction__EditAssignment_1 )
                    {
                     before(grammarAccess.getCompositionActionAccess().getEditAssignment_1()); 
                    // InternalFeatureLangParser.g:1455:3: ( rule__CompositionAction__EditAssignment_1 )
                    // InternalFeatureLangParser.g:1455:4: rule__CompositionAction__EditAssignment_1
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
    // InternalFeatureLangParser.g:1463:1: rule__Class__Alternatives_0 : ( ( The ) | ( A ) );
    public final void rule__Class__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1467:1: ( ( The ) | ( A ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==The) ) {
                alt17=1;
            }
            else if ( (LA17_0==A) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalFeatureLangParser.g:1468:2: ( The )
                    {
                    // InternalFeatureLangParser.g:1468:2: ( The )
                    // InternalFeatureLangParser.g:1469:3: The
                    {
                     before(grammarAccess.getClassAccess().getTheKeyword_0_0()); 
                    match(input,The,FOLLOW_2); 
                     after(grammarAccess.getClassAccess().getTheKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1474:2: ( A )
                    {
                    // InternalFeatureLangParser.g:1474:2: ( A )
                    // InternalFeatureLangParser.g:1475:3: A
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


    // $ANTLR start "rule__CompositionParameter__Alternatives"
    // InternalFeatureLangParser.g:1484:1: rule__CompositionParameter__Alternatives : ( ( ( URI ) ) | ( ( Role ) ) | ( ( Target ) ) );
    public final void rule__CompositionParameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1488:1: ( ( ( URI ) ) | ( ( Role ) ) | ( ( Target ) ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case URI:
                {
                alt18=1;
                }
                break;
            case Role:
                {
                alt18=2;
                }
                break;
            case Target:
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
                    // InternalFeatureLangParser.g:1489:2: ( ( URI ) )
                    {
                    // InternalFeatureLangParser.g:1489:2: ( ( URI ) )
                    // InternalFeatureLangParser.g:1490:3: ( URI )
                    {
                     before(grammarAccess.getCompositionParameterAccess().getURIEnumLiteralDeclaration_0()); 
                    // InternalFeatureLangParser.g:1491:3: ( URI )
                    // InternalFeatureLangParser.g:1491:4: URI
                    {
                    match(input,URI,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompositionParameterAccess().getURIEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1495:2: ( ( Role ) )
                    {
                    // InternalFeatureLangParser.g:1495:2: ( ( Role ) )
                    // InternalFeatureLangParser.g:1496:3: ( Role )
                    {
                     before(grammarAccess.getCompositionParameterAccess().getROLEEnumLiteralDeclaration_1()); 
                    // InternalFeatureLangParser.g:1497:3: ( Role )
                    // InternalFeatureLangParser.g:1497:4: Role
                    {
                    match(input,Role,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompositionParameterAccess().getROLEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureLangParser.g:1501:2: ( ( Target ) )
                    {
                    // InternalFeatureLangParser.g:1501:2: ( ( Target ) )
                    // InternalFeatureLangParser.g:1502:3: ( Target )
                    {
                     before(grammarAccess.getCompositionParameterAccess().getTARGETEnumLiteralDeclaration_2()); 
                    // InternalFeatureLangParser.g:1503:3: ( Target )
                    // InternalFeatureLangParser.g:1503:4: Target
                    {
                    match(input,Target,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompositionParameterAccess().getTARGETEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__CompositionParameter__Alternatives"


    // $ANTLR start "rule__Publicity__Alternatives"
    // InternalFeatureLangParser.g:1511:1: rule__Publicity__Alternatives : ( ( ( Public ) ) | ( ( Private ) ) );
    public final void rule__Publicity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1515:1: ( ( ( Public ) ) | ( ( Private ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Public) ) {
                alt19=1;
            }
            else if ( (LA19_0==Private) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalFeatureLangParser.g:1516:2: ( ( Public ) )
                    {
                    // InternalFeatureLangParser.g:1516:2: ( ( Public ) )
                    // InternalFeatureLangParser.g:1517:3: ( Public )
                    {
                     before(grammarAccess.getPublicityAccess().getPUBLICEnumLiteralDeclaration_0()); 
                    // InternalFeatureLangParser.g:1518:3: ( Public )
                    // InternalFeatureLangParser.g:1518:4: Public
                    {
                    match(input,Public,FOLLOW_2); 

                    }

                     after(grammarAccess.getPublicityAccess().getPUBLICEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1522:2: ( ( Private ) )
                    {
                    // InternalFeatureLangParser.g:1522:2: ( ( Private ) )
                    // InternalFeatureLangParser.g:1523:3: ( Private )
                    {
                     before(grammarAccess.getPublicityAccess().getPRIVATEEnumLiteralDeclaration_1()); 
                    // InternalFeatureLangParser.g:1524:3: ( Private )
                    // InternalFeatureLangParser.g:1524:4: Private
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
    // InternalFeatureLangParser.g:1532:1: rule__PriorityValue__Alternatives : ( ( ( Should ) ) | ( ( Must ) ) );
    public final void rule__PriorityValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1536:1: ( ( ( Should ) ) | ( ( Must ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Should) ) {
                alt20=1;
            }
            else if ( (LA20_0==Must) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalFeatureLangParser.g:1537:2: ( ( Should ) )
                    {
                    // InternalFeatureLangParser.g:1537:2: ( ( Should ) )
                    // InternalFeatureLangParser.g:1538:3: ( Should )
                    {
                     before(grammarAccess.getPriorityValueAccess().getSHOULDEnumLiteralDeclaration_0()); 
                    // InternalFeatureLangParser.g:1539:3: ( Should )
                    // InternalFeatureLangParser.g:1539:4: Should
                    {
                    match(input,Should,FOLLOW_2); 

                    }

                     after(grammarAccess.getPriorityValueAccess().getSHOULDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1543:2: ( ( Must ) )
                    {
                    // InternalFeatureLangParser.g:1543:2: ( ( Must ) )
                    // InternalFeatureLangParser.g:1544:3: ( Must )
                    {
                     before(grammarAccess.getPriorityValueAccess().getMUSTEnumLiteralDeclaration_1()); 
                    // InternalFeatureLangParser.g:1545:3: ( Must )
                    // InternalFeatureLangParser.g:1545:4: Must
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
    // InternalFeatureLangParser.g:1553:1: rule__IdentifierValue__Alternatives : ( ( ( Name ) ) | ( ( URI ) ) );
    public final void rule__IdentifierValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1557:1: ( ( ( Name ) ) | ( ( URI ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Name) ) {
                alt21=1;
            }
            else if ( (LA21_0==URI) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalFeatureLangParser.g:1558:2: ( ( Name ) )
                    {
                    // InternalFeatureLangParser.g:1558:2: ( ( Name ) )
                    // InternalFeatureLangParser.g:1559:3: ( Name )
                    {
                     before(grammarAccess.getIdentifierValueAccess().getNAMEEnumLiteralDeclaration_0()); 
                    // InternalFeatureLangParser.g:1560:3: ( Name )
                    // InternalFeatureLangParser.g:1560:4: Name
                    {
                    match(input,Name,FOLLOW_2); 

                    }

                     after(grammarAccess.getIdentifierValueAccess().getNAMEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1564:2: ( ( URI ) )
                    {
                    // InternalFeatureLangParser.g:1564:2: ( ( URI ) )
                    // InternalFeatureLangParser.g:1565:3: ( URI )
                    {
                     before(grammarAccess.getIdentifierValueAccess().getURIEnumLiteralDeclaration_1()); 
                    // InternalFeatureLangParser.g:1566:3: ( URI )
                    // InternalFeatureLangParser.g:1566:4: URI
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
    // InternalFeatureLangParser.g:1574:1: rule__Datatype__Alternatives : ( ( ( Time ) ) | ( ( Phrase ) ) | ( ( Number ) ) );
    public final void rule__Datatype__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1578:1: ( ( ( Time ) ) | ( ( Phrase ) ) | ( ( Number ) ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case Time:
                {
                alt22=1;
                }
                break;
            case Phrase:
                {
                alt22=2;
                }
                break;
            case Number:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalFeatureLangParser.g:1579:2: ( ( Time ) )
                    {
                    // InternalFeatureLangParser.g:1579:2: ( ( Time ) )
                    // InternalFeatureLangParser.g:1580:3: ( Time )
                    {
                     before(grammarAccess.getDatatypeAccess().getWORDEnumLiteralDeclaration_0()); 
                    // InternalFeatureLangParser.g:1581:3: ( Time )
                    // InternalFeatureLangParser.g:1581:4: Time
                    {
                    match(input,Time,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatatypeAccess().getWORDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1585:2: ( ( Phrase ) )
                    {
                    // InternalFeatureLangParser.g:1585:2: ( ( Phrase ) )
                    // InternalFeatureLangParser.g:1586:3: ( Phrase )
                    {
                     before(grammarAccess.getDatatypeAccess().getPHRASEEnumLiteralDeclaration_1()); 
                    // InternalFeatureLangParser.g:1587:3: ( Phrase )
                    // InternalFeatureLangParser.g:1587:4: Phrase
                    {
                    match(input,Phrase,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatatypeAccess().getPHRASEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureLangParser.g:1591:2: ( ( Number ) )
                    {
                    // InternalFeatureLangParser.g:1591:2: ( ( Number ) )
                    // InternalFeatureLangParser.g:1592:3: ( Number )
                    {
                     before(grammarAccess.getDatatypeAccess().getNUMBEREnumLiteralDeclaration_2()); 
                    // InternalFeatureLangParser.g:1593:3: ( Number )
                    // InternalFeatureLangParser.g:1593:4: Number
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
    // InternalFeatureLangParser.g:1601:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1605:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalFeatureLangParser.g:1606:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
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
    // InternalFeatureLangParser.g:1613:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__Alternatives_0 ) ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1617:1: ( ( ( rule__Statement__Alternatives_0 ) ) )
            // InternalFeatureLangParser.g:1618:1: ( ( rule__Statement__Alternatives_0 ) )
            {
            // InternalFeatureLangParser.g:1618:1: ( ( rule__Statement__Alternatives_0 ) )
            // InternalFeatureLangParser.g:1619:2: ( rule__Statement__Alternatives_0 )
            {
             before(grammarAccess.getStatementAccess().getAlternatives_0()); 
            // InternalFeatureLangParser.g:1620:2: ( rule__Statement__Alternatives_0 )
            // InternalFeatureLangParser.g:1620:3: rule__Statement__Alternatives_0
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
    // InternalFeatureLangParser.g:1628:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1632:1: ( rule__Statement__Group__1__Impl )
            // InternalFeatureLangParser.g:1633:2: rule__Statement__Group__1__Impl
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
    // InternalFeatureLangParser.g:1639:1: rule__Statement__Group__1__Impl : ( ( FullStop )? ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1643:1: ( ( ( FullStop )? ) )
            // InternalFeatureLangParser.g:1644:1: ( ( FullStop )? )
            {
            // InternalFeatureLangParser.g:1644:1: ( ( FullStop )? )
            // InternalFeatureLangParser.g:1645:2: ( FullStop )?
            {
             before(grammarAccess.getStatementAccess().getFullStopKeyword_1()); 
            // InternalFeatureLangParser.g:1646:2: ( FullStop )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==FullStop) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalFeatureLangParser.g:1646:3: FullStop
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
    // InternalFeatureLangParser.g:1655:1: rule__ChangeStatement__Group__0 : rule__ChangeStatement__Group__0__Impl rule__ChangeStatement__Group__1 ;
    public final void rule__ChangeStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1659:1: ( rule__ChangeStatement__Group__0__Impl rule__ChangeStatement__Group__1 )
            // InternalFeatureLangParser.g:1660:2: rule__ChangeStatement__Group__0__Impl rule__ChangeStatement__Group__1
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
    // InternalFeatureLangParser.g:1667:1: rule__ChangeStatement__Group__0__Impl : ( ( rule__ChangeStatement__TargetAssignment_0 ) ) ;
    public final void rule__ChangeStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1671:1: ( ( ( rule__ChangeStatement__TargetAssignment_0 ) ) )
            // InternalFeatureLangParser.g:1672:1: ( ( rule__ChangeStatement__TargetAssignment_0 ) )
            {
            // InternalFeatureLangParser.g:1672:1: ( ( rule__ChangeStatement__TargetAssignment_0 ) )
            // InternalFeatureLangParser.g:1673:2: ( rule__ChangeStatement__TargetAssignment_0 )
            {
             before(grammarAccess.getChangeStatementAccess().getTargetAssignment_0()); 
            // InternalFeatureLangParser.g:1674:2: ( rule__ChangeStatement__TargetAssignment_0 )
            // InternalFeatureLangParser.g:1674:3: rule__ChangeStatement__TargetAssignment_0
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
    // InternalFeatureLangParser.g:1682:1: rule__ChangeStatement__Group__1 : rule__ChangeStatement__Group__1__Impl ;
    public final void rule__ChangeStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1686:1: ( rule__ChangeStatement__Group__1__Impl )
            // InternalFeatureLangParser.g:1687:2: rule__ChangeStatement__Group__1__Impl
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
    // InternalFeatureLangParser.g:1693:1: rule__ChangeStatement__Group__1__Impl : ( ( rule__ChangeStatement__Alternatives_1 ) ) ;
    public final void rule__ChangeStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1697:1: ( ( ( rule__ChangeStatement__Alternatives_1 ) ) )
            // InternalFeatureLangParser.g:1698:1: ( ( rule__ChangeStatement__Alternatives_1 ) )
            {
            // InternalFeatureLangParser.g:1698:1: ( ( rule__ChangeStatement__Alternatives_1 ) )
            // InternalFeatureLangParser.g:1699:2: ( rule__ChangeStatement__Alternatives_1 )
            {
             before(grammarAccess.getChangeStatementAccess().getAlternatives_1()); 
            // InternalFeatureLangParser.g:1700:2: ( rule__ChangeStatement__Alternatives_1 )
            // InternalFeatureLangParser.g:1700:3: rule__ChangeStatement__Alternatives_1
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
    // InternalFeatureLangParser.g:1709:1: rule__ChangeStatement__Group_1_0__0 : rule__ChangeStatement__Group_1_0__0__Impl rule__ChangeStatement__Group_1_0__1 ;
    public final void rule__ChangeStatement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1713:1: ( rule__ChangeStatement__Group_1_0__0__Impl rule__ChangeStatement__Group_1_0__1 )
            // InternalFeatureLangParser.g:1714:2: rule__ChangeStatement__Group_1_0__0__Impl rule__ChangeStatement__Group_1_0__1
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
    // InternalFeatureLangParser.g:1721:1: rule__ChangeStatement__Group_1_0__0__Impl : ( ( rule__ChangeStatement__PriorityAssignment_1_0_0 ) ) ;
    public final void rule__ChangeStatement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1725:1: ( ( ( rule__ChangeStatement__PriorityAssignment_1_0_0 ) ) )
            // InternalFeatureLangParser.g:1726:1: ( ( rule__ChangeStatement__PriorityAssignment_1_0_0 ) )
            {
            // InternalFeatureLangParser.g:1726:1: ( ( rule__ChangeStatement__PriorityAssignment_1_0_0 ) )
            // InternalFeatureLangParser.g:1727:2: ( rule__ChangeStatement__PriorityAssignment_1_0_0 )
            {
             before(grammarAccess.getChangeStatementAccess().getPriorityAssignment_1_0_0()); 
            // InternalFeatureLangParser.g:1728:2: ( rule__ChangeStatement__PriorityAssignment_1_0_0 )
            // InternalFeatureLangParser.g:1728:3: rule__ChangeStatement__PriorityAssignment_1_0_0
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
    // InternalFeatureLangParser.g:1736:1: rule__ChangeStatement__Group_1_0__1 : rule__ChangeStatement__Group_1_0__1__Impl rule__ChangeStatement__Group_1_0__2 ;
    public final void rule__ChangeStatement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1740:1: ( rule__ChangeStatement__Group_1_0__1__Impl rule__ChangeStatement__Group_1_0__2 )
            // InternalFeatureLangParser.g:1741:2: rule__ChangeStatement__Group_1_0__1__Impl rule__ChangeStatement__Group_1_0__2
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
    // InternalFeatureLangParser.g:1748:1: rule__ChangeStatement__Group_1_0__1__Impl : ( ( rule__ChangeStatement__NegationAssignment_1_0_1 )? ) ;
    public final void rule__ChangeStatement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1752:1: ( ( ( rule__ChangeStatement__NegationAssignment_1_0_1 )? ) )
            // InternalFeatureLangParser.g:1753:1: ( ( rule__ChangeStatement__NegationAssignment_1_0_1 )? )
            {
            // InternalFeatureLangParser.g:1753:1: ( ( rule__ChangeStatement__NegationAssignment_1_0_1 )? )
            // InternalFeatureLangParser.g:1754:2: ( rule__ChangeStatement__NegationAssignment_1_0_1 )?
            {
             before(grammarAccess.getChangeStatementAccess().getNegationAssignment_1_0_1()); 
            // InternalFeatureLangParser.g:1755:2: ( rule__ChangeStatement__NegationAssignment_1_0_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Not) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalFeatureLangParser.g:1755:3: rule__ChangeStatement__NegationAssignment_1_0_1
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
    // InternalFeatureLangParser.g:1763:1: rule__ChangeStatement__Group_1_0__2 : rule__ChangeStatement__Group_1_0__2__Impl ;
    public final void rule__ChangeStatement__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1767:1: ( rule__ChangeStatement__Group_1_0__2__Impl )
            // InternalFeatureLangParser.g:1768:2: rule__ChangeStatement__Group_1_0__2__Impl
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
    // InternalFeatureLangParser.g:1774:1: rule__ChangeStatement__Group_1_0__2__Impl : ( ( rule__ChangeStatement__Alternatives_1_0_2 ) ) ;
    public final void rule__ChangeStatement__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1778:1: ( ( ( rule__ChangeStatement__Alternatives_1_0_2 ) ) )
            // InternalFeatureLangParser.g:1779:1: ( ( rule__ChangeStatement__Alternatives_1_0_2 ) )
            {
            // InternalFeatureLangParser.g:1779:1: ( ( rule__ChangeStatement__Alternatives_1_0_2 ) )
            // InternalFeatureLangParser.g:1780:2: ( rule__ChangeStatement__Alternatives_1_0_2 )
            {
             before(grammarAccess.getChangeStatementAccess().getAlternatives_1_0_2()); 
            // InternalFeatureLangParser.g:1781:2: ( rule__ChangeStatement__Alternatives_1_0_2 )
            // InternalFeatureLangParser.g:1781:3: rule__ChangeStatement__Alternatives_1_0_2
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
    // InternalFeatureLangParser.g:1790:1: rule__ChangeStatement__Group_1_0_2_1__0 : rule__ChangeStatement__Group_1_0_2_1__0__Impl rule__ChangeStatement__Group_1_0_2_1__1 ;
    public final void rule__ChangeStatement__Group_1_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1794:1: ( rule__ChangeStatement__Group_1_0_2_1__0__Impl rule__ChangeStatement__Group_1_0_2_1__1 )
            // InternalFeatureLangParser.g:1795:2: rule__ChangeStatement__Group_1_0_2_1__0__Impl rule__ChangeStatement__Group_1_0_2_1__1
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
    // InternalFeatureLangParser.g:1802:1: rule__ChangeStatement__Group_1_0_2_1__0__Impl : ( Have ) ;
    public final void rule__ChangeStatement__Group_1_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1806:1: ( ( Have ) )
            // InternalFeatureLangParser.g:1807:1: ( Have )
            {
            // InternalFeatureLangParser.g:1807:1: ( Have )
            // InternalFeatureLangParser.g:1808:2: Have
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
    // InternalFeatureLangParser.g:1817:1: rule__ChangeStatement__Group_1_0_2_1__1 : rule__ChangeStatement__Group_1_0_2_1__1__Impl rule__ChangeStatement__Group_1_0_2_1__2 ;
    public final void rule__ChangeStatement__Group_1_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1821:1: ( rule__ChangeStatement__Group_1_0_2_1__1__Impl rule__ChangeStatement__Group_1_0_2_1__2 )
            // InternalFeatureLangParser.g:1822:2: rule__ChangeStatement__Group_1_0_2_1__1__Impl rule__ChangeStatement__Group_1_0_2_1__2
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
    // InternalFeatureLangParser.g:1829:1: rule__ChangeStatement__Group_1_0_2_1__1__Impl : ( ( rule__ChangeStatement__Alternatives_1_0_2_1_1 )? ) ;
    public final void rule__ChangeStatement__Group_1_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1833:1: ( ( ( rule__ChangeStatement__Alternatives_1_0_2_1_1 )? ) )
            // InternalFeatureLangParser.g:1834:1: ( ( rule__ChangeStatement__Alternatives_1_0_2_1_1 )? )
            {
            // InternalFeatureLangParser.g:1834:1: ( ( rule__ChangeStatement__Alternatives_1_0_2_1_1 )? )
            // InternalFeatureLangParser.g:1835:2: ( rule__ChangeStatement__Alternatives_1_0_2_1_1 )?
            {
             before(grammarAccess.getChangeStatementAccess().getAlternatives_1_0_2_1_1()); 
            // InternalFeatureLangParser.g:1836:2: ( rule__ChangeStatement__Alternatives_1_0_2_1_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==An||LA25_0==A) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalFeatureLangParser.g:1836:3: rule__ChangeStatement__Alternatives_1_0_2_1_1
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
    // InternalFeatureLangParser.g:1844:1: rule__ChangeStatement__Group_1_0_2_1__2 : rule__ChangeStatement__Group_1_0_2_1__2__Impl ;
    public final void rule__ChangeStatement__Group_1_0_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1848:1: ( rule__ChangeStatement__Group_1_0_2_1__2__Impl )
            // InternalFeatureLangParser.g:1849:2: rule__ChangeStatement__Group_1_0_2_1__2__Impl
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
    // InternalFeatureLangParser.g:1855:1: rule__ChangeStatement__Group_1_0_2_1__2__Impl : ( ( rule__ChangeStatement__IdentifierAssignment_1_0_2_1_2 ) ) ;
    public final void rule__ChangeStatement__Group_1_0_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1859:1: ( ( ( rule__ChangeStatement__IdentifierAssignment_1_0_2_1_2 ) ) )
            // InternalFeatureLangParser.g:1860:1: ( ( rule__ChangeStatement__IdentifierAssignment_1_0_2_1_2 ) )
            {
            // InternalFeatureLangParser.g:1860:1: ( ( rule__ChangeStatement__IdentifierAssignment_1_0_2_1_2 ) )
            // InternalFeatureLangParser.g:1861:2: ( rule__ChangeStatement__IdentifierAssignment_1_0_2_1_2 )
            {
             before(grammarAccess.getChangeStatementAccess().getIdentifierAssignment_1_0_2_1_2()); 
            // InternalFeatureLangParser.g:1862:2: ( rule__ChangeStatement__IdentifierAssignment_1_0_2_1_2 )
            // InternalFeatureLangParser.g:1862:3: rule__ChangeStatement__IdentifierAssignment_1_0_2_1_2
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
    // InternalFeatureLangParser.g:1871:1: rule__CreationStatement__Group__0 : rule__CreationStatement__Group__0__Impl rule__CreationStatement__Group__1 ;
    public final void rule__CreationStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1875:1: ( rule__CreationStatement__Group__0__Impl rule__CreationStatement__Group__1 )
            // InternalFeatureLangParser.g:1876:2: rule__CreationStatement__Group__0__Impl rule__CreationStatement__Group__1
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
    // InternalFeatureLangParser.g:1883:1: rule__CreationStatement__Group__0__Impl : ( ( rule__CreationStatement__ClassElementAssignment_0 ) ) ;
    public final void rule__CreationStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1887:1: ( ( ( rule__CreationStatement__ClassElementAssignment_0 ) ) )
            // InternalFeatureLangParser.g:1888:1: ( ( rule__CreationStatement__ClassElementAssignment_0 ) )
            {
            // InternalFeatureLangParser.g:1888:1: ( ( rule__CreationStatement__ClassElementAssignment_0 ) )
            // InternalFeatureLangParser.g:1889:2: ( rule__CreationStatement__ClassElementAssignment_0 )
            {
             before(grammarAccess.getCreationStatementAccess().getClassElementAssignment_0()); 
            // InternalFeatureLangParser.g:1890:2: ( rule__CreationStatement__ClassElementAssignment_0 )
            // InternalFeatureLangParser.g:1890:3: rule__CreationStatement__ClassElementAssignment_0
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
    // InternalFeatureLangParser.g:1898:1: rule__CreationStatement__Group__1 : rule__CreationStatement__Group__1__Impl rule__CreationStatement__Group__2 ;
    public final void rule__CreationStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1902:1: ( rule__CreationStatement__Group__1__Impl rule__CreationStatement__Group__2 )
            // InternalFeatureLangParser.g:1903:2: rule__CreationStatement__Group__1__Impl rule__CreationStatement__Group__2
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
    // InternalFeatureLangParser.g:1910:1: rule__CreationStatement__Group__1__Impl : ( ( rule__CreationStatement__PriorityAssignment_1 ) ) ;
    public final void rule__CreationStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1914:1: ( ( ( rule__CreationStatement__PriorityAssignment_1 ) ) )
            // InternalFeatureLangParser.g:1915:1: ( ( rule__CreationStatement__PriorityAssignment_1 ) )
            {
            // InternalFeatureLangParser.g:1915:1: ( ( rule__CreationStatement__PriorityAssignment_1 ) )
            // InternalFeatureLangParser.g:1916:2: ( rule__CreationStatement__PriorityAssignment_1 )
            {
             before(grammarAccess.getCreationStatementAccess().getPriorityAssignment_1()); 
            // InternalFeatureLangParser.g:1917:2: ( rule__CreationStatement__PriorityAssignment_1 )
            // InternalFeatureLangParser.g:1917:3: rule__CreationStatement__PriorityAssignment_1
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
    // InternalFeatureLangParser.g:1925:1: rule__CreationStatement__Group__2 : rule__CreationStatement__Group__2__Impl rule__CreationStatement__Group__3 ;
    public final void rule__CreationStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1929:1: ( rule__CreationStatement__Group__2__Impl rule__CreationStatement__Group__3 )
            // InternalFeatureLangParser.g:1930:2: rule__CreationStatement__Group__2__Impl rule__CreationStatement__Group__3
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
    // InternalFeatureLangParser.g:1937:1: rule__CreationStatement__Group__2__Impl : ( ( rule__CreationStatement__NegationAssignment_2 )? ) ;
    public final void rule__CreationStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1941:1: ( ( ( rule__CreationStatement__NegationAssignment_2 )? ) )
            // InternalFeatureLangParser.g:1942:1: ( ( rule__CreationStatement__NegationAssignment_2 )? )
            {
            // InternalFeatureLangParser.g:1942:1: ( ( rule__CreationStatement__NegationAssignment_2 )? )
            // InternalFeatureLangParser.g:1943:2: ( rule__CreationStatement__NegationAssignment_2 )?
            {
             before(grammarAccess.getCreationStatementAccess().getNegationAssignment_2()); 
            // InternalFeatureLangParser.g:1944:2: ( rule__CreationStatement__NegationAssignment_2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Not) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalFeatureLangParser.g:1944:3: rule__CreationStatement__NegationAssignment_2
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
    // InternalFeatureLangParser.g:1952:1: rule__CreationStatement__Group__3 : rule__CreationStatement__Group__3__Impl ;
    public final void rule__CreationStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1956:1: ( rule__CreationStatement__Group__3__Impl )
            // InternalFeatureLangParser.g:1957:2: rule__CreationStatement__Group__3__Impl
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
    // InternalFeatureLangParser.g:1963:1: rule__CreationStatement__Group__3__Impl : ( ( rule__CreationStatement__Alternatives_3 ) ) ;
    public final void rule__CreationStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1967:1: ( ( ( rule__CreationStatement__Alternatives_3 ) ) )
            // InternalFeatureLangParser.g:1968:1: ( ( rule__CreationStatement__Alternatives_3 ) )
            {
            // InternalFeatureLangParser.g:1968:1: ( ( rule__CreationStatement__Alternatives_3 ) )
            // InternalFeatureLangParser.g:1969:2: ( rule__CreationStatement__Alternatives_3 )
            {
             before(grammarAccess.getCreationStatementAccess().getAlternatives_3()); 
            // InternalFeatureLangParser.g:1970:2: ( rule__CreationStatement__Alternatives_3 )
            // InternalFeatureLangParser.g:1970:3: rule__CreationStatement__Alternatives_3
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
    // InternalFeatureLangParser.g:1979:1: rule__UpdateAction__Group__0 : rule__UpdateAction__Group__0__Impl rule__UpdateAction__Group__1 ;
    public final void rule__UpdateAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1983:1: ( rule__UpdateAction__Group__0__Impl rule__UpdateAction__Group__1 )
            // InternalFeatureLangParser.g:1984:2: rule__UpdateAction__Group__0__Impl rule__UpdateAction__Group__1
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
    // InternalFeatureLangParser.g:1991:1: rule__UpdateAction__Group__0__Impl : ( Has ) ;
    public final void rule__UpdateAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1995:1: ( ( Has ) )
            // InternalFeatureLangParser.g:1996:1: ( Has )
            {
            // InternalFeatureLangParser.g:1996:1: ( Has )
            // InternalFeatureLangParser.g:1997:2: Has
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
    // InternalFeatureLangParser.g:2006:1: rule__UpdateAction__Group__1 : rule__UpdateAction__Group__1__Impl rule__UpdateAction__Group__2 ;
    public final void rule__UpdateAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2010:1: ( rule__UpdateAction__Group__1__Impl rule__UpdateAction__Group__2 )
            // InternalFeatureLangParser.g:2011:2: rule__UpdateAction__Group__1__Impl rule__UpdateAction__Group__2
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
    // InternalFeatureLangParser.g:2018:1: rule__UpdateAction__Group__1__Impl : ( ( rule__UpdateAction__Alternatives_1 ) ) ;
    public final void rule__UpdateAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2022:1: ( ( ( rule__UpdateAction__Alternatives_1 ) ) )
            // InternalFeatureLangParser.g:2023:1: ( ( rule__UpdateAction__Alternatives_1 ) )
            {
            // InternalFeatureLangParser.g:2023:1: ( ( rule__UpdateAction__Alternatives_1 ) )
            // InternalFeatureLangParser.g:2024:2: ( rule__UpdateAction__Alternatives_1 )
            {
             before(grammarAccess.getUpdateActionAccess().getAlternatives_1()); 
            // InternalFeatureLangParser.g:2025:2: ( rule__UpdateAction__Alternatives_1 )
            // InternalFeatureLangParser.g:2025:3: rule__UpdateAction__Alternatives_1
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
    // InternalFeatureLangParser.g:2033:1: rule__UpdateAction__Group__2 : rule__UpdateAction__Group__2__Impl rule__UpdateAction__Group__3 ;
    public final void rule__UpdateAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2037:1: ( rule__UpdateAction__Group__2__Impl rule__UpdateAction__Group__3 )
            // InternalFeatureLangParser.g:2038:2: rule__UpdateAction__Group__2__Impl rule__UpdateAction__Group__3
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
    // InternalFeatureLangParser.g:2045:1: rule__UpdateAction__Group__2__Impl : ( ( Existing )? ) ;
    public final void rule__UpdateAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2049:1: ( ( ( Existing )? ) )
            // InternalFeatureLangParser.g:2050:1: ( ( Existing )? )
            {
            // InternalFeatureLangParser.g:2050:1: ( ( Existing )? )
            // InternalFeatureLangParser.g:2051:2: ( Existing )?
            {
             before(grammarAccess.getUpdateActionAccess().getExistingKeyword_2()); 
            // InternalFeatureLangParser.g:2052:2: ( Existing )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Existing) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalFeatureLangParser.g:2052:3: Existing
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
    // InternalFeatureLangParser.g:2060:1: rule__UpdateAction__Group__3 : rule__UpdateAction__Group__3__Impl rule__UpdateAction__Group__4 ;
    public final void rule__UpdateAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2064:1: ( rule__UpdateAction__Group__3__Impl rule__UpdateAction__Group__4 )
            // InternalFeatureLangParser.g:2065:2: rule__UpdateAction__Group__3__Impl rule__UpdateAction__Group__4
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
    // InternalFeatureLangParser.g:2072:1: rule__UpdateAction__Group__3__Impl : ( ( rule__UpdateAction__AttributeAssignment_3 ) ) ;
    public final void rule__UpdateAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2076:1: ( ( ( rule__UpdateAction__AttributeAssignment_3 ) ) )
            // InternalFeatureLangParser.g:2077:1: ( ( rule__UpdateAction__AttributeAssignment_3 ) )
            {
            // InternalFeatureLangParser.g:2077:1: ( ( rule__UpdateAction__AttributeAssignment_3 ) )
            // InternalFeatureLangParser.g:2078:2: ( rule__UpdateAction__AttributeAssignment_3 )
            {
             before(grammarAccess.getUpdateActionAccess().getAttributeAssignment_3()); 
            // InternalFeatureLangParser.g:2079:2: ( rule__UpdateAction__AttributeAssignment_3 )
            // InternalFeatureLangParser.g:2079:3: rule__UpdateAction__AttributeAssignment_3
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
    // InternalFeatureLangParser.g:2087:1: rule__UpdateAction__Group__4 : rule__UpdateAction__Group__4__Impl rule__UpdateAction__Group__5 ;
    public final void rule__UpdateAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2091:1: ( rule__UpdateAction__Group__4__Impl rule__UpdateAction__Group__5 )
            // InternalFeatureLangParser.g:2092:2: rule__UpdateAction__Group__4__Impl rule__UpdateAction__Group__5
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
    // InternalFeatureLangParser.g:2099:1: rule__UpdateAction__Group__4__Impl : ( FullStop ) ;
    public final void rule__UpdateAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2103:1: ( ( FullStop ) )
            // InternalFeatureLangParser.g:2104:1: ( FullStop )
            {
            // InternalFeatureLangParser.g:2104:1: ( FullStop )
            // InternalFeatureLangParser.g:2105:2: FullStop
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
    // InternalFeatureLangParser.g:2114:1: rule__UpdateAction__Group__5 : rule__UpdateAction__Group__5__Impl rule__UpdateAction__Group__6 ;
    public final void rule__UpdateAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2118:1: ( rule__UpdateAction__Group__5__Impl rule__UpdateAction__Group__6 )
            // InternalFeatureLangParser.g:2119:2: rule__UpdateAction__Group__5__Impl rule__UpdateAction__Group__6
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
    // InternalFeatureLangParser.g:2126:1: rule__UpdateAction__Group__5__Impl : ( It ) ;
    public final void rule__UpdateAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2130:1: ( ( It ) )
            // InternalFeatureLangParser.g:2131:1: ( It )
            {
            // InternalFeatureLangParser.g:2131:1: ( It )
            // InternalFeatureLangParser.g:2132:2: It
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
    // InternalFeatureLangParser.g:2141:1: rule__UpdateAction__Group__6 : rule__UpdateAction__Group__6__Impl rule__UpdateAction__Group__7 ;
    public final void rule__UpdateAction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2145:1: ( rule__UpdateAction__Group__6__Impl rule__UpdateAction__Group__7 )
            // InternalFeatureLangParser.g:2146:2: rule__UpdateAction__Group__6__Impl rule__UpdateAction__Group__7
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
    // InternalFeatureLangParser.g:2153:1: rule__UpdateAction__Group__6__Impl : ( ( rule__UpdateAction__PriorityAssignment_6 ) ) ;
    public final void rule__UpdateAction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2157:1: ( ( ( rule__UpdateAction__PriorityAssignment_6 ) ) )
            // InternalFeatureLangParser.g:2158:1: ( ( rule__UpdateAction__PriorityAssignment_6 ) )
            {
            // InternalFeatureLangParser.g:2158:1: ( ( rule__UpdateAction__PriorityAssignment_6 ) )
            // InternalFeatureLangParser.g:2159:2: ( rule__UpdateAction__PriorityAssignment_6 )
            {
             before(grammarAccess.getUpdateActionAccess().getPriorityAssignment_6()); 
            // InternalFeatureLangParser.g:2160:2: ( rule__UpdateAction__PriorityAssignment_6 )
            // InternalFeatureLangParser.g:2160:3: rule__UpdateAction__PriorityAssignment_6
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
    // InternalFeatureLangParser.g:2168:1: rule__UpdateAction__Group__7 : rule__UpdateAction__Group__7__Impl ;
    public final void rule__UpdateAction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2172:1: ( rule__UpdateAction__Group__7__Impl )
            // InternalFeatureLangParser.g:2173:2: rule__UpdateAction__Group__7__Impl
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
    // InternalFeatureLangParser.g:2179:1: rule__UpdateAction__Group__7__Impl : ( ( rule__UpdateAction__Alternatives_7 ) ) ;
    public final void rule__UpdateAction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2183:1: ( ( ( rule__UpdateAction__Alternatives_7 ) ) )
            // InternalFeatureLangParser.g:2184:1: ( ( rule__UpdateAction__Alternatives_7 ) )
            {
            // InternalFeatureLangParser.g:2184:1: ( ( rule__UpdateAction__Alternatives_7 ) )
            // InternalFeatureLangParser.g:2185:2: ( rule__UpdateAction__Alternatives_7 )
            {
             before(grammarAccess.getUpdateActionAccess().getAlternatives_7()); 
            // InternalFeatureLangParser.g:2186:2: ( rule__UpdateAction__Alternatives_7 )
            // InternalFeatureLangParser.g:2186:3: rule__UpdateAction__Alternatives_7
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
    // InternalFeatureLangParser.g:2195:1: rule__UpdateAttributeDatatype__Group__0 : rule__UpdateAttributeDatatype__Group__0__Impl rule__UpdateAttributeDatatype__Group__1 ;
    public final void rule__UpdateAttributeDatatype__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2199:1: ( rule__UpdateAttributeDatatype__Group__0__Impl rule__UpdateAttributeDatatype__Group__1 )
            // InternalFeatureLangParser.g:2200:2: rule__UpdateAttributeDatatype__Group__0__Impl rule__UpdateAttributeDatatype__Group__1
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
    // InternalFeatureLangParser.g:2207:1: rule__UpdateAttributeDatatype__Group__0__Impl : ( Be ) ;
    public final void rule__UpdateAttributeDatatype__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2211:1: ( ( Be ) )
            // InternalFeatureLangParser.g:2212:1: ( Be )
            {
            // InternalFeatureLangParser.g:2212:1: ( Be )
            // InternalFeatureLangParser.g:2213:2: Be
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
    // InternalFeatureLangParser.g:2222:1: rule__UpdateAttributeDatatype__Group__1 : rule__UpdateAttributeDatatype__Group__1__Impl rule__UpdateAttributeDatatype__Group__2 ;
    public final void rule__UpdateAttributeDatatype__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2226:1: ( rule__UpdateAttributeDatatype__Group__1__Impl rule__UpdateAttributeDatatype__Group__2 )
            // InternalFeatureLangParser.g:2227:2: rule__UpdateAttributeDatatype__Group__1__Impl rule__UpdateAttributeDatatype__Group__2
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
    // InternalFeatureLangParser.g:2234:1: rule__UpdateAttributeDatatype__Group__1__Impl : ( A ) ;
    public final void rule__UpdateAttributeDatatype__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2238:1: ( ( A ) )
            // InternalFeatureLangParser.g:2239:1: ( A )
            {
            // InternalFeatureLangParser.g:2239:1: ( A )
            // InternalFeatureLangParser.g:2240:2: A
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
    // InternalFeatureLangParser.g:2249:1: rule__UpdateAttributeDatatype__Group__2 : rule__UpdateAttributeDatatype__Group__2__Impl ;
    public final void rule__UpdateAttributeDatatype__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2253:1: ( rule__UpdateAttributeDatatype__Group__2__Impl )
            // InternalFeatureLangParser.g:2254:2: rule__UpdateAttributeDatatype__Group__2__Impl
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
    // InternalFeatureLangParser.g:2260:1: rule__UpdateAttributeDatatype__Group__2__Impl : ( ( rule__UpdateAttributeDatatype__TypeAssignment_2 ) ) ;
    public final void rule__UpdateAttributeDatatype__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2264:1: ( ( ( rule__UpdateAttributeDatatype__TypeAssignment_2 ) ) )
            // InternalFeatureLangParser.g:2265:1: ( ( rule__UpdateAttributeDatatype__TypeAssignment_2 ) )
            {
            // InternalFeatureLangParser.g:2265:1: ( ( rule__UpdateAttributeDatatype__TypeAssignment_2 ) )
            // InternalFeatureLangParser.g:2266:2: ( rule__UpdateAttributeDatatype__TypeAssignment_2 )
            {
             before(grammarAccess.getUpdateAttributeDatatypeAccess().getTypeAssignment_2()); 
            // InternalFeatureLangParser.g:2267:2: ( rule__UpdateAttributeDatatype__TypeAssignment_2 )
            // InternalFeatureLangParser.g:2267:3: rule__UpdateAttributeDatatype__TypeAssignment_2
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
    // InternalFeatureLangParser.g:2276:1: rule__UpdateAttributeIdentifier__Group__0 : rule__UpdateAttributeIdentifier__Group__0__Impl rule__UpdateAttributeIdentifier__Group__1 ;
    public final void rule__UpdateAttributeIdentifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2280:1: ( rule__UpdateAttributeIdentifier__Group__0__Impl rule__UpdateAttributeIdentifier__Group__1 )
            // InternalFeatureLangParser.g:2281:2: rule__UpdateAttributeIdentifier__Group__0__Impl rule__UpdateAttributeIdentifier__Group__1
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
    // InternalFeatureLangParser.g:2288:1: rule__UpdateAttributeIdentifier__Group__0__Impl : ( Have ) ;
    public final void rule__UpdateAttributeIdentifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2292:1: ( ( Have ) )
            // InternalFeatureLangParser.g:2293:1: ( Have )
            {
            // InternalFeatureLangParser.g:2293:1: ( Have )
            // InternalFeatureLangParser.g:2294:2: Have
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
    // InternalFeatureLangParser.g:2303:1: rule__UpdateAttributeIdentifier__Group__1 : rule__UpdateAttributeIdentifier__Group__1__Impl rule__UpdateAttributeIdentifier__Group__2 ;
    public final void rule__UpdateAttributeIdentifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2307:1: ( rule__UpdateAttributeIdentifier__Group__1__Impl rule__UpdateAttributeIdentifier__Group__2 )
            // InternalFeatureLangParser.g:2308:2: rule__UpdateAttributeIdentifier__Group__1__Impl rule__UpdateAttributeIdentifier__Group__2
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
    // InternalFeatureLangParser.g:2315:1: rule__UpdateAttributeIdentifier__Group__1__Impl : ( ( rule__UpdateAttributeIdentifier__Alternatives_1 )? ) ;
    public final void rule__UpdateAttributeIdentifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2319:1: ( ( ( rule__UpdateAttributeIdentifier__Alternatives_1 )? ) )
            // InternalFeatureLangParser.g:2320:1: ( ( rule__UpdateAttributeIdentifier__Alternatives_1 )? )
            {
            // InternalFeatureLangParser.g:2320:1: ( ( rule__UpdateAttributeIdentifier__Alternatives_1 )? )
            // InternalFeatureLangParser.g:2321:2: ( rule__UpdateAttributeIdentifier__Alternatives_1 )?
            {
             before(grammarAccess.getUpdateAttributeIdentifierAccess().getAlternatives_1()); 
            // InternalFeatureLangParser.g:2322:2: ( rule__UpdateAttributeIdentifier__Alternatives_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==An||LA28_0==A) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalFeatureLangParser.g:2322:3: rule__UpdateAttributeIdentifier__Alternatives_1
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
    // InternalFeatureLangParser.g:2330:1: rule__UpdateAttributeIdentifier__Group__2 : rule__UpdateAttributeIdentifier__Group__2__Impl ;
    public final void rule__UpdateAttributeIdentifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2334:1: ( rule__UpdateAttributeIdentifier__Group__2__Impl )
            // InternalFeatureLangParser.g:2335:2: rule__UpdateAttributeIdentifier__Group__2__Impl
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
    // InternalFeatureLangParser.g:2341:1: rule__UpdateAttributeIdentifier__Group__2__Impl : ( ( rule__UpdateAttributeIdentifier__IdentifierAssignment_2 ) ) ;
    public final void rule__UpdateAttributeIdentifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2345:1: ( ( ( rule__UpdateAttributeIdentifier__IdentifierAssignment_2 ) ) )
            // InternalFeatureLangParser.g:2346:1: ( ( rule__UpdateAttributeIdentifier__IdentifierAssignment_2 ) )
            {
            // InternalFeatureLangParser.g:2346:1: ( ( rule__UpdateAttributeIdentifier__IdentifierAssignment_2 ) )
            // InternalFeatureLangParser.g:2347:2: ( rule__UpdateAttributeIdentifier__IdentifierAssignment_2 )
            {
             before(grammarAccess.getUpdateAttributeIdentifierAccess().getIdentifierAssignment_2()); 
            // InternalFeatureLangParser.g:2348:2: ( rule__UpdateAttributeIdentifier__IdentifierAssignment_2 )
            // InternalFeatureLangParser.g:2348:3: rule__UpdateAttributeIdentifier__IdentifierAssignment_2
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
    // InternalFeatureLangParser.g:2357:1: rule__UpdateAttributeValue__Group__0 : rule__UpdateAttributeValue__Group__0__Impl rule__UpdateAttributeValue__Group__1 ;
    public final void rule__UpdateAttributeValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2361:1: ( rule__UpdateAttributeValue__Group__0__Impl rule__UpdateAttributeValue__Group__1 )
            // InternalFeatureLangParser.g:2362:2: rule__UpdateAttributeValue__Group__0__Impl rule__UpdateAttributeValue__Group__1
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
    // InternalFeatureLangParser.g:2369:1: rule__UpdateAttributeValue__Group__0__Impl : ( Have ) ;
    public final void rule__UpdateAttributeValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2373:1: ( ( Have ) )
            // InternalFeatureLangParser.g:2374:1: ( Have )
            {
            // InternalFeatureLangParser.g:2374:1: ( Have )
            // InternalFeatureLangParser.g:2375:2: Have
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
    // InternalFeatureLangParser.g:2384:1: rule__UpdateAttributeValue__Group__1 : rule__UpdateAttributeValue__Group__1__Impl rule__UpdateAttributeValue__Group__2 ;
    public final void rule__UpdateAttributeValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2388:1: ( rule__UpdateAttributeValue__Group__1__Impl rule__UpdateAttributeValue__Group__2 )
            // InternalFeatureLangParser.g:2389:2: rule__UpdateAttributeValue__Group__1__Impl rule__UpdateAttributeValue__Group__2
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
    // InternalFeatureLangParser.g:2396:1: rule__UpdateAttributeValue__Group__1__Impl : ( ( A )? ) ;
    public final void rule__UpdateAttributeValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2400:1: ( ( ( A )? ) )
            // InternalFeatureLangParser.g:2401:1: ( ( A )? )
            {
            // InternalFeatureLangParser.g:2401:1: ( ( A )? )
            // InternalFeatureLangParser.g:2402:2: ( A )?
            {
             before(grammarAccess.getUpdateAttributeValueAccess().getAKeyword_1()); 
            // InternalFeatureLangParser.g:2403:2: ( A )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==A) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalFeatureLangParser.g:2403:3: A
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
    // InternalFeatureLangParser.g:2411:1: rule__UpdateAttributeValue__Group__2 : rule__UpdateAttributeValue__Group__2__Impl rule__UpdateAttributeValue__Group__3 ;
    public final void rule__UpdateAttributeValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2415:1: ( rule__UpdateAttributeValue__Group__2__Impl rule__UpdateAttributeValue__Group__3 )
            // InternalFeatureLangParser.g:2416:2: rule__UpdateAttributeValue__Group__2__Impl rule__UpdateAttributeValue__Group__3
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
    // InternalFeatureLangParser.g:2423:1: rule__UpdateAttributeValue__Group__2__Impl : ( Value ) ;
    public final void rule__UpdateAttributeValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2427:1: ( ( Value ) )
            // InternalFeatureLangParser.g:2428:1: ( Value )
            {
            // InternalFeatureLangParser.g:2428:1: ( Value )
            // InternalFeatureLangParser.g:2429:2: Value
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
    // InternalFeatureLangParser.g:2438:1: rule__UpdateAttributeValue__Group__3 : rule__UpdateAttributeValue__Group__3__Impl ;
    public final void rule__UpdateAttributeValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2442:1: ( rule__UpdateAttributeValue__Group__3__Impl )
            // InternalFeatureLangParser.g:2443:2: rule__UpdateAttributeValue__Group__3__Impl
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
    // InternalFeatureLangParser.g:2449:1: rule__UpdateAttributeValue__Group__3__Impl : ( ( rule__UpdateAttributeValue__ValueAssignment_3 ) ) ;
    public final void rule__UpdateAttributeValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2453:1: ( ( ( rule__UpdateAttributeValue__ValueAssignment_3 ) ) )
            // InternalFeatureLangParser.g:2454:1: ( ( rule__UpdateAttributeValue__ValueAssignment_3 ) )
            {
            // InternalFeatureLangParser.g:2454:1: ( ( rule__UpdateAttributeValue__ValueAssignment_3 ) )
            // InternalFeatureLangParser.g:2455:2: ( rule__UpdateAttributeValue__ValueAssignment_3 )
            {
             before(grammarAccess.getUpdateAttributeValueAccess().getValueAssignment_3()); 
            // InternalFeatureLangParser.g:2456:2: ( rule__UpdateAttributeValue__ValueAssignment_3 )
            // InternalFeatureLangParser.g:2456:3: rule__UpdateAttributeValue__ValueAssignment_3
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
    // InternalFeatureLangParser.g:2465:1: rule__AttributeAction__Group__0 : rule__AttributeAction__Group__0__Impl rule__AttributeAction__Group__1 ;
    public final void rule__AttributeAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2469:1: ( rule__AttributeAction__Group__0__Impl rule__AttributeAction__Group__1 )
            // InternalFeatureLangParser.g:2470:2: rule__AttributeAction__Group__0__Impl rule__AttributeAction__Group__1
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
    // InternalFeatureLangParser.g:2477:1: rule__AttributeAction__Group__0__Impl : ( Have ) ;
    public final void rule__AttributeAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2481:1: ( ( Have ) )
            // InternalFeatureLangParser.g:2482:1: ( Have )
            {
            // InternalFeatureLangParser.g:2482:1: ( Have )
            // InternalFeatureLangParser.g:2483:2: Have
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
    // InternalFeatureLangParser.g:2492:1: rule__AttributeAction__Group__1 : rule__AttributeAction__Group__1__Impl rule__AttributeAction__Group__2 ;
    public final void rule__AttributeAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2496:1: ( rule__AttributeAction__Group__1__Impl rule__AttributeAction__Group__2 )
            // InternalFeatureLangParser.g:2497:2: rule__AttributeAction__Group__1__Impl rule__AttributeAction__Group__2
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
    // InternalFeatureLangParser.g:2504:1: rule__AttributeAction__Group__1__Impl : ( ( rule__AttributeAction__Alternatives_1 ) ) ;
    public final void rule__AttributeAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2508:1: ( ( ( rule__AttributeAction__Alternatives_1 ) ) )
            // InternalFeatureLangParser.g:2509:1: ( ( rule__AttributeAction__Alternatives_1 ) )
            {
            // InternalFeatureLangParser.g:2509:1: ( ( rule__AttributeAction__Alternatives_1 ) )
            // InternalFeatureLangParser.g:2510:2: ( rule__AttributeAction__Alternatives_1 )
            {
             before(grammarAccess.getAttributeActionAccess().getAlternatives_1()); 
            // InternalFeatureLangParser.g:2511:2: ( rule__AttributeAction__Alternatives_1 )
            // InternalFeatureLangParser.g:2511:3: rule__AttributeAction__Alternatives_1
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
    // InternalFeatureLangParser.g:2519:1: rule__AttributeAction__Group__2 : rule__AttributeAction__Group__2__Impl rule__AttributeAction__Group__3 ;
    public final void rule__AttributeAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2523:1: ( rule__AttributeAction__Group__2__Impl rule__AttributeAction__Group__3 )
            // InternalFeatureLangParser.g:2524:2: rule__AttributeAction__Group__2__Impl rule__AttributeAction__Group__3
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
    // InternalFeatureLangParser.g:2531:1: rule__AttributeAction__Group__2__Impl : ( ( rule__AttributeAction__AttributeAssignment_2 ) ) ;
    public final void rule__AttributeAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2535:1: ( ( ( rule__AttributeAction__AttributeAssignment_2 ) ) )
            // InternalFeatureLangParser.g:2536:1: ( ( rule__AttributeAction__AttributeAssignment_2 ) )
            {
            // InternalFeatureLangParser.g:2536:1: ( ( rule__AttributeAction__AttributeAssignment_2 ) )
            // InternalFeatureLangParser.g:2537:2: ( rule__AttributeAction__AttributeAssignment_2 )
            {
             before(grammarAccess.getAttributeActionAccess().getAttributeAssignment_2()); 
            // InternalFeatureLangParser.g:2538:2: ( rule__AttributeAction__AttributeAssignment_2 )
            // InternalFeatureLangParser.g:2538:3: rule__AttributeAction__AttributeAssignment_2
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
    // InternalFeatureLangParser.g:2546:1: rule__AttributeAction__Group__3 : rule__AttributeAction__Group__3__Impl ;
    public final void rule__AttributeAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2550:1: ( rule__AttributeAction__Group__3__Impl )
            // InternalFeatureLangParser.g:2551:2: rule__AttributeAction__Group__3__Impl
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
    // InternalFeatureLangParser.g:2557:1: rule__AttributeAction__Group__3__Impl : ( ( rule__AttributeAction__Group_3__0 )? ) ;
    public final void rule__AttributeAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2561:1: ( ( ( rule__AttributeAction__Group_3__0 )? ) )
            // InternalFeatureLangParser.g:2562:1: ( ( rule__AttributeAction__Group_3__0 )? )
            {
            // InternalFeatureLangParser.g:2562:1: ( ( rule__AttributeAction__Group_3__0 )? )
            // InternalFeatureLangParser.g:2563:2: ( rule__AttributeAction__Group_3__0 )?
            {
             before(grammarAccess.getAttributeActionAccess().getGroup_3()); 
            // InternalFeatureLangParser.g:2564:2: ( rule__AttributeAction__Group_3__0 )?
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
                    // InternalFeatureLangParser.g:2564:3: rule__AttributeAction__Group_3__0
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
    // InternalFeatureLangParser.g:2573:1: rule__AttributeAction__Group_3__0 : rule__AttributeAction__Group_3__0__Impl rule__AttributeAction__Group_3__1 ;
    public final void rule__AttributeAction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2577:1: ( rule__AttributeAction__Group_3__0__Impl rule__AttributeAction__Group_3__1 )
            // InternalFeatureLangParser.g:2578:2: rule__AttributeAction__Group_3__0__Impl rule__AttributeAction__Group_3__1
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
    // InternalFeatureLangParser.g:2585:1: rule__AttributeAction__Group_3__0__Impl : ( FullStop ) ;
    public final void rule__AttributeAction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2589:1: ( ( FullStop ) )
            // InternalFeatureLangParser.g:2590:1: ( FullStop )
            {
            // InternalFeatureLangParser.g:2590:1: ( FullStop )
            // InternalFeatureLangParser.g:2591:2: FullStop
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
    // InternalFeatureLangParser.g:2600:1: rule__AttributeAction__Group_3__1 : rule__AttributeAction__Group_3__1__Impl rule__AttributeAction__Group_3__2 ;
    public final void rule__AttributeAction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2604:1: ( rule__AttributeAction__Group_3__1__Impl rule__AttributeAction__Group_3__2 )
            // InternalFeatureLangParser.g:2605:2: rule__AttributeAction__Group_3__1__Impl rule__AttributeAction__Group_3__2
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
    // InternalFeatureLangParser.g:2612:1: rule__AttributeAction__Group_3__1__Impl : ( It ) ;
    public final void rule__AttributeAction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2616:1: ( ( It ) )
            // InternalFeatureLangParser.g:2617:1: ( It )
            {
            // InternalFeatureLangParser.g:2617:1: ( It )
            // InternalFeatureLangParser.g:2618:2: It
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
    // InternalFeatureLangParser.g:2627:1: rule__AttributeAction__Group_3__2 : rule__AttributeAction__Group_3__2__Impl rule__AttributeAction__Group_3__3 ;
    public final void rule__AttributeAction__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2631:1: ( rule__AttributeAction__Group_3__2__Impl rule__AttributeAction__Group_3__3 )
            // InternalFeatureLangParser.g:2632:2: rule__AttributeAction__Group_3__2__Impl rule__AttributeAction__Group_3__3
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
    // InternalFeatureLangParser.g:2639:1: rule__AttributeAction__Group_3__2__Impl : ( Is ) ;
    public final void rule__AttributeAction__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2643:1: ( ( Is ) )
            // InternalFeatureLangParser.g:2644:1: ( Is )
            {
            // InternalFeatureLangParser.g:2644:1: ( Is )
            // InternalFeatureLangParser.g:2645:2: Is
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
    // InternalFeatureLangParser.g:2654:1: rule__AttributeAction__Group_3__3 : rule__AttributeAction__Group_3__3__Impl rule__AttributeAction__Group_3__4 ;
    public final void rule__AttributeAction__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2658:1: ( rule__AttributeAction__Group_3__3__Impl rule__AttributeAction__Group_3__4 )
            // InternalFeatureLangParser.g:2659:2: rule__AttributeAction__Group_3__3__Impl rule__AttributeAction__Group_3__4
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
    // InternalFeatureLangParser.g:2666:1: rule__AttributeAction__Group_3__3__Impl : ( A ) ;
    public final void rule__AttributeAction__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2670:1: ( ( A ) )
            // InternalFeatureLangParser.g:2671:1: ( A )
            {
            // InternalFeatureLangParser.g:2671:1: ( A )
            // InternalFeatureLangParser.g:2672:2: A
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
    // InternalFeatureLangParser.g:2681:1: rule__AttributeAction__Group_3__4 : rule__AttributeAction__Group_3__4__Impl ;
    public final void rule__AttributeAction__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2685:1: ( rule__AttributeAction__Group_3__4__Impl )
            // InternalFeatureLangParser.g:2686:2: rule__AttributeAction__Group_3__4__Impl
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
    // InternalFeatureLangParser.g:2692:1: rule__AttributeAction__Group_3__4__Impl : ( ( rule__AttributeAction__TypeAssignment_3_4 ) ) ;
    public final void rule__AttributeAction__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2696:1: ( ( ( rule__AttributeAction__TypeAssignment_3_4 ) ) )
            // InternalFeatureLangParser.g:2697:1: ( ( rule__AttributeAction__TypeAssignment_3_4 ) )
            {
            // InternalFeatureLangParser.g:2697:1: ( ( rule__AttributeAction__TypeAssignment_3_4 ) )
            // InternalFeatureLangParser.g:2698:2: ( rule__AttributeAction__TypeAssignment_3_4 )
            {
             before(grammarAccess.getAttributeActionAccess().getTypeAssignment_3_4()); 
            // InternalFeatureLangParser.g:2699:2: ( rule__AttributeAction__TypeAssignment_3_4 )
            // InternalFeatureLangParser.g:2699:3: rule__AttributeAction__TypeAssignment_3_4
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
    // InternalFeatureLangParser.g:2708:1: rule__AssociationAction__Group__0 : rule__AssociationAction__Group__0__Impl rule__AssociationAction__Group__1 ;
    public final void rule__AssociationAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2712:1: ( rule__AssociationAction__Group__0__Impl rule__AssociationAction__Group__1 )
            // InternalFeatureLangParser.g:2713:2: rule__AssociationAction__Group__0__Impl rule__AssociationAction__Group__1
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
    // InternalFeatureLangParser.g:2720:1: rule__AssociationAction__Group__0__Impl : ( Have ) ;
    public final void rule__AssociationAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2724:1: ( ( Have ) )
            // InternalFeatureLangParser.g:2725:1: ( Have )
            {
            // InternalFeatureLangParser.g:2725:1: ( Have )
            // InternalFeatureLangParser.g:2726:2: Have
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
    // InternalFeatureLangParser.g:2735:1: rule__AssociationAction__Group__1 : rule__AssociationAction__Group__1__Impl rule__AssociationAction__Group__2 ;
    public final void rule__AssociationAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2739:1: ( rule__AssociationAction__Group__1__Impl rule__AssociationAction__Group__2 )
            // InternalFeatureLangParser.g:2740:2: rule__AssociationAction__Group__1__Impl rule__AssociationAction__Group__2
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
    // InternalFeatureLangParser.g:2747:1: rule__AssociationAction__Group__1__Impl : ( ( rule__AssociationAction__Alternatives_1 ) ) ;
    public final void rule__AssociationAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2751:1: ( ( ( rule__AssociationAction__Alternatives_1 ) ) )
            // InternalFeatureLangParser.g:2752:1: ( ( rule__AssociationAction__Alternatives_1 ) )
            {
            // InternalFeatureLangParser.g:2752:1: ( ( rule__AssociationAction__Alternatives_1 ) )
            // InternalFeatureLangParser.g:2753:2: ( rule__AssociationAction__Alternatives_1 )
            {
             before(grammarAccess.getAssociationActionAccess().getAlternatives_1()); 
            // InternalFeatureLangParser.g:2754:2: ( rule__AssociationAction__Alternatives_1 )
            // InternalFeatureLangParser.g:2754:3: rule__AssociationAction__Alternatives_1
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
    // InternalFeatureLangParser.g:2762:1: rule__AssociationAction__Group__2 : rule__AssociationAction__Group__2__Impl ;
    public final void rule__AssociationAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2766:1: ( rule__AssociationAction__Group__2__Impl )
            // InternalFeatureLangParser.g:2767:2: rule__AssociationAction__Group__2__Impl
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
    // InternalFeatureLangParser.g:2773:1: rule__AssociationAction__Group__2__Impl : ( ( rule__AssociationAction__Alternatives_2 ) ) ;
    public final void rule__AssociationAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2777:1: ( ( ( rule__AssociationAction__Alternatives_2 ) ) )
            // InternalFeatureLangParser.g:2778:1: ( ( rule__AssociationAction__Alternatives_2 ) )
            {
            // InternalFeatureLangParser.g:2778:1: ( ( rule__AssociationAction__Alternatives_2 ) )
            // InternalFeatureLangParser.g:2779:2: ( rule__AssociationAction__Alternatives_2 )
            {
             before(grammarAccess.getAssociationActionAccess().getAlternatives_2()); 
            // InternalFeatureLangParser.g:2780:2: ( rule__AssociationAction__Alternatives_2 )
            // InternalFeatureLangParser.g:2780:3: rule__AssociationAction__Alternatives_2
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
    // InternalFeatureLangParser.g:2789:1: rule__AssociationAction__Group_2_1__0 : rule__AssociationAction__Group_2_1__0__Impl rule__AssociationAction__Group_2_1__1 ;
    public final void rule__AssociationAction__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2793:1: ( rule__AssociationAction__Group_2_1__0__Impl rule__AssociationAction__Group_2_1__1 )
            // InternalFeatureLangParser.g:2794:2: rule__AssociationAction__Group_2_1__0__Impl rule__AssociationAction__Group_2_1__1
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
    // InternalFeatureLangParser.g:2801:1: rule__AssociationAction__Group_2_1__0__Impl : ( ( rule__AssociationAction__NameAssignment_2_1_0 ) ) ;
    public final void rule__AssociationAction__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2805:1: ( ( ( rule__AssociationAction__NameAssignment_2_1_0 ) ) )
            // InternalFeatureLangParser.g:2806:1: ( ( rule__AssociationAction__NameAssignment_2_1_0 ) )
            {
            // InternalFeatureLangParser.g:2806:1: ( ( rule__AssociationAction__NameAssignment_2_1_0 ) )
            // InternalFeatureLangParser.g:2807:2: ( rule__AssociationAction__NameAssignment_2_1_0 )
            {
             before(grammarAccess.getAssociationActionAccess().getNameAssignment_2_1_0()); 
            // InternalFeatureLangParser.g:2808:2: ( rule__AssociationAction__NameAssignment_2_1_0 )
            // InternalFeatureLangParser.g:2808:3: rule__AssociationAction__NameAssignment_2_1_0
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
    // InternalFeatureLangParser.g:2816:1: rule__AssociationAction__Group_2_1__1 : rule__AssociationAction__Group_2_1__1__Impl ;
    public final void rule__AssociationAction__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2820:1: ( rule__AssociationAction__Group_2_1__1__Impl )
            // InternalFeatureLangParser.g:2821:2: rule__AssociationAction__Group_2_1__1__Impl
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
    // InternalFeatureLangParser.g:2827:1: rule__AssociationAction__Group_2_1__1__Impl : ( ( rule__AssociationAction__EditAssignment_2_1_1 ) ) ;
    public final void rule__AssociationAction__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2831:1: ( ( ( rule__AssociationAction__EditAssignment_2_1_1 ) ) )
            // InternalFeatureLangParser.g:2832:1: ( ( rule__AssociationAction__EditAssignment_2_1_1 ) )
            {
            // InternalFeatureLangParser.g:2832:1: ( ( rule__AssociationAction__EditAssignment_2_1_1 ) )
            // InternalFeatureLangParser.g:2833:2: ( rule__AssociationAction__EditAssignment_2_1_1 )
            {
             before(grammarAccess.getAssociationActionAccess().getEditAssignment_2_1_1()); 
            // InternalFeatureLangParser.g:2834:2: ( rule__AssociationAction__EditAssignment_2_1_1 )
            // InternalFeatureLangParser.g:2834:3: rule__AssociationAction__EditAssignment_2_1_1
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
    // InternalFeatureLangParser.g:2843:1: rule__CreateAssociation__Group__0 : rule__CreateAssociation__Group__0__Impl rule__CreateAssociation__Group__1 ;
    public final void rule__CreateAssociation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2847:1: ( rule__CreateAssociation__Group__0__Impl rule__CreateAssociation__Group__1 )
            // InternalFeatureLangParser.g:2848:2: rule__CreateAssociation__Group__0__Impl rule__CreateAssociation__Group__1
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
    // InternalFeatureLangParser.g:2855:1: rule__CreateAssociation__Group__0__Impl : ( To ) ;
    public final void rule__CreateAssociation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2859:1: ( ( To ) )
            // InternalFeatureLangParser.g:2860:1: ( To )
            {
            // InternalFeatureLangParser.g:2860:1: ( To )
            // InternalFeatureLangParser.g:2861:2: To
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
    // InternalFeatureLangParser.g:2870:1: rule__CreateAssociation__Group__1 : rule__CreateAssociation__Group__1__Impl rule__CreateAssociation__Group__2 ;
    public final void rule__CreateAssociation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2874:1: ( rule__CreateAssociation__Group__1__Impl rule__CreateAssociation__Group__2 )
            // InternalFeatureLangParser.g:2875:2: rule__CreateAssociation__Group__1__Impl rule__CreateAssociation__Group__2
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
    // InternalFeatureLangParser.g:2882:1: rule__CreateAssociation__Group__1__Impl : ( ( Other )? ) ;
    public final void rule__CreateAssociation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2886:1: ( ( ( Other )? ) )
            // InternalFeatureLangParser.g:2887:1: ( ( Other )? )
            {
            // InternalFeatureLangParser.g:2887:1: ( ( Other )? )
            // InternalFeatureLangParser.g:2888:2: ( Other )?
            {
             before(grammarAccess.getCreateAssociationAccess().getOtherKeyword_1()); 
            // InternalFeatureLangParser.g:2889:2: ( Other )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Other) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalFeatureLangParser.g:2889:3: Other
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
    // InternalFeatureLangParser.g:2897:1: rule__CreateAssociation__Group__2 : rule__CreateAssociation__Group__2__Impl rule__CreateAssociation__Group__3 ;
    public final void rule__CreateAssociation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2901:1: ( rule__CreateAssociation__Group__2__Impl rule__CreateAssociation__Group__3 )
            // InternalFeatureLangParser.g:2902:2: rule__CreateAssociation__Group__2__Impl rule__CreateAssociation__Group__3
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
    // InternalFeatureLangParser.g:2909:1: rule__CreateAssociation__Group__2__Impl : ( ( rule__CreateAssociation__TargetAssignment_2 ) ) ;
    public final void rule__CreateAssociation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2913:1: ( ( ( rule__CreateAssociation__TargetAssignment_2 ) ) )
            // InternalFeatureLangParser.g:2914:1: ( ( rule__CreateAssociation__TargetAssignment_2 ) )
            {
            // InternalFeatureLangParser.g:2914:1: ( ( rule__CreateAssociation__TargetAssignment_2 ) )
            // InternalFeatureLangParser.g:2915:2: ( rule__CreateAssociation__TargetAssignment_2 )
            {
             before(grammarAccess.getCreateAssociationAccess().getTargetAssignment_2()); 
            // InternalFeatureLangParser.g:2916:2: ( rule__CreateAssociation__TargetAssignment_2 )
            // InternalFeatureLangParser.g:2916:3: rule__CreateAssociation__TargetAssignment_2
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
    // InternalFeatureLangParser.g:2924:1: rule__CreateAssociation__Group__3 : rule__CreateAssociation__Group__3__Impl rule__CreateAssociation__Group__4 ;
    public final void rule__CreateAssociation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2928:1: ( rule__CreateAssociation__Group__3__Impl rule__CreateAssociation__Group__4 )
            // InternalFeatureLangParser.g:2929:2: rule__CreateAssociation__Group__3__Impl rule__CreateAssociation__Group__4
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
    // InternalFeatureLangParser.g:2936:1: rule__CreateAssociation__Group__3__Impl : ( Called ) ;
    public final void rule__CreateAssociation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2940:1: ( ( Called ) )
            // InternalFeatureLangParser.g:2941:1: ( Called )
            {
            // InternalFeatureLangParser.g:2941:1: ( Called )
            // InternalFeatureLangParser.g:2942:2: Called
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
    // InternalFeatureLangParser.g:2951:1: rule__CreateAssociation__Group__4 : rule__CreateAssociation__Group__4__Impl ;
    public final void rule__CreateAssociation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2955:1: ( rule__CreateAssociation__Group__4__Impl )
            // InternalFeatureLangParser.g:2956:2: rule__CreateAssociation__Group__4__Impl
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
    // InternalFeatureLangParser.g:2962:1: rule__CreateAssociation__Group__4__Impl : ( ( rule__CreateAssociation__RelationAssignment_4 ) ) ;
    public final void rule__CreateAssociation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2966:1: ( ( ( rule__CreateAssociation__RelationAssignment_4 ) ) )
            // InternalFeatureLangParser.g:2967:1: ( ( rule__CreateAssociation__RelationAssignment_4 ) )
            {
            // InternalFeatureLangParser.g:2967:1: ( ( rule__CreateAssociation__RelationAssignment_4 ) )
            // InternalFeatureLangParser.g:2968:2: ( rule__CreateAssociation__RelationAssignment_4 )
            {
             before(grammarAccess.getCreateAssociationAccess().getRelationAssignment_4()); 
            // InternalFeatureLangParser.g:2969:2: ( rule__CreateAssociation__RelationAssignment_4 )
            // InternalFeatureLangParser.g:2969:3: rule__CreateAssociation__RelationAssignment_4
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
    // InternalFeatureLangParser.g:2978:1: rule__SetCompatible__Group__0 : rule__SetCompatible__Group__0__Impl rule__SetCompatible__Group__1 ;
    public final void rule__SetCompatible__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2982:1: ( rule__SetCompatible__Group__0__Impl rule__SetCompatible__Group__1 )
            // InternalFeatureLangParser.g:2983:2: rule__SetCompatible__Group__0__Impl rule__SetCompatible__Group__1
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
    // InternalFeatureLangParser.g:2990:1: rule__SetCompatible__Group__0__Impl : ( Compatible ) ;
    public final void rule__SetCompatible__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2994:1: ( ( Compatible ) )
            // InternalFeatureLangParser.g:2995:1: ( Compatible )
            {
            // InternalFeatureLangParser.g:2995:1: ( Compatible )
            // InternalFeatureLangParser.g:2996:2: Compatible
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
    // InternalFeatureLangParser.g:3005:1: rule__SetCompatible__Group__1 : rule__SetCompatible__Group__1__Impl rule__SetCompatible__Group__2 ;
    public final void rule__SetCompatible__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3009:1: ( rule__SetCompatible__Group__1__Impl rule__SetCompatible__Group__2 )
            // InternalFeatureLangParser.g:3010:2: rule__SetCompatible__Group__1__Impl rule__SetCompatible__Group__2
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
    // InternalFeatureLangParser.g:3017:1: rule__SetCompatible__Group__1__Impl : ( With ) ;
    public final void rule__SetCompatible__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3021:1: ( ( With ) )
            // InternalFeatureLangParser.g:3022:1: ( With )
            {
            // InternalFeatureLangParser.g:3022:1: ( With )
            // InternalFeatureLangParser.g:3023:2: With
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
    // InternalFeatureLangParser.g:3032:1: rule__SetCompatible__Group__2 : rule__SetCompatible__Group__2__Impl rule__SetCompatible__Group__3 ;
    public final void rule__SetCompatible__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3036:1: ( rule__SetCompatible__Group__2__Impl rule__SetCompatible__Group__3 )
            // InternalFeatureLangParser.g:3037:2: rule__SetCompatible__Group__2__Impl rule__SetCompatible__Group__3
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
    // InternalFeatureLangParser.g:3044:1: rule__SetCompatible__Group__2__Impl : ( Version ) ;
    public final void rule__SetCompatible__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3048:1: ( ( Version ) )
            // InternalFeatureLangParser.g:3049:1: ( Version )
            {
            // InternalFeatureLangParser.g:3049:1: ( Version )
            // InternalFeatureLangParser.g:3050:2: Version
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
    // InternalFeatureLangParser.g:3059:1: rule__SetCompatible__Group__3 : rule__SetCompatible__Group__3__Impl ;
    public final void rule__SetCompatible__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3063:1: ( rule__SetCompatible__Group__3__Impl )
            // InternalFeatureLangParser.g:3064:2: rule__SetCompatible__Group__3__Impl
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
    // InternalFeatureLangParser.g:3070:1: rule__SetCompatible__Group__3__Impl : ( ( rule__SetCompatible__NameAssignment_3 ) ) ;
    public final void rule__SetCompatible__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3074:1: ( ( ( rule__SetCompatible__NameAssignment_3 ) ) )
            // InternalFeatureLangParser.g:3075:1: ( ( rule__SetCompatible__NameAssignment_3 ) )
            {
            // InternalFeatureLangParser.g:3075:1: ( ( rule__SetCompatible__NameAssignment_3 ) )
            // InternalFeatureLangParser.g:3076:2: ( rule__SetCompatible__NameAssignment_3 )
            {
             before(grammarAccess.getSetCompatibleAccess().getNameAssignment_3()); 
            // InternalFeatureLangParser.g:3077:2: ( rule__SetCompatible__NameAssignment_3 )
            // InternalFeatureLangParser.g:3077:3: rule__SetCompatible__NameAssignment_3
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
    // InternalFeatureLangParser.g:3086:1: rule__SetVersionRange__Group__0 : rule__SetVersionRange__Group__0__Impl rule__SetVersionRange__Group__1 ;
    public final void rule__SetVersionRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3090:1: ( rule__SetVersionRange__Group__0__Impl rule__SetVersionRange__Group__1 )
            // InternalFeatureLangParser.g:3091:2: rule__SetVersionRange__Group__0__Impl rule__SetVersionRange__Group__1
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
    // InternalFeatureLangParser.g:3098:1: rule__SetVersionRange__Group__0__Impl : ( With ) ;
    public final void rule__SetVersionRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3102:1: ( ( With ) )
            // InternalFeatureLangParser.g:3103:1: ( With )
            {
            // InternalFeatureLangParser.g:3103:1: ( With )
            // InternalFeatureLangParser.g:3104:2: With
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
    // InternalFeatureLangParser.g:3113:1: rule__SetVersionRange__Group__1 : rule__SetVersionRange__Group__1__Impl rule__SetVersionRange__Group__2 ;
    public final void rule__SetVersionRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3117:1: ( rule__SetVersionRange__Group__1__Impl rule__SetVersionRange__Group__2 )
            // InternalFeatureLangParser.g:3118:2: rule__SetVersionRange__Group__1__Impl rule__SetVersionRange__Group__2
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
    // InternalFeatureLangParser.g:3125:1: rule__SetVersionRange__Group__1__Impl : ( Version ) ;
    public final void rule__SetVersionRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3129:1: ( ( Version ) )
            // InternalFeatureLangParser.g:3130:1: ( Version )
            {
            // InternalFeatureLangParser.g:3130:1: ( Version )
            // InternalFeatureLangParser.g:3131:2: Version
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
    // InternalFeatureLangParser.g:3140:1: rule__SetVersionRange__Group__2 : rule__SetVersionRange__Group__2__Impl rule__SetVersionRange__Group__3 ;
    public final void rule__SetVersionRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3144:1: ( rule__SetVersionRange__Group__2__Impl rule__SetVersionRange__Group__3 )
            // InternalFeatureLangParser.g:3145:2: rule__SetVersionRange__Group__2__Impl rule__SetVersionRange__Group__3
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
    // InternalFeatureLangParser.g:3152:1: rule__SetVersionRange__Group__2__Impl : ( Range ) ;
    public final void rule__SetVersionRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3156:1: ( ( Range ) )
            // InternalFeatureLangParser.g:3157:1: ( Range )
            {
            // InternalFeatureLangParser.g:3157:1: ( Range )
            // InternalFeatureLangParser.g:3158:2: Range
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
    // InternalFeatureLangParser.g:3167:1: rule__SetVersionRange__Group__3 : rule__SetVersionRange__Group__3__Impl rule__SetVersionRange__Group__4 ;
    public final void rule__SetVersionRange__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3171:1: ( rule__SetVersionRange__Group__3__Impl rule__SetVersionRange__Group__4 )
            // InternalFeatureLangParser.g:3172:2: rule__SetVersionRange__Group__3__Impl rule__SetVersionRange__Group__4
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
    // InternalFeatureLangParser.g:3179:1: rule__SetVersionRange__Group__3__Impl : ( From ) ;
    public final void rule__SetVersionRange__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3183:1: ( ( From ) )
            // InternalFeatureLangParser.g:3184:1: ( From )
            {
            // InternalFeatureLangParser.g:3184:1: ( From )
            // InternalFeatureLangParser.g:3185:2: From
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
    // InternalFeatureLangParser.g:3194:1: rule__SetVersionRange__Group__4 : rule__SetVersionRange__Group__4__Impl rule__SetVersionRange__Group__5 ;
    public final void rule__SetVersionRange__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3198:1: ( rule__SetVersionRange__Group__4__Impl rule__SetVersionRange__Group__5 )
            // InternalFeatureLangParser.g:3199:2: rule__SetVersionRange__Group__4__Impl rule__SetVersionRange__Group__5
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
    // InternalFeatureLangParser.g:3206:1: rule__SetVersionRange__Group__4__Impl : ( ( rule__SetVersionRange__StartAssignment_4 ) ) ;
    public final void rule__SetVersionRange__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3210:1: ( ( ( rule__SetVersionRange__StartAssignment_4 ) ) )
            // InternalFeatureLangParser.g:3211:1: ( ( rule__SetVersionRange__StartAssignment_4 ) )
            {
            // InternalFeatureLangParser.g:3211:1: ( ( rule__SetVersionRange__StartAssignment_4 ) )
            // InternalFeatureLangParser.g:3212:2: ( rule__SetVersionRange__StartAssignment_4 )
            {
             before(grammarAccess.getSetVersionRangeAccess().getStartAssignment_4()); 
            // InternalFeatureLangParser.g:3213:2: ( rule__SetVersionRange__StartAssignment_4 )
            // InternalFeatureLangParser.g:3213:3: rule__SetVersionRange__StartAssignment_4
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
    // InternalFeatureLangParser.g:3221:1: rule__SetVersionRange__Group__5 : rule__SetVersionRange__Group__5__Impl rule__SetVersionRange__Group__6 ;
    public final void rule__SetVersionRange__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3225:1: ( rule__SetVersionRange__Group__5__Impl rule__SetVersionRange__Group__6 )
            // InternalFeatureLangParser.g:3226:2: rule__SetVersionRange__Group__5__Impl rule__SetVersionRange__Group__6
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
    // InternalFeatureLangParser.g:3233:1: rule__SetVersionRange__Group__5__Impl : ( To ) ;
    public final void rule__SetVersionRange__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3237:1: ( ( To ) )
            // InternalFeatureLangParser.g:3238:1: ( To )
            {
            // InternalFeatureLangParser.g:3238:1: ( To )
            // InternalFeatureLangParser.g:3239:2: To
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
    // InternalFeatureLangParser.g:3248:1: rule__SetVersionRange__Group__6 : rule__SetVersionRange__Group__6__Impl ;
    public final void rule__SetVersionRange__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3252:1: ( rule__SetVersionRange__Group__6__Impl )
            // InternalFeatureLangParser.g:3253:2: rule__SetVersionRange__Group__6__Impl
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
    // InternalFeatureLangParser.g:3259:1: rule__SetVersionRange__Group__6__Impl : ( ( rule__SetVersionRange__EndAssignment_6 ) ) ;
    public final void rule__SetVersionRange__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3263:1: ( ( ( rule__SetVersionRange__EndAssignment_6 ) ) )
            // InternalFeatureLangParser.g:3264:1: ( ( rule__SetVersionRange__EndAssignment_6 ) )
            {
            // InternalFeatureLangParser.g:3264:1: ( ( rule__SetVersionRange__EndAssignment_6 ) )
            // InternalFeatureLangParser.g:3265:2: ( rule__SetVersionRange__EndAssignment_6 )
            {
             before(grammarAccess.getSetVersionRangeAccess().getEndAssignment_6()); 
            // InternalFeatureLangParser.g:3266:2: ( rule__SetVersionRange__EndAssignment_6 )
            // InternalFeatureLangParser.g:3266:3: rule__SetVersionRange__EndAssignment_6
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
    // InternalFeatureLangParser.g:3275:1: rule__SetVariant__Group__0 : rule__SetVariant__Group__0__Impl rule__SetVariant__Group__1 ;
    public final void rule__SetVariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3279:1: ( rule__SetVariant__Group__0__Impl rule__SetVariant__Group__1 )
            // InternalFeatureLangParser.g:3280:2: rule__SetVariant__Group__0__Impl rule__SetVariant__Group__1
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
    // InternalFeatureLangParser.g:3287:1: rule__SetVariant__Group__0__Impl : ( With ) ;
    public final void rule__SetVariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3291:1: ( ( With ) )
            // InternalFeatureLangParser.g:3292:1: ( With )
            {
            // InternalFeatureLangParser.g:3292:1: ( With )
            // InternalFeatureLangParser.g:3293:2: With
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
    // InternalFeatureLangParser.g:3302:1: rule__SetVariant__Group__1 : rule__SetVariant__Group__1__Impl rule__SetVariant__Group__2 ;
    public final void rule__SetVariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3306:1: ( rule__SetVariant__Group__1__Impl rule__SetVariant__Group__2 )
            // InternalFeatureLangParser.g:3307:2: rule__SetVariant__Group__1__Impl rule__SetVariant__Group__2
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
    // InternalFeatureLangParser.g:3314:1: rule__SetVariant__Group__1__Impl : ( All ) ;
    public final void rule__SetVariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3318:1: ( ( All ) )
            // InternalFeatureLangParser.g:3319:1: ( All )
            {
            // InternalFeatureLangParser.g:3319:1: ( All )
            // InternalFeatureLangParser.g:3320:2: All
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
    // InternalFeatureLangParser.g:3329:1: rule__SetVariant__Group__2 : rule__SetVariant__Group__2__Impl rule__SetVariant__Group__3 ;
    public final void rule__SetVariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3333:1: ( rule__SetVariant__Group__2__Impl rule__SetVariant__Group__3 )
            // InternalFeatureLangParser.g:3334:2: rule__SetVariant__Group__2__Impl rule__SetVariant__Group__3
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
    // InternalFeatureLangParser.g:3341:1: rule__SetVariant__Group__2__Impl : ( Versions ) ;
    public final void rule__SetVariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3345:1: ( ( Versions ) )
            // InternalFeatureLangParser.g:3346:1: ( Versions )
            {
            // InternalFeatureLangParser.g:3346:1: ( Versions )
            // InternalFeatureLangParser.g:3347:2: Versions
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
    // InternalFeatureLangParser.g:3356:1: rule__SetVariant__Group__3 : rule__SetVariant__Group__3__Impl rule__SetVariant__Group__4 ;
    public final void rule__SetVariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3360:1: ( rule__SetVariant__Group__3__Impl rule__SetVariant__Group__4 )
            // InternalFeatureLangParser.g:3361:2: rule__SetVariant__Group__3__Impl rule__SetVariant__Group__4
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
    // InternalFeatureLangParser.g:3368:1: rule__SetVariant__Group__3__Impl : ( Of ) ;
    public final void rule__SetVariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3372:1: ( ( Of ) )
            // InternalFeatureLangParser.g:3373:1: ( Of )
            {
            // InternalFeatureLangParser.g:3373:1: ( Of )
            // InternalFeatureLangParser.g:3374:2: Of
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
    // InternalFeatureLangParser.g:3383:1: rule__SetVariant__Group__4 : rule__SetVariant__Group__4__Impl rule__SetVariant__Group__5 ;
    public final void rule__SetVariant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3387:1: ( rule__SetVariant__Group__4__Impl rule__SetVariant__Group__5 )
            // InternalFeatureLangParser.g:3388:2: rule__SetVariant__Group__4__Impl rule__SetVariant__Group__5
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
    // InternalFeatureLangParser.g:3395:1: rule__SetVariant__Group__4__Impl : ( Variant ) ;
    public final void rule__SetVariant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3399:1: ( ( Variant ) )
            // InternalFeatureLangParser.g:3400:1: ( Variant )
            {
            // InternalFeatureLangParser.g:3400:1: ( Variant )
            // InternalFeatureLangParser.g:3401:2: Variant
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
    // InternalFeatureLangParser.g:3410:1: rule__SetVariant__Group__5 : rule__SetVariant__Group__5__Impl ;
    public final void rule__SetVariant__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3414:1: ( rule__SetVariant__Group__5__Impl )
            // InternalFeatureLangParser.g:3415:2: rule__SetVariant__Group__5__Impl
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
    // InternalFeatureLangParser.g:3421:1: rule__SetVariant__Group__5__Impl : ( ( rule__SetVariant__NameAssignment_5 ) ) ;
    public final void rule__SetVariant__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3425:1: ( ( ( rule__SetVariant__NameAssignment_5 ) ) )
            // InternalFeatureLangParser.g:3426:1: ( ( rule__SetVariant__NameAssignment_5 ) )
            {
            // InternalFeatureLangParser.g:3426:1: ( ( rule__SetVariant__NameAssignment_5 ) )
            // InternalFeatureLangParser.g:3427:2: ( rule__SetVariant__NameAssignment_5 )
            {
             before(grammarAccess.getSetVariantAccess().getNameAssignment_5()); 
            // InternalFeatureLangParser.g:3428:2: ( rule__SetVariant__NameAssignment_5 )
            // InternalFeatureLangParser.g:3428:3: rule__SetVariant__NameAssignment_5
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
    // InternalFeatureLangParser.g:3437:1: rule__SetRightOpen__Group__0 : rule__SetRightOpen__Group__0__Impl rule__SetRightOpen__Group__1 ;
    public final void rule__SetRightOpen__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3441:1: ( rule__SetRightOpen__Group__0__Impl rule__SetRightOpen__Group__1 )
            // InternalFeatureLangParser.g:3442:2: rule__SetRightOpen__Group__0__Impl rule__SetRightOpen__Group__1
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
    // InternalFeatureLangParser.g:3449:1: rule__SetRightOpen__Group__0__Impl : ( Up ) ;
    public final void rule__SetRightOpen__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3453:1: ( ( Up ) )
            // InternalFeatureLangParser.g:3454:1: ( Up )
            {
            // InternalFeatureLangParser.g:3454:1: ( Up )
            // InternalFeatureLangParser.g:3455:2: Up
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
    // InternalFeatureLangParser.g:3464:1: rule__SetRightOpen__Group__1 : rule__SetRightOpen__Group__1__Impl rule__SetRightOpen__Group__2 ;
    public final void rule__SetRightOpen__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3468:1: ( rule__SetRightOpen__Group__1__Impl rule__SetRightOpen__Group__2 )
            // InternalFeatureLangParser.g:3469:2: rule__SetRightOpen__Group__1__Impl rule__SetRightOpen__Group__2
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
    // InternalFeatureLangParser.g:3476:1: rule__SetRightOpen__Group__1__Impl : ( To ) ;
    public final void rule__SetRightOpen__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3480:1: ( ( To ) )
            // InternalFeatureLangParser.g:3481:1: ( To )
            {
            // InternalFeatureLangParser.g:3481:1: ( To )
            // InternalFeatureLangParser.g:3482:2: To
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
    // InternalFeatureLangParser.g:3491:1: rule__SetRightOpen__Group__2 : rule__SetRightOpen__Group__2__Impl rule__SetRightOpen__Group__3 ;
    public final void rule__SetRightOpen__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3495:1: ( rule__SetRightOpen__Group__2__Impl rule__SetRightOpen__Group__3 )
            // InternalFeatureLangParser.g:3496:2: rule__SetRightOpen__Group__2__Impl rule__SetRightOpen__Group__3
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
    // InternalFeatureLangParser.g:3503:1: rule__SetRightOpen__Group__2__Impl : ( Date ) ;
    public final void rule__SetRightOpen__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3507:1: ( ( Date ) )
            // InternalFeatureLangParser.g:3508:1: ( Date )
            {
            // InternalFeatureLangParser.g:3508:1: ( Date )
            // InternalFeatureLangParser.g:3509:2: Date
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
    // InternalFeatureLangParser.g:3518:1: rule__SetRightOpen__Group__3 : rule__SetRightOpen__Group__3__Impl ;
    public final void rule__SetRightOpen__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3522:1: ( rule__SetRightOpen__Group__3__Impl )
            // InternalFeatureLangParser.g:3523:2: rule__SetRightOpen__Group__3__Impl
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
    // InternalFeatureLangParser.g:3529:1: rule__SetRightOpen__Group__3__Impl : ( ( rule__SetRightOpen__DateAssignment_3 ) ) ;
    public final void rule__SetRightOpen__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3533:1: ( ( ( rule__SetRightOpen__DateAssignment_3 ) ) )
            // InternalFeatureLangParser.g:3534:1: ( ( rule__SetRightOpen__DateAssignment_3 ) )
            {
            // InternalFeatureLangParser.g:3534:1: ( ( rule__SetRightOpen__DateAssignment_3 ) )
            // InternalFeatureLangParser.g:3535:2: ( rule__SetRightOpen__DateAssignment_3 )
            {
             before(grammarAccess.getSetRightOpenAccess().getDateAssignment_3()); 
            // InternalFeatureLangParser.g:3536:2: ( rule__SetRightOpen__DateAssignment_3 )
            // InternalFeatureLangParser.g:3536:3: rule__SetRightOpen__DateAssignment_3
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
    // InternalFeatureLangParser.g:3545:1: rule__SetLeftOpen__Group__0 : rule__SetLeftOpen__Group__0__Impl rule__SetLeftOpen__Group__1 ;
    public final void rule__SetLeftOpen__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3549:1: ( rule__SetLeftOpen__Group__0__Impl rule__SetLeftOpen__Group__1 )
            // InternalFeatureLangParser.g:3550:2: rule__SetLeftOpen__Group__0__Impl rule__SetLeftOpen__Group__1
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
    // InternalFeatureLangParser.g:3557:1: rule__SetLeftOpen__Group__0__Impl : ( Starting ) ;
    public final void rule__SetLeftOpen__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3561:1: ( ( Starting ) )
            // InternalFeatureLangParser.g:3562:1: ( Starting )
            {
            // InternalFeatureLangParser.g:3562:1: ( Starting )
            // InternalFeatureLangParser.g:3563:2: Starting
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
    // InternalFeatureLangParser.g:3572:1: rule__SetLeftOpen__Group__1 : rule__SetLeftOpen__Group__1__Impl rule__SetLeftOpen__Group__2 ;
    public final void rule__SetLeftOpen__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3576:1: ( rule__SetLeftOpen__Group__1__Impl rule__SetLeftOpen__Group__2 )
            // InternalFeatureLangParser.g:3577:2: rule__SetLeftOpen__Group__1__Impl rule__SetLeftOpen__Group__2
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
    // InternalFeatureLangParser.g:3584:1: rule__SetLeftOpen__Group__1__Impl : ( From ) ;
    public final void rule__SetLeftOpen__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3588:1: ( ( From ) )
            // InternalFeatureLangParser.g:3589:1: ( From )
            {
            // InternalFeatureLangParser.g:3589:1: ( From )
            // InternalFeatureLangParser.g:3590:2: From
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
    // InternalFeatureLangParser.g:3599:1: rule__SetLeftOpen__Group__2 : rule__SetLeftOpen__Group__2__Impl rule__SetLeftOpen__Group__3 ;
    public final void rule__SetLeftOpen__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3603:1: ( rule__SetLeftOpen__Group__2__Impl rule__SetLeftOpen__Group__3 )
            // InternalFeatureLangParser.g:3604:2: rule__SetLeftOpen__Group__2__Impl rule__SetLeftOpen__Group__3
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
    // InternalFeatureLangParser.g:3611:1: rule__SetLeftOpen__Group__2__Impl : ( Date ) ;
    public final void rule__SetLeftOpen__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3615:1: ( ( Date ) )
            // InternalFeatureLangParser.g:3616:1: ( Date )
            {
            // InternalFeatureLangParser.g:3616:1: ( Date )
            // InternalFeatureLangParser.g:3617:2: Date
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
    // InternalFeatureLangParser.g:3626:1: rule__SetLeftOpen__Group__3 : rule__SetLeftOpen__Group__3__Impl ;
    public final void rule__SetLeftOpen__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3630:1: ( rule__SetLeftOpen__Group__3__Impl )
            // InternalFeatureLangParser.g:3631:2: rule__SetLeftOpen__Group__3__Impl
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
    // InternalFeatureLangParser.g:3637:1: rule__SetLeftOpen__Group__3__Impl : ( ( rule__SetLeftOpen__DateAssignment_3 ) ) ;
    public final void rule__SetLeftOpen__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3641:1: ( ( ( rule__SetLeftOpen__DateAssignment_3 ) ) )
            // InternalFeatureLangParser.g:3642:1: ( ( rule__SetLeftOpen__DateAssignment_3 ) )
            {
            // InternalFeatureLangParser.g:3642:1: ( ( rule__SetLeftOpen__DateAssignment_3 ) )
            // InternalFeatureLangParser.g:3643:2: ( rule__SetLeftOpen__DateAssignment_3 )
            {
             before(grammarAccess.getSetLeftOpenAccess().getDateAssignment_3()); 
            // InternalFeatureLangParser.g:3644:2: ( rule__SetLeftOpen__DateAssignment_3 )
            // InternalFeatureLangParser.g:3644:3: rule__SetLeftOpen__DateAssignment_3
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


    // $ANTLR start "rule__CreateInheritance__Group__0"
    // InternalFeatureLangParser.g:3653:1: rule__CreateInheritance__Group__0 : rule__CreateInheritance__Group__0__Impl rule__CreateInheritance__Group__1 ;
    public final void rule__CreateInheritance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3657:1: ( rule__CreateInheritance__Group__0__Impl rule__CreateInheritance__Group__1 )
            // InternalFeatureLangParser.g:3658:2: rule__CreateInheritance__Group__0__Impl rule__CreateInheritance__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__CreateInheritance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateInheritance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateInheritance__Group__0"


    // $ANTLR start "rule__CreateInheritance__Group__0__Impl"
    // InternalFeatureLangParser.g:3665:1: rule__CreateInheritance__Group__0__Impl : ( Inherit ) ;
    public final void rule__CreateInheritance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3669:1: ( ( Inherit ) )
            // InternalFeatureLangParser.g:3670:1: ( Inherit )
            {
            // InternalFeatureLangParser.g:3670:1: ( Inherit )
            // InternalFeatureLangParser.g:3671:2: Inherit
            {
             before(grammarAccess.getCreateInheritanceAccess().getInheritKeyword_0()); 
            match(input,Inherit,FOLLOW_2); 
             after(grammarAccess.getCreateInheritanceAccess().getInheritKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateInheritance__Group__0__Impl"


    // $ANTLR start "rule__CreateInheritance__Group__1"
    // InternalFeatureLangParser.g:3680:1: rule__CreateInheritance__Group__1 : rule__CreateInheritance__Group__1__Impl rule__CreateInheritance__Group__2 ;
    public final void rule__CreateInheritance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3684:1: ( rule__CreateInheritance__Group__1__Impl rule__CreateInheritance__Group__2 )
            // InternalFeatureLangParser.g:3685:2: rule__CreateInheritance__Group__1__Impl rule__CreateInheritance__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__CreateInheritance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateInheritance__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateInheritance__Group__1"


    // $ANTLR start "rule__CreateInheritance__Group__1__Impl"
    // InternalFeatureLangParser.g:3692:1: rule__CreateInheritance__Group__1__Impl : ( From ) ;
    public final void rule__CreateInheritance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3696:1: ( ( From ) )
            // InternalFeatureLangParser.g:3697:1: ( From )
            {
            // InternalFeatureLangParser.g:3697:1: ( From )
            // InternalFeatureLangParser.g:3698:2: From
            {
             before(grammarAccess.getCreateInheritanceAccess().getFromKeyword_1()); 
            match(input,From,FOLLOW_2); 
             after(grammarAccess.getCreateInheritanceAccess().getFromKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateInheritance__Group__1__Impl"


    // $ANTLR start "rule__CreateInheritance__Group__2"
    // InternalFeatureLangParser.g:3707:1: rule__CreateInheritance__Group__2 : rule__CreateInheritance__Group__2__Impl ;
    public final void rule__CreateInheritance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3711:1: ( rule__CreateInheritance__Group__2__Impl )
            // InternalFeatureLangParser.g:3712:2: rule__CreateInheritance__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CreateInheritance__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateInheritance__Group__2"


    // $ANTLR start "rule__CreateInheritance__Group__2__Impl"
    // InternalFeatureLangParser.g:3718:1: rule__CreateInheritance__Group__2__Impl : ( ( rule__CreateInheritance__ParentAssignment_2 ) ) ;
    public final void rule__CreateInheritance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3722:1: ( ( ( rule__CreateInheritance__ParentAssignment_2 ) ) )
            // InternalFeatureLangParser.g:3723:1: ( ( rule__CreateInheritance__ParentAssignment_2 ) )
            {
            // InternalFeatureLangParser.g:3723:1: ( ( rule__CreateInheritance__ParentAssignment_2 ) )
            // InternalFeatureLangParser.g:3724:2: ( rule__CreateInheritance__ParentAssignment_2 )
            {
             before(grammarAccess.getCreateInheritanceAccess().getParentAssignment_2()); 
            // InternalFeatureLangParser.g:3725:2: ( rule__CreateInheritance__ParentAssignment_2 )
            // InternalFeatureLangParser.g:3725:3: rule__CreateInheritance__ParentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CreateInheritance__ParentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCreateInheritanceAccess().getParentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateInheritance__Group__2__Impl"


    // $ANTLR start "rule__EditInheritance__Group__0"
    // InternalFeatureLangParser.g:3734:1: rule__EditInheritance__Group__0 : rule__EditInheritance__Group__0__Impl rule__EditInheritance__Group__1 ;
    public final void rule__EditInheritance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3738:1: ( rule__EditInheritance__Group__0__Impl rule__EditInheritance__Group__1 )
            // InternalFeatureLangParser.g:3739:2: rule__EditInheritance__Group__0__Impl rule__EditInheritance__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__EditInheritance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EditInheritance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditInheritance__Group__0"


    // $ANTLR start "rule__EditInheritance__Group__0__Impl"
    // InternalFeatureLangParser.g:3746:1: rule__EditInheritance__Group__0__Impl : ( Have ) ;
    public final void rule__EditInheritance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3750:1: ( ( Have ) )
            // InternalFeatureLangParser.g:3751:1: ( Have )
            {
            // InternalFeatureLangParser.g:3751:1: ( Have )
            // InternalFeatureLangParser.g:3752:2: Have
            {
             before(grammarAccess.getEditInheritanceAccess().getHaveKeyword_0()); 
            match(input,Have,FOLLOW_2); 
             after(grammarAccess.getEditInheritanceAccess().getHaveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditInheritance__Group__0__Impl"


    // $ANTLR start "rule__EditInheritance__Group__1"
    // InternalFeatureLangParser.g:3761:1: rule__EditInheritance__Group__1 : rule__EditInheritance__Group__1__Impl rule__EditInheritance__Group__2 ;
    public final void rule__EditInheritance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3765:1: ( rule__EditInheritance__Group__1__Impl rule__EditInheritance__Group__2 )
            // InternalFeatureLangParser.g:3766:2: rule__EditInheritance__Group__1__Impl rule__EditInheritance__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__EditInheritance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EditInheritance__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditInheritance__Group__1"


    // $ANTLR start "rule__EditInheritance__Group__1__Impl"
    // InternalFeatureLangParser.g:3773:1: rule__EditInheritance__Group__1__Impl : ( Inheritance ) ;
    public final void rule__EditInheritance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3777:1: ( ( Inheritance ) )
            // InternalFeatureLangParser.g:3778:1: ( Inheritance )
            {
            // InternalFeatureLangParser.g:3778:1: ( Inheritance )
            // InternalFeatureLangParser.g:3779:2: Inheritance
            {
             before(grammarAccess.getEditInheritanceAccess().getInheritanceKeyword_1()); 
            match(input,Inheritance,FOLLOW_2); 
             after(grammarAccess.getEditInheritanceAccess().getInheritanceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditInheritance__Group__1__Impl"


    // $ANTLR start "rule__EditInheritance__Group__2"
    // InternalFeatureLangParser.g:3788:1: rule__EditInheritance__Group__2 : rule__EditInheritance__Group__2__Impl rule__EditInheritance__Group__3 ;
    public final void rule__EditInheritance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3792:1: ( rule__EditInheritance__Group__2__Impl rule__EditInheritance__Group__3 )
            // InternalFeatureLangParser.g:3793:2: rule__EditInheritance__Group__2__Impl rule__EditInheritance__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__EditInheritance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EditInheritance__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditInheritance__Group__2"


    // $ANTLR start "rule__EditInheritance__Group__2__Impl"
    // InternalFeatureLangParser.g:3800:1: rule__EditInheritance__Group__2__Impl : ( URI ) ;
    public final void rule__EditInheritance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3804:1: ( ( URI ) )
            // InternalFeatureLangParser.g:3805:1: ( URI )
            {
            // InternalFeatureLangParser.g:3805:1: ( URI )
            // InternalFeatureLangParser.g:3806:2: URI
            {
             before(grammarAccess.getEditInheritanceAccess().getURIKeyword_2()); 
            match(input,URI,FOLLOW_2); 
             after(grammarAccess.getEditInheritanceAccess().getURIKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditInheritance__Group__2__Impl"


    // $ANTLR start "rule__EditInheritance__Group__3"
    // InternalFeatureLangParser.g:3815:1: rule__EditInheritance__Group__3 : rule__EditInheritance__Group__3__Impl ;
    public final void rule__EditInheritance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3819:1: ( rule__EditInheritance__Group__3__Impl )
            // InternalFeatureLangParser.g:3820:2: rule__EditInheritance__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EditInheritance__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditInheritance__Group__3"


    // $ANTLR start "rule__EditInheritance__Group__3__Impl"
    // InternalFeatureLangParser.g:3826:1: rule__EditInheritance__Group__3__Impl : ( ( rule__EditInheritance__UriAssignment_3 ) ) ;
    public final void rule__EditInheritance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3830:1: ( ( ( rule__EditInheritance__UriAssignment_3 ) ) )
            // InternalFeatureLangParser.g:3831:1: ( ( rule__EditInheritance__UriAssignment_3 ) )
            {
            // InternalFeatureLangParser.g:3831:1: ( ( rule__EditInheritance__UriAssignment_3 ) )
            // InternalFeatureLangParser.g:3832:2: ( rule__EditInheritance__UriAssignment_3 )
            {
             before(grammarAccess.getEditInheritanceAccess().getUriAssignment_3()); 
            // InternalFeatureLangParser.g:3833:2: ( rule__EditInheritance__UriAssignment_3 )
            // InternalFeatureLangParser.g:3833:3: rule__EditInheritance__UriAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EditInheritance__UriAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEditInheritanceAccess().getUriAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditInheritance__Group__3__Impl"


    // $ANTLR start "rule__CreateComposition__Group__0"
    // InternalFeatureLangParser.g:3842:1: rule__CreateComposition__Group__0 : rule__CreateComposition__Group__0__Impl rule__CreateComposition__Group__1 ;
    public final void rule__CreateComposition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3846:1: ( rule__CreateComposition__Group__0__Impl rule__CreateComposition__Group__1 )
            // InternalFeatureLangParser.g:3847:2: rule__CreateComposition__Group__0__Impl rule__CreateComposition__Group__1
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
    // InternalFeatureLangParser.g:3854:1: rule__CreateComposition__Group__0__Impl : ( Compose ) ;
    public final void rule__CreateComposition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3858:1: ( ( Compose ) )
            // InternalFeatureLangParser.g:3859:1: ( Compose )
            {
            // InternalFeatureLangParser.g:3859:1: ( Compose )
            // InternalFeatureLangParser.g:3860:2: Compose
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
    // InternalFeatureLangParser.g:3869:1: rule__CreateComposition__Group__1 : rule__CreateComposition__Group__1__Impl rule__CreateComposition__Group__2 ;
    public final void rule__CreateComposition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3873:1: ( rule__CreateComposition__Group__1__Impl rule__CreateComposition__Group__2 )
            // InternalFeatureLangParser.g:3874:2: rule__CreateComposition__Group__1__Impl rule__CreateComposition__Group__2
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
    // InternalFeatureLangParser.g:3881:1: rule__CreateComposition__Group__1__Impl : ( ( rule__CreateComposition__TargetAssignment_1 ) ) ;
    public final void rule__CreateComposition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3885:1: ( ( ( rule__CreateComposition__TargetAssignment_1 ) ) )
            // InternalFeatureLangParser.g:3886:1: ( ( rule__CreateComposition__TargetAssignment_1 ) )
            {
            // InternalFeatureLangParser.g:3886:1: ( ( rule__CreateComposition__TargetAssignment_1 ) )
            // InternalFeatureLangParser.g:3887:2: ( rule__CreateComposition__TargetAssignment_1 )
            {
             before(grammarAccess.getCreateCompositionAccess().getTargetAssignment_1()); 
            // InternalFeatureLangParser.g:3888:2: ( rule__CreateComposition__TargetAssignment_1 )
            // InternalFeatureLangParser.g:3888:3: rule__CreateComposition__TargetAssignment_1
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
    // InternalFeatureLangParser.g:3896:1: rule__CreateComposition__Group__2 : rule__CreateComposition__Group__2__Impl rule__CreateComposition__Group__3 ;
    public final void rule__CreateComposition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3900:1: ( rule__CreateComposition__Group__2__Impl rule__CreateComposition__Group__3 )
            // InternalFeatureLangParser.g:3901:2: rule__CreateComposition__Group__2__Impl rule__CreateComposition__Group__3
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
    // InternalFeatureLangParser.g:3908:1: rule__CreateComposition__Group__2__Impl : ( Called ) ;
    public final void rule__CreateComposition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3912:1: ( ( Called ) )
            // InternalFeatureLangParser.g:3913:1: ( Called )
            {
            // InternalFeatureLangParser.g:3913:1: ( Called )
            // InternalFeatureLangParser.g:3914:2: Called
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
    // InternalFeatureLangParser.g:3923:1: rule__CreateComposition__Group__3 : rule__CreateComposition__Group__3__Impl rule__CreateComposition__Group__4 ;
    public final void rule__CreateComposition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3927:1: ( rule__CreateComposition__Group__3__Impl rule__CreateComposition__Group__4 )
            // InternalFeatureLangParser.g:3928:2: rule__CreateComposition__Group__3__Impl rule__CreateComposition__Group__4
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
    // InternalFeatureLangParser.g:3935:1: rule__CreateComposition__Group__3__Impl : ( ( rule__CreateComposition__RelationAssignment_3 ) ) ;
    public final void rule__CreateComposition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3939:1: ( ( ( rule__CreateComposition__RelationAssignment_3 ) ) )
            // InternalFeatureLangParser.g:3940:1: ( ( rule__CreateComposition__RelationAssignment_3 ) )
            {
            // InternalFeatureLangParser.g:3940:1: ( ( rule__CreateComposition__RelationAssignment_3 ) )
            // InternalFeatureLangParser.g:3941:2: ( rule__CreateComposition__RelationAssignment_3 )
            {
             before(grammarAccess.getCreateCompositionAccess().getRelationAssignment_3()); 
            // InternalFeatureLangParser.g:3942:2: ( rule__CreateComposition__RelationAssignment_3 )
            // InternalFeatureLangParser.g:3942:3: rule__CreateComposition__RelationAssignment_3
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
    // InternalFeatureLangParser.g:3950:1: rule__CreateComposition__Group__4 : rule__CreateComposition__Group__4__Impl ;
    public final void rule__CreateComposition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3954:1: ( rule__CreateComposition__Group__4__Impl )
            // InternalFeatureLangParser.g:3955:2: rule__CreateComposition__Group__4__Impl
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
    // InternalFeatureLangParser.g:3961:1: rule__CreateComposition__Group__4__Impl : ( ( rule__CreateComposition__Group_4__0 )? ) ;
    public final void rule__CreateComposition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3965:1: ( ( ( rule__CreateComposition__Group_4__0 )? ) )
            // InternalFeatureLangParser.g:3966:1: ( ( rule__CreateComposition__Group_4__0 )? )
            {
            // InternalFeatureLangParser.g:3966:1: ( ( rule__CreateComposition__Group_4__0 )? )
            // InternalFeatureLangParser.g:3967:2: ( rule__CreateComposition__Group_4__0 )?
            {
             before(grammarAccess.getCreateCompositionAccess().getGroup_4()); 
            // InternalFeatureLangParser.g:3968:2: ( rule__CreateComposition__Group_4__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==FullStop) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==It) ) {
                    alt32=1;
                }
            }
            switch (alt32) {
                case 1 :
                    // InternalFeatureLangParser.g:3968:3: rule__CreateComposition__Group_4__0
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
    // InternalFeatureLangParser.g:3977:1: rule__CreateComposition__Group_4__0 : rule__CreateComposition__Group_4__0__Impl rule__CreateComposition__Group_4__1 ;
    public final void rule__CreateComposition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3981:1: ( rule__CreateComposition__Group_4__0__Impl rule__CreateComposition__Group_4__1 )
            // InternalFeatureLangParser.g:3982:2: rule__CreateComposition__Group_4__0__Impl rule__CreateComposition__Group_4__1
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
    // InternalFeatureLangParser.g:3989:1: rule__CreateComposition__Group_4__0__Impl : ( FullStop ) ;
    public final void rule__CreateComposition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3993:1: ( ( FullStop ) )
            // InternalFeatureLangParser.g:3994:1: ( FullStop )
            {
            // InternalFeatureLangParser.g:3994:1: ( FullStop )
            // InternalFeatureLangParser.g:3995:2: FullStop
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
    // InternalFeatureLangParser.g:4004:1: rule__CreateComposition__Group_4__1 : rule__CreateComposition__Group_4__1__Impl rule__CreateComposition__Group_4__2 ;
    public final void rule__CreateComposition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4008:1: ( rule__CreateComposition__Group_4__1__Impl rule__CreateComposition__Group_4__2 )
            // InternalFeatureLangParser.g:4009:2: rule__CreateComposition__Group_4__1__Impl rule__CreateComposition__Group_4__2
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
    // InternalFeatureLangParser.g:4016:1: rule__CreateComposition__Group_4__1__Impl : ( It ) ;
    public final void rule__CreateComposition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4020:1: ( ( It ) )
            // InternalFeatureLangParser.g:4021:1: ( It )
            {
            // InternalFeatureLangParser.g:4021:1: ( It )
            // InternalFeatureLangParser.g:4022:2: It
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
    // InternalFeatureLangParser.g:4031:1: rule__CreateComposition__Group_4__2 : rule__CreateComposition__Group_4__2__Impl rule__CreateComposition__Group_4__3 ;
    public final void rule__CreateComposition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4035:1: ( rule__CreateComposition__Group_4__2__Impl rule__CreateComposition__Group_4__3 )
            // InternalFeatureLangParser.g:4036:2: rule__CreateComposition__Group_4__2__Impl rule__CreateComposition__Group_4__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalFeatureLangParser.g:4043:1: rule__CreateComposition__Group_4__2__Impl : ( ( rule__CreateComposition__PriorityAssignment_4_2 ) ) ;
    public final void rule__CreateComposition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4047:1: ( ( ( rule__CreateComposition__PriorityAssignment_4_2 ) ) )
            // InternalFeatureLangParser.g:4048:1: ( ( rule__CreateComposition__PriorityAssignment_4_2 ) )
            {
            // InternalFeatureLangParser.g:4048:1: ( ( rule__CreateComposition__PriorityAssignment_4_2 ) )
            // InternalFeatureLangParser.g:4049:2: ( rule__CreateComposition__PriorityAssignment_4_2 )
            {
             before(grammarAccess.getCreateCompositionAccess().getPriorityAssignment_4_2()); 
            // InternalFeatureLangParser.g:4050:2: ( rule__CreateComposition__PriorityAssignment_4_2 )
            // InternalFeatureLangParser.g:4050:3: rule__CreateComposition__PriorityAssignment_4_2
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
    // InternalFeatureLangParser.g:4058:1: rule__CreateComposition__Group_4__3 : rule__CreateComposition__Group_4__3__Impl rule__CreateComposition__Group_4__4 ;
    public final void rule__CreateComposition__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4062:1: ( rule__CreateComposition__Group_4__3__Impl rule__CreateComposition__Group_4__4 )
            // InternalFeatureLangParser.g:4063:2: rule__CreateComposition__Group_4__3__Impl rule__CreateComposition__Group_4__4
            {
            pushFollow(FOLLOW_39);
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
    // InternalFeatureLangParser.g:4070:1: rule__CreateComposition__Group_4__3__Impl : ( Be ) ;
    public final void rule__CreateComposition__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4074:1: ( ( Be ) )
            // InternalFeatureLangParser.g:4075:1: ( Be )
            {
            // InternalFeatureLangParser.g:4075:1: ( Be )
            // InternalFeatureLangParser.g:4076:2: Be
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
    // InternalFeatureLangParser.g:4085:1: rule__CreateComposition__Group_4__4 : rule__CreateComposition__Group_4__4__Impl ;
    public final void rule__CreateComposition__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4089:1: ( rule__CreateComposition__Group_4__4__Impl )
            // InternalFeatureLangParser.g:4090:2: rule__CreateComposition__Group_4__4__Impl
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
    // InternalFeatureLangParser.g:4096:1: rule__CreateComposition__Group_4__4__Impl : ( ( rule__CreateComposition__PublicityAssignment_4_4 ) ) ;
    public final void rule__CreateComposition__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4100:1: ( ( ( rule__CreateComposition__PublicityAssignment_4_4 ) ) )
            // InternalFeatureLangParser.g:4101:1: ( ( rule__CreateComposition__PublicityAssignment_4_4 ) )
            {
            // InternalFeatureLangParser.g:4101:1: ( ( rule__CreateComposition__PublicityAssignment_4_4 ) )
            // InternalFeatureLangParser.g:4102:2: ( rule__CreateComposition__PublicityAssignment_4_4 )
            {
             before(grammarAccess.getCreateCompositionAccess().getPublicityAssignment_4_4()); 
            // InternalFeatureLangParser.g:4103:2: ( rule__CreateComposition__PublicityAssignment_4_4 )
            // InternalFeatureLangParser.g:4103:3: rule__CreateComposition__PublicityAssignment_4_4
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
    // InternalFeatureLangParser.g:4112:1: rule__EditComposition__Group__0 : rule__EditComposition__Group__0__Impl rule__EditComposition__Group__1 ;
    public final void rule__EditComposition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4116:1: ( rule__EditComposition__Group__0__Impl rule__EditComposition__Group__1 )
            // InternalFeatureLangParser.g:4117:2: rule__EditComposition__Group__0__Impl rule__EditComposition__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalFeatureLangParser.g:4124:1: rule__EditComposition__Group__0__Impl : ( Have ) ;
    public final void rule__EditComposition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4128:1: ( ( Have ) )
            // InternalFeatureLangParser.g:4129:1: ( Have )
            {
            // InternalFeatureLangParser.g:4129:1: ( Have )
            // InternalFeatureLangParser.g:4130:2: Have
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
    // InternalFeatureLangParser.g:4139:1: rule__EditComposition__Group__1 : rule__EditComposition__Group__1__Impl rule__EditComposition__Group__2 ;
    public final void rule__EditComposition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4143:1: ( rule__EditComposition__Group__1__Impl rule__EditComposition__Group__2 )
            // InternalFeatureLangParser.g:4144:2: rule__EditComposition__Group__1__Impl rule__EditComposition__Group__2
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
    // InternalFeatureLangParser.g:4151:1: rule__EditComposition__Group__1__Impl : ( Composition ) ;
    public final void rule__EditComposition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4155:1: ( ( Composition ) )
            // InternalFeatureLangParser.g:4156:1: ( Composition )
            {
            // InternalFeatureLangParser.g:4156:1: ( Composition )
            // InternalFeatureLangParser.g:4157:2: Composition
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
    // InternalFeatureLangParser.g:4166:1: rule__EditComposition__Group__2 : rule__EditComposition__Group__2__Impl rule__EditComposition__Group__3 ;
    public final void rule__EditComposition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4170:1: ( rule__EditComposition__Group__2__Impl rule__EditComposition__Group__3 )
            // InternalFeatureLangParser.g:4171:2: rule__EditComposition__Group__2__Impl rule__EditComposition__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalFeatureLangParser.g:4178:1: rule__EditComposition__Group__2__Impl : ( ( rule__EditComposition__CompositionNameAssignment_2 ) ) ;
    public final void rule__EditComposition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4182:1: ( ( ( rule__EditComposition__CompositionNameAssignment_2 ) ) )
            // InternalFeatureLangParser.g:4183:1: ( ( rule__EditComposition__CompositionNameAssignment_2 ) )
            {
            // InternalFeatureLangParser.g:4183:1: ( ( rule__EditComposition__CompositionNameAssignment_2 ) )
            // InternalFeatureLangParser.g:4184:2: ( rule__EditComposition__CompositionNameAssignment_2 )
            {
             before(grammarAccess.getEditCompositionAccess().getCompositionNameAssignment_2()); 
            // InternalFeatureLangParser.g:4185:2: ( rule__EditComposition__CompositionNameAssignment_2 )
            // InternalFeatureLangParser.g:4185:3: rule__EditComposition__CompositionNameAssignment_2
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
    // InternalFeatureLangParser.g:4193:1: rule__EditComposition__Group__3 : rule__EditComposition__Group__3__Impl rule__EditComposition__Group__4 ;
    public final void rule__EditComposition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4197:1: ( rule__EditComposition__Group__3__Impl rule__EditComposition__Group__4 )
            // InternalFeatureLangParser.g:4198:2: rule__EditComposition__Group__3__Impl rule__EditComposition__Group__4
            {
            pushFollow(FOLLOW_41);
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
    // InternalFeatureLangParser.g:4205:1: rule__EditComposition__Group__3__Impl : ( With ) ;
    public final void rule__EditComposition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4209:1: ( ( With ) )
            // InternalFeatureLangParser.g:4210:1: ( With )
            {
            // InternalFeatureLangParser.g:4210:1: ( With )
            // InternalFeatureLangParser.g:4211:2: With
            {
             before(grammarAccess.getEditCompositionAccess().getWithKeyword_3()); 
            match(input,With,FOLLOW_2); 
             after(grammarAccess.getEditCompositionAccess().getWithKeyword_3()); 

            }


            }

        }
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
    // InternalFeatureLangParser.g:4220:1: rule__EditComposition__Group__4 : rule__EditComposition__Group__4__Impl rule__EditComposition__Group__5 ;
    public final void rule__EditComposition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4224:1: ( rule__EditComposition__Group__4__Impl rule__EditComposition__Group__5 )
            // InternalFeatureLangParser.g:4225:2: rule__EditComposition__Group__4__Impl rule__EditComposition__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalFeatureLangParser.g:4232:1: rule__EditComposition__Group__4__Impl : ( ( rule__EditComposition__ParameterAssignment_4 ) ) ;
    public final void rule__EditComposition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4236:1: ( ( ( rule__EditComposition__ParameterAssignment_4 ) ) )
            // InternalFeatureLangParser.g:4237:1: ( ( rule__EditComposition__ParameterAssignment_4 ) )
            {
            // InternalFeatureLangParser.g:4237:1: ( ( rule__EditComposition__ParameterAssignment_4 ) )
            // InternalFeatureLangParser.g:4238:2: ( rule__EditComposition__ParameterAssignment_4 )
            {
             before(grammarAccess.getEditCompositionAccess().getParameterAssignment_4()); 
            // InternalFeatureLangParser.g:4239:2: ( rule__EditComposition__ParameterAssignment_4 )
            // InternalFeatureLangParser.g:4239:3: rule__EditComposition__ParameterAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__EditComposition__ParameterAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEditCompositionAccess().getParameterAssignment_4()); 

            }


            }

        }
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
    // InternalFeatureLangParser.g:4247:1: rule__EditComposition__Group__5 : rule__EditComposition__Group__5__Impl ;
    public final void rule__EditComposition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4251:1: ( rule__EditComposition__Group__5__Impl )
            // InternalFeatureLangParser.g:4252:2: rule__EditComposition__Group__5__Impl
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
    // InternalFeatureLangParser.g:4258:1: rule__EditComposition__Group__5__Impl : ( ( rule__EditComposition__NameAssignment_5 ) ) ;
    public final void rule__EditComposition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4262:1: ( ( ( rule__EditComposition__NameAssignment_5 ) ) )
            // InternalFeatureLangParser.g:4263:1: ( ( rule__EditComposition__NameAssignment_5 ) )
            {
            // InternalFeatureLangParser.g:4263:1: ( ( rule__EditComposition__NameAssignment_5 ) )
            // InternalFeatureLangParser.g:4264:2: ( rule__EditComposition__NameAssignment_5 )
            {
             before(grammarAccess.getEditCompositionAccess().getNameAssignment_5()); 
            // InternalFeatureLangParser.g:4265:2: ( rule__EditComposition__NameAssignment_5 )
            // InternalFeatureLangParser.g:4265:3: rule__EditComposition__NameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__EditComposition__NameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEditCompositionAccess().getNameAssignment_5()); 

            }


            }

        }
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
    // InternalFeatureLangParser.g:4274:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4278:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalFeatureLangParser.g:4279:2: rule__Class__Group__0__Impl rule__Class__Group__1
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
    // InternalFeatureLangParser.g:4286:1: rule__Class__Group__0__Impl : ( ( rule__Class__Alternatives_0 )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4290:1: ( ( ( rule__Class__Alternatives_0 )? ) )
            // InternalFeatureLangParser.g:4291:1: ( ( rule__Class__Alternatives_0 )? )
            {
            // InternalFeatureLangParser.g:4291:1: ( ( rule__Class__Alternatives_0 )? )
            // InternalFeatureLangParser.g:4292:2: ( rule__Class__Alternatives_0 )?
            {
             before(grammarAccess.getClassAccess().getAlternatives_0()); 
            // InternalFeatureLangParser.g:4293:2: ( rule__Class__Alternatives_0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==The||LA33_0==A) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalFeatureLangParser.g:4293:3: rule__Class__Alternatives_0
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
    // InternalFeatureLangParser.g:4301:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4305:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalFeatureLangParser.g:4306:2: rule__Class__Group__1__Impl rule__Class__Group__2
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
    // InternalFeatureLangParser.g:4313:1: rule__Class__Group__1__Impl : ( ( rule__Class__AbstractAssignment_1 )? ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4317:1: ( ( ( rule__Class__AbstractAssignment_1 )? ) )
            // InternalFeatureLangParser.g:4318:1: ( ( rule__Class__AbstractAssignment_1 )? )
            {
            // InternalFeatureLangParser.g:4318:1: ( ( rule__Class__AbstractAssignment_1 )? )
            // InternalFeatureLangParser.g:4319:2: ( rule__Class__AbstractAssignment_1 )?
            {
             before(grammarAccess.getClassAccess().getAbstractAssignment_1()); 
            // InternalFeatureLangParser.g:4320:2: ( rule__Class__AbstractAssignment_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==Abstract) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalFeatureLangParser.g:4320:3: rule__Class__AbstractAssignment_1
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
    // InternalFeatureLangParser.g:4328:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4332:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalFeatureLangParser.g:4333:2: rule__Class__Group__2__Impl rule__Class__Group__3
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
    // InternalFeatureLangParser.g:4340:1: rule__Class__Group__2__Impl : ( ( Class )? ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4344:1: ( ( ( Class )? ) )
            // InternalFeatureLangParser.g:4345:1: ( ( Class )? )
            {
            // InternalFeatureLangParser.g:4345:1: ( ( Class )? )
            // InternalFeatureLangParser.g:4346:2: ( Class )?
            {
             before(grammarAccess.getClassAccess().getClassKeyword_2()); 
            // InternalFeatureLangParser.g:4347:2: ( Class )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==Class) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalFeatureLangParser.g:4347:3: Class
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
    // InternalFeatureLangParser.g:4355:1: rule__Class__Group__3 : rule__Class__Group__3__Impl ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4359:1: ( rule__Class__Group__3__Impl )
            // InternalFeatureLangParser.g:4360:2: rule__Class__Group__3__Impl
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
    // InternalFeatureLangParser.g:4366:1: rule__Class__Group__3__Impl : ( ( rule__Class__NameAssignment_3 ) ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4370:1: ( ( ( rule__Class__NameAssignment_3 ) ) )
            // InternalFeatureLangParser.g:4371:1: ( ( rule__Class__NameAssignment_3 ) )
            {
            // InternalFeatureLangParser.g:4371:1: ( ( rule__Class__NameAssignment_3 ) )
            // InternalFeatureLangParser.g:4372:2: ( rule__Class__NameAssignment_3 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_3()); 
            // InternalFeatureLangParser.g:4373:2: ( rule__Class__NameAssignment_3 )
            // InternalFeatureLangParser.g:4373:3: rule__Class__NameAssignment_3
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
    // InternalFeatureLangParser.g:4382:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4386:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalFeatureLangParser.g:4387:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalFeatureLangParser.g:4394:1: rule__Attribute__Group__0__Impl : ( ( Attribute )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4398:1: ( ( ( Attribute )? ) )
            // InternalFeatureLangParser.g:4399:1: ( ( Attribute )? )
            {
            // InternalFeatureLangParser.g:4399:1: ( ( Attribute )? )
            // InternalFeatureLangParser.g:4400:2: ( Attribute )?
            {
             before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
            // InternalFeatureLangParser.g:4401:2: ( Attribute )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Attribute) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalFeatureLangParser.g:4401:3: Attribute
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
    // InternalFeatureLangParser.g:4409:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4413:1: ( rule__Attribute__Group__1__Impl )
            // InternalFeatureLangParser.g:4414:2: rule__Attribute__Group__1__Impl
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
    // InternalFeatureLangParser.g:4420:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4424:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalFeatureLangParser.g:4425:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalFeatureLangParser.g:4425:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalFeatureLangParser.g:4426:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalFeatureLangParser.g:4427:2: ( rule__Attribute__NameAssignment_1 )
            // InternalFeatureLangParser.g:4427:3: rule__Attribute__NameAssignment_1
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
    // InternalFeatureLangParser.g:4436:1: rule__Identifier__Group__0 : rule__Identifier__Group__0__Impl rule__Identifier__Group__1 ;
    public final void rule__Identifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4440:1: ( rule__Identifier__Group__0__Impl rule__Identifier__Group__1 )
            // InternalFeatureLangParser.g:4441:2: rule__Identifier__Group__0__Impl rule__Identifier__Group__1
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
    // InternalFeatureLangParser.g:4448:1: rule__Identifier__Group__0__Impl : ( ( rule__Identifier__ValueAssignment_0 ) ) ;
    public final void rule__Identifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4452:1: ( ( ( rule__Identifier__ValueAssignment_0 ) ) )
            // InternalFeatureLangParser.g:4453:1: ( ( rule__Identifier__ValueAssignment_0 ) )
            {
            // InternalFeatureLangParser.g:4453:1: ( ( rule__Identifier__ValueAssignment_0 ) )
            // InternalFeatureLangParser.g:4454:2: ( rule__Identifier__ValueAssignment_0 )
            {
             before(grammarAccess.getIdentifierAccess().getValueAssignment_0()); 
            // InternalFeatureLangParser.g:4455:2: ( rule__Identifier__ValueAssignment_0 )
            // InternalFeatureLangParser.g:4455:3: rule__Identifier__ValueAssignment_0
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
    // InternalFeatureLangParser.g:4463:1: rule__Identifier__Group__1 : rule__Identifier__Group__1__Impl ;
    public final void rule__Identifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4467:1: ( rule__Identifier__Group__1__Impl )
            // InternalFeatureLangParser.g:4468:2: rule__Identifier__Group__1__Impl
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
    // InternalFeatureLangParser.g:4474:1: rule__Identifier__Group__1__Impl : ( ( rule__Identifier__NameAssignment_1 ) ) ;
    public final void rule__Identifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4478:1: ( ( ( rule__Identifier__NameAssignment_1 ) ) )
            // InternalFeatureLangParser.g:4479:1: ( ( rule__Identifier__NameAssignment_1 ) )
            {
            // InternalFeatureLangParser.g:4479:1: ( ( rule__Identifier__NameAssignment_1 ) )
            // InternalFeatureLangParser.g:4480:2: ( rule__Identifier__NameAssignment_1 )
            {
             before(grammarAccess.getIdentifierAccess().getNameAssignment_1()); 
            // InternalFeatureLangParser.g:4481:2: ( rule__Identifier__NameAssignment_1 )
            // InternalFeatureLangParser.g:4481:3: rule__Identifier__NameAssignment_1
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
    // InternalFeatureLangParser.g:4490:1: rule__FeatureRequest__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__FeatureRequest__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4494:1: ( ( ruleStatement ) )
            // InternalFeatureLangParser.g:4495:2: ( ruleStatement )
            {
            // InternalFeatureLangParser.g:4495:2: ( ruleStatement )
            // InternalFeatureLangParser.g:4496:3: ruleStatement
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
    // InternalFeatureLangParser.g:4505:1: rule__ChangeStatement__TargetAssignment_0 : ( ruleClass ) ;
    public final void rule__ChangeStatement__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4509:1: ( ( ruleClass ) )
            // InternalFeatureLangParser.g:4510:2: ( ruleClass )
            {
            // InternalFeatureLangParser.g:4510:2: ( ruleClass )
            // InternalFeatureLangParser.g:4511:3: ruleClass
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
    // InternalFeatureLangParser.g:4520:1: rule__ChangeStatement__PriorityAssignment_1_0_0 : ( rulePriority ) ;
    public final void rule__ChangeStatement__PriorityAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4524:1: ( ( rulePriority ) )
            // InternalFeatureLangParser.g:4525:2: ( rulePriority )
            {
            // InternalFeatureLangParser.g:4525:2: ( rulePriority )
            // InternalFeatureLangParser.g:4526:3: rulePriority
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
    // InternalFeatureLangParser.g:4535:1: rule__ChangeStatement__NegationAssignment_1_0_1 : ( ( Not ) ) ;
    public final void rule__ChangeStatement__NegationAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4539:1: ( ( ( Not ) ) )
            // InternalFeatureLangParser.g:4540:2: ( ( Not ) )
            {
            // InternalFeatureLangParser.g:4540:2: ( ( Not ) )
            // InternalFeatureLangParser.g:4541:3: ( Not )
            {
             before(grammarAccess.getChangeStatementAccess().getNegationNotKeyword_1_0_1_0()); 
            // InternalFeatureLangParser.g:4542:3: ( Not )
            // InternalFeatureLangParser.g:4543:4: Not
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
    // InternalFeatureLangParser.g:4554:1: rule__ChangeStatement__ActionAssignment_1_0_2_0 : ( ruleAction ) ;
    public final void rule__ChangeStatement__ActionAssignment_1_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4558:1: ( ( ruleAction ) )
            // InternalFeatureLangParser.g:4559:2: ( ruleAction )
            {
            // InternalFeatureLangParser.g:4559:2: ( ruleAction )
            // InternalFeatureLangParser.g:4560:3: ruleAction
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
    // InternalFeatureLangParser.g:4569:1: rule__ChangeStatement__IdentifierAssignment_1_0_2_1_2 : ( ruleIdentifier ) ;
    public final void rule__ChangeStatement__IdentifierAssignment_1_0_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4573:1: ( ( ruleIdentifier ) )
            // InternalFeatureLangParser.g:4574:2: ( ruleIdentifier )
            {
            // InternalFeatureLangParser.g:4574:2: ( ruleIdentifier )
            // InternalFeatureLangParser.g:4575:3: ruleIdentifier
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
    // InternalFeatureLangParser.g:4584:1: rule__ChangeStatement__UpdateAssignment_1_1 : ( ruleUpdateAction ) ;
    public final void rule__ChangeStatement__UpdateAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4588:1: ( ( ruleUpdateAction ) )
            // InternalFeatureLangParser.g:4589:2: ( ruleUpdateAction )
            {
            // InternalFeatureLangParser.g:4589:2: ( ruleUpdateAction )
            // InternalFeatureLangParser.g:4590:3: ruleUpdateAction
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
    // InternalFeatureLangParser.g:4599:1: rule__CreationStatement__ClassElementAssignment_0 : ( ruleClass ) ;
    public final void rule__CreationStatement__ClassElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4603:1: ( ( ruleClass ) )
            // InternalFeatureLangParser.g:4604:2: ( ruleClass )
            {
            // InternalFeatureLangParser.g:4604:2: ( ruleClass )
            // InternalFeatureLangParser.g:4605:3: ruleClass
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
    // InternalFeatureLangParser.g:4614:1: rule__CreationStatement__PriorityAssignment_1 : ( rulePriority ) ;
    public final void rule__CreationStatement__PriorityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4618:1: ( ( rulePriority ) )
            // InternalFeatureLangParser.g:4619:2: ( rulePriority )
            {
            // InternalFeatureLangParser.g:4619:2: ( rulePriority )
            // InternalFeatureLangParser.g:4620:3: rulePriority
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
    // InternalFeatureLangParser.g:4629:1: rule__CreationStatement__NegationAssignment_2 : ( ( Not ) ) ;
    public final void rule__CreationStatement__NegationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4633:1: ( ( ( Not ) ) )
            // InternalFeatureLangParser.g:4634:2: ( ( Not ) )
            {
            // InternalFeatureLangParser.g:4634:2: ( ( Not ) )
            // InternalFeatureLangParser.g:4635:3: ( Not )
            {
             before(grammarAccess.getCreationStatementAccess().getNegationNotKeyword_2_0()); 
            // InternalFeatureLangParser.g:4636:3: ( Not )
            // InternalFeatureLangParser.g:4637:4: Not
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
    // InternalFeatureLangParser.g:4648:1: rule__Action__TypeAssignment : ( ( rule__Action__TypeAlternatives_0 ) ) ;
    public final void rule__Action__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4652:1: ( ( ( rule__Action__TypeAlternatives_0 ) ) )
            // InternalFeatureLangParser.g:4653:2: ( ( rule__Action__TypeAlternatives_0 ) )
            {
            // InternalFeatureLangParser.g:4653:2: ( ( rule__Action__TypeAlternatives_0 ) )
            // InternalFeatureLangParser.g:4654:3: ( rule__Action__TypeAlternatives_0 )
            {
             before(grammarAccess.getActionAccess().getTypeAlternatives_0()); 
            // InternalFeatureLangParser.g:4655:3: ( rule__Action__TypeAlternatives_0 )
            // InternalFeatureLangParser.g:4655:4: rule__Action__TypeAlternatives_0
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
    // InternalFeatureLangParser.g:4663:1: rule__UpdateAction__AttributeAssignment_3 : ( ruleAttribute ) ;
    public final void rule__UpdateAction__AttributeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4667:1: ( ( ruleAttribute ) )
            // InternalFeatureLangParser.g:4668:2: ( ruleAttribute )
            {
            // InternalFeatureLangParser.g:4668:2: ( ruleAttribute )
            // InternalFeatureLangParser.g:4669:3: ruleAttribute
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
    // InternalFeatureLangParser.g:4678:1: rule__UpdateAction__PriorityAssignment_6 : ( rulePriority ) ;
    public final void rule__UpdateAction__PriorityAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4682:1: ( ( rulePriority ) )
            // InternalFeatureLangParser.g:4683:2: ( rulePriority )
            {
            // InternalFeatureLangParser.g:4683:2: ( rulePriority )
            // InternalFeatureLangParser.g:4684:3: rulePriority
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
    // InternalFeatureLangParser.g:4693:1: rule__UpdateAction__DatatypeAssignment_7_0 : ( ruleUpdateAttributeDatatype ) ;
    public final void rule__UpdateAction__DatatypeAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4697:1: ( ( ruleUpdateAttributeDatatype ) )
            // InternalFeatureLangParser.g:4698:2: ( ruleUpdateAttributeDatatype )
            {
            // InternalFeatureLangParser.g:4698:2: ( ruleUpdateAttributeDatatype )
            // InternalFeatureLangParser.g:4699:3: ruleUpdateAttributeDatatype
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
    // InternalFeatureLangParser.g:4708:1: rule__UpdateAction__IdentifierAssignment_7_1 : ( ruleUpdateAttributeIdentifier ) ;
    public final void rule__UpdateAction__IdentifierAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4712:1: ( ( ruleUpdateAttributeIdentifier ) )
            // InternalFeatureLangParser.g:4713:2: ( ruleUpdateAttributeIdentifier )
            {
            // InternalFeatureLangParser.g:4713:2: ( ruleUpdateAttributeIdentifier )
            // InternalFeatureLangParser.g:4714:3: ruleUpdateAttributeIdentifier
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
    // InternalFeatureLangParser.g:4723:1: rule__UpdateAction__ValueAssignment_7_2 : ( ruleUpdateAttributeValue ) ;
    public final void rule__UpdateAction__ValueAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4727:1: ( ( ruleUpdateAttributeValue ) )
            // InternalFeatureLangParser.g:4728:2: ( ruleUpdateAttributeValue )
            {
            // InternalFeatureLangParser.g:4728:2: ( ruleUpdateAttributeValue )
            // InternalFeatureLangParser.g:4729:3: ruleUpdateAttributeValue
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
    // InternalFeatureLangParser.g:4738:1: rule__UpdateAttributeDatatype__TypeAssignment_2 : ( ruleDatatype ) ;
    public final void rule__UpdateAttributeDatatype__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4742:1: ( ( ruleDatatype ) )
            // InternalFeatureLangParser.g:4743:2: ( ruleDatatype )
            {
            // InternalFeatureLangParser.g:4743:2: ( ruleDatatype )
            // InternalFeatureLangParser.g:4744:3: ruleDatatype
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
    // InternalFeatureLangParser.g:4753:1: rule__UpdateAttributeIdentifier__IdentifierAssignment_2 : ( ruleIdentifier ) ;
    public final void rule__UpdateAttributeIdentifier__IdentifierAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4757:1: ( ( ruleIdentifier ) )
            // InternalFeatureLangParser.g:4758:2: ( ruleIdentifier )
            {
            // InternalFeatureLangParser.g:4758:2: ( ruleIdentifier )
            // InternalFeatureLangParser.g:4759:3: ruleIdentifier
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
    // InternalFeatureLangParser.g:4768:1: rule__UpdateAttributeValue__ValueAssignment_3 : ( RULE_ID ) ;
    public final void rule__UpdateAttributeValue__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4772:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:4773:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:4773:2: ( RULE_ID )
            // InternalFeatureLangParser.g:4774:3: RULE_ID
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
    // InternalFeatureLangParser.g:4783:1: rule__AttributeAction__AttributeAssignment_2 : ( ruleAttribute ) ;
    public final void rule__AttributeAction__AttributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4787:1: ( ( ruleAttribute ) )
            // InternalFeatureLangParser.g:4788:2: ( ruleAttribute )
            {
            // InternalFeatureLangParser.g:4788:2: ( ruleAttribute )
            // InternalFeatureLangParser.g:4789:3: ruleAttribute
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
    // InternalFeatureLangParser.g:4798:1: rule__AttributeAction__TypeAssignment_3_4 : ( ruleDatatype ) ;
    public final void rule__AttributeAction__TypeAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4802:1: ( ( ruleDatatype ) )
            // InternalFeatureLangParser.g:4803:2: ( ruleDatatype )
            {
            // InternalFeatureLangParser.g:4803:2: ( ruleDatatype )
            // InternalFeatureLangParser.g:4804:3: ruleDatatype
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
    // InternalFeatureLangParser.g:4813:1: rule__AssociationAction__CreateAssignment_2_0 : ( ruleCreateAssociation ) ;
    public final void rule__AssociationAction__CreateAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4817:1: ( ( ruleCreateAssociation ) )
            // InternalFeatureLangParser.g:4818:2: ( ruleCreateAssociation )
            {
            // InternalFeatureLangParser.g:4818:2: ( ruleCreateAssociation )
            // InternalFeatureLangParser.g:4819:3: ruleCreateAssociation
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
    // InternalFeatureLangParser.g:4828:1: rule__AssociationAction__NameAssignment_2_1_0 : ( RULE_ID ) ;
    public final void rule__AssociationAction__NameAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4832:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:4833:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:4833:2: ( RULE_ID )
            // InternalFeatureLangParser.g:4834:3: RULE_ID
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
    // InternalFeatureLangParser.g:4843:1: rule__AssociationAction__EditAssignment_2_1_1 : ( ruleEditAssociation ) ;
    public final void rule__AssociationAction__EditAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4847:1: ( ( ruleEditAssociation ) )
            // InternalFeatureLangParser.g:4848:2: ( ruleEditAssociation )
            {
            // InternalFeatureLangParser.g:4848:2: ( ruleEditAssociation )
            // InternalFeatureLangParser.g:4849:3: ruleEditAssociation
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
    // InternalFeatureLangParser.g:4858:1: rule__CreateAssociation__TargetAssignment_2 : ( ruleClass ) ;
    public final void rule__CreateAssociation__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4862:1: ( ( ruleClass ) )
            // InternalFeatureLangParser.g:4863:2: ( ruleClass )
            {
            // InternalFeatureLangParser.g:4863:2: ( ruleClass )
            // InternalFeatureLangParser.g:4864:3: ruleClass
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
    // InternalFeatureLangParser.g:4873:1: rule__CreateAssociation__RelationAssignment_4 : ( RULE_ID ) ;
    public final void rule__CreateAssociation__RelationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4877:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:4878:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:4878:2: ( RULE_ID )
            // InternalFeatureLangParser.g:4879:3: RULE_ID
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
    // InternalFeatureLangParser.g:4888:1: rule__EditAssociation__TypeAssignment : ( ( rule__EditAssociation__TypeAlternatives_0 ) ) ;
    public final void rule__EditAssociation__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4892:1: ( ( ( rule__EditAssociation__TypeAlternatives_0 ) ) )
            // InternalFeatureLangParser.g:4893:2: ( ( rule__EditAssociation__TypeAlternatives_0 ) )
            {
            // InternalFeatureLangParser.g:4893:2: ( ( rule__EditAssociation__TypeAlternatives_0 ) )
            // InternalFeatureLangParser.g:4894:3: ( rule__EditAssociation__TypeAlternatives_0 )
            {
             before(grammarAccess.getEditAssociationAccess().getTypeAlternatives_0()); 
            // InternalFeatureLangParser.g:4895:3: ( rule__EditAssociation__TypeAlternatives_0 )
            // InternalFeatureLangParser.g:4895:4: rule__EditAssociation__TypeAlternatives_0
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
    // InternalFeatureLangParser.g:4903:1: rule__SetCompatible__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__SetCompatible__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4907:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:4908:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:4908:2: ( RULE_ID )
            // InternalFeatureLangParser.g:4909:3: RULE_ID
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
    // InternalFeatureLangParser.g:4918:1: rule__SetVersionRange__StartAssignment_4 : ( RULE_ID ) ;
    public final void rule__SetVersionRange__StartAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4922:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:4923:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:4923:2: ( RULE_ID )
            // InternalFeatureLangParser.g:4924:3: RULE_ID
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
    // InternalFeatureLangParser.g:4933:1: rule__SetVersionRange__EndAssignment_6 : ( RULE_ID ) ;
    public final void rule__SetVersionRange__EndAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4937:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:4938:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:4938:2: ( RULE_ID )
            // InternalFeatureLangParser.g:4939:3: RULE_ID
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
    // InternalFeatureLangParser.g:4948:1: rule__SetVariant__NameAssignment_5 : ( RULE_ID ) ;
    public final void rule__SetVariant__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4952:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:4953:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:4953:2: ( RULE_ID )
            // InternalFeatureLangParser.g:4954:3: RULE_ID
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
    // InternalFeatureLangParser.g:4963:1: rule__SetRightOpen__DateAssignment_3 : ( RULE_ID ) ;
    public final void rule__SetRightOpen__DateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4967:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:4968:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:4968:2: ( RULE_ID )
            // InternalFeatureLangParser.g:4969:3: RULE_ID
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
    // InternalFeatureLangParser.g:4978:1: rule__SetLeftOpen__DateAssignment_3 : ( RULE_ID ) ;
    public final void rule__SetLeftOpen__DateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4982:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:4983:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:4983:2: ( RULE_ID )
            // InternalFeatureLangParser.g:4984:3: RULE_ID
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


    // $ANTLR start "rule__InheritanceAction__CreateAssignment_0"
    // InternalFeatureLangParser.g:4993:1: rule__InheritanceAction__CreateAssignment_0 : ( ruleCreateInheritance ) ;
    public final void rule__InheritanceAction__CreateAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:4997:1: ( ( ruleCreateInheritance ) )
            // InternalFeatureLangParser.g:4998:2: ( ruleCreateInheritance )
            {
            // InternalFeatureLangParser.g:4998:2: ( ruleCreateInheritance )
            // InternalFeatureLangParser.g:4999:3: ruleCreateInheritance
            {
             before(grammarAccess.getInheritanceActionAccess().getCreateCreateInheritanceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCreateInheritance();

            state._fsp--;

             after(grammarAccess.getInheritanceActionAccess().getCreateCreateInheritanceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InheritanceAction__CreateAssignment_0"


    // $ANTLR start "rule__InheritanceAction__EditAssignment_1"
    // InternalFeatureLangParser.g:5008:1: rule__InheritanceAction__EditAssignment_1 : ( ruleEditInheritance ) ;
    public final void rule__InheritanceAction__EditAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5012:1: ( ( ruleEditInheritance ) )
            // InternalFeatureLangParser.g:5013:2: ( ruleEditInheritance )
            {
            // InternalFeatureLangParser.g:5013:2: ( ruleEditInheritance )
            // InternalFeatureLangParser.g:5014:3: ruleEditInheritance
            {
             before(grammarAccess.getInheritanceActionAccess().getEditEditInheritanceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEditInheritance();

            state._fsp--;

             after(grammarAccess.getInheritanceActionAccess().getEditEditInheritanceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InheritanceAction__EditAssignment_1"


    // $ANTLR start "rule__CreateInheritance__ParentAssignment_2"
    // InternalFeatureLangParser.g:5023:1: rule__CreateInheritance__ParentAssignment_2 : ( ruleClass ) ;
    public final void rule__CreateInheritance__ParentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5027:1: ( ( ruleClass ) )
            // InternalFeatureLangParser.g:5028:2: ( ruleClass )
            {
            // InternalFeatureLangParser.g:5028:2: ( ruleClass )
            // InternalFeatureLangParser.g:5029:3: ruleClass
            {
             before(grammarAccess.getCreateInheritanceAccess().getParentClassParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getCreateInheritanceAccess().getParentClassParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateInheritance__ParentAssignment_2"


    // $ANTLR start "rule__EditInheritance__UriAssignment_3"
    // InternalFeatureLangParser.g:5038:1: rule__EditInheritance__UriAssignment_3 : ( RULE_ID ) ;
    public final void rule__EditInheritance__UriAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5042:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:5043:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:5043:2: ( RULE_ID )
            // InternalFeatureLangParser.g:5044:3: RULE_ID
            {
             before(grammarAccess.getEditInheritanceAccess().getUriIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEditInheritanceAccess().getUriIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditInheritance__UriAssignment_3"


    // $ANTLR start "rule__CompositionAction__CreateAssignment_0"
    // InternalFeatureLangParser.g:5053:1: rule__CompositionAction__CreateAssignment_0 : ( ruleCreateComposition ) ;
    public final void rule__CompositionAction__CreateAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5057:1: ( ( ruleCreateComposition ) )
            // InternalFeatureLangParser.g:5058:2: ( ruleCreateComposition )
            {
            // InternalFeatureLangParser.g:5058:2: ( ruleCreateComposition )
            // InternalFeatureLangParser.g:5059:3: ruleCreateComposition
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
    // InternalFeatureLangParser.g:5068:1: rule__CompositionAction__EditAssignment_1 : ( ruleEditComposition ) ;
    public final void rule__CompositionAction__EditAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5072:1: ( ( ruleEditComposition ) )
            // InternalFeatureLangParser.g:5073:2: ( ruleEditComposition )
            {
            // InternalFeatureLangParser.g:5073:2: ( ruleEditComposition )
            // InternalFeatureLangParser.g:5074:3: ruleEditComposition
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
    // InternalFeatureLangParser.g:5083:1: rule__CreateComposition__TargetAssignment_1 : ( ruleClass ) ;
    public final void rule__CreateComposition__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5087:1: ( ( ruleClass ) )
            // InternalFeatureLangParser.g:5088:2: ( ruleClass )
            {
            // InternalFeatureLangParser.g:5088:2: ( ruleClass )
            // InternalFeatureLangParser.g:5089:3: ruleClass
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
    // InternalFeatureLangParser.g:5098:1: rule__CreateComposition__RelationAssignment_3 : ( RULE_ID ) ;
    public final void rule__CreateComposition__RelationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5102:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:5103:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:5103:2: ( RULE_ID )
            // InternalFeatureLangParser.g:5104:3: RULE_ID
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
    // InternalFeatureLangParser.g:5113:1: rule__CreateComposition__PriorityAssignment_4_2 : ( rulePriority ) ;
    public final void rule__CreateComposition__PriorityAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5117:1: ( ( rulePriority ) )
            // InternalFeatureLangParser.g:5118:2: ( rulePriority )
            {
            // InternalFeatureLangParser.g:5118:2: ( rulePriority )
            // InternalFeatureLangParser.g:5119:3: rulePriority
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
    // InternalFeatureLangParser.g:5128:1: rule__CreateComposition__PublicityAssignment_4_4 : ( rulePublicity ) ;
    public final void rule__CreateComposition__PublicityAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5132:1: ( ( rulePublicity ) )
            // InternalFeatureLangParser.g:5133:2: ( rulePublicity )
            {
            // InternalFeatureLangParser.g:5133:2: ( rulePublicity )
            // InternalFeatureLangParser.g:5134:3: rulePublicity
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
    // InternalFeatureLangParser.g:5143:1: rule__EditComposition__CompositionNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EditComposition__CompositionNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5147:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:5148:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:5148:2: ( RULE_ID )
            // InternalFeatureLangParser.g:5149:3: RULE_ID
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


    // $ANTLR start "rule__EditComposition__ParameterAssignment_4"
    // InternalFeatureLangParser.g:5158:1: rule__EditComposition__ParameterAssignment_4 : ( ruleCompositionParameter ) ;
    public final void rule__EditComposition__ParameterAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5162:1: ( ( ruleCompositionParameter ) )
            // InternalFeatureLangParser.g:5163:2: ( ruleCompositionParameter )
            {
            // InternalFeatureLangParser.g:5163:2: ( ruleCompositionParameter )
            // InternalFeatureLangParser.g:5164:3: ruleCompositionParameter
            {
             before(grammarAccess.getEditCompositionAccess().getParameterCompositionParameterEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCompositionParameter();

            state._fsp--;

             after(grammarAccess.getEditCompositionAccess().getParameterCompositionParameterEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditComposition__ParameterAssignment_4"


    // $ANTLR start "rule__EditComposition__NameAssignment_5"
    // InternalFeatureLangParser.g:5173:1: rule__EditComposition__NameAssignment_5 : ( RULE_ID ) ;
    public final void rule__EditComposition__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5177:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:5178:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:5178:2: ( RULE_ID )
            // InternalFeatureLangParser.g:5179:3: RULE_ID
            {
             before(grammarAccess.getEditCompositionAccess().getNameIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEditCompositionAccess().getNameIDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditComposition__NameAssignment_5"


    // $ANTLR start "rule__Class__AbstractAssignment_1"
    // InternalFeatureLangParser.g:5188:1: rule__Class__AbstractAssignment_1 : ( ruleAbstraction ) ;
    public final void rule__Class__AbstractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5192:1: ( ( ruleAbstraction ) )
            // InternalFeatureLangParser.g:5193:2: ( ruleAbstraction )
            {
            // InternalFeatureLangParser.g:5193:2: ( ruleAbstraction )
            // InternalFeatureLangParser.g:5194:3: ruleAbstraction
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
    // InternalFeatureLangParser.g:5203:1: rule__Class__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5207:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:5208:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:5208:2: ( RULE_ID )
            // InternalFeatureLangParser.g:5209:3: RULE_ID
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
    // InternalFeatureLangParser.g:5218:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5222:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:5223:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:5223:2: ( RULE_ID )
            // InternalFeatureLangParser.g:5224:3: RULE_ID
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
    // InternalFeatureLangParser.g:5233:1: rule__Identifier__ValueAssignment_0 : ( ruleIdentifierValue ) ;
    public final void rule__Identifier__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5237:1: ( ( ruleIdentifierValue ) )
            // InternalFeatureLangParser.g:5238:2: ( ruleIdentifierValue )
            {
            // InternalFeatureLangParser.g:5238:2: ( ruleIdentifierValue )
            // InternalFeatureLangParser.g:5239:3: ruleIdentifierValue
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
    // InternalFeatureLangParser.g:5248:1: rule__Identifier__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Identifier__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5252:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:5253:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:5253:2: ( RULE_ID )
            // InternalFeatureLangParser.g:5254:3: RULE_ID
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
    // InternalFeatureLangParser.g:5263:1: rule__Priority__PriorityAssignment : ( rulePriorityValue ) ;
    public final void rule__Priority__PriorityAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:5267:1: ( ( rulePriorityValue ) )
            // InternalFeatureLangParser.g:5268:2: ( rulePriorityValue )
            {
            // InternalFeatureLangParser.g:5268:2: ( rulePriorityValue )
            // InternalFeatureLangParser.g:5269:3: rulePriorityValue
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
            return "1106:1: rule__Statement__Alternatives_0 : ( ( ruleChangeStatement ) | ( ruleCreationStatement ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0018040002000402L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000010200800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000002010000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0008084400000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000200800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000120004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0008080000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0010000000000A00L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000100100000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001000300000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0008000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00080C0000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0011000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0002002000001100L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x001804000A000400L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0018040002000400L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000004801000000L});

}