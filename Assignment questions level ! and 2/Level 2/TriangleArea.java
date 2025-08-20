// Write a program that takes the base and height in cm to find the area of a triangle in square inches and square centimeters 
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle in centimeters: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle in centimeters: ");
        double height = scanner.nextDouble();
        scanner.close();
        double areaInSquareCentimeters = 0.5 * base * height;
        double areaInSquareInches = areaInSquareCentimeters * 10.76391; // 1 square centimeter = 10.76391 square inches
        System.out.printf("The area of the triangle is %.2f square centimeters (%.2f square inches).%n", areaInSquareCentimeters, areaInSquareInches);
    }
}
