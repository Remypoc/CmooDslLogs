/*
 * generated by Xtext 2.10.0
 */
package fr.paris10.miage.serializer;

import com.google.inject.Inject;
import fr.paris10.miage.dslLogs.Appel;
import fr.paris10.miage.dslLogs.Date;
import fr.paris10.miage.dslLogs.Demande;
import fr.paris10.miage.dslLogs.DslLogsPackage;
import fr.paris10.miage.dslLogs.Log;
import fr.paris10.miage.dslLogs.Model;
import fr.paris10.miage.dslLogs.Parametre;
import fr.paris10.miage.dslLogs.Utilisateur;
import fr.paris10.miage.services.DslLogsGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class DslLogsSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DslLogsGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DslLogsPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DslLogsPackage.APPEL:
				sequence_Appel(context, (Appel) semanticObject); 
				return; 
			case DslLogsPackage.DATE:
				sequence_Date(context, (Date) semanticObject); 
				return; 
			case DslLogsPackage.DEMANDE:
				sequence_Demande(context, (Demande) semanticObject); 
				return; 
			case DslLogsPackage.LOG:
				sequence_Log(context, (Log) semanticObject); 
				return; 
			case DslLogsPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case DslLogsPackage.PARAMETRE:
				sequence_Parametre(context, (Parametre) semanticObject); 
				return; 
			case DslLogsPackage.UTILISATEUR:
				sequence_Utilisateur(context, (Utilisateur) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Action returns Appel
	 *     Appel returns Appel
	 *
	 * Constraint:
	 *     (page=STRING (parametres+=Parametre parametres+=Parametre*)?)
	 */
	protected void sequence_Appel(ISerializationContext context, Appel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Date returns Date
	 *
	 * Constraint:
	 *     (
	 *         annee=INT 
	 *         mois=INT 
	 *         jour=INT 
	 *         heure=INT 
	 *         minute=INT 
	 *         seconde=INT
	 *     )
	 */
	protected void sequence_Date(ISerializationContext context, Date semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DslLogsPackage.Literals.DATE__ANNEE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslLogsPackage.Literals.DATE__ANNEE));
			if (transientValues.isValueTransient(semanticObject, DslLogsPackage.Literals.DATE__MOIS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslLogsPackage.Literals.DATE__MOIS));
			if (transientValues.isValueTransient(semanticObject, DslLogsPackage.Literals.DATE__JOUR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslLogsPackage.Literals.DATE__JOUR));
			if (transientValues.isValueTransient(semanticObject, DslLogsPackage.Literals.DATE__HEURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslLogsPackage.Literals.DATE__HEURE));
			if (transientValues.isValueTransient(semanticObject, DslLogsPackage.Literals.DATE__MINUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslLogsPackage.Literals.DATE__MINUTE));
			if (transientValues.isValueTransient(semanticObject, DslLogsPackage.Literals.DATE__SECONDE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslLogsPackage.Literals.DATE__SECONDE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDateAccess().getAnneeINTTerminalRuleCall_0_0(), semanticObject.getAnnee());
		feeder.accept(grammarAccess.getDateAccess().getMoisINTTerminalRuleCall_2_0(), semanticObject.getMois());
		feeder.accept(grammarAccess.getDateAccess().getJourINTTerminalRuleCall_4_0(), semanticObject.getJour());
		feeder.accept(grammarAccess.getDateAccess().getHeureINTTerminalRuleCall_6_0(), semanticObject.getHeure());
		feeder.accept(grammarAccess.getDateAccess().getMinuteINTTerminalRuleCall_8_0(), semanticObject.getMinute());
		feeder.accept(grammarAccess.getDateAccess().getSecondeINTTerminalRuleCall_10_0(), semanticObject.getSeconde());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Action returns Demande
	 *     Demande returns Demande
	 *
	 * Constraint:
	 *     page=STRING
	 */
	protected void sequence_Demande(ISerializationContext context, Demande semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DslLogsPackage.Literals.ACTION__PAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslLogsPackage.Literals.ACTION__PAGE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDemandeAccess().getPageSTRINGTerminalRuleCall_1_0(), semanticObject.getPage());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Log returns Log
	 *
	 * Constraint:
	 *     (date=Date utilisateur=Utilisateur action=Action parametre=Parametre? reponse=Reponse)
	 */
	protected void sequence_Log(ISerializationContext context, Log semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     logs+=Log+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Parametre returns Parametre
	 *
	 * Constraint:
	 *     (name=ID value=STRING)
	 */
	protected void sequence_Parametre(ISerializationContext context, Parametre semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DslLogsPackage.Literals.PARAMETRE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslLogsPackage.Literals.PARAMETRE__NAME));
			if (transientValues.isValueTransient(semanticObject, DslLogsPackage.Literals.PARAMETRE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslLogsPackage.Literals.PARAMETRE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParametreAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getParametreAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Utilisateur returns Utilisateur
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Utilisateur(ISerializationContext context, Utilisateur semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DslLogsPackage.Literals.UTILISATEUR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslLogsPackage.Literals.UTILISATEUR__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUtilisateurAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
