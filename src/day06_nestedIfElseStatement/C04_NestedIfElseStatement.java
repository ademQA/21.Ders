package day06_nestedIfElseStatement;

import java.util.Scanner;

public class C04_NestedIfElseStatement {
    public static void main(String[] args) {
        // Question 2- Get the product number and list price from the user,
        // Ask the user if they have a customer card.
        // If the customer has a card and buys more than 10 products, 20%,
        // otherwise give a 15% discount,
        // If the customer does not have a card, 15% if he buys more than 10 products,
        // otherwise give 10% discount
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please write the product number you entered:");
        int productNumber= scanner.nextInt();
        System.out.println("Enter the list price of the product:");
        double listPrice= scanner.nextDouble();
        System.out.println("Is there Customer card ? Y : Yes , N : No");
        char kartstatu = scanner.next().toUpperCase().charAt(0);
        double totalPrice=0;
        if (kartstatu=='Y'){ // those who have a card
            if (productNumber>10){
                totalPrice = productNumber*listPrice * 80 /100 ;
                System.out.println("%20 discount total price : " + totalPrice);
            }else {
                totalPrice= productNumber*listPrice * 85 /100 ;
                System.out.println("%15 discount total price : " + totalPrice);
            }
        } else if (kartstatu == 'N') { // those who don't have a card
            if (productNumber>10){
                totalPrice = productNumber*listPrice * 85 /100 ;
                System.out.println("%15 discount total price  : " + totalPrice);
            }else {
                totalPrice= productNumber*listPrice * 90 /100 ;
                System.out.println("%10 discount total price : " + totalPrice);
            }
        }else { // wrong card entry
            System.out.println("You entered wrong for card information");
        }
    }

    }

