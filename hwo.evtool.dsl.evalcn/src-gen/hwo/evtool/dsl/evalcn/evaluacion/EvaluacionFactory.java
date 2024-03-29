/**
 * generated by Xtext 2.25.0
 */
package hwo.evtool.dsl.evalcn.evaluacion;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hwo.evtool.dsl.evalcn.evaluacion.EvaluacionPackage
 * @generated
 */
public interface EvaluacionFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EvaluacionFactory eINSTANCE = hwo.evtool.dsl.evalcn.evaluacion.impl.EvaluacionFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Maquina Estados</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Maquina Estados</em>'.
   * @generated
   */
  MaquinaEstados createMaquinaEstados();

  /**
   * Returns a new object of class '<em>Evento</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Evento</em>'.
   * @generated
   */
  Evento createEvento();

  /**
   * Returns a new object of class '<em>Componente</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Componente</em>'.
   * @generated
   */
  Componente createComponente();

  /**
   * Returns a new object of class '<em>Expresion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expresion</em>'.
   * @generated
   */
  Expresion createExpresion();

  /**
   * Returns a new object of class '<em>Tipo Evaluacion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tipo Evaluacion</em>'.
   * @generated
   */
  TipoEvaluacion createTipoEvaluacion();

  /**
   * Returns a new object of class '<em>Transicion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transicion</em>'.
   * @generated
   */
  Transicion createTransicion();

  /**
   * Returns a new object of class '<em>Evaluacion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Evaluacion</em>'.
   * @generated
   */
  Evaluacion createEvaluacion();

  /**
   * Returns a new object of class '<em>Criterio Propuesta</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Criterio Propuesta</em>'.
   * @generated
   */
  CriterioPropuesta createCriterioPropuesta();

  /**
   * Returns a new object of class '<em>Calificar Propuesta</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Calificar Propuesta</em>'.
   * @generated
   */
  CalificarPropuesta createCalificarPropuesta();

  /**
   * Returns a new object of class '<em>Calificar Equipo</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Calificar Equipo</em>'.
   * @generated
   */
  CalificarEquipo createCalificarEquipo();

  /**
   * Returns a new object of class '<em>Calificar Otros</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Calificar Otros</em>'.
   * @generated
   */
  CalificarOtros createCalificarOtros();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EvaluacionPackage getEvaluacionPackage();

} //EvaluacionFactory
