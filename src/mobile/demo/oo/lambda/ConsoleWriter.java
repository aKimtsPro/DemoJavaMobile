package mobile.demo.oo.lambda;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsoleWriter implements Consumer<String> {

    private Predicate<String> verif = (truc) -> { return truc == null; };
    private Predicate<String> verif1 = (truc) -> { return truc == "null"; };
    private Predicate<String> verif2 = (truc) -> { return truc == "salut"; };

    @Override
    public void accept(String aEcrire) {
        System.out.println( aEcrire );
    }
}
