import java.util.ArrayList;

class Book {

    private String title;
    private String author;
    private ArrayList<Integer> ratings;
    private static int totalBooks = 0;

    public Book(String title, String author) {

        this.title = title;
        this.author = author;
        this.ratings = new ArrayList<>();
        totalBooks++;

    }

    public void addRating(int rating) throws IllegalArgumentException {
        if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("Invalid rating: must be 1-5 stars");
        }
            ratings.add(rating);
    }

    public double getAverageRating(){

        double sum = 0;
        for (Integer num : ratings) {
            sum += num;
        }

        double average = sum / ratings.size();
        return average;

    }

    public String getPopularityLevel(){

        String popularityLevel = "";

        if (getAverageRating() >= 4.5) {
            popularityLevel = "Excellent";
        } else if (getAverageRating() >= 3.5) {
            popularityLevel = "Good";
        } else if (getAverageRating() >= 2.5) {
            popularityLevel = "Average";
        } else if (getAverageRating() >= 1.5) {
            popularityLevel = "Poor";
        } else if (getAverageRating() >= 1.0) {
            popularityLevel = "Terrible";
        } else {
            return "No ratings";
        }

        return popularityLevel;
    }

    public void addMultipleRatings(int... ratings) {

        for (int rating : ratings) {
            try {
                addRating(rating);
            } catch (IllegalArgumentException e) {
                System.out.println("Error adding rating " + rating + ": " + e.getMessage());
            }

        }
    }

    public static int getTotalBooks(){
        return totalBooks;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String displayBook(){
        return "Book: " + title + ", By : " + author + ", Average Rating: " + getAverageRating() + ", Level : " + getPopularityLevel();
    }

}


class main {
    public static void main(String[] args) {


        Book Book1 = new Book("Java Programming", "John Smith");
        Book Book2 = new Book("Data Structures", "Alice Brown");
        Book Book3 = new Book("Web Development", "Bob Wilson");

        try {
            Book1.addRating(4);
            Book1.addRating(6);
        } catch (IllegalArgumentException e) {
            System.out.println("Failed to add rating to book1: " + e.getMessage());
        } finally {
            System.out.println("Sucessfully Added Rating");
        }

        Book2.addMultipleRatings(5 ,4 ,3, 5, 6);
        Book3.addMultipleRatings(2, 1, 0);

        try {
            Book1.addRating(0);
        } catch (IllegalArgumentException e) {
            System.out.println("Failed to add invalid rating to book1: " + e.getMessage());
        } finally {
            System.out.println("Sucessfully Added Rating");
        }

        System.out.println("\nBook Details:");
        System.out.println(Book1.displayBook());
        System.out.println(Book2.displayBook());
        System.out.println(Book3.displayBook());

        System.out.println("\nTotal Books Created: " + Book.getTotalBooks());

        Book highestRated = Book1;
        if (Book2.getAverageRating() > highestRated.getAverageRating()) {
            highestRated = Book2;
        }
        if (Book3.getAverageRating() > highestRated.getAverageRating()) {
            highestRated = Book3;
        }

        System.out.println("\nBook with highest average rating:");
        System.out.println(highestRated.displayBook());
    }
}
