package class7;

public class E14WhileLoop {
    public static void main(String[] args) {
        int i=1;
        while(i<5){
            System.out.println(i);
            i++;
        }
        System.out.println(); // just to make space

        for(int j=1;j<5;j++){ // shortcut to loop
            System.out.println(j);
        }
    }
}
