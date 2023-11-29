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
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("FullStop", "'.'");
    		tokenNameToValue.put("A", "'a'");
    		tokenNameToValue.put("An", "'an'");
    		tokenNameToValue.put("Be", "'be'");
    		tokenNameToValue.put("Is", "'is'");
    		tokenNameToValue.put("It", "'it'");
    		tokenNameToValue.put("To", "'to'");
    		tokenNameToValue.put("URI", "'URI'");
    		tokenNameToValue.put("Has", "'has'");
    		tokenNameToValue.put("Not", "'not'");
    		tokenNameToValue.put("The", "'the'");
    		tokenNameToValue.put("From", "'from'");
    		tokenNameToValue.put("Have", "'have'");
    		tokenNameToValue.put("Must", "'must'");
    		tokenNameToValue.put("Name", "'name'");
    		tokenNameToValue.put("Time", "'time'");
    		tokenNameToValue.put("Class", "'class'");
    		tokenNameToValue.put("Exist", "'exist'");
    		tokenNameToValue.put("Other", "'other'");
    		tokenNameToValue.put("Value", "'value'");
    		tokenNameToValue.put("Called", "'called'");
    		tokenNameToValue.put("Number", "'number'");
    		tokenNameToValue.put("Phrase", "'phrase'");
    		tokenNameToValue.put("Should", "'should'");
    		tokenNameToValue.put("Compose", "'compose'");
    		tokenNameToValue.put("Inherit", "'inherit'");
    		tokenNameToValue.put("Abstract", "'abstract'");
    		tokenNameToValue.put("Composes", "'composes'");
    		tokenNameToValue.put("Existing", "'existing'");
    		tokenNameToValue.put("Attribute", "'attribute'");
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
    // InternalFeatureLangParser.g:86:1: entryRuleFeatureRequest : ruleFeatureRequest EOF ;
    public final void entryRuleFeatureRequest() throws RecognitionException {
        try {
            // InternalFeatureLangParser.g:87:1: ( ruleFeatureRequest EOF )
            // InternalFeatureLangParser.g:88:1: ruleFeatureRequest EOF
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
    // InternalFeatureLangParser.g:95:1: ruleFeatureRequest : ( ( rule__FeatureRequest__StatementsAssignment )* ) ;
    public final void ruleFeatureRequest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:99:2: ( ( ( rule__FeatureRequest__StatementsAssignment )* ) )
            // InternalFeatureLangParser.g:100:2: ( ( rule__FeatureRequest__StatementsAssignment )* )
            {
            // InternalFeatureLangParser.g:100:2: ( ( rule__FeatureRequest__StatementsAssignment )* )
            // InternalFeatureLangParser.g:101:3: ( rule__FeatureRequest__StatementsAssignment )*
            {
             before(grammarAccess.getFeatureRequestAccess().getStatementsAssignment()); 
            // InternalFeatureLangParser.g:102:3: ( rule__FeatureRequest__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Abstract||LA1_0==Class||LA1_0==The||(LA1_0>=A && LA1_0<=RULE_ID)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFeatureLangParser.g:102:4: rule__FeatureRequest__StatementsAssignment
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
    // InternalFeatureLangParser.g:111:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalFeatureLangParser.g:112:1: ( ruleStatement EOF )
            // InternalFeatureLangParser.g:113:1: ruleStatement EOF
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
    // InternalFeatureLangParser.g:120:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:124:2: ( ( ( rule__Statement__Group__0 ) ) )
            // InternalFeatureLangParser.g:125:2: ( ( rule__Statement__Group__0 ) )
            {
            // InternalFeatureLangParser.g:125:2: ( ( rule__Statement__Group__0 ) )
            // InternalFeatureLangParser.g:126:3: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // InternalFeatureLangParser.g:127:3: ( rule__Statement__Group__0 )
            // InternalFeatureLangParser.g:127:4: rule__Statement__Group__0
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
    // InternalFeatureLangParser.g:136:1: entryRuleChangeStatement : ruleChangeStatement EOF ;
    public final void entryRuleChangeStatement() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:140:1: ( ruleChangeStatement EOF )
            // InternalFeatureLangParser.g:141:1: ruleChangeStatement EOF
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
    // InternalFeatureLangParser.g:151:1: ruleChangeStatement : ( ( rule__ChangeStatement__Group__0 ) ) ;
    public final void ruleChangeStatement() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:156:2: ( ( ( rule__ChangeStatement__Group__0 ) ) )
            // InternalFeatureLangParser.g:157:2: ( ( rule__ChangeStatement__Group__0 ) )
            {
            // InternalFeatureLangParser.g:157:2: ( ( rule__ChangeStatement__Group__0 ) )
            // InternalFeatureLangParser.g:158:3: ( rule__ChangeStatement__Group__0 )
            {
             before(grammarAccess.getChangeStatementAccess().getGroup()); 
            // InternalFeatureLangParser.g:159:3: ( rule__ChangeStatement__Group__0 )
            // InternalFeatureLangParser.g:159:4: rule__ChangeStatement__Group__0
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
    // InternalFeatureLangParser.g:169:1: entryRuleCreationStatement : ruleCreationStatement EOF ;
    public final void entryRuleCreationStatement() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:173:1: ( ruleCreationStatement EOF )
            // InternalFeatureLangParser.g:174:1: ruleCreationStatement EOF
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
    // InternalFeatureLangParser.g:184:1: ruleCreationStatement : ( ( rule__CreationStatement__Group__0 ) ) ;
    public final void ruleCreationStatement() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:189:2: ( ( ( rule__CreationStatement__Group__0 ) ) )
            // InternalFeatureLangParser.g:190:2: ( ( rule__CreationStatement__Group__0 ) )
            {
            // InternalFeatureLangParser.g:190:2: ( ( rule__CreationStatement__Group__0 ) )
            // InternalFeatureLangParser.g:191:3: ( rule__CreationStatement__Group__0 )
            {
             before(grammarAccess.getCreationStatementAccess().getGroup()); 
            // InternalFeatureLangParser.g:192:3: ( rule__CreationStatement__Group__0 )
            // InternalFeatureLangParser.g:192:4: rule__CreationStatement__Group__0
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
    // InternalFeatureLangParser.g:202:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:206:1: ( ruleAction EOF )
            // InternalFeatureLangParser.g:207:1: ruleAction EOF
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
    // InternalFeatureLangParser.g:217:1: ruleAction : ( ( rule__Action__TypeAssignment ) ) ;
    public final void ruleAction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:222:2: ( ( ( rule__Action__TypeAssignment ) ) )
            // InternalFeatureLangParser.g:223:2: ( ( rule__Action__TypeAssignment ) )
            {
            // InternalFeatureLangParser.g:223:2: ( ( rule__Action__TypeAssignment ) )
            // InternalFeatureLangParser.g:224:3: ( rule__Action__TypeAssignment )
            {
             before(grammarAccess.getActionAccess().getTypeAssignment()); 
            // InternalFeatureLangParser.g:225:3: ( rule__Action__TypeAssignment )
            // InternalFeatureLangParser.g:225:4: rule__Action__TypeAssignment
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
    // InternalFeatureLangParser.g:235:1: entryRuleUpdateAction : ruleUpdateAction EOF ;
    public final void entryRuleUpdateAction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:239:1: ( ruleUpdateAction EOF )
            // InternalFeatureLangParser.g:240:1: ruleUpdateAction EOF
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
    // InternalFeatureLangParser.g:250:1: ruleUpdateAction : ( ( rule__UpdateAction__Group__0 ) ) ;
    public final void ruleUpdateAction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:255:2: ( ( ( rule__UpdateAction__Group__0 ) ) )
            // InternalFeatureLangParser.g:256:2: ( ( rule__UpdateAction__Group__0 ) )
            {
            // InternalFeatureLangParser.g:256:2: ( ( rule__UpdateAction__Group__0 ) )
            // InternalFeatureLangParser.g:257:3: ( rule__UpdateAction__Group__0 )
            {
             before(grammarAccess.getUpdateActionAccess().getGroup()); 
            // InternalFeatureLangParser.g:258:3: ( rule__UpdateAction__Group__0 )
            // InternalFeatureLangParser.g:258:4: rule__UpdateAction__Group__0
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
    // InternalFeatureLangParser.g:268:1: entryRuleUpdateAttributeDatatype : ruleUpdateAttributeDatatype EOF ;
    public final void entryRuleUpdateAttributeDatatype() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:272:1: ( ruleUpdateAttributeDatatype EOF )
            // InternalFeatureLangParser.g:273:1: ruleUpdateAttributeDatatype EOF
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
    // InternalFeatureLangParser.g:283:1: ruleUpdateAttributeDatatype : ( ( rule__UpdateAttributeDatatype__Group__0 ) ) ;
    public final void ruleUpdateAttributeDatatype() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:288:2: ( ( ( rule__UpdateAttributeDatatype__Group__0 ) ) )
            // InternalFeatureLangParser.g:289:2: ( ( rule__UpdateAttributeDatatype__Group__0 ) )
            {
            // InternalFeatureLangParser.g:289:2: ( ( rule__UpdateAttributeDatatype__Group__0 ) )
            // InternalFeatureLangParser.g:290:3: ( rule__UpdateAttributeDatatype__Group__0 )
            {
             before(grammarAccess.getUpdateAttributeDatatypeAccess().getGroup()); 
            // InternalFeatureLangParser.g:291:3: ( rule__UpdateAttributeDatatype__Group__0 )
            // InternalFeatureLangParser.g:291:4: rule__UpdateAttributeDatatype__Group__0
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
    // InternalFeatureLangParser.g:301:1: entryRuleUpdateAttributeIdentifier : ruleUpdateAttributeIdentifier EOF ;
    public final void entryRuleUpdateAttributeIdentifier() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:305:1: ( ruleUpdateAttributeIdentifier EOF )
            // InternalFeatureLangParser.g:306:1: ruleUpdateAttributeIdentifier EOF
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
    // InternalFeatureLangParser.g:316:1: ruleUpdateAttributeIdentifier : ( ( rule__UpdateAttributeIdentifier__Group__0 ) ) ;
    public final void ruleUpdateAttributeIdentifier() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:321:2: ( ( ( rule__UpdateAttributeIdentifier__Group__0 ) ) )
            // InternalFeatureLangParser.g:322:2: ( ( rule__UpdateAttributeIdentifier__Group__0 ) )
            {
            // InternalFeatureLangParser.g:322:2: ( ( rule__UpdateAttributeIdentifier__Group__0 ) )
            // InternalFeatureLangParser.g:323:3: ( rule__UpdateAttributeIdentifier__Group__0 )
            {
             before(grammarAccess.getUpdateAttributeIdentifierAccess().getGroup()); 
            // InternalFeatureLangParser.g:324:3: ( rule__UpdateAttributeIdentifier__Group__0 )
            // InternalFeatureLangParser.g:324:4: rule__UpdateAttributeIdentifier__Group__0
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
    // InternalFeatureLangParser.g:334:1: entryRuleUpdateAttributeValue : ruleUpdateAttributeValue EOF ;
    public final void entryRuleUpdateAttributeValue() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:338:1: ( ruleUpdateAttributeValue EOF )
            // InternalFeatureLangParser.g:339:1: ruleUpdateAttributeValue EOF
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
    // InternalFeatureLangParser.g:349:1: ruleUpdateAttributeValue : ( ( rule__UpdateAttributeValue__Group__0 ) ) ;
    public final void ruleUpdateAttributeValue() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:354:2: ( ( ( rule__UpdateAttributeValue__Group__0 ) ) )
            // InternalFeatureLangParser.g:355:2: ( ( rule__UpdateAttributeValue__Group__0 ) )
            {
            // InternalFeatureLangParser.g:355:2: ( ( rule__UpdateAttributeValue__Group__0 ) )
            // InternalFeatureLangParser.g:356:3: ( rule__UpdateAttributeValue__Group__0 )
            {
             before(grammarAccess.getUpdateAttributeValueAccess().getGroup()); 
            // InternalFeatureLangParser.g:357:3: ( rule__UpdateAttributeValue__Group__0 )
            // InternalFeatureLangParser.g:357:4: rule__UpdateAttributeValue__Group__0
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
    // InternalFeatureLangParser.g:367:1: entryRuleAttributeAction : ruleAttributeAction EOF ;
    public final void entryRuleAttributeAction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:371:1: ( ruleAttributeAction EOF )
            // InternalFeatureLangParser.g:372:1: ruleAttributeAction EOF
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
    // InternalFeatureLangParser.g:382:1: ruleAttributeAction : ( ( rule__AttributeAction__Group__0 ) ) ;
    public final void ruleAttributeAction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:387:2: ( ( ( rule__AttributeAction__Group__0 ) ) )
            // InternalFeatureLangParser.g:388:2: ( ( rule__AttributeAction__Group__0 ) )
            {
            // InternalFeatureLangParser.g:388:2: ( ( rule__AttributeAction__Group__0 ) )
            // InternalFeatureLangParser.g:389:3: ( rule__AttributeAction__Group__0 )
            {
             before(grammarAccess.getAttributeActionAccess().getGroup()); 
            // InternalFeatureLangParser.g:390:3: ( rule__AttributeAction__Group__0 )
            // InternalFeatureLangParser.g:390:4: rule__AttributeAction__Group__0
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
    // InternalFeatureLangParser.g:400:1: entryRuleAssociationAction : ruleAssociationAction EOF ;
    public final void entryRuleAssociationAction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:404:1: ( ruleAssociationAction EOF )
            // InternalFeatureLangParser.g:405:1: ruleAssociationAction EOF
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
    // InternalFeatureLangParser.g:415:1: ruleAssociationAction : ( ( rule__AssociationAction__Group__0 ) ) ;
    public final void ruleAssociationAction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:420:2: ( ( ( rule__AssociationAction__Group__0 ) ) )
            // InternalFeatureLangParser.g:421:2: ( ( rule__AssociationAction__Group__0 ) )
            {
            // InternalFeatureLangParser.g:421:2: ( ( rule__AssociationAction__Group__0 ) )
            // InternalFeatureLangParser.g:422:3: ( rule__AssociationAction__Group__0 )
            {
             before(grammarAccess.getAssociationActionAccess().getGroup()); 
            // InternalFeatureLangParser.g:423:3: ( rule__AssociationAction__Group__0 )
            // InternalFeatureLangParser.g:423:4: rule__AssociationAction__Group__0
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


    // $ANTLR start "entryRuleInheritanceAction"
    // InternalFeatureLangParser.g:433:1: entryRuleInheritanceAction : ruleInheritanceAction EOF ;
    public final void entryRuleInheritanceAction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:437:1: ( ruleInheritanceAction EOF )
            // InternalFeatureLangParser.g:438:1: ruleInheritanceAction EOF
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
    // InternalFeatureLangParser.g:448:1: ruleInheritanceAction : ( ( rule__InheritanceAction__Group__0 ) ) ;
    public final void ruleInheritanceAction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:453:2: ( ( ( rule__InheritanceAction__Group__0 ) ) )
            // InternalFeatureLangParser.g:454:2: ( ( rule__InheritanceAction__Group__0 ) )
            {
            // InternalFeatureLangParser.g:454:2: ( ( rule__InheritanceAction__Group__0 ) )
            // InternalFeatureLangParser.g:455:3: ( rule__InheritanceAction__Group__0 )
            {
             before(grammarAccess.getInheritanceActionAccess().getGroup()); 
            // InternalFeatureLangParser.g:456:3: ( rule__InheritanceAction__Group__0 )
            // InternalFeatureLangParser.g:456:4: rule__InheritanceAction__Group__0
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
    // InternalFeatureLangParser.g:466:1: entryRuleCompositionAction : ruleCompositionAction EOF ;
    public final void entryRuleCompositionAction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:470:1: ( ruleCompositionAction EOF )
            // InternalFeatureLangParser.g:471:1: ruleCompositionAction EOF
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
    // InternalFeatureLangParser.g:481:1: ruleCompositionAction : ( ( rule__CompositionAction__Group__0 ) ) ;
    public final void ruleCompositionAction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:486:2: ( ( ( rule__CompositionAction__Group__0 ) ) )
            // InternalFeatureLangParser.g:487:2: ( ( rule__CompositionAction__Group__0 ) )
            {
            // InternalFeatureLangParser.g:487:2: ( ( rule__CompositionAction__Group__0 ) )
            // InternalFeatureLangParser.g:488:3: ( rule__CompositionAction__Group__0 )
            {
             before(grammarAccess.getCompositionActionAccess().getGroup()); 
            // InternalFeatureLangParser.g:489:3: ( rule__CompositionAction__Group__0 )
            // InternalFeatureLangParser.g:489:4: rule__CompositionAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompositionAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositionActionAccess().getGroup()); 

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


    // $ANTLR start "entryRuleClass"
    // InternalFeatureLangParser.g:499:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:503:1: ( ruleClass EOF )
            // InternalFeatureLangParser.g:504:1: ruleClass EOF
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
    // InternalFeatureLangParser.g:514:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:519:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalFeatureLangParser.g:520:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalFeatureLangParser.g:520:2: ( ( rule__Class__Group__0 ) )
            // InternalFeatureLangParser.g:521:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalFeatureLangParser.g:522:3: ( rule__Class__Group__0 )
            // InternalFeatureLangParser.g:522:4: rule__Class__Group__0
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
    // InternalFeatureLangParser.g:532:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:536:1: ( ruleAttribute EOF )
            // InternalFeatureLangParser.g:537:1: ruleAttribute EOF
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
    // InternalFeatureLangParser.g:547:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:552:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalFeatureLangParser.g:553:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalFeatureLangParser.g:553:2: ( ( rule__Attribute__Group__0 ) )
            // InternalFeatureLangParser.g:554:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalFeatureLangParser.g:555:3: ( rule__Attribute__Group__0 )
            // InternalFeatureLangParser.g:555:4: rule__Attribute__Group__0
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
    // InternalFeatureLangParser.g:565:1: entryRuleIdentifier : ruleIdentifier EOF ;
    public final void entryRuleIdentifier() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:569:1: ( ruleIdentifier EOF )
            // InternalFeatureLangParser.g:570:1: ruleIdentifier EOF
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
    // InternalFeatureLangParser.g:580:1: ruleIdentifier : ( ( rule__Identifier__Group__0 ) ) ;
    public final void ruleIdentifier() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:585:2: ( ( ( rule__Identifier__Group__0 ) ) )
            // InternalFeatureLangParser.g:586:2: ( ( rule__Identifier__Group__0 ) )
            {
            // InternalFeatureLangParser.g:586:2: ( ( rule__Identifier__Group__0 ) )
            // InternalFeatureLangParser.g:587:3: ( rule__Identifier__Group__0 )
            {
             before(grammarAccess.getIdentifierAccess().getGroup()); 
            // InternalFeatureLangParser.g:588:3: ( rule__Identifier__Group__0 )
            // InternalFeatureLangParser.g:588:4: rule__Identifier__Group__0
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
    // InternalFeatureLangParser.g:598:1: entryRulePriority : rulePriority EOF ;
    public final void entryRulePriority() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:602:1: ( rulePriority EOF )
            // InternalFeatureLangParser.g:603:1: rulePriority EOF
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
    // InternalFeatureLangParser.g:613:1: rulePriority : ( ( rule__Priority__PriorityAssignment ) ) ;
    public final void rulePriority() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:618:2: ( ( ( rule__Priority__PriorityAssignment ) ) )
            // InternalFeatureLangParser.g:619:2: ( ( rule__Priority__PriorityAssignment ) )
            {
            // InternalFeatureLangParser.g:619:2: ( ( rule__Priority__PriorityAssignment ) )
            // InternalFeatureLangParser.g:620:3: ( rule__Priority__PriorityAssignment )
            {
             before(grammarAccess.getPriorityAccess().getPriorityAssignment()); 
            // InternalFeatureLangParser.g:621:3: ( rule__Priority__PriorityAssignment )
            // InternalFeatureLangParser.g:621:4: rule__Priority__PriorityAssignment
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


    // $ANTLR start "rulePriorityValue"
    // InternalFeatureLangParser.g:631:1: rulePriorityValue : ( ( rule__PriorityValue__Alternatives ) ) ;
    public final void rulePriorityValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:635:1: ( ( ( rule__PriorityValue__Alternatives ) ) )
            // InternalFeatureLangParser.g:636:2: ( ( rule__PriorityValue__Alternatives ) )
            {
            // InternalFeatureLangParser.g:636:2: ( ( rule__PriorityValue__Alternatives ) )
            // InternalFeatureLangParser.g:637:3: ( rule__PriorityValue__Alternatives )
            {
             before(grammarAccess.getPriorityValueAccess().getAlternatives()); 
            // InternalFeatureLangParser.g:638:3: ( rule__PriorityValue__Alternatives )
            // InternalFeatureLangParser.g:638:4: rule__PriorityValue__Alternatives
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
    // InternalFeatureLangParser.g:647:1: ruleAbstraction : ( ( Abstract ) ) ;
    public final void ruleAbstraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:651:1: ( ( ( Abstract ) ) )
            // InternalFeatureLangParser.g:652:2: ( ( Abstract ) )
            {
            // InternalFeatureLangParser.g:652:2: ( ( Abstract ) )
            // InternalFeatureLangParser.g:653:3: ( Abstract )
            {
             before(grammarAccess.getAbstractionAccess().getABSTRACTEnumLiteralDeclaration()); 
            // InternalFeatureLangParser.g:654:3: ( Abstract )
            // InternalFeatureLangParser.g:654:4: Abstract
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
    // InternalFeatureLangParser.g:663:1: ruleIdentifierValue : ( ( rule__IdentifierValue__Alternatives ) ) ;
    public final void ruleIdentifierValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:667:1: ( ( ( rule__IdentifierValue__Alternatives ) ) )
            // InternalFeatureLangParser.g:668:2: ( ( rule__IdentifierValue__Alternatives ) )
            {
            // InternalFeatureLangParser.g:668:2: ( ( rule__IdentifierValue__Alternatives ) )
            // InternalFeatureLangParser.g:669:3: ( rule__IdentifierValue__Alternatives )
            {
             before(grammarAccess.getIdentifierValueAccess().getAlternatives()); 
            // InternalFeatureLangParser.g:670:3: ( rule__IdentifierValue__Alternatives )
            // InternalFeatureLangParser.g:670:4: rule__IdentifierValue__Alternatives
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
    // InternalFeatureLangParser.g:679:1: ruleDatatype : ( ( rule__Datatype__Alternatives ) ) ;
    public final void ruleDatatype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:683:1: ( ( ( rule__Datatype__Alternatives ) ) )
            // InternalFeatureLangParser.g:684:2: ( ( rule__Datatype__Alternatives ) )
            {
            // InternalFeatureLangParser.g:684:2: ( ( rule__Datatype__Alternatives ) )
            // InternalFeatureLangParser.g:685:3: ( rule__Datatype__Alternatives )
            {
             before(grammarAccess.getDatatypeAccess().getAlternatives()); 
            // InternalFeatureLangParser.g:686:3: ( rule__Datatype__Alternatives )
            // InternalFeatureLangParser.g:686:4: rule__Datatype__Alternatives
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
    // InternalFeatureLangParser.g:694:1: rule__Statement__Alternatives_0 : ( ( ruleChangeStatement ) | ( ruleCreationStatement ) );
    public final void rule__Statement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:698:1: ( ( ruleChangeStatement ) | ( ruleCreationStatement ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalFeatureLangParser.g:699:2: ( ruleChangeStatement )
                    {
                    // InternalFeatureLangParser.g:699:2: ( ruleChangeStatement )
                    // InternalFeatureLangParser.g:700:3: ruleChangeStatement
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
                    // InternalFeatureLangParser.g:705:2: ( ruleCreationStatement )
                    {
                    // InternalFeatureLangParser.g:705:2: ( ruleCreationStatement )
                    // InternalFeatureLangParser.g:706:3: ruleCreationStatement
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
    // InternalFeatureLangParser.g:715:1: rule__ChangeStatement__Alternatives_1 : ( ( ( rule__ChangeStatement__Group_1_0__0 ) ) | ( ( rule__ChangeStatement__UpdateAssignment_1_1 ) ) );
    public final void rule__ChangeStatement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:719:1: ( ( ( rule__ChangeStatement__Group_1_0__0 ) ) | ( ( rule__ChangeStatement__UpdateAssignment_1_1 ) ) )
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
                    // InternalFeatureLangParser.g:720:2: ( ( rule__ChangeStatement__Group_1_0__0 ) )
                    {
                    // InternalFeatureLangParser.g:720:2: ( ( rule__ChangeStatement__Group_1_0__0 ) )
                    // InternalFeatureLangParser.g:721:3: ( rule__ChangeStatement__Group_1_0__0 )
                    {
                     before(grammarAccess.getChangeStatementAccess().getGroup_1_0()); 
                    // InternalFeatureLangParser.g:722:3: ( rule__ChangeStatement__Group_1_0__0 )
                    // InternalFeatureLangParser.g:722:4: rule__ChangeStatement__Group_1_0__0
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
                    // InternalFeatureLangParser.g:726:2: ( ( rule__ChangeStatement__UpdateAssignment_1_1 ) )
                    {
                    // InternalFeatureLangParser.g:726:2: ( ( rule__ChangeStatement__UpdateAssignment_1_1 ) )
                    // InternalFeatureLangParser.g:727:3: ( rule__ChangeStatement__UpdateAssignment_1_1 )
                    {
                     before(grammarAccess.getChangeStatementAccess().getUpdateAssignment_1_1()); 
                    // InternalFeatureLangParser.g:728:3: ( rule__ChangeStatement__UpdateAssignment_1_1 )
                    // InternalFeatureLangParser.g:728:4: rule__ChangeStatement__UpdateAssignment_1_1
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
    // InternalFeatureLangParser.g:736:1: rule__ChangeStatement__Alternatives_1_0_2 : ( ( ( rule__ChangeStatement__ActionAssignment_1_0_2_0 ) ) | ( ( rule__ChangeStatement__Group_1_0_2_1__0 ) ) );
    public final void rule__ChangeStatement__Alternatives_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:740:1: ( ( ( rule__ChangeStatement__ActionAssignment_1_0_2_0 ) ) | ( ( rule__ChangeStatement__Group_1_0_2_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Have) ) {
                switch ( input.LA(2) ) {
                case Associations:
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
            else if ( (LA4_0==Composes||(LA4_0>=Compose && LA4_0<=Inherit)) ) {
                alt4=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalFeatureLangParser.g:741:2: ( ( rule__ChangeStatement__ActionAssignment_1_0_2_0 ) )
                    {
                    // InternalFeatureLangParser.g:741:2: ( ( rule__ChangeStatement__ActionAssignment_1_0_2_0 ) )
                    // InternalFeatureLangParser.g:742:3: ( rule__ChangeStatement__ActionAssignment_1_0_2_0 )
                    {
                     before(grammarAccess.getChangeStatementAccess().getActionAssignment_1_0_2_0()); 
                    // InternalFeatureLangParser.g:743:3: ( rule__ChangeStatement__ActionAssignment_1_0_2_0 )
                    // InternalFeatureLangParser.g:743:4: rule__ChangeStatement__ActionAssignment_1_0_2_0
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
                    // InternalFeatureLangParser.g:747:2: ( ( rule__ChangeStatement__Group_1_0_2_1__0 ) )
                    {
                    // InternalFeatureLangParser.g:747:2: ( ( rule__ChangeStatement__Group_1_0_2_1__0 ) )
                    // InternalFeatureLangParser.g:748:3: ( rule__ChangeStatement__Group_1_0_2_1__0 )
                    {
                     before(grammarAccess.getChangeStatementAccess().getGroup_1_0_2_1()); 
                    // InternalFeatureLangParser.g:749:3: ( rule__ChangeStatement__Group_1_0_2_1__0 )
                    // InternalFeatureLangParser.g:749:4: rule__ChangeStatement__Group_1_0_2_1__0
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
    // InternalFeatureLangParser.g:757:1: rule__ChangeStatement__Alternatives_1_0_2_1_1 : ( ( A ) | ( An ) );
    public final void rule__ChangeStatement__Alternatives_1_0_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:761:1: ( ( A ) | ( An ) )
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
                    // InternalFeatureLangParser.g:762:2: ( A )
                    {
                    // InternalFeatureLangParser.g:762:2: ( A )
                    // InternalFeatureLangParser.g:763:3: A
                    {
                     before(grammarAccess.getChangeStatementAccess().getAKeyword_1_0_2_1_1_0()); 
                    match(input,A,FOLLOW_2); 
                     after(grammarAccess.getChangeStatementAccess().getAKeyword_1_0_2_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:768:2: ( An )
                    {
                    // InternalFeatureLangParser.g:768:2: ( An )
                    // InternalFeatureLangParser.g:769:3: An
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
    // InternalFeatureLangParser.g:778:1: rule__CreationStatement__Alternatives_3 : ( ( Exist ) | ( Be ) );
    public final void rule__CreationStatement__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:782:1: ( ( Exist ) | ( Be ) )
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
                    // InternalFeatureLangParser.g:783:2: ( Exist )
                    {
                    // InternalFeatureLangParser.g:783:2: ( Exist )
                    // InternalFeatureLangParser.g:784:3: Exist
                    {
                     before(grammarAccess.getCreationStatementAccess().getExistKeyword_3_0()); 
                    match(input,Exist,FOLLOW_2); 
                     after(grammarAccess.getCreationStatementAccess().getExistKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:789:2: ( Be )
                    {
                    // InternalFeatureLangParser.g:789:2: ( Be )
                    // InternalFeatureLangParser.g:790:3: Be
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
    // InternalFeatureLangParser.g:799:1: rule__Action__TypeAlternatives_0 : ( ( ruleAttributeAction ) | ( ruleAssociationAction ) | ( ruleInheritanceAction ) | ( ruleCompositionAction ) );
    public final void rule__Action__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:803:1: ( ( ruleAttributeAction ) | ( ruleAssociationAction ) | ( ruleInheritanceAction ) | ( ruleCompositionAction ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case Have:
                {
                int LA7_1 = input.LA(2);

                if ( ((LA7_1>=The && LA7_1<=An)||LA7_1==A) ) {
                    alt7=1;
                }
                else if ( (LA7_1==Associations) ) {
                    alt7=2;
                }
                else {
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
            case Composes:
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
                    // InternalFeatureLangParser.g:804:2: ( ruleAttributeAction )
                    {
                    // InternalFeatureLangParser.g:804:2: ( ruleAttributeAction )
                    // InternalFeatureLangParser.g:805:3: ruleAttributeAction
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
                    // InternalFeatureLangParser.g:810:2: ( ruleAssociationAction )
                    {
                    // InternalFeatureLangParser.g:810:2: ( ruleAssociationAction )
                    // InternalFeatureLangParser.g:811:3: ruleAssociationAction
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
                    // InternalFeatureLangParser.g:816:2: ( ruleInheritanceAction )
                    {
                    // InternalFeatureLangParser.g:816:2: ( ruleInheritanceAction )
                    // InternalFeatureLangParser.g:817:3: ruleInheritanceAction
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
                    // InternalFeatureLangParser.g:822:2: ( ruleCompositionAction )
                    {
                    // InternalFeatureLangParser.g:822:2: ( ruleCompositionAction )
                    // InternalFeatureLangParser.g:823:3: ruleCompositionAction
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
    // InternalFeatureLangParser.g:832:1: rule__UpdateAction__Alternatives_1 : ( ( An ) | ( A ) );
    public final void rule__UpdateAction__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:836:1: ( ( An ) | ( A ) )
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
                    // InternalFeatureLangParser.g:837:2: ( An )
                    {
                    // InternalFeatureLangParser.g:837:2: ( An )
                    // InternalFeatureLangParser.g:838:3: An
                    {
                     before(grammarAccess.getUpdateActionAccess().getAnKeyword_1_0()); 
                    match(input,An,FOLLOW_2); 
                     after(grammarAccess.getUpdateActionAccess().getAnKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:843:2: ( A )
                    {
                    // InternalFeatureLangParser.g:843:2: ( A )
                    // InternalFeatureLangParser.g:844:3: A
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
    // InternalFeatureLangParser.g:853:1: rule__UpdateAction__Alternatives_7 : ( ( ( rule__UpdateAction__DatatypeAssignment_7_0 ) ) | ( ( rule__UpdateAction__IdentifierAssignment_7_1 ) ) | ( ( rule__UpdateAction__ValueAssignment_7_2 ) ) );
    public final void rule__UpdateAction__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:857:1: ( ( ( rule__UpdateAction__DatatypeAssignment_7_0 ) ) | ( ( rule__UpdateAction__IdentifierAssignment_7_1 ) ) | ( ( rule__UpdateAction__ValueAssignment_7_2 ) ) )
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
                    // InternalFeatureLangParser.g:858:2: ( ( rule__UpdateAction__DatatypeAssignment_7_0 ) )
                    {
                    // InternalFeatureLangParser.g:858:2: ( ( rule__UpdateAction__DatatypeAssignment_7_0 ) )
                    // InternalFeatureLangParser.g:859:3: ( rule__UpdateAction__DatatypeAssignment_7_0 )
                    {
                     before(grammarAccess.getUpdateActionAccess().getDatatypeAssignment_7_0()); 
                    // InternalFeatureLangParser.g:860:3: ( rule__UpdateAction__DatatypeAssignment_7_0 )
                    // InternalFeatureLangParser.g:860:4: rule__UpdateAction__DatatypeAssignment_7_0
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
                    // InternalFeatureLangParser.g:864:2: ( ( rule__UpdateAction__IdentifierAssignment_7_1 ) )
                    {
                    // InternalFeatureLangParser.g:864:2: ( ( rule__UpdateAction__IdentifierAssignment_7_1 ) )
                    // InternalFeatureLangParser.g:865:3: ( rule__UpdateAction__IdentifierAssignment_7_1 )
                    {
                     before(grammarAccess.getUpdateActionAccess().getIdentifierAssignment_7_1()); 
                    // InternalFeatureLangParser.g:866:3: ( rule__UpdateAction__IdentifierAssignment_7_1 )
                    // InternalFeatureLangParser.g:866:4: rule__UpdateAction__IdentifierAssignment_7_1
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
                    // InternalFeatureLangParser.g:870:2: ( ( rule__UpdateAction__ValueAssignment_7_2 ) )
                    {
                    // InternalFeatureLangParser.g:870:2: ( ( rule__UpdateAction__ValueAssignment_7_2 ) )
                    // InternalFeatureLangParser.g:871:3: ( rule__UpdateAction__ValueAssignment_7_2 )
                    {
                     before(grammarAccess.getUpdateActionAccess().getValueAssignment_7_2()); 
                    // InternalFeatureLangParser.g:872:3: ( rule__UpdateAction__ValueAssignment_7_2 )
                    // InternalFeatureLangParser.g:872:4: rule__UpdateAction__ValueAssignment_7_2
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
    // InternalFeatureLangParser.g:880:1: rule__UpdateAttributeIdentifier__Alternatives_1 : ( ( A ) | ( An ) );
    public final void rule__UpdateAttributeIdentifier__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:884:1: ( ( A ) | ( An ) )
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
                    // InternalFeatureLangParser.g:885:2: ( A )
                    {
                    // InternalFeatureLangParser.g:885:2: ( A )
                    // InternalFeatureLangParser.g:886:3: A
                    {
                     before(grammarAccess.getUpdateAttributeIdentifierAccess().getAKeyword_1_0()); 
                    match(input,A,FOLLOW_2); 
                     after(grammarAccess.getUpdateAttributeIdentifierAccess().getAKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:891:2: ( An )
                    {
                    // InternalFeatureLangParser.g:891:2: ( An )
                    // InternalFeatureLangParser.g:892:3: An
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
    // InternalFeatureLangParser.g:901:1: rule__AttributeAction__Alternatives_1 : ( ( The ) | ( An ) | ( A ) );
    public final void rule__AttributeAction__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:905:1: ( ( The ) | ( An ) | ( A ) )
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
                    // InternalFeatureLangParser.g:906:2: ( The )
                    {
                    // InternalFeatureLangParser.g:906:2: ( The )
                    // InternalFeatureLangParser.g:907:3: The
                    {
                     before(grammarAccess.getAttributeActionAccess().getTheKeyword_1_0()); 
                    match(input,The,FOLLOW_2); 
                     after(grammarAccess.getAttributeActionAccess().getTheKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:912:2: ( An )
                    {
                    // InternalFeatureLangParser.g:912:2: ( An )
                    // InternalFeatureLangParser.g:913:3: An
                    {
                     before(grammarAccess.getAttributeActionAccess().getAnKeyword_1_1()); 
                    match(input,An,FOLLOW_2); 
                     after(grammarAccess.getAttributeActionAccess().getAnKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureLangParser.g:918:2: ( A )
                    {
                    // InternalFeatureLangParser.g:918:2: ( A )
                    // InternalFeatureLangParser.g:919:3: A
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


    // $ANTLR start "rule__CompositionAction__Alternatives_0"
    // InternalFeatureLangParser.g:928:1: rule__CompositionAction__Alternatives_0 : ( ( Compose ) | ( Composes ) );
    public final void rule__CompositionAction__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:932:1: ( ( Compose ) | ( Composes ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Compose) ) {
                alt12=1;
            }
            else if ( (LA12_0==Composes) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalFeatureLangParser.g:933:2: ( Compose )
                    {
                    // InternalFeatureLangParser.g:933:2: ( Compose )
                    // InternalFeatureLangParser.g:934:3: Compose
                    {
                     before(grammarAccess.getCompositionActionAccess().getComposeKeyword_0_0()); 
                    match(input,Compose,FOLLOW_2); 
                     after(grammarAccess.getCompositionActionAccess().getComposeKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:939:2: ( Composes )
                    {
                    // InternalFeatureLangParser.g:939:2: ( Composes )
                    // InternalFeatureLangParser.g:940:3: Composes
                    {
                     before(grammarAccess.getCompositionActionAccess().getComposesKeyword_0_1()); 
                    match(input,Composes,FOLLOW_2); 
                     after(grammarAccess.getCompositionActionAccess().getComposesKeyword_0_1()); 

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
    // $ANTLR end "rule__CompositionAction__Alternatives_0"


    // $ANTLR start "rule__Class__Alternatives_0"
    // InternalFeatureLangParser.g:949:1: rule__Class__Alternatives_0 : ( ( The ) | ( A ) );
    public final void rule__Class__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:953:1: ( ( The ) | ( A ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==The) ) {
                alt13=1;
            }
            else if ( (LA13_0==A) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalFeatureLangParser.g:954:2: ( The )
                    {
                    // InternalFeatureLangParser.g:954:2: ( The )
                    // InternalFeatureLangParser.g:955:3: The
                    {
                     before(grammarAccess.getClassAccess().getTheKeyword_0_0()); 
                    match(input,The,FOLLOW_2); 
                     after(grammarAccess.getClassAccess().getTheKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:960:2: ( A )
                    {
                    // InternalFeatureLangParser.g:960:2: ( A )
                    // InternalFeatureLangParser.g:961:3: A
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


    // $ANTLR start "rule__PriorityValue__Alternatives"
    // InternalFeatureLangParser.g:970:1: rule__PriorityValue__Alternatives : ( ( ( Should ) ) | ( ( Must ) ) );
    public final void rule__PriorityValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:974:1: ( ( ( Should ) ) | ( ( Must ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Should) ) {
                alt14=1;
            }
            else if ( (LA14_0==Must) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalFeatureLangParser.g:975:2: ( ( Should ) )
                    {
                    // InternalFeatureLangParser.g:975:2: ( ( Should ) )
                    // InternalFeatureLangParser.g:976:3: ( Should )
                    {
                     before(grammarAccess.getPriorityValueAccess().getSHOULDEnumLiteralDeclaration_0()); 
                    // InternalFeatureLangParser.g:977:3: ( Should )
                    // InternalFeatureLangParser.g:977:4: Should
                    {
                    match(input,Should,FOLLOW_2); 

                    }

                     after(grammarAccess.getPriorityValueAccess().getSHOULDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:981:2: ( ( Must ) )
                    {
                    // InternalFeatureLangParser.g:981:2: ( ( Must ) )
                    // InternalFeatureLangParser.g:982:3: ( Must )
                    {
                     before(grammarAccess.getPriorityValueAccess().getMUSTEnumLiteralDeclaration_1()); 
                    // InternalFeatureLangParser.g:983:3: ( Must )
                    // InternalFeatureLangParser.g:983:4: Must
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
    // InternalFeatureLangParser.g:991:1: rule__IdentifierValue__Alternatives : ( ( ( Name ) ) | ( ( URI ) ) );
    public final void rule__IdentifierValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:995:1: ( ( ( Name ) ) | ( ( URI ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Name) ) {
                alt15=1;
            }
            else if ( (LA15_0==URI) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalFeatureLangParser.g:996:2: ( ( Name ) )
                    {
                    // InternalFeatureLangParser.g:996:2: ( ( Name ) )
                    // InternalFeatureLangParser.g:997:3: ( Name )
                    {
                     before(grammarAccess.getIdentifierValueAccess().getNAMEEnumLiteralDeclaration_0()); 
                    // InternalFeatureLangParser.g:998:3: ( Name )
                    // InternalFeatureLangParser.g:998:4: Name
                    {
                    match(input,Name,FOLLOW_2); 

                    }

                     after(grammarAccess.getIdentifierValueAccess().getNAMEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1002:2: ( ( URI ) )
                    {
                    // InternalFeatureLangParser.g:1002:2: ( ( URI ) )
                    // InternalFeatureLangParser.g:1003:3: ( URI )
                    {
                     before(grammarAccess.getIdentifierValueAccess().getURIEnumLiteralDeclaration_1()); 
                    // InternalFeatureLangParser.g:1004:3: ( URI )
                    // InternalFeatureLangParser.g:1004:4: URI
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
    // InternalFeatureLangParser.g:1012:1: rule__Datatype__Alternatives : ( ( ( Time ) ) | ( ( Phrase ) ) | ( ( Number ) ) );
    public final void rule__Datatype__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1016:1: ( ( ( Time ) ) | ( ( Phrase ) ) | ( ( Number ) ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case Time:
                {
                alt16=1;
                }
                break;
            case Phrase:
                {
                alt16=2;
                }
                break;
            case Number:
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
                    // InternalFeatureLangParser.g:1017:2: ( ( Time ) )
                    {
                    // InternalFeatureLangParser.g:1017:2: ( ( Time ) )
                    // InternalFeatureLangParser.g:1018:3: ( Time )
                    {
                     before(grammarAccess.getDatatypeAccess().getWORDEnumLiteralDeclaration_0()); 
                    // InternalFeatureLangParser.g:1019:3: ( Time )
                    // InternalFeatureLangParser.g:1019:4: Time
                    {
                    match(input,Time,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatatypeAccess().getWORDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:1023:2: ( ( Phrase ) )
                    {
                    // InternalFeatureLangParser.g:1023:2: ( ( Phrase ) )
                    // InternalFeatureLangParser.g:1024:3: ( Phrase )
                    {
                     before(grammarAccess.getDatatypeAccess().getPHRASEEnumLiteralDeclaration_1()); 
                    // InternalFeatureLangParser.g:1025:3: ( Phrase )
                    // InternalFeatureLangParser.g:1025:4: Phrase
                    {
                    match(input,Phrase,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatatypeAccess().getPHRASEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureLangParser.g:1029:2: ( ( Number ) )
                    {
                    // InternalFeatureLangParser.g:1029:2: ( ( Number ) )
                    // InternalFeatureLangParser.g:1030:3: ( Number )
                    {
                     before(grammarAccess.getDatatypeAccess().getNUMBEREnumLiteralDeclaration_2()); 
                    // InternalFeatureLangParser.g:1031:3: ( Number )
                    // InternalFeatureLangParser.g:1031:4: Number
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
    // InternalFeatureLangParser.g:1039:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1043:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalFeatureLangParser.g:1044:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
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
    // InternalFeatureLangParser.g:1051:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__Alternatives_0 ) ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1055:1: ( ( ( rule__Statement__Alternatives_0 ) ) )
            // InternalFeatureLangParser.g:1056:1: ( ( rule__Statement__Alternatives_0 ) )
            {
            // InternalFeatureLangParser.g:1056:1: ( ( rule__Statement__Alternatives_0 ) )
            // InternalFeatureLangParser.g:1057:2: ( rule__Statement__Alternatives_0 )
            {
             before(grammarAccess.getStatementAccess().getAlternatives_0()); 
            // InternalFeatureLangParser.g:1058:2: ( rule__Statement__Alternatives_0 )
            // InternalFeatureLangParser.g:1058:3: rule__Statement__Alternatives_0
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
    // InternalFeatureLangParser.g:1066:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1070:1: ( rule__Statement__Group__1__Impl )
            // InternalFeatureLangParser.g:1071:2: rule__Statement__Group__1__Impl
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
    // InternalFeatureLangParser.g:1077:1: rule__Statement__Group__1__Impl : ( ( FullStop )? ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1081:1: ( ( ( FullStop )? ) )
            // InternalFeatureLangParser.g:1082:1: ( ( FullStop )? )
            {
            // InternalFeatureLangParser.g:1082:1: ( ( FullStop )? )
            // InternalFeatureLangParser.g:1083:2: ( FullStop )?
            {
             before(grammarAccess.getStatementAccess().getFullStopKeyword_1()); 
            // InternalFeatureLangParser.g:1084:2: ( FullStop )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==FullStop) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalFeatureLangParser.g:1084:3: FullStop
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
    // InternalFeatureLangParser.g:1093:1: rule__ChangeStatement__Group__0 : rule__ChangeStatement__Group__0__Impl rule__ChangeStatement__Group__1 ;
    public final void rule__ChangeStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1097:1: ( rule__ChangeStatement__Group__0__Impl rule__ChangeStatement__Group__1 )
            // InternalFeatureLangParser.g:1098:2: rule__ChangeStatement__Group__0__Impl rule__ChangeStatement__Group__1
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
    // InternalFeatureLangParser.g:1105:1: rule__ChangeStatement__Group__0__Impl : ( ( rule__ChangeStatement__TargetAssignment_0 ) ) ;
    public final void rule__ChangeStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1109:1: ( ( ( rule__ChangeStatement__TargetAssignment_0 ) ) )
            // InternalFeatureLangParser.g:1110:1: ( ( rule__ChangeStatement__TargetAssignment_0 ) )
            {
            // InternalFeatureLangParser.g:1110:1: ( ( rule__ChangeStatement__TargetAssignment_0 ) )
            // InternalFeatureLangParser.g:1111:2: ( rule__ChangeStatement__TargetAssignment_0 )
            {
             before(grammarAccess.getChangeStatementAccess().getTargetAssignment_0()); 
            // InternalFeatureLangParser.g:1112:2: ( rule__ChangeStatement__TargetAssignment_0 )
            // InternalFeatureLangParser.g:1112:3: rule__ChangeStatement__TargetAssignment_0
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
    // InternalFeatureLangParser.g:1120:1: rule__ChangeStatement__Group__1 : rule__ChangeStatement__Group__1__Impl ;
    public final void rule__ChangeStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1124:1: ( rule__ChangeStatement__Group__1__Impl )
            // InternalFeatureLangParser.g:1125:2: rule__ChangeStatement__Group__1__Impl
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
    // InternalFeatureLangParser.g:1131:1: rule__ChangeStatement__Group__1__Impl : ( ( rule__ChangeStatement__Alternatives_1 ) ) ;
    public final void rule__ChangeStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1135:1: ( ( ( rule__ChangeStatement__Alternatives_1 ) ) )
            // InternalFeatureLangParser.g:1136:1: ( ( rule__ChangeStatement__Alternatives_1 ) )
            {
            // InternalFeatureLangParser.g:1136:1: ( ( rule__ChangeStatement__Alternatives_1 ) )
            // InternalFeatureLangParser.g:1137:2: ( rule__ChangeStatement__Alternatives_1 )
            {
             before(grammarAccess.getChangeStatementAccess().getAlternatives_1()); 
            // InternalFeatureLangParser.g:1138:2: ( rule__ChangeStatement__Alternatives_1 )
            // InternalFeatureLangParser.g:1138:3: rule__ChangeStatement__Alternatives_1
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
    // InternalFeatureLangParser.g:1147:1: rule__ChangeStatement__Group_1_0__0 : rule__ChangeStatement__Group_1_0__0__Impl rule__ChangeStatement__Group_1_0__1 ;
    public final void rule__ChangeStatement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1151:1: ( rule__ChangeStatement__Group_1_0__0__Impl rule__ChangeStatement__Group_1_0__1 )
            // InternalFeatureLangParser.g:1152:2: rule__ChangeStatement__Group_1_0__0__Impl rule__ChangeStatement__Group_1_0__1
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
    // InternalFeatureLangParser.g:1159:1: rule__ChangeStatement__Group_1_0__0__Impl : ( ( rule__ChangeStatement__PriorityAssignment_1_0_0 ) ) ;
    public final void rule__ChangeStatement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1163:1: ( ( ( rule__ChangeStatement__PriorityAssignment_1_0_0 ) ) )
            // InternalFeatureLangParser.g:1164:1: ( ( rule__ChangeStatement__PriorityAssignment_1_0_0 ) )
            {
            // InternalFeatureLangParser.g:1164:1: ( ( rule__ChangeStatement__PriorityAssignment_1_0_0 ) )
            // InternalFeatureLangParser.g:1165:2: ( rule__ChangeStatement__PriorityAssignment_1_0_0 )
            {
             before(grammarAccess.getChangeStatementAccess().getPriorityAssignment_1_0_0()); 
            // InternalFeatureLangParser.g:1166:2: ( rule__ChangeStatement__PriorityAssignment_1_0_0 )
            // InternalFeatureLangParser.g:1166:3: rule__ChangeStatement__PriorityAssignment_1_0_0
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
    // InternalFeatureLangParser.g:1174:1: rule__ChangeStatement__Group_1_0__1 : rule__ChangeStatement__Group_1_0__1__Impl rule__ChangeStatement__Group_1_0__2 ;
    public final void rule__ChangeStatement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1178:1: ( rule__ChangeStatement__Group_1_0__1__Impl rule__ChangeStatement__Group_1_0__2 )
            // InternalFeatureLangParser.g:1179:2: rule__ChangeStatement__Group_1_0__1__Impl rule__ChangeStatement__Group_1_0__2
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
    // InternalFeatureLangParser.g:1186:1: rule__ChangeStatement__Group_1_0__1__Impl : ( ( rule__ChangeStatement__NegationAssignment_1_0_1 )? ) ;
    public final void rule__ChangeStatement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1190:1: ( ( ( rule__ChangeStatement__NegationAssignment_1_0_1 )? ) )
            // InternalFeatureLangParser.g:1191:1: ( ( rule__ChangeStatement__NegationAssignment_1_0_1 )? )
            {
            // InternalFeatureLangParser.g:1191:1: ( ( rule__ChangeStatement__NegationAssignment_1_0_1 )? )
            // InternalFeatureLangParser.g:1192:2: ( rule__ChangeStatement__NegationAssignment_1_0_1 )?
            {
             before(grammarAccess.getChangeStatementAccess().getNegationAssignment_1_0_1()); 
            // InternalFeatureLangParser.g:1193:2: ( rule__ChangeStatement__NegationAssignment_1_0_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Not) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalFeatureLangParser.g:1193:3: rule__ChangeStatement__NegationAssignment_1_0_1
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
    // InternalFeatureLangParser.g:1201:1: rule__ChangeStatement__Group_1_0__2 : rule__ChangeStatement__Group_1_0__2__Impl ;
    public final void rule__ChangeStatement__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1205:1: ( rule__ChangeStatement__Group_1_0__2__Impl )
            // InternalFeatureLangParser.g:1206:2: rule__ChangeStatement__Group_1_0__2__Impl
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
    // InternalFeatureLangParser.g:1212:1: rule__ChangeStatement__Group_1_0__2__Impl : ( ( rule__ChangeStatement__Alternatives_1_0_2 ) ) ;
    public final void rule__ChangeStatement__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1216:1: ( ( ( rule__ChangeStatement__Alternatives_1_0_2 ) ) )
            // InternalFeatureLangParser.g:1217:1: ( ( rule__ChangeStatement__Alternatives_1_0_2 ) )
            {
            // InternalFeatureLangParser.g:1217:1: ( ( rule__ChangeStatement__Alternatives_1_0_2 ) )
            // InternalFeatureLangParser.g:1218:2: ( rule__ChangeStatement__Alternatives_1_0_2 )
            {
             before(grammarAccess.getChangeStatementAccess().getAlternatives_1_0_2()); 
            // InternalFeatureLangParser.g:1219:2: ( rule__ChangeStatement__Alternatives_1_0_2 )
            // InternalFeatureLangParser.g:1219:3: rule__ChangeStatement__Alternatives_1_0_2
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
    // InternalFeatureLangParser.g:1228:1: rule__ChangeStatement__Group_1_0_2_1__0 : rule__ChangeStatement__Group_1_0_2_1__0__Impl rule__ChangeStatement__Group_1_0_2_1__1 ;
    public final void rule__ChangeStatement__Group_1_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1232:1: ( rule__ChangeStatement__Group_1_0_2_1__0__Impl rule__ChangeStatement__Group_1_0_2_1__1 )
            // InternalFeatureLangParser.g:1233:2: rule__ChangeStatement__Group_1_0_2_1__0__Impl rule__ChangeStatement__Group_1_0_2_1__1
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
    // InternalFeatureLangParser.g:1240:1: rule__ChangeStatement__Group_1_0_2_1__0__Impl : ( Have ) ;
    public final void rule__ChangeStatement__Group_1_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1244:1: ( ( Have ) )
            // InternalFeatureLangParser.g:1245:1: ( Have )
            {
            // InternalFeatureLangParser.g:1245:1: ( Have )
            // InternalFeatureLangParser.g:1246:2: Have
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
    // InternalFeatureLangParser.g:1255:1: rule__ChangeStatement__Group_1_0_2_1__1 : rule__ChangeStatement__Group_1_0_2_1__1__Impl rule__ChangeStatement__Group_1_0_2_1__2 ;
    public final void rule__ChangeStatement__Group_1_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1259:1: ( rule__ChangeStatement__Group_1_0_2_1__1__Impl rule__ChangeStatement__Group_1_0_2_1__2 )
            // InternalFeatureLangParser.g:1260:2: rule__ChangeStatement__Group_1_0_2_1__1__Impl rule__ChangeStatement__Group_1_0_2_1__2
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
    // InternalFeatureLangParser.g:1267:1: rule__ChangeStatement__Group_1_0_2_1__1__Impl : ( ( rule__ChangeStatement__Alternatives_1_0_2_1_1 )? ) ;
    public final void rule__ChangeStatement__Group_1_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1271:1: ( ( ( rule__ChangeStatement__Alternatives_1_0_2_1_1 )? ) )
            // InternalFeatureLangParser.g:1272:1: ( ( rule__ChangeStatement__Alternatives_1_0_2_1_1 )? )
            {
            // InternalFeatureLangParser.g:1272:1: ( ( rule__ChangeStatement__Alternatives_1_0_2_1_1 )? )
            // InternalFeatureLangParser.g:1273:2: ( rule__ChangeStatement__Alternatives_1_0_2_1_1 )?
            {
             before(grammarAccess.getChangeStatementAccess().getAlternatives_1_0_2_1_1()); 
            // InternalFeatureLangParser.g:1274:2: ( rule__ChangeStatement__Alternatives_1_0_2_1_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==An||LA19_0==A) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalFeatureLangParser.g:1274:3: rule__ChangeStatement__Alternatives_1_0_2_1_1
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
    // InternalFeatureLangParser.g:1282:1: rule__ChangeStatement__Group_1_0_2_1__2 : rule__ChangeStatement__Group_1_0_2_1__2__Impl ;
    public final void rule__ChangeStatement__Group_1_0_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1286:1: ( rule__ChangeStatement__Group_1_0_2_1__2__Impl )
            // InternalFeatureLangParser.g:1287:2: rule__ChangeStatement__Group_1_0_2_1__2__Impl
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
    // InternalFeatureLangParser.g:1293:1: rule__ChangeStatement__Group_1_0_2_1__2__Impl : ( ( rule__ChangeStatement__IdentifierAssignment_1_0_2_1_2 ) ) ;
    public final void rule__ChangeStatement__Group_1_0_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1297:1: ( ( ( rule__ChangeStatement__IdentifierAssignment_1_0_2_1_2 ) ) )
            // InternalFeatureLangParser.g:1298:1: ( ( rule__ChangeStatement__IdentifierAssignment_1_0_2_1_2 ) )
            {
            // InternalFeatureLangParser.g:1298:1: ( ( rule__ChangeStatement__IdentifierAssignment_1_0_2_1_2 ) )
            // InternalFeatureLangParser.g:1299:2: ( rule__ChangeStatement__IdentifierAssignment_1_0_2_1_2 )
            {
             before(grammarAccess.getChangeStatementAccess().getIdentifierAssignment_1_0_2_1_2()); 
            // InternalFeatureLangParser.g:1300:2: ( rule__ChangeStatement__IdentifierAssignment_1_0_2_1_2 )
            // InternalFeatureLangParser.g:1300:3: rule__ChangeStatement__IdentifierAssignment_1_0_2_1_2
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
    // InternalFeatureLangParser.g:1309:1: rule__CreationStatement__Group__0 : rule__CreationStatement__Group__0__Impl rule__CreationStatement__Group__1 ;
    public final void rule__CreationStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1313:1: ( rule__CreationStatement__Group__0__Impl rule__CreationStatement__Group__1 )
            // InternalFeatureLangParser.g:1314:2: rule__CreationStatement__Group__0__Impl rule__CreationStatement__Group__1
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
    // InternalFeatureLangParser.g:1321:1: rule__CreationStatement__Group__0__Impl : ( ( rule__CreationStatement__ClassElementAssignment_0 ) ) ;
    public final void rule__CreationStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1325:1: ( ( ( rule__CreationStatement__ClassElementAssignment_0 ) ) )
            // InternalFeatureLangParser.g:1326:1: ( ( rule__CreationStatement__ClassElementAssignment_0 ) )
            {
            // InternalFeatureLangParser.g:1326:1: ( ( rule__CreationStatement__ClassElementAssignment_0 ) )
            // InternalFeatureLangParser.g:1327:2: ( rule__CreationStatement__ClassElementAssignment_0 )
            {
             before(grammarAccess.getCreationStatementAccess().getClassElementAssignment_0()); 
            // InternalFeatureLangParser.g:1328:2: ( rule__CreationStatement__ClassElementAssignment_0 )
            // InternalFeatureLangParser.g:1328:3: rule__CreationStatement__ClassElementAssignment_0
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
    // InternalFeatureLangParser.g:1336:1: rule__CreationStatement__Group__1 : rule__CreationStatement__Group__1__Impl rule__CreationStatement__Group__2 ;
    public final void rule__CreationStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1340:1: ( rule__CreationStatement__Group__1__Impl rule__CreationStatement__Group__2 )
            // InternalFeatureLangParser.g:1341:2: rule__CreationStatement__Group__1__Impl rule__CreationStatement__Group__2
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
    // InternalFeatureLangParser.g:1348:1: rule__CreationStatement__Group__1__Impl : ( ( rule__CreationStatement__PriorityAssignment_1 ) ) ;
    public final void rule__CreationStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1352:1: ( ( ( rule__CreationStatement__PriorityAssignment_1 ) ) )
            // InternalFeatureLangParser.g:1353:1: ( ( rule__CreationStatement__PriorityAssignment_1 ) )
            {
            // InternalFeatureLangParser.g:1353:1: ( ( rule__CreationStatement__PriorityAssignment_1 ) )
            // InternalFeatureLangParser.g:1354:2: ( rule__CreationStatement__PriorityAssignment_1 )
            {
             before(grammarAccess.getCreationStatementAccess().getPriorityAssignment_1()); 
            // InternalFeatureLangParser.g:1355:2: ( rule__CreationStatement__PriorityAssignment_1 )
            // InternalFeatureLangParser.g:1355:3: rule__CreationStatement__PriorityAssignment_1
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
    // InternalFeatureLangParser.g:1363:1: rule__CreationStatement__Group__2 : rule__CreationStatement__Group__2__Impl rule__CreationStatement__Group__3 ;
    public final void rule__CreationStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1367:1: ( rule__CreationStatement__Group__2__Impl rule__CreationStatement__Group__3 )
            // InternalFeatureLangParser.g:1368:2: rule__CreationStatement__Group__2__Impl rule__CreationStatement__Group__3
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
    // InternalFeatureLangParser.g:1375:1: rule__CreationStatement__Group__2__Impl : ( ( rule__CreationStatement__NegationAssignment_2 )? ) ;
    public final void rule__CreationStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1379:1: ( ( ( rule__CreationStatement__NegationAssignment_2 )? ) )
            // InternalFeatureLangParser.g:1380:1: ( ( rule__CreationStatement__NegationAssignment_2 )? )
            {
            // InternalFeatureLangParser.g:1380:1: ( ( rule__CreationStatement__NegationAssignment_2 )? )
            // InternalFeatureLangParser.g:1381:2: ( rule__CreationStatement__NegationAssignment_2 )?
            {
             before(grammarAccess.getCreationStatementAccess().getNegationAssignment_2()); 
            // InternalFeatureLangParser.g:1382:2: ( rule__CreationStatement__NegationAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Not) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalFeatureLangParser.g:1382:3: rule__CreationStatement__NegationAssignment_2
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
    // InternalFeatureLangParser.g:1390:1: rule__CreationStatement__Group__3 : rule__CreationStatement__Group__3__Impl ;
    public final void rule__CreationStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1394:1: ( rule__CreationStatement__Group__3__Impl )
            // InternalFeatureLangParser.g:1395:2: rule__CreationStatement__Group__3__Impl
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
    // InternalFeatureLangParser.g:1401:1: rule__CreationStatement__Group__3__Impl : ( ( rule__CreationStatement__Alternatives_3 ) ) ;
    public final void rule__CreationStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1405:1: ( ( ( rule__CreationStatement__Alternatives_3 ) ) )
            // InternalFeatureLangParser.g:1406:1: ( ( rule__CreationStatement__Alternatives_3 ) )
            {
            // InternalFeatureLangParser.g:1406:1: ( ( rule__CreationStatement__Alternatives_3 ) )
            // InternalFeatureLangParser.g:1407:2: ( rule__CreationStatement__Alternatives_3 )
            {
             before(grammarAccess.getCreationStatementAccess().getAlternatives_3()); 
            // InternalFeatureLangParser.g:1408:2: ( rule__CreationStatement__Alternatives_3 )
            // InternalFeatureLangParser.g:1408:3: rule__CreationStatement__Alternatives_3
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
    // InternalFeatureLangParser.g:1417:1: rule__UpdateAction__Group__0 : rule__UpdateAction__Group__0__Impl rule__UpdateAction__Group__1 ;
    public final void rule__UpdateAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1421:1: ( rule__UpdateAction__Group__0__Impl rule__UpdateAction__Group__1 )
            // InternalFeatureLangParser.g:1422:2: rule__UpdateAction__Group__0__Impl rule__UpdateAction__Group__1
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
    // InternalFeatureLangParser.g:1429:1: rule__UpdateAction__Group__0__Impl : ( Has ) ;
    public final void rule__UpdateAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1433:1: ( ( Has ) )
            // InternalFeatureLangParser.g:1434:1: ( Has )
            {
            // InternalFeatureLangParser.g:1434:1: ( Has )
            // InternalFeatureLangParser.g:1435:2: Has
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
    // InternalFeatureLangParser.g:1444:1: rule__UpdateAction__Group__1 : rule__UpdateAction__Group__1__Impl rule__UpdateAction__Group__2 ;
    public final void rule__UpdateAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1448:1: ( rule__UpdateAction__Group__1__Impl rule__UpdateAction__Group__2 )
            // InternalFeatureLangParser.g:1449:2: rule__UpdateAction__Group__1__Impl rule__UpdateAction__Group__2
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
    // InternalFeatureLangParser.g:1456:1: rule__UpdateAction__Group__1__Impl : ( ( rule__UpdateAction__Alternatives_1 ) ) ;
    public final void rule__UpdateAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1460:1: ( ( ( rule__UpdateAction__Alternatives_1 ) ) )
            // InternalFeatureLangParser.g:1461:1: ( ( rule__UpdateAction__Alternatives_1 ) )
            {
            // InternalFeatureLangParser.g:1461:1: ( ( rule__UpdateAction__Alternatives_1 ) )
            // InternalFeatureLangParser.g:1462:2: ( rule__UpdateAction__Alternatives_1 )
            {
             before(grammarAccess.getUpdateActionAccess().getAlternatives_1()); 
            // InternalFeatureLangParser.g:1463:2: ( rule__UpdateAction__Alternatives_1 )
            // InternalFeatureLangParser.g:1463:3: rule__UpdateAction__Alternatives_1
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
    // InternalFeatureLangParser.g:1471:1: rule__UpdateAction__Group__2 : rule__UpdateAction__Group__2__Impl rule__UpdateAction__Group__3 ;
    public final void rule__UpdateAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1475:1: ( rule__UpdateAction__Group__2__Impl rule__UpdateAction__Group__3 )
            // InternalFeatureLangParser.g:1476:2: rule__UpdateAction__Group__2__Impl rule__UpdateAction__Group__3
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
    // InternalFeatureLangParser.g:1483:1: rule__UpdateAction__Group__2__Impl : ( ( Existing )? ) ;
    public final void rule__UpdateAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1487:1: ( ( ( Existing )? ) )
            // InternalFeatureLangParser.g:1488:1: ( ( Existing )? )
            {
            // InternalFeatureLangParser.g:1488:1: ( ( Existing )? )
            // InternalFeatureLangParser.g:1489:2: ( Existing )?
            {
             before(grammarAccess.getUpdateActionAccess().getExistingKeyword_2()); 
            // InternalFeatureLangParser.g:1490:2: ( Existing )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Existing) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalFeatureLangParser.g:1490:3: Existing
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
    // InternalFeatureLangParser.g:1498:1: rule__UpdateAction__Group__3 : rule__UpdateAction__Group__3__Impl rule__UpdateAction__Group__4 ;
    public final void rule__UpdateAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1502:1: ( rule__UpdateAction__Group__3__Impl rule__UpdateAction__Group__4 )
            // InternalFeatureLangParser.g:1503:2: rule__UpdateAction__Group__3__Impl rule__UpdateAction__Group__4
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
    // InternalFeatureLangParser.g:1510:1: rule__UpdateAction__Group__3__Impl : ( ( rule__UpdateAction__AttributeAssignment_3 ) ) ;
    public final void rule__UpdateAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1514:1: ( ( ( rule__UpdateAction__AttributeAssignment_3 ) ) )
            // InternalFeatureLangParser.g:1515:1: ( ( rule__UpdateAction__AttributeAssignment_3 ) )
            {
            // InternalFeatureLangParser.g:1515:1: ( ( rule__UpdateAction__AttributeAssignment_3 ) )
            // InternalFeatureLangParser.g:1516:2: ( rule__UpdateAction__AttributeAssignment_3 )
            {
             before(grammarAccess.getUpdateActionAccess().getAttributeAssignment_3()); 
            // InternalFeatureLangParser.g:1517:2: ( rule__UpdateAction__AttributeAssignment_3 )
            // InternalFeatureLangParser.g:1517:3: rule__UpdateAction__AttributeAssignment_3
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
    // InternalFeatureLangParser.g:1525:1: rule__UpdateAction__Group__4 : rule__UpdateAction__Group__4__Impl rule__UpdateAction__Group__5 ;
    public final void rule__UpdateAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1529:1: ( rule__UpdateAction__Group__4__Impl rule__UpdateAction__Group__5 )
            // InternalFeatureLangParser.g:1530:2: rule__UpdateAction__Group__4__Impl rule__UpdateAction__Group__5
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
    // InternalFeatureLangParser.g:1537:1: rule__UpdateAction__Group__4__Impl : ( FullStop ) ;
    public final void rule__UpdateAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1541:1: ( ( FullStop ) )
            // InternalFeatureLangParser.g:1542:1: ( FullStop )
            {
            // InternalFeatureLangParser.g:1542:1: ( FullStop )
            // InternalFeatureLangParser.g:1543:2: FullStop
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
    // InternalFeatureLangParser.g:1552:1: rule__UpdateAction__Group__5 : rule__UpdateAction__Group__5__Impl rule__UpdateAction__Group__6 ;
    public final void rule__UpdateAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1556:1: ( rule__UpdateAction__Group__5__Impl rule__UpdateAction__Group__6 )
            // InternalFeatureLangParser.g:1557:2: rule__UpdateAction__Group__5__Impl rule__UpdateAction__Group__6
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
    // InternalFeatureLangParser.g:1564:1: rule__UpdateAction__Group__5__Impl : ( It ) ;
    public final void rule__UpdateAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1568:1: ( ( It ) )
            // InternalFeatureLangParser.g:1569:1: ( It )
            {
            // InternalFeatureLangParser.g:1569:1: ( It )
            // InternalFeatureLangParser.g:1570:2: It
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
    // InternalFeatureLangParser.g:1579:1: rule__UpdateAction__Group__6 : rule__UpdateAction__Group__6__Impl rule__UpdateAction__Group__7 ;
    public final void rule__UpdateAction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1583:1: ( rule__UpdateAction__Group__6__Impl rule__UpdateAction__Group__7 )
            // InternalFeatureLangParser.g:1584:2: rule__UpdateAction__Group__6__Impl rule__UpdateAction__Group__7
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
    // InternalFeatureLangParser.g:1591:1: rule__UpdateAction__Group__6__Impl : ( ( rule__UpdateAction__PriorityAssignment_6 ) ) ;
    public final void rule__UpdateAction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1595:1: ( ( ( rule__UpdateAction__PriorityAssignment_6 ) ) )
            // InternalFeatureLangParser.g:1596:1: ( ( rule__UpdateAction__PriorityAssignment_6 ) )
            {
            // InternalFeatureLangParser.g:1596:1: ( ( rule__UpdateAction__PriorityAssignment_6 ) )
            // InternalFeatureLangParser.g:1597:2: ( rule__UpdateAction__PriorityAssignment_6 )
            {
             before(grammarAccess.getUpdateActionAccess().getPriorityAssignment_6()); 
            // InternalFeatureLangParser.g:1598:2: ( rule__UpdateAction__PriorityAssignment_6 )
            // InternalFeatureLangParser.g:1598:3: rule__UpdateAction__PriorityAssignment_6
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
    // InternalFeatureLangParser.g:1606:1: rule__UpdateAction__Group__7 : rule__UpdateAction__Group__7__Impl ;
    public final void rule__UpdateAction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1610:1: ( rule__UpdateAction__Group__7__Impl )
            // InternalFeatureLangParser.g:1611:2: rule__UpdateAction__Group__7__Impl
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
    // InternalFeatureLangParser.g:1617:1: rule__UpdateAction__Group__7__Impl : ( ( rule__UpdateAction__Alternatives_7 ) ) ;
    public final void rule__UpdateAction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1621:1: ( ( ( rule__UpdateAction__Alternatives_7 ) ) )
            // InternalFeatureLangParser.g:1622:1: ( ( rule__UpdateAction__Alternatives_7 ) )
            {
            // InternalFeatureLangParser.g:1622:1: ( ( rule__UpdateAction__Alternatives_7 ) )
            // InternalFeatureLangParser.g:1623:2: ( rule__UpdateAction__Alternatives_7 )
            {
             before(grammarAccess.getUpdateActionAccess().getAlternatives_7()); 
            // InternalFeatureLangParser.g:1624:2: ( rule__UpdateAction__Alternatives_7 )
            // InternalFeatureLangParser.g:1624:3: rule__UpdateAction__Alternatives_7
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
    // InternalFeatureLangParser.g:1633:1: rule__UpdateAttributeDatatype__Group__0 : rule__UpdateAttributeDatatype__Group__0__Impl rule__UpdateAttributeDatatype__Group__1 ;
    public final void rule__UpdateAttributeDatatype__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1637:1: ( rule__UpdateAttributeDatatype__Group__0__Impl rule__UpdateAttributeDatatype__Group__1 )
            // InternalFeatureLangParser.g:1638:2: rule__UpdateAttributeDatatype__Group__0__Impl rule__UpdateAttributeDatatype__Group__1
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
    // InternalFeatureLangParser.g:1645:1: rule__UpdateAttributeDatatype__Group__0__Impl : ( Be ) ;
    public final void rule__UpdateAttributeDatatype__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1649:1: ( ( Be ) )
            // InternalFeatureLangParser.g:1650:1: ( Be )
            {
            // InternalFeatureLangParser.g:1650:1: ( Be )
            // InternalFeatureLangParser.g:1651:2: Be
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
    // InternalFeatureLangParser.g:1660:1: rule__UpdateAttributeDatatype__Group__1 : rule__UpdateAttributeDatatype__Group__1__Impl rule__UpdateAttributeDatatype__Group__2 ;
    public final void rule__UpdateAttributeDatatype__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1664:1: ( rule__UpdateAttributeDatatype__Group__1__Impl rule__UpdateAttributeDatatype__Group__2 )
            // InternalFeatureLangParser.g:1665:2: rule__UpdateAttributeDatatype__Group__1__Impl rule__UpdateAttributeDatatype__Group__2
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
    // InternalFeatureLangParser.g:1672:1: rule__UpdateAttributeDatatype__Group__1__Impl : ( A ) ;
    public final void rule__UpdateAttributeDatatype__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1676:1: ( ( A ) )
            // InternalFeatureLangParser.g:1677:1: ( A )
            {
            // InternalFeatureLangParser.g:1677:1: ( A )
            // InternalFeatureLangParser.g:1678:2: A
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
    // InternalFeatureLangParser.g:1687:1: rule__UpdateAttributeDatatype__Group__2 : rule__UpdateAttributeDatatype__Group__2__Impl ;
    public final void rule__UpdateAttributeDatatype__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1691:1: ( rule__UpdateAttributeDatatype__Group__2__Impl )
            // InternalFeatureLangParser.g:1692:2: rule__UpdateAttributeDatatype__Group__2__Impl
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
    // InternalFeatureLangParser.g:1698:1: rule__UpdateAttributeDatatype__Group__2__Impl : ( ( rule__UpdateAttributeDatatype__TypeAssignment_2 ) ) ;
    public final void rule__UpdateAttributeDatatype__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1702:1: ( ( ( rule__UpdateAttributeDatatype__TypeAssignment_2 ) ) )
            // InternalFeatureLangParser.g:1703:1: ( ( rule__UpdateAttributeDatatype__TypeAssignment_2 ) )
            {
            // InternalFeatureLangParser.g:1703:1: ( ( rule__UpdateAttributeDatatype__TypeAssignment_2 ) )
            // InternalFeatureLangParser.g:1704:2: ( rule__UpdateAttributeDatatype__TypeAssignment_2 )
            {
             before(grammarAccess.getUpdateAttributeDatatypeAccess().getTypeAssignment_2()); 
            // InternalFeatureLangParser.g:1705:2: ( rule__UpdateAttributeDatatype__TypeAssignment_2 )
            // InternalFeatureLangParser.g:1705:3: rule__UpdateAttributeDatatype__TypeAssignment_2
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
    // InternalFeatureLangParser.g:1714:1: rule__UpdateAttributeIdentifier__Group__0 : rule__UpdateAttributeIdentifier__Group__0__Impl rule__UpdateAttributeIdentifier__Group__1 ;
    public final void rule__UpdateAttributeIdentifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1718:1: ( rule__UpdateAttributeIdentifier__Group__0__Impl rule__UpdateAttributeIdentifier__Group__1 )
            // InternalFeatureLangParser.g:1719:2: rule__UpdateAttributeIdentifier__Group__0__Impl rule__UpdateAttributeIdentifier__Group__1
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
    // InternalFeatureLangParser.g:1726:1: rule__UpdateAttributeIdentifier__Group__0__Impl : ( Have ) ;
    public final void rule__UpdateAttributeIdentifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1730:1: ( ( Have ) )
            // InternalFeatureLangParser.g:1731:1: ( Have )
            {
            // InternalFeatureLangParser.g:1731:1: ( Have )
            // InternalFeatureLangParser.g:1732:2: Have
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
    // InternalFeatureLangParser.g:1741:1: rule__UpdateAttributeIdentifier__Group__1 : rule__UpdateAttributeIdentifier__Group__1__Impl rule__UpdateAttributeIdentifier__Group__2 ;
    public final void rule__UpdateAttributeIdentifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1745:1: ( rule__UpdateAttributeIdentifier__Group__1__Impl rule__UpdateAttributeIdentifier__Group__2 )
            // InternalFeatureLangParser.g:1746:2: rule__UpdateAttributeIdentifier__Group__1__Impl rule__UpdateAttributeIdentifier__Group__2
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
    // InternalFeatureLangParser.g:1753:1: rule__UpdateAttributeIdentifier__Group__1__Impl : ( ( rule__UpdateAttributeIdentifier__Alternatives_1 )? ) ;
    public final void rule__UpdateAttributeIdentifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1757:1: ( ( ( rule__UpdateAttributeIdentifier__Alternatives_1 )? ) )
            // InternalFeatureLangParser.g:1758:1: ( ( rule__UpdateAttributeIdentifier__Alternatives_1 )? )
            {
            // InternalFeatureLangParser.g:1758:1: ( ( rule__UpdateAttributeIdentifier__Alternatives_1 )? )
            // InternalFeatureLangParser.g:1759:2: ( rule__UpdateAttributeIdentifier__Alternatives_1 )?
            {
             before(grammarAccess.getUpdateAttributeIdentifierAccess().getAlternatives_1()); 
            // InternalFeatureLangParser.g:1760:2: ( rule__UpdateAttributeIdentifier__Alternatives_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==An||LA22_0==A) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalFeatureLangParser.g:1760:3: rule__UpdateAttributeIdentifier__Alternatives_1
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
    // InternalFeatureLangParser.g:1768:1: rule__UpdateAttributeIdentifier__Group__2 : rule__UpdateAttributeIdentifier__Group__2__Impl ;
    public final void rule__UpdateAttributeIdentifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1772:1: ( rule__UpdateAttributeIdentifier__Group__2__Impl )
            // InternalFeatureLangParser.g:1773:2: rule__UpdateAttributeIdentifier__Group__2__Impl
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
    // InternalFeatureLangParser.g:1779:1: rule__UpdateAttributeIdentifier__Group__2__Impl : ( ( rule__UpdateAttributeIdentifier__IdentifierAssignment_2 ) ) ;
    public final void rule__UpdateAttributeIdentifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1783:1: ( ( ( rule__UpdateAttributeIdentifier__IdentifierAssignment_2 ) ) )
            // InternalFeatureLangParser.g:1784:1: ( ( rule__UpdateAttributeIdentifier__IdentifierAssignment_2 ) )
            {
            // InternalFeatureLangParser.g:1784:1: ( ( rule__UpdateAttributeIdentifier__IdentifierAssignment_2 ) )
            // InternalFeatureLangParser.g:1785:2: ( rule__UpdateAttributeIdentifier__IdentifierAssignment_2 )
            {
             before(grammarAccess.getUpdateAttributeIdentifierAccess().getIdentifierAssignment_2()); 
            // InternalFeatureLangParser.g:1786:2: ( rule__UpdateAttributeIdentifier__IdentifierAssignment_2 )
            // InternalFeatureLangParser.g:1786:3: rule__UpdateAttributeIdentifier__IdentifierAssignment_2
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
    // InternalFeatureLangParser.g:1795:1: rule__UpdateAttributeValue__Group__0 : rule__UpdateAttributeValue__Group__0__Impl rule__UpdateAttributeValue__Group__1 ;
    public final void rule__UpdateAttributeValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1799:1: ( rule__UpdateAttributeValue__Group__0__Impl rule__UpdateAttributeValue__Group__1 )
            // InternalFeatureLangParser.g:1800:2: rule__UpdateAttributeValue__Group__0__Impl rule__UpdateAttributeValue__Group__1
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
    // InternalFeatureLangParser.g:1807:1: rule__UpdateAttributeValue__Group__0__Impl : ( Have ) ;
    public final void rule__UpdateAttributeValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1811:1: ( ( Have ) )
            // InternalFeatureLangParser.g:1812:1: ( Have )
            {
            // InternalFeatureLangParser.g:1812:1: ( Have )
            // InternalFeatureLangParser.g:1813:2: Have
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
    // InternalFeatureLangParser.g:1822:1: rule__UpdateAttributeValue__Group__1 : rule__UpdateAttributeValue__Group__1__Impl rule__UpdateAttributeValue__Group__2 ;
    public final void rule__UpdateAttributeValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1826:1: ( rule__UpdateAttributeValue__Group__1__Impl rule__UpdateAttributeValue__Group__2 )
            // InternalFeatureLangParser.g:1827:2: rule__UpdateAttributeValue__Group__1__Impl rule__UpdateAttributeValue__Group__2
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
    // InternalFeatureLangParser.g:1834:1: rule__UpdateAttributeValue__Group__1__Impl : ( ( A )? ) ;
    public final void rule__UpdateAttributeValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1838:1: ( ( ( A )? ) )
            // InternalFeatureLangParser.g:1839:1: ( ( A )? )
            {
            // InternalFeatureLangParser.g:1839:1: ( ( A )? )
            // InternalFeatureLangParser.g:1840:2: ( A )?
            {
             before(grammarAccess.getUpdateAttributeValueAccess().getAKeyword_1()); 
            // InternalFeatureLangParser.g:1841:2: ( A )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==A) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalFeatureLangParser.g:1841:3: A
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
    // InternalFeatureLangParser.g:1849:1: rule__UpdateAttributeValue__Group__2 : rule__UpdateAttributeValue__Group__2__Impl rule__UpdateAttributeValue__Group__3 ;
    public final void rule__UpdateAttributeValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1853:1: ( rule__UpdateAttributeValue__Group__2__Impl rule__UpdateAttributeValue__Group__3 )
            // InternalFeatureLangParser.g:1854:2: rule__UpdateAttributeValue__Group__2__Impl rule__UpdateAttributeValue__Group__3
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
    // InternalFeatureLangParser.g:1861:1: rule__UpdateAttributeValue__Group__2__Impl : ( Value ) ;
    public final void rule__UpdateAttributeValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1865:1: ( ( Value ) )
            // InternalFeatureLangParser.g:1866:1: ( Value )
            {
            // InternalFeatureLangParser.g:1866:1: ( Value )
            // InternalFeatureLangParser.g:1867:2: Value
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
    // InternalFeatureLangParser.g:1876:1: rule__UpdateAttributeValue__Group__3 : rule__UpdateAttributeValue__Group__3__Impl ;
    public final void rule__UpdateAttributeValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1880:1: ( rule__UpdateAttributeValue__Group__3__Impl )
            // InternalFeatureLangParser.g:1881:2: rule__UpdateAttributeValue__Group__3__Impl
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
    // InternalFeatureLangParser.g:1887:1: rule__UpdateAttributeValue__Group__3__Impl : ( ( rule__UpdateAttributeValue__ValueAssignment_3 ) ) ;
    public final void rule__UpdateAttributeValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1891:1: ( ( ( rule__UpdateAttributeValue__ValueAssignment_3 ) ) )
            // InternalFeatureLangParser.g:1892:1: ( ( rule__UpdateAttributeValue__ValueAssignment_3 ) )
            {
            // InternalFeatureLangParser.g:1892:1: ( ( rule__UpdateAttributeValue__ValueAssignment_3 ) )
            // InternalFeatureLangParser.g:1893:2: ( rule__UpdateAttributeValue__ValueAssignment_3 )
            {
             before(grammarAccess.getUpdateAttributeValueAccess().getValueAssignment_3()); 
            // InternalFeatureLangParser.g:1894:2: ( rule__UpdateAttributeValue__ValueAssignment_3 )
            // InternalFeatureLangParser.g:1894:3: rule__UpdateAttributeValue__ValueAssignment_3
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
    // InternalFeatureLangParser.g:1903:1: rule__AttributeAction__Group__0 : rule__AttributeAction__Group__0__Impl rule__AttributeAction__Group__1 ;
    public final void rule__AttributeAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1907:1: ( rule__AttributeAction__Group__0__Impl rule__AttributeAction__Group__1 )
            // InternalFeatureLangParser.g:1908:2: rule__AttributeAction__Group__0__Impl rule__AttributeAction__Group__1
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
    // InternalFeatureLangParser.g:1915:1: rule__AttributeAction__Group__0__Impl : ( Have ) ;
    public final void rule__AttributeAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1919:1: ( ( Have ) )
            // InternalFeatureLangParser.g:1920:1: ( Have )
            {
            // InternalFeatureLangParser.g:1920:1: ( Have )
            // InternalFeatureLangParser.g:1921:2: Have
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
    // InternalFeatureLangParser.g:1930:1: rule__AttributeAction__Group__1 : rule__AttributeAction__Group__1__Impl rule__AttributeAction__Group__2 ;
    public final void rule__AttributeAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1934:1: ( rule__AttributeAction__Group__1__Impl rule__AttributeAction__Group__2 )
            // InternalFeatureLangParser.g:1935:2: rule__AttributeAction__Group__1__Impl rule__AttributeAction__Group__2
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
    // InternalFeatureLangParser.g:1942:1: rule__AttributeAction__Group__1__Impl : ( ( rule__AttributeAction__Alternatives_1 ) ) ;
    public final void rule__AttributeAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1946:1: ( ( ( rule__AttributeAction__Alternatives_1 ) ) )
            // InternalFeatureLangParser.g:1947:1: ( ( rule__AttributeAction__Alternatives_1 ) )
            {
            // InternalFeatureLangParser.g:1947:1: ( ( rule__AttributeAction__Alternatives_1 ) )
            // InternalFeatureLangParser.g:1948:2: ( rule__AttributeAction__Alternatives_1 )
            {
             before(grammarAccess.getAttributeActionAccess().getAlternatives_1()); 
            // InternalFeatureLangParser.g:1949:2: ( rule__AttributeAction__Alternatives_1 )
            // InternalFeatureLangParser.g:1949:3: rule__AttributeAction__Alternatives_1
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
    // InternalFeatureLangParser.g:1957:1: rule__AttributeAction__Group__2 : rule__AttributeAction__Group__2__Impl rule__AttributeAction__Group__3 ;
    public final void rule__AttributeAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1961:1: ( rule__AttributeAction__Group__2__Impl rule__AttributeAction__Group__3 )
            // InternalFeatureLangParser.g:1962:2: rule__AttributeAction__Group__2__Impl rule__AttributeAction__Group__3
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
    // InternalFeatureLangParser.g:1969:1: rule__AttributeAction__Group__2__Impl : ( ( rule__AttributeAction__AttributeAssignment_2 ) ) ;
    public final void rule__AttributeAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1973:1: ( ( ( rule__AttributeAction__AttributeAssignment_2 ) ) )
            // InternalFeatureLangParser.g:1974:1: ( ( rule__AttributeAction__AttributeAssignment_2 ) )
            {
            // InternalFeatureLangParser.g:1974:1: ( ( rule__AttributeAction__AttributeAssignment_2 ) )
            // InternalFeatureLangParser.g:1975:2: ( rule__AttributeAction__AttributeAssignment_2 )
            {
             before(grammarAccess.getAttributeActionAccess().getAttributeAssignment_2()); 
            // InternalFeatureLangParser.g:1976:2: ( rule__AttributeAction__AttributeAssignment_2 )
            // InternalFeatureLangParser.g:1976:3: rule__AttributeAction__AttributeAssignment_2
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
    // InternalFeatureLangParser.g:1984:1: rule__AttributeAction__Group__3 : rule__AttributeAction__Group__3__Impl rule__AttributeAction__Group__4 ;
    public final void rule__AttributeAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1988:1: ( rule__AttributeAction__Group__3__Impl rule__AttributeAction__Group__4 )
            // InternalFeatureLangParser.g:1989:2: rule__AttributeAction__Group__3__Impl rule__AttributeAction__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalFeatureLangParser.g:1996:1: rule__AttributeAction__Group__3__Impl : ( FullStop ) ;
    public final void rule__AttributeAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2000:1: ( ( FullStop ) )
            // InternalFeatureLangParser.g:2001:1: ( FullStop )
            {
            // InternalFeatureLangParser.g:2001:1: ( FullStop )
            // InternalFeatureLangParser.g:2002:2: FullStop
            {
             before(grammarAccess.getAttributeActionAccess().getFullStopKeyword_3()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getAttributeActionAccess().getFullStopKeyword_3()); 

            }


            }

        }
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
    // InternalFeatureLangParser.g:2011:1: rule__AttributeAction__Group__4 : rule__AttributeAction__Group__4__Impl ;
    public final void rule__AttributeAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2015:1: ( rule__AttributeAction__Group__4__Impl )
            // InternalFeatureLangParser.g:2016:2: rule__AttributeAction__Group__4__Impl
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
    // InternalFeatureLangParser.g:2022:1: rule__AttributeAction__Group__4__Impl : ( ( rule__AttributeAction__Group_4__0 )? ) ;
    public final void rule__AttributeAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2026:1: ( ( ( rule__AttributeAction__Group_4__0 )? ) )
            // InternalFeatureLangParser.g:2027:1: ( ( rule__AttributeAction__Group_4__0 )? )
            {
            // InternalFeatureLangParser.g:2027:1: ( ( rule__AttributeAction__Group_4__0 )? )
            // InternalFeatureLangParser.g:2028:2: ( rule__AttributeAction__Group_4__0 )?
            {
             before(grammarAccess.getAttributeActionAccess().getGroup_4()); 
            // InternalFeatureLangParser.g:2029:2: ( rule__AttributeAction__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==It) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalFeatureLangParser.g:2029:3: rule__AttributeAction__Group_4__0
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


    // $ANTLR start "rule__AttributeAction__Group_4__0"
    // InternalFeatureLangParser.g:2038:1: rule__AttributeAction__Group_4__0 : rule__AttributeAction__Group_4__0__Impl rule__AttributeAction__Group_4__1 ;
    public final void rule__AttributeAction__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2042:1: ( rule__AttributeAction__Group_4__0__Impl rule__AttributeAction__Group_4__1 )
            // InternalFeatureLangParser.g:2043:2: rule__AttributeAction__Group_4__0__Impl rule__AttributeAction__Group_4__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalFeatureLangParser.g:2050:1: rule__AttributeAction__Group_4__0__Impl : ( It ) ;
    public final void rule__AttributeAction__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2054:1: ( ( It ) )
            // InternalFeatureLangParser.g:2055:1: ( It )
            {
            // InternalFeatureLangParser.g:2055:1: ( It )
            // InternalFeatureLangParser.g:2056:2: It
            {
             before(grammarAccess.getAttributeActionAccess().getItKeyword_4_0()); 
            match(input,It,FOLLOW_2); 
             after(grammarAccess.getAttributeActionAccess().getItKeyword_4_0()); 

            }


            }

        }
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
    // InternalFeatureLangParser.g:2065:1: rule__AttributeAction__Group_4__1 : rule__AttributeAction__Group_4__1__Impl rule__AttributeAction__Group_4__2 ;
    public final void rule__AttributeAction__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2069:1: ( rule__AttributeAction__Group_4__1__Impl rule__AttributeAction__Group_4__2 )
            // InternalFeatureLangParser.g:2070:2: rule__AttributeAction__Group_4__1__Impl rule__AttributeAction__Group_4__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalFeatureLangParser.g:2077:1: rule__AttributeAction__Group_4__1__Impl : ( Is ) ;
    public final void rule__AttributeAction__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2081:1: ( ( Is ) )
            // InternalFeatureLangParser.g:2082:1: ( Is )
            {
            // InternalFeatureLangParser.g:2082:1: ( Is )
            // InternalFeatureLangParser.g:2083:2: Is
            {
             before(grammarAccess.getAttributeActionAccess().getIsKeyword_4_1()); 
            match(input,Is,FOLLOW_2); 
             after(grammarAccess.getAttributeActionAccess().getIsKeyword_4_1()); 

            }


            }

        }
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
    // InternalFeatureLangParser.g:2092:1: rule__AttributeAction__Group_4__2 : rule__AttributeAction__Group_4__2__Impl rule__AttributeAction__Group_4__3 ;
    public final void rule__AttributeAction__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2096:1: ( rule__AttributeAction__Group_4__2__Impl rule__AttributeAction__Group_4__3 )
            // InternalFeatureLangParser.g:2097:2: rule__AttributeAction__Group_4__2__Impl rule__AttributeAction__Group_4__3
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
    // InternalFeatureLangParser.g:2104:1: rule__AttributeAction__Group_4__2__Impl : ( A ) ;
    public final void rule__AttributeAction__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2108:1: ( ( A ) )
            // InternalFeatureLangParser.g:2109:1: ( A )
            {
            // InternalFeatureLangParser.g:2109:1: ( A )
            // InternalFeatureLangParser.g:2110:2: A
            {
             before(grammarAccess.getAttributeActionAccess().getAKeyword_4_2()); 
            match(input,A,FOLLOW_2); 
             after(grammarAccess.getAttributeActionAccess().getAKeyword_4_2()); 

            }


            }

        }
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
    // InternalFeatureLangParser.g:2119:1: rule__AttributeAction__Group_4__3 : rule__AttributeAction__Group_4__3__Impl ;
    public final void rule__AttributeAction__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2123:1: ( rule__AttributeAction__Group_4__3__Impl )
            // InternalFeatureLangParser.g:2124:2: rule__AttributeAction__Group_4__3__Impl
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
    // InternalFeatureLangParser.g:2130:1: rule__AttributeAction__Group_4__3__Impl : ( ( rule__AttributeAction__TypeAssignment_4_3 ) ) ;
    public final void rule__AttributeAction__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2134:1: ( ( ( rule__AttributeAction__TypeAssignment_4_3 ) ) )
            // InternalFeatureLangParser.g:2135:1: ( ( rule__AttributeAction__TypeAssignment_4_3 ) )
            {
            // InternalFeatureLangParser.g:2135:1: ( ( rule__AttributeAction__TypeAssignment_4_3 ) )
            // InternalFeatureLangParser.g:2136:2: ( rule__AttributeAction__TypeAssignment_4_3 )
            {
             before(grammarAccess.getAttributeActionAccess().getTypeAssignment_4_3()); 
            // InternalFeatureLangParser.g:2137:2: ( rule__AttributeAction__TypeAssignment_4_3 )
            // InternalFeatureLangParser.g:2137:3: rule__AttributeAction__TypeAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__AttributeAction__TypeAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeActionAccess().getTypeAssignment_4_3()); 

            }


            }

        }
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
    // InternalFeatureLangParser.g:2146:1: rule__AssociationAction__Group__0 : rule__AssociationAction__Group__0__Impl rule__AssociationAction__Group__1 ;
    public final void rule__AssociationAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2150:1: ( rule__AssociationAction__Group__0__Impl rule__AssociationAction__Group__1 )
            // InternalFeatureLangParser.g:2151:2: rule__AssociationAction__Group__0__Impl rule__AssociationAction__Group__1
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
    // InternalFeatureLangParser.g:2158:1: rule__AssociationAction__Group__0__Impl : ( Have ) ;
    public final void rule__AssociationAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2162:1: ( ( Have ) )
            // InternalFeatureLangParser.g:2163:1: ( Have )
            {
            // InternalFeatureLangParser.g:2163:1: ( Have )
            // InternalFeatureLangParser.g:2164:2: Have
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
    // InternalFeatureLangParser.g:2173:1: rule__AssociationAction__Group__1 : rule__AssociationAction__Group__1__Impl rule__AssociationAction__Group__2 ;
    public final void rule__AssociationAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2177:1: ( rule__AssociationAction__Group__1__Impl rule__AssociationAction__Group__2 )
            // InternalFeatureLangParser.g:2178:2: rule__AssociationAction__Group__1__Impl rule__AssociationAction__Group__2
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
    // InternalFeatureLangParser.g:2185:1: rule__AssociationAction__Group__1__Impl : ( Associations ) ;
    public final void rule__AssociationAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2189:1: ( ( Associations ) )
            // InternalFeatureLangParser.g:2190:1: ( Associations )
            {
            // InternalFeatureLangParser.g:2190:1: ( Associations )
            // InternalFeatureLangParser.g:2191:2: Associations
            {
             before(grammarAccess.getAssociationActionAccess().getAssociationsKeyword_1()); 
            match(input,Associations,FOLLOW_2); 
             after(grammarAccess.getAssociationActionAccess().getAssociationsKeyword_1()); 

            }


            }

        }
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
    // InternalFeatureLangParser.g:2200:1: rule__AssociationAction__Group__2 : rule__AssociationAction__Group__2__Impl rule__AssociationAction__Group__3 ;
    public final void rule__AssociationAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2204:1: ( rule__AssociationAction__Group__2__Impl rule__AssociationAction__Group__3 )
            // InternalFeatureLangParser.g:2205:2: rule__AssociationAction__Group__2__Impl rule__AssociationAction__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__AssociationAction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationAction__Group__3();

            state._fsp--;


            }

        }
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
    // InternalFeatureLangParser.g:2212:1: rule__AssociationAction__Group__2__Impl : ( To ) ;
    public final void rule__AssociationAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2216:1: ( ( To ) )
            // InternalFeatureLangParser.g:2217:1: ( To )
            {
            // InternalFeatureLangParser.g:2217:1: ( To )
            // InternalFeatureLangParser.g:2218:2: To
            {
             before(grammarAccess.getAssociationActionAccess().getToKeyword_2()); 
            match(input,To,FOLLOW_2); 
             after(grammarAccess.getAssociationActionAccess().getToKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__AssociationAction__Group__3"
    // InternalFeatureLangParser.g:2227:1: rule__AssociationAction__Group__3 : rule__AssociationAction__Group__3__Impl rule__AssociationAction__Group__4 ;
    public final void rule__AssociationAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2231:1: ( rule__AssociationAction__Group__3__Impl rule__AssociationAction__Group__4 )
            // InternalFeatureLangParser.g:2232:2: rule__AssociationAction__Group__3__Impl rule__AssociationAction__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__AssociationAction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationAction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationAction__Group__3"


    // $ANTLR start "rule__AssociationAction__Group__3__Impl"
    // InternalFeatureLangParser.g:2239:1: rule__AssociationAction__Group__3__Impl : ( ( Other )? ) ;
    public final void rule__AssociationAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2243:1: ( ( ( Other )? ) )
            // InternalFeatureLangParser.g:2244:1: ( ( Other )? )
            {
            // InternalFeatureLangParser.g:2244:1: ( ( Other )? )
            // InternalFeatureLangParser.g:2245:2: ( Other )?
            {
             before(grammarAccess.getAssociationActionAccess().getOtherKeyword_3()); 
            // InternalFeatureLangParser.g:2246:2: ( Other )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Other) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalFeatureLangParser.g:2246:3: Other
                    {
                    match(input,Other,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getAssociationActionAccess().getOtherKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationAction__Group__3__Impl"


    // $ANTLR start "rule__AssociationAction__Group__4"
    // InternalFeatureLangParser.g:2254:1: rule__AssociationAction__Group__4 : rule__AssociationAction__Group__4__Impl rule__AssociationAction__Group__5 ;
    public final void rule__AssociationAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2258:1: ( rule__AssociationAction__Group__4__Impl rule__AssociationAction__Group__5 )
            // InternalFeatureLangParser.g:2259:2: rule__AssociationAction__Group__4__Impl rule__AssociationAction__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__AssociationAction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationAction__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationAction__Group__4"


    // $ANTLR start "rule__AssociationAction__Group__4__Impl"
    // InternalFeatureLangParser.g:2266:1: rule__AssociationAction__Group__4__Impl : ( ( rule__AssociationAction__TargetAssignment_4 ) ) ;
    public final void rule__AssociationAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2270:1: ( ( ( rule__AssociationAction__TargetAssignment_4 ) ) )
            // InternalFeatureLangParser.g:2271:1: ( ( rule__AssociationAction__TargetAssignment_4 ) )
            {
            // InternalFeatureLangParser.g:2271:1: ( ( rule__AssociationAction__TargetAssignment_4 ) )
            // InternalFeatureLangParser.g:2272:2: ( rule__AssociationAction__TargetAssignment_4 )
            {
             before(grammarAccess.getAssociationActionAccess().getTargetAssignment_4()); 
            // InternalFeatureLangParser.g:2273:2: ( rule__AssociationAction__TargetAssignment_4 )
            // InternalFeatureLangParser.g:2273:3: rule__AssociationAction__TargetAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AssociationAction__TargetAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAssociationActionAccess().getTargetAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationAction__Group__4__Impl"


    // $ANTLR start "rule__AssociationAction__Group__5"
    // InternalFeatureLangParser.g:2281:1: rule__AssociationAction__Group__5 : rule__AssociationAction__Group__5__Impl rule__AssociationAction__Group__6 ;
    public final void rule__AssociationAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2285:1: ( rule__AssociationAction__Group__5__Impl rule__AssociationAction__Group__6 )
            // InternalFeatureLangParser.g:2286:2: rule__AssociationAction__Group__5__Impl rule__AssociationAction__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__AssociationAction__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationAction__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationAction__Group__5"


    // $ANTLR start "rule__AssociationAction__Group__5__Impl"
    // InternalFeatureLangParser.g:2293:1: rule__AssociationAction__Group__5__Impl : ( Called ) ;
    public final void rule__AssociationAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2297:1: ( ( Called ) )
            // InternalFeatureLangParser.g:2298:1: ( Called )
            {
            // InternalFeatureLangParser.g:2298:1: ( Called )
            // InternalFeatureLangParser.g:2299:2: Called
            {
             before(grammarAccess.getAssociationActionAccess().getCalledKeyword_5()); 
            match(input,Called,FOLLOW_2); 
             after(grammarAccess.getAssociationActionAccess().getCalledKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationAction__Group__5__Impl"


    // $ANTLR start "rule__AssociationAction__Group__6"
    // InternalFeatureLangParser.g:2308:1: rule__AssociationAction__Group__6 : rule__AssociationAction__Group__6__Impl ;
    public final void rule__AssociationAction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2312:1: ( rule__AssociationAction__Group__6__Impl )
            // InternalFeatureLangParser.g:2313:2: rule__AssociationAction__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociationAction__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationAction__Group__6"


    // $ANTLR start "rule__AssociationAction__Group__6__Impl"
    // InternalFeatureLangParser.g:2319:1: rule__AssociationAction__Group__6__Impl : ( ( rule__AssociationAction__RelationAssignment_6 ) ) ;
    public final void rule__AssociationAction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2323:1: ( ( ( rule__AssociationAction__RelationAssignment_6 ) ) )
            // InternalFeatureLangParser.g:2324:1: ( ( rule__AssociationAction__RelationAssignment_6 ) )
            {
            // InternalFeatureLangParser.g:2324:1: ( ( rule__AssociationAction__RelationAssignment_6 ) )
            // InternalFeatureLangParser.g:2325:2: ( rule__AssociationAction__RelationAssignment_6 )
            {
             before(grammarAccess.getAssociationActionAccess().getRelationAssignment_6()); 
            // InternalFeatureLangParser.g:2326:2: ( rule__AssociationAction__RelationAssignment_6 )
            // InternalFeatureLangParser.g:2326:3: rule__AssociationAction__RelationAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__AssociationAction__RelationAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAssociationActionAccess().getRelationAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationAction__Group__6__Impl"


    // $ANTLR start "rule__InheritanceAction__Group__0"
    // InternalFeatureLangParser.g:2335:1: rule__InheritanceAction__Group__0 : rule__InheritanceAction__Group__0__Impl rule__InheritanceAction__Group__1 ;
    public final void rule__InheritanceAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2339:1: ( rule__InheritanceAction__Group__0__Impl rule__InheritanceAction__Group__1 )
            // InternalFeatureLangParser.g:2340:2: rule__InheritanceAction__Group__0__Impl rule__InheritanceAction__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalFeatureLangParser.g:2347:1: rule__InheritanceAction__Group__0__Impl : ( Inherit ) ;
    public final void rule__InheritanceAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2351:1: ( ( Inherit ) )
            // InternalFeatureLangParser.g:2352:1: ( Inherit )
            {
            // InternalFeatureLangParser.g:2352:1: ( Inherit )
            // InternalFeatureLangParser.g:2353:2: Inherit
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
    // InternalFeatureLangParser.g:2362:1: rule__InheritanceAction__Group__1 : rule__InheritanceAction__Group__1__Impl rule__InheritanceAction__Group__2 ;
    public final void rule__InheritanceAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2366:1: ( rule__InheritanceAction__Group__1__Impl rule__InheritanceAction__Group__2 )
            // InternalFeatureLangParser.g:2367:2: rule__InheritanceAction__Group__1__Impl rule__InheritanceAction__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalFeatureLangParser.g:2374:1: rule__InheritanceAction__Group__1__Impl : ( From ) ;
    public final void rule__InheritanceAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2378:1: ( ( From ) )
            // InternalFeatureLangParser.g:2379:1: ( From )
            {
            // InternalFeatureLangParser.g:2379:1: ( From )
            // InternalFeatureLangParser.g:2380:2: From
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
    // InternalFeatureLangParser.g:2389:1: rule__InheritanceAction__Group__2 : rule__InheritanceAction__Group__2__Impl ;
    public final void rule__InheritanceAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2393:1: ( rule__InheritanceAction__Group__2__Impl )
            // InternalFeatureLangParser.g:2394:2: rule__InheritanceAction__Group__2__Impl
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
    // InternalFeatureLangParser.g:2400:1: rule__InheritanceAction__Group__2__Impl : ( ( rule__InheritanceAction__ParentAssignment_2 ) ) ;
    public final void rule__InheritanceAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2404:1: ( ( ( rule__InheritanceAction__ParentAssignment_2 ) ) )
            // InternalFeatureLangParser.g:2405:1: ( ( rule__InheritanceAction__ParentAssignment_2 ) )
            {
            // InternalFeatureLangParser.g:2405:1: ( ( rule__InheritanceAction__ParentAssignment_2 ) )
            // InternalFeatureLangParser.g:2406:2: ( rule__InheritanceAction__ParentAssignment_2 )
            {
             before(grammarAccess.getInheritanceActionAccess().getParentAssignment_2()); 
            // InternalFeatureLangParser.g:2407:2: ( rule__InheritanceAction__ParentAssignment_2 )
            // InternalFeatureLangParser.g:2407:3: rule__InheritanceAction__ParentAssignment_2
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


    // $ANTLR start "rule__CompositionAction__Group__0"
    // InternalFeatureLangParser.g:2416:1: rule__CompositionAction__Group__0 : rule__CompositionAction__Group__0__Impl rule__CompositionAction__Group__1 ;
    public final void rule__CompositionAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2420:1: ( rule__CompositionAction__Group__0__Impl rule__CompositionAction__Group__1 )
            // InternalFeatureLangParser.g:2421:2: rule__CompositionAction__Group__0__Impl rule__CompositionAction__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__CompositionAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositionAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionAction__Group__0"


    // $ANTLR start "rule__CompositionAction__Group__0__Impl"
    // InternalFeatureLangParser.g:2428:1: rule__CompositionAction__Group__0__Impl : ( ( rule__CompositionAction__Alternatives_0 ) ) ;
    public final void rule__CompositionAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2432:1: ( ( ( rule__CompositionAction__Alternatives_0 ) ) )
            // InternalFeatureLangParser.g:2433:1: ( ( rule__CompositionAction__Alternatives_0 ) )
            {
            // InternalFeatureLangParser.g:2433:1: ( ( rule__CompositionAction__Alternatives_0 ) )
            // InternalFeatureLangParser.g:2434:2: ( rule__CompositionAction__Alternatives_0 )
            {
             before(grammarAccess.getCompositionActionAccess().getAlternatives_0()); 
            // InternalFeatureLangParser.g:2435:2: ( rule__CompositionAction__Alternatives_0 )
            // InternalFeatureLangParser.g:2435:3: rule__CompositionAction__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__CompositionAction__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getCompositionActionAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionAction__Group__0__Impl"


    // $ANTLR start "rule__CompositionAction__Group__1"
    // InternalFeatureLangParser.g:2443:1: rule__CompositionAction__Group__1 : rule__CompositionAction__Group__1__Impl rule__CompositionAction__Group__2 ;
    public final void rule__CompositionAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2447:1: ( rule__CompositionAction__Group__1__Impl rule__CompositionAction__Group__2 )
            // InternalFeatureLangParser.g:2448:2: rule__CompositionAction__Group__1__Impl rule__CompositionAction__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__CompositionAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositionAction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionAction__Group__1"


    // $ANTLR start "rule__CompositionAction__Group__1__Impl"
    // InternalFeatureLangParser.g:2455:1: rule__CompositionAction__Group__1__Impl : ( ( rule__CompositionAction__TargetAssignment_1 ) ) ;
    public final void rule__CompositionAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2459:1: ( ( ( rule__CompositionAction__TargetAssignment_1 ) ) )
            // InternalFeatureLangParser.g:2460:1: ( ( rule__CompositionAction__TargetAssignment_1 ) )
            {
            // InternalFeatureLangParser.g:2460:1: ( ( rule__CompositionAction__TargetAssignment_1 ) )
            // InternalFeatureLangParser.g:2461:2: ( rule__CompositionAction__TargetAssignment_1 )
            {
             before(grammarAccess.getCompositionActionAccess().getTargetAssignment_1()); 
            // InternalFeatureLangParser.g:2462:2: ( rule__CompositionAction__TargetAssignment_1 )
            // InternalFeatureLangParser.g:2462:3: rule__CompositionAction__TargetAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositionAction__TargetAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionActionAccess().getTargetAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionAction__Group__1__Impl"


    // $ANTLR start "rule__CompositionAction__Group__2"
    // InternalFeatureLangParser.g:2470:1: rule__CompositionAction__Group__2 : rule__CompositionAction__Group__2__Impl rule__CompositionAction__Group__3 ;
    public final void rule__CompositionAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2474:1: ( rule__CompositionAction__Group__2__Impl rule__CompositionAction__Group__3 )
            // InternalFeatureLangParser.g:2475:2: rule__CompositionAction__Group__2__Impl rule__CompositionAction__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__CompositionAction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositionAction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionAction__Group__2"


    // $ANTLR start "rule__CompositionAction__Group__2__Impl"
    // InternalFeatureLangParser.g:2482:1: rule__CompositionAction__Group__2__Impl : ( Called ) ;
    public final void rule__CompositionAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2486:1: ( ( Called ) )
            // InternalFeatureLangParser.g:2487:1: ( Called )
            {
            // InternalFeatureLangParser.g:2487:1: ( Called )
            // InternalFeatureLangParser.g:2488:2: Called
            {
             before(grammarAccess.getCompositionActionAccess().getCalledKeyword_2()); 
            match(input,Called,FOLLOW_2); 
             after(grammarAccess.getCompositionActionAccess().getCalledKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionAction__Group__2__Impl"


    // $ANTLR start "rule__CompositionAction__Group__3"
    // InternalFeatureLangParser.g:2497:1: rule__CompositionAction__Group__3 : rule__CompositionAction__Group__3__Impl ;
    public final void rule__CompositionAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2501:1: ( rule__CompositionAction__Group__3__Impl )
            // InternalFeatureLangParser.g:2502:2: rule__CompositionAction__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositionAction__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionAction__Group__3"


    // $ANTLR start "rule__CompositionAction__Group__3__Impl"
    // InternalFeatureLangParser.g:2508:1: rule__CompositionAction__Group__3__Impl : ( ( rule__CompositionAction__RelationAssignment_3 ) ) ;
    public final void rule__CompositionAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2512:1: ( ( ( rule__CompositionAction__RelationAssignment_3 ) ) )
            // InternalFeatureLangParser.g:2513:1: ( ( rule__CompositionAction__RelationAssignment_3 ) )
            {
            // InternalFeatureLangParser.g:2513:1: ( ( rule__CompositionAction__RelationAssignment_3 ) )
            // InternalFeatureLangParser.g:2514:2: ( rule__CompositionAction__RelationAssignment_3 )
            {
             before(grammarAccess.getCompositionActionAccess().getRelationAssignment_3()); 
            // InternalFeatureLangParser.g:2515:2: ( rule__CompositionAction__RelationAssignment_3 )
            // InternalFeatureLangParser.g:2515:3: rule__CompositionAction__RelationAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CompositionAction__RelationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCompositionActionAccess().getRelationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionAction__Group__3__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // InternalFeatureLangParser.g:2524:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2528:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalFeatureLangParser.g:2529:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalFeatureLangParser.g:2536:1: rule__Class__Group__0__Impl : ( ( rule__Class__Alternatives_0 )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2540:1: ( ( ( rule__Class__Alternatives_0 )? ) )
            // InternalFeatureLangParser.g:2541:1: ( ( rule__Class__Alternatives_0 )? )
            {
            // InternalFeatureLangParser.g:2541:1: ( ( rule__Class__Alternatives_0 )? )
            // InternalFeatureLangParser.g:2542:2: ( rule__Class__Alternatives_0 )?
            {
             before(grammarAccess.getClassAccess().getAlternatives_0()); 
            // InternalFeatureLangParser.g:2543:2: ( rule__Class__Alternatives_0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==The||LA26_0==A) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalFeatureLangParser.g:2543:3: rule__Class__Alternatives_0
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
    // InternalFeatureLangParser.g:2551:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2555:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalFeatureLangParser.g:2556:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalFeatureLangParser.g:2563:1: rule__Class__Group__1__Impl : ( ( rule__Class__AbstractAssignment_1 )? ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2567:1: ( ( ( rule__Class__AbstractAssignment_1 )? ) )
            // InternalFeatureLangParser.g:2568:1: ( ( rule__Class__AbstractAssignment_1 )? )
            {
            // InternalFeatureLangParser.g:2568:1: ( ( rule__Class__AbstractAssignment_1 )? )
            // InternalFeatureLangParser.g:2569:2: ( rule__Class__AbstractAssignment_1 )?
            {
             before(grammarAccess.getClassAccess().getAbstractAssignment_1()); 
            // InternalFeatureLangParser.g:2570:2: ( rule__Class__AbstractAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Abstract) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalFeatureLangParser.g:2570:3: rule__Class__AbstractAssignment_1
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
    // InternalFeatureLangParser.g:2578:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2582:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalFeatureLangParser.g:2583:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalFeatureLangParser.g:2590:1: rule__Class__Group__2__Impl : ( ( Class )? ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2594:1: ( ( ( Class )? ) )
            // InternalFeatureLangParser.g:2595:1: ( ( Class )? )
            {
            // InternalFeatureLangParser.g:2595:1: ( ( Class )? )
            // InternalFeatureLangParser.g:2596:2: ( Class )?
            {
             before(grammarAccess.getClassAccess().getClassKeyword_2()); 
            // InternalFeatureLangParser.g:2597:2: ( Class )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Class) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalFeatureLangParser.g:2597:3: Class
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
    // InternalFeatureLangParser.g:2605:1: rule__Class__Group__3 : rule__Class__Group__3__Impl ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2609:1: ( rule__Class__Group__3__Impl )
            // InternalFeatureLangParser.g:2610:2: rule__Class__Group__3__Impl
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
    // InternalFeatureLangParser.g:2616:1: rule__Class__Group__3__Impl : ( ( rule__Class__NameAssignment_3 ) ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2620:1: ( ( ( rule__Class__NameAssignment_3 ) ) )
            // InternalFeatureLangParser.g:2621:1: ( ( rule__Class__NameAssignment_3 ) )
            {
            // InternalFeatureLangParser.g:2621:1: ( ( rule__Class__NameAssignment_3 ) )
            // InternalFeatureLangParser.g:2622:2: ( rule__Class__NameAssignment_3 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_3()); 
            // InternalFeatureLangParser.g:2623:2: ( rule__Class__NameAssignment_3 )
            // InternalFeatureLangParser.g:2623:3: rule__Class__NameAssignment_3
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
    // InternalFeatureLangParser.g:2632:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2636:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalFeatureLangParser.g:2637:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalFeatureLangParser.g:2644:1: rule__Attribute__Group__0__Impl : ( ( Attribute )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2648:1: ( ( ( Attribute )? ) )
            // InternalFeatureLangParser.g:2649:1: ( ( Attribute )? )
            {
            // InternalFeatureLangParser.g:2649:1: ( ( Attribute )? )
            // InternalFeatureLangParser.g:2650:2: ( Attribute )?
            {
             before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
            // InternalFeatureLangParser.g:2651:2: ( Attribute )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Attribute) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalFeatureLangParser.g:2651:3: Attribute
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
    // InternalFeatureLangParser.g:2659:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2663:1: ( rule__Attribute__Group__1__Impl )
            // InternalFeatureLangParser.g:2664:2: rule__Attribute__Group__1__Impl
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
    // InternalFeatureLangParser.g:2670:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2674:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalFeatureLangParser.g:2675:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalFeatureLangParser.g:2675:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalFeatureLangParser.g:2676:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalFeatureLangParser.g:2677:2: ( rule__Attribute__NameAssignment_1 )
            // InternalFeatureLangParser.g:2677:3: rule__Attribute__NameAssignment_1
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
    // InternalFeatureLangParser.g:2686:1: rule__Identifier__Group__0 : rule__Identifier__Group__0__Impl rule__Identifier__Group__1 ;
    public final void rule__Identifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2690:1: ( rule__Identifier__Group__0__Impl rule__Identifier__Group__1 )
            // InternalFeatureLangParser.g:2691:2: rule__Identifier__Group__0__Impl rule__Identifier__Group__1
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
    // InternalFeatureLangParser.g:2698:1: rule__Identifier__Group__0__Impl : ( ( rule__Identifier__ValueAssignment_0 ) ) ;
    public final void rule__Identifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2702:1: ( ( ( rule__Identifier__ValueAssignment_0 ) ) )
            // InternalFeatureLangParser.g:2703:1: ( ( rule__Identifier__ValueAssignment_0 ) )
            {
            // InternalFeatureLangParser.g:2703:1: ( ( rule__Identifier__ValueAssignment_0 ) )
            // InternalFeatureLangParser.g:2704:2: ( rule__Identifier__ValueAssignment_0 )
            {
             before(grammarAccess.getIdentifierAccess().getValueAssignment_0()); 
            // InternalFeatureLangParser.g:2705:2: ( rule__Identifier__ValueAssignment_0 )
            // InternalFeatureLangParser.g:2705:3: rule__Identifier__ValueAssignment_0
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
    // InternalFeatureLangParser.g:2713:1: rule__Identifier__Group__1 : rule__Identifier__Group__1__Impl ;
    public final void rule__Identifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2717:1: ( rule__Identifier__Group__1__Impl )
            // InternalFeatureLangParser.g:2718:2: rule__Identifier__Group__1__Impl
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
    // InternalFeatureLangParser.g:2724:1: rule__Identifier__Group__1__Impl : ( ( rule__Identifier__NameAssignment_1 ) ) ;
    public final void rule__Identifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2728:1: ( ( ( rule__Identifier__NameAssignment_1 ) ) )
            // InternalFeatureLangParser.g:2729:1: ( ( rule__Identifier__NameAssignment_1 ) )
            {
            // InternalFeatureLangParser.g:2729:1: ( ( rule__Identifier__NameAssignment_1 ) )
            // InternalFeatureLangParser.g:2730:2: ( rule__Identifier__NameAssignment_1 )
            {
             before(grammarAccess.getIdentifierAccess().getNameAssignment_1()); 
            // InternalFeatureLangParser.g:2731:2: ( rule__Identifier__NameAssignment_1 )
            // InternalFeatureLangParser.g:2731:3: rule__Identifier__NameAssignment_1
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
    // InternalFeatureLangParser.g:2740:1: rule__FeatureRequest__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__FeatureRequest__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2744:1: ( ( ruleStatement ) )
            // InternalFeatureLangParser.g:2745:2: ( ruleStatement )
            {
            // InternalFeatureLangParser.g:2745:2: ( ruleStatement )
            // InternalFeatureLangParser.g:2746:3: ruleStatement
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
    // InternalFeatureLangParser.g:2755:1: rule__ChangeStatement__TargetAssignment_0 : ( ruleClass ) ;
    public final void rule__ChangeStatement__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2759:1: ( ( ruleClass ) )
            // InternalFeatureLangParser.g:2760:2: ( ruleClass )
            {
            // InternalFeatureLangParser.g:2760:2: ( ruleClass )
            // InternalFeatureLangParser.g:2761:3: ruleClass
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
    // InternalFeatureLangParser.g:2770:1: rule__ChangeStatement__PriorityAssignment_1_0_0 : ( rulePriority ) ;
    public final void rule__ChangeStatement__PriorityAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2774:1: ( ( rulePriority ) )
            // InternalFeatureLangParser.g:2775:2: ( rulePriority )
            {
            // InternalFeatureLangParser.g:2775:2: ( rulePriority )
            // InternalFeatureLangParser.g:2776:3: rulePriority
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
    // InternalFeatureLangParser.g:2785:1: rule__ChangeStatement__NegationAssignment_1_0_1 : ( ( Not ) ) ;
    public final void rule__ChangeStatement__NegationAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2789:1: ( ( ( Not ) ) )
            // InternalFeatureLangParser.g:2790:2: ( ( Not ) )
            {
            // InternalFeatureLangParser.g:2790:2: ( ( Not ) )
            // InternalFeatureLangParser.g:2791:3: ( Not )
            {
             before(grammarAccess.getChangeStatementAccess().getNegationNotKeyword_1_0_1_0()); 
            // InternalFeatureLangParser.g:2792:3: ( Not )
            // InternalFeatureLangParser.g:2793:4: Not
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
    // InternalFeatureLangParser.g:2804:1: rule__ChangeStatement__ActionAssignment_1_0_2_0 : ( ruleAction ) ;
    public final void rule__ChangeStatement__ActionAssignment_1_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2808:1: ( ( ruleAction ) )
            // InternalFeatureLangParser.g:2809:2: ( ruleAction )
            {
            // InternalFeatureLangParser.g:2809:2: ( ruleAction )
            // InternalFeatureLangParser.g:2810:3: ruleAction
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
    // InternalFeatureLangParser.g:2819:1: rule__ChangeStatement__IdentifierAssignment_1_0_2_1_2 : ( ruleIdentifier ) ;
    public final void rule__ChangeStatement__IdentifierAssignment_1_0_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2823:1: ( ( ruleIdentifier ) )
            // InternalFeatureLangParser.g:2824:2: ( ruleIdentifier )
            {
            // InternalFeatureLangParser.g:2824:2: ( ruleIdentifier )
            // InternalFeatureLangParser.g:2825:3: ruleIdentifier
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
    // InternalFeatureLangParser.g:2834:1: rule__ChangeStatement__UpdateAssignment_1_1 : ( ruleUpdateAction ) ;
    public final void rule__ChangeStatement__UpdateAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2838:1: ( ( ruleUpdateAction ) )
            // InternalFeatureLangParser.g:2839:2: ( ruleUpdateAction )
            {
            // InternalFeatureLangParser.g:2839:2: ( ruleUpdateAction )
            // InternalFeatureLangParser.g:2840:3: ruleUpdateAction
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
    // InternalFeatureLangParser.g:2849:1: rule__CreationStatement__ClassElementAssignment_0 : ( ruleClass ) ;
    public final void rule__CreationStatement__ClassElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2853:1: ( ( ruleClass ) )
            // InternalFeatureLangParser.g:2854:2: ( ruleClass )
            {
            // InternalFeatureLangParser.g:2854:2: ( ruleClass )
            // InternalFeatureLangParser.g:2855:3: ruleClass
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
    // InternalFeatureLangParser.g:2864:1: rule__CreationStatement__PriorityAssignment_1 : ( rulePriority ) ;
    public final void rule__CreationStatement__PriorityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2868:1: ( ( rulePriority ) )
            // InternalFeatureLangParser.g:2869:2: ( rulePriority )
            {
            // InternalFeatureLangParser.g:2869:2: ( rulePriority )
            // InternalFeatureLangParser.g:2870:3: rulePriority
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
    // InternalFeatureLangParser.g:2879:1: rule__CreationStatement__NegationAssignment_2 : ( ( Not ) ) ;
    public final void rule__CreationStatement__NegationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2883:1: ( ( ( Not ) ) )
            // InternalFeatureLangParser.g:2884:2: ( ( Not ) )
            {
            // InternalFeatureLangParser.g:2884:2: ( ( Not ) )
            // InternalFeatureLangParser.g:2885:3: ( Not )
            {
             before(grammarAccess.getCreationStatementAccess().getNegationNotKeyword_2_0()); 
            // InternalFeatureLangParser.g:2886:3: ( Not )
            // InternalFeatureLangParser.g:2887:4: Not
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
    // InternalFeatureLangParser.g:2898:1: rule__Action__TypeAssignment : ( ( rule__Action__TypeAlternatives_0 ) ) ;
    public final void rule__Action__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2902:1: ( ( ( rule__Action__TypeAlternatives_0 ) ) )
            // InternalFeatureLangParser.g:2903:2: ( ( rule__Action__TypeAlternatives_0 ) )
            {
            // InternalFeatureLangParser.g:2903:2: ( ( rule__Action__TypeAlternatives_0 ) )
            // InternalFeatureLangParser.g:2904:3: ( rule__Action__TypeAlternatives_0 )
            {
             before(grammarAccess.getActionAccess().getTypeAlternatives_0()); 
            // InternalFeatureLangParser.g:2905:3: ( rule__Action__TypeAlternatives_0 )
            // InternalFeatureLangParser.g:2905:4: rule__Action__TypeAlternatives_0
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
    // InternalFeatureLangParser.g:2913:1: rule__UpdateAction__AttributeAssignment_3 : ( ruleAttribute ) ;
    public final void rule__UpdateAction__AttributeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2917:1: ( ( ruleAttribute ) )
            // InternalFeatureLangParser.g:2918:2: ( ruleAttribute )
            {
            // InternalFeatureLangParser.g:2918:2: ( ruleAttribute )
            // InternalFeatureLangParser.g:2919:3: ruleAttribute
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
    // InternalFeatureLangParser.g:2928:1: rule__UpdateAction__PriorityAssignment_6 : ( rulePriority ) ;
    public final void rule__UpdateAction__PriorityAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2932:1: ( ( rulePriority ) )
            // InternalFeatureLangParser.g:2933:2: ( rulePriority )
            {
            // InternalFeatureLangParser.g:2933:2: ( rulePriority )
            // InternalFeatureLangParser.g:2934:3: rulePriority
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
    // InternalFeatureLangParser.g:2943:1: rule__UpdateAction__DatatypeAssignment_7_0 : ( ruleUpdateAttributeDatatype ) ;
    public final void rule__UpdateAction__DatatypeAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2947:1: ( ( ruleUpdateAttributeDatatype ) )
            // InternalFeatureLangParser.g:2948:2: ( ruleUpdateAttributeDatatype )
            {
            // InternalFeatureLangParser.g:2948:2: ( ruleUpdateAttributeDatatype )
            // InternalFeatureLangParser.g:2949:3: ruleUpdateAttributeDatatype
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
    // InternalFeatureLangParser.g:2958:1: rule__UpdateAction__IdentifierAssignment_7_1 : ( ruleUpdateAttributeIdentifier ) ;
    public final void rule__UpdateAction__IdentifierAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2962:1: ( ( ruleUpdateAttributeIdentifier ) )
            // InternalFeatureLangParser.g:2963:2: ( ruleUpdateAttributeIdentifier )
            {
            // InternalFeatureLangParser.g:2963:2: ( ruleUpdateAttributeIdentifier )
            // InternalFeatureLangParser.g:2964:3: ruleUpdateAttributeIdentifier
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
    // InternalFeatureLangParser.g:2973:1: rule__UpdateAction__ValueAssignment_7_2 : ( ruleUpdateAttributeValue ) ;
    public final void rule__UpdateAction__ValueAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2977:1: ( ( ruleUpdateAttributeValue ) )
            // InternalFeatureLangParser.g:2978:2: ( ruleUpdateAttributeValue )
            {
            // InternalFeatureLangParser.g:2978:2: ( ruleUpdateAttributeValue )
            // InternalFeatureLangParser.g:2979:3: ruleUpdateAttributeValue
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
    // InternalFeatureLangParser.g:2988:1: rule__UpdateAttributeDatatype__TypeAssignment_2 : ( ruleDatatype ) ;
    public final void rule__UpdateAttributeDatatype__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2992:1: ( ( ruleDatatype ) )
            // InternalFeatureLangParser.g:2993:2: ( ruleDatatype )
            {
            // InternalFeatureLangParser.g:2993:2: ( ruleDatatype )
            // InternalFeatureLangParser.g:2994:3: ruleDatatype
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
    // InternalFeatureLangParser.g:3003:1: rule__UpdateAttributeIdentifier__IdentifierAssignment_2 : ( ruleIdentifier ) ;
    public final void rule__UpdateAttributeIdentifier__IdentifierAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3007:1: ( ( ruleIdentifier ) )
            // InternalFeatureLangParser.g:3008:2: ( ruleIdentifier )
            {
            // InternalFeatureLangParser.g:3008:2: ( ruleIdentifier )
            // InternalFeatureLangParser.g:3009:3: ruleIdentifier
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
    // InternalFeatureLangParser.g:3018:1: rule__UpdateAttributeValue__ValueAssignment_3 : ( RULE_ID ) ;
    public final void rule__UpdateAttributeValue__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3022:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:3023:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:3023:2: ( RULE_ID )
            // InternalFeatureLangParser.g:3024:3: RULE_ID
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
    // InternalFeatureLangParser.g:3033:1: rule__AttributeAction__AttributeAssignment_2 : ( ruleAttribute ) ;
    public final void rule__AttributeAction__AttributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3037:1: ( ( ruleAttribute ) )
            // InternalFeatureLangParser.g:3038:2: ( ruleAttribute )
            {
            // InternalFeatureLangParser.g:3038:2: ( ruleAttribute )
            // InternalFeatureLangParser.g:3039:3: ruleAttribute
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


    // $ANTLR start "rule__AttributeAction__TypeAssignment_4_3"
    // InternalFeatureLangParser.g:3048:1: rule__AttributeAction__TypeAssignment_4_3 : ( ruleDatatype ) ;
    public final void rule__AttributeAction__TypeAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3052:1: ( ( ruleDatatype ) )
            // InternalFeatureLangParser.g:3053:2: ( ruleDatatype )
            {
            // InternalFeatureLangParser.g:3053:2: ( ruleDatatype )
            // InternalFeatureLangParser.g:3054:3: ruleDatatype
            {
             before(grammarAccess.getAttributeActionAccess().getTypeDatatypeEnumRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDatatype();

            state._fsp--;

             after(grammarAccess.getAttributeActionAccess().getTypeDatatypeEnumRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAction__TypeAssignment_4_3"


    // $ANTLR start "rule__AssociationAction__TargetAssignment_4"
    // InternalFeatureLangParser.g:3063:1: rule__AssociationAction__TargetAssignment_4 : ( ruleClass ) ;
    public final void rule__AssociationAction__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3067:1: ( ( ruleClass ) )
            // InternalFeatureLangParser.g:3068:2: ( ruleClass )
            {
            // InternalFeatureLangParser.g:3068:2: ( ruleClass )
            // InternalFeatureLangParser.g:3069:3: ruleClass
            {
             before(grammarAccess.getAssociationActionAccess().getTargetClassParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getAssociationActionAccess().getTargetClassParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationAction__TargetAssignment_4"


    // $ANTLR start "rule__AssociationAction__RelationAssignment_6"
    // InternalFeatureLangParser.g:3078:1: rule__AssociationAction__RelationAssignment_6 : ( RULE_ID ) ;
    public final void rule__AssociationAction__RelationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3082:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:3083:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:3083:2: ( RULE_ID )
            // InternalFeatureLangParser.g:3084:3: RULE_ID
            {
             before(grammarAccess.getAssociationActionAccess().getRelationIDTerminalRuleCall_6_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssociationActionAccess().getRelationIDTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationAction__RelationAssignment_6"


    // $ANTLR start "rule__InheritanceAction__ParentAssignment_2"
    // InternalFeatureLangParser.g:3093:1: rule__InheritanceAction__ParentAssignment_2 : ( ruleClass ) ;
    public final void rule__InheritanceAction__ParentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3097:1: ( ( ruleClass ) )
            // InternalFeatureLangParser.g:3098:2: ( ruleClass )
            {
            // InternalFeatureLangParser.g:3098:2: ( ruleClass )
            // InternalFeatureLangParser.g:3099:3: ruleClass
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


    // $ANTLR start "rule__CompositionAction__TargetAssignment_1"
    // InternalFeatureLangParser.g:3108:1: rule__CompositionAction__TargetAssignment_1 : ( ruleClass ) ;
    public final void rule__CompositionAction__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3112:1: ( ( ruleClass ) )
            // InternalFeatureLangParser.g:3113:2: ( ruleClass )
            {
            // InternalFeatureLangParser.g:3113:2: ( ruleClass )
            // InternalFeatureLangParser.g:3114:3: ruleClass
            {
             before(grammarAccess.getCompositionActionAccess().getTargetClassParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getCompositionActionAccess().getTargetClassParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionAction__TargetAssignment_1"


    // $ANTLR start "rule__CompositionAction__RelationAssignment_3"
    // InternalFeatureLangParser.g:3123:1: rule__CompositionAction__RelationAssignment_3 : ( RULE_ID ) ;
    public final void rule__CompositionAction__RelationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3127:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:3128:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:3128:2: ( RULE_ID )
            // InternalFeatureLangParser.g:3129:3: RULE_ID
            {
             before(grammarAccess.getCompositionActionAccess().getRelationIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompositionActionAccess().getRelationIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionAction__RelationAssignment_3"


    // $ANTLR start "rule__Class__AbstractAssignment_1"
    // InternalFeatureLangParser.g:3138:1: rule__Class__AbstractAssignment_1 : ( ruleAbstraction ) ;
    public final void rule__Class__AbstractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3142:1: ( ( ruleAbstraction ) )
            // InternalFeatureLangParser.g:3143:2: ( ruleAbstraction )
            {
            // InternalFeatureLangParser.g:3143:2: ( ruleAbstraction )
            // InternalFeatureLangParser.g:3144:3: ruleAbstraction
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
    // InternalFeatureLangParser.g:3153:1: rule__Class__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3157:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:3158:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:3158:2: ( RULE_ID )
            // InternalFeatureLangParser.g:3159:3: RULE_ID
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
    // InternalFeatureLangParser.g:3168:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3172:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:3173:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:3173:2: ( RULE_ID )
            // InternalFeatureLangParser.g:3174:3: RULE_ID
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
    // InternalFeatureLangParser.g:3183:1: rule__Identifier__ValueAssignment_0 : ( ruleIdentifierValue ) ;
    public final void rule__Identifier__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3187:1: ( ( ruleIdentifierValue ) )
            // InternalFeatureLangParser.g:3188:2: ( ruleIdentifierValue )
            {
            // InternalFeatureLangParser.g:3188:2: ( ruleIdentifierValue )
            // InternalFeatureLangParser.g:3189:3: ruleIdentifierValue
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
    // InternalFeatureLangParser.g:3198:1: rule__Identifier__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Identifier__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3202:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:3203:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:3203:2: ( RULE_ID )
            // InternalFeatureLangParser.g:3204:3: RULE_ID
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
    // InternalFeatureLangParser.g:3213:1: rule__Priority__PriorityAssignment : ( rulePriorityValue ) ;
    public final void rule__Priority__PriorityAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:3217:1: ( ( rulePriorityValue ) )
            // InternalFeatureLangParser.g:3218:2: ( rulePriorityValue )
            {
            // InternalFeatureLangParser.g:3218:2: ( rulePriorityValue )
            // InternalFeatureLangParser.g:3219:3: rulePriorityValue
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
            return "694:1: rule__Statement__Alternatives_0 : ( ( ruleChangeStatement ) | ( ruleCreationStatement ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000C08008042L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002204000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004100680L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000411400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000024010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000410000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000800000120L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000803000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000418000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000C08028040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000C08008040L});

}