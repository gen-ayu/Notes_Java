import java.util.Scanner;
public class CI_exercise {
    public static void main(String[] args){

        // Compound interest Calculator.

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompound; // how offen does the interest compound.
        int years;
        double amount;
        double ci;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the rate amount: ");
        rate = scanner.nextDouble();

        System.out.print("Enter the timesCompound amount: ");
        timesCompound = scanner.nextInt();

        System.out.print("Enter the years amount: ");
        years = scanner.nextInt();

        amount = principal * Math.pow((1 + (rate /(timesCompound * 100.0))), (years * timesCompound));
        ci = amount - principal;
        
        System.out.println("The amount will be: " + amount);
        System.out.println("The Compunt Interest will be: "+ ci);
        
        scanner.close();
    }
}
