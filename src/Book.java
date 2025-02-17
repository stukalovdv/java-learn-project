public class Book {
    private String title;
    private String author;
    private int year;

    Book(String title, String author, int year) {
        setTitle(title);
        setAuthor(author);
        setYear(year);
    }

    protected String getTitle() {
        return title;
    }
    protected String getAuthor() {
        return author;
    }
    protected int getYear() {
        return year;
    }

    private void setTitle(String title) {
        this.title = title;
    }
    private void setAuthor(String author) {
        this.author = author;
    }
    private void setYear(int year) {
        this.year = year;
    }
}
