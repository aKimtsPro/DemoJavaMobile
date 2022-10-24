package mobile.exo.oo;

public class Personne {
    private String nom;
    public String prenom;
    protected String dateNaiss;
    int taille; // package private
    int poid;

    public Personne() {
    }

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personne(String nom, String prenom, String dateNaiss, int taille, int poid) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaiss = dateNaiss;
        this.taille = taille;
        this.poid = poid;
    }

    // Signature
    // - classe
    // - nom
    // - params
    public void presentation() {
        System.out.println("Hello, I am "+ this.prenom );
    }

    // surcharge (polymorphisme)
    public void presentation( int iteration ){
        for (int i = 0; i < iteration; i++) {
            this.presentation();
        }
    }

    // 2 - Créez une méthode permettant à une Personne de saluer une autre
    // Personne (dire "Bonjour <nom de l'autre personne>, je suis
    // <nom de la personne>")
    public void salutation( Personne aSaluer ){
        if(this != aSaluer){
            System.out.println( "Bonjour " + aSaluer.prenom + ", je suis " + this.prenom );
        }
    }

    // 185, 1.85
    // 3 - Calcul (IMC = poid / taille^2) - taille en m
    public double calculIMC(){
        double tailleM = this.taille / 100.0;
        return this.poid / (tailleM * tailleM);
    }

}
