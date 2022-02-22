package lombok.examples;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

/**
 * Client.
 *
 * @author Igor_Zolov
 */
@Data
@AllArgsConstructor(staticName = "of")
@FieldDefaults(makeFinal = true)
public class Client {
    String firstName;
    String patranomyc;
    String secondName;
    Integer age;
    Phone phone;
    List<Product> products;
}
