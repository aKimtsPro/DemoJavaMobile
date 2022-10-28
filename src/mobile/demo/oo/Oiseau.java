package mobile.demo.oo;

public class Oiseau implements Volant {

    private String espece;
    private double envergure;

    public Oiseau(String espece, double envergure) {
        this.espece = espece;
        this.envergure = envergure;
    }

    @Override
    public void voler(){
        System.out.println("Je suis un oiseau de l'espece " + espece + " et je vole");
    }

    @Override
    public void atterir(){
        System.out.println("cuicui");
    }

    public String getEspece() {
        return espece;
    }

    public void setEspece(String espece) {
        this.espece = espece;
    }

    @Override
    public double getEnvergure() {
        return envergure;
    }
}
