package class7;

import java.util.Scanner;

public class E13WhileLoop {
    public static void main(String[] args) {
        // ask the user for a number and then print all the numbers from 1 to that number
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number greater than 1");
        int number=scan.nextInt();

        int counter=1;
        while (counter<=number) {
            System.out.print(counter+" ");
            counter++;


        }
    }
}
