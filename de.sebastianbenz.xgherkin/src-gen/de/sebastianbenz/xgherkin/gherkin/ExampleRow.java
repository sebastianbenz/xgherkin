/**
 * <copyright>
 * </copyright>
 *
 */
package de.sebastianbenz.xgherkin.gherkin;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Example Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.sebastianbenz.xgherkin.gherkin.ExampleRow#getCells <em>Cells</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.sebastianbenz.xgherkin.gherkin.GherkinPackage#getExampleRow()
 * @model
 * @generated
 */
public interface ExampleRow extends EObject
{
  /**
   * Returns the value of the '<em><b>Cells</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cells</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cells</em>' attribute list.
   * @see de.sebastianbenz.xgherkin.gherkin.GherkinPackage#getExampleRow_Cells()
   * @model unique="false"
   * @generated
   */
  EList<String> getCells();

} // ExampleRow
