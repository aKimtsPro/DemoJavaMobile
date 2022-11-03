package mobile.exo.oo.competition;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Competition {

    private final List<Sportif> inscrits = new ArrayList<>();
    private Sportif gagnant;

    void inscrire(Sportif aInscrire) throws Exception {
        // TODO dans le cas ou le sportif est déjà inscrit, lancer une exception
        if( gagnant != null )
            throw new Exception( "compet déjà lancée" );
        // TODO dans le cas ou la competition a déjà été lancé, lancez une exception
        if( inscrits.contains( aInscrire ) )
            throw new Exception( "déjà inscrit" );

        inscrits.add( aInscrire );
    }

    void desinscrire(Sportif aDesinscrire) throws Exception {
        // TODO dans le cas ou le sportif n'est pas inscrit, lancer une exception
        if( gagnant != null )
            throw new Exception( "compet déjà lancée" );
        // TODO dans le cas ou la competition a déjà été lancé, lancez une exception
        if( !inscrits.contains( aDesinscrire ) )
            throw new Exception( "pas inscrit" );

        inscrits.remove( aDesinscrire );
    }

    void lancer() throws Exception {
        // TODO dans le cas ou la competition a déjà été lancée, lancez une exception
        if( gagnant != null )
            throw new Exception( "déjà lancée" );

        if( inscrits.size() < 3 )
            throw new Exception( "pas assez d'inscrits" );

        Random rdm = new Random();
        int indexGagnant = rdm.nextInt( inscrits.size() );
        gagnant = inscrits.get( indexGagnant );

    }

    List<Sportif> getInscrits(){
        return new ArrayList<>(inscrits);
    }

    public Sportif getGagnant() {
        return gagnant;
    }
}
