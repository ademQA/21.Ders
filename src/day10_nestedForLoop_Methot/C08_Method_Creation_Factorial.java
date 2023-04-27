package day10_nestedForLoop_Methot;

public class C08_Method_Creation_Factorial {
    public static void main(String[] args) {
factorial(5);
    }
    public static void factorial(int number){
       int faktorial=1;
        for (int i = 1; i <=number ; i++) {
            faktorial*=i;
        }
        System.out.println("factorial of given number: "+faktorial);
    }
}
