package day08_stringManipulation;

public class C10_replace {
    public static void main(String[] args) {
        String str="Javasız olmaz";
        System.out.println(str.replace("J", "H"));
        System.out.println(str.replace("a", ""));
        System.out.println(str.replace("sız", "bensiz"));
        System.out.println(str.replace(" ", ""));
        System.out.println(str.replaceFirst("a", "x"));
    }
}
