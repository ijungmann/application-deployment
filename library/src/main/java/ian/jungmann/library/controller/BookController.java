package ian.jungmann.library.controller;

import ian.jungmann.library.dto.BookDto;
import ian.jungmann.library.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@RestController
@RequestMapping("/books")
@AllArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping("/{id}")
    public BookDto getBook(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    @PostMapping
    public BookDto addBook(@RequestBody BookDto bookDto) {
        return bookService.createBook(bookDto);
    }

    @GetMapping("/search")
    public List<BookDto> searchBooks(@RequestParam String title) {
        return bookService.searchBooksByTitle(title);
    }

}
