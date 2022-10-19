package mobile.demo;

import java.util.Scanner;

public class DemoIteratives {

    public static void main(String[] args) {

        int oeuf = 5;

        // while - tant que (vrai) => loop

        while( oeuf > 0 ){
            System.out.println("Je casse un oeuf");
            oeuf--;
        }

        // do ... while - pareil mais 1 iter gratuite

        Scanner scanner = new Scanner( System.in );
        int aAjouter;
        do {

            String choixUser = scanner.nextLine();
            aAjouter = Integer.parseInt( choixUser );

        } while (aAjouter <= 0);

        // for - comme le while mais plus structuré avec un compteur

        int compteur = 0;
        while(compteur < 5){
            System.out.println(compteur);
            compteur++;
        }

        for (int i = 0 ; i < 5 ; i++) {
            System.out.println(i);
        }

        // foreach


    }

}
