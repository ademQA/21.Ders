package day29_exceptions;

import java.util.Scanner;

public class C01_Exceptions {
    // Take two integers from the user
    // divide the first number by the second
    // and print the integer part of the result

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the divided number ");
        int number1= scanner.nextInt();
        System.out.println("Enter the number to divide");
        int number2= scanner.nextInt();
        System.out.println("division result of two numbers"+number1/number2);
        if (number2==0)
            System.out.println("numbers are not divisible by 0");
        else
            System.out.println("division result of two numbers"+number1/number2);
    }
}
