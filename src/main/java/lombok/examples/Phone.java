package lombok.examples;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

/**
 * Phone.
 *
 * @author Igor_Zolov
 */
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor(staticName = "of")
public class Phone {
    String phoneNumber;
    String phoneCode;
    String codeIso;
}
