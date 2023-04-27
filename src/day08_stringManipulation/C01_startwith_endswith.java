package day08_stringManipulation;

public class C01_startwith_endswith {
    public static void main(String[] args) {
        String str="Java çok eğlenceli";
        System.out.println(str.startsWith(""));
        System.out.println(str.startsWith("Java"));
        System.out.println(str.startsWith("av", 2));
        System.out.println("---------------------------");
        System.out.println(str.endsWith("li"));
        System.out.println(str.length());
    }
}
