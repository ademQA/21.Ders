package day08_stringManipulation;

public class C13_replaceAll_Regex {
    public static void main(String[] args) {
        //Question 2: Collect and print the String prices given by the user in a certain format.
        // input1: “15.30 €” , input2: “11.40 €”
        //output : 26.70 €
        String input1="15.30 €";
        String input2= "11.40 €";
        System.out.println(input1 = input1.replaceAll("\\D", ""));
        System.out.println(input2 = input2.replaceAll("\\D", ""));
        double input01=Double.valueOf(input1);
        double input02=Double.valueOf(input2);
        System.out.println("output: "+(input01+input02)/100+" € ");
    }

}
