package day09_stringManipulation_forloop;

import java.util.Scanner;

public class C02_StringManipulation_Contains {
    public static void main(String[] args) {
        //Question 4: Ask the user for a password, check the following conditions and
        // tell the user about all the deficiencies that need to be corrected, if it satisfies all the conditions,
        // print "password saved successfully"
        // - first letter must be lowercase
        // - last character must be a digit
        // - password must not contain spaces
        // - must be at least 10 characters in length
        Scanner scanner=new Scanner(System.in);
        System.out.println("input a password:");
        String pasword=scanner.nextLine();
        int counter=0;
        char firstletter=pasword.charAt(0);
        if (!(firstletter>='a' && firstletter<='z')){
            System.out.println("first letter should be lower case");
            counter++;
        }
        char lastletter=pasword.charAt(pasword.length()-1);
        if (!(lastletter>='0'&& lastletter<='9')){
            System.out.println("last letter should be number");
            counter++;
        }
        if (pasword.contains(" ")){
            System.out.println("pasword do not include space");
            counter++;
        }
        if (pasword.length()<10){
            System.out.println("password must be ten character lest");
            counter++;
        }
        if (counter==0){
            System.out.println("registration completed successfully");
        }
    }
}
