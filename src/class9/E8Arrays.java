package class9;

public class E8Arrays {
    public static void main(String[] args) {
        // print all the numbers from 6 to 0 in reverse order
        // output 6 5 4 3 2 1 0
            // {'A','B','C','D','E','F'}

            char[] letters={'A','B','C','D','E','F'};
            for(int l=letters.length-1; l>=0; l--){
                System.out.println(l+" "+letters[l]);
            }
        }
    }
