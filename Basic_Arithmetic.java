import java.util.Scanner;
public class Basic_Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Arithmetic Operator

        int a = 12;
        int b = 5;
        int w;

        w = a + b;
        w = a - b;
        w = a * b;
        w = a / b;
        w = a % b;
        
        // Argumented Assignment Operator

        int x = 12;
        int y = 5;
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        
        // Increment and Decrement Operator

        int o = 1;

        o = o + 1;
        o += 1;
        o++; // post increment
        ++o; //pre increment

        // All the above are going to increment the value of o by 1. 

        o = o - 1;
        o -= 1;
        o--; //post decrement
        --o; //pre decrement

        // All the above are going to decrement the value of o by 1.

        System.out.println("The value after the arithmetic calculation " + w);
        System.out.print("The value after the Argumented arithmetic calculation " + x);   
        System.out.println("Value of variable o after increment/decrement " + o);  
        
        // Order of Operations [P-E-M-D-A-S] LEFT TO RIGHT

        double result = 3 + 4 * (7 - 5) / 2.0;
        System.out.println("The value after following the order of operations will be " + result);

        scanner.close();
    }
}
