import java.util.Scanner;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class ATM {
    private int balance;

    public ATM(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds");
        }
        balance -= amount;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter balance: ");
        int balance = scanner.nextInt();
        ATM atm = new ATM(balance);
        try {
            System.out.print("Enter amount to withdraw: ");
            int amount = scanner.nextInt();
            atm.withdraw(amount);
            System.out.println("Withdrawal successful");
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
