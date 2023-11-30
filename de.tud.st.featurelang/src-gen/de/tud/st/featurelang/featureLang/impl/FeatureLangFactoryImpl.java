/**
 * generated by Xtext 2.32.0
 */
package de.tud.st.featurelang.featureLang.impl;

import de.tud.st.featurelang.featureLang.Abstraction;
import de.tud.st.featurelang.featureLang.Action;
import de.tud.st.featurelang.featureLang.AssociationAction;
import de.tud.st.featurelang.featureLang.Attribute;
import de.tud.st.featurelang.featureLang.AttributeAction;
import de.tud.st.featurelang.featureLang.ChangeStatement;
import de.tud.st.featurelang.featureLang.CompositionAction;
import de.tud.st.featurelang.featureLang.CompositionParameter;
import de.tud.st.featurelang.featureLang.CreateAssociation;
import de.tud.st.featurelang.featureLang.CreateComposition;
import de.tud.st.featurelang.featureLang.CreateInheritance;
import de.tud.st.featurelang.featureLang.CreationStatement;
import de.tud.st.featurelang.featureLang.Datatype;
import de.tud.st.featurelang.featureLang.EditAssociation;
import de.tud.st.featurelang.featureLang.EditComposition;
import de.tud.st.featurelang.featureLang.EditInheritance;
import de.tud.st.featurelang.featureLang.FeatureLangFactory;
import de.tud.st.featurelang.featureLang.FeatureLangPackage;
import de.tud.st.featurelang.featureLang.FeatureRequest;
import de.tud.st.featurelang.featureLang.Identifier;
import de.tud.st.featurelang.featureLang.IdentifierValue;
import de.tud.st.featurelang.featureLang.InheritanceAction;
import de.tud.st.featurelang.featureLang.Priority;
import de.tud.st.featurelang.featureLang.PriorityValue;
import de.tud.st.featurelang.featureLang.Publicity;
import de.tud.st.featurelang.featureLang.SetCompatible;
import de.tud.st.featurelang.featureLang.SetLeftOpen;
import de.tud.st.featurelang.featureLang.SetRightOpen;
import de.tud.st.featurelang.featureLang.SetVariant;
import de.tud.st.featurelang.featureLang.SetVersionRange;
import de.tud.st.featurelang.featureLang.Statement;
import de.tud.st.featurelang.featureLang.UpdateAction;
import de.tud.st.featurelang.featureLang.UpdateAttributeDatatype;
import de.tud.st.featurelang.featureLang.UpdateAttributeIdentifier;
import de.tud.st.featurelang.featureLang.UpdateAttributeValue;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureLangFactoryImpl extends EFactoryImpl implements FeatureLangFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FeatureLangFactory init()
  {
    try
    {
      FeatureLangFactory theFeatureLangFactory = (FeatureLangFactory)EPackage.Registry.INSTANCE.getEFactory(FeatureLangPackage.eNS_URI);
      if (theFeatureLangFactory != null)
      {
        return theFeatureLangFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FeatureLangFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureLangFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case FeatureLangPackage.FEATURE_REQUEST: return createFeatureRequest();
      case FeatureLangPackage.STATEMENT: return createStatement();
      case FeatureLangPackage.CHANGE_STATEMENT: return createChangeStatement();
      case FeatureLangPackage.CREATION_STATEMENT: return createCreationStatement();
      case FeatureLangPackage.ACTION: return createAction();
      case FeatureLangPackage.UPDATE_ACTION: return createUpdateAction();
      case FeatureLangPackage.UPDATE_ATTRIBUTE_DATATYPE: return createUpdateAttributeDatatype();
      case FeatureLangPackage.UPDATE_ATTRIBUTE_IDENTIFIER: return createUpdateAttributeIdentifier();
      case FeatureLangPackage.UPDATE_ATTRIBUTE_VALUE: return createUpdateAttributeValue();
      case FeatureLangPackage.ATTRIBUTE_ACTION: return createAttributeAction();
      case FeatureLangPackage.ASSOCIATION_ACTION: return createAssociationAction();
      case FeatureLangPackage.CREATE_ASSOCIATION: return createCreateAssociation();
      case FeatureLangPackage.EDIT_ASSOCIATION: return createEditAssociation();
      case FeatureLangPackage.SET_COMPATIBLE: return createSetCompatible();
      case FeatureLangPackage.SET_VERSION_RANGE: return createSetVersionRange();
      case FeatureLangPackage.SET_VARIANT: return createSetVariant();
      case FeatureLangPackage.SET_RIGHT_OPEN: return createSetRightOpen();
      case FeatureLangPackage.SET_LEFT_OPEN: return createSetLeftOpen();
      case FeatureLangPackage.INHERITANCE_ACTION: return createInheritanceAction();
      case FeatureLangPackage.CREATE_INHERITANCE: return createCreateInheritance();
      case FeatureLangPackage.EDIT_INHERITANCE: return createEditInheritance();
      case FeatureLangPackage.COMPOSITION_ACTION: return createCompositionAction();
      case FeatureLangPackage.CREATE_COMPOSITION: return createCreateComposition();
      case FeatureLangPackage.EDIT_COMPOSITION: return createEditComposition();
      case FeatureLangPackage.CLASS: return createClass();
      case FeatureLangPackage.ATTRIBUTE: return createAttribute();
      case FeatureLangPackage.IDENTIFIER: return createIdentifier();
      case FeatureLangPackage.PRIORITY: return createPriority();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case FeatureLangPackage.COMPOSITION_PARAMETER:
        return createCompositionParameterFromString(eDataType, initialValue);
      case FeatureLangPackage.PUBLICITY:
        return createPublicityFromString(eDataType, initialValue);
      case FeatureLangPackage.PRIORITY_VALUE:
        return createPriorityValueFromString(eDataType, initialValue);
      case FeatureLangPackage.ABSTRACTION:
        return createAbstractionFromString(eDataType, initialValue);
      case FeatureLangPackage.IDENTIFIER_VALUE:
        return createIdentifierValueFromString(eDataType, initialValue);
      case FeatureLangPackage.DATATYPE:
        return createDatatypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case FeatureLangPackage.COMPOSITION_PARAMETER:
        return convertCompositionParameterToString(eDataType, instanceValue);
      case FeatureLangPackage.PUBLICITY:
        return convertPublicityToString(eDataType, instanceValue);
      case FeatureLangPackage.PRIORITY_VALUE:
        return convertPriorityValueToString(eDataType, instanceValue);
      case FeatureLangPackage.ABSTRACTION:
        return convertAbstractionToString(eDataType, instanceValue);
      case FeatureLangPackage.IDENTIFIER_VALUE:
        return convertIdentifierValueToString(eDataType, instanceValue);
      case FeatureLangPackage.DATATYPE:
        return convertDatatypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FeatureRequest createFeatureRequest()
  {
    FeatureRequestImpl featureRequest = new FeatureRequestImpl();
    return featureRequest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ChangeStatement createChangeStatement()
  {
    ChangeStatementImpl changeStatement = new ChangeStatementImpl();
    return changeStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CreationStatement createCreationStatement()
  {
    CreationStatementImpl creationStatement = new CreationStatementImpl();
    return creationStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UpdateAction createUpdateAction()
  {
    UpdateActionImpl updateAction = new UpdateActionImpl();
    return updateAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UpdateAttributeDatatype createUpdateAttributeDatatype()
  {
    UpdateAttributeDatatypeImpl updateAttributeDatatype = new UpdateAttributeDatatypeImpl();
    return updateAttributeDatatype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UpdateAttributeIdentifier createUpdateAttributeIdentifier()
  {
    UpdateAttributeIdentifierImpl updateAttributeIdentifier = new UpdateAttributeIdentifierImpl();
    return updateAttributeIdentifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UpdateAttributeValue createUpdateAttributeValue()
  {
    UpdateAttributeValueImpl updateAttributeValue = new UpdateAttributeValueImpl();
    return updateAttributeValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AttributeAction createAttributeAction()
  {
    AttributeActionImpl attributeAction = new AttributeActionImpl();
    return attributeAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AssociationAction createAssociationAction()
  {
    AssociationActionImpl associationAction = new AssociationActionImpl();
    return associationAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CreateAssociation createCreateAssociation()
  {
    CreateAssociationImpl createAssociation = new CreateAssociationImpl();
    return createAssociation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EditAssociation createEditAssociation()
  {
    EditAssociationImpl editAssociation = new EditAssociationImpl();
    return editAssociation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SetCompatible createSetCompatible()
  {
    SetCompatibleImpl setCompatible = new SetCompatibleImpl();
    return setCompatible;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SetVersionRange createSetVersionRange()
  {
    SetVersionRangeImpl setVersionRange = new SetVersionRangeImpl();
    return setVersionRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SetVariant createSetVariant()
  {
    SetVariantImpl setVariant = new SetVariantImpl();
    return setVariant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SetRightOpen createSetRightOpen()
  {
    SetRightOpenImpl setRightOpen = new SetRightOpenImpl();
    return setRightOpen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SetLeftOpen createSetLeftOpen()
  {
    SetLeftOpenImpl setLeftOpen = new SetLeftOpenImpl();
    return setLeftOpen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InheritanceAction createInheritanceAction()
  {
    InheritanceActionImpl inheritanceAction = new InheritanceActionImpl();
    return inheritanceAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CreateInheritance createCreateInheritance()
  {
    CreateInheritanceImpl createInheritance = new CreateInheritanceImpl();
    return createInheritance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EditInheritance createEditInheritance()
  {
    EditInheritanceImpl editInheritance = new EditInheritanceImpl();
    return editInheritance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CompositionAction createCompositionAction()
  {
    CompositionActionImpl compositionAction = new CompositionActionImpl();
    return compositionAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CreateComposition createCreateComposition()
  {
    CreateCompositionImpl createComposition = new CreateCompositionImpl();
    return createComposition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EditComposition createEditComposition()
  {
    EditCompositionImpl editComposition = new EditCompositionImpl();
    return editComposition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public de.tud.st.featurelang.featureLang.Class createClass()
  {
    ClassImpl class_ = new ClassImpl();
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Identifier createIdentifier()
  {
    IdentifierImpl identifier = new IdentifierImpl();
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Priority createPriority()
  {
    PriorityImpl priority = new PriorityImpl();
    return priority;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositionParameter createCompositionParameterFromString(EDataType eDataType, String initialValue)
  {
    CompositionParameter result = CompositionParameter.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCompositionParameterToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Publicity createPublicityFromString(EDataType eDataType, String initialValue)
  {
    Publicity result = Publicity.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPublicityToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PriorityValue createPriorityValueFromString(EDataType eDataType, String initialValue)
  {
    PriorityValue result = PriorityValue.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPriorityValueToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Abstraction createAbstractionFromString(EDataType eDataType, String initialValue)
  {
    Abstraction result = Abstraction.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAbstractionToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdentifierValue createIdentifierValueFromString(EDataType eDataType, String initialValue)
  {
    IdentifierValue result = IdentifierValue.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertIdentifierValueToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Datatype createDatatypeFromString(EDataType eDataType, String initialValue)
  {
    Datatype result = Datatype.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDatatypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FeatureLangPackage getFeatureLangPackage()
  {
    return (FeatureLangPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FeatureLangPackage getPackage()
  {
    return FeatureLangPackage.eINSTANCE;
  }

} //FeatureLangFactoryImpl
