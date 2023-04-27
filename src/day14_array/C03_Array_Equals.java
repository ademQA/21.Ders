package day14_array;

import java.util.Arrays;

public class C03_Array_Equals {
    public static void main(String[] args) {
        int[] arr1={3,5,7,9};
        int[] arr2={5,7,9,3};
        int[] arr3={3,5,7,9};
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(Arrays.equals(arr1, arr3));
    }
}
