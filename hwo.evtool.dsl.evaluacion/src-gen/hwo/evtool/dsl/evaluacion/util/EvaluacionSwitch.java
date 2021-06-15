/**
 * generated by Xtext 2.25.0
 */
package hwo.evtool.dsl.evaluacion.util;

import hwo.evtool.dsl.evaluacion.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see hwo.evtool.dsl.evaluacion.EvaluacionPackage
 * @generated
 */
public class EvaluacionSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EvaluacionPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EvaluacionSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = EvaluacionPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case EvaluacionPackage.EVALUACION_MODEL:
      {
        EvaluacionModel evaluacionModel = (EvaluacionModel)theEObject;
        T result = caseEvaluacionModel(evaluacionModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EvaluacionPackage.CMPNT_EVALUACION:
      {
        CmpntEvaluacion cmpntEvaluacion = (CmpntEvaluacion)theEObject;
        T result = caseCmpntEvaluacion(cmpntEvaluacion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EvaluacionPackage.ATRIBUTOS:
      {
        Atributos atributos = (Atributos)theEObject;
        T result = caseAtributos(atributos);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EvaluacionPackage.CRITERIO:
      {
        Criterio criterio = (Criterio)theEObject;
        T result = caseCriterio(criterio);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EvaluacionPackage.CRITERIO_TYPE:
      {
        CriterioType criterioType = (CriterioType)theEObject;
        T result = caseCriterioType(criterioType);
        if (result == null) result = caseCriterio(criterioType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EvaluacionPackage.EXPRESION:
      {
        Expresion expresion = (Expresion)theEObject;
        T result = caseExpresion(expresion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EvaluacionPackage.ATOMO:
      {
        Atomo atomo = (Atomo)theEObject;
        T result = caseAtomo(atomo);
        if (result == null) result = caseExpresion(atomo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EvaluacionPackage.COMPLEJO_TYPE:
      {
        ComplejoType complejoType = (ComplejoType)theEObject;
        T result = caseComplejoType(complejoType);
        if (result == null) result = caseCriterio(complejoType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EvaluacionPackage.INT_CONSTANT:
      {
        IntConstant intConstant = (IntConstant)theEObject;
        T result = caseIntConstant(intConstant);
        if (result == null) result = caseAtomo(intConstant);
        if (result == null) result = caseExpresion(intConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EvaluacionPackage.STRING_CONSTANT:
      {
        StringConstant stringConstant = (StringConstant)theEObject;
        T result = caseStringConstant(stringConstant);
        if (result == null) result = caseAtomo(stringConstant);
        if (result == null) result = caseExpresion(stringConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EvaluacionPackage.BOOL_CONSTANT:
      {
        BoolConstant boolConstant = (BoolConstant)theEObject;
        T result = caseBoolConstant(boolConstant);
        if (result == null) result = caseAtomo(boolConstant);
        if (result == null) result = caseExpresion(boolConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvaluacionModel(EvaluacionModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cmpnt Evaluacion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cmpnt Evaluacion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCmpntEvaluacion(CmpntEvaluacion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atributos</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atributos</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtributos(Atributos object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Criterio</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Criterio</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCriterio(Criterio object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Criterio Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Criterio Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCriterioType(CriterioType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expresion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expresion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpresion(Expresion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atomo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atomo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtomo(Atomo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Complejo Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Complejo Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComplejoType(ComplejoType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntConstant(IntConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringConstant(StringConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bool Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolConstant(BoolConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //EvaluacionSwitch
