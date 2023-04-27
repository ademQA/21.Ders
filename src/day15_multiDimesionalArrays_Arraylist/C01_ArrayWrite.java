package day15_multiDimesionalArrays_Arraylist;

import java.util.Arrays;

public class C01_ArrayWrite {
    public static void main(String[] args) {
        int[][] arr={{1,5,9},{3,4},{2,8,1,2,},{10}};
        System.out.println(arr[0][0]);//1
        System.out.println(arr.length);//4
        System.out.println(arr[2].length);//4
        System.out.println(arr[3].length);//1
        System.out.println(Arrays.toString(arr[2]));//[2, 8, 1, 2]
        System.out.println(Arrays.toString(arr[3]));//[10]
        System.out.println(Arrays.toString(arr));//[[I@511d50c0, [I@60e53b93, [I@5e2de80c, [I@1d44bcfa]
        System.out.println(Arrays.deepToString(arr));//[[1, 5, 9], [3, 4], [2, 8, 1, 2], [10]]
    }
}
