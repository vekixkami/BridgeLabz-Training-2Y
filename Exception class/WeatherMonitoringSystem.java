import java.util.Scanner;

public class WeatherMonitoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();
        char unit = scanner.next().charAt(0);

        try {
            validateTemperature(temperature, unit);
            double convertedTemperature = convertTemperature(temperature, unit);
            System.out.println("Temperature in Fahrenheit: " + convertedTemperature);
        } catch (InvalidTemperatureException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static double convertTemperature(double temperature, char unit) {
        if (unit == 'C') {
            return (temperature * 9 / 5) + 32;
        } else if (unit == 'F') {
            return (temperature - 32) * 5 / 9;
        }
        throw new InvalidTemperatureException("Invalid unit");
    }

    public static void validateTemperature(double temperature, char unit) throws InvalidTemperatureException {
        if (unit == 'C' && temperature < -273.15) {
            throw new InvalidTemperatureException("Temperature below absolute zero is not possible!");
        } else if (unit == 'F' && temperature < -459.67) {
            throw new InvalidTemperatureException("Temperature below absolute zero is not possible!");
        }
    }

    public static class InvalidTemperatureException extends Exception {
        public InvalidTemperatureException(String message) {
            super(message);
        }
    }
}
