package day16_ArrayList;

public class C07_For_Each_Loop {
    public static void main(String[] args) {
        //Question 2- Create a method
        // that takes the squares of each element in the given int array and prints the sum of its squares.
    int[] arr={3,5,4,3,4};
    arrSquareTotal(arr);
    }

    public static void  arrSquareTotal(int[] arr){

        int total=0;
        for (int each:arr){
            total+=each*each;
        }
        System.out.println(total);
    }
}
