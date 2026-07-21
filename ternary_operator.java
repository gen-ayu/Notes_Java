import java.util.Scanner;
public class ternary_operator {
    public static void main(String[] args) {
        
        // ternary operator ? = return1 or 2 values is a condition is true

        // variable = (condition) ? ifTrue : ifFalse;

        Scanner scanner = new Scanner(System.in);

        int number;
        String check;

        System.out.print("Enter the number you want to check: ");
        number = scanner.nextInt();

        check = (number%2 == 0) ? "Even" : "Odd";

        System.out.println("The entered number is " + check);

        scanner.close();        
    }
}
