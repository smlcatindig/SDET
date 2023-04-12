package class4;

public class E2IfElseStatement {
    public static void main(String[] args) {
        // String is a non-primitive data type and we can't use == sign
        // Use (name.equals("")) instead
        // can't use relational operators

        String name="Suzy";

        //name.equals("Ryan") => checks if name and the value that we write inside equals() are same or not
        if(name.equals("Ryan")){
            System.out.println("I like swimming");
        } else {
            System.out.println("I like programming");
        }
    }
}
