package day22_String_Builder;

public class C03_StringBuildingAndStringMethods {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Java Candır");
        System.out.println(sb1.substring(5));//Candır
        System.out.println(sb1); //Java Candır

        System.out.println(sb1.substring(5, 8));  //Can
        System.out.println(sb1); //Java Candır

        System.out.println(sb1.toString().toUpperCase()); //JAVA CANDIR
        System.out.println(sb1); //Java Candır

        sb1=new StringBuilder(sb1.toString().toUpperCase());
        System.out.println(sb1);  //JAVA CANDIR
    }
}
