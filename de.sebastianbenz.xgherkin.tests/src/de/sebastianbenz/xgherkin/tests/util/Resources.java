package de.sebastianbenz.xgherkin.tests.util;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

public class Resources {

	public static void clearAdapters(Resource resource){
		Iterator<EObject> contents = resource.getAllContents();
		while (contents.hasNext()) {
			EObject eObject = (EObject) contents.next();
			eObject.eAdapters().clear();
		}
	}

}
