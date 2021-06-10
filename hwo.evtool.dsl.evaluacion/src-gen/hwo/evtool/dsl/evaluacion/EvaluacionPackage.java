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
   * The meta object id for the '{@link hwo.evtool.dsl.evaluacion.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hwo.evtool.dsl.evaluacion.impl.ModelImpl
   * @see hwo.evtool.dsl.evaluacion.impl.EvaluacionPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ENTITIES = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hwo.evtool.dsl.evaluacion.impl.CmpnntEvaluacionImpl <em>Cmpnnt Evaluacion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hwo.evtool.dsl.evaluacion.impl.CmpnntEvaluacionImpl
   * @see hwo.evtool.dsl.evaluacion.impl.EvaluacionPackageImpl#getCmpnntEvaluacion()
   * @generated
   */
  int CMPNNT_EVALUACION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CMPNNT_EVALUACION__NAME = 0;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CMPNNT_EVALUACION__SUPER_TYPE = 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CMPNNT_EVALUACION__ATTRIBUTES = 2;

  /**
   * The number of structural features of the '<em>Cmpnnt Evaluacion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CMPNNT_EVALUACION_FEATURE_COUNT = 3;

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
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITERIO__NAME = 1;

  /**
   * The number of structural features of the '<em>Criterio</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITERIO_FEATURE_COUNT = 2;

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
   * The feature id for the '<em><b>Element Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITERIO_TYPE__ELEMENT_TYPE = 0;

  /**
   * The feature id for the '<em><b>Array</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITERIO_TYPE__ARRAY = 1;

  /**
   * The feature id for the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITERIO_TYPE__LENGTH = 2;

  /**
   * The number of structural features of the '<em>Criterio Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITERIO_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link hwo.evtool.dsl.evaluacion.impl.ElementTypeImpl <em>Element Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hwo.evtool.dsl.evaluacion.impl.ElementTypeImpl
   * @see hwo.evtool.dsl.evaluacion.impl.EvaluacionPackageImpl#getElementType()
   * @generated
   */
  int ELEMENT_TYPE = 4;

  /**
   * The number of structural features of the '<em>Element Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link hwo.evtool.dsl.evaluacion.impl.BasicTypeImpl <em>Basic Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hwo.evtool.dsl.evaluacion.impl.BasicTypeImpl
   * @see hwo.evtool.dsl.evaluacion.impl.EvaluacionPackageImpl#getBasicType()
   * @generated
   */
  int BASIC_TYPE = 5;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE__TYPE_NAME = ELEMENT_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Basic Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE_FEATURE_COUNT = ELEMENT_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hwo.evtool.dsl.evaluacion.impl.ComponenteTypeImpl <em>Componente Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hwo.evtool.dsl.evaluacion.impl.ComponenteTypeImpl
   * @see hwo.evtool.dsl.evaluacion.impl.EvaluacionPackageImpl#getComponenteType()
   * @generated
   */
  int COMPONENTE_TYPE = 6;

  /**
   * The feature id for the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENTE_TYPE__ENTITY = ELEMENT_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Componente Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENTE_TYPE_FEATURE_COUNT = ELEMENT_TYPE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link hwo.evtool.dsl.evaluacion.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see hwo.evtool.dsl.evaluacion.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link hwo.evtool.dsl.evaluacion.Model#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see hwo.evtool.dsl.evaluacion.Model#getEntities()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Entities();

  /**
   * Returns the meta object for class '{@link hwo.evtool.dsl.evaluacion.CmpnntEvaluacion <em>Cmpnnt Evaluacion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cmpnnt Evaluacion</em>'.
   * @see hwo.evtool.dsl.evaluacion.CmpnntEvaluacion
   * @generated
   */
  EClass getCmpnntEvaluacion();

  /**
   * Returns the meta object for the attribute '{@link hwo.evtool.dsl.evaluacion.CmpnntEvaluacion#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hwo.evtool.dsl.evaluacion.CmpnntEvaluacion#getName()
   * @see #getCmpnntEvaluacion()
   * @generated
   */
  EAttribute getCmpnntEvaluacion_Name();

  /**
   * Returns the meta object for the reference '{@link hwo.evtool.dsl.evaluacion.CmpnntEvaluacion#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see hwo.evtool.dsl.evaluacion.CmpnntEvaluacion#getSuperType()
   * @see #getCmpnntEvaluacion()
   * @generated
   */
  EReference getCmpnntEvaluacion_SuperType();

  /**
   * Returns the meta object for the containment reference list '{@link hwo.evtool.dsl.evaluacion.CmpnntEvaluacion#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see hwo.evtool.dsl.evaluacion.CmpnntEvaluacion#getAttributes()
   * @see #getCmpnntEvaluacion()
   * @generated
   */
  EReference getCmpnntEvaluacion_Attributes();

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
   * Returns the meta object for class '{@link hwo.evtool.dsl.evaluacion.CriterioType <em>Criterio Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Criterio Type</em>'.
   * @see hwo.evtool.dsl.evaluacion.CriterioType
   * @generated
   */
  EClass getCriterioType();

  /**
   * Returns the meta object for the containment reference '{@link hwo.evtool.dsl.evaluacion.CriterioType#getElementType <em>Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element Type</em>'.
   * @see hwo.evtool.dsl.evaluacion.CriterioType#getElementType()
   * @see #getCriterioType()
   * @generated
   */
  EReference getCriterioType_ElementType();

  /**
   * Returns the meta object for the attribute '{@link hwo.evtool.dsl.evaluacion.CriterioType#isArray <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Array</em>'.
   * @see hwo.evtool.dsl.evaluacion.CriterioType#isArray()
   * @see #getCriterioType()
   * @generated
   */
  EAttribute getCriterioType_Array();

  /**
   * Returns the meta object for the attribute '{@link hwo.evtool.dsl.evaluacion.CriterioType#getLength <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Length</em>'.
   * @see hwo.evtool.dsl.evaluacion.CriterioType#getLength()
   * @see #getCriterioType()
   * @generated
   */
  EAttribute getCriterioType_Length();

  /**
   * Returns the meta object for class '{@link hwo.evtool.dsl.evaluacion.ElementType <em>Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Type</em>'.
   * @see hwo.evtool.dsl.evaluacion.ElementType
   * @generated
   */
  EClass getElementType();

  /**
   * Returns the meta object for class '{@link hwo.evtool.dsl.evaluacion.BasicType <em>Basic Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic Type</em>'.
   * @see hwo.evtool.dsl.evaluacion.BasicType
   * @generated
   */
  EClass getBasicType();

  /**
   * Returns the meta object for the attribute '{@link hwo.evtool.dsl.evaluacion.BasicType#getTypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type Name</em>'.
   * @see hwo.evtool.dsl.evaluacion.BasicType#getTypeName()
   * @see #getBasicType()
   * @generated
   */
  EAttribute getBasicType_TypeName();

  /**
   * Returns the meta object for class '{@link hwo.evtool.dsl.evaluacion.ComponenteType <em>Componente Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Componente Type</em>'.
   * @see hwo.evtool.dsl.evaluacion.ComponenteType
   * @generated
   */
  EClass getComponenteType();

  /**
   * Returns the meta object for the reference '{@link hwo.evtool.dsl.evaluacion.ComponenteType#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Entity</em>'.
   * @see hwo.evtool.dsl.evaluacion.ComponenteType#getEntity()
   * @see #getComponenteType()
   * @generated
   */
  EReference getComponenteType_Entity();

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
     * The meta object literal for the '{@link hwo.evtool.dsl.evaluacion.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hwo.evtool.dsl.evaluacion.impl.ModelImpl
     * @see hwo.evtool.dsl.evaluacion.impl.EvaluacionPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ENTITIES = eINSTANCE.getModel_Entities();

    /**
     * The meta object literal for the '{@link hwo.evtool.dsl.evaluacion.impl.CmpnntEvaluacionImpl <em>Cmpnnt Evaluacion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hwo.evtool.dsl.evaluacion.impl.CmpnntEvaluacionImpl
     * @see hwo.evtool.dsl.evaluacion.impl.EvaluacionPackageImpl#getCmpnntEvaluacion()
     * @generated
     */
    EClass CMPNNT_EVALUACION = eINSTANCE.getCmpnntEvaluacion();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CMPNNT_EVALUACION__NAME = eINSTANCE.getCmpnntEvaluacion_Name();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CMPNNT_EVALUACION__SUPER_TYPE = eINSTANCE.getCmpnntEvaluacion_SuperType();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CMPNNT_EVALUACION__ATTRIBUTES = eINSTANCE.getCmpnntEvaluacion_Attributes();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CRITERIO__NAME = eINSTANCE.getCriterio_Name();

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
     * The meta object literal for the '<em><b>Element Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CRITERIO_TYPE__ELEMENT_TYPE = eINSTANCE.getCriterioType_ElementType();

    /**
     * The meta object literal for the '<em><b>Array</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CRITERIO_TYPE__ARRAY = eINSTANCE.getCriterioType_Array();

    /**
     * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CRITERIO_TYPE__LENGTH = eINSTANCE.getCriterioType_Length();

    /**
     * The meta object literal for the '{@link hwo.evtool.dsl.evaluacion.impl.ElementTypeImpl <em>Element Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hwo.evtool.dsl.evaluacion.impl.ElementTypeImpl
     * @see hwo.evtool.dsl.evaluacion.impl.EvaluacionPackageImpl#getElementType()
     * @generated
     */
    EClass ELEMENT_TYPE = eINSTANCE.getElementType();

    /**
     * The meta object literal for the '{@link hwo.evtool.dsl.evaluacion.impl.BasicTypeImpl <em>Basic Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hwo.evtool.dsl.evaluacion.impl.BasicTypeImpl
     * @see hwo.evtool.dsl.evaluacion.impl.EvaluacionPackageImpl#getBasicType()
     * @generated
     */
    EClass BASIC_TYPE = eINSTANCE.getBasicType();

    /**
     * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BASIC_TYPE__TYPE_NAME = eINSTANCE.getBasicType_TypeName();

    /**
     * The meta object literal for the '{@link hwo.evtool.dsl.evaluacion.impl.ComponenteTypeImpl <em>Componente Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hwo.evtool.dsl.evaluacion.impl.ComponenteTypeImpl
     * @see hwo.evtool.dsl.evaluacion.impl.EvaluacionPackageImpl#getComponenteType()
     * @generated
     */
    EClass COMPONENTE_TYPE = eINSTANCE.getComponenteType();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENTE_TYPE__ENTITY = eINSTANCE.getComponenteType_Entity();

  }

} //EvaluacionPackage
