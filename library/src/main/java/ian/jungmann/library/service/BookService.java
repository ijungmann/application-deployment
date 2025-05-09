package ian.jungmann.library.service;

import ian.jungmann.library.dto.BookDto;
import ian.jungmann.library.entity.BookEntity;
import ian.jungmann.library.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {

    private BookRepository bookRepository;

    public BookDto getBookById(Long id) {
        return bookRepository.findById(id)
                .map(BookDto::mapToDto)
                .orElseThrow(() -> new RuntimeException("Book not found"));
    }

    public BookDto createBook(BookDto bookDto) {
        return BookDto.mapToDto(bookRepository.save(BookEntity.fromDto(bookDto)));
    }

    public List<BookDto> searchBooksByTitle(String title) {
        return bookRepository.findByTitleContainingIgnoreCase(title)
                .stream()
                .map(BookDto::mapToDto)
                .collect(Collectors.toList());
    }
}