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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'componente'", "'hereda'", "'{'", "'}'", "'criterio'", "'='", "':'", "'S'", "'N'"
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
        	return "EvaluacionModel";
       	}

       	@Override
       	protected EvaluacionGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEvaluacionModel"
    // InternalEvaluacion.g:64:1: entryRuleEvaluacionModel returns [EObject current=null] : iv_ruleEvaluacionModel= ruleEvaluacionModel EOF ;
    public final EObject entryRuleEvaluacionModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluacionModel = null;


        try {
            // InternalEvaluacion.g:64:56: (iv_ruleEvaluacionModel= ruleEvaluacionModel EOF )
            // InternalEvaluacion.g:65:2: iv_ruleEvaluacionModel= ruleEvaluacionModel EOF
            {
             newCompositeNode(grammarAccess.getEvaluacionModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvaluacionModel=ruleEvaluacionModel();

            state._fsp--;

             current =iv_ruleEvaluacionModel; 
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
    // $ANTLR end "entryRuleEvaluacionModel"


    // $ANTLR start "ruleEvaluacionModel"
    // InternalEvaluacion.g:71:1: ruleEvaluacionModel returns [EObject current=null] : ( (lv_entities_0_0= ruleCmpntEvaluacion ) )* ;
    public final EObject ruleEvaluacionModel() throws RecognitionException {
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

            	    				newCompositeNode(grammarAccess.getEvaluacionModelAccess().getEntitiesCmpntEvaluacionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_entities_0_0=ruleCmpntEvaluacion();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getEvaluacionModelRule());
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
    // $ANTLR end "ruleEvaluacionModel"


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
    // InternalEvaluacion.g:194:1: ruleCriterio returns [EObject current=null] : (this_CriterioComplejoType_0= ruleCriterioComplejoType | this_CriterioSimpleType_1= ruleCriterioSimpleType ) ;
    public final EObject ruleCriterio() throws RecognitionException {
        EObject current = null;

        EObject this_CriterioComplejoType_0 = null;

        EObject this_CriterioSimpleType_1 = null;



        	enterRule();

        try {
            // InternalEvaluacion.g:200:2: ( (this_CriterioComplejoType_0= ruleCriterioComplejoType | this_CriterioSimpleType_1= ruleCriterioSimpleType ) )
            // InternalEvaluacion.g:201:2: (this_CriterioComplejoType_0= ruleCriterioComplejoType | this_CriterioSimpleType_1= ruleCriterioSimpleType )
            {
            // InternalEvaluacion.g:201:2: (this_CriterioComplejoType_0= ruleCriterioComplejoType | this_CriterioSimpleType_1= ruleCriterioSimpleType )
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
                    // InternalEvaluacion.g:202:3: this_CriterioComplejoType_0= ruleCriterioComplejoType
                    {

                    			newCompositeNode(grammarAccess.getCriterioAccess().getCriterioComplejoTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CriterioComplejoType_0=ruleCriterioComplejoType();

                    state._fsp--;


                    			current = this_CriterioComplejoType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEvaluacion.g:211:3: this_CriterioSimpleType_1= ruleCriterioSimpleType
                    {

                    			newCompositeNode(grammarAccess.getCriterioAccess().getCriterioSimpleTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CriterioSimpleType_1=ruleCriterioSimpleType();

                    state._fsp--;


                    			current = this_CriterioSimpleType_1;
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
    // $ANTLR end "ruleCriterio"


    // $ANTLR start "entryRuleCriterioSimpleType"
    // InternalEvaluacion.g:223:1: entryRuleCriterioSimpleType returns [EObject current=null] : iv_ruleCriterioSimpleType= ruleCriterioSimpleType EOF ;
    public final EObject entryRuleCriterioSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCriterioSimpleType = null;


        try {
            // InternalEvaluacion.g:223:59: (iv_ruleCriterioSimpleType= ruleCriterioSimpleType EOF )
            // InternalEvaluacion.g:224:2: iv_ruleCriterioSimpleType= ruleCriterioSimpleType EOF
            {
             newCompositeNode(grammarAccess.getCriterioSimpleTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCriterioSimpleType=ruleCriterioSimpleType();

            state._fsp--;

             current =iv_ruleCriterioSimpleType; 
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
    // $ANTLR end "entryRuleCriterioSimpleType"


    // $ANTLR start "ruleCriterioSimpleType"
    // InternalEvaluacion.g:230:1: ruleCriterioSimpleType returns [EObject current=null] : (otherlv_0= 'criterio' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expresion_3_0= ruleExpresion ) ) (otherlv_4= ':' ( (lv_soporte_5_0= ruleExpresion ) ) )? ) ;
    public final EObject ruleCriterioSimpleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expresion_3_0 = null;

        EObject lv_soporte_5_0 = null;



        	enterRule();

        try {
            // InternalEvaluacion.g:236:2: ( (otherlv_0= 'criterio' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expresion_3_0= ruleExpresion ) ) (otherlv_4= ':' ( (lv_soporte_5_0= ruleExpresion ) ) )? ) )
            // InternalEvaluacion.g:237:2: (otherlv_0= 'criterio' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expresion_3_0= ruleExpresion ) ) (otherlv_4= ':' ( (lv_soporte_5_0= ruleExpresion ) ) )? )
            {
            // InternalEvaluacion.g:237:2: (otherlv_0= 'criterio' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expresion_3_0= ruleExpresion ) ) (otherlv_4= ':' ( (lv_soporte_5_0= ruleExpresion ) ) )? )
            // InternalEvaluacion.g:238:3: otherlv_0= 'criterio' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expresion_3_0= ruleExpresion ) ) (otherlv_4= ':' ( (lv_soporte_5_0= ruleExpresion ) ) )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCriterioSimpleTypeAccess().getCriterioKeyword_0());
            		
            // InternalEvaluacion.g:242:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEvaluacion.g:243:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEvaluacion.g:243:4: (lv_name_1_0= RULE_ID )
            // InternalEvaluacion.g:244:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCriterioSimpleTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCriterioSimpleTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getCriterioSimpleTypeAccess().getEqualsSignKeyword_2());
            		
            // InternalEvaluacion.g:264:3: ( (lv_expresion_3_0= ruleExpresion ) )
            // InternalEvaluacion.g:265:4: (lv_expresion_3_0= ruleExpresion )
            {
            // InternalEvaluacion.g:265:4: (lv_expresion_3_0= ruleExpresion )
            // InternalEvaluacion.g:266:5: lv_expresion_3_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getCriterioSimpleTypeAccess().getExpresionExpresionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_expresion_3_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCriterioSimpleTypeRule());
            					}
            					set(
            						current,
            						"expresion",
            						lv_expresion_3_0,
            						"hwo.evtool.dsl.Evaluacion.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEvaluacion.g:283:3: (otherlv_4= ':' ( (lv_soporte_5_0= ruleExpresion ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEvaluacion.g:284:4: otherlv_4= ':' ( (lv_soporte_5_0= ruleExpresion ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getCriterioSimpleTypeAccess().getColonKeyword_4_0());
                    			
                    // InternalEvaluacion.g:288:4: ( (lv_soporte_5_0= ruleExpresion ) )
                    // InternalEvaluacion.g:289:5: (lv_soporte_5_0= ruleExpresion )
                    {
                    // InternalEvaluacion.g:289:5: (lv_soporte_5_0= ruleExpresion )
                    // InternalEvaluacion.g:290:6: lv_soporte_5_0= ruleExpresion
                    {

                    						newCompositeNode(grammarAccess.getCriterioSimpleTypeAccess().getSoporteExpresionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_soporte_5_0=ruleExpresion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCriterioSimpleTypeRule());
                    						}
                    						set(
                    							current,
                    							"soporte",
                    							lv_soporte_5_0,
                    							"hwo.evtool.dsl.Evaluacion.Expresion");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleCriterioSimpleType"


    // $ANTLR start "entryRuleExpresion"
    // InternalEvaluacion.g:312:1: entryRuleExpresion returns [EObject current=null] : iv_ruleExpresion= ruleExpresion EOF ;
    public final EObject entryRuleExpresion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresion = null;


        try {
            // InternalEvaluacion.g:312:50: (iv_ruleExpresion= ruleExpresion EOF )
            // InternalEvaluacion.g:313:2: iv_ruleExpresion= ruleExpresion EOF
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
    // InternalEvaluacion.g:319:1: ruleExpresion returns [EObject current=null] : this_Atomo_0= ruleAtomo ;
    public final EObject ruleExpresion() throws RecognitionException {
        EObject current = null;

        EObject this_Atomo_0 = null;



        	enterRule();

        try {
            // InternalEvaluacion.g:325:2: (this_Atomo_0= ruleAtomo )
            // InternalEvaluacion.g:326:2: this_Atomo_0= ruleAtomo
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
    // InternalEvaluacion.g:337:1: entryRuleAtomo returns [EObject current=null] : iv_ruleAtomo= ruleAtomo EOF ;
    public final EObject entryRuleAtomo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomo = null;


        try {
            // InternalEvaluacion.g:337:46: (iv_ruleAtomo= ruleAtomo EOF )
            // InternalEvaluacion.g:338:2: iv_ruleAtomo= ruleAtomo EOF
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
    // InternalEvaluacion.g:344:1: ruleAtomo returns [EObject current=null] : ( ( () ( (lv_valor_1_0= RULE_INT ) ) ) | ( () ( (lv_valor_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_valor_5_1= 'S' | lv_valor_5_2= 'N' ) ) ) ) ) ;
    public final EObject ruleAtomo() throws RecognitionException {
        EObject current = null;

        Token lv_valor_1_0=null;
        Token lv_valor_3_0=null;
        Token lv_valor_5_1=null;
        Token lv_valor_5_2=null;


        	enterRule();

        try {
            // InternalEvaluacion.g:350:2: ( ( ( () ( (lv_valor_1_0= RULE_INT ) ) ) | ( () ( (lv_valor_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_valor_5_1= 'S' | lv_valor_5_2= 'N' ) ) ) ) ) )
            // InternalEvaluacion.g:351:2: ( ( () ( (lv_valor_1_0= RULE_INT ) ) ) | ( () ( (lv_valor_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_valor_5_1= 'S' | lv_valor_5_2= 'N' ) ) ) ) )
            {
            // InternalEvaluacion.g:351:2: ( ( () ( (lv_valor_1_0= RULE_INT ) ) ) | ( () ( (lv_valor_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_valor_5_1= 'S' | lv_valor_5_2= 'N' ) ) ) ) )
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
                    // InternalEvaluacion.g:352:3: ( () ( (lv_valor_1_0= RULE_INT ) ) )
                    {
                    // InternalEvaluacion.g:352:3: ( () ( (lv_valor_1_0= RULE_INT ) ) )
                    // InternalEvaluacion.g:353:4: () ( (lv_valor_1_0= RULE_INT ) )
                    {
                    // InternalEvaluacion.g:353:4: ()
                    // InternalEvaluacion.g:354:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomoAccess().getIntConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalEvaluacion.g:360:4: ( (lv_valor_1_0= RULE_INT ) )
                    // InternalEvaluacion.g:361:5: (lv_valor_1_0= RULE_INT )
                    {
                    // InternalEvaluacion.g:361:5: (lv_valor_1_0= RULE_INT )
                    // InternalEvaluacion.g:362:6: lv_valor_1_0= RULE_INT
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
                    // InternalEvaluacion.g:380:3: ( () ( (lv_valor_3_0= RULE_STRING ) ) )
                    {
                    // InternalEvaluacion.g:380:3: ( () ( (lv_valor_3_0= RULE_STRING ) ) )
                    // InternalEvaluacion.g:381:4: () ( (lv_valor_3_0= RULE_STRING ) )
                    {
                    // InternalEvaluacion.g:381:4: ()
                    // InternalEvaluacion.g:382:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomoAccess().getStringConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalEvaluacion.g:388:4: ( (lv_valor_3_0= RULE_STRING ) )
                    // InternalEvaluacion.g:389:5: (lv_valor_3_0= RULE_STRING )
                    {
                    // InternalEvaluacion.g:389:5: (lv_valor_3_0= RULE_STRING )
                    // InternalEvaluacion.g:390:6: lv_valor_3_0= RULE_STRING
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
                    // InternalEvaluacion.g:408:3: ( () ( ( (lv_valor_5_1= 'S' | lv_valor_5_2= 'N' ) ) ) )
                    {
                    // InternalEvaluacion.g:408:3: ( () ( ( (lv_valor_5_1= 'S' | lv_valor_5_2= 'N' ) ) ) )
                    // InternalEvaluacion.g:409:4: () ( ( (lv_valor_5_1= 'S' | lv_valor_5_2= 'N' ) ) )
                    {
                    // InternalEvaluacion.g:409:4: ()
                    // InternalEvaluacion.g:410:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomoAccess().getBoolConstantAction_2_0(),
                    						current);
                    				

                    }

                    // InternalEvaluacion.g:416:4: ( ( (lv_valor_5_1= 'S' | lv_valor_5_2= 'N' ) ) )
                    // InternalEvaluacion.g:417:5: ( (lv_valor_5_1= 'S' | lv_valor_5_2= 'N' ) )
                    {
                    // InternalEvaluacion.g:417:5: ( (lv_valor_5_1= 'S' | lv_valor_5_2= 'N' ) )
                    // InternalEvaluacion.g:418:6: (lv_valor_5_1= 'S' | lv_valor_5_2= 'N' )
                    {
                    // InternalEvaluacion.g:418:6: (lv_valor_5_1= 'S' | lv_valor_5_2= 'N' )
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
                            // InternalEvaluacion.g:419:7: lv_valor_5_1= 'S'
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
                            // InternalEvaluacion.g:430:7: lv_valor_5_2= 'N'
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


    // $ANTLR start "entryRuleCriterioComplejoType"
    // InternalEvaluacion.g:448:1: entryRuleCriterioComplejoType returns [EObject current=null] : iv_ruleCriterioComplejoType= ruleCriterioComplejoType EOF ;
    public final EObject entryRuleCriterioComplejoType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCriterioComplejoType = null;


        try {
            // InternalEvaluacion.g:448:61: (iv_ruleCriterioComplejoType= ruleCriterioComplejoType EOF )
            // InternalEvaluacion.g:449:2: iv_ruleCriterioComplejoType= ruleCriterioComplejoType EOF
            {
             newCompositeNode(grammarAccess.getCriterioComplejoTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCriterioComplejoType=ruleCriterioComplejoType();

            state._fsp--;

             current =iv_ruleCriterioComplejoType; 
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
    // $ANTLR end "entryRuleCriterioComplejoType"


    // $ANTLR start "ruleCriterioComplejoType"
    // InternalEvaluacion.g:455:1: ruleCriterioComplejoType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleCriterioComplejoType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalEvaluacion.g:461:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalEvaluacion.g:462:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalEvaluacion.g:462:2: ( (otherlv_0= RULE_ID ) )
            // InternalEvaluacion.g:463:3: (otherlv_0= RULE_ID )
            {
            // InternalEvaluacion.g:463:3: (otherlv_0= RULE_ID )
            // InternalEvaluacion.g:464:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCriterioComplejoTypeRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getCriterioComplejoTypeAccess().getComponenteCmpntEvaluacionCrossReference_0());
            			

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
    // $ANTLR end "ruleCriterioComplejoType"

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

}