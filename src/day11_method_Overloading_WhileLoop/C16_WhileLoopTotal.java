package day11_method_Overloading_WhileLoop;

import java.util.Scanner;

public class C16_WhileLoopTotal {
    public static void main(String[] args) {
        //Question 2- Find the sum of digits of the number received from the user using the while loop.
        Scanner scanner=new Scanner(System.in);
        System.out.println("input integer: ");
        int number= scanner.nextInt();
        int digit;
       int total=0;

        while (number>0){
            digit=number%10;
            number=number/10;
            total+=digit;
        }
        System.out.println("Total digit of entered number: "+total);
    }
}
