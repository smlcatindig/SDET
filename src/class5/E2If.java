package class5;

import java.util.Scanner;

public class E2If {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in); // helps us get any type of data from the console

        System.out.println("is it time for a break true/false"); // prints the text inside the "" in the console

        // boolean isBreak => we are creating a variable of type boolean and calling it isBreak
        // scanner => is also a variable of type scanner
        // nextBoolean() => method that helps us take boolean type data from the keyboard
        // = => equal to sign will store that value inside the isBreak variable
        boolean isBreak=scanner.nextBoolean();

        if(isBreak){ // true/false
            System.out.println("Let's have a break");
        }else{
            System.out.println("Let's study");
        }
    }
}
