package class6;

import java.util.Scanner;

public class HWCalculatorIfStatement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a digit");
        int a= scan.nextInt();
        System.out.println("Please enter another digit");
        int b= scan.nextInt();
        System.out.println("Please enter operation(+,-,*,/) to be used");
        char o=scan.next().charAt(0);

        if(o == '+'){
            System.out.println(a+b);
        }else if(o == '-'){
            System.out.println(a-b);
        }else if(o == '*'){
            System.out.println(a*b);
        }else if(o == '/'){
            System.out.println(a/b);
        }
    }
}
