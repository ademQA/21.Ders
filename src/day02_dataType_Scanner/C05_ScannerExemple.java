package day02_dataType_Scanner;

import java.util.Scanner;

public class C05_ScannerExemple {
    public static void main(String[] args) {
        //Question 2- Get a double and an int number from the user
        // print their sum and product.
        Scanner scan=new Scanner(System.in);
        System.out.println("input decimal number:");
        double number1=scan.nextDouble();
        System.out.println("input integer:");
        int number2= scan.nextInt();
        System.out.println("total="+(number2+number1));
        System.out.println("multiplication="+number1*number2);
    }
}
