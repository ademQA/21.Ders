package day25_inheritance;
import java.util.ArrayList;
import java.util.List;
public class C03_inheritancedataTypeUsage {
    public static void main(String[] args) {
        String str= "Java Candir";
        Integer number = 20;
        Boolean bl = true;
        Object obj1 = str; // String is-a Object
        System.out.println(obj1);
        Object obj2 = number; // Integer is-a object
        System.out.println(number);
        Object obj3= bl; // Boolean is-a object
        System.out.println(obj3);
        Object obj4 = new String("Tava");
        System.out.println(obj4);
        Object obj5 = new Integer(30);
        System.out.println(obj5);
        Object obj6 = new Boolean(true);
        System.out.println(obj6);
        // Integer dnm1= str;  String is-a Integer diyemeyiz
        ArrayList<String> names1 = new ArrayList<>();
        List<String> names2 = new ArrayList<>(); // ArrayList is-a List
        // ArrayList AbstractList'in Child'i
        // AbstractList'de List'in Child'i
        /*
            Java da bir obje olusturdugumuzda
            String str= "Java Candir";
            Object obj1 = str;
            List<String> isimler2 = new ArrayList<>();
            DataTuru variableIsmi = deger ; yazariz
            Burada kullandigimiz String,Object,Integer... hem data turudur, hem de class adidir
            Eger non-primitive data turlerinden bahsediyorsak
            esitligin sol tarafindaki dataTuru olan class ile
            constructor'in kullanildigi class'lar arasinda is-a reletionship olmalidir

         */


    }
}
