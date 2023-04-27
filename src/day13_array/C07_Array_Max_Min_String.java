package day13_array;

public class C07_Array_Max_Min_String {
    public static void main(String[] args) {
//Make the program that finds the shortest and longest words using the method.

        String[] arr={"Saida","İsa","Asil","Kübra","Elif","Ahmet"};
maxMinWord(arr);
    }
    public static void maxMinWord(String[] arr){
        String max=arr[0];
        String  min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length()>=max.length())
                max=arr[i];
            if (arr[i].length()<min.length())
                min=arr[i];
        }
        System.out.println(max);
        System.out.println(min);
    }
}
