package mobile.demo;

public class DemoTableau {

    public static void main(String[] args) {

        String[] tab = new String[3];

        tab[0] = "chaine de caractère";
        String a = tab[0];

        int[] tabDeInt = new int[2];
        tabDeInt[0] = 1;
        tabDeInt[1] = 2;

        // Seulement lors d'une déclaration/initialisation
        int[] tabEntier = {1, 2};
        // Pour faire la même chose hors ce contexte
        tabEntier = new int[]{2,3};

        // int[] <=> tableauDeInt
        // tableauDeInt[]
        int[][] tabDeTabDeInt = new int[2][2];
        tabDeTabDeInt = new int[2][];
        tabDeTabDeInt[0] = new int[2];
        tabDeTabDeInt[1] = new int[1];

        int[] unDesTab = tabDeTabDeInt[0];
        unDesTab[1] = 5;

        tabDeTabDeInt[0][1] = 5;

        // int[][][]
        int[][][] tabDeTabDeTabDeInt = new int[1][1][1];
        // int[][]
        tabDeTabDeTabDeInt[0] = new int[1][1];
        // int[]
        tabDeTabDeTabDeInt[0][0] = new int[1];
        // int
        tabDeTabDeTabDeInt[0][0][0] = 1;

    }

}
