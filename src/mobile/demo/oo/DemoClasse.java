package mobile.demo.oo;

import mobile.exo.oo.Personne;

public class DemoClasse {

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




    }

}
