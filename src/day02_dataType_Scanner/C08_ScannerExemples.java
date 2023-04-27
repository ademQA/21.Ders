package day02_dataType_Scanner;

import java.util.Scanner;

public class C08_ScannerExemples {
    public static void main(String[] args) {
        //Question 7 (Interview)- Take two numbers from the user and change their values (swap).
        Scanner scan=new Scanner(System.in);
        System.out.println("input first number:");
        double number1=scan.nextDouble();
        System.out.println("input second number:");
        double number2=scan.nextDouble();
        double temporary=number2;
        number2=number1;
        number1=temporary;
        System.out.println(number1);
        System.out.println(number2);
    }
}
