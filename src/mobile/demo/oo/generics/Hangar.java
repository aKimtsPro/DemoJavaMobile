package mobile.demo.oo.generics;

import mobile.demo.oo.Vehicule;

public class Hangar<V extends Vehicule> extends Boite<V>{
    Vehicule[] tab= new Vehicule[4];
    public Hangar(V contenu) {
        super(contenu);
    }
}
