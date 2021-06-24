/**
 * generated by Xtext 2.25.0
 */
package hwo.evtool.dsl.evaluacion;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maquina Estados</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hwo.evtool.dsl.evaluacion.MaquinaEstados#getEvents <em>Events</em>}</li>
 *   <li>{@link hwo.evtool.dsl.evaluacion.MaquinaEstados#getResetEvents <em>Reset Events</em>}</li>
 *   <li>{@link hwo.evtool.dsl.evaluacion.MaquinaEstados#getCommands <em>Commands</em>}</li>
 *   <li>{@link hwo.evtool.dsl.evaluacion.MaquinaEstados#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see hwo.evtool.dsl.evaluacion.EvaluacionPackage#getMaquinaEstados()
 * @model
 * @generated
 */
public interface MaquinaEstados extends EObject
{
  /**
   * Returns the value of the '<em><b>Events</b></em>' containment reference list.
   * The list contents are of type {@link hwo.evtool.dsl.evaluacion.Evento}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Events</em>' containment reference list.
   * @see hwo.evtool.dsl.evaluacion.EvaluacionPackage#getMaquinaEstados_Events()
   * @model containment="true"
   * @generated
   */
  EList<Evento> getEvents();

  /**
   * Returns the value of the '<em><b>Reset Events</b></em>' reference list.
   * The list contents are of type {@link hwo.evtool.dsl.evaluacion.Evento}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reset Events</em>' reference list.
   * @see hwo.evtool.dsl.evaluacion.EvaluacionPackage#getMaquinaEstados_ResetEvents()
   * @model
   * @generated
   */
  EList<Evento> getResetEvents();

  /**
   * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
   * The list contents are of type {@link hwo.evtool.dsl.evaluacion.Comando}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' containment reference list.
   * @see hwo.evtool.dsl.evaluacion.EvaluacionPackage#getMaquinaEstados_Commands()
   * @model containment="true"
   * @generated
   */
  EList<Comando> getCommands();

  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link hwo.evtool.dsl.evaluacion.Estado}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see hwo.evtool.dsl.evaluacion.EvaluacionPackage#getMaquinaEstados_States()
   * @model containment="true"
   * @generated
   */
  EList<Estado> getStates();

} // MaquinaEstados
