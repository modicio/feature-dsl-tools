/**
 * generated by Xtext 2.32.0
 */
package de.tud.st.featurelang.featureLang;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.tud.st.featurelang.featureLang.FeatureLangPackage
 * @generated
 */
public interface FeatureLangFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FeatureLangFactory eINSTANCE = de.tud.st.featurelang.featureLang.impl.FeatureLangFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Feature Request</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Request</em>'.
   * @generated
   */
  FeatureRequest createFeatureRequest();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Change Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Change Statement</em>'.
   * @generated
   */
  ChangeStatement createChangeStatement();

  /**
   * Returns a new object of class '<em>Creation Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Creation Statement</em>'.
   * @generated
   */
  CreationStatement createCreationStatement();

  /**
   * Returns a new object of class '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action</em>'.
   * @generated
   */
  Action createAction();

  /**
   * Returns a new object of class '<em>Update Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Update Action</em>'.
   * @generated
   */
  UpdateAction createUpdateAction();

  /**
   * Returns a new object of class '<em>Update Attribute Datatype</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Update Attribute Datatype</em>'.
   * @generated
   */
  UpdateAttributeDatatype createUpdateAttributeDatatype();

  /**
   * Returns a new object of class '<em>Update Attribute Identifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Update Attribute Identifier</em>'.
   * @generated
   */
  UpdateAttributeIdentifier createUpdateAttributeIdentifier();

  /**
   * Returns a new object of class '<em>Update Attribute Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Update Attribute Value</em>'.
   * @generated
   */
  UpdateAttributeValue createUpdateAttributeValue();

  /**
   * Returns a new object of class '<em>Attribute Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Action</em>'.
   * @generated
   */
  AttributeAction createAttributeAction();

  /**
   * Returns a new object of class '<em>Association Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Association Action</em>'.
   * @generated
   */
  AssociationAction createAssociationAction();

  /**
   * Returns a new object of class '<em>Create Association</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Create Association</em>'.
   * @generated
   */
  CreateAssociation createCreateAssociation();

  /**
   * Returns a new object of class '<em>Edit Association</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Edit Association</em>'.
   * @generated
   */
  EditAssociation createEditAssociation();

  /**
   * Returns a new object of class '<em>Set Compatible</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Compatible</em>'.
   * @generated
   */
  SetCompatible createSetCompatible();

  /**
   * Returns a new object of class '<em>Set Version Range</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Version Range</em>'.
   * @generated
   */
  SetVersionRange createSetVersionRange();

  /**
   * Returns a new object of class '<em>Set Variant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Variant</em>'.
   * @generated
   */
  SetVariant createSetVariant();

  /**
   * Returns a new object of class '<em>Set Right Open</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Right Open</em>'.
   * @generated
   */
  SetRightOpen createSetRightOpen();

  /**
   * Returns a new object of class '<em>Set Left Open</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Left Open</em>'.
   * @generated
   */
  SetLeftOpen createSetLeftOpen();

  /**
   * Returns a new object of class '<em>Inheritance Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inheritance Action</em>'.
   * @generated
   */
  InheritanceAction createInheritanceAction();

  /**
   * Returns a new object of class '<em>Composition Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composition Action</em>'.
   * @generated
   */
  CompositionAction createCompositionAction();

  /**
   * Returns a new object of class '<em>Create Composition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Create Composition</em>'.
   * @generated
   */
  CreateComposition createCreateComposition();

  /**
   * Returns a new object of class '<em>Edit Composition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Edit Composition</em>'.
   * @generated
   */
  EditComposition createEditComposition();

  /**
   * Returns a new object of class '<em>Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class</em>'.
   * @generated
   */
  Class createClass();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Identifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Identifier</em>'.
   * @generated
   */
  Identifier createIdentifier();

  /**
   * Returns a new object of class '<em>Priority</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Priority</em>'.
   * @generated
   */
  Priority createPriority();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  FeatureLangPackage getFeatureLangPackage();

} //FeatureLangFactory
