/**
 * generated by Xtext 2.32.0
 */
package de.tud.st.featurelang.featureLang.impl;

import de.tud.st.featurelang.featureLang.AssociationAction;
import de.tud.st.featurelang.featureLang.CreateAssociation;
import de.tud.st.featurelang.featureLang.EditAssociation;
import de.tud.st.featurelang.featureLang.FeatureLangPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tud.st.featurelang.featureLang.impl.AssociationActionImpl#getCreate <em>Create</em>}</li>
 *   <li>{@link de.tud.st.featurelang.featureLang.impl.AssociationActionImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.tud.st.featurelang.featureLang.impl.AssociationActionImpl#getEdit <em>Edit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationActionImpl extends MinimalEObjectImpl.Container implements AssociationAction
{
  /**
   * The cached value of the '{@link #getCreate() <em>Create</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreate()
   * @generated
   * @ordered
   */
  protected CreateAssociation create;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getEdit() <em>Edit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEdit()
   * @generated
   * @ordered
   */
  protected EditAssociation edit;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssociationActionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FeatureLangPackage.Literals.ASSOCIATION_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CreateAssociation getCreate()
  {
    return create;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCreate(CreateAssociation newCreate, NotificationChain msgs)
  {
    CreateAssociation oldCreate = create;
    create = newCreate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeatureLangPackage.ASSOCIATION_ACTION__CREATE, oldCreate, newCreate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCreate(CreateAssociation newCreate)
  {
    if (newCreate != create)
    {
      NotificationChain msgs = null;
      if (create != null)
        msgs = ((InternalEObject)create).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeatureLangPackage.ASSOCIATION_ACTION__CREATE, null, msgs);
      if (newCreate != null)
        msgs = ((InternalEObject)newCreate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeatureLangPackage.ASSOCIATION_ACTION__CREATE, null, msgs);
      msgs = basicSetCreate(newCreate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FeatureLangPackage.ASSOCIATION_ACTION__CREATE, newCreate, newCreate));
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
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FeatureLangPackage.ASSOCIATION_ACTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EditAssociation getEdit()
  {
    return edit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEdit(EditAssociation newEdit, NotificationChain msgs)
  {
    EditAssociation oldEdit = edit;
    edit = newEdit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeatureLangPackage.ASSOCIATION_ACTION__EDIT, oldEdit, newEdit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEdit(EditAssociation newEdit)
  {
    if (newEdit != edit)
    {
      NotificationChain msgs = null;
      if (edit != null)
        msgs = ((InternalEObject)edit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeatureLangPackage.ASSOCIATION_ACTION__EDIT, null, msgs);
      if (newEdit != null)
        msgs = ((InternalEObject)newEdit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeatureLangPackage.ASSOCIATION_ACTION__EDIT, null, msgs);
      msgs = basicSetEdit(newEdit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FeatureLangPackage.ASSOCIATION_ACTION__EDIT, newEdit, newEdit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case FeatureLangPackage.ASSOCIATION_ACTION__CREATE:
        return basicSetCreate(null, msgs);
      case FeatureLangPackage.ASSOCIATION_ACTION__EDIT:
        return basicSetEdit(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FeatureLangPackage.ASSOCIATION_ACTION__CREATE:
        return getCreate();
      case FeatureLangPackage.ASSOCIATION_ACTION__NAME:
        return getName();
      case FeatureLangPackage.ASSOCIATION_ACTION__EDIT:
        return getEdit();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FeatureLangPackage.ASSOCIATION_ACTION__CREATE:
        setCreate((CreateAssociation)newValue);
        return;
      case FeatureLangPackage.ASSOCIATION_ACTION__NAME:
        setName((String)newValue);
        return;
      case FeatureLangPackage.ASSOCIATION_ACTION__EDIT:
        setEdit((EditAssociation)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FeatureLangPackage.ASSOCIATION_ACTION__CREATE:
        setCreate((CreateAssociation)null);
        return;
      case FeatureLangPackage.ASSOCIATION_ACTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FeatureLangPackage.ASSOCIATION_ACTION__EDIT:
        setEdit((EditAssociation)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FeatureLangPackage.ASSOCIATION_ACTION__CREATE:
        return create != null;
      case FeatureLangPackage.ASSOCIATION_ACTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FeatureLangPackage.ASSOCIATION_ACTION__EDIT:
        return edit != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //AssociationActionImpl
