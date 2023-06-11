package stream;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * User.
 *
 * @author Igor_Zolov
 */
@Data
@AllArgsConstructor(staticName = "of")
public class User {

    private String firstName;
    private String secondName;
    private String city;
    private String phoneNumber;

}
