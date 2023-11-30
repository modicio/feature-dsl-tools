/**
 * generated by Xtext 2.32.0
 */
package de.tud.st.featurelang.featureLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inheritance Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tud.st.featurelang.featureLang.InheritanceAction#getCreate <em>Create</em>}</li>
 *   <li>{@link de.tud.st.featurelang.featureLang.InheritanceAction#getEdit <em>Edit</em>}</li>
 * </ul>
 *
 * @see de.tud.st.featurelang.featureLang.FeatureLangPackage#getInheritanceAction()
 * @model
 * @generated
 */
public interface InheritanceAction extends EObject
{
  /**
   * Returns the value of the '<em><b>Create</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Create</em>' containment reference.
   * @see #setCreate(CreateInheritance)
   * @see de.tud.st.featurelang.featureLang.FeatureLangPackage#getInheritanceAction_Create()
   * @model containment="true"
   * @generated
   */
  CreateInheritance getCreate();

  /**
   * Sets the value of the '{@link de.tud.st.featurelang.featureLang.InheritanceAction#getCreate <em>Create</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Create</em>' containment reference.
   * @see #getCreate()
   * @generated
   */
  void setCreate(CreateInheritance value);

  /**
   * Returns the value of the '<em><b>Edit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Edit</em>' containment reference.
   * @see #setEdit(EditInheritance)
   * @see de.tud.st.featurelang.featureLang.FeatureLangPackage#getInheritanceAction_Edit()
   * @model containment="true"
   * @generated
   */
  EditInheritance getEdit();

  /**
   * Sets the value of the '{@link de.tud.st.featurelang.featureLang.InheritanceAction#getEdit <em>Edit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Edit</em>' containment reference.
   * @see #getEdit()
   * @generated
   */
  void setEdit(EditInheritance value);

} // InheritanceAction
