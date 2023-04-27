package day04_increment_Concatenation;

public class C02_PreIncrement_PostIncrement {
    public static void main(String[] args) {
        int a=10;
        int b=10;
        System.out.println(++a);
        System.out.println(b++);
        System.out.println(a++ + b++);
        System.out.println(++a+b++);
       int c=a++ + ++b;
        System.out.println(c);

    }
}
