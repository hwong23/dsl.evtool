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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'eventos'", "'resetEvents'", "'evaluaciones'", "'componente'", "'actions'", "'{'", "'}'", "':'", "'=>'", "'calificacion'", "'formacion'", "'experiencia'", "'certificacion'", "'Otros'", "'EvaluarArquitecto'", "'EvaluarDirector'", "'EvaluarEducacion'", "'EvaluarProblema'", "'EvaluarTecnica'", "'EvaluarOtros'", "'A'", "'M'", "'B'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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

                        if ( ((LA5_0>=24 && LA5_0<=30)) ) {
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
    // InternalEvaluacion.g:475:1: ruleEvaluacion returns [EObject current=null] : ( ( () ( (lv_tipo_1_0= ruleTipoPropuesta ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'calificacion' otherlv_4= ':' ( (lv_puntuacion_5_0= ruleE_Calificacion ) ) ) | ( () ( (lv_tipo_7_0= ruleTipoEquipo ) ) ( (lv_name_8_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_formacion_10_0= 'formacion' ) ) otherlv_11= ':' ( (lv_formacionVal_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_experiencia_13_0= 'experiencia' ) ) otherlv_14= ':' ( (lv_experienciaVal_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_certificacion_16_0= 'certificacion' ) ) otherlv_17= ':' ( (lv_certificacionVal_18_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ) | ( () ( (lv_tipo_20_0= 'Otros' ) ) ( (lv_name_21_0= RULE_ID ) ) otherlv_22= 'calificacion' otherlv_23= ':' ( (lv_valor_24_0= RULE_INT ) ) ) ) ;
    public final EObject ruleEvaluacion() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_8_0=null;
        Token lv_formacion_10_0=null;
        Token otherlv_11=null;
        Token lv_formacionVal_12_0=null;
        Token lv_experiencia_13_0=null;
        Token otherlv_14=null;
        Token lv_experienciaVal_15_0=null;
        Token lv_certificacion_16_0=null;
        Token otherlv_17=null;
        Token lv_certificacionVal_18_0=null;
        Token lv_tipo_20_0=null;
        Token lv_name_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token lv_valor_24_0=null;
        Enumerator lv_tipo_1_0 = null;

        Enumerator lv_puntuacion_5_0 = null;

        Enumerator lv_tipo_7_0 = null;



        	enterRule();

        try {
            // InternalEvaluacion.g:481:2: ( ( ( () ( (lv_tipo_1_0= ruleTipoPropuesta ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'calificacion' otherlv_4= ':' ( (lv_puntuacion_5_0= ruleE_Calificacion ) ) ) | ( () ( (lv_tipo_7_0= ruleTipoEquipo ) ) ( (lv_name_8_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_formacion_10_0= 'formacion' ) ) otherlv_11= ':' ( (lv_formacionVal_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_experiencia_13_0= 'experiencia' ) ) otherlv_14= ':' ( (lv_experienciaVal_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_certificacion_16_0= 'certificacion' ) ) otherlv_17= ':' ( (lv_certificacionVal_18_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ) | ( () ( (lv_tipo_20_0= 'Otros' ) ) ( (lv_name_21_0= RULE_ID ) ) otherlv_22= 'calificacion' otherlv_23= ':' ( (lv_valor_24_0= RULE_INT ) ) ) ) )
            // InternalEvaluacion.g:482:2: ( ( () ( (lv_tipo_1_0= ruleTipoPropuesta ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'calificacion' otherlv_4= ':' ( (lv_puntuacion_5_0= ruleE_Calificacion ) ) ) | ( () ( (lv_tipo_7_0= ruleTipoEquipo ) ) ( (lv_name_8_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_formacion_10_0= 'formacion' ) ) otherlv_11= ':' ( (lv_formacionVal_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_experiencia_13_0= 'experiencia' ) ) otherlv_14= ':' ( (lv_experienciaVal_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_certificacion_16_0= 'certificacion' ) ) otherlv_17= ':' ( (lv_certificacionVal_18_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ) | ( () ( (lv_tipo_20_0= 'Otros' ) ) ( (lv_name_21_0= RULE_ID ) ) otherlv_22= 'calificacion' otherlv_23= ':' ( (lv_valor_24_0= RULE_INT ) ) ) )
            {
            // InternalEvaluacion.g:482:2: ( ( () ( (lv_tipo_1_0= ruleTipoPropuesta ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'calificacion' otherlv_4= ':' ( (lv_puntuacion_5_0= ruleE_Calificacion ) ) ) | ( () ( (lv_tipo_7_0= ruleTipoEquipo ) ) ( (lv_name_8_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_formacion_10_0= 'formacion' ) ) otherlv_11= ':' ( (lv_formacionVal_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_experiencia_13_0= 'experiencia' ) ) otherlv_14= ':' ( (lv_experienciaVal_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_certificacion_16_0= 'certificacion' ) ) otherlv_17= ':' ( (lv_certificacionVal_18_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ) | ( () ( (lv_tipo_20_0= 'Otros' ) ) ( (lv_name_21_0= RULE_ID ) ) otherlv_22= 'calificacion' otherlv_23= ':' ( (lv_valor_24_0= RULE_INT ) ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 28:
            case 29:
            case 30:
                {
                alt13=1;
                }
                break;
            case 25:
            case 26:
            case 27:
                {
                alt13=2;
                }
                break;
            case 24:
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
                    // InternalEvaluacion.g:483:3: ( () ( (lv_tipo_1_0= ruleTipoPropuesta ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'calificacion' otherlv_4= ':' ( (lv_puntuacion_5_0= ruleE_Calificacion ) ) )
                    {
                    // InternalEvaluacion.g:483:3: ( () ( (lv_tipo_1_0= ruleTipoPropuesta ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'calificacion' otherlv_4= ':' ( (lv_puntuacion_5_0= ruleE_Calificacion ) ) )
                    // InternalEvaluacion.g:484:4: () ( (lv_tipo_1_0= ruleTipoPropuesta ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'calificacion' otherlv_4= ':' ( (lv_puntuacion_5_0= ruleE_Calificacion ) )
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

                    otherlv_3=(Token)match(input,20,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getEvaluacionAccess().getCalificacionKeyword_0_3());
                    			
                    otherlv_4=(Token)match(input,18,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getEvaluacionAccess().getColonKeyword_0_4());
                    			
                    // InternalEvaluacion.g:536:4: ( (lv_puntuacion_5_0= ruleE_Calificacion ) )
                    // InternalEvaluacion.g:537:5: (lv_puntuacion_5_0= ruleE_Calificacion )
                    {
                    // InternalEvaluacion.g:537:5: (lv_puntuacion_5_0= ruleE_Calificacion )
                    // InternalEvaluacion.g:538:6: lv_puntuacion_5_0= ruleE_Calificacion
                    {

                    						newCompositeNode(grammarAccess.getEvaluacionAccess().getPuntuacionE_CalificacionEnumRuleCall_0_5_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_puntuacion_5_0=ruleE_Calificacion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEvaluacionRule());
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
                    break;
                case 2 :
                    // InternalEvaluacion.g:557:3: ( () ( (lv_tipo_7_0= ruleTipoEquipo ) ) ( (lv_name_8_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_formacion_10_0= 'formacion' ) ) otherlv_11= ':' ( (lv_formacionVal_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_experiencia_13_0= 'experiencia' ) ) otherlv_14= ':' ( (lv_experienciaVal_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_certificacion_16_0= 'certificacion' ) ) otherlv_17= ':' ( (lv_certificacionVal_18_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) )
                    {
                    // InternalEvaluacion.g:557:3: ( () ( (lv_tipo_7_0= ruleTipoEquipo ) ) ( (lv_name_8_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_formacion_10_0= 'formacion' ) ) otherlv_11= ':' ( (lv_formacionVal_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_experiencia_13_0= 'experiencia' ) ) otherlv_14= ':' ( (lv_experienciaVal_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_certificacion_16_0= 'certificacion' ) ) otherlv_17= ':' ( (lv_certificacionVal_18_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) )
                    // InternalEvaluacion.g:558:4: () ( (lv_tipo_7_0= ruleTipoEquipo ) ) ( (lv_name_8_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_formacion_10_0= 'formacion' ) ) otherlv_11= ':' ( (lv_formacionVal_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_experiencia_13_0= 'experiencia' ) ) otherlv_14= ':' ( (lv_experienciaVal_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_certificacion_16_0= 'certificacion' ) ) otherlv_17= ':' ( (lv_certificacionVal_18_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
                    {
                    // InternalEvaluacion.g:558:4: ()
                    // InternalEvaluacion.g:559:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEvaluacionAccess().getCalificarEquipoAction_1_0(),
                    						current);
                    				

                    }

                    // InternalEvaluacion.g:565:4: ( (lv_tipo_7_0= ruleTipoEquipo ) )
                    // InternalEvaluacion.g:566:5: (lv_tipo_7_0= ruleTipoEquipo )
                    {
                    // InternalEvaluacion.g:566:5: (lv_tipo_7_0= ruleTipoEquipo )
                    // InternalEvaluacion.g:567:6: lv_tipo_7_0= ruleTipoEquipo
                    {

                    						newCompositeNode(grammarAccess.getEvaluacionAccess().getTipoTipoEquipoEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_tipo_7_0=ruleTipoEquipo();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEvaluacionRule());
                    						}
                    						set(
                    							current,
                    							"tipo",
                    							lv_tipo_7_0,
                    							"hwo.evtool.dsl.evalcn.Evaluacion.TipoEquipo");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEvaluacion.g:584:4: ( (lv_name_8_0= RULE_ID ) )
                    // InternalEvaluacion.g:585:5: (lv_name_8_0= RULE_ID )
                    {
                    // InternalEvaluacion.g:585:5: (lv_name_8_0= RULE_ID )
                    // InternalEvaluacion.g:586:6: lv_name_8_0= RULE_ID
                    {
                    lv_name_8_0=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(lv_name_8_0, grammarAccess.getEvaluacionAccess().getNameIDTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvaluacionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_8_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalEvaluacion.g:602:4: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_formacion_10_0= 'formacion' ) ) otherlv_11= ':' ( (lv_formacionVal_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_experiencia_13_0= 'experiencia' ) ) otherlv_14= ':' ( (lv_experienciaVal_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_certificacion_16_0= 'certificacion' ) ) otherlv_17= ':' ( (lv_certificacionVal_18_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
                    // InternalEvaluacion.g:603:5: ( ( ( ({...}? => ( ({...}? => ( ( (lv_formacion_10_0= 'formacion' ) ) otherlv_11= ':' ( (lv_formacionVal_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_experiencia_13_0= 'experiencia' ) ) otherlv_14= ':' ( (lv_experienciaVal_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_certificacion_16_0= 'certificacion' ) ) otherlv_17= ':' ( (lv_certificacionVal_18_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
                    {
                    // InternalEvaluacion.g:603:5: ( ( ( ({...}? => ( ({...}? => ( ( (lv_formacion_10_0= 'formacion' ) ) otherlv_11= ':' ( (lv_formacionVal_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_experiencia_13_0= 'experiencia' ) ) otherlv_14= ':' ( (lv_experienciaVal_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_certificacion_16_0= 'certificacion' ) ) otherlv_17= ':' ( (lv_certificacionVal_18_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
                    // InternalEvaluacion.g:604:6: ( ( ({...}? => ( ({...}? => ( ( (lv_formacion_10_0= 'formacion' ) ) otherlv_11= ':' ( (lv_formacionVal_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_experiencia_13_0= 'experiencia' ) ) otherlv_14= ':' ( (lv_experienciaVal_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_certificacion_16_0= 'certificacion' ) ) otherlv_17= ':' ( (lv_certificacionVal_18_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
                    {
                     
                    					  getUnorderedGroupHelper().enter(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3());
                    					
                    // InternalEvaluacion.g:607:6: ( ( ({...}? => ( ({...}? => ( ( (lv_formacion_10_0= 'formacion' ) ) otherlv_11= ':' ( (lv_formacionVal_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_experiencia_13_0= 'experiencia' ) ) otherlv_14= ':' ( (lv_experienciaVal_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_certificacion_16_0= 'certificacion' ) ) otherlv_17= ':' ( (lv_certificacionVal_18_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
                    // InternalEvaluacion.g:608:7: ( ({...}? => ( ({...}? => ( ( (lv_formacion_10_0= 'formacion' ) ) otherlv_11= ':' ( (lv_formacionVal_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_experiencia_13_0= 'experiencia' ) ) otherlv_14= ':' ( (lv_experienciaVal_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_certificacion_16_0= 'certificacion' ) ) otherlv_17= ':' ( (lv_certificacionVal_18_0= RULE_INT ) ) ) ) ) ) )+ {...}?
                    {
                    // InternalEvaluacion.g:608:7: ( ({...}? => ( ({...}? => ( ( (lv_formacion_10_0= 'formacion' ) ) otherlv_11= ':' ( (lv_formacionVal_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_experiencia_13_0= 'experiencia' ) ) otherlv_14= ':' ( (lv_experienciaVal_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_certificacion_16_0= 'certificacion' ) ) otherlv_17= ':' ( (lv_certificacionVal_18_0= RULE_INT ) ) ) ) ) ) )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=4;
                        int LA12_0 = input.LA(1);

                        if ( LA12_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3(), 0) ) {
                            alt12=1;
                        }
                        else if ( LA12_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3(), 1) ) {
                            alt12=2;
                        }
                        else if ( LA12_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3(), 2) ) {
                            alt12=3;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalEvaluacion.g:609:5: ({...}? => ( ({...}? => ( ( (lv_formacion_10_0= 'formacion' ) ) otherlv_11= ':' ( (lv_formacionVal_12_0= RULE_INT ) ) ) ) ) )
                    	    {
                    	    // InternalEvaluacion.g:609:5: ({...}? => ( ({...}? => ( ( (lv_formacion_10_0= 'formacion' ) ) otherlv_11= ':' ( (lv_formacionVal_12_0= RULE_INT ) ) ) ) ) )
                    	    // InternalEvaluacion.g:610:6: {...}? => ( ({...}? => ( ( (lv_formacion_10_0= 'formacion' ) ) otherlv_11= ':' ( (lv_formacionVal_12_0= RULE_INT ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluacion", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3(), 0)");
                    	    }
                    	    // InternalEvaluacion.g:610:110: ( ({...}? => ( ( (lv_formacion_10_0= 'formacion' ) ) otherlv_11= ':' ( (lv_formacionVal_12_0= RULE_INT ) ) ) ) )
                    	    // InternalEvaluacion.g:611:7: ({...}? => ( ( (lv_formacion_10_0= 'formacion' ) ) otherlv_11= ':' ( (lv_formacionVal_12_0= RULE_INT ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3(), 0);
                    	    						
                    	    // InternalEvaluacion.g:614:10: ({...}? => ( ( (lv_formacion_10_0= 'formacion' ) ) otherlv_11= ':' ( (lv_formacionVal_12_0= RULE_INT ) ) ) )
                    	    // InternalEvaluacion.g:614:11: {...}? => ( ( (lv_formacion_10_0= 'formacion' ) ) otherlv_11= ':' ( (lv_formacionVal_12_0= RULE_INT ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluacion", "true");
                    	    }
                    	    // InternalEvaluacion.g:614:20: ( ( (lv_formacion_10_0= 'formacion' ) ) otherlv_11= ':' ( (lv_formacionVal_12_0= RULE_INT ) ) )
                    	    // InternalEvaluacion.g:614:21: ( (lv_formacion_10_0= 'formacion' ) ) otherlv_11= ':' ( (lv_formacionVal_12_0= RULE_INT ) )
                    	    {
                    	    // InternalEvaluacion.g:614:21: ( (lv_formacion_10_0= 'formacion' ) )
                    	    // InternalEvaluacion.g:615:11: (lv_formacion_10_0= 'formacion' )
                    	    {
                    	    // InternalEvaluacion.g:615:11: (lv_formacion_10_0= 'formacion' )
                    	    // InternalEvaluacion.g:616:12: lv_formacion_10_0= 'formacion'
                    	    {
                    	    lv_formacion_10_0=(Token)match(input,21,FOLLOW_17); 

                    	    												newLeafNode(lv_formacion_10_0, grammarAccess.getEvaluacionAccess().getFormacionFormacionKeyword_1_3_0_0_0());
                    	    											

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getEvaluacionRule());
                    	    												}
                    	    												setWithLastConsumed(current, "formacion", lv_formacion_10_0, "formacion");
                    	    											

                    	    }


                    	    }

                    	    otherlv_11=(Token)match(input,18,FOLLOW_20); 

                    	    										newLeafNode(otherlv_11, grammarAccess.getEvaluacionAccess().getColonKeyword_1_3_0_1());
                    	    									
                    	    // InternalEvaluacion.g:632:10: ( (lv_formacionVal_12_0= RULE_INT ) )
                    	    // InternalEvaluacion.g:633:11: (lv_formacionVal_12_0= RULE_INT )
                    	    {
                    	    // InternalEvaluacion.g:633:11: (lv_formacionVal_12_0= RULE_INT )
                    	    // InternalEvaluacion.g:634:12: lv_formacionVal_12_0= RULE_INT
                    	    {
                    	    lv_formacionVal_12_0=(Token)match(input,RULE_INT,FOLLOW_21); 

                    	    												newLeafNode(lv_formacionVal_12_0, grammarAccess.getEvaluacionAccess().getFormacionValINTTerminalRuleCall_1_3_0_2_0());
                    	    											

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getEvaluacionRule());
                    	    												}
                    	    												setWithLastConsumed(
                    	    													current,
                    	    													"formacionVal",
                    	    													lv_formacionVal_12_0,
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
                    	case 2 :
                    	    // InternalEvaluacion.g:656:5: ({...}? => ( ({...}? => ( ( (lv_experiencia_13_0= 'experiencia' ) ) otherlv_14= ':' ( (lv_experienciaVal_15_0= RULE_INT ) ) ) ) ) )
                    	    {
                    	    // InternalEvaluacion.g:656:5: ({...}? => ( ({...}? => ( ( (lv_experiencia_13_0= 'experiencia' ) ) otherlv_14= ':' ( (lv_experienciaVal_15_0= RULE_INT ) ) ) ) ) )
                    	    // InternalEvaluacion.g:657:6: {...}? => ( ({...}? => ( ( (lv_experiencia_13_0= 'experiencia' ) ) otherlv_14= ':' ( (lv_experienciaVal_15_0= RULE_INT ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluacion", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3(), 1)");
                    	    }
                    	    // InternalEvaluacion.g:657:110: ( ({...}? => ( ( (lv_experiencia_13_0= 'experiencia' ) ) otherlv_14= ':' ( (lv_experienciaVal_15_0= RULE_INT ) ) ) ) )
                    	    // InternalEvaluacion.g:658:7: ({...}? => ( ( (lv_experiencia_13_0= 'experiencia' ) ) otherlv_14= ':' ( (lv_experienciaVal_15_0= RULE_INT ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3(), 1);
                    	    						
                    	    // InternalEvaluacion.g:661:10: ({...}? => ( ( (lv_experiencia_13_0= 'experiencia' ) ) otherlv_14= ':' ( (lv_experienciaVal_15_0= RULE_INT ) ) ) )
                    	    // InternalEvaluacion.g:661:11: {...}? => ( ( (lv_experiencia_13_0= 'experiencia' ) ) otherlv_14= ':' ( (lv_experienciaVal_15_0= RULE_INT ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluacion", "true");
                    	    }
                    	    // InternalEvaluacion.g:661:20: ( ( (lv_experiencia_13_0= 'experiencia' ) ) otherlv_14= ':' ( (lv_experienciaVal_15_0= RULE_INT ) ) )
                    	    // InternalEvaluacion.g:661:21: ( (lv_experiencia_13_0= 'experiencia' ) ) otherlv_14= ':' ( (lv_experienciaVal_15_0= RULE_INT ) )
                    	    {
                    	    // InternalEvaluacion.g:661:21: ( (lv_experiencia_13_0= 'experiencia' ) )
                    	    // InternalEvaluacion.g:662:11: (lv_experiencia_13_0= 'experiencia' )
                    	    {
                    	    // InternalEvaluacion.g:662:11: (lv_experiencia_13_0= 'experiencia' )
                    	    // InternalEvaluacion.g:663:12: lv_experiencia_13_0= 'experiencia'
                    	    {
                    	    lv_experiencia_13_0=(Token)match(input,22,FOLLOW_17); 

                    	    												newLeafNode(lv_experiencia_13_0, grammarAccess.getEvaluacionAccess().getExperienciaExperienciaKeyword_1_3_1_0_0());
                    	    											

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getEvaluacionRule());
                    	    												}
                    	    												setWithLastConsumed(current, "experiencia", lv_experiencia_13_0, "experiencia");
                    	    											

                    	    }


                    	    }

                    	    otherlv_14=(Token)match(input,18,FOLLOW_20); 

                    	    										newLeafNode(otherlv_14, grammarAccess.getEvaluacionAccess().getColonKeyword_1_3_1_1());
                    	    									
                    	    // InternalEvaluacion.g:679:10: ( (lv_experienciaVal_15_0= RULE_INT ) )
                    	    // InternalEvaluacion.g:680:11: (lv_experienciaVal_15_0= RULE_INT )
                    	    {
                    	    // InternalEvaluacion.g:680:11: (lv_experienciaVal_15_0= RULE_INT )
                    	    // InternalEvaluacion.g:681:12: lv_experienciaVal_15_0= RULE_INT
                    	    {
                    	    lv_experienciaVal_15_0=(Token)match(input,RULE_INT,FOLLOW_21); 

                    	    												newLeafNode(lv_experienciaVal_15_0, grammarAccess.getEvaluacionAccess().getExperienciaValINTTerminalRuleCall_1_3_1_2_0());
                    	    											

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getEvaluacionRule());
                    	    												}
                    	    												setWithLastConsumed(
                    	    													current,
                    	    													"experienciaVal",
                    	    													lv_experienciaVal_15_0,
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
                    	    // InternalEvaluacion.g:703:5: ({...}? => ( ({...}? => ( ( (lv_certificacion_16_0= 'certificacion' ) ) otherlv_17= ':' ( (lv_certificacionVal_18_0= RULE_INT ) ) ) ) ) )
                    	    {
                    	    // InternalEvaluacion.g:703:5: ({...}? => ( ({...}? => ( ( (lv_certificacion_16_0= 'certificacion' ) ) otherlv_17= ':' ( (lv_certificacionVal_18_0= RULE_INT ) ) ) ) ) )
                    	    // InternalEvaluacion.g:704:6: {...}? => ( ({...}? => ( ( (lv_certificacion_16_0= 'certificacion' ) ) otherlv_17= ':' ( (lv_certificacionVal_18_0= RULE_INT ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluacion", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3(), 2)");
                    	    }
                    	    // InternalEvaluacion.g:704:110: ( ({...}? => ( ( (lv_certificacion_16_0= 'certificacion' ) ) otherlv_17= ':' ( (lv_certificacionVal_18_0= RULE_INT ) ) ) ) )
                    	    // InternalEvaluacion.g:705:7: ({...}? => ( ( (lv_certificacion_16_0= 'certificacion' ) ) otherlv_17= ':' ( (lv_certificacionVal_18_0= RULE_INT ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getEvaluacionAccess().getUnorderedGroup_1_3(), 2);
                    	    						
                    	    // InternalEvaluacion.g:708:10: ({...}? => ( ( (lv_certificacion_16_0= 'certificacion' ) ) otherlv_17= ':' ( (lv_certificacionVal_18_0= RULE_INT ) ) ) )
                    	    // InternalEvaluacion.g:708:11: {...}? => ( ( (lv_certificacion_16_0= 'certificacion' ) ) otherlv_17= ':' ( (lv_certificacionVal_18_0= RULE_INT ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluacion", "true");
                    	    }
                    	    // InternalEvaluacion.g:708:20: ( ( (lv_certificacion_16_0= 'certificacion' ) ) otherlv_17= ':' ( (lv_certificacionVal_18_0= RULE_INT ) ) )
                    	    // InternalEvaluacion.g:708:21: ( (lv_certificacion_16_0= 'certificacion' ) ) otherlv_17= ':' ( (lv_certificacionVal_18_0= RULE_INT ) )
                    	    {
                    	    // InternalEvaluacion.g:708:21: ( (lv_certificacion_16_0= 'certificacion' ) )
                    	    // InternalEvaluacion.g:709:11: (lv_certificacion_16_0= 'certificacion' )
                    	    {
                    	    // InternalEvaluacion.g:709:11: (lv_certificacion_16_0= 'certificacion' )
                    	    // InternalEvaluacion.g:710:12: lv_certificacion_16_0= 'certificacion'
                    	    {
                    	    lv_certificacion_16_0=(Token)match(input,23,FOLLOW_17); 

                    	    												newLeafNode(lv_certificacion_16_0, grammarAccess.getEvaluacionAccess().getCertificacionCertificacionKeyword_1_3_2_0_0());
                    	    											

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getEvaluacionRule());
                    	    												}
                    	    												setWithLastConsumed(current, "certificacion", lv_certificacion_16_0, "certificacion");
                    	    											

                    	    }


                    	    }

                    	    otherlv_17=(Token)match(input,18,FOLLOW_20); 

                    	    										newLeafNode(otherlv_17, grammarAccess.getEvaluacionAccess().getColonKeyword_1_3_2_1());
                    	    									
                    	    // InternalEvaluacion.g:726:10: ( (lv_certificacionVal_18_0= RULE_INT ) )
                    	    // InternalEvaluacion.g:727:11: (lv_certificacionVal_18_0= RULE_INT )
                    	    {
                    	    // InternalEvaluacion.g:727:11: (lv_certificacionVal_18_0= RULE_INT )
                    	    // InternalEvaluacion.g:728:12: lv_certificacionVal_18_0= RULE_INT
                    	    {
                    	    lv_certificacionVal_18_0=(Token)match(input,RULE_INT,FOLLOW_21); 

                    	    												newLeafNode(lv_certificacionVal_18_0, grammarAccess.getEvaluacionAccess().getCertificacionValINTTerminalRuleCall_1_3_2_2_0());
                    	    											

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getEvaluacionRule());
                    	    												}
                    	    												setWithLastConsumed(
                    	    													current,
                    	    													"certificacionVal",
                    	    													lv_certificacionVal_18_0,
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
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
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
                    // InternalEvaluacion.g:760:3: ( () ( (lv_tipo_20_0= 'Otros' ) ) ( (lv_name_21_0= RULE_ID ) ) otherlv_22= 'calificacion' otherlv_23= ':' ( (lv_valor_24_0= RULE_INT ) ) )
                    {
                    // InternalEvaluacion.g:760:3: ( () ( (lv_tipo_20_0= 'Otros' ) ) ( (lv_name_21_0= RULE_ID ) ) otherlv_22= 'calificacion' otherlv_23= ':' ( (lv_valor_24_0= RULE_INT ) ) )
                    // InternalEvaluacion.g:761:4: () ( (lv_tipo_20_0= 'Otros' ) ) ( (lv_name_21_0= RULE_ID ) ) otherlv_22= 'calificacion' otherlv_23= ':' ( (lv_valor_24_0= RULE_INT ) )
                    {
                    // InternalEvaluacion.g:761:4: ()
                    // InternalEvaluacion.g:762:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEvaluacionAccess().getCalificarOtrosAction_2_0(),
                    						current);
                    				

                    }

                    // InternalEvaluacion.g:768:4: ( (lv_tipo_20_0= 'Otros' ) )
                    // InternalEvaluacion.g:769:5: (lv_tipo_20_0= 'Otros' )
                    {
                    // InternalEvaluacion.g:769:5: (lv_tipo_20_0= 'Otros' )
                    // InternalEvaluacion.g:770:6: lv_tipo_20_0= 'Otros'
                    {
                    lv_tipo_20_0=(Token)match(input,24,FOLLOW_3); 

                    						newLeafNode(lv_tipo_20_0, grammarAccess.getEvaluacionAccess().getTipoOtrosKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvaluacionRule());
                    						}
                    						setWithLastConsumed(current, "tipo", lv_tipo_20_0, "Otros");
                    					

                    }


                    }

                    // InternalEvaluacion.g:782:4: ( (lv_name_21_0= RULE_ID ) )
                    // InternalEvaluacion.g:783:5: (lv_name_21_0= RULE_ID )
                    {
                    // InternalEvaluacion.g:783:5: (lv_name_21_0= RULE_ID )
                    // InternalEvaluacion.g:784:6: lv_name_21_0= RULE_ID
                    {
                    lv_name_21_0=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(lv_name_21_0, grammarAccess.getEvaluacionAccess().getNameIDTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvaluacionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_21_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_22=(Token)match(input,20,FOLLOW_17); 

                    				newLeafNode(otherlv_22, grammarAccess.getEvaluacionAccess().getCalificacionKeyword_2_3());
                    			
                    otherlv_23=(Token)match(input,18,FOLLOW_20); 

                    				newLeafNode(otherlv_23, grammarAccess.getEvaluacionAccess().getColonKeyword_2_4());
                    			
                    // InternalEvaluacion.g:808:4: ( (lv_valor_24_0= RULE_INT ) )
                    // InternalEvaluacion.g:809:5: (lv_valor_24_0= RULE_INT )
                    {
                    // InternalEvaluacion.g:809:5: (lv_valor_24_0= RULE_INT )
                    // InternalEvaluacion.g:810:6: lv_valor_24_0= RULE_INT
                    {
                    lv_valor_24_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_valor_24_0, grammarAccess.getEvaluacionAccess().getValorINTTerminalRuleCall_2_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvaluacionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"valor",
                    							lv_valor_24_0,
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


    // $ANTLR start "ruleTipoEquipo"
    // InternalEvaluacion.g:831:1: ruleTipoEquipo returns [Enumerator current=null] : ( (enumLiteral_0= 'EvaluarArquitecto' ) | (enumLiteral_1= 'EvaluarDirector' ) | (enumLiteral_2= 'EvaluarEducacion' ) ) ;
    public final Enumerator ruleTipoEquipo() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalEvaluacion.g:837:2: ( ( (enumLiteral_0= 'EvaluarArquitecto' ) | (enumLiteral_1= 'EvaluarDirector' ) | (enumLiteral_2= 'EvaluarEducacion' ) ) )
            // InternalEvaluacion.g:838:2: ( (enumLiteral_0= 'EvaluarArquitecto' ) | (enumLiteral_1= 'EvaluarDirector' ) | (enumLiteral_2= 'EvaluarEducacion' ) )
            {
            // InternalEvaluacion.g:838:2: ( (enumLiteral_0= 'EvaluarArquitecto' ) | (enumLiteral_1= 'EvaluarDirector' ) | (enumLiteral_2= 'EvaluarEducacion' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt14=1;
                }
                break;
            case 26:
                {
                alt14=2;
                }
                break;
            case 27:
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
                    // InternalEvaluacion.g:839:3: (enumLiteral_0= 'EvaluarArquitecto' )
                    {
                    // InternalEvaluacion.g:839:3: (enumLiteral_0= 'EvaluarArquitecto' )
                    // InternalEvaluacion.g:840:4: enumLiteral_0= 'EvaluarArquitecto'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getTipoEquipoAccess().getEvaluarArquitectoEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTipoEquipoAccess().getEvaluarArquitectoEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEvaluacion.g:847:3: (enumLiteral_1= 'EvaluarDirector' )
                    {
                    // InternalEvaluacion.g:847:3: (enumLiteral_1= 'EvaluarDirector' )
                    // InternalEvaluacion.g:848:4: enumLiteral_1= 'EvaluarDirector'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getTipoEquipoAccess().getEvaluarDirectorEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTipoEquipoAccess().getEvaluarDirectorEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEvaluacion.g:855:3: (enumLiteral_2= 'EvaluarEducacion' )
                    {
                    // InternalEvaluacion.g:855:3: (enumLiteral_2= 'EvaluarEducacion' )
                    // InternalEvaluacion.g:856:4: enumLiteral_2= 'EvaluarEducacion'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); 

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
    // InternalEvaluacion.g:866:1: ruleTipoPropuesta returns [Enumerator current=null] : ( (enumLiteral_0= 'EvaluarProblema' ) | (enumLiteral_1= 'EvaluarTecnica' ) | (enumLiteral_2= 'EvaluarOtros' ) ) ;
    public final Enumerator ruleTipoPropuesta() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalEvaluacion.g:872:2: ( ( (enumLiteral_0= 'EvaluarProblema' ) | (enumLiteral_1= 'EvaluarTecnica' ) | (enumLiteral_2= 'EvaluarOtros' ) ) )
            // InternalEvaluacion.g:873:2: ( (enumLiteral_0= 'EvaluarProblema' ) | (enumLiteral_1= 'EvaluarTecnica' ) | (enumLiteral_2= 'EvaluarOtros' ) )
            {
            // InternalEvaluacion.g:873:2: ( (enumLiteral_0= 'EvaluarProblema' ) | (enumLiteral_1= 'EvaluarTecnica' ) | (enumLiteral_2= 'EvaluarOtros' ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt15=1;
                }
                break;
            case 29:
                {
                alt15=2;
                }
                break;
            case 30:
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
                    // InternalEvaluacion.g:874:3: (enumLiteral_0= 'EvaluarProblema' )
                    {
                    // InternalEvaluacion.g:874:3: (enumLiteral_0= 'EvaluarProblema' )
                    // InternalEvaluacion.g:875:4: enumLiteral_0= 'EvaluarProblema'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getTipoPropuestaAccess().getEvaluarProblemaEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTipoPropuestaAccess().getEvaluarProblemaEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEvaluacion.g:882:3: (enumLiteral_1= 'EvaluarTecnica' )
                    {
                    // InternalEvaluacion.g:882:3: (enumLiteral_1= 'EvaluarTecnica' )
                    // InternalEvaluacion.g:883:4: enumLiteral_1= 'EvaluarTecnica'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getTipoPropuestaAccess().getEvaluarTecnicaEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTipoPropuestaAccess().getEvaluarTecnicaEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEvaluacion.g:890:3: (enumLiteral_2= 'EvaluarOtros' )
                    {
                    // InternalEvaluacion.g:890:3: (enumLiteral_2= 'EvaluarOtros' )
                    // InternalEvaluacion.g:891:4: enumLiteral_2= 'EvaluarOtros'
                    {
                    enumLiteral_2=(Token)match(input,30,FOLLOW_2); 

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
    // InternalEvaluacion.g:901:1: ruleE_Calificacion returns [Enumerator current=null] : ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 'M' ) | (enumLiteral_2= 'B' ) ) ;
    public final Enumerator ruleE_Calificacion() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalEvaluacion.g:907:2: ( ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 'M' ) | (enumLiteral_2= 'B' ) ) )
            // InternalEvaluacion.g:908:2: ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 'M' ) | (enumLiteral_2= 'B' ) )
            {
            // InternalEvaluacion.g:908:2: ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 'M' ) | (enumLiteral_2= 'B' ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt16=1;
                }
                break;
            case 32:
                {
                alt16=2;
                }
                break;
            case 33:
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
                    // InternalEvaluacion.g:909:3: (enumLiteral_0= 'A' )
                    {
                    // InternalEvaluacion.g:909:3: (enumLiteral_0= 'A' )
                    // InternalEvaluacion.g:910:4: enumLiteral_0= 'A'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getE_CalificacionAccess().getAltoEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getE_CalificacionAccess().getAltoEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEvaluacion.g:917:3: (enumLiteral_1= 'M' )
                    {
                    // InternalEvaluacion.g:917:3: (enumLiteral_1= 'M' )
                    // InternalEvaluacion.g:918:4: enumLiteral_1= 'M'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getE_CalificacionAccess().getMedioEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getE_CalificacionAccess().getMedioEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEvaluacion.g:925:3: (enumLiteral_2= 'B' )
                    {
                    // InternalEvaluacion.g:925:3: (enumLiteral_2= 'B' )
                    // InternalEvaluacion.g:926:4: enumLiteral_2= 'B'
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000007012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000007F000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000007F004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000E00002L});

}
