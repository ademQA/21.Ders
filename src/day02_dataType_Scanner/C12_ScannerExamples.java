package day02_dataType_Scanner;

import java.util.Scanner;

public class C12_ScannerExamples {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("input first number:");
        int number1=scan.nextInt(); //5 olsun
        System.out.println("input second number:");
        int number2=scan.nextInt(); //10 olsun
        number1=number1+number2; //5+10=15
        number2=number1-number2; //15-10=5
        number1=number1-number2; //15-5=10
        System.out.println(number1);//10
        System.out.println(number2); //5
    }
}
