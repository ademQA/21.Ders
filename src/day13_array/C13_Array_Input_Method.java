package day13_array;

import java.util.Arrays;
import java.util.Scanner;

public class C13_Array_Input_Method {
    public static void main(String[] args) {
        //Question 7-
        //Create a method that increments all the elements of a given int array by 2 and returns it to us.
        // Save the old array as it is new.
        //Write a method that adds the positive integers in a given array and returns the result to us.
        //Create a method that will shift all the elements in a given array one right and
        // move the last element to the beginning, save the array as new.
        int[] arr={2,4,6,8,1,3,8,2};
        System.out.println(Arrays.toString(arrayAdd(arr)));
    }
    public static int[] arrayAdd(int[] array){
        Scanner scanner=new Scanner(System.in);
        int elementAdd;
        int arrsize=array.length+1;
        int[] newarr=new int[arrsize];
        for (int i = 0; i < array.length; i++) {
            newarr[i]=array[i];
        }
        System.out.println("please enter the value to add: ");
        elementAdd= scanner.nextInt();
        newarr[arrsize-1]=elementAdd;
        array=newarr;
return array;
    }
}
