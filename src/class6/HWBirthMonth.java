package class6;

import java.util.Scanner;

public class HWBirthMonth {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter birth month");
        String month= scan.nextLine();

        if(month.equals("March") || month.equals("April") || month.equals("May")){
            System.out.println("You were born on season Spring");
        }else if(month.equals("June") || month.equals("July") || month.equals("August")){
            System.out.println("You were born on season Summer");
        }else if(month.equals("September") || month.equals("October") || month.equals("November")){
            System.out.println("You were born on season Autumn");
        }else if(month.equals("December") || month.equals("January") || month.equals("February")){
            System.out.println("Your were born on season Winter");
        }
    }
}
