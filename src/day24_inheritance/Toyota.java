package day24_inheritance;

public class Toyota extends Car{
    String brand="Toyota";
    String productionPlace="production place not specified";
    String tyre="Toyota cars use pirelli tyres";

    public void safety(){
        System.out.println("Toyota cars have extra security equipment");
    }

    public void battery(){
        System.out.println("Toyota cars use inci battery");
    }
}
