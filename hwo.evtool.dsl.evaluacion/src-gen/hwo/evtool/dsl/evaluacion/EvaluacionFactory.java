/**
 * generated by Xtext 2.24.0
 */
package hwo.evtool.dsl.evaluacion;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hwo.evtool.dsl.evaluacion.EvaluacionPackage
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
  EvaluacionFactory eINSTANCE = hwo.evtool.dsl.evaluacion.impl.EvaluacionFactoryImpl.init();

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
   * Returns a new object of class '<em>Evaluaciones</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Evaluaciones</em>'.
   * @generated
   */
  Evaluaciones createEvaluaciones();

  /**
   * Returns a new object of class '<em>Atomo</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atomo</em>'.
   * @generated
   */
  Atomo createAtomo();

  /**
   * Returns a new object of class '<em>Item Propuesta</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Item Propuesta</em>'.
   * @generated
   */
  ItemPropuesta createItemPropuesta();

  /**
   * Returns a new object of class '<em>Puntuacion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Puntuacion</em>'.
   * @generated
   */
  Puntuacion createPuntuacion();

  /**
   * Returns a new object of class '<em>Componente</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Componente</em>'.
   * @generated
   */
  Componente createComponente();

  /**
   * Returns a new object of class '<em>Transicion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transicion</em>'.
   * @generated
   */
  Transicion createTransicion();

  /**
   * Returns a new object of class '<em>Int Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Constant</em>'.
   * @generated
   */
  IntConstant createIntConstant();

  /**
   * Returns a new object of class '<em>Propt Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Propt Constant</em>'.
   * @generated
   */
  ProptConstant createProptConstant();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EvaluacionPackage getEvaluacionPackage();

} //EvaluacionFactory
