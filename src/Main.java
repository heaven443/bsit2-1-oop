class Book {

    String title = "";
    String author = "";
    int pages = 0;
    boolean isAvailable = false;

    public void bookInfo (String bookTitle, String bookAuthor, int bookPages, boolean bookStock) {
        title = bookTitle;
        author = bookAuthor;
        pages = bookPages;
        isAvailable = bookStock;

    }
// Code to display the information that is given by the "bookInfo" table.
    public void displayBook() {
        System.out.println("\nBook Information :");
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("# of Pages : " + pages);
        System.out.println("Available? : " + isAvailable);
    }

// Code to check if the Book is Available or not
    public void borrowBook() {
        if (isAvailable) {
            System.out.println("You have Borrowed the book '" + title + "'");
            isAvailable = false;
        } else {
            System.out.println("The book '" + title + "' is not available!");
        }
    }
}

class BCC{
    public static void main(String[] args){

        Book Book1 = new Book();
        Book Book2 = new Book();

// Book Title, Author, Pages, and Availablity
        Book1.bookInfo("Little Red Riding Hood", "The Brothers Grimm", 32, true);
        Book2.bookInfo("Alice in Wonderland", "Lewis Carroll", 105, false);

        System.out.println("\nLogs :");
// Borrowing the book
        Book1.borrowBook();
        Book2.borrowBook();

// Display All the book
        Book1.displayBook();
        Book2.displayBook();

    }
}
