/**
 * generated by Xtext 2.32.0
 */
package de.tud.st.featurelang.featureLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tud.st.featurelang.featureLang.Class#getAbstraction <em>Abstraction</em>}</li>
 *   <li>{@link de.tud.st.featurelang.featureLang.Class#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see de.tud.st.featurelang.featureLang.FeatureLangPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends EObject
{
  /**
   * Returns the value of the '<em><b>Abstraction</b></em>' attribute.
   * The literals are from the enumeration {@link de.tud.st.featurelang.featureLang.Abstraction}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstraction</em>' attribute.
   * @see de.tud.st.featurelang.featureLang.Abstraction
   * @see #setAbstraction(Abstraction)
   * @see de.tud.st.featurelang.featureLang.FeatureLangPackage#getClass_Abstraction()
   * @model
   * @generated
   */
  Abstraction getAbstraction();

  /**
   * Sets the value of the '{@link de.tud.st.featurelang.featureLang.Class#getAbstraction <em>Abstraction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstraction</em>' attribute.
   * @see de.tud.st.featurelang.featureLang.Abstraction
   * @see #getAbstraction()
   * @generated
   */
  void setAbstraction(Abstraction value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.tud.st.featurelang.featureLang.FeatureLangPackage#getClass_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.tud.st.featurelang.featureLang.Class#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Class
