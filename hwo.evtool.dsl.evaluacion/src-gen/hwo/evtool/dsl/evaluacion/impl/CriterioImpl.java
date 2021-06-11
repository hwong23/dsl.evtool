/**
 * generated by Xtext 2.25.0
 */
package hwo.evtool.dsl.evaluacion.impl;

import hwo.evtool.dsl.evaluacion.Criterio;
import hwo.evtool.dsl.evaluacion.CriterioType;
import hwo.evtool.dsl.evaluacion.EvaluacionPackage;
import hwo.evtool.dsl.evaluacion.Expresion;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Criterio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hwo.evtool.dsl.evaluacion.impl.CriterioImpl#getType <em>Type</em>}</li>
 *   <li>{@link hwo.evtool.dsl.evaluacion.impl.CriterioImpl#getName <em>Name</em>}</li>
 *   <li>{@link hwo.evtool.dsl.evaluacion.impl.CriterioImpl#getExpresion <em>Expresion</em>}</li>
 *   <li>{@link hwo.evtool.dsl.evaluacion.impl.CriterioImpl#getSoporte <em>Soporte</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CriterioImpl extends MinimalEObjectImpl.Container implements Criterio
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected CriterioType type;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpresion() <em>Expresion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpresion()
   * @generated
   * @ordered
   */
  protected Expresion expresion;

  /**
   * The cached value of the '{@link #getSoporte() <em>Soporte</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSoporte()
   * @generated
   * @ordered
   */
  protected Expresion soporte;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CriterioImpl()
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
    return EvaluacionPackage.Literals.CRITERIO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CriterioType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(CriterioType newType, NotificationChain msgs)
  {
    CriterioType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EvaluacionPackage.CRITERIO__TYPE, oldType, newType);
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
  public void setType(CriterioType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EvaluacionPackage.CRITERIO__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EvaluacionPackage.CRITERIO__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EvaluacionPackage.CRITERIO__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EvaluacionPackage.CRITERIO__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expresion getExpresion()
  {
    return expresion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpresion(Expresion newExpresion, NotificationChain msgs)
  {
    Expresion oldExpresion = expresion;
    expresion = newExpresion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EvaluacionPackage.CRITERIO__EXPRESION, oldExpresion, newExpresion);
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
  public void setExpresion(Expresion newExpresion)
  {
    if (newExpresion != expresion)
    {
      NotificationChain msgs = null;
      if (expresion != null)
        msgs = ((InternalEObject)expresion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EvaluacionPackage.CRITERIO__EXPRESION, null, msgs);
      if (newExpresion != null)
        msgs = ((InternalEObject)newExpresion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EvaluacionPackage.CRITERIO__EXPRESION, null, msgs);
      msgs = basicSetExpresion(newExpresion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EvaluacionPackage.CRITERIO__EXPRESION, newExpresion, newExpresion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expresion getSoporte()
  {
    return soporte;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSoporte(Expresion newSoporte, NotificationChain msgs)
  {
    Expresion oldSoporte = soporte;
    soporte = newSoporte;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EvaluacionPackage.CRITERIO__SOPORTE, oldSoporte, newSoporte);
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
  public void setSoporte(Expresion newSoporte)
  {
    if (newSoporte != soporte)
    {
      NotificationChain msgs = null;
      if (soporte != null)
        msgs = ((InternalEObject)soporte).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EvaluacionPackage.CRITERIO__SOPORTE, null, msgs);
      if (newSoporte != null)
        msgs = ((InternalEObject)newSoporte).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EvaluacionPackage.CRITERIO__SOPORTE, null, msgs);
      msgs = basicSetSoporte(newSoporte, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EvaluacionPackage.CRITERIO__SOPORTE, newSoporte, newSoporte));
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
      case EvaluacionPackage.CRITERIO__TYPE:
        return basicSetType(null, msgs);
      case EvaluacionPackage.CRITERIO__EXPRESION:
        return basicSetExpresion(null, msgs);
      case EvaluacionPackage.CRITERIO__SOPORTE:
        return basicSetSoporte(null, msgs);
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
      case EvaluacionPackage.CRITERIO__TYPE:
        return getType();
      case EvaluacionPackage.CRITERIO__NAME:
        return getName();
      case EvaluacionPackage.CRITERIO__EXPRESION:
        return getExpresion();
      case EvaluacionPackage.CRITERIO__SOPORTE:
        return getSoporte();
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
      case EvaluacionPackage.CRITERIO__TYPE:
        setType((CriterioType)newValue);
        return;
      case EvaluacionPackage.CRITERIO__NAME:
        setName((String)newValue);
        return;
      case EvaluacionPackage.CRITERIO__EXPRESION:
        setExpresion((Expresion)newValue);
        return;
      case EvaluacionPackage.CRITERIO__SOPORTE:
        setSoporte((Expresion)newValue);
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
      case EvaluacionPackage.CRITERIO__TYPE:
        setType((CriterioType)null);
        return;
      case EvaluacionPackage.CRITERIO__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EvaluacionPackage.CRITERIO__EXPRESION:
        setExpresion((Expresion)null);
        return;
      case EvaluacionPackage.CRITERIO__SOPORTE:
        setSoporte((Expresion)null);
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
      case EvaluacionPackage.CRITERIO__TYPE:
        return type != null;
      case EvaluacionPackage.CRITERIO__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EvaluacionPackage.CRITERIO__EXPRESION:
        return expresion != null;
      case EvaluacionPackage.CRITERIO__SOPORTE:
        return soporte != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //CriterioImpl
