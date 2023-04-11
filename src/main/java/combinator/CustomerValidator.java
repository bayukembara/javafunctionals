package combinator;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidator {

	private boolean isEmailValid(String email) {
		return email.contains("@");
	}

	private boolean isPhoneValid(String phoneNumber) {
		return phoneNumber.startsWith("+62");
	}

	private boolean isAdult(LocalDate dob) {
		return Period.between(dob, LocalDate.now()).getYears() > 16;
	}

	public boolean isValid(Customer customer) {
		return isEmailValid(customer.getEmail())
				&& isPhoneValid(customer.getPhoneNumber()) && isAdult(customer.getDob());
	}
}
