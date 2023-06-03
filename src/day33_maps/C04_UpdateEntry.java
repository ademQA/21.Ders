package day33_maps;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import day32_Map.MapMethods;

import java.util.Map;

public class C04_UpdateEntry {
    public static void main(String[] args) {
        //capitalize all surnames on student map
        Map<Integer,String>studentMap= MapMethods.studentCreate();
        System.out.println(studentMap);
        studentMap=MapMethods.capitalizeAllSurname(studentMap);
        System.out.println(studentMap);
    }

}
