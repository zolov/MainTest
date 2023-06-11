package lombok.examples;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

/**
 * Client.
 *
 * @author Igor_Zolov
 */
@Getter
@Setter
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
public class Client {
    private String firstName;
    private String patranomyc;
    private String secondName;
    private Integer age;
    private Phone phone;
    private List<Product> products;
}
