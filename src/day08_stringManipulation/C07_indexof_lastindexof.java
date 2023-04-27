package day08_stringManipulation;

public class C07_indexof_lastindexof {
    public static void main(String[] args) {
// For a requested String in a given sentence
        // print the appropriate one of the following sentences
        // 1- the word you are looking for is used once in the sentence
        // 2- the word you are looking for is used more than 1 time in the sentence
        // 3- the word you are looking for is never used in the sentence
        String str1="Java cok kolay";
        String str2="cok";

        if (str1.indexOf(str2)==-1){
            System.out.println("The word you are looking for is not used in the sentence.");
        } else if (str2.indexOf(str2)==str2.lastIndexOf(str2)) {
            System.out.println("The word you are looking for is  used once in the sentence.");
        }else {
            System.out.println("The word you are looking for is  used more than once in the sentence.");
        }
    }
}
