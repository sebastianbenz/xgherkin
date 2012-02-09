/**
 * <copyright>
 * </copyright>
 *
 */
package de.sebastianbenz.xgherkin.gherkin;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.sebastianbenz.xgherkin.gherkin.GherkinFactory
 * @model kind="package"
 * @generated
 */
public interface GherkinPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "gherkin";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sebastianbenz.de/xgherkin/Gherkin";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "gherkin";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GherkinPackage eINSTANCE = de.sebastianbenz.xgherkin.gherkin.impl.GherkinPackageImpl.init();

  /**
   * The meta object id for the '{@link de.sebastianbenz.xgherkin.gherkin.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.xgherkin.gherkin.impl.FeatureImpl
   * @see de.sebastianbenz.xgherkin.gherkin.impl.GherkinPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 0;

  /**
   * The feature id for the '<em><b>Tags</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__TAGS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__NAME = 1;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__ELEMENTS = 2;

  /**
   * The feature id for the '<em><b>Scenarios</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__SCENARIOS = 3;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.sebastianbenz.xgherkin.gherkin.impl.NarrativeElementImpl <em>Narrative Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.xgherkin.gherkin.impl.NarrativeElementImpl
   * @see de.sebastianbenz.xgherkin.gherkin.impl.GherkinPackageImpl#getNarrativeElement()
   * @generated
   */
  int NARRATIVE_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARRATIVE_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Narrative Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARRATIVE_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.sebastianbenz.xgherkin.gherkin.impl.FreeTextImpl <em>Free Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.xgherkin.gherkin.impl.FreeTextImpl
   * @see de.sebastianbenz.xgherkin.gherkin.impl.GherkinPackageImpl#getFreeText()
   * @generated
   */
  int FREE_TEXT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FREE_TEXT__NAME = NARRATIVE_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Free Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FREE_TEXT_FEATURE_COUNT = NARRATIVE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sebastianbenz.xgherkin.gherkin.impl.AsAImpl <em>As A</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.xgherkin.gherkin.impl.AsAImpl
   * @see de.sebastianbenz.xgherkin.gherkin.impl.GherkinPackageImpl#getAsA()
   * @generated
   */
  int AS_A = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AS_A__NAME = NARRATIVE_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>As A</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AS_A_FEATURE_COUNT = NARRATIVE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sebastianbenz.xgherkin.gherkin.impl.InOrderToImpl <em>In Order To</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.xgherkin.gherkin.impl.InOrderToImpl
   * @see de.sebastianbenz.xgherkin.gherkin.impl.GherkinPackageImpl#getInOrderTo()
   * @generated
   */
  int IN_ORDER_TO = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_ORDER_TO__NAME = NARRATIVE_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>In Order To</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_ORDER_TO_FEATURE_COUNT = NARRATIVE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sebastianbenz.xgherkin.gherkin.impl.IWantToImpl <em>IWant To</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.xgherkin.gherkin.impl.IWantToImpl
   * @see de.sebastianbenz.xgherkin.gherkin.impl.GherkinPackageImpl#getIWantTo()
   * @generated
   */
  int IWANT_TO = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IWANT_TO__NAME = NARRATIVE_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>IWant To</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IWANT_TO_FEATURE_COUNT = NARRATIVE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sebastianbenz.xgherkin.gherkin.impl.AbstractScenarioImpl <em>Abstract Scenario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.xgherkin.gherkin.impl.AbstractScenarioImpl
   * @see de.sebastianbenz.xgherkin.gherkin.impl.GherkinPackageImpl#getAbstractScenario()
   * @generated
   */
  int ABSTRACT_SCENARIO = 6;

  /**
   * The feature id for the '<em><b>Tags</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_SCENARIO__TAGS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_SCENARIO__NAME = 1;

  /**
   * The feature id for the '<em><b>Steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_SCENARIO__STEPS = 2;

  /**
   * The number of structural features of the '<em>Abstract Scenario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_SCENARIO_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.sebastianbenz.xgherkin.gherkin.impl.ScenarioImpl <em>Scenario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.xgherkin.gherkin.impl.ScenarioImpl
   * @see de.sebastianbenz.xgherkin.gherkin.impl.GherkinPackageImpl#getScenario()
   * @generated
   */
  int SCENARIO = 7;

  /**
   * The feature id for the '<em><b>Tags</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__TAGS = ABSTRACT_SCENARIO__TAGS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__NAME = ABSTRACT_SCENARIO__NAME;

  /**
   * The feature id for the '<em><b>Steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__STEPS = ABSTRACT_SCENARIO__STEPS;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__ELEMENTS = ABSTRACT_SCENARIO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Scenario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO_FEATURE_COUNT = ABSTRACT_SCENARIO_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sebastianbenz.xgherkin.gherkin.impl.ScenarioWithOutlineImpl <em>Scenario With Outline</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.xgherkin.gherkin.impl.ScenarioWithOutlineImpl
   * @see de.sebastianbenz.xgherkin.gherkin.impl.GherkinPackageImpl#getScenarioWithOutline()
   * @generated
   */
  int SCENARIO_WITH_OUTLINE = 8;

  /**
   * The feature id for the '<em><b>Tags</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO_WITH_OUTLINE__TAGS = ABSTRACT_SCENARIO__TAGS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO_WITH_OUTLINE__NAME = ABSTRACT_SCENARIO__NAME;

  /**
   * The feature id for the '<em><b>Steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO_WITH_OUTLINE__STEPS = ABSTRACT_SCENARIO__STEPS;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO_WITH_OUTLINE__ELEMENTS = ABSTRACT_SCENARIO_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Example</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO_WITH_OUTLINE__EXAMPLE = ABSTRACT_SCENARIO_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Scenario With Outline</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO_WITH_OUTLINE_FEATURE_COUNT = ABSTRACT_SCENARIO_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.sebastianbenz.xgherkin.gherkin.impl.ExampleImpl <em>Example</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.xgherkin.gherkin.impl.ExampleImpl
   * @see de.sebastianbenz.xgherkin.gherkin.impl.GherkinPackageImpl#getExample()
   * @generated
   */
  int EXAMPLE = 9;

  /**
   * The feature id for the '<em><b>Heading</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE__HEADING = 0;

  /**
   * The feature id for the '<em><b>Rows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE__ROWS = 1;

  /**
   * The number of structural features of the '<em>Example</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.sebastianbenz.xgherkin.gherkin.impl.ExampleRowImpl <em>Example Row</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.xgherkin.gherkin.impl.ExampleRowImpl
   * @see de.sebastianbenz.xgherkin.gherkin.impl.GherkinPackageImpl#getExampleRow()
   * @generated
   */
  int EXAMPLE_ROW = 10;

  /**
   * The feature id for the '<em><b>Cells</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE_ROW__CELLS = 0;

  /**
   * The number of structural features of the '<em>Example Row</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE_ROW_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.sebastianbenz.xgherkin.gherkin.impl.ExampleCellImpl <em>Example Cell</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.xgherkin.gherkin.impl.ExampleCellImpl
   * @see de.sebastianbenz.xgherkin.gherkin.impl.GherkinPackageImpl#getExampleCell()
   * @generated
   */
  int EXAMPLE_CELL = 11;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE_CELL__VALUE = 0;

  /**
   * The number of structural features of the '<em>Example Cell</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE_CELL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.sebastianbenz.xgherkin.gherkin.impl.BackgroundImpl <em>Background</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.xgherkin.gherkin.impl.BackgroundImpl
   * @see de.sebastianbenz.xgherkin.gherkin.impl.GherkinPackageImpl#getBackground()
   * @generated
   */
  int BACKGROUND = 12;

  /**
   * The feature id for the '<em><b>Tags</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BACKGROUND__TAGS = ABSTRACT_SCENARIO__TAGS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BACKGROUND__NAME = ABSTRACT_SCENARIO__NAME;

  /**
   * The feature id for the '<em><b>Steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BACKGROUND__STEPS = ABSTRACT_SCENARIO__STEPS;

  /**
   * The number of structural features of the '<em>Background</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BACKGROUND_FEATURE_COUNT = ABSTRACT_SCENARIO_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.sebastianbenz.xgherkin.gherkin.impl.StepImpl <em>Step</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.xgherkin.gherkin.impl.StepImpl
   * @see de.sebastianbenz.xgherkin.gherkin.impl.GherkinPackageImpl#getStep()
   * @generated
   */
  int STEP = 13;

  /**
   * The feature id for the '<em><b>Desc</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__DESC = 0;

  /**
   * The feature id for the '<em><b>Rows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__ROWS = 1;

  /**
   * The number of structural features of the '<em>Step</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.sebastianbenz.xgherkin.gherkin.impl.WhenStepImpl <em>When Step</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.xgherkin.gherkin.impl.WhenStepImpl
   * @see de.sebastianbenz.xgherkin.gherkin.impl.GherkinPackageImpl#getWhenStep()
   * @generated
   */
  int WHEN_STEP = 14;

  /**
   * The feature id for the '<em><b>Desc</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_STEP__DESC = STEP__DESC;

  /**
   * The feature id for the '<em><b>Rows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_STEP__ROWS = STEP__ROWS;

  /**
   * The feature id for the '<em><b>Tags</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_STEP__TAGS = STEP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>When Step</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sebastianbenz.xgherkin.gherkin.impl.ThenStepImpl <em>Then Step</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.xgherkin.gherkin.impl.ThenStepImpl
   * @see de.sebastianbenz.xgherkin.gherkin.impl.GherkinPackageImpl#getThenStep()
   * @generated
   */
  int THEN_STEP = 15;

  /**
   * The feature id for the '<em><b>Desc</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN_STEP__DESC = STEP__DESC;

  /**
   * The feature id for the '<em><b>Rows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN_STEP__ROWS = STEP__ROWS;

  /**
   * The feature id for the '<em><b>Tags</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN_STEP__TAGS = STEP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Then Step</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sebastianbenz.xgherkin.gherkin.impl.GivenStepImpl <em>Given Step</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.xgherkin.gherkin.impl.GivenStepImpl
   * @see de.sebastianbenz.xgherkin.gherkin.impl.GherkinPackageImpl#getGivenStep()
   * @generated
   */
  int GIVEN_STEP = 16;

  /**
   * The feature id for the '<em><b>Desc</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GIVEN_STEP__DESC = STEP__DESC;

  /**
   * The feature id for the '<em><b>Rows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GIVEN_STEP__ROWS = STEP__ROWS;

  /**
   * The feature id for the '<em><b>Tags</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GIVEN_STEP__TAGS = STEP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Given Step</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GIVEN_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.sebastianbenz.xgherkin.gherkin.impl.AndStepImpl <em>And Step</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.sebastianbenz.xgherkin.gherkin.impl.AndStepImpl
   * @see de.sebastianbenz.xgherkin.gherkin.impl.GherkinPackageImpl#getAndStep()
   * @generated
   */
  int AND_STEP = 17;

  /**
   * The feature id for the '<em><b>Desc</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_STEP__DESC = STEP__DESC;

  /**
   * The feature id for the '<em><b>Rows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_STEP__ROWS = STEP__ROWS;

  /**
   * The number of structural features of the '<em>And Step</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link de.sebastianbenz.xgherkin.gherkin.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see de.sebastianbenz.xgherkin.gherkin.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the attribute list '{@link de.sebastianbenz.xgherkin.gherkin.Feature#getTags <em>Tags</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Tags</em>'.
   * @see de.sebastianbenz.xgherkin.gherkin.Feature#getTags()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Tags();

  /**
   * Returns the meta object for the attribute '{@link de.sebastianbenz.xgherkin.gherkin.Feature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.sebastianbenz.xgherkin.gherkin.Feature#getName()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.sebastianbenz.xgherkin.gherkin.Feature#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see de.sebastianbenz.xgherkin.gherkin.Feature#getElements()
   * @see #getFeature()
   * @generated
   */
  EReference getFeature_Elements();

  /**
   * Returns the meta object for the containment reference list '{@link de.sebastianbenz.xgherkin.gherkin.Feature#getScenarios <em>Scenarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Scenarios</em>'.
   * @see de.sebastianbenz.xgherkin.gherkin.Feature#getScenarios()
   * @see #getFeature()
   * @generated
   */
  EReference getFeature_Scenarios();

  /**
   * Returns the meta object for class '{@link de.sebastianbenz.xgherkin.gherkin.NarrativeElement <em>Narrative Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Narrative Element</em>'.
   * @see de.sebastianbenz.xgherkin.gherkin.NarrativeElement
   * @generated
   */
  EClass getNarrativeElement();

  /**
   * Returns the meta object for the attribute '{@link de.sebastianbenz.xgherkin.gherkin.NarrativeElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.sebastianbenz.xgherkin.gherkin.NarrativeElement#getName()
   * @see #getNarrativeElement()
   * @generated
   */
  EAttribute getNarrativeElement_Name();

  /**
   * Returns the meta object for class '{@link de.sebastianbenz.xgherkin.gherkin.FreeText <em>Free Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Free Text</em>'.
   * @see de.sebastianbenz.xgherkin.gherkin.FreeText
   * @generated
   */
  EClass getFreeText();

  /**
   * Returns the meta object for class '{@link de.sebastianbenz.xgherkin.gherkin.AsA <em>As A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>As A</em>'.
   * @see de.sebastianbenz.xgherkin.gherkin.AsA
   * @generated
   */
  EClass getAsA();

  /**
   * Returns the meta object for class '{@link de.sebastianbenz.xgherkin.gherkin.InOrderTo <em>In Order To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In Order To</em>'.
   * @see de.sebastianbenz.xgherkin.gherkin.InOrderTo
   * @generated
   */
  EClass getInOrderTo();

  /**
   * Returns the meta object for class '{@link de.sebastianbenz.xgherkin.gherkin.IWantTo <em>IWant To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IWant To</em>'.
   * @see de.sebastianbenz.xgherkin.gherkin.IWantTo
   * @generated
   */
  EClass getIWantTo();

  /**
   * Returns the meta object for class '{@link de.sebastianbenz.xgherkin.gherkin.AbstractScenario <em>Abstract Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Scenario</em>'.
   * @see de.sebastianbenz.xgherkin.gherkin.AbstractScenario
   * @generated
   */
  EClass getAbstractScenario();

  /**
   * Returns the meta object for the attribute list '{@link de.sebastianbenz.xgherkin.gherkin.AbstractScenario#getTags <em>Tags</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Tags</em>'.
   * @see de.sebastianbenz.xgherkin.gherkin.AbstractScenario#getTags()
   * @see #getAbstractScenario()
   * @generated
   */
  EAttribute getAbstractScenario_Tags();

  /**
   * Returns the meta object for the attribute '{@link de.sebastianbenz.xgherkin.gherkin.AbstractScenario#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.sebastianbenz.xgherkin.gherkin.AbstractScenario#getName()
   * @see #getAbstractScenario()
   * @generated
   */
  EAttribute getAbstractScenario_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.sebastianbenz.xgherkin.gherkin.AbstractScenario#getSteps <em>Steps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Steps</em>'.
   * @see de.sebastianbenz.xgherkin.gherkin.AbstractScenario#getSteps()
   * @see #getAbstractScenario()
   * @generated
   */
  EReference getAbstractScenario_Steps();

  /**
   * Returns the meta object for class '{@link de.sebastianbenz.xgherkin.gherkin.Scenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scenario</em>'.
   * @see de.sebastianbenz.xgherkin.gherkin.Scenario
   * @generated
   */
  EClass getScenario();

  /**
   * Returns the meta object for the containment reference list '{@link de.sebastianbenz.xgherkin.gherkin.Scenario#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see de.sebastianbenz.xgherkin.gherkin.Scenario#getElements()
   * @see #getScenario()
   * @generated
   */
  EReference getScenario_Elements();

  /**
   * Returns the meta object for class '{@link de.sebastianbenz.xgherkin.gherkin.ScenarioWithOutline <em>Scenario With Outline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scenario With Outline</em>'.
   * @see de.sebastianbenz.xgherkin.gherkin.ScenarioWithOutline
   * @generated
   */
  EClass getScenarioWithOutline();

  /**
   * Returns the meta object for the containment reference list '{@link de.sebastianbenz.xgherkin.gherkin.ScenarioWithOutline#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see de.sebastianbenz.xgherkin.gherkin.ScenarioWithOutline#getElements()
   * @see #getScenarioWithOutline()
   * @generated
   */
  EReference getScenarioWithOutline_Elements();

  /**
   * Returns the meta object for the containment reference '{@link de.sebastianbenz.xgherkin.gherkin.ScenarioWithOutline#getExample <em>Example</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Example</em>'.
   * @see de.sebastianbenz.xgherkin.gherkin.ScenarioWithOutline#getExample()
   * @see #getScenarioWithOutline()
   * @generated
   */
  EReference getScenarioWithOutline_Example();

  /**
   * Returns the meta object for class '{@link de.sebastianbenz.xgherkin.gherkin.Example <em>Example</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Example</em>'.
   * @see de.sebastianbenz.xgherkin.gherkin.Example
   * @generated
   */
  EClass getExample();

  /**
   * Returns the meta object for the containment reference '{@link de.sebastianbenz.xgherkin.gherkin.Example#getHeading <em>Heading</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Heading</em>'.
   * @see de.sebastianbenz.xgherkin.gherkin.Example#getHeading()
   * @see #getExample()
   * @generated
   */
  EReference getExample_Heading();

  /**
   * Returns the meta object for the containment reference list '{@link de.sebastianbenz.xgherkin.gherkin.Example#getRows <em>Rows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rows</em>'.
   * @see de.sebastianbenz.xgherkin.gherkin.Example#getRows()
   * @see #getExample()
   * @generated
   */
  EReference getExample_Rows();

  /**
   * Returns the meta object for class '{@link de.sebastianbenz.xgherkin.gherkin.ExampleRow <em>Example Row</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Example Row</em>'.
   * @see de.sebastianbenz.xgherkin.gherkin.ExampleRow
   * @generated
   */
  EClass getExampleRow();

  /**
   * Returns the meta object for the containment reference list '{@link de.sebastianbenz.xgherkin.gherkin.ExampleRow#getCells <em>Cells</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cells</em>'.
   * @see de.sebastianbenz.xgherkin.gherkin.ExampleRow#getCells()
   * @see #getExampleRow()
   * @generated
   */
  EReference getExampleRow_Cells();

  /**
   * Returns the meta object for class '{@link de.sebastianbenz.xgherkin.gherkin.ExampleCell <em>Example Cell</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Example Cell</em>'.
   * @see de.sebastianbenz.xgherkin.gherkin.ExampleCell
   * @generated
   */
  EClass getExampleCell();

  /**
   * Returns the meta object for the attribute '{@link de.sebastianbenz.xgherkin.gherkin.ExampleCell#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.sebastianbenz.xgherkin.gherkin.ExampleCell#getValue()
   * @see #getExampleCell()
   * @generated
   */
  EAttribute getExampleCell_Value();

  /**
   * Returns the meta object for class '{@link de.sebastianbenz.xgherkin.gherkin.Background <em>Background</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Background</em>'.
   * @see de.sebastianbenz.xgherkin.gherkin.Background
   * @generated
   */
  EClass getBackground();

  /**
   * Returns the meta object for class '{@link de.sebastianbenz.xgherkin.gherkin.Step <em>Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Step</em>'.
   * @see de.sebastianbenz.xgherkin.gherkin.Step
   * @generated
   */
  EClass getStep();

  /**
   * Returns the meta object for the attribute list '{@link de.sebastianbenz.xgherkin.gherkin.Step#getDesc <em>Desc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Desc</em>'.
   * @see de.sebastianbenz.xgherkin.gherkin.Step#getDesc()
   * @see #getStep()
   * @generated
   */
  EAttribute getStep_Desc();

  /**
   * Returns the meta object for the containment reference list '{@link de.sebastianbenz.xgherkin.gherkin.Step#getRows <em>Rows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rows</em>'.
   * @see de.sebastianbenz.xgherkin.gherkin.Step#getRows()
   * @see #getStep()
   * @generated
   */
  EReference getStep_Rows();

  /**
   * Returns the meta object for class '{@link de.sebastianbenz.xgherkin.gherkin.WhenStep <em>When Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>When Step</em>'.
   * @see de.sebastianbenz.xgherkin.gherkin.WhenStep
   * @generated
   */
  EClass getWhenStep();

  /**
   * Returns the meta object for the attribute list '{@link de.sebastianbenz.xgherkin.gherkin.WhenStep#getTags <em>Tags</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Tags</em>'.
   * @see de.sebastianbenz.xgherkin.gherkin.WhenStep#getTags()
   * @see #getWhenStep()
   * @generated
   */
  EAttribute getWhenStep_Tags();

  /**
   * Returns the meta object for class '{@link de.sebastianbenz.xgherkin.gherkin.ThenStep <em>Then Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Then Step</em>'.
   * @see de.sebastianbenz.xgherkin.gherkin.ThenStep
   * @generated
   */
  EClass getThenStep();

  /**
   * Returns the meta object for the attribute list '{@link de.sebastianbenz.xgherkin.gherkin.ThenStep#getTags <em>Tags</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Tags</em>'.
   * @see de.sebastianbenz.xgherkin.gherkin.ThenStep#getTags()
   * @see #getThenStep()
   * @generated
   */
  EAttribute getThenStep_Tags();

  /**
   * Returns the meta object for class '{@link de.sebastianbenz.xgherkin.gherkin.GivenStep <em>Given Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Given Step</em>'.
   * @see de.sebastianbenz.xgherkin.gherkin.GivenStep
   * @generated
   */
  EClass getGivenStep();

  /**
   * Returns the meta object for the attribute list '{@link de.sebastianbenz.xgherkin.gherkin.GivenStep#getTags <em>Tags</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Tags</em>'.
   * @see de.sebastianbenz.xgherkin.gherkin.GivenStep#getTags()
   * @see #getGivenStep()
   * @generated
   */
  EAttribute getGivenStep_Tags();

  /**
   * Returns the meta object for class '{@link de.sebastianbenz.xgherkin.gherkin.AndStep <em>And Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Step</em>'.
   * @see de.sebastianbenz.xgherkin.gherkin.AndStep
   * @generated
   */
  EClass getAndStep();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GherkinFactory getGherkinFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.sebastianbenz.xgherkin.gherkin.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.xgherkin.gherkin.impl.FeatureImpl
     * @see de.sebastianbenz.xgherkin.gherkin.impl.GherkinPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>Tags</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__TAGS = eINSTANCE.getFeature_Tags();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE__ELEMENTS = eINSTANCE.getFeature_Elements();

    /**
     * The meta object literal for the '<em><b>Scenarios</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE__SCENARIOS = eINSTANCE.getFeature_Scenarios();

    /**
     * The meta object literal for the '{@link de.sebastianbenz.xgherkin.gherkin.impl.NarrativeElementImpl <em>Narrative Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.xgherkin.gherkin.impl.NarrativeElementImpl
     * @see de.sebastianbenz.xgherkin.gherkin.impl.GherkinPackageImpl#getNarrativeElement()
     * @generated
     */
    EClass NARRATIVE_ELEMENT = eINSTANCE.getNarrativeElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NARRATIVE_ELEMENT__NAME = eINSTANCE.getNarrativeElement_Name();

    /**
     * The meta object literal for the '{@link de.sebastianbenz.xgherkin.gherkin.impl.FreeTextImpl <em>Free Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.xgherkin.gherkin.impl.FreeTextImpl
     * @see de.sebastianbenz.xgherkin.gherkin.impl.GherkinPackageImpl#getFreeText()
     * @generated
     */
    EClass FREE_TEXT = eINSTANCE.getFreeText();

    /**
     * The meta object literal for the '{@link de.sebastianbenz.xgherkin.gherkin.impl.AsAImpl <em>As A</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.xgherkin.gherkin.impl.AsAImpl
     * @see de.sebastianbenz.xgherkin.gherkin.impl.GherkinPackageImpl#getAsA()
     * @generated
     */
    EClass AS_A = eINSTANCE.getAsA();

    /**
     * The meta object literal for the '{@link de.sebastianbenz.xgherkin.gherkin.impl.InOrderToImpl <em>In Order To</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.xgherkin.gherkin.impl.InOrderToImpl
     * @see de.sebastianbenz.xgherkin.gherkin.impl.GherkinPackageImpl#getInOrderTo()
     * @generated
     */
    EClass IN_ORDER_TO = eINSTANCE.getInOrderTo();

    /**
     * The meta object literal for the '{@link de.sebastianbenz.xgherkin.gherkin.impl.IWantToImpl <em>IWant To</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.xgherkin.gherkin.impl.IWantToImpl
     * @see de.sebastianbenz.xgherkin.gherkin.impl.GherkinPackageImpl#getIWantTo()
     * @generated
     */
    EClass IWANT_TO = eINSTANCE.getIWantTo();

    /**
     * The meta object literal for the '{@link de.sebastianbenz.xgherkin.gherkin.impl.AbstractScenarioImpl <em>Abstract Scenario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.xgherkin.gherkin.impl.AbstractScenarioImpl
     * @see de.sebastianbenz.xgherkin.gherkin.impl.GherkinPackageImpl#getAbstractScenario()
     * @generated
     */
    EClass ABSTRACT_SCENARIO = eINSTANCE.getAbstractScenario();

    /**
     * The meta object literal for the '<em><b>Tags</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_SCENARIO__TAGS = eINSTANCE.getAbstractScenario_Tags();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_SCENARIO__NAME = eINSTANCE.getAbstractScenario_Name();

    /**
     * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_SCENARIO__STEPS = eINSTANCE.getAbstractScenario_Steps();

    /**
     * The meta object literal for the '{@link de.sebastianbenz.xgherkin.gherkin.impl.ScenarioImpl <em>Scenario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.xgherkin.gherkin.impl.ScenarioImpl
     * @see de.sebastianbenz.xgherkin.gherkin.impl.GherkinPackageImpl#getScenario()
     * @generated
     */
    EClass SCENARIO = eINSTANCE.getScenario();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCENARIO__ELEMENTS = eINSTANCE.getScenario_Elements();

    /**
     * The meta object literal for the '{@link de.sebastianbenz.xgherkin.gherkin.impl.ScenarioWithOutlineImpl <em>Scenario With Outline</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.xgherkin.gherkin.impl.ScenarioWithOutlineImpl
     * @see de.sebastianbenz.xgherkin.gherkin.impl.GherkinPackageImpl#getScenarioWithOutline()
     * @generated
     */
    EClass SCENARIO_WITH_OUTLINE = eINSTANCE.getScenarioWithOutline();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCENARIO_WITH_OUTLINE__ELEMENTS = eINSTANCE.getScenarioWithOutline_Elements();

    /**
     * The meta object literal for the '<em><b>Example</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCENARIO_WITH_OUTLINE__EXAMPLE = eINSTANCE.getScenarioWithOutline_Example();

    /**
     * The meta object literal for the '{@link de.sebastianbenz.xgherkin.gherkin.impl.ExampleImpl <em>Example</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.xgherkin.gherkin.impl.ExampleImpl
     * @see de.sebastianbenz.xgherkin.gherkin.impl.GherkinPackageImpl#getExample()
     * @generated
     */
    EClass EXAMPLE = eINSTANCE.getExample();

    /**
     * The meta object literal for the '<em><b>Heading</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXAMPLE__HEADING = eINSTANCE.getExample_Heading();

    /**
     * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXAMPLE__ROWS = eINSTANCE.getExample_Rows();

    /**
     * The meta object literal for the '{@link de.sebastianbenz.xgherkin.gherkin.impl.ExampleRowImpl <em>Example Row</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.xgherkin.gherkin.impl.ExampleRowImpl
     * @see de.sebastianbenz.xgherkin.gherkin.impl.GherkinPackageImpl#getExampleRow()
     * @generated
     */
    EClass EXAMPLE_ROW = eINSTANCE.getExampleRow();

    /**
     * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXAMPLE_ROW__CELLS = eINSTANCE.getExampleRow_Cells();

    /**
     * The meta object literal for the '{@link de.sebastianbenz.xgherkin.gherkin.impl.ExampleCellImpl <em>Example Cell</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.xgherkin.gherkin.impl.ExampleCellImpl
     * @see de.sebastianbenz.xgherkin.gherkin.impl.GherkinPackageImpl#getExampleCell()
     * @generated
     */
    EClass EXAMPLE_CELL = eINSTANCE.getExampleCell();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXAMPLE_CELL__VALUE = eINSTANCE.getExampleCell_Value();

    /**
     * The meta object literal for the '{@link de.sebastianbenz.xgherkin.gherkin.impl.BackgroundImpl <em>Background</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.xgherkin.gherkin.impl.BackgroundImpl
     * @see de.sebastianbenz.xgherkin.gherkin.impl.GherkinPackageImpl#getBackground()
     * @generated
     */
    EClass BACKGROUND = eINSTANCE.getBackground();

    /**
     * The meta object literal for the '{@link de.sebastianbenz.xgherkin.gherkin.impl.StepImpl <em>Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.xgherkin.gherkin.impl.StepImpl
     * @see de.sebastianbenz.xgherkin.gherkin.impl.GherkinPackageImpl#getStep()
     * @generated
     */
    EClass STEP = eINSTANCE.getStep();

    /**
     * The meta object literal for the '<em><b>Desc</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STEP__DESC = eINSTANCE.getStep_Desc();

    /**
     * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STEP__ROWS = eINSTANCE.getStep_Rows();

    /**
     * The meta object literal for the '{@link de.sebastianbenz.xgherkin.gherkin.impl.WhenStepImpl <em>When Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.xgherkin.gherkin.impl.WhenStepImpl
     * @see de.sebastianbenz.xgherkin.gherkin.impl.GherkinPackageImpl#getWhenStep()
     * @generated
     */
    EClass WHEN_STEP = eINSTANCE.getWhenStep();

    /**
     * The meta object literal for the '<em><b>Tags</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WHEN_STEP__TAGS = eINSTANCE.getWhenStep_Tags();

    /**
     * The meta object literal for the '{@link de.sebastianbenz.xgherkin.gherkin.impl.ThenStepImpl <em>Then Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.xgherkin.gherkin.impl.ThenStepImpl
     * @see de.sebastianbenz.xgherkin.gherkin.impl.GherkinPackageImpl#getThenStep()
     * @generated
     */
    EClass THEN_STEP = eINSTANCE.getThenStep();

    /**
     * The meta object literal for the '<em><b>Tags</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute THEN_STEP__TAGS = eINSTANCE.getThenStep_Tags();

    /**
     * The meta object literal for the '{@link de.sebastianbenz.xgherkin.gherkin.impl.GivenStepImpl <em>Given Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.xgherkin.gherkin.impl.GivenStepImpl
     * @see de.sebastianbenz.xgherkin.gherkin.impl.GherkinPackageImpl#getGivenStep()
     * @generated
     */
    EClass GIVEN_STEP = eINSTANCE.getGivenStep();

    /**
     * The meta object literal for the '<em><b>Tags</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GIVEN_STEP__TAGS = eINSTANCE.getGivenStep_Tags();

    /**
     * The meta object literal for the '{@link de.sebastianbenz.xgherkin.gherkin.impl.AndStepImpl <em>And Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.sebastianbenz.xgherkin.gherkin.impl.AndStepImpl
     * @see de.sebastianbenz.xgherkin.gherkin.impl.GherkinPackageImpl#getAndStep()
     * @generated
     */
    EClass AND_STEP = eINSTANCE.getAndStep();

  }

} //GherkinPackage
