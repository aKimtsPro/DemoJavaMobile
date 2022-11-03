package mobile.demo.oo.exceptions;

// creation d'une exception unchecked
public class OverCapacityException extends RuntimeException {

    private final int capaciteMax;
    private final int qtt;

    public OverCapacityException(int capaciteMax, int qtt) {
        super( "Action impossible, la capacité max aurait été dépassée (capaMax: "+capaciteMax+", qttPotentiel: "+qtt+", depassé de  "+ (qtt - capaciteMax) +") " );
        this.capaciteMax = capaciteMax;
        this.qtt = qtt;
    }

    public int getCapaciteMax() {
        return capaciteMax;
    }

    public int getQtt() {
        return qtt;
    }
}
