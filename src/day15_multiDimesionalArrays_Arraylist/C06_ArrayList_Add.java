package day15_multiDimesionalArrays_Arraylist;

import day13_array.C13_Array_Input_Method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_ArrayList_Add {
    public static void main(String[] args) {
        int[] arr={3,5,6};
        arr= C13_Array_Input_Method.arrayAdd(arr);
        System.out.println(Arrays.toString(arr));

        List<Integer>arrlist=new ArrayList<>();
        arrlist.add(3);
        arrlist.add(5);
        arrlist.add(6);
        System.out.println(arrlist);

    }
}
