// Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
import java.util.Scanner;

public class price {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the unit price of the item: ");
        double unitPrice = scanner.nextDouble();
        System.out.print("Enter the quantity to be bought: ");
        int quantity = scanner.nextInt();
        scanner.close();
        double totalPrice = unitPrice * quantity;
        System.out.printf("The total price is: %.2f%n", totalPrice);
    }
}
