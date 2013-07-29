/**
 */
package de.sebastianbenz.xgherkin.gherkin;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Narrative Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.sebastianbenz.xgherkin.gherkin.NarrativeElement#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.sebastianbenz.xgherkin.gherkin.GherkinPackage#getNarrativeElement()
 * @model
 * @generated
 */
public interface NarrativeElement extends EObject
{
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
   * @see de.sebastianbenz.xgherkin.gherkin.GherkinPackage#getNarrativeElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.sebastianbenz.xgherkin.gherkin.NarrativeElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // NarrativeElement
