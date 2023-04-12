package class9;

import java.awt.datatransfer.StringSelection;

public class E4Arrays {
    public static void main(String[] args) {
        /* create an array of Strings store 5 names in that array
        print all of the names from that array with the help of a for loop
        try printing with the help of a while loop as well
         */

        String[] names={"Suzy","Ryan","Sarah","Shon","Cel"};
        for(int n=0; n<names.length; n++){ //int n is the start; n<names.length is the end; n++ is the step
            System.out.print(names[n]+" ");
        }
        System.out.println();
        int counter=0;
        while(counter<names.length){
            System.out.print(names[counter]+" ");
            counter++;
        }

    }
}
