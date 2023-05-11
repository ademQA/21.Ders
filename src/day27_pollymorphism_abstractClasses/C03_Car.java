package day27_pollymorphism_abstractClasses;

public abstract class C03_Car {
    abstract void tyre();

    abstract void motor();

    abstract void indicator();

    void safty() {
        System.out.println("Cars better have safety precautions");

    }

    void airConditioning() {
        System.out.println("Cars can have air conditioners");

    }
}
