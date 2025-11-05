import java.util.Random;

public class Transaction {
    public static void main(String[] args) {
        Random random = new Random();
        int amount = random.nextInt(100);
        int balance = 100;

        try {
            if (amount < 0) {
                throw new NegativeAmountException("Negative amount");
            }
            if (amount > balance) {
                throw new InsufficientFundsException("Insufficient balance");
            }
            if (random.nextBoolean()) {
                throw new NetworkFailureException("Network failure");
            }
            balance -= amount;
            System.out.println("Transaction successful");
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } catch (NetworkFailureException e) {
            System.out.println(e.getMessage());
        }
    }
}

class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class NetworkFailureException extends Exception {
    public NetworkFailureException(String message) {
        super(message);
    }
}
