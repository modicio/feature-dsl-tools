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
    		tokenNameToValue.put("There", "'there'");
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
    // InternalFeatureLangParser.g:80:1: entryRuleFeatureRequest : ruleFeatureRequest EOF ;
    public final void entryRuleFeatureRequest() throws RecognitionException {
        try {
            // InternalFeatureLangParser.g:81:1: ( ruleFeatureRequest EOF )
            // InternalFeatureLangParser.g:82:1: ruleFeatureRequest EOF
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
    // InternalFeatureLangParser.g:89:1: ruleFeatureRequest : ( ( rule__FeatureRequest__StatementsAssignment )* ) ;
    public final void ruleFeatureRequest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:93:2: ( ( ( rule__FeatureRequest__StatementsAssignment )* ) )
            // InternalFeatureLangParser.g:94:2: ( ( rule__FeatureRequest__StatementsAssignment )* )
            {
            // InternalFeatureLangParser.g:94:2: ( ( rule__FeatureRequest__StatementsAssignment )* )
            // InternalFeatureLangParser.g:95:3: ( rule__FeatureRequest__StatementsAssignment )*
            {
             before(grammarAccess.getFeatureRequestAccess().getStatementsAssignment()); 
            // InternalFeatureLangParser.g:96:3: ( rule__FeatureRequest__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Class||LA1_0==There||LA1_0==The||LA1_0==It||(LA1_0>=A && LA1_0<=RULE_ID)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFeatureLangParser.g:96:4: rule__FeatureRequest__StatementsAssignment
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
    // InternalFeatureLangParser.g:105:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalFeatureLangParser.g:106:1: ( ruleStatement EOF )
            // InternalFeatureLangParser.g:107:1: ruleStatement EOF
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
    // InternalFeatureLangParser.g:114:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:118:2: ( ( ( rule__Statement__Group__0 ) ) )
            // InternalFeatureLangParser.g:119:2: ( ( rule__Statement__Group__0 ) )
            {
            // InternalFeatureLangParser.g:119:2: ( ( rule__Statement__Group__0 ) )
            // InternalFeatureLangParser.g:120:3: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // InternalFeatureLangParser.g:121:3: ( rule__Statement__Group__0 )
            // InternalFeatureLangParser.g:121:4: rule__Statement__Group__0
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
    // InternalFeatureLangParser.g:130:1: entryRuleChangeStatement : ruleChangeStatement EOF ;
    public final void entryRuleChangeStatement() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:134:1: ( ruleChangeStatement EOF )
            // InternalFeatureLangParser.g:135:1: ruleChangeStatement EOF
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
    // InternalFeatureLangParser.g:145:1: ruleChangeStatement : ( ( rule__ChangeStatement__Group__0 ) ) ;
    public final void ruleChangeStatement() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:150:2: ( ( ( rule__ChangeStatement__Group__0 ) ) )
            // InternalFeatureLangParser.g:151:2: ( ( rule__ChangeStatement__Group__0 ) )
            {
            // InternalFeatureLangParser.g:151:2: ( ( rule__ChangeStatement__Group__0 ) )
            // InternalFeatureLangParser.g:152:3: ( rule__ChangeStatement__Group__0 )
            {
             before(grammarAccess.getChangeStatementAccess().getGroup()); 
            // InternalFeatureLangParser.g:153:3: ( rule__ChangeStatement__Group__0 )
            // InternalFeatureLangParser.g:153:4: rule__ChangeStatement__Group__0
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
    // InternalFeatureLangParser.g:163:1: entryRuleCreationStatement : ruleCreationStatement EOF ;
    public final void entryRuleCreationStatement() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:167:1: ( ruleCreationStatement EOF )
            // InternalFeatureLangParser.g:168:1: ruleCreationStatement EOF
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
    // InternalFeatureLangParser.g:178:1: ruleCreationStatement : ( ( rule__CreationStatement__Group__0 ) ) ;
    public final void ruleCreationStatement() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:183:2: ( ( ( rule__CreationStatement__Group__0 ) ) )
            // InternalFeatureLangParser.g:184:2: ( ( rule__CreationStatement__Group__0 ) )
            {
            // InternalFeatureLangParser.g:184:2: ( ( rule__CreationStatement__Group__0 ) )
            // InternalFeatureLangParser.g:185:3: ( rule__CreationStatement__Group__0 )
            {
             before(grammarAccess.getCreationStatementAccess().getGroup()); 
            // InternalFeatureLangParser.g:186:3: ( rule__CreationStatement__Group__0 )
            // InternalFeatureLangParser.g:186:4: rule__CreationStatement__Group__0
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
    // InternalFeatureLangParser.g:196:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:200:1: ( ruleAction EOF )
            // InternalFeatureLangParser.g:201:1: ruleAction EOF
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
    // InternalFeatureLangParser.g:211:1: ruleAction : ( ( rule__Action__TypeAssignment ) ) ;
    public final void ruleAction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:216:2: ( ( ( rule__Action__TypeAssignment ) ) )
            // InternalFeatureLangParser.g:217:2: ( ( rule__Action__TypeAssignment ) )
            {
            // InternalFeatureLangParser.g:217:2: ( ( rule__Action__TypeAssignment ) )
            // InternalFeatureLangParser.g:218:3: ( rule__Action__TypeAssignment )
            {
             before(grammarAccess.getActionAccess().getTypeAssignment()); 
            // InternalFeatureLangParser.g:219:3: ( rule__Action__TypeAssignment )
            // InternalFeatureLangParser.g:219:4: rule__Action__TypeAssignment
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
    // InternalFeatureLangParser.g:229:1: entryRuleUpdateAction : ruleUpdateAction EOF ;
    public final void entryRuleUpdateAction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:233:1: ( ruleUpdateAction EOF )
            // InternalFeatureLangParser.g:234:1: ruleUpdateAction EOF
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
    // InternalFeatureLangParser.g:244:1: ruleUpdateAction : ( ( rule__UpdateAction__Group__0 ) ) ;
    public final void ruleUpdateAction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:249:2: ( ( ( rule__UpdateAction__Group__0 ) ) )
            // InternalFeatureLangParser.g:250:2: ( ( rule__UpdateAction__Group__0 ) )
            {
            // InternalFeatureLangParser.g:250:2: ( ( rule__UpdateAction__Group__0 ) )
            // InternalFeatureLangParser.g:251:3: ( rule__UpdateAction__Group__0 )
            {
             before(grammarAccess.getUpdateActionAccess().getGroup()); 
            // InternalFeatureLangParser.g:252:3: ( rule__UpdateAction__Group__0 )
            // InternalFeatureLangParser.g:252:4: rule__UpdateAction__Group__0
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
    // InternalFeatureLangParser.g:262:1: entryRuleAttributeAction : ruleAttributeAction EOF ;
    public final void entryRuleAttributeAction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:266:1: ( ruleAttributeAction EOF )
            // InternalFeatureLangParser.g:267:1: ruleAttributeAction EOF
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
    // InternalFeatureLangParser.g:277:1: ruleAttributeAction : ( ( rule__AttributeAction__Group__0 ) ) ;
    public final void ruleAttributeAction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:282:2: ( ( ( rule__AttributeAction__Group__0 ) ) )
            // InternalFeatureLangParser.g:283:2: ( ( rule__AttributeAction__Group__0 ) )
            {
            // InternalFeatureLangParser.g:283:2: ( ( rule__AttributeAction__Group__0 ) )
            // InternalFeatureLangParser.g:284:3: ( rule__AttributeAction__Group__0 )
            {
             before(grammarAccess.getAttributeActionAccess().getGroup()); 
            // InternalFeatureLangParser.g:285:3: ( rule__AttributeAction__Group__0 )
            // InternalFeatureLangParser.g:285:4: rule__AttributeAction__Group__0
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
    // InternalFeatureLangParser.g:295:1: entryRuleAssociationAction : ruleAssociationAction EOF ;
    public final void entryRuleAssociationAction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:299:1: ( ruleAssociationAction EOF )
            // InternalFeatureLangParser.g:300:1: ruleAssociationAction EOF
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
    // InternalFeatureLangParser.g:310:1: ruleAssociationAction : ( ( rule__AssociationAction__Group__0 ) ) ;
    public final void ruleAssociationAction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:315:2: ( ( ( rule__AssociationAction__Group__0 ) ) )
            // InternalFeatureLangParser.g:316:2: ( ( rule__AssociationAction__Group__0 ) )
            {
            // InternalFeatureLangParser.g:316:2: ( ( rule__AssociationAction__Group__0 ) )
            // InternalFeatureLangParser.g:317:3: ( rule__AssociationAction__Group__0 )
            {
             before(grammarAccess.getAssociationActionAccess().getGroup()); 
            // InternalFeatureLangParser.g:318:3: ( rule__AssociationAction__Group__0 )
            // InternalFeatureLangParser.g:318:4: rule__AssociationAction__Group__0
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
    // InternalFeatureLangParser.g:328:1: entryRuleInheritanceAction : ruleInheritanceAction EOF ;
    public final void entryRuleInheritanceAction() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:332:1: ( ruleInheritanceAction EOF )
            // InternalFeatureLangParser.g:333:1: ruleInheritanceAction EOF
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
    // InternalFeatureLangParser.g:343:1: ruleInheritanceAction : ( ( rule__InheritanceAction__Group__0 ) ) ;
    public final void ruleInheritanceAction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:348:2: ( ( ( rule__InheritanceAction__Group__0 ) ) )
            // InternalFeatureLangParser.g:349:2: ( ( rule__InheritanceAction__Group__0 ) )
            {
            // InternalFeatureLangParser.g:349:2: ( ( rule__InheritanceAction__Group__0 ) )
            // InternalFeatureLangParser.g:350:3: ( rule__InheritanceAction__Group__0 )
            {
             before(grammarAccess.getInheritanceActionAccess().getGroup()); 
            // InternalFeatureLangParser.g:351:3: ( rule__InheritanceAction__Group__0 )
            // InternalFeatureLangParser.g:351:4: rule__InheritanceAction__Group__0
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
    // InternalFeatureLangParser.g:361:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:365:1: ( ruleClass EOF )
            // InternalFeatureLangParser.g:366:1: ruleClass EOF
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
    // InternalFeatureLangParser.g:376:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:381:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalFeatureLangParser.g:382:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalFeatureLangParser.g:382:2: ( ( rule__Class__Group__0 ) )
            // InternalFeatureLangParser.g:383:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalFeatureLangParser.g:384:3: ( rule__Class__Group__0 )
            // InternalFeatureLangParser.g:384:4: rule__Class__Group__0
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
    // InternalFeatureLangParser.g:394:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:398:1: ( ruleAttribute EOF )
            // InternalFeatureLangParser.g:399:1: ruleAttribute EOF
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
    // InternalFeatureLangParser.g:409:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:414:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalFeatureLangParser.g:415:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalFeatureLangParser.g:415:2: ( ( rule__Attribute__Group__0 ) )
            // InternalFeatureLangParser.g:416:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalFeatureLangParser.g:417:3: ( rule__Attribute__Group__0 )
            // InternalFeatureLangParser.g:417:4: rule__Attribute__Group__0
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
    // InternalFeatureLangParser.g:427:1: entryRulePriority : rulePriority EOF ;
    public final void entryRulePriority() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalFeatureLangParser.g:431:1: ( rulePriority EOF )
            // InternalFeatureLangParser.g:432:1: rulePriority EOF
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
    // InternalFeatureLangParser.g:442:1: rulePriority : ( ( rule__Priority__PriorityAssignment ) ) ;
    public final void rulePriority() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:447:2: ( ( ( rule__Priority__PriorityAssignment ) ) )
            // InternalFeatureLangParser.g:448:2: ( ( rule__Priority__PriorityAssignment ) )
            {
            // InternalFeatureLangParser.g:448:2: ( ( rule__Priority__PriorityAssignment ) )
            // InternalFeatureLangParser.g:449:3: ( rule__Priority__PriorityAssignment )
            {
             before(grammarAccess.getPriorityAccess().getPriorityAssignment()); 
            // InternalFeatureLangParser.g:450:3: ( rule__Priority__PriorityAssignment )
            // InternalFeatureLangParser.g:450:4: rule__Priority__PriorityAssignment
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
    // InternalFeatureLangParser.g:460:1: rulePriorityValue : ( ( rule__PriorityValue__Alternatives ) ) ;
    public final void rulePriorityValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:464:1: ( ( ( rule__PriorityValue__Alternatives ) ) )
            // InternalFeatureLangParser.g:465:2: ( ( rule__PriorityValue__Alternatives ) )
            {
            // InternalFeatureLangParser.g:465:2: ( ( rule__PriorityValue__Alternatives ) )
            // InternalFeatureLangParser.g:466:3: ( rule__PriorityValue__Alternatives )
            {
             before(grammarAccess.getPriorityValueAccess().getAlternatives()); 
            // InternalFeatureLangParser.g:467:3: ( rule__PriorityValue__Alternatives )
            // InternalFeatureLangParser.g:467:4: rule__PriorityValue__Alternatives
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
    // InternalFeatureLangParser.g:476:1: ruleDatatype : ( ( rule__Datatype__Alternatives ) ) ;
    public final void ruleDatatype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:480:1: ( ( ( rule__Datatype__Alternatives ) ) )
            // InternalFeatureLangParser.g:481:2: ( ( rule__Datatype__Alternatives ) )
            {
            // InternalFeatureLangParser.g:481:2: ( ( rule__Datatype__Alternatives ) )
            // InternalFeatureLangParser.g:482:3: ( rule__Datatype__Alternatives )
            {
             before(grammarAccess.getDatatypeAccess().getAlternatives()); 
            // InternalFeatureLangParser.g:483:3: ( rule__Datatype__Alternatives )
            // InternalFeatureLangParser.g:483:4: rule__Datatype__Alternatives
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
    // InternalFeatureLangParser.g:491:1: rule__Statement__Alternatives_0 : ( ( ruleChangeStatement ) | ( ruleCreationStatement ) );
    public final void rule__Statement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:495:1: ( ( ruleChangeStatement ) | ( ruleCreationStatement ) )
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
                    // InternalFeatureLangParser.g:496:2: ( ruleChangeStatement )
                    {
                    // InternalFeatureLangParser.g:496:2: ( ruleChangeStatement )
                    // InternalFeatureLangParser.g:497:3: ruleChangeStatement
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
                    // InternalFeatureLangParser.g:502:2: ( ruleCreationStatement )
                    {
                    // InternalFeatureLangParser.g:502:2: ( ruleCreationStatement )
                    // InternalFeatureLangParser.g:503:3: ruleCreationStatement
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
    // InternalFeatureLangParser.g:512:1: rule__ChangeStatement__Alternatives_1 : ( ( ( rule__ChangeStatement__Group_1_0__0 ) ) | ( ( rule__ChangeStatement__UpdateAssignment_1_1 ) ) );
    public final void rule__ChangeStatement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:516:1: ( ( ( rule__ChangeStatement__Group_1_0__0 ) ) | ( ( rule__ChangeStatement__UpdateAssignment_1_1 ) ) )
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
                    // InternalFeatureLangParser.g:517:2: ( ( rule__ChangeStatement__Group_1_0__0 ) )
                    {
                    // InternalFeatureLangParser.g:517:2: ( ( rule__ChangeStatement__Group_1_0__0 ) )
                    // InternalFeatureLangParser.g:518:3: ( rule__ChangeStatement__Group_1_0__0 )
                    {
                     before(grammarAccess.getChangeStatementAccess().getGroup_1_0()); 
                    // InternalFeatureLangParser.g:519:3: ( rule__ChangeStatement__Group_1_0__0 )
                    // InternalFeatureLangParser.g:519:4: rule__ChangeStatement__Group_1_0__0
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
                    // InternalFeatureLangParser.g:523:2: ( ( rule__ChangeStatement__UpdateAssignment_1_1 ) )
                    {
                    // InternalFeatureLangParser.g:523:2: ( ( rule__ChangeStatement__UpdateAssignment_1_1 ) )
                    // InternalFeatureLangParser.g:524:3: ( rule__ChangeStatement__UpdateAssignment_1_1 )
                    {
                     before(grammarAccess.getChangeStatementAccess().getUpdateAssignment_1_1()); 
                    // InternalFeatureLangParser.g:525:3: ( rule__ChangeStatement__UpdateAssignment_1_1 )
                    // InternalFeatureLangParser.g:525:4: rule__ChangeStatement__UpdateAssignment_1_1
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


    // $ANTLR start "rule__CreationStatement__Alternatives_0"
    // InternalFeatureLangParser.g:533:1: rule__CreationStatement__Alternatives_0 : ( ( It ) | ( There ) );
    public final void rule__CreationStatement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:537:1: ( ( It ) | ( There ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==It) ) {
                alt4=1;
            }
            else if ( (LA4_0==There) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalFeatureLangParser.g:538:2: ( It )
                    {
                    // InternalFeatureLangParser.g:538:2: ( It )
                    // InternalFeatureLangParser.g:539:3: It
                    {
                     before(grammarAccess.getCreationStatementAccess().getItKeyword_0_0()); 
                    match(input,It,FOLLOW_2); 
                     after(grammarAccess.getCreationStatementAccess().getItKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:544:2: ( There )
                    {
                    // InternalFeatureLangParser.g:544:2: ( There )
                    // InternalFeatureLangParser.g:545:3: There
                    {
                     before(grammarAccess.getCreationStatementAccess().getThereKeyword_0_1()); 
                    match(input,There,FOLLOW_2); 
                     after(grammarAccess.getCreationStatementAccess().getThereKeyword_0_1()); 

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
    // $ANTLR end "rule__CreationStatement__Alternatives_0"


    // $ANTLR start "rule__CreationStatement__Alternatives_3"
    // InternalFeatureLangParser.g:554:1: rule__CreationStatement__Alternatives_3 : ( ( Exist ) | ( Be ) );
    public final void rule__CreationStatement__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:558:1: ( ( Exist ) | ( Be ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Exist) ) {
                alt5=1;
            }
            else if ( (LA5_0==Be) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalFeatureLangParser.g:559:2: ( Exist )
                    {
                    // InternalFeatureLangParser.g:559:2: ( Exist )
                    // InternalFeatureLangParser.g:560:3: Exist
                    {
                     before(grammarAccess.getCreationStatementAccess().getExistKeyword_3_0()); 
                    match(input,Exist,FOLLOW_2); 
                     after(grammarAccess.getCreationStatementAccess().getExistKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:565:2: ( Be )
                    {
                    // InternalFeatureLangParser.g:565:2: ( Be )
                    // InternalFeatureLangParser.g:566:3: Be
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
    // InternalFeatureLangParser.g:575:1: rule__Action__TypeAlternatives_0 : ( ( ruleAttributeAction ) | ( ruleAssociationAction ) | ( ruleInheritanceAction ) );
    public final void rule__Action__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:579:1: ( ( ruleAttributeAction ) | ( ruleAssociationAction ) | ( ruleInheritanceAction ) )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Have) ) {
                int LA6_1 = input.LA(2);

                if ( ((LA6_1>=The && LA6_1<=An)) ) {
                    alt6=1;
                }
                else if ( (LA6_1==Associations) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==Inherit) ) {
                alt6=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalFeatureLangParser.g:580:2: ( ruleAttributeAction )
                    {
                    // InternalFeatureLangParser.g:580:2: ( ruleAttributeAction )
                    // InternalFeatureLangParser.g:581:3: ruleAttributeAction
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
                    // InternalFeatureLangParser.g:586:2: ( ruleAssociationAction )
                    {
                    // InternalFeatureLangParser.g:586:2: ( ruleAssociationAction )
                    // InternalFeatureLangParser.g:587:3: ruleAssociationAction
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
                    // InternalFeatureLangParser.g:592:2: ( ruleInheritanceAction )
                    {
                    // InternalFeatureLangParser.g:592:2: ( ruleInheritanceAction )
                    // InternalFeatureLangParser.g:593:3: ruleInheritanceAction
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
    // InternalFeatureLangParser.g:602:1: rule__AttributeAction__Alternatives_1 : ( ( The ) | ( An ) );
    public final void rule__AttributeAction__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:606:1: ( ( The ) | ( An ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==The) ) {
                alt7=1;
            }
            else if ( (LA7_0==An) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalFeatureLangParser.g:607:2: ( The )
                    {
                    // InternalFeatureLangParser.g:607:2: ( The )
                    // InternalFeatureLangParser.g:608:3: The
                    {
                     before(grammarAccess.getAttributeActionAccess().getTheKeyword_1_0()); 
                    match(input,The,FOLLOW_2); 
                     after(grammarAccess.getAttributeActionAccess().getTheKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:613:2: ( An )
                    {
                    // InternalFeatureLangParser.g:613:2: ( An )
                    // InternalFeatureLangParser.g:614:3: An
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
    // InternalFeatureLangParser.g:623:1: rule__Class__Alternatives_0 : ( ( The ) | ( A ) );
    public final void rule__Class__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:627:1: ( ( The ) | ( A ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==The) ) {
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
                    // InternalFeatureLangParser.g:628:2: ( The )
                    {
                    // InternalFeatureLangParser.g:628:2: ( The )
                    // InternalFeatureLangParser.g:629:3: The
                    {
                     before(grammarAccess.getClassAccess().getTheKeyword_0_0()); 
                    match(input,The,FOLLOW_2); 
                     after(grammarAccess.getClassAccess().getTheKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:634:2: ( A )
                    {
                    // InternalFeatureLangParser.g:634:2: ( A )
                    // InternalFeatureLangParser.g:635:3: A
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
    // InternalFeatureLangParser.g:644:1: rule__PriorityValue__Alternatives : ( ( ( Should ) ) | ( ( Must ) ) );
    public final void rule__PriorityValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:648:1: ( ( ( Should ) ) | ( ( Must ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Should) ) {
                alt9=1;
            }
            else if ( (LA9_0==Must) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalFeatureLangParser.g:649:2: ( ( Should ) )
                    {
                    // InternalFeatureLangParser.g:649:2: ( ( Should ) )
                    // InternalFeatureLangParser.g:650:3: ( Should )
                    {
                     before(grammarAccess.getPriorityValueAccess().getSHOULDEnumLiteralDeclaration_0()); 
                    // InternalFeatureLangParser.g:651:3: ( Should )
                    // InternalFeatureLangParser.g:651:4: Should
                    {
                    match(input,Should,FOLLOW_2); 

                    }

                     after(grammarAccess.getPriorityValueAccess().getSHOULDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:655:2: ( ( Must ) )
                    {
                    // InternalFeatureLangParser.g:655:2: ( ( Must ) )
                    // InternalFeatureLangParser.g:656:3: ( Must )
                    {
                     before(grammarAccess.getPriorityValueAccess().getMUSTEnumLiteralDeclaration_1()); 
                    // InternalFeatureLangParser.g:657:3: ( Must )
                    // InternalFeatureLangParser.g:657:4: Must
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
    // InternalFeatureLangParser.g:665:1: rule__Datatype__Alternatives : ( ( ( Time ) ) | ( ( Phrase ) ) | ( ( Number ) ) );
    public final void rule__Datatype__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:669:1: ( ( ( Time ) ) | ( ( Phrase ) ) | ( ( Number ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case Time:
                {
                alt10=1;
                }
                break;
            case Phrase:
                {
                alt10=2;
                }
                break;
            case Number:
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
                    // InternalFeatureLangParser.g:670:2: ( ( Time ) )
                    {
                    // InternalFeatureLangParser.g:670:2: ( ( Time ) )
                    // InternalFeatureLangParser.g:671:3: ( Time )
                    {
                     before(grammarAccess.getDatatypeAccess().getWORDEnumLiteralDeclaration_0()); 
                    // InternalFeatureLangParser.g:672:3: ( Time )
                    // InternalFeatureLangParser.g:672:4: Time
                    {
                    match(input,Time,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatatypeAccess().getWORDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLangParser.g:676:2: ( ( Phrase ) )
                    {
                    // InternalFeatureLangParser.g:676:2: ( ( Phrase ) )
                    // InternalFeatureLangParser.g:677:3: ( Phrase )
                    {
                     before(grammarAccess.getDatatypeAccess().getPHRASEEnumLiteralDeclaration_1()); 
                    // InternalFeatureLangParser.g:678:3: ( Phrase )
                    // InternalFeatureLangParser.g:678:4: Phrase
                    {
                    match(input,Phrase,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatatypeAccess().getPHRASEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureLangParser.g:682:2: ( ( Number ) )
                    {
                    // InternalFeatureLangParser.g:682:2: ( ( Number ) )
                    // InternalFeatureLangParser.g:683:3: ( Number )
                    {
                     before(grammarAccess.getDatatypeAccess().getNUMBEREnumLiteralDeclaration_2()); 
                    // InternalFeatureLangParser.g:684:3: ( Number )
                    // InternalFeatureLangParser.g:684:4: Number
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
    // InternalFeatureLangParser.g:692:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:696:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalFeatureLangParser.g:697:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
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
    // InternalFeatureLangParser.g:704:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__Alternatives_0 ) ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:708:1: ( ( ( rule__Statement__Alternatives_0 ) ) )
            // InternalFeatureLangParser.g:709:1: ( ( rule__Statement__Alternatives_0 ) )
            {
            // InternalFeatureLangParser.g:709:1: ( ( rule__Statement__Alternatives_0 ) )
            // InternalFeatureLangParser.g:710:2: ( rule__Statement__Alternatives_0 )
            {
             before(grammarAccess.getStatementAccess().getAlternatives_0()); 
            // InternalFeatureLangParser.g:711:2: ( rule__Statement__Alternatives_0 )
            // InternalFeatureLangParser.g:711:3: rule__Statement__Alternatives_0
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
    // InternalFeatureLangParser.g:719:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:723:1: ( rule__Statement__Group__1__Impl )
            // InternalFeatureLangParser.g:724:2: rule__Statement__Group__1__Impl
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
    // InternalFeatureLangParser.g:730:1: rule__Statement__Group__1__Impl : ( ( FullStop )? ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:734:1: ( ( ( FullStop )? ) )
            // InternalFeatureLangParser.g:735:1: ( ( FullStop )? )
            {
            // InternalFeatureLangParser.g:735:1: ( ( FullStop )? )
            // InternalFeatureLangParser.g:736:2: ( FullStop )?
            {
             before(grammarAccess.getStatementAccess().getFullStopKeyword_1()); 
            // InternalFeatureLangParser.g:737:2: ( FullStop )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==FullStop) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalFeatureLangParser.g:737:3: FullStop
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
    // InternalFeatureLangParser.g:746:1: rule__ChangeStatement__Group__0 : rule__ChangeStatement__Group__0__Impl rule__ChangeStatement__Group__1 ;
    public final void rule__ChangeStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:750:1: ( rule__ChangeStatement__Group__0__Impl rule__ChangeStatement__Group__1 )
            // InternalFeatureLangParser.g:751:2: rule__ChangeStatement__Group__0__Impl rule__ChangeStatement__Group__1
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
    // InternalFeatureLangParser.g:758:1: rule__ChangeStatement__Group__0__Impl : ( ( rule__ChangeStatement__TargetAssignment_0 ) ) ;
    public final void rule__ChangeStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:762:1: ( ( ( rule__ChangeStatement__TargetAssignment_0 ) ) )
            // InternalFeatureLangParser.g:763:1: ( ( rule__ChangeStatement__TargetAssignment_0 ) )
            {
            // InternalFeatureLangParser.g:763:1: ( ( rule__ChangeStatement__TargetAssignment_0 ) )
            // InternalFeatureLangParser.g:764:2: ( rule__ChangeStatement__TargetAssignment_0 )
            {
             before(grammarAccess.getChangeStatementAccess().getTargetAssignment_0()); 
            // InternalFeatureLangParser.g:765:2: ( rule__ChangeStatement__TargetAssignment_0 )
            // InternalFeatureLangParser.g:765:3: rule__ChangeStatement__TargetAssignment_0
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
    // InternalFeatureLangParser.g:773:1: rule__ChangeStatement__Group__1 : rule__ChangeStatement__Group__1__Impl ;
    public final void rule__ChangeStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:777:1: ( rule__ChangeStatement__Group__1__Impl )
            // InternalFeatureLangParser.g:778:2: rule__ChangeStatement__Group__1__Impl
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
    // InternalFeatureLangParser.g:784:1: rule__ChangeStatement__Group__1__Impl : ( ( rule__ChangeStatement__Alternatives_1 ) ) ;
    public final void rule__ChangeStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:788:1: ( ( ( rule__ChangeStatement__Alternatives_1 ) ) )
            // InternalFeatureLangParser.g:789:1: ( ( rule__ChangeStatement__Alternatives_1 ) )
            {
            // InternalFeatureLangParser.g:789:1: ( ( rule__ChangeStatement__Alternatives_1 ) )
            // InternalFeatureLangParser.g:790:2: ( rule__ChangeStatement__Alternatives_1 )
            {
             before(grammarAccess.getChangeStatementAccess().getAlternatives_1()); 
            // InternalFeatureLangParser.g:791:2: ( rule__ChangeStatement__Alternatives_1 )
            // InternalFeatureLangParser.g:791:3: rule__ChangeStatement__Alternatives_1
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
    // InternalFeatureLangParser.g:800:1: rule__ChangeStatement__Group_1_0__0 : rule__ChangeStatement__Group_1_0__0__Impl rule__ChangeStatement__Group_1_0__1 ;
    public final void rule__ChangeStatement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:804:1: ( rule__ChangeStatement__Group_1_0__0__Impl rule__ChangeStatement__Group_1_0__1 )
            // InternalFeatureLangParser.g:805:2: rule__ChangeStatement__Group_1_0__0__Impl rule__ChangeStatement__Group_1_0__1
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
    // InternalFeatureLangParser.g:812:1: rule__ChangeStatement__Group_1_0__0__Impl : ( ( rule__ChangeStatement__PriorityAssignment_1_0_0 ) ) ;
    public final void rule__ChangeStatement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:816:1: ( ( ( rule__ChangeStatement__PriorityAssignment_1_0_0 ) ) )
            // InternalFeatureLangParser.g:817:1: ( ( rule__ChangeStatement__PriorityAssignment_1_0_0 ) )
            {
            // InternalFeatureLangParser.g:817:1: ( ( rule__ChangeStatement__PriorityAssignment_1_0_0 ) )
            // InternalFeatureLangParser.g:818:2: ( rule__ChangeStatement__PriorityAssignment_1_0_0 )
            {
             before(grammarAccess.getChangeStatementAccess().getPriorityAssignment_1_0_0()); 
            // InternalFeatureLangParser.g:819:2: ( rule__ChangeStatement__PriorityAssignment_1_0_0 )
            // InternalFeatureLangParser.g:819:3: rule__ChangeStatement__PriorityAssignment_1_0_0
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
    // InternalFeatureLangParser.g:827:1: rule__ChangeStatement__Group_1_0__1 : rule__ChangeStatement__Group_1_0__1__Impl rule__ChangeStatement__Group_1_0__2 ;
    public final void rule__ChangeStatement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:831:1: ( rule__ChangeStatement__Group_1_0__1__Impl rule__ChangeStatement__Group_1_0__2 )
            // InternalFeatureLangParser.g:832:2: rule__ChangeStatement__Group_1_0__1__Impl rule__ChangeStatement__Group_1_0__2
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
    // InternalFeatureLangParser.g:839:1: rule__ChangeStatement__Group_1_0__1__Impl : ( ( rule__ChangeStatement__NegationAssignment_1_0_1 )? ) ;
    public final void rule__ChangeStatement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:843:1: ( ( ( rule__ChangeStatement__NegationAssignment_1_0_1 )? ) )
            // InternalFeatureLangParser.g:844:1: ( ( rule__ChangeStatement__NegationAssignment_1_0_1 )? )
            {
            // InternalFeatureLangParser.g:844:1: ( ( rule__ChangeStatement__NegationAssignment_1_0_1 )? )
            // InternalFeatureLangParser.g:845:2: ( rule__ChangeStatement__NegationAssignment_1_0_1 )?
            {
             before(grammarAccess.getChangeStatementAccess().getNegationAssignment_1_0_1()); 
            // InternalFeatureLangParser.g:846:2: ( rule__ChangeStatement__NegationAssignment_1_0_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Not) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalFeatureLangParser.g:846:3: rule__ChangeStatement__NegationAssignment_1_0_1
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
    // InternalFeatureLangParser.g:854:1: rule__ChangeStatement__Group_1_0__2 : rule__ChangeStatement__Group_1_0__2__Impl ;
    public final void rule__ChangeStatement__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:858:1: ( rule__ChangeStatement__Group_1_0__2__Impl )
            // InternalFeatureLangParser.g:859:2: rule__ChangeStatement__Group_1_0__2__Impl
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
    // InternalFeatureLangParser.g:865:1: rule__ChangeStatement__Group_1_0__2__Impl : ( ( rule__ChangeStatement__ActionAssignment_1_0_2 ) ) ;
    public final void rule__ChangeStatement__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:869:1: ( ( ( rule__ChangeStatement__ActionAssignment_1_0_2 ) ) )
            // InternalFeatureLangParser.g:870:1: ( ( rule__ChangeStatement__ActionAssignment_1_0_2 ) )
            {
            // InternalFeatureLangParser.g:870:1: ( ( rule__ChangeStatement__ActionAssignment_1_0_2 ) )
            // InternalFeatureLangParser.g:871:2: ( rule__ChangeStatement__ActionAssignment_1_0_2 )
            {
             before(grammarAccess.getChangeStatementAccess().getActionAssignment_1_0_2()); 
            // InternalFeatureLangParser.g:872:2: ( rule__ChangeStatement__ActionAssignment_1_0_2 )
            // InternalFeatureLangParser.g:872:3: rule__ChangeStatement__ActionAssignment_1_0_2
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
    // InternalFeatureLangParser.g:881:1: rule__CreationStatement__Group__0 : rule__CreationStatement__Group__0__Impl rule__CreationStatement__Group__1 ;
    public final void rule__CreationStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:885:1: ( rule__CreationStatement__Group__0__Impl rule__CreationStatement__Group__1 )
            // InternalFeatureLangParser.g:886:2: rule__CreationStatement__Group__0__Impl rule__CreationStatement__Group__1
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
    // InternalFeatureLangParser.g:893:1: rule__CreationStatement__Group__0__Impl : ( ( rule__CreationStatement__Alternatives_0 ) ) ;
    public final void rule__CreationStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:897:1: ( ( ( rule__CreationStatement__Alternatives_0 ) ) )
            // InternalFeatureLangParser.g:898:1: ( ( rule__CreationStatement__Alternatives_0 ) )
            {
            // InternalFeatureLangParser.g:898:1: ( ( rule__CreationStatement__Alternatives_0 ) )
            // InternalFeatureLangParser.g:899:2: ( rule__CreationStatement__Alternatives_0 )
            {
             before(grammarAccess.getCreationStatementAccess().getAlternatives_0()); 
            // InternalFeatureLangParser.g:900:2: ( rule__CreationStatement__Alternatives_0 )
            // InternalFeatureLangParser.g:900:3: rule__CreationStatement__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__CreationStatement__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getCreationStatementAccess().getAlternatives_0()); 

            }


            }

        }
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
    // InternalFeatureLangParser.g:908:1: rule__CreationStatement__Group__1 : rule__CreationStatement__Group__1__Impl rule__CreationStatement__Group__2 ;
    public final void rule__CreationStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:912:1: ( rule__CreationStatement__Group__1__Impl rule__CreationStatement__Group__2 )
            // InternalFeatureLangParser.g:913:2: rule__CreationStatement__Group__1__Impl rule__CreationStatement__Group__2
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
    // InternalFeatureLangParser.g:920:1: rule__CreationStatement__Group__1__Impl : ( ( rule__CreationStatement__PriorityAssignment_1 ) ) ;
    public final void rule__CreationStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:924:1: ( ( ( rule__CreationStatement__PriorityAssignment_1 ) ) )
            // InternalFeatureLangParser.g:925:1: ( ( rule__CreationStatement__PriorityAssignment_1 ) )
            {
            // InternalFeatureLangParser.g:925:1: ( ( rule__CreationStatement__PriorityAssignment_1 ) )
            // InternalFeatureLangParser.g:926:2: ( rule__CreationStatement__PriorityAssignment_1 )
            {
             before(grammarAccess.getCreationStatementAccess().getPriorityAssignment_1()); 
            // InternalFeatureLangParser.g:927:2: ( rule__CreationStatement__PriorityAssignment_1 )
            // InternalFeatureLangParser.g:927:3: rule__CreationStatement__PriorityAssignment_1
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
    // InternalFeatureLangParser.g:935:1: rule__CreationStatement__Group__2 : rule__CreationStatement__Group__2__Impl rule__CreationStatement__Group__3 ;
    public final void rule__CreationStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:939:1: ( rule__CreationStatement__Group__2__Impl rule__CreationStatement__Group__3 )
            // InternalFeatureLangParser.g:940:2: rule__CreationStatement__Group__2__Impl rule__CreationStatement__Group__3
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
    // InternalFeatureLangParser.g:947:1: rule__CreationStatement__Group__2__Impl : ( ( rule__CreationStatement__NegationAssignment_2 )? ) ;
    public final void rule__CreationStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:951:1: ( ( ( rule__CreationStatement__NegationAssignment_2 )? ) )
            // InternalFeatureLangParser.g:952:1: ( ( rule__CreationStatement__NegationAssignment_2 )? )
            {
            // InternalFeatureLangParser.g:952:1: ( ( rule__CreationStatement__NegationAssignment_2 )? )
            // InternalFeatureLangParser.g:953:2: ( rule__CreationStatement__NegationAssignment_2 )?
            {
             before(grammarAccess.getCreationStatementAccess().getNegationAssignment_2()); 
            // InternalFeatureLangParser.g:954:2: ( rule__CreationStatement__NegationAssignment_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Not) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalFeatureLangParser.g:954:3: rule__CreationStatement__NegationAssignment_2
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
    // InternalFeatureLangParser.g:962:1: rule__CreationStatement__Group__3 : rule__CreationStatement__Group__3__Impl rule__CreationStatement__Group__4 ;
    public final void rule__CreationStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:966:1: ( rule__CreationStatement__Group__3__Impl rule__CreationStatement__Group__4 )
            // InternalFeatureLangParser.g:967:2: rule__CreationStatement__Group__3__Impl rule__CreationStatement__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__CreationStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreationStatement__Group__4();

            state._fsp--;


            }

        }
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
    // InternalFeatureLangParser.g:974:1: rule__CreationStatement__Group__3__Impl : ( ( rule__CreationStatement__Alternatives_3 ) ) ;
    public final void rule__CreationStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:978:1: ( ( ( rule__CreationStatement__Alternatives_3 ) ) )
            // InternalFeatureLangParser.g:979:1: ( ( rule__CreationStatement__Alternatives_3 ) )
            {
            // InternalFeatureLangParser.g:979:1: ( ( rule__CreationStatement__Alternatives_3 ) )
            // InternalFeatureLangParser.g:980:2: ( rule__CreationStatement__Alternatives_3 )
            {
             before(grammarAccess.getCreationStatementAccess().getAlternatives_3()); 
            // InternalFeatureLangParser.g:981:2: ( rule__CreationStatement__Alternatives_3 )
            // InternalFeatureLangParser.g:981:3: rule__CreationStatement__Alternatives_3
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


    // $ANTLR start "rule__CreationStatement__Group__4"
    // InternalFeatureLangParser.g:989:1: rule__CreationStatement__Group__4 : rule__CreationStatement__Group__4__Impl ;
    public final void rule__CreationStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:993:1: ( rule__CreationStatement__Group__4__Impl )
            // InternalFeatureLangParser.g:994:2: rule__CreationStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CreationStatement__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreationStatement__Group__4"


    // $ANTLR start "rule__CreationStatement__Group__4__Impl"
    // InternalFeatureLangParser.g:1000:1: rule__CreationStatement__Group__4__Impl : ( ( rule__CreationStatement__ClassElementAssignment_4 ) ) ;
    public final void rule__CreationStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1004:1: ( ( ( rule__CreationStatement__ClassElementAssignment_4 ) ) )
            // InternalFeatureLangParser.g:1005:1: ( ( rule__CreationStatement__ClassElementAssignment_4 ) )
            {
            // InternalFeatureLangParser.g:1005:1: ( ( rule__CreationStatement__ClassElementAssignment_4 ) )
            // InternalFeatureLangParser.g:1006:2: ( rule__CreationStatement__ClassElementAssignment_4 )
            {
             before(grammarAccess.getCreationStatementAccess().getClassElementAssignment_4()); 
            // InternalFeatureLangParser.g:1007:2: ( rule__CreationStatement__ClassElementAssignment_4 )
            // InternalFeatureLangParser.g:1007:3: rule__CreationStatement__ClassElementAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CreationStatement__ClassElementAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCreationStatementAccess().getClassElementAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreationStatement__Group__4__Impl"


    // $ANTLR start "rule__UpdateAction__Group__0"
    // InternalFeatureLangParser.g:1016:1: rule__UpdateAction__Group__0 : rule__UpdateAction__Group__0__Impl rule__UpdateAction__Group__1 ;
    public final void rule__UpdateAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1020:1: ( rule__UpdateAction__Group__0__Impl rule__UpdateAction__Group__1 )
            // InternalFeatureLangParser.g:1021:2: rule__UpdateAction__Group__0__Impl rule__UpdateAction__Group__1
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
    // InternalFeatureLangParser.g:1028:1: rule__UpdateAction__Group__0__Impl : ( Has ) ;
    public final void rule__UpdateAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1032:1: ( ( Has ) )
            // InternalFeatureLangParser.g:1033:1: ( Has )
            {
            // InternalFeatureLangParser.g:1033:1: ( Has )
            // InternalFeatureLangParser.g:1034:2: Has
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
    // InternalFeatureLangParser.g:1043:1: rule__UpdateAction__Group__1 : rule__UpdateAction__Group__1__Impl rule__UpdateAction__Group__2 ;
    public final void rule__UpdateAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1047:1: ( rule__UpdateAction__Group__1__Impl rule__UpdateAction__Group__2 )
            // InternalFeatureLangParser.g:1048:2: rule__UpdateAction__Group__1__Impl rule__UpdateAction__Group__2
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
    // InternalFeatureLangParser.g:1055:1: rule__UpdateAction__Group__1__Impl : ( An ) ;
    public final void rule__UpdateAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1059:1: ( ( An ) )
            // InternalFeatureLangParser.g:1060:1: ( An )
            {
            // InternalFeatureLangParser.g:1060:1: ( An )
            // InternalFeatureLangParser.g:1061:2: An
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
    // InternalFeatureLangParser.g:1070:1: rule__UpdateAction__Group__2 : rule__UpdateAction__Group__2__Impl rule__UpdateAction__Group__3 ;
    public final void rule__UpdateAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1074:1: ( rule__UpdateAction__Group__2__Impl rule__UpdateAction__Group__3 )
            // InternalFeatureLangParser.g:1075:2: rule__UpdateAction__Group__2__Impl rule__UpdateAction__Group__3
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
    // InternalFeatureLangParser.g:1082:1: rule__UpdateAction__Group__2__Impl : ( ( Existing )? ) ;
    public final void rule__UpdateAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1086:1: ( ( ( Existing )? ) )
            // InternalFeatureLangParser.g:1087:1: ( ( Existing )? )
            {
            // InternalFeatureLangParser.g:1087:1: ( ( Existing )? )
            // InternalFeatureLangParser.g:1088:2: ( Existing )?
            {
             before(grammarAccess.getUpdateActionAccess().getExistingKeyword_2()); 
            // InternalFeatureLangParser.g:1089:2: ( Existing )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Existing) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalFeatureLangParser.g:1089:3: Existing
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
    // InternalFeatureLangParser.g:1097:1: rule__UpdateAction__Group__3 : rule__UpdateAction__Group__3__Impl rule__UpdateAction__Group__4 ;
    public final void rule__UpdateAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1101:1: ( rule__UpdateAction__Group__3__Impl rule__UpdateAction__Group__4 )
            // InternalFeatureLangParser.g:1102:2: rule__UpdateAction__Group__3__Impl rule__UpdateAction__Group__4
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
    // InternalFeatureLangParser.g:1109:1: rule__UpdateAction__Group__3__Impl : ( ( rule__UpdateAction__AttributeAssignment_3 ) ) ;
    public final void rule__UpdateAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1113:1: ( ( ( rule__UpdateAction__AttributeAssignment_3 ) ) )
            // InternalFeatureLangParser.g:1114:1: ( ( rule__UpdateAction__AttributeAssignment_3 ) )
            {
            // InternalFeatureLangParser.g:1114:1: ( ( rule__UpdateAction__AttributeAssignment_3 ) )
            // InternalFeatureLangParser.g:1115:2: ( rule__UpdateAction__AttributeAssignment_3 )
            {
             before(grammarAccess.getUpdateActionAccess().getAttributeAssignment_3()); 
            // InternalFeatureLangParser.g:1116:2: ( rule__UpdateAction__AttributeAssignment_3 )
            // InternalFeatureLangParser.g:1116:3: rule__UpdateAction__AttributeAssignment_3
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
    // InternalFeatureLangParser.g:1124:1: rule__UpdateAction__Group__4 : rule__UpdateAction__Group__4__Impl rule__UpdateAction__Group__5 ;
    public final void rule__UpdateAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1128:1: ( rule__UpdateAction__Group__4__Impl rule__UpdateAction__Group__5 )
            // InternalFeatureLangParser.g:1129:2: rule__UpdateAction__Group__4__Impl rule__UpdateAction__Group__5
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
    // InternalFeatureLangParser.g:1136:1: rule__UpdateAction__Group__4__Impl : ( FullStop ) ;
    public final void rule__UpdateAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1140:1: ( ( FullStop ) )
            // InternalFeatureLangParser.g:1141:1: ( FullStop )
            {
            // InternalFeatureLangParser.g:1141:1: ( FullStop )
            // InternalFeatureLangParser.g:1142:2: FullStop
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
    // InternalFeatureLangParser.g:1151:1: rule__UpdateAction__Group__5 : rule__UpdateAction__Group__5__Impl rule__UpdateAction__Group__6 ;
    public final void rule__UpdateAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1155:1: ( rule__UpdateAction__Group__5__Impl rule__UpdateAction__Group__6 )
            // InternalFeatureLangParser.g:1156:2: rule__UpdateAction__Group__5__Impl rule__UpdateAction__Group__6
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
    // InternalFeatureLangParser.g:1163:1: rule__UpdateAction__Group__5__Impl : ( It ) ;
    public final void rule__UpdateAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1167:1: ( ( It ) )
            // InternalFeatureLangParser.g:1168:1: ( It )
            {
            // InternalFeatureLangParser.g:1168:1: ( It )
            // InternalFeatureLangParser.g:1169:2: It
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
    // InternalFeatureLangParser.g:1178:1: rule__UpdateAction__Group__6 : rule__UpdateAction__Group__6__Impl rule__UpdateAction__Group__7 ;
    public final void rule__UpdateAction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1182:1: ( rule__UpdateAction__Group__6__Impl rule__UpdateAction__Group__7 )
            // InternalFeatureLangParser.g:1183:2: rule__UpdateAction__Group__6__Impl rule__UpdateAction__Group__7
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
    // InternalFeatureLangParser.g:1190:1: rule__UpdateAction__Group__6__Impl : ( ( rule__UpdateAction__PriorityAssignment_6 ) ) ;
    public final void rule__UpdateAction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1194:1: ( ( ( rule__UpdateAction__PriorityAssignment_6 ) ) )
            // InternalFeatureLangParser.g:1195:1: ( ( rule__UpdateAction__PriorityAssignment_6 ) )
            {
            // InternalFeatureLangParser.g:1195:1: ( ( rule__UpdateAction__PriorityAssignment_6 ) )
            // InternalFeatureLangParser.g:1196:2: ( rule__UpdateAction__PriorityAssignment_6 )
            {
             before(grammarAccess.getUpdateActionAccess().getPriorityAssignment_6()); 
            // InternalFeatureLangParser.g:1197:2: ( rule__UpdateAction__PriorityAssignment_6 )
            // InternalFeatureLangParser.g:1197:3: rule__UpdateAction__PriorityAssignment_6
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
    // InternalFeatureLangParser.g:1205:1: rule__UpdateAction__Group__7 : rule__UpdateAction__Group__7__Impl rule__UpdateAction__Group__8 ;
    public final void rule__UpdateAction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1209:1: ( rule__UpdateAction__Group__7__Impl rule__UpdateAction__Group__8 )
            // InternalFeatureLangParser.g:1210:2: rule__UpdateAction__Group__7__Impl rule__UpdateAction__Group__8
            {
            pushFollow(FOLLOW_14);
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
    // InternalFeatureLangParser.g:1217:1: rule__UpdateAction__Group__7__Impl : ( Be ) ;
    public final void rule__UpdateAction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1221:1: ( ( Be ) )
            // InternalFeatureLangParser.g:1222:1: ( Be )
            {
            // InternalFeatureLangParser.g:1222:1: ( Be )
            // InternalFeatureLangParser.g:1223:2: Be
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
    // InternalFeatureLangParser.g:1232:1: rule__UpdateAction__Group__8 : rule__UpdateAction__Group__8__Impl rule__UpdateAction__Group__9 ;
    public final void rule__UpdateAction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1236:1: ( rule__UpdateAction__Group__8__Impl rule__UpdateAction__Group__9 )
            // InternalFeatureLangParser.g:1237:2: rule__UpdateAction__Group__8__Impl rule__UpdateAction__Group__9
            {
            pushFollow(FOLLOW_15);
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
    // InternalFeatureLangParser.g:1244:1: rule__UpdateAction__Group__8__Impl : ( A ) ;
    public final void rule__UpdateAction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1248:1: ( ( A ) )
            // InternalFeatureLangParser.g:1249:1: ( A )
            {
            // InternalFeatureLangParser.g:1249:1: ( A )
            // InternalFeatureLangParser.g:1250:2: A
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
    // InternalFeatureLangParser.g:1259:1: rule__UpdateAction__Group__9 : rule__UpdateAction__Group__9__Impl ;
    public final void rule__UpdateAction__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1263:1: ( rule__UpdateAction__Group__9__Impl )
            // InternalFeatureLangParser.g:1264:2: rule__UpdateAction__Group__9__Impl
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
    // InternalFeatureLangParser.g:1270:1: rule__UpdateAction__Group__9__Impl : ( ( rule__UpdateAction__TypeAssignment_9 ) ) ;
    public final void rule__UpdateAction__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1274:1: ( ( ( rule__UpdateAction__TypeAssignment_9 ) ) )
            // InternalFeatureLangParser.g:1275:1: ( ( rule__UpdateAction__TypeAssignment_9 ) )
            {
            // InternalFeatureLangParser.g:1275:1: ( ( rule__UpdateAction__TypeAssignment_9 ) )
            // InternalFeatureLangParser.g:1276:2: ( rule__UpdateAction__TypeAssignment_9 )
            {
             before(grammarAccess.getUpdateActionAccess().getTypeAssignment_9()); 
            // InternalFeatureLangParser.g:1277:2: ( rule__UpdateAction__TypeAssignment_9 )
            // InternalFeatureLangParser.g:1277:3: rule__UpdateAction__TypeAssignment_9
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
    // InternalFeatureLangParser.g:1286:1: rule__AttributeAction__Group__0 : rule__AttributeAction__Group__0__Impl rule__AttributeAction__Group__1 ;
    public final void rule__AttributeAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1290:1: ( rule__AttributeAction__Group__0__Impl rule__AttributeAction__Group__1 )
            // InternalFeatureLangParser.g:1291:2: rule__AttributeAction__Group__0__Impl rule__AttributeAction__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalFeatureLangParser.g:1298:1: rule__AttributeAction__Group__0__Impl : ( Have ) ;
    public final void rule__AttributeAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1302:1: ( ( Have ) )
            // InternalFeatureLangParser.g:1303:1: ( Have )
            {
            // InternalFeatureLangParser.g:1303:1: ( Have )
            // InternalFeatureLangParser.g:1304:2: Have
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
    // InternalFeatureLangParser.g:1313:1: rule__AttributeAction__Group__1 : rule__AttributeAction__Group__1__Impl rule__AttributeAction__Group__2 ;
    public final void rule__AttributeAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1317:1: ( rule__AttributeAction__Group__1__Impl rule__AttributeAction__Group__2 )
            // InternalFeatureLangParser.g:1318:2: rule__AttributeAction__Group__1__Impl rule__AttributeAction__Group__2
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
    // InternalFeatureLangParser.g:1325:1: rule__AttributeAction__Group__1__Impl : ( ( rule__AttributeAction__Alternatives_1 ) ) ;
    public final void rule__AttributeAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1329:1: ( ( ( rule__AttributeAction__Alternatives_1 ) ) )
            // InternalFeatureLangParser.g:1330:1: ( ( rule__AttributeAction__Alternatives_1 ) )
            {
            // InternalFeatureLangParser.g:1330:1: ( ( rule__AttributeAction__Alternatives_1 ) )
            // InternalFeatureLangParser.g:1331:2: ( rule__AttributeAction__Alternatives_1 )
            {
             before(grammarAccess.getAttributeActionAccess().getAlternatives_1()); 
            // InternalFeatureLangParser.g:1332:2: ( rule__AttributeAction__Alternatives_1 )
            // InternalFeatureLangParser.g:1332:3: rule__AttributeAction__Alternatives_1
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
    // InternalFeatureLangParser.g:1340:1: rule__AttributeAction__Group__2 : rule__AttributeAction__Group__2__Impl rule__AttributeAction__Group__3 ;
    public final void rule__AttributeAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1344:1: ( rule__AttributeAction__Group__2__Impl rule__AttributeAction__Group__3 )
            // InternalFeatureLangParser.g:1345:2: rule__AttributeAction__Group__2__Impl rule__AttributeAction__Group__3
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
    // InternalFeatureLangParser.g:1352:1: rule__AttributeAction__Group__2__Impl : ( ( rule__AttributeAction__AttributeAssignment_2 ) ) ;
    public final void rule__AttributeAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1356:1: ( ( ( rule__AttributeAction__AttributeAssignment_2 ) ) )
            // InternalFeatureLangParser.g:1357:1: ( ( rule__AttributeAction__AttributeAssignment_2 ) )
            {
            // InternalFeatureLangParser.g:1357:1: ( ( rule__AttributeAction__AttributeAssignment_2 ) )
            // InternalFeatureLangParser.g:1358:2: ( rule__AttributeAction__AttributeAssignment_2 )
            {
             before(grammarAccess.getAttributeActionAccess().getAttributeAssignment_2()); 
            // InternalFeatureLangParser.g:1359:2: ( rule__AttributeAction__AttributeAssignment_2 )
            // InternalFeatureLangParser.g:1359:3: rule__AttributeAction__AttributeAssignment_2
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
    // InternalFeatureLangParser.g:1367:1: rule__AttributeAction__Group__3 : rule__AttributeAction__Group__3__Impl rule__AttributeAction__Group__4 ;
    public final void rule__AttributeAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1371:1: ( rule__AttributeAction__Group__3__Impl rule__AttributeAction__Group__4 )
            // InternalFeatureLangParser.g:1372:2: rule__AttributeAction__Group__3__Impl rule__AttributeAction__Group__4
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
    // InternalFeatureLangParser.g:1379:1: rule__AttributeAction__Group__3__Impl : ( FullStop ) ;
    public final void rule__AttributeAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1383:1: ( ( FullStop ) )
            // InternalFeatureLangParser.g:1384:1: ( FullStop )
            {
            // InternalFeatureLangParser.g:1384:1: ( FullStop )
            // InternalFeatureLangParser.g:1385:2: FullStop
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
    // InternalFeatureLangParser.g:1394:1: rule__AttributeAction__Group__4 : rule__AttributeAction__Group__4__Impl ;
    public final void rule__AttributeAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1398:1: ( rule__AttributeAction__Group__4__Impl )
            // InternalFeatureLangParser.g:1399:2: rule__AttributeAction__Group__4__Impl
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
    // InternalFeatureLangParser.g:1405:1: rule__AttributeAction__Group__4__Impl : ( ( rule__AttributeAction__Group_4__0 )? ) ;
    public final void rule__AttributeAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1409:1: ( ( ( rule__AttributeAction__Group_4__0 )? ) )
            // InternalFeatureLangParser.g:1410:1: ( ( rule__AttributeAction__Group_4__0 )? )
            {
            // InternalFeatureLangParser.g:1410:1: ( ( rule__AttributeAction__Group_4__0 )? )
            // InternalFeatureLangParser.g:1411:2: ( rule__AttributeAction__Group_4__0 )?
            {
             before(grammarAccess.getAttributeActionAccess().getGroup_4()); 
            // InternalFeatureLangParser.g:1412:2: ( rule__AttributeAction__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==It) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==Is) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalFeatureLangParser.g:1412:3: rule__AttributeAction__Group_4__0
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
    // InternalFeatureLangParser.g:1421:1: rule__AttributeAction__Group_4__0 : rule__AttributeAction__Group_4__0__Impl rule__AttributeAction__Group_4__1 ;
    public final void rule__AttributeAction__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1425:1: ( rule__AttributeAction__Group_4__0__Impl rule__AttributeAction__Group_4__1 )
            // InternalFeatureLangParser.g:1426:2: rule__AttributeAction__Group_4__0__Impl rule__AttributeAction__Group_4__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalFeatureLangParser.g:1433:1: rule__AttributeAction__Group_4__0__Impl : ( It ) ;
    public final void rule__AttributeAction__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1437:1: ( ( It ) )
            // InternalFeatureLangParser.g:1438:1: ( It )
            {
            // InternalFeatureLangParser.g:1438:1: ( It )
            // InternalFeatureLangParser.g:1439:2: It
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
    // InternalFeatureLangParser.g:1448:1: rule__AttributeAction__Group_4__1 : rule__AttributeAction__Group_4__1__Impl rule__AttributeAction__Group_4__2 ;
    public final void rule__AttributeAction__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1452:1: ( rule__AttributeAction__Group_4__1__Impl rule__AttributeAction__Group_4__2 )
            // InternalFeatureLangParser.g:1453:2: rule__AttributeAction__Group_4__1__Impl rule__AttributeAction__Group_4__2
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
    // InternalFeatureLangParser.g:1460:1: rule__AttributeAction__Group_4__1__Impl : ( Is ) ;
    public final void rule__AttributeAction__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1464:1: ( ( Is ) )
            // InternalFeatureLangParser.g:1465:1: ( Is )
            {
            // InternalFeatureLangParser.g:1465:1: ( Is )
            // InternalFeatureLangParser.g:1466:2: Is
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
    // InternalFeatureLangParser.g:1475:1: rule__AttributeAction__Group_4__2 : rule__AttributeAction__Group_4__2__Impl rule__AttributeAction__Group_4__3 ;
    public final void rule__AttributeAction__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1479:1: ( rule__AttributeAction__Group_4__2__Impl rule__AttributeAction__Group_4__3 )
            // InternalFeatureLangParser.g:1480:2: rule__AttributeAction__Group_4__2__Impl rule__AttributeAction__Group_4__3
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
    // InternalFeatureLangParser.g:1487:1: rule__AttributeAction__Group_4__2__Impl : ( A ) ;
    public final void rule__AttributeAction__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1491:1: ( ( A ) )
            // InternalFeatureLangParser.g:1492:1: ( A )
            {
            // InternalFeatureLangParser.g:1492:1: ( A )
            // InternalFeatureLangParser.g:1493:2: A
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
    // InternalFeatureLangParser.g:1502:1: rule__AttributeAction__Group_4__3 : rule__AttributeAction__Group_4__3__Impl ;
    public final void rule__AttributeAction__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1506:1: ( rule__AttributeAction__Group_4__3__Impl )
            // InternalFeatureLangParser.g:1507:2: rule__AttributeAction__Group_4__3__Impl
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
    // InternalFeatureLangParser.g:1513:1: rule__AttributeAction__Group_4__3__Impl : ( ( rule__AttributeAction__TypeAssignment_4_3 ) ) ;
    public final void rule__AttributeAction__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1517:1: ( ( ( rule__AttributeAction__TypeAssignment_4_3 ) ) )
            // InternalFeatureLangParser.g:1518:1: ( ( rule__AttributeAction__TypeAssignment_4_3 ) )
            {
            // InternalFeatureLangParser.g:1518:1: ( ( rule__AttributeAction__TypeAssignment_4_3 ) )
            // InternalFeatureLangParser.g:1519:2: ( rule__AttributeAction__TypeAssignment_4_3 )
            {
             before(grammarAccess.getAttributeActionAccess().getTypeAssignment_4_3()); 
            // InternalFeatureLangParser.g:1520:2: ( rule__AttributeAction__TypeAssignment_4_3 )
            // InternalFeatureLangParser.g:1520:3: rule__AttributeAction__TypeAssignment_4_3
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
    // InternalFeatureLangParser.g:1529:1: rule__AssociationAction__Group__0 : rule__AssociationAction__Group__0__Impl rule__AssociationAction__Group__1 ;
    public final void rule__AssociationAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1533:1: ( rule__AssociationAction__Group__0__Impl rule__AssociationAction__Group__1 )
            // InternalFeatureLangParser.g:1534:2: rule__AssociationAction__Group__0__Impl rule__AssociationAction__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalFeatureLangParser.g:1541:1: rule__AssociationAction__Group__0__Impl : ( Have ) ;
    public final void rule__AssociationAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1545:1: ( ( Have ) )
            // InternalFeatureLangParser.g:1546:1: ( Have )
            {
            // InternalFeatureLangParser.g:1546:1: ( Have )
            // InternalFeatureLangParser.g:1547:2: Have
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
    // InternalFeatureLangParser.g:1556:1: rule__AssociationAction__Group__1 : rule__AssociationAction__Group__1__Impl rule__AssociationAction__Group__2 ;
    public final void rule__AssociationAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1560:1: ( rule__AssociationAction__Group__1__Impl rule__AssociationAction__Group__2 )
            // InternalFeatureLangParser.g:1561:2: rule__AssociationAction__Group__1__Impl rule__AssociationAction__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalFeatureLangParser.g:1568:1: rule__AssociationAction__Group__1__Impl : ( Associations ) ;
    public final void rule__AssociationAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1572:1: ( ( Associations ) )
            // InternalFeatureLangParser.g:1573:1: ( Associations )
            {
            // InternalFeatureLangParser.g:1573:1: ( Associations )
            // InternalFeatureLangParser.g:1574:2: Associations
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
    // InternalFeatureLangParser.g:1583:1: rule__AssociationAction__Group__2 : rule__AssociationAction__Group__2__Impl rule__AssociationAction__Group__3 ;
    public final void rule__AssociationAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1587:1: ( rule__AssociationAction__Group__2__Impl rule__AssociationAction__Group__3 )
            // InternalFeatureLangParser.g:1588:2: rule__AssociationAction__Group__2__Impl rule__AssociationAction__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalFeatureLangParser.g:1595:1: rule__AssociationAction__Group__2__Impl : ( To ) ;
    public final void rule__AssociationAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1599:1: ( ( To ) )
            // InternalFeatureLangParser.g:1600:1: ( To )
            {
            // InternalFeatureLangParser.g:1600:1: ( To )
            // InternalFeatureLangParser.g:1601:2: To
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
    // InternalFeatureLangParser.g:1610:1: rule__AssociationAction__Group__3 : rule__AssociationAction__Group__3__Impl rule__AssociationAction__Group__4 ;
    public final void rule__AssociationAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1614:1: ( rule__AssociationAction__Group__3__Impl rule__AssociationAction__Group__4 )
            // InternalFeatureLangParser.g:1615:2: rule__AssociationAction__Group__3__Impl rule__AssociationAction__Group__4
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
    // InternalFeatureLangParser.g:1622:1: rule__AssociationAction__Group__3__Impl : ( ( rule__AssociationAction__TargetAssignment_3 ) ) ;
    public final void rule__AssociationAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1626:1: ( ( ( rule__AssociationAction__TargetAssignment_3 ) ) )
            // InternalFeatureLangParser.g:1627:1: ( ( rule__AssociationAction__TargetAssignment_3 ) )
            {
            // InternalFeatureLangParser.g:1627:1: ( ( rule__AssociationAction__TargetAssignment_3 ) )
            // InternalFeatureLangParser.g:1628:2: ( rule__AssociationAction__TargetAssignment_3 )
            {
             before(grammarAccess.getAssociationActionAccess().getTargetAssignment_3()); 
            // InternalFeatureLangParser.g:1629:2: ( rule__AssociationAction__TargetAssignment_3 )
            // InternalFeatureLangParser.g:1629:3: rule__AssociationAction__TargetAssignment_3
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
    // InternalFeatureLangParser.g:1637:1: rule__AssociationAction__Group__4 : rule__AssociationAction__Group__4__Impl rule__AssociationAction__Group__5 ;
    public final void rule__AssociationAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1641:1: ( rule__AssociationAction__Group__4__Impl rule__AssociationAction__Group__5 )
            // InternalFeatureLangParser.g:1642:2: rule__AssociationAction__Group__4__Impl rule__AssociationAction__Group__5
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
    // InternalFeatureLangParser.g:1649:1: rule__AssociationAction__Group__4__Impl : ( Called ) ;
    public final void rule__AssociationAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1653:1: ( ( Called ) )
            // InternalFeatureLangParser.g:1654:1: ( Called )
            {
            // InternalFeatureLangParser.g:1654:1: ( Called )
            // InternalFeatureLangParser.g:1655:2: Called
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
    // InternalFeatureLangParser.g:1664:1: rule__AssociationAction__Group__5 : rule__AssociationAction__Group__5__Impl ;
    public final void rule__AssociationAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1668:1: ( rule__AssociationAction__Group__5__Impl )
            // InternalFeatureLangParser.g:1669:2: rule__AssociationAction__Group__5__Impl
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
    // InternalFeatureLangParser.g:1675:1: rule__AssociationAction__Group__5__Impl : ( ( rule__AssociationAction__RelationAssignment_5 ) ) ;
    public final void rule__AssociationAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1679:1: ( ( ( rule__AssociationAction__RelationAssignment_5 ) ) )
            // InternalFeatureLangParser.g:1680:1: ( ( rule__AssociationAction__RelationAssignment_5 ) )
            {
            // InternalFeatureLangParser.g:1680:1: ( ( rule__AssociationAction__RelationAssignment_5 ) )
            // InternalFeatureLangParser.g:1681:2: ( rule__AssociationAction__RelationAssignment_5 )
            {
             before(grammarAccess.getAssociationActionAccess().getRelationAssignment_5()); 
            // InternalFeatureLangParser.g:1682:2: ( rule__AssociationAction__RelationAssignment_5 )
            // InternalFeatureLangParser.g:1682:3: rule__AssociationAction__RelationAssignment_5
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
    // InternalFeatureLangParser.g:1691:1: rule__InheritanceAction__Group__0 : rule__InheritanceAction__Group__0__Impl rule__InheritanceAction__Group__1 ;
    public final void rule__InheritanceAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1695:1: ( rule__InheritanceAction__Group__0__Impl rule__InheritanceAction__Group__1 )
            // InternalFeatureLangParser.g:1696:2: rule__InheritanceAction__Group__0__Impl rule__InheritanceAction__Group__1
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
    // InternalFeatureLangParser.g:1703:1: rule__InheritanceAction__Group__0__Impl : ( Inherit ) ;
    public final void rule__InheritanceAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1707:1: ( ( Inherit ) )
            // InternalFeatureLangParser.g:1708:1: ( Inherit )
            {
            // InternalFeatureLangParser.g:1708:1: ( Inherit )
            // InternalFeatureLangParser.g:1709:2: Inherit
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
    // InternalFeatureLangParser.g:1718:1: rule__InheritanceAction__Group__1 : rule__InheritanceAction__Group__1__Impl rule__InheritanceAction__Group__2 ;
    public final void rule__InheritanceAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1722:1: ( rule__InheritanceAction__Group__1__Impl rule__InheritanceAction__Group__2 )
            // InternalFeatureLangParser.g:1723:2: rule__InheritanceAction__Group__1__Impl rule__InheritanceAction__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalFeatureLangParser.g:1730:1: rule__InheritanceAction__Group__1__Impl : ( From ) ;
    public final void rule__InheritanceAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1734:1: ( ( From ) )
            // InternalFeatureLangParser.g:1735:1: ( From )
            {
            // InternalFeatureLangParser.g:1735:1: ( From )
            // InternalFeatureLangParser.g:1736:2: From
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
    // InternalFeatureLangParser.g:1745:1: rule__InheritanceAction__Group__2 : rule__InheritanceAction__Group__2__Impl ;
    public final void rule__InheritanceAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1749:1: ( rule__InheritanceAction__Group__2__Impl )
            // InternalFeatureLangParser.g:1750:2: rule__InheritanceAction__Group__2__Impl
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
    // InternalFeatureLangParser.g:1756:1: rule__InheritanceAction__Group__2__Impl : ( ( rule__InheritanceAction__ParentAssignment_2 ) ) ;
    public final void rule__InheritanceAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1760:1: ( ( ( rule__InheritanceAction__ParentAssignment_2 ) ) )
            // InternalFeatureLangParser.g:1761:1: ( ( rule__InheritanceAction__ParentAssignment_2 ) )
            {
            // InternalFeatureLangParser.g:1761:1: ( ( rule__InheritanceAction__ParentAssignment_2 ) )
            // InternalFeatureLangParser.g:1762:2: ( rule__InheritanceAction__ParentAssignment_2 )
            {
             before(grammarAccess.getInheritanceActionAccess().getParentAssignment_2()); 
            // InternalFeatureLangParser.g:1763:2: ( rule__InheritanceAction__ParentAssignment_2 )
            // InternalFeatureLangParser.g:1763:3: rule__InheritanceAction__ParentAssignment_2
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
    // InternalFeatureLangParser.g:1772:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1776:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalFeatureLangParser.g:1777:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalFeatureLangParser.g:1784:1: rule__Class__Group__0__Impl : ( ( rule__Class__Alternatives_0 )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1788:1: ( ( ( rule__Class__Alternatives_0 )? ) )
            // InternalFeatureLangParser.g:1789:1: ( ( rule__Class__Alternatives_0 )? )
            {
            // InternalFeatureLangParser.g:1789:1: ( ( rule__Class__Alternatives_0 )? )
            // InternalFeatureLangParser.g:1790:2: ( rule__Class__Alternatives_0 )?
            {
             before(grammarAccess.getClassAccess().getAlternatives_0()); 
            // InternalFeatureLangParser.g:1791:2: ( rule__Class__Alternatives_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==The||LA16_0==A) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalFeatureLangParser.g:1791:3: rule__Class__Alternatives_0
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
    // InternalFeatureLangParser.g:1799:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1803:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalFeatureLangParser.g:1804:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalFeatureLangParser.g:1811:1: rule__Class__Group__1__Impl : ( ( Class )? ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1815:1: ( ( ( Class )? ) )
            // InternalFeatureLangParser.g:1816:1: ( ( Class )? )
            {
            // InternalFeatureLangParser.g:1816:1: ( ( Class )? )
            // InternalFeatureLangParser.g:1817:2: ( Class )?
            {
             before(grammarAccess.getClassAccess().getClassKeyword_1()); 
            // InternalFeatureLangParser.g:1818:2: ( Class )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Class) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalFeatureLangParser.g:1818:3: Class
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
    // InternalFeatureLangParser.g:1826:1: rule__Class__Group__2 : rule__Class__Group__2__Impl ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1830:1: ( rule__Class__Group__2__Impl )
            // InternalFeatureLangParser.g:1831:2: rule__Class__Group__2__Impl
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
    // InternalFeatureLangParser.g:1837:1: rule__Class__Group__2__Impl : ( ( rule__Class__NameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1841:1: ( ( ( rule__Class__NameAssignment_2 ) ) )
            // InternalFeatureLangParser.g:1842:1: ( ( rule__Class__NameAssignment_2 ) )
            {
            // InternalFeatureLangParser.g:1842:1: ( ( rule__Class__NameAssignment_2 ) )
            // InternalFeatureLangParser.g:1843:2: ( rule__Class__NameAssignment_2 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_2()); 
            // InternalFeatureLangParser.g:1844:2: ( rule__Class__NameAssignment_2 )
            // InternalFeatureLangParser.g:1844:3: rule__Class__NameAssignment_2
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
    // InternalFeatureLangParser.g:1853:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1857:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalFeatureLangParser.g:1858:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalFeatureLangParser.g:1865:1: rule__Attribute__Group__0__Impl : ( ( Attribute )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1869:1: ( ( ( Attribute )? ) )
            // InternalFeatureLangParser.g:1870:1: ( ( Attribute )? )
            {
            // InternalFeatureLangParser.g:1870:1: ( ( Attribute )? )
            // InternalFeatureLangParser.g:1871:2: ( Attribute )?
            {
             before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
            // InternalFeatureLangParser.g:1872:2: ( Attribute )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Attribute) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalFeatureLangParser.g:1872:3: Attribute
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
    // InternalFeatureLangParser.g:1880:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1884:1: ( rule__Attribute__Group__1__Impl )
            // InternalFeatureLangParser.g:1885:2: rule__Attribute__Group__1__Impl
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
    // InternalFeatureLangParser.g:1891:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1895:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalFeatureLangParser.g:1896:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalFeatureLangParser.g:1896:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalFeatureLangParser.g:1897:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalFeatureLangParser.g:1898:2: ( rule__Attribute__NameAssignment_1 )
            // InternalFeatureLangParser.g:1898:3: rule__Attribute__NameAssignment_1
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
    // InternalFeatureLangParser.g:1907:1: rule__FeatureRequest__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__FeatureRequest__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1911:1: ( ( ruleStatement ) )
            // InternalFeatureLangParser.g:1912:2: ( ruleStatement )
            {
            // InternalFeatureLangParser.g:1912:2: ( ruleStatement )
            // InternalFeatureLangParser.g:1913:3: ruleStatement
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
    // InternalFeatureLangParser.g:1922:1: rule__ChangeStatement__TargetAssignment_0 : ( ruleClass ) ;
    public final void rule__ChangeStatement__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1926:1: ( ( ruleClass ) )
            // InternalFeatureLangParser.g:1927:2: ( ruleClass )
            {
            // InternalFeatureLangParser.g:1927:2: ( ruleClass )
            // InternalFeatureLangParser.g:1928:3: ruleClass
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
    // InternalFeatureLangParser.g:1937:1: rule__ChangeStatement__PriorityAssignment_1_0_0 : ( rulePriority ) ;
    public final void rule__ChangeStatement__PriorityAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1941:1: ( ( rulePriority ) )
            // InternalFeatureLangParser.g:1942:2: ( rulePriority )
            {
            // InternalFeatureLangParser.g:1942:2: ( rulePriority )
            // InternalFeatureLangParser.g:1943:3: rulePriority
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
    // InternalFeatureLangParser.g:1952:1: rule__ChangeStatement__NegationAssignment_1_0_1 : ( ( Not ) ) ;
    public final void rule__ChangeStatement__NegationAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1956:1: ( ( ( Not ) ) )
            // InternalFeatureLangParser.g:1957:2: ( ( Not ) )
            {
            // InternalFeatureLangParser.g:1957:2: ( ( Not ) )
            // InternalFeatureLangParser.g:1958:3: ( Not )
            {
             before(grammarAccess.getChangeStatementAccess().getNegationNotKeyword_1_0_1_0()); 
            // InternalFeatureLangParser.g:1959:3: ( Not )
            // InternalFeatureLangParser.g:1960:4: Not
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
    // InternalFeatureLangParser.g:1971:1: rule__ChangeStatement__ActionAssignment_1_0_2 : ( ruleAction ) ;
    public final void rule__ChangeStatement__ActionAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1975:1: ( ( ruleAction ) )
            // InternalFeatureLangParser.g:1976:2: ( ruleAction )
            {
            // InternalFeatureLangParser.g:1976:2: ( ruleAction )
            // InternalFeatureLangParser.g:1977:3: ruleAction
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
    // InternalFeatureLangParser.g:1986:1: rule__ChangeStatement__UpdateAssignment_1_1 : ( ruleUpdateAction ) ;
    public final void rule__ChangeStatement__UpdateAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:1990:1: ( ( ruleUpdateAction ) )
            // InternalFeatureLangParser.g:1991:2: ( ruleUpdateAction )
            {
            // InternalFeatureLangParser.g:1991:2: ( ruleUpdateAction )
            // InternalFeatureLangParser.g:1992:3: ruleUpdateAction
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


    // $ANTLR start "rule__CreationStatement__PriorityAssignment_1"
    // InternalFeatureLangParser.g:2001:1: rule__CreationStatement__PriorityAssignment_1 : ( rulePriority ) ;
    public final void rule__CreationStatement__PriorityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2005:1: ( ( rulePriority ) )
            // InternalFeatureLangParser.g:2006:2: ( rulePriority )
            {
            // InternalFeatureLangParser.g:2006:2: ( rulePriority )
            // InternalFeatureLangParser.g:2007:3: rulePriority
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
    // InternalFeatureLangParser.g:2016:1: rule__CreationStatement__NegationAssignment_2 : ( ( Not ) ) ;
    public final void rule__CreationStatement__NegationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2020:1: ( ( ( Not ) ) )
            // InternalFeatureLangParser.g:2021:2: ( ( Not ) )
            {
            // InternalFeatureLangParser.g:2021:2: ( ( Not ) )
            // InternalFeatureLangParser.g:2022:3: ( Not )
            {
             before(grammarAccess.getCreationStatementAccess().getNegationNotKeyword_2_0()); 
            // InternalFeatureLangParser.g:2023:3: ( Not )
            // InternalFeatureLangParser.g:2024:4: Not
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


    // $ANTLR start "rule__CreationStatement__ClassElementAssignment_4"
    // InternalFeatureLangParser.g:2035:1: rule__CreationStatement__ClassElementAssignment_4 : ( ruleClass ) ;
    public final void rule__CreationStatement__ClassElementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2039:1: ( ( ruleClass ) )
            // InternalFeatureLangParser.g:2040:2: ( ruleClass )
            {
            // InternalFeatureLangParser.g:2040:2: ( ruleClass )
            // InternalFeatureLangParser.g:2041:3: ruleClass
            {
             before(grammarAccess.getCreationStatementAccess().getClassElementClassParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getCreationStatementAccess().getClassElementClassParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreationStatement__ClassElementAssignment_4"


    // $ANTLR start "rule__Action__TypeAssignment"
    // InternalFeatureLangParser.g:2050:1: rule__Action__TypeAssignment : ( ( rule__Action__TypeAlternatives_0 ) ) ;
    public final void rule__Action__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2054:1: ( ( ( rule__Action__TypeAlternatives_0 ) ) )
            // InternalFeatureLangParser.g:2055:2: ( ( rule__Action__TypeAlternatives_0 ) )
            {
            // InternalFeatureLangParser.g:2055:2: ( ( rule__Action__TypeAlternatives_0 ) )
            // InternalFeatureLangParser.g:2056:3: ( rule__Action__TypeAlternatives_0 )
            {
             before(grammarAccess.getActionAccess().getTypeAlternatives_0()); 
            // InternalFeatureLangParser.g:2057:3: ( rule__Action__TypeAlternatives_0 )
            // InternalFeatureLangParser.g:2057:4: rule__Action__TypeAlternatives_0
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
    // InternalFeatureLangParser.g:2065:1: rule__UpdateAction__AttributeAssignment_3 : ( ruleAttribute ) ;
    public final void rule__UpdateAction__AttributeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2069:1: ( ( ruleAttribute ) )
            // InternalFeatureLangParser.g:2070:2: ( ruleAttribute )
            {
            // InternalFeatureLangParser.g:2070:2: ( ruleAttribute )
            // InternalFeatureLangParser.g:2071:3: ruleAttribute
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
    // InternalFeatureLangParser.g:2080:1: rule__UpdateAction__PriorityAssignment_6 : ( rulePriority ) ;
    public final void rule__UpdateAction__PriorityAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2084:1: ( ( rulePriority ) )
            // InternalFeatureLangParser.g:2085:2: ( rulePriority )
            {
            // InternalFeatureLangParser.g:2085:2: ( rulePriority )
            // InternalFeatureLangParser.g:2086:3: rulePriority
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
    // InternalFeatureLangParser.g:2095:1: rule__UpdateAction__TypeAssignment_9 : ( ruleDatatype ) ;
    public final void rule__UpdateAction__TypeAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2099:1: ( ( ruleDatatype ) )
            // InternalFeatureLangParser.g:2100:2: ( ruleDatatype )
            {
            // InternalFeatureLangParser.g:2100:2: ( ruleDatatype )
            // InternalFeatureLangParser.g:2101:3: ruleDatatype
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
    // InternalFeatureLangParser.g:2110:1: rule__AttributeAction__AttributeAssignment_2 : ( ruleAttribute ) ;
    public final void rule__AttributeAction__AttributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2114:1: ( ( ruleAttribute ) )
            // InternalFeatureLangParser.g:2115:2: ( ruleAttribute )
            {
            // InternalFeatureLangParser.g:2115:2: ( ruleAttribute )
            // InternalFeatureLangParser.g:2116:3: ruleAttribute
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
    // InternalFeatureLangParser.g:2125:1: rule__AttributeAction__TypeAssignment_4_3 : ( ruleDatatype ) ;
    public final void rule__AttributeAction__TypeAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2129:1: ( ( ruleDatatype ) )
            // InternalFeatureLangParser.g:2130:2: ( ruleDatatype )
            {
            // InternalFeatureLangParser.g:2130:2: ( ruleDatatype )
            // InternalFeatureLangParser.g:2131:3: ruleDatatype
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
    // InternalFeatureLangParser.g:2140:1: rule__AssociationAction__TargetAssignment_3 : ( ruleClass ) ;
    public final void rule__AssociationAction__TargetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2144:1: ( ( ruleClass ) )
            // InternalFeatureLangParser.g:2145:2: ( ruleClass )
            {
            // InternalFeatureLangParser.g:2145:2: ( ruleClass )
            // InternalFeatureLangParser.g:2146:3: ruleClass
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
    // InternalFeatureLangParser.g:2155:1: rule__AssociationAction__RelationAssignment_5 : ( RULE_ID ) ;
    public final void rule__AssociationAction__RelationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2159:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:2160:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:2160:2: ( RULE_ID )
            // InternalFeatureLangParser.g:2161:3: RULE_ID
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
    // InternalFeatureLangParser.g:2170:1: rule__InheritanceAction__ParentAssignment_2 : ( ruleClass ) ;
    public final void rule__InheritanceAction__ParentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2174:1: ( ( ruleClass ) )
            // InternalFeatureLangParser.g:2175:2: ( ruleClass )
            {
            // InternalFeatureLangParser.g:2175:2: ( ruleClass )
            // InternalFeatureLangParser.g:2176:3: ruleClass
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
    // InternalFeatureLangParser.g:2185:1: rule__Class__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2189:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:2190:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:2190:2: ( RULE_ID )
            // InternalFeatureLangParser.g:2191:3: RULE_ID
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
    // InternalFeatureLangParser.g:2200:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2204:1: ( ( RULE_ID ) )
            // InternalFeatureLangParser.g:2205:2: ( RULE_ID )
            {
            // InternalFeatureLangParser.g:2205:2: ( RULE_ID )
            // InternalFeatureLangParser.g:2206:3: RULE_ID
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
    // InternalFeatureLangParser.g:2215:1: rule__Priority__PriorityAssignment : ( rulePriorityValue ) ;
    public final void rule__Priority__PriorityAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLangParser.g:2219:1: ( ( rulePriorityValue ) )
            // InternalFeatureLangParser.g:2220:2: ( rulePriorityValue )
            {
            // InternalFeatureLangParser.g:2220:2: ( rulePriorityValue )
            // InternalFeatureLangParser.g:2221:3: rulePriorityValue
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000032205002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000A0800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000110080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000902000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000030201000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000060L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040600L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000008000L});

}