package day16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C17_ArrayList_Remove_Duplicate_Element {
    public static void main(String[] args) {
        //For the repeating elements in a given array,
        // create a method that will delete the duplicates and make only 1 of all elements and return it to us.

        String[] arr = {"araba","kelam", "kelam", "hasan", "mehmet", "hasan", "kitaplık", "araba"};
        System.out.println(duplicateRemove(arr));
    }
    public static List<String> duplicateRemove(String[] arr) {
        List<String> duplicatelist = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            duplicatelist.add(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            //   int counter=0;
            for (int j = i+1; j < arr.length; j++) {

                if (arr[i].equalsIgnoreCase(arr[j]))

                    duplicatelist.remove(i);
            }
            }
            return duplicatelist;
        }
    }
