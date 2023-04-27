package day13_array;

public class C09_Array_Elements_Search {
    public static void main(String[] args) {
        //Question 4- Create a method that prints whether a desired element exists in a given array and,
        // if so, how many times it has been used.
        String[] arr={"Saida","İsa","Asil","Kübra","Elif","Ahmet","ISA"};
        String searchName="ısa";
        arrayElementsSearch(arr,searchName);
    }
    public  static void arrayElementsSearch(String[] arr, String searchName){
        int counter=0;
        for (int i = 0; i < arr.length; i++) {
           if (arr[i].equalsIgnoreCase(searchName))
               counter++;
        }if (counter==0)
            System.out.println("word you search is not found");
        else System.out.println("word you search is  found "+counter+" time");
    }
}
