package day08_stringManipulation;

public class C09_nullPointer {
    public static void main(String[] args) {
        String str=null;
        String test="";
        System.out.println(test.length());
        System.out.println(str+"ali");
        System.out.println(test.concat("adem"));
        System.out.println(test.concat("tekinel").length());
    }
}
