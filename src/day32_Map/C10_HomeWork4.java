package day32_Map;

import java.util.Arrays;
import java.util.Map;

public class C10_HomeWork4 {
    public static void main(String[] args) {
        Map<Integer,String>studentMap=MapMethods.studentCreate();
        studentWrite(studentMap,"Can");
    }
    public static void studentWrite(Map<Integer, String> studentMap, String surname) {
        int orderNo = 1;

        for (Integer schoolNumber : studentMap.keySet()) {
            String studentInfo = studentMap.get(schoolNumber);
            String[] valueArr = studentInfo.split("-");
            System.out.println(Arrays.toString(valueArr));

            if (valueArr[1].equalsIgnoreCase(surname)) {
                String name = valueArr[0];
                String grade = valueArr[2];
                String section = valueArr[3];
                String department = valueArr[4];

                System.out.println(orderNo + "- " + "Okul no: " + schoolNumber + " adı: " + name +
                        " Soyadı: " + valueArr[1] + " Sınıf: " + grade + " Şube: " + section + " Bölüm: " + department);
                orderNo++;
            }
        }
    }

}

