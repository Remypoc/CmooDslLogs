package fr.paris10.miage.parser.antlr.internal;

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
import fr.paris10.miage.services.DslLogsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslLogsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\u00E0'", "'utilisateur'", "'r\\u00E9ponse'", "'/'", "'-'", "':'", "'='", "'demande'", "'appelle'", "'param\\u00E8tres'", "'et'", "'OK'", "'KO'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDslLogsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslLogsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslLogsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDslLogs.g"; }



     	private DslLogsGrammarAccess grammarAccess;

        public InternalDslLogsParser(TokenStream input, DslLogsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected DslLogsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalDslLogs.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalDslLogs.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalDslLogs.g:66:2: iv_ruleModel= ruleModel EOF
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
    // InternalDslLogs.g:72:1: ruleModel returns [EObject current=null] : ( (lv_logs_0_0= ruleLog ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_logs_0_0 = null;



        	enterRule();

        try {
            // InternalDslLogs.g:78:2: ( ( (lv_logs_0_0= ruleLog ) )* )
            // InternalDslLogs.g:79:2: ( (lv_logs_0_0= ruleLog ) )*
            {
            // InternalDslLogs.g:79:2: ( (lv_logs_0_0= ruleLog ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDslLogs.g:80:3: (lv_logs_0_0= ruleLog )
            	    {
            	    // InternalDslLogs.g:80:3: (lv_logs_0_0= ruleLog )
            	    // InternalDslLogs.g:81:4: lv_logs_0_0= ruleLog
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getLogsLogParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_logs_0_0=ruleLog();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"logs",
            	    					lv_logs_0_0,
            	    					"fr.paris10.miage.DslLogs.Log");
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


    // $ANTLR start "entryRuleLog"
    // InternalDslLogs.g:101:1: entryRuleLog returns [EObject current=null] : iv_ruleLog= ruleLog EOF ;
    public final EObject entryRuleLog() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLog = null;


        try {
            // InternalDslLogs.g:101:44: (iv_ruleLog= ruleLog EOF )
            // InternalDslLogs.g:102:2: iv_ruleLog= ruleLog EOF
            {
             newCompositeNode(grammarAccess.getLogRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLog=ruleLog();

            state._fsp--;

             current =iv_ruleLog; 
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
    // $ANTLR end "entryRuleLog"


    // $ANTLR start "ruleLog"
    // InternalDslLogs.g:108:1: ruleLog returns [EObject current=null] : (otherlv_0= '\\u00E0' ( (lv_date_1_0= ruleDate ) ) otherlv_2= 'utilisateur' ( (lv_utilisateur_3_0= ruleUtilisateur ) ) ( (lv_action_4_0= ruleAction ) ) ( (lv_parametre_5_0= ruleParametre ) )? otherlv_6= 'r\\u00E9ponse' ( (lv_reponse_7_0= ruleReponse ) ) ) ;
    public final EObject ruleLog() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_date_1_0 = null;

        EObject lv_utilisateur_3_0 = null;

        EObject lv_action_4_0 = null;

        EObject lv_parametre_5_0 = null;

        Enumerator lv_reponse_7_0 = null;



        	enterRule();

        try {
            // InternalDslLogs.g:114:2: ( (otherlv_0= '\\u00E0' ( (lv_date_1_0= ruleDate ) ) otherlv_2= 'utilisateur' ( (lv_utilisateur_3_0= ruleUtilisateur ) ) ( (lv_action_4_0= ruleAction ) ) ( (lv_parametre_5_0= ruleParametre ) )? otherlv_6= 'r\\u00E9ponse' ( (lv_reponse_7_0= ruleReponse ) ) ) )
            // InternalDslLogs.g:115:2: (otherlv_0= '\\u00E0' ( (lv_date_1_0= ruleDate ) ) otherlv_2= 'utilisateur' ( (lv_utilisateur_3_0= ruleUtilisateur ) ) ( (lv_action_4_0= ruleAction ) ) ( (lv_parametre_5_0= ruleParametre ) )? otherlv_6= 'r\\u00E9ponse' ( (lv_reponse_7_0= ruleReponse ) ) )
            {
            // InternalDslLogs.g:115:2: (otherlv_0= '\\u00E0' ( (lv_date_1_0= ruleDate ) ) otherlv_2= 'utilisateur' ( (lv_utilisateur_3_0= ruleUtilisateur ) ) ( (lv_action_4_0= ruleAction ) ) ( (lv_parametre_5_0= ruleParametre ) )? otherlv_6= 'r\\u00E9ponse' ( (lv_reponse_7_0= ruleReponse ) ) )
            // InternalDslLogs.g:116:3: otherlv_0= '\\u00E0' ( (lv_date_1_0= ruleDate ) ) otherlv_2= 'utilisateur' ( (lv_utilisateur_3_0= ruleUtilisateur ) ) ( (lv_action_4_0= ruleAction ) ) ( (lv_parametre_5_0= ruleParametre ) )? otherlv_6= 'r\\u00E9ponse' ( (lv_reponse_7_0= ruleReponse ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLogAccess().getLatinSmallLetterAWithGraveKeyword_0());
            		
            // InternalDslLogs.g:120:3: ( (lv_date_1_0= ruleDate ) )
            // InternalDslLogs.g:121:4: (lv_date_1_0= ruleDate )
            {
            // InternalDslLogs.g:121:4: (lv_date_1_0= ruleDate )
            // InternalDslLogs.g:122:5: lv_date_1_0= ruleDate
            {

            					newCompositeNode(grammarAccess.getLogAccess().getDateDateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_date_1_0=ruleDate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogRule());
            					}
            					set(
            						current,
            						"date",
            						lv_date_1_0,
            						"fr.paris10.miage.DslLogs.Date");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getLogAccess().getUtilisateurKeyword_2());
            		
            // InternalDslLogs.g:143:3: ( (lv_utilisateur_3_0= ruleUtilisateur ) )
            // InternalDslLogs.g:144:4: (lv_utilisateur_3_0= ruleUtilisateur )
            {
            // InternalDslLogs.g:144:4: (lv_utilisateur_3_0= ruleUtilisateur )
            // InternalDslLogs.g:145:5: lv_utilisateur_3_0= ruleUtilisateur
            {

            					newCompositeNode(grammarAccess.getLogAccess().getUtilisateurUtilisateurParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_utilisateur_3_0=ruleUtilisateur();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogRule());
            					}
            					set(
            						current,
            						"utilisateur",
            						lv_utilisateur_3_0,
            						"fr.paris10.miage.DslLogs.Utilisateur");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDslLogs.g:162:3: ( (lv_action_4_0= ruleAction ) )
            // InternalDslLogs.g:163:4: (lv_action_4_0= ruleAction )
            {
            // InternalDslLogs.g:163:4: (lv_action_4_0= ruleAction )
            // InternalDslLogs.g:164:5: lv_action_4_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getLogAccess().getActionActionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_action_4_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_4_0,
            						"fr.paris10.miage.DslLogs.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDslLogs.g:181:3: ( (lv_parametre_5_0= ruleParametre ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDslLogs.g:182:4: (lv_parametre_5_0= ruleParametre )
                    {
                    // InternalDslLogs.g:182:4: (lv_parametre_5_0= ruleParametre )
                    // InternalDslLogs.g:183:5: lv_parametre_5_0= ruleParametre
                    {

                    					newCompositeNode(grammarAccess.getLogAccess().getParametreParametreParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_parametre_5_0=ruleParametre();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLogRule());
                    					}
                    					set(
                    						current,
                    						"parametre",
                    						lv_parametre_5_0,
                    						"fr.paris10.miage.DslLogs.Parametre");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getLogAccess().getRPonseKeyword_6());
            		
            // InternalDslLogs.g:204:3: ( (lv_reponse_7_0= ruleReponse ) )
            // InternalDslLogs.g:205:4: (lv_reponse_7_0= ruleReponse )
            {
            // InternalDslLogs.g:205:4: (lv_reponse_7_0= ruleReponse )
            // InternalDslLogs.g:206:5: lv_reponse_7_0= ruleReponse
            {

            					newCompositeNode(grammarAccess.getLogAccess().getReponseReponseEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_reponse_7_0=ruleReponse();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogRule());
            					}
            					set(
            						current,
            						"reponse",
            						lv_reponse_7_0,
            						"fr.paris10.miage.DslLogs.Reponse");
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
    // $ANTLR end "ruleLog"


    // $ANTLR start "entryRuleDate"
    // InternalDslLogs.g:227:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // InternalDslLogs.g:227:45: (iv_ruleDate= ruleDate EOF )
            // InternalDslLogs.g:228:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate; 
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
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // InternalDslLogs.g:234:1: ruleDate returns [EObject current=null] : ( ( (lv_annee_0_0= RULE_INT ) ) otherlv_1= '/' ( (lv_mois_2_0= RULE_INT ) ) otherlv_3= '/' ( (lv_jour_4_0= RULE_INT ) ) otherlv_5= '-' ( (lv_heure_6_0= RULE_INT ) ) otherlv_7= ':' ( (lv_minute_8_0= RULE_INT ) ) otherlv_9= ':' ( (lv_seconde_10_0= RULE_INT ) ) ) ;
    public final EObject ruleDate() throws RecognitionException {
        EObject current = null;

        Token lv_annee_0_0=null;
        Token otherlv_1=null;
        Token lv_mois_2_0=null;
        Token otherlv_3=null;
        Token lv_jour_4_0=null;
        Token otherlv_5=null;
        Token lv_heure_6_0=null;
        Token otherlv_7=null;
        Token lv_minute_8_0=null;
        Token otherlv_9=null;
        Token lv_seconde_10_0=null;


        	enterRule();

        try {
            // InternalDslLogs.g:240:2: ( ( ( (lv_annee_0_0= RULE_INT ) ) otherlv_1= '/' ( (lv_mois_2_0= RULE_INT ) ) otherlv_3= '/' ( (lv_jour_4_0= RULE_INT ) ) otherlv_5= '-' ( (lv_heure_6_0= RULE_INT ) ) otherlv_7= ':' ( (lv_minute_8_0= RULE_INT ) ) otherlv_9= ':' ( (lv_seconde_10_0= RULE_INT ) ) ) )
            // InternalDslLogs.g:241:2: ( ( (lv_annee_0_0= RULE_INT ) ) otherlv_1= '/' ( (lv_mois_2_0= RULE_INT ) ) otherlv_3= '/' ( (lv_jour_4_0= RULE_INT ) ) otherlv_5= '-' ( (lv_heure_6_0= RULE_INT ) ) otherlv_7= ':' ( (lv_minute_8_0= RULE_INT ) ) otherlv_9= ':' ( (lv_seconde_10_0= RULE_INT ) ) )
            {
            // InternalDslLogs.g:241:2: ( ( (lv_annee_0_0= RULE_INT ) ) otherlv_1= '/' ( (lv_mois_2_0= RULE_INT ) ) otherlv_3= '/' ( (lv_jour_4_0= RULE_INT ) ) otherlv_5= '-' ( (lv_heure_6_0= RULE_INT ) ) otherlv_7= ':' ( (lv_minute_8_0= RULE_INT ) ) otherlv_9= ':' ( (lv_seconde_10_0= RULE_INT ) ) )
            // InternalDslLogs.g:242:3: ( (lv_annee_0_0= RULE_INT ) ) otherlv_1= '/' ( (lv_mois_2_0= RULE_INT ) ) otherlv_3= '/' ( (lv_jour_4_0= RULE_INT ) ) otherlv_5= '-' ( (lv_heure_6_0= RULE_INT ) ) otherlv_7= ':' ( (lv_minute_8_0= RULE_INT ) ) otherlv_9= ':' ( (lv_seconde_10_0= RULE_INT ) )
            {
            // InternalDslLogs.g:242:3: ( (lv_annee_0_0= RULE_INT ) )
            // InternalDslLogs.g:243:4: (lv_annee_0_0= RULE_INT )
            {
            // InternalDslLogs.g:243:4: (lv_annee_0_0= RULE_INT )
            // InternalDslLogs.g:244:5: lv_annee_0_0= RULE_INT
            {
            lv_annee_0_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_annee_0_0, grammarAccess.getDateAccess().getAnneeINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"annee",
            						lv_annee_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDateAccess().getSolidusKeyword_1());
            		
            // InternalDslLogs.g:264:3: ( (lv_mois_2_0= RULE_INT ) )
            // InternalDslLogs.g:265:4: (lv_mois_2_0= RULE_INT )
            {
            // InternalDslLogs.g:265:4: (lv_mois_2_0= RULE_INT )
            // InternalDslLogs.g:266:5: lv_mois_2_0= RULE_INT
            {
            lv_mois_2_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_mois_2_0, grammarAccess.getDateAccess().getMoisINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"mois",
            						lv_mois_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getDateAccess().getSolidusKeyword_3());
            		
            // InternalDslLogs.g:286:3: ( (lv_jour_4_0= RULE_INT ) )
            // InternalDslLogs.g:287:4: (lv_jour_4_0= RULE_INT )
            {
            // InternalDslLogs.g:287:4: (lv_jour_4_0= RULE_INT )
            // InternalDslLogs.g:288:5: lv_jour_4_0= RULE_INT
            {
            lv_jour_4_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_jour_4_0, grammarAccess.getDateAccess().getJourINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"jour",
            						lv_jour_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getDateAccess().getHyphenMinusKeyword_5());
            		
            // InternalDslLogs.g:308:3: ( (lv_heure_6_0= RULE_INT ) )
            // InternalDslLogs.g:309:4: (lv_heure_6_0= RULE_INT )
            {
            // InternalDslLogs.g:309:4: (lv_heure_6_0= RULE_INT )
            // InternalDslLogs.g:310:5: lv_heure_6_0= RULE_INT
            {
            lv_heure_6_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_heure_6_0, grammarAccess.getDateAccess().getHeureINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"heure",
            						lv_heure_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getDateAccess().getColonKeyword_7());
            		
            // InternalDslLogs.g:330:3: ( (lv_minute_8_0= RULE_INT ) )
            // InternalDslLogs.g:331:4: (lv_minute_8_0= RULE_INT )
            {
            // InternalDslLogs.g:331:4: (lv_minute_8_0= RULE_INT )
            // InternalDslLogs.g:332:5: lv_minute_8_0= RULE_INT
            {
            lv_minute_8_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_minute_8_0, grammarAccess.getDateAccess().getMinuteINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"minute",
            						lv_minute_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getDateAccess().getColonKeyword_9());
            		
            // InternalDslLogs.g:352:3: ( (lv_seconde_10_0= RULE_INT ) )
            // InternalDslLogs.g:353:4: (lv_seconde_10_0= RULE_INT )
            {
            // InternalDslLogs.g:353:4: (lv_seconde_10_0= RULE_INT )
            // InternalDslLogs.g:354:5: lv_seconde_10_0= RULE_INT
            {
            lv_seconde_10_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_seconde_10_0, grammarAccess.getDateAccess().getSecondeINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"seconde",
            						lv_seconde_10_0,
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
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleParametre"
    // InternalDslLogs.g:374:1: entryRuleParametre returns [EObject current=null] : iv_ruleParametre= ruleParametre EOF ;
    public final EObject entryRuleParametre() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametre = null;


        try {
            // InternalDslLogs.g:374:50: (iv_ruleParametre= ruleParametre EOF )
            // InternalDslLogs.g:375:2: iv_ruleParametre= ruleParametre EOF
            {
             newCompositeNode(grammarAccess.getParametreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParametre=ruleParametre();

            state._fsp--;

             current =iv_ruleParametre; 
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
    // $ANTLR end "entryRuleParametre"


    // $ANTLR start "ruleParametre"
    // InternalDslLogs.g:381:1: ruleParametre returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleParametre() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalDslLogs.g:387:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalDslLogs.g:388:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalDslLogs.g:388:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalDslLogs.g:389:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalDslLogs.g:389:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDslLogs.g:390:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDslLogs.g:390:4: (lv_name_0_0= RULE_ID )
            // InternalDslLogs.g:391:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getParametreAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParametreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getParametreAccess().getEqualsSignKeyword_1());
            		
            // InternalDslLogs.g:411:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalDslLogs.g:412:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalDslLogs.g:412:4: (lv_value_2_0= RULE_STRING )
            // InternalDslLogs.g:413:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getParametreAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParametreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleParametre"


    // $ANTLR start "entryRuleUtilisateur"
    // InternalDslLogs.g:433:1: entryRuleUtilisateur returns [EObject current=null] : iv_ruleUtilisateur= ruleUtilisateur EOF ;
    public final EObject entryRuleUtilisateur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUtilisateur = null;


        try {
            // InternalDslLogs.g:433:52: (iv_ruleUtilisateur= ruleUtilisateur EOF )
            // InternalDslLogs.g:434:2: iv_ruleUtilisateur= ruleUtilisateur EOF
            {
             newCompositeNode(grammarAccess.getUtilisateurRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUtilisateur=ruleUtilisateur();

            state._fsp--;

             current =iv_ruleUtilisateur; 
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
    // $ANTLR end "entryRuleUtilisateur"


    // $ANTLR start "ruleUtilisateur"
    // InternalDslLogs.g:440:1: ruleUtilisateur returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleUtilisateur() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDslLogs.g:446:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDslLogs.g:447:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDslLogs.g:447:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDslLogs.g:448:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDslLogs.g:448:3: (lv_name_0_0= RULE_ID )
            // InternalDslLogs.g:449:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getUtilisateurAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getUtilisateurRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleUtilisateur"


    // $ANTLR start "entryRuleAction"
    // InternalDslLogs.g:468:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalDslLogs.g:468:47: (iv_ruleAction= ruleAction EOF )
            // InternalDslLogs.g:469:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalDslLogs.g:475:1: ruleAction returns [EObject current=null] : (this_Demande_0= ruleDemande | this_Appel_1= ruleAppel ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_Demande_0 = null;

        EObject this_Appel_1 = null;



        	enterRule();

        try {
            // InternalDslLogs.g:481:2: ( (this_Demande_0= ruleDemande | this_Appel_1= ruleAppel ) )
            // InternalDslLogs.g:482:2: (this_Demande_0= ruleDemande | this_Appel_1= ruleAppel )
            {
            // InternalDslLogs.g:482:2: (this_Demande_0= ruleDemande | this_Appel_1= ruleAppel )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDslLogs.g:483:3: this_Demande_0= ruleDemande
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getDemandeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Demande_0=ruleDemande();

                    state._fsp--;


                    			current = this_Demande_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDslLogs.g:492:3: this_Appel_1= ruleAppel
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getAppelParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Appel_1=ruleAppel();

                    state._fsp--;


                    			current = this_Appel_1;
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleDemande"
    // InternalDslLogs.g:504:1: entryRuleDemande returns [EObject current=null] : iv_ruleDemande= ruleDemande EOF ;
    public final EObject entryRuleDemande() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDemande = null;


        try {
            // InternalDslLogs.g:504:48: (iv_ruleDemande= ruleDemande EOF )
            // InternalDslLogs.g:505:2: iv_ruleDemande= ruleDemande EOF
            {
             newCompositeNode(grammarAccess.getDemandeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDemande=ruleDemande();

            state._fsp--;

             current =iv_ruleDemande; 
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
    // $ANTLR end "entryRuleDemande"


    // $ANTLR start "ruleDemande"
    // InternalDslLogs.g:511:1: ruleDemande returns [EObject current=null] : (otherlv_0= 'demande' ( (lv_page_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDemande() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_page_1_0=null;


        	enterRule();

        try {
            // InternalDslLogs.g:517:2: ( (otherlv_0= 'demande' ( (lv_page_1_0= RULE_STRING ) ) ) )
            // InternalDslLogs.g:518:2: (otherlv_0= 'demande' ( (lv_page_1_0= RULE_STRING ) ) )
            {
            // InternalDslLogs.g:518:2: (otherlv_0= 'demande' ( (lv_page_1_0= RULE_STRING ) ) )
            // InternalDslLogs.g:519:3: otherlv_0= 'demande' ( (lv_page_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getDemandeAccess().getDemandeKeyword_0());
            		
            // InternalDslLogs.g:523:3: ( (lv_page_1_0= RULE_STRING ) )
            // InternalDslLogs.g:524:4: (lv_page_1_0= RULE_STRING )
            {
            // InternalDslLogs.g:524:4: (lv_page_1_0= RULE_STRING )
            // InternalDslLogs.g:525:5: lv_page_1_0= RULE_STRING
            {
            lv_page_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_page_1_0, grammarAccess.getDemandeAccess().getPageSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDemandeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"page",
            						lv_page_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleDemande"


    // $ANTLR start "entryRuleAppel"
    // InternalDslLogs.g:545:1: entryRuleAppel returns [EObject current=null] : iv_ruleAppel= ruleAppel EOF ;
    public final EObject entryRuleAppel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppel = null;


        try {
            // InternalDslLogs.g:545:46: (iv_ruleAppel= ruleAppel EOF )
            // InternalDslLogs.g:546:2: iv_ruleAppel= ruleAppel EOF
            {
             newCompositeNode(grammarAccess.getAppelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAppel=ruleAppel();

            state._fsp--;

             current =iv_ruleAppel; 
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
    // $ANTLR end "entryRuleAppel"


    // $ANTLR start "ruleAppel"
    // InternalDslLogs.g:552:1: ruleAppel returns [EObject current=null] : (otherlv_0= 'appelle' ( (lv_page_1_0= RULE_STRING ) ) (otherlv_2= 'param\\u00E8tres' ( (lv_parametres_3_0= ruleParametre ) ) (otherlv_4= 'et' ( (lv_parametres_5_0= ruleParametre ) ) )* )? ) ;
    public final EObject ruleAppel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_page_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parametres_3_0 = null;

        EObject lv_parametres_5_0 = null;



        	enterRule();

        try {
            // InternalDslLogs.g:558:2: ( (otherlv_0= 'appelle' ( (lv_page_1_0= RULE_STRING ) ) (otherlv_2= 'param\\u00E8tres' ( (lv_parametres_3_0= ruleParametre ) ) (otherlv_4= 'et' ( (lv_parametres_5_0= ruleParametre ) ) )* )? ) )
            // InternalDslLogs.g:559:2: (otherlv_0= 'appelle' ( (lv_page_1_0= RULE_STRING ) ) (otherlv_2= 'param\\u00E8tres' ( (lv_parametres_3_0= ruleParametre ) ) (otherlv_4= 'et' ( (lv_parametres_5_0= ruleParametre ) ) )* )? )
            {
            // InternalDslLogs.g:559:2: (otherlv_0= 'appelle' ( (lv_page_1_0= RULE_STRING ) ) (otherlv_2= 'param\\u00E8tres' ( (lv_parametres_3_0= ruleParametre ) ) (otherlv_4= 'et' ( (lv_parametres_5_0= ruleParametre ) ) )* )? )
            // InternalDslLogs.g:560:3: otherlv_0= 'appelle' ( (lv_page_1_0= RULE_STRING ) ) (otherlv_2= 'param\\u00E8tres' ( (lv_parametres_3_0= ruleParametre ) ) (otherlv_4= 'et' ( (lv_parametres_5_0= ruleParametre ) ) )* )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getAppelAccess().getAppelleKeyword_0());
            		
            // InternalDslLogs.g:564:3: ( (lv_page_1_0= RULE_STRING ) )
            // InternalDslLogs.g:565:4: (lv_page_1_0= RULE_STRING )
            {
            // InternalDslLogs.g:565:4: (lv_page_1_0= RULE_STRING )
            // InternalDslLogs.g:566:5: lv_page_1_0= RULE_STRING
            {
            lv_page_1_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_page_1_0, grammarAccess.getAppelAccess().getPageSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAppelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"page",
            						lv_page_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDslLogs.g:582:3: (otherlv_2= 'param\\u00E8tres' ( (lv_parametres_3_0= ruleParametre ) ) (otherlv_4= 'et' ( (lv_parametres_5_0= ruleParametre ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDslLogs.g:583:4: otherlv_2= 'param\\u00E8tres' ( (lv_parametres_3_0= ruleParametre ) ) (otherlv_4= 'et' ( (lv_parametres_5_0= ruleParametre ) ) )*
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getAppelAccess().getParamTresKeyword_2_0());
                    			
                    // InternalDslLogs.g:587:4: ( (lv_parametres_3_0= ruleParametre ) )
                    // InternalDslLogs.g:588:5: (lv_parametres_3_0= ruleParametre )
                    {
                    // InternalDslLogs.g:588:5: (lv_parametres_3_0= ruleParametre )
                    // InternalDslLogs.g:589:6: lv_parametres_3_0= ruleParametre
                    {

                    						newCompositeNode(grammarAccess.getAppelAccess().getParametresParametreParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_parametres_3_0=ruleParametre();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAppelRule());
                    						}
                    						add(
                    							current,
                    							"parametres",
                    							lv_parametres_3_0,
                    							"fr.paris10.miage.DslLogs.Parametre");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDslLogs.g:606:4: (otherlv_4= 'et' ( (lv_parametres_5_0= ruleParametre ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==21) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalDslLogs.g:607:5: otherlv_4= 'et' ( (lv_parametres_5_0= ruleParametre ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getAppelAccess().getEtKeyword_2_2_0());
                    	    				
                    	    // InternalDslLogs.g:611:5: ( (lv_parametres_5_0= ruleParametre ) )
                    	    // InternalDslLogs.g:612:6: (lv_parametres_5_0= ruleParametre )
                    	    {
                    	    // InternalDslLogs.g:612:6: (lv_parametres_5_0= ruleParametre )
                    	    // InternalDslLogs.g:613:7: lv_parametres_5_0= ruleParametre
                    	    {

                    	    							newCompositeNode(grammarAccess.getAppelAccess().getParametresParametreParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_parametres_5_0=ruleParametre();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAppelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parametres",
                    	    								lv_parametres_5_0,
                    	    								"fr.paris10.miage.DslLogs.Parametre");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


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
    // $ANTLR end "ruleAppel"


    // $ANTLR start "ruleReponse"
    // InternalDslLogs.g:636:1: ruleReponse returns [Enumerator current=null] : ( (enumLiteral_0= 'OK' ) | (enumLiteral_1= 'KO' ) ) ;
    public final Enumerator ruleReponse() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDslLogs.g:642:2: ( ( (enumLiteral_0= 'OK' ) | (enumLiteral_1= 'KO' ) ) )
            // InternalDslLogs.g:643:2: ( (enumLiteral_0= 'OK' ) | (enumLiteral_1= 'KO' ) )
            {
            // InternalDslLogs.g:643:2: ( (enumLiteral_0= 'OK' ) | (enumLiteral_1= 'KO' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            else if ( (LA6_0==23) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDslLogs.g:644:3: (enumLiteral_0= 'OK' )
                    {
                    // InternalDslLogs.g:644:3: (enumLiteral_0= 'OK' )
                    // InternalDslLogs.g:645:4: enumLiteral_0= 'OK'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getReponseAccess().getOKEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getReponseAccess().getOKEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDslLogs.g:652:3: (enumLiteral_1= 'KO' )
                    {
                    // InternalDslLogs.g:652:3: (enumLiteral_1= 'KO' )
                    // InternalDslLogs.g:653:4: enumLiteral_1= 'KO'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getReponseAccess().getERROREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getReponseAccess().getERROREnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleReponse"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200002L});

}