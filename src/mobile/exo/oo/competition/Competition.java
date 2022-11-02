package mobile.exo.oo.competition;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Competition {

    private final List<Sportif> inscrits = new ArrayList<>();
    Sportif gagnant;

    void inscrire(Sportif aInscrire){
        // TODO dans le cas ou le sportif est déjà inscrit, lancer une exception
        // TODO dans le cas ou la competition a déjà été lancé, lancez une exception
    }

    boolean desinscrire(Sportif aDesinscrire){
        // TODO dans le cas ou le sportif n'est pas inscrit, lancer une exception
        // TODO dans le cas ou la competition a déjà été lancé, lancez une exception
    }

    void lancer(){
        // TODO dans le cas ou la competition a déjà été lancée, lancez une exception

        if( gagnant == null && inscrits.size() >= 3 ){
            Random rdm = new Random();
            int indexGagnant = rdm.nextInt( inscrits.size() );
            gagnant = inscrits.get( indexGagnant );
        }

    }

    List<Sportif> getInscrits(){
        return new ArrayList<>(inscrits);
    }

    public Sportif getGagnant() {
        return gagnant;
    }
}
