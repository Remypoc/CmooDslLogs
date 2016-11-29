/**
 * generated by Xtext 2.10.0
 */
package fr.paris10.miage.dslLogs.impl;

import fr.paris10.miage.dslLogs.Date;
import fr.paris10.miage.dslLogs.DslLogsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.paris10.miage.dslLogs.impl.DateImpl#getAnnee <em>Annee</em>}</li>
 *   <li>{@link fr.paris10.miage.dslLogs.impl.DateImpl#getMois <em>Mois</em>}</li>
 *   <li>{@link fr.paris10.miage.dslLogs.impl.DateImpl#getJour <em>Jour</em>}</li>
 *   <li>{@link fr.paris10.miage.dslLogs.impl.DateImpl#getHeure <em>Heure</em>}</li>
 *   <li>{@link fr.paris10.miage.dslLogs.impl.DateImpl#getMinute <em>Minute</em>}</li>
 *   <li>{@link fr.paris10.miage.dslLogs.impl.DateImpl#getSeconde <em>Seconde</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DateImpl extends MinimalEObjectImpl.Container implements Date
{
  /**
   * The default value of the '{@link #getAnnee() <em>Annee</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnee()
   * @generated
   * @ordered
   */
  protected static final int ANNEE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAnnee() <em>Annee</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnee()
   * @generated
   * @ordered
   */
  protected int annee = ANNEE_EDEFAULT;

  /**
   * The default value of the '{@link #getMois() <em>Mois</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMois()
   * @generated
   * @ordered
   */
  protected static final int MOIS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMois() <em>Mois</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMois()
   * @generated
   * @ordered
   */
  protected int mois = MOIS_EDEFAULT;

  /**
   * The default value of the '{@link #getJour() <em>Jour</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJour()
   * @generated
   * @ordered
   */
  protected static final int JOUR_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getJour() <em>Jour</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJour()
   * @generated
   * @ordered
   */
  protected int jour = JOUR_EDEFAULT;

  /**
   * The default value of the '{@link #getHeure() <em>Heure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeure()
   * @generated
   * @ordered
   */
  protected static final int HEURE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHeure() <em>Heure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeure()
   * @generated
   * @ordered
   */
  protected int heure = HEURE_EDEFAULT;

  /**
   * The default value of the '{@link #getMinute() <em>Minute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinute()
   * @generated
   * @ordered
   */
  protected static final int MINUTE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMinute() <em>Minute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinute()
   * @generated
   * @ordered
   */
  protected int minute = MINUTE_EDEFAULT;

  /**
   * The default value of the '{@link #getSeconde() <em>Seconde</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeconde()
   * @generated
   * @ordered
   */
  protected static final int SECONDE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSeconde() <em>Seconde</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeconde()
   * @generated
   * @ordered
   */
  protected int seconde = SECONDE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DateImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DslLogsPackage.Literals.DATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getAnnee()
  {
    return annee;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnnee(int newAnnee)
  {
    int oldAnnee = annee;
    annee = newAnnee;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslLogsPackage.DATE__ANNEE, oldAnnee, annee));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMois()
  {
    return mois;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMois(int newMois)
  {
    int oldMois = mois;
    mois = newMois;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslLogsPackage.DATE__MOIS, oldMois, mois));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getJour()
  {
    return jour;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJour(int newJour)
  {
    int oldJour = jour;
    jour = newJour;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslLogsPackage.DATE__JOUR, oldJour, jour));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getHeure()
  {
    return heure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeure(int newHeure)
  {
    int oldHeure = heure;
    heure = newHeure;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslLogsPackage.DATE__HEURE, oldHeure, heure));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMinute()
  {
    return minute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinute(int newMinute)
  {
    int oldMinute = minute;
    minute = newMinute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslLogsPackage.DATE__MINUTE, oldMinute, minute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSeconde()
  {
    return seconde;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSeconde(int newSeconde)
  {
    int oldSeconde = seconde;
    seconde = newSeconde;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslLogsPackage.DATE__SECONDE, oldSeconde, seconde));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DslLogsPackage.DATE__ANNEE:
        return getAnnee();
      case DslLogsPackage.DATE__MOIS:
        return getMois();
      case DslLogsPackage.DATE__JOUR:
        return getJour();
      case DslLogsPackage.DATE__HEURE:
        return getHeure();
      case DslLogsPackage.DATE__MINUTE:
        return getMinute();
      case DslLogsPackage.DATE__SECONDE:
        return getSeconde();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DslLogsPackage.DATE__ANNEE:
        setAnnee((Integer)newValue);
        return;
      case DslLogsPackage.DATE__MOIS:
        setMois((Integer)newValue);
        return;
      case DslLogsPackage.DATE__JOUR:
        setJour((Integer)newValue);
        return;
      case DslLogsPackage.DATE__HEURE:
        setHeure((Integer)newValue);
        return;
      case DslLogsPackage.DATE__MINUTE:
        setMinute((Integer)newValue);
        return;
      case DslLogsPackage.DATE__SECONDE:
        setSeconde((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DslLogsPackage.DATE__ANNEE:
        setAnnee(ANNEE_EDEFAULT);
        return;
      case DslLogsPackage.DATE__MOIS:
        setMois(MOIS_EDEFAULT);
        return;
      case DslLogsPackage.DATE__JOUR:
        setJour(JOUR_EDEFAULT);
        return;
      case DslLogsPackage.DATE__HEURE:
        setHeure(HEURE_EDEFAULT);
        return;
      case DslLogsPackage.DATE__MINUTE:
        setMinute(MINUTE_EDEFAULT);
        return;
      case DslLogsPackage.DATE__SECONDE:
        setSeconde(SECONDE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DslLogsPackage.DATE__ANNEE:
        return annee != ANNEE_EDEFAULT;
      case DslLogsPackage.DATE__MOIS:
        return mois != MOIS_EDEFAULT;
      case DslLogsPackage.DATE__JOUR:
        return jour != JOUR_EDEFAULT;
      case DslLogsPackage.DATE__HEURE:
        return heure != HEURE_EDEFAULT;
      case DslLogsPackage.DATE__MINUTE:
        return minute != MINUTE_EDEFAULT;
      case DslLogsPackage.DATE__SECONDE:
        return seconde != SECONDE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (annee: ");
    result.append(annee);
    result.append(", mois: ");
    result.append(mois);
    result.append(", jour: ");
    result.append(jour);
    result.append(", heure: ");
    result.append(heure);
    result.append(", minute: ");
    result.append(minute);
    result.append(", seconde: ");
    result.append(seconde);
    result.append(')');
    return result.toString();
  }

} //DateImpl
