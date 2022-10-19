package mobile.demo;

public class DemoConditionnel {

    public static void main(String[] args) {

        int age = 40;

        // if
        if(age >= 18){
            System.out.println("Vous êtes majeur");
        }
        else if(age >= 12){
            System.out.println("Vous êtes un ado");
        }
        else if(age >= 3){
            System.out.println("Vous êtes un enfant");
        }
        else {
            System.out.println("Vous êtes un bébé");
        }

        // switch
        System.out.println("--- SWITCH ---");
        switch (age){
            case 17:
            case 18:
                System.out.println("Vous devenez adulte");
                break;
            case 40:
                System.out.println("C'est la quarantaine");
                break;
            case 67:
                System.out.println("C'est le retraite");
                break;
            default:
                System.out.println("Rien de particulier");
        }

    }

}
