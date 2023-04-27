package day10_nestedForLoop_Methot;

public class C11_Method_Creation_Factorial {
    public static void main(String[] args) {
int result=factorialCalculate(5);
        System.out.println(result);
    }
    public static int factorialCalculate(int number){
        int fakt=1;
        for (int i = 1; i <=number ; i++) {
            fakt*=i;
        }
        return fakt;
    }
}
