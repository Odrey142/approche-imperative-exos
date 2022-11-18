package fr.algorithmie;

import org.junit.Test;

import outils.Question;
import outils.Resultat;

public class Ex10_ComparaisonTableau {
	int[] array1 = { 1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4 };
	int[] array2 = { 3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8 };

	/**
	 * Ne pas modifier les informations portées par l'annotation
	 */

	@Test
	@Question(numero = 1)
	public void calculerElementsCommuns() {
		// TODO LOGUER le nombre de valeurs communes aux 2 tableaux.
		// Exemple : On peut déjà voir que les valeurs 3 et 8 sont communes aux 2
		// tableaux, mais
		// Combien y en a t'il au total ?

		for (int i = 0; i < array1.length; i++) {
			if (array1[i] == array2[array2.length-1]) {
				Resultat.log(array1[i]);

			}
		}
	}
}