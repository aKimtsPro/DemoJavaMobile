package mobile.demo.oo;

import java.util.Random;

public enum Carburant {

    ELECTRIQUE, // 0, ad184
    DIESEL, // 1, ad547
    ESSENCE; // 2, ad2


    public static Carburant randomCarb(){
        Carburant[] values = Carburant.values();
        Random rdm = new Random();

        int taille = values.length;
        int index = rdm.nextInt( taille ); // [0;taille[ <=> [0;taille-1]
        Carburant carbAleatoire = values[index];

        return carbAleatoire;
    }

}
