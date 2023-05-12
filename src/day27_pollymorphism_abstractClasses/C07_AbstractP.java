package day27_pollymorphism_abstractClasses;

public abstract class C07_AbstractP extends C06_AbstractGP{
   protected void method1(){
        System.out.println("Parent class concrete method1");
    }
    protected void method4(){
        System.out.println("Parent class concrete method 4");
    }
    protected abstract void method5();
    void method6(){
        System.out.println("Parent class concrete method6");
    }
}
