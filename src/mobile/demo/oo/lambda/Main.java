package mobile.demo.oo.lambda;

import mobile.demo.oo.*;
import mobile.exo.oo.competition.Sportif;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {

        ConsoleWriter cw = new ConsoleWriter();
        cw.accept( "salut" );

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String aEcrire) {
                System.out.println( aEcrire );
            }
        };
        consumer.accept( "hello" );

        // instanciation d'une classe anonyme basée sur une interface avec 1seule redef.
        consumer = (aEcrire) -> {
            System.out.println( aEcrire );
        };
        consumer.accept( "world!" );

        // Interfaces fonctionnelles: interface avec 1seule redef à réaliser
        // Elles se distinguent entre elles par le type de méthode à redéfinir

        // Runnable - methode sans param, et sans retour

        Thread th = new Thread( () -> System.out.println("salut") );
        th.start();

        // Consumer<T>: methode prenant 1 param de type T, et pas de retour
        Voiture v = new Voiture("Opel", "Mustang", Carburant.ELECTRIQUE, 400);
        Voiture v2 = new Voiture( "BipBoup", "VrimVroum", Carburant.DIESEL, 200 );

        v.faitUnAccident(v2);

        Consumer<Object> sout = System.out::println;

        List<String> liste = new ArrayList<>();
        liste.add("hello");
        liste.add("world!");
        liste.add("comment");
        liste.add("ca va?");
        liste.forEach( System.out::println );

        // Supplier<T>: methode sans param, avec un retour T

        Voiture v3 = new Voiture(Carburant.ESSENCE, 1);

        Optional<Voiture> optV = Optional.ofNullable( v3 );
        Voiture v4 = optV.orElseThrow(() -> { return new RuntimeException("Pas de voiture"); });

        // Predicate<T>: methode avec 1 param T, et un retour boolean

        List<String> listeFiltree = liste.stream()
                .filter( (chaine) -> chaine.length() > 5 )
                .toList();

        // Function<T, R>: methode avec 1 param T, et un retour R
        // Function<String, char[]>

        List<char[]> listeDesTailles = liste.stream()
                .map(String::toCharArray)
                .toList();

        // BiFunction<T,U, R>: methode avec 2 param (T, U), et un retour R

        String concatenation = liste.stream()
                .reduce( (acc, next) -> acc += next.length() )
                .get();


        // L'écriture de lambda:
        // - Il est possible d'omettre les parenthèses s'il y a un seul param.
        //          et que le type reste implicite
        // - Il est possible d'omettre les accolades si il y a une seule instruction
        //          si la seule instruction est un return, il faut l'omettre aussi

        Function<String, String> function = chaine -> chaine + "!";
    }

}
