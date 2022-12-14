package mobile.exo.oo.competition;

public abstract class Sportif extends Personne {

    private int medailles;

    public Sportif(){}

    public Sportif(String nom, String prenom, String dateNaiss, int taille, int poid) {
        super( nom, prenom, dateNaiss );
        this.setTaille( taille );
        this.setPoid( poid );
    }

    public Sportif(String nom, String prenom, String dateNaiss, int taille, int poid, int medailles) {
        this( nom, prenom, dateNaiss, taille, poid );
        this.setMedailles( medailles );
    }

    public abstract boolean participer();

//    public boolean participer(){
//
//        if( genererVictoire() ){
//            gagnerMedaille();
//            return true;
//        }
//        return false;
//    }


    public int getMedailles() {
        return medailles;
    }

    private void setMedailles(int medailles) {
        if( medailles >= 0 )
            this.medailles = medailles;
    }

    protected void gagnerMedaille(){
        setMedailles( getMedailles() + 1 );
    }


//    protected boolean genererVictoire(){
//        Random randomGenerator = new Random();
//        int randomized = randomGenerator.nextInt(5);
//        return randomized == 4;
//    }


    @Override
    public String toString() {

        return this.getClass().getSimpleName() +
                "\n - nom: " + this.getNom() +
                "\n - prenom: " + this.getPrenom() +
                "\n - date de naissance: " + this.getDateNaiss() +
                "\n - nbr de médailles: " + this.getMedailles();

    }
}
