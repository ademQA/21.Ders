package day03_dataCasting_WrapperClasses;

import java.util.Scanner;

public class C04_DataCastingExemple {
    public static void main(String[] args) {
        //Question 2- Take a character from the user and print the next 3 letters in the alphabet.
        Scanner scanner=new Scanner(System.in);
        System.out.println("input one character");
        char chr=scanner.next().charAt(0);
        System.out.println((char)(chr+1)+" "+(char) (chr+2)+" "+(char) (chr+3));
    }
}
