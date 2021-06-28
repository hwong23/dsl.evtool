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
      case EvaluacionPackage.MAQUINA_ESTADOS: return createMaquinaEstados();
      case EvaluacionPackage.EVENTO: return createEvento();
      case EvaluacionPackage.COMANDO: return createComando();
      case EvaluacionPackage.ATOMO: return createAtomo();
      case EvaluacionPackage.ESTADO: return createEstado();
      case EvaluacionPackage.TRANSICION: return createTransicion();
      case EvaluacionPackage.INT_CONSTANT: return createIntConstant();
      case EvaluacionPackage.STRING_CONSTANT: return createStringConstant();
      case EvaluacionPackage.SI_NO_CONSTANT: return createSiNoConstant();
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
  public MaquinaEstados createMaquinaEstados()
  {
    MaquinaEstadosImpl maquinaEstados = new MaquinaEstadosImpl();
    return maquinaEstados;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Evento createEvento()
  {
    EventoImpl evento = new EventoImpl();
    return evento;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Comando createComando()
  {
    ComandoImpl comando = new ComandoImpl();
    return comando;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Atomo createAtomo()
  {
    AtomoImpl atomo = new AtomoImpl();
    return atomo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Estado createEstado()
  {
    EstadoImpl estado = new EstadoImpl();
    return estado;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Transicion createTransicion()
  {
    TransicionImpl transicion = new TransicionImpl();
    return transicion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntConstant createIntConstant()
  {
    IntConstantImpl intConstant = new IntConstantImpl();
    return intConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringConstant createStringConstant()
  {
    StringConstantImpl stringConstant = new StringConstantImpl();
    return stringConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SiNoConstant createSiNoConstant()
  {
    SiNoConstantImpl siNoConstant = new SiNoConstantImpl();
    return siNoConstant;
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
