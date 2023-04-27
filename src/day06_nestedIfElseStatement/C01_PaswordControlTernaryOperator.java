package day06_nestedIfElseStatement;

import java.util.Scanner;

public class C01_PaswordControlTernaryOperator {
    public static void main(String[] args) {
        //Ask the user to enter a number
        //             Print "Perfect Number" if the number satisfies the following 4 conditions
        //             Tell the user all unfulfilled terms
        //             1- the number must be 4 digits
        //             2- the number must be divisible by 3
        //             3- the number cannot be divided by 5
        //             4- the ones digit of the number must be an odd number
        Scanner scanner=new Scanner(System.in);
        System.out.println("please,input 4 digit integer");
        int number= scanner.nextInt();
       boolean bl=true;

        if (number<1000 || number>9999) {
            System.out.println("number must be 4 digit");
           bl=false;}
        if (number%3!=0) {
            System.out.println("number must be divided by 3");
            bl=false;}
        if (number%5==0) {
            System.out.println("number must not be divided by 5");
            bl=false;}
        if (number%2==0) {
            System.out.println("first digit of number must be odd number");
            bl=false;}
        if (bl){
            System.out.println("number is wonderful");
        }
    }

}
