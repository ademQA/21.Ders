package day12_dowhileLoop_Scop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        //Question 3- Ask the user for a positive number, find out if the number is a perfect square,
        // print false if it is true if it is a perfect square.
        //  Example : input : 16, output: 4
        Scanner scanner=new Scanner(System.in);
        System.out.println("input positive integer: ");
        int number= scanner.nextInt();
         int squareRoot=2;
         boolean isSquarePerfect=false;
         do {
             if (number==squareRoot*squareRoot){
                 isSquarePerfect=true;
             }else
                 squareRoot++;
         }while (number>=squareRoot*squareRoot);
        System.out.println(isSquarePerfect);
    }
}
