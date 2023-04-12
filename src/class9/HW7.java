package class9;

public class HW7 {
    public static void main(String[] args) {
        /* From an array of integer elements find the largest number.

         */
        int[]numbers={10,50,90,85};
        int largest=numbers[0];
        for(int i=0; i<= numbers.length-2; i++) {
            largest = numbers[i];
        }
            System.out.println(largest);
        }
    }
