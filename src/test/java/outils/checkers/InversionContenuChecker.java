package outils.checkers;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

public class InversionContenuChecker extends AbstractChecker {

	public void check1(Map<String, Object> fieldValues) {
		List<String> lignes = commonChecks();
	
		int[] array = (int[])fieldValues.get("array");
		
		assertTrue("Vous devez afficher le contenu du tableau dans l'ordre inverse mais vous n'avez affiché que "+lignes.size(), array.length==lignes.size());
		
		for (int i=0; i<lignes.size(); i++) {
			int value = array[array.length-i-1];
			assertTrue("Vous devez afficher le contenu du tableau dans l'ordre inverse, hors la ligne n°"+(i+1)+" contient "+lignes.get(i)+" au lieu de "+value, lignes.get(i).equals(Integer.toString(value)));
		}
	}
}
