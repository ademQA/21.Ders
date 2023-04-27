package day11_method_Overloading_WhileLoop;

public class C14_WhileLoopString {
    public static void main(String[] args) {
        System.out.println(reverseText("adem tekinel"));

    }
    public static String reverseText(String text){
        int textLength=text.length();
        String reverseText="";

        while (textLength!=0){
           reverseText=reverseText+text.substring(textLength-1,textLength);
           textLength--;
        }
        return reverseText;
    }
}
