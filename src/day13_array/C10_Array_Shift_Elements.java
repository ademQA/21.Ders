package day13_array;

import java.util.Arrays;

public class C10_Array_Shift_Elements {
    public static void main(String[] args) {
        //Create a method that will shift all the elements in a given array one right and
        // move the last element to the beginning, save the array as new.
        //Orn : input : [4,5,6,7] is the final state of the array. : [7,4,5,6]
        int[] arr={4,5,6,7};

        arr=(reverseArray(arr));
        System.out.println(Arrays.toString(arr));
    }
    public static int[] reverseArray(int[] arr){

            int temp= arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
            return arr;

    }
}
