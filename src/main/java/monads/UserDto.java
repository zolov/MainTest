package monads;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * UserDto.
 *
 * @author Igor_Zolov
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private String name;

    private Integer age;

    private String email;

    private CityDto city;

}
