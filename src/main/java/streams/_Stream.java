package streams;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import static streams._Stream.Gender.*;

public class _Stream {

    public static void main(String[] args) {
            List<Person> people = List.of(new Person("Bayu", MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Lisa", FEMALE),
                new Person("Jiso", FEMALE),
                new Person("Jenni", FEMALE),
                new Person("Kembara", MALE),
                new Person("Talita", PREFER_NOT_TO_SAY));

//*          you could use this one or  people.stream().map(person -> person.gender).forEach(System.out::println);

        Function<Person, String> sPerson = person -> person.name;
        ToIntFunction<String> sLength = String::length;
        IntConsumer sPrint = System.out::println;
        people.stream().map(sPerson).mapToInt(sLength).forEach(sPrint);
    }

    enum Gender {
        MALE, FEMALE,PREFER_NOT_TO_SAY
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
