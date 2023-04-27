package day03_dataCasting_WrapperClasses;

import java.util.Scanner;

public class C06_DataCastingExemples {
    public static void main(String[] args) {
        //Question 4- Get two double numbers from the user,
        // divide the first number by the second number and
        // print the integer part of the result of the division operation.
        Scanner scanner=new Scanner(System.in);
        System.out.println("input double number");
        double dbl1=scanner.nextDouble();
        System.out.println("input another double number");
        double dbl2=scanner.nextDouble();
        System.out.println((int)(dbl1/dbl2) );
    }
}
