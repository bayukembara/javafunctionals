package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static imperative.Main.Gender.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(new Person("Bayu", MALE),
                new Person("Maria", FEMALE),
                new Person("Lisa", FEMALE),
                new Person("Jiso", FEMALE),
                new Person("Jenni", FEMALE),
                new Person("Kembara", MALE));
//*        Imperative Approach
        List<Person> females = new ArrayList<>();
//*        Loop
        for (Person person : people) {
            if (FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }
        System.out.println("/Imperative Approach");
        for (Person female : females) {
            System.out.println(female);
        }

//*        Declarative Approach
        System.out.println("\n");
        System.out.println("/Declarative Approach");
//!        people.stream()
//!                .filter(person -> FEMALE.equals(person.gender))
//!                .forEach(System.out::println);

//*        or if u want to put that think to variable list

//!      this is like a short variable  Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);

        List<Person> females2 = people.stream()
                .filter(personPredicate)
                .toList();
        females2.forEach(System.out::println);

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
