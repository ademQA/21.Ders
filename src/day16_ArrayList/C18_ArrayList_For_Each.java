package day16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C18_ArrayList_For_Each {
    public static void main(String[] args) {
        //Create a method that takes the squares of each element in the given int array
        // and prints the sum of their squares.
        int[]arr={2,4,6,8,9,5,7};
        System.out.println(squareSum(arr));
    }
    public static int squareSum(int[] arr){
    int total=0;

        for (int each:arr){

         total+=each*each;
        }
        return total;
    }
}
