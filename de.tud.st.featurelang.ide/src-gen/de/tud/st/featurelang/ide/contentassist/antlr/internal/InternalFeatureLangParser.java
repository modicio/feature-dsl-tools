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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Associations", "Attribute", "Existing", "Inherit", "Called", "Number", "Phrase", "Should", "Class", "Exist", "From", "Have", "Must", "Time", "Has", "Not", "The", "An", "Be", "Is", "It", "To", "FullStop", "A", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int A=27;
    public static final int Called=8;
    public static final int Should=11;
    public static final int Attribute=5;
    public static final int Time=17;
    public static final int Is=23;
    public static final int RULE_STRING=30;
    public static final int It=24;
    public static final int Must=16;
    public static final int An=21;
    public static final int RULE_SL_COMMENT=32;
    public static final int The=20;
    public static final int Exist=13;
    public static final int Number=9;
    public static final int To=25;
    public static final int EOF=-1;
    public static final int Inherit=7;
    public static final int FullStop=26;
    public static final int Be=22;
    public static final int RULE_ID=28;
    public static final int RULE_WS=33;
    public static final int Have=15;
    public static final int Phrase=10;
    public static final int From=14;
    public static final int RULE_ANY_OTHER=34;
    public static final int Associations=4;
    public static final int Not=19;
    public static final int RULE_INT=29;
    public static final int RULE_ML_COMMENT=31;
    public static final int Class=12;
    public static final int Has=18;
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
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("FullStop", "'.'");
    		tokenNameToValue.put("A", "'a'");
    		tokenNameToValue.put("An", "'an'");
    		tokenNameToValue.put("Be", "'be'");
    		tokenNameToValue.put("Is", "'is'");
    		tokenNameToValue.put("It", "'it'");
    		tokenNameToValue.put("To", "'to'");
    		tokenNameToValue.put("Has", "'has'");
    		tokenNameToValue.put("Not", "'not'");
    		tokenNameToValue.put("The", "'the'");
    		tokenNameToValue.put("From", "'from'");
    		tokenNameToValue.put("Have", "'have'");
    		tokenNameToValue.put("Must", "'must'");
    		tokenNameToValue.put("Time", "'time'");
    		tokenNameToValue.put("Class", "'class'");
    		tokenNameToValue.put("Exist", "'exist'");
    		tokenNameToValue.put("Called", "'called'");
    		tokenNameToValue.put("Number", "'number'");
    		tokenNameToValue.put("Phrase", "'phrase'");
    		tokenNameToValue.put("Should", "'should'");
    		tokenNameToValue.put("Inherit", "'inherit'");
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
    // InternalFeatureLangParser.g:79:1: entryRuleFeatureRequest : ruleFeatureRequest EOF ;
    public final void entryRuleFeatureRequest() throws RecognitionException {
        try {
            // InternalFeatureLangParser.g:80:1: ( ruleFeatureRequest EOF )
            // InternalFeatureLangParser.g:81:1: ruleFeatureRequest EOF
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
    // InternalFeatureLangParser.g:88:1: ruleFeatureRequest : ( ( rule__FeatureRequest__StatementsAssignment )* ) ;
    public final void ruleFeatureRequest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:92:2: ( ( ( rule__FeatureRequest__StatementsAssignment )* ) )
            // InternalFeatureLangParser.g:93:2: ( ( rule__FeatureRequest__StatementsAssignment )* )
            {
            // InternalFeatureLangParser.g:93:2: ( ( rule__FeatureRequest__StatementsAssignment )* )
            // InternalFeatureLangParser.g:94:3: ( rule__FeatureRequest__StatementsAssignment )*
            {
             before(grammarAccess.getFeatureRequestAccess().getStatementsAssignment()); 
            // InternalFeatureLangParser.g:95:3: ( rule__FeatureRequest__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Class||LA1_0==The||(LA1_0>=A && LA1_0<=RULE_ID)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFeatureLangParser.g:95:4: rule__FeatureRequest__StatementsAssignment
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
    // InternalFeatureLangParser.g:104:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalFeatureLangParser.g:105:1: ( ruleStatement EOF )
            // InternalFeatureLangParser.g:106:1: ruleStatement EOF
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
    // InternalFeatureLangParser.g:113:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:117:2: ( ( ( rule__Statement__Group__0 ) ) )
            // InternalFeatureLangParser.g:118:2: ( ( rule__Statement__Group__0 ) )
            {
            // InternalFeatureLangParser.g:118:2: ( ( rule__Statement__Group__0 ) )
            // InternalFeatureLangParser.g:119:3: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // InternalFeatureLangParser.g:120:3: ( rule__Statement__Group__0 )
            // InternalFeatureLangParser.g:120:4: rule__Statement__Group__0
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
    // InternalFeatureLangParser.g:129:1: entryRuleChangeStatement : ruleChangeStatement EOF ;
    public final void entryRuleChangeStatement() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:133:1: ( ruleChangeStatement EOF )
            // InternalFeatureLangParser.g:134:1: ruleChangeStatement EOF
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
    // InternalFeatureLangParser.g:144:1: ruleChangeStatement : ( ( rule__ChangeStatement__Group__0 ) ) ;
    public final void ruleChangeStatement() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:149:2: ( ( ( rule__ChangeStatement__Group__0 ) ) )
            // InternalFeatureLangParser.g:150:2: ( ( rule__ChangeStatement__Group__0 ) )
            {
            // InternalFeatureLangParser.g:150:2: ( ( rule__ChangeStatement__Group__0 ) )
            // InternalFeatureLangParser.g:151:3: ( rule__ChangeStatement__Group__0 )
            {
             before(grammarAccess.getChangeStatementAccess().getGroup()); 
            // InternalFeatureLangParser.g:152:3: ( rule__ChangeStatement__Group__0 )
            // InternalFeatureLangParser.g:152:4: rule__ChangeStatement__Group__0
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
    // InternalFeatureLangParser.g:162:1: entryRuleCreationStatement : ruleCreationStatement EOF ;
    public final void entryRuleCreationStatement() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:166:1: ( ruleCreationStatement EOF )
            // InternalFeatureLangParser.g:167:1: ruleCreationStatement EOF
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
    // InternalFeatureLangParser.g:177:1: ruleCreationStatement : ( ( rule__CreationStatement__Group__0 ) ) ;
    public final void ruleCreationStatement() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:182:2: ( ( ( rule__CreationStatement__Group__0 ) ) )
            // InternalFeatureLangParser.g:183:2: ( ( rule__CreationStatement__Group__0 ) )
            {
            // InternalFeatureLangParser.g:183:2: ( ( rule__CreationStatement__Group__0 ) )
            // InternalFeatureLangParser.g:184:3: ( rule__CreationStatement__Group__0 )
            {
             before(grammarAccess.getCreationStatementAccess().getGroup()); 
            // InternalFeatureLangParser.g:185:3: ( rule__CreationStatement__Group__0 )
            // InternalFeatureLangParser.g:185:4: rule__CreationStatement__Group__0
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
    // InternalFeatureLangParser.g:195:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:199:1: ( ruleAction EOF )
            // InternalFeatureLangParser.g:200:1: ruleAction EOF
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
    // InternalFeatureLangParser.g:210:1: ruleAction : ( ( rule__Action__TypeAssignment ) ) ;
    public final void ruleAction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:215:2: ( ( ( rule__Action__TypeAssignment ) ) )
            // InternalFeatureLangParser.g:216:2: ( ( rule__Action__TypeAssignment ) )
            {
            // InternalFeatureLangParser.g:216:2: ( ( rule__Action__TypeAssignment ) )
            // InternalFeatureLangParser.g:217:3: ( rule__Action__TypeAssignment )
            {
             before(grammarAccess.getActionAccess().getTypeAssignment()); 
            // InternalFeatureLangParser.g:218:3: ( rule__Action__TypeAssignment )
            // InternalFeatureLangParser.g:218:4: rule__Action__TypeAssignment
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
    // InternalFeatureLangParser.g:228:1: entryRuleUpdateAction : ruleUpdateAction EOF ;
    public final void entryRuleUpdateAction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:232:1: ( ruleUpdateAction EOF )
            // InternalFeatureLangParser.g:233:1: ruleUpdateAction EOF
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
    // InternalFeatureLangParser.g:243:1: ruleUpdateAction : ( ( rule__UpdateAction__Group__0 ) ) ;
    public final void ruleUpdateAction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:248:2: ( ( ( rule__UpdateAction__Group__0 ) ) )
            // InternalFeatureLangParser.g:249:2: ( ( rule__UpdateAction__Group__0 ) )
            {
            // InternalFeatureLangParser.g:249:2: ( ( rule__UpdateAction__Group__0 ) )
            // InternalFeatureLangParser.g:250:3: ( rule__UpdateAction__Group__0 )
            {
             before(grammarAccess.getUpdateActionAccess().getGroup()); 
            // InternalFeatureLangParser.g:251:3: ( rule__UpdateAction__Group__0 )
            // InternalFeatureLangParser.g:251:4: rule__UpdateAction__Group__0
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


    // $ANTLR start "entryRuleAttributeAction"
    // InternalFeatureLangParser.g:261:1: entryRuleAttributeAction : ruleAttributeAction EOF ;
    public final void entryRuleAttributeAction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:265:1: ( ruleAttributeAction EOF )
            // InternalFeatureLangParser.g:266:1: ruleAttributeAction EOF
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
    // InternalFeatureLangParser.g:276:1: ruleAttributeAction : ( ( rule__AttributeAction__Group__0 ) ) ;
    public final void ruleAttributeAction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:281:2: ( ( ( rule__AttributeAction__Group__0 ) ) )
            // InternalFeatureLangParser.g:282:2: ( ( rule__AttributeAction__Group__0 ) )
            {
            // InternalFeatureLangParser.g:282:2: ( ( rule__AttributeAction__Group__0 ) )
            // InternalFeatureLangParser.g:283:3: ( rule__AttributeAction__Group__0 )
            {
             before(grammarAccess.getAttributeActionAccess().getGroup()); 
            // InternalFeatureLangParser.g:284:3: ( rule__AttributeAction__Group__0 )
            // InternalFeatureLangParser.g:284:4: rule__AttributeAction__Group__0
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
    // InternalFeatureLangParser.g:294:1: entryRuleAssociationAction : ruleAssociationAction EOF ;
    public final void entryRuleAssociationAction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:298:1: ( ruleAssociationAction EOF )
            // InternalFeatureLangParser.g:299:1: ruleAssociationAction EOF
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
    // InternalFeatureLangParser.g:309:1: ruleAssociationAction : ( ( rule__AssociationAction__Group__0 ) ) ;
    public final void ruleAssociationAction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:314:2: ( ( ( rule__AssociationAction__Group__0 ) ) )
            // InternalFeatureLangParser.g:315:2: ( ( rule__AssociationAction__Group__0 ) )
            {
            // InternalFeatureLangParser.g:315:2: ( ( rule__AssociationAction__Group__0 ) )
            // InternalFeatureLangParser.g:316:3: ( rule__AssociationAction__Group__0 )
            {
             before(grammarAccess.getAssociationActionAccess().getGroup()); 
            // InternalFeatureLangParser.g:317:3: ( rule__AssociationAction__Group__0 )
            // InternalFeatureLangParser.g:317:4: rule__AssociationAction__Group__0
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
    // InternalFeatureLangParser.g:327:1: entryRuleInheritanceAction : ruleInheritanceAction EOF ;
    public final void entryRuleInheritanceAction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:331:1: ( ruleInheritanceAction EOF )
            // InternalFeatureLangParser.g:332:1: ruleInheritanceAction EOF
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
    // InternalFeatureLangParser.g:342:1: ruleInheritanceAction : ( ( rule__InheritanceAction__Group__0 ) ) ;
    public final void ruleInheritanceAction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:347:2: ( ( ( rule__InheritanceAction__Group__0 ) ) )
            // InternalFeatureLangParser.g:348:2: ( ( rule__InheritanceAction__Group__0 ) )
            {
            // InternalFeatureLangParser.g:348:2: ( ( rule__InheritanceAction__Group__0 ) )
            // InternalFeatureLangParser.g:349:3: ( rule__InheritanceAction__Group__0 )
            {
             before(grammarAccess.getInheritanceActionAccess().getGroup()); 
            // InternalFeatureLangParser.g:350:3: ( rule__InheritanceAction__Group__0 )
            // InternalFeatureLangParser.g:350:4: rule__InheritanceAction__Group__0
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


    // $ANTLR start "entryRuleClass"
    // InternalFeatureLangParser.g:360:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:364:1: ( ruleClass EOF )
            // InternalFeatureLangParser.g:365:1: ruleClass EOF
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
    // InternalFeatureLangParser.g:375:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:380:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalFeatureLangParser.g:381:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalFeatureLangParser.g:381:2: ( ( rule__Class__Group__0 ) )
            // InternalFeatureLangParser.g:382:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalFeatureLangParser.g:383:3: ( rule__Class__Group__0 )
            // InternalFeatureLangParser.g:383:4: rule__Class__Group__0
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
    // InternalFeatureLangParser.g:393:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:397:1: ( ruleAttribute EOF )
            // InternalFeatureLangParser.g:398:1: ruleAttribute EOF
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
    // InternalFeatureLangParser.g:408:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:413:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalFeatureLangParser.g:414:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalFeatureLangParser.g:414:2: ( ( rule__Attribute__Group__0 ) )
            // InternalFeatureLangParser.g:415:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalFeatureLangParser.g:416:3: ( rule__Attribute__Group__0 )
            // InternalFeatureLangParser.g:416:4: rule__Attribute__Group__0
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


    // $ANTLR start "entryRulePriority"
    // InternalFeatureLangParser.g:426:1: entryRulePriority : rulePriority EOF ;
    public final void entryRulePriority() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:430:1: ( rulePriority EOF )
            // InternalFeatureLangParser.g:431:1: rulePriority EOF
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
    // InternalFeatureLangParser.g:441:1: rulePriority : ( ( rule__Priority__PriorityAssignment ) ) ;
    public final void rulePriority() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:446:2: ( ( ( rule__Priority__PriorityAssignment ) ) )
            // InternalFeatureLangParser.g:447:2: ( ( rule__Priority__PriorityAssignment ) )
            {
            // InternalFeatureLangParser.g:447:2: ( ( rule__Priority__PriorityAssignment ) )
            // InternalFeatureLangParser.g:448:3: ( rule__Priority__PriorityAssignment )
            {
             before(grammarAccess.getPriorityAccess().getPriorityAssignment()); 
            // InternalFeatureLangParser.g:449:3: ( rule__Priority__PriorityAssignment )
            // InternalFeatureLangParser.g:449:4: rule__Priority__PriorityAssignment
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
    // InternalFeatureLangParser.g:459:1: rulePriorityValue : ( ( rule__PriorityValue__Alternatives ) ) ;
    public final void rulePriorityValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:463:1: ( ( ( rule__PriorityValue__Alternatives ) ) )
            // InternalFeatureLangParser.g:464:2: ( ( rule__PriorityValue__Alternatives ) )
            {
            // InternalFeatureLangParser.g:464:2: ( ( rule__PriorityValue__Alternatives ) )
            // InternalFeatureLangParser.g:465:3: ( rule__PriorityValue__Alternatives )
            {
             before(grammarAccess.getPriorityValueAccess().getAlternatives()); 
            // InternalFeatureLangParser.g:466:3: ( rule__PriorityValue__Alternatives )
            // InternalFeatureLangParser.g:466:4: rule__PriorityValue__Alternatives
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


    // $ANTLR start "ruleDatatype"
    // InternalFeatureLangParser.g:475:1: ruleDatatype : ( ( rule__Datatype__Alternatives ) ) ;
    public final void ruleDatatype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:479:1: ( ( ( rule__Datatype__Alternatives ) ) )
            // InternalFeatureLangParser.g:480:2: ( ( rule__Datatype__Alternatives ) )
            {
            // InternalFeatureLangParser.g:480:2: ( ( rule__Datatype__Alternatives ) )
            // InternalFeatureLangParser.g:481:3: ( rule__Datatype__Alternatives )
            {
             before(grammarAccess.getDatatypeAccess().getAlternatives()); 
            // InternalFeatureLangParser.g:482:3: ( rule__Datatype__Alternatives )
            // InternalFeatureLangParser.g:482:4: rule__Datatype__Alternatives
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
    // InternalFeatureLangParser.g:490:1: rule__Statement__Alternatives_0 : ( ( ruleChangeStatement ) | ( ruleCreationStatement ) );
    public final void rule__Statement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:494:1: ( ( ruleChangeStatement ) | ( ruleCreationStatement ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalFeatureLangParser.g:495:2: ( ruleChangeStatement )
                    {
                    // InternalFeatureLangParser.g:495:2: ( ruleChangeStatement )
                    // InternalFeatureLangParser.g:496:3: ruleChangeStatement
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
                    // InternalFeatureLangParser.g:501:2: ( ruleCreationStatement )
                    {
                    // InternalFeatureLangParser.g:501:2: ( ruleCreationStatement )
                    // InternalFeatureLangParser.g:502:3: ruleCreationStatement
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
    // InternalFeatureLangParser.g:511:1: rule__ChangeStatement__Alternatives_1 : ( ( ( rule__ChangeStatement__Group_1_0__0 ) ) | ( ( rule__ChangeStatement__UpdateAssignment_1_1 ) ) );
    public final void rule__ChangeStatement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:515:1: ( ( ( rule__ChangeStatement__Group_1_0__0 ) ) | ( ( rule__ChangeStatement__UpdateAssignment_1_1 ) ) )
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
                    // InternalFeatureLangParser.g:516:2: ( ( rule__ChangeStatement__Group_1_0__0 ) )
                    {
                    // InternalFeatureLangParser.g:516:2: ( ( rule__ChangeStatement__Group_1_0__0 ) )
                    // InternalFeatureLangParser.g:517:3: ( rule__ChangeStatement__Group_1_0__0 )
                    {
                     before(grammarAccess.getChangeStatementAccess().getGroup_1_0()); 
                    // InternalFeatureLangParser.g:518:3: ( rule__ChangeStatement__Group_1_0__0 )
                    // InternalFeatureLangParser.g:518:4: rule__ChangeStatement__Group_1_0__0
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
                    // InternalFeatureLangParser.g:522:2: ( ( rule__ChangeStatement__UpdateAssignment_1_1 ) )
                    {
                    // InternalFeatureLangParser.g:522:2: ( ( rule__ChangeStatement__UpdateAssignment_1_1 ) )
                    // InternalFeatureLangParser.g:523:3: ( rule__ChangeStatement__UpdateAssignment_1_1 )
                    {
                     before(grammarAccess.getChangeStatementAccess().getUpdateAssignment_1_1()); 
                    // InternalFeatureLangParser.g:524:3: ( rule__ChangeStatement__UpdateAssignment_1_1 )
                    // InternalFeatureLangParser.g:524:4: rule__ChangeStatement__UpdateAssignment_1_1
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


    // $ANTLR start "rule__CreationStatement__Alternatives_3"
    // InternalFeatureLangParser.g:532:1: rule__CreationStatement__Alternatives_3 : ( ( Exist ) | ( Be ) );
    public final void rule__CreationStatement__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:536:1: ( ( Exist ) | ( Be ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Exist) ) {
                alt4=1;
            }
            else if ( (LA4_0==Be) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalFeatureLangParser.g:537:2: ( Exist )
                    {
                    // InternalFeatureLangParser.g:537:2: ( Exist )
                    // InternalFeatureLangParser.g:538:3: Exist
                    {
                     before(grammarAccess.getCreationStatementAccess().getExistKeyword_3_0()); 
                    match(input,Exist,FOLLOW_2); 
                     after(grammarAccess.getCreationStatementAccess().getExistKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:543:2: ( Be )
                    {
                    // InternalFeatureLangParser.g:543:2: ( Be )
                    // InternalFeatureLangParser.g:544:3: Be
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
    // InternalFeatureLangParser.g:553:1: rule__Action__TypeAlternatives_0 : ( ( ruleAttributeAction ) | ( ruleAssociationAction ) | ( ruleInheritanceAction ) );
    public final void rule__Action__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:557:1: ( ( ruleAttributeAction ) | ( ruleAssociationAction ) | ( ruleInheritanceAction ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Have) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==Associations) ) {
                    alt5=2;
                }
                else if ( ((LA5_1>=The && LA5_1<=An)) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==Inherit) ) {
                alt5=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalFeatureLangParser.g:558:2: ( ruleAttributeAction )
                    {
                    // InternalFeatureLangParser.g:558:2: ( ruleAttributeAction )
                    // InternalFeatureLangParser.g:559:3: ruleAttributeAction
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
                    // InternalFeatureLangParser.g:564:2: ( ruleAssociationAction )
                    {
                    // InternalFeatureLangParser.g:564:2: ( ruleAssociationAction )
                    // InternalFeatureLangParser.g:565:3: ruleAssociationAction
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
                    // InternalFeatureLangParser.g:570:2: ( ruleInheritanceAction )
                    {
                    // InternalFeatureLangParser.g:570:2: ( ruleInheritanceAction )
                    // InternalFeatureLangParser.g:571:3: ruleInheritanceAction
                    {
                     before(grammarAccess.getActionAccess().getTypeInheritanceActionParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleInheritanceAction();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getTypeInheritanceActionParserRuleCall_0_2()); 

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


    // $ANTLR start "rule__AttributeAction__Alternatives_1"
    // InternalFeatureLangParser.g:580:1: rule__AttributeAction__Alternatives_1 : ( ( The ) | ( An ) );
    public final void rule__AttributeAction__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:584:1: ( ( The ) | ( An ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==The) ) {
                alt6=1;
            }
            else if ( (LA6_0==An) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalFeatureLangParser.g:585:2: ( The )
                    {
                    // InternalFeatureLangParser.g:585:2: ( The )
                    // InternalFeatureLangParser.g:586:3: The
                    {
                     before(grammarAccess.getAttributeActionAccess().getTheKeyword_1_0()); 
                    match(input,The,FOLLOW_2); 
                     after(grammarAccess.getAttributeActionAccess().getTheKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:591:2: ( An )
                    {
                    // InternalFeatureLangParser.g:591:2: ( An )
                    // InternalFeatureLangParser.g:592:3: An
                    {
                     before(grammarAccess.getAttributeActionAccess().getAnKeyword_1_1()); 
                    match(input,An,FOLLOW_2); 
                     after(grammarAccess.getAttributeActionAccess().getAnKeyword_1_1()); 

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


    // $ANTLR start "rule__Class__Alternatives_0"
    // InternalFeatureLangParser.g:601:1: rule__Class__Alternatives_0 : ( ( The ) | ( A ) );
    public final void rule__Class__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:605:1: ( ( The ) | ( A ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==The) ) {
                alt7=1;
            }
            else if ( (LA7_0==A) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalFeatureLangParser.g:606:2: ( The )
                    {
                    // InternalFeatureLangParser.g:606:2: ( The )
                    // InternalFeatureLangParser.g:607:3: The
                    {
                     before(grammarAccess.getClassAccess().getTheKeyword_0_0()); 
                    match(input,The,FOLLOW_2); 
                     after(grammarAccess.getClassAccess().getTheKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:612:2: ( A )
                    {
                    // InternalFeatureLangParser.g:612:2: ( A )
                    // InternalFeatureLangParser.g:613:3: A
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
    // InternalFeatureLangParser.g:622:1: rule__PriorityValue__Alternatives : ( ( ( Should ) ) | ( ( Must ) ) );
    public final void rule__PriorityValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:626:1: ( ( ( Should ) ) | ( ( Must ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Should) ) {
                alt8=1;
            }
            else if ( (LA8_0==Must) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalFeatureLangParser.g:627:2: ( ( Should ) )
                    {
                    // InternalFeatureLangParser.g:627:2: ( ( Should ) )
                    // InternalFeatureLangParser.g:628:3: ( Should )
                    {
                     before(grammarAccess.getPriorityValueAccess().getSHOULDEnumLiteralDeclaration_0()); 
                    // InternalFeatureLangParser.g:629:3: ( Should )
                    // InternalFeatureLangParser.g:629:4: Should
                    {
                    match(input,Should,FOLLOW_2); 

                    }

                     after(grammarAccess.getPriorityValueAccess().getSHOULDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:633:2: ( ( Must ) )
                    {
                    // InternalFeatureLangParser.g:633:2: ( ( Must ) )
                    // InternalFeatureLangParser.g:634:3: ( Must )
                    {
                     before(grammarAccess.getPriorityValueAccess().getMUSTEnumLiteralDeclaration_1()); 
                    // InternalFeatureLangParser.g:635:3: ( Must )
                    // InternalFeatureLangParser.g:635:4: Must
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


    // $ANTLR start "rule__Datatype__Alternatives"
    // InternalFeatureLangParser.g:643:1: rule__Datatype__Alternatives : ( ( ( Time ) ) | ( ( Phrase ) ) | ( ( Number ) ) );
    public final void rule__Datatype__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:647:1: ( ( ( Time ) ) | ( ( Phrase ) ) | ( ( Number ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case Time:
                {
                alt9=1;
                }
                break;
            case Phrase:
                {
                alt9=2;
                }
                break;
            case Number:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalFeatureLangParser.g:648:2: ( ( Time ) )
                    {
                    // InternalFeatureLangParser.g:648:2: ( ( Time ) )
                    // InternalFeatureLangParser.g:649:3: ( Time )
                    {
                     before(grammarAccess.getDatatypeAccess().getWORDEnumLiteralDeclaration_0()); 
                    // InternalFeatureLangParser.g:650:3: ( Time )
                    // InternalFeatureLangParser.g:650:4: Time
                    {
                    match(input,Time,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatatypeAccess().getWORDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:654:2: ( ( Phrase ) )
                    {
                    // InternalFeatureLangParser.g:654:2: ( ( Phrase ) )
                    // InternalFeatureLangParser.g:655:3: ( Phrase )
                    {
                     before(grammarAccess.getDatatypeAccess().getPHRASEEnumLiteralDeclaration_1()); 
                    // InternalFeatureLangParser.g:656:3: ( Phrase )
                    // InternalFeatureLangParser.g:656:4: Phrase
                    {
                    match(input,Phrase,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatatypeAccess().getPHRASEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureLangParser.g:660:2: ( ( Number ) )
                    {
                    // InternalFeatureLangParser.g:660:2: ( ( Number ) )
                    // InternalFeatureLangParser.g:661:3: ( Number )
                    {
                     before(grammarAccess.getDatatypeAccess().getNUMBEREnumLiteralDeclaration_2()); 
                    // InternalFeatureLangParser.g:662:3: ( Number )
                    // InternalFeatureLangParser.g:662:4: Number
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
    // InternalFeatureLangParser.g:670:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:674:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalFeatureLangParser.g:675:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
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
    // InternalFeatureLangParser.g:682:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__Alternatives_0 ) ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:686:1: ( ( ( rule__Statement__Alternatives_0 ) ) )
            // InternalFeatureLangParser.g:687:1: ( ( rule__Statement__Alternatives_0 ) )
            {
            // InternalFeatureLangParser.g:687:1: ( ( rule__Statement__Alternatives_0 ) )
            // InternalFeatureLangParser.g:688:2: ( rule__Statement__Alternatives_0 )
            {
             before(grammarAccess.getStatementAccess().getAlternatives_0()); 
            // InternalFeatureLangParser.g:689:2: ( rule__Statement__Alternatives_0 )
            // InternalFeatureLangParser.g:689:3: rule__Statement__Alternatives_0
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
    // InternalFeatureLangParser.g:697:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:701:1: ( rule__Statement__Group__1__Impl )
            // InternalFeatureLangParser.g:702:2: rule__Statement__Group__1__Impl
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
    // InternalFeatureLangParser.g:708:1: rule__Statement__Group__1__Impl : ( ( FullStop )? ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:712:1: ( ( ( FullStop )? ) )
            // InternalFeatureLangParser.g:713:1: ( ( FullStop )? )
            {
            // InternalFeatureLangParser.g:713:1: ( ( FullStop )? )
            // InternalFeatureLangParser.g:714:2: ( FullStop )?
            {
             before(grammarAccess.getStatementAccess().getFullStopKeyword_1()); 
            // InternalFeatureLangParser.g:715:2: ( FullStop )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==FullStop) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalFeatureLangParser.g:715:3: FullStop
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
    // InternalFeatureLangParser.g:724:1: rule__ChangeStatement__Group__0 : rule__ChangeStatement__Group__0__Impl rule__ChangeStatement__Group__1 ;
    public final void rule__ChangeStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:728:1: ( rule__ChangeStatement__Group__0__Impl rule__ChangeStatement__Group__1 )
            // InternalFeatureLangParser.g:729:2: rule__ChangeStatement__Group__0__Impl rule__ChangeStatement__Group__1
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
    // InternalFeatureLangParser.g:736:1: rule__ChangeStatement__Group__0__Impl : ( ( rule__ChangeStatement__TargetAssignment_0 ) ) ;
    public final void rule__ChangeStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:740:1: ( ( ( rule__ChangeStatement__TargetAssignment_0 ) ) )
            // InternalFeatureLangParser.g:741:1: ( ( rule__ChangeStatement__TargetAssignment_0 ) )
            {
            // InternalFeatureLangParser.g:741:1: ( ( rule__ChangeStatement__TargetAssignment_0 ) )
            // InternalFeatureLangParser.g:742:2: ( rule__ChangeStatement__TargetAssignment_0 )
            {
             before(grammarAccess.getChangeStatementAccess().getTargetAssignment_0()); 
            // InternalFeatureLangParser.g:743:2: ( rule__ChangeStatement__TargetAssignment_0 )
            // InternalFeatureLangParser.g:743:3: rule__ChangeStatement__TargetAssignment_0
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
    // InternalFeatureLangParser.g:751:1: rule__ChangeStatement__Group__1 : rule__ChangeStatement__Group__1__Impl ;
    public final void rule__ChangeStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:755:1: ( rule__ChangeStatement__Group__1__Impl )
            // InternalFeatureLangParser.g:756:2: rule__ChangeStatement__Group__1__Impl
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
    // InternalFeatureLangParser.g:762:1: rule__ChangeStatement__Group__1__Impl : ( ( rule__ChangeStatement__Alternatives_1 ) ) ;
    public final void rule__ChangeStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:766:1: ( ( ( rule__ChangeStatement__Alternatives_1 ) ) )
            // InternalFeatureLangParser.g:767:1: ( ( rule__ChangeStatement__Alternatives_1 ) )
            {
            // InternalFeatureLangParser.g:767:1: ( ( rule__ChangeStatement__Alternatives_1 ) )
            // InternalFeatureLangParser.g:768:2: ( rule__ChangeStatement__Alternatives_1 )
            {
             before(grammarAccess.getChangeStatementAccess().getAlternatives_1()); 
            // InternalFeatureLangParser.g:769:2: ( rule__ChangeStatement__Alternatives_1 )
            // InternalFeatureLangParser.g:769:3: rule__ChangeStatement__Alternatives_1
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
    // InternalFeatureLangParser.g:778:1: rule__ChangeStatement__Group_1_0__0 : rule__ChangeStatement__Group_1_0__0__Impl rule__ChangeStatement__Group_1_0__1 ;
    public final void rule__ChangeStatement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:782:1: ( rule__ChangeStatement__Group_1_0__0__Impl rule__ChangeStatement__Group_1_0__1 )
            // InternalFeatureLangParser.g:783:2: rule__ChangeStatement__Group_1_0__0__Impl rule__ChangeStatement__Group_1_0__1
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
    // InternalFeatureLangParser.g:790:1: rule__ChangeStatement__Group_1_0__0__Impl : ( ( rule__ChangeStatement__PriorityAssignment_1_0_0 ) ) ;
    public final void rule__ChangeStatement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:794:1: ( ( ( rule__ChangeStatement__PriorityAssignment_1_0_0 ) ) )
            // InternalFeatureLangParser.g:795:1: ( ( rule__ChangeStatement__PriorityAssignment_1_0_0 ) )
            {
            // InternalFeatureLangParser.g:795:1: ( ( rule__ChangeStatement__PriorityAssignment_1_0_0 ) )
            // InternalFeatureLangParser.g:796:2: ( rule__ChangeStatement__PriorityAssignment_1_0_0 )
            {
             before(grammarAccess.getChangeStatementAccess().getPriorityAssignment_1_0_0()); 
            // InternalFeatureLangParser.g:797:2: ( rule__ChangeStatement__PriorityAssignment_1_0_0 )
            // InternalFeatureLangParser.g:797:3: rule__ChangeStatement__PriorityAssignment_1_0_0
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
    // InternalFeatureLangParser.g:805:1: rule__ChangeStatement__Group_1_0__1 : rule__ChangeStatement__Group_1_0__1__Impl rule__ChangeStatement__Group_1_0__2 ;
    public final void rule__ChangeStatement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:809:1: ( rule__ChangeStatement__Group_1_0__1__Impl rule__ChangeStatement__Group_1_0__2 )
            // InternalFeatureLangParser.g:810:2: rule__ChangeStatement__Group_1_0__1__Impl rule__ChangeStatement__Group_1_0__2
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
    // InternalFeatureLangParser.g:817:1: rule__ChangeStatement__Group_1_0__1__Impl : ( ( rule__ChangeStatement__NegationAssignment_1_0_1 )? ) ;
    public final void rule__ChangeStatement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:821:1: ( ( ( rule__ChangeStatement__NegationAssignment_1_0_1 )? ) )
            // InternalFeatureLangParser.g:822:1: ( ( rule__ChangeStatement__NegationAssignment_1_0_1 )? )
            {
            // InternalFeatureLangParser.g:822:1: ( ( rule__ChangeStatement__NegationAssignment_1_0_1 )? )
            // InternalFeatureLangParser.g:823:2: ( rule__ChangeStatement__NegationAssignment_1_0_1 )?
            {
             before(grammarAccess.getChangeStatementAccess().getNegationAssignment_1_0_1()); 
            // InternalFeatureLangParser.g:824:2: ( rule__ChangeStatement__NegationAssignment_1_0_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Not) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalFeatureLangParser.g:824:3: rule__ChangeStatement__NegationAssignment_1_0_1
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
    // InternalFeatureLangParser.g:832:1: rule__ChangeStatement__Group_1_0__2 : rule__ChangeStatement__Group_1_0__2__Impl ;
    public final void rule__ChangeStatement__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:836:1: ( rule__ChangeStatement__Group_1_0__2__Impl )
            // InternalFeatureLangParser.g:837:2: rule__ChangeStatement__Group_1_0__2__Impl
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
    // InternalFeatureLangParser.g:843:1: rule__ChangeStatement__Group_1_0__2__Impl : ( ( rule__ChangeStatement__ActionAssignment_1_0_2 ) ) ;
    public final void rule__ChangeStatement__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:847:1: ( ( ( rule__ChangeStatement__ActionAssignment_1_0_2 ) ) )
            // InternalFeatureLangParser.g:848:1: ( ( rule__ChangeStatement__ActionAssignment_1_0_2 ) )
            {
            // InternalFeatureLangParser.g:848:1: ( ( rule__ChangeStatement__ActionAssignment_1_0_2 ) )
            // InternalFeatureLangParser.g:849:2: ( rule__ChangeStatement__ActionAssignment_1_0_2 )
            {
             before(grammarAccess.getChangeStatementAccess().getActionAssignment_1_0_2()); 
            // InternalFeatureLangParser.g:850:2: ( rule__ChangeStatement__ActionAssignment_1_0_2 )
            // InternalFeatureLangParser.g:850:3: rule__ChangeStatement__ActionAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ChangeStatement__ActionAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getChangeStatementAccess().getActionAssignment_1_0_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__CreationStatement__Group__0"
    // InternalFeatureLangParser.g:859:1: rule__CreationStatement__Group__0 : rule__CreationStatement__Group__0__Impl rule__CreationStatement__Group__1 ;
    public final void rule__CreationStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:863:1: ( rule__CreationStatement__Group__0__Impl rule__CreationStatement__Group__1 )
            // InternalFeatureLangParser.g:864:2: rule__CreationStatement__Group__0__Impl rule__CreationStatement__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalFeatureLangParser.g:871:1: rule__CreationStatement__Group__0__Impl : ( ( rule__CreationStatement__ClassElementAssignment_0 ) ) ;
    public final void rule__CreationStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:875:1: ( ( ( rule__CreationStatement__ClassElementAssignment_0 ) ) )
            // InternalFeatureLangParser.g:876:1: ( ( rule__CreationStatement__ClassElementAssignment_0 ) )
            {
            // InternalFeatureLangParser.g:876:1: ( ( rule__CreationStatement__ClassElementAssignment_0 ) )
            // InternalFeatureLangParser.g:877:2: ( rule__CreationStatement__ClassElementAssignment_0 )
            {
             before(grammarAccess.getCreationStatementAccess().getClassElementAssignment_0()); 
            // InternalFeatureLangParser.g:878:2: ( rule__CreationStatement__ClassElementAssignment_0 )
            // InternalFeatureLangParser.g:878:3: rule__CreationStatement__ClassElementAssignment_0
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
    // InternalFeatureLangParser.g:886:1: rule__CreationStatement__Group__1 : rule__CreationStatement__Group__1__Impl rule__CreationStatement__Group__2 ;
    public final void rule__CreationStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:890:1: ( rule__CreationStatement__Group__1__Impl rule__CreationStatement__Group__2 )
            // InternalFeatureLangParser.g:891:2: rule__CreationStatement__Group__1__Impl rule__CreationStatement__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalFeatureLangParser.g:898:1: rule__CreationStatement__Group__1__Impl : ( ( rule__CreationStatement__PriorityAssignment_1 ) ) ;
    public final void rule__CreationStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:902:1: ( ( ( rule__CreationStatement__PriorityAssignment_1 ) ) )
            // InternalFeatureLangParser.g:903:1: ( ( rule__CreationStatement__PriorityAssignment_1 ) )
            {
            // InternalFeatureLangParser.g:903:1: ( ( rule__CreationStatement__PriorityAssignment_1 ) )
            // InternalFeatureLangParser.g:904:2: ( rule__CreationStatement__PriorityAssignment_1 )
            {
             before(grammarAccess.getCreationStatementAccess().getPriorityAssignment_1()); 
            // InternalFeatureLangParser.g:905:2: ( rule__CreationStatement__PriorityAssignment_1 )
            // InternalFeatureLangParser.g:905:3: rule__CreationStatement__PriorityAssignment_1
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
    // InternalFeatureLangParser.g:913:1: rule__CreationStatement__Group__2 : rule__CreationStatement__Group__2__Impl rule__CreationStatement__Group__3 ;
    public final void rule__CreationStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:917:1: ( rule__CreationStatement__Group__2__Impl rule__CreationStatement__Group__3 )
            // InternalFeatureLangParser.g:918:2: rule__CreationStatement__Group__2__Impl rule__CreationStatement__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalFeatureLangParser.g:925:1: rule__CreationStatement__Group__2__Impl : ( ( rule__CreationStatement__NegationAssignment_2 )? ) ;
    public final void rule__CreationStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:929:1: ( ( ( rule__CreationStatement__NegationAssignment_2 )? ) )
            // InternalFeatureLangParser.g:930:1: ( ( rule__CreationStatement__NegationAssignment_2 )? )
            {
            // InternalFeatureLangParser.g:930:1: ( ( rule__CreationStatement__NegationAssignment_2 )? )
            // InternalFeatureLangParser.g:931:2: ( rule__CreationStatement__NegationAssignment_2 )?
            {
             before(grammarAccess.getCreationStatementAccess().getNegationAssignment_2()); 
            // InternalFeatureLangParser.g:932:2: ( rule__CreationStatement__NegationAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Not) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalFeatureLangParser.g:932:3: rule__CreationStatement__NegationAssignment_2
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
    // InternalFeatureLangParser.g:940:1: rule__CreationStatement__Group__3 : rule__CreationStatement__Group__3__Impl ;
    public final void rule__CreationStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:944:1: ( rule__CreationStatement__Group__3__Impl )
            // InternalFeatureLangParser.g:945:2: rule__CreationStatement__Group__3__Impl
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
    // InternalFeatureLangParser.g:951:1: rule__CreationStatement__Group__3__Impl : ( ( rule__CreationStatement__Alternatives_3 ) ) ;
    public final void rule__CreationStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:955:1: ( ( ( rule__CreationStatement__Alternatives_3 ) ) )
            // InternalFeatureLangParser.g:956:1: ( ( rule__CreationStatement__Alternatives_3 ) )
            {
            // InternalFeatureLangParser.g:956:1: ( ( rule__CreationStatement__Alternatives_3 ) )
            // InternalFeatureLangParser.g:957:2: ( rule__CreationStatement__Alternatives_3 )
            {
             before(grammarAccess.getCreationStatementAccess().getAlternatives_3()); 
            // InternalFeatureLangParser.g:958:2: ( rule__CreationStatement__Alternatives_3 )
            // InternalFeatureLangParser.g:958:3: rule__CreationStatement__Alternatives_3
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
    // InternalFeatureLangParser.g:967:1: rule__UpdateAction__Group__0 : rule__UpdateAction__Group__0__Impl rule__UpdateAction__Group__1 ;
    public final void rule__UpdateAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:971:1: ( rule__UpdateAction__Group__0__Impl rule__UpdateAction__Group__1 )
            // InternalFeatureLangParser.g:972:2: rule__UpdateAction__Group__0__Impl rule__UpdateAction__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalFeatureLangParser.g:979:1: rule__UpdateAction__Group__0__Impl : ( Has ) ;
    public final void rule__UpdateAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:983:1: ( ( Has ) )
            // InternalFeatureLangParser.g:984:1: ( Has )
            {
            // InternalFeatureLangParser.g:984:1: ( Has )
            // InternalFeatureLangParser.g:985:2: Has
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
    // InternalFeatureLangParser.g:994:1: rule__UpdateAction__Group__1 : rule__UpdateAction__Group__1__Impl rule__UpdateAction__Group__2 ;
    public final void rule__UpdateAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:998:1: ( rule__UpdateAction__Group__1__Impl rule__UpdateAction__Group__2 )
            // InternalFeatureLangParser.g:999:2: rule__UpdateAction__Group__1__Impl rule__UpdateAction__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalFeatureLangParser.g:1006:1: rule__UpdateAction__Group__1__Impl : ( An ) ;
    public final void rule__UpdateAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1010:1: ( ( An ) )
            // InternalFeatureLangParser.g:1011:1: ( An )
            {
            // InternalFeatureLangParser.g:1011:1: ( An )
            // InternalFeatureLangParser.g:1012:2: An
            {
             before(grammarAccess.getUpdateActionAccess().getAnKeyword_1()); 
            match(input,An,FOLLOW_2); 
             after(grammarAccess.getUpdateActionAccess().getAnKeyword_1()); 

            }


            }

        }
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
    // InternalFeatureLangParser.g:1021:1: rule__UpdateAction__Group__2 : rule__UpdateAction__Group__2__Impl rule__UpdateAction__Group__3 ;
    public final void rule__UpdateAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1025:1: ( rule__UpdateAction__Group__2__Impl rule__UpdateAction__Group__3 )
            // InternalFeatureLangParser.g:1026:2: rule__UpdateAction__Group__2__Impl rule__UpdateAction__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalFeatureLangParser.g:1033:1: rule__UpdateAction__Group__2__Impl : ( ( Existing )? ) ;
    public final void rule__UpdateAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1037:1: ( ( ( Existing )? ) )
            // InternalFeatureLangParser.g:1038:1: ( ( Existing )? )
            {
            // InternalFeatureLangParser.g:1038:1: ( ( Existing )? )
            // InternalFeatureLangParser.g:1039:2: ( Existing )?
            {
             before(grammarAccess.getUpdateActionAccess().getExistingKeyword_2()); 
            // InternalFeatureLangParser.g:1040:2: ( Existing )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Existing) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalFeatureLangParser.g:1040:3: Existing
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
    // InternalFeatureLangParser.g:1048:1: rule__UpdateAction__Group__3 : rule__UpdateAction__Group__3__Impl rule__UpdateAction__Group__4 ;
    public final void rule__UpdateAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1052:1: ( rule__UpdateAction__Group__3__Impl rule__UpdateAction__Group__4 )
            // InternalFeatureLangParser.g:1053:2: rule__UpdateAction__Group__3__Impl rule__UpdateAction__Group__4
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
    // InternalFeatureLangParser.g:1060:1: rule__UpdateAction__Group__3__Impl : ( ( rule__UpdateAction__AttributeAssignment_3 ) ) ;
    public final void rule__UpdateAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1064:1: ( ( ( rule__UpdateAction__AttributeAssignment_3 ) ) )
            // InternalFeatureLangParser.g:1065:1: ( ( rule__UpdateAction__AttributeAssignment_3 ) )
            {
            // InternalFeatureLangParser.g:1065:1: ( ( rule__UpdateAction__AttributeAssignment_3 ) )
            // InternalFeatureLangParser.g:1066:2: ( rule__UpdateAction__AttributeAssignment_3 )
            {
             before(grammarAccess.getUpdateActionAccess().getAttributeAssignment_3()); 
            // InternalFeatureLangParser.g:1067:2: ( rule__UpdateAction__AttributeAssignment_3 )
            // InternalFeatureLangParser.g:1067:3: rule__UpdateAction__AttributeAssignment_3
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
    // InternalFeatureLangParser.g:1075:1: rule__UpdateAction__Group__4 : rule__UpdateAction__Group__4__Impl rule__UpdateAction__Group__5 ;
    public final void rule__UpdateAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1079:1: ( rule__UpdateAction__Group__4__Impl rule__UpdateAction__Group__5 )
            // InternalFeatureLangParser.g:1080:2: rule__UpdateAction__Group__4__Impl rule__UpdateAction__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalFeatureLangParser.g:1087:1: rule__UpdateAction__Group__4__Impl : ( FullStop ) ;
    public final void rule__UpdateAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1091:1: ( ( FullStop ) )
            // InternalFeatureLangParser.g:1092:1: ( FullStop )
            {
            // InternalFeatureLangParser.g:1092:1: ( FullStop )
            // InternalFeatureLangParser.g:1093:2: FullStop
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
    // InternalFeatureLangParser.g:1102:1: rule__UpdateAction__Group__5 : rule__UpdateAction__Group__5__Impl rule__UpdateAction__Group__6 ;
    public final void rule__UpdateAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1106:1: ( rule__UpdateAction__Group__5__Impl rule__UpdateAction__Group__6 )
            // InternalFeatureLangParser.g:1107:2: rule__UpdateAction__Group__5__Impl rule__UpdateAction__Group__6
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
    // InternalFeatureLangParser.g:1114:1: rule__UpdateAction__Group__5__Impl : ( It ) ;
    public final void rule__UpdateAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1118:1: ( ( It ) )
            // InternalFeatureLangParser.g:1119:1: ( It )
            {
            // InternalFeatureLangParser.g:1119:1: ( It )
            // InternalFeatureLangParser.g:1120:2: It
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
    // InternalFeatureLangParser.g:1129:1: rule__UpdateAction__Group__6 : rule__UpdateAction__Group__6__Impl rule__UpdateAction__Group__7 ;
    public final void rule__UpdateAction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1133:1: ( rule__UpdateAction__Group__6__Impl rule__UpdateAction__Group__7 )
            // InternalFeatureLangParser.g:1134:2: rule__UpdateAction__Group__6__Impl rule__UpdateAction__Group__7
            {
            pushFollow(FOLLOW_12);
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
    // InternalFeatureLangParser.g:1141:1: rule__UpdateAction__Group__6__Impl : ( ( rule__UpdateAction__PriorityAssignment_6 ) ) ;
    public final void rule__UpdateAction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1145:1: ( ( ( rule__UpdateAction__PriorityAssignment_6 ) ) )
            // InternalFeatureLangParser.g:1146:1: ( ( rule__UpdateAction__PriorityAssignment_6 ) )
            {
            // InternalFeatureLangParser.g:1146:1: ( ( rule__UpdateAction__PriorityAssignment_6 ) )
            // InternalFeatureLangParser.g:1147:2: ( rule__UpdateAction__PriorityAssignment_6 )
            {
             before(grammarAccess.getUpdateActionAccess().getPriorityAssignment_6()); 
            // InternalFeatureLangParser.g:1148:2: ( rule__UpdateAction__PriorityAssignment_6 )
            // InternalFeatureLangParser.g:1148:3: rule__UpdateAction__PriorityAssignment_6
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
    // InternalFeatureLangParser.g:1156:1: rule__UpdateAction__Group__7 : rule__UpdateAction__Group__7__Impl rule__UpdateAction__Group__8 ;
    public final void rule__UpdateAction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1160:1: ( rule__UpdateAction__Group__7__Impl rule__UpdateAction__Group__8 )
            // InternalFeatureLangParser.g:1161:2: rule__UpdateAction__Group__7__Impl rule__UpdateAction__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__UpdateAction__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateAction__Group__8();

            state._fsp--;


            }

        }
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
    // InternalFeatureLangParser.g:1168:1: rule__UpdateAction__Group__7__Impl : ( Be ) ;
    public final void rule__UpdateAction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1172:1: ( ( Be ) )
            // InternalFeatureLangParser.g:1173:1: ( Be )
            {
            // InternalFeatureLangParser.g:1173:1: ( Be )
            // InternalFeatureLangParser.g:1174:2: Be
            {
             before(grammarAccess.getUpdateActionAccess().getBeKeyword_7()); 
            match(input,Be,FOLLOW_2); 
             after(grammarAccess.getUpdateActionAccess().getBeKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__UpdateAction__Group__8"
    // InternalFeatureLangParser.g:1183:1: rule__UpdateAction__Group__8 : rule__UpdateAction__Group__8__Impl rule__UpdateAction__Group__9 ;
    public final void rule__UpdateAction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1187:1: ( rule__UpdateAction__Group__8__Impl rule__UpdateAction__Group__9 )
            // InternalFeatureLangParser.g:1188:2: rule__UpdateAction__Group__8__Impl rule__UpdateAction__Group__9
            {
            pushFollow(FOLLOW_14);
            rule__UpdateAction__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateAction__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAction__Group__8"


    // $ANTLR start "rule__UpdateAction__Group__8__Impl"
    // InternalFeatureLangParser.g:1195:1: rule__UpdateAction__Group__8__Impl : ( A ) ;
    public final void rule__UpdateAction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1199:1: ( ( A ) )
            // InternalFeatureLangParser.g:1200:1: ( A )
            {
            // InternalFeatureLangParser.g:1200:1: ( A )
            // InternalFeatureLangParser.g:1201:2: A
            {
             before(grammarAccess.getUpdateActionAccess().getAKeyword_8()); 
            match(input,A,FOLLOW_2); 
             after(grammarAccess.getUpdateActionAccess().getAKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAction__Group__8__Impl"


    // $ANTLR start "rule__UpdateAction__Group__9"
    // InternalFeatureLangParser.g:1210:1: rule__UpdateAction__Group__9 : rule__UpdateAction__Group__9__Impl ;
    public final void rule__UpdateAction__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1214:1: ( rule__UpdateAction__Group__9__Impl )
            // InternalFeatureLangParser.g:1215:2: rule__UpdateAction__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UpdateAction__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAction__Group__9"


    // $ANTLR start "rule__UpdateAction__Group__9__Impl"
    // InternalFeatureLangParser.g:1221:1: rule__UpdateAction__Group__9__Impl : ( ( rule__UpdateAction__TypeAssignment_9 ) ) ;
    public final void rule__UpdateAction__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1225:1: ( ( ( rule__UpdateAction__TypeAssignment_9 ) ) )
            // InternalFeatureLangParser.g:1226:1: ( ( rule__UpdateAction__TypeAssignment_9 ) )
            {
            // InternalFeatureLangParser.g:1226:1: ( ( rule__UpdateAction__TypeAssignment_9 ) )
            // InternalFeatureLangParser.g:1227:2: ( rule__UpdateAction__TypeAssignment_9 )
            {
             before(grammarAccess.getUpdateActionAccess().getTypeAssignment_9()); 
            // InternalFeatureLangParser.g:1228:2: ( rule__UpdateAction__TypeAssignment_9 )
            // InternalFeatureLangParser.g:1228:3: rule__UpdateAction__TypeAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__UpdateAction__TypeAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getUpdateActionAccess().getTypeAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAction__Group__9__Impl"


    // $ANTLR start "rule__AttributeAction__Group__0"
    // InternalFeatureLangParser.g:1237:1: rule__AttributeAction__Group__0 : rule__AttributeAction__Group__0__Impl rule__AttributeAction__Group__1 ;
    public final void rule__AttributeAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1241:1: ( rule__AttributeAction__Group__0__Impl rule__AttributeAction__Group__1 )
            // InternalFeatureLangParser.g:1242:2: rule__AttributeAction__Group__0__Impl rule__AttributeAction__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalFeatureLangParser.g:1249:1: rule__AttributeAction__Group__0__Impl : ( Have ) ;
    public final void rule__AttributeAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1253:1: ( ( Have ) )
            // InternalFeatureLangParser.g:1254:1: ( Have )
            {
            // InternalFeatureLangParser.g:1254:1: ( Have )
            // InternalFeatureLangParser.g:1255:2: Have
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
    // InternalFeatureLangParser.g:1264:1: rule__AttributeAction__Group__1 : rule__AttributeAction__Group__1__Impl rule__AttributeAction__Group__2 ;
    public final void rule__AttributeAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1268:1: ( rule__AttributeAction__Group__1__Impl rule__AttributeAction__Group__2 )
            // InternalFeatureLangParser.g:1269:2: rule__AttributeAction__Group__1__Impl rule__AttributeAction__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalFeatureLangParser.g:1276:1: rule__AttributeAction__Group__1__Impl : ( ( rule__AttributeAction__Alternatives_1 ) ) ;
    public final void rule__AttributeAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1280:1: ( ( ( rule__AttributeAction__Alternatives_1 ) ) )
            // InternalFeatureLangParser.g:1281:1: ( ( rule__AttributeAction__Alternatives_1 ) )
            {
            // InternalFeatureLangParser.g:1281:1: ( ( rule__AttributeAction__Alternatives_1 ) )
            // InternalFeatureLangParser.g:1282:2: ( rule__AttributeAction__Alternatives_1 )
            {
             before(grammarAccess.getAttributeActionAccess().getAlternatives_1()); 
            // InternalFeatureLangParser.g:1283:2: ( rule__AttributeAction__Alternatives_1 )
            // InternalFeatureLangParser.g:1283:3: rule__AttributeAction__Alternatives_1
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
    // InternalFeatureLangParser.g:1291:1: rule__AttributeAction__Group__2 : rule__AttributeAction__Group__2__Impl rule__AttributeAction__Group__3 ;
    public final void rule__AttributeAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1295:1: ( rule__AttributeAction__Group__2__Impl rule__AttributeAction__Group__3 )
            // InternalFeatureLangParser.g:1296:2: rule__AttributeAction__Group__2__Impl rule__AttributeAction__Group__3
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
    // InternalFeatureLangParser.g:1303:1: rule__AttributeAction__Group__2__Impl : ( ( rule__AttributeAction__AttributeAssignment_2 ) ) ;
    public final void rule__AttributeAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1307:1: ( ( ( rule__AttributeAction__AttributeAssignment_2 ) ) )
            // InternalFeatureLangParser.g:1308:1: ( ( rule__AttributeAction__AttributeAssignment_2 ) )
            {
            // InternalFeatureLangParser.g:1308:1: ( ( rule__AttributeAction__AttributeAssignment_2 ) )
            // InternalFeatureLangParser.g:1309:2: ( rule__AttributeAction__AttributeAssignment_2 )
            {
             before(grammarAccess.getAttributeActionAccess().getAttributeAssignment_2()); 
            // InternalFeatureLangParser.g:1310:2: ( rule__AttributeAction__AttributeAssignment_2 )
            // InternalFeatureLangParser.g:1310:3: rule__AttributeAction__AttributeAssignment_2
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
    // InternalFeatureLangParser.g:1318:1: rule__AttributeAction__Group__3 : rule__AttributeAction__Group__3__Impl rule__AttributeAction__Group__4 ;
    public final void rule__AttributeAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1322:1: ( rule__AttributeAction__Group__3__Impl rule__AttributeAction__Group__4 )
            // InternalFeatureLangParser.g:1323:2: rule__AttributeAction__Group__3__Impl rule__AttributeAction__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalFeatureLangParser.g:1330:1: rule__AttributeAction__Group__3__Impl : ( FullStop ) ;
    public final void rule__AttributeAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1334:1: ( ( FullStop ) )
            // InternalFeatureLangParser.g:1335:1: ( FullStop )
            {
            // InternalFeatureLangParser.g:1335:1: ( FullStop )
            // InternalFeatureLangParser.g:1336:2: FullStop
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
    // InternalFeatureLangParser.g:1345:1: rule__AttributeAction__Group__4 : rule__AttributeAction__Group__4__Impl ;
    public final void rule__AttributeAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1349:1: ( rule__AttributeAction__Group__4__Impl )
            // InternalFeatureLangParser.g:1350:2: rule__AttributeAction__Group__4__Impl
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
    // InternalFeatureLangParser.g:1356:1: rule__AttributeAction__Group__4__Impl : ( ( rule__AttributeAction__Group_4__0 )? ) ;
    public final void rule__AttributeAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1360:1: ( ( ( rule__AttributeAction__Group_4__0 )? ) )
            // InternalFeatureLangParser.g:1361:1: ( ( rule__AttributeAction__Group_4__0 )? )
            {
            // InternalFeatureLangParser.g:1361:1: ( ( rule__AttributeAction__Group_4__0 )? )
            // InternalFeatureLangParser.g:1362:2: ( rule__AttributeAction__Group_4__0 )?
            {
             before(grammarAccess.getAttributeActionAccess().getGroup_4()); 
            // InternalFeatureLangParser.g:1363:2: ( rule__AttributeAction__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==It) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalFeatureLangParser.g:1363:3: rule__AttributeAction__Group_4__0
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
    // InternalFeatureLangParser.g:1372:1: rule__AttributeAction__Group_4__0 : rule__AttributeAction__Group_4__0__Impl rule__AttributeAction__Group_4__1 ;
    public final void rule__AttributeAction__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1376:1: ( rule__AttributeAction__Group_4__0__Impl rule__AttributeAction__Group_4__1 )
            // InternalFeatureLangParser.g:1377:2: rule__AttributeAction__Group_4__0__Impl rule__AttributeAction__Group_4__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalFeatureLangParser.g:1384:1: rule__AttributeAction__Group_4__0__Impl : ( It ) ;
    public final void rule__AttributeAction__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1388:1: ( ( It ) )
            // InternalFeatureLangParser.g:1389:1: ( It )
            {
            // InternalFeatureLangParser.g:1389:1: ( It )
            // InternalFeatureLangParser.g:1390:2: It
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
    // InternalFeatureLangParser.g:1399:1: rule__AttributeAction__Group_4__1 : rule__AttributeAction__Group_4__1__Impl rule__AttributeAction__Group_4__2 ;
    public final void rule__AttributeAction__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1403:1: ( rule__AttributeAction__Group_4__1__Impl rule__AttributeAction__Group_4__2 )
            // InternalFeatureLangParser.g:1404:2: rule__AttributeAction__Group_4__1__Impl rule__AttributeAction__Group_4__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalFeatureLangParser.g:1411:1: rule__AttributeAction__Group_4__1__Impl : ( Is ) ;
    public final void rule__AttributeAction__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1415:1: ( ( Is ) )
            // InternalFeatureLangParser.g:1416:1: ( Is )
            {
            // InternalFeatureLangParser.g:1416:1: ( Is )
            // InternalFeatureLangParser.g:1417:2: Is
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
    // InternalFeatureLangParser.g:1426:1: rule__AttributeAction__Group_4__2 : rule__AttributeAction__Group_4__2__Impl rule__AttributeAction__Group_4__3 ;
    public final void rule__AttributeAction__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1430:1: ( rule__AttributeAction__Group_4__2__Impl rule__AttributeAction__Group_4__3 )
            // InternalFeatureLangParser.g:1431:2: rule__AttributeAction__Group_4__2__Impl rule__AttributeAction__Group_4__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalFeatureLangParser.g:1438:1: rule__AttributeAction__Group_4__2__Impl : ( A ) ;
    public final void rule__AttributeAction__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1442:1: ( ( A ) )
            // InternalFeatureLangParser.g:1443:1: ( A )
            {
            // InternalFeatureLangParser.g:1443:1: ( A )
            // InternalFeatureLangParser.g:1444:2: A
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
    // InternalFeatureLangParser.g:1453:1: rule__AttributeAction__Group_4__3 : rule__AttributeAction__Group_4__3__Impl ;
    public final void rule__AttributeAction__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1457:1: ( rule__AttributeAction__Group_4__3__Impl )
            // InternalFeatureLangParser.g:1458:2: rule__AttributeAction__Group_4__3__Impl
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
    // InternalFeatureLangParser.g:1464:1: rule__AttributeAction__Group_4__3__Impl : ( ( rule__AttributeAction__TypeAssignment_4_3 ) ) ;
    public final void rule__AttributeAction__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1468:1: ( ( ( rule__AttributeAction__TypeAssignment_4_3 ) ) )
            // InternalFeatureLangParser.g:1469:1: ( ( rule__AttributeAction__TypeAssignment_4_3 ) )
            {
            // InternalFeatureLangParser.g:1469:1: ( ( rule__AttributeAction__TypeAssignment_4_3 ) )
            // InternalFeatureLangParser.g:1470:2: ( rule__AttributeAction__TypeAssignment_4_3 )
            {
             before(grammarAccess.getAttributeActionAccess().getTypeAssignment_4_3()); 
            // InternalFeatureLangParser.g:1471:2: ( rule__AttributeAction__TypeAssignment_4_3 )
            // InternalFeatureLangParser.g:1471:3: rule__AttributeAction__TypeAssignment_4_3
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
    // InternalFeatureLangParser.g:1480:1: rule__AssociationAction__Group__0 : rule__AssociationAction__Group__0__Impl rule__AssociationAction__Group__1 ;
    public final void rule__AssociationAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1484:1: ( rule__AssociationAction__Group__0__Impl rule__AssociationAction__Group__1 )
            // InternalFeatureLangParser.g:1485:2: rule__AssociationAction__Group__0__Impl rule__AssociationAction__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalFeatureLangParser.g:1492:1: rule__AssociationAction__Group__0__Impl : ( Have ) ;
    public final void rule__AssociationAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1496:1: ( ( Have ) )
            // InternalFeatureLangParser.g:1497:1: ( Have )
            {
            // InternalFeatureLangParser.g:1497:1: ( Have )
            // InternalFeatureLangParser.g:1498:2: Have
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
    // InternalFeatureLangParser.g:1507:1: rule__AssociationAction__Group__1 : rule__AssociationAction__Group__1__Impl rule__AssociationAction__Group__2 ;
    public final void rule__AssociationAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1511:1: ( rule__AssociationAction__Group__1__Impl rule__AssociationAction__Group__2 )
            // InternalFeatureLangParser.g:1512:2: rule__AssociationAction__Group__1__Impl rule__AssociationAction__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalFeatureLangParser.g:1519:1: rule__AssociationAction__Group__1__Impl : ( Associations ) ;
    public final void rule__AssociationAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1523:1: ( ( Associations ) )
            // InternalFeatureLangParser.g:1524:1: ( Associations )
            {
            // InternalFeatureLangParser.g:1524:1: ( Associations )
            // InternalFeatureLangParser.g:1525:2: Associations
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
    // InternalFeatureLangParser.g:1534:1: rule__AssociationAction__Group__2 : rule__AssociationAction__Group__2__Impl rule__AssociationAction__Group__3 ;
    public final void rule__AssociationAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1538:1: ( rule__AssociationAction__Group__2__Impl rule__AssociationAction__Group__3 )
            // InternalFeatureLangParser.g:1539:2: rule__AssociationAction__Group__2__Impl rule__AssociationAction__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalFeatureLangParser.g:1546:1: rule__AssociationAction__Group__2__Impl : ( To ) ;
    public final void rule__AssociationAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1550:1: ( ( To ) )
            // InternalFeatureLangParser.g:1551:1: ( To )
            {
            // InternalFeatureLangParser.g:1551:1: ( To )
            // InternalFeatureLangParser.g:1552:2: To
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
    // InternalFeatureLangParser.g:1561:1: rule__AssociationAction__Group__3 : rule__AssociationAction__Group__3__Impl rule__AssociationAction__Group__4 ;
    public final void rule__AssociationAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1565:1: ( rule__AssociationAction__Group__3__Impl rule__AssociationAction__Group__4 )
            // InternalFeatureLangParser.g:1566:2: rule__AssociationAction__Group__3__Impl rule__AssociationAction__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalFeatureLangParser.g:1573:1: rule__AssociationAction__Group__3__Impl : ( ( rule__AssociationAction__TargetAssignment_3 ) ) ;
    public final void rule__AssociationAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1577:1: ( ( ( rule__AssociationAction__TargetAssignment_3 ) ) )
            // InternalFeatureLangParser.g:1578:1: ( ( rule__AssociationAction__TargetAssignment_3 ) )
            {
            // InternalFeatureLangParser.g:1578:1: ( ( rule__AssociationAction__TargetAssignment_3 ) )
            // InternalFeatureLangParser.g:1579:2: ( rule__AssociationAction__TargetAssignment_3 )
            {
             before(grammarAccess.getAssociationActionAccess().getTargetAssignment_3()); 
            // InternalFeatureLangParser.g:1580:2: ( rule__AssociationAction__TargetAssignment_3 )
            // InternalFeatureLangParser.g:1580:3: rule__AssociationAction__TargetAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AssociationAction__TargetAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAssociationActionAccess().getTargetAssignment_3()); 

            }


            }

        }
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
    // InternalFeatureLangParser.g:1588:1: rule__AssociationAction__Group__4 : rule__AssociationAction__Group__4__Impl rule__AssociationAction__Group__5 ;
    public final void rule__AssociationAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1592:1: ( rule__AssociationAction__Group__4__Impl rule__AssociationAction__Group__5 )
            // InternalFeatureLangParser.g:1593:2: rule__AssociationAction__Group__4__Impl rule__AssociationAction__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalFeatureLangParser.g:1600:1: rule__AssociationAction__Group__4__Impl : ( Called ) ;
    public final void rule__AssociationAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1604:1: ( ( Called ) )
            // InternalFeatureLangParser.g:1605:1: ( Called )
            {
            // InternalFeatureLangParser.g:1605:1: ( Called )
            // InternalFeatureLangParser.g:1606:2: Called
            {
             before(grammarAccess.getAssociationActionAccess().getCalledKeyword_4()); 
            match(input,Called,FOLLOW_2); 
             after(grammarAccess.getAssociationActionAccess().getCalledKeyword_4()); 

            }


            }

        }
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
    // InternalFeatureLangParser.g:1615:1: rule__AssociationAction__Group__5 : rule__AssociationAction__Group__5__Impl ;
    public final void rule__AssociationAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1619:1: ( rule__AssociationAction__Group__5__Impl )
            // InternalFeatureLangParser.g:1620:2: rule__AssociationAction__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociationAction__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalFeatureLangParser.g:1626:1: rule__AssociationAction__Group__5__Impl : ( ( rule__AssociationAction__RelationAssignment_5 ) ) ;
    public final void rule__AssociationAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1630:1: ( ( ( rule__AssociationAction__RelationAssignment_5 ) ) )
            // InternalFeatureLangParser.g:1631:1: ( ( rule__AssociationAction__RelationAssignment_5 ) )
            {
            // InternalFeatureLangParser.g:1631:1: ( ( rule__AssociationAction__RelationAssignment_5 ) )
            // InternalFeatureLangParser.g:1632:2: ( rule__AssociationAction__RelationAssignment_5 )
            {
             before(grammarAccess.getAssociationActionAccess().getRelationAssignment_5()); 
            // InternalFeatureLangParser.g:1633:2: ( rule__AssociationAction__RelationAssignment_5 )
            // InternalFeatureLangParser.g:1633:3: rule__AssociationAction__RelationAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__AssociationAction__RelationAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAssociationActionAccess().getRelationAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__InheritanceAction__Group__0"
    // InternalFeatureLangParser.g:1642:1: rule__InheritanceAction__Group__0 : rule__InheritanceAction__Group__0__Impl rule__InheritanceAction__Group__1 ;
    public final void rule__InheritanceAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1646:1: ( rule__InheritanceAction__Group__0__Impl rule__InheritanceAction__Group__1 )
            // InternalFeatureLangParser.g:1647:2: rule__InheritanceAction__Group__0__Impl rule__InheritanceAction__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalFeatureLangParser.g:1654:1: rule__InheritanceAction__Group__0__Impl : ( Inherit ) ;
    public final void rule__InheritanceAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1658:1: ( ( Inherit ) )
            // InternalFeatureLangParser.g:1659:1: ( Inherit )
            {
            // InternalFeatureLangParser.g:1659:1: ( Inherit )
            // InternalFeatureLangParser.g:1660:2: Inherit
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
    // InternalFeatureLangParser.g:1669:1: rule__InheritanceAction__Group__1 : rule__InheritanceAction__Group__1__Impl rule__InheritanceAction__Group__2 ;
    public final void rule__InheritanceAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1673:1: ( rule__InheritanceAction__Group__1__Impl rule__InheritanceAction__Group__2 )
            // InternalFeatureLangParser.g:1674:2: rule__InheritanceAction__Group__1__Impl rule__InheritanceAction__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalFeatureLangParser.g:1681:1: rule__InheritanceAction__Group__1__Impl : ( From ) ;
    public final void rule__InheritanceAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1685:1: ( ( From ) )
            // InternalFeatureLangParser.g:1686:1: ( From )
            {
            // InternalFeatureLangParser.g:1686:1: ( From )
            // InternalFeatureLangParser.g:1687:2: From
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
    // InternalFeatureLangParser.g:1696:1: rule__InheritanceAction__Group__2 : rule__InheritanceAction__Group__2__Impl ;
    public final void rule__InheritanceAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1700:1: ( rule__InheritanceAction__Group__2__Impl )
            // InternalFeatureLangParser.g:1701:2: rule__InheritanceAction__Group__2__Impl
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
    // InternalFeatureLangParser.g:1707:1: rule__InheritanceAction__Group__2__Impl : ( ( rule__InheritanceAction__ParentAssignment_2 ) ) ;
    public final void rule__InheritanceAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1711:1: ( ( ( rule__InheritanceAction__ParentAssignment_2 ) ) )
            // InternalFeatureLangParser.g:1712:1: ( ( rule__InheritanceAction__ParentAssignment_2 ) )
            {
            // InternalFeatureLangParser.g:1712:1: ( ( rule__InheritanceAction__ParentAssignment_2 ) )
            // InternalFeatureLangParser.g:1713:2: ( rule__InheritanceAction__ParentAssignment_2 )
            {
             before(grammarAccess.getInheritanceActionAccess().getParentAssignment_2()); 
            // InternalFeatureLangParser.g:1714:2: ( rule__InheritanceAction__ParentAssignment_2 )
            // InternalFeatureLangParser.g:1714:3: rule__InheritanceAction__ParentAssignment_2
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


    // $ANTLR start "rule__Class__Group__0"
    // InternalFeatureLangParser.g:1723:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1727:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalFeatureLangParser.g:1728:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalFeatureLangParser.g:1735:1: rule__Class__Group__0__Impl : ( ( rule__Class__Alternatives_0 )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1739:1: ( ( ( rule__Class__Alternatives_0 )? ) )
            // InternalFeatureLangParser.g:1740:1: ( ( rule__Class__Alternatives_0 )? )
            {
            // InternalFeatureLangParser.g:1740:1: ( ( rule__Class__Alternatives_0 )? )
            // InternalFeatureLangParser.g:1741:2: ( rule__Class__Alternatives_0 )?
            {
             before(grammarAccess.getClassAccess().getAlternatives_0()); 
            // InternalFeatureLangParser.g:1742:2: ( rule__Class__Alternatives_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==The||LA15_0==A) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalFeatureLangParser.g:1742:3: rule__Class__Alternatives_0
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
    // InternalFeatureLangParser.g:1750:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1754:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalFeatureLangParser.g:1755:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalFeatureLangParser.g:1762:1: rule__Class__Group__1__Impl : ( ( Class )? ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1766:1: ( ( ( Class )? ) )
            // InternalFeatureLangParser.g:1767:1: ( ( Class )? )
            {
            // InternalFeatureLangParser.g:1767:1: ( ( Class )? )
            // InternalFeatureLangParser.g:1768:2: ( Class )?
            {
             before(grammarAccess.getClassAccess().getClassKeyword_1()); 
            // InternalFeatureLangParser.g:1769:2: ( Class )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Class) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalFeatureLangParser.g:1769:3: Class
                    {
                    match(input,Class,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getClassKeyword_1()); 

            }


            }

        }
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
    // InternalFeatureLangParser.g:1777:1: rule__Class__Group__2 : rule__Class__Group__2__Impl ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1781:1: ( rule__Class__Group__2__Impl )
            // InternalFeatureLangParser.g:1782:2: rule__Class__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalFeatureLangParser.g:1788:1: rule__Class__Group__2__Impl : ( ( rule__Class__NameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1792:1: ( ( ( rule__Class__NameAssignment_2 ) ) )
            // InternalFeatureLangParser.g:1793:1: ( ( rule__Class__NameAssignment_2 ) )
            {
            // InternalFeatureLangParser.g:1793:1: ( ( rule__Class__NameAssignment_2 ) )
            // InternalFeatureLangParser.g:1794:2: ( rule__Class__NameAssignment_2 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_2()); 
            // InternalFeatureLangParser.g:1795:2: ( rule__Class__NameAssignment_2 )
            // InternalFeatureLangParser.g:1795:3: rule__Class__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Class__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getNameAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalFeatureLangParser.g:1804:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1808:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalFeatureLangParser.g:1809:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalFeatureLangParser.g:1816:1: rule__Attribute__Group__0__Impl : ( ( Attribute )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1820:1: ( ( ( Attribute )? ) )
            // InternalFeatureLangParser.g:1821:1: ( ( Attribute )? )
            {
            // InternalFeatureLangParser.g:1821:1: ( ( Attribute )? )
            // InternalFeatureLangParser.g:1822:2: ( Attribute )?
            {
             before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
            // InternalFeatureLangParser.g:1823:2: ( Attribute )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Attribute) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalFeatureLangParser.g:1823:3: Attribute
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
    // InternalFeatureLangParser.g:1831:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1835:1: ( rule__Attribute__Group__1__Impl )
            // InternalFeatureLangParser.g:1836:2: rule__Attribute__Group__1__Impl
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
    // InternalFeatureLangParser.g:1842:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1846:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalFeatureLangParser.g:1847:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalFeatureLangParser.g:1847:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalFeatureLangParser.g:1848:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalFeatureLangParser.g:1849:2: ( rule__Attribute__NameAssignment_1 )
            // InternalFeatureLangParser.g:1849:3: rule__Attribute__NameAssignment_1
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


    // $ANTLR start "rule__FeatureRequest__StatementsAssignment"
    // InternalFeatureLangParser.g:1858:1: rule__FeatureRequest__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__FeatureRequest__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1862:1: ( ( ruleStatement ) )
            // InternalFeatureLangParser.g:1863:2: ( ruleStatement )
            {
            // InternalFeatureLangParser.g:1863:2: ( ruleStatement )
            // InternalFeatureLangParser.g:1864:3: ruleStatement
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
    // InternalFeatureLangParser.g:1873:1: rule__ChangeStatement__TargetAssignment_0 : ( ruleClass ) ;
    public final void rule__ChangeStatement__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1877:1: ( ( ruleClass ) )
            // InternalFeatureLangParser.g:1878:2: ( ruleClass )
            {
            // InternalFeatureLangParser.g:1878:2: ( ruleClass )
            // InternalFeatureLangParser.g:1879:3: ruleClass
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
    // InternalFeatureLangParser.g:1888:1: rule__ChangeStatement__PriorityAssignment_1_0_0 : ( rulePriority ) ;
    public final void rule__ChangeStatement__PriorityAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1892:1: ( ( rulePriority ) )
            // InternalFeatureLangParser.g:1893:2: ( rulePriority )
            {
            // InternalFeatureLangParser.g:1893:2: ( rulePriority )
            // InternalFeatureLangParser.g:1894:3: rulePriority
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
    // InternalFeatureLangParser.g:1903:1: rule__ChangeStatement__NegationAssignment_1_0_1 : ( ( Not ) ) ;
    public final void rule__ChangeStatement__NegationAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1907:1: ( ( ( Not ) ) )
            // InternalFeatureLangParser.g:1908:2: ( ( Not ) )
            {
            // InternalFeatureLangParser.g:1908:2: ( ( Not ) )
            // InternalFeatureLangParser.g:1909:3: ( Not )
            {
             before(grammarAccess.getChangeStatementAccess().getNegationNotKeyword_1_0_1_0()); 
            // InternalFeatureLangParser.g:1910:3: ( Not )
            // InternalFeatureLangParser.g:1911:4: Not
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


    // $ANTLR start "rule__ChangeStatement__ActionAssignment_1_0_2"
    // InternalFeatureLangParser.g:1922:1: rule__ChangeStatement__ActionAssignment_1_0_2 : ( ruleAction ) ;
    public final void rule__ChangeStatement__ActionAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1926:1: ( ( ruleAction ) )
            // InternalFeatureLangParser.g:1927:2: ( ruleAction )
            {
            // InternalFeatureLangParser.g:1927:2: ( ruleAction )
            // InternalFeatureLangParser.g:1928:3: ruleAction
            {
             before(grammarAccess.getChangeStatementAccess().getActionActionParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getChangeStatementAccess().getActionActionParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeStatement__ActionAssignment_1_0_2"


    // $ANTLR start "rule__ChangeStatement__UpdateAssignment_1_1"
    // InternalFeatureLangParser.g:1937:1: rule__ChangeStatement__UpdateAssignment_1_1 : ( ruleUpdateAction ) ;
    public final void rule__ChangeStatement__UpdateAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1941:1: ( ( ruleUpdateAction ) )
            // InternalFeatureLangParser.g:1942:2: ( ruleUpdateAction )
            {
            // InternalFeatureLangParser.g:1942:2: ( ruleUpdateAction )
            // InternalFeatureLangParser.g:1943:3: ruleUpdateAction
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
    // InternalFeatureLangParser.g:1952:1: rule__CreationStatement__ClassElementAssignment_0 : ( ruleClass ) ;
    public final void rule__CreationStatement__ClassElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1956:1: ( ( ruleClass ) )
            // InternalFeatureLangParser.g:1957:2: ( ruleClass )
            {
            // InternalFeatureLangParser.g:1957:2: ( ruleClass )
            // InternalFeatureLangParser.g:1958:3: ruleClass
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
    // InternalFeatureLangParser.g:1967:1: rule__CreationStatement__PriorityAssignment_1 : ( rulePriority ) ;
    public final void rule__CreationStatement__PriorityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1971:1: ( ( rulePriority ) )
            // InternalFeatureLangParser.g:1972:2: ( rulePriority )
            {
            // InternalFeatureLangParser.g:1972:2: ( rulePriority )
            // InternalFeatureLangParser.g:1973:3: rulePriority
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
    // InternalFeatureLangParser.g:1982:1: rule__CreationStatement__NegationAssignment_2 : ( ( Not ) ) ;
    public final void rule__CreationStatement__NegationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1986:1: ( ( ( Not ) ) )
            // InternalFeatureLangParser.g:1987:2: ( ( Not ) )
            {
            // InternalFeatureLangParser.g:1987:2: ( ( Not ) )
            // InternalFeatureLangParser.g:1988:3: ( Not )
            {
             before(grammarAccess.getCreationStatementAccess().getNegationNotKeyword_2_0()); 
            // InternalFeatureLangParser.g:1989:3: ( Not )
            // InternalFeatureLangParser.g:1990:4: Not
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
    // InternalFeatureLangParser.g:2001:1: rule__Action__TypeAssignment : ( ( rule__Action__TypeAlternatives_0 ) ) ;
    public final void rule__Action__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2005:1: ( ( ( rule__Action__TypeAlternatives_0 ) ) )
            // InternalFeatureLangParser.g:2006:2: ( ( rule__Action__TypeAlternatives_0 ) )
            {
            // InternalFeatureLangParser.g:2006:2: ( ( rule__Action__TypeAlternatives_0 ) )
            // InternalFeatureLangParser.g:2007:3: ( rule__Action__TypeAlternatives_0 )
            {
             before(grammarAccess.getActionAccess().getTypeAlternatives_0()); 
            // InternalFeatureLangParser.g:2008:3: ( rule__Action__TypeAlternatives_0 )
            // InternalFeatureLangParser.g:2008:4: rule__Action__TypeAlternatives_0
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
    // InternalFeatureLangParser.g:2016:1: rule__UpdateAction__AttributeAssignment_3 : ( ruleAttribute ) ;
    public final void rule__UpdateAction__AttributeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2020:1: ( ( ruleAttribute ) )
            // InternalFeatureLangParser.g:2021:2: ( ruleAttribute )
            {
            // InternalFeatureLangParser.g:2021:2: ( ruleAttribute )
            // InternalFeatureLangParser.g:2022:3: ruleAttribute
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
    // InternalFeatureLangParser.g:2031:1: rule__UpdateAction__PriorityAssignment_6 : ( rulePriority ) ;
    public final void rule__UpdateAction__PriorityAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2035:1: ( ( rulePriority ) )
            // InternalFeatureLangParser.g:2036:2: ( rulePriority )
            {
            // InternalFeatureLangParser.g:2036:2: ( rulePriority )
            // InternalFeatureLangParser.g:2037:3: rulePriority
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


    // $ANTLR start "rule__UpdateAction__TypeAssignment_9"
    // InternalFeatureLangParser.g:2046:1: rule__UpdateAction__TypeAssignment_9 : ( ruleDatatype ) ;
    public final void rule__UpdateAction__TypeAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2050:1: ( ( ruleDatatype ) )
            // InternalFeatureLangParser.g:2051:2: ( ruleDatatype )
            {
            // InternalFeatureLangParser.g:2051:2: ( ruleDatatype )
            // InternalFeatureLangParser.g:2052:3: ruleDatatype
            {
             before(grammarAccess.getUpdateActionAccess().getTypeDatatypeEnumRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleDatatype();

            state._fsp--;

             after(grammarAccess.getUpdateActionAccess().getTypeDatatypeEnumRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateAction__TypeAssignment_9"


    // $ANTLR start "rule__AttributeAction__AttributeAssignment_2"
    // InternalFeatureLangParser.g:2061:1: rule__AttributeAction__AttributeAssignment_2 : ( ruleAttribute ) ;
    public final void rule__AttributeAction__AttributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2065:1: ( ( ruleAttribute ) )
            // InternalFeatureLangParser.g:2066:2: ( ruleAttribute )
            {
            // InternalFeatureLangParser.g:2066:2: ( ruleAttribute )
            // InternalFeatureLangParser.g:2067:3: ruleAttribute
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
    // InternalFeatureLangParser.g:2076:1: rule__AttributeAction__TypeAssignment_4_3 : ( ruleDatatype ) ;
    public final void rule__AttributeAction__TypeAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2080:1: ( ( ruleDatatype ) )
            // InternalFeatureLangParser.g:2081:2: ( ruleDatatype )
            {
            // InternalFeatureLangParser.g:2081:2: ( ruleDatatype )
            // InternalFeatureLangParser.g:2082:3: ruleDatatype
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


    // $ANTLR start "rule__AssociationAction__TargetAssignment_3"
    // InternalFeatureLangParser.g:2091:1: rule__AssociationAction__TargetAssignment_3 : ( ruleClass ) ;
    public final void rule__AssociationAction__TargetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2095:1: ( ( ruleClass ) )
            // InternalFeatureLangParser.g:2096:2: ( ruleClass )
            {
            // InternalFeatureLangParser.g:2096:2: ( ruleClass )
            // InternalFeatureLangParser.g:2097:3: ruleClass
            {
             before(grammarAccess.getAssociationActionAccess().getTargetClassParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getAssociationActionAccess().getTargetClassParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationAction__TargetAssignment_3"


    // $ANTLR start "rule__AssociationAction__RelationAssignment_5"
    // InternalFeatureLangParser.g:2106:1: rule__AssociationAction__RelationAssignment_5 : ( RULE_ID ) ;
    public final void rule__AssociationAction__RelationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2110:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:2111:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:2111:2: ( RULE_ID )
            // InternalFeatureLangParser.g:2112:3: RULE_ID
            {
             before(grammarAccess.getAssociationActionAccess().getRelationIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssociationActionAccess().getRelationIDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationAction__RelationAssignment_5"


    // $ANTLR start "rule__InheritanceAction__ParentAssignment_2"
    // InternalFeatureLangParser.g:2121:1: rule__InheritanceAction__ParentAssignment_2 : ( ruleClass ) ;
    public final void rule__InheritanceAction__ParentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2125:1: ( ( ruleClass ) )
            // InternalFeatureLangParser.g:2126:2: ( ruleClass )
            {
            // InternalFeatureLangParser.g:2126:2: ( ruleClass )
            // InternalFeatureLangParser.g:2127:3: ruleClass
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


    // $ANTLR start "rule__Class__NameAssignment_2"
    // InternalFeatureLangParser.g:2136:1: rule__Class__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2140:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:2141:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:2141:2: ( RULE_ID )
            // InternalFeatureLangParser.g:2142:3: RULE_ID
            {
             before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__NameAssignment_2"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalFeatureLangParser.g:2151:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2155:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:2156:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:2156:2: ( RULE_ID )
            // InternalFeatureLangParser.g:2157:3: RULE_ID
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


    // $ANTLR start "rule__Priority__PriorityAssignment"
    // InternalFeatureLangParser.g:2166:1: rule__Priority__PriorityAssignment : ( rulePriorityValue ) ;
    public final void rule__Priority__PriorityAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2170:1: ( ( rulePriorityValue ) )
            // InternalFeatureLangParser.g:2171:2: ( rulePriorityValue )
            {
            // InternalFeatureLangParser.g:2171:2: ( rulePriorityValue )
            // InternalFeatureLangParser.g:2172:3: rulePriorityValue
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
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\3\14\1\34\1\13\2\7\1\uffff\1\7\1\uffff";
    static final String dfa_3s = "\4\34\1\22\2\26\1\uffff\1\26\1\uffff";
    static final String dfa_4s = "\7\uffff\1\1\1\uffff\1\2";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\7\uffff\1\1\6\uffff\1\2\1\4",
            "\1\3\17\uffff\1\4",
            "\1\3\17\uffff\1\4",
            "\1\4",
            "\1\5\4\uffff\1\6\1\uffff\1\7",
            "\1\7\5\uffff\1\11\1\uffff\1\7\3\uffff\1\10\2\uffff\1\11",
            "\1\7\5\uffff\1\11\1\uffff\1\7\3\uffff\1\10\2\uffff\1\11",
            "",
            "\1\7\5\uffff\1\11\1\uffff\1\7\6\uffff\1\11",
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
            return "490:1: rule__Statement__Alternatives_0 : ( ( ruleChangeStatement ) | ( ruleCreationStatement ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000018101002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000050800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000088080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000482000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010000060L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020600L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000018101000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000004000L});

}