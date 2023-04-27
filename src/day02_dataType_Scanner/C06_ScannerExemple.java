package day02_dataType_Scanner;

import java.util.Scanner;

public class C06_ScannerExemple {
    public static void main(String[] args) {
        //Question 3- Taking the user's name, surname and age,
        // print in the format below.
        // Your name: John
        // Your last name: Doe
        // Your age : 44
        // Your registration has been successfully completed.
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your name, surname and age respectively:");
        String name=scan.nextLine();
        String surname=scan.nextLine();
        short age=scan.nextShort();
        System.out.println("name:"+name);
        System.out.println("surname"+surname);
        System.out.println("age:"+age);
        System.out.println("Your registration has been successfully completed.");
    }
}
