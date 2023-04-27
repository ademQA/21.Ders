package day12_dowhileLoop_Scop;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {
        // get the number values from the user and add them
        // the process ends when the user presses 0
        // and print the sum
        Scanner scanner=new Scanner(System.in);
        int number;
        int total=0;
        do {
            System.out.println("input number to sum :\npress 0 to finish ");
            number= scanner.nextInt();
            total+=number;
        }while (number!=0);
        System.out.println("total of entered numbers: "+total);
    }
}
