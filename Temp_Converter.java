import java.util.Scanner;

public class Temp_Converter {
    public static void main(String[] args) {
        
        // temperature converter
        System.out.println("Welcome to the temperature converter program!");
        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Enter unit(C/F): ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5/9 : (temp * 9/5) + 32;

        if(unit.equals("C")){
            System.out.printf("The converted Temperature is equal to %.2f F", newTemp);
        }
        else{
            System.out.printf("The converted Temperature is equal to %.2f C", newTemp);
        }
        scanner.close();
    }
}
