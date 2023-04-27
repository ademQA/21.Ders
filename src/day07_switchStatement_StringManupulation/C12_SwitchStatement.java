package day07_switchStatement_StringManupulation;

import java.util.Scanner;

public class C12_SwitchStatement {
    public static void main(String[] args) {
        //Get what the user wants to learn the meaning of the letter from the ISTQB abbreviation
        // and print the equivalent of the entered letter
        //I:International  S:Software T:Testing  Q:Qualification B:Boarding
        Scanner scanner=new Scanner(System.in);
        System.out.println("input you want to learn letter of word:");
        String letter=scanner.nextLine().toUpperCase();
        switch (letter){
            case "I":
                System.out.println("International");break;
            case "S":
                System.out.println("Software");break;
            case "T":
                System.out.println("Testing");break;
            case "Q":
                System.out.println("Qualification");break;
            case "B":
                System.out.println("Boarding"); break;
            default:
                System.out.println("incorrect letter");
        }
    }
}
