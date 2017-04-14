package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'devices:'", "':'", "'location:'", "';'", "'platform:'", "'resources:'", "'protocol:'", "'database:'", "'JavaSE'", "'Android'", "'NodeJS'", "'MySQL'", "'SQLAzure'", "'MongoDB'", "'mqtt'", "','", "'structs:'", "'userInteractions:'", "'notify'", "'('", "')'", "'from'", "'computationalService:'", "'Common:'", "'Custom:'", "'request'", "'to'", "'consume'", "'COMPUTE'", "'command'", "'sensors:'", "'periodicSensors:'", "'eventDrivenSensors:'", "'requestBasedSensors:'", "'tags:'", "'actuators:'", "'storages:'", "'sample'", "'period'", "'for'", "'onCondition'", "'>'", "'<'", "'='", "'generate'", "'action'", "'accessed-by'", "'PPM'", "'miliseconds'", "'seconds'", "'minutes'", "'ppm'", "'AVG_BY_SAMPLE'", "'Integer'", "'boolean'", "'String'", "'long'", "'double'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_vocSpec_0_0= ruleVocSpec ) ) | ( (lv_interactionSpec_1_0= ruleInteractionSpec ) ) | ( (lv_archSpec_2_0= ruleArchSpec ) ) | ( (lv_networkSpec_3_0= ruleDeploymentSpec ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_vocSpec_0_0 = null;

        EObject lv_interactionSpec_1_0 = null;

        EObject lv_archSpec_2_0 = null;

        EObject lv_networkSpec_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( (lv_vocSpec_0_0= ruleVocSpec ) ) | ( (lv_interactionSpec_1_0= ruleInteractionSpec ) ) | ( (lv_archSpec_2_0= ruleArchSpec ) ) | ( (lv_networkSpec_3_0= ruleDeploymentSpec ) ) ) )
            // InternalMyDsl.g:78:2: ( ( (lv_vocSpec_0_0= ruleVocSpec ) ) | ( (lv_interactionSpec_1_0= ruleInteractionSpec ) ) | ( (lv_archSpec_2_0= ruleArchSpec ) ) | ( (lv_networkSpec_3_0= ruleDeploymentSpec ) ) )
            {
            // InternalMyDsl.g:78:2: ( ( (lv_vocSpec_0_0= ruleVocSpec ) ) | ( (lv_interactionSpec_1_0= ruleInteractionSpec ) ) | ( (lv_archSpec_2_0= ruleArchSpec ) ) | ( (lv_networkSpec_3_0= ruleDeploymentSpec ) ) )
            int alt1=4;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:79:3: ( (lv_vocSpec_0_0= ruleVocSpec ) )
                    {
                    // InternalMyDsl.g:79:3: ( (lv_vocSpec_0_0= ruleVocSpec ) )
                    // InternalMyDsl.g:80:4: (lv_vocSpec_0_0= ruleVocSpec )
                    {
                    // InternalMyDsl.g:80:4: (lv_vocSpec_0_0= ruleVocSpec )
                    // InternalMyDsl.g:81:5: lv_vocSpec_0_0= ruleVocSpec
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getVocSpecVocSpecParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_vocSpec_0_0=ruleVocSpec();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"vocSpec",
                    						lv_vocSpec_0_0,
                    						"org.xtext.example.mydsl.MyDsl.VocSpec");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:99:3: ( (lv_interactionSpec_1_0= ruleInteractionSpec ) )
                    {
                    // InternalMyDsl.g:99:3: ( (lv_interactionSpec_1_0= ruleInteractionSpec ) )
                    // InternalMyDsl.g:100:4: (lv_interactionSpec_1_0= ruleInteractionSpec )
                    {
                    // InternalMyDsl.g:100:4: (lv_interactionSpec_1_0= ruleInteractionSpec )
                    // InternalMyDsl.g:101:5: lv_interactionSpec_1_0= ruleInteractionSpec
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getInteractionSpecInteractionSpecParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_interactionSpec_1_0=ruleInteractionSpec();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"interactionSpec",
                    						lv_interactionSpec_1_0,
                    						"org.xtext.example.mydsl.MyDsl.InteractionSpec");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:119:3: ( (lv_archSpec_2_0= ruleArchSpec ) )
                    {
                    // InternalMyDsl.g:119:3: ( (lv_archSpec_2_0= ruleArchSpec ) )
                    // InternalMyDsl.g:120:4: (lv_archSpec_2_0= ruleArchSpec )
                    {
                    // InternalMyDsl.g:120:4: (lv_archSpec_2_0= ruleArchSpec )
                    // InternalMyDsl.g:121:5: lv_archSpec_2_0= ruleArchSpec
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getArchSpecArchSpecParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_archSpec_2_0=ruleArchSpec();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"archSpec",
                    						lv_archSpec_2_0,
                    						"org.xtext.example.mydsl.MyDsl.ArchSpec");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:139:3: ( (lv_networkSpec_3_0= ruleDeploymentSpec ) )
                    {
                    // InternalMyDsl.g:139:3: ( (lv_networkSpec_3_0= ruleDeploymentSpec ) )
                    // InternalMyDsl.g:140:4: (lv_networkSpec_3_0= ruleDeploymentSpec )
                    {
                    // InternalMyDsl.g:140:4: (lv_networkSpec_3_0= ruleDeploymentSpec )
                    // InternalMyDsl.g:141:5: lv_networkSpec_3_0= ruleDeploymentSpec
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getNetworkSpecDeploymentSpecParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_networkSpec_3_0=ruleDeploymentSpec();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"networkSpec",
                    						lv_networkSpec_3_0,
                    						"org.xtext.example.mydsl.MyDsl.DeploymentSpec");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDeploymentSpec"
    // InternalMyDsl.g:162:1: entryRuleDeploymentSpec returns [EObject current=null] : iv_ruleDeploymentSpec= ruleDeploymentSpec EOF ;
    public final EObject entryRuleDeploymentSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeploymentSpec = null;


        try {
            // InternalMyDsl.g:162:55: (iv_ruleDeploymentSpec= ruleDeploymentSpec EOF )
            // InternalMyDsl.g:163:2: iv_ruleDeploymentSpec= ruleDeploymentSpec EOF
            {
             newCompositeNode(grammarAccess.getDeploymentSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeploymentSpec=ruleDeploymentSpec();

            state._fsp--;

             current =iv_ruleDeploymentSpec; 
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
    // $ANTLR end "entryRuleDeploymentSpec"


    // $ANTLR start "ruleDeploymentSpec"
    // InternalMyDsl.g:169:1: ruleDeploymentSpec returns [EObject current=null] : (otherlv_0= 'devices:' ( (lv_devices_1_0= ruleDevice ) )* ) ;
    public final EObject ruleDeploymentSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_devices_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:175:2: ( (otherlv_0= 'devices:' ( (lv_devices_1_0= ruleDevice ) )* ) )
            // InternalMyDsl.g:176:2: (otherlv_0= 'devices:' ( (lv_devices_1_0= ruleDevice ) )* )
            {
            // InternalMyDsl.g:176:2: (otherlv_0= 'devices:' ( (lv_devices_1_0= ruleDevice ) )* )
            // InternalMyDsl.g:177:3: otherlv_0= 'devices:' ( (lv_devices_1_0= ruleDevice ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDeploymentSpecAccess().getDevicesKeyword_0());
            		
            // InternalMyDsl.g:181:3: ( (lv_devices_1_0= ruleDevice ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:182:4: (lv_devices_1_0= ruleDevice )
            	    {
            	    // InternalMyDsl.g:182:4: (lv_devices_1_0= ruleDevice )
            	    // InternalMyDsl.g:183:5: lv_devices_1_0= ruleDevice
            	    {

            	    					newCompositeNode(grammarAccess.getDeploymentSpecAccess().getDevicesDeviceParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_devices_1_0=ruleDevice();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDeploymentSpecRule());
            	    					}
            	    					add(
            	    						current,
            	    						"devices",
            	    						lv_devices_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.Device");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleDeploymentSpec"


    // $ANTLR start "entryRuleDevice"
    // InternalMyDsl.g:204:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // InternalMyDsl.g:204:47: (iv_ruleDevice= ruleDevice EOF )
            // InternalMyDsl.g:205:2: iv_ruleDevice= ruleDevice EOF
            {
             newCompositeNode(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDevice=ruleDevice();

            state._fsp--;

             current =iv_ruleDevice; 
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
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // InternalMyDsl.g:211:1: ruleDevice returns [EObject current=null] : ( ( (lv_deviceName_0_0= ruleDeviceEntityName ) ) otherlv_1= ':' otherlv_2= 'location:' ( (lv_deviceLocation_3_0= ruleDeviceLocation ) ) otherlv_4= ';' otherlv_5= 'platform:' ( (lv_platformType_6_0= rulePlatformType ) ) otherlv_7= ';' otherlv_8= 'resources:' ( (lv_deviceAbilities_9_0= ruleDeviceAbilities ) )? otherlv_10= ';' otherlv_11= 'protocol:' ( (lv_deviceProtocol_12_0= ruleDeviceProtocol ) ) otherlv_13= ';' (otherlv_14= 'database:' ( (lv_databaseName_15_0= ruleDatabaseName ) ) otherlv_16= ';' )* ) ;
    public final EObject ruleDevice() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_deviceName_0_0 = null;

        EObject lv_deviceLocation_3_0 = null;

        EObject lv_platformType_6_0 = null;

        EObject lv_deviceAbilities_9_0 = null;

        EObject lv_deviceProtocol_12_0 = null;

        EObject lv_databaseName_15_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:217:2: ( ( ( (lv_deviceName_0_0= ruleDeviceEntityName ) ) otherlv_1= ':' otherlv_2= 'location:' ( (lv_deviceLocation_3_0= ruleDeviceLocation ) ) otherlv_4= ';' otherlv_5= 'platform:' ( (lv_platformType_6_0= rulePlatformType ) ) otherlv_7= ';' otherlv_8= 'resources:' ( (lv_deviceAbilities_9_0= ruleDeviceAbilities ) )? otherlv_10= ';' otherlv_11= 'protocol:' ( (lv_deviceProtocol_12_0= ruleDeviceProtocol ) ) otherlv_13= ';' (otherlv_14= 'database:' ( (lv_databaseName_15_0= ruleDatabaseName ) ) otherlv_16= ';' )* ) )
            // InternalMyDsl.g:218:2: ( ( (lv_deviceName_0_0= ruleDeviceEntityName ) ) otherlv_1= ':' otherlv_2= 'location:' ( (lv_deviceLocation_3_0= ruleDeviceLocation ) ) otherlv_4= ';' otherlv_5= 'platform:' ( (lv_platformType_6_0= rulePlatformType ) ) otherlv_7= ';' otherlv_8= 'resources:' ( (lv_deviceAbilities_9_0= ruleDeviceAbilities ) )? otherlv_10= ';' otherlv_11= 'protocol:' ( (lv_deviceProtocol_12_0= ruleDeviceProtocol ) ) otherlv_13= ';' (otherlv_14= 'database:' ( (lv_databaseName_15_0= ruleDatabaseName ) ) otherlv_16= ';' )* )
            {
            // InternalMyDsl.g:218:2: ( ( (lv_deviceName_0_0= ruleDeviceEntityName ) ) otherlv_1= ':' otherlv_2= 'location:' ( (lv_deviceLocation_3_0= ruleDeviceLocation ) ) otherlv_4= ';' otherlv_5= 'platform:' ( (lv_platformType_6_0= rulePlatformType ) ) otherlv_7= ';' otherlv_8= 'resources:' ( (lv_deviceAbilities_9_0= ruleDeviceAbilities ) )? otherlv_10= ';' otherlv_11= 'protocol:' ( (lv_deviceProtocol_12_0= ruleDeviceProtocol ) ) otherlv_13= ';' (otherlv_14= 'database:' ( (lv_databaseName_15_0= ruleDatabaseName ) ) otherlv_16= ';' )* )
            // InternalMyDsl.g:219:3: ( (lv_deviceName_0_0= ruleDeviceEntityName ) ) otherlv_1= ':' otherlv_2= 'location:' ( (lv_deviceLocation_3_0= ruleDeviceLocation ) ) otherlv_4= ';' otherlv_5= 'platform:' ( (lv_platformType_6_0= rulePlatformType ) ) otherlv_7= ';' otherlv_8= 'resources:' ( (lv_deviceAbilities_9_0= ruleDeviceAbilities ) )? otherlv_10= ';' otherlv_11= 'protocol:' ( (lv_deviceProtocol_12_0= ruleDeviceProtocol ) ) otherlv_13= ';' (otherlv_14= 'database:' ( (lv_databaseName_15_0= ruleDatabaseName ) ) otherlv_16= ';' )*
            {
            // InternalMyDsl.g:219:3: ( (lv_deviceName_0_0= ruleDeviceEntityName ) )
            // InternalMyDsl.g:220:4: (lv_deviceName_0_0= ruleDeviceEntityName )
            {
            // InternalMyDsl.g:220:4: (lv_deviceName_0_0= ruleDeviceEntityName )
            // InternalMyDsl.g:221:5: lv_deviceName_0_0= ruleDeviceEntityName
            {

            					newCompositeNode(grammarAccess.getDeviceAccess().getDeviceNameDeviceEntityNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_deviceName_0_0=ruleDeviceEntityName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeviceRule());
            					}
            					set(
            						current,
            						"deviceName",
            						lv_deviceName_0_0,
            						"org.xtext.example.mydsl.MyDsl.DeviceEntityName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getDeviceAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDeviceAccess().getLocationKeyword_2());
            		
            // InternalMyDsl.g:246:3: ( (lv_deviceLocation_3_0= ruleDeviceLocation ) )
            // InternalMyDsl.g:247:4: (lv_deviceLocation_3_0= ruleDeviceLocation )
            {
            // InternalMyDsl.g:247:4: (lv_deviceLocation_3_0= ruleDeviceLocation )
            // InternalMyDsl.g:248:5: lv_deviceLocation_3_0= ruleDeviceLocation
            {

            					newCompositeNode(grammarAccess.getDeviceAccess().getDeviceLocationDeviceLocationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_deviceLocation_3_0=ruleDeviceLocation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeviceRule());
            					}
            					add(
            						current,
            						"deviceLocation",
            						lv_deviceLocation_3_0,
            						"org.xtext.example.mydsl.MyDsl.DeviceLocation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getDeviceAccess().getSemicolonKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getDeviceAccess().getPlatformKeyword_5());
            		
            // InternalMyDsl.g:273:3: ( (lv_platformType_6_0= rulePlatformType ) )
            // InternalMyDsl.g:274:4: (lv_platformType_6_0= rulePlatformType )
            {
            // InternalMyDsl.g:274:4: (lv_platformType_6_0= rulePlatformType )
            // InternalMyDsl.g:275:5: lv_platformType_6_0= rulePlatformType
            {

            					newCompositeNode(grammarAccess.getDeviceAccess().getPlatformTypePlatformTypeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_platformType_6_0=rulePlatformType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeviceRule());
            					}
            					add(
            						current,
            						"platformType",
            						lv_platformType_6_0,
            						"org.xtext.example.mydsl.MyDsl.PlatformType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getDeviceAccess().getSemicolonKeyword_7());
            		
            otherlv_8=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getDeviceAccess().getResourcesKeyword_8());
            		
            // InternalMyDsl.g:300:3: ( (lv_deviceAbilities_9_0= ruleDeviceAbilities ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:301:4: (lv_deviceAbilities_9_0= ruleDeviceAbilities )
                    {
                    // InternalMyDsl.g:301:4: (lv_deviceAbilities_9_0= ruleDeviceAbilities )
                    // InternalMyDsl.g:302:5: lv_deviceAbilities_9_0= ruleDeviceAbilities
                    {

                    					newCompositeNode(grammarAccess.getDeviceAccess().getDeviceAbilitiesDeviceAbilitiesParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_deviceAbilities_9_0=ruleDeviceAbilities();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeviceRule());
                    					}
                    					add(
                    						current,
                    						"deviceAbilities",
                    						lv_deviceAbilities_9_0,
                    						"org.xtext.example.mydsl.MyDsl.DeviceAbilities");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_10, grammarAccess.getDeviceAccess().getSemicolonKeyword_10());
            		
            otherlv_11=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_11, grammarAccess.getDeviceAccess().getProtocolKeyword_11());
            		
            // InternalMyDsl.g:327:3: ( (lv_deviceProtocol_12_0= ruleDeviceProtocol ) )
            // InternalMyDsl.g:328:4: (lv_deviceProtocol_12_0= ruleDeviceProtocol )
            {
            // InternalMyDsl.g:328:4: (lv_deviceProtocol_12_0= ruleDeviceProtocol )
            // InternalMyDsl.g:329:5: lv_deviceProtocol_12_0= ruleDeviceProtocol
            {

            					newCompositeNode(grammarAccess.getDeviceAccess().getDeviceProtocolDeviceProtocolParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_7);
            lv_deviceProtocol_12_0=ruleDeviceProtocol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeviceRule());
            					}
            					add(
            						current,
            						"deviceProtocol",
            						lv_deviceProtocol_12_0,
            						"org.xtext.example.mydsl.MyDsl.DeviceProtocol");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,14,FOLLOW_14); 

            			newLeafNode(otherlv_13, grammarAccess.getDeviceAccess().getSemicolonKeyword_13());
            		
            // InternalMyDsl.g:350:3: (otherlv_14= 'database:' ( (lv_databaseName_15_0= ruleDatabaseName ) ) otherlv_16= ';' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:351:4: otherlv_14= 'database:' ( (lv_databaseName_15_0= ruleDatabaseName ) ) otherlv_16= ';'
            	    {
            	    otherlv_14=(Token)match(input,18,FOLLOW_15); 

            	    				newLeafNode(otherlv_14, grammarAccess.getDeviceAccess().getDatabaseKeyword_14_0());
            	    			
            	    // InternalMyDsl.g:355:4: ( (lv_databaseName_15_0= ruleDatabaseName ) )
            	    // InternalMyDsl.g:356:5: (lv_databaseName_15_0= ruleDatabaseName )
            	    {
            	    // InternalMyDsl.g:356:5: (lv_databaseName_15_0= ruleDatabaseName )
            	    // InternalMyDsl.g:357:6: lv_databaseName_15_0= ruleDatabaseName
            	    {

            	    						newCompositeNode(grammarAccess.getDeviceAccess().getDatabaseNameDatabaseNameParserRuleCall_14_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_databaseName_15_0=ruleDatabaseName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDeviceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"databaseName",
            	    							lv_databaseName_15_0,
            	    							"org.xtext.example.mydsl.MyDsl.DatabaseName");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_16=(Token)match(input,14,FOLLOW_14); 

            	    				newLeafNode(otherlv_16, grammarAccess.getDeviceAccess().getSemicolonKeyword_14_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleDeviceLocation"
    // InternalMyDsl.g:383:1: entryRuleDeviceLocation returns [EObject current=null] : iv_ruleDeviceLocation= ruleDeviceLocation EOF ;
    public final EObject entryRuleDeviceLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceLocation = null;


        try {
            // InternalMyDsl.g:383:55: (iv_ruleDeviceLocation= ruleDeviceLocation EOF )
            // InternalMyDsl.g:384:2: iv_ruleDeviceLocation= ruleDeviceLocation EOF
            {
             newCompositeNode(grammarAccess.getDeviceLocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeviceLocation=ruleDeviceLocation();

            state._fsp--;

             current =iv_ruleDeviceLocation; 
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
    // $ANTLR end "entryRuleDeviceLocation"


    // $ANTLR start "ruleDeviceLocation"
    // InternalMyDsl.g:390:1: ruleDeviceLocation returns [EObject current=null] : ( ( (lv_regionLabel_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_regionValue_2_0= RULE_INT ) ) ) ;
    public final EObject ruleDeviceLocation() throws RecognitionException {
        EObject current = null;

        Token lv_regionLabel_0_0=null;
        Token otherlv_1=null;
        Token lv_regionValue_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:396:2: ( ( ( (lv_regionLabel_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_regionValue_2_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:397:2: ( ( (lv_regionLabel_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_regionValue_2_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:397:2: ( ( (lv_regionLabel_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_regionValue_2_0= RULE_INT ) ) )
            // InternalMyDsl.g:398:3: ( (lv_regionLabel_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_regionValue_2_0= RULE_INT ) )
            {
            // InternalMyDsl.g:398:3: ( (lv_regionLabel_0_0= RULE_ID ) )
            // InternalMyDsl.g:399:4: (lv_regionLabel_0_0= RULE_ID )
            {
            // InternalMyDsl.g:399:4: (lv_regionLabel_0_0= RULE_ID )
            // InternalMyDsl.g:400:5: lv_regionLabel_0_0= RULE_ID
            {
            lv_regionLabel_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_regionLabel_0_0, grammarAccess.getDeviceLocationAccess().getRegionLabelIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeviceLocationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"regionLabel",
            						lv_regionLabel_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getDeviceLocationAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:420:3: ( (lv_regionValue_2_0= RULE_INT ) )
            // InternalMyDsl.g:421:4: (lv_regionValue_2_0= RULE_INT )
            {
            // InternalMyDsl.g:421:4: (lv_regionValue_2_0= RULE_INT )
            // InternalMyDsl.g:422:5: lv_regionValue_2_0= RULE_INT
            {
            lv_regionValue_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_regionValue_2_0, grammarAccess.getDeviceLocationAccess().getRegionValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeviceLocationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"regionValue",
            						lv_regionValue_2_0,
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
    // $ANTLR end "ruleDeviceLocation"


    // $ANTLR start "entryRulePlatformType"
    // InternalMyDsl.g:442:1: entryRulePlatformType returns [EObject current=null] : iv_rulePlatformType= rulePlatformType EOF ;
    public final EObject entryRulePlatformType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformType = null;


        try {
            // InternalMyDsl.g:442:53: (iv_rulePlatformType= rulePlatformType EOF )
            // InternalMyDsl.g:443:2: iv_rulePlatformType= rulePlatformType EOF
            {
             newCompositeNode(grammarAccess.getPlatformTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformType=rulePlatformType();

            state._fsp--;

             current =iv_rulePlatformType; 
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
    // $ANTLR end "entryRulePlatformType"


    // $ANTLR start "rulePlatformType"
    // InternalMyDsl.g:449:1: rulePlatformType returns [EObject current=null] : ( ( (lv_deviceType_0_0= 'JavaSE' ) ) | ( (lv_deviceType_1_0= 'Android' ) ) | ( (lv_deviceType_2_0= 'NodeJS' ) ) ) ;
    public final EObject rulePlatformType() throws RecognitionException {
        EObject current = null;

        Token lv_deviceType_0_0=null;
        Token lv_deviceType_1_0=null;
        Token lv_deviceType_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:455:2: ( ( ( (lv_deviceType_0_0= 'JavaSE' ) ) | ( (lv_deviceType_1_0= 'Android' ) ) | ( (lv_deviceType_2_0= 'NodeJS' ) ) ) )
            // InternalMyDsl.g:456:2: ( ( (lv_deviceType_0_0= 'JavaSE' ) ) | ( (lv_deviceType_1_0= 'Android' ) ) | ( (lv_deviceType_2_0= 'NodeJS' ) ) )
            {
            // InternalMyDsl.g:456:2: ( ( (lv_deviceType_0_0= 'JavaSE' ) ) | ( (lv_deviceType_1_0= 'Android' ) ) | ( (lv_deviceType_2_0= 'NodeJS' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 21:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:457:3: ( (lv_deviceType_0_0= 'JavaSE' ) )
                    {
                    // InternalMyDsl.g:457:3: ( (lv_deviceType_0_0= 'JavaSE' ) )
                    // InternalMyDsl.g:458:4: (lv_deviceType_0_0= 'JavaSE' )
                    {
                    // InternalMyDsl.g:458:4: (lv_deviceType_0_0= 'JavaSE' )
                    // InternalMyDsl.g:459:5: lv_deviceType_0_0= 'JavaSE'
                    {
                    lv_deviceType_0_0=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(lv_deviceType_0_0, grammarAccess.getPlatformTypeAccess().getDeviceTypeJavaSEKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformTypeRule());
                    					}
                    					setWithLastConsumed(current, "deviceType", lv_deviceType_0_0, "JavaSE");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:472:3: ( (lv_deviceType_1_0= 'Android' ) )
                    {
                    // InternalMyDsl.g:472:3: ( (lv_deviceType_1_0= 'Android' ) )
                    // InternalMyDsl.g:473:4: (lv_deviceType_1_0= 'Android' )
                    {
                    // InternalMyDsl.g:473:4: (lv_deviceType_1_0= 'Android' )
                    // InternalMyDsl.g:474:5: lv_deviceType_1_0= 'Android'
                    {
                    lv_deviceType_1_0=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_deviceType_1_0, grammarAccess.getPlatformTypeAccess().getDeviceTypeAndroidKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformTypeRule());
                    					}
                    					setWithLastConsumed(current, "deviceType", lv_deviceType_1_0, "Android");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:487:3: ( (lv_deviceType_2_0= 'NodeJS' ) )
                    {
                    // InternalMyDsl.g:487:3: ( (lv_deviceType_2_0= 'NodeJS' ) )
                    // InternalMyDsl.g:488:4: (lv_deviceType_2_0= 'NodeJS' )
                    {
                    // InternalMyDsl.g:488:4: (lv_deviceType_2_0= 'NodeJS' )
                    // InternalMyDsl.g:489:5: lv_deviceType_2_0= 'NodeJS'
                    {
                    lv_deviceType_2_0=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_deviceType_2_0, grammarAccess.getPlatformTypeAccess().getDeviceTypeNodeJSKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformTypeRule());
                    					}
                    					setWithLastConsumed(current, "deviceType", lv_deviceType_2_0, "NodeJS");
                    				

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
    // $ANTLR end "rulePlatformType"


    // $ANTLR start "entryRuleDatabaseName"
    // InternalMyDsl.g:505:1: entryRuleDatabaseName returns [EObject current=null] : iv_ruleDatabaseName= ruleDatabaseName EOF ;
    public final EObject entryRuleDatabaseName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabaseName = null;


        try {
            // InternalMyDsl.g:505:53: (iv_ruleDatabaseName= ruleDatabaseName EOF )
            // InternalMyDsl.g:506:2: iv_ruleDatabaseName= ruleDatabaseName EOF
            {
             newCompositeNode(grammarAccess.getDatabaseNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatabaseName=ruleDatabaseName();

            state._fsp--;

             current =iv_ruleDatabaseName; 
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
    // $ANTLR end "entryRuleDatabaseName"


    // $ANTLR start "ruleDatabaseName"
    // InternalMyDsl.g:512:1: ruleDatabaseName returns [EObject current=null] : ( ( (lv_installedDatabase_0_0= 'MySQL' ) ) | ( (lv_installedDatabase_1_0= 'SQLAzure' ) ) | ( (lv_installedDatabase_2_0= 'MongoDB' ) ) ) ;
    public final EObject ruleDatabaseName() throws RecognitionException {
        EObject current = null;

        Token lv_installedDatabase_0_0=null;
        Token lv_installedDatabase_1_0=null;
        Token lv_installedDatabase_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:518:2: ( ( ( (lv_installedDatabase_0_0= 'MySQL' ) ) | ( (lv_installedDatabase_1_0= 'SQLAzure' ) ) | ( (lv_installedDatabase_2_0= 'MongoDB' ) ) ) )
            // InternalMyDsl.g:519:2: ( ( (lv_installedDatabase_0_0= 'MySQL' ) ) | ( (lv_installedDatabase_1_0= 'SQLAzure' ) ) | ( (lv_installedDatabase_2_0= 'MongoDB' ) ) )
            {
            // InternalMyDsl.g:519:2: ( ( (lv_installedDatabase_0_0= 'MySQL' ) ) | ( (lv_installedDatabase_1_0= 'SQLAzure' ) ) | ( (lv_installedDatabase_2_0= 'MongoDB' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt6=1;
                }
                break;
            case 23:
                {
                alt6=2;
                }
                break;
            case 24:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:520:3: ( (lv_installedDatabase_0_0= 'MySQL' ) )
                    {
                    // InternalMyDsl.g:520:3: ( (lv_installedDatabase_0_0= 'MySQL' ) )
                    // InternalMyDsl.g:521:4: (lv_installedDatabase_0_0= 'MySQL' )
                    {
                    // InternalMyDsl.g:521:4: (lv_installedDatabase_0_0= 'MySQL' )
                    // InternalMyDsl.g:522:5: lv_installedDatabase_0_0= 'MySQL'
                    {
                    lv_installedDatabase_0_0=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_installedDatabase_0_0, grammarAccess.getDatabaseNameAccess().getInstalledDatabaseMySQLKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDatabaseNameRule());
                    					}
                    					setWithLastConsumed(current, "installedDatabase", lv_installedDatabase_0_0, "MySQL");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:535:3: ( (lv_installedDatabase_1_0= 'SQLAzure' ) )
                    {
                    // InternalMyDsl.g:535:3: ( (lv_installedDatabase_1_0= 'SQLAzure' ) )
                    // InternalMyDsl.g:536:4: (lv_installedDatabase_1_0= 'SQLAzure' )
                    {
                    // InternalMyDsl.g:536:4: (lv_installedDatabase_1_0= 'SQLAzure' )
                    // InternalMyDsl.g:537:5: lv_installedDatabase_1_0= 'SQLAzure'
                    {
                    lv_installedDatabase_1_0=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_installedDatabase_1_0, grammarAccess.getDatabaseNameAccess().getInstalledDatabaseSQLAzureKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDatabaseNameRule());
                    					}
                    					setWithLastConsumed(current, "installedDatabase", lv_installedDatabase_1_0, "SQLAzure");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:550:3: ( (lv_installedDatabase_2_0= 'MongoDB' ) )
                    {
                    // InternalMyDsl.g:550:3: ( (lv_installedDatabase_2_0= 'MongoDB' ) )
                    // InternalMyDsl.g:551:4: (lv_installedDatabase_2_0= 'MongoDB' )
                    {
                    // InternalMyDsl.g:551:4: (lv_installedDatabase_2_0= 'MongoDB' )
                    // InternalMyDsl.g:552:5: lv_installedDatabase_2_0= 'MongoDB'
                    {
                    lv_installedDatabase_2_0=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_installedDatabase_2_0, grammarAccess.getDatabaseNameAccess().getInstalledDatabaseMongoDBKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDatabaseNameRule());
                    					}
                    					setWithLastConsumed(current, "installedDatabase", lv_installedDatabase_2_0, "MongoDB");
                    				

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
    // $ANTLR end "ruleDatabaseName"


    // $ANTLR start "entryRuleDeviceProtocol"
    // InternalMyDsl.g:568:1: entryRuleDeviceProtocol returns [EObject current=null] : iv_ruleDeviceProtocol= ruleDeviceProtocol EOF ;
    public final EObject entryRuleDeviceProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceProtocol = null;


        try {
            // InternalMyDsl.g:568:55: (iv_ruleDeviceProtocol= ruleDeviceProtocol EOF )
            // InternalMyDsl.g:569:2: iv_ruleDeviceProtocol= ruleDeviceProtocol EOF
            {
             newCompositeNode(grammarAccess.getDeviceProtocolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeviceProtocol=ruleDeviceProtocol();

            state._fsp--;

             current =iv_ruleDeviceProtocol; 
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
    // $ANTLR end "entryRuleDeviceProtocol"


    // $ANTLR start "ruleDeviceProtocol"
    // InternalMyDsl.g:575:1: ruleDeviceProtocol returns [EObject current=null] : ( (lv_protocolName_0_0= 'mqtt' ) ) ;
    public final EObject ruleDeviceProtocol() throws RecognitionException {
        EObject current = null;

        Token lv_protocolName_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:581:2: ( ( (lv_protocolName_0_0= 'mqtt' ) ) )
            // InternalMyDsl.g:582:2: ( (lv_protocolName_0_0= 'mqtt' ) )
            {
            // InternalMyDsl.g:582:2: ( (lv_protocolName_0_0= 'mqtt' ) )
            // InternalMyDsl.g:583:3: (lv_protocolName_0_0= 'mqtt' )
            {
            // InternalMyDsl.g:583:3: (lv_protocolName_0_0= 'mqtt' )
            // InternalMyDsl.g:584:4: lv_protocolName_0_0= 'mqtt'
            {
            lv_protocolName_0_0=(Token)match(input,25,FOLLOW_2); 

            				newLeafNode(lv_protocolName_0_0, grammarAccess.getDeviceProtocolAccess().getProtocolNameMqttKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDeviceProtocolRule());
            				}
            				setWithLastConsumed(current, "protocolName", lv_protocolName_0_0, "mqtt");
            			

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
    // $ANTLR end "ruleDeviceProtocol"


    // $ANTLR start "entryRuleDeviceAbilities"
    // InternalMyDsl.g:599:1: entryRuleDeviceAbilities returns [EObject current=null] : iv_ruleDeviceAbilities= ruleDeviceAbilities EOF ;
    public final EObject entryRuleDeviceAbilities() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceAbilities = null;


        try {
            // InternalMyDsl.g:599:56: (iv_ruleDeviceAbilities= ruleDeviceAbilities EOF )
            // InternalMyDsl.g:600:2: iv_ruleDeviceAbilities= ruleDeviceAbilities EOF
            {
             newCompositeNode(grammarAccess.getDeviceAbilitiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeviceAbilities=ruleDeviceAbilities();

            state._fsp--;

             current =iv_ruleDeviceAbilities; 
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
    // $ANTLR end "entryRuleDeviceAbilities"


    // $ANTLR start "ruleDeviceAbilities"
    // InternalMyDsl.g:606:1: ruleDeviceAbilities returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_name_2_0= ruleDeviceAbilities ) ) )? ) ;
    public final EObject ruleDeviceAbilities() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:612:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_name_2_0= ruleDeviceAbilities ) ) )? ) )
            // InternalMyDsl.g:613:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_name_2_0= ruleDeviceAbilities ) ) )? )
            {
            // InternalMyDsl.g:613:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_name_2_0= ruleDeviceAbilities ) ) )? )
            // InternalMyDsl.g:614:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_name_2_0= ruleDeviceAbilities ) ) )?
            {
            // InternalMyDsl.g:614:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:615:4: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:615:4: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:616:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeviceAbilitiesRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_0, grammarAccess.getDeviceAbilitiesAccess().getDeviceEntityNameEntityNameCrossReference_0_0());
            				

            }


            }

            // InternalMyDsl.g:627:3: (otherlv_1= ',' ( (lv_name_2_0= ruleDeviceAbilities ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:628:4: otherlv_1= ',' ( (lv_name_2_0= ruleDeviceAbilities ) )
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getDeviceAbilitiesAccess().getCommaKeyword_1_0());
                    			
                    // InternalMyDsl.g:632:4: ( (lv_name_2_0= ruleDeviceAbilities ) )
                    // InternalMyDsl.g:633:5: (lv_name_2_0= ruleDeviceAbilities )
                    {
                    // InternalMyDsl.g:633:5: (lv_name_2_0= ruleDeviceAbilities )
                    // InternalMyDsl.g:634:6: lv_name_2_0= ruleDeviceAbilities
                    {

                    						newCompositeNode(grammarAccess.getDeviceAbilitiesAccess().getNameDeviceAbilitiesParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_name_2_0=ruleDeviceAbilities();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeviceAbilitiesRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"org.xtext.example.mydsl.MyDsl.DeviceAbilities");
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
    // $ANTLR end "ruleDeviceAbilities"


    // $ANTLR start "entryRuleInteractionSpec"
    // InternalMyDsl.g:656:1: entryRuleInteractionSpec returns [EObject current=null] : iv_ruleInteractionSpec= ruleInteractionSpec EOF ;
    public final EObject entryRuleInteractionSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractionSpec = null;


        try {
            // InternalMyDsl.g:656:56: (iv_ruleInteractionSpec= ruleInteractionSpec EOF )
            // InternalMyDsl.g:657:2: iv_ruleInteractionSpec= ruleInteractionSpec EOF
            {
             newCompositeNode(grammarAccess.getInteractionSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteractionSpec=ruleInteractionSpec();

            state._fsp--;

             current =iv_ruleInteractionSpec; 
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
    // $ANTLR end "entryRuleInteractionSpec"


    // $ANTLR start "ruleInteractionSpec"
    // InternalMyDsl.g:663:1: ruleInteractionSpec returns [EObject current=null] : ( (otherlv_0= 'structs:' ( (lv_structs_1_0= ruleStruct ) )+ )* (otherlv_2= 'resources:' )* (otherlv_3= 'userInteractions:' ( (lv_interactionName_4_0= ruleInteractionName ) )+ )* ) ;
    public final EObject ruleInteractionSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_structs_1_0 = null;

        EObject lv_interactionName_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:669:2: ( ( (otherlv_0= 'structs:' ( (lv_structs_1_0= ruleStruct ) )+ )* (otherlv_2= 'resources:' )* (otherlv_3= 'userInteractions:' ( (lv_interactionName_4_0= ruleInteractionName ) )+ )* ) )
            // InternalMyDsl.g:670:2: ( (otherlv_0= 'structs:' ( (lv_structs_1_0= ruleStruct ) )+ )* (otherlv_2= 'resources:' )* (otherlv_3= 'userInteractions:' ( (lv_interactionName_4_0= ruleInteractionName ) )+ )* )
            {
            // InternalMyDsl.g:670:2: ( (otherlv_0= 'structs:' ( (lv_structs_1_0= ruleStruct ) )+ )* (otherlv_2= 'resources:' )* (otherlv_3= 'userInteractions:' ( (lv_interactionName_4_0= ruleInteractionName ) )+ )* )
            // InternalMyDsl.g:671:3: (otherlv_0= 'structs:' ( (lv_structs_1_0= ruleStruct ) )+ )* (otherlv_2= 'resources:' )* (otherlv_3= 'userInteractions:' ( (lv_interactionName_4_0= ruleInteractionName ) )+ )*
            {
            // InternalMyDsl.g:671:3: (otherlv_0= 'structs:' ( (lv_structs_1_0= ruleStruct ) )+ )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:672:4: otherlv_0= 'structs:' ( (lv_structs_1_0= ruleStruct ) )+
            	    {
            	    otherlv_0=(Token)match(input,27,FOLLOW_6); 

            	    				newLeafNode(otherlv_0, grammarAccess.getInteractionSpecAccess().getStructsKeyword_0_0());
            	    			
            	    // InternalMyDsl.g:676:4: ( (lv_structs_1_0= ruleStruct ) )+
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
            	    	    // InternalMyDsl.g:677:5: (lv_structs_1_0= ruleStruct )
            	    	    {
            	    	    // InternalMyDsl.g:677:5: (lv_structs_1_0= ruleStruct )
            	    	    // InternalMyDsl.g:678:6: lv_structs_1_0= ruleStruct
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getInteractionSpecAccess().getStructsStructParserRuleCall_0_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_18);
            	    	    lv_structs_1_0=ruleStruct();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getInteractionSpecRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"structs",
            	    	    							lv_structs_1_0,
            	    	    							"org.xtext.example.mydsl.MyDsl.Struct");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

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


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalMyDsl.g:696:3: (otherlv_2= 'resources:' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:697:4: otherlv_2= 'resources:'
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_19); 

            	    				newLeafNode(otherlv_2, grammarAccess.getInteractionSpecAccess().getResourcesKeyword_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalMyDsl.g:702:3: (otherlv_3= 'userInteractions:' ( (lv_interactionName_4_0= ruleInteractionName ) )+ )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:703:4: otherlv_3= 'userInteractions:' ( (lv_interactionName_4_0= ruleInteractionName ) )+
            	    {
            	    otherlv_3=(Token)match(input,28,FOLLOW_6); 

            	    				newLeafNode(otherlv_3, grammarAccess.getInteractionSpecAccess().getUserInteractionsKeyword_2_0());
            	    			
            	    // InternalMyDsl.g:707:4: ( (lv_interactionName_4_0= ruleInteractionName ) )+
            	    int cnt11=0;
            	    loop11:
            	    do {
            	        int alt11=2;
            	        int LA11_0 = input.LA(1);

            	        if ( (LA11_0==RULE_ID) ) {
            	            alt11=1;
            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:708:5: (lv_interactionName_4_0= ruleInteractionName )
            	    	    {
            	    	    // InternalMyDsl.g:708:5: (lv_interactionName_4_0= ruleInteractionName )
            	    	    // InternalMyDsl.g:709:6: lv_interactionName_4_0= ruleInteractionName
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getInteractionSpecAccess().getInteractionNameInteractionNameParserRuleCall_2_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_20);
            	    	    lv_interactionName_4_0=ruleInteractionName();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getInteractionSpecRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"interactionName",
            	    	    							lv_interactionName_4_0,
            	    	    							"org.xtext.example.mydsl.MyDsl.InteractionName");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt11 >= 1 ) break loop11;
            	                EarlyExitException eee =
            	                    new EarlyExitException(11, input);
            	                throw eee;
            	        }
            	        cnt11++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "ruleInteractionSpec"


    // $ANTLR start "entryRuleInteractionName"
    // InternalMyDsl.g:731:1: entryRuleInteractionName returns [EObject current=null] : iv_ruleInteractionName= ruleInteractionName EOF ;
    public final EObject entryRuleInteractionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractionName = null;


        try {
            // InternalMyDsl.g:731:56: (iv_ruleInteractionName= ruleInteractionName EOF )
            // InternalMyDsl.g:732:2: iv_ruleInteractionName= ruleInteractionName EOF
            {
             newCompositeNode(grammarAccess.getInteractionNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteractionName=ruleInteractionName();

            state._fsp--;

             current =iv_ruleInteractionName; 
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
    // $ANTLR end "entryRuleInteractionName"


    // $ANTLR start "ruleInteractionName"
    // InternalMyDsl.g:738:1: ruleInteractionName returns [EObject current=null] : ( ( (lv_interactionName_0_0= ruleEntityName ) ) ( (lv_interactionCommand_1_0= ruleCommand ) )* ( (lv_interactionRequest_2_0= ruleRequest ) )* ( (lv_interactionNotify_3_0= ruleInteractionAction ) )* ) ;
    public final EObject ruleInteractionName() throws RecognitionException {
        EObject current = null;

        EObject lv_interactionName_0_0 = null;

        EObject lv_interactionCommand_1_0 = null;

        EObject lv_interactionRequest_2_0 = null;

        EObject lv_interactionNotify_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:744:2: ( ( ( (lv_interactionName_0_0= ruleEntityName ) ) ( (lv_interactionCommand_1_0= ruleCommand ) )* ( (lv_interactionRequest_2_0= ruleRequest ) )* ( (lv_interactionNotify_3_0= ruleInteractionAction ) )* ) )
            // InternalMyDsl.g:745:2: ( ( (lv_interactionName_0_0= ruleEntityName ) ) ( (lv_interactionCommand_1_0= ruleCommand ) )* ( (lv_interactionRequest_2_0= ruleRequest ) )* ( (lv_interactionNotify_3_0= ruleInteractionAction ) )* )
            {
            // InternalMyDsl.g:745:2: ( ( (lv_interactionName_0_0= ruleEntityName ) ) ( (lv_interactionCommand_1_0= ruleCommand ) )* ( (lv_interactionRequest_2_0= ruleRequest ) )* ( (lv_interactionNotify_3_0= ruleInteractionAction ) )* )
            // InternalMyDsl.g:746:3: ( (lv_interactionName_0_0= ruleEntityName ) ) ( (lv_interactionCommand_1_0= ruleCommand ) )* ( (lv_interactionRequest_2_0= ruleRequest ) )* ( (lv_interactionNotify_3_0= ruleInteractionAction ) )*
            {
            // InternalMyDsl.g:746:3: ( (lv_interactionName_0_0= ruleEntityName ) )
            // InternalMyDsl.g:747:4: (lv_interactionName_0_0= ruleEntityName )
            {
            // InternalMyDsl.g:747:4: (lv_interactionName_0_0= ruleEntityName )
            // InternalMyDsl.g:748:5: lv_interactionName_0_0= ruleEntityName
            {

            					newCompositeNode(grammarAccess.getInteractionNameAccess().getInteractionNameEntityNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
            lv_interactionName_0_0=ruleEntityName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInteractionNameRule());
            					}
            					set(
            						current,
            						"interactionName",
            						lv_interactionName_0_0,
            						"org.xtext.example.mydsl.MyDsl.EntityName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:765:3: ( (lv_interactionCommand_1_0= ruleCommand ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==40) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:766:4: (lv_interactionCommand_1_0= ruleCommand )
            	    {
            	    // InternalMyDsl.g:766:4: (lv_interactionCommand_1_0= ruleCommand )
            	    // InternalMyDsl.g:767:5: lv_interactionCommand_1_0= ruleCommand
            	    {

            	    					newCompositeNode(grammarAccess.getInteractionNameAccess().getInteractionCommandCommandParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_interactionCommand_1_0=ruleCommand();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInteractionNameRule());
            	    					}
            	    					add(
            	    						current,
            	    						"interactionCommand",
            	    						lv_interactionCommand_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.Command");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalMyDsl.g:784:3: ( (lv_interactionRequest_2_0= ruleRequest ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==36) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:785:4: (lv_interactionRequest_2_0= ruleRequest )
            	    {
            	    // InternalMyDsl.g:785:4: (lv_interactionRequest_2_0= ruleRequest )
            	    // InternalMyDsl.g:786:5: lv_interactionRequest_2_0= ruleRequest
            	    {

            	    					newCompositeNode(grammarAccess.getInteractionNameAccess().getInteractionRequestRequestParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_interactionRequest_2_0=ruleRequest();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInteractionNameRule());
            	    					}
            	    					add(
            	    						current,
            	    						"interactionRequest",
            	    						lv_interactionRequest_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.Request");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalMyDsl.g:803:3: ( (lv_interactionNotify_3_0= ruleInteractionAction ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==29) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:804:4: (lv_interactionNotify_3_0= ruleInteractionAction )
            	    {
            	    // InternalMyDsl.g:804:4: (lv_interactionNotify_3_0= ruleInteractionAction )
            	    // InternalMyDsl.g:805:5: lv_interactionNotify_3_0= ruleInteractionAction
            	    {

            	    					newCompositeNode(grammarAccess.getInteractionNameAccess().getInteractionNotifyInteractionActionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_interactionNotify_3_0=ruleInteractionAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInteractionNameRule());
            	    					}
            	    					add(
            	    						current,
            	    						"interactionNotify",
            	    						lv_interactionNotify_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.InteractionAction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "ruleInteractionName"


    // $ANTLR start "entryRuleInteractionAction"
    // InternalMyDsl.g:826:1: entryRuleInteractionAction returns [EObject current=null] : iv_ruleInteractionAction= ruleInteractionAction EOF ;
    public final EObject entryRuleInteractionAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractionAction = null;


        try {
            // InternalMyDsl.g:826:58: (iv_ruleInteractionAction= ruleInteractionAction EOF )
            // InternalMyDsl.g:827:2: iv_ruleInteractionAction= ruleInteractionAction EOF
            {
             newCompositeNode(grammarAccess.getInteractionActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteractionAction=ruleInteractionAction();

            state._fsp--;

             current =iv_ruleInteractionAction; 
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
    // $ANTLR end "entryRuleInteractionAction"


    // $ANTLR start "ruleInteractionAction"
    // InternalMyDsl.g:833:1: ruleInteractionAction returns [EObject current=null] : (otherlv_0= 'notify' ( (lv_actionName_1_0= ruleActionName ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameters ) )* otherlv_4= ')' otherlv_5= 'from' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ;
    public final EObject ruleInteractionAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_actionName_1_0 = null;

        EObject lv_parameters_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:839:2: ( (otherlv_0= 'notify' ( (lv_actionName_1_0= ruleActionName ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameters ) )* otherlv_4= ')' otherlv_5= 'from' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) )
            // InternalMyDsl.g:840:2: (otherlv_0= 'notify' ( (lv_actionName_1_0= ruleActionName ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameters ) )* otherlv_4= ')' otherlv_5= 'from' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' )
            {
            // InternalMyDsl.g:840:2: (otherlv_0= 'notify' ( (lv_actionName_1_0= ruleActionName ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameters ) )* otherlv_4= ')' otherlv_5= 'from' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' )
            // InternalMyDsl.g:841:3: otherlv_0= 'notify' ( (lv_actionName_1_0= ruleActionName ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameters ) )* otherlv_4= ')' otherlv_5= 'from' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getInteractionActionAccess().getNotifyKeyword_0());
            		
            // InternalMyDsl.g:845:3: ( (lv_actionName_1_0= ruleActionName ) )
            // InternalMyDsl.g:846:4: (lv_actionName_1_0= ruleActionName )
            {
            // InternalMyDsl.g:846:4: (lv_actionName_1_0= ruleActionName )
            // InternalMyDsl.g:847:5: lv_actionName_1_0= ruleActionName
            {

            					newCompositeNode(grammarAccess.getInteractionActionAccess().getActionNameActionNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_actionName_1_0=ruleActionName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInteractionActionRule());
            					}
            					set(
            						current,
            						"actionName",
            						lv_actionName_1_0,
            						"org.xtext.example.mydsl.MyDsl.ActionName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getInteractionActionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMyDsl.g:868:3: ( (lv_parameters_3_0= ruleParameters ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:869:4: (lv_parameters_3_0= ruleParameters )
            	    {
            	    // InternalMyDsl.g:869:4: (lv_parameters_3_0= ruleParameters )
            	    // InternalMyDsl.g:870:5: lv_parameters_3_0= ruleParameters
            	    {

            	    					newCompositeNode(grammarAccess.getInteractionActionAccess().getParametersParametersParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_parameters_3_0=ruleParameters();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInteractionActionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.Parameters");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_4=(Token)match(input,31,FOLLOW_26); 

            			newLeafNode(otherlv_4, grammarAccess.getInteractionActionAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getInteractionActionAccess().getFromKeyword_5());
            		
            // InternalMyDsl.g:895:3: ( (otherlv_6= RULE_ID ) )
            // InternalMyDsl.g:896:4: (otherlv_6= RULE_ID )
            {
            // InternalMyDsl.g:896:4: (otherlv_6= RULE_ID )
            // InternalMyDsl.g:897:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInteractionActionRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_6, grammarAccess.getInteractionActionAccess().getInteractionEntityEntityNameCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getInteractionActionAccess().getSemicolonKeyword_7());
            		

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
    // $ANTLR end "ruleInteractionAction"


    // $ANTLR start "entryRuleArchSpec"
    // InternalMyDsl.g:916:1: entryRuleArchSpec returns [EObject current=null] : iv_ruleArchSpec= ruleArchSpec EOF ;
    public final EObject entryRuleArchSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchSpec = null;


        try {
            // InternalMyDsl.g:916:49: (iv_ruleArchSpec= ruleArchSpec EOF )
            // InternalMyDsl.g:917:2: iv_ruleArchSpec= ruleArchSpec EOF
            {
             newCompositeNode(grammarAccess.getArchSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArchSpec=ruleArchSpec();

            state._fsp--;

             current =iv_ruleArchSpec; 
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
    // $ANTLR end "entryRuleArchSpec"


    // $ANTLR start "ruleArchSpec"
    // InternalMyDsl.g:923:1: ruleArchSpec returns [EObject current=null] : ( (otherlv_0= 'structs:' ( (lv_structs_1_0= ruleStruct ) )+ )* otherlv_2= 'computationalService:' (otherlv_3= 'Common:' ( (lv_inbuiltComputationalService_4_0= ruleInBuiltComputationalService ) )* )* (otherlv_5= 'Custom:' ( (lv_customComputationalService_6_0= rulecustomComputationalService ) )* )* ) ;
    public final EObject ruleArchSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_structs_1_0 = null;

        EObject lv_inbuiltComputationalService_4_0 = null;

        EObject lv_customComputationalService_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:929:2: ( ( (otherlv_0= 'structs:' ( (lv_structs_1_0= ruleStruct ) )+ )* otherlv_2= 'computationalService:' (otherlv_3= 'Common:' ( (lv_inbuiltComputationalService_4_0= ruleInBuiltComputationalService ) )* )* (otherlv_5= 'Custom:' ( (lv_customComputationalService_6_0= rulecustomComputationalService ) )* )* ) )
            // InternalMyDsl.g:930:2: ( (otherlv_0= 'structs:' ( (lv_structs_1_0= ruleStruct ) )+ )* otherlv_2= 'computationalService:' (otherlv_3= 'Common:' ( (lv_inbuiltComputationalService_4_0= ruleInBuiltComputationalService ) )* )* (otherlv_5= 'Custom:' ( (lv_customComputationalService_6_0= rulecustomComputationalService ) )* )* )
            {
            // InternalMyDsl.g:930:2: ( (otherlv_0= 'structs:' ( (lv_structs_1_0= ruleStruct ) )+ )* otherlv_2= 'computationalService:' (otherlv_3= 'Common:' ( (lv_inbuiltComputationalService_4_0= ruleInBuiltComputationalService ) )* )* (otherlv_5= 'Custom:' ( (lv_customComputationalService_6_0= rulecustomComputationalService ) )* )* )
            // InternalMyDsl.g:931:3: (otherlv_0= 'structs:' ( (lv_structs_1_0= ruleStruct ) )+ )* otherlv_2= 'computationalService:' (otherlv_3= 'Common:' ( (lv_inbuiltComputationalService_4_0= ruleInBuiltComputationalService ) )* )* (otherlv_5= 'Custom:' ( (lv_customComputationalService_6_0= rulecustomComputationalService ) )* )*
            {
            // InternalMyDsl.g:931:3: (otherlv_0= 'structs:' ( (lv_structs_1_0= ruleStruct ) )+ )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==27) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:932:4: otherlv_0= 'structs:' ( (lv_structs_1_0= ruleStruct ) )+
            	    {
            	    otherlv_0=(Token)match(input,27,FOLLOW_6); 

            	    				newLeafNode(otherlv_0, grammarAccess.getArchSpecAccess().getStructsKeyword_0_0());
            	    			
            	    // InternalMyDsl.g:936:4: ( (lv_structs_1_0= ruleStruct ) )+
            	    int cnt17=0;
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==RULE_ID) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:937:5: (lv_structs_1_0= ruleStruct )
            	    	    {
            	    	    // InternalMyDsl.g:937:5: (lv_structs_1_0= ruleStruct )
            	    	    // InternalMyDsl.g:938:6: lv_structs_1_0= ruleStruct
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getArchSpecAccess().getStructsStructParserRuleCall_0_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_27);
            	    	    lv_structs_1_0=ruleStruct();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getArchSpecRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"structs",
            	    	    							lv_structs_1_0,
            	    	    							"org.xtext.example.mydsl.MyDsl.Struct");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt17 >= 1 ) break loop17;
            	                EarlyExitException eee =
            	                    new EarlyExitException(17, input);
            	                throw eee;
            	        }
            	        cnt17++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_2=(Token)match(input,33,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getArchSpecAccess().getComputationalServiceKeyword_1());
            		
            // InternalMyDsl.g:960:3: (otherlv_3= 'Common:' ( (lv_inbuiltComputationalService_4_0= ruleInBuiltComputationalService ) )* )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==34) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:961:4: otherlv_3= 'Common:' ( (lv_inbuiltComputationalService_4_0= ruleInBuiltComputationalService ) )*
            	    {
            	    otherlv_3=(Token)match(input,34,FOLLOW_29); 

            	    				newLeafNode(otherlv_3, grammarAccess.getArchSpecAccess().getCommonKeyword_2_0());
            	    			
            	    // InternalMyDsl.g:965:4: ( (lv_inbuiltComputationalService_4_0= ruleInBuiltComputationalService ) )*
            	    loop19:
            	    do {
            	        int alt19=2;
            	        int LA19_0 = input.LA(1);

            	        if ( (LA19_0==RULE_ID) ) {
            	            alt19=1;
            	        }


            	        switch (alt19) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:966:5: (lv_inbuiltComputationalService_4_0= ruleInBuiltComputationalService )
            	    	    {
            	    	    // InternalMyDsl.g:966:5: (lv_inbuiltComputationalService_4_0= ruleInBuiltComputationalService )
            	    	    // InternalMyDsl.g:967:6: lv_inbuiltComputationalService_4_0= ruleInBuiltComputationalService
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getArchSpecAccess().getInbuiltComputationalServiceInBuiltComputationalServiceParserRuleCall_2_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_29);
            	    	    lv_inbuiltComputationalService_4_0=ruleInBuiltComputationalService();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getArchSpecRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"inbuiltComputationalService",
            	    	    							lv_inbuiltComputationalService_4_0,
            	    	    							"org.xtext.example.mydsl.MyDsl.InBuiltComputationalService");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop19;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // InternalMyDsl.g:985:3: (otherlv_5= 'Custom:' ( (lv_customComputationalService_6_0= rulecustomComputationalService ) )* )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==35) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:986:4: otherlv_5= 'Custom:' ( (lv_customComputationalService_6_0= rulecustomComputationalService ) )*
            	    {
            	    otherlv_5=(Token)match(input,35,FOLLOW_30); 

            	    				newLeafNode(otherlv_5, grammarAccess.getArchSpecAccess().getCustomKeyword_3_0());
            	    			
            	    // InternalMyDsl.g:990:4: ( (lv_customComputationalService_6_0= rulecustomComputationalService ) )*
            	    loop21:
            	    do {
            	        int alt21=2;
            	        int LA21_0 = input.LA(1);

            	        if ( (LA21_0==RULE_ID) ) {
            	            alt21=1;
            	        }


            	        switch (alt21) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:991:5: (lv_customComputationalService_6_0= rulecustomComputationalService )
            	    	    {
            	    	    // InternalMyDsl.g:991:5: (lv_customComputationalService_6_0= rulecustomComputationalService )
            	    	    // InternalMyDsl.g:992:6: lv_customComputationalService_6_0= rulecustomComputationalService
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getArchSpecAccess().getCustomComputationalServiceCustomComputationalServiceParserRuleCall_3_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_30);
            	    	    lv_customComputationalService_6_0=rulecustomComputationalService();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getArchSpecRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"customComputationalService",
            	    	    							lv_customComputationalService_6_0,
            	    	    							"org.xtext.example.mydsl.MyDsl.customComputationalService");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop21;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // $ANTLR end "ruleArchSpec"


    // $ANTLR start "entryRuleInBuiltComputationalService"
    // InternalMyDsl.g:1014:1: entryRuleInBuiltComputationalService returns [EObject current=null] : iv_ruleInBuiltComputationalService= ruleInBuiltComputationalService EOF ;
    public final EObject entryRuleInBuiltComputationalService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInBuiltComputationalService = null;


        try {
            // InternalMyDsl.g:1014:68: (iv_ruleInBuiltComputationalService= ruleInBuiltComputationalService EOF )
            // InternalMyDsl.g:1015:2: iv_ruleInBuiltComputationalService= ruleInBuiltComputationalService EOF
            {
             newCompositeNode(grammarAccess.getInBuiltComputationalServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInBuiltComputationalService=ruleInBuiltComputationalService();

            state._fsp--;

             current =iv_ruleInBuiltComputationalService; 
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
    // $ANTLR end "entryRuleInBuiltComputationalService"


    // $ANTLR start "ruleInBuiltComputationalService"
    // InternalMyDsl.g:1021:1: ruleInBuiltComputationalService returns [EObject current=null] : ( ( (lv_inBuiltComputationalServiceName_0_0= ruleEntityName ) ) ( (lv_consumes_1_0= ruleConsumeForInBuilt ) )+ ( (lv_computeInfo_2_0= ruleComputeInfoForInBuilt ) )+ ( (lv_generateInfo_3_0= ruleGenerate ) )+ ) ;
    public final EObject ruleInBuiltComputationalService() throws RecognitionException {
        EObject current = null;

        EObject lv_inBuiltComputationalServiceName_0_0 = null;

        EObject lv_consumes_1_0 = null;

        EObject lv_computeInfo_2_0 = null;

        EObject lv_generateInfo_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1027:2: ( ( ( (lv_inBuiltComputationalServiceName_0_0= ruleEntityName ) ) ( (lv_consumes_1_0= ruleConsumeForInBuilt ) )+ ( (lv_computeInfo_2_0= ruleComputeInfoForInBuilt ) )+ ( (lv_generateInfo_3_0= ruleGenerate ) )+ ) )
            // InternalMyDsl.g:1028:2: ( ( (lv_inBuiltComputationalServiceName_0_0= ruleEntityName ) ) ( (lv_consumes_1_0= ruleConsumeForInBuilt ) )+ ( (lv_computeInfo_2_0= ruleComputeInfoForInBuilt ) )+ ( (lv_generateInfo_3_0= ruleGenerate ) )+ )
            {
            // InternalMyDsl.g:1028:2: ( ( (lv_inBuiltComputationalServiceName_0_0= ruleEntityName ) ) ( (lv_consumes_1_0= ruleConsumeForInBuilt ) )+ ( (lv_computeInfo_2_0= ruleComputeInfoForInBuilt ) )+ ( (lv_generateInfo_3_0= ruleGenerate ) )+ )
            // InternalMyDsl.g:1029:3: ( (lv_inBuiltComputationalServiceName_0_0= ruleEntityName ) ) ( (lv_consumes_1_0= ruleConsumeForInBuilt ) )+ ( (lv_computeInfo_2_0= ruleComputeInfoForInBuilt ) )+ ( (lv_generateInfo_3_0= ruleGenerate ) )+
            {
            // InternalMyDsl.g:1029:3: ( (lv_inBuiltComputationalServiceName_0_0= ruleEntityName ) )
            // InternalMyDsl.g:1030:4: (lv_inBuiltComputationalServiceName_0_0= ruleEntityName )
            {
            // InternalMyDsl.g:1030:4: (lv_inBuiltComputationalServiceName_0_0= ruleEntityName )
            // InternalMyDsl.g:1031:5: lv_inBuiltComputationalServiceName_0_0= ruleEntityName
            {

            					newCompositeNode(grammarAccess.getInBuiltComputationalServiceAccess().getInBuiltComputationalServiceNameEntityNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
            lv_inBuiltComputationalServiceName_0_0=ruleEntityName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInBuiltComputationalServiceRule());
            					}
            					set(
            						current,
            						"inBuiltComputationalServiceName",
            						lv_inBuiltComputationalServiceName_0_0,
            						"org.xtext.example.mydsl.MyDsl.EntityName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1048:3: ( (lv_consumes_1_0= ruleConsumeForInBuilt ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==38) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:1049:4: (lv_consumes_1_0= ruleConsumeForInBuilt )
            	    {
            	    // InternalMyDsl.g:1049:4: (lv_consumes_1_0= ruleConsumeForInBuilt )
            	    // InternalMyDsl.g:1050:5: lv_consumes_1_0= ruleConsumeForInBuilt
            	    {

            	    					newCompositeNode(grammarAccess.getInBuiltComputationalServiceAccess().getConsumesConsumeForInBuiltParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_consumes_1_0=ruleConsumeForInBuilt();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInBuiltComputationalServiceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"consumes",
            	    						lv_consumes_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.ConsumeForInBuilt");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            // InternalMyDsl.g:1067:3: ( (lv_computeInfo_2_0= ruleComputeInfoForInBuilt ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==39) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMyDsl.g:1068:4: (lv_computeInfo_2_0= ruleComputeInfoForInBuilt )
            	    {
            	    // InternalMyDsl.g:1068:4: (lv_computeInfo_2_0= ruleComputeInfoForInBuilt )
            	    // InternalMyDsl.g:1069:5: lv_computeInfo_2_0= ruleComputeInfoForInBuilt
            	    {

            	    					newCompositeNode(grammarAccess.getInBuiltComputationalServiceAccess().getComputeInfoComputeInfoForInBuiltParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_33);
            	    lv_computeInfo_2_0=ruleComputeInfoForInBuilt();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInBuiltComputationalServiceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"computeInfo",
            	    						lv_computeInfo_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.ComputeInfoForInBuilt");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            // InternalMyDsl.g:1086:3: ( (lv_generateInfo_3_0= ruleGenerate ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==55) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyDsl.g:1087:4: (lv_generateInfo_3_0= ruleGenerate )
            	    {
            	    // InternalMyDsl.g:1087:4: (lv_generateInfo_3_0= ruleGenerate )
            	    // InternalMyDsl.g:1088:5: lv_generateInfo_3_0= ruleGenerate
            	    {

            	    					newCompositeNode(grammarAccess.getInBuiltComputationalServiceAccess().getGenerateInfoGenerateParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_34);
            	    lv_generateInfo_3_0=ruleGenerate();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInBuiltComputationalServiceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"generateInfo",
            	    						lv_generateInfo_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.Generate");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
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
    // $ANTLR end "ruleInBuiltComputationalService"


    // $ANTLR start "entryRulecustomComputationalService"
    // InternalMyDsl.g:1109:1: entryRulecustomComputationalService returns [EObject current=null] : iv_rulecustomComputationalService= rulecustomComputationalService EOF ;
    public final EObject entryRulecustomComputationalService() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecustomComputationalService = null;


        try {
            // InternalMyDsl.g:1109:67: (iv_rulecustomComputationalService= rulecustomComputationalService EOF )
            // InternalMyDsl.g:1110:2: iv_rulecustomComputationalService= rulecustomComputationalService EOF
            {
             newCompositeNode(grammarAccess.getCustomComputationalServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecustomComputationalService=rulecustomComputationalService();

            state._fsp--;

             current =iv_rulecustomComputationalService; 
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
    // $ANTLR end "entryRulecustomComputationalService"


    // $ANTLR start "rulecustomComputationalService"
    // InternalMyDsl.g:1116:1: rulecustomComputationalService returns [EObject current=null] : ( ( (lv_customComputationalServiceName_0_0= ruleEntityName ) ) ( (lv_consumes_1_0= ruleConsume ) )+ ( (lv_requests_2_0= ruleRequest ) )* ( (lv_generateInfo_3_0= ruleGenerate ) )* ( (lv_commands_4_0= ruleCommand ) )* ) ;
    public final EObject rulecustomComputationalService() throws RecognitionException {
        EObject current = null;

        EObject lv_customComputationalServiceName_0_0 = null;

        EObject lv_consumes_1_0 = null;

        EObject lv_requests_2_0 = null;

        EObject lv_generateInfo_3_0 = null;

        EObject lv_commands_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1122:2: ( ( ( (lv_customComputationalServiceName_0_0= ruleEntityName ) ) ( (lv_consumes_1_0= ruleConsume ) )+ ( (lv_requests_2_0= ruleRequest ) )* ( (lv_generateInfo_3_0= ruleGenerate ) )* ( (lv_commands_4_0= ruleCommand ) )* ) )
            // InternalMyDsl.g:1123:2: ( ( (lv_customComputationalServiceName_0_0= ruleEntityName ) ) ( (lv_consumes_1_0= ruleConsume ) )+ ( (lv_requests_2_0= ruleRequest ) )* ( (lv_generateInfo_3_0= ruleGenerate ) )* ( (lv_commands_4_0= ruleCommand ) )* )
            {
            // InternalMyDsl.g:1123:2: ( ( (lv_customComputationalServiceName_0_0= ruleEntityName ) ) ( (lv_consumes_1_0= ruleConsume ) )+ ( (lv_requests_2_0= ruleRequest ) )* ( (lv_generateInfo_3_0= ruleGenerate ) )* ( (lv_commands_4_0= ruleCommand ) )* )
            // InternalMyDsl.g:1124:3: ( (lv_customComputationalServiceName_0_0= ruleEntityName ) ) ( (lv_consumes_1_0= ruleConsume ) )+ ( (lv_requests_2_0= ruleRequest ) )* ( (lv_generateInfo_3_0= ruleGenerate ) )* ( (lv_commands_4_0= ruleCommand ) )*
            {
            // InternalMyDsl.g:1124:3: ( (lv_customComputationalServiceName_0_0= ruleEntityName ) )
            // InternalMyDsl.g:1125:4: (lv_customComputationalServiceName_0_0= ruleEntityName )
            {
            // InternalMyDsl.g:1125:4: (lv_customComputationalServiceName_0_0= ruleEntityName )
            // InternalMyDsl.g:1126:5: lv_customComputationalServiceName_0_0= ruleEntityName
            {

            					newCompositeNode(grammarAccess.getCustomComputationalServiceAccess().getCustomComputationalServiceNameEntityNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
            lv_customComputationalServiceName_0_0=ruleEntityName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomComputationalServiceRule());
            					}
            					set(
            						current,
            						"customComputationalServiceName",
            						lv_customComputationalServiceName_0_0,
            						"org.xtext.example.mydsl.MyDsl.EntityName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1143:3: ( (lv_consumes_1_0= ruleConsume ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==38) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMyDsl.g:1144:4: (lv_consumes_1_0= ruleConsume )
            	    {
            	    // InternalMyDsl.g:1144:4: (lv_consumes_1_0= ruleConsume )
            	    // InternalMyDsl.g:1145:5: lv_consumes_1_0= ruleConsume
            	    {

            	    					newCompositeNode(grammarAccess.getCustomComputationalServiceAccess().getConsumesConsumeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_35);
            	    lv_consumes_1_0=ruleConsume();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCustomComputationalServiceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"consumes",
            	    						lv_consumes_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.Consume");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            // InternalMyDsl.g:1162:3: ( (lv_requests_2_0= ruleRequest ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==36) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMyDsl.g:1163:4: (lv_requests_2_0= ruleRequest )
            	    {
            	    // InternalMyDsl.g:1163:4: (lv_requests_2_0= ruleRequest )
            	    // InternalMyDsl.g:1164:5: lv_requests_2_0= ruleRequest
            	    {

            	    					newCompositeNode(grammarAccess.getCustomComputationalServiceAccess().getRequestsRequestParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_36);
            	    lv_requests_2_0=ruleRequest();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCustomComputationalServiceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"requests",
            	    						lv_requests_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.Request");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // InternalMyDsl.g:1181:3: ( (lv_generateInfo_3_0= ruleGenerate ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==55) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyDsl.g:1182:4: (lv_generateInfo_3_0= ruleGenerate )
            	    {
            	    // InternalMyDsl.g:1182:4: (lv_generateInfo_3_0= ruleGenerate )
            	    // InternalMyDsl.g:1183:5: lv_generateInfo_3_0= ruleGenerate
            	    {

            	    					newCompositeNode(grammarAccess.getCustomComputationalServiceAccess().getGenerateInfoGenerateParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_37);
            	    lv_generateInfo_3_0=ruleGenerate();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCustomComputationalServiceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"generateInfo",
            	    						lv_generateInfo_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.Generate");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // InternalMyDsl.g:1200:3: ( (lv_commands_4_0= ruleCommand ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==40) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalMyDsl.g:1201:4: (lv_commands_4_0= ruleCommand )
            	    {
            	    // InternalMyDsl.g:1201:4: (lv_commands_4_0= ruleCommand )
            	    // InternalMyDsl.g:1202:5: lv_commands_4_0= ruleCommand
            	    {

            	    					newCompositeNode(grammarAccess.getCustomComputationalServiceAccess().getCommandsCommandParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_38);
            	    lv_commands_4_0=ruleCommand();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCustomComputationalServiceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"commands",
            	    						lv_commands_4_0,
            	    						"org.xtext.example.mydsl.MyDsl.Command");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // $ANTLR end "rulecustomComputationalService"


    // $ANTLR start "entryRuleRequest"
    // InternalMyDsl.g:1223:1: entryRuleRequest returns [EObject current=null] : iv_ruleRequest= ruleRequest EOF ;
    public final EObject entryRuleRequest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequest = null;


        try {
            // InternalMyDsl.g:1223:48: (iv_ruleRequest= ruleRequest EOF )
            // InternalMyDsl.g:1224:2: iv_ruleRequest= ruleRequest EOF
            {
             newCompositeNode(grammarAccess.getRequestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequest=ruleRequest();

            state._fsp--;

             current =iv_ruleRequest; 
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
    // $ANTLR end "entryRuleRequest"


    // $ANTLR start "ruleRequest"
    // InternalMyDsl.g:1230:1: ruleRequest returns [EObject current=null] : (otherlv_0= 'request' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleRequest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1236:2: ( (otherlv_0= 'request' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalMyDsl.g:1237:2: (otherlv_0= 'request' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalMyDsl.g:1237:2: (otherlv_0= 'request' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalMyDsl.g:1238:3: otherlv_0= 'request' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRequestAccess().getRequestKeyword_0());
            		
            // InternalMyDsl.g:1242:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:1243:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:1243:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:1244:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequestRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_39); 

            					newLeafNode(otherlv_1, grammarAccess.getRequestAccess().getRequestnameSourceNameCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getRequestAccess().getToKeyword_2());
            		
            // InternalMyDsl.g:1259:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:1260:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:1260:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:1261:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequestRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_3, grammarAccess.getRequestAccess().getStorageForRequestEntityNameCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRequestAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleRequest"


    // $ANTLR start "entryRuleConsumeForInBuilt"
    // InternalMyDsl.g:1280:1: entryRuleConsumeForInBuilt returns [EObject current=null] : iv_ruleConsumeForInBuilt= ruleConsumeForInBuilt EOF ;
    public final EObject entryRuleConsumeForInBuilt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConsumeForInBuilt = null;


        try {
            // InternalMyDsl.g:1280:58: (iv_ruleConsumeForInBuilt= ruleConsumeForInBuilt EOF )
            // InternalMyDsl.g:1281:2: iv_ruleConsumeForInBuilt= ruleConsumeForInBuilt EOF
            {
             newCompositeNode(grammarAccess.getConsumeForInBuiltRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConsumeForInBuilt=ruleConsumeForInBuilt();

            state._fsp--;

             current =iv_ruleConsumeForInBuilt; 
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
    // $ANTLR end "entryRuleConsumeForInBuilt"


    // $ANTLR start "ruleConsumeForInBuilt"
    // InternalMyDsl.g:1287:1: ruleConsumeForInBuilt returns [EObject current=null] : (otherlv_0= 'consume' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleConsumeForInBuilt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1293:2: ( (otherlv_0= 'consume' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalMyDsl.g:1294:2: (otherlv_0= 'consume' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalMyDsl.g:1294:2: (otherlv_0= 'consume' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalMyDsl.g:1295:3: otherlv_0= 'consume' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getConsumeForInBuiltAccess().getConsumeKeyword_0());
            		
            // InternalMyDsl.g:1299:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:1300:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:1300:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:1301:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConsumeForInBuiltRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_1, grammarAccess.getConsumeForInBuiltAccess().getNameSourceNameCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getConsumeForInBuiltAccess().getFromKeyword_2());
            		
            // InternalMyDsl.g:1316:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:1317:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:1317:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:1318:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConsumeForInBuiltRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_3, grammarAccess.getConsumeForInBuiltAccess().getSensorForConsumeEntityNameCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getConsumeForInBuiltAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleConsumeForInBuilt"


    // $ANTLR start "entryRuleComputeInfoForInBuilt"
    // InternalMyDsl.g:1337:1: entryRuleComputeInfoForInBuilt returns [EObject current=null] : iv_ruleComputeInfoForInBuilt= ruleComputeInfoForInBuilt EOF ;
    public final EObject entryRuleComputeInfoForInBuilt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputeInfoForInBuilt = null;


        try {
            // InternalMyDsl.g:1337:62: (iv_ruleComputeInfoForInBuilt= ruleComputeInfoForInBuilt EOF )
            // InternalMyDsl.g:1338:2: iv_ruleComputeInfoForInBuilt= ruleComputeInfoForInBuilt EOF
            {
             newCompositeNode(grammarAccess.getComputeInfoForInBuiltRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComputeInfoForInBuilt=ruleComputeInfoForInBuilt();

            state._fsp--;

             current =iv_ruleComputeInfoForInBuilt; 
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
    // $ANTLR end "entryRuleComputeInfoForInBuilt"


    // $ANTLR start "ruleComputeInfoForInBuilt"
    // InternalMyDsl.g:1344:1: ruleComputeInfoForInBuilt returns [EObject current=null] : (otherlv_0= 'COMPUTE' otherlv_1= '(' ( (lv_operationName_2_0= ruleOperationName ) ) (otherlv_3= ',' ( (lv_operationParameter_4_0= RULE_INT ) ) )? otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruleComputeInfoForInBuilt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_operationParameter_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_operationName_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1350:2: ( (otherlv_0= 'COMPUTE' otherlv_1= '(' ( (lv_operationName_2_0= ruleOperationName ) ) (otherlv_3= ',' ( (lv_operationParameter_4_0= RULE_INT ) ) )? otherlv_5= ')' otherlv_6= ';' ) )
            // InternalMyDsl.g:1351:2: (otherlv_0= 'COMPUTE' otherlv_1= '(' ( (lv_operationName_2_0= ruleOperationName ) ) (otherlv_3= ',' ( (lv_operationParameter_4_0= RULE_INT ) ) )? otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalMyDsl.g:1351:2: (otherlv_0= 'COMPUTE' otherlv_1= '(' ( (lv_operationName_2_0= ruleOperationName ) ) (otherlv_3= ',' ( (lv_operationParameter_4_0= RULE_INT ) ) )? otherlv_5= ')' otherlv_6= ';' )
            // InternalMyDsl.g:1352:3: otherlv_0= 'COMPUTE' otherlv_1= '(' ( (lv_operationName_2_0= ruleOperationName ) ) (otherlv_3= ',' ( (lv_operationParameter_4_0= RULE_INT ) ) )? otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getComputeInfoForInBuiltAccess().getCOMPUTEKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getComputeInfoForInBuiltAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:1360:3: ( (lv_operationName_2_0= ruleOperationName ) )
            // InternalMyDsl.g:1361:4: (lv_operationName_2_0= ruleOperationName )
            {
            // InternalMyDsl.g:1361:4: (lv_operationName_2_0= ruleOperationName )
            // InternalMyDsl.g:1362:5: lv_operationName_2_0= ruleOperationName
            {

            					newCompositeNode(grammarAccess.getComputeInfoForInBuiltAccess().getOperationNameOperationNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_41);
            lv_operationName_2_0=ruleOperationName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComputeInfoForInBuiltRule());
            					}
            					set(
            						current,
            						"operationName",
            						lv_operationName_2_0,
            						"org.xtext.example.mydsl.MyDsl.OperationName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1379:3: (otherlv_3= ',' ( (lv_operationParameter_4_0= RULE_INT ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==26) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:1380:4: otherlv_3= ',' ( (lv_operationParameter_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getComputeInfoForInBuiltAccess().getCommaKeyword_3_0());
                    			
                    // InternalMyDsl.g:1384:4: ( (lv_operationParameter_4_0= RULE_INT ) )
                    // InternalMyDsl.g:1385:5: (lv_operationParameter_4_0= RULE_INT )
                    {
                    // InternalMyDsl.g:1385:5: (lv_operationParameter_4_0= RULE_INT )
                    // InternalMyDsl.g:1386:6: lv_operationParameter_4_0= RULE_INT
                    {
                    lv_operationParameter_4_0=(Token)match(input,RULE_INT,FOLLOW_42); 

                    						newLeafNode(lv_operationParameter_4_0, grammarAccess.getComputeInfoForInBuiltAccess().getOperationParameterINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComputeInfoForInBuiltRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"operationParameter",
                    							lv_operationParameter_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,31,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getComputeInfoForInBuiltAccess().getRightParenthesisKeyword_4());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getComputeInfoForInBuiltAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleComputeInfoForInBuilt"


    // $ANTLR start "entryRuleConsume"
    // InternalMyDsl.g:1415:1: entryRuleConsume returns [EObject current=null] : iv_ruleConsume= ruleConsume EOF ;
    public final EObject entryRuleConsume() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConsume = null;


        try {
            // InternalMyDsl.g:1415:48: (iv_ruleConsume= ruleConsume EOF )
            // InternalMyDsl.g:1416:2: iv_ruleConsume= ruleConsume EOF
            {
             newCompositeNode(grammarAccess.getConsumeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConsume=ruleConsume();

            state._fsp--;

             current =iv_ruleConsume; 
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
    // $ANTLR end "entryRuleConsume"


    // $ANTLR start "ruleConsume"
    // InternalMyDsl.g:1422:1: ruleConsume returns [EObject current=null] : (otherlv_0= 'consume' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleConsume() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1428:2: ( (otherlv_0= 'consume' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalMyDsl.g:1429:2: (otherlv_0= 'consume' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalMyDsl.g:1429:2: (otherlv_0= 'consume' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalMyDsl.g:1430:3: otherlv_0= 'consume' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getConsumeAccess().getConsumeKeyword_0());
            		
            // InternalMyDsl.g:1434:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:1435:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:1435:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:1436:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConsumeRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_1, grammarAccess.getConsumeAccess().getNameSourceNameCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getConsumeAccess().getFromKeyword_2());
            		
            // InternalMyDsl.g:1451:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:1452:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:1452:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:1453:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConsumeRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_3, grammarAccess.getConsumeAccess().getFromNameEntityNameCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getConsumeAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleConsume"


    // $ANTLR start "entryRuleCommand"
    // InternalMyDsl.g:1472:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalMyDsl.g:1472:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalMyDsl.g:1473:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalMyDsl.g:1479:1: ruleCommand returns [EObject current=null] : (otherlv_0= 'command' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_commandparameter_3_0= ruleCommandParameter ) )? otherlv_4= ')' otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_commandparameter_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1485:2: ( (otherlv_0= 'command' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_commandparameter_3_0= ruleCommandParameter ) )? otherlv_4= ')' otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) )
            // InternalMyDsl.g:1486:2: (otherlv_0= 'command' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_commandparameter_3_0= ruleCommandParameter ) )? otherlv_4= ')' otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' )
            {
            // InternalMyDsl.g:1486:2: (otherlv_0= 'command' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_commandparameter_3_0= ruleCommandParameter ) )? otherlv_4= ')' otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' )
            // InternalMyDsl.g:1487:3: otherlv_0= 'command' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_commandparameter_3_0= ruleCommandParameter ) )? otherlv_4= ')' otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCommandAccess().getCommandKeyword_0());
            		
            // InternalMyDsl.g:1491:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:1492:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:1492:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:1493:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommandRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_1, grammarAccess.getCommandAccess().getCommandNameActionNameCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getCommandAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMyDsl.g:1508:3: ( (lv_commandparameter_3_0= ruleCommandParameter ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:1509:4: (lv_commandparameter_3_0= ruleCommandParameter )
                    {
                    // InternalMyDsl.g:1509:4: (lv_commandparameter_3_0= ruleCommandParameter )
                    // InternalMyDsl.g:1510:5: lv_commandparameter_3_0= ruleCommandParameter
                    {

                    					newCompositeNode(grammarAccess.getCommandAccess().getCommandparameterCommandParameterParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_42);
                    lv_commandparameter_3_0=ruleCommandParameter();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCommandRule());
                    					}
                    					set(
                    						current,
                    						"commandparameter",
                    						lv_commandparameter_3_0,
                    						"org.xtext.example.mydsl.MyDsl.CommandParameter");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,31,FOLLOW_39); 

            			newLeafNode(otherlv_4, grammarAccess.getCommandAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getCommandAccess().getToKeyword_5());
            		
            // InternalMyDsl.g:1535:3: ( (otherlv_6= RULE_ID ) )
            // InternalMyDsl.g:1536:4: (otherlv_6= RULE_ID )
            {
            // InternalMyDsl.g:1536:4: (otherlv_6= RULE_ID )
            // InternalMyDsl.g:1537:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommandRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_6, grammarAccess.getCommandAccess().getActuatorForCommandEntityNameCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getCommandAccess().getSemicolonKeyword_7());
            		

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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleCommandParameter"
    // InternalMyDsl.g:1556:1: entryRuleCommandParameter returns [EObject current=null] : iv_ruleCommandParameter= ruleCommandParameter EOF ;
    public final EObject entryRuleCommandParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandParameter = null;


        try {
            // InternalMyDsl.g:1556:57: (iv_ruleCommandParameter= ruleCommandParameter EOF )
            // InternalMyDsl.g:1557:2: iv_ruleCommandParameter= ruleCommandParameter EOF
            {
             newCompositeNode(grammarAccess.getCommandParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommandParameter=ruleCommandParameter();

            state._fsp--;

             current =iv_ruleCommandParameter; 
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
    // $ANTLR end "entryRuleCommandParameter"


    // $ANTLR start "ruleCommandParameter"
    // InternalMyDsl.g:1563:1: ruleCommandParameter returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_parameter_2_0= ruleCommandParameter ) ) )? ) ;
    public final EObject ruleCommandParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_parameter_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1569:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_parameter_2_0= ruleCommandParameter ) ) )? ) )
            // InternalMyDsl.g:1570:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_parameter_2_0= ruleCommandParameter ) ) )? )
            {
            // InternalMyDsl.g:1570:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_parameter_2_0= ruleCommandParameter ) ) )? )
            // InternalMyDsl.g:1571:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_parameter_2_0= ruleCommandParameter ) ) )?
            {
            // InternalMyDsl.g:1571:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:1572:4: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:1572:4: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:1573:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommandParameterRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_0, grammarAccess.getCommandParameterAccess().getNameParameterNameCrossReference_0_0());
            				

            }


            }

            // InternalMyDsl.g:1584:3: (otherlv_1= ',' ( (lv_parameter_2_0= ruleCommandParameter ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==26) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:1585:4: otherlv_1= ',' ( (lv_parameter_2_0= ruleCommandParameter ) )
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getCommandParameterAccess().getCommaKeyword_1_0());
                    			
                    // InternalMyDsl.g:1589:4: ( (lv_parameter_2_0= ruleCommandParameter ) )
                    // InternalMyDsl.g:1590:5: (lv_parameter_2_0= ruleCommandParameter )
                    {
                    // InternalMyDsl.g:1590:5: (lv_parameter_2_0= ruleCommandParameter )
                    // InternalMyDsl.g:1591:6: lv_parameter_2_0= ruleCommandParameter
                    {

                    						newCompositeNode(grammarAccess.getCommandParameterAccess().getParameterCommandParameterParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_parameter_2_0=ruleCommandParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandParameterRule());
                    						}
                    						set(
                    							current,
                    							"parameter",
                    							lv_parameter_2_0,
                    							"org.xtext.example.mydsl.MyDsl.CommandParameter");
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
    // $ANTLR end "ruleCommandParameter"


    // $ANTLR start "entryRuleVocSpec"
    // InternalMyDsl.g:1613:1: entryRuleVocSpec returns [EObject current=null] : iv_ruleVocSpec= ruleVocSpec EOF ;
    public final EObject entryRuleVocSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVocSpec = null;


        try {
            // InternalMyDsl.g:1613:48: (iv_ruleVocSpec= ruleVocSpec EOF )
            // InternalMyDsl.g:1614:2: iv_ruleVocSpec= ruleVocSpec EOF
            {
             newCompositeNode(grammarAccess.getVocSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVocSpec=ruleVocSpec();

            state._fsp--;

             current =iv_ruleVocSpec; 
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
    // $ANTLR end "entryRuleVocSpec"


    // $ANTLR start "ruleVocSpec"
    // InternalMyDsl.g:1620:1: ruleVocSpec returns [EObject current=null] : (otherlv_0= 'structs:' ( (lv_structs_1_0= ruleStruct ) )* otherlv_2= 'resources:' otherlv_3= 'sensors:' (otherlv_4= 'periodicSensors:' ( (lv_periodicSensors_5_0= rulePeriodicSensors ) )+ )* (otherlv_6= 'eventDrivenSensors:' ( (lv_eventSensors_7_0= ruleEventSensors ) )+ )* (otherlv_8= 'requestBasedSensors:' ( (lv_requestSensors_9_0= ruleRequestSensors ) )+ )* (otherlv_10= 'tags:' ( (lv_tags_11_0= ruleTags ) )+ )* (otherlv_12= 'actuators:' ( (lv_actuators_13_0= ruleActuator ) )+ )* (otherlv_14= 'storages:' ( (lv_storageService_15_0= ruleStorageService ) )+ )* ) ;
    public final EObject ruleVocSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_structs_1_0 = null;

        EObject lv_periodicSensors_5_0 = null;

        EObject lv_eventSensors_7_0 = null;

        EObject lv_requestSensors_9_0 = null;

        EObject lv_tags_11_0 = null;

        EObject lv_actuators_13_0 = null;

        EObject lv_storageService_15_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1626:2: ( (otherlv_0= 'structs:' ( (lv_structs_1_0= ruleStruct ) )* otherlv_2= 'resources:' otherlv_3= 'sensors:' (otherlv_4= 'periodicSensors:' ( (lv_periodicSensors_5_0= rulePeriodicSensors ) )+ )* (otherlv_6= 'eventDrivenSensors:' ( (lv_eventSensors_7_0= ruleEventSensors ) )+ )* (otherlv_8= 'requestBasedSensors:' ( (lv_requestSensors_9_0= ruleRequestSensors ) )+ )* (otherlv_10= 'tags:' ( (lv_tags_11_0= ruleTags ) )+ )* (otherlv_12= 'actuators:' ( (lv_actuators_13_0= ruleActuator ) )+ )* (otherlv_14= 'storages:' ( (lv_storageService_15_0= ruleStorageService ) )+ )* ) )
            // InternalMyDsl.g:1627:2: (otherlv_0= 'structs:' ( (lv_structs_1_0= ruleStruct ) )* otherlv_2= 'resources:' otherlv_3= 'sensors:' (otherlv_4= 'periodicSensors:' ( (lv_periodicSensors_5_0= rulePeriodicSensors ) )+ )* (otherlv_6= 'eventDrivenSensors:' ( (lv_eventSensors_7_0= ruleEventSensors ) )+ )* (otherlv_8= 'requestBasedSensors:' ( (lv_requestSensors_9_0= ruleRequestSensors ) )+ )* (otherlv_10= 'tags:' ( (lv_tags_11_0= ruleTags ) )+ )* (otherlv_12= 'actuators:' ( (lv_actuators_13_0= ruleActuator ) )+ )* (otherlv_14= 'storages:' ( (lv_storageService_15_0= ruleStorageService ) )+ )* )
            {
            // InternalMyDsl.g:1627:2: (otherlv_0= 'structs:' ( (lv_structs_1_0= ruleStruct ) )* otherlv_2= 'resources:' otherlv_3= 'sensors:' (otherlv_4= 'periodicSensors:' ( (lv_periodicSensors_5_0= rulePeriodicSensors ) )+ )* (otherlv_6= 'eventDrivenSensors:' ( (lv_eventSensors_7_0= ruleEventSensors ) )+ )* (otherlv_8= 'requestBasedSensors:' ( (lv_requestSensors_9_0= ruleRequestSensors ) )+ )* (otherlv_10= 'tags:' ( (lv_tags_11_0= ruleTags ) )+ )* (otherlv_12= 'actuators:' ( (lv_actuators_13_0= ruleActuator ) )+ )* (otherlv_14= 'storages:' ( (lv_storageService_15_0= ruleStorageService ) )+ )* )
            // InternalMyDsl.g:1628:3: otherlv_0= 'structs:' ( (lv_structs_1_0= ruleStruct ) )* otherlv_2= 'resources:' otherlv_3= 'sensors:' (otherlv_4= 'periodicSensors:' ( (lv_periodicSensors_5_0= rulePeriodicSensors ) )+ )* (otherlv_6= 'eventDrivenSensors:' ( (lv_eventSensors_7_0= ruleEventSensors ) )+ )* (otherlv_8= 'requestBasedSensors:' ( (lv_requestSensors_9_0= ruleRequestSensors ) )+ )* (otherlv_10= 'tags:' ( (lv_tags_11_0= ruleTags ) )+ )* (otherlv_12= 'actuators:' ( (lv_actuators_13_0= ruleActuator ) )+ )* (otherlv_14= 'storages:' ( (lv_storageService_15_0= ruleStorageService ) )+ )*
            {
            otherlv_0=(Token)match(input,27,FOLLOW_43); 

            			newLeafNode(otherlv_0, grammarAccess.getVocSpecAccess().getStructsKeyword_0());
            		
            // InternalMyDsl.g:1632:3: ( (lv_structs_1_0= ruleStruct ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMyDsl.g:1633:4: (lv_structs_1_0= ruleStruct )
            	    {
            	    // InternalMyDsl.g:1633:4: (lv_structs_1_0= ruleStruct )
            	    // InternalMyDsl.g:1634:5: lv_structs_1_0= ruleStruct
            	    {

            	    					newCompositeNode(grammarAccess.getVocSpecAccess().getStructsStructParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_43);
            	    lv_structs_1_0=ruleStruct();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getVocSpecRule());
            	    					}
            	    					add(
            	    						current,
            	    						"structs",
            	    						lv_structs_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.Struct");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_2=(Token)match(input,16,FOLLOW_44); 

            			newLeafNode(otherlv_2, grammarAccess.getVocSpecAccess().getResourcesKeyword_2());
            		
            otherlv_3=(Token)match(input,41,FOLLOW_45); 

            			newLeafNode(otherlv_3, grammarAccess.getVocSpecAccess().getSensorsKeyword_3());
            		
            // InternalMyDsl.g:1659:3: (otherlv_4= 'periodicSensors:' ( (lv_periodicSensors_5_0= rulePeriodicSensors ) )+ )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==42) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalMyDsl.g:1660:4: otherlv_4= 'periodicSensors:' ( (lv_periodicSensors_5_0= rulePeriodicSensors ) )+
            	    {
            	    otherlv_4=(Token)match(input,42,FOLLOW_6); 

            	    				newLeafNode(otherlv_4, grammarAccess.getVocSpecAccess().getPeriodicSensorsKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:1664:4: ( (lv_periodicSensors_5_0= rulePeriodicSensors ) )+
            	    int cnt34=0;
            	    loop34:
            	    do {
            	        int alt34=2;
            	        int LA34_0 = input.LA(1);

            	        if ( (LA34_0==RULE_ID) ) {
            	            alt34=1;
            	        }


            	        switch (alt34) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:1665:5: (lv_periodicSensors_5_0= rulePeriodicSensors )
            	    	    {
            	    	    // InternalMyDsl.g:1665:5: (lv_periodicSensors_5_0= rulePeriodicSensors )
            	    	    // InternalMyDsl.g:1666:6: lv_periodicSensors_5_0= rulePeriodicSensors
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getVocSpecAccess().getPeriodicSensorsPeriodicSensorsParserRuleCall_4_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_46);
            	    	    lv_periodicSensors_5_0=rulePeriodicSensors();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getVocSpecRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"periodicSensors",
            	    	    							lv_periodicSensors_5_0,
            	    	    							"org.xtext.example.mydsl.MyDsl.PeriodicSensors");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt34 >= 1 ) break loop34;
            	                EarlyExitException eee =
            	                    new EarlyExitException(34, input);
            	                throw eee;
            	        }
            	        cnt34++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            // InternalMyDsl.g:1684:3: (otherlv_6= 'eventDrivenSensors:' ( (lv_eventSensors_7_0= ruleEventSensors ) )+ )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==43) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalMyDsl.g:1685:4: otherlv_6= 'eventDrivenSensors:' ( (lv_eventSensors_7_0= ruleEventSensors ) )+
            	    {
            	    otherlv_6=(Token)match(input,43,FOLLOW_6); 

            	    				newLeafNode(otherlv_6, grammarAccess.getVocSpecAccess().getEventDrivenSensorsKeyword_5_0());
            	    			
            	    // InternalMyDsl.g:1689:4: ( (lv_eventSensors_7_0= ruleEventSensors ) )+
            	    int cnt36=0;
            	    loop36:
            	    do {
            	        int alt36=2;
            	        int LA36_0 = input.LA(1);

            	        if ( (LA36_0==RULE_ID) ) {
            	            alt36=1;
            	        }


            	        switch (alt36) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:1690:5: (lv_eventSensors_7_0= ruleEventSensors )
            	    	    {
            	    	    // InternalMyDsl.g:1690:5: (lv_eventSensors_7_0= ruleEventSensors )
            	    	    // InternalMyDsl.g:1691:6: lv_eventSensors_7_0= ruleEventSensors
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getVocSpecAccess().getEventSensorsEventSensorsParserRuleCall_5_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_47);
            	    	    lv_eventSensors_7_0=ruleEventSensors();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getVocSpecRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"eventSensors",
            	    	    							lv_eventSensors_7_0,
            	    	    							"org.xtext.example.mydsl.MyDsl.EventSensors");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt36 >= 1 ) break loop36;
            	                EarlyExitException eee =
            	                    new EarlyExitException(36, input);
            	                throw eee;
            	        }
            	        cnt36++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            // InternalMyDsl.g:1709:3: (otherlv_8= 'requestBasedSensors:' ( (lv_requestSensors_9_0= ruleRequestSensors ) )+ )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==44) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalMyDsl.g:1710:4: otherlv_8= 'requestBasedSensors:' ( (lv_requestSensors_9_0= ruleRequestSensors ) )+
            	    {
            	    otherlv_8=(Token)match(input,44,FOLLOW_6); 

            	    				newLeafNode(otherlv_8, grammarAccess.getVocSpecAccess().getRequestBasedSensorsKeyword_6_0());
            	    			
            	    // InternalMyDsl.g:1714:4: ( (lv_requestSensors_9_0= ruleRequestSensors ) )+
            	    int cnt38=0;
            	    loop38:
            	    do {
            	        int alt38=2;
            	        int LA38_0 = input.LA(1);

            	        if ( (LA38_0==RULE_ID) ) {
            	            alt38=1;
            	        }


            	        switch (alt38) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:1715:5: (lv_requestSensors_9_0= ruleRequestSensors )
            	    	    {
            	    	    // InternalMyDsl.g:1715:5: (lv_requestSensors_9_0= ruleRequestSensors )
            	    	    // InternalMyDsl.g:1716:6: lv_requestSensors_9_0= ruleRequestSensors
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getVocSpecAccess().getRequestSensorsRequestSensorsParserRuleCall_6_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_48);
            	    	    lv_requestSensors_9_0=ruleRequestSensors();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getVocSpecRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"requestSensors",
            	    	    							lv_requestSensors_9_0,
            	    	    							"org.xtext.example.mydsl.MyDsl.RequestSensors");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt38 >= 1 ) break loop38;
            	                EarlyExitException eee =
            	                    new EarlyExitException(38, input);
            	                throw eee;
            	        }
            	        cnt38++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            // InternalMyDsl.g:1734:3: (otherlv_10= 'tags:' ( (lv_tags_11_0= ruleTags ) )+ )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==45) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalMyDsl.g:1735:4: otherlv_10= 'tags:' ( (lv_tags_11_0= ruleTags ) )+
            	    {
            	    otherlv_10=(Token)match(input,45,FOLLOW_6); 

            	    				newLeafNode(otherlv_10, grammarAccess.getVocSpecAccess().getTagsKeyword_7_0());
            	    			
            	    // InternalMyDsl.g:1739:4: ( (lv_tags_11_0= ruleTags ) )+
            	    int cnt40=0;
            	    loop40:
            	    do {
            	        int alt40=2;
            	        int LA40_0 = input.LA(1);

            	        if ( (LA40_0==RULE_ID) ) {
            	            alt40=1;
            	        }


            	        switch (alt40) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:1740:5: (lv_tags_11_0= ruleTags )
            	    	    {
            	    	    // InternalMyDsl.g:1740:5: (lv_tags_11_0= ruleTags )
            	    	    // InternalMyDsl.g:1741:6: lv_tags_11_0= ruleTags
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getVocSpecAccess().getTagsTagsParserRuleCall_7_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_49);
            	    	    lv_tags_11_0=ruleTags();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getVocSpecRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"tags",
            	    	    							lv_tags_11_0,
            	    	    							"org.xtext.example.mydsl.MyDsl.Tags");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt40 >= 1 ) break loop40;
            	                EarlyExitException eee =
            	                    new EarlyExitException(40, input);
            	                throw eee;
            	        }
            	        cnt40++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            // InternalMyDsl.g:1759:3: (otherlv_12= 'actuators:' ( (lv_actuators_13_0= ruleActuator ) )+ )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==46) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalMyDsl.g:1760:4: otherlv_12= 'actuators:' ( (lv_actuators_13_0= ruleActuator ) )+
            	    {
            	    otherlv_12=(Token)match(input,46,FOLLOW_6); 

            	    				newLeafNode(otherlv_12, grammarAccess.getVocSpecAccess().getActuatorsKeyword_8_0());
            	    			
            	    // InternalMyDsl.g:1764:4: ( (lv_actuators_13_0= ruleActuator ) )+
            	    int cnt42=0;
            	    loop42:
            	    do {
            	        int alt42=2;
            	        int LA42_0 = input.LA(1);

            	        if ( (LA42_0==RULE_ID) ) {
            	            alt42=1;
            	        }


            	        switch (alt42) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:1765:5: (lv_actuators_13_0= ruleActuator )
            	    	    {
            	    	    // InternalMyDsl.g:1765:5: (lv_actuators_13_0= ruleActuator )
            	    	    // InternalMyDsl.g:1766:6: lv_actuators_13_0= ruleActuator
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getVocSpecAccess().getActuatorsActuatorParserRuleCall_8_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_50);
            	    	    lv_actuators_13_0=ruleActuator();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getVocSpecRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"actuators",
            	    	    							lv_actuators_13_0,
            	    	    							"org.xtext.example.mydsl.MyDsl.Actuator");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt42 >= 1 ) break loop42;
            	                EarlyExitException eee =
            	                    new EarlyExitException(42, input);
            	                throw eee;
            	        }
            	        cnt42++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            // InternalMyDsl.g:1784:3: (otherlv_14= 'storages:' ( (lv_storageService_15_0= ruleStorageService ) )+ )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==47) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalMyDsl.g:1785:4: otherlv_14= 'storages:' ( (lv_storageService_15_0= ruleStorageService ) )+
            	    {
            	    otherlv_14=(Token)match(input,47,FOLLOW_6); 

            	    				newLeafNode(otherlv_14, grammarAccess.getVocSpecAccess().getStoragesKeyword_9_0());
            	    			
            	    // InternalMyDsl.g:1789:4: ( (lv_storageService_15_0= ruleStorageService ) )+
            	    int cnt44=0;
            	    loop44:
            	    do {
            	        int alt44=2;
            	        int LA44_0 = input.LA(1);

            	        if ( (LA44_0==RULE_ID) ) {
            	            alt44=1;
            	        }


            	        switch (alt44) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:1790:5: (lv_storageService_15_0= ruleStorageService )
            	    	    {
            	    	    // InternalMyDsl.g:1790:5: (lv_storageService_15_0= ruleStorageService )
            	    	    // InternalMyDsl.g:1791:6: lv_storageService_15_0= ruleStorageService
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getVocSpecAccess().getStorageServiceStorageServiceParserRuleCall_9_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_51);
            	    	    lv_storageService_15_0=ruleStorageService();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getVocSpecRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"storageService",
            	    	    							lv_storageService_15_0,
            	    	    							"org.xtext.example.mydsl.MyDsl.StorageService");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt44 >= 1 ) break loop44;
            	                EarlyExitException eee =
            	                    new EarlyExitException(44, input);
            	                throw eee;
            	        }
            	        cnt44++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // $ANTLR end "ruleVocSpec"


    // $ANTLR start "entryRuleStruct"
    // InternalMyDsl.g:1813:1: entryRuleStruct returns [EObject current=null] : iv_ruleStruct= ruleStruct EOF ;
    public final EObject entryRuleStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStruct = null;


        try {
            // InternalMyDsl.g:1813:47: (iv_ruleStruct= ruleStruct EOF )
            // InternalMyDsl.g:1814:2: iv_ruleStruct= ruleStruct EOF
            {
             newCompositeNode(grammarAccess.getStructRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStruct=ruleStruct();

            state._fsp--;

             current =iv_ruleStruct; 
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
    // $ANTLR end "entryRuleStruct"


    // $ANTLR start "ruleStruct"
    // InternalMyDsl.g:1820:1: ruleStruct returns [EObject current=null] : ( ( (lv_name_0_0= ruleStructEntityName ) ) ( (lv_fields_1_0= ruleField ) )+ ) ;
    public final EObject ruleStruct() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;

        EObject lv_fields_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1826:2: ( ( ( (lv_name_0_0= ruleStructEntityName ) ) ( (lv_fields_1_0= ruleField ) )+ ) )
            // InternalMyDsl.g:1827:2: ( ( (lv_name_0_0= ruleStructEntityName ) ) ( (lv_fields_1_0= ruleField ) )+ )
            {
            // InternalMyDsl.g:1827:2: ( ( (lv_name_0_0= ruleStructEntityName ) ) ( (lv_fields_1_0= ruleField ) )+ )
            // InternalMyDsl.g:1828:3: ( (lv_name_0_0= ruleStructEntityName ) ) ( (lv_fields_1_0= ruleField ) )+
            {
            // InternalMyDsl.g:1828:3: ( (lv_name_0_0= ruleStructEntityName ) )
            // InternalMyDsl.g:1829:4: (lv_name_0_0= ruleStructEntityName )
            {
            // InternalMyDsl.g:1829:4: (lv_name_0_0= ruleStructEntityName )
            // InternalMyDsl.g:1830:5: lv_name_0_0= ruleStructEntityName
            {

            					newCompositeNode(grammarAccess.getStructAccess().getNameStructEntityNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_0_0=ruleStructEntityName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStructRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.MyDsl.StructEntityName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1847:3: ( (lv_fields_1_0= ruleField ) )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_ID) ) {
                    int LA46_2 = input.LA(2);

                    if ( (LA46_2==12) ) {
                        alt46=1;
                    }


                }


                switch (alt46) {
            	case 1 :
            	    // InternalMyDsl.g:1848:4: (lv_fields_1_0= ruleField )
            	    {
            	    // InternalMyDsl.g:1848:4: (lv_fields_1_0= ruleField )
            	    // InternalMyDsl.g:1849:5: lv_fields_1_0= ruleField
            	    {

            	    					newCompositeNode(grammarAccess.getStructAccess().getFieldsFieldParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_fields_1_0=ruleField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStructRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fields",
            	    						lv_fields_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.Field");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
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
    // $ANTLR end "ruleStruct"


    // $ANTLR start "entryRuleField"
    // InternalMyDsl.g:1870:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalMyDsl.g:1870:46: (iv_ruleField= ruleField EOF )
            // InternalMyDsl.g:1871:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalMyDsl.g:1877:1: ruleField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) otherlv_3= ';' ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1883:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) otherlv_3= ';' ) )
            // InternalMyDsl.g:1884:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) otherlv_3= ';' )
            {
            // InternalMyDsl.g:1884:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) otherlv_3= ';' )
            // InternalMyDsl.g:1885:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) otherlv_3= ';'
            {
            // InternalMyDsl.g:1885:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:1886:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:1886:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:1887:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:1907:3: ( (lv_type_2_0= ruleType ) )
            // InternalMyDsl.g:1908:4: (lv_type_2_0= ruleType )
            {
            // InternalMyDsl.g:1908:4: (lv_type_2_0= ruleType )
            // InternalMyDsl.g:1909:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getFieldAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldRule());
            					}
            					add(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.example.mydsl.MyDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRulePeriodicSensors"
    // InternalMyDsl.g:1934:1: entryRulePeriodicSensors returns [EObject current=null] : iv_rulePeriodicSensors= rulePeriodicSensors EOF ;
    public final EObject entryRulePeriodicSensors() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePeriodicSensors = null;


        try {
            // InternalMyDsl.g:1934:56: (iv_rulePeriodicSensors= rulePeriodicSensors EOF )
            // InternalMyDsl.g:1935:2: iv_rulePeriodicSensors= rulePeriodicSensors EOF
            {
             newCompositeNode(grammarAccess.getPeriodicSensorsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePeriodicSensors=rulePeriodicSensors();

            state._fsp--;

             current =iv_rulePeriodicSensors; 
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
    // $ANTLR end "entryRulePeriodicSensors"


    // $ANTLR start "rulePeriodicSensors"
    // InternalMyDsl.g:1941:1: rulePeriodicSensors returns [EObject current=null] : ( ( (lv_sensorName_0_0= ruleEntityName ) ) ( (lv_generateInfo_1_0= ruleGenerate ) )+ ( (lv_sampelingDef_2_0= ruleSampelingDef ) ) ) ;
    public final EObject rulePeriodicSensors() throws RecognitionException {
        EObject current = null;

        EObject lv_sensorName_0_0 = null;

        EObject lv_generateInfo_1_0 = null;

        AntlrDatatypeRuleToken lv_sampelingDef_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1947:2: ( ( ( (lv_sensorName_0_0= ruleEntityName ) ) ( (lv_generateInfo_1_0= ruleGenerate ) )+ ( (lv_sampelingDef_2_0= ruleSampelingDef ) ) ) )
            // InternalMyDsl.g:1948:2: ( ( (lv_sensorName_0_0= ruleEntityName ) ) ( (lv_generateInfo_1_0= ruleGenerate ) )+ ( (lv_sampelingDef_2_0= ruleSampelingDef ) ) )
            {
            // InternalMyDsl.g:1948:2: ( ( (lv_sensorName_0_0= ruleEntityName ) ) ( (lv_generateInfo_1_0= ruleGenerate ) )+ ( (lv_sampelingDef_2_0= ruleSampelingDef ) ) )
            // InternalMyDsl.g:1949:3: ( (lv_sensorName_0_0= ruleEntityName ) ) ( (lv_generateInfo_1_0= ruleGenerate ) )+ ( (lv_sampelingDef_2_0= ruleSampelingDef ) )
            {
            // InternalMyDsl.g:1949:3: ( (lv_sensorName_0_0= ruleEntityName ) )
            // InternalMyDsl.g:1950:4: (lv_sensorName_0_0= ruleEntityName )
            {
            // InternalMyDsl.g:1950:4: (lv_sensorName_0_0= ruleEntityName )
            // InternalMyDsl.g:1951:5: lv_sensorName_0_0= ruleEntityName
            {

            					newCompositeNode(grammarAccess.getPeriodicSensorsAccess().getSensorNameEntityNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_53);
            lv_sensorName_0_0=ruleEntityName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPeriodicSensorsRule());
            					}
            					set(
            						current,
            						"sensorName",
            						lv_sensorName_0_0,
            						"org.xtext.example.mydsl.MyDsl.EntityName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1968:3: ( (lv_generateInfo_1_0= ruleGenerate ) )+
            int cnt47=0;
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==55) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalMyDsl.g:1969:4: (lv_generateInfo_1_0= ruleGenerate )
            	    {
            	    // InternalMyDsl.g:1969:4: (lv_generateInfo_1_0= ruleGenerate )
            	    // InternalMyDsl.g:1970:5: lv_generateInfo_1_0= ruleGenerate
            	    {

            	    					newCompositeNode(grammarAccess.getPeriodicSensorsAccess().getGenerateInfoGenerateParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_54);
            	    lv_generateInfo_1_0=ruleGenerate();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPeriodicSensorsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"generateInfo",
            	    						lv_generateInfo_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.Generate");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt47 >= 1 ) break loop47;
                        EarlyExitException eee =
                            new EarlyExitException(47, input);
                        throw eee;
                }
                cnt47++;
            } while (true);

            // InternalMyDsl.g:1987:3: ( (lv_sampelingDef_2_0= ruleSampelingDef ) )
            // InternalMyDsl.g:1988:4: (lv_sampelingDef_2_0= ruleSampelingDef )
            {
            // InternalMyDsl.g:1988:4: (lv_sampelingDef_2_0= ruleSampelingDef )
            // InternalMyDsl.g:1989:5: lv_sampelingDef_2_0= ruleSampelingDef
            {

            					newCompositeNode(grammarAccess.getPeriodicSensorsAccess().getSampelingDefSampelingDefParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_sampelingDef_2_0=ruleSampelingDef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPeriodicSensorsRule());
            					}
            					set(
            						current,
            						"sampelingDef",
            						lv_sampelingDef_2_0,
            						"org.xtext.example.mydsl.MyDsl.SampelingDef");
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
    // $ANTLR end "rulePeriodicSensors"


    // $ANTLR start "entryRuleSampelingDef"
    // InternalMyDsl.g:2010:1: entryRuleSampelingDef returns [String current=null] : iv_ruleSampelingDef= ruleSampelingDef EOF ;
    public final String entryRuleSampelingDef() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSampelingDef = null;


        try {
            // InternalMyDsl.g:2010:52: (iv_ruleSampelingDef= ruleSampelingDef EOF )
            // InternalMyDsl.g:2011:2: iv_ruleSampelingDef= ruleSampelingDef EOF
            {
             newCompositeNode(grammarAccess.getSampelingDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSampelingDef=ruleSampelingDef();

            state._fsp--;

             current =iv_ruleSampelingDef.getText(); 
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
    // $ANTLR end "entryRuleSampelingDef"


    // $ANTLR start "ruleSampelingDef"
    // InternalMyDsl.g:2017:1: ruleSampelingDef returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'sample' kw= 'period' this_INT_2= RULE_INT kw= 'for' this_INT_4= RULE_INT kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleSampelingDef() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2023:2: ( (kw= 'sample' kw= 'period' this_INT_2= RULE_INT kw= 'for' this_INT_4= RULE_INT kw= ';' ) )
            // InternalMyDsl.g:2024:2: (kw= 'sample' kw= 'period' this_INT_2= RULE_INT kw= 'for' this_INT_4= RULE_INT kw= ';' )
            {
            // InternalMyDsl.g:2024:2: (kw= 'sample' kw= 'period' this_INT_2= RULE_INT kw= 'for' this_INT_4= RULE_INT kw= ';' )
            // InternalMyDsl.g:2025:3: kw= 'sample' kw= 'period' this_INT_2= RULE_INT kw= 'for' this_INT_4= RULE_INT kw= ';'
            {
            kw=(Token)match(input,48,FOLLOW_55); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getSampelingDefAccess().getSampleKeyword_0());
            		
            kw=(Token)match(input,49,FOLLOW_16); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getSampelingDefAccess().getPeriodKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_56); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getSampelingDefAccess().getINTTerminalRuleCall_2());
            		
            kw=(Token)match(input,50,FOLLOW_16); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getSampelingDefAccess().getForKeyword_3());
            		
            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_7); 

            			current.merge(this_INT_4);
            		

            			newLeafNode(this_INT_4, grammarAccess.getSampelingDefAccess().getINTTerminalRuleCall_4());
            		
            kw=(Token)match(input,14,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getSampelingDefAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleSampelingDef"


    // $ANTLR start "entryRuleEventSensors"
    // InternalMyDsl.g:2063:1: entryRuleEventSensors returns [EObject current=null] : iv_ruleEventSensors= ruleEventSensors EOF ;
    public final EObject entryRuleEventSensors() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventSensors = null;


        try {
            // InternalMyDsl.g:2063:53: (iv_ruleEventSensors= ruleEventSensors EOF )
            // InternalMyDsl.g:2064:2: iv_ruleEventSensors= ruleEventSensors EOF
            {
             newCompositeNode(grammarAccess.getEventSensorsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventSensors=ruleEventSensors();

            state._fsp--;

             current =iv_ruleEventSensors; 
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
    // $ANTLR end "entryRuleEventSensors"


    // $ANTLR start "ruleEventSensors"
    // InternalMyDsl.g:2070:1: ruleEventSensors returns [EObject current=null] : ( ( (lv_sensorName_0_0= ruleEntityName ) ) ( (lv_generateInfo_1_0= ruleGenerate ) )+ ( (lv_onConditionDef_2_0= ruleOnConditionDef ) ) ) ;
    public final EObject ruleEventSensors() throws RecognitionException {
        EObject current = null;

        EObject lv_sensorName_0_0 = null;

        EObject lv_generateInfo_1_0 = null;

        EObject lv_onConditionDef_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2076:2: ( ( ( (lv_sensorName_0_0= ruleEntityName ) ) ( (lv_generateInfo_1_0= ruleGenerate ) )+ ( (lv_onConditionDef_2_0= ruleOnConditionDef ) ) ) )
            // InternalMyDsl.g:2077:2: ( ( (lv_sensorName_0_0= ruleEntityName ) ) ( (lv_generateInfo_1_0= ruleGenerate ) )+ ( (lv_onConditionDef_2_0= ruleOnConditionDef ) ) )
            {
            // InternalMyDsl.g:2077:2: ( ( (lv_sensorName_0_0= ruleEntityName ) ) ( (lv_generateInfo_1_0= ruleGenerate ) )+ ( (lv_onConditionDef_2_0= ruleOnConditionDef ) ) )
            // InternalMyDsl.g:2078:3: ( (lv_sensorName_0_0= ruleEntityName ) ) ( (lv_generateInfo_1_0= ruleGenerate ) )+ ( (lv_onConditionDef_2_0= ruleOnConditionDef ) )
            {
            // InternalMyDsl.g:2078:3: ( (lv_sensorName_0_0= ruleEntityName ) )
            // InternalMyDsl.g:2079:4: (lv_sensorName_0_0= ruleEntityName )
            {
            // InternalMyDsl.g:2079:4: (lv_sensorName_0_0= ruleEntityName )
            // InternalMyDsl.g:2080:5: lv_sensorName_0_0= ruleEntityName
            {

            					newCompositeNode(grammarAccess.getEventSensorsAccess().getSensorNameEntityNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_53);
            lv_sensorName_0_0=ruleEntityName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventSensorsRule());
            					}
            					set(
            						current,
            						"sensorName",
            						lv_sensorName_0_0,
            						"org.xtext.example.mydsl.MyDsl.EntityName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2097:3: ( (lv_generateInfo_1_0= ruleGenerate ) )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==55) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalMyDsl.g:2098:4: (lv_generateInfo_1_0= ruleGenerate )
            	    {
            	    // InternalMyDsl.g:2098:4: (lv_generateInfo_1_0= ruleGenerate )
            	    // InternalMyDsl.g:2099:5: lv_generateInfo_1_0= ruleGenerate
            	    {

            	    					newCompositeNode(grammarAccess.getEventSensorsAccess().getGenerateInfoGenerateParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_57);
            	    lv_generateInfo_1_0=ruleGenerate();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEventSensorsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"generateInfo",
            	    						lv_generateInfo_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.Generate");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt48 >= 1 ) break loop48;
                        EarlyExitException eee =
                            new EarlyExitException(48, input);
                        throw eee;
                }
                cnt48++;
            } while (true);

            // InternalMyDsl.g:2116:3: ( (lv_onConditionDef_2_0= ruleOnConditionDef ) )
            // InternalMyDsl.g:2117:4: (lv_onConditionDef_2_0= ruleOnConditionDef )
            {
            // InternalMyDsl.g:2117:4: (lv_onConditionDef_2_0= ruleOnConditionDef )
            // InternalMyDsl.g:2118:5: lv_onConditionDef_2_0= ruleOnConditionDef
            {

            					newCompositeNode(grammarAccess.getEventSensorsAccess().getOnConditionDefOnConditionDefParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_onConditionDef_2_0=ruleOnConditionDef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventSensorsRule());
            					}
            					set(
            						current,
            						"onConditionDef",
            						lv_onConditionDef_2_0,
            						"org.xtext.example.mydsl.MyDsl.OnConditionDef");
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
    // $ANTLR end "ruleEventSensors"


    // $ANTLR start "entryRuleOnConditionDef"
    // InternalMyDsl.g:2139:1: entryRuleOnConditionDef returns [EObject current=null] : iv_ruleOnConditionDef= ruleOnConditionDef EOF ;
    public final EObject entryRuleOnConditionDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnConditionDef = null;


        try {
            // InternalMyDsl.g:2139:55: (iv_ruleOnConditionDef= ruleOnConditionDef EOF )
            // InternalMyDsl.g:2140:2: iv_ruleOnConditionDef= ruleOnConditionDef EOF
            {
             newCompositeNode(grammarAccess.getOnConditionDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOnConditionDef=ruleOnConditionDef();

            state._fsp--;

             current =iv_ruleOnConditionDef; 
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
    // $ANTLR end "entryRuleOnConditionDef"


    // $ANTLR start "ruleOnConditionDef"
    // InternalMyDsl.g:2146:1: ruleOnConditionDef returns [EObject current=null] : (otherlv_0= 'onCondition' ( (lv_eventConditions_1_0= ruleEventConditions ) ) otherlv_2= ';' ) ;
    public final EObject ruleOnConditionDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_eventConditions_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2152:2: ( (otherlv_0= 'onCondition' ( (lv_eventConditions_1_0= ruleEventConditions ) ) otherlv_2= ';' ) )
            // InternalMyDsl.g:2153:2: (otherlv_0= 'onCondition' ( (lv_eventConditions_1_0= ruleEventConditions ) ) otherlv_2= ';' )
            {
            // InternalMyDsl.g:2153:2: (otherlv_0= 'onCondition' ( (lv_eventConditions_1_0= ruleEventConditions ) ) otherlv_2= ';' )
            // InternalMyDsl.g:2154:3: otherlv_0= 'onCondition' ( (lv_eventConditions_1_0= ruleEventConditions ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getOnConditionDefAccess().getOnConditionKeyword_0());
            		
            // InternalMyDsl.g:2158:3: ( (lv_eventConditions_1_0= ruleEventConditions ) )
            // InternalMyDsl.g:2159:4: (lv_eventConditions_1_0= ruleEventConditions )
            {
            // InternalMyDsl.g:2159:4: (lv_eventConditions_1_0= ruleEventConditions )
            // InternalMyDsl.g:2160:5: lv_eventConditions_1_0= ruleEventConditions
            {

            					newCompositeNode(grammarAccess.getOnConditionDefAccess().getEventConditionsEventConditionsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_eventConditions_1_0=ruleEventConditions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOnConditionDefRule());
            					}
            					add(
            						current,
            						"eventConditions",
            						lv_eventConditions_1_0,
            						"org.xtext.example.mydsl.MyDsl.EventConditions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getOnConditionDefAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleOnConditionDef"


    // $ANTLR start "entryRuleRequestSensors"
    // InternalMyDsl.g:2185:1: entryRuleRequestSensors returns [EObject current=null] : iv_ruleRequestSensors= ruleRequestSensors EOF ;
    public final EObject entryRuleRequestSensors() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequestSensors = null;


        try {
            // InternalMyDsl.g:2185:55: (iv_ruleRequestSensors= ruleRequestSensors EOF )
            // InternalMyDsl.g:2186:2: iv_ruleRequestSensors= ruleRequestSensors EOF
            {
             newCompositeNode(grammarAccess.getRequestSensorsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequestSensors=ruleRequestSensors();

            state._fsp--;

             current =iv_ruleRequestSensors; 
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
    // $ANTLR end "entryRuleRequestSensors"


    // $ANTLR start "ruleRequestSensors"
    // InternalMyDsl.g:2192:1: ruleRequestSensors returns [EObject current=null] : ( ( (lv_sensorName_0_0= ruleEntityName ) ) ( (lv_dataAccess_1_0= ruleDataAccessForRequestSensors ) )+ ) ;
    public final EObject ruleRequestSensors() throws RecognitionException {
        EObject current = null;

        EObject lv_sensorName_0_0 = null;

        EObject lv_dataAccess_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2198:2: ( ( ( (lv_sensorName_0_0= ruleEntityName ) ) ( (lv_dataAccess_1_0= ruleDataAccessForRequestSensors ) )+ ) )
            // InternalMyDsl.g:2199:2: ( ( (lv_sensorName_0_0= ruleEntityName ) ) ( (lv_dataAccess_1_0= ruleDataAccessForRequestSensors ) )+ )
            {
            // InternalMyDsl.g:2199:2: ( ( (lv_sensorName_0_0= ruleEntityName ) ) ( (lv_dataAccess_1_0= ruleDataAccessForRequestSensors ) )+ )
            // InternalMyDsl.g:2200:3: ( (lv_sensorName_0_0= ruleEntityName ) ) ( (lv_dataAccess_1_0= ruleDataAccessForRequestSensors ) )+
            {
            // InternalMyDsl.g:2200:3: ( (lv_sensorName_0_0= ruleEntityName ) )
            // InternalMyDsl.g:2201:4: (lv_sensorName_0_0= ruleEntityName )
            {
            // InternalMyDsl.g:2201:4: (lv_sensorName_0_0= ruleEntityName )
            // InternalMyDsl.g:2202:5: lv_sensorName_0_0= ruleEntityName
            {

            					newCompositeNode(grammarAccess.getRequestSensorsAccess().getSensorNameEntityNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_53);
            lv_sensorName_0_0=ruleEntityName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequestSensorsRule());
            					}
            					set(
            						current,
            						"sensorName",
            						lv_sensorName_0_0,
            						"org.xtext.example.mydsl.MyDsl.EntityName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2219:3: ( (lv_dataAccess_1_0= ruleDataAccessForRequestSensors ) )+
            int cnt49=0;
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==55) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalMyDsl.g:2220:4: (lv_dataAccess_1_0= ruleDataAccessForRequestSensors )
            	    {
            	    // InternalMyDsl.g:2220:4: (lv_dataAccess_1_0= ruleDataAccessForRequestSensors )
            	    // InternalMyDsl.g:2221:5: lv_dataAccess_1_0= ruleDataAccessForRequestSensors
            	    {

            	    					newCompositeNode(grammarAccess.getRequestSensorsAccess().getDataAccessDataAccessForRequestSensorsParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_34);
            	    lv_dataAccess_1_0=ruleDataAccessForRequestSensors();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRequestSensorsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dataAccess",
            	    						lv_dataAccess_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.DataAccessForRequestSensors");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt49 >= 1 ) break loop49;
                        EarlyExitException eee =
                            new EarlyExitException(49, input);
                        throw eee;
                }
                cnt49++;
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
    // $ANTLR end "ruleRequestSensors"


    // $ANTLR start "entryRuleTags"
    // InternalMyDsl.g:2242:1: entryRuleTags returns [EObject current=null] : iv_ruleTags= ruleTags EOF ;
    public final EObject entryRuleTags() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTags = null;


        try {
            // InternalMyDsl.g:2242:45: (iv_ruleTags= ruleTags EOF )
            // InternalMyDsl.g:2243:2: iv_ruleTags= ruleTags EOF
            {
             newCompositeNode(grammarAccess.getTagsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTags=ruleTags();

            state._fsp--;

             current =iv_ruleTags; 
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
    // $ANTLR end "entryRuleTags"


    // $ANTLR start "ruleTags"
    // InternalMyDsl.g:2249:1: ruleTags returns [EObject current=null] : ( ( (lv_sensorName_0_0= ruleEntityName ) ) ( (lv_generateInfo_1_0= ruleGenerate ) )+ ) ;
    public final EObject ruleTags() throws RecognitionException {
        EObject current = null;

        EObject lv_sensorName_0_0 = null;

        EObject lv_generateInfo_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2255:2: ( ( ( (lv_sensorName_0_0= ruleEntityName ) ) ( (lv_generateInfo_1_0= ruleGenerate ) )+ ) )
            // InternalMyDsl.g:2256:2: ( ( (lv_sensorName_0_0= ruleEntityName ) ) ( (lv_generateInfo_1_0= ruleGenerate ) )+ )
            {
            // InternalMyDsl.g:2256:2: ( ( (lv_sensorName_0_0= ruleEntityName ) ) ( (lv_generateInfo_1_0= ruleGenerate ) )+ )
            // InternalMyDsl.g:2257:3: ( (lv_sensorName_0_0= ruleEntityName ) ) ( (lv_generateInfo_1_0= ruleGenerate ) )+
            {
            // InternalMyDsl.g:2257:3: ( (lv_sensorName_0_0= ruleEntityName ) )
            // InternalMyDsl.g:2258:4: (lv_sensorName_0_0= ruleEntityName )
            {
            // InternalMyDsl.g:2258:4: (lv_sensorName_0_0= ruleEntityName )
            // InternalMyDsl.g:2259:5: lv_sensorName_0_0= ruleEntityName
            {

            					newCompositeNode(grammarAccess.getTagsAccess().getSensorNameEntityNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_53);
            lv_sensorName_0_0=ruleEntityName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTagsRule());
            					}
            					set(
            						current,
            						"sensorName",
            						lv_sensorName_0_0,
            						"org.xtext.example.mydsl.MyDsl.EntityName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2276:3: ( (lv_generateInfo_1_0= ruleGenerate ) )+
            int cnt50=0;
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==55) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalMyDsl.g:2277:4: (lv_generateInfo_1_0= ruleGenerate )
            	    {
            	    // InternalMyDsl.g:2277:4: (lv_generateInfo_1_0= ruleGenerate )
            	    // InternalMyDsl.g:2278:5: lv_generateInfo_1_0= ruleGenerate
            	    {

            	    					newCompositeNode(grammarAccess.getTagsAccess().getGenerateInfoGenerateParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_34);
            	    lv_generateInfo_1_0=ruleGenerate();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTagsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"generateInfo",
            	    						lv_generateInfo_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.Generate");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt50 >= 1 ) break loop50;
                        EarlyExitException eee =
                            new EarlyExitException(50, input);
                        throw eee;
                }
                cnt50++;
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
    // $ANTLR end "ruleTags"


    // $ANTLR start "entryRuleEventConditions"
    // InternalMyDsl.g:2299:1: entryRuleEventConditions returns [EObject current=null] : iv_ruleEventConditions= ruleEventConditions EOF ;
    public final EObject entryRuleEventConditions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventConditions = null;


        try {
            // InternalMyDsl.g:2299:56: (iv_ruleEventConditions= ruleEventConditions EOF )
            // InternalMyDsl.g:2300:2: iv_ruleEventConditions= ruleEventConditions EOF
            {
             newCompositeNode(grammarAccess.getEventConditionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventConditions=ruleEventConditions();

            state._fsp--;

             current =iv_ruleEventConditions; 
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
    // $ANTLR end "entryRuleEventConditions"


    // $ANTLR start "ruleEventConditions"
    // InternalMyDsl.g:2306:1: ruleEventConditions returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '>' | otherlv_2= '<' | otherlv_3= '=' )* ( (lv_intValue_4_0= RULE_INT ) ) ( (lv_nameUnit_5_0= ruleUnit ) ) (otherlv_6= ',' ( (lv_eventConditions_7_0= ruleEventConditions ) ) )? ) ;
    public final EObject ruleEventConditions() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_intValue_4_0=null;
        Token otherlv_6=null;
        EObject lv_nameUnit_5_0 = null;

        EObject lv_eventConditions_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2312:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '>' | otherlv_2= '<' | otherlv_3= '=' )* ( (lv_intValue_4_0= RULE_INT ) ) ( (lv_nameUnit_5_0= ruleUnit ) ) (otherlv_6= ',' ( (lv_eventConditions_7_0= ruleEventConditions ) ) )? ) )
            // InternalMyDsl.g:2313:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '>' | otherlv_2= '<' | otherlv_3= '=' )* ( (lv_intValue_4_0= RULE_INT ) ) ( (lv_nameUnit_5_0= ruleUnit ) ) (otherlv_6= ',' ( (lv_eventConditions_7_0= ruleEventConditions ) ) )? )
            {
            // InternalMyDsl.g:2313:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '>' | otherlv_2= '<' | otherlv_3= '=' )* ( (lv_intValue_4_0= RULE_INT ) ) ( (lv_nameUnit_5_0= ruleUnit ) ) (otherlv_6= ',' ( (lv_eventConditions_7_0= ruleEventConditions ) ) )? )
            // InternalMyDsl.g:2314:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '>' | otherlv_2= '<' | otherlv_3= '=' )* ( (lv_intValue_4_0= RULE_INT ) ) ( (lv_nameUnit_5_0= ruleUnit ) ) (otherlv_6= ',' ( (lv_eventConditions_7_0= ruleEventConditions ) ) )?
            {
            // InternalMyDsl.g:2314:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:2315:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:2315:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:2316:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_58); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEventConditionsAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventConditionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:2332:3: (otherlv_1= '>' | otherlv_2= '<' | otherlv_3= '=' )*
            loop51:
            do {
                int alt51=4;
                switch ( input.LA(1) ) {
                case 52:
                    {
                    alt51=1;
                    }
                    break;
                case 53:
                    {
                    alt51=2;
                    }
                    break;
                case 54:
                    {
                    alt51=3;
                    }
                    break;

                }

                switch (alt51) {
            	case 1 :
            	    // InternalMyDsl.g:2333:4: otherlv_1= '>'
            	    {
            	    otherlv_1=(Token)match(input,52,FOLLOW_58); 

            	    				newLeafNode(otherlv_1, grammarAccess.getEventConditionsAccess().getGreaterThanSignKeyword_1_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:2338:4: otherlv_2= '<'
            	    {
            	    otherlv_2=(Token)match(input,53,FOLLOW_58); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEventConditionsAccess().getLessThanSignKeyword_1_1());
            	    			

            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:2343:4: otherlv_3= '='
            	    {
            	    otherlv_3=(Token)match(input,54,FOLLOW_58); 

            	    				newLeafNode(otherlv_3, grammarAccess.getEventConditionsAccess().getEqualsSignKeyword_1_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            // InternalMyDsl.g:2348:3: ( (lv_intValue_4_0= RULE_INT ) )
            // InternalMyDsl.g:2349:4: (lv_intValue_4_0= RULE_INT )
            {
            // InternalMyDsl.g:2349:4: (lv_intValue_4_0= RULE_INT )
            // InternalMyDsl.g:2350:5: lv_intValue_4_0= RULE_INT
            {
            lv_intValue_4_0=(Token)match(input,RULE_INT,FOLLOW_59); 

            					newLeafNode(lv_intValue_4_0, grammarAccess.getEventConditionsAccess().getIntValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventConditionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"intValue",
            						lv_intValue_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalMyDsl.g:2366:3: ( (lv_nameUnit_5_0= ruleUnit ) )
            // InternalMyDsl.g:2367:4: (lv_nameUnit_5_0= ruleUnit )
            {
            // InternalMyDsl.g:2367:4: (lv_nameUnit_5_0= ruleUnit )
            // InternalMyDsl.g:2368:5: lv_nameUnit_5_0= ruleUnit
            {

            					newCompositeNode(grammarAccess.getEventConditionsAccess().getNameUnitUnitParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_nameUnit_5_0=ruleUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventConditionsRule());
            					}
            					set(
            						current,
            						"nameUnit",
            						lv_nameUnit_5_0,
            						"org.xtext.example.mydsl.MyDsl.Unit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2385:3: (otherlv_6= ',' ( (lv_eventConditions_7_0= ruleEventConditions ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==26) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMyDsl.g:2386:4: otherlv_6= ',' ( (lv_eventConditions_7_0= ruleEventConditions ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getEventConditionsAccess().getCommaKeyword_4_0());
                    			
                    // InternalMyDsl.g:2390:4: ( (lv_eventConditions_7_0= ruleEventConditions ) )
                    // InternalMyDsl.g:2391:5: (lv_eventConditions_7_0= ruleEventConditions )
                    {
                    // InternalMyDsl.g:2391:5: (lv_eventConditions_7_0= ruleEventConditions )
                    // InternalMyDsl.g:2392:6: lv_eventConditions_7_0= ruleEventConditions
                    {

                    						newCompositeNode(grammarAccess.getEventConditionsAccess().getEventConditionsEventConditionsParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_eventConditions_7_0=ruleEventConditions();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventConditionsRule());
                    						}
                    						add(
                    							current,
                    							"eventConditions",
                    							lv_eventConditions_7_0,
                    							"org.xtext.example.mydsl.MyDsl.EventConditions");
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
    // $ANTLR end "ruleEventConditions"


    // $ANTLR start "entryRuleDeviceEntityName"
    // InternalMyDsl.g:2414:1: entryRuleDeviceEntityName returns [EObject current=null] : iv_ruleDeviceEntityName= ruleDeviceEntityName EOF ;
    public final EObject entryRuleDeviceEntityName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceEntityName = null;


        try {
            // InternalMyDsl.g:2414:57: (iv_ruleDeviceEntityName= ruleDeviceEntityName EOF )
            // InternalMyDsl.g:2415:2: iv_ruleDeviceEntityName= ruleDeviceEntityName EOF
            {
             newCompositeNode(grammarAccess.getDeviceEntityNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeviceEntityName=ruleDeviceEntityName();

            state._fsp--;

             current =iv_ruleDeviceEntityName; 
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
    // $ANTLR end "entryRuleDeviceEntityName"


    // $ANTLR start "ruleDeviceEntityName"
    // InternalMyDsl.g:2421:1: ruleDeviceEntityName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDeviceEntityName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2427:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:2428:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:2428:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:2429:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:2429:3: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:2430:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getDeviceEntityNameAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDeviceEntityNameRule());
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
    // $ANTLR end "ruleDeviceEntityName"


    // $ANTLR start "entryRuleStructEntityName"
    // InternalMyDsl.g:2449:1: entryRuleStructEntityName returns [EObject current=null] : iv_ruleStructEntityName= ruleStructEntityName EOF ;
    public final EObject entryRuleStructEntityName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructEntityName = null;


        try {
            // InternalMyDsl.g:2449:57: (iv_ruleStructEntityName= ruleStructEntityName EOF )
            // InternalMyDsl.g:2450:2: iv_ruleStructEntityName= ruleStructEntityName EOF
            {
             newCompositeNode(grammarAccess.getStructEntityNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStructEntityName=ruleStructEntityName();

            state._fsp--;

             current =iv_ruleStructEntityName; 
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
    // $ANTLR end "entryRuleStructEntityName"


    // $ANTLR start "ruleStructEntityName"
    // InternalMyDsl.g:2456:1: ruleStructEntityName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleStructEntityName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2462:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:2463:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:2463:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:2464:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:2464:3: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:2465:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getStructEntityNameAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStructEntityNameRule());
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
    // $ANTLR end "ruleStructEntityName"


    // $ANTLR start "entryRuleEntityName"
    // InternalMyDsl.g:2484:1: entryRuleEntityName returns [EObject current=null] : iv_ruleEntityName= ruleEntityName EOF ;
    public final EObject entryRuleEntityName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityName = null;


        try {
            // InternalMyDsl.g:2484:51: (iv_ruleEntityName= ruleEntityName EOF )
            // InternalMyDsl.g:2485:2: iv_ruleEntityName= ruleEntityName EOF
            {
             newCompositeNode(grammarAccess.getEntityNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityName=ruleEntityName();

            state._fsp--;

             current =iv_ruleEntityName; 
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
    // $ANTLR end "entryRuleEntityName"


    // $ANTLR start "ruleEntityName"
    // InternalMyDsl.g:2491:1: ruleEntityName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEntityName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2497:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:2498:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:2498:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:2499:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:2499:3: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:2500:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getEntityNameAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEntityNameRule());
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
    // $ANTLR end "ruleEntityName"


    // $ANTLR start "entryRuleGenerate"
    // InternalMyDsl.g:2519:1: entryRuleGenerate returns [EObject current=null] : iv_ruleGenerate= ruleGenerate EOF ;
    public final EObject entryRuleGenerate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenerate = null;


        try {
            // InternalMyDsl.g:2519:49: (iv_ruleGenerate= ruleGenerate EOF )
            // InternalMyDsl.g:2520:2: iv_ruleGenerate= ruleGenerate EOF
            {
             newCompositeNode(grammarAccess.getGenerateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGenerate=ruleGenerate();

            state._fsp--;

             current =iv_ruleGenerate; 
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
    // $ANTLR end "entryRuleGenerate"


    // $ANTLR start "ruleGenerate"
    // InternalMyDsl.g:2526:1: ruleGenerate returns [EObject current=null] : (otherlv_0= 'generate' ( (lv_sourceName_1_0= ruleSourceName ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' ) ;
    public final EObject ruleGenerate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_sourceName_1_0 = null;

        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2532:2: ( (otherlv_0= 'generate' ( (lv_sourceName_1_0= ruleSourceName ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' ) )
            // InternalMyDsl.g:2533:2: (otherlv_0= 'generate' ( (lv_sourceName_1_0= ruleSourceName ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' )
            {
            // InternalMyDsl.g:2533:2: (otherlv_0= 'generate' ( (lv_sourceName_1_0= ruleSourceName ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' )
            // InternalMyDsl.g:2534:3: otherlv_0= 'generate' ( (lv_sourceName_1_0= ruleSourceName ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGenerateAccess().getGenerateKeyword_0());
            		
            // InternalMyDsl.g:2538:3: ( (lv_sourceName_1_0= ruleSourceName ) )
            // InternalMyDsl.g:2539:4: (lv_sourceName_1_0= ruleSourceName )
            {
            // InternalMyDsl.g:2539:4: (lv_sourceName_1_0= ruleSourceName )
            // InternalMyDsl.g:2540:5: lv_sourceName_1_0= ruleSourceName
            {

            					newCompositeNode(grammarAccess.getGenerateAccess().getSourceNameSourceNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_sourceName_1_0=ruleSourceName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGenerateRule());
            					}
            					set(
            						current,
            						"sourceName",
            						lv_sourceName_1_0,
            						"org.xtext.example.mydsl.MyDsl.SourceName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_2, grammarAccess.getGenerateAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:2561:3: ( (lv_type_3_0= ruleType ) )
            // InternalMyDsl.g:2562:4: (lv_type_3_0= ruleType )
            {
            // InternalMyDsl.g:2562:4: (lv_type_3_0= ruleType )
            // InternalMyDsl.g:2563:5: lv_type_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getGenerateAccess().getTypeTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_type_3_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGenerateRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.example.mydsl.MyDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getGenerateAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleGenerate"


    // $ANTLR start "entryRuleSourceName"
    // InternalMyDsl.g:2588:1: entryRuleSourceName returns [EObject current=null] : iv_ruleSourceName= ruleSourceName EOF ;
    public final EObject entryRuleSourceName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceName = null;


        try {
            // InternalMyDsl.g:2588:51: (iv_ruleSourceName= ruleSourceName EOF )
            // InternalMyDsl.g:2589:2: iv_ruleSourceName= ruleSourceName EOF
            {
             newCompositeNode(grammarAccess.getSourceNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSourceName=ruleSourceName();

            state._fsp--;

             current =iv_ruleSourceName; 
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
    // $ANTLR end "entryRuleSourceName"


    // $ANTLR start "ruleSourceName"
    // InternalMyDsl.g:2595:1: ruleSourceName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSourceName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2601:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:2602:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:2602:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:2603:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:2603:3: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:2604:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getSourceNameAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSourceNameRule());
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
    // $ANTLR end "ruleSourceName"


    // $ANTLR start "entryRuleActuator"
    // InternalMyDsl.g:2623:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // InternalMyDsl.g:2623:49: (iv_ruleActuator= ruleActuator EOF )
            // InternalMyDsl.g:2624:2: iv_ruleActuator= ruleActuator EOF
            {
             newCompositeNode(grammarAccess.getActuatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActuator=ruleActuator();

            state._fsp--;

             current =iv_ruleActuator; 
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
    // $ANTLR end "entryRuleActuator"


    // $ANTLR start "ruleActuator"
    // InternalMyDsl.g:2630:1: ruleActuator returns [EObject current=null] : ( ( (lv_actuatorName_0_0= ruleEntityName ) ) ( (lv_actions_1_0= ruleAction ) )* ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        EObject lv_actuatorName_0_0 = null;

        EObject lv_actions_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2636:2: ( ( ( (lv_actuatorName_0_0= ruleEntityName ) ) ( (lv_actions_1_0= ruleAction ) )* ) )
            // InternalMyDsl.g:2637:2: ( ( (lv_actuatorName_0_0= ruleEntityName ) ) ( (lv_actions_1_0= ruleAction ) )* )
            {
            // InternalMyDsl.g:2637:2: ( ( (lv_actuatorName_0_0= ruleEntityName ) ) ( (lv_actions_1_0= ruleAction ) )* )
            // InternalMyDsl.g:2638:3: ( (lv_actuatorName_0_0= ruleEntityName ) ) ( (lv_actions_1_0= ruleAction ) )*
            {
            // InternalMyDsl.g:2638:3: ( (lv_actuatorName_0_0= ruleEntityName ) )
            // InternalMyDsl.g:2639:4: (lv_actuatorName_0_0= ruleEntityName )
            {
            // InternalMyDsl.g:2639:4: (lv_actuatorName_0_0= ruleEntityName )
            // InternalMyDsl.g:2640:5: lv_actuatorName_0_0= ruleEntityName
            {

            					newCompositeNode(grammarAccess.getActuatorAccess().getActuatorNameEntityNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_60);
            lv_actuatorName_0_0=ruleEntityName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActuatorRule());
            					}
            					set(
            						current,
            						"actuatorName",
            						lv_actuatorName_0_0,
            						"org.xtext.example.mydsl.MyDsl.EntityName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2657:3: ( (lv_actions_1_0= ruleAction ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==56) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalMyDsl.g:2658:4: (lv_actions_1_0= ruleAction )
            	    {
            	    // InternalMyDsl.g:2658:4: (lv_actions_1_0= ruleAction )
            	    // InternalMyDsl.g:2659:5: lv_actions_1_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getActuatorAccess().getActionsActionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_60);
            	    lv_actions_1_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActuatorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
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
    // $ANTLR end "ruleActuator"


    // $ANTLR start "entryRuleAction"
    // InternalMyDsl.g:2680:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalMyDsl.g:2680:47: (iv_ruleAction= ruleAction EOF )
            // InternalMyDsl.g:2681:2: iv_ruleAction= ruleAction EOF
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
    // InternalMyDsl.g:2687:1: ruleAction returns [EObject current=null] : (otherlv_0= 'action' ( (lv_actionName_1_0= ruleActionName ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameters ) )* otherlv_4= ')' otherlv_5= ';' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_actionName_1_0 = null;

        EObject lv_parameters_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2693:2: ( (otherlv_0= 'action' ( (lv_actionName_1_0= ruleActionName ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameters ) )* otherlv_4= ')' otherlv_5= ';' ) )
            // InternalMyDsl.g:2694:2: (otherlv_0= 'action' ( (lv_actionName_1_0= ruleActionName ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameters ) )* otherlv_4= ')' otherlv_5= ';' )
            {
            // InternalMyDsl.g:2694:2: (otherlv_0= 'action' ( (lv_actionName_1_0= ruleActionName ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameters ) )* otherlv_4= ')' otherlv_5= ';' )
            // InternalMyDsl.g:2695:3: otherlv_0= 'action' ( (lv_actionName_1_0= ruleActionName ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameters ) )* otherlv_4= ')' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            // InternalMyDsl.g:2699:3: ( (lv_actionName_1_0= ruleActionName ) )
            // InternalMyDsl.g:2700:4: (lv_actionName_1_0= ruleActionName )
            {
            // InternalMyDsl.g:2700:4: (lv_actionName_1_0= ruleActionName )
            // InternalMyDsl.g:2701:5: lv_actionName_1_0= ruleActionName
            {

            					newCompositeNode(grammarAccess.getActionAccess().getActionNameActionNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_actionName_1_0=ruleActionName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"actionName",
            						lv_actionName_1_0,
            						"org.xtext.example.mydsl.MyDsl.ActionName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMyDsl.g:2722:3: ( (lv_parameters_3_0= ruleParameters ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==RULE_ID) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalMyDsl.g:2723:4: (lv_parameters_3_0= ruleParameters )
            	    {
            	    // InternalMyDsl.g:2723:4: (lv_parameters_3_0= ruleParameters )
            	    // InternalMyDsl.g:2724:5: lv_parameters_3_0= ruleParameters
            	    {

            	    					newCompositeNode(grammarAccess.getActionAccess().getParametersParametersParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_parameters_3_0=ruleParameters();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.Parameters");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            otherlv_4=(Token)match(input,31,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getActionAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getActionAccess().getSemicolonKeyword_5());
            		

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


    // $ANTLR start "entryRuleActionName"
    // InternalMyDsl.g:2753:1: entryRuleActionName returns [EObject current=null] : iv_ruleActionName= ruleActionName EOF ;
    public final EObject entryRuleActionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionName = null;


        try {
            // InternalMyDsl.g:2753:51: (iv_ruleActionName= ruleActionName EOF )
            // InternalMyDsl.g:2754:2: iv_ruleActionName= ruleActionName EOF
            {
             newCompositeNode(grammarAccess.getActionNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionName=ruleActionName();

            state._fsp--;

             current =iv_ruleActionName; 
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
    // $ANTLR end "entryRuleActionName"


    // $ANTLR start "ruleActionName"
    // InternalMyDsl.g:2760:1: ruleActionName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleActionName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2766:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:2767:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:2767:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:2768:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:2768:3: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:2769:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getActionNameAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getActionNameRule());
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
    // $ANTLR end "ruleActionName"


    // $ANTLR start "entryRuleParameters"
    // InternalMyDsl.g:2788:1: entryRuleParameters returns [EObject current=null] : iv_ruleParameters= ruleParameters EOF ;
    public final EObject entryRuleParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameters = null;


        try {
            // InternalMyDsl.g:2788:51: (iv_ruleParameters= ruleParameters EOF )
            // InternalMyDsl.g:2789:2: iv_ruleParameters= ruleParameters EOF
            {
             newCompositeNode(grammarAccess.getParametersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameters=ruleParameters();

            state._fsp--;

             current =iv_ruleParameters; 
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
    // $ANTLR end "entryRuleParameters"


    // $ANTLR start "ruleParameters"
    // InternalMyDsl.g:2795:1: ruleParameters returns [EObject current=null] : ( ( (lv_parameterName_0_0= ruleParameterName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_parameterName_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2801:2: ( ( ( (lv_parameterName_0_0= ruleParameterName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) )
            // InternalMyDsl.g:2802:2: ( ( (lv_parameterName_0_0= ruleParameterName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            {
            // InternalMyDsl.g:2802:2: ( ( (lv_parameterName_0_0= ruleParameterName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            // InternalMyDsl.g:2803:3: ( (lv_parameterName_0_0= ruleParameterName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) )
            {
            // InternalMyDsl.g:2803:3: ( (lv_parameterName_0_0= ruleParameterName ) )
            // InternalMyDsl.g:2804:4: (lv_parameterName_0_0= ruleParameterName )
            {
            // InternalMyDsl.g:2804:4: (lv_parameterName_0_0= ruleParameterName )
            // InternalMyDsl.g:2805:5: lv_parameterName_0_0= ruleParameterName
            {

            					newCompositeNode(grammarAccess.getParametersAccess().getParameterNameParameterNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_parameterName_0_0=ruleParameterName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParametersRule());
            					}
            					set(
            						current,
            						"parameterName",
            						lv_parameterName_0_0,
            						"org.xtext.example.mydsl.MyDsl.ParameterName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_1, grammarAccess.getParametersAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:2826:3: ( (lv_type_2_0= ruleType ) )
            // InternalMyDsl.g:2827:4: (lv_type_2_0= ruleType )
            {
            // InternalMyDsl.g:2827:4: (lv_type_2_0= ruleType )
            // InternalMyDsl.g:2828:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getParametersAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParametersRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.example.mydsl.MyDsl.Type");
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
    // $ANTLR end "ruleParameters"


    // $ANTLR start "entryRuleParameterName"
    // InternalMyDsl.g:2849:1: entryRuleParameterName returns [EObject current=null] : iv_ruleParameterName= ruleParameterName EOF ;
    public final EObject entryRuleParameterName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterName = null;


        try {
            // InternalMyDsl.g:2849:54: (iv_ruleParameterName= ruleParameterName EOF )
            // InternalMyDsl.g:2850:2: iv_ruleParameterName= ruleParameterName EOF
            {
             newCompositeNode(grammarAccess.getParameterNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterName=ruleParameterName();

            state._fsp--;

             current =iv_ruleParameterName; 
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
    // $ANTLR end "entryRuleParameterName"


    // $ANTLR start "ruleParameterName"
    // InternalMyDsl.g:2856:1: ruleParameterName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleParameterName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2862:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:2863:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:2863:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:2864:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:2864:3: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:2865:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getParameterNameAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getParameterNameRule());
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
    // $ANTLR end "ruleParameterName"


    // $ANTLR start "entryRuleStorageService"
    // InternalMyDsl.g:2884:1: entryRuleStorageService returns [EObject current=null] : iv_ruleStorageService= ruleStorageService EOF ;
    public final EObject entryRuleStorageService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStorageService = null;


        try {
            // InternalMyDsl.g:2884:55: (iv_ruleStorageService= ruleStorageService EOF )
            // InternalMyDsl.g:2885:2: iv_ruleStorageService= ruleStorageService EOF
            {
             newCompositeNode(grammarAccess.getStorageServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStorageService=ruleStorageService();

            state._fsp--;

             current =iv_ruleStorageService; 
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
    // $ANTLR end "entryRuleStorageService"


    // $ANTLR start "ruleStorageService"
    // InternalMyDsl.g:2891:1: ruleStorageService returns [EObject current=null] : ( ( (lv_storageServiceName_0_0= ruleEntityName ) ) ( (lv_dataAccesses_1_0= ruleDataAccess ) )* ) ;
    public final EObject ruleStorageService() throws RecognitionException {
        EObject current = null;

        EObject lv_storageServiceName_0_0 = null;

        EObject lv_dataAccesses_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2897:2: ( ( ( (lv_storageServiceName_0_0= ruleEntityName ) ) ( (lv_dataAccesses_1_0= ruleDataAccess ) )* ) )
            // InternalMyDsl.g:2898:2: ( ( (lv_storageServiceName_0_0= ruleEntityName ) ) ( (lv_dataAccesses_1_0= ruleDataAccess ) )* )
            {
            // InternalMyDsl.g:2898:2: ( ( (lv_storageServiceName_0_0= ruleEntityName ) ) ( (lv_dataAccesses_1_0= ruleDataAccess ) )* )
            // InternalMyDsl.g:2899:3: ( (lv_storageServiceName_0_0= ruleEntityName ) ) ( (lv_dataAccesses_1_0= ruleDataAccess ) )*
            {
            // InternalMyDsl.g:2899:3: ( (lv_storageServiceName_0_0= ruleEntityName ) )
            // InternalMyDsl.g:2900:4: (lv_storageServiceName_0_0= ruleEntityName )
            {
            // InternalMyDsl.g:2900:4: (lv_storageServiceName_0_0= ruleEntityName )
            // InternalMyDsl.g:2901:5: lv_storageServiceName_0_0= ruleEntityName
            {

            					newCompositeNode(grammarAccess.getStorageServiceAccess().getStorageServiceNameEntityNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_34);
            lv_storageServiceName_0_0=ruleEntityName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStorageServiceRule());
            					}
            					set(
            						current,
            						"storageServiceName",
            						lv_storageServiceName_0_0,
            						"org.xtext.example.mydsl.MyDsl.EntityName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2918:3: ( (lv_dataAccesses_1_0= ruleDataAccess ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==55) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalMyDsl.g:2919:4: (lv_dataAccesses_1_0= ruleDataAccess )
            	    {
            	    // InternalMyDsl.g:2919:4: (lv_dataAccesses_1_0= ruleDataAccess )
            	    // InternalMyDsl.g:2920:5: lv_dataAccesses_1_0= ruleDataAccess
            	    {

            	    					newCompositeNode(grammarAccess.getStorageServiceAccess().getDataAccessesDataAccessParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_34);
            	    lv_dataAccesses_1_0=ruleDataAccess();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStorageServiceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dataAccesses",
            	    						lv_dataAccesses_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.DataAccess");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
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
    // $ANTLR end "ruleStorageService"


    // $ANTLR start "entryRuleDataAccessForRequestSensors"
    // InternalMyDsl.g:2941:1: entryRuleDataAccessForRequestSensors returns [EObject current=null] : iv_ruleDataAccessForRequestSensors= ruleDataAccessForRequestSensors EOF ;
    public final EObject entryRuleDataAccessForRequestSensors() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataAccessForRequestSensors = null;


        try {
            // InternalMyDsl.g:2941:68: (iv_ruleDataAccessForRequestSensors= ruleDataAccessForRequestSensors EOF )
            // InternalMyDsl.g:2942:2: iv_ruleDataAccessForRequestSensors= ruleDataAccessForRequestSensors EOF
            {
             newCompositeNode(grammarAccess.getDataAccessForRequestSensorsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataAccessForRequestSensors=ruleDataAccessForRequestSensors();

            state._fsp--;

             current =iv_ruleDataAccessForRequestSensors; 
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
    // $ANTLR end "entryRuleDataAccessForRequestSensors"


    // $ANTLR start "ruleDataAccessForRequestSensors"
    // InternalMyDsl.g:2948:1: ruleDataAccessForRequestSensors returns [EObject current=null] : (otherlv_0= 'generate' ( (lv_sourceName_1_0= ruleSourceName ) ) otherlv_2= ':' ( (lv_dataAccessType_3_0= ruleType ) ) otherlv_4= 'accessed-by' ( (lv_dataItem_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_type_7_0= ruleType ) ) otherlv_8= ';' ) ;
    public final EObject ruleDataAccessForRequestSensors() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_dataItem_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_sourceName_1_0 = null;

        EObject lv_dataAccessType_3_0 = null;

        EObject lv_type_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2954:2: ( (otherlv_0= 'generate' ( (lv_sourceName_1_0= ruleSourceName ) ) otherlv_2= ':' ( (lv_dataAccessType_3_0= ruleType ) ) otherlv_4= 'accessed-by' ( (lv_dataItem_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_type_7_0= ruleType ) ) otherlv_8= ';' ) )
            // InternalMyDsl.g:2955:2: (otherlv_0= 'generate' ( (lv_sourceName_1_0= ruleSourceName ) ) otherlv_2= ':' ( (lv_dataAccessType_3_0= ruleType ) ) otherlv_4= 'accessed-by' ( (lv_dataItem_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_type_7_0= ruleType ) ) otherlv_8= ';' )
            {
            // InternalMyDsl.g:2955:2: (otherlv_0= 'generate' ( (lv_sourceName_1_0= ruleSourceName ) ) otherlv_2= ':' ( (lv_dataAccessType_3_0= ruleType ) ) otherlv_4= 'accessed-by' ( (lv_dataItem_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_type_7_0= ruleType ) ) otherlv_8= ';' )
            // InternalMyDsl.g:2956:3: otherlv_0= 'generate' ( (lv_sourceName_1_0= ruleSourceName ) ) otherlv_2= ':' ( (lv_dataAccessType_3_0= ruleType ) ) otherlv_4= 'accessed-by' ( (lv_dataItem_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_type_7_0= ruleType ) ) otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDataAccessForRequestSensorsAccess().getGenerateKeyword_0());
            		
            // InternalMyDsl.g:2960:3: ( (lv_sourceName_1_0= ruleSourceName ) )
            // InternalMyDsl.g:2961:4: (lv_sourceName_1_0= ruleSourceName )
            {
            // InternalMyDsl.g:2961:4: (lv_sourceName_1_0= ruleSourceName )
            // InternalMyDsl.g:2962:5: lv_sourceName_1_0= ruleSourceName
            {

            					newCompositeNode(grammarAccess.getDataAccessForRequestSensorsAccess().getSourceNameSourceNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_sourceName_1_0=ruleSourceName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataAccessForRequestSensorsRule());
            					}
            					set(
            						current,
            						"sourceName",
            						lv_sourceName_1_0,
            						"org.xtext.example.mydsl.MyDsl.SourceName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_2, grammarAccess.getDataAccessForRequestSensorsAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:2983:3: ( (lv_dataAccessType_3_0= ruleType ) )
            // InternalMyDsl.g:2984:4: (lv_dataAccessType_3_0= ruleType )
            {
            // InternalMyDsl.g:2984:4: (lv_dataAccessType_3_0= ruleType )
            // InternalMyDsl.g:2985:5: lv_dataAccessType_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getDataAccessForRequestSensorsAccess().getDataAccessTypeTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_61);
            lv_dataAccessType_3_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataAccessForRequestSensorsRule());
            					}
            					set(
            						current,
            						"dataAccessType",
            						lv_dataAccessType_3_0,
            						"org.xtext.example.mydsl.MyDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,57,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getDataAccessForRequestSensorsAccess().getAccessedByKeyword_4());
            		
            // InternalMyDsl.g:3006:3: ( (lv_dataItem_5_0= RULE_ID ) )
            // InternalMyDsl.g:3007:4: (lv_dataItem_5_0= RULE_ID )
            {
            // InternalMyDsl.g:3007:4: (lv_dataItem_5_0= RULE_ID )
            // InternalMyDsl.g:3008:5: lv_dataItem_5_0= RULE_ID
            {
            lv_dataItem_5_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_dataItem_5_0, grammarAccess.getDataAccessForRequestSensorsAccess().getDataItemIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataAccessForRequestSensorsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dataItem",
            						lv_dataItem_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_6, grammarAccess.getDataAccessForRequestSensorsAccess().getColonKeyword_6());
            		
            // InternalMyDsl.g:3028:3: ( (lv_type_7_0= ruleType ) )
            // InternalMyDsl.g:3029:4: (lv_type_7_0= ruleType )
            {
            // InternalMyDsl.g:3029:4: (lv_type_7_0= ruleType )
            // InternalMyDsl.g:3030:5: lv_type_7_0= ruleType
            {

            					newCompositeNode(grammarAccess.getDataAccessForRequestSensorsAccess().getTypeTypeParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_7);
            lv_type_7_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataAccessForRequestSensorsRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_7_0,
            						"org.xtext.example.mydsl.MyDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDataAccessForRequestSensorsAccess().getSemicolonKeyword_8());
            		

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
    // $ANTLR end "ruleDataAccessForRequestSensors"


    // $ANTLR start "entryRuleDataAccess"
    // InternalMyDsl.g:3055:1: entryRuleDataAccess returns [EObject current=null] : iv_ruleDataAccess= ruleDataAccess EOF ;
    public final EObject entryRuleDataAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataAccess = null;


        try {
            // InternalMyDsl.g:3055:51: (iv_ruleDataAccess= ruleDataAccess EOF )
            // InternalMyDsl.g:3056:2: iv_ruleDataAccess= ruleDataAccess EOF
            {
             newCompositeNode(grammarAccess.getDataAccessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataAccess=ruleDataAccess();

            state._fsp--;

             current =iv_ruleDataAccess; 
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
    // $ANTLR end "entryRuleDataAccess"


    // $ANTLR start "ruleDataAccess"
    // InternalMyDsl.g:3062:1: ruleDataAccess returns [EObject current=null] : (otherlv_0= 'generate' ( (lv_sourceName_1_0= ruleSourceName ) ) otherlv_2= ':' ( (lv_dataAccessType_3_0= ruleType ) ) otherlv_4= 'accessed-by' ( (lv_dataItem_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_type_7_0= ruleType ) ) otherlv_8= ';' ( (lv_actions_9_0= ruleAction ) )* ) ;
    public final EObject ruleDataAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_dataItem_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_sourceName_1_0 = null;

        EObject lv_dataAccessType_3_0 = null;

        EObject lv_type_7_0 = null;

        EObject lv_actions_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3068:2: ( (otherlv_0= 'generate' ( (lv_sourceName_1_0= ruleSourceName ) ) otherlv_2= ':' ( (lv_dataAccessType_3_0= ruleType ) ) otherlv_4= 'accessed-by' ( (lv_dataItem_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_type_7_0= ruleType ) ) otherlv_8= ';' ( (lv_actions_9_0= ruleAction ) )* ) )
            // InternalMyDsl.g:3069:2: (otherlv_0= 'generate' ( (lv_sourceName_1_0= ruleSourceName ) ) otherlv_2= ':' ( (lv_dataAccessType_3_0= ruleType ) ) otherlv_4= 'accessed-by' ( (lv_dataItem_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_type_7_0= ruleType ) ) otherlv_8= ';' ( (lv_actions_9_0= ruleAction ) )* )
            {
            // InternalMyDsl.g:3069:2: (otherlv_0= 'generate' ( (lv_sourceName_1_0= ruleSourceName ) ) otherlv_2= ':' ( (lv_dataAccessType_3_0= ruleType ) ) otherlv_4= 'accessed-by' ( (lv_dataItem_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_type_7_0= ruleType ) ) otherlv_8= ';' ( (lv_actions_9_0= ruleAction ) )* )
            // InternalMyDsl.g:3070:3: otherlv_0= 'generate' ( (lv_sourceName_1_0= ruleSourceName ) ) otherlv_2= ':' ( (lv_dataAccessType_3_0= ruleType ) ) otherlv_4= 'accessed-by' ( (lv_dataItem_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_type_7_0= ruleType ) ) otherlv_8= ';' ( (lv_actions_9_0= ruleAction ) )*
            {
            otherlv_0=(Token)match(input,55,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDataAccessAccess().getGenerateKeyword_0());
            		
            // InternalMyDsl.g:3074:3: ( (lv_sourceName_1_0= ruleSourceName ) )
            // InternalMyDsl.g:3075:4: (lv_sourceName_1_0= ruleSourceName )
            {
            // InternalMyDsl.g:3075:4: (lv_sourceName_1_0= ruleSourceName )
            // InternalMyDsl.g:3076:5: lv_sourceName_1_0= ruleSourceName
            {

            					newCompositeNode(grammarAccess.getDataAccessAccess().getSourceNameSourceNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_sourceName_1_0=ruleSourceName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataAccessRule());
            					}
            					set(
            						current,
            						"sourceName",
            						lv_sourceName_1_0,
            						"org.xtext.example.mydsl.MyDsl.SourceName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_2, grammarAccess.getDataAccessAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:3097:3: ( (lv_dataAccessType_3_0= ruleType ) )
            // InternalMyDsl.g:3098:4: (lv_dataAccessType_3_0= ruleType )
            {
            // InternalMyDsl.g:3098:4: (lv_dataAccessType_3_0= ruleType )
            // InternalMyDsl.g:3099:5: lv_dataAccessType_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getDataAccessAccess().getDataAccessTypeTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_61);
            lv_dataAccessType_3_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataAccessRule());
            					}
            					set(
            						current,
            						"dataAccessType",
            						lv_dataAccessType_3_0,
            						"org.xtext.example.mydsl.MyDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,57,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getDataAccessAccess().getAccessedByKeyword_4());
            		
            // InternalMyDsl.g:3120:3: ( (lv_dataItem_5_0= RULE_ID ) )
            // InternalMyDsl.g:3121:4: (lv_dataItem_5_0= RULE_ID )
            {
            // InternalMyDsl.g:3121:4: (lv_dataItem_5_0= RULE_ID )
            // InternalMyDsl.g:3122:5: lv_dataItem_5_0= RULE_ID
            {
            lv_dataItem_5_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_dataItem_5_0, grammarAccess.getDataAccessAccess().getDataItemIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataAccessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dataItem",
            						lv_dataItem_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_6, grammarAccess.getDataAccessAccess().getColonKeyword_6());
            		
            // InternalMyDsl.g:3142:3: ( (lv_type_7_0= ruleType ) )
            // InternalMyDsl.g:3143:4: (lv_type_7_0= ruleType )
            {
            // InternalMyDsl.g:3143:4: (lv_type_7_0= ruleType )
            // InternalMyDsl.g:3144:5: lv_type_7_0= ruleType
            {

            					newCompositeNode(grammarAccess.getDataAccessAccess().getTypeTypeParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_7);
            lv_type_7_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataAccessRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_7_0,
            						"org.xtext.example.mydsl.MyDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,14,FOLLOW_60); 

            			newLeafNode(otherlv_8, grammarAccess.getDataAccessAccess().getSemicolonKeyword_8());
            		
            // InternalMyDsl.g:3165:3: ( (lv_actions_9_0= ruleAction ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==56) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalMyDsl.g:3166:4: (lv_actions_9_0= ruleAction )
            	    {
            	    // InternalMyDsl.g:3166:4: (lv_actions_9_0= ruleAction )
            	    // InternalMyDsl.g:3167:5: lv_actions_9_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getDataAccessAccess().getActionsActionParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_60);
            	    lv_actions_9_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDataAccessRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_9_0,
            	    						"org.xtext.example.mydsl.MyDsl.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
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
    // $ANTLR end "ruleDataAccess"


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:3188:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalMyDsl.g:3188:45: (iv_ruleType= ruleType EOF )
            // InternalMyDsl.g:3189:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:3195:1: ruleType returns [EObject current=null] : ( (lv_primitiveDataType_0_0= rulePrimitiveDataType ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject lv_primitiveDataType_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3201:2: ( ( (lv_primitiveDataType_0_0= rulePrimitiveDataType ) ) )
            // InternalMyDsl.g:3202:2: ( (lv_primitiveDataType_0_0= rulePrimitiveDataType ) )
            {
            // InternalMyDsl.g:3202:2: ( (lv_primitiveDataType_0_0= rulePrimitiveDataType ) )
            // InternalMyDsl.g:3203:3: (lv_primitiveDataType_0_0= rulePrimitiveDataType )
            {
            // InternalMyDsl.g:3203:3: (lv_primitiveDataType_0_0= rulePrimitiveDataType )
            // InternalMyDsl.g:3204:4: lv_primitiveDataType_0_0= rulePrimitiveDataType
            {

            				newCompositeNode(grammarAccess.getTypeAccess().getPrimitiveDataTypePrimitiveDataTypeParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_primitiveDataType_0_0=rulePrimitiveDataType();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getTypeRule());
            				}
            				set(
            					current,
            					"primitiveDataType",
            					lv_primitiveDataType_0_0,
            					"org.xtext.example.mydsl.MyDsl.PrimitiveDataType");
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleUnit"
    // InternalMyDsl.g:3224:1: entryRuleUnit returns [EObject current=null] : iv_ruleUnit= ruleUnit EOF ;
    public final EObject entryRuleUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnit = null;


        try {
            // InternalMyDsl.g:3224:45: (iv_ruleUnit= ruleUnit EOF )
            // InternalMyDsl.g:3225:2: iv_ruleUnit= ruleUnit EOF
            {
             newCompositeNode(grammarAccess.getUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnit=ruleUnit();

            state._fsp--;

             current =iv_ruleUnit; 
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
    // $ANTLR end "entryRuleUnit"


    // $ANTLR start "ruleUnit"
    // InternalMyDsl.g:3231:1: ruleUnit returns [EObject current=null] : ( ( (lv_name_0_0= 'PPM' ) ) | ( (lv_name_1_0= 'miliseconds' ) ) | ( (lv_name_2_0= 'seconds' ) ) | ( (lv_name_3_0= 'minutes' ) ) | ( (lv_name_4_0= 'ppm' ) ) ) ;
    public final EObject ruleUnit() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;
        Token lv_name_2_0=null;
        Token lv_name_3_0=null;
        Token lv_name_4_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3237:2: ( ( ( (lv_name_0_0= 'PPM' ) ) | ( (lv_name_1_0= 'miliseconds' ) ) | ( (lv_name_2_0= 'seconds' ) ) | ( (lv_name_3_0= 'minutes' ) ) | ( (lv_name_4_0= 'ppm' ) ) ) )
            // InternalMyDsl.g:3238:2: ( ( (lv_name_0_0= 'PPM' ) ) | ( (lv_name_1_0= 'miliseconds' ) ) | ( (lv_name_2_0= 'seconds' ) ) | ( (lv_name_3_0= 'minutes' ) ) | ( (lv_name_4_0= 'ppm' ) ) )
            {
            // InternalMyDsl.g:3238:2: ( ( (lv_name_0_0= 'PPM' ) ) | ( (lv_name_1_0= 'miliseconds' ) ) | ( (lv_name_2_0= 'seconds' ) ) | ( (lv_name_3_0= 'minutes' ) ) | ( (lv_name_4_0= 'ppm' ) ) )
            int alt57=5;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt57=1;
                }
                break;
            case 59:
                {
                alt57=2;
                }
                break;
            case 60:
                {
                alt57=3;
                }
                break;
            case 61:
                {
                alt57=4;
                }
                break;
            case 62:
                {
                alt57=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalMyDsl.g:3239:3: ( (lv_name_0_0= 'PPM' ) )
                    {
                    // InternalMyDsl.g:3239:3: ( (lv_name_0_0= 'PPM' ) )
                    // InternalMyDsl.g:3240:4: (lv_name_0_0= 'PPM' )
                    {
                    // InternalMyDsl.g:3240:4: (lv_name_0_0= 'PPM' )
                    // InternalMyDsl.g:3241:5: lv_name_0_0= 'PPM'
                    {
                    lv_name_0_0=(Token)match(input,58,FOLLOW_2); 

                    					newLeafNode(lv_name_0_0, grammarAccess.getUnitAccess().getNamePPMKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnitRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_0, "PPM");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3254:3: ( (lv_name_1_0= 'miliseconds' ) )
                    {
                    // InternalMyDsl.g:3254:3: ( (lv_name_1_0= 'miliseconds' ) )
                    // InternalMyDsl.g:3255:4: (lv_name_1_0= 'miliseconds' )
                    {
                    // InternalMyDsl.g:3255:4: (lv_name_1_0= 'miliseconds' )
                    // InternalMyDsl.g:3256:5: lv_name_1_0= 'miliseconds'
                    {
                    lv_name_1_0=(Token)match(input,59,FOLLOW_2); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getUnitAccess().getNameMilisecondsKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnitRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_1_0, "miliseconds");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:3269:3: ( (lv_name_2_0= 'seconds' ) )
                    {
                    // InternalMyDsl.g:3269:3: ( (lv_name_2_0= 'seconds' ) )
                    // InternalMyDsl.g:3270:4: (lv_name_2_0= 'seconds' )
                    {
                    // InternalMyDsl.g:3270:4: (lv_name_2_0= 'seconds' )
                    // InternalMyDsl.g:3271:5: lv_name_2_0= 'seconds'
                    {
                    lv_name_2_0=(Token)match(input,60,FOLLOW_2); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getUnitAccess().getNameSecondsKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnitRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_2_0, "seconds");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:3284:3: ( (lv_name_3_0= 'minutes' ) )
                    {
                    // InternalMyDsl.g:3284:3: ( (lv_name_3_0= 'minutes' ) )
                    // InternalMyDsl.g:3285:4: (lv_name_3_0= 'minutes' )
                    {
                    // InternalMyDsl.g:3285:4: (lv_name_3_0= 'minutes' )
                    // InternalMyDsl.g:3286:5: lv_name_3_0= 'minutes'
                    {
                    lv_name_3_0=(Token)match(input,61,FOLLOW_2); 

                    					newLeafNode(lv_name_3_0, grammarAccess.getUnitAccess().getNameMinutesKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnitRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_3_0, "minutes");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:3299:3: ( (lv_name_4_0= 'ppm' ) )
                    {
                    // InternalMyDsl.g:3299:3: ( (lv_name_4_0= 'ppm' ) )
                    // InternalMyDsl.g:3300:4: (lv_name_4_0= 'ppm' )
                    {
                    // InternalMyDsl.g:3300:4: (lv_name_4_0= 'ppm' )
                    // InternalMyDsl.g:3301:5: lv_name_4_0= 'ppm'
                    {
                    lv_name_4_0=(Token)match(input,62,FOLLOW_2); 

                    					newLeafNode(lv_name_4_0, grammarAccess.getUnitAccess().getNamePpmKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnitRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_4_0, "ppm");
                    				

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
    // $ANTLR end "ruleUnit"


    // $ANTLR start "entryRuleOperationName"
    // InternalMyDsl.g:3317:1: entryRuleOperationName returns [EObject current=null] : iv_ruleOperationName= ruleOperationName EOF ;
    public final EObject entryRuleOperationName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationName = null;


        try {
            // InternalMyDsl.g:3317:54: (iv_ruleOperationName= ruleOperationName EOF )
            // InternalMyDsl.g:3318:2: iv_ruleOperationName= ruleOperationName EOF
            {
             newCompositeNode(grammarAccess.getOperationNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationName=ruleOperationName();

            state._fsp--;

             current =iv_ruleOperationName; 
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
    // $ANTLR end "entryRuleOperationName"


    // $ANTLR start "ruleOperationName"
    // InternalMyDsl.g:3324:1: ruleOperationName returns [EObject current=null] : ( (lv_name_0_0= 'AVG_BY_SAMPLE' ) ) ;
    public final EObject ruleOperationName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3330:2: ( ( (lv_name_0_0= 'AVG_BY_SAMPLE' ) ) )
            // InternalMyDsl.g:3331:2: ( (lv_name_0_0= 'AVG_BY_SAMPLE' ) )
            {
            // InternalMyDsl.g:3331:2: ( (lv_name_0_0= 'AVG_BY_SAMPLE' ) )
            // InternalMyDsl.g:3332:3: (lv_name_0_0= 'AVG_BY_SAMPLE' )
            {
            // InternalMyDsl.g:3332:3: (lv_name_0_0= 'AVG_BY_SAMPLE' )
            // InternalMyDsl.g:3333:4: lv_name_0_0= 'AVG_BY_SAMPLE'
            {
            lv_name_0_0=(Token)match(input,63,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getOperationNameAccess().getNameAVG_BY_SAMPLEKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getOperationNameRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "AVG_BY_SAMPLE");
            			

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
    // $ANTLR end "ruleOperationName"


    // $ANTLR start "entryRulePrimitiveDataType"
    // InternalMyDsl.g:3348:1: entryRulePrimitiveDataType returns [EObject current=null] : iv_rulePrimitiveDataType= rulePrimitiveDataType EOF ;
    public final EObject entryRulePrimitiveDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveDataType = null;


        try {
            // InternalMyDsl.g:3348:58: (iv_rulePrimitiveDataType= rulePrimitiveDataType EOF )
            // InternalMyDsl.g:3349:2: iv_rulePrimitiveDataType= rulePrimitiveDataType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveDataType=rulePrimitiveDataType();

            state._fsp--;

             current =iv_rulePrimitiveDataType; 
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
    // $ANTLR end "entryRulePrimitiveDataType"


    // $ANTLR start "rulePrimitiveDataType"
    // InternalMyDsl.g:3355:1: rulePrimitiveDataType returns [EObject current=null] : ( ( (lv_INTEGER_0_0= 'Integer' ) ) | ( (lv_BOOLEAN_1_0= 'boolean' ) ) | ( (lv_STRING_2_0= 'String' ) ) | ( (lv_LONG_3_0= 'long' ) ) | ( (lv_DOUBLE_4_0= 'double' ) ) | ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject rulePrimitiveDataType() throws RecognitionException {
        EObject current = null;

        Token lv_INTEGER_0_0=null;
        Token lv_BOOLEAN_1_0=null;
        Token lv_STRING_2_0=null;
        Token lv_LONG_3_0=null;
        Token lv_DOUBLE_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3361:2: ( ( ( (lv_INTEGER_0_0= 'Integer' ) ) | ( (lv_BOOLEAN_1_0= 'boolean' ) ) | ( (lv_STRING_2_0= 'String' ) ) | ( (lv_LONG_3_0= 'long' ) ) | ( (lv_DOUBLE_4_0= 'double' ) ) | ( (otherlv_5= RULE_ID ) ) ) )
            // InternalMyDsl.g:3362:2: ( ( (lv_INTEGER_0_0= 'Integer' ) ) | ( (lv_BOOLEAN_1_0= 'boolean' ) ) | ( (lv_STRING_2_0= 'String' ) ) | ( (lv_LONG_3_0= 'long' ) ) | ( (lv_DOUBLE_4_0= 'double' ) ) | ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalMyDsl.g:3362:2: ( ( (lv_INTEGER_0_0= 'Integer' ) ) | ( (lv_BOOLEAN_1_0= 'boolean' ) ) | ( (lv_STRING_2_0= 'String' ) ) | ( (lv_LONG_3_0= 'long' ) ) | ( (lv_DOUBLE_4_0= 'double' ) ) | ( (otherlv_5= RULE_ID ) ) )
            int alt58=6;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt58=1;
                }
                break;
            case 65:
                {
                alt58=2;
                }
                break;
            case 66:
                {
                alt58=3;
                }
                break;
            case 67:
                {
                alt58=4;
                }
                break;
            case 68:
                {
                alt58=5;
                }
                break;
            case RULE_ID:
                {
                alt58=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalMyDsl.g:3363:3: ( (lv_INTEGER_0_0= 'Integer' ) )
                    {
                    // InternalMyDsl.g:3363:3: ( (lv_INTEGER_0_0= 'Integer' ) )
                    // InternalMyDsl.g:3364:4: (lv_INTEGER_0_0= 'Integer' )
                    {
                    // InternalMyDsl.g:3364:4: (lv_INTEGER_0_0= 'Integer' )
                    // InternalMyDsl.g:3365:5: lv_INTEGER_0_0= 'Integer'
                    {
                    lv_INTEGER_0_0=(Token)match(input,64,FOLLOW_2); 

                    					newLeafNode(lv_INTEGER_0_0, grammarAccess.getPrimitiveDataTypeAccess().getINTEGERIntegerKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveDataTypeRule());
                    					}
                    					setWithLastConsumed(current, "INTEGER", lv_INTEGER_0_0, "Integer");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3378:3: ( (lv_BOOLEAN_1_0= 'boolean' ) )
                    {
                    // InternalMyDsl.g:3378:3: ( (lv_BOOLEAN_1_0= 'boolean' ) )
                    // InternalMyDsl.g:3379:4: (lv_BOOLEAN_1_0= 'boolean' )
                    {
                    // InternalMyDsl.g:3379:4: (lv_BOOLEAN_1_0= 'boolean' )
                    // InternalMyDsl.g:3380:5: lv_BOOLEAN_1_0= 'boolean'
                    {
                    lv_BOOLEAN_1_0=(Token)match(input,65,FOLLOW_2); 

                    					newLeafNode(lv_BOOLEAN_1_0, grammarAccess.getPrimitiveDataTypeAccess().getBOOLEANBooleanKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveDataTypeRule());
                    					}
                    					setWithLastConsumed(current, "BOOLEAN", lv_BOOLEAN_1_0, "boolean");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:3393:3: ( (lv_STRING_2_0= 'String' ) )
                    {
                    // InternalMyDsl.g:3393:3: ( (lv_STRING_2_0= 'String' ) )
                    // InternalMyDsl.g:3394:4: (lv_STRING_2_0= 'String' )
                    {
                    // InternalMyDsl.g:3394:4: (lv_STRING_2_0= 'String' )
                    // InternalMyDsl.g:3395:5: lv_STRING_2_0= 'String'
                    {
                    lv_STRING_2_0=(Token)match(input,66,FOLLOW_2); 

                    					newLeafNode(lv_STRING_2_0, grammarAccess.getPrimitiveDataTypeAccess().getSTRINGStringKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveDataTypeRule());
                    					}
                    					setWithLastConsumed(current, "STRING", lv_STRING_2_0, "String");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:3408:3: ( (lv_LONG_3_0= 'long' ) )
                    {
                    // InternalMyDsl.g:3408:3: ( (lv_LONG_3_0= 'long' ) )
                    // InternalMyDsl.g:3409:4: (lv_LONG_3_0= 'long' )
                    {
                    // InternalMyDsl.g:3409:4: (lv_LONG_3_0= 'long' )
                    // InternalMyDsl.g:3410:5: lv_LONG_3_0= 'long'
                    {
                    lv_LONG_3_0=(Token)match(input,67,FOLLOW_2); 

                    					newLeafNode(lv_LONG_3_0, grammarAccess.getPrimitiveDataTypeAccess().getLONGLongKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveDataTypeRule());
                    					}
                    					setWithLastConsumed(current, "LONG", lv_LONG_3_0, "long");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:3423:3: ( (lv_DOUBLE_4_0= 'double' ) )
                    {
                    // InternalMyDsl.g:3423:3: ( (lv_DOUBLE_4_0= 'double' ) )
                    // InternalMyDsl.g:3424:4: (lv_DOUBLE_4_0= 'double' )
                    {
                    // InternalMyDsl.g:3424:4: (lv_DOUBLE_4_0= 'double' )
                    // InternalMyDsl.g:3425:5: lv_DOUBLE_4_0= 'double'
                    {
                    lv_DOUBLE_4_0=(Token)match(input,68,FOLLOW_2); 

                    					newLeafNode(lv_DOUBLE_4_0, grammarAccess.getPrimitiveDataTypeAccess().getDOUBLEDoubleKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveDataTypeRule());
                    					}
                    					setWithLastConsumed(current, "DOUBLE", lv_DOUBLE_4_0, "double");
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:3438:3: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalMyDsl.g:3438:3: ( (otherlv_5= RULE_ID ) )
                    // InternalMyDsl.g:3439:4: (otherlv_5= RULE_ID )
                    {
                    // InternalMyDsl.g:3439:4: (otherlv_5= RULE_ID )
                    // InternalMyDsl.g:3440:5: otherlv_5= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveDataTypeRule());
                    					}
                    				
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_5, grammarAccess.getPrimitiveDataTypeAccess().getStructDefStructEntityNameCrossReference_5_0());
                    				

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
    // $ANTLR end "rulePrimitiveDataType"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\36\uffff";
    static final String dfa_2s = "\1\2\16\uffff\2\2\13\uffff\1\2\1\uffff";
    static final String dfa_3s = "\1\13\1\4\3\uffff\1\4\1\uffff\1\14\1\4\6\16\1\4\1\20\3\4\1\14\1\4\6\16\2\4";
    static final String dfa_4s = "\1\41\1\20\3\uffff\1\4\1\uffff\1\14\1\104\6\16\1\41\1\51\1\4\1\14\1\4\1\14\1\104\6\16\1\41\1\14";
    static final String dfa_5s = "\2\uffff\1\2\1\3\1\4\1\uffff\1\1\27\uffff";
    static final String dfa_6s = "\36\uffff}>";
    static final String[] dfa_7s = {
            "\1\4\4\uffff\1\2\12\uffff\1\1\1\2\4\uffff\1\3",
            "\1\5\13\uffff\1\6",
            "",
            "",
            "",
            "\1\7",
            "",
            "\1\10",
            "\1\16\73\uffff\1\11\1\12\1\13\1\14\1\15",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\22\13\uffff\1\20\12\uffff\1\21\1\2\4\uffff\1\3",
            "\1\2\13\uffff\1\2\14\uffff\1\6",
            "\1\23",
            "\1\7\7\uffff\1\10",
            "\1\24",
            "\1\25",
            "\1\33\73\uffff\1\26\1\27\1\30\1\31\1\32",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\35\13\uffff\1\2\12\uffff\1\21\1\2\4\uffff\1\3",
            "\1\24\7\uffff\1\25"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "78:2: ( ( (lv_vocSpec_0_0= ruleVocSpec ) ) | ( (lv_interactionSpec_1_0= ruleInteractionSpec ) ) | ( (lv_archSpec_2_0= ruleArchSpec ) ) | ( (lv_networkSpec_3_0= ruleDeploymentSpec ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000018010012L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010010002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000012L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000011020000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001020000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000208000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000C00000012L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000012L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0080008000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0080015000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0080011000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0080010000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000084000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000FC0000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000FC0000000012L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000F80000000012L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000F00000000012L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000E00000000012L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000C00000000012L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000800000000012L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000010L,0x000000000000001FL});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0081000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0088000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0070000000000020L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x7C00000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0200000000000000L});

}