package mobile.demo.oo;

public class Vehicule {

    private int kmParcouru;

    public Vehicule() {
    }

    public Vehicule(int kmParcouru) {
        this.kmParcouru = kmParcouru;
    }

    public void seDeplacer(int nbrKm ){
        if( nbrKm > 0 ) {
            System.out.println("Je me déplace");
            this.kmParcouru += nbrKm;
        }
    }

    public int getKmParcouru() {
        return this.kmParcouru;
    }

    protected void setKmParcouru(int kmParcouru) {
        this.kmParcouru = kmParcouru;
    }
}
