/**
 * generated by Xtext 2.9.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.ComputeInfoForInBuilt;
import org.xtext.example.mydsl.myDsl.ConsumeForInBuilt;
import org.xtext.example.mydsl.myDsl.EntityName;
import org.xtext.example.mydsl.myDsl.Generate;
import org.xtext.example.mydsl.myDsl.InBuiltComputationalService;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>In Built Computational Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.InBuiltComputationalServiceImpl#getInBuiltComputationalServiceName <em>In Built Computational Service Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.InBuiltComputationalServiceImpl#getConsumes <em>Consumes</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.InBuiltComputationalServiceImpl#getComputeInfo <em>Compute Info</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.InBuiltComputationalServiceImpl#getGenerateInfo <em>Generate Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InBuiltComputationalServiceImpl extends MinimalEObjectImpl.Container implements InBuiltComputationalService
{
  /**
   * The cached value of the '{@link #getInBuiltComputationalServiceName() <em>In Built Computational Service Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInBuiltComputationalServiceName()
   * @generated
   * @ordered
   */
  protected EntityName inBuiltComputationalServiceName;

  /**
   * The cached value of the '{@link #getConsumes() <em>Consumes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConsumes()
   * @generated
   * @ordered
   */
  protected EList<ConsumeForInBuilt> consumes;

  /**
   * The cached value of the '{@link #getComputeInfo() <em>Compute Info</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComputeInfo()
   * @generated
   * @ordered
   */
  protected EList<ComputeInfoForInBuilt> computeInfo;

  /**
   * The cached value of the '{@link #getGenerateInfo() <em>Generate Info</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenerateInfo()
   * @generated
   * @ordered
   */
  protected EList<Generate> generateInfo;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InBuiltComputationalServiceImpl()
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
    return MyDslPackage.Literals.IN_BUILT_COMPUTATIONAL_SERVICE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityName getInBuiltComputationalServiceName()
  {
    return inBuiltComputationalServiceName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInBuiltComputationalServiceName(EntityName newInBuiltComputationalServiceName, NotificationChain msgs)
  {
    EntityName oldInBuiltComputationalServiceName = inBuiltComputationalServiceName;
    inBuiltComputationalServiceName = newInBuiltComputationalServiceName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.IN_BUILT_COMPUTATIONAL_SERVICE__IN_BUILT_COMPUTATIONAL_SERVICE_NAME, oldInBuiltComputationalServiceName, newInBuiltComputationalServiceName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInBuiltComputationalServiceName(EntityName newInBuiltComputationalServiceName)
  {
    if (newInBuiltComputationalServiceName != inBuiltComputationalServiceName)
    {
      NotificationChain msgs = null;
      if (inBuiltComputationalServiceName != null)
        msgs = ((InternalEObject)inBuiltComputationalServiceName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IN_BUILT_COMPUTATIONAL_SERVICE__IN_BUILT_COMPUTATIONAL_SERVICE_NAME, null, msgs);
      if (newInBuiltComputationalServiceName != null)
        msgs = ((InternalEObject)newInBuiltComputationalServiceName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IN_BUILT_COMPUTATIONAL_SERVICE__IN_BUILT_COMPUTATIONAL_SERVICE_NAME, null, msgs);
      msgs = basicSetInBuiltComputationalServiceName(newInBuiltComputationalServiceName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.IN_BUILT_COMPUTATIONAL_SERVICE__IN_BUILT_COMPUTATIONAL_SERVICE_NAME, newInBuiltComputationalServiceName, newInBuiltComputationalServiceName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConsumeForInBuilt> getConsumes()
  {
    if (consumes == null)
    {
      consumes = new EObjectContainmentEList<ConsumeForInBuilt>(ConsumeForInBuilt.class, this, MyDslPackage.IN_BUILT_COMPUTATIONAL_SERVICE__CONSUMES);
    }
    return consumes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ComputeInfoForInBuilt> getComputeInfo()
  {
    if (computeInfo == null)
    {
      computeInfo = new EObjectContainmentEList<ComputeInfoForInBuilt>(ComputeInfoForInBuilt.class, this, MyDslPackage.IN_BUILT_COMPUTATIONAL_SERVICE__COMPUTE_INFO);
    }
    return computeInfo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Generate> getGenerateInfo()
  {
    if (generateInfo == null)
    {
      generateInfo = new EObjectContainmentEList<Generate>(Generate.class, this, MyDslPackage.IN_BUILT_COMPUTATIONAL_SERVICE__GENERATE_INFO);
    }
    return generateInfo;
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
      case MyDslPackage.IN_BUILT_COMPUTATIONAL_SERVICE__IN_BUILT_COMPUTATIONAL_SERVICE_NAME:
        return basicSetInBuiltComputationalServiceName(null, msgs);
      case MyDslPackage.IN_BUILT_COMPUTATIONAL_SERVICE__CONSUMES:
        return ((InternalEList<?>)getConsumes()).basicRemove(otherEnd, msgs);
      case MyDslPackage.IN_BUILT_COMPUTATIONAL_SERVICE__COMPUTE_INFO:
        return ((InternalEList<?>)getComputeInfo()).basicRemove(otherEnd, msgs);
      case MyDslPackage.IN_BUILT_COMPUTATIONAL_SERVICE__GENERATE_INFO:
        return ((InternalEList<?>)getGenerateInfo()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.IN_BUILT_COMPUTATIONAL_SERVICE__IN_BUILT_COMPUTATIONAL_SERVICE_NAME:
        return getInBuiltComputationalServiceName();
      case MyDslPackage.IN_BUILT_COMPUTATIONAL_SERVICE__CONSUMES:
        return getConsumes();
      case MyDslPackage.IN_BUILT_COMPUTATIONAL_SERVICE__COMPUTE_INFO:
        return getComputeInfo();
      case MyDslPackage.IN_BUILT_COMPUTATIONAL_SERVICE__GENERATE_INFO:
        return getGenerateInfo();
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
      case MyDslPackage.IN_BUILT_COMPUTATIONAL_SERVICE__IN_BUILT_COMPUTATIONAL_SERVICE_NAME:
        setInBuiltComputationalServiceName((EntityName)newValue);
        return;
      case MyDslPackage.IN_BUILT_COMPUTATIONAL_SERVICE__CONSUMES:
        getConsumes().clear();
        getConsumes().addAll((Collection<? extends ConsumeForInBuilt>)newValue);
        return;
      case MyDslPackage.IN_BUILT_COMPUTATIONAL_SERVICE__COMPUTE_INFO:
        getComputeInfo().clear();
        getComputeInfo().addAll((Collection<? extends ComputeInfoForInBuilt>)newValue);
        return;
      case MyDslPackage.IN_BUILT_COMPUTATIONAL_SERVICE__GENERATE_INFO:
        getGenerateInfo().clear();
        getGenerateInfo().addAll((Collection<? extends Generate>)newValue);
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
      case MyDslPackage.IN_BUILT_COMPUTATIONAL_SERVICE__IN_BUILT_COMPUTATIONAL_SERVICE_NAME:
        setInBuiltComputationalServiceName((EntityName)null);
        return;
      case MyDslPackage.IN_BUILT_COMPUTATIONAL_SERVICE__CONSUMES:
        getConsumes().clear();
        return;
      case MyDslPackage.IN_BUILT_COMPUTATIONAL_SERVICE__COMPUTE_INFO:
        getComputeInfo().clear();
        return;
      case MyDslPackage.IN_BUILT_COMPUTATIONAL_SERVICE__GENERATE_INFO:
        getGenerateInfo().clear();
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
      case MyDslPackage.IN_BUILT_COMPUTATIONAL_SERVICE__IN_BUILT_COMPUTATIONAL_SERVICE_NAME:
        return inBuiltComputationalServiceName != null;
      case MyDslPackage.IN_BUILT_COMPUTATIONAL_SERVICE__CONSUMES:
        return consumes != null && !consumes.isEmpty();
      case MyDslPackage.IN_BUILT_COMPUTATIONAL_SERVICE__COMPUTE_INFO:
        return computeInfo != null && !computeInfo.isEmpty();
      case MyDslPackage.IN_BUILT_COMPUTATIONAL_SERVICE__GENERATE_INFO:
        return generateInfo != null && !generateInfo.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //InBuiltComputationalServiceImpl
