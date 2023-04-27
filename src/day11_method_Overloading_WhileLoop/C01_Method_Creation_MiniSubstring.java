package day11_method_Overloading_WhileLoop;

public class C01_Method_Creation_MiniSubstring {
    public static void main(String[] args) {
        //Question 1- Create a method that prints the letters between a String given as input from the user,
        // including the starting index, excluding the ending index, according to the start and end indexes.
        //- give an error message if the user enters a number greater than the end value as the start value
        //- print an error message if the user enters an index larger than the indexes in the str.
substringWrite("java güzeldir",4,12);
    }
    public  static void substringWrite(String text, int startIndex, int finisIndex){
    if (startIndex>finisIndex){
        System.out.println("startIndex can not bigger than finisIndex");
    } else if (finisIndex>text.length()-1) {
        System.out.println("The index you want is outside of the text");
    }else {
        for (int i = startIndex; i <finisIndex ; i++) {
            System.out.print(text.charAt(i));
        }
    }
    }
}
