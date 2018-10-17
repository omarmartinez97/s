import java.util.Scanner;

public class MainClass {

    static Menu m1 = new Menu();
    static Add_Ons a1 = new Add_Ons();

    private static void welcomeMessage(String smoothie) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! Thank you for choosing Smoothie King, type in " + '\n'
                + "the smoothie you want to get started!" + '\n'
                + "Or, if you need to look at the menu, just type 'menu'! ");
        smoothie = sc.nextLine();
        if (Menu.slimFitS.containsKey(smoothie)) {
            System.out.println("Alright! The total will be " + Menu.slimFitS.get(smoothie));
        } else if (Menu.wellFitS.containsKey(smoothie)) {

            System.out.println("Alright! The total will be " + Menu.wellFitS.get(smoothie));
        } else if (Menu.veggieFitS.containsKey(smoothie)) {
            System.out.println("Alright! The total will be " + Menu.veggieFitS.get(smoothie));
        } else if (Menu.vacayFitS.containsKey(smoothie)) {
            System.out.println("Alright! The total will be " + Menu.vacayFitS.get(smoothie));
        } else if (smoothie.contains("menu")) {
            m1.printMenu();
            String smoothiechoice;
            Scanner abc = new Scanner(System.in);
            System.out.println("Which of these smoothies would you like?");
            smoothiechoice = abc.nextLine();
            if (Menu.slimFitS.containsKey(smoothiechoice)) {
                System.out.println("Alright! The total will be " + Menu.slimFitS.get(smoothiechoice));
            } else if (Menu.wellFitS.containsKey(smoothiechoice)) {

                System.out.println("Alright! The total will be " + Menu.wellFitS.get(smoothiechoice));
            } else if (Menu.veggieFitS.containsKey(smoothiechoice)) {
                System.out.println("Alright! The total will be " + Menu.veggieFitS.get(smoothiechoice));
            } else if (Menu.vacayFitS.containsKey(smoothiechoice)) {
                System.out.println("Alright! The total will be " + Menu.vacayFitS.get(smoothiechoice));
                {
                }
            }
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //a1.printSet();
        welcomeMessage(sc.nextLine());

    }
}


