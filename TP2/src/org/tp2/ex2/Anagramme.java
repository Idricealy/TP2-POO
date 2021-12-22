package org.tp2.ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Anagramme {
	
	/**
	 * Méthode qui nous permet de classer le mot passé en paramètre en ordre alphabétique
	 * @param le mot
	 * @return l'ordre alphabétique
	 */
	private static String alphabetize(String s){
		int count[] = new int[256];
		int len = s.length();
		
		for (int i=0; i<len; i++) count[s.charAt(i)]++;
		StringBuffer result = new StringBuffer(len);
		
		for (char c='a'; c<='z'; c++)
			for (int i=0; i<count[c]; i++) result.append(c);
		
		return result.toString();	 
	}
	
	/**
	 * Méthode permet de générer notre Anagramme
	 * @param fileName
	 * @param nb
	 */
	public static void genAnagramme(String fileName, int nb) {
		File f = new File(fileName);
		Map<String, List<String>> m = new HashMap<String, List<String>>();
		try{
			Scanner scan = new Scanner(f);
			String word;
			while(scan.hasNext()) {
				String alpha = alphabetize(word = scan.next());
				List<String> l = m.get(alpha);
				if (l == null ) m.put(alpha, l = new ArrayList<String>());
				l.add(word);
			}
			scan.close();
		}catch(FileNotFoundException e){
			System.err.println("Le fichier n'a pas ete trouve...");
		}
		for(List<String> l : m.values()) {
			if(l.size() >= nb) System.out.println(l.size() + ": "+l);
		}
	}
	
	public static void main(String[] args){
		//Chemin absolue car problème entre liaison de mon workspace sur Eclipse
		String fileName = "C:\\Users\\idric\\Documents\\Corte\\POO\\Code\\TP2\\src\\org\\tp2\\ex2\\text.txt";
		genAnagramme(fileName, 8);
	}

}
