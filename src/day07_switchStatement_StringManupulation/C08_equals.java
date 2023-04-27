package day07_switchStatement_StringManupulation;

public class C08_equals {
    public static void main(String[] args) {
        String str1="java";
        String str2="java";
        String str3="Java";
        String str4="JAVA";
        String str5="JaVa";
        String str6=new String("Java");
        System.out.println(str1.equals(str2));
        System.out.println(str3.equals(str6));
        System.out.println(str2.equals(str5));

    }
}
