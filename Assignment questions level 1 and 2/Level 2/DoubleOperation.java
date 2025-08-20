import java.util.Scanner;

public class DoubleOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        double c = scanner.nextDouble();
        scanner.close();
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;
        System.out.printf("The result of a + b * c is: %d%n", result1);
        System.out.printf("The result of a * b + c is: %d%n", result2);
        System.out.printf("The result of c + a / b is: %d%n", result3);
        System.out.printf("The result of a % b + c is: %d%n", result4);
    }
}


