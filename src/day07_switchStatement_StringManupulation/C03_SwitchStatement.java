package day07_switchStatement_StringManupulation;

import java.util.Scanner;

public class C03_SwitchStatement {
    public static void main(String[] args) {
        //Question 1- Get a number from the user and print the number in writing.
        Scanner scanner=new Scanner(System.in);
        System.out.println("please input a number:");
        int number= scanner.nextInt();
        switch (number){
            case 1:
                System.out.println("one");break;
            case 2:
                System.out.println("two");break;
            case 3:
                System.out.println("three");break;
            case 4:
                System.out.println("four");break;
            case 5:
                System.out.println("five");break;
            case 6:
                System.out.println("six");break;
            case 7:
                System.out.println("seven");break;
            case 8:
                System.out.println("eight");break;
            case 9:
                System.out.println("nine");break;
            case 0:
                System.out.println("zero");break;
            default:
                System.out.println("invalid number");
        }
    }
}
