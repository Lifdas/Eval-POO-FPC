import java.util.ArrayList;
import java.util.List;

public class Boutique {
    private ArrayList<Produit> produits = new ArrayList<>();

    //j'ajoute 1 produit à la boutique
    public void addArticle(Produit produit) {
        produits.add(produit);
    }
    //j'ajoute plusieurs produits à la boutique
    public void ajouterProduits(List<Produit> nouveauxProduits) {
        produits.addAll(nouveauxProduits);
    }

    public List<Produit> getArticle() {
        return produits;
    }
    //boucle pour afficher la liste des produits disponibles dans la boutique

    public List<Produit> getProduitsDispo() {
        List<Produit> produitsDispo = new ArrayList<>();
        for (Produit produit : produits) {
            if (produit.getQuantite() > 0) {
                produitsDispo.add(produit);
            }
        }
        return produitsDispo;
    }
    public void afficherStock(){
        for (Produit produit : produits){
            produit.afficher();
        }
    }
}


