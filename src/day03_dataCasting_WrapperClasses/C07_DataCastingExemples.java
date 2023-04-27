package day03_dataCasting_WrapperClasses;

import java.util.Scanner;

public class C07_DataCastingExemples {
    public static void main(String[] args) {
        //Question 5- Get a double, an integer from the user,
        // Divide the double number by the second number and
        // print the integer part of the result of the division operation.
        Scanner scanner=new Scanner(System.in);
        System.out.println("input double number");
        double dbl1=scanner.nextDouble();
        System.out.println("input integer");
        int number=scanner.nextInt();
        System.out.println((int)(dbl1/number));
       
    }
}
