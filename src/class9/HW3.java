package class9;

public class HW3 {
    public static void main(String[] args) {
        /* Create an array of words: Java, Saturday, day, coding, is.
        Print the following sentence using elements of array:
        “Saturday is Java coding day”.
         */

        String[]words={"Java", "Saturday", "day", "coding", "is"};

        String[]word=new String[5];
        words[1]="Saturday";
        words[4]="is";
        words[0]="Java";
        words[3]="coding";
        words[2]="day";
        System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
            }


        }