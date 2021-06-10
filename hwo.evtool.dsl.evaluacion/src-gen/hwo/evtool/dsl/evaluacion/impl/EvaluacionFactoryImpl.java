/**
 * generated by Xtext 2.25.0
 */
package hwo.evtool.dsl.evaluacion.impl;

import hwo.evtool.dsl.evaluacion.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EvaluacionFactoryImpl extends EFactoryImpl implements EvaluacionFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EvaluacionFactory init()
  {
    try
    {
      EvaluacionFactory theEvaluacionFactory = (EvaluacionFactory)EPackage.Registry.INSTANCE.getEFactory(EvaluacionPackage.eNS_URI);
      if (theEvaluacionFactory != null)
      {
        return theEvaluacionFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EvaluacionFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EvaluacionFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case EvaluacionPackage.MODEL: return createModel();
      case EvaluacionPackage.CMPNNT_EVALUACION: return createCmpnntEvaluacion();
      case EvaluacionPackage.CRITERIO: return createCriterio();
      case EvaluacionPackage.CRITERIO_TYPE: return createCriterioType();
      case EvaluacionPackage.ELEMENT_TYPE: return createElementType();
      case EvaluacionPackage.BASIC_TYPE: return createBasicType();
      case EvaluacionPackage.COMPONENTE_TYPE: return createComponenteType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CmpnntEvaluacion createCmpnntEvaluacion()
  {
    CmpnntEvaluacionImpl cmpnntEvaluacion = new CmpnntEvaluacionImpl();
    return cmpnntEvaluacion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Criterio createCriterio()
  {
    CriterioImpl criterio = new CriterioImpl();
    return criterio;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CriterioType createCriterioType()
  {
    CriterioTypeImpl criterioType = new CriterioTypeImpl();
    return criterioType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ElementType createElementType()
  {
    ElementTypeImpl elementType = new ElementTypeImpl();
    return elementType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BasicType createBasicType()
  {
    BasicTypeImpl basicType = new BasicTypeImpl();
    return basicType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ComponenteType createComponenteType()
  {
    ComponenteTypeImpl componenteType = new ComponenteTypeImpl();
    return componenteType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EvaluacionPackage getEvaluacionPackage()
  {
    return (EvaluacionPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EvaluacionPackage getPackage()
  {
    return EvaluacionPackage.eINSTANCE;
  }

} //EvaluacionFactoryImpl
