package day15_multiDimesionalArrays_Arraylist;

public class C03_MultiDimension_Array_Max {
    public static void main(String[] args) {


    int[][] arr={{1,5,9},{3,4},{2,8,1,2,},{10}};
    int max=arr[0][0];

        for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
           if (arr[i][j]>max)
               max=arr[i][j];
        }
    }
        System.out.println();
        System.out.println("max all elements of arrays: "+max);
}
}