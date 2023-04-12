package class3;

public class E8StringConcat {
    public static void main(String[] args) {

        System.out.println("Leo"+10+10);
        System.out.println(10+10+"Leo");
        System.out.println("Leo"+(10+10)); // Due to parenthesis addition will be performed first
        // Left to right rule is not applicable to math
        System.out.println(2+2*2);
        System.out.println((2+2)*2); // use parenthesis () to apply operations
    }
}
