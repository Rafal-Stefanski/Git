package pl.sda.mini_project.books;

public class Book {
    private static int COUNT = 1;

    private int id;
    private String author;
    private String title;
    private BookType type;

    public Book(String author, String title, BookType type) {
        this.id = COUNT++;
        this.author = author;
        this.title = title;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public BookType getType() {
        return type;
    }

    @Override
    public String toString() {
        return String.format("%2d [%s] %s, %s", id, type, title, author);
    }
}
