/**
 * generated by Xtext 2.25.0
 */
package hwo.evtool.dsl.evaluacion;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Estado</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hwo.evtool.dsl.evaluacion.Estado#getName <em>Name</em>}</li>
 *   <li>{@link hwo.evtool.dsl.evaluacion.Estado#getActions <em>Actions</em>}</li>
 *   <li>{@link hwo.evtool.dsl.evaluacion.Estado#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see hwo.evtool.dsl.evaluacion.EvaluacionPackage#getEstado()
 * @model
 * @generated
 */
public interface Estado extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see hwo.evtool.dsl.evaluacion.EvaluacionPackage#getEstado_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link hwo.evtool.dsl.evaluacion.Estado#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Actions</b></em>' reference list.
   * The list contents are of type {@link hwo.evtool.dsl.evaluacion.Comando}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' reference list.
   * @see hwo.evtool.dsl.evaluacion.EvaluacionPackage#getEstado_Actions()
   * @model
   * @generated
   */
  EList<Comando> getActions();

  /**
   * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
   * The list contents are of type {@link hwo.evtool.dsl.evaluacion.Transicion}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transitions</em>' containment reference list.
   * @see hwo.evtool.dsl.evaluacion.EvaluacionPackage#getEstado_Transitions()
   * @model containment="true"
   * @generated
   */
  EList<Transicion> getTransitions();

} // Estado
