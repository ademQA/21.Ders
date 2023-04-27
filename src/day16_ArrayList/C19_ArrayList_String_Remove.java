package day16_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C19_ArrayList_String_Remove {
    public static void main(String[] args) {
        //Create a method that deletes the elements containing unwanted letters in a given String list
        // and returns the rest to us as a list.

        String[] arr={"adem","ali","hasan","ayşe","mert"} ;

        Scanner scanner=new Scanner(System.in);
        System.out.println("input unwanted letter: ");
        String letter=scanner.nextLine();
        System.out.println(removeArray(arr, letter));
    }
    public static List<String> removeArray(String[]arr,String unwantedLetter){
        List<String> removeList=new ArrayList<>();
        for (String each:arr){
            removeList.add(each);
            if (each.contains(unwantedLetter))
                removeList.remove(each);
        }
        return removeList;
    }
}
