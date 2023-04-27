package day07_switchStatement_StringManupulation;

import java.util.Scanner;

public class C04_SwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the integer you want to display with text:");
        int enteredNumber = scanner.nextInt();
        if ( enteredNumber<-99 || ( enteredNumber>-10 && enteredNumber<10) || enteredNumber>=100)
            System.out.println("You did not enter a two-digit integer");
        else {
            if (enteredNumber<0) {
                System.out.print("negative");
                enteredNumber*=-1;
            }
            switch (enteredNumber/10) {
                case 1:
                    System.out.print("ten");
                    break;
                case 2:
                    System.out.print("twenty");
                    break;
                case 3:
                    System.out.print("thirty");
                    break;
                case 4:
                    System.out.print("forty");
                    break;
                case 5:
                    System.out.print("fifty");
                    break;
                case 6:
                    System.out.print("sixty");
                    break;
                case 7:
                    System.out.print("seventy");
                    break;
                case 8:
                    System.out.print("eighty");
                    break;
                case 9:
                    System.out.print("ninety");
                    break;
            }
            switch (enteredNumber%10) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
        }
    }
}
