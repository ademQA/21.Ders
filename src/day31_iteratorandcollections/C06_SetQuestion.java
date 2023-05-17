package day31_iteratorandcollections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C06_SetQuestion {
    public static void main(String[] args) {
        Integer[]numbers={3,6,7,9,0,2,3,4,5,1,4,6,7,9};
        Set<Integer>numberList= new HashSet<>();
        for (Integer each:numbers) {
            numberList.add(each);
        }
        System.out.println(numberList);
        numbers= new Integer[numberList.size()];

        int index=0;
        for (Integer each:numberList) {
            numbers[index]=each;
            index++;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
