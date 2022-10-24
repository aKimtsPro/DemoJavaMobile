package mobile.exo.oo;

public class DemoObj {

    public static void main(String[] args) {

        Personne pers = new Personne();
        pers.nom = "Dupont";
        pers.prenom = "Luc";
        pers.dateNaiss = "21/09/1952";
        pers.taille = 185;
        pers.poid = 85;

        Personne pers2 = new Personne();
        pers2.nom = "Dubois";
        pers2.prenom = "Marie";
        pers2.dateNaiss = "21/09/1978";
        pers2.taille = 185;
        pers2.poid = 85;

        pers2.presentation();
        pers.salutation( pers2 );
        pers2.salutation( pers );

        pers.salutation( pers );

        System.out.println( pers.calculIMC() );
    }

}
