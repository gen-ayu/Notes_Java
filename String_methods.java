public class String_methods {
    public static void main(String[] args){
        String name = "Li Fangi";

        int lenght = name.length(); // What is the length of the string include blank spaces and counting starts from 1 not to be confused by indexing starting form 0.
        char letter = name.charAt(5); // What is the letter at position/index 3 F in this case.
        int index = name.indexOf("n"); // Tells at which index does the mentioned character appears first in the string.
        int lastIndex = name.lastIndexOf("i"); // Tells at which index does the mentioned character appears last in the string.
        boolean Null = name.isEmpty(); // The method returns boolean and can be use to validate user input.
        boolean checkChar = name.contains("h"); // The method returns boolean and checks if a certain character is present in a string.
        boolean equalCheck = name.equals("li fangi"); // Checks if two sets of string are equal or not. Returns boolean.
        boolean equalCheckCase = name.equalsIgnoreCase("li fangi"); // Check if two sets of sting are equal or not and ignore casesensitve difference btw strings.

        name = name.toUpperCase(); //Turns all letters to UpperCase.
        name = name.toLowerCase(); // Turns all letters to LowerCase.
        name = name.trim(); //Trims any black spaces at the start and end of a string.
        name = name.replace("i", "a"); // Here we replace the character mentioned first within the parenthesis here i and replace it with the following character here a.

        System.out.println(equalCheckCase);

    }
}
