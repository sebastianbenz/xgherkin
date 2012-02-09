package de.sebastianbenz.xgherkin.ui.contentassist;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EReferenceImpl;

public class SyntheticReference extends EReferenceImpl{

	private final EClass type;

	public SyntheticReference(EClass type) {
		this.type = type;
	}

	public static EReference create(EClass type){
		return new SyntheticReference(type);
	}
	
	public EClass getType() {
		return type;
	}
	
	@Override
	public String getName() {
		return "reference " + type.getName();
	}
	
}
