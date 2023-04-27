package day09_stringManipulation_forloop;

import java.util.Scanner;

public class C03_StringManipulation_toUpperCase {
    public static void main(String[] args) {
        //Question 5: Get the user's name and surname separately.
        // - if the name is longer, print the first letter and last name in uppercase and lowercase
        // - if the last name is longer, print the first letter in capital letters, the others in small letters,
        // and the last name in capital letters.
        Scanner scanner=new Scanner(System.in);
        System.out.println("input name:");
        String name= scanner.nextLine();

        System.out.println("input surname:");
        String surname= scanner.nextLine();
        if (name.length()>surname.length()){
            name=name.toUpperCase().charAt(0)+name.substring(1).toLowerCase();
            surname=surname.toUpperCase().charAt(0)+surname.substring(1).toLowerCase();
        }else {
            name=name.toUpperCase().charAt(0)+name.substring(1).toLowerCase();
            surname=surname.toLowerCase();
        }
        System.out.println(name+" "+surname);
    }
}
