package day29_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

// Get integer to collect from user
// If the user does not enter an integer, give an error message and request an integer again
// user will press Q or q to finish the process
// when the user finishes the process
// print how many valid numbers are entered and what is the sum of these numbers
public class C04_tryCatch {
    public static void main(String[] args) {
        int number=0;
        int total=0;
        int counter=0;
        boolean isNumber=true;
        String choise="";
        Scanner scanner=new Scanner(System.in);

        while (isNumber){
            System.out.println("input integer number for sub: ");
            try {
                number=scanner.nextInt();
                total+=number;
                counter++;
            } catch (InputMismatchException e) {
               choise=scanner.next();
               if (choise.equalsIgnoreCase("q")){
                   break;
               }else {
                   System.out.println("you should integer number to sub");
               }
            }
        }
        System.out.println("Total: "+counter+" piece numbers are entered. Totol of numbers is: "+total);
    }
}
