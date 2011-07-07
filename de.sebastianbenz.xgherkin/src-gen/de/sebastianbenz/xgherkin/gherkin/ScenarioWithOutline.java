/**
 * <copyright>
 * </copyright>
 *
 */
package de.sebastianbenz.xgherkin.gherkin;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario With Outline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.sebastianbenz.xgherkin.gherkin.ScenarioWithOutline#getHeading <em>Heading</em>}</li>
 *   <li>{@link de.sebastianbenz.xgherkin.gherkin.ScenarioWithOutline#getRows <em>Rows</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.sebastianbenz.xgherkin.gherkin.GherkinPackage#getScenarioWithOutline()
 * @model
 * @generated
 */
public interface ScenarioWithOutline extends AbstractScenario
{
  /**
   * Returns the value of the '<em><b>Heading</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Heading</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Heading</em>' containment reference.
   * @see #setHeading(ExampleRow)
   * @see de.sebastianbenz.xgherkin.gherkin.GherkinPackage#getScenarioWithOutline_Heading()
   * @model containment="true"
   * @generated
   */
  ExampleRow getHeading();

  /**
   * Sets the value of the '{@link de.sebastianbenz.xgherkin.gherkin.ScenarioWithOutline#getHeading <em>Heading</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Heading</em>' containment reference.
   * @see #getHeading()
   * @generated
   */
  void setHeading(ExampleRow value);

  /**
   * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
   * The list contents are of type {@link de.sebastianbenz.xgherkin.gherkin.ExampleRow}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rows</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rows</em>' containment reference list.
   * @see de.sebastianbenz.xgherkin.gherkin.GherkinPackage#getScenarioWithOutline_Rows()
   * @model containment="true"
   * @generated
   */
  EList<ExampleRow> getRows();

} // ScenarioWithOutline
