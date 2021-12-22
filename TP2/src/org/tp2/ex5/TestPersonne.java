package org.tp2.ex5;

import java.util.*;

public class TestPersonne {

	public static void main(String[] args) {
		
		/**
		 * Création de notre tableau contenant les personnes
		 */
		Personne personneArray[] = {			
				new Personne("Ach", "Idricealy", 20),
				new Personne("Ach", "Busuf", 3),
				new Personne("Dupont", "Guillaume", 2),
				new Personne("MZE", "Said", 43),
				new Personne("AZE","Aayane", 3)
		};
		
		/**
		 * On crée notre liste via notre tableau contenant les personnes
		 */
		List<Personne> lP = Arrays.asList(personneArray);
		
		System.out.println("Liste non triée : "+lP);
		
		/**
		 * On tri notre liste en fonction de notre méthode compareTo
		 * de la classe Personne.
		 */
		Collections.sort(lP); 
		System.out.println("Liste triée : "+lP);
	}

}
