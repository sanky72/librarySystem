package Library.BookManager.books;

//import com.sun.source.tree.LambdaExpressionTree;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BooksService {
    public List<Book> books = new ArrayList<>(
            Arrays.asList(
                    new Book("s01", "science", "jp king", 1),
                    new Book("s02", "geo", "papa", 2),
                    new Book("s03", "maths", "rs agarwal", 3)

            )
    );

    public List<Book> getAllBooks(){
        return books;
    }

    public Book specificBook(String id) {
        return books.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addBook(Book book){
        books.add(book);
    }
}
