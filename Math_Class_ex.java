import java.util.Scanner;
public class Math_Class_ex {
    public static void main(String[] args) {
        // circumference = 2 * Math.PI * radius;
        // area = Math.PI * Math.pow(radius, 2);
        // volume = (4.0/3.0) * Math.Pi + Math.pow(radius, 3);

            Scanner scanner = new Scanner(System.in);

            double radius;
            double circumference;
            double area;
            double volume;
            
            System.out.print("Enter the radius of the circle:");
            radius = scanner.nextDouble();

            circumference = 2 * Math.PI * radius;
            area = Math.PI * Math.pow(radius, 2);
            volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

            System.out.println("The circumference is : " + circumference);
            System.out.println("The area is : " + area);
            // An simple example of how the printf statement work, the f we use in the placeholder indicates double. The \n is the new line character when placed it shiftes the cursor to new line.
            System.out.printf("The volume is : %.2f\n", volume);

            scanner.close();
        }
}
