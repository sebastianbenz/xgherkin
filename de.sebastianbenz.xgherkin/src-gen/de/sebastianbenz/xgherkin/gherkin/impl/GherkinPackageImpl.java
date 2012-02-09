/**
 * <copyright>
 * </copyright>
 *
 */
package de.sebastianbenz.xgherkin.gherkin.impl;

import de.sebastianbenz.xgherkin.gherkin.AbstractScenario;
import de.sebastianbenz.xgherkin.gherkin.AndStep;
import de.sebastianbenz.xgherkin.gherkin.AsA;
import de.sebastianbenz.xgherkin.gherkin.Background;
import de.sebastianbenz.xgherkin.gherkin.ExampleCell;
import de.sebastianbenz.xgherkin.gherkin.ExampleRow;
import de.sebastianbenz.xgherkin.gherkin.Feature;
import de.sebastianbenz.xgherkin.gherkin.FreeText;
import de.sebastianbenz.xgherkin.gherkin.GherkinFactory;
import de.sebastianbenz.xgherkin.gherkin.GherkinPackage;
import de.sebastianbenz.xgherkin.gherkin.GivenStep;
import de.sebastianbenz.xgherkin.gherkin.IWantTo;
import de.sebastianbenz.xgherkin.gherkin.InOrderTo;
import de.sebastianbenz.xgherkin.gherkin.NarrativeElement;
import de.sebastianbenz.xgherkin.gherkin.Scenario;
import de.sebastianbenz.xgherkin.gherkin.ScenarioWithOutline;
import de.sebastianbenz.xgherkin.gherkin.Step;
import de.sebastianbenz.xgherkin.gherkin.ThenStep;
import de.sebastianbenz.xgherkin.gherkin.WhenStep;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GherkinPackageImpl extends EPackageImpl implements GherkinPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass narrativeElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass freeTextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass asAEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inOrderToEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iWantToEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractScenarioEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scenarioEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scenarioWithOutlineEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exampleRowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exampleCellEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass backgroundEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stepEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whenStepEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass thenStepEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass givenStepEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass andStepEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see de.sebastianbenz.xgherkin.gherkin.GherkinPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private GherkinPackageImpl()
  {
    super(eNS_URI, GherkinFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link GherkinPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static GherkinPackage init()
  {
    if (isInited) return (GherkinPackage)EPackage.Registry.INSTANCE.getEPackage(GherkinPackage.eNS_URI);

    // Obtain or create and register package
    GherkinPackageImpl theGherkinPackage = (GherkinPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GherkinPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GherkinPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theGherkinPackage.createPackageContents();

    // Initialize created meta-data
    theGherkinPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theGherkinPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(GherkinPackage.eNS_URI, theGherkinPackage);
    return theGherkinPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeature()
  {
    return featureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeature_Tags()
  {
    return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeature_Name()
  {
    return (EAttribute)featureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeature_Elements()
  {
    return (EReference)featureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeature_Scenarios()
  {
    return (EReference)featureEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNarrativeElement()
  {
    return narrativeElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNarrativeElement_Name()
  {
    return (EAttribute)narrativeElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFreeText()
  {
    return freeTextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAsA()
  {
    return asAEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInOrderTo()
  {
    return inOrderToEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIWantTo()
  {
    return iWantToEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractScenario()
  {
    return abstractScenarioEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractScenario_Tags()
  {
    return (EAttribute)abstractScenarioEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractScenario_Name()
  {
    return (EAttribute)abstractScenarioEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractScenario_Steps()
  {
    return (EReference)abstractScenarioEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScenario()
  {
    return scenarioEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScenario_Elements()
  {
    return (EReference)scenarioEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScenarioWithOutline()
  {
    return scenarioWithOutlineEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScenarioWithOutline_Elements()
  {
    return (EReference)scenarioWithOutlineEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScenarioWithOutline_Heading()
  {
    return (EReference)scenarioWithOutlineEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScenarioWithOutline_Rows()
  {
    return (EReference)scenarioWithOutlineEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExampleRow()
  {
    return exampleRowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExampleRow_Cells()
  {
    return (EReference)exampleRowEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExampleCell()
  {
    return exampleCellEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExampleCell_Value()
  {
    return (EAttribute)exampleCellEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBackground()
  {
    return backgroundEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStep()
  {
    return stepEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStep_Desc()
  {
    return (EAttribute)stepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStep_Rows()
  {
    return (EReference)stepEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhenStep()
  {
    return whenStepEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWhenStep_Tags()
  {
    return (EAttribute)whenStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getThenStep()
  {
    return thenStepEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getThenStep_Tags()
  {
    return (EAttribute)thenStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGivenStep()
  {
    return givenStepEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGivenStep_Tags()
  {
    return (EAttribute)givenStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndStep()
  {
    return andStepEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GherkinFactory getGherkinFactory()
  {
    return (GherkinFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    featureEClass = createEClass(FEATURE);
    createEAttribute(featureEClass, FEATURE__TAGS);
    createEAttribute(featureEClass, FEATURE__NAME);
    createEReference(featureEClass, FEATURE__ELEMENTS);
    createEReference(featureEClass, FEATURE__SCENARIOS);

    narrativeElementEClass = createEClass(NARRATIVE_ELEMENT);
    createEAttribute(narrativeElementEClass, NARRATIVE_ELEMENT__NAME);

    freeTextEClass = createEClass(FREE_TEXT);

    asAEClass = createEClass(AS_A);

    inOrderToEClass = createEClass(IN_ORDER_TO);

    iWantToEClass = createEClass(IWANT_TO);

    abstractScenarioEClass = createEClass(ABSTRACT_SCENARIO);
    createEAttribute(abstractScenarioEClass, ABSTRACT_SCENARIO__TAGS);
    createEAttribute(abstractScenarioEClass, ABSTRACT_SCENARIO__NAME);
    createEReference(abstractScenarioEClass, ABSTRACT_SCENARIO__STEPS);

    scenarioEClass = createEClass(SCENARIO);
    createEReference(scenarioEClass, SCENARIO__ELEMENTS);

    scenarioWithOutlineEClass = createEClass(SCENARIO_WITH_OUTLINE);
    createEReference(scenarioWithOutlineEClass, SCENARIO_WITH_OUTLINE__ELEMENTS);
    createEReference(scenarioWithOutlineEClass, SCENARIO_WITH_OUTLINE__HEADING);
    createEReference(scenarioWithOutlineEClass, SCENARIO_WITH_OUTLINE__ROWS);

    exampleRowEClass = createEClass(EXAMPLE_ROW);
    createEReference(exampleRowEClass, EXAMPLE_ROW__CELLS);

    exampleCellEClass = createEClass(EXAMPLE_CELL);
    createEAttribute(exampleCellEClass, EXAMPLE_CELL__VALUE);

    backgroundEClass = createEClass(BACKGROUND);

    stepEClass = createEClass(STEP);
    createEAttribute(stepEClass, STEP__DESC);
    createEReference(stepEClass, STEP__ROWS);

    whenStepEClass = createEClass(WHEN_STEP);
    createEAttribute(whenStepEClass, WHEN_STEP__TAGS);

    thenStepEClass = createEClass(THEN_STEP);
    createEAttribute(thenStepEClass, THEN_STEP__TAGS);

    givenStepEClass = createEClass(GIVEN_STEP);
    createEAttribute(givenStepEClass, GIVEN_STEP__TAGS);

    andStepEClass = createEClass(AND_STEP);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    freeTextEClass.getESuperTypes().add(this.getNarrativeElement());
    asAEClass.getESuperTypes().add(this.getNarrativeElement());
    inOrderToEClass.getESuperTypes().add(this.getNarrativeElement());
    iWantToEClass.getESuperTypes().add(this.getNarrativeElement());
    scenarioEClass.getESuperTypes().add(this.getAbstractScenario());
    scenarioWithOutlineEClass.getESuperTypes().add(this.getAbstractScenario());
    backgroundEClass.getESuperTypes().add(this.getAbstractScenario());
    whenStepEClass.getESuperTypes().add(this.getStep());
    thenStepEClass.getESuperTypes().add(this.getStep());
    givenStepEClass.getESuperTypes().add(this.getStep());
    andStepEClass.getESuperTypes().add(this.getStep());

    // Initialize classes and features; add operations and parameters
    initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFeature_Tags(), ecorePackage.getEString(), "tags", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFeature_Elements(), this.getNarrativeElement(), null, "elements", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFeature_Scenarios(), this.getAbstractScenario(), null, "scenarios", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(narrativeElementEClass, NarrativeElement.class, "NarrativeElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNarrativeElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NarrativeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(freeTextEClass, FreeText.class, "FreeText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(asAEClass, AsA.class, "AsA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(inOrderToEClass, InOrderTo.class, "InOrderTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(iWantToEClass, IWantTo.class, "IWantTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(abstractScenarioEClass, AbstractScenario.class, "AbstractScenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractScenario_Tags(), ecorePackage.getEString(), "tags", null, 0, -1, AbstractScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractScenario_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractScenario_Steps(), this.getStep(), null, "steps", null, 0, -1, AbstractScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scenarioEClass, Scenario.class, "Scenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getScenario_Elements(), this.getNarrativeElement(), null, "elements", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scenarioWithOutlineEClass, ScenarioWithOutline.class, "ScenarioWithOutline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getScenarioWithOutline_Elements(), this.getNarrativeElement(), null, "elements", null, 0, -1, ScenarioWithOutline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScenarioWithOutline_Heading(), this.getExampleRow(), null, "heading", null, 0, 1, ScenarioWithOutline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScenarioWithOutline_Rows(), this.getExampleRow(), null, "rows", null, 0, -1, ScenarioWithOutline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exampleRowEClass, ExampleRow.class, "ExampleRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExampleRow_Cells(), this.getExampleCell(), null, "cells", null, 0, -1, ExampleRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exampleCellEClass, ExampleCell.class, "ExampleCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExampleCell_Value(), ecorePackage.getEString(), "value", null, 0, 1, ExampleCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(backgroundEClass, Background.class, "Background", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stepEClass, Step.class, "Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStep_Desc(), ecorePackage.getEString(), "desc", null, 0, -1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStep_Rows(), this.getExampleRow(), null, "rows", null, 0, -1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whenStepEClass, WhenStep.class, "WhenStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWhenStep_Tags(), ecorePackage.getEString(), "tags", null, 0, -1, WhenStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(thenStepEClass, ThenStep.class, "ThenStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getThenStep_Tags(), ecorePackage.getEString(), "tags", null, 0, -1, ThenStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(givenStepEClass, GivenStep.class, "GivenStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGivenStep_Tags(), ecorePackage.getEString(), "tags", null, 0, -1, GivenStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(andStepEClass, AndStep.class, "AndStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //GherkinPackageImpl
