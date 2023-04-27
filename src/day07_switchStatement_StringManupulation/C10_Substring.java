package day07_switchStatement_StringManupulation;

import java.util.Locale;

public class C10_Substring {
    public static void main(String[] args) {
        String str="Java Candir";
        System.out.println(str.substring(5));
        System.out.println(str.substring(5, 8));
        System.out.println(str.substring(6, 11));
        System.out.println(str.substring(5, 6));
        System.out.println(str.substring(3, 3));
        System.out.println(str.substring(11));//empty line
        System.out.println("adem".substring(3));
        System.out.println("adem tekinel".substring(5).equals("tekinel"));

        String str2="eSRa";//Esra
        str2=str2.substring(0,1).toUpperCase()+str2.substring(1).toLowerCase(Locale.ROOT);
        System.out.println(str2);


    }
}
