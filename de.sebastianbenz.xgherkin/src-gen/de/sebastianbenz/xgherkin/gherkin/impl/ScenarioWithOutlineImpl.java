/**
 * <copyright>
 * </copyright>
 *
 */
package de.sebastianbenz.xgherkin.gherkin.impl;

import de.sebastianbenz.xgherkin.gherkin.Example;
import de.sebastianbenz.xgherkin.gherkin.GherkinPackage;
import de.sebastianbenz.xgherkin.gherkin.NarrativeElement;
import de.sebastianbenz.xgherkin.gherkin.ScenarioWithOutline;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario With Outline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.sebastianbenz.xgherkin.gherkin.impl.ScenarioWithOutlineImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link de.sebastianbenz.xgherkin.gherkin.impl.ScenarioWithOutlineImpl#getExample <em>Example</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScenarioWithOutlineImpl extends AbstractScenarioImpl implements ScenarioWithOutline
{
  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<NarrativeElement> elements;

  /**
   * The cached value of the '{@link #getExample() <em>Example</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExample()
   * @generated
   * @ordered
   */
  protected Example example;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScenarioWithOutlineImpl()
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
    return GherkinPackage.Literals.SCENARIO_WITH_OUTLINE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NarrativeElement> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<NarrativeElement>(NarrativeElement.class, this, GherkinPackage.SCENARIO_WITH_OUTLINE__ELEMENTS);
    }
    return elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Example getExample()
  {
    return example;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExample(Example newExample, NotificationChain msgs)
  {
    Example oldExample = example;
    example = newExample;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GherkinPackage.SCENARIO_WITH_OUTLINE__EXAMPLE, oldExample, newExample);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExample(Example newExample)
  {
    if (newExample != example)
    {
      NotificationChain msgs = null;
      if (example != null)
        msgs = ((InternalEObject)example).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GherkinPackage.SCENARIO_WITH_OUTLINE__EXAMPLE, null, msgs);
      if (newExample != null)
        msgs = ((InternalEObject)newExample).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GherkinPackage.SCENARIO_WITH_OUTLINE__EXAMPLE, null, msgs);
      msgs = basicSetExample(newExample, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GherkinPackage.SCENARIO_WITH_OUTLINE__EXAMPLE, newExample, newExample));
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
      case GherkinPackage.SCENARIO_WITH_OUTLINE__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
      case GherkinPackage.SCENARIO_WITH_OUTLINE__EXAMPLE:
        return basicSetExample(null, msgs);
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
      case GherkinPackage.SCENARIO_WITH_OUTLINE__ELEMENTS:
        return getElements();
      case GherkinPackage.SCENARIO_WITH_OUTLINE__EXAMPLE:
        return getExample();
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
      case GherkinPackage.SCENARIO_WITH_OUTLINE__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends NarrativeElement>)newValue);
        return;
      case GherkinPackage.SCENARIO_WITH_OUTLINE__EXAMPLE:
        setExample((Example)newValue);
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
      case GherkinPackage.SCENARIO_WITH_OUTLINE__ELEMENTS:
        getElements().clear();
        return;
      case GherkinPackage.SCENARIO_WITH_OUTLINE__EXAMPLE:
        setExample((Example)null);
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
      case GherkinPackage.SCENARIO_WITH_OUTLINE__ELEMENTS:
        return elements != null && !elements.isEmpty();
      case GherkinPackage.SCENARIO_WITH_OUTLINE__EXAMPLE:
        return example != null;
    }
    return super.eIsSet(featureID);
  }

} //ScenarioWithOutlineImpl
