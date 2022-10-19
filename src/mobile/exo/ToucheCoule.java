package mobile.exo;

import java.util.Random;
import java.util.Scanner;

public class ToucheCoule {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );

        // Le plateau de jeu de 10 case. false - l'eau | true - le bateau
        boolean[] plateau = new boolean[10];
        // Génération de la position du bateau
        Random rdm = new Random();
        int rdmized = rdm.nextInt(10);
        // Le plateau est placé
        plateau[rdmized] = true;

        int positionProposee;

        do {
            // On recupère le proposition du user
            String line = sc.nextLine();
            positionProposee = Integer.parseInt(line);

            // Le bateau n'est pas à la position proposée
            if( !plateau[positionProposee] ){
                System.out.println("plouf");
            }

        }while( !plateau[positionProposee] );// tant qu'il ne trouve pas
        System.out.println("C'est gagné");
    }

}
