import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        //je crée une instance de boutique affectée à une variable
        System.out.println("Logiciel de Boutique");
        
        //je crée 3 produits que j'ajoute à la boutique avec la méthode addArticle
        Produit livre = new Produit("Manuel des joueurs", "Livre de règles DnD", 50, 10, 1);
        Produit stylo = new Produit("Stylo 4 couleurs", "Pratique en tout points", 50, 5, 2);
        Produit fruit = new Produit("Pommes", "Pour éloigner votre docteur", 20, 2, 3);
        Boutique boutique = new Boutique();
        boutique.addArticle(livre);
        boutique.addArticle(stylo);
        boutique.addArticle(fruit);
        
        //je vérifie si les produits dans la boutique (tous et pas seulement ceux dispo)
        System.out.println(boutique.getArticle());        

        //création d'une liste pour ajouter plusieurs produits en même temps.
        List<Produit> nouveauxProduits = new ArrayList<>();
        LocalDate datePeremptionPizza = LocalDate.of(2024, 2, 26);
        nouveauxProduits.add(new ProduitAlimentaires("Pizza", "pizza aux 4 fromages pour les grands et petits", 5, 10, 4,datePeremptionPizza));
        nouveauxProduits.add(new ProduitBoisson("Sprite", "garanti sans calorie", 1, 24, 4, 33));
        nouveauxProduits.add(new ProduitElectronique("Laptop gaming", "Le meilleur rapport qualité prix", 1500, 3, 5, 12));
        
        //j'instancie une liste pour ajouter plusieurs produits en même temps !
        boutique.ajouterProduits(nouveauxProduits);
        System.out.println (boutique.getProduitsDispo());

        boutique.afficherStock();
        Panier panier = new Panier();
        panier.addArticleAuPanier(fruit);
        panier.addArticleAuPanier(livre);
        panier.addArticleAuPanier(stylo);
        System.out.println (panier.calculerPrixTotal());
    }
}