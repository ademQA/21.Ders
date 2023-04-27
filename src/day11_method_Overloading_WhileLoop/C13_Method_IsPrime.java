package day11_method_Overloading_WhileLoop;

import java.util.Scanner;

public class C13_Method_IsPrime {

    public static void main(String[] args) {
        //Question 3- Get a positive integer from user in main method. Create a method that checks
        // if the entered number is a prime number and returns "prime" or "not prime" as a result.

        Scanner scanner=new Scanner(System.in);
        System.out.println("input number: ");
        int number= scanner.nextInt();
        isPrimeWrite(number);

    }

    public static boolean isPrimeWrite(int number) {
        boolean state=true;
        for (int i = 2; i <number ; i++) {
            if (number%i==0)
                state=false;

        }   if (state==true)
            System.out.println("number is prime");
        else
            System.out.println("number is not prime");
        return state;

    }

}
