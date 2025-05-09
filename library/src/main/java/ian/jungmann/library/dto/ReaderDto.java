package ian.jungmann.library.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ReaderDto {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String address;

    // Getters and setters
}