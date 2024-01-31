/**
 * generated by Xtext 2.32.0
 */
package de.tud.st.featurelang.featureLang;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Datatype</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.tud.st.featurelang.featureLang.FeatureLangPackage#getDatatype()
 * @model
 * @generated
 */
public enum Datatype implements Enumerator
{
  /**
   * The '<em><b>DEFAULT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DEFAULT_VALUE
   * @generated
   * @ordered
   */
  DEFAULT(0, "DEFAULT", "DEFAULT"),

  /**
   * The '<em><b>WORD</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WORD_VALUE
   * @generated
   * @ordered
   */
  WORD(1, "WORD", "time"),

  /**
   * The '<em><b>PHRASE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PHRASE_VALUE
   * @generated
   * @ordered
   */
  PHRASE(2, "PHRASE", "phrase"),

  /**
   * The '<em><b>NUMBER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NUMBER_VALUE
   * @generated
   * @ordered
   */
  NUMBER(3, "NUMBER", "number");

  /**
   * The '<em><b>DEFAULT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DEFAULT
   * @model
   * @generated
   * @ordered
   */
  public static final int DEFAULT_VALUE = 0;

  /**
   * The '<em><b>WORD</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WORD
   * @model literal="time"
   * @generated
   * @ordered
   */
  public static final int WORD_VALUE = 1;

  /**
   * The '<em><b>PHRASE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PHRASE
   * @model literal="phrase"
   * @generated
   * @ordered
   */
  public static final int PHRASE_VALUE = 2;

  /**
   * The '<em><b>NUMBER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NUMBER
   * @model literal="number"
   * @generated
   * @ordered
   */
  public static final int NUMBER_VALUE = 3;

  /**
   * An array of all the '<em><b>Datatype</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Datatype[] VALUES_ARRAY =
    new Datatype[]
    {
      DEFAULT,
      WORD,
      PHRASE,
      NUMBER,
    };

  /**
   * A public read-only list of all the '<em><b>Datatype</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Datatype> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Datatype</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Datatype get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Datatype result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Datatype</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Datatype getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Datatype result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Datatype</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Datatype get(int value)
  {
    switch (value)
    {
      case DEFAULT_VALUE: return DEFAULT;
      case WORD_VALUE: return WORD;
      case PHRASE_VALUE: return PHRASE;
      case NUMBER_VALUE: return NUMBER;
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
  private Datatype(int value, String name, String literal)
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
  
} //Datatype
