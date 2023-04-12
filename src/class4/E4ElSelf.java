package class4;

public class E4ElSelf {
    public static void main(String[] args) {
        String fruit = "Apple"; // if none of the conditions met, then java will choose the else part

        if (fruit.equals("Orange")) {
            System.out.println("You have to pay $12");
        } else if (fruit.equals("Banana")) {
            System.out.println("You have to pay for $5");
        } else if (fruit.equals("Apple")) {
            System.out.println("You have to pay for $4");
        } else {
            System.out.println("This fruit is not available");
        }
    }
}