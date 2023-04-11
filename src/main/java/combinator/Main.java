package combinator;

import java.time.LocalDate;

import static combinator.CustomerRegistrationValidator.*;

public class Main {
	public static void main(String[] args) {
		Customer customer = new Customer(
				"John",
				"Doe@gmail.com",
				"+6282244252699",
				LocalDate.of(1995, 1, 1)
		);

//        System.out.println(new CustomerValidator().isValid(customer));

//        Combinator Pattern in Customer Registration Validator
		ValidationResult result = isEmailValid()
				.and(isPhoneNumberValid())
				.and(isAdult())
				.apply(customer);

		System.out.println(result);

		if (result != ValidationResult.SUCCESS) {
			throw new IllegalStateException(result.name());
		}
	}
}