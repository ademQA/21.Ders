package day15_multiDimesionalArrays_Arraylist;

import java.util.ArrayList;
import java.util.List;

public class C08_ArrayList_Get {
    public static void main(String[] args) {
        int[] number={3,5,6,3,1,2,5,7,5,3,4,2,3,5,6};
        List<Integer> numberList=new ArrayList<>();
        for (int i = 0; i < number.length; i++) {
            numberList.add(number[i]);
        }
        System.out.println(numberList);  //[3, 5, 6, 3, 1, 2, 5, 7, 5, 3, 4, 2, 3, 5, 6]

        String[] letters={"a","h","d","k","m","e","t","a","k"};
        List<String>letterlist=new ArrayList<>();
        for (int i = 0; i < letters.length; i++) {
            letterlist.add(letters[i]);
        }System.out.println(letterlist);  //[a, h, d, k, m, e, t, a, k]
        System.out.println(letterlist.get(5));  //e
        System.out.println(letterlist.get(0)); //a
        System.out.println(letterlist.size()); //9
        System.out.println(letterlist.get(letterlist.size() - 1));  //k

    }
}
