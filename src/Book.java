public class Book extends LibraryItem implements Borrowable {
    private String isbn;
    private int numberOfPages;
    private String genre;

    public Book(String itemID, String title, String author, String isbn,  int numberOfPages, String genre){
        super(itemID, title, author);
        this.numberOfPages = numberOfPages;
        this.isbn = isbn;
        this.genre = genre;

    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String newGenre) {

        if (newGenre == null) {
            System.out.println("Cannot Be Null");
        } else {
            this.genre = newGenre;
        }

    }

    public void setPages(int pages){

        if (pages < 0) {
            System.out.println("It Cannot Be a Negative Number!");
        } else if (pages > 0) {
            this.numberOfPages = pages;
        } else {
            System.out.println("It Cannot be a Zero");
        }

    }

    @Override
    public String getItemType() {
        return "Book";
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * 0.50;
    }

    public void borrowItem(String borrowersName) {
        checkedOut(borrowersName);
    }

    @Override
    public void returnItem(){
        checkIn();
    }

    @Override
    public boolean isAvailable() {
        if (!isCheckedOut) {
            return isAvailable();
        } else {
            return isAvailable();
        }

    }

    public int getBorrowingPeriod(){
        return 14;
    }
}
