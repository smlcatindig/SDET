package class4;

// double shift and then press auto import and then check the checkbox of "add unambiguous imports on the fly then press apply and then ok
import java.util.Scanner;

public class E5Scanner {
    public static void main(String[] args) {

        /* Scanner is a class (which knows how to take input from the keyboard)
            scan => is a variable type of scanner just like we create a variable of type String
             new => is a special keyword which create the object of class
             Scanner again with ()
             System.in => means we want to use the scanner class for taking the user input */
        // Whenever we need to take the input from the user we need this code
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter your name");
        // Calling the next method to take a String from the user
        String name=scan.next();
        System.out.println("You are amazing "+name);



    }
}
