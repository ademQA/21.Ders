package day15_multiDimesionalArrays_Arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C13_ArrayList_equals {
    public static void main(String[] args) {

        List<String> names1=new ArrayList<>();
        names1.add("Selgun");
        names1.add("Saida");
        names1.add("Sevda");

        List<String>names2=new ArrayList<>();
        names2.add("Saida");
        names2.add("Selgun");
        names2.add("Sevda");

        System.out.println(names1); //[Selgun, Saida, Sevda]
        System.out.println(names2);  //[Saida, Selgun, Sevda]

        System.out.println(names1.equals(names2)); //false
        Collections.sort(names1);
        Collections.sort(names2);

        System.out.println(names1); //[Saida, Selgun, Sevda]
        System.out.println(names2); //[Saida, Selgun, Sevda]
        System.out.println(names1.equals(names2)); //true

    }
}
