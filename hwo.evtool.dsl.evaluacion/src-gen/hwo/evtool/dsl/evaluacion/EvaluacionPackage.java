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
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUACION_MODEL__ENTITIES = 0;

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
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CMPNT_EVALUACION__ATTRIBUTES = 2;

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
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITERIO__TYPE = 0;

  /**
   * The number of structural features of the '<em>Criterio</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITERIO_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hwo.evtool.dsl.evaluacion.impl.CriterioTypeImpl <em>Criterio Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hwo.evtool.dsl.evaluacion.impl.CriterioTypeImpl
   * @see hwo.evtool.dsl.evaluacion.impl.EvaluacionPackageImpl#getCriterioType()
   * @generated
   */
  int CRITERIO_TYPE = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITERIO_TYPE__TYPE = CRITERIO__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITERIO_TYPE__NAME = CRITERIO_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expresion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITERIO_TYPE__EXPRESION = CRITERIO_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Soporte</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITERIO_TYPE__SOPORTE = CRITERIO_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Criterio Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITERIO_TYPE_FEATURE_COUNT = CRITERIO_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link hwo.evtool.dsl.evaluacion.impl.ExpresionImpl <em>Expresion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hwo.evtool.dsl.evaluacion.impl.ExpresionImpl
   * @see hwo.evtool.dsl.evaluacion.impl.EvaluacionPackageImpl#getExpresion()
   * @generated
   */
  int EXPRESION = 4;

  /**
   * The number of structural features of the '<em>Expresion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link hwo.evtool.dsl.evaluacion.impl.AtomoImpl <em>Atomo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hwo.evtool.dsl.evaluacion.impl.AtomoImpl
   * @see hwo.evtool.dsl.evaluacion.impl.EvaluacionPackageImpl#getAtomo()
   * @generated
   */
  int ATOMO = 5;

  /**
   * The number of structural features of the '<em>Atomo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMO_FEATURE_COUNT = EXPRESION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hwo.evtool.dsl.evaluacion.impl.ComplejoTypeImpl <em>Complejo Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hwo.evtool.dsl.evaluacion.impl.ComplejoTypeImpl
   * @see hwo.evtool.dsl.evaluacion.impl.EvaluacionPackageImpl#getComplejoType()
   * @generated
   */
  int COMPLEJO_TYPE = 6;

  /**
   * The feature id for the '<em><b>Componente</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEJO_TYPE__COMPONENTE = 0;

  /**
   * The number of structural features of the '<em>Complejo Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEJO_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hwo.evtool.dsl.evaluacion.impl.IntConstantImpl <em>Int Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hwo.evtool.dsl.evaluacion.impl.IntConstantImpl
   * @see hwo.evtool.dsl.evaluacion.impl.EvaluacionPackageImpl#getIntConstant()
   * @generated
   */
  int INT_CONSTANT = 7;

  /**
   * The feature id for the '<em><b>Valor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_CONSTANT__VALOR = ATOMO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_CONSTANT_FEATURE_COUNT = ATOMO_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hwo.evtool.dsl.evaluacion.impl.StringConstantImpl <em>String Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hwo.evtool.dsl.evaluacion.impl.StringConstantImpl
   * @see hwo.evtool.dsl.evaluacion.impl.EvaluacionPackageImpl#getStringConstant()
   * @generated
   */
  int STRING_CONSTANT = 8;

  /**
   * The feature id for the '<em><b>Valor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_CONSTANT__VALOR = ATOMO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_CONSTANT_FEATURE_COUNT = ATOMO_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hwo.evtool.dsl.evaluacion.impl.BoolConstantImpl <em>Bool Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hwo.evtool.dsl.evaluacion.impl.BoolConstantImpl
   * @see hwo.evtool.dsl.evaluacion.impl.EvaluacionPackageImpl#getBoolConstant()
   * @generated
   */
  int BOOL_CONSTANT = 9;

  /**
   * The feature id for the '<em><b>Valor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_CONSTANT__VALOR = ATOMO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Bool Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_CONSTANT_FEATURE_COUNT = ATOMO_FEATURE_COUNT + 1;


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
   * Returns the meta object for the containment reference list '{@link hwo.evtool.dsl.evaluacion.EvaluacionModel#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see hwo.evtool.dsl.evaluacion.EvaluacionModel#getEntities()
   * @see #getEvaluacionModel()
   * @generated
   */
  EReference getEvaluacionModel_Entities();

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
   * Returns the meta object for the containment reference list '{@link hwo.evtool.dsl.evaluacion.CmpntEvaluacion#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see hwo.evtool.dsl.evaluacion.CmpntEvaluacion#getAttributes()
   * @see #getCmpntEvaluacion()
   * @generated
   */
  EReference getCmpntEvaluacion_Attributes();

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
   * Returns the meta object for the containment reference '{@link hwo.evtool.dsl.evaluacion.Criterio#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see hwo.evtool.dsl.evaluacion.Criterio#getType()
   * @see #getCriterio()
   * @generated
   */
  EReference getCriterio_Type();

  /**
   * Returns the meta object for class '{@link hwo.evtool.dsl.evaluacion.CriterioType <em>Criterio Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Criterio Type</em>'.
   * @see hwo.evtool.dsl.evaluacion.CriterioType
   * @generated
   */
  EClass getCriterioType();

  /**
   * Returns the meta object for the attribute '{@link hwo.evtool.dsl.evaluacion.CriterioType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hwo.evtool.dsl.evaluacion.CriterioType#getName()
   * @see #getCriterioType()
   * @generated
   */
  EAttribute getCriterioType_Name();

  /**
   * Returns the meta object for the containment reference '{@link hwo.evtool.dsl.evaluacion.CriterioType#getExpresion <em>Expresion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expresion</em>'.
   * @see hwo.evtool.dsl.evaluacion.CriterioType#getExpresion()
   * @see #getCriterioType()
   * @generated
   */
  EReference getCriterioType_Expresion();

  /**
   * Returns the meta object for the containment reference '{@link hwo.evtool.dsl.evaluacion.CriterioType#getSoporte <em>Soporte</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Soporte</em>'.
   * @see hwo.evtool.dsl.evaluacion.CriterioType#getSoporte()
   * @see #getCriterioType()
   * @generated
   */
  EReference getCriterioType_Soporte();

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
   * Returns the meta object for class '{@link hwo.evtool.dsl.evaluacion.Atomo <em>Atomo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atomo</em>'.
   * @see hwo.evtool.dsl.evaluacion.Atomo
   * @generated
   */
  EClass getAtomo();

  /**
   * Returns the meta object for class '{@link hwo.evtool.dsl.evaluacion.ComplejoType <em>Complejo Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Complejo Type</em>'.
   * @see hwo.evtool.dsl.evaluacion.ComplejoType
   * @generated
   */
  EClass getComplejoType();

  /**
   * Returns the meta object for the reference '{@link hwo.evtool.dsl.evaluacion.ComplejoType#getComponente <em>Componente</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Componente</em>'.
   * @see hwo.evtool.dsl.evaluacion.ComplejoType#getComponente()
   * @see #getComplejoType()
   * @generated
   */
  EReference getComplejoType_Componente();

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
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVALUACION_MODEL__ENTITIES = eINSTANCE.getEvaluacionModel_Entities();

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
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CMPNT_EVALUACION__ATTRIBUTES = eINSTANCE.getCmpntEvaluacion_Attributes();

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
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CRITERIO__TYPE = eINSTANCE.getCriterio_Type();

    /**
     * The meta object literal for the '{@link hwo.evtool.dsl.evaluacion.impl.CriterioTypeImpl <em>Criterio Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hwo.evtool.dsl.evaluacion.impl.CriterioTypeImpl
     * @see hwo.evtool.dsl.evaluacion.impl.EvaluacionPackageImpl#getCriterioType()
     * @generated
     */
    EClass CRITERIO_TYPE = eINSTANCE.getCriterioType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CRITERIO_TYPE__NAME = eINSTANCE.getCriterioType_Name();

    /**
     * The meta object literal for the '<em><b>Expresion</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CRITERIO_TYPE__EXPRESION = eINSTANCE.getCriterioType_Expresion();

    /**
     * The meta object literal for the '<em><b>Soporte</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CRITERIO_TYPE__SOPORTE = eINSTANCE.getCriterioType_Soporte();

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
     * The meta object literal for the '{@link hwo.evtool.dsl.evaluacion.impl.AtomoImpl <em>Atomo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hwo.evtool.dsl.evaluacion.impl.AtomoImpl
     * @see hwo.evtool.dsl.evaluacion.impl.EvaluacionPackageImpl#getAtomo()
     * @generated
     */
    EClass ATOMO = eINSTANCE.getAtomo();

    /**
     * The meta object literal for the '{@link hwo.evtool.dsl.evaluacion.impl.ComplejoTypeImpl <em>Complejo Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hwo.evtool.dsl.evaluacion.impl.ComplejoTypeImpl
     * @see hwo.evtool.dsl.evaluacion.impl.EvaluacionPackageImpl#getComplejoType()
     * @generated
     */
    EClass COMPLEJO_TYPE = eINSTANCE.getComplejoType();

    /**
     * The meta object literal for the '<em><b>Componente</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEJO_TYPE__COMPONENTE = eINSTANCE.getComplejoType_Componente();

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
