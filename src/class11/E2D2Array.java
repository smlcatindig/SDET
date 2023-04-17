package class11;

public class E2D2Array {
    public static void main(String[] args) {
        String[][] names = {
                {"Sarah", "Artem", "Lean", "Samir" },
                {"Farwa", "Halima", "Alina", "Semir" }
        };

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.print(names[i][j] + " ");
            }
            System.out.println();
        }

        //enhanced loop:
        for(String[]nameArr: names){
            for(String name: nameArr){
                System.out.println(name);
            }
        }
    }
}
