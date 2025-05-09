package ian.jungmann.library.dto;

import ian.jungmann.library.entity.BookEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class BookDto {

    private Long id;
    private String title;
    private String author;
    private LocalDate publishedDate;
    private String genre;
    private Integer rentalLength;

    public static BookDto mapToDto(BookEntity book) {
        return BookDto.builder()
                .id(book.getId())
                .title(book.getTitle())
                .author(book.getAuthor())
                .publishedDate(book.getPublishedDate())
                .genre(book.getGenre())
                .rentalLength(book.getRentalLength())
                .build();
    }
}