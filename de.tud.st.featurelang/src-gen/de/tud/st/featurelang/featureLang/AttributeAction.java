/**
 * generated by Xtext 2.30.0
 */
package de.tud.st.featurelang.featureLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tud.st.featurelang.featureLang.AttributeAction#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link de.tud.st.featurelang.featureLang.AttributeAction#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.tud.st.featurelang.featureLang.FeatureLangPackage#getAttributeAction()
 * @model
 * @generated
 */
public interface AttributeAction extends EObject
{
  /**
   * Returns the value of the '<em><b>Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' containment reference.
   * @see #setAttribute(Attribute)
   * @see de.tud.st.featurelang.featureLang.FeatureLangPackage#getAttributeAction_Attribute()
   * @model containment="true"
   * @generated
   */
  Attribute getAttribute();

  /**
   * Sets the value of the '{@link de.tud.st.featurelang.featureLang.AttributeAction#getAttribute <em>Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' containment reference.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(Attribute value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link de.tud.st.featurelang.featureLang.Datatype}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see de.tud.st.featurelang.featureLang.Datatype
   * @see #setType(Datatype)
   * @see de.tud.st.featurelang.featureLang.FeatureLangPackage#getAttributeAction_Type()
   * @model
   * @generated
   */
  Datatype getType();

  /**
   * Sets the value of the '{@link de.tud.st.featurelang.featureLang.AttributeAction#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see de.tud.st.featurelang.featureLang.Datatype
   * @see #getType()
   * @generated
   */
  void setType(Datatype value);

} // AttributeAction
