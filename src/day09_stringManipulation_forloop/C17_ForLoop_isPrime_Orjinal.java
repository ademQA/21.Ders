package day09_stringManipulation_forloop;

public class C17_ForLoop_isPrime_Orjinal {
    public static void main(String[] args) {
        int sayi=100;
        boolean asalMi;
    int j=0;
       while (j<10){

           asalMi=true;
            for(int i=2;i<sayi;i++) {

                if (sayi % i == 0) {
                    asalMi = false;
                    break;
                }
            }
            if (asalMi == true) {
                System.out.print(sayi + " ");
                j++;

            }
           sayi++;
    }
    }
}
