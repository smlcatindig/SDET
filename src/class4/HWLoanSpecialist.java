package class4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HWLoanSpecialist {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Amount of loan needed");
        int loan= scanner.nextInt();
        if(loan<=200000){
            System.out.println("Lend money");
        }else{
            System.out.println("Reject the client");
        }


    }
}
