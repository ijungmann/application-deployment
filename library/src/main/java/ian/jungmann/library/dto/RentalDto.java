package ian.jungmann.library.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class RentalDto {

    private Long id;
    private BookDto book;
    private ReaderDto reader;
    private LocalDate rentalDate;
    private LocalDate returnDate;

    // Getters and setters
}