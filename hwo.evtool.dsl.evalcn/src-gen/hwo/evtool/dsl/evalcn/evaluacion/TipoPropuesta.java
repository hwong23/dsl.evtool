/**
 * generated by Xtext 2.25.0
 */
package hwo.evtool.dsl.evalcn.evaluacion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tipo Propuesta</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see hwo.evtool.dsl.evalcn.evaluacion.EvaluacionPackage#getTipoPropuesta()
 * @model
 * @generated
 */
public enum TipoPropuesta implements Enumerator
{
  /**
   * The '<em><b>Evaluar Problema</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EVALUAR_PROBLEMA_VALUE
   * @generated
   * @ordered
   */
  EVALUAR_PROBLEMA(0, "EvaluarProblema", "EvaluarProblema"),

  /**
   * The '<em><b>Evaluar Tecnica</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EVALUAR_TECNICA_VALUE
   * @generated
   * @ordered
   */
  EVALUAR_TECNICA(1, "EvaluarTecnica", "EvaluarTecnica"),

  /**
   * The '<em><b>Evaluar Otros</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EVALUAR_OTROS_VALUE
   * @generated
   * @ordered
   */
  EVALUAR_OTROS(2, "EvaluarOtros", "EvaluarOtros");

  /**
   * The '<em><b>Evaluar Problema</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EVALUAR_PROBLEMA
   * @model name="EvaluarProblema"
   * @generated
   * @ordered
   */
  public static final int EVALUAR_PROBLEMA_VALUE = 0;

  /**
   * The '<em><b>Evaluar Tecnica</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EVALUAR_TECNICA
   * @model name="EvaluarTecnica"
   * @generated
   * @ordered
   */
  public static final int EVALUAR_TECNICA_VALUE = 1;

  /**
   * The '<em><b>Evaluar Otros</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EVALUAR_OTROS
   * @model name="EvaluarOtros"
   * @generated
   * @ordered
   */
  public static final int EVALUAR_OTROS_VALUE = 2;

  /**
   * An array of all the '<em><b>Tipo Propuesta</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final TipoPropuesta[] VALUES_ARRAY =
    new TipoPropuesta[]
    {
      EVALUAR_PROBLEMA,
      EVALUAR_TECNICA,
      EVALUAR_OTROS,
    };

  /**
   * A public read-only list of all the '<em><b>Tipo Propuesta</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<TipoPropuesta> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Tipo Propuesta</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static TipoPropuesta get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      TipoPropuesta result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Tipo Propuesta</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static TipoPropuesta getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      TipoPropuesta result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Tipo Propuesta</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static TipoPropuesta get(int value)
  {
    switch (value)
    {
      case EVALUAR_PROBLEMA_VALUE: return EVALUAR_PROBLEMA;
      case EVALUAR_TECNICA_VALUE: return EVALUAR_TECNICA;
      case EVALUAR_OTROS_VALUE: return EVALUAR_OTROS;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private TipoPropuesta(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //TipoPropuesta
