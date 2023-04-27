package day09_stringManipulation_forloop;

import java.util.Scanner;

public class C14_ForLoop_Write_String_Expression_Backwards {
    public static void main(String[] args) {
    //10 (interview)- Request a String from the user and reverse the String
    //save it.
       Scanner scanner=new Scanner(System.in);
        System.out.println("input String:");
       String str=scanner.nextLine();

       // String str="hele şükür bu güm ki dersi anladım";
        String oppositestr="";
        for (int i=str.length()-1;i>=0;i--){
            oppositestr=oppositestr+str.substring(i,i+1);
           // System.out.print(str.substring(i,i+1));
        }
        System.out.println(" "+oppositestr);
    }
}
