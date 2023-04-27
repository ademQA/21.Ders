package day04_increment_Concatenation;

import java.util.Scanner;

public class C01_PreIncrement_PostIncrement {
    public static void main(String[] args) {
        // Request an integer from the user. Print the entered integer then increment by 1
        Scanner scanner=new Scanner(System.in);
        System.out.println("please, input integer");
        int in1= scanner.nextInt();
        System.out.println(in1);
        in1++;
        //Kullanıcıdan bir sayı daha alın, bu sayıyı once artırın sonra yazdırın
        System.out.println("please, input integer");
        int in2= scanner.nextInt();
        in2++;
        System.out.println(in2);

        System.out.println(in1++);
        System.out.println(++in2);
    }
}
