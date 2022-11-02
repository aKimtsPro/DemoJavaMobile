package mobile.exo.oo.competition;

public final class Boxeur extends Sportif {

    public Boxeur(String nom, String prenom, String dateNaiss, int taille, int poid) {
        super(nom, prenom, dateNaiss, taille, poid);
    }

    @Override
    public boolean participer() {
        return false;
    }
}
