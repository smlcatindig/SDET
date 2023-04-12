package class9;

import org.w3c.dom.ls.LSOutput;

public class HW1 {
    public static void main(String[] args) {

        /* Create an array of chars and store grades into it: A,B,C,D.
        Then print a grade B (use 2 different ways of creating an array).
         */
        char[] letters = {'A', 'B', 'C', 'D'};
        System.out.println(letters[1]);

        System.out.println();

        char[] grades = new char[4];
        grades[0] = 'A';
        grades[1] = 'B';
        grades[2] = 'C';
        grades[3] = 'D';
        System.out.println(grades[1]);

    }

        }
