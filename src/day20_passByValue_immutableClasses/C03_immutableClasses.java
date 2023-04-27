package day20_passByValue_immutableClasses;
import java.util.ArrayList;
import java.util.List;
public class C03_immutableClasses {
    public static void main(String[] args) {

        String str = "Java Candir";
        System.out.println(str.toUpperCase()); // JAVA CANDIR
        System.out.println(str); // Java Candir
        str.toLowerCase();
        str.replace("a","e");
        //str.repeat(4);
        System.out.println(str); // Java Candir

        List<Integer> number = new ArrayList<>();
        number.add(4);
        number.add(7);
        number.add(5);
        System.out.println(number); // [4, 7, 5]
        number.set(0,10);
        System.out.println(number); // [10, 7, 5]
    }

}


