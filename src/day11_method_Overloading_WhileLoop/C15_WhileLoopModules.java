package day11_method_Overloading_WhileLoop;

public class C15_WhileLoopModules {
    public static void main(String[] args) {
        //Question 1- Print 2-digit positive integers divisible by 7 using while loop.
        int number=10;
        while (number<100){
            if (number%7==0)
                System.out.println("integers divisible by 7 :"+number);
            number++;
        }
    }
}
