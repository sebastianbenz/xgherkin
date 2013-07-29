/**
 */
package de.sebastianbenz.xgherkin.gherkin;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Then Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.sebastianbenz.xgherkin.gherkin.ThenStep#getTags <em>Tags</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.sebastianbenz.xgherkin.gherkin.GherkinPackage#getThenStep()
 * @model
 * @generated
 */
public interface ThenStep extends Step
{
  /**
   * Returns the value of the '<em><b>Tags</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tags</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tags</em>' attribute list.
   * @see de.sebastianbenz.xgherkin.gherkin.GherkinPackage#getThenStep_Tags()
   * @model unique="false"
   * @generated
   */
  EList<String> getTags();

} // ThenStep
