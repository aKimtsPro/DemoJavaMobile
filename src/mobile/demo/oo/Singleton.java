package mobile.demo.oo;

public class Singleton {

    // region SINGLETON
    private static Singleton instance = null;
    public static Singleton getInstance(){
        if( instance == null )
            instance = new Singleton();

        return instance;
    }
    private Singleton(){}
    // endregion

    public void test(){
        System.out.println("test");
    }

}
