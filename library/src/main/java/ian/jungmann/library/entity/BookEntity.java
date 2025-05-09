package ian.jungmann.library.entity;

import ian.jungmann.library.dto.BookDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "book")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String author;

    @Column(name = "published_date", nullable = false)
    private LocalDate publishedDate;

    @Column(nullable = false)
    private String genre;

    @Column(name = "rental_length", nullable = false)
    private Integer rentalLength;

    public static BookEntity fromDto(BookDto bookDto) {
        return BookEntity.builder()
                .id(bookDto.getId())
                .title(bookDto.getTitle())
                .author(bookDto.getAuthor())
                .publishedDate(bookDto.getPublishedDate())
                .genre(bookDto.getGenre())
                .rentalLength(bookDto.getRentalLength())
                .build();
    }
}