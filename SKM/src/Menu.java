import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class Menu extends Recipe {
    protected static double balance;

    protected static HashMap<String, Double> slimFitS = new HashMap<>();
    protected static HashMap<String, Double> wellFitS = new HashMap<>();
    protected static HashMap<String, Double> veggieFitS = new HashMap<>();
    protected static HashMap<String, Double> vacayFitS = new HashMap<>();
//    protected static HashMap<String, Double> slimFitM = new HashMap<>();
//    protected static HashMap<String, Double> wellFitM = new HashMap<>();
//    protected static HashMap<String, Double> veggieFitM = new HashMap<>();
//    protected static HashMap<String, Double> vacayFitM = new HashMap<>();
//    protected static HashMap<String, Double> slimFitL = new HashMap<>();
//    protected static HashMap<String, Double> wellFitL = new HashMap<>();
//    protected static HashMap<String, Double> veggieFitL = new HashMap<>();
//    protected static HashMap<String, Double> vacayFitL = new HashMap<>();
//    protected double balance;

    Menu() {

//there has to be a better way to print this out
//formatting hashmaps seems to be a fucking bitch
        menuItems();
        //  printMenu();

    }

    static private void menuItems() {
        slimFitS.put("Angel Food",5.54 );
        slimFitS.put("Slim n' Trim", 1.11);
        slimFitS.put("Lean 1", 1.11);
        slimFitS.put("Mangofest" , 1.11 );
        slimFitS.put("Greek Yogurt", 1.11);
        slimFitS.put("Island Impact", 2.22);
        slimFitS.put("The Shredder", 9.00);
        wellFitS.put("Activator", 5.56);
        wellFitS.put("Coffee High Protein", 5.56);
        wellFitS.put("Gladiator", 5.56);
        wellFitS.put("Original High Protein", 5.56);
        wellFitS.put("Hulk", 5.56);
        wellFitS.put("Peanut Power Plus", 5.56);
        wellFitS.put("Power Punch Plus", 5.56);
        veggieFitS.put("Pineapple Spinach", 5.95);
        veggieFitS.put("Daily Warrior", 5.87);
        veggieFitS.put("Nutty Super Grain", 5.44);
        veggieFitS.put("Lemon Ginger Spinach", 5.21);
        veggieFitS.put("Dark Chocolate Banana", 6.01);
        veggieFitS.put("Mango Kale", 5.11);
        veggieFitS.put("Apple Kiwi Kale", 5.51);
        veggieFitS.put("Premama", 5.55);
        veggieFitS.put("BlueBerry Heaven", 5.67);
        veggieFitS.put("Pure Recharge", 5.51);
        veggieFitS.put("Immune Builder", 5.56);
        veggieFitS.put("Carrot Kale Dream", 5.55);
        vacayFitS.put("Banana Berry Treat", 5.99);
        vacayFitS.put("Banana Boat", 5.55);
        vacayFitS.put("Caribbean Way", 5.55);
        vacayFitS.put("Lemon Twist Strawberry", 5.13);
        vacayFitS.put("Berry Punch", 4.45);
        vacayFitS.put("Muscle Punch", 900.0);
        vacayFitS.put("Passion Passport", 1000.0);
        vacayFitS.put("Peach Slice Plus", 101010.10);
        vacayFitS.put("Green Tea Tango", 10101010101.10);
        vacayFitS.put("Strawberry X-Treme", 10.05);
        vacayFitS.put("Yogurt D-Lite", 10.10);
        vacayFitS.put("Pineapple Surf", 5.55);

    }
    public void printSlim_Fit_Small(){
        System.out.println("-#-#-#-#-#-#-#-");
        System.out.println("--Fitness Smoothies--");
        for (Map.Entry hm : slimFitS.entrySet()) {

            System.out.println(hm.getKey());
        }
        System.out.println("  ");
    }
    public void printWell_Fit_Small(){
        System.out.println("-#-#-#-#-#-#-#-");
        System.out.println("--Wellness Smoothies--");
        for (Map.Entry hm : wellFitS.entrySet()) {
            System.out.println(hm.getKey());
        }
        System.out.println("  ");
    }
    public void printVaCay_Fit_Small(){
        System.out.println("-#-#-#-#-#-#-#-");
        System.out.println("--Vacation Smoothies--");
        for (Map.Entry hm : vacayFitS.entrySet()) {
            System.out.println(hm.getKey());
        }
        System.out.println("  ");
    }
    public void printVeggie_Fit_Small(){
        System.out.println("-#-#-#-#-#-#-#-");
        System.out.println("--Vegetable Smoothies--");
        for (Map.Entry hm : veggieFitS.entrySet()) {
            System.out.println(hm.getKey());
        }
        System.out.println("  ");
    }
    public void printMenu() {
     printSlim_Fit_Small();
     printWell_Fit_Small();
     printVeggie_Fit_Small();
     printVaCay_Fit_Small();
    }
}
//
//    //SlimFit Large
//    // I can/need to refactor all of this, deciding to do it when it's done instead.
//    private static void SFL(String size) {
//        if (size.contentEquals("Large") || size.contentEquals("large")) {
//            slimFitL.putAll(slimFitS);
//            for (Map.Entry<String, Double> bob : slimFitL.entrySet()) {
//                slimFitL.put(bob.getKey(), 9.84);
//            }
//        }
//        System.out.println(slimFitL);
//    }
//
//    //Well Fitness Large
//    private static void WFL(String size) {
//        if (size.contentEquals("Large") || size.contentEquals("large")) {
//            wellFitL.putAll(wellFitS);
//            for (Map.Entry<String, Double> bob : wellFitL.entrySet()) {
//                wellFitL.put(bob.getKey(), 9.84);
//            }
//        }
//        System.out.println(wellFitL);
//    }
//
//    // Vaycay Large
//    private static void VCL(String size) {
//        if (size.contentEquals("Large") || size.contentEquals("large")) {
//            vacayFitL.putAll(vacayFitS);
//            for (Map.Entry<String, Double> bob : vacayFitL.entrySet()) {
//                vacayFitL.put(bob.getKey(), 9.84);
//            }
//        }
//        System.out.println(vacayFitL);
//    }
//
//    //Veggie Large
//    private static void VGL(String size) {
//        if (size.contentEquals("Large") || size.contentEquals("large")) {
//            veggieFitL.putAll(veggieFitS);
//            for (Map.Entry<String, Double> bob : veggieFitL.entrySet()) {
//                veggieFitL.put(bob.getKey(), 9.84);
//            }
//        }
//        System.out.println(veggieFitL);
//    }
//
//    // Veggie Medium
//    private static void VGM(String size) {
//        if (size.contentEquals("Large") || size.contentEquals("large")) {
//            veggieFitM.putAll(veggieFitS);
//            for (Map.Entry<String, Double> bob : veggieFitM.entrySet()) {
//                veggieFitM.put(bob.getKey(), 7.84);
//            }
//        }
//        System.out.println(veggieFitM);
//
//    }
//
//    //SlimFit Medium
//    private static void SFM(String size) {
//        if (size.contentEquals("Large") || size.contentEquals("large")) {
//            slimFitM.putAll(slimFitS);
//            for (Map.Entry<String, Double> bob : slimFitM.entrySet()) {
//                slimFitM.put(bob.getKey(), 7.84);
//            }
//        }
//        System.out.println(slimFitM);
//    }
//
//    // VaCay Medium
//    private static void vcMed(String size) {
//        if (size.contentEquals("Large") || size.contentEquals("large")) {
//            vacayFitM.putAll(vacayFitS);
//            for (Map.Entry<String, Double> bob : vacayFitM.entrySet()) {
//                vacayFitM.put(bob.getKey(), 7.84);
//            }
//        }
//        System.out.println(vacayFitM);
//    }
//
//    //WellFit Medium
//    private static void wfMed(String size) {
//        if (size.contentEquals("Large") || size.contentEquals("large")) {
//            wellFitM.putAll(wellFitS);
//            for (Map.Entry<String, Double> bob : wellFitM.entrySet()) {
//                slimFitL.put(bob.getKey(), 7.84);
//            }
//        }
//        System.out.println(wellFitM);
//    }
//
//    public void printslimFit() {
//        System.out.println(slimFitS);
//    }
//}



