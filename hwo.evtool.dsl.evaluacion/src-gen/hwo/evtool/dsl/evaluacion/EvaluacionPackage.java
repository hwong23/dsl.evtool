/**
 * generated by Xtext 2.25.0
 */
package hwo.evtool.dsl.evaluacion;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hwo.evtool.dsl.evaluacion.EvaluacionFactory
 * @model kind="package"
 * @generated
 */
public interface EvaluacionPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "evaluacion";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.evtool.hwo/dsl/Evaluacion";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "evaluacion";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EvaluacionPackage eINSTANCE = hwo.evtool.dsl.evaluacion.impl.EvaluacionPackageImpl.init();

  /**
   * The meta object id for the '{@link hwo.evtool.dsl.evaluacion.impl.EvaluacionModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hwo.evtool.dsl.evaluacion.impl.EvaluacionModelImpl
   * @see hwo.evtool.dsl.evaluacion.impl.EvaluacionPackageImpl#getEvaluacionModel()
   * @generated
   */
  int EVALUACION_MODEL = 0;

  /**
   * The feature id for the '<em><b>Componentes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUACION_MODEL__COMPONENTES = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUACION_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hwo.evtool.dsl.evaluacion.impl.CmpntEvaluacionImpl <em>Cmpnt Evaluacion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hwo.evtool.dsl.evaluacion.impl.CmpntEvaluacionImpl
   * @see hwo.evtool.dsl.evaluacion.impl.EvaluacionPackageImpl#getCmpntEvaluacion()
   * @generated
   */
  int CMPNT_EVALUACION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CMPNT_EVALUACION__NAME = 0;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CMPNT_EVALUACION__SUPER_TYPE = 1;

  /**
   * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CMPNT_EVALUACION__ATRIBUTOS = 2;

  /**
   * The number of structural features of the '<em>Cmpnt Evaluacion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CMPNT_EVALUACION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link hwo.evtool.dsl.evaluacion.impl.CriterioImpl <em>Criterio</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hwo.evtool.dsl.evaluacion.impl.CriterioImpl
   * @see hwo.evtool.dsl.evaluacion.impl.EvaluacionPackageImpl#getCriterio()
   * @generated
   */
  int CRITERIO = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITERIO__NAME = 0;

  /**
   * The feature id for the '<em><b>Expresion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITERIO__EXPRESION = 1;

  /**
   * The feature id for the '<em><b>Soporte</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITERIO__SOPORTE = 2;

  /**
   * The number of structural features of the '<em>Criterio</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITERIO_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link hwo.evtool.dsl.evaluacion.impl.ExpresionImpl <em>Expresion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hwo.evtool.dsl.evaluacion.impl.ExpresionImpl
   * @see hwo.evtool.dsl.evaluacion.impl.EvaluacionPackageImpl#getExpresion()
   * @generated
   */
  int EXPRESION = 3;

  /**
   * The number of structural features of the '<em>Expresion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link hwo.evtool.dsl.evaluacion.impl.CriterioComplejoTypeImpl <em>Criterio Complejo Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hwo.evtool.dsl.evaluacion.impl.CriterioComplejoTypeImpl
   * @see hwo.evtool.dsl.evaluacion.impl.EvaluacionPackageImpl#getCriterioComplejoType()
   * @generated
   */
  int CRITERIO_COMPLEJO_TYPE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITERIO_COMPLEJO_TYPE__NAME = CRITERIO__NAME;

  /**
   * The feature id for the '<em><b>Expresion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITERIO_COMPLEJO_TYPE__EXPRESION = CRITERIO__EXPRESION;

  /**
   * The feature id for the '<em><b>Soporte</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITERIO_COMPLEJO_TYPE__SOPORTE = CRITERIO__SOPORTE;

  /**
   * The feature id for the '<em><b>Componente</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITERIO_COMPLEJO_TYPE__COMPONENTE = CRITERIO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Criterio Complejo Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITERIO_COMPLEJO_TYPE_FEATURE_COUNT = CRITERIO_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hwo.evtool.dsl.evaluacion.impl.IntConstantImpl <em>Int Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hwo.evtool.dsl.evaluacion.impl.IntConstantImpl
   * @see hwo.evtool.dsl.evaluacion.impl.EvaluacionPackageImpl#getIntConstant()
   * @generated
   */
  int INT_CONSTANT = 5;

  /**
   * The feature id for the '<em><b>Valor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_CONSTANT__VALOR = EXPRESION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_CONSTANT_FEATURE_COUNT = EXPRESION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hwo.evtool.dsl.evaluacion.impl.StringConstantImpl <em>String Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hwo.evtool.dsl.evaluacion.impl.StringConstantImpl
   * @see hwo.evtool.dsl.evaluacion.impl.EvaluacionPackageImpl#getStringConstant()
   * @generated
   */
  int STRING_CONSTANT = 6;

  /**
   * The feature id for the '<em><b>Valor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_CONSTANT__VALOR = EXPRESION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_CONSTANT_FEATURE_COUNT = EXPRESION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hwo.evtool.dsl.evaluacion.impl.BoolConstantImpl <em>Bool Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hwo.evtool.dsl.evaluacion.impl.BoolConstantImpl
   * @see hwo.evtool.dsl.evaluacion.impl.EvaluacionPackageImpl#getBoolConstant()
   * @generated
   */
  int BOOL_CONSTANT = 7;

  /**
   * The feature id for the '<em><b>Valor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_CONSTANT__VALOR = EXPRESION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Bool Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_CONSTANT_FEATURE_COUNT = EXPRESION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link hwo.evtool.dsl.evaluacion.EvaluacionModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see hwo.evtool.dsl.evaluacion.EvaluacionModel
   * @generated
   */
  EClass getEvaluacionModel();

  /**
   * Returns the meta object for the containment reference list '{@link hwo.evtool.dsl.evaluacion.EvaluacionModel#getComponentes <em>Componentes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Componentes</em>'.
   * @see hwo.evtool.dsl.evaluacion.EvaluacionModel#getComponentes()
   * @see #getEvaluacionModel()
   * @generated
   */
  EReference getEvaluacionModel_Componentes();

  /**
   * Returns the meta object for class '{@link hwo.evtool.dsl.evaluacion.CmpntEvaluacion <em>Cmpnt Evaluacion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cmpnt Evaluacion</em>'.
   * @see hwo.evtool.dsl.evaluacion.CmpntEvaluacion
   * @generated
   */
  EClass getCmpntEvaluacion();

  /**
   * Returns the meta object for the attribute '{@link hwo.evtool.dsl.evaluacion.CmpntEvaluacion#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hwo.evtool.dsl.evaluacion.CmpntEvaluacion#getName()
   * @see #getCmpntEvaluacion()
   * @generated
   */
  EAttribute getCmpntEvaluacion_Name();

  /**
   * Returns the meta object for the reference '{@link hwo.evtool.dsl.evaluacion.CmpntEvaluacion#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see hwo.evtool.dsl.evaluacion.CmpntEvaluacion#getSuperType()
   * @see #getCmpntEvaluacion()
   * @generated
   */
  EReference getCmpntEvaluacion_SuperType();

  /**
   * Returns the meta object for the containment reference list '{@link hwo.evtool.dsl.evaluacion.CmpntEvaluacion#getAtributos <em>Atributos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Atributos</em>'.
   * @see hwo.evtool.dsl.evaluacion.CmpntEvaluacion#getAtributos()
   * @see #getCmpntEvaluacion()
   * @generated
   */
  EReference getCmpntEvaluacion_Atributos();

  /**
   * Returns the meta object for class '{@link hwo.evtool.dsl.evaluacion.Criterio <em>Criterio</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Criterio</em>'.
   * @see hwo.evtool.dsl.evaluacion.Criterio
   * @generated
   */
  EClass getCriterio();

  /**
   * Returns the meta object for the attribute '{@link hwo.evtool.dsl.evaluacion.Criterio#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hwo.evtool.dsl.evaluacion.Criterio#getName()
   * @see #getCriterio()
   * @generated
   */
  EAttribute getCriterio_Name();

  /**
   * Returns the meta object for the containment reference '{@link hwo.evtool.dsl.evaluacion.Criterio#getExpresion <em>Expresion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expresion</em>'.
   * @see hwo.evtool.dsl.evaluacion.Criterio#getExpresion()
   * @see #getCriterio()
   * @generated
   */
  EReference getCriterio_Expresion();

  /**
   * Returns the meta object for the containment reference '{@link hwo.evtool.dsl.evaluacion.Criterio#getSoporte <em>Soporte</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Soporte</em>'.
   * @see hwo.evtool.dsl.evaluacion.Criterio#getSoporte()
   * @see #getCriterio()
   * @generated
   */
  EReference getCriterio_Soporte();

  /**
   * Returns the meta object for class '{@link hwo.evtool.dsl.evaluacion.Expresion <em>Expresion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expresion</em>'.
   * @see hwo.evtool.dsl.evaluacion.Expresion
   * @generated
   */
  EClass getExpresion();

  /**
   * Returns the meta object for class '{@link hwo.evtool.dsl.evaluacion.CriterioComplejoType <em>Criterio Complejo Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Criterio Complejo Type</em>'.
   * @see hwo.evtool.dsl.evaluacion.CriterioComplejoType
   * @generated
   */
  EClass getCriterioComplejoType();

  /**
   * Returns the meta object for the reference '{@link hwo.evtool.dsl.evaluacion.CriterioComplejoType#getComponente <em>Componente</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Componente</em>'.
   * @see hwo.evtool.dsl.evaluacion.CriterioComplejoType#getComponente()
   * @see #getCriterioComplejoType()
   * @generated
   */
  EReference getCriterioComplejoType_Componente();

  /**
   * Returns the meta object for class '{@link hwo.evtool.dsl.evaluacion.IntConstant <em>Int Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Constant</em>'.
   * @see hwo.evtool.dsl.evaluacion.IntConstant
   * @generated
   */
  EClass getIntConstant();

  /**
   * Returns the meta object for the attribute '{@link hwo.evtool.dsl.evaluacion.IntConstant#getValor <em>Valor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Valor</em>'.
   * @see hwo.evtool.dsl.evaluacion.IntConstant#getValor()
   * @see #getIntConstant()
   * @generated
   */
  EAttribute getIntConstant_Valor();

  /**
   * Returns the meta object for class '{@link hwo.evtool.dsl.evaluacion.StringConstant <em>String Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Constant</em>'.
   * @see hwo.evtool.dsl.evaluacion.StringConstant
   * @generated
   */
  EClass getStringConstant();

  /**
   * Returns the meta object for the attribute '{@link hwo.evtool.dsl.evaluacion.StringConstant#getValor <em>Valor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Valor</em>'.
   * @see hwo.evtool.dsl.evaluacion.StringConstant#getValor()
   * @see #getStringConstant()
   * @generated
   */
  EAttribute getStringConstant_Valor();

  /**
   * Returns the meta object for class '{@link hwo.evtool.dsl.evaluacion.BoolConstant <em>Bool Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bool Constant</em>'.
   * @see hwo.evtool.dsl.evaluacion.BoolConstant
   * @generated
   */
  EClass getBoolConstant();

  /**
   * Returns the meta object for the attribute '{@link hwo.evtool.dsl.evaluacion.BoolConstant#getValor <em>Valor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Valor</em>'.
   * @see hwo.evtool.dsl.evaluacion.BoolConstant#getValor()
   * @see #getBoolConstant()
   * @generated
   */
  EAttribute getBoolConstant_Valor();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EvaluacionFactory getEvaluacionFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link hwo.evtool.dsl.evaluacion.impl.EvaluacionModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hwo.evtool.dsl.evaluacion.impl.EvaluacionModelImpl
     * @see hwo.evtool.dsl.evaluacion.impl.EvaluacionPackageImpl#getEvaluacionModel()
     * @generated
     */
    EClass EVALUACION_MODEL = eINSTANCE.getEvaluacionModel();

    /**
     * The meta object literal for the '<em><b>Componentes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVALUACION_MODEL__COMPONENTES = eINSTANCE.getEvaluacionModel_Componentes();

    /**
     * The meta object literal for the '{@link hwo.evtool.dsl.evaluacion.impl.CmpntEvaluacionImpl <em>Cmpnt Evaluacion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hwo.evtool.dsl.evaluacion.impl.CmpntEvaluacionImpl
     * @see hwo.evtool.dsl.evaluacion.impl.EvaluacionPackageImpl#getCmpntEvaluacion()
     * @generated
     */
    EClass CMPNT_EVALUACION = eINSTANCE.getCmpntEvaluacion();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CMPNT_EVALUACION__NAME = eINSTANCE.getCmpntEvaluacion_Name();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CMPNT_EVALUACION__SUPER_TYPE = eINSTANCE.getCmpntEvaluacion_SuperType();

    /**
     * The meta object literal for the '<em><b>Atributos</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CMPNT_EVALUACION__ATRIBUTOS = eINSTANCE.getCmpntEvaluacion_Atributos();

    /**
     * The meta object literal for the '{@link hwo.evtool.dsl.evaluacion.impl.CriterioImpl <em>Criterio</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hwo.evtool.dsl.evaluacion.impl.CriterioImpl
     * @see hwo.evtool.dsl.evaluacion.impl.EvaluacionPackageImpl#getCriterio()
     * @generated
     */
    EClass CRITERIO = eINSTANCE.getCriterio();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CRITERIO__NAME = eINSTANCE.getCriterio_Name();

    /**
     * The meta object literal for the '<em><b>Expresion</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CRITERIO__EXPRESION = eINSTANCE.getCriterio_Expresion();

    /**
     * The meta object literal for the '<em><b>Soporte</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CRITERIO__SOPORTE = eINSTANCE.getCriterio_Soporte();

    /**
     * The meta object literal for the '{@link hwo.evtool.dsl.evaluacion.impl.ExpresionImpl <em>Expresion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hwo.evtool.dsl.evaluacion.impl.ExpresionImpl
     * @see hwo.evtool.dsl.evaluacion.impl.EvaluacionPackageImpl#getExpresion()
     * @generated
     */
    EClass EXPRESION = eINSTANCE.getExpresion();

    /**
     * The meta object literal for the '{@link hwo.evtool.dsl.evaluacion.impl.CriterioComplejoTypeImpl <em>Criterio Complejo Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hwo.evtool.dsl.evaluacion.impl.CriterioComplejoTypeImpl
     * @see hwo.evtool.dsl.evaluacion.impl.EvaluacionPackageImpl#getCriterioComplejoType()
     * @generated
     */
    EClass CRITERIO_COMPLEJO_TYPE = eINSTANCE.getCriterioComplejoType();

    /**
     * The meta object literal for the '<em><b>Componente</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CRITERIO_COMPLEJO_TYPE__COMPONENTE = eINSTANCE.getCriterioComplejoType_Componente();

    /**
     * The meta object literal for the '{@link hwo.evtool.dsl.evaluacion.impl.IntConstantImpl <em>Int Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hwo.evtool.dsl.evaluacion.impl.IntConstantImpl
     * @see hwo.evtool.dsl.evaluacion.impl.EvaluacionPackageImpl#getIntConstant()
     * @generated
     */
    EClass INT_CONSTANT = eINSTANCE.getIntConstant();

    /**
     * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_CONSTANT__VALOR = eINSTANCE.getIntConstant_Valor();

    /**
     * The meta object literal for the '{@link hwo.evtool.dsl.evaluacion.impl.StringConstantImpl <em>String Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hwo.evtool.dsl.evaluacion.impl.StringConstantImpl
     * @see hwo.evtool.dsl.evaluacion.impl.EvaluacionPackageImpl#getStringConstant()
     * @generated
     */
    EClass STRING_CONSTANT = eINSTANCE.getStringConstant();

    /**
     * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_CONSTANT__VALOR = eINSTANCE.getStringConstant_Valor();

    /**
     * The meta object literal for the '{@link hwo.evtool.dsl.evaluacion.impl.BoolConstantImpl <em>Bool Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hwo.evtool.dsl.evaluacion.impl.BoolConstantImpl
     * @see hwo.evtool.dsl.evaluacion.impl.EvaluacionPackageImpl#getBoolConstant()
     * @generated
     */
    EClass BOOL_CONSTANT = eINSTANCE.getBoolConstant();

    /**
     * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOL_CONSTANT__VALOR = eINSTANCE.getBoolConstant_Valor();

  }

} //EvaluacionPackage
