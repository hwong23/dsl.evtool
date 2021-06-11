package hwo.evtool.dsl.ide.contentassist.antlr.internal;

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
import hwo.evtool.dsl.services.EvaluacionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEvaluacionParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'S'", "'N'", "'componente'", "'{'", "'}'", "'hereda'", "'criterio'", "']'", "'['"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalEvaluacionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEvaluacionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEvaluacionParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEvaluacion.g"; }


    	private EvaluacionGrammarAccess grammarAccess;

    	public void setGrammarAccess(EvaluacionGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalEvaluacion.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalEvaluacion.g:54:1: ( ruleModel EOF )
            // InternalEvaluacion.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalEvaluacion.g:62:1: ruleModel : ( ( rule__Model__EntitiesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:66:2: ( ( ( rule__Model__EntitiesAssignment )* ) )
            // InternalEvaluacion.g:67:2: ( ( rule__Model__EntitiesAssignment )* )
            {
            // InternalEvaluacion.g:67:2: ( ( rule__Model__EntitiesAssignment )* )
            // InternalEvaluacion.g:68:3: ( rule__Model__EntitiesAssignment )*
            {
             before(grammarAccess.getModelAccess().getEntitiesAssignment()); 
            // InternalEvaluacion.g:69:3: ( rule__Model__EntitiesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEvaluacion.g:69:4: rule__Model__EntitiesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__EntitiesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getEntitiesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCmpntEvaluacion"
    // InternalEvaluacion.g:78:1: entryRuleCmpntEvaluacion : ruleCmpntEvaluacion EOF ;
    public final void entryRuleCmpntEvaluacion() throws RecognitionException {
        try {
            // InternalEvaluacion.g:79:1: ( ruleCmpntEvaluacion EOF )
            // InternalEvaluacion.g:80:1: ruleCmpntEvaluacion EOF
            {
             before(grammarAccess.getCmpntEvaluacionRule()); 
            pushFollow(FOLLOW_1);
            ruleCmpntEvaluacion();

            state._fsp--;

             after(grammarAccess.getCmpntEvaluacionRule()); 
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
    // $ANTLR end "entryRuleCmpntEvaluacion"


    // $ANTLR start "ruleCmpntEvaluacion"
    // InternalEvaluacion.g:87:1: ruleCmpntEvaluacion : ( ( rule__CmpntEvaluacion__Group__0 ) ) ;
    public final void ruleCmpntEvaluacion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:91:2: ( ( ( rule__CmpntEvaluacion__Group__0 ) ) )
            // InternalEvaluacion.g:92:2: ( ( rule__CmpntEvaluacion__Group__0 ) )
            {
            // InternalEvaluacion.g:92:2: ( ( rule__CmpntEvaluacion__Group__0 ) )
            // InternalEvaluacion.g:93:3: ( rule__CmpntEvaluacion__Group__0 )
            {
             before(grammarAccess.getCmpntEvaluacionAccess().getGroup()); 
            // InternalEvaluacion.g:94:3: ( rule__CmpntEvaluacion__Group__0 )
            // InternalEvaluacion.g:94:4: rule__CmpntEvaluacion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CmpntEvaluacion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCmpntEvaluacionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCmpntEvaluacion"


    // $ANTLR start "entryRuleCriterio"
    // InternalEvaluacion.g:103:1: entryRuleCriterio : ruleCriterio EOF ;
    public final void entryRuleCriterio() throws RecognitionException {
        try {
            // InternalEvaluacion.g:104:1: ( ruleCriterio EOF )
            // InternalEvaluacion.g:105:1: ruleCriterio EOF
            {
             before(grammarAccess.getCriterioRule()); 
            pushFollow(FOLLOW_1);
            ruleCriterio();

            state._fsp--;

             after(grammarAccess.getCriterioRule()); 
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
    // $ANTLR end "entryRuleCriterio"


    // $ANTLR start "ruleCriterio"
    // InternalEvaluacion.g:112:1: ruleCriterio : ( ( rule__Criterio__Alternatives ) ) ;
    public final void ruleCriterio() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:116:2: ( ( ( rule__Criterio__Alternatives ) ) )
            // InternalEvaluacion.g:117:2: ( ( rule__Criterio__Alternatives ) )
            {
            // InternalEvaluacion.g:117:2: ( ( rule__Criterio__Alternatives ) )
            // InternalEvaluacion.g:118:3: ( rule__Criterio__Alternatives )
            {
             before(grammarAccess.getCriterioAccess().getAlternatives()); 
            // InternalEvaluacion.g:119:3: ( rule__Criterio__Alternatives )
            // InternalEvaluacion.g:119:4: rule__Criterio__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Criterio__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCriterioAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCriterio"


    // $ANTLR start "entryRuleValorCriterio"
    // InternalEvaluacion.g:128:1: entryRuleValorCriterio : ruleValorCriterio EOF ;
    public final void entryRuleValorCriterio() throws RecognitionException {
        try {
            // InternalEvaluacion.g:129:1: ( ruleValorCriterio EOF )
            // InternalEvaluacion.g:130:1: ruleValorCriterio EOF
            {
             before(grammarAccess.getValorCriterioRule()); 
            pushFollow(FOLLOW_1);
            ruleValorCriterio();

            state._fsp--;

             after(grammarAccess.getValorCriterioRule()); 
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
    // $ANTLR end "entryRuleValorCriterio"


    // $ANTLR start "ruleValorCriterio"
    // InternalEvaluacion.g:137:1: ruleValorCriterio : ( ( rule__ValorCriterio__ValorCriterioAssignment ) ) ;
    public final void ruleValorCriterio() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:141:2: ( ( ( rule__ValorCriterio__ValorCriterioAssignment ) ) )
            // InternalEvaluacion.g:142:2: ( ( rule__ValorCriterio__ValorCriterioAssignment ) )
            {
            // InternalEvaluacion.g:142:2: ( ( rule__ValorCriterio__ValorCriterioAssignment ) )
            // InternalEvaluacion.g:143:3: ( rule__ValorCriterio__ValorCriterioAssignment )
            {
             before(grammarAccess.getValorCriterioAccess().getValorCriterioAssignment()); 
            // InternalEvaluacion.g:144:3: ( rule__ValorCriterio__ValorCriterioAssignment )
            // InternalEvaluacion.g:144:4: rule__ValorCriterio__ValorCriterioAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ValorCriterio__ValorCriterioAssignment();

            state._fsp--;


            }

             after(grammarAccess.getValorCriterioAccess().getValorCriterioAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValorCriterio"


    // $ANTLR start "entryRuleCriterioType"
    // InternalEvaluacion.g:153:1: entryRuleCriterioType : ruleCriterioType EOF ;
    public final void entryRuleCriterioType() throws RecognitionException {
        try {
            // InternalEvaluacion.g:154:1: ( ruleCriterioType EOF )
            // InternalEvaluacion.g:155:1: ruleCriterioType EOF
            {
             before(grammarAccess.getCriterioTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleCriterioType();

            state._fsp--;

             after(grammarAccess.getCriterioTypeRule()); 
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
    // $ANTLR end "entryRuleCriterioType"


    // $ANTLR start "ruleCriterioType"
    // InternalEvaluacion.g:162:1: ruleCriterioType : ( ( rule__CriterioType__Group__0 ) ) ;
    public final void ruleCriterioType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:166:2: ( ( ( rule__CriterioType__Group__0 ) ) )
            // InternalEvaluacion.g:167:2: ( ( rule__CriterioType__Group__0 ) )
            {
            // InternalEvaluacion.g:167:2: ( ( rule__CriterioType__Group__0 ) )
            // InternalEvaluacion.g:168:3: ( rule__CriterioType__Group__0 )
            {
             before(grammarAccess.getCriterioTypeAccess().getGroup()); 
            // InternalEvaluacion.g:169:3: ( rule__CriterioType__Group__0 )
            // InternalEvaluacion.g:169:4: rule__CriterioType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CriterioType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCriterioTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCriterioType"


    // $ANTLR start "entryRuleElementType"
    // InternalEvaluacion.g:178:1: entryRuleElementType : ruleElementType EOF ;
    public final void entryRuleElementType() throws RecognitionException {
        try {
            // InternalEvaluacion.g:179:1: ( ruleElementType EOF )
            // InternalEvaluacion.g:180:1: ruleElementType EOF
            {
             before(grammarAccess.getElementTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getElementTypeRule()); 
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
    // $ANTLR end "entryRuleElementType"


    // $ANTLR start "ruleElementType"
    // InternalEvaluacion.g:187:1: ruleElementType : ( ruleComponenteType ) ;
    public final void ruleElementType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:191:2: ( ( ruleComponenteType ) )
            // InternalEvaluacion.g:192:2: ( ruleComponenteType )
            {
            // InternalEvaluacion.g:192:2: ( ruleComponenteType )
            // InternalEvaluacion.g:193:3: ruleComponenteType
            {
             before(grammarAccess.getElementTypeAccess().getComponenteTypeParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleComponenteType();

            state._fsp--;

             after(grammarAccess.getElementTypeAccess().getComponenteTypeParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElementType"


    // $ANTLR start "entryRuleComponenteType"
    // InternalEvaluacion.g:203:1: entryRuleComponenteType : ruleComponenteType EOF ;
    public final void entryRuleComponenteType() throws RecognitionException {
        try {
            // InternalEvaluacion.g:204:1: ( ruleComponenteType EOF )
            // InternalEvaluacion.g:205:1: ruleComponenteType EOF
            {
             before(grammarAccess.getComponenteTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleComponenteType();

            state._fsp--;

             after(grammarAccess.getComponenteTypeRule()); 
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
    // $ANTLR end "entryRuleComponenteType"


    // $ANTLR start "ruleComponenteType"
    // InternalEvaluacion.g:212:1: ruleComponenteType : ( ( rule__ComponenteType__ComponenteAssignment ) ) ;
    public final void ruleComponenteType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:216:2: ( ( ( rule__ComponenteType__ComponenteAssignment ) ) )
            // InternalEvaluacion.g:217:2: ( ( rule__ComponenteType__ComponenteAssignment ) )
            {
            // InternalEvaluacion.g:217:2: ( ( rule__ComponenteType__ComponenteAssignment ) )
            // InternalEvaluacion.g:218:3: ( rule__ComponenteType__ComponenteAssignment )
            {
             before(grammarAccess.getComponenteTypeAccess().getComponenteAssignment()); 
            // InternalEvaluacion.g:219:3: ( rule__ComponenteType__ComponenteAssignment )
            // InternalEvaluacion.g:219:4: rule__ComponenteType__ComponenteAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ComponenteType__ComponenteAssignment();

            state._fsp--;


            }

             after(grammarAccess.getComponenteTypeAccess().getComponenteAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponenteType"


    // $ANTLR start "rule__Criterio__Alternatives"
    // InternalEvaluacion.g:227:1: rule__Criterio__Alternatives : ( ( ( rule__Criterio__TypeAssignment_0 ) ) | ( ( rule__Criterio__Group_1__0 ) ) );
    public final void rule__Criterio__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:231:1: ( ( ( rule__Criterio__TypeAssignment_0 ) ) | ( ( rule__Criterio__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalEvaluacion.g:232:2: ( ( rule__Criterio__TypeAssignment_0 ) )
                    {
                    // InternalEvaluacion.g:232:2: ( ( rule__Criterio__TypeAssignment_0 ) )
                    // InternalEvaluacion.g:233:3: ( rule__Criterio__TypeAssignment_0 )
                    {
                     before(grammarAccess.getCriterioAccess().getTypeAssignment_0()); 
                    // InternalEvaluacion.g:234:3: ( rule__Criterio__TypeAssignment_0 )
                    // InternalEvaluacion.g:234:4: rule__Criterio__TypeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Criterio__TypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCriterioAccess().getTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEvaluacion.g:238:2: ( ( rule__Criterio__Group_1__0 ) )
                    {
                    // InternalEvaluacion.g:238:2: ( ( rule__Criterio__Group_1__0 ) )
                    // InternalEvaluacion.g:239:3: ( rule__Criterio__Group_1__0 )
                    {
                     before(grammarAccess.getCriterioAccess().getGroup_1()); 
                    // InternalEvaluacion.g:240:3: ( rule__Criterio__Group_1__0 )
                    // InternalEvaluacion.g:240:4: rule__Criterio__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Criterio__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCriterioAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Criterio__Alternatives"


    // $ANTLR start "rule__ValorCriterio__ValorCriterioAlternatives_0"
    // InternalEvaluacion.g:248:1: rule__ValorCriterio__ValorCriterioAlternatives_0 : ( ( 'S' ) | ( 'N' ) );
    public final void rule__ValorCriterio__ValorCriterioAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:252:1: ( ( 'S' ) | ( 'N' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalEvaluacion.g:253:2: ( 'S' )
                    {
                    // InternalEvaluacion.g:253:2: ( 'S' )
                    // InternalEvaluacion.g:254:3: 'S'
                    {
                     before(grammarAccess.getValorCriterioAccess().getValorCriterioSKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getValorCriterioAccess().getValorCriterioSKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEvaluacion.g:259:2: ( 'N' )
                    {
                    // InternalEvaluacion.g:259:2: ( 'N' )
                    // InternalEvaluacion.g:260:3: 'N'
                    {
                     before(grammarAccess.getValorCriterioAccess().getValorCriterioNKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getValorCriterioAccess().getValorCriterioNKeyword_0_1()); 

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
    // $ANTLR end "rule__ValorCriterio__ValorCriterioAlternatives_0"


    // $ANTLR start "rule__CmpntEvaluacion__Group__0"
    // InternalEvaluacion.g:269:1: rule__CmpntEvaluacion__Group__0 : rule__CmpntEvaluacion__Group__0__Impl rule__CmpntEvaluacion__Group__1 ;
    public final void rule__CmpntEvaluacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:273:1: ( rule__CmpntEvaluacion__Group__0__Impl rule__CmpntEvaluacion__Group__1 )
            // InternalEvaluacion.g:274:2: rule__CmpntEvaluacion__Group__0__Impl rule__CmpntEvaluacion__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__CmpntEvaluacion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CmpntEvaluacion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmpntEvaluacion__Group__0"


    // $ANTLR start "rule__CmpntEvaluacion__Group__0__Impl"
    // InternalEvaluacion.g:281:1: rule__CmpntEvaluacion__Group__0__Impl : ( 'componente' ) ;
    public final void rule__CmpntEvaluacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:285:1: ( ( 'componente' ) )
            // InternalEvaluacion.g:286:1: ( 'componente' )
            {
            // InternalEvaluacion.g:286:1: ( 'componente' )
            // InternalEvaluacion.g:287:2: 'componente'
            {
             before(grammarAccess.getCmpntEvaluacionAccess().getComponenteKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCmpntEvaluacionAccess().getComponenteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmpntEvaluacion__Group__0__Impl"


    // $ANTLR start "rule__CmpntEvaluacion__Group__1"
    // InternalEvaluacion.g:296:1: rule__CmpntEvaluacion__Group__1 : rule__CmpntEvaluacion__Group__1__Impl rule__CmpntEvaluacion__Group__2 ;
    public final void rule__CmpntEvaluacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:300:1: ( rule__CmpntEvaluacion__Group__1__Impl rule__CmpntEvaluacion__Group__2 )
            // InternalEvaluacion.g:301:2: rule__CmpntEvaluacion__Group__1__Impl rule__CmpntEvaluacion__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__CmpntEvaluacion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CmpntEvaluacion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmpntEvaluacion__Group__1"


    // $ANTLR start "rule__CmpntEvaluacion__Group__1__Impl"
    // InternalEvaluacion.g:308:1: rule__CmpntEvaluacion__Group__1__Impl : ( ( rule__CmpntEvaluacion__NameAssignment_1 ) ) ;
    public final void rule__CmpntEvaluacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:312:1: ( ( ( rule__CmpntEvaluacion__NameAssignment_1 ) ) )
            // InternalEvaluacion.g:313:1: ( ( rule__CmpntEvaluacion__NameAssignment_1 ) )
            {
            // InternalEvaluacion.g:313:1: ( ( rule__CmpntEvaluacion__NameAssignment_1 ) )
            // InternalEvaluacion.g:314:2: ( rule__CmpntEvaluacion__NameAssignment_1 )
            {
             before(grammarAccess.getCmpntEvaluacionAccess().getNameAssignment_1()); 
            // InternalEvaluacion.g:315:2: ( rule__CmpntEvaluacion__NameAssignment_1 )
            // InternalEvaluacion.g:315:3: rule__CmpntEvaluacion__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CmpntEvaluacion__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCmpntEvaluacionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmpntEvaluacion__Group__1__Impl"


    // $ANTLR start "rule__CmpntEvaluacion__Group__2"
    // InternalEvaluacion.g:323:1: rule__CmpntEvaluacion__Group__2 : rule__CmpntEvaluacion__Group__2__Impl rule__CmpntEvaluacion__Group__3 ;
    public final void rule__CmpntEvaluacion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:327:1: ( rule__CmpntEvaluacion__Group__2__Impl rule__CmpntEvaluacion__Group__3 )
            // InternalEvaluacion.g:328:2: rule__CmpntEvaluacion__Group__2__Impl rule__CmpntEvaluacion__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__CmpntEvaluacion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CmpntEvaluacion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmpntEvaluacion__Group__2"


    // $ANTLR start "rule__CmpntEvaluacion__Group__2__Impl"
    // InternalEvaluacion.g:335:1: rule__CmpntEvaluacion__Group__2__Impl : ( ( rule__CmpntEvaluacion__Group_2__0 )? ) ;
    public final void rule__CmpntEvaluacion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:339:1: ( ( ( rule__CmpntEvaluacion__Group_2__0 )? ) )
            // InternalEvaluacion.g:340:1: ( ( rule__CmpntEvaluacion__Group_2__0 )? )
            {
            // InternalEvaluacion.g:340:1: ( ( rule__CmpntEvaluacion__Group_2__0 )? )
            // InternalEvaluacion.g:341:2: ( rule__CmpntEvaluacion__Group_2__0 )?
            {
             before(grammarAccess.getCmpntEvaluacionAccess().getGroup_2()); 
            // InternalEvaluacion.g:342:2: ( rule__CmpntEvaluacion__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEvaluacion.g:342:3: rule__CmpntEvaluacion__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CmpntEvaluacion__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCmpntEvaluacionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmpntEvaluacion__Group__2__Impl"


    // $ANTLR start "rule__CmpntEvaluacion__Group__3"
    // InternalEvaluacion.g:350:1: rule__CmpntEvaluacion__Group__3 : rule__CmpntEvaluacion__Group__3__Impl rule__CmpntEvaluacion__Group__4 ;
    public final void rule__CmpntEvaluacion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:354:1: ( rule__CmpntEvaluacion__Group__3__Impl rule__CmpntEvaluacion__Group__4 )
            // InternalEvaluacion.g:355:2: rule__CmpntEvaluacion__Group__3__Impl rule__CmpntEvaluacion__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__CmpntEvaluacion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CmpntEvaluacion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmpntEvaluacion__Group__3"


    // $ANTLR start "rule__CmpntEvaluacion__Group__3__Impl"
    // InternalEvaluacion.g:362:1: rule__CmpntEvaluacion__Group__3__Impl : ( '{' ) ;
    public final void rule__CmpntEvaluacion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:366:1: ( ( '{' ) )
            // InternalEvaluacion.g:367:1: ( '{' )
            {
            // InternalEvaluacion.g:367:1: ( '{' )
            // InternalEvaluacion.g:368:2: '{'
            {
             before(grammarAccess.getCmpntEvaluacionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCmpntEvaluacionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmpntEvaluacion__Group__3__Impl"


    // $ANTLR start "rule__CmpntEvaluacion__Group__4"
    // InternalEvaluacion.g:377:1: rule__CmpntEvaluacion__Group__4 : rule__CmpntEvaluacion__Group__4__Impl rule__CmpntEvaluacion__Group__5 ;
    public final void rule__CmpntEvaluacion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:381:1: ( rule__CmpntEvaluacion__Group__4__Impl rule__CmpntEvaluacion__Group__5 )
            // InternalEvaluacion.g:382:2: rule__CmpntEvaluacion__Group__4__Impl rule__CmpntEvaluacion__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__CmpntEvaluacion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CmpntEvaluacion__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmpntEvaluacion__Group__4"


    // $ANTLR start "rule__CmpntEvaluacion__Group__4__Impl"
    // InternalEvaluacion.g:389:1: rule__CmpntEvaluacion__Group__4__Impl : ( ( rule__CmpntEvaluacion__AttributesAssignment_4 )* ) ;
    public final void rule__CmpntEvaluacion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:393:1: ( ( ( rule__CmpntEvaluacion__AttributesAssignment_4 )* ) )
            // InternalEvaluacion.g:394:1: ( ( rule__CmpntEvaluacion__AttributesAssignment_4 )* )
            {
            // InternalEvaluacion.g:394:1: ( ( rule__CmpntEvaluacion__AttributesAssignment_4 )* )
            // InternalEvaluacion.g:395:2: ( rule__CmpntEvaluacion__AttributesAssignment_4 )*
            {
             before(grammarAccess.getCmpntEvaluacionAccess().getAttributesAssignment_4()); 
            // InternalEvaluacion.g:396:2: ( rule__CmpntEvaluacion__AttributesAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalEvaluacion.g:396:3: rule__CmpntEvaluacion__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__CmpntEvaluacion__AttributesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getCmpntEvaluacionAccess().getAttributesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmpntEvaluacion__Group__4__Impl"


    // $ANTLR start "rule__CmpntEvaluacion__Group__5"
    // InternalEvaluacion.g:404:1: rule__CmpntEvaluacion__Group__5 : rule__CmpntEvaluacion__Group__5__Impl ;
    public final void rule__CmpntEvaluacion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:408:1: ( rule__CmpntEvaluacion__Group__5__Impl )
            // InternalEvaluacion.g:409:2: rule__CmpntEvaluacion__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CmpntEvaluacion__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmpntEvaluacion__Group__5"


    // $ANTLR start "rule__CmpntEvaluacion__Group__5__Impl"
    // InternalEvaluacion.g:415:1: rule__CmpntEvaluacion__Group__5__Impl : ( '}' ) ;
    public final void rule__CmpntEvaluacion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:419:1: ( ( '}' ) )
            // InternalEvaluacion.g:420:1: ( '}' )
            {
            // InternalEvaluacion.g:420:1: ( '}' )
            // InternalEvaluacion.g:421:2: '}'
            {
             before(grammarAccess.getCmpntEvaluacionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCmpntEvaluacionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmpntEvaluacion__Group__5__Impl"


    // $ANTLR start "rule__CmpntEvaluacion__Group_2__0"
    // InternalEvaluacion.g:431:1: rule__CmpntEvaluacion__Group_2__0 : rule__CmpntEvaluacion__Group_2__0__Impl rule__CmpntEvaluacion__Group_2__1 ;
    public final void rule__CmpntEvaluacion__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:435:1: ( rule__CmpntEvaluacion__Group_2__0__Impl rule__CmpntEvaluacion__Group_2__1 )
            // InternalEvaluacion.g:436:2: rule__CmpntEvaluacion__Group_2__0__Impl rule__CmpntEvaluacion__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__CmpntEvaluacion__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CmpntEvaluacion__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmpntEvaluacion__Group_2__0"


    // $ANTLR start "rule__CmpntEvaluacion__Group_2__0__Impl"
    // InternalEvaluacion.g:443:1: rule__CmpntEvaluacion__Group_2__0__Impl : ( 'hereda' ) ;
    public final void rule__CmpntEvaluacion__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:447:1: ( ( 'hereda' ) )
            // InternalEvaluacion.g:448:1: ( 'hereda' )
            {
            // InternalEvaluacion.g:448:1: ( 'hereda' )
            // InternalEvaluacion.g:449:2: 'hereda'
            {
             before(grammarAccess.getCmpntEvaluacionAccess().getHeredaKeyword_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCmpntEvaluacionAccess().getHeredaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmpntEvaluacion__Group_2__0__Impl"


    // $ANTLR start "rule__CmpntEvaluacion__Group_2__1"
    // InternalEvaluacion.g:458:1: rule__CmpntEvaluacion__Group_2__1 : rule__CmpntEvaluacion__Group_2__1__Impl ;
    public final void rule__CmpntEvaluacion__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:462:1: ( rule__CmpntEvaluacion__Group_2__1__Impl )
            // InternalEvaluacion.g:463:2: rule__CmpntEvaluacion__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CmpntEvaluacion__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmpntEvaluacion__Group_2__1"


    // $ANTLR start "rule__CmpntEvaluacion__Group_2__1__Impl"
    // InternalEvaluacion.g:469:1: rule__CmpntEvaluacion__Group_2__1__Impl : ( ( rule__CmpntEvaluacion__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__CmpntEvaluacion__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:473:1: ( ( ( rule__CmpntEvaluacion__SuperTypeAssignment_2_1 ) ) )
            // InternalEvaluacion.g:474:1: ( ( rule__CmpntEvaluacion__SuperTypeAssignment_2_1 ) )
            {
            // InternalEvaluacion.g:474:1: ( ( rule__CmpntEvaluacion__SuperTypeAssignment_2_1 ) )
            // InternalEvaluacion.g:475:2: ( rule__CmpntEvaluacion__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getCmpntEvaluacionAccess().getSuperTypeAssignment_2_1()); 
            // InternalEvaluacion.g:476:2: ( rule__CmpntEvaluacion__SuperTypeAssignment_2_1 )
            // InternalEvaluacion.g:476:3: rule__CmpntEvaluacion__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__CmpntEvaluacion__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCmpntEvaluacionAccess().getSuperTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmpntEvaluacion__Group_2__1__Impl"


    // $ANTLR start "rule__Criterio__Group_1__0"
    // InternalEvaluacion.g:485:1: rule__Criterio__Group_1__0 : rule__Criterio__Group_1__0__Impl rule__Criterio__Group_1__1 ;
    public final void rule__Criterio__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:489:1: ( rule__Criterio__Group_1__0__Impl rule__Criterio__Group_1__1 )
            // InternalEvaluacion.g:490:2: rule__Criterio__Group_1__0__Impl rule__Criterio__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Criterio__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Criterio__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Criterio__Group_1__0"


    // $ANTLR start "rule__Criterio__Group_1__0__Impl"
    // InternalEvaluacion.g:497:1: rule__Criterio__Group_1__0__Impl : ( 'criterio' ) ;
    public final void rule__Criterio__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:501:1: ( ( 'criterio' ) )
            // InternalEvaluacion.g:502:1: ( 'criterio' )
            {
            // InternalEvaluacion.g:502:1: ( 'criterio' )
            // InternalEvaluacion.g:503:2: 'criterio'
            {
             before(grammarAccess.getCriterioAccess().getCriterioKeyword_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCriterioAccess().getCriterioKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Criterio__Group_1__0__Impl"


    // $ANTLR start "rule__Criterio__Group_1__1"
    // InternalEvaluacion.g:512:1: rule__Criterio__Group_1__1 : rule__Criterio__Group_1__1__Impl rule__Criterio__Group_1__2 ;
    public final void rule__Criterio__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:516:1: ( rule__Criterio__Group_1__1__Impl rule__Criterio__Group_1__2 )
            // InternalEvaluacion.g:517:2: rule__Criterio__Group_1__1__Impl rule__Criterio__Group_1__2
            {
            pushFollow(FOLLOW_8);
            rule__Criterio__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Criterio__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Criterio__Group_1__1"


    // $ANTLR start "rule__Criterio__Group_1__1__Impl"
    // InternalEvaluacion.g:524:1: rule__Criterio__Group_1__1__Impl : ( ( rule__Criterio__NameAssignment_1_1 ) ) ;
    public final void rule__Criterio__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:528:1: ( ( ( rule__Criterio__NameAssignment_1_1 ) ) )
            // InternalEvaluacion.g:529:1: ( ( rule__Criterio__NameAssignment_1_1 ) )
            {
            // InternalEvaluacion.g:529:1: ( ( rule__Criterio__NameAssignment_1_1 ) )
            // InternalEvaluacion.g:530:2: ( rule__Criterio__NameAssignment_1_1 )
            {
             before(grammarAccess.getCriterioAccess().getNameAssignment_1_1()); 
            // InternalEvaluacion.g:531:2: ( rule__Criterio__NameAssignment_1_1 )
            // InternalEvaluacion.g:531:3: rule__Criterio__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Criterio__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCriterioAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Criterio__Group_1__1__Impl"


    // $ANTLR start "rule__Criterio__Group_1__2"
    // InternalEvaluacion.g:539:1: rule__Criterio__Group_1__2 : rule__Criterio__Group_1__2__Impl ;
    public final void rule__Criterio__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:543:1: ( rule__Criterio__Group_1__2__Impl )
            // InternalEvaluacion.g:544:2: rule__Criterio__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Criterio__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Criterio__Group_1__2"


    // $ANTLR start "rule__Criterio__Group_1__2__Impl"
    // InternalEvaluacion.g:550:1: rule__Criterio__Group_1__2__Impl : ( ( rule__Criterio__ValorAssignment_1_2 ) ) ;
    public final void rule__Criterio__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:554:1: ( ( ( rule__Criterio__ValorAssignment_1_2 ) ) )
            // InternalEvaluacion.g:555:1: ( ( rule__Criterio__ValorAssignment_1_2 ) )
            {
            // InternalEvaluacion.g:555:1: ( ( rule__Criterio__ValorAssignment_1_2 ) )
            // InternalEvaluacion.g:556:2: ( rule__Criterio__ValorAssignment_1_2 )
            {
             before(grammarAccess.getCriterioAccess().getValorAssignment_1_2()); 
            // InternalEvaluacion.g:557:2: ( rule__Criterio__ValorAssignment_1_2 )
            // InternalEvaluacion.g:557:3: rule__Criterio__ValorAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Criterio__ValorAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getCriterioAccess().getValorAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Criterio__Group_1__2__Impl"


    // $ANTLR start "rule__CriterioType__Group__0"
    // InternalEvaluacion.g:566:1: rule__CriterioType__Group__0 : rule__CriterioType__Group__0__Impl rule__CriterioType__Group__1 ;
    public final void rule__CriterioType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:570:1: ( rule__CriterioType__Group__0__Impl rule__CriterioType__Group__1 )
            // InternalEvaluacion.g:571:2: rule__CriterioType__Group__0__Impl rule__CriterioType__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__CriterioType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CriterioType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriterioType__Group__0"


    // $ANTLR start "rule__CriterioType__Group__0__Impl"
    // InternalEvaluacion.g:578:1: rule__CriterioType__Group__0__Impl : ( ( rule__CriterioType__ElementTypeAssignment_0 ) ) ;
    public final void rule__CriterioType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:582:1: ( ( ( rule__CriterioType__ElementTypeAssignment_0 ) ) )
            // InternalEvaluacion.g:583:1: ( ( rule__CriterioType__ElementTypeAssignment_0 ) )
            {
            // InternalEvaluacion.g:583:1: ( ( rule__CriterioType__ElementTypeAssignment_0 ) )
            // InternalEvaluacion.g:584:2: ( rule__CriterioType__ElementTypeAssignment_0 )
            {
             before(grammarAccess.getCriterioTypeAccess().getElementTypeAssignment_0()); 
            // InternalEvaluacion.g:585:2: ( rule__CriterioType__ElementTypeAssignment_0 )
            // InternalEvaluacion.g:585:3: rule__CriterioType__ElementTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CriterioType__ElementTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCriterioTypeAccess().getElementTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriterioType__Group__0__Impl"


    // $ANTLR start "rule__CriterioType__Group__1"
    // InternalEvaluacion.g:593:1: rule__CriterioType__Group__1 : rule__CriterioType__Group__1__Impl ;
    public final void rule__CriterioType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:597:1: ( rule__CriterioType__Group__1__Impl )
            // InternalEvaluacion.g:598:2: rule__CriterioType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CriterioType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriterioType__Group__1"


    // $ANTLR start "rule__CriterioType__Group__1__Impl"
    // InternalEvaluacion.g:604:1: rule__CriterioType__Group__1__Impl : ( ( rule__CriterioType__Group_1__0 )? ) ;
    public final void rule__CriterioType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:608:1: ( ( ( rule__CriterioType__Group_1__0 )? ) )
            // InternalEvaluacion.g:609:1: ( ( rule__CriterioType__Group_1__0 )? )
            {
            // InternalEvaluacion.g:609:1: ( ( rule__CriterioType__Group_1__0 )? )
            // InternalEvaluacion.g:610:2: ( rule__CriterioType__Group_1__0 )?
            {
             before(grammarAccess.getCriterioTypeAccess().getGroup_1()); 
            // InternalEvaluacion.g:611:2: ( rule__CriterioType__Group_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEvaluacion.g:611:3: rule__CriterioType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CriterioType__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCriterioTypeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriterioType__Group__1__Impl"


    // $ANTLR start "rule__CriterioType__Group_1__0"
    // InternalEvaluacion.g:620:1: rule__CriterioType__Group_1__0 : rule__CriterioType__Group_1__0__Impl rule__CriterioType__Group_1__1 ;
    public final void rule__CriterioType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:624:1: ( rule__CriterioType__Group_1__0__Impl rule__CriterioType__Group_1__1 )
            // InternalEvaluacion.g:625:2: rule__CriterioType__Group_1__0__Impl rule__CriterioType__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__CriterioType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CriterioType__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriterioType__Group_1__0"


    // $ANTLR start "rule__CriterioType__Group_1__0__Impl"
    // InternalEvaluacion.g:632:1: rule__CriterioType__Group_1__0__Impl : ( ( rule__CriterioType__ArrayAssignment_1_0 ) ) ;
    public final void rule__CriterioType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:636:1: ( ( ( rule__CriterioType__ArrayAssignment_1_0 ) ) )
            // InternalEvaluacion.g:637:1: ( ( rule__CriterioType__ArrayAssignment_1_0 ) )
            {
            // InternalEvaluacion.g:637:1: ( ( rule__CriterioType__ArrayAssignment_1_0 ) )
            // InternalEvaluacion.g:638:2: ( rule__CriterioType__ArrayAssignment_1_0 )
            {
             before(grammarAccess.getCriterioTypeAccess().getArrayAssignment_1_0()); 
            // InternalEvaluacion.g:639:2: ( rule__CriterioType__ArrayAssignment_1_0 )
            // InternalEvaluacion.g:639:3: rule__CriterioType__ArrayAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__CriterioType__ArrayAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCriterioTypeAccess().getArrayAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriterioType__Group_1__0__Impl"


    // $ANTLR start "rule__CriterioType__Group_1__1"
    // InternalEvaluacion.g:647:1: rule__CriterioType__Group_1__1 : rule__CriterioType__Group_1__1__Impl rule__CriterioType__Group_1__2 ;
    public final void rule__CriterioType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:651:1: ( rule__CriterioType__Group_1__1__Impl rule__CriterioType__Group_1__2 )
            // InternalEvaluacion.g:652:2: rule__CriterioType__Group_1__1__Impl rule__CriterioType__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__CriterioType__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CriterioType__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriterioType__Group_1__1"


    // $ANTLR start "rule__CriterioType__Group_1__1__Impl"
    // InternalEvaluacion.g:659:1: rule__CriterioType__Group_1__1__Impl : ( ( rule__CriterioType__LengthAssignment_1_1 )? ) ;
    public final void rule__CriterioType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:663:1: ( ( ( rule__CriterioType__LengthAssignment_1_1 )? ) )
            // InternalEvaluacion.g:664:1: ( ( rule__CriterioType__LengthAssignment_1_1 )? )
            {
            // InternalEvaluacion.g:664:1: ( ( rule__CriterioType__LengthAssignment_1_1 )? )
            // InternalEvaluacion.g:665:2: ( rule__CriterioType__LengthAssignment_1_1 )?
            {
             before(grammarAccess.getCriterioTypeAccess().getLengthAssignment_1_1()); 
            // InternalEvaluacion.g:666:2: ( rule__CriterioType__LengthAssignment_1_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEvaluacion.g:666:3: rule__CriterioType__LengthAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CriterioType__LengthAssignment_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCriterioTypeAccess().getLengthAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriterioType__Group_1__1__Impl"


    // $ANTLR start "rule__CriterioType__Group_1__2"
    // InternalEvaluacion.g:674:1: rule__CriterioType__Group_1__2 : rule__CriterioType__Group_1__2__Impl ;
    public final void rule__CriterioType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:678:1: ( rule__CriterioType__Group_1__2__Impl )
            // InternalEvaluacion.g:679:2: rule__CriterioType__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CriterioType__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriterioType__Group_1__2"


    // $ANTLR start "rule__CriterioType__Group_1__2__Impl"
    // InternalEvaluacion.g:685:1: rule__CriterioType__Group_1__2__Impl : ( ']' ) ;
    public final void rule__CriterioType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:689:1: ( ( ']' ) )
            // InternalEvaluacion.g:690:1: ( ']' )
            {
            // InternalEvaluacion.g:690:1: ( ']' )
            // InternalEvaluacion.g:691:2: ']'
            {
             before(grammarAccess.getCriterioTypeAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCriterioTypeAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriterioType__Group_1__2__Impl"


    // $ANTLR start "rule__Model__EntitiesAssignment"
    // InternalEvaluacion.g:701:1: rule__Model__EntitiesAssignment : ( ruleCmpntEvaluacion ) ;
    public final void rule__Model__EntitiesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:705:1: ( ( ruleCmpntEvaluacion ) )
            // InternalEvaluacion.g:706:2: ( ruleCmpntEvaluacion )
            {
            // InternalEvaluacion.g:706:2: ( ruleCmpntEvaluacion )
            // InternalEvaluacion.g:707:3: ruleCmpntEvaluacion
            {
             before(grammarAccess.getModelAccess().getEntitiesCmpntEvaluacionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleCmpntEvaluacion();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEntitiesCmpntEvaluacionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__EntitiesAssignment"


    // $ANTLR start "rule__CmpntEvaluacion__NameAssignment_1"
    // InternalEvaluacion.g:716:1: rule__CmpntEvaluacion__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CmpntEvaluacion__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:720:1: ( ( RULE_ID ) )
            // InternalEvaluacion.g:721:2: ( RULE_ID )
            {
            // InternalEvaluacion.g:721:2: ( RULE_ID )
            // InternalEvaluacion.g:722:3: RULE_ID
            {
             before(grammarAccess.getCmpntEvaluacionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCmpntEvaluacionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmpntEvaluacion__NameAssignment_1"


    // $ANTLR start "rule__CmpntEvaluacion__SuperTypeAssignment_2_1"
    // InternalEvaluacion.g:731:1: rule__CmpntEvaluacion__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__CmpntEvaluacion__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:735:1: ( ( ( RULE_ID ) ) )
            // InternalEvaluacion.g:736:2: ( ( RULE_ID ) )
            {
            // InternalEvaluacion.g:736:2: ( ( RULE_ID ) )
            // InternalEvaluacion.g:737:3: ( RULE_ID )
            {
             before(grammarAccess.getCmpntEvaluacionAccess().getSuperTypeCmpntEvaluacionCrossReference_2_1_0()); 
            // InternalEvaluacion.g:738:3: ( RULE_ID )
            // InternalEvaluacion.g:739:4: RULE_ID
            {
             before(grammarAccess.getCmpntEvaluacionAccess().getSuperTypeCmpntEvaluacionIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCmpntEvaluacionAccess().getSuperTypeCmpntEvaluacionIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getCmpntEvaluacionAccess().getSuperTypeCmpntEvaluacionCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmpntEvaluacion__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__CmpntEvaluacion__AttributesAssignment_4"
    // InternalEvaluacion.g:750:1: rule__CmpntEvaluacion__AttributesAssignment_4 : ( ruleCriterio ) ;
    public final void rule__CmpntEvaluacion__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:754:1: ( ( ruleCriterio ) )
            // InternalEvaluacion.g:755:2: ( ruleCriterio )
            {
            // InternalEvaluacion.g:755:2: ( ruleCriterio )
            // InternalEvaluacion.g:756:3: ruleCriterio
            {
             before(grammarAccess.getCmpntEvaluacionAccess().getAttributesCriterioParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCriterio();

            state._fsp--;

             after(grammarAccess.getCmpntEvaluacionAccess().getAttributesCriterioParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmpntEvaluacion__AttributesAssignment_4"


    // $ANTLR start "rule__Criterio__TypeAssignment_0"
    // InternalEvaluacion.g:765:1: rule__Criterio__TypeAssignment_0 : ( ruleCriterioType ) ;
    public final void rule__Criterio__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:769:1: ( ( ruleCriterioType ) )
            // InternalEvaluacion.g:770:2: ( ruleCriterioType )
            {
            // InternalEvaluacion.g:770:2: ( ruleCriterioType )
            // InternalEvaluacion.g:771:3: ruleCriterioType
            {
             before(grammarAccess.getCriterioAccess().getTypeCriterioTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCriterioType();

            state._fsp--;

             after(grammarAccess.getCriterioAccess().getTypeCriterioTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Criterio__TypeAssignment_0"


    // $ANTLR start "rule__Criterio__NameAssignment_1_1"
    // InternalEvaluacion.g:780:1: rule__Criterio__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Criterio__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:784:1: ( ( RULE_ID ) )
            // InternalEvaluacion.g:785:2: ( RULE_ID )
            {
            // InternalEvaluacion.g:785:2: ( RULE_ID )
            // InternalEvaluacion.g:786:3: RULE_ID
            {
             before(grammarAccess.getCriterioAccess().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCriterioAccess().getNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Criterio__NameAssignment_1_1"


    // $ANTLR start "rule__Criterio__ValorAssignment_1_2"
    // InternalEvaluacion.g:795:1: rule__Criterio__ValorAssignment_1_2 : ( ruleValorCriterio ) ;
    public final void rule__Criterio__ValorAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:799:1: ( ( ruleValorCriterio ) )
            // InternalEvaluacion.g:800:2: ( ruleValorCriterio )
            {
            // InternalEvaluacion.g:800:2: ( ruleValorCriterio )
            // InternalEvaluacion.g:801:3: ruleValorCriterio
            {
             before(grammarAccess.getCriterioAccess().getValorValorCriterioParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValorCriterio();

            state._fsp--;

             after(grammarAccess.getCriterioAccess().getValorValorCriterioParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Criterio__ValorAssignment_1_2"


    // $ANTLR start "rule__ValorCriterio__ValorCriterioAssignment"
    // InternalEvaluacion.g:810:1: rule__ValorCriterio__ValorCriterioAssignment : ( ( rule__ValorCriterio__ValorCriterioAlternatives_0 ) ) ;
    public final void rule__ValorCriterio__ValorCriterioAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:814:1: ( ( ( rule__ValorCriterio__ValorCriterioAlternatives_0 ) ) )
            // InternalEvaluacion.g:815:2: ( ( rule__ValorCriterio__ValorCriterioAlternatives_0 ) )
            {
            // InternalEvaluacion.g:815:2: ( ( rule__ValorCriterio__ValorCriterioAlternatives_0 ) )
            // InternalEvaluacion.g:816:3: ( rule__ValorCriterio__ValorCriterioAlternatives_0 )
            {
             before(grammarAccess.getValorCriterioAccess().getValorCriterioAlternatives_0()); 
            // InternalEvaluacion.g:817:3: ( rule__ValorCriterio__ValorCriterioAlternatives_0 )
            // InternalEvaluacion.g:817:4: rule__ValorCriterio__ValorCriterioAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__ValorCriterio__ValorCriterioAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getValorCriterioAccess().getValorCriterioAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValorCriterio__ValorCriterioAssignment"


    // $ANTLR start "rule__CriterioType__ElementTypeAssignment_0"
    // InternalEvaluacion.g:825:1: rule__CriterioType__ElementTypeAssignment_0 : ( ruleElementType ) ;
    public final void rule__CriterioType__ElementTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:829:1: ( ( ruleElementType ) )
            // InternalEvaluacion.g:830:2: ( ruleElementType )
            {
            // InternalEvaluacion.g:830:2: ( ruleElementType )
            // InternalEvaluacion.g:831:3: ruleElementType
            {
             before(grammarAccess.getCriterioTypeAccess().getElementTypeElementTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getCriterioTypeAccess().getElementTypeElementTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriterioType__ElementTypeAssignment_0"


    // $ANTLR start "rule__CriterioType__ArrayAssignment_1_0"
    // InternalEvaluacion.g:840:1: rule__CriterioType__ArrayAssignment_1_0 : ( ( '[' ) ) ;
    public final void rule__CriterioType__ArrayAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:844:1: ( ( ( '[' ) ) )
            // InternalEvaluacion.g:845:2: ( ( '[' ) )
            {
            // InternalEvaluacion.g:845:2: ( ( '[' ) )
            // InternalEvaluacion.g:846:3: ( '[' )
            {
             before(grammarAccess.getCriterioTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 
            // InternalEvaluacion.g:847:3: ( '[' )
            // InternalEvaluacion.g:848:4: '['
            {
             before(grammarAccess.getCriterioTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCriterioTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 

            }

             after(grammarAccess.getCriterioTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriterioType__ArrayAssignment_1_0"


    // $ANTLR start "rule__CriterioType__LengthAssignment_1_1"
    // InternalEvaluacion.g:859:1: rule__CriterioType__LengthAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__CriterioType__LengthAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:863:1: ( ( RULE_INT ) )
            // InternalEvaluacion.g:864:2: ( RULE_INT )
            {
            // InternalEvaluacion.g:864:2: ( RULE_INT )
            // InternalEvaluacion.g:865:3: RULE_INT
            {
             before(grammarAccess.getCriterioTypeAccess().getLengthINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCriterioTypeAccess().getLengthINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriterioType__LengthAssignment_1_1"


    // $ANTLR start "rule__ComponenteType__ComponenteAssignment"
    // InternalEvaluacion.g:874:1: rule__ComponenteType__ComponenteAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ComponenteType__ComponenteAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:878:1: ( ( ( RULE_ID ) ) )
            // InternalEvaluacion.g:879:2: ( ( RULE_ID ) )
            {
            // InternalEvaluacion.g:879:2: ( ( RULE_ID ) )
            // InternalEvaluacion.g:880:3: ( RULE_ID )
            {
             before(grammarAccess.getComponenteTypeAccess().getComponenteCmpntEvaluacionCrossReference_0()); 
            // InternalEvaluacion.g:881:3: ( RULE_ID )
            // InternalEvaluacion.g:882:4: RULE_ID
            {
             before(grammarAccess.getComponenteTypeAccess().getComponenteCmpntEvaluacionIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponenteTypeAccess().getComponenteCmpntEvaluacionIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getComponenteTypeAccess().getComponenteCmpntEvaluacionCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponenteType__ComponenteAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000028010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040020L});

}