package class7;

public class HW4 {
    public static void main(String[] args) {
        int number = 20;
        while (number <= 50) {
            if (number % 2 == 1) {
                System.out.print(number+" ");
            }
            number++;
        }
        System.out.println();
        for (int nu = 20; nu <= 50; nu++) {
            if (nu % 2 != 0) {
                System.out.print(nu+" ");
            }
        }
    }
}
