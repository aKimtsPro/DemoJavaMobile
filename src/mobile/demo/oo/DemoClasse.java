package mobile.demo.oo;

public class DemoClasse {

    public static void main(String[] args) {

        Voiture v1 = new Voiture();
        v1.kmParcouru = 15;

        // autre Voiture marque BipBoup modele Vroum

        Voiture v2 = new Voiture();
        v2.marque = "BipBoup";
        v2.modele = "Vroum";

        v1.rouler( 10 );

        System.out.println( v1.enBonEtat ); // true
        System.out.println( v2.enBonEtat ); // true

        v1.faitUnAccident( v2 );

        System.out.println( v1.enBonEtat ); // false
        System.out.println( v2.enBonEtat ); // false




    }

}
