package streams;

import java.util.List;
import java.util.stream.Collectors;

import static streams._Stream.Gender.*;


public class _Stream {

    public static void main(String[] args) {
        List<Person> people = List.of(new Person("Bayu", MALE),
                new Person("Maria", FEMALE),
                new Person("Lisa", FEMALE),
                new Person("Jiso", FEMALE),
                new Person("Jenni", FEMALE),
                new Person("Kembara", PREFER_NOT_TO_SAY));

        people.stream().map(person->person.gender).collect(Collectors.toSet()).forEach(System.out::println);
//        ! or
        people.stream().map(person->person.name).mapToInt(String::length).forEach(System.out::println);
    }





    static class Person {
        private final String name;
        private final String gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = String.valueOf(gender);
        }
        @Override
        public String toString() {
            return "Person{" + "name='" + name + '\'' + ", gender=" + gender + '}';
        }
    }

    enum Gender {
        MALE, FEMALE,PREFER_NOT_TO_SAY
    }
}
