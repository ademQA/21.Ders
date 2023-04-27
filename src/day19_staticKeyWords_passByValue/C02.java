package day19_staticKeyWords_passByValue;

public class C02 {
    static String staticV= "Java";
    String name="Sevda";

    public static void main(String[] args) {
        C02 obj1=new C02();
        System.out.println(obj1.name);// Sevda
        System.out.println(obj1.staticV);//Java
        obj1.name="akif";
        System.out.println(obj1.name);// Akif
        C02 obj2=new C02();
        System.out.println(obj2.name); // Sevda
        System.out.println(obj2.staticV);//Java
        obj2.name="Ayşe";
        obj2.staticV="Hava";
        System.out.println(obj1.name);//Akif
        System.out.println(obj1.staticV);//Hava
        System.out.println(obj2.name);//Ayşe
        System.out.println(obj2.staticV);//Hava
        System.out.println(staticV);//Hava
    }
}
