/**
 * generated by Xtext 2.25.0
 */
package hwo.evtool.dsl.evalcn.evaluacion;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calificar Equipo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hwo.evtool.dsl.evalcn.evaluacion.CalificarEquipo#getTipo <em>Tipo</em>}</li>
 *   <li>{@link hwo.evtool.dsl.evalcn.evaluacion.CalificarEquipo#getFormacion <em>Formacion</em>}</li>
 *   <li>{@link hwo.evtool.dsl.evalcn.evaluacion.CalificarEquipo#getFormacionVal <em>Formacion Val</em>}</li>
 *   <li>{@link hwo.evtool.dsl.evalcn.evaluacion.CalificarEquipo#getExperiencia <em>Experiencia</em>}</li>
 *   <li>{@link hwo.evtool.dsl.evalcn.evaluacion.CalificarEquipo#getExperienciaVal <em>Experiencia Val</em>}</li>
 *   <li>{@link hwo.evtool.dsl.evalcn.evaluacion.CalificarEquipo#getCertificacion <em>Certificacion</em>}</li>
 *   <li>{@link hwo.evtool.dsl.evalcn.evaluacion.CalificarEquipo#getCertificacionVal <em>Certificacion Val</em>}</li>
 * </ul>
 *
 * @see hwo.evtool.dsl.evalcn.evaluacion.EvaluacionPackage#getCalificarEquipo()
 * @model
 * @generated
 */
public interface CalificarEquipo extends Evaluacion
{
  /**
   * Returns the value of the '<em><b>Tipo</b></em>' attribute.
   * The literals are from the enumeration {@link hwo.evtool.dsl.evalcn.evaluacion.TipoEquipo}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tipo</em>' attribute.
   * @see hwo.evtool.dsl.evalcn.evaluacion.TipoEquipo
   * @see #setTipo(TipoEquipo)
   * @see hwo.evtool.dsl.evalcn.evaluacion.EvaluacionPackage#getCalificarEquipo_Tipo()
   * @model
   * @generated
   */
  TipoEquipo getTipo();

  /**
   * Sets the value of the '{@link hwo.evtool.dsl.evalcn.evaluacion.CalificarEquipo#getTipo <em>Tipo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tipo</em>' attribute.
   * @see hwo.evtool.dsl.evalcn.evaluacion.TipoEquipo
   * @see #getTipo()
   * @generated
   */
  void setTipo(TipoEquipo value);

  /**
   * Returns the value of the '<em><b>Formacion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Formacion</em>' attribute.
   * @see #setFormacion(String)
   * @see hwo.evtool.dsl.evalcn.evaluacion.EvaluacionPackage#getCalificarEquipo_Formacion()
   * @model
   * @generated
   */
  String getFormacion();

  /**
   * Sets the value of the '{@link hwo.evtool.dsl.evalcn.evaluacion.CalificarEquipo#getFormacion <em>Formacion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Formacion</em>' attribute.
   * @see #getFormacion()
   * @generated
   */
  void setFormacion(String value);

  /**
   * Returns the value of the '<em><b>Formacion Val</b></em>' attribute.
   * The literals are from the enumeration {@link hwo.evtool.dsl.evalcn.evaluacion.TipoFormacion}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Formacion Val</em>' attribute.
   * @see hwo.evtool.dsl.evalcn.evaluacion.TipoFormacion
   * @see #setFormacionVal(TipoFormacion)
   * @see hwo.evtool.dsl.evalcn.evaluacion.EvaluacionPackage#getCalificarEquipo_FormacionVal()
   * @model
   * @generated
   */
  TipoFormacion getFormacionVal();

  /**
   * Sets the value of the '{@link hwo.evtool.dsl.evalcn.evaluacion.CalificarEquipo#getFormacionVal <em>Formacion Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Formacion Val</em>' attribute.
   * @see hwo.evtool.dsl.evalcn.evaluacion.TipoFormacion
   * @see #getFormacionVal()
   * @generated
   */
  void setFormacionVal(TipoFormacion value);

  /**
   * Returns the value of the '<em><b>Experiencia</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Experiencia</em>' attribute.
   * @see #setExperiencia(String)
   * @see hwo.evtool.dsl.evalcn.evaluacion.EvaluacionPackage#getCalificarEquipo_Experiencia()
   * @model
   * @generated
   */
  String getExperiencia();

  /**
   * Sets the value of the '{@link hwo.evtool.dsl.evalcn.evaluacion.CalificarEquipo#getExperiencia <em>Experiencia</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Experiencia</em>' attribute.
   * @see #getExperiencia()
   * @generated
   */
  void setExperiencia(String value);

  /**
   * Returns the value of the '<em><b>Experiencia Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Experiencia Val</em>' attribute.
   * @see #setExperienciaVal(int)
   * @see hwo.evtool.dsl.evalcn.evaluacion.EvaluacionPackage#getCalificarEquipo_ExperienciaVal()
   * @model
   * @generated
   */
  int getExperienciaVal();

  /**
   * Sets the value of the '{@link hwo.evtool.dsl.evalcn.evaluacion.CalificarEquipo#getExperienciaVal <em>Experiencia Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Experiencia Val</em>' attribute.
   * @see #getExperienciaVal()
   * @generated
   */
  void setExperienciaVal(int value);

  /**
   * Returns the value of the '<em><b>Certificacion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Certificacion</em>' attribute.
   * @see #setCertificacion(String)
   * @see hwo.evtool.dsl.evalcn.evaluacion.EvaluacionPackage#getCalificarEquipo_Certificacion()
   * @model
   * @generated
   */
  String getCertificacion();

  /**
   * Sets the value of the '{@link hwo.evtool.dsl.evalcn.evaluacion.CalificarEquipo#getCertificacion <em>Certificacion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Certificacion</em>' attribute.
   * @see #getCertificacion()
   * @generated
   */
  void setCertificacion(String value);

  /**
   * Returns the value of the '<em><b>Certificacion Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Certificacion Val</em>' attribute.
   * @see #setCertificacionVal(int)
   * @see hwo.evtool.dsl.evalcn.evaluacion.EvaluacionPackage#getCalificarEquipo_CertificacionVal()
   * @model
   * @generated
   */
  int getCertificacionVal();

  /**
   * Sets the value of the '{@link hwo.evtool.dsl.evalcn.evaluacion.CalificarEquipo#getCertificacionVal <em>Certificacion Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Certificacion Val</em>' attribute.
   * @see #getCertificacionVal()
   * @generated
   */
  void setCertificacionVal(int value);

} // CalificarEquipo
