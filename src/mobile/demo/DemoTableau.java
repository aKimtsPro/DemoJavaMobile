package mobile.demo;

import java.util.*;

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


        // Collections

        // Specification         Implementation
        List<String> liste = new ArrayList<>();

        liste.add( "salut" ); // index 0
        liste.add( "comment" ); // index 1
        liste.add( "ca va?" ); // index 2

        liste.remove( "salut" );
        liste.remove( 1 );

        int taille = liste.size();

        for (int i = 0; i < taille; i++) {
            System.out.println( liste.get(i) );
        }

        liste.set( 0, "pourquoi" );


        // la queue au ciné : le premier arrive est le premier servi
        // First In First Out
        Queue<String> strings = new ArrayDeque<>();

        // Ajoute à la fin
        strings.add( "string ajouté" );
        // retire le premier
        String removed = strings.remove(); // error si vide
        String removed2 = strings.poll(); // null si vide
        // recupère le premier sans le retirer
        String getFirst = strings.peek();


        // Stack - la pile d'assiette
        // Last In First Out
        Stack<String> stack = new Stack<>();

        // ajoute en dernier
        stack.push( "ajouté" );
        // recupère et retire le dernier
        removed = stack.pop();


        // Set
        // Pas d'index - Pas d'ordre - Pas de duplicata
        Set<String> stringSet = new HashSet<>();

        stringSet.add( "ajouté" );
        boolean worked = stringSet.add( "ajouté" );

        for (String s : stringSet) {
            System.out.println( s );
        }

        // Map - Ensemble d'association Key-Value
        // A la place d'index on a des
        Map<String, Integer> map = new HashMap<>();

        map.put( "luc", 11 );
        map.put( "marie", 12 );
        map.put( "dominique", 8 );

        int value = map.get( "marie" );

        map.put( "dominique", 20 );

        value = map.get( "dominique" ); // 20

        Set<String> keys = map.keySet();

        for (String key : keys) {
            System.out.println(key + " : " + map.get( key ));
        }

        map.remove( "luc" );




    }

}
