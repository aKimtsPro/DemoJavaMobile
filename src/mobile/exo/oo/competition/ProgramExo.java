package mobile.exo.oo.competition;

import mobile.demo.oo.Oiseau;

public class ProgramExo {

    public static void main(String[] args) {

        Competition<Judoka> competition = new Competition<>();
        Judoka s = new Judoka("dubois","luc", "01/01/1990", 180, 75);

        try{
            competition.inscrire( s );
            competition.inscrire( s );
            System.out.println("Bravo vous êtes inscrit");
        }
        catch (Exception ex){
            System.out.println("Inscription impossible");
        }

        int nbrMedaille5Plus = competition.getNbrOf( (sportif) -> {
            return sportif.getMedailles() > 5;
        } );


    }

}
