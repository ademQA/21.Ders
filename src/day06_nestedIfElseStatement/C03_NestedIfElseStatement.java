package day06_nestedIfElseStatement;

import java.util.Scanner;

public class C03_NestedIfElseStatement {
    public static void main(String[] args) {
        //Question 1- Get the gender and age from the user. Female, 60 years old and over,
        // Men 65 years and older can retire.Print “You can retire” or
        // “You need to work ... more years to retire”, taking into account gender and age
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your gender:, \nfor Male : M, for Female F");
        char gender = scanner.next().toUpperCase().charAt(0);
        System.out.println("Please input your age:");
        int age = scanner.nextInt();
        if (age<10 || age>80)
        {System.out.println("incorrect age");}

        else if (age<60) {
        if (gender!='M'&& gender!='F'){
            System.out.println("incorrect gender");
        } else if (gender=='M') {
            System.out.println("The Man should work until the age of 65, you have to work more " +(65-age)+ "years");
        }else {
            System.out.println("The woman should work until the age of 60, you have to work more  " +(60-age)+ " years");
        }
        }
        else if (age<=65)
        {if (gender!='M'&& gender!='F'){
            System.out.println("incorrect gender");
        } else if (gender=='M') {
            System.out.println("The Man should work until the age of 65, you have to work more " +(65-age)+ "years");
        }else System.out.println("The Women over 60 ,can retire");

        }
        else
        {if (gender!='M'&& gender!='F'){
            System.out.println("incorrect gender");}
        else if (gender=='M') {
            System.out.println("The Men over 60 ,can retire");
        }else {
            System.out.println("The Women over 60 ,can retire");
        }

        }
        }
}
