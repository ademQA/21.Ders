package day15_multiDimesionalArrays_Arraylist;

import java.util.Arrays;

public class C05_MultiDimension_Array_Commen_Index {
    public static void main(String[] args) {
        int[][] arr={{3,4,5},{2,3,6,7}};
        int length=arr[0].length<arr[1].length ? arr[0].length : arr[1].length;
        int[] partnerElementArray=new int[length];
        for (int i = 0; i < partnerElementArray.length; i++) {
           partnerElementArray[i]=arr[0][i]+arr[1][i];
        }
        System.out.println(Arrays.toString(partnerElementArray));
    }
}
