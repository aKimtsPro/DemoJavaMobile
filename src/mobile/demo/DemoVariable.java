package mobile.demo;

import java.sql.Connection;

public class DemoVariable {

    public static void main(String[] args) {

        int variable = 5, v2, v3 = 15;
        System.out.println( variable );

        // Types primitifs - contient la valeur

        // Entier
        byte b = 15; // 1byte - 11111111 [-128;127] // 256
        short s = 148; // 2byte - [-32_000;32_000]
        int i = 2_000_000_000; // 4byte - [-2_000_000_000;2_000_000_000]
        long l = 4_000_000_000L; // 8byte - 2^64 possibilités

        // Réel
        float f = 0.021F; // 4byte - 7-8 chiffres
        double d = 0.0; // 8byte - 14-15 chiffres

        // Autre
        boolean bool = true;
        char character = 'A'; // 2bytes - 0;64k

        // Type Objet - contient une adresse vers l'objet
        String chaine = "chaine";
        String chaine1 = "chaine";
        String chaine2 = "chain" + 'e';
        String chaine3 = new String("chaine");

        System.out.println( chaine == chaine1 ); // true
        System.out.println( chaine == chaine2 ); // true
        System.out.println( chaine == chaine3 ); // false

        Personne p = new Personne();
        p.nom = "luc";
        Personne p2 = new Personne();
        p2.nom = "luc";

        // Les constantes
        final int TAUX_TVA = 21;
        final Personne PERS = new Personne();
        PERS.nom = "autre chose";

        // Les conversions

        i = b;
        i = s;
        i = (int)l;
        i = character;

        f = l;
        l = (long)f;

        // conversion de String

        boolean rsltBool = Boolean.parseBoolean("true");
        int rslt = Integer.parseInt("52");
        double rslt2 = Double.parseDouble("51.1");

        System.out.println(rslt);

    }

}
