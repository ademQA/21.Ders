package day05_ifElse_Statements;

import java.util.Scanner;

public class C06_İsStatementexemples {
    public static void main(String[] args) {
        //Question 5- Get a note from the user "Pass the Class" if 50 or more,
        // If less than 50, print "Sorry you failed".
        Scanner scanner=new Scanner(System.in);
        System.out.println("input your point, please:");
        int point= scanner.nextInt();
        if (point>=50)
            System.out.println("you passed");
        else
            System.out.println("you failed");
    }
}
