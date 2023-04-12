package class4;

import java.util.Scanner;

public class HWDmvRep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("age");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Issue driver's license");
        } else {
            System.out.println("Offer learner's permit");
        }
    }
}