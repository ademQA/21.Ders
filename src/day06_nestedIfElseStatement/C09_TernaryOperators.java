package day06_nestedIfElseStatement;

import java.util.Scanner;

public class C09_TernaryOperators {
    public static void main(String[] args) {
        //Question 6- Get a number from the user and print its absolute value
        Scanner scanner=new Scanner(System.in);
        System.out.println("please,input number:");
        int number=scanner.nextInt();
        System.out.println(number>0? number:number*(-1) );
    }
}
