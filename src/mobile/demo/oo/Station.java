package mobile.demo.oo;

public class Station {

    public void remplirEssence(Voiture v) throws Exception {

        if( v.getReservoir() >= v.getReservoirMax() )
            throw new Exception( "Le reservoir est déjà rempli" );

        if( v.getCarburant() != Carburant.ESSENCE )
            throw new Exception( "Le carburant n'est pas du bon type" );

        v.setReservoir( v.getReservoirMax() );
    }

    public void remplirDiesel(Voiture v) throws Exception {
        if( v.getReservoir() >= v.getReservoirMax() )
            throw new Exception( "Le reservoir est déjà rempli" );

        if( v.getCarburant() != Carburant.DIESEL )
            throw new Exception( "Le carburant n'est pas du bon type" );

        v.setReservoir( v.getReservoirMax() );
    }

    public void remplirElectrique(Voiture v) throws Exception {
        if( v.getReservoir() >= v.getReservoirMax() )
            throw new Exception( "Le reservoir est déjà rempli" );

        if( v.getCarburant() != Carburant.ELECTRIQUE )
            throw new Exception( "Le carburant n'est pas du bon type" );

        v.setReservoir( v.getReservoirMax() );
    }

}
