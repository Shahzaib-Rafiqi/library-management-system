import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private String memberId;
    private List<Book> borrowedBooks;

    // Constructor
    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getMemberId() {
        return memberId;
    }

    // Borrow a book
    public void borrowBook(Book book) {
        if (borrowedBooks.contains(book)) {
            System.out.println("Book already borrowed: " + book);
        } else {
            borrowedBooks.add(book);
            System.out.println("Book borrowed: " + book);
        }
    }

    // Return a book
    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            System.out.println("Book returned: " + book);
        } else {
            System.out.println("Book not borrowed: " + book);
        }
    }

    // Show borrowed books
    public void showBorrowedBooks() {
        System.out.println("Borrowed books by " + name + ":");
        for (Book book : borrowedBooks) {
            System.out.println(book);
        }
    }
}