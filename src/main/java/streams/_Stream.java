package streams;

import java.util.List;
import java.util.function.Predicate;

import static streams._Stream.Gender.*;

public class _Stream {

	public static void main(String[] args) {
		List<Person> people = List.of(new Person("Bayu", MALE),
				new Person("Maria", FEMALE),
				new Person("Lisa", FEMALE),
				new Person("Jiso", FEMALE),
				new Person("Jenni", FEMALE),
				new Person("Kembara", MALE));

//*          you could use this one or  people.stream().map(person -> person.gender).forEach(System.out::println);

//        Function<Person, String> sPerson = person -> person.name;
//        ToIntFunction<String> sLength = String::length;
//        IntConsumer sPrint = System.out::println;
//        people.stream().map(sPerson).mapToInt(sLength).forEach(sPrint);

//*         i want to know in my list is the woman exist

		boolean matchFemale = people.stream().allMatch(getPersonPredicate());
		System.out.println("Kalau semua sama :");
		System.out.println(matchFemale);

//*        i want to know at least we have 1 woman exist

		boolean matchFemales = people.stream().anyMatch(getPersonPredicate());
		System.out.println("Kalau Ada yang sama :");
		System.out.println(matchFemales);
//*       i want to know none of the list is match

		boolean notMatchAtAll = people.stream().noneMatch(getPersonPredicate());
		System.out.println("Kalau Tidak ada yang cocok sama sekali :");
		System.out.println(notMatchAtAll);

//*       Useful Method
//!        people.stream()
//!                .min
//!                .peek
//!                .reduce
//!                .sorted
//!                .takeWhile
//!                .dropWhile
//!                .findFirst
//!                .map
//!                .maptoInt

	}

	private static Predicate<Person> getPersonPredicate() {
		return person -> PREFER_NOT_TO_SAY.equals(person.gender);
	}

	enum Gender {
		MALE, FEMALE, PREFER_NOT_TO_SAY
	}

	static class Person {
		private final String name;
		private final Gender gender;

		Person(String name, Gender gender) {
			this.name = name;
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Person{" + "name='" + name + '\'' + ", gender=" + gender + '}';
		}
	}
}
