package class9;

public class HW6 {
    public static void main(String[] args) {
        /* Create an array of integers and calculate the sum
        of all elements in an array
         */

        int[]numbers=new int[6];
        int num=22;
        for(int i=0; i<numbers.length; i++) {
            numbers[i] = num;
            num+=num;
        }
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
