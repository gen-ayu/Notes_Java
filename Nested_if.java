import java.util.Scanner;
public class Nested_if {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        boolean isStudent; // 10% discount on movie tickets
        boolean isSenior; // 20% discount for age 65 and above
        double price = 499.99;
        double discount;

        
        System.out.print("Are you a student (true/false): ");
        isStudent = scanner.nextBoolean();
        
        System.out.print("Are you a Senior (true/false): ");
        isSenior = scanner.nextBoolean();
        
        System.out.println("Movie ticket price is 499.99 rupees only");

        if(isStudent){
            if(isSenior){
                discount = price * 0.3;
                System.out.println("You will get a combined discount of 10% + 20% which is " + discount);
            }
            else{
                discount = price * 0.1;
                System.out.println("You will get a total discount of 10% which is " + discount);
            }
        }
        else{
            if(isSenior){
                discount = price * 0.2;
                System.out.println("You will get a combined discount of 20% which is " + discount);
            }
            else{
                discount = 0;
                System.out.println("You are not eligible for any store discount");
            }
        }

        price = price - discount;

        System.out.println("The billing amount is " + price);

        scanner.close();
        
    }
}