// Write a program to find the distance in yards and miles for the distance provided by the user in feet
import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        int distanceInFeet = scanner.nextInt();
        scanner.close();

        double distanceInYards = distanceInFeet / 3.0;
        double distanceInMiles = distanceInFeet / 5280.0;

        System.out.printf("The distance in yards is: %.2f%n", distanceInYards);
        System.out.printf("The distance in miles is: %.2f%n", distanceInMiles);
    }
}
