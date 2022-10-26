package mobile.exo.oo;

import java.util.Random;

public class Footballeur extends Sportif {

    private int totalGoals;
    private final Random rdmGen = new Random();

    public Footballeur(String nom, String prenom, String dateNaiss, int taille, int poid) {
        super(nom, prenom, dateNaiss, taille, poid);
    }

    public Footballeur(String nom, String prenom, String dateNaiss, int taille, int poid, int medailles, int totalGoals) {
        super(nom, prenom, dateNaiss, taille, poid, medailles);
        this.totalGoals = totalGoals;
    }


    @Override
    public boolean participer() {
        int nbrGoalsCompet = 0;
        for (int i = 0; i < 5; i++) {
            if( tirer() )
                nbrGoalsCompet++;
        }

        int rdm = rdmGen.nextInt(100);
        if( rdm <  10*nbrGoalsCompet ){
            gagnerMedaille();
            return true;
        }
        return false;
    }


    public boolean tirer(){
        int randomized = rdmGen.nextInt(2);

        if( randomized == 0 )
            totalGoals++;

        return randomized == 0;
    }

    public int getTotalGoals() {
        return totalGoals;
    }

    private void setTotalGoals(int totalGoals) {
        this.totalGoals = totalGoals;
    }
}
