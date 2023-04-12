package class4;

import java.util.Scanner;

public class E7Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.next();

        if (name.equals("Suzy")) {
            System.out.println(name.equals("Mac user"));
        } else if (name.equals("Ryan")) {
            System.out.println("Naughty");
        } else if (name.equals("Sarah")) {
            System.out.println("Best");
        } else if(name.equals("Shonna")) {
            System.out.println("Nice");
        }


    }
}
