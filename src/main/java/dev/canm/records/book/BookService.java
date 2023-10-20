package dev.canm.records.book;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
record BookService(BookRepository bookRepository, BookMapper bookMapper) {

    List<Book> getBooks() {
        return bookRepository.getBooks();
    }

    Book createBook(Book book) {
        BookEntity bookEntity = bookMapper.toBook(book);
        BookEntity saved = bookRepository.save(bookEntity);
        return bookMapper.toBookRecord(saved);
    }

}
