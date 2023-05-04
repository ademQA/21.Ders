package day25_inheritance;

public class C01_Corolla extends C01_Toyota {
    C01_Corolla() {
        System.out.println("Corolla Consructor run");
    }
    C01_Corolla(int number){
        System.out.println("Corolla with int parameter constructor run");
    }
    C01_Corolla(String fuel){
        super(5);
        System.out.println("Corolla with String parameter constructor run");
    }

    String model = "Corolla";
    String productionPlace = "Türkiye";

    public static void main(String[] args) {
        C01_Corolla corolla2 = new C01_Corolla("electric");
         }
}
