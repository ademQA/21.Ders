package day32_Map;

import java.util.Map;

import static javafx.scene.input.KeyCode.F;

public class C09_HomeWork3 {
    public static void main(String[] args) {
    //print all students in given class and branch
    Map<Integer,String>studentMap=MapMethods.studentCreate();
    String branch= "K";
    String classes="11";
    MapMethods.allStudentWriteWithBranchandClass(studentMap,branch,classes);
}
}