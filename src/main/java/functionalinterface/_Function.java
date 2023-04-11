package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
	static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
	static Function<Integer, Integer> multipleBy10 = number -> number * 10;
	static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction = (increment, numToMultiplyBy)
			-> (increment + 1) * numToMultiplyBy;

	public static void main(String[] args) {

//        Function takes 1 argument and produces 1 result
		int increment = increment(1);
		System.out.println(increment);

		int incre = incrementByOneFunction.apply(5);
		System.out.println(incre);

		int inc = multipleBy10.apply(5);
		System.out.println(inc);

		Function<Integer, Integer> addBy1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multipleBy10);
		System.out.println(addBy1AndThenMultiplyBy10.apply(4));

//        BiFunction takes 2 argument and produces 1 result

		System.out.println(incrementByOneAndMultiplyBiFunction.apply(4, 100));
		System.out.println(incrementByOneAndMultiply(4, 100));

	}

	static int increment(int number) {
		return number + 1;
	}

	static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
		return (number + 1) * numToMultiplyBy;
	}
}
