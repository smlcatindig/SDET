package class7;

public class E7WhileLoop {
    public static void main(String[] args) {
        // print these numbers in one line 3 5 7 9 11 13 with a while loop

        int counter=3;
        while(counter<=13){
            System.out.print(counter+" "); // use print instead of println
            counter+=2;
        }
    }
}
