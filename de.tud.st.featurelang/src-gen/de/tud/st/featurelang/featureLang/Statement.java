/**
 * generated by Xtext 2.30.0
 */
package de.tud.st.featurelang.featureLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tud.st.featurelang.featureLang.Statement#getTarget <em>Target</em>}</li>
 *   <li>{@link de.tud.st.featurelang.featureLang.Statement#getPriority <em>Priority</em>}</li>
 *   <li>{@link de.tud.st.featurelang.featureLang.Statement#isNegation <em>Negation</em>}</li>
 *   <li>{@link de.tud.st.featurelang.featureLang.Statement#getAction <em>Action</em>}</li>
 *   <li>{@link de.tud.st.featurelang.featureLang.Statement#getUpdate <em>Update</em>}</li>
 * </ul>
 *
 * @see de.tud.st.featurelang.featureLang.FeatureLangPackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' containment reference.
   * @see #setTarget(de.tud.st.featurelang.featureLang.Class)
   * @see de.tud.st.featurelang.featureLang.FeatureLangPackage#getStatement_Target()
   * @model containment="true"
   * @generated
   */
  de.tud.st.featurelang.featureLang.Class getTarget();

  /**
   * Sets the value of the '{@link de.tud.st.featurelang.featureLang.Statement#getTarget <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' containment reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(de.tud.st.featurelang.featureLang.Class value);

  /**
   * Returns the value of the '<em><b>Priority</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Priority</em>' containment reference.
   * @see #setPriority(Priority)
   * @see de.tud.st.featurelang.featureLang.FeatureLangPackage#getStatement_Priority()
   * @model containment="true"
   * @generated
   */
  Priority getPriority();

  /**
   * Sets the value of the '{@link de.tud.st.featurelang.featureLang.Statement#getPriority <em>Priority</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Priority</em>' containment reference.
   * @see #getPriority()
   * @generated
   */
  void setPriority(Priority value);

  /**
   * Returns the value of the '<em><b>Negation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Negation</em>' attribute.
   * @see #setNegation(boolean)
   * @see de.tud.st.featurelang.featureLang.FeatureLangPackage#getStatement_Negation()
   * @model
   * @generated
   */
  boolean isNegation();

  /**
   * Sets the value of the '{@link de.tud.st.featurelang.featureLang.Statement#isNegation <em>Negation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Negation</em>' attribute.
   * @see #isNegation()
   * @generated
   */
  void setNegation(boolean value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference.
   * @see #setAction(Action)
   * @see de.tud.st.featurelang.featureLang.FeatureLangPackage#getStatement_Action()
   * @model containment="true"
   * @generated
   */
  Action getAction();

  /**
   * Sets the value of the '{@link de.tud.st.featurelang.featureLang.Statement#getAction <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' containment reference.
   * @see #getAction()
   * @generated
   */
  void setAction(Action value);

  /**
   * Returns the value of the '<em><b>Update</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Update</em>' containment reference.
   * @see #setUpdate(UpdateAction)
   * @see de.tud.st.featurelang.featureLang.FeatureLangPackage#getStatement_Update()
   * @model containment="true"
   * @generated
   */
  UpdateAction getUpdate();

  /**
   * Sets the value of the '{@link de.tud.st.featurelang.featureLang.Statement#getUpdate <em>Update</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Update</em>' containment reference.
   * @see #getUpdate()
   * @generated
   */
  void setUpdate(UpdateAction value);

} // Statement
