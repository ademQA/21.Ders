package day13_array;

public class C06_Array_Max {
    public static void main(String[] args) {
//Write a program to find the largest element of the array
        int[] arr={2,4,6,8,1,30,8,2};
        System.out.println(maxNumber(arr));

    }
    public static int maxNumber(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max)
                max=arr[i];
        }
        return max;
    }
}
