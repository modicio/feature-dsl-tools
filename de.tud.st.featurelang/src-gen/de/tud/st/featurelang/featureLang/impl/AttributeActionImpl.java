/**
 * generated by Xtext 2.30.0
 */
package de.tud.st.featurelang.featureLang.impl;

import de.tud.st.featurelang.featureLang.Attribute;
import de.tud.st.featurelang.featureLang.AttributeAction;
import de.tud.st.featurelang.featureLang.Datatype;
import de.tud.st.featurelang.featureLang.FeatureLangPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tud.st.featurelang.featureLang.impl.AttributeActionImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link de.tud.st.featurelang.featureLang.impl.AttributeActionImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeActionImpl extends MinimalEObjectImpl.Container implements AttributeAction
{
  /**
   * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute()
   * @generated
   * @ordered
   */
  protected Attribute attribute;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final Datatype TYPE_EDEFAULT = Datatype.WORD;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Datatype type = TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeActionImpl()
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
    return FeatureLangPackage.Literals.ATTRIBUTE_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Attribute getAttribute()
  {
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttribute(Attribute newAttribute, NotificationChain msgs)
  {
    Attribute oldAttribute = attribute;
    attribute = newAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeatureLangPackage.ATTRIBUTE_ACTION__ATTRIBUTE, oldAttribute, newAttribute);
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
  public void setAttribute(Attribute newAttribute)
  {
    if (newAttribute != attribute)
    {
      NotificationChain msgs = null;
      if (attribute != null)
        msgs = ((InternalEObject)attribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeatureLangPackage.ATTRIBUTE_ACTION__ATTRIBUTE, null, msgs);
      if (newAttribute != null)
        msgs = ((InternalEObject)newAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeatureLangPackage.ATTRIBUTE_ACTION__ATTRIBUTE, null, msgs);
      msgs = basicSetAttribute(newAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FeatureLangPackage.ATTRIBUTE_ACTION__ATTRIBUTE, newAttribute, newAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Datatype getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(Datatype newType)
  {
    Datatype oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FeatureLangPackage.ATTRIBUTE_ACTION__TYPE, oldType, type));
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
      case FeatureLangPackage.ATTRIBUTE_ACTION__ATTRIBUTE:
        return basicSetAttribute(null, msgs);
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
      case FeatureLangPackage.ATTRIBUTE_ACTION__ATTRIBUTE:
        return getAttribute();
      case FeatureLangPackage.ATTRIBUTE_ACTION__TYPE:
        return getType();
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
      case FeatureLangPackage.ATTRIBUTE_ACTION__ATTRIBUTE:
        setAttribute((Attribute)newValue);
        return;
      case FeatureLangPackage.ATTRIBUTE_ACTION__TYPE:
        setType((Datatype)newValue);
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
      case FeatureLangPackage.ATTRIBUTE_ACTION__ATTRIBUTE:
        setAttribute((Attribute)null);
        return;
      case FeatureLangPackage.ATTRIBUTE_ACTION__TYPE:
        setType(TYPE_EDEFAULT);
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
      case FeatureLangPackage.ATTRIBUTE_ACTION__ATTRIBUTE:
        return attribute != null;
      case FeatureLangPackage.ATTRIBUTE_ACTION__TYPE:
        return type != TYPE_EDEFAULT;
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
    result.append(" (type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //AttributeActionImpl
