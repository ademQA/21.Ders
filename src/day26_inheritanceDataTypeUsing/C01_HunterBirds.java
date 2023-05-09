package day26_inheritanceDataTypeUsing;

public class C01_HunterBirds extends C01_Birds {
    String move = "they fly";
    String nutrition = "they eat meat";
    String claw = "they have claws";
    String beak = "they have pointed beaks";

    public static void main(String[] args) {
        C01_HunterBirds hunterBirds = new C01_HunterBirds();
        System.out.println(hunterBirds.beak);   //they have pointed beaks
        System.out.println(hunterBirds.claw);   //they have claws
        System.out.println(hunterBirds.move);   //they fly
        System.out.println(hunterBirds.lifetime);   //they live and die
        System.out.println(hunterBirds.nutrition);  //they eat meat
        System.out.println(hunterBirds.reproductive);   //they reproduce with eggs
        System.out.println(hunterBirds.respiratory);    //they breathe with lungs
        System.out.println(hunterBirds.wing);   //they have wings
        System.out.println("*******************************************");
        C01_Birds hunterBirdsBirds = new C01_HunterBirds();
        System.out.println(hunterBirdsBirds.beak);   //they have beaks
        //System.out.println(hunterBirdsBirds.claw);   //CTE
        //System.out.println(hunterBirdsBirds.move);   //CTE
        System.out.println(hunterBirdsBirds.lifetime);   //they live and die
        System.out.println(hunterBirdsBirds.nutrition);  //they feed
        System.out.println(hunterBirdsBirds.reproductive);   //they reproduce with eggs
        System.out.println(hunterBirdsBirds.respiratory);    //they breathe with lungs
        System.out.println(hunterBirdsBirds.wing);   //they have wings
        System.out.println("*******************************************");
        C01_Animal hunterBirdsAnimal = new C01_HunterBirds();
        //System.out.println(hunterBirdsAnimal.beak);   //CTE
        //System.out.println(hunterBirdsAnimal.claw);   //CTE
        //System.out.println(hunterBirdsAnimal.move);   //CTE
        System.out.println(hunterBirdsAnimal.lifetime);   //they live and die
        System.out.println(hunterBirdsAnimal.nutrition);  //they feed
        System.out.println(hunterBirdsAnimal.reproductive);   //they breed
        System.out.println(hunterBirdsAnimal.respiratory);    //they breathe
        //System.out.println(hunterBirdsAnimal.wing);   //CTE


    }
}
