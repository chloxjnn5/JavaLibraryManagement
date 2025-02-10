class Book {
    private String title;
    private String isbn;
    private Author author;
    private boolean isBorrowed;

    public Book(String title, String isbn, Author author){
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.isBorrowed = false;
    }

    public String getTitle(){
        return title;
    }

    public String getIsbn(){
        return isbn;
    }

    public Author getAuthor(){
        return author;
    }

    public boolean isBorrowed(){
        return isBorrowed;
    }

    public void borrow(){
        isBorrowed = true;
    }

    public void returnBook(){
        isBorrowed = false;
    }

    public void displayBookDetails(){
        System.out.println("Title: " + title);
        System.out.println("ISBN: " + isbn);
        author.displayAuthorInfo();
        System.out.println("-------------------------");
    }
}
