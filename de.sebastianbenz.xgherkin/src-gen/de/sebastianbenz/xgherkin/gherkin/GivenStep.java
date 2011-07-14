/**
 * <copyright>
 * </copyright>
 *
 */
package de.sebastianbenz.xgherkin.gherkin;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Given Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.sebastianbenz.xgherkin.gherkin.GivenStep#getTags <em>Tags</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.sebastianbenz.xgherkin.gherkin.GherkinPackage#getGivenStep()
 * @model
 * @generated
 */
public interface GivenStep extends Step
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
   * @see de.sebastianbenz.xgherkin.gherkin.GherkinPackage#getGivenStep_Tags()
   * @model unique="false"
   * @generated
   */
  EList<String> getTags();

} // GivenStep
