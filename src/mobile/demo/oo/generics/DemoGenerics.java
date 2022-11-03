package mobile.demo.oo.generics;

import mobile.demo.oo.Avion;

import java.util.ArrayList;
import java.util.List;

public class DemoGenerics {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        Hangar<Avion> hangar = new Hangar<>( new Avion(50, 100) );

    }

}
