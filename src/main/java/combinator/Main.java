package combinator;

import java.time.LocalDate;

import static java.time.LocalDate.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "John",
                "Doe@gmail.com",
                "+6282244252699",
                LocalDate.of(1990, 1, 1)
        );

        System.out.println(new CustomerValidator().isValid(customer));
    }
}
