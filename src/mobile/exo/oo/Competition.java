package mobile.exo.oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Competition {

    private List<Sportif> inscrits = new ArrayList<>();
     Sportif gagnant;

    void inscrire(Sportif aInscrire){

        if( gagnant == null && !inscrits.contains(aInscrire) ) {
            inscrits.add(aInscrire);
        }
    }

    boolean desinscrire(Sportif aDesinscrire){
        if( gagnant == null )
            return inscrits.remove(aDesinscrire);

        return false;
    }

    void lancer(){

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
