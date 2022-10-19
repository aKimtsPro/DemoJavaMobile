package mobile.exo;

import java.util.Scanner;

public class Plateau {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        char[] plateau = { '_', '_', '_', '_', '*' };
        int position = 4;

        char choix;
        do {

            for (int i = 0; i < plateau.length; i++) {
                System.out.print( plateau[i] + " " );
            }
            System.out.println();

            choix = sc.nextLine().charAt(0);

            switch ( choix ){

                case 'd':
                    if( position == 4 ){
                        plateau[position] = '_';
                        position = 0;
                        plateau[position] = '*';
                    }
                    else {
                        plateau[position] = '_';
                        plateau[++position] = '*';
                    }
                    break;

                case 'g':
                    if( position == 0 ){
                        plateau[position] = '_';
                        position = 4;
                        plateau[position] = '*';
                    }
                    else {
                        plateau[position] = '_';
                        plateau[--position] = '*';
                    }
                    break;
                case 'q':
                    System.out.println("Au revoir");
                    break;
                default:
                    System.out.println("Choix invalide");

            }

        } while( choix != 'q' );




    }

}
