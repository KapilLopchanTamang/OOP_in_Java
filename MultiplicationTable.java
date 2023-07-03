import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();

        generateMultiplicationTable(5, limit);
    }

    public static void generateMultiplicationTable(int number, int limit) {
        System.out.println("Multiplication table of " + number + ":");

        for (int i = 1; i <= limit; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}
