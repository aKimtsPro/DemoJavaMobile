package mobile.demo;

import java.util.Random;

public class Des {

    private static Random rdm = new Random();

    public static int d100(){
        return rdm.nextInt(100) + 1; // 1 -> 100
    }

    public static int d6(){
        return rdm.nextInt(6) + 1; // 1 -> 6
    }


    public static int d20(){
        return rdm.nextInt(20) + 1; // 1 -> 20
    }

}
