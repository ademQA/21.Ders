package day19_staticKeyWords_passByValue;

import java.util.Arrays;

public class C07_PassByValue {
    public static void main(String[] args) {
        int[] arr={10,12,23};
        increaseElements(arr);
        System.out.println("arr after method call: "+Arrays.toString(arr));
    }

    public static void increaseElements(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]+3;
        }
        System.out.println(Arrays.toString(arr));
    }
}
