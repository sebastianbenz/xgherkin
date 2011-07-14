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
 * A representation of the model object '<em><b>Abstract Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.sebastianbenz.xgherkin.gherkin.AbstractScenario#getTags <em>Tags</em>}</li>
 *   <li>{@link de.sebastianbenz.xgherkin.gherkin.AbstractScenario#getName <em>Name</em>}</li>
 *   <li>{@link de.sebastianbenz.xgherkin.gherkin.AbstractScenario#getSteps <em>Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.sebastianbenz.xgherkin.gherkin.GherkinPackage#getAbstractScenario()
 * @model
 * @generated
 */
public interface AbstractScenario extends EObject
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
   * @see de.sebastianbenz.xgherkin.gherkin.GherkinPackage#getAbstractScenario_Tags()
   * @model unique="false"
   * @generated
   */
  EList<String> getTags();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.sebastianbenz.xgherkin.gherkin.GherkinPackage#getAbstractScenario_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.sebastianbenz.xgherkin.gherkin.AbstractScenario#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
   * The list contents are of type {@link de.sebastianbenz.xgherkin.gherkin.Step}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Steps</em>' containment reference list.
   * @see de.sebastianbenz.xgherkin.gherkin.GherkinPackage#getAbstractScenario_Steps()
   * @model containment="true"
   * @generated
   */
  EList<Step> getSteps();

} // AbstractScenario
