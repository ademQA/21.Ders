package day18_constructors_With_Parametre_ConsructerCall;

public class C06 {
    C06(){

        System.out.println("parameterless Constructor");
    }
    C06(int number){
        // C06();  Java bu sekilde yazimi method call kabul eder
        // yani constructor'lar cons. ismi yazilarak CAGRILAMAZ
        this();

        // bir constructor'in icinde baska bir constructor'i calistirmak istersek
        // this(istenen argumentler) yazariz
        System.out.println("int parameter constructor");
    }
    C06(String str){
        this(3);
        System.out.println("String parameter consructor");
    }
    public static void main(String[] args) {

        C06 obj = new C06("Java");
    }
}
