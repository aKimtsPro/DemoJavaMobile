package mobile.demo.oo.stream;

import mobile.exo.oo.competition.Personne;

import java.util.ArrayList;
import java.util.List;

public class DemoStream {

    public static void main(String[] args) {

        List<Personne> personnes = new ArrayList<>();

        personnes.add( new Personne("Dubois", "Luc", "01/01/1990") );
        personnes.add( new Personne("Dupont", "Dominique", "11/05/1995") );
        personnes.add( new Personne("Dateau", "Dominique", "11/05/1996") );
        personnes.add( new Personne("Bateau", "Marie", "25/04/1962") );

        personnes.stream()
                // Operation intermédiaire
                .filter( pers -> pers.getNom().startsWith( "D" ) )
                .map( Personne::getPrenom )
                .distinct()
                .sorted()
                .limit( 1 )
                .skip(1)
                // Opération terminale
                .findFirst()
                // Operation sur Optional
                .orElseThrow( () -> new RuntimeException("Personne ne correspond") );




    }

}
