package org.xtext.project.lsysgen.ide.contentassist.antlr.internal;

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
import org.xtext.project.lsysgen.services.LSysGenGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLSysGenParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_NEWLINE", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "':'", "'.'", "'Strawberry'", "'Leaves'", "'Stems'", "'Fruits'", "'Age'", "'TriLobe_th'", "'SingleLobe_th'"
    };
    public static final int RULE_NEWLINE=5;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalLSysGenParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLSysGenParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLSysGenParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLSysGen.g"; }


    	private LSysGenGrammarAccess grammarAccess;

    	public void setGrammarAccess(LSysGenGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleCrop"
    // InternalLSysGen.g:53:1: entryRuleCrop : ruleCrop EOF ;
    public final void entryRuleCrop() throws RecognitionException {
        try {
            // InternalLSysGen.g:54:1: ( ruleCrop EOF )
            // InternalLSysGen.g:55:1: ruleCrop EOF
            {
             before(grammarAccess.getCropRule()); 
            pushFollow(FOLLOW_1);
            ruleCrop();

            state._fsp--;

             after(grammarAccess.getCropRule()); 
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
    // $ANTLR end "entryRuleCrop"


    // $ANTLR start "ruleCrop"
    // InternalLSysGen.g:62:1: ruleCrop : ( ( rule__Crop__Group__0 ) ) ;
    public final void ruleCrop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:66:2: ( ( ( rule__Crop__Group__0 ) ) )
            // InternalLSysGen.g:67:2: ( ( rule__Crop__Group__0 ) )
            {
            // InternalLSysGen.g:67:2: ( ( rule__Crop__Group__0 ) )
            // InternalLSysGen.g:68:3: ( rule__Crop__Group__0 )
            {
             before(grammarAccess.getCropAccess().getGroup()); 
            // InternalLSysGen.g:69:3: ( rule__Crop__Group__0 )
            // InternalLSysGen.g:69:4: rule__Crop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Crop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCropAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCrop"


    // $ANTLR start "entryRuleOrgan"
    // InternalLSysGen.g:78:1: entryRuleOrgan : ruleOrgan EOF ;
    public final void entryRuleOrgan() throws RecognitionException {
        try {
            // InternalLSysGen.g:79:1: ( ruleOrgan EOF )
            // InternalLSysGen.g:80:1: ruleOrgan EOF
            {
             before(grammarAccess.getOrganRule()); 
            pushFollow(FOLLOW_1);
            ruleOrgan();

            state._fsp--;

             after(grammarAccess.getOrganRule()); 
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
    // $ANTLR end "entryRuleOrgan"


    // $ANTLR start "ruleOrgan"
    // InternalLSysGen.g:87:1: ruleOrgan : ( ( rule__Organ__Alternatives ) ) ;
    public final void ruleOrgan() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:91:2: ( ( ( rule__Organ__Alternatives ) ) )
            // InternalLSysGen.g:92:2: ( ( rule__Organ__Alternatives ) )
            {
            // InternalLSysGen.g:92:2: ( ( rule__Organ__Alternatives ) )
            // InternalLSysGen.g:93:3: ( rule__Organ__Alternatives )
            {
             before(grammarAccess.getOrganAccess().getAlternatives()); 
            // InternalLSysGen.g:94:3: ( rule__Organ__Alternatives )
            // InternalLSysGen.g:94:4: rule__Organ__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Organ__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOrganAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrgan"


    // $ANTLR start "entryRuleLeaves"
    // InternalLSysGen.g:103:1: entryRuleLeaves : ruleLeaves EOF ;
    public final void entryRuleLeaves() throws RecognitionException {
        try {
            // InternalLSysGen.g:104:1: ( ruleLeaves EOF )
            // InternalLSysGen.g:105:1: ruleLeaves EOF
            {
             before(grammarAccess.getLeavesRule()); 
            pushFollow(FOLLOW_1);
            ruleLeaves();

            state._fsp--;

             after(grammarAccess.getLeavesRule()); 
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
    // $ANTLR end "entryRuleLeaves"


    // $ANTLR start "ruleLeaves"
    // InternalLSysGen.g:112:1: ruleLeaves : ( ( rule__Leaves__Group__0 ) ) ;
    public final void ruleLeaves() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:116:2: ( ( ( rule__Leaves__Group__0 ) ) )
            // InternalLSysGen.g:117:2: ( ( rule__Leaves__Group__0 ) )
            {
            // InternalLSysGen.g:117:2: ( ( rule__Leaves__Group__0 ) )
            // InternalLSysGen.g:118:3: ( rule__Leaves__Group__0 )
            {
             before(grammarAccess.getLeavesAccess().getGroup()); 
            // InternalLSysGen.g:119:3: ( rule__Leaves__Group__0 )
            // InternalLSysGen.g:119:4: rule__Leaves__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Leaves__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLeavesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLeaves"


    // $ANTLR start "entryRuleStems"
    // InternalLSysGen.g:128:1: entryRuleStems : ruleStems EOF ;
    public final void entryRuleStems() throws RecognitionException {
        try {
            // InternalLSysGen.g:129:1: ( ruleStems EOF )
            // InternalLSysGen.g:130:1: ruleStems EOF
            {
             before(grammarAccess.getStemsRule()); 
            pushFollow(FOLLOW_1);
            ruleStems();

            state._fsp--;

             after(grammarAccess.getStemsRule()); 
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
    // $ANTLR end "entryRuleStems"


    // $ANTLR start "ruleStems"
    // InternalLSysGen.g:137:1: ruleStems : ( ( rule__Stems__Group__0 ) ) ;
    public final void ruleStems() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:141:2: ( ( ( rule__Stems__Group__0 ) ) )
            // InternalLSysGen.g:142:2: ( ( rule__Stems__Group__0 ) )
            {
            // InternalLSysGen.g:142:2: ( ( rule__Stems__Group__0 ) )
            // InternalLSysGen.g:143:3: ( rule__Stems__Group__0 )
            {
             before(grammarAccess.getStemsAccess().getGroup()); 
            // InternalLSysGen.g:144:3: ( rule__Stems__Group__0 )
            // InternalLSysGen.g:144:4: rule__Stems__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Stems__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStemsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStems"


    // $ANTLR start "entryRuleFruits"
    // InternalLSysGen.g:153:1: entryRuleFruits : ruleFruits EOF ;
    public final void entryRuleFruits() throws RecognitionException {
        try {
            // InternalLSysGen.g:154:1: ( ruleFruits EOF )
            // InternalLSysGen.g:155:1: ruleFruits EOF
            {
             before(grammarAccess.getFruitsRule()); 
            pushFollow(FOLLOW_1);
            ruleFruits();

            state._fsp--;

             after(grammarAccess.getFruitsRule()); 
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
    // $ANTLR end "entryRuleFruits"


    // $ANTLR start "ruleFruits"
    // InternalLSysGen.g:162:1: ruleFruits : ( ( rule__Fruits__Group__0 ) ) ;
    public final void ruleFruits() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:166:2: ( ( ( rule__Fruits__Group__0 ) ) )
            // InternalLSysGen.g:167:2: ( ( rule__Fruits__Group__0 ) )
            {
            // InternalLSysGen.g:167:2: ( ( rule__Fruits__Group__0 ) )
            // InternalLSysGen.g:168:3: ( rule__Fruits__Group__0 )
            {
             before(grammarAccess.getFruitsAccess().getGroup()); 
            // InternalLSysGen.g:169:3: ( rule__Fruits__Group__0 )
            // InternalLSysGen.g:169:4: rule__Fruits__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Fruits__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFruitsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFruits"


    // $ANTLR start "entryRuleMaxAge"
    // InternalLSysGen.g:178:1: entryRuleMaxAge : ruleMaxAge EOF ;
    public final void entryRuleMaxAge() throws RecognitionException {
        try {
            // InternalLSysGen.g:179:1: ( ruleMaxAge EOF )
            // InternalLSysGen.g:180:1: ruleMaxAge EOF
            {
             before(grammarAccess.getMaxAgeRule()); 
            pushFollow(FOLLOW_1);
            ruleMaxAge();

            state._fsp--;

             after(grammarAccess.getMaxAgeRule()); 
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
    // $ANTLR end "entryRuleMaxAge"


    // $ANTLR start "ruleMaxAge"
    // InternalLSysGen.g:187:1: ruleMaxAge : ( ( rule__MaxAge__Group__0 ) ) ;
    public final void ruleMaxAge() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:191:2: ( ( ( rule__MaxAge__Group__0 ) ) )
            // InternalLSysGen.g:192:2: ( ( rule__MaxAge__Group__0 ) )
            {
            // InternalLSysGen.g:192:2: ( ( rule__MaxAge__Group__0 ) )
            // InternalLSysGen.g:193:3: ( rule__MaxAge__Group__0 )
            {
             before(grammarAccess.getMaxAgeAccess().getGroup()); 
            // InternalLSysGen.g:194:3: ( rule__MaxAge__Group__0 )
            // InternalLSysGen.g:194:4: rule__MaxAge__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MaxAge__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMaxAgeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMaxAge"


    // $ANTLR start "entryRuleTriLobe_th"
    // InternalLSysGen.g:203:1: entryRuleTriLobe_th : ruleTriLobe_th EOF ;
    public final void entryRuleTriLobe_th() throws RecognitionException {
        try {
            // InternalLSysGen.g:204:1: ( ruleTriLobe_th EOF )
            // InternalLSysGen.g:205:1: ruleTriLobe_th EOF
            {
             before(grammarAccess.getTriLobe_thRule()); 
            pushFollow(FOLLOW_1);
            ruleTriLobe_th();

            state._fsp--;

             after(grammarAccess.getTriLobe_thRule()); 
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
    // $ANTLR end "entryRuleTriLobe_th"


    // $ANTLR start "ruleTriLobe_th"
    // InternalLSysGen.g:212:1: ruleTriLobe_th : ( ( rule__TriLobe_th__Group__0 ) ) ;
    public final void ruleTriLobe_th() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:216:2: ( ( ( rule__TriLobe_th__Group__0 ) ) )
            // InternalLSysGen.g:217:2: ( ( rule__TriLobe_th__Group__0 ) )
            {
            // InternalLSysGen.g:217:2: ( ( rule__TriLobe_th__Group__0 ) )
            // InternalLSysGen.g:218:3: ( rule__TriLobe_th__Group__0 )
            {
             before(grammarAccess.getTriLobe_thAccess().getGroup()); 
            // InternalLSysGen.g:219:3: ( rule__TriLobe_th__Group__0 )
            // InternalLSysGen.g:219:4: rule__TriLobe_th__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TriLobe_th__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTriLobe_thAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTriLobe_th"


    // $ANTLR start "entryRuleSingleLobe_th"
    // InternalLSysGen.g:228:1: entryRuleSingleLobe_th : ruleSingleLobe_th EOF ;
    public final void entryRuleSingleLobe_th() throws RecognitionException {
        try {
            // InternalLSysGen.g:229:1: ( ruleSingleLobe_th EOF )
            // InternalLSysGen.g:230:1: ruleSingleLobe_th EOF
            {
             before(grammarAccess.getSingleLobe_thRule()); 
            pushFollow(FOLLOW_1);
            ruleSingleLobe_th();

            state._fsp--;

             after(grammarAccess.getSingleLobe_thRule()); 
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
    // $ANTLR end "entryRuleSingleLobe_th"


    // $ANTLR start "ruleSingleLobe_th"
    // InternalLSysGen.g:237:1: ruleSingleLobe_th : ( ( rule__SingleLobe_th__Group__0 ) ) ;
    public final void ruleSingleLobe_th() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:241:2: ( ( ( rule__SingleLobe_th__Group__0 ) ) )
            // InternalLSysGen.g:242:2: ( ( rule__SingleLobe_th__Group__0 ) )
            {
            // InternalLSysGen.g:242:2: ( ( rule__SingleLobe_th__Group__0 ) )
            // InternalLSysGen.g:243:3: ( rule__SingleLobe_th__Group__0 )
            {
             before(grammarAccess.getSingleLobe_thAccess().getGroup()); 
            // InternalLSysGen.g:244:3: ( rule__SingleLobe_th__Group__0 )
            // InternalLSysGen.g:244:4: rule__SingleLobe_th__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SingleLobe_th__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingleLobe_thAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingleLobe_th"


    // $ANTLR start "entryRuleParameter"
    // InternalLSysGen.g:253:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalLSysGen.g:254:1: ( ruleParameter EOF )
            // InternalLSysGen.g:255:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalLSysGen.g:262:1: ruleParameter : ( ( rule__Parameter__Alternatives ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:266:2: ( ( ( rule__Parameter__Alternatives ) ) )
            // InternalLSysGen.g:267:2: ( ( rule__Parameter__Alternatives ) )
            {
            // InternalLSysGen.g:267:2: ( ( rule__Parameter__Alternatives ) )
            // InternalLSysGen.g:268:3: ( rule__Parameter__Alternatives )
            {
             before(grammarAccess.getParameterAccess().getAlternatives()); 
            // InternalLSysGen.g:269:3: ( rule__Parameter__Alternatives )
            // InternalLSysGen.g:269:4: rule__Parameter__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleIntValue"
    // InternalLSysGen.g:278:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // InternalLSysGen.g:279:1: ( ruleIntValue EOF )
            // InternalLSysGen.g:280:1: ruleIntValue EOF
            {
             before(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_1);
            ruleIntValue();

            state._fsp--;

             after(grammarAccess.getIntValueRule()); 
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
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalLSysGen.g:287:1: ruleIntValue : ( RULE_INT ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:291:2: ( ( RULE_INT ) )
            // InternalLSysGen.g:292:2: ( RULE_INT )
            {
            // InternalLSysGen.g:292:2: ( RULE_INT )
            // InternalLSysGen.g:293:3: RULE_INT
            {
             before(grammarAccess.getIntValueAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntValueAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleFloatValue"
    // InternalLSysGen.g:303:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // InternalLSysGen.g:304:1: ( ruleFloatValue EOF )
            // InternalLSysGen.g:305:1: ruleFloatValue EOF
            {
             before(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_1);
            ruleFloatValue();

            state._fsp--;

             after(grammarAccess.getFloatValueRule()); 
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
    // $ANTLR end "entryRuleFloatValue"


    // $ANTLR start "ruleFloatValue"
    // InternalLSysGen.g:312:1: ruleFloatValue : ( ( rule__FloatValue__Group__0 ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:316:2: ( ( ( rule__FloatValue__Group__0 ) ) )
            // InternalLSysGen.g:317:2: ( ( rule__FloatValue__Group__0 ) )
            {
            // InternalLSysGen.g:317:2: ( ( rule__FloatValue__Group__0 ) )
            // InternalLSysGen.g:318:3: ( rule__FloatValue__Group__0 )
            {
             before(grammarAccess.getFloatValueAccess().getGroup()); 
            // InternalLSysGen.g:319:3: ( rule__FloatValue__Group__0 )
            // InternalLSysGen.g:319:4: rule__FloatValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FloatValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloatValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloatValue"


    // $ANTLR start "rule__Organ__Alternatives"
    // InternalLSysGen.g:327:1: rule__Organ__Alternatives : ( ( ruleLeaves ) | ( ruleStems ) | ( ruleFruits ) );
    public final void rule__Organ__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:331:1: ( ( ruleLeaves ) | ( ruleStems ) | ( ruleFruits ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt1=1;
                }
                break;
            case 18:
                {
                alt1=2;
                }
                break;
            case 19:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalLSysGen.g:332:2: ( ruleLeaves )
                    {
                    // InternalLSysGen.g:332:2: ( ruleLeaves )
                    // InternalLSysGen.g:333:3: ruleLeaves
                    {
                     before(grammarAccess.getOrganAccess().getLeavesParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLeaves();

                    state._fsp--;

                     after(grammarAccess.getOrganAccess().getLeavesParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLSysGen.g:338:2: ( ruleStems )
                    {
                    // InternalLSysGen.g:338:2: ( ruleStems )
                    // InternalLSysGen.g:339:3: ruleStems
                    {
                     before(grammarAccess.getOrganAccess().getStemsParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStems();

                    state._fsp--;

                     after(grammarAccess.getOrganAccess().getStemsParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLSysGen.g:344:2: ( ruleFruits )
                    {
                    // InternalLSysGen.g:344:2: ( ruleFruits )
                    // InternalLSysGen.g:345:3: ruleFruits
                    {
                     before(grammarAccess.getOrganAccess().getFruitsParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFruits();

                    state._fsp--;

                     after(grammarAccess.getOrganAccess().getFruitsParserRuleCall_2()); 

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
    // $ANTLR end "rule__Organ__Alternatives"


    // $ANTLR start "rule__Parameter__Alternatives"
    // InternalLSysGen.g:354:1: rule__Parameter__Alternatives : ( ( ruleMaxAge ) | ( ruleTriLobe_th ) | ( ruleSingleLobe_th ) );
    public final void rule__Parameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:358:1: ( ( ruleMaxAge ) | ( ruleTriLobe_th ) | ( ruleSingleLobe_th ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt2=1;
                }
                break;
            case 21:
                {
                alt2=2;
                }
                break;
            case 22:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalLSysGen.g:359:2: ( ruleMaxAge )
                    {
                    // InternalLSysGen.g:359:2: ( ruleMaxAge )
                    // InternalLSysGen.g:360:3: ruleMaxAge
                    {
                     before(grammarAccess.getParameterAccess().getMaxAgeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMaxAge();

                    state._fsp--;

                     after(grammarAccess.getParameterAccess().getMaxAgeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLSysGen.g:365:2: ( ruleTriLobe_th )
                    {
                    // InternalLSysGen.g:365:2: ( ruleTriLobe_th )
                    // InternalLSysGen.g:366:3: ruleTriLobe_th
                    {
                     before(grammarAccess.getParameterAccess().getTriLobe_thParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTriLobe_th();

                    state._fsp--;

                     after(grammarAccess.getParameterAccess().getTriLobe_thParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLSysGen.g:371:2: ( ruleSingleLobe_th )
                    {
                    // InternalLSysGen.g:371:2: ( ruleSingleLobe_th )
                    // InternalLSysGen.g:372:3: ruleSingleLobe_th
                    {
                     before(grammarAccess.getParameterAccess().getSingleLobe_thParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSingleLobe_th();

                    state._fsp--;

                     after(grammarAccess.getParameterAccess().getSingleLobe_thParserRuleCall_2()); 

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
    // $ANTLR end "rule__Parameter__Alternatives"


    // $ANTLR start "rule__Crop__Group__0"
    // InternalLSysGen.g:381:1: rule__Crop__Group__0 : rule__Crop__Group__0__Impl rule__Crop__Group__1 ;
    public final void rule__Crop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:385:1: ( rule__Crop__Group__0__Impl rule__Crop__Group__1 )
            // InternalLSysGen.g:386:2: rule__Crop__Group__0__Impl rule__Crop__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Crop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Crop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Crop__Group__0"


    // $ANTLR start "rule__Crop__Group__0__Impl"
    // InternalLSysGen.g:393:1: rule__Crop__Group__0__Impl : ( ( rule__Crop__NameAssignment_0 ) ) ;
    public final void rule__Crop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:397:1: ( ( ( rule__Crop__NameAssignment_0 ) ) )
            // InternalLSysGen.g:398:1: ( ( rule__Crop__NameAssignment_0 ) )
            {
            // InternalLSysGen.g:398:1: ( ( rule__Crop__NameAssignment_0 ) )
            // InternalLSysGen.g:399:2: ( rule__Crop__NameAssignment_0 )
            {
             before(grammarAccess.getCropAccess().getNameAssignment_0()); 
            // InternalLSysGen.g:400:2: ( rule__Crop__NameAssignment_0 )
            // InternalLSysGen.g:400:3: rule__Crop__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Crop__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCropAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Crop__Group__0__Impl"


    // $ANTLR start "rule__Crop__Group__1"
    // InternalLSysGen.g:408:1: rule__Crop__Group__1 : rule__Crop__Group__1__Impl rule__Crop__Group__2 ;
    public final void rule__Crop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:412:1: ( rule__Crop__Group__1__Impl rule__Crop__Group__2 )
            // InternalLSysGen.g:413:2: rule__Crop__Group__1__Impl rule__Crop__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Crop__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Crop__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Crop__Group__1"


    // $ANTLR start "rule__Crop__Group__1__Impl"
    // InternalLSysGen.g:420:1: rule__Crop__Group__1__Impl : ( '(' ) ;
    public final void rule__Crop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:424:1: ( ( '(' ) )
            // InternalLSysGen.g:425:1: ( '(' )
            {
            // InternalLSysGen.g:425:1: ( '(' )
            // InternalLSysGen.g:426:2: '('
            {
             before(grammarAccess.getCropAccess().getLeftParenthesisKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCropAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Crop__Group__1__Impl"


    // $ANTLR start "rule__Crop__Group__2"
    // InternalLSysGen.g:435:1: rule__Crop__Group__2 : rule__Crop__Group__2__Impl rule__Crop__Group__3 ;
    public final void rule__Crop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:439:1: ( rule__Crop__Group__2__Impl rule__Crop__Group__3 )
            // InternalLSysGen.g:440:2: rule__Crop__Group__2__Impl rule__Crop__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Crop__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Crop__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Crop__Group__2"


    // $ANTLR start "rule__Crop__Group__2__Impl"
    // InternalLSysGen.g:447:1: rule__Crop__Group__2__Impl : ( ( ( rule__Crop__OrgansAssignment_2 ) ) ( ( rule__Crop__OrgansAssignment_2 )* ) ) ;
    public final void rule__Crop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:451:1: ( ( ( ( rule__Crop__OrgansAssignment_2 ) ) ( ( rule__Crop__OrgansAssignment_2 )* ) ) )
            // InternalLSysGen.g:452:1: ( ( ( rule__Crop__OrgansAssignment_2 ) ) ( ( rule__Crop__OrgansAssignment_2 )* ) )
            {
            // InternalLSysGen.g:452:1: ( ( ( rule__Crop__OrgansAssignment_2 ) ) ( ( rule__Crop__OrgansAssignment_2 )* ) )
            // InternalLSysGen.g:453:2: ( ( rule__Crop__OrgansAssignment_2 ) ) ( ( rule__Crop__OrgansAssignment_2 )* )
            {
            // InternalLSysGen.g:453:2: ( ( rule__Crop__OrgansAssignment_2 ) )
            // InternalLSysGen.g:454:3: ( rule__Crop__OrgansAssignment_2 )
            {
             before(grammarAccess.getCropAccess().getOrgansAssignment_2()); 
            // InternalLSysGen.g:455:3: ( rule__Crop__OrgansAssignment_2 )
            // InternalLSysGen.g:455:4: rule__Crop__OrgansAssignment_2
            {
            pushFollow(FOLLOW_6);
            rule__Crop__OrgansAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCropAccess().getOrgansAssignment_2()); 

            }

            // InternalLSysGen.g:458:2: ( ( rule__Crop__OrgansAssignment_2 )* )
            // InternalLSysGen.g:459:3: ( rule__Crop__OrgansAssignment_2 )*
            {
             before(grammarAccess.getCropAccess().getOrgansAssignment_2()); 
            // InternalLSysGen.g:460:3: ( rule__Crop__OrgansAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=17 && LA3_0<=19)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalLSysGen.g:460:4: rule__Crop__OrgansAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Crop__OrgansAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getCropAccess().getOrgansAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Crop__Group__2__Impl"


    // $ANTLR start "rule__Crop__Group__3"
    // InternalLSysGen.g:469:1: rule__Crop__Group__3 : rule__Crop__Group__3__Impl rule__Crop__Group__4 ;
    public final void rule__Crop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:473:1: ( rule__Crop__Group__3__Impl rule__Crop__Group__4 )
            // InternalLSysGen.g:474:2: rule__Crop__Group__3__Impl rule__Crop__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Crop__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Crop__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Crop__Group__3"


    // $ANTLR start "rule__Crop__Group__3__Impl"
    // InternalLSysGen.g:481:1: rule__Crop__Group__3__Impl : ( ( ( rule__Crop__ParametersAssignment_3 ) ) ( ( rule__Crop__ParametersAssignment_3 )* ) ) ;
    public final void rule__Crop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:485:1: ( ( ( ( rule__Crop__ParametersAssignment_3 ) ) ( ( rule__Crop__ParametersAssignment_3 )* ) ) )
            // InternalLSysGen.g:486:1: ( ( ( rule__Crop__ParametersAssignment_3 ) ) ( ( rule__Crop__ParametersAssignment_3 )* ) )
            {
            // InternalLSysGen.g:486:1: ( ( ( rule__Crop__ParametersAssignment_3 ) ) ( ( rule__Crop__ParametersAssignment_3 )* ) )
            // InternalLSysGen.g:487:2: ( ( rule__Crop__ParametersAssignment_3 ) ) ( ( rule__Crop__ParametersAssignment_3 )* )
            {
            // InternalLSysGen.g:487:2: ( ( rule__Crop__ParametersAssignment_3 ) )
            // InternalLSysGen.g:488:3: ( rule__Crop__ParametersAssignment_3 )
            {
             before(grammarAccess.getCropAccess().getParametersAssignment_3()); 
            // InternalLSysGen.g:489:3: ( rule__Crop__ParametersAssignment_3 )
            // InternalLSysGen.g:489:4: rule__Crop__ParametersAssignment_3
            {
            pushFollow(FOLLOW_8);
            rule__Crop__ParametersAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCropAccess().getParametersAssignment_3()); 

            }

            // InternalLSysGen.g:492:2: ( ( rule__Crop__ParametersAssignment_3 )* )
            // InternalLSysGen.g:493:3: ( rule__Crop__ParametersAssignment_3 )*
            {
             before(grammarAccess.getCropAccess().getParametersAssignment_3()); 
            // InternalLSysGen.g:494:3: ( rule__Crop__ParametersAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=20 && LA4_0<=22)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLSysGen.g:494:4: rule__Crop__ParametersAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Crop__ParametersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getCropAccess().getParametersAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Crop__Group__3__Impl"


    // $ANTLR start "rule__Crop__Group__4"
    // InternalLSysGen.g:503:1: rule__Crop__Group__4 : rule__Crop__Group__4__Impl ;
    public final void rule__Crop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:507:1: ( rule__Crop__Group__4__Impl )
            // InternalLSysGen.g:508:2: rule__Crop__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Crop__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Crop__Group__4"


    // $ANTLR start "rule__Crop__Group__4__Impl"
    // InternalLSysGen.g:514:1: rule__Crop__Group__4__Impl : ( ')' ) ;
    public final void rule__Crop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:518:1: ( ( ')' ) )
            // InternalLSysGen.g:519:1: ( ')' )
            {
            // InternalLSysGen.g:519:1: ( ')' )
            // InternalLSysGen.g:520:2: ')'
            {
             before(grammarAccess.getCropAccess().getRightParenthesisKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCropAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Crop__Group__4__Impl"


    // $ANTLR start "rule__Leaves__Group__0"
    // InternalLSysGen.g:530:1: rule__Leaves__Group__0 : rule__Leaves__Group__0__Impl rule__Leaves__Group__1 ;
    public final void rule__Leaves__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:534:1: ( rule__Leaves__Group__0__Impl rule__Leaves__Group__1 )
            // InternalLSysGen.g:535:2: rule__Leaves__Group__0__Impl rule__Leaves__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Leaves__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Leaves__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaves__Group__0"


    // $ANTLR start "rule__Leaves__Group__0__Impl"
    // InternalLSysGen.g:542:1: rule__Leaves__Group__0__Impl : ( () ) ;
    public final void rule__Leaves__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:546:1: ( ( () ) )
            // InternalLSysGen.g:547:1: ( () )
            {
            // InternalLSysGen.g:547:1: ( () )
            // InternalLSysGen.g:548:2: ()
            {
             before(grammarAccess.getLeavesAccess().getLeavesAction_0()); 
            // InternalLSysGen.g:549:2: ()
            // InternalLSysGen.g:549:3: 
            {
            }

             after(grammarAccess.getLeavesAccess().getLeavesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaves__Group__0__Impl"


    // $ANTLR start "rule__Leaves__Group__1"
    // InternalLSysGen.g:557:1: rule__Leaves__Group__1 : rule__Leaves__Group__1__Impl rule__Leaves__Group__2 ;
    public final void rule__Leaves__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:561:1: ( rule__Leaves__Group__1__Impl rule__Leaves__Group__2 )
            // InternalLSysGen.g:562:2: rule__Leaves__Group__1__Impl rule__Leaves__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Leaves__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Leaves__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaves__Group__1"


    // $ANTLR start "rule__Leaves__Group__1__Impl"
    // InternalLSysGen.g:569:1: rule__Leaves__Group__1__Impl : ( ( rule__Leaves__NameAssignment_1 ) ) ;
    public final void rule__Leaves__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:573:1: ( ( ( rule__Leaves__NameAssignment_1 ) ) )
            // InternalLSysGen.g:574:1: ( ( rule__Leaves__NameAssignment_1 ) )
            {
            // InternalLSysGen.g:574:1: ( ( rule__Leaves__NameAssignment_1 ) )
            // InternalLSysGen.g:575:2: ( rule__Leaves__NameAssignment_1 )
            {
             before(grammarAccess.getLeavesAccess().getNameAssignment_1()); 
            // InternalLSysGen.g:576:2: ( rule__Leaves__NameAssignment_1 )
            // InternalLSysGen.g:576:3: rule__Leaves__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Leaves__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLeavesAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaves__Group__1__Impl"


    // $ANTLR start "rule__Leaves__Group__2"
    // InternalLSysGen.g:584:1: rule__Leaves__Group__2 : rule__Leaves__Group__2__Impl rule__Leaves__Group__3 ;
    public final void rule__Leaves__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:588:1: ( rule__Leaves__Group__2__Impl rule__Leaves__Group__3 )
            // InternalLSysGen.g:589:2: rule__Leaves__Group__2__Impl rule__Leaves__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Leaves__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Leaves__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaves__Group__2"


    // $ANTLR start "rule__Leaves__Group__2__Impl"
    // InternalLSysGen.g:596:1: rule__Leaves__Group__2__Impl : ( ':' ) ;
    public final void rule__Leaves__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:600:1: ( ( ':' ) )
            // InternalLSysGen.g:601:1: ( ':' )
            {
            // InternalLSysGen.g:601:1: ( ':' )
            // InternalLSysGen.g:602:2: ':'
            {
             before(grammarAccess.getLeavesAccess().getColonKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLeavesAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaves__Group__2__Impl"


    // $ANTLR start "rule__Leaves__Group__3"
    // InternalLSysGen.g:611:1: rule__Leaves__Group__3 : rule__Leaves__Group__3__Impl ;
    public final void rule__Leaves__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:615:1: ( rule__Leaves__Group__3__Impl )
            // InternalLSysGen.g:616:2: rule__Leaves__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Leaves__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaves__Group__3"


    // $ANTLR start "rule__Leaves__Group__3__Impl"
    // InternalLSysGen.g:622:1: rule__Leaves__Group__3__Impl : ( ( rule__Leaves__ValueAssignment_3 ) ) ;
    public final void rule__Leaves__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:626:1: ( ( ( rule__Leaves__ValueAssignment_3 ) ) )
            // InternalLSysGen.g:627:1: ( ( rule__Leaves__ValueAssignment_3 ) )
            {
            // InternalLSysGen.g:627:1: ( ( rule__Leaves__ValueAssignment_3 ) )
            // InternalLSysGen.g:628:2: ( rule__Leaves__ValueAssignment_3 )
            {
             before(grammarAccess.getLeavesAccess().getValueAssignment_3()); 
            // InternalLSysGen.g:629:2: ( rule__Leaves__ValueAssignment_3 )
            // InternalLSysGen.g:629:3: rule__Leaves__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Leaves__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLeavesAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaves__Group__3__Impl"


    // $ANTLR start "rule__Stems__Group__0"
    // InternalLSysGen.g:638:1: rule__Stems__Group__0 : rule__Stems__Group__0__Impl rule__Stems__Group__1 ;
    public final void rule__Stems__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:642:1: ( rule__Stems__Group__0__Impl rule__Stems__Group__1 )
            // InternalLSysGen.g:643:2: rule__Stems__Group__0__Impl rule__Stems__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Stems__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stems__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stems__Group__0"


    // $ANTLR start "rule__Stems__Group__0__Impl"
    // InternalLSysGen.g:650:1: rule__Stems__Group__0__Impl : ( () ) ;
    public final void rule__Stems__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:654:1: ( ( () ) )
            // InternalLSysGen.g:655:1: ( () )
            {
            // InternalLSysGen.g:655:1: ( () )
            // InternalLSysGen.g:656:2: ()
            {
             before(grammarAccess.getStemsAccess().getStemsAction_0()); 
            // InternalLSysGen.g:657:2: ()
            // InternalLSysGen.g:657:3: 
            {
            }

             after(grammarAccess.getStemsAccess().getStemsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stems__Group__0__Impl"


    // $ANTLR start "rule__Stems__Group__1"
    // InternalLSysGen.g:665:1: rule__Stems__Group__1 : rule__Stems__Group__1__Impl rule__Stems__Group__2 ;
    public final void rule__Stems__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:669:1: ( rule__Stems__Group__1__Impl rule__Stems__Group__2 )
            // InternalLSysGen.g:670:2: rule__Stems__Group__1__Impl rule__Stems__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Stems__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stems__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stems__Group__1"


    // $ANTLR start "rule__Stems__Group__1__Impl"
    // InternalLSysGen.g:677:1: rule__Stems__Group__1__Impl : ( ( rule__Stems__NameAssignment_1 ) ) ;
    public final void rule__Stems__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:681:1: ( ( ( rule__Stems__NameAssignment_1 ) ) )
            // InternalLSysGen.g:682:1: ( ( rule__Stems__NameAssignment_1 ) )
            {
            // InternalLSysGen.g:682:1: ( ( rule__Stems__NameAssignment_1 ) )
            // InternalLSysGen.g:683:2: ( rule__Stems__NameAssignment_1 )
            {
             before(grammarAccess.getStemsAccess().getNameAssignment_1()); 
            // InternalLSysGen.g:684:2: ( rule__Stems__NameAssignment_1 )
            // InternalLSysGen.g:684:3: rule__Stems__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Stems__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStemsAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stems__Group__1__Impl"


    // $ANTLR start "rule__Stems__Group__2"
    // InternalLSysGen.g:692:1: rule__Stems__Group__2 : rule__Stems__Group__2__Impl rule__Stems__Group__3 ;
    public final void rule__Stems__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:696:1: ( rule__Stems__Group__2__Impl rule__Stems__Group__3 )
            // InternalLSysGen.g:697:2: rule__Stems__Group__2__Impl rule__Stems__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Stems__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stems__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stems__Group__2"


    // $ANTLR start "rule__Stems__Group__2__Impl"
    // InternalLSysGen.g:704:1: rule__Stems__Group__2__Impl : ( ':' ) ;
    public final void rule__Stems__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:708:1: ( ( ':' ) )
            // InternalLSysGen.g:709:1: ( ':' )
            {
            // InternalLSysGen.g:709:1: ( ':' )
            // InternalLSysGen.g:710:2: ':'
            {
             before(grammarAccess.getStemsAccess().getColonKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getStemsAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stems__Group__2__Impl"


    // $ANTLR start "rule__Stems__Group__3"
    // InternalLSysGen.g:719:1: rule__Stems__Group__3 : rule__Stems__Group__3__Impl ;
    public final void rule__Stems__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:723:1: ( rule__Stems__Group__3__Impl )
            // InternalLSysGen.g:724:2: rule__Stems__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Stems__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stems__Group__3"


    // $ANTLR start "rule__Stems__Group__3__Impl"
    // InternalLSysGen.g:730:1: rule__Stems__Group__3__Impl : ( ( rule__Stems__ValueAssignment_3 ) ) ;
    public final void rule__Stems__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:734:1: ( ( ( rule__Stems__ValueAssignment_3 ) ) )
            // InternalLSysGen.g:735:1: ( ( rule__Stems__ValueAssignment_3 ) )
            {
            // InternalLSysGen.g:735:1: ( ( rule__Stems__ValueAssignment_3 ) )
            // InternalLSysGen.g:736:2: ( rule__Stems__ValueAssignment_3 )
            {
             before(grammarAccess.getStemsAccess().getValueAssignment_3()); 
            // InternalLSysGen.g:737:2: ( rule__Stems__ValueAssignment_3 )
            // InternalLSysGen.g:737:3: rule__Stems__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Stems__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStemsAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stems__Group__3__Impl"


    // $ANTLR start "rule__Fruits__Group__0"
    // InternalLSysGen.g:746:1: rule__Fruits__Group__0 : rule__Fruits__Group__0__Impl rule__Fruits__Group__1 ;
    public final void rule__Fruits__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:750:1: ( rule__Fruits__Group__0__Impl rule__Fruits__Group__1 )
            // InternalLSysGen.g:751:2: rule__Fruits__Group__0__Impl rule__Fruits__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Fruits__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fruits__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fruits__Group__0"


    // $ANTLR start "rule__Fruits__Group__0__Impl"
    // InternalLSysGen.g:758:1: rule__Fruits__Group__0__Impl : ( () ) ;
    public final void rule__Fruits__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:762:1: ( ( () ) )
            // InternalLSysGen.g:763:1: ( () )
            {
            // InternalLSysGen.g:763:1: ( () )
            // InternalLSysGen.g:764:2: ()
            {
             before(grammarAccess.getFruitsAccess().getFruitsAction_0()); 
            // InternalLSysGen.g:765:2: ()
            // InternalLSysGen.g:765:3: 
            {
            }

             after(grammarAccess.getFruitsAccess().getFruitsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fruits__Group__0__Impl"


    // $ANTLR start "rule__Fruits__Group__1"
    // InternalLSysGen.g:773:1: rule__Fruits__Group__1 : rule__Fruits__Group__1__Impl rule__Fruits__Group__2 ;
    public final void rule__Fruits__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:777:1: ( rule__Fruits__Group__1__Impl rule__Fruits__Group__2 )
            // InternalLSysGen.g:778:2: rule__Fruits__Group__1__Impl rule__Fruits__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Fruits__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fruits__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fruits__Group__1"


    // $ANTLR start "rule__Fruits__Group__1__Impl"
    // InternalLSysGen.g:785:1: rule__Fruits__Group__1__Impl : ( ( rule__Fruits__NameAssignment_1 ) ) ;
    public final void rule__Fruits__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:789:1: ( ( ( rule__Fruits__NameAssignment_1 ) ) )
            // InternalLSysGen.g:790:1: ( ( rule__Fruits__NameAssignment_1 ) )
            {
            // InternalLSysGen.g:790:1: ( ( rule__Fruits__NameAssignment_1 ) )
            // InternalLSysGen.g:791:2: ( rule__Fruits__NameAssignment_1 )
            {
             before(grammarAccess.getFruitsAccess().getNameAssignment_1()); 
            // InternalLSysGen.g:792:2: ( rule__Fruits__NameAssignment_1 )
            // InternalLSysGen.g:792:3: rule__Fruits__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Fruits__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFruitsAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fruits__Group__1__Impl"


    // $ANTLR start "rule__Fruits__Group__2"
    // InternalLSysGen.g:800:1: rule__Fruits__Group__2 : rule__Fruits__Group__2__Impl rule__Fruits__Group__3 ;
    public final void rule__Fruits__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:804:1: ( rule__Fruits__Group__2__Impl rule__Fruits__Group__3 )
            // InternalLSysGen.g:805:2: rule__Fruits__Group__2__Impl rule__Fruits__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Fruits__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fruits__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fruits__Group__2"


    // $ANTLR start "rule__Fruits__Group__2__Impl"
    // InternalLSysGen.g:812:1: rule__Fruits__Group__2__Impl : ( ':' ) ;
    public final void rule__Fruits__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:816:1: ( ( ':' ) )
            // InternalLSysGen.g:817:1: ( ':' )
            {
            // InternalLSysGen.g:817:1: ( ':' )
            // InternalLSysGen.g:818:2: ':'
            {
             before(grammarAccess.getFruitsAccess().getColonKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFruitsAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fruits__Group__2__Impl"


    // $ANTLR start "rule__Fruits__Group__3"
    // InternalLSysGen.g:827:1: rule__Fruits__Group__3 : rule__Fruits__Group__3__Impl ;
    public final void rule__Fruits__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:831:1: ( rule__Fruits__Group__3__Impl )
            // InternalLSysGen.g:832:2: rule__Fruits__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fruits__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fruits__Group__3"


    // $ANTLR start "rule__Fruits__Group__3__Impl"
    // InternalLSysGen.g:838:1: rule__Fruits__Group__3__Impl : ( ( rule__Fruits__ValueAssignment_3 ) ) ;
    public final void rule__Fruits__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:842:1: ( ( ( rule__Fruits__ValueAssignment_3 ) ) )
            // InternalLSysGen.g:843:1: ( ( rule__Fruits__ValueAssignment_3 ) )
            {
            // InternalLSysGen.g:843:1: ( ( rule__Fruits__ValueAssignment_3 ) )
            // InternalLSysGen.g:844:2: ( rule__Fruits__ValueAssignment_3 )
            {
             before(grammarAccess.getFruitsAccess().getValueAssignment_3()); 
            // InternalLSysGen.g:845:2: ( rule__Fruits__ValueAssignment_3 )
            // InternalLSysGen.g:845:3: rule__Fruits__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Fruits__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFruitsAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fruits__Group__3__Impl"


    // $ANTLR start "rule__MaxAge__Group__0"
    // InternalLSysGen.g:854:1: rule__MaxAge__Group__0 : rule__MaxAge__Group__0__Impl rule__MaxAge__Group__1 ;
    public final void rule__MaxAge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:858:1: ( rule__MaxAge__Group__0__Impl rule__MaxAge__Group__1 )
            // InternalLSysGen.g:859:2: rule__MaxAge__Group__0__Impl rule__MaxAge__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__MaxAge__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxAge__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxAge__Group__0"


    // $ANTLR start "rule__MaxAge__Group__0__Impl"
    // InternalLSysGen.g:866:1: rule__MaxAge__Group__0__Impl : ( () ) ;
    public final void rule__MaxAge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:870:1: ( ( () ) )
            // InternalLSysGen.g:871:1: ( () )
            {
            // InternalLSysGen.g:871:1: ( () )
            // InternalLSysGen.g:872:2: ()
            {
             before(grammarAccess.getMaxAgeAccess().getMaxAgeAction_0()); 
            // InternalLSysGen.g:873:2: ()
            // InternalLSysGen.g:873:3: 
            {
            }

             after(grammarAccess.getMaxAgeAccess().getMaxAgeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxAge__Group__0__Impl"


    // $ANTLR start "rule__MaxAge__Group__1"
    // InternalLSysGen.g:881:1: rule__MaxAge__Group__1 : rule__MaxAge__Group__1__Impl rule__MaxAge__Group__2 ;
    public final void rule__MaxAge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:885:1: ( rule__MaxAge__Group__1__Impl rule__MaxAge__Group__2 )
            // InternalLSysGen.g:886:2: rule__MaxAge__Group__1__Impl rule__MaxAge__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__MaxAge__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxAge__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxAge__Group__1"


    // $ANTLR start "rule__MaxAge__Group__1__Impl"
    // InternalLSysGen.g:893:1: rule__MaxAge__Group__1__Impl : ( ( rule__MaxAge__NameAssignment_1 ) ) ;
    public final void rule__MaxAge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:897:1: ( ( ( rule__MaxAge__NameAssignment_1 ) ) )
            // InternalLSysGen.g:898:1: ( ( rule__MaxAge__NameAssignment_1 ) )
            {
            // InternalLSysGen.g:898:1: ( ( rule__MaxAge__NameAssignment_1 ) )
            // InternalLSysGen.g:899:2: ( rule__MaxAge__NameAssignment_1 )
            {
             before(grammarAccess.getMaxAgeAccess().getNameAssignment_1()); 
            // InternalLSysGen.g:900:2: ( rule__MaxAge__NameAssignment_1 )
            // InternalLSysGen.g:900:3: rule__MaxAge__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MaxAge__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMaxAgeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxAge__Group__1__Impl"


    // $ANTLR start "rule__MaxAge__Group__2"
    // InternalLSysGen.g:908:1: rule__MaxAge__Group__2 : rule__MaxAge__Group__2__Impl rule__MaxAge__Group__3 ;
    public final void rule__MaxAge__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:912:1: ( rule__MaxAge__Group__2__Impl rule__MaxAge__Group__3 )
            // InternalLSysGen.g:913:2: rule__MaxAge__Group__2__Impl rule__MaxAge__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__MaxAge__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxAge__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxAge__Group__2"


    // $ANTLR start "rule__MaxAge__Group__2__Impl"
    // InternalLSysGen.g:920:1: rule__MaxAge__Group__2__Impl : ( ':' ) ;
    public final void rule__MaxAge__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:924:1: ( ( ':' ) )
            // InternalLSysGen.g:925:1: ( ':' )
            {
            // InternalLSysGen.g:925:1: ( ':' )
            // InternalLSysGen.g:926:2: ':'
            {
             before(grammarAccess.getMaxAgeAccess().getColonKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMaxAgeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxAge__Group__2__Impl"


    // $ANTLR start "rule__MaxAge__Group__3"
    // InternalLSysGen.g:935:1: rule__MaxAge__Group__3 : rule__MaxAge__Group__3__Impl ;
    public final void rule__MaxAge__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:939:1: ( rule__MaxAge__Group__3__Impl )
            // InternalLSysGen.g:940:2: rule__MaxAge__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MaxAge__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxAge__Group__3"


    // $ANTLR start "rule__MaxAge__Group__3__Impl"
    // InternalLSysGen.g:946:1: rule__MaxAge__Group__3__Impl : ( ( rule__MaxAge__ValueAssignment_3 ) ) ;
    public final void rule__MaxAge__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:950:1: ( ( ( rule__MaxAge__ValueAssignment_3 ) ) )
            // InternalLSysGen.g:951:1: ( ( rule__MaxAge__ValueAssignment_3 ) )
            {
            // InternalLSysGen.g:951:1: ( ( rule__MaxAge__ValueAssignment_3 ) )
            // InternalLSysGen.g:952:2: ( rule__MaxAge__ValueAssignment_3 )
            {
             before(grammarAccess.getMaxAgeAccess().getValueAssignment_3()); 
            // InternalLSysGen.g:953:2: ( rule__MaxAge__ValueAssignment_3 )
            // InternalLSysGen.g:953:3: rule__MaxAge__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MaxAge__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMaxAgeAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxAge__Group__3__Impl"


    // $ANTLR start "rule__TriLobe_th__Group__0"
    // InternalLSysGen.g:962:1: rule__TriLobe_th__Group__0 : rule__TriLobe_th__Group__0__Impl rule__TriLobe_th__Group__1 ;
    public final void rule__TriLobe_th__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:966:1: ( rule__TriLobe_th__Group__0__Impl rule__TriLobe_th__Group__1 )
            // InternalLSysGen.g:967:2: rule__TriLobe_th__Group__0__Impl rule__TriLobe_th__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__TriLobe_th__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TriLobe_th__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriLobe_th__Group__0"


    // $ANTLR start "rule__TriLobe_th__Group__0__Impl"
    // InternalLSysGen.g:974:1: rule__TriLobe_th__Group__0__Impl : ( () ) ;
    public final void rule__TriLobe_th__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:978:1: ( ( () ) )
            // InternalLSysGen.g:979:1: ( () )
            {
            // InternalLSysGen.g:979:1: ( () )
            // InternalLSysGen.g:980:2: ()
            {
             before(grammarAccess.getTriLobe_thAccess().getTriLobe_thAction_0()); 
            // InternalLSysGen.g:981:2: ()
            // InternalLSysGen.g:981:3: 
            {
            }

             after(grammarAccess.getTriLobe_thAccess().getTriLobe_thAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriLobe_th__Group__0__Impl"


    // $ANTLR start "rule__TriLobe_th__Group__1"
    // InternalLSysGen.g:989:1: rule__TriLobe_th__Group__1 : rule__TriLobe_th__Group__1__Impl rule__TriLobe_th__Group__2 ;
    public final void rule__TriLobe_th__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:993:1: ( rule__TriLobe_th__Group__1__Impl rule__TriLobe_th__Group__2 )
            // InternalLSysGen.g:994:2: rule__TriLobe_th__Group__1__Impl rule__TriLobe_th__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__TriLobe_th__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TriLobe_th__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriLobe_th__Group__1"


    // $ANTLR start "rule__TriLobe_th__Group__1__Impl"
    // InternalLSysGen.g:1001:1: rule__TriLobe_th__Group__1__Impl : ( ( rule__TriLobe_th__NameAssignment_1 ) ) ;
    public final void rule__TriLobe_th__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:1005:1: ( ( ( rule__TriLobe_th__NameAssignment_1 ) ) )
            // InternalLSysGen.g:1006:1: ( ( rule__TriLobe_th__NameAssignment_1 ) )
            {
            // InternalLSysGen.g:1006:1: ( ( rule__TriLobe_th__NameAssignment_1 ) )
            // InternalLSysGen.g:1007:2: ( rule__TriLobe_th__NameAssignment_1 )
            {
             before(grammarAccess.getTriLobe_thAccess().getNameAssignment_1()); 
            // InternalLSysGen.g:1008:2: ( rule__TriLobe_th__NameAssignment_1 )
            // InternalLSysGen.g:1008:3: rule__TriLobe_th__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TriLobe_th__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTriLobe_thAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriLobe_th__Group__1__Impl"


    // $ANTLR start "rule__TriLobe_th__Group__2"
    // InternalLSysGen.g:1016:1: rule__TriLobe_th__Group__2 : rule__TriLobe_th__Group__2__Impl rule__TriLobe_th__Group__3 ;
    public final void rule__TriLobe_th__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:1020:1: ( rule__TriLobe_th__Group__2__Impl rule__TriLobe_th__Group__3 )
            // InternalLSysGen.g:1021:2: rule__TriLobe_th__Group__2__Impl rule__TriLobe_th__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__TriLobe_th__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TriLobe_th__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriLobe_th__Group__2"


    // $ANTLR start "rule__TriLobe_th__Group__2__Impl"
    // InternalLSysGen.g:1028:1: rule__TriLobe_th__Group__2__Impl : ( ':' ) ;
    public final void rule__TriLobe_th__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:1032:1: ( ( ':' ) )
            // InternalLSysGen.g:1033:1: ( ':' )
            {
            // InternalLSysGen.g:1033:1: ( ':' )
            // InternalLSysGen.g:1034:2: ':'
            {
             before(grammarAccess.getTriLobe_thAccess().getColonKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTriLobe_thAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriLobe_th__Group__2__Impl"


    // $ANTLR start "rule__TriLobe_th__Group__3"
    // InternalLSysGen.g:1043:1: rule__TriLobe_th__Group__3 : rule__TriLobe_th__Group__3__Impl ;
    public final void rule__TriLobe_th__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:1047:1: ( rule__TriLobe_th__Group__3__Impl )
            // InternalLSysGen.g:1048:2: rule__TriLobe_th__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TriLobe_th__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriLobe_th__Group__3"


    // $ANTLR start "rule__TriLobe_th__Group__3__Impl"
    // InternalLSysGen.g:1054:1: rule__TriLobe_th__Group__3__Impl : ( ( rule__TriLobe_th__ValueAssignment_3 ) ) ;
    public final void rule__TriLobe_th__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:1058:1: ( ( ( rule__TriLobe_th__ValueAssignment_3 ) ) )
            // InternalLSysGen.g:1059:1: ( ( rule__TriLobe_th__ValueAssignment_3 ) )
            {
            // InternalLSysGen.g:1059:1: ( ( rule__TriLobe_th__ValueAssignment_3 ) )
            // InternalLSysGen.g:1060:2: ( rule__TriLobe_th__ValueAssignment_3 )
            {
             before(grammarAccess.getTriLobe_thAccess().getValueAssignment_3()); 
            // InternalLSysGen.g:1061:2: ( rule__TriLobe_th__ValueAssignment_3 )
            // InternalLSysGen.g:1061:3: rule__TriLobe_th__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TriLobe_th__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTriLobe_thAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriLobe_th__Group__3__Impl"


    // $ANTLR start "rule__SingleLobe_th__Group__0"
    // InternalLSysGen.g:1070:1: rule__SingleLobe_th__Group__0 : rule__SingleLobe_th__Group__0__Impl rule__SingleLobe_th__Group__1 ;
    public final void rule__SingleLobe_th__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:1074:1: ( rule__SingleLobe_th__Group__0__Impl rule__SingleLobe_th__Group__1 )
            // InternalLSysGen.g:1075:2: rule__SingleLobe_th__Group__0__Impl rule__SingleLobe_th__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__SingleLobe_th__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleLobe_th__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleLobe_th__Group__0"


    // $ANTLR start "rule__SingleLobe_th__Group__0__Impl"
    // InternalLSysGen.g:1082:1: rule__SingleLobe_th__Group__0__Impl : ( () ) ;
    public final void rule__SingleLobe_th__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:1086:1: ( ( () ) )
            // InternalLSysGen.g:1087:1: ( () )
            {
            // InternalLSysGen.g:1087:1: ( () )
            // InternalLSysGen.g:1088:2: ()
            {
             before(grammarAccess.getSingleLobe_thAccess().getSingleLobe_thAction_0()); 
            // InternalLSysGen.g:1089:2: ()
            // InternalLSysGen.g:1089:3: 
            {
            }

             after(grammarAccess.getSingleLobe_thAccess().getSingleLobe_thAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleLobe_th__Group__0__Impl"


    // $ANTLR start "rule__SingleLobe_th__Group__1"
    // InternalLSysGen.g:1097:1: rule__SingleLobe_th__Group__1 : rule__SingleLobe_th__Group__1__Impl rule__SingleLobe_th__Group__2 ;
    public final void rule__SingleLobe_th__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:1101:1: ( rule__SingleLobe_th__Group__1__Impl rule__SingleLobe_th__Group__2 )
            // InternalLSysGen.g:1102:2: rule__SingleLobe_th__Group__1__Impl rule__SingleLobe_th__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__SingleLobe_th__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleLobe_th__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleLobe_th__Group__1"


    // $ANTLR start "rule__SingleLobe_th__Group__1__Impl"
    // InternalLSysGen.g:1109:1: rule__SingleLobe_th__Group__1__Impl : ( ( rule__SingleLobe_th__NameAssignment_1 ) ) ;
    public final void rule__SingleLobe_th__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:1113:1: ( ( ( rule__SingleLobe_th__NameAssignment_1 ) ) )
            // InternalLSysGen.g:1114:1: ( ( rule__SingleLobe_th__NameAssignment_1 ) )
            {
            // InternalLSysGen.g:1114:1: ( ( rule__SingleLobe_th__NameAssignment_1 ) )
            // InternalLSysGen.g:1115:2: ( rule__SingleLobe_th__NameAssignment_1 )
            {
             before(grammarAccess.getSingleLobe_thAccess().getNameAssignment_1()); 
            // InternalLSysGen.g:1116:2: ( rule__SingleLobe_th__NameAssignment_1 )
            // InternalLSysGen.g:1116:3: rule__SingleLobe_th__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SingleLobe_th__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleLobe_thAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleLobe_th__Group__1__Impl"


    // $ANTLR start "rule__SingleLobe_th__Group__2"
    // InternalLSysGen.g:1124:1: rule__SingleLobe_th__Group__2 : rule__SingleLobe_th__Group__2__Impl rule__SingleLobe_th__Group__3 ;
    public final void rule__SingleLobe_th__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:1128:1: ( rule__SingleLobe_th__Group__2__Impl rule__SingleLobe_th__Group__3 )
            // InternalLSysGen.g:1129:2: rule__SingleLobe_th__Group__2__Impl rule__SingleLobe_th__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__SingleLobe_th__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleLobe_th__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleLobe_th__Group__2"


    // $ANTLR start "rule__SingleLobe_th__Group__2__Impl"
    // InternalLSysGen.g:1136:1: rule__SingleLobe_th__Group__2__Impl : ( ':' ) ;
    public final void rule__SingleLobe_th__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:1140:1: ( ( ':' ) )
            // InternalLSysGen.g:1141:1: ( ':' )
            {
            // InternalLSysGen.g:1141:1: ( ':' )
            // InternalLSysGen.g:1142:2: ':'
            {
             before(grammarAccess.getSingleLobe_thAccess().getColonKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSingleLobe_thAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleLobe_th__Group__2__Impl"


    // $ANTLR start "rule__SingleLobe_th__Group__3"
    // InternalLSysGen.g:1151:1: rule__SingleLobe_th__Group__3 : rule__SingleLobe_th__Group__3__Impl ;
    public final void rule__SingleLobe_th__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:1155:1: ( rule__SingleLobe_th__Group__3__Impl )
            // InternalLSysGen.g:1156:2: rule__SingleLobe_th__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleLobe_th__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleLobe_th__Group__3"


    // $ANTLR start "rule__SingleLobe_th__Group__3__Impl"
    // InternalLSysGen.g:1162:1: rule__SingleLobe_th__Group__3__Impl : ( ( rule__SingleLobe_th__ValueAssignment_3 ) ) ;
    public final void rule__SingleLobe_th__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:1166:1: ( ( ( rule__SingleLobe_th__ValueAssignment_3 ) ) )
            // InternalLSysGen.g:1167:1: ( ( rule__SingleLobe_th__ValueAssignment_3 ) )
            {
            // InternalLSysGen.g:1167:1: ( ( rule__SingleLobe_th__ValueAssignment_3 ) )
            // InternalLSysGen.g:1168:2: ( rule__SingleLobe_th__ValueAssignment_3 )
            {
             before(grammarAccess.getSingleLobe_thAccess().getValueAssignment_3()); 
            // InternalLSysGen.g:1169:2: ( rule__SingleLobe_th__ValueAssignment_3 )
            // InternalLSysGen.g:1169:3: rule__SingleLobe_th__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SingleLobe_th__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSingleLobe_thAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleLobe_th__Group__3__Impl"


    // $ANTLR start "rule__FloatValue__Group__0"
    // InternalLSysGen.g:1178:1: rule__FloatValue__Group__0 : rule__FloatValue__Group__0__Impl rule__FloatValue__Group__1 ;
    public final void rule__FloatValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:1182:1: ( rule__FloatValue__Group__0__Impl rule__FloatValue__Group__1 )
            // InternalLSysGen.g:1183:2: rule__FloatValue__Group__0__Impl rule__FloatValue__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__FloatValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FloatValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatValue__Group__0"


    // $ANTLR start "rule__FloatValue__Group__0__Impl"
    // InternalLSysGen.g:1190:1: rule__FloatValue__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__FloatValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:1194:1: ( ( RULE_INT ) )
            // InternalLSysGen.g:1195:1: ( RULE_INT )
            {
            // InternalLSysGen.g:1195:1: ( RULE_INT )
            // InternalLSysGen.g:1196:2: RULE_INT
            {
             before(grammarAccess.getFloatValueAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFloatValueAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatValue__Group__0__Impl"


    // $ANTLR start "rule__FloatValue__Group__1"
    // InternalLSysGen.g:1205:1: rule__FloatValue__Group__1 : rule__FloatValue__Group__1__Impl rule__FloatValue__Group__2 ;
    public final void rule__FloatValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:1209:1: ( rule__FloatValue__Group__1__Impl rule__FloatValue__Group__2 )
            // InternalLSysGen.g:1210:2: rule__FloatValue__Group__1__Impl rule__FloatValue__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__FloatValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FloatValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatValue__Group__1"


    // $ANTLR start "rule__FloatValue__Group__1__Impl"
    // InternalLSysGen.g:1217:1: rule__FloatValue__Group__1__Impl : ( '.' ) ;
    public final void rule__FloatValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:1221:1: ( ( '.' ) )
            // InternalLSysGen.g:1222:1: ( '.' )
            {
            // InternalLSysGen.g:1222:1: ( '.' )
            // InternalLSysGen.g:1223:2: '.'
            {
             before(grammarAccess.getFloatValueAccess().getFullStopKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFloatValueAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatValue__Group__1__Impl"


    // $ANTLR start "rule__FloatValue__Group__2"
    // InternalLSysGen.g:1232:1: rule__FloatValue__Group__2 : rule__FloatValue__Group__2__Impl ;
    public final void rule__FloatValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:1236:1: ( rule__FloatValue__Group__2__Impl )
            // InternalLSysGen.g:1237:2: rule__FloatValue__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FloatValue__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatValue__Group__2"


    // $ANTLR start "rule__FloatValue__Group__2__Impl"
    // InternalLSysGen.g:1243:1: rule__FloatValue__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__FloatValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:1247:1: ( ( RULE_INT ) )
            // InternalLSysGen.g:1248:1: ( RULE_INT )
            {
            // InternalLSysGen.g:1248:1: ( RULE_INT )
            // InternalLSysGen.g:1249:2: RULE_INT
            {
             before(grammarAccess.getFloatValueAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFloatValueAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatValue__Group__2__Impl"


    // $ANTLR start "rule__Crop__NameAssignment_0"
    // InternalLSysGen.g:1259:1: rule__Crop__NameAssignment_0 : ( ( 'Strawberry' ) ) ;
    public final void rule__Crop__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:1263:1: ( ( ( 'Strawberry' ) ) )
            // InternalLSysGen.g:1264:2: ( ( 'Strawberry' ) )
            {
            // InternalLSysGen.g:1264:2: ( ( 'Strawberry' ) )
            // InternalLSysGen.g:1265:3: ( 'Strawberry' )
            {
             before(grammarAccess.getCropAccess().getNameStrawberryKeyword_0_0()); 
            // InternalLSysGen.g:1266:3: ( 'Strawberry' )
            // InternalLSysGen.g:1267:4: 'Strawberry'
            {
             before(grammarAccess.getCropAccess().getNameStrawberryKeyword_0_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCropAccess().getNameStrawberryKeyword_0_0()); 

            }

             after(grammarAccess.getCropAccess().getNameStrawberryKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Crop__NameAssignment_0"


    // $ANTLR start "rule__Crop__OrgansAssignment_2"
    // InternalLSysGen.g:1278:1: rule__Crop__OrgansAssignment_2 : ( ruleOrgan ) ;
    public final void rule__Crop__OrgansAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:1282:1: ( ( ruleOrgan ) )
            // InternalLSysGen.g:1283:2: ( ruleOrgan )
            {
            // InternalLSysGen.g:1283:2: ( ruleOrgan )
            // InternalLSysGen.g:1284:3: ruleOrgan
            {
             before(grammarAccess.getCropAccess().getOrgansOrganParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOrgan();

            state._fsp--;

             after(grammarAccess.getCropAccess().getOrgansOrganParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Crop__OrgansAssignment_2"


    // $ANTLR start "rule__Crop__ParametersAssignment_3"
    // InternalLSysGen.g:1293:1: rule__Crop__ParametersAssignment_3 : ( ruleParameter ) ;
    public final void rule__Crop__ParametersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:1297:1: ( ( ruleParameter ) )
            // InternalLSysGen.g:1298:2: ( ruleParameter )
            {
            // InternalLSysGen.g:1298:2: ( ruleParameter )
            // InternalLSysGen.g:1299:3: ruleParameter
            {
             before(grammarAccess.getCropAccess().getParametersParameterParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getCropAccess().getParametersParameterParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Crop__ParametersAssignment_3"


    // $ANTLR start "rule__Leaves__NameAssignment_1"
    // InternalLSysGen.g:1308:1: rule__Leaves__NameAssignment_1 : ( ( 'Leaves' ) ) ;
    public final void rule__Leaves__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:1312:1: ( ( ( 'Leaves' ) ) )
            // InternalLSysGen.g:1313:2: ( ( 'Leaves' ) )
            {
            // InternalLSysGen.g:1313:2: ( ( 'Leaves' ) )
            // InternalLSysGen.g:1314:3: ( 'Leaves' )
            {
             before(grammarAccess.getLeavesAccess().getNameLeavesKeyword_1_0()); 
            // InternalLSysGen.g:1315:3: ( 'Leaves' )
            // InternalLSysGen.g:1316:4: 'Leaves'
            {
             before(grammarAccess.getLeavesAccess().getNameLeavesKeyword_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLeavesAccess().getNameLeavesKeyword_1_0()); 

            }

             after(grammarAccess.getLeavesAccess().getNameLeavesKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaves__NameAssignment_1"


    // $ANTLR start "rule__Leaves__ValueAssignment_3"
    // InternalLSysGen.g:1327:1: rule__Leaves__ValueAssignment_3 : ( ruleIntValue ) ;
    public final void rule__Leaves__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:1331:1: ( ( ruleIntValue ) )
            // InternalLSysGen.g:1332:2: ( ruleIntValue )
            {
            // InternalLSysGen.g:1332:2: ( ruleIntValue )
            // InternalLSysGen.g:1333:3: ruleIntValue
            {
             before(grammarAccess.getLeavesAccess().getValueIntValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleIntValue();

            state._fsp--;

             after(grammarAccess.getLeavesAccess().getValueIntValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Leaves__ValueAssignment_3"


    // $ANTLR start "rule__Stems__NameAssignment_1"
    // InternalLSysGen.g:1342:1: rule__Stems__NameAssignment_1 : ( ( 'Stems' ) ) ;
    public final void rule__Stems__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:1346:1: ( ( ( 'Stems' ) ) )
            // InternalLSysGen.g:1347:2: ( ( 'Stems' ) )
            {
            // InternalLSysGen.g:1347:2: ( ( 'Stems' ) )
            // InternalLSysGen.g:1348:3: ( 'Stems' )
            {
             before(grammarAccess.getStemsAccess().getNameStemsKeyword_1_0()); 
            // InternalLSysGen.g:1349:3: ( 'Stems' )
            // InternalLSysGen.g:1350:4: 'Stems'
            {
             before(grammarAccess.getStemsAccess().getNameStemsKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getStemsAccess().getNameStemsKeyword_1_0()); 

            }

             after(grammarAccess.getStemsAccess().getNameStemsKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stems__NameAssignment_1"


    // $ANTLR start "rule__Stems__ValueAssignment_3"
    // InternalLSysGen.g:1361:1: rule__Stems__ValueAssignment_3 : ( ruleIntValue ) ;
    public final void rule__Stems__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:1365:1: ( ( ruleIntValue ) )
            // InternalLSysGen.g:1366:2: ( ruleIntValue )
            {
            // InternalLSysGen.g:1366:2: ( ruleIntValue )
            // InternalLSysGen.g:1367:3: ruleIntValue
            {
             before(grammarAccess.getStemsAccess().getValueIntValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleIntValue();

            state._fsp--;

             after(grammarAccess.getStemsAccess().getValueIntValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stems__ValueAssignment_3"


    // $ANTLR start "rule__Fruits__NameAssignment_1"
    // InternalLSysGen.g:1376:1: rule__Fruits__NameAssignment_1 : ( ( 'Fruits' ) ) ;
    public final void rule__Fruits__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:1380:1: ( ( ( 'Fruits' ) ) )
            // InternalLSysGen.g:1381:2: ( ( 'Fruits' ) )
            {
            // InternalLSysGen.g:1381:2: ( ( 'Fruits' ) )
            // InternalLSysGen.g:1382:3: ( 'Fruits' )
            {
             before(grammarAccess.getFruitsAccess().getNameFruitsKeyword_1_0()); 
            // InternalLSysGen.g:1383:3: ( 'Fruits' )
            // InternalLSysGen.g:1384:4: 'Fruits'
            {
             before(grammarAccess.getFruitsAccess().getNameFruitsKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFruitsAccess().getNameFruitsKeyword_1_0()); 

            }

             after(grammarAccess.getFruitsAccess().getNameFruitsKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fruits__NameAssignment_1"


    // $ANTLR start "rule__Fruits__ValueAssignment_3"
    // InternalLSysGen.g:1395:1: rule__Fruits__ValueAssignment_3 : ( ruleIntValue ) ;
    public final void rule__Fruits__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:1399:1: ( ( ruleIntValue ) )
            // InternalLSysGen.g:1400:2: ( ruleIntValue )
            {
            // InternalLSysGen.g:1400:2: ( ruleIntValue )
            // InternalLSysGen.g:1401:3: ruleIntValue
            {
             before(grammarAccess.getFruitsAccess().getValueIntValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleIntValue();

            state._fsp--;

             after(grammarAccess.getFruitsAccess().getValueIntValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fruits__ValueAssignment_3"


    // $ANTLR start "rule__MaxAge__NameAssignment_1"
    // InternalLSysGen.g:1410:1: rule__MaxAge__NameAssignment_1 : ( ( 'Age' ) ) ;
    public final void rule__MaxAge__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:1414:1: ( ( ( 'Age' ) ) )
            // InternalLSysGen.g:1415:2: ( ( 'Age' ) )
            {
            // InternalLSysGen.g:1415:2: ( ( 'Age' ) )
            // InternalLSysGen.g:1416:3: ( 'Age' )
            {
             before(grammarAccess.getMaxAgeAccess().getNameAgeKeyword_1_0()); 
            // InternalLSysGen.g:1417:3: ( 'Age' )
            // InternalLSysGen.g:1418:4: 'Age'
            {
             before(grammarAccess.getMaxAgeAccess().getNameAgeKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMaxAgeAccess().getNameAgeKeyword_1_0()); 

            }

             after(grammarAccess.getMaxAgeAccess().getNameAgeKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxAge__NameAssignment_1"


    // $ANTLR start "rule__MaxAge__ValueAssignment_3"
    // InternalLSysGen.g:1429:1: rule__MaxAge__ValueAssignment_3 : ( ruleIntValue ) ;
    public final void rule__MaxAge__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:1433:1: ( ( ruleIntValue ) )
            // InternalLSysGen.g:1434:2: ( ruleIntValue )
            {
            // InternalLSysGen.g:1434:2: ( ruleIntValue )
            // InternalLSysGen.g:1435:3: ruleIntValue
            {
             before(grammarAccess.getMaxAgeAccess().getValueIntValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleIntValue();

            state._fsp--;

             after(grammarAccess.getMaxAgeAccess().getValueIntValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxAge__ValueAssignment_3"


    // $ANTLR start "rule__TriLobe_th__NameAssignment_1"
    // InternalLSysGen.g:1444:1: rule__TriLobe_th__NameAssignment_1 : ( ( 'TriLobe_th' ) ) ;
    public final void rule__TriLobe_th__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:1448:1: ( ( ( 'TriLobe_th' ) ) )
            // InternalLSysGen.g:1449:2: ( ( 'TriLobe_th' ) )
            {
            // InternalLSysGen.g:1449:2: ( ( 'TriLobe_th' ) )
            // InternalLSysGen.g:1450:3: ( 'TriLobe_th' )
            {
             before(grammarAccess.getTriLobe_thAccess().getNameTriLobe_thKeyword_1_0()); 
            // InternalLSysGen.g:1451:3: ( 'TriLobe_th' )
            // InternalLSysGen.g:1452:4: 'TriLobe_th'
            {
             before(grammarAccess.getTriLobe_thAccess().getNameTriLobe_thKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTriLobe_thAccess().getNameTriLobe_thKeyword_1_0()); 

            }

             after(grammarAccess.getTriLobe_thAccess().getNameTriLobe_thKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriLobe_th__NameAssignment_1"


    // $ANTLR start "rule__TriLobe_th__ValueAssignment_3"
    // InternalLSysGen.g:1463:1: rule__TriLobe_th__ValueAssignment_3 : ( ruleFloatValue ) ;
    public final void rule__TriLobe_th__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:1467:1: ( ( ruleFloatValue ) )
            // InternalLSysGen.g:1468:2: ( ruleFloatValue )
            {
            // InternalLSysGen.g:1468:2: ( ruleFloatValue )
            // InternalLSysGen.g:1469:3: ruleFloatValue
            {
             before(grammarAccess.getTriLobe_thAccess().getValueFloatValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFloatValue();

            state._fsp--;

             after(grammarAccess.getTriLobe_thAccess().getValueFloatValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriLobe_th__ValueAssignment_3"


    // $ANTLR start "rule__SingleLobe_th__NameAssignment_1"
    // InternalLSysGen.g:1478:1: rule__SingleLobe_th__NameAssignment_1 : ( ( 'SingleLobe_th' ) ) ;
    public final void rule__SingleLobe_th__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:1482:1: ( ( ( 'SingleLobe_th' ) ) )
            // InternalLSysGen.g:1483:2: ( ( 'SingleLobe_th' ) )
            {
            // InternalLSysGen.g:1483:2: ( ( 'SingleLobe_th' ) )
            // InternalLSysGen.g:1484:3: ( 'SingleLobe_th' )
            {
             before(grammarAccess.getSingleLobe_thAccess().getNameSingleLobe_thKeyword_1_0()); 
            // InternalLSysGen.g:1485:3: ( 'SingleLobe_th' )
            // InternalLSysGen.g:1486:4: 'SingleLobe_th'
            {
             before(grammarAccess.getSingleLobe_thAccess().getNameSingleLobe_thKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSingleLobe_thAccess().getNameSingleLobe_thKeyword_1_0()); 

            }

             after(grammarAccess.getSingleLobe_thAccess().getNameSingleLobe_thKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleLobe_th__NameAssignment_1"


    // $ANTLR start "rule__SingleLobe_th__ValueAssignment_3"
    // InternalLSysGen.g:1497:1: rule__SingleLobe_th__ValueAssignment_3 : ( ruleFloatValue ) ;
    public final void rule__SingleLobe_th__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLSysGen.g:1501:1: ( ( ruleFloatValue ) )
            // InternalLSysGen.g:1502:2: ( ruleFloatValue )
            {
            // InternalLSysGen.g:1502:2: ( ruleFloatValue )
            // InternalLSysGen.g:1503:3: ruleFloatValue
            {
             before(grammarAccess.getSingleLobe_thAccess().getValueFloatValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFloatValue();

            state._fsp--;

             after(grammarAccess.getSingleLobe_thAccess().getValueFloatValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleLobe_th__ValueAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000E0002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000008000L});

}