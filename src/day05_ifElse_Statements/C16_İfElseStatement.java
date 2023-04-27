package day05_ifElse_Statements;
import java.util.Scanner;



public class C16_İfElseStatement {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan aldigi urun adedi ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20,
        // yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin
        //Question 3- Get the number and list price of the product purchased from the user,
       // and ask the user if they have a customer card. If there is a customer card, give 20% discount
        // if he buys more than 10 products, 15% if he does not have a customer card,
        // if he does not have a customer card, give a 15% discount if he buys more than 10 products,
        // and if he does not have a customer card, give a 10% discount
        Scanner scanner=new Scanner(System.in);
        System.out.println("input number of products:");
        int productNumber= scanner.nextInt();
        System.out.println("input price of product:");
        double productPrice= scanner.nextDouble();
        System.out.println("if you have costumer cart,input 'Y' or not input 'N'");
       char cardStatu=scanner.next().charAt(0);
        double totalPrice=0;
        if (cardStatu=='Y' && productNumber>=10){
            totalPrice=(productPrice*productNumber)*0.8;
        } else if (cardStatu=='Y' && productNumber<10) {
            totalPrice=(productPrice*productNumber)*0.85;

        } else if (cardStatu=='N' && productNumber>=10) {
            totalPrice=(productPrice*productNumber)*0.85;
        } else if (cardStatu=='N' && productNumber<10) {
            totalPrice = (productPrice * productNumber) * 0.9;
        }
        System.out.println(totalPrice);
    }
    }

