package day31_iteratorandcollections;

import java.util.LinkedList;
import java.util.List;

public class C02_List {
    public static void main(String[] args) {
        List<String> list=new LinkedList<>();
        System.out.println(list.hashCode());
        list.add("Esat");
        list.add("Sevda");
        list.add("İlknur");
        list.add("Şeyma");
        System.out.println(list.hashCode());

        System.out.println(list);
        list.add(2,"Nurhayat");
        System.out.println(list);
        System.out.println(list.hashCode());

        List<String>list1=new LinkedList<>();
        list1.add("Yusuf");
        list1.add("Esat");
        list1.add("İlknur");
        list1.add("Murat");
        System.out.println(list1);
        System.out.println(list.retainAll(list1));
        System.out.println(list);

    }
}
