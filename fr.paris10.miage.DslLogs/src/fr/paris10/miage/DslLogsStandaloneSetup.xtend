/*
 * generated by Xtext 2.10.0
 */
package fr.paris10.miage


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class DslLogsStandaloneSetup extends DslLogsStandaloneSetupGenerated {

	def static void doSetup() {
		new DslLogsStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
