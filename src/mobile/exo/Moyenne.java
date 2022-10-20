package mobile.exo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Moyenne {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        List<Integer> list = new ArrayList<>();
        String input;

        // De facon répétée - jusqu'au "stop"
        //      un nombre ou "stop" au user
        //      si il n'a pas ecrit stop, j'ajoute le nombre à un ensemble
        do {

            input = sc.nextLine();
            if( !input.equals( "stop" ) ){ // truc == machin - !la meme! - truc.equals(machin)
                int nombre = Integer.parseInt( input );
                list.add( nombre );
            }

        } while( !input.equals("stop") );


        int somme = 0;

        // Un fois qu'il aura ecrit stop,
        // afficher les elements de l'ensemble
        // pour chaque element, l'afficher
        // calculer la moyenne
        //      pour chaque element l'ajouter à une somme
        //      diviser la somme par la qtt d'éléments
        // afficher la moyenne

        for (Integer element : list) {
            System.out.println( element );
            somme += element;
        }
        int moyenne = somme / list.size();
        System.out.println( moyenne );


    }

}
