package day09_stringManipulation_forloop;

public class C08_ForLoop_NumberOfWord {
    public static void main(String[] args) {
        // in a given text
        // find uppercase, lowercase and space numbers
        // take into account the number of space, how many words,
        // print how many lowercase and uppercase letters there are.
        String str="Java öğrenen işi kapar";
        int uppercaseNumber=0;
        int lowercaseNumber=0;
        int spaceNumber=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)>='a' && str.charAt(i)<='z'){
                lowercaseNumber++;
            } else if (str.charAt(i)>='A' && str.charAt(i)<='Z') {
                uppercaseNumber++;
            } else if (str.charAt(i)==' ') {
             spaceNumber++;
            }
        }
        System.out.println("number of lowercase:"+lowercaseNumber);
        System.out.println("number of uppercase:"+uppercaseNumber);
        System.out.println("number of space:"+spaceNumber);
        System.out.println("number of word:"+spaceNumber+1);
    }
}
