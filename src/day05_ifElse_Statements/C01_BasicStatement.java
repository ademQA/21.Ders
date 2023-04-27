package day05_ifElse_Statements;

public class C01_BasicStatement {
    public static void main(String[] args) {
        int a = 20;
        int b = 75;
        if (a > b) {
            System.out.println("a is greater than b");
        }
        if (a%7==0)
        {
            System.out.println("The number a is divisible by 7");
        }
        if (b % 5 == 0){
            System.out.println("b is divisible by 7");
        }
        if (a+b > 100){
            System.out.println("total of numbers is greater than 100");
        }
        if (false){
            System.out.println("this code runs at all");
        }
        if (true){
            System.out.println("this code always runs ");
        }

    }
}
