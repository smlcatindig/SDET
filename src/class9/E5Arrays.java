package class9;

public class E5Arrays {
    public static void main(String[] args) {
        /* write a loop that starts from 0 and it goes till the number 5 and print only
        the even numbers
        create an array of chars and you have to print all the chars on even indexes
         */

        char[] letters = {'a', 'b', 'c', 'd', 'e'};
        for (int l = 0; l < letters.length; l+=2) {
                System.out.println(letters[l]);

            }
        }
    }

