package day09_stringManipulation_forloop;

import java.util.Scanner;

public class C16_ForLoop_Modules {
    public static void main(String[] args) {
        //295 / 5.000
        //Çeviri sonuçları
        //Çeviri sonucu
        //Question 8 (interview)- Get a positive number from the user, print all integers starting from 1, order
        //- If it comes to a number that is divisible by 3, fizz instead of a number -
        // If it comes to a number that is divisible by 5, buzz instead of a number
        //- if a number is divisible by both 3 and 5, print fizzBuzz instead of number
        Scanner scanner=new Scanner(System.in);
        System.out.println("input integer:");
        int number= scanner.nextInt();
        for (int i=1;i<=number;i++){
            if (i%3==0 && i%5==0){
                System.out.print("fizzBuzz ");
            }else if (i%5==0){
                System.out.print("buzz ");
            }else if (i%3==0){
                System.out.print("fizz ");
            }else {
                System.out.print( i+" " );
        }

    }
}}
