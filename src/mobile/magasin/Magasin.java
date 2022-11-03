package mobile.magasin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Magasin<P extends Produit> {

    private final Map<P, Integer> stock = new HashMap<>();
    private double caisse;

    public Magasin() {
    }

    public Magasin( List<P> stock ) {
        for (P article : stock) {
            remplirStock( article );
        }
    }

    public Magasin( Map<P, Integer> stock ){
        this.stock.putAll( stock );
    }

    public void vendre(P aVendre){

        if( aVendre == null )
            throw new IllegalArgumentException( "Le produit à vendre ne devrait pas être null" );

        if( !articleDispo(aVendre) )
            throw new IllegalArgumentException( "Le stock ne contient pas le produit" );

        int qtt = stock.get( aVendre );
        if( qtt >= 1 ){
            stock.get( aVendre );
            stock.put( aVendre, qtt-1 );
        }
        else {
            stock.remove( aVendre );
        }

        caisse += aVendre.getPrix();

    }

    public void remplirStock(P aAjouter){

        if( aAjouter == null )
            throw new IllegalArgumentException( "Le produit à ajouter ne devrait pas être null" );

        if( articleDispo( aAjouter ) ){
            Integer qtt = stock.get( aAjouter );
            stock.put( aAjouter, qtt + 1 );
        }
        else {
            stock.put( aAjouter, 1 );
        }

    }

    public boolean articleDispo(P produit){
        return stock.containsKey( produit );
    }

    public Integer qttDispo(P produit){
        return stock.get( produit );
    }

    public Map<P, Integer> getStock() {
        return new HashMap<>( stock ); // copie de la map
    }

    public double getCaisse() {
        return caisse;
    }


}
