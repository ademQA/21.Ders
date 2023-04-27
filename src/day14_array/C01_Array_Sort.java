package day14_array;

import java.util.Arrays;

public class C01_Array_Sort {
    public static void main(String[] args) {
        //Print the largest and smallest element of the array using the method.
        int[] arr = {4, 6, 3, 2, 5, 7, 8, 9, 6, 43, 4, 32, 21, 2, 3};
        System.out.println(Arrays.toString(arr));
        minMaxWrite(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void minMaxWrite(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Minimum element of array:  "+arr[0]);
        System.out.println("Maximum element of array:  "+arr[arr.length-1]);
    }
}