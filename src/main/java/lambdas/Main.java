package lambdas;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
	public static void main(String[] args) {

		Function<String, String> upperCaseName = name -> name.toUpperCase();
//        if we using intellij they usually give the recommend like below
		Function<String, String> upperCaseNames = String::toUpperCase;
//        if u want to give a login in the function and lambda is
		Function<String, String> upperFunctionName = name -> {
			if (name.isBlank()) throw new IllegalArgumentException("");
			return name.toUpperCase();
		};

//        Lambdas BiFunction need to use "()" for multi arguments/parameters

		BiFunction<String, Integer, String> upperCaseBilingual = (name, age) -> {
			if (name.isBlank()) throw new IllegalArgumentException("");
			System.out.println(age);
			return name.toUpperCase();
		};

		System.out.println(upperCaseBilingual.apply("Bayu", 20));

		Runnable r = () -> {
			System.out.println("Hello World");
		};

	}

}
