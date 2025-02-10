import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books;

    public Library(){
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added to library: " + book.getTitle());
    }

    public void borrowBook(Borrower borrower, Book book){
        if (books.contains(book) && !book.isBorrowed()) {
            borrower.borrowBook(book);
        }else{
            System.out.println("The book " + book.getTitle() + " is not available for borrowing.");
        }
    }

    public void returnBook(Borrower borrower, Book book){
        borrower.returnBook(book);
    }

    public void displayLibraryBooks(){
        System.out.println("Books in Library:");
        boolean availableBooks = false;
        for (Book book : books){
            if (!book.isBorrowed()) {
                book.displayBookDetails();
                availableBooks = true;
            }
        }
        if (!availableBooks) {
            System.out.println("No available books in the library.");
        }
    }
}