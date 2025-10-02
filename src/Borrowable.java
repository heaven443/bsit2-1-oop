interface Borrowable {
    void borrowItem(String borrowerName);
    void returnItem();
    boolean isAvailable();
    int getBorrowingPeriod(); // in Days
    default String getBorrowingStatus() {

        return isAvailable() ? "Available for Borrowing" : "Currently Borrowed";

    }
}
