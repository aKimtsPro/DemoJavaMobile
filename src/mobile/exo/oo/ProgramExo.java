package mobile.exo.oo;

public class ProgramExo {

    public static void main(String[] args) {

        Personne pers = new Personne("Dupont","Luc", "21/09/1952");
        pers.setTaille(185);
        pers.setPoid(85);

        Personne pers2 = new Personne("Dubois","Marie","21/09/1978",185,85);
        Personne pers3 = new Personne();

        pers2.presentation();
        pers.salutation( pers2 );
        pers2.salutation( pers );

        pers.salutation( pers );

        System.out.println( pers.calculIMC() );


        Competition competition = new Competition();

        // Sportif est abstract => impossible d'instancier un Sportif
//        Sportif s = new Sportif("dupont","luc","10/10/1990", 185,85);
//        s.setPoid( 81 );
//        competition.inscrire( s );
//
//        competition.getInscrits().clear();
//
//        for (int i = 0; i < 5; i++) {
//            s.participer();
//        }
//
//        System.out.println( s );

        Judoka j = new Judoka("dupuis", "dominique", "04/12/1975", 170, 65);
        for (int i = 0; i < 5; i++) {
            j.participer();
        }
        System.out.println( j );

        Footballeur f =  new Footballeur( "dubois", "marie", "15/02/1998", 175, 70 );
        for (int i = 0; i < 5; i++) {
            f.participer();
        }
        System.out.println( f );

        Golfeur g = new Golfeur( "Woods", "Tiger", "01/01/01", 185, 85, 10 );
        for (int i = 0; i < 5; i++) {
            g.participer();
        }
        System.out.println( g );


    }

}
