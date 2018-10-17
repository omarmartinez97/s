import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.HashSet;

public class Add_Ons extends Recipe {
    //should these be maps?
    ArrayList produce = new ArrayList(); //produce-esque items
   // String[] Adds = new String[10];
   Set<String> adds = new HashSet<>();// these are additives
    //it's also not letting me print out the Collection, do I have to iterate
    //over them first?
   public void addtoSet(){
       adds.add("Muscle Builder");
       adds.add("Pure Recharge");
       adds.add("Multi-vitamin");
       adds.add("Prenatal vitamin");
       adds.add("Herbal Immune");
       adds.add("ProBiotic");
       adds.add("Energy");
       adds.add("Fiber");
       adds.add("Diet Down");
   }
   public void printSet(){
       System.out.println(adds);

   }
    public void addToList() {
        produce.add("Strawberry");
        produce.add("Blueberry");
        produce.add("Papaya");
        produce.add("Lemon");
        produce.add("Dates");
        produce.add("Raspberry");
        produce.add("Peanut Butter");
        produce.add("Peaches");
        produce.add("Pumpkin");
        produce.add("Green Tea");
        produce.add("Banana");
        produce.add("Mango");
        produce.add("Sunrise Cocoa");
        produce.add("Creatine");
        produce.add("Vegan Protein");
        produce.add("Strawverry Gladiator Protein");
        produce.add("Vanilla Gladiator Protein");
        produce.add("Chocolate Gladiator Protein");
        produce.add("Lean 1 Vanilla Protein");
        produce.add("Lean 1 Strawberry Protein");
        produce.add("Lean 1 Chocolate Protein");
        produce.add("Electrolytes");
        produce.add("Nutrient Mix");
        produce.add("Super Grains");
       // produce.addAll(adds);

  }
  Add_Ons() {
  //    addToList();
    //  addtoSet();
     // printSet();
  }

}
