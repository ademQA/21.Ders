package day15_multiDimesionalArrays_Arraylist;

import java.util.ArrayList;
import java.util.List;

public class C12_Arrays_set {
    public static void main(String[] args) {
        int[] number={3,5,6,3,1,2,5,7,5,3,4,2,3,5,6};
        List<Integer> newlist=new ArrayList<>();
        for (int i = 0; i <number.length ; i++) {
            newlist.add(number[i]);
        }
        System.out.println(newlist); //[3, 5, 6, 3, 1, 2, 5, 7, 5, 3, 4, 2, 3, 5, 6]
        System.out.println(newlist.set(0,10)); //3
        System.out.println(newlist); //[10, 5, 6, 3, 1, 2, 5, 7, 5, 3, 4, 2, 3, 5, 6]
    }
}
