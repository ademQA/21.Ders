package day11_method_Overloading_WhileLoop;

import java.util.Scanner;

public class C07_WhileLoop_Password {
    public static void main(String[] args) {
        //Ask the user for a password that meets the following requirements
        //     Require password again until user enters appropriate password
        //
        //     check the password in a method
        //     true if password is ok
        //     if not freeze false
        //
        //     - first letter must be lowercase
        //     - last character must be a number
        //     - password must not contain spaces
        //     - must be at least 10 characters in length

        Scanner scanner=new Scanner(System.in);
        String password="";
        boolean isTruePassword=false;
        while (!isTruePassword){
            System.out.println("input your password: ");
            password= scanner.nextLine();
            isTruePassword=passwordControl(password);
            System.out.println("your password has been successfully saved");
        }
    }

    public static boolean passwordControl(String password) {

        int counter=0;
        char firstletter=password.charAt(0);
        if (!(firstletter>='a' && firstletter<='z')){
            System.out.println("first letter should be lower case");
            counter++;
        }
        char lastletter=password.charAt(password.length()-1);
        if (!(lastletter>='0'&& lastletter<='9')){
            System.out.println("last letter should be number");
            counter++;
        }
        if (password.contains(" ")){
            System.out.println("password do not include space");
            counter++;
        }
        if (password.length()<10){
            System.out.println("password must be ten character lest");
            counter++;
        }
        if (counter==0){
            return true;
        }else
        return false;
    }
}
