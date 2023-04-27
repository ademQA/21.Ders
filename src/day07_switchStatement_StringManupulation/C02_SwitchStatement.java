package day07_switchStatement_StringManupulation;

import java.util.Scanner;

public class C02_SwitchStatement {
    public static void main(String[] args) {
        //Question 2- Get the month number from the user,
        // print in which season that month is
        Scanner scanner=new Scanner(System.in);
        System.out.println("please input number of the Month you want to print:");
        int numberMonth=scanner.nextInt();

        switch (numberMonth){
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Aunt");
                break;
            default:
                System.out.println("invalid month");
        }


    }
}
