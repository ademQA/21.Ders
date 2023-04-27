package day09_stringManipulation_forloop;

import java.util.Scanner;

public class C06_Forloop_Modulus {
    public static void main(String[] args) {
        // get two numbers from the user and include these numbers
        // print numbers that are divisible by 3
        // print an error message if the first entered number is greater than the second entered number
        Scanner scanner=new Scanner(System.in);
        System.out.println("input first number:");
        int firstnumber=scanner.nextInt();
        System.out.println("input second number:");
        int secondnumber=scanner.nextInt();
        if (firstnumber>secondnumber){
            System.out.println("fail,incorrect entry");
        }
        for (int i=firstnumber;i<=secondnumber;i++){
            if (i%3==0)
                System.out.println(i);
        }
    }
}
