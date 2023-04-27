package day13_array;

public class C02_Arrays_Access_To_All_Elements {
    public static void main(String[] args) {
        //Printing an array is different from printing its elements.
        //             if we want to print an array we print it with Arrays.toString()
        //             It has square brackets on both sides as standard.
        //             there is space between them
        //             When we want to print elements, we use loop
        //             and how we print it is up to us
        int[] arr={2,4,6,8,1,3,8,2};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"-");
        }
        System.out.println(arr.length-1);
    }
}
