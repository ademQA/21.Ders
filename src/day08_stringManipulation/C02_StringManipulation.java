package day08_stringManipulation;

import java.util.Scanner;

public class C02_StringManipulation {
    public static void main(String[] args) {
        //QUESTION: Receive an e-mail from the user
        // - "invalid mail" if mail does not contain @
        // - if mail does not contain @gmail.com, "mail must be gmail"
        // - If mail does not end with @gmail.com, print "mail has a typo".
        Scanner scanner=new Scanner(System.in);
        System.out.println("please, input your email");
        String email= scanner.nextLine();
        if (!email.contains("@")){
            System.out.println("incorrect email");
        }
        if (!email.contains("@gmail.com")){
            System.out.println("email must be gmail");
        }
        if (!email.endsWith("@gmail.com")){
            System.out.println("mail has a typo");
        }
    }
}
