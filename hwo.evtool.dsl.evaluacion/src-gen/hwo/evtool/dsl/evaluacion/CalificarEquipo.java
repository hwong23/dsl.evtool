/**
 * generated by Xtext 2.25.0
 */
package hwo.evtool.dsl.evaluacion;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calificar Equipo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hwo.evtool.dsl.evaluacion.CalificarEquipo#getPuntuacion <em>Puntuacion</em>}</li>
 * </ul>
 *
 * @see hwo.evtool.dsl.evaluacion.EvaluacionPackage#getCalificarEquipo()
 * @model
 * @generated
 */
public interface CalificarEquipo extends Expresion
{
  /**
   * Returns the value of the '<em><b>Puntuacion</b></em>' attribute.
   * The literals are from the enumeration {@link hwo.evtool.dsl.evaluacion.E_Calificacion}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Puntuacion</em>' attribute.
   * @see hwo.evtool.dsl.evaluacion.E_Calificacion
   * @see #setPuntuacion(E_Calificacion)
   * @see hwo.evtool.dsl.evaluacion.EvaluacionPackage#getCalificarEquipo_Puntuacion()
   * @model
   * @generated
   */
  E_Calificacion getPuntuacion();

  /**
   * Sets the value of the '{@link hwo.evtool.dsl.evaluacion.CalificarEquipo#getPuntuacion <em>Puntuacion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Puntuacion</em>' attribute.
   * @see hwo.evtool.dsl.evaluacion.E_Calificacion
   * @see #getPuntuacion()
   * @generated
   */
  void setPuntuacion(E_Calificacion value);

} // CalificarEquipo
