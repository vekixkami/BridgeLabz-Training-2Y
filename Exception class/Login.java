import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username, password;
        boolean loggedIn = false;

        do {
            System.out.print("Enter username: ");
            username = scanner.next();
            System.out.print("Enter password: ");
            password = scanner.next();

            try {
                validate(username, password);
                loggedIn = true;
                System.out.println("Login successful");
            } catch (InvalidCredentialsException e) {
                System.out.println("Invalid credentials. Please try again.");
            }
        } while (!loggedIn);
    }

    public static void validate(String username, String password) throws InvalidCredentialsException {
        String validUsername = "admin";
        String validPassword = "password";

        if (!username.equals(validUsername) || !password.equals(validPassword)) {
            throw new InvalidCredentialsException("Invalid credentials");
        }
    }

    static class InvalidCredentialsException extends Exception {
        public InvalidCredentialsException(String message) {
            super(message);
        }
    }
}
