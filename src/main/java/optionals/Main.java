package optionals;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {
	public static void main(String[] args) {
		Object value = Optional.empty().orElseGet(() -> "default value");
		System.out.println(value);

		Object value2 = Optional.of("Hello").orElseThrow(getExceptionSupplier());
		System.out.println(value2);

		Optional.ofNullable(null).ifPresentOrElse(email -> System.out.println("Sending email to " + email), () -> {
			System.out.println("Cannot send email");
		});

		Optional.ofNullable("john@gmail.com").ifPresent(email -> System.out.println("Sending email to " + email));
	}

	private static Supplier<IllegalStateException> getExceptionSupplier() {
		return () -> new IllegalStateException("Exception");
	}
}
