package mobile.magasin;

public class Main {

    public static void main(String[] args) {

        Produit aAcheter = new Biere("triple d'Anvers", 2.5, 8);
        int age = 15;

        System.out.println("On simule le fait qu'un user de 20 ans achete un produit");

        if( aAcheter instanceof Perimable ){
            System.out.println("Verification peremption");
            Perimable perimable = (Perimable)aAcheter;
            System.out.println( "La date de peremption est : " + perimable.getDatePeremption() );
        }

        if( aAcheter instanceof AgeLegal ){
            System.out.println("Verification de l'age");
            AgeLegal ageLegal = (AgeLegal)aAcheter;
            System.out.println("L'utilisateur a " + age + " a le droit d'acheter ?" +  ageLegal.isAuthorized(age) );
        }


    }

}
