package class4;

import java.util.Scanner;

public class HWTemp {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter your city");
        String city=scanner.next();

        System.out.println("Please enter temperature in farenheight");
        int farenheight=scanner.nextInt();

        int celsius=(farenheight-32)*5/9; //farenheight to celsius conversion

        System.out.println("The temperature in "+city+" is "+celsius+" degree celsius");





        }
}
