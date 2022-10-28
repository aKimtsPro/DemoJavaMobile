package mobile.magasin;

public abstract class Produit {

    private final String marque;
    private double prix;

    public Produit(String marque, double prix) {
        this.marque = marque;
        this.prix = prix;
    }

    public String getMarque() {
        return marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        if( prix > 0 )
            this.prix = prix;
    }
}
