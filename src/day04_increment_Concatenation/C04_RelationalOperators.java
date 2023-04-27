package day04_increment_Concatenation;

public class C04_RelationalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        /*  Comparison operators are the operators that compare 2 variables and produce TRUE
        if the required condition is met, and FALSE if the condition is not met.
         */
        // a b'ye esit mi ?
        System.out.println(a == b); // false
        System.out.println(2*a == b); // true
        System.out.println( a == b/2); // true
        // a b'nin esit olmadigini kontrol edin
        System.out.println( a != b ); // true
        System.out.println( a != b/2); // false
        // a b'den kucuk mu ?
        System.out.println(a < b); // true
        System.out.println(a < b/2); // false
        // a b'den kucuk degil  sartini kontrol edelim
        System.out.println( !(a < b)); // false
        // a b'den kucuk veya esit mi ?
        System.out.println(a <= b); // true
        System.out.println(2 * a <= b ); // true
        // a b'den buyuk mu ?
        System.out.println(a > b); // false
        System.out.println(5*a > 2*b); // true
        boolean c = 2 * a >= b ;
        // a'nin 3 katinin b'den buyuk olmadigi sartini kontrol edin
        System.out.println(  !(a*3 > b)    ); // false
    }
}
