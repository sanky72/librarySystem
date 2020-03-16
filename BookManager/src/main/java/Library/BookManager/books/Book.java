package Library.BookManager.books;

public class Book {
    private String id;
    private String name;
    private String author;
    private int edition;

    public Book(){

    }
    public Book(String id, String name, String author, int edition) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
        this.edition = edition;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }
}
