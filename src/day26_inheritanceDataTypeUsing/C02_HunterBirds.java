package day26_inheritanceDataTypeUsing;

public class C02_HunterBirds extends C02_Birds {
    public void move() {
        System.out.println("they fly");
    }

    public void feeding() {
        System.out.println("they eat meat");
    }

    public void claw() {
        System.out.println("they had claws");
    }

    public void beak() {
        System.out.println("They have pointed beaks");
    }

    public static void main(String[] args) {
        C02_HunterBirds hunterBirds = new C02_HunterBirds();
        hunterBirds.beak(); //They have pointed beaks
        hunterBirds.multiplication();   //they reproduce with eggs
        hunterBirds.respiration();  //They breathe with lungs
        hunterBirds.wing(); //they are winged
        hunterBirds.feeding();  //they eat meat
        hunterBirds.move(); //they fly
        hunterBirds.claw(); //they had claws
        hunterBirds.lifetime(); //They live and die
        System.out.println("*************************************");
        C02_Birds hunterBirdsBirds = new C02_HunterBirds();
        hunterBirdsBirds.beak(); //They have pointed beaks
        hunterBirdsBirds.multiplication();   //they reproduce with eggs
        hunterBirdsBirds.respiration();  //They breathe with lungs
        hunterBirdsBirds.wing(); //they are winged
        hunterBirdsBirds.feeding();  //they eat meat
        hunterBirdsBirds.move(); //they fly
        //hunterBirdsBirds.claw(); //CTE
        hunterBirdsBirds.lifetime(); //They live and die
        System.out.println("*************************************");

        C02_Animal hunterBirdsAnimal = new C02_HunterBirds();
        // hunterBirdsAnimal.beak(); //CTE
        hunterBirdsAnimal.multiplication();   //they reproduce with eggs
        hunterBirdsAnimal.respiration();  //They breathe with lungs
        // hunterBirdsAnimal.wing(); //CTE
        hunterBirdsAnimal.feeding();  //they eat meat
        hunterBirdsAnimal.move(); //they fly
        // hunterBirdsAnimal.claw(); //CTE
        hunterBirdsAnimal.lifetime(); //They live and die

        System.out.println("*************************************");
        C02_Birds birds = new C02_Birds();
        birds.beak(); //They have pointed beaks
        birds.multiplication();   //they reproduce with eggs
        birds.respiration();  //They breathe with lungs
        birds.wing(); //they are winged
        birds.feeding();  //they eat meat
        birds.move(); //they fly
        //birds.claw(); //CTE
        birds.lifetime(); //They live and die
        System.out.println("*************************************");

        C02_Animal animal = new C02_Animal();
        //animal.beak(); //CTE
        animal.multiplication();   //they will reproduce
        animal.respiration();  //they breathe
        //animal.wing(); //CTE
        animal.feeding();  //they are fed
        animal.move(); //they move
        //animal.claw(); //CTE
        animal.lifetime(); //They live and die

        System.out.println("*************************************");

        C02_Animal birdsAnimal = new C02_Birds();
        //birdsAnimal.beak(); //They have pointed beaks
        birdsAnimal.multiplication();   //they reproduce with eggs
        birdsAnimal.respiration();  //They breathe with lungs
        //birdsAnimal.wing(); //they are winged
        birdsAnimal.feeding();  //they are fed
        birdsAnimal.move(); //they move
        //birdsAnimal.claw(); //CTE
        birdsAnimal.lifetime(); //They live and die


    }
}
