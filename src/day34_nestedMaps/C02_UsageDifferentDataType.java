package day34_nestedMaps;

import java.util.ArrayList;
import java.util.List;

public class C02_UsageDifferentDataType {

            public static void main(String[] args) {
        /*
            Java'da farkli data turlerinden degerler eklemek istedigimiz
            herhangi bir yapi(List,Set,Map...)nin data turunu Object secebiliriz
            Bunun dezavantaji ise
            elementler Object olarak kaydedildigi icin
            herhangi bir element icin kendi data turune ait(String,Integer,Boolean..)
            method'lari direkt kullanamayiz
            Eger bir elementin data turunu net olarak biliyorsak
            ve o data turune ait bir method'u kullanmak istersek
            Data Casting yapabiliriz
         */
                List<String>studentList = new ArrayList<>();
                studentList.add("Sevda");
                // ogrenciList.add(12);
                // ogrenciList.add(true);
                System.out.println(studentList); // [Sevda]
                // tum data turlerinde bilgiyi kabul edecek bir list olusturmak istesek
                List<Object> each = new ArrayList<>();
                each.add("Selgun");
                each.add(24);
                each.add(true);
                each.add('Q');
                System.out.println(each); // [Selgun, 24, true, Q]
                // ogrenciList'deki ilk ogrencinin basharfini yazdirin
                System.out.println(studentList.get(0).charAt(0)); // S
                // hersey'deki ilk elementin basharfini yazdirin
                System.out.println(((String) each.get(0)).charAt(0)); // S
                // hersey'deki 2.elementin degerinin 2 katini yazdirin
                System.out.println((Integer)each.get(1) * 2); // 48
                // hersey'deki 3.element true ise "Merhaba", false ise "Hoscakal" yazdirin
                if ((Boolean)each.get(2)){
                    System.out.println("Hello");
                }else {
                    System.out.println("Goodby");
                }
    }
}
