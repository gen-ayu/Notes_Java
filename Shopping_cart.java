import java.util.Scanner;
public class Shopping_cart {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String item;
        double price, total;
        int quantity;
        char currency = '$';

        System.out.print("What item would you like to have?");
        item = scanner.nextLine();
        System.out.print("What is the price for each item?");
        price = scanner.nextDouble();
        System.out.print("Enter the amount of the item.");
        quantity = scanner.nextInt();
        // System.out.print("Enter the currency you want to pay in.");
        // currency = scanner.next().charAt(0);
        
        total = price * quantity;

        System.out.println("Your order for " + quantity + " " + item +  " will total to " + total + currency + " only!");

        scanner.close();
    }    
}
