package org.tp2.ex5;

/**
 * Classe représentant une personne 
 * implémentent l'interface Comparable
 * @author Idricealy MOURTADHOI
 *
 */
public class Personne implements Comparable<Personne>{
	private int age;
	private String nom;
	private String prenom;
	
	public Personne(String n, String p, int a) {
		this.nom = n;
		this.prenom = p;
		this.age = a;
	}
	
	public int getAge() {
		return age;
	}


	public String getNom() {
		return nom;
	}


	public String getPrenom() {
		return prenom;
	}

	/**
	 * Méthode réécrite afin de comparer les personnes en debutant par l'age,
	 * puis par l'ordre alphabétique de leur nom et prénom.
	 */
	@Override
	public int compareTo(Personne o) {
		int cAge = Integer.compare(age, o.getAge());
		int cNom = nom.compareTo(o.getNom());
		
		return cAge != 0 ? cAge :  cNom != 0 ? cNom : prenom.compareTo(o.getPrenom());
	}

	@Override
	public String toString() {
		return nom +" "+prenom + " "+age+"ans";
	}
	
}
