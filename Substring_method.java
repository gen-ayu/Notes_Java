import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        // .substring() = A method used to extract a portion of a string string.substring (start, end) the end index is exclusive
        
        /*
        String email = "Bro123@gmail.com";
        String username = email.substring(0, 6);
        String domain = email.substring(7); // If end not mention we go till the string ends
        this method is not flixible and anly works for a given fixed input
        System.out.println(domain);
        */

        Scanner scanner = new Scanner(System.in);

        String name;
        int index;
        String domain;
        String username;

        System.out.print("Enter you email: ");
        name = scanner.nextLine();

        if(name.contains("@")){

            index = name.indexOf("@");
            username = name.substring(0, index);
            domain = name.substring(index + 1);

            System.out.println("Your usename is: " + username);
            System.out.println("Your domain is: " + domain);
        }
        else{
            System.out.println("Enter a valid email formate");
        }
        
        scanner.close();

    }
}