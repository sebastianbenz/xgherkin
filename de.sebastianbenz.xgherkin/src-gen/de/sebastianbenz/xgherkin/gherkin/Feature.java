/**
 */
package de.sebastianbenz.xgherkin.gherkin;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.sebastianbenz.xgherkin.gherkin.Feature#getTags <em>Tags</em>}</li>
 *   <li>{@link de.sebastianbenz.xgherkin.gherkin.Feature#getName <em>Name</em>}</li>
 *   <li>{@link de.sebastianbenz.xgherkin.gherkin.Feature#getElements <em>Elements</em>}</li>
 *   <li>{@link de.sebastianbenz.xgherkin.gherkin.Feature#getScenarios <em>Scenarios</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.sebastianbenz.xgherkin.gherkin.GherkinPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends EObject
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
   * @see de.sebastianbenz.xgherkin.gherkin.GherkinPackage#getFeature_Tags()
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
   * @see de.sebastianbenz.xgherkin.gherkin.GherkinPackage#getFeature_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.sebastianbenz.xgherkin.gherkin.Feature#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see de.sebastianbenz.xgherkin.gherkin.GherkinPackage#getFeature_Elements()
   * @model containment="true"
   * @generated
   */
  EList<NarrativeElement> getElements();

  /**
   * Returns the value of the '<em><b>Scenarios</b></em>' containment reference list.
   * The list contents are of type {@link de.sebastianbenz.xgherkin.gherkin.AbstractScenario}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scenarios</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scenarios</em>' containment reference list.
   * @see de.sebastianbenz.xgherkin.gherkin.GherkinPackage#getFeature_Scenarios()
   * @model containment="true"
   * @generated
   */
  EList<AbstractScenario> getScenarios();

} // Feature
