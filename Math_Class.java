import java.util.Scanner;
public class Math_Class {
    public static void main(String[] args) {
        
        // double result;
        // System.out.println(Math.PI);
        // System.out.println(Math.E);
        // result = Math.pow(2, 3);
        // result = Math.abs(-5);
        // result = Math.sqrt(9);
        // result = Math.round(3.4);
        // result = Math.ceil(3.4);
        // result = Math.floor(3.99);
        // result = Math.max(10, 20);
        // result = Math.min(10, 20);

        Scanner scanner = new Scanner(System.in);

        double a, b, c;

        System.out.print("Enter first side of the triangle:");
        a = scanner.nextDouble();  
        
        System.out.print("Enter secound side of the triangle:");
        b = scanner.nextDouble();   
        
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The third side/ Hypotenuse of the triangle is " + c);

        scanner.close();
    }
    
}
