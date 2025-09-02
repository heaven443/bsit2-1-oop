import java.util.ArrayList;
import java.util.Scanner;

class LibraryManager {

    private ArrayList<String> books;
    private Scanner scanner;

    public LibraryManager() {
        books = new ArrayList<>();
        books.add("Java Programming");
        books.add("Web Development");
        books.add("Database Design");
        scanner = new Scanner(System.in);
    }

    public void showBooks() {
        try {
            if (books == null) {
                throw new IllegalStateException("Book list is not initialized.");
            }

            System.out.println("\n--- Current Books ---");
            if (books.isEmpty()) {
                System.out.println("No books available.");
            } else {
                for (int i = 0; i < books.size(); i++) {
                    System.out.println((i + 1) + ". " + books.get(i));
                }
            }
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Display operation completed.\n");
        }
    }

    public void addBook() {
        boolean success = false;
        while (!success) {
            try {
                System.out.print("Enter book title to add: ");
                String title = scanner.nextLine();

                if (title == null || title.trim().isEmpty()) {
                    throw new IllegalArgumentException("Book title cannot be empty! \n");
                }

                if (title.trim().length() < 3) {
                    throw new IllegalArgumentException("Book title must be at least 3 characters long! \n");
                }

                books.add(title.trim());
                System.out.println("Book '" + title.trim() + "' added successfully!");
                success = true;

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                if (success) {
                    System.out.println("Add book operation completed.\n");
                }
            }
        }
    }

    public void removeBook() {
        if (books.isEmpty()) {
            System.out.println("No books to remove.");
            return;
        }

        boolean success = false;
        while (!success) {
            try {
                System.out.print("Enter book number to remove (1-" + books.size() + "): ");
                String input = scanner.nextLine();
                int index = Integer.parseInt(input) - 1;

                if (index < 0 || index >= books.size()) {
                    System.out.println("Error: Invalid book number! Please enter between 1 and " + books.size() + ". \n");
                    continue;
                }

                String removedBook = books.remove(index);
                System.out.println("Book '" + removedBook + "' removed successfully!");
                success = true;

            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid number! \n");
            } finally {
                if (success) {
                    System.out.println("Remove book operation completed.\n");
                }
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("≡≡≡ Library Management System ≡≡≡\n");

        LibraryManager library = new LibraryManager();
        library.showBooks();
        library.addBook();
        library.removeBook();

        System.out.println("Program completed successfully.");
    }
}
