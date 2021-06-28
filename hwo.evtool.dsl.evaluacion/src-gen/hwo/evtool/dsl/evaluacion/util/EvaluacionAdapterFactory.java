/**
 * generated by Xtext 2.25.0
 */
package hwo.evtool.dsl.evaluacion.util;

import hwo.evtool.dsl.evaluacion.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hwo.evtool.dsl.evaluacion.EvaluacionPackage
 * @generated
 */
public class EvaluacionAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EvaluacionPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EvaluacionAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = EvaluacionPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EvaluacionSwitch<Adapter> modelSwitch =
    new EvaluacionSwitch<Adapter>()
    {
      @Override
      public Adapter caseMaquinaEstados(MaquinaEstados object)
      {
        return createMaquinaEstadosAdapter();
      }
      @Override
      public Adapter caseEvento(Evento object)
      {
        return createEventoAdapter();
      }
      @Override
      public Adapter caseComando(Comando object)
      {
        return createComandoAdapter();
      }
      @Override
      public Adapter caseAtomo(Atomo object)
      {
        return createAtomoAdapter();
      }
      @Override
      public Adapter casePuntuacion(Puntuacion object)
      {
        return createPuntuacionAdapter();
      }
      @Override
      public Adapter caseEstado(Estado object)
      {
        return createEstadoAdapter();
      }
      @Override
      public Adapter caseTransicion(Transicion object)
      {
        return createTransicionAdapter();
      }
      @Override
      public Adapter caseIntConstant(IntConstant object)
      {
        return createIntConstantAdapter();
      }
      @Override
      public Adapter caseStringConstant(StringConstant object)
      {
        return createStringConstantAdapter();
      }
      @Override
      public Adapter caseSiNoConstant(SiNoConstant object)
      {
        return createSiNoConstantAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link hwo.evtool.dsl.evaluacion.MaquinaEstados <em>Maquina Estados</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hwo.evtool.dsl.evaluacion.MaquinaEstados
   * @generated
   */
  public Adapter createMaquinaEstadosAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hwo.evtool.dsl.evaluacion.Evento <em>Evento</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hwo.evtool.dsl.evaluacion.Evento
   * @generated
   */
  public Adapter createEventoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hwo.evtool.dsl.evaluacion.Comando <em>Comando</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hwo.evtool.dsl.evaluacion.Comando
   * @generated
   */
  public Adapter createComandoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hwo.evtool.dsl.evaluacion.Atomo <em>Atomo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hwo.evtool.dsl.evaluacion.Atomo
   * @generated
   */
  public Adapter createAtomoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hwo.evtool.dsl.evaluacion.Puntuacion <em>Puntuacion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hwo.evtool.dsl.evaluacion.Puntuacion
   * @generated
   */
  public Adapter createPuntuacionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hwo.evtool.dsl.evaluacion.Estado <em>Estado</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hwo.evtool.dsl.evaluacion.Estado
   * @generated
   */
  public Adapter createEstadoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hwo.evtool.dsl.evaluacion.Transicion <em>Transicion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hwo.evtool.dsl.evaluacion.Transicion
   * @generated
   */
  public Adapter createTransicionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hwo.evtool.dsl.evaluacion.IntConstant <em>Int Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hwo.evtool.dsl.evaluacion.IntConstant
   * @generated
   */
  public Adapter createIntConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hwo.evtool.dsl.evaluacion.StringConstant <em>String Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hwo.evtool.dsl.evaluacion.StringConstant
   * @generated
   */
  public Adapter createStringConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hwo.evtool.dsl.evaluacion.SiNoConstant <em>Si No Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hwo.evtool.dsl.evaluacion.SiNoConstant
   * @generated
   */
  public Adapter createSiNoConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //EvaluacionAdapterFactory
