package mobile.demo.oo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Voiture v1 = new Voiture("opel", "mustang", Carburant.ESSENCE);
        int nbrKmParcouru = v1.getKmParcouru();

        System.out.println(v1.getMarque());
        System.out.println(v1.getModele());

        // autre Voiture marque BipBoup modele Vroum

        Voiture v2 = new Voiture("BipBoup","Vroum", Carburant.ELECTRIQUE,15000);
        v1.rouler( 10 );


        System.out.println(v2.getMarque());
        System.out.println(v2.getModele());

        System.out.println( v1.isEnBonEtat() ); // true
        System.out.println( v2.isEnBonEtat() ); // true

        v1.faitUnAccident( v2 );

        System.out.println( v1.isEnBonEtat() ); // false
        System.out.println( v2.isEnBonEtat() ); // false

        Vehicule vehicule = new Voiture(Carburant.DIESEL);
        Voiture voiture = null;
        if( vehicule instanceof Voiture ) {
            voiture = (Voiture) vehicule;
            System.out.println("typecasting");
        }
        else
            System.out.println("no typecasting");

        System.out.println( voiture );

        v1.seDeplacer( 10 );
        v2.seDeplacer( 20 );


        // utilisation du singleton
        Singleton pl = Singleton.getInstance();
        pl.test();

        System.out.println(">---> INTERFACE <---<");

        Volant volant = new Oiseau("pic vert", 0.45);
        Volant volant2 = new Avion(100, 70);


        Oiseau oiseau = new Oiseau("pivert", 0.40);
        Avion avion = new Avion(50, 60);
//        volant2 = volant;

        List<Volant> volants = new ArrayList<>();

        volants.add( volant );
        volants.add( volant2 );
        volants.add( oiseau );
        volants.add( avion );

        volant2.voler();


        // Enumération

        System.out.println(">---> Enumération <---<");
        if( v2.getCarburant() == v1.getCarburant() ){
            System.out.println("même carburant");
        }

        int ordinalElec = Carburant.ELECTRIQUE.ordinal();
        System.out.println(ordinalElec);

        Carburant carb = Carburant.randomCarb();

        System.out.println("\n\n\n\n");
        System.out.println("Quel carburant voulez-vous?");

        Scanner sc = new Scanner( System.in );

        String carburantLine = sc.nextLine();

        carb = Carburant.valueOf( carburantLine.toUpperCase() );
        System.out.println("Vous avez choisi: " + carb);

        String nomValeur = Carburant.ELECTRIQUE.name(); // "ELECTRIQUE"

        // Methodes intéressantes
        Carburant[] tabDesValeursPossibles = Carburant.values();
        Carburant valeurParse = Carburant.valueOf("ELECTRIQUE"); // transfo String -> Valeur d'Enum

        int ordinal = Carburant.ELECTRIQUE.ordinal();
        String nom = Carburant.ELECTRIQUE.name();


    }

}
