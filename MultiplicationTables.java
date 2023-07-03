import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();

        generateMultiplicationTables(limit);
    }

    public static void generateMultiplicationTables(int limit) {
        for (int i = 1; i <= 9; i++) {
            System.out.println("Multiplication table of " + i + ":");

            for (int j = 1; j <= limit; j++) {
                int result = i * j;
                System.out.println(i + " x " + j + " = " + result);
            }

            System.out.println(); // Add a blank line after each table
        }
    }
}
