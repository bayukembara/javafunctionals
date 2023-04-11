package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static combinatorpattern.CustomerRegistrationValidator.ValidResult;
import static combinatorpattern.CustomerRegistrationValidator.ValidResult.*;


public interface CustomerRegistrationValidator extends Function<Customer, ValidResult> {


	static CustomerRegistrationValidator isEmailValid() {
		return customer -> {
			System.out.println("Running Email Validation");
			return customer.getEmail().contains("@") ? BERHASIL : EMAIL_TIDAK_SAH;
		};
	}

	static CustomerRegistrationValidator isPhoneNumberValid() {
		return customer -> customer.getPhoneNumber().startsWith("+62") ? BERHASIL : PHONE_NUMBER_TIDAK_SAH;
	}

	static CustomerRegistrationValidator isAdultsValid() {
		return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 16 ? BERHASIL : BELUM_DEWASA;
	}

	//    Make a default so the static can be using by function
	default CustomerRegistrationValidator and(CustomerRegistrationValidator other) {
		return customer -> {
			ValidResult result = this.apply(customer);
			return result.equals(BERHASIL) ? other.apply(customer) : result;
		};
	}

	//    Make a status array for result validation
	enum ValidResult {
		BERHASIL,
		PHONE_NUMBER_TIDAK_SAH,
		EMAIL_TIDAK_SAH,
		BELUM_DEWASA

	}

}
