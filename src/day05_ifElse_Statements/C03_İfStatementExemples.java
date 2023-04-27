package day05_ifElse_Statements;

import java.util.Scanner;

public class C03_İfStatementExemples {
    public static void main(String[] args) {
        //Question 3- Get a number from the user, if the number is divisible by 3, "Number divisible by three",
        // If divisible by 5, print “Number divisible by five”.
        Scanner scanner=new Scanner(System.in);
        System.out.println("please input integer:");
       int enteredNumber=scanner.nextInt();
       if (enteredNumber%15==0)
           System.out.println("entered number is divided 15 ");
        if (enteredNumber%5==0)
            System.out.println("entered number is divided 5 ");
        if (enteredNumber%3==0)
            System.out.println("entered number is divided 3 ");
    }
}
