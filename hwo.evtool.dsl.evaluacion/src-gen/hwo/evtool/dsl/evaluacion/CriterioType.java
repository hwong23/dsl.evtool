/**
 * generated by Xtext 2.25.0
 */
package hwo.evtool.dsl.evaluacion;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Criterio Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hwo.evtool.dsl.evaluacion.CriterioType#getName <em>Name</em>}</li>
 *   <li>{@link hwo.evtool.dsl.evaluacion.CriterioType#getExpresion <em>Expresion</em>}</li>
 *   <li>{@link hwo.evtool.dsl.evaluacion.CriterioType#getSoporte <em>Soporte</em>}</li>
 * </ul>
 *
 * @see hwo.evtool.dsl.evaluacion.EvaluacionPackage#getCriterioType()
 * @model
 * @generated
 */
public interface CriterioType extends Criterio
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see hwo.evtool.dsl.evaluacion.EvaluacionPackage#getCriterioType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link hwo.evtool.dsl.evaluacion.CriterioType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Expresion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expresion</em>' containment reference.
   * @see #setExpresion(Expresion)
   * @see hwo.evtool.dsl.evaluacion.EvaluacionPackage#getCriterioType_Expresion()
   * @model containment="true"
   * @generated
   */
  Expresion getExpresion();

  /**
   * Sets the value of the '{@link hwo.evtool.dsl.evaluacion.CriterioType#getExpresion <em>Expresion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expresion</em>' containment reference.
   * @see #getExpresion()
   * @generated
   */
  void setExpresion(Expresion value);

  /**
   * Returns the value of the '<em><b>Soporte</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Soporte</em>' containment reference.
   * @see #setSoporte(Expresion)
   * @see hwo.evtool.dsl.evaluacion.EvaluacionPackage#getCriterioType_Soporte()
   * @model containment="true"
   * @generated
   */
  Expresion getSoporte();

  /**
   * Sets the value of the '{@link hwo.evtool.dsl.evaluacion.CriterioType#getSoporte <em>Soporte</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Soporte</em>' containment reference.
   * @see #getSoporte()
   * @generated
   */
  void setSoporte(Expresion value);

} // CriterioType
