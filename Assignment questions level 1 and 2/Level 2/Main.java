// Write a program to find the side of the square whose parameter you read from the user 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the side of the square: ");
        int sideLength = scanner.nextInt();
        scanner.close();

        int sideOfSquare = (int) Math.sqrt(sideLength);
        System.out.println("The side of the square is: " + sideOfSquare);
    }
}
