package seminar_4;

import java.util.List;

public interface iBookRepository {
    Book findById(String id);
    List<Book> findAll();
}
