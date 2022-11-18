package fr.algorithmie;

import org.junit.Test;
import org.junit.runner.RunWith;

import outils.Exercice;
import outils.ExerciceRunner;
import outils.Question;
import outils.Resultat;

/** Ne modifiez ni les noms des classes, ni les noms des méthodes.
 * Utilisez Resultat.log pour afficher les résultats
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="CalculMoyenne")
public class Ex08_CalculMoyenne {
	
	int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
	
	/**
	 * Ne pas modifier les informations portées par l'annotation
	 */
	@Test
	@Question(numero=1)
	public void calculMoyenne() {
		
		//TODO Calculez et LOGUEZ la moyenne des valeurs du tableau (la moyenne doit être une valeur décimale).


double somme1 = 0;
		for ( int i=0; i<array.length; i++)	{
			 somme1 = somme1 + array[i];
			 
			 }
			 
		double moyenne1 = somme1 / array.length;
		System.out.println("la moyenne1 est:");
		Resultat.log(moyenne1);
	
		
	}
	
	
	
	
	@Test
	@Question(numero=2)
	public void calculMoyenneValeursPositives() {
		
		//TODO Calculez et LOGUEZ la moyenne des valeurs POSITIVES du tableau
		
	double somme2 = 0;
		for ( int i=0; i<array.length; i++){
			while (i > 0) {
			 somme2 = somme2 + array[i];
			}		
		}
			 
		double moyenne2 = somme2 / array.length;
		System.out.println("la moyenne2 est:");
		Resultat.log(moyenne2);
	}

}
