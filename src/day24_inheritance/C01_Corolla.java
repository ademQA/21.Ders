package day24_inheritance;

public class C01_Corolla extends C01_Toyota{
C01_Corolla(){
    System.out.println("Corolla Consructor run");
}
String model="Corolla";
String productionPlace="Türkiye";

    public static void main(String[] args) {
        C01_Corolla corolla=new C01_Corolla();
       }
}
