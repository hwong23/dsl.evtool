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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'eventos'", "'resetEvents'", "'evaluaciones'", "'componente'", "'actions'", "'{'", "'}'", "':'", "'calificacion'", "'A'", "'M'", "'B'", "'EvaluarArquitecto'", "'EvaluarProblema'", "'EvaluarTecnica'", "'=>'"
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
                    otherlv_5=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getMaquinaEstadosAccess().getEvaluacionesKeyword_3_0());
                    			
                    // InternalEvaluacion.g:135:4: ( (lv_commands_6_0= ruleEvaluaciones ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=23 && LA5_0<=25)) ) {
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
                    	    					
                    	    pushFollow(FOLLOW_7);
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

                if ( (LA7_0==14) ) {
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
            	    				
            	    pushFollow(FOLLOW_8);
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


    // $ANTLR start "entryRuleComponente"
    // InternalEvaluacion.g:233:1: entryRuleComponente returns [EObject current=null] : iv_ruleComponente= ruleComponente EOF ;
    public final EObject entryRuleComponente() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponente = null;


        try {
            // InternalEvaluacion.g:233:51: (iv_ruleComponente= ruleComponente EOF )
            // InternalEvaluacion.g:234:2: iv_ruleComponente= ruleComponente EOF
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
    // InternalEvaluacion.g:240:1: ruleComponente returns [EObject current=null] : (otherlv_0= 'componente' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransicion ) )* ) ;
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
            // InternalEvaluacion.g:246:2: ( (otherlv_0= 'componente' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransicion ) )* ) )
            // InternalEvaluacion.g:247:2: (otherlv_0= 'componente' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransicion ) )* )
            {
            // InternalEvaluacion.g:247:2: (otherlv_0= 'componente' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransicion ) )* )
            // InternalEvaluacion.g:248:3: otherlv_0= 'componente' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransicion ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponenteAccess().getComponenteKeyword_0());
            		
            // InternalEvaluacion.g:252:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEvaluacion.g:253:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEvaluacion.g:253:4: (lv_name_1_0= RULE_ID )
            // InternalEvaluacion.g:254:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            // InternalEvaluacion.g:270:3: (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalEvaluacion.g:271:4: otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getComponenteAccess().getActionsKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getComponenteAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalEvaluacion.g:279:4: ( (otherlv_4= RULE_ID ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_ID) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalEvaluacion.g:280:5: (otherlv_4= RULE_ID )
                    	    {
                    	    // InternalEvaluacion.g:280:5: (otherlv_4= RULE_ID )
                    	    // InternalEvaluacion.g:281:6: otherlv_4= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getComponenteRule());
                    	    						}
                    	    					
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_11); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getComponenteAccess().getActionsEvaluacionesCrossReference_2_2_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    otherlv_5=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getComponenteAccess().getRightCurlyBracketKeyword_2_3());
                    			

                    }
                    break;

            }

            // InternalEvaluacion.g:297:3: ( (lv_transitions_6_0= ruleTransicion ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalEvaluacion.g:298:4: (lv_transitions_6_0= ruleTransicion )
            	    {
            	    // InternalEvaluacion.g:298:4: (lv_transitions_6_0= ruleTransicion )
            	    // InternalEvaluacion.g:299:5: lv_transitions_6_0= ruleTransicion
            	    {

            	    					newCompositeNode(grammarAccess.getComponenteAccess().getTransitionsTransicionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
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
            	    break loop10;
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


    // $ANTLR start "entryRuleEvaluaciones"
    // InternalEvaluacion.g:320:1: entryRuleEvaluaciones returns [EObject current=null] : iv_ruleEvaluaciones= ruleEvaluaciones EOF ;
    public final EObject entryRuleEvaluaciones() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluaciones = null;


        try {
            // InternalEvaluacion.g:320:53: (iv_ruleEvaluaciones= ruleEvaluaciones EOF )
            // InternalEvaluacion.g:321:2: iv_ruleEvaluaciones= ruleEvaluaciones EOF
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
    // InternalEvaluacion.g:327:1: ruleEvaluaciones returns [EObject current=null] : ( ruleTipoEvaluacion ( (lv_name_1_0= RULE_ID ) ) ( (lv_expresion_2_0= ruleExpresion ) ) (otherlv_3= ':' ( (lv_comentario_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleEvaluaciones() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token lv_comentario_4_0=null;
        EObject lv_expresion_2_0 = null;



        	enterRule();

        try {
            // InternalEvaluacion.g:333:2: ( ( ruleTipoEvaluacion ( (lv_name_1_0= RULE_ID ) ) ( (lv_expresion_2_0= ruleExpresion ) ) (otherlv_3= ':' ( (lv_comentario_4_0= RULE_STRING ) ) )? ) )
            // InternalEvaluacion.g:334:2: ( ruleTipoEvaluacion ( (lv_name_1_0= RULE_ID ) ) ( (lv_expresion_2_0= ruleExpresion ) ) (otherlv_3= ':' ( (lv_comentario_4_0= RULE_STRING ) ) )? )
            {
            // InternalEvaluacion.g:334:2: ( ruleTipoEvaluacion ( (lv_name_1_0= RULE_ID ) ) ( (lv_expresion_2_0= ruleExpresion ) ) (otherlv_3= ':' ( (lv_comentario_4_0= RULE_STRING ) ) )? )
            // InternalEvaluacion.g:335:3: ruleTipoEvaluacion ( (lv_name_1_0= RULE_ID ) ) ( (lv_expresion_2_0= ruleExpresion ) ) (otherlv_3= ':' ( (lv_comentario_4_0= RULE_STRING ) ) )?
            {

            			newCompositeNode(grammarAccess.getEvaluacionesAccess().getTipoEvaluacionParserRuleCall_0());
            		
            pushFollow(FOLLOW_3);
            ruleTipoEvaluacion();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalEvaluacion.g:342:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEvaluacion.g:343:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEvaluacion.g:343:4: (lv_name_1_0= RULE_ID )
            // InternalEvaluacion.g:344:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEvaluacionesAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvaluacionesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalEvaluacion.g:360:3: ( (lv_expresion_2_0= ruleExpresion ) )
            // InternalEvaluacion.g:361:4: (lv_expresion_2_0= ruleExpresion )
            {
            // InternalEvaluacion.g:361:4: (lv_expresion_2_0= ruleExpresion )
            // InternalEvaluacion.g:362:5: lv_expresion_2_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getEvaluacionesAccess().getExpresionExpresionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_expresion_2_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvaluacionesRule());
            					}
            					set(
            						current,
            						"expresion",
            						lv_expresion_2_0,
            						"hwo.evtool.dsl.Evaluacion.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEvaluacion.g:379:3: (otherlv_3= ':' ( (lv_comentario_4_0= RULE_STRING ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEvaluacion.g:380:4: otherlv_3= ':' ( (lv_comentario_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getEvaluacionesAccess().getColonKeyword_3_0());
                    			
                    // InternalEvaluacion.g:384:4: ( (lv_comentario_4_0= RULE_STRING ) )
                    // InternalEvaluacion.g:385:5: (lv_comentario_4_0= RULE_STRING )
                    {
                    // InternalEvaluacion.g:385:5: (lv_comentario_4_0= RULE_STRING )
                    // InternalEvaluacion.g:386:6: lv_comentario_4_0= RULE_STRING
                    {
                    lv_comentario_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_comentario_4_0, grammarAccess.getEvaluacionesAccess().getComentarioSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvaluacionesRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"comentario",
                    							lv_comentario_4_0,
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


    // $ANTLR start "entryRuleExpresion"
    // InternalEvaluacion.g:407:1: entryRuleExpresion returns [EObject current=null] : iv_ruleExpresion= ruleExpresion EOF ;
    public final EObject entryRuleExpresion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresion = null;


        try {
            // InternalEvaluacion.g:407:50: (iv_ruleExpresion= ruleExpresion EOF )
            // InternalEvaluacion.g:408:2: iv_ruleExpresion= ruleExpresion EOF
            {
             newCompositeNode(grammarAccess.getExpresionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresion=ruleExpresion();

            state._fsp--;

             current =iv_ruleExpresion; 
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
    // $ANTLR end "entryRuleExpresion"


    // $ANTLR start "ruleExpresion"
    // InternalEvaluacion.g:414:1: ruleExpresion returns [EObject current=null] : (otherlv_0= 'calificacion' otherlv_1= ':' ( ( (lv_calificacion_2_1= ruleEvaluarPropuesta | lv_calificacion_2_2= ruleEvaluarEquipo ) ) ) ) ;
    public final EObject ruleExpresion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_calificacion_2_1 = null;

        EObject lv_calificacion_2_2 = null;



        	enterRule();

        try {
            // InternalEvaluacion.g:420:2: ( (otherlv_0= 'calificacion' otherlv_1= ':' ( ( (lv_calificacion_2_1= ruleEvaluarPropuesta | lv_calificacion_2_2= ruleEvaluarEquipo ) ) ) ) )
            // InternalEvaluacion.g:421:2: (otherlv_0= 'calificacion' otherlv_1= ':' ( ( (lv_calificacion_2_1= ruleEvaluarPropuesta | lv_calificacion_2_2= ruleEvaluarEquipo ) ) ) )
            {
            // InternalEvaluacion.g:421:2: (otherlv_0= 'calificacion' otherlv_1= ':' ( ( (lv_calificacion_2_1= ruleEvaluarPropuesta | lv_calificacion_2_2= ruleEvaluarEquipo ) ) ) )
            // InternalEvaluacion.g:422:3: otherlv_0= 'calificacion' otherlv_1= ':' ( ( (lv_calificacion_2_1= ruleEvaluarPropuesta | lv_calificacion_2_2= ruleEvaluarEquipo ) ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getExpresionAccess().getCalificacionKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getExpresionAccess().getColonKeyword_1());
            		
            // InternalEvaluacion.g:430:3: ( ( (lv_calificacion_2_1= ruleEvaluarPropuesta | lv_calificacion_2_2= ruleEvaluarEquipo ) ) )
            // InternalEvaluacion.g:431:4: ( (lv_calificacion_2_1= ruleEvaluarPropuesta | lv_calificacion_2_2= ruleEvaluarEquipo ) )
            {
            // InternalEvaluacion.g:431:4: ( (lv_calificacion_2_1= ruleEvaluarPropuesta | lv_calificacion_2_2= ruleEvaluarEquipo ) )
            // InternalEvaluacion.g:432:5: (lv_calificacion_2_1= ruleEvaluarPropuesta | lv_calificacion_2_2= ruleEvaluarEquipo )
            {
            // InternalEvaluacion.g:432:5: (lv_calificacion_2_1= ruleEvaluarPropuesta | lv_calificacion_2_2= ruleEvaluarEquipo )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=20 && LA12_0<=22)) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_INT) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalEvaluacion.g:433:6: lv_calificacion_2_1= ruleEvaluarPropuesta
                    {

                    						newCompositeNode(grammarAccess.getExpresionAccess().getCalificacionEvaluarPropuestaParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_calificacion_2_1=ruleEvaluarPropuesta();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpresionRule());
                    						}
                    						set(
                    							current,
                    							"calificacion",
                    							lv_calificacion_2_1,
                    							"hwo.evtool.dsl.Evaluacion.EvaluarPropuesta");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalEvaluacion.g:449:6: lv_calificacion_2_2= ruleEvaluarEquipo
                    {

                    						newCompositeNode(grammarAccess.getExpresionAccess().getCalificacionEvaluarEquipoParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_calificacion_2_2=ruleEvaluarEquipo();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpresionRule());
                    						}
                    						set(
                    							current,
                    							"calificacion",
                    							lv_calificacion_2_2,
                    							"hwo.evtool.dsl.Evaluacion.EvaluarEquipo");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleExpresion"


    // $ANTLR start "entryRuleEvaluarEquipo"
    // InternalEvaluacion.g:471:1: entryRuleEvaluarEquipo returns [EObject current=null] : iv_ruleEvaluarEquipo= ruleEvaluarEquipo EOF ;
    public final EObject entryRuleEvaluarEquipo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluarEquipo = null;


        try {
            // InternalEvaluacion.g:471:54: (iv_ruleEvaluarEquipo= ruleEvaluarEquipo EOF )
            // InternalEvaluacion.g:472:2: iv_ruleEvaluarEquipo= ruleEvaluarEquipo EOF
            {
             newCompositeNode(grammarAccess.getEvaluarEquipoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvaluarEquipo=ruleEvaluarEquipo();

            state._fsp--;

             current =iv_ruleEvaluarEquipo; 
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
    // $ANTLR end "entryRuleEvaluarEquipo"


    // $ANTLR start "ruleEvaluarEquipo"
    // InternalEvaluacion.g:478:1: ruleEvaluarEquipo returns [EObject current=null] : ( () this_INT_1= RULE_INT ) ;
    public final EObject ruleEvaluarEquipo() throws RecognitionException {
        EObject current = null;

        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalEvaluacion.g:484:2: ( ( () this_INT_1= RULE_INT ) )
            // InternalEvaluacion.g:485:2: ( () this_INT_1= RULE_INT )
            {
            // InternalEvaluacion.g:485:2: ( () this_INT_1= RULE_INT )
            // InternalEvaluacion.g:486:3: () this_INT_1= RULE_INT
            {
            // InternalEvaluacion.g:486:3: ()
            // InternalEvaluacion.g:487:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEvaluarEquipoAccess().getExpresionAction_0(),
            					current);
            			

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			newLeafNode(this_INT_1, grammarAccess.getEvaluarEquipoAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEvaluarEquipo"


    // $ANTLR start "entryRuleEvaluarPropuesta"
    // InternalEvaluacion.g:501:1: entryRuleEvaluarPropuesta returns [EObject current=null] : iv_ruleEvaluarPropuesta= ruleEvaluarPropuesta EOF ;
    public final EObject entryRuleEvaluarPropuesta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluarPropuesta = null;


        try {
            // InternalEvaluacion.g:501:57: (iv_ruleEvaluarPropuesta= ruleEvaluarPropuesta EOF )
            // InternalEvaluacion.g:502:2: iv_ruleEvaluarPropuesta= ruleEvaluarPropuesta EOF
            {
             newCompositeNode(grammarAccess.getEvaluarPropuestaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvaluarPropuesta=ruleEvaluarPropuesta();

            state._fsp--;

             current =iv_ruleEvaluarPropuesta; 
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
    // $ANTLR end "entryRuleEvaluarPropuesta"


    // $ANTLR start "ruleEvaluarPropuesta"
    // InternalEvaluacion.g:508:1: ruleEvaluarPropuesta returns [EObject current=null] : ( ( () otherlv_1= 'A' ) | ( () otherlv_3= 'M' ) | ( () otherlv_5= 'B' ) ) ;
    public final EObject ruleEvaluarPropuesta() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalEvaluacion.g:514:2: ( ( ( () otherlv_1= 'A' ) | ( () otherlv_3= 'M' ) | ( () otherlv_5= 'B' ) ) )
            // InternalEvaluacion.g:515:2: ( ( () otherlv_1= 'A' ) | ( () otherlv_3= 'M' ) | ( () otherlv_5= 'B' ) )
            {
            // InternalEvaluacion.g:515:2: ( ( () otherlv_1= 'A' ) | ( () otherlv_3= 'M' ) | ( () otherlv_5= 'B' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt13=1;
                }
                break;
            case 21:
                {
                alt13=2;
                }
                break;
            case 22:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalEvaluacion.g:516:3: ( () otherlv_1= 'A' )
                    {
                    // InternalEvaluacion.g:516:3: ( () otherlv_1= 'A' )
                    // InternalEvaluacion.g:517:4: () otherlv_1= 'A'
                    {
                    // InternalEvaluacion.g:517:4: ()
                    // InternalEvaluacion.g:518:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEvaluarPropuestaAccess().getExpresionAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getEvaluarPropuestaAccess().getAKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEvaluacion.g:530:3: ( () otherlv_3= 'M' )
                    {
                    // InternalEvaluacion.g:530:3: ( () otherlv_3= 'M' )
                    // InternalEvaluacion.g:531:4: () otherlv_3= 'M'
                    {
                    // InternalEvaluacion.g:531:4: ()
                    // InternalEvaluacion.g:532:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEvaluarPropuestaAccess().getExpresionAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getEvaluarPropuestaAccess().getMKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEvaluacion.g:544:3: ( () otherlv_5= 'B' )
                    {
                    // InternalEvaluacion.g:544:3: ( () otherlv_5= 'B' )
                    // InternalEvaluacion.g:545:4: () otherlv_5= 'B'
                    {
                    // InternalEvaluacion.g:545:4: ()
                    // InternalEvaluacion.g:546:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEvaluarPropuestaAccess().getExpresionAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getEvaluarPropuestaAccess().getBKeyword_2_1());
                    			

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
    // $ANTLR end "ruleEvaluarPropuesta"


    // $ANTLR start "entryRuleTipoEvaluacion"
    // InternalEvaluacion.g:561:1: entryRuleTipoEvaluacion returns [String current=null] : iv_ruleTipoEvaluacion= ruleTipoEvaluacion EOF ;
    public final String entryRuleTipoEvaluacion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipoEvaluacion = null;


        try {
            // InternalEvaluacion.g:561:54: (iv_ruleTipoEvaluacion= ruleTipoEvaluacion EOF )
            // InternalEvaluacion.g:562:2: iv_ruleTipoEvaluacion= ruleTipoEvaluacion EOF
            {
             newCompositeNode(grammarAccess.getTipoEvaluacionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTipoEvaluacion=ruleTipoEvaluacion();

            state._fsp--;

             current =iv_ruleTipoEvaluacion.getText(); 
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
    // $ANTLR end "entryRuleTipoEvaluacion"


    // $ANTLR start "ruleTipoEvaluacion"
    // InternalEvaluacion.g:568:1: ruleTipoEvaluacion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TipoEvaluarPropuesta_0= ruleTipoEvaluarPropuesta | this_TipoEvaluarEquipo_1= ruleTipoEvaluarEquipo ) ;
    public final AntlrDatatypeRuleToken ruleTipoEvaluacion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_TipoEvaluarPropuesta_0 = null;

        AntlrDatatypeRuleToken this_TipoEvaluarEquipo_1 = null;



        	enterRule();

        try {
            // InternalEvaluacion.g:574:2: ( (this_TipoEvaluarPropuesta_0= ruleTipoEvaluarPropuesta | this_TipoEvaluarEquipo_1= ruleTipoEvaluarEquipo ) )
            // InternalEvaluacion.g:575:2: (this_TipoEvaluarPropuesta_0= ruleTipoEvaluarPropuesta | this_TipoEvaluarEquipo_1= ruleTipoEvaluarEquipo )
            {
            // InternalEvaluacion.g:575:2: (this_TipoEvaluarPropuesta_0= ruleTipoEvaluarPropuesta | this_TipoEvaluarEquipo_1= ruleTipoEvaluarEquipo )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=24 && LA14_0<=25)) ) {
                alt14=1;
            }
            else if ( (LA14_0==23) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalEvaluacion.g:576:3: this_TipoEvaluarPropuesta_0= ruleTipoEvaluarPropuesta
                    {

                    			newCompositeNode(grammarAccess.getTipoEvaluacionAccess().getTipoEvaluarPropuestaParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TipoEvaluarPropuesta_0=ruleTipoEvaluarPropuesta();

                    state._fsp--;


                    			current.merge(this_TipoEvaluarPropuesta_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEvaluacion.g:587:3: this_TipoEvaluarEquipo_1= ruleTipoEvaluarEquipo
                    {

                    			newCompositeNode(grammarAccess.getTipoEvaluacionAccess().getTipoEvaluarEquipoParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TipoEvaluarEquipo_1=ruleTipoEvaluarEquipo();

                    state._fsp--;


                    			current.merge(this_TipoEvaluarEquipo_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleTipoEvaluacion"


    // $ANTLR start "entryRuleTipoEvaluarEquipo"
    // InternalEvaluacion.g:601:1: entryRuleTipoEvaluarEquipo returns [String current=null] : iv_ruleTipoEvaluarEquipo= ruleTipoEvaluarEquipo EOF ;
    public final String entryRuleTipoEvaluarEquipo() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipoEvaluarEquipo = null;


        try {
            // InternalEvaluacion.g:601:57: (iv_ruleTipoEvaluarEquipo= ruleTipoEvaluarEquipo EOF )
            // InternalEvaluacion.g:602:2: iv_ruleTipoEvaluarEquipo= ruleTipoEvaluarEquipo EOF
            {
             newCompositeNode(grammarAccess.getTipoEvaluarEquipoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTipoEvaluarEquipo=ruleTipoEvaluarEquipo();

            state._fsp--;

             current =iv_ruleTipoEvaluarEquipo.getText(); 
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
    // $ANTLR end "entryRuleTipoEvaluarEquipo"


    // $ANTLR start "ruleTipoEvaluarEquipo"
    // InternalEvaluacion.g:608:1: ruleTipoEvaluarEquipo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'EvaluarArquitecto' ;
    public final AntlrDatatypeRuleToken ruleTipoEvaluarEquipo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEvaluacion.g:614:2: (kw= 'EvaluarArquitecto' )
            // InternalEvaluacion.g:615:2: kw= 'EvaluarArquitecto'
            {
            kw=(Token)match(input,23,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getTipoEvaluarEquipoAccess().getEvaluarArquitectoKeyword());
            	

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
    // $ANTLR end "ruleTipoEvaluarEquipo"


    // $ANTLR start "entryRuleTipoEvaluarPropuesta"
    // InternalEvaluacion.g:623:1: entryRuleTipoEvaluarPropuesta returns [String current=null] : iv_ruleTipoEvaluarPropuesta= ruleTipoEvaluarPropuesta EOF ;
    public final String entryRuleTipoEvaluarPropuesta() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipoEvaluarPropuesta = null;


        try {
            // InternalEvaluacion.g:623:60: (iv_ruleTipoEvaluarPropuesta= ruleTipoEvaluarPropuesta EOF )
            // InternalEvaluacion.g:624:2: iv_ruleTipoEvaluarPropuesta= ruleTipoEvaluarPropuesta EOF
            {
             newCompositeNode(grammarAccess.getTipoEvaluarPropuestaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTipoEvaluarPropuesta=ruleTipoEvaluarPropuesta();

            state._fsp--;

             current =iv_ruleTipoEvaluarPropuesta.getText(); 
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
    // $ANTLR end "entryRuleTipoEvaluarPropuesta"


    // $ANTLR start "ruleTipoEvaluarPropuesta"
    // InternalEvaluacion.g:630:1: ruleTipoEvaluarPropuesta returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'EvaluarProblema' | kw= 'EvaluarTecnica' ) ;
    public final AntlrDatatypeRuleToken ruleTipoEvaluarPropuesta() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEvaluacion.g:636:2: ( (kw= 'EvaluarProblema' | kw= 'EvaluarTecnica' ) )
            // InternalEvaluacion.g:637:2: (kw= 'EvaluarProblema' | kw= 'EvaluarTecnica' )
            {
            // InternalEvaluacion.g:637:2: (kw= 'EvaluarProblema' | kw= 'EvaluarTecnica' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            else if ( (LA15_0==25) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalEvaluacion.g:638:3: kw= 'EvaluarProblema'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoEvaluarPropuestaAccess().getEvaluarProblemaKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEvaluacion.g:644:3: kw= 'EvaluarTecnica'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoEvaluarPropuestaAccess().getEvaluarTecnicaKeyword_1());
                    		

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
    // $ANTLR end "ruleTipoEvaluarPropuesta"


    // $ANTLR start "entryRuleTransicion"
    // InternalEvaluacion.g:653:1: entryRuleTransicion returns [EObject current=null] : iv_ruleTransicion= ruleTransicion EOF ;
    public final EObject entryRuleTransicion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransicion = null;


        try {
            // InternalEvaluacion.g:653:51: (iv_ruleTransicion= ruleTransicion EOF )
            // InternalEvaluacion.g:654:2: iv_ruleTransicion= ruleTransicion EOF
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
    // InternalEvaluacion.g:660:1: ruleTransicion returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleTransicion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalEvaluacion.g:666:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalEvaluacion.g:667:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalEvaluacion.g:667:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
            // InternalEvaluacion.g:668:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) )
            {
            // InternalEvaluacion.g:668:3: ( (otherlv_0= RULE_ID ) )
            // InternalEvaluacion.g:669:4: (otherlv_0= RULE_ID )
            {
            // InternalEvaluacion.g:669:4: (otherlv_0= RULE_ID )
            // InternalEvaluacion.g:670:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransicionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_0, grammarAccess.getTransicionAccess().getEventEventoCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTransicionAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalEvaluacion.g:685:3: ( (otherlv_2= RULE_ID ) )
            // InternalEvaluacion.g:686:4: (otherlv_2= RULE_ID )
            {
            // InternalEvaluacion.g:686:4: (otherlv_2= RULE_ID )
            // InternalEvaluacion.g:687:5: otherlv_2= RULE_ID
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000007012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000003804002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000700040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});

}