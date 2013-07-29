/**
 */
package de.sebastianbenz.xgherkin.gherkin.util;

import de.sebastianbenz.xgherkin.gherkin.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.sebastianbenz.xgherkin.gherkin.GherkinPackage
 * @generated
 */
public class GherkinAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GherkinPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GherkinAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = GherkinPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GherkinSwitch<Adapter> modelSwitch =
    new GherkinSwitch<Adapter>()
    {
      @Override
      public Adapter caseFeature(Feature object)
      {
        return createFeatureAdapter();
      }
      @Override
      public Adapter caseNarrativeElement(NarrativeElement object)
      {
        return createNarrativeElementAdapter();
      }
      @Override
      public Adapter caseFreeText(FreeText object)
      {
        return createFreeTextAdapter();
      }
      @Override
      public Adapter caseAsA(AsA object)
      {
        return createAsAAdapter();
      }
      @Override
      public Adapter caseInOrderTo(InOrderTo object)
      {
        return createInOrderToAdapter();
      }
      @Override
      public Adapter caseIWantTo(IWantTo object)
      {
        return createIWantToAdapter();
      }
      @Override
      public Adapter caseAbstractScenario(AbstractScenario object)
      {
        return createAbstractScenarioAdapter();
      }
      @Override
      public Adapter caseScenario(Scenario object)
      {
        return createScenarioAdapter();
      }
      @Override
      public Adapter caseScenarioWithOutline(ScenarioWithOutline object)
      {
        return createScenarioWithOutlineAdapter();
      }
      @Override
      public Adapter caseExample(Example object)
      {
        return createExampleAdapter();
      }
      @Override
      public Adapter caseExampleRow(ExampleRow object)
      {
        return createExampleRowAdapter();
      }
      @Override
      public Adapter caseExampleCell(ExampleCell object)
      {
        return createExampleCellAdapter();
      }
      @Override
      public Adapter caseBackground(Background object)
      {
        return createBackgroundAdapter();
      }
      @Override
      public Adapter caseStep(Step object)
      {
        return createStepAdapter();
      }
      @Override
      public Adapter caseWhenStep(WhenStep object)
      {
        return createWhenStepAdapter();
      }
      @Override
      public Adapter caseThenStep(ThenStep object)
      {
        return createThenStepAdapter();
      }
      @Override
      public Adapter caseGivenStep(GivenStep object)
      {
        return createGivenStepAdapter();
      }
      @Override
      public Adapter caseAndStep(AndStep object)
      {
        return createAndStepAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link de.sebastianbenz.xgherkin.gherkin.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sebastianbenz.xgherkin.gherkin.Feature
   * @generated
   */
  public Adapter createFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sebastianbenz.xgherkin.gherkin.NarrativeElement <em>Narrative Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sebastianbenz.xgherkin.gherkin.NarrativeElement
   * @generated
   */
  public Adapter createNarrativeElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sebastianbenz.xgherkin.gherkin.FreeText <em>Free Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sebastianbenz.xgherkin.gherkin.FreeText
   * @generated
   */
  public Adapter createFreeTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sebastianbenz.xgherkin.gherkin.AsA <em>As A</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sebastianbenz.xgherkin.gherkin.AsA
   * @generated
   */
  public Adapter createAsAAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sebastianbenz.xgherkin.gherkin.InOrderTo <em>In Order To</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sebastianbenz.xgherkin.gherkin.InOrderTo
   * @generated
   */
  public Adapter createInOrderToAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sebastianbenz.xgherkin.gherkin.IWantTo <em>IWant To</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sebastianbenz.xgherkin.gherkin.IWantTo
   * @generated
   */
  public Adapter createIWantToAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sebastianbenz.xgherkin.gherkin.AbstractScenario <em>Abstract Scenario</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sebastianbenz.xgherkin.gherkin.AbstractScenario
   * @generated
   */
  public Adapter createAbstractScenarioAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sebastianbenz.xgherkin.gherkin.Scenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sebastianbenz.xgherkin.gherkin.Scenario
   * @generated
   */
  public Adapter createScenarioAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sebastianbenz.xgherkin.gherkin.ScenarioWithOutline <em>Scenario With Outline</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sebastianbenz.xgherkin.gherkin.ScenarioWithOutline
   * @generated
   */
  public Adapter createScenarioWithOutlineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sebastianbenz.xgherkin.gherkin.Example <em>Example</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sebastianbenz.xgherkin.gherkin.Example
   * @generated
   */
  public Adapter createExampleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sebastianbenz.xgherkin.gherkin.ExampleRow <em>Example Row</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sebastianbenz.xgherkin.gherkin.ExampleRow
   * @generated
   */
  public Adapter createExampleRowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sebastianbenz.xgherkin.gherkin.ExampleCell <em>Example Cell</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sebastianbenz.xgherkin.gherkin.ExampleCell
   * @generated
   */
  public Adapter createExampleCellAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sebastianbenz.xgherkin.gherkin.Background <em>Background</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sebastianbenz.xgherkin.gherkin.Background
   * @generated
   */
  public Adapter createBackgroundAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sebastianbenz.xgherkin.gherkin.Step <em>Step</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sebastianbenz.xgherkin.gherkin.Step
   * @generated
   */
  public Adapter createStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sebastianbenz.xgherkin.gherkin.WhenStep <em>When Step</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sebastianbenz.xgherkin.gherkin.WhenStep
   * @generated
   */
  public Adapter createWhenStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sebastianbenz.xgherkin.gherkin.ThenStep <em>Then Step</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sebastianbenz.xgherkin.gherkin.ThenStep
   * @generated
   */
  public Adapter createThenStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sebastianbenz.xgherkin.gherkin.GivenStep <em>Given Step</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sebastianbenz.xgherkin.gherkin.GivenStep
   * @generated
   */
  public Adapter createGivenStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.sebastianbenz.xgherkin.gherkin.AndStep <em>And Step</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.sebastianbenz.xgherkin.gherkin.AndStep
   * @generated
   */
  public Adapter createAndStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //GherkinAdapterFactory
