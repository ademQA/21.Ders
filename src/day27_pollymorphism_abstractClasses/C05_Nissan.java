package day27_pollymorphism_abstractClasses;

public class C05_Nissan extends C03_Car {

    @Override
    void tyre() {
        System.out.println("Nissan vehicles use lassa");
    }

    @Override
    void motor() {
        System.out.println("Nissan vehicles use Renault engines");

    }

    @Override
    void indicator() {
        System.out.println("Nissan vehicles have 20 gauges");
    }

    public static void main(String[] args) {
        C05_Nissan nissan = new C05_Nissan();
        nissan.safty(); //Cars better have safety precautions
        nissan.airConditioning(); //Cars can have air conditioners
        nissan.tyre(); //Nissan vehicles use lassa
        nissan.motor(); //Nissan vehicles use Renault engines
        nissan.indicator(); //Nissan vehicles have 20 gauges
        System.out.println("*******************************");
        C03_Car nissan2 = new C05_Nissan();
        nissan.safty(); //Cars better have safety precautions
        nissan.airConditioning(); //Cars can have air conditioners
        nissan.tyre(); //Nissan vehicles use lassa
        nissan.motor(); //Nissan vehicles use Renault engines
        nissan.indicator(); //Nissan vehicles have 20 gauges


    }
}
