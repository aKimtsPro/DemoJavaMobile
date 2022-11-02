package mobile.exo.oo.hotel;

public enum TypeChambre {

    BASIQUE(false, false),
    CONFORT(true, false),
    LUXE(false, true),
    ALL_IN(true, true);

    private final boolean hasTV;
    private final boolean hasDoucheItalienne;

    private TypeChambre(boolean hasTV, boolean hasDoucheItalienne) {
        this.hasTV = hasTV;
        this.hasDoucheItalienne = hasDoucheItalienne;
    }

    public boolean hasTV() {
        return hasTV;
    }

    public boolean hasDoucheItalienne() {
        return hasDoucheItalienne;
    }
}
