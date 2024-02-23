public class ProduitBoisson extends Produit{
    private int cl;

    public ProduitBoisson(String nom, String description, int prix, int quantite, int id, int cl) {
        super(nom, description, prix, quantite, id);
        this.cl = cl;
    }
    public int getQuantite() {
        return cl;
    }
    public void setQuantite(int quantite) {
        this.cl = quantite;
    }
    public void afficher() {
        System.out.println(this);
    }
    @Override
    public String toString() {

        return "Produits Boisson{" +
                "quantité = " + cl +
                '}' + super.toString();
    }
}
