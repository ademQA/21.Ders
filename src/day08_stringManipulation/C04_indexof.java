package day08_stringManipulation;

public class C04_indexof {
    public static void main(String[] args) {
        String str="Java en iyisi";
        System.out.println(str.indexOf("en"));
        System.out.println(str.indexOf("s"));
        System.out.println(str.indexOf("z"));
        System.out.println(str.indexOf("av", 2));
        System.out.println(str.indexOf("a", 2));
    }
}
