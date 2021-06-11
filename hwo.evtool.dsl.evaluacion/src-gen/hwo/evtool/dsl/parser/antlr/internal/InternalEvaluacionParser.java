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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'componente'", "'hereda'", "'{'", "'}'", "'criterio'", "'='", "':'", "'S'", "'N'", "'['", "']'"
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
        	return "Model";
       	}

       	@Override
       	protected EvaluacionGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalEvaluacion.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalEvaluacion.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalEvaluacion.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalEvaluacion.g:71:1: ruleModel returns [EObject current=null] : ( (lv_entities_0_0= ruleCmpntEvaluacion ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_entities_0_0 = null;



        	enterRule();

        try {
            // InternalEvaluacion.g:77:2: ( ( (lv_entities_0_0= ruleCmpntEvaluacion ) )* )
            // InternalEvaluacion.g:78:2: ( (lv_entities_0_0= ruleCmpntEvaluacion ) )*
            {
            // InternalEvaluacion.g:78:2: ( (lv_entities_0_0= ruleCmpntEvaluacion ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEvaluacion.g:79:3: (lv_entities_0_0= ruleCmpntEvaluacion )
            	    {
            	    // InternalEvaluacion.g:79:3: (lv_entities_0_0= ruleCmpntEvaluacion )
            	    // InternalEvaluacion.g:80:4: lv_entities_0_0= ruleCmpntEvaluacion
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getEntitiesCmpntEvaluacionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_entities_0_0=ruleCmpntEvaluacion();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"entities",
            	    					lv_entities_0_0,
            	    					"hwo.evtool.dsl.Evaluacion.CmpntEvaluacion");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCmpntEvaluacion"
    // InternalEvaluacion.g:100:1: entryRuleCmpntEvaluacion returns [EObject current=null] : iv_ruleCmpntEvaluacion= ruleCmpntEvaluacion EOF ;
    public final EObject entryRuleCmpntEvaluacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCmpntEvaluacion = null;


        try {
            // InternalEvaluacion.g:100:56: (iv_ruleCmpntEvaluacion= ruleCmpntEvaluacion EOF )
            // InternalEvaluacion.g:101:2: iv_ruleCmpntEvaluacion= ruleCmpntEvaluacion EOF
            {
             newCompositeNode(grammarAccess.getCmpntEvaluacionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCmpntEvaluacion=ruleCmpntEvaluacion();

            state._fsp--;

             current =iv_ruleCmpntEvaluacion; 
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
    // $ANTLR end "entryRuleCmpntEvaluacion"


    // $ANTLR start "ruleCmpntEvaluacion"
    // InternalEvaluacion.g:107:1: ruleCmpntEvaluacion returns [EObject current=null] : (otherlv_0= 'componente' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'hereda' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleCriterio ) )* otherlv_6= '}' ) ;
    public final EObject ruleCmpntEvaluacion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attributes_5_0 = null;



        	enterRule();

        try {
            // InternalEvaluacion.g:113:2: ( (otherlv_0= 'componente' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'hereda' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleCriterio ) )* otherlv_6= '}' ) )
            // InternalEvaluacion.g:114:2: (otherlv_0= 'componente' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'hereda' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleCriterio ) )* otherlv_6= '}' )
            {
            // InternalEvaluacion.g:114:2: (otherlv_0= 'componente' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'hereda' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleCriterio ) )* otherlv_6= '}' )
            // InternalEvaluacion.g:115:3: otherlv_0= 'componente' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'hereda' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleCriterio ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCmpntEvaluacionAccess().getComponenteKeyword_0());
            		
            // InternalEvaluacion.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEvaluacion.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEvaluacion.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalEvaluacion.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCmpntEvaluacionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCmpntEvaluacionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalEvaluacion.g:137:3: (otherlv_2= 'hereda' ( (otherlv_3= RULE_ID ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalEvaluacion.g:138:4: otherlv_2= 'hereda' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getCmpntEvaluacionAccess().getHeredaKeyword_2_0());
                    			
                    // InternalEvaluacion.g:142:4: ( (otherlv_3= RULE_ID ) )
                    // InternalEvaluacion.g:143:5: (otherlv_3= RULE_ID )
                    {
                    // InternalEvaluacion.g:143:5: (otherlv_3= RULE_ID )
                    // InternalEvaluacion.g:144:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCmpntEvaluacionRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(otherlv_3, grammarAccess.getCmpntEvaluacionAccess().getSuperTypeCmpntEvaluacionCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getCmpntEvaluacionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEvaluacion.g:160:3: ( (lv_attributes_5_0= ruleCriterio ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEvaluacion.g:161:4: (lv_attributes_5_0= ruleCriterio )
            	    {
            	    // InternalEvaluacion.g:161:4: (lv_attributes_5_0= ruleCriterio )
            	    // InternalEvaluacion.g:162:5: lv_attributes_5_0= ruleCriterio
            	    {

            	    					newCompositeNode(grammarAccess.getCmpntEvaluacionAccess().getAttributesCriterioParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_attributes_5_0=ruleCriterio();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCmpntEvaluacionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_5_0,
            	    						"hwo.evtool.dsl.Evaluacion.Criterio");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCmpntEvaluacionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleCmpntEvaluacion"


    // $ANTLR start "entryRuleCriterio"
    // InternalEvaluacion.g:187:1: entryRuleCriterio returns [EObject current=null] : iv_ruleCriterio= ruleCriterio EOF ;
    public final EObject entryRuleCriterio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCriterio = null;


        try {
            // InternalEvaluacion.g:187:49: (iv_ruleCriterio= ruleCriterio EOF )
            // InternalEvaluacion.g:188:2: iv_ruleCriterio= ruleCriterio EOF
            {
             newCompositeNode(grammarAccess.getCriterioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCriterio=ruleCriterio();

            state._fsp--;

             current =iv_ruleCriterio; 
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
    // $ANTLR end "entryRuleCriterio"


    // $ANTLR start "ruleCriterio"
    // InternalEvaluacion.g:194:1: ruleCriterio returns [EObject current=null] : ( ( (lv_type_0_0= ruleCriterioType ) ) | (otherlv_1= 'criterio' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expresion_4_0= ruleExpresion ) ) (otherlv_5= ':' ( (lv_soporte_6_0= ruleExpresion ) ) )? ) ) ;
    public final EObject ruleCriterio() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_type_0_0 = null;

        EObject lv_expresion_4_0 = null;

        EObject lv_soporte_6_0 = null;



        	enterRule();

        try {
            // InternalEvaluacion.g:200:2: ( ( ( (lv_type_0_0= ruleCriterioType ) ) | (otherlv_1= 'criterio' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expresion_4_0= ruleExpresion ) ) (otherlv_5= ':' ( (lv_soporte_6_0= ruleExpresion ) ) )? ) ) )
            // InternalEvaluacion.g:201:2: ( ( (lv_type_0_0= ruleCriterioType ) ) | (otherlv_1= 'criterio' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expresion_4_0= ruleExpresion ) ) (otherlv_5= ':' ( (lv_soporte_6_0= ruleExpresion ) ) )? ) )
            {
            // InternalEvaluacion.g:201:2: ( ( (lv_type_0_0= ruleCriterioType ) ) | (otherlv_1= 'criterio' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expresion_4_0= ruleExpresion ) ) (otherlv_5= ':' ( (lv_soporte_6_0= ruleExpresion ) ) )? ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalEvaluacion.g:202:3: ( (lv_type_0_0= ruleCriterioType ) )
                    {
                    // InternalEvaluacion.g:202:3: ( (lv_type_0_0= ruleCriterioType ) )
                    // InternalEvaluacion.g:203:4: (lv_type_0_0= ruleCriterioType )
                    {
                    // InternalEvaluacion.g:203:4: (lv_type_0_0= ruleCriterioType )
                    // InternalEvaluacion.g:204:5: lv_type_0_0= ruleCriterioType
                    {

                    					newCompositeNode(grammarAccess.getCriterioAccess().getTypeCriterioTypeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_0=ruleCriterioType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCriterioRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_0,
                    						"hwo.evtool.dsl.Evaluacion.CriterioType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEvaluacion.g:222:3: (otherlv_1= 'criterio' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expresion_4_0= ruleExpresion ) ) (otherlv_5= ':' ( (lv_soporte_6_0= ruleExpresion ) ) )? )
                    {
                    // InternalEvaluacion.g:222:3: (otherlv_1= 'criterio' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expresion_4_0= ruleExpresion ) ) (otherlv_5= ':' ( (lv_soporte_6_0= ruleExpresion ) ) )? )
                    // InternalEvaluacion.g:223:4: otherlv_1= 'criterio' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expresion_4_0= ruleExpresion ) ) (otherlv_5= ':' ( (lv_soporte_6_0= ruleExpresion ) ) )?
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getCriterioAccess().getCriterioKeyword_1_0());
                    			
                    // InternalEvaluacion.g:227:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalEvaluacion.g:228:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalEvaluacion.g:228:5: (lv_name_2_0= RULE_ID )
                    // InternalEvaluacion.g:229:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getCriterioAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCriterioRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getCriterioAccess().getEqualsSignKeyword_1_2());
                    			
                    // InternalEvaluacion.g:249:4: ( (lv_expresion_4_0= ruleExpresion ) )
                    // InternalEvaluacion.g:250:5: (lv_expresion_4_0= ruleExpresion )
                    {
                    // InternalEvaluacion.g:250:5: (lv_expresion_4_0= ruleExpresion )
                    // InternalEvaluacion.g:251:6: lv_expresion_4_0= ruleExpresion
                    {

                    						newCompositeNode(grammarAccess.getCriterioAccess().getExpresionExpresionParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_expresion_4_0=ruleExpresion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCriterioRule());
                    						}
                    						set(
                    							current,
                    							"expresion",
                    							lv_expresion_4_0,
                    							"hwo.evtool.dsl.Evaluacion.Expresion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEvaluacion.g:268:4: (otherlv_5= ':' ( (lv_soporte_6_0= ruleExpresion ) ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==17) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalEvaluacion.g:269:5: otherlv_5= ':' ( (lv_soporte_6_0= ruleExpresion ) )
                            {
                            otherlv_5=(Token)match(input,17,FOLLOW_9); 

                            					newLeafNode(otherlv_5, grammarAccess.getCriterioAccess().getColonKeyword_1_4_0());
                            				
                            // InternalEvaluacion.g:273:5: ( (lv_soporte_6_0= ruleExpresion ) )
                            // InternalEvaluacion.g:274:6: (lv_soporte_6_0= ruleExpresion )
                            {
                            // InternalEvaluacion.g:274:6: (lv_soporte_6_0= ruleExpresion )
                            // InternalEvaluacion.g:275:7: lv_soporte_6_0= ruleExpresion
                            {

                            							newCompositeNode(grammarAccess.getCriterioAccess().getSoporteExpresionParserRuleCall_1_4_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_soporte_6_0=ruleExpresion();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getCriterioRule());
                            							}
                            							set(
                            								current,
                            								"soporte",
                            								lv_soporte_6_0,
                            								"hwo.evtool.dsl.Evaluacion.Expresion");
                            							afterParserOrEnumRuleCall();
                            						

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
    // $ANTLR end "ruleCriterio"


    // $ANTLR start "entryRuleExpresion"
    // InternalEvaluacion.g:298:1: entryRuleExpresion returns [EObject current=null] : iv_ruleExpresion= ruleExpresion EOF ;
    public final EObject entryRuleExpresion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresion = null;


        try {
            // InternalEvaluacion.g:298:50: (iv_ruleExpresion= ruleExpresion EOF )
            // InternalEvaluacion.g:299:2: iv_ruleExpresion= ruleExpresion EOF
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
    // InternalEvaluacion.g:305:1: ruleExpresion returns [EObject current=null] : this_Atomo_0= ruleAtomo ;
    public final EObject ruleExpresion() throws RecognitionException {
        EObject current = null;

        EObject this_Atomo_0 = null;



        	enterRule();

        try {
            // InternalEvaluacion.g:311:2: (this_Atomo_0= ruleAtomo )
            // InternalEvaluacion.g:312:2: this_Atomo_0= ruleAtomo
            {

            		newCompositeNode(grammarAccess.getExpresionAccess().getAtomoParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Atomo_0=ruleAtomo();

            state._fsp--;


            		current = this_Atomo_0;
            		afterParserOrEnumRuleCall();
            	

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


    // $ANTLR start "entryRuleAtomo"
    // InternalEvaluacion.g:323:1: entryRuleAtomo returns [EObject current=null] : iv_ruleAtomo= ruleAtomo EOF ;
    public final EObject entryRuleAtomo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomo = null;


        try {
            // InternalEvaluacion.g:323:46: (iv_ruleAtomo= ruleAtomo EOF )
            // InternalEvaluacion.g:324:2: iv_ruleAtomo= ruleAtomo EOF
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
    // InternalEvaluacion.g:330:1: ruleAtomo returns [EObject current=null] : ( ( () ( (lv_valor_1_0= RULE_INT ) ) ) | ( () ( (lv_valor_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_valor_5_1= 'S' | lv_valor_5_2= 'N' ) ) ) ) ) ;
    public final EObject ruleAtomo() throws RecognitionException {
        EObject current = null;

        Token lv_valor_1_0=null;
        Token lv_valor_3_0=null;
        Token lv_valor_5_1=null;
        Token lv_valor_5_2=null;


        	enterRule();

        try {
            // InternalEvaluacion.g:336:2: ( ( ( () ( (lv_valor_1_0= RULE_INT ) ) ) | ( () ( (lv_valor_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_valor_5_1= 'S' | lv_valor_5_2= 'N' ) ) ) ) ) )
            // InternalEvaluacion.g:337:2: ( ( () ( (lv_valor_1_0= RULE_INT ) ) ) | ( () ( (lv_valor_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_valor_5_1= 'S' | lv_valor_5_2= 'N' ) ) ) ) )
            {
            // InternalEvaluacion.g:337:2: ( ( () ( (lv_valor_1_0= RULE_INT ) ) ) | ( () ( (lv_valor_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_valor_5_1= 'S' | lv_valor_5_2= 'N' ) ) ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt7=1;
                }
                break;
            case RULE_STRING:
                {
                alt7=2;
                }
                break;
            case 18:
            case 19:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalEvaluacion.g:338:3: ( () ( (lv_valor_1_0= RULE_INT ) ) )
                    {
                    // InternalEvaluacion.g:338:3: ( () ( (lv_valor_1_0= RULE_INT ) ) )
                    // InternalEvaluacion.g:339:4: () ( (lv_valor_1_0= RULE_INT ) )
                    {
                    // InternalEvaluacion.g:339:4: ()
                    // InternalEvaluacion.g:340:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomoAccess().getIntConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalEvaluacion.g:346:4: ( (lv_valor_1_0= RULE_INT ) )
                    // InternalEvaluacion.g:347:5: (lv_valor_1_0= RULE_INT )
                    {
                    // InternalEvaluacion.g:347:5: (lv_valor_1_0= RULE_INT )
                    // InternalEvaluacion.g:348:6: lv_valor_1_0= RULE_INT
                    {
                    lv_valor_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_valor_1_0, grammarAccess.getAtomoAccess().getValorINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomoRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"valor",
                    							lv_valor_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEvaluacion.g:366:3: ( () ( (lv_valor_3_0= RULE_STRING ) ) )
                    {
                    // InternalEvaluacion.g:366:3: ( () ( (lv_valor_3_0= RULE_STRING ) ) )
                    // InternalEvaluacion.g:367:4: () ( (lv_valor_3_0= RULE_STRING ) )
                    {
                    // InternalEvaluacion.g:367:4: ()
                    // InternalEvaluacion.g:368:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomoAccess().getStringConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalEvaluacion.g:374:4: ( (lv_valor_3_0= RULE_STRING ) )
                    // InternalEvaluacion.g:375:5: (lv_valor_3_0= RULE_STRING )
                    {
                    // InternalEvaluacion.g:375:5: (lv_valor_3_0= RULE_STRING )
                    // InternalEvaluacion.g:376:6: lv_valor_3_0= RULE_STRING
                    {
                    lv_valor_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_valor_3_0, grammarAccess.getAtomoAccess().getValorSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomoRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"valor",
                    							lv_valor_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalEvaluacion.g:394:3: ( () ( ( (lv_valor_5_1= 'S' | lv_valor_5_2= 'N' ) ) ) )
                    {
                    // InternalEvaluacion.g:394:3: ( () ( ( (lv_valor_5_1= 'S' | lv_valor_5_2= 'N' ) ) ) )
                    // InternalEvaluacion.g:395:4: () ( ( (lv_valor_5_1= 'S' | lv_valor_5_2= 'N' ) ) )
                    {
                    // InternalEvaluacion.g:395:4: ()
                    // InternalEvaluacion.g:396:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomoAccess().getBoolConstantAction_2_0(),
                    						current);
                    				

                    }

                    // InternalEvaluacion.g:402:4: ( ( (lv_valor_5_1= 'S' | lv_valor_5_2= 'N' ) ) )
                    // InternalEvaluacion.g:403:5: ( (lv_valor_5_1= 'S' | lv_valor_5_2= 'N' ) )
                    {
                    // InternalEvaluacion.g:403:5: ( (lv_valor_5_1= 'S' | lv_valor_5_2= 'N' ) )
                    // InternalEvaluacion.g:404:6: (lv_valor_5_1= 'S' | lv_valor_5_2= 'N' )
                    {
                    // InternalEvaluacion.g:404:6: (lv_valor_5_1= 'S' | lv_valor_5_2= 'N' )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==18) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==19) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalEvaluacion.g:405:7: lv_valor_5_1= 'S'
                            {
                            lv_valor_5_1=(Token)match(input,18,FOLLOW_2); 

                            							newLeafNode(lv_valor_5_1, grammarAccess.getAtomoAccess().getValorSKeyword_2_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomoRule());
                            							}
                            							setWithLastConsumed(current, "valor", lv_valor_5_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalEvaluacion.g:416:7: lv_valor_5_2= 'N'
                            {
                            lv_valor_5_2=(Token)match(input,19,FOLLOW_2); 

                            							newLeafNode(lv_valor_5_2, grammarAccess.getAtomoAccess().getValorNKeyword_2_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomoRule());
                            							}
                            							setWithLastConsumed(current, "valor", lv_valor_5_2, null);
                            						

                            }
                            break;

                    }


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


    // $ANTLR start "entryRuleCriterioType"
    // InternalEvaluacion.g:434:1: entryRuleCriterioType returns [EObject current=null] : iv_ruleCriterioType= ruleCriterioType EOF ;
    public final EObject entryRuleCriterioType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCriterioType = null;


        try {
            // InternalEvaluacion.g:434:53: (iv_ruleCriterioType= ruleCriterioType EOF )
            // InternalEvaluacion.g:435:2: iv_ruleCriterioType= ruleCriterioType EOF
            {
             newCompositeNode(grammarAccess.getCriterioTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCriterioType=ruleCriterioType();

            state._fsp--;

             current =iv_ruleCriterioType; 
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
    // $ANTLR end "entryRuleCriterioType"


    // $ANTLR start "ruleCriterioType"
    // InternalEvaluacion.g:441:1: ruleCriterioType returns [EObject current=null] : ( ( (lv_elementType_0_0= ruleElementType ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? ) ;
    public final EObject ruleCriterioType() throws RecognitionException {
        EObject current = null;

        Token lv_array_1_0=null;
        Token lv_length_2_0=null;
        Token otherlv_3=null;
        EObject lv_elementType_0_0 = null;



        	enterRule();

        try {
            // InternalEvaluacion.g:447:2: ( ( ( (lv_elementType_0_0= ruleElementType ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? ) )
            // InternalEvaluacion.g:448:2: ( ( (lv_elementType_0_0= ruleElementType ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? )
            {
            // InternalEvaluacion.g:448:2: ( ( (lv_elementType_0_0= ruleElementType ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? )
            // InternalEvaluacion.g:449:3: ( (lv_elementType_0_0= ruleElementType ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )?
            {
            // InternalEvaluacion.g:449:3: ( (lv_elementType_0_0= ruleElementType ) )
            // InternalEvaluacion.g:450:4: (lv_elementType_0_0= ruleElementType )
            {
            // InternalEvaluacion.g:450:4: (lv_elementType_0_0= ruleElementType )
            // InternalEvaluacion.g:451:5: lv_elementType_0_0= ruleElementType
            {

            					newCompositeNode(grammarAccess.getCriterioTypeAccess().getElementTypeElementTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_elementType_0_0=ruleElementType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCriterioTypeRule());
            					}
            					set(
            						current,
            						"elementType",
            						lv_elementType_0_0,
            						"hwo.evtool.dsl.Evaluacion.ElementType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEvaluacion.g:468:3: ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalEvaluacion.g:469:4: ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']'
                    {
                    // InternalEvaluacion.g:469:4: ( (lv_array_1_0= '[' ) )
                    // InternalEvaluacion.g:470:5: (lv_array_1_0= '[' )
                    {
                    // InternalEvaluacion.g:470:5: (lv_array_1_0= '[' )
                    // InternalEvaluacion.g:471:6: lv_array_1_0= '['
                    {
                    lv_array_1_0=(Token)match(input,20,FOLLOW_12); 

                    						newLeafNode(lv_array_1_0, grammarAccess.getCriterioTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCriterioTypeRule());
                    						}
                    						setWithLastConsumed(current, "array", lv_array_1_0 != null, "[");
                    					

                    }


                    }

                    // InternalEvaluacion.g:483:4: ( (lv_length_2_0= RULE_INT ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_INT) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalEvaluacion.g:484:5: (lv_length_2_0= RULE_INT )
                            {
                            // InternalEvaluacion.g:484:5: (lv_length_2_0= RULE_INT )
                            // InternalEvaluacion.g:485:6: lv_length_2_0= RULE_INT
                            {
                            lv_length_2_0=(Token)match(input,RULE_INT,FOLLOW_13); 

                            						newLeafNode(lv_length_2_0, grammarAccess.getCriterioTypeAccess().getLengthINTTerminalRuleCall_1_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getCriterioTypeRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"length",
                            							lv_length_2_0,
                            							"org.eclipse.xtext.common.Terminals.INT");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getCriterioTypeAccess().getRightSquareBracketKeyword_1_2());
                    			

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
    // $ANTLR end "ruleCriterioType"


    // $ANTLR start "entryRuleElementType"
    // InternalEvaluacion.g:510:1: entryRuleElementType returns [EObject current=null] : iv_ruleElementType= ruleElementType EOF ;
    public final EObject entryRuleElementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementType = null;


        try {
            // InternalEvaluacion.g:510:52: (iv_ruleElementType= ruleElementType EOF )
            // InternalEvaluacion.g:511:2: iv_ruleElementType= ruleElementType EOF
            {
             newCompositeNode(grammarAccess.getElementTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementType=ruleElementType();

            state._fsp--;

             current =iv_ruleElementType; 
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
    // $ANTLR end "entryRuleElementType"


    // $ANTLR start "ruleElementType"
    // InternalEvaluacion.g:517:1: ruleElementType returns [EObject current=null] : this_ComponenteType_0= ruleComponenteType ;
    public final EObject ruleElementType() throws RecognitionException {
        EObject current = null;

        EObject this_ComponenteType_0 = null;



        	enterRule();

        try {
            // InternalEvaluacion.g:523:2: (this_ComponenteType_0= ruleComponenteType )
            // InternalEvaluacion.g:524:2: this_ComponenteType_0= ruleComponenteType
            {

            		newCompositeNode(grammarAccess.getElementTypeAccess().getComponenteTypeParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ComponenteType_0=ruleComponenteType();

            state._fsp--;


            		current = this_ComponenteType_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleElementType"


    // $ANTLR start "entryRuleComponenteType"
    // InternalEvaluacion.g:535:1: entryRuleComponenteType returns [EObject current=null] : iv_ruleComponenteType= ruleComponenteType EOF ;
    public final EObject entryRuleComponenteType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponenteType = null;


        try {
            // InternalEvaluacion.g:535:55: (iv_ruleComponenteType= ruleComponenteType EOF )
            // InternalEvaluacion.g:536:2: iv_ruleComponenteType= ruleComponenteType EOF
            {
             newCompositeNode(grammarAccess.getComponenteTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponenteType=ruleComponenteType();

            state._fsp--;

             current =iv_ruleComponenteType; 
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
    // $ANTLR end "entryRuleComponenteType"


    // $ANTLR start "ruleComponenteType"
    // InternalEvaluacion.g:542:1: ruleComponenteType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleComponenteType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalEvaluacion.g:548:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalEvaluacion.g:549:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalEvaluacion.g:549:2: ( (otherlv_0= RULE_ID ) )
            // InternalEvaluacion.g:550:3: (otherlv_0= RULE_ID )
            {
            // InternalEvaluacion.g:550:3: (otherlv_0= RULE_ID )
            // InternalEvaluacion.g:551:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getComponenteTypeRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getComponenteTypeAccess().getComponenteCmpntEvaluacionCrossReference_0());
            			

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
    // $ANTLR end "ruleComponenteType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000C0060L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});

}