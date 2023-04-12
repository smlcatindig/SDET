package class8;

import java.util.Scanner;

public class E1WhileLoop {
    public static void main(String[] args) {
        // write code to print all the numbers from a starting, ending point and the step number
        // ask user for starting, ending point and step number
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a starting point, the ending point and the step number");
        int start= scan.nextInt();
        int end= scan.nextInt();
        int step= scan.nextInt();

        int counter=start;
        while(counter<=end){
            System.out.print(counter+" ");
            counter=counter+step; // counter+=step;
        }
        }
    }