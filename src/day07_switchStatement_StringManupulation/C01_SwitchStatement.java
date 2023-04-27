package day07_switchStatement_StringManupulation;

import java.util.Scanner;

public class C01_SwitchStatement {
    public static void main(String[] args) {
        //Question 2- Get a letter from the user, if there is a month that starts with a letter, print it. NOTE: No uppercase or lowercase sensitivity.
        // When the user types j or J, the output will be January.
        Scanner scanner=new Scanner(System.in);
        System.out.println("please input the first letter of the Month you want to print:");
        char firstletter=scanner.next().toUpperCase().charAt(0);

        switch (firstletter){
            case 'J':
                System.out.println("January,June,July");
                break;
            case 'F':
                System.out.println("February");
                break;
            case 'M':
                System.out.println("March,May");
                break;
            case 'A':
                System.out.println("April,August");
                break;
            case 'S':
                System.out.println("September");
                break;
            case 'O':
                System.out.println("October");
                break;
            case 'N':
                System.out.println("November");
                break;
            case 'D':
                System.out.println("December");
                break;
            default:
                System.out.println("invalid letter");
        }

    }
}
