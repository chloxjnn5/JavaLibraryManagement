import java.util.List;
import java.util.ArrayList;

class Borrower {
    private String name;
    private List<Book> borrowedBooks;

    public Borrower(String name){
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void borrowBook(Book book){
        if(!book.isBorrowed()){
            borrowedBooks.add(book);
            book.borrow();
            System.out.println(name + " borrowed: " + book.getTitle());
        }else{
            System.out.println(book.getTitle() + "is already borrowed.");
        }
    }

    public void returnBook(Book book){
        if(borrowedBooks.remove(book)){
            book.returnBook();;
            System.out.println(name + " returned: " + book.getTitle());
        }else{
            System.out.println(name + " did not borrow " + book.getTitle());
        }
    }

    public void displayBorrowedBooks(){
        System.out.println(name + "'s Borrowed Books:");
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books borrowed.");
        }else{
            for(Book book : borrowedBooks){
                book.displayBookDetails();
            }
        }
    }
}
