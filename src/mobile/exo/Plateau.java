package mobile.exo;

import java.util.Scanner;

public class Plateau {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        char[] plateau = { '_', '_', '_', '_', '*' };
        int position = 4;


        char choix;

        // tant que j'ai pas choisi quitter
        do {

            for (int i = 0; i < plateau.length; i++) {
                System.out.print( plateau[i] + " " );
            }
            System.out.println();

            // choisir gauche (g) ou droite (d) ou quitter (q)
            choix = sc.nextLine().charAt(0);

            switch ( choix ){

                // - aller à droite si je choisi droite
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


                // - aller à gauche si je choisi gauche
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
