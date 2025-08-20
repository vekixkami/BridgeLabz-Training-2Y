//Write a program to create a basic calculator for addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float num1 = scanner.nextFloat();
        System.out.print("Enter second number: ");
        float num2 = scanner.nextFloat();

        System.out.print("Sum: " + (num1 + num2) + "\n");
        System.out.print("Difference: " + (num1 - num2) + "\n");
        System.out.print("Product: " + (num1 * num2) + "\n");
        if (num2 != 0) {
            System.out.print("Quotient: " + (num1 / num2) + "\n");
        }
        scanner.close();
    }
}

