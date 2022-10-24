package mobile.exo.oo;



public class Personne {
    String nom;
    String prenom;
    String dateNaiss;
    int taille;
    int poid;

    void presentation() {
        System.out.println("Hello, I am "+ this.prenom );
    }

    // 2 - Créez une méthode permettant à une Personne de saluer une autre
    // Personne (dire "Bonjour <nom de l'autre personne>, je suis
    // <nom de la personne>")
    void salutation( Personne aSaluer ){
        if(this != aSaluer){
            System.out.println( "Bonjour " + aSaluer.prenom + ", je suis " + this.prenom );
        }
    }

    // 185, 1.85
    // 3 - Calcul (IMC = poid / taille^2) - taille en m
    double calculIMC(){
        double tailleM = this.taille / 100.0;
        return this.poid / (tailleM * tailleM);
    }

}
