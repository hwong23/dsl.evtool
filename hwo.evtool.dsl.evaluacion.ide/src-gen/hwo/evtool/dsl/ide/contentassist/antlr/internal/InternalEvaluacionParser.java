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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'S'", "'N'", "'componente'", "'{'", "'}'", "'hereda'", "'criterio'", "'='", "':'"
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



    // $ANTLR start "entryRuleEvaluacionModel"
    // InternalEvaluacion.g:53:1: entryRuleEvaluacionModel : ruleEvaluacionModel EOF ;
    public final void entryRuleEvaluacionModel() throws RecognitionException {
        try {
            // InternalEvaluacion.g:54:1: ( ruleEvaluacionModel EOF )
            // InternalEvaluacion.g:55:1: ruleEvaluacionModel EOF
            {
             before(grammarAccess.getEvaluacionModelRule()); 
            pushFollow(FOLLOW_1);
            ruleEvaluacionModel();

            state._fsp--;

             after(grammarAccess.getEvaluacionModelRule()); 
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
    // $ANTLR end "entryRuleEvaluacionModel"


    // $ANTLR start "ruleEvaluacionModel"
    // InternalEvaluacion.g:62:1: ruleEvaluacionModel : ( ( rule__EvaluacionModel__ComponentesAssignment )* ) ;
    public final void ruleEvaluacionModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:66:2: ( ( ( rule__EvaluacionModel__ComponentesAssignment )* ) )
            // InternalEvaluacion.g:67:2: ( ( rule__EvaluacionModel__ComponentesAssignment )* )
            {
            // InternalEvaluacion.g:67:2: ( ( rule__EvaluacionModel__ComponentesAssignment )* )
            // InternalEvaluacion.g:68:3: ( rule__EvaluacionModel__ComponentesAssignment )*
            {
             before(grammarAccess.getEvaluacionModelAccess().getComponentesAssignment()); 
            // InternalEvaluacion.g:69:3: ( rule__EvaluacionModel__ComponentesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEvaluacion.g:69:4: rule__EvaluacionModel__ComponentesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__EvaluacionModel__ComponentesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getEvaluacionModelAccess().getComponentesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvaluacionModel"


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


    // $ANTLR start "entryRuleAtributos"
    // InternalEvaluacion.g:103:1: entryRuleAtributos : ruleAtributos EOF ;
    public final void entryRuleAtributos() throws RecognitionException {
        try {
            // InternalEvaluacion.g:104:1: ( ruleAtributos EOF )
            // InternalEvaluacion.g:105:1: ruleAtributos EOF
            {
             before(grammarAccess.getAtributosRule()); 
            pushFollow(FOLLOW_1);
            ruleAtributos();

            state._fsp--;

             after(grammarAccess.getAtributosRule()); 
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
    // $ANTLR end "entryRuleAtributos"


    // $ANTLR start "ruleAtributos"
    // InternalEvaluacion.g:112:1: ruleAtributos : ( ( rule__Atributos__CriteriosAssignment ) ) ;
    public final void ruleAtributos() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:116:2: ( ( ( rule__Atributos__CriteriosAssignment ) ) )
            // InternalEvaluacion.g:117:2: ( ( rule__Atributos__CriteriosAssignment ) )
            {
            // InternalEvaluacion.g:117:2: ( ( rule__Atributos__CriteriosAssignment ) )
            // InternalEvaluacion.g:118:3: ( rule__Atributos__CriteriosAssignment )
            {
             before(grammarAccess.getAtributosAccess().getCriteriosAssignment()); 
            // InternalEvaluacion.g:119:3: ( rule__Atributos__CriteriosAssignment )
            // InternalEvaluacion.g:119:4: rule__Atributos__CriteriosAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Atributos__CriteriosAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAtributosAccess().getCriteriosAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtributos"


    // $ANTLR start "entryRuleCriterio"
    // InternalEvaluacion.g:128:1: entryRuleCriterio : ruleCriterio EOF ;
    public final void entryRuleCriterio() throws RecognitionException {
        try {
            // InternalEvaluacion.g:129:1: ( ruleCriterio EOF )
            // InternalEvaluacion.g:130:1: ruleCriterio EOF
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
    // InternalEvaluacion.g:137:1: ruleCriterio : ( ( rule__Criterio__Alternatives ) ) ;
    public final void ruleCriterio() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:141:2: ( ( ( rule__Criterio__Alternatives ) ) )
            // InternalEvaluacion.g:142:2: ( ( rule__Criterio__Alternatives ) )
            {
            // InternalEvaluacion.g:142:2: ( ( rule__Criterio__Alternatives ) )
            // InternalEvaluacion.g:143:3: ( rule__Criterio__Alternatives )
            {
             before(grammarAccess.getCriterioAccess().getAlternatives()); 
            // InternalEvaluacion.g:144:3: ( rule__Criterio__Alternatives )
            // InternalEvaluacion.g:144:4: rule__Criterio__Alternatives
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


    // $ANTLR start "entryRuleExpresion"
    // InternalEvaluacion.g:178:1: entryRuleExpresion : ruleExpresion EOF ;
    public final void entryRuleExpresion() throws RecognitionException {
        try {
            // InternalEvaluacion.g:179:1: ( ruleExpresion EOF )
            // InternalEvaluacion.g:180:1: ruleExpresion EOF
            {
             before(grammarAccess.getExpresionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getExpresionRule()); 
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
    // $ANTLR end "entryRuleExpresion"


    // $ANTLR start "ruleExpresion"
    // InternalEvaluacion.g:187:1: ruleExpresion : ( ruleAtomo ) ;
    public final void ruleExpresion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:191:2: ( ( ruleAtomo ) )
            // InternalEvaluacion.g:192:2: ( ruleAtomo )
            {
            // InternalEvaluacion.g:192:2: ( ruleAtomo )
            // InternalEvaluacion.g:193:3: ruleAtomo
            {
             before(grammarAccess.getExpresionAccess().getAtomoParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleAtomo();

            state._fsp--;

             after(grammarAccess.getExpresionAccess().getAtomoParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpresion"


    // $ANTLR start "entryRuleAtomo"
    // InternalEvaluacion.g:203:1: entryRuleAtomo : ruleAtomo EOF ;
    public final void entryRuleAtomo() throws RecognitionException {
        try {
            // InternalEvaluacion.g:204:1: ( ruleAtomo EOF )
            // InternalEvaluacion.g:205:1: ruleAtomo EOF
            {
             before(grammarAccess.getAtomoRule()); 
            pushFollow(FOLLOW_1);
            ruleAtomo();

            state._fsp--;

             after(grammarAccess.getAtomoRule()); 
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
    // $ANTLR end "entryRuleAtomo"


    // $ANTLR start "ruleAtomo"
    // InternalEvaluacion.g:212:1: ruleAtomo : ( ( rule__Atomo__Alternatives ) ) ;
    public final void ruleAtomo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:216:2: ( ( ( rule__Atomo__Alternatives ) ) )
            // InternalEvaluacion.g:217:2: ( ( rule__Atomo__Alternatives ) )
            {
            // InternalEvaluacion.g:217:2: ( ( rule__Atomo__Alternatives ) )
            // InternalEvaluacion.g:218:3: ( rule__Atomo__Alternatives )
            {
             before(grammarAccess.getAtomoAccess().getAlternatives()); 
            // InternalEvaluacion.g:219:3: ( rule__Atomo__Alternatives )
            // InternalEvaluacion.g:219:4: rule__Atomo__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Atomo__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtomo"


    // $ANTLR start "entryRuleComplejoType"
    // InternalEvaluacion.g:228:1: entryRuleComplejoType : ruleComplejoType EOF ;
    public final void entryRuleComplejoType() throws RecognitionException {
        try {
            // InternalEvaluacion.g:229:1: ( ruleComplejoType EOF )
            // InternalEvaluacion.g:230:1: ruleComplejoType EOF
            {
             before(grammarAccess.getComplejoTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleComplejoType();

            state._fsp--;

             after(grammarAccess.getComplejoTypeRule()); 
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
    // $ANTLR end "entryRuleComplejoType"


    // $ANTLR start "ruleComplejoType"
    // InternalEvaluacion.g:237:1: ruleComplejoType : ( ( rule__ComplejoType__ComponenteAssignment ) ) ;
    public final void ruleComplejoType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:241:2: ( ( ( rule__ComplejoType__ComponenteAssignment ) ) )
            // InternalEvaluacion.g:242:2: ( ( rule__ComplejoType__ComponenteAssignment ) )
            {
            // InternalEvaluacion.g:242:2: ( ( rule__ComplejoType__ComponenteAssignment ) )
            // InternalEvaluacion.g:243:3: ( rule__ComplejoType__ComponenteAssignment )
            {
             before(grammarAccess.getComplejoTypeAccess().getComponenteAssignment()); 
            // InternalEvaluacion.g:244:3: ( rule__ComplejoType__ComponenteAssignment )
            // InternalEvaluacion.g:244:4: rule__ComplejoType__ComponenteAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ComplejoType__ComponenteAssignment();

            state._fsp--;


            }

             after(grammarAccess.getComplejoTypeAccess().getComponenteAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplejoType"


    // $ANTLR start "rule__Criterio__Alternatives"
    // InternalEvaluacion.g:252:1: rule__Criterio__Alternatives : ( ( ruleComplejoType ) | ( ruleCriterioType ) );
    public final void rule__Criterio__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:256:1: ( ( ruleComplejoType ) | ( ruleCriterioType ) )
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
                    // InternalEvaluacion.g:257:2: ( ruleComplejoType )
                    {
                    // InternalEvaluacion.g:257:2: ( ruleComplejoType )
                    // InternalEvaluacion.g:258:3: ruleComplejoType
                    {
                     before(grammarAccess.getCriterioAccess().getComplejoTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleComplejoType();

                    state._fsp--;

                     after(grammarAccess.getCriterioAccess().getComplejoTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEvaluacion.g:263:2: ( ruleCriterioType )
                    {
                    // InternalEvaluacion.g:263:2: ( ruleCriterioType )
                    // InternalEvaluacion.g:264:3: ruleCriterioType
                    {
                     before(grammarAccess.getCriterioAccess().getCriterioTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCriterioType();

                    state._fsp--;

                     after(grammarAccess.getCriterioAccess().getCriterioTypeParserRuleCall_1()); 

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


    // $ANTLR start "rule__Atomo__Alternatives"
    // InternalEvaluacion.g:273:1: rule__Atomo__Alternatives : ( ( ( rule__Atomo__Group_0__0 ) ) | ( ( rule__Atomo__Group_1__0 ) ) | ( ( rule__Atomo__Group_2__0 ) ) );
    public final void rule__Atomo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:277:1: ( ( ( rule__Atomo__Group_0__0 ) ) | ( ( rule__Atomo__Group_1__0 ) ) | ( ( rule__Atomo__Group_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt3=1;
                }
                break;
            case RULE_STRING:
                {
                alt3=2;
                }
                break;
            case 11:
            case 12:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalEvaluacion.g:278:2: ( ( rule__Atomo__Group_0__0 ) )
                    {
                    // InternalEvaluacion.g:278:2: ( ( rule__Atomo__Group_0__0 ) )
                    // InternalEvaluacion.g:279:3: ( rule__Atomo__Group_0__0 )
                    {
                     before(grammarAccess.getAtomoAccess().getGroup_0()); 
                    // InternalEvaluacion.g:280:3: ( rule__Atomo__Group_0__0 )
                    // InternalEvaluacion.g:280:4: rule__Atomo__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomo__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomoAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEvaluacion.g:284:2: ( ( rule__Atomo__Group_1__0 ) )
                    {
                    // InternalEvaluacion.g:284:2: ( ( rule__Atomo__Group_1__0 ) )
                    // InternalEvaluacion.g:285:3: ( rule__Atomo__Group_1__0 )
                    {
                     before(grammarAccess.getAtomoAccess().getGroup_1()); 
                    // InternalEvaluacion.g:286:3: ( rule__Atomo__Group_1__0 )
                    // InternalEvaluacion.g:286:4: rule__Atomo__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomo__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomoAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEvaluacion.g:290:2: ( ( rule__Atomo__Group_2__0 ) )
                    {
                    // InternalEvaluacion.g:290:2: ( ( rule__Atomo__Group_2__0 ) )
                    // InternalEvaluacion.g:291:3: ( rule__Atomo__Group_2__0 )
                    {
                     before(grammarAccess.getAtomoAccess().getGroup_2()); 
                    // InternalEvaluacion.g:292:3: ( rule__Atomo__Group_2__0 )
                    // InternalEvaluacion.g:292:4: rule__Atomo__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomo__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomoAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Atomo__Alternatives"


    // $ANTLR start "rule__Atomo__ValorAlternatives_2_1_0"
    // InternalEvaluacion.g:300:1: rule__Atomo__ValorAlternatives_2_1_0 : ( ( 'S' ) | ( 'N' ) );
    public final void rule__Atomo__ValorAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:304:1: ( ( 'S' ) | ( 'N' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalEvaluacion.g:305:2: ( 'S' )
                    {
                    // InternalEvaluacion.g:305:2: ( 'S' )
                    // InternalEvaluacion.g:306:3: 'S'
                    {
                     before(grammarAccess.getAtomoAccess().getValorSKeyword_2_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getAtomoAccess().getValorSKeyword_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEvaluacion.g:311:2: ( 'N' )
                    {
                    // InternalEvaluacion.g:311:2: ( 'N' )
                    // InternalEvaluacion.g:312:3: 'N'
                    {
                     before(grammarAccess.getAtomoAccess().getValorNKeyword_2_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getAtomoAccess().getValorNKeyword_2_1_0_1()); 

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
    // $ANTLR end "rule__Atomo__ValorAlternatives_2_1_0"


    // $ANTLR start "rule__CmpntEvaluacion__Group__0"
    // InternalEvaluacion.g:321:1: rule__CmpntEvaluacion__Group__0 : rule__CmpntEvaluacion__Group__0__Impl rule__CmpntEvaluacion__Group__1 ;
    public final void rule__CmpntEvaluacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:325:1: ( rule__CmpntEvaluacion__Group__0__Impl rule__CmpntEvaluacion__Group__1 )
            // InternalEvaluacion.g:326:2: rule__CmpntEvaluacion__Group__0__Impl rule__CmpntEvaluacion__Group__1
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
    // InternalEvaluacion.g:333:1: rule__CmpntEvaluacion__Group__0__Impl : ( 'componente' ) ;
    public final void rule__CmpntEvaluacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:337:1: ( ( 'componente' ) )
            // InternalEvaluacion.g:338:1: ( 'componente' )
            {
            // InternalEvaluacion.g:338:1: ( 'componente' )
            // InternalEvaluacion.g:339:2: 'componente'
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
    // InternalEvaluacion.g:348:1: rule__CmpntEvaluacion__Group__1 : rule__CmpntEvaluacion__Group__1__Impl rule__CmpntEvaluacion__Group__2 ;
    public final void rule__CmpntEvaluacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:352:1: ( rule__CmpntEvaluacion__Group__1__Impl rule__CmpntEvaluacion__Group__2 )
            // InternalEvaluacion.g:353:2: rule__CmpntEvaluacion__Group__1__Impl rule__CmpntEvaluacion__Group__2
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
    // InternalEvaluacion.g:360:1: rule__CmpntEvaluacion__Group__1__Impl : ( ( rule__CmpntEvaluacion__NameAssignment_1 ) ) ;
    public final void rule__CmpntEvaluacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:364:1: ( ( ( rule__CmpntEvaluacion__NameAssignment_1 ) ) )
            // InternalEvaluacion.g:365:1: ( ( rule__CmpntEvaluacion__NameAssignment_1 ) )
            {
            // InternalEvaluacion.g:365:1: ( ( rule__CmpntEvaluacion__NameAssignment_1 ) )
            // InternalEvaluacion.g:366:2: ( rule__CmpntEvaluacion__NameAssignment_1 )
            {
             before(grammarAccess.getCmpntEvaluacionAccess().getNameAssignment_1()); 
            // InternalEvaluacion.g:367:2: ( rule__CmpntEvaluacion__NameAssignment_1 )
            // InternalEvaluacion.g:367:3: rule__CmpntEvaluacion__NameAssignment_1
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
    // InternalEvaluacion.g:375:1: rule__CmpntEvaluacion__Group__2 : rule__CmpntEvaluacion__Group__2__Impl rule__CmpntEvaluacion__Group__3 ;
    public final void rule__CmpntEvaluacion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:379:1: ( rule__CmpntEvaluacion__Group__2__Impl rule__CmpntEvaluacion__Group__3 )
            // InternalEvaluacion.g:380:2: rule__CmpntEvaluacion__Group__2__Impl rule__CmpntEvaluacion__Group__3
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
    // InternalEvaluacion.g:387:1: rule__CmpntEvaluacion__Group__2__Impl : ( ( rule__CmpntEvaluacion__Group_2__0 )? ) ;
    public final void rule__CmpntEvaluacion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:391:1: ( ( ( rule__CmpntEvaluacion__Group_2__0 )? ) )
            // InternalEvaluacion.g:392:1: ( ( rule__CmpntEvaluacion__Group_2__0 )? )
            {
            // InternalEvaluacion.g:392:1: ( ( rule__CmpntEvaluacion__Group_2__0 )? )
            // InternalEvaluacion.g:393:2: ( rule__CmpntEvaluacion__Group_2__0 )?
            {
             before(grammarAccess.getCmpntEvaluacionAccess().getGroup_2()); 
            // InternalEvaluacion.g:394:2: ( rule__CmpntEvaluacion__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEvaluacion.g:394:3: rule__CmpntEvaluacion__Group_2__0
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
    // InternalEvaluacion.g:402:1: rule__CmpntEvaluacion__Group__3 : rule__CmpntEvaluacion__Group__3__Impl rule__CmpntEvaluacion__Group__4 ;
    public final void rule__CmpntEvaluacion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:406:1: ( rule__CmpntEvaluacion__Group__3__Impl rule__CmpntEvaluacion__Group__4 )
            // InternalEvaluacion.g:407:2: rule__CmpntEvaluacion__Group__3__Impl rule__CmpntEvaluacion__Group__4
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
    // InternalEvaluacion.g:414:1: rule__CmpntEvaluacion__Group__3__Impl : ( '{' ) ;
    public final void rule__CmpntEvaluacion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:418:1: ( ( '{' ) )
            // InternalEvaluacion.g:419:1: ( '{' )
            {
            // InternalEvaluacion.g:419:1: ( '{' )
            // InternalEvaluacion.g:420:2: '{'
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
    // InternalEvaluacion.g:429:1: rule__CmpntEvaluacion__Group__4 : rule__CmpntEvaluacion__Group__4__Impl rule__CmpntEvaluacion__Group__5 ;
    public final void rule__CmpntEvaluacion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:433:1: ( rule__CmpntEvaluacion__Group__4__Impl rule__CmpntEvaluacion__Group__5 )
            // InternalEvaluacion.g:434:2: rule__CmpntEvaluacion__Group__4__Impl rule__CmpntEvaluacion__Group__5
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
    // InternalEvaluacion.g:441:1: rule__CmpntEvaluacion__Group__4__Impl : ( ( rule__CmpntEvaluacion__AtributosAssignment_4 )* ) ;
    public final void rule__CmpntEvaluacion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:445:1: ( ( ( rule__CmpntEvaluacion__AtributosAssignment_4 )* ) )
            // InternalEvaluacion.g:446:1: ( ( rule__CmpntEvaluacion__AtributosAssignment_4 )* )
            {
            // InternalEvaluacion.g:446:1: ( ( rule__CmpntEvaluacion__AtributosAssignment_4 )* )
            // InternalEvaluacion.g:447:2: ( rule__CmpntEvaluacion__AtributosAssignment_4 )*
            {
             before(grammarAccess.getCmpntEvaluacionAccess().getAtributosAssignment_4()); 
            // InternalEvaluacion.g:448:2: ( rule__CmpntEvaluacion__AtributosAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEvaluacion.g:448:3: rule__CmpntEvaluacion__AtributosAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__CmpntEvaluacion__AtributosAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getCmpntEvaluacionAccess().getAtributosAssignment_4()); 

            }


            }

        }
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
    // InternalEvaluacion.g:456:1: rule__CmpntEvaluacion__Group__5 : rule__CmpntEvaluacion__Group__5__Impl ;
    public final void rule__CmpntEvaluacion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:460:1: ( rule__CmpntEvaluacion__Group__5__Impl )
            // InternalEvaluacion.g:461:2: rule__CmpntEvaluacion__Group__5__Impl
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
    // InternalEvaluacion.g:467:1: rule__CmpntEvaluacion__Group__5__Impl : ( '}' ) ;
    public final void rule__CmpntEvaluacion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:471:1: ( ( '}' ) )
            // InternalEvaluacion.g:472:1: ( '}' )
            {
            // InternalEvaluacion.g:472:1: ( '}' )
            // InternalEvaluacion.g:473:2: '}'
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
    // InternalEvaluacion.g:483:1: rule__CmpntEvaluacion__Group_2__0 : rule__CmpntEvaluacion__Group_2__0__Impl rule__CmpntEvaluacion__Group_2__1 ;
    public final void rule__CmpntEvaluacion__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:487:1: ( rule__CmpntEvaluacion__Group_2__0__Impl rule__CmpntEvaluacion__Group_2__1 )
            // InternalEvaluacion.g:488:2: rule__CmpntEvaluacion__Group_2__0__Impl rule__CmpntEvaluacion__Group_2__1
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
    // InternalEvaluacion.g:495:1: rule__CmpntEvaluacion__Group_2__0__Impl : ( 'hereda' ) ;
    public final void rule__CmpntEvaluacion__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:499:1: ( ( 'hereda' ) )
            // InternalEvaluacion.g:500:1: ( 'hereda' )
            {
            // InternalEvaluacion.g:500:1: ( 'hereda' )
            // InternalEvaluacion.g:501:2: 'hereda'
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
    // InternalEvaluacion.g:510:1: rule__CmpntEvaluacion__Group_2__1 : rule__CmpntEvaluacion__Group_2__1__Impl ;
    public final void rule__CmpntEvaluacion__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:514:1: ( rule__CmpntEvaluacion__Group_2__1__Impl )
            // InternalEvaluacion.g:515:2: rule__CmpntEvaluacion__Group_2__1__Impl
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
    // InternalEvaluacion.g:521:1: rule__CmpntEvaluacion__Group_2__1__Impl : ( ( rule__CmpntEvaluacion__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__CmpntEvaluacion__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:525:1: ( ( ( rule__CmpntEvaluacion__SuperTypeAssignment_2_1 ) ) )
            // InternalEvaluacion.g:526:1: ( ( rule__CmpntEvaluacion__SuperTypeAssignment_2_1 ) )
            {
            // InternalEvaluacion.g:526:1: ( ( rule__CmpntEvaluacion__SuperTypeAssignment_2_1 ) )
            // InternalEvaluacion.g:527:2: ( rule__CmpntEvaluacion__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getCmpntEvaluacionAccess().getSuperTypeAssignment_2_1()); 
            // InternalEvaluacion.g:528:2: ( rule__CmpntEvaluacion__SuperTypeAssignment_2_1 )
            // InternalEvaluacion.g:528:3: rule__CmpntEvaluacion__SuperTypeAssignment_2_1
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


    // $ANTLR start "rule__CriterioType__Group__0"
    // InternalEvaluacion.g:537:1: rule__CriterioType__Group__0 : rule__CriterioType__Group__0__Impl rule__CriterioType__Group__1 ;
    public final void rule__CriterioType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:541:1: ( rule__CriterioType__Group__0__Impl rule__CriterioType__Group__1 )
            // InternalEvaluacion.g:542:2: rule__CriterioType__Group__0__Impl rule__CriterioType__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalEvaluacion.g:549:1: rule__CriterioType__Group__0__Impl : ( 'criterio' ) ;
    public final void rule__CriterioType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:553:1: ( ( 'criterio' ) )
            // InternalEvaluacion.g:554:1: ( 'criterio' )
            {
            // InternalEvaluacion.g:554:1: ( 'criterio' )
            // InternalEvaluacion.g:555:2: 'criterio'
            {
             before(grammarAccess.getCriterioTypeAccess().getCriterioKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCriterioTypeAccess().getCriterioKeyword_0()); 

            }


            }

        }
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
    // InternalEvaluacion.g:564:1: rule__CriterioType__Group__1 : rule__CriterioType__Group__1__Impl rule__CriterioType__Group__2 ;
    public final void rule__CriterioType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:568:1: ( rule__CriterioType__Group__1__Impl rule__CriterioType__Group__2 )
            // InternalEvaluacion.g:569:2: rule__CriterioType__Group__1__Impl rule__CriterioType__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__CriterioType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CriterioType__Group__2();

            state._fsp--;


            }

        }
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
    // InternalEvaluacion.g:576:1: rule__CriterioType__Group__1__Impl : ( ( rule__CriterioType__NameAssignment_1 ) ) ;
    public final void rule__CriterioType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:580:1: ( ( ( rule__CriterioType__NameAssignment_1 ) ) )
            // InternalEvaluacion.g:581:1: ( ( rule__CriterioType__NameAssignment_1 ) )
            {
            // InternalEvaluacion.g:581:1: ( ( rule__CriterioType__NameAssignment_1 ) )
            // InternalEvaluacion.g:582:2: ( rule__CriterioType__NameAssignment_1 )
            {
             before(grammarAccess.getCriterioTypeAccess().getNameAssignment_1()); 
            // InternalEvaluacion.g:583:2: ( rule__CriterioType__NameAssignment_1 )
            // InternalEvaluacion.g:583:3: rule__CriterioType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CriterioType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCriterioTypeAccess().getNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__CriterioType__Group__2"
    // InternalEvaluacion.g:591:1: rule__CriterioType__Group__2 : rule__CriterioType__Group__2__Impl rule__CriterioType__Group__3 ;
    public final void rule__CriterioType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:595:1: ( rule__CriterioType__Group__2__Impl rule__CriterioType__Group__3 )
            // InternalEvaluacion.g:596:2: rule__CriterioType__Group__2__Impl rule__CriterioType__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__CriterioType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CriterioType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriterioType__Group__2"


    // $ANTLR start "rule__CriterioType__Group__2__Impl"
    // InternalEvaluacion.g:603:1: rule__CriterioType__Group__2__Impl : ( '=' ) ;
    public final void rule__CriterioType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:607:1: ( ( '=' ) )
            // InternalEvaluacion.g:608:1: ( '=' )
            {
            // InternalEvaluacion.g:608:1: ( '=' )
            // InternalEvaluacion.g:609:2: '='
            {
             before(grammarAccess.getCriterioTypeAccess().getEqualsSignKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCriterioTypeAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriterioType__Group__2__Impl"


    // $ANTLR start "rule__CriterioType__Group__3"
    // InternalEvaluacion.g:618:1: rule__CriterioType__Group__3 : rule__CriterioType__Group__3__Impl rule__CriterioType__Group__4 ;
    public final void rule__CriterioType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:622:1: ( rule__CriterioType__Group__3__Impl rule__CriterioType__Group__4 )
            // InternalEvaluacion.g:623:2: rule__CriterioType__Group__3__Impl rule__CriterioType__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__CriterioType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CriterioType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriterioType__Group__3"


    // $ANTLR start "rule__CriterioType__Group__3__Impl"
    // InternalEvaluacion.g:630:1: rule__CriterioType__Group__3__Impl : ( ( rule__CriterioType__ExpresionAssignment_3 ) ) ;
    public final void rule__CriterioType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:634:1: ( ( ( rule__CriterioType__ExpresionAssignment_3 ) ) )
            // InternalEvaluacion.g:635:1: ( ( rule__CriterioType__ExpresionAssignment_3 ) )
            {
            // InternalEvaluacion.g:635:1: ( ( rule__CriterioType__ExpresionAssignment_3 ) )
            // InternalEvaluacion.g:636:2: ( rule__CriterioType__ExpresionAssignment_3 )
            {
             before(grammarAccess.getCriterioTypeAccess().getExpresionAssignment_3()); 
            // InternalEvaluacion.g:637:2: ( rule__CriterioType__ExpresionAssignment_3 )
            // InternalEvaluacion.g:637:3: rule__CriterioType__ExpresionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CriterioType__ExpresionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCriterioTypeAccess().getExpresionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriterioType__Group__3__Impl"


    // $ANTLR start "rule__CriterioType__Group__4"
    // InternalEvaluacion.g:645:1: rule__CriterioType__Group__4 : rule__CriterioType__Group__4__Impl ;
    public final void rule__CriterioType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:649:1: ( rule__CriterioType__Group__4__Impl )
            // InternalEvaluacion.g:650:2: rule__CriterioType__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CriterioType__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriterioType__Group__4"


    // $ANTLR start "rule__CriterioType__Group__4__Impl"
    // InternalEvaluacion.g:656:1: rule__CriterioType__Group__4__Impl : ( ( rule__CriterioType__Group_4__0 )? ) ;
    public final void rule__CriterioType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:660:1: ( ( ( rule__CriterioType__Group_4__0 )? ) )
            // InternalEvaluacion.g:661:1: ( ( rule__CriterioType__Group_4__0 )? )
            {
            // InternalEvaluacion.g:661:1: ( ( rule__CriterioType__Group_4__0 )? )
            // InternalEvaluacion.g:662:2: ( rule__CriterioType__Group_4__0 )?
            {
             before(grammarAccess.getCriterioTypeAccess().getGroup_4()); 
            // InternalEvaluacion.g:663:2: ( rule__CriterioType__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEvaluacion.g:663:3: rule__CriterioType__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CriterioType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCriterioTypeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriterioType__Group__4__Impl"


    // $ANTLR start "rule__CriterioType__Group_4__0"
    // InternalEvaluacion.g:672:1: rule__CriterioType__Group_4__0 : rule__CriterioType__Group_4__0__Impl rule__CriterioType__Group_4__1 ;
    public final void rule__CriterioType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:676:1: ( rule__CriterioType__Group_4__0__Impl rule__CriterioType__Group_4__1 )
            // InternalEvaluacion.g:677:2: rule__CriterioType__Group_4__0__Impl rule__CriterioType__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__CriterioType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CriterioType__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriterioType__Group_4__0"


    // $ANTLR start "rule__CriterioType__Group_4__0__Impl"
    // InternalEvaluacion.g:684:1: rule__CriterioType__Group_4__0__Impl : ( ':' ) ;
    public final void rule__CriterioType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:688:1: ( ( ':' ) )
            // InternalEvaluacion.g:689:1: ( ':' )
            {
            // InternalEvaluacion.g:689:1: ( ':' )
            // InternalEvaluacion.g:690:2: ':'
            {
             before(grammarAccess.getCriterioTypeAccess().getColonKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCriterioTypeAccess().getColonKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriterioType__Group_4__0__Impl"


    // $ANTLR start "rule__CriterioType__Group_4__1"
    // InternalEvaluacion.g:699:1: rule__CriterioType__Group_4__1 : rule__CriterioType__Group_4__1__Impl ;
    public final void rule__CriterioType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:703:1: ( rule__CriterioType__Group_4__1__Impl )
            // InternalEvaluacion.g:704:2: rule__CriterioType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CriterioType__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriterioType__Group_4__1"


    // $ANTLR start "rule__CriterioType__Group_4__1__Impl"
    // InternalEvaluacion.g:710:1: rule__CriterioType__Group_4__1__Impl : ( ( rule__CriterioType__SoporteAssignment_4_1 ) ) ;
    public final void rule__CriterioType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:714:1: ( ( ( rule__CriterioType__SoporteAssignment_4_1 ) ) )
            // InternalEvaluacion.g:715:1: ( ( rule__CriterioType__SoporteAssignment_4_1 ) )
            {
            // InternalEvaluacion.g:715:1: ( ( rule__CriterioType__SoporteAssignment_4_1 ) )
            // InternalEvaluacion.g:716:2: ( rule__CriterioType__SoporteAssignment_4_1 )
            {
             before(grammarAccess.getCriterioTypeAccess().getSoporteAssignment_4_1()); 
            // InternalEvaluacion.g:717:2: ( rule__CriterioType__SoporteAssignment_4_1 )
            // InternalEvaluacion.g:717:3: rule__CriterioType__SoporteAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__CriterioType__SoporteAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCriterioTypeAccess().getSoporteAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriterioType__Group_4__1__Impl"


    // $ANTLR start "rule__Atomo__Group_0__0"
    // InternalEvaluacion.g:726:1: rule__Atomo__Group_0__0 : rule__Atomo__Group_0__0__Impl rule__Atomo__Group_0__1 ;
    public final void rule__Atomo__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:730:1: ( rule__Atomo__Group_0__0__Impl rule__Atomo__Group_0__1 )
            // InternalEvaluacion.g:731:2: rule__Atomo__Group_0__0__Impl rule__Atomo__Group_0__1
            {
            pushFollow(FOLLOW_11);
            rule__Atomo__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomo__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomo__Group_0__0"


    // $ANTLR start "rule__Atomo__Group_0__0__Impl"
    // InternalEvaluacion.g:738:1: rule__Atomo__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomo__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:742:1: ( ( () ) )
            // InternalEvaluacion.g:743:1: ( () )
            {
            // InternalEvaluacion.g:743:1: ( () )
            // InternalEvaluacion.g:744:2: ()
            {
             before(grammarAccess.getAtomoAccess().getIntConstantAction_0_0()); 
            // InternalEvaluacion.g:745:2: ()
            // InternalEvaluacion.g:745:3: 
            {
            }

             after(grammarAccess.getAtomoAccess().getIntConstantAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomo__Group_0__0__Impl"


    // $ANTLR start "rule__Atomo__Group_0__1"
    // InternalEvaluacion.g:753:1: rule__Atomo__Group_0__1 : rule__Atomo__Group_0__1__Impl ;
    public final void rule__Atomo__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:757:1: ( rule__Atomo__Group_0__1__Impl )
            // InternalEvaluacion.g:758:2: rule__Atomo__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomo__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomo__Group_0__1"


    // $ANTLR start "rule__Atomo__Group_0__1__Impl"
    // InternalEvaluacion.g:764:1: rule__Atomo__Group_0__1__Impl : ( ( rule__Atomo__ValorAssignment_0_1 ) ) ;
    public final void rule__Atomo__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:768:1: ( ( ( rule__Atomo__ValorAssignment_0_1 ) ) )
            // InternalEvaluacion.g:769:1: ( ( rule__Atomo__ValorAssignment_0_1 ) )
            {
            // InternalEvaluacion.g:769:1: ( ( rule__Atomo__ValorAssignment_0_1 ) )
            // InternalEvaluacion.g:770:2: ( rule__Atomo__ValorAssignment_0_1 )
            {
             before(grammarAccess.getAtomoAccess().getValorAssignment_0_1()); 
            // InternalEvaluacion.g:771:2: ( rule__Atomo__ValorAssignment_0_1 )
            // InternalEvaluacion.g:771:3: rule__Atomo__ValorAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomo__ValorAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomoAccess().getValorAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomo__Group_0__1__Impl"


    // $ANTLR start "rule__Atomo__Group_1__0"
    // InternalEvaluacion.g:780:1: rule__Atomo__Group_1__0 : rule__Atomo__Group_1__0__Impl rule__Atomo__Group_1__1 ;
    public final void rule__Atomo__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:784:1: ( rule__Atomo__Group_1__0__Impl rule__Atomo__Group_1__1 )
            // InternalEvaluacion.g:785:2: rule__Atomo__Group_1__0__Impl rule__Atomo__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Atomo__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomo__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomo__Group_1__0"


    // $ANTLR start "rule__Atomo__Group_1__0__Impl"
    // InternalEvaluacion.g:792:1: rule__Atomo__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomo__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:796:1: ( ( () ) )
            // InternalEvaluacion.g:797:1: ( () )
            {
            // InternalEvaluacion.g:797:1: ( () )
            // InternalEvaluacion.g:798:2: ()
            {
             before(grammarAccess.getAtomoAccess().getStringConstantAction_1_0()); 
            // InternalEvaluacion.g:799:2: ()
            // InternalEvaluacion.g:799:3: 
            {
            }

             after(grammarAccess.getAtomoAccess().getStringConstantAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomo__Group_1__0__Impl"


    // $ANTLR start "rule__Atomo__Group_1__1"
    // InternalEvaluacion.g:807:1: rule__Atomo__Group_1__1 : rule__Atomo__Group_1__1__Impl ;
    public final void rule__Atomo__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:811:1: ( rule__Atomo__Group_1__1__Impl )
            // InternalEvaluacion.g:812:2: rule__Atomo__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomo__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomo__Group_1__1"


    // $ANTLR start "rule__Atomo__Group_1__1__Impl"
    // InternalEvaluacion.g:818:1: rule__Atomo__Group_1__1__Impl : ( ( rule__Atomo__ValorAssignment_1_1 ) ) ;
    public final void rule__Atomo__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:822:1: ( ( ( rule__Atomo__ValorAssignment_1_1 ) ) )
            // InternalEvaluacion.g:823:1: ( ( rule__Atomo__ValorAssignment_1_1 ) )
            {
            // InternalEvaluacion.g:823:1: ( ( rule__Atomo__ValorAssignment_1_1 ) )
            // InternalEvaluacion.g:824:2: ( rule__Atomo__ValorAssignment_1_1 )
            {
             before(grammarAccess.getAtomoAccess().getValorAssignment_1_1()); 
            // InternalEvaluacion.g:825:2: ( rule__Atomo__ValorAssignment_1_1 )
            // InternalEvaluacion.g:825:3: rule__Atomo__ValorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomo__ValorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomoAccess().getValorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomo__Group_1__1__Impl"


    // $ANTLR start "rule__Atomo__Group_2__0"
    // InternalEvaluacion.g:834:1: rule__Atomo__Group_2__0 : rule__Atomo__Group_2__0__Impl rule__Atomo__Group_2__1 ;
    public final void rule__Atomo__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:838:1: ( rule__Atomo__Group_2__0__Impl rule__Atomo__Group_2__1 )
            // InternalEvaluacion.g:839:2: rule__Atomo__Group_2__0__Impl rule__Atomo__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__Atomo__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomo__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomo__Group_2__0"


    // $ANTLR start "rule__Atomo__Group_2__0__Impl"
    // InternalEvaluacion.g:846:1: rule__Atomo__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomo__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:850:1: ( ( () ) )
            // InternalEvaluacion.g:851:1: ( () )
            {
            // InternalEvaluacion.g:851:1: ( () )
            // InternalEvaluacion.g:852:2: ()
            {
             before(grammarAccess.getAtomoAccess().getBoolConstantAction_2_0()); 
            // InternalEvaluacion.g:853:2: ()
            // InternalEvaluacion.g:853:3: 
            {
            }

             after(grammarAccess.getAtomoAccess().getBoolConstantAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomo__Group_2__0__Impl"


    // $ANTLR start "rule__Atomo__Group_2__1"
    // InternalEvaluacion.g:861:1: rule__Atomo__Group_2__1 : rule__Atomo__Group_2__1__Impl ;
    public final void rule__Atomo__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:865:1: ( rule__Atomo__Group_2__1__Impl )
            // InternalEvaluacion.g:866:2: rule__Atomo__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomo__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomo__Group_2__1"


    // $ANTLR start "rule__Atomo__Group_2__1__Impl"
    // InternalEvaluacion.g:872:1: rule__Atomo__Group_2__1__Impl : ( ( rule__Atomo__ValorAssignment_2_1 ) ) ;
    public final void rule__Atomo__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:876:1: ( ( ( rule__Atomo__ValorAssignment_2_1 ) ) )
            // InternalEvaluacion.g:877:1: ( ( rule__Atomo__ValorAssignment_2_1 ) )
            {
            // InternalEvaluacion.g:877:1: ( ( rule__Atomo__ValorAssignment_2_1 ) )
            // InternalEvaluacion.g:878:2: ( rule__Atomo__ValorAssignment_2_1 )
            {
             before(grammarAccess.getAtomoAccess().getValorAssignment_2_1()); 
            // InternalEvaluacion.g:879:2: ( rule__Atomo__ValorAssignment_2_1 )
            // InternalEvaluacion.g:879:3: rule__Atomo__ValorAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomo__ValorAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomoAccess().getValorAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomo__Group_2__1__Impl"


    // $ANTLR start "rule__EvaluacionModel__ComponentesAssignment"
    // InternalEvaluacion.g:888:1: rule__EvaluacionModel__ComponentesAssignment : ( ruleCmpntEvaluacion ) ;
    public final void rule__EvaluacionModel__ComponentesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:892:1: ( ( ruleCmpntEvaluacion ) )
            // InternalEvaluacion.g:893:2: ( ruleCmpntEvaluacion )
            {
            // InternalEvaluacion.g:893:2: ( ruleCmpntEvaluacion )
            // InternalEvaluacion.g:894:3: ruleCmpntEvaluacion
            {
             before(grammarAccess.getEvaluacionModelAccess().getComponentesCmpntEvaluacionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleCmpntEvaluacion();

            state._fsp--;

             after(grammarAccess.getEvaluacionModelAccess().getComponentesCmpntEvaluacionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluacionModel__ComponentesAssignment"


    // $ANTLR start "rule__CmpntEvaluacion__NameAssignment_1"
    // InternalEvaluacion.g:903:1: rule__CmpntEvaluacion__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CmpntEvaluacion__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:907:1: ( ( RULE_ID ) )
            // InternalEvaluacion.g:908:2: ( RULE_ID )
            {
            // InternalEvaluacion.g:908:2: ( RULE_ID )
            // InternalEvaluacion.g:909:3: RULE_ID
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
    // InternalEvaluacion.g:918:1: rule__CmpntEvaluacion__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__CmpntEvaluacion__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:922:1: ( ( ( RULE_ID ) ) )
            // InternalEvaluacion.g:923:2: ( ( RULE_ID ) )
            {
            // InternalEvaluacion.g:923:2: ( ( RULE_ID ) )
            // InternalEvaluacion.g:924:3: ( RULE_ID )
            {
             before(grammarAccess.getCmpntEvaluacionAccess().getSuperTypeCmpntEvaluacionCrossReference_2_1_0()); 
            // InternalEvaluacion.g:925:3: ( RULE_ID )
            // InternalEvaluacion.g:926:4: RULE_ID
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


    // $ANTLR start "rule__CmpntEvaluacion__AtributosAssignment_4"
    // InternalEvaluacion.g:937:1: rule__CmpntEvaluacion__AtributosAssignment_4 : ( ruleAtributos ) ;
    public final void rule__CmpntEvaluacion__AtributosAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:941:1: ( ( ruleAtributos ) )
            // InternalEvaluacion.g:942:2: ( ruleAtributos )
            {
            // InternalEvaluacion.g:942:2: ( ruleAtributos )
            // InternalEvaluacion.g:943:3: ruleAtributos
            {
             before(grammarAccess.getCmpntEvaluacionAccess().getAtributosAtributosParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAtributos();

            state._fsp--;

             after(grammarAccess.getCmpntEvaluacionAccess().getAtributosAtributosParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmpntEvaluacion__AtributosAssignment_4"


    // $ANTLR start "rule__Atributos__CriteriosAssignment"
    // InternalEvaluacion.g:952:1: rule__Atributos__CriteriosAssignment : ( ruleCriterio ) ;
    public final void rule__Atributos__CriteriosAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:956:1: ( ( ruleCriterio ) )
            // InternalEvaluacion.g:957:2: ( ruleCriterio )
            {
            // InternalEvaluacion.g:957:2: ( ruleCriterio )
            // InternalEvaluacion.g:958:3: ruleCriterio
            {
             before(grammarAccess.getAtributosAccess().getCriteriosCriterioParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleCriterio();

            state._fsp--;

             after(grammarAccess.getAtributosAccess().getCriteriosCriterioParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributos__CriteriosAssignment"


    // $ANTLR start "rule__CriterioType__NameAssignment_1"
    // InternalEvaluacion.g:967:1: rule__CriterioType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CriterioType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:971:1: ( ( RULE_ID ) )
            // InternalEvaluacion.g:972:2: ( RULE_ID )
            {
            // InternalEvaluacion.g:972:2: ( RULE_ID )
            // InternalEvaluacion.g:973:3: RULE_ID
            {
             before(grammarAccess.getCriterioTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCriterioTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriterioType__NameAssignment_1"


    // $ANTLR start "rule__CriterioType__ExpresionAssignment_3"
    // InternalEvaluacion.g:982:1: rule__CriterioType__ExpresionAssignment_3 : ( ruleExpresion ) ;
    public final void rule__CriterioType__ExpresionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:986:1: ( ( ruleExpresion ) )
            // InternalEvaluacion.g:987:2: ( ruleExpresion )
            {
            // InternalEvaluacion.g:987:2: ( ruleExpresion )
            // InternalEvaluacion.g:988:3: ruleExpresion
            {
             before(grammarAccess.getCriterioTypeAccess().getExpresionExpresionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getCriterioTypeAccess().getExpresionExpresionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriterioType__ExpresionAssignment_3"


    // $ANTLR start "rule__CriterioType__SoporteAssignment_4_1"
    // InternalEvaluacion.g:997:1: rule__CriterioType__SoporteAssignment_4_1 : ( ruleExpresion ) ;
    public final void rule__CriterioType__SoporteAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:1001:1: ( ( ruleExpresion ) )
            // InternalEvaluacion.g:1002:2: ( ruleExpresion )
            {
            // InternalEvaluacion.g:1002:2: ( ruleExpresion )
            // InternalEvaluacion.g:1003:3: ruleExpresion
            {
             before(grammarAccess.getCriterioTypeAccess().getSoporteExpresionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getCriterioTypeAccess().getSoporteExpresionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriterioType__SoporteAssignment_4_1"


    // $ANTLR start "rule__Atomo__ValorAssignment_0_1"
    // InternalEvaluacion.g:1012:1: rule__Atomo__ValorAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Atomo__ValorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:1016:1: ( ( RULE_INT ) )
            // InternalEvaluacion.g:1017:2: ( RULE_INT )
            {
            // InternalEvaluacion.g:1017:2: ( RULE_INT )
            // InternalEvaluacion.g:1018:3: RULE_INT
            {
             before(grammarAccess.getAtomoAccess().getValorINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAtomoAccess().getValorINTTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomo__ValorAssignment_0_1"


    // $ANTLR start "rule__Atomo__ValorAssignment_1_1"
    // InternalEvaluacion.g:1027:1: rule__Atomo__ValorAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Atomo__ValorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:1031:1: ( ( RULE_STRING ) )
            // InternalEvaluacion.g:1032:2: ( RULE_STRING )
            {
            // InternalEvaluacion.g:1032:2: ( RULE_STRING )
            // InternalEvaluacion.g:1033:3: RULE_STRING
            {
             before(grammarAccess.getAtomoAccess().getValorSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAtomoAccess().getValorSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomo__ValorAssignment_1_1"


    // $ANTLR start "rule__Atomo__ValorAssignment_2_1"
    // InternalEvaluacion.g:1042:1: rule__Atomo__ValorAssignment_2_1 : ( ( rule__Atomo__ValorAlternatives_2_1_0 ) ) ;
    public final void rule__Atomo__ValorAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:1046:1: ( ( ( rule__Atomo__ValorAlternatives_2_1_0 ) ) )
            // InternalEvaluacion.g:1047:2: ( ( rule__Atomo__ValorAlternatives_2_1_0 ) )
            {
            // InternalEvaluacion.g:1047:2: ( ( rule__Atomo__ValorAlternatives_2_1_0 ) )
            // InternalEvaluacion.g:1048:3: ( rule__Atomo__ValorAlternatives_2_1_0 )
            {
             before(grammarAccess.getAtomoAccess().getValorAlternatives_2_1_0()); 
            // InternalEvaluacion.g:1049:3: ( rule__Atomo__ValorAlternatives_2_1_0 )
            // InternalEvaluacion.g:1049:4: rule__Atomo__ValorAlternatives_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Atomo__ValorAlternatives_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAtomoAccess().getValorAlternatives_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomo__ValorAssignment_2_1"


    // $ANTLR start "rule__ComplejoType__ComponenteAssignment"
    // InternalEvaluacion.g:1057:1: rule__ComplejoType__ComponenteAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ComplejoType__ComponenteAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:1061:1: ( ( ( RULE_ID ) ) )
            // InternalEvaluacion.g:1062:2: ( ( RULE_ID ) )
            {
            // InternalEvaluacion.g:1062:2: ( ( RULE_ID ) )
            // InternalEvaluacion.g:1063:3: ( RULE_ID )
            {
             before(grammarAccess.getComplejoTypeAccess().getComponenteCmpntEvaluacionCrossReference_0()); 
            // InternalEvaluacion.g:1064:3: ( RULE_ID )
            // InternalEvaluacion.g:1065:4: RULE_ID
            {
             before(grammarAccess.getComplejoTypeAccess().getComponenteCmpntEvaluacionIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComplejoTypeAccess().getComponenteCmpntEvaluacionIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getComplejoTypeAccess().getComponenteCmpntEvaluacionCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplejoType__ComponenteAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000028010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001860L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});

}