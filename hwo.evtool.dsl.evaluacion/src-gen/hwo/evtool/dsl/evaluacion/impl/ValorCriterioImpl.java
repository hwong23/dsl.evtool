/**
 * generated by Xtext 2.25.0
 */
package hwo.evtool.dsl.evaluacion.impl;

import hwo.evtool.dsl.evaluacion.EvaluacionPackage;
import hwo.evtool.dsl.evaluacion.ValorCriterio;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Valor Criterio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hwo.evtool.dsl.evaluacion.impl.ValorCriterioImpl#getValorCriterio <em>Valor Criterio</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValorCriterioImpl extends MinimalEObjectImpl.Container implements ValorCriterio
{
  /**
   * The default value of the '{@link #getValorCriterio() <em>Valor Criterio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValorCriterio()
   * @generated
   * @ordered
   */
  protected static final String VALOR_CRITERIO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValorCriterio() <em>Valor Criterio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValorCriterio()
   * @generated
   * @ordered
   */
  protected String valorCriterio = VALOR_CRITERIO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ValorCriterioImpl()
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
    return EvaluacionPackage.Literals.VALOR_CRITERIO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getValorCriterio()
  {
    return valorCriterio;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setValorCriterio(String newValorCriterio)
  {
    String oldValorCriterio = valorCriterio;
    valorCriterio = newValorCriterio;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EvaluacionPackage.VALOR_CRITERIO__VALOR_CRITERIO, oldValorCriterio, valorCriterio));
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
      case EvaluacionPackage.VALOR_CRITERIO__VALOR_CRITERIO:
        return getValorCriterio();
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
      case EvaluacionPackage.VALOR_CRITERIO__VALOR_CRITERIO:
        setValorCriterio((String)newValue);
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
      case EvaluacionPackage.VALOR_CRITERIO__VALOR_CRITERIO:
        setValorCriterio(VALOR_CRITERIO_EDEFAULT);
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
      case EvaluacionPackage.VALOR_CRITERIO__VALOR_CRITERIO:
        return VALOR_CRITERIO_EDEFAULT == null ? valorCriterio != null : !VALOR_CRITERIO_EDEFAULT.equals(valorCriterio);
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (valorCriterio: ");
    result.append(valorCriterio);
    result.append(')');
    return result.toString();
  }

} //ValorCriterioImpl