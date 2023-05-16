package day29_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;
// Take two integers from the user
// divide the first number by the second
// and print the integer part of the result

public class C02_tryCatch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the divided number: ");

        int number1= 0;
        try {
            number1 = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("you must enter an integer value");
        }


        System.out.println("Enter the number to divide: ");
        int number2= 0;
        try {
            number2 = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("you must enter an integer value");
        }


        try {
            System.out.println("division result of two numbers"+number1/number2);
        } catch (ArithmeticException e) {
            System.out.println("numbers are not divisible by 0");
        }

    }
    }

