package day09_stringManipulation_forloop;

public class C10_ForLoop_Factorial {
    public static void main(String[] args) {
        // find the factorial of a given number
        // 5 ! = 5 * 4 * 3 * 2 * 1 = 120

        int number = 10;
        int factorial=1;

        String result = number+" ! = ";
        System.out.print(result);
        for (int i = number; i >=1 ; i--) {
            factorial *= i;
            if (i != 1){
                System.out.print(i+" * ");
            }else{
                System.out.print("1 = ");
            }
        }
        System.out.println(factorial);
    }
}
