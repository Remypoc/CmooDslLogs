/**
 * generated by Xtext 2.10.0
 */
package fr.paris10.miage;

import fr.paris10.miage.DslLogsStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class DslLogsStandaloneSetup extends DslLogsStandaloneSetupGenerated {
  public static void doSetup() {
    DslLogsStandaloneSetup _dslLogsStandaloneSetup = new DslLogsStandaloneSetup();
    _dslLogsStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
