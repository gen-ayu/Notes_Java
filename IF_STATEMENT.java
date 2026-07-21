import java.util.Scanner;
public class IF_STATEMENT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // if statement = perform a block of code if the confition is true.

        String name;
        int age;
        boolean isStudent;

        System.out.print("Enter your name:");
        name = scanner.nextLine();
        
        // BLOCK 1
        
        if(name.isEmpty()){
            System.out.println("You didn't enter your name!😡");
            name = scanner.nextLine();
            System.out.println("Hello! " + name + " 😊");
        }
        else{
            System.out.println("Hello! " + name + " 😊");
        }
        
        // BLOCK 2

        System.out.print("Enter your age:");
        age = scanner.nextInt();
    
        if(age >= 18 && age <=65){
            System.err.println("You are an adult.");
        }
        else if(age<0){
            System.err.println("You have not born yet.");
        }
        else if (age == 0) {
            System.out.println("You are a new born.");
        }
        else if(age<=18){
            System.out.println("You are a child.");
        }
        else{
            System.out.println("You are a senior citizen.");
        }

        // BLOCK 3

        System.out.print("Are you a student(True/False):");
        isStudent = scanner.nextBoolean();
        if(isStudent){
            System.out.println("You are a student!");
        }
        else{
            System.out.println("You are not a student!");
        }
        scanner.close();
    }

}
