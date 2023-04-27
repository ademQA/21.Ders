package day06_nestedIfElseStatement;

import java.util.Scanner;

public class C10_NestedIfElseStatement {
    public static void main(String[] args) {
        //Question 3- Get a number from the user, if the number is odd,
        // print it out if it is a negative or positive odd number,
        // if the number is an even number, print whether it is a multiple of 10.
        Scanner scanner=new Scanner(System.in);
        System.out.println("please,input a number:");
        int number=scanner.nextInt();
        if (number%2!=0){
          if (number>0){
              System.out.println("positive number"+number);
          }
          else {
              System.out.println("negative number"+number);
          }
        }else {if (number%10==0){
            System.out.println("number is exactly divided by 10");
        }else {
            System.out.println("number isn't exactly divided by 10");
        }

        }
    }
}
