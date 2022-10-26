package mobile.exo.oo;

import java.util.Random;

public class Judoka extends Sportif {
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

}
