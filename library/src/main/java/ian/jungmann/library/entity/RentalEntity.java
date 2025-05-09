package ian.jungmann.library.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "rental")
public class RentalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private BookEntity book;

    @ManyToOne
    @JoinColumn(name = "reader_id", nullable = false)
    private ReaderEntity reader;

    @Column(name = "rental_date", nullable = false)
    private LocalDate rentalDate;

    @Column(name = "return_date")
    private LocalDate returnDate;

    // Getters and setters
}