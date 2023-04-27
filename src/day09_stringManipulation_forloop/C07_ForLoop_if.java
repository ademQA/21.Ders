package day09_stringManipulation_forloop;

public class C07_ForLoop_if {
    public static void main(String[] args) {
        // adds and prints two given numbers and all the integers between them
        // unknown which of the two numbers is smaller
        int number1=10;
        int number2=20;
        int total=0;
        if (number2>number1){
            for (int i=number1;i<=number2;i++){
                total=total+i;
            }
        }else {
            for (int i=number1;i>=number2;i--){
                total=total+i;
        }
    }
        System.out.println(total);
}}
