package seminar_4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class BookServiceTest {

    iBookRepository mockRepository;
    BookService bookService;

    @BeforeEach
    void setUp() {
        mockRepository = Mockito.mock(iBookRepository.class);  // создаем заглушку
        bookService = new BookService(mockRepository);
    }

    @Test
    public void testGetBooksByAuthor() {
        bookService.findBookById("1");
        // проверяем что метод нашей заглушки был вызван
        Mockito.verify(mockRepository, Mockito.times(1)).findById("1");
    }
}
