/*
 * generated by Xtext 2.10.0
 */
package fr.paris10.miage.validation

import org.eclipse.xtext.validation.Check
import fr.paris10.miage.dslLogs.Appel
import fr.paris10.miage.dslLogs.DslLogsPackage
import fr.paris10.miage.dslLogs.Model
import fr.paris10.miage.dslLogs.Demande

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class DslLogsValidator extends AbstractDslLogsValidator {

//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					DslLogsPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
	// V�rifier que les dates sont bien dans l'ordre chronologiques
	@Check(NORMAL)
	def checkDateOrdreChronologique(Model model) {
		/* model.logs
		 .map[date] //on r�cup�re toutes les dates */
	}

	public static val ERROR_EXT_JSP = "invalidExtension"

	// On v�rifie que les appels se font bien sur des pages jsp
	@Check(FAST)
	def checkAppelsJspPage(Appel appel) {
		if (!appel.page.endsWith(".jsp")) {
			warning("Extension invalide !", DslLogsPackage.Literals.APPEL__PARAMETRES, ERROR_EXT_JSP)
		}
	}

	// On v�rifie que les demandes se font bien sur des pages html
	@Check(FAST)
	def checkDemandesHtmlPage(Demande demande) {
		if (!demande.page.endsWith(".html")) {
			warning("Extension invalide !", DslLogsPackage.Literals.ACTION__PAGE, ERROR_EXT_JSP)
		}
	}
}