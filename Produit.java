package dev;

/**
 * Classe Produit représentant un produit avec un prix et une référence.
 */
public class Produit {

	/** declaration des variables */

	private final String reference;
	private double prix;

	/** C'est la tva */

	public final static double TVA = 0.20;

	public Produit(String reference) {
		this.reference = reference;

	}

	/**
	 * @return le prix
	 */
	public double getPrix() {
		return this.prix;
	}

	/** modifie le prix. */
	public final void setPrix(double prix) {
		this.prix = prix;
	}

	/**
	 * @return la reference si le prix est positif, null sinon
	 */
	public final String getReference() {
		String resultat = reference;
		if (prix > 0) {
			return resultat;
		}
		return null;
	}

	@Override
	public boolean equals(Object o) {
		if (o != null && o.getClass() == this.getClass()) {
			 final Produit pt = (Produit) o;
			return this.reference == pt.reference;
		}
		return false;

	}

}
