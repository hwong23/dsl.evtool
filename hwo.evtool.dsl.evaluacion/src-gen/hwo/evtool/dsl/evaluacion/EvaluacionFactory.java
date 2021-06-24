/**
 * generated by Xtext 2.25.0
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
   * Returns a new object of class '<em>Comando</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comando</em>'.
   * @generated
   */
  Comando createComando();

  /**
   * Returns a new object of class '<em>Estado</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Estado</em>'.
   * @generated
   */
  Estado createEstado();

  /**
   * Returns a new object of class '<em>Transicion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transicion</em>'.
   * @generated
   */
  Transicion createTransicion();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EvaluacionPackage getEvaluacionPackage();

} //EvaluacionFactory
