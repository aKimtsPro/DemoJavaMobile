package mobile.demo.oo.exceptions;

import java.util.Scanner;

public class DemoException2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        Reservoir reservoir = new Reservoir(1500);
        int qttAAjouter = sc.nextInt();

        try{
            reservoir.remplir( qttAAjouter );
        }
        catch ( IllegalArgumentException ex ){
            System.out.println( "négatif" );
        }
        catch ( OverCapacityException ex ){
            System.out.println( "over" );
        }
        catch ( RuntimeException ex ){
            System.out.println( "gerer differemment" );
        }




    }

}
