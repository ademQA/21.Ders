package day08_stringManipulation;

public class C06_lastindexof {
    public static void main(String[] args) {
        String str="Java cok faydalı";
        System.out.println(str.lastIndexOf("a"));
        System.out.println(str.lastIndexOf("a", 10));
        System.out.println(str.lastIndexOf("a", 12));
        System.out.println(str.lastIndexOf("a", 14));
        System.out.println(str.lastIndexOf("fay"));
        System.out.println(str.lastIndexOf("ay",6));
        System.out.println(str.lastIndexOf('f'));
    }
}
