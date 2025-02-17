import java.util.ArrayList;

public class Library {
    Library() {
        booksList = new ArrayList<Book>();
    }
    public ArrayList<Book> booksList;
    void addBook(Book book) {
        booksList.add(book);
    }
}
