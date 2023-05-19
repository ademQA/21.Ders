package day32_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethods {
    // When we give map and student number, name and surname information in the desired format.
    // let's create a method that returns us
    public static String studentFindWithNumber(Map<Integer, String> studentMap, int studentNumber) {
        String studentValue = studentMap.get(studentNumber);
        String[] valueArr = studentValue.split("-");
        String name = valueArr[0];
        String surname = valueArr[1];
        String nameSurname = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase() + " " +
                surname.substring(0, 1).toUpperCase() + surname.substring(1).toLowerCase();
        return nameSurname;
    }


    public static Map<Integer, String> studentCreate() {

        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Ali-Can-11-H-MF");
        studentMap.put(102, "Veli-Cem-10-K-TM");
        studentMap.put(103, "Ali-Cem-11-K-TM");
        studentMap.put(104, "Ayse-Can-10-H-MF");
        studentMap.put(105, "Sevgi-Cem-11-M-TM");
        studentMap.put(106, "Sevgi-Can-10-K-MF");

        return studentMap;
    }

    // print the names and surnames of all students as a list
    public static void allStudentWrite(Map<Integer, String> studentMap) {
        Set<Integer> studentKeySet = studentMap.keySet(); //
        int orderNo = 1;
        for (Integer eachKey : studentKeySet) {
            System.out.println(orderNo + "- " + studentFindWithNumber(studentMap, eachKey));
            orderNo++;
        }
    }

    public static void studentWriteBetwenNumbers(Map<Integer, String> studentMap, int startNo, int finishNo) {
        // student number between two given values (including limit values)
        // print the number, name, surname and section of all students
        Set<Integer> studentKeySet = studentMap.keySet();
        int order = 1;
        for (Integer eachKey : studentKeySet) {
            if (eachKey >= startNo && eachKey <= finishNo) {
                String value = studentMap.get(eachKey);
                String[] valueArr = value.split("-");
                System.out.println(order + "- " + eachKey + " " + valueArr[0] + " " + valueArr[1] + " " + valueArr[4]);
                order++;
            }
        }
    }




    // print the names and surnames of all students in the desired class
    public static void studentNameSurnameWrite(Map<Integer, String> studentMap, int classes) {
        Collection<String> valueCollection = studentMap.values();
        int orderNo = 1;
        for (String each : valueCollection) {
            String[] eachArr = each.split("-");
            if (eachArr[2].equals(classes + "")) {
                System.out.println(orderNo + "- " + eachArr[0] + "  " + eachArr[1]);
                orderNo++;
            }
        }
    }



    public static Map<Integer, String> updateSurnameWithNumber(Map<Integer, String> studentMap, int studentNumber, String surname) {

        String value=studentMap.get(studentNumber);
        String[] valueArr=value.split("-");
        valueArr[1]=surname;
        value=valueArr[0]+"-"+valueArr[1]+"-"+valueArr[2]+"-"+valueArr[3];
        studentMap.put(studentNumber,value);
        return studentMap;
    }
}
