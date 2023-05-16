package day29_exceptions;
/*
         If more than one exception is possible
         and there is no parent-child relationship between these exceptions
         We can use 3 different approaches
         1- We can create 2 different try-catch for two different exception possibilities
         2- we can create a try 2 catch blog
         3- If there is only one exception covering 2 exceptions, we will use it to solve the problem with 1 try-1 catch
      */

import java.util.Scanner;

public class C05_tryCatch {
    // Elimizde input olarak verilmis bir String ve sayilardan olusan bir array var
    public static void main(String[] args) {
        // Ask the user for a 0 or positive integer
        // using the given integer as index
        // Print the letter and number in that index from String and Array

        String str="Java herşeyi düşünmüş";
        int[] numbers={2,4,6,7,8,9,1,3,4,2,6,3,7,4};

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a positive number as index: ");
        int index=scanner.nextInt();
        System.out.println("values in the desired index");

        try {
            System.out.println(str.charAt(index));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("outside the bounds of the given index String");
        }
        try {
            System.out.println(numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("outside the bounds of the given index String");
        }

        try {
            System.out.println("values in the desired index"+str.charAt(index) + numbers[index]);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("outside the bounds of the given index String");
        }catch ( ArrayIndexOutOfBoundsException e){
            System.out.println("outside the bounds of the given index Array");
        }

        try {
            System.out.println("values in the desired index"+str.charAt(index) + numbers[index]);
        } catch (Exception e) {
            System.out.println("outside the bounds of the given index input");
        }
    }
}
