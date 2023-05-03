package day24_inheritance;

public class Car {
    String brand= "car brand not specified";
    String model="car model not specified";
    int tyreCount=4;

    public  void safety(){
        System.out.println("All cars must have safety precautions");
    }

    public  void speed(){
        System.out.println("cars determine maximum speed according to engine and fuel");

    }
}
