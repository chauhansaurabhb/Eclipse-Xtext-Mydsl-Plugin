/**
 * generated by Xtext 2.9.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.InteractionName;
import org.xtext.example.mydsl.myDsl.InteractionSpec;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Struct;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.InteractionSpecImpl#getStructs <em>Structs</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.InteractionSpecImpl#getInteractionName <em>Interaction Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InteractionSpecImpl extends MinimalEObjectImpl.Container implements InteractionSpec
{
  /**
   * The cached value of the '{@link #getStructs() <em>Structs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStructs()
   * @generated
   * @ordered
   */
  protected EList<Struct> structs;

  /**
   * The cached value of the '{@link #getInteractionName() <em>Interaction Name</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteractionName()
   * @generated
   * @ordered
   */
  protected EList<InteractionName> interactionName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InteractionSpecImpl()
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
    return MyDslPackage.Literals.INTERACTION_SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Struct> getStructs()
  {
    if (structs == null)
    {
      structs = new EObjectContainmentEList<Struct>(Struct.class, this, MyDslPackage.INTERACTION_SPEC__STRUCTS);
    }
    return structs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InteractionName> getInteractionName()
  {
    if (interactionName == null)
    {
      interactionName = new EObjectContainmentEList<InteractionName>(InteractionName.class, this, MyDslPackage.INTERACTION_SPEC__INTERACTION_NAME);
    }
    return interactionName;
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
      case MyDslPackage.INTERACTION_SPEC__STRUCTS:
        return ((InternalEList<?>)getStructs()).basicRemove(otherEnd, msgs);
      case MyDslPackage.INTERACTION_SPEC__INTERACTION_NAME:
        return ((InternalEList<?>)getInteractionName()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.INTERACTION_SPEC__STRUCTS:
        return getStructs();
      case MyDslPackage.INTERACTION_SPEC__INTERACTION_NAME:
        return getInteractionName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.INTERACTION_SPEC__STRUCTS:
        getStructs().clear();
        getStructs().addAll((Collection<? extends Struct>)newValue);
        return;
      case MyDslPackage.INTERACTION_SPEC__INTERACTION_NAME:
        getInteractionName().clear();
        getInteractionName().addAll((Collection<? extends InteractionName>)newValue);
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
      case MyDslPackage.INTERACTION_SPEC__STRUCTS:
        getStructs().clear();
        return;
      case MyDslPackage.INTERACTION_SPEC__INTERACTION_NAME:
        getInteractionName().clear();
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
      case MyDslPackage.INTERACTION_SPEC__STRUCTS:
        return structs != null && !structs.isEmpty();
      case MyDslPackage.INTERACTION_SPEC__INTERACTION_NAME:
        return interactionName != null && !interactionName.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //InteractionSpecImpl
