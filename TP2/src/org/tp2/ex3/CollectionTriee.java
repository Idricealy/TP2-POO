package org.tp2.ex3;

import java.util.*;

public class CollectionTriee {
	
	/**
	 * M�thode qui nous permet de g�nerer une liste 
	 * d'entiers et de la tri�e par la suite
	 * @param nb nombre d'entier � gen�rer.
	 * @return une liste d'entiers
	 */
	public static List<Integer> genListTrie(int nb) {
		List<Integer> lTri = new ArrayList<Integer>();
		Random r = new Random();
		
		for(int i=0 ; i < nb; i++) {
			int nbAleatoire = r.nextInt(1000-0) + 0;		
			lTri.add(nbAleatoire);
		}
		Collections.sort(lTri);
		return lTri;
	}
	
	/**
	 * M�thode qui nous permet un ensemble 
	 * d'entiers tri�e.
	 * @param nb nombre d'entiers � gen�rer
	 * @return un ensemble d'entiers tri�e
	 */
	public static Set<Integer> genSetTrie(int nb){
		Set<Integer> sTri = new TreeSet<Integer>();
		Random r = new Random();
		
		for(int i=0 ; i < nb; i++) {
			int nbAleatoire = r.nextInt(1000-0) + 0;		
			sTri.add(nbAleatoire);
		}
		return sTri;
	}
	
	public static void main(String[] args) {
		System.out.println(genListTrie(20));
		System.out.println(genSetTrie(20));
	}

}
