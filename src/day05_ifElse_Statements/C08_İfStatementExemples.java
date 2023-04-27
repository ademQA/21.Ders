package day05_ifElse_Statements;

import java.util.Scanner;

public class C08_İfStatementExemples {
    public static void main(String[] args) {
      //Question 4- Ask the user to enter a character,
        //print whether the entered character is uppercase.
        Scanner scanner=new Scanner(System.in);
        System.out.println("please input a character:");
        char enteredCharacter=scanner.next().charAt(0);
        if (enteredCharacter>='A' && enteredCharacter<='Z')
            System.out.println("big character");
        else System.out.println("little character");
    }
}
