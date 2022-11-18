package fr.algorithmie;

import java.util.Arrays;
import java.util.OptionalInt;

import org.junit.Test;
import org.junit.runner.RunWith;

import outils.Exercice;
import outils.ExerciceRunner;
import outils.Question;
import outils.Resultat;

/**
 * Ne modifiez ni les noms des classes, ni les noms des méthodes. Utilisez
 * Resultat.log pour afficher les résultats
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom = "RechercheMin")
public class Ex07_RechercheMin {
	
	int minimum = Integer.MIN_VALUE;
	int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
	

	/**
	 * Ne pas modifier les informations portées par l'annotation
	 */
	@Test
	@Question(numero = 1)
	public void rechercherMin() {

		// TODO Grâce à un algorithme, recherchez le minimum du tableau et LOGUEZ le.

		

//		for (int i = 0; i <= array.length; i++) {
//			if (array[i] > minimum)
//				minimum = array[i];
//
//		}
//		System.out.println("la valeur minimal est:");
//		Resultat.log(minimum);
		
		OptionalInt min= Arrays.stream(array).min();
		Resultat.log(min);
	}

}
