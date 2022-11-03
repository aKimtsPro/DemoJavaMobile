package mobile.exo.oo.competition;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class Competition<TRUC extends Sportif> {

    private final List<TRUC> inscrits = new ArrayList<>();
    private TRUC gagnant;


    public int getNbrOf(Predicate<Sportif> verification){
        int nbr = 0;

        for (TRUC inscrit : inscrits) {
            if( verification.test( inscrit ) )
                nbr++;
        }

        return nbr;
    }

    public void inscrire(TRUC aInscrire){
        // TODO dans le cas ou le sportif est déjà inscrit, lancer une exception
        // TODO dans le cas ou la competition a déjà été lancé, lancez une exception
    }

    public void desinscrire(TRUC aDesinscrire){
        // TODO dans le cas ou le sportif n'est pas inscrit, lancer une exception
        // TODO dans le cas ou la competition a déjà été lancé, lancez une exception
    }

    public void lancer(){
        // TODO dans le cas ou la competition a déjà été lancée, lancez une exception

        if( gagnant == null && inscrits.size() >= 3 ){
            Random rdm = new Random();
            int indexGagnant = rdm.nextInt( inscrits.size() );
            gagnant = inscrits.get( indexGagnant );
        }

    }

    public List<TRUC> getInscrits(){
        return new ArrayList<>(inscrits);
    }

    public TRUC getGagnant() {
        return gagnant;
    }
}
