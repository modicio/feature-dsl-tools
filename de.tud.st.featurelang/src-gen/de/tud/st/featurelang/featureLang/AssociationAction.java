/**
 * generated by Xtext 2.30.0
 */
package de.tud.st.featurelang.featureLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tud.st.featurelang.featureLang.AssociationAction#getClass_ <em>Class</em>}</li>
 * </ul>
 *
 * @see de.tud.st.featurelang.featureLang.FeatureLangPackage#getAssociationAction()
 * @model
 * @generated
 */
public interface AssociationAction extends EObject
{
  /**
   * Returns the value of the '<em><b>Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' containment reference.
   * @see #setClass(de.tud.st.featurelang.featureLang.Class)
   * @see de.tud.st.featurelang.featureLang.FeatureLangPackage#getAssociationAction_Class()
   * @model containment="true"
   * @generated
   */
  de.tud.st.featurelang.featureLang.Class getClass_();

  /**
   * Sets the value of the '{@link de.tud.st.featurelang.featureLang.AssociationAction#getClass_ <em>Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' containment reference.
   * @see #getClass_()
   * @generated
   */
  void setClass(de.tud.st.featurelang.featureLang.Class value);

} // AssociationAction
