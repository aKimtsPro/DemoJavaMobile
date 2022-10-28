package mobile.magasin;

import java.time.LocalDate;

public class Biere extends Produit implements AgeLegal, Perimable {

    private final double tauxAlcool;
    private final LocalDate datePeremption;

    public Biere(String marque, double prix, double tauxAlcool) {
        super(marque, prix);
        this.tauxAlcool = tauxAlcool;
        datePeremption = LocalDate.now().plusYears(5);
    }

    public double getTauxAlcool() {
        return tauxAlcool;
    }

    public boolean isAuthorized(int age){
        return age >= 16;
    }

    @Override
    public LocalDate getDatePeremption() {
        return datePeremption;
    }
}
