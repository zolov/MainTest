package lombok.examples;

/**
 * LombokMain.
 *
 * @author Igor_Zolov
 */
public class LombokMain {
    public static void main(String[] args) {
         Phone phone = Phone.builder()
                .phoneCode("7")
                .codeIso("603")
                .phoneNumber("999661221")
                .build();
    }
}
