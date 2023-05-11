package day27_pollymorphism_abstractClasses;

public class C04_Toyota extends C03_Car {
    public static void main(String[] args) {

        C04_Toyota car1 = new C04_Toyota();
        car1.indicator();   //Toyota vehicles have all gauges
        car1.motor();   //Toyota vehicles use environmentally friendly engines
        car1.tyre();    //Toyota vehicles use Pirelli wheels
    }


    @Override
    void tyre() {
        System.out.println("Toyota vehicles use Pirelli wheels");

    }

    @Override
    void motor() {
        System.out.println("Toyota vehicles use environmentally friendly engines");

    }

    @Override
    void indicator() {
        System.out.println("Toyota vehicles have all gauges");
    }
}
