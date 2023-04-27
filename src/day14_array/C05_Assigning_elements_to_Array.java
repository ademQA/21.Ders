package day14_array;

import java.util.Arrays;

public class C05_Assigning_elements_to_Array {
    public static void main(String[] args) {
        String[]str1={"ali","hasan","ayşe"};
        String[] str2={"elif","murat"};
        str2=str1;
        System.out.println(Arrays.toString(str2));
        Arrays.sort(str1);
        System.out.println(Arrays.toString(str1));
        str2[2]="mert";
        System.out.println(Arrays.toString(str2));

    }
}
