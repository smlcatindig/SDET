package class9;

public class E7Arrays {
    public static void main(String[] args) {
        boolean[] flags = {true, false, true, false, false, true};
        // write  a loop to count how many values in above array are false
        int counter=0;
        for (int f = 0; f < flags.length; f++) {
            if (!flags[f]) {
                counter++;

            }
        }
        System.out.println(counter);
    }
}
