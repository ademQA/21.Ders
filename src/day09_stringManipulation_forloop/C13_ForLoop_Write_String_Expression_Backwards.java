package day09_stringManipulation_forloop;

public class C13_ForLoop_Write_String_Expression_Backwards {
    public static void main(String[] args) {
        //Question 9 (interview)- Ask the user for a String and print the String in reverse.
    String str="Java coooook guzel";
    for (int i=str.length()-1;i>=0;i--){
        System.out.print(str.substring(i,i+1));
    }
    }
}
