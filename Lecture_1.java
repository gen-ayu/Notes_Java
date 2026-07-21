// Program to to take input from the user and print the area

import java.util.Scanner;

public class Lecture_1{
    public static void main(String[] argss){

        //Calculate area of a rectangle

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in); // Created the object scanner

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.println("Enter the height: ");
        height = scanner.nextDouble();

        area = width*height;

        System.out.println("The area is: " + area + " cm²");

        scanner.close(); // closing the object at the end of a program is a good practice and may save you from running into unexpected errors.
    }
}