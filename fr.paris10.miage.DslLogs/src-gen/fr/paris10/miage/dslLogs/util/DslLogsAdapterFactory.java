/**
 * generated by Xtext 2.10.0
 */
package fr.paris10.miage.dslLogs.util;

import fr.paris10.miage.dslLogs.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.paris10.miage.dslLogs.DslLogsPackage
 * @generated
 */
public class DslLogsAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DslLogsPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslLogsAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DslLogsPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DslLogsSwitch<Adapter> modelSwitch =
    new DslLogsSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseLog(Log object)
      {
        return createLogAdapter();
      }
      @Override
      public Adapter caseDate(Date object)
      {
        return createDateAdapter();
      }
      @Override
      public Adapter caseParametre(Parametre object)
      {
        return createParametreAdapter();
      }
      @Override
      public Adapter caseUtilisateur(Utilisateur object)
      {
        return createUtilisateurAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter caseDemande(Demande object)
      {
        return createDemandeAdapter();
      }
      @Override
      public Adapter caseAppel(Appel object)
      {
        return createAppelAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link fr.paris10.miage.dslLogs.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.paris10.miage.dslLogs.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.paris10.miage.dslLogs.Log <em>Log</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.paris10.miage.dslLogs.Log
   * @generated
   */
  public Adapter createLogAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.paris10.miage.dslLogs.Date <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.paris10.miage.dslLogs.Date
   * @generated
   */
  public Adapter createDateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.paris10.miage.dslLogs.Parametre <em>Parametre</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.paris10.miage.dslLogs.Parametre
   * @generated
   */
  public Adapter createParametreAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.paris10.miage.dslLogs.Utilisateur <em>Utilisateur</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.paris10.miage.dslLogs.Utilisateur
   * @generated
   */
  public Adapter createUtilisateurAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.paris10.miage.dslLogs.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.paris10.miage.dslLogs.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.paris10.miage.dslLogs.Demande <em>Demande</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.paris10.miage.dslLogs.Demande
   * @generated
   */
  public Adapter createDemandeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.paris10.miage.dslLogs.Appel <em>Appel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.paris10.miage.dslLogs.Appel
   * @generated
   */
  public Adapter createAppelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DslLogsAdapterFactory
