package fr.algorithmie;

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
@Exercice(nom = "FirstLast6")
public class Ex11_FirstLast6 {

	int[] tab1 = {};
	int[] tab2 = { 2 };
	int[] tab3 = { 6 };
	int[] tab4 = { 1, 6 };
	int[] tab5 = { 6, 2 };
	int[] tab6 = { 0, 6, 2 };

	/**
	 * Ne pas modifier les informations portées par l'annotation. AU TOTAL : 6
	 */
	@Test
	@Question(numero = 1)
	public void afficherAlgo() {

		// TODO Calculez une valeur booléenne qui contrôle le tableau de la sorte :
		// o elle vaut true si le tableau a au moins 1 élément et si le premier élément
		// ou le dernier élément vaut 6.
		// o elle vaut false dans les autres cas

		// TODO LOGUEZ la valeur obtenue pour chacun des 6 tableaux tab1 à tab6

		boolean b = false;
		for (int i = 0; i < tab1.length; i++) {
			if ((tab1[i] != 0) && ((tab1[0] == 6) || (tab1[tab1.length - 1] == 6))) {
				b = true;
			} else {
				b = false;
			}
			System.out.println("la valeur de b est :");
			Resultat.log(b);
			break;
		}

		boolean b1;
		for (int i = 0; i < tab2.length; i++) {
			if ((tab2[i] != 0) && ((tab2[0] == 6) || (tab2[tab2.length - 1] == 6))) {
				b1 = true;
			} else {
				b1 = false;
			}
			System.out.println("la valeur de b1 est :");
			Resultat.log(b1);
			break;
		}

		boolean b2;
		for (int i = 0; i < tab3.length; i++) {
			if ((tab3[i] != 0) && (tab3[0] == 6 || tab3[tab3.length - 1] == 6)) {
				b2 = true;
			} else {
				b2 = false;
			}
			System.out.println("la valeur de b2 est :");
			Resultat.log(b2);
			break;
		}

		
		boolean b3;
		for (int i = 0; i< tab4.length; i++) {
			if ((tab4[i] != 0) && (tab4[0] == 6 || tab4[tab4.length - 1] == 6)) {
				b3 = true;
			} else {
				b3 = false;
			}
			System.out.println("la valeur de b3 est :");
			Resultat.log(b3);
			break;
		}

		boolean b4;
		for (int i = 0; i < tab5.length;  i++) {
			if ((tab5[i] != 0) && (tab5[0] == 6 || tab1[tab5.length - 1] == 6)) {
				b4 = true;
			} else {
				b4 = false;
			}
			System.out.println("la valeur de b4 est :");
			Resultat.log(b4);
			break;
		}

		boolean b5;
		for (int i = 0; i < tab6.length; i++ ) {
			if ((tab6[i] != 0) && (tab6[0] == 6 || tab6[tab6.length - 1] == 6)) {
				b5 = true;
			} else {
				b5 = false;
			}
			System.out.println("la valeur de b5 est :");
			Resultat.log(b5);
			break;
		}

	}

}

