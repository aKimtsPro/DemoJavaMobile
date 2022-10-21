package mobile.exo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculette {

    public static void main(String[] args) {


        Scanner scanner = new Scanner( System.in );
        List<String> operations = new ArrayList<>();
        boolean continuer = true;
        String operationString = "";

        do{

            System.out.println("Veuillez entrer le premier membre");
            double membre1 = Double.parseDouble( scanner.nextLine() );
            System.out.println("Veuillez entrer une opération");
            char operation = scanner.nextLine().charAt(0);
            System.out.println("Veuillez entrer le premier membre");
            double membre2 = Double.parseDouble( scanner.nextLine() );
            double rslt;

            switch ( operation ){

                case '+':
                    // addition
                    rslt = membre1 + membre2;
                    operationString = membre1 +" + " + membre2 + " = "+ rslt;
                    break;
                case '-':
                    // soustraction
                    rslt = membre1 - membre2;
                    operationString = membre1 +" - " + membre2 + " = "+ rslt;
                    break;
                case '*':
                    // multiplication
                    rslt = membre1 * membre2;
                    operationString = membre1 +" * " + membre2 + " = "+ rslt;
                    break;
                case '/':
                    // division
                    if( membre2 == 0 ){
                        operationString = membre1 + " / " + membre2 + " = opération impossible(division par 0)";
                    }
                    else {
                        rslt = membre1 / membre2;
                        operationString = membre1 +" / " + membre2 + " = "+ rslt;
                    }
                    break;
                case '%':
                    // modulo
                    rslt = membre1 % membre2;
                    operationString = membre1 +" % " + membre2 + " = "+ rslt;
                    break;
                default:
                    operationString = membre1 + " ? " + membre2 + " = opération impossible";
            }

            System.out.println(operationString );
            operations.add( operationString );



            // demande si continuer
            System.out.println("Voulez-vous continuer? (Yes/no)");
            String userChoice = scanner.nextLine();
            // Pour les String, equals verifie le contenu de la chaine.
            // Si le contenu est le même => true
            // Sinon => false
            if( userChoice.equals("no") ) {
                continuer = false;
            }
            // '==' ne vérifie que l'egalité des références, cad que s'il ne s'agit
            // du même objet référencé ou pas

        } while ( continuer );

        System.out.println("--DEBUT--");
        for (String operation : operations) {
            System.out.println( operation );
        }
        System.out.println("-- FIN --");
    }

}
