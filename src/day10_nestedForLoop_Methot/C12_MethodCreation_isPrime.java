package day10_nestedForLoop_Methot;

public class C12_MethodCreation_isPrime {
    public static void main(String[] args) {
       isPrime(48);
    }
    public static boolean isPrime(int number){
        boolean isPrime=true;
        for (int i=2;i<number;i++){
            if (number%i==0){
                isPrime=false;
                //  flag++;
            }
        }if (isPrime){
            System.out.println("prime number");
        }else System.out.println("not prime number");
        return isPrime;
    }
}
