package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
	//    Predicate
	static Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> phoneNumber.startsWith("07") &&
			phoneNumber.length() == 11;
	//    Predicate
	static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");

	public static void main(String[] args) {
		System.out.println("Without Predicate");
		System.out.println(isPhoneNumberValid("07000000000"));
		System.out.println(isPhoneNumberValid("0700000000"));
		System.out.println(isPhoneNumberValid("00709877300"));
		System.out.println("\n");
		System.out.println("With Predicate");
		System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
		System.out.println(isPhoneNumberValidPredicate.test("0700000000"));
		System.out.println(isPhoneNumberValidPredicate.test("00709877300"));

		System.out.println("\n2 Functions");
		System.out.println("Is phone number valid and contains number 3 = " +
				isPhoneNumberValidPredicate.and(containsNumber3).test("00709877300"));
		System.out.println("Is phone number valid and contains number 3 = " +
				isPhoneNumberValidPredicate.and(containsNumber3).test("0700000000"));
		System.out.println("Is phone number valid and contains number 3 = " +
				isPhoneNumberValidPredicate.and(containsNumber3).test("07000000003"));

	}

	static boolean isPhoneNumberValid(String phoneNumber) {
		return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
	}

}
