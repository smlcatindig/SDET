package class5;

public class E6LogicalOperators {
    public static void main(String[] args) {

       // System.out.println(true||true||false);

        int age=17;

        if(age<18 || age>60){
            System.out.println("You will get a discount");

        }
        // if the gender is F or age is >60 and if name is NOT Mary you will get a discount

        char gender='F';
        String name="Mary";

        if(gender=='F' || age>60 || name!="Mary"){
            System.out.println("You will get a discount");
        }
    }
}
