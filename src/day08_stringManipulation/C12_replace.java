package day08_stringManipulation;

public class C12_replace {
    public static void main(String[] args) {
        //Collect and print the String prices given by the user in a certain format.
        // input 1 : “15.30 €” , input2 : “11.40 €”
        //output : 26.70 €
        String str1="15.30 €";
        String  str2="11.40 €";
        str1=str1.replaceAll("\\D","");

    }
}
