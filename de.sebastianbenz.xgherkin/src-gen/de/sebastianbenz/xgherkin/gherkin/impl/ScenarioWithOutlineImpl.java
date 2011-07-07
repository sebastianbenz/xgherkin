/**
 * <copyright>
 * </copyright>
 *
 */
package de.sebastianbenz.xgherkin.gherkin.impl;

import de.sebastianbenz.xgherkin.gherkin.ExampleRow;
import de.sebastianbenz.xgherkin.gherkin.GherkinPackage;
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
 *   <li>{@link de.sebastianbenz.xgherkin.gherkin.impl.ScenarioWithOutlineImpl#getHeading <em>Heading</em>}</li>
 *   <li>{@link de.sebastianbenz.xgherkin.gherkin.impl.ScenarioWithOutlineImpl#getRows <em>Rows</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScenarioWithOutlineImpl extends AbstractScenarioImpl implements ScenarioWithOutline
{
  /**
   * The cached value of the '{@link #getHeading() <em>Heading</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeading()
   * @generated
   * @ordered
   */
  protected ExampleRow heading;

  /**
   * The cached value of the '{@link #getRows() <em>Rows</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRows()
   * @generated
   * @ordered
   */
  protected EList<ExampleRow> rows;

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
  public ExampleRow getHeading()
  {
    return heading;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHeading(ExampleRow newHeading, NotificationChain msgs)
  {
    ExampleRow oldHeading = heading;
    heading = newHeading;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GherkinPackage.SCENARIO_WITH_OUTLINE__HEADING, oldHeading, newHeading);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeading(ExampleRow newHeading)
  {
    if (newHeading != heading)
    {
      NotificationChain msgs = null;
      if (heading != null)
        msgs = ((InternalEObject)heading).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GherkinPackage.SCENARIO_WITH_OUTLINE__HEADING, null, msgs);
      if (newHeading != null)
        msgs = ((InternalEObject)newHeading).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GherkinPackage.SCENARIO_WITH_OUTLINE__HEADING, null, msgs);
      msgs = basicSetHeading(newHeading, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GherkinPackage.SCENARIO_WITH_OUTLINE__HEADING, newHeading, newHeading));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExampleRow> getRows()
  {
    if (rows == null)
    {
      rows = new EObjectContainmentEList<ExampleRow>(ExampleRow.class, this, GherkinPackage.SCENARIO_WITH_OUTLINE__ROWS);
    }
    return rows;
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
      case GherkinPackage.SCENARIO_WITH_OUTLINE__HEADING:
        return basicSetHeading(null, msgs);
      case GherkinPackage.SCENARIO_WITH_OUTLINE__ROWS:
        return ((InternalEList<?>)getRows()).basicRemove(otherEnd, msgs);
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
      case GherkinPackage.SCENARIO_WITH_OUTLINE__HEADING:
        return getHeading();
      case GherkinPackage.SCENARIO_WITH_OUTLINE__ROWS:
        return getRows();
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
      case GherkinPackage.SCENARIO_WITH_OUTLINE__HEADING:
        setHeading((ExampleRow)newValue);
        return;
      case GherkinPackage.SCENARIO_WITH_OUTLINE__ROWS:
        getRows().clear();
        getRows().addAll((Collection<? extends ExampleRow>)newValue);
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
      case GherkinPackage.SCENARIO_WITH_OUTLINE__HEADING:
        setHeading((ExampleRow)null);
        return;
      case GherkinPackage.SCENARIO_WITH_OUTLINE__ROWS:
        getRows().clear();
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
      case GherkinPackage.SCENARIO_WITH_OUTLINE__HEADING:
        return heading != null;
      case GherkinPackage.SCENARIO_WITH_OUTLINE__ROWS:
        return rows != null && !rows.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ScenarioWithOutlineImpl
