package day09_stringManipulation_forloop;

import java.util.Scanner;

public class C01_StringManipulation_Contains {
    public static void main(String[] args) {
        //post 1 : Get a sentence from the user
        // - if the sentence contains house, print “home sweet home”
        // - if there is work in the sentence, “it is good to work”
        // - if it includes both “Need a house and a business”
        // - print "you need to work hard" if it doesn't contain any
        Scanner scanner=new Scanner(System.in);
        System.out.println("input a sentence");
        String sentence=scanner.nextLine().toLowerCase();
        if (sentence.contains("home")&&sentence.contains("work")){
            System.out.println("both home and work required");
        } else if (sentence.contains("home")) {
            System.out.println("home home sweet home");
        } else if (sentence.contains("work")) {
            System.out.println("working is good");
        }else {
            System.out.println("you should work very hard");
        }

    }
}
