/**
 * generated by Xtext 2.30.0
 */
package de.tud.st.featurelang.featureLang.util;

import de.tud.st.featurelang.featureLang.Action;
import de.tud.st.featurelang.featureLang.AssociationAction;
import de.tud.st.featurelang.featureLang.Attribute;
import de.tud.st.featurelang.featureLang.AttributeAction;
import de.tud.st.featurelang.featureLang.ChangeStatement;
import de.tud.st.featurelang.featureLang.CreationStatement;
import de.tud.st.featurelang.featureLang.FeatureLangPackage;
import de.tud.st.featurelang.featureLang.FeatureRequest;
import de.tud.st.featurelang.featureLang.InheritanceAction;
import de.tud.st.featurelang.featureLang.Priority;
import de.tud.st.featurelang.featureLang.Statement;
import de.tud.st.featurelang.featureLang.UpdateAction;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.tud.st.featurelang.featureLang.FeatureLangPackage
 * @generated
 */
public class FeatureLangAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FeatureLangPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureLangAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = FeatureLangPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeatureLangSwitch<Adapter> modelSwitch =
    new FeatureLangSwitch<Adapter>()
    {
      @Override
      public Adapter caseFeatureRequest(FeatureRequest object)
      {
        return createFeatureRequestAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseChangeStatement(ChangeStatement object)
      {
        return createChangeStatementAdapter();
      }
      @Override
      public Adapter caseCreationStatement(CreationStatement object)
      {
        return createCreationStatementAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter caseUpdateAction(UpdateAction object)
      {
        return createUpdateActionAdapter();
      }
      @Override
      public Adapter caseAttributeAction(AttributeAction object)
      {
        return createAttributeActionAdapter();
      }
      @Override
      public Adapter caseAssociationAction(AssociationAction object)
      {
        return createAssociationActionAdapter();
      }
      @Override
      public Adapter caseInheritanceAction(InheritanceAction object)
      {
        return createInheritanceActionAdapter();
      }
      @Override
      public Adapter caseClass(de.tud.st.featurelang.featureLang.Class object)
      {
        return createClassAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter casePriority(Priority object)
      {
        return createPriorityAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link de.tud.st.featurelang.featureLang.FeatureRequest <em>Feature Request</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.tud.st.featurelang.featureLang.FeatureRequest
   * @generated
   */
  public Adapter createFeatureRequestAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.tud.st.featurelang.featureLang.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.tud.st.featurelang.featureLang.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.tud.st.featurelang.featureLang.ChangeStatement <em>Change Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.tud.st.featurelang.featureLang.ChangeStatement
   * @generated
   */
  public Adapter createChangeStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.tud.st.featurelang.featureLang.CreationStatement <em>Creation Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.tud.st.featurelang.featureLang.CreationStatement
   * @generated
   */
  public Adapter createCreationStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.tud.st.featurelang.featureLang.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.tud.st.featurelang.featureLang.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.tud.st.featurelang.featureLang.UpdateAction <em>Update Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.tud.st.featurelang.featureLang.UpdateAction
   * @generated
   */
  public Adapter createUpdateActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.tud.st.featurelang.featureLang.AttributeAction <em>Attribute Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.tud.st.featurelang.featureLang.AttributeAction
   * @generated
   */
  public Adapter createAttributeActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.tud.st.featurelang.featureLang.AssociationAction <em>Association Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.tud.st.featurelang.featureLang.AssociationAction
   * @generated
   */
  public Adapter createAssociationActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.tud.st.featurelang.featureLang.InheritanceAction <em>Inheritance Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.tud.st.featurelang.featureLang.InheritanceAction
   * @generated
   */
  public Adapter createInheritanceActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.tud.st.featurelang.featureLang.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.tud.st.featurelang.featureLang.Class
   * @generated
   */
  public Adapter createClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.tud.st.featurelang.featureLang.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.tud.st.featurelang.featureLang.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.tud.st.featurelang.featureLang.Priority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.tud.st.featurelang.featureLang.Priority
   * @generated
   */
  public Adapter createPriorityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //FeatureLangAdapterFactory
