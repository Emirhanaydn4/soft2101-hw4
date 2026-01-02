import java.util.Scanner;

public class RangePrinter {

    public static void printRange(int a, int b) {
        int start = Math.min(a, b);
        int end = Math.max(a, b);

        for (int i = start + 1; i < end; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = input.nextInt();

        System.out.print("Enter second number: ");
        int y = input.nextInt();

        printRange(x, y);
    }
}
