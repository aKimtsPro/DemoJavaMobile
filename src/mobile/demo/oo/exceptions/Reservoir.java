package mobile.demo.oo.exceptions;

public class Reservoir {

    private final int capaciteMax;
    private int contenu = 0;

    /**
     *
     * @throws IllegalArgumentException si la capaciteMax est négative
     */
    public Reservoir(int capaciteMax) {
        if( capaciteMax <= 0 )
            throw new IllegalArgumentException( "capaciteMax devrait être strictement positif" );

        this.capaciteMax = capaciteMax;
    }

    /**
     *
     *
     * @param qtt, la qtt à ajouter au reservoir
     * @throws IllegalArgumentException, si qtt est négatif
     * @throws RuntimeException, si la quantité de remplissage dépasse la capaciteMax
     */
    public void remplir(int qtt) {
        if( qtt < 0 )
            throw new IllegalArgumentException( "qtt devrait être positif" );

        int qttPotentiel = contenu + qtt;
        if( qttPotentiel > capaciteMax )
            throw new OverCapacityException( capaciteMax, qttPotentiel );

        contenu += qtt;
    }

    public int getCapaciteMax() {
        return capaciteMax;
    }

    public int getContenu() {
        return contenu;
    }
}
