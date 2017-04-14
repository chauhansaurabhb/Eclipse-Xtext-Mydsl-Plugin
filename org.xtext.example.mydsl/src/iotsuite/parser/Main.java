package iotsuite.parser;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;

import iotsuite.codegenerator.GenFiller;
import iotsuite.common.GlobalVariable;
import iotsuite.compiler.LinkerCompiler;
import iotsuite.compiler.MapperCompiler;
import iotsuite.semanticmodel.DeploymentScope;
import iotsuite.semanticmodel.Device;

public class Main {

	public static void main(String[] args) throws Exception {

		GlobalVariable.activity = args[0];
		GlobalVariable.templatePath = args[1];
		
		
		// Constructing the Vocabulary Specification Path
		GlobalVariable.vocabSpec = "C:/IoTSuite-Eclipse-Plugin"+"/Template/IoTSuiteSpecification/src/" + "vocab.mydsl";

		// Constructing the Architecture Specification Path
		GlobalVariable.archSpec = "C:/IoTSuite-Eclipse-Plugin"+ "/Template/IoTSuiteSpecification/src/" + "arch.mydsl";

		// Constructing the User Interaction Specification Path
		GlobalVariable.interactionSpec ="C:/IoTSuite-Eclipse-Plugin"+"/Template/IoTSuiteSpecification/src/" + "userinteraction.mydsl";

		// Constructing the Deployment Specification Path
		GlobalVariable.deploymentSpec =  "C:/IoTSuite-Eclipse-Plugin"+"/Template/IoTSuiteSpecification/src/" + "deploy.mydsl";

		// Constructing the StringTemplate Path
		GlobalVariable.stringTemplatePath = "C:/IoTSuite-Eclipse-Plugin"+"/Template/StringTemplateFiles";
		
		
		/*GlobalVariable.vocabSpec = GlobalVariable.templatePath+"/IoTSuiteSpecification/src/" + "vocab.mydsl";

		// Constructing the Architecture Specification Path
		GlobalVariable.archSpec = GlobalVariable.templatePath+ "/IoTSuiteSpecification/src/" + "arch.mydsl";

		// Constructing the User Interaction Specification Path
		GlobalVariable.interactionSpec =GlobalVariable.templatePath+"/IoTSuiteSpecification/src/" + "userinteraction.mydsl";

		// Constructing the Deployment Specification Path
		GlobalVariable.deploymentSpec =  GlobalVariable.templatePath+"/IoTSuiteSpecification/src/" + "deploy.mydsl";

		// Constructing the StringTemplate Path
		GlobalVariable.stringTemplatePath = GlobalVariable.templatePath+"/StringTemplateFiles";
*/		
			if (GlobalVariable.activity
				.equals(GlobalVariable.ACTIVITY_GENERATE_DEVICEDRIVER)) {

			ANTLRFileStream vocStream = new ANTLRFileStream(
					GlobalVariable.vocabSpec);
			if (vocStream.size() == 0) {
				JFrame frame = new JFrame("Vocab Warning");

				JOptionPane.showMessageDialog(frame,
						"Vocab specification should not be empty",
						"Vocab parser warning", JOptionPane.WARNING_MESSAGE);
				System.exit(0);

			}
			VocabSpecLexer vocLexer = new VocabSpecLexer(vocStream);
			CommonTokenStream vocTokens = new CommonTokenStream(vocLexer);
			VocabSpecParser vocParser = new VocabSpecParser(vocTokens);
			vocParser.vocabSpec();
			
			
			iotsuite.parser.SymbolTable.StructFieldSet.clear();
			iotsuite.parser.SymbolTable.arrayFieldName = new String[200][200];
			iotsuite.parser.SymbolTable.arrayFieldType = new String[200][200];
			iotsuite.parser.SymbolTable.rowCountInFieldName=0;
			iotsuite.parser.SymbolTable.rowCountInFieldType=0;
			iotsuite.parser.SymbolTable.columnCountInFieldName=0;
			iotsuite.parser.SymbolTable.columnCountinFieldType=0;
			
			 
			iotsuite.parser.SymbolTable.structSymblTable.clear();
			iotsuite.parser.SymbolTable.structNameSymblTable.clear();
			iotsuite.parser.SymbolTable.structField.clear();
			iotsuite.parser.SymbolTable.consumeInfoForSensor.clear();
			iotsuite.parser.SymbolTable.responseSymblTable.clear();
			iotsuite.parser.SymbolTable.listStorageFieldName.clear();
			iotsuite.parser.SymbolTable.listStorageFieldType.clear();
			iotsuite.parser.SymbolTable.StructFieldSetForEventDriven.clear();
			iotsuite.parser.SymbolTable.StructFieldSetForPeriodic.clear();
			iotsuite.parser.SymbolTable.tempListActuatorFieldName.clear();
			iotsuite.parser.SymbolTable.tempListActuatorFieldType.clear();
			iotsuite.parser.SymbolTable.tempListStorageFieldName.clear();
			iotsuite.parser.SymbolTable.tempListStorageFieldType.clear();
			iotsuite.parser.SymbolTable.tempListStorageActionFieldName.clear();
			iotsuite.parser.SymbolTable.tempListStorageActionFieldType.clear();			
			iotsuite.parser.SymbolTable.responseSymblTable.clear();


			
			
		//	GlobalVariable.activity="compile-arch-spec";
			
		/*	updated comment
			iotsuite.parser.SymbolTable.structSymblTable.clear();
			iotsuite.parser.SymbolTable.structNameSymblTable.clear();
			iotsuite.parser.SymbolTable.structField.clear();
		    iotsuite.parser.SymbolTable.consumeInfoForSensor.clear();
			iotsuite.parser.SymbolTable.responseSymblTable.clear();
			iotsuite.parser.SymbolTable.listStorageFieldName.clear();
			iotsuite.parser.SymbolTable.listStorageFieldType.clear();
			iotsuite.parser.SymbolTable.StructFieldSetForEventDriven.clear();
			iotsuite.parser.SymbolTable.StructFieldSetForPeriodic.clear();
			iotsuite.parser.SymbolTable.tempListActuatorFieldName.clear();
			iotsuite.parser.SymbolTable.tempListActuatorFieldType.clear();
			iotsuite.parser.SymbolTable.tempListStorageFieldName.clear();
			iotsuite.parser.SymbolTable.tempListStorageFieldType.clear();
			iotsuite.parser.SymbolTable.tempListStorageActionFieldName.clear();
			iotsuite.parser.SymbolTable.tempListStorageActionFieldType.clear();			
			iotsuite.parser.SymbolTable.responseSymblTable.clear();
			iotsuite.parser.SymbolTable.arrayFieldName = new String[200][200];
			iotsuite.parser.SymbolTable.arrayFieldType = new String[200][200];
			*/
			
			//System.exit(0);
			// GenFiller.copyDeviceDrivers();
			
		//	iotsuite.parser.SymbolTable.consumeInfoForSensor.clear();
			
			// Updated
		/* 	iotsuite.parser.SymbolTable.listStorageFieldName.clear();			 	
		 	iotsuite.parser.SymbolTable.listStorageFieldType.clear();	
		 	
		 	iotsuite.parser.SymbolTable.tempListStorageFieldName.clear();	
		 	iotsuite.parser.SymbolTable.tempListStorageFieldType.clear();	
		 	iotsuite.parser.SymbolTable.tempListActuatorFieldName.clear();	
		 	iotsuite.parser.SymbolTable.tempListActuatorFieldType.clear();	
		 	iotsuite.parser.SymbolTable.tempListStorageActionFieldName.clear();	
		 	iotsuite.parser.SymbolTable.tempListStorageActionFieldType.clear();	
		 	iotsuite.parser.SymbolTable.structNameSymblTable.clear();	
		 	iotsuite.parser.SymbolTable.structField.clear();	
		 	iotsuite.parser.SymbolTable.eventDrivenFields.clear();	
		 	iotsuite.parser.SymbolTable.periodicFieldName.clear();	
		 //	iotsuite.parser.SymbolTable.aggregatorFieldName.clear();	
		 	iotsuite.parser.SymbolTable.eventDrivenFieldName.clear();	
		 	iotsuite.parser.SymbolTable.structSymblTable.clear();	
		 	iotsuite.parser.SymbolTable.responseSymblTable.clear();	
		 	iotsuite.parser.SymbolTable.deviceList.clear();	
		 	
		 	
		 	iotsuite.parser.SymbolTable.deploymentConstraintsList.clear();	
		 	iotsuite.parser.SymbolTable.dataAccessSymblTable.clear();	
		 	iotsuite.parser.SymbolTable.StructFieldSet.clear();	
		 	iotsuite.parser.SymbolTable.StructFieldSetForGUI.clear();	
		 	iotsuite.parser.SymbolTable.StructFieldSetForGUINotify.clear();	
		 	iotsuite.parser.SymbolTable.StructFieldSetForStorage.clear();	
		 	iotsuite.parser.SymbolTable.StructFieldSetForEventDriven.clear();	
		 	iotsuite.parser.SymbolTable.StructFieldSetForPeriodic.clear();	
		 	
		 	
		 	
		 	iotsuite.parser.SymbolTable.arrayFieldName= new String[200][200];
		    iotsuite.parser.SymbolTable.arrayFieldType=  new String[200][200];
		    iotsuite.parser.SymbolTable.arrayGUIGeneratedInfo = new String[10][2];
		    iotsuite.parser.SymbolTable.keys= new String[10];*/
		 	
		 	
		 	
	 	 /*  Arrays.fill(iotsuite.parser.SymbolTable.arrayFieldName,null);
		 	Arrays.fill(iotsuite.parser.SymbolTable.arrayFieldType,null);
		 	Arrays.fill(iotsuite.parser.SymbolTable.arrayGUIGeneratedInfo,null);
		 	Arrays.fill(iotsuite.parser.SymbolTable.keys,null);*/
		 	
		 	
/*		 	iotsuite.parser.SymbolTable.arrayGUIGeneratedInfo= new String[0][0];
		 	iotsuite.parser.SymbolTable.keys= new String[0];
		 	*/
		 	
		 	
		 	
		  				
		}

		if (GlobalVariable.activity
				.equals(GlobalVariable.ACTIVITY_GENERATE_USERINTERACTION)) {

			
		
			ANTLRFileStream vocStream = new ANTLRFileStream(
					GlobalVariable.vocabSpec);
			VocabSpecLexer vocLexer = new VocabSpecLexer(vocStream);
			CommonTokenStream vocTokens = new CommonTokenStream(vocLexer);
			VocabSpecParser vocParser = new VocabSpecParser(vocTokens);
			vocParser.vocabSpec();

			ANTLRFileStream interactionStream = new ANTLRFileStream(
					GlobalVariable.interactionSpec);
			if (interactionStream.size() == 0) {
				JFrame frame = new JFrame("Interaction Warning");
				JOptionPane.showMessageDialog(frame,
						"User-Interaction specification should not be empty",
						"User-Interaction parser warning",
						JOptionPane.WARNING_MESSAGE);
				System.exit(0);

			}
			InteractionSpecLexer interactionLexer = new InteractionSpecLexer(
					interactionStream);
			CommonTokenStream interactionTokens = new CommonTokenStream(
					interactionLexer);
			InteractionSpecParser interactionParser = new InteractionSpecParser(
					interactionTokens);
			interactionParser.interactionSpec();
			//System.exit(0);
			
			iotsuite.parser.SymbolTable.StructFieldSet.clear();
			iotsuite.parser.SymbolTable.arrayFieldName = new String[200][200];
			iotsuite.parser.SymbolTable.arrayFieldType = new String[200][200];
			
			
		/*	updated comment
		 * iotsuite.parser.SymbolTable.structSymblTable.clear();
			iotsuite.parser.SymbolTable.structNameSymblTable.clear();
			iotsuite.parser.SymbolTable.structField.clear();
			//iotsuite.parser.SymbolTable.consumeInfoForSensor.clear();
			iotsuite.parser.SymbolTable.responseSymblTable.clear();
			iotsuite.parser.SymbolTable.listStorageFieldName.clear();
			iotsuite.parser.SymbolTable.listStorageFieldType.clear();
			iotsuite.parser.SymbolTable.StructFieldSetForEventDriven.clear();
			iotsuite.parser.SymbolTable.StructFieldSetForPeriodic.clear();
			iotsuite.parser.SymbolTable.tempListActuatorFieldName.clear();
			iotsuite.parser.SymbolTable.tempListActuatorFieldType.clear();
			iotsuite.parser.SymbolTable.tempListStorageFieldName.clear();
			iotsuite.parser.SymbolTable.tempListStorageFieldType.clear();
			iotsuite.parser.SymbolTable.tempListStorageActionFieldName.clear();
			iotsuite.parser.SymbolTable.tempListStorageActionFieldType.clear();			
			iotsuite.parser.SymbolTable.responseSymblTable.clear();
			iotsuite.parser.SymbolTable.arrayFieldName = new String[200][200];
			iotsuite.parser.SymbolTable.arrayFieldType = new String[200][200];*/
			
			
      /*    iotsuite.parser.SymbolTable.consumeInfoForSensor.clear();
			
			// Updated
		 	iotsuite.parser.SymbolTable.listStorageFieldName.clear();			 	
		 	iotsuite.parser.SymbolTable.listStorageFieldType.clear();	
		 	
		 	iotsuite.parser.SymbolTable.tempListStorageFieldName.clear();	
		 	iotsuite.parser.SymbolTable.tempListStorageFieldType.clear();	
		 	iotsuite.parser.SymbolTable.tempListActuatorFieldName.clear();	
		 	iotsuite.parser.SymbolTable.tempListActuatorFieldType.clear();	
		 	iotsuite.parser.SymbolTable.tempListStorageActionFieldName.clear();	
		 	iotsuite.parser.SymbolTable.tempListStorageActionFieldType.clear();	
		 	iotsuite.parser.SymbolTable.structNameSymblTable.clear();	
		 	iotsuite.parser.SymbolTable.structField.clear();	
		 	iotsuite.parser.SymbolTable.eventDrivenFields.clear();	
		 	iotsuite.parser.SymbolTable.periodicFieldName.clear();	
		 //	iotsuite.parser.SymbolTable.aggregatorFieldName.clear();	
		 	iotsuite.parser.SymbolTable.eventDrivenFieldName.clear();	
		 	iotsuite.parser.SymbolTable.structSymblTable.clear();	
		 	iotsuite.parser.SymbolTable.responseSymblTable.clear();	
		 	iotsuite.parser.SymbolTable.deviceList.clear();	
		 	
		 	
		 	iotsuite.parser.SymbolTable.deploymentConstraintsList.clear();	
		 	iotsuite.parser.SymbolTable.dataAccessSymblTable.clear();	
		 	iotsuite.parser.SymbolTable.StructFieldSet.clear();	
		 	iotsuite.parser.SymbolTable.StructFieldSetForGUI.clear();	
		 	iotsuite.parser.SymbolTable.StructFieldSetForGUINotify.clear();	
		 	iotsuite.parser.SymbolTable.StructFieldSetForStorage.clear();	
		 	iotsuite.parser.SymbolTable.StructFieldSetForEventDriven.clear();	
		 	iotsuite.parser.SymbolTable.StructFieldSetForPeriodic.clear();	*/
		 	
		 	
		 
		 	/*iotsuite.parser.SymbolTable.arrayFieldName= new String[0][0];	
		 	iotsuite.parser.SymbolTable.arrayFieldType= new String[0][0];
		 	
		 	iotsuite.parser.SymbolTable.arrayGUIGeneratedInfo= new String[0][0];
		 	iotsuite.parser.SymbolTable.keys= new String[0];*/
			// GenFiller.copyDeviceDrivers();

		}

		if (GlobalVariable.activity
				.equals(GlobalVariable.ACTIVITY_GENERATE_ARCHITECTUREFRAMEWORK)) {

		
			
			ANTLRFileStream vocStream = new ANTLRFileStream(
					GlobalVariable.vocabSpec);
			VocabSpecLexer vocLexer = new VocabSpecLexer(vocStream);
			CommonTokenStream vocTokens = new CommonTokenStream(vocLexer);
			VocabSpecParser vocParser = new VocabSpecParser(vocTokens);
			vocParser.vocabSpec();
		
		
			
			ANTLRFileStream interactionStream = new ANTLRFileStream(
					GlobalVariable.interactionSpec);			
			InteractionSpecLexer interactionLexer = new InteractionSpecLexer(
					interactionStream);
			CommonTokenStream interactionTokens = new CommonTokenStream(
					interactionLexer);
			InteractionSpecParser interactionParser = new InteractionSpecParser(
					interactionTokens);
			interactionParser.interactionSpec();

					
			
			ANTLRFileStream archStream = new ANTLRFileStream(
					GlobalVariable.archSpec);
			if (archStream.size() == 0) {
				JFrame frame = new JFrame("Arch Warning");

				JOptionPane.showMessageDialog(frame,
						"Arch specification should not be empty",
						"Arch parser warning", JOptionPane.WARNING_MESSAGE);
				System.exit(0);

			}
			ArchSpecLexer archLexer = new ArchSpecLexer(archStream);
			CommonTokenStream archTokens = new CommonTokenStream(archLexer);
			ArchSpecParser archParser = new ArchSpecParser(archTokens);
			archParser.archSpec();
		/*	 updated comment
			iotsuite.parser.SymbolTable.structSymblTable.clear();
			iotsuite.parser.SymbolTable.structNameSymblTable.clear();
			iotsuite.parser.SymbolTable.structField.clear();
		//	iotsuite.parser.SymbolTable.consumeInfoForSensor.clear();
			iotsuite.parser.SymbolTable.responseSymblTable.clear();
			iotsuite.parser.SymbolTable.listStorageFieldName.clear();
			iotsuite.parser.SymbolTable.listStorageFieldType.clear();
			iotsuite.parser.SymbolTable.StructFieldSetForEventDriven.clear();
			iotsuite.parser.SymbolTable.StructFieldSetForPeriodic.clear();
			iotsuite.parser.SymbolTable.tempListActuatorFieldName.clear();
			iotsuite.parser.SymbolTable.tempListActuatorFieldType.clear();
			iotsuite.parser.SymbolTable.tempListStorageFieldName.clear();
			iotsuite.parser.SymbolTable.tempListStorageFieldType.clear();
			iotsuite.parser.SymbolTable.tempListStorageActionFieldName.clear();
			iotsuite.parser.SymbolTable.tempListStorageActionFieldType.clear();			
			iotsuite.parser.SymbolTable.responseSymblTable.clear();
			iotsuite.parser.SymbolTable.arrayFieldName = new String[200][200];
			iotsuite.parser.SymbolTable.arrayFieldType = new String[200][200];*/
		//	System.exit(0);
			
			
          /*   iotsuite.parser.SymbolTable.consumeInfoForSensor.clear();
			
			// Updated
		 	iotsuite.parser.SymbolTable.listStorageFieldName.clear();			 	
		 	iotsuite.parser.SymbolTable.listStorageFieldType.clear();	
		 	
		 	iotsuite.parser.SymbolTable.tempListStorageFieldName.clear();	
		 	iotsuite.parser.SymbolTable.tempListStorageFieldType.clear();	
		 	iotsuite.parser.SymbolTable.tempListActuatorFieldName.clear();	
		 	iotsuite.parser.SymbolTable.tempListActuatorFieldType.clear();	
		 	iotsuite.parser.SymbolTable.tempListStorageActionFieldName.clear();	
		 	iotsuite.parser.SymbolTable.tempListStorageActionFieldType.clear();	
		 	iotsuite.parser.SymbolTable.structNameSymblTable.clear();	
		 	iotsuite.parser.SymbolTable.structField.clear();	
		 	iotsuite.parser.SymbolTable.eventDrivenFields.clear();	
		 	iotsuite.parser.SymbolTable.periodicFieldName.clear();	
		// 	iotsuite.parser.SymbolTable.aggregatorFieldName.clear();	
		 	iotsuite.parser.SymbolTable.eventDrivenFieldName.clear();	
		 	iotsuite.parser.SymbolTable.structSymblTable.clear();	
		 	iotsuite.parser.SymbolTable.responseSymblTable.clear();	
		 	iotsuite.parser.SymbolTable.deviceList.clear();	
		 	
		 	
		 	iotsuite.parser.SymbolTable.deploymentConstraintsList.clear();	
		 	iotsuite.parser.SymbolTable.dataAccessSymblTable.clear();	
		 	iotsuite.parser.SymbolTable.StructFieldSet.clear();	
		 	iotsuite.parser.SymbolTable.StructFieldSetForGUI.clear();	
		 	iotsuite.parser.SymbolTable.StructFieldSetForGUINotify.clear();	
		 	iotsuite.parser.SymbolTable.StructFieldSetForStorage.clear();	
		 	iotsuite.parser.SymbolTable.StructFieldSetForEventDriven.clear();	
		 	iotsuite.parser.SymbolTable.StructFieldSetForPeriodic.clear();	
		 	
			iotsuite.parser.SymbolTable.arrayFieldName= new String[200][200];
		    iotsuite.parser.SymbolTable.arrayFieldType=  new String[200][200];
		    iotsuite.parser.SymbolTable.arrayGUIGeneratedInfo = new String[10][2];
		    iotsuite.parser.SymbolTable.keys= new String[10];
		 	
		 	iotsuite.parser.SymbolTable.arrayFieldName= new String[0][0];	
		 	iotsuite.parser.SymbolTable.arrayFieldType= new String[0][0];
		 	
		 	iotsuite.parser.SymbolTable.arrayGUIGeneratedInfo= new String[0][0];
		 	iotsuite.parser.SymbolTable.keys= new String[0];*/
			// GenFiller.copyApplicationLogic();
		}

		if (GlobalVariable.activity
				.equals(GlobalVariable.ACTIVITY_GENERATE_MAPPING)) {

			ANTLRFileStream vocStream = new ANTLRFileStream(
					GlobalVariable.vocabSpec);
			VocabSpecLexer vocLexer = new VocabSpecLexer(vocStream);
			CommonTokenStream vocTokens = new CommonTokenStream(vocLexer);
			VocabSpecParser vocParser = new VocabSpecParser(vocTokens);
			vocParser.vocabSpec();

			ANTLRFileStream archStream = new ANTLRFileStream(
					GlobalVariable.archSpec);
			ArchSpecLexer archLexer = new ArchSpecLexer(archStream);
			CommonTokenStream archTokens = new CommonTokenStream(archLexer);
			ArchSpecParser archParser = new ArchSpecParser(archTokens);
			archParser.archSpec();

			List<Device> deviceList;
			List<DeploymentScope> mappingConstraintList;

			mappingConstraintList = SymbolTable.getDeploymentConstrainsList();

			ANTLRFileStream deploymentStream = new ANTLRFileStream(
					GlobalVariable.deploymentSpec);
			if (deploymentStream.size() == 0) {
				JFrame frame = new JFrame("Deploy Warning");
				JOptionPane.showMessageDialog(frame,
						"Deployment specification should not be empty",
						"Deployment parser warning",
						JOptionPane.WARNING_MESSAGE);
				System.exit(0);

			}
			NetworkSpecLexer deploymentLexer = new NetworkSpecLexer(
					deploymentStream);
			CommonTokenStream deploymentTokens = new CommonTokenStream(
					deploymentLexer);
			NetworkSpecParser deploymentParser = new NetworkSpecParser(
					deploymentTokens);
			deploymentParser.networkspec();
			deviceList = SymbolTable.getDeviceList();

			MapperCompiler.mappingFileGenerator(deviceList,
					mappingConstraintList);
			LinkerCompiler.linkerAlgo();
			GenFiller.copyLinking();

		}

	}
}
