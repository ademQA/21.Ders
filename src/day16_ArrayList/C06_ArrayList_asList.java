package day16_ArrayList;

import java.util.Arrays;
import java.util.List;

public class C06_ArrayList_asList {
    public static void main(String[] args) {
        Integer[]arr={1,3,5};
        List<Integer>arrayList= Arrays.asList(arr);
        System.out.println(arrayList); //[1, 3, 5]
    }
}
