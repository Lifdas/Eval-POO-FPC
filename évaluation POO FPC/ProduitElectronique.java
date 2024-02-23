public class ProduitElectronique extends Produit{
    private int dureeGarantie;
    
    public ProduitElectronique(String nom, String description, int prix, int quantite, int id, int dureeGarantie){
        super(nom, description, prix, quantite, id);
        this.dureeGarantie = dureeGarantie;
    }
    public int getDureeGarantie() {
        return dureeGarantie;
    }
    public void setDureeGarantie(int dureeGarantie) {
        this.dureeGarantie = dureeGarantie;
    }
    public void afficher() {
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "Produits Electroniques{" +
                "dureeGarantie = " + dureeGarantie +
                '}' + super.toString();
    }
}
