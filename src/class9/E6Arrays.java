package class9;

public class E6Arrays {
    public static void main(String[] args) {
        /* create an array store 10 50 60 45 100 then print elements which are present on odd indexes
        expected output 50 45
         */


        int[] numbers={10,50,60,45,100}; // index 0 1 2 3 4 5
        for(int n=1; n<numbers.length; n+=2){
            System.out.print(numbers[n]+" ");
        }
    }
    }

