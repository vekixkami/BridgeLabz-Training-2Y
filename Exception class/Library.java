import java.util.*;
import java.util.logging.Logger;

public class Library {
    private static final Logger log = Logger.getLogger(Library.class.getName());
    private final Map<String, Set<String>> checkedOutBooks = new HashMap<>();
    private final Map<String, Integer> userBookCount = new HashMap<>();
    private final Map<String, String> userAddress = new HashMap<>();

    public void borrowBook(String userId, String bookName) throws BookNotAvailableException {
        if (checkedOutBooks.containsKey(bookName)) {
            throw new BookNotAvailableException("Book " + bookName + " is not available");
        }
        checkedOutBooks.computeIfAbsent(userId, k -> new HashSet<>()).add(bookName);
        userBookCount.put(userId, userBookCount.getOrDefault(userId, 0) + 1);
        log.info(userId + " borrowed " + bookName);
    }

    public void returnBook(String userId, String bookName) throws InvalidReturnException {
        if (!checkedOutBooks.containsKey(userId) || !checkedOutBooks.get(userId).contains(bookName)) {
            throw new InvalidReturnException("Book " + bookName + " is not borrowed by " + userId);
        }
        checkedOutBooks.get(userId).remove(bookName);
        userBookCount.put(userId, userBookCount.get(userId) - 1);
        log.info(userId + " returned " + bookName);
    }

    public void setUserAddress(String userId, String address) {
        userAddress.put(userId, address);
    }

    public String getUserAddress(String userId) {
        return userAddress.get(userId);
    }

    public void checkOutLimit(String userId) throws UserLimitExceededException {
        if (userBookCount.getOrDefault(userId, 0) >= 5) {
            throw new UserLimitExceededException(userId + " has exceeded the book borrowing limit");
        }
    }

    public static class BookNotAvailableException extends Exception {
        public BookNotAvailableException(String message) {
            super(message);
        }
    }

    public static class InvalidReturnException extends Exception {
        public InvalidReturnException(String message) {
            super(message);
        }
    }

    public static class UserLimitExceededException extends Exception {
        public UserLimitExceededException(String message) {
            super(message);
        }
    }
}
