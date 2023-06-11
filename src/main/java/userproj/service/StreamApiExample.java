package userproj.service;

import static java.util.Objects.nonNull;

import userproj.model.City;
import userproj.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * StreamApiExample.
 *
 * @author Igor_Zolov
 */
public class StreamApiExample {

    private static final List<User> USERS = new ArrayList<>(List.of(
            User.of("Egor", "dope_genius@gmail.com", 29, "79293106666", City.MSC),
            User.of("Igor", "skvrno@gmail.com", 33, "79258867474", City.MSC),
            User.of("Anna", "lilgoodanny@gmail.com", 29, "79200000001", City.MSC),
            User.of("Oleg", "oleg@gmail.com", 31),
            User.of("Dima", "dima@gmail.com", 30, "79200000003", City.SPB),
            User.of("Tanya", "tanya@gmail.com", 24),
            User.of("Arman", "armani@gmail.com", 41, "79200000005", City.ERN),
            User.of("Ariana", "ariana@gmail.com", 27, "79200000006", City.TBL),
            User.of("Sasha", "sasha@gmail.com", 35),
            User.of("Serg", "serg@gmail.com", 31),
            User.of("Alina", "alina@gmail.com", 30, "79164513551", City.MSC),
            User.builder()
                    .name("Petr")
                    .age(31)
                    .build()
    ));

    static {
        USERS.add(null);
    }

    public static void main(String[] args) {
//        var phones = new ArrayList<String>();
//
//        for (var user : USERS) {
//            if (nonNull(user) && nonNull(user.getPhoneNumber())) {
//                if (nonNull(user.getCity()) && user.getCity() == City.MSC) {
//                    phones.add(user.getPhoneNumber());
//                }
//            }
//        }
//        for (var phone : phones) {
//            System.out.println(phone);
//        }

        List<String> phones = USERS.stream()
                .filter(Objects::nonNull)
                .filter(user -> nonNull(user.getPhoneNumber()))
                .filter(user -> nonNull(user.getCity()) && user.getCity() == City.MSC)
                .map(User::getPhoneNumber)
                .toList();

    }
}
