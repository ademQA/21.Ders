package day15_multiDimesionalArrays_Arraylist;

import java.util.ArrayList;
import java.util.List;

public class C07_ArrayList_Contains {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("Ayşe");
        names.add("Sevda");
        names.add("Isa");
        System.out.println(names);  //[Ayşe, Sevda, Isa]

        int[] number={3,5,6,3,1,2,5,7,5,3,4,2,3,5,6};
        List<Integer>newlist=new ArrayList<>();
        for (int i = 0; i <number.length ; i++) {
            if (!newlist.contains(number[i])){
            newlist.add(number[i]);
            }

        }System.out.println(newlist);//[3, 5, 6, 1, 2, 7, 4]

    }
}
