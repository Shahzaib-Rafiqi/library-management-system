public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books to the library
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        Book book2 = new Book("1984", "George Orwell", "9780451524935");
        library.addBook(book1);
        library.addBook(book2);

        // Register members
        Member member1 = new Member("Alice", "M001");
        Member member2 = new Member("Bob", "M002");
        library.registerMember(member1);
        library.registerMember(member2);

        // Display all books
        library.showBooks();

        // Borrow and return books
        member1.borrowBook(book1);
        member1.showBorrowedBooks();

        member1.returnBook(book1);
        member1.showBorrowedBooks();

        // Attempt to borrow a book that's already borrowed
        member2.borrowBook(book1);
        member1.borrowBook(book1);  
    }
}