package dev.canm.records.book;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
interface BookRepository extends CrudRepository<BookEntity, Long> {

    @Query("SELECT new dev.canm.records.book.Book(b.id, b.title) FROM BookEntity b")
    List<Book> getBooks();

}
