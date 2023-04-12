package class6;

import java.util.Scanner;

public class HWScores {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please input your scores in: Quiz, Midterm and Final");
        int quiz= scan.nextInt();
        int midTerm= scan.nextInt();
        int finalScore= scan.nextInt();
        int averageScore=quiz+midTerm+finalScore;

        if(averageScore>=90){
            System.out.println("grade=A");
        }else if(averageScore>=70 && averageScore<90){
            System.out.println("grade=B");
        }else if(averageScore>=50 && averageScore<70){
            System.out.println("grade=C");
        }else if(averageScore<50){
            System.out.println("grade=F");
        }
    }
}
