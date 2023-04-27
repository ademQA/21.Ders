package day15_multiDimesionalArrays_Arraylist;

import java.util.ArrayList;
import java.util.List;

public class C09_ArrayList_Remeove {
    public static void main(String[] args) {
        String[] letters={"a","h","d","k","m","e","t","a","k"};
        List<String> letterlist=new ArrayList<>();
        for (int i = 0; i < letters.length; i++) {
            letterlist.add(letters[i]);
        }System.out.println(letterlist);  //[a, h, d, k, m, e, t, a, k]
        System.out.println(letterlist.remove("h")); //true
        System.out.println(letterlist.remove("s")); //false
        System.out.println(letterlist.remove(5)); //t
        System.out.println(letterlist); //[a, d, k, m, e, a, k]
        System.out.println(letterlist.remove(23));  //IndexOutOfBoundsException

    }
}
