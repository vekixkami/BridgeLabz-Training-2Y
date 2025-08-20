// Write a program to take 2 numbers and print their quotient and reminder
import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        scanner.close();
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        System.out.printf("The quotient is: %d%n", quotient);
        System.out.printf("The remainder is: %d%n", remainder);
    }
}
