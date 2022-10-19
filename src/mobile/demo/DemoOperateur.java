package mobile.demo;

public class DemoOperateur {

    public static void main(String[] args) {

        // Opérateurs:
        // - arithmétique

        int a = 5, b = 7;
        double rslt;

        rslt = a + b; // 12
        rslt = a - b; // -2
        rslt = a * b; // 35
        rslt = a / b; // division entière // 0
        rslt = (double) a / b; // division classique // 0.71428...
        rslt = a % b; // 5
        // a = rsltDivEntier * b + rsltModulo

        // - affectation

        a = 5;
        a += 1;
        a -= 1;
        a *= 2;
        a /= 2;
        a %= 2;

        a = 0;

        System.out.println( a++ ); // 0
        // a = 1
        System.out.println( ++a ); // 2
        // a = 2
        System.out.println( a-- ); // 2
        // a = 1
        System.out.println( --a ); // 0
        // a = 0

        // - comparaison

        String c1 = "ok", c2 = "pas ok";

        System.out.println( c1 == c2 ); // false
        System.out.println( c1 != c2 ); // true

        System.out.println( a == b );
        System.out.println( a != b );
        // seulement pour les nombres
        System.out.println( a <= b );
        System.out.println( a < b );
        System.out.println( a >= b );
        System.out.println( a > b );

        boolean aPlusGrandQueB = a > b;

        // - logique

        // ET - &&

        System.out.println( true && true ); // true
        System.out.println( true && false ); // false
        System.out.println( false && true ); // false
        System.out.println( false && false ); // false

        // OU - ||

        System.out.println( true || true ); // true
        System.out.println( true || false ); // true
        System.out.println( false || true ); // true
        System.out.println( false || false ); // false

        // NON - !

        System.out.println( !true ); // false
        System.out.println( !false ); // true

        // Opérateur ternaire

        int age = 15;
        String rsltTernaire = age >= 18 ? "majeur" : "pas majeur";

    }

}
