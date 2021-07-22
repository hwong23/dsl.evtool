/**
 * generated by Xtext 2.25.0
 */
package hwo.evtool.dsl.evaluacion;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calificar Propuesta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hwo.evtool.dsl.evaluacion.CalificarPropuesta#getNumerador <em>Numerador</em>}</li>
 *   <li>{@link hwo.evtool.dsl.evaluacion.CalificarPropuesta#getDenominador <em>Denominador</em>}</li>
 * </ul>
 *
 * @see hwo.evtool.dsl.evaluacion.EvaluacionPackage#getCalificarPropuesta()
 * @model
 * @generated
 */
public interface CalificarPropuesta extends Expresion
{
  /**
   * Returns the value of the '<em><b>Numerador</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Numerador</em>' attribute.
   * @see #setNumerador(int)
   * @see hwo.evtool.dsl.evaluacion.EvaluacionPackage#getCalificarPropuesta_Numerador()
   * @model
   * @generated
   */
  int getNumerador();

  /**
   * Sets the value of the '{@link hwo.evtool.dsl.evaluacion.CalificarPropuesta#getNumerador <em>Numerador</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Numerador</em>' attribute.
   * @see #getNumerador()
   * @generated
   */
  void setNumerador(int value);

  /**
   * Returns the value of the '<em><b>Denominador</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Denominador</em>' attribute.
   * @see #setDenominador(int)
   * @see hwo.evtool.dsl.evaluacion.EvaluacionPackage#getCalificarPropuesta_Denominador()
   * @model
   * @generated
   */
  int getDenominador();

  /**
   * Sets the value of the '{@link hwo.evtool.dsl.evaluacion.CalificarPropuesta#getDenominador <em>Denominador</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Denominador</em>' attribute.
   * @see #getDenominador()
   * @generated
   */
  void setDenominador(int value);

} // CalificarPropuesta