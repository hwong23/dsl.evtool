/**
 * generated by Xtext 2.25.0
 */
package hwo.evtool.dsl.evalcn.evaluacion.impl;

import hwo.evtool.dsl.evalcn.evaluacion.CalificarOtros;
import hwo.evtool.dsl.evalcn.evaluacion.EvaluacionPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calificar Otros</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hwo.evtool.dsl.evalcn.evaluacion.impl.CalificarOtrosImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link hwo.evtool.dsl.evalcn.evaluacion.impl.CalificarOtrosImpl#getValor <em>Valor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalificarOtrosImpl extends EvaluacionImpl implements CalificarOtros
{
  /**
   * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipo()
   * @generated
   * @ordered
   */
  protected static final String TIPO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipo()
   * @generated
   * @ordered
   */
  protected String tipo = TIPO_EDEFAULT;

  /**
   * The default value of the '{@link #getValor() <em>Valor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValor()
   * @generated
   * @ordered
   */
  protected static final int VALOR_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValor() <em>Valor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValor()
   * @generated
   * @ordered
   */
  protected int valor = VALOR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CalificarOtrosImpl()
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
    return EvaluacionPackage.Literals.CALIFICAR_OTROS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTipo()
  {
    return tipo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTipo(String newTipo)
  {
    String oldTipo = tipo;
    tipo = newTipo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EvaluacionPackage.CALIFICAR_OTROS__TIPO, oldTipo, tipo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValor()
  {
    return valor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setValor(int newValor)
  {
    int oldValor = valor;
    valor = newValor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EvaluacionPackage.CALIFICAR_OTROS__VALOR, oldValor, valor));
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
      case EvaluacionPackage.CALIFICAR_OTROS__TIPO:
        return getTipo();
      case EvaluacionPackage.CALIFICAR_OTROS__VALOR:
        return getValor();
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
      case EvaluacionPackage.CALIFICAR_OTROS__TIPO:
        setTipo((String)newValue);
        return;
      case EvaluacionPackage.CALIFICAR_OTROS__VALOR:
        setValor((Integer)newValue);
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
      case EvaluacionPackage.CALIFICAR_OTROS__TIPO:
        setTipo(TIPO_EDEFAULT);
        return;
      case EvaluacionPackage.CALIFICAR_OTROS__VALOR:
        setValor(VALOR_EDEFAULT);
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
      case EvaluacionPackage.CALIFICAR_OTROS__TIPO:
        return TIPO_EDEFAULT == null ? tipo != null : !TIPO_EDEFAULT.equals(tipo);
      case EvaluacionPackage.CALIFICAR_OTROS__VALOR:
        return valor != VALOR_EDEFAULT;
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
    result.append(" (tipo: ");
    result.append(tipo);
    result.append(", valor: ");
    result.append(valor);
    result.append(')');
    return result.toString();
  }

} //CalificarOtrosImpl
