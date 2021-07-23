package hwo.evtool.dsl.parser.antlr.internal;

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
import hwo.evtool.dsl.services.EvaluacionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEvaluacionParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'eventos'", "'resetEvents'", "'evaluaciones'", "'componente'", "'actions'", "'{'", "'}'", "':'", "'=>'", "'calificacion'", "'/'", "'comentario'", "'EvaluarProblema'", "'EvaluarTecnica'", "'EvaluarOtros'", "'D'", "'EvaluarDirector'", "'EvaluarEducacion'", "'A'", "'M'", "'B'"
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
    public static final int T__30=30;
    public static final int T__31=31;
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
    // InternalEvaluacion.g:72:1: ruleMaquinaEstados returns [EObject current=null] : ( () (otherlv_1= 'eventos' ( (lv_events_2_0= ruleEvento ) )+ )? (otherlv_3= 'resetEvents' ( (otherlv_4= RULE_ID ) )+ )? (otherlv_5= 'evaluaciones' ( (lv_commands_6_0= ruleEvaluaciones ) )+ )? ( (lv_states_7_0= ruleComponente ) )* ) ;
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
            // InternalEvaluacion.g:78:2: ( ( () (otherlv_1= 'eventos' ( (lv_events_2_0= ruleEvento ) )+ )? (otherlv_3= 'resetEvents' ( (otherlv_4= RULE_ID ) )+ )? (otherlv_5= 'evaluaciones' ( (lv_commands_6_0= ruleEvaluaciones ) )+ )? ( (lv_states_7_0= ruleComponente ) )* ) )
            // InternalEvaluacion.g:79:2: ( () (otherlv_1= 'eventos' ( (lv_events_2_0= ruleEvento ) )+ )? (otherlv_3= 'resetEvents' ( (otherlv_4= RULE_ID ) )+ )? (otherlv_5= 'evaluaciones' ( (lv_commands_6_0= ruleEvaluaciones ) )+ )? ( (lv_states_7_0= ruleComponente ) )* )
            {
            // InternalEvaluacion.g:79:2: ( () (otherlv_1= 'eventos' ( (lv_events_2_0= ruleEvento ) )+ )? (otherlv_3= 'resetEvents' ( (otherlv_4= RULE_ID ) )+ )? (otherlv_5= 'evaluaciones' ( (lv_commands_6_0= ruleEvaluaciones ) )+ )? ( (lv_states_7_0= ruleComponente ) )* )
            // InternalEvaluacion.g:80:3: () (otherlv_1= 'eventos' ( (lv_events_2_0= ruleEvento ) )+ )? (otherlv_3= 'resetEvents' ( (otherlv_4= RULE_ID ) )+ )? (otherlv_5= 'evaluaciones' ( (lv_commands_6_0= ruleEvaluaciones ) )+ )? ( (lv_states_7_0= ruleComponente ) )*
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

            // InternalEvaluacion.g:131:3: (otherlv_5= 'evaluaciones' ( (lv_commands_6_0= ruleEvaluaciones ) )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEvaluacion.g:132:4: otherlv_5= 'evaluaciones' ( (lv_commands_6_0= ruleEvaluaciones ) )+
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getMaquinaEstadosAccess().getEvaluacionesKeyword_3_0());
                    			
                    // InternalEvaluacion.g:136:4: ( (lv_commands_6_0= ruleEvaluaciones ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=23 && LA5_0<=28)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalEvaluacion.g:137:5: (lv_commands_6_0= ruleEvaluaciones )
                    	    {
                    	    // InternalEvaluacion.g:137:5: (lv_commands_6_0= ruleEvaluaciones )
                    	    // InternalEvaluacion.g:138:6: lv_commands_6_0= ruleEvaluaciones
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
    // InternalEvaluacion.g:321:1: entryRuleEvaluaciones returns [EObject current=null] : iv_ruleEvaluaciones= ruleEvaluaciones EOF ;
    public final EObject entryRuleEvaluaciones() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluaciones = null;


        try {
            // InternalEvaluacion.g:321:53: (iv_ruleEvaluaciones= ruleEvaluaciones EOF )
            // InternalEvaluacion.g:322:2: iv_ruleEvaluaciones= ruleEvaluaciones EOF
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
    // InternalEvaluacion.g:328:1: ruleEvaluaciones returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoEvaluacion ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_expresion_2_0= ruleExpresion ) ) (otherlv_3= ':' ( (lv_comentario_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleEvaluaciones() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token lv_comentario_4_0=null;
        Enumerator lv_tipo_0_0 = null;

        EObject lv_expresion_2_0 = null;



        	enterRule();

        try {
            // InternalEvaluacion.g:334:2: ( ( ( (lv_tipo_0_0= ruleTipoEvaluacion ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_expresion_2_0= ruleExpresion ) ) (otherlv_3= ':' ( (lv_comentario_4_0= RULE_STRING ) ) )? ) )
            // InternalEvaluacion.g:335:2: ( ( (lv_tipo_0_0= ruleTipoEvaluacion ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_expresion_2_0= ruleExpresion ) ) (otherlv_3= ':' ( (lv_comentario_4_0= RULE_STRING ) ) )? )
            {
            // InternalEvaluacion.g:335:2: ( ( (lv_tipo_0_0= ruleTipoEvaluacion ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_expresion_2_0= ruleExpresion ) ) (otherlv_3= ':' ( (lv_comentario_4_0= RULE_STRING ) ) )? )
            // InternalEvaluacion.g:336:3: ( (lv_tipo_0_0= ruleTipoEvaluacion ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_expresion_2_0= ruleExpresion ) ) (otherlv_3= ':' ( (lv_comentario_4_0= RULE_STRING ) ) )?
            {
            // InternalEvaluacion.g:336:3: ( (lv_tipo_0_0= ruleTipoEvaluacion ) )
            // InternalEvaluacion.g:337:4: (lv_tipo_0_0= ruleTipoEvaluacion )
            {
            // InternalEvaluacion.g:337:4: (lv_tipo_0_0= ruleTipoEvaluacion )
            // InternalEvaluacion.g:338:5: lv_tipo_0_0= ruleTipoEvaluacion
            {

            					newCompositeNode(grammarAccess.getEvaluacionesAccess().getTipoTipoEvaluacionEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_tipo_0_0=ruleTipoEvaluacion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvaluacionesRule());
            					}
            					set(
            						current,
            						"tipo",
            						lv_tipo_0_0,
            						"hwo.evtool.dsl.Evaluacion.TipoEvaluacion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEvaluacion.g:355:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEvaluacion.g:356:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEvaluacion.g:356:4: (lv_name_1_0= RULE_ID )
            // InternalEvaluacion.g:357:5: lv_name_1_0= RULE_ID
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

            // InternalEvaluacion.g:373:3: ( (lv_expresion_2_0= ruleExpresion ) )
            // InternalEvaluacion.g:374:4: (lv_expresion_2_0= ruleExpresion )
            {
            // InternalEvaluacion.g:374:4: (lv_expresion_2_0= ruleExpresion )
            // InternalEvaluacion.g:375:5: lv_expresion_2_0= ruleExpresion
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

            // InternalEvaluacion.g:392:3: (otherlv_3= ':' ( (lv_comentario_4_0= RULE_STRING ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEvaluacion.g:393:4: otherlv_3= ':' ( (lv_comentario_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getEvaluacionesAccess().getColonKeyword_3_0());
                    			
                    // InternalEvaluacion.g:397:4: ( (lv_comentario_4_0= RULE_STRING ) )
                    // InternalEvaluacion.g:398:5: (lv_comentario_4_0= RULE_STRING )
                    {
                    // InternalEvaluacion.g:398:5: (lv_comentario_4_0= RULE_STRING )
                    // InternalEvaluacion.g:399:6: lv_comentario_4_0= RULE_STRING
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


    // $ANTLR start "entryRuleTransicion"
    // InternalEvaluacion.g:420:1: entryRuleTransicion returns [EObject current=null] : iv_ruleTransicion= ruleTransicion EOF ;
    public final EObject entryRuleTransicion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransicion = null;


        try {
            // InternalEvaluacion.g:420:51: (iv_ruleTransicion= ruleTransicion EOF )
            // InternalEvaluacion.g:421:2: iv_ruleTransicion= ruleTransicion EOF
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
    // InternalEvaluacion.g:427:1: ruleTransicion returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleTransicion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalEvaluacion.g:433:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalEvaluacion.g:434:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalEvaluacion.g:434:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
            // InternalEvaluacion.g:435:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) )
            {
            // InternalEvaluacion.g:435:3: ( (otherlv_0= RULE_ID ) )
            // InternalEvaluacion.g:436:4: (otherlv_0= RULE_ID )
            {
            // InternalEvaluacion.g:436:4: (otherlv_0= RULE_ID )
            // InternalEvaluacion.g:437:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransicionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_0, grammarAccess.getTransicionAccess().getEventEventoCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTransicionAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalEvaluacion.g:452:3: ( (otherlv_2= RULE_ID ) )
            // InternalEvaluacion.g:453:4: (otherlv_2= RULE_ID )
            {
            // InternalEvaluacion.g:453:4: (otherlv_2= RULE_ID )
            // InternalEvaluacion.g:454:5: otherlv_2= RULE_ID
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


    // $ANTLR start "entryRuleExpresion"
    // InternalEvaluacion.g:469:1: entryRuleExpresion returns [EObject current=null] : iv_ruleExpresion= ruleExpresion EOF ;
    public final EObject entryRuleExpresion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresion = null;


        try {
            // InternalEvaluacion.g:469:50: (iv_ruleExpresion= ruleExpresion EOF )
            // InternalEvaluacion.g:470:2: iv_ruleExpresion= ruleExpresion EOF
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
    // InternalEvaluacion.g:476:1: ruleExpresion returns [EObject current=null] : ( ( () otherlv_1= 'calificacion' otherlv_2= ':' ( (lv_puntuacion_3_0= ruleE_Calificacion ) ) ) | ( () otherlv_5= 'calificacion' otherlv_6= ':' ( (lv_numerador_7_0= RULE_INT ) ) otherlv_8= '/' ( (lv_denominador_9_0= RULE_INT ) ) ) | ( () otherlv_11= 'calificacion' otherlv_12= ':' ( (lv_valor_13_0= RULE_INT ) ) (otherlv_14= 'comentario' otherlv_15= ':' ( (lv_comentario_16_0= RULE_STRING ) ) )? ) ) ;
    public final EObject ruleExpresion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_numerador_7_0=null;
        Token otherlv_8=null;
        Token lv_denominador_9_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_valor_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_comentario_16_0=null;
        Enumerator lv_puntuacion_3_0 = null;



        	enterRule();

        try {
            // InternalEvaluacion.g:482:2: ( ( ( () otherlv_1= 'calificacion' otherlv_2= ':' ( (lv_puntuacion_3_0= ruleE_Calificacion ) ) ) | ( () otherlv_5= 'calificacion' otherlv_6= ':' ( (lv_numerador_7_0= RULE_INT ) ) otherlv_8= '/' ( (lv_denominador_9_0= RULE_INT ) ) ) | ( () otherlv_11= 'calificacion' otherlv_12= ':' ( (lv_valor_13_0= RULE_INT ) ) (otherlv_14= 'comentario' otherlv_15= ':' ( (lv_comentario_16_0= RULE_STRING ) ) )? ) ) )
            // InternalEvaluacion.g:483:2: ( ( () otherlv_1= 'calificacion' otherlv_2= ':' ( (lv_puntuacion_3_0= ruleE_Calificacion ) ) ) | ( () otherlv_5= 'calificacion' otherlv_6= ':' ( (lv_numerador_7_0= RULE_INT ) ) otherlv_8= '/' ( (lv_denominador_9_0= RULE_INT ) ) ) | ( () otherlv_11= 'calificacion' otherlv_12= ':' ( (lv_valor_13_0= RULE_INT ) ) (otherlv_14= 'comentario' otherlv_15= ':' ( (lv_comentario_16_0= RULE_STRING ) ) )? ) )
            {
            // InternalEvaluacion.g:483:2: ( ( () otherlv_1= 'calificacion' otherlv_2= ':' ( (lv_puntuacion_3_0= ruleE_Calificacion ) ) ) | ( () otherlv_5= 'calificacion' otherlv_6= ':' ( (lv_numerador_7_0= RULE_INT ) ) otherlv_8= '/' ( (lv_denominador_9_0= RULE_INT ) ) ) | ( () otherlv_11= 'calificacion' otherlv_12= ':' ( (lv_valor_13_0= RULE_INT ) ) (otherlv_14= 'comentario' otherlv_15= ':' ( (lv_comentario_16_0= RULE_STRING ) ) )? ) )
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==18) ) {
                    int LA13_2 = input.LA(3);

                    if ( ((LA13_2>=29 && LA13_2<=31)) ) {
                        alt13=1;
                    }
                    else if ( (LA13_2==RULE_INT) ) {
                        int LA13_4 = input.LA(4);

                        if ( (LA13_4==EOF||LA13_4==14||LA13_4==18||(LA13_4>=22 && LA13_4<=28)) ) {
                            alt13=3;
                        }
                        else if ( (LA13_4==21) ) {
                            alt13=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalEvaluacion.g:484:3: ( () otherlv_1= 'calificacion' otherlv_2= ':' ( (lv_puntuacion_3_0= ruleE_Calificacion ) ) )
                    {
                    // InternalEvaluacion.g:484:3: ( () otherlv_1= 'calificacion' otherlv_2= ':' ( (lv_puntuacion_3_0= ruleE_Calificacion ) ) )
                    // InternalEvaluacion.g:485:4: () otherlv_1= 'calificacion' otherlv_2= ':' ( (lv_puntuacion_3_0= ruleE_Calificacion ) )
                    {
                    // InternalEvaluacion.g:485:4: ()
                    // InternalEvaluacion.g:486:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpresionAccess().getCalificarPropuestaAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getExpresionAccess().getCalificacionKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,18,FOLLOW_18); 

                    				newLeafNode(otherlv_2, grammarAccess.getExpresionAccess().getColonKeyword_0_2());
                    			
                    // InternalEvaluacion.g:500:4: ( (lv_puntuacion_3_0= ruleE_Calificacion ) )
                    // InternalEvaluacion.g:501:5: (lv_puntuacion_3_0= ruleE_Calificacion )
                    {
                    // InternalEvaluacion.g:501:5: (lv_puntuacion_3_0= ruleE_Calificacion )
                    // InternalEvaluacion.g:502:6: lv_puntuacion_3_0= ruleE_Calificacion
                    {

                    						newCompositeNode(grammarAccess.getExpresionAccess().getPuntuacionE_CalificacionEnumRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_puntuacion_3_0=ruleE_Calificacion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpresionRule());
                    						}
                    						set(
                    							current,
                    							"puntuacion",
                    							lv_puntuacion_3_0,
                    							"hwo.evtool.dsl.Evaluacion.E_Calificacion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEvaluacion.g:521:3: ( () otherlv_5= 'calificacion' otherlv_6= ':' ( (lv_numerador_7_0= RULE_INT ) ) otherlv_8= '/' ( (lv_denominador_9_0= RULE_INT ) ) )
                    {
                    // InternalEvaluacion.g:521:3: ( () otherlv_5= 'calificacion' otherlv_6= ':' ( (lv_numerador_7_0= RULE_INT ) ) otherlv_8= '/' ( (lv_denominador_9_0= RULE_INT ) ) )
                    // InternalEvaluacion.g:522:4: () otherlv_5= 'calificacion' otherlv_6= ':' ( (lv_numerador_7_0= RULE_INT ) ) otherlv_8= '/' ( (lv_denominador_9_0= RULE_INT ) )
                    {
                    // InternalEvaluacion.g:522:4: ()
                    // InternalEvaluacion.g:523:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpresionAccess().getCalificarEquipoAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,20,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getExpresionAccess().getCalificacionKeyword_1_1());
                    			
                    otherlv_6=(Token)match(input,18,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getExpresionAccess().getColonKeyword_1_2());
                    			
                    // InternalEvaluacion.g:537:4: ( (lv_numerador_7_0= RULE_INT ) )
                    // InternalEvaluacion.g:538:5: (lv_numerador_7_0= RULE_INT )
                    {
                    // InternalEvaluacion.g:538:5: (lv_numerador_7_0= RULE_INT )
                    // InternalEvaluacion.g:539:6: lv_numerador_7_0= RULE_INT
                    {
                    lv_numerador_7_0=(Token)match(input,RULE_INT,FOLLOW_20); 

                    						newLeafNode(lv_numerador_7_0, grammarAccess.getExpresionAccess().getNumeradorINTTerminalRuleCall_1_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpresionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"numerador",
                    							lv_numerador_7_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,21,FOLLOW_19); 

                    				newLeafNode(otherlv_8, grammarAccess.getExpresionAccess().getSolidusKeyword_1_4());
                    			
                    // InternalEvaluacion.g:559:4: ( (lv_denominador_9_0= RULE_INT ) )
                    // InternalEvaluacion.g:560:5: (lv_denominador_9_0= RULE_INT )
                    {
                    // InternalEvaluacion.g:560:5: (lv_denominador_9_0= RULE_INT )
                    // InternalEvaluacion.g:561:6: lv_denominador_9_0= RULE_INT
                    {
                    lv_denominador_9_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_denominador_9_0, grammarAccess.getExpresionAccess().getDenominadorINTTerminalRuleCall_1_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpresionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"denominador",
                    							lv_denominador_9_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalEvaluacion.g:579:3: ( () otherlv_11= 'calificacion' otherlv_12= ':' ( (lv_valor_13_0= RULE_INT ) ) (otherlv_14= 'comentario' otherlv_15= ':' ( (lv_comentario_16_0= RULE_STRING ) ) )? )
                    {
                    // InternalEvaluacion.g:579:3: ( () otherlv_11= 'calificacion' otherlv_12= ':' ( (lv_valor_13_0= RULE_INT ) ) (otherlv_14= 'comentario' otherlv_15= ':' ( (lv_comentario_16_0= RULE_STRING ) ) )? )
                    // InternalEvaluacion.g:580:4: () otherlv_11= 'calificacion' otherlv_12= ':' ( (lv_valor_13_0= RULE_INT ) ) (otherlv_14= 'comentario' otherlv_15= ':' ( (lv_comentario_16_0= RULE_STRING ) ) )?
                    {
                    // InternalEvaluacion.g:580:4: ()
                    // InternalEvaluacion.g:581:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpresionAccess().getCalificarOtrosAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_11=(Token)match(input,20,FOLLOW_17); 

                    				newLeafNode(otherlv_11, grammarAccess.getExpresionAccess().getCalificacionKeyword_2_1());
                    			
                    otherlv_12=(Token)match(input,18,FOLLOW_19); 

                    				newLeafNode(otherlv_12, grammarAccess.getExpresionAccess().getColonKeyword_2_2());
                    			
                    // InternalEvaluacion.g:595:4: ( (lv_valor_13_0= RULE_INT ) )
                    // InternalEvaluacion.g:596:5: (lv_valor_13_0= RULE_INT )
                    {
                    // InternalEvaluacion.g:596:5: (lv_valor_13_0= RULE_INT )
                    // InternalEvaluacion.g:597:6: lv_valor_13_0= RULE_INT
                    {
                    lv_valor_13_0=(Token)match(input,RULE_INT,FOLLOW_21); 

                    						newLeafNode(lv_valor_13_0, grammarAccess.getExpresionAccess().getValorINTTerminalRuleCall_2_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpresionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"valor",
                    							lv_valor_13_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalEvaluacion.g:613:4: (otherlv_14= 'comentario' otherlv_15= ':' ( (lv_comentario_16_0= RULE_STRING ) ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==22) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalEvaluacion.g:614:5: otherlv_14= 'comentario' otherlv_15= ':' ( (lv_comentario_16_0= RULE_STRING ) )
                            {
                            otherlv_14=(Token)match(input,22,FOLLOW_17); 

                            					newLeafNode(otherlv_14, grammarAccess.getExpresionAccess().getComentarioKeyword_2_4_0());
                            				
                            otherlv_15=(Token)match(input,18,FOLLOW_15); 

                            					newLeafNode(otherlv_15, grammarAccess.getExpresionAccess().getColonKeyword_2_4_1());
                            				
                            // InternalEvaluacion.g:622:5: ( (lv_comentario_16_0= RULE_STRING ) )
                            // InternalEvaluacion.g:623:6: (lv_comentario_16_0= RULE_STRING )
                            {
                            // InternalEvaluacion.g:623:6: (lv_comentario_16_0= RULE_STRING )
                            // InternalEvaluacion.g:624:7: lv_comentario_16_0= RULE_STRING
                            {
                            lv_comentario_16_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                            							newLeafNode(lv_comentario_16_0, grammarAccess.getExpresionAccess().getComentarioSTRINGTerminalRuleCall_2_4_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getExpresionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"comentario",
                            								lv_comentario_16_0,
                            								"org.eclipse.xtext.common.Terminals.STRING");
                            						

                            }


                            }


                            }
                            break;

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
    // $ANTLR end "ruleExpresion"


    // $ANTLR start "ruleTipoEvaluacion"
    // InternalEvaluacion.g:646:1: ruleTipoEvaluacion returns [Enumerator current=null] : ( (enumLiteral_0= 'EvaluarProblema' ) | (enumLiteral_1= 'EvaluarTecnica' ) | (enumLiteral_2= 'EvaluarOtros' ) | (enumLiteral_3= 'D' ) | (enumLiteral_4= 'EvaluarDirector' ) | (enumLiteral_5= 'EvaluarEducacion' ) ) ;
    public final Enumerator ruleTipoEvaluacion() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalEvaluacion.g:652:2: ( ( (enumLiteral_0= 'EvaluarProblema' ) | (enumLiteral_1= 'EvaluarTecnica' ) | (enumLiteral_2= 'EvaluarOtros' ) | (enumLiteral_3= 'D' ) | (enumLiteral_4= 'EvaluarDirector' ) | (enumLiteral_5= 'EvaluarEducacion' ) ) )
            // InternalEvaluacion.g:653:2: ( (enumLiteral_0= 'EvaluarProblema' ) | (enumLiteral_1= 'EvaluarTecnica' ) | (enumLiteral_2= 'EvaluarOtros' ) | (enumLiteral_3= 'D' ) | (enumLiteral_4= 'EvaluarDirector' ) | (enumLiteral_5= 'EvaluarEducacion' ) )
            {
            // InternalEvaluacion.g:653:2: ( (enumLiteral_0= 'EvaluarProblema' ) | (enumLiteral_1= 'EvaluarTecnica' ) | (enumLiteral_2= 'EvaluarOtros' ) | (enumLiteral_3= 'D' ) | (enumLiteral_4= 'EvaluarDirector' ) | (enumLiteral_5= 'EvaluarEducacion' ) )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt14=1;
                }
                break;
            case 24:
                {
                alt14=2;
                }
                break;
            case 25:
                {
                alt14=3;
                }
                break;
            case 26:
                {
                alt14=4;
                }
                break;
            case 27:
                {
                alt14=5;
                }
                break;
            case 28:
                {
                alt14=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalEvaluacion.g:654:3: (enumLiteral_0= 'EvaluarProblema' )
                    {
                    // InternalEvaluacion.g:654:3: (enumLiteral_0= 'EvaluarProblema' )
                    // InternalEvaluacion.g:655:4: enumLiteral_0= 'EvaluarProblema'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getTipoEvaluacionAccess().getEvaluarProblemaEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTipoEvaluacionAccess().getEvaluarProblemaEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEvaluacion.g:662:3: (enumLiteral_1= 'EvaluarTecnica' )
                    {
                    // InternalEvaluacion.g:662:3: (enumLiteral_1= 'EvaluarTecnica' )
                    // InternalEvaluacion.g:663:4: enumLiteral_1= 'EvaluarTecnica'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getTipoEvaluacionAccess().getEvaluarTecnicaEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTipoEvaluacionAccess().getEvaluarTecnicaEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEvaluacion.g:670:3: (enumLiteral_2= 'EvaluarOtros' )
                    {
                    // InternalEvaluacion.g:670:3: (enumLiteral_2= 'EvaluarOtros' )
                    // InternalEvaluacion.g:671:4: enumLiteral_2= 'EvaluarOtros'
                    {
                    enumLiteral_2=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getTipoEvaluacionAccess().getEvaluarOtrosEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTipoEvaluacionAccess().getEvaluarOtrosEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalEvaluacion.g:678:3: (enumLiteral_3= 'D' )
                    {
                    // InternalEvaluacion.g:678:3: (enumLiteral_3= 'D' )
                    // InternalEvaluacion.g:679:4: enumLiteral_3= 'D'
                    {
                    enumLiteral_3=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getTipoEvaluacionAccess().getEvaluarArquitectoEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTipoEvaluacionAccess().getEvaluarArquitectoEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalEvaluacion.g:686:3: (enumLiteral_4= 'EvaluarDirector' )
                    {
                    // InternalEvaluacion.g:686:3: (enumLiteral_4= 'EvaluarDirector' )
                    // InternalEvaluacion.g:687:4: enumLiteral_4= 'EvaluarDirector'
                    {
                    enumLiteral_4=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getTipoEvaluacionAccess().getEvaluarDirectorEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTipoEvaluacionAccess().getEvaluarDirectorEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalEvaluacion.g:694:3: (enumLiteral_5= 'EvaluarEducacion' )
                    {
                    // InternalEvaluacion.g:694:3: (enumLiteral_5= 'EvaluarEducacion' )
                    // InternalEvaluacion.g:695:4: enumLiteral_5= 'EvaluarEducacion'
                    {
                    enumLiteral_5=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getTipoEvaluacionAccess().getEvaluarEducacionEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTipoEvaluacionAccess().getEvaluarEducacionEnumLiteralDeclaration_5());
                    			

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
    // $ANTLR end "ruleTipoEvaluacion"


    // $ANTLR start "ruleE_Calificacion"
    // InternalEvaluacion.g:705:1: ruleE_Calificacion returns [Enumerator current=null] : ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 'M' ) | (enumLiteral_2= 'B' ) ) ;
    public final Enumerator ruleE_Calificacion() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalEvaluacion.g:711:2: ( ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 'M' ) | (enumLiteral_2= 'B' ) ) )
            // InternalEvaluacion.g:712:2: ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 'M' ) | (enumLiteral_2= 'B' ) )
            {
            // InternalEvaluacion.g:712:2: ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 'M' ) | (enumLiteral_2= 'B' ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt15=1;
                }
                break;
            case 30:
                {
                alt15=2;
                }
                break;
            case 31:
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
                    // InternalEvaluacion.g:713:3: (enumLiteral_0= 'A' )
                    {
                    // InternalEvaluacion.g:713:3: (enumLiteral_0= 'A' )
                    // InternalEvaluacion.g:714:4: enumLiteral_0= 'A'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getE_CalificacionAccess().getAltoEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getE_CalificacionAccess().getAltoEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEvaluacion.g:721:3: (enumLiteral_1= 'M' )
                    {
                    // InternalEvaluacion.g:721:3: (enumLiteral_1= 'M' )
                    // InternalEvaluacion.g:722:4: enumLiteral_1= 'M'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getE_CalificacionAccess().getMedioEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getE_CalificacionAccess().getMedioEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEvaluacion.g:729:3: (enumLiteral_2= 'B' )
                    {
                    // InternalEvaluacion.g:729:3: (enumLiteral_2= 'B' )
                    // InternalEvaluacion.g:730:4: enumLiteral_2= 'B'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_2); 

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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000001F800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000001F804002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400002L});

}