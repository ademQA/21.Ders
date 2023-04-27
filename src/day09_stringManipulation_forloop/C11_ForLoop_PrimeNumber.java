package day09_stringManipulation_forloop;

public class C11_ForLoop_PrimeNumber {
    public static void main(String[] args) {
        int number=23;
      //  int flag=0;
        boolean isPrime=true;
        for (int i=2;i<number;i++){
            if (number%i==0){
             isPrime=false;
              //  flag++;
            }
        }if (isPrime){
            System.out.println("prime number");
        }else System.out.println("not prime number");
    }
}
