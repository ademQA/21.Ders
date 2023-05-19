package day32_Map;

import java.util.*;

import static javafx.scene.input.KeyCode.H;
import static javafx.scene.input.KeyCode.K;

public class C01_MapCreate {
    public static void main(String[] args) {
        int number = 5;
        String str = "Java Candır";

        List<String> list = new ArrayList<>();
        Set<Integer> numberSet = new HashSet<>();
        list.add("4");
        numberSet.add(34);

        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Ali-Can-11-H-MF");
        studentMap.put(102, "Veli-Cem-10-K-TM");
        studentMap.put(103, "Ali-Cem-11-K-TM");
        studentMap.put(104, "Ayse-Can-10-H-MF");
        studentMap.put(105, "Sevgi-Cem-11-M-TM");
        studentMap.put(106, "Sevgi-Can-10-K-MF");
        System.out.println(studentMap); //{101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM, 104=Ayse-Can-10-H-MF, 105=Sevgi-Cem-11-M-TM, 106=Sevgi-Can-10-K-MF}

        System.out.println(studentMap.get(103));  //Ali-Cem-11-K-TM
    // print the branch of student number 103
        String value103 = studentMap.get(103);
        String[] valueArr = value103.split("-");
        System.out.println(Arrays.toString(valueArr));  //[Ali, Cem, 11, K, TM]

        System.out.println(valueArr[3]);    //K

    }
}
