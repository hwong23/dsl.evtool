/**
 * generated by Xtext 2.25.0
 */
package hwo.evtool.dsl.evaluacion;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hwo.evtool.dsl.evaluacion.Model#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @see hwo.evtool.dsl.evaluacion.EvaluacionPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
   * The list contents are of type {@link hwo.evtool.dsl.evaluacion.CmpnntEvaluacion}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entities</em>' containment reference list.
   * @see hwo.evtool.dsl.evaluacion.EvaluacionPackage#getModel_Entities()
   * @model containment="true"
   * @generated
   */
  EList<CmpnntEvaluacion> getEntities();

} // Model
