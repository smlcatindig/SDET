package class9;

public class E11Arrays {
    public static void main(String[] args) {
        /* There are two ways of creating arrays
        new int[5]=> create an array of int with size 5
         */

        int[]numbers= new int[5]; // array
        numbers[0]=50; // store 50 on index 0
        numbers[1]=60; // store 100 on index 1
        numbers[2]=70;

        for (int number: numbers) {
            System.out.println(number);

        }
    }
}
