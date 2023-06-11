package userproj.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * User.
 *
 * @author Igor_Zolov
 */
@Data(staticConstructor = "of")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Accessors(chain = true)
public class User {
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private Integer age;
    private City city;

    public static User of(String name, String email, Integer age) {
        return User.builder()
                .name(name)
                .email(email)
                .age(age)
                .build();
    }

    public static User of(String name, String email, Integer age, String phoneNumber, City city) {
        return User.builder()
                .name(name)
                .email(email)
                .age(age)
                .phoneNumber(phoneNumber)
                .city(city)
                .build();
    }

    public User(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
        this.age = user.getAge();
    }
}
