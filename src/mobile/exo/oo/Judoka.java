package mobile.exo.oo;

import java.util.Random;

public final class Judoka extends Sportif {

    public Judoka(String nom, String prenom, String dateNaiss, int taille, int poid) {
        super(nom, prenom, dateNaiss, taille, poid);
    }

    @Override
    public boolean participer() {
        Random rdmGen = new Random();
        int rdm = rdmGen.nextInt(100);
        if( rdm < calculIMC() ){
            gagnerMedaille();
            return true;
        }
        return false;
    }

    //    @Override
//    protected boolean genererVictoire() {
//        Random randomGenerator = new Random();
//        int randomized = randomGenerator.nextInt(100);
//        return randomized < calculIMC();
//    }


    @Override
    public String toString() {
        return super.toString() +
                "\n - IMC: " + this.calculIMC();
    }
}
