package mobile.exo.oo.hotel;

public class Chambre {

    private final int numero;
    private int nbrPlaces = 1;
    private TypeChambre type;

    public Chambre(int numero, int nbrPlaces, TypeChambre type) {
        // TODO exception si numero invalide
        this.numero = numero;
        this.setNbrPlaces( nbrPlaces );
        this.setType( type );
    }

    public int getNumero() {
        return numero;
    }

    public int getNbrPlaces() {
        return nbrPlaces;
    }

    public void setNbrPlaces(int nbrPlaces) {
        if( nbrPlaces > 0 )
            this.nbrPlaces = nbrPlaces;
    }

    public TypeChambre getType() {
        return type;
    }

    public void setType(TypeChambre type) {
        this.type = type;
    }

    public boolean hasTele() {
        return type.hasTV();
    }


    public boolean hasDoucheItalienne() {
        return type.hasDoucheItalienne();
    }

}
