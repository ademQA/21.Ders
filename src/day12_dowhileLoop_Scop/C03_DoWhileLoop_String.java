package day12_dowhileLoop_Scop;

public class C03_DoWhileLoop_String {
    public static void main(String[] args) {
        //Question 1- Write the letters from the letter 'k' to the letter 't'.
        for (int i = 'k'; i <='t' ; i++) {
            System.out.print((char)i+" ");
        }
        System.out.println("\n---------------------");
        char letter='k';
        while (letter<='t'){
            System.out.print(letter+" ");
            letter++;
        }
        System.out.println("\n-----------------------");

        letter='k';
        do {
            System.out.print(letter+" ");
            letter++;
        }while (letter<='t');
    }
}
