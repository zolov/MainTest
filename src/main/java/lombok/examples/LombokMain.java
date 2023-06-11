package lombok.examples;

import static java.util.Objects.nonNull;
import static org.apache.commons.lang3.ObjectUtils.allNotNull;

/**
 * LombokMain.
 *
 * @author Igor_Zolov
 */
public class LombokMain {
    public static void main(String[] args) {

        var client = new Client();
        client.setFirstName("");

        Phone phone = Phone.builder()
                .phoneCode("7")
                .codeIso("603")
                .phoneNumber("999661221")
                .build();

        if (nonNull(phone)
                && allNotNull(phone.getPhoneCode(), phone.getCodeIso(), phone.getPhoneNumber())) {
            System.out.println("All not null!");
        } else {
            System.out.println(" Something is null");
        }
    }
}
