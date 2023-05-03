package day24_inheritance;

public class C01_Corolla extends C01_Toyota{
C01_Corolla(){
    System.out.println("Corolla Consructor run");
}
String model="Corolla";
String productionPlace="Türkiye";

    public static void main(String[] args) {
        C01_Corolla corolla=new C01_Corolla();
        System.out.println(corolla.model);//Corolla
        System.out.println(corolla.brand); //Toyota
        System.out.println(corolla.motor); //Cars have motor
        System.out.println(corolla.productionPlace);//Türkiye
    }
}
