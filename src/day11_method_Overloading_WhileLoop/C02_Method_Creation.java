package day11_method_Overloading_WhileLoop;

import java.util.Scanner;

public class C02_Method_Creation {
    public static void main(String[] args) {
        //Question 4- Get an integer from the user in the main method.
        // Create a method that finds the number of positive integers of the entered number and returns it to us.

        Scanner scanner=new Scanner(System.in);
        System.out.println("İnput positive integer");
        int number= scanner.nextInt();
        System.out.println(positiveDividedNumberFind(number));
    }
    public static int positiveDividedNumberFind(int number){
        int counter=0;
        for (int i = 1; i <=number; i++) {
            if (number%i==0) {
                counter++;
            }
        }return counter;
    }
}
