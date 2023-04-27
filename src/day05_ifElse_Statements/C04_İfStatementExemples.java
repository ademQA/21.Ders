package day05_ifElse_Statements;

import java.util.Scanner;

public class C04_İfStatementExemples {
    public static void main(String[] args) {
        //How many of the numbers 2,3,5,7,11, and 23 of a given number are without a remainder?
        // write that it is divisible as
        Scanner scanner=new Scanner(System.in);
        System.out.println("input integer,please:");
        int enteredNumber= scanner.nextInt();
        int flag=0;
        if (enteredNumber%2==0) flag++;
        if (enteredNumber%3==0) flag++;
        if (enteredNumber%5==0) flag++;
        if (enteredNumber%7==0) flag++;
        if (enteredNumber%11==0) flag++;
        if (enteredNumber%23==0) flag++;
        System.out.println("entered number is divided by "+flag + "  different number");
    }


}
