package day05_ifElse_Statements;

import java.util.Scanner;

public class C09_İfStatementExemples {
    public static void main(String[] args) {
      //  Question 5- Ask the user for a letter,
       // if the entered character is lowercase, print it in uppercase, otherwise print the entered letter
        Scanner scanner=new Scanner(System.in);
        System.out.println("please input a character:");
        char enteredCharacter=scanner.next().charAt(0);
        if (enteredCharacter>='a' && enteredCharacter<='z'){
            System.out.println(Character.toUpperCase(enteredCharacter));
        }
        else {
            System.out.println(enteredCharacter);
        }
    }
}
