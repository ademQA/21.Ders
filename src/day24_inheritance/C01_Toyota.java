package day24_inheritance;

public class C01_Toyota extends C01_Car {
    C01_Toyota() {
        System.out.println("Toyota consructor run");
    }

    C01_Toyota(int year) {
        this();
        System.out.println("Toyota with int parameter constructor run");
    }

    String brand = "Toyota";
    String productionPlace;

}
