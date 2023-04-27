package day19_staticKeyWords_passByValue;

public class C01_Static {
    static  String staticV="Java Candır";
    String instanceV = "Selenium heyecandir";

    public static void main(String[] args) {
        staticV="Java Hayattır";
        staticMethod();
    }

    public static void staticMethod(){
        System.out.println("static method is run");
        System.out.println(staticV);
    }
    public void notstaticMethod(){
        System.out.println("not static method is run");
        System.out.println(staticV);
        staticMethod();
        System.out.println(instanceV);
    }
}
