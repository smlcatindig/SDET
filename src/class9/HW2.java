package class9;

public class HW2 {
    public static void main(String[] args) {
        /* Create an array of names and store all names of your group.
        Then print your name from that array.
        (use 2 different ways of creating an array).
         */

        String[] names={"Alamir","Bhowmik","Sarah","Tahmin","Uros","Veronica","Yevgeniya","Yuri","Zak","Suzy"};
        for(int n=9; n< names.length; n++ ){
            System.out.println(names[n]);
        }
        System.out.println();
        int counter=9;
        while(counter<names.length){
            System.out.println(names[counter]);
            counter++;

        }
    }
}
