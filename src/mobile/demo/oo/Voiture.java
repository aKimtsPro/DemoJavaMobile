package mobile.demo.oo;

import java.util.Objects;

public class Voiture extends Vehicule {

    private String marque;
    private String modele;
    private Carburant carburant;
    private boolean enBonEtat = true;
    private int reservoir;
    private int reservoirMax;

    public Voiture(Carburant carburant, int reservoirMax){
        super( 0 );
        this.carburant = carburant;
        this.reservoirMax = reservoirMax;
    }

    public Voiture( String marque, String modele, Carburant carburant, int reservoirMax ){
//        super( 0 );
        this.marque = marque;
        this.modele = modele;
        this.carburant = carburant;
        this.reservoirMax = reservoirMax;
    }

    public Voiture( String marque, String modele, Carburant carburant, int kmParcouru, int reservoirMax ){
        this( marque, modele, carburant, reservoirMax );
        this.setKmParcouru( kmParcouru );
    }

    public Carburant getCarburant() {
        return carburant;
    }

    public void setCarburant(Carburant carburant) {
        this.carburant = carburant;
    }

    @Override
    public void seDeplacer(int nbrKm) {
        super.seDeplacer( nbrKm );
        System.out.println("Je suis en voiture");
    }

    // methode
    // - type de retour
    // - nom de methode
    // - paramètres
    // - corps de la méthode
    public int rouler( int aParcourir ) throws Exception {

        if( aParcourir > reservoir )
            throw new Exception("Le reservoir n'est pas assez rempli");

        this.setKmParcouru( this.getKmParcouru() + aParcourir );
        reservoir -= aParcourir;
        return this.getKmParcouru();
    }

    // Methode qui font se crasher 2 voiture => 2 voit en mauvais état
    public void faitUnAccident( Voiture contre ){
        this.enBonEtat = false;
        contre.enBonEtat = false;
    }

    @Override
    public String toString(){

        return "Voiture (marque: \""+marque+"\", " +
                "modele: '"+modele+"', " +
                "km: "+ getKmParcouru() +", " +
                "en bon état:" + ( enBonEtat ? "vrai" : "faux" ) + ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Voiture voiture = (Voiture) o;

        if( getKmParcouru() != voiture.getKmParcouru() )
            return false;

        if (enBonEtat != voiture.enBonEtat)
            return false;
        if (!Objects.equals(marque, voiture.marque))
            return false;

        return Objects.equals(modele, voiture.modele);
    }

    public String getModele() {
        return modele;
    }

    public void setModele( String modele ){
        if( modele != null ) {
            this.modele = modele;
        }
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public boolean isEnBonEtat() {
        return enBonEtat;
    }

    public void setEnBonEtat(boolean enBonEtat) {
        this.enBonEtat = enBonEtat;
    }

    public int getReservoir() {
        return reservoir;
    }

    public void setReservoir(int reservoir) {
        this.reservoir = reservoir;
    }

    public int getReservoirMax() {
        return reservoirMax;
    }

    public void setReservoirMax(int reservoirMax) {
        this.reservoirMax = reservoirMax;
    }
}
