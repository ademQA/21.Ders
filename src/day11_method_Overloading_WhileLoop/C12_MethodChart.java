package day11_method_Overloading_WhileLoop;

import java.util.Scanner;

public class C12_MethodChart {
    public static void main(String[] args) {

        //Question 2- Get the user's first and last name separately in the main method
        //Create a method that arranges the first letters of the name and
        // surname in capital letters and the other letters in small letters, and returns it to us as name,
        // space and surname.
        //input : name : Ali surname :YILMAZ. output : Ali Yilmaz

        Scanner scanner=new Scanner(System.in);
        System.out.println("input your name:");
        String name=scanner.nextLine();
        System.out.println("input your surname:");
        String surname=scanner.nextLine();
        nameSurnameWrite( name, surname);
        System.out.println(nameSurnameWrite(name, surname));
    }

    public static String nameSurnameWrite(String name, String surname) {
        name=name.toLowerCase();
        char nameFirstLetter=(name.substring(0,1).toUpperCase().charAt(0));
        name=nameFirstLetter+name.substring(1);

        surname=surname.toLowerCase();
        char surnameFirstLetter=surname.substring(0,1).toUpperCase().charAt(0);
        surname=surnameFirstLetter+surname.substring(1);

        String nameSurname=name+" "+surname;
        return nameSurname;
    }

}
