import java.util.ArrayList;

public class Panier {
    private ArrayList<Produit> panier = new ArrayList<>();

    //voici comment ajouter 1 seul article dans le panier à condition que la quantité le permette, et le décrémenter à ce dernier
    public void addArticleAuPanier(Produit produit) {
        if(produit.getQuantite() > 0) {
            Produit articleDansPanier = new Produit(produit.getNom(), produit.getDescription(), produit.getPrix(), 1, produit.getId());
            panier.add(articleDansPanier);
            produit.setQuantite(produit.getQuantite() - 1);
        }
    }
    
    
    //méthode pour calculer le prix total d'un panier
    public double calculerPrixTotal() {
        double prixTotal = 0;
        for (Produit produit : panier) {
            prixTotal += produit.getPrix() * produit.getQuantite();
        }
        return prixTotal;
    }
}
