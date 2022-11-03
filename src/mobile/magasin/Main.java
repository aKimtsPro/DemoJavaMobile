package mobile.magasin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Produit biere = new Biere("triple d'Anvers", 2.5, 8);
        Tomate tomate = new Tomate("triple d'Anvers", 2.5, "cerise");
        Produit packCig = new PackCig("triple d'Anvers", 2.5, false);

        Map<Tomate, Integer> map = new HashMap<>();
        map.put( tomate, 5 );

        Magasin<Tomate> magasin= new Magasin<>( map );


        //{ }

        magasin.vendre( tomate );
        magasin.vendre( tomate );
        magasin.vendre( tomate );
        magasin.vendre( tomate );
        magasin.vendre( tomate );



    }

}
