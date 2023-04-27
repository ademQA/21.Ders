package day16_ArrayList;

import java.util.Scanner;

public class C10_For_Each_Loop {
    public static void main(String[] args) {
        //Question 4- Take a sentence and a letter from the user, if the letter is used in the sentence,
        // print how many times it is used, if not, print "the letter is not used in the sentence"
        Scanner scanner=new Scanner(System.in);
        System.out.println("input sentence:");
         String str= scanner.nextLine();
        System.out.println("input searchedLetter:");
        String searchedLetter= scanner.nextLine();

   int counter=0;
   String[] charr=str.split("");
   for (String each:charr){
       if (each.equals(searchedLetter)){
           counter++;
       }
   }
   if (counter==0)
       System.out.println("letter you want to find is not used");
   else System.out.println("letter you want to find is "+ counter+" used");
    }
}
