/**
 * generated by Xtext 2.24.0
 */
package hwo.evtool.dsl.evaluacion.impl;

import hwo.evtool.dsl.evaluacion.EvaluacionPackage;
import hwo.evtool.dsl.evaluacion.Puntuacion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Puntuacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hwo.evtool.dsl.evaluacion.impl.PuntuacionImpl#getNota <em>Nota</em>}</li>
 *   <li>{@link hwo.evtool.dsl.evaluacion.impl.PuntuacionImpl#getCalificacion <em>Calificacion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PuntuacionImpl extends MinimalEObjectImpl.Container implements Puntuacion
{
  /**
   * The default value of the '{@link #getNota() <em>Nota</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNota()
   * @generated
   * @ordered
   */
  protected static final int NOTA_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNota() <em>Nota</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNota()
   * @generated
   * @ordered
   */
  protected int nota = NOTA_EDEFAULT;

  /**
   * The default value of the '{@link #getCalificacion() <em>Calificacion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCalificacion()
   * @generated
   * @ordered
   */
  protected static final int CALIFICACION_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCalificacion() <em>Calificacion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCalificacion()
   * @generated
   * @ordered
   */
  protected int calificacion = CALIFICACION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PuntuacionImpl()
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
    return EvaluacionPackage.Literals.PUNTUACION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getNota()
  {
    return nota;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNota(int newNota)
  {
    int oldNota = nota;
    nota = newNota;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EvaluacionPackage.PUNTUACION__NOTA, oldNota, nota));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getCalificacion()
  {
    return calificacion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCalificacion(int newCalificacion)
  {
    int oldCalificacion = calificacion;
    calificacion = newCalificacion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EvaluacionPackage.PUNTUACION__CALIFICACION, oldCalificacion, calificacion));
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
      case EvaluacionPackage.PUNTUACION__NOTA:
        return getNota();
      case EvaluacionPackage.PUNTUACION__CALIFICACION:
        return getCalificacion();
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
      case EvaluacionPackage.PUNTUACION__NOTA:
        setNota((Integer)newValue);
        return;
      case EvaluacionPackage.PUNTUACION__CALIFICACION:
        setCalificacion((Integer)newValue);
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
      case EvaluacionPackage.PUNTUACION__NOTA:
        setNota(NOTA_EDEFAULT);
        return;
      case EvaluacionPackage.PUNTUACION__CALIFICACION:
        setCalificacion(CALIFICACION_EDEFAULT);
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
      case EvaluacionPackage.PUNTUACION__NOTA:
        return nota != NOTA_EDEFAULT;
      case EvaluacionPackage.PUNTUACION__CALIFICACION:
        return calificacion != CALIFICACION_EDEFAULT;
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
    result.append(" (nota: ");
    result.append(nota);
    result.append(", calificacion: ");
    result.append(calificacion);
    result.append(')');
    return result.toString();
  }

} //PuntuacionImpl
