package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {


	//! Functional Interface
	static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println(
			"Hello " + customer.customerName + " thanks for registering phone number " + customer.customerPhoneNumber);
	//!    Bifunctional
	static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) -> System.out.println(
			"Hello " + customer.customerName + " thanks for registering phone number " +
					(showPhoneNumber ? customer.customerPhoneNumber : "**********"));

	public static void main(String[] args) {
//! Normal Java Function
		Customer maria = new Customer("Maria", "983928");
		greetCustomer(maria);
//! Functional Java Function
		greetCustomerConsumer.accept(maria);
		greetCustomerConsumerV2.accept(maria, false);
		greetCustomerV2(maria, true);

	}

	//! Normal Java Function
	static void greetCustomer(Customer customer) {
		System.out.println("Hello " + customer.customerName + " thanks for registering phone number " +
				customer.customerPhoneNumber);
	}

	static void greetCustomerV2(Customer customer, boolean showPhoneNumber) {
		System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " +
				(showPhoneNumber ? customer.customerPhoneNumber : "**********"));
	}

	//! Class Customer
	static class Customer {
		private final String customerName;
		private final String customerPhoneNumber;

		Customer(String customerName, String customerPhoneNumber) {
			this.customerName = customerName;
			this.customerPhoneNumber = customerPhoneNumber;
		}
	}
}
