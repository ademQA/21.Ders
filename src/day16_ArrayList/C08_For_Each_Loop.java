package day16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C08_For_Each_Loop {
    public static void main(String[] args) {
        //Question 3- Checking each element in a given String array,
        //  - If the length of the word is an even number, return the first half
        //  - If the length of the word is an odd number, include the second half of the word, including the middle letter.
        //  Add it to a new list and print it.
    String[] arr={"araba","kelam","mehmet","hasan","kitaplık"};
    nameManipulation(arr);

    }
    public static  void nameManipulation(String[] arr){
        List<String>manupilationNames=new ArrayList<>();

        for (String each:arr){
            if (each.length()%2==0){
                manupilationNames.add(each.substring(0,each.length()/2) );

            }else
            { manupilationNames.add(each.substring(each.length()/2));}
        }
        System.out.println(manupilationNames);
    }
}
