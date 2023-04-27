package day19_staticKeyWords_passByValue;

import java.util.Arrays;

public class C08_PassByValue {
    public static void main(String[] args) {
        int[] arr = {3,5,7};
    addElement(arr);
        System.out.println("arr after method call:"+Arrays.toString(arr));
    }
    public static void addElement(int[] arr){
        int[] newArr=new  int[4];
        for (int i = 0; i < arr.length; i++) {
            newArr[i]=arr[i];
        }
        newArr[newArr.length-1]=10;
        arr=newArr;
        System.out.println(Arrays.toString(arr));
    }
}
