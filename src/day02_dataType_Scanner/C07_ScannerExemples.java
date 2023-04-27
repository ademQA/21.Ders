package day02_dataType_Scanner;

import java.util.Scanner;

public class C07_ScannerExemples {
    public static void main(String[] args) {
        //Question 5- Get the user's name, surname and age
        // print in the following format. Entered information: J Doe, 44
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your name, surname and age respectively:");
        char name=scan.nextLine().toUpperCase().charAt(0);
        String surname=scan.nextLine();
        short age=scan.nextShort();
        System.out.println(name+" "+surname+", "+age);
    }
}
