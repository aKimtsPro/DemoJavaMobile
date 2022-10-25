package mobile.exo.oo;

import java.util.Random;

public class Sportif {

    private String nom;
    private String prenom;
    private String dateNaiss;
    private Integer taille; // cm
    private Integer poid;
    private int medailles;

    public Sportif(){}

    public Sportif(String nom, String prenom, String dateNaiss, int taille, int poid) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaiss = dateNaiss;
        this.setTaille( taille );
        this.setPoid( poid );
    }

    public Sportif(String nom, String prenom, String dateNaiss, int taille, int poid, int medailles) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaiss = dateNaiss;
        this.setTaille( taille );
        this.setPoid( poid );
        this.setMedailles( medailles );
    }

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

    private void setMedailles(int medailles) {
        if( medailles >= 0 )
            this.medailles = medailles;
    }
}
