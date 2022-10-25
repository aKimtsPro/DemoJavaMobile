package mobile.exo.oo;

public class DemoObj {

    public static void main(String[] args) {

        Personne pers = new Personne("Dupont","Luc");
        pers.dateNaiss = "21/09/1952";
        pers.taille = 185;
        pers.poid = 85;


        Personne pers2 = new Personne("Dubois","Marie","21/09/1978",185,85);
        Personne pers3 = new Personne();

        pers2.presentation();
        pers.salutation( pers2 );
        pers2.salutation( pers );

        pers.salutation( pers );

        System.out.println( pers.calculIMC() );


        Competition competition = new Competition();

        Sportif s = new Sportif("dupont","luc","10/10/1990", 185,85);
        s.setPoid( 81 );
        competition.inscrire( s );

        competition.getInscrits().clear();
    }

}
