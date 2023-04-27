package day13_array;

public class C03_Array_Total {
    public static void main(String[] args) {
// sum all elements of the given int[]
        // create a method that prints the result

        int[] arr={2,4,6,8,1,3,8,2};
        sumElementsTotal(arr);
    }
public static void sumElementsTotal(int[] arr){
  int total=0;
    for (int i = 0; i < arr.length; i++) {
        total+=arr[i];
    }
    System.out.println("sum of elements in Array: "+total);
}
}
