package day02_dataType_Scanner;

import java.util.Scanner;

public class C09_ScannerExemple {
    public static void main(String[] args) {
        // Get values in three different data types from the user,
        // print the entered values with their comments.
        Scanner scan=new Scanner(System.in);
        System.out.println("input your name");
        String name=scan.nextLine();
        System.out.println("input your age");
        int age=scan.nextInt();
        System.out.println("input your gender");
        char gender=scan.next().charAt(0);
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("gender:"+gender);
    }
}
