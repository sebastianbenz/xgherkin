/**
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
 *   <li>{@link de.sebastianbenz.xgherkin.gherkin.ScenarioWithOutline#getElements <em>Elements</em>}</li>
 *   <li>{@link de.sebastianbenz.xgherkin.gherkin.ScenarioWithOutline#getExample <em>Example</em>}</li>
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
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link de.sebastianbenz.xgherkin.gherkin.NarrativeElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see de.sebastianbenz.xgherkin.gherkin.GherkinPackage#getScenarioWithOutline_Elements()
   * @model containment="true"
   * @generated
   */
  EList<NarrativeElement> getElements();

  /**
   * Returns the value of the '<em><b>Example</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Example</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Example</em>' containment reference.
   * @see #setExample(Example)
   * @see de.sebastianbenz.xgherkin.gherkin.GherkinPackage#getScenarioWithOutline_Example()
   * @model containment="true"
   * @generated
   */
  Example getExample();

  /**
   * Sets the value of the '{@link de.sebastianbenz.xgherkin.gherkin.ScenarioWithOutline#getExample <em>Example</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Example</em>' containment reference.
   * @see #getExample()
   * @generated
   */
  void setExample(Example value);

} // ScenarioWithOutline
