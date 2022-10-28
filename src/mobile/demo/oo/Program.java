package mobile.demo.oo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        Voiture v1 = new Voiture("opel", "mustang");
        int nbrKmParcouru = v1.getKmParcouru();

        System.out.println(v1.getMarque());
        System.out.println(v1.getModele());

        // autre Voiture marque BipBoup modele Vroum

        Voiture v2 = new Voiture("BipBoup","Vroum", 15000);
        v1.rouler( 10 );

        System.out.println(v2.getMarque());
        System.out.println(v2.getModele());

        System.out.println( v1.isEnBonEtat() ); // true
        System.out.println( v2.isEnBonEtat() ); // true

        v1.faitUnAccident( v2 );

        System.out.println( v1.isEnBonEtat() ); // false
        System.out.println( v2.isEnBonEtat() ); // false

        Vehicule vehicule = new Voiture();
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


    }

}
