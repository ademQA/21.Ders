package day09_stringManipulation_forloop;

public class C12_ForLoopTotalOfDigitNumber {
    public static void main(String[] args) {
        //Question 7- Get a positive integer from the user and print the sum of the digits.

       int number=3967;
        int numberTotal=0;
        int firstDigitOfNumber=0;
        int numberDigit=(""+number).length();
        for (int i=1;i<=numberDigit;i++){
        firstDigitOfNumber=number%10;
        numberTotal=numberTotal+firstDigitOfNumber;
        number= number/10;
        }
        System.out.println("total of number:"+numberTotal);
    }
}
