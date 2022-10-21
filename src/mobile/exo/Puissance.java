package mobile.exo;

import java.util.Scanner;

public class Puissance {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        final int BASE = 2; // constant
        int userNbr = Integer.parseInt( sc.nextLine() );

        // 2^1 = 1*2 =  2
        // 2^2 = 2*2 =  4
        // 2^3 = 4*2 =  8
        // 2^4 = 8*2 = 16

        int puissance = 1; // 2^0 = 1

        // 4
        for (int i = 1; i <= userNbr; i++) {
            puissance *= 2;
        }

        System.out.println( puissance );



    }

}
