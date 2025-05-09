package ian.jungmann.library.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "reader")
public class ReaderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String address;

    // Getters and setters
}