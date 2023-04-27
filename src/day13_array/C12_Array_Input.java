package day13_array;

import java.util.Arrays;
import java.util.Scanner;

public class C12_Array_Input {

    public static void main(String[] args) {
        //Question-5)Create a method that takes the size and elements of the array from the user
        // and creates the array and returns it to us.

        int[] arr=createArray();
        System.out.println(Arrays.toString(arr));
    }

    public static int[] createArray(){
    Scanner scanner=new Scanner(System.in);
        System.out.println("input size of array:");
        int size= scanner.nextInt();
        int[] array=new int[size];
        for (int i = 0; i <size ; i++) {
            System.out.println("input "+(i+1)+". elements of array: ");
            array[i]=scanner.nextInt();
        }return array;
    }

}
