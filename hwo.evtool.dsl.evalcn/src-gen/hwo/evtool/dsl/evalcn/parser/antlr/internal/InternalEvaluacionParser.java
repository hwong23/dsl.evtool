package hwo.evtool.dsl.evalcn.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import hwo.evtool.dsl.evalcn.services.EvaluacionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEvaluacionParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'eventos'", "'resetEvents'", "'evaluaciones'", "'componente'", "'actions'", "'{'", "'}'", "':'", "'=>'", "'formacion'", "'experiencia'", "'certificacion'", "'Otros'", "'calificacion'", "'criterio'", "'EvaluarArquitecto'", "'EvaluarDirector'", "'EvaluarEducacion'", "'EvaluarProblema'", "'EvaluarTecnica'", "'EvaluarOtros'", "'A'", "'M'", "'B'", "'Especializacion'", "'Maestria'", "'Doctorado'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
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
    // InternalEvaluacion.g:65:1: entryRuleMaquinaEstados returns [EObject current=null] : iv_ruleMaquinaEstados= ruleMaquinaEstados EOF ;
    public final EObject entryRuleMaquinaEstados() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaquinaEstados = null;


        try {
            // InternalEvaluacion.g:65:55: (iv_ruleMaquinaEstados= ruleMaquinaEstados EOF )
            // InternalEvaluacion.g:66:2: iv_ruleMaquinaEstados= ruleMaquinaEstados EOF
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
    // InternalEvaluacion.g:72:1: ruleMaquinaEstados returns [EObject current=null] : ( () (otherlv_1= 'eventos' ( (lv_events_2_0= ruleEvento ) )+ )? (otherlv_3= 'resetEvents' ( (otherlv_4= RULE_ID ) )+ )? (otherlv_5= 'evaluaciones' ( (lv_commands_6_0= ruleExpresion ) )+ )? ( (lv_states_7_0= ruleComponente ) )* ) ;
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
            // InternalEvaluacion.g:78:2: ( ( () (otherlv_1= 'eventos' ( (lv_events_2_0= ruleEvento ) )+ )? (otherlv_3= 'resetEvents' ( (otherlv_4= RULE_ID ) )+ )? (otherlv_5= 'evaluaciones' ( (lv_commands_6_0= ruleExpresion ) )+ )? ( (lv_states_7_0= ruleComponente ) )* ) )
            // InternalEvaluacion.g:79:2: ( () (otherlv_1= 'eventos' ( (lv_events_2_0= ruleEvento ) )+ )? (otherlv_3= 'resetEvents' ( (otherlv_4= RULE_ID ) )+ )? (otherlv_5= 'evaluaciones' ( (lv_commands_6_0= ruleExpresion ) )+ )? ( (lv_states_7_0= ruleComponente ) )* )
            {
            // InternalEvaluacion.g:79:2: ( () (otherlv_1= 'eventos' ( (lv_events_2_0= ruleEvento ) )+ )? (otherlv_3= 'resetEvents' ( (otherlv_4= RULE_ID ) )+ )? (otherlv_5= 'evaluaciones' ( (lv_commands_6_0= ruleExpresion ) )+ )? ( (lv_states_7_0= ruleComponente ) )* )
            // InternalEvaluacion.g:80:3: () (otherlv_1= 'eventos' ( (lv_events_2_0= ruleEvento ) )+ )? (otherlv_3= 'resetEvents' ( (otherlv_4= RULE_ID ) )+ )? (otherlv_5= 'evaluaciones' ( (lv_commands_6_0= ruleExpresion ) )+ )? ( (lv_states_7_0= ruleComponente ) )*
            {
            // InternalEvaluacion.g:80:3: ()
            // InternalEvaluacion.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMaquinaEstadosAccess().getMaquinaEstadosAction_0(),
            					current);
            			

            }

            // InternalEvaluacion.g:87:3: (otherlv_1= 'eventos' ( (lv_events_2_0= ruleEvento ) )+ )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalEvaluacion.g:88:4: otherlv_1= 'eventos' ( (lv_events_2_0= ruleEvento ) )+
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getMaquinaEstadosAccess().getEventosKeyword_1_0());
                    			
                    // InternalEvaluacion.g:92:4: ( (lv_events_2_0= ruleEvento ) )+
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
                    	    // InternalEvaluacion.g:93:5: (lv_events_2_0= ruleEvento )
                    	    {
                    	    // InternalEvaluacion.g:93:5: (lv_events_2_0= ruleEvento )
                    	    // InternalEvaluacion.g:94:6: lv_events_2_0= ruleEvento
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
                    	    							"hwo.evtool.dsl.evalcn.Evaluacion.Evento");
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

            // InternalEvaluacion.g:112:3: (otherlv_3= 'resetEvents' ( (otherlv_4= RULE_ID ) )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEvaluacion.g:113:4: otherlv_3= 'resetEvents' ( (otherlv_4= RULE_ID ) )+
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMaquinaEstadosAccess().getResetEventsKeyword_2_0());
                    			
                    // InternalEvaluacion.g:117:4: ( (otherlv_4= RULE_ID ) )+
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
                    	    // InternalEvaluacion.g:118:5: (otherlv_4= RULE_ID )
                    	    {
                    	    // InternalEvaluacion.g:118:5: (otherlv_4= RULE_ID )
                    	    // InternalEvaluacion.g:119:6: otherlv_4= RULE_ID
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

            // InternalEvaluacion.g:131:3: (otherlv_5= 'evaluaciones' ( (lv_commands_6_0= ruleExpresion ) )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEvaluacion.g:132:4: otherlv_5= 'evaluaciones' ( (lv_commands_6_0= ruleExpresion ) )+
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getMaquinaEstadosAccess().getEvaluacionesKeyword_3_0());
                    			
                    // InternalEvaluacion.g:136:4: ( (lv_commands_6_0= ruleExpresion ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==23||(LA5_0>=26 && LA5_0<=31)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalEvaluacion.g:137:5: (lv_commands_6_0= ruleExpresion )
                    	    {
                    	    // InternalEvaluacion.g:137:5: (lv_commands_6_0= ruleExpresion )
                    	    // InternalEvaluacion.g:138:6: lv_commands_6_0= ruleExpresion
                    	    {

                    	    						newCompositeNode(grammarAccess.getMaquinaEstadosAccess().getCommandsExpresionParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_commands_6_0=ruleExpresion();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMaquinaEstadosRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"commands",
                    	    							lv_commands_6_0,
                    	    							"hwo.evtool.dsl.evalcn.Evaluacion.Expresion");
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

            // InternalEvaluacion.g:156:3: ( (lv_states_7_0= ruleComponente ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEvaluacion.g:157:4: (lv_states_7_0= ruleComponente )
            	    {
            	    // InternalEvaluacion.g:157:4: (lv_states_7_0= ruleComponente )
            	    // InternalEvaluacion.g:158:5: lv_states_7_0= ruleComponente
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
            	    						"hwo.evtool.dsl.evalcn.Evaluacion.Componente");
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
    // InternalEvaluacion.g:179:1: entryRuleEvento returns [EObject current=null] : iv_ruleEvento= ruleEvento EOF ;
    public final EObject entryRuleEvento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvento = null;


        try {
            // InternalEvaluacion.g:179:47: (iv_ruleEvento= ruleEvento EOF )
            // InternalEvaluacion.g:180:2: iv_ruleEvento= ruleEvento EOF
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
    // InternalEvaluacion.g:186:1: ruleEvento returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEvento() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_code_1_0=null;


        	enterRule();

        try {
            // InternalEvaluacion.g:192:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) ) )
            // InternalEvaluacion.g:193:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) )
            {
            // InternalEvaluacion.g:193:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) )
            // InternalEvaluacion.g:194:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) )
            {
            // InternalEvaluacion.g:194:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalEvaluacion.g:195:4: (lv_name_0_0= RULE_ID )
            {
            // InternalEvaluacion.g:195:4: (lv_name_0_0= RULE_ID )
            // InternalEvaluacion.g:196:5: lv_name_0_0= RULE_ID
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

            // InternalEvaluacion.g:212:3: ( (lv_code_1_0= RULE_ID ) )
            // InternalEvaluacion.g:213:4: (lv_code_1_0= RULE_ID )
            {
            // InternalEvaluacion.g:213:4: (lv_code_1_0= RULE_ID )
            // InternalEvaluacion.g:214:5: lv_code_1_0= RULE_ID
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
    // InternalEvaluacion.g:234:1: entryRuleComponente returns [EObject current=null] : iv_ruleComponente= ruleComponente EOF ;
    public final EObject entryRuleComponente() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponente = null;


        try {
            // InternalEvaluacion.g:234:51: (iv_ruleComponente= ruleComponente EOF )
            // InternalEvaluacion.g:235:2: iv_ruleComponente= ruleComponente EOF
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
    // InternalEvaluacion.g:241:1: ruleComponente returns [EObject current=null] : (otherlv_0= 'componente' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransicion ) )* ) ;
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
            // InternalEvaluacion.g:247:2: ( (otherlv_0= 'componente' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransicion ) )* ) )
            // InternalEvaluacion.g:248:2: (otherlv_0= 'componente' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransicion ) )* )
            {
            // InternalEvaluacion.g:248:2: (otherlv_0= 'componente' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransicion ) )* )
            // InternalEvaluacion.g:249:3: otherlv_0= 'componente' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransicion ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponenteAccess().getComponenteKeyword_0());
            		
            // InternalEvaluacion.g:253:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEvaluacion.g:254:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEvaluacion.g:254:4: (lv_name_1_0= RULE_ID )
            // InternalEvaluacion.g:255:5: lv_name_1_0= RULE_ID
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

            // InternalEvaluacion.g:271:3: (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalEvaluacion.g:272:4: otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getComponenteAccess().getActionsKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getComponenteAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalEvaluacion.g:280:4: ( (otherlv_4= RULE_ID ) )+
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
                    	    // InternalEvaluacion.g:281:5: (otherlv_4= RULE_ID )
                    	    {
                    	    // InternalEvaluacion.g:281:5: (otherlv_4= RULE_ID )
                    	    // InternalEvaluacion.g:282:6: otherlv_4= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getComponenteRule());
                    	    						}
                    	    					
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_11); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getComponenteAccess().getActionsEvaluacionCrossReference_2_2_0());
                    	    					

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

            // InternalEvaluacion.g:298:3: ( (lv_transitions_6_0= ruleTransicion ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalEvaluacion.g:299:4: (lv_transitions_6_0= ruleTransicion )
            	    {
            	    // InternalEvaluacion.g:299:4: (lv_transitions_6_0= ruleTransicion )
            	    // InternalEvaluacion.g:300:5: lv_transitions_6_0= ruleTransicion
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
            	    						"hwo.evtool.dsl.evalcn.Evaluacion.Transicion");
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


    // $ANTLR start "entryRuleExpresion"
    // InternalEvaluacion.g:321:1: entryRuleExpresion returns [EObject current=null] : iv_ruleExpresion= ruleExpresion EOF ;
    public final EObject entryRuleExpresion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresion = null;


        try {
            // InternalEvaluacion.g:321:50: (iv_ruleExpresion= ruleExpresion EOF )
            // InternalEvaluacion.g:322:2: iv_ruleExpresion= ruleExpresion EOF
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
    // InternalEvaluacion.g:328:1: ruleExpresion returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoEvaluacion ) ) (otherlv_1= ':' ( (lv_comentario_2_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleExpresion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_comentario_2_0=null;
        EObject lv_tipo_0_0 = null;



        	enterRule();

        try {
            // InternalEvaluacion.g:334:2: ( ( ( (lv_tipo_0_0= ruleTipoEvaluacion ) ) (otherlv_1= ':' ( (lv_comentario_2_0= RULE_STRING ) ) )? ) )
            // InternalEvaluacion.g:335:2: ( ( (lv_tipo_0_0= ruleTipoEvaluacion ) ) (otherlv_1= ':' ( (lv_comentario_2_0= RULE_STRING ) ) )? )
            {
            // InternalEvaluacion.g:335:2: ( ( (lv_tipo_0_0= ruleTipoEvaluacion ) ) (otherlv_1= ':' ( (lv_comentario_2_0= RULE_STRING ) ) )? )
            // InternalEvaluacion.g:336:3: ( (lv_tipo_0_0= ruleTipoEvaluacion ) ) (otherlv_1= ':' ( (lv_comentario_2_0= RULE_STRING ) ) )?
            {
            // InternalEvaluacion.g:336:3: ( (lv_tipo_0_0= ruleTipoEvaluacion ) )
            // InternalEvaluacion.g:337:4: (lv_tipo_0_0= ruleTipoEvaluacion )
            {
            // InternalEvaluacion.g:337:4: (lv_tipo_0_0= ruleTipoEvaluacion )
            // InternalEvaluacion.g:338:5: lv_tipo_0_0= ruleTipoEvaluacion
            {

            					newCompositeNode(grammarAccess.getExpresionAccess().getTipoTipoEvaluacionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_tipo_0_0=ruleTipoEvaluacion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpresionRule());
            					}
            					set(
            						current,
            						"tipo",
            						lv_tipo_0_0,
            						"hwo.evtool.dsl.evalcn.Evaluacion.TipoEvaluacion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEvaluacion.g:355:3: (otherlv_1= ':' ( (lv_comentario_2_0= RULE_STRING ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEvaluacion.g:356:4: otherlv_1= ':' ( (lv_comentario_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getExpresionAccess().getColonKeyword_1_0());
                    			
                    // InternalEvaluacion.g:360:4: ( (lv_comentario_2_0= RULE_STRING ) )
                    // InternalEvaluacion.g:361:5: (lv_comentario_2_0= RULE_STRING )
                    {
                    // InternalEvaluacion.g:361:5: (lv_comentario_2_0= RULE_STRING )
                    // InternalEvaluacion.g:362:6: lv_comentario_2_0= RULE_STRING
                    {
                    lv_comentario_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_comentario_2_0, grammarAccess.getExpresionAccess().getComentarioSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpresionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"comentario",
                    							lv_comentario_2_0,
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
    // $ANTLR end "ruleExpresion"


    // $ANTLR start "entryRuleTipoEvaluacion"
    // InternalEvaluacion.g:383:1: entryRuleTipoEvaluacion returns [EObject current=null] : iv_ruleTipoEvaluacion= ruleTipoEvaluacion EOF ;
    public final EObject entryRuleTipoEvaluacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoEvaluacion = null;


        try {
            // InternalEvaluacion.g:383:55: (iv_ruleTipoEvaluacion= ruleTipoEvaluacion EOF )
            // InternalEvaluacion.g:384:2: iv_ruleTipoEvaluacion= ruleTipoEvaluacion EOF
            {
             newCompositeNode(grammarAccess.getTipoEvaluacionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTipoEvaluacion=ruleTipoEvaluacion();

            state._fsp--;

             current =iv_ruleTipoEvaluacion; 
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
    // InternalEvaluacion.g:390:1: ruleTipoEvaluacion returns [EObject current=null] : ( (lv_evaluacion_0_0= ruleEvaluacion ) ) ;
    public final EObject ruleTipoEvaluacion() throws RecognitionException {
        EObject current = null;

        EObject lv_evaluacion_0_0 = null;



        	enterRule();

        try {
            // InternalEvaluacion.g:396:2: ( ( (lv_evaluacion_0_0= ruleEvaluacion ) ) )
            // InternalEvaluacion.g:397:2: ( (lv_evaluacion_0_0= ruleEvaluacion ) )
            {
            // InternalEvaluacion.g:397:2: ( (lv_evaluacion_0_0= ruleEvaluacion ) )
            // InternalEvaluacion.g:398:3: (lv_evaluacion_0_0= ruleEvaluacion )
            {
            // InternalEvaluacion.g:398:3: (lv_evaluacion_0_0= ruleEvaluacion )
            // InternalEvaluacion.g:399:4: lv_evaluacion_0_0= ruleEvaluacion
            {

            				newCompositeNode(grammarAccess.getTipoEvaluacionAccess().getEvaluacionEvaluacionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_evaluacion_0_0=ruleEvaluacion();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getTipoEvaluacionRule());
            				}
            				set(
            					current,
            					"evaluacion",
            					lv_evaluacion_0_0,
            					"hwo.evtool.dsl.evalcn.Evaluacion.Evaluacion");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleTipoEvaluacion"


    // $ANTLR start "entryRuleTransicion"
    // InternalEvaluacion.g:419:1: entryRuleTransicion returns [EObject current=null] : iv_ruleTransicion= ruleTransicion EOF ;
    public final EObject entryRuleTransicion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransicion = null;


        try {
            // InternalEvaluacion.g:419:51: (iv_ruleTransicion= ruleTransicion EOF )
            // InternalEvaluacion.g:420:2: iv_ruleTransicion= ruleTransicion EOF
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
    // InternalEvaluacion.g:426:1: ruleTransicion returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleTransicion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalEvaluacion.g:432:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalEvaluacion.g:433:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalEvaluacion.g:433:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
            // InternalEvaluacion.g:434:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) )
            {
            // InternalEvaluacion.g:434:3: ( (otherlv_0= RULE_ID ) )
            // InternalEvaluacion.g:435:4: (otherlv_0= RULE_ID )
            {
            // InternalEvaluacion.g:435:4: (otherlv_0= RULE_ID )
            // InternalEvaluacion.g:436:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransicionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_0, grammarAccess.getTransicionAccess().getEventEventoCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTransicionAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalEvaluacion.g:451:3: ( (otherlv_2= RULE_ID ) )
            // InternalEvaluacion.g:452:4: (otherlv_2= RULE_ID )
            {
            // InternalEvaluacion.g:452:4: (otherlv_2= RULE_ID )
            // InternalEvaluacion.g:453:5: otherlv_2= RULE_ID
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


    // $ANTLR start "entryRuleEvaluacion"
    // InternalEvaluacion.g:468:1: entryRuleEvaluacion returns [EObject current=null] : iv_ruleEvaluacion= ruleEvaluacion EOF ;
    public final EObject entryRuleEvaluacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluacion = null;


        try {
            // InternalEvaluacion.g:468:51: (iv_ruleEvaluacion= ruleEvaluacion EOF )
            // InternalEvaluacion.g:469:2: iv_ruleEvaluacion= ruleEvaluacion EOF
            {
             newCompositeNode(grammarAccess.getEvaluacionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvaluacion=ruleEvaluacion();

            state._fsp--;

             current =iv_ruleEvaluacion; 
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
    // $ANTLR end "entryRuleEvaluacion"


    // $ANTLR start "ruleEvaluacion"
    // InternalEvaluacion.g:475:1: ruleEvaluacion returns [EObject current=null] : ( ( () ( (lv_tipo_1_0= ruleTipoPropuesta ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_criterios_3_0= ruleCriterioPropuesta ) )* ) | ( () ( (lv_tipo_5_0= ruleTipoEquipo ) ) ( (lv_name_6_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_formacion_8_0= 'formacion' ) ) otherlv_9= ':' ( (lv_formacionVal_10_0= ruleTipoFormacion ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_experiencia_11_0= 'experiencia' ) ) otherlv_12= ':' ( (lv_experienciaVal_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_certificacion_14_0= 'certificacion' ) ) otherlv_15= ':' ( (lv_certificacionVal_16_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ) | ( () ( (lv_tipo_18_0= 'Otros' ) ) ( (lv_name_19_0= RULE_ID ) ) otherlv_20= 'calificacion' otherlv_21= ':' ( (lv_valor_22_0= RULE_INT ) ) ) ) ;
    public final EObject ruleEvaluacion() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token lv_name_6_0=null;
        Token lv_formacion_8_0=null;
        Token otherlv_9=null;
        Token lv_experiencia_11_0=null;
        Token otherlv_12=null;
        Token lv_experienciaVal_13_0=null;
        Token lv_certificacion_14_0=null;
        Token otherlv_15=null;
        Token lv_certificacionVal_16_0=null;
        Token lv_tipo_18_0=null;
        Token lv_name_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_valor_22_0=null;
        Enumerator lv_tipo_1_0 = null;

        EObject lv_criterios_3_0 = null;

        Enumerator lv_tipo_5_0 = null;

        Enumerator lv_formacionVal_10_0 = null;



        	enterRule();

        try {
            // InternalEvaluacion.g:481:2: ( ( ( () ( (lv_tipo_1_0= ruleTipoPropuesta ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_criterios_3_0= ruleCriterioPropuesta ) )* ) | ( () ( (lv_tipo_5_0= ruleTipoEquipo ) ) ( (lv_name_6_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_formacion_8_0= 'formacion' ) ) otherlv_9= ':' ( (lv_formacionVal_10_0= ruleTipoFormacion ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_experiencia_11_0= 'experiencia' ) ) otherlv_12= ':' ( (lv_experienciaVal_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_certificacion_14_0= 'certificacion' ) ) otherlv_15= ':' ( (lv_certificacionVal_16_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ) | ( () ( (lv_tipo_18_0= 'Otros' ) ) ( (lv_name_19_0= RULE_ID ) ) otherlv_20= 'calificacion' otherlv_21= ':' ( (lv_valor_22_0= RULE_INT ) ) ) ) )
            // InternalEvaluacion.g:482:2: ( ( () ( (lv_tipo_1_0= ruleTipoPropuesta ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_criterios_3_0= ruleCriterioPropuesta ) )* ) | ( () ( (lv_tipo_5_0= ruleTipoEquipo ) ) ( (lv_name_6_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_formacion_8_0= 'formacion' ) ) otherlv_9= ':' ( (lv_formacionVal_10_0= ruleTipoFormacion ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_experiencia_11_0= 'experiencia' ) ) otherlv_12= ':' ( (lv_experienciaVal_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_certificacion_14_0= 'certificacion' ) ) otherlv_15= ':' ( (lv_certificacionVal_16_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ) | ( () ( (lv_tipo_18_0= 'Otros' ) ) ( (lv_name_19_0= RULE_ID ) ) otherlv_20= 'calificacion' otherlv_21= ':' ( (lv_valor_22_0= RULE_INT ) ) ) )
            {
            // InternalEvaluacion.g:482:2: ( ( () ( (lv_tipo_1_0= ruleTipoPropuesta ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_criterios_3_0= ruleCriterioPropuesta ) )* ) | ( () ( (lv_tipo_5_0= ruleTipoEquipo ) ) ( (lv_name_6_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_formacion_8_0= 'formacion' ) ) otherlv_9= ':' ( (lv_formacionVal_10_0= ruleTipoFormacion ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_experiencia_11_0= 'experiencia' ) ) otherlv_12= ':' ( (lv_experienciaVal_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_certificacion_14_0= 'certificacion' ) ) otherlv_15= ':' ( (lv_certificacionVal_16_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ) | ( () ( (lv_tipo_18_0= 'Otros' ) ) ( (lv_name_19_0= RULE_ID ) ) otherlv_20= 'calificacion' otherlv_21= ':' ( (lv_valor_22_0= RULE_INT ) ) ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 29:
            case 30:
            case 31:
                {
                alt14=1;
                }
                break;
            case 26:
            case 27:
            case 28:
                {
                alt14=2;
                }
                break;
            case 23:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalEvaluacion.g:483:3: ( () ( (lv_tipo_1_0= ruleTipoPropuesta ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_criterios_3_0= ruleCriterioPropuesta ) )* )
                    {
                    // InternalEvaluacion.g:483:3: ( () ( (lv_tipo_1_0= ruleTipoPropuesta ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_criterios_3_0= ruleCriterioPropuesta ) )* )
                    // InternalEvaluacion.g:484:4: () ( (lv_tipo_1_0= ruleTipoPropuesta ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_criterios_3_0= ruleCriterioPropuesta ) )*
                    {
                    // InternalEvaluacion.g:484:4: ()
                    // InternalEvaluacion.g:485:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEvaluacionAccess().getCalificarPropuestaAction_0_0(),
                    						current);
                    				

                    }

                    // InternalEvaluacion.g:491:4: ( (lv_tipo_1_0= ruleTipoPropuesta ) )
                    // InternalEvaluacion.g:492:5: (lv_tipo_1_0= ruleTipoPropuesta )
                    {
                    // InternalEvaluacion.g:492:5: (lv_tipo_1_0= ruleTipoPropuesta )
                    // InternalEvaluacion.g:493:6: lv_tipo_1_0= ruleTipoPropuesta
                    {

                    						newCompositeNode(grammarAccess.getEvaluacionAccess().getTipoTipoPropuestaEnumRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_tipo_1_0=ruleTipoPropuesta();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEvaluacionRule());
                    						}
                    						set(
                    							current,
                    							"tipo",
                    							lv_tipo_1_0,
                    							"hwo.evtool.dsl.evalcn.Evaluacion.TipoPropuesta");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEvaluacion.g:510:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalEvaluacion.g:511:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalEvaluacion.g:511:5: (lv_name_2_0= RULE_ID )
                    // InternalEvaluacion.g:512:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getEvaluacionAccess().getNameIDTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvaluacionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalEvaluacion.g:528:4: ( (lv_criterios_3_0= ruleCriterioPropuesta ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==25) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalEvaluacion.g:529:5: (lv_criterios_3_0= ruleCriterioPropuesta )
                    	    {
                    	    // InternalEvaluacion.g:529:5: (lv_criterios_3_0= ruleCriterioPropuesta )
                    	    // InternalEvaluacion.g:530:6: lv_criterios_3_0= ruleCriterioPropuesta
                    	    {

                    	    						newCompositeNode(grammarAccess.getEvaluacionAccess().getCriteriosCriterioPropuestaParserRuleCall_0_3_0());
                    	    					
                    	    pushFollow(FOLLOW_16);
                    	    lv_criterios_3_0=ruleCriterioPropuesta();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEvaluacionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"criterios",
                    	    							lv_criterios_3_0,
                    	    							"hwo.evtool.dsl.evalcn.Evaluacion.CriterioPropuesta");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalEvaluacion.g:549:3: ( () ( (lv_tipo_5_0= ruleTipoEquipo ) ) ( (lv_name_6_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_formacion_8_0= 'formacion' ) ) otherlv_9= ':' ( (lv_formacionVal_10_0= ruleTipoFormacion ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_experiencia_11_0= 'experiencia' ) ) otherlv_12= ':' ( (lv_experienciaVal_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_certificacion_14_0= 'certificacion' ) ) otherlv_15= ':' ( (lv_certificacionVal_16_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) )
                    {
                    // InternalEvaluacion.g:549:3: ( () ( (lv_tipo_5_0= ruleTipoEquipo ) ) ( (lv_name_6_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_formacion_8_0= 'formacion' ) ) otherlv_9= ':' ( (lv_formacionVal_10_0= ruleTipoFormacion ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_experiencia_11_0= 'experiencia' ) ) otherlv_12= ':' ( (lv_experienciaVal_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_certificacion_14_0= 'certificacion' ) ) otherlv_15= ':' ( (lv_certificacionVal_16_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) )
                    // InternalEvaluacion.g:550:4: () ( (lv_tipo_5_0= ruleTipoEquipo ) ) ( (lv_name_6_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_formacion_8_0= 'formacion' ) ) otherlv_9= ':' ( (lv_formacionVal_10_0= ruleTipoFormacion ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_experiencia_11_0= 'experiencia' ) ) otherlv_12= ':' ( (lv_experienciaVal_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_certificacion_14_0= 'certificacion' ) ) otherlv_15= ':' ( (lv_certificacionVal_16_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
                    {
                    // InternalEvaluacion.g:550:4: ()
                    // InternalEvaluacion.g:551:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEvaluacionAccess().getCalificarEquipoAction_1_0(),
                    						current);
                    				

                    }

                    // InternalEvaluacion.g:557:4: ( (lv_tipo_5_0= ruleTipoEquipo ) )
                    // InternalEvaluacion.g:558:5: (lv_tipo_5_0= ruleTipoEquipo )
                    {
                    // InternalEvaluacion.g:558:5: (lv_tipo_5_0= ruleTipoEquipo )
                    // InternalEvaluacion.g:559:6: lv_tipo_5_0= ruleTipoEquipo
                    {

                    						newCompositeNode(grammarAccess.getEvaluacionAccess().getTipoTipoEquipoEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_tipo_5_0=ruleTipoEquipo();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEvaluacionRule());
                    						}
                    						set(
                    							current,
                    							"tipo",
                    							lv_tipo_5_0,
                    							"hwo.evtool.dsl.evalcn.Evaluacion.TipoEquipo");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEvaluacion.g:576:4: ( (lv_name_6_0= RULE_ID ) )
                    // InternalEvaluacion.g:577:5: (lv_name_6_0= RULE_ID )
                    {
                    // InternalEvaluacion.g:577:5: (lv_name_6_0= RULE_ID )
                    // InternalEvaluacion.g:578:6: lv_name_6_0= RULE_ID
                    {
                    lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(lv_name_6_0, grammarAccess.getEvaluacionAccess().getNameIDTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvaluacionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_6_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalEvaluacion.g:594:4: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_formacion_8_0= 'formacion' ) ) otherlv_9= ':' ( (lv_formacionVal_10_0= ruleTipoFormacion ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_experiencia_11_0= 'experiencia' ) ) otherlv_12= ':' ( (lv_experienciaVal_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_certificacion_14_0= 'certificacion' ) ) otherlv_15= ':' ( (lv_certificacionVal_16_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
                    // InternalEvaluacion.g:595:5: ( ( ( ({...}? => ( ({...}? => ( ( (lv_formacion_8_0= 'formacion' ) ) otherlv_9= ':' ( (lv_formacionVal_10_0= ruleTipoFormacion ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_experiencia_11_0= 'experiencia' ) ) otherlv_12= ':' ( (lv_experienciaVal_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_certificacion_14_0= 'certificacion' ) ) otherlv_15= ':' ( (lv_certificacionVal_16_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
                    {
                    // InternalEvaluacion.g:595:5: ( ( ( ({...}? => ( ({...}? => ( ( (lv_formacion_8_0= 'formacion' ) ) otherlv_9= ':' ( (lv_formacionVal_10_0= ruleTipoFormacion ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_experiencia_11_0= 'experiencia' ) ) otherlv_12= ':' ( (lv_experienciaVal_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_certificacion_14_0= 'certificacion' ) ) otherlv_15= ':' ( (lv_certificacionVal_16_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
                    // InternalEvaluacion.g:596:6: ( ( ({...}? => ( ({...}? => ( ( (lv_formacion_8_0= 'formacion' ) ) otherlv_9= ':' ( (lv_formacionVal_10_0= ruleTipoFormacion ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_experiencia_11_0= 'experiencia' ) ) otherlv_12= ':' ( (lv_experienciaVal_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_certificacion_14_0= 'certificacion' ) ) otherlv_15= ':' ( (lv_certificacionVal_16_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
                    {
                     
                    					  getUnorderedGroupHelper().enter(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3());
                    					
                    // InternalEvaluacion.g:599:6: ( ( ({...}? => ( ({...}? => ( ( (lv_formacion_8_0= 'formacion' ) ) otherlv_9= ':' ( (lv_formacionVal_10_0= ruleTipoFormacion ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_experiencia_11_0= 'experiencia' ) ) otherlv_12= ':' ( (lv_experienciaVal_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_certificacion_14_0= 'certificacion' ) ) otherlv_15= ':' ( (lv_certificacionVal_16_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
                    // InternalEvaluacion.g:600:7: ( ({...}? => ( ({...}? => ( ( (lv_formacion_8_0= 'formacion' ) ) otherlv_9= ':' ( (lv_formacionVal_10_0= ruleTipoFormacion ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_experiencia_11_0= 'experiencia' ) ) otherlv_12= ':' ( (lv_experienciaVal_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_certificacion_14_0= 'certificacion' ) ) otherlv_15= ':' ( (lv_certificacionVal_16_0= RULE_INT ) ) ) ) ) ) )+ {...}?
                    {
                    // InternalEvaluacion.g:600:7: ( ({...}? => ( ({...}? => ( ( (lv_formacion_8_0= 'formacion' ) ) otherlv_9= ':' ( (lv_formacionVal_10_0= ruleTipoFormacion ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_experiencia_11_0= 'experiencia' ) ) otherlv_12= ':' ( (lv_experienciaVal_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_certificacion_14_0= 'certificacion' ) ) otherlv_15= ':' ( (lv_certificacionVal_16_0= RULE_INT ) ) ) ) ) ) )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=4;
                        int LA13_0 = input.LA(1);

                        if ( LA13_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3(), 0) ) {
                            alt13=1;
                        }
                        else if ( LA13_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3(), 1) ) {
                            alt13=2;
                        }
                        else if ( LA13_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3(), 2) ) {
                            alt13=3;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalEvaluacion.g:601:5: ({...}? => ( ({...}? => ( ( (lv_formacion_8_0= 'formacion' ) ) otherlv_9= ':' ( (lv_formacionVal_10_0= ruleTipoFormacion ) ) ) ) ) )
                    	    {
                    	    // InternalEvaluacion.g:601:5: ({...}? => ( ({...}? => ( ( (lv_formacion_8_0= 'formacion' ) ) otherlv_9= ':' ( (lv_formacionVal_10_0= ruleTipoFormacion ) ) ) ) ) )
                    	    // InternalEvaluacion.g:602:6: {...}? => ( ({...}? => ( ( (lv_formacion_8_0= 'formacion' ) ) otherlv_9= ':' ( (lv_formacionVal_10_0= ruleTipoFormacion ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluacion", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3(), 0)");
                    	    }
                    	    // InternalEvaluacion.g:602:110: ( ({...}? => ( ( (lv_formacion_8_0= 'formacion' ) ) otherlv_9= ':' ( (lv_formacionVal_10_0= ruleTipoFormacion ) ) ) ) )
                    	    // InternalEvaluacion.g:603:7: ({...}? => ( ( (lv_formacion_8_0= 'formacion' ) ) otherlv_9= ':' ( (lv_formacionVal_10_0= ruleTipoFormacion ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3(), 0);
                    	    						
                    	    // InternalEvaluacion.g:606:10: ({...}? => ( ( (lv_formacion_8_0= 'formacion' ) ) otherlv_9= ':' ( (lv_formacionVal_10_0= ruleTipoFormacion ) ) ) )
                    	    // InternalEvaluacion.g:606:11: {...}? => ( ( (lv_formacion_8_0= 'formacion' ) ) otherlv_9= ':' ( (lv_formacionVal_10_0= ruleTipoFormacion ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluacion", "true");
                    	    }
                    	    // InternalEvaluacion.g:606:20: ( ( (lv_formacion_8_0= 'formacion' ) ) otherlv_9= ':' ( (lv_formacionVal_10_0= ruleTipoFormacion ) ) )
                    	    // InternalEvaluacion.g:606:21: ( (lv_formacion_8_0= 'formacion' ) ) otherlv_9= ':' ( (lv_formacionVal_10_0= ruleTipoFormacion ) )
                    	    {
                    	    // InternalEvaluacion.g:606:21: ( (lv_formacion_8_0= 'formacion' ) )
                    	    // InternalEvaluacion.g:607:11: (lv_formacion_8_0= 'formacion' )
                    	    {
                    	    // InternalEvaluacion.g:607:11: (lv_formacion_8_0= 'formacion' )
                    	    // InternalEvaluacion.g:608:12: lv_formacion_8_0= 'formacion'
                    	    {
                    	    lv_formacion_8_0=(Token)match(input,20,FOLLOW_18); 

                    	    												newLeafNode(lv_formacion_8_0, grammarAccess.getEvaluacionAccess().getFormacionFormacionKeyword_1_3_0_0_0());
                    	    											

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getEvaluacionRule());
                    	    												}
                    	    												setWithLastConsumed(current, "formacion", lv_formacion_8_0, "formacion");
                    	    											

                    	    }


                    	    }

                    	    otherlv_9=(Token)match(input,18,FOLLOW_19); 

                    	    										newLeafNode(otherlv_9, grammarAccess.getEvaluacionAccess().getColonKeyword_1_3_0_1());
                    	    									
                    	    // InternalEvaluacion.g:624:10: ( (lv_formacionVal_10_0= ruleTipoFormacion ) )
                    	    // InternalEvaluacion.g:625:11: (lv_formacionVal_10_0= ruleTipoFormacion )
                    	    {
                    	    // InternalEvaluacion.g:625:11: (lv_formacionVal_10_0= ruleTipoFormacion )
                    	    // InternalEvaluacion.g:626:12: lv_formacionVal_10_0= ruleTipoFormacion
                    	    {

                    	    												newCompositeNode(grammarAccess.getEvaluacionAccess().getFormacionValTipoFormacionEnumRuleCall_1_3_0_2_0());
                    	    											
                    	    pushFollow(FOLLOW_20);
                    	    lv_formacionVal_10_0=ruleTipoFormacion();

                    	    state._fsp--;


                    	    												if (current==null) {
                    	    													current = createModelElementForParent(grammarAccess.getEvaluacionRule());
                    	    												}
                    	    												set(
                    	    													current,
                    	    													"formacionVal",
                    	    													lv_formacionVal_10_0,
                    	    													"hwo.evtool.dsl.evalcn.Evaluacion.TipoFormacion");
                    	    												afterParserOrEnumRuleCall();
                    	    											

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalEvaluacion.g:649:5: ({...}? => ( ({...}? => ( ( (lv_experiencia_11_0= 'experiencia' ) ) otherlv_12= ':' ( (lv_experienciaVal_13_0= RULE_INT ) ) ) ) ) )
                    	    {
                    	    // InternalEvaluacion.g:649:5: ({...}? => ( ({...}? => ( ( (lv_experiencia_11_0= 'experiencia' ) ) otherlv_12= ':' ( (lv_experienciaVal_13_0= RULE_INT ) ) ) ) ) )
                    	    // InternalEvaluacion.g:650:6: {...}? => ( ({...}? => ( ( (lv_experiencia_11_0= 'experiencia' ) ) otherlv_12= ':' ( (lv_experienciaVal_13_0= RULE_INT ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluacion", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3(), 1)");
                    	    }
                    	    // InternalEvaluacion.g:650:110: ( ({...}? => ( ( (lv_experiencia_11_0= 'experiencia' ) ) otherlv_12= ':' ( (lv_experienciaVal_13_0= RULE_INT ) ) ) ) )
                    	    // InternalEvaluacion.g:651:7: ({...}? => ( ( (lv_experiencia_11_0= 'experiencia' ) ) otherlv_12= ':' ( (lv_experienciaVal_13_0= RULE_INT ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3(), 1);
                    	    						
                    	    // InternalEvaluacion.g:654:10: ({...}? => ( ( (lv_experiencia_11_0= 'experiencia' ) ) otherlv_12= ':' ( (lv_experienciaVal_13_0= RULE_INT ) ) ) )
                    	    // InternalEvaluacion.g:654:11: {...}? => ( ( (lv_experiencia_11_0= 'experiencia' ) ) otherlv_12= ':' ( (lv_experienciaVal_13_0= RULE_INT ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluacion", "true");
                    	    }
                    	    // InternalEvaluacion.g:654:20: ( ( (lv_experiencia_11_0= 'experiencia' ) ) otherlv_12= ':' ( (lv_experienciaVal_13_0= RULE_INT ) ) )
                    	    // InternalEvaluacion.g:654:21: ( (lv_experiencia_11_0= 'experiencia' ) ) otherlv_12= ':' ( (lv_experienciaVal_13_0= RULE_INT ) )
                    	    {
                    	    // InternalEvaluacion.g:654:21: ( (lv_experiencia_11_0= 'experiencia' ) )
                    	    // InternalEvaluacion.g:655:11: (lv_experiencia_11_0= 'experiencia' )
                    	    {
                    	    // InternalEvaluacion.g:655:11: (lv_experiencia_11_0= 'experiencia' )
                    	    // InternalEvaluacion.g:656:12: lv_experiencia_11_0= 'experiencia'
                    	    {
                    	    lv_experiencia_11_0=(Token)match(input,21,FOLLOW_18); 

                    	    												newLeafNode(lv_experiencia_11_0, grammarAccess.getEvaluacionAccess().getExperienciaExperienciaKeyword_1_3_1_0_0());
                    	    											

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getEvaluacionRule());
                    	    												}
                    	    												setWithLastConsumed(current, "experiencia", lv_experiencia_11_0, "experiencia");
                    	    											

                    	    }


                    	    }

                    	    otherlv_12=(Token)match(input,18,FOLLOW_21); 

                    	    										newLeafNode(otherlv_12, grammarAccess.getEvaluacionAccess().getColonKeyword_1_3_1_1());
                    	    									
                    	    // InternalEvaluacion.g:672:10: ( (lv_experienciaVal_13_0= RULE_INT ) )
                    	    // InternalEvaluacion.g:673:11: (lv_experienciaVal_13_0= RULE_INT )
                    	    {
                    	    // InternalEvaluacion.g:673:11: (lv_experienciaVal_13_0= RULE_INT )
                    	    // InternalEvaluacion.g:674:12: lv_experienciaVal_13_0= RULE_INT
                    	    {
                    	    lv_experienciaVal_13_0=(Token)match(input,RULE_INT,FOLLOW_20); 

                    	    												newLeafNode(lv_experienciaVal_13_0, grammarAccess.getEvaluacionAccess().getExperienciaValINTTerminalRuleCall_1_3_1_2_0());
                    	    											

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getEvaluacionRule());
                    	    												}
                    	    												setWithLastConsumed(
                    	    													current,
                    	    													"experienciaVal",
                    	    													lv_experienciaVal_13_0,
                    	    													"org.eclipse.xtext.common.Terminals.INT");
                    	    											

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalEvaluacion.g:696:5: ({...}? => ( ({...}? => ( ( (lv_certificacion_14_0= 'certificacion' ) ) otherlv_15= ':' ( (lv_certificacionVal_16_0= RULE_INT ) ) ) ) ) )
                    	    {
                    	    // InternalEvaluacion.g:696:5: ({...}? => ( ({...}? => ( ( (lv_certificacion_14_0= 'certificacion' ) ) otherlv_15= ':' ( (lv_certificacionVal_16_0= RULE_INT ) ) ) ) ) )
                    	    // InternalEvaluacion.g:697:6: {...}? => ( ({...}? => ( ( (lv_certificacion_14_0= 'certificacion' ) ) otherlv_15= ':' ( (lv_certificacionVal_16_0= RULE_INT ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluacion", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3(), 2)");
                    	    }
                    	    // InternalEvaluacion.g:697:110: ( ({...}? => ( ( (lv_certificacion_14_0= 'certificacion' ) ) otherlv_15= ':' ( (lv_certificacionVal_16_0= RULE_INT ) ) ) ) )
                    	    // InternalEvaluacion.g:698:7: ({...}? => ( ( (lv_certificacion_14_0= 'certificacion' ) ) otherlv_15= ':' ( (lv_certificacionVal_16_0= RULE_INT ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3(), 2);
                    	    						
                    	    // InternalEvaluacion.g:701:10: ({...}? => ( ( (lv_certificacion_14_0= 'certificacion' ) ) otherlv_15= ':' ( (lv_certificacionVal_16_0= RULE_INT ) ) ) )
                    	    // InternalEvaluacion.g:701:11: {...}? => ( ( (lv_certificacion_14_0= 'certificacion' ) ) otherlv_15= ':' ( (lv_certificacionVal_16_0= RULE_INT ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluacion", "true");
                    	    }
                    	    // InternalEvaluacion.g:701:20: ( ( (lv_certificacion_14_0= 'certificacion' ) ) otherlv_15= ':' ( (lv_certificacionVal_16_0= RULE_INT ) ) )
                    	    // InternalEvaluacion.g:701:21: ( (lv_certificacion_14_0= 'certificacion' ) ) otherlv_15= ':' ( (lv_certificacionVal_16_0= RULE_INT ) )
                    	    {
                    	    // InternalEvaluacion.g:701:21: ( (lv_certificacion_14_0= 'certificacion' ) )
                    	    // InternalEvaluacion.g:702:11: (lv_certificacion_14_0= 'certificacion' )
                    	    {
                    	    // InternalEvaluacion.g:702:11: (lv_certificacion_14_0= 'certificacion' )
                    	    // InternalEvaluacion.g:703:12: lv_certificacion_14_0= 'certificacion'
                    	    {
                    	    lv_certificacion_14_0=(Token)match(input,22,FOLLOW_18); 

                    	    												newLeafNode(lv_certificacion_14_0, grammarAccess.getEvaluacionAccess().getCertificacionCertificacionKeyword_1_3_2_0_0());
                    	    											

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getEvaluacionRule());
                    	    												}
                    	    												setWithLastConsumed(current, "certificacion", lv_certificacion_14_0, "certificacion");
                    	    											

                    	    }


                    	    }

                    	    otherlv_15=(Token)match(input,18,FOLLOW_21); 

                    	    										newLeafNode(otherlv_15, grammarAccess.getEvaluacionAccess().getColonKeyword_1_3_2_1());
                    	    									
                    	    // InternalEvaluacion.g:719:10: ( (lv_certificacionVal_16_0= RULE_INT ) )
                    	    // InternalEvaluacion.g:720:11: (lv_certificacionVal_16_0= RULE_INT )
                    	    {
                    	    // InternalEvaluacion.g:720:11: (lv_certificacionVal_16_0= RULE_INT )
                    	    // InternalEvaluacion.g:721:12: lv_certificacionVal_16_0= RULE_INT
                    	    {
                    	    lv_certificacionVal_16_0=(Token)match(input,RULE_INT,FOLLOW_20); 

                    	    												newLeafNode(lv_certificacionVal_16_0, grammarAccess.getEvaluacionAccess().getCertificacionValINTTerminalRuleCall_1_3_2_2_0());
                    	    											

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getEvaluacionRule());
                    	    												}
                    	    												setWithLastConsumed(
                    	    													current,
                    	    													"certificacionVal",
                    	    													lv_certificacionVal_16_0,
                    	    													"org.eclipse.xtext.common.Terminals.INT");
                    	    											

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);

                    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3()) ) {
                        throw new FailedPredicateException(input, "ruleEvaluacion", "getUnorderedGroupHelper().canLeave(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3())");
                    }

                    }


                    }

                     
                    					  getUnorderedGroupHelper().leave(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3());
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalEvaluacion.g:753:3: ( () ( (lv_tipo_18_0= 'Otros' ) ) ( (lv_name_19_0= RULE_ID ) ) otherlv_20= 'calificacion' otherlv_21= ':' ( (lv_valor_22_0= RULE_INT ) ) )
                    {
                    // InternalEvaluacion.g:753:3: ( () ( (lv_tipo_18_0= 'Otros' ) ) ( (lv_name_19_0= RULE_ID ) ) otherlv_20= 'calificacion' otherlv_21= ':' ( (lv_valor_22_0= RULE_INT ) ) )
                    // InternalEvaluacion.g:754:4: () ( (lv_tipo_18_0= 'Otros' ) ) ( (lv_name_19_0= RULE_ID ) ) otherlv_20= 'calificacion' otherlv_21= ':' ( (lv_valor_22_0= RULE_INT ) )
                    {
                    // InternalEvaluacion.g:754:4: ()
                    // InternalEvaluacion.g:755:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEvaluacionAccess().getCalificarOtrosAction_2_0(),
                    						current);
                    				

                    }

                    // InternalEvaluacion.g:761:4: ( (lv_tipo_18_0= 'Otros' ) )
                    // InternalEvaluacion.g:762:5: (lv_tipo_18_0= 'Otros' )
                    {
                    // InternalEvaluacion.g:762:5: (lv_tipo_18_0= 'Otros' )
                    // InternalEvaluacion.g:763:6: lv_tipo_18_0= 'Otros'
                    {
                    lv_tipo_18_0=(Token)match(input,23,FOLLOW_3); 

                    						newLeafNode(lv_tipo_18_0, grammarAccess.getEvaluacionAccess().getTipoOtrosKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvaluacionRule());
                    						}
                    						setWithLastConsumed(current, "tipo", lv_tipo_18_0, "Otros");
                    					

                    }


                    }

                    // InternalEvaluacion.g:775:4: ( (lv_name_19_0= RULE_ID ) )
                    // InternalEvaluacion.g:776:5: (lv_name_19_0= RULE_ID )
                    {
                    // InternalEvaluacion.g:776:5: (lv_name_19_0= RULE_ID )
                    // InternalEvaluacion.g:777:6: lv_name_19_0= RULE_ID
                    {
                    lv_name_19_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(lv_name_19_0, grammarAccess.getEvaluacionAccess().getNameIDTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvaluacionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_19_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_20=(Token)match(input,24,FOLLOW_18); 

                    				newLeafNode(otherlv_20, grammarAccess.getEvaluacionAccess().getCalificacionKeyword_2_3());
                    			
                    otherlv_21=(Token)match(input,18,FOLLOW_21); 

                    				newLeafNode(otherlv_21, grammarAccess.getEvaluacionAccess().getColonKeyword_2_4());
                    			
                    // InternalEvaluacion.g:801:4: ( (lv_valor_22_0= RULE_INT ) )
                    // InternalEvaluacion.g:802:5: (lv_valor_22_0= RULE_INT )
                    {
                    // InternalEvaluacion.g:802:5: (lv_valor_22_0= RULE_INT )
                    // InternalEvaluacion.g:803:6: lv_valor_22_0= RULE_INT
                    {
                    lv_valor_22_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_valor_22_0, grammarAccess.getEvaluacionAccess().getValorINTTerminalRuleCall_2_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvaluacionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"valor",
                    							lv_valor_22_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

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
    // $ANTLR end "ruleEvaluacion"


    // $ANTLR start "entryRuleCriterioPropuesta"
    // InternalEvaluacion.g:824:1: entryRuleCriterioPropuesta returns [EObject current=null] : iv_ruleCriterioPropuesta= ruleCriterioPropuesta EOF ;
    public final EObject entryRuleCriterioPropuesta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCriterioPropuesta = null;


        try {
            // InternalEvaluacion.g:824:58: (iv_ruleCriterioPropuesta= ruleCriterioPropuesta EOF )
            // InternalEvaluacion.g:825:2: iv_ruleCriterioPropuesta= ruleCriterioPropuesta EOF
            {
             newCompositeNode(grammarAccess.getCriterioPropuestaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCriterioPropuesta=ruleCriterioPropuesta();

            state._fsp--;

             current =iv_ruleCriterioPropuesta; 
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
    // $ANTLR end "entryRuleCriterioPropuesta"


    // $ANTLR start "ruleCriterioPropuesta"
    // InternalEvaluacion.g:831:1: ruleCriterioPropuesta returns [EObject current=null] : (otherlv_0= 'criterio' otherlv_1= ':' ( (lv_criterio_2_0= RULE_STRING ) ) otherlv_3= 'calificacion' otherlv_4= ':' ( (lv_puntuacion_5_0= ruleE_Calificacion ) ) ) ;
    public final EObject ruleCriterioPropuesta() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_criterio_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Enumerator lv_puntuacion_5_0 = null;



        	enterRule();

        try {
            // InternalEvaluacion.g:837:2: ( (otherlv_0= 'criterio' otherlv_1= ':' ( (lv_criterio_2_0= RULE_STRING ) ) otherlv_3= 'calificacion' otherlv_4= ':' ( (lv_puntuacion_5_0= ruleE_Calificacion ) ) ) )
            // InternalEvaluacion.g:838:2: (otherlv_0= 'criterio' otherlv_1= ':' ( (lv_criterio_2_0= RULE_STRING ) ) otherlv_3= 'calificacion' otherlv_4= ':' ( (lv_puntuacion_5_0= ruleE_Calificacion ) ) )
            {
            // InternalEvaluacion.g:838:2: (otherlv_0= 'criterio' otherlv_1= ':' ( (lv_criterio_2_0= RULE_STRING ) ) otherlv_3= 'calificacion' otherlv_4= ':' ( (lv_puntuacion_5_0= ruleE_Calificacion ) ) )
            // InternalEvaluacion.g:839:3: otherlv_0= 'criterio' otherlv_1= ':' ( (lv_criterio_2_0= RULE_STRING ) ) otherlv_3= 'calificacion' otherlv_4= ':' ( (lv_puntuacion_5_0= ruleE_Calificacion ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getCriterioPropuestaAccess().getCriterioKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getCriterioPropuestaAccess().getColonKeyword_1());
            		
            // InternalEvaluacion.g:847:3: ( (lv_criterio_2_0= RULE_STRING ) )
            // InternalEvaluacion.g:848:4: (lv_criterio_2_0= RULE_STRING )
            {
            // InternalEvaluacion.g:848:4: (lv_criterio_2_0= RULE_STRING )
            // InternalEvaluacion.g:849:5: lv_criterio_2_0= RULE_STRING
            {
            lv_criterio_2_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_criterio_2_0, grammarAccess.getCriterioPropuestaAccess().getCriterioSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCriterioPropuestaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"criterio",
            						lv_criterio_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getCriterioPropuestaAccess().getCalificacionKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getCriterioPropuestaAccess().getColonKeyword_4());
            		
            // InternalEvaluacion.g:873:3: ( (lv_puntuacion_5_0= ruleE_Calificacion ) )
            // InternalEvaluacion.g:874:4: (lv_puntuacion_5_0= ruleE_Calificacion )
            {
            // InternalEvaluacion.g:874:4: (lv_puntuacion_5_0= ruleE_Calificacion )
            // InternalEvaluacion.g:875:5: lv_puntuacion_5_0= ruleE_Calificacion
            {

            					newCompositeNode(grammarAccess.getCriterioPropuestaAccess().getPuntuacionE_CalificacionEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_puntuacion_5_0=ruleE_Calificacion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCriterioPropuestaRule());
            					}
            					set(
            						current,
            						"puntuacion",
            						lv_puntuacion_5_0,
            						"hwo.evtool.dsl.evalcn.Evaluacion.E_Calificacion");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleCriterioPropuesta"


    // $ANTLR start "ruleTipoEquipo"
    // InternalEvaluacion.g:896:1: ruleTipoEquipo returns [Enumerator current=null] : ( (enumLiteral_0= 'EvaluarArquitecto' ) | (enumLiteral_1= 'EvaluarDirector' ) | (enumLiteral_2= 'EvaluarEducacion' ) ) ;
    public final Enumerator ruleTipoEquipo() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalEvaluacion.g:902:2: ( ( (enumLiteral_0= 'EvaluarArquitecto' ) | (enumLiteral_1= 'EvaluarDirector' ) | (enumLiteral_2= 'EvaluarEducacion' ) ) )
            // InternalEvaluacion.g:903:2: ( (enumLiteral_0= 'EvaluarArquitecto' ) | (enumLiteral_1= 'EvaluarDirector' ) | (enumLiteral_2= 'EvaluarEducacion' ) )
            {
            // InternalEvaluacion.g:903:2: ( (enumLiteral_0= 'EvaluarArquitecto' ) | (enumLiteral_1= 'EvaluarDirector' ) | (enumLiteral_2= 'EvaluarEducacion' ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt15=1;
                }
                break;
            case 27:
                {
                alt15=2;
                }
                break;
            case 28:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalEvaluacion.g:904:3: (enumLiteral_0= 'EvaluarArquitecto' )
                    {
                    // InternalEvaluacion.g:904:3: (enumLiteral_0= 'EvaluarArquitecto' )
                    // InternalEvaluacion.g:905:4: enumLiteral_0= 'EvaluarArquitecto'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getTipoEquipoAccess().getEvaluarArquitectoEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTipoEquipoAccess().getEvaluarArquitectoEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEvaluacion.g:912:3: (enumLiteral_1= 'EvaluarDirector' )
                    {
                    // InternalEvaluacion.g:912:3: (enumLiteral_1= 'EvaluarDirector' )
                    // InternalEvaluacion.g:913:4: enumLiteral_1= 'EvaluarDirector'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getTipoEquipoAccess().getEvaluarDirectorEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTipoEquipoAccess().getEvaluarDirectorEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEvaluacion.g:920:3: (enumLiteral_2= 'EvaluarEducacion' )
                    {
                    // InternalEvaluacion.g:920:3: (enumLiteral_2= 'EvaluarEducacion' )
                    // InternalEvaluacion.g:921:4: enumLiteral_2= 'EvaluarEducacion'
                    {
                    enumLiteral_2=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getTipoEquipoAccess().getEvaluarEducacionEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTipoEquipoAccess().getEvaluarEducacionEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleTipoEquipo"


    // $ANTLR start "ruleTipoPropuesta"
    // InternalEvaluacion.g:931:1: ruleTipoPropuesta returns [Enumerator current=null] : ( (enumLiteral_0= 'EvaluarProblema' ) | (enumLiteral_1= 'EvaluarTecnica' ) | (enumLiteral_2= 'EvaluarOtros' ) ) ;
    public final Enumerator ruleTipoPropuesta() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalEvaluacion.g:937:2: ( ( (enumLiteral_0= 'EvaluarProblema' ) | (enumLiteral_1= 'EvaluarTecnica' ) | (enumLiteral_2= 'EvaluarOtros' ) ) )
            // InternalEvaluacion.g:938:2: ( (enumLiteral_0= 'EvaluarProblema' ) | (enumLiteral_1= 'EvaluarTecnica' ) | (enumLiteral_2= 'EvaluarOtros' ) )
            {
            // InternalEvaluacion.g:938:2: ( (enumLiteral_0= 'EvaluarProblema' ) | (enumLiteral_1= 'EvaluarTecnica' ) | (enumLiteral_2= 'EvaluarOtros' ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt16=1;
                }
                break;
            case 30:
                {
                alt16=2;
                }
                break;
            case 31:
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
                    // InternalEvaluacion.g:939:3: (enumLiteral_0= 'EvaluarProblema' )
                    {
                    // InternalEvaluacion.g:939:3: (enumLiteral_0= 'EvaluarProblema' )
                    // InternalEvaluacion.g:940:4: enumLiteral_0= 'EvaluarProblema'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getTipoPropuestaAccess().getEvaluarProblemaEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTipoPropuestaAccess().getEvaluarProblemaEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEvaluacion.g:947:3: (enumLiteral_1= 'EvaluarTecnica' )
                    {
                    // InternalEvaluacion.g:947:3: (enumLiteral_1= 'EvaluarTecnica' )
                    // InternalEvaluacion.g:948:4: enumLiteral_1= 'EvaluarTecnica'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getTipoPropuestaAccess().getEvaluarTecnicaEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTipoPropuestaAccess().getEvaluarTecnicaEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEvaluacion.g:955:3: (enumLiteral_2= 'EvaluarOtros' )
                    {
                    // InternalEvaluacion.g:955:3: (enumLiteral_2= 'EvaluarOtros' )
                    // InternalEvaluacion.g:956:4: enumLiteral_2= 'EvaluarOtros'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getTipoPropuestaAccess().getEvaluarOtrosEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTipoPropuestaAccess().getEvaluarOtrosEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleTipoPropuesta"


    // $ANTLR start "ruleE_Calificacion"
    // InternalEvaluacion.g:966:1: ruleE_Calificacion returns [Enumerator current=null] : ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 'M' ) | (enumLiteral_2= 'B' ) ) ;
    public final Enumerator ruleE_Calificacion() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalEvaluacion.g:972:2: ( ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 'M' ) | (enumLiteral_2= 'B' ) ) )
            // InternalEvaluacion.g:973:2: ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 'M' ) | (enumLiteral_2= 'B' ) )
            {
            // InternalEvaluacion.g:973:2: ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 'M' ) | (enumLiteral_2= 'B' ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt17=1;
                }
                break;
            case 33:
                {
                alt17=2;
                }
                break;
            case 34:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalEvaluacion.g:974:3: (enumLiteral_0= 'A' )
                    {
                    // InternalEvaluacion.g:974:3: (enumLiteral_0= 'A' )
                    // InternalEvaluacion.g:975:4: enumLiteral_0= 'A'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getE_CalificacionAccess().getAltoEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getE_CalificacionAccess().getAltoEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEvaluacion.g:982:3: (enumLiteral_1= 'M' )
                    {
                    // InternalEvaluacion.g:982:3: (enumLiteral_1= 'M' )
                    // InternalEvaluacion.g:983:4: enumLiteral_1= 'M'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getE_CalificacionAccess().getMedioEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getE_CalificacionAccess().getMedioEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEvaluacion.g:990:3: (enumLiteral_2= 'B' )
                    {
                    // InternalEvaluacion.g:990:3: (enumLiteral_2= 'B' )
                    // InternalEvaluacion.g:991:4: enumLiteral_2= 'B'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getE_CalificacionAccess().getBajoEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getE_CalificacionAccess().getBajoEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleE_Calificacion"


    // $ANTLR start "ruleTipoFormacion"
    // InternalEvaluacion.g:1001:1: ruleTipoFormacion returns [Enumerator current=null] : ( (enumLiteral_0= 'Especializacion' ) | (enumLiteral_1= 'Maestria' ) | (enumLiteral_2= 'Doctorado' ) ) ;
    public final Enumerator ruleTipoFormacion() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalEvaluacion.g:1007:2: ( ( (enumLiteral_0= 'Especializacion' ) | (enumLiteral_1= 'Maestria' ) | (enumLiteral_2= 'Doctorado' ) ) )
            // InternalEvaluacion.g:1008:2: ( (enumLiteral_0= 'Especializacion' ) | (enumLiteral_1= 'Maestria' ) | (enumLiteral_2= 'Doctorado' ) )
            {
            // InternalEvaluacion.g:1008:2: ( (enumLiteral_0= 'Especializacion' ) | (enumLiteral_1= 'Maestria' ) | (enumLiteral_2= 'Doctorado' ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt18=1;
                }
                break;
            case 36:
                {
                alt18=2;
                }
                break;
            case 37:
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
                    // InternalEvaluacion.g:1009:3: (enumLiteral_0= 'Especializacion' )
                    {
                    // InternalEvaluacion.g:1009:3: (enumLiteral_0= 'Especializacion' )
                    // InternalEvaluacion.g:1010:4: enumLiteral_0= 'Especializacion'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getTipoFormacionAccess().getEspecializacionEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTipoFormacionAccess().getEspecializacionEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEvaluacion.g:1017:3: (enumLiteral_1= 'Maestria' )
                    {
                    // InternalEvaluacion.g:1017:3: (enumLiteral_1= 'Maestria' )
                    // InternalEvaluacion.g:1018:4: enumLiteral_1= 'Maestria'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getTipoFormacionAccess().getMaestriaEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTipoFormacionAccess().getMaestriaEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEvaluacion.g:1025:3: (enumLiteral_2= 'Doctorado' )
                    {
                    // InternalEvaluacion.g:1025:3: (enumLiteral_2= 'Doctorado' )
                    // InternalEvaluacion.g:1026:4: enumLiteral_2= 'Doctorado'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getTipoFormacionAccess().getDoctoradoEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTipoFormacionAccess().getDoctoradoEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleTipoFormacion"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000007012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000FC800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000FC804002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000003800000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000700000000L});

}
