package mobile.magasin;

public class PackCig extends Produit implements AgeLegal {
    private final int qtt;

    public PackCig(String marque, double prix){
        super( marque, prix );
        this.qtt = 24;
    }

    public PackCig(String marque, double prix, boolean grand){
        super( marque, prix );
        this.qtt = grand ? 36 : 24;
    }

    public int getQtt() {
        return qtt;
    }

    @Override
    public boolean isAuthorized(int age) {
        return age >= 18;
    }
}
