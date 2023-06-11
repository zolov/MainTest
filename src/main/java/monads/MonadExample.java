package monads;

import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

/**
 * MonadExample.
 *
 * @author Igor_Zolov
 */
public class MonadExample {
    private static final Random random = new Random();

    public static void main(String[] args) {

        var user = getUser();

        String cityName = Optional.ofNullable(user)
                .map(UserDto::getCity)
                .map(CityDto::getName)
                .orElse("Moscow");

        System.out.printf("City name is %s", cityName);

        Stream.of(1, 2)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }

    private static UserDto getUser() {
        var rnd = random.nextLong();
        if (rnd % 2 == 0) {
            return UserDto.builder()
                    .city(new CityDto("Yerevan"))
                    .build();
        }
        return null;
    }

}
