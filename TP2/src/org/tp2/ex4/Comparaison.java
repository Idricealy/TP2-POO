package org.tp2.ex4;

import java.util.*;

public class Comparaison{
	/**
	 * Comparateur permettant le tri d'une Collection de manière lexicographique.
	 */
	static final Comparator<String> LEXICOGRAPHIQUE = 
			new Comparator<String>() {		
				@Override
				public int compare(String o1, String o2){
					return (o1.toLowerCase().compareTo(o2.toLowerCase()));
				}
			};
	
	/**
	 * Comparateur permettant le tri en comparant d'abord
	 * la taille de deux chaînes de caractères avant d'utiliser l'ordre 
	 * lexicopgraphique.
	 */
	static final Comparator<String> MILITAIRE = 
			new Comparator<String>() {		
				@Override
				public int compare(String o1, String o2){
					int c = o1.length() - o2.length();
					return c != 0 ? c : LEXICOGRAPHIQUE.compare(o1, o2);
				}
			};
	public static void main(String[] args) {
		List<String> lLexic = new ArrayList<String>();
		List<String> lMilitaire = new ArrayList<String>();
		/**
		 * on crée le tableau qui va nous permettre de dupliquer
		 * les éléments passé en argument 
		 */
		String[] tabArgs = new String[args.length-1];
		
		/**
		 * On ajoute les arguments passé en paramètre, à notre nouveau
		 * tableau, sauf le premier indice qui lui nous permet de choisir
		 * le mode d'affichage souhaité.
		 */
		for(int i=0, k=0; i < args.length; i++) {
			if(i == 0) {
				continue;
			}
			tabArgs[k++] = args[i];
		}

		for(String s : tabArgs) {
			lMilitaire.add(s);
		}
		
		for(String s : tabArgs) {
			lLexic.add(s);
		}
		
		Collections.sort(lLexic, LEXICOGRAPHIQUE);
		Collections.sort(lMilitaire, MILITAIRE);
		
		if(args[0].toLowerCase().equals("lexicographie")) {
			System.out.println(lLexic);
		}else if(args[0].toLowerCase().equals("militaire")) {
			System.out.println(lMilitaire);
		}else if(args[0].toLowerCase().equals("inverse")){
			Collections.sort(lLexic, Collections.reverseOrder());
			System.out.println(lLexic);
		}else {
			System.err.println("Veuillez choisir un affichage disponible (lexicographie, militaire, inverse)");
		}

	}



}
