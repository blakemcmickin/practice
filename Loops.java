import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter number");
            int input = scanner.nextInt();

            for (int i = 1; i <= input; i++) {
                System.out.println(i);
            }
        }
    }
}