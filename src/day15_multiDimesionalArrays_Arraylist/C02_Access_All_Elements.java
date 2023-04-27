package day15_multiDimesionalArrays_Arraylist;

public class C02_Access_All_Elements {
    public static void main(String[] args) {
        int[][] arr={{1,5,9},{3,4},{2,8,1,2,},{10}};
        int total=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");//1 5 9 3 4 2 8 1 2 10
                total+=arr[i][j];
            }
        }
        System.out.println();
        System.out.println("total all elements of arrays: "+total);
    }
}
