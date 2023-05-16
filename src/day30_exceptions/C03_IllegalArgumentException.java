package day30_exceptions;

import java.util.Scanner;

public class C03_IllegalArgumentException {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input your age: ");
        int age= scanner.nextInt();

        try {
            if (age<20){
                throw new IllegalArgumentException("age cannot be younger than 20");

            } else if (age<65) {
                System.out.println("you have "+(65-age)+" years to retire");
            }else {
                System.out.println("you can retire");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
