package org.tp2.ex1;

/**
 * Classe repr�sentant une personne
 * @author Idricealy MOURTADHOI
 *
 */
public class Personne {
	private String nom;
	
	public Personne (String n) {
		this.nom = n;
	}

	@Override
	public String toString() {
		return nom;
	}
	
	
}
