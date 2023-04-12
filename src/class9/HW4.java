package class9;

public class HW4 {
    public static void main(String[] args) {
        /* Create an array of cars and store 6 elements into it.
        Using 2 different loops print all values from the array.
         */

        String[]car={"BMW", "Benz", "Corvette", "Audi", "Rover","Porsche"};
        for(int n=0; n<car.length; n++){
            System.out.println(car[n]);
        }

        System.out.println();
        int counter=0;
        while(counter< car.length){
            System.out.println(car[counter]);
            counter++;
        }
    }
}
