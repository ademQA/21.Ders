package day09_stringManipulation_forloop;

import java.util.Scanner;

public class C15_ForLoop_Modules {
    public static void main(String[] args) {
        //Question 2-Get a positive integer from the user,
        // print numbers divisible by 7 from 1 to the entered number (including the entered number).
        Scanner scanner=new Scanner(System.in);
        System.out.println("input number:");
        int number= scanner.nextInt();
        for (int i=1;i<=number;i++){
            if (i%7==0){
                System.out.println(i);
            }
        }
    }
}
