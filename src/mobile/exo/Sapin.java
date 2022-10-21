package mobile.exo;

import java.util.Scanner;

public class Sapin {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        System.out.println("Veuillez entrer la taille:");
        int taille = sc.nextInt();
        int nbrEtoiles = 0;
        // Boucle pour les lignes
        for (int ligneActuelle = 1; ligneActuelle <= taille; ligneActuelle++) {
            // ecrit une ligne

            // boucle pour les ' '
            for (int espaceAEcrire = taille - ligneActuelle; espaceAEcrire > 0 ; espaceAEcrire--) {
                System.out.print(' ');
            }
            
            // boucle pour les '*'
            for (int etoileAEcrire = (ligneActuelle * 2)-1; etoileAEcrire > 0 ; etoileAEcrire--) {
                System.out.print('*');
            }
            
            System.out.println();
        }

        // boucle pour les ' '
        for (int espaceAEcrire = taille - 1; espaceAEcrire > 0 ; espaceAEcrire--) {
            System.out.print(' ');
        }
        System.out.println('T');

    }

}
