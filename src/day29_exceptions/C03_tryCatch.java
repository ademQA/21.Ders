package day29_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;
// Get two integers from user
// if the user does not enter an integer, give an error message and request a number again
// divide the first number by the second
// and print the integer part of the result

public class C03_tryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isNumber = true;
        int number1 = 0;

        while (isNumber) {

            try {

                System.out.println("Enter the divided number: ");
                number1 = scanner.nextInt();
                isNumber = false;
            } catch (InputMismatchException e) {
                String temp = scanner.next();
                System.out.println("you must enter an integer value");
            }
        }

        int number2 = 0;
        boolean isNumber2 = true;
        while (isNumber2) {

            try {
                System.out.println("Enter the number to divide: ");
                number2 = scanner.nextInt();
                isNumber2 = false;
            } catch (InputMismatchException e) {
                String temp = scanner.next();
                System.out.println("you must enter an integer value");
            }
        }

        try {
            System.out.println("division result of two numbers" + number1 / number2);
        } catch (ArithmeticException e) {
            System.out.println("numbers are not divisible by 0");
        }

    }
}
