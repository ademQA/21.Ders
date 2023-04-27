package day13_array;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        String [] arr1={"Ayten","Sevda","Adem"};
        System.out.println(Arrays.toString(arr1));
        System.out.println(arr1.length);
        int[] arr2=new int[6];
        System.out.println(Arrays.toString(arr2));
        arr2[0]=5;
        arr2[3]=9;
        arr2[4]=1;
        System.out.println(Arrays.toString(arr2));

    }
}
