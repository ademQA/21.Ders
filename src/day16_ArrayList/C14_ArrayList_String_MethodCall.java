package day16_ArrayList;

import java.util.List;

public class C14_ArrayList_String_MethodCall {
    public static void main(String[] args) {
        //// print names with more than 3 letters in the list of names taken from the user
        List<String>namesList=C02_ArrayList_Call_Method.nameAddWrite();
        for (int i = 0; i < namesList.size(); i++) {
        if (namesList.get(i).length()>3)
            System.out.println(namesList.get(i));
            System.out.println(namesList);
    }
    }
}
