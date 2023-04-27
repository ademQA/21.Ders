package day07_switchStatement_StringManupulation;

public class C09_equal_ignoreCase {
    public static void main(String[] args) {
        String str1="java";
        String str2="java";
        String str3="Java";
        String str4="JAVA";
        String str5="JaVa";
        String str6=new String("Java");
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str3.equalsIgnoreCase(str4));
        System.out.println(str5.equalsIgnoreCase("java"));

    }
}
