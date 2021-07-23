/**
 * generated by Xtext 2.25.0
 */
package hwo.evtool.dsl.evaluacion.impl;

import hwo.evtool.dsl.evaluacion.Evaluacion;
import hwo.evtool.dsl.evaluacion.EvaluacionPackage;
import hwo.evtool.dsl.evaluacion.TipoEvaluacion;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tipo Evaluacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hwo.evtool.dsl.evaluacion.impl.TipoEvaluacionImpl#getEvaluacion <em>Evaluacion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TipoEvaluacionImpl extends MinimalEObjectImpl.Container implements TipoEvaluacion
{
  /**
   * The cached value of the '{@link #getEvaluacion() <em>Evaluacion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvaluacion()
   * @generated
   * @ordered
   */
  protected Evaluacion evaluacion;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TipoEvaluacionImpl()
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
    return EvaluacionPackage.Literals.TIPO_EVALUACION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Evaluacion getEvaluacion()
  {
    return evaluacion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEvaluacion(Evaluacion newEvaluacion, NotificationChain msgs)
  {
    Evaluacion oldEvaluacion = evaluacion;
    evaluacion = newEvaluacion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EvaluacionPackage.TIPO_EVALUACION__EVALUACION, oldEvaluacion, newEvaluacion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEvaluacion(Evaluacion newEvaluacion)
  {
    if (newEvaluacion != evaluacion)
    {
      NotificationChain msgs = null;
      if (evaluacion != null)
        msgs = ((InternalEObject)evaluacion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EvaluacionPackage.TIPO_EVALUACION__EVALUACION, null, msgs);
      if (newEvaluacion != null)
        msgs = ((InternalEObject)newEvaluacion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EvaluacionPackage.TIPO_EVALUACION__EVALUACION, null, msgs);
      msgs = basicSetEvaluacion(newEvaluacion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EvaluacionPackage.TIPO_EVALUACION__EVALUACION, newEvaluacion, newEvaluacion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EvaluacionPackage.TIPO_EVALUACION__EVALUACION:
        return basicSetEvaluacion(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case EvaluacionPackage.TIPO_EVALUACION__EVALUACION:
        return getEvaluacion();
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
      case EvaluacionPackage.TIPO_EVALUACION__EVALUACION:
        setEvaluacion((Evaluacion)newValue);
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
      case EvaluacionPackage.TIPO_EVALUACION__EVALUACION:
        setEvaluacion((Evaluacion)null);
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
      case EvaluacionPackage.TIPO_EVALUACION__EVALUACION:
        return evaluacion != null;
    }
    return super.eIsSet(featureID);
  }

} //TipoEvaluacionImpl
