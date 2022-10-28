package mobile.magasin;

import java.time.LocalDate;

public class Tomate extends Produit implements Perimable {

    private final String variete;
    private final LocalDate datePeremption;

    public Tomate(String marque, double prix, String variete ){
        super(marque, prix);
        this.variete = variete;
        LocalDate ajd = LocalDate.now();
        this.datePeremption = ajd.plusDays(5);
    }

    public String getVariete() {
        return variete;
    }

    @Override
    public LocalDate getDatePeremption() {
        return datePeremption;
    }
}
