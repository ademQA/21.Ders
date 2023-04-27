package day13_array;

import java.util.Arrays;

public class C08_Array_Plass {
    public static void main(String[] args) {
        //Question 1- Create a method that increments all the elements of a given int array by 2 and
        // returns it to us.Save the old array as it is new.
        int[] arr={3,5,7,2,1,9};
        int amountIncrease=2;
       arr=incrementAllElements(arr,amountIncrease);
        System.out.println(Arrays.toString(arr));
    }
    public  static int[] incrementAllElements(int[] arr,int amountIncrease ){
        for (int i = 0; i <arr.length ; i++) {
            arr[i]+=amountIncrease;
        }return arr;
    }
}
