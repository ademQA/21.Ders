package day11_method_Overloading_WhileLoop;

import java.util.Scanner;

public class C11_WhileLoop_OverNumber {
    public static void main(String[] args) {
        //Question 5- Ask the user for a number and the reason he wants to calculate.
        // Create a method that calculates and prints the desired prime of the given number using the while loop.

        Scanner scanner=new Scanner(System.in);
        System.out.println("input number:");
        double number=scanner.nextDouble();

        System.out.println("input positive number for over of number:");
        int overNumber=scanner.nextInt();
        overCalculateWrite(number,overNumber);
    }

    public static void overCalculateWrite(double number, int overNumber) {
        int startCase=1;
        double result=1;
        while ((startCase<=overNumber)){
            result*=number;
            startCase++;
        }
        System.out.println(number+" over "+overNumber+" = "+result);
    }
}
