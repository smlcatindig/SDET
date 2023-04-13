package class9;

public class HW7 {
    public static void main(String[] args) {
        /* From an array of integer elements find the largest number.

         */
        int[] numbers = {10, 50, 90, 85};
        // enhanced for loop
        int largest = numbers[0];
        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println(largest);
    }
}

