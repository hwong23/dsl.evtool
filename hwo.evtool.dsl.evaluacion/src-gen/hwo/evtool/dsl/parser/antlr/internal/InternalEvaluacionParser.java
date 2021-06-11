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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'componente'", "'hereda'", "'{'", "'}'", "'criterio'", "'S'", "'N'", "'['", "']'"
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
    // InternalEvaluacion.g:194:1: ruleCriterio returns [EObject current=null] : ( ( (lv_type_0_0= ruleCriterioType ) ) | (otherlv_1= 'criterio' ( (lv_name_2_0= RULE_ID ) ) ( (lv_valor_3_0= ruleValorCriterio ) ) ) ) ;
    public final EObject ruleCriterio() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_type_0_0 = null;

        EObject lv_valor_3_0 = null;



        	enterRule();

        try {
            // InternalEvaluacion.g:200:2: ( ( ( (lv_type_0_0= ruleCriterioType ) ) | (otherlv_1= 'criterio' ( (lv_name_2_0= RULE_ID ) ) ( (lv_valor_3_0= ruleValorCriterio ) ) ) ) )
            // InternalEvaluacion.g:201:2: ( ( (lv_type_0_0= ruleCriterioType ) ) | (otherlv_1= 'criterio' ( (lv_name_2_0= RULE_ID ) ) ( (lv_valor_3_0= ruleValorCriterio ) ) ) )
            {
            // InternalEvaluacion.g:201:2: ( ( (lv_type_0_0= ruleCriterioType ) ) | (otherlv_1= 'criterio' ( (lv_name_2_0= RULE_ID ) ) ( (lv_valor_3_0= ruleValorCriterio ) ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
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
                    // InternalEvaluacion.g:222:3: (otherlv_1= 'criterio' ( (lv_name_2_0= RULE_ID ) ) ( (lv_valor_3_0= ruleValorCriterio ) ) )
                    {
                    // InternalEvaluacion.g:222:3: (otherlv_1= 'criterio' ( (lv_name_2_0= RULE_ID ) ) ( (lv_valor_3_0= ruleValorCriterio ) ) )
                    // InternalEvaluacion.g:223:4: otherlv_1= 'criterio' ( (lv_name_2_0= RULE_ID ) ) ( (lv_valor_3_0= ruleValorCriterio ) )
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

                    // InternalEvaluacion.g:245:4: ( (lv_valor_3_0= ruleValorCriterio ) )
                    // InternalEvaluacion.g:246:5: (lv_valor_3_0= ruleValorCriterio )
                    {
                    // InternalEvaluacion.g:246:5: (lv_valor_3_0= ruleValorCriterio )
                    // InternalEvaluacion.g:247:6: lv_valor_3_0= ruleValorCriterio
                    {

                    						newCompositeNode(grammarAccess.getCriterioAccess().getValorValorCriterioParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_valor_3_0=ruleValorCriterio();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCriterioRule());
                    						}
                    						set(
                    							current,
                    							"valor",
                    							lv_valor_3_0,
                    							"hwo.evtool.dsl.Evaluacion.ValorCriterio");
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
    // $ANTLR end "ruleCriterio"


    // $ANTLR start "entryRuleValorCriterio"
    // InternalEvaluacion.g:269:1: entryRuleValorCriterio returns [EObject current=null] : iv_ruleValorCriterio= ruleValorCriterio EOF ;
    public final EObject entryRuleValorCriterio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValorCriterio = null;


        try {
            // InternalEvaluacion.g:269:54: (iv_ruleValorCriterio= ruleValorCriterio EOF )
            // InternalEvaluacion.g:270:2: iv_ruleValorCriterio= ruleValorCriterio EOF
            {
             newCompositeNode(grammarAccess.getValorCriterioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValorCriterio=ruleValorCriterio();

            state._fsp--;

             current =iv_ruleValorCriterio; 
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
    // $ANTLR end "entryRuleValorCriterio"


    // $ANTLR start "ruleValorCriterio"
    // InternalEvaluacion.g:276:1: ruleValorCriterio returns [EObject current=null] : ( ( (lv_valorCriterio_0_1= 'S' | lv_valorCriterio_0_2= 'N' ) ) ) ;
    public final EObject ruleValorCriterio() throws RecognitionException {
        EObject current = null;

        Token lv_valorCriterio_0_1=null;
        Token lv_valorCriterio_0_2=null;


        	enterRule();

        try {
            // InternalEvaluacion.g:282:2: ( ( ( (lv_valorCriterio_0_1= 'S' | lv_valorCriterio_0_2= 'N' ) ) ) )
            // InternalEvaluacion.g:283:2: ( ( (lv_valorCriterio_0_1= 'S' | lv_valorCriterio_0_2= 'N' ) ) )
            {
            // InternalEvaluacion.g:283:2: ( ( (lv_valorCriterio_0_1= 'S' | lv_valorCriterio_0_2= 'N' ) ) )
            // InternalEvaluacion.g:284:3: ( (lv_valorCriterio_0_1= 'S' | lv_valorCriterio_0_2= 'N' ) )
            {
            // InternalEvaluacion.g:284:3: ( (lv_valorCriterio_0_1= 'S' | lv_valorCriterio_0_2= 'N' ) )
            // InternalEvaluacion.g:285:4: (lv_valorCriterio_0_1= 'S' | lv_valorCriterio_0_2= 'N' )
            {
            // InternalEvaluacion.g:285:4: (lv_valorCriterio_0_1= 'S' | lv_valorCriterio_0_2= 'N' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalEvaluacion.g:286:5: lv_valorCriterio_0_1= 'S'
                    {
                    lv_valorCriterio_0_1=(Token)match(input,16,FOLLOW_2); 

                    					newLeafNode(lv_valorCriterio_0_1, grammarAccess.getValorCriterioAccess().getValorCriterioSKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValorCriterioRule());
                    					}
                    					setWithLastConsumed(current, "valorCriterio", lv_valorCriterio_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalEvaluacion.g:297:5: lv_valorCriterio_0_2= 'N'
                    {
                    lv_valorCriterio_0_2=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(lv_valorCriterio_0_2, grammarAccess.getValorCriterioAccess().getValorCriterioNKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValorCriterioRule());
                    					}
                    					setWithLastConsumed(current, "valorCriterio", lv_valorCriterio_0_2, null);
                    				

                    }
                    break;

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
    // $ANTLR end "ruleValorCriterio"


    // $ANTLR start "entryRuleCriterioType"
    // InternalEvaluacion.g:313:1: entryRuleCriterioType returns [EObject current=null] : iv_ruleCriterioType= ruleCriterioType EOF ;
    public final EObject entryRuleCriterioType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCriterioType = null;


        try {
            // InternalEvaluacion.g:313:53: (iv_ruleCriterioType= ruleCriterioType EOF )
            // InternalEvaluacion.g:314:2: iv_ruleCriterioType= ruleCriterioType EOF
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
    // InternalEvaluacion.g:320:1: ruleCriterioType returns [EObject current=null] : ( ( (lv_elementType_0_0= ruleElementType ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? ) ;
    public final EObject ruleCriterioType() throws RecognitionException {
        EObject current = null;

        Token lv_array_1_0=null;
        Token lv_length_2_0=null;
        Token otherlv_3=null;
        EObject lv_elementType_0_0 = null;



        	enterRule();

        try {
            // InternalEvaluacion.g:326:2: ( ( ( (lv_elementType_0_0= ruleElementType ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? ) )
            // InternalEvaluacion.g:327:2: ( ( (lv_elementType_0_0= ruleElementType ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? )
            {
            // InternalEvaluacion.g:327:2: ( ( (lv_elementType_0_0= ruleElementType ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? )
            // InternalEvaluacion.g:328:3: ( (lv_elementType_0_0= ruleElementType ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )?
            {
            // InternalEvaluacion.g:328:3: ( (lv_elementType_0_0= ruleElementType ) )
            // InternalEvaluacion.g:329:4: (lv_elementType_0_0= ruleElementType )
            {
            // InternalEvaluacion.g:329:4: (lv_elementType_0_0= ruleElementType )
            // InternalEvaluacion.g:330:5: lv_elementType_0_0= ruleElementType
            {

            					newCompositeNode(grammarAccess.getCriterioTypeAccess().getElementTypeElementTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
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

            // InternalEvaluacion.g:347:3: ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEvaluacion.g:348:4: ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']'
                    {
                    // InternalEvaluacion.g:348:4: ( (lv_array_1_0= '[' ) )
                    // InternalEvaluacion.g:349:5: (lv_array_1_0= '[' )
                    {
                    // InternalEvaluacion.g:349:5: (lv_array_1_0= '[' )
                    // InternalEvaluacion.g:350:6: lv_array_1_0= '['
                    {
                    lv_array_1_0=(Token)match(input,18,FOLLOW_10); 

                    						newLeafNode(lv_array_1_0, grammarAccess.getCriterioTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCriterioTypeRule());
                    						}
                    						setWithLastConsumed(current, "array", lv_array_1_0 != null, "[");
                    					

                    }


                    }

                    // InternalEvaluacion.g:362:4: ( (lv_length_2_0= RULE_INT ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_INT) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalEvaluacion.g:363:5: (lv_length_2_0= RULE_INT )
                            {
                            // InternalEvaluacion.g:363:5: (lv_length_2_0= RULE_INT )
                            // InternalEvaluacion.g:364:6: lv_length_2_0= RULE_INT
                            {
                            lv_length_2_0=(Token)match(input,RULE_INT,FOLLOW_11); 

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

                    otherlv_3=(Token)match(input,19,FOLLOW_2); 

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
    // InternalEvaluacion.g:389:1: entryRuleElementType returns [EObject current=null] : iv_ruleElementType= ruleElementType EOF ;
    public final EObject entryRuleElementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementType = null;


        try {
            // InternalEvaluacion.g:389:52: (iv_ruleElementType= ruleElementType EOF )
            // InternalEvaluacion.g:390:2: iv_ruleElementType= ruleElementType EOF
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
    // InternalEvaluacion.g:396:1: ruleElementType returns [EObject current=null] : this_ComponenteType_0= ruleComponenteType ;
    public final EObject ruleElementType() throws RecognitionException {
        EObject current = null;

        EObject this_ComponenteType_0 = null;



        	enterRule();

        try {
            // InternalEvaluacion.g:402:2: (this_ComponenteType_0= ruleComponenteType )
            // InternalEvaluacion.g:403:2: this_ComponenteType_0= ruleComponenteType
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
    // InternalEvaluacion.g:414:1: entryRuleComponenteType returns [EObject current=null] : iv_ruleComponenteType= ruleComponenteType EOF ;
    public final EObject entryRuleComponenteType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponenteType = null;


        try {
            // InternalEvaluacion.g:414:55: (iv_ruleComponenteType= ruleComponenteType EOF )
            // InternalEvaluacion.g:415:2: iv_ruleComponenteType= ruleComponenteType EOF
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
    // InternalEvaluacion.g:421:1: ruleComponenteType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleComponenteType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalEvaluacion.g:427:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalEvaluacion.g:428:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalEvaluacion.g:428:2: ( (otherlv_0= RULE_ID ) )
            // InternalEvaluacion.g:429:3: (otherlv_0= RULE_ID )
            {
            // InternalEvaluacion.g:429:3: (otherlv_0= RULE_ID )
            // InternalEvaluacion.g:430:4: otherlv_0= RULE_ID
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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});

}