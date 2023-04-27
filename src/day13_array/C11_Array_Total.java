package day13_array;

public class C11_Array_Total {
    public static void main(String[] args) {
        //Write a method that adds the positive integers in a given array and returns the result to us.
        int[] arr={2,4,6,8,1,30,8,2,-5,9,-12};
        System.out.println(positiveTotal(arr));
    }
    public static int positiveTotal(int[] arr){
        int total=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0)
                total+=arr[i];
        }return total;

    }
}
