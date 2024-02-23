public class Produit {
    private String nom;
    private String description;
    private int prix;
    private int quantite;
    private int id;

public Produit(String nom, String description, int prix, int quantite, int id) {
    this.nom = nom;
    this.description = description;
    this.prix = prix;
    this.quantite = quantite;
    this.id = id;
}

public String getNom() {
    return nom;
}

public void setNom(String nom) {
    this.nom = nom;
}

public String getDescription() {
    return description;
}

public void setDescription(String description) {
    this.description = description;
}

public int getPrix() {
    return prix;
}

public void setPrix(int prix) {
    this.prix = prix;
}

public int getQuantite() {
    return quantite;
}

public void setQuantite(int quantite) {
    this.quantite = quantite;
}

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}
public void afficher() {
    System.out.println(this);
}

@Override
public String toString() {
    return "Produits{" +
     "nom = " + nom +
      ", description = " + description + 
      ", prix = " + prix + 
      ", quantite = " + quantite + 
      ", id = " + id +
       '}';
}
}
