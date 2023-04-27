package day14_array;

import java.util.Arrays;

public class C04_Array_Split {
    public static void main(String[] args) {
        String str="Java, gerçekten yılın bu zamanlarında çok... güzel...değil mi? Java olmadan java, öğrenilmez";
        int counter=0;
        String[] arr=str.split("");
        System.out.println(Arrays.toString(arr));
        String[] arr2=str.split(" ");
        System.out.println(Arrays.toString(arr2));
        String[] arr3=str.split(",");
        System.out.println(Arrays.toString(arr3));
        String[] arr4=str.split(" . ");
        System.out.println(Arrays.toString(arr4));

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].equals("e"))
                counter++;
        }
        System.out.println("Word you search is used "+counter+" times");
    }
}
