package mobile.exo;

import java.util.*;

public class PierrePapierCiseau {

    public static void main(String[] args) {

        Random random = new Random();
        char[] tableau = { 'X'/*ciseau*/, 'P'/*papier*/, 'R'/*pierre*/ };

        int indexRandomized = random.nextInt(3); // [0;2] <=> [0;3[
        char choixOrdi = tableau[indexRandomized];

        Scanner scanner = new Scanner( System.in );
        char choixUtilisateur = scanner.nextLine().charAt(0);

        // XR, PX, RP => gagne
        // XP, PR, RX => perdu
        // XX, PP, RR => egalite

        if(
            (choixOrdi == 'X' && choixUtilisateur == 'R') ||
            (choixOrdi == 'P' && choixUtilisateur == 'X') ||
            (choixOrdi == 'R' && choixUtilisateur == 'P')
        ){
            System.out.println("gagne");
        }
        else if (
            (choixOrdi == 'X' && choixUtilisateur == 'P') ||
            (choixOrdi == 'P' && choixUtilisateur == 'R') ||
            (choixOrdi == 'R' && choixUtilisateur == 'X')
        ) {
            System.out.println("perdu");
        }
        else {
            System.out.println("egalite");
        }
;


    }

}
