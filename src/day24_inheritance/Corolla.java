package day24_inheritance;

public class Corolla extends Toyota{
    String productionPlace="Türkiye";
    String tyre="Corolla cars use pirelli 205-60-16 tyre";
    String model="Corolla";
    boolean otoPark=false;
    boolean cruiseControl=true;
    public void speed(){
        System.out.println("Corolla cars have maximum 240 km speed");
    }
    public void safety(){
        System.out.println("Corolla cars use 12 airbag");
    }
    public static void main(String[] args) {
     Corolla corolla1=new Corolla();
        System.out.println(corolla1.productionPlace);//Türkiye
        System.out.println(corolla1.tyre);//Corolla cars use pirelli 205-60-16 tyre
        System.out.println(corolla1.model);//Corolla
        System.out.println(corolla1.otoPark);//false
        System.out.println(corolla1.cruiseControl);//true
        System.out.println(corolla1.brand);//Toyota
        corolla1.speed();//Corolla cars have maximum 240 km speed
        corolla1.safety(); //Corolla cars use 12 airbag
        corolla1.battery();//Toyota cars use inci battery
        System.out.println(corolla1.tyreCount);//4
    }

}
