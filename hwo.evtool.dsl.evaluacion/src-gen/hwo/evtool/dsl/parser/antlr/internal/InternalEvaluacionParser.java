package hwo.evtool.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import hwo.evtool.dsl.services.EvaluacionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEvaluacionParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'eventos'", "'resetEvents'", "'evaluaciones'", "':'", "'tipo'", "'problema'", "'tecnica'", "'calificacion'", "'A'", "'M'", "'B'", "'/'", "'componente'", "'actions'", "'{'", "'}'", "'=>'"
    };
    public static final int RULE_STRING=5;
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
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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

        public InternalEvaluacionParser(TokenStream input, EvaluacionGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MaquinaEstados";
       	}

       	@Override
       	protected EvaluacionGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMaquinaEstados"
    // InternalEvaluacion.g:64:1: entryRuleMaquinaEstados returns [EObject current=null] : iv_ruleMaquinaEstados= ruleMaquinaEstados EOF ;
    public final EObject entryRuleMaquinaEstados() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaquinaEstados = null;


        try {
            // InternalEvaluacion.g:64:55: (iv_ruleMaquinaEstados= ruleMaquinaEstados EOF )
            // InternalEvaluacion.g:65:2: iv_ruleMaquinaEstados= ruleMaquinaEstados EOF
            {
             newCompositeNode(grammarAccess.getMaquinaEstadosRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaquinaEstados=ruleMaquinaEstados();

            state._fsp--;

             current =iv_ruleMaquinaEstados; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaquinaEstados"


    // $ANTLR start "ruleMaquinaEstados"
    // InternalEvaluacion.g:71:1: ruleMaquinaEstados returns [EObject current=null] : ( () (otherlv_1= 'eventos' ( (lv_events_2_0= ruleEvento ) )+ )? (otherlv_3= 'resetEvents' ( (otherlv_4= RULE_ID ) )+ )? (otherlv_5= 'evaluaciones' ( (lv_commands_6_0= ruleEvaluaciones ) )+ )? ( (lv_states_7_0= ruleComponente ) )* ) ;
    public final EObject ruleMaquinaEstados() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_events_2_0 = null;

        EObject lv_commands_6_0 = null;

        EObject lv_states_7_0 = null;



        	enterRule();

        try {
            // InternalEvaluacion.g:77:2: ( ( () (otherlv_1= 'eventos' ( (lv_events_2_0= ruleEvento ) )+ )? (otherlv_3= 'resetEvents' ( (otherlv_4= RULE_ID ) )+ )? (otherlv_5= 'evaluaciones' ( (lv_commands_6_0= ruleEvaluaciones ) )+ )? ( (lv_states_7_0= ruleComponente ) )* ) )
            // InternalEvaluacion.g:78:2: ( () (otherlv_1= 'eventos' ( (lv_events_2_0= ruleEvento ) )+ )? (otherlv_3= 'resetEvents' ( (otherlv_4= RULE_ID ) )+ )? (otherlv_5= 'evaluaciones' ( (lv_commands_6_0= ruleEvaluaciones ) )+ )? ( (lv_states_7_0= ruleComponente ) )* )
            {
            // InternalEvaluacion.g:78:2: ( () (otherlv_1= 'eventos' ( (lv_events_2_0= ruleEvento ) )+ )? (otherlv_3= 'resetEvents' ( (otherlv_4= RULE_ID ) )+ )? (otherlv_5= 'evaluaciones' ( (lv_commands_6_0= ruleEvaluaciones ) )+ )? ( (lv_states_7_0= ruleComponente ) )* )
            // InternalEvaluacion.g:79:3: () (otherlv_1= 'eventos' ( (lv_events_2_0= ruleEvento ) )+ )? (otherlv_3= 'resetEvents' ( (otherlv_4= RULE_ID ) )+ )? (otherlv_5= 'evaluaciones' ( (lv_commands_6_0= ruleEvaluaciones ) )+ )? ( (lv_states_7_0= ruleComponente ) )*
            {
            // InternalEvaluacion.g:79:3: ()
            // InternalEvaluacion.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMaquinaEstadosAccess().getMaquinaEstadosAction_0(),
            					current);
            			

            }

            // InternalEvaluacion.g:86:3: (otherlv_1= 'eventos' ( (lv_events_2_0= ruleEvento ) )+ )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalEvaluacion.g:87:4: otherlv_1= 'eventos' ( (lv_events_2_0= ruleEvento ) )+
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getMaquinaEstadosAccess().getEventosKeyword_1_0());
                    			
                    // InternalEvaluacion.g:91:4: ( (lv_events_2_0= ruleEvento ) )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_ID) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalEvaluacion.g:92:5: (lv_events_2_0= ruleEvento )
                    	    {
                    	    // InternalEvaluacion.g:92:5: (lv_events_2_0= ruleEvento )
                    	    // InternalEvaluacion.g:93:6: lv_events_2_0= ruleEvento
                    	    {

                    	    						newCompositeNode(grammarAccess.getMaquinaEstadosAccess().getEventsEventoParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_4);
                    	    lv_events_2_0=ruleEvento();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMaquinaEstadosRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"events",
                    	    							lv_events_2_0,
                    	    							"hwo.evtool.dsl.Evaluacion.Evento");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);


                    }
                    break;

            }

            // InternalEvaluacion.g:111:3: (otherlv_3= 'resetEvents' ( (otherlv_4= RULE_ID ) )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEvaluacion.g:112:4: otherlv_3= 'resetEvents' ( (otherlv_4= RULE_ID ) )+
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMaquinaEstadosAccess().getResetEventsKeyword_2_0());
                    			
                    // InternalEvaluacion.g:116:4: ( (otherlv_4= RULE_ID ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalEvaluacion.g:117:5: (otherlv_4= RULE_ID )
                    	    {
                    	    // InternalEvaluacion.g:117:5: (otherlv_4= RULE_ID )
                    	    // InternalEvaluacion.g:118:6: otherlv_4= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getMaquinaEstadosRule());
                    	    						}
                    	    					
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_5); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getMaquinaEstadosAccess().getResetEventsEventoCrossReference_2_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;

            }

            // InternalEvaluacion.g:130:3: (otherlv_5= 'evaluaciones' ( (lv_commands_6_0= ruleEvaluaciones ) )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEvaluacion.g:131:4: otherlv_5= 'evaluaciones' ( (lv_commands_6_0= ruleEvaluaciones ) )+
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getMaquinaEstadosAccess().getEvaluacionesKeyword_3_0());
                    			
                    // InternalEvaluacion.g:135:4: ( (lv_commands_6_0= ruleEvaluaciones ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalEvaluacion.g:136:5: (lv_commands_6_0= ruleEvaluaciones )
                    	    {
                    	    // InternalEvaluacion.g:136:5: (lv_commands_6_0= ruleEvaluaciones )
                    	    // InternalEvaluacion.g:137:6: lv_commands_6_0= ruleEvaluaciones
                    	    {

                    	    						newCompositeNode(grammarAccess.getMaquinaEstadosAccess().getCommandsEvaluacionesParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_commands_6_0=ruleEvaluaciones();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMaquinaEstadosRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"commands",
                    	    							lv_commands_6_0,
                    	    							"hwo.evtool.dsl.Evaluacion.Evaluaciones");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }
                    break;

            }

            // InternalEvaluacion.g:155:3: ( (lv_states_7_0= ruleComponente ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEvaluacion.g:156:4: (lv_states_7_0= ruleComponente )
            	    {
            	    // InternalEvaluacion.g:156:4: (lv_states_7_0= ruleComponente )
            	    // InternalEvaluacion.g:157:5: lv_states_7_0= ruleComponente
            	    {

            	    					newCompositeNode(grammarAccess.getMaquinaEstadosAccess().getStatesComponenteParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_states_7_0=ruleComponente();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMaquinaEstadosRule());
            	    					}
            	    					add(
            	    						current,
            	    						"states",
            	    						lv_states_7_0,
            	    						"hwo.evtool.dsl.Evaluacion.Componente");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaquinaEstados"


    // $ANTLR start "entryRuleEvento"
    // InternalEvaluacion.g:178:1: entryRuleEvento returns [EObject current=null] : iv_ruleEvento= ruleEvento EOF ;
    public final EObject entryRuleEvento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvento = null;


        try {
            // InternalEvaluacion.g:178:47: (iv_ruleEvento= ruleEvento EOF )
            // InternalEvaluacion.g:179:2: iv_ruleEvento= ruleEvento EOF
            {
             newCompositeNode(grammarAccess.getEventoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvento=ruleEvento();

            state._fsp--;

             current =iv_ruleEvento; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvento"


    // $ANTLR start "ruleEvento"
    // InternalEvaluacion.g:185:1: ruleEvento returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEvento() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_code_1_0=null;


        	enterRule();

        try {
            // InternalEvaluacion.g:191:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) ) )
            // InternalEvaluacion.g:192:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) )
            {
            // InternalEvaluacion.g:192:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) )
            // InternalEvaluacion.g:193:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) )
            {
            // InternalEvaluacion.g:193:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalEvaluacion.g:194:4: (lv_name_0_0= RULE_ID )
            {
            // InternalEvaluacion.g:194:4: (lv_name_0_0= RULE_ID )
            // InternalEvaluacion.g:195:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEventoAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalEvaluacion.g:211:3: ( (lv_code_1_0= RULE_ID ) )
            // InternalEvaluacion.g:212:4: (lv_code_1_0= RULE_ID )
            {
            // InternalEvaluacion.g:212:4: (lv_code_1_0= RULE_ID )
            // InternalEvaluacion.g:213:5: lv_code_1_0= RULE_ID
            {
            lv_code_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_code_1_0, grammarAccess.getEventoAccess().getCodeIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"code",
            						lv_code_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvento"


    // $ANTLR start "entryRuleEvaluaciones"
    // InternalEvaluacion.g:233:1: entryRuleEvaluaciones returns [EObject current=null] : iv_ruleEvaluaciones= ruleEvaluaciones EOF ;
    public final EObject entryRuleEvaluaciones() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluaciones = null;


        try {
            // InternalEvaluacion.g:233:53: (iv_ruleEvaluaciones= ruleEvaluaciones EOF )
            // InternalEvaluacion.g:234:2: iv_ruleEvaluaciones= ruleEvaluaciones EOF
            {
             newCompositeNode(grammarAccess.getEvaluacionesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvaluaciones=ruleEvaluaciones();

            state._fsp--;

             current =iv_ruleEvaluaciones; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvaluaciones"


    // $ANTLR start "ruleEvaluaciones"
    // InternalEvaluacion.g:240:1: ruleEvaluaciones returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_argumento_1_0= ruleAtomo ) ) (otherlv_2= ':' ( (lv_comentario_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleEvaluaciones() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token lv_comentario_3_0=null;
        EObject lv_argumento_1_0 = null;



        	enterRule();

        try {
            // InternalEvaluacion.g:246:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_argumento_1_0= ruleAtomo ) ) (otherlv_2= ':' ( (lv_comentario_3_0= RULE_STRING ) ) )? ) )
            // InternalEvaluacion.g:247:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_argumento_1_0= ruleAtomo ) ) (otherlv_2= ':' ( (lv_comentario_3_0= RULE_STRING ) ) )? )
            {
            // InternalEvaluacion.g:247:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_argumento_1_0= ruleAtomo ) ) (otherlv_2= ':' ( (lv_comentario_3_0= RULE_STRING ) ) )? )
            // InternalEvaluacion.g:248:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_argumento_1_0= ruleAtomo ) ) (otherlv_2= ':' ( (lv_comentario_3_0= RULE_STRING ) ) )?
            {
            // InternalEvaluacion.g:248:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalEvaluacion.g:249:4: (lv_name_0_0= RULE_ID )
            {
            // InternalEvaluacion.g:249:4: (lv_name_0_0= RULE_ID )
            // InternalEvaluacion.g:250:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEvaluacionesAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvaluacionesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalEvaluacion.g:266:3: ( (lv_argumento_1_0= ruleAtomo ) )
            // InternalEvaluacion.g:267:4: (lv_argumento_1_0= ruleAtomo )
            {
            // InternalEvaluacion.g:267:4: (lv_argumento_1_0= ruleAtomo )
            // InternalEvaluacion.g:268:5: lv_argumento_1_0= ruleAtomo
            {

            					newCompositeNode(grammarAccess.getEvaluacionesAccess().getArgumentoAtomoParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_argumento_1_0=ruleAtomo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvaluacionesRule());
            					}
            					set(
            						current,
            						"argumento",
            						lv_argumento_1_0,
            						"hwo.evtool.dsl.Evaluacion.Atomo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEvaluacion.g:285:3: (otherlv_2= ':' ( (lv_comentario_3_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalEvaluacion.g:286:4: otherlv_2= ':' ( (lv_comentario_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getEvaluacionesAccess().getColonKeyword_2_0());
                    			
                    // InternalEvaluacion.g:290:4: ( (lv_comentario_3_0= RULE_STRING ) )
                    // InternalEvaluacion.g:291:5: (lv_comentario_3_0= RULE_STRING )
                    {
                    // InternalEvaluacion.g:291:5: (lv_comentario_3_0= RULE_STRING )
                    // InternalEvaluacion.g:292:6: lv_comentario_3_0= RULE_STRING
                    {
                    lv_comentario_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_comentario_3_0, grammarAccess.getEvaluacionesAccess().getComentarioSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvaluacionesRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"comentario",
                    							lv_comentario_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvaluaciones"


    // $ANTLR start "entryRuleAtomo"
    // InternalEvaluacion.g:313:1: entryRuleAtomo returns [EObject current=null] : iv_ruleAtomo= ruleAtomo EOF ;
    public final EObject entryRuleAtomo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomo = null;


        try {
            // InternalEvaluacion.g:313:46: (iv_ruleAtomo= ruleAtomo EOF )
            // InternalEvaluacion.g:314:2: iv_ruleAtomo= ruleAtomo EOF
            {
             newCompositeNode(grammarAccess.getAtomoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomo=ruleAtomo();

            state._fsp--;

             current =iv_ruleAtomo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomo"


    // $ANTLR start "ruleAtomo"
    // InternalEvaluacion.g:320:1: ruleAtomo returns [EObject current=null] : ( ( () ( (lv_valor_1_0= rulePuntuacion ) ) ) | ( () ( (lv_valor_3_0= ruleItemPropuesta ) ) ) ) ;
    public final EObject ruleAtomo() throws RecognitionException {
        EObject current = null;

        EObject lv_valor_1_0 = null;

        EObject lv_valor_3_0 = null;



        	enterRule();

        try {
            // InternalEvaluacion.g:326:2: ( ( ( () ( (lv_valor_1_0= rulePuntuacion ) ) ) | ( () ( (lv_valor_3_0= ruleItemPropuesta ) ) ) ) )
            // InternalEvaluacion.g:327:2: ( ( () ( (lv_valor_1_0= rulePuntuacion ) ) ) | ( () ( (lv_valor_3_0= ruleItemPropuesta ) ) ) )
            {
            // InternalEvaluacion.g:327:2: ( ( () ( (lv_valor_1_0= rulePuntuacion ) ) ) | ( () ( (lv_valor_3_0= ruleItemPropuesta ) ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            else if ( (LA9_0==15) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalEvaluacion.g:328:3: ( () ( (lv_valor_1_0= rulePuntuacion ) ) )
                    {
                    // InternalEvaluacion.g:328:3: ( () ( (lv_valor_1_0= rulePuntuacion ) ) )
                    // InternalEvaluacion.g:329:4: () ( (lv_valor_1_0= rulePuntuacion ) )
                    {
                    // InternalEvaluacion.g:329:4: ()
                    // InternalEvaluacion.g:330:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomoAccess().getIntConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalEvaluacion.g:336:4: ( (lv_valor_1_0= rulePuntuacion ) )
                    // InternalEvaluacion.g:337:5: (lv_valor_1_0= rulePuntuacion )
                    {
                    // InternalEvaluacion.g:337:5: (lv_valor_1_0= rulePuntuacion )
                    // InternalEvaluacion.g:338:6: lv_valor_1_0= rulePuntuacion
                    {

                    						newCompositeNode(grammarAccess.getAtomoAccess().getValorPuntuacionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_valor_1_0=rulePuntuacion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomoRule());
                    						}
                    						set(
                    							current,
                    							"valor",
                    							lv_valor_1_0,
                    							"hwo.evtool.dsl.Evaluacion.Puntuacion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEvaluacion.g:357:3: ( () ( (lv_valor_3_0= ruleItemPropuesta ) ) )
                    {
                    // InternalEvaluacion.g:357:3: ( () ( (lv_valor_3_0= ruleItemPropuesta ) ) )
                    // InternalEvaluacion.g:358:4: () ( (lv_valor_3_0= ruleItemPropuesta ) )
                    {
                    // InternalEvaluacion.g:358:4: ()
                    // InternalEvaluacion.g:359:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomoAccess().getProptConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalEvaluacion.g:365:4: ( (lv_valor_3_0= ruleItemPropuesta ) )
                    // InternalEvaluacion.g:366:5: (lv_valor_3_0= ruleItemPropuesta )
                    {
                    // InternalEvaluacion.g:366:5: (lv_valor_3_0= ruleItemPropuesta )
                    // InternalEvaluacion.g:367:6: lv_valor_3_0= ruleItemPropuesta
                    {

                    						newCompositeNode(grammarAccess.getAtomoAccess().getValorItemPropuestaParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_valor_3_0=ruleItemPropuesta();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomoRule());
                    						}
                    						set(
                    							current,
                    							"valor",
                    							lv_valor_3_0,
                    							"hwo.evtool.dsl.Evaluacion.ItemPropuesta");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomo"


    // $ANTLR start "entryRuleItemPropuesta"
    // InternalEvaluacion.g:389:1: entryRuleItemPropuesta returns [EObject current=null] : iv_ruleItemPropuesta= ruleItemPropuesta EOF ;
    public final EObject entryRuleItemPropuesta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemPropuesta = null;


        try {
            // InternalEvaluacion.g:389:54: (iv_ruleItemPropuesta= ruleItemPropuesta EOF )
            // InternalEvaluacion.g:390:2: iv_ruleItemPropuesta= ruleItemPropuesta EOF
            {
             newCompositeNode(grammarAccess.getItemPropuestaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItemPropuesta=ruleItemPropuesta();

            state._fsp--;

             current =iv_ruleItemPropuesta; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleItemPropuesta"


    // $ANTLR start "ruleItemPropuesta"
    // InternalEvaluacion.g:396:1: ruleItemPropuesta returns [EObject current=null] : (otherlv_0= 'tipo' otherlv_1= ':' ( ( (lv_tipo_2_1= 'problema' | lv_tipo_2_2= 'tecnica' ) ) ) otherlv_3= 'calificacion' otherlv_4= ':' ( ( (lv_calificacion_5_1= 'A' | lv_calificacion_5_2= 'M' | lv_calificacion_5_3= 'B' ) ) ) ) ;
    public final EObject ruleItemPropuesta() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_tipo_2_1=null;
        Token lv_tipo_2_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_calificacion_5_1=null;
        Token lv_calificacion_5_2=null;
        Token lv_calificacion_5_3=null;


        	enterRule();

        try {
            // InternalEvaluacion.g:402:2: ( (otherlv_0= 'tipo' otherlv_1= ':' ( ( (lv_tipo_2_1= 'problema' | lv_tipo_2_2= 'tecnica' ) ) ) otherlv_3= 'calificacion' otherlv_4= ':' ( ( (lv_calificacion_5_1= 'A' | lv_calificacion_5_2= 'M' | lv_calificacion_5_3= 'B' ) ) ) ) )
            // InternalEvaluacion.g:403:2: (otherlv_0= 'tipo' otherlv_1= ':' ( ( (lv_tipo_2_1= 'problema' | lv_tipo_2_2= 'tecnica' ) ) ) otherlv_3= 'calificacion' otherlv_4= ':' ( ( (lv_calificacion_5_1= 'A' | lv_calificacion_5_2= 'M' | lv_calificacion_5_3= 'B' ) ) ) )
            {
            // InternalEvaluacion.g:403:2: (otherlv_0= 'tipo' otherlv_1= ':' ( ( (lv_tipo_2_1= 'problema' | lv_tipo_2_2= 'tecnica' ) ) ) otherlv_3= 'calificacion' otherlv_4= ':' ( ( (lv_calificacion_5_1= 'A' | lv_calificacion_5_2= 'M' | lv_calificacion_5_3= 'B' ) ) ) )
            // InternalEvaluacion.g:404:3: otherlv_0= 'tipo' otherlv_1= ':' ( ( (lv_tipo_2_1= 'problema' | lv_tipo_2_2= 'tecnica' ) ) ) otherlv_3= 'calificacion' otherlv_4= ':' ( ( (lv_calificacion_5_1= 'A' | lv_calificacion_5_2= 'M' | lv_calificacion_5_3= 'B' ) ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getItemPropuestaAccess().getTipoKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getItemPropuestaAccess().getColonKeyword_1());
            		
            // InternalEvaluacion.g:412:3: ( ( (lv_tipo_2_1= 'problema' | lv_tipo_2_2= 'tecnica' ) ) )
            // InternalEvaluacion.g:413:4: ( (lv_tipo_2_1= 'problema' | lv_tipo_2_2= 'tecnica' ) )
            {
            // InternalEvaluacion.g:413:4: ( (lv_tipo_2_1= 'problema' | lv_tipo_2_2= 'tecnica' ) )
            // InternalEvaluacion.g:414:5: (lv_tipo_2_1= 'problema' | lv_tipo_2_2= 'tecnica' )
            {
            // InternalEvaluacion.g:414:5: (lv_tipo_2_1= 'problema' | lv_tipo_2_2= 'tecnica' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            else if ( (LA10_0==17) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalEvaluacion.g:415:6: lv_tipo_2_1= 'problema'
                    {
                    lv_tipo_2_1=(Token)match(input,16,FOLLOW_13); 

                    						newLeafNode(lv_tipo_2_1, grammarAccess.getItemPropuestaAccess().getTipoProblemaKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getItemPropuestaRule());
                    						}
                    						setWithLastConsumed(current, "tipo", lv_tipo_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalEvaluacion.g:426:6: lv_tipo_2_2= 'tecnica'
                    {
                    lv_tipo_2_2=(Token)match(input,17,FOLLOW_13); 

                    						newLeafNode(lv_tipo_2_2, grammarAccess.getItemPropuestaAccess().getTipoTecnicaKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getItemPropuestaRule());
                    						}
                    						setWithLastConsumed(current, "tipo", lv_tipo_2_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getItemPropuestaAccess().getCalificacionKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getItemPropuestaAccess().getColonKeyword_4());
            		
            // InternalEvaluacion.g:447:3: ( ( (lv_calificacion_5_1= 'A' | lv_calificacion_5_2= 'M' | lv_calificacion_5_3= 'B' ) ) )
            // InternalEvaluacion.g:448:4: ( (lv_calificacion_5_1= 'A' | lv_calificacion_5_2= 'M' | lv_calificacion_5_3= 'B' ) )
            {
            // InternalEvaluacion.g:448:4: ( (lv_calificacion_5_1= 'A' | lv_calificacion_5_2= 'M' | lv_calificacion_5_3= 'B' ) )
            // InternalEvaluacion.g:449:5: (lv_calificacion_5_1= 'A' | lv_calificacion_5_2= 'M' | lv_calificacion_5_3= 'B' )
            {
            // InternalEvaluacion.g:449:5: (lv_calificacion_5_1= 'A' | lv_calificacion_5_2= 'M' | lv_calificacion_5_3= 'B' )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt11=1;
                }
                break;
            case 20:
                {
                alt11=2;
                }
                break;
            case 21:
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
                    // InternalEvaluacion.g:450:6: lv_calificacion_5_1= 'A'
                    {
                    lv_calificacion_5_1=(Token)match(input,19,FOLLOW_2); 

                    						newLeafNode(lv_calificacion_5_1, grammarAccess.getItemPropuestaAccess().getCalificacionAKeyword_5_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getItemPropuestaRule());
                    						}
                    						setWithLastConsumed(current, "calificacion", lv_calificacion_5_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalEvaluacion.g:461:6: lv_calificacion_5_2= 'M'
                    {
                    lv_calificacion_5_2=(Token)match(input,20,FOLLOW_2); 

                    						newLeafNode(lv_calificacion_5_2, grammarAccess.getItemPropuestaAccess().getCalificacionMKeyword_5_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getItemPropuestaRule());
                    						}
                    						setWithLastConsumed(current, "calificacion", lv_calificacion_5_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalEvaluacion.g:472:6: lv_calificacion_5_3= 'B'
                    {
                    lv_calificacion_5_3=(Token)match(input,21,FOLLOW_2); 

                    						newLeafNode(lv_calificacion_5_3, grammarAccess.getItemPropuestaAccess().getCalificacionBKeyword_5_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getItemPropuestaRule());
                    						}
                    						setWithLastConsumed(current, "calificacion", lv_calificacion_5_3, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleItemPropuesta"


    // $ANTLR start "entryRulePuntuacion"
    // InternalEvaluacion.g:489:1: entryRulePuntuacion returns [EObject current=null] : iv_rulePuntuacion= rulePuntuacion EOF ;
    public final EObject entryRulePuntuacion() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePuntuacion = null;


        try {
            // InternalEvaluacion.g:489:51: (iv_rulePuntuacion= rulePuntuacion EOF )
            // InternalEvaluacion.g:490:2: iv_rulePuntuacion= rulePuntuacion EOF
            {
             newCompositeNode(grammarAccess.getPuntuacionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePuntuacion=rulePuntuacion();

            state._fsp--;

             current =iv_rulePuntuacion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePuntuacion"


    // $ANTLR start "rulePuntuacion"
    // InternalEvaluacion.g:496:1: rulePuntuacion returns [EObject current=null] : ( ( (lv_nota_0_0= RULE_INT ) ) otherlv_1= '/' ( (lv_calificacion_2_0= RULE_INT ) ) ) ;
    public final EObject rulePuntuacion() throws RecognitionException {
        EObject current = null;

        Token lv_nota_0_0=null;
        Token otherlv_1=null;
        Token lv_calificacion_2_0=null;


        	enterRule();

        try {
            // InternalEvaluacion.g:502:2: ( ( ( (lv_nota_0_0= RULE_INT ) ) otherlv_1= '/' ( (lv_calificacion_2_0= RULE_INT ) ) ) )
            // InternalEvaluacion.g:503:2: ( ( (lv_nota_0_0= RULE_INT ) ) otherlv_1= '/' ( (lv_calificacion_2_0= RULE_INT ) ) )
            {
            // InternalEvaluacion.g:503:2: ( ( (lv_nota_0_0= RULE_INT ) ) otherlv_1= '/' ( (lv_calificacion_2_0= RULE_INT ) ) )
            // InternalEvaluacion.g:504:3: ( (lv_nota_0_0= RULE_INT ) ) otherlv_1= '/' ( (lv_calificacion_2_0= RULE_INT ) )
            {
            // InternalEvaluacion.g:504:3: ( (lv_nota_0_0= RULE_INT ) )
            // InternalEvaluacion.g:505:4: (lv_nota_0_0= RULE_INT )
            {
            // InternalEvaluacion.g:505:4: (lv_nota_0_0= RULE_INT )
            // InternalEvaluacion.g:506:5: lv_nota_0_0= RULE_INT
            {
            lv_nota_0_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_nota_0_0, grammarAccess.getPuntuacionAccess().getNotaINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPuntuacionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nota",
            						lv_nota_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getPuntuacionAccess().getSolidusKeyword_1());
            		
            // InternalEvaluacion.g:526:3: ( (lv_calificacion_2_0= RULE_INT ) )
            // InternalEvaluacion.g:527:4: (lv_calificacion_2_0= RULE_INT )
            {
            // InternalEvaluacion.g:527:4: (lv_calificacion_2_0= RULE_INT )
            // InternalEvaluacion.g:528:5: lv_calificacion_2_0= RULE_INT
            {
            lv_calificacion_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_calificacion_2_0, grammarAccess.getPuntuacionAccess().getCalificacionINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPuntuacionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"calificacion",
            						lv_calificacion_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePuntuacion"


    // $ANTLR start "entryRuleComponente"
    // InternalEvaluacion.g:548:1: entryRuleComponente returns [EObject current=null] : iv_ruleComponente= ruleComponente EOF ;
    public final EObject entryRuleComponente() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponente = null;


        try {
            // InternalEvaluacion.g:548:51: (iv_ruleComponente= ruleComponente EOF )
            // InternalEvaluacion.g:549:2: iv_ruleComponente= ruleComponente EOF
            {
             newCompositeNode(grammarAccess.getComponenteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponente=ruleComponente();

            state._fsp--;

             current =iv_ruleComponente; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponente"


    // $ANTLR start "ruleComponente"
    // InternalEvaluacion.g:555:1: ruleComponente returns [EObject current=null] : (otherlv_0= 'componente' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransicion ) )* ) ;
    public final EObject ruleComponente() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_transitions_6_0 = null;



        	enterRule();

        try {
            // InternalEvaluacion.g:561:2: ( (otherlv_0= 'componente' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransicion ) )* ) )
            // InternalEvaluacion.g:562:2: (otherlv_0= 'componente' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransicion ) )* )
            {
            // InternalEvaluacion.g:562:2: (otherlv_0= 'componente' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransicion ) )* )
            // InternalEvaluacion.g:563:3: otherlv_0= 'componente' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransicion ) )*
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponenteAccess().getComponenteKeyword_0());
            		
            // InternalEvaluacion.g:567:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEvaluacion.g:568:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEvaluacion.g:568:4: (lv_name_1_0= RULE_ID )
            // InternalEvaluacion.g:569:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getComponenteAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponenteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalEvaluacion.g:585:3: (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalEvaluacion.g:586:4: otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_18); 

                    				newLeafNode(otherlv_2, grammarAccess.getComponenteAccess().getActionsKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getComponenteAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalEvaluacion.g:594:4: ( (otherlv_4= RULE_ID ) )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ID) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalEvaluacion.g:595:5: (otherlv_4= RULE_ID )
                    	    {
                    	    // InternalEvaluacion.g:595:5: (otherlv_4= RULE_ID )
                    	    // InternalEvaluacion.g:596:6: otherlv_4= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getComponenteRule());
                    	    						}
                    	    					
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_19); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getComponenteAccess().getActionsEvaluacionesCrossReference_2_2_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);

                    otherlv_5=(Token)match(input,26,FOLLOW_20); 

                    				newLeafNode(otherlv_5, grammarAccess.getComponenteAccess().getRightCurlyBracketKeyword_2_3());
                    			

                    }
                    break;

            }

            // InternalEvaluacion.g:612:3: ( (lv_transitions_6_0= ruleTransicion ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalEvaluacion.g:613:4: (lv_transitions_6_0= ruleTransicion )
            	    {
            	    // InternalEvaluacion.g:613:4: (lv_transitions_6_0= ruleTransicion )
            	    // InternalEvaluacion.g:614:5: lv_transitions_6_0= ruleTransicion
            	    {

            	    					newCompositeNode(grammarAccess.getComponenteAccess().getTransitionsTransicionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_transitions_6_0=ruleTransicion();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponenteRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transitions",
            	    						lv_transitions_6_0,
            	    						"hwo.evtool.dsl.Evaluacion.Transicion");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponente"


    // $ANTLR start "entryRuleTransicion"
    // InternalEvaluacion.g:635:1: entryRuleTransicion returns [EObject current=null] : iv_ruleTransicion= ruleTransicion EOF ;
    public final EObject entryRuleTransicion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransicion = null;


        try {
            // InternalEvaluacion.g:635:51: (iv_ruleTransicion= ruleTransicion EOF )
            // InternalEvaluacion.g:636:2: iv_ruleTransicion= ruleTransicion EOF
            {
             newCompositeNode(grammarAccess.getTransicionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransicion=ruleTransicion();

            state._fsp--;

             current =iv_ruleTransicion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransicion"


    // $ANTLR start "ruleTransicion"
    // InternalEvaluacion.g:642:1: ruleTransicion returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleTransicion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalEvaluacion.g:648:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalEvaluacion.g:649:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalEvaluacion.g:649:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
            // InternalEvaluacion.g:650:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) )
            {
            // InternalEvaluacion.g:650:3: ( (otherlv_0= RULE_ID ) )
            // InternalEvaluacion.g:651:4: (otherlv_0= RULE_ID )
            {
            // InternalEvaluacion.g:651:4: (otherlv_0= RULE_ID )
            // InternalEvaluacion.g:652:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransicionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_0, grammarAccess.getTransicionAccess().getEventEventoCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTransicionAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalEvaluacion.g:667:3: ( (otherlv_2= RULE_ID ) )
            // InternalEvaluacion.g:668:4: (otherlv_2= RULE_ID )
            {
            // InternalEvaluacion.g:668:4: (otherlv_2= RULE_ID )
            // InternalEvaluacion.g:669:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransicionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getTransicionAccess().getStateComponenteCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransicion"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000803012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000802012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});

}