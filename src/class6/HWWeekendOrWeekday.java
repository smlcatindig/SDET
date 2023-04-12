package class6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HWWeekendOrWeekday {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What is the day today?");
        int day= scan.nextInt();

        if(day>=1 && day<=5){
            System.out.println("Its a weekday");
        }else if(day==6 || day==7){
            System.out.println("Its a weekend");
        }else{
            System.out.println("Invalid day");
        }
    }
}
