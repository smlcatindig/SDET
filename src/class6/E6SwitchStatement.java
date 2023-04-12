package class6;

public class E6SwitchStatement {
    public static void main(String[] args) {
    // only byte, short, int, char and String data types are allowed
        // we cannot use relational operators (== != > < >= <=)
        // we cannot use the logical operators as well
        String name="David";

        switch(name){
            case"Suzy":
                System.out.println("Catindig");
                break;
            case"Ryan":
                System.out.println("Sebastian");
                break;
            case"Celia":
                System.out.println("Lauchengco");
            default:
                System.out.println("No Surname");

        }
    }
}
