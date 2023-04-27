package day10_nestedForLoop_Methot;

public class C09_Method_Creation_Prime {
    public static void main(String[] args) {
asalNumber(57);
asalNumber(47);
    }
    public static void asalNumber(int number){
       // int number=23;
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
