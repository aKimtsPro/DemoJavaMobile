package mobile.demo.oo.exceptions;

import java.util.Scanner;

public class DemoException2 {

    public static void main(String[] args) {

//        Scanner sc = new Scanner( System.in );
//        Reservoir reservoir = new Reservoir(1500);
//        int qttAAjouter = sc.nextInt();
//
//        try{
//            reservoir.remplir( qttAAjouter );
//        }
//        catch ( IllegalArgumentException ex ){
//            System.out.println( "négatif" );
//        }
//        catch ( OverCapacityException ex ){
//            System.out.println( "over" );
//        }
//        catch ( RuntimeException ex ){
//            System.out.println( "gerer differemment" );
//        }

        System.out.println("debut main()");
        try {
            int rslt = modulo2( 2 );
            System.out.println("resultat: " + rslt);
            return;
        }
        catch ( Exception ex ){
            System.out.println("something went wrong");
        }
        finally {
            System.out.println("executé dans tous les cas");
        }
        System.out.println("fin main()");

    }

    public static void machin() {
        System.out.println("je commence machin()");
        modulo2(-2);
        System.out.println("je termine machin()");
    }

    public static int modulo2(int a) throws RuntimeException {
        System.out.println("je commence truc(int)");
        if( a < 0 )
            throw new RuntimeException();
        System.out.println("je termine truc(int)");
        return a % 2;
    }



}
