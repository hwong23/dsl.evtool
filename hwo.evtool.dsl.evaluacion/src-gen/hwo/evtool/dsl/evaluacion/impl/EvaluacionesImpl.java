/**
 * generated by Xtext 2.24.0
 */
package hwo.evtool.dsl.evaluacion.impl;

import hwo.evtool.dsl.evaluacion.EvaluacionPackage;
import hwo.evtool.dsl.evaluacion.Evaluaciones;
import hwo.evtool.dsl.evaluacion.Expresion;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluaciones</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hwo.evtool.dsl.evaluacion.impl.EvaluacionesImpl#getName <em>Name</em>}</li>
 *   <li>{@link hwo.evtool.dsl.evaluacion.impl.EvaluacionesImpl#getExpresion <em>Expresion</em>}</li>
 *   <li>{@link hwo.evtool.dsl.evaluacion.impl.EvaluacionesImpl#getComentario <em>Comentario</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvaluacionesImpl extends MinimalEObjectImpl.Container implements Evaluaciones
{
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
   * The default value of the '{@link #getComentario() <em>Comentario</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComentario()
   * @generated
   * @ordered
   */
  protected static final String COMENTARIO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getComentario() <em>Comentario</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComentario()
   * @generated
   * @ordered
   */
  protected String comentario = COMENTARIO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EvaluacionesImpl()
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
    return EvaluacionPackage.Literals.EVALUACIONES;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EvaluacionPackage.EVALUACIONES__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EvaluacionPackage.EVALUACIONES__EXPRESION, oldExpresion, newExpresion);
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
        msgs = ((InternalEObject)expresion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EvaluacionPackage.EVALUACIONES__EXPRESION, null, msgs);
      if (newExpresion != null)
        msgs = ((InternalEObject)newExpresion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EvaluacionPackage.EVALUACIONES__EXPRESION, null, msgs);
      msgs = basicSetExpresion(newExpresion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EvaluacionPackage.EVALUACIONES__EXPRESION, newExpresion, newExpresion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getComentario()
  {
    return comentario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setComentario(String newComentario)
  {
    String oldComentario = comentario;
    comentario = newComentario;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EvaluacionPackage.EVALUACIONES__COMENTARIO, oldComentario, comentario));
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
      case EvaluacionPackage.EVALUACIONES__EXPRESION:
        return basicSetExpresion(null, msgs);
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
      case EvaluacionPackage.EVALUACIONES__NAME:
        return getName();
      case EvaluacionPackage.EVALUACIONES__EXPRESION:
        return getExpresion();
      case EvaluacionPackage.EVALUACIONES__COMENTARIO:
        return getComentario();
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
      case EvaluacionPackage.EVALUACIONES__NAME:
        setName((String)newValue);
        return;
      case EvaluacionPackage.EVALUACIONES__EXPRESION:
        setExpresion((Expresion)newValue);
        return;
      case EvaluacionPackage.EVALUACIONES__COMENTARIO:
        setComentario((String)newValue);
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
      case EvaluacionPackage.EVALUACIONES__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EvaluacionPackage.EVALUACIONES__EXPRESION:
        setExpresion((Expresion)null);
        return;
      case EvaluacionPackage.EVALUACIONES__COMENTARIO:
        setComentario(COMENTARIO_EDEFAULT);
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
      case EvaluacionPackage.EVALUACIONES__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EvaluacionPackage.EVALUACIONES__EXPRESION:
        return expresion != null;
      case EvaluacionPackage.EVALUACIONES__COMENTARIO:
        return COMENTARIO_EDEFAULT == null ? comentario != null : !COMENTARIO_EDEFAULT.equals(comentario);
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
    result.append(", comentario: ");
    result.append(comentario);
    result.append(')');
    return result.toString();
  }

} //EvaluacionesImpl
