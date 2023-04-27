package day16_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_ArrayList_Call_Method {
    public static void main(String[] args) {
        // create a method that saves the names taken from the user to the list
        System.out.println(nameAddWrite());
    }
    public static List<String> nameAddWrite(){
        String name="";
        List<String> nameList=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        while (!name.equalsIgnoreCase("0")){
        System.out.println("input names: ");
        name=scanner.nextLine();
        if (!name.equalsIgnoreCase("0"))
        nameList.add(name);}
return nameList;
    }
}
