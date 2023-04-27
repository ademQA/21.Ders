package day07_switchStatement_StringManupulation;

import java.util.Scanner;

public class C13_SwitchStatement {
    public static void main(String[] args) {
        //Get the day number from the user and print whether it is weekday or weekend
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please, input day number:");
        int dayNumber= scanner.nextInt();
        switch (dayNumber){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");break;
            case 6:
            case 7:
                System.out.println("Weekend");break;
            default:
                System.out.println("incorrect day number");

        }
    }
}
