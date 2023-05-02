package day22_String_Builder;


public class C02_StringBuilder_Method {

    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Java Candır");
        sb1.append(".");
        System.out.println(sb1); // Java Candır.

        String str="Bu gün hava çok güzel";
        sb1.append(str,2,6);
        System.out.println(sb1);  //Java Candır. gün

        sb1.replace(0,4,"Selenium");
        System.out.println(sb1); //Selenium Candır. gün

        sb1.insert(9,"heye");
        System.out.println(sb1); //Selenium heyeCandır. gün

        sb1.insert(0,str,0,3);
        System.out.println(sb1); //Bu Selenium heyeCandır. gün

        sb1.delete(23,27);
        System.out.println(sb1); //Bu Selenium heyeCandır.

        int indexC= sb1.indexOf("C");
        sb1.deleteCharAt(indexC);
        System.out.println(sb1);//Bu Selenium heyeandır.

        sb1.insert(indexC,"c");
        System.out.println(sb1); // Bu Selenium heyecandır.

        sb1.reverse();
        System.out.println(sb1); //.rıdnaceyeh muineleS uB
        sb1.reverse();
        System.out.println(sb1); //Bu Selenium heyecandır.

        StringBuilder sb2=new StringBuilder("Java Candır");

       // System.out.println(sb1.compareTo(sb2)); //-8

        StringBuilder sb3=new StringBuilder("Bu Java Candır");
        //System.out.println(sb1.compareTo(sb3)); //9

        StringBuilder sb4=new StringBuilder("Bu Saha Candır");
        //System.out.println(sb1.compareTo(sb4)); //4

        StringBuilder sb5=new StringBuilder("Bu Selenium heyecandır");
        //System.out.println(sb1.compareTo(sb5)); //0

        System.out.println(sb1==sb5); //false
        System.out.println(sb1==sb1); //true

        System.out.println(sb1.equals(sb5)); //false

        String str2="Bu Selenium heyecandır";
        System.out.println(sb1.equals(str2)); //false



    }
}
