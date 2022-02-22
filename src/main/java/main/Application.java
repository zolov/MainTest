package main;

import static java.util.stream.Collectors.reducing;

import lombok.examples.Client;
import lombok.examples.Phone;
import lombok.examples.Product;

import javax.jms.JMSException;
import java.util.List;

/**
 * main.Application.
 *
 * @author Igor_Zolov
 */
public class Application {
    public static void main(String[] args) throws JMSException {


        Client client = Client.of(
                "Igor",
                "V",
                "Zolov",
                32,
                Phone.of("9258867474", "7", "192"),
                List.of(Product.of(100L, "USD", "earBuds"),
                        Product.of(20L, "USD", "band"))
        );


        Phone.builder()
                .codeIso("192")
                .phoneCode("7")
                .phoneNumber("9258867575")
                .build();

        var strBlock = """
                Hello, %s!
                Your age %d
                Your phone is %s!
                """;

        System.out.printf(strBlock, client.getFirstName(), client.getAge(), client.getPhone().getPhoneNumber());

//        client.getProducts().stream()
//                .collect(teeing(
//                        reducing(BigDecimal.ZERO,
//                                Product::getPrice,
//                                BigDecimal::add),
//                        toList(),
//                        String::new));
    }
}
