package mobile.exo.oo.hotel;

public class Main {

    public static void main(String[] args) {

        Chambre c = new Chambre( 101, 2, TypeChambre.BASIQUE );
        System.out.println("A une télé: " + c.hasTele() ); // false
        System.out.println("A une douche: " + c.hasDoucheItalienne() ); // false

        System.out.println("BASIQUE --> ALL_IN");
        c.setType( TypeChambre.ALL_IN );
        System.out.println("A une télé: " + c.hasTele() ); // true
        System.out.println("A une douche: " + c.hasDoucheItalienne() ); // true

    }

}
