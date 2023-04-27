package day14_array;

import java.util.Arrays;

public class C02_Array_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 2, 5, 7, 8, 9, 6, 43, 4, 32, 21, 2, 3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 5));
        System.out.println(Arrays.binarySearch(arr, 90));
    }}
