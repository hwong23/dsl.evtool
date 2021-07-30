/**
 * generated by Xtext 2.25.0
 */
package hwo.evtool.dsl.evalcn.evaluacion;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Criterio Propuesta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hwo.evtool.dsl.evalcn.evaluacion.CriterioPropuesta#getCriterio <em>Criterio</em>}</li>
 *   <li>{@link hwo.evtool.dsl.evalcn.evaluacion.CriterioPropuesta#getPuntuacion <em>Puntuacion</em>}</li>
 * </ul>
 *
 * @see hwo.evtool.dsl.evalcn.evaluacion.EvaluacionPackage#getCriterioPropuesta()
 * @model
 * @generated
 */
public interface CriterioPropuesta extends EObject
{
  /**
   * Returns the value of the '<em><b>Criterio</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Criterio</em>' attribute.
   * @see #setCriterio(String)
   * @see hwo.evtool.dsl.evalcn.evaluacion.EvaluacionPackage#getCriterioPropuesta_Criterio()
   * @model
   * @generated
   */
  String getCriterio();

  /**
   * Sets the value of the '{@link hwo.evtool.dsl.evalcn.evaluacion.CriterioPropuesta#getCriterio <em>Criterio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Criterio</em>' attribute.
   * @see #getCriterio()
   * @generated
   */
  void setCriterio(String value);

  /**
   * Returns the value of the '<em><b>Puntuacion</b></em>' attribute.
   * The literals are from the enumeration {@link hwo.evtool.dsl.evalcn.evaluacion.E_Calificacion}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Puntuacion</em>' attribute.
   * @see hwo.evtool.dsl.evalcn.evaluacion.E_Calificacion
   * @see #setPuntuacion(E_Calificacion)
   * @see hwo.evtool.dsl.evalcn.evaluacion.EvaluacionPackage#getCriterioPropuesta_Puntuacion()
   * @model
   * @generated
   */
  E_Calificacion getPuntuacion();

  /**
   * Sets the value of the '{@link hwo.evtool.dsl.evalcn.evaluacion.CriterioPropuesta#getPuntuacion <em>Puntuacion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Puntuacion</em>' attribute.
   * @see hwo.evtool.dsl.evalcn.evaluacion.E_Calificacion
   * @see #getPuntuacion()
   * @generated
   */
  void setPuntuacion(E_Calificacion value);

} // CriterioPropuesta
