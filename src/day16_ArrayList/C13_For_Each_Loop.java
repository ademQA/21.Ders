package day16_ArrayList;

import java.util.List;
import java.util.Scanner;

public class C13_For_Each_Loop {
    public static void main(String[] args) {
        //Prepare the code that finds the letter the user is looking for from the words in a list of strings.
        System.out.println("press 0 to exit");
        List<String>newList=C02_ArrayList_Call_Method.nameAddWrite();
        Scanner scanner=new Scanner(System.in);
        System.out.println("input searched letter: ");
        String searchedLetter=scanner.nextLine();
        for (String each:newList){
            if (each.contains(searchedLetter))
                System.out.println(each);
        }
    }
}
