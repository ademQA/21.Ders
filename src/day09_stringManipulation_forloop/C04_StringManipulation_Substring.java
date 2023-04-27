package day09_stringManipulation_forloop;

import java.util.Scanner;

public class C04_StringManipulation_Substring {
    public static void main(String[] args) {
        //Question 6: Take a String from the user, if the length of the String is an even number, add :) to the middle,
        // If the length of the string is odd, delete the middle letter and replace it with :disappointed:.

        Scanner scanner=new Scanner(System.in);
        System.out.println("input text:");
        String text=scanner.nextLine();
        if (text.length()%2==0){
            text=text.substring(0,text.length()/2)+":)"+text.substring(text.length()/2);
        }else {
            text=text.substring(0,text.length()/2)+":("+text.substring(1+text.length()/2);
        }
        System.out.println(text);
    }
}
