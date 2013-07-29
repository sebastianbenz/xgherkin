/**
 */
package de.sebastianbenz.xgherkin.gherkin;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.sebastianbenz.xgherkin.gherkin.Scenario#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.sebastianbenz.xgherkin.gherkin.GherkinPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends AbstractScenario
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
   * @see de.sebastianbenz.xgherkin.gherkin.GherkinPackage#getScenario_Elements()
   * @model containment="true"
   * @generated
   */
  EList<NarrativeElement> getElements();

} // Scenario
