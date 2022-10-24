package mobile.exo.oo;

import java.util.Random;

public class Sportif {

    private String nom;
    private String prenom;
    private String dateNaiss;
    private int taille; // cm
    private int poid;
    private int medailles;

    public boolean participer(){

        Random randomGenerator = new Random();
        int randomized = randomGenerator.nextInt(5);
        if( randomized == 4 ){
            medailles++;
            return true;
        }
        return false;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getDateNaiss() {
        return dateNaiss;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        if( taille >= 100 && taille <= 200 ) {
            this.taille = taille;
        }
    }

    public int getPoid() {
        return poid;
    }

    public void setPoid(int poid) {
        if( poid >= 50 && poid <= 150 ) {
            this.poid = poid;
        }
    }

    public int getMedailles() {
        return medailles;
    }


}
