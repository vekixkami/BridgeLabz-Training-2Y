import java.util.*;

public class MovieBooking {
    private final List<Integer> availableSeats = new ArrayList<>();

    public MovieBooking() {
        for (int i = 1; i <= 100; i++) {
            availableSeats.add(i);
        }
    }

    public void bookSeat(int seatNumber) throws InvalidSeatException, SeatAlreadyBookedException {
        if (!availableSeats.contains(seatNumber)) {
            throw new InvalidSeatException("Invalid seat number: " + seatNumber);
        }

        if (!availableSeats.remove(Integer.valueOf(seatNumber))) {
            throw new SeatAlreadyBookedException("Seat " + seatNumber + " is already booked");
        }
    }

    public static class InvalidSeatException extends Exception {
        public InvalidSeatException(String message) {
            super(message);
        }
    }

    public static class SeatAlreadyBookedException extends Exception {
        public SeatAlreadyBookedException(String message) {
            super(message);
        }
    }
}
