package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'>'", "'<'", "'='", "'devices:'", "':'", "'location:'", "';'", "'platform:'", "'resources:'", "'protocol:'", "'database:'", "','", "'structs:'", "'userInteractions:'", "'notify'", "'('", "')'", "'from'", "'computationalService:'", "'Common:'", "'Custom:'", "'request'", "'to'", "'consume'", "'COMPUTE'", "'command'", "'sensors:'", "'periodicSensors:'", "'eventDrivenSensors:'", "'requestBasedSensors:'", "'tags:'", "'actuators:'", "'storages:'", "'sample'", "'period'", "'for'", "'onCondition'", "'generate'", "'action'", "'accessed-by'", "'JavaSE'", "'Android'", "'NodeJS'", "'MySQL'", "'SQLAzure'", "'MongoDB'", "'mqtt'", "'PPM'", "'miliseconds'", "'seconds'", "'minutes'", "'ppm'", "'AVG_BY_SAMPLE'", "'Integer'", "'boolean'", "'String'", "'long'", "'double'"
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
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__Alternatives ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__Alternatives ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__Alternatives ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__Alternatives ) )
            // InternalMyDsl.g:68:3: ( rule__Model__Alternatives )
            {
             before(grammarAccess.getModelAccess().getAlternatives()); 
            // InternalMyDsl.g:69:3: ( rule__Model__Alternatives )
            // InternalMyDsl.g:69:4: rule__Model__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Model__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDeploymentSpec"
    // InternalMyDsl.g:78:1: entryRuleDeploymentSpec : ruleDeploymentSpec EOF ;
    public final void entryRuleDeploymentSpec() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleDeploymentSpec EOF )
            // InternalMyDsl.g:80:1: ruleDeploymentSpec EOF
            {
             before(grammarAccess.getDeploymentSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleDeploymentSpec();

            state._fsp--;

             after(grammarAccess.getDeploymentSpecRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeploymentSpec"


    // $ANTLR start "ruleDeploymentSpec"
    // InternalMyDsl.g:87:1: ruleDeploymentSpec : ( ( rule__DeploymentSpec__Group__0 ) ) ;
    public final void ruleDeploymentSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__DeploymentSpec__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__DeploymentSpec__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__DeploymentSpec__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__DeploymentSpec__Group__0 )
            {
             before(grammarAccess.getDeploymentSpecAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__DeploymentSpec__Group__0 )
            // InternalMyDsl.g:94:4: rule__DeploymentSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeploymentSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeploymentSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeploymentSpec"


    // $ANTLR start "entryRuleDevice"
    // InternalMyDsl.g:103:1: entryRuleDevice : ruleDevice EOF ;
    public final void entryRuleDevice() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleDevice EOF )
            // InternalMyDsl.g:105:1: ruleDevice EOF
            {
             before(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_1);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getDeviceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // InternalMyDsl.g:112:1: ruleDevice : ( ( rule__Device__Group__0 ) ) ;
    public final void ruleDevice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Device__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Device__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Device__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Device__Group__0 )
            {
             before(grammarAccess.getDeviceAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Device__Group__0 )
            // InternalMyDsl.g:119:4: rule__Device__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Device__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleDeviceLocation"
    // InternalMyDsl.g:128:1: entryRuleDeviceLocation : ruleDeviceLocation EOF ;
    public final void entryRuleDeviceLocation() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleDeviceLocation EOF )
            // InternalMyDsl.g:130:1: ruleDeviceLocation EOF
            {
             before(grammarAccess.getDeviceLocationRule()); 
            pushFollow(FOLLOW_1);
            ruleDeviceLocation();

            state._fsp--;

             after(grammarAccess.getDeviceLocationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeviceLocation"


    // $ANTLR start "ruleDeviceLocation"
    // InternalMyDsl.g:137:1: ruleDeviceLocation : ( ( rule__DeviceLocation__Group__0 ) ) ;
    public final void ruleDeviceLocation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__DeviceLocation__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__DeviceLocation__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__DeviceLocation__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__DeviceLocation__Group__0 )
            {
             before(grammarAccess.getDeviceLocationAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__DeviceLocation__Group__0 )
            // InternalMyDsl.g:144:4: rule__DeviceLocation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeviceLocation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeviceLocationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeviceLocation"


    // $ANTLR start "entryRulePlatformType"
    // InternalMyDsl.g:153:1: entryRulePlatformType : rulePlatformType EOF ;
    public final void entryRulePlatformType() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( rulePlatformType EOF )
            // InternalMyDsl.g:155:1: rulePlatformType EOF
            {
             before(grammarAccess.getPlatformTypeRule()); 
            pushFollow(FOLLOW_1);
            rulePlatformType();

            state._fsp--;

             after(grammarAccess.getPlatformTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlatformType"


    // $ANTLR start "rulePlatformType"
    // InternalMyDsl.g:162:1: rulePlatformType : ( ( rule__PlatformType__Alternatives ) ) ;
    public final void rulePlatformType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__PlatformType__Alternatives ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__PlatformType__Alternatives ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__PlatformType__Alternatives ) )
            // InternalMyDsl.g:168:3: ( rule__PlatformType__Alternatives )
            {
             before(grammarAccess.getPlatformTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:169:3: ( rule__PlatformType__Alternatives )
            // InternalMyDsl.g:169:4: rule__PlatformType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PlatformType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPlatformTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlatformType"


    // $ANTLR start "entryRuleDatabaseName"
    // InternalMyDsl.g:178:1: entryRuleDatabaseName : ruleDatabaseName EOF ;
    public final void entryRuleDatabaseName() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleDatabaseName EOF )
            // InternalMyDsl.g:180:1: ruleDatabaseName EOF
            {
             before(grammarAccess.getDatabaseNameRule()); 
            pushFollow(FOLLOW_1);
            ruleDatabaseName();

            state._fsp--;

             after(grammarAccess.getDatabaseNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDatabaseName"


    // $ANTLR start "ruleDatabaseName"
    // InternalMyDsl.g:187:1: ruleDatabaseName : ( ( rule__DatabaseName__Alternatives ) ) ;
    public final void ruleDatabaseName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__DatabaseName__Alternatives ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__DatabaseName__Alternatives ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__DatabaseName__Alternatives ) )
            // InternalMyDsl.g:193:3: ( rule__DatabaseName__Alternatives )
            {
             before(grammarAccess.getDatabaseNameAccess().getAlternatives()); 
            // InternalMyDsl.g:194:3: ( rule__DatabaseName__Alternatives )
            // InternalMyDsl.g:194:4: rule__DatabaseName__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DatabaseName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseNameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDatabaseName"


    // $ANTLR start "entryRuleDeviceProtocol"
    // InternalMyDsl.g:203:1: entryRuleDeviceProtocol : ruleDeviceProtocol EOF ;
    public final void entryRuleDeviceProtocol() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleDeviceProtocol EOF )
            // InternalMyDsl.g:205:1: ruleDeviceProtocol EOF
            {
             before(grammarAccess.getDeviceProtocolRule()); 
            pushFollow(FOLLOW_1);
            ruleDeviceProtocol();

            state._fsp--;

             after(grammarAccess.getDeviceProtocolRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeviceProtocol"


    // $ANTLR start "ruleDeviceProtocol"
    // InternalMyDsl.g:212:1: ruleDeviceProtocol : ( ( rule__DeviceProtocol__ProtocolNameAssignment ) ) ;
    public final void ruleDeviceProtocol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__DeviceProtocol__ProtocolNameAssignment ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__DeviceProtocol__ProtocolNameAssignment ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__DeviceProtocol__ProtocolNameAssignment ) )
            // InternalMyDsl.g:218:3: ( rule__DeviceProtocol__ProtocolNameAssignment )
            {
             before(grammarAccess.getDeviceProtocolAccess().getProtocolNameAssignment()); 
            // InternalMyDsl.g:219:3: ( rule__DeviceProtocol__ProtocolNameAssignment )
            // InternalMyDsl.g:219:4: rule__DeviceProtocol__ProtocolNameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DeviceProtocol__ProtocolNameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDeviceProtocolAccess().getProtocolNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeviceProtocol"


    // $ANTLR start "entryRuleDeviceAbilities"
    // InternalMyDsl.g:228:1: entryRuleDeviceAbilities : ruleDeviceAbilities EOF ;
    public final void entryRuleDeviceAbilities() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleDeviceAbilities EOF )
            // InternalMyDsl.g:230:1: ruleDeviceAbilities EOF
            {
             before(grammarAccess.getDeviceAbilitiesRule()); 
            pushFollow(FOLLOW_1);
            ruleDeviceAbilities();

            state._fsp--;

             after(grammarAccess.getDeviceAbilitiesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeviceAbilities"


    // $ANTLR start "ruleDeviceAbilities"
    // InternalMyDsl.g:237:1: ruleDeviceAbilities : ( ( rule__DeviceAbilities__Group__0 ) ) ;
    public final void ruleDeviceAbilities() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__DeviceAbilities__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__DeviceAbilities__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__DeviceAbilities__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__DeviceAbilities__Group__0 )
            {
             before(grammarAccess.getDeviceAbilitiesAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__DeviceAbilities__Group__0 )
            // InternalMyDsl.g:244:4: rule__DeviceAbilities__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeviceAbilities__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAbilitiesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeviceAbilities"


    // $ANTLR start "entryRuleInteractionSpec"
    // InternalMyDsl.g:253:1: entryRuleInteractionSpec : ruleInteractionSpec EOF ;
    public final void entryRuleInteractionSpec() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleInteractionSpec EOF )
            // InternalMyDsl.g:255:1: ruleInteractionSpec EOF
            {
             before(grammarAccess.getInteractionSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleInteractionSpec();

            state._fsp--;

             after(grammarAccess.getInteractionSpecRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInteractionSpec"


    // $ANTLR start "ruleInteractionSpec"
    // InternalMyDsl.g:262:1: ruleInteractionSpec : ( ( rule__InteractionSpec__Group__0 ) ) ;
    public final void ruleInteractionSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__InteractionSpec__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__InteractionSpec__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__InteractionSpec__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__InteractionSpec__Group__0 )
            {
             before(grammarAccess.getInteractionSpecAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__InteractionSpec__Group__0 )
            // InternalMyDsl.g:269:4: rule__InteractionSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InteractionSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInteractionSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInteractionSpec"


    // $ANTLR start "entryRuleInteractionName"
    // InternalMyDsl.g:278:1: entryRuleInteractionName : ruleInteractionName EOF ;
    public final void entryRuleInteractionName() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleInteractionName EOF )
            // InternalMyDsl.g:280:1: ruleInteractionName EOF
            {
             before(grammarAccess.getInteractionNameRule()); 
            pushFollow(FOLLOW_1);
            ruleInteractionName();

            state._fsp--;

             after(grammarAccess.getInteractionNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInteractionName"


    // $ANTLR start "ruleInteractionName"
    // InternalMyDsl.g:287:1: ruleInteractionName : ( ( rule__InteractionName__Group__0 ) ) ;
    public final void ruleInteractionName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__InteractionName__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__InteractionName__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__InteractionName__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__InteractionName__Group__0 )
            {
             before(grammarAccess.getInteractionNameAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__InteractionName__Group__0 )
            // InternalMyDsl.g:294:4: rule__InteractionName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InteractionName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInteractionNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInteractionName"


    // $ANTLR start "entryRuleInteractionAction"
    // InternalMyDsl.g:303:1: entryRuleInteractionAction : ruleInteractionAction EOF ;
    public final void entryRuleInteractionAction() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleInteractionAction EOF )
            // InternalMyDsl.g:305:1: ruleInteractionAction EOF
            {
             before(grammarAccess.getInteractionActionRule()); 
            pushFollow(FOLLOW_1);
            ruleInteractionAction();

            state._fsp--;

             after(grammarAccess.getInteractionActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInteractionAction"


    // $ANTLR start "ruleInteractionAction"
    // InternalMyDsl.g:312:1: ruleInteractionAction : ( ( rule__InteractionAction__Group__0 ) ) ;
    public final void ruleInteractionAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__InteractionAction__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__InteractionAction__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__InteractionAction__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__InteractionAction__Group__0 )
            {
             before(grammarAccess.getInteractionActionAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__InteractionAction__Group__0 )
            // InternalMyDsl.g:319:4: rule__InteractionAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InteractionAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInteractionActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInteractionAction"


    // $ANTLR start "entryRuleArchSpec"
    // InternalMyDsl.g:328:1: entryRuleArchSpec : ruleArchSpec EOF ;
    public final void entryRuleArchSpec() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleArchSpec EOF )
            // InternalMyDsl.g:330:1: ruleArchSpec EOF
            {
             before(grammarAccess.getArchSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleArchSpec();

            state._fsp--;

             after(grammarAccess.getArchSpecRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArchSpec"


    // $ANTLR start "ruleArchSpec"
    // InternalMyDsl.g:337:1: ruleArchSpec : ( ( rule__ArchSpec__Group__0 ) ) ;
    public final void ruleArchSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__ArchSpec__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__ArchSpec__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__ArchSpec__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__ArchSpec__Group__0 )
            {
             before(grammarAccess.getArchSpecAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__ArchSpec__Group__0 )
            // InternalMyDsl.g:344:4: rule__ArchSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArchSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArchSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArchSpec"


    // $ANTLR start "entryRuleInBuiltComputationalService"
    // InternalMyDsl.g:353:1: entryRuleInBuiltComputationalService : ruleInBuiltComputationalService EOF ;
    public final void entryRuleInBuiltComputationalService() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleInBuiltComputationalService EOF )
            // InternalMyDsl.g:355:1: ruleInBuiltComputationalService EOF
            {
             before(grammarAccess.getInBuiltComputationalServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleInBuiltComputationalService();

            state._fsp--;

             after(grammarAccess.getInBuiltComputationalServiceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInBuiltComputationalService"


    // $ANTLR start "ruleInBuiltComputationalService"
    // InternalMyDsl.g:362:1: ruleInBuiltComputationalService : ( ( rule__InBuiltComputationalService__Group__0 ) ) ;
    public final void ruleInBuiltComputationalService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__InBuiltComputationalService__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__InBuiltComputationalService__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__InBuiltComputationalService__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__InBuiltComputationalService__Group__0 )
            {
             before(grammarAccess.getInBuiltComputationalServiceAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__InBuiltComputationalService__Group__0 )
            // InternalMyDsl.g:369:4: rule__InBuiltComputationalService__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InBuiltComputationalService__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInBuiltComputationalServiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInBuiltComputationalService"


    // $ANTLR start "entryRulecustomComputationalService"
    // InternalMyDsl.g:378:1: entryRulecustomComputationalService : rulecustomComputationalService EOF ;
    public final void entryRulecustomComputationalService() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( rulecustomComputationalService EOF )
            // InternalMyDsl.g:380:1: rulecustomComputationalService EOF
            {
             before(grammarAccess.getCustomComputationalServiceRule()); 
            pushFollow(FOLLOW_1);
            rulecustomComputationalService();

            state._fsp--;

             after(grammarAccess.getCustomComputationalServiceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecustomComputationalService"


    // $ANTLR start "rulecustomComputationalService"
    // InternalMyDsl.g:387:1: rulecustomComputationalService : ( ( rule__CustomComputationalService__Group__0 ) ) ;
    public final void rulecustomComputationalService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__CustomComputationalService__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__CustomComputationalService__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__CustomComputationalService__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__CustomComputationalService__Group__0 )
            {
             before(grammarAccess.getCustomComputationalServiceAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__CustomComputationalService__Group__0 )
            // InternalMyDsl.g:394:4: rule__CustomComputationalService__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CustomComputationalService__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomComputationalServiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecustomComputationalService"


    // $ANTLR start "entryRuleRequest"
    // InternalMyDsl.g:403:1: entryRuleRequest : ruleRequest EOF ;
    public final void entryRuleRequest() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleRequest EOF )
            // InternalMyDsl.g:405:1: ruleRequest EOF
            {
             before(grammarAccess.getRequestRule()); 
            pushFollow(FOLLOW_1);
            ruleRequest();

            state._fsp--;

             after(grammarAccess.getRequestRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRequest"


    // $ANTLR start "ruleRequest"
    // InternalMyDsl.g:412:1: ruleRequest : ( ( rule__Request__Group__0 ) ) ;
    public final void ruleRequest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__Request__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__Request__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__Request__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__Request__Group__0 )
            {
             before(grammarAccess.getRequestAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__Request__Group__0 )
            // InternalMyDsl.g:419:4: rule__Request__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Request__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequest"


    // $ANTLR start "entryRuleConsumeForInBuilt"
    // InternalMyDsl.g:428:1: entryRuleConsumeForInBuilt : ruleConsumeForInBuilt EOF ;
    public final void entryRuleConsumeForInBuilt() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleConsumeForInBuilt EOF )
            // InternalMyDsl.g:430:1: ruleConsumeForInBuilt EOF
            {
             before(grammarAccess.getConsumeForInBuiltRule()); 
            pushFollow(FOLLOW_1);
            ruleConsumeForInBuilt();

            state._fsp--;

             after(grammarAccess.getConsumeForInBuiltRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConsumeForInBuilt"


    // $ANTLR start "ruleConsumeForInBuilt"
    // InternalMyDsl.g:437:1: ruleConsumeForInBuilt : ( ( rule__ConsumeForInBuilt__Group__0 ) ) ;
    public final void ruleConsumeForInBuilt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__ConsumeForInBuilt__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__ConsumeForInBuilt__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__ConsumeForInBuilt__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__ConsumeForInBuilt__Group__0 )
            {
             before(grammarAccess.getConsumeForInBuiltAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__ConsumeForInBuilt__Group__0 )
            // InternalMyDsl.g:444:4: rule__ConsumeForInBuilt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConsumeForInBuilt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConsumeForInBuiltAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConsumeForInBuilt"


    // $ANTLR start "entryRuleComputeInfoForInBuilt"
    // InternalMyDsl.g:453:1: entryRuleComputeInfoForInBuilt : ruleComputeInfoForInBuilt EOF ;
    public final void entryRuleComputeInfoForInBuilt() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleComputeInfoForInBuilt EOF )
            // InternalMyDsl.g:455:1: ruleComputeInfoForInBuilt EOF
            {
             before(grammarAccess.getComputeInfoForInBuiltRule()); 
            pushFollow(FOLLOW_1);
            ruleComputeInfoForInBuilt();

            state._fsp--;

             after(grammarAccess.getComputeInfoForInBuiltRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComputeInfoForInBuilt"


    // $ANTLR start "ruleComputeInfoForInBuilt"
    // InternalMyDsl.g:462:1: ruleComputeInfoForInBuilt : ( ( rule__ComputeInfoForInBuilt__Group__0 ) ) ;
    public final void ruleComputeInfoForInBuilt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__ComputeInfoForInBuilt__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__ComputeInfoForInBuilt__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__ComputeInfoForInBuilt__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__ComputeInfoForInBuilt__Group__0 )
            {
             before(grammarAccess.getComputeInfoForInBuiltAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__ComputeInfoForInBuilt__Group__0 )
            // InternalMyDsl.g:469:4: rule__ComputeInfoForInBuilt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComputeInfoForInBuilt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComputeInfoForInBuiltAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComputeInfoForInBuilt"


    // $ANTLR start "entryRuleConsume"
    // InternalMyDsl.g:478:1: entryRuleConsume : ruleConsume EOF ;
    public final void entryRuleConsume() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleConsume EOF )
            // InternalMyDsl.g:480:1: ruleConsume EOF
            {
             before(grammarAccess.getConsumeRule()); 
            pushFollow(FOLLOW_1);
            ruleConsume();

            state._fsp--;

             after(grammarAccess.getConsumeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConsume"


    // $ANTLR start "ruleConsume"
    // InternalMyDsl.g:487:1: ruleConsume : ( ( rule__Consume__Group__0 ) ) ;
    public final void ruleConsume() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__Consume__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__Consume__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__Consume__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__Consume__Group__0 )
            {
             before(grammarAccess.getConsumeAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__Consume__Group__0 )
            // InternalMyDsl.g:494:4: rule__Consume__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Consume__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConsumeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConsume"


    // $ANTLR start "entryRuleCommand"
    // InternalMyDsl.g:503:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleCommand EOF )
            // InternalMyDsl.g:505:1: ruleCommand EOF
            {
             before(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getCommandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalMyDsl.g:512:1: ruleCommand : ( ( rule__Command__Group__0 ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__Command__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__Command__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__Command__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__Command__Group__0 )
            {
             before(grammarAccess.getCommandAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__Command__Group__0 )
            // InternalMyDsl.g:519:4: rule__Command__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Command__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleCommandParameter"
    // InternalMyDsl.g:528:1: entryRuleCommandParameter : ruleCommandParameter EOF ;
    public final void entryRuleCommandParameter() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleCommandParameter EOF )
            // InternalMyDsl.g:530:1: ruleCommandParameter EOF
            {
             before(grammarAccess.getCommandParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleCommandParameter();

            state._fsp--;

             after(grammarAccess.getCommandParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommandParameter"


    // $ANTLR start "ruleCommandParameter"
    // InternalMyDsl.g:537:1: ruleCommandParameter : ( ( rule__CommandParameter__Group__0 ) ) ;
    public final void ruleCommandParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__CommandParameter__Group__0 ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__CommandParameter__Group__0 ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__CommandParameter__Group__0 ) )
            // InternalMyDsl.g:543:3: ( rule__CommandParameter__Group__0 )
            {
             before(grammarAccess.getCommandParameterAccess().getGroup()); 
            // InternalMyDsl.g:544:3: ( rule__CommandParameter__Group__0 )
            // InternalMyDsl.g:544:4: rule__CommandParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CommandParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommandParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommandParameter"


    // $ANTLR start "entryRuleVocSpec"
    // InternalMyDsl.g:553:1: entryRuleVocSpec : ruleVocSpec EOF ;
    public final void entryRuleVocSpec() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleVocSpec EOF )
            // InternalMyDsl.g:555:1: ruleVocSpec EOF
            {
             before(grammarAccess.getVocSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleVocSpec();

            state._fsp--;

             after(grammarAccess.getVocSpecRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVocSpec"


    // $ANTLR start "ruleVocSpec"
    // InternalMyDsl.g:562:1: ruleVocSpec : ( ( rule__VocSpec__Group__0 ) ) ;
    public final void ruleVocSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__VocSpec__Group__0 ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__VocSpec__Group__0 ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__VocSpec__Group__0 ) )
            // InternalMyDsl.g:568:3: ( rule__VocSpec__Group__0 )
            {
             before(grammarAccess.getVocSpecAccess().getGroup()); 
            // InternalMyDsl.g:569:3: ( rule__VocSpec__Group__0 )
            // InternalMyDsl.g:569:4: rule__VocSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VocSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVocSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVocSpec"


    // $ANTLR start "entryRuleStruct"
    // InternalMyDsl.g:578:1: entryRuleStruct : ruleStruct EOF ;
    public final void entryRuleStruct() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleStruct EOF )
            // InternalMyDsl.g:580:1: ruleStruct EOF
            {
             before(grammarAccess.getStructRule()); 
            pushFollow(FOLLOW_1);
            ruleStruct();

            state._fsp--;

             after(grammarAccess.getStructRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStruct"


    // $ANTLR start "ruleStruct"
    // InternalMyDsl.g:587:1: ruleStruct : ( ( rule__Struct__Group__0 ) ) ;
    public final void ruleStruct() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( rule__Struct__Group__0 ) ) )
            // InternalMyDsl.g:592:2: ( ( rule__Struct__Group__0 ) )
            {
            // InternalMyDsl.g:592:2: ( ( rule__Struct__Group__0 ) )
            // InternalMyDsl.g:593:3: ( rule__Struct__Group__0 )
            {
             before(grammarAccess.getStructAccess().getGroup()); 
            // InternalMyDsl.g:594:3: ( rule__Struct__Group__0 )
            // InternalMyDsl.g:594:4: rule__Struct__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Struct__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStructAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStruct"


    // $ANTLR start "entryRuleField"
    // InternalMyDsl.g:603:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalMyDsl.g:604:1: ( ruleField EOF )
            // InternalMyDsl.g:605:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalMyDsl.g:612:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalMyDsl.g:617:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalMyDsl.g:617:2: ( ( rule__Field__Group__0 ) )
            // InternalMyDsl.g:618:3: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // InternalMyDsl.g:619:3: ( rule__Field__Group__0 )
            // InternalMyDsl.g:619:4: rule__Field__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRulePeriodicSensors"
    // InternalMyDsl.g:628:1: entryRulePeriodicSensors : rulePeriodicSensors EOF ;
    public final void entryRulePeriodicSensors() throws RecognitionException {
        try {
            // InternalMyDsl.g:629:1: ( rulePeriodicSensors EOF )
            // InternalMyDsl.g:630:1: rulePeriodicSensors EOF
            {
             before(grammarAccess.getPeriodicSensorsRule()); 
            pushFollow(FOLLOW_1);
            rulePeriodicSensors();

            state._fsp--;

             after(grammarAccess.getPeriodicSensorsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePeriodicSensors"


    // $ANTLR start "rulePeriodicSensors"
    // InternalMyDsl.g:637:1: rulePeriodicSensors : ( ( rule__PeriodicSensors__Group__0 ) ) ;
    public final void rulePeriodicSensors() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:2: ( ( ( rule__PeriodicSensors__Group__0 ) ) )
            // InternalMyDsl.g:642:2: ( ( rule__PeriodicSensors__Group__0 ) )
            {
            // InternalMyDsl.g:642:2: ( ( rule__PeriodicSensors__Group__0 ) )
            // InternalMyDsl.g:643:3: ( rule__PeriodicSensors__Group__0 )
            {
             before(grammarAccess.getPeriodicSensorsAccess().getGroup()); 
            // InternalMyDsl.g:644:3: ( rule__PeriodicSensors__Group__0 )
            // InternalMyDsl.g:644:4: rule__PeriodicSensors__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PeriodicSensors__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicSensorsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePeriodicSensors"


    // $ANTLR start "entryRuleSampelingDef"
    // InternalMyDsl.g:653:1: entryRuleSampelingDef : ruleSampelingDef EOF ;
    public final void entryRuleSampelingDef() throws RecognitionException {
        try {
            // InternalMyDsl.g:654:1: ( ruleSampelingDef EOF )
            // InternalMyDsl.g:655:1: ruleSampelingDef EOF
            {
             before(grammarAccess.getSampelingDefRule()); 
            pushFollow(FOLLOW_1);
            ruleSampelingDef();

            state._fsp--;

             after(grammarAccess.getSampelingDefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSampelingDef"


    // $ANTLR start "ruleSampelingDef"
    // InternalMyDsl.g:662:1: ruleSampelingDef : ( ( rule__SampelingDef__Group__0 ) ) ;
    public final void ruleSampelingDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:2: ( ( ( rule__SampelingDef__Group__0 ) ) )
            // InternalMyDsl.g:667:2: ( ( rule__SampelingDef__Group__0 ) )
            {
            // InternalMyDsl.g:667:2: ( ( rule__SampelingDef__Group__0 ) )
            // InternalMyDsl.g:668:3: ( rule__SampelingDef__Group__0 )
            {
             before(grammarAccess.getSampelingDefAccess().getGroup()); 
            // InternalMyDsl.g:669:3: ( rule__SampelingDef__Group__0 )
            // InternalMyDsl.g:669:4: rule__SampelingDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SampelingDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSampelingDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSampelingDef"


    // $ANTLR start "entryRuleEventSensors"
    // InternalMyDsl.g:678:1: entryRuleEventSensors : ruleEventSensors EOF ;
    public final void entryRuleEventSensors() throws RecognitionException {
        try {
            // InternalMyDsl.g:679:1: ( ruleEventSensors EOF )
            // InternalMyDsl.g:680:1: ruleEventSensors EOF
            {
             before(grammarAccess.getEventSensorsRule()); 
            pushFollow(FOLLOW_1);
            ruleEventSensors();

            state._fsp--;

             after(grammarAccess.getEventSensorsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEventSensors"


    // $ANTLR start "ruleEventSensors"
    // InternalMyDsl.g:687:1: ruleEventSensors : ( ( rule__EventSensors__Group__0 ) ) ;
    public final void ruleEventSensors() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:2: ( ( ( rule__EventSensors__Group__0 ) ) )
            // InternalMyDsl.g:692:2: ( ( rule__EventSensors__Group__0 ) )
            {
            // InternalMyDsl.g:692:2: ( ( rule__EventSensors__Group__0 ) )
            // InternalMyDsl.g:693:3: ( rule__EventSensors__Group__0 )
            {
             before(grammarAccess.getEventSensorsAccess().getGroup()); 
            // InternalMyDsl.g:694:3: ( rule__EventSensors__Group__0 )
            // InternalMyDsl.g:694:4: rule__EventSensors__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EventSensors__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventSensorsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventSensors"


    // $ANTLR start "entryRuleOnConditionDef"
    // InternalMyDsl.g:703:1: entryRuleOnConditionDef : ruleOnConditionDef EOF ;
    public final void entryRuleOnConditionDef() throws RecognitionException {
        try {
            // InternalMyDsl.g:704:1: ( ruleOnConditionDef EOF )
            // InternalMyDsl.g:705:1: ruleOnConditionDef EOF
            {
             before(grammarAccess.getOnConditionDefRule()); 
            pushFollow(FOLLOW_1);
            ruleOnConditionDef();

            state._fsp--;

             after(grammarAccess.getOnConditionDefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOnConditionDef"


    // $ANTLR start "ruleOnConditionDef"
    // InternalMyDsl.g:712:1: ruleOnConditionDef : ( ( rule__OnConditionDef__Group__0 ) ) ;
    public final void ruleOnConditionDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:716:2: ( ( ( rule__OnConditionDef__Group__0 ) ) )
            // InternalMyDsl.g:717:2: ( ( rule__OnConditionDef__Group__0 ) )
            {
            // InternalMyDsl.g:717:2: ( ( rule__OnConditionDef__Group__0 ) )
            // InternalMyDsl.g:718:3: ( rule__OnConditionDef__Group__0 )
            {
             before(grammarAccess.getOnConditionDefAccess().getGroup()); 
            // InternalMyDsl.g:719:3: ( rule__OnConditionDef__Group__0 )
            // InternalMyDsl.g:719:4: rule__OnConditionDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OnConditionDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOnConditionDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOnConditionDef"


    // $ANTLR start "entryRuleRequestSensors"
    // InternalMyDsl.g:728:1: entryRuleRequestSensors : ruleRequestSensors EOF ;
    public final void entryRuleRequestSensors() throws RecognitionException {
        try {
            // InternalMyDsl.g:729:1: ( ruleRequestSensors EOF )
            // InternalMyDsl.g:730:1: ruleRequestSensors EOF
            {
             before(grammarAccess.getRequestSensorsRule()); 
            pushFollow(FOLLOW_1);
            ruleRequestSensors();

            state._fsp--;

             after(grammarAccess.getRequestSensorsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRequestSensors"


    // $ANTLR start "ruleRequestSensors"
    // InternalMyDsl.g:737:1: ruleRequestSensors : ( ( rule__RequestSensors__Group__0 ) ) ;
    public final void ruleRequestSensors() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:741:2: ( ( ( rule__RequestSensors__Group__0 ) ) )
            // InternalMyDsl.g:742:2: ( ( rule__RequestSensors__Group__0 ) )
            {
            // InternalMyDsl.g:742:2: ( ( rule__RequestSensors__Group__0 ) )
            // InternalMyDsl.g:743:3: ( rule__RequestSensors__Group__0 )
            {
             before(grammarAccess.getRequestSensorsAccess().getGroup()); 
            // InternalMyDsl.g:744:3: ( rule__RequestSensors__Group__0 )
            // InternalMyDsl.g:744:4: rule__RequestSensors__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RequestSensors__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequestSensorsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequestSensors"


    // $ANTLR start "entryRuleTags"
    // InternalMyDsl.g:753:1: entryRuleTags : ruleTags EOF ;
    public final void entryRuleTags() throws RecognitionException {
        try {
            // InternalMyDsl.g:754:1: ( ruleTags EOF )
            // InternalMyDsl.g:755:1: ruleTags EOF
            {
             before(grammarAccess.getTagsRule()); 
            pushFollow(FOLLOW_1);
            ruleTags();

            state._fsp--;

             after(grammarAccess.getTagsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTags"


    // $ANTLR start "ruleTags"
    // InternalMyDsl.g:762:1: ruleTags : ( ( rule__Tags__Group__0 ) ) ;
    public final void ruleTags() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:766:2: ( ( ( rule__Tags__Group__0 ) ) )
            // InternalMyDsl.g:767:2: ( ( rule__Tags__Group__0 ) )
            {
            // InternalMyDsl.g:767:2: ( ( rule__Tags__Group__0 ) )
            // InternalMyDsl.g:768:3: ( rule__Tags__Group__0 )
            {
             before(grammarAccess.getTagsAccess().getGroup()); 
            // InternalMyDsl.g:769:3: ( rule__Tags__Group__0 )
            // InternalMyDsl.g:769:4: rule__Tags__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tags__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTagsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTags"


    // $ANTLR start "entryRuleEventConditions"
    // InternalMyDsl.g:778:1: entryRuleEventConditions : ruleEventConditions EOF ;
    public final void entryRuleEventConditions() throws RecognitionException {
        try {
            // InternalMyDsl.g:779:1: ( ruleEventConditions EOF )
            // InternalMyDsl.g:780:1: ruleEventConditions EOF
            {
             before(grammarAccess.getEventConditionsRule()); 
            pushFollow(FOLLOW_1);
            ruleEventConditions();

            state._fsp--;

             after(grammarAccess.getEventConditionsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEventConditions"


    // $ANTLR start "ruleEventConditions"
    // InternalMyDsl.g:787:1: ruleEventConditions : ( ( rule__EventConditions__Group__0 ) ) ;
    public final void ruleEventConditions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:791:2: ( ( ( rule__EventConditions__Group__0 ) ) )
            // InternalMyDsl.g:792:2: ( ( rule__EventConditions__Group__0 ) )
            {
            // InternalMyDsl.g:792:2: ( ( rule__EventConditions__Group__0 ) )
            // InternalMyDsl.g:793:3: ( rule__EventConditions__Group__0 )
            {
             before(grammarAccess.getEventConditionsAccess().getGroup()); 
            // InternalMyDsl.g:794:3: ( rule__EventConditions__Group__0 )
            // InternalMyDsl.g:794:4: rule__EventConditions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EventConditions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventConditionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventConditions"


    // $ANTLR start "entryRuleDeviceEntityName"
    // InternalMyDsl.g:803:1: entryRuleDeviceEntityName : ruleDeviceEntityName EOF ;
    public final void entryRuleDeviceEntityName() throws RecognitionException {
        try {
            // InternalMyDsl.g:804:1: ( ruleDeviceEntityName EOF )
            // InternalMyDsl.g:805:1: ruleDeviceEntityName EOF
            {
             before(grammarAccess.getDeviceEntityNameRule()); 
            pushFollow(FOLLOW_1);
            ruleDeviceEntityName();

            state._fsp--;

             after(grammarAccess.getDeviceEntityNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeviceEntityName"


    // $ANTLR start "ruleDeviceEntityName"
    // InternalMyDsl.g:812:1: ruleDeviceEntityName : ( ( rule__DeviceEntityName__NameAssignment ) ) ;
    public final void ruleDeviceEntityName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:816:2: ( ( ( rule__DeviceEntityName__NameAssignment ) ) )
            // InternalMyDsl.g:817:2: ( ( rule__DeviceEntityName__NameAssignment ) )
            {
            // InternalMyDsl.g:817:2: ( ( rule__DeviceEntityName__NameAssignment ) )
            // InternalMyDsl.g:818:3: ( rule__DeviceEntityName__NameAssignment )
            {
             before(grammarAccess.getDeviceEntityNameAccess().getNameAssignment()); 
            // InternalMyDsl.g:819:3: ( rule__DeviceEntityName__NameAssignment )
            // InternalMyDsl.g:819:4: rule__DeviceEntityName__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DeviceEntityName__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDeviceEntityNameAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeviceEntityName"


    // $ANTLR start "entryRuleStructEntityName"
    // InternalMyDsl.g:828:1: entryRuleStructEntityName : ruleStructEntityName EOF ;
    public final void entryRuleStructEntityName() throws RecognitionException {
        try {
            // InternalMyDsl.g:829:1: ( ruleStructEntityName EOF )
            // InternalMyDsl.g:830:1: ruleStructEntityName EOF
            {
             before(grammarAccess.getStructEntityNameRule()); 
            pushFollow(FOLLOW_1);
            ruleStructEntityName();

            state._fsp--;

             after(grammarAccess.getStructEntityNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStructEntityName"


    // $ANTLR start "ruleStructEntityName"
    // InternalMyDsl.g:837:1: ruleStructEntityName : ( ( rule__StructEntityName__NameAssignment ) ) ;
    public final void ruleStructEntityName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:841:2: ( ( ( rule__StructEntityName__NameAssignment ) ) )
            // InternalMyDsl.g:842:2: ( ( rule__StructEntityName__NameAssignment ) )
            {
            // InternalMyDsl.g:842:2: ( ( rule__StructEntityName__NameAssignment ) )
            // InternalMyDsl.g:843:3: ( rule__StructEntityName__NameAssignment )
            {
             before(grammarAccess.getStructEntityNameAccess().getNameAssignment()); 
            // InternalMyDsl.g:844:3: ( rule__StructEntityName__NameAssignment )
            // InternalMyDsl.g:844:4: rule__StructEntityName__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StructEntityName__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStructEntityNameAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStructEntityName"


    // $ANTLR start "entryRuleEntityName"
    // InternalMyDsl.g:853:1: entryRuleEntityName : ruleEntityName EOF ;
    public final void entryRuleEntityName() throws RecognitionException {
        try {
            // InternalMyDsl.g:854:1: ( ruleEntityName EOF )
            // InternalMyDsl.g:855:1: ruleEntityName EOF
            {
             before(grammarAccess.getEntityNameRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityName();

            state._fsp--;

             after(grammarAccess.getEntityNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntityName"


    // $ANTLR start "ruleEntityName"
    // InternalMyDsl.g:862:1: ruleEntityName : ( ( rule__EntityName__NameAssignment ) ) ;
    public final void ruleEntityName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:866:2: ( ( ( rule__EntityName__NameAssignment ) ) )
            // InternalMyDsl.g:867:2: ( ( rule__EntityName__NameAssignment ) )
            {
            // InternalMyDsl.g:867:2: ( ( rule__EntityName__NameAssignment ) )
            // InternalMyDsl.g:868:3: ( rule__EntityName__NameAssignment )
            {
             before(grammarAccess.getEntityNameAccess().getNameAssignment()); 
            // InternalMyDsl.g:869:3: ( rule__EntityName__NameAssignment )
            // InternalMyDsl.g:869:4: rule__EntityName__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__EntityName__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEntityNameAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityName"


    // $ANTLR start "entryRuleGenerate"
    // InternalMyDsl.g:878:1: entryRuleGenerate : ruleGenerate EOF ;
    public final void entryRuleGenerate() throws RecognitionException {
        try {
            // InternalMyDsl.g:879:1: ( ruleGenerate EOF )
            // InternalMyDsl.g:880:1: ruleGenerate EOF
            {
             before(grammarAccess.getGenerateRule()); 
            pushFollow(FOLLOW_1);
            ruleGenerate();

            state._fsp--;

             after(grammarAccess.getGenerateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGenerate"


    // $ANTLR start "ruleGenerate"
    // InternalMyDsl.g:887:1: ruleGenerate : ( ( rule__Generate__Group__0 ) ) ;
    public final void ruleGenerate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:891:2: ( ( ( rule__Generate__Group__0 ) ) )
            // InternalMyDsl.g:892:2: ( ( rule__Generate__Group__0 ) )
            {
            // InternalMyDsl.g:892:2: ( ( rule__Generate__Group__0 ) )
            // InternalMyDsl.g:893:3: ( rule__Generate__Group__0 )
            {
             before(grammarAccess.getGenerateAccess().getGroup()); 
            // InternalMyDsl.g:894:3: ( rule__Generate__Group__0 )
            // InternalMyDsl.g:894:4: rule__Generate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Generate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGenerateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGenerate"


    // $ANTLR start "entryRuleSourceName"
    // InternalMyDsl.g:903:1: entryRuleSourceName : ruleSourceName EOF ;
    public final void entryRuleSourceName() throws RecognitionException {
        try {
            // InternalMyDsl.g:904:1: ( ruleSourceName EOF )
            // InternalMyDsl.g:905:1: ruleSourceName EOF
            {
             before(grammarAccess.getSourceNameRule()); 
            pushFollow(FOLLOW_1);
            ruleSourceName();

            state._fsp--;

             after(grammarAccess.getSourceNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSourceName"


    // $ANTLR start "ruleSourceName"
    // InternalMyDsl.g:912:1: ruleSourceName : ( ( rule__SourceName__NameAssignment ) ) ;
    public final void ruleSourceName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:916:2: ( ( ( rule__SourceName__NameAssignment ) ) )
            // InternalMyDsl.g:917:2: ( ( rule__SourceName__NameAssignment ) )
            {
            // InternalMyDsl.g:917:2: ( ( rule__SourceName__NameAssignment ) )
            // InternalMyDsl.g:918:3: ( rule__SourceName__NameAssignment )
            {
             before(grammarAccess.getSourceNameAccess().getNameAssignment()); 
            // InternalMyDsl.g:919:3: ( rule__SourceName__NameAssignment )
            // InternalMyDsl.g:919:4: rule__SourceName__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SourceName__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSourceNameAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSourceName"


    // $ANTLR start "entryRuleActuator"
    // InternalMyDsl.g:928:1: entryRuleActuator : ruleActuator EOF ;
    public final void entryRuleActuator() throws RecognitionException {
        try {
            // InternalMyDsl.g:929:1: ( ruleActuator EOF )
            // InternalMyDsl.g:930:1: ruleActuator EOF
            {
             before(grammarAccess.getActuatorRule()); 
            pushFollow(FOLLOW_1);
            ruleActuator();

            state._fsp--;

             after(grammarAccess.getActuatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActuator"


    // $ANTLR start "ruleActuator"
    // InternalMyDsl.g:937:1: ruleActuator : ( ( rule__Actuator__Group__0 ) ) ;
    public final void ruleActuator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:941:2: ( ( ( rule__Actuator__Group__0 ) ) )
            // InternalMyDsl.g:942:2: ( ( rule__Actuator__Group__0 ) )
            {
            // InternalMyDsl.g:942:2: ( ( rule__Actuator__Group__0 ) )
            // InternalMyDsl.g:943:3: ( rule__Actuator__Group__0 )
            {
             before(grammarAccess.getActuatorAccess().getGroup()); 
            // InternalMyDsl.g:944:3: ( rule__Actuator__Group__0 )
            // InternalMyDsl.g:944:4: rule__Actuator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActuatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActuator"


    // $ANTLR start "entryRuleAction"
    // InternalMyDsl.g:953:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalMyDsl.g:954:1: ( ruleAction EOF )
            // InternalMyDsl.g:955:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalMyDsl.g:962:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:966:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalMyDsl.g:967:2: ( ( rule__Action__Group__0 ) )
            {
            // InternalMyDsl.g:967:2: ( ( rule__Action__Group__0 ) )
            // InternalMyDsl.g:968:3: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalMyDsl.g:969:3: ( rule__Action__Group__0 )
            // InternalMyDsl.g:969:4: rule__Action__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleActionName"
    // InternalMyDsl.g:978:1: entryRuleActionName : ruleActionName EOF ;
    public final void entryRuleActionName() throws RecognitionException {
        try {
            // InternalMyDsl.g:979:1: ( ruleActionName EOF )
            // InternalMyDsl.g:980:1: ruleActionName EOF
            {
             before(grammarAccess.getActionNameRule()); 
            pushFollow(FOLLOW_1);
            ruleActionName();

            state._fsp--;

             after(grammarAccess.getActionNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActionName"


    // $ANTLR start "ruleActionName"
    // InternalMyDsl.g:987:1: ruleActionName : ( ( rule__ActionName__NameAssignment ) ) ;
    public final void ruleActionName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:991:2: ( ( ( rule__ActionName__NameAssignment ) ) )
            // InternalMyDsl.g:992:2: ( ( rule__ActionName__NameAssignment ) )
            {
            // InternalMyDsl.g:992:2: ( ( rule__ActionName__NameAssignment ) )
            // InternalMyDsl.g:993:3: ( rule__ActionName__NameAssignment )
            {
             before(grammarAccess.getActionNameAccess().getNameAssignment()); 
            // InternalMyDsl.g:994:3: ( rule__ActionName__NameAssignment )
            // InternalMyDsl.g:994:4: rule__ActionName__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ActionName__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getActionNameAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActionName"


    // $ANTLR start "entryRuleParameters"
    // InternalMyDsl.g:1003:1: entryRuleParameters : ruleParameters EOF ;
    public final void entryRuleParameters() throws RecognitionException {
        try {
            // InternalMyDsl.g:1004:1: ( ruleParameters EOF )
            // InternalMyDsl.g:1005:1: ruleParameters EOF
            {
             before(grammarAccess.getParametersRule()); 
            pushFollow(FOLLOW_1);
            ruleParameters();

            state._fsp--;

             after(grammarAccess.getParametersRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameters"


    // $ANTLR start "ruleParameters"
    // InternalMyDsl.g:1012:1: ruleParameters : ( ( rule__Parameters__Group__0 ) ) ;
    public final void ruleParameters() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1016:2: ( ( ( rule__Parameters__Group__0 ) ) )
            // InternalMyDsl.g:1017:2: ( ( rule__Parameters__Group__0 ) )
            {
            // InternalMyDsl.g:1017:2: ( ( rule__Parameters__Group__0 ) )
            // InternalMyDsl.g:1018:3: ( rule__Parameters__Group__0 )
            {
             before(grammarAccess.getParametersAccess().getGroup()); 
            // InternalMyDsl.g:1019:3: ( rule__Parameters__Group__0 )
            // InternalMyDsl.g:1019:4: rule__Parameters__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameters__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParametersAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameters"


    // $ANTLR start "entryRuleParameterName"
    // InternalMyDsl.g:1028:1: entryRuleParameterName : ruleParameterName EOF ;
    public final void entryRuleParameterName() throws RecognitionException {
        try {
            // InternalMyDsl.g:1029:1: ( ruleParameterName EOF )
            // InternalMyDsl.g:1030:1: ruleParameterName EOF
            {
             before(grammarAccess.getParameterNameRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterName();

            state._fsp--;

             after(grammarAccess.getParameterNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterName"


    // $ANTLR start "ruleParameterName"
    // InternalMyDsl.g:1037:1: ruleParameterName : ( ( rule__ParameterName__NameAssignment ) ) ;
    public final void ruleParameterName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1041:2: ( ( ( rule__ParameterName__NameAssignment ) ) )
            // InternalMyDsl.g:1042:2: ( ( rule__ParameterName__NameAssignment ) )
            {
            // InternalMyDsl.g:1042:2: ( ( rule__ParameterName__NameAssignment ) )
            // InternalMyDsl.g:1043:3: ( rule__ParameterName__NameAssignment )
            {
             before(grammarAccess.getParameterNameAccess().getNameAssignment()); 
            // InternalMyDsl.g:1044:3: ( rule__ParameterName__NameAssignment )
            // InternalMyDsl.g:1044:4: rule__ParameterName__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ParameterName__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameterNameAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterName"


    // $ANTLR start "entryRuleStorageService"
    // InternalMyDsl.g:1053:1: entryRuleStorageService : ruleStorageService EOF ;
    public final void entryRuleStorageService() throws RecognitionException {
        try {
            // InternalMyDsl.g:1054:1: ( ruleStorageService EOF )
            // InternalMyDsl.g:1055:1: ruleStorageService EOF
            {
             before(grammarAccess.getStorageServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleStorageService();

            state._fsp--;

             after(grammarAccess.getStorageServiceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStorageService"


    // $ANTLR start "ruleStorageService"
    // InternalMyDsl.g:1062:1: ruleStorageService : ( ( rule__StorageService__Group__0 ) ) ;
    public final void ruleStorageService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1066:2: ( ( ( rule__StorageService__Group__0 ) ) )
            // InternalMyDsl.g:1067:2: ( ( rule__StorageService__Group__0 ) )
            {
            // InternalMyDsl.g:1067:2: ( ( rule__StorageService__Group__0 ) )
            // InternalMyDsl.g:1068:3: ( rule__StorageService__Group__0 )
            {
             before(grammarAccess.getStorageServiceAccess().getGroup()); 
            // InternalMyDsl.g:1069:3: ( rule__StorageService__Group__0 )
            // InternalMyDsl.g:1069:4: rule__StorageService__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StorageService__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStorageServiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStorageService"


    // $ANTLR start "entryRuleDataAccessForRequestSensors"
    // InternalMyDsl.g:1078:1: entryRuleDataAccessForRequestSensors : ruleDataAccessForRequestSensors EOF ;
    public final void entryRuleDataAccessForRequestSensors() throws RecognitionException {
        try {
            // InternalMyDsl.g:1079:1: ( ruleDataAccessForRequestSensors EOF )
            // InternalMyDsl.g:1080:1: ruleDataAccessForRequestSensors EOF
            {
             before(grammarAccess.getDataAccessForRequestSensorsRule()); 
            pushFollow(FOLLOW_1);
            ruleDataAccessForRequestSensors();

            state._fsp--;

             after(grammarAccess.getDataAccessForRequestSensorsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataAccessForRequestSensors"


    // $ANTLR start "ruleDataAccessForRequestSensors"
    // InternalMyDsl.g:1087:1: ruleDataAccessForRequestSensors : ( ( rule__DataAccessForRequestSensors__Group__0 ) ) ;
    public final void ruleDataAccessForRequestSensors() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1091:2: ( ( ( rule__DataAccessForRequestSensors__Group__0 ) ) )
            // InternalMyDsl.g:1092:2: ( ( rule__DataAccessForRequestSensors__Group__0 ) )
            {
            // InternalMyDsl.g:1092:2: ( ( rule__DataAccessForRequestSensors__Group__0 ) )
            // InternalMyDsl.g:1093:3: ( rule__DataAccessForRequestSensors__Group__0 )
            {
             before(grammarAccess.getDataAccessForRequestSensorsAccess().getGroup()); 
            // InternalMyDsl.g:1094:3: ( rule__DataAccessForRequestSensors__Group__0 )
            // InternalMyDsl.g:1094:4: rule__DataAccessForRequestSensors__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataAccessForRequestSensors__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataAccessForRequestSensorsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataAccessForRequestSensors"


    // $ANTLR start "entryRuleDataAccess"
    // InternalMyDsl.g:1103:1: entryRuleDataAccess : ruleDataAccess EOF ;
    public final void entryRuleDataAccess() throws RecognitionException {
        try {
            // InternalMyDsl.g:1104:1: ( ruleDataAccess EOF )
            // InternalMyDsl.g:1105:1: ruleDataAccess EOF
            {
             before(grammarAccess.getDataAccessRule()); 
            pushFollow(FOLLOW_1);
            ruleDataAccess();

            state._fsp--;

             after(grammarAccess.getDataAccessRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataAccess"


    // $ANTLR start "ruleDataAccess"
    // InternalMyDsl.g:1112:1: ruleDataAccess : ( ( rule__DataAccess__Group__0 ) ) ;
    public final void ruleDataAccess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1116:2: ( ( ( rule__DataAccess__Group__0 ) ) )
            // InternalMyDsl.g:1117:2: ( ( rule__DataAccess__Group__0 ) )
            {
            // InternalMyDsl.g:1117:2: ( ( rule__DataAccess__Group__0 ) )
            // InternalMyDsl.g:1118:3: ( rule__DataAccess__Group__0 )
            {
             before(grammarAccess.getDataAccessAccess().getGroup()); 
            // InternalMyDsl.g:1119:3: ( rule__DataAccess__Group__0 )
            // InternalMyDsl.g:1119:4: rule__DataAccess__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataAccess__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataAccessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataAccess"


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:1128:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMyDsl.g:1129:1: ( ruleType EOF )
            // InternalMyDsl.g:1130:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:1137:1: ruleType : ( ( rule__Type__PrimitiveDataTypeAssignment ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1141:2: ( ( ( rule__Type__PrimitiveDataTypeAssignment ) ) )
            // InternalMyDsl.g:1142:2: ( ( rule__Type__PrimitiveDataTypeAssignment ) )
            {
            // InternalMyDsl.g:1142:2: ( ( rule__Type__PrimitiveDataTypeAssignment ) )
            // InternalMyDsl.g:1143:3: ( rule__Type__PrimitiveDataTypeAssignment )
            {
             before(grammarAccess.getTypeAccess().getPrimitiveDataTypeAssignment()); 
            // InternalMyDsl.g:1144:3: ( rule__Type__PrimitiveDataTypeAssignment )
            // InternalMyDsl.g:1144:4: rule__Type__PrimitiveDataTypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Type__PrimitiveDataTypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getPrimitiveDataTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleUnit"
    // InternalMyDsl.g:1153:1: entryRuleUnit : ruleUnit EOF ;
    public final void entryRuleUnit() throws RecognitionException {
        try {
            // InternalMyDsl.g:1154:1: ( ruleUnit EOF )
            // InternalMyDsl.g:1155:1: ruleUnit EOF
            {
             before(grammarAccess.getUnitRule()); 
            pushFollow(FOLLOW_1);
            ruleUnit();

            state._fsp--;

             after(grammarAccess.getUnitRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnit"


    // $ANTLR start "ruleUnit"
    // InternalMyDsl.g:1162:1: ruleUnit : ( ( rule__Unit__Alternatives ) ) ;
    public final void ruleUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1166:2: ( ( ( rule__Unit__Alternatives ) ) )
            // InternalMyDsl.g:1167:2: ( ( rule__Unit__Alternatives ) )
            {
            // InternalMyDsl.g:1167:2: ( ( rule__Unit__Alternatives ) )
            // InternalMyDsl.g:1168:3: ( rule__Unit__Alternatives )
            {
             before(grammarAccess.getUnitAccess().getAlternatives()); 
            // InternalMyDsl.g:1169:3: ( rule__Unit__Alternatives )
            // InternalMyDsl.g:1169:4: rule__Unit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Unit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnitAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnit"


    // $ANTLR start "entryRuleOperationName"
    // InternalMyDsl.g:1178:1: entryRuleOperationName : ruleOperationName EOF ;
    public final void entryRuleOperationName() throws RecognitionException {
        try {
            // InternalMyDsl.g:1179:1: ( ruleOperationName EOF )
            // InternalMyDsl.g:1180:1: ruleOperationName EOF
            {
             before(grammarAccess.getOperationNameRule()); 
            pushFollow(FOLLOW_1);
            ruleOperationName();

            state._fsp--;

             after(grammarAccess.getOperationNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperationName"


    // $ANTLR start "ruleOperationName"
    // InternalMyDsl.g:1187:1: ruleOperationName : ( ( rule__OperationName__NameAssignment ) ) ;
    public final void ruleOperationName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1191:2: ( ( ( rule__OperationName__NameAssignment ) ) )
            // InternalMyDsl.g:1192:2: ( ( rule__OperationName__NameAssignment ) )
            {
            // InternalMyDsl.g:1192:2: ( ( rule__OperationName__NameAssignment ) )
            // InternalMyDsl.g:1193:3: ( rule__OperationName__NameAssignment )
            {
             before(grammarAccess.getOperationNameAccess().getNameAssignment()); 
            // InternalMyDsl.g:1194:3: ( rule__OperationName__NameAssignment )
            // InternalMyDsl.g:1194:4: rule__OperationName__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__OperationName__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getOperationNameAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationName"


    // $ANTLR start "entryRulePrimitiveDataType"
    // InternalMyDsl.g:1203:1: entryRulePrimitiveDataType : rulePrimitiveDataType EOF ;
    public final void entryRulePrimitiveDataType() throws RecognitionException {
        try {
            // InternalMyDsl.g:1204:1: ( rulePrimitiveDataType EOF )
            // InternalMyDsl.g:1205:1: rulePrimitiveDataType EOF
            {
             before(grammarAccess.getPrimitiveDataTypeRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitiveDataType();

            state._fsp--;

             after(grammarAccess.getPrimitiveDataTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitiveDataType"


    // $ANTLR start "rulePrimitiveDataType"
    // InternalMyDsl.g:1212:1: rulePrimitiveDataType : ( ( rule__PrimitiveDataType__Alternatives ) ) ;
    public final void rulePrimitiveDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1216:2: ( ( ( rule__PrimitiveDataType__Alternatives ) ) )
            // InternalMyDsl.g:1217:2: ( ( rule__PrimitiveDataType__Alternatives ) )
            {
            // InternalMyDsl.g:1217:2: ( ( rule__PrimitiveDataType__Alternatives ) )
            // InternalMyDsl.g:1218:3: ( rule__PrimitiveDataType__Alternatives )
            {
             before(grammarAccess.getPrimitiveDataTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:1219:3: ( rule__PrimitiveDataType__Alternatives )
            // InternalMyDsl.g:1219:4: rule__PrimitiveDataType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveDataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveDataTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveDataType"


    // $ANTLR start "rule__Model__Alternatives"
    // InternalMyDsl.g:1227:1: rule__Model__Alternatives : ( ( ( rule__Model__VocSpecAssignment_0 ) ) | ( ( rule__Model__InteractionSpecAssignment_1 ) ) | ( ( rule__Model__ArchSpecAssignment_2 ) ) | ( ( rule__Model__NetworkSpecAssignment_3 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1231:1: ( ( ( rule__Model__VocSpecAssignment_0 ) ) | ( ( rule__Model__InteractionSpecAssignment_1 ) ) | ( ( rule__Model__ArchSpecAssignment_2 ) ) | ( ( rule__Model__NetworkSpecAssignment_3 ) ) )
            int alt1=4;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:1232:2: ( ( rule__Model__VocSpecAssignment_0 ) )
                    {
                    // InternalMyDsl.g:1232:2: ( ( rule__Model__VocSpecAssignment_0 ) )
                    // InternalMyDsl.g:1233:3: ( rule__Model__VocSpecAssignment_0 )
                    {
                     before(grammarAccess.getModelAccess().getVocSpecAssignment_0()); 
                    // InternalMyDsl.g:1234:3: ( rule__Model__VocSpecAssignment_0 )
                    // InternalMyDsl.g:1234:4: rule__Model__VocSpecAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__VocSpecAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getVocSpecAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1238:2: ( ( rule__Model__InteractionSpecAssignment_1 ) )
                    {
                    // InternalMyDsl.g:1238:2: ( ( rule__Model__InteractionSpecAssignment_1 ) )
                    // InternalMyDsl.g:1239:3: ( rule__Model__InteractionSpecAssignment_1 )
                    {
                     before(grammarAccess.getModelAccess().getInteractionSpecAssignment_1()); 
                    // InternalMyDsl.g:1240:3: ( rule__Model__InteractionSpecAssignment_1 )
                    // InternalMyDsl.g:1240:4: rule__Model__InteractionSpecAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__InteractionSpecAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getInteractionSpecAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1244:2: ( ( rule__Model__ArchSpecAssignment_2 ) )
                    {
                    // InternalMyDsl.g:1244:2: ( ( rule__Model__ArchSpecAssignment_2 ) )
                    // InternalMyDsl.g:1245:3: ( rule__Model__ArchSpecAssignment_2 )
                    {
                     before(grammarAccess.getModelAccess().getArchSpecAssignment_2()); 
                    // InternalMyDsl.g:1246:3: ( rule__Model__ArchSpecAssignment_2 )
                    // InternalMyDsl.g:1246:4: rule__Model__ArchSpecAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ArchSpecAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getArchSpecAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1250:2: ( ( rule__Model__NetworkSpecAssignment_3 ) )
                    {
                    // InternalMyDsl.g:1250:2: ( ( rule__Model__NetworkSpecAssignment_3 ) )
                    // InternalMyDsl.g:1251:3: ( rule__Model__NetworkSpecAssignment_3 )
                    {
                     before(grammarAccess.getModelAccess().getNetworkSpecAssignment_3()); 
                    // InternalMyDsl.g:1252:3: ( rule__Model__NetworkSpecAssignment_3 )
                    // InternalMyDsl.g:1252:4: rule__Model__NetworkSpecAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__NetworkSpecAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getNetworkSpecAssignment_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Alternatives"


    // $ANTLR start "rule__PlatformType__Alternatives"
    // InternalMyDsl.g:1260:1: rule__PlatformType__Alternatives : ( ( ( rule__PlatformType__DeviceTypeAssignment_0 ) ) | ( ( rule__PlatformType__DeviceTypeAssignment_1 ) ) | ( ( rule__PlatformType__DeviceTypeAssignment_2 ) ) );
    public final void rule__PlatformType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1264:1: ( ( ( rule__PlatformType__DeviceTypeAssignment_0 ) ) | ( ( rule__PlatformType__DeviceTypeAssignment_1 ) ) | ( ( rule__PlatformType__DeviceTypeAssignment_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt2=1;
                }
                break;
            case 52:
                {
                alt2=2;
                }
                break;
            case 53:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:1265:2: ( ( rule__PlatformType__DeviceTypeAssignment_0 ) )
                    {
                    // InternalMyDsl.g:1265:2: ( ( rule__PlatformType__DeviceTypeAssignment_0 ) )
                    // InternalMyDsl.g:1266:3: ( rule__PlatformType__DeviceTypeAssignment_0 )
                    {
                     before(grammarAccess.getPlatformTypeAccess().getDeviceTypeAssignment_0()); 
                    // InternalMyDsl.g:1267:3: ( rule__PlatformType__DeviceTypeAssignment_0 )
                    // InternalMyDsl.g:1267:4: rule__PlatformType__DeviceTypeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlatformType__DeviceTypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlatformTypeAccess().getDeviceTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1271:2: ( ( rule__PlatformType__DeviceTypeAssignment_1 ) )
                    {
                    // InternalMyDsl.g:1271:2: ( ( rule__PlatformType__DeviceTypeAssignment_1 ) )
                    // InternalMyDsl.g:1272:3: ( rule__PlatformType__DeviceTypeAssignment_1 )
                    {
                     before(grammarAccess.getPlatformTypeAccess().getDeviceTypeAssignment_1()); 
                    // InternalMyDsl.g:1273:3: ( rule__PlatformType__DeviceTypeAssignment_1 )
                    // InternalMyDsl.g:1273:4: rule__PlatformType__DeviceTypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlatformType__DeviceTypeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlatformTypeAccess().getDeviceTypeAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1277:2: ( ( rule__PlatformType__DeviceTypeAssignment_2 ) )
                    {
                    // InternalMyDsl.g:1277:2: ( ( rule__PlatformType__DeviceTypeAssignment_2 ) )
                    // InternalMyDsl.g:1278:3: ( rule__PlatformType__DeviceTypeAssignment_2 )
                    {
                     before(grammarAccess.getPlatformTypeAccess().getDeviceTypeAssignment_2()); 
                    // InternalMyDsl.g:1279:3: ( rule__PlatformType__DeviceTypeAssignment_2 )
                    // InternalMyDsl.g:1279:4: rule__PlatformType__DeviceTypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlatformType__DeviceTypeAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlatformTypeAccess().getDeviceTypeAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformType__Alternatives"


    // $ANTLR start "rule__DatabaseName__Alternatives"
    // InternalMyDsl.g:1287:1: rule__DatabaseName__Alternatives : ( ( ( rule__DatabaseName__InstalledDatabaseAssignment_0 ) ) | ( ( rule__DatabaseName__InstalledDatabaseAssignment_1 ) ) | ( ( rule__DatabaseName__InstalledDatabaseAssignment_2 ) ) );
    public final void rule__DatabaseName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1291:1: ( ( ( rule__DatabaseName__InstalledDatabaseAssignment_0 ) ) | ( ( rule__DatabaseName__InstalledDatabaseAssignment_1 ) ) | ( ( rule__DatabaseName__InstalledDatabaseAssignment_2 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt3=1;
                }
                break;
            case 55:
                {
                alt3=2;
                }
                break;
            case 56:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:1292:2: ( ( rule__DatabaseName__InstalledDatabaseAssignment_0 ) )
                    {
                    // InternalMyDsl.g:1292:2: ( ( rule__DatabaseName__InstalledDatabaseAssignment_0 ) )
                    // InternalMyDsl.g:1293:3: ( rule__DatabaseName__InstalledDatabaseAssignment_0 )
                    {
                     before(grammarAccess.getDatabaseNameAccess().getInstalledDatabaseAssignment_0()); 
                    // InternalMyDsl.g:1294:3: ( rule__DatabaseName__InstalledDatabaseAssignment_0 )
                    // InternalMyDsl.g:1294:4: rule__DatabaseName__InstalledDatabaseAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DatabaseName__InstalledDatabaseAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDatabaseNameAccess().getInstalledDatabaseAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1298:2: ( ( rule__DatabaseName__InstalledDatabaseAssignment_1 ) )
                    {
                    // InternalMyDsl.g:1298:2: ( ( rule__DatabaseName__InstalledDatabaseAssignment_1 ) )
                    // InternalMyDsl.g:1299:3: ( rule__DatabaseName__InstalledDatabaseAssignment_1 )
                    {
                     before(grammarAccess.getDatabaseNameAccess().getInstalledDatabaseAssignment_1()); 
                    // InternalMyDsl.g:1300:3: ( rule__DatabaseName__InstalledDatabaseAssignment_1 )
                    // InternalMyDsl.g:1300:4: rule__DatabaseName__InstalledDatabaseAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DatabaseName__InstalledDatabaseAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDatabaseNameAccess().getInstalledDatabaseAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1304:2: ( ( rule__DatabaseName__InstalledDatabaseAssignment_2 ) )
                    {
                    // InternalMyDsl.g:1304:2: ( ( rule__DatabaseName__InstalledDatabaseAssignment_2 ) )
                    // InternalMyDsl.g:1305:3: ( rule__DatabaseName__InstalledDatabaseAssignment_2 )
                    {
                     before(grammarAccess.getDatabaseNameAccess().getInstalledDatabaseAssignment_2()); 
                    // InternalMyDsl.g:1306:3: ( rule__DatabaseName__InstalledDatabaseAssignment_2 )
                    // InternalMyDsl.g:1306:4: rule__DatabaseName__InstalledDatabaseAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__DatabaseName__InstalledDatabaseAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getDatabaseNameAccess().getInstalledDatabaseAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseName__Alternatives"


    // $ANTLR start "rule__EventConditions__Alternatives_1"
    // InternalMyDsl.g:1314:1: rule__EventConditions__Alternatives_1 : ( ( '>' ) | ( '<' ) | ( '=' ) );
    public final void rule__EventConditions__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1318:1: ( ( '>' ) | ( '<' ) | ( '=' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:1319:2: ( '>' )
                    {
                    // InternalMyDsl.g:1319:2: ( '>' )
                    // InternalMyDsl.g:1320:3: '>'
                    {
                     before(grammarAccess.getEventConditionsAccess().getGreaterThanSignKeyword_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEventConditionsAccess().getGreaterThanSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1325:2: ( '<' )
                    {
                    // InternalMyDsl.g:1325:2: ( '<' )
                    // InternalMyDsl.g:1326:3: '<'
                    {
                     before(grammarAccess.getEventConditionsAccess().getLessThanSignKeyword_1_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEventConditionsAccess().getLessThanSignKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1331:2: ( '=' )
                    {
                    // InternalMyDsl.g:1331:2: ( '=' )
                    // InternalMyDsl.g:1332:3: '='
                    {
                     before(grammarAccess.getEventConditionsAccess().getEqualsSignKeyword_1_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEventConditionsAccess().getEqualsSignKeyword_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventConditions__Alternatives_1"


    // $ANTLR start "rule__Unit__Alternatives"
    // InternalMyDsl.g:1341:1: rule__Unit__Alternatives : ( ( ( rule__Unit__NameAssignment_0 ) ) | ( ( rule__Unit__NameAssignment_1 ) ) | ( ( rule__Unit__NameAssignment_2 ) ) | ( ( rule__Unit__NameAssignment_3 ) ) | ( ( rule__Unit__NameAssignment_4 ) ) );
    public final void rule__Unit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1345:1: ( ( ( rule__Unit__NameAssignment_0 ) ) | ( ( rule__Unit__NameAssignment_1 ) ) | ( ( rule__Unit__NameAssignment_2 ) ) | ( ( rule__Unit__NameAssignment_3 ) ) | ( ( rule__Unit__NameAssignment_4 ) ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt5=1;
                }
                break;
            case 59:
                {
                alt5=2;
                }
                break;
            case 60:
                {
                alt5=3;
                }
                break;
            case 61:
                {
                alt5=4;
                }
                break;
            case 62:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:1346:2: ( ( rule__Unit__NameAssignment_0 ) )
                    {
                    // InternalMyDsl.g:1346:2: ( ( rule__Unit__NameAssignment_0 ) )
                    // InternalMyDsl.g:1347:3: ( rule__Unit__NameAssignment_0 )
                    {
                     before(grammarAccess.getUnitAccess().getNameAssignment_0()); 
                    // InternalMyDsl.g:1348:3: ( rule__Unit__NameAssignment_0 )
                    // InternalMyDsl.g:1348:4: rule__Unit__NameAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Unit__NameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnitAccess().getNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1352:2: ( ( rule__Unit__NameAssignment_1 ) )
                    {
                    // InternalMyDsl.g:1352:2: ( ( rule__Unit__NameAssignment_1 ) )
                    // InternalMyDsl.g:1353:3: ( rule__Unit__NameAssignment_1 )
                    {
                     before(grammarAccess.getUnitAccess().getNameAssignment_1()); 
                    // InternalMyDsl.g:1354:3: ( rule__Unit__NameAssignment_1 )
                    // InternalMyDsl.g:1354:4: rule__Unit__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Unit__NameAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnitAccess().getNameAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1358:2: ( ( rule__Unit__NameAssignment_2 ) )
                    {
                    // InternalMyDsl.g:1358:2: ( ( rule__Unit__NameAssignment_2 ) )
                    // InternalMyDsl.g:1359:3: ( rule__Unit__NameAssignment_2 )
                    {
                     before(grammarAccess.getUnitAccess().getNameAssignment_2()); 
                    // InternalMyDsl.g:1360:3: ( rule__Unit__NameAssignment_2 )
                    // InternalMyDsl.g:1360:4: rule__Unit__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Unit__NameAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnitAccess().getNameAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1364:2: ( ( rule__Unit__NameAssignment_3 ) )
                    {
                    // InternalMyDsl.g:1364:2: ( ( rule__Unit__NameAssignment_3 ) )
                    // InternalMyDsl.g:1365:3: ( rule__Unit__NameAssignment_3 )
                    {
                     before(grammarAccess.getUnitAccess().getNameAssignment_3()); 
                    // InternalMyDsl.g:1366:3: ( rule__Unit__NameAssignment_3 )
                    // InternalMyDsl.g:1366:4: rule__Unit__NameAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Unit__NameAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnitAccess().getNameAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1370:2: ( ( rule__Unit__NameAssignment_4 ) )
                    {
                    // InternalMyDsl.g:1370:2: ( ( rule__Unit__NameAssignment_4 ) )
                    // InternalMyDsl.g:1371:3: ( rule__Unit__NameAssignment_4 )
                    {
                     before(grammarAccess.getUnitAccess().getNameAssignment_4()); 
                    // InternalMyDsl.g:1372:3: ( rule__Unit__NameAssignment_4 )
                    // InternalMyDsl.g:1372:4: rule__Unit__NameAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Unit__NameAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnitAccess().getNameAssignment_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unit__Alternatives"


    // $ANTLR start "rule__PrimitiveDataType__Alternatives"
    // InternalMyDsl.g:1380:1: rule__PrimitiveDataType__Alternatives : ( ( ( rule__PrimitiveDataType__INTEGERAssignment_0 ) ) | ( ( rule__PrimitiveDataType__BOOLEANAssignment_1 ) ) | ( ( rule__PrimitiveDataType__STRINGAssignment_2 ) ) | ( ( rule__PrimitiveDataType__LONGAssignment_3 ) ) | ( ( rule__PrimitiveDataType__DOUBLEAssignment_4 ) ) | ( ( rule__PrimitiveDataType__StructDefAssignment_5 ) ) );
    public final void rule__PrimitiveDataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1384:1: ( ( ( rule__PrimitiveDataType__INTEGERAssignment_0 ) ) | ( ( rule__PrimitiveDataType__BOOLEANAssignment_1 ) ) | ( ( rule__PrimitiveDataType__STRINGAssignment_2 ) ) | ( ( rule__PrimitiveDataType__LONGAssignment_3 ) ) | ( ( rule__PrimitiveDataType__DOUBLEAssignment_4 ) ) | ( ( rule__PrimitiveDataType__StructDefAssignment_5 ) ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt6=1;
                }
                break;
            case 65:
                {
                alt6=2;
                }
                break;
            case 66:
                {
                alt6=3;
                }
                break;
            case 67:
                {
                alt6=4;
                }
                break;
            case 68:
                {
                alt6=5;
                }
                break;
            case RULE_ID:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:1385:2: ( ( rule__PrimitiveDataType__INTEGERAssignment_0 ) )
                    {
                    // InternalMyDsl.g:1385:2: ( ( rule__PrimitiveDataType__INTEGERAssignment_0 ) )
                    // InternalMyDsl.g:1386:3: ( rule__PrimitiveDataType__INTEGERAssignment_0 )
                    {
                     before(grammarAccess.getPrimitiveDataTypeAccess().getINTEGERAssignment_0()); 
                    // InternalMyDsl.g:1387:3: ( rule__PrimitiveDataType__INTEGERAssignment_0 )
                    // InternalMyDsl.g:1387:4: rule__PrimitiveDataType__INTEGERAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveDataType__INTEGERAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveDataTypeAccess().getINTEGERAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1391:2: ( ( rule__PrimitiveDataType__BOOLEANAssignment_1 ) )
                    {
                    // InternalMyDsl.g:1391:2: ( ( rule__PrimitiveDataType__BOOLEANAssignment_1 ) )
                    // InternalMyDsl.g:1392:3: ( rule__PrimitiveDataType__BOOLEANAssignment_1 )
                    {
                     before(grammarAccess.getPrimitiveDataTypeAccess().getBOOLEANAssignment_1()); 
                    // InternalMyDsl.g:1393:3: ( rule__PrimitiveDataType__BOOLEANAssignment_1 )
                    // InternalMyDsl.g:1393:4: rule__PrimitiveDataType__BOOLEANAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveDataType__BOOLEANAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveDataTypeAccess().getBOOLEANAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1397:2: ( ( rule__PrimitiveDataType__STRINGAssignment_2 ) )
                    {
                    // InternalMyDsl.g:1397:2: ( ( rule__PrimitiveDataType__STRINGAssignment_2 ) )
                    // InternalMyDsl.g:1398:3: ( rule__PrimitiveDataType__STRINGAssignment_2 )
                    {
                     before(grammarAccess.getPrimitiveDataTypeAccess().getSTRINGAssignment_2()); 
                    // InternalMyDsl.g:1399:3: ( rule__PrimitiveDataType__STRINGAssignment_2 )
                    // InternalMyDsl.g:1399:4: rule__PrimitiveDataType__STRINGAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveDataType__STRINGAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveDataTypeAccess().getSTRINGAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1403:2: ( ( rule__PrimitiveDataType__LONGAssignment_3 ) )
                    {
                    // InternalMyDsl.g:1403:2: ( ( rule__PrimitiveDataType__LONGAssignment_3 ) )
                    // InternalMyDsl.g:1404:3: ( rule__PrimitiveDataType__LONGAssignment_3 )
                    {
                     before(grammarAccess.getPrimitiveDataTypeAccess().getLONGAssignment_3()); 
                    // InternalMyDsl.g:1405:3: ( rule__PrimitiveDataType__LONGAssignment_3 )
                    // InternalMyDsl.g:1405:4: rule__PrimitiveDataType__LONGAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveDataType__LONGAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveDataTypeAccess().getLONGAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1409:2: ( ( rule__PrimitiveDataType__DOUBLEAssignment_4 ) )
                    {
                    // InternalMyDsl.g:1409:2: ( ( rule__PrimitiveDataType__DOUBLEAssignment_4 ) )
                    // InternalMyDsl.g:1410:3: ( rule__PrimitiveDataType__DOUBLEAssignment_4 )
                    {
                     before(grammarAccess.getPrimitiveDataTypeAccess().getDOUBLEAssignment_4()); 
                    // InternalMyDsl.g:1411:3: ( rule__PrimitiveDataType__DOUBLEAssignment_4 )
                    // InternalMyDsl.g:1411:4: rule__PrimitiveDataType__DOUBLEAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveDataType__DOUBLEAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveDataTypeAccess().getDOUBLEAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1415:2: ( ( rule__PrimitiveDataType__StructDefAssignment_5 ) )
                    {
                    // InternalMyDsl.g:1415:2: ( ( rule__PrimitiveDataType__StructDefAssignment_5 ) )
                    // InternalMyDsl.g:1416:3: ( rule__PrimitiveDataType__StructDefAssignment_5 )
                    {
                     before(grammarAccess.getPrimitiveDataTypeAccess().getStructDefAssignment_5()); 
                    // InternalMyDsl.g:1417:3: ( rule__PrimitiveDataType__StructDefAssignment_5 )
                    // InternalMyDsl.g:1417:4: rule__PrimitiveDataType__StructDefAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveDataType__StructDefAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveDataTypeAccess().getStructDefAssignment_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveDataType__Alternatives"


    // $ANTLR start "rule__DeploymentSpec__Group__0"
    // InternalMyDsl.g:1425:1: rule__DeploymentSpec__Group__0 : rule__DeploymentSpec__Group__0__Impl rule__DeploymentSpec__Group__1 ;
    public final void rule__DeploymentSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1429:1: ( rule__DeploymentSpec__Group__0__Impl rule__DeploymentSpec__Group__1 )
            // InternalMyDsl.g:1430:2: rule__DeploymentSpec__Group__0__Impl rule__DeploymentSpec__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DeploymentSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeploymentSpec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeploymentSpec__Group__0"


    // $ANTLR start "rule__DeploymentSpec__Group__0__Impl"
    // InternalMyDsl.g:1437:1: rule__DeploymentSpec__Group__0__Impl : ( 'devices:' ) ;
    public final void rule__DeploymentSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1441:1: ( ( 'devices:' ) )
            // InternalMyDsl.g:1442:1: ( 'devices:' )
            {
            // InternalMyDsl.g:1442:1: ( 'devices:' )
            // InternalMyDsl.g:1443:2: 'devices:'
            {
             before(grammarAccess.getDeploymentSpecAccess().getDevicesKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDeploymentSpecAccess().getDevicesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeploymentSpec__Group__0__Impl"


    // $ANTLR start "rule__DeploymentSpec__Group__1"
    // InternalMyDsl.g:1452:1: rule__DeploymentSpec__Group__1 : rule__DeploymentSpec__Group__1__Impl ;
    public final void rule__DeploymentSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1456:1: ( rule__DeploymentSpec__Group__1__Impl )
            // InternalMyDsl.g:1457:2: rule__DeploymentSpec__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeploymentSpec__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeploymentSpec__Group__1"


    // $ANTLR start "rule__DeploymentSpec__Group__1__Impl"
    // InternalMyDsl.g:1463:1: rule__DeploymentSpec__Group__1__Impl : ( ( rule__DeploymentSpec__DevicesAssignment_1 )* ) ;
    public final void rule__DeploymentSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1467:1: ( ( ( rule__DeploymentSpec__DevicesAssignment_1 )* ) )
            // InternalMyDsl.g:1468:1: ( ( rule__DeploymentSpec__DevicesAssignment_1 )* )
            {
            // InternalMyDsl.g:1468:1: ( ( rule__DeploymentSpec__DevicesAssignment_1 )* )
            // InternalMyDsl.g:1469:2: ( rule__DeploymentSpec__DevicesAssignment_1 )*
            {
             before(grammarAccess.getDeploymentSpecAccess().getDevicesAssignment_1()); 
            // InternalMyDsl.g:1470:2: ( rule__DeploymentSpec__DevicesAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:1470:3: rule__DeploymentSpec__DevicesAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__DeploymentSpec__DevicesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getDeploymentSpecAccess().getDevicesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeploymentSpec__Group__1__Impl"


    // $ANTLR start "rule__Device__Group__0"
    // InternalMyDsl.g:1479:1: rule__Device__Group__0 : rule__Device__Group__0__Impl rule__Device__Group__1 ;
    public final void rule__Device__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1483:1: ( rule__Device__Group__0__Impl rule__Device__Group__1 )
            // InternalMyDsl.g:1484:2: rule__Device__Group__0__Impl rule__Device__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Device__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__0"


    // $ANTLR start "rule__Device__Group__0__Impl"
    // InternalMyDsl.g:1491:1: rule__Device__Group__0__Impl : ( ( rule__Device__DeviceNameAssignment_0 ) ) ;
    public final void rule__Device__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1495:1: ( ( ( rule__Device__DeviceNameAssignment_0 ) ) )
            // InternalMyDsl.g:1496:1: ( ( rule__Device__DeviceNameAssignment_0 ) )
            {
            // InternalMyDsl.g:1496:1: ( ( rule__Device__DeviceNameAssignment_0 ) )
            // InternalMyDsl.g:1497:2: ( rule__Device__DeviceNameAssignment_0 )
            {
             before(grammarAccess.getDeviceAccess().getDeviceNameAssignment_0()); 
            // InternalMyDsl.g:1498:2: ( rule__Device__DeviceNameAssignment_0 )
            // InternalMyDsl.g:1498:3: rule__Device__DeviceNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Device__DeviceNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getDeviceNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__0__Impl"


    // $ANTLR start "rule__Device__Group__1"
    // InternalMyDsl.g:1506:1: rule__Device__Group__1 : rule__Device__Group__1__Impl rule__Device__Group__2 ;
    public final void rule__Device__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1510:1: ( rule__Device__Group__1__Impl rule__Device__Group__2 )
            // InternalMyDsl.g:1511:2: rule__Device__Group__1__Impl rule__Device__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Device__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__1"


    // $ANTLR start "rule__Device__Group__1__Impl"
    // InternalMyDsl.g:1518:1: rule__Device__Group__1__Impl : ( ':' ) ;
    public final void rule__Device__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1522:1: ( ( ':' ) )
            // InternalMyDsl.g:1523:1: ( ':' )
            {
            // InternalMyDsl.g:1523:1: ( ':' )
            // InternalMyDsl.g:1524:2: ':'
            {
             before(grammarAccess.getDeviceAccess().getColonKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__1__Impl"


    // $ANTLR start "rule__Device__Group__2"
    // InternalMyDsl.g:1533:1: rule__Device__Group__2 : rule__Device__Group__2__Impl rule__Device__Group__3 ;
    public final void rule__Device__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1537:1: ( rule__Device__Group__2__Impl rule__Device__Group__3 )
            // InternalMyDsl.g:1538:2: rule__Device__Group__2__Impl rule__Device__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Device__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__2"


    // $ANTLR start "rule__Device__Group__2__Impl"
    // InternalMyDsl.g:1545:1: rule__Device__Group__2__Impl : ( 'location:' ) ;
    public final void rule__Device__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1549:1: ( ( 'location:' ) )
            // InternalMyDsl.g:1550:1: ( 'location:' )
            {
            // InternalMyDsl.g:1550:1: ( 'location:' )
            // InternalMyDsl.g:1551:2: 'location:'
            {
             before(grammarAccess.getDeviceAccess().getLocationKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getLocationKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__2__Impl"


    // $ANTLR start "rule__Device__Group__3"
    // InternalMyDsl.g:1560:1: rule__Device__Group__3 : rule__Device__Group__3__Impl rule__Device__Group__4 ;
    public final void rule__Device__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1564:1: ( rule__Device__Group__3__Impl rule__Device__Group__4 )
            // InternalMyDsl.g:1565:2: rule__Device__Group__3__Impl rule__Device__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Device__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__3"


    // $ANTLR start "rule__Device__Group__3__Impl"
    // InternalMyDsl.g:1572:1: rule__Device__Group__3__Impl : ( ( rule__Device__DeviceLocationAssignment_3 ) ) ;
    public final void rule__Device__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1576:1: ( ( ( rule__Device__DeviceLocationAssignment_3 ) ) )
            // InternalMyDsl.g:1577:1: ( ( rule__Device__DeviceLocationAssignment_3 ) )
            {
            // InternalMyDsl.g:1577:1: ( ( rule__Device__DeviceLocationAssignment_3 ) )
            // InternalMyDsl.g:1578:2: ( rule__Device__DeviceLocationAssignment_3 )
            {
             before(grammarAccess.getDeviceAccess().getDeviceLocationAssignment_3()); 
            // InternalMyDsl.g:1579:2: ( rule__Device__DeviceLocationAssignment_3 )
            // InternalMyDsl.g:1579:3: rule__Device__DeviceLocationAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Device__DeviceLocationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getDeviceLocationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__3__Impl"


    // $ANTLR start "rule__Device__Group__4"
    // InternalMyDsl.g:1587:1: rule__Device__Group__4 : rule__Device__Group__4__Impl rule__Device__Group__5 ;
    public final void rule__Device__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1591:1: ( rule__Device__Group__4__Impl rule__Device__Group__5 )
            // InternalMyDsl.g:1592:2: rule__Device__Group__4__Impl rule__Device__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Device__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__4"


    // $ANTLR start "rule__Device__Group__4__Impl"
    // InternalMyDsl.g:1599:1: rule__Device__Group__4__Impl : ( ';' ) ;
    public final void rule__Device__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1603:1: ( ( ';' ) )
            // InternalMyDsl.g:1604:1: ( ';' )
            {
            // InternalMyDsl.g:1604:1: ( ';' )
            // InternalMyDsl.g:1605:2: ';'
            {
             before(grammarAccess.getDeviceAccess().getSemicolonKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__4__Impl"


    // $ANTLR start "rule__Device__Group__5"
    // InternalMyDsl.g:1614:1: rule__Device__Group__5 : rule__Device__Group__5__Impl rule__Device__Group__6 ;
    public final void rule__Device__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1618:1: ( rule__Device__Group__5__Impl rule__Device__Group__6 )
            // InternalMyDsl.g:1619:2: rule__Device__Group__5__Impl rule__Device__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Device__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__5"


    // $ANTLR start "rule__Device__Group__5__Impl"
    // InternalMyDsl.g:1626:1: rule__Device__Group__5__Impl : ( 'platform:' ) ;
    public final void rule__Device__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1630:1: ( ( 'platform:' ) )
            // InternalMyDsl.g:1631:1: ( 'platform:' )
            {
            // InternalMyDsl.g:1631:1: ( 'platform:' )
            // InternalMyDsl.g:1632:2: 'platform:'
            {
             before(grammarAccess.getDeviceAccess().getPlatformKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getPlatformKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__5__Impl"


    // $ANTLR start "rule__Device__Group__6"
    // InternalMyDsl.g:1641:1: rule__Device__Group__6 : rule__Device__Group__6__Impl rule__Device__Group__7 ;
    public final void rule__Device__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1645:1: ( rule__Device__Group__6__Impl rule__Device__Group__7 )
            // InternalMyDsl.g:1646:2: rule__Device__Group__6__Impl rule__Device__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Device__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__6"


    // $ANTLR start "rule__Device__Group__6__Impl"
    // InternalMyDsl.g:1653:1: rule__Device__Group__6__Impl : ( ( rule__Device__PlatformTypeAssignment_6 ) ) ;
    public final void rule__Device__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1657:1: ( ( ( rule__Device__PlatformTypeAssignment_6 ) ) )
            // InternalMyDsl.g:1658:1: ( ( rule__Device__PlatformTypeAssignment_6 ) )
            {
            // InternalMyDsl.g:1658:1: ( ( rule__Device__PlatformTypeAssignment_6 ) )
            // InternalMyDsl.g:1659:2: ( rule__Device__PlatformTypeAssignment_6 )
            {
             before(grammarAccess.getDeviceAccess().getPlatformTypeAssignment_6()); 
            // InternalMyDsl.g:1660:2: ( rule__Device__PlatformTypeAssignment_6 )
            // InternalMyDsl.g:1660:3: rule__Device__PlatformTypeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Device__PlatformTypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getPlatformTypeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__6__Impl"


    // $ANTLR start "rule__Device__Group__7"
    // InternalMyDsl.g:1668:1: rule__Device__Group__7 : rule__Device__Group__7__Impl rule__Device__Group__8 ;
    public final void rule__Device__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1672:1: ( rule__Device__Group__7__Impl rule__Device__Group__8 )
            // InternalMyDsl.g:1673:2: rule__Device__Group__7__Impl rule__Device__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Device__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__7"


    // $ANTLR start "rule__Device__Group__7__Impl"
    // InternalMyDsl.g:1680:1: rule__Device__Group__7__Impl : ( ';' ) ;
    public final void rule__Device__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1684:1: ( ( ';' ) )
            // InternalMyDsl.g:1685:1: ( ';' )
            {
            // InternalMyDsl.g:1685:1: ( ';' )
            // InternalMyDsl.g:1686:2: ';'
            {
             before(grammarAccess.getDeviceAccess().getSemicolonKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getSemicolonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__7__Impl"


    // $ANTLR start "rule__Device__Group__8"
    // InternalMyDsl.g:1695:1: rule__Device__Group__8 : rule__Device__Group__8__Impl rule__Device__Group__9 ;
    public final void rule__Device__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1699:1: ( rule__Device__Group__8__Impl rule__Device__Group__9 )
            // InternalMyDsl.g:1700:2: rule__Device__Group__8__Impl rule__Device__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__Device__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__8"


    // $ANTLR start "rule__Device__Group__8__Impl"
    // InternalMyDsl.g:1707:1: rule__Device__Group__8__Impl : ( 'resources:' ) ;
    public final void rule__Device__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1711:1: ( ( 'resources:' ) )
            // InternalMyDsl.g:1712:1: ( 'resources:' )
            {
            // InternalMyDsl.g:1712:1: ( 'resources:' )
            // InternalMyDsl.g:1713:2: 'resources:'
            {
             before(grammarAccess.getDeviceAccess().getResourcesKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getResourcesKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__8__Impl"


    // $ANTLR start "rule__Device__Group__9"
    // InternalMyDsl.g:1722:1: rule__Device__Group__9 : rule__Device__Group__9__Impl rule__Device__Group__10 ;
    public final void rule__Device__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1726:1: ( rule__Device__Group__9__Impl rule__Device__Group__10 )
            // InternalMyDsl.g:1727:2: rule__Device__Group__9__Impl rule__Device__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__Device__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__9"


    // $ANTLR start "rule__Device__Group__9__Impl"
    // InternalMyDsl.g:1734:1: rule__Device__Group__9__Impl : ( ( rule__Device__DeviceAbilitiesAssignment_9 )? ) ;
    public final void rule__Device__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1738:1: ( ( ( rule__Device__DeviceAbilitiesAssignment_9 )? ) )
            // InternalMyDsl.g:1739:1: ( ( rule__Device__DeviceAbilitiesAssignment_9 )? )
            {
            // InternalMyDsl.g:1739:1: ( ( rule__Device__DeviceAbilitiesAssignment_9 )? )
            // InternalMyDsl.g:1740:2: ( rule__Device__DeviceAbilitiesAssignment_9 )?
            {
             before(grammarAccess.getDeviceAccess().getDeviceAbilitiesAssignment_9()); 
            // InternalMyDsl.g:1741:2: ( rule__Device__DeviceAbilitiesAssignment_9 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:1741:3: rule__Device__DeviceAbilitiesAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__Device__DeviceAbilitiesAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeviceAccess().getDeviceAbilitiesAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__9__Impl"


    // $ANTLR start "rule__Device__Group__10"
    // InternalMyDsl.g:1749:1: rule__Device__Group__10 : rule__Device__Group__10__Impl rule__Device__Group__11 ;
    public final void rule__Device__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1753:1: ( rule__Device__Group__10__Impl rule__Device__Group__11 )
            // InternalMyDsl.g:1754:2: rule__Device__Group__10__Impl rule__Device__Group__11
            {
            pushFollow(FOLLOW_12);
            rule__Device__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__10"


    // $ANTLR start "rule__Device__Group__10__Impl"
    // InternalMyDsl.g:1761:1: rule__Device__Group__10__Impl : ( ';' ) ;
    public final void rule__Device__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1765:1: ( ( ';' ) )
            // InternalMyDsl.g:1766:1: ( ';' )
            {
            // InternalMyDsl.g:1766:1: ( ';' )
            // InternalMyDsl.g:1767:2: ';'
            {
             before(grammarAccess.getDeviceAccess().getSemicolonKeyword_10()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getSemicolonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__10__Impl"


    // $ANTLR start "rule__Device__Group__11"
    // InternalMyDsl.g:1776:1: rule__Device__Group__11 : rule__Device__Group__11__Impl rule__Device__Group__12 ;
    public final void rule__Device__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1780:1: ( rule__Device__Group__11__Impl rule__Device__Group__12 )
            // InternalMyDsl.g:1781:2: rule__Device__Group__11__Impl rule__Device__Group__12
            {
            pushFollow(FOLLOW_13);
            rule__Device__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__11"


    // $ANTLR start "rule__Device__Group__11__Impl"
    // InternalMyDsl.g:1788:1: rule__Device__Group__11__Impl : ( 'protocol:' ) ;
    public final void rule__Device__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1792:1: ( ( 'protocol:' ) )
            // InternalMyDsl.g:1793:1: ( 'protocol:' )
            {
            // InternalMyDsl.g:1793:1: ( 'protocol:' )
            // InternalMyDsl.g:1794:2: 'protocol:'
            {
             before(grammarAccess.getDeviceAccess().getProtocolKeyword_11()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getProtocolKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__11__Impl"


    // $ANTLR start "rule__Device__Group__12"
    // InternalMyDsl.g:1803:1: rule__Device__Group__12 : rule__Device__Group__12__Impl rule__Device__Group__13 ;
    public final void rule__Device__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1807:1: ( rule__Device__Group__12__Impl rule__Device__Group__13 )
            // InternalMyDsl.g:1808:2: rule__Device__Group__12__Impl rule__Device__Group__13
            {
            pushFollow(FOLLOW_7);
            rule__Device__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__12"


    // $ANTLR start "rule__Device__Group__12__Impl"
    // InternalMyDsl.g:1815:1: rule__Device__Group__12__Impl : ( ( rule__Device__DeviceProtocolAssignment_12 ) ) ;
    public final void rule__Device__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1819:1: ( ( ( rule__Device__DeviceProtocolAssignment_12 ) ) )
            // InternalMyDsl.g:1820:1: ( ( rule__Device__DeviceProtocolAssignment_12 ) )
            {
            // InternalMyDsl.g:1820:1: ( ( rule__Device__DeviceProtocolAssignment_12 ) )
            // InternalMyDsl.g:1821:2: ( rule__Device__DeviceProtocolAssignment_12 )
            {
             before(grammarAccess.getDeviceAccess().getDeviceProtocolAssignment_12()); 
            // InternalMyDsl.g:1822:2: ( rule__Device__DeviceProtocolAssignment_12 )
            // InternalMyDsl.g:1822:3: rule__Device__DeviceProtocolAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Device__DeviceProtocolAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getDeviceProtocolAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__12__Impl"


    // $ANTLR start "rule__Device__Group__13"
    // InternalMyDsl.g:1830:1: rule__Device__Group__13 : rule__Device__Group__13__Impl rule__Device__Group__14 ;
    public final void rule__Device__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1834:1: ( rule__Device__Group__13__Impl rule__Device__Group__14 )
            // InternalMyDsl.g:1835:2: rule__Device__Group__13__Impl rule__Device__Group__14
            {
            pushFollow(FOLLOW_14);
            rule__Device__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__13"


    // $ANTLR start "rule__Device__Group__13__Impl"
    // InternalMyDsl.g:1842:1: rule__Device__Group__13__Impl : ( ';' ) ;
    public final void rule__Device__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1846:1: ( ( ';' ) )
            // InternalMyDsl.g:1847:1: ( ';' )
            {
            // InternalMyDsl.g:1847:1: ( ';' )
            // InternalMyDsl.g:1848:2: ';'
            {
             before(grammarAccess.getDeviceAccess().getSemicolonKeyword_13()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getSemicolonKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__13__Impl"


    // $ANTLR start "rule__Device__Group__14"
    // InternalMyDsl.g:1857:1: rule__Device__Group__14 : rule__Device__Group__14__Impl ;
    public final void rule__Device__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1861:1: ( rule__Device__Group__14__Impl )
            // InternalMyDsl.g:1862:2: rule__Device__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Device__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__14"


    // $ANTLR start "rule__Device__Group__14__Impl"
    // InternalMyDsl.g:1868:1: rule__Device__Group__14__Impl : ( ( rule__Device__Group_14__0 )* ) ;
    public final void rule__Device__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1872:1: ( ( ( rule__Device__Group_14__0 )* ) )
            // InternalMyDsl.g:1873:1: ( ( rule__Device__Group_14__0 )* )
            {
            // InternalMyDsl.g:1873:1: ( ( rule__Device__Group_14__0 )* )
            // InternalMyDsl.g:1874:2: ( rule__Device__Group_14__0 )*
            {
             before(grammarAccess.getDeviceAccess().getGroup_14()); 
            // InternalMyDsl.g:1875:2: ( rule__Device__Group_14__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1875:3: rule__Device__Group_14__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Device__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getDeviceAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__14__Impl"


    // $ANTLR start "rule__Device__Group_14__0"
    // InternalMyDsl.g:1884:1: rule__Device__Group_14__0 : rule__Device__Group_14__0__Impl rule__Device__Group_14__1 ;
    public final void rule__Device__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1888:1: ( rule__Device__Group_14__0__Impl rule__Device__Group_14__1 )
            // InternalMyDsl.g:1889:2: rule__Device__Group_14__0__Impl rule__Device__Group_14__1
            {
            pushFollow(FOLLOW_16);
            rule__Device__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_14__0"


    // $ANTLR start "rule__Device__Group_14__0__Impl"
    // InternalMyDsl.g:1896:1: rule__Device__Group_14__0__Impl : ( 'database:' ) ;
    public final void rule__Device__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1900:1: ( ( 'database:' ) )
            // InternalMyDsl.g:1901:1: ( 'database:' )
            {
            // InternalMyDsl.g:1901:1: ( 'database:' )
            // InternalMyDsl.g:1902:2: 'database:'
            {
             before(grammarAccess.getDeviceAccess().getDatabaseKeyword_14_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getDatabaseKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_14__0__Impl"


    // $ANTLR start "rule__Device__Group_14__1"
    // InternalMyDsl.g:1911:1: rule__Device__Group_14__1 : rule__Device__Group_14__1__Impl rule__Device__Group_14__2 ;
    public final void rule__Device__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1915:1: ( rule__Device__Group_14__1__Impl rule__Device__Group_14__2 )
            // InternalMyDsl.g:1916:2: rule__Device__Group_14__1__Impl rule__Device__Group_14__2
            {
            pushFollow(FOLLOW_7);
            rule__Device__Group_14__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group_14__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_14__1"


    // $ANTLR start "rule__Device__Group_14__1__Impl"
    // InternalMyDsl.g:1923:1: rule__Device__Group_14__1__Impl : ( ( rule__Device__DatabaseNameAssignment_14_1 ) ) ;
    public final void rule__Device__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1927:1: ( ( ( rule__Device__DatabaseNameAssignment_14_1 ) ) )
            // InternalMyDsl.g:1928:1: ( ( rule__Device__DatabaseNameAssignment_14_1 ) )
            {
            // InternalMyDsl.g:1928:1: ( ( rule__Device__DatabaseNameAssignment_14_1 ) )
            // InternalMyDsl.g:1929:2: ( rule__Device__DatabaseNameAssignment_14_1 )
            {
             before(grammarAccess.getDeviceAccess().getDatabaseNameAssignment_14_1()); 
            // InternalMyDsl.g:1930:2: ( rule__Device__DatabaseNameAssignment_14_1 )
            // InternalMyDsl.g:1930:3: rule__Device__DatabaseNameAssignment_14_1
            {
            pushFollow(FOLLOW_2);
            rule__Device__DatabaseNameAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getDatabaseNameAssignment_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_14__1__Impl"


    // $ANTLR start "rule__Device__Group_14__2"
    // InternalMyDsl.g:1938:1: rule__Device__Group_14__2 : rule__Device__Group_14__2__Impl ;
    public final void rule__Device__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1942:1: ( rule__Device__Group_14__2__Impl )
            // InternalMyDsl.g:1943:2: rule__Device__Group_14__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Device__Group_14__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_14__2"


    // $ANTLR start "rule__Device__Group_14__2__Impl"
    // InternalMyDsl.g:1949:1: rule__Device__Group_14__2__Impl : ( ';' ) ;
    public final void rule__Device__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1953:1: ( ( ';' ) )
            // InternalMyDsl.g:1954:1: ( ';' )
            {
            // InternalMyDsl.g:1954:1: ( ';' )
            // InternalMyDsl.g:1955:2: ';'
            {
             before(grammarAccess.getDeviceAccess().getSemicolonKeyword_14_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getSemicolonKeyword_14_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_14__2__Impl"


    // $ANTLR start "rule__DeviceLocation__Group__0"
    // InternalMyDsl.g:1965:1: rule__DeviceLocation__Group__0 : rule__DeviceLocation__Group__0__Impl rule__DeviceLocation__Group__1 ;
    public final void rule__DeviceLocation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1969:1: ( rule__DeviceLocation__Group__0__Impl rule__DeviceLocation__Group__1 )
            // InternalMyDsl.g:1970:2: rule__DeviceLocation__Group__0__Impl rule__DeviceLocation__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__DeviceLocation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceLocation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceLocation__Group__0"


    // $ANTLR start "rule__DeviceLocation__Group__0__Impl"
    // InternalMyDsl.g:1977:1: rule__DeviceLocation__Group__0__Impl : ( ( rule__DeviceLocation__RegionLabelAssignment_0 ) ) ;
    public final void rule__DeviceLocation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1981:1: ( ( ( rule__DeviceLocation__RegionLabelAssignment_0 ) ) )
            // InternalMyDsl.g:1982:1: ( ( rule__DeviceLocation__RegionLabelAssignment_0 ) )
            {
            // InternalMyDsl.g:1982:1: ( ( rule__DeviceLocation__RegionLabelAssignment_0 ) )
            // InternalMyDsl.g:1983:2: ( rule__DeviceLocation__RegionLabelAssignment_0 )
            {
             before(grammarAccess.getDeviceLocationAccess().getRegionLabelAssignment_0()); 
            // InternalMyDsl.g:1984:2: ( rule__DeviceLocation__RegionLabelAssignment_0 )
            // InternalMyDsl.g:1984:3: rule__DeviceLocation__RegionLabelAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DeviceLocation__RegionLabelAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDeviceLocationAccess().getRegionLabelAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceLocation__Group__0__Impl"


    // $ANTLR start "rule__DeviceLocation__Group__1"
    // InternalMyDsl.g:1992:1: rule__DeviceLocation__Group__1 : rule__DeviceLocation__Group__1__Impl rule__DeviceLocation__Group__2 ;
    public final void rule__DeviceLocation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1996:1: ( rule__DeviceLocation__Group__1__Impl rule__DeviceLocation__Group__2 )
            // InternalMyDsl.g:1997:2: rule__DeviceLocation__Group__1__Impl rule__DeviceLocation__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__DeviceLocation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceLocation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceLocation__Group__1"


    // $ANTLR start "rule__DeviceLocation__Group__1__Impl"
    // InternalMyDsl.g:2004:1: rule__DeviceLocation__Group__1__Impl : ( ':' ) ;
    public final void rule__DeviceLocation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2008:1: ( ( ':' ) )
            // InternalMyDsl.g:2009:1: ( ':' )
            {
            // InternalMyDsl.g:2009:1: ( ':' )
            // InternalMyDsl.g:2010:2: ':'
            {
             before(grammarAccess.getDeviceLocationAccess().getColonKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDeviceLocationAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceLocation__Group__1__Impl"


    // $ANTLR start "rule__DeviceLocation__Group__2"
    // InternalMyDsl.g:2019:1: rule__DeviceLocation__Group__2 : rule__DeviceLocation__Group__2__Impl ;
    public final void rule__DeviceLocation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2023:1: ( rule__DeviceLocation__Group__2__Impl )
            // InternalMyDsl.g:2024:2: rule__DeviceLocation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeviceLocation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceLocation__Group__2"


    // $ANTLR start "rule__DeviceLocation__Group__2__Impl"
    // InternalMyDsl.g:2030:1: rule__DeviceLocation__Group__2__Impl : ( ( rule__DeviceLocation__RegionValueAssignment_2 ) ) ;
    public final void rule__DeviceLocation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2034:1: ( ( ( rule__DeviceLocation__RegionValueAssignment_2 ) ) )
            // InternalMyDsl.g:2035:1: ( ( rule__DeviceLocation__RegionValueAssignment_2 ) )
            {
            // InternalMyDsl.g:2035:1: ( ( rule__DeviceLocation__RegionValueAssignment_2 ) )
            // InternalMyDsl.g:2036:2: ( rule__DeviceLocation__RegionValueAssignment_2 )
            {
             before(grammarAccess.getDeviceLocationAccess().getRegionValueAssignment_2()); 
            // InternalMyDsl.g:2037:2: ( rule__DeviceLocation__RegionValueAssignment_2 )
            // InternalMyDsl.g:2037:3: rule__DeviceLocation__RegionValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DeviceLocation__RegionValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeviceLocationAccess().getRegionValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceLocation__Group__2__Impl"


    // $ANTLR start "rule__DeviceAbilities__Group__0"
    // InternalMyDsl.g:2046:1: rule__DeviceAbilities__Group__0 : rule__DeviceAbilities__Group__0__Impl rule__DeviceAbilities__Group__1 ;
    public final void rule__DeviceAbilities__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2050:1: ( rule__DeviceAbilities__Group__0__Impl rule__DeviceAbilities__Group__1 )
            // InternalMyDsl.g:2051:2: rule__DeviceAbilities__Group__0__Impl rule__DeviceAbilities__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__DeviceAbilities__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceAbilities__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceAbilities__Group__0"


    // $ANTLR start "rule__DeviceAbilities__Group__0__Impl"
    // InternalMyDsl.g:2058:1: rule__DeviceAbilities__Group__0__Impl : ( ( rule__DeviceAbilities__DeviceEntityNameAssignment_0 ) ) ;
    public final void rule__DeviceAbilities__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2062:1: ( ( ( rule__DeviceAbilities__DeviceEntityNameAssignment_0 ) ) )
            // InternalMyDsl.g:2063:1: ( ( rule__DeviceAbilities__DeviceEntityNameAssignment_0 ) )
            {
            // InternalMyDsl.g:2063:1: ( ( rule__DeviceAbilities__DeviceEntityNameAssignment_0 ) )
            // InternalMyDsl.g:2064:2: ( rule__DeviceAbilities__DeviceEntityNameAssignment_0 )
            {
             before(grammarAccess.getDeviceAbilitiesAccess().getDeviceEntityNameAssignment_0()); 
            // InternalMyDsl.g:2065:2: ( rule__DeviceAbilities__DeviceEntityNameAssignment_0 )
            // InternalMyDsl.g:2065:3: rule__DeviceAbilities__DeviceEntityNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DeviceAbilities__DeviceEntityNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAbilitiesAccess().getDeviceEntityNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceAbilities__Group__0__Impl"


    // $ANTLR start "rule__DeviceAbilities__Group__1"
    // InternalMyDsl.g:2073:1: rule__DeviceAbilities__Group__1 : rule__DeviceAbilities__Group__1__Impl ;
    public final void rule__DeviceAbilities__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2077:1: ( rule__DeviceAbilities__Group__1__Impl )
            // InternalMyDsl.g:2078:2: rule__DeviceAbilities__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeviceAbilities__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceAbilities__Group__1"


    // $ANTLR start "rule__DeviceAbilities__Group__1__Impl"
    // InternalMyDsl.g:2084:1: rule__DeviceAbilities__Group__1__Impl : ( ( rule__DeviceAbilities__Group_1__0 )? ) ;
    public final void rule__DeviceAbilities__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2088:1: ( ( ( rule__DeviceAbilities__Group_1__0 )? ) )
            // InternalMyDsl.g:2089:1: ( ( rule__DeviceAbilities__Group_1__0 )? )
            {
            // InternalMyDsl.g:2089:1: ( ( rule__DeviceAbilities__Group_1__0 )? )
            // InternalMyDsl.g:2090:2: ( rule__DeviceAbilities__Group_1__0 )?
            {
             before(grammarAccess.getDeviceAbilitiesAccess().getGroup_1()); 
            // InternalMyDsl.g:2091:2: ( rule__DeviceAbilities__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:2091:3: rule__DeviceAbilities__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DeviceAbilities__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeviceAbilitiesAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceAbilities__Group__1__Impl"


    // $ANTLR start "rule__DeviceAbilities__Group_1__0"
    // InternalMyDsl.g:2100:1: rule__DeviceAbilities__Group_1__0 : rule__DeviceAbilities__Group_1__0__Impl rule__DeviceAbilities__Group_1__1 ;
    public final void rule__DeviceAbilities__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2104:1: ( rule__DeviceAbilities__Group_1__0__Impl rule__DeviceAbilities__Group_1__1 )
            // InternalMyDsl.g:2105:2: rule__DeviceAbilities__Group_1__0__Impl rule__DeviceAbilities__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__DeviceAbilities__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceAbilities__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceAbilities__Group_1__0"


    // $ANTLR start "rule__DeviceAbilities__Group_1__0__Impl"
    // InternalMyDsl.g:2112:1: rule__DeviceAbilities__Group_1__0__Impl : ( ',' ) ;
    public final void rule__DeviceAbilities__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2116:1: ( ( ',' ) )
            // InternalMyDsl.g:2117:1: ( ',' )
            {
            // InternalMyDsl.g:2117:1: ( ',' )
            // InternalMyDsl.g:2118:2: ','
            {
             before(grammarAccess.getDeviceAbilitiesAccess().getCommaKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDeviceAbilitiesAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceAbilities__Group_1__0__Impl"


    // $ANTLR start "rule__DeviceAbilities__Group_1__1"
    // InternalMyDsl.g:2127:1: rule__DeviceAbilities__Group_1__1 : rule__DeviceAbilities__Group_1__1__Impl ;
    public final void rule__DeviceAbilities__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2131:1: ( rule__DeviceAbilities__Group_1__1__Impl )
            // InternalMyDsl.g:2132:2: rule__DeviceAbilities__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeviceAbilities__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceAbilities__Group_1__1"


    // $ANTLR start "rule__DeviceAbilities__Group_1__1__Impl"
    // InternalMyDsl.g:2138:1: rule__DeviceAbilities__Group_1__1__Impl : ( ( rule__DeviceAbilities__NameAssignment_1_1 ) ) ;
    public final void rule__DeviceAbilities__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2142:1: ( ( ( rule__DeviceAbilities__NameAssignment_1_1 ) ) )
            // InternalMyDsl.g:2143:1: ( ( rule__DeviceAbilities__NameAssignment_1_1 ) )
            {
            // InternalMyDsl.g:2143:1: ( ( rule__DeviceAbilities__NameAssignment_1_1 ) )
            // InternalMyDsl.g:2144:2: ( rule__DeviceAbilities__NameAssignment_1_1 )
            {
             before(grammarAccess.getDeviceAbilitiesAccess().getNameAssignment_1_1()); 
            // InternalMyDsl.g:2145:2: ( rule__DeviceAbilities__NameAssignment_1_1 )
            // InternalMyDsl.g:2145:3: rule__DeviceAbilities__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DeviceAbilities__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAbilitiesAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceAbilities__Group_1__1__Impl"


    // $ANTLR start "rule__InteractionSpec__Group__0"
    // InternalMyDsl.g:2154:1: rule__InteractionSpec__Group__0 : rule__InteractionSpec__Group__0__Impl rule__InteractionSpec__Group__1 ;
    public final void rule__InteractionSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2158:1: ( rule__InteractionSpec__Group__0__Impl rule__InteractionSpec__Group__1 )
            // InternalMyDsl.g:2159:2: rule__InteractionSpec__Group__0__Impl rule__InteractionSpec__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__InteractionSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InteractionSpec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionSpec__Group__0"


    // $ANTLR start "rule__InteractionSpec__Group__0__Impl"
    // InternalMyDsl.g:2166:1: rule__InteractionSpec__Group__0__Impl : ( ( rule__InteractionSpec__Group_0__0 )* ) ;
    public final void rule__InteractionSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2170:1: ( ( ( rule__InteractionSpec__Group_0__0 )* ) )
            // InternalMyDsl.g:2171:1: ( ( rule__InteractionSpec__Group_0__0 )* )
            {
            // InternalMyDsl.g:2171:1: ( ( rule__InteractionSpec__Group_0__0 )* )
            // InternalMyDsl.g:2172:2: ( rule__InteractionSpec__Group_0__0 )*
            {
             before(grammarAccess.getInteractionSpecAccess().getGroup_0()); 
            // InternalMyDsl.g:2173:2: ( rule__InteractionSpec__Group_0__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:2173:3: rule__InteractionSpec__Group_0__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__InteractionSpec__Group_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getInteractionSpecAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionSpec__Group__0__Impl"


    // $ANTLR start "rule__InteractionSpec__Group__1"
    // InternalMyDsl.g:2181:1: rule__InteractionSpec__Group__1 : rule__InteractionSpec__Group__1__Impl rule__InteractionSpec__Group__2 ;
    public final void rule__InteractionSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2185:1: ( rule__InteractionSpec__Group__1__Impl rule__InteractionSpec__Group__2 )
            // InternalMyDsl.g:2186:2: rule__InteractionSpec__Group__1__Impl rule__InteractionSpec__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__InteractionSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InteractionSpec__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionSpec__Group__1"


    // $ANTLR start "rule__InteractionSpec__Group__1__Impl"
    // InternalMyDsl.g:2193:1: rule__InteractionSpec__Group__1__Impl : ( ( 'resources:' )* ) ;
    public final void rule__InteractionSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2197:1: ( ( ( 'resources:' )* ) )
            // InternalMyDsl.g:2198:1: ( ( 'resources:' )* )
            {
            // InternalMyDsl.g:2198:1: ( ( 'resources:' )* )
            // InternalMyDsl.g:2199:2: ( 'resources:' )*
            {
             before(grammarAccess.getInteractionSpecAccess().getResourcesKeyword_1()); 
            // InternalMyDsl.g:2200:2: ( 'resources:' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:2200:3: 'resources:'
            	    {
            	    match(input,19,FOLLOW_21); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getInteractionSpecAccess().getResourcesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionSpec__Group__1__Impl"


    // $ANTLR start "rule__InteractionSpec__Group__2"
    // InternalMyDsl.g:2208:1: rule__InteractionSpec__Group__2 : rule__InteractionSpec__Group__2__Impl ;
    public final void rule__InteractionSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2212:1: ( rule__InteractionSpec__Group__2__Impl )
            // InternalMyDsl.g:2213:2: rule__InteractionSpec__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InteractionSpec__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionSpec__Group__2"


    // $ANTLR start "rule__InteractionSpec__Group__2__Impl"
    // InternalMyDsl.g:2219:1: rule__InteractionSpec__Group__2__Impl : ( ( rule__InteractionSpec__Group_2__0 )* ) ;
    public final void rule__InteractionSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2223:1: ( ( ( rule__InteractionSpec__Group_2__0 )* ) )
            // InternalMyDsl.g:2224:1: ( ( rule__InteractionSpec__Group_2__0 )* )
            {
            // InternalMyDsl.g:2224:1: ( ( rule__InteractionSpec__Group_2__0 )* )
            // InternalMyDsl.g:2225:2: ( rule__InteractionSpec__Group_2__0 )*
            {
             before(grammarAccess.getInteractionSpecAccess().getGroup_2()); 
            // InternalMyDsl.g:2226:2: ( rule__InteractionSpec__Group_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:2226:3: rule__InteractionSpec__Group_2__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__InteractionSpec__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getInteractionSpecAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionSpec__Group__2__Impl"


    // $ANTLR start "rule__InteractionSpec__Group_0__0"
    // InternalMyDsl.g:2235:1: rule__InteractionSpec__Group_0__0 : rule__InteractionSpec__Group_0__0__Impl rule__InteractionSpec__Group_0__1 ;
    public final void rule__InteractionSpec__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2239:1: ( rule__InteractionSpec__Group_0__0__Impl rule__InteractionSpec__Group_0__1 )
            // InternalMyDsl.g:2240:2: rule__InteractionSpec__Group_0__0__Impl rule__InteractionSpec__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__InteractionSpec__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InteractionSpec__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionSpec__Group_0__0"


    // $ANTLR start "rule__InteractionSpec__Group_0__0__Impl"
    // InternalMyDsl.g:2247:1: rule__InteractionSpec__Group_0__0__Impl : ( 'structs:' ) ;
    public final void rule__InteractionSpec__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2251:1: ( ( 'structs:' ) )
            // InternalMyDsl.g:2252:1: ( 'structs:' )
            {
            // InternalMyDsl.g:2252:1: ( 'structs:' )
            // InternalMyDsl.g:2253:2: 'structs:'
            {
             before(grammarAccess.getInteractionSpecAccess().getStructsKeyword_0_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getInteractionSpecAccess().getStructsKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionSpec__Group_0__0__Impl"


    // $ANTLR start "rule__InteractionSpec__Group_0__1"
    // InternalMyDsl.g:2262:1: rule__InteractionSpec__Group_0__1 : rule__InteractionSpec__Group_0__1__Impl ;
    public final void rule__InteractionSpec__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2266:1: ( rule__InteractionSpec__Group_0__1__Impl )
            // InternalMyDsl.g:2267:2: rule__InteractionSpec__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InteractionSpec__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionSpec__Group_0__1"


    // $ANTLR start "rule__InteractionSpec__Group_0__1__Impl"
    // InternalMyDsl.g:2273:1: rule__InteractionSpec__Group_0__1__Impl : ( ( ( rule__InteractionSpec__StructsAssignment_0_1 ) ) ( ( rule__InteractionSpec__StructsAssignment_0_1 )* ) ) ;
    public final void rule__InteractionSpec__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2277:1: ( ( ( ( rule__InteractionSpec__StructsAssignment_0_1 ) ) ( ( rule__InteractionSpec__StructsAssignment_0_1 )* ) ) )
            // InternalMyDsl.g:2278:1: ( ( ( rule__InteractionSpec__StructsAssignment_0_1 ) ) ( ( rule__InteractionSpec__StructsAssignment_0_1 )* ) )
            {
            // InternalMyDsl.g:2278:1: ( ( ( rule__InteractionSpec__StructsAssignment_0_1 ) ) ( ( rule__InteractionSpec__StructsAssignment_0_1 )* ) )
            // InternalMyDsl.g:2279:2: ( ( rule__InteractionSpec__StructsAssignment_0_1 ) ) ( ( rule__InteractionSpec__StructsAssignment_0_1 )* )
            {
            // InternalMyDsl.g:2279:2: ( ( rule__InteractionSpec__StructsAssignment_0_1 ) )
            // InternalMyDsl.g:2280:3: ( rule__InteractionSpec__StructsAssignment_0_1 )
            {
             before(grammarAccess.getInteractionSpecAccess().getStructsAssignment_0_1()); 
            // InternalMyDsl.g:2281:3: ( rule__InteractionSpec__StructsAssignment_0_1 )
            // InternalMyDsl.g:2281:4: rule__InteractionSpec__StructsAssignment_0_1
            {
            pushFollow(FOLLOW_4);
            rule__InteractionSpec__StructsAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getInteractionSpecAccess().getStructsAssignment_0_1()); 

            }

            // InternalMyDsl.g:2284:2: ( ( rule__InteractionSpec__StructsAssignment_0_1 )* )
            // InternalMyDsl.g:2285:3: ( rule__InteractionSpec__StructsAssignment_0_1 )*
            {
             before(grammarAccess.getInteractionSpecAccess().getStructsAssignment_0_1()); 
            // InternalMyDsl.g:2286:3: ( rule__InteractionSpec__StructsAssignment_0_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:2286:4: rule__InteractionSpec__StructsAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__InteractionSpec__StructsAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getInteractionSpecAccess().getStructsAssignment_0_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionSpec__Group_0__1__Impl"


    // $ANTLR start "rule__InteractionSpec__Group_2__0"
    // InternalMyDsl.g:2296:1: rule__InteractionSpec__Group_2__0 : rule__InteractionSpec__Group_2__0__Impl rule__InteractionSpec__Group_2__1 ;
    public final void rule__InteractionSpec__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2300:1: ( rule__InteractionSpec__Group_2__0__Impl rule__InteractionSpec__Group_2__1 )
            // InternalMyDsl.g:2301:2: rule__InteractionSpec__Group_2__0__Impl rule__InteractionSpec__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__InteractionSpec__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InteractionSpec__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionSpec__Group_2__0"


    // $ANTLR start "rule__InteractionSpec__Group_2__0__Impl"
    // InternalMyDsl.g:2308:1: rule__InteractionSpec__Group_2__0__Impl : ( 'userInteractions:' ) ;
    public final void rule__InteractionSpec__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2312:1: ( ( 'userInteractions:' ) )
            // InternalMyDsl.g:2313:1: ( 'userInteractions:' )
            {
            // InternalMyDsl.g:2313:1: ( 'userInteractions:' )
            // InternalMyDsl.g:2314:2: 'userInteractions:'
            {
             before(grammarAccess.getInteractionSpecAccess().getUserInteractionsKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getInteractionSpecAccess().getUserInteractionsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionSpec__Group_2__0__Impl"


    // $ANTLR start "rule__InteractionSpec__Group_2__1"
    // InternalMyDsl.g:2323:1: rule__InteractionSpec__Group_2__1 : rule__InteractionSpec__Group_2__1__Impl ;
    public final void rule__InteractionSpec__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2327:1: ( rule__InteractionSpec__Group_2__1__Impl )
            // InternalMyDsl.g:2328:2: rule__InteractionSpec__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InteractionSpec__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionSpec__Group_2__1"


    // $ANTLR start "rule__InteractionSpec__Group_2__1__Impl"
    // InternalMyDsl.g:2334:1: rule__InteractionSpec__Group_2__1__Impl : ( ( ( rule__InteractionSpec__InteractionNameAssignment_2_1 ) ) ( ( rule__InteractionSpec__InteractionNameAssignment_2_1 )* ) ) ;
    public final void rule__InteractionSpec__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2338:1: ( ( ( ( rule__InteractionSpec__InteractionNameAssignment_2_1 ) ) ( ( rule__InteractionSpec__InteractionNameAssignment_2_1 )* ) ) )
            // InternalMyDsl.g:2339:1: ( ( ( rule__InteractionSpec__InteractionNameAssignment_2_1 ) ) ( ( rule__InteractionSpec__InteractionNameAssignment_2_1 )* ) )
            {
            // InternalMyDsl.g:2339:1: ( ( ( rule__InteractionSpec__InteractionNameAssignment_2_1 ) ) ( ( rule__InteractionSpec__InteractionNameAssignment_2_1 )* ) )
            // InternalMyDsl.g:2340:2: ( ( rule__InteractionSpec__InteractionNameAssignment_2_1 ) ) ( ( rule__InteractionSpec__InteractionNameAssignment_2_1 )* )
            {
            // InternalMyDsl.g:2340:2: ( ( rule__InteractionSpec__InteractionNameAssignment_2_1 ) )
            // InternalMyDsl.g:2341:3: ( rule__InteractionSpec__InteractionNameAssignment_2_1 )
            {
             before(grammarAccess.getInteractionSpecAccess().getInteractionNameAssignment_2_1()); 
            // InternalMyDsl.g:2342:3: ( rule__InteractionSpec__InteractionNameAssignment_2_1 )
            // InternalMyDsl.g:2342:4: rule__InteractionSpec__InteractionNameAssignment_2_1
            {
            pushFollow(FOLLOW_4);
            rule__InteractionSpec__InteractionNameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInteractionSpecAccess().getInteractionNameAssignment_2_1()); 

            }

            // InternalMyDsl.g:2345:2: ( ( rule__InteractionSpec__InteractionNameAssignment_2_1 )* )
            // InternalMyDsl.g:2346:3: ( rule__InteractionSpec__InteractionNameAssignment_2_1 )*
            {
             before(grammarAccess.getInteractionSpecAccess().getInteractionNameAssignment_2_1()); 
            // InternalMyDsl.g:2347:3: ( rule__InteractionSpec__InteractionNameAssignment_2_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:2347:4: rule__InteractionSpec__InteractionNameAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__InteractionSpec__InteractionNameAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getInteractionSpecAccess().getInteractionNameAssignment_2_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionSpec__Group_2__1__Impl"


    // $ANTLR start "rule__InteractionName__Group__0"
    // InternalMyDsl.g:2357:1: rule__InteractionName__Group__0 : rule__InteractionName__Group__0__Impl rule__InteractionName__Group__1 ;
    public final void rule__InteractionName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2361:1: ( rule__InteractionName__Group__0__Impl rule__InteractionName__Group__1 )
            // InternalMyDsl.g:2362:2: rule__InteractionName__Group__0__Impl rule__InteractionName__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__InteractionName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InteractionName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionName__Group__0"


    // $ANTLR start "rule__InteractionName__Group__0__Impl"
    // InternalMyDsl.g:2369:1: rule__InteractionName__Group__0__Impl : ( ( rule__InteractionName__InteractionNameAssignment_0 ) ) ;
    public final void rule__InteractionName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2373:1: ( ( ( rule__InteractionName__InteractionNameAssignment_0 ) ) )
            // InternalMyDsl.g:2374:1: ( ( rule__InteractionName__InteractionNameAssignment_0 ) )
            {
            // InternalMyDsl.g:2374:1: ( ( rule__InteractionName__InteractionNameAssignment_0 ) )
            // InternalMyDsl.g:2375:2: ( rule__InteractionName__InteractionNameAssignment_0 )
            {
             before(grammarAccess.getInteractionNameAccess().getInteractionNameAssignment_0()); 
            // InternalMyDsl.g:2376:2: ( rule__InteractionName__InteractionNameAssignment_0 )
            // InternalMyDsl.g:2376:3: rule__InteractionName__InteractionNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__InteractionName__InteractionNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInteractionNameAccess().getInteractionNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionName__Group__0__Impl"


    // $ANTLR start "rule__InteractionName__Group__1"
    // InternalMyDsl.g:2384:1: rule__InteractionName__Group__1 : rule__InteractionName__Group__1__Impl rule__InteractionName__Group__2 ;
    public final void rule__InteractionName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2388:1: ( rule__InteractionName__Group__1__Impl rule__InteractionName__Group__2 )
            // InternalMyDsl.g:2389:2: rule__InteractionName__Group__1__Impl rule__InteractionName__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__InteractionName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InteractionName__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionName__Group__1"


    // $ANTLR start "rule__InteractionName__Group__1__Impl"
    // InternalMyDsl.g:2396:1: rule__InteractionName__Group__1__Impl : ( ( rule__InteractionName__InteractionCommandAssignment_1 )* ) ;
    public final void rule__InteractionName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2400:1: ( ( ( rule__InteractionName__InteractionCommandAssignment_1 )* ) )
            // InternalMyDsl.g:2401:1: ( ( rule__InteractionName__InteractionCommandAssignment_1 )* )
            {
            // InternalMyDsl.g:2401:1: ( ( rule__InteractionName__InteractionCommandAssignment_1 )* )
            // InternalMyDsl.g:2402:2: ( rule__InteractionName__InteractionCommandAssignment_1 )*
            {
             before(grammarAccess.getInteractionNameAccess().getInteractionCommandAssignment_1()); 
            // InternalMyDsl.g:2403:2: ( rule__InteractionName__InteractionCommandAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==36) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:2403:3: rule__InteractionName__InteractionCommandAssignment_1
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__InteractionName__InteractionCommandAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getInteractionNameAccess().getInteractionCommandAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionName__Group__1__Impl"


    // $ANTLR start "rule__InteractionName__Group__2"
    // InternalMyDsl.g:2411:1: rule__InteractionName__Group__2 : rule__InteractionName__Group__2__Impl rule__InteractionName__Group__3 ;
    public final void rule__InteractionName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2415:1: ( rule__InteractionName__Group__2__Impl rule__InteractionName__Group__3 )
            // InternalMyDsl.g:2416:2: rule__InteractionName__Group__2__Impl rule__InteractionName__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__InteractionName__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InteractionName__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionName__Group__2"


    // $ANTLR start "rule__InteractionName__Group__2__Impl"
    // InternalMyDsl.g:2423:1: rule__InteractionName__Group__2__Impl : ( ( rule__InteractionName__InteractionRequestAssignment_2 )* ) ;
    public final void rule__InteractionName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2427:1: ( ( ( rule__InteractionName__InteractionRequestAssignment_2 )* ) )
            // InternalMyDsl.g:2428:1: ( ( rule__InteractionName__InteractionRequestAssignment_2 )* )
            {
            // InternalMyDsl.g:2428:1: ( ( rule__InteractionName__InteractionRequestAssignment_2 )* )
            // InternalMyDsl.g:2429:2: ( rule__InteractionName__InteractionRequestAssignment_2 )*
            {
             before(grammarAccess.getInteractionNameAccess().getInteractionRequestAssignment_2()); 
            // InternalMyDsl.g:2430:2: ( rule__InteractionName__InteractionRequestAssignment_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==32) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:2430:3: rule__InteractionName__InteractionRequestAssignment_2
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__InteractionName__InteractionRequestAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getInteractionNameAccess().getInteractionRequestAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionName__Group__2__Impl"


    // $ANTLR start "rule__InteractionName__Group__3"
    // InternalMyDsl.g:2438:1: rule__InteractionName__Group__3 : rule__InteractionName__Group__3__Impl ;
    public final void rule__InteractionName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2442:1: ( rule__InteractionName__Group__3__Impl )
            // InternalMyDsl.g:2443:2: rule__InteractionName__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InteractionName__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionName__Group__3"


    // $ANTLR start "rule__InteractionName__Group__3__Impl"
    // InternalMyDsl.g:2449:1: rule__InteractionName__Group__3__Impl : ( ( rule__InteractionName__InteractionNotifyAssignment_3 )* ) ;
    public final void rule__InteractionName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2453:1: ( ( ( rule__InteractionName__InteractionNotifyAssignment_3 )* ) )
            // InternalMyDsl.g:2454:1: ( ( rule__InteractionName__InteractionNotifyAssignment_3 )* )
            {
            // InternalMyDsl.g:2454:1: ( ( rule__InteractionName__InteractionNotifyAssignment_3 )* )
            // InternalMyDsl.g:2455:2: ( rule__InteractionName__InteractionNotifyAssignment_3 )*
            {
             before(grammarAccess.getInteractionNameAccess().getInteractionNotifyAssignment_3()); 
            // InternalMyDsl.g:2456:2: ( rule__InteractionName__InteractionNotifyAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==25) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:2456:3: rule__InteractionName__InteractionNotifyAssignment_3
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__InteractionName__InteractionNotifyAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getInteractionNameAccess().getInteractionNotifyAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionName__Group__3__Impl"


    // $ANTLR start "rule__InteractionAction__Group__0"
    // InternalMyDsl.g:2465:1: rule__InteractionAction__Group__0 : rule__InteractionAction__Group__0__Impl rule__InteractionAction__Group__1 ;
    public final void rule__InteractionAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2469:1: ( rule__InteractionAction__Group__0__Impl rule__InteractionAction__Group__1 )
            // InternalMyDsl.g:2470:2: rule__InteractionAction__Group__0__Impl rule__InteractionAction__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__InteractionAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InteractionAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionAction__Group__0"


    // $ANTLR start "rule__InteractionAction__Group__0__Impl"
    // InternalMyDsl.g:2477:1: rule__InteractionAction__Group__0__Impl : ( 'notify' ) ;
    public final void rule__InteractionAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2481:1: ( ( 'notify' ) )
            // InternalMyDsl.g:2482:1: ( 'notify' )
            {
            // InternalMyDsl.g:2482:1: ( 'notify' )
            // InternalMyDsl.g:2483:2: 'notify'
            {
             before(grammarAccess.getInteractionActionAccess().getNotifyKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getInteractionActionAccess().getNotifyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionAction__Group__0__Impl"


    // $ANTLR start "rule__InteractionAction__Group__1"
    // InternalMyDsl.g:2492:1: rule__InteractionAction__Group__1 : rule__InteractionAction__Group__1__Impl rule__InteractionAction__Group__2 ;
    public final void rule__InteractionAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2496:1: ( rule__InteractionAction__Group__1__Impl rule__InteractionAction__Group__2 )
            // InternalMyDsl.g:2497:2: rule__InteractionAction__Group__1__Impl rule__InteractionAction__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__InteractionAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InteractionAction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionAction__Group__1"


    // $ANTLR start "rule__InteractionAction__Group__1__Impl"
    // InternalMyDsl.g:2504:1: rule__InteractionAction__Group__1__Impl : ( ( rule__InteractionAction__ActionNameAssignment_1 ) ) ;
    public final void rule__InteractionAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2508:1: ( ( ( rule__InteractionAction__ActionNameAssignment_1 ) ) )
            // InternalMyDsl.g:2509:1: ( ( rule__InteractionAction__ActionNameAssignment_1 ) )
            {
            // InternalMyDsl.g:2509:1: ( ( rule__InteractionAction__ActionNameAssignment_1 ) )
            // InternalMyDsl.g:2510:2: ( rule__InteractionAction__ActionNameAssignment_1 )
            {
             before(grammarAccess.getInteractionActionAccess().getActionNameAssignment_1()); 
            // InternalMyDsl.g:2511:2: ( rule__InteractionAction__ActionNameAssignment_1 )
            // InternalMyDsl.g:2511:3: rule__InteractionAction__ActionNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InteractionAction__ActionNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInteractionActionAccess().getActionNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionAction__Group__1__Impl"


    // $ANTLR start "rule__InteractionAction__Group__2"
    // InternalMyDsl.g:2519:1: rule__InteractionAction__Group__2 : rule__InteractionAction__Group__2__Impl rule__InteractionAction__Group__3 ;
    public final void rule__InteractionAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2523:1: ( rule__InteractionAction__Group__2__Impl rule__InteractionAction__Group__3 )
            // InternalMyDsl.g:2524:2: rule__InteractionAction__Group__2__Impl rule__InteractionAction__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__InteractionAction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InteractionAction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionAction__Group__2"


    // $ANTLR start "rule__InteractionAction__Group__2__Impl"
    // InternalMyDsl.g:2531:1: rule__InteractionAction__Group__2__Impl : ( '(' ) ;
    public final void rule__InteractionAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2535:1: ( ( '(' ) )
            // InternalMyDsl.g:2536:1: ( '(' )
            {
            // InternalMyDsl.g:2536:1: ( '(' )
            // InternalMyDsl.g:2537:2: '('
            {
             before(grammarAccess.getInteractionActionAccess().getLeftParenthesisKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getInteractionActionAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionAction__Group__2__Impl"


    // $ANTLR start "rule__InteractionAction__Group__3"
    // InternalMyDsl.g:2546:1: rule__InteractionAction__Group__3 : rule__InteractionAction__Group__3__Impl rule__InteractionAction__Group__4 ;
    public final void rule__InteractionAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2550:1: ( rule__InteractionAction__Group__3__Impl rule__InteractionAction__Group__4 )
            // InternalMyDsl.g:2551:2: rule__InteractionAction__Group__3__Impl rule__InteractionAction__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__InteractionAction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InteractionAction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionAction__Group__3"


    // $ANTLR start "rule__InteractionAction__Group__3__Impl"
    // InternalMyDsl.g:2558:1: rule__InteractionAction__Group__3__Impl : ( ( rule__InteractionAction__ParametersAssignment_3 )* ) ;
    public final void rule__InteractionAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2562:1: ( ( ( rule__InteractionAction__ParametersAssignment_3 )* ) )
            // InternalMyDsl.g:2563:1: ( ( rule__InteractionAction__ParametersAssignment_3 )* )
            {
            // InternalMyDsl.g:2563:1: ( ( rule__InteractionAction__ParametersAssignment_3 )* )
            // InternalMyDsl.g:2564:2: ( rule__InteractionAction__ParametersAssignment_3 )*
            {
             before(grammarAccess.getInteractionActionAccess().getParametersAssignment_3()); 
            // InternalMyDsl.g:2565:2: ( rule__InteractionAction__ParametersAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:2565:3: rule__InteractionAction__ParametersAssignment_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__InteractionAction__ParametersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getInteractionActionAccess().getParametersAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionAction__Group__3__Impl"


    // $ANTLR start "rule__InteractionAction__Group__4"
    // InternalMyDsl.g:2573:1: rule__InteractionAction__Group__4 : rule__InteractionAction__Group__4__Impl rule__InteractionAction__Group__5 ;
    public final void rule__InteractionAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2577:1: ( rule__InteractionAction__Group__4__Impl rule__InteractionAction__Group__5 )
            // InternalMyDsl.g:2578:2: rule__InteractionAction__Group__4__Impl rule__InteractionAction__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__InteractionAction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InteractionAction__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionAction__Group__4"


    // $ANTLR start "rule__InteractionAction__Group__4__Impl"
    // InternalMyDsl.g:2585:1: rule__InteractionAction__Group__4__Impl : ( ')' ) ;
    public final void rule__InteractionAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2589:1: ( ( ')' ) )
            // InternalMyDsl.g:2590:1: ( ')' )
            {
            // InternalMyDsl.g:2590:1: ( ')' )
            // InternalMyDsl.g:2591:2: ')'
            {
             before(grammarAccess.getInteractionActionAccess().getRightParenthesisKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getInteractionActionAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionAction__Group__4__Impl"


    // $ANTLR start "rule__InteractionAction__Group__5"
    // InternalMyDsl.g:2600:1: rule__InteractionAction__Group__5 : rule__InteractionAction__Group__5__Impl rule__InteractionAction__Group__6 ;
    public final void rule__InteractionAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2604:1: ( rule__InteractionAction__Group__5__Impl rule__InteractionAction__Group__6 )
            // InternalMyDsl.g:2605:2: rule__InteractionAction__Group__5__Impl rule__InteractionAction__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__InteractionAction__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InteractionAction__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionAction__Group__5"


    // $ANTLR start "rule__InteractionAction__Group__5__Impl"
    // InternalMyDsl.g:2612:1: rule__InteractionAction__Group__5__Impl : ( 'from' ) ;
    public final void rule__InteractionAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2616:1: ( ( 'from' ) )
            // InternalMyDsl.g:2617:1: ( 'from' )
            {
            // InternalMyDsl.g:2617:1: ( 'from' )
            // InternalMyDsl.g:2618:2: 'from'
            {
             before(grammarAccess.getInteractionActionAccess().getFromKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getInteractionActionAccess().getFromKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionAction__Group__5__Impl"


    // $ANTLR start "rule__InteractionAction__Group__6"
    // InternalMyDsl.g:2627:1: rule__InteractionAction__Group__6 : rule__InteractionAction__Group__6__Impl rule__InteractionAction__Group__7 ;
    public final void rule__InteractionAction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2631:1: ( rule__InteractionAction__Group__6__Impl rule__InteractionAction__Group__7 )
            // InternalMyDsl.g:2632:2: rule__InteractionAction__Group__6__Impl rule__InteractionAction__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__InteractionAction__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InteractionAction__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionAction__Group__6"


    // $ANTLR start "rule__InteractionAction__Group__6__Impl"
    // InternalMyDsl.g:2639:1: rule__InteractionAction__Group__6__Impl : ( ( rule__InteractionAction__InteractionEntityAssignment_6 ) ) ;
    public final void rule__InteractionAction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2643:1: ( ( ( rule__InteractionAction__InteractionEntityAssignment_6 ) ) )
            // InternalMyDsl.g:2644:1: ( ( rule__InteractionAction__InteractionEntityAssignment_6 ) )
            {
            // InternalMyDsl.g:2644:1: ( ( rule__InteractionAction__InteractionEntityAssignment_6 ) )
            // InternalMyDsl.g:2645:2: ( rule__InteractionAction__InteractionEntityAssignment_6 )
            {
             before(grammarAccess.getInteractionActionAccess().getInteractionEntityAssignment_6()); 
            // InternalMyDsl.g:2646:2: ( rule__InteractionAction__InteractionEntityAssignment_6 )
            // InternalMyDsl.g:2646:3: rule__InteractionAction__InteractionEntityAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__InteractionAction__InteractionEntityAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getInteractionActionAccess().getInteractionEntityAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionAction__Group__6__Impl"


    // $ANTLR start "rule__InteractionAction__Group__7"
    // InternalMyDsl.g:2654:1: rule__InteractionAction__Group__7 : rule__InteractionAction__Group__7__Impl ;
    public final void rule__InteractionAction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2658:1: ( rule__InteractionAction__Group__7__Impl )
            // InternalMyDsl.g:2659:2: rule__InteractionAction__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InteractionAction__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionAction__Group__7"


    // $ANTLR start "rule__InteractionAction__Group__7__Impl"
    // InternalMyDsl.g:2665:1: rule__InteractionAction__Group__7__Impl : ( ';' ) ;
    public final void rule__InteractionAction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2669:1: ( ( ';' ) )
            // InternalMyDsl.g:2670:1: ( ';' )
            {
            // InternalMyDsl.g:2670:1: ( ';' )
            // InternalMyDsl.g:2671:2: ';'
            {
             before(grammarAccess.getInteractionActionAccess().getSemicolonKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getInteractionActionAccess().getSemicolonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionAction__Group__7__Impl"


    // $ANTLR start "rule__ArchSpec__Group__0"
    // InternalMyDsl.g:2681:1: rule__ArchSpec__Group__0 : rule__ArchSpec__Group__0__Impl rule__ArchSpec__Group__1 ;
    public final void rule__ArchSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2685:1: ( rule__ArchSpec__Group__0__Impl rule__ArchSpec__Group__1 )
            // InternalMyDsl.g:2686:2: rule__ArchSpec__Group__0__Impl rule__ArchSpec__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__ArchSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchSpec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchSpec__Group__0"


    // $ANTLR start "rule__ArchSpec__Group__0__Impl"
    // InternalMyDsl.g:2693:1: rule__ArchSpec__Group__0__Impl : ( ( rule__ArchSpec__Group_0__0 )* ) ;
    public final void rule__ArchSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2697:1: ( ( ( rule__ArchSpec__Group_0__0 )* ) )
            // InternalMyDsl.g:2698:1: ( ( rule__ArchSpec__Group_0__0 )* )
            {
            // InternalMyDsl.g:2698:1: ( ( rule__ArchSpec__Group_0__0 )* )
            // InternalMyDsl.g:2699:2: ( rule__ArchSpec__Group_0__0 )*
            {
             before(grammarAccess.getArchSpecAccess().getGroup_0()); 
            // InternalMyDsl.g:2700:2: ( rule__ArchSpec__Group_0__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==23) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:2700:3: rule__ArchSpec__Group_0__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__ArchSpec__Group_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getArchSpecAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchSpec__Group__0__Impl"


    // $ANTLR start "rule__ArchSpec__Group__1"
    // InternalMyDsl.g:2708:1: rule__ArchSpec__Group__1 : rule__ArchSpec__Group__1__Impl rule__ArchSpec__Group__2 ;
    public final void rule__ArchSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2712:1: ( rule__ArchSpec__Group__1__Impl rule__ArchSpec__Group__2 )
            // InternalMyDsl.g:2713:2: rule__ArchSpec__Group__1__Impl rule__ArchSpec__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__ArchSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchSpec__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchSpec__Group__1"


    // $ANTLR start "rule__ArchSpec__Group__1__Impl"
    // InternalMyDsl.g:2720:1: rule__ArchSpec__Group__1__Impl : ( 'computationalService:' ) ;
    public final void rule__ArchSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2724:1: ( ( 'computationalService:' ) )
            // InternalMyDsl.g:2725:1: ( 'computationalService:' )
            {
            // InternalMyDsl.g:2725:1: ( 'computationalService:' )
            // InternalMyDsl.g:2726:2: 'computationalService:'
            {
             before(grammarAccess.getArchSpecAccess().getComputationalServiceKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getArchSpecAccess().getComputationalServiceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchSpec__Group__1__Impl"


    // $ANTLR start "rule__ArchSpec__Group__2"
    // InternalMyDsl.g:2735:1: rule__ArchSpec__Group__2 : rule__ArchSpec__Group__2__Impl rule__ArchSpec__Group__3 ;
    public final void rule__ArchSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2739:1: ( rule__ArchSpec__Group__2__Impl rule__ArchSpec__Group__3 )
            // InternalMyDsl.g:2740:2: rule__ArchSpec__Group__2__Impl rule__ArchSpec__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__ArchSpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchSpec__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchSpec__Group__2"


    // $ANTLR start "rule__ArchSpec__Group__2__Impl"
    // InternalMyDsl.g:2747:1: rule__ArchSpec__Group__2__Impl : ( ( rule__ArchSpec__Group_2__0 )* ) ;
    public final void rule__ArchSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2751:1: ( ( ( rule__ArchSpec__Group_2__0 )* ) )
            // InternalMyDsl.g:2752:1: ( ( rule__ArchSpec__Group_2__0 )* )
            {
            // InternalMyDsl.g:2752:1: ( ( rule__ArchSpec__Group_2__0 )* )
            // InternalMyDsl.g:2753:2: ( rule__ArchSpec__Group_2__0 )*
            {
             before(grammarAccess.getArchSpecAccess().getGroup_2()); 
            // InternalMyDsl.g:2754:2: ( rule__ArchSpec__Group_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==30) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:2754:3: rule__ArchSpec__Group_2__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__ArchSpec__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getArchSpecAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchSpec__Group__2__Impl"


    // $ANTLR start "rule__ArchSpec__Group__3"
    // InternalMyDsl.g:2762:1: rule__ArchSpec__Group__3 : rule__ArchSpec__Group__3__Impl ;
    public final void rule__ArchSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2766:1: ( rule__ArchSpec__Group__3__Impl )
            // InternalMyDsl.g:2767:2: rule__ArchSpec__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArchSpec__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchSpec__Group__3"


    // $ANTLR start "rule__ArchSpec__Group__3__Impl"
    // InternalMyDsl.g:2773:1: rule__ArchSpec__Group__3__Impl : ( ( rule__ArchSpec__Group_3__0 )* ) ;
    public final void rule__ArchSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2777:1: ( ( ( rule__ArchSpec__Group_3__0 )* ) )
            // InternalMyDsl.g:2778:1: ( ( rule__ArchSpec__Group_3__0 )* )
            {
            // InternalMyDsl.g:2778:1: ( ( rule__ArchSpec__Group_3__0 )* )
            // InternalMyDsl.g:2779:2: ( rule__ArchSpec__Group_3__0 )*
            {
             before(grammarAccess.getArchSpecAccess().getGroup_3()); 
            // InternalMyDsl.g:2780:2: ( rule__ArchSpec__Group_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==31) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:2780:3: rule__ArchSpec__Group_3__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__ArchSpec__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getArchSpecAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchSpec__Group__3__Impl"


    // $ANTLR start "rule__ArchSpec__Group_0__0"
    // InternalMyDsl.g:2789:1: rule__ArchSpec__Group_0__0 : rule__ArchSpec__Group_0__0__Impl rule__ArchSpec__Group_0__1 ;
    public final void rule__ArchSpec__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2793:1: ( rule__ArchSpec__Group_0__0__Impl rule__ArchSpec__Group_0__1 )
            // InternalMyDsl.g:2794:2: rule__ArchSpec__Group_0__0__Impl rule__ArchSpec__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__ArchSpec__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchSpec__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchSpec__Group_0__0"


    // $ANTLR start "rule__ArchSpec__Group_0__0__Impl"
    // InternalMyDsl.g:2801:1: rule__ArchSpec__Group_0__0__Impl : ( 'structs:' ) ;
    public final void rule__ArchSpec__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2805:1: ( ( 'structs:' ) )
            // InternalMyDsl.g:2806:1: ( 'structs:' )
            {
            // InternalMyDsl.g:2806:1: ( 'structs:' )
            // InternalMyDsl.g:2807:2: 'structs:'
            {
             before(grammarAccess.getArchSpecAccess().getStructsKeyword_0_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getArchSpecAccess().getStructsKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchSpec__Group_0__0__Impl"


    // $ANTLR start "rule__ArchSpec__Group_0__1"
    // InternalMyDsl.g:2816:1: rule__ArchSpec__Group_0__1 : rule__ArchSpec__Group_0__1__Impl ;
    public final void rule__ArchSpec__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2820:1: ( rule__ArchSpec__Group_0__1__Impl )
            // InternalMyDsl.g:2821:2: rule__ArchSpec__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArchSpec__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchSpec__Group_0__1"


    // $ANTLR start "rule__ArchSpec__Group_0__1__Impl"
    // InternalMyDsl.g:2827:1: rule__ArchSpec__Group_0__1__Impl : ( ( ( rule__ArchSpec__StructsAssignment_0_1 ) ) ( ( rule__ArchSpec__StructsAssignment_0_1 )* ) ) ;
    public final void rule__ArchSpec__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2831:1: ( ( ( ( rule__ArchSpec__StructsAssignment_0_1 ) ) ( ( rule__ArchSpec__StructsAssignment_0_1 )* ) ) )
            // InternalMyDsl.g:2832:1: ( ( ( rule__ArchSpec__StructsAssignment_0_1 ) ) ( ( rule__ArchSpec__StructsAssignment_0_1 )* ) )
            {
            // InternalMyDsl.g:2832:1: ( ( ( rule__ArchSpec__StructsAssignment_0_1 ) ) ( ( rule__ArchSpec__StructsAssignment_0_1 )* ) )
            // InternalMyDsl.g:2833:2: ( ( rule__ArchSpec__StructsAssignment_0_1 ) ) ( ( rule__ArchSpec__StructsAssignment_0_1 )* )
            {
            // InternalMyDsl.g:2833:2: ( ( rule__ArchSpec__StructsAssignment_0_1 ) )
            // InternalMyDsl.g:2834:3: ( rule__ArchSpec__StructsAssignment_0_1 )
            {
             before(grammarAccess.getArchSpecAccess().getStructsAssignment_0_1()); 
            // InternalMyDsl.g:2835:3: ( rule__ArchSpec__StructsAssignment_0_1 )
            // InternalMyDsl.g:2835:4: rule__ArchSpec__StructsAssignment_0_1
            {
            pushFollow(FOLLOW_4);
            rule__ArchSpec__StructsAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getArchSpecAccess().getStructsAssignment_0_1()); 

            }

            // InternalMyDsl.g:2838:2: ( ( rule__ArchSpec__StructsAssignment_0_1 )* )
            // InternalMyDsl.g:2839:3: ( rule__ArchSpec__StructsAssignment_0_1 )*
            {
             before(grammarAccess.getArchSpecAccess().getStructsAssignment_0_1()); 
            // InternalMyDsl.g:2840:3: ( rule__ArchSpec__StructsAssignment_0_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:2840:4: rule__ArchSpec__StructsAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ArchSpec__StructsAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getArchSpecAccess().getStructsAssignment_0_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchSpec__Group_0__1__Impl"


    // $ANTLR start "rule__ArchSpec__Group_2__0"
    // InternalMyDsl.g:2850:1: rule__ArchSpec__Group_2__0 : rule__ArchSpec__Group_2__0__Impl rule__ArchSpec__Group_2__1 ;
    public final void rule__ArchSpec__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2854:1: ( rule__ArchSpec__Group_2__0__Impl rule__ArchSpec__Group_2__1 )
            // InternalMyDsl.g:2855:2: rule__ArchSpec__Group_2__0__Impl rule__ArchSpec__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__ArchSpec__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchSpec__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchSpec__Group_2__0"


    // $ANTLR start "rule__ArchSpec__Group_2__0__Impl"
    // InternalMyDsl.g:2862:1: rule__ArchSpec__Group_2__0__Impl : ( 'Common:' ) ;
    public final void rule__ArchSpec__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2866:1: ( ( 'Common:' ) )
            // InternalMyDsl.g:2867:1: ( 'Common:' )
            {
            // InternalMyDsl.g:2867:1: ( 'Common:' )
            // InternalMyDsl.g:2868:2: 'Common:'
            {
             before(grammarAccess.getArchSpecAccess().getCommonKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getArchSpecAccess().getCommonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchSpec__Group_2__0__Impl"


    // $ANTLR start "rule__ArchSpec__Group_2__1"
    // InternalMyDsl.g:2877:1: rule__ArchSpec__Group_2__1 : rule__ArchSpec__Group_2__1__Impl ;
    public final void rule__ArchSpec__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2881:1: ( rule__ArchSpec__Group_2__1__Impl )
            // InternalMyDsl.g:2882:2: rule__ArchSpec__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArchSpec__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchSpec__Group_2__1"


    // $ANTLR start "rule__ArchSpec__Group_2__1__Impl"
    // InternalMyDsl.g:2888:1: rule__ArchSpec__Group_2__1__Impl : ( ( rule__ArchSpec__InbuiltComputationalServiceAssignment_2_1 )* ) ;
    public final void rule__ArchSpec__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2892:1: ( ( ( rule__ArchSpec__InbuiltComputationalServiceAssignment_2_1 )* ) )
            // InternalMyDsl.g:2893:1: ( ( rule__ArchSpec__InbuiltComputationalServiceAssignment_2_1 )* )
            {
            // InternalMyDsl.g:2893:1: ( ( rule__ArchSpec__InbuiltComputationalServiceAssignment_2_1 )* )
            // InternalMyDsl.g:2894:2: ( rule__ArchSpec__InbuiltComputationalServiceAssignment_2_1 )*
            {
             before(grammarAccess.getArchSpecAccess().getInbuiltComputationalServiceAssignment_2_1()); 
            // InternalMyDsl.g:2895:2: ( rule__ArchSpec__InbuiltComputationalServiceAssignment_2_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMyDsl.g:2895:3: rule__ArchSpec__InbuiltComputationalServiceAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ArchSpec__InbuiltComputationalServiceAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getArchSpecAccess().getInbuiltComputationalServiceAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchSpec__Group_2__1__Impl"


    // $ANTLR start "rule__ArchSpec__Group_3__0"
    // InternalMyDsl.g:2904:1: rule__ArchSpec__Group_3__0 : rule__ArchSpec__Group_3__0__Impl rule__ArchSpec__Group_3__1 ;
    public final void rule__ArchSpec__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2908:1: ( rule__ArchSpec__Group_3__0__Impl rule__ArchSpec__Group_3__1 )
            // InternalMyDsl.g:2909:2: rule__ArchSpec__Group_3__0__Impl rule__ArchSpec__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__ArchSpec__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchSpec__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchSpec__Group_3__0"


    // $ANTLR start "rule__ArchSpec__Group_3__0__Impl"
    // InternalMyDsl.g:2916:1: rule__ArchSpec__Group_3__0__Impl : ( 'Custom:' ) ;
    public final void rule__ArchSpec__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2920:1: ( ( 'Custom:' ) )
            // InternalMyDsl.g:2921:1: ( 'Custom:' )
            {
            // InternalMyDsl.g:2921:1: ( 'Custom:' )
            // InternalMyDsl.g:2922:2: 'Custom:'
            {
             before(grammarAccess.getArchSpecAccess().getCustomKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getArchSpecAccess().getCustomKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchSpec__Group_3__0__Impl"


    // $ANTLR start "rule__ArchSpec__Group_3__1"
    // InternalMyDsl.g:2931:1: rule__ArchSpec__Group_3__1 : rule__ArchSpec__Group_3__1__Impl ;
    public final void rule__ArchSpec__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2935:1: ( rule__ArchSpec__Group_3__1__Impl )
            // InternalMyDsl.g:2936:2: rule__ArchSpec__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArchSpec__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchSpec__Group_3__1"


    // $ANTLR start "rule__ArchSpec__Group_3__1__Impl"
    // InternalMyDsl.g:2942:1: rule__ArchSpec__Group_3__1__Impl : ( ( rule__ArchSpec__CustomComputationalServiceAssignment_3_1 )* ) ;
    public final void rule__ArchSpec__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2946:1: ( ( ( rule__ArchSpec__CustomComputationalServiceAssignment_3_1 )* ) )
            // InternalMyDsl.g:2947:1: ( ( rule__ArchSpec__CustomComputationalServiceAssignment_3_1 )* )
            {
            // InternalMyDsl.g:2947:1: ( ( rule__ArchSpec__CustomComputationalServiceAssignment_3_1 )* )
            // InternalMyDsl.g:2948:2: ( rule__ArchSpec__CustomComputationalServiceAssignment_3_1 )*
            {
             before(grammarAccess.getArchSpecAccess().getCustomComputationalServiceAssignment_3_1()); 
            // InternalMyDsl.g:2949:2: ( rule__ArchSpec__CustomComputationalServiceAssignment_3_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyDsl.g:2949:3: rule__ArchSpec__CustomComputationalServiceAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ArchSpec__CustomComputationalServiceAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getArchSpecAccess().getCustomComputationalServiceAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchSpec__Group_3__1__Impl"


    // $ANTLR start "rule__InBuiltComputationalService__Group__0"
    // InternalMyDsl.g:2958:1: rule__InBuiltComputationalService__Group__0 : rule__InBuiltComputationalService__Group__0__Impl rule__InBuiltComputationalService__Group__1 ;
    public final void rule__InBuiltComputationalService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2962:1: ( rule__InBuiltComputationalService__Group__0__Impl rule__InBuiltComputationalService__Group__1 )
            // InternalMyDsl.g:2963:2: rule__InBuiltComputationalService__Group__0__Impl rule__InBuiltComputationalService__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__InBuiltComputationalService__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InBuiltComputationalService__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InBuiltComputationalService__Group__0"


    // $ANTLR start "rule__InBuiltComputationalService__Group__0__Impl"
    // InternalMyDsl.g:2970:1: rule__InBuiltComputationalService__Group__0__Impl : ( ( rule__InBuiltComputationalService__InBuiltComputationalServiceNameAssignment_0 ) ) ;
    public final void rule__InBuiltComputationalService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2974:1: ( ( ( rule__InBuiltComputationalService__InBuiltComputationalServiceNameAssignment_0 ) ) )
            // InternalMyDsl.g:2975:1: ( ( rule__InBuiltComputationalService__InBuiltComputationalServiceNameAssignment_0 ) )
            {
            // InternalMyDsl.g:2975:1: ( ( rule__InBuiltComputationalService__InBuiltComputationalServiceNameAssignment_0 ) )
            // InternalMyDsl.g:2976:2: ( rule__InBuiltComputationalService__InBuiltComputationalServiceNameAssignment_0 )
            {
             before(grammarAccess.getInBuiltComputationalServiceAccess().getInBuiltComputationalServiceNameAssignment_0()); 
            // InternalMyDsl.g:2977:2: ( rule__InBuiltComputationalService__InBuiltComputationalServiceNameAssignment_0 )
            // InternalMyDsl.g:2977:3: rule__InBuiltComputationalService__InBuiltComputationalServiceNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__InBuiltComputationalService__InBuiltComputationalServiceNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInBuiltComputationalServiceAccess().getInBuiltComputationalServiceNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InBuiltComputationalService__Group__0__Impl"


    // $ANTLR start "rule__InBuiltComputationalService__Group__1"
    // InternalMyDsl.g:2985:1: rule__InBuiltComputationalService__Group__1 : rule__InBuiltComputationalService__Group__1__Impl rule__InBuiltComputationalService__Group__2 ;
    public final void rule__InBuiltComputationalService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2989:1: ( rule__InBuiltComputationalService__Group__1__Impl rule__InBuiltComputationalService__Group__2 )
            // InternalMyDsl.g:2990:2: rule__InBuiltComputationalService__Group__1__Impl rule__InBuiltComputationalService__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__InBuiltComputationalService__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InBuiltComputationalService__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InBuiltComputationalService__Group__1"


    // $ANTLR start "rule__InBuiltComputationalService__Group__1__Impl"
    // InternalMyDsl.g:2997:1: rule__InBuiltComputationalService__Group__1__Impl : ( ( ( rule__InBuiltComputationalService__ConsumesAssignment_1 ) ) ( ( rule__InBuiltComputationalService__ConsumesAssignment_1 )* ) ) ;
    public final void rule__InBuiltComputationalService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3001:1: ( ( ( ( rule__InBuiltComputationalService__ConsumesAssignment_1 ) ) ( ( rule__InBuiltComputationalService__ConsumesAssignment_1 )* ) ) )
            // InternalMyDsl.g:3002:1: ( ( ( rule__InBuiltComputationalService__ConsumesAssignment_1 ) ) ( ( rule__InBuiltComputationalService__ConsumesAssignment_1 )* ) )
            {
            // InternalMyDsl.g:3002:1: ( ( ( rule__InBuiltComputationalService__ConsumesAssignment_1 ) ) ( ( rule__InBuiltComputationalService__ConsumesAssignment_1 )* ) )
            // InternalMyDsl.g:3003:2: ( ( rule__InBuiltComputationalService__ConsumesAssignment_1 ) ) ( ( rule__InBuiltComputationalService__ConsumesAssignment_1 )* )
            {
            // InternalMyDsl.g:3003:2: ( ( rule__InBuiltComputationalService__ConsumesAssignment_1 ) )
            // InternalMyDsl.g:3004:3: ( rule__InBuiltComputationalService__ConsumesAssignment_1 )
            {
             before(grammarAccess.getInBuiltComputationalServiceAccess().getConsumesAssignment_1()); 
            // InternalMyDsl.g:3005:3: ( rule__InBuiltComputationalService__ConsumesAssignment_1 )
            // InternalMyDsl.g:3005:4: rule__InBuiltComputationalService__ConsumesAssignment_1
            {
            pushFollow(FOLLOW_36);
            rule__InBuiltComputationalService__ConsumesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInBuiltComputationalServiceAccess().getConsumesAssignment_1()); 

            }

            // InternalMyDsl.g:3008:2: ( ( rule__InBuiltComputationalService__ConsumesAssignment_1 )* )
            // InternalMyDsl.g:3009:3: ( rule__InBuiltComputationalService__ConsumesAssignment_1 )*
            {
             before(grammarAccess.getInBuiltComputationalServiceAccess().getConsumesAssignment_1()); 
            // InternalMyDsl.g:3010:3: ( rule__InBuiltComputationalService__ConsumesAssignment_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==34) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMyDsl.g:3010:4: rule__InBuiltComputationalService__ConsumesAssignment_1
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__InBuiltComputationalService__ConsumesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getInBuiltComputationalServiceAccess().getConsumesAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InBuiltComputationalService__Group__1__Impl"


    // $ANTLR start "rule__InBuiltComputationalService__Group__2"
    // InternalMyDsl.g:3019:1: rule__InBuiltComputationalService__Group__2 : rule__InBuiltComputationalService__Group__2__Impl rule__InBuiltComputationalService__Group__3 ;
    public final void rule__InBuiltComputationalService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3023:1: ( rule__InBuiltComputationalService__Group__2__Impl rule__InBuiltComputationalService__Group__3 )
            // InternalMyDsl.g:3024:2: rule__InBuiltComputationalService__Group__2__Impl rule__InBuiltComputationalService__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__InBuiltComputationalService__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InBuiltComputationalService__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InBuiltComputationalService__Group__2"


    // $ANTLR start "rule__InBuiltComputationalService__Group__2__Impl"
    // InternalMyDsl.g:3031:1: rule__InBuiltComputationalService__Group__2__Impl : ( ( ( rule__InBuiltComputationalService__ComputeInfoAssignment_2 ) ) ( ( rule__InBuiltComputationalService__ComputeInfoAssignment_2 )* ) ) ;
    public final void rule__InBuiltComputationalService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3035:1: ( ( ( ( rule__InBuiltComputationalService__ComputeInfoAssignment_2 ) ) ( ( rule__InBuiltComputationalService__ComputeInfoAssignment_2 )* ) ) )
            // InternalMyDsl.g:3036:1: ( ( ( rule__InBuiltComputationalService__ComputeInfoAssignment_2 ) ) ( ( rule__InBuiltComputationalService__ComputeInfoAssignment_2 )* ) )
            {
            // InternalMyDsl.g:3036:1: ( ( ( rule__InBuiltComputationalService__ComputeInfoAssignment_2 ) ) ( ( rule__InBuiltComputationalService__ComputeInfoAssignment_2 )* ) )
            // InternalMyDsl.g:3037:2: ( ( rule__InBuiltComputationalService__ComputeInfoAssignment_2 ) ) ( ( rule__InBuiltComputationalService__ComputeInfoAssignment_2 )* )
            {
            // InternalMyDsl.g:3037:2: ( ( rule__InBuiltComputationalService__ComputeInfoAssignment_2 ) )
            // InternalMyDsl.g:3038:3: ( rule__InBuiltComputationalService__ComputeInfoAssignment_2 )
            {
             before(grammarAccess.getInBuiltComputationalServiceAccess().getComputeInfoAssignment_2()); 
            // InternalMyDsl.g:3039:3: ( rule__InBuiltComputationalService__ComputeInfoAssignment_2 )
            // InternalMyDsl.g:3039:4: rule__InBuiltComputationalService__ComputeInfoAssignment_2
            {
            pushFollow(FOLLOW_38);
            rule__InBuiltComputationalService__ComputeInfoAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInBuiltComputationalServiceAccess().getComputeInfoAssignment_2()); 

            }

            // InternalMyDsl.g:3042:2: ( ( rule__InBuiltComputationalService__ComputeInfoAssignment_2 )* )
            // InternalMyDsl.g:3043:3: ( rule__InBuiltComputationalService__ComputeInfoAssignment_2 )*
            {
             before(grammarAccess.getInBuiltComputationalServiceAccess().getComputeInfoAssignment_2()); 
            // InternalMyDsl.g:3044:3: ( rule__InBuiltComputationalService__ComputeInfoAssignment_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==35) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMyDsl.g:3044:4: rule__InBuiltComputationalService__ComputeInfoAssignment_2
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__InBuiltComputationalService__ComputeInfoAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getInBuiltComputationalServiceAccess().getComputeInfoAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InBuiltComputationalService__Group__2__Impl"


    // $ANTLR start "rule__InBuiltComputationalService__Group__3"
    // InternalMyDsl.g:3053:1: rule__InBuiltComputationalService__Group__3 : rule__InBuiltComputationalService__Group__3__Impl ;
    public final void rule__InBuiltComputationalService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3057:1: ( rule__InBuiltComputationalService__Group__3__Impl )
            // InternalMyDsl.g:3058:2: rule__InBuiltComputationalService__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InBuiltComputationalService__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InBuiltComputationalService__Group__3"


    // $ANTLR start "rule__InBuiltComputationalService__Group__3__Impl"
    // InternalMyDsl.g:3064:1: rule__InBuiltComputationalService__Group__3__Impl : ( ( ( rule__InBuiltComputationalService__GenerateInfoAssignment_3 ) ) ( ( rule__InBuiltComputationalService__GenerateInfoAssignment_3 )* ) ) ;
    public final void rule__InBuiltComputationalService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3068:1: ( ( ( ( rule__InBuiltComputationalService__GenerateInfoAssignment_3 ) ) ( ( rule__InBuiltComputationalService__GenerateInfoAssignment_3 )* ) ) )
            // InternalMyDsl.g:3069:1: ( ( ( rule__InBuiltComputationalService__GenerateInfoAssignment_3 ) ) ( ( rule__InBuiltComputationalService__GenerateInfoAssignment_3 )* ) )
            {
            // InternalMyDsl.g:3069:1: ( ( ( rule__InBuiltComputationalService__GenerateInfoAssignment_3 ) ) ( ( rule__InBuiltComputationalService__GenerateInfoAssignment_3 )* ) )
            // InternalMyDsl.g:3070:2: ( ( rule__InBuiltComputationalService__GenerateInfoAssignment_3 ) ) ( ( rule__InBuiltComputationalService__GenerateInfoAssignment_3 )* )
            {
            // InternalMyDsl.g:3070:2: ( ( rule__InBuiltComputationalService__GenerateInfoAssignment_3 ) )
            // InternalMyDsl.g:3071:3: ( rule__InBuiltComputationalService__GenerateInfoAssignment_3 )
            {
             before(grammarAccess.getInBuiltComputationalServiceAccess().getGenerateInfoAssignment_3()); 
            // InternalMyDsl.g:3072:3: ( rule__InBuiltComputationalService__GenerateInfoAssignment_3 )
            // InternalMyDsl.g:3072:4: rule__InBuiltComputationalService__GenerateInfoAssignment_3
            {
            pushFollow(FOLLOW_39);
            rule__InBuiltComputationalService__GenerateInfoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInBuiltComputationalServiceAccess().getGenerateInfoAssignment_3()); 

            }

            // InternalMyDsl.g:3075:2: ( ( rule__InBuiltComputationalService__GenerateInfoAssignment_3 )* )
            // InternalMyDsl.g:3076:3: ( rule__InBuiltComputationalService__GenerateInfoAssignment_3 )*
            {
             before(grammarAccess.getInBuiltComputationalServiceAccess().getGenerateInfoAssignment_3()); 
            // InternalMyDsl.g:3077:3: ( rule__InBuiltComputationalService__GenerateInfoAssignment_3 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==48) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyDsl.g:3077:4: rule__InBuiltComputationalService__GenerateInfoAssignment_3
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__InBuiltComputationalService__GenerateInfoAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getInBuiltComputationalServiceAccess().getGenerateInfoAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InBuiltComputationalService__Group__3__Impl"


    // $ANTLR start "rule__CustomComputationalService__Group__0"
    // InternalMyDsl.g:3087:1: rule__CustomComputationalService__Group__0 : rule__CustomComputationalService__Group__0__Impl rule__CustomComputationalService__Group__1 ;
    public final void rule__CustomComputationalService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3091:1: ( rule__CustomComputationalService__Group__0__Impl rule__CustomComputationalService__Group__1 )
            // InternalMyDsl.g:3092:2: rule__CustomComputationalService__Group__0__Impl rule__CustomComputationalService__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__CustomComputationalService__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomComputationalService__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomComputationalService__Group__0"


    // $ANTLR start "rule__CustomComputationalService__Group__0__Impl"
    // InternalMyDsl.g:3099:1: rule__CustomComputationalService__Group__0__Impl : ( ( rule__CustomComputationalService__CustomComputationalServiceNameAssignment_0 ) ) ;
    public final void rule__CustomComputationalService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3103:1: ( ( ( rule__CustomComputationalService__CustomComputationalServiceNameAssignment_0 ) ) )
            // InternalMyDsl.g:3104:1: ( ( rule__CustomComputationalService__CustomComputationalServiceNameAssignment_0 ) )
            {
            // InternalMyDsl.g:3104:1: ( ( rule__CustomComputationalService__CustomComputationalServiceNameAssignment_0 ) )
            // InternalMyDsl.g:3105:2: ( rule__CustomComputationalService__CustomComputationalServiceNameAssignment_0 )
            {
             before(grammarAccess.getCustomComputationalServiceAccess().getCustomComputationalServiceNameAssignment_0()); 
            // InternalMyDsl.g:3106:2: ( rule__CustomComputationalService__CustomComputationalServiceNameAssignment_0 )
            // InternalMyDsl.g:3106:3: rule__CustomComputationalService__CustomComputationalServiceNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CustomComputationalService__CustomComputationalServiceNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCustomComputationalServiceAccess().getCustomComputationalServiceNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomComputationalService__Group__0__Impl"


    // $ANTLR start "rule__CustomComputationalService__Group__1"
    // InternalMyDsl.g:3114:1: rule__CustomComputationalService__Group__1 : rule__CustomComputationalService__Group__1__Impl rule__CustomComputationalService__Group__2 ;
    public final void rule__CustomComputationalService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3118:1: ( rule__CustomComputationalService__Group__1__Impl rule__CustomComputationalService__Group__2 )
            // InternalMyDsl.g:3119:2: rule__CustomComputationalService__Group__1__Impl rule__CustomComputationalService__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__CustomComputationalService__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomComputationalService__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomComputationalService__Group__1"


    // $ANTLR start "rule__CustomComputationalService__Group__1__Impl"
    // InternalMyDsl.g:3126:1: rule__CustomComputationalService__Group__1__Impl : ( ( ( rule__CustomComputationalService__ConsumesAssignment_1 ) ) ( ( rule__CustomComputationalService__ConsumesAssignment_1 )* ) ) ;
    public final void rule__CustomComputationalService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3130:1: ( ( ( ( rule__CustomComputationalService__ConsumesAssignment_1 ) ) ( ( rule__CustomComputationalService__ConsumesAssignment_1 )* ) ) )
            // InternalMyDsl.g:3131:1: ( ( ( rule__CustomComputationalService__ConsumesAssignment_1 ) ) ( ( rule__CustomComputationalService__ConsumesAssignment_1 )* ) )
            {
            // InternalMyDsl.g:3131:1: ( ( ( rule__CustomComputationalService__ConsumesAssignment_1 ) ) ( ( rule__CustomComputationalService__ConsumesAssignment_1 )* ) )
            // InternalMyDsl.g:3132:2: ( ( rule__CustomComputationalService__ConsumesAssignment_1 ) ) ( ( rule__CustomComputationalService__ConsumesAssignment_1 )* )
            {
            // InternalMyDsl.g:3132:2: ( ( rule__CustomComputationalService__ConsumesAssignment_1 ) )
            // InternalMyDsl.g:3133:3: ( rule__CustomComputationalService__ConsumesAssignment_1 )
            {
             before(grammarAccess.getCustomComputationalServiceAccess().getConsumesAssignment_1()); 
            // InternalMyDsl.g:3134:3: ( rule__CustomComputationalService__ConsumesAssignment_1 )
            // InternalMyDsl.g:3134:4: rule__CustomComputationalService__ConsumesAssignment_1
            {
            pushFollow(FOLLOW_36);
            rule__CustomComputationalService__ConsumesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomComputationalServiceAccess().getConsumesAssignment_1()); 

            }

            // InternalMyDsl.g:3137:2: ( ( rule__CustomComputationalService__ConsumesAssignment_1 )* )
            // InternalMyDsl.g:3138:3: ( rule__CustomComputationalService__ConsumesAssignment_1 )*
            {
             before(grammarAccess.getCustomComputationalServiceAccess().getConsumesAssignment_1()); 
            // InternalMyDsl.g:3139:3: ( rule__CustomComputationalService__ConsumesAssignment_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==34) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalMyDsl.g:3139:4: rule__CustomComputationalService__ConsumesAssignment_1
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__CustomComputationalService__ConsumesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getCustomComputationalServiceAccess().getConsumesAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomComputationalService__Group__1__Impl"


    // $ANTLR start "rule__CustomComputationalService__Group__2"
    // InternalMyDsl.g:3148:1: rule__CustomComputationalService__Group__2 : rule__CustomComputationalService__Group__2__Impl rule__CustomComputationalService__Group__3 ;
    public final void rule__CustomComputationalService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3152:1: ( rule__CustomComputationalService__Group__2__Impl rule__CustomComputationalService__Group__3 )
            // InternalMyDsl.g:3153:2: rule__CustomComputationalService__Group__2__Impl rule__CustomComputationalService__Group__3
            {
            pushFollow(FOLLOW_40);
            rule__CustomComputationalService__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomComputationalService__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomComputationalService__Group__2"


    // $ANTLR start "rule__CustomComputationalService__Group__2__Impl"
    // InternalMyDsl.g:3160:1: rule__CustomComputationalService__Group__2__Impl : ( ( rule__CustomComputationalService__RequestsAssignment_2 )* ) ;
    public final void rule__CustomComputationalService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3164:1: ( ( ( rule__CustomComputationalService__RequestsAssignment_2 )* ) )
            // InternalMyDsl.g:3165:1: ( ( rule__CustomComputationalService__RequestsAssignment_2 )* )
            {
            // InternalMyDsl.g:3165:1: ( ( rule__CustomComputationalService__RequestsAssignment_2 )* )
            // InternalMyDsl.g:3166:2: ( rule__CustomComputationalService__RequestsAssignment_2 )*
            {
             before(grammarAccess.getCustomComputationalServiceAccess().getRequestsAssignment_2()); 
            // InternalMyDsl.g:3167:2: ( rule__CustomComputationalService__RequestsAssignment_2 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==32) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMyDsl.g:3167:3: rule__CustomComputationalService__RequestsAssignment_2
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__CustomComputationalService__RequestsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getCustomComputationalServiceAccess().getRequestsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomComputationalService__Group__2__Impl"


    // $ANTLR start "rule__CustomComputationalService__Group__3"
    // InternalMyDsl.g:3175:1: rule__CustomComputationalService__Group__3 : rule__CustomComputationalService__Group__3__Impl rule__CustomComputationalService__Group__4 ;
    public final void rule__CustomComputationalService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3179:1: ( rule__CustomComputationalService__Group__3__Impl rule__CustomComputationalService__Group__4 )
            // InternalMyDsl.g:3180:2: rule__CustomComputationalService__Group__3__Impl rule__CustomComputationalService__Group__4
            {
            pushFollow(FOLLOW_40);
            rule__CustomComputationalService__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomComputationalService__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomComputationalService__Group__3"


    // $ANTLR start "rule__CustomComputationalService__Group__3__Impl"
    // InternalMyDsl.g:3187:1: rule__CustomComputationalService__Group__3__Impl : ( ( rule__CustomComputationalService__GenerateInfoAssignment_3 )* ) ;
    public final void rule__CustomComputationalService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3191:1: ( ( ( rule__CustomComputationalService__GenerateInfoAssignment_3 )* ) )
            // InternalMyDsl.g:3192:1: ( ( rule__CustomComputationalService__GenerateInfoAssignment_3 )* )
            {
            // InternalMyDsl.g:3192:1: ( ( rule__CustomComputationalService__GenerateInfoAssignment_3 )* )
            // InternalMyDsl.g:3193:2: ( rule__CustomComputationalService__GenerateInfoAssignment_3 )*
            {
             before(grammarAccess.getCustomComputationalServiceAccess().getGenerateInfoAssignment_3()); 
            // InternalMyDsl.g:3194:2: ( rule__CustomComputationalService__GenerateInfoAssignment_3 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==48) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMyDsl.g:3194:3: rule__CustomComputationalService__GenerateInfoAssignment_3
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__CustomComputationalService__GenerateInfoAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getCustomComputationalServiceAccess().getGenerateInfoAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomComputationalService__Group__3__Impl"


    // $ANTLR start "rule__CustomComputationalService__Group__4"
    // InternalMyDsl.g:3202:1: rule__CustomComputationalService__Group__4 : rule__CustomComputationalService__Group__4__Impl ;
    public final void rule__CustomComputationalService__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3206:1: ( rule__CustomComputationalService__Group__4__Impl )
            // InternalMyDsl.g:3207:2: rule__CustomComputationalService__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CustomComputationalService__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomComputationalService__Group__4"


    // $ANTLR start "rule__CustomComputationalService__Group__4__Impl"
    // InternalMyDsl.g:3213:1: rule__CustomComputationalService__Group__4__Impl : ( ( rule__CustomComputationalService__CommandsAssignment_4 )* ) ;
    public final void rule__CustomComputationalService__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3217:1: ( ( ( rule__CustomComputationalService__CommandsAssignment_4 )* ) )
            // InternalMyDsl.g:3218:1: ( ( rule__CustomComputationalService__CommandsAssignment_4 )* )
            {
            // InternalMyDsl.g:3218:1: ( ( rule__CustomComputationalService__CommandsAssignment_4 )* )
            // InternalMyDsl.g:3219:2: ( rule__CustomComputationalService__CommandsAssignment_4 )*
            {
             before(grammarAccess.getCustomComputationalServiceAccess().getCommandsAssignment_4()); 
            // InternalMyDsl.g:3220:2: ( rule__CustomComputationalService__CommandsAssignment_4 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==36) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMyDsl.g:3220:3: rule__CustomComputationalService__CommandsAssignment_4
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__CustomComputationalService__CommandsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getCustomComputationalServiceAccess().getCommandsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomComputationalService__Group__4__Impl"


    // $ANTLR start "rule__Request__Group__0"
    // InternalMyDsl.g:3229:1: rule__Request__Group__0 : rule__Request__Group__0__Impl rule__Request__Group__1 ;
    public final void rule__Request__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3233:1: ( rule__Request__Group__0__Impl rule__Request__Group__1 )
            // InternalMyDsl.g:3234:2: rule__Request__Group__0__Impl rule__Request__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Request__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Request__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__0"


    // $ANTLR start "rule__Request__Group__0__Impl"
    // InternalMyDsl.g:3241:1: rule__Request__Group__0__Impl : ( 'request' ) ;
    public final void rule__Request__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3245:1: ( ( 'request' ) )
            // InternalMyDsl.g:3246:1: ( 'request' )
            {
            // InternalMyDsl.g:3246:1: ( 'request' )
            // InternalMyDsl.g:3247:2: 'request'
            {
             before(grammarAccess.getRequestAccess().getRequestKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRequestAccess().getRequestKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__0__Impl"


    // $ANTLR start "rule__Request__Group__1"
    // InternalMyDsl.g:3256:1: rule__Request__Group__1 : rule__Request__Group__1__Impl rule__Request__Group__2 ;
    public final void rule__Request__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3260:1: ( rule__Request__Group__1__Impl rule__Request__Group__2 )
            // InternalMyDsl.g:3261:2: rule__Request__Group__1__Impl rule__Request__Group__2
            {
            pushFollow(FOLLOW_41);
            rule__Request__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Request__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__1"


    // $ANTLR start "rule__Request__Group__1__Impl"
    // InternalMyDsl.g:3268:1: rule__Request__Group__1__Impl : ( ( rule__Request__RequestnameAssignment_1 ) ) ;
    public final void rule__Request__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3272:1: ( ( ( rule__Request__RequestnameAssignment_1 ) ) )
            // InternalMyDsl.g:3273:1: ( ( rule__Request__RequestnameAssignment_1 ) )
            {
            // InternalMyDsl.g:3273:1: ( ( rule__Request__RequestnameAssignment_1 ) )
            // InternalMyDsl.g:3274:2: ( rule__Request__RequestnameAssignment_1 )
            {
             before(grammarAccess.getRequestAccess().getRequestnameAssignment_1()); 
            // InternalMyDsl.g:3275:2: ( rule__Request__RequestnameAssignment_1 )
            // InternalMyDsl.g:3275:3: rule__Request__RequestnameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Request__RequestnameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRequestAccess().getRequestnameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__1__Impl"


    // $ANTLR start "rule__Request__Group__2"
    // InternalMyDsl.g:3283:1: rule__Request__Group__2 : rule__Request__Group__2__Impl rule__Request__Group__3 ;
    public final void rule__Request__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3287:1: ( rule__Request__Group__2__Impl rule__Request__Group__3 )
            // InternalMyDsl.g:3288:2: rule__Request__Group__2__Impl rule__Request__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Request__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Request__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__2"


    // $ANTLR start "rule__Request__Group__2__Impl"
    // InternalMyDsl.g:3295:1: rule__Request__Group__2__Impl : ( 'to' ) ;
    public final void rule__Request__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3299:1: ( ( 'to' ) )
            // InternalMyDsl.g:3300:1: ( 'to' )
            {
            // InternalMyDsl.g:3300:1: ( 'to' )
            // InternalMyDsl.g:3301:2: 'to'
            {
             before(grammarAccess.getRequestAccess().getToKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRequestAccess().getToKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__2__Impl"


    // $ANTLR start "rule__Request__Group__3"
    // InternalMyDsl.g:3310:1: rule__Request__Group__3 : rule__Request__Group__3__Impl rule__Request__Group__4 ;
    public final void rule__Request__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3314:1: ( rule__Request__Group__3__Impl rule__Request__Group__4 )
            // InternalMyDsl.g:3315:2: rule__Request__Group__3__Impl rule__Request__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Request__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Request__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__3"


    // $ANTLR start "rule__Request__Group__3__Impl"
    // InternalMyDsl.g:3322:1: rule__Request__Group__3__Impl : ( ( rule__Request__StorageForRequestAssignment_3 ) ) ;
    public final void rule__Request__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3326:1: ( ( ( rule__Request__StorageForRequestAssignment_3 ) ) )
            // InternalMyDsl.g:3327:1: ( ( rule__Request__StorageForRequestAssignment_3 ) )
            {
            // InternalMyDsl.g:3327:1: ( ( rule__Request__StorageForRequestAssignment_3 ) )
            // InternalMyDsl.g:3328:2: ( rule__Request__StorageForRequestAssignment_3 )
            {
             before(grammarAccess.getRequestAccess().getStorageForRequestAssignment_3()); 
            // InternalMyDsl.g:3329:2: ( rule__Request__StorageForRequestAssignment_3 )
            // InternalMyDsl.g:3329:3: rule__Request__StorageForRequestAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Request__StorageForRequestAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRequestAccess().getStorageForRequestAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__3__Impl"


    // $ANTLR start "rule__Request__Group__4"
    // InternalMyDsl.g:3337:1: rule__Request__Group__4 : rule__Request__Group__4__Impl ;
    public final void rule__Request__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3341:1: ( rule__Request__Group__4__Impl )
            // InternalMyDsl.g:3342:2: rule__Request__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Request__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__4"


    // $ANTLR start "rule__Request__Group__4__Impl"
    // InternalMyDsl.g:3348:1: rule__Request__Group__4__Impl : ( ';' ) ;
    public final void rule__Request__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3352:1: ( ( ';' ) )
            // InternalMyDsl.g:3353:1: ( ';' )
            {
            // InternalMyDsl.g:3353:1: ( ';' )
            // InternalMyDsl.g:3354:2: ';'
            {
             before(grammarAccess.getRequestAccess().getSemicolonKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRequestAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__4__Impl"


    // $ANTLR start "rule__ConsumeForInBuilt__Group__0"
    // InternalMyDsl.g:3364:1: rule__ConsumeForInBuilt__Group__0 : rule__ConsumeForInBuilt__Group__0__Impl rule__ConsumeForInBuilt__Group__1 ;
    public final void rule__ConsumeForInBuilt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3368:1: ( rule__ConsumeForInBuilt__Group__0__Impl rule__ConsumeForInBuilt__Group__1 )
            // InternalMyDsl.g:3369:2: rule__ConsumeForInBuilt__Group__0__Impl rule__ConsumeForInBuilt__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ConsumeForInBuilt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConsumeForInBuilt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConsumeForInBuilt__Group__0"


    // $ANTLR start "rule__ConsumeForInBuilt__Group__0__Impl"
    // InternalMyDsl.g:3376:1: rule__ConsumeForInBuilt__Group__0__Impl : ( 'consume' ) ;
    public final void rule__ConsumeForInBuilt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3380:1: ( ( 'consume' ) )
            // InternalMyDsl.g:3381:1: ( 'consume' )
            {
            // InternalMyDsl.g:3381:1: ( 'consume' )
            // InternalMyDsl.g:3382:2: 'consume'
            {
             before(grammarAccess.getConsumeForInBuiltAccess().getConsumeKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getConsumeForInBuiltAccess().getConsumeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConsumeForInBuilt__Group__0__Impl"


    // $ANTLR start "rule__ConsumeForInBuilt__Group__1"
    // InternalMyDsl.g:3391:1: rule__ConsumeForInBuilt__Group__1 : rule__ConsumeForInBuilt__Group__1__Impl rule__ConsumeForInBuilt__Group__2 ;
    public final void rule__ConsumeForInBuilt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3395:1: ( rule__ConsumeForInBuilt__Group__1__Impl rule__ConsumeForInBuilt__Group__2 )
            // InternalMyDsl.g:3396:2: rule__ConsumeForInBuilt__Group__1__Impl rule__ConsumeForInBuilt__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__ConsumeForInBuilt__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConsumeForInBuilt__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConsumeForInBuilt__Group__1"


    // $ANTLR start "rule__ConsumeForInBuilt__Group__1__Impl"
    // InternalMyDsl.g:3403:1: rule__ConsumeForInBuilt__Group__1__Impl : ( ( rule__ConsumeForInBuilt__NameAssignment_1 ) ) ;
    public final void rule__ConsumeForInBuilt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3407:1: ( ( ( rule__ConsumeForInBuilt__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3408:1: ( ( rule__ConsumeForInBuilt__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3408:1: ( ( rule__ConsumeForInBuilt__NameAssignment_1 ) )
            // InternalMyDsl.g:3409:2: ( rule__ConsumeForInBuilt__NameAssignment_1 )
            {
             before(grammarAccess.getConsumeForInBuiltAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3410:2: ( rule__ConsumeForInBuilt__NameAssignment_1 )
            // InternalMyDsl.g:3410:3: rule__ConsumeForInBuilt__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConsumeForInBuilt__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConsumeForInBuiltAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConsumeForInBuilt__Group__1__Impl"


    // $ANTLR start "rule__ConsumeForInBuilt__Group__2"
    // InternalMyDsl.g:3418:1: rule__ConsumeForInBuilt__Group__2 : rule__ConsumeForInBuilt__Group__2__Impl rule__ConsumeForInBuilt__Group__3 ;
    public final void rule__ConsumeForInBuilt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3422:1: ( rule__ConsumeForInBuilt__Group__2__Impl rule__ConsumeForInBuilt__Group__3 )
            // InternalMyDsl.g:3423:2: rule__ConsumeForInBuilt__Group__2__Impl rule__ConsumeForInBuilt__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__ConsumeForInBuilt__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConsumeForInBuilt__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConsumeForInBuilt__Group__2"


    // $ANTLR start "rule__ConsumeForInBuilt__Group__2__Impl"
    // InternalMyDsl.g:3430:1: rule__ConsumeForInBuilt__Group__2__Impl : ( 'from' ) ;
    public final void rule__ConsumeForInBuilt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3434:1: ( ( 'from' ) )
            // InternalMyDsl.g:3435:1: ( 'from' )
            {
            // InternalMyDsl.g:3435:1: ( 'from' )
            // InternalMyDsl.g:3436:2: 'from'
            {
             before(grammarAccess.getConsumeForInBuiltAccess().getFromKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getConsumeForInBuiltAccess().getFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConsumeForInBuilt__Group__2__Impl"


    // $ANTLR start "rule__ConsumeForInBuilt__Group__3"
    // InternalMyDsl.g:3445:1: rule__ConsumeForInBuilt__Group__3 : rule__ConsumeForInBuilt__Group__3__Impl rule__ConsumeForInBuilt__Group__4 ;
    public final void rule__ConsumeForInBuilt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3449:1: ( rule__ConsumeForInBuilt__Group__3__Impl rule__ConsumeForInBuilt__Group__4 )
            // InternalMyDsl.g:3450:2: rule__ConsumeForInBuilt__Group__3__Impl rule__ConsumeForInBuilt__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__ConsumeForInBuilt__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConsumeForInBuilt__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConsumeForInBuilt__Group__3"


    // $ANTLR start "rule__ConsumeForInBuilt__Group__3__Impl"
    // InternalMyDsl.g:3457:1: rule__ConsumeForInBuilt__Group__3__Impl : ( ( rule__ConsumeForInBuilt__SensorForConsumeAssignment_3 ) ) ;
    public final void rule__ConsumeForInBuilt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3461:1: ( ( ( rule__ConsumeForInBuilt__SensorForConsumeAssignment_3 ) ) )
            // InternalMyDsl.g:3462:1: ( ( rule__ConsumeForInBuilt__SensorForConsumeAssignment_3 ) )
            {
            // InternalMyDsl.g:3462:1: ( ( rule__ConsumeForInBuilt__SensorForConsumeAssignment_3 ) )
            // InternalMyDsl.g:3463:2: ( rule__ConsumeForInBuilt__SensorForConsumeAssignment_3 )
            {
             before(grammarAccess.getConsumeForInBuiltAccess().getSensorForConsumeAssignment_3()); 
            // InternalMyDsl.g:3464:2: ( rule__ConsumeForInBuilt__SensorForConsumeAssignment_3 )
            // InternalMyDsl.g:3464:3: rule__ConsumeForInBuilt__SensorForConsumeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ConsumeForInBuilt__SensorForConsumeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConsumeForInBuiltAccess().getSensorForConsumeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConsumeForInBuilt__Group__3__Impl"


    // $ANTLR start "rule__ConsumeForInBuilt__Group__4"
    // InternalMyDsl.g:3472:1: rule__ConsumeForInBuilt__Group__4 : rule__ConsumeForInBuilt__Group__4__Impl ;
    public final void rule__ConsumeForInBuilt__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3476:1: ( rule__ConsumeForInBuilt__Group__4__Impl )
            // InternalMyDsl.g:3477:2: rule__ConsumeForInBuilt__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConsumeForInBuilt__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConsumeForInBuilt__Group__4"


    // $ANTLR start "rule__ConsumeForInBuilt__Group__4__Impl"
    // InternalMyDsl.g:3483:1: rule__ConsumeForInBuilt__Group__4__Impl : ( ';' ) ;
    public final void rule__ConsumeForInBuilt__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3487:1: ( ( ';' ) )
            // InternalMyDsl.g:3488:1: ( ';' )
            {
            // InternalMyDsl.g:3488:1: ( ';' )
            // InternalMyDsl.g:3489:2: ';'
            {
             before(grammarAccess.getConsumeForInBuiltAccess().getSemicolonKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getConsumeForInBuiltAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConsumeForInBuilt__Group__4__Impl"


    // $ANTLR start "rule__ComputeInfoForInBuilt__Group__0"
    // InternalMyDsl.g:3499:1: rule__ComputeInfoForInBuilt__Group__0 : rule__ComputeInfoForInBuilt__Group__0__Impl rule__ComputeInfoForInBuilt__Group__1 ;
    public final void rule__ComputeInfoForInBuilt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3503:1: ( rule__ComputeInfoForInBuilt__Group__0__Impl rule__ComputeInfoForInBuilt__Group__1 )
            // InternalMyDsl.g:3504:2: rule__ComputeInfoForInBuilt__Group__0__Impl rule__ComputeInfoForInBuilt__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__ComputeInfoForInBuilt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputeInfoForInBuilt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInfoForInBuilt__Group__0"


    // $ANTLR start "rule__ComputeInfoForInBuilt__Group__0__Impl"
    // InternalMyDsl.g:3511:1: rule__ComputeInfoForInBuilt__Group__0__Impl : ( 'COMPUTE' ) ;
    public final void rule__ComputeInfoForInBuilt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3515:1: ( ( 'COMPUTE' ) )
            // InternalMyDsl.g:3516:1: ( 'COMPUTE' )
            {
            // InternalMyDsl.g:3516:1: ( 'COMPUTE' )
            // InternalMyDsl.g:3517:2: 'COMPUTE'
            {
             before(grammarAccess.getComputeInfoForInBuiltAccess().getCOMPUTEKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getComputeInfoForInBuiltAccess().getCOMPUTEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInfoForInBuilt__Group__0__Impl"


    // $ANTLR start "rule__ComputeInfoForInBuilt__Group__1"
    // InternalMyDsl.g:3526:1: rule__ComputeInfoForInBuilt__Group__1 : rule__ComputeInfoForInBuilt__Group__1__Impl rule__ComputeInfoForInBuilt__Group__2 ;
    public final void rule__ComputeInfoForInBuilt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3530:1: ( rule__ComputeInfoForInBuilt__Group__1__Impl rule__ComputeInfoForInBuilt__Group__2 )
            // InternalMyDsl.g:3531:2: rule__ComputeInfoForInBuilt__Group__1__Impl rule__ComputeInfoForInBuilt__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__ComputeInfoForInBuilt__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputeInfoForInBuilt__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInfoForInBuilt__Group__1"


    // $ANTLR start "rule__ComputeInfoForInBuilt__Group__1__Impl"
    // InternalMyDsl.g:3538:1: rule__ComputeInfoForInBuilt__Group__1__Impl : ( '(' ) ;
    public final void rule__ComputeInfoForInBuilt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3542:1: ( ( '(' ) )
            // InternalMyDsl.g:3543:1: ( '(' )
            {
            // InternalMyDsl.g:3543:1: ( '(' )
            // InternalMyDsl.g:3544:2: '('
            {
             before(grammarAccess.getComputeInfoForInBuiltAccess().getLeftParenthesisKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getComputeInfoForInBuiltAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInfoForInBuilt__Group__1__Impl"


    // $ANTLR start "rule__ComputeInfoForInBuilt__Group__2"
    // InternalMyDsl.g:3553:1: rule__ComputeInfoForInBuilt__Group__2 : rule__ComputeInfoForInBuilt__Group__2__Impl rule__ComputeInfoForInBuilt__Group__3 ;
    public final void rule__ComputeInfoForInBuilt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3557:1: ( rule__ComputeInfoForInBuilt__Group__2__Impl rule__ComputeInfoForInBuilt__Group__3 )
            // InternalMyDsl.g:3558:2: rule__ComputeInfoForInBuilt__Group__2__Impl rule__ComputeInfoForInBuilt__Group__3
            {
            pushFollow(FOLLOW_43);
            rule__ComputeInfoForInBuilt__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputeInfoForInBuilt__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInfoForInBuilt__Group__2"


    // $ANTLR start "rule__ComputeInfoForInBuilt__Group__2__Impl"
    // InternalMyDsl.g:3565:1: rule__ComputeInfoForInBuilt__Group__2__Impl : ( ( rule__ComputeInfoForInBuilt__OperationNameAssignment_2 ) ) ;
    public final void rule__ComputeInfoForInBuilt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3569:1: ( ( ( rule__ComputeInfoForInBuilt__OperationNameAssignment_2 ) ) )
            // InternalMyDsl.g:3570:1: ( ( rule__ComputeInfoForInBuilt__OperationNameAssignment_2 ) )
            {
            // InternalMyDsl.g:3570:1: ( ( rule__ComputeInfoForInBuilt__OperationNameAssignment_2 ) )
            // InternalMyDsl.g:3571:2: ( rule__ComputeInfoForInBuilt__OperationNameAssignment_2 )
            {
             before(grammarAccess.getComputeInfoForInBuiltAccess().getOperationNameAssignment_2()); 
            // InternalMyDsl.g:3572:2: ( rule__ComputeInfoForInBuilt__OperationNameAssignment_2 )
            // InternalMyDsl.g:3572:3: rule__ComputeInfoForInBuilt__OperationNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ComputeInfoForInBuilt__OperationNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComputeInfoForInBuiltAccess().getOperationNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInfoForInBuilt__Group__2__Impl"


    // $ANTLR start "rule__ComputeInfoForInBuilt__Group__3"
    // InternalMyDsl.g:3580:1: rule__ComputeInfoForInBuilt__Group__3 : rule__ComputeInfoForInBuilt__Group__3__Impl rule__ComputeInfoForInBuilt__Group__4 ;
    public final void rule__ComputeInfoForInBuilt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3584:1: ( rule__ComputeInfoForInBuilt__Group__3__Impl rule__ComputeInfoForInBuilt__Group__4 )
            // InternalMyDsl.g:3585:2: rule__ComputeInfoForInBuilt__Group__3__Impl rule__ComputeInfoForInBuilt__Group__4
            {
            pushFollow(FOLLOW_43);
            rule__ComputeInfoForInBuilt__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputeInfoForInBuilt__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInfoForInBuilt__Group__3"


    // $ANTLR start "rule__ComputeInfoForInBuilt__Group__3__Impl"
    // InternalMyDsl.g:3592:1: rule__ComputeInfoForInBuilt__Group__3__Impl : ( ( rule__ComputeInfoForInBuilt__Group_3__0 )? ) ;
    public final void rule__ComputeInfoForInBuilt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3596:1: ( ( ( rule__ComputeInfoForInBuilt__Group_3__0 )? ) )
            // InternalMyDsl.g:3597:1: ( ( rule__ComputeInfoForInBuilt__Group_3__0 )? )
            {
            // InternalMyDsl.g:3597:1: ( ( rule__ComputeInfoForInBuilt__Group_3__0 )? )
            // InternalMyDsl.g:3598:2: ( rule__ComputeInfoForInBuilt__Group_3__0 )?
            {
             before(grammarAccess.getComputeInfoForInBuiltAccess().getGroup_3()); 
            // InternalMyDsl.g:3599:2: ( rule__ComputeInfoForInBuilt__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==22) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:3599:3: rule__ComputeInfoForInBuilt__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComputeInfoForInBuilt__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComputeInfoForInBuiltAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInfoForInBuilt__Group__3__Impl"


    // $ANTLR start "rule__ComputeInfoForInBuilt__Group__4"
    // InternalMyDsl.g:3607:1: rule__ComputeInfoForInBuilt__Group__4 : rule__ComputeInfoForInBuilt__Group__4__Impl rule__ComputeInfoForInBuilt__Group__5 ;
    public final void rule__ComputeInfoForInBuilt__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3611:1: ( rule__ComputeInfoForInBuilt__Group__4__Impl rule__ComputeInfoForInBuilt__Group__5 )
            // InternalMyDsl.g:3612:2: rule__ComputeInfoForInBuilt__Group__4__Impl rule__ComputeInfoForInBuilt__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__ComputeInfoForInBuilt__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputeInfoForInBuilt__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInfoForInBuilt__Group__4"


    // $ANTLR start "rule__ComputeInfoForInBuilt__Group__4__Impl"
    // InternalMyDsl.g:3619:1: rule__ComputeInfoForInBuilt__Group__4__Impl : ( ')' ) ;
    public final void rule__ComputeInfoForInBuilt__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3623:1: ( ( ')' ) )
            // InternalMyDsl.g:3624:1: ( ')' )
            {
            // InternalMyDsl.g:3624:1: ( ')' )
            // InternalMyDsl.g:3625:2: ')'
            {
             before(grammarAccess.getComputeInfoForInBuiltAccess().getRightParenthesisKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComputeInfoForInBuiltAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInfoForInBuilt__Group__4__Impl"


    // $ANTLR start "rule__ComputeInfoForInBuilt__Group__5"
    // InternalMyDsl.g:3634:1: rule__ComputeInfoForInBuilt__Group__5 : rule__ComputeInfoForInBuilt__Group__5__Impl ;
    public final void rule__ComputeInfoForInBuilt__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3638:1: ( rule__ComputeInfoForInBuilt__Group__5__Impl )
            // InternalMyDsl.g:3639:2: rule__ComputeInfoForInBuilt__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComputeInfoForInBuilt__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInfoForInBuilt__Group__5"


    // $ANTLR start "rule__ComputeInfoForInBuilt__Group__5__Impl"
    // InternalMyDsl.g:3645:1: rule__ComputeInfoForInBuilt__Group__5__Impl : ( ';' ) ;
    public final void rule__ComputeInfoForInBuilt__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3649:1: ( ( ';' ) )
            // InternalMyDsl.g:3650:1: ( ';' )
            {
            // InternalMyDsl.g:3650:1: ( ';' )
            // InternalMyDsl.g:3651:2: ';'
            {
             before(grammarAccess.getComputeInfoForInBuiltAccess().getSemicolonKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getComputeInfoForInBuiltAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInfoForInBuilt__Group__5__Impl"


    // $ANTLR start "rule__ComputeInfoForInBuilt__Group_3__0"
    // InternalMyDsl.g:3661:1: rule__ComputeInfoForInBuilt__Group_3__0 : rule__ComputeInfoForInBuilt__Group_3__0__Impl rule__ComputeInfoForInBuilt__Group_3__1 ;
    public final void rule__ComputeInfoForInBuilt__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3665:1: ( rule__ComputeInfoForInBuilt__Group_3__0__Impl rule__ComputeInfoForInBuilt__Group_3__1 )
            // InternalMyDsl.g:3666:2: rule__ComputeInfoForInBuilt__Group_3__0__Impl rule__ComputeInfoForInBuilt__Group_3__1
            {
            pushFollow(FOLLOW_17);
            rule__ComputeInfoForInBuilt__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputeInfoForInBuilt__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInfoForInBuilt__Group_3__0"


    // $ANTLR start "rule__ComputeInfoForInBuilt__Group_3__0__Impl"
    // InternalMyDsl.g:3673:1: rule__ComputeInfoForInBuilt__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ComputeInfoForInBuilt__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3677:1: ( ( ',' ) )
            // InternalMyDsl.g:3678:1: ( ',' )
            {
            // InternalMyDsl.g:3678:1: ( ',' )
            // InternalMyDsl.g:3679:2: ','
            {
             before(grammarAccess.getComputeInfoForInBuiltAccess().getCommaKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComputeInfoForInBuiltAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInfoForInBuilt__Group_3__0__Impl"


    // $ANTLR start "rule__ComputeInfoForInBuilt__Group_3__1"
    // InternalMyDsl.g:3688:1: rule__ComputeInfoForInBuilt__Group_3__1 : rule__ComputeInfoForInBuilt__Group_3__1__Impl ;
    public final void rule__ComputeInfoForInBuilt__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3692:1: ( rule__ComputeInfoForInBuilt__Group_3__1__Impl )
            // InternalMyDsl.g:3693:2: rule__ComputeInfoForInBuilt__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComputeInfoForInBuilt__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInfoForInBuilt__Group_3__1"


    // $ANTLR start "rule__ComputeInfoForInBuilt__Group_3__1__Impl"
    // InternalMyDsl.g:3699:1: rule__ComputeInfoForInBuilt__Group_3__1__Impl : ( ( rule__ComputeInfoForInBuilt__OperationParameterAssignment_3_1 ) ) ;
    public final void rule__ComputeInfoForInBuilt__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3703:1: ( ( ( rule__ComputeInfoForInBuilt__OperationParameterAssignment_3_1 ) ) )
            // InternalMyDsl.g:3704:1: ( ( rule__ComputeInfoForInBuilt__OperationParameterAssignment_3_1 ) )
            {
            // InternalMyDsl.g:3704:1: ( ( rule__ComputeInfoForInBuilt__OperationParameterAssignment_3_1 ) )
            // InternalMyDsl.g:3705:2: ( rule__ComputeInfoForInBuilt__OperationParameterAssignment_3_1 )
            {
             before(grammarAccess.getComputeInfoForInBuiltAccess().getOperationParameterAssignment_3_1()); 
            // InternalMyDsl.g:3706:2: ( rule__ComputeInfoForInBuilt__OperationParameterAssignment_3_1 )
            // InternalMyDsl.g:3706:3: rule__ComputeInfoForInBuilt__OperationParameterAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComputeInfoForInBuilt__OperationParameterAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComputeInfoForInBuiltAccess().getOperationParameterAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInfoForInBuilt__Group_3__1__Impl"


    // $ANTLR start "rule__Consume__Group__0"
    // InternalMyDsl.g:3715:1: rule__Consume__Group__0 : rule__Consume__Group__0__Impl rule__Consume__Group__1 ;
    public final void rule__Consume__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3719:1: ( rule__Consume__Group__0__Impl rule__Consume__Group__1 )
            // InternalMyDsl.g:3720:2: rule__Consume__Group__0__Impl rule__Consume__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Consume__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Consume__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consume__Group__0"


    // $ANTLR start "rule__Consume__Group__0__Impl"
    // InternalMyDsl.g:3727:1: rule__Consume__Group__0__Impl : ( 'consume' ) ;
    public final void rule__Consume__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3731:1: ( ( 'consume' ) )
            // InternalMyDsl.g:3732:1: ( 'consume' )
            {
            // InternalMyDsl.g:3732:1: ( 'consume' )
            // InternalMyDsl.g:3733:2: 'consume'
            {
             before(grammarAccess.getConsumeAccess().getConsumeKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getConsumeAccess().getConsumeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consume__Group__0__Impl"


    // $ANTLR start "rule__Consume__Group__1"
    // InternalMyDsl.g:3742:1: rule__Consume__Group__1 : rule__Consume__Group__1__Impl rule__Consume__Group__2 ;
    public final void rule__Consume__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3746:1: ( rule__Consume__Group__1__Impl rule__Consume__Group__2 )
            // InternalMyDsl.g:3747:2: rule__Consume__Group__1__Impl rule__Consume__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__Consume__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Consume__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consume__Group__1"


    // $ANTLR start "rule__Consume__Group__1__Impl"
    // InternalMyDsl.g:3754:1: rule__Consume__Group__1__Impl : ( ( rule__Consume__NameAssignment_1 ) ) ;
    public final void rule__Consume__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3758:1: ( ( ( rule__Consume__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3759:1: ( ( rule__Consume__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3759:1: ( ( rule__Consume__NameAssignment_1 ) )
            // InternalMyDsl.g:3760:2: ( rule__Consume__NameAssignment_1 )
            {
             before(grammarAccess.getConsumeAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3761:2: ( rule__Consume__NameAssignment_1 )
            // InternalMyDsl.g:3761:3: rule__Consume__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Consume__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConsumeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consume__Group__1__Impl"


    // $ANTLR start "rule__Consume__Group__2"
    // InternalMyDsl.g:3769:1: rule__Consume__Group__2 : rule__Consume__Group__2__Impl rule__Consume__Group__3 ;
    public final void rule__Consume__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3773:1: ( rule__Consume__Group__2__Impl rule__Consume__Group__3 )
            // InternalMyDsl.g:3774:2: rule__Consume__Group__2__Impl rule__Consume__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Consume__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Consume__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consume__Group__2"


    // $ANTLR start "rule__Consume__Group__2__Impl"
    // InternalMyDsl.g:3781:1: rule__Consume__Group__2__Impl : ( 'from' ) ;
    public final void rule__Consume__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3785:1: ( ( 'from' ) )
            // InternalMyDsl.g:3786:1: ( 'from' )
            {
            // InternalMyDsl.g:3786:1: ( 'from' )
            // InternalMyDsl.g:3787:2: 'from'
            {
             before(grammarAccess.getConsumeAccess().getFromKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getConsumeAccess().getFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consume__Group__2__Impl"


    // $ANTLR start "rule__Consume__Group__3"
    // InternalMyDsl.g:3796:1: rule__Consume__Group__3 : rule__Consume__Group__3__Impl rule__Consume__Group__4 ;
    public final void rule__Consume__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3800:1: ( rule__Consume__Group__3__Impl rule__Consume__Group__4 )
            // InternalMyDsl.g:3801:2: rule__Consume__Group__3__Impl rule__Consume__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Consume__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Consume__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consume__Group__3"


    // $ANTLR start "rule__Consume__Group__3__Impl"
    // InternalMyDsl.g:3808:1: rule__Consume__Group__3__Impl : ( ( rule__Consume__FromNameAssignment_3 ) ) ;
    public final void rule__Consume__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3812:1: ( ( ( rule__Consume__FromNameAssignment_3 ) ) )
            // InternalMyDsl.g:3813:1: ( ( rule__Consume__FromNameAssignment_3 ) )
            {
            // InternalMyDsl.g:3813:1: ( ( rule__Consume__FromNameAssignment_3 ) )
            // InternalMyDsl.g:3814:2: ( rule__Consume__FromNameAssignment_3 )
            {
             before(grammarAccess.getConsumeAccess().getFromNameAssignment_3()); 
            // InternalMyDsl.g:3815:2: ( rule__Consume__FromNameAssignment_3 )
            // InternalMyDsl.g:3815:3: rule__Consume__FromNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Consume__FromNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConsumeAccess().getFromNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consume__Group__3__Impl"


    // $ANTLR start "rule__Consume__Group__4"
    // InternalMyDsl.g:3823:1: rule__Consume__Group__4 : rule__Consume__Group__4__Impl ;
    public final void rule__Consume__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3827:1: ( rule__Consume__Group__4__Impl )
            // InternalMyDsl.g:3828:2: rule__Consume__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Consume__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consume__Group__4"


    // $ANTLR start "rule__Consume__Group__4__Impl"
    // InternalMyDsl.g:3834:1: rule__Consume__Group__4__Impl : ( ';' ) ;
    public final void rule__Consume__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3838:1: ( ( ';' ) )
            // InternalMyDsl.g:3839:1: ( ';' )
            {
            // InternalMyDsl.g:3839:1: ( ';' )
            // InternalMyDsl.g:3840:2: ';'
            {
             before(grammarAccess.getConsumeAccess().getSemicolonKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getConsumeAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consume__Group__4__Impl"


    // $ANTLR start "rule__Command__Group__0"
    // InternalMyDsl.g:3850:1: rule__Command__Group__0 : rule__Command__Group__0__Impl rule__Command__Group__1 ;
    public final void rule__Command__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3854:1: ( rule__Command__Group__0__Impl rule__Command__Group__1 )
            // InternalMyDsl.g:3855:2: rule__Command__Group__0__Impl rule__Command__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Command__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Command__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__0"


    // $ANTLR start "rule__Command__Group__0__Impl"
    // InternalMyDsl.g:3862:1: rule__Command__Group__0__Impl : ( 'command' ) ;
    public final void rule__Command__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3866:1: ( ( 'command' ) )
            // InternalMyDsl.g:3867:1: ( 'command' )
            {
            // InternalMyDsl.g:3867:1: ( 'command' )
            // InternalMyDsl.g:3868:2: 'command'
            {
             before(grammarAccess.getCommandAccess().getCommandKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getCommandAccess().getCommandKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__0__Impl"


    // $ANTLR start "rule__Command__Group__1"
    // InternalMyDsl.g:3877:1: rule__Command__Group__1 : rule__Command__Group__1__Impl rule__Command__Group__2 ;
    public final void rule__Command__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3881:1: ( rule__Command__Group__1__Impl rule__Command__Group__2 )
            // InternalMyDsl.g:3882:2: rule__Command__Group__1__Impl rule__Command__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__Command__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Command__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__1"


    // $ANTLR start "rule__Command__Group__1__Impl"
    // InternalMyDsl.g:3889:1: rule__Command__Group__1__Impl : ( ( rule__Command__CommandNameAssignment_1 ) ) ;
    public final void rule__Command__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3893:1: ( ( ( rule__Command__CommandNameAssignment_1 ) ) )
            // InternalMyDsl.g:3894:1: ( ( rule__Command__CommandNameAssignment_1 ) )
            {
            // InternalMyDsl.g:3894:1: ( ( rule__Command__CommandNameAssignment_1 ) )
            // InternalMyDsl.g:3895:2: ( rule__Command__CommandNameAssignment_1 )
            {
             before(grammarAccess.getCommandAccess().getCommandNameAssignment_1()); 
            // InternalMyDsl.g:3896:2: ( rule__Command__CommandNameAssignment_1 )
            // InternalMyDsl.g:3896:3: rule__Command__CommandNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Command__CommandNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getCommandNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__1__Impl"


    // $ANTLR start "rule__Command__Group__2"
    // InternalMyDsl.g:3904:1: rule__Command__Group__2 : rule__Command__Group__2__Impl rule__Command__Group__3 ;
    public final void rule__Command__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3908:1: ( rule__Command__Group__2__Impl rule__Command__Group__3 )
            // InternalMyDsl.g:3909:2: rule__Command__Group__2__Impl rule__Command__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Command__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Command__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__2"


    // $ANTLR start "rule__Command__Group__2__Impl"
    // InternalMyDsl.g:3916:1: rule__Command__Group__2__Impl : ( '(' ) ;
    public final void rule__Command__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3920:1: ( ( '(' ) )
            // InternalMyDsl.g:3921:1: ( '(' )
            {
            // InternalMyDsl.g:3921:1: ( '(' )
            // InternalMyDsl.g:3922:2: '('
            {
             before(grammarAccess.getCommandAccess().getLeftParenthesisKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCommandAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__2__Impl"


    // $ANTLR start "rule__Command__Group__3"
    // InternalMyDsl.g:3931:1: rule__Command__Group__3 : rule__Command__Group__3__Impl rule__Command__Group__4 ;
    public final void rule__Command__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3935:1: ( rule__Command__Group__3__Impl rule__Command__Group__4 )
            // InternalMyDsl.g:3936:2: rule__Command__Group__3__Impl rule__Command__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Command__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Command__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__3"


    // $ANTLR start "rule__Command__Group__3__Impl"
    // InternalMyDsl.g:3943:1: rule__Command__Group__3__Impl : ( ( rule__Command__CommandparameterAssignment_3 )? ) ;
    public final void rule__Command__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3947:1: ( ( ( rule__Command__CommandparameterAssignment_3 )? ) )
            // InternalMyDsl.g:3948:1: ( ( rule__Command__CommandparameterAssignment_3 )? )
            {
            // InternalMyDsl.g:3948:1: ( ( rule__Command__CommandparameterAssignment_3 )? )
            // InternalMyDsl.g:3949:2: ( rule__Command__CommandparameterAssignment_3 )?
            {
             before(grammarAccess.getCommandAccess().getCommandparameterAssignment_3()); 
            // InternalMyDsl.g:3950:2: ( rule__Command__CommandparameterAssignment_3 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:3950:3: rule__Command__CommandparameterAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Command__CommandparameterAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommandAccess().getCommandparameterAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__3__Impl"


    // $ANTLR start "rule__Command__Group__4"
    // InternalMyDsl.g:3958:1: rule__Command__Group__4 : rule__Command__Group__4__Impl rule__Command__Group__5 ;
    public final void rule__Command__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3962:1: ( rule__Command__Group__4__Impl rule__Command__Group__5 )
            // InternalMyDsl.g:3963:2: rule__Command__Group__4__Impl rule__Command__Group__5
            {
            pushFollow(FOLLOW_41);
            rule__Command__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Command__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__4"


    // $ANTLR start "rule__Command__Group__4__Impl"
    // InternalMyDsl.g:3970:1: rule__Command__Group__4__Impl : ( ')' ) ;
    public final void rule__Command__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3974:1: ( ( ')' ) )
            // InternalMyDsl.g:3975:1: ( ')' )
            {
            // InternalMyDsl.g:3975:1: ( ')' )
            // InternalMyDsl.g:3976:2: ')'
            {
             before(grammarAccess.getCommandAccess().getRightParenthesisKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCommandAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__4__Impl"


    // $ANTLR start "rule__Command__Group__5"
    // InternalMyDsl.g:3985:1: rule__Command__Group__5 : rule__Command__Group__5__Impl rule__Command__Group__6 ;
    public final void rule__Command__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3989:1: ( rule__Command__Group__5__Impl rule__Command__Group__6 )
            // InternalMyDsl.g:3990:2: rule__Command__Group__5__Impl rule__Command__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__Command__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Command__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__5"


    // $ANTLR start "rule__Command__Group__5__Impl"
    // InternalMyDsl.g:3997:1: rule__Command__Group__5__Impl : ( 'to' ) ;
    public final void rule__Command__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4001:1: ( ( 'to' ) )
            // InternalMyDsl.g:4002:1: ( 'to' )
            {
            // InternalMyDsl.g:4002:1: ( 'to' )
            // InternalMyDsl.g:4003:2: 'to'
            {
             before(grammarAccess.getCommandAccess().getToKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCommandAccess().getToKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__5__Impl"


    // $ANTLR start "rule__Command__Group__6"
    // InternalMyDsl.g:4012:1: rule__Command__Group__6 : rule__Command__Group__6__Impl rule__Command__Group__7 ;
    public final void rule__Command__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4016:1: ( rule__Command__Group__6__Impl rule__Command__Group__7 )
            // InternalMyDsl.g:4017:2: rule__Command__Group__6__Impl rule__Command__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Command__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Command__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__6"


    // $ANTLR start "rule__Command__Group__6__Impl"
    // InternalMyDsl.g:4024:1: rule__Command__Group__6__Impl : ( ( rule__Command__ActuatorForCommandAssignment_6 ) ) ;
    public final void rule__Command__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4028:1: ( ( ( rule__Command__ActuatorForCommandAssignment_6 ) ) )
            // InternalMyDsl.g:4029:1: ( ( rule__Command__ActuatorForCommandAssignment_6 ) )
            {
            // InternalMyDsl.g:4029:1: ( ( rule__Command__ActuatorForCommandAssignment_6 ) )
            // InternalMyDsl.g:4030:2: ( rule__Command__ActuatorForCommandAssignment_6 )
            {
             before(grammarAccess.getCommandAccess().getActuatorForCommandAssignment_6()); 
            // InternalMyDsl.g:4031:2: ( rule__Command__ActuatorForCommandAssignment_6 )
            // InternalMyDsl.g:4031:3: rule__Command__ActuatorForCommandAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Command__ActuatorForCommandAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getActuatorForCommandAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__6__Impl"


    // $ANTLR start "rule__Command__Group__7"
    // InternalMyDsl.g:4039:1: rule__Command__Group__7 : rule__Command__Group__7__Impl ;
    public final void rule__Command__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4043:1: ( rule__Command__Group__7__Impl )
            // InternalMyDsl.g:4044:2: rule__Command__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Command__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__7"


    // $ANTLR start "rule__Command__Group__7__Impl"
    // InternalMyDsl.g:4050:1: rule__Command__Group__7__Impl : ( ';' ) ;
    public final void rule__Command__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4054:1: ( ( ';' ) )
            // InternalMyDsl.g:4055:1: ( ';' )
            {
            // InternalMyDsl.g:4055:1: ( ';' )
            // InternalMyDsl.g:4056:2: ';'
            {
             before(grammarAccess.getCommandAccess().getSemicolonKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCommandAccess().getSemicolonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__7__Impl"


    // $ANTLR start "rule__CommandParameter__Group__0"
    // InternalMyDsl.g:4066:1: rule__CommandParameter__Group__0 : rule__CommandParameter__Group__0__Impl rule__CommandParameter__Group__1 ;
    public final void rule__CommandParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4070:1: ( rule__CommandParameter__Group__0__Impl rule__CommandParameter__Group__1 )
            // InternalMyDsl.g:4071:2: rule__CommandParameter__Group__0__Impl rule__CommandParameter__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__CommandParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandParameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandParameter__Group__0"


    // $ANTLR start "rule__CommandParameter__Group__0__Impl"
    // InternalMyDsl.g:4078:1: rule__CommandParameter__Group__0__Impl : ( ( rule__CommandParameter__NameAssignment_0 ) ) ;
    public final void rule__CommandParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4082:1: ( ( ( rule__CommandParameter__NameAssignment_0 ) ) )
            // InternalMyDsl.g:4083:1: ( ( rule__CommandParameter__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:4083:1: ( ( rule__CommandParameter__NameAssignment_0 ) )
            // InternalMyDsl.g:4084:2: ( rule__CommandParameter__NameAssignment_0 )
            {
             before(grammarAccess.getCommandParameterAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:4085:2: ( rule__CommandParameter__NameAssignment_0 )
            // InternalMyDsl.g:4085:3: rule__CommandParameter__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CommandParameter__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCommandParameterAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandParameter__Group__0__Impl"


    // $ANTLR start "rule__CommandParameter__Group__1"
    // InternalMyDsl.g:4093:1: rule__CommandParameter__Group__1 : rule__CommandParameter__Group__1__Impl ;
    public final void rule__CommandParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4097:1: ( rule__CommandParameter__Group__1__Impl )
            // InternalMyDsl.g:4098:2: rule__CommandParameter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandParameter__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandParameter__Group__1"


    // $ANTLR start "rule__CommandParameter__Group__1__Impl"
    // InternalMyDsl.g:4104:1: rule__CommandParameter__Group__1__Impl : ( ( rule__CommandParameter__Group_1__0 )? ) ;
    public final void rule__CommandParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4108:1: ( ( ( rule__CommandParameter__Group_1__0 )? ) )
            // InternalMyDsl.g:4109:1: ( ( rule__CommandParameter__Group_1__0 )? )
            {
            // InternalMyDsl.g:4109:1: ( ( rule__CommandParameter__Group_1__0 )? )
            // InternalMyDsl.g:4110:2: ( rule__CommandParameter__Group_1__0 )?
            {
             before(grammarAccess.getCommandParameterAccess().getGroup_1()); 
            // InternalMyDsl.g:4111:2: ( rule__CommandParameter__Group_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==22) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:4111:3: rule__CommandParameter__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CommandParameter__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommandParameterAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandParameter__Group__1__Impl"


    // $ANTLR start "rule__CommandParameter__Group_1__0"
    // InternalMyDsl.g:4120:1: rule__CommandParameter__Group_1__0 : rule__CommandParameter__Group_1__0__Impl rule__CommandParameter__Group_1__1 ;
    public final void rule__CommandParameter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4124:1: ( rule__CommandParameter__Group_1__0__Impl rule__CommandParameter__Group_1__1 )
            // InternalMyDsl.g:4125:2: rule__CommandParameter__Group_1__0__Impl rule__CommandParameter__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__CommandParameter__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandParameter__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandParameter__Group_1__0"


    // $ANTLR start "rule__CommandParameter__Group_1__0__Impl"
    // InternalMyDsl.g:4132:1: rule__CommandParameter__Group_1__0__Impl : ( ',' ) ;
    public final void rule__CommandParameter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4136:1: ( ( ',' ) )
            // InternalMyDsl.g:4137:1: ( ',' )
            {
            // InternalMyDsl.g:4137:1: ( ',' )
            // InternalMyDsl.g:4138:2: ','
            {
             before(grammarAccess.getCommandParameterAccess().getCommaKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCommandParameterAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandParameter__Group_1__0__Impl"


    // $ANTLR start "rule__CommandParameter__Group_1__1"
    // InternalMyDsl.g:4147:1: rule__CommandParameter__Group_1__1 : rule__CommandParameter__Group_1__1__Impl ;
    public final void rule__CommandParameter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4151:1: ( rule__CommandParameter__Group_1__1__Impl )
            // InternalMyDsl.g:4152:2: rule__CommandParameter__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandParameter__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandParameter__Group_1__1"


    // $ANTLR start "rule__CommandParameter__Group_1__1__Impl"
    // InternalMyDsl.g:4158:1: rule__CommandParameter__Group_1__1__Impl : ( ( rule__CommandParameter__ParameterAssignment_1_1 ) ) ;
    public final void rule__CommandParameter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4162:1: ( ( ( rule__CommandParameter__ParameterAssignment_1_1 ) ) )
            // InternalMyDsl.g:4163:1: ( ( rule__CommandParameter__ParameterAssignment_1_1 ) )
            {
            // InternalMyDsl.g:4163:1: ( ( rule__CommandParameter__ParameterAssignment_1_1 ) )
            // InternalMyDsl.g:4164:2: ( rule__CommandParameter__ParameterAssignment_1_1 )
            {
             before(grammarAccess.getCommandParameterAccess().getParameterAssignment_1_1()); 
            // InternalMyDsl.g:4165:2: ( rule__CommandParameter__ParameterAssignment_1_1 )
            // InternalMyDsl.g:4165:3: rule__CommandParameter__ParameterAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CommandParameter__ParameterAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCommandParameterAccess().getParameterAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandParameter__Group_1__1__Impl"


    // $ANTLR start "rule__VocSpec__Group__0"
    // InternalMyDsl.g:4174:1: rule__VocSpec__Group__0 : rule__VocSpec__Group__0__Impl rule__VocSpec__Group__1 ;
    public final void rule__VocSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4178:1: ( rule__VocSpec__Group__0__Impl rule__VocSpec__Group__1 )
            // InternalMyDsl.g:4179:2: rule__VocSpec__Group__0__Impl rule__VocSpec__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__VocSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VocSpec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group__0"


    // $ANTLR start "rule__VocSpec__Group__0__Impl"
    // InternalMyDsl.g:4186:1: rule__VocSpec__Group__0__Impl : ( 'structs:' ) ;
    public final void rule__VocSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4190:1: ( ( 'structs:' ) )
            // InternalMyDsl.g:4191:1: ( 'structs:' )
            {
            // InternalMyDsl.g:4191:1: ( 'structs:' )
            // InternalMyDsl.g:4192:2: 'structs:'
            {
             before(grammarAccess.getVocSpecAccess().getStructsKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getVocSpecAccess().getStructsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group__0__Impl"


    // $ANTLR start "rule__VocSpec__Group__1"
    // InternalMyDsl.g:4201:1: rule__VocSpec__Group__1 : rule__VocSpec__Group__1__Impl rule__VocSpec__Group__2 ;
    public final void rule__VocSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4205:1: ( rule__VocSpec__Group__1__Impl rule__VocSpec__Group__2 )
            // InternalMyDsl.g:4206:2: rule__VocSpec__Group__1__Impl rule__VocSpec__Group__2
            {
            pushFollow(FOLLOW_44);
            rule__VocSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VocSpec__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group__1"


    // $ANTLR start "rule__VocSpec__Group__1__Impl"
    // InternalMyDsl.g:4213:1: rule__VocSpec__Group__1__Impl : ( ( rule__VocSpec__StructsAssignment_1 )* ) ;
    public final void rule__VocSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4217:1: ( ( ( rule__VocSpec__StructsAssignment_1 )* ) )
            // InternalMyDsl.g:4218:1: ( ( rule__VocSpec__StructsAssignment_1 )* )
            {
            // InternalMyDsl.g:4218:1: ( ( rule__VocSpec__StructsAssignment_1 )* )
            // InternalMyDsl.g:4219:2: ( rule__VocSpec__StructsAssignment_1 )*
            {
             before(grammarAccess.getVocSpecAccess().getStructsAssignment_1()); 
            // InternalMyDsl.g:4220:2: ( rule__VocSpec__StructsAssignment_1 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalMyDsl.g:4220:3: rule__VocSpec__StructsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__VocSpec__StructsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getVocSpecAccess().getStructsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group__1__Impl"


    // $ANTLR start "rule__VocSpec__Group__2"
    // InternalMyDsl.g:4228:1: rule__VocSpec__Group__2 : rule__VocSpec__Group__2__Impl rule__VocSpec__Group__3 ;
    public final void rule__VocSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4232:1: ( rule__VocSpec__Group__2__Impl rule__VocSpec__Group__3 )
            // InternalMyDsl.g:4233:2: rule__VocSpec__Group__2__Impl rule__VocSpec__Group__3
            {
            pushFollow(FOLLOW_45);
            rule__VocSpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VocSpec__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group__2"


    // $ANTLR start "rule__VocSpec__Group__2__Impl"
    // InternalMyDsl.g:4240:1: rule__VocSpec__Group__2__Impl : ( 'resources:' ) ;
    public final void rule__VocSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4244:1: ( ( 'resources:' ) )
            // InternalMyDsl.g:4245:1: ( 'resources:' )
            {
            // InternalMyDsl.g:4245:1: ( 'resources:' )
            // InternalMyDsl.g:4246:2: 'resources:'
            {
             before(grammarAccess.getVocSpecAccess().getResourcesKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getVocSpecAccess().getResourcesKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group__2__Impl"


    // $ANTLR start "rule__VocSpec__Group__3"
    // InternalMyDsl.g:4255:1: rule__VocSpec__Group__3 : rule__VocSpec__Group__3__Impl rule__VocSpec__Group__4 ;
    public final void rule__VocSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4259:1: ( rule__VocSpec__Group__3__Impl rule__VocSpec__Group__4 )
            // InternalMyDsl.g:4260:2: rule__VocSpec__Group__3__Impl rule__VocSpec__Group__4
            {
            pushFollow(FOLLOW_46);
            rule__VocSpec__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VocSpec__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group__3"


    // $ANTLR start "rule__VocSpec__Group__3__Impl"
    // InternalMyDsl.g:4267:1: rule__VocSpec__Group__3__Impl : ( 'sensors:' ) ;
    public final void rule__VocSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4271:1: ( ( 'sensors:' ) )
            // InternalMyDsl.g:4272:1: ( 'sensors:' )
            {
            // InternalMyDsl.g:4272:1: ( 'sensors:' )
            // InternalMyDsl.g:4273:2: 'sensors:'
            {
             before(grammarAccess.getVocSpecAccess().getSensorsKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getVocSpecAccess().getSensorsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group__3__Impl"


    // $ANTLR start "rule__VocSpec__Group__4"
    // InternalMyDsl.g:4282:1: rule__VocSpec__Group__4 : rule__VocSpec__Group__4__Impl rule__VocSpec__Group__5 ;
    public final void rule__VocSpec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4286:1: ( rule__VocSpec__Group__4__Impl rule__VocSpec__Group__5 )
            // InternalMyDsl.g:4287:2: rule__VocSpec__Group__4__Impl rule__VocSpec__Group__5
            {
            pushFollow(FOLLOW_46);
            rule__VocSpec__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VocSpec__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group__4"


    // $ANTLR start "rule__VocSpec__Group__4__Impl"
    // InternalMyDsl.g:4294:1: rule__VocSpec__Group__4__Impl : ( ( rule__VocSpec__Group_4__0 )* ) ;
    public final void rule__VocSpec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4298:1: ( ( ( rule__VocSpec__Group_4__0 )* ) )
            // InternalMyDsl.g:4299:1: ( ( rule__VocSpec__Group_4__0 )* )
            {
            // InternalMyDsl.g:4299:1: ( ( rule__VocSpec__Group_4__0 )* )
            // InternalMyDsl.g:4300:2: ( rule__VocSpec__Group_4__0 )*
            {
             before(grammarAccess.getVocSpecAccess().getGroup_4()); 
            // InternalMyDsl.g:4301:2: ( rule__VocSpec__Group_4__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==38) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalMyDsl.g:4301:3: rule__VocSpec__Group_4__0
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__VocSpec__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getVocSpecAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group__4__Impl"


    // $ANTLR start "rule__VocSpec__Group__5"
    // InternalMyDsl.g:4309:1: rule__VocSpec__Group__5 : rule__VocSpec__Group__5__Impl rule__VocSpec__Group__6 ;
    public final void rule__VocSpec__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4313:1: ( rule__VocSpec__Group__5__Impl rule__VocSpec__Group__6 )
            // InternalMyDsl.g:4314:2: rule__VocSpec__Group__5__Impl rule__VocSpec__Group__6
            {
            pushFollow(FOLLOW_46);
            rule__VocSpec__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VocSpec__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group__5"


    // $ANTLR start "rule__VocSpec__Group__5__Impl"
    // InternalMyDsl.g:4321:1: rule__VocSpec__Group__5__Impl : ( ( rule__VocSpec__Group_5__0 )* ) ;
    public final void rule__VocSpec__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4325:1: ( ( ( rule__VocSpec__Group_5__0 )* ) )
            // InternalMyDsl.g:4326:1: ( ( rule__VocSpec__Group_5__0 )* )
            {
            // InternalMyDsl.g:4326:1: ( ( rule__VocSpec__Group_5__0 )* )
            // InternalMyDsl.g:4327:2: ( rule__VocSpec__Group_5__0 )*
            {
             before(grammarAccess.getVocSpecAccess().getGroup_5()); 
            // InternalMyDsl.g:4328:2: ( rule__VocSpec__Group_5__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==39) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalMyDsl.g:4328:3: rule__VocSpec__Group_5__0
            	    {
            	    pushFollow(FOLLOW_48);
            	    rule__VocSpec__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getVocSpecAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group__5__Impl"


    // $ANTLR start "rule__VocSpec__Group__6"
    // InternalMyDsl.g:4336:1: rule__VocSpec__Group__6 : rule__VocSpec__Group__6__Impl rule__VocSpec__Group__7 ;
    public final void rule__VocSpec__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4340:1: ( rule__VocSpec__Group__6__Impl rule__VocSpec__Group__7 )
            // InternalMyDsl.g:4341:2: rule__VocSpec__Group__6__Impl rule__VocSpec__Group__7
            {
            pushFollow(FOLLOW_46);
            rule__VocSpec__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VocSpec__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group__6"


    // $ANTLR start "rule__VocSpec__Group__6__Impl"
    // InternalMyDsl.g:4348:1: rule__VocSpec__Group__6__Impl : ( ( rule__VocSpec__Group_6__0 )* ) ;
    public final void rule__VocSpec__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4352:1: ( ( ( rule__VocSpec__Group_6__0 )* ) )
            // InternalMyDsl.g:4353:1: ( ( rule__VocSpec__Group_6__0 )* )
            {
            // InternalMyDsl.g:4353:1: ( ( rule__VocSpec__Group_6__0 )* )
            // InternalMyDsl.g:4354:2: ( rule__VocSpec__Group_6__0 )*
            {
             before(grammarAccess.getVocSpecAccess().getGroup_6()); 
            // InternalMyDsl.g:4355:2: ( rule__VocSpec__Group_6__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==40) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalMyDsl.g:4355:3: rule__VocSpec__Group_6__0
            	    {
            	    pushFollow(FOLLOW_49);
            	    rule__VocSpec__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getVocSpecAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group__6__Impl"


    // $ANTLR start "rule__VocSpec__Group__7"
    // InternalMyDsl.g:4363:1: rule__VocSpec__Group__7 : rule__VocSpec__Group__7__Impl rule__VocSpec__Group__8 ;
    public final void rule__VocSpec__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4367:1: ( rule__VocSpec__Group__7__Impl rule__VocSpec__Group__8 )
            // InternalMyDsl.g:4368:2: rule__VocSpec__Group__7__Impl rule__VocSpec__Group__8
            {
            pushFollow(FOLLOW_46);
            rule__VocSpec__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VocSpec__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group__7"


    // $ANTLR start "rule__VocSpec__Group__7__Impl"
    // InternalMyDsl.g:4375:1: rule__VocSpec__Group__7__Impl : ( ( rule__VocSpec__Group_7__0 )* ) ;
    public final void rule__VocSpec__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4379:1: ( ( ( rule__VocSpec__Group_7__0 )* ) )
            // InternalMyDsl.g:4380:1: ( ( rule__VocSpec__Group_7__0 )* )
            {
            // InternalMyDsl.g:4380:1: ( ( rule__VocSpec__Group_7__0 )* )
            // InternalMyDsl.g:4381:2: ( rule__VocSpec__Group_7__0 )*
            {
             before(grammarAccess.getVocSpecAccess().getGroup_7()); 
            // InternalMyDsl.g:4382:2: ( rule__VocSpec__Group_7__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==41) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalMyDsl.g:4382:3: rule__VocSpec__Group_7__0
            	    {
            	    pushFollow(FOLLOW_50);
            	    rule__VocSpec__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getVocSpecAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group__7__Impl"


    // $ANTLR start "rule__VocSpec__Group__8"
    // InternalMyDsl.g:4390:1: rule__VocSpec__Group__8 : rule__VocSpec__Group__8__Impl rule__VocSpec__Group__9 ;
    public final void rule__VocSpec__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4394:1: ( rule__VocSpec__Group__8__Impl rule__VocSpec__Group__9 )
            // InternalMyDsl.g:4395:2: rule__VocSpec__Group__8__Impl rule__VocSpec__Group__9
            {
            pushFollow(FOLLOW_46);
            rule__VocSpec__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VocSpec__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group__8"


    // $ANTLR start "rule__VocSpec__Group__8__Impl"
    // InternalMyDsl.g:4402:1: rule__VocSpec__Group__8__Impl : ( ( rule__VocSpec__Group_8__0 )* ) ;
    public final void rule__VocSpec__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4406:1: ( ( ( rule__VocSpec__Group_8__0 )* ) )
            // InternalMyDsl.g:4407:1: ( ( rule__VocSpec__Group_8__0 )* )
            {
            // InternalMyDsl.g:4407:1: ( ( rule__VocSpec__Group_8__0 )* )
            // InternalMyDsl.g:4408:2: ( rule__VocSpec__Group_8__0 )*
            {
             before(grammarAccess.getVocSpecAccess().getGroup_8()); 
            // InternalMyDsl.g:4409:2: ( rule__VocSpec__Group_8__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==42) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalMyDsl.g:4409:3: rule__VocSpec__Group_8__0
            	    {
            	    pushFollow(FOLLOW_51);
            	    rule__VocSpec__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getVocSpecAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group__8__Impl"


    // $ANTLR start "rule__VocSpec__Group__9"
    // InternalMyDsl.g:4417:1: rule__VocSpec__Group__9 : rule__VocSpec__Group__9__Impl ;
    public final void rule__VocSpec__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4421:1: ( rule__VocSpec__Group__9__Impl )
            // InternalMyDsl.g:4422:2: rule__VocSpec__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VocSpec__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group__9"


    // $ANTLR start "rule__VocSpec__Group__9__Impl"
    // InternalMyDsl.g:4428:1: rule__VocSpec__Group__9__Impl : ( ( rule__VocSpec__Group_9__0 )* ) ;
    public final void rule__VocSpec__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4432:1: ( ( ( rule__VocSpec__Group_9__0 )* ) )
            // InternalMyDsl.g:4433:1: ( ( rule__VocSpec__Group_9__0 )* )
            {
            // InternalMyDsl.g:4433:1: ( ( rule__VocSpec__Group_9__0 )* )
            // InternalMyDsl.g:4434:2: ( rule__VocSpec__Group_9__0 )*
            {
             before(grammarAccess.getVocSpecAccess().getGroup_9()); 
            // InternalMyDsl.g:4435:2: ( rule__VocSpec__Group_9__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==43) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalMyDsl.g:4435:3: rule__VocSpec__Group_9__0
            	    {
            	    pushFollow(FOLLOW_52);
            	    rule__VocSpec__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getVocSpecAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group__9__Impl"


    // $ANTLR start "rule__VocSpec__Group_4__0"
    // InternalMyDsl.g:4444:1: rule__VocSpec__Group_4__0 : rule__VocSpec__Group_4__0__Impl rule__VocSpec__Group_4__1 ;
    public final void rule__VocSpec__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4448:1: ( rule__VocSpec__Group_4__0__Impl rule__VocSpec__Group_4__1 )
            // InternalMyDsl.g:4449:2: rule__VocSpec__Group_4__0__Impl rule__VocSpec__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__VocSpec__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VocSpec__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group_4__0"


    // $ANTLR start "rule__VocSpec__Group_4__0__Impl"
    // InternalMyDsl.g:4456:1: rule__VocSpec__Group_4__0__Impl : ( 'periodicSensors:' ) ;
    public final void rule__VocSpec__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4460:1: ( ( 'periodicSensors:' ) )
            // InternalMyDsl.g:4461:1: ( 'periodicSensors:' )
            {
            // InternalMyDsl.g:4461:1: ( 'periodicSensors:' )
            // InternalMyDsl.g:4462:2: 'periodicSensors:'
            {
             before(grammarAccess.getVocSpecAccess().getPeriodicSensorsKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getVocSpecAccess().getPeriodicSensorsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group_4__0__Impl"


    // $ANTLR start "rule__VocSpec__Group_4__1"
    // InternalMyDsl.g:4471:1: rule__VocSpec__Group_4__1 : rule__VocSpec__Group_4__1__Impl ;
    public final void rule__VocSpec__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4475:1: ( rule__VocSpec__Group_4__1__Impl )
            // InternalMyDsl.g:4476:2: rule__VocSpec__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VocSpec__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group_4__1"


    // $ANTLR start "rule__VocSpec__Group_4__1__Impl"
    // InternalMyDsl.g:4482:1: rule__VocSpec__Group_4__1__Impl : ( ( ( rule__VocSpec__PeriodicSensorsAssignment_4_1 ) ) ( ( rule__VocSpec__PeriodicSensorsAssignment_4_1 )* ) ) ;
    public final void rule__VocSpec__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4486:1: ( ( ( ( rule__VocSpec__PeriodicSensorsAssignment_4_1 ) ) ( ( rule__VocSpec__PeriodicSensorsAssignment_4_1 )* ) ) )
            // InternalMyDsl.g:4487:1: ( ( ( rule__VocSpec__PeriodicSensorsAssignment_4_1 ) ) ( ( rule__VocSpec__PeriodicSensorsAssignment_4_1 )* ) )
            {
            // InternalMyDsl.g:4487:1: ( ( ( rule__VocSpec__PeriodicSensorsAssignment_4_1 ) ) ( ( rule__VocSpec__PeriodicSensorsAssignment_4_1 )* ) )
            // InternalMyDsl.g:4488:2: ( ( rule__VocSpec__PeriodicSensorsAssignment_4_1 ) ) ( ( rule__VocSpec__PeriodicSensorsAssignment_4_1 )* )
            {
            // InternalMyDsl.g:4488:2: ( ( rule__VocSpec__PeriodicSensorsAssignment_4_1 ) )
            // InternalMyDsl.g:4489:3: ( rule__VocSpec__PeriodicSensorsAssignment_4_1 )
            {
             before(grammarAccess.getVocSpecAccess().getPeriodicSensorsAssignment_4_1()); 
            // InternalMyDsl.g:4490:3: ( rule__VocSpec__PeriodicSensorsAssignment_4_1 )
            // InternalMyDsl.g:4490:4: rule__VocSpec__PeriodicSensorsAssignment_4_1
            {
            pushFollow(FOLLOW_4);
            rule__VocSpec__PeriodicSensorsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getVocSpecAccess().getPeriodicSensorsAssignment_4_1()); 

            }

            // InternalMyDsl.g:4493:2: ( ( rule__VocSpec__PeriodicSensorsAssignment_4_1 )* )
            // InternalMyDsl.g:4494:3: ( rule__VocSpec__PeriodicSensorsAssignment_4_1 )*
            {
             before(grammarAccess.getVocSpecAccess().getPeriodicSensorsAssignment_4_1()); 
            // InternalMyDsl.g:4495:3: ( rule__VocSpec__PeriodicSensorsAssignment_4_1 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalMyDsl.g:4495:4: rule__VocSpec__PeriodicSensorsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__VocSpec__PeriodicSensorsAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getVocSpecAccess().getPeriodicSensorsAssignment_4_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group_4__1__Impl"


    // $ANTLR start "rule__VocSpec__Group_5__0"
    // InternalMyDsl.g:4505:1: rule__VocSpec__Group_5__0 : rule__VocSpec__Group_5__0__Impl rule__VocSpec__Group_5__1 ;
    public final void rule__VocSpec__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4509:1: ( rule__VocSpec__Group_5__0__Impl rule__VocSpec__Group_5__1 )
            // InternalMyDsl.g:4510:2: rule__VocSpec__Group_5__0__Impl rule__VocSpec__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__VocSpec__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VocSpec__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group_5__0"


    // $ANTLR start "rule__VocSpec__Group_5__0__Impl"
    // InternalMyDsl.g:4517:1: rule__VocSpec__Group_5__0__Impl : ( 'eventDrivenSensors:' ) ;
    public final void rule__VocSpec__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4521:1: ( ( 'eventDrivenSensors:' ) )
            // InternalMyDsl.g:4522:1: ( 'eventDrivenSensors:' )
            {
            // InternalMyDsl.g:4522:1: ( 'eventDrivenSensors:' )
            // InternalMyDsl.g:4523:2: 'eventDrivenSensors:'
            {
             before(grammarAccess.getVocSpecAccess().getEventDrivenSensorsKeyword_5_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getVocSpecAccess().getEventDrivenSensorsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group_5__0__Impl"


    // $ANTLR start "rule__VocSpec__Group_5__1"
    // InternalMyDsl.g:4532:1: rule__VocSpec__Group_5__1 : rule__VocSpec__Group_5__1__Impl ;
    public final void rule__VocSpec__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4536:1: ( rule__VocSpec__Group_5__1__Impl )
            // InternalMyDsl.g:4537:2: rule__VocSpec__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VocSpec__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group_5__1"


    // $ANTLR start "rule__VocSpec__Group_5__1__Impl"
    // InternalMyDsl.g:4543:1: rule__VocSpec__Group_5__1__Impl : ( ( ( rule__VocSpec__EventSensorsAssignment_5_1 ) ) ( ( rule__VocSpec__EventSensorsAssignment_5_1 )* ) ) ;
    public final void rule__VocSpec__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4547:1: ( ( ( ( rule__VocSpec__EventSensorsAssignment_5_1 ) ) ( ( rule__VocSpec__EventSensorsAssignment_5_1 )* ) ) )
            // InternalMyDsl.g:4548:1: ( ( ( rule__VocSpec__EventSensorsAssignment_5_1 ) ) ( ( rule__VocSpec__EventSensorsAssignment_5_1 )* ) )
            {
            // InternalMyDsl.g:4548:1: ( ( ( rule__VocSpec__EventSensorsAssignment_5_1 ) ) ( ( rule__VocSpec__EventSensorsAssignment_5_1 )* ) )
            // InternalMyDsl.g:4549:2: ( ( rule__VocSpec__EventSensorsAssignment_5_1 ) ) ( ( rule__VocSpec__EventSensorsAssignment_5_1 )* )
            {
            // InternalMyDsl.g:4549:2: ( ( rule__VocSpec__EventSensorsAssignment_5_1 ) )
            // InternalMyDsl.g:4550:3: ( rule__VocSpec__EventSensorsAssignment_5_1 )
            {
             before(grammarAccess.getVocSpecAccess().getEventSensorsAssignment_5_1()); 
            // InternalMyDsl.g:4551:3: ( rule__VocSpec__EventSensorsAssignment_5_1 )
            // InternalMyDsl.g:4551:4: rule__VocSpec__EventSensorsAssignment_5_1
            {
            pushFollow(FOLLOW_4);
            rule__VocSpec__EventSensorsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getVocSpecAccess().getEventSensorsAssignment_5_1()); 

            }

            // InternalMyDsl.g:4554:2: ( ( rule__VocSpec__EventSensorsAssignment_5_1 )* )
            // InternalMyDsl.g:4555:3: ( rule__VocSpec__EventSensorsAssignment_5_1 )*
            {
             before(grammarAccess.getVocSpecAccess().getEventSensorsAssignment_5_1()); 
            // InternalMyDsl.g:4556:3: ( rule__VocSpec__EventSensorsAssignment_5_1 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_ID) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalMyDsl.g:4556:4: rule__VocSpec__EventSensorsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__VocSpec__EventSensorsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getVocSpecAccess().getEventSensorsAssignment_5_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group_5__1__Impl"


    // $ANTLR start "rule__VocSpec__Group_6__0"
    // InternalMyDsl.g:4566:1: rule__VocSpec__Group_6__0 : rule__VocSpec__Group_6__0__Impl rule__VocSpec__Group_6__1 ;
    public final void rule__VocSpec__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4570:1: ( rule__VocSpec__Group_6__0__Impl rule__VocSpec__Group_6__1 )
            // InternalMyDsl.g:4571:2: rule__VocSpec__Group_6__0__Impl rule__VocSpec__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__VocSpec__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VocSpec__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group_6__0"


    // $ANTLR start "rule__VocSpec__Group_6__0__Impl"
    // InternalMyDsl.g:4578:1: rule__VocSpec__Group_6__0__Impl : ( 'requestBasedSensors:' ) ;
    public final void rule__VocSpec__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4582:1: ( ( 'requestBasedSensors:' ) )
            // InternalMyDsl.g:4583:1: ( 'requestBasedSensors:' )
            {
            // InternalMyDsl.g:4583:1: ( 'requestBasedSensors:' )
            // InternalMyDsl.g:4584:2: 'requestBasedSensors:'
            {
             before(grammarAccess.getVocSpecAccess().getRequestBasedSensorsKeyword_6_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getVocSpecAccess().getRequestBasedSensorsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group_6__0__Impl"


    // $ANTLR start "rule__VocSpec__Group_6__1"
    // InternalMyDsl.g:4593:1: rule__VocSpec__Group_6__1 : rule__VocSpec__Group_6__1__Impl ;
    public final void rule__VocSpec__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4597:1: ( rule__VocSpec__Group_6__1__Impl )
            // InternalMyDsl.g:4598:2: rule__VocSpec__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VocSpec__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group_6__1"


    // $ANTLR start "rule__VocSpec__Group_6__1__Impl"
    // InternalMyDsl.g:4604:1: rule__VocSpec__Group_6__1__Impl : ( ( ( rule__VocSpec__RequestSensorsAssignment_6_1 ) ) ( ( rule__VocSpec__RequestSensorsAssignment_6_1 )* ) ) ;
    public final void rule__VocSpec__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4608:1: ( ( ( ( rule__VocSpec__RequestSensorsAssignment_6_1 ) ) ( ( rule__VocSpec__RequestSensorsAssignment_6_1 )* ) ) )
            // InternalMyDsl.g:4609:1: ( ( ( rule__VocSpec__RequestSensorsAssignment_6_1 ) ) ( ( rule__VocSpec__RequestSensorsAssignment_6_1 )* ) )
            {
            // InternalMyDsl.g:4609:1: ( ( ( rule__VocSpec__RequestSensorsAssignment_6_1 ) ) ( ( rule__VocSpec__RequestSensorsAssignment_6_1 )* ) )
            // InternalMyDsl.g:4610:2: ( ( rule__VocSpec__RequestSensorsAssignment_6_1 ) ) ( ( rule__VocSpec__RequestSensorsAssignment_6_1 )* )
            {
            // InternalMyDsl.g:4610:2: ( ( rule__VocSpec__RequestSensorsAssignment_6_1 ) )
            // InternalMyDsl.g:4611:3: ( rule__VocSpec__RequestSensorsAssignment_6_1 )
            {
             before(grammarAccess.getVocSpecAccess().getRequestSensorsAssignment_6_1()); 
            // InternalMyDsl.g:4612:3: ( rule__VocSpec__RequestSensorsAssignment_6_1 )
            // InternalMyDsl.g:4612:4: rule__VocSpec__RequestSensorsAssignment_6_1
            {
            pushFollow(FOLLOW_4);
            rule__VocSpec__RequestSensorsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getVocSpecAccess().getRequestSensorsAssignment_6_1()); 

            }

            // InternalMyDsl.g:4615:2: ( ( rule__VocSpec__RequestSensorsAssignment_6_1 )* )
            // InternalMyDsl.g:4616:3: ( rule__VocSpec__RequestSensorsAssignment_6_1 )*
            {
             before(grammarAccess.getVocSpecAccess().getRequestSensorsAssignment_6_1()); 
            // InternalMyDsl.g:4617:3: ( rule__VocSpec__RequestSensorsAssignment_6_1 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_ID) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalMyDsl.g:4617:4: rule__VocSpec__RequestSensorsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__VocSpec__RequestSensorsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getVocSpecAccess().getRequestSensorsAssignment_6_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group_6__1__Impl"


    // $ANTLR start "rule__VocSpec__Group_7__0"
    // InternalMyDsl.g:4627:1: rule__VocSpec__Group_7__0 : rule__VocSpec__Group_7__0__Impl rule__VocSpec__Group_7__1 ;
    public final void rule__VocSpec__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4631:1: ( rule__VocSpec__Group_7__0__Impl rule__VocSpec__Group_7__1 )
            // InternalMyDsl.g:4632:2: rule__VocSpec__Group_7__0__Impl rule__VocSpec__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__VocSpec__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VocSpec__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group_7__0"


    // $ANTLR start "rule__VocSpec__Group_7__0__Impl"
    // InternalMyDsl.g:4639:1: rule__VocSpec__Group_7__0__Impl : ( 'tags:' ) ;
    public final void rule__VocSpec__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4643:1: ( ( 'tags:' ) )
            // InternalMyDsl.g:4644:1: ( 'tags:' )
            {
            // InternalMyDsl.g:4644:1: ( 'tags:' )
            // InternalMyDsl.g:4645:2: 'tags:'
            {
             before(grammarAccess.getVocSpecAccess().getTagsKeyword_7_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getVocSpecAccess().getTagsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group_7__0__Impl"


    // $ANTLR start "rule__VocSpec__Group_7__1"
    // InternalMyDsl.g:4654:1: rule__VocSpec__Group_7__1 : rule__VocSpec__Group_7__1__Impl ;
    public final void rule__VocSpec__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4658:1: ( rule__VocSpec__Group_7__1__Impl )
            // InternalMyDsl.g:4659:2: rule__VocSpec__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VocSpec__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group_7__1"


    // $ANTLR start "rule__VocSpec__Group_7__1__Impl"
    // InternalMyDsl.g:4665:1: rule__VocSpec__Group_7__1__Impl : ( ( ( rule__VocSpec__TagsAssignment_7_1 ) ) ( ( rule__VocSpec__TagsAssignment_7_1 )* ) ) ;
    public final void rule__VocSpec__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4669:1: ( ( ( ( rule__VocSpec__TagsAssignment_7_1 ) ) ( ( rule__VocSpec__TagsAssignment_7_1 )* ) ) )
            // InternalMyDsl.g:4670:1: ( ( ( rule__VocSpec__TagsAssignment_7_1 ) ) ( ( rule__VocSpec__TagsAssignment_7_1 )* ) )
            {
            // InternalMyDsl.g:4670:1: ( ( ( rule__VocSpec__TagsAssignment_7_1 ) ) ( ( rule__VocSpec__TagsAssignment_7_1 )* ) )
            // InternalMyDsl.g:4671:2: ( ( rule__VocSpec__TagsAssignment_7_1 ) ) ( ( rule__VocSpec__TagsAssignment_7_1 )* )
            {
            // InternalMyDsl.g:4671:2: ( ( rule__VocSpec__TagsAssignment_7_1 ) )
            // InternalMyDsl.g:4672:3: ( rule__VocSpec__TagsAssignment_7_1 )
            {
             before(grammarAccess.getVocSpecAccess().getTagsAssignment_7_1()); 
            // InternalMyDsl.g:4673:3: ( rule__VocSpec__TagsAssignment_7_1 )
            // InternalMyDsl.g:4673:4: rule__VocSpec__TagsAssignment_7_1
            {
            pushFollow(FOLLOW_4);
            rule__VocSpec__TagsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getVocSpecAccess().getTagsAssignment_7_1()); 

            }

            // InternalMyDsl.g:4676:2: ( ( rule__VocSpec__TagsAssignment_7_1 )* )
            // InternalMyDsl.g:4677:3: ( rule__VocSpec__TagsAssignment_7_1 )*
            {
             before(grammarAccess.getVocSpecAccess().getTagsAssignment_7_1()); 
            // InternalMyDsl.g:4678:3: ( rule__VocSpec__TagsAssignment_7_1 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_ID) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalMyDsl.g:4678:4: rule__VocSpec__TagsAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__VocSpec__TagsAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getVocSpecAccess().getTagsAssignment_7_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group_7__1__Impl"


    // $ANTLR start "rule__VocSpec__Group_8__0"
    // InternalMyDsl.g:4688:1: rule__VocSpec__Group_8__0 : rule__VocSpec__Group_8__0__Impl rule__VocSpec__Group_8__1 ;
    public final void rule__VocSpec__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4692:1: ( rule__VocSpec__Group_8__0__Impl rule__VocSpec__Group_8__1 )
            // InternalMyDsl.g:4693:2: rule__VocSpec__Group_8__0__Impl rule__VocSpec__Group_8__1
            {
            pushFollow(FOLLOW_3);
            rule__VocSpec__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VocSpec__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group_8__0"


    // $ANTLR start "rule__VocSpec__Group_8__0__Impl"
    // InternalMyDsl.g:4700:1: rule__VocSpec__Group_8__0__Impl : ( 'actuators:' ) ;
    public final void rule__VocSpec__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4704:1: ( ( 'actuators:' ) )
            // InternalMyDsl.g:4705:1: ( 'actuators:' )
            {
            // InternalMyDsl.g:4705:1: ( 'actuators:' )
            // InternalMyDsl.g:4706:2: 'actuators:'
            {
             before(grammarAccess.getVocSpecAccess().getActuatorsKeyword_8_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getVocSpecAccess().getActuatorsKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group_8__0__Impl"


    // $ANTLR start "rule__VocSpec__Group_8__1"
    // InternalMyDsl.g:4715:1: rule__VocSpec__Group_8__1 : rule__VocSpec__Group_8__1__Impl ;
    public final void rule__VocSpec__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4719:1: ( rule__VocSpec__Group_8__1__Impl )
            // InternalMyDsl.g:4720:2: rule__VocSpec__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VocSpec__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group_8__1"


    // $ANTLR start "rule__VocSpec__Group_8__1__Impl"
    // InternalMyDsl.g:4726:1: rule__VocSpec__Group_8__1__Impl : ( ( ( rule__VocSpec__ActuatorsAssignment_8_1 ) ) ( ( rule__VocSpec__ActuatorsAssignment_8_1 )* ) ) ;
    public final void rule__VocSpec__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4730:1: ( ( ( ( rule__VocSpec__ActuatorsAssignment_8_1 ) ) ( ( rule__VocSpec__ActuatorsAssignment_8_1 )* ) ) )
            // InternalMyDsl.g:4731:1: ( ( ( rule__VocSpec__ActuatorsAssignment_8_1 ) ) ( ( rule__VocSpec__ActuatorsAssignment_8_1 )* ) )
            {
            // InternalMyDsl.g:4731:1: ( ( ( rule__VocSpec__ActuatorsAssignment_8_1 ) ) ( ( rule__VocSpec__ActuatorsAssignment_8_1 )* ) )
            // InternalMyDsl.g:4732:2: ( ( rule__VocSpec__ActuatorsAssignment_8_1 ) ) ( ( rule__VocSpec__ActuatorsAssignment_8_1 )* )
            {
            // InternalMyDsl.g:4732:2: ( ( rule__VocSpec__ActuatorsAssignment_8_1 ) )
            // InternalMyDsl.g:4733:3: ( rule__VocSpec__ActuatorsAssignment_8_1 )
            {
             before(grammarAccess.getVocSpecAccess().getActuatorsAssignment_8_1()); 
            // InternalMyDsl.g:4734:3: ( rule__VocSpec__ActuatorsAssignment_8_1 )
            // InternalMyDsl.g:4734:4: rule__VocSpec__ActuatorsAssignment_8_1
            {
            pushFollow(FOLLOW_4);
            rule__VocSpec__ActuatorsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getVocSpecAccess().getActuatorsAssignment_8_1()); 

            }

            // InternalMyDsl.g:4737:2: ( ( rule__VocSpec__ActuatorsAssignment_8_1 )* )
            // InternalMyDsl.g:4738:3: ( rule__VocSpec__ActuatorsAssignment_8_1 )*
            {
             before(grammarAccess.getVocSpecAccess().getActuatorsAssignment_8_1()); 
            // InternalMyDsl.g:4739:3: ( rule__VocSpec__ActuatorsAssignment_8_1 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ID) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalMyDsl.g:4739:4: rule__VocSpec__ActuatorsAssignment_8_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__VocSpec__ActuatorsAssignment_8_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getVocSpecAccess().getActuatorsAssignment_8_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group_8__1__Impl"


    // $ANTLR start "rule__VocSpec__Group_9__0"
    // InternalMyDsl.g:4749:1: rule__VocSpec__Group_9__0 : rule__VocSpec__Group_9__0__Impl rule__VocSpec__Group_9__1 ;
    public final void rule__VocSpec__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4753:1: ( rule__VocSpec__Group_9__0__Impl rule__VocSpec__Group_9__1 )
            // InternalMyDsl.g:4754:2: rule__VocSpec__Group_9__0__Impl rule__VocSpec__Group_9__1
            {
            pushFollow(FOLLOW_3);
            rule__VocSpec__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VocSpec__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group_9__0"


    // $ANTLR start "rule__VocSpec__Group_9__0__Impl"
    // InternalMyDsl.g:4761:1: rule__VocSpec__Group_9__0__Impl : ( 'storages:' ) ;
    public final void rule__VocSpec__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4765:1: ( ( 'storages:' ) )
            // InternalMyDsl.g:4766:1: ( 'storages:' )
            {
            // InternalMyDsl.g:4766:1: ( 'storages:' )
            // InternalMyDsl.g:4767:2: 'storages:'
            {
             before(grammarAccess.getVocSpecAccess().getStoragesKeyword_9_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getVocSpecAccess().getStoragesKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group_9__0__Impl"


    // $ANTLR start "rule__VocSpec__Group_9__1"
    // InternalMyDsl.g:4776:1: rule__VocSpec__Group_9__1 : rule__VocSpec__Group_9__1__Impl ;
    public final void rule__VocSpec__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4780:1: ( rule__VocSpec__Group_9__1__Impl )
            // InternalMyDsl.g:4781:2: rule__VocSpec__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VocSpec__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group_9__1"


    // $ANTLR start "rule__VocSpec__Group_9__1__Impl"
    // InternalMyDsl.g:4787:1: rule__VocSpec__Group_9__1__Impl : ( ( ( rule__VocSpec__StorageServiceAssignment_9_1 ) ) ( ( rule__VocSpec__StorageServiceAssignment_9_1 )* ) ) ;
    public final void rule__VocSpec__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4791:1: ( ( ( ( rule__VocSpec__StorageServiceAssignment_9_1 ) ) ( ( rule__VocSpec__StorageServiceAssignment_9_1 )* ) ) )
            // InternalMyDsl.g:4792:1: ( ( ( rule__VocSpec__StorageServiceAssignment_9_1 ) ) ( ( rule__VocSpec__StorageServiceAssignment_9_1 )* ) )
            {
            // InternalMyDsl.g:4792:1: ( ( ( rule__VocSpec__StorageServiceAssignment_9_1 ) ) ( ( rule__VocSpec__StorageServiceAssignment_9_1 )* ) )
            // InternalMyDsl.g:4793:2: ( ( rule__VocSpec__StorageServiceAssignment_9_1 ) ) ( ( rule__VocSpec__StorageServiceAssignment_9_1 )* )
            {
            // InternalMyDsl.g:4793:2: ( ( rule__VocSpec__StorageServiceAssignment_9_1 ) )
            // InternalMyDsl.g:4794:3: ( rule__VocSpec__StorageServiceAssignment_9_1 )
            {
             before(grammarAccess.getVocSpecAccess().getStorageServiceAssignment_9_1()); 
            // InternalMyDsl.g:4795:3: ( rule__VocSpec__StorageServiceAssignment_9_1 )
            // InternalMyDsl.g:4795:4: rule__VocSpec__StorageServiceAssignment_9_1
            {
            pushFollow(FOLLOW_4);
            rule__VocSpec__StorageServiceAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getVocSpecAccess().getStorageServiceAssignment_9_1()); 

            }

            // InternalMyDsl.g:4798:2: ( ( rule__VocSpec__StorageServiceAssignment_9_1 )* )
            // InternalMyDsl.g:4799:3: ( rule__VocSpec__StorageServiceAssignment_9_1 )*
            {
             before(grammarAccess.getVocSpecAccess().getStorageServiceAssignment_9_1()); 
            // InternalMyDsl.g:4800:3: ( rule__VocSpec__StorageServiceAssignment_9_1 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_ID) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalMyDsl.g:4800:4: rule__VocSpec__StorageServiceAssignment_9_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__VocSpec__StorageServiceAssignment_9_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getVocSpecAccess().getStorageServiceAssignment_9_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__Group_9__1__Impl"


    // $ANTLR start "rule__Struct__Group__0"
    // InternalMyDsl.g:4810:1: rule__Struct__Group__0 : rule__Struct__Group__0__Impl rule__Struct__Group__1 ;
    public final void rule__Struct__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4814:1: ( rule__Struct__Group__0__Impl rule__Struct__Group__1 )
            // InternalMyDsl.g:4815:2: rule__Struct__Group__0__Impl rule__Struct__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Struct__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Struct__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct__Group__0"


    // $ANTLR start "rule__Struct__Group__0__Impl"
    // InternalMyDsl.g:4822:1: rule__Struct__Group__0__Impl : ( ( rule__Struct__NameAssignment_0 ) ) ;
    public final void rule__Struct__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4826:1: ( ( ( rule__Struct__NameAssignment_0 ) ) )
            // InternalMyDsl.g:4827:1: ( ( rule__Struct__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:4827:1: ( ( rule__Struct__NameAssignment_0 ) )
            // InternalMyDsl.g:4828:2: ( rule__Struct__NameAssignment_0 )
            {
             before(grammarAccess.getStructAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:4829:2: ( rule__Struct__NameAssignment_0 )
            // InternalMyDsl.g:4829:3: rule__Struct__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Struct__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStructAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct__Group__0__Impl"


    // $ANTLR start "rule__Struct__Group__1"
    // InternalMyDsl.g:4837:1: rule__Struct__Group__1 : rule__Struct__Group__1__Impl ;
    public final void rule__Struct__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4841:1: ( rule__Struct__Group__1__Impl )
            // InternalMyDsl.g:4842:2: rule__Struct__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Struct__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct__Group__1"


    // $ANTLR start "rule__Struct__Group__1__Impl"
    // InternalMyDsl.g:4848:1: rule__Struct__Group__1__Impl : ( ( ( rule__Struct__FieldsAssignment_1 ) ) ( ( rule__Struct__FieldsAssignment_1 )* ) ) ;
    public final void rule__Struct__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4852:1: ( ( ( ( rule__Struct__FieldsAssignment_1 ) ) ( ( rule__Struct__FieldsAssignment_1 )* ) ) )
            // InternalMyDsl.g:4853:1: ( ( ( rule__Struct__FieldsAssignment_1 ) ) ( ( rule__Struct__FieldsAssignment_1 )* ) )
            {
            // InternalMyDsl.g:4853:1: ( ( ( rule__Struct__FieldsAssignment_1 ) ) ( ( rule__Struct__FieldsAssignment_1 )* ) )
            // InternalMyDsl.g:4854:2: ( ( rule__Struct__FieldsAssignment_1 ) ) ( ( rule__Struct__FieldsAssignment_1 )* )
            {
            // InternalMyDsl.g:4854:2: ( ( rule__Struct__FieldsAssignment_1 ) )
            // InternalMyDsl.g:4855:3: ( rule__Struct__FieldsAssignment_1 )
            {
             before(grammarAccess.getStructAccess().getFieldsAssignment_1()); 
            // InternalMyDsl.g:4856:3: ( rule__Struct__FieldsAssignment_1 )
            // InternalMyDsl.g:4856:4: rule__Struct__FieldsAssignment_1
            {
            pushFollow(FOLLOW_4);
            rule__Struct__FieldsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStructAccess().getFieldsAssignment_1()); 

            }

            // InternalMyDsl.g:4859:2: ( ( rule__Struct__FieldsAssignment_1 )* )
            // InternalMyDsl.g:4860:3: ( rule__Struct__FieldsAssignment_1 )*
            {
             before(grammarAccess.getStructAccess().getFieldsAssignment_1()); 
            // InternalMyDsl.g:4861:3: ( rule__Struct__FieldsAssignment_1 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_ID) ) {
                    int LA49_2 = input.LA(2);

                    if ( (LA49_2==15) ) {
                        alt49=1;
                    }


                }


                switch (alt49) {
            	case 1 :
            	    // InternalMyDsl.g:4861:4: rule__Struct__FieldsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Struct__FieldsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getStructAccess().getFieldsAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // InternalMyDsl.g:4871:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4875:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalMyDsl.g:4876:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // InternalMyDsl.g:4883:1: rule__Field__Group__0__Impl : ( ( rule__Field__NameAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4887:1: ( ( ( rule__Field__NameAssignment_0 ) ) )
            // InternalMyDsl.g:4888:1: ( ( rule__Field__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:4888:1: ( ( rule__Field__NameAssignment_0 ) )
            // InternalMyDsl.g:4889:2: ( rule__Field__NameAssignment_0 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:4890:2: ( rule__Field__NameAssignment_0 )
            // InternalMyDsl.g:4890:3: rule__Field__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Field__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // InternalMyDsl.g:4898:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4902:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalMyDsl.g:4903:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_53);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // InternalMyDsl.g:4910:1: rule__Field__Group__1__Impl : ( ':' ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4914:1: ( ( ':' ) )
            // InternalMyDsl.g:4915:1: ( ':' )
            {
            // InternalMyDsl.g:4915:1: ( ':' )
            // InternalMyDsl.g:4916:2: ':'
            {
             before(grammarAccess.getFieldAccess().getColonKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // InternalMyDsl.g:4925:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4929:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // InternalMyDsl.g:4930:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // InternalMyDsl.g:4937:1: rule__Field__Group__2__Impl : ( ( rule__Field__TypeAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4941:1: ( ( ( rule__Field__TypeAssignment_2 ) ) )
            // InternalMyDsl.g:4942:1: ( ( rule__Field__TypeAssignment_2 ) )
            {
            // InternalMyDsl.g:4942:1: ( ( rule__Field__TypeAssignment_2 ) )
            // InternalMyDsl.g:4943:2: ( rule__Field__TypeAssignment_2 )
            {
             before(grammarAccess.getFieldAccess().getTypeAssignment_2()); 
            // InternalMyDsl.g:4944:2: ( rule__Field__TypeAssignment_2 )
            // InternalMyDsl.g:4944:3: rule__Field__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Field__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__Field__Group__3"
    // InternalMyDsl.g:4952:1: rule__Field__Group__3 : rule__Field__Group__3__Impl ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4956:1: ( rule__Field__Group__3__Impl )
            // InternalMyDsl.g:4957:2: rule__Field__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__3"


    // $ANTLR start "rule__Field__Group__3__Impl"
    // InternalMyDsl.g:4963:1: rule__Field__Group__3__Impl : ( ';' ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4967:1: ( ( ';' ) )
            // InternalMyDsl.g:4968:1: ( ';' )
            {
            // InternalMyDsl.g:4968:1: ( ';' )
            // InternalMyDsl.g:4969:2: ';'
            {
             before(grammarAccess.getFieldAccess().getSemicolonKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__3__Impl"


    // $ANTLR start "rule__PeriodicSensors__Group__0"
    // InternalMyDsl.g:4979:1: rule__PeriodicSensors__Group__0 : rule__PeriodicSensors__Group__0__Impl rule__PeriodicSensors__Group__1 ;
    public final void rule__PeriodicSensors__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4983:1: ( rule__PeriodicSensors__Group__0__Impl rule__PeriodicSensors__Group__1 )
            // InternalMyDsl.g:4984:2: rule__PeriodicSensors__Group__0__Impl rule__PeriodicSensors__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__PeriodicSensors__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PeriodicSensors__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicSensors__Group__0"


    // $ANTLR start "rule__PeriodicSensors__Group__0__Impl"
    // InternalMyDsl.g:4991:1: rule__PeriodicSensors__Group__0__Impl : ( ( rule__PeriodicSensors__SensorNameAssignment_0 ) ) ;
    public final void rule__PeriodicSensors__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4995:1: ( ( ( rule__PeriodicSensors__SensorNameAssignment_0 ) ) )
            // InternalMyDsl.g:4996:1: ( ( rule__PeriodicSensors__SensorNameAssignment_0 ) )
            {
            // InternalMyDsl.g:4996:1: ( ( rule__PeriodicSensors__SensorNameAssignment_0 ) )
            // InternalMyDsl.g:4997:2: ( rule__PeriodicSensors__SensorNameAssignment_0 )
            {
             before(grammarAccess.getPeriodicSensorsAccess().getSensorNameAssignment_0()); 
            // InternalMyDsl.g:4998:2: ( rule__PeriodicSensors__SensorNameAssignment_0 )
            // InternalMyDsl.g:4998:3: rule__PeriodicSensors__SensorNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PeriodicSensors__SensorNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicSensorsAccess().getSensorNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicSensors__Group__0__Impl"


    // $ANTLR start "rule__PeriodicSensors__Group__1"
    // InternalMyDsl.g:5006:1: rule__PeriodicSensors__Group__1 : rule__PeriodicSensors__Group__1__Impl rule__PeriodicSensors__Group__2 ;
    public final void rule__PeriodicSensors__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5010:1: ( rule__PeriodicSensors__Group__1__Impl rule__PeriodicSensors__Group__2 )
            // InternalMyDsl.g:5011:2: rule__PeriodicSensors__Group__1__Impl rule__PeriodicSensors__Group__2
            {
            pushFollow(FOLLOW_54);
            rule__PeriodicSensors__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PeriodicSensors__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicSensors__Group__1"


    // $ANTLR start "rule__PeriodicSensors__Group__1__Impl"
    // InternalMyDsl.g:5018:1: rule__PeriodicSensors__Group__1__Impl : ( ( ( rule__PeriodicSensors__GenerateInfoAssignment_1 ) ) ( ( rule__PeriodicSensors__GenerateInfoAssignment_1 )* ) ) ;
    public final void rule__PeriodicSensors__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5022:1: ( ( ( ( rule__PeriodicSensors__GenerateInfoAssignment_1 ) ) ( ( rule__PeriodicSensors__GenerateInfoAssignment_1 )* ) ) )
            // InternalMyDsl.g:5023:1: ( ( ( rule__PeriodicSensors__GenerateInfoAssignment_1 ) ) ( ( rule__PeriodicSensors__GenerateInfoAssignment_1 )* ) )
            {
            // InternalMyDsl.g:5023:1: ( ( ( rule__PeriodicSensors__GenerateInfoAssignment_1 ) ) ( ( rule__PeriodicSensors__GenerateInfoAssignment_1 )* ) )
            // InternalMyDsl.g:5024:2: ( ( rule__PeriodicSensors__GenerateInfoAssignment_1 ) ) ( ( rule__PeriodicSensors__GenerateInfoAssignment_1 )* )
            {
            // InternalMyDsl.g:5024:2: ( ( rule__PeriodicSensors__GenerateInfoAssignment_1 ) )
            // InternalMyDsl.g:5025:3: ( rule__PeriodicSensors__GenerateInfoAssignment_1 )
            {
             before(grammarAccess.getPeriodicSensorsAccess().getGenerateInfoAssignment_1()); 
            // InternalMyDsl.g:5026:3: ( rule__PeriodicSensors__GenerateInfoAssignment_1 )
            // InternalMyDsl.g:5026:4: rule__PeriodicSensors__GenerateInfoAssignment_1
            {
            pushFollow(FOLLOW_39);
            rule__PeriodicSensors__GenerateInfoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicSensorsAccess().getGenerateInfoAssignment_1()); 

            }

            // InternalMyDsl.g:5029:2: ( ( rule__PeriodicSensors__GenerateInfoAssignment_1 )* )
            // InternalMyDsl.g:5030:3: ( rule__PeriodicSensors__GenerateInfoAssignment_1 )*
            {
             before(grammarAccess.getPeriodicSensorsAccess().getGenerateInfoAssignment_1()); 
            // InternalMyDsl.g:5031:3: ( rule__PeriodicSensors__GenerateInfoAssignment_1 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==48) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalMyDsl.g:5031:4: rule__PeriodicSensors__GenerateInfoAssignment_1
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__PeriodicSensors__GenerateInfoAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getPeriodicSensorsAccess().getGenerateInfoAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicSensors__Group__1__Impl"


    // $ANTLR start "rule__PeriodicSensors__Group__2"
    // InternalMyDsl.g:5040:1: rule__PeriodicSensors__Group__2 : rule__PeriodicSensors__Group__2__Impl ;
    public final void rule__PeriodicSensors__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5044:1: ( rule__PeriodicSensors__Group__2__Impl )
            // InternalMyDsl.g:5045:2: rule__PeriodicSensors__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PeriodicSensors__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicSensors__Group__2"


    // $ANTLR start "rule__PeriodicSensors__Group__2__Impl"
    // InternalMyDsl.g:5051:1: rule__PeriodicSensors__Group__2__Impl : ( ( rule__PeriodicSensors__SampelingDefAssignment_2 ) ) ;
    public final void rule__PeriodicSensors__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5055:1: ( ( ( rule__PeriodicSensors__SampelingDefAssignment_2 ) ) )
            // InternalMyDsl.g:5056:1: ( ( rule__PeriodicSensors__SampelingDefAssignment_2 ) )
            {
            // InternalMyDsl.g:5056:1: ( ( rule__PeriodicSensors__SampelingDefAssignment_2 ) )
            // InternalMyDsl.g:5057:2: ( rule__PeriodicSensors__SampelingDefAssignment_2 )
            {
             before(grammarAccess.getPeriodicSensorsAccess().getSampelingDefAssignment_2()); 
            // InternalMyDsl.g:5058:2: ( rule__PeriodicSensors__SampelingDefAssignment_2 )
            // InternalMyDsl.g:5058:3: rule__PeriodicSensors__SampelingDefAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PeriodicSensors__SampelingDefAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicSensorsAccess().getSampelingDefAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicSensors__Group__2__Impl"


    // $ANTLR start "rule__SampelingDef__Group__0"
    // InternalMyDsl.g:5067:1: rule__SampelingDef__Group__0 : rule__SampelingDef__Group__0__Impl rule__SampelingDef__Group__1 ;
    public final void rule__SampelingDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5071:1: ( rule__SampelingDef__Group__0__Impl rule__SampelingDef__Group__1 )
            // InternalMyDsl.g:5072:2: rule__SampelingDef__Group__0__Impl rule__SampelingDef__Group__1
            {
            pushFollow(FOLLOW_55);
            rule__SampelingDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SampelingDef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SampelingDef__Group__0"


    // $ANTLR start "rule__SampelingDef__Group__0__Impl"
    // InternalMyDsl.g:5079:1: rule__SampelingDef__Group__0__Impl : ( 'sample' ) ;
    public final void rule__SampelingDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5083:1: ( ( 'sample' ) )
            // InternalMyDsl.g:5084:1: ( 'sample' )
            {
            // InternalMyDsl.g:5084:1: ( 'sample' )
            // InternalMyDsl.g:5085:2: 'sample'
            {
             before(grammarAccess.getSampelingDefAccess().getSampleKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSampelingDefAccess().getSampleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SampelingDef__Group__0__Impl"


    // $ANTLR start "rule__SampelingDef__Group__1"
    // InternalMyDsl.g:5094:1: rule__SampelingDef__Group__1 : rule__SampelingDef__Group__1__Impl rule__SampelingDef__Group__2 ;
    public final void rule__SampelingDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5098:1: ( rule__SampelingDef__Group__1__Impl rule__SampelingDef__Group__2 )
            // InternalMyDsl.g:5099:2: rule__SampelingDef__Group__1__Impl rule__SampelingDef__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__SampelingDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SampelingDef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SampelingDef__Group__1"


    // $ANTLR start "rule__SampelingDef__Group__1__Impl"
    // InternalMyDsl.g:5106:1: rule__SampelingDef__Group__1__Impl : ( 'period' ) ;
    public final void rule__SampelingDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5110:1: ( ( 'period' ) )
            // InternalMyDsl.g:5111:1: ( 'period' )
            {
            // InternalMyDsl.g:5111:1: ( 'period' )
            // InternalMyDsl.g:5112:2: 'period'
            {
             before(grammarAccess.getSampelingDefAccess().getPeriodKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getSampelingDefAccess().getPeriodKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SampelingDef__Group__1__Impl"


    // $ANTLR start "rule__SampelingDef__Group__2"
    // InternalMyDsl.g:5121:1: rule__SampelingDef__Group__2 : rule__SampelingDef__Group__2__Impl rule__SampelingDef__Group__3 ;
    public final void rule__SampelingDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5125:1: ( rule__SampelingDef__Group__2__Impl rule__SampelingDef__Group__3 )
            // InternalMyDsl.g:5126:2: rule__SampelingDef__Group__2__Impl rule__SampelingDef__Group__3
            {
            pushFollow(FOLLOW_56);
            rule__SampelingDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SampelingDef__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SampelingDef__Group__2"


    // $ANTLR start "rule__SampelingDef__Group__2__Impl"
    // InternalMyDsl.g:5133:1: rule__SampelingDef__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__SampelingDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5137:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:5138:1: ( RULE_INT )
            {
            // InternalMyDsl.g:5138:1: ( RULE_INT )
            // InternalMyDsl.g:5139:2: RULE_INT
            {
             before(grammarAccess.getSampelingDefAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSampelingDefAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SampelingDef__Group__2__Impl"


    // $ANTLR start "rule__SampelingDef__Group__3"
    // InternalMyDsl.g:5148:1: rule__SampelingDef__Group__3 : rule__SampelingDef__Group__3__Impl rule__SampelingDef__Group__4 ;
    public final void rule__SampelingDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5152:1: ( rule__SampelingDef__Group__3__Impl rule__SampelingDef__Group__4 )
            // InternalMyDsl.g:5153:2: rule__SampelingDef__Group__3__Impl rule__SampelingDef__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__SampelingDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SampelingDef__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SampelingDef__Group__3"


    // $ANTLR start "rule__SampelingDef__Group__3__Impl"
    // InternalMyDsl.g:5160:1: rule__SampelingDef__Group__3__Impl : ( 'for' ) ;
    public final void rule__SampelingDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5164:1: ( ( 'for' ) )
            // InternalMyDsl.g:5165:1: ( 'for' )
            {
            // InternalMyDsl.g:5165:1: ( 'for' )
            // InternalMyDsl.g:5166:2: 'for'
            {
             before(grammarAccess.getSampelingDefAccess().getForKeyword_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSampelingDefAccess().getForKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SampelingDef__Group__3__Impl"


    // $ANTLR start "rule__SampelingDef__Group__4"
    // InternalMyDsl.g:5175:1: rule__SampelingDef__Group__4 : rule__SampelingDef__Group__4__Impl rule__SampelingDef__Group__5 ;
    public final void rule__SampelingDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5179:1: ( rule__SampelingDef__Group__4__Impl rule__SampelingDef__Group__5 )
            // InternalMyDsl.g:5180:2: rule__SampelingDef__Group__4__Impl rule__SampelingDef__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__SampelingDef__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SampelingDef__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SampelingDef__Group__4"


    // $ANTLR start "rule__SampelingDef__Group__4__Impl"
    // InternalMyDsl.g:5187:1: rule__SampelingDef__Group__4__Impl : ( RULE_INT ) ;
    public final void rule__SampelingDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5191:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:5192:1: ( RULE_INT )
            {
            // InternalMyDsl.g:5192:1: ( RULE_INT )
            // InternalMyDsl.g:5193:2: RULE_INT
            {
             before(grammarAccess.getSampelingDefAccess().getINTTerminalRuleCall_4()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSampelingDefAccess().getINTTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SampelingDef__Group__4__Impl"


    // $ANTLR start "rule__SampelingDef__Group__5"
    // InternalMyDsl.g:5202:1: rule__SampelingDef__Group__5 : rule__SampelingDef__Group__5__Impl ;
    public final void rule__SampelingDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5206:1: ( rule__SampelingDef__Group__5__Impl )
            // InternalMyDsl.g:5207:2: rule__SampelingDef__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SampelingDef__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SampelingDef__Group__5"


    // $ANTLR start "rule__SampelingDef__Group__5__Impl"
    // InternalMyDsl.g:5213:1: rule__SampelingDef__Group__5__Impl : ( ';' ) ;
    public final void rule__SampelingDef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5217:1: ( ( ';' ) )
            // InternalMyDsl.g:5218:1: ( ';' )
            {
            // InternalMyDsl.g:5218:1: ( ';' )
            // InternalMyDsl.g:5219:2: ';'
            {
             before(grammarAccess.getSampelingDefAccess().getSemicolonKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSampelingDefAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SampelingDef__Group__5__Impl"


    // $ANTLR start "rule__EventSensors__Group__0"
    // InternalMyDsl.g:5229:1: rule__EventSensors__Group__0 : rule__EventSensors__Group__0__Impl rule__EventSensors__Group__1 ;
    public final void rule__EventSensors__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5233:1: ( rule__EventSensors__Group__0__Impl rule__EventSensors__Group__1 )
            // InternalMyDsl.g:5234:2: rule__EventSensors__Group__0__Impl rule__EventSensors__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__EventSensors__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventSensors__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSensors__Group__0"


    // $ANTLR start "rule__EventSensors__Group__0__Impl"
    // InternalMyDsl.g:5241:1: rule__EventSensors__Group__0__Impl : ( ( rule__EventSensors__SensorNameAssignment_0 ) ) ;
    public final void rule__EventSensors__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5245:1: ( ( ( rule__EventSensors__SensorNameAssignment_0 ) ) )
            // InternalMyDsl.g:5246:1: ( ( rule__EventSensors__SensorNameAssignment_0 ) )
            {
            // InternalMyDsl.g:5246:1: ( ( rule__EventSensors__SensorNameAssignment_0 ) )
            // InternalMyDsl.g:5247:2: ( rule__EventSensors__SensorNameAssignment_0 )
            {
             before(grammarAccess.getEventSensorsAccess().getSensorNameAssignment_0()); 
            // InternalMyDsl.g:5248:2: ( rule__EventSensors__SensorNameAssignment_0 )
            // InternalMyDsl.g:5248:3: rule__EventSensors__SensorNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EventSensors__SensorNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEventSensorsAccess().getSensorNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSensors__Group__0__Impl"


    // $ANTLR start "rule__EventSensors__Group__1"
    // InternalMyDsl.g:5256:1: rule__EventSensors__Group__1 : rule__EventSensors__Group__1__Impl rule__EventSensors__Group__2 ;
    public final void rule__EventSensors__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5260:1: ( rule__EventSensors__Group__1__Impl rule__EventSensors__Group__2 )
            // InternalMyDsl.g:5261:2: rule__EventSensors__Group__1__Impl rule__EventSensors__Group__2
            {
            pushFollow(FOLLOW_57);
            rule__EventSensors__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventSensors__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSensors__Group__1"


    // $ANTLR start "rule__EventSensors__Group__1__Impl"
    // InternalMyDsl.g:5268:1: rule__EventSensors__Group__1__Impl : ( ( ( rule__EventSensors__GenerateInfoAssignment_1 ) ) ( ( rule__EventSensors__GenerateInfoAssignment_1 )* ) ) ;
    public final void rule__EventSensors__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5272:1: ( ( ( ( rule__EventSensors__GenerateInfoAssignment_1 ) ) ( ( rule__EventSensors__GenerateInfoAssignment_1 )* ) ) )
            // InternalMyDsl.g:5273:1: ( ( ( rule__EventSensors__GenerateInfoAssignment_1 ) ) ( ( rule__EventSensors__GenerateInfoAssignment_1 )* ) )
            {
            // InternalMyDsl.g:5273:1: ( ( ( rule__EventSensors__GenerateInfoAssignment_1 ) ) ( ( rule__EventSensors__GenerateInfoAssignment_1 )* ) )
            // InternalMyDsl.g:5274:2: ( ( rule__EventSensors__GenerateInfoAssignment_1 ) ) ( ( rule__EventSensors__GenerateInfoAssignment_1 )* )
            {
            // InternalMyDsl.g:5274:2: ( ( rule__EventSensors__GenerateInfoAssignment_1 ) )
            // InternalMyDsl.g:5275:3: ( rule__EventSensors__GenerateInfoAssignment_1 )
            {
             before(grammarAccess.getEventSensorsAccess().getGenerateInfoAssignment_1()); 
            // InternalMyDsl.g:5276:3: ( rule__EventSensors__GenerateInfoAssignment_1 )
            // InternalMyDsl.g:5276:4: rule__EventSensors__GenerateInfoAssignment_1
            {
            pushFollow(FOLLOW_39);
            rule__EventSensors__GenerateInfoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEventSensorsAccess().getGenerateInfoAssignment_1()); 

            }

            // InternalMyDsl.g:5279:2: ( ( rule__EventSensors__GenerateInfoAssignment_1 )* )
            // InternalMyDsl.g:5280:3: ( rule__EventSensors__GenerateInfoAssignment_1 )*
            {
             before(grammarAccess.getEventSensorsAccess().getGenerateInfoAssignment_1()); 
            // InternalMyDsl.g:5281:3: ( rule__EventSensors__GenerateInfoAssignment_1 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==48) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalMyDsl.g:5281:4: rule__EventSensors__GenerateInfoAssignment_1
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__EventSensors__GenerateInfoAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

             after(grammarAccess.getEventSensorsAccess().getGenerateInfoAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSensors__Group__1__Impl"


    // $ANTLR start "rule__EventSensors__Group__2"
    // InternalMyDsl.g:5290:1: rule__EventSensors__Group__2 : rule__EventSensors__Group__2__Impl ;
    public final void rule__EventSensors__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5294:1: ( rule__EventSensors__Group__2__Impl )
            // InternalMyDsl.g:5295:2: rule__EventSensors__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventSensors__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSensors__Group__2"


    // $ANTLR start "rule__EventSensors__Group__2__Impl"
    // InternalMyDsl.g:5301:1: rule__EventSensors__Group__2__Impl : ( ( rule__EventSensors__OnConditionDefAssignment_2 ) ) ;
    public final void rule__EventSensors__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5305:1: ( ( ( rule__EventSensors__OnConditionDefAssignment_2 ) ) )
            // InternalMyDsl.g:5306:1: ( ( rule__EventSensors__OnConditionDefAssignment_2 ) )
            {
            // InternalMyDsl.g:5306:1: ( ( rule__EventSensors__OnConditionDefAssignment_2 ) )
            // InternalMyDsl.g:5307:2: ( rule__EventSensors__OnConditionDefAssignment_2 )
            {
             before(grammarAccess.getEventSensorsAccess().getOnConditionDefAssignment_2()); 
            // InternalMyDsl.g:5308:2: ( rule__EventSensors__OnConditionDefAssignment_2 )
            // InternalMyDsl.g:5308:3: rule__EventSensors__OnConditionDefAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EventSensors__OnConditionDefAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEventSensorsAccess().getOnConditionDefAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSensors__Group__2__Impl"


    // $ANTLR start "rule__OnConditionDef__Group__0"
    // InternalMyDsl.g:5317:1: rule__OnConditionDef__Group__0 : rule__OnConditionDef__Group__0__Impl rule__OnConditionDef__Group__1 ;
    public final void rule__OnConditionDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5321:1: ( rule__OnConditionDef__Group__0__Impl rule__OnConditionDef__Group__1 )
            // InternalMyDsl.g:5322:2: rule__OnConditionDef__Group__0__Impl rule__OnConditionDef__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__OnConditionDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnConditionDef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnConditionDef__Group__0"


    // $ANTLR start "rule__OnConditionDef__Group__0__Impl"
    // InternalMyDsl.g:5329:1: rule__OnConditionDef__Group__0__Impl : ( 'onCondition' ) ;
    public final void rule__OnConditionDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5333:1: ( ( 'onCondition' ) )
            // InternalMyDsl.g:5334:1: ( 'onCondition' )
            {
            // InternalMyDsl.g:5334:1: ( 'onCondition' )
            // InternalMyDsl.g:5335:2: 'onCondition'
            {
             before(grammarAccess.getOnConditionDefAccess().getOnConditionKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getOnConditionDefAccess().getOnConditionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnConditionDef__Group__0__Impl"


    // $ANTLR start "rule__OnConditionDef__Group__1"
    // InternalMyDsl.g:5344:1: rule__OnConditionDef__Group__1 : rule__OnConditionDef__Group__1__Impl rule__OnConditionDef__Group__2 ;
    public final void rule__OnConditionDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5348:1: ( rule__OnConditionDef__Group__1__Impl rule__OnConditionDef__Group__2 )
            // InternalMyDsl.g:5349:2: rule__OnConditionDef__Group__1__Impl rule__OnConditionDef__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__OnConditionDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnConditionDef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnConditionDef__Group__1"


    // $ANTLR start "rule__OnConditionDef__Group__1__Impl"
    // InternalMyDsl.g:5356:1: rule__OnConditionDef__Group__1__Impl : ( ( rule__OnConditionDef__EventConditionsAssignment_1 ) ) ;
    public final void rule__OnConditionDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5360:1: ( ( ( rule__OnConditionDef__EventConditionsAssignment_1 ) ) )
            // InternalMyDsl.g:5361:1: ( ( rule__OnConditionDef__EventConditionsAssignment_1 ) )
            {
            // InternalMyDsl.g:5361:1: ( ( rule__OnConditionDef__EventConditionsAssignment_1 ) )
            // InternalMyDsl.g:5362:2: ( rule__OnConditionDef__EventConditionsAssignment_1 )
            {
             before(grammarAccess.getOnConditionDefAccess().getEventConditionsAssignment_1()); 
            // InternalMyDsl.g:5363:2: ( rule__OnConditionDef__EventConditionsAssignment_1 )
            // InternalMyDsl.g:5363:3: rule__OnConditionDef__EventConditionsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OnConditionDef__EventConditionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOnConditionDefAccess().getEventConditionsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnConditionDef__Group__1__Impl"


    // $ANTLR start "rule__OnConditionDef__Group__2"
    // InternalMyDsl.g:5371:1: rule__OnConditionDef__Group__2 : rule__OnConditionDef__Group__2__Impl ;
    public final void rule__OnConditionDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5375:1: ( rule__OnConditionDef__Group__2__Impl )
            // InternalMyDsl.g:5376:2: rule__OnConditionDef__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OnConditionDef__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnConditionDef__Group__2"


    // $ANTLR start "rule__OnConditionDef__Group__2__Impl"
    // InternalMyDsl.g:5382:1: rule__OnConditionDef__Group__2__Impl : ( ';' ) ;
    public final void rule__OnConditionDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5386:1: ( ( ';' ) )
            // InternalMyDsl.g:5387:1: ( ';' )
            {
            // InternalMyDsl.g:5387:1: ( ';' )
            // InternalMyDsl.g:5388:2: ';'
            {
             before(grammarAccess.getOnConditionDefAccess().getSemicolonKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getOnConditionDefAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnConditionDef__Group__2__Impl"


    // $ANTLR start "rule__RequestSensors__Group__0"
    // InternalMyDsl.g:5398:1: rule__RequestSensors__Group__0 : rule__RequestSensors__Group__0__Impl rule__RequestSensors__Group__1 ;
    public final void rule__RequestSensors__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5402:1: ( rule__RequestSensors__Group__0__Impl rule__RequestSensors__Group__1 )
            // InternalMyDsl.g:5403:2: rule__RequestSensors__Group__0__Impl rule__RequestSensors__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__RequestSensors__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequestSensors__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestSensors__Group__0"


    // $ANTLR start "rule__RequestSensors__Group__0__Impl"
    // InternalMyDsl.g:5410:1: rule__RequestSensors__Group__0__Impl : ( ( rule__RequestSensors__SensorNameAssignment_0 ) ) ;
    public final void rule__RequestSensors__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5414:1: ( ( ( rule__RequestSensors__SensorNameAssignment_0 ) ) )
            // InternalMyDsl.g:5415:1: ( ( rule__RequestSensors__SensorNameAssignment_0 ) )
            {
            // InternalMyDsl.g:5415:1: ( ( rule__RequestSensors__SensorNameAssignment_0 ) )
            // InternalMyDsl.g:5416:2: ( rule__RequestSensors__SensorNameAssignment_0 )
            {
             before(grammarAccess.getRequestSensorsAccess().getSensorNameAssignment_0()); 
            // InternalMyDsl.g:5417:2: ( rule__RequestSensors__SensorNameAssignment_0 )
            // InternalMyDsl.g:5417:3: rule__RequestSensors__SensorNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RequestSensors__SensorNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRequestSensorsAccess().getSensorNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestSensors__Group__0__Impl"


    // $ANTLR start "rule__RequestSensors__Group__1"
    // InternalMyDsl.g:5425:1: rule__RequestSensors__Group__1 : rule__RequestSensors__Group__1__Impl ;
    public final void rule__RequestSensors__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5429:1: ( rule__RequestSensors__Group__1__Impl )
            // InternalMyDsl.g:5430:2: rule__RequestSensors__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequestSensors__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestSensors__Group__1"


    // $ANTLR start "rule__RequestSensors__Group__1__Impl"
    // InternalMyDsl.g:5436:1: rule__RequestSensors__Group__1__Impl : ( ( ( rule__RequestSensors__DataAccessAssignment_1 ) ) ( ( rule__RequestSensors__DataAccessAssignment_1 )* ) ) ;
    public final void rule__RequestSensors__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5440:1: ( ( ( ( rule__RequestSensors__DataAccessAssignment_1 ) ) ( ( rule__RequestSensors__DataAccessAssignment_1 )* ) ) )
            // InternalMyDsl.g:5441:1: ( ( ( rule__RequestSensors__DataAccessAssignment_1 ) ) ( ( rule__RequestSensors__DataAccessAssignment_1 )* ) )
            {
            // InternalMyDsl.g:5441:1: ( ( ( rule__RequestSensors__DataAccessAssignment_1 ) ) ( ( rule__RequestSensors__DataAccessAssignment_1 )* ) )
            // InternalMyDsl.g:5442:2: ( ( rule__RequestSensors__DataAccessAssignment_1 ) ) ( ( rule__RequestSensors__DataAccessAssignment_1 )* )
            {
            // InternalMyDsl.g:5442:2: ( ( rule__RequestSensors__DataAccessAssignment_1 ) )
            // InternalMyDsl.g:5443:3: ( rule__RequestSensors__DataAccessAssignment_1 )
            {
             before(grammarAccess.getRequestSensorsAccess().getDataAccessAssignment_1()); 
            // InternalMyDsl.g:5444:3: ( rule__RequestSensors__DataAccessAssignment_1 )
            // InternalMyDsl.g:5444:4: rule__RequestSensors__DataAccessAssignment_1
            {
            pushFollow(FOLLOW_39);
            rule__RequestSensors__DataAccessAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRequestSensorsAccess().getDataAccessAssignment_1()); 

            }

            // InternalMyDsl.g:5447:2: ( ( rule__RequestSensors__DataAccessAssignment_1 )* )
            // InternalMyDsl.g:5448:3: ( rule__RequestSensors__DataAccessAssignment_1 )*
            {
             before(grammarAccess.getRequestSensorsAccess().getDataAccessAssignment_1()); 
            // InternalMyDsl.g:5449:3: ( rule__RequestSensors__DataAccessAssignment_1 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==48) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalMyDsl.g:5449:4: rule__RequestSensors__DataAccessAssignment_1
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__RequestSensors__DataAccessAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

             after(grammarAccess.getRequestSensorsAccess().getDataAccessAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestSensors__Group__1__Impl"


    // $ANTLR start "rule__Tags__Group__0"
    // InternalMyDsl.g:5459:1: rule__Tags__Group__0 : rule__Tags__Group__0__Impl rule__Tags__Group__1 ;
    public final void rule__Tags__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5463:1: ( rule__Tags__Group__0__Impl rule__Tags__Group__1 )
            // InternalMyDsl.g:5464:2: rule__Tags__Group__0__Impl rule__Tags__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__Tags__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tags__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tags__Group__0"


    // $ANTLR start "rule__Tags__Group__0__Impl"
    // InternalMyDsl.g:5471:1: rule__Tags__Group__0__Impl : ( ( rule__Tags__SensorNameAssignment_0 ) ) ;
    public final void rule__Tags__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5475:1: ( ( ( rule__Tags__SensorNameAssignment_0 ) ) )
            // InternalMyDsl.g:5476:1: ( ( rule__Tags__SensorNameAssignment_0 ) )
            {
            // InternalMyDsl.g:5476:1: ( ( rule__Tags__SensorNameAssignment_0 ) )
            // InternalMyDsl.g:5477:2: ( rule__Tags__SensorNameAssignment_0 )
            {
             before(grammarAccess.getTagsAccess().getSensorNameAssignment_0()); 
            // InternalMyDsl.g:5478:2: ( rule__Tags__SensorNameAssignment_0 )
            // InternalMyDsl.g:5478:3: rule__Tags__SensorNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Tags__SensorNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTagsAccess().getSensorNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tags__Group__0__Impl"


    // $ANTLR start "rule__Tags__Group__1"
    // InternalMyDsl.g:5486:1: rule__Tags__Group__1 : rule__Tags__Group__1__Impl ;
    public final void rule__Tags__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5490:1: ( rule__Tags__Group__1__Impl )
            // InternalMyDsl.g:5491:2: rule__Tags__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tags__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tags__Group__1"


    // $ANTLR start "rule__Tags__Group__1__Impl"
    // InternalMyDsl.g:5497:1: rule__Tags__Group__1__Impl : ( ( ( rule__Tags__GenerateInfoAssignment_1 ) ) ( ( rule__Tags__GenerateInfoAssignment_1 )* ) ) ;
    public final void rule__Tags__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5501:1: ( ( ( ( rule__Tags__GenerateInfoAssignment_1 ) ) ( ( rule__Tags__GenerateInfoAssignment_1 )* ) ) )
            // InternalMyDsl.g:5502:1: ( ( ( rule__Tags__GenerateInfoAssignment_1 ) ) ( ( rule__Tags__GenerateInfoAssignment_1 )* ) )
            {
            // InternalMyDsl.g:5502:1: ( ( ( rule__Tags__GenerateInfoAssignment_1 ) ) ( ( rule__Tags__GenerateInfoAssignment_1 )* ) )
            // InternalMyDsl.g:5503:2: ( ( rule__Tags__GenerateInfoAssignment_1 ) ) ( ( rule__Tags__GenerateInfoAssignment_1 )* )
            {
            // InternalMyDsl.g:5503:2: ( ( rule__Tags__GenerateInfoAssignment_1 ) )
            // InternalMyDsl.g:5504:3: ( rule__Tags__GenerateInfoAssignment_1 )
            {
             before(grammarAccess.getTagsAccess().getGenerateInfoAssignment_1()); 
            // InternalMyDsl.g:5505:3: ( rule__Tags__GenerateInfoAssignment_1 )
            // InternalMyDsl.g:5505:4: rule__Tags__GenerateInfoAssignment_1
            {
            pushFollow(FOLLOW_39);
            rule__Tags__GenerateInfoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTagsAccess().getGenerateInfoAssignment_1()); 

            }

            // InternalMyDsl.g:5508:2: ( ( rule__Tags__GenerateInfoAssignment_1 )* )
            // InternalMyDsl.g:5509:3: ( rule__Tags__GenerateInfoAssignment_1 )*
            {
             before(grammarAccess.getTagsAccess().getGenerateInfoAssignment_1()); 
            // InternalMyDsl.g:5510:3: ( rule__Tags__GenerateInfoAssignment_1 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==48) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalMyDsl.g:5510:4: rule__Tags__GenerateInfoAssignment_1
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__Tags__GenerateInfoAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

             after(grammarAccess.getTagsAccess().getGenerateInfoAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tags__Group__1__Impl"


    // $ANTLR start "rule__EventConditions__Group__0"
    // InternalMyDsl.g:5520:1: rule__EventConditions__Group__0 : rule__EventConditions__Group__0__Impl rule__EventConditions__Group__1 ;
    public final void rule__EventConditions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5524:1: ( rule__EventConditions__Group__0__Impl rule__EventConditions__Group__1 )
            // InternalMyDsl.g:5525:2: rule__EventConditions__Group__0__Impl rule__EventConditions__Group__1
            {
            pushFollow(FOLLOW_58);
            rule__EventConditions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventConditions__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventConditions__Group__0"


    // $ANTLR start "rule__EventConditions__Group__0__Impl"
    // InternalMyDsl.g:5532:1: rule__EventConditions__Group__0__Impl : ( ( rule__EventConditions__NameAssignment_0 ) ) ;
    public final void rule__EventConditions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5536:1: ( ( ( rule__EventConditions__NameAssignment_0 ) ) )
            // InternalMyDsl.g:5537:1: ( ( rule__EventConditions__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:5537:1: ( ( rule__EventConditions__NameAssignment_0 ) )
            // InternalMyDsl.g:5538:2: ( rule__EventConditions__NameAssignment_0 )
            {
             before(grammarAccess.getEventConditionsAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:5539:2: ( rule__EventConditions__NameAssignment_0 )
            // InternalMyDsl.g:5539:3: rule__EventConditions__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EventConditions__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEventConditionsAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventConditions__Group__0__Impl"


    // $ANTLR start "rule__EventConditions__Group__1"
    // InternalMyDsl.g:5547:1: rule__EventConditions__Group__1 : rule__EventConditions__Group__1__Impl rule__EventConditions__Group__2 ;
    public final void rule__EventConditions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5551:1: ( rule__EventConditions__Group__1__Impl rule__EventConditions__Group__2 )
            // InternalMyDsl.g:5552:2: rule__EventConditions__Group__1__Impl rule__EventConditions__Group__2
            {
            pushFollow(FOLLOW_58);
            rule__EventConditions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventConditions__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventConditions__Group__1"


    // $ANTLR start "rule__EventConditions__Group__1__Impl"
    // InternalMyDsl.g:5559:1: rule__EventConditions__Group__1__Impl : ( ( rule__EventConditions__Alternatives_1 )* ) ;
    public final void rule__EventConditions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5563:1: ( ( ( rule__EventConditions__Alternatives_1 )* ) )
            // InternalMyDsl.g:5564:1: ( ( rule__EventConditions__Alternatives_1 )* )
            {
            // InternalMyDsl.g:5564:1: ( ( rule__EventConditions__Alternatives_1 )* )
            // InternalMyDsl.g:5565:2: ( rule__EventConditions__Alternatives_1 )*
            {
             before(grammarAccess.getEventConditionsAccess().getAlternatives_1()); 
            // InternalMyDsl.g:5566:2: ( rule__EventConditions__Alternatives_1 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=11 && LA54_0<=13)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalMyDsl.g:5566:3: rule__EventConditions__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_59);
            	    rule__EventConditions__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

             after(grammarAccess.getEventConditionsAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventConditions__Group__1__Impl"


    // $ANTLR start "rule__EventConditions__Group__2"
    // InternalMyDsl.g:5574:1: rule__EventConditions__Group__2 : rule__EventConditions__Group__2__Impl rule__EventConditions__Group__3 ;
    public final void rule__EventConditions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5578:1: ( rule__EventConditions__Group__2__Impl rule__EventConditions__Group__3 )
            // InternalMyDsl.g:5579:2: rule__EventConditions__Group__2__Impl rule__EventConditions__Group__3
            {
            pushFollow(FOLLOW_60);
            rule__EventConditions__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventConditions__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventConditions__Group__2"


    // $ANTLR start "rule__EventConditions__Group__2__Impl"
    // InternalMyDsl.g:5586:1: rule__EventConditions__Group__2__Impl : ( ( rule__EventConditions__IntValueAssignment_2 ) ) ;
    public final void rule__EventConditions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5590:1: ( ( ( rule__EventConditions__IntValueAssignment_2 ) ) )
            // InternalMyDsl.g:5591:1: ( ( rule__EventConditions__IntValueAssignment_2 ) )
            {
            // InternalMyDsl.g:5591:1: ( ( rule__EventConditions__IntValueAssignment_2 ) )
            // InternalMyDsl.g:5592:2: ( rule__EventConditions__IntValueAssignment_2 )
            {
             before(grammarAccess.getEventConditionsAccess().getIntValueAssignment_2()); 
            // InternalMyDsl.g:5593:2: ( rule__EventConditions__IntValueAssignment_2 )
            // InternalMyDsl.g:5593:3: rule__EventConditions__IntValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EventConditions__IntValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEventConditionsAccess().getIntValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventConditions__Group__2__Impl"


    // $ANTLR start "rule__EventConditions__Group__3"
    // InternalMyDsl.g:5601:1: rule__EventConditions__Group__3 : rule__EventConditions__Group__3__Impl rule__EventConditions__Group__4 ;
    public final void rule__EventConditions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5605:1: ( rule__EventConditions__Group__3__Impl rule__EventConditions__Group__4 )
            // InternalMyDsl.g:5606:2: rule__EventConditions__Group__3__Impl rule__EventConditions__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__EventConditions__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventConditions__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventConditions__Group__3"


    // $ANTLR start "rule__EventConditions__Group__3__Impl"
    // InternalMyDsl.g:5613:1: rule__EventConditions__Group__3__Impl : ( ( rule__EventConditions__NameUnitAssignment_3 ) ) ;
    public final void rule__EventConditions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5617:1: ( ( ( rule__EventConditions__NameUnitAssignment_3 ) ) )
            // InternalMyDsl.g:5618:1: ( ( rule__EventConditions__NameUnitAssignment_3 ) )
            {
            // InternalMyDsl.g:5618:1: ( ( rule__EventConditions__NameUnitAssignment_3 ) )
            // InternalMyDsl.g:5619:2: ( rule__EventConditions__NameUnitAssignment_3 )
            {
             before(grammarAccess.getEventConditionsAccess().getNameUnitAssignment_3()); 
            // InternalMyDsl.g:5620:2: ( rule__EventConditions__NameUnitAssignment_3 )
            // InternalMyDsl.g:5620:3: rule__EventConditions__NameUnitAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EventConditions__NameUnitAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEventConditionsAccess().getNameUnitAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventConditions__Group__3__Impl"


    // $ANTLR start "rule__EventConditions__Group__4"
    // InternalMyDsl.g:5628:1: rule__EventConditions__Group__4 : rule__EventConditions__Group__4__Impl ;
    public final void rule__EventConditions__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5632:1: ( rule__EventConditions__Group__4__Impl )
            // InternalMyDsl.g:5633:2: rule__EventConditions__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventConditions__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventConditions__Group__4"


    // $ANTLR start "rule__EventConditions__Group__4__Impl"
    // InternalMyDsl.g:5639:1: rule__EventConditions__Group__4__Impl : ( ( rule__EventConditions__Group_4__0 )? ) ;
    public final void rule__EventConditions__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5643:1: ( ( ( rule__EventConditions__Group_4__0 )? ) )
            // InternalMyDsl.g:5644:1: ( ( rule__EventConditions__Group_4__0 )? )
            {
            // InternalMyDsl.g:5644:1: ( ( rule__EventConditions__Group_4__0 )? )
            // InternalMyDsl.g:5645:2: ( rule__EventConditions__Group_4__0 )?
            {
             before(grammarAccess.getEventConditionsAccess().getGroup_4()); 
            // InternalMyDsl.g:5646:2: ( rule__EventConditions__Group_4__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==22) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalMyDsl.g:5646:3: rule__EventConditions__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EventConditions__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventConditionsAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventConditions__Group__4__Impl"


    // $ANTLR start "rule__EventConditions__Group_4__0"
    // InternalMyDsl.g:5655:1: rule__EventConditions__Group_4__0 : rule__EventConditions__Group_4__0__Impl rule__EventConditions__Group_4__1 ;
    public final void rule__EventConditions__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5659:1: ( rule__EventConditions__Group_4__0__Impl rule__EventConditions__Group_4__1 )
            // InternalMyDsl.g:5660:2: rule__EventConditions__Group_4__0__Impl rule__EventConditions__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__EventConditions__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventConditions__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventConditions__Group_4__0"


    // $ANTLR start "rule__EventConditions__Group_4__0__Impl"
    // InternalMyDsl.g:5667:1: rule__EventConditions__Group_4__0__Impl : ( ',' ) ;
    public final void rule__EventConditions__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5671:1: ( ( ',' ) )
            // InternalMyDsl.g:5672:1: ( ',' )
            {
            // InternalMyDsl.g:5672:1: ( ',' )
            // InternalMyDsl.g:5673:2: ','
            {
             before(grammarAccess.getEventConditionsAccess().getCommaKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEventConditionsAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventConditions__Group_4__0__Impl"


    // $ANTLR start "rule__EventConditions__Group_4__1"
    // InternalMyDsl.g:5682:1: rule__EventConditions__Group_4__1 : rule__EventConditions__Group_4__1__Impl ;
    public final void rule__EventConditions__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5686:1: ( rule__EventConditions__Group_4__1__Impl )
            // InternalMyDsl.g:5687:2: rule__EventConditions__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventConditions__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventConditions__Group_4__1"


    // $ANTLR start "rule__EventConditions__Group_4__1__Impl"
    // InternalMyDsl.g:5693:1: rule__EventConditions__Group_4__1__Impl : ( ( rule__EventConditions__EventConditionsAssignment_4_1 ) ) ;
    public final void rule__EventConditions__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5697:1: ( ( ( rule__EventConditions__EventConditionsAssignment_4_1 ) ) )
            // InternalMyDsl.g:5698:1: ( ( rule__EventConditions__EventConditionsAssignment_4_1 ) )
            {
            // InternalMyDsl.g:5698:1: ( ( rule__EventConditions__EventConditionsAssignment_4_1 ) )
            // InternalMyDsl.g:5699:2: ( rule__EventConditions__EventConditionsAssignment_4_1 )
            {
             before(grammarAccess.getEventConditionsAccess().getEventConditionsAssignment_4_1()); 
            // InternalMyDsl.g:5700:2: ( rule__EventConditions__EventConditionsAssignment_4_1 )
            // InternalMyDsl.g:5700:3: rule__EventConditions__EventConditionsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__EventConditions__EventConditionsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEventConditionsAccess().getEventConditionsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventConditions__Group_4__1__Impl"


    // $ANTLR start "rule__Generate__Group__0"
    // InternalMyDsl.g:5709:1: rule__Generate__Group__0 : rule__Generate__Group__0__Impl rule__Generate__Group__1 ;
    public final void rule__Generate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5713:1: ( rule__Generate__Group__0__Impl rule__Generate__Group__1 )
            // InternalMyDsl.g:5714:2: rule__Generate__Group__0__Impl rule__Generate__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Generate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generate__Group__0"


    // $ANTLR start "rule__Generate__Group__0__Impl"
    // InternalMyDsl.g:5721:1: rule__Generate__Group__0__Impl : ( 'generate' ) ;
    public final void rule__Generate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5725:1: ( ( 'generate' ) )
            // InternalMyDsl.g:5726:1: ( 'generate' )
            {
            // InternalMyDsl.g:5726:1: ( 'generate' )
            // InternalMyDsl.g:5727:2: 'generate'
            {
             before(grammarAccess.getGenerateAccess().getGenerateKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getGenerateAccess().getGenerateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generate__Group__0__Impl"


    // $ANTLR start "rule__Generate__Group__1"
    // InternalMyDsl.g:5736:1: rule__Generate__Group__1 : rule__Generate__Group__1__Impl rule__Generate__Group__2 ;
    public final void rule__Generate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5740:1: ( rule__Generate__Group__1__Impl rule__Generate__Group__2 )
            // InternalMyDsl.g:5741:2: rule__Generate__Group__1__Impl rule__Generate__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Generate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generate__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generate__Group__1"


    // $ANTLR start "rule__Generate__Group__1__Impl"
    // InternalMyDsl.g:5748:1: rule__Generate__Group__1__Impl : ( ( rule__Generate__SourceNameAssignment_1 ) ) ;
    public final void rule__Generate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5752:1: ( ( ( rule__Generate__SourceNameAssignment_1 ) ) )
            // InternalMyDsl.g:5753:1: ( ( rule__Generate__SourceNameAssignment_1 ) )
            {
            // InternalMyDsl.g:5753:1: ( ( rule__Generate__SourceNameAssignment_1 ) )
            // InternalMyDsl.g:5754:2: ( rule__Generate__SourceNameAssignment_1 )
            {
             before(grammarAccess.getGenerateAccess().getSourceNameAssignment_1()); 
            // InternalMyDsl.g:5755:2: ( rule__Generate__SourceNameAssignment_1 )
            // InternalMyDsl.g:5755:3: rule__Generate__SourceNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Generate__SourceNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGenerateAccess().getSourceNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generate__Group__1__Impl"


    // $ANTLR start "rule__Generate__Group__2"
    // InternalMyDsl.g:5763:1: rule__Generate__Group__2 : rule__Generate__Group__2__Impl rule__Generate__Group__3 ;
    public final void rule__Generate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5767:1: ( rule__Generate__Group__2__Impl rule__Generate__Group__3 )
            // InternalMyDsl.g:5768:2: rule__Generate__Group__2__Impl rule__Generate__Group__3
            {
            pushFollow(FOLLOW_53);
            rule__Generate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generate__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generate__Group__2"


    // $ANTLR start "rule__Generate__Group__2__Impl"
    // InternalMyDsl.g:5775:1: rule__Generate__Group__2__Impl : ( ':' ) ;
    public final void rule__Generate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5779:1: ( ( ':' ) )
            // InternalMyDsl.g:5780:1: ( ':' )
            {
            // InternalMyDsl.g:5780:1: ( ':' )
            // InternalMyDsl.g:5781:2: ':'
            {
             before(grammarAccess.getGenerateAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getGenerateAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generate__Group__2__Impl"


    // $ANTLR start "rule__Generate__Group__3"
    // InternalMyDsl.g:5790:1: rule__Generate__Group__3 : rule__Generate__Group__3__Impl rule__Generate__Group__4 ;
    public final void rule__Generate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5794:1: ( rule__Generate__Group__3__Impl rule__Generate__Group__4 )
            // InternalMyDsl.g:5795:2: rule__Generate__Group__3__Impl rule__Generate__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Generate__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generate__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generate__Group__3"


    // $ANTLR start "rule__Generate__Group__3__Impl"
    // InternalMyDsl.g:5802:1: rule__Generate__Group__3__Impl : ( ( rule__Generate__TypeAssignment_3 ) ) ;
    public final void rule__Generate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5806:1: ( ( ( rule__Generate__TypeAssignment_3 ) ) )
            // InternalMyDsl.g:5807:1: ( ( rule__Generate__TypeAssignment_3 ) )
            {
            // InternalMyDsl.g:5807:1: ( ( rule__Generate__TypeAssignment_3 ) )
            // InternalMyDsl.g:5808:2: ( rule__Generate__TypeAssignment_3 )
            {
             before(grammarAccess.getGenerateAccess().getTypeAssignment_3()); 
            // InternalMyDsl.g:5809:2: ( rule__Generate__TypeAssignment_3 )
            // InternalMyDsl.g:5809:3: rule__Generate__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Generate__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGenerateAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generate__Group__3__Impl"


    // $ANTLR start "rule__Generate__Group__4"
    // InternalMyDsl.g:5817:1: rule__Generate__Group__4 : rule__Generate__Group__4__Impl ;
    public final void rule__Generate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5821:1: ( rule__Generate__Group__4__Impl )
            // InternalMyDsl.g:5822:2: rule__Generate__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Generate__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generate__Group__4"


    // $ANTLR start "rule__Generate__Group__4__Impl"
    // InternalMyDsl.g:5828:1: rule__Generate__Group__4__Impl : ( ';' ) ;
    public final void rule__Generate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5832:1: ( ( ';' ) )
            // InternalMyDsl.g:5833:1: ( ';' )
            {
            // InternalMyDsl.g:5833:1: ( ';' )
            // InternalMyDsl.g:5834:2: ';'
            {
             before(grammarAccess.getGenerateAccess().getSemicolonKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getGenerateAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generate__Group__4__Impl"


    // $ANTLR start "rule__Actuator__Group__0"
    // InternalMyDsl.g:5844:1: rule__Actuator__Group__0 : rule__Actuator__Group__0__Impl rule__Actuator__Group__1 ;
    public final void rule__Actuator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5848:1: ( rule__Actuator__Group__0__Impl rule__Actuator__Group__1 )
            // InternalMyDsl.g:5849:2: rule__Actuator__Group__0__Impl rule__Actuator__Group__1
            {
            pushFollow(FOLLOW_61);
            rule__Actuator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__0"


    // $ANTLR start "rule__Actuator__Group__0__Impl"
    // InternalMyDsl.g:5856:1: rule__Actuator__Group__0__Impl : ( ( rule__Actuator__ActuatorNameAssignment_0 ) ) ;
    public final void rule__Actuator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5860:1: ( ( ( rule__Actuator__ActuatorNameAssignment_0 ) ) )
            // InternalMyDsl.g:5861:1: ( ( rule__Actuator__ActuatorNameAssignment_0 ) )
            {
            // InternalMyDsl.g:5861:1: ( ( rule__Actuator__ActuatorNameAssignment_0 ) )
            // InternalMyDsl.g:5862:2: ( rule__Actuator__ActuatorNameAssignment_0 )
            {
             before(grammarAccess.getActuatorAccess().getActuatorNameAssignment_0()); 
            // InternalMyDsl.g:5863:2: ( rule__Actuator__ActuatorNameAssignment_0 )
            // InternalMyDsl.g:5863:3: rule__Actuator__ActuatorNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__ActuatorNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getActuatorAccess().getActuatorNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__0__Impl"


    // $ANTLR start "rule__Actuator__Group__1"
    // InternalMyDsl.g:5871:1: rule__Actuator__Group__1 : rule__Actuator__Group__1__Impl ;
    public final void rule__Actuator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5875:1: ( rule__Actuator__Group__1__Impl )
            // InternalMyDsl.g:5876:2: rule__Actuator__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__1"


    // $ANTLR start "rule__Actuator__Group__1__Impl"
    // InternalMyDsl.g:5882:1: rule__Actuator__Group__1__Impl : ( ( rule__Actuator__ActionsAssignment_1 )* ) ;
    public final void rule__Actuator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5886:1: ( ( ( rule__Actuator__ActionsAssignment_1 )* ) )
            // InternalMyDsl.g:5887:1: ( ( rule__Actuator__ActionsAssignment_1 )* )
            {
            // InternalMyDsl.g:5887:1: ( ( rule__Actuator__ActionsAssignment_1 )* )
            // InternalMyDsl.g:5888:2: ( rule__Actuator__ActionsAssignment_1 )*
            {
             before(grammarAccess.getActuatorAccess().getActionsAssignment_1()); 
            // InternalMyDsl.g:5889:2: ( rule__Actuator__ActionsAssignment_1 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==49) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalMyDsl.g:5889:3: rule__Actuator__ActionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_62);
            	    rule__Actuator__ActionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

             after(grammarAccess.getActuatorAccess().getActionsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // InternalMyDsl.g:5898:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5902:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalMyDsl.g:5903:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // InternalMyDsl.g:5910:1: rule__Action__Group__0__Impl : ( 'action' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5914:1: ( ( 'action' ) )
            // InternalMyDsl.g:5915:1: ( 'action' )
            {
            // InternalMyDsl.g:5915:1: ( 'action' )
            // InternalMyDsl.g:5916:2: 'action'
            {
             before(grammarAccess.getActionAccess().getActionKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getActionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // InternalMyDsl.g:5925:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5929:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalMyDsl.g:5930:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__Action__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // InternalMyDsl.g:5937:1: rule__Action__Group__1__Impl : ( ( rule__Action__ActionNameAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5941:1: ( ( ( rule__Action__ActionNameAssignment_1 ) ) )
            // InternalMyDsl.g:5942:1: ( ( rule__Action__ActionNameAssignment_1 ) )
            {
            // InternalMyDsl.g:5942:1: ( ( rule__Action__ActionNameAssignment_1 ) )
            // InternalMyDsl.g:5943:2: ( rule__Action__ActionNameAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getActionNameAssignment_1()); 
            // InternalMyDsl.g:5944:2: ( rule__Action__ActionNameAssignment_1 )
            // InternalMyDsl.g:5944:3: rule__Action__ActionNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__ActionNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getActionNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__2"
    // InternalMyDsl.g:5952:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5956:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // InternalMyDsl.g:5957:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Action__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2"


    // $ANTLR start "rule__Action__Group__2__Impl"
    // InternalMyDsl.g:5964:1: rule__Action__Group__2__Impl : ( '(' ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5968:1: ( ( '(' ) )
            // InternalMyDsl.g:5969:1: ( '(' )
            {
            // InternalMyDsl.g:5969:1: ( '(' )
            // InternalMyDsl.g:5970:2: '('
            {
             before(grammarAccess.getActionAccess().getLeftParenthesisKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2__Impl"


    // $ANTLR start "rule__Action__Group__3"
    // InternalMyDsl.g:5979:1: rule__Action__Group__3 : rule__Action__Group__3__Impl rule__Action__Group__4 ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5983:1: ( rule__Action__Group__3__Impl rule__Action__Group__4 )
            // InternalMyDsl.g:5984:2: rule__Action__Group__3__Impl rule__Action__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Action__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3"


    // $ANTLR start "rule__Action__Group__3__Impl"
    // InternalMyDsl.g:5991:1: rule__Action__Group__3__Impl : ( ( rule__Action__ParametersAssignment_3 )* ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5995:1: ( ( ( rule__Action__ParametersAssignment_3 )* ) )
            // InternalMyDsl.g:5996:1: ( ( rule__Action__ParametersAssignment_3 )* )
            {
            // InternalMyDsl.g:5996:1: ( ( rule__Action__ParametersAssignment_3 )* )
            // InternalMyDsl.g:5997:2: ( rule__Action__ParametersAssignment_3 )*
            {
             before(grammarAccess.getActionAccess().getParametersAssignment_3()); 
            // InternalMyDsl.g:5998:2: ( rule__Action__ParametersAssignment_3 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==RULE_ID) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalMyDsl.g:5998:3: rule__Action__ParametersAssignment_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Action__ParametersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

             after(grammarAccess.getActionAccess().getParametersAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3__Impl"


    // $ANTLR start "rule__Action__Group__4"
    // InternalMyDsl.g:6006:1: rule__Action__Group__4 : rule__Action__Group__4__Impl rule__Action__Group__5 ;
    public final void rule__Action__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6010:1: ( rule__Action__Group__4__Impl rule__Action__Group__5 )
            // InternalMyDsl.g:6011:2: rule__Action__Group__4__Impl rule__Action__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Action__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__4"


    // $ANTLR start "rule__Action__Group__4__Impl"
    // InternalMyDsl.g:6018:1: rule__Action__Group__4__Impl : ( ')' ) ;
    public final void rule__Action__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6022:1: ( ( ')' ) )
            // InternalMyDsl.g:6023:1: ( ')' )
            {
            // InternalMyDsl.g:6023:1: ( ')' )
            // InternalMyDsl.g:6024:2: ')'
            {
             before(grammarAccess.getActionAccess().getRightParenthesisKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__4__Impl"


    // $ANTLR start "rule__Action__Group__5"
    // InternalMyDsl.g:6033:1: rule__Action__Group__5 : rule__Action__Group__5__Impl ;
    public final void rule__Action__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6037:1: ( rule__Action__Group__5__Impl )
            // InternalMyDsl.g:6038:2: rule__Action__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__5"


    // $ANTLR start "rule__Action__Group__5__Impl"
    // InternalMyDsl.g:6044:1: rule__Action__Group__5__Impl : ( ';' ) ;
    public final void rule__Action__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6048:1: ( ( ';' ) )
            // InternalMyDsl.g:6049:1: ( ';' )
            {
            // InternalMyDsl.g:6049:1: ( ';' )
            // InternalMyDsl.g:6050:2: ';'
            {
             before(grammarAccess.getActionAccess().getSemicolonKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__5__Impl"


    // $ANTLR start "rule__Parameters__Group__0"
    // InternalMyDsl.g:6060:1: rule__Parameters__Group__0 : rule__Parameters__Group__0__Impl rule__Parameters__Group__1 ;
    public final void rule__Parameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6064:1: ( rule__Parameters__Group__0__Impl rule__Parameters__Group__1 )
            // InternalMyDsl.g:6065:2: rule__Parameters__Group__0__Impl rule__Parameters__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Parameters__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameters__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__Group__0"


    // $ANTLR start "rule__Parameters__Group__0__Impl"
    // InternalMyDsl.g:6072:1: rule__Parameters__Group__0__Impl : ( ( rule__Parameters__ParameterNameAssignment_0 ) ) ;
    public final void rule__Parameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6076:1: ( ( ( rule__Parameters__ParameterNameAssignment_0 ) ) )
            // InternalMyDsl.g:6077:1: ( ( rule__Parameters__ParameterNameAssignment_0 ) )
            {
            // InternalMyDsl.g:6077:1: ( ( rule__Parameters__ParameterNameAssignment_0 ) )
            // InternalMyDsl.g:6078:2: ( rule__Parameters__ParameterNameAssignment_0 )
            {
             before(grammarAccess.getParametersAccess().getParameterNameAssignment_0()); 
            // InternalMyDsl.g:6079:2: ( rule__Parameters__ParameterNameAssignment_0 )
            // InternalMyDsl.g:6079:3: rule__Parameters__ParameterNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameters__ParameterNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParametersAccess().getParameterNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__Group__0__Impl"


    // $ANTLR start "rule__Parameters__Group__1"
    // InternalMyDsl.g:6087:1: rule__Parameters__Group__1 : rule__Parameters__Group__1__Impl rule__Parameters__Group__2 ;
    public final void rule__Parameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6091:1: ( rule__Parameters__Group__1__Impl rule__Parameters__Group__2 )
            // InternalMyDsl.g:6092:2: rule__Parameters__Group__1__Impl rule__Parameters__Group__2
            {
            pushFollow(FOLLOW_53);
            rule__Parameters__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameters__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__Group__1"


    // $ANTLR start "rule__Parameters__Group__1__Impl"
    // InternalMyDsl.g:6099:1: rule__Parameters__Group__1__Impl : ( ':' ) ;
    public final void rule__Parameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6103:1: ( ( ':' ) )
            // InternalMyDsl.g:6104:1: ( ':' )
            {
            // InternalMyDsl.g:6104:1: ( ':' )
            // InternalMyDsl.g:6105:2: ':'
            {
             before(grammarAccess.getParametersAccess().getColonKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getParametersAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__Group__1__Impl"


    // $ANTLR start "rule__Parameters__Group__2"
    // InternalMyDsl.g:6114:1: rule__Parameters__Group__2 : rule__Parameters__Group__2__Impl ;
    public final void rule__Parameters__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6118:1: ( rule__Parameters__Group__2__Impl )
            // InternalMyDsl.g:6119:2: rule__Parameters__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameters__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__Group__2"


    // $ANTLR start "rule__Parameters__Group__2__Impl"
    // InternalMyDsl.g:6125:1: rule__Parameters__Group__2__Impl : ( ( rule__Parameters__TypeAssignment_2 ) ) ;
    public final void rule__Parameters__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6129:1: ( ( ( rule__Parameters__TypeAssignment_2 ) ) )
            // InternalMyDsl.g:6130:1: ( ( rule__Parameters__TypeAssignment_2 ) )
            {
            // InternalMyDsl.g:6130:1: ( ( rule__Parameters__TypeAssignment_2 ) )
            // InternalMyDsl.g:6131:2: ( rule__Parameters__TypeAssignment_2 )
            {
             before(grammarAccess.getParametersAccess().getTypeAssignment_2()); 
            // InternalMyDsl.g:6132:2: ( rule__Parameters__TypeAssignment_2 )
            // InternalMyDsl.g:6132:3: rule__Parameters__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Parameters__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParametersAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__Group__2__Impl"


    // $ANTLR start "rule__StorageService__Group__0"
    // InternalMyDsl.g:6141:1: rule__StorageService__Group__0 : rule__StorageService__Group__0__Impl rule__StorageService__Group__1 ;
    public final void rule__StorageService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6145:1: ( rule__StorageService__Group__0__Impl rule__StorageService__Group__1 )
            // InternalMyDsl.g:6146:2: rule__StorageService__Group__0__Impl rule__StorageService__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__StorageService__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StorageService__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StorageService__Group__0"


    // $ANTLR start "rule__StorageService__Group__0__Impl"
    // InternalMyDsl.g:6153:1: rule__StorageService__Group__0__Impl : ( ( rule__StorageService__StorageServiceNameAssignment_0 ) ) ;
    public final void rule__StorageService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6157:1: ( ( ( rule__StorageService__StorageServiceNameAssignment_0 ) ) )
            // InternalMyDsl.g:6158:1: ( ( rule__StorageService__StorageServiceNameAssignment_0 ) )
            {
            // InternalMyDsl.g:6158:1: ( ( rule__StorageService__StorageServiceNameAssignment_0 ) )
            // InternalMyDsl.g:6159:2: ( rule__StorageService__StorageServiceNameAssignment_0 )
            {
             before(grammarAccess.getStorageServiceAccess().getStorageServiceNameAssignment_0()); 
            // InternalMyDsl.g:6160:2: ( rule__StorageService__StorageServiceNameAssignment_0 )
            // InternalMyDsl.g:6160:3: rule__StorageService__StorageServiceNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__StorageService__StorageServiceNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStorageServiceAccess().getStorageServiceNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StorageService__Group__0__Impl"


    // $ANTLR start "rule__StorageService__Group__1"
    // InternalMyDsl.g:6168:1: rule__StorageService__Group__1 : rule__StorageService__Group__1__Impl ;
    public final void rule__StorageService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6172:1: ( rule__StorageService__Group__1__Impl )
            // InternalMyDsl.g:6173:2: rule__StorageService__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StorageService__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StorageService__Group__1"


    // $ANTLR start "rule__StorageService__Group__1__Impl"
    // InternalMyDsl.g:6179:1: rule__StorageService__Group__1__Impl : ( ( rule__StorageService__DataAccessesAssignment_1 )* ) ;
    public final void rule__StorageService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6183:1: ( ( ( rule__StorageService__DataAccessesAssignment_1 )* ) )
            // InternalMyDsl.g:6184:1: ( ( rule__StorageService__DataAccessesAssignment_1 )* )
            {
            // InternalMyDsl.g:6184:1: ( ( rule__StorageService__DataAccessesAssignment_1 )* )
            // InternalMyDsl.g:6185:2: ( rule__StorageService__DataAccessesAssignment_1 )*
            {
             before(grammarAccess.getStorageServiceAccess().getDataAccessesAssignment_1()); 
            // InternalMyDsl.g:6186:2: ( rule__StorageService__DataAccessesAssignment_1 )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==48) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalMyDsl.g:6186:3: rule__StorageService__DataAccessesAssignment_1
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__StorageService__DataAccessesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

             after(grammarAccess.getStorageServiceAccess().getDataAccessesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StorageService__Group__1__Impl"


    // $ANTLR start "rule__DataAccessForRequestSensors__Group__0"
    // InternalMyDsl.g:6195:1: rule__DataAccessForRequestSensors__Group__0 : rule__DataAccessForRequestSensors__Group__0__Impl rule__DataAccessForRequestSensors__Group__1 ;
    public final void rule__DataAccessForRequestSensors__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6199:1: ( rule__DataAccessForRequestSensors__Group__0__Impl rule__DataAccessForRequestSensors__Group__1 )
            // InternalMyDsl.g:6200:2: rule__DataAccessForRequestSensors__Group__0__Impl rule__DataAccessForRequestSensors__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DataAccessForRequestSensors__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataAccessForRequestSensors__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccessForRequestSensors__Group__0"


    // $ANTLR start "rule__DataAccessForRequestSensors__Group__0__Impl"
    // InternalMyDsl.g:6207:1: rule__DataAccessForRequestSensors__Group__0__Impl : ( 'generate' ) ;
    public final void rule__DataAccessForRequestSensors__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6211:1: ( ( 'generate' ) )
            // InternalMyDsl.g:6212:1: ( 'generate' )
            {
            // InternalMyDsl.g:6212:1: ( 'generate' )
            // InternalMyDsl.g:6213:2: 'generate'
            {
             before(grammarAccess.getDataAccessForRequestSensorsAccess().getGenerateKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getDataAccessForRequestSensorsAccess().getGenerateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccessForRequestSensors__Group__0__Impl"


    // $ANTLR start "rule__DataAccessForRequestSensors__Group__1"
    // InternalMyDsl.g:6222:1: rule__DataAccessForRequestSensors__Group__1 : rule__DataAccessForRequestSensors__Group__1__Impl rule__DataAccessForRequestSensors__Group__2 ;
    public final void rule__DataAccessForRequestSensors__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6226:1: ( rule__DataAccessForRequestSensors__Group__1__Impl rule__DataAccessForRequestSensors__Group__2 )
            // InternalMyDsl.g:6227:2: rule__DataAccessForRequestSensors__Group__1__Impl rule__DataAccessForRequestSensors__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DataAccessForRequestSensors__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataAccessForRequestSensors__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccessForRequestSensors__Group__1"


    // $ANTLR start "rule__DataAccessForRequestSensors__Group__1__Impl"
    // InternalMyDsl.g:6234:1: rule__DataAccessForRequestSensors__Group__1__Impl : ( ( rule__DataAccessForRequestSensors__SourceNameAssignment_1 ) ) ;
    public final void rule__DataAccessForRequestSensors__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6238:1: ( ( ( rule__DataAccessForRequestSensors__SourceNameAssignment_1 ) ) )
            // InternalMyDsl.g:6239:1: ( ( rule__DataAccessForRequestSensors__SourceNameAssignment_1 ) )
            {
            // InternalMyDsl.g:6239:1: ( ( rule__DataAccessForRequestSensors__SourceNameAssignment_1 ) )
            // InternalMyDsl.g:6240:2: ( rule__DataAccessForRequestSensors__SourceNameAssignment_1 )
            {
             before(grammarAccess.getDataAccessForRequestSensorsAccess().getSourceNameAssignment_1()); 
            // InternalMyDsl.g:6241:2: ( rule__DataAccessForRequestSensors__SourceNameAssignment_1 )
            // InternalMyDsl.g:6241:3: rule__DataAccessForRequestSensors__SourceNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataAccessForRequestSensors__SourceNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataAccessForRequestSensorsAccess().getSourceNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccessForRequestSensors__Group__1__Impl"


    // $ANTLR start "rule__DataAccessForRequestSensors__Group__2"
    // InternalMyDsl.g:6249:1: rule__DataAccessForRequestSensors__Group__2 : rule__DataAccessForRequestSensors__Group__2__Impl rule__DataAccessForRequestSensors__Group__3 ;
    public final void rule__DataAccessForRequestSensors__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6253:1: ( rule__DataAccessForRequestSensors__Group__2__Impl rule__DataAccessForRequestSensors__Group__3 )
            // InternalMyDsl.g:6254:2: rule__DataAccessForRequestSensors__Group__2__Impl rule__DataAccessForRequestSensors__Group__3
            {
            pushFollow(FOLLOW_53);
            rule__DataAccessForRequestSensors__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataAccessForRequestSensors__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccessForRequestSensors__Group__2"


    // $ANTLR start "rule__DataAccessForRequestSensors__Group__2__Impl"
    // InternalMyDsl.g:6261:1: rule__DataAccessForRequestSensors__Group__2__Impl : ( ':' ) ;
    public final void rule__DataAccessForRequestSensors__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6265:1: ( ( ':' ) )
            // InternalMyDsl.g:6266:1: ( ':' )
            {
            // InternalMyDsl.g:6266:1: ( ':' )
            // InternalMyDsl.g:6267:2: ':'
            {
             before(grammarAccess.getDataAccessForRequestSensorsAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDataAccessForRequestSensorsAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccessForRequestSensors__Group__2__Impl"


    // $ANTLR start "rule__DataAccessForRequestSensors__Group__3"
    // InternalMyDsl.g:6276:1: rule__DataAccessForRequestSensors__Group__3 : rule__DataAccessForRequestSensors__Group__3__Impl rule__DataAccessForRequestSensors__Group__4 ;
    public final void rule__DataAccessForRequestSensors__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6280:1: ( rule__DataAccessForRequestSensors__Group__3__Impl rule__DataAccessForRequestSensors__Group__4 )
            // InternalMyDsl.g:6281:2: rule__DataAccessForRequestSensors__Group__3__Impl rule__DataAccessForRequestSensors__Group__4
            {
            pushFollow(FOLLOW_63);
            rule__DataAccessForRequestSensors__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataAccessForRequestSensors__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccessForRequestSensors__Group__3"


    // $ANTLR start "rule__DataAccessForRequestSensors__Group__3__Impl"
    // InternalMyDsl.g:6288:1: rule__DataAccessForRequestSensors__Group__3__Impl : ( ( rule__DataAccessForRequestSensors__DataAccessTypeAssignment_3 ) ) ;
    public final void rule__DataAccessForRequestSensors__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6292:1: ( ( ( rule__DataAccessForRequestSensors__DataAccessTypeAssignment_3 ) ) )
            // InternalMyDsl.g:6293:1: ( ( rule__DataAccessForRequestSensors__DataAccessTypeAssignment_3 ) )
            {
            // InternalMyDsl.g:6293:1: ( ( rule__DataAccessForRequestSensors__DataAccessTypeAssignment_3 ) )
            // InternalMyDsl.g:6294:2: ( rule__DataAccessForRequestSensors__DataAccessTypeAssignment_3 )
            {
             before(grammarAccess.getDataAccessForRequestSensorsAccess().getDataAccessTypeAssignment_3()); 
            // InternalMyDsl.g:6295:2: ( rule__DataAccessForRequestSensors__DataAccessTypeAssignment_3 )
            // InternalMyDsl.g:6295:3: rule__DataAccessForRequestSensors__DataAccessTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DataAccessForRequestSensors__DataAccessTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDataAccessForRequestSensorsAccess().getDataAccessTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccessForRequestSensors__Group__3__Impl"


    // $ANTLR start "rule__DataAccessForRequestSensors__Group__4"
    // InternalMyDsl.g:6303:1: rule__DataAccessForRequestSensors__Group__4 : rule__DataAccessForRequestSensors__Group__4__Impl rule__DataAccessForRequestSensors__Group__5 ;
    public final void rule__DataAccessForRequestSensors__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6307:1: ( rule__DataAccessForRequestSensors__Group__4__Impl rule__DataAccessForRequestSensors__Group__5 )
            // InternalMyDsl.g:6308:2: rule__DataAccessForRequestSensors__Group__4__Impl rule__DataAccessForRequestSensors__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__DataAccessForRequestSensors__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataAccessForRequestSensors__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccessForRequestSensors__Group__4"


    // $ANTLR start "rule__DataAccessForRequestSensors__Group__4__Impl"
    // InternalMyDsl.g:6315:1: rule__DataAccessForRequestSensors__Group__4__Impl : ( 'accessed-by' ) ;
    public final void rule__DataAccessForRequestSensors__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6319:1: ( ( 'accessed-by' ) )
            // InternalMyDsl.g:6320:1: ( 'accessed-by' )
            {
            // InternalMyDsl.g:6320:1: ( 'accessed-by' )
            // InternalMyDsl.g:6321:2: 'accessed-by'
            {
             before(grammarAccess.getDataAccessForRequestSensorsAccess().getAccessedByKeyword_4()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getDataAccessForRequestSensorsAccess().getAccessedByKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccessForRequestSensors__Group__4__Impl"


    // $ANTLR start "rule__DataAccessForRequestSensors__Group__5"
    // InternalMyDsl.g:6330:1: rule__DataAccessForRequestSensors__Group__5 : rule__DataAccessForRequestSensors__Group__5__Impl rule__DataAccessForRequestSensors__Group__6 ;
    public final void rule__DataAccessForRequestSensors__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6334:1: ( rule__DataAccessForRequestSensors__Group__5__Impl rule__DataAccessForRequestSensors__Group__6 )
            // InternalMyDsl.g:6335:2: rule__DataAccessForRequestSensors__Group__5__Impl rule__DataAccessForRequestSensors__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__DataAccessForRequestSensors__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataAccessForRequestSensors__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccessForRequestSensors__Group__5"


    // $ANTLR start "rule__DataAccessForRequestSensors__Group__5__Impl"
    // InternalMyDsl.g:6342:1: rule__DataAccessForRequestSensors__Group__5__Impl : ( ( rule__DataAccessForRequestSensors__DataItemAssignment_5 ) ) ;
    public final void rule__DataAccessForRequestSensors__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6346:1: ( ( ( rule__DataAccessForRequestSensors__DataItemAssignment_5 ) ) )
            // InternalMyDsl.g:6347:1: ( ( rule__DataAccessForRequestSensors__DataItemAssignment_5 ) )
            {
            // InternalMyDsl.g:6347:1: ( ( rule__DataAccessForRequestSensors__DataItemAssignment_5 ) )
            // InternalMyDsl.g:6348:2: ( rule__DataAccessForRequestSensors__DataItemAssignment_5 )
            {
             before(grammarAccess.getDataAccessForRequestSensorsAccess().getDataItemAssignment_5()); 
            // InternalMyDsl.g:6349:2: ( rule__DataAccessForRequestSensors__DataItemAssignment_5 )
            // InternalMyDsl.g:6349:3: rule__DataAccessForRequestSensors__DataItemAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__DataAccessForRequestSensors__DataItemAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDataAccessForRequestSensorsAccess().getDataItemAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccessForRequestSensors__Group__5__Impl"


    // $ANTLR start "rule__DataAccessForRequestSensors__Group__6"
    // InternalMyDsl.g:6357:1: rule__DataAccessForRequestSensors__Group__6 : rule__DataAccessForRequestSensors__Group__6__Impl rule__DataAccessForRequestSensors__Group__7 ;
    public final void rule__DataAccessForRequestSensors__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6361:1: ( rule__DataAccessForRequestSensors__Group__6__Impl rule__DataAccessForRequestSensors__Group__7 )
            // InternalMyDsl.g:6362:2: rule__DataAccessForRequestSensors__Group__6__Impl rule__DataAccessForRequestSensors__Group__7
            {
            pushFollow(FOLLOW_53);
            rule__DataAccessForRequestSensors__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataAccessForRequestSensors__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccessForRequestSensors__Group__6"


    // $ANTLR start "rule__DataAccessForRequestSensors__Group__6__Impl"
    // InternalMyDsl.g:6369:1: rule__DataAccessForRequestSensors__Group__6__Impl : ( ':' ) ;
    public final void rule__DataAccessForRequestSensors__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6373:1: ( ( ':' ) )
            // InternalMyDsl.g:6374:1: ( ':' )
            {
            // InternalMyDsl.g:6374:1: ( ':' )
            // InternalMyDsl.g:6375:2: ':'
            {
             before(grammarAccess.getDataAccessForRequestSensorsAccess().getColonKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDataAccessForRequestSensorsAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccessForRequestSensors__Group__6__Impl"


    // $ANTLR start "rule__DataAccessForRequestSensors__Group__7"
    // InternalMyDsl.g:6384:1: rule__DataAccessForRequestSensors__Group__7 : rule__DataAccessForRequestSensors__Group__7__Impl rule__DataAccessForRequestSensors__Group__8 ;
    public final void rule__DataAccessForRequestSensors__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6388:1: ( rule__DataAccessForRequestSensors__Group__7__Impl rule__DataAccessForRequestSensors__Group__8 )
            // InternalMyDsl.g:6389:2: rule__DataAccessForRequestSensors__Group__7__Impl rule__DataAccessForRequestSensors__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__DataAccessForRequestSensors__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataAccessForRequestSensors__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccessForRequestSensors__Group__7"


    // $ANTLR start "rule__DataAccessForRequestSensors__Group__7__Impl"
    // InternalMyDsl.g:6396:1: rule__DataAccessForRequestSensors__Group__7__Impl : ( ( rule__DataAccessForRequestSensors__TypeAssignment_7 ) ) ;
    public final void rule__DataAccessForRequestSensors__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6400:1: ( ( ( rule__DataAccessForRequestSensors__TypeAssignment_7 ) ) )
            // InternalMyDsl.g:6401:1: ( ( rule__DataAccessForRequestSensors__TypeAssignment_7 ) )
            {
            // InternalMyDsl.g:6401:1: ( ( rule__DataAccessForRequestSensors__TypeAssignment_7 ) )
            // InternalMyDsl.g:6402:2: ( rule__DataAccessForRequestSensors__TypeAssignment_7 )
            {
             before(grammarAccess.getDataAccessForRequestSensorsAccess().getTypeAssignment_7()); 
            // InternalMyDsl.g:6403:2: ( rule__DataAccessForRequestSensors__TypeAssignment_7 )
            // InternalMyDsl.g:6403:3: rule__DataAccessForRequestSensors__TypeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__DataAccessForRequestSensors__TypeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getDataAccessForRequestSensorsAccess().getTypeAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccessForRequestSensors__Group__7__Impl"


    // $ANTLR start "rule__DataAccessForRequestSensors__Group__8"
    // InternalMyDsl.g:6411:1: rule__DataAccessForRequestSensors__Group__8 : rule__DataAccessForRequestSensors__Group__8__Impl ;
    public final void rule__DataAccessForRequestSensors__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6415:1: ( rule__DataAccessForRequestSensors__Group__8__Impl )
            // InternalMyDsl.g:6416:2: rule__DataAccessForRequestSensors__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataAccessForRequestSensors__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccessForRequestSensors__Group__8"


    // $ANTLR start "rule__DataAccessForRequestSensors__Group__8__Impl"
    // InternalMyDsl.g:6422:1: rule__DataAccessForRequestSensors__Group__8__Impl : ( ';' ) ;
    public final void rule__DataAccessForRequestSensors__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6426:1: ( ( ';' ) )
            // InternalMyDsl.g:6427:1: ( ';' )
            {
            // InternalMyDsl.g:6427:1: ( ';' )
            // InternalMyDsl.g:6428:2: ';'
            {
             before(grammarAccess.getDataAccessForRequestSensorsAccess().getSemicolonKeyword_8()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDataAccessForRequestSensorsAccess().getSemicolonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccessForRequestSensors__Group__8__Impl"


    // $ANTLR start "rule__DataAccess__Group__0"
    // InternalMyDsl.g:6438:1: rule__DataAccess__Group__0 : rule__DataAccess__Group__0__Impl rule__DataAccess__Group__1 ;
    public final void rule__DataAccess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6442:1: ( rule__DataAccess__Group__0__Impl rule__DataAccess__Group__1 )
            // InternalMyDsl.g:6443:2: rule__DataAccess__Group__0__Impl rule__DataAccess__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DataAccess__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataAccess__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__Group__0"


    // $ANTLR start "rule__DataAccess__Group__0__Impl"
    // InternalMyDsl.g:6450:1: rule__DataAccess__Group__0__Impl : ( 'generate' ) ;
    public final void rule__DataAccess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6454:1: ( ( 'generate' ) )
            // InternalMyDsl.g:6455:1: ( 'generate' )
            {
            // InternalMyDsl.g:6455:1: ( 'generate' )
            // InternalMyDsl.g:6456:2: 'generate'
            {
             before(grammarAccess.getDataAccessAccess().getGenerateKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getDataAccessAccess().getGenerateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__Group__0__Impl"


    // $ANTLR start "rule__DataAccess__Group__1"
    // InternalMyDsl.g:6465:1: rule__DataAccess__Group__1 : rule__DataAccess__Group__1__Impl rule__DataAccess__Group__2 ;
    public final void rule__DataAccess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6469:1: ( rule__DataAccess__Group__1__Impl rule__DataAccess__Group__2 )
            // InternalMyDsl.g:6470:2: rule__DataAccess__Group__1__Impl rule__DataAccess__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DataAccess__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataAccess__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__Group__1"


    // $ANTLR start "rule__DataAccess__Group__1__Impl"
    // InternalMyDsl.g:6477:1: rule__DataAccess__Group__1__Impl : ( ( rule__DataAccess__SourceNameAssignment_1 ) ) ;
    public final void rule__DataAccess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6481:1: ( ( ( rule__DataAccess__SourceNameAssignment_1 ) ) )
            // InternalMyDsl.g:6482:1: ( ( rule__DataAccess__SourceNameAssignment_1 ) )
            {
            // InternalMyDsl.g:6482:1: ( ( rule__DataAccess__SourceNameAssignment_1 ) )
            // InternalMyDsl.g:6483:2: ( rule__DataAccess__SourceNameAssignment_1 )
            {
             before(grammarAccess.getDataAccessAccess().getSourceNameAssignment_1()); 
            // InternalMyDsl.g:6484:2: ( rule__DataAccess__SourceNameAssignment_1 )
            // InternalMyDsl.g:6484:3: rule__DataAccess__SourceNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataAccess__SourceNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataAccessAccess().getSourceNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__Group__1__Impl"


    // $ANTLR start "rule__DataAccess__Group__2"
    // InternalMyDsl.g:6492:1: rule__DataAccess__Group__2 : rule__DataAccess__Group__2__Impl rule__DataAccess__Group__3 ;
    public final void rule__DataAccess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6496:1: ( rule__DataAccess__Group__2__Impl rule__DataAccess__Group__3 )
            // InternalMyDsl.g:6497:2: rule__DataAccess__Group__2__Impl rule__DataAccess__Group__3
            {
            pushFollow(FOLLOW_53);
            rule__DataAccess__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataAccess__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__Group__2"


    // $ANTLR start "rule__DataAccess__Group__2__Impl"
    // InternalMyDsl.g:6504:1: rule__DataAccess__Group__2__Impl : ( ':' ) ;
    public final void rule__DataAccess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6508:1: ( ( ':' ) )
            // InternalMyDsl.g:6509:1: ( ':' )
            {
            // InternalMyDsl.g:6509:1: ( ':' )
            // InternalMyDsl.g:6510:2: ':'
            {
             before(grammarAccess.getDataAccessAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDataAccessAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__Group__2__Impl"


    // $ANTLR start "rule__DataAccess__Group__3"
    // InternalMyDsl.g:6519:1: rule__DataAccess__Group__3 : rule__DataAccess__Group__3__Impl rule__DataAccess__Group__4 ;
    public final void rule__DataAccess__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6523:1: ( rule__DataAccess__Group__3__Impl rule__DataAccess__Group__4 )
            // InternalMyDsl.g:6524:2: rule__DataAccess__Group__3__Impl rule__DataAccess__Group__4
            {
            pushFollow(FOLLOW_63);
            rule__DataAccess__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataAccess__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__Group__3"


    // $ANTLR start "rule__DataAccess__Group__3__Impl"
    // InternalMyDsl.g:6531:1: rule__DataAccess__Group__3__Impl : ( ( rule__DataAccess__DataAccessTypeAssignment_3 ) ) ;
    public final void rule__DataAccess__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6535:1: ( ( ( rule__DataAccess__DataAccessTypeAssignment_3 ) ) )
            // InternalMyDsl.g:6536:1: ( ( rule__DataAccess__DataAccessTypeAssignment_3 ) )
            {
            // InternalMyDsl.g:6536:1: ( ( rule__DataAccess__DataAccessTypeAssignment_3 ) )
            // InternalMyDsl.g:6537:2: ( rule__DataAccess__DataAccessTypeAssignment_3 )
            {
             before(grammarAccess.getDataAccessAccess().getDataAccessTypeAssignment_3()); 
            // InternalMyDsl.g:6538:2: ( rule__DataAccess__DataAccessTypeAssignment_3 )
            // InternalMyDsl.g:6538:3: rule__DataAccess__DataAccessTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DataAccess__DataAccessTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDataAccessAccess().getDataAccessTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__Group__3__Impl"


    // $ANTLR start "rule__DataAccess__Group__4"
    // InternalMyDsl.g:6546:1: rule__DataAccess__Group__4 : rule__DataAccess__Group__4__Impl rule__DataAccess__Group__5 ;
    public final void rule__DataAccess__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6550:1: ( rule__DataAccess__Group__4__Impl rule__DataAccess__Group__5 )
            // InternalMyDsl.g:6551:2: rule__DataAccess__Group__4__Impl rule__DataAccess__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__DataAccess__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataAccess__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__Group__4"


    // $ANTLR start "rule__DataAccess__Group__4__Impl"
    // InternalMyDsl.g:6558:1: rule__DataAccess__Group__4__Impl : ( 'accessed-by' ) ;
    public final void rule__DataAccess__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6562:1: ( ( 'accessed-by' ) )
            // InternalMyDsl.g:6563:1: ( 'accessed-by' )
            {
            // InternalMyDsl.g:6563:1: ( 'accessed-by' )
            // InternalMyDsl.g:6564:2: 'accessed-by'
            {
             before(grammarAccess.getDataAccessAccess().getAccessedByKeyword_4()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getDataAccessAccess().getAccessedByKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__Group__4__Impl"


    // $ANTLR start "rule__DataAccess__Group__5"
    // InternalMyDsl.g:6573:1: rule__DataAccess__Group__5 : rule__DataAccess__Group__5__Impl rule__DataAccess__Group__6 ;
    public final void rule__DataAccess__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6577:1: ( rule__DataAccess__Group__5__Impl rule__DataAccess__Group__6 )
            // InternalMyDsl.g:6578:2: rule__DataAccess__Group__5__Impl rule__DataAccess__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__DataAccess__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataAccess__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__Group__5"


    // $ANTLR start "rule__DataAccess__Group__5__Impl"
    // InternalMyDsl.g:6585:1: rule__DataAccess__Group__5__Impl : ( ( rule__DataAccess__DataItemAssignment_5 ) ) ;
    public final void rule__DataAccess__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6589:1: ( ( ( rule__DataAccess__DataItemAssignment_5 ) ) )
            // InternalMyDsl.g:6590:1: ( ( rule__DataAccess__DataItemAssignment_5 ) )
            {
            // InternalMyDsl.g:6590:1: ( ( rule__DataAccess__DataItemAssignment_5 ) )
            // InternalMyDsl.g:6591:2: ( rule__DataAccess__DataItemAssignment_5 )
            {
             before(grammarAccess.getDataAccessAccess().getDataItemAssignment_5()); 
            // InternalMyDsl.g:6592:2: ( rule__DataAccess__DataItemAssignment_5 )
            // InternalMyDsl.g:6592:3: rule__DataAccess__DataItemAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__DataAccess__DataItemAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDataAccessAccess().getDataItemAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__Group__5__Impl"


    // $ANTLR start "rule__DataAccess__Group__6"
    // InternalMyDsl.g:6600:1: rule__DataAccess__Group__6 : rule__DataAccess__Group__6__Impl rule__DataAccess__Group__7 ;
    public final void rule__DataAccess__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6604:1: ( rule__DataAccess__Group__6__Impl rule__DataAccess__Group__7 )
            // InternalMyDsl.g:6605:2: rule__DataAccess__Group__6__Impl rule__DataAccess__Group__7
            {
            pushFollow(FOLLOW_53);
            rule__DataAccess__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataAccess__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__Group__6"


    // $ANTLR start "rule__DataAccess__Group__6__Impl"
    // InternalMyDsl.g:6612:1: rule__DataAccess__Group__6__Impl : ( ':' ) ;
    public final void rule__DataAccess__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6616:1: ( ( ':' ) )
            // InternalMyDsl.g:6617:1: ( ':' )
            {
            // InternalMyDsl.g:6617:1: ( ':' )
            // InternalMyDsl.g:6618:2: ':'
            {
             before(grammarAccess.getDataAccessAccess().getColonKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDataAccessAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__Group__6__Impl"


    // $ANTLR start "rule__DataAccess__Group__7"
    // InternalMyDsl.g:6627:1: rule__DataAccess__Group__7 : rule__DataAccess__Group__7__Impl rule__DataAccess__Group__8 ;
    public final void rule__DataAccess__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6631:1: ( rule__DataAccess__Group__7__Impl rule__DataAccess__Group__8 )
            // InternalMyDsl.g:6632:2: rule__DataAccess__Group__7__Impl rule__DataAccess__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__DataAccess__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataAccess__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__Group__7"


    // $ANTLR start "rule__DataAccess__Group__7__Impl"
    // InternalMyDsl.g:6639:1: rule__DataAccess__Group__7__Impl : ( ( rule__DataAccess__TypeAssignment_7 ) ) ;
    public final void rule__DataAccess__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6643:1: ( ( ( rule__DataAccess__TypeAssignment_7 ) ) )
            // InternalMyDsl.g:6644:1: ( ( rule__DataAccess__TypeAssignment_7 ) )
            {
            // InternalMyDsl.g:6644:1: ( ( rule__DataAccess__TypeAssignment_7 ) )
            // InternalMyDsl.g:6645:2: ( rule__DataAccess__TypeAssignment_7 )
            {
             before(grammarAccess.getDataAccessAccess().getTypeAssignment_7()); 
            // InternalMyDsl.g:6646:2: ( rule__DataAccess__TypeAssignment_7 )
            // InternalMyDsl.g:6646:3: rule__DataAccess__TypeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__DataAccess__TypeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getDataAccessAccess().getTypeAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__Group__7__Impl"


    // $ANTLR start "rule__DataAccess__Group__8"
    // InternalMyDsl.g:6654:1: rule__DataAccess__Group__8 : rule__DataAccess__Group__8__Impl rule__DataAccess__Group__9 ;
    public final void rule__DataAccess__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6658:1: ( rule__DataAccess__Group__8__Impl rule__DataAccess__Group__9 )
            // InternalMyDsl.g:6659:2: rule__DataAccess__Group__8__Impl rule__DataAccess__Group__9
            {
            pushFollow(FOLLOW_61);
            rule__DataAccess__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataAccess__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__Group__8"


    // $ANTLR start "rule__DataAccess__Group__8__Impl"
    // InternalMyDsl.g:6666:1: rule__DataAccess__Group__8__Impl : ( ';' ) ;
    public final void rule__DataAccess__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6670:1: ( ( ';' ) )
            // InternalMyDsl.g:6671:1: ( ';' )
            {
            // InternalMyDsl.g:6671:1: ( ';' )
            // InternalMyDsl.g:6672:2: ';'
            {
             before(grammarAccess.getDataAccessAccess().getSemicolonKeyword_8()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDataAccessAccess().getSemicolonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__Group__8__Impl"


    // $ANTLR start "rule__DataAccess__Group__9"
    // InternalMyDsl.g:6681:1: rule__DataAccess__Group__9 : rule__DataAccess__Group__9__Impl ;
    public final void rule__DataAccess__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6685:1: ( rule__DataAccess__Group__9__Impl )
            // InternalMyDsl.g:6686:2: rule__DataAccess__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataAccess__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__Group__9"


    // $ANTLR start "rule__DataAccess__Group__9__Impl"
    // InternalMyDsl.g:6692:1: rule__DataAccess__Group__9__Impl : ( ( rule__DataAccess__ActionsAssignment_9 )* ) ;
    public final void rule__DataAccess__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6696:1: ( ( ( rule__DataAccess__ActionsAssignment_9 )* ) )
            // InternalMyDsl.g:6697:1: ( ( rule__DataAccess__ActionsAssignment_9 )* )
            {
            // InternalMyDsl.g:6697:1: ( ( rule__DataAccess__ActionsAssignment_9 )* )
            // InternalMyDsl.g:6698:2: ( rule__DataAccess__ActionsAssignment_9 )*
            {
             before(grammarAccess.getDataAccessAccess().getActionsAssignment_9()); 
            // InternalMyDsl.g:6699:2: ( rule__DataAccess__ActionsAssignment_9 )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==49) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalMyDsl.g:6699:3: rule__DataAccess__ActionsAssignment_9
            	    {
            	    pushFollow(FOLLOW_62);
            	    rule__DataAccess__ActionsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

             after(grammarAccess.getDataAccessAccess().getActionsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__Group__9__Impl"


    // $ANTLR start "rule__Model__VocSpecAssignment_0"
    // InternalMyDsl.g:6708:1: rule__Model__VocSpecAssignment_0 : ( ruleVocSpec ) ;
    public final void rule__Model__VocSpecAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6712:1: ( ( ruleVocSpec ) )
            // InternalMyDsl.g:6713:2: ( ruleVocSpec )
            {
            // InternalMyDsl.g:6713:2: ( ruleVocSpec )
            // InternalMyDsl.g:6714:3: ruleVocSpec
            {
             before(grammarAccess.getModelAccess().getVocSpecVocSpecParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVocSpec();

            state._fsp--;

             after(grammarAccess.getModelAccess().getVocSpecVocSpecParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__VocSpecAssignment_0"


    // $ANTLR start "rule__Model__InteractionSpecAssignment_1"
    // InternalMyDsl.g:6723:1: rule__Model__InteractionSpecAssignment_1 : ( ruleInteractionSpec ) ;
    public final void rule__Model__InteractionSpecAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6727:1: ( ( ruleInteractionSpec ) )
            // InternalMyDsl.g:6728:2: ( ruleInteractionSpec )
            {
            // InternalMyDsl.g:6728:2: ( ruleInteractionSpec )
            // InternalMyDsl.g:6729:3: ruleInteractionSpec
            {
             before(grammarAccess.getModelAccess().getInteractionSpecInteractionSpecParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInteractionSpec();

            state._fsp--;

             after(grammarAccess.getModelAccess().getInteractionSpecInteractionSpecParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__InteractionSpecAssignment_1"


    // $ANTLR start "rule__Model__ArchSpecAssignment_2"
    // InternalMyDsl.g:6738:1: rule__Model__ArchSpecAssignment_2 : ( ruleArchSpec ) ;
    public final void rule__Model__ArchSpecAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6742:1: ( ( ruleArchSpec ) )
            // InternalMyDsl.g:6743:2: ( ruleArchSpec )
            {
            // InternalMyDsl.g:6743:2: ( ruleArchSpec )
            // InternalMyDsl.g:6744:3: ruleArchSpec
            {
             before(grammarAccess.getModelAccess().getArchSpecArchSpecParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleArchSpec();

            state._fsp--;

             after(grammarAccess.getModelAccess().getArchSpecArchSpecParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ArchSpecAssignment_2"


    // $ANTLR start "rule__Model__NetworkSpecAssignment_3"
    // InternalMyDsl.g:6753:1: rule__Model__NetworkSpecAssignment_3 : ( ruleDeploymentSpec ) ;
    public final void rule__Model__NetworkSpecAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6757:1: ( ( ruleDeploymentSpec ) )
            // InternalMyDsl.g:6758:2: ( ruleDeploymentSpec )
            {
            // InternalMyDsl.g:6758:2: ( ruleDeploymentSpec )
            // InternalMyDsl.g:6759:3: ruleDeploymentSpec
            {
             before(grammarAccess.getModelAccess().getNetworkSpecDeploymentSpecParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDeploymentSpec();

            state._fsp--;

             after(grammarAccess.getModelAccess().getNetworkSpecDeploymentSpecParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NetworkSpecAssignment_3"


    // $ANTLR start "rule__DeploymentSpec__DevicesAssignment_1"
    // InternalMyDsl.g:6768:1: rule__DeploymentSpec__DevicesAssignment_1 : ( ruleDevice ) ;
    public final void rule__DeploymentSpec__DevicesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6772:1: ( ( ruleDevice ) )
            // InternalMyDsl.g:6773:2: ( ruleDevice )
            {
            // InternalMyDsl.g:6773:2: ( ruleDevice )
            // InternalMyDsl.g:6774:3: ruleDevice
            {
             before(grammarAccess.getDeploymentSpecAccess().getDevicesDeviceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getDeploymentSpecAccess().getDevicesDeviceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeploymentSpec__DevicesAssignment_1"


    // $ANTLR start "rule__Device__DeviceNameAssignment_0"
    // InternalMyDsl.g:6783:1: rule__Device__DeviceNameAssignment_0 : ( ruleDeviceEntityName ) ;
    public final void rule__Device__DeviceNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6787:1: ( ( ruleDeviceEntityName ) )
            // InternalMyDsl.g:6788:2: ( ruleDeviceEntityName )
            {
            // InternalMyDsl.g:6788:2: ( ruleDeviceEntityName )
            // InternalMyDsl.g:6789:3: ruleDeviceEntityName
            {
             before(grammarAccess.getDeviceAccess().getDeviceNameDeviceEntityNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDeviceEntityName();

            state._fsp--;

             after(grammarAccess.getDeviceAccess().getDeviceNameDeviceEntityNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__DeviceNameAssignment_0"


    // $ANTLR start "rule__Device__DeviceLocationAssignment_3"
    // InternalMyDsl.g:6798:1: rule__Device__DeviceLocationAssignment_3 : ( ruleDeviceLocation ) ;
    public final void rule__Device__DeviceLocationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6802:1: ( ( ruleDeviceLocation ) )
            // InternalMyDsl.g:6803:2: ( ruleDeviceLocation )
            {
            // InternalMyDsl.g:6803:2: ( ruleDeviceLocation )
            // InternalMyDsl.g:6804:3: ruleDeviceLocation
            {
             before(grammarAccess.getDeviceAccess().getDeviceLocationDeviceLocationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDeviceLocation();

            state._fsp--;

             after(grammarAccess.getDeviceAccess().getDeviceLocationDeviceLocationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__DeviceLocationAssignment_3"


    // $ANTLR start "rule__Device__PlatformTypeAssignment_6"
    // InternalMyDsl.g:6813:1: rule__Device__PlatformTypeAssignment_6 : ( rulePlatformType ) ;
    public final void rule__Device__PlatformTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6817:1: ( ( rulePlatformType ) )
            // InternalMyDsl.g:6818:2: ( rulePlatformType )
            {
            // InternalMyDsl.g:6818:2: ( rulePlatformType )
            // InternalMyDsl.g:6819:3: rulePlatformType
            {
             before(grammarAccess.getDeviceAccess().getPlatformTypePlatformTypeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePlatformType();

            state._fsp--;

             after(grammarAccess.getDeviceAccess().getPlatformTypePlatformTypeParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__PlatformTypeAssignment_6"


    // $ANTLR start "rule__Device__DeviceAbilitiesAssignment_9"
    // InternalMyDsl.g:6828:1: rule__Device__DeviceAbilitiesAssignment_9 : ( ruleDeviceAbilities ) ;
    public final void rule__Device__DeviceAbilitiesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6832:1: ( ( ruleDeviceAbilities ) )
            // InternalMyDsl.g:6833:2: ( ruleDeviceAbilities )
            {
            // InternalMyDsl.g:6833:2: ( ruleDeviceAbilities )
            // InternalMyDsl.g:6834:3: ruleDeviceAbilities
            {
             before(grammarAccess.getDeviceAccess().getDeviceAbilitiesDeviceAbilitiesParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleDeviceAbilities();

            state._fsp--;

             after(grammarAccess.getDeviceAccess().getDeviceAbilitiesDeviceAbilitiesParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__DeviceAbilitiesAssignment_9"


    // $ANTLR start "rule__Device__DeviceProtocolAssignment_12"
    // InternalMyDsl.g:6843:1: rule__Device__DeviceProtocolAssignment_12 : ( ruleDeviceProtocol ) ;
    public final void rule__Device__DeviceProtocolAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6847:1: ( ( ruleDeviceProtocol ) )
            // InternalMyDsl.g:6848:2: ( ruleDeviceProtocol )
            {
            // InternalMyDsl.g:6848:2: ( ruleDeviceProtocol )
            // InternalMyDsl.g:6849:3: ruleDeviceProtocol
            {
             before(grammarAccess.getDeviceAccess().getDeviceProtocolDeviceProtocolParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleDeviceProtocol();

            state._fsp--;

             after(grammarAccess.getDeviceAccess().getDeviceProtocolDeviceProtocolParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__DeviceProtocolAssignment_12"


    // $ANTLR start "rule__Device__DatabaseNameAssignment_14_1"
    // InternalMyDsl.g:6858:1: rule__Device__DatabaseNameAssignment_14_1 : ( ruleDatabaseName ) ;
    public final void rule__Device__DatabaseNameAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6862:1: ( ( ruleDatabaseName ) )
            // InternalMyDsl.g:6863:2: ( ruleDatabaseName )
            {
            // InternalMyDsl.g:6863:2: ( ruleDatabaseName )
            // InternalMyDsl.g:6864:3: ruleDatabaseName
            {
             before(grammarAccess.getDeviceAccess().getDatabaseNameDatabaseNameParserRuleCall_14_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDatabaseName();

            state._fsp--;

             after(grammarAccess.getDeviceAccess().getDatabaseNameDatabaseNameParserRuleCall_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__DatabaseNameAssignment_14_1"


    // $ANTLR start "rule__DeviceLocation__RegionLabelAssignment_0"
    // InternalMyDsl.g:6873:1: rule__DeviceLocation__RegionLabelAssignment_0 : ( RULE_ID ) ;
    public final void rule__DeviceLocation__RegionLabelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6877:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6878:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6878:2: ( RULE_ID )
            // InternalMyDsl.g:6879:3: RULE_ID
            {
             before(grammarAccess.getDeviceLocationAccess().getRegionLabelIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeviceLocationAccess().getRegionLabelIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceLocation__RegionLabelAssignment_0"


    // $ANTLR start "rule__DeviceLocation__RegionValueAssignment_2"
    // InternalMyDsl.g:6888:1: rule__DeviceLocation__RegionValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__DeviceLocation__RegionValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6892:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:6893:2: ( RULE_INT )
            {
            // InternalMyDsl.g:6893:2: ( RULE_INT )
            // InternalMyDsl.g:6894:3: RULE_INT
            {
             before(grammarAccess.getDeviceLocationAccess().getRegionValueINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDeviceLocationAccess().getRegionValueINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceLocation__RegionValueAssignment_2"


    // $ANTLR start "rule__PlatformType__DeviceTypeAssignment_0"
    // InternalMyDsl.g:6903:1: rule__PlatformType__DeviceTypeAssignment_0 : ( ( 'JavaSE' ) ) ;
    public final void rule__PlatformType__DeviceTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6907:1: ( ( ( 'JavaSE' ) ) )
            // InternalMyDsl.g:6908:2: ( ( 'JavaSE' ) )
            {
            // InternalMyDsl.g:6908:2: ( ( 'JavaSE' ) )
            // InternalMyDsl.g:6909:3: ( 'JavaSE' )
            {
             before(grammarAccess.getPlatformTypeAccess().getDeviceTypeJavaSEKeyword_0_0()); 
            // InternalMyDsl.g:6910:3: ( 'JavaSE' )
            // InternalMyDsl.g:6911:4: 'JavaSE'
            {
             before(grammarAccess.getPlatformTypeAccess().getDeviceTypeJavaSEKeyword_0_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getPlatformTypeAccess().getDeviceTypeJavaSEKeyword_0_0()); 

            }

             after(grammarAccess.getPlatformTypeAccess().getDeviceTypeJavaSEKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformType__DeviceTypeAssignment_0"


    // $ANTLR start "rule__PlatformType__DeviceTypeAssignment_1"
    // InternalMyDsl.g:6922:1: rule__PlatformType__DeviceTypeAssignment_1 : ( ( 'Android' ) ) ;
    public final void rule__PlatformType__DeviceTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6926:1: ( ( ( 'Android' ) ) )
            // InternalMyDsl.g:6927:2: ( ( 'Android' ) )
            {
            // InternalMyDsl.g:6927:2: ( ( 'Android' ) )
            // InternalMyDsl.g:6928:3: ( 'Android' )
            {
             before(grammarAccess.getPlatformTypeAccess().getDeviceTypeAndroidKeyword_1_0()); 
            // InternalMyDsl.g:6929:3: ( 'Android' )
            // InternalMyDsl.g:6930:4: 'Android'
            {
             before(grammarAccess.getPlatformTypeAccess().getDeviceTypeAndroidKeyword_1_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getPlatformTypeAccess().getDeviceTypeAndroidKeyword_1_0()); 

            }

             after(grammarAccess.getPlatformTypeAccess().getDeviceTypeAndroidKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformType__DeviceTypeAssignment_1"


    // $ANTLR start "rule__PlatformType__DeviceTypeAssignment_2"
    // InternalMyDsl.g:6941:1: rule__PlatformType__DeviceTypeAssignment_2 : ( ( 'NodeJS' ) ) ;
    public final void rule__PlatformType__DeviceTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6945:1: ( ( ( 'NodeJS' ) ) )
            // InternalMyDsl.g:6946:2: ( ( 'NodeJS' ) )
            {
            // InternalMyDsl.g:6946:2: ( ( 'NodeJS' ) )
            // InternalMyDsl.g:6947:3: ( 'NodeJS' )
            {
             before(grammarAccess.getPlatformTypeAccess().getDeviceTypeNodeJSKeyword_2_0()); 
            // InternalMyDsl.g:6948:3: ( 'NodeJS' )
            // InternalMyDsl.g:6949:4: 'NodeJS'
            {
             before(grammarAccess.getPlatformTypeAccess().getDeviceTypeNodeJSKeyword_2_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getPlatformTypeAccess().getDeviceTypeNodeJSKeyword_2_0()); 

            }

             after(grammarAccess.getPlatformTypeAccess().getDeviceTypeNodeJSKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformType__DeviceTypeAssignment_2"


    // $ANTLR start "rule__DatabaseName__InstalledDatabaseAssignment_0"
    // InternalMyDsl.g:6960:1: rule__DatabaseName__InstalledDatabaseAssignment_0 : ( ( 'MySQL' ) ) ;
    public final void rule__DatabaseName__InstalledDatabaseAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6964:1: ( ( ( 'MySQL' ) ) )
            // InternalMyDsl.g:6965:2: ( ( 'MySQL' ) )
            {
            // InternalMyDsl.g:6965:2: ( ( 'MySQL' ) )
            // InternalMyDsl.g:6966:3: ( 'MySQL' )
            {
             before(grammarAccess.getDatabaseNameAccess().getInstalledDatabaseMySQLKeyword_0_0()); 
            // InternalMyDsl.g:6967:3: ( 'MySQL' )
            // InternalMyDsl.g:6968:4: 'MySQL'
            {
             before(grammarAccess.getDatabaseNameAccess().getInstalledDatabaseMySQLKeyword_0_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getDatabaseNameAccess().getInstalledDatabaseMySQLKeyword_0_0()); 

            }

             after(grammarAccess.getDatabaseNameAccess().getInstalledDatabaseMySQLKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseName__InstalledDatabaseAssignment_0"


    // $ANTLR start "rule__DatabaseName__InstalledDatabaseAssignment_1"
    // InternalMyDsl.g:6979:1: rule__DatabaseName__InstalledDatabaseAssignment_1 : ( ( 'SQLAzure' ) ) ;
    public final void rule__DatabaseName__InstalledDatabaseAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6983:1: ( ( ( 'SQLAzure' ) ) )
            // InternalMyDsl.g:6984:2: ( ( 'SQLAzure' ) )
            {
            // InternalMyDsl.g:6984:2: ( ( 'SQLAzure' ) )
            // InternalMyDsl.g:6985:3: ( 'SQLAzure' )
            {
             before(grammarAccess.getDatabaseNameAccess().getInstalledDatabaseSQLAzureKeyword_1_0()); 
            // InternalMyDsl.g:6986:3: ( 'SQLAzure' )
            // InternalMyDsl.g:6987:4: 'SQLAzure'
            {
             before(grammarAccess.getDatabaseNameAccess().getInstalledDatabaseSQLAzureKeyword_1_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getDatabaseNameAccess().getInstalledDatabaseSQLAzureKeyword_1_0()); 

            }

             after(grammarAccess.getDatabaseNameAccess().getInstalledDatabaseSQLAzureKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseName__InstalledDatabaseAssignment_1"


    // $ANTLR start "rule__DatabaseName__InstalledDatabaseAssignment_2"
    // InternalMyDsl.g:6998:1: rule__DatabaseName__InstalledDatabaseAssignment_2 : ( ( 'MongoDB' ) ) ;
    public final void rule__DatabaseName__InstalledDatabaseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7002:1: ( ( ( 'MongoDB' ) ) )
            // InternalMyDsl.g:7003:2: ( ( 'MongoDB' ) )
            {
            // InternalMyDsl.g:7003:2: ( ( 'MongoDB' ) )
            // InternalMyDsl.g:7004:3: ( 'MongoDB' )
            {
             before(grammarAccess.getDatabaseNameAccess().getInstalledDatabaseMongoDBKeyword_2_0()); 
            // InternalMyDsl.g:7005:3: ( 'MongoDB' )
            // InternalMyDsl.g:7006:4: 'MongoDB'
            {
             before(grammarAccess.getDatabaseNameAccess().getInstalledDatabaseMongoDBKeyword_2_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getDatabaseNameAccess().getInstalledDatabaseMongoDBKeyword_2_0()); 

            }

             after(grammarAccess.getDatabaseNameAccess().getInstalledDatabaseMongoDBKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseName__InstalledDatabaseAssignment_2"


    // $ANTLR start "rule__DeviceProtocol__ProtocolNameAssignment"
    // InternalMyDsl.g:7017:1: rule__DeviceProtocol__ProtocolNameAssignment : ( ( 'mqtt' ) ) ;
    public final void rule__DeviceProtocol__ProtocolNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7021:1: ( ( ( 'mqtt' ) ) )
            // InternalMyDsl.g:7022:2: ( ( 'mqtt' ) )
            {
            // InternalMyDsl.g:7022:2: ( ( 'mqtt' ) )
            // InternalMyDsl.g:7023:3: ( 'mqtt' )
            {
             before(grammarAccess.getDeviceProtocolAccess().getProtocolNameMqttKeyword_0()); 
            // InternalMyDsl.g:7024:3: ( 'mqtt' )
            // InternalMyDsl.g:7025:4: 'mqtt'
            {
             before(grammarAccess.getDeviceProtocolAccess().getProtocolNameMqttKeyword_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getDeviceProtocolAccess().getProtocolNameMqttKeyword_0()); 

            }

             after(grammarAccess.getDeviceProtocolAccess().getProtocolNameMqttKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProtocol__ProtocolNameAssignment"


    // $ANTLR start "rule__DeviceAbilities__DeviceEntityNameAssignment_0"
    // InternalMyDsl.g:7036:1: rule__DeviceAbilities__DeviceEntityNameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__DeviceAbilities__DeviceEntityNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7040:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:7041:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:7041:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:7042:3: ( RULE_ID )
            {
             before(grammarAccess.getDeviceAbilitiesAccess().getDeviceEntityNameEntityNameCrossReference_0_0()); 
            // InternalMyDsl.g:7043:3: ( RULE_ID )
            // InternalMyDsl.g:7044:4: RULE_ID
            {
             before(grammarAccess.getDeviceAbilitiesAccess().getDeviceEntityNameEntityNameIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeviceAbilitiesAccess().getDeviceEntityNameEntityNameIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getDeviceAbilitiesAccess().getDeviceEntityNameEntityNameCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceAbilities__DeviceEntityNameAssignment_0"


    // $ANTLR start "rule__DeviceAbilities__NameAssignment_1_1"
    // InternalMyDsl.g:7055:1: rule__DeviceAbilities__NameAssignment_1_1 : ( ruleDeviceAbilities ) ;
    public final void rule__DeviceAbilities__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7059:1: ( ( ruleDeviceAbilities ) )
            // InternalMyDsl.g:7060:2: ( ruleDeviceAbilities )
            {
            // InternalMyDsl.g:7060:2: ( ruleDeviceAbilities )
            // InternalMyDsl.g:7061:3: ruleDeviceAbilities
            {
             before(grammarAccess.getDeviceAbilitiesAccess().getNameDeviceAbilitiesParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDeviceAbilities();

            state._fsp--;

             after(grammarAccess.getDeviceAbilitiesAccess().getNameDeviceAbilitiesParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceAbilities__NameAssignment_1_1"


    // $ANTLR start "rule__InteractionSpec__StructsAssignment_0_1"
    // InternalMyDsl.g:7070:1: rule__InteractionSpec__StructsAssignment_0_1 : ( ruleStruct ) ;
    public final void rule__InteractionSpec__StructsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7074:1: ( ( ruleStruct ) )
            // InternalMyDsl.g:7075:2: ( ruleStruct )
            {
            // InternalMyDsl.g:7075:2: ( ruleStruct )
            // InternalMyDsl.g:7076:3: ruleStruct
            {
             before(grammarAccess.getInteractionSpecAccess().getStructsStructParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStruct();

            state._fsp--;

             after(grammarAccess.getInteractionSpecAccess().getStructsStructParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionSpec__StructsAssignment_0_1"


    // $ANTLR start "rule__InteractionSpec__InteractionNameAssignment_2_1"
    // InternalMyDsl.g:7085:1: rule__InteractionSpec__InteractionNameAssignment_2_1 : ( ruleInteractionName ) ;
    public final void rule__InteractionSpec__InteractionNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7089:1: ( ( ruleInteractionName ) )
            // InternalMyDsl.g:7090:2: ( ruleInteractionName )
            {
            // InternalMyDsl.g:7090:2: ( ruleInteractionName )
            // InternalMyDsl.g:7091:3: ruleInteractionName
            {
             before(grammarAccess.getInteractionSpecAccess().getInteractionNameInteractionNameParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInteractionName();

            state._fsp--;

             after(grammarAccess.getInteractionSpecAccess().getInteractionNameInteractionNameParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionSpec__InteractionNameAssignment_2_1"


    // $ANTLR start "rule__InteractionName__InteractionNameAssignment_0"
    // InternalMyDsl.g:7100:1: rule__InteractionName__InteractionNameAssignment_0 : ( ruleEntityName ) ;
    public final void rule__InteractionName__InteractionNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7104:1: ( ( ruleEntityName ) )
            // InternalMyDsl.g:7105:2: ( ruleEntityName )
            {
            // InternalMyDsl.g:7105:2: ( ruleEntityName )
            // InternalMyDsl.g:7106:3: ruleEntityName
            {
             before(grammarAccess.getInteractionNameAccess().getInteractionNameEntityNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityName();

            state._fsp--;

             after(grammarAccess.getInteractionNameAccess().getInteractionNameEntityNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionName__InteractionNameAssignment_0"


    // $ANTLR start "rule__InteractionName__InteractionCommandAssignment_1"
    // InternalMyDsl.g:7115:1: rule__InteractionName__InteractionCommandAssignment_1 : ( ruleCommand ) ;
    public final void rule__InteractionName__InteractionCommandAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7119:1: ( ( ruleCommand ) )
            // InternalMyDsl.g:7120:2: ( ruleCommand )
            {
            // InternalMyDsl.g:7120:2: ( ruleCommand )
            // InternalMyDsl.g:7121:3: ruleCommand
            {
             before(grammarAccess.getInteractionNameAccess().getInteractionCommandCommandParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getInteractionNameAccess().getInteractionCommandCommandParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionName__InteractionCommandAssignment_1"


    // $ANTLR start "rule__InteractionName__InteractionRequestAssignment_2"
    // InternalMyDsl.g:7130:1: rule__InteractionName__InteractionRequestAssignment_2 : ( ruleRequest ) ;
    public final void rule__InteractionName__InteractionRequestAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7134:1: ( ( ruleRequest ) )
            // InternalMyDsl.g:7135:2: ( ruleRequest )
            {
            // InternalMyDsl.g:7135:2: ( ruleRequest )
            // InternalMyDsl.g:7136:3: ruleRequest
            {
             before(grammarAccess.getInteractionNameAccess().getInteractionRequestRequestParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRequest();

            state._fsp--;

             after(grammarAccess.getInteractionNameAccess().getInteractionRequestRequestParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionName__InteractionRequestAssignment_2"


    // $ANTLR start "rule__InteractionName__InteractionNotifyAssignment_3"
    // InternalMyDsl.g:7145:1: rule__InteractionName__InteractionNotifyAssignment_3 : ( ruleInteractionAction ) ;
    public final void rule__InteractionName__InteractionNotifyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7149:1: ( ( ruleInteractionAction ) )
            // InternalMyDsl.g:7150:2: ( ruleInteractionAction )
            {
            // InternalMyDsl.g:7150:2: ( ruleInteractionAction )
            // InternalMyDsl.g:7151:3: ruleInteractionAction
            {
             before(grammarAccess.getInteractionNameAccess().getInteractionNotifyInteractionActionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInteractionAction();

            state._fsp--;

             after(grammarAccess.getInteractionNameAccess().getInteractionNotifyInteractionActionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionName__InteractionNotifyAssignment_3"


    // $ANTLR start "rule__InteractionAction__ActionNameAssignment_1"
    // InternalMyDsl.g:7160:1: rule__InteractionAction__ActionNameAssignment_1 : ( ruleActionName ) ;
    public final void rule__InteractionAction__ActionNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7164:1: ( ( ruleActionName ) )
            // InternalMyDsl.g:7165:2: ( ruleActionName )
            {
            // InternalMyDsl.g:7165:2: ( ruleActionName )
            // InternalMyDsl.g:7166:3: ruleActionName
            {
             before(grammarAccess.getInteractionActionAccess().getActionNameActionNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActionName();

            state._fsp--;

             after(grammarAccess.getInteractionActionAccess().getActionNameActionNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionAction__ActionNameAssignment_1"


    // $ANTLR start "rule__InteractionAction__ParametersAssignment_3"
    // InternalMyDsl.g:7175:1: rule__InteractionAction__ParametersAssignment_3 : ( ruleParameters ) ;
    public final void rule__InteractionAction__ParametersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7179:1: ( ( ruleParameters ) )
            // InternalMyDsl.g:7180:2: ( ruleParameters )
            {
            // InternalMyDsl.g:7180:2: ( ruleParameters )
            // InternalMyDsl.g:7181:3: ruleParameters
            {
             before(grammarAccess.getInteractionActionAccess().getParametersParametersParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleParameters();

            state._fsp--;

             after(grammarAccess.getInteractionActionAccess().getParametersParametersParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionAction__ParametersAssignment_3"


    // $ANTLR start "rule__InteractionAction__InteractionEntityAssignment_6"
    // InternalMyDsl.g:7190:1: rule__InteractionAction__InteractionEntityAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__InteractionAction__InteractionEntityAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7194:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:7195:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:7195:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:7196:3: ( RULE_ID )
            {
             before(grammarAccess.getInteractionActionAccess().getInteractionEntityEntityNameCrossReference_6_0()); 
            // InternalMyDsl.g:7197:3: ( RULE_ID )
            // InternalMyDsl.g:7198:4: RULE_ID
            {
             before(grammarAccess.getInteractionActionAccess().getInteractionEntityEntityNameIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInteractionActionAccess().getInteractionEntityEntityNameIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getInteractionActionAccess().getInteractionEntityEntityNameCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionAction__InteractionEntityAssignment_6"


    // $ANTLR start "rule__ArchSpec__StructsAssignment_0_1"
    // InternalMyDsl.g:7209:1: rule__ArchSpec__StructsAssignment_0_1 : ( ruleStruct ) ;
    public final void rule__ArchSpec__StructsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7213:1: ( ( ruleStruct ) )
            // InternalMyDsl.g:7214:2: ( ruleStruct )
            {
            // InternalMyDsl.g:7214:2: ( ruleStruct )
            // InternalMyDsl.g:7215:3: ruleStruct
            {
             before(grammarAccess.getArchSpecAccess().getStructsStructParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStruct();

            state._fsp--;

             after(grammarAccess.getArchSpecAccess().getStructsStructParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchSpec__StructsAssignment_0_1"


    // $ANTLR start "rule__ArchSpec__InbuiltComputationalServiceAssignment_2_1"
    // InternalMyDsl.g:7224:1: rule__ArchSpec__InbuiltComputationalServiceAssignment_2_1 : ( ruleInBuiltComputationalService ) ;
    public final void rule__ArchSpec__InbuiltComputationalServiceAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7228:1: ( ( ruleInBuiltComputationalService ) )
            // InternalMyDsl.g:7229:2: ( ruleInBuiltComputationalService )
            {
            // InternalMyDsl.g:7229:2: ( ruleInBuiltComputationalService )
            // InternalMyDsl.g:7230:3: ruleInBuiltComputationalService
            {
             before(grammarAccess.getArchSpecAccess().getInbuiltComputationalServiceInBuiltComputationalServiceParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInBuiltComputationalService();

            state._fsp--;

             after(grammarAccess.getArchSpecAccess().getInbuiltComputationalServiceInBuiltComputationalServiceParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchSpec__InbuiltComputationalServiceAssignment_2_1"


    // $ANTLR start "rule__ArchSpec__CustomComputationalServiceAssignment_3_1"
    // InternalMyDsl.g:7239:1: rule__ArchSpec__CustomComputationalServiceAssignment_3_1 : ( rulecustomComputationalService ) ;
    public final void rule__ArchSpec__CustomComputationalServiceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7243:1: ( ( rulecustomComputationalService ) )
            // InternalMyDsl.g:7244:2: ( rulecustomComputationalService )
            {
            // InternalMyDsl.g:7244:2: ( rulecustomComputationalService )
            // InternalMyDsl.g:7245:3: rulecustomComputationalService
            {
             before(grammarAccess.getArchSpecAccess().getCustomComputationalServiceCustomComputationalServiceParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulecustomComputationalService();

            state._fsp--;

             after(grammarAccess.getArchSpecAccess().getCustomComputationalServiceCustomComputationalServiceParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchSpec__CustomComputationalServiceAssignment_3_1"


    // $ANTLR start "rule__InBuiltComputationalService__InBuiltComputationalServiceNameAssignment_0"
    // InternalMyDsl.g:7254:1: rule__InBuiltComputationalService__InBuiltComputationalServiceNameAssignment_0 : ( ruleEntityName ) ;
    public final void rule__InBuiltComputationalService__InBuiltComputationalServiceNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7258:1: ( ( ruleEntityName ) )
            // InternalMyDsl.g:7259:2: ( ruleEntityName )
            {
            // InternalMyDsl.g:7259:2: ( ruleEntityName )
            // InternalMyDsl.g:7260:3: ruleEntityName
            {
             before(grammarAccess.getInBuiltComputationalServiceAccess().getInBuiltComputationalServiceNameEntityNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityName();

            state._fsp--;

             after(grammarAccess.getInBuiltComputationalServiceAccess().getInBuiltComputationalServiceNameEntityNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InBuiltComputationalService__InBuiltComputationalServiceNameAssignment_0"


    // $ANTLR start "rule__InBuiltComputationalService__ConsumesAssignment_1"
    // InternalMyDsl.g:7269:1: rule__InBuiltComputationalService__ConsumesAssignment_1 : ( ruleConsumeForInBuilt ) ;
    public final void rule__InBuiltComputationalService__ConsumesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7273:1: ( ( ruleConsumeForInBuilt ) )
            // InternalMyDsl.g:7274:2: ( ruleConsumeForInBuilt )
            {
            // InternalMyDsl.g:7274:2: ( ruleConsumeForInBuilt )
            // InternalMyDsl.g:7275:3: ruleConsumeForInBuilt
            {
             before(grammarAccess.getInBuiltComputationalServiceAccess().getConsumesConsumeForInBuiltParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConsumeForInBuilt();

            state._fsp--;

             after(grammarAccess.getInBuiltComputationalServiceAccess().getConsumesConsumeForInBuiltParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InBuiltComputationalService__ConsumesAssignment_1"


    // $ANTLR start "rule__InBuiltComputationalService__ComputeInfoAssignment_2"
    // InternalMyDsl.g:7284:1: rule__InBuiltComputationalService__ComputeInfoAssignment_2 : ( ruleComputeInfoForInBuilt ) ;
    public final void rule__InBuiltComputationalService__ComputeInfoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7288:1: ( ( ruleComputeInfoForInBuilt ) )
            // InternalMyDsl.g:7289:2: ( ruleComputeInfoForInBuilt )
            {
            // InternalMyDsl.g:7289:2: ( ruleComputeInfoForInBuilt )
            // InternalMyDsl.g:7290:3: ruleComputeInfoForInBuilt
            {
             before(grammarAccess.getInBuiltComputationalServiceAccess().getComputeInfoComputeInfoForInBuiltParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComputeInfoForInBuilt();

            state._fsp--;

             after(grammarAccess.getInBuiltComputationalServiceAccess().getComputeInfoComputeInfoForInBuiltParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InBuiltComputationalService__ComputeInfoAssignment_2"


    // $ANTLR start "rule__InBuiltComputationalService__GenerateInfoAssignment_3"
    // InternalMyDsl.g:7299:1: rule__InBuiltComputationalService__GenerateInfoAssignment_3 : ( ruleGenerate ) ;
    public final void rule__InBuiltComputationalService__GenerateInfoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7303:1: ( ( ruleGenerate ) )
            // InternalMyDsl.g:7304:2: ( ruleGenerate )
            {
            // InternalMyDsl.g:7304:2: ( ruleGenerate )
            // InternalMyDsl.g:7305:3: ruleGenerate
            {
             before(grammarAccess.getInBuiltComputationalServiceAccess().getGenerateInfoGenerateParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGenerate();

            state._fsp--;

             after(grammarAccess.getInBuiltComputationalServiceAccess().getGenerateInfoGenerateParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InBuiltComputationalService__GenerateInfoAssignment_3"


    // $ANTLR start "rule__CustomComputationalService__CustomComputationalServiceNameAssignment_0"
    // InternalMyDsl.g:7314:1: rule__CustomComputationalService__CustomComputationalServiceNameAssignment_0 : ( ruleEntityName ) ;
    public final void rule__CustomComputationalService__CustomComputationalServiceNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7318:1: ( ( ruleEntityName ) )
            // InternalMyDsl.g:7319:2: ( ruleEntityName )
            {
            // InternalMyDsl.g:7319:2: ( ruleEntityName )
            // InternalMyDsl.g:7320:3: ruleEntityName
            {
             before(grammarAccess.getCustomComputationalServiceAccess().getCustomComputationalServiceNameEntityNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityName();

            state._fsp--;

             after(grammarAccess.getCustomComputationalServiceAccess().getCustomComputationalServiceNameEntityNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomComputationalService__CustomComputationalServiceNameAssignment_0"


    // $ANTLR start "rule__CustomComputationalService__ConsumesAssignment_1"
    // InternalMyDsl.g:7329:1: rule__CustomComputationalService__ConsumesAssignment_1 : ( ruleConsume ) ;
    public final void rule__CustomComputationalService__ConsumesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7333:1: ( ( ruleConsume ) )
            // InternalMyDsl.g:7334:2: ( ruleConsume )
            {
            // InternalMyDsl.g:7334:2: ( ruleConsume )
            // InternalMyDsl.g:7335:3: ruleConsume
            {
             before(grammarAccess.getCustomComputationalServiceAccess().getConsumesConsumeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConsume();

            state._fsp--;

             after(grammarAccess.getCustomComputationalServiceAccess().getConsumesConsumeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomComputationalService__ConsumesAssignment_1"


    // $ANTLR start "rule__CustomComputationalService__RequestsAssignment_2"
    // InternalMyDsl.g:7344:1: rule__CustomComputationalService__RequestsAssignment_2 : ( ruleRequest ) ;
    public final void rule__CustomComputationalService__RequestsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7348:1: ( ( ruleRequest ) )
            // InternalMyDsl.g:7349:2: ( ruleRequest )
            {
            // InternalMyDsl.g:7349:2: ( ruleRequest )
            // InternalMyDsl.g:7350:3: ruleRequest
            {
             before(grammarAccess.getCustomComputationalServiceAccess().getRequestsRequestParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRequest();

            state._fsp--;

             after(grammarAccess.getCustomComputationalServiceAccess().getRequestsRequestParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomComputationalService__RequestsAssignment_2"


    // $ANTLR start "rule__CustomComputationalService__GenerateInfoAssignment_3"
    // InternalMyDsl.g:7359:1: rule__CustomComputationalService__GenerateInfoAssignment_3 : ( ruleGenerate ) ;
    public final void rule__CustomComputationalService__GenerateInfoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7363:1: ( ( ruleGenerate ) )
            // InternalMyDsl.g:7364:2: ( ruleGenerate )
            {
            // InternalMyDsl.g:7364:2: ( ruleGenerate )
            // InternalMyDsl.g:7365:3: ruleGenerate
            {
             before(grammarAccess.getCustomComputationalServiceAccess().getGenerateInfoGenerateParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGenerate();

            state._fsp--;

             after(grammarAccess.getCustomComputationalServiceAccess().getGenerateInfoGenerateParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomComputationalService__GenerateInfoAssignment_3"


    // $ANTLR start "rule__CustomComputationalService__CommandsAssignment_4"
    // InternalMyDsl.g:7374:1: rule__CustomComputationalService__CommandsAssignment_4 : ( ruleCommand ) ;
    public final void rule__CustomComputationalService__CommandsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7378:1: ( ( ruleCommand ) )
            // InternalMyDsl.g:7379:2: ( ruleCommand )
            {
            // InternalMyDsl.g:7379:2: ( ruleCommand )
            // InternalMyDsl.g:7380:3: ruleCommand
            {
             before(grammarAccess.getCustomComputationalServiceAccess().getCommandsCommandParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getCustomComputationalServiceAccess().getCommandsCommandParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomComputationalService__CommandsAssignment_4"


    // $ANTLR start "rule__Request__RequestnameAssignment_1"
    // InternalMyDsl.g:7389:1: rule__Request__RequestnameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Request__RequestnameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7393:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:7394:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:7394:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:7395:3: ( RULE_ID )
            {
             before(grammarAccess.getRequestAccess().getRequestnameSourceNameCrossReference_1_0()); 
            // InternalMyDsl.g:7396:3: ( RULE_ID )
            // InternalMyDsl.g:7397:4: RULE_ID
            {
             before(grammarAccess.getRequestAccess().getRequestnameSourceNameIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRequestAccess().getRequestnameSourceNameIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRequestAccess().getRequestnameSourceNameCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__RequestnameAssignment_1"


    // $ANTLR start "rule__Request__StorageForRequestAssignment_3"
    // InternalMyDsl.g:7408:1: rule__Request__StorageForRequestAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Request__StorageForRequestAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7412:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:7413:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:7413:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:7414:3: ( RULE_ID )
            {
             before(grammarAccess.getRequestAccess().getStorageForRequestEntityNameCrossReference_3_0()); 
            // InternalMyDsl.g:7415:3: ( RULE_ID )
            // InternalMyDsl.g:7416:4: RULE_ID
            {
             before(grammarAccess.getRequestAccess().getStorageForRequestEntityNameIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRequestAccess().getStorageForRequestEntityNameIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRequestAccess().getStorageForRequestEntityNameCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__StorageForRequestAssignment_3"


    // $ANTLR start "rule__ConsumeForInBuilt__NameAssignment_1"
    // InternalMyDsl.g:7427:1: rule__ConsumeForInBuilt__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ConsumeForInBuilt__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7431:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:7432:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:7432:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:7433:3: ( RULE_ID )
            {
             before(grammarAccess.getConsumeForInBuiltAccess().getNameSourceNameCrossReference_1_0()); 
            // InternalMyDsl.g:7434:3: ( RULE_ID )
            // InternalMyDsl.g:7435:4: RULE_ID
            {
             before(grammarAccess.getConsumeForInBuiltAccess().getNameSourceNameIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConsumeForInBuiltAccess().getNameSourceNameIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getConsumeForInBuiltAccess().getNameSourceNameCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConsumeForInBuilt__NameAssignment_1"


    // $ANTLR start "rule__ConsumeForInBuilt__SensorForConsumeAssignment_3"
    // InternalMyDsl.g:7446:1: rule__ConsumeForInBuilt__SensorForConsumeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ConsumeForInBuilt__SensorForConsumeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7450:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:7451:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:7451:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:7452:3: ( RULE_ID )
            {
             before(grammarAccess.getConsumeForInBuiltAccess().getSensorForConsumeEntityNameCrossReference_3_0()); 
            // InternalMyDsl.g:7453:3: ( RULE_ID )
            // InternalMyDsl.g:7454:4: RULE_ID
            {
             before(grammarAccess.getConsumeForInBuiltAccess().getSensorForConsumeEntityNameIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConsumeForInBuiltAccess().getSensorForConsumeEntityNameIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getConsumeForInBuiltAccess().getSensorForConsumeEntityNameCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConsumeForInBuilt__SensorForConsumeAssignment_3"


    // $ANTLR start "rule__ComputeInfoForInBuilt__OperationNameAssignment_2"
    // InternalMyDsl.g:7465:1: rule__ComputeInfoForInBuilt__OperationNameAssignment_2 : ( ruleOperationName ) ;
    public final void rule__ComputeInfoForInBuilt__OperationNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7469:1: ( ( ruleOperationName ) )
            // InternalMyDsl.g:7470:2: ( ruleOperationName )
            {
            // InternalMyDsl.g:7470:2: ( ruleOperationName )
            // InternalMyDsl.g:7471:3: ruleOperationName
            {
             before(grammarAccess.getComputeInfoForInBuiltAccess().getOperationNameOperationNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationName();

            state._fsp--;

             after(grammarAccess.getComputeInfoForInBuiltAccess().getOperationNameOperationNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInfoForInBuilt__OperationNameAssignment_2"


    // $ANTLR start "rule__ComputeInfoForInBuilt__OperationParameterAssignment_3_1"
    // InternalMyDsl.g:7480:1: rule__ComputeInfoForInBuilt__OperationParameterAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__ComputeInfoForInBuilt__OperationParameterAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7484:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:7485:2: ( RULE_INT )
            {
            // InternalMyDsl.g:7485:2: ( RULE_INT )
            // InternalMyDsl.g:7486:3: RULE_INT
            {
             before(grammarAccess.getComputeInfoForInBuiltAccess().getOperationParameterINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getComputeInfoForInBuiltAccess().getOperationParameterINTTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputeInfoForInBuilt__OperationParameterAssignment_3_1"


    // $ANTLR start "rule__Consume__NameAssignment_1"
    // InternalMyDsl.g:7495:1: rule__Consume__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Consume__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7499:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:7500:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:7500:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:7501:3: ( RULE_ID )
            {
             before(grammarAccess.getConsumeAccess().getNameSourceNameCrossReference_1_0()); 
            // InternalMyDsl.g:7502:3: ( RULE_ID )
            // InternalMyDsl.g:7503:4: RULE_ID
            {
             before(grammarAccess.getConsumeAccess().getNameSourceNameIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConsumeAccess().getNameSourceNameIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getConsumeAccess().getNameSourceNameCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consume__NameAssignment_1"


    // $ANTLR start "rule__Consume__FromNameAssignment_3"
    // InternalMyDsl.g:7514:1: rule__Consume__FromNameAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Consume__FromNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7518:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:7519:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:7519:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:7520:3: ( RULE_ID )
            {
             before(grammarAccess.getConsumeAccess().getFromNameEntityNameCrossReference_3_0()); 
            // InternalMyDsl.g:7521:3: ( RULE_ID )
            // InternalMyDsl.g:7522:4: RULE_ID
            {
             before(grammarAccess.getConsumeAccess().getFromNameEntityNameIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConsumeAccess().getFromNameEntityNameIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getConsumeAccess().getFromNameEntityNameCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consume__FromNameAssignment_3"


    // $ANTLR start "rule__Command__CommandNameAssignment_1"
    // InternalMyDsl.g:7533:1: rule__Command__CommandNameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Command__CommandNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7537:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:7538:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:7538:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:7539:3: ( RULE_ID )
            {
             before(grammarAccess.getCommandAccess().getCommandNameActionNameCrossReference_1_0()); 
            // InternalMyDsl.g:7540:3: ( RULE_ID )
            // InternalMyDsl.g:7541:4: RULE_ID
            {
             before(grammarAccess.getCommandAccess().getCommandNameActionNameIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCommandAccess().getCommandNameActionNameIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCommandAccess().getCommandNameActionNameCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__CommandNameAssignment_1"


    // $ANTLR start "rule__Command__CommandparameterAssignment_3"
    // InternalMyDsl.g:7552:1: rule__Command__CommandparameterAssignment_3 : ( ruleCommandParameter ) ;
    public final void rule__Command__CommandparameterAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7556:1: ( ( ruleCommandParameter ) )
            // InternalMyDsl.g:7557:2: ( ruleCommandParameter )
            {
            // InternalMyDsl.g:7557:2: ( ruleCommandParameter )
            // InternalMyDsl.g:7558:3: ruleCommandParameter
            {
             before(grammarAccess.getCommandAccess().getCommandparameterCommandParameterParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCommandParameter();

            state._fsp--;

             after(grammarAccess.getCommandAccess().getCommandparameterCommandParameterParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__CommandparameterAssignment_3"


    // $ANTLR start "rule__Command__ActuatorForCommandAssignment_6"
    // InternalMyDsl.g:7567:1: rule__Command__ActuatorForCommandAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Command__ActuatorForCommandAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7571:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:7572:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:7572:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:7573:3: ( RULE_ID )
            {
             before(grammarAccess.getCommandAccess().getActuatorForCommandEntityNameCrossReference_6_0()); 
            // InternalMyDsl.g:7574:3: ( RULE_ID )
            // InternalMyDsl.g:7575:4: RULE_ID
            {
             before(grammarAccess.getCommandAccess().getActuatorForCommandEntityNameIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCommandAccess().getActuatorForCommandEntityNameIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getCommandAccess().getActuatorForCommandEntityNameCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__ActuatorForCommandAssignment_6"


    // $ANTLR start "rule__CommandParameter__NameAssignment_0"
    // InternalMyDsl.g:7586:1: rule__CommandParameter__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__CommandParameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7590:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:7591:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:7591:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:7592:3: ( RULE_ID )
            {
             before(grammarAccess.getCommandParameterAccess().getNameParameterNameCrossReference_0_0()); 
            // InternalMyDsl.g:7593:3: ( RULE_ID )
            // InternalMyDsl.g:7594:4: RULE_ID
            {
             before(grammarAccess.getCommandParameterAccess().getNameParameterNameIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCommandParameterAccess().getNameParameterNameIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getCommandParameterAccess().getNameParameterNameCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandParameter__NameAssignment_0"


    // $ANTLR start "rule__CommandParameter__ParameterAssignment_1_1"
    // InternalMyDsl.g:7605:1: rule__CommandParameter__ParameterAssignment_1_1 : ( ruleCommandParameter ) ;
    public final void rule__CommandParameter__ParameterAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7609:1: ( ( ruleCommandParameter ) )
            // InternalMyDsl.g:7610:2: ( ruleCommandParameter )
            {
            // InternalMyDsl.g:7610:2: ( ruleCommandParameter )
            // InternalMyDsl.g:7611:3: ruleCommandParameter
            {
             before(grammarAccess.getCommandParameterAccess().getParameterCommandParameterParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCommandParameter();

            state._fsp--;

             after(grammarAccess.getCommandParameterAccess().getParameterCommandParameterParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandParameter__ParameterAssignment_1_1"


    // $ANTLR start "rule__VocSpec__StructsAssignment_1"
    // InternalMyDsl.g:7620:1: rule__VocSpec__StructsAssignment_1 : ( ruleStruct ) ;
    public final void rule__VocSpec__StructsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7624:1: ( ( ruleStruct ) )
            // InternalMyDsl.g:7625:2: ( ruleStruct )
            {
            // InternalMyDsl.g:7625:2: ( ruleStruct )
            // InternalMyDsl.g:7626:3: ruleStruct
            {
             before(grammarAccess.getVocSpecAccess().getStructsStructParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStruct();

            state._fsp--;

             after(grammarAccess.getVocSpecAccess().getStructsStructParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__StructsAssignment_1"


    // $ANTLR start "rule__VocSpec__PeriodicSensorsAssignment_4_1"
    // InternalMyDsl.g:7635:1: rule__VocSpec__PeriodicSensorsAssignment_4_1 : ( rulePeriodicSensors ) ;
    public final void rule__VocSpec__PeriodicSensorsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7639:1: ( ( rulePeriodicSensors ) )
            // InternalMyDsl.g:7640:2: ( rulePeriodicSensors )
            {
            // InternalMyDsl.g:7640:2: ( rulePeriodicSensors )
            // InternalMyDsl.g:7641:3: rulePeriodicSensors
            {
             before(grammarAccess.getVocSpecAccess().getPeriodicSensorsPeriodicSensorsParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            rulePeriodicSensors();

            state._fsp--;

             after(grammarAccess.getVocSpecAccess().getPeriodicSensorsPeriodicSensorsParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__PeriodicSensorsAssignment_4_1"


    // $ANTLR start "rule__VocSpec__EventSensorsAssignment_5_1"
    // InternalMyDsl.g:7650:1: rule__VocSpec__EventSensorsAssignment_5_1 : ( ruleEventSensors ) ;
    public final void rule__VocSpec__EventSensorsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7654:1: ( ( ruleEventSensors ) )
            // InternalMyDsl.g:7655:2: ( ruleEventSensors )
            {
            // InternalMyDsl.g:7655:2: ( ruleEventSensors )
            // InternalMyDsl.g:7656:3: ruleEventSensors
            {
             before(grammarAccess.getVocSpecAccess().getEventSensorsEventSensorsParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEventSensors();

            state._fsp--;

             after(grammarAccess.getVocSpecAccess().getEventSensorsEventSensorsParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__EventSensorsAssignment_5_1"


    // $ANTLR start "rule__VocSpec__RequestSensorsAssignment_6_1"
    // InternalMyDsl.g:7665:1: rule__VocSpec__RequestSensorsAssignment_6_1 : ( ruleRequestSensors ) ;
    public final void rule__VocSpec__RequestSensorsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7669:1: ( ( ruleRequestSensors ) )
            // InternalMyDsl.g:7670:2: ( ruleRequestSensors )
            {
            // InternalMyDsl.g:7670:2: ( ruleRequestSensors )
            // InternalMyDsl.g:7671:3: ruleRequestSensors
            {
             before(grammarAccess.getVocSpecAccess().getRequestSensorsRequestSensorsParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRequestSensors();

            state._fsp--;

             after(grammarAccess.getVocSpecAccess().getRequestSensorsRequestSensorsParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__RequestSensorsAssignment_6_1"


    // $ANTLR start "rule__VocSpec__TagsAssignment_7_1"
    // InternalMyDsl.g:7680:1: rule__VocSpec__TagsAssignment_7_1 : ( ruleTags ) ;
    public final void rule__VocSpec__TagsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7684:1: ( ( ruleTags ) )
            // InternalMyDsl.g:7685:2: ( ruleTags )
            {
            // InternalMyDsl.g:7685:2: ( ruleTags )
            // InternalMyDsl.g:7686:3: ruleTags
            {
             before(grammarAccess.getVocSpecAccess().getTagsTagsParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTags();

            state._fsp--;

             after(grammarAccess.getVocSpecAccess().getTagsTagsParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__TagsAssignment_7_1"


    // $ANTLR start "rule__VocSpec__ActuatorsAssignment_8_1"
    // InternalMyDsl.g:7695:1: rule__VocSpec__ActuatorsAssignment_8_1 : ( ruleActuator ) ;
    public final void rule__VocSpec__ActuatorsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7699:1: ( ( ruleActuator ) )
            // InternalMyDsl.g:7700:2: ( ruleActuator )
            {
            // InternalMyDsl.g:7700:2: ( ruleActuator )
            // InternalMyDsl.g:7701:3: ruleActuator
            {
             before(grammarAccess.getVocSpecAccess().getActuatorsActuatorParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActuator();

            state._fsp--;

             after(grammarAccess.getVocSpecAccess().getActuatorsActuatorParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__ActuatorsAssignment_8_1"


    // $ANTLR start "rule__VocSpec__StorageServiceAssignment_9_1"
    // InternalMyDsl.g:7710:1: rule__VocSpec__StorageServiceAssignment_9_1 : ( ruleStorageService ) ;
    public final void rule__VocSpec__StorageServiceAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7714:1: ( ( ruleStorageService ) )
            // InternalMyDsl.g:7715:2: ( ruleStorageService )
            {
            // InternalMyDsl.g:7715:2: ( ruleStorageService )
            // InternalMyDsl.g:7716:3: ruleStorageService
            {
             before(grammarAccess.getVocSpecAccess().getStorageServiceStorageServiceParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStorageService();

            state._fsp--;

             after(grammarAccess.getVocSpecAccess().getStorageServiceStorageServiceParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VocSpec__StorageServiceAssignment_9_1"


    // $ANTLR start "rule__Struct__NameAssignment_0"
    // InternalMyDsl.g:7725:1: rule__Struct__NameAssignment_0 : ( ruleStructEntityName ) ;
    public final void rule__Struct__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7729:1: ( ( ruleStructEntityName ) )
            // InternalMyDsl.g:7730:2: ( ruleStructEntityName )
            {
            // InternalMyDsl.g:7730:2: ( ruleStructEntityName )
            // InternalMyDsl.g:7731:3: ruleStructEntityName
            {
             before(grammarAccess.getStructAccess().getNameStructEntityNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStructEntityName();

            state._fsp--;

             after(grammarAccess.getStructAccess().getNameStructEntityNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct__NameAssignment_0"


    // $ANTLR start "rule__Struct__FieldsAssignment_1"
    // InternalMyDsl.g:7740:1: rule__Struct__FieldsAssignment_1 : ( ruleField ) ;
    public final void rule__Struct__FieldsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7744:1: ( ( ruleField ) )
            // InternalMyDsl.g:7745:2: ( ruleField )
            {
            // InternalMyDsl.g:7745:2: ( ruleField )
            // InternalMyDsl.g:7746:3: ruleField
            {
             before(grammarAccess.getStructAccess().getFieldsFieldParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getStructAccess().getFieldsFieldParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct__FieldsAssignment_1"


    // $ANTLR start "rule__Field__NameAssignment_0"
    // InternalMyDsl.g:7755:1: rule__Field__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7759:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7760:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7760:2: ( RULE_ID )
            // InternalMyDsl.g:7761:3: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__NameAssignment_0"


    // $ANTLR start "rule__Field__TypeAssignment_2"
    // InternalMyDsl.g:7770:1: rule__Field__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Field__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7774:1: ( ( ruleType ) )
            // InternalMyDsl.g:7775:2: ( ruleType )
            {
            // InternalMyDsl.g:7775:2: ( ruleType )
            // InternalMyDsl.g:7776:3: ruleType
            {
             before(grammarAccess.getFieldAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getTypeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__TypeAssignment_2"


    // $ANTLR start "rule__PeriodicSensors__SensorNameAssignment_0"
    // InternalMyDsl.g:7785:1: rule__PeriodicSensors__SensorNameAssignment_0 : ( ruleEntityName ) ;
    public final void rule__PeriodicSensors__SensorNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7789:1: ( ( ruleEntityName ) )
            // InternalMyDsl.g:7790:2: ( ruleEntityName )
            {
            // InternalMyDsl.g:7790:2: ( ruleEntityName )
            // InternalMyDsl.g:7791:3: ruleEntityName
            {
             before(grammarAccess.getPeriodicSensorsAccess().getSensorNameEntityNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityName();

            state._fsp--;

             after(grammarAccess.getPeriodicSensorsAccess().getSensorNameEntityNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicSensors__SensorNameAssignment_0"


    // $ANTLR start "rule__PeriodicSensors__GenerateInfoAssignment_1"
    // InternalMyDsl.g:7800:1: rule__PeriodicSensors__GenerateInfoAssignment_1 : ( ruleGenerate ) ;
    public final void rule__PeriodicSensors__GenerateInfoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7804:1: ( ( ruleGenerate ) )
            // InternalMyDsl.g:7805:2: ( ruleGenerate )
            {
            // InternalMyDsl.g:7805:2: ( ruleGenerate )
            // InternalMyDsl.g:7806:3: ruleGenerate
            {
             before(grammarAccess.getPeriodicSensorsAccess().getGenerateInfoGenerateParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGenerate();

            state._fsp--;

             after(grammarAccess.getPeriodicSensorsAccess().getGenerateInfoGenerateParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicSensors__GenerateInfoAssignment_1"


    // $ANTLR start "rule__PeriodicSensors__SampelingDefAssignment_2"
    // InternalMyDsl.g:7815:1: rule__PeriodicSensors__SampelingDefAssignment_2 : ( ruleSampelingDef ) ;
    public final void rule__PeriodicSensors__SampelingDefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7819:1: ( ( ruleSampelingDef ) )
            // InternalMyDsl.g:7820:2: ( ruleSampelingDef )
            {
            // InternalMyDsl.g:7820:2: ( ruleSampelingDef )
            // InternalMyDsl.g:7821:3: ruleSampelingDef
            {
             before(grammarAccess.getPeriodicSensorsAccess().getSampelingDefSampelingDefParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSampelingDef();

            state._fsp--;

             after(grammarAccess.getPeriodicSensorsAccess().getSampelingDefSampelingDefParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicSensors__SampelingDefAssignment_2"


    // $ANTLR start "rule__EventSensors__SensorNameAssignment_0"
    // InternalMyDsl.g:7830:1: rule__EventSensors__SensorNameAssignment_0 : ( ruleEntityName ) ;
    public final void rule__EventSensors__SensorNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7834:1: ( ( ruleEntityName ) )
            // InternalMyDsl.g:7835:2: ( ruleEntityName )
            {
            // InternalMyDsl.g:7835:2: ( ruleEntityName )
            // InternalMyDsl.g:7836:3: ruleEntityName
            {
             before(grammarAccess.getEventSensorsAccess().getSensorNameEntityNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityName();

            state._fsp--;

             after(grammarAccess.getEventSensorsAccess().getSensorNameEntityNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSensors__SensorNameAssignment_0"


    // $ANTLR start "rule__EventSensors__GenerateInfoAssignment_1"
    // InternalMyDsl.g:7845:1: rule__EventSensors__GenerateInfoAssignment_1 : ( ruleGenerate ) ;
    public final void rule__EventSensors__GenerateInfoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7849:1: ( ( ruleGenerate ) )
            // InternalMyDsl.g:7850:2: ( ruleGenerate )
            {
            // InternalMyDsl.g:7850:2: ( ruleGenerate )
            // InternalMyDsl.g:7851:3: ruleGenerate
            {
             before(grammarAccess.getEventSensorsAccess().getGenerateInfoGenerateParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGenerate();

            state._fsp--;

             after(grammarAccess.getEventSensorsAccess().getGenerateInfoGenerateParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSensors__GenerateInfoAssignment_1"


    // $ANTLR start "rule__EventSensors__OnConditionDefAssignment_2"
    // InternalMyDsl.g:7860:1: rule__EventSensors__OnConditionDefAssignment_2 : ( ruleOnConditionDef ) ;
    public final void rule__EventSensors__OnConditionDefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7864:1: ( ( ruleOnConditionDef ) )
            // InternalMyDsl.g:7865:2: ( ruleOnConditionDef )
            {
            // InternalMyDsl.g:7865:2: ( ruleOnConditionDef )
            // InternalMyDsl.g:7866:3: ruleOnConditionDef
            {
             before(grammarAccess.getEventSensorsAccess().getOnConditionDefOnConditionDefParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOnConditionDef();

            state._fsp--;

             after(grammarAccess.getEventSensorsAccess().getOnConditionDefOnConditionDefParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSensors__OnConditionDefAssignment_2"


    // $ANTLR start "rule__OnConditionDef__EventConditionsAssignment_1"
    // InternalMyDsl.g:7875:1: rule__OnConditionDef__EventConditionsAssignment_1 : ( ruleEventConditions ) ;
    public final void rule__OnConditionDef__EventConditionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7879:1: ( ( ruleEventConditions ) )
            // InternalMyDsl.g:7880:2: ( ruleEventConditions )
            {
            // InternalMyDsl.g:7880:2: ( ruleEventConditions )
            // InternalMyDsl.g:7881:3: ruleEventConditions
            {
             before(grammarAccess.getOnConditionDefAccess().getEventConditionsEventConditionsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEventConditions();

            state._fsp--;

             after(grammarAccess.getOnConditionDefAccess().getEventConditionsEventConditionsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnConditionDef__EventConditionsAssignment_1"


    // $ANTLR start "rule__RequestSensors__SensorNameAssignment_0"
    // InternalMyDsl.g:7890:1: rule__RequestSensors__SensorNameAssignment_0 : ( ruleEntityName ) ;
    public final void rule__RequestSensors__SensorNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7894:1: ( ( ruleEntityName ) )
            // InternalMyDsl.g:7895:2: ( ruleEntityName )
            {
            // InternalMyDsl.g:7895:2: ( ruleEntityName )
            // InternalMyDsl.g:7896:3: ruleEntityName
            {
             before(grammarAccess.getRequestSensorsAccess().getSensorNameEntityNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityName();

            state._fsp--;

             after(grammarAccess.getRequestSensorsAccess().getSensorNameEntityNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestSensors__SensorNameAssignment_0"


    // $ANTLR start "rule__RequestSensors__DataAccessAssignment_1"
    // InternalMyDsl.g:7905:1: rule__RequestSensors__DataAccessAssignment_1 : ( ruleDataAccessForRequestSensors ) ;
    public final void rule__RequestSensors__DataAccessAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7909:1: ( ( ruleDataAccessForRequestSensors ) )
            // InternalMyDsl.g:7910:2: ( ruleDataAccessForRequestSensors )
            {
            // InternalMyDsl.g:7910:2: ( ruleDataAccessForRequestSensors )
            // InternalMyDsl.g:7911:3: ruleDataAccessForRequestSensors
            {
             before(grammarAccess.getRequestSensorsAccess().getDataAccessDataAccessForRequestSensorsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataAccessForRequestSensors();

            state._fsp--;

             after(grammarAccess.getRequestSensorsAccess().getDataAccessDataAccessForRequestSensorsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestSensors__DataAccessAssignment_1"


    // $ANTLR start "rule__Tags__SensorNameAssignment_0"
    // InternalMyDsl.g:7920:1: rule__Tags__SensorNameAssignment_0 : ( ruleEntityName ) ;
    public final void rule__Tags__SensorNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7924:1: ( ( ruleEntityName ) )
            // InternalMyDsl.g:7925:2: ( ruleEntityName )
            {
            // InternalMyDsl.g:7925:2: ( ruleEntityName )
            // InternalMyDsl.g:7926:3: ruleEntityName
            {
             before(grammarAccess.getTagsAccess().getSensorNameEntityNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityName();

            state._fsp--;

             after(grammarAccess.getTagsAccess().getSensorNameEntityNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tags__SensorNameAssignment_0"


    // $ANTLR start "rule__Tags__GenerateInfoAssignment_1"
    // InternalMyDsl.g:7935:1: rule__Tags__GenerateInfoAssignment_1 : ( ruleGenerate ) ;
    public final void rule__Tags__GenerateInfoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7939:1: ( ( ruleGenerate ) )
            // InternalMyDsl.g:7940:2: ( ruleGenerate )
            {
            // InternalMyDsl.g:7940:2: ( ruleGenerate )
            // InternalMyDsl.g:7941:3: ruleGenerate
            {
             before(grammarAccess.getTagsAccess().getGenerateInfoGenerateParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGenerate();

            state._fsp--;

             after(grammarAccess.getTagsAccess().getGenerateInfoGenerateParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tags__GenerateInfoAssignment_1"


    // $ANTLR start "rule__EventConditions__NameAssignment_0"
    // InternalMyDsl.g:7950:1: rule__EventConditions__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EventConditions__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7954:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7955:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7955:2: ( RULE_ID )
            // InternalMyDsl.g:7956:3: RULE_ID
            {
             before(grammarAccess.getEventConditionsAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEventConditionsAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventConditions__NameAssignment_0"


    // $ANTLR start "rule__EventConditions__IntValueAssignment_2"
    // InternalMyDsl.g:7965:1: rule__EventConditions__IntValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__EventConditions__IntValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7969:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:7970:2: ( RULE_INT )
            {
            // InternalMyDsl.g:7970:2: ( RULE_INT )
            // InternalMyDsl.g:7971:3: RULE_INT
            {
             before(grammarAccess.getEventConditionsAccess().getIntValueINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEventConditionsAccess().getIntValueINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventConditions__IntValueAssignment_2"


    // $ANTLR start "rule__EventConditions__NameUnitAssignment_3"
    // InternalMyDsl.g:7980:1: rule__EventConditions__NameUnitAssignment_3 : ( ruleUnit ) ;
    public final void rule__EventConditions__NameUnitAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7984:1: ( ( ruleUnit ) )
            // InternalMyDsl.g:7985:2: ( ruleUnit )
            {
            // InternalMyDsl.g:7985:2: ( ruleUnit )
            // InternalMyDsl.g:7986:3: ruleUnit
            {
             before(grammarAccess.getEventConditionsAccess().getNameUnitUnitParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleUnit();

            state._fsp--;

             after(grammarAccess.getEventConditionsAccess().getNameUnitUnitParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventConditions__NameUnitAssignment_3"


    // $ANTLR start "rule__EventConditions__EventConditionsAssignment_4_1"
    // InternalMyDsl.g:7995:1: rule__EventConditions__EventConditionsAssignment_4_1 : ( ruleEventConditions ) ;
    public final void rule__EventConditions__EventConditionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7999:1: ( ( ruleEventConditions ) )
            // InternalMyDsl.g:8000:2: ( ruleEventConditions )
            {
            // InternalMyDsl.g:8000:2: ( ruleEventConditions )
            // InternalMyDsl.g:8001:3: ruleEventConditions
            {
             before(grammarAccess.getEventConditionsAccess().getEventConditionsEventConditionsParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEventConditions();

            state._fsp--;

             after(grammarAccess.getEventConditionsAccess().getEventConditionsEventConditionsParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventConditions__EventConditionsAssignment_4_1"


    // $ANTLR start "rule__DeviceEntityName__NameAssignment"
    // InternalMyDsl.g:8010:1: rule__DeviceEntityName__NameAssignment : ( RULE_ID ) ;
    public final void rule__DeviceEntityName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8014:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8015:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8015:2: ( RULE_ID )
            // InternalMyDsl.g:8016:3: RULE_ID
            {
             before(grammarAccess.getDeviceEntityNameAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeviceEntityNameAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceEntityName__NameAssignment"


    // $ANTLR start "rule__StructEntityName__NameAssignment"
    // InternalMyDsl.g:8025:1: rule__StructEntityName__NameAssignment : ( RULE_ID ) ;
    public final void rule__StructEntityName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8029:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8030:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8030:2: ( RULE_ID )
            // InternalMyDsl.g:8031:3: RULE_ID
            {
             before(grammarAccess.getStructEntityNameAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStructEntityNameAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructEntityName__NameAssignment"


    // $ANTLR start "rule__EntityName__NameAssignment"
    // InternalMyDsl.g:8040:1: rule__EntityName__NameAssignment : ( RULE_ID ) ;
    public final void rule__EntityName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8044:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8045:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8045:2: ( RULE_ID )
            // InternalMyDsl.g:8046:3: RULE_ID
            {
             before(grammarAccess.getEntityNameAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityNameAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityName__NameAssignment"


    // $ANTLR start "rule__Generate__SourceNameAssignment_1"
    // InternalMyDsl.g:8055:1: rule__Generate__SourceNameAssignment_1 : ( ruleSourceName ) ;
    public final void rule__Generate__SourceNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8059:1: ( ( ruleSourceName ) )
            // InternalMyDsl.g:8060:2: ( ruleSourceName )
            {
            // InternalMyDsl.g:8060:2: ( ruleSourceName )
            // InternalMyDsl.g:8061:3: ruleSourceName
            {
             before(grammarAccess.getGenerateAccess().getSourceNameSourceNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSourceName();

            state._fsp--;

             after(grammarAccess.getGenerateAccess().getSourceNameSourceNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generate__SourceNameAssignment_1"


    // $ANTLR start "rule__Generate__TypeAssignment_3"
    // InternalMyDsl.g:8070:1: rule__Generate__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__Generate__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8074:1: ( ( ruleType ) )
            // InternalMyDsl.g:8075:2: ( ruleType )
            {
            // InternalMyDsl.g:8075:2: ( ruleType )
            // InternalMyDsl.g:8076:3: ruleType
            {
             before(grammarAccess.getGenerateAccess().getTypeTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getGenerateAccess().getTypeTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generate__TypeAssignment_3"


    // $ANTLR start "rule__SourceName__NameAssignment"
    // InternalMyDsl.g:8085:1: rule__SourceName__NameAssignment : ( RULE_ID ) ;
    public final void rule__SourceName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8089:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8090:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8090:2: ( RULE_ID )
            // InternalMyDsl.g:8091:3: RULE_ID
            {
             before(grammarAccess.getSourceNameAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSourceNameAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceName__NameAssignment"


    // $ANTLR start "rule__Actuator__ActuatorNameAssignment_0"
    // InternalMyDsl.g:8100:1: rule__Actuator__ActuatorNameAssignment_0 : ( ruleEntityName ) ;
    public final void rule__Actuator__ActuatorNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8104:1: ( ( ruleEntityName ) )
            // InternalMyDsl.g:8105:2: ( ruleEntityName )
            {
            // InternalMyDsl.g:8105:2: ( ruleEntityName )
            // InternalMyDsl.g:8106:3: ruleEntityName
            {
             before(grammarAccess.getActuatorAccess().getActuatorNameEntityNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityName();

            state._fsp--;

             after(grammarAccess.getActuatorAccess().getActuatorNameEntityNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__ActuatorNameAssignment_0"


    // $ANTLR start "rule__Actuator__ActionsAssignment_1"
    // InternalMyDsl.g:8115:1: rule__Actuator__ActionsAssignment_1 : ( ruleAction ) ;
    public final void rule__Actuator__ActionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8119:1: ( ( ruleAction ) )
            // InternalMyDsl.g:8120:2: ( ruleAction )
            {
            // InternalMyDsl.g:8120:2: ( ruleAction )
            // InternalMyDsl.g:8121:3: ruleAction
            {
             before(grammarAccess.getActuatorAccess().getActionsActionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActuatorAccess().getActionsActionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__ActionsAssignment_1"


    // $ANTLR start "rule__Action__ActionNameAssignment_1"
    // InternalMyDsl.g:8130:1: rule__Action__ActionNameAssignment_1 : ( ruleActionName ) ;
    public final void rule__Action__ActionNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8134:1: ( ( ruleActionName ) )
            // InternalMyDsl.g:8135:2: ( ruleActionName )
            {
            // InternalMyDsl.g:8135:2: ( ruleActionName )
            // InternalMyDsl.g:8136:3: ruleActionName
            {
             before(grammarAccess.getActionAccess().getActionNameActionNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActionName();

            state._fsp--;

             after(grammarAccess.getActionAccess().getActionNameActionNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ActionNameAssignment_1"


    // $ANTLR start "rule__Action__ParametersAssignment_3"
    // InternalMyDsl.g:8145:1: rule__Action__ParametersAssignment_3 : ( ruleParameters ) ;
    public final void rule__Action__ParametersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8149:1: ( ( ruleParameters ) )
            // InternalMyDsl.g:8150:2: ( ruleParameters )
            {
            // InternalMyDsl.g:8150:2: ( ruleParameters )
            // InternalMyDsl.g:8151:3: ruleParameters
            {
             before(grammarAccess.getActionAccess().getParametersParametersParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleParameters();

            state._fsp--;

             after(grammarAccess.getActionAccess().getParametersParametersParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ParametersAssignment_3"


    // $ANTLR start "rule__ActionName__NameAssignment"
    // InternalMyDsl.g:8160:1: rule__ActionName__NameAssignment : ( RULE_ID ) ;
    public final void rule__ActionName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8164:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8165:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8165:2: ( RULE_ID )
            // InternalMyDsl.g:8166:3: RULE_ID
            {
             before(grammarAccess.getActionNameAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActionNameAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionName__NameAssignment"


    // $ANTLR start "rule__Parameters__ParameterNameAssignment_0"
    // InternalMyDsl.g:8175:1: rule__Parameters__ParameterNameAssignment_0 : ( ruleParameterName ) ;
    public final void rule__Parameters__ParameterNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8179:1: ( ( ruleParameterName ) )
            // InternalMyDsl.g:8180:2: ( ruleParameterName )
            {
            // InternalMyDsl.g:8180:2: ( ruleParameterName )
            // InternalMyDsl.g:8181:3: ruleParameterName
            {
             before(grammarAccess.getParametersAccess().getParameterNameParameterNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterName();

            state._fsp--;

             after(grammarAccess.getParametersAccess().getParameterNameParameterNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__ParameterNameAssignment_0"


    // $ANTLR start "rule__Parameters__TypeAssignment_2"
    // InternalMyDsl.g:8190:1: rule__Parameters__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Parameters__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8194:1: ( ( ruleType ) )
            // InternalMyDsl.g:8195:2: ( ruleType )
            {
            // InternalMyDsl.g:8195:2: ( ruleType )
            // InternalMyDsl.g:8196:3: ruleType
            {
             before(grammarAccess.getParametersAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getParametersAccess().getTypeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__TypeAssignment_2"


    // $ANTLR start "rule__ParameterName__NameAssignment"
    // InternalMyDsl.g:8205:1: rule__ParameterName__NameAssignment : ( RULE_ID ) ;
    public final void rule__ParameterName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8209:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8210:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8210:2: ( RULE_ID )
            // InternalMyDsl.g:8211:3: RULE_ID
            {
             before(grammarAccess.getParameterNameAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterNameAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterName__NameAssignment"


    // $ANTLR start "rule__StorageService__StorageServiceNameAssignment_0"
    // InternalMyDsl.g:8220:1: rule__StorageService__StorageServiceNameAssignment_0 : ( ruleEntityName ) ;
    public final void rule__StorageService__StorageServiceNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8224:1: ( ( ruleEntityName ) )
            // InternalMyDsl.g:8225:2: ( ruleEntityName )
            {
            // InternalMyDsl.g:8225:2: ( ruleEntityName )
            // InternalMyDsl.g:8226:3: ruleEntityName
            {
             before(grammarAccess.getStorageServiceAccess().getStorageServiceNameEntityNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityName();

            state._fsp--;

             after(grammarAccess.getStorageServiceAccess().getStorageServiceNameEntityNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StorageService__StorageServiceNameAssignment_0"


    // $ANTLR start "rule__StorageService__DataAccessesAssignment_1"
    // InternalMyDsl.g:8235:1: rule__StorageService__DataAccessesAssignment_1 : ( ruleDataAccess ) ;
    public final void rule__StorageService__DataAccessesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8239:1: ( ( ruleDataAccess ) )
            // InternalMyDsl.g:8240:2: ( ruleDataAccess )
            {
            // InternalMyDsl.g:8240:2: ( ruleDataAccess )
            // InternalMyDsl.g:8241:3: ruleDataAccess
            {
             before(grammarAccess.getStorageServiceAccess().getDataAccessesDataAccessParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataAccess();

            state._fsp--;

             after(grammarAccess.getStorageServiceAccess().getDataAccessesDataAccessParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StorageService__DataAccessesAssignment_1"


    // $ANTLR start "rule__DataAccessForRequestSensors__SourceNameAssignment_1"
    // InternalMyDsl.g:8250:1: rule__DataAccessForRequestSensors__SourceNameAssignment_1 : ( ruleSourceName ) ;
    public final void rule__DataAccessForRequestSensors__SourceNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8254:1: ( ( ruleSourceName ) )
            // InternalMyDsl.g:8255:2: ( ruleSourceName )
            {
            // InternalMyDsl.g:8255:2: ( ruleSourceName )
            // InternalMyDsl.g:8256:3: ruleSourceName
            {
             before(grammarAccess.getDataAccessForRequestSensorsAccess().getSourceNameSourceNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSourceName();

            state._fsp--;

             after(grammarAccess.getDataAccessForRequestSensorsAccess().getSourceNameSourceNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccessForRequestSensors__SourceNameAssignment_1"


    // $ANTLR start "rule__DataAccessForRequestSensors__DataAccessTypeAssignment_3"
    // InternalMyDsl.g:8265:1: rule__DataAccessForRequestSensors__DataAccessTypeAssignment_3 : ( ruleType ) ;
    public final void rule__DataAccessForRequestSensors__DataAccessTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8269:1: ( ( ruleType ) )
            // InternalMyDsl.g:8270:2: ( ruleType )
            {
            // InternalMyDsl.g:8270:2: ( ruleType )
            // InternalMyDsl.g:8271:3: ruleType
            {
             before(grammarAccess.getDataAccessForRequestSensorsAccess().getDataAccessTypeTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDataAccessForRequestSensorsAccess().getDataAccessTypeTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccessForRequestSensors__DataAccessTypeAssignment_3"


    // $ANTLR start "rule__DataAccessForRequestSensors__DataItemAssignment_5"
    // InternalMyDsl.g:8280:1: rule__DataAccessForRequestSensors__DataItemAssignment_5 : ( RULE_ID ) ;
    public final void rule__DataAccessForRequestSensors__DataItemAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8284:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8285:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8285:2: ( RULE_ID )
            // InternalMyDsl.g:8286:3: RULE_ID
            {
             before(grammarAccess.getDataAccessForRequestSensorsAccess().getDataItemIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataAccessForRequestSensorsAccess().getDataItemIDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccessForRequestSensors__DataItemAssignment_5"


    // $ANTLR start "rule__DataAccessForRequestSensors__TypeAssignment_7"
    // InternalMyDsl.g:8295:1: rule__DataAccessForRequestSensors__TypeAssignment_7 : ( ruleType ) ;
    public final void rule__DataAccessForRequestSensors__TypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8299:1: ( ( ruleType ) )
            // InternalMyDsl.g:8300:2: ( ruleType )
            {
            // InternalMyDsl.g:8300:2: ( ruleType )
            // InternalMyDsl.g:8301:3: ruleType
            {
             before(grammarAccess.getDataAccessForRequestSensorsAccess().getTypeTypeParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDataAccessForRequestSensorsAccess().getTypeTypeParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccessForRequestSensors__TypeAssignment_7"


    // $ANTLR start "rule__DataAccess__SourceNameAssignment_1"
    // InternalMyDsl.g:8310:1: rule__DataAccess__SourceNameAssignment_1 : ( ruleSourceName ) ;
    public final void rule__DataAccess__SourceNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8314:1: ( ( ruleSourceName ) )
            // InternalMyDsl.g:8315:2: ( ruleSourceName )
            {
            // InternalMyDsl.g:8315:2: ( ruleSourceName )
            // InternalMyDsl.g:8316:3: ruleSourceName
            {
             before(grammarAccess.getDataAccessAccess().getSourceNameSourceNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSourceName();

            state._fsp--;

             after(grammarAccess.getDataAccessAccess().getSourceNameSourceNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__SourceNameAssignment_1"


    // $ANTLR start "rule__DataAccess__DataAccessTypeAssignment_3"
    // InternalMyDsl.g:8325:1: rule__DataAccess__DataAccessTypeAssignment_3 : ( ruleType ) ;
    public final void rule__DataAccess__DataAccessTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8329:1: ( ( ruleType ) )
            // InternalMyDsl.g:8330:2: ( ruleType )
            {
            // InternalMyDsl.g:8330:2: ( ruleType )
            // InternalMyDsl.g:8331:3: ruleType
            {
             before(grammarAccess.getDataAccessAccess().getDataAccessTypeTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDataAccessAccess().getDataAccessTypeTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__DataAccessTypeAssignment_3"


    // $ANTLR start "rule__DataAccess__DataItemAssignment_5"
    // InternalMyDsl.g:8340:1: rule__DataAccess__DataItemAssignment_5 : ( RULE_ID ) ;
    public final void rule__DataAccess__DataItemAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8344:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8345:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8345:2: ( RULE_ID )
            // InternalMyDsl.g:8346:3: RULE_ID
            {
             before(grammarAccess.getDataAccessAccess().getDataItemIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataAccessAccess().getDataItemIDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__DataItemAssignment_5"


    // $ANTLR start "rule__DataAccess__TypeAssignment_7"
    // InternalMyDsl.g:8355:1: rule__DataAccess__TypeAssignment_7 : ( ruleType ) ;
    public final void rule__DataAccess__TypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8359:1: ( ( ruleType ) )
            // InternalMyDsl.g:8360:2: ( ruleType )
            {
            // InternalMyDsl.g:8360:2: ( ruleType )
            // InternalMyDsl.g:8361:3: ruleType
            {
             before(grammarAccess.getDataAccessAccess().getTypeTypeParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDataAccessAccess().getTypeTypeParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__TypeAssignment_7"


    // $ANTLR start "rule__DataAccess__ActionsAssignment_9"
    // InternalMyDsl.g:8370:1: rule__DataAccess__ActionsAssignment_9 : ( ruleAction ) ;
    public final void rule__DataAccess__ActionsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8374:1: ( ( ruleAction ) )
            // InternalMyDsl.g:8375:2: ( ruleAction )
            {
            // InternalMyDsl.g:8375:2: ( ruleAction )
            // InternalMyDsl.g:8376:3: ruleAction
            {
             before(grammarAccess.getDataAccessAccess().getActionsActionParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getDataAccessAccess().getActionsActionParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__ActionsAssignment_9"


    // $ANTLR start "rule__Type__PrimitiveDataTypeAssignment"
    // InternalMyDsl.g:8385:1: rule__Type__PrimitiveDataTypeAssignment : ( rulePrimitiveDataType ) ;
    public final void rule__Type__PrimitiveDataTypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8389:1: ( ( rulePrimitiveDataType ) )
            // InternalMyDsl.g:8390:2: ( rulePrimitiveDataType )
            {
            // InternalMyDsl.g:8390:2: ( rulePrimitiveDataType )
            // InternalMyDsl.g:8391:3: rulePrimitiveDataType
            {
             before(grammarAccess.getTypeAccess().getPrimitiveDataTypePrimitiveDataTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitiveDataType();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getPrimitiveDataTypePrimitiveDataTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__PrimitiveDataTypeAssignment"


    // $ANTLR start "rule__Unit__NameAssignment_0"
    // InternalMyDsl.g:8400:1: rule__Unit__NameAssignment_0 : ( ( 'PPM' ) ) ;
    public final void rule__Unit__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8404:1: ( ( ( 'PPM' ) ) )
            // InternalMyDsl.g:8405:2: ( ( 'PPM' ) )
            {
            // InternalMyDsl.g:8405:2: ( ( 'PPM' ) )
            // InternalMyDsl.g:8406:3: ( 'PPM' )
            {
             before(grammarAccess.getUnitAccess().getNamePPMKeyword_0_0()); 
            // InternalMyDsl.g:8407:3: ( 'PPM' )
            // InternalMyDsl.g:8408:4: 'PPM'
            {
             before(grammarAccess.getUnitAccess().getNamePPMKeyword_0_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getUnitAccess().getNamePPMKeyword_0_0()); 

            }

             after(grammarAccess.getUnitAccess().getNamePPMKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unit__NameAssignment_0"


    // $ANTLR start "rule__Unit__NameAssignment_1"
    // InternalMyDsl.g:8419:1: rule__Unit__NameAssignment_1 : ( ( 'miliseconds' ) ) ;
    public final void rule__Unit__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8423:1: ( ( ( 'miliseconds' ) ) )
            // InternalMyDsl.g:8424:2: ( ( 'miliseconds' ) )
            {
            // InternalMyDsl.g:8424:2: ( ( 'miliseconds' ) )
            // InternalMyDsl.g:8425:3: ( 'miliseconds' )
            {
             before(grammarAccess.getUnitAccess().getNameMilisecondsKeyword_1_0()); 
            // InternalMyDsl.g:8426:3: ( 'miliseconds' )
            // InternalMyDsl.g:8427:4: 'miliseconds'
            {
             before(grammarAccess.getUnitAccess().getNameMilisecondsKeyword_1_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getUnitAccess().getNameMilisecondsKeyword_1_0()); 

            }

             after(grammarAccess.getUnitAccess().getNameMilisecondsKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unit__NameAssignment_1"


    // $ANTLR start "rule__Unit__NameAssignment_2"
    // InternalMyDsl.g:8438:1: rule__Unit__NameAssignment_2 : ( ( 'seconds' ) ) ;
    public final void rule__Unit__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8442:1: ( ( ( 'seconds' ) ) )
            // InternalMyDsl.g:8443:2: ( ( 'seconds' ) )
            {
            // InternalMyDsl.g:8443:2: ( ( 'seconds' ) )
            // InternalMyDsl.g:8444:3: ( 'seconds' )
            {
             before(grammarAccess.getUnitAccess().getNameSecondsKeyword_2_0()); 
            // InternalMyDsl.g:8445:3: ( 'seconds' )
            // InternalMyDsl.g:8446:4: 'seconds'
            {
             before(grammarAccess.getUnitAccess().getNameSecondsKeyword_2_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getUnitAccess().getNameSecondsKeyword_2_0()); 

            }

             after(grammarAccess.getUnitAccess().getNameSecondsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unit__NameAssignment_2"


    // $ANTLR start "rule__Unit__NameAssignment_3"
    // InternalMyDsl.g:8457:1: rule__Unit__NameAssignment_3 : ( ( 'minutes' ) ) ;
    public final void rule__Unit__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8461:1: ( ( ( 'minutes' ) ) )
            // InternalMyDsl.g:8462:2: ( ( 'minutes' ) )
            {
            // InternalMyDsl.g:8462:2: ( ( 'minutes' ) )
            // InternalMyDsl.g:8463:3: ( 'minutes' )
            {
             before(grammarAccess.getUnitAccess().getNameMinutesKeyword_3_0()); 
            // InternalMyDsl.g:8464:3: ( 'minutes' )
            // InternalMyDsl.g:8465:4: 'minutes'
            {
             before(grammarAccess.getUnitAccess().getNameMinutesKeyword_3_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getUnitAccess().getNameMinutesKeyword_3_0()); 

            }

             after(grammarAccess.getUnitAccess().getNameMinutesKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unit__NameAssignment_3"


    // $ANTLR start "rule__Unit__NameAssignment_4"
    // InternalMyDsl.g:8476:1: rule__Unit__NameAssignment_4 : ( ( 'ppm' ) ) ;
    public final void rule__Unit__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8480:1: ( ( ( 'ppm' ) ) )
            // InternalMyDsl.g:8481:2: ( ( 'ppm' ) )
            {
            // InternalMyDsl.g:8481:2: ( ( 'ppm' ) )
            // InternalMyDsl.g:8482:3: ( 'ppm' )
            {
             before(grammarAccess.getUnitAccess().getNamePpmKeyword_4_0()); 
            // InternalMyDsl.g:8483:3: ( 'ppm' )
            // InternalMyDsl.g:8484:4: 'ppm'
            {
             before(grammarAccess.getUnitAccess().getNamePpmKeyword_4_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getUnitAccess().getNamePpmKeyword_4_0()); 

            }

             after(grammarAccess.getUnitAccess().getNamePpmKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unit__NameAssignment_4"


    // $ANTLR start "rule__OperationName__NameAssignment"
    // InternalMyDsl.g:8495:1: rule__OperationName__NameAssignment : ( ( 'AVG_BY_SAMPLE' ) ) ;
    public final void rule__OperationName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8499:1: ( ( ( 'AVG_BY_SAMPLE' ) ) )
            // InternalMyDsl.g:8500:2: ( ( 'AVG_BY_SAMPLE' ) )
            {
            // InternalMyDsl.g:8500:2: ( ( 'AVG_BY_SAMPLE' ) )
            // InternalMyDsl.g:8501:3: ( 'AVG_BY_SAMPLE' )
            {
             before(grammarAccess.getOperationNameAccess().getNameAVG_BY_SAMPLEKeyword_0()); 
            // InternalMyDsl.g:8502:3: ( 'AVG_BY_SAMPLE' )
            // InternalMyDsl.g:8503:4: 'AVG_BY_SAMPLE'
            {
             before(grammarAccess.getOperationNameAccess().getNameAVG_BY_SAMPLEKeyword_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getOperationNameAccess().getNameAVG_BY_SAMPLEKeyword_0()); 

            }

             after(grammarAccess.getOperationNameAccess().getNameAVG_BY_SAMPLEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationName__NameAssignment"


    // $ANTLR start "rule__PrimitiveDataType__INTEGERAssignment_0"
    // InternalMyDsl.g:8514:1: rule__PrimitiveDataType__INTEGERAssignment_0 : ( ( 'Integer' ) ) ;
    public final void rule__PrimitiveDataType__INTEGERAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8518:1: ( ( ( 'Integer' ) ) )
            // InternalMyDsl.g:8519:2: ( ( 'Integer' ) )
            {
            // InternalMyDsl.g:8519:2: ( ( 'Integer' ) )
            // InternalMyDsl.g:8520:3: ( 'Integer' )
            {
             before(grammarAccess.getPrimitiveDataTypeAccess().getINTEGERIntegerKeyword_0_0()); 
            // InternalMyDsl.g:8521:3: ( 'Integer' )
            // InternalMyDsl.g:8522:4: 'Integer'
            {
             before(grammarAccess.getPrimitiveDataTypeAccess().getINTEGERIntegerKeyword_0_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getPrimitiveDataTypeAccess().getINTEGERIntegerKeyword_0_0()); 

            }

             after(grammarAccess.getPrimitiveDataTypeAccess().getINTEGERIntegerKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveDataType__INTEGERAssignment_0"


    // $ANTLR start "rule__PrimitiveDataType__BOOLEANAssignment_1"
    // InternalMyDsl.g:8533:1: rule__PrimitiveDataType__BOOLEANAssignment_1 : ( ( 'boolean' ) ) ;
    public final void rule__PrimitiveDataType__BOOLEANAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8537:1: ( ( ( 'boolean' ) ) )
            // InternalMyDsl.g:8538:2: ( ( 'boolean' ) )
            {
            // InternalMyDsl.g:8538:2: ( ( 'boolean' ) )
            // InternalMyDsl.g:8539:3: ( 'boolean' )
            {
             before(grammarAccess.getPrimitiveDataTypeAccess().getBOOLEANBooleanKeyword_1_0()); 
            // InternalMyDsl.g:8540:3: ( 'boolean' )
            // InternalMyDsl.g:8541:4: 'boolean'
            {
             before(grammarAccess.getPrimitiveDataTypeAccess().getBOOLEANBooleanKeyword_1_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getPrimitiveDataTypeAccess().getBOOLEANBooleanKeyword_1_0()); 

            }

             after(grammarAccess.getPrimitiveDataTypeAccess().getBOOLEANBooleanKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveDataType__BOOLEANAssignment_1"


    // $ANTLR start "rule__PrimitiveDataType__STRINGAssignment_2"
    // InternalMyDsl.g:8552:1: rule__PrimitiveDataType__STRINGAssignment_2 : ( ( 'String' ) ) ;
    public final void rule__PrimitiveDataType__STRINGAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8556:1: ( ( ( 'String' ) ) )
            // InternalMyDsl.g:8557:2: ( ( 'String' ) )
            {
            // InternalMyDsl.g:8557:2: ( ( 'String' ) )
            // InternalMyDsl.g:8558:3: ( 'String' )
            {
             before(grammarAccess.getPrimitiveDataTypeAccess().getSTRINGStringKeyword_2_0()); 
            // InternalMyDsl.g:8559:3: ( 'String' )
            // InternalMyDsl.g:8560:4: 'String'
            {
             before(grammarAccess.getPrimitiveDataTypeAccess().getSTRINGStringKeyword_2_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getPrimitiveDataTypeAccess().getSTRINGStringKeyword_2_0()); 

            }

             after(grammarAccess.getPrimitiveDataTypeAccess().getSTRINGStringKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveDataType__STRINGAssignment_2"


    // $ANTLR start "rule__PrimitiveDataType__LONGAssignment_3"
    // InternalMyDsl.g:8571:1: rule__PrimitiveDataType__LONGAssignment_3 : ( ( 'long' ) ) ;
    public final void rule__PrimitiveDataType__LONGAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8575:1: ( ( ( 'long' ) ) )
            // InternalMyDsl.g:8576:2: ( ( 'long' ) )
            {
            // InternalMyDsl.g:8576:2: ( ( 'long' ) )
            // InternalMyDsl.g:8577:3: ( 'long' )
            {
             before(grammarAccess.getPrimitiveDataTypeAccess().getLONGLongKeyword_3_0()); 
            // InternalMyDsl.g:8578:3: ( 'long' )
            // InternalMyDsl.g:8579:4: 'long'
            {
             before(grammarAccess.getPrimitiveDataTypeAccess().getLONGLongKeyword_3_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getPrimitiveDataTypeAccess().getLONGLongKeyword_3_0()); 

            }

             after(grammarAccess.getPrimitiveDataTypeAccess().getLONGLongKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveDataType__LONGAssignment_3"


    // $ANTLR start "rule__PrimitiveDataType__DOUBLEAssignment_4"
    // InternalMyDsl.g:8590:1: rule__PrimitiveDataType__DOUBLEAssignment_4 : ( ( 'double' ) ) ;
    public final void rule__PrimitiveDataType__DOUBLEAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8594:1: ( ( ( 'double' ) ) )
            // InternalMyDsl.g:8595:2: ( ( 'double' ) )
            {
            // InternalMyDsl.g:8595:2: ( ( 'double' ) )
            // InternalMyDsl.g:8596:3: ( 'double' )
            {
             before(grammarAccess.getPrimitiveDataTypeAccess().getDOUBLEDoubleKeyword_4_0()); 
            // InternalMyDsl.g:8597:3: ( 'double' )
            // InternalMyDsl.g:8598:4: 'double'
            {
             before(grammarAccess.getPrimitiveDataTypeAccess().getDOUBLEDoubleKeyword_4_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getPrimitiveDataTypeAccess().getDOUBLEDoubleKeyword_4_0()); 

            }

             after(grammarAccess.getPrimitiveDataTypeAccess().getDOUBLEDoubleKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveDataType__DOUBLEAssignment_4"


    // $ANTLR start "rule__PrimitiveDataType__StructDefAssignment_5"
    // InternalMyDsl.g:8609:1: rule__PrimitiveDataType__StructDefAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__PrimitiveDataType__StructDefAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8613:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:8614:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:8614:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:8615:3: ( RULE_ID )
            {
             before(grammarAccess.getPrimitiveDataTypeAccess().getStructDefStructEntityNameCrossReference_5_0()); 
            // InternalMyDsl.g:8616:3: ( RULE_ID )
            // InternalMyDsl.g:8617:4: RULE_ID
            {
             before(grammarAccess.getPrimitiveDataTypeAccess().getStructDefStructEntityNameIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimitiveDataTypeAccess().getStructDefStructEntityNameIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getPrimitiveDataTypeAccess().getStructDefStructEntityNameCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveDataType__StructDefAssignment_5"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\122\uffff";
    static final String dfa_2s = "\1\2\16\uffff\1\2\2\uffff\1\2\21\uffff\1\2\1\uffff\1\2\7\uffff\1\2\12\uffff\1\2\15\uffff\2\2\10\uffff\1\2";
    static final String dfa_3s = "\1\16\1\5\3\uffff\1\5\1\uffff\1\17\1\5\6\21\3\5\1\23\1\17\3\5\6\21\1\17\6\21\3\5\6\21\4\5\6\21\1\17\3\5\14\21\4\5\6\21\1\5";
    static final String dfa_4s = "\1\35\1\23\3\uffff\1\5\1\uffff\1\17\1\104\6\21\1\35\1\17\1\5\1\45\1\17\1\104\1\5\1\104\6\21\1\17\6\21\1\35\1\104\1\35\6\21\1\17\1\35\1\104\1\17\6\21\1\17\1\104\1\35\1\104\14\21\2\35\1\17\1\104\6\21\1\35";
    static final String dfa_5s = "\2\uffff\1\2\1\3\1\4\1\uffff\1\1\113\uffff";
    static final String dfa_6s = "\122\uffff}>";
    static final String[] dfa_7s = {
            "\1\4\4\uffff\1\2\3\uffff\1\1\1\2\4\uffff\1\3",
            "\1\5\15\uffff\1\6",
            "",
            "",
            "",
            "\1\7",
            "",
            "\1\10",
            "\1\16\72\uffff\1\11\1\12\1\13\1\14\1\15",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\20\15\uffff\1\22\3\uffff\1\21\1\2\4\uffff\1\3",
            "\1\23\11\uffff\1\24",
            "\1\25",
            "\1\2\4\uffff\1\2\14\uffff\1\6",
            "\1\26",
            "\1\34\72\uffff\1\27\1\30\1\31\1\32\1\33",
            "\1\35",
            "\1\43\72\uffff\1\36\1\37\1\40\1\41\1\42",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\46",
            "\1\46",
            "\1\46",
            "\1\46",
            "\1\46",
            "\1\20\15\uffff\1\22\3\uffff\1\21\1\2\4\uffff\1\3",
            "\1\54\72\uffff\1\47\1\50\1\51\1\52\1\53",
            "\1\55\15\uffff\1\22\3\uffff\1\21\1\2\4\uffff\1\3",
            "\1\56",
            "\1\56",
            "\1\56",
            "\1\56",
            "\1\56",
            "\1\56",
            "\1\23\11\uffff\1\57",
            "\1\60\15\uffff\1\2\3\uffff\1\21\1\2\4\uffff\1\3",
            "\1\66\72\uffff\1\61\1\62\1\63\1\64\1\65",
            "\1\67\11\uffff\1\70",
            "\1\71",
            "\1\71",
            "\1\71",
            "\1\71",
            "\1\71",
            "\1\71",
            "\1\72",
            "\1\100\72\uffff\1\73\1\74\1\75\1\76\1\77",
            "\1\55\15\uffff\1\22\3\uffff\1\21\1\2\4\uffff\1\3",
            "\1\106\72\uffff\1\101\1\102\1\103\1\104\1\105",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\60\15\uffff\1\2\3\uffff\1\21\1\2\4\uffff\1\3",
            "\1\111\15\uffff\1\2\3\uffff\1\21\1\2\4\uffff\1\3",
            "\1\67\11\uffff\1\112",
            "\1\120\72\uffff\1\113\1\114\1\115\1\116\1\117",
            "\1\121",
            "\1\121",
            "\1\121",
            "\1\121",
            "\1\121",
            "\1\121",
            "\1\111\15\uffff\1\2\3\uffff\1\21\1\2\4\uffff\1\3"
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
            return "1227:1: rule__Model__Alternatives : ( ( ( rule__Model__VocSpecAssignment_0 ) ) | ( ( rule__Model__InteractionSpecAssignment_1 ) ) | ( ( rule__Model__ArchSpecAssignment_2 ) ) | ( ( rule__Model__NetworkSpecAssignment_3 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0038000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x01C0000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001102000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0001001100000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x00000FC000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000020L,0x000000000000001FL});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000003802L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x7C00000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0004000000000000L});

}