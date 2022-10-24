package mobile.demo.oo;

public class Voiture {

    private String marque;
    private String modele;
    private int kmParcouru;
    private boolean enBonEtat = true;

    Voiture(){}

    Voiture( String marque, String modele ){
        this.marque = marque;
        this.modele = modele;
    }

    Voiture( String marque, String modele, int kmParcouru ){
        this.marque = marque;
        this.modele = modele;
        this.kmParcouru = kmParcouru;
    }

    // methode
    // - type de retour
    // - nom de methode
    // - paramètres
    // - corps de la méthode
    int rouler( int aParcourir ){
        this.kmParcouru += aParcourir;
        return kmParcouru;
    }

    // Methode qui font se crasher 2 voiture => 2 voit en mauvais état
    void faitUnAccident( Voiture contre ){
        this.enBonEtat = false;
        contre.enBonEtat = false;
    }

    public int getKmParcouru(){
        return kmParcouru;
    }

    public String getModele() {
        return modele;
    }

    public void setModele( String modele ){
        if( modele != null ) {
            this.modele = modele;
        }
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setKmParcouru(int kmParcouru) {
        this.kmParcouru = kmParcouru;
    }

    public boolean isEnBonEtat() {
        return enBonEtat;
    }

    public void setEnBonEtat(boolean enBonEtat) {
        this.enBonEtat = enBonEtat;
    }
}
