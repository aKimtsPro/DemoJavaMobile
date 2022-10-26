package mobile.exo.oo;

import java.util.Random;

public class Golfeur extends Sportif {

    private int coefSwing;

    public Golfeur(String nom, String prenom, String dateNaiss, int taille, int poid, int coefSwing) {
        super(nom, prenom, dateNaiss, taille, poid);
        this.setCoefSwing( coefSwing );
    }

    @Override
    public boolean participer() {
        Random rdmGen = new Random();
        int rdm = rdmGen.nextInt(100);
        if( rdm < ( 10 + coefSwing ) ){
            gagnerMedaille();
            return true;
        }
        return false;
    }

    public int getCoefSwing() {
        return coefSwing;
    }

    public void setCoefSwing(int coefSwing) {
        if( coefSwing <= 10 && coefSwing >= 0)
            this.coefSwing = coefSwing;
    }
}
