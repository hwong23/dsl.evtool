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
 * A representation of the literals of the enumeration '<em><b>ECalificacion</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see hwo.evtool.dsl.evalcn.evaluacion.EvaluacionPackage#getE_Calificacion()
 * @model
 * @generated
 */
public enum E_Calificacion implements Enumerator
{
  /**
   * The '<em><b>Alto</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ALTO_VALUE
   * @generated
   * @ordered
   */
  ALTO(0, "alto", "A"),

  /**
   * The '<em><b>Medio</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MEDIO_VALUE
   * @generated
   * @ordered
   */
  MEDIO(1, "medio", "M"),

  /**
   * The '<em><b>Bajo</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BAJO_VALUE
   * @generated
   * @ordered
   */
  BAJO(2, "bajo", "B");

  /**
   * The '<em><b>Alto</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ALTO
   * @model name="alto" literal="A"
   * @generated
   * @ordered
   */
  public static final int ALTO_VALUE = 0;

  /**
   * The '<em><b>Medio</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MEDIO
   * @model name="medio" literal="M"
   * @generated
   * @ordered
   */
  public static final int MEDIO_VALUE = 1;

  /**
   * The '<em><b>Bajo</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BAJO
   * @model name="bajo" literal="B"
   * @generated
   * @ordered
   */
  public static final int BAJO_VALUE = 2;

  /**
   * An array of all the '<em><b>ECalificacion</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final E_Calificacion[] VALUES_ARRAY =
    new E_Calificacion[]
    {
      ALTO,
      MEDIO,
      BAJO,
    };

  /**
   * A public read-only list of all the '<em><b>ECalificacion</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<E_Calificacion> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>ECalificacion</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static E_Calificacion get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      E_Calificacion result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>ECalificacion</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static E_Calificacion getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      E_Calificacion result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>ECalificacion</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static E_Calificacion get(int value)
  {
    switch (value)
    {
      case ALTO_VALUE: return ALTO;
      case MEDIO_VALUE: return MEDIO;
      case BAJO_VALUE: return BAJO;
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
  private E_Calificacion(int value, String name, String literal)
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
  
} //E_Calificacion
