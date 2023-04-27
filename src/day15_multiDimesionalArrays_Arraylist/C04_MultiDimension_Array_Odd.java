package day15_multiDimesionalArrays_Arraylist;

public class C04_MultiDimension_Array_Odd {
    public static void main(String[] args) {
        int[][] arr={{1,5,9},{3,4},{2,8,1,2,},{10}};
        int max=arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]%2==1)
                    System.out.print(arr[i][j]+" ");
            }
        }

    }
}
