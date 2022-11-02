package mobile.demo.oo;

public class DemoException {

    public static void main(String[] args) {

        Station s = new Station();

        Voiture v = new Voiture(Carburant.randomCarb(), 100);

        System.out.println(v.getCarburant());
        try {
            s.remplirDiesel(v);
        }
        catch (Exception ex){
            System.out.println( ex.getMessage() );
        }

        System.out.println("TEST");


    }

}
