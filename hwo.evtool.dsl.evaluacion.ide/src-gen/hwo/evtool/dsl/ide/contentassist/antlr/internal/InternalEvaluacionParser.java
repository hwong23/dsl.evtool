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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'string'", "'int'", "'boolean'", "'comopnente'", "'{'", "'}'", "'hereda'", "';'", "']'", "'['"
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
    public static final int T__20=20;

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

                if ( (LA1_0==14) ) {
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


    // $ANTLR start "entryRuleCmpnntEvaluacion"
    // InternalEvaluacion.g:78:1: entryRuleCmpnntEvaluacion : ruleCmpnntEvaluacion EOF ;
    public final void entryRuleCmpnntEvaluacion() throws RecognitionException {
        try {
            // InternalEvaluacion.g:79:1: ( ruleCmpnntEvaluacion EOF )
            // InternalEvaluacion.g:80:1: ruleCmpnntEvaluacion EOF
            {
             before(grammarAccess.getCmpnntEvaluacionRule()); 
            pushFollow(FOLLOW_1);
            ruleCmpnntEvaluacion();

            state._fsp--;

             after(grammarAccess.getCmpnntEvaluacionRule()); 
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
    // $ANTLR end "entryRuleCmpnntEvaluacion"


    // $ANTLR start "ruleCmpnntEvaluacion"
    // InternalEvaluacion.g:87:1: ruleCmpnntEvaluacion : ( ( rule__CmpnntEvaluacion__Group__0 ) ) ;
    public final void ruleCmpnntEvaluacion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:91:2: ( ( ( rule__CmpnntEvaluacion__Group__0 ) ) )
            // InternalEvaluacion.g:92:2: ( ( rule__CmpnntEvaluacion__Group__0 ) )
            {
            // InternalEvaluacion.g:92:2: ( ( rule__CmpnntEvaluacion__Group__0 ) )
            // InternalEvaluacion.g:93:3: ( rule__CmpnntEvaluacion__Group__0 )
            {
             before(grammarAccess.getCmpnntEvaluacionAccess().getGroup()); 
            // InternalEvaluacion.g:94:3: ( rule__CmpnntEvaluacion__Group__0 )
            // InternalEvaluacion.g:94:4: rule__CmpnntEvaluacion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CmpnntEvaluacion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCmpnntEvaluacionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCmpnntEvaluacion"


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
    // InternalEvaluacion.g:112:1: ruleCriterio : ( ( rule__Criterio__Group__0 ) ) ;
    public final void ruleCriterio() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:116:2: ( ( ( rule__Criterio__Group__0 ) ) )
            // InternalEvaluacion.g:117:2: ( ( rule__Criterio__Group__0 ) )
            {
            // InternalEvaluacion.g:117:2: ( ( rule__Criterio__Group__0 ) )
            // InternalEvaluacion.g:118:3: ( rule__Criterio__Group__0 )
            {
             before(grammarAccess.getCriterioAccess().getGroup()); 
            // InternalEvaluacion.g:119:3: ( rule__Criterio__Group__0 )
            // InternalEvaluacion.g:119:4: rule__Criterio__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Criterio__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCriterioAccess().getGroup()); 

            }


            }

        }
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
    // InternalEvaluacion.g:128:1: entryRuleCriterioType : ruleCriterioType EOF ;
    public final void entryRuleCriterioType() throws RecognitionException {
        try {
            // InternalEvaluacion.g:129:1: ( ruleCriterioType EOF )
            // InternalEvaluacion.g:130:1: ruleCriterioType EOF
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
    // InternalEvaluacion.g:137:1: ruleCriterioType : ( ( rule__CriterioType__Group__0 ) ) ;
    public final void ruleCriterioType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:141:2: ( ( ( rule__CriterioType__Group__0 ) ) )
            // InternalEvaluacion.g:142:2: ( ( rule__CriterioType__Group__0 ) )
            {
            // InternalEvaluacion.g:142:2: ( ( rule__CriterioType__Group__0 ) )
            // InternalEvaluacion.g:143:3: ( rule__CriterioType__Group__0 )
            {
             before(grammarAccess.getCriterioTypeAccess().getGroup()); 
            // InternalEvaluacion.g:144:3: ( rule__CriterioType__Group__0 )
            // InternalEvaluacion.g:144:4: rule__CriterioType__Group__0
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
    // InternalEvaluacion.g:153:1: entryRuleElementType : ruleElementType EOF ;
    public final void entryRuleElementType() throws RecognitionException {
        try {
            // InternalEvaluacion.g:154:1: ( ruleElementType EOF )
            // InternalEvaluacion.g:155:1: ruleElementType EOF
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
    // InternalEvaluacion.g:162:1: ruleElementType : ( ( rule__ElementType__Alternatives ) ) ;
    public final void ruleElementType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:166:2: ( ( ( rule__ElementType__Alternatives ) ) )
            // InternalEvaluacion.g:167:2: ( ( rule__ElementType__Alternatives ) )
            {
            // InternalEvaluacion.g:167:2: ( ( rule__ElementType__Alternatives ) )
            // InternalEvaluacion.g:168:3: ( rule__ElementType__Alternatives )
            {
             before(grammarAccess.getElementTypeAccess().getAlternatives()); 
            // InternalEvaluacion.g:169:3: ( rule__ElementType__Alternatives )
            // InternalEvaluacion.g:169:4: rule__ElementType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ElementType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementTypeAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleBasicType"
    // InternalEvaluacion.g:178:1: entryRuleBasicType : ruleBasicType EOF ;
    public final void entryRuleBasicType() throws RecognitionException {
        try {
            // InternalEvaluacion.g:179:1: ( ruleBasicType EOF )
            // InternalEvaluacion.g:180:1: ruleBasicType EOF
            {
             before(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleBasicType();

            state._fsp--;

             after(grammarAccess.getBasicTypeRule()); 
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
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // InternalEvaluacion.g:187:1: ruleBasicType : ( ( rule__BasicType__TypeNameAssignment ) ) ;
    public final void ruleBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:191:2: ( ( ( rule__BasicType__TypeNameAssignment ) ) )
            // InternalEvaluacion.g:192:2: ( ( rule__BasicType__TypeNameAssignment ) )
            {
            // InternalEvaluacion.g:192:2: ( ( rule__BasicType__TypeNameAssignment ) )
            // InternalEvaluacion.g:193:3: ( rule__BasicType__TypeNameAssignment )
            {
             before(grammarAccess.getBasicTypeAccess().getTypeNameAssignment()); 
            // InternalEvaluacion.g:194:3: ( rule__BasicType__TypeNameAssignment )
            // InternalEvaluacion.g:194:4: rule__BasicType__TypeNameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BasicType__TypeNameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBasicTypeAccess().getTypeNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicType"


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
    // InternalEvaluacion.g:212:1: ruleComponenteType : ( ( rule__ComponenteType__EntityAssignment ) ) ;
    public final void ruleComponenteType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:216:2: ( ( ( rule__ComponenteType__EntityAssignment ) ) )
            // InternalEvaluacion.g:217:2: ( ( rule__ComponenteType__EntityAssignment ) )
            {
            // InternalEvaluacion.g:217:2: ( ( rule__ComponenteType__EntityAssignment ) )
            // InternalEvaluacion.g:218:3: ( rule__ComponenteType__EntityAssignment )
            {
             before(grammarAccess.getComponenteTypeAccess().getEntityAssignment()); 
            // InternalEvaluacion.g:219:3: ( rule__ComponenteType__EntityAssignment )
            // InternalEvaluacion.g:219:4: rule__ComponenteType__EntityAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ComponenteType__EntityAssignment();

            state._fsp--;


            }

             after(grammarAccess.getComponenteTypeAccess().getEntityAssignment()); 

            }


            }

        }
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


    // $ANTLR start "rule__ElementType__Alternatives"
    // InternalEvaluacion.g:227:1: rule__ElementType__Alternatives : ( ( ruleBasicType ) | ( ruleComponenteType ) );
    public final void rule__ElementType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:231:1: ( ( ruleBasicType ) | ( ruleComponenteType ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=11 && LA2_0<=13)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalEvaluacion.g:232:2: ( ruleBasicType )
                    {
                    // InternalEvaluacion.g:232:2: ( ruleBasicType )
                    // InternalEvaluacion.g:233:3: ruleBasicType
                    {
                     before(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBasicType();

                    state._fsp--;

                     after(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEvaluacion.g:238:2: ( ruleComponenteType )
                    {
                    // InternalEvaluacion.g:238:2: ( ruleComponenteType )
                    // InternalEvaluacion.g:239:3: ruleComponenteType
                    {
                     before(grammarAccess.getElementTypeAccess().getComponenteTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleComponenteType();

                    state._fsp--;

                     after(grammarAccess.getElementTypeAccess().getComponenteTypeParserRuleCall_1()); 

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
    // $ANTLR end "rule__ElementType__Alternatives"


    // $ANTLR start "rule__BasicType__TypeNameAlternatives_0"
    // InternalEvaluacion.g:248:1: rule__BasicType__TypeNameAlternatives_0 : ( ( 'string' ) | ( 'int' ) | ( 'boolean' ) );
    public final void rule__BasicType__TypeNameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:252:1: ( ( 'string' ) | ( 'int' ) | ( 'boolean' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
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
                    // InternalEvaluacion.g:253:2: ( 'string' )
                    {
                    // InternalEvaluacion.g:253:2: ( 'string' )
                    // InternalEvaluacion.g:254:3: 'string'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameStringKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameStringKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEvaluacion.g:259:2: ( 'int' )
                    {
                    // InternalEvaluacion.g:259:2: ( 'int' )
                    // InternalEvaluacion.g:260:3: 'int'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameIntKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameIntKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEvaluacion.g:265:2: ( 'boolean' )
                    {
                    // InternalEvaluacion.g:265:2: ( 'boolean' )
                    // InternalEvaluacion.g:266:3: 'boolean'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameBooleanKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameBooleanKeyword_0_2()); 

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
    // $ANTLR end "rule__BasicType__TypeNameAlternatives_0"


    // $ANTLR start "rule__CmpnntEvaluacion__Group__0"
    // InternalEvaluacion.g:275:1: rule__CmpnntEvaluacion__Group__0 : rule__CmpnntEvaluacion__Group__0__Impl rule__CmpnntEvaluacion__Group__1 ;
    public final void rule__CmpnntEvaluacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:279:1: ( rule__CmpnntEvaluacion__Group__0__Impl rule__CmpnntEvaluacion__Group__1 )
            // InternalEvaluacion.g:280:2: rule__CmpnntEvaluacion__Group__0__Impl rule__CmpnntEvaluacion__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__CmpnntEvaluacion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CmpnntEvaluacion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmpnntEvaluacion__Group__0"


    // $ANTLR start "rule__CmpnntEvaluacion__Group__0__Impl"
    // InternalEvaluacion.g:287:1: rule__CmpnntEvaluacion__Group__0__Impl : ( 'comopnente' ) ;
    public final void rule__CmpnntEvaluacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:291:1: ( ( 'comopnente' ) )
            // InternalEvaluacion.g:292:1: ( 'comopnente' )
            {
            // InternalEvaluacion.g:292:1: ( 'comopnente' )
            // InternalEvaluacion.g:293:2: 'comopnente'
            {
             before(grammarAccess.getCmpnntEvaluacionAccess().getComopnenteKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCmpnntEvaluacionAccess().getComopnenteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmpnntEvaluacion__Group__0__Impl"


    // $ANTLR start "rule__CmpnntEvaluacion__Group__1"
    // InternalEvaluacion.g:302:1: rule__CmpnntEvaluacion__Group__1 : rule__CmpnntEvaluacion__Group__1__Impl rule__CmpnntEvaluacion__Group__2 ;
    public final void rule__CmpnntEvaluacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:306:1: ( rule__CmpnntEvaluacion__Group__1__Impl rule__CmpnntEvaluacion__Group__2 )
            // InternalEvaluacion.g:307:2: rule__CmpnntEvaluacion__Group__1__Impl rule__CmpnntEvaluacion__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__CmpnntEvaluacion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CmpnntEvaluacion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmpnntEvaluacion__Group__1"


    // $ANTLR start "rule__CmpnntEvaluacion__Group__1__Impl"
    // InternalEvaluacion.g:314:1: rule__CmpnntEvaluacion__Group__1__Impl : ( ( rule__CmpnntEvaluacion__NameAssignment_1 ) ) ;
    public final void rule__CmpnntEvaluacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:318:1: ( ( ( rule__CmpnntEvaluacion__NameAssignment_1 ) ) )
            // InternalEvaluacion.g:319:1: ( ( rule__CmpnntEvaluacion__NameAssignment_1 ) )
            {
            // InternalEvaluacion.g:319:1: ( ( rule__CmpnntEvaluacion__NameAssignment_1 ) )
            // InternalEvaluacion.g:320:2: ( rule__CmpnntEvaluacion__NameAssignment_1 )
            {
             before(grammarAccess.getCmpnntEvaluacionAccess().getNameAssignment_1()); 
            // InternalEvaluacion.g:321:2: ( rule__CmpnntEvaluacion__NameAssignment_1 )
            // InternalEvaluacion.g:321:3: rule__CmpnntEvaluacion__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CmpnntEvaluacion__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCmpnntEvaluacionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmpnntEvaluacion__Group__1__Impl"


    // $ANTLR start "rule__CmpnntEvaluacion__Group__2"
    // InternalEvaluacion.g:329:1: rule__CmpnntEvaluacion__Group__2 : rule__CmpnntEvaluacion__Group__2__Impl rule__CmpnntEvaluacion__Group__3 ;
    public final void rule__CmpnntEvaluacion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:333:1: ( rule__CmpnntEvaluacion__Group__2__Impl rule__CmpnntEvaluacion__Group__3 )
            // InternalEvaluacion.g:334:2: rule__CmpnntEvaluacion__Group__2__Impl rule__CmpnntEvaluacion__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__CmpnntEvaluacion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CmpnntEvaluacion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmpnntEvaluacion__Group__2"


    // $ANTLR start "rule__CmpnntEvaluacion__Group__2__Impl"
    // InternalEvaluacion.g:341:1: rule__CmpnntEvaluacion__Group__2__Impl : ( ( rule__CmpnntEvaluacion__Group_2__0 )? ) ;
    public final void rule__CmpnntEvaluacion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:345:1: ( ( ( rule__CmpnntEvaluacion__Group_2__0 )? ) )
            // InternalEvaluacion.g:346:1: ( ( rule__CmpnntEvaluacion__Group_2__0 )? )
            {
            // InternalEvaluacion.g:346:1: ( ( rule__CmpnntEvaluacion__Group_2__0 )? )
            // InternalEvaluacion.g:347:2: ( rule__CmpnntEvaluacion__Group_2__0 )?
            {
             before(grammarAccess.getCmpnntEvaluacionAccess().getGroup_2()); 
            // InternalEvaluacion.g:348:2: ( rule__CmpnntEvaluacion__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEvaluacion.g:348:3: rule__CmpnntEvaluacion__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CmpnntEvaluacion__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCmpnntEvaluacionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmpnntEvaluacion__Group__2__Impl"


    // $ANTLR start "rule__CmpnntEvaluacion__Group__3"
    // InternalEvaluacion.g:356:1: rule__CmpnntEvaluacion__Group__3 : rule__CmpnntEvaluacion__Group__3__Impl rule__CmpnntEvaluacion__Group__4 ;
    public final void rule__CmpnntEvaluacion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:360:1: ( rule__CmpnntEvaluacion__Group__3__Impl rule__CmpnntEvaluacion__Group__4 )
            // InternalEvaluacion.g:361:2: rule__CmpnntEvaluacion__Group__3__Impl rule__CmpnntEvaluacion__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__CmpnntEvaluacion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CmpnntEvaluacion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmpnntEvaluacion__Group__3"


    // $ANTLR start "rule__CmpnntEvaluacion__Group__3__Impl"
    // InternalEvaluacion.g:368:1: rule__CmpnntEvaluacion__Group__3__Impl : ( '{' ) ;
    public final void rule__CmpnntEvaluacion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:372:1: ( ( '{' ) )
            // InternalEvaluacion.g:373:1: ( '{' )
            {
            // InternalEvaluacion.g:373:1: ( '{' )
            // InternalEvaluacion.g:374:2: '{'
            {
             before(grammarAccess.getCmpnntEvaluacionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCmpnntEvaluacionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmpnntEvaluacion__Group__3__Impl"


    // $ANTLR start "rule__CmpnntEvaluacion__Group__4"
    // InternalEvaluacion.g:383:1: rule__CmpnntEvaluacion__Group__4 : rule__CmpnntEvaluacion__Group__4__Impl rule__CmpnntEvaluacion__Group__5 ;
    public final void rule__CmpnntEvaluacion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:387:1: ( rule__CmpnntEvaluacion__Group__4__Impl rule__CmpnntEvaluacion__Group__5 )
            // InternalEvaluacion.g:388:2: rule__CmpnntEvaluacion__Group__4__Impl rule__CmpnntEvaluacion__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__CmpnntEvaluacion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CmpnntEvaluacion__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmpnntEvaluacion__Group__4"


    // $ANTLR start "rule__CmpnntEvaluacion__Group__4__Impl"
    // InternalEvaluacion.g:395:1: rule__CmpnntEvaluacion__Group__4__Impl : ( ( rule__CmpnntEvaluacion__AttributesAssignment_4 )* ) ;
    public final void rule__CmpnntEvaluacion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:399:1: ( ( ( rule__CmpnntEvaluacion__AttributesAssignment_4 )* ) )
            // InternalEvaluacion.g:400:1: ( ( rule__CmpnntEvaluacion__AttributesAssignment_4 )* )
            {
            // InternalEvaluacion.g:400:1: ( ( rule__CmpnntEvaluacion__AttributesAssignment_4 )* )
            // InternalEvaluacion.g:401:2: ( rule__CmpnntEvaluacion__AttributesAssignment_4 )*
            {
             before(grammarAccess.getCmpnntEvaluacionAccess().getAttributesAssignment_4()); 
            // InternalEvaluacion.g:402:2: ( rule__CmpnntEvaluacion__AttributesAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||(LA5_0>=11 && LA5_0<=13)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalEvaluacion.g:402:3: rule__CmpnntEvaluacion__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__CmpnntEvaluacion__AttributesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getCmpnntEvaluacionAccess().getAttributesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmpnntEvaluacion__Group__4__Impl"


    // $ANTLR start "rule__CmpnntEvaluacion__Group__5"
    // InternalEvaluacion.g:410:1: rule__CmpnntEvaluacion__Group__5 : rule__CmpnntEvaluacion__Group__5__Impl ;
    public final void rule__CmpnntEvaluacion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:414:1: ( rule__CmpnntEvaluacion__Group__5__Impl )
            // InternalEvaluacion.g:415:2: rule__CmpnntEvaluacion__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CmpnntEvaluacion__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmpnntEvaluacion__Group__5"


    // $ANTLR start "rule__CmpnntEvaluacion__Group__5__Impl"
    // InternalEvaluacion.g:421:1: rule__CmpnntEvaluacion__Group__5__Impl : ( '}' ) ;
    public final void rule__CmpnntEvaluacion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:425:1: ( ( '}' ) )
            // InternalEvaluacion.g:426:1: ( '}' )
            {
            // InternalEvaluacion.g:426:1: ( '}' )
            // InternalEvaluacion.g:427:2: '}'
            {
             before(grammarAccess.getCmpnntEvaluacionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCmpnntEvaluacionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmpnntEvaluacion__Group__5__Impl"


    // $ANTLR start "rule__CmpnntEvaluacion__Group_2__0"
    // InternalEvaluacion.g:437:1: rule__CmpnntEvaluacion__Group_2__0 : rule__CmpnntEvaluacion__Group_2__0__Impl rule__CmpnntEvaluacion__Group_2__1 ;
    public final void rule__CmpnntEvaluacion__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:441:1: ( rule__CmpnntEvaluacion__Group_2__0__Impl rule__CmpnntEvaluacion__Group_2__1 )
            // InternalEvaluacion.g:442:2: rule__CmpnntEvaluacion__Group_2__0__Impl rule__CmpnntEvaluacion__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__CmpnntEvaluacion__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CmpnntEvaluacion__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmpnntEvaluacion__Group_2__0"


    // $ANTLR start "rule__CmpnntEvaluacion__Group_2__0__Impl"
    // InternalEvaluacion.g:449:1: rule__CmpnntEvaluacion__Group_2__0__Impl : ( 'hereda' ) ;
    public final void rule__CmpnntEvaluacion__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:453:1: ( ( 'hereda' ) )
            // InternalEvaluacion.g:454:1: ( 'hereda' )
            {
            // InternalEvaluacion.g:454:1: ( 'hereda' )
            // InternalEvaluacion.g:455:2: 'hereda'
            {
             before(grammarAccess.getCmpnntEvaluacionAccess().getHeredaKeyword_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCmpnntEvaluacionAccess().getHeredaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmpnntEvaluacion__Group_2__0__Impl"


    // $ANTLR start "rule__CmpnntEvaluacion__Group_2__1"
    // InternalEvaluacion.g:464:1: rule__CmpnntEvaluacion__Group_2__1 : rule__CmpnntEvaluacion__Group_2__1__Impl ;
    public final void rule__CmpnntEvaluacion__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:468:1: ( rule__CmpnntEvaluacion__Group_2__1__Impl )
            // InternalEvaluacion.g:469:2: rule__CmpnntEvaluacion__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CmpnntEvaluacion__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmpnntEvaluacion__Group_2__1"


    // $ANTLR start "rule__CmpnntEvaluacion__Group_2__1__Impl"
    // InternalEvaluacion.g:475:1: rule__CmpnntEvaluacion__Group_2__1__Impl : ( ( rule__CmpnntEvaluacion__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__CmpnntEvaluacion__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:479:1: ( ( ( rule__CmpnntEvaluacion__SuperTypeAssignment_2_1 ) ) )
            // InternalEvaluacion.g:480:1: ( ( rule__CmpnntEvaluacion__SuperTypeAssignment_2_1 ) )
            {
            // InternalEvaluacion.g:480:1: ( ( rule__CmpnntEvaluacion__SuperTypeAssignment_2_1 ) )
            // InternalEvaluacion.g:481:2: ( rule__CmpnntEvaluacion__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getCmpnntEvaluacionAccess().getSuperTypeAssignment_2_1()); 
            // InternalEvaluacion.g:482:2: ( rule__CmpnntEvaluacion__SuperTypeAssignment_2_1 )
            // InternalEvaluacion.g:482:3: rule__CmpnntEvaluacion__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__CmpnntEvaluacion__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCmpnntEvaluacionAccess().getSuperTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmpnntEvaluacion__Group_2__1__Impl"


    // $ANTLR start "rule__Criterio__Group__0"
    // InternalEvaluacion.g:491:1: rule__Criterio__Group__0 : rule__Criterio__Group__0__Impl rule__Criterio__Group__1 ;
    public final void rule__Criterio__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:495:1: ( rule__Criterio__Group__0__Impl rule__Criterio__Group__1 )
            // InternalEvaluacion.g:496:2: rule__Criterio__Group__0__Impl rule__Criterio__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Criterio__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Criterio__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Criterio__Group__0"


    // $ANTLR start "rule__Criterio__Group__0__Impl"
    // InternalEvaluacion.g:503:1: rule__Criterio__Group__0__Impl : ( ( rule__Criterio__TypeAssignment_0 ) ) ;
    public final void rule__Criterio__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:507:1: ( ( ( rule__Criterio__TypeAssignment_0 ) ) )
            // InternalEvaluacion.g:508:1: ( ( rule__Criterio__TypeAssignment_0 ) )
            {
            // InternalEvaluacion.g:508:1: ( ( rule__Criterio__TypeAssignment_0 ) )
            // InternalEvaluacion.g:509:2: ( rule__Criterio__TypeAssignment_0 )
            {
             before(grammarAccess.getCriterioAccess().getTypeAssignment_0()); 
            // InternalEvaluacion.g:510:2: ( rule__Criterio__TypeAssignment_0 )
            // InternalEvaluacion.g:510:3: rule__Criterio__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Criterio__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCriterioAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Criterio__Group__0__Impl"


    // $ANTLR start "rule__Criterio__Group__1"
    // InternalEvaluacion.g:518:1: rule__Criterio__Group__1 : rule__Criterio__Group__1__Impl rule__Criterio__Group__2 ;
    public final void rule__Criterio__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:522:1: ( rule__Criterio__Group__1__Impl rule__Criterio__Group__2 )
            // InternalEvaluacion.g:523:2: rule__Criterio__Group__1__Impl rule__Criterio__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Criterio__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Criterio__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Criterio__Group__1"


    // $ANTLR start "rule__Criterio__Group__1__Impl"
    // InternalEvaluacion.g:530:1: rule__Criterio__Group__1__Impl : ( ( rule__Criterio__NameAssignment_1 ) ) ;
    public final void rule__Criterio__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:534:1: ( ( ( rule__Criterio__NameAssignment_1 ) ) )
            // InternalEvaluacion.g:535:1: ( ( rule__Criterio__NameAssignment_1 ) )
            {
            // InternalEvaluacion.g:535:1: ( ( rule__Criterio__NameAssignment_1 ) )
            // InternalEvaluacion.g:536:2: ( rule__Criterio__NameAssignment_1 )
            {
             before(grammarAccess.getCriterioAccess().getNameAssignment_1()); 
            // InternalEvaluacion.g:537:2: ( rule__Criterio__NameAssignment_1 )
            // InternalEvaluacion.g:537:3: rule__Criterio__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Criterio__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCriterioAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Criterio__Group__1__Impl"


    // $ANTLR start "rule__Criterio__Group__2"
    // InternalEvaluacion.g:545:1: rule__Criterio__Group__2 : rule__Criterio__Group__2__Impl ;
    public final void rule__Criterio__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:549:1: ( rule__Criterio__Group__2__Impl )
            // InternalEvaluacion.g:550:2: rule__Criterio__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Criterio__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Criterio__Group__2"


    // $ANTLR start "rule__Criterio__Group__2__Impl"
    // InternalEvaluacion.g:556:1: rule__Criterio__Group__2__Impl : ( ';' ) ;
    public final void rule__Criterio__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:560:1: ( ( ';' ) )
            // InternalEvaluacion.g:561:1: ( ';' )
            {
            // InternalEvaluacion.g:561:1: ( ';' )
            // InternalEvaluacion.g:562:2: ';'
            {
             before(grammarAccess.getCriterioAccess().getSemicolonKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCriterioAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Criterio__Group__2__Impl"


    // $ANTLR start "rule__CriterioType__Group__0"
    // InternalEvaluacion.g:572:1: rule__CriterioType__Group__0 : rule__CriterioType__Group__0__Impl rule__CriterioType__Group__1 ;
    public final void rule__CriterioType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:576:1: ( rule__CriterioType__Group__0__Impl rule__CriterioType__Group__1 )
            // InternalEvaluacion.g:577:2: rule__CriterioType__Group__0__Impl rule__CriterioType__Group__1
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
    // InternalEvaluacion.g:584:1: rule__CriterioType__Group__0__Impl : ( ( rule__CriterioType__ElementTypeAssignment_0 ) ) ;
    public final void rule__CriterioType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:588:1: ( ( ( rule__CriterioType__ElementTypeAssignment_0 ) ) )
            // InternalEvaluacion.g:589:1: ( ( rule__CriterioType__ElementTypeAssignment_0 ) )
            {
            // InternalEvaluacion.g:589:1: ( ( rule__CriterioType__ElementTypeAssignment_0 ) )
            // InternalEvaluacion.g:590:2: ( rule__CriterioType__ElementTypeAssignment_0 )
            {
             before(grammarAccess.getCriterioTypeAccess().getElementTypeAssignment_0()); 
            // InternalEvaluacion.g:591:2: ( rule__CriterioType__ElementTypeAssignment_0 )
            // InternalEvaluacion.g:591:3: rule__CriterioType__ElementTypeAssignment_0
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
    // InternalEvaluacion.g:599:1: rule__CriterioType__Group__1 : rule__CriterioType__Group__1__Impl ;
    public final void rule__CriterioType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:603:1: ( rule__CriterioType__Group__1__Impl )
            // InternalEvaluacion.g:604:2: rule__CriterioType__Group__1__Impl
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
    // InternalEvaluacion.g:610:1: rule__CriterioType__Group__1__Impl : ( ( rule__CriterioType__Group_1__0 )? ) ;
    public final void rule__CriterioType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:614:1: ( ( ( rule__CriterioType__Group_1__0 )? ) )
            // InternalEvaluacion.g:615:1: ( ( rule__CriterioType__Group_1__0 )? )
            {
            // InternalEvaluacion.g:615:1: ( ( rule__CriterioType__Group_1__0 )? )
            // InternalEvaluacion.g:616:2: ( rule__CriterioType__Group_1__0 )?
            {
             before(grammarAccess.getCriterioTypeAccess().getGroup_1()); 
            // InternalEvaluacion.g:617:2: ( rule__CriterioType__Group_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEvaluacion.g:617:3: rule__CriterioType__Group_1__0
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
    // InternalEvaluacion.g:626:1: rule__CriterioType__Group_1__0 : rule__CriterioType__Group_1__0__Impl rule__CriterioType__Group_1__1 ;
    public final void rule__CriterioType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:630:1: ( rule__CriterioType__Group_1__0__Impl rule__CriterioType__Group_1__1 )
            // InternalEvaluacion.g:631:2: rule__CriterioType__Group_1__0__Impl rule__CriterioType__Group_1__1
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
    // InternalEvaluacion.g:638:1: rule__CriterioType__Group_1__0__Impl : ( ( rule__CriterioType__ArrayAssignment_1_0 ) ) ;
    public final void rule__CriterioType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:642:1: ( ( ( rule__CriterioType__ArrayAssignment_1_0 ) ) )
            // InternalEvaluacion.g:643:1: ( ( rule__CriterioType__ArrayAssignment_1_0 ) )
            {
            // InternalEvaluacion.g:643:1: ( ( rule__CriterioType__ArrayAssignment_1_0 ) )
            // InternalEvaluacion.g:644:2: ( rule__CriterioType__ArrayAssignment_1_0 )
            {
             before(grammarAccess.getCriterioTypeAccess().getArrayAssignment_1_0()); 
            // InternalEvaluacion.g:645:2: ( rule__CriterioType__ArrayAssignment_1_0 )
            // InternalEvaluacion.g:645:3: rule__CriterioType__ArrayAssignment_1_0
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
    // InternalEvaluacion.g:653:1: rule__CriterioType__Group_1__1 : rule__CriterioType__Group_1__1__Impl rule__CriterioType__Group_1__2 ;
    public final void rule__CriterioType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:657:1: ( rule__CriterioType__Group_1__1__Impl rule__CriterioType__Group_1__2 )
            // InternalEvaluacion.g:658:2: rule__CriterioType__Group_1__1__Impl rule__CriterioType__Group_1__2
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
    // InternalEvaluacion.g:665:1: rule__CriterioType__Group_1__1__Impl : ( ( rule__CriterioType__LengthAssignment_1_1 )? ) ;
    public final void rule__CriterioType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:669:1: ( ( ( rule__CriterioType__LengthAssignment_1_1 )? ) )
            // InternalEvaluacion.g:670:1: ( ( rule__CriterioType__LengthAssignment_1_1 )? )
            {
            // InternalEvaluacion.g:670:1: ( ( rule__CriterioType__LengthAssignment_1_1 )? )
            // InternalEvaluacion.g:671:2: ( rule__CriterioType__LengthAssignment_1_1 )?
            {
             before(grammarAccess.getCriterioTypeAccess().getLengthAssignment_1_1()); 
            // InternalEvaluacion.g:672:2: ( rule__CriterioType__LengthAssignment_1_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEvaluacion.g:672:3: rule__CriterioType__LengthAssignment_1_1
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
    // InternalEvaluacion.g:680:1: rule__CriterioType__Group_1__2 : rule__CriterioType__Group_1__2__Impl ;
    public final void rule__CriterioType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:684:1: ( rule__CriterioType__Group_1__2__Impl )
            // InternalEvaluacion.g:685:2: rule__CriterioType__Group_1__2__Impl
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
    // InternalEvaluacion.g:691:1: rule__CriterioType__Group_1__2__Impl : ( ']' ) ;
    public final void rule__CriterioType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:695:1: ( ( ']' ) )
            // InternalEvaluacion.g:696:1: ( ']' )
            {
            // InternalEvaluacion.g:696:1: ( ']' )
            // InternalEvaluacion.g:697:2: ']'
            {
             before(grammarAccess.getCriterioTypeAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,19,FOLLOW_2); 
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
    // InternalEvaluacion.g:707:1: rule__Model__EntitiesAssignment : ( ruleCmpnntEvaluacion ) ;
    public final void rule__Model__EntitiesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:711:1: ( ( ruleCmpnntEvaluacion ) )
            // InternalEvaluacion.g:712:2: ( ruleCmpnntEvaluacion )
            {
            // InternalEvaluacion.g:712:2: ( ruleCmpnntEvaluacion )
            // InternalEvaluacion.g:713:3: ruleCmpnntEvaluacion
            {
             before(grammarAccess.getModelAccess().getEntitiesCmpnntEvaluacionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleCmpnntEvaluacion();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEntitiesCmpnntEvaluacionParserRuleCall_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__CmpnntEvaluacion__NameAssignment_1"
    // InternalEvaluacion.g:722:1: rule__CmpnntEvaluacion__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CmpnntEvaluacion__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:726:1: ( ( RULE_ID ) )
            // InternalEvaluacion.g:727:2: ( RULE_ID )
            {
            // InternalEvaluacion.g:727:2: ( RULE_ID )
            // InternalEvaluacion.g:728:3: RULE_ID
            {
             before(grammarAccess.getCmpnntEvaluacionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCmpnntEvaluacionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmpnntEvaluacion__NameAssignment_1"


    // $ANTLR start "rule__CmpnntEvaluacion__SuperTypeAssignment_2_1"
    // InternalEvaluacion.g:737:1: rule__CmpnntEvaluacion__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__CmpnntEvaluacion__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:741:1: ( ( ( RULE_ID ) ) )
            // InternalEvaluacion.g:742:2: ( ( RULE_ID ) )
            {
            // InternalEvaluacion.g:742:2: ( ( RULE_ID ) )
            // InternalEvaluacion.g:743:3: ( RULE_ID )
            {
             before(grammarAccess.getCmpnntEvaluacionAccess().getSuperTypeCmpnntEvaluacionCrossReference_2_1_0()); 
            // InternalEvaluacion.g:744:3: ( RULE_ID )
            // InternalEvaluacion.g:745:4: RULE_ID
            {
             before(grammarAccess.getCmpnntEvaluacionAccess().getSuperTypeCmpnntEvaluacionIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCmpnntEvaluacionAccess().getSuperTypeCmpnntEvaluacionIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getCmpnntEvaluacionAccess().getSuperTypeCmpnntEvaluacionCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmpnntEvaluacion__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__CmpnntEvaluacion__AttributesAssignment_4"
    // InternalEvaluacion.g:756:1: rule__CmpnntEvaluacion__AttributesAssignment_4 : ( ruleCriterio ) ;
    public final void rule__CmpnntEvaluacion__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:760:1: ( ( ruleCriterio ) )
            // InternalEvaluacion.g:761:2: ( ruleCriterio )
            {
            // InternalEvaluacion.g:761:2: ( ruleCriterio )
            // InternalEvaluacion.g:762:3: ruleCriterio
            {
             before(grammarAccess.getCmpnntEvaluacionAccess().getAttributesCriterioParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCriterio();

            state._fsp--;

             after(grammarAccess.getCmpnntEvaluacionAccess().getAttributesCriterioParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmpnntEvaluacion__AttributesAssignment_4"


    // $ANTLR start "rule__Criterio__TypeAssignment_0"
    // InternalEvaluacion.g:771:1: rule__Criterio__TypeAssignment_0 : ( ruleCriterioType ) ;
    public final void rule__Criterio__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:775:1: ( ( ruleCriterioType ) )
            // InternalEvaluacion.g:776:2: ( ruleCriterioType )
            {
            // InternalEvaluacion.g:776:2: ( ruleCriterioType )
            // InternalEvaluacion.g:777:3: ruleCriterioType
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


    // $ANTLR start "rule__Criterio__NameAssignment_1"
    // InternalEvaluacion.g:786:1: rule__Criterio__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Criterio__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:790:1: ( ( RULE_ID ) )
            // InternalEvaluacion.g:791:2: ( RULE_ID )
            {
            // InternalEvaluacion.g:791:2: ( RULE_ID )
            // InternalEvaluacion.g:792:3: RULE_ID
            {
             before(grammarAccess.getCriterioAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCriterioAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Criterio__NameAssignment_1"


    // $ANTLR start "rule__CriterioType__ElementTypeAssignment_0"
    // InternalEvaluacion.g:801:1: rule__CriterioType__ElementTypeAssignment_0 : ( ruleElementType ) ;
    public final void rule__CriterioType__ElementTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:805:1: ( ( ruleElementType ) )
            // InternalEvaluacion.g:806:2: ( ruleElementType )
            {
            // InternalEvaluacion.g:806:2: ( ruleElementType )
            // InternalEvaluacion.g:807:3: ruleElementType
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
    // InternalEvaluacion.g:816:1: rule__CriterioType__ArrayAssignment_1_0 : ( ( '[' ) ) ;
    public final void rule__CriterioType__ArrayAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:820:1: ( ( ( '[' ) ) )
            // InternalEvaluacion.g:821:2: ( ( '[' ) )
            {
            // InternalEvaluacion.g:821:2: ( ( '[' ) )
            // InternalEvaluacion.g:822:3: ( '[' )
            {
             before(grammarAccess.getCriterioTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 
            // InternalEvaluacion.g:823:3: ( '[' )
            // InternalEvaluacion.g:824:4: '['
            {
             before(grammarAccess.getCriterioTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalEvaluacion.g:835:1: rule__CriterioType__LengthAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__CriterioType__LengthAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:839:1: ( ( RULE_INT ) )
            // InternalEvaluacion.g:840:2: ( RULE_INT )
            {
            // InternalEvaluacion.g:840:2: ( RULE_INT )
            // InternalEvaluacion.g:841:3: RULE_INT
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


    // $ANTLR start "rule__BasicType__TypeNameAssignment"
    // InternalEvaluacion.g:850:1: rule__BasicType__TypeNameAssignment : ( ( rule__BasicType__TypeNameAlternatives_0 ) ) ;
    public final void rule__BasicType__TypeNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:854:1: ( ( ( rule__BasicType__TypeNameAlternatives_0 ) ) )
            // InternalEvaluacion.g:855:2: ( ( rule__BasicType__TypeNameAlternatives_0 ) )
            {
            // InternalEvaluacion.g:855:2: ( ( rule__BasicType__TypeNameAlternatives_0 ) )
            // InternalEvaluacion.g:856:3: ( rule__BasicType__TypeNameAlternatives_0 )
            {
             before(grammarAccess.getBasicTypeAccess().getTypeNameAlternatives_0()); 
            // InternalEvaluacion.g:857:3: ( rule__BasicType__TypeNameAlternatives_0 )
            // InternalEvaluacion.g:857:4: rule__BasicType__TypeNameAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__BasicType__TypeNameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getBasicTypeAccess().getTypeNameAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicType__TypeNameAssignment"


    // $ANTLR start "rule__ComponenteType__EntityAssignment"
    // InternalEvaluacion.g:865:1: rule__ComponenteType__EntityAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ComponenteType__EntityAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvaluacion.g:869:1: ( ( ( RULE_ID ) ) )
            // InternalEvaluacion.g:870:2: ( ( RULE_ID ) )
            {
            // InternalEvaluacion.g:870:2: ( ( RULE_ID ) )
            // InternalEvaluacion.g:871:3: ( RULE_ID )
            {
             before(grammarAccess.getComponenteTypeAccess().getEntityCmpnntEvaluacionCrossReference_0()); 
            // InternalEvaluacion.g:872:3: ( RULE_ID )
            // InternalEvaluacion.g:873:4: RULE_ID
            {
             before(grammarAccess.getComponenteTypeAccess().getEntityCmpnntEvaluacionIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponenteTypeAccess().getEntityCmpnntEvaluacionIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getComponenteTypeAccess().getEntityCmpnntEvaluacionCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponenteType__EntityAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000013810L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000003812L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080020L});

}