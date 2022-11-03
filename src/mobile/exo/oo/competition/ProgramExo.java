package mobile.exo.oo.competition;

public class ProgramExo {

    public static void main(String[] args) {

        Competition competition = new Competition();

        Sportif s = new Judoka("dubois","luc", "01/01/1990", 180, 75);

        try{
            competition.inscrire( s );
            competition.inscrire( s );
            System.out.println("Bravo vous êtes inscrit");
        }
        catch (Exception ex){
            System.out.println("Inscription impossible");
        }


    }

}
