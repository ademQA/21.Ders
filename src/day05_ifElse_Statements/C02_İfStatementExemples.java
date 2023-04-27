package day05_ifElse_Statements;

import java.util.Scanner;

public class C02_İfStatementExemples {
    public static void main(String[] args) {
        //Question 2- Get a letter from the user, if there is a month that starts with a letter, print it. NOTE: No uppercase or lowercase sensitivity.
        // When the user types j or J, the output will be January.
        Scanner scanner=new Scanner(System.in);
        System.out.println("please input the first letter of the Month you want to print:");
        char firstletter=scanner.next().toUpperCase().charAt(0);
        if (firstletter=='J') System.out.println("January,June,July");
        if (firstletter=='F') System.out.println("February");
        if (firstletter=='M') System.out.println("March,May");
        if (firstletter=='A') System.out.println("April,August");
        if (firstletter=='S') System.out.println("September");
        if (firstletter=='O') System.out.println("October");
        if (firstletter=='N') System.out.println("November");
        if (firstletter=='D') System.out.println("December");

    }
}
