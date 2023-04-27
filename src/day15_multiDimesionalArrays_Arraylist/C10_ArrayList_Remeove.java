package day15_multiDimesionalArrays_Arraylist;

import java.util.ArrayList;
import java.util.List;

public class C10_ArrayList_Remeove {
    public static void main(String[] args) {
        int[] number={3,5,6,3,1,2,5,7,5,3,4,2,3,5,6};
        List<Integer> newlist=new ArrayList<>();
        for (int i = 0; i <number.length ; i++) {
                newlist.add(number[i]);
        }
        System.out.println(newlist); //[3, 5, 6, 3, 1, 2, 5, 7, 5, 3, 4, 2, 3, 5, 6]
        System.out.println(newlist.remove(4));  //1
        System.out.println(newlist); //[3, 5, 6, 3, 2, 5, 7, 5, 3, 4, 2, 3, 5, 6]
        System.out.println(newlist.remove(8)); //3
        System.out.println(newlist); //[3, 5, 6, 3, 2, 5, 7, 5, 4, 2, 3, 5, 6]
        Integer deleteobjeckt =5;
        System.out.println(newlist.remove(deleteobjeckt)); //true
        System.out.println(newlist); //[3, 6, 3, 2, 5, 7, 5, 4, 2, 3, 5, 6]
    }
}
