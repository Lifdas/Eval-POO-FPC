import java.time.LocalDate;
public class ProduitAlimentaires extends Produit{
    private LocalDate datePeremption;

    public ProduitAlimentaires(String nom, String description, int prix, int quantite, int id, LocalDate date){
        super(nom, description, prix, quantite, id);
        this.datePeremption = datePeremption;
    }
    public LocalDate getDatePeremption() {
        return datePeremption;
    }
    public void setDatePeremption(LocalDate datePeremption) {
        this.datePeremption = datePeremption;
    }
    
    public void afficher() {
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "Produits Alimentaires{" +
                "datePeremption = " + datePeremption +
                '}' + super.toString();
    
}
}
