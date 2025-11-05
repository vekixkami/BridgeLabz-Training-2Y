import java.time.LocalDate;

public class MaintenanceTracker {
    private LocalDate serviceDate;
    private int mileageReading;

    public MaintenanceTracker(LocalDate serviceDate, int mileageReading) {
        this.serviceDate = serviceDate;
        this.mileageReading = mileageReading;
    }

    public void checkMaintenance() throws ServiceOverdueException, InvalidMileageException {
        if (serviceDate.isBefore(LocalDate.now())) {
            throw new ServiceOverdueException("Service is overdue");
        }
        if (mileageReading < 0) {
            throw new InvalidMileageException("Invalid mileage reading");
        }
    }

    public static class ServiceOverdueException extends Exception {
        public ServiceOverdueException(String message) {
            super(message);
        }
    }

    public static class InvalidMileageException extends Exception {
        public InvalidMileageException(String message) {
            super(message);
        }
    }
}
