package dev.canm.records.book;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/books")
public record BooksController(BookService bookService) {

    @GetMapping
    List<Book> getBooks() {
        return bookService.getBooks();
    }


    @GetMapping("/all")
    List<Book> getAll() {
        return bookService.findAll();
    }

    @PostMapping
    ResponseEntity<Void> createBook(@RequestBody Book book) {
        Book createdBook = bookService.createBook(book);
        return ResponseEntity.created(URI.create("/books/" + createdBook.id())).build();
    }

}
