package mobile.demo.oo;

public class Voiture {

    String marque;
    String modele;
    int kmParcouru;
    boolean enBonEtat = true;

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

}
