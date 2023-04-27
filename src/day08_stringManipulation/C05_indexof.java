package day08_stringManipulation;

public class C05_indexof {
    public static void main(String[] args) {
        //// For a requested String in a given sentence
        //         // print the appropriate one of the following sentences
        //         // 1- the word you are looking for is used once in the sentence
        //         // 2- the word you are looking for is used 2 or more times in the sentence
        String str="Java en iyisi";
        if (str.indexOf("en")==-1){
            System.out.println("There is no word you are looking for in this sentence");
        }else {
            int firstIndex=str.indexOf("en");
            if (str.indexOf("en",firstIndex+1)==-1){
                System.out.println("The word you are looking for in this sentence is used once.");
            }else {
                System.out.println("The word you are looking for in this sentence has been used more than once.");
            }
        }
    }
}
