package day11_method_Overloading_WhileLoop;

import java.util.Scanner;

public class C06_WhileLoop_Total {
    public static void main(String[] args) {
        // Get numbers to collect from user
// if the total is 500 or exceeds, it will stop getting value and
// print how many numbers are entered and what is the total
        Scanner scanner=new Scanner(System.in);
        int count=0;
        int total=0;
        int number;
        while (total<=500){
            System.out.println("input number:");
            number= scanner.nextInt();
            total+=number;
            count++;
        }
        System.out.println("total of entered numbers:"+total);
        System.out.println("piece of entered of number:"+count);
    }
}
