package day13_array;

public class C05_Array {
    public static void main(String[] args) {
        //Write a program that prints the numbers 4 to 8 in the array
        int[] arr={2,4,6,8,1,3,8,2};
        int counter=0;
        for (int i = 0; i < arr.length; i++) {
           if (arr[i]>=4 &&arr[i]<=8)
               counter++;
        }
        System.out.println(counter);
    }

}
