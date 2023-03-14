package streams;

import java.util.List;
import java.util.stream.Collectors;

import static streams._Stream.Gender.MALE;
import static streams._Stream.Gender.FEMALE;

public class _Stream {

    public static void main(String[] args) {
            List<Person> people = List.of(new Person("Bayu", MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Lisa", FEMALE),
                new Person("Jiso", FEMALE),
                new Person("Jenni", FEMALE),
                new Person("Kembara", MALE));

            people.stream().map(person -> person.name).forEach(System.out::println);
    }

    enum Gender {
        MALE, FEMALE
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
