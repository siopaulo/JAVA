package LibrarySystem;

import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please choose an option:");
            System.out.println("1. Add a book");
            System.out.println("2. Remove a book");
            System.out.println("3. Search for a book by title");
            System.out.println("4. Search for a book by author");
            System.out.println("5. List all books");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter the book title:");
                    String title = scanner.nextLine();
                    System.out.println("Enter the book author:");
                    String author = scanner.nextLine();
                    System.out.println("Enter the publication year:");
                    String year = scanner.nextLine();

                    Book newBook = new Book(title, author, year);
                    library.addBook(newBook);
                    System.out.println("Book added successfully!");
                    break;
                case 2:
                    System.out.println("Enter the title of the book you want to remove:");
                    String bookTitle = scanner.nextLine();
                    boolean removed = library.removeBook(bookTitle);

                    if (removed) {
                        System.out.println("Book removed successfully!");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 3:
                    System.out.println("Enter the title of the book you want to search for:");
                    String searchTitle = scanner.nextLine();
                    Book foundBook = library.searchByTitle(searchTitle);

                    if (foundBook != null) {
                        System.out.println("Book found: " + foundBook);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 4:
                    System.out.println("Enter the author of the books you want to search for:");
                    String searchAuthor = scanner.nextLine();
                    System.out.println("Books by " + searchAuthor + ": " + library.searchByAuthor(searchAuthor));
                    break;
                case 5:
                    System.out.println("All books in the library: " + library.getAllBooks());
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}