/**
 * <copyright>
 * </copyright>
 *
 */
package de.sebastianbenz.xgherkin.gherkin.impl;

import de.sebastianbenz.xgherkin.gherkin.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GherkinFactoryImpl extends EFactoryImpl implements GherkinFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GherkinFactory init()
  {
    try
    {
      GherkinFactory theGherkinFactory = (GherkinFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.sebastianbenz.de/xgherkin/Gherkin"); 
      if (theGherkinFactory != null)
      {
        return theGherkinFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GherkinFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GherkinFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GherkinPackage.FEATURE: return createFeature();
      case GherkinPackage.NARRATIVE_ELEMENT: return createNarrativeElement();
      case GherkinPackage.FREE_TEXT: return createFreeText();
      case GherkinPackage.AS_A: return createAsA();
      case GherkinPackage.IN_ORDER_TO: return createInOrderTo();
      case GherkinPackage.IWANT_TO: return createIWantTo();
      case GherkinPackage.ABSTRACT_SCENARIO: return createAbstractScenario();
      case GherkinPackage.SCENARIO: return createScenario();
      case GherkinPackage.SCENARIO_WITH_OUTLINE: return createScenarioWithOutline();
      case GherkinPackage.EXAMPLE: return createExample();
      case GherkinPackage.EXAMPLE_ROW: return createExampleRow();
      case GherkinPackage.EXAMPLE_CELL: return createExampleCell();
      case GherkinPackage.BACKGROUND: return createBackground();
      case GherkinPackage.STEP: return createStep();
      case GherkinPackage.WHEN_STEP: return createWhenStep();
      case GherkinPackage.THEN_STEP: return createThenStep();
      case GherkinPackage.GIVEN_STEP: return createGivenStep();
      case GherkinPackage.AND_STEP: return createAndStep();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature createFeature()
  {
    FeatureImpl feature = new FeatureImpl();
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NarrativeElement createNarrativeElement()
  {
    NarrativeElementImpl narrativeElement = new NarrativeElementImpl();
    return narrativeElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FreeText createFreeText()
  {
    FreeTextImpl freeText = new FreeTextImpl();
    return freeText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AsA createAsA()
  {
    AsAImpl asA = new AsAImpl();
    return asA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InOrderTo createInOrderTo()
  {
    InOrderToImpl inOrderTo = new InOrderToImpl();
    return inOrderTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IWantTo createIWantTo()
  {
    IWantToImpl iWantTo = new IWantToImpl();
    return iWantTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractScenario createAbstractScenario()
  {
    AbstractScenarioImpl abstractScenario = new AbstractScenarioImpl();
    return abstractScenario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scenario createScenario()
  {
    ScenarioImpl scenario = new ScenarioImpl();
    return scenario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScenarioWithOutline createScenarioWithOutline()
  {
    ScenarioWithOutlineImpl scenarioWithOutline = new ScenarioWithOutlineImpl();
    return scenarioWithOutline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Example createExample()
  {
    ExampleImpl example = new ExampleImpl();
    return example;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExampleRow createExampleRow()
  {
    ExampleRowImpl exampleRow = new ExampleRowImpl();
    return exampleRow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExampleCell createExampleCell()
  {
    ExampleCellImpl exampleCell = new ExampleCellImpl();
    return exampleCell;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Background createBackground()
  {
    BackgroundImpl background = new BackgroundImpl();
    return background;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Step createStep()
  {
    StepImpl step = new StepImpl();
    return step;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenStep createWhenStep()
  {
    WhenStepImpl whenStep = new WhenStepImpl();
    return whenStep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ThenStep createThenStep()
  {
    ThenStepImpl thenStep = new ThenStepImpl();
    return thenStep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GivenStep createGivenStep()
  {
    GivenStepImpl givenStep = new GivenStepImpl();
    return givenStep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndStep createAndStep()
  {
    AndStepImpl andStep = new AndStepImpl();
    return andStep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GherkinPackage getGherkinPackage()
  {
    return (GherkinPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GherkinPackage getPackage()
  {
    return GherkinPackage.eINSTANCE;
  }

} //GherkinFactoryImpl
