package stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Main.
 *
 * @author Igor_Zolov
 */
public class Main {

    public static void main(String[] args) {
        String moscow = "Moscow";
        List<User> userList = List.of(
                User.of("Alex", "Smith", moscow, "+7925882211"),
                User.of("Pettr", "Perviq", "SPB", ""),
                User.of("Max", "Fedorov", "Omsk", "+79258114322"),
                User.of("Fio", "Nmae", "Kiev", "+792581122445"),
                User.of("Nikolay", "Kiselev", moscow, "+79251123211")
        );

//        List<User> fromMsc = userList.stream()
//                .filter(user -> user.getCity().equals(moscow))
//                .toList();


        userList.stream()
                .collect(groupingBy(User::getCity))
                .forEach((String key, List<User> value) -> {
                    System.out.println(key);
                    for (var user : value) {
                        System.out.println(user);
                    }
                });


    }

}
