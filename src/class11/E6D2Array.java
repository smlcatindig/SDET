package class11;

public class E6D2Array {
    public static void main(String[] args) {
        int[][]arr2D={
                {10, 20, 30, 40, 50}, // 150
                {1, 2, 3, 4, 5}, // 15
                {5, 5, 5, 5, 5}, // 25
                {10, 8, 6, 4, 2} // 30
        };
        // with the help of loop you can add all the elements from each row and print their sum

        int sum=0;
        for(int[] arr1D: arr2D){
            for(int num: arr1D){
                sum=sum+num;
            }
            System.out.println(sum);
            sum=0;
        }
    }
}
