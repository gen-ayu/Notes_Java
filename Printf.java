public class Printf {
    public static void main(String[] args){
        // printf() = is a method used to format output
        
        // %[flags][width][.precision][specifier-character]

        String name = "Spongebob";
        char firstletter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n",name);
        System.out.printf("Your name starts with %c\n", firstletter);
        System.out.printf("You are %d years old.\n", age);
        System.out.printf("You are %.2f inches tall\n", height);// the 2 we use is placeholder is the [.precision]
        System.out.printf("Employed: %b\n",isEmployed);

        System.out.printf("%s is %d years old.", name, age);

        // We will now talk about the [flags]
        // + = outputs a plus
        // , = comma grouping separator
        // ( = negative no. are enclosed in ()
        // space = display a minus if negative and space if positive

        double price1 = 5.16035;
        double price2 = -4962.02576;
        double price3 = 74296.01010104;

        System.out.println("Precision");
        System.out.printf("%.2f\n", price1);
        System.out.printf("%.3f\n", price2);
        System.out.printf("%.1f\n", price3);

        System.out.println("space = display a minus if negative and space if positive");
        System.out.printf("% .2f\n", price1);
        System.out.printf("% .2f\n", price2);
        System.out.printf("% .2f\n", price3);

        System.out.println(", = comma grouping separator");
        System.out.printf("%,.2f\n", price1);
        System.out.printf("%,.2f\n", price2);
        System.out.printf("%,.2f\n", price3);

        System.out.println("( = negative no. are enclosed in ()");
        System.out.printf("%(.2f\n", price1);
        System.out.printf("%(.2f\n", price2);
        System.out.printf("%(.2f\n", price3);

        System.out.println("+ = outputs a plus");
        System.out.printf("%+.2f\n", price1);
        System.out.printf("%+.2f\n", price2);
        System.out.printf("%+.2f\n", price3);

        // now last is [width]

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n", id1);// the 4 here is the amount of digits we can use ot 0 pad the digits in our case we are using 4 since longest digit here is 4 digit.
        System.out.printf("%4d\n", id2);// Here along with the digits we have black spaces being the right justified padding.
        System.out.printf("%-4d\n", id3);// Here along with the digits we have black spaces being the left justified padding.
        System.out.printf("%04d\n", id4);

    }  
}
