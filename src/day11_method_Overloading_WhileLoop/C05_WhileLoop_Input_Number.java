package day11_method_Overloading_WhileLoop;

import java.util.Scanner;

public class C05_WhileLoop_Input_Number {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int number=1;
        while (number%3!=0){
            System.out.println("input number:");
            number=scanner.nextInt();
            if (number%3==0)
                System.out.println("entered "+number+" number is divided by 3 ");
            else System.out.println("entered "+number+" number is not divided by 3 ");
        }
    }
}
