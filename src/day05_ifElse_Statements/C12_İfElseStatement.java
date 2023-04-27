package day05_ifElse_Statements;

import java.util.Scanner;

public class C12_İfElseStatement {
    public static void main(String[] args) {
        // Question 3- Get a number from the user,
        // if the number is divisible by 3 "Number divisible by three",
        // If divisible by 5, print "Number divisible by five".
        // Print SUPER if dividing by both 3 and 5
        Scanner scanner=new Scanner(System.in);
        System.out.println("please input integer:");
        int enteredNumber=scanner.nextInt();
        if (enteredNumber%5==0 && enteredNumber%3==0)
            System.out.println("SUPER ");
        else if (enteredNumber%5==0) {
            System.out.println("entered number is divided 5 ");
        }else if (enteredNumber%3==0){
            System.out.println("entered number is divided 3 ");
    }}
}
