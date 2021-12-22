package org.tp2.ex1;

/**
 * Classe générique permettant de manipuler des paires
 * d'objet de type hétérogèenes.
 * @author Idricealy MOURTADHOI
 *
 * @param <S>
 * @param <U>
 */
public class Paires<S, U> {
	private S s1;
	private U u1;
	
	public Paires(S s, U u) {
		this.s1 = s;
		this.u1 = u;
	}

	public S getS1() {
		return s1;
	}

	public U getU1() {
		return u1;
	}
	
	
}
