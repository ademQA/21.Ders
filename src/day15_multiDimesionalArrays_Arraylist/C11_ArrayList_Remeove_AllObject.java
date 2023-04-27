package day15_multiDimesionalArrays_Arraylist;

import java.util.ArrayList;
import java.util.List;

public class C11_ArrayList_Remeove_AllObject {
    public static void main(String[] args) {
        int[] number={3,5,6,3,1,2,5,7,5,3,4,2,3,5,6};
        List<Integer> newlist=new ArrayList<>();
        for (int i = 0; i <number.length ; i++) {
            newlist.add(number[i]);
        }
        System.out.println(newlist); //[3, 5, 6, 3, 1, 2, 5, 7, 5, 3, 4, 2, 3, 5, 6]
        Integer deleteobjeckt =5;
        while (newlist.contains(deleteobjeckt)){
            newlist.remove(deleteobjeckt);
        }
        System.out.println(newlist); //[3, 6, 3, 1, 2, 7, 3, 4, 2, 3, 6]
    }
}
