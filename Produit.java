package sujet.un;

/** 
 * Description de la classe <b>Produit</b>.
 */
public class Produit {

  private String reference;
  private  double   prix; 
  double tva = 0.20;

  public Produit(String reference1) {
    reference = reference1;
  } 

  /** .@return le prix. */
  public double getPrix() { 
    return this.prix;
  }

  /** modifie le prix */
  public    final void setPrix(Double prix) {
    this.prix = prix;
  } 

  /** 
  * .@return la reference si le prix est positif, null sinon
  * 
  */
  public final String getReference() { 
    String resultat = null;
    if  (prix > 0) {
      resultat = this.reference; 
    }
    return resultat;
  }

  @Override
  public boolean equals(Object o) {
    return reference == ((Produit) o).reference;
  }

}
