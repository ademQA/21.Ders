package day13_array;

public class C04_Array_Odd_Number {
    public static void main(String[] args) {
//Write a program to find the odd numbers in the array
        int[] arr={2,4,6,8,1,3,8,2};
        int counter=0;
        for (int i = 0; i < arr.length; i++) {
           if (arr[i]%2==1)
               counter++;
        }System.out.println(counter);
    }
}
