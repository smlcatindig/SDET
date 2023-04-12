package class8;

import java.util.Scanner;

public class E2WhileLoop {
    public static void main(String[] args) {
        // in a while loop ask the user to enter numbers and if user enters any number
        // other than -1, print "Hello World" and keep on asking the user for a number
        // the moment the user enters the number -1 the loop should stop

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number");
        int number= scan.nextInt();

        while (number!=-1){
            System.out.println("Try again");
            number= scan.nextInt();
        }
    }
}
