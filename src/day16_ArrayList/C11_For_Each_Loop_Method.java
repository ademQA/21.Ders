package day16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C11_For_Each_Loop_Method {
    public static void main(String[] args) {

        // Prepare a method that prints the even numbers in the given array,
        // and then the odd numbers by using for each loop
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18};
        oddEvenList(arr);
    }
    public static void oddEvenList(int[] arr){
        List<Integer>evenList= new ArrayList<>();
        List<Integer>oddList=new ArrayList<>();
        for (Integer each:arr){
            if (each%2==0)
                evenList.add(each);
            else
                oddList.add(each);
        }
        System.out.println("Double(even) number list: "+evenList);
        System.out.println("single(odd) number liste: "+oddList);
    }
}
