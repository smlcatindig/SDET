package class6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter your height in inches");
        int height=scan.nextInt();

        if(height<60){
            System.out.println("short");
        }else if(height>=60 && height<=72){ // use && AND
            System.out.println("medium");
        }else{
            System.out.println("tall");
        }
    }
}
