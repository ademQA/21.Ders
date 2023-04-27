package day03_dataCasting_WrapperClasses;

import java.util.Scanner;

public class C05_DataCastingExemples {
    public static void main(String[] args) {
        //Question 3- Get a number from the user, no matter how many values the user enters,
        // it will be -128.Convert to a number between 127 and print it.
        Scanner scanner=new Scanner(System.in);
        System.out.println("input integer");
        int number= scanner.nextInt();
        System.out.println((byte)number);
    }
}
