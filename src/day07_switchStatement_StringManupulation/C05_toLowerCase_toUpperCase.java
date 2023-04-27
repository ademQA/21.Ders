package day07_switchStatement_StringManupulation;

import java.util.Locale;

public class C05_toLowerCase_toUpperCase {
    public static void main(String[] args) {
        String str="Java Candir";
        System.out.println(str.toUpperCase());
        str=str.toUpperCase();
        str=str.toLowerCase(Locale.forLanguageTag("Tr"));
        System.out.println(str);
        String str2="nobody is calling me";
        str2=str2.toUpperCase(Locale.forLanguageTag("Tr"));
        System.out.println(str2);
    }
}
