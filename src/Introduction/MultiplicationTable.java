package Introduction;

public class MultiplicationTable {
    public static void main(String[] args) {
        // display the table heading
        System.out.println("          Multiplication Table");

        // display the number title
        System.out.println("    ");
        for (int j = 1; j <= 9; j++)
            System.out.println("  " + j);

        System.out.println("\n-----------------------------------");

        // display table body
        for (int i = 0; i <= 9; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j <= 9; j++) {
                // display the product and align properly
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
