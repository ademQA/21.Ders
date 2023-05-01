package day22_String_Builder;

public class C02_StringBuilder_Method {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Java Candır");
        sb1.append(".");
        System.out.println(sb1); // Java Candır.

        String str="Bu gün hava çok güzel";
        sb1.append(str,2,6);
        System.out.println(sb1);//

        sb1.replace(0,4,"Selenium");
        System.out.println(sb1);

        sb1.insert(9,"heye");
        System.out.println(sb1);
    }
}
