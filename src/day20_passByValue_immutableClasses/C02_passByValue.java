package day20_passByValue_immutableClasses;
import java.util.ArrayList;
import java.util.List;

public class C02_passByValue {
    public static void main(String[] args) {

        List<String> letters = new ArrayList<>();
        letters.add("A");
        letters.add("K");
        letters.add("Z");
        System.out.println(letters); // [A, K, Z]

        System.out.println("The list returned from the method call: "+method1(letters)); //[T, C, Z]
        System.out.println("list after method call:" + letters);  //[T, C, Z]
        System.out.println("Returned list from Method2 call: " + method2(letters)); //[P]
        System.out.println("list after method2 call:" + letters);  //[T, C, Z]
    }
    public static List<String> method1(List<String> letters){
        letters.set(0,"T");
        letters.set(1,"C");
        System.out.println("List of letters in method1: " + letters); //[T, C, Z]
        return letters;
    }
    public static List<String> method2(List<String> letters){
        letters= new ArrayList<>();
        letters.add("P");
        System.out.println("List of letters in Method 2: " + letters); //List of letters in Method 2: [P]
        return letters;
    }
    }

