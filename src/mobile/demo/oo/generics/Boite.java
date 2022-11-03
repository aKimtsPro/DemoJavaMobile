package mobile.demo.oo.generics;

public class Boite<C> {

    private C contenu;

    public Boite(C contenu) {
        this.contenu = contenu;
    }

    public C getContenu() {
        return contenu;
    }

    public void setContenu(C contenu) {
        this.contenu = contenu;
    }

}
