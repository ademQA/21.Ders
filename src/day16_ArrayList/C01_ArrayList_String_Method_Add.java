package day16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_ArrayList_String_Method_Add {
    public static void main(String[] args) {
        // exercise to create a method that prints a generated list
   List<String>names=new ArrayList<>();
   names.add("ayşe");
   names.add("hasan");
   names.add("mert");
   names.add("zeki");
   printlist(names);
    }
    public  static void printlist(List<String> name){
        System.out.println(name);
    }
}
