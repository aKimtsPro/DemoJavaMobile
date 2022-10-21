package mobile.exo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nom {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        List<String> liste = new ArrayList<>();
        String ligne;

        // Remplir la liste
        do{
            ligne = sc.nextLine();
            if( !ligne.equals("stop") )
                liste.add( ligne );

        }while ( !ligne.equals("stop") );

        // Si la liste n'est pas vide, on se dit au départ que le
        // plus grand et le plus petit sont le premier élément.
        // Sinon, il n'y a pas de plus grand/petit
        String plusGrand = liste.isEmpty() ? null : liste.get(0);
        String plusPetit = liste.isEmpty() ? null : liste.get(0);

        // pP = "ok"
        // pG = "ok"

        // elementActuel = "ko"

        // Pas besoin de partir du premier élément donc
        for (int i = 1; i < liste.size(); i++) {
            // si l'élément actuel est plus petit que celui considéré
            // plus petit jusque là, on le remplace
            if( plusPetit.length() > liste.get(i).length() )
                plusPetit = liste.get(i);

            // si l'élément actuel est plus grand que celui considéré
            // plus grand jusque là, on le remplace
            else if( plusGrand.length() < liste.get(i).length() )
                plusGrand = liste.get(i);
        }

        System.out.println("Le plus grand est: " + plusGrand);
        System.out.println("Le plus petit est: " + plusPetit);



    }

}
