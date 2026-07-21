// We will checkout how a random class work in java

import java.util.Random;
public class Random_Class{
    public static void main(String[] args) {
        
        Random random = new Random();

        int number;
        double decimal;
        boolean isHeads;
        number = random.nextInt(1, 7);
        decimal = random.nextDouble(1, 7);
        isHeads = random.nextBoolean();// the second no. is exclusive so the 7 will will never appear. 

        System.out.println(number);
        System.out.println(decimal);
        System.out.println(isHeads);

        if(isHeads){
            System.out.println("Heads");
        }
        else{
            System.out.println("Tails");
        }
       
    }
}