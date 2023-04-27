package day19_staticKeyWords_passByValue;

public class C03_staticBlok {
    static {
        System.out.println("Top static block worked");
    }

    public static void main(String[] args) {
        System.out.println("main method worked");
    }

    static {
        System.out.println(" static block worked");
    }
    static {
        System.out.println("second static block worked");
    }
}
