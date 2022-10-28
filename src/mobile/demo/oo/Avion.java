package mobile.demo.oo;

public class Avion extends Vehicule implements Volant {

    private int nbrPassagerMax;
    private double envergure;

    public Avion(int nbrPassagerMax, double envergure) {
        this.setNbrPassagerMax(nbrPassagerMax);
        this.envergure = envergure;
    }

    public int getNbrPassagerMax() {
        return nbrPassagerMax;
    }

    public void setNbrPassagerMax(int nbrPassagerMax) {
        if( nbrPassagerMax >= 0 )
            this.nbrPassagerMax = nbrPassagerMax;
    }

    public void voler(){
        System.out.println("Je suis un avion et je vole");
    }

    public void atterir(){
        System.out.println("Vion j'ateri");
    }

    public double getEnvergure(){
        return envergure;
    }
}
