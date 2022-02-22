package lombok.examples;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

/**
 * Product.
 *
 * @author Igor_Zolov
 */
@Data
@AllArgsConstructor(staticName = "of")
@FieldDefaults(makeFinal = true)
public class Product {
    Long price;
    String currency;
    String name;
}
