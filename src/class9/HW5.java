package class9;

public class HW5 {
    public static void main(String[] args) {
        /*
        Create an array of animals and store 5 elements into it.
        Using 2 different loops print all elements from the array.
         */

        String[] animals={"Elephant", "Dog", "Cat", "Lizard", "Butterfly"};
        for(int a=0; a<animals.length; a++){
            System.out.println(animals[a]);
        }
        System.out.println();
        int counter=0;
        while(counter< animals.length){
            System.out.println(animals[counter]);
            counter++;
        }
    }
}
