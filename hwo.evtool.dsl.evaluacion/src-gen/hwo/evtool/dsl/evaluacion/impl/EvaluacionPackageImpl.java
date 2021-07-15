/**
 * generated by Xtext 2.25.0
 */
package hwo.evtool.dsl.evaluacion.impl;

import hwo.evtool.dsl.evaluacion.Atomo;
import hwo.evtool.dsl.evaluacion.Componente;
import hwo.evtool.dsl.evaluacion.EvaluacionFactory;
import hwo.evtool.dsl.evaluacion.EvaluacionPackage;
import hwo.evtool.dsl.evaluacion.Evaluaciones;
import hwo.evtool.dsl.evaluacion.Evento;
import hwo.evtool.dsl.evaluacion.IntConstant;
import hwo.evtool.dsl.evaluacion.MaquinaEstados;
import hwo.evtool.dsl.evaluacion.Puntuacion;
import hwo.evtool.dsl.evaluacion.SiNoConstant;
import hwo.evtool.dsl.evaluacion.StringConstant;
import hwo.evtool.dsl.evaluacion.Transicion;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EvaluacionPackageImpl extends EPackageImpl implements EvaluacionPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass maquinaEstadosEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass evaluacionesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atomoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass puntuacionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componenteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transicionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass siNoConstantEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see hwo.evtool.dsl.evaluacion.EvaluacionPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private EvaluacionPackageImpl()
  {
    super(eNS_URI, EvaluacionFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link EvaluacionPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static EvaluacionPackage init()
  {
    if (isInited) return (EvaluacionPackage)EPackage.Registry.INSTANCE.getEPackage(EvaluacionPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredEvaluacionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    EvaluacionPackageImpl theEvaluacionPackage = registeredEvaluacionPackage instanceof EvaluacionPackageImpl ? (EvaluacionPackageImpl)registeredEvaluacionPackage : new EvaluacionPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theEvaluacionPackage.createPackageContents();

    // Initialize created meta-data
    theEvaluacionPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theEvaluacionPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(EvaluacionPackage.eNS_URI, theEvaluacionPackage);
    return theEvaluacionPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMaquinaEstados()
  {
    return maquinaEstadosEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMaquinaEstados_Events()
  {
    return (EReference)maquinaEstadosEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMaquinaEstados_ResetEvents()
  {
    return (EReference)maquinaEstadosEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMaquinaEstados_Commands()
  {
    return (EReference)maquinaEstadosEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMaquinaEstados_States()
  {
    return (EReference)maquinaEstadosEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getEvento()
  {
    return eventoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getEvento_Name()
  {
    return (EAttribute)eventoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getEvento_Code()
  {
    return (EAttribute)eventoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getEvaluaciones()
  {
    return evaluacionesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getEvaluaciones_Name()
  {
    return (EAttribute)evaluacionesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getEvaluaciones_Argumento()
  {
    return (EReference)evaluacionesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getEvaluaciones_Comentario()
  {
    return (EAttribute)evaluacionesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAtomo()
  {
    return atomoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPuntuacion()
  {
    return puntuacionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPuntuacion_Nota()
  {
    return (EAttribute)puntuacionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPuntuacion_Calificacion()
  {
    return (EAttribute)puntuacionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getComponente()
  {
    return componenteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getComponente_Name()
  {
    return (EAttribute)componenteEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getComponente_Actions()
  {
    return (EReference)componenteEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getComponente_Transitions()
  {
    return (EReference)componenteEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTransicion()
  {
    return transicionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTransicion_Event()
  {
    return (EReference)transicionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTransicion_State()
  {
    return (EReference)transicionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getIntConstant()
  {
    return intConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getIntConstant_Valor()
  {
    return (EReference)intConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStringConstant()
  {
    return stringConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getStringConstant_Valor()
  {
    return (EAttribute)stringConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSiNoConstant()
  {
    return siNoConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSiNoConstant_Valor()
  {
    return (EAttribute)siNoConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EvaluacionFactory getEvaluacionFactory()
  {
    return (EvaluacionFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    maquinaEstadosEClass = createEClass(MAQUINA_ESTADOS);
    createEReference(maquinaEstadosEClass, MAQUINA_ESTADOS__EVENTS);
    createEReference(maquinaEstadosEClass, MAQUINA_ESTADOS__RESET_EVENTS);
    createEReference(maquinaEstadosEClass, MAQUINA_ESTADOS__COMMANDS);
    createEReference(maquinaEstadosEClass, MAQUINA_ESTADOS__STATES);

    eventoEClass = createEClass(EVENTO);
    createEAttribute(eventoEClass, EVENTO__NAME);
    createEAttribute(eventoEClass, EVENTO__CODE);

    evaluacionesEClass = createEClass(EVALUACIONES);
    createEAttribute(evaluacionesEClass, EVALUACIONES__NAME);
    createEReference(evaluacionesEClass, EVALUACIONES__ARGUMENTO);
    createEAttribute(evaluacionesEClass, EVALUACIONES__COMENTARIO);

    atomoEClass = createEClass(ATOMO);

    puntuacionEClass = createEClass(PUNTUACION);
    createEAttribute(puntuacionEClass, PUNTUACION__NOTA);
    createEAttribute(puntuacionEClass, PUNTUACION__CALIFICACION);

    componenteEClass = createEClass(COMPONENTE);
    createEAttribute(componenteEClass, COMPONENTE__NAME);
    createEReference(componenteEClass, COMPONENTE__ACTIONS);
    createEReference(componenteEClass, COMPONENTE__TRANSITIONS);

    transicionEClass = createEClass(TRANSICION);
    createEReference(transicionEClass, TRANSICION__EVENT);
    createEReference(transicionEClass, TRANSICION__STATE);

    intConstantEClass = createEClass(INT_CONSTANT);
    createEReference(intConstantEClass, INT_CONSTANT__VALOR);

    stringConstantEClass = createEClass(STRING_CONSTANT);
    createEAttribute(stringConstantEClass, STRING_CONSTANT__VALOR);

    siNoConstantEClass = createEClass(SI_NO_CONSTANT);
    createEAttribute(siNoConstantEClass, SI_NO_CONSTANT__VALOR);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    intConstantEClass.getESuperTypes().add(this.getAtomo());
    stringConstantEClass.getESuperTypes().add(this.getAtomo());
    siNoConstantEClass.getESuperTypes().add(this.getAtomo());

    // Initialize classes and features; add operations and parameters
    initEClass(maquinaEstadosEClass, MaquinaEstados.class, "MaquinaEstados", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMaquinaEstados_Events(), this.getEvento(), null, "events", null, 0, -1, MaquinaEstados.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMaquinaEstados_ResetEvents(), this.getEvento(), null, "resetEvents", null, 0, -1, MaquinaEstados.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMaquinaEstados_Commands(), this.getEvaluaciones(), null, "commands", null, 0, -1, MaquinaEstados.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMaquinaEstados_States(), this.getComponente(), null, "states", null, 0, -1, MaquinaEstados.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventoEClass, Evento.class, "Evento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEvento_Name(), ecorePackage.getEString(), "name", null, 0, 1, Evento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEvento_Code(), ecorePackage.getEString(), "code", null, 0, 1, Evento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(evaluacionesEClass, Evaluaciones.class, "Evaluaciones", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEvaluaciones_Name(), ecorePackage.getEString(), "name", null, 0, 1, Evaluaciones.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEvaluaciones_Argumento(), this.getAtomo(), null, "argumento", null, 0, 1, Evaluaciones.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEvaluaciones_Comentario(), ecorePackage.getEString(), "comentario", null, 0, 1, Evaluaciones.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atomoEClass, Atomo.class, "Atomo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(puntuacionEClass, Puntuacion.class, "Puntuacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPuntuacion_Nota(), ecorePackage.getEInt(), "nota", null, 0, 1, Puntuacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPuntuacion_Calificacion(), ecorePackage.getEInt(), "calificacion", null, 0, 1, Puntuacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componenteEClass, Componente.class, "Componente", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComponente_Name(), ecorePackage.getEString(), "name", null, 0, 1, Componente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponente_Actions(), this.getEvaluaciones(), null, "actions", null, 0, -1, Componente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponente_Transitions(), this.getTransicion(), null, "transitions", null, 0, -1, Componente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transicionEClass, Transicion.class, "Transicion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransicion_Event(), this.getEvento(), null, "event", null, 0, 1, Transicion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransicion_State(), this.getComponente(), null, "state", null, 0, 1, Transicion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intConstantEClass, IntConstant.class, "IntConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIntConstant_Valor(), this.getPuntuacion(), null, "valor", null, 0, 1, IntConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringConstantEClass, StringConstant.class, "StringConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringConstant_Valor(), ecorePackage.getEString(), "valor", null, 0, 1, StringConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(siNoConstantEClass, SiNoConstant.class, "SiNoConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSiNoConstant_Valor(), ecorePackage.getEString(), "valor", null, 0, 1, SiNoConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //EvaluacionPackageImpl
