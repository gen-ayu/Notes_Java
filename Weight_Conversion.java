import java.util.Scanner;

public class Weight_Conversion {
    public static void main(String[] args){

        // WEIGHT CONVERSION PROGRAM

        Scanner scanner = new Scanner(System.in);
    
        int option;
        double weight;

        System.out.println("Welcome to Weight Conversion program User!");

        System.out.println("Enter 1 to convert lbs to kg");
        System.out.println("Enter 2 to convert kg to lbs");
        option = scanner.nextInt();

        if(option == 1){
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();

            weight = weight / 2.2;
            System.out.printf("Weight = %.2f kgs",weight);
        }
        else if(option == 2){
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();

            weight = weight * 2.2;
            System.out.printf("Weight = %.2f lbs",weight);
        }
        else{
            System.out.println("Invaild input. Enter a vaild choice.");
        }

        scanner.close();
    } 
}
